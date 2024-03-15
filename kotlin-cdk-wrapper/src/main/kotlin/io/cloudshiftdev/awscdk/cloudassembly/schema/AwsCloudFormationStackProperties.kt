@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.cloudassembly.schema

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import kotlin.jvm.JvmName

/**
 * Artifact properties for CloudFormation stacks.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.cloudassembly.schema.*;
 * AwsCloudFormationStackProperties awsCloudFormationStackProperties =
 * AwsCloudFormationStackProperties.builder()
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
 * .build();
 * ```
 */
public interface AwsCloudFormationStackProperties {
  /**
   * The role that needs to be assumed to deploy the stack.
   *
   * Default: - No role is assumed (current credentials are used)
   */
  public fun assumeRoleArn(): String? = unwrap(this).getAssumeRoleArn()

  /**
   * External ID to use when assuming role for cloudformation deployments.
   *
   * Default: - No external ID
   */
  public fun assumeRoleExternalId(): String? = unwrap(this).getAssumeRoleExternalId()

  /**
   * SSM parameter where the bootstrap stack version number can be found.
   *
   * Only used if `requiresBootstrapStackVersion` is set.
   *
   * * If this value is not set, the bootstrap stack name must be known at
   * deployment time so the stack version can be looked up from the stack
   * outputs.
   * * If this value is set, the bootstrap stack can have any name because
   * we won't need to look it up.
   *
   * Default: - Bootstrap stack version number looked up
   */
  public fun bootstrapStackVersionSsmParameter(): String? =
      unwrap(this).getBootstrapStackVersionSsmParameter()

  /**
   * The role that is passed to CloudFormation to execute the change set.
   *
   * Default: - No role is passed (currently assumed role/credentials are used)
   */
  public fun cloudFormationExecutionRoleArn(): String? =
      unwrap(this).getCloudFormationExecutionRoleArn()

  /**
   * The role to use to look up values from the target AWS account.
   *
   * Default: - No role is assumed (current credentials are used)
   */
  public fun lookupRole(): BootstrapRole? = unwrap(this).getLookupRole()?.let(BootstrapRole::wrap)

  /**
   * Values for CloudFormation stack parameters that should be passed when the stack is deployed.
   *
   * Default: - No parameters
   */
  public fun parameters(): Map<String, String> = unwrap(this).getParameters() ?: emptyMap()

  /**
   * Version of bootstrap stack required to deploy this stack.
   *
   * Default: - No bootstrap stack required
   */
  public fun requiresBootstrapStackVersion(): Number? =
      unwrap(this).getRequiresBootstrapStackVersion()

  /**
   * The name to use for the CloudFormation stack.
   *
   * Default: - name derived from artifact ID
   */
  public fun stackName(): String? = unwrap(this).getStackName()

  /**
   * If the stack template has already been included in the asset manifest, its asset URL.
   *
   * Default: - Not uploaded yet, upload just before deploying
   */
  public fun stackTemplateAssetObjectUrl(): String? = unwrap(this).getStackTemplateAssetObjectUrl()

  /**
   * Values for CloudFormation stack tags that should be passed when the stack is deployed.
   *
   * Default: - No tags
   */
  public fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

  /**
   * A file relative to the assembly root which contains the CloudFormation template for this stack.
   */
  public fun templateFile(): String

  /**
   * Whether to enable termination protection for this stack.
   *
   * Default: false
   */
  public fun terminationProtection(): Boolean? = unwrap(this).getTerminationProtection()

  /**
   * Whether this stack should be validated by the CLI after synthesis.
   *
   * Default: - false
   */
  public fun validateOnSynth(): Boolean? = unwrap(this).getValidateOnSynth()

  /**
   * A builder for [AwsCloudFormationStackProperties]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param assumeRoleArn The role that needs to be assumed to deploy the stack.
     */
    public fun assumeRoleArn(assumeRoleArn: String)

    /**
     * @param assumeRoleExternalId External ID to use when assuming role for cloudformation
     * deployments.
     */
    public fun assumeRoleExternalId(assumeRoleExternalId: String)

    /**
     * @param bootstrapStackVersionSsmParameter SSM parameter where the bootstrap stack version
     * number can be found.
     * Only used if `requiresBootstrapStackVersion` is set.
     *
     * * If this value is not set, the bootstrap stack name must be known at
     * deployment time so the stack version can be looked up from the stack
     * outputs.
     * * If this value is set, the bootstrap stack can have any name because
     * we won't need to look it up.
     */
    public fun bootstrapStackVersionSsmParameter(bootstrapStackVersionSsmParameter: String)

    /**
     * @param cloudFormationExecutionRoleArn The role that is passed to CloudFormation to execute
     * the change set.
     */
    public fun cloudFormationExecutionRoleArn(cloudFormationExecutionRoleArn: String)

    /**
     * @param lookupRole The role to use to look up values from the target AWS account.
     */
    public fun lookupRole(lookupRole: BootstrapRole)

    /**
     * @param lookupRole The role to use to look up values from the target AWS account.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("66cdfd634382a91730ba398609c925c72c2a679ff6839ff6fe17d526b3ed399a")
    public fun lookupRole(lookupRole: BootstrapRole.Builder.() -> Unit)

    /**
     * @param parameters Values for CloudFormation stack parameters that should be passed when the
     * stack is deployed.
     */
    public fun parameters(parameters: Map<String, String>)

    /**
     * @param requiresBootstrapStackVersion Version of bootstrap stack required to deploy this
     * stack.
     */
    public fun requiresBootstrapStackVersion(requiresBootstrapStackVersion: Number)

    /**
     * @param stackName The name to use for the CloudFormation stack.
     */
    public fun stackName(stackName: String)

    /**
     * @param stackTemplateAssetObjectUrl If the stack template has already been included in the
     * asset manifest, its asset URL.
     */
    public fun stackTemplateAssetObjectUrl(stackTemplateAssetObjectUrl: String)

    /**
     * @param tags Values for CloudFormation stack tags that should be passed when the stack is
     * deployed.
     */
    public fun tags(tags: Map<String, String>)

    /**
     * @param templateFile A file relative to the assembly root which contains the CloudFormation
     * template for this stack. 
     */
    public fun templateFile(templateFile: String)

    /**
     * @param terminationProtection Whether to enable termination protection for this stack.
     */
    public fun terminationProtection(terminationProtection: Boolean)

    /**
     * @param validateOnSynth Whether this stack should be validated by the CLI after synthesis.
     */
    public fun validateOnSynth(validateOnSynth: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.cloudassembly.schema.AwsCloudFormationStackProperties.Builder =
        software.amazon.awscdk.cloudassembly.schema.AwsCloudFormationStackProperties.builder()

    /**
     * @param assumeRoleArn The role that needs to be assumed to deploy the stack.
     */
    override fun assumeRoleArn(assumeRoleArn: String) {
      cdkBuilder.assumeRoleArn(assumeRoleArn)
    }

    /**
     * @param assumeRoleExternalId External ID to use when assuming role for cloudformation
     * deployments.
     */
    override fun assumeRoleExternalId(assumeRoleExternalId: String) {
      cdkBuilder.assumeRoleExternalId(assumeRoleExternalId)
    }

    /**
     * @param bootstrapStackVersionSsmParameter SSM parameter where the bootstrap stack version
     * number can be found.
     * Only used if `requiresBootstrapStackVersion` is set.
     *
     * * If this value is not set, the bootstrap stack name must be known at
     * deployment time so the stack version can be looked up from the stack
     * outputs.
     * * If this value is set, the bootstrap stack can have any name because
     * we won't need to look it up.
     */
    override fun bootstrapStackVersionSsmParameter(bootstrapStackVersionSsmParameter: String) {
      cdkBuilder.bootstrapStackVersionSsmParameter(bootstrapStackVersionSsmParameter)
    }

    /**
     * @param cloudFormationExecutionRoleArn The role that is passed to CloudFormation to execute
     * the change set.
     */
    override fun cloudFormationExecutionRoleArn(cloudFormationExecutionRoleArn: String) {
      cdkBuilder.cloudFormationExecutionRoleArn(cloudFormationExecutionRoleArn)
    }

    /**
     * @param lookupRole The role to use to look up values from the target AWS account.
     */
    override fun lookupRole(lookupRole: BootstrapRole) {
      cdkBuilder.lookupRole(lookupRole.let(BootstrapRole::unwrap))
    }

    /**
     * @param lookupRole The role to use to look up values from the target AWS account.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("66cdfd634382a91730ba398609c925c72c2a679ff6839ff6fe17d526b3ed399a")
    override fun lookupRole(lookupRole: BootstrapRole.Builder.() -> Unit): Unit =
        lookupRole(BootstrapRole(lookupRole))

    /**
     * @param parameters Values for CloudFormation stack parameters that should be passed when the
     * stack is deployed.
     */
    override fun parameters(parameters: Map<String, String>) {
      cdkBuilder.parameters(parameters)
    }

    /**
     * @param requiresBootstrapStackVersion Version of bootstrap stack required to deploy this
     * stack.
     */
    override fun requiresBootstrapStackVersion(requiresBootstrapStackVersion: Number) {
      cdkBuilder.requiresBootstrapStackVersion(requiresBootstrapStackVersion)
    }

    /**
     * @param stackName The name to use for the CloudFormation stack.
     */
    override fun stackName(stackName: String) {
      cdkBuilder.stackName(stackName)
    }

    /**
     * @param stackTemplateAssetObjectUrl If the stack template has already been included in the
     * asset manifest, its asset URL.
     */
    override fun stackTemplateAssetObjectUrl(stackTemplateAssetObjectUrl: String) {
      cdkBuilder.stackTemplateAssetObjectUrl(stackTemplateAssetObjectUrl)
    }

    /**
     * @param tags Values for CloudFormation stack tags that should be passed when the stack is
     * deployed.
     */
    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    /**
     * @param templateFile A file relative to the assembly root which contains the CloudFormation
     * template for this stack. 
     */
    override fun templateFile(templateFile: String) {
      cdkBuilder.templateFile(templateFile)
    }

    /**
     * @param terminationProtection Whether to enable termination protection for this stack.
     */
    override fun terminationProtection(terminationProtection: Boolean) {
      cdkBuilder.terminationProtection(terminationProtection)
    }

    /**
     * @param validateOnSynth Whether this stack should be validated by the CLI after synthesis.
     */
    override fun validateOnSynth(validateOnSynth: Boolean) {
      cdkBuilder.validateOnSynth(validateOnSynth)
    }

    public fun build(): software.amazon.awscdk.cloudassembly.schema.AwsCloudFormationStackProperties
        = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.cloudassembly.schema.AwsCloudFormationStackProperties,
  ) : CdkObject(cdkObject), AwsCloudFormationStackProperties {
    /**
     * The role that needs to be assumed to deploy the stack.
     *
     * Default: - No role is assumed (current credentials are used)
     */
    override fun assumeRoleArn(): String? = unwrap(this).getAssumeRoleArn()

    /**
     * External ID to use when assuming role for cloudformation deployments.
     *
     * Default: - No external ID
     */
    override fun assumeRoleExternalId(): String? = unwrap(this).getAssumeRoleExternalId()

    /**
     * SSM parameter where the bootstrap stack version number can be found.
     *
     * Only used if `requiresBootstrapStackVersion` is set.
     *
     * * If this value is not set, the bootstrap stack name must be known at
     * deployment time so the stack version can be looked up from the stack
     * outputs.
     * * If this value is set, the bootstrap stack can have any name because
     * we won't need to look it up.
     *
     * Default: - Bootstrap stack version number looked up
     */
    override fun bootstrapStackVersionSsmParameter(): String? =
        unwrap(this).getBootstrapStackVersionSsmParameter()

    /**
     * The role that is passed to CloudFormation to execute the change set.
     *
     * Default: - No role is passed (currently assumed role/credentials are used)
     */
    override fun cloudFormationExecutionRoleArn(): String? =
        unwrap(this).getCloudFormationExecutionRoleArn()

    /**
     * The role to use to look up values from the target AWS account.
     *
     * Default: - No role is assumed (current credentials are used)
     */
    override fun lookupRole(): BootstrapRole? =
        unwrap(this).getLookupRole()?.let(BootstrapRole::wrap)

    /**
     * Values for CloudFormation stack parameters that should be passed when the stack is deployed.
     *
     * Default: - No parameters
     */
    override fun parameters(): Map<String, String> = unwrap(this).getParameters() ?: emptyMap()

    /**
     * Version of bootstrap stack required to deploy this stack.
     *
     * Default: - No bootstrap stack required
     */
    override fun requiresBootstrapStackVersion(): Number? =
        unwrap(this).getRequiresBootstrapStackVersion()

    /**
     * The name to use for the CloudFormation stack.
     *
     * Default: - name derived from artifact ID
     */
    override fun stackName(): String? = unwrap(this).getStackName()

    /**
     * If the stack template has already been included in the asset manifest, its asset URL.
     *
     * Default: - Not uploaded yet, upload just before deploying
     */
    override fun stackTemplateAssetObjectUrl(): String? =
        unwrap(this).getStackTemplateAssetObjectUrl()

    /**
     * Values for CloudFormation stack tags that should be passed when the stack is deployed.
     *
     * Default: - No tags
     */
    override fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

    /**
     * A file relative to the assembly root which contains the CloudFormation template for this
     * stack.
     */
    override fun templateFile(): String = unwrap(this).getTemplateFile()

    /**
     * Whether to enable termination protection for this stack.
     *
     * Default: false
     */
    override fun terminationProtection(): Boolean? = unwrap(this).getTerminationProtection()

    /**
     * Whether this stack should be validated by the CLI after synthesis.
     *
     * Default: - false
     */
    override fun validateOnSynth(): Boolean? = unwrap(this).getValidateOnSynth()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): AwsCloudFormationStackProperties {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.cloudassembly.schema.AwsCloudFormationStackProperties):
        AwsCloudFormationStackProperties = Wrapper(cdkObject)

    internal fun unwrap(wrapped: AwsCloudFormationStackProperties):
        software.amazon.awscdk.cloudassembly.schema.AwsCloudFormationStackProperties = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.cloudassembly.schema.AwsCloudFormationStackProperties
  }
}
