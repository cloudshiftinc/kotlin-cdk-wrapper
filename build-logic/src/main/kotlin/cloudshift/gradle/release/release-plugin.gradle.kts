package cloudshift.gradle.release

import cloudshift.gradle.release.git.GitService
import cloudshift.gradle.release.tasks.AbstractReleaseTask
import cloudshift.gradle.release.tasks.CheckLocalOutstandingCommits
import cloudshift.gradle.release.tasks.CheckLocalStagedFiles
import cloudshift.gradle.release.tasks.CheckLocalUnstagedFiles
import cloudshift.gradle.release.tasks.CheckRemoteOutstandingCommits
import cloudshift.gradle.release.tasks.ExecuteRelease

// import org.ajoberstar.grgit.gradle.GrgitServiceExtension

plugins {
    //  id("org.ajoberstar.grgit.service")
}

val gitServiceProvider = gradle.sharedServices.registerIfAbsent("gitService", GitService::class) {}

val ext = extensions.create<ReleaseExtension>("release")

ext.apply {
    failOnUnstagedFiles.convention(true)
    failOnStagedFiles.convention(true)
    failOnPushNeeded.convention(true)
    failOnPullNeeded.convention(true)

    versionPropertiesFile.convention(layout.projectDirectory.file("gradle.properties"))
    versionPropertyName.convention("version")

    releaseCommitMessage.convention("[Release] - release commit: ")

    versionTagTemplate.convention("v\$version")
    versionTagCommitMessage.convention("[Release] - creating tag: ")

    incrementAfterRelease.convention(true)
    newVersionCommitMessage.convention("[Release] - new version commit: ")
}


val checkRelease by tasks.registering {
}

val preRelease by tasks.registering {
    dependsOn(checkRelease)
}

val executeRelease by tasks.registering(ExecuteRelease::class) {
    mustRunAfter(preRelease)

    gitService = gitServiceProvider

    versionPropertiesFile = ext.versionPropertiesFile
    versionPropertyName = ext.versionPropertyName

    releaseCommitMessage = ext.releaseCommitMessage

    versionTagTemplate = ext.versionTagTemplate
    versionTagCommitMessage = ext.versionTagCommitMessage

    incrementAfterRelease = ext.incrementAfterRelease
    newVersionCommitMessage = ext.newVersionCommitMessage
}

val release by tasks.registering {
    dependsOn(preRelease)
    dependsOn(executeRelease)
//    dependsOn(postRelease)
}

//val postRelease by tasks.registering {
//    group = "release"
//    mustRunAfter(executeRelease)
//}

val checkLocalUnstagedFiles by tasks.registering(CheckLocalUnstagedFiles::class) {
    configureReleaseTask()
    fail = ext.failOnUnstagedFiles
}

val checkLocalStagedFiles by tasks.registering(CheckLocalStagedFiles::class) {
    configureReleaseTask()
    fail = ext.failOnStagedFiles
}

val checkLocalOutstandingCommits by tasks.registering(CheckLocalOutstandingCommits::class) {
    configureReleaseTask()
    fail = ext.failOnPushNeeded
}

val checkRemoteOutstandingCommits by tasks.registering(CheckRemoteOutstandingCommits::class) {
    configureReleaseTask()
    fail = ext.failOnPullNeeded
}

checkRelease {
    dependsOn(checkLocalUnstagedFiles)
    dependsOn(checkLocalOutstandingCommits)
    dependsOn(checkRemoteOutstandingCommits)
    dependsOn(checkLocalStagedFiles)
}

fun AbstractReleaseTask.configureReleaseTask() {
    gitService = gitServiceProvider
}
// val grGit = extensions.findByType<GrgitServiceExtension>()

/*
Every Gradle execution:
    * determine current version (from gradle.properties or Git)

On release:
    * checkRelease
        * check for unstaged, staged files
        * check for incoming or outgoing changes
    * pre-release tasks (update readme etc)
        * update readme
    * bump version and commit/tag/push
    * post-release tasks (later; these are problematic and possibly best as a separate Gradle run)
    * bump to next snapshot version and commit/push


 */
