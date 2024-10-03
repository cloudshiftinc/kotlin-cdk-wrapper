@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.cxapi

import io.cloudshiftdev.awscdk.cloud_assembly_schema.ArtifactManifest
import io.cloudshiftdev.awscdk.cloud_assembly_schema.ArtifactType
import io.cloudshiftdev.awscdk.cloud_assembly_schema.AssetManifestProperties
import io.cloudshiftdev.awscdk.cloud_assembly_schema.AwsCloudFormationStackProperties
import io.cloudshiftdev.awscdk.cloud_assembly_schema.BootstrapRole
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
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.cloud_assembly_schema.*;
 * import io.cloudshiftdev.awscdk.cxapi.*;
 * Object assumeRoleAdditionalOptions;
 * CloudAssembly cloudAssembly;
 * CloudFormationStackArtifact cloudFormationStackArtifact =
 * CloudFormationStackArtifact.Builder.create(cloudAssembly, "artifactId")
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
public open class CloudFormationStackArtifact(
  cdkObject: software.amazon.awscdk.cxapi.CloudFormationStackArtifact,
) : CloudArtifact(cdkObject) {
  public constructor(
    assembly: CloudAssembly,
    artifactId: String,
    artifact: ArtifactManifest,
  ) :
      this(software.amazon.awscdk.cxapi.CloudFormationStackArtifact(assembly.let(CloudAssembly.Companion::unwrap),
      artifactId, artifact.let(ArtifactManifest.Companion::unwrap))
  )

  public constructor(
    assembly: CloudAssembly,
    artifactId: String,
    artifact: ArtifactManifest.Builder.() -> Unit,
  ) : this(assembly, artifactId, ArtifactManifest(artifact)
  )

  /**
   * Any assets associated with this stack.
   */
  public open fun assets(): List<Any> = unwrap(this).getAssets()

  /**
   * Additional options to pass to STS when assuming the role for cloudformation deployments.
   *
   * * `RoleArn` should not be used. Use the dedicated `assumeRoleArn` property instead.
   * * `ExternalId` should not be used. Use the dedicated `assumeRoleExternalId` instead.
   * * `TransitiveTagKeys` defaults to use all keys (if any) specified in `Tags`. E.g, all tags are
   * transitive by default.
   *
   * Default: - No additional options.
   *
   * [Documentation](https://docs.aws.amazon.com/AWSJavaScriptSDK/latest/AWS/STS.html#assumeRole-property)
   */
  public open fun assumeRoleAdditionalOptions(): Map<String, Any> =
      unwrap(this).getAssumeRoleAdditionalOptions() ?: emptyMap()

  /**
   * The role that needs to be assumed to deploy the stack.
   *
   * Default: - No role is assumed (current credentials are used)
   */
  public open fun assumeRoleArn(): String? = unwrap(this).getAssumeRoleArn()

  /**
   * External ID to use when assuming role for cloudformation deployments.
   *
   * Default: - No external ID
   */
  public open fun assumeRoleExternalId(): String? = unwrap(this).getAssumeRoleExternalId()

  /**
   * Name of SSM parameter with bootstrap stack version.
   *
   * Default: - Discover SSM parameter by reading stack
   */
  public open fun bootstrapStackVersionSsmParameter(): String? =
      unwrap(this).getBootstrapStackVersionSsmParameter()

  /**
   * The role that is passed to CloudFormation to execute the change set.
   *
   * Default: - No role is passed (currently assumed role/credentials are used)
   */
  public open fun cloudFormationExecutionRoleArn(): String? =
      unwrap(this).getCloudFormationExecutionRoleArn()

  /**
   * A string that represents this stack.
   *
   * Should only be used in user
   * interfaces. If the stackName has not been set explicitly, or has been set
   * to artifactId, it will return the hierarchicalId of the stack. Otherwise,
   * it will return something like "<hierarchicalId> (<stackName>)"
   */
  public open fun displayName(): String = unwrap(this).getDisplayName()

  /**
   * The environment into which to deploy this artifact.
   */
  public open fun environment(): Environment = unwrap(this).getEnvironment().let(Environment::wrap)

  /**
   * The role to use to look up values from the target AWS account.
   *
   * Default: - No role is assumed (current credentials are used)
   */
  public open fun lookupRole(): BootstrapRole? =
      unwrap(this).getLookupRole()?.let(BootstrapRole::wrap)

  /**
   * SNS Topics that will receive stack events.
   */
  public open fun notificationArns(): List<String> = unwrap(this).getNotificationArns()

  /**
   * The original name as defined in the CDK app.
   */
  public open fun originalName(): String = unwrap(this).getOriginalName()

  /**
   * CloudFormation parameters to pass to the stack.
   */
  public open fun parameters(): Map<String, String> = unwrap(this).getParameters() ?: emptyMap()

  /**
   * Version of bootstrap stack required to deploy this stack.
   *
   * Default: - No bootstrap stack required
   */
  public open fun requiresBootstrapStackVersion(): Number? =
      unwrap(this).getRequiresBootstrapStackVersion()

  /**
   * The physical name of this stack.
   */
  public open fun stackName(): String = unwrap(this).getStackName()

  /**
   * If the stack template has already been included in the asset manifest, its asset URL.
   *
   * Default: - Not uploaded yet, upload just before deploying
   */
  public open fun stackTemplateAssetObjectUrl(): String? =
      unwrap(this).getStackTemplateAssetObjectUrl()

  /**
   * CloudFormation tags to pass to the stack.
   */
  public open fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

  /**
   * The CloudFormation template for this stack.
   */
  public open fun template(): Any = unwrap(this).getTemplate()

  /**
   * The file name of the template.
   */
  public open fun templateFile(): String = unwrap(this).getTemplateFile()

  /**
   * Full path to the template file.
   */
  public open fun templateFullPath(): String = unwrap(this).getTemplateFullPath()

  /**
   * Whether termination protection is enabled for this stack.
   */
  public open fun terminationProtection(): Boolean? = unwrap(this).getTerminationProtection()

  /**
   * Whether this stack should be validated by the CLI after synthesis.
   *
   * Default: - false
   */
  public open fun validateOnSynth(): Boolean? = unwrap(this).getValidateOnSynth()

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.cxapi.CloudFormationStackArtifact].
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
    @JvmName("45668b78dd17d0d02d89a60d7900618194636c10ae8549db1ef35cfd1387bef1")
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
    @JvmName("16df0c1131af55e38f3d796a61ddea4c3d2a04e6d0f360eab76de7f6fc168e28")
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
    @JvmName("c00aab7d9166672337d0759741b6805f50a4f8de3a7b9d189ec90917d0787514")
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
    @JvmName("17690bc98599dbd5f614c995d01a5abb6ff3c5baee413feb04295d604dcf684c")
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
    artifactId: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.cxapi.CloudFormationStackArtifact.Builder =
        software.amazon.awscdk.cxapi.CloudFormationStackArtifact.Builder.create(assembly,
        artifactId)

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
    @JvmName("45668b78dd17d0d02d89a60d7900618194636c10ae8549db1ef35cfd1387bef1")
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
    @JvmName("16df0c1131af55e38f3d796a61ddea4c3d2a04e6d0f360eab76de7f6fc168e28")
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
    @JvmName("c00aab7d9166672337d0759741b6805f50a4f8de3a7b9d189ec90917d0787514")
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
    @JvmName("17690bc98599dbd5f614c995d01a5abb6ff3c5baee413feb04295d604dcf684c")
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

    public fun build(): software.amazon.awscdk.cxapi.CloudFormationStackArtifact =
        cdkBuilder.build()
  }

  public companion object {
    public fun isCloudFormationStackArtifact(art: Any): Boolean =
        software.amazon.awscdk.cxapi.CloudFormationStackArtifact.isCloudFormationStackArtifact(art)

    public operator fun invoke(
      assembly: CloudAssembly,
      artifactId: String,
      block: Builder.() -> Unit = {},
    ): CloudFormationStackArtifact {
      val builderImpl = BuilderImpl(CloudAssembly.unwrap(assembly), artifactId)
      return CloudFormationStackArtifact(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.cxapi.CloudFormationStackArtifact):
        CloudFormationStackArtifact = CloudFormationStackArtifact(cdkObject)

    internal fun unwrap(wrapped: CloudFormationStackArtifact):
        software.amazon.awscdk.cxapi.CloudFormationStackArtifact = wrapped.cdkObject as
        software.amazon.awscdk.cxapi.CloudFormationStackArtifact
  }
}
