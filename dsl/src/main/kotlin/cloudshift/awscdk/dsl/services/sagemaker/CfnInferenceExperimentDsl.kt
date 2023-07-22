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
import software.amazon.awscdk.services.sagemaker.CfnInferenceExperiment
import software.constructs.Construct

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
 * import software.amazon.awscdk.services.sagemaker.*;
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
@CdkDslMarker
public class CfnInferenceExperimentDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnInferenceExperiment.Builder =
      CfnInferenceExperiment.Builder.create(scope, id)

  private val _modelVariants: MutableList<Any> = mutableListOf()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * The Amazon S3 location and configuration for storing inference request and response data.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-inferenceexperiment.html#cfn-sagemaker-inferenceexperiment-datastorageconfig)
   * @param dataStorageConfig The Amazon S3 location and configuration for storing inference request
   * and response data. 
   */
  public fun dataStorageConfig(dataStorageConfig: IResolvable) {
    cdkBuilder.dataStorageConfig(dataStorageConfig)
  }

  /**
   * The Amazon S3 location and configuration for storing inference request and response data.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-inferenceexperiment.html#cfn-sagemaker-inferenceexperiment-datastorageconfig)
   * @param dataStorageConfig The Amazon S3 location and configuration for storing inference request
   * and response data. 
   */
  public
      fun dataStorageConfig(dataStorageConfig: CfnInferenceExperiment.DataStorageConfigProperty) {
    cdkBuilder.dataStorageConfig(dataStorageConfig)
  }

  /**
   * The description of the inference experiment.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-inferenceexperiment.html#cfn-sagemaker-inferenceexperiment-description)
   * @param description The description of the inference experiment. 
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * The desired state of the experiment after stopping. The possible states are the following:.
   *
   * * `Completed` : The experiment completed successfully
   * * `Cancelled` : The experiment was canceled
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-inferenceexperiment.html#cfn-sagemaker-inferenceexperiment-desiredstate)
   * @param desiredState The desired state of the experiment after stopping. The possible states are
   * the following:. 
   */
  public fun desiredState(desiredState: String) {
    cdkBuilder.desiredState(desiredState)
  }

  /**
   * The name of the endpoint.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-inferenceexperiment.html#cfn-sagemaker-inferenceexperiment-endpointname)
   * @param endpointName The name of the endpoint. 
   */
  public fun endpointName(endpointName: String) {
    cdkBuilder.endpointName(endpointName)
  }

  /**
   * The AWS Key Management Service key that Amazon SageMaker uses to encrypt captured data at rest
   * using Amazon S3 server-side encryption.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-inferenceexperiment.html#cfn-sagemaker-inferenceexperiment-kmskey)
   * @param kmsKey The AWS Key Management Service key that Amazon SageMaker uses to encrypt captured
   * data at rest using Amazon S3 server-side encryption. 
   */
  public fun kmsKey(kmsKey: String) {
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
  public fun modelVariants(vararg modelVariants: Any) {
    _modelVariants.addAll(listOf(*modelVariants))
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
  public fun modelVariants(modelVariants: Collection<Any>) {
    _modelVariants.addAll(modelVariants)
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
  public fun modelVariants(modelVariants: IResolvable) {
    cdkBuilder.modelVariants(modelVariants)
  }

  /**
   * The name of the inference experiment.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-inferenceexperiment.html#cfn-sagemaker-inferenceexperiment-name)
   * @param name The name of the inference experiment. 
   */
  public fun name(name: String) {
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
  public fun roleArn(roleArn: String) {
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
  public fun schedule(schedule: IResolvable) {
    cdkBuilder.schedule(schedule)
  }

  /**
   * The duration for which the inference experiment ran or will run.
   *
   * The maximum duration that you can set for an inference experiment is 30 days.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-inferenceexperiment.html#cfn-sagemaker-inferenceexperiment-schedule)
   * @param schedule The duration for which the inference experiment ran or will run. 
   */
  public fun schedule(schedule: CfnInferenceExperiment.InferenceExperimentScheduleProperty) {
    cdkBuilder.schedule(schedule)
  }

  /**
   * The configuration of `ShadowMode` inference experiment type, which shows the production variant
   * that takes all the inference requests, and the shadow variant to which Amazon SageMaker replicates
   * a percentage of the inference requests.
   *
   * For the shadow variant it also shows the percentage of requests that Amazon SageMaker
   * replicates.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-inferenceexperiment.html#cfn-sagemaker-inferenceexperiment-shadowmodeconfig)
   * @param shadowModeConfig The configuration of `ShadowMode` inference experiment type, which
   * shows the production variant that takes all the inference requests, and the shadow variant to
   * which Amazon SageMaker replicates a percentage of the inference requests. 
   */
  public fun shadowModeConfig(shadowModeConfig: IResolvable) {
    cdkBuilder.shadowModeConfig(shadowModeConfig)
  }

  /**
   * The configuration of `ShadowMode` inference experiment type, which shows the production variant
   * that takes all the inference requests, and the shadow variant to which Amazon SageMaker replicates
   * a percentage of the inference requests.
   *
   * For the shadow variant it also shows the percentage of requests that Amazon SageMaker
   * replicates.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-inferenceexperiment.html#cfn-sagemaker-inferenceexperiment-shadowmodeconfig)
   * @param shadowModeConfig The configuration of `ShadowMode` inference experiment type, which
   * shows the production variant that takes all the inference requests, and the shadow variant to
   * which Amazon SageMaker replicates a percentage of the inference requests. 
   */
  public fun shadowModeConfig(shadowModeConfig: CfnInferenceExperiment.ShadowModeConfigProperty) {
    cdkBuilder.shadowModeConfig(shadowModeConfig)
  }

  /**
   * The error message for the inference experiment status result.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-inferenceexperiment.html#cfn-sagemaker-inferenceexperiment-statusreason)
   * @param statusReason The error message for the inference experiment status result. 
   */
  public fun statusReason(statusReason: String) {
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
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
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
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  /**
   * The type of the inference experiment.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-inferenceexperiment.html#cfn-sagemaker-inferenceexperiment-type)
   * @param type The type of the inference experiment. 
   */
  public fun type(type: String) {
    cdkBuilder.type(type)
  }

  public fun build(): CfnInferenceExperiment {
    if(_modelVariants.isNotEmpty()) cdkBuilder.modelVariants(_modelVariants)
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
