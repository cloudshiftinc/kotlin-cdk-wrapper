@file:Suppress("UnstableApiUsage")

package cloudshift.gradle.release.hooks

import cloudshift.gradle.release.tasks.PreReleaseHook
import com.google.common.hash.Hashing
import io.github.z4kn4fein.semver.Version
import org.gradle.api.file.FileSystemOperations
import org.gradle.api.file.FileTree
import org.gradle.api.file.ProjectLayout
import org.gradle.api.logging.Logging
import org.gradle.api.model.ObjectFactory
import java.io.File
import java.util.*
import javax.inject.Inject

internal abstract class PreProcessFilesHook @Inject constructor(
    private val templateSpecs: List<TemplateSpec>,
    private val replacementSpecs: List<ReplacementSpec>,
    private val fs: FileSystemOperations,
    private val layout: ProjectLayout,
    private val objects: ObjectFactory
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
            val sourceDir = sourceFileTree.dir
            val destDir = objects.fileTree()
                .from(templateSpec.destinationDir).dir

            val sourceFiles = sourceFileTree.matching {
                include(templateSpec.includes)
                exclude(templateSpec.excludes)
                exclude("**/*.sha256")
            }

            checkTampering(templateSpec.preventTampering, sourceFiles, sourceDir, destDir)

            fs.copy {
                from(sourceFiles)
                into(destDir)

                val properties = mapOf("version" to currentVersion.toString()) + templateSpec.properties
                expand(properties)
                eachFile {
                    logger.info("Processing template $path")
                }
            }

            // put sha256 of expanded content in .sha256 file alongside template, for validation on subsequent releases
            writeTamperChecksum(templateSpec.preventTampering, sourceFiles, sourceDir, destDir)
        }
    }

    private fun writeTamperChecksum(
        preventTampering: Boolean,
        sourceFiles: FileTree,
        sourceDir: File,
        destDir: File
    ) {
        if (!preventTampering) return
        sourceFiles.forEach { file ->
            val srcSha256File = file.parentFile.resolve("${file.name}.sha256")

            val relative = file.relativeTo(sourceDir)
            val destFile = destDir.resolve(relative)
            srcSha256File.writeText(destFile.sha256())
        }
    }

    private fun checkTampering(
        preventTampering: Boolean,
        sourceFiles: FileTree,
        sourceDir: File,
        destDir: File
    ) {
        if (!preventTampering) return
        sourceFiles.forEach { file ->
            val srcRelative = file.relativeTo(sourceDir)
            val destFile = destDir.resolve(srcRelative)

            logger.info("Checking tampering on $srcRelative")
            // if .sha256 file exists validate that to see if generated content has been tampered with
            val srcSha256File = file.parentFile.resolve("${file.name}.sha256")

            when {
                !srcSha256File.exists() -> return@forEach
                !destFile.exists() -> return@forEach
                destFile.sha256() != srcSha256File.readText() -> error("$destFile tampered with; please delete and do edits in $file")
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