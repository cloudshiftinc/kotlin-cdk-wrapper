package cloudshift.gradle.release

import org.gradle.api.file.RegularFileProperty
import org.gradle.api.provider.Property

abstract class ReleaseExtension {
    abstract val failOnUnstagedFiles: Property<Boolean>
    abstract val failOnStagedFiles: Property<Boolean>
    abstract val failOnPushNeeded: Property<Boolean>
    abstract val failOnPullNeeded: Property<Boolean>

    // the properties file where the version property is stored
    abstract val versionPropertiesFile: RegularFileProperty

    // the version property name
    abstract val versionPropertyName: Property<String>

    // for committing all pre-release work
    abstract val releaseCommitMessage: Property<String>

    // for tagging the release version
    abstract val versionTagTemplate: Property<String>
    abstract val versionTagCommitMessage: Property<String>

    // for the new version post-release
    abstract val incrementAfterRelease: Property<Boolean>
    abstract val newVersionCommitMessage: Property<String>


}
