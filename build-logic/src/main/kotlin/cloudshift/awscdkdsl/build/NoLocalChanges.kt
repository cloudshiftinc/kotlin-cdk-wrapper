package cloudshift.awscdkdsl.build

import org.gradle.api.DefaultTask
import org.gradle.api.GradleException
import org.gradle.api.tasks.TaskAction
import org.gradle.process.ExecOperations
import java.io.ByteArrayOutputStream
import javax.inject.Inject

abstract class NoLocalChanges
    @Inject
    constructor(private val execOperations: ExecOperations) : DefaultTask() {
        @TaskAction
        fun action() {
            val output = ByteArrayOutputStream()
            val result = execOperations.exec {
                commandLine("git", "diff", "--name-status", "--exit-code")
                standardOutput = output
                isIgnoreExitValue = true
            }
            when (result.exitValue) {
                0 -> logger.lifecycle("No local files have changed")
                else -> throw GradleException("Local files have changed; Possibly missed formatting before commit. Changed files: \n${String(output.toByteArray())}")
            }
        }
    }
