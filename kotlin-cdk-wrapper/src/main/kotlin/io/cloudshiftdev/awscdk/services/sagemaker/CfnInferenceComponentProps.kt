@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.sagemaker

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnInferenceComponent`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.sagemaker.*;
 * CfnInferenceComponentProps cfnInferenceComponentProps = CfnInferenceComponentProps.builder()
 * .endpointName("endpointName")
 * .specification(InferenceComponentSpecificationProperty.builder()
 * .baseInferenceComponentName("baseInferenceComponentName")
 * .computeResourceRequirements(InferenceComponentComputeResourceRequirementsProperty.builder()
 * .maxMemoryRequiredInMb(123)
 * .minMemoryRequiredInMb(123)
 * .numberOfAcceleratorDevicesRequired(123)
 * .numberOfCpuCoresRequired(123)
 * .build())
 * .container(InferenceComponentContainerSpecificationProperty.builder()
 * .artifactUrl("artifactUrl")
 * .deployedImage(DeployedImageProperty.builder()
 * .resolutionTime("resolutionTime")
 * .resolvedImage("resolvedImage")
 * .specifiedImage("specifiedImage")
 * .build())
 * .environment(Map.of(
 * "environmentKey", "environment"))
 * .image("image")
 * .build())
 * .modelName("modelName")
 * .startupParameters(InferenceComponentStartupParametersProperty.builder()
 * .containerStartupHealthCheckTimeoutInSeconds(123)
 * .modelDataDownloadTimeoutInSeconds(123)
 * .build())
 * .build())
 * // the properties below are optional
 * .deploymentConfig(InferenceComponentDeploymentConfigProperty.builder()
 * .autoRollbackConfiguration(AutoRollbackConfigurationProperty.builder()
 * .alarms(List.of(AlarmProperty.builder()
 * .alarmName("alarmName")
 * .build()))
 * .build())
 * .rollingUpdatePolicy(InferenceComponentRollingUpdatePolicyProperty.builder()
 * .maximumBatchSize(InferenceComponentCapacitySizeProperty.builder()
 * .type("type")
 * .value(123)
 * .build())
 * .maximumExecutionTimeoutInSeconds(123)
 * .rollbackMaximumBatchSize(InferenceComponentCapacitySizeProperty.builder()
 * .type("type")
 * .value(123)
 * .build())
 * .waitIntervalInSeconds(123)
 * .build())
 * .build())
 * .endpointArn("endpointArn")
 * .inferenceComponentName("inferenceComponentName")
 * .runtimeConfig(InferenceComponentRuntimeConfigProperty.builder()
 * .copyCount(123)
 * .currentCopyCount(123)
 * .desiredCopyCount(123)
 * .build())
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .variantName("variantName")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-inferencecomponent.html)
 */
public interface CfnInferenceComponentProps {
  /**
   * The deployment configuration for an endpoint, which contains the desired deployment strategy
   * and rollback configurations.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-inferencecomponent.html#cfn-sagemaker-inferencecomponent-deploymentconfig)
   */
  public fun deploymentConfig(): Any? = unwrap(this).getDeploymentConfig()

  /**
   * The Amazon Resource Name (ARN) of the endpoint that hosts the inference component.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-inferencecomponent.html#cfn-sagemaker-inferencecomponent-endpointarn)
   */
  public fun endpointArn(): String? = unwrap(this).getEndpointArn()

  /**
   * The name of the endpoint that hosts the inference component.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-inferencecomponent.html#cfn-sagemaker-inferencecomponent-endpointname)
   */
  public fun endpointName(): String

  /**
   * The name of the inference component.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-inferencecomponent.html#cfn-sagemaker-inferencecomponent-inferencecomponentname)
   */
  public fun inferenceComponentName(): String? = unwrap(this).getInferenceComponentName()

  /**
   * The runtime config for the inference component.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-inferencecomponent.html#cfn-sagemaker-inferencecomponent-runtimeconfig)
   */
  public fun runtimeConfig(): Any? = unwrap(this).getRuntimeConfig()

  /**
   * The specification for the inference component.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-inferencecomponent.html#cfn-sagemaker-inferencecomponent-specification)
   */
  public fun specification(): Any

  /**
   * An array of tags to apply to the resource.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-inferencecomponent.html#cfn-sagemaker-inferencecomponent-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * The name of the production variant that hosts the inference component.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-inferencecomponent.html#cfn-sagemaker-inferencecomponent-variantname)
   */
  public fun variantName(): String? = unwrap(this).getVariantName()

  /**
   * A builder for [CfnInferenceComponentProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param deploymentConfig The deployment configuration for an endpoint, which contains the
     * desired deployment strategy and rollback configurations.
     */
    public fun deploymentConfig(deploymentConfig: IResolvable)

    /**
     * @param deploymentConfig The deployment configuration for an endpoint, which contains the
     * desired deployment strategy and rollback configurations.
     */
    public
        fun deploymentConfig(deploymentConfig: CfnInferenceComponent.InferenceComponentDeploymentConfigProperty)

    /**
     * @param deploymentConfig The deployment configuration for an endpoint, which contains the
     * desired deployment strategy and rollback configurations.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3346079ec595bc32a7ee2b680c9e788e73f2cfc11054488745dd291cab67b40e")
    public
        fun deploymentConfig(deploymentConfig: CfnInferenceComponent.InferenceComponentDeploymentConfigProperty.Builder.() -> Unit)

    /**
     * @param endpointArn The Amazon Resource Name (ARN) of the endpoint that hosts the inference
     * component.
     */
    public fun endpointArn(endpointArn: String)

    /**
     * @param endpointName The name of the endpoint that hosts the inference component. 
     */
    public fun endpointName(endpointName: String)

    /**
     * @param inferenceComponentName The name of the inference component.
     */
    public fun inferenceComponentName(inferenceComponentName: String)

    /**
     * @param runtimeConfig The runtime config for the inference component.
     */
    public fun runtimeConfig(runtimeConfig: IResolvable)

    /**
     * @param runtimeConfig The runtime config for the inference component.
     */
    public
        fun runtimeConfig(runtimeConfig: CfnInferenceComponent.InferenceComponentRuntimeConfigProperty)

    /**
     * @param runtimeConfig The runtime config for the inference component.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1fc0fc930e3310cfe254d100cd68219905cd2098aedcc54c0f79e6b49139b817")
    public
        fun runtimeConfig(runtimeConfig: CfnInferenceComponent.InferenceComponentRuntimeConfigProperty.Builder.() -> Unit)

    /**
     * @param specification The specification for the inference component. 
     */
    public fun specification(specification: IResolvable)

    /**
     * @param specification The specification for the inference component. 
     */
    public
        fun specification(specification: CfnInferenceComponent.InferenceComponentSpecificationProperty)

    /**
     * @param specification The specification for the inference component. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("114dd8f0d37348ae9a92721a3e086c335f9a0f0829e9dd4c1610e14c95c7e9bf")
    public
        fun specification(specification: CfnInferenceComponent.InferenceComponentSpecificationProperty.Builder.() -> Unit)

    /**
     * @param tags An array of tags to apply to the resource.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags An array of tags to apply to the resource.
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param variantName The name of the production variant that hosts the inference component.
     */
    public fun variantName(variantName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.sagemaker.CfnInferenceComponentProps.Builder =
        software.amazon.awscdk.services.sagemaker.CfnInferenceComponentProps.builder()

    /**
     * @param deploymentConfig The deployment configuration for an endpoint, which contains the
     * desired deployment strategy and rollback configurations.
     */
    override fun deploymentConfig(deploymentConfig: IResolvable) {
      cdkBuilder.deploymentConfig(deploymentConfig.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param deploymentConfig The deployment configuration for an endpoint, which contains the
     * desired deployment strategy and rollback configurations.
     */
    override
        fun deploymentConfig(deploymentConfig: CfnInferenceComponent.InferenceComponentDeploymentConfigProperty) {
      cdkBuilder.deploymentConfig(deploymentConfig.let(CfnInferenceComponent.InferenceComponentDeploymentConfigProperty.Companion::unwrap))
    }

    /**
     * @param deploymentConfig The deployment configuration for an endpoint, which contains the
     * desired deployment strategy and rollback configurations.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3346079ec595bc32a7ee2b680c9e788e73f2cfc11054488745dd291cab67b40e")
    override
        fun deploymentConfig(deploymentConfig: CfnInferenceComponent.InferenceComponentDeploymentConfigProperty.Builder.() -> Unit):
        Unit =
        deploymentConfig(CfnInferenceComponent.InferenceComponentDeploymentConfigProperty(deploymentConfig))

    /**
     * @param endpointArn The Amazon Resource Name (ARN) of the endpoint that hosts the inference
     * component.
     */
    override fun endpointArn(endpointArn: String) {
      cdkBuilder.endpointArn(endpointArn)
    }

    /**
     * @param endpointName The name of the endpoint that hosts the inference component. 
     */
    override fun endpointName(endpointName: String) {
      cdkBuilder.endpointName(endpointName)
    }

    /**
     * @param inferenceComponentName The name of the inference component.
     */
    override fun inferenceComponentName(inferenceComponentName: String) {
      cdkBuilder.inferenceComponentName(inferenceComponentName)
    }

    /**
     * @param runtimeConfig The runtime config for the inference component.
     */
    override fun runtimeConfig(runtimeConfig: IResolvable) {
      cdkBuilder.runtimeConfig(runtimeConfig.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param runtimeConfig The runtime config for the inference component.
     */
    override
        fun runtimeConfig(runtimeConfig: CfnInferenceComponent.InferenceComponentRuntimeConfigProperty) {
      cdkBuilder.runtimeConfig(runtimeConfig.let(CfnInferenceComponent.InferenceComponentRuntimeConfigProperty.Companion::unwrap))
    }

    /**
     * @param runtimeConfig The runtime config for the inference component.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1fc0fc930e3310cfe254d100cd68219905cd2098aedcc54c0f79e6b49139b817")
    override
        fun runtimeConfig(runtimeConfig: CfnInferenceComponent.InferenceComponentRuntimeConfigProperty.Builder.() -> Unit):
        Unit =
        runtimeConfig(CfnInferenceComponent.InferenceComponentRuntimeConfigProperty(runtimeConfig))

    /**
     * @param specification The specification for the inference component. 
     */
    override fun specification(specification: IResolvable) {
      cdkBuilder.specification(specification.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param specification The specification for the inference component. 
     */
    override
        fun specification(specification: CfnInferenceComponent.InferenceComponentSpecificationProperty) {
      cdkBuilder.specification(specification.let(CfnInferenceComponent.InferenceComponentSpecificationProperty.Companion::unwrap))
    }

    /**
     * @param specification The specification for the inference component. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("114dd8f0d37348ae9a92721a3e086c335f9a0f0829e9dd4c1610e14c95c7e9bf")
    override
        fun specification(specification: CfnInferenceComponent.InferenceComponentSpecificationProperty.Builder.() -> Unit):
        Unit =
        specification(CfnInferenceComponent.InferenceComponentSpecificationProperty(specification))

    /**
     * @param tags An array of tags to apply to the resource.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags An array of tags to apply to the resource.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param variantName The name of the production variant that hosts the inference component.
     */
    override fun variantName(variantName: String) {
      cdkBuilder.variantName(variantName)
    }

    public fun build(): software.amazon.awscdk.services.sagemaker.CfnInferenceComponentProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.sagemaker.CfnInferenceComponentProps,
  ) : CdkObject(cdkObject),
      CfnInferenceComponentProps {
    /**
     * The deployment configuration for an endpoint, which contains the desired deployment strategy
     * and rollback configurations.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-inferencecomponent.html#cfn-sagemaker-inferencecomponent-deploymentconfig)
     */
    override fun deploymentConfig(): Any? = unwrap(this).getDeploymentConfig()

    /**
     * The Amazon Resource Name (ARN) of the endpoint that hosts the inference component.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-inferencecomponent.html#cfn-sagemaker-inferencecomponent-endpointarn)
     */
    override fun endpointArn(): String? = unwrap(this).getEndpointArn()

    /**
     * The name of the endpoint that hosts the inference component.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-inferencecomponent.html#cfn-sagemaker-inferencecomponent-endpointname)
     */
    override fun endpointName(): String = unwrap(this).getEndpointName()

    /**
     * The name of the inference component.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-inferencecomponent.html#cfn-sagemaker-inferencecomponent-inferencecomponentname)
     */
    override fun inferenceComponentName(): String? = unwrap(this).getInferenceComponentName()

    /**
     * The runtime config for the inference component.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-inferencecomponent.html#cfn-sagemaker-inferencecomponent-runtimeconfig)
     */
    override fun runtimeConfig(): Any? = unwrap(this).getRuntimeConfig()

    /**
     * The specification for the inference component.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-inferencecomponent.html#cfn-sagemaker-inferencecomponent-specification)
     */
    override fun specification(): Any = unwrap(this).getSpecification()

    /**
     * An array of tags to apply to the resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-inferencecomponent.html#cfn-sagemaker-inferencecomponent-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * The name of the production variant that hosts the inference component.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-inferencecomponent.html#cfn-sagemaker-inferencecomponent-variantname)
     */
    override fun variantName(): String? = unwrap(this).getVariantName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnInferenceComponentProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnInferenceComponentProps):
        CfnInferenceComponentProps = CdkObjectWrappers.wrap(cdkObject) as?
        CfnInferenceComponentProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnInferenceComponentProps):
        software.amazon.awscdk.services.sagemaker.CfnInferenceComponentProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.sagemaker.CfnInferenceComponentProps
  }
}
