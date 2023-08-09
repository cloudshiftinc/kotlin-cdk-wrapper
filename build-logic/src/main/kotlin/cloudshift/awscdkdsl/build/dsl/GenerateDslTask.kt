package cloudshift.awscdkdsl.build.dsl

import cloudshift.awscdkdsl.build.dsl.asm.AsmClassLoader
import com.squareup.kotlinpoet.AnnotationSpec
import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.FileSpec
import com.squareup.kotlinpoet.TypeSpec
import java.io.File
import javax.inject.Inject
import org.gradle.api.DefaultTask
import org.gradle.api.file.ArchiveOperations
import org.gradle.api.file.DirectoryProperty
import org.gradle.api.file.FileSystemOperations
import org.gradle.api.model.ObjectFactory
import org.gradle.api.provider.SetProperty
import org.gradle.api.tasks.Input
import org.gradle.api.tasks.OutputDirectory
import org.gradle.api.tasks.TaskAction

abstract class GenerateDslTask
@Inject
constructor(
    private val fs: FileSystemOperations,
    private val archiveOps: ArchiveOperations,
    private val objects: ObjectFactory
) : DefaultTask() {
    init {
        outputs.upToDateWhen { false }
    }

    @get:Input abstract val classpath: SetProperty<File>

    @get:Input abstract val sources: SetProperty<File>

    //        @get:InputFile
    //        abstract val cloudFormationSpecificationZip: RegularFileProperty

    @get:OutputDirectory abstract val dslDir: DirectoryProperty

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
                }
            )
            includeEmptyDirs = false
        }

        val cdkSourceModel = SourceParser.parse(sourcesDir)

        fs.delete { delete(dslDir) }

        val outDir = dslDir.get().asFile

        logger.lifecycle("Sources: ${sources.get().map { it.name }}")

        logger.lifecycle("Loading AWS CDK classes from ${classpath.get()}")
        val cdkClasses = AsmClassLoader.loadClasses(classpath.get(), cdkSourceModel.classMap)
        val cdkModel = CdkModelFactory.createModel(cdkClasses)

        logger.lifecycle("Generating builders...")
        BuilderGenerator.generate(cdkModel.builders).forEach { it.writeTo(outDir) }

        logger.lifecycle("Generating namespace objects...")
        writeObjects(NamespaceObjectGenerator().generate(cdkModel.builders))

        logger.lifecycle("Generating extension functions...")
        writeExtensionFunctions(
            BuildableLastArgumentExtensionGenerator().generate(cdkModel),
            "_BuildableLastArgumentExtensions"
        )
    }

    private fun writeObjects(
        functionMap: Map<ClassName, List<NamespaceObjectGenerator.NamespacedBuilderFunction>>
    ) {
        functionMap.forEach { (objectName, builderFunctions) ->
            val builder = FileSpec.builder(objectName.packageName, "_${objectName.simpleName}")
            builder.suppressWarningTypes(SUPPRESSIONS)
            val objectBuilder = TypeSpec.objectBuilder(objectName)
            builderFunctions.forEach { builderFn -> objectBuilder.addFunction(builderFn.funSpec) }
            builder.addType(objectBuilder.build())
            builder.build().writeTo(dslDir.get().asFile)
        }
    }

    private fun writeExtensionFunctions(
        extensionFunctions: Map<String, List<ExtensionFunctionSpec>>,
        targetFile: String
    ) {
        extensionFunctions.forEach { (packageName, funSpecs) ->
            val builder = FileSpec.builder(packageName, targetFile)
            builder.suppressWarningTypes(SUPPRESSIONS)
            funSpecs.sorted().forEach { funSpec -> builder.addFunction(funSpec.funSpec) }
            builder.build().writeTo(dslDir.get().asFile)
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
        "DEPRECATION"
    )

internal fun FileSpec.Builder.suppressWarningTypes(types: Collection<String>): FileSpec.Builder {
    if (types.isEmpty()) {
        return this
    }

    val format = "%S,".repeat(types.count()).trimEnd(',')
    addAnnotation(
        AnnotationSpec.builder(ClassName("", "Suppress"))
            .addMember(format, *types.toTypedArray())
            .build()
    )
    return this
}

internal fun FileSpec.Builder.suppressWarningTypes(vararg types: String): FileSpec.Builder {
    suppressWarningTypes(*types)
    return this
}
