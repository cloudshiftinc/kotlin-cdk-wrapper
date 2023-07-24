@file:Suppress("UnstableApiUsage")

package cloudshift.gradle.release

import cloudshift.gradle.release.tasks.AbstractReleaseTask
import cloudshift.gradle.release.tasks.CheckLocalOutstandingCommits
import cloudshift.gradle.release.tasks.CheckLocalStagedFiles
import cloudshift.gradle.release.tasks.CheckLocalUnstagedFiles
import cloudshift.gradle.release.tasks.CheckRemoteOutstandingCommits
import cloudshift.gradle.release.tasks.ExecuteRelease
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.api.Task
import org.gradle.api.tasks.TaskProvider
import org.gradle.kotlin.dsl.create
import org.gradle.kotlin.dsl.getValue
import org.gradle.kotlin.dsl.provideDelegate
import org.gradle.kotlin.dsl.registerIfAbsent
import org.gradle.kotlin.dsl.registering
import org.gradle.kotlin.dsl.withType
import org.gradle.kotlin.dsl.assign

abstract class ReleasePlugin : Plugin<Project> {
    override fun apply(project: Project) : Unit = project.run {

        val gitServiceProvider = gradle.sharedServices.registerIfAbsent("gitService", GitServiceImpl::class) {}

        // configure all release tasks (this catches tasks added later)
        tasks.withType<AbstractReleaseTask>().configureEach {
            gitService = gitServiceProvider
            group = "release"
        }

        val releaseExtension = createReleaseExtension()

        val checkRelease by tasks.registering

        val preRelease by tasks.registering {
            dependsOn(checkRelease)
        }

        val executeRelease by tasks.registering(ExecuteRelease::class) {
            mustRunAfter(preRelease)

            versionPropertiesFile = releaseExtension.versionProperties.propertiesFile
            versionPropertyName = releaseExtension.versionProperties.propertyName

            releaseCommitMessage = releaseExtension.releaseCommitMessage

            versionTagTemplate = releaseExtension.versionTagTemplate
            versionTagCommitMessage = releaseExtension.versionTagCommitMessage

            incrementAfterRelease = releaseExtension.incrementAfterRelease
            newVersionCommitMessage = releaseExtension.newVersionCommitMessage

            preReleaseHooks = releaseExtension.preReleaseHooks
        }

        val release by tasks.registering {
            dependsOn(preRelease)
            dependsOn(executeRelease)
        }

        registerPreReleaseChecks(releaseExtension, checkRelease)
    }

    private fun Project.registerPreReleaseChecks(
        releaseExtension: ReleaseExtension,
        checkRelease: TaskProvider<Task>
    ) {
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

        checkRelease.configure {
            dependsOn(checkLocalUnstagedFiles)
            dependsOn(checkLocalOutstandingCommits)
            dependsOn(checkRemoteOutstandingCommits)
            dependsOn(checkLocalStagedFiles)
        }
    }

    private fun Project.createReleaseExtension(): ReleaseExtension {
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
        return releaseExtension
    }
}