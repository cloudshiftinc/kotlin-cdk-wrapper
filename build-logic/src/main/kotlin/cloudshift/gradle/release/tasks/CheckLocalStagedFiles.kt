package cloudshift.gradle.release.tasks

abstract class CheckLocalStagedFiles : AbstractCheckTask() {
    override val message: String = "local staged files"

    override fun executeCheckCommand() = gitService.get().localStagedFiles()
}
