package cloudshift.awscdkdsl.build.task

import com.google.common.hash.Hashing
import org.gradle.api.file.FileSystemOperations
import org.gradle.api.tasks.Copy
import org.gradle.api.tasks.TaskAction
import java.io.File
import javax.inject.Inject

abstract class CopyTemplates
    @Inject
    constructor(private val fs: FileSystemOperations) : Copy() {
        init {
            exclude("**/*.sha256")
            eachFile {
                val srcSha256File = file.parentFile.resolve("${file.name}.sha256")
                val destFile = destinationDir.resolve(path)
                when {
                    !srcSha256File.exists() -> return@eachFile
                    !destFile.exists() -> return@eachFile
                    destFile.sha256() != srcSha256File.readText() -> error("$path tampered with; please delete and do edits in $file")
                }
            }
        }

        @TaskAction
        fun action() {
            fs.copy {
                with(rootSpec)
                eachFile {
                    // don't actually copy, instead calculate sha256 on the expanded templates that were copied above
                    exclude()
                    val srcSha256File = file.parentFile.resolve("${file.name}.sha256")
                    val destFile = destinationDir.resolve(path)
                    srcSha256File.writeText(destFile.sha256())
                }
            }
        }

        private fun File.sha256() = Hashing.sha256().newHasher().putBytes(readBytes()).hash().toString()
    }
