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
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Creates an inference experiment using the configurations specified in the request.
 *
 * Use this API to setup and schedule an experiment to compare model variants on a Amazon SageMaker
 * inference endpoint. For more information about inference experiments, see [Shadow
 * tests](https://docs.aws.amazon.com/sagemaker/latest/dg/shadow-tests.html) .
 *
 * Amazon SageMaker begins your experiment at the scheduled time and routes traffic to your
 * endpoint's model variants based on your specified configuration.
 *
 * While the experiment is in progress or after it has concluded, you can view metrics that compare
 * your model variants. For more information, see [View, monitor, and edit shadow
 * tests](https://docs.aws.amazon.com/sagemaker/latest/dg/shadow-tests-view-monitor-edit.html) .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.sagemaker.*;
 * CfnInferenceExperiment cfnInferenceExperiment = CfnInferenceExperiment.Builder.create(this,
 * "MyCfnInferenceExperiment")
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
public open class CfnInferenceExperiment(
  cdkObject: software.amazon.awscdk.services.sagemaker.CfnInferenceExperiment,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnInferenceExperimentProps,
  ) :
      this(software.amazon.awscdk.services.sagemaker.CfnInferenceExperiment(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CfnInferenceExperimentProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnInferenceExperimentProps.Builder.() -> Unit,
  ) : this(scope, id, CfnInferenceExperimentProps(props)
  )

  /**
   * The ARN for your inference experiment.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * The timestamp at which the inference experiment was created.
   */
  public open fun attrCreationTime(): String = unwrap(this).getAttrCreationTime()

  /**
   * The metadata of the endpoint on which the inference experiment ran.
   */
  public open fun attrEndpointMetadata(): IResolvable =
      unwrap(this).getAttrEndpointMetadata().let(IResolvable::wrap)

  /**
   *
   */
  public open fun attrEndpointMetadataEndpointConfigName(): String =
      unwrap(this).getAttrEndpointMetadataEndpointConfigName()

  /**
   *
   */
  public open fun attrEndpointMetadataEndpointName(): String =
      unwrap(this).getAttrEndpointMetadataEndpointName()

  /**
   *
   */
  public open fun attrEndpointMetadataEndpointStatus(): String =
      unwrap(this).getAttrEndpointMetadataEndpointStatus()

  /**
   * The timestamp at which you last modified the inference experiment.
   */
  public open fun attrLastModifiedTime(): String = unwrap(this).getAttrLastModifiedTime()

  /**
   * The status of the inference experiment. The following are the possible statuses for an
   * inference experiment:.
   *
   * * `Creating` - Amazon SageMaker is creating your experiment.
   * * `Created` - Amazon SageMaker has finished the creation of your experiment and will begin the
   * experiment at the scheduled time.
   * * `Updating` - When you make changes to your experiment, your experiment shows as updating.
   * * `Starting` - Amazon SageMaker is beginning your experiment.
   * * `Running` - Your experiment is in progress.
   * * `Stopping` - Amazon SageMaker is stopping your experiment.
   * * `Completed` - Your experiment has completed.
   * * `Cancelled` - When you conclude your experiment early using the
   * [StopInferenceExperiment](https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_StopInferenceExperiment.html)
   * API, or if any operation fails with an unexpected error, it shows as cancelled.
   */
  public open fun attrStatus(): String = unwrap(this).getAttrStatus()

  /**
   * The Amazon S3 location and configuration for storing inference request and response data.
   */
  public open fun dataStorageConfig(): Any? = unwrap(this).getDataStorageConfig()

  /**
   * The Amazon S3 location and configuration for storing inference request and response data.
   */
  public open fun dataStorageConfig(`value`: IResolvable) {
    unwrap(this).setDataStorageConfig(`value`.let(IResolvable::unwrap))
  }

  /**
   * The Amazon S3 location and configuration for storing inference request and response data.
   */
  public open fun dataStorageConfig(`value`: DataStorageConfigProperty) {
    unwrap(this).setDataStorageConfig(`value`.let(DataStorageConfigProperty::unwrap))
  }

  /**
   * The Amazon S3 location and configuration for storing inference request and response data.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("f414884b4ff9ae6b5f00a3740bbb00594265f6f6af882521a2b69b61c77c3e77")
  public open fun dataStorageConfig(`value`: DataStorageConfigProperty.Builder.() -> Unit): Unit =
      dataStorageConfig(DataStorageConfigProperty(`value`))

  /**
   * The description of the inference experiment.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * The description of the inference experiment.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * The desired state of the experiment after stopping.
   *
   * The possible states are the following:.
   */
  public open fun desiredState(): String? = unwrap(this).getDesiredState()

  /**
   * The desired state of the experiment after stopping.
   *
   * The possible states are the following:.
   */
  public open fun desiredState(`value`: String) {
    unwrap(this).setDesiredState(`value`)
  }

  /**
   * The name of the endpoint.
   */
  public open fun endpointName(): String = unwrap(this).getEndpointName()

  /**
   * The name of the endpoint.
   */
  public open fun endpointName(`value`: String) {
    unwrap(this).setEndpointName(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The AWS Key Management Service key that Amazon SageMaker uses to encrypt captured data at rest
   * using Amazon S3 server-side encryption.
   */
  public open fun kmsKey(): String? = unwrap(this).getKmsKey()

  /**
   * The AWS Key Management Service key that Amazon SageMaker uses to encrypt captured data at rest
   * using Amazon S3 server-side encryption.
   */
  public open fun kmsKey(`value`: String) {
    unwrap(this).setKmsKey(`value`)
  }

  /**
   * An array of `ModelVariantConfigSummary` objects.
   */
  public open fun modelVariants(): Any = unwrap(this).getModelVariants()

  /**
   * An array of `ModelVariantConfigSummary` objects.
   */
  public open fun modelVariants(`value`: IResolvable) {
    unwrap(this).setModelVariants(`value`.let(IResolvable::unwrap))
  }

  /**
   * An array of `ModelVariantConfigSummary` objects.
   */
  public open fun modelVariants(`value`: List<Any>) {
    unwrap(this).setModelVariants(`value`.map{CdkObjectWrappers.unwrap(it)})
  }

  /**
   * An array of `ModelVariantConfigSummary` objects.
   */
  public open fun modelVariants(vararg `value`: Any): Unit = modelVariants(`value`.toList())

  /**
   * The name of the inference experiment.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * The name of the inference experiment.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * The ARN of the IAM role that Amazon SageMaker can assume to access model artifacts and
   * container images, and manage Amazon SageMaker Inference endpoints for model deployment.
   */
  public open fun roleArn(): String = unwrap(this).getRoleArn()

  /**
   * The ARN of the IAM role that Amazon SageMaker can assume to access model artifacts and
   * container images, and manage Amazon SageMaker Inference endpoints for model deployment.
   */
  public open fun roleArn(`value`: String) {
    unwrap(this).setRoleArn(`value`)
  }

  /**
   * The duration for which the inference experiment ran or will run.
   */
  public open fun schedule(): Any? = unwrap(this).getSchedule()

  /**
   * The duration for which the inference experiment ran or will run.
   */
  public open fun schedule(`value`: IResolvable) {
    unwrap(this).setSchedule(`value`.let(IResolvable::unwrap))
  }

  /**
   * The duration for which the inference experiment ran or will run.
   */
  public open fun schedule(`value`: InferenceExperimentScheduleProperty) {
    unwrap(this).setSchedule(`value`.let(InferenceExperimentScheduleProperty::unwrap))
  }

  /**
   * The duration for which the inference experiment ran or will run.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("9281d5d1825feb25119389de2c8647c8ab36821c8f0817f1cce1b38786d1ceb8")
  public open fun schedule(`value`: InferenceExperimentScheduleProperty.Builder.() -> Unit): Unit =
      schedule(InferenceExperimentScheduleProperty(`value`))

  /**
   * The configuration of `ShadowMode` inference experiment type, which shows the production variant
   * that takes all the inference requests, and the shadow variant to which Amazon SageMaker replicates
   * a percentage of the inference requests.
   */
  public open fun shadowModeConfig(): Any? = unwrap(this).getShadowModeConfig()

  /**
   * The configuration of `ShadowMode` inference experiment type, which shows the production variant
   * that takes all the inference requests, and the shadow variant to which Amazon SageMaker replicates
   * a percentage of the inference requests.
   */
  public open fun shadowModeConfig(`value`: IResolvable) {
    unwrap(this).setShadowModeConfig(`value`.let(IResolvable::unwrap))
  }

  /**
   * The configuration of `ShadowMode` inference experiment type, which shows the production variant
   * that takes all the inference requests, and the shadow variant to which Amazon SageMaker replicates
   * a percentage of the inference requests.
   */
  public open fun shadowModeConfig(`value`: ShadowModeConfigProperty) {
    unwrap(this).setShadowModeConfig(`value`.let(ShadowModeConfigProperty::unwrap))
  }

  /**
   * The configuration of `ShadowMode` inference experiment type, which shows the production variant
   * that takes all the inference requests, and the shadow variant to which Amazon SageMaker replicates
   * a percentage of the inference requests.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("494cdb3ba4abdd45ced5b56a1bee18e5ca22950a3e575e1c4d03e35aa1610a8e")
  public open fun shadowModeConfig(`value`: ShadowModeConfigProperty.Builder.() -> Unit): Unit =
      shadowModeConfig(ShadowModeConfigProperty(`value`))

  /**
   * The error message for the inference experiment status result.
   */
  public open fun statusReason(): String? = unwrap(this).getStatusReason()

  /**
   * The error message for the inference experiment status result.
   */
  public open fun statusReason(`value`: String) {
    unwrap(this).setStatusReason(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * The type of the inference experiment.
   */
  public open fun type(): String = unwrap(this).getType()

  /**
   * The type of the inference experiment.
   */
  public open fun type(`value`: String) {
    unwrap(this).setType(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.sagemaker.CfnInferenceExperiment].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The Amazon S3 location and configuration for storing inference request and response data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-inferenceexperiment.html#cfn-sagemaker-inferenceexperiment-datastorageconfig)
     * @param dataStorageConfig The Amazon S3 location and configuration for storing inference
     * request and response data. 
     */
    public fun dataStorageConfig(dataStorageConfig: IResolvable)

    /**
     * The Amazon S3 location and configuration for storing inference request and response data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-inferenceexperiment.html#cfn-sagemaker-inferenceexperiment-datastorageconfig)
     * @param dataStorageConfig The Amazon S3 location and configuration for storing inference
     * request and response data. 
     */
    public fun dataStorageConfig(dataStorageConfig: DataStorageConfigProperty)

    /**
     * The Amazon S3 location and configuration for storing inference request and response data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-inferenceexperiment.html#cfn-sagemaker-inferenceexperiment-datastorageconfig)
     * @param dataStorageConfig The Amazon S3 location and configuration for storing inference
     * request and response data. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e51e3d075653daa5174b2be450830b085f8bebfaa6b2d62d2a20fe1a6bec95a5")
    public fun dataStorageConfig(dataStorageConfig: DataStorageConfigProperty.Builder.() -> Unit)

    /**
     * The description of the inference experiment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-inferenceexperiment.html#cfn-sagemaker-inferenceexperiment-description)
     * @param description The description of the inference experiment. 
     */
    public fun description(description: String)

    /**
     * The desired state of the experiment after stopping. The possible states are the following:.
     *
     * * `Completed` : The experiment completed successfully
     * * `Cancelled` : The experiment was canceled
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-inferenceexperiment.html#cfn-sagemaker-inferenceexperiment-desiredstate)
     * @param desiredState The desired state of the experiment after stopping. The possible states
     * are the following:. 
     */
    public fun desiredState(desiredState: String)

    /**
     * The name of the endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-inferenceexperiment.html#cfn-sagemaker-inferenceexperiment-endpointname)
     * @param endpointName The name of the endpoint. 
     */
    public fun endpointName(endpointName: String)

    /**
     * The AWS Key Management Service key that Amazon SageMaker uses to encrypt captured data at
     * rest using Amazon S3 server-side encryption.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-inferenceexperiment.html#cfn-sagemaker-inferenceexperiment-kmskey)
     * @param kmsKey The AWS Key Management Service key that Amazon SageMaker uses to encrypt
     * captured data at rest using Amazon S3 server-side encryption. 
     */
    public fun kmsKey(kmsKey: String)

    /**
     * An array of `ModelVariantConfigSummary` objects.
     *
     * There is one for each variant in the inference experiment. Each `ModelVariantConfigSummary`
     * object in the array describes the infrastructure configuration for deploying the corresponding
     * variant.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-inferenceexperiment.html#cfn-sagemaker-inferenceexperiment-modelvariants)
     * @param modelVariants An array of `ModelVariantConfigSummary` objects. 
     */
    public fun modelVariants(modelVariants: IResolvable)

    /**
     * An array of `ModelVariantConfigSummary` objects.
     *
     * There is one for each variant in the inference experiment. Each `ModelVariantConfigSummary`
     * object in the array describes the infrastructure configuration for deploying the corresponding
     * variant.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-inferenceexperiment.html#cfn-sagemaker-inferenceexperiment-modelvariants)
     * @param modelVariants An array of `ModelVariantConfigSummary` objects. 
     */
    public fun modelVariants(modelVariants: List<Any>)

    /**
     * An array of `ModelVariantConfigSummary` objects.
     *
     * There is one for each variant in the inference experiment. Each `ModelVariantConfigSummary`
     * object in the array describes the infrastructure configuration for deploying the corresponding
     * variant.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-inferenceexperiment.html#cfn-sagemaker-inferenceexperiment-modelvariants)
     * @param modelVariants An array of `ModelVariantConfigSummary` objects. 
     */
    public fun modelVariants(vararg modelVariants: Any)

    /**
     * The name of the inference experiment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-inferenceexperiment.html#cfn-sagemaker-inferenceexperiment-name)
     * @param name The name of the inference experiment. 
     */
    public fun name(name: String)

    /**
     * The ARN of the IAM role that Amazon SageMaker can assume to access model artifacts and
     * container images, and manage Amazon SageMaker Inference endpoints for model deployment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-inferenceexperiment.html#cfn-sagemaker-inferenceexperiment-rolearn)
     * @param roleArn The ARN of the IAM role that Amazon SageMaker can assume to access model
     * artifacts and container images, and manage Amazon SageMaker Inference endpoints for model
     * deployment. 
     */
    public fun roleArn(roleArn: String)

    /**
     * The duration for which the inference experiment ran or will run.
     *
     * The maximum duration that you can set for an inference experiment is 30 days.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-inferenceexperiment.html#cfn-sagemaker-inferenceexperiment-schedule)
     * @param schedule The duration for which the inference experiment ran or will run. 
     */
    public fun schedule(schedule: IResolvable)

    /**
     * The duration for which the inference experiment ran or will run.
     *
     * The maximum duration that you can set for an inference experiment is 30 days.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-inferenceexperiment.html#cfn-sagemaker-inferenceexperiment-schedule)
     * @param schedule The duration for which the inference experiment ran or will run. 
     */
    public fun schedule(schedule: InferenceExperimentScheduleProperty)

    /**
     * The duration for which the inference experiment ran or will run.
     *
     * The maximum duration that you can set for an inference experiment is 30 days.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-inferenceexperiment.html#cfn-sagemaker-inferenceexperiment-schedule)
     * @param schedule The duration for which the inference experiment ran or will run. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b244a9c073c83fcd951950f537fee6a7d3d8ec01411a1f6d5ead347bd57d29ac")
    public fun schedule(schedule: InferenceExperimentScheduleProperty.Builder.() -> Unit)

    /**
     * The configuration of `ShadowMode` inference experiment type, which shows the production
     * variant that takes all the inference requests, and the shadow variant to which Amazon SageMaker
     * replicates a percentage of the inference requests.
     *
     * For the shadow variant it also shows the percentage of requests that Amazon SageMaker
     * replicates.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-inferenceexperiment.html#cfn-sagemaker-inferenceexperiment-shadowmodeconfig)
     * @param shadowModeConfig The configuration of `ShadowMode` inference experiment type, which
     * shows the production variant that takes all the inference requests, and the shadow variant to
     * which Amazon SageMaker replicates a percentage of the inference requests. 
     */
    public fun shadowModeConfig(shadowModeConfig: IResolvable)

    /**
     * The configuration of `ShadowMode` inference experiment type, which shows the production
     * variant that takes all the inference requests, and the shadow variant to which Amazon SageMaker
     * replicates a percentage of the inference requests.
     *
     * For the shadow variant it also shows the percentage of requests that Amazon SageMaker
     * replicates.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-inferenceexperiment.html#cfn-sagemaker-inferenceexperiment-shadowmodeconfig)
     * @param shadowModeConfig The configuration of `ShadowMode` inference experiment type, which
     * shows the production variant that takes all the inference requests, and the shadow variant to
     * which Amazon SageMaker replicates a percentage of the inference requests. 
     */
    public fun shadowModeConfig(shadowModeConfig: ShadowModeConfigProperty)

    /**
     * The configuration of `ShadowMode` inference experiment type, which shows the production
     * variant that takes all the inference requests, and the shadow variant to which Amazon SageMaker
     * replicates a percentage of the inference requests.
     *
     * For the shadow variant it also shows the percentage of requests that Amazon SageMaker
     * replicates.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-inferenceexperiment.html#cfn-sagemaker-inferenceexperiment-shadowmodeconfig)
     * @param shadowModeConfig The configuration of `ShadowMode` inference experiment type, which
     * shows the production variant that takes all the inference requests, and the shadow variant to
     * which Amazon SageMaker replicates a percentage of the inference requests. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2243bb2097ea95ae6f2f4fe27c807f8fc42844d4f75293db606946ba663d6b13")
    public fun shadowModeConfig(shadowModeConfig: ShadowModeConfigProperty.Builder.() -> Unit)

    /**
     * The error message for the inference experiment status result.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-inferenceexperiment.html#cfn-sagemaker-inferenceexperiment-statusreason)
     * @param statusReason The error message for the inference experiment status result. 
     */
    public fun statusReason(statusReason: String)

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-inferenceexperiment.html#cfn-sagemaker-inferenceexperiment-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-inferenceexperiment.html#cfn-sagemaker-inferenceexperiment-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * The type of the inference experiment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-inferenceexperiment.html#cfn-sagemaker-inferenceexperiment-type)
     * @param type The type of the inference experiment. 
     */
    public fun type(type: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.sagemaker.CfnInferenceExperiment.Builder
        = software.amazon.awscdk.services.sagemaker.CfnInferenceExperiment.Builder.create(scope, id)

    /**
     * The Amazon S3 location and configuration for storing inference request and response data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-inferenceexperiment.html#cfn-sagemaker-inferenceexperiment-datastorageconfig)
     * @param dataStorageConfig The Amazon S3 location and configuration for storing inference
     * request and response data. 
     */
    override fun dataStorageConfig(dataStorageConfig: IResolvable) {
      cdkBuilder.dataStorageConfig(dataStorageConfig.let(IResolvable::unwrap))
    }

    /**
     * The Amazon S3 location and configuration for storing inference request and response data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-inferenceexperiment.html#cfn-sagemaker-inferenceexperiment-datastorageconfig)
     * @param dataStorageConfig The Amazon S3 location and configuration for storing inference
     * request and response data. 
     */
    override fun dataStorageConfig(dataStorageConfig: DataStorageConfigProperty) {
      cdkBuilder.dataStorageConfig(dataStorageConfig.let(DataStorageConfigProperty::unwrap))
    }

    /**
     * The Amazon S3 location and configuration for storing inference request and response data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-inferenceexperiment.html#cfn-sagemaker-inferenceexperiment-datastorageconfig)
     * @param dataStorageConfig The Amazon S3 location and configuration for storing inference
     * request and response data. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e51e3d075653daa5174b2be450830b085f8bebfaa6b2d62d2a20fe1a6bec95a5")
    override fun dataStorageConfig(dataStorageConfig: DataStorageConfigProperty.Builder.() -> Unit):
        Unit = dataStorageConfig(DataStorageConfigProperty(dataStorageConfig))

    /**
     * The description of the inference experiment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-inferenceexperiment.html#cfn-sagemaker-inferenceexperiment-description)
     * @param description The description of the inference experiment. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The desired state of the experiment after stopping. The possible states are the following:.
     *
     * * `Completed` : The experiment completed successfully
     * * `Cancelled` : The experiment was canceled
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-inferenceexperiment.html#cfn-sagemaker-inferenceexperiment-desiredstate)
     * @param desiredState The desired state of the experiment after stopping. The possible states
     * are the following:. 
     */
    override fun desiredState(desiredState: String) {
      cdkBuilder.desiredState(desiredState)
    }

    /**
     * The name of the endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-inferenceexperiment.html#cfn-sagemaker-inferenceexperiment-endpointname)
     * @param endpointName The name of the endpoint. 
     */
    override fun endpointName(endpointName: String) {
      cdkBuilder.endpointName(endpointName)
    }

    /**
     * The AWS Key Management Service key that Amazon SageMaker uses to encrypt captured data at
     * rest using Amazon S3 server-side encryption.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-inferenceexperiment.html#cfn-sagemaker-inferenceexperiment-kmskey)
     * @param kmsKey The AWS Key Management Service key that Amazon SageMaker uses to encrypt
     * captured data at rest using Amazon S3 server-side encryption. 
     */
    override fun kmsKey(kmsKey: String) {
      cdkBuilder.kmsKey(kmsKey)
    }

    /**
     * An array of `ModelVariantConfigSummary` objects.
     *
     * There is one for each variant in the inference experiment. Each `ModelVariantConfigSummary`
     * object in the array describes the infrastructure configuration for deploying the corresponding
     * variant.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-inferenceexperiment.html#cfn-sagemaker-inferenceexperiment-modelvariants)
     * @param modelVariants An array of `ModelVariantConfigSummary` objects. 
     */
    override fun modelVariants(modelVariants: IResolvable) {
      cdkBuilder.modelVariants(modelVariants.let(IResolvable::unwrap))
    }

    /**
     * An array of `ModelVariantConfigSummary` objects.
     *
     * There is one for each variant in the inference experiment. Each `ModelVariantConfigSummary`
     * object in the array describes the infrastructure configuration for deploying the corresponding
     * variant.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-inferenceexperiment.html#cfn-sagemaker-inferenceexperiment-modelvariants)
     * @param modelVariants An array of `ModelVariantConfigSummary` objects. 
     */
    override fun modelVariants(modelVariants: List<Any>) {
      cdkBuilder.modelVariants(modelVariants.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * An array of `ModelVariantConfigSummary` objects.
     *
     * There is one for each variant in the inference experiment. Each `ModelVariantConfigSummary`
     * object in the array describes the infrastructure configuration for deploying the corresponding
     * variant.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-inferenceexperiment.html#cfn-sagemaker-inferenceexperiment-modelvariants)
     * @param modelVariants An array of `ModelVariantConfigSummary` objects. 
     */
    override fun modelVariants(vararg modelVariants: Any): Unit =
        modelVariants(modelVariants.toList())

    /**
     * The name of the inference experiment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-inferenceexperiment.html#cfn-sagemaker-inferenceexperiment-name)
     * @param name The name of the inference experiment. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * The ARN of the IAM role that Amazon SageMaker can assume to access model artifacts and
     * container images, and manage Amazon SageMaker Inference endpoints for model deployment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-inferenceexperiment.html#cfn-sagemaker-inferenceexperiment-rolearn)
     * @param roleArn The ARN of the IAM role that Amazon SageMaker can assume to access model
     * artifacts and container images, and manage Amazon SageMaker Inference endpoints for model
     * deployment. 
     */
    override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    /**
     * The duration for which the inference experiment ran or will run.
     *
     * The maximum duration that you can set for an inference experiment is 30 days.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-inferenceexperiment.html#cfn-sagemaker-inferenceexperiment-schedule)
     * @param schedule The duration for which the inference experiment ran or will run. 
     */
    override fun schedule(schedule: IResolvable) {
      cdkBuilder.schedule(schedule.let(IResolvable::unwrap))
    }

    /**
     * The duration for which the inference experiment ran or will run.
     *
     * The maximum duration that you can set for an inference experiment is 30 days.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-inferenceexperiment.html#cfn-sagemaker-inferenceexperiment-schedule)
     * @param schedule The duration for which the inference experiment ran or will run. 
     */
    override fun schedule(schedule: InferenceExperimentScheduleProperty) {
      cdkBuilder.schedule(schedule.let(InferenceExperimentScheduleProperty::unwrap))
    }

    /**
     * The duration for which the inference experiment ran or will run.
     *
     * The maximum duration that you can set for an inference experiment is 30 days.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-inferenceexperiment.html#cfn-sagemaker-inferenceexperiment-schedule)
     * @param schedule The duration for which the inference experiment ran or will run. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b244a9c073c83fcd951950f537fee6a7d3d8ec01411a1f6d5ead347bd57d29ac")
    override fun schedule(schedule: InferenceExperimentScheduleProperty.Builder.() -> Unit): Unit =
        schedule(InferenceExperimentScheduleProperty(schedule))

    /**
     * The configuration of `ShadowMode` inference experiment type, which shows the production
     * variant that takes all the inference requests, and the shadow variant to which Amazon SageMaker
     * replicates a percentage of the inference requests.
     *
     * For the shadow variant it also shows the percentage of requests that Amazon SageMaker
     * replicates.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-inferenceexperiment.html#cfn-sagemaker-inferenceexperiment-shadowmodeconfig)
     * @param shadowModeConfig The configuration of `ShadowMode` inference experiment type, which
     * shows the production variant that takes all the inference requests, and the shadow variant to
     * which Amazon SageMaker replicates a percentage of the inference requests. 
     */
    override fun shadowModeConfig(shadowModeConfig: IResolvable) {
      cdkBuilder.shadowModeConfig(shadowModeConfig.let(IResolvable::unwrap))
    }

    /**
     * The configuration of `ShadowMode` inference experiment type, which shows the production
     * variant that takes all the inference requests, and the shadow variant to which Amazon SageMaker
     * replicates a percentage of the inference requests.
     *
     * For the shadow variant it also shows the percentage of requests that Amazon SageMaker
     * replicates.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-inferenceexperiment.html#cfn-sagemaker-inferenceexperiment-shadowmodeconfig)
     * @param shadowModeConfig The configuration of `ShadowMode` inference experiment type, which
     * shows the production variant that takes all the inference requests, and the shadow variant to
     * which Amazon SageMaker replicates a percentage of the inference requests. 
     */
    override fun shadowModeConfig(shadowModeConfig: ShadowModeConfigProperty) {
      cdkBuilder.shadowModeConfig(shadowModeConfig.let(ShadowModeConfigProperty::unwrap))
    }

    /**
     * The configuration of `ShadowMode` inference experiment type, which shows the production
     * variant that takes all the inference requests, and the shadow variant to which Amazon SageMaker
     * replicates a percentage of the inference requests.
     *
     * For the shadow variant it also shows the percentage of requests that Amazon SageMaker
     * replicates.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-inferenceexperiment.html#cfn-sagemaker-inferenceexperiment-shadowmodeconfig)
     * @param shadowModeConfig The configuration of `ShadowMode` inference experiment type, which
     * shows the production variant that takes all the inference requests, and the shadow variant to
     * which Amazon SageMaker replicates a percentage of the inference requests. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2243bb2097ea95ae6f2f4fe27c807f8fc42844d4f75293db606946ba663d6b13")
    override fun shadowModeConfig(shadowModeConfig: ShadowModeConfigProperty.Builder.() -> Unit):
        Unit = shadowModeConfig(ShadowModeConfigProperty(shadowModeConfig))

    /**
     * The error message for the inference experiment status result.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-inferenceexperiment.html#cfn-sagemaker-inferenceexperiment-statusreason)
     * @param statusReason The error message for the inference experiment status result. 
     */
    override fun statusReason(statusReason: String) {
      cdkBuilder.statusReason(statusReason)
    }

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-inferenceexperiment.html#cfn-sagemaker-inferenceexperiment-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-inferenceexperiment.html#cfn-sagemaker-inferenceexperiment-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * The type of the inference experiment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-inferenceexperiment.html#cfn-sagemaker-inferenceexperiment-type)
     * @param type The type of the inference experiment. 
     */
    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    public fun build(): software.amazon.awscdk.services.sagemaker.CfnInferenceExperiment =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.sagemaker.CfnInferenceExperiment.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnInferenceExperiment {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnInferenceExperiment(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnInferenceExperiment):
        CfnInferenceExperiment = CfnInferenceExperiment(cdkObject)

    internal fun unwrap(wrapped: CfnInferenceExperiment):
        software.amazon.awscdk.services.sagemaker.CfnInferenceExperiment = wrapped.cdkObject as
        software.amazon.awscdk.services.sagemaker.CfnInferenceExperiment
  }

  /**
   * Configuration specifying how to treat different headers.
   *
   * If no headers are specified Amazon SageMaker will by default base64 encode when capturing the
   * data.
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
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-inferenceexperiment-capturecontenttypeheader.html)
   */
  public interface CaptureContentTypeHeaderProperty {
    /**
     * The list of all content type headers that Amazon SageMaker will treat as CSV and capture
     * accordingly.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-inferenceexperiment-capturecontenttypeheader.html#cfn-sagemaker-inferenceexperiment-capturecontenttypeheader-csvcontenttypes)
     */
    public fun csvContentTypes(): List<String> = unwrap(this).getCsvContentTypes() ?: emptyList()

    /**
     * The list of all content type headers that SageMaker will treat as JSON and capture
     * accordingly.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-inferenceexperiment-capturecontenttypeheader.html#cfn-sagemaker-inferenceexperiment-capturecontenttypeheader-jsoncontenttypes)
     */
    public fun jsonContentTypes(): List<String> = unwrap(this).getJsonContentTypes() ?: emptyList()

    /**
     * A builder for [CaptureContentTypeHeaderProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param csvContentTypes The list of all content type headers that Amazon SageMaker will
       * treat as CSV and capture accordingly.
       */
      public fun csvContentTypes(csvContentTypes: List<String>)

      /**
       * @param csvContentTypes The list of all content type headers that Amazon SageMaker will
       * treat as CSV and capture accordingly.
       */
      public fun csvContentTypes(vararg csvContentTypes: String)

      /**
       * @param jsonContentTypes The list of all content type headers that SageMaker will treat as
       * JSON and capture accordingly.
       */
      public fun jsonContentTypes(jsonContentTypes: List<String>)

      /**
       * @param jsonContentTypes The list of all content type headers that SageMaker will treat as
       * JSON and capture accordingly.
       */
      public fun jsonContentTypes(vararg jsonContentTypes: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnInferenceExperiment.CaptureContentTypeHeaderProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnInferenceExperiment.CaptureContentTypeHeaderProperty.builder()

      /**
       * @param csvContentTypes The list of all content type headers that Amazon SageMaker will
       * treat as CSV and capture accordingly.
       */
      override fun csvContentTypes(csvContentTypes: List<String>) {
        cdkBuilder.csvContentTypes(csvContentTypes)
      }

      /**
       * @param csvContentTypes The list of all content type headers that Amazon SageMaker will
       * treat as CSV and capture accordingly.
       */
      override fun csvContentTypes(vararg csvContentTypes: String): Unit =
          csvContentTypes(csvContentTypes.toList())

      /**
       * @param jsonContentTypes The list of all content type headers that SageMaker will treat as
       * JSON and capture accordingly.
       */
      override fun jsonContentTypes(jsonContentTypes: List<String>) {
        cdkBuilder.jsonContentTypes(jsonContentTypes)
      }

      /**
       * @param jsonContentTypes The list of all content type headers that SageMaker will treat as
       * JSON and capture accordingly.
       */
      override fun jsonContentTypes(vararg jsonContentTypes: String): Unit =
          jsonContentTypes(jsonContentTypes.toList())

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnInferenceExperiment.CaptureContentTypeHeaderProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.sagemaker.CfnInferenceExperiment.CaptureContentTypeHeaderProperty,
    ) : CdkObject(cdkObject), CaptureContentTypeHeaderProperty {
      /**
       * The list of all content type headers that Amazon SageMaker will treat as CSV and capture
       * accordingly.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-inferenceexperiment-capturecontenttypeheader.html#cfn-sagemaker-inferenceexperiment-capturecontenttypeheader-csvcontenttypes)
       */
      override fun csvContentTypes(): List<String> = unwrap(this).getCsvContentTypes() ?:
          emptyList()

      /**
       * The list of all content type headers that SageMaker will treat as JSON and capture
       * accordingly.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-inferenceexperiment-capturecontenttypeheader.html#cfn-sagemaker-inferenceexperiment-capturecontenttypeheader-jsoncontenttypes)
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
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnInferenceExperiment.CaptureContentTypeHeaderProperty):
          CaptureContentTypeHeaderProperty = CdkObjectWrappers.wrap(cdkObject) as?
          CaptureContentTypeHeaderProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: CaptureContentTypeHeaderProperty):
          software.amazon.awscdk.services.sagemaker.CfnInferenceExperiment.CaptureContentTypeHeaderProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnInferenceExperiment.CaptureContentTypeHeaderProperty
    }
  }

  /**
   * The Amazon S3 location and configuration for storing inference request and response data.
   *
   * This is an optional parameter that you can use for data capture. For more information, see
   * [Capture data](https://docs.aws.amazon.com/sagemaker/latest/dg/model-monitor-data-capture.html) .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sagemaker.*;
   * DataStorageConfigProperty dataStorageConfigProperty = DataStorageConfigProperty.builder()
   * .destination("destination")
   * // the properties below are optional
   * .contentType(CaptureContentTypeHeaderProperty.builder()
   * .csvContentTypes(List.of("csvContentTypes"))
   * .jsonContentTypes(List.of("jsonContentTypes"))
   * .build())
   * .kmsKey("kmsKey")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-inferenceexperiment-datastorageconfig.html)
   */
  public interface DataStorageConfigProperty {
    /**
     * Configuration specifying how to treat different headers.
     *
     * If no headers are specified SageMaker will by default base64 encode when capturing the data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-inferenceexperiment-datastorageconfig.html#cfn-sagemaker-inferenceexperiment-datastorageconfig-contenttype)
     */
    public fun contentType(): Any? = unwrap(this).getContentType()

    /**
     * The Amazon S3 bucket where the inference request and response data is stored.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-inferenceexperiment-datastorageconfig.html#cfn-sagemaker-inferenceexperiment-datastorageconfig-destination)
     */
    public fun destination(): String

    /**
     * The AWS Key Management Service key that Amazon SageMaker uses to encrypt captured data at
     * rest using Amazon S3 server-side encryption.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-inferenceexperiment-datastorageconfig.html#cfn-sagemaker-inferenceexperiment-datastorageconfig-kmskey)
     */
    public fun kmsKey(): String? = unwrap(this).getKmsKey()

    /**
     * A builder for [DataStorageConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param contentType Configuration specifying how to treat different headers.
       * If no headers are specified SageMaker will by default base64 encode when capturing the
       * data.
       */
      public fun contentType(contentType: IResolvable)

      /**
       * @param contentType Configuration specifying how to treat different headers.
       * If no headers are specified SageMaker will by default base64 encode when capturing the
       * data.
       */
      public fun contentType(contentType: CaptureContentTypeHeaderProperty)

      /**
       * @param contentType Configuration specifying how to treat different headers.
       * If no headers are specified SageMaker will by default base64 encode when capturing the
       * data.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("73064d70e8f53d7e2ea89d687f25104ccbdebcde028549ea11f97ef5cf9f12ab")
      public fun contentType(contentType: CaptureContentTypeHeaderProperty.Builder.() -> Unit)

      /**
       * @param destination The Amazon S3 bucket where the inference request and response data is
       * stored. 
       */
      public fun destination(destination: String)

      /**
       * @param kmsKey The AWS Key Management Service key that Amazon SageMaker uses to encrypt
       * captured data at rest using Amazon S3 server-side encryption.
       */
      public fun kmsKey(kmsKey: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnInferenceExperiment.DataStorageConfigProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnInferenceExperiment.DataStorageConfigProperty.builder()

      /**
       * @param contentType Configuration specifying how to treat different headers.
       * If no headers are specified SageMaker will by default base64 encode when capturing the
       * data.
       */
      override fun contentType(contentType: IResolvable) {
        cdkBuilder.contentType(contentType.let(IResolvable::unwrap))
      }

      /**
       * @param contentType Configuration specifying how to treat different headers.
       * If no headers are specified SageMaker will by default base64 encode when capturing the
       * data.
       */
      override fun contentType(contentType: CaptureContentTypeHeaderProperty) {
        cdkBuilder.contentType(contentType.let(CaptureContentTypeHeaderProperty::unwrap))
      }

      /**
       * @param contentType Configuration specifying how to treat different headers.
       * If no headers are specified SageMaker will by default base64 encode when capturing the
       * data.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("73064d70e8f53d7e2ea89d687f25104ccbdebcde028549ea11f97ef5cf9f12ab")
      override fun contentType(contentType: CaptureContentTypeHeaderProperty.Builder.() -> Unit):
          Unit = contentType(CaptureContentTypeHeaderProperty(contentType))

      /**
       * @param destination The Amazon S3 bucket where the inference request and response data is
       * stored. 
       */
      override fun destination(destination: String) {
        cdkBuilder.destination(destination)
      }

      /**
       * @param kmsKey The AWS Key Management Service key that Amazon SageMaker uses to encrypt
       * captured data at rest using Amazon S3 server-side encryption.
       */
      override fun kmsKey(kmsKey: String) {
        cdkBuilder.kmsKey(kmsKey)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnInferenceExperiment.DataStorageConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.sagemaker.CfnInferenceExperiment.DataStorageConfigProperty,
    ) : CdkObject(cdkObject), DataStorageConfigProperty {
      /**
       * Configuration specifying how to treat different headers.
       *
       * If no headers are specified SageMaker will by default base64 encode when capturing the
       * data.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-inferenceexperiment-datastorageconfig.html#cfn-sagemaker-inferenceexperiment-datastorageconfig-contenttype)
       */
      override fun contentType(): Any? = unwrap(this).getContentType()

      /**
       * The Amazon S3 bucket where the inference request and response data is stored.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-inferenceexperiment-datastorageconfig.html#cfn-sagemaker-inferenceexperiment-datastorageconfig-destination)
       */
      override fun destination(): String = unwrap(this).getDestination()

      /**
       * The AWS Key Management Service key that Amazon SageMaker uses to encrypt captured data at
       * rest using Amazon S3 server-side encryption.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-inferenceexperiment-datastorageconfig.html#cfn-sagemaker-inferenceexperiment-datastorageconfig-kmskey)
       */
      override fun kmsKey(): String? = unwrap(this).getKmsKey()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DataStorageConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnInferenceExperiment.DataStorageConfigProperty):
          DataStorageConfigProperty = CdkObjectWrappers.wrap(cdkObject) as?
          DataStorageConfigProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: DataStorageConfigProperty):
          software.amazon.awscdk.services.sagemaker.CfnInferenceExperiment.DataStorageConfigProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnInferenceExperiment.DataStorageConfigProperty
    }
  }

  /**
   * The metadata of the endpoint.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sagemaker.*;
   * EndpointMetadataProperty endpointMetadataProperty = EndpointMetadataProperty.builder()
   * .endpointName("endpointName")
   * // the properties below are optional
   * .endpointConfigName("endpointConfigName")
   * .endpointStatus("endpointStatus")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-inferenceexperiment-endpointmetadata.html)
   */
  public interface EndpointMetadataProperty {
    /**
     * The name of the endpoint configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-inferenceexperiment-endpointmetadata.html#cfn-sagemaker-inferenceexperiment-endpointmetadata-endpointconfigname)
     */
    public fun endpointConfigName(): String? = unwrap(this).getEndpointConfigName()

    /**
     * The name of the endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-inferenceexperiment-endpointmetadata.html#cfn-sagemaker-inferenceexperiment-endpointmetadata-endpointname)
     */
    public fun endpointName(): String

    /**
     * The status of the endpoint.
     *
     * For possible values of the status of an endpoint, see
     * [](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-inferenceexperiment-endpointmetadata.html#cfn-sagemaker-inferenceexperiment-endpointmetadata-endpointstatus)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-inferenceexperiment-endpointmetadata.html#cfn-sagemaker-inferenceexperiment-endpointmetadata-endpointstatus)
     */
    public fun endpointStatus(): String? = unwrap(this).getEndpointStatus()

    /**
     * A builder for [EndpointMetadataProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param endpointConfigName The name of the endpoint configuration.
       */
      public fun endpointConfigName(endpointConfigName: String)

      /**
       * @param endpointName The name of the endpoint. 
       */
      public fun endpointName(endpointName: String)

      /**
       * @param endpointStatus The status of the endpoint.
       * For possible values of the status of an endpoint, see
       * [](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-inferenceexperiment-endpointmetadata.html#cfn-sagemaker-inferenceexperiment-endpointmetadata-endpointstatus)
       * .
       */
      public fun endpointStatus(endpointStatus: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnInferenceExperiment.EndpointMetadataProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnInferenceExperiment.EndpointMetadataProperty.builder()

      /**
       * @param endpointConfigName The name of the endpoint configuration.
       */
      override fun endpointConfigName(endpointConfigName: String) {
        cdkBuilder.endpointConfigName(endpointConfigName)
      }

      /**
       * @param endpointName The name of the endpoint. 
       */
      override fun endpointName(endpointName: String) {
        cdkBuilder.endpointName(endpointName)
      }

      /**
       * @param endpointStatus The status of the endpoint.
       * For possible values of the status of an endpoint, see
       * [](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-inferenceexperiment-endpointmetadata.html#cfn-sagemaker-inferenceexperiment-endpointmetadata-endpointstatus)
       * .
       */
      override fun endpointStatus(endpointStatus: String) {
        cdkBuilder.endpointStatus(endpointStatus)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnInferenceExperiment.EndpointMetadataProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.sagemaker.CfnInferenceExperiment.EndpointMetadataProperty,
    ) : CdkObject(cdkObject), EndpointMetadataProperty {
      /**
       * The name of the endpoint configuration.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-inferenceexperiment-endpointmetadata.html#cfn-sagemaker-inferenceexperiment-endpointmetadata-endpointconfigname)
       */
      override fun endpointConfigName(): String? = unwrap(this).getEndpointConfigName()

      /**
       * The name of the endpoint.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-inferenceexperiment-endpointmetadata.html#cfn-sagemaker-inferenceexperiment-endpointmetadata-endpointname)
       */
      override fun endpointName(): String = unwrap(this).getEndpointName()

      /**
       * The status of the endpoint.
       *
       * For possible values of the status of an endpoint, see
       * [](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-inferenceexperiment-endpointmetadata.html#cfn-sagemaker-inferenceexperiment-endpointmetadata-endpointstatus)
       * .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-inferenceexperiment-endpointmetadata.html#cfn-sagemaker-inferenceexperiment-endpointmetadata-endpointstatus)
       */
      override fun endpointStatus(): String? = unwrap(this).getEndpointStatus()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): EndpointMetadataProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnInferenceExperiment.EndpointMetadataProperty):
          EndpointMetadataProperty = CdkObjectWrappers.wrap(cdkObject) as? EndpointMetadataProperty
          ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: EndpointMetadataProperty):
          software.amazon.awscdk.services.sagemaker.CfnInferenceExperiment.EndpointMetadataProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnInferenceExperiment.EndpointMetadataProperty
    }
  }

  /**
   * The start and end times of an inference experiment.
   *
   * The maximum duration that you can set for an inference experiment is 30 days.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sagemaker.*;
   * InferenceExperimentScheduleProperty inferenceExperimentScheduleProperty =
   * InferenceExperimentScheduleProperty.builder()
   * .endTime("endTime")
   * .startTime("startTime")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-inferenceexperiment-inferenceexperimentschedule.html)
   */
  public interface InferenceExperimentScheduleProperty {
    /**
     * The timestamp at which the inference experiment ended or will end.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-inferenceexperiment-inferenceexperimentschedule.html#cfn-sagemaker-inferenceexperiment-inferenceexperimentschedule-endtime)
     */
    public fun endTime(): String? = unwrap(this).getEndTime()

    /**
     * The timestamp at which the inference experiment started or will start.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-inferenceexperiment-inferenceexperimentschedule.html#cfn-sagemaker-inferenceexperiment-inferenceexperimentschedule-starttime)
     */
    public fun startTime(): String? = unwrap(this).getStartTime()

    /**
     * A builder for [InferenceExperimentScheduleProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param endTime The timestamp at which the inference experiment ended or will end.
       */
      public fun endTime(endTime: String)

      /**
       * @param startTime The timestamp at which the inference experiment started or will start.
       */
      public fun startTime(startTime: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnInferenceExperiment.InferenceExperimentScheduleProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnInferenceExperiment.InferenceExperimentScheduleProperty.builder()

      /**
       * @param endTime The timestamp at which the inference experiment ended or will end.
       */
      override fun endTime(endTime: String) {
        cdkBuilder.endTime(endTime)
      }

      /**
       * @param startTime The timestamp at which the inference experiment started or will start.
       */
      override fun startTime(startTime: String) {
        cdkBuilder.startTime(startTime)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnInferenceExperiment.InferenceExperimentScheduleProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.sagemaker.CfnInferenceExperiment.InferenceExperimentScheduleProperty,
    ) : CdkObject(cdkObject), InferenceExperimentScheduleProperty {
      /**
       * The timestamp at which the inference experiment ended or will end.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-inferenceexperiment-inferenceexperimentschedule.html#cfn-sagemaker-inferenceexperiment-inferenceexperimentschedule-endtime)
       */
      override fun endTime(): String? = unwrap(this).getEndTime()

      /**
       * The timestamp at which the inference experiment started or will start.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-inferenceexperiment-inferenceexperimentschedule.html#cfn-sagemaker-inferenceexperiment-inferenceexperimentschedule-starttime)
       */
      override fun startTime(): String? = unwrap(this).getStartTime()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          InferenceExperimentScheduleProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnInferenceExperiment.InferenceExperimentScheduleProperty):
          InferenceExperimentScheduleProperty = CdkObjectWrappers.wrap(cdkObject) as?
          InferenceExperimentScheduleProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: InferenceExperimentScheduleProperty):
          software.amazon.awscdk.services.sagemaker.CfnInferenceExperiment.InferenceExperimentScheduleProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnInferenceExperiment.InferenceExperimentScheduleProperty
    }
  }

  /**
   * The configuration for the infrastructure that the model will be deployed to.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sagemaker.*;
   * ModelInfrastructureConfigProperty modelInfrastructureConfigProperty =
   * ModelInfrastructureConfigProperty.builder()
   * .infrastructureType("infrastructureType")
   * .realTimeInferenceConfig(RealTimeInferenceConfigProperty.builder()
   * .instanceCount(123)
   * .instanceType("instanceType")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-inferenceexperiment-modelinfrastructureconfig.html)
   */
  public interface ModelInfrastructureConfigProperty {
    /**
     * The inference option to which to deploy your model. Possible values are the following:.
     *
     * * `RealTime` : Deploy to real-time inference.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-inferenceexperiment-modelinfrastructureconfig.html#cfn-sagemaker-inferenceexperiment-modelinfrastructureconfig-infrastructuretype)
     */
    public fun infrastructureType(): String

    /**
     * The infrastructure configuration for deploying the model to real-time inference.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-inferenceexperiment-modelinfrastructureconfig.html#cfn-sagemaker-inferenceexperiment-modelinfrastructureconfig-realtimeinferenceconfig)
     */
    public fun realTimeInferenceConfig(): Any

    /**
     * A builder for [ModelInfrastructureConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param infrastructureType The inference option to which to deploy your model. Possible
       * values are the following:. 
       * * `RealTime` : Deploy to real-time inference.
       */
      public fun infrastructureType(infrastructureType: String)

      /**
       * @param realTimeInferenceConfig The infrastructure configuration for deploying the model to
       * real-time inference. 
       */
      public fun realTimeInferenceConfig(realTimeInferenceConfig: IResolvable)

      /**
       * @param realTimeInferenceConfig The infrastructure configuration for deploying the model to
       * real-time inference. 
       */
      public fun realTimeInferenceConfig(realTimeInferenceConfig: RealTimeInferenceConfigProperty)

      /**
       * @param realTimeInferenceConfig The infrastructure configuration for deploying the model to
       * real-time inference. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0f3dffa871b10f2225becc151d1c6d7eb2481c0952003198a4adbd9833aa3b6c")
      public
          fun realTimeInferenceConfig(realTimeInferenceConfig: RealTimeInferenceConfigProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnInferenceExperiment.ModelInfrastructureConfigProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnInferenceExperiment.ModelInfrastructureConfigProperty.builder()

      /**
       * @param infrastructureType The inference option to which to deploy your model. Possible
       * values are the following:. 
       * * `RealTime` : Deploy to real-time inference.
       */
      override fun infrastructureType(infrastructureType: String) {
        cdkBuilder.infrastructureType(infrastructureType)
      }

      /**
       * @param realTimeInferenceConfig The infrastructure configuration for deploying the model to
       * real-time inference. 
       */
      override fun realTimeInferenceConfig(realTimeInferenceConfig: IResolvable) {
        cdkBuilder.realTimeInferenceConfig(realTimeInferenceConfig.let(IResolvable::unwrap))
      }

      /**
       * @param realTimeInferenceConfig The infrastructure configuration for deploying the model to
       * real-time inference. 
       */
      override
          fun realTimeInferenceConfig(realTimeInferenceConfig: RealTimeInferenceConfigProperty) {
        cdkBuilder.realTimeInferenceConfig(realTimeInferenceConfig.let(RealTimeInferenceConfigProperty::unwrap))
      }

      /**
       * @param realTimeInferenceConfig The infrastructure configuration for deploying the model to
       * real-time inference. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0f3dffa871b10f2225becc151d1c6d7eb2481c0952003198a4adbd9833aa3b6c")
      override
          fun realTimeInferenceConfig(realTimeInferenceConfig: RealTimeInferenceConfigProperty.Builder.() -> Unit):
          Unit = realTimeInferenceConfig(RealTimeInferenceConfigProperty(realTimeInferenceConfig))

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnInferenceExperiment.ModelInfrastructureConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.sagemaker.CfnInferenceExperiment.ModelInfrastructureConfigProperty,
    ) : CdkObject(cdkObject), ModelInfrastructureConfigProperty {
      /**
       * The inference option to which to deploy your model. Possible values are the following:.
       *
       * * `RealTime` : Deploy to real-time inference.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-inferenceexperiment-modelinfrastructureconfig.html#cfn-sagemaker-inferenceexperiment-modelinfrastructureconfig-infrastructuretype)
       */
      override fun infrastructureType(): String = unwrap(this).getInfrastructureType()

      /**
       * The infrastructure configuration for deploying the model to real-time inference.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-inferenceexperiment-modelinfrastructureconfig.html#cfn-sagemaker-inferenceexperiment-modelinfrastructureconfig-realtimeinferenceconfig)
       */
      override fun realTimeInferenceConfig(): Any = unwrap(this).getRealTimeInferenceConfig()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          ModelInfrastructureConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnInferenceExperiment.ModelInfrastructureConfigProperty):
          ModelInfrastructureConfigProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ModelInfrastructureConfigProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ModelInfrastructureConfigProperty):
          software.amazon.awscdk.services.sagemaker.CfnInferenceExperiment.ModelInfrastructureConfigProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnInferenceExperiment.ModelInfrastructureConfigProperty
    }
  }

  /**
   * Contains information about the deployment options of a model.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sagemaker.*;
   * ModelVariantConfigProperty modelVariantConfigProperty = ModelVariantConfigProperty.builder()
   * .infrastructureConfig(ModelInfrastructureConfigProperty.builder()
   * .infrastructureType("infrastructureType")
   * .realTimeInferenceConfig(RealTimeInferenceConfigProperty.builder()
   * .instanceCount(123)
   * .instanceType("instanceType")
   * .build())
   * .build())
   * .modelName("modelName")
   * .variantName("variantName")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-inferenceexperiment-modelvariantconfig.html)
   */
  public interface ModelVariantConfigProperty {
    /**
     * The configuration for the infrastructure that the model will be deployed to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-inferenceexperiment-modelvariantconfig.html#cfn-sagemaker-inferenceexperiment-modelvariantconfig-infrastructureconfig)
     */
    public fun infrastructureConfig(): Any

    /**
     * The name of the Amazon SageMaker Model entity.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-inferenceexperiment-modelvariantconfig.html#cfn-sagemaker-inferenceexperiment-modelvariantconfig-modelname)
     */
    public fun modelName(): String

    /**
     * The name of the variant.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-inferenceexperiment-modelvariantconfig.html#cfn-sagemaker-inferenceexperiment-modelvariantconfig-variantname)
     */
    public fun variantName(): String

    /**
     * A builder for [ModelVariantConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param infrastructureConfig The configuration for the infrastructure that the model will be
       * deployed to. 
       */
      public fun infrastructureConfig(infrastructureConfig: IResolvable)

      /**
       * @param infrastructureConfig The configuration for the infrastructure that the model will be
       * deployed to. 
       */
      public fun infrastructureConfig(infrastructureConfig: ModelInfrastructureConfigProperty)

      /**
       * @param infrastructureConfig The configuration for the infrastructure that the model will be
       * deployed to. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7ed0abd901e636aeddd8f2b2728a28d8b56e3079fb1dedc6567ee87784b2dcdc")
      public
          fun infrastructureConfig(infrastructureConfig: ModelInfrastructureConfigProperty.Builder.() -> Unit)

      /**
       * @param modelName The name of the Amazon SageMaker Model entity. 
       */
      public fun modelName(modelName: String)

      /**
       * @param variantName The name of the variant. 
       */
      public fun variantName(variantName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnInferenceExperiment.ModelVariantConfigProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnInferenceExperiment.ModelVariantConfigProperty.builder()

      /**
       * @param infrastructureConfig The configuration for the infrastructure that the model will be
       * deployed to. 
       */
      override fun infrastructureConfig(infrastructureConfig: IResolvable) {
        cdkBuilder.infrastructureConfig(infrastructureConfig.let(IResolvable::unwrap))
      }

      /**
       * @param infrastructureConfig The configuration for the infrastructure that the model will be
       * deployed to. 
       */
      override fun infrastructureConfig(infrastructureConfig: ModelInfrastructureConfigProperty) {
        cdkBuilder.infrastructureConfig(infrastructureConfig.let(ModelInfrastructureConfigProperty::unwrap))
      }

      /**
       * @param infrastructureConfig The configuration for the infrastructure that the model will be
       * deployed to. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7ed0abd901e636aeddd8f2b2728a28d8b56e3079fb1dedc6567ee87784b2dcdc")
      override
          fun infrastructureConfig(infrastructureConfig: ModelInfrastructureConfigProperty.Builder.() -> Unit):
          Unit = infrastructureConfig(ModelInfrastructureConfigProperty(infrastructureConfig))

      /**
       * @param modelName The name of the Amazon SageMaker Model entity. 
       */
      override fun modelName(modelName: String) {
        cdkBuilder.modelName(modelName)
      }

      /**
       * @param variantName The name of the variant. 
       */
      override fun variantName(variantName: String) {
        cdkBuilder.variantName(variantName)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnInferenceExperiment.ModelVariantConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.sagemaker.CfnInferenceExperiment.ModelVariantConfigProperty,
    ) : CdkObject(cdkObject), ModelVariantConfigProperty {
      /**
       * The configuration for the infrastructure that the model will be deployed to.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-inferenceexperiment-modelvariantconfig.html#cfn-sagemaker-inferenceexperiment-modelvariantconfig-infrastructureconfig)
       */
      override fun infrastructureConfig(): Any = unwrap(this).getInfrastructureConfig()

      /**
       * The name of the Amazon SageMaker Model entity.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-inferenceexperiment-modelvariantconfig.html#cfn-sagemaker-inferenceexperiment-modelvariantconfig-modelname)
       */
      override fun modelName(): String = unwrap(this).getModelName()

      /**
       * The name of the variant.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-inferenceexperiment-modelvariantconfig.html#cfn-sagemaker-inferenceexperiment-modelvariantconfig-variantname)
       */
      override fun variantName(): String = unwrap(this).getVariantName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ModelVariantConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnInferenceExperiment.ModelVariantConfigProperty):
          ModelVariantConfigProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ModelVariantConfigProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ModelVariantConfigProperty):
          software.amazon.awscdk.services.sagemaker.CfnInferenceExperiment.ModelVariantConfigProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnInferenceExperiment.ModelVariantConfigProperty
    }
  }

  /**
   * The infrastructure configuration for deploying the model to a real-time inference endpoint.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sagemaker.*;
   * RealTimeInferenceConfigProperty realTimeInferenceConfigProperty =
   * RealTimeInferenceConfigProperty.builder()
   * .instanceCount(123)
   * .instanceType("instanceType")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-inferenceexperiment-realtimeinferenceconfig.html)
   */
  public interface RealTimeInferenceConfigProperty {
    /**
     * The number of instances of the type specified by `InstanceType` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-inferenceexperiment-realtimeinferenceconfig.html#cfn-sagemaker-inferenceexperiment-realtimeinferenceconfig-instancecount)
     */
    public fun instanceCount(): Number

    /**
     * The instance type the model is deployed to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-inferenceexperiment-realtimeinferenceconfig.html#cfn-sagemaker-inferenceexperiment-realtimeinferenceconfig-instancetype)
     */
    public fun instanceType(): String

    /**
     * A builder for [RealTimeInferenceConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param instanceCount The number of instances of the type specified by `InstanceType` . 
       */
      public fun instanceCount(instanceCount: Number)

      /**
       * @param instanceType The instance type the model is deployed to. 
       */
      public fun instanceType(instanceType: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnInferenceExperiment.RealTimeInferenceConfigProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnInferenceExperiment.RealTimeInferenceConfigProperty.builder()

      /**
       * @param instanceCount The number of instances of the type specified by `InstanceType` . 
       */
      override fun instanceCount(instanceCount: Number) {
        cdkBuilder.instanceCount(instanceCount)
      }

      /**
       * @param instanceType The instance type the model is deployed to. 
       */
      override fun instanceType(instanceType: String) {
        cdkBuilder.instanceType(instanceType)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnInferenceExperiment.RealTimeInferenceConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.sagemaker.CfnInferenceExperiment.RealTimeInferenceConfigProperty,
    ) : CdkObject(cdkObject), RealTimeInferenceConfigProperty {
      /**
       * The number of instances of the type specified by `InstanceType` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-inferenceexperiment-realtimeinferenceconfig.html#cfn-sagemaker-inferenceexperiment-realtimeinferenceconfig-instancecount)
       */
      override fun instanceCount(): Number = unwrap(this).getInstanceCount()

      /**
       * The instance type the model is deployed to.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-inferenceexperiment-realtimeinferenceconfig.html#cfn-sagemaker-inferenceexperiment-realtimeinferenceconfig-instancetype)
       */
      override fun instanceType(): String = unwrap(this).getInstanceType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): RealTimeInferenceConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnInferenceExperiment.RealTimeInferenceConfigProperty):
          RealTimeInferenceConfigProperty = CdkObjectWrappers.wrap(cdkObject) as?
          RealTimeInferenceConfigProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: RealTimeInferenceConfigProperty):
          software.amazon.awscdk.services.sagemaker.CfnInferenceExperiment.RealTimeInferenceConfigProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnInferenceExperiment.RealTimeInferenceConfigProperty
    }
  }

  /**
   * The configuration of `ShadowMode` inference experiment type, which specifies a production
   * variant to take all the inference requests, and a shadow variant to which Amazon SageMaker
   * replicates a percentage of the inference requests.
   *
   * For the shadow variant it also specifies the percentage of requests that Amazon SageMaker
   * replicates.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sagemaker.*;
   * ShadowModeConfigProperty shadowModeConfigProperty = ShadowModeConfigProperty.builder()
   * .shadowModelVariants(List.of(ShadowModelVariantConfigProperty.builder()
   * .samplingPercentage(123)
   * .shadowModelVariantName("shadowModelVariantName")
   * .build()))
   * .sourceModelVariantName("sourceModelVariantName")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-inferenceexperiment-shadowmodeconfig.html)
   */
  public interface ShadowModeConfigProperty {
    /**
     * List of shadow variant configurations.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-inferenceexperiment-shadowmodeconfig.html#cfn-sagemaker-inferenceexperiment-shadowmodeconfig-shadowmodelvariants)
     */
    public fun shadowModelVariants(): Any

    /**
     * The name of the production variant, which takes all the inference requests.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-inferenceexperiment-shadowmodeconfig.html#cfn-sagemaker-inferenceexperiment-shadowmodeconfig-sourcemodelvariantname)
     */
    public fun sourceModelVariantName(): String

    /**
     * A builder for [ShadowModeConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param shadowModelVariants List of shadow variant configurations. 
       */
      public fun shadowModelVariants(shadowModelVariants: IResolvable)

      /**
       * @param shadowModelVariants List of shadow variant configurations. 
       */
      public fun shadowModelVariants(shadowModelVariants: List<Any>)

      /**
       * @param shadowModelVariants List of shadow variant configurations. 
       */
      public fun shadowModelVariants(vararg shadowModelVariants: Any)

      /**
       * @param sourceModelVariantName The name of the production variant, which takes all the
       * inference requests. 
       */
      public fun sourceModelVariantName(sourceModelVariantName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnInferenceExperiment.ShadowModeConfigProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnInferenceExperiment.ShadowModeConfigProperty.builder()

      /**
       * @param shadowModelVariants List of shadow variant configurations. 
       */
      override fun shadowModelVariants(shadowModelVariants: IResolvable) {
        cdkBuilder.shadowModelVariants(shadowModelVariants.let(IResolvable::unwrap))
      }

      /**
       * @param shadowModelVariants List of shadow variant configurations. 
       */
      override fun shadowModelVariants(shadowModelVariants: List<Any>) {
        cdkBuilder.shadowModelVariants(shadowModelVariants.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param shadowModelVariants List of shadow variant configurations. 
       */
      override fun shadowModelVariants(vararg shadowModelVariants: Any): Unit =
          shadowModelVariants(shadowModelVariants.toList())

      /**
       * @param sourceModelVariantName The name of the production variant, which takes all the
       * inference requests. 
       */
      override fun sourceModelVariantName(sourceModelVariantName: String) {
        cdkBuilder.sourceModelVariantName(sourceModelVariantName)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnInferenceExperiment.ShadowModeConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.sagemaker.CfnInferenceExperiment.ShadowModeConfigProperty,
    ) : CdkObject(cdkObject), ShadowModeConfigProperty {
      /**
       * List of shadow variant configurations.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-inferenceexperiment-shadowmodeconfig.html#cfn-sagemaker-inferenceexperiment-shadowmodeconfig-shadowmodelvariants)
       */
      override fun shadowModelVariants(): Any = unwrap(this).getShadowModelVariants()

      /**
       * The name of the production variant, which takes all the inference requests.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-inferenceexperiment-shadowmodeconfig.html#cfn-sagemaker-inferenceexperiment-shadowmodeconfig-sourcemodelvariantname)
       */
      override fun sourceModelVariantName(): String = unwrap(this).getSourceModelVariantName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ShadowModeConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnInferenceExperiment.ShadowModeConfigProperty):
          ShadowModeConfigProperty = CdkObjectWrappers.wrap(cdkObject) as? ShadowModeConfigProperty
          ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ShadowModeConfigProperty):
          software.amazon.awscdk.services.sagemaker.CfnInferenceExperiment.ShadowModeConfigProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnInferenceExperiment.ShadowModeConfigProperty
    }
  }

  /**
   * The name and sampling percentage of a shadow variant.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sagemaker.*;
   * ShadowModelVariantConfigProperty shadowModelVariantConfigProperty =
   * ShadowModelVariantConfigProperty.builder()
   * .samplingPercentage(123)
   * .shadowModelVariantName("shadowModelVariantName")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-inferenceexperiment-shadowmodelvariantconfig.html)
   */
  public interface ShadowModelVariantConfigProperty {
    /**
     * The percentage of inference requests that Amazon SageMaker replicates from the production
     * variant to the shadow variant.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-inferenceexperiment-shadowmodelvariantconfig.html#cfn-sagemaker-inferenceexperiment-shadowmodelvariantconfig-samplingpercentage)
     */
    public fun samplingPercentage(): Number

    /**
     * The name of the shadow variant.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-inferenceexperiment-shadowmodelvariantconfig.html#cfn-sagemaker-inferenceexperiment-shadowmodelvariantconfig-shadowmodelvariantname)
     */
    public fun shadowModelVariantName(): String

    /**
     * A builder for [ShadowModelVariantConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param samplingPercentage The percentage of inference requests that Amazon SageMaker
       * replicates from the production variant to the shadow variant. 
       */
      public fun samplingPercentage(samplingPercentage: Number)

      /**
       * @param shadowModelVariantName The name of the shadow variant. 
       */
      public fun shadowModelVariantName(shadowModelVariantName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnInferenceExperiment.ShadowModelVariantConfigProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnInferenceExperiment.ShadowModelVariantConfigProperty.builder()

      /**
       * @param samplingPercentage The percentage of inference requests that Amazon SageMaker
       * replicates from the production variant to the shadow variant. 
       */
      override fun samplingPercentage(samplingPercentage: Number) {
        cdkBuilder.samplingPercentage(samplingPercentage)
      }

      /**
       * @param shadowModelVariantName The name of the shadow variant. 
       */
      override fun shadowModelVariantName(shadowModelVariantName: String) {
        cdkBuilder.shadowModelVariantName(shadowModelVariantName)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnInferenceExperiment.ShadowModelVariantConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.sagemaker.CfnInferenceExperiment.ShadowModelVariantConfigProperty,
    ) : CdkObject(cdkObject), ShadowModelVariantConfigProperty {
      /**
       * The percentage of inference requests that Amazon SageMaker replicates from the production
       * variant to the shadow variant.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-inferenceexperiment-shadowmodelvariantconfig.html#cfn-sagemaker-inferenceexperiment-shadowmodelvariantconfig-samplingpercentage)
       */
      override fun samplingPercentage(): Number = unwrap(this).getSamplingPercentage()

      /**
       * The name of the shadow variant.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-inferenceexperiment-shadowmodelvariantconfig.html#cfn-sagemaker-inferenceexperiment-shadowmodelvariantconfig-shadowmodelvariantname)
       */
      override fun shadowModelVariantName(): String = unwrap(this).getShadowModelVariantName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ShadowModelVariantConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnInferenceExperiment.ShadowModelVariantConfigProperty):
          ShadowModelVariantConfigProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ShadowModelVariantConfigProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ShadowModelVariantConfigProperty):
          software.amazon.awscdk.services.sagemaker.CfnInferenceExperiment.ShadowModelVariantConfigProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnInferenceExperiment.ShadowModelVariantConfigProperty
    }
  }
}
