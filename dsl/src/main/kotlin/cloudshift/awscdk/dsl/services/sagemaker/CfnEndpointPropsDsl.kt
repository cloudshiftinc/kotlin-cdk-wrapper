@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sagemaker.CfnEndpoint
import software.amazon.awscdk.services.sagemaker.CfnEndpointProps

/**
 * Properties for defining a `CfnEndpoint`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sagemaker.*;
 * CfnEndpointProps cfnEndpointProps = CfnEndpointProps.builder()
 * .endpointConfigName("endpointConfigName")
 * // the properties below are optional
 * .deploymentConfig(DeploymentConfigProperty.builder()
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
 * // the properties below are optional
 * .autoRollbackConfiguration(AutoRollbackConfigProperty.builder()
 * .alarms(List.of(AlarmProperty.builder()
 * .alarmName("alarmName")
 * .build()))
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
@CdkDslMarker
public class CfnEndpointPropsDsl {
  private val cdkBuilder: CfnEndpointProps.Builder = CfnEndpointProps.builder()

  private val _excludeRetainedVariantProperties: MutableList<Any> = mutableListOf()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * @param deploymentConfig The deployment configuration for an endpoint, which contains the
   * desired deployment strategy and rollback configurations.
   */
  public fun deploymentConfig(deploymentConfig: IResolvable) {
    cdkBuilder.deploymentConfig(deploymentConfig)
  }

  /**
   * @param deploymentConfig The deployment configuration for an endpoint, which contains the
   * desired deployment strategy and rollback configurations.
   */
  public fun deploymentConfig(deploymentConfig: CfnEndpoint.DeploymentConfigProperty) {
    cdkBuilder.deploymentConfig(deploymentConfig)
  }

  /**
   * @param endpointConfigName The name of the
   * [AWS::SageMaker::EndpointConfig](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-endpointconfig.html)
   * resource that specifies the configuration for the endpoint. For more information, see
   * [CreateEndpointConfig](https://docs.aws.amazon.com/sagemaker/latest/dg/API_CreateEndpointConfig.html)
   * . 
   */
  public fun endpointConfigName(endpointConfigName: String) {
    cdkBuilder.endpointConfigName(endpointConfigName)
  }

  /**
   * @param endpointName The name of the endpoint.The name must be unique within an AWS Region in
   * your AWS account. The name is case-insensitive in `CreateEndpoint` , but the case is preserved and
   * must be matched in
   * [](https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_runtime_InvokeEndpoint.html) .
   */
  public fun endpointName(endpointName: String) {
    cdkBuilder.endpointName(endpointName)
  }

  /**
   * @param excludeRetainedVariantProperties When you are updating endpoint resources with
   * [RetainAllVariantProperties](https://docs.aws.amazon.com/sagemaker/latest/dg/API_UpdateEndpoint.html#SageMaker-UpdateEndpoint-request-RetainAllVariantProperties)
   * whose value is set to `true` , `ExcludeRetainedVariantProperties` specifies the list of type
   * [VariantProperty](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpoint-variantproperty.html)
   * to override with the values provided by `EndpointConfig` . If you don't specify a value for
   * `ExcludeAllVariantProperties` , no variant properties are overridden. Don't use this property when
   * creating new endpoint resources or when `RetainAllVariantProperties` is set to `false` .
   */
  public fun excludeRetainedVariantProperties(vararg excludeRetainedVariantProperties: Any) {
    _excludeRetainedVariantProperties.addAll(listOf(*excludeRetainedVariantProperties))
  }

  /**
   * @param excludeRetainedVariantProperties When you are updating endpoint resources with
   * [RetainAllVariantProperties](https://docs.aws.amazon.com/sagemaker/latest/dg/API_UpdateEndpoint.html#SageMaker-UpdateEndpoint-request-RetainAllVariantProperties)
   * whose value is set to `true` , `ExcludeRetainedVariantProperties` specifies the list of type
   * [VariantProperty](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpoint-variantproperty.html)
   * to override with the values provided by `EndpointConfig` . If you don't specify a value for
   * `ExcludeAllVariantProperties` , no variant properties are overridden. Don't use this property when
   * creating new endpoint resources or when `RetainAllVariantProperties` is set to `false` .
   */
  public fun excludeRetainedVariantProperties(excludeRetainedVariantProperties: Collection<Any>) {
    _excludeRetainedVariantProperties.addAll(excludeRetainedVariantProperties)
  }

  /**
   * @param excludeRetainedVariantProperties When you are updating endpoint resources with
   * [RetainAllVariantProperties](https://docs.aws.amazon.com/sagemaker/latest/dg/API_UpdateEndpoint.html#SageMaker-UpdateEndpoint-request-RetainAllVariantProperties)
   * whose value is set to `true` , `ExcludeRetainedVariantProperties` specifies the list of type
   * [VariantProperty](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpoint-variantproperty.html)
   * to override with the values provided by `EndpointConfig` . If you don't specify a value for
   * `ExcludeAllVariantProperties` , no variant properties are overridden. Don't use this property when
   * creating new endpoint resources or when `RetainAllVariantProperties` is set to `false` .
   */
  public fun excludeRetainedVariantProperties(excludeRetainedVariantProperties: IResolvable) {
    cdkBuilder.excludeRetainedVariantProperties(excludeRetainedVariantProperties)
  }

  /**
   * @param retainAllVariantProperties When updating endpoint resources, enables or disables the
   * retention of variant properties, such as the instance count or the variant weight.
   * To retain the variant properties of an endpoint when updating it, set
   * `RetainAllVariantProperties` to `true` . To use the variant properties specified in a new
   * `EndpointConfig` call when updating an endpoint, set `RetainAllVariantProperties` to `false` . Use
   * this property only when updating endpoint resources, not when creating new endpoint resources.
   */
  public fun retainAllVariantProperties(retainAllVariantProperties: Boolean) {
    cdkBuilder.retainAllVariantProperties(retainAllVariantProperties)
  }

  /**
   * @param retainAllVariantProperties When updating endpoint resources, enables or disables the
   * retention of variant properties, such as the instance count or the variant weight.
   * To retain the variant properties of an endpoint when updating it, set
   * `RetainAllVariantProperties` to `true` . To use the variant properties specified in a new
   * `EndpointConfig` call when updating an endpoint, set `RetainAllVariantProperties` to `false` . Use
   * this property only when updating endpoint resources, not when creating new endpoint resources.
   */
  public fun retainAllVariantProperties(retainAllVariantProperties: IResolvable) {
    cdkBuilder.retainAllVariantProperties(retainAllVariantProperties)
  }

  /**
   * @param retainDeploymentConfig Specifies whether to reuse the last deployment configuration.
   * The default value is false (the configuration is not reused).
   */
  public fun retainDeploymentConfig(retainDeploymentConfig: Boolean) {
    cdkBuilder.retainDeploymentConfig(retainDeploymentConfig)
  }

  /**
   * @param retainDeploymentConfig Specifies whether to reuse the last deployment configuration.
   * The default value is false (the configuration is not reused).
   */
  public fun retainDeploymentConfig(retainDeploymentConfig: IResolvable) {
    cdkBuilder.retainDeploymentConfig(retainDeploymentConfig)
  }

  /**
   * @param tags A list of key-value pairs to apply to this resource.
   * For more information, see [Resource
   * Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
   * and [Using Cost Allocation
   * Tags](https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html#allocation-what)
   * in the *AWS Billing and Cost Management User Guide* .
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * @param tags A list of key-value pairs to apply to this resource.
   * For more information, see [Resource
   * Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
   * and [Using Cost Allocation
   * Tags](https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html#allocation-what)
   * in the *AWS Billing and Cost Management User Guide* .
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnEndpointProps {
    if(_excludeRetainedVariantProperties.isNotEmpty())
        cdkBuilder.excludeRetainedVariantProperties(_excludeRetainedVariantProperties)
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
