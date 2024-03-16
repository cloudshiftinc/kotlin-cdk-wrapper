@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.cloudassembly.schema.BootstrapRole
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName

/**
 * Stack artifact options.
 *
 * A subset of `cxschema.AwsCloudFormationStackProperties` of optional settings that need to be
 * configurable by synthesizers, plus `additionalDependencies`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.*;
 * SynthesizeStackArtifactOptions synthesizeStackArtifactOptions =
 * SynthesizeStackArtifactOptions.builder()
 * .additionalDependencies(List.of("additionalDependencies"))
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
 * .stackTemplateAssetObjectUrl("stackTemplateAssetObjectUrl")
 * .build();
 * ```
 */
public interface SynthesizeStackArtifactOptions {
  /**
   * Identifiers of additional dependencies.
   *
   * Default: - No additional dependencies
   */
  public fun additionalDependencies(): List<String> = unwrap(this).getAdditionalDependencies() ?:
      emptyList()

  /**
   * The role that needs to be assumed to deploy the stack.
   *
   * Default: - No role is assumed (current credentials are used)
   */
  public fun assumeRoleArn(): String? = unwrap(this).getAssumeRoleArn()

  /**
   * The externalID to use with the assumeRoleArn.
   *
   * Default: - No externalID is used
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
   * Default: - None
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
   * If the stack template has already been included in the asset manifest, its asset URL.
   *
   * Default: - Not uploaded yet, upload just before deploying
   */
  public fun stackTemplateAssetObjectUrl(): String? = unwrap(this).getStackTemplateAssetObjectUrl()

  /**
   * A builder for [SynthesizeStackArtifactOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param additionalDependencies Identifiers of additional dependencies.
     */
    public fun additionalDependencies(additionalDependencies: List<String>)

    /**
     * @param additionalDependencies Identifiers of additional dependencies.
     */
    public fun additionalDependencies(vararg additionalDependencies: String)

    /**
     * @param assumeRoleArn The role that needs to be assumed to deploy the stack.
     */
    public fun assumeRoleArn(assumeRoleArn: String)

    /**
     * @param assumeRoleExternalId The externalID to use with the assumeRoleArn.
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
    @JvmName("667efbdaa99a63c73ad9441bf91996ead6c776da81567e995faf159be4f41f99")
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
     * @param stackTemplateAssetObjectUrl If the stack template has already been included in the
     * asset manifest, its asset URL.
     */
    public fun stackTemplateAssetObjectUrl(stackTemplateAssetObjectUrl: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.SynthesizeStackArtifactOptions.Builder =
        software.amazon.awscdk.SynthesizeStackArtifactOptions.builder()

    /**
     * @param additionalDependencies Identifiers of additional dependencies.
     */
    override fun additionalDependencies(additionalDependencies: List<String>) {
      cdkBuilder.additionalDependencies(additionalDependencies)
    }

    /**
     * @param additionalDependencies Identifiers of additional dependencies.
     */
    override fun additionalDependencies(vararg additionalDependencies: String): Unit =
        additionalDependencies(additionalDependencies.toList())

    /**
     * @param assumeRoleArn The role that needs to be assumed to deploy the stack.
     */
    override fun assumeRoleArn(assumeRoleArn: String) {
      cdkBuilder.assumeRoleArn(assumeRoleArn)
    }

    /**
     * @param assumeRoleExternalId The externalID to use with the assumeRoleArn.
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
    @JvmName("667efbdaa99a63c73ad9441bf91996ead6c776da81567e995faf159be4f41f99")
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
     * @param stackTemplateAssetObjectUrl If the stack template has already been included in the
     * asset manifest, its asset URL.
     */
    override fun stackTemplateAssetObjectUrl(stackTemplateAssetObjectUrl: String) {
      cdkBuilder.stackTemplateAssetObjectUrl(stackTemplateAssetObjectUrl)
    }

    public fun build(): software.amazon.awscdk.SynthesizeStackArtifactOptions = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.SynthesizeStackArtifactOptions,
  ) : CdkObject(cdkObject), SynthesizeStackArtifactOptions {
    /**
     * Identifiers of additional dependencies.
     *
     * Default: - No additional dependencies
     */
    override fun additionalDependencies(): List<String> = unwrap(this).getAdditionalDependencies()
        ?: emptyList()

    /**
     * The role that needs to be assumed to deploy the stack.
     *
     * Default: - No role is assumed (current credentials are used)
     */
    override fun assumeRoleArn(): String? = unwrap(this).getAssumeRoleArn()

    /**
     * The externalID to use with the assumeRoleArn.
     *
     * Default: - No externalID is used
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
     * Default: - None
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
     * If the stack template has already been included in the asset manifest, its asset URL.
     *
     * Default: - Not uploaded yet, upload just before deploying
     */
    override fun stackTemplateAssetObjectUrl(): String? =
        unwrap(this).getStackTemplateAssetObjectUrl()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): SynthesizeStackArtifactOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.SynthesizeStackArtifactOptions):
        SynthesizeStackArtifactOptions = CdkObjectWrappers.wrap(cdkObject) as
        SynthesizeStackArtifactOptions

    internal fun unwrap(wrapped: SynthesizeStackArtifactOptions):
        software.amazon.awscdk.SynthesizeStackArtifactOptions = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.SynthesizeStackArtifactOptions
  }
}
