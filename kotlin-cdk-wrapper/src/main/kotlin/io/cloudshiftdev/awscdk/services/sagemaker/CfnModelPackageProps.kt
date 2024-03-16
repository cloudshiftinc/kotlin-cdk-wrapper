@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.sagemaker

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnModelPackage`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.sagemaker.*;
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
 * .skipModelValidation("skipModelValidation")
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
public interface CfnModelPackageProps {
  /**
   * An array of additional Inference Specification objects.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelpackage.html#cfn-sagemaker-modelpackage-additionalinferencespecifications)
   */
  public fun additionalInferenceSpecifications(): Any? =
      unwrap(this).getAdditionalInferenceSpecifications()

  /**
   * An array of additional Inference Specification objects to be added to the existing array.
   *
   * The total number of additional Inference Specification objects cannot exceed 15. Each
   * additional Inference Specification object specifies artifacts based on this model package that can
   * be used on inference endpoints. Generally used with SageMaker Neo to store the compiled artifacts.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelpackage.html#cfn-sagemaker-modelpackage-additionalinferencespecificationstoadd)
   */
  public fun additionalInferenceSpecificationsToAdd(): Any? =
      unwrap(this).getAdditionalInferenceSpecificationsToAdd()

  /**
   * A description provided when the model approval is set.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelpackage.html#cfn-sagemaker-modelpackage-approvaldescription)
   */
  public fun approvalDescription(): String? = unwrap(this).getApprovalDescription()

  /**
   * Whether the model package is to be certified to be listed on AWS Marketplace.
   *
   * For information about listing model packages on AWS Marketplace, see [List Your Algorithm or
   * Model Package on AWS
   * Marketplace](https://docs.aws.amazon.com/sagemaker/latest/dg/sagemaker-mkt-list.html) .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelpackage.html#cfn-sagemaker-modelpackage-certifyformarketplace)
   */
  public fun certifyForMarketplace(): Any? = unwrap(this).getCertifyForMarketplace()

  /**
   * A unique token that guarantees that the call to this API is idempotent.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelpackage.html#cfn-sagemaker-modelpackage-clienttoken)
   */
  public fun clientToken(): String? = unwrap(this).getClientToken()

  /**
   * The metadata properties for the model package.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelpackage.html#cfn-sagemaker-modelpackage-customermetadataproperties)
   */
  public fun customerMetadataProperties(): Any? = unwrap(this).getCustomerMetadataProperties()

  /**
   * The machine learning domain of your model package and its components.
   *
   * Common machine learning domains include computer vision and natural language processing.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelpackage.html#cfn-sagemaker-modelpackage-domain)
   */
  public fun domain(): String? = unwrap(this).getDomain()

  /**
   * Represents the drift check baselines that can be used when the model monitor is set using the
   * model package.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelpackage.html#cfn-sagemaker-modelpackage-driftcheckbaselines)
   */
  public fun driftCheckBaselines(): Any? = unwrap(this).getDriftCheckBaselines()

  /**
   * Defines how to perform inference generation after a training job is run.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelpackage.html#cfn-sagemaker-modelpackage-inferencespecification)
   */
  public fun inferenceSpecification(): Any? = unwrap(this).getInferenceSpecification()

  /**
   * The last time the model package was modified.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelpackage.html#cfn-sagemaker-modelpackage-lastmodifiedtime)
   */
  public fun lastModifiedTime(): String? = unwrap(this).getLastModifiedTime()

  /**
   * Metadata properties of the tracking entity, trial, or trial component.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelpackage.html#cfn-sagemaker-modelpackage-metadataproperties)
   */
  public fun metadataProperties(): Any? = unwrap(this).getMetadataProperties()

  /**
   * The approval status of the model. This can be one of the following values.
   *
   * * `APPROVED` - The model is approved
   * * `REJECTED` - The model is rejected.
   * * `PENDING_MANUAL_APPROVAL` - The model is waiting for manual approval.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelpackage.html#cfn-sagemaker-modelpackage-modelapprovalstatus)
   */
  public fun modelApprovalStatus(): String? = unwrap(this).getModelApprovalStatus()

  /**
   * Metrics for the model.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelpackage.html#cfn-sagemaker-modelpackage-modelmetrics)
   */
  public fun modelMetrics(): Any? = unwrap(this).getModelMetrics()

  /**
   * The description of the model package.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelpackage.html#cfn-sagemaker-modelpackage-modelpackagedescription)
   */
  public fun modelPackageDescription(): String? = unwrap(this).getModelPackageDescription()

  /**
   * The model group to which the model belongs.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelpackage.html#cfn-sagemaker-modelpackage-modelpackagegroupname)
   */
  public fun modelPackageGroupName(): String? = unwrap(this).getModelPackageGroupName()

  /**
   * The name of the model.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelpackage.html#cfn-sagemaker-modelpackage-modelpackagename)
   */
  public fun modelPackageName(): String? = unwrap(this).getModelPackageName()

  /**
   * Specifies the validation and image scan statuses of the model package.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelpackage.html#cfn-sagemaker-modelpackage-modelpackagestatusdetails)
   */
  public fun modelPackageStatusDetails(): Any? = unwrap(this).getModelPackageStatusDetails()

  /**
   * The version number of a versioned model.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelpackage.html#cfn-sagemaker-modelpackage-modelpackageversion)
   */
  public fun modelPackageVersion(): Number? = unwrap(this).getModelPackageVersion()

  /**
   * The Amazon Simple Storage Service path where the sample payload are stored.
   *
   * This path must point to a single gzip compressed tar archive (.tar.gz suffix).
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelpackage.html#cfn-sagemaker-modelpackage-samplepayloadurl)
   */
  public fun samplePayloadUrl(): String? = unwrap(this).getSamplePayloadUrl()

  /**
   * Indicates if you want to skip model validation.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelpackage.html#cfn-sagemaker-modelpackage-skipmodelvalidation)
   */
  public fun skipModelValidation(): String? = unwrap(this).getSkipModelValidation()

  /**
   * A list of algorithms that were used to create a model package.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelpackage.html#cfn-sagemaker-modelpackage-sourcealgorithmspecification)
   */
  public fun sourceAlgorithmSpecification(): Any? = unwrap(this).getSourceAlgorithmSpecification()

  /**
   * A list of the tags associated with the model package.
   *
   * For more information, see [Tagging AWS
   * resources](https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html) in the *AWS General
   * Reference Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelpackage.html#cfn-sagemaker-modelpackage-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * The machine learning task your model package accomplishes.
   *
   * Common machine learning tasks include object detection and image classification.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelpackage.html#cfn-sagemaker-modelpackage-task)
   */
  public fun task(): String? = unwrap(this).getTask()

  /**
   * Specifies batch transform jobs that SageMaker runs to validate your model package.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelpackage.html#cfn-sagemaker-modelpackage-validationspecification)
   */
  public fun validationSpecification(): Any? = unwrap(this).getValidationSpecification()

  /**
   * A builder for [CfnModelPackageProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param additionalInferenceSpecifications An array of additional Inference Specification
     * objects.
     */
    public fun additionalInferenceSpecifications(additionalInferenceSpecifications: IResolvable)

    /**
     * @param additionalInferenceSpecifications An array of additional Inference Specification
     * objects.
     */
    public fun additionalInferenceSpecifications(additionalInferenceSpecifications: List<Any>)

    /**
     * @param additionalInferenceSpecifications An array of additional Inference Specification
     * objects.
     */
    public fun additionalInferenceSpecifications(vararg additionalInferenceSpecifications: Any)

    /**
     * @param additionalInferenceSpecificationsToAdd An array of additional Inference Specification
     * objects to be added to the existing array.
     * The total number of additional Inference Specification objects cannot exceed 15. Each
     * additional Inference Specification object specifies artifacts based on this model package that
     * can be used on inference endpoints. Generally used with SageMaker Neo to store the compiled
     * artifacts.
     */
    public
        fun additionalInferenceSpecificationsToAdd(additionalInferenceSpecificationsToAdd: IResolvable)

    /**
     * @param additionalInferenceSpecificationsToAdd An array of additional Inference Specification
     * objects to be added to the existing array.
     * The total number of additional Inference Specification objects cannot exceed 15. Each
     * additional Inference Specification object specifies artifacts based on this model package that
     * can be used on inference endpoints. Generally used with SageMaker Neo to store the compiled
     * artifacts.
     */
    public
        fun additionalInferenceSpecificationsToAdd(additionalInferenceSpecificationsToAdd: List<Any>)

    /**
     * @param additionalInferenceSpecificationsToAdd An array of additional Inference Specification
     * objects to be added to the existing array.
     * The total number of additional Inference Specification objects cannot exceed 15. Each
     * additional Inference Specification object specifies artifacts based on this model package that
     * can be used on inference endpoints. Generally used with SageMaker Neo to store the compiled
     * artifacts.
     */
    public fun additionalInferenceSpecificationsToAdd(vararg
        additionalInferenceSpecificationsToAdd: Any)

    /**
     * @param approvalDescription A description provided when the model approval is set.
     */
    public fun approvalDescription(approvalDescription: String)

    /**
     * @param certifyForMarketplace Whether the model package is to be certified to be listed on AWS
     * Marketplace.
     * For information about listing model packages on AWS Marketplace, see [List Your Algorithm or
     * Model Package on AWS
     * Marketplace](https://docs.aws.amazon.com/sagemaker/latest/dg/sagemaker-mkt-list.html) .
     */
    public fun certifyForMarketplace(certifyForMarketplace: Boolean)

    /**
     * @param certifyForMarketplace Whether the model package is to be certified to be listed on AWS
     * Marketplace.
     * For information about listing model packages on AWS Marketplace, see [List Your Algorithm or
     * Model Package on AWS
     * Marketplace](https://docs.aws.amazon.com/sagemaker/latest/dg/sagemaker-mkt-list.html) .
     */
    public fun certifyForMarketplace(certifyForMarketplace: IResolvable)

    /**
     * @param clientToken A unique token that guarantees that the call to this API is idempotent.
     */
    public fun clientToken(clientToken: String)

    /**
     * @param customerMetadataProperties The metadata properties for the model package.
     */
    public fun customerMetadataProperties(customerMetadataProperties: IResolvable)

    /**
     * @param customerMetadataProperties The metadata properties for the model package.
     */
    public fun customerMetadataProperties(customerMetadataProperties: Map<String, String>)

    /**
     * @param domain The machine learning domain of your model package and its components.
     * Common machine learning domains include computer vision and natural language processing.
     */
    public fun domain(domain: String)

    /**
     * @param driftCheckBaselines Represents the drift check baselines that can be used when the
     * model monitor is set using the model package.
     */
    public fun driftCheckBaselines(driftCheckBaselines: IResolvable)

    /**
     * @param driftCheckBaselines Represents the drift check baselines that can be used when the
     * model monitor is set using the model package.
     */
    public fun driftCheckBaselines(driftCheckBaselines: CfnModelPackage.DriftCheckBaselinesProperty)

    /**
     * @param driftCheckBaselines Represents the drift check baselines that can be used when the
     * model monitor is set using the model package.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("20e953fa558ccaa9edc9e6fa879bfb60c111741ba2a80aebc60d00bff1998da4")
    public
        fun driftCheckBaselines(driftCheckBaselines: CfnModelPackage.DriftCheckBaselinesProperty.Builder.() -> Unit)

    /**
     * @param inferenceSpecification Defines how to perform inference generation after a training
     * job is run.
     */
    public fun inferenceSpecification(inferenceSpecification: IResolvable)

    /**
     * @param inferenceSpecification Defines how to perform inference generation after a training
     * job is run.
     */
    public
        fun inferenceSpecification(inferenceSpecification: CfnModelPackage.InferenceSpecificationProperty)

    /**
     * @param inferenceSpecification Defines how to perform inference generation after a training
     * job is run.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1e216f3dd5acf61f14b9dc7b5d610de80b88550de6b37b027e2978f2b4bf2ad9")
    public
        fun inferenceSpecification(inferenceSpecification: CfnModelPackage.InferenceSpecificationProperty.Builder.() -> Unit)

    /**
     * @param lastModifiedTime The last time the model package was modified.
     */
    public fun lastModifiedTime(lastModifiedTime: String)

    /**
     * @param metadataProperties Metadata properties of the tracking entity, trial, or trial
     * component.
     */
    public fun metadataProperties(metadataProperties: IResolvable)

    /**
     * @param metadataProperties Metadata properties of the tracking entity, trial, or trial
     * component.
     */
    public fun metadataProperties(metadataProperties: CfnModelPackage.MetadataPropertiesProperty)

    /**
     * @param metadataProperties Metadata properties of the tracking entity, trial, or trial
     * component.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("df38983112debb9256941485a19341f349f3e3fb6aabc2fa8601154c1db63e25")
    public
        fun metadataProperties(metadataProperties: CfnModelPackage.MetadataPropertiesProperty.Builder.() -> Unit)

    /**
     * @param modelApprovalStatus The approval status of the model. This can be one of the following
     * values.
     * * `APPROVED` - The model is approved
     * * `REJECTED` - The model is rejected.
     * * `PENDING_MANUAL_APPROVAL` - The model is waiting for manual approval.
     */
    public fun modelApprovalStatus(modelApprovalStatus: String)

    /**
     * @param modelMetrics Metrics for the model.
     */
    public fun modelMetrics(modelMetrics: IResolvable)

    /**
     * @param modelMetrics Metrics for the model.
     */
    public fun modelMetrics(modelMetrics: CfnModelPackage.ModelMetricsProperty)

    /**
     * @param modelMetrics Metrics for the model.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6a387f00a27f0bc37297133f9097aef52eb9a2c7b0643bde8646002633ed1fee")
    public fun modelMetrics(modelMetrics: CfnModelPackage.ModelMetricsProperty.Builder.() -> Unit)

    /**
     * @param modelPackageDescription The description of the model package.
     */
    public fun modelPackageDescription(modelPackageDescription: String)

    /**
     * @param modelPackageGroupName The model group to which the model belongs.
     */
    public fun modelPackageGroupName(modelPackageGroupName: String)

    /**
     * @param modelPackageName The name of the model.
     */
    public fun modelPackageName(modelPackageName: String)

    /**
     * @param modelPackageStatusDetails Specifies the validation and image scan statuses of the
     * model package.
     */
    public fun modelPackageStatusDetails(modelPackageStatusDetails: IResolvable)

    /**
     * @param modelPackageStatusDetails Specifies the validation and image scan statuses of the
     * model package.
     */
    public
        fun modelPackageStatusDetails(modelPackageStatusDetails: CfnModelPackage.ModelPackageStatusDetailsProperty)

    /**
     * @param modelPackageStatusDetails Specifies the validation and image scan statuses of the
     * model package.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d3780f79c6d195a0cd106b9b82d76a6b2ad801452b9135ad5a873e9a53a11585")
    public
        fun modelPackageStatusDetails(modelPackageStatusDetails: CfnModelPackage.ModelPackageStatusDetailsProperty.Builder.() -> Unit)

    /**
     * @param modelPackageVersion The version number of a versioned model.
     */
    public fun modelPackageVersion(modelPackageVersion: Number)

    /**
     * @param samplePayloadUrl The Amazon Simple Storage Service path where the sample payload are
     * stored.
     * This path must point to a single gzip compressed tar archive (.tar.gz suffix).
     */
    public fun samplePayloadUrl(samplePayloadUrl: String)

    /**
     * @param skipModelValidation Indicates if you want to skip model validation.
     */
    public fun skipModelValidation(skipModelValidation: String)

    /**
     * @param sourceAlgorithmSpecification A list of algorithms that were used to create a model
     * package.
     */
    public fun sourceAlgorithmSpecification(sourceAlgorithmSpecification: IResolvable)

    /**
     * @param sourceAlgorithmSpecification A list of algorithms that were used to create a model
     * package.
     */
    public
        fun sourceAlgorithmSpecification(sourceAlgorithmSpecification: CfnModelPackage.SourceAlgorithmSpecificationProperty)

    /**
     * @param sourceAlgorithmSpecification A list of algorithms that were used to create a model
     * package.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("af168644b5d0c74cbc5930d32f3bc5be29d8d5eb83a53c19deb06e95c5892a97")
    public
        fun sourceAlgorithmSpecification(sourceAlgorithmSpecification: CfnModelPackage.SourceAlgorithmSpecificationProperty.Builder.() -> Unit)

    /**
     * @param tags A list of the tags associated with the model package.
     * For more information, see [Tagging AWS
     * resources](https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html) in the *AWS General
     * Reference Guide* .
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags A list of the tags associated with the model package.
     * For more information, see [Tagging AWS
     * resources](https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html) in the *AWS General
     * Reference Guide* .
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param task The machine learning task your model package accomplishes.
     * Common machine learning tasks include object detection and image classification.
     */
    public fun task(task: String)

    /**
     * @param validationSpecification Specifies batch transform jobs that SageMaker runs to validate
     * your model package.
     */
    public fun validationSpecification(validationSpecification: IResolvable)

    /**
     * @param validationSpecification Specifies batch transform jobs that SageMaker runs to validate
     * your model package.
     */
    public
        fun validationSpecification(validationSpecification: CfnModelPackage.ValidationSpecificationProperty)

    /**
     * @param validationSpecification Specifies batch transform jobs that SageMaker runs to validate
     * your model package.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("95553887979e733cadf816a81a0a0be3a5a4330c352d0bca422bb36aebb2234e")
    public
        fun validationSpecification(validationSpecification: CfnModelPackage.ValidationSpecificationProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.sagemaker.CfnModelPackageProps.Builder =
        software.amazon.awscdk.services.sagemaker.CfnModelPackageProps.builder()

    /**
     * @param additionalInferenceSpecifications An array of additional Inference Specification
     * objects.
     */
    override fun additionalInferenceSpecifications(additionalInferenceSpecifications: IResolvable) {
      cdkBuilder.additionalInferenceSpecifications(additionalInferenceSpecifications.let(IResolvable::unwrap))
    }

    /**
     * @param additionalInferenceSpecifications An array of additional Inference Specification
     * objects.
     */
    override fun additionalInferenceSpecifications(additionalInferenceSpecifications: List<Any>) {
      cdkBuilder.additionalInferenceSpecifications(additionalInferenceSpecifications)
    }

    /**
     * @param additionalInferenceSpecifications An array of additional Inference Specification
     * objects.
     */
    override fun additionalInferenceSpecifications(vararg additionalInferenceSpecifications: Any):
        Unit = additionalInferenceSpecifications(additionalInferenceSpecifications.toList())

    /**
     * @param additionalInferenceSpecificationsToAdd An array of additional Inference Specification
     * objects to be added to the existing array.
     * The total number of additional Inference Specification objects cannot exceed 15. Each
     * additional Inference Specification object specifies artifacts based on this model package that
     * can be used on inference endpoints. Generally used with SageMaker Neo to store the compiled
     * artifacts.
     */
    override
        fun additionalInferenceSpecificationsToAdd(additionalInferenceSpecificationsToAdd: IResolvable) {
      cdkBuilder.additionalInferenceSpecificationsToAdd(additionalInferenceSpecificationsToAdd.let(IResolvable::unwrap))
    }

    /**
     * @param additionalInferenceSpecificationsToAdd An array of additional Inference Specification
     * objects to be added to the existing array.
     * The total number of additional Inference Specification objects cannot exceed 15. Each
     * additional Inference Specification object specifies artifacts based on this model package that
     * can be used on inference endpoints. Generally used with SageMaker Neo to store the compiled
     * artifacts.
     */
    override
        fun additionalInferenceSpecificationsToAdd(additionalInferenceSpecificationsToAdd: List<Any>) {
      cdkBuilder.additionalInferenceSpecificationsToAdd(additionalInferenceSpecificationsToAdd)
    }

    /**
     * @param additionalInferenceSpecificationsToAdd An array of additional Inference Specification
     * objects to be added to the existing array.
     * The total number of additional Inference Specification objects cannot exceed 15. Each
     * additional Inference Specification object specifies artifacts based on this model package that
     * can be used on inference endpoints. Generally used with SageMaker Neo to store the compiled
     * artifacts.
     */
    override fun additionalInferenceSpecificationsToAdd(vararg
        additionalInferenceSpecificationsToAdd: Any): Unit =
        additionalInferenceSpecificationsToAdd(additionalInferenceSpecificationsToAdd.toList())

    /**
     * @param approvalDescription A description provided when the model approval is set.
     */
    override fun approvalDescription(approvalDescription: String) {
      cdkBuilder.approvalDescription(approvalDescription)
    }

    /**
     * @param certifyForMarketplace Whether the model package is to be certified to be listed on AWS
     * Marketplace.
     * For information about listing model packages on AWS Marketplace, see [List Your Algorithm or
     * Model Package on AWS
     * Marketplace](https://docs.aws.amazon.com/sagemaker/latest/dg/sagemaker-mkt-list.html) .
     */
    override fun certifyForMarketplace(certifyForMarketplace: Boolean) {
      cdkBuilder.certifyForMarketplace(certifyForMarketplace)
    }

    /**
     * @param certifyForMarketplace Whether the model package is to be certified to be listed on AWS
     * Marketplace.
     * For information about listing model packages on AWS Marketplace, see [List Your Algorithm or
     * Model Package on AWS
     * Marketplace](https://docs.aws.amazon.com/sagemaker/latest/dg/sagemaker-mkt-list.html) .
     */
    override fun certifyForMarketplace(certifyForMarketplace: IResolvable) {
      cdkBuilder.certifyForMarketplace(certifyForMarketplace.let(IResolvable::unwrap))
    }

    /**
     * @param clientToken A unique token that guarantees that the call to this API is idempotent.
     */
    override fun clientToken(clientToken: String) {
      cdkBuilder.clientToken(clientToken)
    }

    /**
     * @param customerMetadataProperties The metadata properties for the model package.
     */
    override fun customerMetadataProperties(customerMetadataProperties: IResolvable) {
      cdkBuilder.customerMetadataProperties(customerMetadataProperties.let(IResolvable::unwrap))
    }

    /**
     * @param customerMetadataProperties The metadata properties for the model package.
     */
    override fun customerMetadataProperties(customerMetadataProperties: Map<String, String>) {
      cdkBuilder.customerMetadataProperties(customerMetadataProperties)
    }

    /**
     * @param domain The machine learning domain of your model package and its components.
     * Common machine learning domains include computer vision and natural language processing.
     */
    override fun domain(domain: String) {
      cdkBuilder.domain(domain)
    }

    /**
     * @param driftCheckBaselines Represents the drift check baselines that can be used when the
     * model monitor is set using the model package.
     */
    override fun driftCheckBaselines(driftCheckBaselines: IResolvable) {
      cdkBuilder.driftCheckBaselines(driftCheckBaselines.let(IResolvable::unwrap))
    }

    /**
     * @param driftCheckBaselines Represents the drift check baselines that can be used when the
     * model monitor is set using the model package.
     */
    override
        fun driftCheckBaselines(driftCheckBaselines: CfnModelPackage.DriftCheckBaselinesProperty) {
      cdkBuilder.driftCheckBaselines(driftCheckBaselines.let(CfnModelPackage.DriftCheckBaselinesProperty::unwrap))
    }

    /**
     * @param driftCheckBaselines Represents the drift check baselines that can be used when the
     * model monitor is set using the model package.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("20e953fa558ccaa9edc9e6fa879bfb60c111741ba2a80aebc60d00bff1998da4")
    override
        fun driftCheckBaselines(driftCheckBaselines: CfnModelPackage.DriftCheckBaselinesProperty.Builder.() -> Unit):
        Unit = driftCheckBaselines(CfnModelPackage.DriftCheckBaselinesProperty(driftCheckBaselines))

    /**
     * @param inferenceSpecification Defines how to perform inference generation after a training
     * job is run.
     */
    override fun inferenceSpecification(inferenceSpecification: IResolvable) {
      cdkBuilder.inferenceSpecification(inferenceSpecification.let(IResolvable::unwrap))
    }

    /**
     * @param inferenceSpecification Defines how to perform inference generation after a training
     * job is run.
     */
    override
        fun inferenceSpecification(inferenceSpecification: CfnModelPackage.InferenceSpecificationProperty) {
      cdkBuilder.inferenceSpecification(inferenceSpecification.let(CfnModelPackage.InferenceSpecificationProperty::unwrap))
    }

    /**
     * @param inferenceSpecification Defines how to perform inference generation after a training
     * job is run.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1e216f3dd5acf61f14b9dc7b5d610de80b88550de6b37b027e2978f2b4bf2ad9")
    override
        fun inferenceSpecification(inferenceSpecification: CfnModelPackage.InferenceSpecificationProperty.Builder.() -> Unit):
        Unit =
        inferenceSpecification(CfnModelPackage.InferenceSpecificationProperty(inferenceSpecification))

    /**
     * @param lastModifiedTime The last time the model package was modified.
     */
    override fun lastModifiedTime(lastModifiedTime: String) {
      cdkBuilder.lastModifiedTime(lastModifiedTime)
    }

    /**
     * @param metadataProperties Metadata properties of the tracking entity, trial, or trial
     * component.
     */
    override fun metadataProperties(metadataProperties: IResolvable) {
      cdkBuilder.metadataProperties(metadataProperties.let(IResolvable::unwrap))
    }

    /**
     * @param metadataProperties Metadata properties of the tracking entity, trial, or trial
     * component.
     */
    override
        fun metadataProperties(metadataProperties: CfnModelPackage.MetadataPropertiesProperty) {
      cdkBuilder.metadataProperties(metadataProperties.let(CfnModelPackage.MetadataPropertiesProperty::unwrap))
    }

    /**
     * @param metadataProperties Metadata properties of the tracking entity, trial, or trial
     * component.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("df38983112debb9256941485a19341f349f3e3fb6aabc2fa8601154c1db63e25")
    override
        fun metadataProperties(metadataProperties: CfnModelPackage.MetadataPropertiesProperty.Builder.() -> Unit):
        Unit = metadataProperties(CfnModelPackage.MetadataPropertiesProperty(metadataProperties))

    /**
     * @param modelApprovalStatus The approval status of the model. This can be one of the following
     * values.
     * * `APPROVED` - The model is approved
     * * `REJECTED` - The model is rejected.
     * * `PENDING_MANUAL_APPROVAL` - The model is waiting for manual approval.
     */
    override fun modelApprovalStatus(modelApprovalStatus: String) {
      cdkBuilder.modelApprovalStatus(modelApprovalStatus)
    }

    /**
     * @param modelMetrics Metrics for the model.
     */
    override fun modelMetrics(modelMetrics: IResolvable) {
      cdkBuilder.modelMetrics(modelMetrics.let(IResolvable::unwrap))
    }

    /**
     * @param modelMetrics Metrics for the model.
     */
    override fun modelMetrics(modelMetrics: CfnModelPackage.ModelMetricsProperty) {
      cdkBuilder.modelMetrics(modelMetrics.let(CfnModelPackage.ModelMetricsProperty::unwrap))
    }

    /**
     * @param modelMetrics Metrics for the model.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6a387f00a27f0bc37297133f9097aef52eb9a2c7b0643bde8646002633ed1fee")
    override
        fun modelMetrics(modelMetrics: CfnModelPackage.ModelMetricsProperty.Builder.() -> Unit):
        Unit = modelMetrics(CfnModelPackage.ModelMetricsProperty(modelMetrics))

    /**
     * @param modelPackageDescription The description of the model package.
     */
    override fun modelPackageDescription(modelPackageDescription: String) {
      cdkBuilder.modelPackageDescription(modelPackageDescription)
    }

    /**
     * @param modelPackageGroupName The model group to which the model belongs.
     */
    override fun modelPackageGroupName(modelPackageGroupName: String) {
      cdkBuilder.modelPackageGroupName(modelPackageGroupName)
    }

    /**
     * @param modelPackageName The name of the model.
     */
    override fun modelPackageName(modelPackageName: String) {
      cdkBuilder.modelPackageName(modelPackageName)
    }

    /**
     * @param modelPackageStatusDetails Specifies the validation and image scan statuses of the
     * model package.
     */
    override fun modelPackageStatusDetails(modelPackageStatusDetails: IResolvable) {
      cdkBuilder.modelPackageStatusDetails(modelPackageStatusDetails.let(IResolvable::unwrap))
    }

    /**
     * @param modelPackageStatusDetails Specifies the validation and image scan statuses of the
     * model package.
     */
    override
        fun modelPackageStatusDetails(modelPackageStatusDetails: CfnModelPackage.ModelPackageStatusDetailsProperty) {
      cdkBuilder.modelPackageStatusDetails(modelPackageStatusDetails.let(CfnModelPackage.ModelPackageStatusDetailsProperty::unwrap))
    }

    /**
     * @param modelPackageStatusDetails Specifies the validation and image scan statuses of the
     * model package.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d3780f79c6d195a0cd106b9b82d76a6b2ad801452b9135ad5a873e9a53a11585")
    override
        fun modelPackageStatusDetails(modelPackageStatusDetails: CfnModelPackage.ModelPackageStatusDetailsProperty.Builder.() -> Unit):
        Unit =
        modelPackageStatusDetails(CfnModelPackage.ModelPackageStatusDetailsProperty(modelPackageStatusDetails))

    /**
     * @param modelPackageVersion The version number of a versioned model.
     */
    override fun modelPackageVersion(modelPackageVersion: Number) {
      cdkBuilder.modelPackageVersion(modelPackageVersion)
    }

    /**
     * @param samplePayloadUrl The Amazon Simple Storage Service path where the sample payload are
     * stored.
     * This path must point to a single gzip compressed tar archive (.tar.gz suffix).
     */
    override fun samplePayloadUrl(samplePayloadUrl: String) {
      cdkBuilder.samplePayloadUrl(samplePayloadUrl)
    }

    /**
     * @param skipModelValidation Indicates if you want to skip model validation.
     */
    override fun skipModelValidation(skipModelValidation: String) {
      cdkBuilder.skipModelValidation(skipModelValidation)
    }

    /**
     * @param sourceAlgorithmSpecification A list of algorithms that were used to create a model
     * package.
     */
    override fun sourceAlgorithmSpecification(sourceAlgorithmSpecification: IResolvable) {
      cdkBuilder.sourceAlgorithmSpecification(sourceAlgorithmSpecification.let(IResolvable::unwrap))
    }

    /**
     * @param sourceAlgorithmSpecification A list of algorithms that were used to create a model
     * package.
     */
    override
        fun sourceAlgorithmSpecification(sourceAlgorithmSpecification: CfnModelPackage.SourceAlgorithmSpecificationProperty) {
      cdkBuilder.sourceAlgorithmSpecification(sourceAlgorithmSpecification.let(CfnModelPackage.SourceAlgorithmSpecificationProperty::unwrap))
    }

    /**
     * @param sourceAlgorithmSpecification A list of algorithms that were used to create a model
     * package.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("af168644b5d0c74cbc5930d32f3bc5be29d8d5eb83a53c19deb06e95c5892a97")
    override
        fun sourceAlgorithmSpecification(sourceAlgorithmSpecification: CfnModelPackage.SourceAlgorithmSpecificationProperty.Builder.() -> Unit):
        Unit =
        sourceAlgorithmSpecification(CfnModelPackage.SourceAlgorithmSpecificationProperty(sourceAlgorithmSpecification))

    /**
     * @param tags A list of the tags associated with the model package.
     * For more information, see [Tagging AWS
     * resources](https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html) in the *AWS General
     * Reference Guide* .
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags A list of the tags associated with the model package.
     * For more information, see [Tagging AWS
     * resources](https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html) in the *AWS General
     * Reference Guide* .
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param task The machine learning task your model package accomplishes.
     * Common machine learning tasks include object detection and image classification.
     */
    override fun task(task: String) {
      cdkBuilder.task(task)
    }

    /**
     * @param validationSpecification Specifies batch transform jobs that SageMaker runs to validate
     * your model package.
     */
    override fun validationSpecification(validationSpecification: IResolvable) {
      cdkBuilder.validationSpecification(validationSpecification.let(IResolvable::unwrap))
    }

    /**
     * @param validationSpecification Specifies batch transform jobs that SageMaker runs to validate
     * your model package.
     */
    override
        fun validationSpecification(validationSpecification: CfnModelPackage.ValidationSpecificationProperty) {
      cdkBuilder.validationSpecification(validationSpecification.let(CfnModelPackage.ValidationSpecificationProperty::unwrap))
    }

    /**
     * @param validationSpecification Specifies batch transform jobs that SageMaker runs to validate
     * your model package.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("95553887979e733cadf816a81a0a0be3a5a4330c352d0bca422bb36aebb2234e")
    override
        fun validationSpecification(validationSpecification: CfnModelPackage.ValidationSpecificationProperty.Builder.() -> Unit):
        Unit =
        validationSpecification(CfnModelPackage.ValidationSpecificationProperty(validationSpecification))

    public fun build(): software.amazon.awscdk.services.sagemaker.CfnModelPackageProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelPackageProps,
  ) : CdkObject(cdkObject), CfnModelPackageProps {
    /**
     * An array of additional Inference Specification objects.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelpackage.html#cfn-sagemaker-modelpackage-additionalinferencespecifications)
     */
    override fun additionalInferenceSpecifications(): Any? =
        unwrap(this).getAdditionalInferenceSpecifications()

    /**
     * An array of additional Inference Specification objects to be added to the existing array.
     *
     * The total number of additional Inference Specification objects cannot exceed 15. Each
     * additional Inference Specification object specifies artifacts based on this model package that
     * can be used on inference endpoints. Generally used with SageMaker Neo to store the compiled
     * artifacts.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelpackage.html#cfn-sagemaker-modelpackage-additionalinferencespecificationstoadd)
     */
    override fun additionalInferenceSpecificationsToAdd(): Any? =
        unwrap(this).getAdditionalInferenceSpecificationsToAdd()

    /**
     * A description provided when the model approval is set.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelpackage.html#cfn-sagemaker-modelpackage-approvaldescription)
     */
    override fun approvalDescription(): String? = unwrap(this).getApprovalDescription()

    /**
     * Whether the model package is to be certified to be listed on AWS Marketplace.
     *
     * For information about listing model packages on AWS Marketplace, see [List Your Algorithm or
     * Model Package on AWS
     * Marketplace](https://docs.aws.amazon.com/sagemaker/latest/dg/sagemaker-mkt-list.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelpackage.html#cfn-sagemaker-modelpackage-certifyformarketplace)
     */
    override fun certifyForMarketplace(): Any? = unwrap(this).getCertifyForMarketplace()

    /**
     * A unique token that guarantees that the call to this API is idempotent.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelpackage.html#cfn-sagemaker-modelpackage-clienttoken)
     */
    override fun clientToken(): String? = unwrap(this).getClientToken()

    /**
     * The metadata properties for the model package.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelpackage.html#cfn-sagemaker-modelpackage-customermetadataproperties)
     */
    override fun customerMetadataProperties(): Any? = unwrap(this).getCustomerMetadataProperties()

    /**
     * The machine learning domain of your model package and its components.
     *
     * Common machine learning domains include computer vision and natural language processing.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelpackage.html#cfn-sagemaker-modelpackage-domain)
     */
    override fun domain(): String? = unwrap(this).getDomain()

    /**
     * Represents the drift check baselines that can be used when the model monitor is set using the
     * model package.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelpackage.html#cfn-sagemaker-modelpackage-driftcheckbaselines)
     */
    override fun driftCheckBaselines(): Any? = unwrap(this).getDriftCheckBaselines()

    /**
     * Defines how to perform inference generation after a training job is run.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelpackage.html#cfn-sagemaker-modelpackage-inferencespecification)
     */
    override fun inferenceSpecification(): Any? = unwrap(this).getInferenceSpecification()

    /**
     * The last time the model package was modified.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelpackage.html#cfn-sagemaker-modelpackage-lastmodifiedtime)
     */
    override fun lastModifiedTime(): String? = unwrap(this).getLastModifiedTime()

    /**
     * Metadata properties of the tracking entity, trial, or trial component.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelpackage.html#cfn-sagemaker-modelpackage-metadataproperties)
     */
    override fun metadataProperties(): Any? = unwrap(this).getMetadataProperties()

    /**
     * The approval status of the model. This can be one of the following values.
     *
     * * `APPROVED` - The model is approved
     * * `REJECTED` - The model is rejected.
     * * `PENDING_MANUAL_APPROVAL` - The model is waiting for manual approval.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelpackage.html#cfn-sagemaker-modelpackage-modelapprovalstatus)
     */
    override fun modelApprovalStatus(): String? = unwrap(this).getModelApprovalStatus()

    /**
     * Metrics for the model.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelpackage.html#cfn-sagemaker-modelpackage-modelmetrics)
     */
    override fun modelMetrics(): Any? = unwrap(this).getModelMetrics()

    /**
     * The description of the model package.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelpackage.html#cfn-sagemaker-modelpackage-modelpackagedescription)
     */
    override fun modelPackageDescription(): String? = unwrap(this).getModelPackageDescription()

    /**
     * The model group to which the model belongs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelpackage.html#cfn-sagemaker-modelpackage-modelpackagegroupname)
     */
    override fun modelPackageGroupName(): String? = unwrap(this).getModelPackageGroupName()

    /**
     * The name of the model.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelpackage.html#cfn-sagemaker-modelpackage-modelpackagename)
     */
    override fun modelPackageName(): String? = unwrap(this).getModelPackageName()

    /**
     * Specifies the validation and image scan statuses of the model package.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelpackage.html#cfn-sagemaker-modelpackage-modelpackagestatusdetails)
     */
    override fun modelPackageStatusDetails(): Any? = unwrap(this).getModelPackageStatusDetails()

    /**
     * The version number of a versioned model.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelpackage.html#cfn-sagemaker-modelpackage-modelpackageversion)
     */
    override fun modelPackageVersion(): Number? = unwrap(this).getModelPackageVersion()

    /**
     * The Amazon Simple Storage Service path where the sample payload are stored.
     *
     * This path must point to a single gzip compressed tar archive (.tar.gz suffix).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelpackage.html#cfn-sagemaker-modelpackage-samplepayloadurl)
     */
    override fun samplePayloadUrl(): String? = unwrap(this).getSamplePayloadUrl()

    /**
     * Indicates if you want to skip model validation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelpackage.html#cfn-sagemaker-modelpackage-skipmodelvalidation)
     */
    override fun skipModelValidation(): String? = unwrap(this).getSkipModelValidation()

    /**
     * A list of algorithms that were used to create a model package.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelpackage.html#cfn-sagemaker-modelpackage-sourcealgorithmspecification)
     */
    override fun sourceAlgorithmSpecification(): Any? =
        unwrap(this).getSourceAlgorithmSpecification()

    /**
     * A list of the tags associated with the model package.
     *
     * For more information, see [Tagging AWS
     * resources](https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html) in the *AWS General
     * Reference Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelpackage.html#cfn-sagemaker-modelpackage-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * The machine learning task your model package accomplishes.
     *
     * Common machine learning tasks include object detection and image classification.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelpackage.html#cfn-sagemaker-modelpackage-task)
     */
    override fun task(): String? = unwrap(this).getTask()

    /**
     * Specifies batch transform jobs that SageMaker runs to validate your model package.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelpackage.html#cfn-sagemaker-modelpackage-validationspecification)
     */
    override fun validationSpecification(): Any? = unwrap(this).getValidationSpecification()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnModelPackageProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelPackageProps):
        CfnModelPackageProps = CdkObjectWrappers.wrap(cdkObject) as CfnModelPackageProps

    internal fun unwrap(wrapped: CfnModelPackageProps):
        software.amazon.awscdk.services.sagemaker.CfnModelPackageProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.sagemaker.CfnModelPackageProps
  }
}
