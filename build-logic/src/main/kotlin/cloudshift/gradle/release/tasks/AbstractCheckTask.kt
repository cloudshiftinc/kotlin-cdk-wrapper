package cloudshift.gradle.release.tasks

import cloudshift.gradle.release.git.GitService
import org.gradle.api.provider.Property
import org.gradle.api.tasks.Input
import org.gradle.api.tasks.Internal
import org.gradle.api.tasks.TaskAction

abstract class AbstractCheckTask : AbstractReleaseTask() {

    @get:Internal
    protected abstract val message : String

    @get:Input
    abstract val fail : Property<Boolean>

    @TaskAction
    fun action() {
        val result = executeCheckCommand()
        if (result.outputLines.isNotEmpty()) {
            val msg = "${message}: \n${result.output}"
            when(fail.get()) {
                true -> releaseError(msg)
                else -> logger.warn(msg)
            }
        }
    }

    protected abstract fun executeCheckCommand() : GitService.GitOutput
}