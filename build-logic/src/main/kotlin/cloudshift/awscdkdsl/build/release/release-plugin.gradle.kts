package cloudshift.awscdkdsl.build.release

// import org.ajoberstar.grgit.gradle.GrgitServiceExtension

plugins {
    //  id("org.ajoberstar.grgit.service")
}

val ext = extensions.create<ReleaseExtension>("release")

ext.apply {
    failOnUntrackedFiles.convention(true)
    failOnUncommittedFiles.convention(true)
    failOnPushNeeded.convention(false)
    failOnPullNeeded.convention(true)
    versionTagTemplate.convention("v\$version")
    versionTagCommitMessage.convention("[Release] - creating tag: ")
    updateVersionCommitMessage.convention("[Release] - updating version: ")
    newVersionCommitMessage.convention("[Release] - new version commit: ")
    versionPropertiesFile.convention("gradle.properties")
    incrementAfterRelease.convention(true)
}

// val grGit = extensions.findByType<GrgitServiceExtension>()

/*
Release:

* check for un-committed files
* Check for incoming or outgoing changes
* bump version & commit
* build ?
* commit
* Create release tag
* bump version & commit
*

 */
