@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.cxapi

import io.cloudshiftdev.awscdk.cloudassembly.schema.ArtifactManifest
import io.cloudshiftdev.awscdk.cloudassembly.schema.ArtifactType
import io.cloudshiftdev.awscdk.cloudassembly.schema.AssetManifestProperties
import io.cloudshiftdev.awscdk.cloudassembly.schema.AwsCloudFormationStackProperties
import io.cloudshiftdev.awscdk.cloudassembly.schema.BootstrapRole
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

/**
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.cloudassembly.schema.*;
 * import io.cloudshiftdev.awscdk.cxapi.*;
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
public open class CloudFormationStackArtifact internal constructor(
  internal override val cdkObject: software.amazon.awscdk.cxapi.CloudFormationStackArtifact,
) : CloudArtifact(cdkObject) {
  public constructor(
    assembly: CloudAssembly,
    artifactId: String,
    artifact: ArtifactManifest,
  ) :
      this(software.amazon.awscdk.cxapi.CloudFormationStackArtifact(assembly.let(CloudAssembly::unwrap),
      artifactId, artifact.let(ArtifactManifest::unwrap))
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
    @JvmName("92c205a9470ccdebd826cf4b31ac7003bef204a014ac9f284ba9ba1b499921e7")
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
    @JvmName("3dd6900b1f22ad585674a846e06f59419a9c370083cc0665c9791f83cad33009")
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
    @JvmName("9c66db8a93c609f04a50a253bb6a43f9131a9bb64ae18a714133ee19623bf2d9")
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
    @JvmName("89ceb4e9acb0af4e90262523f7c7c05de15be68a16458b25e519add9141b9d88")
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
      cdkBuilder.metadata(metadata.mapValues{it.value.map(MetadataEntry::unwrap) })
    }

    /**
     * The set of properties for this artifact (depends on type).
     *
     * Default: - no properties.
     *
     * @param properties The set of properties for this artifact (depends on type). 
     */
    override fun properties(properties: AwsCloudFormationStackProperties) {
      cdkBuilder.properties(properties.let(AwsCloudFormationStackProperties::unwrap))
    }

    /**
     * The set of properties for this artifact (depends on type).
     *
     * Default: - no properties.
     *
     * @param properties The set of properties for this artifact (depends on type). 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("92c205a9470ccdebd826cf4b31ac7003bef204a014ac9f284ba9ba1b499921e7")
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
      cdkBuilder.properties(properties.let(AssetManifestProperties::unwrap))
    }

    /**
     * The set of properties for this artifact (depends on type).
     *
     * Default: - no properties.
     *
     * @param properties The set of properties for this artifact (depends on type). 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3dd6900b1f22ad585674a846e06f59419a9c370083cc0665c9791f83cad33009")
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
      cdkBuilder.properties(properties.let(TreeArtifactProperties::unwrap))
    }

    /**
     * The set of properties for this artifact (depends on type).
     *
     * Default: - no properties.
     *
     * @param properties The set of properties for this artifact (depends on type). 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9c66db8a93c609f04a50a253bb6a43f9131a9bb64ae18a714133ee19623bf2d9")
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
      cdkBuilder.properties(properties.let(NestedCloudAssemblyProperties::unwrap))
    }

    /**
     * The set of properties for this artifact (depends on type).
     *
     * Default: - no properties.
     *
     * @param properties The set of properties for this artifact (depends on type). 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("89ceb4e9acb0af4e90262523f7c7c05de15be68a16458b25e519add9141b9d88")
    override fun properties(properties: NestedCloudAssemblyProperties.Builder.() -> Unit): Unit =
        properties(NestedCloudAssemblyProperties(properties))

    /**
     * The type of artifact.
     *
     * @param type The type of artifact. 
     */
    override fun type(type: ArtifactType) {
      cdkBuilder.type(type.let(ArtifactType::unwrap))
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
        software.amazon.awscdk.cxapi.CloudFormationStackArtifact = wrapped.cdkObject
  }
}
