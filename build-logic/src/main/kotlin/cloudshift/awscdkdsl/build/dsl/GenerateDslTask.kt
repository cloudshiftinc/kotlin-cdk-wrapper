package cloudshift.awscdkdsl.build.dsl

import cloudshift.awscdkdsl.build.dsl.asm.AsmClassLoader2
import cloudshift.awscdkdsl.build.dsl.model.source.CdkSourceModel
import cloudshift.awscdkdsl.build.dsl.model.type.WrapperTypeGenerator
import com.squareup.kotlinpoet.AnnotationSpec
import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.FileSpec
import java.io.File
import javax.inject.Inject
import org.gradle.api.DefaultTask
import org.gradle.api.file.ArchiveOperations
import org.gradle.api.file.DirectoryProperty
import org.gradle.api.file.FileSystemOperations
import org.gradle.api.provider.SetProperty
import org.gradle.api.tasks.Input
import org.gradle.api.tasks.OutputDirectory
import org.gradle.api.tasks.TaskAction

abstract class GenerateDslTask
@Inject
constructor(
    private val fs: FileSystemOperations,
    private val archiveOps: ArchiveOperations
) : DefaultTask() {
    init {
        outputs.upToDateWhen { false }
    }

    @get:Input abstract val classpath: SetProperty<File>

    @get:Input abstract val sources: SetProperty<File>

    @get:OutputDirectory abstract val outputDirectory: DirectoryProperty

    @TaskAction
    fun action() {
        val sourcesDir = temporaryDir.resolve("cdk-sources")
        sourcesDir.mkdir()

        fs.sync {
            into(sourcesDir)
            from(
                sources.get().map {
                    archiveOps.zipTree(it).matching {
                        include("**/*.java")
                        exclude("**/package-info.java")
                    }
                },
            )
            includeEmptyDirs = false
        }


        val outDir = outputDirectory.get().asFile.resolve("src/main/kotlin")
        fs.delete { delete(outDir) }
        outDir.mkdirs()

        logger.lifecycle("Parsing sources...")
        val dev = false
        val cdkSourceModel = when {
            dev -> CdkSourceModel(
                classMap = emptyMap(),
                classes = emptyList(),
            )

            else -> SourceParser.parse(sourcesDir)
        }
        logger.lifecycle("Sources: ${sources.get().map { it.name }}")

        logger.lifecycle("Loading AWS CDK classes from ${classpath.get()}")
        val cdkClasses2 = AsmClassLoader2.loadClasses(classpath.get(), cdkSourceModel.classMap)
        val cdkModel2 = CdkModelFactory.createModel(cdkClasses2)
        val specs = WrapperTypeGenerator.generate(cdkModel2)

        specs.forEach {
            it.toBuilder().suppressWarningTypes(SUPPRESSIONS).build().writeTo(outDir)
        }
    }
}

internal val SUPPRESSIONS =
    setOf(
        "RedundantVisibilityModifier",
        "RedundantUnitReturnType",
        "RemoveRedundantQualifierName",
        "unused",
        "UnusedImport",
        "ClassName",
        "REDUNDANT_PROJECTION",
        "DEPRECATION",
    )

internal fun FileSpec.Builder.suppressWarningTypes(types: Collection<String>): FileSpec.Builder {
    if (types.isEmpty()) {
        return this
    }

    val format = "%S,".repeat(types.count()).trimEnd(',')
    addAnnotation(
        AnnotationSpec.builder(ClassName("", "Suppress"))
            .addMember(format, *types.toTypedArray())
            .build(),
    )
    return this
}

internal fun FileSpec.Builder.suppressWarningTypes(vararg types: String): FileSpec.Builder {
    suppressWarningTypes(*types)
    return this
}
