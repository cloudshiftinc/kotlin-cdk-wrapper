@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.cloudassembly.schema

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName

public interface ArtifactManifest {
  public fun dependencies(): List<String> = unwrap(this).getDependencies() ?: emptyList()

  public fun displayName(): String? = unwrap(this).getDisplayName()

  public fun environment(): String? = unwrap(this).getEnvironment()

  public fun metadata(): Map<String, List<MetadataEntry>> =
      unwrap(this).getMetadata()?.mapValues{it.value.map(MetadataEntry::wrap)} ?: emptyMap()

  public fun properties(): Any? = unwrap(this).getProperties()

  public fun type(): ArtifactType

  @CdkDslMarker
  public interface Builder {
    public fun dependencies(dependencies: List<String>)

    public fun dependencies(vararg dependencies: String)

    public fun displayName(displayName: String)

    public fun environment(environment: String)

    public fun metadata(metadata: Map<String, List<MetadataEntry>>)

    public fun properties(properties: AwsCloudFormationStackProperties)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a9cd88ece8befdc19b37573af4b6c9ee97784ee34c7291444edc318e75ea25c6")
    public fun properties(properties: AwsCloudFormationStackProperties.Builder.() -> Unit)

    public fun properties(properties: AssetManifestProperties)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ee0ebde54971d0249092385447cb2b381d07277ce72ceb0f74f7a3eaa1fe4c29")
    public fun properties(properties: AssetManifestProperties.Builder.() -> Unit)

    public fun properties(properties: TreeArtifactProperties)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("47793dc3eb10e0d0626e3b0aa0cf9c28e466764aeba5fa5edc25e3214336a9b0")
    public fun properties(properties: TreeArtifactProperties.Builder.() -> Unit)

    public fun properties(properties: NestedCloudAssemblyProperties)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d46dae78e7b3afa168d770b9d51e110746b9cc92d5dde476a945f005261b5f64")
    public fun properties(properties: NestedCloudAssemblyProperties.Builder.() -> Unit)

    public fun type(type: ArtifactType)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.cloudassembly.schema.ArtifactManifest.Builder =
        software.amazon.awscdk.cloudassembly.schema.ArtifactManifest.builder()

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
      cdkBuilder.metadata(metadata.mapValues{it.value.map(MetadataEntry.Companion::unwrap) })
    }

    override fun properties(properties: AwsCloudFormationStackProperties) {
      cdkBuilder.properties(properties.let(AwsCloudFormationStackProperties.Companion::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a9cd88ece8befdc19b37573af4b6c9ee97784ee34c7291444edc318e75ea25c6")
    override fun properties(properties: AwsCloudFormationStackProperties.Builder.() -> Unit): Unit =
        properties(AwsCloudFormationStackProperties(properties))

    override fun properties(properties: AssetManifestProperties) {
      cdkBuilder.properties(properties.let(AssetManifestProperties.Companion::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ee0ebde54971d0249092385447cb2b381d07277ce72ceb0f74f7a3eaa1fe4c29")
    override fun properties(properties: AssetManifestProperties.Builder.() -> Unit): Unit =
        properties(AssetManifestProperties(properties))

    override fun properties(properties: TreeArtifactProperties) {
      cdkBuilder.properties(properties.let(TreeArtifactProperties.Companion::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("47793dc3eb10e0d0626e3b0aa0cf9c28e466764aeba5fa5edc25e3214336a9b0")
    override fun properties(properties: TreeArtifactProperties.Builder.() -> Unit): Unit =
        properties(TreeArtifactProperties(properties))

    override fun properties(properties: NestedCloudAssemblyProperties) {
      cdkBuilder.properties(properties.let(NestedCloudAssemblyProperties.Companion::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d46dae78e7b3afa168d770b9d51e110746b9cc92d5dde476a945f005261b5f64")
    override fun properties(properties: NestedCloudAssemblyProperties.Builder.() -> Unit): Unit =
        properties(NestedCloudAssemblyProperties(properties))

    override fun type(type: ArtifactType) {
      cdkBuilder.type(type.let(ArtifactType.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.cloudassembly.schema.ArtifactManifest =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.cloudassembly.schema.ArtifactManifest,
  ) : CdkObject(cdkObject),
      ArtifactManifest {
    override fun dependencies(): List<String> = unwrap(this).getDependencies() ?: emptyList()

    override fun displayName(): String? = unwrap(this).getDisplayName()

    override fun environment(): String? = unwrap(this).getEnvironment()

    override fun metadata(): Map<String, List<MetadataEntry>> =
        unwrap(this).getMetadata()?.mapValues{it.value.map(MetadataEntry::wrap)} ?: emptyMap()

    override fun properties(): Any? = unwrap(this).getProperties()

    override fun type(): ArtifactType = unwrap(this).getType().let(ArtifactType::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ArtifactManifest {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.cloudassembly.schema.ArtifactManifest):
        ArtifactManifest = CdkObjectWrappers.wrap(cdkObject) as? ArtifactManifest ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: ArtifactManifest):
        software.amazon.awscdk.cloudassembly.schema.ArtifactManifest = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.cloudassembly.schema.ArtifactManifest
  }
}
