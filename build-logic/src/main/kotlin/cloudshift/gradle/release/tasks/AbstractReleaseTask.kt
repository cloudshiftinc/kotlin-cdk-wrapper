package cloudshift.gradle.release.tasks

import cloudshift.gradle.release.git.GitService
import org.gradle.api.DefaultTask
import org.gradle.api.provider.Property
import org.gradle.api.tasks.Internal
import org.gradle.work.DisableCachingByDefault

@DisableCachingByDefault
abstract class AbstractReleaseTask : DefaultTask() {
    init {
        group = "release"
    }
    @get:Internal
    abstract val gitService: Property<GitService>

    protected fun releaseError(msg : String): Nothing = error("Cannot release; $msg")
}