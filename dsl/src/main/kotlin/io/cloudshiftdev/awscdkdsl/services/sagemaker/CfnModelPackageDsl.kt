@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.sagemaker

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
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
import software.constructs.Construct

/**
 * A versioned model that can be deployed for SageMaker inference.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sagemaker.*;
 * Object modelInput;
 * CfnModelPackage cfnModelPackage = CfnModelPackage.Builder.create(this, "MyCfnModelPackage")
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
public class CfnModelPackageDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnModelPackage.Builder = CfnModelPackage.Builder.create(scope, id)

    private val _additionalInferenceSpecifications: MutableList<Any> = mutableListOf()

    private val _additionalInferenceSpecificationsToAdd: MutableList<Any> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * An array of additional Inference Specification objects.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelpackage.html#cfn-sagemaker-modelpackage-additionalinferencespecifications)
     *
     * @param additionalInferenceSpecifications An array of additional Inference Specification
     *   objects.
     */
    public fun additionalInferenceSpecifications(vararg additionalInferenceSpecifications: Any) {
        _additionalInferenceSpecifications.addAll(listOf(*additionalInferenceSpecifications))
    }

    /**
     * An array of additional Inference Specification objects.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelpackage.html#cfn-sagemaker-modelpackage-additionalinferencespecifications)
     *
     * @param additionalInferenceSpecifications An array of additional Inference Specification
     *   objects.
     */
    public fun additionalInferenceSpecifications(
        additionalInferenceSpecifications: Collection<Any>
    ) {
        _additionalInferenceSpecifications.addAll(additionalInferenceSpecifications)
    }

    /**
     * An array of additional Inference Specification objects.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelpackage.html#cfn-sagemaker-modelpackage-additionalinferencespecifications)
     *
     * @param additionalInferenceSpecifications An array of additional Inference Specification
     *   objects.
     */
    public fun additionalInferenceSpecifications(additionalInferenceSpecifications: IResolvable) {
        cdkBuilder.additionalInferenceSpecifications(additionalInferenceSpecifications)
    }

    /**
     * An array of additional Inference Specification objects to be added to the existing array.
     *
     * The total number of additional Inference Specification objects cannot exceed 15. Each
     * additional Inference Specification object specifies artifacts based on this model package
     * that can be used on inference endpoints. Generally used with SageMaker Neo to store the
     * compiled artifacts.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelpackage.html#cfn-sagemaker-modelpackage-additionalinferencespecificationstoadd)
     *
     * @param additionalInferenceSpecificationsToAdd An array of additional Inference Specification
     *   objects to be added to the existing array.
     */
    public fun additionalInferenceSpecificationsToAdd(
        vararg additionalInferenceSpecificationsToAdd: Any
    ) {
        _additionalInferenceSpecificationsToAdd.addAll(
            listOf(*additionalInferenceSpecificationsToAdd)
        )
    }

    /**
     * An array of additional Inference Specification objects to be added to the existing array.
     *
     * The total number of additional Inference Specification objects cannot exceed 15. Each
     * additional Inference Specification object specifies artifacts based on this model package
     * that can be used on inference endpoints. Generally used with SageMaker Neo to store the
     * compiled artifacts.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelpackage.html#cfn-sagemaker-modelpackage-additionalinferencespecificationstoadd)
     *
     * @param additionalInferenceSpecificationsToAdd An array of additional Inference Specification
     *   objects to be added to the existing array.
     */
    public fun additionalInferenceSpecificationsToAdd(
        additionalInferenceSpecificationsToAdd: Collection<Any>
    ) {
        _additionalInferenceSpecificationsToAdd.addAll(additionalInferenceSpecificationsToAdd)
    }

    /**
     * An array of additional Inference Specification objects to be added to the existing array.
     *
     * The total number of additional Inference Specification objects cannot exceed 15. Each
     * additional Inference Specification object specifies artifacts based on this model package
     * that can be used on inference endpoints. Generally used with SageMaker Neo to store the
     * compiled artifacts.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelpackage.html#cfn-sagemaker-modelpackage-additionalinferencespecificationstoadd)
     *
     * @param additionalInferenceSpecificationsToAdd An array of additional Inference Specification
     *   objects to be added to the existing array.
     */
    public fun additionalInferenceSpecificationsToAdd(
        additionalInferenceSpecificationsToAdd: IResolvable
    ) {
        cdkBuilder.additionalInferenceSpecificationsToAdd(additionalInferenceSpecificationsToAdd)
    }

    /**
     * A description provided when the model approval is set.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelpackage.html#cfn-sagemaker-modelpackage-approvaldescription)
     *
     * @param approvalDescription A description provided when the model approval is set.
     */
    public fun approvalDescription(approvalDescription: String) {
        cdkBuilder.approvalDescription(approvalDescription)
    }

    /**
     * Whether the model package is to be certified to be listed on AWS Marketplace.
     *
     * For information about listing model packages on AWS Marketplace, see
     * [List Your Algorithm or Model Package on AWS Marketplace](https://docs.aws.amazon.com/sagemaker/latest/dg/sagemaker-mkt-list.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelpackage.html#cfn-sagemaker-modelpackage-certifyformarketplace)
     *
     * @param certifyForMarketplace Whether the model package is to be certified to be listed on AWS
     *   Marketplace.
     */
    public fun certifyForMarketplace(certifyForMarketplace: Boolean) {
        cdkBuilder.certifyForMarketplace(certifyForMarketplace)
    }

    /**
     * Whether the model package is to be certified to be listed on AWS Marketplace.
     *
     * For information about listing model packages on AWS Marketplace, see
     * [List Your Algorithm or Model Package on AWS Marketplace](https://docs.aws.amazon.com/sagemaker/latest/dg/sagemaker-mkt-list.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelpackage.html#cfn-sagemaker-modelpackage-certifyformarketplace)
     *
     * @param certifyForMarketplace Whether the model package is to be certified to be listed on AWS
     *   Marketplace.
     */
    public fun certifyForMarketplace(certifyForMarketplace: IResolvable) {
        cdkBuilder.certifyForMarketplace(certifyForMarketplace)
    }

    /**
     * A unique token that guarantees that the call to this API is idempotent.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelpackage.html#cfn-sagemaker-modelpackage-clienttoken)
     *
     * @param clientToken A unique token that guarantees that the call to this API is idempotent.
     */
    public fun clientToken(clientToken: String) {
        cdkBuilder.clientToken(clientToken)
    }

    /**
     * The metadata properties for the model package.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelpackage.html#cfn-sagemaker-modelpackage-customermetadataproperties)
     *
     * @param customerMetadataProperties The metadata properties for the model package.
     */
    public fun customerMetadataProperties(customerMetadataProperties: Map<String, String>) {
        cdkBuilder.customerMetadataProperties(customerMetadataProperties)
    }

    /**
     * The metadata properties for the model package.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelpackage.html#cfn-sagemaker-modelpackage-customermetadataproperties)
     *
     * @param customerMetadataProperties The metadata properties for the model package.
     */
    public fun customerMetadataProperties(customerMetadataProperties: IResolvable) {
        cdkBuilder.customerMetadataProperties(customerMetadataProperties)
    }

    /**
     * The machine learning domain of your model package and its components.
     *
     * Common machine learning domains include computer vision and natural language processing.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelpackage.html#cfn-sagemaker-modelpackage-domain)
     *
     * @param domain The machine learning domain of your model package and its components.
     */
    public fun domain(domain: String) {
        cdkBuilder.domain(domain)
    }

    /**
     * Represents the drift check baselines that can be used when the model monitor is set using the
     * model package.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelpackage.html#cfn-sagemaker-modelpackage-driftcheckbaselines)
     *
     * @param driftCheckBaselines Represents the drift check baselines that can be used when the
     *   model monitor is set using the model package.
     */
    public fun driftCheckBaselines(driftCheckBaselines: IResolvable) {
        cdkBuilder.driftCheckBaselines(driftCheckBaselines)
    }

    /**
     * Represents the drift check baselines that can be used when the model monitor is set using the
     * model package.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelpackage.html#cfn-sagemaker-modelpackage-driftcheckbaselines)
     *
     * @param driftCheckBaselines Represents the drift check baselines that can be used when the
     *   model monitor is set using the model package.
     */
    public fun driftCheckBaselines(
        driftCheckBaselines: CfnModelPackage.DriftCheckBaselinesProperty
    ) {
        cdkBuilder.driftCheckBaselines(driftCheckBaselines)
    }

    /**
     * Defines how to perform inference generation after a training job is run.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelpackage.html#cfn-sagemaker-modelpackage-inferencespecification)
     *
     * @param inferenceSpecification Defines how to perform inference generation after a training
     *   job is run.
     */
    public fun inferenceSpecification(inferenceSpecification: IResolvable) {
        cdkBuilder.inferenceSpecification(inferenceSpecification)
    }

    /**
     * Defines how to perform inference generation after a training job is run.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelpackage.html#cfn-sagemaker-modelpackage-inferencespecification)
     *
     * @param inferenceSpecification Defines how to perform inference generation after a training
     *   job is run.
     */
    public fun inferenceSpecification(
        inferenceSpecification: CfnModelPackage.InferenceSpecificationProperty
    ) {
        cdkBuilder.inferenceSpecification(inferenceSpecification)
    }

    /**
     * The last time the model package was modified.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelpackage.html#cfn-sagemaker-modelpackage-lastmodifiedtime)
     *
     * @param lastModifiedTime The last time the model package was modified.
     */
    public fun lastModifiedTime(lastModifiedTime: String) {
        cdkBuilder.lastModifiedTime(lastModifiedTime)
    }

    /**
     * Metadata properties of the tracking entity, trial, or trial component.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelpackage.html#cfn-sagemaker-modelpackage-metadataproperties)
     *
     * @param metadataProperties Metadata properties of the tracking entity, trial, or trial
     *   component.
     */
    public fun metadataProperties(metadataProperties: IResolvable) {
        cdkBuilder.metadataProperties(metadataProperties)
    }

    /**
     * Metadata properties of the tracking entity, trial, or trial component.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelpackage.html#cfn-sagemaker-modelpackage-metadataproperties)
     *
     * @param metadataProperties Metadata properties of the tracking entity, trial, or trial
     *   component.
     */
    public fun metadataProperties(metadataProperties: CfnModelPackage.MetadataPropertiesProperty) {
        cdkBuilder.metadataProperties(metadataProperties)
    }

    /**
     * The approval status of the model. This can be one of the following values.
     * * `APPROVED` - The model is approved
     * * `REJECTED` - The model is rejected.
     * * `PENDING_MANUAL_APPROVAL` - The model is waiting for manual approval.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelpackage.html#cfn-sagemaker-modelpackage-modelapprovalstatus)
     *
     * @param modelApprovalStatus The approval status of the model. This can be one of the following
     *   values.
     */
    public fun modelApprovalStatus(modelApprovalStatus: String) {
        cdkBuilder.modelApprovalStatus(modelApprovalStatus)
    }

    /**
     * Metrics for the model.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelpackage.html#cfn-sagemaker-modelpackage-modelmetrics)
     *
     * @param modelMetrics Metrics for the model.
     */
    public fun modelMetrics(modelMetrics: IResolvable) {
        cdkBuilder.modelMetrics(modelMetrics)
    }

    /**
     * Metrics for the model.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelpackage.html#cfn-sagemaker-modelpackage-modelmetrics)
     *
     * @param modelMetrics Metrics for the model.
     */
    public fun modelMetrics(modelMetrics: CfnModelPackage.ModelMetricsProperty) {
        cdkBuilder.modelMetrics(modelMetrics)
    }

    /**
     * The description of the model package.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelpackage.html#cfn-sagemaker-modelpackage-modelpackagedescription)
     *
     * @param modelPackageDescription The description of the model package.
     */
    public fun modelPackageDescription(modelPackageDescription: String) {
        cdkBuilder.modelPackageDescription(modelPackageDescription)
    }

    /**
     * The model group to which the model belongs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelpackage.html#cfn-sagemaker-modelpackage-modelpackagegroupname)
     *
     * @param modelPackageGroupName The model group to which the model belongs.
     */
    public fun modelPackageGroupName(modelPackageGroupName: String) {
        cdkBuilder.modelPackageGroupName(modelPackageGroupName)
    }

    /**
     * The name of the model.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelpackage.html#cfn-sagemaker-modelpackage-modelpackagename)
     *
     * @param modelPackageName The name of the model.
     */
    public fun modelPackageName(modelPackageName: String) {
        cdkBuilder.modelPackageName(modelPackageName)
    }

    /**
     * Specifies the validation and image scan statuses of the model package.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelpackage.html#cfn-sagemaker-modelpackage-modelpackagestatusdetails)
     *
     * @param modelPackageStatusDetails Specifies the validation and image scan statuses of the
     *   model package.
     */
    public fun modelPackageStatusDetails(modelPackageStatusDetails: IResolvable) {
        cdkBuilder.modelPackageStatusDetails(modelPackageStatusDetails)
    }

    /**
     * Specifies the validation and image scan statuses of the model package.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelpackage.html#cfn-sagemaker-modelpackage-modelpackagestatusdetails)
     *
     * @param modelPackageStatusDetails Specifies the validation and image scan statuses of the
     *   model package.
     */
    public fun modelPackageStatusDetails(
        modelPackageStatusDetails: CfnModelPackage.ModelPackageStatusDetailsProperty
    ) {
        cdkBuilder.modelPackageStatusDetails(modelPackageStatusDetails)
    }

    /**
     * The version number of a versioned model.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelpackage.html#cfn-sagemaker-modelpackage-modelpackageversion)
     *
     * @param modelPackageVersion The version number of a versioned model.
     */
    public fun modelPackageVersion(modelPackageVersion: Number) {
        cdkBuilder.modelPackageVersion(modelPackageVersion)
    }

    /**
     * The Amazon Simple Storage Service path where the sample payload are stored.
     *
     * This path must point to a single gzip compressed tar archive (.tar.gz suffix).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelpackage.html#cfn-sagemaker-modelpackage-samplepayloadurl)
     *
     * @param samplePayloadUrl The Amazon Simple Storage Service path where the sample payload are
     *   stored.
     */
    public fun samplePayloadUrl(samplePayloadUrl: String) {
        cdkBuilder.samplePayloadUrl(samplePayloadUrl)
    }

    /**
     * A list of algorithms that were used to create a model package.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelpackage.html#cfn-sagemaker-modelpackage-sourcealgorithmspecification)
     *
     * @param sourceAlgorithmSpecification A list of algorithms that were used to create a model
     *   package.
     */
    public fun sourceAlgorithmSpecification(sourceAlgorithmSpecification: IResolvable) {
        cdkBuilder.sourceAlgorithmSpecification(sourceAlgorithmSpecification)
    }

    /**
     * A list of algorithms that were used to create a model package.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelpackage.html#cfn-sagemaker-modelpackage-sourcealgorithmspecification)
     *
     * @param sourceAlgorithmSpecification A list of algorithms that were used to create a model
     *   package.
     */
    public fun sourceAlgorithmSpecification(
        sourceAlgorithmSpecification: CfnModelPackage.SourceAlgorithmSpecificationProperty
    ) {
        cdkBuilder.sourceAlgorithmSpecification(sourceAlgorithmSpecification)
    }

    /**
     * A list of the tags associated with the model package.
     *
     * For more information, see
     * [Tagging AWS resources](https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html) in
     * the *AWS General Reference Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelpackage.html#cfn-sagemaker-modelpackage-tags)
     *
     * @param tags A list of the tags associated with the model package.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * A list of the tags associated with the model package.
     *
     * For more information, see
     * [Tagging AWS resources](https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html) in
     * the *AWS General Reference Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelpackage.html#cfn-sagemaker-modelpackage-tags)
     *
     * @param tags A list of the tags associated with the model package.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    /**
     * The machine learning task your model package accomplishes.
     *
     * Common machine learning tasks include object detection and image classification.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelpackage.html#cfn-sagemaker-modelpackage-task)
     *
     * @param task The machine learning task your model package accomplishes.
     */
    public fun task(task: String) {
        cdkBuilder.task(task)
    }

    /**
     * Specifies batch transform jobs that SageMaker runs to validate your model package.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelpackage.html#cfn-sagemaker-modelpackage-validationspecification)
     *
     * @param validationSpecification Specifies batch transform jobs that SageMaker runs to validate
     *   your model package.
     */
    public fun validationSpecification(validationSpecification: IResolvable) {
        cdkBuilder.validationSpecification(validationSpecification)
    }

    /**
     * Specifies batch transform jobs that SageMaker runs to validate your model package.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelpackage.html#cfn-sagemaker-modelpackage-validationspecification)
     *
     * @param validationSpecification Specifies batch transform jobs that SageMaker runs to validate
     *   your model package.
     */
    public fun validationSpecification(
        validationSpecification: CfnModelPackage.ValidationSpecificationProperty
    ) {
        cdkBuilder.validationSpecification(validationSpecification)
    }

    public fun build(): CfnModelPackage {
        if (_additionalInferenceSpecifications.isNotEmpty())
            cdkBuilder.additionalInferenceSpecifications(_additionalInferenceSpecifications)
        if (_additionalInferenceSpecificationsToAdd.isNotEmpty())
            cdkBuilder.additionalInferenceSpecificationsToAdd(
                _additionalInferenceSpecificationsToAdd
            )
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
