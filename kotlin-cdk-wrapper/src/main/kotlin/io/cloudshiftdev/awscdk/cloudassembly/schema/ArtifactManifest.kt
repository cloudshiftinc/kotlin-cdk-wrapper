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

/**
 * A manifest for a single artifact within the cloud assembly.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.cloudassembly.schema.*;
 * ArtifactManifest artifactManifest = ArtifactManifest.builder()
 * .type(ArtifactType.NONE)
 * // the properties below are optional
 * .dependencies(List.of("dependencies"))
 * .displayName("displayName")
 * .environment("environment")
 * .metadata(Map.of(
 * "metadataKey", List.of(MetadataEntry.builder()
 * .type("type")
 * // the properties below are optional
 * .data("data")
 * .trace(List.of("trace"))
 * .build())))
 * .properties(AwsCloudFormationStackProperties.builder()
 * .templateFile("templateFile")
 * // the properties below are optional
 * .assumeRoleArn("assumeRoleArn")
 * .assumeRoleExternalId("assumeRoleExternalId")
 * .bootstrapStackVersionSsmParameter("bootstrapStackVersionSsmParameter")
 * .cloudFormationExecutionRoleArn("cloudFormationExecutionRoleArn")
 * .lookupRole(BootstrapRole.builder()
 * .arn("arn")
 * // the properties below are optional
 * .assumeRoleExternalId("assumeRoleExternalId")
 * .bootstrapStackVersionSsmParameter("bootstrapStackVersionSsmParameter")
 * .requiresBootstrapStackVersion(123)
 * .build())
 * .parameters(Map.of(
 * "parametersKey", "parameters"))
 * .requiresBootstrapStackVersion(123)
 * .stackName("stackName")
 * .stackTemplateAssetObjectUrl("stackTemplateAssetObjectUrl")
 * .tags(Map.of(
 * "tagsKey", "tags"))
 * .terminationProtection(false)
 * .validateOnSynth(false)
 * .build())
 * .build();
 * ```
 */
public interface ArtifactManifest {
  /**
   * IDs of artifacts that must be deployed before this artifact.
   *
   * Default: - no dependencies.
   */
  public fun dependencies(): List<String> = unwrap(this).getDependencies() ?: emptyList()

  /**
   * A string that represents this artifact.
   *
   * Should only be used in user interfaces.
   *
   * Default: - no display name
   */
  public fun displayName(): String? = unwrap(this).getDisplayName()

  /**
   * The environment into which this artifact is deployed.
   *
   * Default: - no envrionment.
   */
  public fun environment(): String? = unwrap(this).getEnvironment()

  /**
   * Associated metadata.
   *
   * Default: - no metadata.
   */
  public fun metadata(): Map<String, List<MetadataEntry>> =
      unwrap(this).getMetadata()?.mapValues{it.value.map(MetadataEntry::wrap)} ?: emptyMap()

  /**
   * The set of properties for this artifact (depends on type).
   *
   * Default: - no properties.
   */
  public fun properties(): Any? = unwrap(this).getProperties()

  /**
   * The type of artifact.
   */
  public fun type(): ArtifactType

  /**
   * A builder for [ArtifactManifest]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param dependencies IDs of artifacts that must be deployed before this artifact.
     */
    public fun dependencies(dependencies: List<String>)

    /**
     * @param dependencies IDs of artifacts that must be deployed before this artifact.
     */
    public fun dependencies(vararg dependencies: String)

    /**
     * @param displayName A string that represents this artifact.
     * Should only be used in user interfaces.
     */
    public fun displayName(displayName: String)

    /**
     * @param environment The environment into which this artifact is deployed.
     */
    public fun environment(environment: String)

    /**
     * @param metadata Associated metadata.
     */
    public fun metadata(metadata: Map<String, List<MetadataEntry>>)

    /**
     * @param properties The set of properties for this artifact (depends on type).
     */
    public fun properties(properties: AwsCloudFormationStackProperties)

    /**
     * @param properties The set of properties for this artifact (depends on type).
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a9cd88ece8befdc19b37573af4b6c9ee97784ee34c7291444edc318e75ea25c6")
    public fun properties(properties: AwsCloudFormationStackProperties.Builder.() -> Unit)

    /**
     * @param properties The set of properties for this artifact (depends on type).
     */
    public fun properties(properties: AssetManifestProperties)

    /**
     * @param properties The set of properties for this artifact (depends on type).
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ee0ebde54971d0249092385447cb2b381d07277ce72ceb0f74f7a3eaa1fe4c29")
    public fun properties(properties: AssetManifestProperties.Builder.() -> Unit)

    /**
     * @param properties The set of properties for this artifact (depends on type).
     */
    public fun properties(properties: TreeArtifactProperties)

    /**
     * @param properties The set of properties for this artifact (depends on type).
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("47793dc3eb10e0d0626e3b0aa0cf9c28e466764aeba5fa5edc25e3214336a9b0")
    public fun properties(properties: TreeArtifactProperties.Builder.() -> Unit)

    /**
     * @param properties The set of properties for this artifact (depends on type).
     */
    public fun properties(properties: NestedCloudAssemblyProperties)

    /**
     * @param properties The set of properties for this artifact (depends on type).
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d46dae78e7b3afa168d770b9d51e110746b9cc92d5dde476a945f005261b5f64")
    public fun properties(properties: NestedCloudAssemblyProperties.Builder.() -> Unit)

    /**
     * @param type The type of artifact. 
     */
    public fun type(type: ArtifactType)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.cloudassembly.schema.ArtifactManifest.Builder =
        software.amazon.awscdk.cloudassembly.schema.ArtifactManifest.builder()

    /**
     * @param dependencies IDs of artifacts that must be deployed before this artifact.
     */
    override fun dependencies(dependencies: List<String>) {
      cdkBuilder.dependencies(dependencies)
    }

    /**
     * @param dependencies IDs of artifacts that must be deployed before this artifact.
     */
    override fun dependencies(vararg dependencies: String): Unit =
        dependencies(dependencies.toList())

    /**
     * @param displayName A string that represents this artifact.
     * Should only be used in user interfaces.
     */
    override fun displayName(displayName: String) {
      cdkBuilder.displayName(displayName)
    }

    /**
     * @param environment The environment into which this artifact is deployed.
     */
    override fun environment(environment: String) {
      cdkBuilder.environment(environment)
    }

    /**
     * @param metadata Associated metadata.
     */
    override fun metadata(metadata: Map<String, List<MetadataEntry>>) {
      cdkBuilder.metadata(metadata.mapValues{it.value.map(MetadataEntry.Companion::unwrap) })
    }

    /**
     * @param properties The set of properties for this artifact (depends on type).
     */
    override fun properties(properties: AwsCloudFormationStackProperties) {
      cdkBuilder.properties(properties.let(AwsCloudFormationStackProperties.Companion::unwrap))
    }

    /**
     * @param properties The set of properties for this artifact (depends on type).
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a9cd88ece8befdc19b37573af4b6c9ee97784ee34c7291444edc318e75ea25c6")
    override fun properties(properties: AwsCloudFormationStackProperties.Builder.() -> Unit): Unit =
        properties(AwsCloudFormationStackProperties(properties))

    /**
     * @param properties The set of properties for this artifact (depends on type).
     */
    override fun properties(properties: AssetManifestProperties) {
      cdkBuilder.properties(properties.let(AssetManifestProperties.Companion::unwrap))
    }

    /**
     * @param properties The set of properties for this artifact (depends on type).
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ee0ebde54971d0249092385447cb2b381d07277ce72ceb0f74f7a3eaa1fe4c29")
    override fun properties(properties: AssetManifestProperties.Builder.() -> Unit): Unit =
        properties(AssetManifestProperties(properties))

    /**
     * @param properties The set of properties for this artifact (depends on type).
     */
    override fun properties(properties: TreeArtifactProperties) {
      cdkBuilder.properties(properties.let(TreeArtifactProperties.Companion::unwrap))
    }

    /**
     * @param properties The set of properties for this artifact (depends on type).
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("47793dc3eb10e0d0626e3b0aa0cf9c28e466764aeba5fa5edc25e3214336a9b0")
    override fun properties(properties: TreeArtifactProperties.Builder.() -> Unit): Unit =
        properties(TreeArtifactProperties(properties))

    /**
     * @param properties The set of properties for this artifact (depends on type).
     */
    override fun properties(properties: NestedCloudAssemblyProperties) {
      cdkBuilder.properties(properties.let(NestedCloudAssemblyProperties.Companion::unwrap))
    }

    /**
     * @param properties The set of properties for this artifact (depends on type).
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d46dae78e7b3afa168d770b9d51e110746b9cc92d5dde476a945f005261b5f64")
    override fun properties(properties: NestedCloudAssemblyProperties.Builder.() -> Unit): Unit =
        properties(NestedCloudAssemblyProperties(properties))

    /**
     * @param type The type of artifact. 
     */
    override fun type(type: ArtifactType) {
      cdkBuilder.type(type.let(ArtifactType.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.cloudassembly.schema.ArtifactManifest =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.cloudassembly.schema.ArtifactManifest,
  ) : CdkObject(cdkObject), ArtifactManifest {
    /**
     * IDs of artifacts that must be deployed before this artifact.
     *
     * Default: - no dependencies.
     */
    override fun dependencies(): List<String> = unwrap(this).getDependencies() ?: emptyList()

    /**
     * A string that represents this artifact.
     *
     * Should only be used in user interfaces.
     *
     * Default: - no display name
     */
    override fun displayName(): String? = unwrap(this).getDisplayName()

    /**
     * The environment into which this artifact is deployed.
     *
     * Default: - no envrionment.
     */
    override fun environment(): String? = unwrap(this).getEnvironment()

    /**
     * Associated metadata.
     *
     * Default: - no metadata.
     */
    override fun metadata(): Map<String, List<MetadataEntry>> =
        unwrap(this).getMetadata()?.mapValues{it.value.map(MetadataEntry::wrap)} ?: emptyMap()

    /**
     * The set of properties for this artifact (depends on type).
     *
     * Default: - no properties.
     */
    override fun properties(): Any? = unwrap(this).getProperties()

    /**
     * The type of artifact.
     */
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
