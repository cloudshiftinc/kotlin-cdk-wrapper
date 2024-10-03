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
 * Properties for defining a `CfnInferenceExperiment`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.sagemaker.*;
 * CfnInferenceExperimentProps cfnInferenceExperimentProps = CfnInferenceExperimentProps.builder()
 * .endpointName("endpointName")
 * .modelVariants(List.of(ModelVariantConfigProperty.builder()
 * .infrastructureConfig(ModelInfrastructureConfigProperty.builder()
 * .infrastructureType("infrastructureType")
 * .realTimeInferenceConfig(RealTimeInferenceConfigProperty.builder()
 * .instanceCount(123)
 * .instanceType("instanceType")
 * .build())
 * .build())
 * .modelName("modelName")
 * .variantName("variantName")
 * .build()))
 * .name("name")
 * .roleArn("roleArn")
 * .type("type")
 * // the properties below are optional
 * .dataStorageConfig(DataStorageConfigProperty.builder()
 * .destination("destination")
 * // the properties below are optional
 * .contentType(CaptureContentTypeHeaderProperty.builder()
 * .csvContentTypes(List.of("csvContentTypes"))
 * .jsonContentTypes(List.of("jsonContentTypes"))
 * .build())
 * .kmsKey("kmsKey")
 * .build())
 * .description("description")
 * .desiredState("desiredState")
 * .kmsKey("kmsKey")
 * .schedule(InferenceExperimentScheduleProperty.builder()
 * .endTime("endTime")
 * .startTime("startTime")
 * .build())
 * .shadowModeConfig(ShadowModeConfigProperty.builder()
 * .shadowModelVariants(List.of(ShadowModelVariantConfigProperty.builder()
 * .samplingPercentage(123)
 * .shadowModelVariantName("shadowModelVariantName")
 * .build()))
 * .sourceModelVariantName("sourceModelVariantName")
 * .build())
 * .statusReason("statusReason")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-inferenceexperiment.html)
 */
public interface CfnInferenceExperimentProps {
  /**
   * The Amazon S3 location and configuration for storing inference request and response data.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-inferenceexperiment.html#cfn-sagemaker-inferenceexperiment-datastorageconfig)
   */
  public fun dataStorageConfig(): Any? = unwrap(this).getDataStorageConfig()

  /**
   * The description of the inference experiment.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-inferenceexperiment.html#cfn-sagemaker-inferenceexperiment-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The desired state of the experiment after stopping. The possible states are the following:.
   *
   * * `Completed` : The experiment completed successfully
   * * `Cancelled` : The experiment was canceled
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-inferenceexperiment.html#cfn-sagemaker-inferenceexperiment-desiredstate)
   */
  public fun desiredState(): String? = unwrap(this).getDesiredState()

  /**
   * The name of the endpoint.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-inferenceexperiment.html#cfn-sagemaker-inferenceexperiment-endpointname)
   */
  public fun endpointName(): String

  /**
   * The AWS Key Management Service key that Amazon SageMaker uses to encrypt captured data at rest
   * using Amazon S3 server-side encryption.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-inferenceexperiment.html#cfn-sagemaker-inferenceexperiment-kmskey)
   */
  public fun kmsKey(): String? = unwrap(this).getKmsKey()

  /**
   * An array of `ModelVariantConfigSummary` objects.
   *
   * There is one for each variant in the inference experiment. Each `ModelVariantConfigSummary`
   * object in the array describes the infrastructure configuration for deploying the corresponding
   * variant.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-inferenceexperiment.html#cfn-sagemaker-inferenceexperiment-modelvariants)
   */
  public fun modelVariants(): Any

  /**
   * The name of the inference experiment.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-inferenceexperiment.html#cfn-sagemaker-inferenceexperiment-name)
   */
  public fun name(): String

  /**
   * The ARN of the IAM role that Amazon SageMaker can assume to access model artifacts and
   * container images, and manage Amazon SageMaker Inference endpoints for model deployment.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-inferenceexperiment.html#cfn-sagemaker-inferenceexperiment-rolearn)
   */
  public fun roleArn(): String

  /**
   * The duration for which the inference experiment ran or will run.
   *
   * The maximum duration that you can set for an inference experiment is 30 days.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-inferenceexperiment.html#cfn-sagemaker-inferenceexperiment-schedule)
   */
  public fun schedule(): Any? = unwrap(this).getSchedule()

  /**
   * The configuration of `ShadowMode` inference experiment type, which shows the production variant
   * that takes all the inference requests, and the shadow variant to which Amazon SageMaker replicates
   * a percentage of the inference requests.
   *
   * For the shadow variant it also shows the percentage of requests that Amazon SageMaker
   * replicates.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-inferenceexperiment.html#cfn-sagemaker-inferenceexperiment-shadowmodeconfig)
   */
  public fun shadowModeConfig(): Any? = unwrap(this).getShadowModeConfig()

  /**
   * The error message for the inference experiment status result.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-inferenceexperiment.html#cfn-sagemaker-inferenceexperiment-statusreason)
   */
  public fun statusReason(): String? = unwrap(this).getStatusReason()

  /**
   * An array of key-value pairs to apply to this resource.
   *
   * For more information, see
   * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-inferenceexperiment.html#cfn-sagemaker-inferenceexperiment-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * The type of the inference experiment.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-inferenceexperiment.html#cfn-sagemaker-inferenceexperiment-type)
   */
  public fun type(): String

  /**
   * A builder for [CfnInferenceExperimentProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param dataStorageConfig The Amazon S3 location and configuration for storing inference
     * request and response data.
     */
    public fun dataStorageConfig(dataStorageConfig: IResolvable)

    /**
     * @param dataStorageConfig The Amazon S3 location and configuration for storing inference
     * request and response data.
     */
    public
        fun dataStorageConfig(dataStorageConfig: CfnInferenceExperiment.DataStorageConfigProperty)

    /**
     * @param dataStorageConfig The Amazon S3 location and configuration for storing inference
     * request and response data.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("230de13e9a1326e3c3c66b31ad41473b32f19c7f6ad5768f3a53b6aa39ec0d55")
    public
        fun dataStorageConfig(dataStorageConfig: CfnInferenceExperiment.DataStorageConfigProperty.Builder.() -> Unit)

    /**
     * @param description The description of the inference experiment.
     */
    public fun description(description: String)

    /**
     * @param desiredState The desired state of the experiment after stopping. The possible states
     * are the following:.
     * * `Completed` : The experiment completed successfully
     * * `Cancelled` : The experiment was canceled
     */
    public fun desiredState(desiredState: String)

    /**
     * @param endpointName The name of the endpoint. 
     */
    public fun endpointName(endpointName: String)

    /**
     * @param kmsKey The AWS Key Management Service key that Amazon SageMaker uses to encrypt
     * captured data at rest using Amazon S3 server-side encryption.
     */
    public fun kmsKey(kmsKey: String)

    /**
     * @param modelVariants An array of `ModelVariantConfigSummary` objects. 
     * There is one for each variant in the inference experiment. Each `ModelVariantConfigSummary`
     * object in the array describes the infrastructure configuration for deploying the corresponding
     * variant.
     */
    public fun modelVariants(modelVariants: IResolvable)

    /**
     * @param modelVariants An array of `ModelVariantConfigSummary` objects. 
     * There is one for each variant in the inference experiment. Each `ModelVariantConfigSummary`
     * object in the array describes the infrastructure configuration for deploying the corresponding
     * variant.
     */
    public fun modelVariants(modelVariants: List<Any>)

    /**
     * @param modelVariants An array of `ModelVariantConfigSummary` objects. 
     * There is one for each variant in the inference experiment. Each `ModelVariantConfigSummary`
     * object in the array describes the infrastructure configuration for deploying the corresponding
     * variant.
     */
    public fun modelVariants(vararg modelVariants: Any)

    /**
     * @param name The name of the inference experiment. 
     */
    public fun name(name: String)

    /**
     * @param roleArn The ARN of the IAM role that Amazon SageMaker can assume to access model
     * artifacts and container images, and manage Amazon SageMaker Inference endpoints for model
     * deployment. 
     */
    public fun roleArn(roleArn: String)

    /**
     * @param schedule The duration for which the inference experiment ran or will run.
     * The maximum duration that you can set for an inference experiment is 30 days.
     */
    public fun schedule(schedule: IResolvable)

    /**
     * @param schedule The duration for which the inference experiment ran or will run.
     * The maximum duration that you can set for an inference experiment is 30 days.
     */
    public fun schedule(schedule: CfnInferenceExperiment.InferenceExperimentScheduleProperty)

    /**
     * @param schedule The duration for which the inference experiment ran or will run.
     * The maximum duration that you can set for an inference experiment is 30 days.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e096285ae42483363fa6d87de9717d6cd427622fa505d51be7713b8161daecad")
    public
        fun schedule(schedule: CfnInferenceExperiment.InferenceExperimentScheduleProperty.Builder.() -> Unit)

    /**
     * @param shadowModeConfig The configuration of `ShadowMode` inference experiment type, which
     * shows the production variant that takes all the inference requests, and the shadow variant to
     * which Amazon SageMaker replicates a percentage of the inference requests.
     * For the shadow variant it also shows the percentage of requests that Amazon SageMaker
     * replicates.
     */
    public fun shadowModeConfig(shadowModeConfig: IResolvable)

    /**
     * @param shadowModeConfig The configuration of `ShadowMode` inference experiment type, which
     * shows the production variant that takes all the inference requests, and the shadow variant to
     * which Amazon SageMaker replicates a percentage of the inference requests.
     * For the shadow variant it also shows the percentage of requests that Amazon SageMaker
     * replicates.
     */
    public fun shadowModeConfig(shadowModeConfig: CfnInferenceExperiment.ShadowModeConfigProperty)

    /**
     * @param shadowModeConfig The configuration of `ShadowMode` inference experiment type, which
     * shows the production variant that takes all the inference requests, and the shadow variant to
     * which Amazon SageMaker replicates a percentage of the inference requests.
     * For the shadow variant it also shows the percentage of requests that Amazon SageMaker
     * replicates.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("60d6081dbb5198770f8528460e240bd952c1cd9291f29d6271d7e138c9da1af6")
    public
        fun shadowModeConfig(shadowModeConfig: CfnInferenceExperiment.ShadowModeConfigProperty.Builder.() -> Unit)

    /**
     * @param statusReason The error message for the inference experiment status result.
     */
    public fun statusReason(statusReason: String)

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param type The type of the inference experiment. 
     */
    public fun type(type: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.sagemaker.CfnInferenceExperimentProps.Builder =
        software.amazon.awscdk.services.sagemaker.CfnInferenceExperimentProps.builder()

    /**
     * @param dataStorageConfig The Amazon S3 location and configuration for storing inference
     * request and response data.
     */
    override fun dataStorageConfig(dataStorageConfig: IResolvable) {
      cdkBuilder.dataStorageConfig(dataStorageConfig.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param dataStorageConfig The Amazon S3 location and configuration for storing inference
     * request and response data.
     */
    override
        fun dataStorageConfig(dataStorageConfig: CfnInferenceExperiment.DataStorageConfigProperty) {
      cdkBuilder.dataStorageConfig(dataStorageConfig.let(CfnInferenceExperiment.DataStorageConfigProperty.Companion::unwrap))
    }

    /**
     * @param dataStorageConfig The Amazon S3 location and configuration for storing inference
     * request and response data.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("230de13e9a1326e3c3c66b31ad41473b32f19c7f6ad5768f3a53b6aa39ec0d55")
    override
        fun dataStorageConfig(dataStorageConfig: CfnInferenceExperiment.DataStorageConfigProperty.Builder.() -> Unit):
        Unit =
        dataStorageConfig(CfnInferenceExperiment.DataStorageConfigProperty(dataStorageConfig))

    /**
     * @param description The description of the inference experiment.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param desiredState The desired state of the experiment after stopping. The possible states
     * are the following:.
     * * `Completed` : The experiment completed successfully
     * * `Cancelled` : The experiment was canceled
     */
    override fun desiredState(desiredState: String) {
      cdkBuilder.desiredState(desiredState)
    }

    /**
     * @param endpointName The name of the endpoint. 
     */
    override fun endpointName(endpointName: String) {
      cdkBuilder.endpointName(endpointName)
    }

    /**
     * @param kmsKey The AWS Key Management Service key that Amazon SageMaker uses to encrypt
     * captured data at rest using Amazon S3 server-side encryption.
     */
    override fun kmsKey(kmsKey: String) {
      cdkBuilder.kmsKey(kmsKey)
    }

    /**
     * @param modelVariants An array of `ModelVariantConfigSummary` objects. 
     * There is one for each variant in the inference experiment. Each `ModelVariantConfigSummary`
     * object in the array describes the infrastructure configuration for deploying the corresponding
     * variant.
     */
    override fun modelVariants(modelVariants: IResolvable) {
      cdkBuilder.modelVariants(modelVariants.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param modelVariants An array of `ModelVariantConfigSummary` objects. 
     * There is one for each variant in the inference experiment. Each `ModelVariantConfigSummary`
     * object in the array describes the infrastructure configuration for deploying the corresponding
     * variant.
     */
    override fun modelVariants(modelVariants: List<Any>) {
      cdkBuilder.modelVariants(modelVariants.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param modelVariants An array of `ModelVariantConfigSummary` objects. 
     * There is one for each variant in the inference experiment. Each `ModelVariantConfigSummary`
     * object in the array describes the infrastructure configuration for deploying the corresponding
     * variant.
     */
    override fun modelVariants(vararg modelVariants: Any): Unit =
        modelVariants(modelVariants.toList())

    /**
     * @param name The name of the inference experiment. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param roleArn The ARN of the IAM role that Amazon SageMaker can assume to access model
     * artifacts and container images, and manage Amazon SageMaker Inference endpoints for model
     * deployment. 
     */
    override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    /**
     * @param schedule The duration for which the inference experiment ran or will run.
     * The maximum duration that you can set for an inference experiment is 30 days.
     */
    override fun schedule(schedule: IResolvable) {
      cdkBuilder.schedule(schedule.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param schedule The duration for which the inference experiment ran or will run.
     * The maximum duration that you can set for an inference experiment is 30 days.
     */
    override fun schedule(schedule: CfnInferenceExperiment.InferenceExperimentScheduleProperty) {
      cdkBuilder.schedule(schedule.let(CfnInferenceExperiment.InferenceExperimentScheduleProperty.Companion::unwrap))
    }

    /**
     * @param schedule The duration for which the inference experiment ran or will run.
     * The maximum duration that you can set for an inference experiment is 30 days.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e096285ae42483363fa6d87de9717d6cd427622fa505d51be7713b8161daecad")
    override
        fun schedule(schedule: CfnInferenceExperiment.InferenceExperimentScheduleProperty.Builder.() -> Unit):
        Unit = schedule(CfnInferenceExperiment.InferenceExperimentScheduleProperty(schedule))

    /**
     * @param shadowModeConfig The configuration of `ShadowMode` inference experiment type, which
     * shows the production variant that takes all the inference requests, and the shadow variant to
     * which Amazon SageMaker replicates a percentage of the inference requests.
     * For the shadow variant it also shows the percentage of requests that Amazon SageMaker
     * replicates.
     */
    override fun shadowModeConfig(shadowModeConfig: IResolvable) {
      cdkBuilder.shadowModeConfig(shadowModeConfig.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param shadowModeConfig The configuration of `ShadowMode` inference experiment type, which
     * shows the production variant that takes all the inference requests, and the shadow variant to
     * which Amazon SageMaker replicates a percentage of the inference requests.
     * For the shadow variant it also shows the percentage of requests that Amazon SageMaker
     * replicates.
     */
    override
        fun shadowModeConfig(shadowModeConfig: CfnInferenceExperiment.ShadowModeConfigProperty) {
      cdkBuilder.shadowModeConfig(shadowModeConfig.let(CfnInferenceExperiment.ShadowModeConfigProperty.Companion::unwrap))
    }

    /**
     * @param shadowModeConfig The configuration of `ShadowMode` inference experiment type, which
     * shows the production variant that takes all the inference requests, and the shadow variant to
     * which Amazon SageMaker replicates a percentage of the inference requests.
     * For the shadow variant it also shows the percentage of requests that Amazon SageMaker
     * replicates.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("60d6081dbb5198770f8528460e240bd952c1cd9291f29d6271d7e138c9da1af6")
    override
        fun shadowModeConfig(shadowModeConfig: CfnInferenceExperiment.ShadowModeConfigProperty.Builder.() -> Unit):
        Unit = shadowModeConfig(CfnInferenceExperiment.ShadowModeConfigProperty(shadowModeConfig))

    /**
     * @param statusReason The error message for the inference experiment status result.
     */
    override fun statusReason(statusReason: String) {
      cdkBuilder.statusReason(statusReason)
    }

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param type The type of the inference experiment. 
     */
    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    public fun build(): software.amazon.awscdk.services.sagemaker.CfnInferenceExperimentProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.sagemaker.CfnInferenceExperimentProps,
  ) : CdkObject(cdkObject),
      CfnInferenceExperimentProps {
    /**
     * The Amazon S3 location and configuration for storing inference request and response data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-inferenceexperiment.html#cfn-sagemaker-inferenceexperiment-datastorageconfig)
     */
    override fun dataStorageConfig(): Any? = unwrap(this).getDataStorageConfig()

    /**
     * The description of the inference experiment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-inferenceexperiment.html#cfn-sagemaker-inferenceexperiment-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The desired state of the experiment after stopping. The possible states are the following:.
     *
     * * `Completed` : The experiment completed successfully
     * * `Cancelled` : The experiment was canceled
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-inferenceexperiment.html#cfn-sagemaker-inferenceexperiment-desiredstate)
     */
    override fun desiredState(): String? = unwrap(this).getDesiredState()

    /**
     * The name of the endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-inferenceexperiment.html#cfn-sagemaker-inferenceexperiment-endpointname)
     */
    override fun endpointName(): String = unwrap(this).getEndpointName()

    /**
     * The AWS Key Management Service key that Amazon SageMaker uses to encrypt captured data at
     * rest using Amazon S3 server-side encryption.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-inferenceexperiment.html#cfn-sagemaker-inferenceexperiment-kmskey)
     */
    override fun kmsKey(): String? = unwrap(this).getKmsKey()

    /**
     * An array of `ModelVariantConfigSummary` objects.
     *
     * There is one for each variant in the inference experiment. Each `ModelVariantConfigSummary`
     * object in the array describes the infrastructure configuration for deploying the corresponding
     * variant.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-inferenceexperiment.html#cfn-sagemaker-inferenceexperiment-modelvariants)
     */
    override fun modelVariants(): Any = unwrap(this).getModelVariants()

    /**
     * The name of the inference experiment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-inferenceexperiment.html#cfn-sagemaker-inferenceexperiment-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * The ARN of the IAM role that Amazon SageMaker can assume to access model artifacts and
     * container images, and manage Amazon SageMaker Inference endpoints for model deployment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-inferenceexperiment.html#cfn-sagemaker-inferenceexperiment-rolearn)
     */
    override fun roleArn(): String = unwrap(this).getRoleArn()

    /**
     * The duration for which the inference experiment ran or will run.
     *
     * The maximum duration that you can set for an inference experiment is 30 days.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-inferenceexperiment.html#cfn-sagemaker-inferenceexperiment-schedule)
     */
    override fun schedule(): Any? = unwrap(this).getSchedule()

    /**
     * The configuration of `ShadowMode` inference experiment type, which shows the production
     * variant that takes all the inference requests, and the shadow variant to which Amazon SageMaker
     * replicates a percentage of the inference requests.
     *
     * For the shadow variant it also shows the percentage of requests that Amazon SageMaker
     * replicates.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-inferenceexperiment.html#cfn-sagemaker-inferenceexperiment-shadowmodeconfig)
     */
    override fun shadowModeConfig(): Any? = unwrap(this).getShadowModeConfig()

    /**
     * The error message for the inference experiment status result.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-inferenceexperiment.html#cfn-sagemaker-inferenceexperiment-statusreason)
     */
    override fun statusReason(): String? = unwrap(this).getStatusReason()

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-inferenceexperiment.html#cfn-sagemaker-inferenceexperiment-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * The type of the inference experiment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-inferenceexperiment.html#cfn-sagemaker-inferenceexperiment-type)
     */
    override fun type(): String = unwrap(this).getType()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnInferenceExperimentProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnInferenceExperimentProps):
        CfnInferenceExperimentProps = CdkObjectWrappers.wrap(cdkObject) as?
        CfnInferenceExperimentProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnInferenceExperimentProps):
        software.amazon.awscdk.services.sagemaker.CfnInferenceExperimentProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.sagemaker.CfnInferenceExperimentProps
  }
}
