@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

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
import software.constructs.Construct

/**
 * Use the `AWS::SageMaker::Endpoint` resource to create an endpoint using the specified
 * configuration in the request.
 *
 * Amazon SageMaker uses the endpoint to provision resources and deploy models. You create the
 * endpoint configuration with the
 * [AWS::SageMaker::EndpointConfig](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-endpointconfig.html)
 * resource. For more information, see
 * [Deploy a Model on Amazon SageMaker Hosting Services](https://docs.aws.amazon.com/sagemaker/latest/dg/how-it-works-hosting.html)
 * in the *Amazon SageMaker Developer Guide* .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sagemaker.*;
 * CfnEndpoint cfnEndpoint = CfnEndpoint.Builder.create(this, "MyCfnEndpoint")
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
@CdkDslMarker
public class CfnEndpointDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnEndpoint.Builder = CfnEndpoint.Builder.create(scope, id)

    private val _excludeRetainedVariantProperties: MutableList<Any> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * The deployment configuration for an endpoint, which contains the desired deployment strategy
     * and rollback configurations.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-endpoint.html#cfn-sagemaker-endpoint-deploymentconfig)
     *
     * @param deploymentConfig The deployment configuration for an endpoint, which contains the
     *   desired deployment strategy and rollback configurations.
     */
    public fun deploymentConfig(deploymentConfig: IResolvable) {
        cdkBuilder.deploymentConfig(deploymentConfig)
    }

    /**
     * The deployment configuration for an endpoint, which contains the desired deployment strategy
     * and rollback configurations.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-endpoint.html#cfn-sagemaker-endpoint-deploymentconfig)
     *
     * @param deploymentConfig The deployment configuration for an endpoint, which contains the
     *   desired deployment strategy and rollback configurations.
     */
    public fun deploymentConfig(deploymentConfig: CfnEndpoint.DeploymentConfigProperty) {
        cdkBuilder.deploymentConfig(deploymentConfig)
    }

    /**
     * The name of the
     * [AWS::SageMaker::EndpointConfig](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-endpointconfig.html)
     * resource that specifies the configuration for the endpoint. For more information, see
     * [CreateEndpointConfig](https://docs.aws.amazon.com/sagemaker/latest/dg/API_CreateEndpointConfig.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-endpoint.html#cfn-sagemaker-endpoint-endpointconfigname)
     *
     * @param endpointConfigName The name of the
     *   [AWS::SageMaker::EndpointConfig](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-endpointconfig.html)
     *   resource that specifies the configuration for the endpoint. For more information, see
     *   [CreateEndpointConfig](https://docs.aws.amazon.com/sagemaker/latest/dg/API_CreateEndpointConfig.html)
     *   .
     */
    public fun endpointConfigName(endpointConfigName: String) {
        cdkBuilder.endpointConfigName(endpointConfigName)
    }

    /**
     * The name of the endpoint.The name must be unique within an AWS Region in your AWS account.
     * The name is case-insensitive in `CreateEndpoint` , but the case is preserved and must be
     * matched in
     * [](https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_runtime_InvokeEndpoint.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-endpoint.html#cfn-sagemaker-endpoint-endpointname)
     *
     * @param endpointName The name of the endpoint.The name must be unique within an AWS Region in
     *   your AWS account. The name is case-insensitive in `CreateEndpoint` , but the case is
     *   preserved and must be matched in
     *   [](https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_runtime_InvokeEndpoint.html)
     *   .
     */
    public fun endpointName(endpointName: String) {
        cdkBuilder.endpointName(endpointName)
    }

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
     *
     * @param excludeRetainedVariantProperties When you are updating endpoint resources with
     *   [RetainAllVariantProperties](https://docs.aws.amazon.com/sagemaker/latest/dg/API_UpdateEndpoint.html#SageMaker-UpdateEndpoint-request-RetainAllVariantProperties)
     *   whose value is set to `true` , `ExcludeRetainedVariantProperties` specifies the list of
     *   type
     *   [VariantProperty](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpoint-variantproperty.html)
     *   to override with the values provided by `EndpointConfig` . If you don't specify a value for
     *   `ExcludeAllVariantProperties` , no variant properties are overridden. Don't use this
     *   property when creating new endpoint resources or when `RetainAllVariantProperties` is set
     *   to `false` .
     */
    public fun excludeRetainedVariantProperties(vararg excludeRetainedVariantProperties: Any) {
        _excludeRetainedVariantProperties.addAll(listOf(*excludeRetainedVariantProperties))
    }

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
     *
     * @param excludeRetainedVariantProperties When you are updating endpoint resources with
     *   [RetainAllVariantProperties](https://docs.aws.amazon.com/sagemaker/latest/dg/API_UpdateEndpoint.html#SageMaker-UpdateEndpoint-request-RetainAllVariantProperties)
     *   whose value is set to `true` , `ExcludeRetainedVariantProperties` specifies the list of
     *   type
     *   [VariantProperty](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpoint-variantproperty.html)
     *   to override with the values provided by `EndpointConfig` . If you don't specify a value for
     *   `ExcludeAllVariantProperties` , no variant properties are overridden. Don't use this
     *   property when creating new endpoint resources or when `RetainAllVariantProperties` is set
     *   to `false` .
     */
    public fun excludeRetainedVariantProperties(excludeRetainedVariantProperties: Collection<Any>) {
        _excludeRetainedVariantProperties.addAll(excludeRetainedVariantProperties)
    }

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
     *
     * @param excludeRetainedVariantProperties When you are updating endpoint resources with
     *   [RetainAllVariantProperties](https://docs.aws.amazon.com/sagemaker/latest/dg/API_UpdateEndpoint.html#SageMaker-UpdateEndpoint-request-RetainAllVariantProperties)
     *   whose value is set to `true` , `ExcludeRetainedVariantProperties` specifies the list of
     *   type
     *   [VariantProperty](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpoint-variantproperty.html)
     *   to override with the values provided by `EndpointConfig` . If you don't specify a value for
     *   `ExcludeAllVariantProperties` , no variant properties are overridden. Don't use this
     *   property when creating new endpoint resources or when `RetainAllVariantProperties` is set
     *   to `false` .
     */
    public fun excludeRetainedVariantProperties(excludeRetainedVariantProperties: IResolvable) {
        cdkBuilder.excludeRetainedVariantProperties(excludeRetainedVariantProperties)
    }

    /**
     * When updating endpoint resources, enables or disables the retention of variant properties,
     * such as the instance count or the variant weight.
     *
     * To retain the variant properties of an endpoint when updating it, set
     * `RetainAllVariantProperties` to `true` . To use the variant properties specified in a new
     * `EndpointConfig` call when updating an endpoint, set `RetainAllVariantProperties` to `false`
     * . Use this property only when updating endpoint resources, not when creating new endpoint
     * resources.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-endpoint.html#cfn-sagemaker-endpoint-retainallvariantproperties)
     *
     * @param retainAllVariantProperties When updating endpoint resources, enables or disables the
     *   retention of variant properties, such as the instance count or the variant weight.
     */
    public fun retainAllVariantProperties(retainAllVariantProperties: Boolean) {
        cdkBuilder.retainAllVariantProperties(retainAllVariantProperties)
    }

    /**
     * When updating endpoint resources, enables or disables the retention of variant properties,
     * such as the instance count or the variant weight.
     *
     * To retain the variant properties of an endpoint when updating it, set
     * `RetainAllVariantProperties` to `true` . To use the variant properties specified in a new
     * `EndpointConfig` call when updating an endpoint, set `RetainAllVariantProperties` to `false`
     * . Use this property only when updating endpoint resources, not when creating new endpoint
     * resources.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-endpoint.html#cfn-sagemaker-endpoint-retainallvariantproperties)
     *
     * @param retainAllVariantProperties When updating endpoint resources, enables or disables the
     *   retention of variant properties, such as the instance count or the variant weight.
     */
    public fun retainAllVariantProperties(retainAllVariantProperties: IResolvable) {
        cdkBuilder.retainAllVariantProperties(retainAllVariantProperties)
    }

    /**
     * Specifies whether to reuse the last deployment configuration.
     *
     * The default value is false (the configuration is not reused).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-endpoint.html#cfn-sagemaker-endpoint-retaindeploymentconfig)
     *
     * @param retainDeploymentConfig Specifies whether to reuse the last deployment configuration.
     */
    public fun retainDeploymentConfig(retainDeploymentConfig: Boolean) {
        cdkBuilder.retainDeploymentConfig(retainDeploymentConfig)
    }

    /**
     * Specifies whether to reuse the last deployment configuration.
     *
     * The default value is false (the configuration is not reused).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-endpoint.html#cfn-sagemaker-endpoint-retaindeploymentconfig)
     *
     * @param retainDeploymentConfig Specifies whether to reuse the last deployment configuration.
     */
    public fun retainDeploymentConfig(retainDeploymentConfig: IResolvable) {
        cdkBuilder.retainDeploymentConfig(retainDeploymentConfig)
    }

    /**
     * A list of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Resource Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * and
     * [Using Cost Allocation Tags](https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html#allocation-what)
     * in the *AWS Billing and Cost Management User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-endpoint.html#cfn-sagemaker-endpoint-tags)
     *
     * @param tags A list of key-value pairs to apply to this resource.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * A list of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Resource Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * and
     * [Using Cost Allocation Tags](https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html#allocation-what)
     * in the *AWS Billing and Cost Management User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-endpoint.html#cfn-sagemaker-endpoint-tags)
     *
     * @param tags A list of key-value pairs to apply to this resource.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnEndpoint {
        if (_excludeRetainedVariantProperties.isNotEmpty())
            cdkBuilder.excludeRetainedVariantProperties(_excludeRetainedVariantProperties)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
