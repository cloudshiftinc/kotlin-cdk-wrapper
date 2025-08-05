@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.cloud_assembly_schema

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
 * import io.cloudshiftdev.awscdk.cloud_assembly_schema.*;
 * Object assumeRoleAdditionalOptions;
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
public interface ArtifactManifest {
  /**
   * IDs of artifacts that must be deployed before this artifact.
   *
   * Default: - no dependencies.
   */
  public fun dependencies(): List<String> = unwrap(this).getDependencies() ?: emptyList()

  /**
   * A string that can be shown to a user to uniquely identify this artifact inside a cloud assembly
   * tree.
   *
   * Is used by the CLI to present a list of stacks to the user in a way that
   * makes sense to them. Even though the property name "display name" doesn't
   * imply it, this field is used to select stacks as well, so all stacks should
   * have a unique display name.
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
     * @param displayName A string that can be shown to a user to uniquely identify this artifact
     * inside a cloud assembly tree.
     * Is used by the CLI to present a list of stacks to the user in a way that
     * makes sense to them. Even though the property name "display name" doesn't
     * imply it, this field is used to select stacks as well, so all stacks should
     * have a unique display name.
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
    @JvmName("ed404207fdc460ad93a24545ce632fd4e4a130f62f6a4bc59529feefb6f9c1e9")
    public fun properties(properties: AwsCloudFormationStackProperties.Builder.() -> Unit)

    /**
     * @param properties The set of properties for this artifact (depends on type).
     */
    public fun properties(properties: AssetManifestProperties)

    /**
     * @param properties The set of properties for this artifact (depends on type).
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7a50fe841a72098ff0a20fbb7125ce769683bcb17fad2881086cfc1feaa2f688")
    public fun properties(properties: AssetManifestProperties.Builder.() -> Unit)

    /**
     * @param properties The set of properties for this artifact (depends on type).
     */
    public fun properties(properties: TreeArtifactProperties)

    /**
     * @param properties The set of properties for this artifact (depends on type).
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b05b7342a6267e2ba0f47709dba8d016ecea0cade7ad7c978c2a2209bda1e0e3")
    public fun properties(properties: TreeArtifactProperties.Builder.() -> Unit)

    /**
     * @param properties The set of properties for this artifact (depends on type).
     */
    public fun properties(properties: NestedCloudAssemblyProperties)

    /**
     * @param properties The set of properties for this artifact (depends on type).
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f26aac055fecdd3be39f5e3e62c162a410c6ce5a9eaa4b3e377c5b6980b564e2")
    public fun properties(properties: NestedCloudAssemblyProperties.Builder.() -> Unit)

    /**
     * @param properties The set of properties for this artifact (depends on type).
     */
    public fun properties(properties: FeatureFlagReportProperties)

    /**
     * @param properties The set of properties for this artifact (depends on type).
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d5a503714154ec49b707db78453e065bdf2692443f4e7c9ae4d84be50f67c96b")
    public fun properties(properties: FeatureFlagReportProperties.Builder.() -> Unit)

    /**
     * @param type The type of artifact. 
     */
    public fun type(type: ArtifactType)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.cloud_assembly_schema.ArtifactManifest.Builder =
        software.amazon.awscdk.cloud_assembly_schema.ArtifactManifest.builder()

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
     * @param displayName A string that can be shown to a user to uniquely identify this artifact
     * inside a cloud assembly tree.
     * Is used by the CLI to present a list of stacks to the user in a way that
     * makes sense to them. Even though the property name "display name" doesn't
     * imply it, this field is used to select stacks as well, so all stacks should
     * have a unique display name.
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
    @JvmName("ed404207fdc460ad93a24545ce632fd4e4a130f62f6a4bc59529feefb6f9c1e9")
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
    @JvmName("7a50fe841a72098ff0a20fbb7125ce769683bcb17fad2881086cfc1feaa2f688")
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
    @JvmName("b05b7342a6267e2ba0f47709dba8d016ecea0cade7ad7c978c2a2209bda1e0e3")
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
    @JvmName("f26aac055fecdd3be39f5e3e62c162a410c6ce5a9eaa4b3e377c5b6980b564e2")
    override fun properties(properties: NestedCloudAssemblyProperties.Builder.() -> Unit): Unit =
        properties(NestedCloudAssemblyProperties(properties))

    /**
     * @param properties The set of properties for this artifact (depends on type).
     */
    override fun properties(properties: FeatureFlagReportProperties) {
      cdkBuilder.properties(properties.let(FeatureFlagReportProperties.Companion::unwrap))
    }

    /**
     * @param properties The set of properties for this artifact (depends on type).
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d5a503714154ec49b707db78453e065bdf2692443f4e7c9ae4d84be50f67c96b")
    override fun properties(properties: FeatureFlagReportProperties.Builder.() -> Unit): Unit =
        properties(FeatureFlagReportProperties(properties))

    /**
     * @param type The type of artifact. 
     */
    override fun type(type: ArtifactType) {
      cdkBuilder.type(type.let(ArtifactType.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.cloud_assembly_schema.ArtifactManifest =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.cloud_assembly_schema.ArtifactManifest,
  ) : CdkObject(cdkObject),
      ArtifactManifest {
    /**
     * IDs of artifacts that must be deployed before this artifact.
     *
     * Default: - no dependencies.
     */
    override fun dependencies(): List<String> = unwrap(this).getDependencies() ?: emptyList()

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

    internal fun wrap(cdkObject: software.amazon.awscdk.cloud_assembly_schema.ArtifactManifest):
        ArtifactManifest = CdkObjectWrappers.wrap(cdkObject) as? ArtifactManifest ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: ArtifactManifest):
        software.amazon.awscdk.cloud_assembly_schema.ArtifactManifest = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.cloud_assembly_schema.ArtifactManifest
  }
}
