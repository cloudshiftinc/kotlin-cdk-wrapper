package cloudshift.awscdkdsl.build.release

import org.gradle.api.provider.Property

abstract class ReleaseExtension {
    abstract val failOnUntrackedFiles: Property<Boolean>
    abstract val failOnUncommittedFiles: Property<Boolean>
    abstract val failOnPushNeeded: Property<Boolean>
    abstract val failOnPullNeeded: Property<Boolean>
    abstract val incrementAfterRelease: Property<Boolean>
    abstract val versionTagTemplate: Property<String>
    abstract val versionTagCommitMessage: Property<String>
    abstract val updateVersionCommitMessage: Property<String>
    abstract val newVersionCommitMessage: Property<String>
    abstract val versionPropertiesFile: Property<String>
}
