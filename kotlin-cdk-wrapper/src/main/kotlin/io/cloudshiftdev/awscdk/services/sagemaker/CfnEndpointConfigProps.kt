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
 * Properties for defining a `CfnEndpointConfig`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.sagemaker.*;
 * CfnEndpointConfigProps cfnEndpointConfigProps = CfnEndpointConfigProps.builder()
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
public interface CfnEndpointConfigProps {
  /**
   * Specifies configuration for how an endpoint performs asynchronous inference.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-endpointconfig.html#cfn-sagemaker-endpointconfig-asyncinferenceconfig)
   */
  public fun asyncInferenceConfig(): Any? = unwrap(this).getAsyncInferenceConfig()

  /**
   * Specifies how to capture endpoint data for model monitor.
   *
   * The data capture configuration applies to all production variants hosted at the endpoint.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-endpointconfig.html#cfn-sagemaker-endpointconfig-datacaptureconfig)
   */
  public fun dataCaptureConfig(): Any? = unwrap(this).getDataCaptureConfig()

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-endpointconfig.html#cfn-sagemaker-endpointconfig-enablenetworkisolation)
   */
  public fun enableNetworkIsolation(): Any? = unwrap(this).getEnableNetworkIsolation()

  /**
   * The name of the endpoint configuration.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-endpointconfig.html#cfn-sagemaker-endpointconfig-endpointconfigname)
   */
  public fun endpointConfigName(): String? = unwrap(this).getEndpointConfigName()

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-endpointconfig.html#cfn-sagemaker-endpointconfig-executionrolearn)
   */
  public fun executionRoleArn(): String? = unwrap(this).getExecutionRoleArn()

  /**
   * A parameter to activate explainers.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-endpointconfig.html#cfn-sagemaker-endpointconfig-explainerconfig)
   */
  public fun explainerConfig(): Any? = unwrap(this).getExplainerConfig()

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
   */
  public fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

  /**
   * A list of `ProductionVariant` objects, one for each model that you want to host at this
   * endpoint.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-endpointconfig.html#cfn-sagemaker-endpointconfig-productionvariants)
   */
  public fun productionVariants(): Any

  /**
   * Array of `ProductionVariant` objects.
   *
   * There is one for each model that you want to host at this endpoint in shadow mode with
   * production traffic replicated from the model specified on `ProductionVariants` . If you use this
   * field, you can only specify one variant for `ProductionVariants` and one variant for
   * `ShadowProductionVariants` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-endpointconfig.html#cfn-sagemaker-endpointconfig-shadowproductionvariants)
   */
  public fun shadowProductionVariants(): Any? = unwrap(this).getShadowProductionVariants()

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
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-endpointconfig.html#cfn-sagemaker-endpointconfig-vpcconfig)
   */
  public fun vpcConfig(): Any? = unwrap(this).getVpcConfig()

  /**
   * A builder for [CfnEndpointConfigProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param asyncInferenceConfig Specifies configuration for how an endpoint performs asynchronous
     * inference.
     */
    public fun asyncInferenceConfig(asyncInferenceConfig: IResolvable)

    /**
     * @param asyncInferenceConfig Specifies configuration for how an endpoint performs asynchronous
     * inference.
     */
    public
        fun asyncInferenceConfig(asyncInferenceConfig: CfnEndpointConfig.AsyncInferenceConfigProperty)

    /**
     * @param asyncInferenceConfig Specifies configuration for how an endpoint performs asynchronous
     * inference.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1e64e5623831debfb163b584a19ce54b2d2c625f1ef7118f02bf5f2bc9fa1062")
    public
        fun asyncInferenceConfig(asyncInferenceConfig: CfnEndpointConfig.AsyncInferenceConfigProperty.Builder.() -> Unit)

    /**
     * @param dataCaptureConfig Specifies how to capture endpoint data for model monitor.
     * The data capture configuration applies to all production variants hosted at the endpoint.
     */
    public fun dataCaptureConfig(dataCaptureConfig: IResolvable)

    /**
     * @param dataCaptureConfig Specifies how to capture endpoint data for model monitor.
     * The data capture configuration applies to all production variants hosted at the endpoint.
     */
    public fun dataCaptureConfig(dataCaptureConfig: CfnEndpointConfig.DataCaptureConfigProperty)

    /**
     * @param dataCaptureConfig Specifies how to capture endpoint data for model monitor.
     * The data capture configuration applies to all production variants hosted at the endpoint.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4d54ba33b4fc0a9e7e611d30949571c00d4eb51726524dcb9572bcbd196468e3")
    public
        fun dataCaptureConfig(dataCaptureConfig: CfnEndpointConfig.DataCaptureConfigProperty.Builder.() -> Unit)

    /**
     * @param enableNetworkIsolation the value to be set.
     */
    public fun enableNetworkIsolation(enableNetworkIsolation: Boolean)

    /**
     * @param enableNetworkIsolation the value to be set.
     */
    public fun enableNetworkIsolation(enableNetworkIsolation: IResolvable)

    /**
     * @param endpointConfigName The name of the endpoint configuration.
     */
    public fun endpointConfigName(endpointConfigName: String)

    /**
     * @param executionRoleArn the value to be set.
     */
    public fun executionRoleArn(executionRoleArn: String)

    /**
     * @param explainerConfig A parameter to activate explainers.
     */
    public fun explainerConfig(explainerConfig: IResolvable)

    /**
     * @param explainerConfig A parameter to activate explainers.
     */
    public fun explainerConfig(explainerConfig: CfnEndpointConfig.ExplainerConfigProperty)

    /**
     * @param explainerConfig A parameter to activate explainers.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b32626afe90ebc00de45f64188881a0114b93fe414a65ed55705c0e1797670b4")
    public
        fun explainerConfig(explainerConfig: CfnEndpointConfig.ExplainerConfigProperty.Builder.() -> Unit)

    /**
     * @param kmsKeyId The Amazon Resource Name (ARN) of an AWS Key Management Service key that
     * Amazon SageMaker uses to encrypt data on the storage volume attached to the ML compute instance
     * that hosts the endpoint.
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
     */
    public fun kmsKeyId(kmsKeyId: String)

    /**
     * @param productionVariants A list of `ProductionVariant` objects, one for each model that you
     * want to host at this endpoint. 
     */
    public fun productionVariants(productionVariants: IResolvable)

    /**
     * @param productionVariants A list of `ProductionVariant` objects, one for each model that you
     * want to host at this endpoint. 
     */
    public fun productionVariants(productionVariants: List<Any>)

    /**
     * @param productionVariants A list of `ProductionVariant` objects, one for each model that you
     * want to host at this endpoint. 
     */
    public fun productionVariants(vararg productionVariants: Any)

    /**
     * @param shadowProductionVariants Array of `ProductionVariant` objects.
     * There is one for each model that you want to host at this endpoint in shadow mode with
     * production traffic replicated from the model specified on `ProductionVariants` . If you use this
     * field, you can only specify one variant for `ProductionVariants` and one variant for
     * `ShadowProductionVariants` .
     */
    public fun shadowProductionVariants(shadowProductionVariants: IResolvable)

    /**
     * @param shadowProductionVariants Array of `ProductionVariant` objects.
     * There is one for each model that you want to host at this endpoint in shadow mode with
     * production traffic replicated from the model specified on `ProductionVariants` . If you use this
     * field, you can only specify one variant for `ProductionVariants` and one variant for
     * `ShadowProductionVariants` .
     */
    public fun shadowProductionVariants(shadowProductionVariants: List<Any>)

    /**
     * @param shadowProductionVariants Array of `ProductionVariant` objects.
     * There is one for each model that you want to host at this endpoint in shadow mode with
     * production traffic replicated from the model specified on `ProductionVariants` . If you use this
     * field, you can only specify one variant for `ProductionVariants` and one variant for
     * `ShadowProductionVariants` .
     */
    public fun shadowProductionVariants(vararg shadowProductionVariants: Any)

    /**
     * @param tags A list of key-value pairs to apply to this resource.
     * For more information, see [Resource
     * Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * and [Using Cost Allocation
     * Tags](https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html#allocation-what)
     * .
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags A list of key-value pairs to apply to this resource.
     * For more information, see [Resource
     * Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * and [Using Cost Allocation
     * Tags](https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html#allocation-what)
     * .
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param vpcConfig the value to be set.
     */
    public fun vpcConfig(vpcConfig: IResolvable)

    /**
     * @param vpcConfig the value to be set.
     */
    public fun vpcConfig(vpcConfig: CfnEndpointConfig.VpcConfigProperty)

    /**
     * @param vpcConfig the value to be set.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("504a7ba8dd06581c27b35e06debcbd2c5f80e54aa90453bd2d0ca59e0bf78a2c")
    public fun vpcConfig(vpcConfig: CfnEndpointConfig.VpcConfigProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.sagemaker.CfnEndpointConfigProps.Builder
        = software.amazon.awscdk.services.sagemaker.CfnEndpointConfigProps.builder()

    /**
     * @param asyncInferenceConfig Specifies configuration for how an endpoint performs asynchronous
     * inference.
     */
    override fun asyncInferenceConfig(asyncInferenceConfig: IResolvable) {
      cdkBuilder.asyncInferenceConfig(asyncInferenceConfig.let(IResolvable::unwrap))
    }

    /**
     * @param asyncInferenceConfig Specifies configuration for how an endpoint performs asynchronous
     * inference.
     */
    override
        fun asyncInferenceConfig(asyncInferenceConfig: CfnEndpointConfig.AsyncInferenceConfigProperty) {
      cdkBuilder.asyncInferenceConfig(asyncInferenceConfig.let(CfnEndpointConfig.AsyncInferenceConfigProperty::unwrap))
    }

    /**
     * @param asyncInferenceConfig Specifies configuration for how an endpoint performs asynchronous
     * inference.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1e64e5623831debfb163b584a19ce54b2d2c625f1ef7118f02bf5f2bc9fa1062")
    override
        fun asyncInferenceConfig(asyncInferenceConfig: CfnEndpointConfig.AsyncInferenceConfigProperty.Builder.() -> Unit):
        Unit =
        asyncInferenceConfig(CfnEndpointConfig.AsyncInferenceConfigProperty(asyncInferenceConfig))

    /**
     * @param dataCaptureConfig Specifies how to capture endpoint data for model monitor.
     * The data capture configuration applies to all production variants hosted at the endpoint.
     */
    override fun dataCaptureConfig(dataCaptureConfig: IResolvable) {
      cdkBuilder.dataCaptureConfig(dataCaptureConfig.let(IResolvable::unwrap))
    }

    /**
     * @param dataCaptureConfig Specifies how to capture endpoint data for model monitor.
     * The data capture configuration applies to all production variants hosted at the endpoint.
     */
    override fun dataCaptureConfig(dataCaptureConfig: CfnEndpointConfig.DataCaptureConfigProperty) {
      cdkBuilder.dataCaptureConfig(dataCaptureConfig.let(CfnEndpointConfig.DataCaptureConfigProperty::unwrap))
    }

    /**
     * @param dataCaptureConfig Specifies how to capture endpoint data for model monitor.
     * The data capture configuration applies to all production variants hosted at the endpoint.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4d54ba33b4fc0a9e7e611d30949571c00d4eb51726524dcb9572bcbd196468e3")
    override
        fun dataCaptureConfig(dataCaptureConfig: CfnEndpointConfig.DataCaptureConfigProperty.Builder.() -> Unit):
        Unit = dataCaptureConfig(CfnEndpointConfig.DataCaptureConfigProperty(dataCaptureConfig))

    /**
     * @param enableNetworkIsolation the value to be set.
     */
    override fun enableNetworkIsolation(enableNetworkIsolation: Boolean) {
      cdkBuilder.enableNetworkIsolation(enableNetworkIsolation)
    }

    /**
     * @param enableNetworkIsolation the value to be set.
     */
    override fun enableNetworkIsolation(enableNetworkIsolation: IResolvable) {
      cdkBuilder.enableNetworkIsolation(enableNetworkIsolation.let(IResolvable::unwrap))
    }

    /**
     * @param endpointConfigName The name of the endpoint configuration.
     */
    override fun endpointConfigName(endpointConfigName: String) {
      cdkBuilder.endpointConfigName(endpointConfigName)
    }

    /**
     * @param executionRoleArn the value to be set.
     */
    override fun executionRoleArn(executionRoleArn: String) {
      cdkBuilder.executionRoleArn(executionRoleArn)
    }

    /**
     * @param explainerConfig A parameter to activate explainers.
     */
    override fun explainerConfig(explainerConfig: IResolvable) {
      cdkBuilder.explainerConfig(explainerConfig.let(IResolvable::unwrap))
    }

    /**
     * @param explainerConfig A parameter to activate explainers.
     */
    override fun explainerConfig(explainerConfig: CfnEndpointConfig.ExplainerConfigProperty) {
      cdkBuilder.explainerConfig(explainerConfig.let(CfnEndpointConfig.ExplainerConfigProperty::unwrap))
    }

    /**
     * @param explainerConfig A parameter to activate explainers.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b32626afe90ebc00de45f64188881a0114b93fe414a65ed55705c0e1797670b4")
    override
        fun explainerConfig(explainerConfig: CfnEndpointConfig.ExplainerConfigProperty.Builder.() -> Unit):
        Unit = explainerConfig(CfnEndpointConfig.ExplainerConfigProperty(explainerConfig))

    /**
     * @param kmsKeyId The Amazon Resource Name (ARN) of an AWS Key Management Service key that
     * Amazon SageMaker uses to encrypt data on the storage volume attached to the ML compute instance
     * that hosts the endpoint.
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
     */
    override fun kmsKeyId(kmsKeyId: String) {
      cdkBuilder.kmsKeyId(kmsKeyId)
    }

    /**
     * @param productionVariants A list of `ProductionVariant` objects, one for each model that you
     * want to host at this endpoint. 
     */
    override fun productionVariants(productionVariants: IResolvable) {
      cdkBuilder.productionVariants(productionVariants.let(IResolvable::unwrap))
    }

    /**
     * @param productionVariants A list of `ProductionVariant` objects, one for each model that you
     * want to host at this endpoint. 
     */
    override fun productionVariants(productionVariants: List<Any>) {
      cdkBuilder.productionVariants(productionVariants)
    }

    /**
     * @param productionVariants A list of `ProductionVariant` objects, one for each model that you
     * want to host at this endpoint. 
     */
    override fun productionVariants(vararg productionVariants: Any): Unit =
        productionVariants(productionVariants.toList())

    /**
     * @param shadowProductionVariants Array of `ProductionVariant` objects.
     * There is one for each model that you want to host at this endpoint in shadow mode with
     * production traffic replicated from the model specified on `ProductionVariants` . If you use this
     * field, you can only specify one variant for `ProductionVariants` and one variant for
     * `ShadowProductionVariants` .
     */
    override fun shadowProductionVariants(shadowProductionVariants: IResolvable) {
      cdkBuilder.shadowProductionVariants(shadowProductionVariants.let(IResolvable::unwrap))
    }

    /**
     * @param shadowProductionVariants Array of `ProductionVariant` objects.
     * There is one for each model that you want to host at this endpoint in shadow mode with
     * production traffic replicated from the model specified on `ProductionVariants` . If you use this
     * field, you can only specify one variant for `ProductionVariants` and one variant for
     * `ShadowProductionVariants` .
     */
    override fun shadowProductionVariants(shadowProductionVariants: List<Any>) {
      cdkBuilder.shadowProductionVariants(shadowProductionVariants)
    }

    /**
     * @param shadowProductionVariants Array of `ProductionVariant` objects.
     * There is one for each model that you want to host at this endpoint in shadow mode with
     * production traffic replicated from the model specified on `ProductionVariants` . If you use this
     * field, you can only specify one variant for `ProductionVariants` and one variant for
     * `ShadowProductionVariants` .
     */
    override fun shadowProductionVariants(vararg shadowProductionVariants: Any): Unit =
        shadowProductionVariants(shadowProductionVariants.toList())

    /**
     * @param tags A list of key-value pairs to apply to this resource.
     * For more information, see [Resource
     * Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * and [Using Cost Allocation
     * Tags](https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html#allocation-what)
     * .
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags A list of key-value pairs to apply to this resource.
     * For more information, see [Resource
     * Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * and [Using Cost Allocation
     * Tags](https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html#allocation-what)
     * .
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param vpcConfig the value to be set.
     */
    override fun vpcConfig(vpcConfig: IResolvable) {
      cdkBuilder.vpcConfig(vpcConfig.let(IResolvable::unwrap))
    }

    /**
     * @param vpcConfig the value to be set.
     */
    override fun vpcConfig(vpcConfig: CfnEndpointConfig.VpcConfigProperty) {
      cdkBuilder.vpcConfig(vpcConfig.let(CfnEndpointConfig.VpcConfigProperty::unwrap))
    }

    /**
     * @param vpcConfig the value to be set.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("504a7ba8dd06581c27b35e06debcbd2c5f80e54aa90453bd2d0ca59e0bf78a2c")
    override fun vpcConfig(vpcConfig: CfnEndpointConfig.VpcConfigProperty.Builder.() -> Unit): Unit
        = vpcConfig(CfnEndpointConfig.VpcConfigProperty(vpcConfig))

    public fun build(): software.amazon.awscdk.services.sagemaker.CfnEndpointConfigProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.sagemaker.CfnEndpointConfigProps,
  ) : CdkObject(cdkObject), CfnEndpointConfigProps {
    /**
     * Specifies configuration for how an endpoint performs asynchronous inference.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-endpointconfig.html#cfn-sagemaker-endpointconfig-asyncinferenceconfig)
     */
    override fun asyncInferenceConfig(): Any? = unwrap(this).getAsyncInferenceConfig()

    /**
     * Specifies how to capture endpoint data for model monitor.
     *
     * The data capture configuration applies to all production variants hosted at the endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-endpointconfig.html#cfn-sagemaker-endpointconfig-datacaptureconfig)
     */
    override fun dataCaptureConfig(): Any? = unwrap(this).getDataCaptureConfig()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-endpointconfig.html#cfn-sagemaker-endpointconfig-enablenetworkisolation)
     */
    override fun enableNetworkIsolation(): Any? = unwrap(this).getEnableNetworkIsolation()

    /**
     * The name of the endpoint configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-endpointconfig.html#cfn-sagemaker-endpointconfig-endpointconfigname)
     */
    override fun endpointConfigName(): String? = unwrap(this).getEndpointConfigName()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-endpointconfig.html#cfn-sagemaker-endpointconfig-executionrolearn)
     */
    override fun executionRoleArn(): String? = unwrap(this).getExecutionRoleArn()

    /**
     * A parameter to activate explainers.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-endpointconfig.html#cfn-sagemaker-endpointconfig-explainerconfig)
     */
    override fun explainerConfig(): Any? = unwrap(this).getExplainerConfig()

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
     */
    override fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

    /**
     * A list of `ProductionVariant` objects, one for each model that you want to host at this
     * endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-endpointconfig.html#cfn-sagemaker-endpointconfig-productionvariants)
     */
    override fun productionVariants(): Any = unwrap(this).getProductionVariants()

    /**
     * Array of `ProductionVariant` objects.
     *
     * There is one for each model that you want to host at this endpoint in shadow mode with
     * production traffic replicated from the model specified on `ProductionVariants` . If you use this
     * field, you can only specify one variant for `ProductionVariants` and one variant for
     * `ShadowProductionVariants` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-endpointconfig.html#cfn-sagemaker-endpointconfig-shadowproductionvariants)
     */
    override fun shadowProductionVariants(): Any? = unwrap(this).getShadowProductionVariants()

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
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-endpointconfig.html#cfn-sagemaker-endpointconfig-vpcconfig)
     */
    override fun vpcConfig(): Any? = unwrap(this).getVpcConfig()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnEndpointConfigProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnEndpointConfigProps):
        CfnEndpointConfigProps = CdkObjectWrappers.wrap(cdkObject) as? CfnEndpointConfigProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnEndpointConfigProps):
        software.amazon.awscdk.services.sagemaker.CfnEndpointConfigProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.sagemaker.CfnEndpointConfigProps
  }
}
