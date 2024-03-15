package cloudshift.awscdkdsl.build.dsl

import cloudshift.awscdkdsl.build.dsl.asm.AsmClassLoader
import cloudshift.awscdkdsl.build.dsl.model.source.CdkSourceModel
import cloudshift.awscdkdsl.build.dsl.model.type.WrapperTypeGenerator
import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.JsonParser
import com.fasterxml.jackson.databind.DeserializationContext
import com.fasterxml.jackson.databind.JsonDeserializer
import com.fasterxml.jackson.databind.JsonSerializer
import com.fasterxml.jackson.databind.KeyDeserializer
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.module.SimpleModule
import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import com.fasterxml.jackson.module.kotlin.readValue
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
        fs.delete { delete(sourcesDir) }
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
        val cdkSourceModel = cdkSourceModel(sourcesDir)
        logger.lifecycle("Sources: ${sources.get().map { it.name }}")

        logger.lifecycle("Loading AWS CDK classes from ${classpath.get()}")
        val cdkClasses2 = AsmClassLoader.loadClasses(classpath.get(), cdkSourceModel.classMap)
        val cdkModel2 = CdkModelFactory.createModel(cdkClasses2)
        val specs = WrapperTypeGenerator.generate(cdkModel2)

        specs.forEach {
            it.toBuilder().suppressWarningTypes(SUPPRESSIONS).build().writeTo(outDir)
        }
    }

    private fun cdkSourceModel(sourcesDir: File): CdkSourceModel {
        val cacheKey = sources.get().joinToString("|") { it.name }.sha256()
        val cacheFile = temporaryDir.resolve("cdk-source-model-$cacheKey.json")
        val mapper = jacksonObjectMapper()

        val module = SimpleModule()
        module.addSerializer(ClassName::class.java, ClassNameSerializer())
        module.addKeySerializer(ClassName::class.java, ClassNameKeySerializer())
        module.addDeserializer(ClassName::class.java, ClassNameDeserializer())
        module.addKeyDeserializer(ClassName::class.java, ClassNameKeyDeserializer())
        mapper.registerModules(module)

        // TODO: expire after an hour/day?

        if (cacheFile.exists()) {
            try {
                logger.lifecycle("Loading cached cdk source model from $cacheFile")
                return mapper.readValue<CdkSourceModel>(cacheFile)
            } catch (e: Exception) {
                logger.lifecycle("Cache failure: ${e.message}")
            }
        }

        logger.lifecycle("Generating source model from sources: ${sources.get().map { it.name }}")
        val model = loadCdkSourceModel(sourcesDir)
        mapper.writeValue(cacheFile, model)
        return model
    }

    private fun loadCdkSourceModel(sourcesDir: File): CdkSourceModel {
        return SourceParser.parse(sourcesDir)
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


private class ClassNameSerializer : JsonSerializer<ClassName>() {
    override fun serialize(value: ClassName, gen: JsonGenerator, serializers: SerializerProvider) {
        gen.writeString(value.packageName + "|" + value.simpleNames.joinToString("."))
    }
}

private class ClassNameKeySerializer : JsonSerializer<ClassName>() {
    override fun serialize(value: ClassName, gen: JsonGenerator, serializers: SerializerProvider) {
        gen.writeFieldName(value.packageName + "|" + value.simpleNames.joinToString("."))
    }
}

private class ClassNameDeserializer : JsonDeserializer<ClassName>() {

    override fun deserialize(p: JsonParser, ctxt: DeserializationContext): ClassName {
        return p.text.split("|").let {
            ClassName(it[0], it[1].split("."))
        }
    }
}

private class ClassNameKeyDeserializer : KeyDeserializer() {


    override fun deserializeKey(key: String, ctxt: DeserializationContext?): Any {
        return key.split("|").let {
            ClassName(it[0], it[1].split("."))
        }
    }
}
