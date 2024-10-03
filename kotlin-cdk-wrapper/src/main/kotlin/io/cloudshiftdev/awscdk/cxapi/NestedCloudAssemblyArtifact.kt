@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.cxapi

import io.cloudshiftdev.awscdk.cloud_assembly_schema.ArtifactManifest
import io.cloudshiftdev.awscdk.cloud_assembly_schema.ArtifactType
import io.cloudshiftdev.awscdk.cloud_assembly_schema.AssetManifestProperties
import io.cloudshiftdev.awscdk.cloud_assembly_schema.AwsCloudFormationStackProperties
import io.cloudshiftdev.awscdk.cloud_assembly_schema.MetadataEntry
import io.cloudshiftdev.awscdk.cloud_assembly_schema.NestedCloudAssemblyProperties
import io.cloudshiftdev.awscdk.cloud_assembly_schema.TreeArtifactProperties
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
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
 * NestedCloudAssemblyArtifact nestedCloudAssemblyArtifact =
 * NestedCloudAssemblyArtifact.Builder.create(cloudAssembly, "name")
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
public open class NestedCloudAssemblyArtifact(
  cdkObject: software.amazon.awscdk.cxapi.NestedCloudAssemblyArtifact,
) : CloudArtifact(cdkObject) {
  public constructor(
    assembly: CloudAssembly,
    name: String,
    artifact: ArtifactManifest,
  ) :
      this(software.amazon.awscdk.cxapi.NestedCloudAssemblyArtifact(assembly.let(CloudAssembly.Companion::unwrap),
      name, artifact.let(ArtifactManifest.Companion::unwrap))
  )

  public constructor(
    assembly: CloudAssembly,
    name: String,
    artifact: ArtifactManifest.Builder.() -> Unit,
  ) : this(assembly, name, ArtifactManifest(artifact)
  )

  /**
   * The relative directory name of the asset manifest.
   */
  public open fun directoryName(): String = unwrap(this).getDirectoryName()

  /**
   * Display name.
   */
  public open fun displayName(): String = unwrap(this).getDisplayName()

  /**
   * Full path to the nested assembly directory.
   */
  public open fun fullPath(): String = unwrap(this).getFullPath()

  /**
   * The nested Assembly.
   */
  public open fun nestedAssembly(): CloudAssembly =
      unwrap(this).getNestedAssembly().let(CloudAssembly::wrap)

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.cxapi.NestedCloudAssemblyArtifact].
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
    @JvmName("e44f7afd2088b4b9dd84c8bfd40629f44dc01cdd51646d2a77a9f262678c6447")
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
    @JvmName("1f1c61536a05dbac2da96a497b18800d9a131415e9667caec7cd283b7426d814")
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
    @JvmName("670d3c9f19c2c72991a5317d40b701c8814361aa7f0291fae70b998ca5423998")
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
    @JvmName("a3e41b4ea4614eab80f28645b7d0d89d77c9fab840126bb4668c3ce4d651ac5b")
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
    private val cdkBuilder: software.amazon.awscdk.cxapi.NestedCloudAssemblyArtifact.Builder =
        software.amazon.awscdk.cxapi.NestedCloudAssemblyArtifact.Builder.create(assembly, name)

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
    @JvmName("e44f7afd2088b4b9dd84c8bfd40629f44dc01cdd51646d2a77a9f262678c6447")
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
    @JvmName("1f1c61536a05dbac2da96a497b18800d9a131415e9667caec7cd283b7426d814")
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
    @JvmName("670d3c9f19c2c72991a5317d40b701c8814361aa7f0291fae70b998ca5423998")
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
    @JvmName("a3e41b4ea4614eab80f28645b7d0d89d77c9fab840126bb4668c3ce4d651ac5b")
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

    public fun build(): software.amazon.awscdk.cxapi.NestedCloudAssemblyArtifact =
        cdkBuilder.build()
  }

  public companion object {
    public fun isNestedCloudAssemblyArtifact(art: Any): Boolean =
        software.amazon.awscdk.cxapi.NestedCloudAssemblyArtifact.isNestedCloudAssemblyArtifact(art)

    public operator fun invoke(
      assembly: CloudAssembly,
      name: String,
      block: Builder.() -> Unit = {},
    ): NestedCloudAssemblyArtifact {
      val builderImpl = BuilderImpl(CloudAssembly.unwrap(assembly), name)
      return NestedCloudAssemblyArtifact(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.cxapi.NestedCloudAssemblyArtifact):
        NestedCloudAssemblyArtifact = NestedCloudAssemblyArtifact(cdkObject)

    internal fun unwrap(wrapped: NestedCloudAssemblyArtifact):
        software.amazon.awscdk.cxapi.NestedCloudAssemblyArtifact = wrapped.cdkObject as
        software.amazon.awscdk.cxapi.NestedCloudAssemblyArtifact
  }
}
