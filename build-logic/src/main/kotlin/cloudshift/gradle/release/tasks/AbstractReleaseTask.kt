package cloudshift.gradle.release.tasks

import cloudshift.gradle.release.GitService
import cloudshift.gradle.release.GitServiceImpl
import org.gradle.api.DefaultTask
import org.gradle.api.provider.Property
import org.gradle.api.tasks.Internal
import org.gradle.work.DisableCachingByDefault

@DisableCachingByDefault
abstract class AbstractReleaseTask : DefaultTask() {
    @get:Internal
    internal abstract val gitService: Property<GitService>

    protected fun releaseError(msg: String): Nothing = error("Cannot release; $msg")
}
