@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sagemaker.CfnEndpointConfig
import software.constructs.Construct

@CdkDslMarker
public class CfnEndpointConfigDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnEndpointConfig.Builder = CfnEndpointConfig.Builder.create(scope, id)

  private val _productionVariants: MutableList<Any> = mutableListOf()

  private val _shadowProductionVariants: MutableList<Any> = mutableListOf()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * Specifies configuration for how an endpoint performs asynchronous inference.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-endpointconfig.html#cfn-sagemaker-endpointconfig-asyncinferenceconfig)
   * @param asyncInferenceConfig Specifies configuration for how an endpoint performs asynchronous
   * inference. 
   */
  public fun asyncInferenceConfig(asyncInferenceConfig: IResolvable) {
    cdkBuilder.asyncInferenceConfig(asyncInferenceConfig)
  }

  /**
   * Specifies configuration for how an endpoint performs asynchronous inference.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-endpointconfig.html#cfn-sagemaker-endpointconfig-asyncinferenceconfig)
   * @param asyncInferenceConfig Specifies configuration for how an endpoint performs asynchronous
   * inference. 
   */
  public
      fun asyncInferenceConfig(asyncInferenceConfig: CfnEndpointConfig.AsyncInferenceConfigProperty) {
    cdkBuilder.asyncInferenceConfig(asyncInferenceConfig)
  }

  /**
   * Specifies how to capture endpoint data for model monitor.
   *
   * The data capture configuration applies to all production variants hosted at the endpoint.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-endpointconfig.html#cfn-sagemaker-endpointconfig-datacaptureconfig)
   * @param dataCaptureConfig Specifies how to capture endpoint data for model monitor. 
   */
  public fun dataCaptureConfig(dataCaptureConfig: IResolvable) {
    cdkBuilder.dataCaptureConfig(dataCaptureConfig)
  }

  /**
   * Specifies how to capture endpoint data for model monitor.
   *
   * The data capture configuration applies to all production variants hosted at the endpoint.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-endpointconfig.html#cfn-sagemaker-endpointconfig-datacaptureconfig)
   * @param dataCaptureConfig Specifies how to capture endpoint data for model monitor. 
   */
  public fun dataCaptureConfig(dataCaptureConfig: CfnEndpointConfig.DataCaptureConfigProperty) {
    cdkBuilder.dataCaptureConfig(dataCaptureConfig)
  }

  /**
   * The name of the endpoint configuration.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-endpointconfig.html#cfn-sagemaker-endpointconfig-endpointconfigname)
   * @param endpointConfigName The name of the endpoint configuration. 
   */
  public fun endpointConfigName(endpointConfigName: String) {
    cdkBuilder.endpointConfigName(endpointConfigName)
  }

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-endpointconfig.html#cfn-sagemaker-endpointconfig-explainerconfig)
   * @param explainerConfig 
   */
  public fun explainerConfig(explainerConfig: IResolvable) {
    cdkBuilder.explainerConfig(explainerConfig)
  }

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-endpointconfig.html#cfn-sagemaker-endpointconfig-explainerconfig)
   * @param explainerConfig 
   */
  public fun explainerConfig(explainerConfig: CfnEndpointConfig.ExplainerConfigProperty) {
    cdkBuilder.explainerConfig(explainerConfig)
  }

  /**
   * The Amazon Resource Name (ARN) of an AWS Key Management Service key that Amazon SageMaker uses
   * to encrypt data on the storage volume attached to the ML compute instance that hosts the endpoint.
   *
   * * Key ID: `1234abcd-12ab-34cd-56ef-1234567890ab`
   * * Key ARN: `arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab`
   * * Alias name: `alias/ExampleAlias`
   * * Alias name ARN: `arn:aws:kms:us-west-2:111122223333:alias/ExampleAlias`
   *
   * The KMS key policy must grant permission to the IAM role that you specify in your
   * `CreateEndpoint` , `UpdateEndpoint` requests. For more information, refer to the AWS Key
   * Management Service section [Using Key Policies in AWS
   * KMS](https://docs.aws.amazon.com//kms/latest/developerguide/key-policies.html)
   *
   *
   * Certain Nitro-based instances include local storage, dependent on the instance type. Local
   * storage volumes are encrypted using a hardware module on the instance. You can't request a
   * `KmsKeyId` when using an instance type with local storage. If any of the models that you specify
   * in the `ProductionVariants` parameter use nitro-based instances with local storage, do not specify
   * a value for the `KmsKeyId` parameter. If you specify a value for `KmsKeyId` when using any
   * nitro-based instances with local storage, the call to `CreateEndpointConfig` fails.
   *
   * For a list of instance types that support local instance storage, see [Instance Store
   * Volumes](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/InstanceStorage.html#instance-store-volumes)
   * .
   *
   * For more information about local instance storage encryption, see [SSD Instance Store
   * Volumes](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ssd-instance-store.html) .
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-endpointconfig.html#cfn-sagemaker-endpointconfig-kmskeyid)
   * @param kmsKeyId The Amazon Resource Name (ARN) of an AWS Key Management Service key that Amazon
   * SageMaker uses to encrypt data on the storage volume attached to the ML compute instance that
   * hosts the endpoint. 
   */
  public fun kmsKeyId(kmsKeyId: String) {
    cdkBuilder.kmsKeyId(kmsKeyId)
  }

  /**
   * A list of `ProductionVariant` objects, one for each model that you want to host at this
   * endpoint.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-endpointconfig.html#cfn-sagemaker-endpointconfig-productionvariants)
   * @param productionVariants A list of `ProductionVariant` objects, one for each model that you
   * want to host at this endpoint. 
   */
  public fun productionVariants(vararg productionVariants: Any) {
    _productionVariants.addAll(listOf(*productionVariants))
  }

  /**
   * A list of `ProductionVariant` objects, one for each model that you want to host at this
   * endpoint.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-endpointconfig.html#cfn-sagemaker-endpointconfig-productionvariants)
   * @param productionVariants A list of `ProductionVariant` objects, one for each model that you
   * want to host at this endpoint. 
   */
  public fun productionVariants(productionVariants: Collection<Any>) {
    _productionVariants.addAll(productionVariants)
  }

  /**
   * A list of `ProductionVariant` objects, one for each model that you want to host at this
   * endpoint.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-endpointconfig.html#cfn-sagemaker-endpointconfig-productionvariants)
   * @param productionVariants A list of `ProductionVariant` objects, one for each model that you
   * want to host at this endpoint. 
   */
  public fun productionVariants(productionVariants: IResolvable) {
    cdkBuilder.productionVariants(productionVariants)
  }

  /**
   * Array of `ProductionVariant` objects.
   *
   * There is one for each model that you want to host at this endpoint in shadow mode with
   * production traffic replicated from the model specified on `ProductionVariants` . If you use this
   * field, you can only specify one variant for `ProductionVariants` and one variant for
   * `ShadowProductionVariants` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-endpointconfig.html#cfn-sagemaker-endpointconfig-shadowproductionvariants)
   * @param shadowProductionVariants Array of `ProductionVariant` objects. 
   */
  public fun shadowProductionVariants(vararg shadowProductionVariants: Any) {
    _shadowProductionVariants.addAll(listOf(*shadowProductionVariants))
  }

  /**
   * Array of `ProductionVariant` objects.
   *
   * There is one for each model that you want to host at this endpoint in shadow mode with
   * production traffic replicated from the model specified on `ProductionVariants` . If you use this
   * field, you can only specify one variant for `ProductionVariants` and one variant for
   * `ShadowProductionVariants` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-endpointconfig.html#cfn-sagemaker-endpointconfig-shadowproductionvariants)
   * @param shadowProductionVariants Array of `ProductionVariant` objects. 
   */
  public fun shadowProductionVariants(shadowProductionVariants: Collection<Any>) {
    _shadowProductionVariants.addAll(shadowProductionVariants)
  }

  /**
   * Array of `ProductionVariant` objects.
   *
   * There is one for each model that you want to host at this endpoint in shadow mode with
   * production traffic replicated from the model specified on `ProductionVariants` . If you use this
   * field, you can only specify one variant for `ProductionVariants` and one variant for
   * `ShadowProductionVariants` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-endpointconfig.html#cfn-sagemaker-endpointconfig-shadowproductionvariants)
   * @param shadowProductionVariants Array of `ProductionVariant` objects. 
   */
  public fun shadowProductionVariants(shadowProductionVariants: IResolvable) {
    cdkBuilder.shadowProductionVariants(shadowProductionVariants)
  }

  /**
   * A list of key-value pairs to apply to this resource.
   *
   * For more information, see [Resource
   * Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
   * and [Using Cost Allocation
   * Tags](https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html#allocation-what)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-endpointconfig.html#cfn-sagemaker-endpointconfig-tags)
   * @param tags A list of key-value pairs to apply to this resource. 
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * A list of key-value pairs to apply to this resource.
   *
   * For more information, see [Resource
   * Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
   * and [Using Cost Allocation
   * Tags](https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html#allocation-what)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-endpointconfig.html#cfn-sagemaker-endpointconfig-tags)
   * @param tags A list of key-value pairs to apply to this resource. 
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnEndpointConfig {
    if(_productionVariants.isNotEmpty()) cdkBuilder.productionVariants(_productionVariants)
    if(_shadowProductionVariants.isNotEmpty())
        cdkBuilder.shadowProductionVariants(_shadowProductionVariants)
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
