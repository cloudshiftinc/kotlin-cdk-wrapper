package cloudshift.gradle.release.tasks

abstract class CheckLocalUnstagedFiles : AbstractCheckTask() {
    override val message: String = "local unstaged files"

    override fun executeCheckCommand()= gitService.get().localUnstagedFiles()
}