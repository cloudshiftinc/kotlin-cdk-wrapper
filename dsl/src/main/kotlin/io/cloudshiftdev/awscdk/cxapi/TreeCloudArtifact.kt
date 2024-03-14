package io.cloudshiftdev.awscdk.cxapi

import io.cloudshiftdev.awscdk.cloudassembly.schema.ArtifactType
import io.cloudshiftdev.awscdk.cloudassembly.schema.AssetManifestProperties
import io.cloudshiftdev.awscdk.cloudassembly.schema.AwsCloudFormationStackProperties
import io.cloudshiftdev.awscdk.cloudassembly.schema.MetadataEntry
import io.cloudshiftdev.awscdk.cloudassembly.schema.NestedCloudAssemblyProperties
import io.cloudshiftdev.awscdk.cloudassembly.schema.TreeArtifactProperties
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName

public open class TreeCloudArtifact internal constructor(
  private val cdkObject: software.amazon.awscdk.cxapi.TreeCloudArtifact,
) : CloudArtifact(cdkObject) {
  public open fun `file`(): String = unwrap(this).getFile()

  public interface Builder {
    public fun dependencies(dependencies: List<String>)

    public fun dependencies(vararg dependencies: String)

    public fun displayName(displayName: String)

    public fun environment(environment: String)

    public fun metadata(metadata: Map<String, List<MetadataEntry>>)

    public fun properties(properties: AwsCloudFormationStackProperties)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e837c90fefdbc6b245ecbb8fb868adda0cb103621322b158b2b5d530b9a4fd8f")
    public fun properties(properties: AwsCloudFormationStackProperties.Builder.() -> Unit)

    public fun properties(properties: AssetManifestProperties)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0b35c2137597c284018bb71d75146cfd1ab20b146ce33bf20a2b982d96740800")
    public fun properties(properties: AssetManifestProperties.Builder.() -> Unit)

    public fun properties(properties: TreeArtifactProperties)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("eb00f0aad17348ccffbe8495fe60ce431ab96a636776c14d57d17eca9ec1aad3")
    public fun properties(properties: TreeArtifactProperties.Builder.() -> Unit)

    public fun properties(properties: NestedCloudAssemblyProperties)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("896619724a089e10e64e1b0d16bd0a796828e5ca239724f6c763607aa381a921")
    public fun properties(properties: NestedCloudAssemblyProperties.Builder.() -> Unit)

    public fun type(type: ArtifactType)
  }

  private class BuilderImpl(
    assembly: software.amazon.awscdk.cxapi.CloudAssembly,
    name: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.cxapi.TreeCloudArtifact.Builder =
        software.amazon.awscdk.cxapi.TreeCloudArtifact.Builder.create(assembly, name)

    override fun dependencies(dependencies: List<String>) {
      cdkBuilder.dependencies(dependencies)
    }

    override fun dependencies(vararg dependencies: String): Unit =
        dependencies(dependencies.toList())

    override fun displayName(displayName: String) {
      cdkBuilder.displayName(displayName)
    }

    override fun environment(environment: String) {
      cdkBuilder.environment(environment)
    }

    override fun metadata(metadata: Map<String, List<MetadataEntry>>) {
      cdkBuilder.metadata(metadata.mapValues{it.value.map(MetadataEntry::unwrap) })
    }

    override fun properties(properties: AwsCloudFormationStackProperties) {
      cdkBuilder.properties(properties.let(AwsCloudFormationStackProperties::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e837c90fefdbc6b245ecbb8fb868adda0cb103621322b158b2b5d530b9a4fd8f")
    override fun properties(properties: AwsCloudFormationStackProperties.Builder.() -> Unit): Unit =
        properties(AwsCloudFormationStackProperties(properties))

    override fun properties(properties: AssetManifestProperties) {
      cdkBuilder.properties(properties.let(AssetManifestProperties::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0b35c2137597c284018bb71d75146cfd1ab20b146ce33bf20a2b982d96740800")
    override fun properties(properties: AssetManifestProperties.Builder.() -> Unit): Unit =
        properties(AssetManifestProperties(properties))

    override fun properties(properties: TreeArtifactProperties) {
      cdkBuilder.properties(properties.let(TreeArtifactProperties::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("eb00f0aad17348ccffbe8495fe60ce431ab96a636776c14d57d17eca9ec1aad3")
    override fun properties(properties: TreeArtifactProperties.Builder.() -> Unit): Unit =
        properties(TreeArtifactProperties(properties))

    override fun properties(properties: NestedCloudAssemblyProperties) {
      cdkBuilder.properties(properties.let(NestedCloudAssemblyProperties::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("896619724a089e10e64e1b0d16bd0a796828e5ca239724f6c763607aa381a921")
    override fun properties(properties: NestedCloudAssemblyProperties.Builder.() -> Unit): Unit =
        properties(NestedCloudAssemblyProperties(properties))

    override fun type(type: ArtifactType) {
      cdkBuilder.type(type.let(ArtifactType::unwrap))
    }

    public fun build(): software.amazon.awscdk.cxapi.TreeCloudArtifact = cdkBuilder.build()
  }

  public companion object {
    public open fun isTreeCloudArtifact(art: Any): Boolean =
        software.amazon.awscdk.cxapi.TreeCloudArtifact.isTreeCloudArtifact(art)

    public operator fun invoke(
      assembly: CloudAssembly,
      name: String,
      block: Builder.() -> Unit = {},
    ): TreeCloudArtifact {
      val builderImpl = BuilderImpl(CloudAssembly.unwrap(assembly), name)
      return TreeCloudArtifact(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.cxapi.TreeCloudArtifact): TreeCloudArtifact
        = TreeCloudArtifact(cdkObject)

    internal fun unwrap(wrapped: TreeCloudArtifact): software.amazon.awscdk.cxapi.TreeCloudArtifact
        = wrapped.cdkObject
  }
}
