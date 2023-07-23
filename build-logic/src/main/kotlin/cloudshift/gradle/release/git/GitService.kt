package cloudshift.gradle.release.git

import org.gradle.api.GradleException
import org.gradle.api.logging.Logging
import org.gradle.api.services.BuildService
import org.gradle.api.services.BuildServiceParameters
import org.gradle.process.ExecOperations
import java.io.ByteArrayOutputStream
import javax.inject.Inject

abstract class GitService @Inject constructor(private val execOps: ExecOperations) : BuildService<BuildServiceParameters.None> {

    private object GitCommands {
        // Unstaged files: git diff --name-status
        val LocalUnstagedFiles = listOf("diff", "--name-status")

        // Staged files: git diff --cached --name-status
        val LocalStagedFiles = listOf("diff", "--cached", "--name-status")

        // local commits to be pushed: git log @{u}..
        val LocalOutstandingCommits = listOf("log", "@{u}..")

        // remote commits to be pulled: git log ..@{u}
        val RemoteOutstandingCommits = listOf("log", "..@{u}")
    }

    fun localUnstagedFiles(): GitOutput = git(GitCommands.LocalUnstagedFiles)

    fun localStagedFiles(): GitOutput = git(GitCommands.LocalStagedFiles)

    fun localOutstandingCommits(): GitOutput = git(GitCommands.LocalOutstandingCommits)

    fun remoteOutstandingCommits(): GitOutput = git(GitCommands.RemoteOutstandingCommits)

    fun addUnstagedFiles() {
        git("add", ".")
    }

    fun commit(commitMessage: String) {
        git("commit", "-m", commitMessage)
    }

    fun push() {
        git("push", "--porcelain")
    }

    private val logger = Logging.getLogger(GitService::class.java)

    private fun git(vararg args: String, block: (GitDsl).() -> Unit = {}) = git(args.toList(), block)

    private fun git(args: List<String>, block: (GitDsl).() -> Unit = {}): GitOutput {
        val dsl = GitDsl()
        dsl.args.addAll(args)
        dsl.apply(block)

        val commandLine = mutableListOf("git")
        commandLine.addAll(dsl.args)

        logger.info("Executing $commandLine")
        val stdOutput = ByteArrayOutputStream()
        val stdError = ByteArrayOutputStream()
        val execResult = execOps.exec {
            commandLine(commandLine)
            standardOutput = stdOutput
            errorOutput = stdError
            isIgnoreExitValue = true
        }
        logger.info("Exit code: ${execResult.exitValue}")

        return when (execResult.exitValue) {
            0 -> GitOutput(String(stdOutput.toByteArray()))
            else -> {
                val standardOutput = String(stdOutput.toByteArray())
                val errorOutput = String(stdError.toByteArray())
                var msg = "Error executing $commandLine; exit code ${execResult.exitValue}"
                if(standardOutput.isNotBlank()) msg = "$msg\n$standardOutput"
                if(errorOutput.isNotBlank()) msg = "$msg\n$errorOutput"

                throw GradleException(msg)
            }
        }
    }

    fun tag(tagName: String, tagMessage : String) {
        git("tag", "-a", tagName, "-m", tagMessage)
    }

    private class GitDsl {
        val args = mutableListOf<String>()
        fun args(vararg args: String) {
            this.args.addAll(args.toList())
        }
    }

    data class GitOutput(val output: String) {
        val outputLines = output.split("\r\n")
            .dropWhile { it.isBlank() }
    }
}

