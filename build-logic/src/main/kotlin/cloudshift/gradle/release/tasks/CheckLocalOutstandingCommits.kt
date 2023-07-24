package cloudshift.gradle.release.tasks

abstract class CheckLocalOutstandingCommits : AbstractCheckTask() {
    override val message: String = "local outstanding commits"

    override fun executeCheckCommand() = gitService.get().localOutstandingCommits()
}
