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
import software.amazon.awscdk.services.sagemaker.CfnEndpointConfigProps

/**
 * Properties for defining a `CfnEndpointConfig`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sagemaker.*;
 * CfnEndpointConfigProps cfnEndpointConfigProps = CfnEndpointConfigProps.builder()
 * .productionVariants(List.of(ProductionVariantProperty.builder()
 * .initialVariantWeight(123)
 * .modelName("modelName")
 * .variantName("variantName")
 * // the properties below are optional
 * .acceleratorType("acceleratorType")
 * .containerStartupHealthCheckTimeoutInSeconds(123)
 * .enableSsmAccess(false)
 * .initialInstanceCount(123)
 * .instanceType("instanceType")
 * .modelDataDownloadTimeoutInSeconds(123)
 * .serverlessConfig(ServerlessConfigProperty.builder()
 * .maxConcurrency(123)
 * .memorySizeInMb(123)
 * // the properties below are optional
 * .provisionedConcurrency(123)
 * .build())
 * .volumeSizeInGb(123)
 * .build()))
 * // the properties below are optional
 * .asyncInferenceConfig(AsyncInferenceConfigProperty.builder()
 * .outputConfig(AsyncInferenceOutputConfigProperty.builder()
 * .kmsKeyId("kmsKeyId")
 * .notificationConfig(AsyncInferenceNotificationConfigProperty.builder()
 * .errorTopic("errorTopic")
 * .includeInferenceResponseIn(List.of("includeInferenceResponseIn"))
 * .successTopic("successTopic")
 * .build())
 * .s3FailurePath("s3FailurePath")
 * .s3OutputPath("s3OutputPath")
 * .build())
 * // the properties below are optional
 * .clientConfig(AsyncInferenceClientConfigProperty.builder()
 * .maxConcurrentInvocationsPerInstance(123)
 * .build())
 * .build())
 * .dataCaptureConfig(DataCaptureConfigProperty.builder()
 * .captureOptions(List.of(CaptureOptionProperty.builder()
 * .captureMode("captureMode")
 * .build()))
 * .destinationS3Uri("destinationS3Uri")
 * .initialSamplingPercentage(123)
 * // the properties below are optional
 * .captureContentTypeHeader(CaptureContentTypeHeaderProperty.builder()
 * .csvContentTypes(List.of("csvContentTypes"))
 * .jsonContentTypes(List.of("jsonContentTypes"))
 * .build())
 * .enableCapture(false)
 * .kmsKeyId("kmsKeyId")
 * .build())
 * .endpointConfigName("endpointConfigName")
 * .explainerConfig(ExplainerConfigProperty.builder()
 * .clarifyExplainerConfig(ClarifyExplainerConfigProperty.builder()
 * .shapConfig(ClarifyShapConfigProperty.builder()
 * .shapBaselineConfig(ClarifyShapBaselineConfigProperty.builder()
 * .mimeType("mimeType")
 * .shapBaseline("shapBaseline")
 * .shapBaselineUri("shapBaselineUri")
 * .build())
 * // the properties below are optional
 * .numberOfSamples(123)
 * .seed(123)
 * .textConfig(ClarifyTextConfigProperty.builder()
 * .granularity("granularity")
 * .language("language")
 * .build())
 * .useLogit(false)
 * .build())
 * // the properties below are optional
 * .enableExplanations("enableExplanations")
 * .inferenceConfig(ClarifyInferenceConfigProperty.builder()
 * .contentTemplate("contentTemplate")
 * .featureHeaders(List.of("featureHeaders"))
 * .featuresAttribute("featuresAttribute")
 * .featureTypes(List.of("featureTypes"))
 * .labelAttribute("labelAttribute")
 * .labelHeaders(List.of("labelHeaders"))
 * .labelIndex(123)
 * .maxPayloadInMb(123)
 * .maxRecordCount(123)
 * .probabilityAttribute("probabilityAttribute")
 * .probabilityIndex(123)
 * .build())
 * .build())
 * .build())
 * .kmsKeyId("kmsKeyId")
 * .shadowProductionVariants(List.of(ProductionVariantProperty.builder()
 * .initialVariantWeight(123)
 * .modelName("modelName")
 * .variantName("variantName")
 * // the properties below are optional
 * .acceleratorType("acceleratorType")
 * .containerStartupHealthCheckTimeoutInSeconds(123)
 * .enableSsmAccess(false)
 * .initialInstanceCount(123)
 * .instanceType("instanceType")
 * .modelDataDownloadTimeoutInSeconds(123)
 * .serverlessConfig(ServerlessConfigProperty.builder()
 * .maxConcurrency(123)
 * .memorySizeInMb(123)
 * // the properties below are optional
 * .provisionedConcurrency(123)
 * .build())
 * .volumeSizeInGb(123)
 * .build()))
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-endpointconfig.html)
 */
@CdkDslMarker
public class CfnEndpointConfigPropsDsl {
  private val cdkBuilder: CfnEndpointConfigProps.Builder = CfnEndpointConfigProps.builder()

  private val _productionVariants: MutableList<Any> = mutableListOf()

  private val _shadowProductionVariants: MutableList<Any> = mutableListOf()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * @param asyncInferenceConfig Specifies configuration for how an endpoint performs asynchronous
   * inference.
   */
  public fun asyncInferenceConfig(asyncInferenceConfig: IResolvable) {
    cdkBuilder.asyncInferenceConfig(asyncInferenceConfig)
  }

  /**
   * @param asyncInferenceConfig Specifies configuration for how an endpoint performs asynchronous
   * inference.
   */
  public
      fun asyncInferenceConfig(asyncInferenceConfig: CfnEndpointConfig.AsyncInferenceConfigProperty) {
    cdkBuilder.asyncInferenceConfig(asyncInferenceConfig)
  }

  /**
   * @param dataCaptureConfig Specifies how to capture endpoint data for model monitor.
   * The data capture configuration applies to all production variants hosted at the endpoint.
   */
  public fun dataCaptureConfig(dataCaptureConfig: IResolvable) {
    cdkBuilder.dataCaptureConfig(dataCaptureConfig)
  }

  /**
   * @param dataCaptureConfig Specifies how to capture endpoint data for model monitor.
   * The data capture configuration applies to all production variants hosted at the endpoint.
   */
  public fun dataCaptureConfig(dataCaptureConfig: CfnEndpointConfig.DataCaptureConfigProperty) {
    cdkBuilder.dataCaptureConfig(dataCaptureConfig)
  }

  /**
   * @param endpointConfigName The name of the endpoint configuration.
   */
  public fun endpointConfigName(endpointConfigName: String) {
    cdkBuilder.endpointConfigName(endpointConfigName)
  }

  /**
   * @param explainerConfig the value to be set.
   */
  public fun explainerConfig(explainerConfig: IResolvable) {
    cdkBuilder.explainerConfig(explainerConfig)
  }

  /**
   * @param explainerConfig the value to be set.
   */
  public fun explainerConfig(explainerConfig: CfnEndpointConfig.ExplainerConfigProperty) {
    cdkBuilder.explainerConfig(explainerConfig)
  }

  /**
   * @param kmsKeyId The Amazon Resource Name (ARN) of an AWS Key Management Service key that Amazon
   * SageMaker uses to encrypt data on the storage volume attached to the ML compute instance that
   * hosts the endpoint.
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
   */
  public fun kmsKeyId(kmsKeyId: String) {
    cdkBuilder.kmsKeyId(kmsKeyId)
  }

  /**
   * @param productionVariants A list of `ProductionVariant` objects, one for each model that you
   * want to host at this endpoint. 
   */
  public fun productionVariants(vararg productionVariants: Any) {
    _productionVariants.addAll(listOf(*productionVariants))
  }

  /**
   * @param productionVariants A list of `ProductionVariant` objects, one for each model that you
   * want to host at this endpoint. 
   */
  public fun productionVariants(productionVariants: Collection<Any>) {
    _productionVariants.addAll(productionVariants)
  }

  /**
   * @param productionVariants A list of `ProductionVariant` objects, one for each model that you
   * want to host at this endpoint. 
   */
  public fun productionVariants(productionVariants: IResolvable) {
    cdkBuilder.productionVariants(productionVariants)
  }

  /**
   * @param shadowProductionVariants Array of `ProductionVariant` objects.
   * There is one for each model that you want to host at this endpoint in shadow mode with
   * production traffic replicated from the model specified on `ProductionVariants` . If you use this
   * field, you can only specify one variant for `ProductionVariants` and one variant for
   * `ShadowProductionVariants` .
   */
  public fun shadowProductionVariants(vararg shadowProductionVariants: Any) {
    _shadowProductionVariants.addAll(listOf(*shadowProductionVariants))
  }

  /**
   * @param shadowProductionVariants Array of `ProductionVariant` objects.
   * There is one for each model that you want to host at this endpoint in shadow mode with
   * production traffic replicated from the model specified on `ProductionVariants` . If you use this
   * field, you can only specify one variant for `ProductionVariants` and one variant for
   * `ShadowProductionVariants` .
   */
  public fun shadowProductionVariants(shadowProductionVariants: Collection<Any>) {
    _shadowProductionVariants.addAll(shadowProductionVariants)
  }

  /**
   * @param shadowProductionVariants Array of `ProductionVariant` objects.
   * There is one for each model that you want to host at this endpoint in shadow mode with
   * production traffic replicated from the model specified on `ProductionVariants` . If you use this
   * field, you can only specify one variant for `ProductionVariants` and one variant for
   * `ShadowProductionVariants` .
   */
  public fun shadowProductionVariants(shadowProductionVariants: IResolvable) {
    cdkBuilder.shadowProductionVariants(shadowProductionVariants)
  }

  /**
   * @param tags A list of key-value pairs to apply to this resource.
   * For more information, see [Resource
   * Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
   * and [Using Cost Allocation
   * Tags](https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html#allocation-what)
   * .
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
   * .
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnEndpointConfigProps {
    if(_productionVariants.isNotEmpty()) cdkBuilder.productionVariants(_productionVariants)
    if(_shadowProductionVariants.isNotEmpty())
        cdkBuilder.shadowProductionVariants(_shadowProductionVariants)
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
