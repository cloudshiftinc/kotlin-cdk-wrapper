@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.sagemaker

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Use the `AWS::SageMaker::Endpoint` resource to create an endpoint using the specified
 * configuration in the request.
 *
 * Amazon SageMaker uses the endpoint to provision resources and deploy models. You create the
 * endpoint configuration with the
 * [AWS::SageMaker::EndpointConfig](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-endpointconfig.html)
 * resource. For more information, see [Deploy a Model on Amazon SageMaker Hosting
 * Services](https://docs.aws.amazon.com/sagemaker/latest/dg/how-it-works-hosting.html) in the *Amazon
 * SageMaker Developer Guide* .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.sagemaker.*;
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
public open class CfnEndpoint(
  cdkObject: software.amazon.awscdk.services.sagemaker.CfnEndpoint,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnEndpointProps,
  ) :
      this(software.amazon.awscdk.services.sagemaker.CfnEndpoint(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnEndpointProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnEndpointProps.Builder.() -> Unit,
  ) : this(scope, id, CfnEndpointProps(props)
  )

  /**
   * The name of the endpoint, such as `MyEndpoint` .
   */
  public open fun attrEndpointName(): String = unwrap(this).getAttrEndpointName()

  /**
   *
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * The deployment configuration for an endpoint, which contains the desired deployment strategy
   * and rollback configurations.
   */
  public open fun deploymentConfig(): Any? = unwrap(this).getDeploymentConfig()

  /**
   * The deployment configuration for an endpoint, which contains the desired deployment strategy
   * and rollback configurations.
   */
  public open fun deploymentConfig(`value`: IResolvable) {
    unwrap(this).setDeploymentConfig(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The deployment configuration for an endpoint, which contains the desired deployment strategy
   * and rollback configurations.
   */
  public open fun deploymentConfig(`value`: DeploymentConfigProperty) {
    unwrap(this).setDeploymentConfig(`value`.let(DeploymentConfigProperty.Companion::unwrap))
  }

  /**
   * The deployment configuration for an endpoint, which contains the desired deployment strategy
   * and rollback configurations.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("0e2b32a23f66da38d7dff68e0c983951737613491f0eb018d089471b1a4ce50c")
  public open fun deploymentConfig(`value`: DeploymentConfigProperty.Builder.() -> Unit): Unit =
      deploymentConfig(DeploymentConfigProperty(`value`))

  /**
   * The name of the
   * [AWS::SageMaker::EndpointConfig](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-endpointconfig.html)
   * resource that specifies the configuration for the endpoint. For more information, see
   * [CreateEndpointConfig](https://docs.aws.amazon.com/sagemaker/latest/dg/API_CreateEndpointConfig.html)
   * .
   */
  public open fun endpointConfigName(): String = unwrap(this).getEndpointConfigName()

  /**
   * The name of the
   * [AWS::SageMaker::EndpointConfig](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-endpointconfig.html)
   * resource that specifies the configuration for the endpoint. For more information, see
   * [CreateEndpointConfig](https://docs.aws.amazon.com/sagemaker/latest/dg/API_CreateEndpointConfig.html)
   * .
   */
  public open fun endpointConfigName(`value`: String) {
    unwrap(this).setEndpointConfigName(`value`)
  }

  /**
   * The name of the endpoint.The name must be unique within an AWS Region in your AWS account. The
   * name is case-insensitive in `CreateEndpoint` , but the case is preserved and must be matched in
   * [](https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_runtime_InvokeEndpoint.html) .
   */
  public open fun endpointName(): String? = unwrap(this).getEndpointName()

  /**
   * The name of the endpoint.The name must be unique within an AWS Region in your AWS account. The
   * name is case-insensitive in `CreateEndpoint` , but the case is preserved and must be matched in
   * [](https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_runtime_InvokeEndpoint.html) .
   */
  public open fun endpointName(`value`: String) {
    unwrap(this).setEndpointName(`value`)
  }

  /**
   * When you are updating endpoint resources with
   * [RetainAllVariantProperties](https://docs.aws.amazon.com/sagemaker/latest/dg/API_UpdateEndpoint.html#SageMaker-UpdateEndpoint-request-RetainAllVariantProperties)
   * whose value is set to `true` , `ExcludeRetainedVariantProperties` specifies the list of type
   * [VariantProperty](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpoint-variantproperty.html)
   * to override with the values provided by `EndpointConfig` . If you don't specify a value for
   * `ExcludeAllVariantProperties` , no variant properties are overridden. Don't use this property when
   * creating new endpoint resources or when `RetainAllVariantProperties` is set to `false` .
   */
  public open fun excludeRetainedVariantProperties(): Any? =
      unwrap(this).getExcludeRetainedVariantProperties()

  /**
   * When you are updating endpoint resources with
   * [RetainAllVariantProperties](https://docs.aws.amazon.com/sagemaker/latest/dg/API_UpdateEndpoint.html#SageMaker-UpdateEndpoint-request-RetainAllVariantProperties)
   * whose value is set to `true` , `ExcludeRetainedVariantProperties` specifies the list of type
   * [VariantProperty](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpoint-variantproperty.html)
   * to override with the values provided by `EndpointConfig` . If you don't specify a value for
   * `ExcludeAllVariantProperties` , no variant properties are overridden. Don't use this property when
   * creating new endpoint resources or when `RetainAllVariantProperties` is set to `false` .
   */
  public open fun excludeRetainedVariantProperties(`value`: IResolvable) {
    unwrap(this).setExcludeRetainedVariantProperties(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * When you are updating endpoint resources with
   * [RetainAllVariantProperties](https://docs.aws.amazon.com/sagemaker/latest/dg/API_UpdateEndpoint.html#SageMaker-UpdateEndpoint-request-RetainAllVariantProperties)
   * whose value is set to `true` , `ExcludeRetainedVariantProperties` specifies the list of type
   * [VariantProperty](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpoint-variantproperty.html)
   * to override with the values provided by `EndpointConfig` . If you don't specify a value for
   * `ExcludeAllVariantProperties` , no variant properties are overridden. Don't use this property when
   * creating new endpoint resources or when `RetainAllVariantProperties` is set to `false` .
   */
  public open fun excludeRetainedVariantProperties(`value`: List<Any>) {
    unwrap(this).setExcludeRetainedVariantProperties(`value`.map{CdkObjectWrappers.unwrap(it)})
  }

  /**
   * When you are updating endpoint resources with
   * [RetainAllVariantProperties](https://docs.aws.amazon.com/sagemaker/latest/dg/API_UpdateEndpoint.html#SageMaker-UpdateEndpoint-request-RetainAllVariantProperties)
   * whose value is set to `true` , `ExcludeRetainedVariantProperties` specifies the list of type
   * [VariantProperty](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpoint-variantproperty.html)
   * to override with the values provided by `EndpointConfig` . If you don't specify a value for
   * `ExcludeAllVariantProperties` , no variant properties are overridden. Don't use this property when
   * creating new endpoint resources or when `RetainAllVariantProperties` is set to `false` .
   */
  public open fun excludeRetainedVariantProperties(vararg `value`: Any): Unit =
      excludeRetainedVariantProperties(`value`.toList())

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * When updating endpoint resources, enables or disables the retention of variant properties, such
   * as the instance count or the variant weight.
   */
  public open fun retainAllVariantProperties(): Any? = unwrap(this).getRetainAllVariantProperties()

  /**
   * When updating endpoint resources, enables or disables the retention of variant properties, such
   * as the instance count or the variant weight.
   */
  public open fun retainAllVariantProperties(`value`: Boolean) {
    unwrap(this).setRetainAllVariantProperties(`value`)
  }

  /**
   * When updating endpoint resources, enables or disables the retention of variant properties, such
   * as the instance count or the variant weight.
   */
  public open fun retainAllVariantProperties(`value`: IResolvable) {
    unwrap(this).setRetainAllVariantProperties(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Specifies whether to reuse the last deployment configuration.
   */
  public open fun retainDeploymentConfig(): Any? = unwrap(this).getRetainDeploymentConfig()

  /**
   * Specifies whether to reuse the last deployment configuration.
   */
  public open fun retainDeploymentConfig(`value`: Boolean) {
    unwrap(this).setRetainDeploymentConfig(`value`)
  }

  /**
   * Specifies whether to reuse the last deployment configuration.
   */
  public open fun retainDeploymentConfig(`value`: IResolvable) {
    unwrap(this).setRetainDeploymentConfig(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * A list of key-value pairs to apply to this resource.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * A list of key-value pairs to apply to this resource.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * A list of key-value pairs to apply to this resource.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.sagemaker.CfnEndpoint].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The deployment configuration for an endpoint, which contains the desired deployment strategy
     * and rollback configurations.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-endpoint.html#cfn-sagemaker-endpoint-deploymentconfig)
     * @param deploymentConfig The deployment configuration for an endpoint, which contains the
     * desired deployment strategy and rollback configurations. 
     */
    public fun deploymentConfig(deploymentConfig: IResolvable)

    /**
     * The deployment configuration for an endpoint, which contains the desired deployment strategy
     * and rollback configurations.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-endpoint.html#cfn-sagemaker-endpoint-deploymentconfig)
     * @param deploymentConfig The deployment configuration for an endpoint, which contains the
     * desired deployment strategy and rollback configurations. 
     */
    public fun deploymentConfig(deploymentConfig: DeploymentConfigProperty)

    /**
     * The deployment configuration for an endpoint, which contains the desired deployment strategy
     * and rollback configurations.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-endpoint.html#cfn-sagemaker-endpoint-deploymentconfig)
     * @param deploymentConfig The deployment configuration for an endpoint, which contains the
     * desired deployment strategy and rollback configurations. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a541c408e70416a81e50a6f3c53ab0ea85b12aaa791ea908466a2e921fa9fd67")
    public fun deploymentConfig(deploymentConfig: DeploymentConfigProperty.Builder.() -> Unit)

    /**
     * The name of the
     * [AWS::SageMaker::EndpointConfig](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-endpointconfig.html)
     * resource that specifies the configuration for the endpoint. For more information, see
     * [CreateEndpointConfig](https://docs.aws.amazon.com/sagemaker/latest/dg/API_CreateEndpointConfig.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-endpoint.html#cfn-sagemaker-endpoint-endpointconfigname)
     * @param endpointConfigName The name of the
     * [AWS::SageMaker::EndpointConfig](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-endpointconfig.html)
     * resource that specifies the configuration for the endpoint. For more information, see
     * [CreateEndpointConfig](https://docs.aws.amazon.com/sagemaker/latest/dg/API_CreateEndpointConfig.html)
     * . 
     */
    public fun endpointConfigName(endpointConfigName: String)

    /**
     * The name of the endpoint.The name must be unique within an AWS Region in your AWS account.
     * The name is case-insensitive in `CreateEndpoint` , but the case is preserved and must be matched
     * in [](https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_runtime_InvokeEndpoint.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-endpoint.html#cfn-sagemaker-endpoint-endpointname)
     * @param endpointName The name of the endpoint.The name must be unique within an AWS Region in
     * your AWS account. The name is case-insensitive in `CreateEndpoint` , but the case is preserved
     * and must be matched in
     * [](https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_runtime_InvokeEndpoint.html) . 
     */
    public fun endpointName(endpointName: String)

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
     * When you are updating endpoint resources with
     * [RetainAllVariantProperties](https://docs.aws.amazon.com/sagemaker/latest/dg/API_UpdateEndpoint.html#SageMaker-UpdateEndpoint-request-RetainAllVariantProperties)
     * whose value is set to `true` , `ExcludeRetainedVariantProperties` specifies the list of type
     * [VariantProperty](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpoint-variantproperty.html)
     * to override with the values provided by `EndpointConfig` . If you don't specify a value for
     * `ExcludeAllVariantProperties` , no variant properties are overridden. Don't use this property
     * when creating new endpoint resources or when `RetainAllVariantProperties` is set to `false` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-endpoint.html#cfn-sagemaker-endpoint-excluderetainedvariantproperties)
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
     * When you are updating endpoint resources with
     * [RetainAllVariantProperties](https://docs.aws.amazon.com/sagemaker/latest/dg/API_UpdateEndpoint.html#SageMaker-UpdateEndpoint-request-RetainAllVariantProperties)
     * whose value is set to `true` , `ExcludeRetainedVariantProperties` specifies the list of type
     * [VariantProperty](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpoint-variantproperty.html)
     * to override with the values provided by `EndpointConfig` . If you don't specify a value for
     * `ExcludeAllVariantProperties` , no variant properties are overridden. Don't use this property
     * when creating new endpoint resources or when `RetainAllVariantProperties` is set to `false` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-endpoint.html#cfn-sagemaker-endpoint-excluderetainedvariantproperties)
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
     * @param retainAllVariantProperties When updating endpoint resources, enables or disables the
     * retention of variant properties, such as the instance count or the variant weight. 
     */
    public fun retainAllVariantProperties(retainAllVariantProperties: Boolean)

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
     * @param retainAllVariantProperties When updating endpoint resources, enables or disables the
     * retention of variant properties, such as the instance count or the variant weight. 
     */
    public fun retainAllVariantProperties(retainAllVariantProperties: IResolvable)

    /**
     * Specifies whether to reuse the last deployment configuration.
     *
     * The default value is false (the configuration is not reused).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-endpoint.html#cfn-sagemaker-endpoint-retaindeploymentconfig)
     * @param retainDeploymentConfig Specifies whether to reuse the last deployment configuration. 
     */
    public fun retainDeploymentConfig(retainDeploymentConfig: Boolean)

    /**
     * Specifies whether to reuse the last deployment configuration.
     *
     * The default value is false (the configuration is not reused).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-endpoint.html#cfn-sagemaker-endpoint-retaindeploymentconfig)
     * @param retainDeploymentConfig Specifies whether to reuse the last deployment configuration. 
     */
    public fun retainDeploymentConfig(retainDeploymentConfig: IResolvable)

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
     * @param tags A list of key-value pairs to apply to this resource. 
     */
    public fun tags(tags: List<CfnTag>)

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
     * @param tags A list of key-value pairs to apply to this resource. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.sagemaker.CfnEndpoint.Builder =
        software.amazon.awscdk.services.sagemaker.CfnEndpoint.Builder.create(scope, id)

    /**
     * The deployment configuration for an endpoint, which contains the desired deployment strategy
     * and rollback configurations.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-endpoint.html#cfn-sagemaker-endpoint-deploymentconfig)
     * @param deploymentConfig The deployment configuration for an endpoint, which contains the
     * desired deployment strategy and rollback configurations. 
     */
    override fun deploymentConfig(deploymentConfig: IResolvable) {
      cdkBuilder.deploymentConfig(deploymentConfig.let(IResolvable.Companion::unwrap))
    }

    /**
     * The deployment configuration for an endpoint, which contains the desired deployment strategy
     * and rollback configurations.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-endpoint.html#cfn-sagemaker-endpoint-deploymentconfig)
     * @param deploymentConfig The deployment configuration for an endpoint, which contains the
     * desired deployment strategy and rollback configurations. 
     */
    override fun deploymentConfig(deploymentConfig: DeploymentConfigProperty) {
      cdkBuilder.deploymentConfig(deploymentConfig.let(DeploymentConfigProperty.Companion::unwrap))
    }

    /**
     * The deployment configuration for an endpoint, which contains the desired deployment strategy
     * and rollback configurations.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-endpoint.html#cfn-sagemaker-endpoint-deploymentconfig)
     * @param deploymentConfig The deployment configuration for an endpoint, which contains the
     * desired deployment strategy and rollback configurations. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a541c408e70416a81e50a6f3c53ab0ea85b12aaa791ea908466a2e921fa9fd67")
    override fun deploymentConfig(deploymentConfig: DeploymentConfigProperty.Builder.() -> Unit):
        Unit = deploymentConfig(DeploymentConfigProperty(deploymentConfig))

    /**
     * The name of the
     * [AWS::SageMaker::EndpointConfig](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-endpointconfig.html)
     * resource that specifies the configuration for the endpoint. For more information, see
     * [CreateEndpointConfig](https://docs.aws.amazon.com/sagemaker/latest/dg/API_CreateEndpointConfig.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-endpoint.html#cfn-sagemaker-endpoint-endpointconfigname)
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
     * The name of the endpoint.The name must be unique within an AWS Region in your AWS account.
     * The name is case-insensitive in `CreateEndpoint` , but the case is preserved and must be matched
     * in [](https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_runtime_InvokeEndpoint.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-endpoint.html#cfn-sagemaker-endpoint-endpointname)
     * @param endpointName The name of the endpoint.The name must be unique within an AWS Region in
     * your AWS account. The name is case-insensitive in `CreateEndpoint` , but the case is preserved
     * and must be matched in
     * [](https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_runtime_InvokeEndpoint.html) . 
     */
    override fun endpointName(endpointName: String) {
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
     * When you are updating endpoint resources with
     * [RetainAllVariantProperties](https://docs.aws.amazon.com/sagemaker/latest/dg/API_UpdateEndpoint.html#SageMaker-UpdateEndpoint-request-RetainAllVariantProperties)
     * whose value is set to `true` , `ExcludeRetainedVariantProperties` specifies the list of type
     * [VariantProperty](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpoint-variantproperty.html)
     * to override with the values provided by `EndpointConfig` . If you don't specify a value for
     * `ExcludeAllVariantProperties` , no variant properties are overridden. Don't use this property
     * when creating new endpoint resources or when `RetainAllVariantProperties` is set to `false` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-endpoint.html#cfn-sagemaker-endpoint-excluderetainedvariantproperties)
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
     * When you are updating endpoint resources with
     * [RetainAllVariantProperties](https://docs.aws.amazon.com/sagemaker/latest/dg/API_UpdateEndpoint.html#SageMaker-UpdateEndpoint-request-RetainAllVariantProperties)
     * whose value is set to `true` , `ExcludeRetainedVariantProperties` specifies the list of type
     * [VariantProperty](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpoint-variantproperty.html)
     * to override with the values provided by `EndpointConfig` . If you don't specify a value for
     * `ExcludeAllVariantProperties` , no variant properties are overridden. Don't use this property
     * when creating new endpoint resources or when `RetainAllVariantProperties` is set to `false` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-endpoint.html#cfn-sagemaker-endpoint-excluderetainedvariantproperties)
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
     * @param retainAllVariantProperties When updating endpoint resources, enables or disables the
     * retention of variant properties, such as the instance count or the variant weight. 
     */
    override fun retainAllVariantProperties(retainAllVariantProperties: Boolean) {
      cdkBuilder.retainAllVariantProperties(retainAllVariantProperties)
    }

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
     * @param retainAllVariantProperties When updating endpoint resources, enables or disables the
     * retention of variant properties, such as the instance count or the variant weight. 
     */
    override fun retainAllVariantProperties(retainAllVariantProperties: IResolvable) {
      cdkBuilder.retainAllVariantProperties(retainAllVariantProperties.let(IResolvable.Companion::unwrap))
    }

    /**
     * Specifies whether to reuse the last deployment configuration.
     *
     * The default value is false (the configuration is not reused).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-endpoint.html#cfn-sagemaker-endpoint-retaindeploymentconfig)
     * @param retainDeploymentConfig Specifies whether to reuse the last deployment configuration. 
     */
    override fun retainDeploymentConfig(retainDeploymentConfig: Boolean) {
      cdkBuilder.retainDeploymentConfig(retainDeploymentConfig)
    }

    /**
     * Specifies whether to reuse the last deployment configuration.
     *
     * The default value is false (the configuration is not reused).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-endpoint.html#cfn-sagemaker-endpoint-retaindeploymentconfig)
     * @param retainDeploymentConfig Specifies whether to reuse the last deployment configuration. 
     */
    override fun retainDeploymentConfig(retainDeploymentConfig: IResolvable) {
      cdkBuilder.retainDeploymentConfig(retainDeploymentConfig.let(IResolvable.Companion::unwrap))
    }

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
     * @param tags A list of key-value pairs to apply to this resource. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

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
     * @param tags A list of key-value pairs to apply to this resource. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.sagemaker.CfnEndpoint = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.sagemaker.CfnEndpoint.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnEndpoint {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnEndpoint(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnEndpoint): CfnEndpoint
        = CfnEndpoint(cdkObject)

    internal fun unwrap(wrapped: CfnEndpoint): software.amazon.awscdk.services.sagemaker.CfnEndpoint
        = wrapped.cdkObject as software.amazon.awscdk.services.sagemaker.CfnEndpoint
  }

  /**
   * An Amazon CloudWatch alarm configured to monitor metrics on an endpoint.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sagemaker.*;
   * AlarmProperty alarmProperty = AlarmProperty.builder()
   * .alarmName("alarmName")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpoint-alarm.html)
   */
  public interface AlarmProperty {
    /**
     * The name of a CloudWatch alarm in your account.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpoint-alarm.html#cfn-sagemaker-endpoint-alarm-alarmname)
     */
    public fun alarmName(): String

    /**
     * A builder for [AlarmProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param alarmName The name of a CloudWatch alarm in your account. 
       */
      public fun alarmName(alarmName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnEndpoint.AlarmProperty.Builder =
          software.amazon.awscdk.services.sagemaker.CfnEndpoint.AlarmProperty.builder()

      /**
       * @param alarmName The name of a CloudWatch alarm in your account. 
       */
      override fun alarmName(alarmName: String) {
        cdkBuilder.alarmName(alarmName)
      }

      public fun build(): software.amazon.awscdk.services.sagemaker.CfnEndpoint.AlarmProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.sagemaker.CfnEndpoint.AlarmProperty,
    ) : CdkObject(cdkObject), AlarmProperty {
      /**
       * The name of a CloudWatch alarm in your account.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpoint-alarm.html#cfn-sagemaker-endpoint-alarm-alarmname)
       */
      override fun alarmName(): String = unwrap(this).getAlarmName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AlarmProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnEndpoint.AlarmProperty):
          AlarmProperty = CdkObjectWrappers.wrap(cdkObject) as? AlarmProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: AlarmProperty):
          software.amazon.awscdk.services.sagemaker.CfnEndpoint.AlarmProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnEndpoint.AlarmProperty
    }
  }

  /**
   * Automatic rollback configuration for handling endpoint deployment failures and recovery.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sagemaker.*;
   * AutoRollbackConfigProperty autoRollbackConfigProperty = AutoRollbackConfigProperty.builder()
   * .alarms(List.of(AlarmProperty.builder()
   * .alarmName("alarmName")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpoint-autorollbackconfig.html)
   */
  public interface AutoRollbackConfigProperty {
    /**
     * List of CloudWatch alarms in your account that are configured to monitor metrics on an
     * endpoint.
     *
     * If any alarms are tripped during a deployment, SageMaker rolls back the deployment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpoint-autorollbackconfig.html#cfn-sagemaker-endpoint-autorollbackconfig-alarms)
     */
    public fun alarms(): Any

    /**
     * A builder for [AutoRollbackConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param alarms List of CloudWatch alarms in your account that are configured to monitor
       * metrics on an endpoint. 
       * If any alarms are tripped during a deployment, SageMaker rolls back the deployment.
       */
      public fun alarms(alarms: IResolvable)

      /**
       * @param alarms List of CloudWatch alarms in your account that are configured to monitor
       * metrics on an endpoint. 
       * If any alarms are tripped during a deployment, SageMaker rolls back the deployment.
       */
      public fun alarms(alarms: List<Any>)

      /**
       * @param alarms List of CloudWatch alarms in your account that are configured to monitor
       * metrics on an endpoint. 
       * If any alarms are tripped during a deployment, SageMaker rolls back the deployment.
       */
      public fun alarms(vararg alarms: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnEndpoint.AutoRollbackConfigProperty.Builder =
          software.amazon.awscdk.services.sagemaker.CfnEndpoint.AutoRollbackConfigProperty.builder()

      /**
       * @param alarms List of CloudWatch alarms in your account that are configured to monitor
       * metrics on an endpoint. 
       * If any alarms are tripped during a deployment, SageMaker rolls back the deployment.
       */
      override fun alarms(alarms: IResolvable) {
        cdkBuilder.alarms(alarms.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param alarms List of CloudWatch alarms in your account that are configured to monitor
       * metrics on an endpoint. 
       * If any alarms are tripped during a deployment, SageMaker rolls back the deployment.
       */
      override fun alarms(alarms: List<Any>) {
        cdkBuilder.alarms(alarms.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param alarms List of CloudWatch alarms in your account that are configured to monitor
       * metrics on an endpoint. 
       * If any alarms are tripped during a deployment, SageMaker rolls back the deployment.
       */
      override fun alarms(vararg alarms: Any): Unit = alarms(alarms.toList())

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnEndpoint.AutoRollbackConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.sagemaker.CfnEndpoint.AutoRollbackConfigProperty,
    ) : CdkObject(cdkObject), AutoRollbackConfigProperty {
      /**
       * List of CloudWatch alarms in your account that are configured to monitor metrics on an
       * endpoint.
       *
       * If any alarms are tripped during a deployment, SageMaker rolls back the deployment.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpoint-autorollbackconfig.html#cfn-sagemaker-endpoint-autorollbackconfig-alarms)
       */
      override fun alarms(): Any = unwrap(this).getAlarms()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AutoRollbackConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnEndpoint.AutoRollbackConfigProperty):
          AutoRollbackConfigProperty = CdkObjectWrappers.wrap(cdkObject) as?
          AutoRollbackConfigProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: AutoRollbackConfigProperty):
          software.amazon.awscdk.services.sagemaker.CfnEndpoint.AutoRollbackConfigProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnEndpoint.AutoRollbackConfigProperty
    }
  }

  /**
   * Update policy for a blue/green deployment.
   *
   * If this update policy is specified, SageMaker creates a new fleet during the deployment while
   * maintaining the old fleet. SageMaker flips traffic to the new fleet according to the specified
   * traffic routing configuration. Only one update policy should be used in the deployment
   * configuration. If no update policy is specified, SageMaker uses a blue/green deployment strategy
   * with all at once traffic shifting by default.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sagemaker.*;
   * BlueGreenUpdatePolicyProperty blueGreenUpdatePolicyProperty =
   * BlueGreenUpdatePolicyProperty.builder()
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpoint-bluegreenupdatepolicy.html)
   */
  public interface BlueGreenUpdatePolicyProperty {
    /**
     * Maximum execution timeout for the deployment.
     *
     * Note that the timeout value should be larger than the total waiting time specified in
     * `TerminationWaitInSeconds` and `WaitIntervalInSeconds` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpoint-bluegreenupdatepolicy.html#cfn-sagemaker-endpoint-bluegreenupdatepolicy-maximumexecutiontimeoutinseconds)
     */
    public fun maximumExecutionTimeoutInSeconds(): Number? =
        unwrap(this).getMaximumExecutionTimeoutInSeconds()

    /**
     * Additional waiting time in seconds after the completion of an endpoint deployment before
     * terminating the old endpoint fleet.
     *
     * Default is 0.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpoint-bluegreenupdatepolicy.html#cfn-sagemaker-endpoint-bluegreenupdatepolicy-terminationwaitinseconds)
     */
    public fun terminationWaitInSeconds(): Number? = unwrap(this).getTerminationWaitInSeconds()

    /**
     * Defines the traffic routing strategy to shift traffic from the old fleet to the new fleet
     * during an endpoint deployment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpoint-bluegreenupdatepolicy.html#cfn-sagemaker-endpoint-bluegreenupdatepolicy-trafficroutingconfiguration)
     */
    public fun trafficRoutingConfiguration(): Any

    /**
     * A builder for [BlueGreenUpdatePolicyProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param maximumExecutionTimeoutInSeconds Maximum execution timeout for the deployment.
       * Note that the timeout value should be larger than the total waiting time specified in
       * `TerminationWaitInSeconds` and `WaitIntervalInSeconds` .
       */
      public fun maximumExecutionTimeoutInSeconds(maximumExecutionTimeoutInSeconds: Number)

      /**
       * @param terminationWaitInSeconds Additional waiting time in seconds after the completion of
       * an endpoint deployment before terminating the old endpoint fleet.
       * Default is 0.
       */
      public fun terminationWaitInSeconds(terminationWaitInSeconds: Number)

      /**
       * @param trafficRoutingConfiguration Defines the traffic routing strategy to shift traffic
       * from the old fleet to the new fleet during an endpoint deployment. 
       */
      public fun trafficRoutingConfiguration(trafficRoutingConfiguration: IResolvable)

      /**
       * @param trafficRoutingConfiguration Defines the traffic routing strategy to shift traffic
       * from the old fleet to the new fleet during an endpoint deployment. 
       */
      public
          fun trafficRoutingConfiguration(trafficRoutingConfiguration: TrafficRoutingConfigProperty)

      /**
       * @param trafficRoutingConfiguration Defines the traffic routing strategy to shift traffic
       * from the old fleet to the new fleet during an endpoint deployment. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("51869a7c33e2d22e368bc328ee4247451f379d44eaf37de8dcf248ff6f736472")
      public
          fun trafficRoutingConfiguration(trafficRoutingConfiguration: TrafficRoutingConfigProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnEndpoint.BlueGreenUpdatePolicyProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnEndpoint.BlueGreenUpdatePolicyProperty.builder()

      /**
       * @param maximumExecutionTimeoutInSeconds Maximum execution timeout for the deployment.
       * Note that the timeout value should be larger than the total waiting time specified in
       * `TerminationWaitInSeconds` and `WaitIntervalInSeconds` .
       */
      override fun maximumExecutionTimeoutInSeconds(maximumExecutionTimeoutInSeconds: Number) {
        cdkBuilder.maximumExecutionTimeoutInSeconds(maximumExecutionTimeoutInSeconds)
      }

      /**
       * @param terminationWaitInSeconds Additional waiting time in seconds after the completion of
       * an endpoint deployment before terminating the old endpoint fleet.
       * Default is 0.
       */
      override fun terminationWaitInSeconds(terminationWaitInSeconds: Number) {
        cdkBuilder.terminationWaitInSeconds(terminationWaitInSeconds)
      }

      /**
       * @param trafficRoutingConfiguration Defines the traffic routing strategy to shift traffic
       * from the old fleet to the new fleet during an endpoint deployment. 
       */
      override fun trafficRoutingConfiguration(trafficRoutingConfiguration: IResolvable) {
        cdkBuilder.trafficRoutingConfiguration(trafficRoutingConfiguration.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param trafficRoutingConfiguration Defines the traffic routing strategy to shift traffic
       * from the old fleet to the new fleet during an endpoint deployment. 
       */
      override
          fun trafficRoutingConfiguration(trafficRoutingConfiguration: TrafficRoutingConfigProperty) {
        cdkBuilder.trafficRoutingConfiguration(trafficRoutingConfiguration.let(TrafficRoutingConfigProperty.Companion::unwrap))
      }

      /**
       * @param trafficRoutingConfiguration Defines the traffic routing strategy to shift traffic
       * from the old fleet to the new fleet during an endpoint deployment. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("51869a7c33e2d22e368bc328ee4247451f379d44eaf37de8dcf248ff6f736472")
      override
          fun trafficRoutingConfiguration(trafficRoutingConfiguration: TrafficRoutingConfigProperty.Builder.() -> Unit):
          Unit =
          trafficRoutingConfiguration(TrafficRoutingConfigProperty(trafficRoutingConfiguration))

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnEndpoint.BlueGreenUpdatePolicyProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.sagemaker.CfnEndpoint.BlueGreenUpdatePolicyProperty,
    ) : CdkObject(cdkObject), BlueGreenUpdatePolicyProperty {
      /**
       * Maximum execution timeout for the deployment.
       *
       * Note that the timeout value should be larger than the total waiting time specified in
       * `TerminationWaitInSeconds` and `WaitIntervalInSeconds` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpoint-bluegreenupdatepolicy.html#cfn-sagemaker-endpoint-bluegreenupdatepolicy-maximumexecutiontimeoutinseconds)
       */
      override fun maximumExecutionTimeoutInSeconds(): Number? =
          unwrap(this).getMaximumExecutionTimeoutInSeconds()

      /**
       * Additional waiting time in seconds after the completion of an endpoint deployment before
       * terminating the old endpoint fleet.
       *
       * Default is 0.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpoint-bluegreenupdatepolicy.html#cfn-sagemaker-endpoint-bluegreenupdatepolicy-terminationwaitinseconds)
       */
      override fun terminationWaitInSeconds(): Number? = unwrap(this).getTerminationWaitInSeconds()

      /**
       * Defines the traffic routing strategy to shift traffic from the old fleet to the new fleet
       * during an endpoint deployment.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpoint-bluegreenupdatepolicy.html#cfn-sagemaker-endpoint-bluegreenupdatepolicy-trafficroutingconfiguration)
       */
      override fun trafficRoutingConfiguration(): Any =
          unwrap(this).getTrafficRoutingConfiguration()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): BlueGreenUpdatePolicyProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnEndpoint.BlueGreenUpdatePolicyProperty):
          BlueGreenUpdatePolicyProperty = CdkObjectWrappers.wrap(cdkObject) as?
          BlueGreenUpdatePolicyProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: BlueGreenUpdatePolicyProperty):
          software.amazon.awscdk.services.sagemaker.CfnEndpoint.BlueGreenUpdatePolicyProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnEndpoint.BlueGreenUpdatePolicyProperty
    }
  }

  /**
   * Specifies the type and size of the endpoint capacity to activate for a blue/green deployment, a
   * rolling deployment, or a rollback strategy.
   *
   * You can specify your batches as either instance count or the overall percentage or your fleet.
   *
   * For a rollback strategy, if you don't specify the fields in this object, or if you set the
   * `Value` to 100%, then SageMaker uses a blue/green rollback strategy and rolls all traffic back to
   * the blue fleet.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sagemaker.*;
   * CapacitySizeProperty capacitySizeProperty = CapacitySizeProperty.builder()
   * .type("type")
   * .value(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpoint-capacitysize.html)
   */
  public interface CapacitySizeProperty {
    /**
     * Specifies the endpoint capacity type.
     *
     * * `INSTANCE_COUNT` : The endpoint activates based on the number of instances.
     * * `CAPACITY_PERCENT` : The endpoint activates based on the specified percentage of capacity.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpoint-capacitysize.html#cfn-sagemaker-endpoint-capacitysize-type)
     */
    public fun type(): String

    /**
     * Defines the capacity size, either as a number of instances or a capacity percentage.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpoint-capacitysize.html#cfn-sagemaker-endpoint-capacitysize-value)
     */
    public fun `value`(): Number

    /**
     * A builder for [CapacitySizeProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param type Specifies the endpoint capacity type. 
       * * `INSTANCE_COUNT` : The endpoint activates based on the number of instances.
       * * `CAPACITY_PERCENT` : The endpoint activates based on the specified percentage of
       * capacity.
       */
      public fun type(type: String)

      /**
       * @param value Defines the capacity size, either as a number of instances or a capacity
       * percentage. 
       */
      public fun `value`(`value`: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnEndpoint.CapacitySizeProperty.Builder =
          software.amazon.awscdk.services.sagemaker.CfnEndpoint.CapacitySizeProperty.builder()

      /**
       * @param type Specifies the endpoint capacity type. 
       * * `INSTANCE_COUNT` : The endpoint activates based on the number of instances.
       * * `CAPACITY_PERCENT` : The endpoint activates based on the specified percentage of
       * capacity.
       */
      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      /**
       * @param value Defines the capacity size, either as a number of instances or a capacity
       * percentage. 
       */
      override fun `value`(`value`: Number) {
        cdkBuilder.`value`(`value`)
      }

      public fun build(): software.amazon.awscdk.services.sagemaker.CfnEndpoint.CapacitySizeProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.sagemaker.CfnEndpoint.CapacitySizeProperty,
    ) : CdkObject(cdkObject), CapacitySizeProperty {
      /**
       * Specifies the endpoint capacity type.
       *
       * * `INSTANCE_COUNT` : The endpoint activates based on the number of instances.
       * * `CAPACITY_PERCENT` : The endpoint activates based on the specified percentage of
       * capacity.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpoint-capacitysize.html#cfn-sagemaker-endpoint-capacitysize-type)
       */
      override fun type(): String = unwrap(this).getType()

      /**
       * Defines the capacity size, either as a number of instances or a capacity percentage.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpoint-capacitysize.html#cfn-sagemaker-endpoint-capacitysize-value)
       */
      override fun `value`(): Number = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CapacitySizeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnEndpoint.CapacitySizeProperty):
          CapacitySizeProperty = CdkObjectWrappers.wrap(cdkObject) as? CapacitySizeProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: CapacitySizeProperty):
          software.amazon.awscdk.services.sagemaker.CfnEndpoint.CapacitySizeProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnEndpoint.CapacitySizeProperty
    }
  }

  /**
   * The deployment configuration for an endpoint, which contains the desired deployment strategy
   * and rollback configurations.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sagemaker.*;
   * DeploymentConfigProperty deploymentConfigProperty = DeploymentConfigProperty.builder()
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpoint-deploymentconfig.html)
   */
  public interface DeploymentConfigProperty {
    /**
     * Automatic rollback configuration for handling endpoint deployment failures and recovery.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpoint-deploymentconfig.html#cfn-sagemaker-endpoint-deploymentconfig-autorollbackconfiguration)
     */
    public fun autoRollbackConfiguration(): Any? = unwrap(this).getAutoRollbackConfiguration()

    /**
     * Update policy for a blue/green deployment.
     *
     * If this update policy is specified, SageMaker creates a new fleet during the deployment while
     * maintaining the old fleet. SageMaker flips traffic to the new fleet according to the specified
     * traffic routing configuration. Only one update policy should be used in the deployment
     * configuration. If no update policy is specified, SageMaker uses a blue/green deployment strategy
     * with all at once traffic shifting by default.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpoint-deploymentconfig.html#cfn-sagemaker-endpoint-deploymentconfig-bluegreenupdatepolicy)
     */
    public fun blueGreenUpdatePolicy(): Any? = unwrap(this).getBlueGreenUpdatePolicy()

    /**
     * Specifies a rolling deployment strategy for updating a SageMaker endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpoint-deploymentconfig.html#cfn-sagemaker-endpoint-deploymentconfig-rollingupdatepolicy)
     */
    public fun rollingUpdatePolicy(): Any? = unwrap(this).getRollingUpdatePolicy()

    /**
     * A builder for [DeploymentConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param autoRollbackConfiguration Automatic rollback configuration for handling endpoint
       * deployment failures and recovery.
       */
      public fun autoRollbackConfiguration(autoRollbackConfiguration: IResolvable)

      /**
       * @param autoRollbackConfiguration Automatic rollback configuration for handling endpoint
       * deployment failures and recovery.
       */
      public fun autoRollbackConfiguration(autoRollbackConfiguration: AutoRollbackConfigProperty)

      /**
       * @param autoRollbackConfiguration Automatic rollback configuration for handling endpoint
       * deployment failures and recovery.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("91c784e9b22c4fa4e9231cc0983480e54d126259089cd2d399efdba9976aae58")
      public
          fun autoRollbackConfiguration(autoRollbackConfiguration: AutoRollbackConfigProperty.Builder.() -> Unit)

      /**
       * @param blueGreenUpdatePolicy Update policy for a blue/green deployment.
       * If this update policy is specified, SageMaker creates a new fleet during the deployment
       * while maintaining the old fleet. SageMaker flips traffic to the new fleet according to the
       * specified traffic routing configuration. Only one update policy should be used in the
       * deployment configuration. If no update policy is specified, SageMaker uses a blue/green
       * deployment strategy with all at once traffic shifting by default.
       */
      public fun blueGreenUpdatePolicy(blueGreenUpdatePolicy: IResolvable)

      /**
       * @param blueGreenUpdatePolicy Update policy for a blue/green deployment.
       * If this update policy is specified, SageMaker creates a new fleet during the deployment
       * while maintaining the old fleet. SageMaker flips traffic to the new fleet according to the
       * specified traffic routing configuration. Only one update policy should be used in the
       * deployment configuration. If no update policy is specified, SageMaker uses a blue/green
       * deployment strategy with all at once traffic shifting by default.
       */
      public fun blueGreenUpdatePolicy(blueGreenUpdatePolicy: BlueGreenUpdatePolicyProperty)

      /**
       * @param blueGreenUpdatePolicy Update policy for a blue/green deployment.
       * If this update policy is specified, SageMaker creates a new fleet during the deployment
       * while maintaining the old fleet. SageMaker flips traffic to the new fleet according to the
       * specified traffic routing configuration. Only one update policy should be used in the
       * deployment configuration. If no update policy is specified, SageMaker uses a blue/green
       * deployment strategy with all at once traffic shifting by default.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b1a1c7d71c378c8c09d73dd58cc6ccfcc453f7ea516b959e0c6d54b927918e84")
      public
          fun blueGreenUpdatePolicy(blueGreenUpdatePolicy: BlueGreenUpdatePolicyProperty.Builder.() -> Unit)

      /**
       * @param rollingUpdatePolicy Specifies a rolling deployment strategy for updating a SageMaker
       * endpoint.
       */
      public fun rollingUpdatePolicy(rollingUpdatePolicy: IResolvable)

      /**
       * @param rollingUpdatePolicy Specifies a rolling deployment strategy for updating a SageMaker
       * endpoint.
       */
      public fun rollingUpdatePolicy(rollingUpdatePolicy: RollingUpdatePolicyProperty)

      /**
       * @param rollingUpdatePolicy Specifies a rolling deployment strategy for updating a SageMaker
       * endpoint.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("da9c76e6c3ab105d9e15606e840dcdcb00d8103aa17e1b3ca60bd12cd834d2cd")
      public
          fun rollingUpdatePolicy(rollingUpdatePolicy: RollingUpdatePolicyProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnEndpoint.DeploymentConfigProperty.Builder =
          software.amazon.awscdk.services.sagemaker.CfnEndpoint.DeploymentConfigProperty.builder()

      /**
       * @param autoRollbackConfiguration Automatic rollback configuration for handling endpoint
       * deployment failures and recovery.
       */
      override fun autoRollbackConfiguration(autoRollbackConfiguration: IResolvable) {
        cdkBuilder.autoRollbackConfiguration(autoRollbackConfiguration.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param autoRollbackConfiguration Automatic rollback configuration for handling endpoint
       * deployment failures and recovery.
       */
      override
          fun autoRollbackConfiguration(autoRollbackConfiguration: AutoRollbackConfigProperty) {
        cdkBuilder.autoRollbackConfiguration(autoRollbackConfiguration.let(AutoRollbackConfigProperty.Companion::unwrap))
      }

      /**
       * @param autoRollbackConfiguration Automatic rollback configuration for handling endpoint
       * deployment failures and recovery.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("91c784e9b22c4fa4e9231cc0983480e54d126259089cd2d399efdba9976aae58")
      override
          fun autoRollbackConfiguration(autoRollbackConfiguration: AutoRollbackConfigProperty.Builder.() -> Unit):
          Unit = autoRollbackConfiguration(AutoRollbackConfigProperty(autoRollbackConfiguration))

      /**
       * @param blueGreenUpdatePolicy Update policy for a blue/green deployment.
       * If this update policy is specified, SageMaker creates a new fleet during the deployment
       * while maintaining the old fleet. SageMaker flips traffic to the new fleet according to the
       * specified traffic routing configuration. Only one update policy should be used in the
       * deployment configuration. If no update policy is specified, SageMaker uses a blue/green
       * deployment strategy with all at once traffic shifting by default.
       */
      override fun blueGreenUpdatePolicy(blueGreenUpdatePolicy: IResolvable) {
        cdkBuilder.blueGreenUpdatePolicy(blueGreenUpdatePolicy.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param blueGreenUpdatePolicy Update policy for a blue/green deployment.
       * If this update policy is specified, SageMaker creates a new fleet during the deployment
       * while maintaining the old fleet. SageMaker flips traffic to the new fleet according to the
       * specified traffic routing configuration. Only one update policy should be used in the
       * deployment configuration. If no update policy is specified, SageMaker uses a blue/green
       * deployment strategy with all at once traffic shifting by default.
       */
      override fun blueGreenUpdatePolicy(blueGreenUpdatePolicy: BlueGreenUpdatePolicyProperty) {
        cdkBuilder.blueGreenUpdatePolicy(blueGreenUpdatePolicy.let(BlueGreenUpdatePolicyProperty.Companion::unwrap))
      }

      /**
       * @param blueGreenUpdatePolicy Update policy for a blue/green deployment.
       * If this update policy is specified, SageMaker creates a new fleet during the deployment
       * while maintaining the old fleet. SageMaker flips traffic to the new fleet according to the
       * specified traffic routing configuration. Only one update policy should be used in the
       * deployment configuration. If no update policy is specified, SageMaker uses a blue/green
       * deployment strategy with all at once traffic shifting by default.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b1a1c7d71c378c8c09d73dd58cc6ccfcc453f7ea516b959e0c6d54b927918e84")
      override
          fun blueGreenUpdatePolicy(blueGreenUpdatePolicy: BlueGreenUpdatePolicyProperty.Builder.() -> Unit):
          Unit = blueGreenUpdatePolicy(BlueGreenUpdatePolicyProperty(blueGreenUpdatePolicy))

      /**
       * @param rollingUpdatePolicy Specifies a rolling deployment strategy for updating a SageMaker
       * endpoint.
       */
      override fun rollingUpdatePolicy(rollingUpdatePolicy: IResolvable) {
        cdkBuilder.rollingUpdatePolicy(rollingUpdatePolicy.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param rollingUpdatePolicy Specifies a rolling deployment strategy for updating a SageMaker
       * endpoint.
       */
      override fun rollingUpdatePolicy(rollingUpdatePolicy: RollingUpdatePolicyProperty) {
        cdkBuilder.rollingUpdatePolicy(rollingUpdatePolicy.let(RollingUpdatePolicyProperty.Companion::unwrap))
      }

      /**
       * @param rollingUpdatePolicy Specifies a rolling deployment strategy for updating a SageMaker
       * endpoint.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("da9c76e6c3ab105d9e15606e840dcdcb00d8103aa17e1b3ca60bd12cd834d2cd")
      override
          fun rollingUpdatePolicy(rollingUpdatePolicy: RollingUpdatePolicyProperty.Builder.() -> Unit):
          Unit = rollingUpdatePolicy(RollingUpdatePolicyProperty(rollingUpdatePolicy))

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnEndpoint.DeploymentConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.sagemaker.CfnEndpoint.DeploymentConfigProperty,
    ) : CdkObject(cdkObject), DeploymentConfigProperty {
      /**
       * Automatic rollback configuration for handling endpoint deployment failures and recovery.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpoint-deploymentconfig.html#cfn-sagemaker-endpoint-deploymentconfig-autorollbackconfiguration)
       */
      override fun autoRollbackConfiguration(): Any? = unwrap(this).getAutoRollbackConfiguration()

      /**
       * Update policy for a blue/green deployment.
       *
       * If this update policy is specified, SageMaker creates a new fleet during the deployment
       * while maintaining the old fleet. SageMaker flips traffic to the new fleet according to the
       * specified traffic routing configuration. Only one update policy should be used in the
       * deployment configuration. If no update policy is specified, SageMaker uses a blue/green
       * deployment strategy with all at once traffic shifting by default.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpoint-deploymentconfig.html#cfn-sagemaker-endpoint-deploymentconfig-bluegreenupdatepolicy)
       */
      override fun blueGreenUpdatePolicy(): Any? = unwrap(this).getBlueGreenUpdatePolicy()

      /**
       * Specifies a rolling deployment strategy for updating a SageMaker endpoint.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpoint-deploymentconfig.html#cfn-sagemaker-endpoint-deploymentconfig-rollingupdatepolicy)
       */
      override fun rollingUpdatePolicy(): Any? = unwrap(this).getRollingUpdatePolicy()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DeploymentConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnEndpoint.DeploymentConfigProperty):
          DeploymentConfigProperty = CdkObjectWrappers.wrap(cdkObject) as? DeploymentConfigProperty
          ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: DeploymentConfigProperty):
          software.amazon.awscdk.services.sagemaker.CfnEndpoint.DeploymentConfigProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnEndpoint.DeploymentConfigProperty
    }
  }

  /**
   * Specifies a rolling deployment strategy for updating a SageMaker endpoint.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sagemaker.*;
   * RollingUpdatePolicyProperty rollingUpdatePolicyProperty = RollingUpdatePolicyProperty.builder()
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpoint-rollingupdatepolicy.html)
   */
  public interface RollingUpdatePolicyProperty {
    /**
     * Batch size for each rolling step to provision capacity and turn on traffic on the new
     * endpoint fleet, and terminate capacity on the old endpoint fleet.
     *
     * Value must be between 5% to 50% of the variant's total instance count.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpoint-rollingupdatepolicy.html#cfn-sagemaker-endpoint-rollingupdatepolicy-maximumbatchsize)
     */
    public fun maximumBatchSize(): Any

    /**
     * The time limit for the total deployment.
     *
     * Exceeding this limit causes a timeout.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpoint-rollingupdatepolicy.html#cfn-sagemaker-endpoint-rollingupdatepolicy-maximumexecutiontimeoutinseconds)
     */
    public fun maximumExecutionTimeoutInSeconds(): Number? =
        unwrap(this).getMaximumExecutionTimeoutInSeconds()

    /**
     * Batch size for rollback to the old endpoint fleet.
     *
     * Each rolling step to provision capacity and turn on traffic on the old endpoint fleet, and
     * terminate capacity on the new endpoint fleet. If this field is absent, the default value will be
     * set to 100% of total capacity which means to bring up the whole capacity of the old fleet at
     * once during rollback.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpoint-rollingupdatepolicy.html#cfn-sagemaker-endpoint-rollingupdatepolicy-rollbackmaximumbatchsize)
     */
    public fun rollbackMaximumBatchSize(): Any? = unwrap(this).getRollbackMaximumBatchSize()

    /**
     * The length of the baking period, during which SageMaker monitors alarms for each batch on the
     * new fleet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpoint-rollingupdatepolicy.html#cfn-sagemaker-endpoint-rollingupdatepolicy-waitintervalinseconds)
     */
    public fun waitIntervalInSeconds(): Number

    /**
     * A builder for [RollingUpdatePolicyProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param maximumBatchSize Batch size for each rolling step to provision capacity and turn on
       * traffic on the new endpoint fleet, and terminate capacity on the old endpoint fleet. 
       * Value must be between 5% to 50% of the variant's total instance count.
       */
      public fun maximumBatchSize(maximumBatchSize: IResolvable)

      /**
       * @param maximumBatchSize Batch size for each rolling step to provision capacity and turn on
       * traffic on the new endpoint fleet, and terminate capacity on the old endpoint fleet. 
       * Value must be between 5% to 50% of the variant's total instance count.
       */
      public fun maximumBatchSize(maximumBatchSize: CapacitySizeProperty)

      /**
       * @param maximumBatchSize Batch size for each rolling step to provision capacity and turn on
       * traffic on the new endpoint fleet, and terminate capacity on the old endpoint fleet. 
       * Value must be between 5% to 50% of the variant's total instance count.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("32b94e7fa10506ddc71461a663ace895c4b842cc406ba48b75d5b58d099d98f6")
      public fun maximumBatchSize(maximumBatchSize: CapacitySizeProperty.Builder.() -> Unit)

      /**
       * @param maximumExecutionTimeoutInSeconds The time limit for the total deployment.
       * Exceeding this limit causes a timeout.
       */
      public fun maximumExecutionTimeoutInSeconds(maximumExecutionTimeoutInSeconds: Number)

      /**
       * @param rollbackMaximumBatchSize Batch size for rollback to the old endpoint fleet.
       * Each rolling step to provision capacity and turn on traffic on the old endpoint fleet, and
       * terminate capacity on the new endpoint fleet. If this field is absent, the default value will
       * be set to 100% of total capacity which means to bring up the whole capacity of the old fleet
       * at once during rollback.
       */
      public fun rollbackMaximumBatchSize(rollbackMaximumBatchSize: IResolvable)

      /**
       * @param rollbackMaximumBatchSize Batch size for rollback to the old endpoint fleet.
       * Each rolling step to provision capacity and turn on traffic on the old endpoint fleet, and
       * terminate capacity on the new endpoint fleet. If this field is absent, the default value will
       * be set to 100% of total capacity which means to bring up the whole capacity of the old fleet
       * at once during rollback.
       */
      public fun rollbackMaximumBatchSize(rollbackMaximumBatchSize: CapacitySizeProperty)

      /**
       * @param rollbackMaximumBatchSize Batch size for rollback to the old endpoint fleet.
       * Each rolling step to provision capacity and turn on traffic on the old endpoint fleet, and
       * terminate capacity on the new endpoint fleet. If this field is absent, the default value will
       * be set to 100% of total capacity which means to bring up the whole capacity of the old fleet
       * at once during rollback.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("eebdbfee6d8c83471bb6ba6753b4e9174787cb4c3e0ce6b798ce75383ee16656")
      public
          fun rollbackMaximumBatchSize(rollbackMaximumBatchSize: CapacitySizeProperty.Builder.() -> Unit)

      /**
       * @param waitIntervalInSeconds The length of the baking period, during which SageMaker
       * monitors alarms for each batch on the new fleet. 
       */
      public fun waitIntervalInSeconds(waitIntervalInSeconds: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnEndpoint.RollingUpdatePolicyProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnEndpoint.RollingUpdatePolicyProperty.builder()

      /**
       * @param maximumBatchSize Batch size for each rolling step to provision capacity and turn on
       * traffic on the new endpoint fleet, and terminate capacity on the old endpoint fleet. 
       * Value must be between 5% to 50% of the variant's total instance count.
       */
      override fun maximumBatchSize(maximumBatchSize: IResolvable) {
        cdkBuilder.maximumBatchSize(maximumBatchSize.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param maximumBatchSize Batch size for each rolling step to provision capacity and turn on
       * traffic on the new endpoint fleet, and terminate capacity on the old endpoint fleet. 
       * Value must be between 5% to 50% of the variant's total instance count.
       */
      override fun maximumBatchSize(maximumBatchSize: CapacitySizeProperty) {
        cdkBuilder.maximumBatchSize(maximumBatchSize.let(CapacitySizeProperty.Companion::unwrap))
      }

      /**
       * @param maximumBatchSize Batch size for each rolling step to provision capacity and turn on
       * traffic on the new endpoint fleet, and terminate capacity on the old endpoint fleet. 
       * Value must be between 5% to 50% of the variant's total instance count.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("32b94e7fa10506ddc71461a663ace895c4b842cc406ba48b75d5b58d099d98f6")
      override fun maximumBatchSize(maximumBatchSize: CapacitySizeProperty.Builder.() -> Unit): Unit
          = maximumBatchSize(CapacitySizeProperty(maximumBatchSize))

      /**
       * @param maximumExecutionTimeoutInSeconds The time limit for the total deployment.
       * Exceeding this limit causes a timeout.
       */
      override fun maximumExecutionTimeoutInSeconds(maximumExecutionTimeoutInSeconds: Number) {
        cdkBuilder.maximumExecutionTimeoutInSeconds(maximumExecutionTimeoutInSeconds)
      }

      /**
       * @param rollbackMaximumBatchSize Batch size for rollback to the old endpoint fleet.
       * Each rolling step to provision capacity and turn on traffic on the old endpoint fleet, and
       * terminate capacity on the new endpoint fleet. If this field is absent, the default value will
       * be set to 100% of total capacity which means to bring up the whole capacity of the old fleet
       * at once during rollback.
       */
      override fun rollbackMaximumBatchSize(rollbackMaximumBatchSize: IResolvable) {
        cdkBuilder.rollbackMaximumBatchSize(rollbackMaximumBatchSize.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param rollbackMaximumBatchSize Batch size for rollback to the old endpoint fleet.
       * Each rolling step to provision capacity and turn on traffic on the old endpoint fleet, and
       * terminate capacity on the new endpoint fleet. If this field is absent, the default value will
       * be set to 100% of total capacity which means to bring up the whole capacity of the old fleet
       * at once during rollback.
       */
      override fun rollbackMaximumBatchSize(rollbackMaximumBatchSize: CapacitySizeProperty) {
        cdkBuilder.rollbackMaximumBatchSize(rollbackMaximumBatchSize.let(CapacitySizeProperty.Companion::unwrap))
      }

      /**
       * @param rollbackMaximumBatchSize Batch size for rollback to the old endpoint fleet.
       * Each rolling step to provision capacity and turn on traffic on the old endpoint fleet, and
       * terminate capacity on the new endpoint fleet. If this field is absent, the default value will
       * be set to 100% of total capacity which means to bring up the whole capacity of the old fleet
       * at once during rollback.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("eebdbfee6d8c83471bb6ba6753b4e9174787cb4c3e0ce6b798ce75383ee16656")
      override
          fun rollbackMaximumBatchSize(rollbackMaximumBatchSize: CapacitySizeProperty.Builder.() -> Unit):
          Unit = rollbackMaximumBatchSize(CapacitySizeProperty(rollbackMaximumBatchSize))

      /**
       * @param waitIntervalInSeconds The length of the baking period, during which SageMaker
       * monitors alarms for each batch on the new fleet. 
       */
      override fun waitIntervalInSeconds(waitIntervalInSeconds: Number) {
        cdkBuilder.waitIntervalInSeconds(waitIntervalInSeconds)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnEndpoint.RollingUpdatePolicyProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.sagemaker.CfnEndpoint.RollingUpdatePolicyProperty,
    ) : CdkObject(cdkObject), RollingUpdatePolicyProperty {
      /**
       * Batch size for each rolling step to provision capacity and turn on traffic on the new
       * endpoint fleet, and terminate capacity on the old endpoint fleet.
       *
       * Value must be between 5% to 50% of the variant's total instance count.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpoint-rollingupdatepolicy.html#cfn-sagemaker-endpoint-rollingupdatepolicy-maximumbatchsize)
       */
      override fun maximumBatchSize(): Any = unwrap(this).getMaximumBatchSize()

      /**
       * The time limit for the total deployment.
       *
       * Exceeding this limit causes a timeout.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpoint-rollingupdatepolicy.html#cfn-sagemaker-endpoint-rollingupdatepolicy-maximumexecutiontimeoutinseconds)
       */
      override fun maximumExecutionTimeoutInSeconds(): Number? =
          unwrap(this).getMaximumExecutionTimeoutInSeconds()

      /**
       * Batch size for rollback to the old endpoint fleet.
       *
       * Each rolling step to provision capacity and turn on traffic on the old endpoint fleet, and
       * terminate capacity on the new endpoint fleet. If this field is absent, the default value will
       * be set to 100% of total capacity which means to bring up the whole capacity of the old fleet
       * at once during rollback.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpoint-rollingupdatepolicy.html#cfn-sagemaker-endpoint-rollingupdatepolicy-rollbackmaximumbatchsize)
       */
      override fun rollbackMaximumBatchSize(): Any? = unwrap(this).getRollbackMaximumBatchSize()

      /**
       * The length of the baking period, during which SageMaker monitors alarms for each batch on
       * the new fleet.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpoint-rollingupdatepolicy.html#cfn-sagemaker-endpoint-rollingupdatepolicy-waitintervalinseconds)
       */
      override fun waitIntervalInSeconds(): Number = unwrap(this).getWaitIntervalInSeconds()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): RollingUpdatePolicyProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnEndpoint.RollingUpdatePolicyProperty):
          RollingUpdatePolicyProperty = CdkObjectWrappers.wrap(cdkObject) as?
          RollingUpdatePolicyProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: RollingUpdatePolicyProperty):
          software.amazon.awscdk.services.sagemaker.CfnEndpoint.RollingUpdatePolicyProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnEndpoint.RollingUpdatePolicyProperty
    }
  }

  /**
   * Defines the traffic routing strategy during an endpoint deployment to shift traffic from the
   * old fleet to the new fleet.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sagemaker.*;
   * TrafficRoutingConfigProperty trafficRoutingConfigProperty =
   * TrafficRoutingConfigProperty.builder()
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpoint-trafficroutingconfig.html)
   */
  public interface TrafficRoutingConfigProperty {
    /**
     * Batch size for the first step to turn on traffic on the new endpoint fleet.
     *
     * `Value` must be less than or equal to 50% of the variant's total instance count.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpoint-trafficroutingconfig.html#cfn-sagemaker-endpoint-trafficroutingconfig-canarysize)
     */
    public fun canarySize(): Any? = unwrap(this).getCanarySize()

    /**
     * Batch size for each step to turn on traffic on the new endpoint fleet.
     *
     * `Value` must be 10-50% of the variant's total instance count.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpoint-trafficroutingconfig.html#cfn-sagemaker-endpoint-trafficroutingconfig-linearstepsize)
     */
    public fun linearStepSize(): Any? = unwrap(this).getLinearStepSize()

    /**
     * Traffic routing strategy type.
     *
     * * `ALL_AT_ONCE` : Endpoint traffic shifts to the new fleet in a single step.
     * * `CANARY` : Endpoint traffic shifts to the new fleet in two steps. The first step is the
     * canary, which is a small portion of the traffic. The second step is the remainder of the
     * traffic.
     * * `LINEAR` : Endpoint traffic shifts to the new fleet in n steps of a configurable size.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpoint-trafficroutingconfig.html#cfn-sagemaker-endpoint-trafficroutingconfig-type)
     */
    public fun type(): String

    /**
     * The waiting time (in seconds) between incremental steps to turn on traffic on the new
     * endpoint fleet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpoint-trafficroutingconfig.html#cfn-sagemaker-endpoint-trafficroutingconfig-waitintervalinseconds)
     */
    public fun waitIntervalInSeconds(): Number? = unwrap(this).getWaitIntervalInSeconds()

    /**
     * A builder for [TrafficRoutingConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param canarySize Batch size for the first step to turn on traffic on the new endpoint
       * fleet.
       * `Value` must be less than or equal to 50% of the variant's total instance count.
       */
      public fun canarySize(canarySize: IResolvable)

      /**
       * @param canarySize Batch size for the first step to turn on traffic on the new endpoint
       * fleet.
       * `Value` must be less than or equal to 50% of the variant's total instance count.
       */
      public fun canarySize(canarySize: CapacitySizeProperty)

      /**
       * @param canarySize Batch size for the first step to turn on traffic on the new endpoint
       * fleet.
       * `Value` must be less than or equal to 50% of the variant's total instance count.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("30c71f5bea9be0b32e1b90249590a39011c7ed824dd03e8f24610eedb0153327")
      public fun canarySize(canarySize: CapacitySizeProperty.Builder.() -> Unit)

      /**
       * @param linearStepSize Batch size for each step to turn on traffic on the new endpoint
       * fleet.
       * `Value` must be 10-50% of the variant's total instance count.
       */
      public fun linearStepSize(linearStepSize: IResolvable)

      /**
       * @param linearStepSize Batch size for each step to turn on traffic on the new endpoint
       * fleet.
       * `Value` must be 10-50% of the variant's total instance count.
       */
      public fun linearStepSize(linearStepSize: CapacitySizeProperty)

      /**
       * @param linearStepSize Batch size for each step to turn on traffic on the new endpoint
       * fleet.
       * `Value` must be 10-50% of the variant's total instance count.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6f4e7862c25a4542dca6816d79476a0bfbaf5837819073237189a60f8a763343")
      public fun linearStepSize(linearStepSize: CapacitySizeProperty.Builder.() -> Unit)

      /**
       * @param type Traffic routing strategy type. 
       * * `ALL_AT_ONCE` : Endpoint traffic shifts to the new fleet in a single step.
       * * `CANARY` : Endpoint traffic shifts to the new fleet in two steps. The first step is the
       * canary, which is a small portion of the traffic. The second step is the remainder of the
       * traffic.
       * * `LINEAR` : Endpoint traffic shifts to the new fleet in n steps of a configurable size.
       */
      public fun type(type: String)

      /**
       * @param waitIntervalInSeconds The waiting time (in seconds) between incremental steps to
       * turn on traffic on the new endpoint fleet.
       */
      public fun waitIntervalInSeconds(waitIntervalInSeconds: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnEndpoint.TrafficRoutingConfigProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnEndpoint.TrafficRoutingConfigProperty.builder()

      /**
       * @param canarySize Batch size for the first step to turn on traffic on the new endpoint
       * fleet.
       * `Value` must be less than or equal to 50% of the variant's total instance count.
       */
      override fun canarySize(canarySize: IResolvable) {
        cdkBuilder.canarySize(canarySize.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param canarySize Batch size for the first step to turn on traffic on the new endpoint
       * fleet.
       * `Value` must be less than or equal to 50% of the variant's total instance count.
       */
      override fun canarySize(canarySize: CapacitySizeProperty) {
        cdkBuilder.canarySize(canarySize.let(CapacitySizeProperty.Companion::unwrap))
      }

      /**
       * @param canarySize Batch size for the first step to turn on traffic on the new endpoint
       * fleet.
       * `Value` must be less than or equal to 50% of the variant's total instance count.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("30c71f5bea9be0b32e1b90249590a39011c7ed824dd03e8f24610eedb0153327")
      override fun canarySize(canarySize: CapacitySizeProperty.Builder.() -> Unit): Unit =
          canarySize(CapacitySizeProperty(canarySize))

      /**
       * @param linearStepSize Batch size for each step to turn on traffic on the new endpoint
       * fleet.
       * `Value` must be 10-50% of the variant's total instance count.
       */
      override fun linearStepSize(linearStepSize: IResolvable) {
        cdkBuilder.linearStepSize(linearStepSize.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param linearStepSize Batch size for each step to turn on traffic on the new endpoint
       * fleet.
       * `Value` must be 10-50% of the variant's total instance count.
       */
      override fun linearStepSize(linearStepSize: CapacitySizeProperty) {
        cdkBuilder.linearStepSize(linearStepSize.let(CapacitySizeProperty.Companion::unwrap))
      }

      /**
       * @param linearStepSize Batch size for each step to turn on traffic on the new endpoint
       * fleet.
       * `Value` must be 10-50% of the variant's total instance count.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6f4e7862c25a4542dca6816d79476a0bfbaf5837819073237189a60f8a763343")
      override fun linearStepSize(linearStepSize: CapacitySizeProperty.Builder.() -> Unit): Unit =
          linearStepSize(CapacitySizeProperty(linearStepSize))

      /**
       * @param type Traffic routing strategy type. 
       * * `ALL_AT_ONCE` : Endpoint traffic shifts to the new fleet in a single step.
       * * `CANARY` : Endpoint traffic shifts to the new fleet in two steps. The first step is the
       * canary, which is a small portion of the traffic. The second step is the remainder of the
       * traffic.
       * * `LINEAR` : Endpoint traffic shifts to the new fleet in n steps of a configurable size.
       */
      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      /**
       * @param waitIntervalInSeconds The waiting time (in seconds) between incremental steps to
       * turn on traffic on the new endpoint fleet.
       */
      override fun waitIntervalInSeconds(waitIntervalInSeconds: Number) {
        cdkBuilder.waitIntervalInSeconds(waitIntervalInSeconds)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnEndpoint.TrafficRoutingConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.sagemaker.CfnEndpoint.TrafficRoutingConfigProperty,
    ) : CdkObject(cdkObject), TrafficRoutingConfigProperty {
      /**
       * Batch size for the first step to turn on traffic on the new endpoint fleet.
       *
       * `Value` must be less than or equal to 50% of the variant's total instance count.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpoint-trafficroutingconfig.html#cfn-sagemaker-endpoint-trafficroutingconfig-canarysize)
       */
      override fun canarySize(): Any? = unwrap(this).getCanarySize()

      /**
       * Batch size for each step to turn on traffic on the new endpoint fleet.
       *
       * `Value` must be 10-50% of the variant's total instance count.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpoint-trafficroutingconfig.html#cfn-sagemaker-endpoint-trafficroutingconfig-linearstepsize)
       */
      override fun linearStepSize(): Any? = unwrap(this).getLinearStepSize()

      /**
       * Traffic routing strategy type.
       *
       * * `ALL_AT_ONCE` : Endpoint traffic shifts to the new fleet in a single step.
       * * `CANARY` : Endpoint traffic shifts to the new fleet in two steps. The first step is the
       * canary, which is a small portion of the traffic. The second step is the remainder of the
       * traffic.
       * * `LINEAR` : Endpoint traffic shifts to the new fleet in n steps of a configurable size.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpoint-trafficroutingconfig.html#cfn-sagemaker-endpoint-trafficroutingconfig-type)
       */
      override fun type(): String = unwrap(this).getType()

      /**
       * The waiting time (in seconds) between incremental steps to turn on traffic on the new
       * endpoint fleet.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpoint-trafficroutingconfig.html#cfn-sagemaker-endpoint-trafficroutingconfig-waitintervalinseconds)
       */
      override fun waitIntervalInSeconds(): Number? = unwrap(this).getWaitIntervalInSeconds()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): TrafficRoutingConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnEndpoint.TrafficRoutingConfigProperty):
          TrafficRoutingConfigProperty = CdkObjectWrappers.wrap(cdkObject) as?
          TrafficRoutingConfigProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: TrafficRoutingConfigProperty):
          software.amazon.awscdk.services.sagemaker.CfnEndpoint.TrafficRoutingConfigProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnEndpoint.TrafficRoutingConfigProperty
    }
  }

  /**
   * Specifies a production variant property type for an Endpoint.
   *
   * If you are updating an Endpoint with the
   * [RetainAllVariantProperties](https://docs.aws.amazon.com/sagemaker/latest/dg/API_UpdateEndpoint.html#SageMaker-UpdateEndpoint-request-RetainAllVariantProperties)
   * option set to `true` , the `VarientProperty` objects listed in
   * [ExcludeRetainedVariantProperties](https://docs.aws.amazon.com/sagemaker/latest/dg/API_UpdateEndpoint.html#SageMaker-UpdateEndpoint-request-ExcludeRetainedVariantProperties)
   * override the existing variant properties of the Endpoint.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sagemaker.*;
   * VariantPropertyProperty variantPropertyProperty = VariantPropertyProperty.builder()
   * .variantPropertyType("variantPropertyType")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpoint-variantproperty.html)
   */
  public interface VariantPropertyProperty {
    /**
     * The type of variant property. The supported values are:.
     *
     * * `DesiredInstanceCount` : Overrides the existing variant instance counts using the
     * [InitialInstanceCount](https://docs.aws.amazon.com/sagemaker/latest/dg/API_ProductionVariant.html#SageMaker-Type-ProductionVariant-InitialInstanceCount)
     * values in the
     * [ProductionVariants](https://docs.aws.amazon.com/sagemaker/latest/dg/API_CreateEndpointConfig.html#SageMaker-CreateEndpointConfig-request-ProductionVariants)
     * .
     * * `DesiredWeight` : Overrides the existing variant weights using the
     * [InitialVariantWeight](https://docs.aws.amazon.com/sagemaker/latest/dg/API_ProductionVariant.html#SageMaker-Type-ProductionVariant-InitialVariantWeight)
     * values in the
     * [ProductionVariants](https://docs.aws.amazon.com/sagemaker/latest/dg/API_CreateEndpointConfig.html#SageMaker-CreateEndpointConfig-request-ProductionVariants)
     * .
     * * `DataCaptureConfig` : (Not currently supported.)
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpoint-variantproperty.html#cfn-sagemaker-endpoint-variantproperty-variantpropertytype)
     */
    public fun variantPropertyType(): String? = unwrap(this).getVariantPropertyType()

    /**
     * A builder for [VariantPropertyProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param variantPropertyType The type of variant property. The supported values are:.
       * * `DesiredInstanceCount` : Overrides the existing variant instance counts using the
       * [InitialInstanceCount](https://docs.aws.amazon.com/sagemaker/latest/dg/API_ProductionVariant.html#SageMaker-Type-ProductionVariant-InitialInstanceCount)
       * values in the
       * [ProductionVariants](https://docs.aws.amazon.com/sagemaker/latest/dg/API_CreateEndpointConfig.html#SageMaker-CreateEndpointConfig-request-ProductionVariants)
       * .
       * * `DesiredWeight` : Overrides the existing variant weights using the
       * [InitialVariantWeight](https://docs.aws.amazon.com/sagemaker/latest/dg/API_ProductionVariant.html#SageMaker-Type-ProductionVariant-InitialVariantWeight)
       * values in the
       * [ProductionVariants](https://docs.aws.amazon.com/sagemaker/latest/dg/API_CreateEndpointConfig.html#SageMaker-CreateEndpointConfig-request-ProductionVariants)
       * .
       * * `DataCaptureConfig` : (Not currently supported.)
       */
      public fun variantPropertyType(variantPropertyType: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnEndpoint.VariantPropertyProperty.Builder =
          software.amazon.awscdk.services.sagemaker.CfnEndpoint.VariantPropertyProperty.builder()

      /**
       * @param variantPropertyType The type of variant property. The supported values are:.
       * * `DesiredInstanceCount` : Overrides the existing variant instance counts using the
       * [InitialInstanceCount](https://docs.aws.amazon.com/sagemaker/latest/dg/API_ProductionVariant.html#SageMaker-Type-ProductionVariant-InitialInstanceCount)
       * values in the
       * [ProductionVariants](https://docs.aws.amazon.com/sagemaker/latest/dg/API_CreateEndpointConfig.html#SageMaker-CreateEndpointConfig-request-ProductionVariants)
       * .
       * * `DesiredWeight` : Overrides the existing variant weights using the
       * [InitialVariantWeight](https://docs.aws.amazon.com/sagemaker/latest/dg/API_ProductionVariant.html#SageMaker-Type-ProductionVariant-InitialVariantWeight)
       * values in the
       * [ProductionVariants](https://docs.aws.amazon.com/sagemaker/latest/dg/API_CreateEndpointConfig.html#SageMaker-CreateEndpointConfig-request-ProductionVariants)
       * .
       * * `DataCaptureConfig` : (Not currently supported.)
       */
      override fun variantPropertyType(variantPropertyType: String) {
        cdkBuilder.variantPropertyType(variantPropertyType)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnEndpoint.VariantPropertyProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.sagemaker.CfnEndpoint.VariantPropertyProperty,
    ) : CdkObject(cdkObject), VariantPropertyProperty {
      /**
       * The type of variant property. The supported values are:.
       *
       * * `DesiredInstanceCount` : Overrides the existing variant instance counts using the
       * [InitialInstanceCount](https://docs.aws.amazon.com/sagemaker/latest/dg/API_ProductionVariant.html#SageMaker-Type-ProductionVariant-InitialInstanceCount)
       * values in the
       * [ProductionVariants](https://docs.aws.amazon.com/sagemaker/latest/dg/API_CreateEndpointConfig.html#SageMaker-CreateEndpointConfig-request-ProductionVariants)
       * .
       * * `DesiredWeight` : Overrides the existing variant weights using the
       * [InitialVariantWeight](https://docs.aws.amazon.com/sagemaker/latest/dg/API_ProductionVariant.html#SageMaker-Type-ProductionVariant-InitialVariantWeight)
       * values in the
       * [ProductionVariants](https://docs.aws.amazon.com/sagemaker/latest/dg/API_CreateEndpointConfig.html#SageMaker-CreateEndpointConfig-request-ProductionVariants)
       * .
       * * `DataCaptureConfig` : (Not currently supported.)
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpoint-variantproperty.html#cfn-sagemaker-endpoint-variantproperty-variantpropertytype)
       */
      override fun variantPropertyType(): String? = unwrap(this).getVariantPropertyType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): VariantPropertyProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnEndpoint.VariantPropertyProperty):
          VariantPropertyProperty = CdkObjectWrappers.wrap(cdkObject) as? VariantPropertyProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: VariantPropertyProperty):
          software.amazon.awscdk.services.sagemaker.CfnEndpoint.VariantPropertyProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnEndpoint.VariantPropertyProperty
    }
  }
}
