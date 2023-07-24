package cloudshift.gradle.release

import java.io.File

internal interface GitService {
    fun localUnstagedFiles(): GitOutput
    fun localStagedFiles(): GitOutput
    fun localOutstandingCommits(): GitOutput
    fun remoteOutstandingCommits(): GitOutput
    fun addUnstagedFiles()
    fun commit(commitMessage: String)
    fun push()
    fun tag(tagName: String, tagMessage: String)
    fun restore(file: File)

    data class GitOutput(val output: String) {
        val outputLines = output.split("\r\n")
            .dropWhile { it.isBlank() }
    }
}