package cloudshift.gradle.release

import cloudshift.gradle.release.hooks.PreProcessFilesHook
import cloudshift.gradle.release.tasks.AbstractReleaseTask
import cloudshift.gradle.release.tasks.CheckLocalOutstandingCommits
import cloudshift.gradle.release.tasks.CheckLocalStagedFiles
import cloudshift.gradle.release.tasks.CheckLocalUnstagedFiles
import cloudshift.gradle.release.tasks.CheckRemoteOutstandingCommits
import cloudshift.gradle.release.tasks.ExecuteRelease

val gitServiceProvider = gradle.sharedServices.registerIfAbsent("gitService", GitServiceImpl::class) {}

val releaseExtension = extensions.create<ReleaseExtension>("release")

releaseExtension.apply {
    checks {
        failOnUnstagedFiles.convention(true)
        failOnStagedFiles.convention(true)
        failOnPushNeeded.convention(true)
        failOnPullNeeded.convention(true)
    }

    versionProperties {
        propertiesFile.convention(layout.projectDirectory.file("gradle.properties"))
        propertyName.convention("version")
    }

    releaseCommitMessage.convention("[Release] - release commit:")

    versionTagTemplate.convention("v\$version")
    versionTagCommitMessage.convention("[Release] - creating tag:")

    incrementAfterRelease.convention(true)
    newVersionCommitMessage.convention("[Release] - new version commit:")
}

val checkRelease by tasks.registering

val preRelease by tasks.registering {
    dependsOn(checkRelease)
}

val executeRelease by tasks.registering(ExecuteRelease::class) {
    mustRunAfter(preRelease)

    gitService = gitServiceProvider

    versionPropertiesFile = releaseExtension.versionProperties.propertiesFile
    versionPropertyName = releaseExtension.versionProperties.propertyName

    releaseCommitMessage = releaseExtension.releaseCommitMessage

    versionTagTemplate = releaseExtension.versionTagTemplate
    versionTagCommitMessage = releaseExtension.versionTagCommitMessage

    incrementAfterRelease = releaseExtension.incrementAfterRelease
    newVersionCommitMessage = releaseExtension.newVersionCommitMessage

    preReleaseHooks = releaseExtension.preReleaseHooks
}

configure<ReleaseExtension> {
    checks {
        failOnPullNeeded = false
    }
    preReleaseHook<PreProcessFilesHook>()
    preProcessFiles {
        templates(sourceDir = "gradle/templates", destinationDir = layout.projectDirectory)
        replacements {
            includes("README.MD")
        }
    }
}

val release by tasks.registering {
    dependsOn(preRelease)
    dependsOn(executeRelease)
}

val checkLocalUnstagedFiles by tasks.registering(CheckLocalUnstagedFiles::class) {
    fail = releaseExtension.checks.failOnUnstagedFiles
}

val checkLocalStagedFiles by tasks.registering(CheckLocalStagedFiles::class) {
    fail = releaseExtension.checks.failOnStagedFiles
}

val checkLocalOutstandingCommits by tasks.registering(CheckLocalOutstandingCommits::class) {
    fail = releaseExtension.checks.failOnPushNeeded
}

val checkRemoteOutstandingCommits by tasks.registering(CheckRemoteOutstandingCommits::class) {
    fail = releaseExtension.checks.failOnPullNeeded
}

checkRelease {
    dependsOn(checkLocalUnstagedFiles)
    dependsOn(checkLocalOutstandingCommits)
    dependsOn(checkRemoteOutstandingCommits)
    dependsOn(checkLocalStagedFiles)
}

tasks.withType<AbstractReleaseTask>().configureEach {
    gitService = gitServiceProvider
    group = "release"
}
