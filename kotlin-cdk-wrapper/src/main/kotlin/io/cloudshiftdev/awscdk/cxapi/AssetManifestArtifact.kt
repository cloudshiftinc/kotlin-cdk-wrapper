@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.cxapi

import io.cloudshiftdev.awscdk.cloud_assembly_schema.ArtifactManifest
import io.cloudshiftdev.awscdk.cloud_assembly_schema.ArtifactType
import io.cloudshiftdev.awscdk.cloud_assembly_schema.AssetManifest
import io.cloudshiftdev.awscdk.cloud_assembly_schema.AssetManifestProperties
import io.cloudshiftdev.awscdk.cloud_assembly_schema.AwsCloudFormationStackProperties
import io.cloudshiftdev.awscdk.cloud_assembly_schema.MetadataEntry
import io.cloudshiftdev.awscdk.cloud_assembly_schema.NestedCloudAssemblyProperties
import io.cloudshiftdev.awscdk.cloud_assembly_schema.TreeArtifactProperties
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName

/**
 * Asset manifest is a description of a set of assets which need to be built and published.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.cloud_assembly_schema.*;
 * import io.cloudshiftdev.awscdk.cxapi.*;
 * Object assumeRoleAdditionalOptions;
 * CloudAssembly cloudAssembly;
 * AssetManifestArtifact assetManifestArtifact = AssetManifestArtifact.Builder.create(cloudAssembly,
 * "name")
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
 * .assumeRoleAdditionalOptions(Map.of(
 * "assumeRoleAdditionalOptionsKey", assumeRoleAdditionalOptions))
 * .assumeRoleArn("assumeRoleArn")
 * .assumeRoleExternalId("assumeRoleExternalId")
 * .bootstrapStackVersionSsmParameter("bootstrapStackVersionSsmParameter")
 * .cloudFormationExecutionRoleArn("cloudFormationExecutionRoleArn")
 * .lookupRole(BootstrapRole.builder()
 * .arn("arn")
 * // the properties below are optional
 * .assumeRoleAdditionalOptions(Map.of(
 * "assumeRoleAdditionalOptionsKey", assumeRoleAdditionalOptions))
 * .assumeRoleExternalId("assumeRoleExternalId")
 * .bootstrapStackVersionSsmParameter("bootstrapStackVersionSsmParameter")
 * .requiresBootstrapStackVersion(123)
 * .build())
 * .notificationArns(List.of("notificationArns"))
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
public open class AssetManifestArtifact(
  cdkObject: software.amazon.awscdk.cxapi.AssetManifestArtifact,
) : CloudArtifact(cdkObject) {
  public constructor(
    assembly: CloudAssembly,
    name: String,
    artifact: ArtifactManifest,
  ) :
      this(software.amazon.awscdk.cxapi.AssetManifestArtifact(assembly.let(CloudAssembly.Companion::unwrap),
      name, artifact.let(ArtifactManifest.Companion::unwrap))
  )

  public constructor(
    assembly: CloudAssembly,
    name: String,
    artifact: ArtifactManifest.Builder.() -> Unit,
  ) : this(assembly, name, ArtifactManifest(artifact)
  )

  /**
   * Name of SSM parameter with bootstrap stack version.
   *
   * Default: - Discover SSM parameter by reading stack
   */
  public open fun bootstrapStackVersionSsmParameter(): String? =
      unwrap(this).getBootstrapStackVersionSsmParameter()

  /**
   * The Asset Manifest contents.
   */
  public open fun contents(): AssetManifest = unwrap(this).getContents().let(AssetManifest::wrap)

  /**
   * The file name of the asset manifest.
   */
  public open fun `file`(): String = unwrap(this).getFile()

  /**
   * Version of bootstrap stack required to deploy this stack.
   */
  public open fun requiresBootstrapStackVersion(): Number? =
      unwrap(this).getRequiresBootstrapStackVersion()

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.cxapi.AssetManifestArtifact].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * IDs of artifacts that must be deployed before this artifact.
     *
     * Default: - no dependencies.
     *
     * @param dependencies IDs of artifacts that must be deployed before this artifact. 
     */
    public fun dependencies(dependencies: List<String>)

    /**
     * IDs of artifacts that must be deployed before this artifact.
     *
     * Default: - no dependencies.
     *
     * @param dependencies IDs of artifacts that must be deployed before this artifact. 
     */
    public fun dependencies(vararg dependencies: String)

    /**
     * A string that represents this artifact.
     *
     * Should only be used in user interfaces.
     *
     * Default: - no display name
     *
     * @param displayName A string that represents this artifact. 
     */
    public fun displayName(displayName: String)

    /**
     * The environment into which this artifact is deployed.
     *
     * Default: - no envrionment.
     *
     * @param environment The environment into which this artifact is deployed. 
     */
    public fun environment(environment: String)

    /**
     * Associated metadata.
     *
     * Default: - no metadata.
     *
     * @param metadata Associated metadata. 
     */
    public fun metadata(metadata: Map<String, List<MetadataEntry>>)

    /**
     * The set of properties for this artifact (depends on type).
     *
     * Default: - no properties.
     *
     * @param properties The set of properties for this artifact (depends on type). 
     */
    public fun properties(properties: AwsCloudFormationStackProperties)

    /**
     * The set of properties for this artifact (depends on type).
     *
     * Default: - no properties.
     *
     * @param properties The set of properties for this artifact (depends on type). 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("366eb6a2ea0bfab55317cbb934c33b8be87ed9187776d5812d0ad2161bde70f6")
    public fun properties(properties: AwsCloudFormationStackProperties.Builder.() -> Unit)

    /**
     * The set of properties for this artifact (depends on type).
     *
     * Default: - no properties.
     *
     * @param properties The set of properties for this artifact (depends on type). 
     */
    public fun properties(properties: AssetManifestProperties)

    /**
     * The set of properties for this artifact (depends on type).
     *
     * Default: - no properties.
     *
     * @param properties The set of properties for this artifact (depends on type). 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("40a45ac470eed12f3e443fb7f2868afc6967438953a01513a2fb4a23fe9c8e26")
    public fun properties(properties: AssetManifestProperties.Builder.() -> Unit)

    /**
     * The set of properties for this artifact (depends on type).
     *
     * Default: - no properties.
     *
     * @param properties The set of properties for this artifact (depends on type). 
     */
    public fun properties(properties: TreeArtifactProperties)

    /**
     * The set of properties for this artifact (depends on type).
     *
     * Default: - no properties.
     *
     * @param properties The set of properties for this artifact (depends on type). 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e00b4323f20df3ee3c1016a6c4db2d554f32940c32c7d868c5b8b8cdc9a687ac")
    public fun properties(properties: TreeArtifactProperties.Builder.() -> Unit)

    /**
     * The set of properties for this artifact (depends on type).
     *
     * Default: - no properties.
     *
     * @param properties The set of properties for this artifact (depends on type). 
     */
    public fun properties(properties: NestedCloudAssemblyProperties)

    /**
     * The set of properties for this artifact (depends on type).
     *
     * Default: - no properties.
     *
     * @param properties The set of properties for this artifact (depends on type). 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d1d33e161dae163efe28cc346b9703ca30c8fa6011309bab510a2794427a25f3")
    public fun properties(properties: NestedCloudAssemblyProperties.Builder.() -> Unit)

    /**
     * The type of artifact.
     *
     * @param type The type of artifact. 
     */
    public fun type(type: ArtifactType)
  }

  private class BuilderImpl(
    assembly: software.amazon.awscdk.cxapi.CloudAssembly,
    name: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.cxapi.AssetManifestArtifact.Builder =
        software.amazon.awscdk.cxapi.AssetManifestArtifact.Builder.create(assembly, name)

    /**
     * IDs of artifacts that must be deployed before this artifact.
     *
     * Default: - no dependencies.
     *
     * @param dependencies IDs of artifacts that must be deployed before this artifact. 
     */
    override fun dependencies(dependencies: List<String>) {
      cdkBuilder.dependencies(dependencies)
    }

    /**
     * IDs of artifacts that must be deployed before this artifact.
     *
     * Default: - no dependencies.
     *
     * @param dependencies IDs of artifacts that must be deployed before this artifact. 
     */
    override fun dependencies(vararg dependencies: String): Unit =
        dependencies(dependencies.toList())

    /**
     * A string that represents this artifact.
     *
     * Should only be used in user interfaces.
     *
     * Default: - no display name
     *
     * @param displayName A string that represents this artifact. 
     */
    override fun displayName(displayName: String) {
      cdkBuilder.displayName(displayName)
    }

    /**
     * The environment into which this artifact is deployed.
     *
     * Default: - no envrionment.
     *
     * @param environment The environment into which this artifact is deployed. 
     */
    override fun environment(environment: String) {
      cdkBuilder.environment(environment)
    }

    /**
     * Associated metadata.
     *
     * Default: - no metadata.
     *
     * @param metadata Associated metadata. 
     */
    override fun metadata(metadata: Map<String, List<MetadataEntry>>) {
      cdkBuilder.metadata(metadata.mapValues{it.value.map(MetadataEntry.Companion::unwrap) })
    }

    /**
     * The set of properties for this artifact (depends on type).
     *
     * Default: - no properties.
     *
     * @param properties The set of properties for this artifact (depends on type). 
     */
    override fun properties(properties: AwsCloudFormationStackProperties) {
      cdkBuilder.properties(properties.let(AwsCloudFormationStackProperties.Companion::unwrap))
    }

    /**
     * The set of properties for this artifact (depends on type).
     *
     * Default: - no properties.
     *
     * @param properties The set of properties for this artifact (depends on type). 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("366eb6a2ea0bfab55317cbb934c33b8be87ed9187776d5812d0ad2161bde70f6")
    override fun properties(properties: AwsCloudFormationStackProperties.Builder.() -> Unit): Unit =
        properties(AwsCloudFormationStackProperties(properties))

    /**
     * The set of properties for this artifact (depends on type).
     *
     * Default: - no properties.
     *
     * @param properties The set of properties for this artifact (depends on type). 
     */
    override fun properties(properties: AssetManifestProperties) {
      cdkBuilder.properties(properties.let(AssetManifestProperties.Companion::unwrap))
    }

    /**
     * The set of properties for this artifact (depends on type).
     *
     * Default: - no properties.
     *
     * @param properties The set of properties for this artifact (depends on type). 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("40a45ac470eed12f3e443fb7f2868afc6967438953a01513a2fb4a23fe9c8e26")
    override fun properties(properties: AssetManifestProperties.Builder.() -> Unit): Unit =
        properties(AssetManifestProperties(properties))

    /**
     * The set of properties for this artifact (depends on type).
     *
     * Default: - no properties.
     *
     * @param properties The set of properties for this artifact (depends on type). 
     */
    override fun properties(properties: TreeArtifactProperties) {
      cdkBuilder.properties(properties.let(TreeArtifactProperties.Companion::unwrap))
    }

    /**
     * The set of properties for this artifact (depends on type).
     *
     * Default: - no properties.
     *
     * @param properties The set of properties for this artifact (depends on type). 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e00b4323f20df3ee3c1016a6c4db2d554f32940c32c7d868c5b8b8cdc9a687ac")
    override fun properties(properties: TreeArtifactProperties.Builder.() -> Unit): Unit =
        properties(TreeArtifactProperties(properties))

    /**
     * The set of properties for this artifact (depends on type).
     *
     * Default: - no properties.
     *
     * @param properties The set of properties for this artifact (depends on type). 
     */
    override fun properties(properties: NestedCloudAssemblyProperties) {
      cdkBuilder.properties(properties.let(NestedCloudAssemblyProperties.Companion::unwrap))
    }

    /**
     * The set of properties for this artifact (depends on type).
     *
     * Default: - no properties.
     *
     * @param properties The set of properties for this artifact (depends on type). 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d1d33e161dae163efe28cc346b9703ca30c8fa6011309bab510a2794427a25f3")
    override fun properties(properties: NestedCloudAssemblyProperties.Builder.() -> Unit): Unit =
        properties(NestedCloudAssemblyProperties(properties))

    /**
     * The type of artifact.
     *
     * @param type The type of artifact. 
     */
    override fun type(type: ArtifactType) {
      cdkBuilder.type(type.let(ArtifactType.Companion::unwrap))
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
        software.amazon.awscdk.cxapi.AssetManifestArtifact = wrapped.cdkObject as
        software.amazon.awscdk.cxapi.AssetManifestArtifact
  }
}
