package cloudshift.gradle.release.tasks

import io.github.z4kn4fein.semver.Version
import io.github.z4kn4fein.semver.nextPatch
import io.github.z4kn4fein.semver.nextPreRelease
import io.github.z4kn4fein.semver.toVersion
import org.gradle.api.file.RegularFileProperty
import org.gradle.api.provider.Property
import org.gradle.api.tasks.Input
import org.gradle.api.tasks.InputFile
import org.gradle.api.tasks.TaskAction

abstract class ExecuteRelease : AbstractReleaseTask() {
    @get:InputFile
    abstract val versionPropertiesFile: RegularFileProperty

    @get:Input
    abstract val versionPropertyName: Property<String>

    @get:Input
    abstract val versionTagTemplate : Property<String>

    @get:Input
    abstract val versionTagCommitMessage : Property<String>

    @get:Input
    abstract val releaseCommitMessage : Property<String>

    @get:Input
    abstract val incrementAfterRelease: Property<Boolean>

    @get:Input
    abstract val newVersionCommitMessage: Property<String>

    @TaskAction
    fun action() {
        val versions = incrementVersion {
            // TODO - configuration for which to increment
            it.nextPatch()
        }

        val git = gitService.get()

        // add any files that may have been created by pre-release tasks
        git.addUnstagedFiles()

        // commit anything from pre-release tasks + version bump
        git.commit("${releaseCommitMessage.get()} ${versions.previousVersion} -> ${versions.version}")

        // tag with incremented version
        val versionTag = versionTagTemplate.get().replace("\$version", versions.version.toString())
        git.tag(versionTag, "${versionTagCommitMessage.get()} ${versions.previousVersion} -> ${versions.version}")

        // push everything; this finalizes the release
        git.push()

        // commit and push properties files update
        if(incrementAfterRelease.get()) {
            // bump to next pre-release version
            val postReleaseVersions = incrementVersion {
                // TODO - configuration for which to increment
                it.nextPreRelease("SNAPSHOT")
            }
            git.addUnstagedFiles()
            git.commit("${newVersionCommitMessage.get()} ${postReleaseVersions.previousVersion} -> ${postReleaseVersions.version}")
            git.push()
        }
    }

    private fun incrementVersion(versionIncrementer : (Version) -> Version) : Versions {
        val propertiesFile = versionPropertiesFile.get().asFile

        val propertyLines = propertiesFile.readLines()
        val currentVersion = propertyLines
            .mapNotNull {
                val pieces = it.split("=", limit = 2)
                if (pieces.size != 2) return@mapNotNull null
                if (pieces[0].trim() != versionPropertyName.get()) return@mapNotNull null
                pieces[1].toVersion()
            }
            .firstOrNull() ?: releaseError("Unable to resolve version property '${versionPropertyName.get()} in ${versionPropertiesFile.get()}")

        val nextVersion = versionIncrementer(currentVersion)

        logger.lifecycle("Incremented version from $currentVersion to $nextVersion")

        val updatedProperties = propertyLines.map {
            val pieces = it.split("=", limit = 2)
            if (pieces.size != 2) return@map it
            if (pieces[0].trim() != versionPropertyName.get()) return@map it
            "${versionPropertyName.get()}=${nextVersion}"
        }

        propertiesFile.writeText(updatedProperties.joinToString("\n"))
        return Versions(previousVersion = currentVersion, version = nextVersion)
    }

    private data class Versions(val previousVersion : Version, val version : Version)
}
