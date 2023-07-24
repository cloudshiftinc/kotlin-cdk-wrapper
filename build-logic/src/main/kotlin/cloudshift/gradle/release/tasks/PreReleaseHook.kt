package cloudshift.gradle.release.tasks

import io.github.z4kn4fein.semver.Version
import java.io.File

interface PreReleaseHook {
    fun execute(context: HookContext)

    data class HookContext(val previousVersion: Version, val incomingVersion: Version, val workingDirectory: File)
}
