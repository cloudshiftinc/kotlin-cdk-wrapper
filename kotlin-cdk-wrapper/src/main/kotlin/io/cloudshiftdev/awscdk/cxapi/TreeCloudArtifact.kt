@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.cxapi

import io.cloudshiftdev.awscdk.cloud_assembly_schema.ArtifactManifest
import io.cloudshiftdev.awscdk.cloud_assembly_schema.ArtifactType
import io.cloudshiftdev.awscdk.cloud_assembly_schema.AssetManifestProperties
import io.cloudshiftdev.awscdk.cloud_assembly_schema.AwsCloudFormationStackProperties
import io.cloudshiftdev.awscdk.cloud_assembly_schema.FeatureFlagReportProperties
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
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.cloud_assembly_schema.*;
 * import io.cloudshiftdev.awscdk.cxapi.*;
 * Object assumeRoleAdditionalOptions;
 * CloudAssembly cloudAssembly;
 * TreeCloudArtifact treeCloudArtifact = TreeCloudArtifact.Builder.create(cloudAssembly, "name")
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
public open class TreeCloudArtifact(
  cdkObject: software.amazon.awscdk.cxapi.TreeCloudArtifact,
) : CloudArtifact(cdkObject) {
  public constructor(
    assembly: CloudAssembly,
    name: String,
    artifact: ArtifactManifest,
  ) :
      this(software.amazon.awscdk.cxapi.TreeCloudArtifact(assembly.let(CloudAssembly.Companion::unwrap),
      name, artifact.let(ArtifactManifest.Companion::unwrap))
  )

  public constructor(
    assembly: CloudAssembly,
    name: String,
    artifact: ArtifactManifest.Builder.() -> Unit,
  ) : this(assembly, name, ArtifactManifest(artifact)
  )

  /**
   *
   */
  public open fun `file`(): String = unwrap(this).getFile()

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.cxapi.TreeCloudArtifact].
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
     * A string that can be shown to a user to uniquely identify this artifact inside a cloud
     * assembly tree.
     *
     * Is used by the CLI to present a list of stacks to the user in a way that
     * makes sense to them. Even though the property name "display name" doesn't
     * imply it, this field is used to select stacks as well, so all stacks should
     * have a unique display name.
     *
     * Default: - no display name
     *
     * @param displayName A string that can be shown to a user to uniquely identify this artifact
     * inside a cloud assembly tree. 
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
    @JvmName("a38744c51f346654a9344b79695ff0f38058aa7cfb0aea0f91d731c1dc9b83a5")
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
    @JvmName("d3955b7003390a9bb086a623a4224dd3bc8f86c16e94bd75c2076acaa2807601")
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
    @JvmName("df764ab25290810489efce684f0ddb272ce0475b3757f0c6317c356ab08c41a4")
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
    @JvmName("53343a9d06d88beb6a6e4012abb5c192e8c650f05b9919c2c476dfc7b7ebd003")
    public fun properties(properties: NestedCloudAssemblyProperties.Builder.() -> Unit)

    /**
     * The set of properties for this artifact (depends on type).
     *
     * Default: - no properties.
     *
     * @param properties The set of properties for this artifact (depends on type). 
     */
    public fun properties(properties: FeatureFlagReportProperties)

    /**
     * The set of properties for this artifact (depends on type).
     *
     * Default: - no properties.
     *
     * @param properties The set of properties for this artifact (depends on type). 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b910680d4e64f24c722ec41c58bacbee586e7b1cd9a2a318063b25cde6a1a7a0")
    public fun properties(properties: FeatureFlagReportProperties.Builder.() -> Unit)

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
    private val cdkBuilder: software.amazon.awscdk.cxapi.TreeCloudArtifact.Builder =
        software.amazon.awscdk.cxapi.TreeCloudArtifact.Builder.create(assembly, name)

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
     * A string that can be shown to a user to uniquely identify this artifact inside a cloud
     * assembly tree.
     *
     * Is used by the CLI to present a list of stacks to the user in a way that
     * makes sense to them. Even though the property name "display name" doesn't
     * imply it, this field is used to select stacks as well, so all stacks should
     * have a unique display name.
     *
     * Default: - no display name
     *
     * @param displayName A string that can be shown to a user to uniquely identify this artifact
     * inside a cloud assembly tree. 
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
    @JvmName("a38744c51f346654a9344b79695ff0f38058aa7cfb0aea0f91d731c1dc9b83a5")
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
    @JvmName("d3955b7003390a9bb086a623a4224dd3bc8f86c16e94bd75c2076acaa2807601")
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
    @JvmName("df764ab25290810489efce684f0ddb272ce0475b3757f0c6317c356ab08c41a4")
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
    @JvmName("53343a9d06d88beb6a6e4012abb5c192e8c650f05b9919c2c476dfc7b7ebd003")
    override fun properties(properties: NestedCloudAssemblyProperties.Builder.() -> Unit): Unit =
        properties(NestedCloudAssemblyProperties(properties))

    /**
     * The set of properties for this artifact (depends on type).
     *
     * Default: - no properties.
     *
     * @param properties The set of properties for this artifact (depends on type). 
     */
    override fun properties(properties: FeatureFlagReportProperties) {
      cdkBuilder.properties(properties.let(FeatureFlagReportProperties.Companion::unwrap))
    }

    /**
     * The set of properties for this artifact (depends on type).
     *
     * Default: - no properties.
     *
     * @param properties The set of properties for this artifact (depends on type). 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b910680d4e64f24c722ec41c58bacbee586e7b1cd9a2a318063b25cde6a1a7a0")
    override fun properties(properties: FeatureFlagReportProperties.Builder.() -> Unit): Unit =
        properties(FeatureFlagReportProperties(properties))

    /**
     * The type of artifact.
     *
     * @param type The type of artifact. 
     */
    override fun type(type: ArtifactType) {
      cdkBuilder.type(type.let(ArtifactType.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.cxapi.TreeCloudArtifact = cdkBuilder.build()
  }

  public companion object {
    public fun isTreeCloudArtifact(art: Any): Boolean =
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
        = wrapped.cdkObject as software.amazon.awscdk.cxapi.TreeCloudArtifact
  }
}
