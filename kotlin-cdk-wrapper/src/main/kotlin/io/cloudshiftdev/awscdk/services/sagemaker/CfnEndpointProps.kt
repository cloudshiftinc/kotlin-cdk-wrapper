@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.sagemaker

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnEndpoint`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.sagemaker.*;
 * CfnEndpointProps cfnEndpointProps = CfnEndpointProps.builder()
 * .endpointConfigName("endpointConfigName")
 * // the properties below are optional
 * .deploymentConfig(DeploymentConfigProperty.builder()
 * .autoRollbackConfiguration(AutoRollbackConfigProperty.builder()
 * .alarms(List.of(AlarmProperty.builder()
 * .alarmName("alarmName")
 * .build()))
 * .build())
 * .blueGreenUpdatePolicy(BlueGreenUpdatePolicyProperty.builder()
 * .trafficRoutingConfiguration(TrafficRoutingConfigProperty.builder()
 * .type("type")
 * // the properties below are optional
 * .canarySize(CapacitySizeProperty.builder()
 * .type("type")
 * .value(123)
 * .build())
 * .linearStepSize(CapacitySizeProperty.builder()
 * .type("type")
 * .value(123)
 * .build())
 * .waitIntervalInSeconds(123)
 * .build())
 * // the properties below are optional
 * .maximumExecutionTimeoutInSeconds(123)
 * .terminationWaitInSeconds(123)
 * .build())
 * .rollingUpdatePolicy(RollingUpdatePolicyProperty.builder()
 * .maximumBatchSize(CapacitySizeProperty.builder()
 * .type("type")
 * .value(123)
 * .build())
 * .waitIntervalInSeconds(123)
 * // the properties below are optional
 * .maximumExecutionTimeoutInSeconds(123)
 * .rollbackMaximumBatchSize(CapacitySizeProperty.builder()
 * .type("type")
 * .value(123)
 * .build())
 * .build())
 * .build())
 * .endpointName("endpointName")
 * .excludeRetainedVariantProperties(List.of(VariantPropertyProperty.builder()
 * .variantPropertyType("variantPropertyType")
 * .build()))
 * .retainAllVariantProperties(false)
 * .retainDeploymentConfig(false)
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-endpoint.html)
 */
public interface CfnEndpointProps {
  /**
   * The deployment configuration for an endpoint, which contains the desired deployment strategy
   * and rollback configurations.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-endpoint.html#cfn-sagemaker-endpoint-deploymentconfig)
   */
  public fun deploymentConfig(): Any? = unwrap(this).getDeploymentConfig()

  /**
   * The name of the
   * [AWS::SageMaker::EndpointConfig](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-endpointconfig.html)
   * resource that specifies the configuration for the endpoint. For more information, see
   * [CreateEndpointConfig](https://docs.aws.amazon.com/sagemaker/latest/dg/API_CreateEndpointConfig.html)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-endpoint.html#cfn-sagemaker-endpoint-endpointconfigname)
   */
  public fun endpointConfigName(): String

  /**
   * The name of the endpoint.
   *
   * The name must be unique within an AWS Region in your AWS account. The name is case-insensitive
   * in `CreateEndpoint` , but the case is preserved and must be matched in
   * [](https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_runtime_InvokeEndpoint.html) .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-endpoint.html#cfn-sagemaker-endpoint-endpointname)
   */
  public fun endpointName(): String? = unwrap(this).getEndpointName()

  /**
   * When you are updating endpoint resources with
   * [RetainAllVariantProperties](https://docs.aws.amazon.com/sagemaker/latest/dg/API_UpdateEndpoint.html#SageMaker-UpdateEndpoint-request-RetainAllVariantProperties)
   * whose value is set to `true` , `ExcludeRetainedVariantProperties` specifies the list of type
   * [VariantProperty](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpoint-variantproperty.html)
   * to override with the values provided by `EndpointConfig` . If you don't specify a value for
   * `ExcludeAllVariantProperties` , no variant properties are overridden. Don't use this property when
   * creating new endpoint resources or when `RetainAllVariantProperties` is set to `false` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-endpoint.html#cfn-sagemaker-endpoint-excluderetainedvariantproperties)
   */
  public fun excludeRetainedVariantProperties(): Any? =
      unwrap(this).getExcludeRetainedVariantProperties()

  /**
   * When updating endpoint resources, enables or disables the retention of variant properties, such
   * as the instance count or the variant weight.
   *
   * To retain the variant properties of an endpoint when updating it, set
   * `RetainAllVariantProperties` to `true` . To use the variant properties specified in a new
   * `EndpointConfig` call when updating an endpoint, set `RetainAllVariantProperties` to `false` . Use
   * this property only when updating endpoint resources, not when creating new endpoint resources.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-endpoint.html#cfn-sagemaker-endpoint-retainallvariantproperties)
   */
  public fun retainAllVariantProperties(): Any? = unwrap(this).getRetainAllVariantProperties()

  /**
   * Specifies whether to reuse the last deployment configuration.
   *
   * The default value is false (the configuration is not reused).
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-endpoint.html#cfn-sagemaker-endpoint-retaindeploymentconfig)
   */
  public fun retainDeploymentConfig(): Any? = unwrap(this).getRetainDeploymentConfig()

  /**
   * A list of key-value pairs to apply to this resource.
   *
   * For more information, see [Resource
   * Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
   * and [Using Cost Allocation
   * Tags](https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html#allocation-what)
   * in the *AWS Billing and Cost Management User Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-endpoint.html#cfn-sagemaker-endpoint-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnEndpointProps]
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
    public fun deploymentConfig(deploymentConfig: CfnEndpoint.DeploymentConfigProperty)

    /**
     * @param deploymentConfig The deployment configuration for an endpoint, which contains the
     * desired deployment strategy and rollback configurations.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6b2d6ba44edefbb0dfcf01841de554d4892cba2499abbd58c2e4446c59f7afb2")
    public
        fun deploymentConfig(deploymentConfig: CfnEndpoint.DeploymentConfigProperty.Builder.() -> Unit)

    /**
     * @param endpointConfigName The name of the
     * [AWS::SageMaker::EndpointConfig](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-endpointconfig.html)
     * resource that specifies the configuration for the endpoint. For more information, see
     * [CreateEndpointConfig](https://docs.aws.amazon.com/sagemaker/latest/dg/API_CreateEndpointConfig.html)
     * . 
     */
    public fun endpointConfigName(endpointConfigName: String)

    /**
     * @param endpointName The name of the endpoint.
     * The name must be unique within an AWS Region in your AWS account. The name is
     * case-insensitive in `CreateEndpoint` , but the case is preserved and must be matched in
     * [](https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_runtime_InvokeEndpoint.html) .
     */
    public fun endpointName(endpointName: String)

    /**
     * @param excludeRetainedVariantProperties When you are updating endpoint resources with
     * [RetainAllVariantProperties](https://docs.aws.amazon.com/sagemaker/latest/dg/API_UpdateEndpoint.html#SageMaker-UpdateEndpoint-request-RetainAllVariantProperties)
     * whose value is set to `true` , `ExcludeRetainedVariantProperties` specifies the list of type
     * [VariantProperty](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpoint-variantproperty.html)
     * to override with the values provided by `EndpointConfig` . If you don't specify a value for
     * `ExcludeAllVariantProperties` , no variant properties are overridden. Don't use this property
     * when creating new endpoint resources or when `RetainAllVariantProperties` is set to `false` .
     */
    public fun excludeRetainedVariantProperties(excludeRetainedVariantProperties: IResolvable)

    /**
     * @param excludeRetainedVariantProperties When you are updating endpoint resources with
     * [RetainAllVariantProperties](https://docs.aws.amazon.com/sagemaker/latest/dg/API_UpdateEndpoint.html#SageMaker-UpdateEndpoint-request-RetainAllVariantProperties)
     * whose value is set to `true` , `ExcludeRetainedVariantProperties` specifies the list of type
     * [VariantProperty](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpoint-variantproperty.html)
     * to override with the values provided by `EndpointConfig` . If you don't specify a value for
     * `ExcludeAllVariantProperties` , no variant properties are overridden. Don't use this property
     * when creating new endpoint resources or when `RetainAllVariantProperties` is set to `false` .
     */
    public fun excludeRetainedVariantProperties(excludeRetainedVariantProperties: List<Any>)

    /**
     * @param excludeRetainedVariantProperties When you are updating endpoint resources with
     * [RetainAllVariantProperties](https://docs.aws.amazon.com/sagemaker/latest/dg/API_UpdateEndpoint.html#SageMaker-UpdateEndpoint-request-RetainAllVariantProperties)
     * whose value is set to `true` , `ExcludeRetainedVariantProperties` specifies the list of type
     * [VariantProperty](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpoint-variantproperty.html)
     * to override with the values provided by `EndpointConfig` . If you don't specify a value for
     * `ExcludeAllVariantProperties` , no variant properties are overridden. Don't use this property
     * when creating new endpoint resources or when `RetainAllVariantProperties` is set to `false` .
     */
    public fun excludeRetainedVariantProperties(vararg excludeRetainedVariantProperties: Any)

    /**
     * @param retainAllVariantProperties When updating endpoint resources, enables or disables the
     * retention of variant properties, such as the instance count or the variant weight.
     * To retain the variant properties of an endpoint when updating it, set
     * `RetainAllVariantProperties` to `true` . To use the variant properties specified in a new
     * `EndpointConfig` call when updating an endpoint, set `RetainAllVariantProperties` to `false` .
     * Use this property only when updating endpoint resources, not when creating new endpoint
     * resources.
     */
    public fun retainAllVariantProperties(retainAllVariantProperties: Boolean)

    /**
     * @param retainAllVariantProperties When updating endpoint resources, enables or disables the
     * retention of variant properties, such as the instance count or the variant weight.
     * To retain the variant properties of an endpoint when updating it, set
     * `RetainAllVariantProperties` to `true` . To use the variant properties specified in a new
     * `EndpointConfig` call when updating an endpoint, set `RetainAllVariantProperties` to `false` .
     * Use this property only when updating endpoint resources, not when creating new endpoint
     * resources.
     */
    public fun retainAllVariantProperties(retainAllVariantProperties: IResolvable)

    /**
     * @param retainDeploymentConfig Specifies whether to reuse the last deployment configuration.
     * The default value is false (the configuration is not reused).
     */
    public fun retainDeploymentConfig(retainDeploymentConfig: Boolean)

    /**
     * @param retainDeploymentConfig Specifies whether to reuse the last deployment configuration.
     * The default value is false (the configuration is not reused).
     */
    public fun retainDeploymentConfig(retainDeploymentConfig: IResolvable)

    /**
     * @param tags A list of key-value pairs to apply to this resource.
     * For more information, see [Resource
     * Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * and [Using Cost Allocation
     * Tags](https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html#allocation-what)
     * in the *AWS Billing and Cost Management User Guide* .
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags A list of key-value pairs to apply to this resource.
     * For more information, see [Resource
     * Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * and [Using Cost Allocation
     * Tags](https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html#allocation-what)
     * in the *AWS Billing and Cost Management User Guide* .
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.sagemaker.CfnEndpointProps.Builder =
        software.amazon.awscdk.services.sagemaker.CfnEndpointProps.builder()

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
    override fun deploymentConfig(deploymentConfig: CfnEndpoint.DeploymentConfigProperty) {
      cdkBuilder.deploymentConfig(deploymentConfig.let(CfnEndpoint.DeploymentConfigProperty.Companion::unwrap))
    }

    /**
     * @param deploymentConfig The deployment configuration for an endpoint, which contains the
     * desired deployment strategy and rollback configurations.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6b2d6ba44edefbb0dfcf01841de554d4892cba2499abbd58c2e4446c59f7afb2")
    override
        fun deploymentConfig(deploymentConfig: CfnEndpoint.DeploymentConfigProperty.Builder.() -> Unit):
        Unit = deploymentConfig(CfnEndpoint.DeploymentConfigProperty(deploymentConfig))

    /**
     * @param endpointConfigName The name of the
     * [AWS::SageMaker::EndpointConfig](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-endpointconfig.html)
     * resource that specifies the configuration for the endpoint. For more information, see
     * [CreateEndpointConfig](https://docs.aws.amazon.com/sagemaker/latest/dg/API_CreateEndpointConfig.html)
     * . 
     */
    override fun endpointConfigName(endpointConfigName: String) {
      cdkBuilder.endpointConfigName(endpointConfigName)
    }

    /**
     * @param endpointName The name of the endpoint.
     * The name must be unique within an AWS Region in your AWS account. The name is
     * case-insensitive in `CreateEndpoint` , but the case is preserved and must be matched in
     * [](https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_runtime_InvokeEndpoint.html) .
     */
    override fun endpointName(endpointName: String) {
      cdkBuilder.endpointName(endpointName)
    }

    /**
     * @param excludeRetainedVariantProperties When you are updating endpoint resources with
     * [RetainAllVariantProperties](https://docs.aws.amazon.com/sagemaker/latest/dg/API_UpdateEndpoint.html#SageMaker-UpdateEndpoint-request-RetainAllVariantProperties)
     * whose value is set to `true` , `ExcludeRetainedVariantProperties` specifies the list of type
     * [VariantProperty](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpoint-variantproperty.html)
     * to override with the values provided by `EndpointConfig` . If you don't specify a value for
     * `ExcludeAllVariantProperties` , no variant properties are overridden. Don't use this property
     * when creating new endpoint resources or when `RetainAllVariantProperties` is set to `false` .
     */
    override fun excludeRetainedVariantProperties(excludeRetainedVariantProperties: IResolvable) {
      cdkBuilder.excludeRetainedVariantProperties(excludeRetainedVariantProperties.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param excludeRetainedVariantProperties When you are updating endpoint resources with
     * [RetainAllVariantProperties](https://docs.aws.amazon.com/sagemaker/latest/dg/API_UpdateEndpoint.html#SageMaker-UpdateEndpoint-request-RetainAllVariantProperties)
     * whose value is set to `true` , `ExcludeRetainedVariantProperties` specifies the list of type
     * [VariantProperty](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpoint-variantproperty.html)
     * to override with the values provided by `EndpointConfig` . If you don't specify a value for
     * `ExcludeAllVariantProperties` , no variant properties are overridden. Don't use this property
     * when creating new endpoint resources or when `RetainAllVariantProperties` is set to `false` .
     */
    override fun excludeRetainedVariantProperties(excludeRetainedVariantProperties: List<Any>) {
      cdkBuilder.excludeRetainedVariantProperties(excludeRetainedVariantProperties.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param excludeRetainedVariantProperties When you are updating endpoint resources with
     * [RetainAllVariantProperties](https://docs.aws.amazon.com/sagemaker/latest/dg/API_UpdateEndpoint.html#SageMaker-UpdateEndpoint-request-RetainAllVariantProperties)
     * whose value is set to `true` , `ExcludeRetainedVariantProperties` specifies the list of type
     * [VariantProperty](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpoint-variantproperty.html)
     * to override with the values provided by `EndpointConfig` . If you don't specify a value for
     * `ExcludeAllVariantProperties` , no variant properties are overridden. Don't use this property
     * when creating new endpoint resources or when `RetainAllVariantProperties` is set to `false` .
     */
    override fun excludeRetainedVariantProperties(vararg excludeRetainedVariantProperties: Any):
        Unit = excludeRetainedVariantProperties(excludeRetainedVariantProperties.toList())

    /**
     * @param retainAllVariantProperties When updating endpoint resources, enables or disables the
     * retention of variant properties, such as the instance count or the variant weight.
     * To retain the variant properties of an endpoint when updating it, set
     * `RetainAllVariantProperties` to `true` . To use the variant properties specified in a new
     * `EndpointConfig` call when updating an endpoint, set `RetainAllVariantProperties` to `false` .
     * Use this property only when updating endpoint resources, not when creating new endpoint
     * resources.
     */
    override fun retainAllVariantProperties(retainAllVariantProperties: Boolean) {
      cdkBuilder.retainAllVariantProperties(retainAllVariantProperties)
    }

    /**
     * @param retainAllVariantProperties When updating endpoint resources, enables or disables the
     * retention of variant properties, such as the instance count or the variant weight.
     * To retain the variant properties of an endpoint when updating it, set
     * `RetainAllVariantProperties` to `true` . To use the variant properties specified in a new
     * `EndpointConfig` call when updating an endpoint, set `RetainAllVariantProperties` to `false` .
     * Use this property only when updating endpoint resources, not when creating new endpoint
     * resources.
     */
    override fun retainAllVariantProperties(retainAllVariantProperties: IResolvable) {
      cdkBuilder.retainAllVariantProperties(retainAllVariantProperties.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param retainDeploymentConfig Specifies whether to reuse the last deployment configuration.
     * The default value is false (the configuration is not reused).
     */
    override fun retainDeploymentConfig(retainDeploymentConfig: Boolean) {
      cdkBuilder.retainDeploymentConfig(retainDeploymentConfig)
    }

    /**
     * @param retainDeploymentConfig Specifies whether to reuse the last deployment configuration.
     * The default value is false (the configuration is not reused).
     */
    override fun retainDeploymentConfig(retainDeploymentConfig: IResolvable) {
      cdkBuilder.retainDeploymentConfig(retainDeploymentConfig.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param tags A list of key-value pairs to apply to this resource.
     * For more information, see [Resource
     * Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * and [Using Cost Allocation
     * Tags](https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html#allocation-what)
     * in the *AWS Billing and Cost Management User Guide* .
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags A list of key-value pairs to apply to this resource.
     * For more information, see [Resource
     * Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * and [Using Cost Allocation
     * Tags](https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html#allocation-what)
     * in the *AWS Billing and Cost Management User Guide* .
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.sagemaker.CfnEndpointProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.sagemaker.CfnEndpointProps,
  ) : CdkObject(cdkObject),
      CfnEndpointProps {
    /**
     * The deployment configuration for an endpoint, which contains the desired deployment strategy
     * and rollback configurations.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-endpoint.html#cfn-sagemaker-endpoint-deploymentconfig)
     */
    override fun deploymentConfig(): Any? = unwrap(this).getDeploymentConfig()

    /**
     * The name of the
     * [AWS::SageMaker::EndpointConfig](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-endpointconfig.html)
     * resource that specifies the configuration for the endpoint. For more information, see
     * [CreateEndpointConfig](https://docs.aws.amazon.com/sagemaker/latest/dg/API_CreateEndpointConfig.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-endpoint.html#cfn-sagemaker-endpoint-endpointconfigname)
     */
    override fun endpointConfigName(): String = unwrap(this).getEndpointConfigName()

    /**
     * The name of the endpoint.
     *
     * The name must be unique within an AWS Region in your AWS account. The name is
     * case-insensitive in `CreateEndpoint` , but the case is preserved and must be matched in
     * [](https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_runtime_InvokeEndpoint.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-endpoint.html#cfn-sagemaker-endpoint-endpointname)
     */
    override fun endpointName(): String? = unwrap(this).getEndpointName()

    /**
     * When you are updating endpoint resources with
     * [RetainAllVariantProperties](https://docs.aws.amazon.com/sagemaker/latest/dg/API_UpdateEndpoint.html#SageMaker-UpdateEndpoint-request-RetainAllVariantProperties)
     * whose value is set to `true` , `ExcludeRetainedVariantProperties` specifies the list of type
     * [VariantProperty](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpoint-variantproperty.html)
     * to override with the values provided by `EndpointConfig` . If you don't specify a value for
     * `ExcludeAllVariantProperties` , no variant properties are overridden. Don't use this property
     * when creating new endpoint resources or when `RetainAllVariantProperties` is set to `false` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-endpoint.html#cfn-sagemaker-endpoint-excluderetainedvariantproperties)
     */
    override fun excludeRetainedVariantProperties(): Any? =
        unwrap(this).getExcludeRetainedVariantProperties()

    /**
     * When updating endpoint resources, enables or disables the retention of variant properties,
     * such as the instance count or the variant weight.
     *
     * To retain the variant properties of an endpoint when updating it, set
     * `RetainAllVariantProperties` to `true` . To use the variant properties specified in a new
     * `EndpointConfig` call when updating an endpoint, set `RetainAllVariantProperties` to `false` .
     * Use this property only when updating endpoint resources, not when creating new endpoint
     * resources.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-endpoint.html#cfn-sagemaker-endpoint-retainallvariantproperties)
     */
    override fun retainAllVariantProperties(): Any? = unwrap(this).getRetainAllVariantProperties()

    /**
     * Specifies whether to reuse the last deployment configuration.
     *
     * The default value is false (the configuration is not reused).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-endpoint.html#cfn-sagemaker-endpoint-retaindeploymentconfig)
     */
    override fun retainDeploymentConfig(): Any? = unwrap(this).getRetainDeploymentConfig()

    /**
     * A list of key-value pairs to apply to this resource.
     *
     * For more information, see [Resource
     * Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * and [Using Cost Allocation
     * Tags](https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html#allocation-what)
     * in the *AWS Billing and Cost Management User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-endpoint.html#cfn-sagemaker-endpoint-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnEndpointProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnEndpointProps):
        CfnEndpointProps = CdkObjectWrappers.wrap(cdkObject) as? CfnEndpointProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnEndpointProps):
        software.amazon.awscdk.services.sagemaker.CfnEndpointProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.sagemaker.CfnEndpointProps
  }
}
