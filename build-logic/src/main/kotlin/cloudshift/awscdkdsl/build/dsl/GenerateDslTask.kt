package cloudshift.awscdkdsl.build.dsl

import com.google.common.collect.ImmutableMultimap
import com.google.common.collect.Multimap
import com.google.common.reflect.ClassPath
import com.squareup.kotlinpoet.AnnotationSpec
import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.FileSpec
import com.squareup.kotlinpoet.FunSpec
import com.squareup.kotlinpoet.TypeSpec
import org.gradle.api.DefaultTask
import org.gradle.api.file.DirectoryProperty
import org.gradle.api.file.FileSystemOperations
import org.gradle.api.provider.SetProperty
import org.gradle.api.tasks.CacheableTask
import org.gradle.api.tasks.Input
import org.gradle.api.tasks.OutputDirectory
import org.gradle.api.tasks.TaskAction
import java.io.File
import java.net.URLClassLoader
import javax.inject.Inject

@CacheableTask
abstract class GenerateDslTask @Inject constructor(private val fs: FileSystemOperations) : DefaultTask() {

    @get:Input
    abstract val classpath: SetProperty<File>

    @get:OutputDirectory
    abstract val dslDir: DirectoryProperty

    @TaskAction
    fun action() {

        logger.lifecycle("Removing old DSL from ${dslDir.get()}")
        fs.delete {
            delete(dslDir)
        }

        logger.lifecycle("Loading AWS CDK classes from ${classpath.get()}")

        // create custom classloader for CDK classes that will be discarded, to avoid
        // polluting Gradle classloaders
        val loader = URLClassLoader(
            classpath.get().map { it.toURI().toURL() }.toTypedArray(),
            Thread.currentThread().contextClassLoader
        )
        val builderSuperClass = loader.loadClass("software.amazon.jsii.Builder").kotlin

        val cdkClasses =
            ClassPath.from(loader).allClasses.asSequence()
                .filter {
                    it.packageName.startsWith("software.amazon.awscdk")
                        && !it.name.contains("Jsii\$")
                }
                .map { CdkClass.from(it, builderSuperClass) }
                .toList()

        logger.lifecycle("Building CDK class registry...")
        val classRegistry = CdkClassRegistry.create(cdkClasses)

        val outDir = dslDir.get().asFile

        logger.lifecycle("Generating builders...")
        val builders = classRegistry.allBuilders()
        BuilderGenerator(classRegistry).generate(builders).forEach {
            it.writeTo(outDir)
        }

        logger.lifecycle("Generating namespace objects...")
        writeObjects(
            NamespaceObjectGenerator().generate(builders)
        )

        logger.lifecycle("Generating extension functions...")
        writeExtensionFunctions(
            BuildableLastArgumentExtensionGenerator(classRegistry).generate(),
            "_BuildableLastArgumentExtensions"
        )


        /* TODO
               -pull across deprecation annotations
               -pull across argument names (try https://github.com/airlift/parameternames)
               -pull across doc comments
         */
    }

    private fun writeObjects(functionMap: ImmutableMultimap<ClassName, FunSpec>) {
        functionMap.asMap().forEach { (objectName, funSpecs) ->
            val builder = FileSpec.builder(objectName.packageName, "_${objectName.simpleName}")
            builder.suppressWarningTypes(SUPPRESSIONS)
            val objectBuilder = TypeSpec.objectBuilder(objectName)
            funSpecs.sortedBy { it.toString() }.forEach { funSpec ->
                objectBuilder.addFunction(funSpec)
            }
            builder.addType(objectBuilder.build())
            builder.build().writeTo(dslDir.get().asFile)
        }
    }

    private fun writeExtensionFunctions(
        extensionFunctions: Multimap<String, ExtensionFunctionSpec>,
        targetFile: String
    ) {
        extensionFunctions.asMap().forEach { (packageName, funSpecs) ->
            val builder = FileSpec.builder(packageName, targetFile)
            builder.suppressWarningTypes(SUPPRESSIONS)
            funSpecs.sortedBy { it.toString() }.forEach { funSpec ->
                builder.addFunction(funSpec.funSpec)
            }
            builder.build().writeTo(dslDir.get().asFile)
        }
    }


}

internal val SUPPRESSIONS = setOf(
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
