@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sagemaker.CfnModelPackage
import software.amazon.awscdk.services.sagemaker.CfnModelPackageProps

/**
 * Properties for defining a `CfnModelPackage`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sagemaker.*;
 * Object modelInput;
 * CfnModelPackageProps cfnModelPackageProps = CfnModelPackageProps.builder()
 * .additionalInferenceSpecifications(List.of(AdditionalInferenceSpecificationDefinitionProperty.builder()
 * .containers(List.of(ModelPackageContainerDefinitionProperty.builder()
 * .image("image")
 * // the properties below are optional
 * .containerHostname("containerHostname")
 * .environment(Map.of(
 * "environmentKey", "environment"))
 * .framework("framework")
 * .frameworkVersion("frameworkVersion")
 * .imageDigest("imageDigest")
 * .modelDataUrl("modelDataUrl")
 * .modelInput(modelInput)
 * .nearestModelName("nearestModelName")
 * .build()))
 * .name("name")
 * // the properties below are optional
 * .description("description")
 * .supportedContentTypes(List.of("supportedContentTypes"))
 * .supportedRealtimeInferenceInstanceTypes(List.of("supportedRealtimeInferenceInstanceTypes"))
 * .supportedResponseMimeTypes(List.of("supportedResponseMimeTypes"))
 * .supportedTransformInstanceTypes(List.of("supportedTransformInstanceTypes"))
 * .build()))
 * .additionalInferenceSpecificationsToAdd(List.of(AdditionalInferenceSpecificationDefinitionProperty.builder()
 * .containers(List.of(ModelPackageContainerDefinitionProperty.builder()
 * .image("image")
 * // the properties below are optional
 * .containerHostname("containerHostname")
 * .environment(Map.of(
 * "environmentKey", "environment"))
 * .framework("framework")
 * .frameworkVersion("frameworkVersion")
 * .imageDigest("imageDigest")
 * .modelDataUrl("modelDataUrl")
 * .modelInput(modelInput)
 * .nearestModelName("nearestModelName")
 * .build()))
 * .name("name")
 * // the properties below are optional
 * .description("description")
 * .supportedContentTypes(List.of("supportedContentTypes"))
 * .supportedRealtimeInferenceInstanceTypes(List.of("supportedRealtimeInferenceInstanceTypes"))
 * .supportedResponseMimeTypes(List.of("supportedResponseMimeTypes"))
 * .supportedTransformInstanceTypes(List.of("supportedTransformInstanceTypes"))
 * .build()))
 * .approvalDescription("approvalDescription")
 * .certifyForMarketplace(false)
 * .clientToken("clientToken")
 * .customerMetadataProperties(Map.of(
 * "customerMetadataPropertiesKey", "customerMetadataProperties"))
 * .domain("domain")
 * .driftCheckBaselines(DriftCheckBaselinesProperty.builder()
 * .bias(DriftCheckBiasProperty.builder()
 * .configFile(FileSourceProperty.builder()
 * .s3Uri("s3Uri")
 * // the properties below are optional
 * .contentDigest("contentDigest")
 * .contentType("contentType")
 * .build())
 * .postTrainingConstraints(MetricsSourceProperty.builder()
 * .contentType("contentType")
 * .s3Uri("s3Uri")
 * // the properties below are optional
 * .contentDigest("contentDigest")
 * .build())
 * .preTrainingConstraints(MetricsSourceProperty.builder()
 * .contentType("contentType")
 * .s3Uri("s3Uri")
 * // the properties below are optional
 * .contentDigest("contentDigest")
 * .build())
 * .build())
 * .explainability(DriftCheckExplainabilityProperty.builder()
 * .configFile(FileSourceProperty.builder()
 * .s3Uri("s3Uri")
 * // the properties below are optional
 * .contentDigest("contentDigest")
 * .contentType("contentType")
 * .build())
 * .constraints(MetricsSourceProperty.builder()
 * .contentType("contentType")
 * .s3Uri("s3Uri")
 * // the properties below are optional
 * .contentDigest("contentDigest")
 * .build())
 * .build())
 * .modelDataQuality(DriftCheckModelDataQualityProperty.builder()
 * .constraints(MetricsSourceProperty.builder()
 * .contentType("contentType")
 * .s3Uri("s3Uri")
 * // the properties below are optional
 * .contentDigest("contentDigest")
 * .build())
 * .statistics(MetricsSourceProperty.builder()
 * .contentType("contentType")
 * .s3Uri("s3Uri")
 * // the properties below are optional
 * .contentDigest("contentDigest")
 * .build())
 * .build())
 * .modelQuality(DriftCheckModelQualityProperty.builder()
 * .constraints(MetricsSourceProperty.builder()
 * .contentType("contentType")
 * .s3Uri("s3Uri")
 * // the properties below are optional
 * .contentDigest("contentDigest")
 * .build())
 * .statistics(MetricsSourceProperty.builder()
 * .contentType("contentType")
 * .s3Uri("s3Uri")
 * // the properties below are optional
 * .contentDigest("contentDigest")
 * .build())
 * .build())
 * .build())
 * .inferenceSpecification(InferenceSpecificationProperty.builder()
 * .containers(List.of(ModelPackageContainerDefinitionProperty.builder()
 * .image("image")
 * // the properties below are optional
 * .containerHostname("containerHostname")
 * .environment(Map.of(
 * "environmentKey", "environment"))
 * .framework("framework")
 * .frameworkVersion("frameworkVersion")
 * .imageDigest("imageDigest")
 * .modelDataUrl("modelDataUrl")
 * .modelInput(modelInput)
 * .nearestModelName("nearestModelName")
 * .build()))
 * .supportedContentTypes(List.of("supportedContentTypes"))
 * .supportedResponseMimeTypes(List.of("supportedResponseMimeTypes"))
 * // the properties below are optional
 * .supportedRealtimeInferenceInstanceTypes(List.of("supportedRealtimeInferenceInstanceTypes"))
 * .supportedTransformInstanceTypes(List.of("supportedTransformInstanceTypes"))
 * .build())
 * .lastModifiedTime("lastModifiedTime")
 * .metadataProperties(MetadataPropertiesProperty.builder()
 * .commitId("commitId")
 * .generatedBy("generatedBy")
 * .projectId("projectId")
 * .repository("repository")
 * .build())
 * .modelApprovalStatus("modelApprovalStatus")
 * .modelMetrics(ModelMetricsProperty.builder()
 * .bias(BiasProperty.builder()
 * .postTrainingReport(MetricsSourceProperty.builder()
 * .contentType("contentType")
 * .s3Uri("s3Uri")
 * // the properties below are optional
 * .contentDigest("contentDigest")
 * .build())
 * .preTrainingReport(MetricsSourceProperty.builder()
 * .contentType("contentType")
 * .s3Uri("s3Uri")
 * // the properties below are optional
 * .contentDigest("contentDigest")
 * .build())
 * .report(MetricsSourceProperty.builder()
 * .contentType("contentType")
 * .s3Uri("s3Uri")
 * // the properties below are optional
 * .contentDigest("contentDigest")
 * .build())
 * .build())
 * .explainability(ExplainabilityProperty.builder()
 * .report(MetricsSourceProperty.builder()
 * .contentType("contentType")
 * .s3Uri("s3Uri")
 * // the properties below are optional
 * .contentDigest("contentDigest")
 * .build())
 * .build())
 * .modelDataQuality(ModelDataQualityProperty.builder()
 * .constraints(MetricsSourceProperty.builder()
 * .contentType("contentType")
 * .s3Uri("s3Uri")
 * // the properties below are optional
 * .contentDigest("contentDigest")
 * .build())
 * .statistics(MetricsSourceProperty.builder()
 * .contentType("contentType")
 * .s3Uri("s3Uri")
 * // the properties below are optional
 * .contentDigest("contentDigest")
 * .build())
 * .build())
 * .modelQuality(ModelQualityProperty.builder()
 * .constraints(MetricsSourceProperty.builder()
 * .contentType("contentType")
 * .s3Uri("s3Uri")
 * // the properties below are optional
 * .contentDigest("contentDigest")
 * .build())
 * .statistics(MetricsSourceProperty.builder()
 * .contentType("contentType")
 * .s3Uri("s3Uri")
 * // the properties below are optional
 * .contentDigest("contentDigest")
 * .build())
 * .build())
 * .build())
 * .modelPackageDescription("modelPackageDescription")
 * .modelPackageGroupName("modelPackageGroupName")
 * .modelPackageName("modelPackageName")
 * .modelPackageStatusDetails(ModelPackageStatusDetailsProperty.builder()
 * .validationStatuses(List.of(ModelPackageStatusItemProperty.builder()
 * .name("name")
 * .status("status")
 * // the properties below are optional
 * .failureReason("failureReason")
 * .build()))
 * .build())
 * .modelPackageVersion(123)
 * .samplePayloadUrl("samplePayloadUrl")
 * .sourceAlgorithmSpecification(SourceAlgorithmSpecificationProperty.builder()
 * .sourceAlgorithms(List.of(SourceAlgorithmProperty.builder()
 * .algorithmName("algorithmName")
 * // the properties below are optional
 * .modelDataUrl("modelDataUrl")
 * .build()))
 * .build())
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .task("task")
 * .validationSpecification(ValidationSpecificationProperty.builder()
 * .validationProfiles(List.of(ValidationProfileProperty.builder()
 * .profileName("profileName")
 * .transformJobDefinition(TransformJobDefinitionProperty.builder()
 * .transformInput(TransformInputProperty.builder()
 * .dataSource(DataSourceProperty.builder()
 * .s3DataSource(S3DataSourceProperty.builder()
 * .s3DataType("s3DataType")
 * .s3Uri("s3Uri")
 * .build())
 * .build())
 * // the properties below are optional
 * .compressionType("compressionType")
 * .contentType("contentType")
 * .splitType("splitType")
 * .build())
 * .transformOutput(TransformOutputProperty.builder()
 * .s3OutputPath("s3OutputPath")
 * // the properties below are optional
 * .accept("accept")
 * .assembleWith("assembleWith")
 * .kmsKeyId("kmsKeyId")
 * .build())
 * .transformResources(TransformResourcesProperty.builder()
 * .instanceCount(123)
 * .instanceType("instanceType")
 * // the properties below are optional
 * .volumeKmsKeyId("volumeKmsKeyId")
 * .build())
 * // the properties below are optional
 * .batchStrategy("batchStrategy")
 * .environment(Map.of(
 * "environmentKey", "environment"))
 * .maxConcurrentTransforms(123)
 * .maxPayloadInMb(123)
 * .build())
 * .build()))
 * .validationRole("validationRole")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelpackage.html)
 */
@CdkDslMarker
public class CfnModelPackagePropsDsl {
  private val cdkBuilder: CfnModelPackageProps.Builder = CfnModelPackageProps.builder()

  private val _additionalInferenceSpecifications: MutableList<Any> = mutableListOf()

  private val _additionalInferenceSpecificationsToAdd: MutableList<Any> = mutableListOf()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * @param additionalInferenceSpecifications An array of additional Inference Specification
   * objects.
   */
  public fun additionalInferenceSpecifications(vararg additionalInferenceSpecifications: Any) {
    _additionalInferenceSpecifications.addAll(listOf(*additionalInferenceSpecifications))
  }

  /**
   * @param additionalInferenceSpecifications An array of additional Inference Specification
   * objects.
   */
  public fun additionalInferenceSpecifications(additionalInferenceSpecifications: Collection<Any>) {
    _additionalInferenceSpecifications.addAll(additionalInferenceSpecifications)
  }

  /**
   * @param additionalInferenceSpecifications An array of additional Inference Specification
   * objects.
   */
  public fun additionalInferenceSpecifications(additionalInferenceSpecifications: IResolvable) {
    cdkBuilder.additionalInferenceSpecifications(additionalInferenceSpecifications)
  }

  /**
   * @param additionalInferenceSpecificationsToAdd An array of additional Inference Specification
   * objects to be added to the existing array.
   * The total number of additional Inference Specification objects cannot exceed 15. Each
   * additional Inference Specification object specifies artifacts based on this model package that can
   * be used on inference endpoints. Generally used with SageMaker Neo to store the compiled artifacts.
   */
  public fun additionalInferenceSpecificationsToAdd(vararg
      additionalInferenceSpecificationsToAdd: Any) {
    _additionalInferenceSpecificationsToAdd.addAll(listOf(*additionalInferenceSpecificationsToAdd))
  }

  /**
   * @param additionalInferenceSpecificationsToAdd An array of additional Inference Specification
   * objects to be added to the existing array.
   * The total number of additional Inference Specification objects cannot exceed 15. Each
   * additional Inference Specification object specifies artifacts based on this model package that can
   * be used on inference endpoints. Generally used with SageMaker Neo to store the compiled artifacts.
   */
  public
      fun additionalInferenceSpecificationsToAdd(additionalInferenceSpecificationsToAdd: Collection<Any>) {
    _additionalInferenceSpecificationsToAdd.addAll(additionalInferenceSpecificationsToAdd)
  }

  /**
   * @param additionalInferenceSpecificationsToAdd An array of additional Inference Specification
   * objects to be added to the existing array.
   * The total number of additional Inference Specification objects cannot exceed 15. Each
   * additional Inference Specification object specifies artifacts based on this model package that can
   * be used on inference endpoints. Generally used with SageMaker Neo to store the compiled artifacts.
   */
  public
      fun additionalInferenceSpecificationsToAdd(additionalInferenceSpecificationsToAdd: IResolvable) {
    cdkBuilder.additionalInferenceSpecificationsToAdd(additionalInferenceSpecificationsToAdd)
  }

  /**
   * @param approvalDescription A description provided when the model approval is set.
   */
  public fun approvalDescription(approvalDescription: String) {
    cdkBuilder.approvalDescription(approvalDescription)
  }

  /**
   * @param certifyForMarketplace Whether the model package is to be certified to be listed on AWS
   * Marketplace.
   * For information about listing model packages on AWS Marketplace, see [List Your Algorithm or
   * Model Package on AWS
   * Marketplace](https://docs.aws.amazon.com/sagemaker/latest/dg/sagemaker-mkt-list.html) .
   */
  public fun certifyForMarketplace(certifyForMarketplace: Boolean) {
    cdkBuilder.certifyForMarketplace(certifyForMarketplace)
  }

  /**
   * @param certifyForMarketplace Whether the model package is to be certified to be listed on AWS
   * Marketplace.
   * For information about listing model packages on AWS Marketplace, see [List Your Algorithm or
   * Model Package on AWS
   * Marketplace](https://docs.aws.amazon.com/sagemaker/latest/dg/sagemaker-mkt-list.html) .
   */
  public fun certifyForMarketplace(certifyForMarketplace: IResolvable) {
    cdkBuilder.certifyForMarketplace(certifyForMarketplace)
  }

  /**
   * @param clientToken A unique token that guarantees that the call to this API is idempotent.
   */
  public fun clientToken(clientToken: String) {
    cdkBuilder.clientToken(clientToken)
  }

  /**
   * @param customerMetadataProperties The metadata properties for the model package.
   */
  public fun customerMetadataProperties(customerMetadataProperties: Map<String, String>) {
    cdkBuilder.customerMetadataProperties(customerMetadataProperties)
  }

  /**
   * @param customerMetadataProperties The metadata properties for the model package.
   */
  public fun customerMetadataProperties(customerMetadataProperties: IResolvable) {
    cdkBuilder.customerMetadataProperties(customerMetadataProperties)
  }

  /**
   * @param domain The machine learning domain of your model package and its components.
   * Common machine learning domains include computer vision and natural language processing.
   */
  public fun domain(domain: String) {
    cdkBuilder.domain(domain)
  }

  /**
   * @param driftCheckBaselines Represents the drift check baselines that can be used when the model
   * monitor is set using the model package.
   */
  public fun driftCheckBaselines(driftCheckBaselines: IResolvable) {
    cdkBuilder.driftCheckBaselines(driftCheckBaselines)
  }

  /**
   * @param driftCheckBaselines Represents the drift check baselines that can be used when the model
   * monitor is set using the model package.
   */
  public fun driftCheckBaselines(driftCheckBaselines: CfnModelPackage.DriftCheckBaselinesProperty) {
    cdkBuilder.driftCheckBaselines(driftCheckBaselines)
  }

  /**
   * @param inferenceSpecification Defines how to perform inference generation after a training job
   * is run.
   */
  public fun inferenceSpecification(inferenceSpecification: IResolvable) {
    cdkBuilder.inferenceSpecification(inferenceSpecification)
  }

  /**
   * @param inferenceSpecification Defines how to perform inference generation after a training job
   * is run.
   */
  public
      fun inferenceSpecification(inferenceSpecification: CfnModelPackage.InferenceSpecificationProperty) {
    cdkBuilder.inferenceSpecification(inferenceSpecification)
  }

  /**
   * @param lastModifiedTime The last time the model package was modified.
   */
  public fun lastModifiedTime(lastModifiedTime: String) {
    cdkBuilder.lastModifiedTime(lastModifiedTime)
  }

  /**
   * @param metadataProperties Metadata properties of the tracking entity, trial, or trial
   * component.
   */
  public fun metadataProperties(metadataProperties: IResolvable) {
    cdkBuilder.metadataProperties(metadataProperties)
  }

  /**
   * @param metadataProperties Metadata properties of the tracking entity, trial, or trial
   * component.
   */
  public fun metadataProperties(metadataProperties: CfnModelPackage.MetadataPropertiesProperty) {
    cdkBuilder.metadataProperties(metadataProperties)
  }

  /**
   * @param modelApprovalStatus The approval status of the model. This can be one of the following
   * values.
   * * `APPROVED` - The model is approved
   * * `REJECTED` - The model is rejected.
   * * `PENDING_MANUAL_APPROVAL` - The model is waiting for manual approval.
   */
  public fun modelApprovalStatus(modelApprovalStatus: String) {
    cdkBuilder.modelApprovalStatus(modelApprovalStatus)
  }

  /**
   * @param modelMetrics Metrics for the model.
   */
  public fun modelMetrics(modelMetrics: IResolvable) {
    cdkBuilder.modelMetrics(modelMetrics)
  }

  /**
   * @param modelMetrics Metrics for the model.
   */
  public fun modelMetrics(modelMetrics: CfnModelPackage.ModelMetricsProperty) {
    cdkBuilder.modelMetrics(modelMetrics)
  }

  /**
   * @param modelPackageDescription The description of the model package.
   */
  public fun modelPackageDescription(modelPackageDescription: String) {
    cdkBuilder.modelPackageDescription(modelPackageDescription)
  }

  /**
   * @param modelPackageGroupName The model group to which the model belongs.
   */
  public fun modelPackageGroupName(modelPackageGroupName: String) {
    cdkBuilder.modelPackageGroupName(modelPackageGroupName)
  }

  /**
   * @param modelPackageName The name of the model.
   */
  public fun modelPackageName(modelPackageName: String) {
    cdkBuilder.modelPackageName(modelPackageName)
  }

  /**
   * @param modelPackageStatusDetails Specifies the validation and image scan statuses of the model
   * package.
   */
  public fun modelPackageStatusDetails(modelPackageStatusDetails: IResolvable) {
    cdkBuilder.modelPackageStatusDetails(modelPackageStatusDetails)
  }

  /**
   * @param modelPackageStatusDetails Specifies the validation and image scan statuses of the model
   * package.
   */
  public
      fun modelPackageStatusDetails(modelPackageStatusDetails: CfnModelPackage.ModelPackageStatusDetailsProperty) {
    cdkBuilder.modelPackageStatusDetails(modelPackageStatusDetails)
  }

  /**
   * @param modelPackageVersion The version number of a versioned model.
   */
  public fun modelPackageVersion(modelPackageVersion: Number) {
    cdkBuilder.modelPackageVersion(modelPackageVersion)
  }

  /**
   * @param samplePayloadUrl The Amazon Simple Storage Service path where the sample payload are
   * stored.
   * This path must point to a single gzip compressed tar archive (.tar.gz suffix).
   */
  public fun samplePayloadUrl(samplePayloadUrl: String) {
    cdkBuilder.samplePayloadUrl(samplePayloadUrl)
  }

  /**
   * @param sourceAlgorithmSpecification A list of algorithms that were used to create a model
   * package.
   */
  public fun sourceAlgorithmSpecification(sourceAlgorithmSpecification: IResolvable) {
    cdkBuilder.sourceAlgorithmSpecification(sourceAlgorithmSpecification)
  }

  /**
   * @param sourceAlgorithmSpecification A list of algorithms that were used to create a model
   * package.
   */
  public
      fun sourceAlgorithmSpecification(sourceAlgorithmSpecification: CfnModelPackage.SourceAlgorithmSpecificationProperty) {
    cdkBuilder.sourceAlgorithmSpecification(sourceAlgorithmSpecification)
  }

  /**
   * @param tags A list of the tags associated with the model package.
   * For more information, see [Tagging AWS
   * resources](https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html) in the *AWS General
   * Reference Guide* .
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * @param tags A list of the tags associated with the model package.
   * For more information, see [Tagging AWS
   * resources](https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html) in the *AWS General
   * Reference Guide* .
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  /**
   * @param task The machine learning task your model package accomplishes.
   * Common machine learning tasks include object detection and image classification.
   */
  public fun task(task: String) {
    cdkBuilder.task(task)
  }

  /**
   * @param validationSpecification Specifies batch transform jobs that SageMaker runs to validate
   * your model package.
   */
  public fun validationSpecification(validationSpecification: IResolvable) {
    cdkBuilder.validationSpecification(validationSpecification)
  }

  /**
   * @param validationSpecification Specifies batch transform jobs that SageMaker runs to validate
   * your model package.
   */
  public
      fun validationSpecification(validationSpecification: CfnModelPackage.ValidationSpecificationProperty) {
    cdkBuilder.validationSpecification(validationSpecification)
  }

  public fun build(): CfnModelPackageProps {
    if(_additionalInferenceSpecifications.isNotEmpty())
        cdkBuilder.additionalInferenceSpecifications(_additionalInferenceSpecifications)
    if(_additionalInferenceSpecificationsToAdd.isNotEmpty())
        cdkBuilder.additionalInferenceSpecificationsToAdd(_additionalInferenceSpecificationsToAdd)
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
