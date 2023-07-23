package cloudshift.awscdkdsl.build.release

// import org.ajoberstar.grgit.Grgit
// import org.ajoberstar.grgit.Grgit
import org.gradle.api.DefaultTask
import org.gradle.api.file.RegularFileProperty
import org.gradle.api.provider.Property
import org.gradle.api.tasks.Input
import org.gradle.api.tasks.InputFile
import org.gradle.api.tasks.TaskAction

internal abstract class IncrementVersionTask : DefaultTask() {
//    abstract val grGit : Provider<Grgit>

    @get:InputFile
    abstract val versionPropertiesFile: RegularFileProperty

    @get:Input
    abstract val newVersionCommitMessage: Property<String>

    @TaskAction
    fun incrementVersion() {
//        val propertiesFile = versionPropertiesFile.get().asFile
//        val version = Versions.loadCurrentVersion(propertiesFile)
//        val incrementedVersion = Versions.increment(version, propertiesFile)
//
//        logger.lifecycle("Incremented version to $incrementedVersion")
//        scm.get().commitVersionPropertiesFile(propertiesFile, newVersionCommitMessage.get() + incrementedVersion)
    }
}
