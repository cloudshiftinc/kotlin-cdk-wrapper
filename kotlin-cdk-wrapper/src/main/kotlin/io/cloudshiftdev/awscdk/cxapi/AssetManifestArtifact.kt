@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.cxapi

import io.cloudshiftdev.awscdk.cloudassembly.schema.ArtifactType
import io.cloudshiftdev.awscdk.cloudassembly.schema.AssetManifest
import io.cloudshiftdev.awscdk.cloudassembly.schema.AssetManifestProperties
import io.cloudshiftdev.awscdk.cloudassembly.schema.AwsCloudFormationStackProperties
import io.cloudshiftdev.awscdk.cloudassembly.schema.MetadataEntry
import io.cloudshiftdev.awscdk.cloudassembly.schema.NestedCloudAssemblyProperties
import io.cloudshiftdev.awscdk.cloudassembly.schema.TreeArtifactProperties
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName

public open class AssetManifestArtifact internal constructor(
  internal override val cdkObject: software.amazon.awscdk.cxapi.AssetManifestArtifact,
) : CloudArtifact(cdkObject) {
  public open fun bootstrapStackVersionSsmParameter(): String? =
      unwrap(this).getBootstrapStackVersionSsmParameter()

  public open fun contents(): AssetManifest = unwrap(this).getContents().let(AssetManifest::wrap)

  public open fun `file`(): String = unwrap(this).getFile()

  public open fun requiresBootstrapStackVersion(): Number? =
      unwrap(this).getRequiresBootstrapStackVersion()

  @CdkDslMarker
  public interface Builder {
    public fun dependencies(dependencies: List<String>)

    public fun dependencies(vararg dependencies: String)

    public fun displayName(displayName: String)

    public fun environment(environment: String)

    public fun metadata(metadata: Map<String, List<MetadataEntry>>)

    public fun properties(properties: AwsCloudFormationStackProperties)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e89b1c0dbdcc1d7fbcee4b8dadd2d45ae24784ce2b4ca84df7eb3dfc96e6c533")
    public fun properties(properties: AwsCloudFormationStackProperties.Builder.() -> Unit)

    public fun properties(properties: AssetManifestProperties)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ffa5c299805b5dfd99f5c3c76240d9f103d70c9537bcdbb4d8ec4de118be3964")
    public fun properties(properties: AssetManifestProperties.Builder.() -> Unit)

    public fun properties(properties: TreeArtifactProperties)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1182e1aa860a90842ac5e0abac4487997ba1dbae6944e7dbe1530775dba29dd4")
    public fun properties(properties: TreeArtifactProperties.Builder.() -> Unit)

    public fun properties(properties: NestedCloudAssemblyProperties)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("bc43cd0ebb4b7d7c81d5cf995bbc8bce4991ee762887b4e1d87718a8794f68e1")
    public fun properties(properties: NestedCloudAssemblyProperties.Builder.() -> Unit)

    public fun type(type: ArtifactType)
  }

  private class BuilderImpl(
    assembly: software.amazon.awscdk.cxapi.CloudAssembly,
    name: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.cxapi.AssetManifestArtifact.Builder =
        software.amazon.awscdk.cxapi.AssetManifestArtifact.Builder.create(assembly, name)

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

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e89b1c0dbdcc1d7fbcee4b8dadd2d45ae24784ce2b4ca84df7eb3dfc96e6c533")
    override fun properties(properties: AwsCloudFormationStackProperties.Builder.() -> Unit): Unit =
        properties(AwsCloudFormationStackProperties(properties))

    override fun properties(properties: AssetManifestProperties) {
      cdkBuilder.properties(properties.let(AssetManifestProperties::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ffa5c299805b5dfd99f5c3c76240d9f103d70c9537bcdbb4d8ec4de118be3964")
    override fun properties(properties: AssetManifestProperties.Builder.() -> Unit): Unit =
        properties(AssetManifestProperties(properties))

    override fun properties(properties: TreeArtifactProperties) {
      cdkBuilder.properties(properties.let(TreeArtifactProperties::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1182e1aa860a90842ac5e0abac4487997ba1dbae6944e7dbe1530775dba29dd4")
    override fun properties(properties: TreeArtifactProperties.Builder.() -> Unit): Unit =
        properties(TreeArtifactProperties(properties))

    override fun properties(properties: NestedCloudAssemblyProperties) {
      cdkBuilder.properties(properties.let(NestedCloudAssemblyProperties::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("bc43cd0ebb4b7d7c81d5cf995bbc8bce4991ee762887b4e1d87718a8794f68e1")
    override fun properties(properties: NestedCloudAssemblyProperties.Builder.() -> Unit): Unit =
        properties(NestedCloudAssemblyProperties(properties))

    override fun type(type: ArtifactType) {
      cdkBuilder.type(type.let(ArtifactType::unwrap))
    }

    public fun build(): software.amazon.awscdk.cxapi.AssetManifestArtifact = cdkBuilder.build()
  }

  public companion object {
    public fun isAssetManifestArtifact(art: Any): Boolean =
        software.amazon.awscdk.cxapi.AssetManifestArtifact.isAssetManifestArtifact(art)

    public operator fun invoke(
      assembly: CloudAssembly,
      name: String,
      block: Builder.() -> Unit = {},
    ): AssetManifestArtifact {
      val builderImpl = BuilderImpl(CloudAssembly.unwrap(assembly), name)
      return AssetManifestArtifact(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.cxapi.AssetManifestArtifact):
        AssetManifestArtifact = AssetManifestArtifact(cdkObject)

    internal fun unwrap(wrapped: AssetManifestArtifact):
        software.amazon.awscdk.cxapi.AssetManifestArtifact = wrapped.cdkObject
  }
}
