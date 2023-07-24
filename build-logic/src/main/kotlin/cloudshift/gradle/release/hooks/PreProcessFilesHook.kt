@file:Suppress("UnstableApiUsage")

package cloudshift.gradle.release.hooks

import cloudshift.gradle.release.tasks.PreReleaseHook
import com.google.common.hash.Hashing
import io.github.z4kn4fein.semver.Version
import org.aspectj.weaver.tools.cache.SimpleCacheFactory.path
import org.gradle.api.file.FileSystemOperations
import org.gradle.api.file.ProjectLayout
import org.gradle.api.internal.file.copy.DefaultCopySpec
import org.gradle.api.logging.Logging
import org.gradle.api.model.ObjectFactory
import org.gradle.kotlin.dsl.newInstance
import java.io.File
import java.util.*
import javax.inject.Inject

internal abstract class PreProcessFilesHook @Inject constructor(
    private val templateSpecs: List<TemplateSpec>,
    private val replacementSpecs: List<ReplacementSpec>,
    private val fs: FileSystemOperations,
    private val layout: ProjectLayout,
    private val objects: ObjectFactory,

    ) : PreReleaseHook {

    private val logger = Logging.getLogger(PreProcessFilesHook::class.java)

    override fun execute(context: PreReleaseHook.HookContext) {
        processTemplateSpecs(context.incomingVersion)
        processReplacementSpecs(context.workingDirectory)
    }

    private fun processReplacementSpecs(workingDir: File) {
        replacementSpecs.forEach { replacementSpec ->
            if (replacementSpec.includes.isEmpty()) return@forEach
            val tempDir = workingDir.resolve(
                UUID.randomUUID()
                    .toString()
            )
            fs.copy {
                from(layout.projectDirectory) {
                    include(replacementSpec.includes)
                    exclude(replacementSpec.excludes)
                }
                into(tempDir)

//                expand(replacementSpec.replacements)
                // TODO - perform replacements during copy
                eachFile {
                    logger.info("Processing replacement in $path")
                }
            }

            // overwrite original files with processed one
            fs.copy {
                from(tempDir)
                into(layout.projectDirectory)
            }
        }
    }

    private fun processTemplateSpecs(currentVersion: Version) {
        templateSpecs.forEach { templateSpec ->

            val sourceFileTree = objects.fileTree()
                .from(templateSpec.templateDir)
            val destDir = objects.fileTree()
                .from(templateSpec.destinationDir).dir

            val sourceFiles = sourceFileTree.matching {
                include(templateSpec.includes)
                exclude(templateSpec.excludes)
                if (templateSpec.preventTampering) {
                    exclude("**/*.sha256")
                }
            }

            if(templateSpec.preventTampering) {
                sourceFiles.forEach { file ->
                    logger.info("Checking tampering $path")
                    // if .sha256 file exists validate that to see if generated content has been tampered with
                    val srcSha256File = file.parentFile.resolve("${file.name}.sha256")
                    val destFile = destDir.resolve(path)
                    when {
                        !srcSha256File.exists() -> return@forEach
                        !destFile.exists() -> return@forEach
                        destFile.sha256() != srcSha256File.readText() -> error("$path tampered with; please delete and do edits in $file")
                    }
                }
            }

            fs.copy {
                from(sourceFiles)
                into(destDir)

                val properties = mapOf("version" to currentVersion.toString()) + templateSpec.properties
                expand(properties)
            }

            // put sha256 of expanded content in .sha256 file alongside template, for validation on subsequent releases
            if (templateSpec.preventTampering) {
                sourceFiles.forEach { file ->
                    val srcSha256File = file.parentFile.resolve("${file.name}.sha256")

                    val relative = file.relativeTo(sourceFileTree.dir)
                    val destFile = destDir.resolve(relative)
                    srcSha256File.writeText(destFile.sha256())
                }
            }
        }
    }

    private fun File.sha256() = Hashing.sha256()
        .newHasher()
        .putBytes(readBytes())
        .hash()
        .toString()

    data class TemplateSpec(val templateDir: Any, val destinationDir: Any, val preventTampering: Boolean, val includes: List<String>, val excludes: List<String>, val properties: Map<String, String>)
    data class ReplacementSpec(val includes: List<String>, val excludes: List<String>, val replacements: Map<String, String>)
}