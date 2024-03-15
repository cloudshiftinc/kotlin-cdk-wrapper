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
 * The `AWS::SageMaker::EndpointConfig` resource creates a configuration for an Amazon SageMaker
 * endpoint.
 *
 * For more information, see
 * [CreateEndpointConfig](https://docs.aws.amazon.com/sagemaker/latest/dg/API_CreateEndpointConfig.html)
 * in the *SageMaker Developer Guide* .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.sagemaker.*;
 * CfnEndpointConfig cfnEndpointConfig = CfnEndpointConfig.Builder.create(this,
 * "MyCfnEndpointConfig")
 * .productionVariants(List.of(ProductionVariantProperty.builder()
 * .variantName("variantName")
 * // the properties below are optional
 * .acceleratorType("acceleratorType")
 * .containerStartupHealthCheckTimeoutInSeconds(123)
 * .enableSsmAccess(false)
 * .initialInstanceCount(123)
 * .initialVariantWeight(123)
 * .instanceType("instanceType")
 * .managedInstanceScaling(ManagedInstanceScalingProperty.builder()
 * .maxInstanceCount(123)
 * .minInstanceCount(123)
 * .status("status")
 * .build())
 * .modelDataDownloadTimeoutInSeconds(123)
 * .modelName("modelName")
 * .routingConfig(RoutingConfigProperty.builder()
 * .routingStrategy("routingStrategy")
 * .build())
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
 * .enableNetworkIsolation(false)
 * .endpointConfigName("endpointConfigName")
 * .executionRoleArn("executionRoleArn")
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
 * .variantName("variantName")
 * // the properties below are optional
 * .acceleratorType("acceleratorType")
 * .containerStartupHealthCheckTimeoutInSeconds(123)
 * .enableSsmAccess(false)
 * .initialInstanceCount(123)
 * .initialVariantWeight(123)
 * .instanceType("instanceType")
 * .managedInstanceScaling(ManagedInstanceScalingProperty.builder()
 * .maxInstanceCount(123)
 * .minInstanceCount(123)
 * .status("status")
 * .build())
 * .modelDataDownloadTimeoutInSeconds(123)
 * .modelName("modelName")
 * .routingConfig(RoutingConfigProperty.builder()
 * .routingStrategy("routingStrategy")
 * .build())
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
 * .vpcConfig(VpcConfigProperty.builder()
 * .securityGroupIds(List.of("securityGroupIds"))
 * .subnets(List.of("subnets"))
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-endpointconfig.html)
 */
public open class CfnEndpointConfig internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.sagemaker.CfnEndpointConfig,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   * Specifies configuration for how an endpoint performs asynchronous inference.
   */
  public open fun asyncInferenceConfig(): Any? = unwrap(this).getAsyncInferenceConfig()

  /**
   * Specifies configuration for how an endpoint performs asynchronous inference.
   */
  public open fun asyncInferenceConfig(`value`: IResolvable) {
    unwrap(this).setAsyncInferenceConfig(`value`.let(IResolvable::unwrap))
  }

  /**
   * Specifies configuration for how an endpoint performs asynchronous inference.
   */
  public open fun asyncInferenceConfig(`value`: AsyncInferenceConfigProperty) {
    unwrap(this).setAsyncInferenceConfig(`value`.let(AsyncInferenceConfigProperty::unwrap))
  }

  /**
   * Specifies configuration for how an endpoint performs asynchronous inference.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("976bdf23661427f7a2a9a858f8bbbf9d0a296c5d136262299bfcce2b1a638c41")
  public open fun asyncInferenceConfig(`value`: AsyncInferenceConfigProperty.Builder.() -> Unit):
      Unit = asyncInferenceConfig(AsyncInferenceConfigProperty(`value`))

  /**
   * The name of the endpoint configuration, such as `MyEndpointConfiguration` .
   */
  public open fun attrEndpointConfigName(): String = unwrap(this).getAttrEndpointConfigName()

  /**
   *
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * Specifies how to capture endpoint data for model monitor.
   */
  public open fun dataCaptureConfig(): Any? = unwrap(this).getDataCaptureConfig()

  /**
   * Specifies how to capture endpoint data for model monitor.
   */
  public open fun dataCaptureConfig(`value`: IResolvable) {
    unwrap(this).setDataCaptureConfig(`value`.let(IResolvable::unwrap))
  }

  /**
   * Specifies how to capture endpoint data for model monitor.
   */
  public open fun dataCaptureConfig(`value`: DataCaptureConfigProperty) {
    unwrap(this).setDataCaptureConfig(`value`.let(DataCaptureConfigProperty::unwrap))
  }

  /**
   * Specifies how to capture endpoint data for model monitor.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("90cc48f28fc54362889d70ded327856c6bcf8cf5fdd2c88565cb10e586f1685a")
  public open fun dataCaptureConfig(`value`: DataCaptureConfigProperty.Builder.() -> Unit): Unit =
      dataCaptureConfig(DataCaptureConfigProperty(`value`))

  /**
   *
   */
  public open fun enableNetworkIsolation(): Any? = unwrap(this).getEnableNetworkIsolation()

  /**
   *
   */
  public open fun enableNetworkIsolation(`value`: Boolean) {
    unwrap(this).setEnableNetworkIsolation(`value`)
  }

  /**
   *
   */
  public open fun enableNetworkIsolation(`value`: IResolvable) {
    unwrap(this).setEnableNetworkIsolation(`value`.let(IResolvable::unwrap))
  }

  /**
   * The name of the endpoint configuration.
   */
  public open fun endpointConfigName(): String? = unwrap(this).getEndpointConfigName()

  /**
   * The name of the endpoint configuration.
   */
  public open fun endpointConfigName(`value`: String) {
    unwrap(this).setEndpointConfigName(`value`)
  }

  /**
   *
   */
  public open fun executionRoleArn(): String? = unwrap(this).getExecutionRoleArn()

  /**
   *
   */
  public open fun executionRoleArn(`value`: String) {
    unwrap(this).setExecutionRoleArn(`value`)
  }

  /**
   * A parameter to activate explainers.
   */
  public open fun explainerConfig(): Any? = unwrap(this).getExplainerConfig()

  /**
   * A parameter to activate explainers.
   */
  public open fun explainerConfig(`value`: IResolvable) {
    unwrap(this).setExplainerConfig(`value`.let(IResolvable::unwrap))
  }

  /**
   * A parameter to activate explainers.
   */
  public open fun explainerConfig(`value`: ExplainerConfigProperty) {
    unwrap(this).setExplainerConfig(`value`.let(ExplainerConfigProperty::unwrap))
  }

  /**
   * A parameter to activate explainers.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("b8709e7c75723d88b0cf8d9df2ddef570dfa484116f10dc49b246594b2ee3fb0")
  public open fun explainerConfig(`value`: ExplainerConfigProperty.Builder.() -> Unit): Unit =
      explainerConfig(ExplainerConfigProperty(`value`))

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The Amazon Resource Name (ARN) of an AWS Key Management Service key that Amazon SageMaker uses
   * to encrypt data on the storage volume attached to the ML compute instance that hosts the endpoint.
   */
  public open fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

  /**
   * The Amazon Resource Name (ARN) of an AWS Key Management Service key that Amazon SageMaker uses
   * to encrypt data on the storage volume attached to the ML compute instance that hosts the endpoint.
   */
  public open fun kmsKeyId(`value`: String) {
    unwrap(this).setKmsKeyId(`value`)
  }

  /**
   * A list of `ProductionVariant` objects, one for each model that you want to host at this
   * endpoint.
   */
  public open fun productionVariants(): Any = unwrap(this).getProductionVariants()

  /**
   * A list of `ProductionVariant` objects, one for each model that you want to host at this
   * endpoint.
   */
  public open fun productionVariants(`value`: IResolvable) {
    unwrap(this).setProductionVariants(`value`.let(IResolvable::unwrap))
  }

  /**
   * A list of `ProductionVariant` objects, one for each model that you want to host at this
   * endpoint.
   */
  public open fun productionVariants(_idx_ac66f0: List<Any>) {
    unwrap(this).setProductionVariants(_idx_ac66f0)
  }

  /**
   * A list of `ProductionVariant` objects, one for each model that you want to host at this
   * endpoint.
   */
  public open fun productionVariants(vararg _idx_ac66f0: Any): Unit =
      productionVariants(_idx_ac66f0.toList())

  /**
   * Array of `ProductionVariant` objects.
   */
  public open fun shadowProductionVariants(): Any? = unwrap(this).getShadowProductionVariants()

  /**
   * Array of `ProductionVariant` objects.
   */
  public open fun shadowProductionVariants(`value`: IResolvable) {
    unwrap(this).setShadowProductionVariants(`value`.let(IResolvable::unwrap))
  }

  /**
   * Array of `ProductionVariant` objects.
   */
  public open fun shadowProductionVariants(_idx_ac66f0: List<Any>) {
    unwrap(this).setShadowProductionVariants(_idx_ac66f0)
  }

  /**
   * Array of `ProductionVariant` objects.
   */
  public open fun shadowProductionVariants(vararg _idx_ac66f0: Any): Unit =
      shadowProductionVariants(_idx_ac66f0.toList())

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
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * A list of key-value pairs to apply to this resource.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   *
   */
  public open fun vpcConfig(): Any? = unwrap(this).getVpcConfig()

  /**
   *
   */
  public open fun vpcConfig(`value`: IResolvable) {
    unwrap(this).setVpcConfig(`value`.let(IResolvable::unwrap))
  }

  /**
   *
   */
  public open fun vpcConfig(`value`: VpcConfigProperty) {
    unwrap(this).setVpcConfig(`value`.let(VpcConfigProperty::unwrap))
  }

  /**
   *
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("0d0e0d67a782e560057042c142e413625f84277956f56c453ba72ae5de1d8654")
  public open fun vpcConfig(`value`: VpcConfigProperty.Builder.() -> Unit): Unit =
      vpcConfig(VpcConfigProperty(`value`))

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.sagemaker.CfnEndpointConfig].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Specifies configuration for how an endpoint performs asynchronous inference.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-endpointconfig.html#cfn-sagemaker-endpointconfig-asyncinferenceconfig)
     * @param asyncInferenceConfig Specifies configuration for how an endpoint performs asynchronous
     * inference. 
     */
    public fun asyncInferenceConfig(asyncInferenceConfig: IResolvable)

    /**
     * Specifies configuration for how an endpoint performs asynchronous inference.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-endpointconfig.html#cfn-sagemaker-endpointconfig-asyncinferenceconfig)
     * @param asyncInferenceConfig Specifies configuration for how an endpoint performs asynchronous
     * inference. 
     */
    public fun asyncInferenceConfig(asyncInferenceConfig: AsyncInferenceConfigProperty)

    /**
     * Specifies configuration for how an endpoint performs asynchronous inference.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-endpointconfig.html#cfn-sagemaker-endpointconfig-asyncinferenceconfig)
     * @param asyncInferenceConfig Specifies configuration for how an endpoint performs asynchronous
     * inference. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5b161f3d4c9c90e2a50a1acb77024e6445bdc5c90081a5331e349cfdd02a5eff")
    public
        fun asyncInferenceConfig(asyncInferenceConfig: AsyncInferenceConfigProperty.Builder.() -> Unit)

    /**
     * Specifies how to capture endpoint data for model monitor.
     *
     * The data capture configuration applies to all production variants hosted at the endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-endpointconfig.html#cfn-sagemaker-endpointconfig-datacaptureconfig)
     * @param dataCaptureConfig Specifies how to capture endpoint data for model monitor. 
     */
    public fun dataCaptureConfig(dataCaptureConfig: IResolvable)

    /**
     * Specifies how to capture endpoint data for model monitor.
     *
     * The data capture configuration applies to all production variants hosted at the endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-endpointconfig.html#cfn-sagemaker-endpointconfig-datacaptureconfig)
     * @param dataCaptureConfig Specifies how to capture endpoint data for model monitor. 
     */
    public fun dataCaptureConfig(dataCaptureConfig: DataCaptureConfigProperty)

    /**
     * Specifies how to capture endpoint data for model monitor.
     *
     * The data capture configuration applies to all production variants hosted at the endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-endpointconfig.html#cfn-sagemaker-endpointconfig-datacaptureconfig)
     * @param dataCaptureConfig Specifies how to capture endpoint data for model monitor. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c77feac906306e2d425d19ecb2dbb536e58a1389beb090dad924c75955f10ecf")
    public fun dataCaptureConfig(dataCaptureConfig: DataCaptureConfigProperty.Builder.() -> Unit)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-endpointconfig.html#cfn-sagemaker-endpointconfig-enablenetworkisolation)
     * @param enableNetworkIsolation 
     */
    public fun enableNetworkIsolation(enableNetworkIsolation: Boolean)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-endpointconfig.html#cfn-sagemaker-endpointconfig-enablenetworkisolation)
     * @param enableNetworkIsolation 
     */
    public fun enableNetworkIsolation(enableNetworkIsolation: IResolvable)

    /**
     * The name of the endpoint configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-endpointconfig.html#cfn-sagemaker-endpointconfig-endpointconfigname)
     * @param endpointConfigName The name of the endpoint configuration. 
     */
    public fun endpointConfigName(endpointConfigName: String)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-endpointconfig.html#cfn-sagemaker-endpointconfig-executionrolearn)
     * @param executionRoleArn 
     */
    public fun executionRoleArn(executionRoleArn: String)

    /**
     * A parameter to activate explainers.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-endpointconfig.html#cfn-sagemaker-endpointconfig-explainerconfig)
     * @param explainerConfig A parameter to activate explainers. 
     */
    public fun explainerConfig(explainerConfig: IResolvable)

    /**
     * A parameter to activate explainers.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-endpointconfig.html#cfn-sagemaker-endpointconfig-explainerconfig)
     * @param explainerConfig A parameter to activate explainers. 
     */
    public fun explainerConfig(explainerConfig: ExplainerConfigProperty)

    /**
     * A parameter to activate explainers.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-endpointconfig.html#cfn-sagemaker-endpointconfig-explainerconfig)
     * @param explainerConfig A parameter to activate explainers. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4cb18e4f82559478eb0db3989658df1207cb2f2ba889ad6285241ee2b2bf5795")
    public fun explainerConfig(explainerConfig: ExplainerConfigProperty.Builder.() -> Unit)

    /**
     * The Amazon Resource Name (ARN) of an AWS Key Management Service key that Amazon SageMaker
     * uses to encrypt data on the storage volume attached to the ML compute instance that hosts the
     * endpoint.
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
     * in the `ProductionVariants` parameter use nitro-based instances with local storage, do not
     * specify a value for the `KmsKeyId` parameter. If you specify a value for `KmsKeyId` when using
     * any nitro-based instances with local storage, the call to `CreateEndpointConfig` fails.
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
     * @param kmsKeyId The Amazon Resource Name (ARN) of an AWS Key Management Service key that
     * Amazon SageMaker uses to encrypt data on the storage volume attached to the ML compute instance
     * that hosts the endpoint. 
     */
    public fun kmsKeyId(kmsKeyId: String)

    /**
     * A list of `ProductionVariant` objects, one for each model that you want to host at this
     * endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-endpointconfig.html#cfn-sagemaker-endpointconfig-productionvariants)
     * @param productionVariants A list of `ProductionVariant` objects, one for each model that you
     * want to host at this endpoint. 
     */
    public fun productionVariants(productionVariants: IResolvable)

    /**
     * A list of `ProductionVariant` objects, one for each model that you want to host at this
     * endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-endpointconfig.html#cfn-sagemaker-endpointconfig-productionvariants)
     * @param productionVariants A list of `ProductionVariant` objects, one for each model that you
     * want to host at this endpoint. 
     */
    public fun productionVariants(productionVariants: List<Any>)

    /**
     * A list of `ProductionVariant` objects, one for each model that you want to host at this
     * endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-endpointconfig.html#cfn-sagemaker-endpointconfig-productionvariants)
     * @param productionVariants A list of `ProductionVariant` objects, one for each model that you
     * want to host at this endpoint. 
     */
    public fun productionVariants(vararg productionVariants: Any)

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
    public fun shadowProductionVariants(shadowProductionVariants: IResolvable)

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
    public fun shadowProductionVariants(shadowProductionVariants: List<Any>)

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
    public fun shadowProductionVariants(vararg shadowProductionVariants: Any)

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
    public fun tags(tags: List<CfnTag>)

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
    public fun tags(vararg tags: CfnTag)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-endpointconfig.html#cfn-sagemaker-endpointconfig-vpcconfig)
     * @param vpcConfig 
     */
    public fun vpcConfig(vpcConfig: IResolvable)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-endpointconfig.html#cfn-sagemaker-endpointconfig-vpcconfig)
     * @param vpcConfig 
     */
    public fun vpcConfig(vpcConfig: VpcConfigProperty)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-endpointconfig.html#cfn-sagemaker-endpointconfig-vpcconfig)
     * @param vpcConfig 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f0e487acd79cd44c96b3bacebbc3966f4d25697c1f1702f0beb4b09f533242be")
    public fun vpcConfig(vpcConfig: VpcConfigProperty.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.Builder =
        software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.Builder.create(scope, id)

    /**
     * Specifies configuration for how an endpoint performs asynchronous inference.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-endpointconfig.html#cfn-sagemaker-endpointconfig-asyncinferenceconfig)
     * @param asyncInferenceConfig Specifies configuration for how an endpoint performs asynchronous
     * inference. 
     */
    override fun asyncInferenceConfig(asyncInferenceConfig: IResolvable) {
      cdkBuilder.asyncInferenceConfig(asyncInferenceConfig.let(IResolvable::unwrap))
    }

    /**
     * Specifies configuration for how an endpoint performs asynchronous inference.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-endpointconfig.html#cfn-sagemaker-endpointconfig-asyncinferenceconfig)
     * @param asyncInferenceConfig Specifies configuration for how an endpoint performs asynchronous
     * inference. 
     */
    override fun asyncInferenceConfig(asyncInferenceConfig: AsyncInferenceConfigProperty) {
      cdkBuilder.asyncInferenceConfig(asyncInferenceConfig.let(AsyncInferenceConfigProperty::unwrap))
    }

    /**
     * Specifies configuration for how an endpoint performs asynchronous inference.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-endpointconfig.html#cfn-sagemaker-endpointconfig-asyncinferenceconfig)
     * @param asyncInferenceConfig Specifies configuration for how an endpoint performs asynchronous
     * inference. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5b161f3d4c9c90e2a50a1acb77024e6445bdc5c90081a5331e349cfdd02a5eff")
    override
        fun asyncInferenceConfig(asyncInferenceConfig: AsyncInferenceConfigProperty.Builder.() -> Unit):
        Unit = asyncInferenceConfig(AsyncInferenceConfigProperty(asyncInferenceConfig))

    /**
     * Specifies how to capture endpoint data for model monitor.
     *
     * The data capture configuration applies to all production variants hosted at the endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-endpointconfig.html#cfn-sagemaker-endpointconfig-datacaptureconfig)
     * @param dataCaptureConfig Specifies how to capture endpoint data for model monitor. 
     */
    override fun dataCaptureConfig(dataCaptureConfig: IResolvable) {
      cdkBuilder.dataCaptureConfig(dataCaptureConfig.let(IResolvable::unwrap))
    }

    /**
     * Specifies how to capture endpoint data for model monitor.
     *
     * The data capture configuration applies to all production variants hosted at the endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-endpointconfig.html#cfn-sagemaker-endpointconfig-datacaptureconfig)
     * @param dataCaptureConfig Specifies how to capture endpoint data for model monitor. 
     */
    override fun dataCaptureConfig(dataCaptureConfig: DataCaptureConfigProperty) {
      cdkBuilder.dataCaptureConfig(dataCaptureConfig.let(DataCaptureConfigProperty::unwrap))
    }

    /**
     * Specifies how to capture endpoint data for model monitor.
     *
     * The data capture configuration applies to all production variants hosted at the endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-endpointconfig.html#cfn-sagemaker-endpointconfig-datacaptureconfig)
     * @param dataCaptureConfig Specifies how to capture endpoint data for model monitor. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c77feac906306e2d425d19ecb2dbb536e58a1389beb090dad924c75955f10ecf")
    override fun dataCaptureConfig(dataCaptureConfig: DataCaptureConfigProperty.Builder.() -> Unit):
        Unit = dataCaptureConfig(DataCaptureConfigProperty(dataCaptureConfig))

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-endpointconfig.html#cfn-sagemaker-endpointconfig-enablenetworkisolation)
     * @param enableNetworkIsolation 
     */
    override fun enableNetworkIsolation(enableNetworkIsolation: Boolean) {
      cdkBuilder.enableNetworkIsolation(enableNetworkIsolation)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-endpointconfig.html#cfn-sagemaker-endpointconfig-enablenetworkisolation)
     * @param enableNetworkIsolation 
     */
    override fun enableNetworkIsolation(enableNetworkIsolation: IResolvable) {
      cdkBuilder.enableNetworkIsolation(enableNetworkIsolation.let(IResolvable::unwrap))
    }

    /**
     * The name of the endpoint configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-endpointconfig.html#cfn-sagemaker-endpointconfig-endpointconfigname)
     * @param endpointConfigName The name of the endpoint configuration. 
     */
    override fun endpointConfigName(endpointConfigName: String) {
      cdkBuilder.endpointConfigName(endpointConfigName)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-endpointconfig.html#cfn-sagemaker-endpointconfig-executionrolearn)
     * @param executionRoleArn 
     */
    override fun executionRoleArn(executionRoleArn: String) {
      cdkBuilder.executionRoleArn(executionRoleArn)
    }

    /**
     * A parameter to activate explainers.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-endpointconfig.html#cfn-sagemaker-endpointconfig-explainerconfig)
     * @param explainerConfig A parameter to activate explainers. 
     */
    override fun explainerConfig(explainerConfig: IResolvable) {
      cdkBuilder.explainerConfig(explainerConfig.let(IResolvable::unwrap))
    }

    /**
     * A parameter to activate explainers.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-endpointconfig.html#cfn-sagemaker-endpointconfig-explainerconfig)
     * @param explainerConfig A parameter to activate explainers. 
     */
    override fun explainerConfig(explainerConfig: ExplainerConfigProperty) {
      cdkBuilder.explainerConfig(explainerConfig.let(ExplainerConfigProperty::unwrap))
    }

    /**
     * A parameter to activate explainers.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-endpointconfig.html#cfn-sagemaker-endpointconfig-explainerconfig)
     * @param explainerConfig A parameter to activate explainers. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4cb18e4f82559478eb0db3989658df1207cb2f2ba889ad6285241ee2b2bf5795")
    override fun explainerConfig(explainerConfig: ExplainerConfigProperty.Builder.() -> Unit): Unit
        = explainerConfig(ExplainerConfigProperty(explainerConfig))

    /**
     * The Amazon Resource Name (ARN) of an AWS Key Management Service key that Amazon SageMaker
     * uses to encrypt data on the storage volume attached to the ML compute instance that hosts the
     * endpoint.
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
     * in the `ProductionVariants` parameter use nitro-based instances with local storage, do not
     * specify a value for the `KmsKeyId` parameter. If you specify a value for `KmsKeyId` when using
     * any nitro-based instances with local storage, the call to `CreateEndpointConfig` fails.
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
     * @param kmsKeyId The Amazon Resource Name (ARN) of an AWS Key Management Service key that
     * Amazon SageMaker uses to encrypt data on the storage volume attached to the ML compute instance
     * that hosts the endpoint. 
     */
    override fun kmsKeyId(kmsKeyId: String) {
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
    override fun productionVariants(productionVariants: IResolvable) {
      cdkBuilder.productionVariants(productionVariants.let(IResolvable::unwrap))
    }

    /**
     * A list of `ProductionVariant` objects, one for each model that you want to host at this
     * endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-endpointconfig.html#cfn-sagemaker-endpointconfig-productionvariants)
     * @param productionVariants A list of `ProductionVariant` objects, one for each model that you
     * want to host at this endpoint. 
     */
    override fun productionVariants(productionVariants: List<Any>) {
      cdkBuilder.productionVariants(productionVariants)
    }

    /**
     * A list of `ProductionVariant` objects, one for each model that you want to host at this
     * endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-endpointconfig.html#cfn-sagemaker-endpointconfig-productionvariants)
     * @param productionVariants A list of `ProductionVariant` objects, one for each model that you
     * want to host at this endpoint. 
     */
    override fun productionVariants(vararg productionVariants: Any): Unit =
        productionVariants(productionVariants.toList())

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
    override fun shadowProductionVariants(shadowProductionVariants: IResolvable) {
      cdkBuilder.shadowProductionVariants(shadowProductionVariants.let(IResolvable::unwrap))
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
    override fun shadowProductionVariants(shadowProductionVariants: List<Any>) {
      cdkBuilder.shadowProductionVariants(shadowProductionVariants)
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
    override fun shadowProductionVariants(vararg shadowProductionVariants: Any): Unit =
        shadowProductionVariants(shadowProductionVariants.toList())

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
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
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
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-endpointconfig.html#cfn-sagemaker-endpointconfig-vpcconfig)
     * @param vpcConfig 
     */
    override fun vpcConfig(vpcConfig: IResolvable) {
      cdkBuilder.vpcConfig(vpcConfig.let(IResolvable::unwrap))
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-endpointconfig.html#cfn-sagemaker-endpointconfig-vpcconfig)
     * @param vpcConfig 
     */
    override fun vpcConfig(vpcConfig: VpcConfigProperty) {
      cdkBuilder.vpcConfig(vpcConfig.let(VpcConfigProperty::unwrap))
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-endpointconfig.html#cfn-sagemaker-endpointconfig-vpcconfig)
     * @param vpcConfig 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f0e487acd79cd44c96b3bacebbc3966f4d25697c1f1702f0beb4b09f533242be")
    override fun vpcConfig(vpcConfig: VpcConfigProperty.Builder.() -> Unit): Unit =
        vpcConfig(VpcConfigProperty(vpcConfig))

    public fun build(): software.amazon.awscdk.services.sagemaker.CfnEndpointConfig =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnEndpointConfig {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnEndpointConfig(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnEndpointConfig):
        CfnEndpointConfig = CfnEndpointConfig(cdkObject)

    internal fun unwrap(wrapped: CfnEndpointConfig):
        software.amazon.awscdk.services.sagemaker.CfnEndpointConfig = wrapped.cdkObject
  }

  /**
   * Specifies the serverless configuration for an endpoint variant.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sagemaker.*;
   * ServerlessConfigProperty serverlessConfigProperty = ServerlessConfigProperty.builder()
   * .maxConcurrency(123)
   * .memorySizeInMb(123)
   * // the properties below are optional
   * .provisionedConcurrency(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpointconfig-serverlessconfig.html)
   */
  public interface ServerlessConfigProperty {
    /**
     * The maximum number of concurrent invocations your serverless endpoint can process.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpointconfig-serverlessconfig.html#cfn-sagemaker-endpointconfig-serverlessconfig-maxconcurrency)
     */
    public fun maxConcurrency(): Number

    /**
     * The memory size of your serverless endpoint.
     *
     * Valid values are in 1 GB increments: 1024 MB, 2048 MB, 3072 MB, 4096 MB, 5120 MB, or 6144 MB.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpointconfig-serverlessconfig.html#cfn-sagemaker-endpointconfig-serverlessconfig-memorysizeinmb)
     */
    public fun memorySizeInMb(): Number

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpointconfig-serverlessconfig.html#cfn-sagemaker-endpointconfig-serverlessconfig-provisionedconcurrency)
     */
    public fun provisionedConcurrency(): Number? = unwrap(this).getProvisionedConcurrency()

    /**
     * A builder for [ServerlessConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param maxConcurrency The maximum number of concurrent invocations your serverless endpoint
       * can process. 
       */
      public fun maxConcurrency(maxConcurrency: Number)

      /**
       * @param memorySizeInMb The memory size of your serverless endpoint. 
       * Valid values are in 1 GB increments: 1024 MB, 2048 MB, 3072 MB, 4096 MB, 5120 MB, or 6144
       * MB.
       */
      public fun memorySizeInMb(memorySizeInMb: Number)

      /**
       * @param provisionedConcurrency the value to be set.
       */
      public fun provisionedConcurrency(provisionedConcurrency: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.ServerlessConfigProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.ServerlessConfigProperty.builder()

      /**
       * @param maxConcurrency The maximum number of concurrent invocations your serverless endpoint
       * can process. 
       */
      override fun maxConcurrency(maxConcurrency: Number) {
        cdkBuilder.maxConcurrency(maxConcurrency)
      }

      /**
       * @param memorySizeInMb The memory size of your serverless endpoint. 
       * Valid values are in 1 GB increments: 1024 MB, 2048 MB, 3072 MB, 4096 MB, 5120 MB, or 6144
       * MB.
       */
      override fun memorySizeInMb(memorySizeInMb: Number) {
        cdkBuilder.memorySizeInMb(memorySizeInMb)
      }

      /**
       * @param provisionedConcurrency the value to be set.
       */
      override fun provisionedConcurrency(provisionedConcurrency: Number) {
        cdkBuilder.provisionedConcurrency(provisionedConcurrency)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.ServerlessConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.ServerlessConfigProperty,
    ) : CdkObject(cdkObject), ServerlessConfigProperty {
      /**
       * The maximum number of concurrent invocations your serverless endpoint can process.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpointconfig-serverlessconfig.html#cfn-sagemaker-endpointconfig-serverlessconfig-maxconcurrency)
       */
      override fun maxConcurrency(): Number = unwrap(this).getMaxConcurrency()

      /**
       * The memory size of your serverless endpoint.
       *
       * Valid values are in 1 GB increments: 1024 MB, 2048 MB, 3072 MB, 4096 MB, 5120 MB, or 6144
       * MB.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpointconfig-serverlessconfig.html#cfn-sagemaker-endpointconfig-serverlessconfig-memorysizeinmb)
       */
      override fun memorySizeInMb(): Number = unwrap(this).getMemorySizeInMb()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpointconfig-serverlessconfig.html#cfn-sagemaker-endpointconfig-serverlessconfig-provisionedconcurrency)
       */
      override fun provisionedConcurrency(): Number? = unwrap(this).getProvisionedConcurrency()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ServerlessConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.ServerlessConfigProperty):
          ServerlessConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ServerlessConfigProperty):
          software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.ServerlessConfigProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.ServerlessConfigProperty
    }
  }

  /**
   * Specifies the configuration for notifications of inference results for asynchronous inference.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sagemaker.*;
   * AsyncInferenceNotificationConfigProperty asyncInferenceNotificationConfigProperty =
   * AsyncInferenceNotificationConfigProperty.builder()
   * .errorTopic("errorTopic")
   * .includeInferenceResponseIn(List.of("includeInferenceResponseIn"))
   * .successTopic("successTopic")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpointconfig-asyncinferencenotificationconfig.html)
   */
  public interface AsyncInferenceNotificationConfigProperty {
    /**
     * Amazon SNS topic to post a notification to when an inference fails.
     *
     * If no topic is provided, no notification is sent on failure.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpointconfig-asyncinferencenotificationconfig.html#cfn-sagemaker-endpointconfig-asyncinferencenotificationconfig-errortopic)
     */
    public fun errorTopic(): String? = unwrap(this).getErrorTopic()

    /**
     * The Amazon SNS topics where you want the inference response to be included.
     *
     *
     * The inference response is included only if the response size is less than or equal to 128 KB.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpointconfig-asyncinferencenotificationconfig.html#cfn-sagemaker-endpointconfig-asyncinferencenotificationconfig-includeinferenceresponsein)
     */
    public fun includeInferenceResponseIn(): List<String> =
        unwrap(this).getIncludeInferenceResponseIn() ?: emptyList()

    /**
     * Amazon SNS topic to post a notification to when an inference completes successfully.
     *
     * If no topic is provided, no notification is sent on success.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpointconfig-asyncinferencenotificationconfig.html#cfn-sagemaker-endpointconfig-asyncinferencenotificationconfig-successtopic)
     */
    public fun successTopic(): String? = unwrap(this).getSuccessTopic()

    /**
     * A builder for [AsyncInferenceNotificationConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param errorTopic Amazon SNS topic to post a notification to when an inference fails.
       * If no topic is provided, no notification is sent on failure.
       */
      public fun errorTopic(errorTopic: String)

      /**
       * @param includeInferenceResponseIn The Amazon SNS topics where you want the inference
       * response to be included.
       *
       * The inference response is included only if the response size is less than or equal to 128
       * KB.
       */
      public fun includeInferenceResponseIn(includeInferenceResponseIn: List<String>)

      /**
       * @param includeInferenceResponseIn The Amazon SNS topics where you want the inference
       * response to be included.
       *
       * The inference response is included only if the response size is less than or equal to 128
       * KB.
       */
      public fun includeInferenceResponseIn(vararg includeInferenceResponseIn: String)

      /**
       * @param successTopic Amazon SNS topic to post a notification to when an inference completes
       * successfully.
       * If no topic is provided, no notification is sent on success.
       */
      public fun successTopic(successTopic: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.AsyncInferenceNotificationConfigProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.AsyncInferenceNotificationConfigProperty.builder()

      /**
       * @param errorTopic Amazon SNS topic to post a notification to when an inference fails.
       * If no topic is provided, no notification is sent on failure.
       */
      override fun errorTopic(errorTopic: String) {
        cdkBuilder.errorTopic(errorTopic)
      }

      /**
       * @param includeInferenceResponseIn The Amazon SNS topics where you want the inference
       * response to be included.
       *
       * The inference response is included only if the response size is less than or equal to 128
       * KB.
       */
      override fun includeInferenceResponseIn(includeInferenceResponseIn: List<String>) {
        cdkBuilder.includeInferenceResponseIn(includeInferenceResponseIn)
      }

      /**
       * @param includeInferenceResponseIn The Amazon SNS topics where you want the inference
       * response to be included.
       *
       * The inference response is included only if the response size is less than or equal to 128
       * KB.
       */
      override fun includeInferenceResponseIn(vararg includeInferenceResponseIn: String): Unit =
          includeInferenceResponseIn(includeInferenceResponseIn.toList())

      /**
       * @param successTopic Amazon SNS topic to post a notification to when an inference completes
       * successfully.
       * If no topic is provided, no notification is sent on success.
       */
      override fun successTopic(successTopic: String) {
        cdkBuilder.successTopic(successTopic)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.AsyncInferenceNotificationConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.AsyncInferenceNotificationConfigProperty,
    ) : CdkObject(cdkObject), AsyncInferenceNotificationConfigProperty {
      /**
       * Amazon SNS topic to post a notification to when an inference fails.
       *
       * If no topic is provided, no notification is sent on failure.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpointconfig-asyncinferencenotificationconfig.html#cfn-sagemaker-endpointconfig-asyncinferencenotificationconfig-errortopic)
       */
      override fun errorTopic(): String? = unwrap(this).getErrorTopic()

      /**
       * The Amazon SNS topics where you want the inference response to be included.
       *
       *
       * The inference response is included only if the response size is less than or equal to 128
       * KB.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpointconfig-asyncinferencenotificationconfig.html#cfn-sagemaker-endpointconfig-asyncinferencenotificationconfig-includeinferenceresponsein)
       */
      override fun includeInferenceResponseIn(): List<String> =
          unwrap(this).getIncludeInferenceResponseIn() ?: emptyList()

      /**
       * Amazon SNS topic to post a notification to when an inference completes successfully.
       *
       * If no topic is provided, no notification is sent on success.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpointconfig-asyncinferencenotificationconfig.html#cfn-sagemaker-endpointconfig-asyncinferencenotificationconfig-successtopic)
       */
      override fun successTopic(): String? = unwrap(this).getSuccessTopic()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          AsyncInferenceNotificationConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.AsyncInferenceNotificationConfigProperty):
          AsyncInferenceNotificationConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AsyncInferenceNotificationConfigProperty):
          software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.AsyncInferenceNotificationConfigProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.AsyncInferenceNotificationConfigProperty
    }
  }

  /**
   * Specifies configuration for how an endpoint performs asynchronous inference.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sagemaker.*;
   * AsyncInferenceConfigProperty asyncInferenceConfigProperty =
   * AsyncInferenceConfigProperty.builder()
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpointconfig-asyncinferenceconfig.html)
   */
  public interface AsyncInferenceConfigProperty {
    /**
     * Configures the behavior of the client used by SageMaker to interact with the model container
     * during asynchronous inference.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpointconfig-asyncinferenceconfig.html#cfn-sagemaker-endpointconfig-asyncinferenceconfig-clientconfig)
     */
    public fun clientConfig(): Any? = unwrap(this).getClientConfig()

    /**
     * Specifies the configuration for asynchronous inference invocation outputs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpointconfig-asyncinferenceconfig.html#cfn-sagemaker-endpointconfig-asyncinferenceconfig-outputconfig)
     */
    public fun outputConfig(): Any

    /**
     * A builder for [AsyncInferenceConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param clientConfig Configures the behavior of the client used by SageMaker to interact
       * with the model container during asynchronous inference.
       */
      public fun clientConfig(clientConfig: IResolvable)

      /**
       * @param clientConfig Configures the behavior of the client used by SageMaker to interact
       * with the model container during asynchronous inference.
       */
      public fun clientConfig(clientConfig: AsyncInferenceClientConfigProperty)

      /**
       * @param clientConfig Configures the behavior of the client used by SageMaker to interact
       * with the model container during asynchronous inference.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1451d55f7c6dcc93f208c9544ff16035452f4f231f52fafb3c53a316a2c1cce2")
      public fun clientConfig(clientConfig: AsyncInferenceClientConfigProperty.Builder.() -> Unit)

      /**
       * @param outputConfig Specifies the configuration for asynchronous inference invocation
       * outputs. 
       */
      public fun outputConfig(outputConfig: IResolvable)

      /**
       * @param outputConfig Specifies the configuration for asynchronous inference invocation
       * outputs. 
       */
      public fun outputConfig(outputConfig: AsyncInferenceOutputConfigProperty)

      /**
       * @param outputConfig Specifies the configuration for asynchronous inference invocation
       * outputs. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("330ef4c48ff9947d6c2c196a853e54d1c8fc468d35a6ff22ea2b66f9b4f42287")
      public fun outputConfig(outputConfig: AsyncInferenceOutputConfigProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.AsyncInferenceConfigProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.AsyncInferenceConfigProperty.builder()

      /**
       * @param clientConfig Configures the behavior of the client used by SageMaker to interact
       * with the model container during asynchronous inference.
       */
      override fun clientConfig(clientConfig: IResolvable) {
        cdkBuilder.clientConfig(clientConfig.let(IResolvable::unwrap))
      }

      /**
       * @param clientConfig Configures the behavior of the client used by SageMaker to interact
       * with the model container during asynchronous inference.
       */
      override fun clientConfig(clientConfig: AsyncInferenceClientConfigProperty) {
        cdkBuilder.clientConfig(clientConfig.let(AsyncInferenceClientConfigProperty::unwrap))
      }

      /**
       * @param clientConfig Configures the behavior of the client used by SageMaker to interact
       * with the model container during asynchronous inference.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1451d55f7c6dcc93f208c9544ff16035452f4f231f52fafb3c53a316a2c1cce2")
      override
          fun clientConfig(clientConfig: AsyncInferenceClientConfigProperty.Builder.() -> Unit):
          Unit = clientConfig(AsyncInferenceClientConfigProperty(clientConfig))

      /**
       * @param outputConfig Specifies the configuration for asynchronous inference invocation
       * outputs. 
       */
      override fun outputConfig(outputConfig: IResolvable) {
        cdkBuilder.outputConfig(outputConfig.let(IResolvable::unwrap))
      }

      /**
       * @param outputConfig Specifies the configuration for asynchronous inference invocation
       * outputs. 
       */
      override fun outputConfig(outputConfig: AsyncInferenceOutputConfigProperty) {
        cdkBuilder.outputConfig(outputConfig.let(AsyncInferenceOutputConfigProperty::unwrap))
      }

      /**
       * @param outputConfig Specifies the configuration for asynchronous inference invocation
       * outputs. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("330ef4c48ff9947d6c2c196a853e54d1c8fc468d35a6ff22ea2b66f9b4f42287")
      override
          fun outputConfig(outputConfig: AsyncInferenceOutputConfigProperty.Builder.() -> Unit):
          Unit = outputConfig(AsyncInferenceOutputConfigProperty(outputConfig))

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.AsyncInferenceConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.AsyncInferenceConfigProperty,
    ) : CdkObject(cdkObject), AsyncInferenceConfigProperty {
      /**
       * Configures the behavior of the client used by SageMaker to interact with the model
       * container during asynchronous inference.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpointconfig-asyncinferenceconfig.html#cfn-sagemaker-endpointconfig-asyncinferenceconfig-clientconfig)
       */
      override fun clientConfig(): Any? = unwrap(this).getClientConfig()

      /**
       * Specifies the configuration for asynchronous inference invocation outputs.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpointconfig-asyncinferenceconfig.html#cfn-sagemaker-endpointconfig-asyncinferenceconfig-outputconfig)
       */
      override fun outputConfig(): Any = unwrap(this).getOutputConfig()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AsyncInferenceConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.AsyncInferenceConfigProperty):
          AsyncInferenceConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AsyncInferenceConfigProperty):
          software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.AsyncInferenceConfigProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.AsyncInferenceConfigProperty
    }
  }

  /**
   * A parameter used to configure the SageMaker Clarify explainer to treat text features as text so
   * that explanations are provided for individual units of text.
   *
   * Required only for natural language processing (NLP) explainability.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sagemaker.*;
   * ClarifyTextConfigProperty clarifyTextConfigProperty = ClarifyTextConfigProperty.builder()
   * .granularity("granularity")
   * .language("language")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpointconfig-clarifytextconfig.html)
   */
  public interface ClarifyTextConfigProperty {
    /**
     * The unit of granularity for the analysis of text features.
     *
     * For example, if the unit is `'token'` , then each token (like a word in English) of the text
     * is treated as a feature. SHAP values are computed for each unit/feature.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpointconfig-clarifytextconfig.html#cfn-sagemaker-endpointconfig-clarifytextconfig-granularity)
     */
    public fun granularity(): String

    /**
     * Specifies the language of the text features in [ISO 639-1](https://docs.aws.amazon.com/
     * https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) or [ISO
     * 639-3](https://docs.aws.amazon.com/https://en.wikipedia.org/wiki/ISO_639-3) code of a supported
     * language.
     *
     *
     * For a mix of multiple languages, use code `'xx'` .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpointconfig-clarifytextconfig.html#cfn-sagemaker-endpointconfig-clarifytextconfig-language)
     */
    public fun language(): String

    /**
     * A builder for [ClarifyTextConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param granularity The unit of granularity for the analysis of text features. 
       * For example, if the unit is `'token'` , then each token (like a word in English) of the
       * text is treated as a feature. SHAP values are computed for each unit/feature.
       */
      public fun granularity(granularity: String)

      /**
       * @param language Specifies the language of the text features in [ISO
       * 639-1](https://docs.aws.amazon.com/ https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) or
       * [ISO 639-3](https://docs.aws.amazon.com/https://en.wikipedia.org/wiki/ISO_639-3) code of a
       * supported language. 
       *
       * For a mix of multiple languages, use code `'xx'` .
       */
      public fun language(language: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.ClarifyTextConfigProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.ClarifyTextConfigProperty.builder()

      /**
       * @param granularity The unit of granularity for the analysis of text features. 
       * For example, if the unit is `'token'` , then each token (like a word in English) of the
       * text is treated as a feature. SHAP values are computed for each unit/feature.
       */
      override fun granularity(granularity: String) {
        cdkBuilder.granularity(granularity)
      }

      /**
       * @param language Specifies the language of the text features in [ISO
       * 639-1](https://docs.aws.amazon.com/ https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) or
       * [ISO 639-3](https://docs.aws.amazon.com/https://en.wikipedia.org/wiki/ISO_639-3) code of a
       * supported language. 
       *
       * For a mix of multiple languages, use code `'xx'` .
       */
      override fun language(language: String) {
        cdkBuilder.language(language)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.ClarifyTextConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.ClarifyTextConfigProperty,
    ) : CdkObject(cdkObject), ClarifyTextConfigProperty {
      /**
       * The unit of granularity for the analysis of text features.
       *
       * For example, if the unit is `'token'` , then each token (like a word in English) of the
       * text is treated as a feature. SHAP values are computed for each unit/feature.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpointconfig-clarifytextconfig.html#cfn-sagemaker-endpointconfig-clarifytextconfig-granularity)
       */
      override fun granularity(): String = unwrap(this).getGranularity()

      /**
       * Specifies the language of the text features in [ISO 639-1](https://docs.aws.amazon.com/
       * https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) or [ISO
       * 639-3](https://docs.aws.amazon.com/https://en.wikipedia.org/wiki/ISO_639-3) code of a
       * supported language.
       *
       *
       * For a mix of multiple languages, use code `'xx'` .
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpointconfig-clarifytextconfig.html#cfn-sagemaker-endpointconfig-clarifytextconfig-language)
       */
      override fun language(): String = unwrap(this).getLanguage()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ClarifyTextConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.ClarifyTextConfigProperty):
          ClarifyTextConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ClarifyTextConfigProperty):
          software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.ClarifyTextConfigProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.ClarifyTextConfigProperty
    }
  }

  /**
   * Configures the behavior of the client used by SageMaker to interact with the model container
   * during asynchronous inference.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sagemaker.*;
   * AsyncInferenceClientConfigProperty asyncInferenceClientConfigProperty =
   * AsyncInferenceClientConfigProperty.builder()
   * .maxConcurrentInvocationsPerInstance(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpointconfig-asyncinferenceclientconfig.html)
   */
  public interface AsyncInferenceClientConfigProperty {
    /**
     * The maximum number of concurrent requests sent by the SageMaker client to the model
     * container.
     *
     * If no value is provided, SageMaker will choose an optimal value for you.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpointconfig-asyncinferenceclientconfig.html#cfn-sagemaker-endpointconfig-asyncinferenceclientconfig-maxconcurrentinvocationsperinstance)
     */
    public fun maxConcurrentInvocationsPerInstance(): Number? =
        unwrap(this).getMaxConcurrentInvocationsPerInstance()

    /**
     * A builder for [AsyncInferenceClientConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param maxConcurrentInvocationsPerInstance The maximum number of concurrent requests sent
       * by the SageMaker client to the model container.
       * If no value is provided, SageMaker will choose an optimal value for you.
       */
      public fun maxConcurrentInvocationsPerInstance(maxConcurrentInvocationsPerInstance: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.AsyncInferenceClientConfigProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.AsyncInferenceClientConfigProperty.builder()

      /**
       * @param maxConcurrentInvocationsPerInstance The maximum number of concurrent requests sent
       * by the SageMaker client to the model container.
       * If no value is provided, SageMaker will choose an optimal value for you.
       */
      override
          fun maxConcurrentInvocationsPerInstance(maxConcurrentInvocationsPerInstance: Number) {
        cdkBuilder.maxConcurrentInvocationsPerInstance(maxConcurrentInvocationsPerInstance)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.AsyncInferenceClientConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.AsyncInferenceClientConfigProperty,
    ) : CdkObject(cdkObject), AsyncInferenceClientConfigProperty {
      /**
       * The maximum number of concurrent requests sent by the SageMaker client to the model
       * container.
       *
       * If no value is provided, SageMaker will choose an optimal value for you.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpointconfig-asyncinferenceclientconfig.html#cfn-sagemaker-endpointconfig-asyncinferenceclientconfig-maxconcurrentinvocationsperinstance)
       */
      override fun maxConcurrentInvocationsPerInstance(): Number? =
          unwrap(this).getMaxConcurrentInvocationsPerInstance()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          AsyncInferenceClientConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.AsyncInferenceClientConfigProperty):
          AsyncInferenceClientConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AsyncInferenceClientConfigProperty):
          software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.AsyncInferenceClientConfigProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.AsyncInferenceClientConfigProperty
    }
  }

  /**
   * Specifies the JSON and CSV content types of the data that the endpoint captures.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sagemaker.*;
   * CaptureContentTypeHeaderProperty captureContentTypeHeaderProperty =
   * CaptureContentTypeHeaderProperty.builder()
   * .csvContentTypes(List.of("csvContentTypes"))
   * .jsonContentTypes(List.of("jsonContentTypes"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpointconfig-capturecontenttypeheader.html)
   */
  public interface CaptureContentTypeHeaderProperty {
    /**
     * A list of the CSV content types of the data that the endpoint captures.
     *
     * For the endpoint to capture the data, you must also specify the content type when you invoke
     * the endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpointconfig-capturecontenttypeheader.html#cfn-sagemaker-endpointconfig-capturecontenttypeheader-csvcontenttypes)
     */
    public fun csvContentTypes(): List<String> = unwrap(this).getCsvContentTypes() ?: emptyList()

    /**
     * A list of the JSON content types of the data that the endpoint captures.
     *
     * For the endpoint to capture the data, you must also specify the content type when you invoke
     * the endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpointconfig-capturecontenttypeheader.html#cfn-sagemaker-endpointconfig-capturecontenttypeheader-jsoncontenttypes)
     */
    public fun jsonContentTypes(): List<String> = unwrap(this).getJsonContentTypes() ?: emptyList()

    /**
     * A builder for [CaptureContentTypeHeaderProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param csvContentTypes A list of the CSV content types of the data that the endpoint
       * captures.
       * For the endpoint to capture the data, you must also specify the content type when you
       * invoke the endpoint.
       */
      public fun csvContentTypes(csvContentTypes: List<String>)

      /**
       * @param csvContentTypes A list of the CSV content types of the data that the endpoint
       * captures.
       * For the endpoint to capture the data, you must also specify the content type when you
       * invoke the endpoint.
       */
      public fun csvContentTypes(vararg csvContentTypes: String)

      /**
       * @param jsonContentTypes A list of the JSON content types of the data that the endpoint
       * captures.
       * For the endpoint to capture the data, you must also specify the content type when you
       * invoke the endpoint.
       */
      public fun jsonContentTypes(jsonContentTypes: List<String>)

      /**
       * @param jsonContentTypes A list of the JSON content types of the data that the endpoint
       * captures.
       * For the endpoint to capture the data, you must also specify the content type when you
       * invoke the endpoint.
       */
      public fun jsonContentTypes(vararg jsonContentTypes: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.CaptureContentTypeHeaderProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.CaptureContentTypeHeaderProperty.builder()

      /**
       * @param csvContentTypes A list of the CSV content types of the data that the endpoint
       * captures.
       * For the endpoint to capture the data, you must also specify the content type when you
       * invoke the endpoint.
       */
      override fun csvContentTypes(csvContentTypes: List<String>) {
        cdkBuilder.csvContentTypes(csvContentTypes)
      }

      /**
       * @param csvContentTypes A list of the CSV content types of the data that the endpoint
       * captures.
       * For the endpoint to capture the data, you must also specify the content type when you
       * invoke the endpoint.
       */
      override fun csvContentTypes(vararg csvContentTypes: String): Unit =
          csvContentTypes(csvContentTypes.toList())

      /**
       * @param jsonContentTypes A list of the JSON content types of the data that the endpoint
       * captures.
       * For the endpoint to capture the data, you must also specify the content type when you
       * invoke the endpoint.
       */
      override fun jsonContentTypes(jsonContentTypes: List<String>) {
        cdkBuilder.jsonContentTypes(jsonContentTypes)
      }

      /**
       * @param jsonContentTypes A list of the JSON content types of the data that the endpoint
       * captures.
       * For the endpoint to capture the data, you must also specify the content type when you
       * invoke the endpoint.
       */
      override fun jsonContentTypes(vararg jsonContentTypes: String): Unit =
          jsonContentTypes(jsonContentTypes.toList())

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.CaptureContentTypeHeaderProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.CaptureContentTypeHeaderProperty,
    ) : CdkObject(cdkObject), CaptureContentTypeHeaderProperty {
      /**
       * A list of the CSV content types of the data that the endpoint captures.
       *
       * For the endpoint to capture the data, you must also specify the content type when you
       * invoke the endpoint.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpointconfig-capturecontenttypeheader.html#cfn-sagemaker-endpointconfig-capturecontenttypeheader-csvcontenttypes)
       */
      override fun csvContentTypes(): List<String> = unwrap(this).getCsvContentTypes() ?:
          emptyList()

      /**
       * A list of the JSON content types of the data that the endpoint captures.
       *
       * For the endpoint to capture the data, you must also specify the content type when you
       * invoke the endpoint.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpointconfig-capturecontenttypeheader.html#cfn-sagemaker-endpointconfig-capturecontenttypeheader-jsoncontenttypes)
       */
      override fun jsonContentTypes(): List<String> = unwrap(this).getJsonContentTypes() ?:
          emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CaptureContentTypeHeaderProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.CaptureContentTypeHeaderProperty):
          CaptureContentTypeHeaderProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CaptureContentTypeHeaderProperty):
          software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.CaptureContentTypeHeaderProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.CaptureContentTypeHeaderProperty
    }
  }

  /**
   * The inference configuration parameter for the model container.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sagemaker.*;
   * ClarifyInferenceConfigProperty clarifyInferenceConfigProperty =
   * ClarifyInferenceConfigProperty.builder()
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpointconfig-clarifyinferenceconfig.html)
   */
  public interface ClarifyInferenceConfigProperty {
    /**
     * A template string used to format a JSON record into an acceptable model container input.
     *
     * For example, a `ContentTemplate` string `'{"myfeatures":$features}'` will format a list of
     * features `[1,2,3]` into the record string `'{"myfeatures":[1,2,3]}'` . Required only when the
     * model container input is in JSON Lines format.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpointconfig-clarifyinferenceconfig.html#cfn-sagemaker-endpointconfig-clarifyinferenceconfig-contenttemplate)
     */
    public fun contentTemplate(): String? = unwrap(this).getContentTemplate()

    /**
     * The names of the features.
     *
     * If provided, these are included in the endpoint response payload to help readability of the
     * `InvokeEndpoint` output. See the
     * [Response](https://docs.aws.amazon.com/sagemaker/latest/dg/clarify-online-explainability-invoke-endpoint.html#clarify-online-explainability-response)
     * section under *Invoke the endpoint* in the Developer Guide for more information.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpointconfig-clarifyinferenceconfig.html#cfn-sagemaker-endpointconfig-clarifyinferenceconfig-featureheaders)
     */
    public fun featureHeaders(): List<String> = unwrap(this).getFeatureHeaders() ?: emptyList()

    /**
     * A list of data types of the features (optional).
     *
     * Applicable only to NLP explainability. If provided, `FeatureTypes` must have at least one
     * `'text'` string (for example, `['text']` ). If `FeatureTypes` is not provided, the explainer
     * infers the feature types based on the baseline data. The feature types are included in the
     * endpoint response payload. For additional information see the
     * [response](https://docs.aws.amazon.com/sagemaker/latest/dg/clarify-online-explainability-invoke-endpoint.html#clarify-online-explainability-response)
     * section under *Invoke the endpoint* in the Developer Guide for more information.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpointconfig-clarifyinferenceconfig.html#cfn-sagemaker-endpointconfig-clarifyinferenceconfig-featuretypes)
     */
    public fun featureTypes(): List<String> = unwrap(this).getFeatureTypes() ?: emptyList()

    /**
     * Provides the JMESPath expression to extract the features from a model container input in JSON
     * Lines format.
     *
     * For example, if `FeaturesAttribute` is the JMESPath expression `'myfeatures'` , it extracts a
     * list of features `[1,2,3]` from request data `'{"myfeatures":[1,2,3]}'` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpointconfig-clarifyinferenceconfig.html#cfn-sagemaker-endpointconfig-clarifyinferenceconfig-featuresattribute)
     */
    public fun featuresAttribute(): String? = unwrap(this).getFeaturesAttribute()

    /**
     * A JMESPath expression used to locate the list of label headers in the model container output.
     *
     * *Example* : If the model container output of a batch request is
     * `'{"labels":["cat","dog","fish"],"probability":[0.6,0.3,0.1]}'` , then set `LabelAttribute` to
     * `'labels'` to extract the list of label headers `["cat","dog","fish"]`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpointconfig-clarifyinferenceconfig.html#cfn-sagemaker-endpointconfig-clarifyinferenceconfig-labelattribute)
     */
    public fun labelAttribute(): String? = unwrap(this).getLabelAttribute()

    /**
     * For multiclass classification problems, the label headers are the names of the classes.
     *
     * Otherwise, the label header is the name of the predicted label. These are used to help
     * readability for the output of the `InvokeEndpoint` API. See the
     * [response](https://docs.aws.amazon.com/sagemaker/latest/dg/clarify-online-explainability-invoke-endpoint.html#clarify-online-explainability-response)
     * section under *Invoke the endpoint* in the Developer Guide for more information. If there are no
     * label headers in the model container output, provide them manually using this parameter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpointconfig-clarifyinferenceconfig.html#cfn-sagemaker-endpointconfig-clarifyinferenceconfig-labelheaders)
     */
    public fun labelHeaders(): List<String> = unwrap(this).getLabelHeaders() ?: emptyList()

    /**
     * A zero-based index used to extract a label header or list of label headers from model
     * container output in CSV format.
     *
     * *Example for a multiclass model:* If the model container output consists of label headers
     * followed by probabilities: `'"[\'cat\',\'dog\',\'fish\']","[0.1,0.6,0.3]"'` , set `LabelIndex`
     * to `0` to select the label headers `['cat','dog','fish']` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpointconfig-clarifyinferenceconfig.html#cfn-sagemaker-endpointconfig-clarifyinferenceconfig-labelindex)
     */
    public fun labelIndex(): Number? = unwrap(this).getLabelIndex()

    /**
     * The maximum payload size (MB) allowed of a request from the explainer to the model container.
     *
     * Defaults to `6` MB.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpointconfig-clarifyinferenceconfig.html#cfn-sagemaker-endpointconfig-clarifyinferenceconfig-maxpayloadinmb)
     */
    public fun maxPayloadInMb(): Number? = unwrap(this).getMaxPayloadInMb()

    /**
     * The maximum number of records in a request that the model container can process when querying
     * the model container for the predictions of a [synthetic
     * dataset](https://docs.aws.amazon.com/sagemaker/latest/dg/clarify-online-explainability-create-endpoint.html#clarify-online-explainability-create-endpoint-synthetic)
     * . A record is a unit of input data that inference can be made on, for example, a single line in
     * CSV data. If `MaxRecordCount` is `1` , the model container expects one record per request. A
     * value of 2 or greater means that the model expects batch requests, which can reduce overhead and
     * speed up the inferencing process. If this parameter is not provided, the explainer will tune the
     * record count per request according to the model container's capacity at runtime.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpointconfig-clarifyinferenceconfig.html#cfn-sagemaker-endpointconfig-clarifyinferenceconfig-maxrecordcount)
     */
    public fun maxRecordCount(): Number? = unwrap(this).getMaxRecordCount()

    /**
     * A JMESPath expression used to extract the probability (or score) from the model container
     * output if the model container is in JSON Lines format.
     *
     * *Example* : If the model container output of a single request is
     * `'{"predicted_label":1,"probability":0.6}'` , then set `ProbabilityAttribute` to `'probability'`
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpointconfig-clarifyinferenceconfig.html#cfn-sagemaker-endpointconfig-clarifyinferenceconfig-probabilityattribute)
     */
    public fun probabilityAttribute(): String? = unwrap(this).getProbabilityAttribute()

    /**
     * A zero-based index used to extract a probability value (score) or list from model container
     * output in CSV format.
     *
     * If this value is not provided, the entire model container output will be treated as a
     * probability value (score) or list.
     *
     * *Example for a single class model:* If the model container output consists of a
     * string-formatted prediction label followed by its probability: `'1,0.6'` , set
     * `ProbabilityIndex` to `1` to select the probability value `0.6` .
     *
     * *Example for a multiclass model:* If the model container output consists of a
     * string-formatted prediction label followed by its probability:
     * `'"[\'cat\',\'dog\',\'fish\']","[0.1,0.6,0.3]"'` , set `ProbabilityIndex` to `1` to select the
     * probability values `[0.1,0.6,0.3]` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpointconfig-clarifyinferenceconfig.html#cfn-sagemaker-endpointconfig-clarifyinferenceconfig-probabilityindex)
     */
    public fun probabilityIndex(): Number? = unwrap(this).getProbabilityIndex()

    /**
     * A builder for [ClarifyInferenceConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param contentTemplate A template string used to format a JSON record into an acceptable
       * model container input.
       * For example, a `ContentTemplate` string `'{"myfeatures":$features}'` will format a list of
       * features `[1,2,3]` into the record string `'{"myfeatures":[1,2,3]}'` . Required only when the
       * model container input is in JSON Lines format.
       */
      public fun contentTemplate(contentTemplate: String)

      /**
       * @param featureHeaders The names of the features.
       * If provided, these are included in the endpoint response payload to help readability of the
       * `InvokeEndpoint` output. See the
       * [Response](https://docs.aws.amazon.com/sagemaker/latest/dg/clarify-online-explainability-invoke-endpoint.html#clarify-online-explainability-response)
       * section under *Invoke the endpoint* in the Developer Guide for more information.
       */
      public fun featureHeaders(featureHeaders: List<String>)

      /**
       * @param featureHeaders The names of the features.
       * If provided, these are included in the endpoint response payload to help readability of the
       * `InvokeEndpoint` output. See the
       * [Response](https://docs.aws.amazon.com/sagemaker/latest/dg/clarify-online-explainability-invoke-endpoint.html#clarify-online-explainability-response)
       * section under *Invoke the endpoint* in the Developer Guide for more information.
       */
      public fun featureHeaders(vararg featureHeaders: String)

      /**
       * @param featureTypes A list of data types of the features (optional).
       * Applicable only to NLP explainability. If provided, `FeatureTypes` must have at least one
       * `'text'` string (for example, `['text']` ). If `FeatureTypes` is not provided, the explainer
       * infers the feature types based on the baseline data. The feature types are included in the
       * endpoint response payload. For additional information see the
       * [response](https://docs.aws.amazon.com/sagemaker/latest/dg/clarify-online-explainability-invoke-endpoint.html#clarify-online-explainability-response)
       * section under *Invoke the endpoint* in the Developer Guide for more information.
       */
      public fun featureTypes(featureTypes: List<String>)

      /**
       * @param featureTypes A list of data types of the features (optional).
       * Applicable only to NLP explainability. If provided, `FeatureTypes` must have at least one
       * `'text'` string (for example, `['text']` ). If `FeatureTypes` is not provided, the explainer
       * infers the feature types based on the baseline data. The feature types are included in the
       * endpoint response payload. For additional information see the
       * [response](https://docs.aws.amazon.com/sagemaker/latest/dg/clarify-online-explainability-invoke-endpoint.html#clarify-online-explainability-response)
       * section under *Invoke the endpoint* in the Developer Guide for more information.
       */
      public fun featureTypes(vararg featureTypes: String)

      /**
       * @param featuresAttribute Provides the JMESPath expression to extract the features from a
       * model container input in JSON Lines format.
       * For example, if `FeaturesAttribute` is the JMESPath expression `'myfeatures'` , it extracts
       * a list of features `[1,2,3]` from request data `'{"myfeatures":[1,2,3]}'` .
       */
      public fun featuresAttribute(featuresAttribute: String)

      /**
       * @param labelAttribute A JMESPath expression used to locate the list of label headers in the
       * model container output.
       * *Example* : If the model container output of a batch request is
       * `'{"labels":["cat","dog","fish"],"probability":[0.6,0.3,0.1]}'` , then set `LabelAttribute` to
       * `'labels'` to extract the list of label headers `["cat","dog","fish"]`
       */
      public fun labelAttribute(labelAttribute: String)

      /**
       * @param labelHeaders For multiclass classification problems, the label headers are the names
       * of the classes.
       * Otherwise, the label header is the name of the predicted label. These are used to help
       * readability for the output of the `InvokeEndpoint` API. See the
       * [response](https://docs.aws.amazon.com/sagemaker/latest/dg/clarify-online-explainability-invoke-endpoint.html#clarify-online-explainability-response)
       * section under *Invoke the endpoint* in the Developer Guide for more information. If there are
       * no label headers in the model container output, provide them manually using this parameter.
       */
      public fun labelHeaders(labelHeaders: List<String>)

      /**
       * @param labelHeaders For multiclass classification problems, the label headers are the names
       * of the classes.
       * Otherwise, the label header is the name of the predicted label. These are used to help
       * readability for the output of the `InvokeEndpoint` API. See the
       * [response](https://docs.aws.amazon.com/sagemaker/latest/dg/clarify-online-explainability-invoke-endpoint.html#clarify-online-explainability-response)
       * section under *Invoke the endpoint* in the Developer Guide for more information. If there are
       * no label headers in the model container output, provide them manually using this parameter.
       */
      public fun labelHeaders(vararg labelHeaders: String)

      /**
       * @param labelIndex A zero-based index used to extract a label header or list of label
       * headers from model container output in CSV format.
       * *Example for a multiclass model:* If the model container output consists of label headers
       * followed by probabilities: `'"[\'cat\',\'dog\',\'fish\']","[0.1,0.6,0.3]"'` , set `LabelIndex`
       * to `0` to select the label headers `['cat','dog','fish']` .
       */
      public fun labelIndex(labelIndex: Number)

      /**
       * @param maxPayloadInMb The maximum payload size (MB) allowed of a request from the explainer
       * to the model container.
       * Defaults to `6` MB.
       */
      public fun maxPayloadInMb(maxPayloadInMb: Number)

      /**
       * @param maxRecordCount The maximum number of records in a request that the model container
       * can process when querying the model container for the predictions of a [synthetic
       * dataset](https://docs.aws.amazon.com/sagemaker/latest/dg/clarify-online-explainability-create-endpoint.html#clarify-online-explainability-create-endpoint-synthetic)
       * . A record is a unit of input data that inference can be made on, for example, a single line
       * in CSV data. If `MaxRecordCount` is `1` , the model container expects one record per request.
       * A value of 2 or greater means that the model expects batch requests, which can reduce overhead
       * and speed up the inferencing process. If this parameter is not provided, the explainer will
       * tune the record count per request according to the model container's capacity at runtime.
       */
      public fun maxRecordCount(maxRecordCount: Number)

      /**
       * @param probabilityAttribute A JMESPath expression used to extract the probability (or
       * score) from the model container output if the model container is in JSON Lines format.
       * *Example* : If the model container output of a single request is
       * `'{"predicted_label":1,"probability":0.6}'` , then set `ProbabilityAttribute` to
       * `'probability'` .
       */
      public fun probabilityAttribute(probabilityAttribute: String)

      /**
       * @param probabilityIndex A zero-based index used to extract a probability value (score) or
       * list from model container output in CSV format.
       * If this value is not provided, the entire model container output will be treated as a
       * probability value (score) or list.
       *
       * *Example for a single class model:* If the model container output consists of a
       * string-formatted prediction label followed by its probability: `'1,0.6'` , set
       * `ProbabilityIndex` to `1` to select the probability value `0.6` .
       *
       * *Example for a multiclass model:* If the model container output consists of a
       * string-formatted prediction label followed by its probability:
       * `'"[\'cat\',\'dog\',\'fish\']","[0.1,0.6,0.3]"'` , set `ProbabilityIndex` to `1` to select the
       * probability values `[0.1,0.6,0.3]` .
       */
      public fun probabilityIndex(probabilityIndex: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.ClarifyInferenceConfigProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.ClarifyInferenceConfigProperty.builder()

      /**
       * @param contentTemplate A template string used to format a JSON record into an acceptable
       * model container input.
       * For example, a `ContentTemplate` string `'{"myfeatures":$features}'` will format a list of
       * features `[1,2,3]` into the record string `'{"myfeatures":[1,2,3]}'` . Required only when the
       * model container input is in JSON Lines format.
       */
      override fun contentTemplate(contentTemplate: String) {
        cdkBuilder.contentTemplate(contentTemplate)
      }

      /**
       * @param featureHeaders The names of the features.
       * If provided, these are included in the endpoint response payload to help readability of the
       * `InvokeEndpoint` output. See the
       * [Response](https://docs.aws.amazon.com/sagemaker/latest/dg/clarify-online-explainability-invoke-endpoint.html#clarify-online-explainability-response)
       * section under *Invoke the endpoint* in the Developer Guide for more information.
       */
      override fun featureHeaders(featureHeaders: List<String>) {
        cdkBuilder.featureHeaders(featureHeaders)
      }

      /**
       * @param featureHeaders The names of the features.
       * If provided, these are included in the endpoint response payload to help readability of the
       * `InvokeEndpoint` output. See the
       * [Response](https://docs.aws.amazon.com/sagemaker/latest/dg/clarify-online-explainability-invoke-endpoint.html#clarify-online-explainability-response)
       * section under *Invoke the endpoint* in the Developer Guide for more information.
       */
      override fun featureHeaders(vararg featureHeaders: String): Unit =
          featureHeaders(featureHeaders.toList())

      /**
       * @param featureTypes A list of data types of the features (optional).
       * Applicable only to NLP explainability. If provided, `FeatureTypes` must have at least one
       * `'text'` string (for example, `['text']` ). If `FeatureTypes` is not provided, the explainer
       * infers the feature types based on the baseline data. The feature types are included in the
       * endpoint response payload. For additional information see the
       * [response](https://docs.aws.amazon.com/sagemaker/latest/dg/clarify-online-explainability-invoke-endpoint.html#clarify-online-explainability-response)
       * section under *Invoke the endpoint* in the Developer Guide for more information.
       */
      override fun featureTypes(featureTypes: List<String>) {
        cdkBuilder.featureTypes(featureTypes)
      }

      /**
       * @param featureTypes A list of data types of the features (optional).
       * Applicable only to NLP explainability. If provided, `FeatureTypes` must have at least one
       * `'text'` string (for example, `['text']` ). If `FeatureTypes` is not provided, the explainer
       * infers the feature types based on the baseline data. The feature types are included in the
       * endpoint response payload. For additional information see the
       * [response](https://docs.aws.amazon.com/sagemaker/latest/dg/clarify-online-explainability-invoke-endpoint.html#clarify-online-explainability-response)
       * section under *Invoke the endpoint* in the Developer Guide for more information.
       */
      override fun featureTypes(vararg featureTypes: String): Unit =
          featureTypes(featureTypes.toList())

      /**
       * @param featuresAttribute Provides the JMESPath expression to extract the features from a
       * model container input in JSON Lines format.
       * For example, if `FeaturesAttribute` is the JMESPath expression `'myfeatures'` , it extracts
       * a list of features `[1,2,3]` from request data `'{"myfeatures":[1,2,3]}'` .
       */
      override fun featuresAttribute(featuresAttribute: String) {
        cdkBuilder.featuresAttribute(featuresAttribute)
      }

      /**
       * @param labelAttribute A JMESPath expression used to locate the list of label headers in the
       * model container output.
       * *Example* : If the model container output of a batch request is
       * `'{"labels":["cat","dog","fish"],"probability":[0.6,0.3,0.1]}'` , then set `LabelAttribute` to
       * `'labels'` to extract the list of label headers `["cat","dog","fish"]`
       */
      override fun labelAttribute(labelAttribute: String) {
        cdkBuilder.labelAttribute(labelAttribute)
      }

      /**
       * @param labelHeaders For multiclass classification problems, the label headers are the names
       * of the classes.
       * Otherwise, the label header is the name of the predicted label. These are used to help
       * readability for the output of the `InvokeEndpoint` API. See the
       * [response](https://docs.aws.amazon.com/sagemaker/latest/dg/clarify-online-explainability-invoke-endpoint.html#clarify-online-explainability-response)
       * section under *Invoke the endpoint* in the Developer Guide for more information. If there are
       * no label headers in the model container output, provide them manually using this parameter.
       */
      override fun labelHeaders(labelHeaders: List<String>) {
        cdkBuilder.labelHeaders(labelHeaders)
      }

      /**
       * @param labelHeaders For multiclass classification problems, the label headers are the names
       * of the classes.
       * Otherwise, the label header is the name of the predicted label. These are used to help
       * readability for the output of the `InvokeEndpoint` API. See the
       * [response](https://docs.aws.amazon.com/sagemaker/latest/dg/clarify-online-explainability-invoke-endpoint.html#clarify-online-explainability-response)
       * section under *Invoke the endpoint* in the Developer Guide for more information. If there are
       * no label headers in the model container output, provide them manually using this parameter.
       */
      override fun labelHeaders(vararg labelHeaders: String): Unit =
          labelHeaders(labelHeaders.toList())

      /**
       * @param labelIndex A zero-based index used to extract a label header or list of label
       * headers from model container output in CSV format.
       * *Example for a multiclass model:* If the model container output consists of label headers
       * followed by probabilities: `'"[\'cat\',\'dog\',\'fish\']","[0.1,0.6,0.3]"'` , set `LabelIndex`
       * to `0` to select the label headers `['cat','dog','fish']` .
       */
      override fun labelIndex(labelIndex: Number) {
        cdkBuilder.labelIndex(labelIndex)
      }

      /**
       * @param maxPayloadInMb The maximum payload size (MB) allowed of a request from the explainer
       * to the model container.
       * Defaults to `6` MB.
       */
      override fun maxPayloadInMb(maxPayloadInMb: Number) {
        cdkBuilder.maxPayloadInMb(maxPayloadInMb)
      }

      /**
       * @param maxRecordCount The maximum number of records in a request that the model container
       * can process when querying the model container for the predictions of a [synthetic
       * dataset](https://docs.aws.amazon.com/sagemaker/latest/dg/clarify-online-explainability-create-endpoint.html#clarify-online-explainability-create-endpoint-synthetic)
       * . A record is a unit of input data that inference can be made on, for example, a single line
       * in CSV data. If `MaxRecordCount` is `1` , the model container expects one record per request.
       * A value of 2 or greater means that the model expects batch requests, which can reduce overhead
       * and speed up the inferencing process. If this parameter is not provided, the explainer will
       * tune the record count per request according to the model container's capacity at runtime.
       */
      override fun maxRecordCount(maxRecordCount: Number) {
        cdkBuilder.maxRecordCount(maxRecordCount)
      }

      /**
       * @param probabilityAttribute A JMESPath expression used to extract the probability (or
       * score) from the model container output if the model container is in JSON Lines format.
       * *Example* : If the model container output of a single request is
       * `'{"predicted_label":1,"probability":0.6}'` , then set `ProbabilityAttribute` to
       * `'probability'` .
       */
      override fun probabilityAttribute(probabilityAttribute: String) {
        cdkBuilder.probabilityAttribute(probabilityAttribute)
      }

      /**
       * @param probabilityIndex A zero-based index used to extract a probability value (score) or
       * list from model container output in CSV format.
       * If this value is not provided, the entire model container output will be treated as a
       * probability value (score) or list.
       *
       * *Example for a single class model:* If the model container output consists of a
       * string-formatted prediction label followed by its probability: `'1,0.6'` , set
       * `ProbabilityIndex` to `1` to select the probability value `0.6` .
       *
       * *Example for a multiclass model:* If the model container output consists of a
       * string-formatted prediction label followed by its probability:
       * `'"[\'cat\',\'dog\',\'fish\']","[0.1,0.6,0.3]"'` , set `ProbabilityIndex` to `1` to select the
       * probability values `[0.1,0.6,0.3]` .
       */
      override fun probabilityIndex(probabilityIndex: Number) {
        cdkBuilder.probabilityIndex(probabilityIndex)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.ClarifyInferenceConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.ClarifyInferenceConfigProperty,
    ) : CdkObject(cdkObject), ClarifyInferenceConfigProperty {
      /**
       * A template string used to format a JSON record into an acceptable model container input.
       *
       * For example, a `ContentTemplate` string `'{"myfeatures":$features}'` will format a list of
       * features `[1,2,3]` into the record string `'{"myfeatures":[1,2,3]}'` . Required only when the
       * model container input is in JSON Lines format.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpointconfig-clarifyinferenceconfig.html#cfn-sagemaker-endpointconfig-clarifyinferenceconfig-contenttemplate)
       */
      override fun contentTemplate(): String? = unwrap(this).getContentTemplate()

      /**
       * The names of the features.
       *
       * If provided, these are included in the endpoint response payload to help readability of the
       * `InvokeEndpoint` output. See the
       * [Response](https://docs.aws.amazon.com/sagemaker/latest/dg/clarify-online-explainability-invoke-endpoint.html#clarify-online-explainability-response)
       * section under *Invoke the endpoint* in the Developer Guide for more information.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpointconfig-clarifyinferenceconfig.html#cfn-sagemaker-endpointconfig-clarifyinferenceconfig-featureheaders)
       */
      override fun featureHeaders(): List<String> = unwrap(this).getFeatureHeaders() ?: emptyList()

      /**
       * A list of data types of the features (optional).
       *
       * Applicable only to NLP explainability. If provided, `FeatureTypes` must have at least one
       * `'text'` string (for example, `['text']` ). If `FeatureTypes` is not provided, the explainer
       * infers the feature types based on the baseline data. The feature types are included in the
       * endpoint response payload. For additional information see the
       * [response](https://docs.aws.amazon.com/sagemaker/latest/dg/clarify-online-explainability-invoke-endpoint.html#clarify-online-explainability-response)
       * section under *Invoke the endpoint* in the Developer Guide for more information.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpointconfig-clarifyinferenceconfig.html#cfn-sagemaker-endpointconfig-clarifyinferenceconfig-featuretypes)
       */
      override fun featureTypes(): List<String> = unwrap(this).getFeatureTypes() ?: emptyList()

      /**
       * Provides the JMESPath expression to extract the features from a model container input in
       * JSON Lines format.
       *
       * For example, if `FeaturesAttribute` is the JMESPath expression `'myfeatures'` , it extracts
       * a list of features `[1,2,3]` from request data `'{"myfeatures":[1,2,3]}'` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpointconfig-clarifyinferenceconfig.html#cfn-sagemaker-endpointconfig-clarifyinferenceconfig-featuresattribute)
       */
      override fun featuresAttribute(): String? = unwrap(this).getFeaturesAttribute()

      /**
       * A JMESPath expression used to locate the list of label headers in the model container
       * output.
       *
       * *Example* : If the model container output of a batch request is
       * `'{"labels":["cat","dog","fish"],"probability":[0.6,0.3,0.1]}'` , then set `LabelAttribute` to
       * `'labels'` to extract the list of label headers `["cat","dog","fish"]`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpointconfig-clarifyinferenceconfig.html#cfn-sagemaker-endpointconfig-clarifyinferenceconfig-labelattribute)
       */
      override fun labelAttribute(): String? = unwrap(this).getLabelAttribute()

      /**
       * For multiclass classification problems, the label headers are the names of the classes.
       *
       * Otherwise, the label header is the name of the predicted label. These are used to help
       * readability for the output of the `InvokeEndpoint` API. See the
       * [response](https://docs.aws.amazon.com/sagemaker/latest/dg/clarify-online-explainability-invoke-endpoint.html#clarify-online-explainability-response)
       * section under *Invoke the endpoint* in the Developer Guide for more information. If there are
       * no label headers in the model container output, provide them manually using this parameter.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpointconfig-clarifyinferenceconfig.html#cfn-sagemaker-endpointconfig-clarifyinferenceconfig-labelheaders)
       */
      override fun labelHeaders(): List<String> = unwrap(this).getLabelHeaders() ?: emptyList()

      /**
       * A zero-based index used to extract a label header or list of label headers from model
       * container output in CSV format.
       *
       * *Example for a multiclass model:* If the model container output consists of label headers
       * followed by probabilities: `'"[\'cat\',\'dog\',\'fish\']","[0.1,0.6,0.3]"'` , set `LabelIndex`
       * to `0` to select the label headers `['cat','dog','fish']` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpointconfig-clarifyinferenceconfig.html#cfn-sagemaker-endpointconfig-clarifyinferenceconfig-labelindex)
       */
      override fun labelIndex(): Number? = unwrap(this).getLabelIndex()

      /**
       * The maximum payload size (MB) allowed of a request from the explainer to the model
       * container.
       *
       * Defaults to `6` MB.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpointconfig-clarifyinferenceconfig.html#cfn-sagemaker-endpointconfig-clarifyinferenceconfig-maxpayloadinmb)
       */
      override fun maxPayloadInMb(): Number? = unwrap(this).getMaxPayloadInMb()

      /**
       * The maximum number of records in a request that the model container can process when
       * querying the model container for the predictions of a [synthetic
       * dataset](https://docs.aws.amazon.com/sagemaker/latest/dg/clarify-online-explainability-create-endpoint.html#clarify-online-explainability-create-endpoint-synthetic)
       * . A record is a unit of input data that inference can be made on, for example, a single line
       * in CSV data. If `MaxRecordCount` is `1` , the model container expects one record per request.
       * A value of 2 or greater means that the model expects batch requests, which can reduce overhead
       * and speed up the inferencing process. If this parameter is not provided, the explainer will
       * tune the record count per request according to the model container's capacity at runtime.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpointconfig-clarifyinferenceconfig.html#cfn-sagemaker-endpointconfig-clarifyinferenceconfig-maxrecordcount)
       */
      override fun maxRecordCount(): Number? = unwrap(this).getMaxRecordCount()

      /**
       * A JMESPath expression used to extract the probability (or score) from the model container
       * output if the model container is in JSON Lines format.
       *
       * *Example* : If the model container output of a single request is
       * `'{"predicted_label":1,"probability":0.6}'` , then set `ProbabilityAttribute` to
       * `'probability'` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpointconfig-clarifyinferenceconfig.html#cfn-sagemaker-endpointconfig-clarifyinferenceconfig-probabilityattribute)
       */
      override fun probabilityAttribute(): String? = unwrap(this).getProbabilityAttribute()

      /**
       * A zero-based index used to extract a probability value (score) or list from model container
       * output in CSV format.
       *
       * If this value is not provided, the entire model container output will be treated as a
       * probability value (score) or list.
       *
       * *Example for a single class model:* If the model container output consists of a
       * string-formatted prediction label followed by its probability: `'1,0.6'` , set
       * `ProbabilityIndex` to `1` to select the probability value `0.6` .
       *
       * *Example for a multiclass model:* If the model container output consists of a
       * string-formatted prediction label followed by its probability:
       * `'"[\'cat\',\'dog\',\'fish\']","[0.1,0.6,0.3]"'` , set `ProbabilityIndex` to `1` to select the
       * probability values `[0.1,0.6,0.3]` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpointconfig-clarifyinferenceconfig.html#cfn-sagemaker-endpointconfig-clarifyinferenceconfig-probabilityindex)
       */
      override fun probabilityIndex(): Number? = unwrap(this).getProbabilityIndex()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ClarifyInferenceConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.ClarifyInferenceConfigProperty):
          ClarifyInferenceConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ClarifyInferenceConfigProperty):
          software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.ClarifyInferenceConfigProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.ClarifyInferenceConfigProperty
    }
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sagemaker.*;
   * VpcConfigProperty vpcConfigProperty = VpcConfigProperty.builder()
   * .securityGroupIds(List.of("securityGroupIds"))
   * .subnets(List.of("subnets"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpointconfig-vpcconfig.html)
   */
  public interface VpcConfigProperty {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpointconfig-vpcconfig.html#cfn-sagemaker-endpointconfig-vpcconfig-securitygroupids)
     */
    public fun securityGroupIds(): List<String>

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpointconfig-vpcconfig.html#cfn-sagemaker-endpointconfig-vpcconfig-subnets)
     */
    public fun subnets(): List<String>

    /**
     * A builder for [VpcConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param securityGroupIds the value to be set. 
       */
      public fun securityGroupIds(securityGroupIds: List<String>)

      /**
       * @param securityGroupIds the value to be set. 
       */
      public fun securityGroupIds(vararg securityGroupIds: String)

      /**
       * @param subnets the value to be set. 
       */
      public fun subnets(subnets: List<String>)

      /**
       * @param subnets the value to be set. 
       */
      public fun subnets(vararg subnets: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.VpcConfigProperty.Builder =
          software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.VpcConfigProperty.builder()

      /**
       * @param securityGroupIds the value to be set. 
       */
      override fun securityGroupIds(securityGroupIds: List<String>) {
        cdkBuilder.securityGroupIds(securityGroupIds)
      }

      /**
       * @param securityGroupIds the value to be set. 
       */
      override fun securityGroupIds(vararg securityGroupIds: String): Unit =
          securityGroupIds(securityGroupIds.toList())

      /**
       * @param subnets the value to be set. 
       */
      override fun subnets(subnets: List<String>) {
        cdkBuilder.subnets(subnets)
      }

      /**
       * @param subnets the value to be set. 
       */
      override fun subnets(vararg subnets: String): Unit = subnets(subnets.toList())

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.VpcConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.VpcConfigProperty,
    ) : CdkObject(cdkObject), VpcConfigProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpointconfig-vpcconfig.html#cfn-sagemaker-endpointconfig-vpcconfig-securitygroupids)
       */
      override fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpointconfig-vpcconfig.html#cfn-sagemaker-endpointconfig-vpcconfig-subnets)
       */
      override fun subnets(): List<String> = unwrap(this).getSubnets()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): VpcConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.VpcConfigProperty):
          VpcConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: VpcConfigProperty):
          software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.VpcConfigProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.VpcConfigProperty
    }
  }

  /**
   * Specifies a model that you want to host and the resources to deploy for hosting it.
   *
   * If you are deploying multiple models, tell Amazon SageMaker how to distribute traffic among the
   * models by specifying the `InitialVariantWeight` objects.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sagemaker.*;
   * ProductionVariantProperty productionVariantProperty = ProductionVariantProperty.builder()
   * .variantName("variantName")
   * // the properties below are optional
   * .acceleratorType("acceleratorType")
   * .containerStartupHealthCheckTimeoutInSeconds(123)
   * .enableSsmAccess(false)
   * .initialInstanceCount(123)
   * .initialVariantWeight(123)
   * .instanceType("instanceType")
   * .managedInstanceScaling(ManagedInstanceScalingProperty.builder()
   * .maxInstanceCount(123)
   * .minInstanceCount(123)
   * .status("status")
   * .build())
   * .modelDataDownloadTimeoutInSeconds(123)
   * .modelName("modelName")
   * .routingConfig(RoutingConfigProperty.builder()
   * .routingStrategy("routingStrategy")
   * .build())
   * .serverlessConfig(ServerlessConfigProperty.builder()
   * .maxConcurrency(123)
   * .memorySizeInMb(123)
   * // the properties below are optional
   * .provisionedConcurrency(123)
   * .build())
   * .volumeSizeInGb(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpointconfig-productionvariant.html)
   */
  public interface ProductionVariantProperty {
    /**
     * The size of the Elastic Inference (EI) instance to use for the production variant.
     *
     * EI instances provide on-demand GPU computing for inference. For more information, see [Using
     * Elastic Inference in Amazon SageMaker](https://docs.aws.amazon.com/sagemaker/latest/dg/ei.html)
     * . For more information, see [Using Elastic Inference in Amazon
     * SageMaker](https://docs.aws.amazon.com/sagemaker/latest/dg/ei.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpointconfig-productionvariant.html#cfn-sagemaker-endpointconfig-productionvariant-acceleratortype)
     */
    public fun acceleratorType(): String? = unwrap(this).getAcceleratorType()

    /**
     * The timeout value, in seconds, for your inference container to pass health check by SageMaker
     * Hosting.
     *
     * For more information about health check, see [How Your Container Should Respond to Health
     * Check (Ping)
     * Requests](https://docs.aws.amazon.com/sagemaker/latest/dg/your-algorithms-inference-code.html#your-algorithms-inference-algo-ping-requests)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpointconfig-productionvariant.html#cfn-sagemaker-endpointconfig-productionvariant-containerstartuphealthchecktimeoutinseconds)
     */
    public fun containerStartupHealthCheckTimeoutInSeconds(): Number? =
        unwrap(this).getContainerStartupHealthCheckTimeoutInSeconds()

    /**
     * You can use this parameter to turn on native AWS Systems Manager (SSM) access for a
     * production variant behind an endpoint.
     *
     * By default, SSM access is disabled for all production variants behind an endpoint. You can
     * turn on or turn off SSM access for a production variant behind an existing endpoint by creating
     * a new endpoint configuration and calling `UpdateEndpoint` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpointconfig-productionvariant.html#cfn-sagemaker-endpointconfig-productionvariant-enablessmaccess)
     */
    public fun enableSsmAccess(): Any? = unwrap(this).getEnableSsmAccess()

    /**
     * Number of instances to launch initially.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpointconfig-productionvariant.html#cfn-sagemaker-endpointconfig-productionvariant-initialinstancecount)
     */
    public fun initialInstanceCount(): Number? = unwrap(this).getInitialInstanceCount()

    /**
     * Determines initial traffic distribution among all of the models that you specify in the
     * endpoint configuration.
     *
     * The traffic to a production variant is determined by the ratio of the `VariantWeight` to the
     * sum of all `VariantWeight` values across all ProductionVariants. If unspecified, it defaults to
     * 1.0.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpointconfig-productionvariant.html#cfn-sagemaker-endpointconfig-productionvariant-initialvariantweight)
     */
    public fun initialVariantWeight(): Number? = unwrap(this).getInitialVariantWeight()

    /**
     * The ML compute instance type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpointconfig-productionvariant.html#cfn-sagemaker-endpointconfig-productionvariant-instancetype)
     */
    public fun instanceType(): String? = unwrap(this).getInstanceType()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpointconfig-productionvariant.html#cfn-sagemaker-endpointconfig-productionvariant-managedinstancescaling)
     */
    public fun managedInstanceScaling(): Any? = unwrap(this).getManagedInstanceScaling()

    /**
     * The timeout value, in seconds, to download and extract the model that you want to host from
     * Amazon S3 to the individual inference instance associated with this production variant.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpointconfig-productionvariant.html#cfn-sagemaker-endpointconfig-productionvariant-modeldatadownloadtimeoutinseconds)
     */
    public fun modelDataDownloadTimeoutInSeconds(): Number? =
        unwrap(this).getModelDataDownloadTimeoutInSeconds()

    /**
     * The name of the model that you want to host.
     *
     * This is the name that you specified when creating the model.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpointconfig-productionvariant.html#cfn-sagemaker-endpointconfig-productionvariant-modelname)
     */
    public fun modelName(): String? = unwrap(this).getModelName()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpointconfig-productionvariant.html#cfn-sagemaker-endpointconfig-productionvariant-routingconfig)
     */
    public fun routingConfig(): Any? = unwrap(this).getRoutingConfig()

    /**
     * The serverless configuration for an endpoint.
     *
     * Specifies a serverless endpoint configuration instead of an instance-based endpoint
     * configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpointconfig-productionvariant.html#cfn-sagemaker-endpointconfig-productionvariant-serverlessconfig)
     */
    public fun serverlessConfig(): Any? = unwrap(this).getServerlessConfig()

    /**
     * The name of the production variant.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpointconfig-productionvariant.html#cfn-sagemaker-endpointconfig-productionvariant-variantname)
     */
    public fun variantName(): String

    /**
     * The size, in GB, of the ML storage volume attached to individual inference instance
     * associated with the production variant.
     *
     * Currently only Amazon EBS gp2 storage volumes are supported.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpointconfig-productionvariant.html#cfn-sagemaker-endpointconfig-productionvariant-volumesizeingb)
     */
    public fun volumeSizeInGb(): Number? = unwrap(this).getVolumeSizeInGb()

    /**
     * A builder for [ProductionVariantProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param acceleratorType The size of the Elastic Inference (EI) instance to use for the
       * production variant.
       * EI instances provide on-demand GPU computing for inference. For more information, see
       * [Using Elastic Inference in Amazon
       * SageMaker](https://docs.aws.amazon.com/sagemaker/latest/dg/ei.html) . For more information,
       * see [Using Elastic Inference in Amazon
       * SageMaker](https://docs.aws.amazon.com/sagemaker/latest/dg/ei.html) .
       */
      public fun acceleratorType(acceleratorType: String)

      /**
       * @param containerStartupHealthCheckTimeoutInSeconds The timeout value, in seconds, for your
       * inference container to pass health check by SageMaker Hosting.
       * For more information about health check, see [How Your Container Should Respond to Health
       * Check (Ping)
       * Requests](https://docs.aws.amazon.com/sagemaker/latest/dg/your-algorithms-inference-code.html#your-algorithms-inference-algo-ping-requests)
       * .
       */
      public
          fun containerStartupHealthCheckTimeoutInSeconds(containerStartupHealthCheckTimeoutInSeconds: Number)

      /**
       * @param enableSsmAccess You can use this parameter to turn on native AWS Systems Manager
       * (SSM) access for a production variant behind an endpoint.
       * By default, SSM access is disabled for all production variants behind an endpoint. You can
       * turn on or turn off SSM access for a production variant behind an existing endpoint by
       * creating a new endpoint configuration and calling `UpdateEndpoint` .
       */
      public fun enableSsmAccess(enableSsmAccess: Boolean)

      /**
       * @param enableSsmAccess You can use this parameter to turn on native AWS Systems Manager
       * (SSM) access for a production variant behind an endpoint.
       * By default, SSM access is disabled for all production variants behind an endpoint. You can
       * turn on or turn off SSM access for a production variant behind an existing endpoint by
       * creating a new endpoint configuration and calling `UpdateEndpoint` .
       */
      public fun enableSsmAccess(enableSsmAccess: IResolvable)

      /**
       * @param initialInstanceCount Number of instances to launch initially.
       */
      public fun initialInstanceCount(initialInstanceCount: Number)

      /**
       * @param initialVariantWeight Determines initial traffic distribution among all of the models
       * that you specify in the endpoint configuration.
       * The traffic to a production variant is determined by the ratio of the `VariantWeight` to
       * the sum of all `VariantWeight` values across all ProductionVariants. If unspecified, it
       * defaults to 1.0.
       */
      public fun initialVariantWeight(initialVariantWeight: Number)

      /**
       * @param instanceType The ML compute instance type.
       */
      public fun instanceType(instanceType: String)

      /**
       * @param managedInstanceScaling the value to be set.
       */
      public fun managedInstanceScaling(managedInstanceScaling: IResolvable)

      /**
       * @param managedInstanceScaling the value to be set.
       */
      public fun managedInstanceScaling(managedInstanceScaling: ManagedInstanceScalingProperty)

      /**
       * @param managedInstanceScaling the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e16d9dac6a790bb283d273d4e7065bfc001dcde6903dd4c168a3e781ca8f8f37")
      public
          fun managedInstanceScaling(managedInstanceScaling: ManagedInstanceScalingProperty.Builder.() -> Unit)

      /**
       * @param modelDataDownloadTimeoutInSeconds The timeout value, in seconds, to download and
       * extract the model that you want to host from Amazon S3 to the individual inference instance
       * associated with this production variant.
       */
      public fun modelDataDownloadTimeoutInSeconds(modelDataDownloadTimeoutInSeconds: Number)

      /**
       * @param modelName The name of the model that you want to host.
       * This is the name that you specified when creating the model.
       */
      public fun modelName(modelName: String)

      /**
       * @param routingConfig the value to be set.
       */
      public fun routingConfig(routingConfig: IResolvable)

      /**
       * @param routingConfig the value to be set.
       */
      public fun routingConfig(routingConfig: RoutingConfigProperty)

      /**
       * @param routingConfig the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2507a2cd03e4f8e17a6d899f02b51fb4fbbd89145598c29b99e68027686dc3ae")
      public fun routingConfig(routingConfig: RoutingConfigProperty.Builder.() -> Unit)

      /**
       * @param serverlessConfig The serverless configuration for an endpoint.
       * Specifies a serverless endpoint configuration instead of an instance-based endpoint
       * configuration.
       */
      public fun serverlessConfig(serverlessConfig: IResolvable)

      /**
       * @param serverlessConfig The serverless configuration for an endpoint.
       * Specifies a serverless endpoint configuration instead of an instance-based endpoint
       * configuration.
       */
      public fun serverlessConfig(serverlessConfig: ServerlessConfigProperty)

      /**
       * @param serverlessConfig The serverless configuration for an endpoint.
       * Specifies a serverless endpoint configuration instead of an instance-based endpoint
       * configuration.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8518f8619a032369fb0d6b65bdcd28bf38289354fc8fd8a25a1d2a36ef3cd14d")
      public fun serverlessConfig(serverlessConfig: ServerlessConfigProperty.Builder.() -> Unit)

      /**
       * @param variantName The name of the production variant. 
       */
      public fun variantName(variantName: String)

      /**
       * @param volumeSizeInGb The size, in GB, of the ML storage volume attached to individual
       * inference instance associated with the production variant.
       * Currently only Amazon EBS gp2 storage volumes are supported.
       */
      public fun volumeSizeInGb(volumeSizeInGb: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.ProductionVariantProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.ProductionVariantProperty.builder()

      /**
       * @param acceleratorType The size of the Elastic Inference (EI) instance to use for the
       * production variant.
       * EI instances provide on-demand GPU computing for inference. For more information, see
       * [Using Elastic Inference in Amazon
       * SageMaker](https://docs.aws.amazon.com/sagemaker/latest/dg/ei.html) . For more information,
       * see [Using Elastic Inference in Amazon
       * SageMaker](https://docs.aws.amazon.com/sagemaker/latest/dg/ei.html) .
       */
      override fun acceleratorType(acceleratorType: String) {
        cdkBuilder.acceleratorType(acceleratorType)
      }

      /**
       * @param containerStartupHealthCheckTimeoutInSeconds The timeout value, in seconds, for your
       * inference container to pass health check by SageMaker Hosting.
       * For more information about health check, see [How Your Container Should Respond to Health
       * Check (Ping)
       * Requests](https://docs.aws.amazon.com/sagemaker/latest/dg/your-algorithms-inference-code.html#your-algorithms-inference-algo-ping-requests)
       * .
       */
      override
          fun containerStartupHealthCheckTimeoutInSeconds(containerStartupHealthCheckTimeoutInSeconds: Number) {
        cdkBuilder.containerStartupHealthCheckTimeoutInSeconds(containerStartupHealthCheckTimeoutInSeconds)
      }

      /**
       * @param enableSsmAccess You can use this parameter to turn on native AWS Systems Manager
       * (SSM) access for a production variant behind an endpoint.
       * By default, SSM access is disabled for all production variants behind an endpoint. You can
       * turn on or turn off SSM access for a production variant behind an existing endpoint by
       * creating a new endpoint configuration and calling `UpdateEndpoint` .
       */
      override fun enableSsmAccess(enableSsmAccess: Boolean) {
        cdkBuilder.enableSsmAccess(enableSsmAccess)
      }

      /**
       * @param enableSsmAccess You can use this parameter to turn on native AWS Systems Manager
       * (SSM) access for a production variant behind an endpoint.
       * By default, SSM access is disabled for all production variants behind an endpoint. You can
       * turn on or turn off SSM access for a production variant behind an existing endpoint by
       * creating a new endpoint configuration and calling `UpdateEndpoint` .
       */
      override fun enableSsmAccess(enableSsmAccess: IResolvable) {
        cdkBuilder.enableSsmAccess(enableSsmAccess.let(IResolvable::unwrap))
      }

      /**
       * @param initialInstanceCount Number of instances to launch initially.
       */
      override fun initialInstanceCount(initialInstanceCount: Number) {
        cdkBuilder.initialInstanceCount(initialInstanceCount)
      }

      /**
       * @param initialVariantWeight Determines initial traffic distribution among all of the models
       * that you specify in the endpoint configuration.
       * The traffic to a production variant is determined by the ratio of the `VariantWeight` to
       * the sum of all `VariantWeight` values across all ProductionVariants. If unspecified, it
       * defaults to 1.0.
       */
      override fun initialVariantWeight(initialVariantWeight: Number) {
        cdkBuilder.initialVariantWeight(initialVariantWeight)
      }

      /**
       * @param instanceType The ML compute instance type.
       */
      override fun instanceType(instanceType: String) {
        cdkBuilder.instanceType(instanceType)
      }

      /**
       * @param managedInstanceScaling the value to be set.
       */
      override fun managedInstanceScaling(managedInstanceScaling: IResolvable) {
        cdkBuilder.managedInstanceScaling(managedInstanceScaling.let(IResolvable::unwrap))
      }

      /**
       * @param managedInstanceScaling the value to be set.
       */
      override fun managedInstanceScaling(managedInstanceScaling: ManagedInstanceScalingProperty) {
        cdkBuilder.managedInstanceScaling(managedInstanceScaling.let(ManagedInstanceScalingProperty::unwrap))
      }

      /**
       * @param managedInstanceScaling the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e16d9dac6a790bb283d273d4e7065bfc001dcde6903dd4c168a3e781ca8f8f37")
      override
          fun managedInstanceScaling(managedInstanceScaling: ManagedInstanceScalingProperty.Builder.() -> Unit):
          Unit = managedInstanceScaling(ManagedInstanceScalingProperty(managedInstanceScaling))

      /**
       * @param modelDataDownloadTimeoutInSeconds The timeout value, in seconds, to download and
       * extract the model that you want to host from Amazon S3 to the individual inference instance
       * associated with this production variant.
       */
      override fun modelDataDownloadTimeoutInSeconds(modelDataDownloadTimeoutInSeconds: Number) {
        cdkBuilder.modelDataDownloadTimeoutInSeconds(modelDataDownloadTimeoutInSeconds)
      }

      /**
       * @param modelName The name of the model that you want to host.
       * This is the name that you specified when creating the model.
       */
      override fun modelName(modelName: String) {
        cdkBuilder.modelName(modelName)
      }

      /**
       * @param routingConfig the value to be set.
       */
      override fun routingConfig(routingConfig: IResolvable) {
        cdkBuilder.routingConfig(routingConfig.let(IResolvable::unwrap))
      }

      /**
       * @param routingConfig the value to be set.
       */
      override fun routingConfig(routingConfig: RoutingConfigProperty) {
        cdkBuilder.routingConfig(routingConfig.let(RoutingConfigProperty::unwrap))
      }

      /**
       * @param routingConfig the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2507a2cd03e4f8e17a6d899f02b51fb4fbbd89145598c29b99e68027686dc3ae")
      override fun routingConfig(routingConfig: RoutingConfigProperty.Builder.() -> Unit): Unit =
          routingConfig(RoutingConfigProperty(routingConfig))

      /**
       * @param serverlessConfig The serverless configuration for an endpoint.
       * Specifies a serverless endpoint configuration instead of an instance-based endpoint
       * configuration.
       */
      override fun serverlessConfig(serverlessConfig: IResolvable) {
        cdkBuilder.serverlessConfig(serverlessConfig.let(IResolvable::unwrap))
      }

      /**
       * @param serverlessConfig The serverless configuration for an endpoint.
       * Specifies a serverless endpoint configuration instead of an instance-based endpoint
       * configuration.
       */
      override fun serverlessConfig(serverlessConfig: ServerlessConfigProperty) {
        cdkBuilder.serverlessConfig(serverlessConfig.let(ServerlessConfigProperty::unwrap))
      }

      /**
       * @param serverlessConfig The serverless configuration for an endpoint.
       * Specifies a serverless endpoint configuration instead of an instance-based endpoint
       * configuration.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8518f8619a032369fb0d6b65bdcd28bf38289354fc8fd8a25a1d2a36ef3cd14d")
      override fun serverlessConfig(serverlessConfig: ServerlessConfigProperty.Builder.() -> Unit):
          Unit = serverlessConfig(ServerlessConfigProperty(serverlessConfig))

      /**
       * @param variantName The name of the production variant. 
       */
      override fun variantName(variantName: String) {
        cdkBuilder.variantName(variantName)
      }

      /**
       * @param volumeSizeInGb The size, in GB, of the ML storage volume attached to individual
       * inference instance associated with the production variant.
       * Currently only Amazon EBS gp2 storage volumes are supported.
       */
      override fun volumeSizeInGb(volumeSizeInGb: Number) {
        cdkBuilder.volumeSizeInGb(volumeSizeInGb)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.ProductionVariantProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.ProductionVariantProperty,
    ) : CdkObject(cdkObject), ProductionVariantProperty {
      /**
       * The size of the Elastic Inference (EI) instance to use for the production variant.
       *
       * EI instances provide on-demand GPU computing for inference. For more information, see
       * [Using Elastic Inference in Amazon
       * SageMaker](https://docs.aws.amazon.com/sagemaker/latest/dg/ei.html) . For more information,
       * see [Using Elastic Inference in Amazon
       * SageMaker](https://docs.aws.amazon.com/sagemaker/latest/dg/ei.html) .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpointconfig-productionvariant.html#cfn-sagemaker-endpointconfig-productionvariant-acceleratortype)
       */
      override fun acceleratorType(): String? = unwrap(this).getAcceleratorType()

      /**
       * The timeout value, in seconds, for your inference container to pass health check by
       * SageMaker Hosting.
       *
       * For more information about health check, see [How Your Container Should Respond to Health
       * Check (Ping)
       * Requests](https://docs.aws.amazon.com/sagemaker/latest/dg/your-algorithms-inference-code.html#your-algorithms-inference-algo-ping-requests)
       * .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpointconfig-productionvariant.html#cfn-sagemaker-endpointconfig-productionvariant-containerstartuphealthchecktimeoutinseconds)
       */
      override fun containerStartupHealthCheckTimeoutInSeconds(): Number? =
          unwrap(this).getContainerStartupHealthCheckTimeoutInSeconds()

      /**
       * You can use this parameter to turn on native AWS Systems Manager (SSM) access for a
       * production variant behind an endpoint.
       *
       * By default, SSM access is disabled for all production variants behind an endpoint. You can
       * turn on or turn off SSM access for a production variant behind an existing endpoint by
       * creating a new endpoint configuration and calling `UpdateEndpoint` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpointconfig-productionvariant.html#cfn-sagemaker-endpointconfig-productionvariant-enablessmaccess)
       */
      override fun enableSsmAccess(): Any? = unwrap(this).getEnableSsmAccess()

      /**
       * Number of instances to launch initially.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpointconfig-productionvariant.html#cfn-sagemaker-endpointconfig-productionvariant-initialinstancecount)
       */
      override fun initialInstanceCount(): Number? = unwrap(this).getInitialInstanceCount()

      /**
       * Determines initial traffic distribution among all of the models that you specify in the
       * endpoint configuration.
       *
       * The traffic to a production variant is determined by the ratio of the `VariantWeight` to
       * the sum of all `VariantWeight` values across all ProductionVariants. If unspecified, it
       * defaults to 1.0.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpointconfig-productionvariant.html#cfn-sagemaker-endpointconfig-productionvariant-initialvariantweight)
       */
      override fun initialVariantWeight(): Number? = unwrap(this).getInitialVariantWeight()

      /**
       * The ML compute instance type.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpointconfig-productionvariant.html#cfn-sagemaker-endpointconfig-productionvariant-instancetype)
       */
      override fun instanceType(): String? = unwrap(this).getInstanceType()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpointconfig-productionvariant.html#cfn-sagemaker-endpointconfig-productionvariant-managedinstancescaling)
       */
      override fun managedInstanceScaling(): Any? = unwrap(this).getManagedInstanceScaling()

      /**
       * The timeout value, in seconds, to download and extract the model that you want to host from
       * Amazon S3 to the individual inference instance associated with this production variant.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpointconfig-productionvariant.html#cfn-sagemaker-endpointconfig-productionvariant-modeldatadownloadtimeoutinseconds)
       */
      override fun modelDataDownloadTimeoutInSeconds(): Number? =
          unwrap(this).getModelDataDownloadTimeoutInSeconds()

      /**
       * The name of the model that you want to host.
       *
       * This is the name that you specified when creating the model.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpointconfig-productionvariant.html#cfn-sagemaker-endpointconfig-productionvariant-modelname)
       */
      override fun modelName(): String? = unwrap(this).getModelName()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpointconfig-productionvariant.html#cfn-sagemaker-endpointconfig-productionvariant-routingconfig)
       */
      override fun routingConfig(): Any? = unwrap(this).getRoutingConfig()

      /**
       * The serverless configuration for an endpoint.
       *
       * Specifies a serverless endpoint configuration instead of an instance-based endpoint
       * configuration.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpointconfig-productionvariant.html#cfn-sagemaker-endpointconfig-productionvariant-serverlessconfig)
       */
      override fun serverlessConfig(): Any? = unwrap(this).getServerlessConfig()

      /**
       * The name of the production variant.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpointconfig-productionvariant.html#cfn-sagemaker-endpointconfig-productionvariant-variantname)
       */
      override fun variantName(): String = unwrap(this).getVariantName()

      /**
       * The size, in GB, of the ML storage volume attached to individual inference instance
       * associated with the production variant.
       *
       * Currently only Amazon EBS gp2 storage volumes are supported.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpointconfig-productionvariant.html#cfn-sagemaker-endpointconfig-productionvariant-volumesizeingb)
       */
      override fun volumeSizeInGb(): Number? = unwrap(this).getVolumeSizeInGb()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ProductionVariantProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.ProductionVariantProperty):
          ProductionVariantProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ProductionVariantProperty):
          software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.ProductionVariantProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.ProductionVariantProperty
    }
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sagemaker.*;
   * RoutingConfigProperty routingConfigProperty = RoutingConfigProperty.builder()
   * .routingStrategy("routingStrategy")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpointconfig-routingconfig.html)
   */
  public interface RoutingConfigProperty {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpointconfig-routingconfig.html#cfn-sagemaker-endpointconfig-routingconfig-routingstrategy)
     */
    public fun routingStrategy(): String? = unwrap(this).getRoutingStrategy()

    /**
     * A builder for [RoutingConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param routingStrategy the value to be set.
       */
      public fun routingStrategy(routingStrategy: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.RoutingConfigProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.RoutingConfigProperty.builder()

      /**
       * @param routingStrategy the value to be set.
       */
      override fun routingStrategy(routingStrategy: String) {
        cdkBuilder.routingStrategy(routingStrategy)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.RoutingConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.RoutingConfigProperty,
    ) : CdkObject(cdkObject), RoutingConfigProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpointconfig-routingconfig.html#cfn-sagemaker-endpointconfig-routingconfig-routingstrategy)
       */
      override fun routingStrategy(): String? = unwrap(this).getRoutingStrategy()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): RoutingConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.RoutingConfigProperty):
          RoutingConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RoutingConfigProperty):
          software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.RoutingConfigProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.RoutingConfigProperty
    }
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sagemaker.*;
   * ManagedInstanceScalingProperty managedInstanceScalingProperty =
   * ManagedInstanceScalingProperty.builder()
   * .maxInstanceCount(123)
   * .minInstanceCount(123)
   * .status("status")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpointconfig-managedinstancescaling.html)
   */
  public interface ManagedInstanceScalingProperty {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpointconfig-managedinstancescaling.html#cfn-sagemaker-endpointconfig-managedinstancescaling-maxinstancecount)
     */
    public fun maxInstanceCount(): Number? = unwrap(this).getMaxInstanceCount()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpointconfig-managedinstancescaling.html#cfn-sagemaker-endpointconfig-managedinstancescaling-mininstancecount)
     */
    public fun minInstanceCount(): Number? = unwrap(this).getMinInstanceCount()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpointconfig-managedinstancescaling.html#cfn-sagemaker-endpointconfig-managedinstancescaling-status)
     */
    public fun status(): String? = unwrap(this).getStatus()

    /**
     * A builder for [ManagedInstanceScalingProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param maxInstanceCount the value to be set.
       */
      public fun maxInstanceCount(maxInstanceCount: Number)

      /**
       * @param minInstanceCount the value to be set.
       */
      public fun minInstanceCount(minInstanceCount: Number)

      /**
       * @param status the value to be set.
       */
      public fun status(status: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.ManagedInstanceScalingProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.ManagedInstanceScalingProperty.builder()

      /**
       * @param maxInstanceCount the value to be set.
       */
      override fun maxInstanceCount(maxInstanceCount: Number) {
        cdkBuilder.maxInstanceCount(maxInstanceCount)
      }

      /**
       * @param minInstanceCount the value to be set.
       */
      override fun minInstanceCount(minInstanceCount: Number) {
        cdkBuilder.minInstanceCount(minInstanceCount)
      }

      /**
       * @param status the value to be set.
       */
      override fun status(status: String) {
        cdkBuilder.status(status)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.ManagedInstanceScalingProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.ManagedInstanceScalingProperty,
    ) : CdkObject(cdkObject), ManagedInstanceScalingProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpointconfig-managedinstancescaling.html#cfn-sagemaker-endpointconfig-managedinstancescaling-maxinstancecount)
       */
      override fun maxInstanceCount(): Number? = unwrap(this).getMaxInstanceCount()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpointconfig-managedinstancescaling.html#cfn-sagemaker-endpointconfig-managedinstancescaling-mininstancecount)
       */
      override fun minInstanceCount(): Number? = unwrap(this).getMinInstanceCount()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpointconfig-managedinstancescaling.html#cfn-sagemaker-endpointconfig-managedinstancescaling-status)
       */
      override fun status(): String? = unwrap(this).getStatus()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ManagedInstanceScalingProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.ManagedInstanceScalingProperty):
          ManagedInstanceScalingProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ManagedInstanceScalingProperty):
          software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.ManagedInstanceScalingProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.ManagedInstanceScalingProperty
    }
  }

  /**
   * The configuration for SHAP analysis using SageMaker Clarify Explainer.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sagemaker.*;
   * ClarifyShapConfigProperty clarifyShapConfigProperty = ClarifyShapConfigProperty.builder()
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpointconfig-clarifyshapconfig.html)
   */
  public interface ClarifyShapConfigProperty {
    /**
     * The number of samples to be used for analysis by the Kernal SHAP algorithm.
     *
     *
     * The number of samples determines the size of the synthetic dataset, which has an impact on
     * latency of explainability requests. For more information, see the *Synthetic data* of [Configure
     * and create an
     * endpoint](https://docs.aws.amazon.com/sagemaker/latest/dg/clarify-online-explainability-create-endpoint.html)
     * .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpointconfig-clarifyshapconfig.html#cfn-sagemaker-endpointconfig-clarifyshapconfig-numberofsamples)
     */
    public fun numberOfSamples(): Number? = unwrap(this).getNumberOfSamples()

    /**
     * The starting value used to initialize the random number generator in the explainer.
     *
     * Provide a value for this parameter to obtain a deterministic SHAP result.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpointconfig-clarifyshapconfig.html#cfn-sagemaker-endpointconfig-clarifyshapconfig-seed)
     */
    public fun seed(): Number? = unwrap(this).getSeed()

    /**
     * The configuration for the SHAP baseline of the Kernal SHAP algorithm.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpointconfig-clarifyshapconfig.html#cfn-sagemaker-endpointconfig-clarifyshapconfig-shapbaselineconfig)
     */
    public fun shapBaselineConfig(): Any

    /**
     * A parameter that indicates if text features are treated as text and explanations are provided
     * for individual units of text.
     *
     * Required for natural language processing (NLP) explainability only.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpointconfig-clarifyshapconfig.html#cfn-sagemaker-endpointconfig-clarifyshapconfig-textconfig)
     */
    public fun textConfig(): Any? = unwrap(this).getTextConfig()

    /**
     * A Boolean toggle to indicate if you want to use the logit function (true) or log-odds units
     * (false) for model predictions.
     *
     * Defaults to false.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpointconfig-clarifyshapconfig.html#cfn-sagemaker-endpointconfig-clarifyshapconfig-uselogit)
     */
    public fun useLogit(): Any? = unwrap(this).getUseLogit()

    /**
     * A builder for [ClarifyShapConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param numberOfSamples The number of samples to be used for analysis by the Kernal SHAP
       * algorithm.
       *
       * The number of samples determines the size of the synthetic dataset, which has an impact on
       * latency of explainability requests. For more information, see the *Synthetic data* of
       * [Configure and create an
       * endpoint](https://docs.aws.amazon.com/sagemaker/latest/dg/clarify-online-explainability-create-endpoint.html)
       * .
       */
      public fun numberOfSamples(numberOfSamples: Number)

      /**
       * @param seed The starting value used to initialize the random number generator in the
       * explainer.
       * Provide a value for this parameter to obtain a deterministic SHAP result.
       */
      public fun seed(seed: Number)

      /**
       * @param shapBaselineConfig The configuration for the SHAP baseline of the Kernal SHAP
       * algorithm. 
       */
      public fun shapBaselineConfig(shapBaselineConfig: IResolvable)

      /**
       * @param shapBaselineConfig The configuration for the SHAP baseline of the Kernal SHAP
       * algorithm. 
       */
      public fun shapBaselineConfig(shapBaselineConfig: ClarifyShapBaselineConfigProperty)

      /**
       * @param shapBaselineConfig The configuration for the SHAP baseline of the Kernal SHAP
       * algorithm. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("44aefe325dc16ac11efdebc723e4ef1555d693949ab2ed27cb854537e5ad5c16")
      public
          fun shapBaselineConfig(shapBaselineConfig: ClarifyShapBaselineConfigProperty.Builder.() -> Unit)

      /**
       * @param textConfig A parameter that indicates if text features are treated as text and
       * explanations are provided for individual units of text.
       * Required for natural language processing (NLP) explainability only.
       */
      public fun textConfig(textConfig: IResolvable)

      /**
       * @param textConfig A parameter that indicates if text features are treated as text and
       * explanations are provided for individual units of text.
       * Required for natural language processing (NLP) explainability only.
       */
      public fun textConfig(textConfig: ClarifyTextConfigProperty)

      /**
       * @param textConfig A parameter that indicates if text features are treated as text and
       * explanations are provided for individual units of text.
       * Required for natural language processing (NLP) explainability only.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b91c22d36031d535f6f206b20d3bc0e1f205b2edf557d1a5e89ad765b0363479")
      public fun textConfig(textConfig: ClarifyTextConfigProperty.Builder.() -> Unit)

      /**
       * @param useLogit A Boolean toggle to indicate if you want to use the logit function (true)
       * or log-odds units (false) for model predictions.
       * Defaults to false.
       */
      public fun useLogit(useLogit: Boolean)

      /**
       * @param useLogit A Boolean toggle to indicate if you want to use the logit function (true)
       * or log-odds units (false) for model predictions.
       * Defaults to false.
       */
      public fun useLogit(useLogit: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.ClarifyShapConfigProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.ClarifyShapConfigProperty.builder()

      /**
       * @param numberOfSamples The number of samples to be used for analysis by the Kernal SHAP
       * algorithm.
       *
       * The number of samples determines the size of the synthetic dataset, which has an impact on
       * latency of explainability requests. For more information, see the *Synthetic data* of
       * [Configure and create an
       * endpoint](https://docs.aws.amazon.com/sagemaker/latest/dg/clarify-online-explainability-create-endpoint.html)
       * .
       */
      override fun numberOfSamples(numberOfSamples: Number) {
        cdkBuilder.numberOfSamples(numberOfSamples)
      }

      /**
       * @param seed The starting value used to initialize the random number generator in the
       * explainer.
       * Provide a value for this parameter to obtain a deterministic SHAP result.
       */
      override fun seed(seed: Number) {
        cdkBuilder.seed(seed)
      }

      /**
       * @param shapBaselineConfig The configuration for the SHAP baseline of the Kernal SHAP
       * algorithm. 
       */
      override fun shapBaselineConfig(shapBaselineConfig: IResolvable) {
        cdkBuilder.shapBaselineConfig(shapBaselineConfig.let(IResolvable::unwrap))
      }

      /**
       * @param shapBaselineConfig The configuration for the SHAP baseline of the Kernal SHAP
       * algorithm. 
       */
      override fun shapBaselineConfig(shapBaselineConfig: ClarifyShapBaselineConfigProperty) {
        cdkBuilder.shapBaselineConfig(shapBaselineConfig.let(ClarifyShapBaselineConfigProperty::unwrap))
      }

      /**
       * @param shapBaselineConfig The configuration for the SHAP baseline of the Kernal SHAP
       * algorithm. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("44aefe325dc16ac11efdebc723e4ef1555d693949ab2ed27cb854537e5ad5c16")
      override
          fun shapBaselineConfig(shapBaselineConfig: ClarifyShapBaselineConfigProperty.Builder.() -> Unit):
          Unit = shapBaselineConfig(ClarifyShapBaselineConfigProperty(shapBaselineConfig))

      /**
       * @param textConfig A parameter that indicates if text features are treated as text and
       * explanations are provided for individual units of text.
       * Required for natural language processing (NLP) explainability only.
       */
      override fun textConfig(textConfig: IResolvable) {
        cdkBuilder.textConfig(textConfig.let(IResolvable::unwrap))
      }

      /**
       * @param textConfig A parameter that indicates if text features are treated as text and
       * explanations are provided for individual units of text.
       * Required for natural language processing (NLP) explainability only.
       */
      override fun textConfig(textConfig: ClarifyTextConfigProperty) {
        cdkBuilder.textConfig(textConfig.let(ClarifyTextConfigProperty::unwrap))
      }

      /**
       * @param textConfig A parameter that indicates if text features are treated as text and
       * explanations are provided for individual units of text.
       * Required for natural language processing (NLP) explainability only.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b91c22d36031d535f6f206b20d3bc0e1f205b2edf557d1a5e89ad765b0363479")
      override fun textConfig(textConfig: ClarifyTextConfigProperty.Builder.() -> Unit): Unit =
          textConfig(ClarifyTextConfigProperty(textConfig))

      /**
       * @param useLogit A Boolean toggle to indicate if you want to use the logit function (true)
       * or log-odds units (false) for model predictions.
       * Defaults to false.
       */
      override fun useLogit(useLogit: Boolean) {
        cdkBuilder.useLogit(useLogit)
      }

      /**
       * @param useLogit A Boolean toggle to indicate if you want to use the logit function (true)
       * or log-odds units (false) for model predictions.
       * Defaults to false.
       */
      override fun useLogit(useLogit: IResolvable) {
        cdkBuilder.useLogit(useLogit.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.ClarifyShapConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.ClarifyShapConfigProperty,
    ) : CdkObject(cdkObject), ClarifyShapConfigProperty {
      /**
       * The number of samples to be used for analysis by the Kernal SHAP algorithm.
       *
       *
       * The number of samples determines the size of the synthetic dataset, which has an impact on
       * latency of explainability requests. For more information, see the *Synthetic data* of
       * [Configure and create an
       * endpoint](https://docs.aws.amazon.com/sagemaker/latest/dg/clarify-online-explainability-create-endpoint.html)
       * .
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpointconfig-clarifyshapconfig.html#cfn-sagemaker-endpointconfig-clarifyshapconfig-numberofsamples)
       */
      override fun numberOfSamples(): Number? = unwrap(this).getNumberOfSamples()

      /**
       * The starting value used to initialize the random number generator in the explainer.
       *
       * Provide a value for this parameter to obtain a deterministic SHAP result.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpointconfig-clarifyshapconfig.html#cfn-sagemaker-endpointconfig-clarifyshapconfig-seed)
       */
      override fun seed(): Number? = unwrap(this).getSeed()

      /**
       * The configuration for the SHAP baseline of the Kernal SHAP algorithm.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpointconfig-clarifyshapconfig.html#cfn-sagemaker-endpointconfig-clarifyshapconfig-shapbaselineconfig)
       */
      override fun shapBaselineConfig(): Any = unwrap(this).getShapBaselineConfig()

      /**
       * A parameter that indicates if text features are treated as text and explanations are
       * provided for individual units of text.
       *
       * Required for natural language processing (NLP) explainability only.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpointconfig-clarifyshapconfig.html#cfn-sagemaker-endpointconfig-clarifyshapconfig-textconfig)
       */
      override fun textConfig(): Any? = unwrap(this).getTextConfig()

      /**
       * A Boolean toggle to indicate if you want to use the logit function (true) or log-odds units
       * (false) for model predictions.
       *
       * Defaults to false.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpointconfig-clarifyshapconfig.html#cfn-sagemaker-endpointconfig-clarifyshapconfig-uselogit)
       */
      override fun useLogit(): Any? = unwrap(this).getUseLogit()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ClarifyShapConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.ClarifyShapConfigProperty):
          ClarifyShapConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ClarifyShapConfigProperty):
          software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.ClarifyShapConfigProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.ClarifyShapConfigProperty
    }
  }

  /**
   * Specifies the configuration of your endpoint for model monitor data capture.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sagemaker.*;
   * DataCaptureConfigProperty dataCaptureConfigProperty = DataCaptureConfigProperty.builder()
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpointconfig-datacaptureconfig.html)
   */
  public interface DataCaptureConfigProperty {
    /**
     * A list of the JSON and CSV content type that the endpoint captures.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpointconfig-datacaptureconfig.html#cfn-sagemaker-endpointconfig-datacaptureconfig-capturecontenttypeheader)
     */
    public fun captureContentTypeHeader(): Any? = unwrap(this).getCaptureContentTypeHeader()

    /**
     * Specifies whether the endpoint captures input data to your model, output data from your
     * model, or both.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpointconfig-datacaptureconfig.html#cfn-sagemaker-endpointconfig-datacaptureconfig-captureoptions)
     */
    public fun captureOptions(): Any

    /**
     * The S3 bucket where model monitor stores captured data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpointconfig-datacaptureconfig.html#cfn-sagemaker-endpointconfig-datacaptureconfig-destinations3uri)
     */
    public fun destinationS3Uri(): String

    /**
     * Set to `True` to enable data capture.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpointconfig-datacaptureconfig.html#cfn-sagemaker-endpointconfig-datacaptureconfig-enablecapture)
     */
    public fun enableCapture(): Any? = unwrap(this).getEnableCapture()

    /**
     * The percentage of data to capture.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpointconfig-datacaptureconfig.html#cfn-sagemaker-endpointconfig-datacaptureconfig-initialsamplingpercentage)
     */
    public fun initialSamplingPercentage(): Number

    /**
     * The AWS Key Management Service ( AWS KMS) key that Amazon SageMaker uses to encrypt the
     * captured data at rest using Amazon S3 server-side encryption.
     *
     * The KmsKeyId can be any of the following formats: Key ID:
     * 1234abcd-12ab-34cd-56ef-1234567890ab Key ARN:
     * arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab Alias name:
     * alias/ExampleAlias Alias name ARN: arn:aws:kms:us-west-2:111122223333:alias/ExampleAlias If you
     * don't provide a KMS key ID, Amazon SageMaker uses the default KMS key for Amazon S3 for your
     * role's account. For more information, see KMS-Managed Encryption Keys
     * (https://docs.aws.amazon.com/AmazonS3/latest/dev/UsingKMSEncryption.html) in the Amazon Simple
     * Storage Service Developer Guide. The KMS key policy must grant permission to the IAM role that
     * you specify in your CreateModel
     * (https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_CreateModel.html) request. For
     * more information, see Using Key Policies in AWS KMS
     * (http://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html) in the AWS Key
     * Management Service Developer Guide.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpointconfig-datacaptureconfig.html#cfn-sagemaker-endpointconfig-datacaptureconfig-kmskeyid)
     */
    public fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

    /**
     * A builder for [DataCaptureConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param captureContentTypeHeader A list of the JSON and CSV content type that the endpoint
       * captures.
       */
      public fun captureContentTypeHeader(captureContentTypeHeader: IResolvable)

      /**
       * @param captureContentTypeHeader A list of the JSON and CSV content type that the endpoint
       * captures.
       */
      public
          fun captureContentTypeHeader(captureContentTypeHeader: CaptureContentTypeHeaderProperty)

      /**
       * @param captureContentTypeHeader A list of the JSON and CSV content type that the endpoint
       * captures.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("31a3df691231e3741b21575ed4957e82fdb752b2995392ce72f37435a3fbfd17")
      public
          fun captureContentTypeHeader(captureContentTypeHeader: CaptureContentTypeHeaderProperty.Builder.() -> Unit)

      /**
       * @param captureOptions Specifies whether the endpoint captures input data to your model,
       * output data from your model, or both. 
       */
      public fun captureOptions(captureOptions: IResolvable)

      /**
       * @param captureOptions Specifies whether the endpoint captures input data to your model,
       * output data from your model, or both. 
       */
      public fun captureOptions(captureOptions: List<Any>)

      /**
       * @param captureOptions Specifies whether the endpoint captures input data to your model,
       * output data from your model, or both. 
       */
      public fun captureOptions(vararg captureOptions: Any)

      /**
       * @param destinationS3Uri The S3 bucket where model monitor stores captured data. 
       */
      public fun destinationS3Uri(destinationS3Uri: String)

      /**
       * @param enableCapture Set to `True` to enable data capture.
       */
      public fun enableCapture(enableCapture: Boolean)

      /**
       * @param enableCapture Set to `True` to enable data capture.
       */
      public fun enableCapture(enableCapture: IResolvable)

      /**
       * @param initialSamplingPercentage The percentage of data to capture. 
       */
      public fun initialSamplingPercentage(initialSamplingPercentage: Number)

      /**
       * @param kmsKeyId The AWS Key Management Service ( AWS KMS) key that Amazon SageMaker uses to
       * encrypt the captured data at rest using Amazon S3 server-side encryption.
       * The KmsKeyId can be any of the following formats: Key ID:
       * 1234abcd-12ab-34cd-56ef-1234567890ab Key ARN:
       * arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab Alias name:
       * alias/ExampleAlias Alias name ARN: arn:aws:kms:us-west-2:111122223333:alias/ExampleAlias If
       * you don't provide a KMS key ID, Amazon SageMaker uses the default KMS key for Amazon S3 for
       * your role's account. For more information, see KMS-Managed Encryption Keys
       * (https://docs.aws.amazon.com/AmazonS3/latest/dev/UsingKMSEncryption.html) in the Amazon Simple
       * Storage Service Developer Guide. The KMS key policy must grant permission to the IAM role that
       * you specify in your CreateModel
       * (https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_CreateModel.html) request. For
       * more information, see Using Key Policies in AWS KMS
       * (http://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html) in the AWS Key
       * Management Service Developer Guide.
       */
      public fun kmsKeyId(kmsKeyId: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.DataCaptureConfigProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.DataCaptureConfigProperty.builder()

      /**
       * @param captureContentTypeHeader A list of the JSON and CSV content type that the endpoint
       * captures.
       */
      override fun captureContentTypeHeader(captureContentTypeHeader: IResolvable) {
        cdkBuilder.captureContentTypeHeader(captureContentTypeHeader.let(IResolvable::unwrap))
      }

      /**
       * @param captureContentTypeHeader A list of the JSON and CSV content type that the endpoint
       * captures.
       */
      override
          fun captureContentTypeHeader(captureContentTypeHeader: CaptureContentTypeHeaderProperty) {
        cdkBuilder.captureContentTypeHeader(captureContentTypeHeader.let(CaptureContentTypeHeaderProperty::unwrap))
      }

      /**
       * @param captureContentTypeHeader A list of the JSON and CSV content type that the endpoint
       * captures.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("31a3df691231e3741b21575ed4957e82fdb752b2995392ce72f37435a3fbfd17")
      override
          fun captureContentTypeHeader(captureContentTypeHeader: CaptureContentTypeHeaderProperty.Builder.() -> Unit):
          Unit =
          captureContentTypeHeader(CaptureContentTypeHeaderProperty(captureContentTypeHeader))

      /**
       * @param captureOptions Specifies whether the endpoint captures input data to your model,
       * output data from your model, or both. 
       */
      override fun captureOptions(captureOptions: IResolvable) {
        cdkBuilder.captureOptions(captureOptions.let(IResolvable::unwrap))
      }

      /**
       * @param captureOptions Specifies whether the endpoint captures input data to your model,
       * output data from your model, or both. 
       */
      override fun captureOptions(captureOptions: List<Any>) {
        cdkBuilder.captureOptions(captureOptions)
      }

      /**
       * @param captureOptions Specifies whether the endpoint captures input data to your model,
       * output data from your model, or both. 
       */
      override fun captureOptions(vararg captureOptions: Any): Unit =
          captureOptions(captureOptions.toList())

      /**
       * @param destinationS3Uri The S3 bucket where model monitor stores captured data. 
       */
      override fun destinationS3Uri(destinationS3Uri: String) {
        cdkBuilder.destinationS3Uri(destinationS3Uri)
      }

      /**
       * @param enableCapture Set to `True` to enable data capture.
       */
      override fun enableCapture(enableCapture: Boolean) {
        cdkBuilder.enableCapture(enableCapture)
      }

      /**
       * @param enableCapture Set to `True` to enable data capture.
       */
      override fun enableCapture(enableCapture: IResolvable) {
        cdkBuilder.enableCapture(enableCapture.let(IResolvable::unwrap))
      }

      /**
       * @param initialSamplingPercentage The percentage of data to capture. 
       */
      override fun initialSamplingPercentage(initialSamplingPercentage: Number) {
        cdkBuilder.initialSamplingPercentage(initialSamplingPercentage)
      }

      /**
       * @param kmsKeyId The AWS Key Management Service ( AWS KMS) key that Amazon SageMaker uses to
       * encrypt the captured data at rest using Amazon S3 server-side encryption.
       * The KmsKeyId can be any of the following formats: Key ID:
       * 1234abcd-12ab-34cd-56ef-1234567890ab Key ARN:
       * arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab Alias name:
       * alias/ExampleAlias Alias name ARN: arn:aws:kms:us-west-2:111122223333:alias/ExampleAlias If
       * you don't provide a KMS key ID, Amazon SageMaker uses the default KMS key for Amazon S3 for
       * your role's account. For more information, see KMS-Managed Encryption Keys
       * (https://docs.aws.amazon.com/AmazonS3/latest/dev/UsingKMSEncryption.html) in the Amazon Simple
       * Storage Service Developer Guide. The KMS key policy must grant permission to the IAM role that
       * you specify in your CreateModel
       * (https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_CreateModel.html) request. For
       * more information, see Using Key Policies in AWS KMS
       * (http://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html) in the AWS Key
       * Management Service Developer Guide.
       */
      override fun kmsKeyId(kmsKeyId: String) {
        cdkBuilder.kmsKeyId(kmsKeyId)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.DataCaptureConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.DataCaptureConfigProperty,
    ) : CdkObject(cdkObject), DataCaptureConfigProperty {
      /**
       * A list of the JSON and CSV content type that the endpoint captures.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpointconfig-datacaptureconfig.html#cfn-sagemaker-endpointconfig-datacaptureconfig-capturecontenttypeheader)
       */
      override fun captureContentTypeHeader(): Any? = unwrap(this).getCaptureContentTypeHeader()

      /**
       * Specifies whether the endpoint captures input data to your model, output data from your
       * model, or both.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpointconfig-datacaptureconfig.html#cfn-sagemaker-endpointconfig-datacaptureconfig-captureoptions)
       */
      override fun captureOptions(): Any = unwrap(this).getCaptureOptions()

      /**
       * The S3 bucket where model monitor stores captured data.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpointconfig-datacaptureconfig.html#cfn-sagemaker-endpointconfig-datacaptureconfig-destinations3uri)
       */
      override fun destinationS3Uri(): String = unwrap(this).getDestinationS3Uri()

      /**
       * Set to `True` to enable data capture.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpointconfig-datacaptureconfig.html#cfn-sagemaker-endpointconfig-datacaptureconfig-enablecapture)
       */
      override fun enableCapture(): Any? = unwrap(this).getEnableCapture()

      /**
       * The percentage of data to capture.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpointconfig-datacaptureconfig.html#cfn-sagemaker-endpointconfig-datacaptureconfig-initialsamplingpercentage)
       */
      override fun initialSamplingPercentage(): Number = unwrap(this).getInitialSamplingPercentage()

      /**
       * The AWS Key Management Service ( AWS KMS) key that Amazon SageMaker uses to encrypt the
       * captured data at rest using Amazon S3 server-side encryption.
       *
       * The KmsKeyId can be any of the following formats: Key ID:
       * 1234abcd-12ab-34cd-56ef-1234567890ab Key ARN:
       * arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab Alias name:
       * alias/ExampleAlias Alias name ARN: arn:aws:kms:us-west-2:111122223333:alias/ExampleAlias If
       * you don't provide a KMS key ID, Amazon SageMaker uses the default KMS key for Amazon S3 for
       * your role's account. For more information, see KMS-Managed Encryption Keys
       * (https://docs.aws.amazon.com/AmazonS3/latest/dev/UsingKMSEncryption.html) in the Amazon Simple
       * Storage Service Developer Guide. The KMS key policy must grant permission to the IAM role that
       * you specify in your CreateModel
       * (https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_CreateModel.html) request. For
       * more information, see Using Key Policies in AWS KMS
       * (http://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html) in the AWS Key
       * Management Service Developer Guide.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpointconfig-datacaptureconfig.html#cfn-sagemaker-endpointconfig-datacaptureconfig-kmskeyid)
       */
      override fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DataCaptureConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.DataCaptureConfigProperty):
          DataCaptureConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DataCaptureConfigProperty):
          software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.DataCaptureConfigProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.DataCaptureConfigProperty
    }
  }

  /**
   * The configuration parameters for the SageMaker Clarify explainer.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sagemaker.*;
   * ClarifyExplainerConfigProperty clarifyExplainerConfigProperty =
   * ClarifyExplainerConfigProperty.builder()
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpointconfig-clarifyexplainerconfig.html)
   */
  public interface ClarifyExplainerConfigProperty {
    /**
     * A JMESPath boolean expression used to filter which records to explain.
     *
     * Explanations are activated by default. See
     * [`EnableExplanations`](https://docs.aws.amazon.com/sagemaker/latest/dg/clarify-online-explainability-create-endpoint.html#clarify-online-explainability-create-endpoint-enable)
     * for additional information.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpointconfig-clarifyexplainerconfig.html#cfn-sagemaker-endpointconfig-clarifyexplainerconfig-enableexplanations)
     */
    public fun enableExplanations(): String? = unwrap(this).getEnableExplanations()

    /**
     * The inference configuration parameter for the model container.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpointconfig-clarifyexplainerconfig.html#cfn-sagemaker-endpointconfig-clarifyexplainerconfig-inferenceconfig)
     */
    public fun inferenceConfig(): Any? = unwrap(this).getInferenceConfig()

    /**
     * The configuration for SHAP analysis.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpointconfig-clarifyexplainerconfig.html#cfn-sagemaker-endpointconfig-clarifyexplainerconfig-shapconfig)
     */
    public fun shapConfig(): Any

    /**
     * A builder for [ClarifyExplainerConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param enableExplanations A JMESPath boolean expression used to filter which records to
       * explain.
       * Explanations are activated by default. See
       * [`EnableExplanations`](https://docs.aws.amazon.com/sagemaker/latest/dg/clarify-online-explainability-create-endpoint.html#clarify-online-explainability-create-endpoint-enable)
       * for additional information.
       */
      public fun enableExplanations(enableExplanations: String)

      /**
       * @param inferenceConfig The inference configuration parameter for the model container.
       */
      public fun inferenceConfig(inferenceConfig: IResolvable)

      /**
       * @param inferenceConfig The inference configuration parameter for the model container.
       */
      public fun inferenceConfig(inferenceConfig: ClarifyInferenceConfigProperty)

      /**
       * @param inferenceConfig The inference configuration parameter for the model container.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2d3847dc1e89bbccd4521b78d7f69dfe3103728da680575e496f455e90b0ba64")
      public fun inferenceConfig(inferenceConfig: ClarifyInferenceConfigProperty.Builder.() -> Unit)

      /**
       * @param shapConfig The configuration for SHAP analysis. 
       */
      public fun shapConfig(shapConfig: IResolvable)

      /**
       * @param shapConfig The configuration for SHAP analysis. 
       */
      public fun shapConfig(shapConfig: ClarifyShapConfigProperty)

      /**
       * @param shapConfig The configuration for SHAP analysis. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6e18830621d5bb7e43df94655ffbe11f05a35ea31fe7a0d8210a2f1b7d359d47")
      public fun shapConfig(shapConfig: ClarifyShapConfigProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.ClarifyExplainerConfigProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.ClarifyExplainerConfigProperty.builder()

      /**
       * @param enableExplanations A JMESPath boolean expression used to filter which records to
       * explain.
       * Explanations are activated by default. See
       * [`EnableExplanations`](https://docs.aws.amazon.com/sagemaker/latest/dg/clarify-online-explainability-create-endpoint.html#clarify-online-explainability-create-endpoint-enable)
       * for additional information.
       */
      override fun enableExplanations(enableExplanations: String) {
        cdkBuilder.enableExplanations(enableExplanations)
      }

      /**
       * @param inferenceConfig The inference configuration parameter for the model container.
       */
      override fun inferenceConfig(inferenceConfig: IResolvable) {
        cdkBuilder.inferenceConfig(inferenceConfig.let(IResolvable::unwrap))
      }

      /**
       * @param inferenceConfig The inference configuration parameter for the model container.
       */
      override fun inferenceConfig(inferenceConfig: ClarifyInferenceConfigProperty) {
        cdkBuilder.inferenceConfig(inferenceConfig.let(ClarifyInferenceConfigProperty::unwrap))
      }

      /**
       * @param inferenceConfig The inference configuration parameter for the model container.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2d3847dc1e89bbccd4521b78d7f69dfe3103728da680575e496f455e90b0ba64")
      override
          fun inferenceConfig(inferenceConfig: ClarifyInferenceConfigProperty.Builder.() -> Unit):
          Unit = inferenceConfig(ClarifyInferenceConfigProperty(inferenceConfig))

      /**
       * @param shapConfig The configuration for SHAP analysis. 
       */
      override fun shapConfig(shapConfig: IResolvable) {
        cdkBuilder.shapConfig(shapConfig.let(IResolvable::unwrap))
      }

      /**
       * @param shapConfig The configuration for SHAP analysis. 
       */
      override fun shapConfig(shapConfig: ClarifyShapConfigProperty) {
        cdkBuilder.shapConfig(shapConfig.let(ClarifyShapConfigProperty::unwrap))
      }

      /**
       * @param shapConfig The configuration for SHAP analysis. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6e18830621d5bb7e43df94655ffbe11f05a35ea31fe7a0d8210a2f1b7d359d47")
      override fun shapConfig(shapConfig: ClarifyShapConfigProperty.Builder.() -> Unit): Unit =
          shapConfig(ClarifyShapConfigProperty(shapConfig))

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.ClarifyExplainerConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.ClarifyExplainerConfigProperty,
    ) : CdkObject(cdkObject), ClarifyExplainerConfigProperty {
      /**
       * A JMESPath boolean expression used to filter which records to explain.
       *
       * Explanations are activated by default. See
       * [`EnableExplanations`](https://docs.aws.amazon.com/sagemaker/latest/dg/clarify-online-explainability-create-endpoint.html#clarify-online-explainability-create-endpoint-enable)
       * for additional information.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpointconfig-clarifyexplainerconfig.html#cfn-sagemaker-endpointconfig-clarifyexplainerconfig-enableexplanations)
       */
      override fun enableExplanations(): String? = unwrap(this).getEnableExplanations()

      /**
       * The inference configuration parameter for the model container.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpointconfig-clarifyexplainerconfig.html#cfn-sagemaker-endpointconfig-clarifyexplainerconfig-inferenceconfig)
       */
      override fun inferenceConfig(): Any? = unwrap(this).getInferenceConfig()

      /**
       * The configuration for SHAP analysis.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpointconfig-clarifyexplainerconfig.html#cfn-sagemaker-endpointconfig-clarifyexplainerconfig-shapconfig)
       */
      override fun shapConfig(): Any = unwrap(this).getShapConfig()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ClarifyExplainerConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.ClarifyExplainerConfigProperty):
          ClarifyExplainerConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ClarifyExplainerConfigProperty):
          software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.ClarifyExplainerConfigProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.ClarifyExplainerConfigProperty
    }
  }

  /**
   * A parameter to activate explainers.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sagemaker.*;
   * ExplainerConfigProperty explainerConfigProperty = ExplainerConfigProperty.builder()
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpointconfig-explainerconfig.html)
   */
  public interface ExplainerConfigProperty {
    /**
     * A member of `ExplainerConfig` that contains configuration parameters for the SageMaker
     * Clarify explainer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpointconfig-explainerconfig.html#cfn-sagemaker-endpointconfig-explainerconfig-clarifyexplainerconfig)
     */
    public fun clarifyExplainerConfig(): Any? = unwrap(this).getClarifyExplainerConfig()

    /**
     * A builder for [ExplainerConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param clarifyExplainerConfig A member of `ExplainerConfig` that contains configuration
       * parameters for the SageMaker Clarify explainer.
       */
      public fun clarifyExplainerConfig(clarifyExplainerConfig: IResolvable)

      /**
       * @param clarifyExplainerConfig A member of `ExplainerConfig` that contains configuration
       * parameters for the SageMaker Clarify explainer.
       */
      public fun clarifyExplainerConfig(clarifyExplainerConfig: ClarifyExplainerConfigProperty)

      /**
       * @param clarifyExplainerConfig A member of `ExplainerConfig` that contains configuration
       * parameters for the SageMaker Clarify explainer.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("61e075251fd9dec5d2e4d8a12c1f17e34e37cb8efce9a075355d11388bc99d53")
      public
          fun clarifyExplainerConfig(clarifyExplainerConfig: ClarifyExplainerConfigProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.ExplainerConfigProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.ExplainerConfigProperty.builder()

      /**
       * @param clarifyExplainerConfig A member of `ExplainerConfig` that contains configuration
       * parameters for the SageMaker Clarify explainer.
       */
      override fun clarifyExplainerConfig(clarifyExplainerConfig: IResolvable) {
        cdkBuilder.clarifyExplainerConfig(clarifyExplainerConfig.let(IResolvable::unwrap))
      }

      /**
       * @param clarifyExplainerConfig A member of `ExplainerConfig` that contains configuration
       * parameters for the SageMaker Clarify explainer.
       */
      override fun clarifyExplainerConfig(clarifyExplainerConfig: ClarifyExplainerConfigProperty) {
        cdkBuilder.clarifyExplainerConfig(clarifyExplainerConfig.let(ClarifyExplainerConfigProperty::unwrap))
      }

      /**
       * @param clarifyExplainerConfig A member of `ExplainerConfig` that contains configuration
       * parameters for the SageMaker Clarify explainer.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("61e075251fd9dec5d2e4d8a12c1f17e34e37cb8efce9a075355d11388bc99d53")
      override
          fun clarifyExplainerConfig(clarifyExplainerConfig: ClarifyExplainerConfigProperty.Builder.() -> Unit):
          Unit = clarifyExplainerConfig(ClarifyExplainerConfigProperty(clarifyExplainerConfig))

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.ExplainerConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.ExplainerConfigProperty,
    ) : CdkObject(cdkObject), ExplainerConfigProperty {
      /**
       * A member of `ExplainerConfig` that contains configuration parameters for the SageMaker
       * Clarify explainer.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpointconfig-explainerconfig.html#cfn-sagemaker-endpointconfig-explainerconfig-clarifyexplainerconfig)
       */
      override fun clarifyExplainerConfig(): Any? = unwrap(this).getClarifyExplainerConfig()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ExplainerConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.ExplainerConfigProperty):
          ExplainerConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ExplainerConfigProperty):
          software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.ExplainerConfigProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.ExplainerConfigProperty
    }
  }

  /**
   * Specifies whether the endpoint captures input data or output data.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sagemaker.*;
   * CaptureOptionProperty captureOptionProperty = CaptureOptionProperty.builder()
   * .captureMode("captureMode")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpointconfig-captureoption.html)
   */
  public interface CaptureOptionProperty {
    /**
     * Specifies whether the endpoint captures input data or output data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpointconfig-captureoption.html#cfn-sagemaker-endpointconfig-captureoption-capturemode)
     */
    public fun captureMode(): String

    /**
     * A builder for [CaptureOptionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param captureMode Specifies whether the endpoint captures input data or output data. 
       */
      public fun captureMode(captureMode: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.CaptureOptionProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.CaptureOptionProperty.builder()

      /**
       * @param captureMode Specifies whether the endpoint captures input data or output data. 
       */
      override fun captureMode(captureMode: String) {
        cdkBuilder.captureMode(captureMode)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.CaptureOptionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.CaptureOptionProperty,
    ) : CdkObject(cdkObject), CaptureOptionProperty {
      /**
       * Specifies whether the endpoint captures input data or output data.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpointconfig-captureoption.html#cfn-sagemaker-endpointconfig-captureoption-capturemode)
       */
      override fun captureMode(): String = unwrap(this).getCaptureMode()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CaptureOptionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.CaptureOptionProperty):
          CaptureOptionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CaptureOptionProperty):
          software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.CaptureOptionProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.CaptureOptionProperty
    }
  }

  /**
   * The configuration for the [SHAP
   * baseline](https://docs.aws.amazon.com/sagemaker/latest/dg/clarify-feature-attribute-shap-baselines.html)
   * (also called the background or reference dataset) of the Kernal SHAP algorithm.
   *
   *
   * * The number of records in the baseline data determines the size of the synthetic dataset,
   * which has an impact on latency of explainability requests. For more information, see the
   * *Synthetic data* of [Configure and create an
   * endpoint](https://docs.aws.amazon.com/sagemaker/latest/dg/clarify-online-explainability-create-endpoint.html)
   * .
   * * `ShapBaseline` and `ShapBaselineUri` are mutually exclusive parameters. One or the either is
   * required to configure a SHAP baseline.
   *
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sagemaker.*;
   * ClarifyShapBaselineConfigProperty clarifyShapBaselineConfigProperty =
   * ClarifyShapBaselineConfigProperty.builder()
   * .mimeType("mimeType")
   * .shapBaseline("shapBaseline")
   * .shapBaselineUri("shapBaselineUri")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpointconfig-clarifyshapbaselineconfig.html)
   */
  public interface ClarifyShapBaselineConfigProperty {
    /**
     * The MIME type of the baseline data.
     *
     * Choose from `'text/csv'` or `'application/jsonlines'` . Defaults to `'text/csv'` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpointconfig-clarifyshapbaselineconfig.html#cfn-sagemaker-endpointconfig-clarifyshapbaselineconfig-mimetype)
     */
    public fun mimeType(): String? = unwrap(this).getMimeType()

    /**
     * The inline SHAP baseline data in string format.
     *
     * `ShapBaseline` can have one or multiple records to be used as the baseline dataset. The
     * format of the SHAP baseline file should be the same format as the training dataset. For example,
     * if the training dataset is in CSV format and each record contains four features, and all
     * features are numerical, then the format of the baseline data should also share these
     * characteristics. For natural language processing (NLP) of text columns, the baseline value
     * should be the value used to replace the unit of text specified by the `Granularity` of the
     * `TextConfig` parameter. The size limit for `ShapBasline` is 4 KB. Use the `ShapBaselineUri`
     * parameter if you want to provide more than 4 KB of baseline data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpointconfig-clarifyshapbaselineconfig.html#cfn-sagemaker-endpointconfig-clarifyshapbaselineconfig-shapbaseline)
     */
    public fun shapBaseline(): String? = unwrap(this).getShapBaseline()

    /**
     * The uniform resource identifier (URI) of the S3 bucket where the SHAP baseline file is
     * stored.
     *
     * The format of the SHAP baseline file should be the same format as the format of the training
     * dataset. For example, if the training dataset is in CSV format, and each record in the training
     * dataset has four features, and all features are numerical, then the baseline file should also
     * have this same format. Each record should contain only the features. If you are using a virtual
     * private cloud (VPC), the `ShapBaselineUri` should be accessible to the VPC. For more information
     * about setting up endpoints with Amazon Virtual Private Cloud, see [Give SageMaker access to
     * Resources in your Amazon Virtual Private
     * Cloud](https://docs.aws.amazon.com/sagemaker/latest/dg/infrastructure-give-access.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpointconfig-clarifyshapbaselineconfig.html#cfn-sagemaker-endpointconfig-clarifyshapbaselineconfig-shapbaselineuri)
     */
    public fun shapBaselineUri(): String? = unwrap(this).getShapBaselineUri()

    /**
     * A builder for [ClarifyShapBaselineConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param mimeType The MIME type of the baseline data.
       * Choose from `'text/csv'` or `'application/jsonlines'` . Defaults to `'text/csv'` .
       */
      public fun mimeType(mimeType: String)

      /**
       * @param shapBaseline The inline SHAP baseline data in string format.
       * `ShapBaseline` can have one or multiple records to be used as the baseline dataset. The
       * format of the SHAP baseline file should be the same format as the training dataset. For
       * example, if the training dataset is in CSV format and each record contains four features, and
       * all features are numerical, then the format of the baseline data should also share these
       * characteristics. For natural language processing (NLP) of text columns, the baseline value
       * should be the value used to replace the unit of text specified by the `Granularity` of the
       * `TextConfig` parameter. The size limit for `ShapBasline` is 4 KB. Use the `ShapBaselineUri`
       * parameter if you want to provide more than 4 KB of baseline data.
       */
      public fun shapBaseline(shapBaseline: String)

      /**
       * @param shapBaselineUri The uniform resource identifier (URI) of the S3 bucket where the
       * SHAP baseline file is stored.
       * The format of the SHAP baseline file should be the same format as the format of the
       * training dataset. For example, if the training dataset is in CSV format, and each record in
       * the training dataset has four features, and all features are numerical, then the baseline file
       * should also have this same format. Each record should contain only the features. If you are
       * using a virtual private cloud (VPC), the `ShapBaselineUri` should be accessible to the VPC.
       * For more information about setting up endpoints with Amazon Virtual Private Cloud, see [Give
       * SageMaker access to Resources in your Amazon Virtual Private
       * Cloud](https://docs.aws.amazon.com/sagemaker/latest/dg/infrastructure-give-access.html) .
       */
      public fun shapBaselineUri(shapBaselineUri: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.ClarifyShapBaselineConfigProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.ClarifyShapBaselineConfigProperty.builder()

      /**
       * @param mimeType The MIME type of the baseline data.
       * Choose from `'text/csv'` or `'application/jsonlines'` . Defaults to `'text/csv'` .
       */
      override fun mimeType(mimeType: String) {
        cdkBuilder.mimeType(mimeType)
      }

      /**
       * @param shapBaseline The inline SHAP baseline data in string format.
       * `ShapBaseline` can have one or multiple records to be used as the baseline dataset. The
       * format of the SHAP baseline file should be the same format as the training dataset. For
       * example, if the training dataset is in CSV format and each record contains four features, and
       * all features are numerical, then the format of the baseline data should also share these
       * characteristics. For natural language processing (NLP) of text columns, the baseline value
       * should be the value used to replace the unit of text specified by the `Granularity` of the
       * `TextConfig` parameter. The size limit for `ShapBasline` is 4 KB. Use the `ShapBaselineUri`
       * parameter if you want to provide more than 4 KB of baseline data.
       */
      override fun shapBaseline(shapBaseline: String) {
        cdkBuilder.shapBaseline(shapBaseline)
      }

      /**
       * @param shapBaselineUri The uniform resource identifier (URI) of the S3 bucket where the
       * SHAP baseline file is stored.
       * The format of the SHAP baseline file should be the same format as the format of the
       * training dataset. For example, if the training dataset is in CSV format, and each record in
       * the training dataset has four features, and all features are numerical, then the baseline file
       * should also have this same format. Each record should contain only the features. If you are
       * using a virtual private cloud (VPC), the `ShapBaselineUri` should be accessible to the VPC.
       * For more information about setting up endpoints with Amazon Virtual Private Cloud, see [Give
       * SageMaker access to Resources in your Amazon Virtual Private
       * Cloud](https://docs.aws.amazon.com/sagemaker/latest/dg/infrastructure-give-access.html) .
       */
      override fun shapBaselineUri(shapBaselineUri: String) {
        cdkBuilder.shapBaselineUri(shapBaselineUri)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.ClarifyShapBaselineConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.ClarifyShapBaselineConfigProperty,
    ) : CdkObject(cdkObject), ClarifyShapBaselineConfigProperty {
      /**
       * The MIME type of the baseline data.
       *
       * Choose from `'text/csv'` or `'application/jsonlines'` . Defaults to `'text/csv'` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpointconfig-clarifyshapbaselineconfig.html#cfn-sagemaker-endpointconfig-clarifyshapbaselineconfig-mimetype)
       */
      override fun mimeType(): String? = unwrap(this).getMimeType()

      /**
       * The inline SHAP baseline data in string format.
       *
       * `ShapBaseline` can have one or multiple records to be used as the baseline dataset. The
       * format of the SHAP baseline file should be the same format as the training dataset. For
       * example, if the training dataset is in CSV format and each record contains four features, and
       * all features are numerical, then the format of the baseline data should also share these
       * characteristics. For natural language processing (NLP) of text columns, the baseline value
       * should be the value used to replace the unit of text specified by the `Granularity` of the
       * `TextConfig` parameter. The size limit for `ShapBasline` is 4 KB. Use the `ShapBaselineUri`
       * parameter if you want to provide more than 4 KB of baseline data.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpointconfig-clarifyshapbaselineconfig.html#cfn-sagemaker-endpointconfig-clarifyshapbaselineconfig-shapbaseline)
       */
      override fun shapBaseline(): String? = unwrap(this).getShapBaseline()

      /**
       * The uniform resource identifier (URI) of the S3 bucket where the SHAP baseline file is
       * stored.
       *
       * The format of the SHAP baseline file should be the same format as the format of the
       * training dataset. For example, if the training dataset is in CSV format, and each record in
       * the training dataset has four features, and all features are numerical, then the baseline file
       * should also have this same format. Each record should contain only the features. If you are
       * using a virtual private cloud (VPC), the `ShapBaselineUri` should be accessible to the VPC.
       * For more information about setting up endpoints with Amazon Virtual Private Cloud, see [Give
       * SageMaker access to Resources in your Amazon Virtual Private
       * Cloud](https://docs.aws.amazon.com/sagemaker/latest/dg/infrastructure-give-access.html) .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpointconfig-clarifyshapbaselineconfig.html#cfn-sagemaker-endpointconfig-clarifyshapbaselineconfig-shapbaselineuri)
       */
      override fun shapBaselineUri(): String? = unwrap(this).getShapBaselineUri()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          ClarifyShapBaselineConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.ClarifyShapBaselineConfigProperty):
          ClarifyShapBaselineConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ClarifyShapBaselineConfigProperty):
          software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.ClarifyShapBaselineConfigProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.ClarifyShapBaselineConfigProperty
    }
  }

  /**
   * Specifies the configuration for asynchronous inference invocation outputs.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sagemaker.*;
   * AsyncInferenceOutputConfigProperty asyncInferenceOutputConfigProperty =
   * AsyncInferenceOutputConfigProperty.builder()
   * .kmsKeyId("kmsKeyId")
   * .notificationConfig(AsyncInferenceNotificationConfigProperty.builder()
   * .errorTopic("errorTopic")
   * .includeInferenceResponseIn(List.of("includeInferenceResponseIn"))
   * .successTopic("successTopic")
   * .build())
   * .s3FailurePath("s3FailurePath")
   * .s3OutputPath("s3OutputPath")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpointconfig-asyncinferenceoutputconfig.html)
   */
  public interface AsyncInferenceOutputConfigProperty {
    /**
     * The AWS Key Management Service ( AWS KMS) key that Amazon SageMaker uses to encrypt the
     * asynchronous inference output in Amazon S3.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpointconfig-asyncinferenceoutputconfig.html#cfn-sagemaker-endpointconfig-asyncinferenceoutputconfig-kmskeyid)
     */
    public fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

    /**
     * Specifies the configuration for notifications of inference results for asynchronous
     * inference.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpointconfig-asyncinferenceoutputconfig.html#cfn-sagemaker-endpointconfig-asyncinferenceoutputconfig-notificationconfig)
     */
    public fun notificationConfig(): Any? = unwrap(this).getNotificationConfig()

    /**
     * The Amazon S3 location to upload failure inference responses to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpointconfig-asyncinferenceoutputconfig.html#cfn-sagemaker-endpointconfig-asyncinferenceoutputconfig-s3failurepath)
     */
    public fun s3FailurePath(): String? = unwrap(this).getS3FailurePath()

    /**
     * The Amazon S3 location to upload inference responses to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpointconfig-asyncinferenceoutputconfig.html#cfn-sagemaker-endpointconfig-asyncinferenceoutputconfig-s3outputpath)
     */
    public fun s3OutputPath(): String? = unwrap(this).getS3OutputPath()

    /**
     * A builder for [AsyncInferenceOutputConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param kmsKeyId The AWS Key Management Service ( AWS KMS) key that Amazon SageMaker uses to
       * encrypt the asynchronous inference output in Amazon S3.
       */
      public fun kmsKeyId(kmsKeyId: String)

      /**
       * @param notificationConfig Specifies the configuration for notifications of inference
       * results for asynchronous inference.
       */
      public fun notificationConfig(notificationConfig: IResolvable)

      /**
       * @param notificationConfig Specifies the configuration for notifications of inference
       * results for asynchronous inference.
       */
      public fun notificationConfig(notificationConfig: AsyncInferenceNotificationConfigProperty)

      /**
       * @param notificationConfig Specifies the configuration for notifications of inference
       * results for asynchronous inference.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3338c4e7a789e490c929ebb44cd454a0619e9b7a124dc2800175ea742e577929")
      public
          fun notificationConfig(notificationConfig: AsyncInferenceNotificationConfigProperty.Builder.() -> Unit)

      /**
       * @param s3FailurePath The Amazon S3 location to upload failure inference responses to.
       */
      public fun s3FailurePath(s3FailurePath: String)

      /**
       * @param s3OutputPath The Amazon S3 location to upload inference responses to.
       */
      public fun s3OutputPath(s3OutputPath: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.AsyncInferenceOutputConfigProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.AsyncInferenceOutputConfigProperty.builder()

      /**
       * @param kmsKeyId The AWS Key Management Service ( AWS KMS) key that Amazon SageMaker uses to
       * encrypt the asynchronous inference output in Amazon S3.
       */
      override fun kmsKeyId(kmsKeyId: String) {
        cdkBuilder.kmsKeyId(kmsKeyId)
      }

      /**
       * @param notificationConfig Specifies the configuration for notifications of inference
       * results for asynchronous inference.
       */
      override fun notificationConfig(notificationConfig: IResolvable) {
        cdkBuilder.notificationConfig(notificationConfig.let(IResolvable::unwrap))
      }

      /**
       * @param notificationConfig Specifies the configuration for notifications of inference
       * results for asynchronous inference.
       */
      override
          fun notificationConfig(notificationConfig: AsyncInferenceNotificationConfigProperty) {
        cdkBuilder.notificationConfig(notificationConfig.let(AsyncInferenceNotificationConfigProperty::unwrap))
      }

      /**
       * @param notificationConfig Specifies the configuration for notifications of inference
       * results for asynchronous inference.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3338c4e7a789e490c929ebb44cd454a0619e9b7a124dc2800175ea742e577929")
      override
          fun notificationConfig(notificationConfig: AsyncInferenceNotificationConfigProperty.Builder.() -> Unit):
          Unit = notificationConfig(AsyncInferenceNotificationConfigProperty(notificationConfig))

      /**
       * @param s3FailurePath The Amazon S3 location to upload failure inference responses to.
       */
      override fun s3FailurePath(s3FailurePath: String) {
        cdkBuilder.s3FailurePath(s3FailurePath)
      }

      /**
       * @param s3OutputPath The Amazon S3 location to upload inference responses to.
       */
      override fun s3OutputPath(s3OutputPath: String) {
        cdkBuilder.s3OutputPath(s3OutputPath)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.AsyncInferenceOutputConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.AsyncInferenceOutputConfigProperty,
    ) : CdkObject(cdkObject), AsyncInferenceOutputConfigProperty {
      /**
       * The AWS Key Management Service ( AWS KMS) key that Amazon SageMaker uses to encrypt the
       * asynchronous inference output in Amazon S3.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpointconfig-asyncinferenceoutputconfig.html#cfn-sagemaker-endpointconfig-asyncinferenceoutputconfig-kmskeyid)
       */
      override fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

      /**
       * Specifies the configuration for notifications of inference results for asynchronous
       * inference.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpointconfig-asyncinferenceoutputconfig.html#cfn-sagemaker-endpointconfig-asyncinferenceoutputconfig-notificationconfig)
       */
      override fun notificationConfig(): Any? = unwrap(this).getNotificationConfig()

      /**
       * The Amazon S3 location to upload failure inference responses to.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpointconfig-asyncinferenceoutputconfig.html#cfn-sagemaker-endpointconfig-asyncinferenceoutputconfig-s3failurepath)
       */
      override fun s3FailurePath(): String? = unwrap(this).getS3FailurePath()

      /**
       * The Amazon S3 location to upload inference responses to.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpointconfig-asyncinferenceoutputconfig.html#cfn-sagemaker-endpointconfig-asyncinferenceoutputconfig-s3outputpath)
       */
      override fun s3OutputPath(): String? = unwrap(this).getS3OutputPath()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          AsyncInferenceOutputConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.AsyncInferenceOutputConfigProperty):
          AsyncInferenceOutputConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AsyncInferenceOutputConfigProperty):
          software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.AsyncInferenceOutputConfigProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.AsyncInferenceOutputConfigProperty
    }
  }
}
