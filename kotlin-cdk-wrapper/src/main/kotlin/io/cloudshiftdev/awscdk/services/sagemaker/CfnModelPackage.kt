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
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * A versioned model that can be deployed for SageMaker inference.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.sagemaker.*;
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
 * .modelDataSource(ModelDataSourceProperty.builder()
 * .s3DataSource(S3ModelDataSourceProperty.builder()
 * .compressionType("compressionType")
 * .s3DataType("s3DataType")
 * .s3Uri("s3Uri")
 * // the properties below are optional
 * .modelAccessConfig(ModelAccessConfigProperty.builder()
 * .acceptEula(false)
 * .build())
 * .build())
 * .build())
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
 * .modelDataSource(ModelDataSourceProperty.builder()
 * .s3DataSource(S3ModelDataSourceProperty.builder()
 * .compressionType("compressionType")
 * .s3DataType("s3DataType")
 * .s3Uri("s3Uri")
 * // the properties below are optional
 * .modelAccessConfig(ModelAccessConfigProperty.builder()
 * .acceptEula(false)
 * .build())
 * .build())
 * .build())
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
 * .modelDataSource(ModelDataSourceProperty.builder()
 * .s3DataSource(S3ModelDataSourceProperty.builder()
 * .compressionType("compressionType")
 * .s3DataType("s3DataType")
 * .s3Uri("s3Uri")
 * // the properties below are optional
 * .modelAccessConfig(ModelAccessConfigProperty.builder()
 * .acceptEula(false)
 * .build())
 * .build())
 * .build())
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
 * .modelCard(ModelCardProperty.builder()
 * .modelCardContent("modelCardContent")
 * .modelCardStatus("modelCardStatus")
 * .build())
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
 * .securityConfig(SecurityConfigProperty.builder()
 * .kmsKeyId("kmsKeyId")
 * .build())
 * .skipModelValidation("skipModelValidation")
 * .sourceAlgorithmSpecification(SourceAlgorithmSpecificationProperty.builder()
 * .sourceAlgorithms(List.of(SourceAlgorithmProperty.builder()
 * .algorithmName("algorithmName")
 * // the properties below are optional
 * .modelDataUrl("modelDataUrl")
 * .build()))
 * .build())
 * .sourceUri("sourceUri")
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
public open class CfnModelPackage(
  cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelPackage,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggable {
  public constructor(scope: CloudshiftdevConstructsConstruct, id: String) :
      this(software.amazon.awscdk.services.sagemaker.CfnModelPackage(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id)
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnModelPackageProps,
  ) :
      this(software.amazon.awscdk.services.sagemaker.CfnModelPackage(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnModelPackageProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnModelPackageProps.Builder.() -> Unit,
  ) : this(scope, id, CfnModelPackageProps(props)
  )

  /**
   * An array of additional Inference Specification objects.
   */
  public open fun additionalInferenceSpecifications(): Any? =
      unwrap(this).getAdditionalInferenceSpecifications()

  /**
   * An array of additional Inference Specification objects.
   */
  public open fun additionalInferenceSpecifications(`value`: IResolvable) {
    unwrap(this).setAdditionalInferenceSpecifications(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * An array of additional Inference Specification objects.
   */
  public open fun additionalInferenceSpecifications(`value`: List<Any>) {
    unwrap(this).setAdditionalInferenceSpecifications(`value`.map{CdkObjectWrappers.unwrap(it)})
  }

  /**
   * An array of additional Inference Specification objects.
   */
  public open fun additionalInferenceSpecifications(vararg `value`: Any): Unit =
      additionalInferenceSpecifications(`value`.toList())

  /**
   * An array of additional Inference Specification objects to be added to the existing array.
   */
  public open fun additionalInferenceSpecificationsToAdd(): Any? =
      unwrap(this).getAdditionalInferenceSpecificationsToAdd()

  /**
   * An array of additional Inference Specification objects to be added to the existing array.
   */
  public open fun additionalInferenceSpecificationsToAdd(`value`: IResolvable) {
    unwrap(this).setAdditionalInferenceSpecificationsToAdd(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * An array of additional Inference Specification objects to be added to the existing array.
   */
  public open fun additionalInferenceSpecificationsToAdd(`value`: List<Any>) {
    unwrap(this).setAdditionalInferenceSpecificationsToAdd(`value`.map{CdkObjectWrappers.unwrap(it)})
  }

  /**
   * An array of additional Inference Specification objects to be added to the existing array.
   */
  public open fun additionalInferenceSpecificationsToAdd(vararg `value`: Any): Unit =
      additionalInferenceSpecificationsToAdd(`value`.toList())

  /**
   * A description provided when the model approval is set.
   */
  public open fun approvalDescription(): String? = unwrap(this).getApprovalDescription()

  /**
   * A description provided when the model approval is set.
   */
  public open fun approvalDescription(`value`: String) {
    unwrap(this).setApprovalDescription(`value`)
  }

  /**
   * The time that the model package was created.
   */
  public open fun attrCreationTime(): String = unwrap(this).getAttrCreationTime()

  /**
   * The Amazon Resource Name (ARN) of the model package.
   */
  public open fun attrModelPackageArn(): String = unwrap(this).getAttrModelPackageArn()

  /**
   * The status of the model package. This can be one of the following values.
   *
   * * `PENDING` - The model package creation is pending.
   * * `IN_PROGRESS` - The model package is in the process of being created.
   * * `COMPLETED` - The model package was successfully created.
   * * `FAILED` - The model package creation failed.
   * * `DELETING` - The model package is in the process of being deleted.
   */
  public open fun attrModelPackageStatus(): String = unwrap(this).getAttrModelPackageStatus()

  /**
   * Whether the model package is to be certified to be listed on AWS Marketplace.
   */
  public open fun certifyForMarketplace(): Any? = unwrap(this).getCertifyForMarketplace()

  /**
   * Whether the model package is to be certified to be listed on AWS Marketplace.
   */
  public open fun certifyForMarketplace(`value`: Boolean) {
    unwrap(this).setCertifyForMarketplace(`value`)
  }

  /**
   * Whether the model package is to be certified to be listed on AWS Marketplace.
   */
  public open fun certifyForMarketplace(`value`: IResolvable) {
    unwrap(this).setCertifyForMarketplace(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * A unique token that guarantees that the call to this API is idempotent.
   */
  public open fun clientToken(): String? = unwrap(this).getClientToken()

  /**
   * A unique token that guarantees that the call to this API is idempotent.
   */
  public open fun clientToken(`value`: String) {
    unwrap(this).setClientToken(`value`)
  }

  /**
   * The metadata properties for the model package.
   */
  public open fun customerMetadataProperties(): Any? = unwrap(this).getCustomerMetadataProperties()

  /**
   * The metadata properties for the model package.
   */
  public open fun customerMetadataProperties(`value`: IResolvable) {
    unwrap(this).setCustomerMetadataProperties(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The metadata properties for the model package.
   */
  public open fun customerMetadataProperties(`value`: Map<String, String>) {
    unwrap(this).setCustomerMetadataProperties(`value`)
  }

  /**
   * The machine learning domain of your model package and its components.
   */
  public open fun domain(): String? = unwrap(this).getDomain()

  /**
   * The machine learning domain of your model package and its components.
   */
  public open fun domain(`value`: String) {
    unwrap(this).setDomain(`value`)
  }

  /**
   * Represents the drift check baselines that can be used when the model monitor is set using the
   * model package.
   */
  public open fun driftCheckBaselines(): Any? = unwrap(this).getDriftCheckBaselines()

  /**
   * Represents the drift check baselines that can be used when the model monitor is set using the
   * model package.
   */
  public open fun driftCheckBaselines(`value`: IResolvable) {
    unwrap(this).setDriftCheckBaselines(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Represents the drift check baselines that can be used when the model monitor is set using the
   * model package.
   */
  public open fun driftCheckBaselines(`value`: DriftCheckBaselinesProperty) {
    unwrap(this).setDriftCheckBaselines(`value`.let(DriftCheckBaselinesProperty.Companion::unwrap))
  }

  /**
   * Represents the drift check baselines that can be used when the model monitor is set using the
   * model package.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("d01fd3368f0bbdcec61d8ecf1d0a9767efd971f63d3df30affa479f6ad32d949")
  public open fun driftCheckBaselines(`value`: DriftCheckBaselinesProperty.Builder.() -> Unit): Unit
      = driftCheckBaselines(DriftCheckBaselinesProperty(`value`))

  /**
   * Defines how to perform inference generation after a training job is run.
   */
  public open fun inferenceSpecification(): Any? = unwrap(this).getInferenceSpecification()

  /**
   * Defines how to perform inference generation after a training job is run.
   */
  public open fun inferenceSpecification(`value`: IResolvable) {
    unwrap(this).setInferenceSpecification(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Defines how to perform inference generation after a training job is run.
   */
  public open fun inferenceSpecification(`value`: InferenceSpecificationProperty) {
    unwrap(this).setInferenceSpecification(`value`.let(InferenceSpecificationProperty.Companion::unwrap))
  }

  /**
   * Defines how to perform inference generation after a training job is run.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("2d2c3d3762c4b909a9f13e1ccd787820f905d545e9807623e96b0e812f0e4549")
  public open
      fun inferenceSpecification(`value`: InferenceSpecificationProperty.Builder.() -> Unit): Unit =
      inferenceSpecification(InferenceSpecificationProperty(`value`))

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * The last time the model package was modified.
   */
  public open fun lastModifiedTime(): String? = unwrap(this).getLastModifiedTime()

  /**
   * The last time the model package was modified.
   */
  public open fun lastModifiedTime(`value`: String) {
    unwrap(this).setLastModifiedTime(`value`)
  }

  /**
   * Metadata properties of the tracking entity, trial, or trial component.
   */
  public open fun metadataProperties(): Any? = unwrap(this).getMetadataProperties()

  /**
   * Metadata properties of the tracking entity, trial, or trial component.
   */
  public open fun metadataProperties(`value`: IResolvable) {
    unwrap(this).setMetadataProperties(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Metadata properties of the tracking entity, trial, or trial component.
   */
  public open fun metadataProperties(`value`: MetadataPropertiesProperty) {
    unwrap(this).setMetadataProperties(`value`.let(MetadataPropertiesProperty.Companion::unwrap))
  }

  /**
   * Metadata properties of the tracking entity, trial, or trial component.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("d498c70c5f49479794ea3aad6d904b1e15c35e37414ec0ed63fee77a6a0e029e")
  public open fun metadataProperties(`value`: MetadataPropertiesProperty.Builder.() -> Unit): Unit =
      metadataProperties(MetadataPropertiesProperty(`value`))

  /**
   * The approval status of the model.
   *
   * This can be one of the following values.
   */
  public open fun modelApprovalStatus(): String? = unwrap(this).getModelApprovalStatus()

  /**
   * The approval status of the model.
   *
   * This can be one of the following values.
   */
  public open fun modelApprovalStatus(`value`: String) {
    unwrap(this).setModelApprovalStatus(`value`)
  }

  /**
   * An Amazon SageMaker Model Card.
   */
  public open fun modelCard(): Any? = unwrap(this).getModelCard()

  /**
   * An Amazon SageMaker Model Card.
   */
  public open fun modelCard(`value`: IResolvable) {
    unwrap(this).setModelCard(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * An Amazon SageMaker Model Card.
   */
  public open fun modelCard(`value`: ModelCardProperty) {
    unwrap(this).setModelCard(`value`.let(ModelCardProperty.Companion::unwrap))
  }

  /**
   * An Amazon SageMaker Model Card.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("c7792768bc5177e62cc986943655d5818b48ae3507fcb512826f70d463888a3a")
  public open fun modelCard(`value`: ModelCardProperty.Builder.() -> Unit): Unit =
      modelCard(ModelCardProperty(`value`))

  /**
   * Metrics for the model.
   */
  public open fun modelMetrics(): Any? = unwrap(this).getModelMetrics()

  /**
   * Metrics for the model.
   */
  public open fun modelMetrics(`value`: IResolvable) {
    unwrap(this).setModelMetrics(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Metrics for the model.
   */
  public open fun modelMetrics(`value`: ModelMetricsProperty) {
    unwrap(this).setModelMetrics(`value`.let(ModelMetricsProperty.Companion::unwrap))
  }

  /**
   * Metrics for the model.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("94979f7e82bb9745540bce7a16361d26c9c15caa7cf120c9077f8bc87788b015")
  public open fun modelMetrics(`value`: ModelMetricsProperty.Builder.() -> Unit): Unit =
      modelMetrics(ModelMetricsProperty(`value`))

  /**
   * The description of the model package.
   */
  public open fun modelPackageDescription(): String? = unwrap(this).getModelPackageDescription()

  /**
   * The description of the model package.
   */
  public open fun modelPackageDescription(`value`: String) {
    unwrap(this).setModelPackageDescription(`value`)
  }

  /**
   * The model group to which the model belongs.
   */
  public open fun modelPackageGroupName(): String? = unwrap(this).getModelPackageGroupName()

  /**
   * The model group to which the model belongs.
   */
  public open fun modelPackageGroupName(`value`: String) {
    unwrap(this).setModelPackageGroupName(`value`)
  }

  /**
   * The name of the model.
   */
  public open fun modelPackageName(): String? = unwrap(this).getModelPackageName()

  /**
   * The name of the model.
   */
  public open fun modelPackageName(`value`: String) {
    unwrap(this).setModelPackageName(`value`)
  }

  /**
   * Specifies the validation and image scan statuses of the model package.
   */
  public open fun modelPackageStatusDetails(): Any? = unwrap(this).getModelPackageStatusDetails()

  /**
   * Specifies the validation and image scan statuses of the model package.
   */
  public open fun modelPackageStatusDetails(`value`: IResolvable) {
    unwrap(this).setModelPackageStatusDetails(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Specifies the validation and image scan statuses of the model package.
   */
  public open fun modelPackageStatusDetails(`value`: ModelPackageStatusDetailsProperty) {
    unwrap(this).setModelPackageStatusDetails(`value`.let(ModelPackageStatusDetailsProperty.Companion::unwrap))
  }

  /**
   * Specifies the validation and image scan statuses of the model package.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("5f5907dd6a5634c710e72408110136b7a0f0d8a4901ed3f18423e1c8e83ea922")
  public open
      fun modelPackageStatusDetails(`value`: ModelPackageStatusDetailsProperty.Builder.() -> Unit):
      Unit = modelPackageStatusDetails(ModelPackageStatusDetailsProperty(`value`))

  /**
   * The version number of a versioned model.
   */
  public open fun modelPackageVersion(): Number? = unwrap(this).getModelPackageVersion()

  /**
   * The version number of a versioned model.
   */
  public open fun modelPackageVersion(`value`: Number) {
    unwrap(this).setModelPackageVersion(`value`)
  }

  /**
   * The Amazon Simple Storage Service path where the sample payload are stored.
   */
  public open fun samplePayloadUrl(): String? = unwrap(this).getSamplePayloadUrl()

  /**
   * The Amazon Simple Storage Service path where the sample payload are stored.
   */
  public open fun samplePayloadUrl(`value`: String) {
    unwrap(this).setSamplePayloadUrl(`value`)
  }

  /**
   * An optional AWS Key Management Service key to encrypt, decrypt, and re-encrypt model package
   * information for regulated workloads with highly sensitive data.
   */
  public open fun securityConfig(): Any? = unwrap(this).getSecurityConfig()

  /**
   * An optional AWS Key Management Service key to encrypt, decrypt, and re-encrypt model package
   * information for regulated workloads with highly sensitive data.
   */
  public open fun securityConfig(`value`: IResolvable) {
    unwrap(this).setSecurityConfig(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * An optional AWS Key Management Service key to encrypt, decrypt, and re-encrypt model package
   * information for regulated workloads with highly sensitive data.
   */
  public open fun securityConfig(`value`: SecurityConfigProperty) {
    unwrap(this).setSecurityConfig(`value`.let(SecurityConfigProperty.Companion::unwrap))
  }

  /**
   * An optional AWS Key Management Service key to encrypt, decrypt, and re-encrypt model package
   * information for regulated workloads with highly sensitive data.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("8cc9d0d3a4462ff292aca7beec625f3d1835b5ed5faaec7f43ac5844021a9e8b")
  public open fun securityConfig(`value`: SecurityConfigProperty.Builder.() -> Unit): Unit =
      securityConfig(SecurityConfigProperty(`value`))

  /**
   * Indicates if you want to skip model validation.
   */
  public open fun skipModelValidation(): String? = unwrap(this).getSkipModelValidation()

  /**
   * Indicates if you want to skip model validation.
   */
  public open fun skipModelValidation(`value`: String) {
    unwrap(this).setSkipModelValidation(`value`)
  }

  /**
   * A list of algorithms that were used to create a model package.
   */
  public open fun sourceAlgorithmSpecification(): Any? =
      unwrap(this).getSourceAlgorithmSpecification()

  /**
   * A list of algorithms that were used to create a model package.
   */
  public open fun sourceAlgorithmSpecification(`value`: IResolvable) {
    unwrap(this).setSourceAlgorithmSpecification(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * A list of algorithms that were used to create a model package.
   */
  public open fun sourceAlgorithmSpecification(`value`: SourceAlgorithmSpecificationProperty) {
    unwrap(this).setSourceAlgorithmSpecification(`value`.let(SourceAlgorithmSpecificationProperty.Companion::unwrap))
  }

  /**
   * A list of algorithms that were used to create a model package.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("a9e2cef8a14af5cd74d8adb6e4011fd865402eaefe95d53425d7f248f2576db0")
  public open
      fun sourceAlgorithmSpecification(`value`: SourceAlgorithmSpecificationProperty.Builder.() -> Unit):
      Unit = sourceAlgorithmSpecification(SourceAlgorithmSpecificationProperty(`value`))

  /**
   * The URI of the source for the model package.
   */
  public open fun sourceUri(): String? = unwrap(this).getSourceUri()

  /**
   * The URI of the source for the model package.
   */
  public open fun sourceUri(`value`: String) {
    unwrap(this).setSourceUri(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * A list of the tags associated with the model package.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * A list of the tags associated with the model package.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * A list of the tags associated with the model package.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * The machine learning task your model package accomplishes.
   */
  public open fun task(): String? = unwrap(this).getTask()

  /**
   * The machine learning task your model package accomplishes.
   */
  public open fun task(`value`: String) {
    unwrap(this).setTask(`value`)
  }

  /**
   * Specifies batch transform jobs that SageMaker runs to validate your model package.
   */
  public open fun validationSpecification(): Any? = unwrap(this).getValidationSpecification()

  /**
   * Specifies batch transform jobs that SageMaker runs to validate your model package.
   */
  public open fun validationSpecification(`value`: IResolvable) {
    unwrap(this).setValidationSpecification(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Specifies batch transform jobs that SageMaker runs to validate your model package.
   */
  public open fun validationSpecification(`value`: ValidationSpecificationProperty) {
    unwrap(this).setValidationSpecification(`value`.let(ValidationSpecificationProperty.Companion::unwrap))
  }

  /**
   * Specifies batch transform jobs that SageMaker runs to validate your model package.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("164275543bb77010f0687951a1b5558256913cf6caf0a0f0b820d4222e314e3e")
  public open
      fun validationSpecification(`value`: ValidationSpecificationProperty.Builder.() -> Unit): Unit
      = validationSpecification(ValidationSpecificationProperty(`value`))

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.sagemaker.CfnModelPackage].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * An array of additional Inference Specification objects.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelpackage.html#cfn-sagemaker-modelpackage-additionalinferencespecifications)
     * @param additionalInferenceSpecifications An array of additional Inference Specification
     * objects. 
     */
    public fun additionalInferenceSpecifications(additionalInferenceSpecifications: IResolvable)

    /**
     * An array of additional Inference Specification objects.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelpackage.html#cfn-sagemaker-modelpackage-additionalinferencespecifications)
     * @param additionalInferenceSpecifications An array of additional Inference Specification
     * objects. 
     */
    public fun additionalInferenceSpecifications(additionalInferenceSpecifications: List<Any>)

    /**
     * An array of additional Inference Specification objects.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelpackage.html#cfn-sagemaker-modelpackage-additionalinferencespecifications)
     * @param additionalInferenceSpecifications An array of additional Inference Specification
     * objects. 
     */
    public fun additionalInferenceSpecifications(vararg additionalInferenceSpecifications: Any)

    /**
     * An array of additional Inference Specification objects to be added to the existing array.
     *
     * The total number of additional Inference Specification objects cannot exceed 15. Each
     * additional Inference Specification object specifies artifacts based on this model package that
     * can be used on inference endpoints. Generally used with SageMaker Neo to store the compiled
     * artifacts.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelpackage.html#cfn-sagemaker-modelpackage-additionalinferencespecificationstoadd)
     * @param additionalInferenceSpecificationsToAdd An array of additional Inference Specification
     * objects to be added to the existing array. 
     */
    public
        fun additionalInferenceSpecificationsToAdd(additionalInferenceSpecificationsToAdd: IResolvable)

    /**
     * An array of additional Inference Specification objects to be added to the existing array.
     *
     * The total number of additional Inference Specification objects cannot exceed 15. Each
     * additional Inference Specification object specifies artifacts based on this model package that
     * can be used on inference endpoints. Generally used with SageMaker Neo to store the compiled
     * artifacts.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelpackage.html#cfn-sagemaker-modelpackage-additionalinferencespecificationstoadd)
     * @param additionalInferenceSpecificationsToAdd An array of additional Inference Specification
     * objects to be added to the existing array. 
     */
    public
        fun additionalInferenceSpecificationsToAdd(additionalInferenceSpecificationsToAdd: List<Any>)

    /**
     * An array of additional Inference Specification objects to be added to the existing array.
     *
     * The total number of additional Inference Specification objects cannot exceed 15. Each
     * additional Inference Specification object specifies artifacts based on this model package that
     * can be used on inference endpoints. Generally used with SageMaker Neo to store the compiled
     * artifacts.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelpackage.html#cfn-sagemaker-modelpackage-additionalinferencespecificationstoadd)
     * @param additionalInferenceSpecificationsToAdd An array of additional Inference Specification
     * objects to be added to the existing array. 
     */
    public fun additionalInferenceSpecificationsToAdd(vararg
        additionalInferenceSpecificationsToAdd: Any)

    /**
     * A description provided when the model approval is set.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelpackage.html#cfn-sagemaker-modelpackage-approvaldescription)
     * @param approvalDescription A description provided when the model approval is set. 
     */
    public fun approvalDescription(approvalDescription: String)

    /**
     * Whether the model package is to be certified to be listed on AWS Marketplace.
     *
     * For information about listing model packages on AWS Marketplace, see [List Your Algorithm or
     * Model Package on AWS
     * Marketplace](https://docs.aws.amazon.com/sagemaker/latest/dg/sagemaker-mkt-list.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelpackage.html#cfn-sagemaker-modelpackage-certifyformarketplace)
     * @param certifyForMarketplace Whether the model package is to be certified to be listed on AWS
     * Marketplace. 
     */
    public fun certifyForMarketplace(certifyForMarketplace: Boolean)

    /**
     * Whether the model package is to be certified to be listed on AWS Marketplace.
     *
     * For information about listing model packages on AWS Marketplace, see [List Your Algorithm or
     * Model Package on AWS
     * Marketplace](https://docs.aws.amazon.com/sagemaker/latest/dg/sagemaker-mkt-list.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelpackage.html#cfn-sagemaker-modelpackage-certifyformarketplace)
     * @param certifyForMarketplace Whether the model package is to be certified to be listed on AWS
     * Marketplace. 
     */
    public fun certifyForMarketplace(certifyForMarketplace: IResolvable)

    /**
     * A unique token that guarantees that the call to this API is idempotent.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelpackage.html#cfn-sagemaker-modelpackage-clienttoken)
     * @param clientToken A unique token that guarantees that the call to this API is idempotent. 
     */
    public fun clientToken(clientToken: String)

    /**
     * The metadata properties for the model package.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelpackage.html#cfn-sagemaker-modelpackage-customermetadataproperties)
     * @param customerMetadataProperties The metadata properties for the model package. 
     */
    public fun customerMetadataProperties(customerMetadataProperties: IResolvable)

    /**
     * The metadata properties for the model package.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelpackage.html#cfn-sagemaker-modelpackage-customermetadataproperties)
     * @param customerMetadataProperties The metadata properties for the model package. 
     */
    public fun customerMetadataProperties(customerMetadataProperties: Map<String, String>)

    /**
     * The machine learning domain of your model package and its components.
     *
     * Common machine learning domains include computer vision and natural language processing.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelpackage.html#cfn-sagemaker-modelpackage-domain)
     * @param domain The machine learning domain of your model package and its components. 
     */
    public fun domain(domain: String)

    /**
     * Represents the drift check baselines that can be used when the model monitor is set using the
     * model package.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelpackage.html#cfn-sagemaker-modelpackage-driftcheckbaselines)
     * @param driftCheckBaselines Represents the drift check baselines that can be used when the
     * model monitor is set using the model package. 
     */
    public fun driftCheckBaselines(driftCheckBaselines: IResolvable)

    /**
     * Represents the drift check baselines that can be used when the model monitor is set using the
     * model package.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelpackage.html#cfn-sagemaker-modelpackage-driftcheckbaselines)
     * @param driftCheckBaselines Represents the drift check baselines that can be used when the
     * model monitor is set using the model package. 
     */
    public fun driftCheckBaselines(driftCheckBaselines: DriftCheckBaselinesProperty)

    /**
     * Represents the drift check baselines that can be used when the model monitor is set using the
     * model package.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelpackage.html#cfn-sagemaker-modelpackage-driftcheckbaselines)
     * @param driftCheckBaselines Represents the drift check baselines that can be used when the
     * model monitor is set using the model package. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("cd3813ed732be0df3b84a486d67699bbdb8ebf7a0284ad6157146b7e74ebd54a")
    public
        fun driftCheckBaselines(driftCheckBaselines: DriftCheckBaselinesProperty.Builder.() -> Unit)

    /**
     * Defines how to perform inference generation after a training job is run.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelpackage.html#cfn-sagemaker-modelpackage-inferencespecification)
     * @param inferenceSpecification Defines how to perform inference generation after a training
     * job is run. 
     */
    public fun inferenceSpecification(inferenceSpecification: IResolvable)

    /**
     * Defines how to perform inference generation after a training job is run.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelpackage.html#cfn-sagemaker-modelpackage-inferencespecification)
     * @param inferenceSpecification Defines how to perform inference generation after a training
     * job is run. 
     */
    public fun inferenceSpecification(inferenceSpecification: InferenceSpecificationProperty)

    /**
     * Defines how to perform inference generation after a training job is run.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelpackage.html#cfn-sagemaker-modelpackage-inferencespecification)
     * @param inferenceSpecification Defines how to perform inference generation after a training
     * job is run. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("01fe09a95aa538ca8d34a7f48b4200c1cbc009cb7a6b4ff100f6af39051f642c")
    public
        fun inferenceSpecification(inferenceSpecification: InferenceSpecificationProperty.Builder.() -> Unit)

    /**
     * The last time the model package was modified.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelpackage.html#cfn-sagemaker-modelpackage-lastmodifiedtime)
     * @param lastModifiedTime The last time the model package was modified. 
     */
    public fun lastModifiedTime(lastModifiedTime: String)

    /**
     * Metadata properties of the tracking entity, trial, or trial component.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelpackage.html#cfn-sagemaker-modelpackage-metadataproperties)
     * @param metadataProperties Metadata properties of the tracking entity, trial, or trial
     * component. 
     */
    public fun metadataProperties(metadataProperties: IResolvable)

    /**
     * Metadata properties of the tracking entity, trial, or trial component.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelpackage.html#cfn-sagemaker-modelpackage-metadataproperties)
     * @param metadataProperties Metadata properties of the tracking entity, trial, or trial
     * component. 
     */
    public fun metadataProperties(metadataProperties: MetadataPropertiesProperty)

    /**
     * Metadata properties of the tracking entity, trial, or trial component.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelpackage.html#cfn-sagemaker-modelpackage-metadataproperties)
     * @param metadataProperties Metadata properties of the tracking entity, trial, or trial
     * component. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("dfb0ceea10e37a93d7fc3f8ce8fca16f93995a81c01f3ec3e44888d4433ab59e")
    public fun metadataProperties(metadataProperties: MetadataPropertiesProperty.Builder.() -> Unit)

    /**
     * The approval status of the model. This can be one of the following values.
     *
     * * `APPROVED` - The model is approved
     * * `REJECTED` - The model is rejected.
     * * `PENDING_MANUAL_APPROVAL` - The model is waiting for manual approval.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelpackage.html#cfn-sagemaker-modelpackage-modelapprovalstatus)
     * @param modelApprovalStatus The approval status of the model. This can be one of the following
     * values. 
     */
    public fun modelApprovalStatus(modelApprovalStatus: String)

    /**
     * An Amazon SageMaker Model Card.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelpackage.html#cfn-sagemaker-modelpackage-modelcard)
     * @param modelCard An Amazon SageMaker Model Card. 
     */
    public fun modelCard(modelCard: IResolvable)

    /**
     * An Amazon SageMaker Model Card.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelpackage.html#cfn-sagemaker-modelpackage-modelcard)
     * @param modelCard An Amazon SageMaker Model Card. 
     */
    public fun modelCard(modelCard: ModelCardProperty)

    /**
     * An Amazon SageMaker Model Card.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelpackage.html#cfn-sagemaker-modelpackage-modelcard)
     * @param modelCard An Amazon SageMaker Model Card. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8f3a07097c463ce96ceca5f0e2026da3fead0bcaeb969f55487825d8a2a5e85d")
    public fun modelCard(modelCard: ModelCardProperty.Builder.() -> Unit)

    /**
     * Metrics for the model.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelpackage.html#cfn-sagemaker-modelpackage-modelmetrics)
     * @param modelMetrics Metrics for the model. 
     */
    public fun modelMetrics(modelMetrics: IResolvable)

    /**
     * Metrics for the model.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelpackage.html#cfn-sagemaker-modelpackage-modelmetrics)
     * @param modelMetrics Metrics for the model. 
     */
    public fun modelMetrics(modelMetrics: ModelMetricsProperty)

    /**
     * Metrics for the model.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelpackage.html#cfn-sagemaker-modelpackage-modelmetrics)
     * @param modelMetrics Metrics for the model. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("722c220ed8ea051362c8be2e757ad919c1b15f1d4add2b649dc4fa954e150a39")
    public fun modelMetrics(modelMetrics: ModelMetricsProperty.Builder.() -> Unit)

    /**
     * The description of the model package.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelpackage.html#cfn-sagemaker-modelpackage-modelpackagedescription)
     * @param modelPackageDescription The description of the model package. 
     */
    public fun modelPackageDescription(modelPackageDescription: String)

    /**
     * The model group to which the model belongs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelpackage.html#cfn-sagemaker-modelpackage-modelpackagegroupname)
     * @param modelPackageGroupName The model group to which the model belongs. 
     */
    public fun modelPackageGroupName(modelPackageGroupName: String)

    /**
     * The name of the model.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelpackage.html#cfn-sagemaker-modelpackage-modelpackagename)
     * @param modelPackageName The name of the model. 
     */
    public fun modelPackageName(modelPackageName: String)

    /**
     * Specifies the validation and image scan statuses of the model package.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelpackage.html#cfn-sagemaker-modelpackage-modelpackagestatusdetails)
     * @param modelPackageStatusDetails Specifies the validation and image scan statuses of the
     * model package. 
     */
    public fun modelPackageStatusDetails(modelPackageStatusDetails: IResolvable)

    /**
     * Specifies the validation and image scan statuses of the model package.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelpackage.html#cfn-sagemaker-modelpackage-modelpackagestatusdetails)
     * @param modelPackageStatusDetails Specifies the validation and image scan statuses of the
     * model package. 
     */
    public
        fun modelPackageStatusDetails(modelPackageStatusDetails: ModelPackageStatusDetailsProperty)

    /**
     * Specifies the validation and image scan statuses of the model package.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelpackage.html#cfn-sagemaker-modelpackage-modelpackagestatusdetails)
     * @param modelPackageStatusDetails Specifies the validation and image scan statuses of the
     * model package. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fb12f14dcab652f6946953ce722874384ffe72391251a6f4b6cc8d0e273e9e14")
    public
        fun modelPackageStatusDetails(modelPackageStatusDetails: ModelPackageStatusDetailsProperty.Builder.() -> Unit)

    /**
     * The version number of a versioned model.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelpackage.html#cfn-sagemaker-modelpackage-modelpackageversion)
     * @param modelPackageVersion The version number of a versioned model. 
     */
    public fun modelPackageVersion(modelPackageVersion: Number)

    /**
     * The Amazon Simple Storage Service path where the sample payload are stored.
     *
     * This path must point to a single gzip compressed tar archive (.tar.gz suffix).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelpackage.html#cfn-sagemaker-modelpackage-samplepayloadurl)
     * @param samplePayloadUrl The Amazon Simple Storage Service path where the sample payload are
     * stored. 
     */
    public fun samplePayloadUrl(samplePayloadUrl: String)

    /**
     * An optional AWS Key Management Service key to encrypt, decrypt, and re-encrypt model package
     * information for regulated workloads with highly sensitive data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelpackage.html#cfn-sagemaker-modelpackage-securityconfig)
     * @param securityConfig An optional AWS Key Management Service key to encrypt, decrypt, and
     * re-encrypt model package information for regulated workloads with highly sensitive data. 
     */
    public fun securityConfig(securityConfig: IResolvable)

    /**
     * An optional AWS Key Management Service key to encrypt, decrypt, and re-encrypt model package
     * information for regulated workloads with highly sensitive data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelpackage.html#cfn-sagemaker-modelpackage-securityconfig)
     * @param securityConfig An optional AWS Key Management Service key to encrypt, decrypt, and
     * re-encrypt model package information for regulated workloads with highly sensitive data. 
     */
    public fun securityConfig(securityConfig: SecurityConfigProperty)

    /**
     * An optional AWS Key Management Service key to encrypt, decrypt, and re-encrypt model package
     * information for regulated workloads with highly sensitive data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelpackage.html#cfn-sagemaker-modelpackage-securityconfig)
     * @param securityConfig An optional AWS Key Management Service key to encrypt, decrypt, and
     * re-encrypt model package information for regulated workloads with highly sensitive data. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c138c0687b499ad4a45510702b3934cfc915545ba87e5d416b900ad9744cecd9")
    public fun securityConfig(securityConfig: SecurityConfigProperty.Builder.() -> Unit)

    /**
     * Indicates if you want to skip model validation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelpackage.html#cfn-sagemaker-modelpackage-skipmodelvalidation)
     * @param skipModelValidation Indicates if you want to skip model validation. 
     */
    public fun skipModelValidation(skipModelValidation: String)

    /**
     * A list of algorithms that were used to create a model package.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelpackage.html#cfn-sagemaker-modelpackage-sourcealgorithmspecification)
     * @param sourceAlgorithmSpecification A list of algorithms that were used to create a model
     * package. 
     */
    public fun sourceAlgorithmSpecification(sourceAlgorithmSpecification: IResolvable)

    /**
     * A list of algorithms that were used to create a model package.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelpackage.html#cfn-sagemaker-modelpackage-sourcealgorithmspecification)
     * @param sourceAlgorithmSpecification A list of algorithms that were used to create a model
     * package. 
     */
    public
        fun sourceAlgorithmSpecification(sourceAlgorithmSpecification: SourceAlgorithmSpecificationProperty)

    /**
     * A list of algorithms that were used to create a model package.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelpackage.html#cfn-sagemaker-modelpackage-sourcealgorithmspecification)
     * @param sourceAlgorithmSpecification A list of algorithms that were used to create a model
     * package. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e02988bd9476acbdfc852bc4bd36390a8ecae5ba99c2af7e4064054cc3cec056")
    public
        fun sourceAlgorithmSpecification(sourceAlgorithmSpecification: SourceAlgorithmSpecificationProperty.Builder.() -> Unit)

    /**
     * The URI of the source for the model package.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelpackage.html#cfn-sagemaker-modelpackage-sourceuri)
     * @param sourceUri The URI of the source for the model package. 
     */
    public fun sourceUri(sourceUri: String)

    /**
     * A list of the tags associated with the model package.
     *
     * For more information, see [Tagging AWS
     * resources](https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html) in the *AWS General
     * Reference Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelpackage.html#cfn-sagemaker-modelpackage-tags)
     * @param tags A list of the tags associated with the model package. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * A list of the tags associated with the model package.
     *
     * For more information, see [Tagging AWS
     * resources](https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html) in the *AWS General
     * Reference Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelpackage.html#cfn-sagemaker-modelpackage-tags)
     * @param tags A list of the tags associated with the model package. 
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * The machine learning task your model package accomplishes.
     *
     * Common machine learning tasks include object detection and image classification.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelpackage.html#cfn-sagemaker-modelpackage-task)
     * @param task The machine learning task your model package accomplishes. 
     */
    public fun task(task: String)

    /**
     * Specifies batch transform jobs that SageMaker runs to validate your model package.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelpackage.html#cfn-sagemaker-modelpackage-validationspecification)
     * @param validationSpecification Specifies batch transform jobs that SageMaker runs to validate
     * your model package. 
     */
    public fun validationSpecification(validationSpecification: IResolvable)

    /**
     * Specifies batch transform jobs that SageMaker runs to validate your model package.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelpackage.html#cfn-sagemaker-modelpackage-validationspecification)
     * @param validationSpecification Specifies batch transform jobs that SageMaker runs to validate
     * your model package. 
     */
    public fun validationSpecification(validationSpecification: ValidationSpecificationProperty)

    /**
     * Specifies batch transform jobs that SageMaker runs to validate your model package.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelpackage.html#cfn-sagemaker-modelpackage-validationspecification)
     * @param validationSpecification Specifies batch transform jobs that SageMaker runs to validate
     * your model package. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4ee97043ca056526984ecac5319a17d610d8189c4b87d891b3d7e866c96d3df9")
    public
        fun validationSpecification(validationSpecification: ValidationSpecificationProperty.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.sagemaker.CfnModelPackage.Builder =
        software.amazon.awscdk.services.sagemaker.CfnModelPackage.Builder.create(scope, id)

    /**
     * An array of additional Inference Specification objects.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelpackage.html#cfn-sagemaker-modelpackage-additionalinferencespecifications)
     * @param additionalInferenceSpecifications An array of additional Inference Specification
     * objects. 
     */
    override fun additionalInferenceSpecifications(additionalInferenceSpecifications: IResolvable) {
      cdkBuilder.additionalInferenceSpecifications(additionalInferenceSpecifications.let(IResolvable.Companion::unwrap))
    }

    /**
     * An array of additional Inference Specification objects.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelpackage.html#cfn-sagemaker-modelpackage-additionalinferencespecifications)
     * @param additionalInferenceSpecifications An array of additional Inference Specification
     * objects. 
     */
    override fun additionalInferenceSpecifications(additionalInferenceSpecifications: List<Any>) {
      cdkBuilder.additionalInferenceSpecifications(additionalInferenceSpecifications.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * An array of additional Inference Specification objects.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelpackage.html#cfn-sagemaker-modelpackage-additionalinferencespecifications)
     * @param additionalInferenceSpecifications An array of additional Inference Specification
     * objects. 
     */
    override fun additionalInferenceSpecifications(vararg additionalInferenceSpecifications: Any):
        Unit = additionalInferenceSpecifications(additionalInferenceSpecifications.toList())

    /**
     * An array of additional Inference Specification objects to be added to the existing array.
     *
     * The total number of additional Inference Specification objects cannot exceed 15. Each
     * additional Inference Specification object specifies artifacts based on this model package that
     * can be used on inference endpoints. Generally used with SageMaker Neo to store the compiled
     * artifacts.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelpackage.html#cfn-sagemaker-modelpackage-additionalinferencespecificationstoadd)
     * @param additionalInferenceSpecificationsToAdd An array of additional Inference Specification
     * objects to be added to the existing array. 
     */
    override
        fun additionalInferenceSpecificationsToAdd(additionalInferenceSpecificationsToAdd: IResolvable) {
      cdkBuilder.additionalInferenceSpecificationsToAdd(additionalInferenceSpecificationsToAdd.let(IResolvable.Companion::unwrap))
    }

    /**
     * An array of additional Inference Specification objects to be added to the existing array.
     *
     * The total number of additional Inference Specification objects cannot exceed 15. Each
     * additional Inference Specification object specifies artifacts based on this model package that
     * can be used on inference endpoints. Generally used with SageMaker Neo to store the compiled
     * artifacts.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelpackage.html#cfn-sagemaker-modelpackage-additionalinferencespecificationstoadd)
     * @param additionalInferenceSpecificationsToAdd An array of additional Inference Specification
     * objects to be added to the existing array. 
     */
    override
        fun additionalInferenceSpecificationsToAdd(additionalInferenceSpecificationsToAdd: List<Any>) {
      cdkBuilder.additionalInferenceSpecificationsToAdd(additionalInferenceSpecificationsToAdd.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * An array of additional Inference Specification objects to be added to the existing array.
     *
     * The total number of additional Inference Specification objects cannot exceed 15. Each
     * additional Inference Specification object specifies artifacts based on this model package that
     * can be used on inference endpoints. Generally used with SageMaker Neo to store the compiled
     * artifacts.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelpackage.html#cfn-sagemaker-modelpackage-additionalinferencespecificationstoadd)
     * @param additionalInferenceSpecificationsToAdd An array of additional Inference Specification
     * objects to be added to the existing array. 
     */
    override fun additionalInferenceSpecificationsToAdd(vararg
        additionalInferenceSpecificationsToAdd: Any): Unit =
        additionalInferenceSpecificationsToAdd(additionalInferenceSpecificationsToAdd.toList())

    /**
     * A description provided when the model approval is set.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelpackage.html#cfn-sagemaker-modelpackage-approvaldescription)
     * @param approvalDescription A description provided when the model approval is set. 
     */
    override fun approvalDescription(approvalDescription: String) {
      cdkBuilder.approvalDescription(approvalDescription)
    }

    /**
     * Whether the model package is to be certified to be listed on AWS Marketplace.
     *
     * For information about listing model packages on AWS Marketplace, see [List Your Algorithm or
     * Model Package on AWS
     * Marketplace](https://docs.aws.amazon.com/sagemaker/latest/dg/sagemaker-mkt-list.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelpackage.html#cfn-sagemaker-modelpackage-certifyformarketplace)
     * @param certifyForMarketplace Whether the model package is to be certified to be listed on AWS
     * Marketplace. 
     */
    override fun certifyForMarketplace(certifyForMarketplace: Boolean) {
      cdkBuilder.certifyForMarketplace(certifyForMarketplace)
    }

    /**
     * Whether the model package is to be certified to be listed on AWS Marketplace.
     *
     * For information about listing model packages on AWS Marketplace, see [List Your Algorithm or
     * Model Package on AWS
     * Marketplace](https://docs.aws.amazon.com/sagemaker/latest/dg/sagemaker-mkt-list.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelpackage.html#cfn-sagemaker-modelpackage-certifyformarketplace)
     * @param certifyForMarketplace Whether the model package is to be certified to be listed on AWS
     * Marketplace. 
     */
    override fun certifyForMarketplace(certifyForMarketplace: IResolvable) {
      cdkBuilder.certifyForMarketplace(certifyForMarketplace.let(IResolvable.Companion::unwrap))
    }

    /**
     * A unique token that guarantees that the call to this API is idempotent.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelpackage.html#cfn-sagemaker-modelpackage-clienttoken)
     * @param clientToken A unique token that guarantees that the call to this API is idempotent. 
     */
    override fun clientToken(clientToken: String) {
      cdkBuilder.clientToken(clientToken)
    }

    /**
     * The metadata properties for the model package.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelpackage.html#cfn-sagemaker-modelpackage-customermetadataproperties)
     * @param customerMetadataProperties The metadata properties for the model package. 
     */
    override fun customerMetadataProperties(customerMetadataProperties: IResolvable) {
      cdkBuilder.customerMetadataProperties(customerMetadataProperties.let(IResolvable.Companion::unwrap))
    }

    /**
     * The metadata properties for the model package.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelpackage.html#cfn-sagemaker-modelpackage-customermetadataproperties)
     * @param customerMetadataProperties The metadata properties for the model package. 
     */
    override fun customerMetadataProperties(customerMetadataProperties: Map<String, String>) {
      cdkBuilder.customerMetadataProperties(customerMetadataProperties)
    }

    /**
     * The machine learning domain of your model package and its components.
     *
     * Common machine learning domains include computer vision and natural language processing.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelpackage.html#cfn-sagemaker-modelpackage-domain)
     * @param domain The machine learning domain of your model package and its components. 
     */
    override fun domain(domain: String) {
      cdkBuilder.domain(domain)
    }

    /**
     * Represents the drift check baselines that can be used when the model monitor is set using the
     * model package.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelpackage.html#cfn-sagemaker-modelpackage-driftcheckbaselines)
     * @param driftCheckBaselines Represents the drift check baselines that can be used when the
     * model monitor is set using the model package. 
     */
    override fun driftCheckBaselines(driftCheckBaselines: IResolvable) {
      cdkBuilder.driftCheckBaselines(driftCheckBaselines.let(IResolvable.Companion::unwrap))
    }

    /**
     * Represents the drift check baselines that can be used when the model monitor is set using the
     * model package.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelpackage.html#cfn-sagemaker-modelpackage-driftcheckbaselines)
     * @param driftCheckBaselines Represents the drift check baselines that can be used when the
     * model monitor is set using the model package. 
     */
    override fun driftCheckBaselines(driftCheckBaselines: DriftCheckBaselinesProperty) {
      cdkBuilder.driftCheckBaselines(driftCheckBaselines.let(DriftCheckBaselinesProperty.Companion::unwrap))
    }

    /**
     * Represents the drift check baselines that can be used when the model monitor is set using the
     * model package.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelpackage.html#cfn-sagemaker-modelpackage-driftcheckbaselines)
     * @param driftCheckBaselines Represents the drift check baselines that can be used when the
     * model monitor is set using the model package. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("cd3813ed732be0df3b84a486d67699bbdb8ebf7a0284ad6157146b7e74ebd54a")
    override
        fun driftCheckBaselines(driftCheckBaselines: DriftCheckBaselinesProperty.Builder.() -> Unit):
        Unit = driftCheckBaselines(DriftCheckBaselinesProperty(driftCheckBaselines))

    /**
     * Defines how to perform inference generation after a training job is run.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelpackage.html#cfn-sagemaker-modelpackage-inferencespecification)
     * @param inferenceSpecification Defines how to perform inference generation after a training
     * job is run. 
     */
    override fun inferenceSpecification(inferenceSpecification: IResolvable) {
      cdkBuilder.inferenceSpecification(inferenceSpecification.let(IResolvable.Companion::unwrap))
    }

    /**
     * Defines how to perform inference generation after a training job is run.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelpackage.html#cfn-sagemaker-modelpackage-inferencespecification)
     * @param inferenceSpecification Defines how to perform inference generation after a training
     * job is run. 
     */
    override fun inferenceSpecification(inferenceSpecification: InferenceSpecificationProperty) {
      cdkBuilder.inferenceSpecification(inferenceSpecification.let(InferenceSpecificationProperty.Companion::unwrap))
    }

    /**
     * Defines how to perform inference generation after a training job is run.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelpackage.html#cfn-sagemaker-modelpackage-inferencespecification)
     * @param inferenceSpecification Defines how to perform inference generation after a training
     * job is run. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("01fe09a95aa538ca8d34a7f48b4200c1cbc009cb7a6b4ff100f6af39051f642c")
    override
        fun inferenceSpecification(inferenceSpecification: InferenceSpecificationProperty.Builder.() -> Unit):
        Unit = inferenceSpecification(InferenceSpecificationProperty(inferenceSpecification))

    /**
     * The last time the model package was modified.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelpackage.html#cfn-sagemaker-modelpackage-lastmodifiedtime)
     * @param lastModifiedTime The last time the model package was modified. 
     */
    override fun lastModifiedTime(lastModifiedTime: String) {
      cdkBuilder.lastModifiedTime(lastModifiedTime)
    }

    /**
     * Metadata properties of the tracking entity, trial, or trial component.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelpackage.html#cfn-sagemaker-modelpackage-metadataproperties)
     * @param metadataProperties Metadata properties of the tracking entity, trial, or trial
     * component. 
     */
    override fun metadataProperties(metadataProperties: IResolvable) {
      cdkBuilder.metadataProperties(metadataProperties.let(IResolvable.Companion::unwrap))
    }

    /**
     * Metadata properties of the tracking entity, trial, or trial component.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelpackage.html#cfn-sagemaker-modelpackage-metadataproperties)
     * @param metadataProperties Metadata properties of the tracking entity, trial, or trial
     * component. 
     */
    override fun metadataProperties(metadataProperties: MetadataPropertiesProperty) {
      cdkBuilder.metadataProperties(metadataProperties.let(MetadataPropertiesProperty.Companion::unwrap))
    }

    /**
     * Metadata properties of the tracking entity, trial, or trial component.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelpackage.html#cfn-sagemaker-modelpackage-metadataproperties)
     * @param metadataProperties Metadata properties of the tracking entity, trial, or trial
     * component. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("dfb0ceea10e37a93d7fc3f8ce8fca16f93995a81c01f3ec3e44888d4433ab59e")
    override
        fun metadataProperties(metadataProperties: MetadataPropertiesProperty.Builder.() -> Unit):
        Unit = metadataProperties(MetadataPropertiesProperty(metadataProperties))

    /**
     * The approval status of the model. This can be one of the following values.
     *
     * * `APPROVED` - The model is approved
     * * `REJECTED` - The model is rejected.
     * * `PENDING_MANUAL_APPROVAL` - The model is waiting for manual approval.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelpackage.html#cfn-sagemaker-modelpackage-modelapprovalstatus)
     * @param modelApprovalStatus The approval status of the model. This can be one of the following
     * values. 
     */
    override fun modelApprovalStatus(modelApprovalStatus: String) {
      cdkBuilder.modelApprovalStatus(modelApprovalStatus)
    }

    /**
     * An Amazon SageMaker Model Card.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelpackage.html#cfn-sagemaker-modelpackage-modelcard)
     * @param modelCard An Amazon SageMaker Model Card. 
     */
    override fun modelCard(modelCard: IResolvable) {
      cdkBuilder.modelCard(modelCard.let(IResolvable.Companion::unwrap))
    }

    /**
     * An Amazon SageMaker Model Card.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelpackage.html#cfn-sagemaker-modelpackage-modelcard)
     * @param modelCard An Amazon SageMaker Model Card. 
     */
    override fun modelCard(modelCard: ModelCardProperty) {
      cdkBuilder.modelCard(modelCard.let(ModelCardProperty.Companion::unwrap))
    }

    /**
     * An Amazon SageMaker Model Card.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelpackage.html#cfn-sagemaker-modelpackage-modelcard)
     * @param modelCard An Amazon SageMaker Model Card. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8f3a07097c463ce96ceca5f0e2026da3fead0bcaeb969f55487825d8a2a5e85d")
    override fun modelCard(modelCard: ModelCardProperty.Builder.() -> Unit): Unit =
        modelCard(ModelCardProperty(modelCard))

    /**
     * Metrics for the model.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelpackage.html#cfn-sagemaker-modelpackage-modelmetrics)
     * @param modelMetrics Metrics for the model. 
     */
    override fun modelMetrics(modelMetrics: IResolvable) {
      cdkBuilder.modelMetrics(modelMetrics.let(IResolvable.Companion::unwrap))
    }

    /**
     * Metrics for the model.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelpackage.html#cfn-sagemaker-modelpackage-modelmetrics)
     * @param modelMetrics Metrics for the model. 
     */
    override fun modelMetrics(modelMetrics: ModelMetricsProperty) {
      cdkBuilder.modelMetrics(modelMetrics.let(ModelMetricsProperty.Companion::unwrap))
    }

    /**
     * Metrics for the model.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelpackage.html#cfn-sagemaker-modelpackage-modelmetrics)
     * @param modelMetrics Metrics for the model. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("722c220ed8ea051362c8be2e757ad919c1b15f1d4add2b649dc4fa954e150a39")
    override fun modelMetrics(modelMetrics: ModelMetricsProperty.Builder.() -> Unit): Unit =
        modelMetrics(ModelMetricsProperty(modelMetrics))

    /**
     * The description of the model package.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelpackage.html#cfn-sagemaker-modelpackage-modelpackagedescription)
     * @param modelPackageDescription The description of the model package. 
     */
    override fun modelPackageDescription(modelPackageDescription: String) {
      cdkBuilder.modelPackageDescription(modelPackageDescription)
    }

    /**
     * The model group to which the model belongs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelpackage.html#cfn-sagemaker-modelpackage-modelpackagegroupname)
     * @param modelPackageGroupName The model group to which the model belongs. 
     */
    override fun modelPackageGroupName(modelPackageGroupName: String) {
      cdkBuilder.modelPackageGroupName(modelPackageGroupName)
    }

    /**
     * The name of the model.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelpackage.html#cfn-sagemaker-modelpackage-modelpackagename)
     * @param modelPackageName The name of the model. 
     */
    override fun modelPackageName(modelPackageName: String) {
      cdkBuilder.modelPackageName(modelPackageName)
    }

    /**
     * Specifies the validation and image scan statuses of the model package.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelpackage.html#cfn-sagemaker-modelpackage-modelpackagestatusdetails)
     * @param modelPackageStatusDetails Specifies the validation and image scan statuses of the
     * model package. 
     */
    override fun modelPackageStatusDetails(modelPackageStatusDetails: IResolvable) {
      cdkBuilder.modelPackageStatusDetails(modelPackageStatusDetails.let(IResolvable.Companion::unwrap))
    }

    /**
     * Specifies the validation and image scan statuses of the model package.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelpackage.html#cfn-sagemaker-modelpackage-modelpackagestatusdetails)
     * @param modelPackageStatusDetails Specifies the validation and image scan statuses of the
     * model package. 
     */
    override
        fun modelPackageStatusDetails(modelPackageStatusDetails: ModelPackageStatusDetailsProperty) {
      cdkBuilder.modelPackageStatusDetails(modelPackageStatusDetails.let(ModelPackageStatusDetailsProperty.Companion::unwrap))
    }

    /**
     * Specifies the validation and image scan statuses of the model package.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelpackage.html#cfn-sagemaker-modelpackage-modelpackagestatusdetails)
     * @param modelPackageStatusDetails Specifies the validation and image scan statuses of the
     * model package. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fb12f14dcab652f6946953ce722874384ffe72391251a6f4b6cc8d0e273e9e14")
    override
        fun modelPackageStatusDetails(modelPackageStatusDetails: ModelPackageStatusDetailsProperty.Builder.() -> Unit):
        Unit =
        modelPackageStatusDetails(ModelPackageStatusDetailsProperty(modelPackageStatusDetails))

    /**
     * The version number of a versioned model.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelpackage.html#cfn-sagemaker-modelpackage-modelpackageversion)
     * @param modelPackageVersion The version number of a versioned model. 
     */
    override fun modelPackageVersion(modelPackageVersion: Number) {
      cdkBuilder.modelPackageVersion(modelPackageVersion)
    }

    /**
     * The Amazon Simple Storage Service path where the sample payload are stored.
     *
     * This path must point to a single gzip compressed tar archive (.tar.gz suffix).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelpackage.html#cfn-sagemaker-modelpackage-samplepayloadurl)
     * @param samplePayloadUrl The Amazon Simple Storage Service path where the sample payload are
     * stored. 
     */
    override fun samplePayloadUrl(samplePayloadUrl: String) {
      cdkBuilder.samplePayloadUrl(samplePayloadUrl)
    }

    /**
     * An optional AWS Key Management Service key to encrypt, decrypt, and re-encrypt model package
     * information for regulated workloads with highly sensitive data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelpackage.html#cfn-sagemaker-modelpackage-securityconfig)
     * @param securityConfig An optional AWS Key Management Service key to encrypt, decrypt, and
     * re-encrypt model package information for regulated workloads with highly sensitive data. 
     */
    override fun securityConfig(securityConfig: IResolvable) {
      cdkBuilder.securityConfig(securityConfig.let(IResolvable.Companion::unwrap))
    }

    /**
     * An optional AWS Key Management Service key to encrypt, decrypt, and re-encrypt model package
     * information for regulated workloads with highly sensitive data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelpackage.html#cfn-sagemaker-modelpackage-securityconfig)
     * @param securityConfig An optional AWS Key Management Service key to encrypt, decrypt, and
     * re-encrypt model package information for regulated workloads with highly sensitive data. 
     */
    override fun securityConfig(securityConfig: SecurityConfigProperty) {
      cdkBuilder.securityConfig(securityConfig.let(SecurityConfigProperty.Companion::unwrap))
    }

    /**
     * An optional AWS Key Management Service key to encrypt, decrypt, and re-encrypt model package
     * information for regulated workloads with highly sensitive data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelpackage.html#cfn-sagemaker-modelpackage-securityconfig)
     * @param securityConfig An optional AWS Key Management Service key to encrypt, decrypt, and
     * re-encrypt model package information for regulated workloads with highly sensitive data. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c138c0687b499ad4a45510702b3934cfc915545ba87e5d416b900ad9744cecd9")
    override fun securityConfig(securityConfig: SecurityConfigProperty.Builder.() -> Unit): Unit =
        securityConfig(SecurityConfigProperty(securityConfig))

    /**
     * Indicates if you want to skip model validation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelpackage.html#cfn-sagemaker-modelpackage-skipmodelvalidation)
     * @param skipModelValidation Indicates if you want to skip model validation. 
     */
    override fun skipModelValidation(skipModelValidation: String) {
      cdkBuilder.skipModelValidation(skipModelValidation)
    }

    /**
     * A list of algorithms that were used to create a model package.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelpackage.html#cfn-sagemaker-modelpackage-sourcealgorithmspecification)
     * @param sourceAlgorithmSpecification A list of algorithms that were used to create a model
     * package. 
     */
    override fun sourceAlgorithmSpecification(sourceAlgorithmSpecification: IResolvable) {
      cdkBuilder.sourceAlgorithmSpecification(sourceAlgorithmSpecification.let(IResolvable.Companion::unwrap))
    }

    /**
     * A list of algorithms that were used to create a model package.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelpackage.html#cfn-sagemaker-modelpackage-sourcealgorithmspecification)
     * @param sourceAlgorithmSpecification A list of algorithms that were used to create a model
     * package. 
     */
    override
        fun sourceAlgorithmSpecification(sourceAlgorithmSpecification: SourceAlgorithmSpecificationProperty) {
      cdkBuilder.sourceAlgorithmSpecification(sourceAlgorithmSpecification.let(SourceAlgorithmSpecificationProperty.Companion::unwrap))
    }

    /**
     * A list of algorithms that were used to create a model package.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelpackage.html#cfn-sagemaker-modelpackage-sourcealgorithmspecification)
     * @param sourceAlgorithmSpecification A list of algorithms that were used to create a model
     * package. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e02988bd9476acbdfc852bc4bd36390a8ecae5ba99c2af7e4064054cc3cec056")
    override
        fun sourceAlgorithmSpecification(sourceAlgorithmSpecification: SourceAlgorithmSpecificationProperty.Builder.() -> Unit):
        Unit =
        sourceAlgorithmSpecification(SourceAlgorithmSpecificationProperty(sourceAlgorithmSpecification))

    /**
     * The URI of the source for the model package.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelpackage.html#cfn-sagemaker-modelpackage-sourceuri)
     * @param sourceUri The URI of the source for the model package. 
     */
    override fun sourceUri(sourceUri: String) {
      cdkBuilder.sourceUri(sourceUri)
    }

    /**
     * A list of the tags associated with the model package.
     *
     * For more information, see [Tagging AWS
     * resources](https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html) in the *AWS General
     * Reference Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelpackage.html#cfn-sagemaker-modelpackage-tags)
     * @param tags A list of the tags associated with the model package. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * A list of the tags associated with the model package.
     *
     * For more information, see [Tagging AWS
     * resources](https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html) in the *AWS General
     * Reference Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelpackage.html#cfn-sagemaker-modelpackage-tags)
     * @param tags A list of the tags associated with the model package. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * The machine learning task your model package accomplishes.
     *
     * Common machine learning tasks include object detection and image classification.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelpackage.html#cfn-sagemaker-modelpackage-task)
     * @param task The machine learning task your model package accomplishes. 
     */
    override fun task(task: String) {
      cdkBuilder.task(task)
    }

    /**
     * Specifies batch transform jobs that SageMaker runs to validate your model package.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelpackage.html#cfn-sagemaker-modelpackage-validationspecification)
     * @param validationSpecification Specifies batch transform jobs that SageMaker runs to validate
     * your model package. 
     */
    override fun validationSpecification(validationSpecification: IResolvable) {
      cdkBuilder.validationSpecification(validationSpecification.let(IResolvable.Companion::unwrap))
    }

    /**
     * Specifies batch transform jobs that SageMaker runs to validate your model package.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelpackage.html#cfn-sagemaker-modelpackage-validationspecification)
     * @param validationSpecification Specifies batch transform jobs that SageMaker runs to validate
     * your model package. 
     */
    override fun validationSpecification(validationSpecification: ValidationSpecificationProperty) {
      cdkBuilder.validationSpecification(validationSpecification.let(ValidationSpecificationProperty.Companion::unwrap))
    }

    /**
     * Specifies batch transform jobs that SageMaker runs to validate your model package.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelpackage.html#cfn-sagemaker-modelpackage-validationspecification)
     * @param validationSpecification Specifies batch transform jobs that SageMaker runs to validate
     * your model package. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4ee97043ca056526984ecac5319a17d610d8189c4b87d891b3d7e866c96d3df9")
    override
        fun validationSpecification(validationSpecification: ValidationSpecificationProperty.Builder.() -> Unit):
        Unit = validationSpecification(ValidationSpecificationProperty(validationSpecification))

    public fun build(): software.amazon.awscdk.services.sagemaker.CfnModelPackage =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.sagemaker.CfnModelPackage.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnModelPackage {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnModelPackage(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelPackage):
        CfnModelPackage = CfnModelPackage(cdkObject)

    internal fun unwrap(wrapped: CfnModelPackage):
        software.amazon.awscdk.services.sagemaker.CfnModelPackage = wrapped.cdkObject as
        software.amazon.awscdk.services.sagemaker.CfnModelPackage
  }

  /**
   * A structure of additional Inference Specification.
   *
   * Additional Inference Specification specifies details about inference jobs that can be run with
   * models based on this model package
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sagemaker.*;
   * Object modelInput;
   * AdditionalInferenceSpecificationDefinitionProperty
   * additionalInferenceSpecificationDefinitionProperty =
   * AdditionalInferenceSpecificationDefinitionProperty.builder()
   * .containers(List.of(ModelPackageContainerDefinitionProperty.builder()
   * .image("image")
   * // the properties below are optional
   * .containerHostname("containerHostname")
   * .environment(Map.of(
   * "environmentKey", "environment"))
   * .framework("framework")
   * .frameworkVersion("frameworkVersion")
   * .imageDigest("imageDigest")
   * .modelDataSource(ModelDataSourceProperty.builder()
   * .s3DataSource(S3ModelDataSourceProperty.builder()
   * .compressionType("compressionType")
   * .s3DataType("s3DataType")
   * .s3Uri("s3Uri")
   * // the properties below are optional
   * .modelAccessConfig(ModelAccessConfigProperty.builder()
   * .acceptEula(false)
   * .build())
   * .build())
   * .build())
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-additionalinferencespecificationdefinition.html)
   */
  public interface AdditionalInferenceSpecificationDefinitionProperty {
    /**
     * The Amazon ECR registry path of the Docker image that contains the inference code.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-additionalinferencespecificationdefinition.html#cfn-sagemaker-modelpackage-additionalinferencespecificationdefinition-containers)
     */
    public fun containers(): Any

    /**
     * A description of the additional Inference specification.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-additionalinferencespecificationdefinition.html#cfn-sagemaker-modelpackage-additionalinferencespecificationdefinition-description)
     */
    public fun description(): String? = unwrap(this).getDescription()

    /**
     * A unique name to identify the additional inference specification.
     *
     * The name must be unique within the list of your additional inference specifications for a
     * particular model package.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-additionalinferencespecificationdefinition.html#cfn-sagemaker-modelpackage-additionalinferencespecificationdefinition-name)
     */
    public fun name(): String

    /**
     * The supported MIME types for the input data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-additionalinferencespecificationdefinition.html#cfn-sagemaker-modelpackage-additionalinferencespecificationdefinition-supportedcontenttypes)
     */
    public fun supportedContentTypes(): List<String> = unwrap(this).getSupportedContentTypes() ?:
        emptyList()

    /**
     * A list of the instance types that are used to generate inferences in real-time.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-additionalinferencespecificationdefinition.html#cfn-sagemaker-modelpackage-additionalinferencespecificationdefinition-supportedrealtimeinferenceinstancetypes)
     */
    public fun supportedRealtimeInferenceInstanceTypes(): List<String> =
        unwrap(this).getSupportedRealtimeInferenceInstanceTypes() ?: emptyList()

    /**
     * The supported MIME types for the output data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-additionalinferencespecificationdefinition.html#cfn-sagemaker-modelpackage-additionalinferencespecificationdefinition-supportedresponsemimetypes)
     */
    public fun supportedResponseMimeTypes(): List<String> =
        unwrap(this).getSupportedResponseMimeTypes() ?: emptyList()

    /**
     * A list of the instance types on which a transformation job can be run or on which an endpoint
     * can be deployed.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-additionalinferencespecificationdefinition.html#cfn-sagemaker-modelpackage-additionalinferencespecificationdefinition-supportedtransforminstancetypes)
     */
    public fun supportedTransformInstanceTypes(): List<String> =
        unwrap(this).getSupportedTransformInstanceTypes() ?: emptyList()

    /**
     * A builder for [AdditionalInferenceSpecificationDefinitionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param containers The Amazon ECR registry path of the Docker image that contains the
       * inference code. 
       */
      public fun containers(containers: IResolvable)

      /**
       * @param containers The Amazon ECR registry path of the Docker image that contains the
       * inference code. 
       */
      public fun containers(containers: List<Any>)

      /**
       * @param containers The Amazon ECR registry path of the Docker image that contains the
       * inference code. 
       */
      public fun containers(vararg containers: Any)

      /**
       * @param description A description of the additional Inference specification.
       */
      public fun description(description: String)

      /**
       * @param name A unique name to identify the additional inference specification. 
       * The name must be unique within the list of your additional inference specifications for a
       * particular model package.
       */
      public fun name(name: String)

      /**
       * @param supportedContentTypes The supported MIME types for the input data.
       */
      public fun supportedContentTypes(supportedContentTypes: List<String>)

      /**
       * @param supportedContentTypes The supported MIME types for the input data.
       */
      public fun supportedContentTypes(vararg supportedContentTypes: String)

      /**
       * @param supportedRealtimeInferenceInstanceTypes A list of the instance types that are used
       * to generate inferences in real-time.
       */
      public
          fun supportedRealtimeInferenceInstanceTypes(supportedRealtimeInferenceInstanceTypes: List<String>)

      /**
       * @param supportedRealtimeInferenceInstanceTypes A list of the instance types that are used
       * to generate inferences in real-time.
       */
      public fun supportedRealtimeInferenceInstanceTypes(vararg
          supportedRealtimeInferenceInstanceTypes: String)

      /**
       * @param supportedResponseMimeTypes The supported MIME types for the output data.
       */
      public fun supportedResponseMimeTypes(supportedResponseMimeTypes: List<String>)

      /**
       * @param supportedResponseMimeTypes The supported MIME types for the output data.
       */
      public fun supportedResponseMimeTypes(vararg supportedResponseMimeTypes: String)

      /**
       * @param supportedTransformInstanceTypes A list of the instance types on which a
       * transformation job can be run or on which an endpoint can be deployed.
       */
      public fun supportedTransformInstanceTypes(supportedTransformInstanceTypes: List<String>)

      /**
       * @param supportedTransformInstanceTypes A list of the instance types on which a
       * transformation job can be run or on which an endpoint can be deployed.
       */
      public fun supportedTransformInstanceTypes(vararg supportedTransformInstanceTypes: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.AdditionalInferenceSpecificationDefinitionProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.AdditionalInferenceSpecificationDefinitionProperty.builder()

      /**
       * @param containers The Amazon ECR registry path of the Docker image that contains the
       * inference code. 
       */
      override fun containers(containers: IResolvable) {
        cdkBuilder.containers(containers.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param containers The Amazon ECR registry path of the Docker image that contains the
       * inference code. 
       */
      override fun containers(containers: List<Any>) {
        cdkBuilder.containers(containers.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param containers The Amazon ECR registry path of the Docker image that contains the
       * inference code. 
       */
      override fun containers(vararg containers: Any): Unit = containers(containers.toList())

      /**
       * @param description A description of the additional Inference specification.
       */
      override fun description(description: String) {
        cdkBuilder.description(description)
      }

      /**
       * @param name A unique name to identify the additional inference specification. 
       * The name must be unique within the list of your additional inference specifications for a
       * particular model package.
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      /**
       * @param supportedContentTypes The supported MIME types for the input data.
       */
      override fun supportedContentTypes(supportedContentTypes: List<String>) {
        cdkBuilder.supportedContentTypes(supportedContentTypes)
      }

      /**
       * @param supportedContentTypes The supported MIME types for the input data.
       */
      override fun supportedContentTypes(vararg supportedContentTypes: String): Unit =
          supportedContentTypes(supportedContentTypes.toList())

      /**
       * @param supportedRealtimeInferenceInstanceTypes A list of the instance types that are used
       * to generate inferences in real-time.
       */
      override
          fun supportedRealtimeInferenceInstanceTypes(supportedRealtimeInferenceInstanceTypes: List<String>) {
        cdkBuilder.supportedRealtimeInferenceInstanceTypes(supportedRealtimeInferenceInstanceTypes)
      }

      /**
       * @param supportedRealtimeInferenceInstanceTypes A list of the instance types that are used
       * to generate inferences in real-time.
       */
      override fun supportedRealtimeInferenceInstanceTypes(vararg
          supportedRealtimeInferenceInstanceTypes: String): Unit =
          supportedRealtimeInferenceInstanceTypes(supportedRealtimeInferenceInstanceTypes.toList())

      /**
       * @param supportedResponseMimeTypes The supported MIME types for the output data.
       */
      override fun supportedResponseMimeTypes(supportedResponseMimeTypes: List<String>) {
        cdkBuilder.supportedResponseMimeTypes(supportedResponseMimeTypes)
      }

      /**
       * @param supportedResponseMimeTypes The supported MIME types for the output data.
       */
      override fun supportedResponseMimeTypes(vararg supportedResponseMimeTypes: String): Unit =
          supportedResponseMimeTypes(supportedResponseMimeTypes.toList())

      /**
       * @param supportedTransformInstanceTypes A list of the instance types on which a
       * transformation job can be run or on which an endpoint can be deployed.
       */
      override fun supportedTransformInstanceTypes(supportedTransformInstanceTypes: List<String>) {
        cdkBuilder.supportedTransformInstanceTypes(supportedTransformInstanceTypes)
      }

      /**
       * @param supportedTransformInstanceTypes A list of the instance types on which a
       * transformation job can be run or on which an endpoint can be deployed.
       */
      override fun supportedTransformInstanceTypes(vararg supportedTransformInstanceTypes: String):
          Unit = supportedTransformInstanceTypes(supportedTransformInstanceTypes.toList())

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.AdditionalInferenceSpecificationDefinitionProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelPackage.AdditionalInferenceSpecificationDefinitionProperty,
    ) : CdkObject(cdkObject),
        AdditionalInferenceSpecificationDefinitionProperty {
      /**
       * The Amazon ECR registry path of the Docker image that contains the inference code.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-additionalinferencespecificationdefinition.html#cfn-sagemaker-modelpackage-additionalinferencespecificationdefinition-containers)
       */
      override fun containers(): Any = unwrap(this).getContainers()

      /**
       * A description of the additional Inference specification.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-additionalinferencespecificationdefinition.html#cfn-sagemaker-modelpackage-additionalinferencespecificationdefinition-description)
       */
      override fun description(): String? = unwrap(this).getDescription()

      /**
       * A unique name to identify the additional inference specification.
       *
       * The name must be unique within the list of your additional inference specifications for a
       * particular model package.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-additionalinferencespecificationdefinition.html#cfn-sagemaker-modelpackage-additionalinferencespecificationdefinition-name)
       */
      override fun name(): String = unwrap(this).getName()

      /**
       * The supported MIME types for the input data.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-additionalinferencespecificationdefinition.html#cfn-sagemaker-modelpackage-additionalinferencespecificationdefinition-supportedcontenttypes)
       */
      override fun supportedContentTypes(): List<String> = unwrap(this).getSupportedContentTypes()
          ?: emptyList()

      /**
       * A list of the instance types that are used to generate inferences in real-time.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-additionalinferencespecificationdefinition.html#cfn-sagemaker-modelpackage-additionalinferencespecificationdefinition-supportedrealtimeinferenceinstancetypes)
       */
      override fun supportedRealtimeInferenceInstanceTypes(): List<String> =
          unwrap(this).getSupportedRealtimeInferenceInstanceTypes() ?: emptyList()

      /**
       * The supported MIME types for the output data.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-additionalinferencespecificationdefinition.html#cfn-sagemaker-modelpackage-additionalinferencespecificationdefinition-supportedresponsemimetypes)
       */
      override fun supportedResponseMimeTypes(): List<String> =
          unwrap(this).getSupportedResponseMimeTypes() ?: emptyList()

      /**
       * A list of the instance types on which a transformation job can be run or on which an
       * endpoint can be deployed.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-additionalinferencespecificationdefinition.html#cfn-sagemaker-modelpackage-additionalinferencespecificationdefinition-supportedtransforminstancetypes)
       */
      override fun supportedTransformInstanceTypes(): List<String> =
          unwrap(this).getSupportedTransformInstanceTypes() ?: emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          AdditionalInferenceSpecificationDefinitionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelPackage.AdditionalInferenceSpecificationDefinitionProperty):
          AdditionalInferenceSpecificationDefinitionProperty = CdkObjectWrappers.wrap(cdkObject) as?
          AdditionalInferenceSpecificationDefinitionProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: AdditionalInferenceSpecificationDefinitionProperty):
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.AdditionalInferenceSpecificationDefinitionProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.AdditionalInferenceSpecificationDefinitionProperty
    }
  }

  /**
   * Contains bias metrics for a model.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sagemaker.*;
   * BiasProperty biasProperty = BiasProperty.builder()
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-bias.html)
   */
  public interface BiasProperty {
    /**
     * The post-training bias report for a model.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-bias.html#cfn-sagemaker-modelpackage-bias-posttrainingreport)
     */
    public fun postTrainingReport(): Any? = unwrap(this).getPostTrainingReport()

    /**
     * The pre-training bias report for a model.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-bias.html#cfn-sagemaker-modelpackage-bias-pretrainingreport)
     */
    public fun preTrainingReport(): Any? = unwrap(this).getPreTrainingReport()

    /**
     * The bias report for a model.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-bias.html#cfn-sagemaker-modelpackage-bias-report)
     */
    public fun report(): Any? = unwrap(this).getReport()

    /**
     * A builder for [BiasProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param postTrainingReport The post-training bias report for a model.
       */
      public fun postTrainingReport(postTrainingReport: IResolvable)

      /**
       * @param postTrainingReport The post-training bias report for a model.
       */
      public fun postTrainingReport(postTrainingReport: MetricsSourceProperty)

      /**
       * @param postTrainingReport The post-training bias report for a model.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7518be2ecca968b747e0cb56a1dd4e9c0624e41b037d55acd2668fde63c47f0c")
      public fun postTrainingReport(postTrainingReport: MetricsSourceProperty.Builder.() -> Unit)

      /**
       * @param preTrainingReport The pre-training bias report for a model.
       */
      public fun preTrainingReport(preTrainingReport: IResolvable)

      /**
       * @param preTrainingReport The pre-training bias report for a model.
       */
      public fun preTrainingReport(preTrainingReport: MetricsSourceProperty)

      /**
       * @param preTrainingReport The pre-training bias report for a model.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c284f5e0c1d4d792395a22dd0b0daab4cb58c99ff9f1f2bfbc50c3bb32bdcfa3")
      public fun preTrainingReport(preTrainingReport: MetricsSourceProperty.Builder.() -> Unit)

      /**
       * @param report The bias report for a model.
       */
      public fun report(report: IResolvable)

      /**
       * @param report The bias report for a model.
       */
      public fun report(report: MetricsSourceProperty)

      /**
       * @param report The bias report for a model.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("31758d5b749eb5240a789a43c50577c80045025222dcd62b97de562df9566c8e")
      public fun report(report: MetricsSourceProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.BiasProperty.Builder =
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.BiasProperty.builder()

      /**
       * @param postTrainingReport The post-training bias report for a model.
       */
      override fun postTrainingReport(postTrainingReport: IResolvable) {
        cdkBuilder.postTrainingReport(postTrainingReport.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param postTrainingReport The post-training bias report for a model.
       */
      override fun postTrainingReport(postTrainingReport: MetricsSourceProperty) {
        cdkBuilder.postTrainingReport(postTrainingReport.let(MetricsSourceProperty.Companion::unwrap))
      }

      /**
       * @param postTrainingReport The post-training bias report for a model.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7518be2ecca968b747e0cb56a1dd4e9c0624e41b037d55acd2668fde63c47f0c")
      override fun postTrainingReport(postTrainingReport: MetricsSourceProperty.Builder.() -> Unit):
          Unit = postTrainingReport(MetricsSourceProperty(postTrainingReport))

      /**
       * @param preTrainingReport The pre-training bias report for a model.
       */
      override fun preTrainingReport(preTrainingReport: IResolvable) {
        cdkBuilder.preTrainingReport(preTrainingReport.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param preTrainingReport The pre-training bias report for a model.
       */
      override fun preTrainingReport(preTrainingReport: MetricsSourceProperty) {
        cdkBuilder.preTrainingReport(preTrainingReport.let(MetricsSourceProperty.Companion::unwrap))
      }

      /**
       * @param preTrainingReport The pre-training bias report for a model.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c284f5e0c1d4d792395a22dd0b0daab4cb58c99ff9f1f2bfbc50c3bb32bdcfa3")
      override fun preTrainingReport(preTrainingReport: MetricsSourceProperty.Builder.() -> Unit):
          Unit = preTrainingReport(MetricsSourceProperty(preTrainingReport))

      /**
       * @param report The bias report for a model.
       */
      override fun report(report: IResolvable) {
        cdkBuilder.report(report.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param report The bias report for a model.
       */
      override fun report(report: MetricsSourceProperty) {
        cdkBuilder.report(report.let(MetricsSourceProperty.Companion::unwrap))
      }

      /**
       * @param report The bias report for a model.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("31758d5b749eb5240a789a43c50577c80045025222dcd62b97de562df9566c8e")
      override fun report(report: MetricsSourceProperty.Builder.() -> Unit): Unit =
          report(MetricsSourceProperty(report))

      public fun build(): software.amazon.awscdk.services.sagemaker.CfnModelPackage.BiasProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelPackage.BiasProperty,
    ) : CdkObject(cdkObject),
        BiasProperty {
      /**
       * The post-training bias report for a model.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-bias.html#cfn-sagemaker-modelpackage-bias-posttrainingreport)
       */
      override fun postTrainingReport(): Any? = unwrap(this).getPostTrainingReport()

      /**
       * The pre-training bias report for a model.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-bias.html#cfn-sagemaker-modelpackage-bias-pretrainingreport)
       */
      override fun preTrainingReport(): Any? = unwrap(this).getPreTrainingReport()

      /**
       * The bias report for a model.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-bias.html#cfn-sagemaker-modelpackage-bias-report)
       */
      override fun report(): Any? = unwrap(this).getReport()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): BiasProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelPackage.BiasProperty):
          BiasProperty = CdkObjectWrappers.wrap(cdkObject) as? BiasProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: BiasProperty):
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.BiasProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.BiasProperty
    }
  }

  /**
   * Describes the location of the channel data.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sagemaker.*;
   * DataSourceProperty dataSourceProperty = DataSourceProperty.builder()
   * .s3DataSource(S3DataSourceProperty.builder()
   * .s3DataType("s3DataType")
   * .s3Uri("s3Uri")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-datasource.html)
   */
  public interface DataSourceProperty {
    /**
     * The S3 location of the data source that is associated with a channel.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-datasource.html#cfn-sagemaker-modelpackage-datasource-s3datasource)
     */
    public fun s3DataSource(): Any

    /**
     * A builder for [DataSourceProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param s3DataSource The S3 location of the data source that is associated with a channel. 
       */
      public fun s3DataSource(s3DataSource: IResolvable)

      /**
       * @param s3DataSource The S3 location of the data source that is associated with a channel. 
       */
      public fun s3DataSource(s3DataSource: S3DataSourceProperty)

      /**
       * @param s3DataSource The S3 location of the data source that is associated with a channel. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4afc4570dd9358bb0cb51b72e74794958c33359c12dfea7c7fe8565f68c181e7")
      public fun s3DataSource(s3DataSource: S3DataSourceProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.DataSourceProperty.Builder =
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.DataSourceProperty.builder()

      /**
       * @param s3DataSource The S3 location of the data source that is associated with a channel. 
       */
      override fun s3DataSource(s3DataSource: IResolvable) {
        cdkBuilder.s3DataSource(s3DataSource.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param s3DataSource The S3 location of the data source that is associated with a channel. 
       */
      override fun s3DataSource(s3DataSource: S3DataSourceProperty) {
        cdkBuilder.s3DataSource(s3DataSource.let(S3DataSourceProperty.Companion::unwrap))
      }

      /**
       * @param s3DataSource The S3 location of the data source that is associated with a channel. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4afc4570dd9358bb0cb51b72e74794958c33359c12dfea7c7fe8565f68c181e7")
      override fun s3DataSource(s3DataSource: S3DataSourceProperty.Builder.() -> Unit): Unit =
          s3DataSource(S3DataSourceProperty(s3DataSource))

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.DataSourceProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelPackage.DataSourceProperty,
    ) : CdkObject(cdkObject),
        DataSourceProperty {
      /**
       * The S3 location of the data source that is associated with a channel.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-datasource.html#cfn-sagemaker-modelpackage-datasource-s3datasource)
       */
      override fun s3DataSource(): Any = unwrap(this).getS3DataSource()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DataSourceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelPackage.DataSourceProperty):
          DataSourceProperty = CdkObjectWrappers.wrap(cdkObject) as? DataSourceProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: DataSourceProperty):
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.DataSourceProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.DataSourceProperty
    }
  }

  /**
   * Represents the drift check baselines that can be used when the model monitor is set using the
   * model package.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sagemaker.*;
   * DriftCheckBaselinesProperty driftCheckBaselinesProperty = DriftCheckBaselinesProperty.builder()
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-driftcheckbaselines.html)
   */
  public interface DriftCheckBaselinesProperty {
    /**
     * Represents the drift check bias baselines that can be used when the model monitor is set
     * using the model package.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-driftcheckbaselines.html#cfn-sagemaker-modelpackage-driftcheckbaselines-bias)
     */
    public fun bias(): Any? = unwrap(this).getBias()

    /**
     * Represents the drift check explainability baselines that can be used when the model monitor
     * is set using the model package.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-driftcheckbaselines.html#cfn-sagemaker-modelpackage-driftcheckbaselines-explainability)
     */
    public fun explainability(): Any? = unwrap(this).getExplainability()

    /**
     * Represents the drift check model data quality baselines that can be used when the model
     * monitor is set using the model package.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-driftcheckbaselines.html#cfn-sagemaker-modelpackage-driftcheckbaselines-modeldataquality)
     */
    public fun modelDataQuality(): Any? = unwrap(this).getModelDataQuality()

    /**
     * Represents the drift check model quality baselines that can be used when the model monitor is
     * set using the model package.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-driftcheckbaselines.html#cfn-sagemaker-modelpackage-driftcheckbaselines-modelquality)
     */
    public fun modelQuality(): Any? = unwrap(this).getModelQuality()

    /**
     * A builder for [DriftCheckBaselinesProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param bias Represents the drift check bias baselines that can be used when the model
       * monitor is set using the model package.
       */
      public fun bias(bias: IResolvable)

      /**
       * @param bias Represents the drift check bias baselines that can be used when the model
       * monitor is set using the model package.
       */
      public fun bias(bias: DriftCheckBiasProperty)

      /**
       * @param bias Represents the drift check bias baselines that can be used when the model
       * monitor is set using the model package.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("928782260f85ee87168ab2f3b43473ba5e2fee2025bec3c747b4b13189fd326a")
      public fun bias(bias: DriftCheckBiasProperty.Builder.() -> Unit)

      /**
       * @param explainability Represents the drift check explainability baselines that can be used
       * when the model monitor is set using the model package.
       */
      public fun explainability(explainability: IResolvable)

      /**
       * @param explainability Represents the drift check explainability baselines that can be used
       * when the model monitor is set using the model package.
       */
      public fun explainability(explainability: DriftCheckExplainabilityProperty)

      /**
       * @param explainability Represents the drift check explainability baselines that can be used
       * when the model monitor is set using the model package.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("bec72e51059c6e4692aa5a35935f4d2fb1630952fd479c84cba4d358c73c2fc5")
      public fun explainability(explainability: DriftCheckExplainabilityProperty.Builder.() -> Unit)

      /**
       * @param modelDataQuality Represents the drift check model data quality baselines that can be
       * used when the model monitor is set using the model package.
       */
      public fun modelDataQuality(modelDataQuality: IResolvable)

      /**
       * @param modelDataQuality Represents the drift check model data quality baselines that can be
       * used when the model monitor is set using the model package.
       */
      public fun modelDataQuality(modelDataQuality: DriftCheckModelDataQualityProperty)

      /**
       * @param modelDataQuality Represents the drift check model data quality baselines that can be
       * used when the model monitor is set using the model package.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fe84f7ca72bef9952679d6519e935f3ba52590948c2e3223511da975d1d82232")
      public
          fun modelDataQuality(modelDataQuality: DriftCheckModelDataQualityProperty.Builder.() -> Unit)

      /**
       * @param modelQuality Represents the drift check model quality baselines that can be used
       * when the model monitor is set using the model package.
       */
      public fun modelQuality(modelQuality: IResolvable)

      /**
       * @param modelQuality Represents the drift check model quality baselines that can be used
       * when the model monitor is set using the model package.
       */
      public fun modelQuality(modelQuality: DriftCheckModelQualityProperty)

      /**
       * @param modelQuality Represents the drift check model quality baselines that can be used
       * when the model monitor is set using the model package.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5fb86383a4e71c1bd29f6dcec128bec46a7bc676f9a22e80363ceaaee6be6171")
      public fun modelQuality(modelQuality: DriftCheckModelQualityProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.DriftCheckBaselinesProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.DriftCheckBaselinesProperty.builder()

      /**
       * @param bias Represents the drift check bias baselines that can be used when the model
       * monitor is set using the model package.
       */
      override fun bias(bias: IResolvable) {
        cdkBuilder.bias(bias.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param bias Represents the drift check bias baselines that can be used when the model
       * monitor is set using the model package.
       */
      override fun bias(bias: DriftCheckBiasProperty) {
        cdkBuilder.bias(bias.let(DriftCheckBiasProperty.Companion::unwrap))
      }

      /**
       * @param bias Represents the drift check bias baselines that can be used when the model
       * monitor is set using the model package.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("928782260f85ee87168ab2f3b43473ba5e2fee2025bec3c747b4b13189fd326a")
      override fun bias(bias: DriftCheckBiasProperty.Builder.() -> Unit): Unit =
          bias(DriftCheckBiasProperty(bias))

      /**
       * @param explainability Represents the drift check explainability baselines that can be used
       * when the model monitor is set using the model package.
       */
      override fun explainability(explainability: IResolvable) {
        cdkBuilder.explainability(explainability.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param explainability Represents the drift check explainability baselines that can be used
       * when the model monitor is set using the model package.
       */
      override fun explainability(explainability: DriftCheckExplainabilityProperty) {
        cdkBuilder.explainability(explainability.let(DriftCheckExplainabilityProperty.Companion::unwrap))
      }

      /**
       * @param explainability Represents the drift check explainability baselines that can be used
       * when the model monitor is set using the model package.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("bec72e51059c6e4692aa5a35935f4d2fb1630952fd479c84cba4d358c73c2fc5")
      override
          fun explainability(explainability: DriftCheckExplainabilityProperty.Builder.() -> Unit):
          Unit = explainability(DriftCheckExplainabilityProperty(explainability))

      /**
       * @param modelDataQuality Represents the drift check model data quality baselines that can be
       * used when the model monitor is set using the model package.
       */
      override fun modelDataQuality(modelDataQuality: IResolvable) {
        cdkBuilder.modelDataQuality(modelDataQuality.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param modelDataQuality Represents the drift check model data quality baselines that can be
       * used when the model monitor is set using the model package.
       */
      override fun modelDataQuality(modelDataQuality: DriftCheckModelDataQualityProperty) {
        cdkBuilder.modelDataQuality(modelDataQuality.let(DriftCheckModelDataQualityProperty.Companion::unwrap))
      }

      /**
       * @param modelDataQuality Represents the drift check model data quality baselines that can be
       * used when the model monitor is set using the model package.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fe84f7ca72bef9952679d6519e935f3ba52590948c2e3223511da975d1d82232")
      override
          fun modelDataQuality(modelDataQuality: DriftCheckModelDataQualityProperty.Builder.() -> Unit):
          Unit = modelDataQuality(DriftCheckModelDataQualityProperty(modelDataQuality))

      /**
       * @param modelQuality Represents the drift check model quality baselines that can be used
       * when the model monitor is set using the model package.
       */
      override fun modelQuality(modelQuality: IResolvable) {
        cdkBuilder.modelQuality(modelQuality.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param modelQuality Represents the drift check model quality baselines that can be used
       * when the model monitor is set using the model package.
       */
      override fun modelQuality(modelQuality: DriftCheckModelQualityProperty) {
        cdkBuilder.modelQuality(modelQuality.let(DriftCheckModelQualityProperty.Companion::unwrap))
      }

      /**
       * @param modelQuality Represents the drift check model quality baselines that can be used
       * when the model monitor is set using the model package.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5fb86383a4e71c1bd29f6dcec128bec46a7bc676f9a22e80363ceaaee6be6171")
      override fun modelQuality(modelQuality: DriftCheckModelQualityProperty.Builder.() -> Unit):
          Unit = modelQuality(DriftCheckModelQualityProperty(modelQuality))

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.DriftCheckBaselinesProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelPackage.DriftCheckBaselinesProperty,
    ) : CdkObject(cdkObject),
        DriftCheckBaselinesProperty {
      /**
       * Represents the drift check bias baselines that can be used when the model monitor is set
       * using the model package.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-driftcheckbaselines.html#cfn-sagemaker-modelpackage-driftcheckbaselines-bias)
       */
      override fun bias(): Any? = unwrap(this).getBias()

      /**
       * Represents the drift check explainability baselines that can be used when the model monitor
       * is set using the model package.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-driftcheckbaselines.html#cfn-sagemaker-modelpackage-driftcheckbaselines-explainability)
       */
      override fun explainability(): Any? = unwrap(this).getExplainability()

      /**
       * Represents the drift check model data quality baselines that can be used when the model
       * monitor is set using the model package.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-driftcheckbaselines.html#cfn-sagemaker-modelpackage-driftcheckbaselines-modeldataquality)
       */
      override fun modelDataQuality(): Any? = unwrap(this).getModelDataQuality()

      /**
       * Represents the drift check model quality baselines that can be used when the model monitor
       * is set using the model package.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-driftcheckbaselines.html#cfn-sagemaker-modelpackage-driftcheckbaselines-modelquality)
       */
      override fun modelQuality(): Any? = unwrap(this).getModelQuality()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DriftCheckBaselinesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelPackage.DriftCheckBaselinesProperty):
          DriftCheckBaselinesProperty = CdkObjectWrappers.wrap(cdkObject) as?
          DriftCheckBaselinesProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: DriftCheckBaselinesProperty):
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.DriftCheckBaselinesProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.DriftCheckBaselinesProperty
    }
  }

  /**
   * Represents the drift check bias baselines that can be used when the model monitor is set using
   * the model package.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sagemaker.*;
   * DriftCheckBiasProperty driftCheckBiasProperty = DriftCheckBiasProperty.builder()
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-driftcheckbias.html)
   */
  public interface DriftCheckBiasProperty {
    /**
     * The bias config file for a model.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-driftcheckbias.html#cfn-sagemaker-modelpackage-driftcheckbias-configfile)
     */
    public fun configFile(): Any? = unwrap(this).getConfigFile()

    /**
     * The post-training constraints.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-driftcheckbias.html#cfn-sagemaker-modelpackage-driftcheckbias-posttrainingconstraints)
     */
    public fun postTrainingConstraints(): Any? = unwrap(this).getPostTrainingConstraints()

    /**
     * The pre-training constraints.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-driftcheckbias.html#cfn-sagemaker-modelpackage-driftcheckbias-pretrainingconstraints)
     */
    public fun preTrainingConstraints(): Any? = unwrap(this).getPreTrainingConstraints()

    /**
     * A builder for [DriftCheckBiasProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param configFile The bias config file for a model.
       */
      public fun configFile(configFile: IResolvable)

      /**
       * @param configFile The bias config file for a model.
       */
      public fun configFile(configFile: FileSourceProperty)

      /**
       * @param configFile The bias config file for a model.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6a1df16f6e16a3ef409d3a7961d705d73cb00f4e634cab22f2ba08dcddc9742a")
      public fun configFile(configFile: FileSourceProperty.Builder.() -> Unit)

      /**
       * @param postTrainingConstraints The post-training constraints.
       */
      public fun postTrainingConstraints(postTrainingConstraints: IResolvable)

      /**
       * @param postTrainingConstraints The post-training constraints.
       */
      public fun postTrainingConstraints(postTrainingConstraints: MetricsSourceProperty)

      /**
       * @param postTrainingConstraints The post-training constraints.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("193e29a0efc44232891916800aafaf7d157acec86ee43ab8157957009d232bfd")
      public
          fun postTrainingConstraints(postTrainingConstraints: MetricsSourceProperty.Builder.() -> Unit)

      /**
       * @param preTrainingConstraints The pre-training constraints.
       */
      public fun preTrainingConstraints(preTrainingConstraints: IResolvable)

      /**
       * @param preTrainingConstraints The pre-training constraints.
       */
      public fun preTrainingConstraints(preTrainingConstraints: MetricsSourceProperty)

      /**
       * @param preTrainingConstraints The pre-training constraints.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6159add795ca353ab92fcc28608a3bc1265ddb7fb2d5c91a4a2203d244df165c")
      public
          fun preTrainingConstraints(preTrainingConstraints: MetricsSourceProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.DriftCheckBiasProperty.Builder =
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.DriftCheckBiasProperty.builder()

      /**
       * @param configFile The bias config file for a model.
       */
      override fun configFile(configFile: IResolvable) {
        cdkBuilder.configFile(configFile.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param configFile The bias config file for a model.
       */
      override fun configFile(configFile: FileSourceProperty) {
        cdkBuilder.configFile(configFile.let(FileSourceProperty.Companion::unwrap))
      }

      /**
       * @param configFile The bias config file for a model.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6a1df16f6e16a3ef409d3a7961d705d73cb00f4e634cab22f2ba08dcddc9742a")
      override fun configFile(configFile: FileSourceProperty.Builder.() -> Unit): Unit =
          configFile(FileSourceProperty(configFile))

      /**
       * @param postTrainingConstraints The post-training constraints.
       */
      override fun postTrainingConstraints(postTrainingConstraints: IResolvable) {
        cdkBuilder.postTrainingConstraints(postTrainingConstraints.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param postTrainingConstraints The post-training constraints.
       */
      override fun postTrainingConstraints(postTrainingConstraints: MetricsSourceProperty) {
        cdkBuilder.postTrainingConstraints(postTrainingConstraints.let(MetricsSourceProperty.Companion::unwrap))
      }

      /**
       * @param postTrainingConstraints The post-training constraints.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("193e29a0efc44232891916800aafaf7d157acec86ee43ab8157957009d232bfd")
      override
          fun postTrainingConstraints(postTrainingConstraints: MetricsSourceProperty.Builder.() -> Unit):
          Unit = postTrainingConstraints(MetricsSourceProperty(postTrainingConstraints))

      /**
       * @param preTrainingConstraints The pre-training constraints.
       */
      override fun preTrainingConstraints(preTrainingConstraints: IResolvable) {
        cdkBuilder.preTrainingConstraints(preTrainingConstraints.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param preTrainingConstraints The pre-training constraints.
       */
      override fun preTrainingConstraints(preTrainingConstraints: MetricsSourceProperty) {
        cdkBuilder.preTrainingConstraints(preTrainingConstraints.let(MetricsSourceProperty.Companion::unwrap))
      }

      /**
       * @param preTrainingConstraints The pre-training constraints.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6159add795ca353ab92fcc28608a3bc1265ddb7fb2d5c91a4a2203d244df165c")
      override
          fun preTrainingConstraints(preTrainingConstraints: MetricsSourceProperty.Builder.() -> Unit):
          Unit = preTrainingConstraints(MetricsSourceProperty(preTrainingConstraints))

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.DriftCheckBiasProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelPackage.DriftCheckBiasProperty,
    ) : CdkObject(cdkObject),
        DriftCheckBiasProperty {
      /**
       * The bias config file for a model.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-driftcheckbias.html#cfn-sagemaker-modelpackage-driftcheckbias-configfile)
       */
      override fun configFile(): Any? = unwrap(this).getConfigFile()

      /**
       * The post-training constraints.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-driftcheckbias.html#cfn-sagemaker-modelpackage-driftcheckbias-posttrainingconstraints)
       */
      override fun postTrainingConstraints(): Any? = unwrap(this).getPostTrainingConstraints()

      /**
       * The pre-training constraints.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-driftcheckbias.html#cfn-sagemaker-modelpackage-driftcheckbias-pretrainingconstraints)
       */
      override fun preTrainingConstraints(): Any? = unwrap(this).getPreTrainingConstraints()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DriftCheckBiasProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelPackage.DriftCheckBiasProperty):
          DriftCheckBiasProperty = CdkObjectWrappers.wrap(cdkObject) as? DriftCheckBiasProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: DriftCheckBiasProperty):
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.DriftCheckBiasProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.DriftCheckBiasProperty
    }
  }

  /**
   * Represents the drift check explainability baselines that can be used when the model monitor is
   * set using the model package.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sagemaker.*;
   * DriftCheckExplainabilityProperty driftCheckExplainabilityProperty =
   * DriftCheckExplainabilityProperty.builder()
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-driftcheckexplainability.html)
   */
  public interface DriftCheckExplainabilityProperty {
    /**
     * The explainability config file for the model.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-driftcheckexplainability.html#cfn-sagemaker-modelpackage-driftcheckexplainability-configfile)
     */
    public fun configFile(): Any? = unwrap(this).getConfigFile()

    /**
     * The drift check explainability constraints.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-driftcheckexplainability.html#cfn-sagemaker-modelpackage-driftcheckexplainability-constraints)
     */
    public fun constraints(): Any? = unwrap(this).getConstraints()

    /**
     * A builder for [DriftCheckExplainabilityProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param configFile The explainability config file for the model.
       */
      public fun configFile(configFile: IResolvable)

      /**
       * @param configFile The explainability config file for the model.
       */
      public fun configFile(configFile: FileSourceProperty)

      /**
       * @param configFile The explainability config file for the model.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c706fe7141916f9bc2539d511c2cf67a8dd0fd1ee2cc7f0843591345917138a6")
      public fun configFile(configFile: FileSourceProperty.Builder.() -> Unit)

      /**
       * @param constraints The drift check explainability constraints.
       */
      public fun constraints(constraints: IResolvable)

      /**
       * @param constraints The drift check explainability constraints.
       */
      public fun constraints(constraints: MetricsSourceProperty)

      /**
       * @param constraints The drift check explainability constraints.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("510f79405b037af9db3613e9e0b5c9185c9fde2eb6daf836ab525b3d89aff1a7")
      public fun constraints(constraints: MetricsSourceProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.DriftCheckExplainabilityProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.DriftCheckExplainabilityProperty.builder()

      /**
       * @param configFile The explainability config file for the model.
       */
      override fun configFile(configFile: IResolvable) {
        cdkBuilder.configFile(configFile.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param configFile The explainability config file for the model.
       */
      override fun configFile(configFile: FileSourceProperty) {
        cdkBuilder.configFile(configFile.let(FileSourceProperty.Companion::unwrap))
      }

      /**
       * @param configFile The explainability config file for the model.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c706fe7141916f9bc2539d511c2cf67a8dd0fd1ee2cc7f0843591345917138a6")
      override fun configFile(configFile: FileSourceProperty.Builder.() -> Unit): Unit =
          configFile(FileSourceProperty(configFile))

      /**
       * @param constraints The drift check explainability constraints.
       */
      override fun constraints(constraints: IResolvable) {
        cdkBuilder.constraints(constraints.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param constraints The drift check explainability constraints.
       */
      override fun constraints(constraints: MetricsSourceProperty) {
        cdkBuilder.constraints(constraints.let(MetricsSourceProperty.Companion::unwrap))
      }

      /**
       * @param constraints The drift check explainability constraints.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("510f79405b037af9db3613e9e0b5c9185c9fde2eb6daf836ab525b3d89aff1a7")
      override fun constraints(constraints: MetricsSourceProperty.Builder.() -> Unit): Unit =
          constraints(MetricsSourceProperty(constraints))

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.DriftCheckExplainabilityProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelPackage.DriftCheckExplainabilityProperty,
    ) : CdkObject(cdkObject),
        DriftCheckExplainabilityProperty {
      /**
       * The explainability config file for the model.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-driftcheckexplainability.html#cfn-sagemaker-modelpackage-driftcheckexplainability-configfile)
       */
      override fun configFile(): Any? = unwrap(this).getConfigFile()

      /**
       * The drift check explainability constraints.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-driftcheckexplainability.html#cfn-sagemaker-modelpackage-driftcheckexplainability-constraints)
       */
      override fun constraints(): Any? = unwrap(this).getConstraints()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DriftCheckExplainabilityProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelPackage.DriftCheckExplainabilityProperty):
          DriftCheckExplainabilityProperty = CdkObjectWrappers.wrap(cdkObject) as?
          DriftCheckExplainabilityProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: DriftCheckExplainabilityProperty):
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.DriftCheckExplainabilityProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.DriftCheckExplainabilityProperty
    }
  }

  /**
   * Represents the drift check data quality baselines that can be used when the model monitor is
   * set using the model package.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sagemaker.*;
   * DriftCheckModelDataQualityProperty driftCheckModelDataQualityProperty =
   * DriftCheckModelDataQualityProperty.builder()
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-driftcheckmodeldataquality.html)
   */
  public interface DriftCheckModelDataQualityProperty {
    /**
     * The drift check model data quality constraints.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-driftcheckmodeldataquality.html#cfn-sagemaker-modelpackage-driftcheckmodeldataquality-constraints)
     */
    public fun constraints(): Any? = unwrap(this).getConstraints()

    /**
     * The drift check model data quality statistics.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-driftcheckmodeldataquality.html#cfn-sagemaker-modelpackage-driftcheckmodeldataquality-statistics)
     */
    public fun statistics(): Any? = unwrap(this).getStatistics()

    /**
     * A builder for [DriftCheckModelDataQualityProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param constraints The drift check model data quality constraints.
       */
      public fun constraints(constraints: IResolvable)

      /**
       * @param constraints The drift check model data quality constraints.
       */
      public fun constraints(constraints: MetricsSourceProperty)

      /**
       * @param constraints The drift check model data quality constraints.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3c63d833ca7452ddf2902d2c3e26c2a40251457a7f0c3a61efee884bbdbd6830")
      public fun constraints(constraints: MetricsSourceProperty.Builder.() -> Unit)

      /**
       * @param statistics The drift check model data quality statistics.
       */
      public fun statistics(statistics: IResolvable)

      /**
       * @param statistics The drift check model data quality statistics.
       */
      public fun statistics(statistics: MetricsSourceProperty)

      /**
       * @param statistics The drift check model data quality statistics.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5c418561efd00db268003819ccc8a5fdda0063dd30d88acbf5b61b748c58ffda")
      public fun statistics(statistics: MetricsSourceProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.DriftCheckModelDataQualityProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.DriftCheckModelDataQualityProperty.builder()

      /**
       * @param constraints The drift check model data quality constraints.
       */
      override fun constraints(constraints: IResolvable) {
        cdkBuilder.constraints(constraints.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param constraints The drift check model data quality constraints.
       */
      override fun constraints(constraints: MetricsSourceProperty) {
        cdkBuilder.constraints(constraints.let(MetricsSourceProperty.Companion::unwrap))
      }

      /**
       * @param constraints The drift check model data quality constraints.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3c63d833ca7452ddf2902d2c3e26c2a40251457a7f0c3a61efee884bbdbd6830")
      override fun constraints(constraints: MetricsSourceProperty.Builder.() -> Unit): Unit =
          constraints(MetricsSourceProperty(constraints))

      /**
       * @param statistics The drift check model data quality statistics.
       */
      override fun statistics(statistics: IResolvable) {
        cdkBuilder.statistics(statistics.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param statistics The drift check model data quality statistics.
       */
      override fun statistics(statistics: MetricsSourceProperty) {
        cdkBuilder.statistics(statistics.let(MetricsSourceProperty.Companion::unwrap))
      }

      /**
       * @param statistics The drift check model data quality statistics.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5c418561efd00db268003819ccc8a5fdda0063dd30d88acbf5b61b748c58ffda")
      override fun statistics(statistics: MetricsSourceProperty.Builder.() -> Unit): Unit =
          statistics(MetricsSourceProperty(statistics))

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.DriftCheckModelDataQualityProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelPackage.DriftCheckModelDataQualityProperty,
    ) : CdkObject(cdkObject),
        DriftCheckModelDataQualityProperty {
      /**
       * The drift check model data quality constraints.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-driftcheckmodeldataquality.html#cfn-sagemaker-modelpackage-driftcheckmodeldataquality-constraints)
       */
      override fun constraints(): Any? = unwrap(this).getConstraints()

      /**
       * The drift check model data quality statistics.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-driftcheckmodeldataquality.html#cfn-sagemaker-modelpackage-driftcheckmodeldataquality-statistics)
       */
      override fun statistics(): Any? = unwrap(this).getStatistics()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          DriftCheckModelDataQualityProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelPackage.DriftCheckModelDataQualityProperty):
          DriftCheckModelDataQualityProperty = CdkObjectWrappers.wrap(cdkObject) as?
          DriftCheckModelDataQualityProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: DriftCheckModelDataQualityProperty):
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.DriftCheckModelDataQualityProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.DriftCheckModelDataQualityProperty
    }
  }

  /**
   * Represents the drift check model quality baselines that can be used when the model monitor is
   * set using the model package.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sagemaker.*;
   * DriftCheckModelQualityProperty driftCheckModelQualityProperty =
   * DriftCheckModelQualityProperty.builder()
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-driftcheckmodelquality.html)
   */
  public interface DriftCheckModelQualityProperty {
    /**
     * The drift check model quality constraints.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-driftcheckmodelquality.html#cfn-sagemaker-modelpackage-driftcheckmodelquality-constraints)
     */
    public fun constraints(): Any? = unwrap(this).getConstraints()

    /**
     * The drift check model quality statistics.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-driftcheckmodelquality.html#cfn-sagemaker-modelpackage-driftcheckmodelquality-statistics)
     */
    public fun statistics(): Any? = unwrap(this).getStatistics()

    /**
     * A builder for [DriftCheckModelQualityProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param constraints The drift check model quality constraints.
       */
      public fun constraints(constraints: IResolvable)

      /**
       * @param constraints The drift check model quality constraints.
       */
      public fun constraints(constraints: MetricsSourceProperty)

      /**
       * @param constraints The drift check model quality constraints.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f5e279833095b174ae27c37e67729b9102c62f9400b31cc7479e29208376d09e")
      public fun constraints(constraints: MetricsSourceProperty.Builder.() -> Unit)

      /**
       * @param statistics The drift check model quality statistics.
       */
      public fun statistics(statistics: IResolvable)

      /**
       * @param statistics The drift check model quality statistics.
       */
      public fun statistics(statistics: MetricsSourceProperty)

      /**
       * @param statistics The drift check model quality statistics.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3940780e4a07cd964e2f2dcc12f27871b85f89660dc8f88daac10d7a85bfc948")
      public fun statistics(statistics: MetricsSourceProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.DriftCheckModelQualityProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.DriftCheckModelQualityProperty.builder()

      /**
       * @param constraints The drift check model quality constraints.
       */
      override fun constraints(constraints: IResolvable) {
        cdkBuilder.constraints(constraints.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param constraints The drift check model quality constraints.
       */
      override fun constraints(constraints: MetricsSourceProperty) {
        cdkBuilder.constraints(constraints.let(MetricsSourceProperty.Companion::unwrap))
      }

      /**
       * @param constraints The drift check model quality constraints.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f5e279833095b174ae27c37e67729b9102c62f9400b31cc7479e29208376d09e")
      override fun constraints(constraints: MetricsSourceProperty.Builder.() -> Unit): Unit =
          constraints(MetricsSourceProperty(constraints))

      /**
       * @param statistics The drift check model quality statistics.
       */
      override fun statistics(statistics: IResolvable) {
        cdkBuilder.statistics(statistics.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param statistics The drift check model quality statistics.
       */
      override fun statistics(statistics: MetricsSourceProperty) {
        cdkBuilder.statistics(statistics.let(MetricsSourceProperty.Companion::unwrap))
      }

      /**
       * @param statistics The drift check model quality statistics.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3940780e4a07cd964e2f2dcc12f27871b85f89660dc8f88daac10d7a85bfc948")
      override fun statistics(statistics: MetricsSourceProperty.Builder.() -> Unit): Unit =
          statistics(MetricsSourceProperty(statistics))

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.DriftCheckModelQualityProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelPackage.DriftCheckModelQualityProperty,
    ) : CdkObject(cdkObject),
        DriftCheckModelQualityProperty {
      /**
       * The drift check model quality constraints.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-driftcheckmodelquality.html#cfn-sagemaker-modelpackage-driftcheckmodelquality-constraints)
       */
      override fun constraints(): Any? = unwrap(this).getConstraints()

      /**
       * The drift check model quality statistics.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-driftcheckmodelquality.html#cfn-sagemaker-modelpackage-driftcheckmodelquality-statistics)
       */
      override fun statistics(): Any? = unwrap(this).getStatistics()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DriftCheckModelQualityProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelPackage.DriftCheckModelQualityProperty):
          DriftCheckModelQualityProperty = CdkObjectWrappers.wrap(cdkObject) as?
          DriftCheckModelQualityProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: DriftCheckModelQualityProperty):
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.DriftCheckModelQualityProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.DriftCheckModelQualityProperty
    }
  }

  /**
   * Contains explainability metrics for a model.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sagemaker.*;
   * ExplainabilityProperty explainabilityProperty = ExplainabilityProperty.builder()
   * .report(MetricsSourceProperty.builder()
   * .contentType("contentType")
   * .s3Uri("s3Uri")
   * // the properties below are optional
   * .contentDigest("contentDigest")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-explainability.html)
   */
  public interface ExplainabilityProperty {
    /**
     * The explainability report for a model.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-explainability.html#cfn-sagemaker-modelpackage-explainability-report)
     */
    public fun report(): Any? = unwrap(this).getReport()

    /**
     * A builder for [ExplainabilityProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param report The explainability report for a model.
       */
      public fun report(report: IResolvable)

      /**
       * @param report The explainability report for a model.
       */
      public fun report(report: MetricsSourceProperty)

      /**
       * @param report The explainability report for a model.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6226d61ca0d55fa1ebe648926a6b2f4a99bd4a20e34c6e80dd3e94c2462663ef")
      public fun report(report: MetricsSourceProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.ExplainabilityProperty.Builder =
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.ExplainabilityProperty.builder()

      /**
       * @param report The explainability report for a model.
       */
      override fun report(report: IResolvable) {
        cdkBuilder.report(report.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param report The explainability report for a model.
       */
      override fun report(report: MetricsSourceProperty) {
        cdkBuilder.report(report.let(MetricsSourceProperty.Companion::unwrap))
      }

      /**
       * @param report The explainability report for a model.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6226d61ca0d55fa1ebe648926a6b2f4a99bd4a20e34c6e80dd3e94c2462663ef")
      override fun report(report: MetricsSourceProperty.Builder.() -> Unit): Unit =
          report(MetricsSourceProperty(report))

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.ExplainabilityProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelPackage.ExplainabilityProperty,
    ) : CdkObject(cdkObject),
        ExplainabilityProperty {
      /**
       * The explainability report for a model.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-explainability.html#cfn-sagemaker-modelpackage-explainability-report)
       */
      override fun report(): Any? = unwrap(this).getReport()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ExplainabilityProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelPackage.ExplainabilityProperty):
          ExplainabilityProperty = CdkObjectWrappers.wrap(cdkObject) as? ExplainabilityProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: ExplainabilityProperty):
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.ExplainabilityProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.ExplainabilityProperty
    }
  }

  /**
   * Contains details regarding the file source.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sagemaker.*;
   * FileSourceProperty fileSourceProperty = FileSourceProperty.builder()
   * .s3Uri("s3Uri")
   * // the properties below are optional
   * .contentDigest("contentDigest")
   * .contentType("contentType")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-filesource.html)
   */
  public interface FileSourceProperty {
    /**
     * The digest of the file source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-filesource.html#cfn-sagemaker-modelpackage-filesource-contentdigest)
     */
    public fun contentDigest(): String? = unwrap(this).getContentDigest()

    /**
     * The type of content stored in the file source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-filesource.html#cfn-sagemaker-modelpackage-filesource-contenttype)
     */
    public fun contentType(): String? = unwrap(this).getContentType()

    /**
     * The Amazon S3 URI for the file source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-filesource.html#cfn-sagemaker-modelpackage-filesource-s3uri)
     */
    public fun s3Uri(): String

    /**
     * A builder for [FileSourceProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param contentDigest The digest of the file source.
       */
      public fun contentDigest(contentDigest: String)

      /**
       * @param contentType The type of content stored in the file source.
       */
      public fun contentType(contentType: String)

      /**
       * @param s3Uri The Amazon S3 URI for the file source. 
       */
      public fun s3Uri(s3Uri: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.FileSourceProperty.Builder =
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.FileSourceProperty.builder()

      /**
       * @param contentDigest The digest of the file source.
       */
      override fun contentDigest(contentDigest: String) {
        cdkBuilder.contentDigest(contentDigest)
      }

      /**
       * @param contentType The type of content stored in the file source.
       */
      override fun contentType(contentType: String) {
        cdkBuilder.contentType(contentType)
      }

      /**
       * @param s3Uri The Amazon S3 URI for the file source. 
       */
      override fun s3Uri(s3Uri: String) {
        cdkBuilder.s3Uri(s3Uri)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.FileSourceProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelPackage.FileSourceProperty,
    ) : CdkObject(cdkObject),
        FileSourceProperty {
      /**
       * The digest of the file source.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-filesource.html#cfn-sagemaker-modelpackage-filesource-contentdigest)
       */
      override fun contentDigest(): String? = unwrap(this).getContentDigest()

      /**
       * The type of content stored in the file source.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-filesource.html#cfn-sagemaker-modelpackage-filesource-contenttype)
       */
      override fun contentType(): String? = unwrap(this).getContentType()

      /**
       * The Amazon S3 URI for the file source.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-filesource.html#cfn-sagemaker-modelpackage-filesource-s3uri)
       */
      override fun s3Uri(): String = unwrap(this).getS3Uri()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): FileSourceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelPackage.FileSourceProperty):
          FileSourceProperty = CdkObjectWrappers.wrap(cdkObject) as? FileSourceProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: FileSourceProperty):
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.FileSourceProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.FileSourceProperty
    }
  }

  /**
   * Defines how to perform inference generation after a training job is run.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sagemaker.*;
   * Object modelInput;
   * InferenceSpecificationProperty inferenceSpecificationProperty =
   * InferenceSpecificationProperty.builder()
   * .containers(List.of(ModelPackageContainerDefinitionProperty.builder()
   * .image("image")
   * // the properties below are optional
   * .containerHostname("containerHostname")
   * .environment(Map.of(
   * "environmentKey", "environment"))
   * .framework("framework")
   * .frameworkVersion("frameworkVersion")
   * .imageDigest("imageDigest")
   * .modelDataSource(ModelDataSourceProperty.builder()
   * .s3DataSource(S3ModelDataSourceProperty.builder()
   * .compressionType("compressionType")
   * .s3DataType("s3DataType")
   * .s3Uri("s3Uri")
   * // the properties below are optional
   * .modelAccessConfig(ModelAccessConfigProperty.builder()
   * .acceptEula(false)
   * .build())
   * .build())
   * .build())
   * .modelDataUrl("modelDataUrl")
   * .modelInput(modelInput)
   * .nearestModelName("nearestModelName")
   * .build()))
   * .supportedContentTypes(List.of("supportedContentTypes"))
   * .supportedResponseMimeTypes(List.of("supportedResponseMimeTypes"))
   * // the properties below are optional
   * .supportedRealtimeInferenceInstanceTypes(List.of("supportedRealtimeInferenceInstanceTypes"))
   * .supportedTransformInstanceTypes(List.of("supportedTransformInstanceTypes"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-inferencespecification.html)
   */
  public interface InferenceSpecificationProperty {
    /**
     * The Amazon ECR registry path of the Docker image that contains the inference code.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-inferencespecification.html#cfn-sagemaker-modelpackage-inferencespecification-containers)
     */
    public fun containers(): Any

    /**
     * The supported MIME types for the input data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-inferencespecification.html#cfn-sagemaker-modelpackage-inferencespecification-supportedcontenttypes)
     */
    public fun supportedContentTypes(): List<String>

    /**
     * A list of the instance types that are used to generate inferences in real-time.
     *
     * This parameter is required for unversioned models, and optional for versioned models.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-inferencespecification.html#cfn-sagemaker-modelpackage-inferencespecification-supportedrealtimeinferenceinstancetypes)
     */
    public fun supportedRealtimeInferenceInstanceTypes(): List<String> =
        unwrap(this).getSupportedRealtimeInferenceInstanceTypes() ?: emptyList()

    /**
     * The supported MIME types for the output data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-inferencespecification.html#cfn-sagemaker-modelpackage-inferencespecification-supportedresponsemimetypes)
     */
    public fun supportedResponseMimeTypes(): List<String>

    /**
     * A list of the instance types on which a transformation job can be run or on which an endpoint
     * can be deployed.
     *
     * This parameter is required for unversioned models, and optional for versioned models.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-inferencespecification.html#cfn-sagemaker-modelpackage-inferencespecification-supportedtransforminstancetypes)
     */
    public fun supportedTransformInstanceTypes(): List<String> =
        unwrap(this).getSupportedTransformInstanceTypes() ?: emptyList()

    /**
     * A builder for [InferenceSpecificationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param containers The Amazon ECR registry path of the Docker image that contains the
       * inference code. 
       */
      public fun containers(containers: IResolvable)

      /**
       * @param containers The Amazon ECR registry path of the Docker image that contains the
       * inference code. 
       */
      public fun containers(containers: List<Any>)

      /**
       * @param containers The Amazon ECR registry path of the Docker image that contains the
       * inference code. 
       */
      public fun containers(vararg containers: Any)

      /**
       * @param supportedContentTypes The supported MIME types for the input data. 
       */
      public fun supportedContentTypes(supportedContentTypes: List<String>)

      /**
       * @param supportedContentTypes The supported MIME types for the input data. 
       */
      public fun supportedContentTypes(vararg supportedContentTypes: String)

      /**
       * @param supportedRealtimeInferenceInstanceTypes A list of the instance types that are used
       * to generate inferences in real-time.
       * This parameter is required for unversioned models, and optional for versioned models.
       */
      public
          fun supportedRealtimeInferenceInstanceTypes(supportedRealtimeInferenceInstanceTypes: List<String>)

      /**
       * @param supportedRealtimeInferenceInstanceTypes A list of the instance types that are used
       * to generate inferences in real-time.
       * This parameter is required for unversioned models, and optional for versioned models.
       */
      public fun supportedRealtimeInferenceInstanceTypes(vararg
          supportedRealtimeInferenceInstanceTypes: String)

      /**
       * @param supportedResponseMimeTypes The supported MIME types for the output data. 
       */
      public fun supportedResponseMimeTypes(supportedResponseMimeTypes: List<String>)

      /**
       * @param supportedResponseMimeTypes The supported MIME types for the output data. 
       */
      public fun supportedResponseMimeTypes(vararg supportedResponseMimeTypes: String)

      /**
       * @param supportedTransformInstanceTypes A list of the instance types on which a
       * transformation job can be run or on which an endpoint can be deployed.
       * This parameter is required for unversioned models, and optional for versioned models.
       */
      public fun supportedTransformInstanceTypes(supportedTransformInstanceTypes: List<String>)

      /**
       * @param supportedTransformInstanceTypes A list of the instance types on which a
       * transformation job can be run or on which an endpoint can be deployed.
       * This parameter is required for unversioned models, and optional for versioned models.
       */
      public fun supportedTransformInstanceTypes(vararg supportedTransformInstanceTypes: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.InferenceSpecificationProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.InferenceSpecificationProperty.builder()

      /**
       * @param containers The Amazon ECR registry path of the Docker image that contains the
       * inference code. 
       */
      override fun containers(containers: IResolvable) {
        cdkBuilder.containers(containers.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param containers The Amazon ECR registry path of the Docker image that contains the
       * inference code. 
       */
      override fun containers(containers: List<Any>) {
        cdkBuilder.containers(containers.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param containers The Amazon ECR registry path of the Docker image that contains the
       * inference code. 
       */
      override fun containers(vararg containers: Any): Unit = containers(containers.toList())

      /**
       * @param supportedContentTypes The supported MIME types for the input data. 
       */
      override fun supportedContentTypes(supportedContentTypes: List<String>) {
        cdkBuilder.supportedContentTypes(supportedContentTypes)
      }

      /**
       * @param supportedContentTypes The supported MIME types for the input data. 
       */
      override fun supportedContentTypes(vararg supportedContentTypes: String): Unit =
          supportedContentTypes(supportedContentTypes.toList())

      /**
       * @param supportedRealtimeInferenceInstanceTypes A list of the instance types that are used
       * to generate inferences in real-time.
       * This parameter is required for unversioned models, and optional for versioned models.
       */
      override
          fun supportedRealtimeInferenceInstanceTypes(supportedRealtimeInferenceInstanceTypes: List<String>) {
        cdkBuilder.supportedRealtimeInferenceInstanceTypes(supportedRealtimeInferenceInstanceTypes)
      }

      /**
       * @param supportedRealtimeInferenceInstanceTypes A list of the instance types that are used
       * to generate inferences in real-time.
       * This parameter is required for unversioned models, and optional for versioned models.
       */
      override fun supportedRealtimeInferenceInstanceTypes(vararg
          supportedRealtimeInferenceInstanceTypes: String): Unit =
          supportedRealtimeInferenceInstanceTypes(supportedRealtimeInferenceInstanceTypes.toList())

      /**
       * @param supportedResponseMimeTypes The supported MIME types for the output data. 
       */
      override fun supportedResponseMimeTypes(supportedResponseMimeTypes: List<String>) {
        cdkBuilder.supportedResponseMimeTypes(supportedResponseMimeTypes)
      }

      /**
       * @param supportedResponseMimeTypes The supported MIME types for the output data. 
       */
      override fun supportedResponseMimeTypes(vararg supportedResponseMimeTypes: String): Unit =
          supportedResponseMimeTypes(supportedResponseMimeTypes.toList())

      /**
       * @param supportedTransformInstanceTypes A list of the instance types on which a
       * transformation job can be run or on which an endpoint can be deployed.
       * This parameter is required for unversioned models, and optional for versioned models.
       */
      override fun supportedTransformInstanceTypes(supportedTransformInstanceTypes: List<String>) {
        cdkBuilder.supportedTransformInstanceTypes(supportedTransformInstanceTypes)
      }

      /**
       * @param supportedTransformInstanceTypes A list of the instance types on which a
       * transformation job can be run or on which an endpoint can be deployed.
       * This parameter is required for unversioned models, and optional for versioned models.
       */
      override fun supportedTransformInstanceTypes(vararg supportedTransformInstanceTypes: String):
          Unit = supportedTransformInstanceTypes(supportedTransformInstanceTypes.toList())

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.InferenceSpecificationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelPackage.InferenceSpecificationProperty,
    ) : CdkObject(cdkObject),
        InferenceSpecificationProperty {
      /**
       * The Amazon ECR registry path of the Docker image that contains the inference code.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-inferencespecification.html#cfn-sagemaker-modelpackage-inferencespecification-containers)
       */
      override fun containers(): Any = unwrap(this).getContainers()

      /**
       * The supported MIME types for the input data.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-inferencespecification.html#cfn-sagemaker-modelpackage-inferencespecification-supportedcontenttypes)
       */
      override fun supportedContentTypes(): List<String> = unwrap(this).getSupportedContentTypes()

      /**
       * A list of the instance types that are used to generate inferences in real-time.
       *
       * This parameter is required for unversioned models, and optional for versioned models.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-inferencespecification.html#cfn-sagemaker-modelpackage-inferencespecification-supportedrealtimeinferenceinstancetypes)
       */
      override fun supportedRealtimeInferenceInstanceTypes(): List<String> =
          unwrap(this).getSupportedRealtimeInferenceInstanceTypes() ?: emptyList()

      /**
       * The supported MIME types for the output data.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-inferencespecification.html#cfn-sagemaker-modelpackage-inferencespecification-supportedresponsemimetypes)
       */
      override fun supportedResponseMimeTypes(): List<String> =
          unwrap(this).getSupportedResponseMimeTypes()

      /**
       * A list of the instance types on which a transformation job can be run or on which an
       * endpoint can be deployed.
       *
       * This parameter is required for unversioned models, and optional for versioned models.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-inferencespecification.html#cfn-sagemaker-modelpackage-inferencespecification-supportedtransforminstancetypes)
       */
      override fun supportedTransformInstanceTypes(): List<String> =
          unwrap(this).getSupportedTransformInstanceTypes() ?: emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): InferenceSpecificationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelPackage.InferenceSpecificationProperty):
          InferenceSpecificationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          InferenceSpecificationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: InferenceSpecificationProperty):
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.InferenceSpecificationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.InferenceSpecificationProperty
    }
  }

  /**
   * Metadata properties of the tracking entity, trial, or trial component.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sagemaker.*;
   * MetadataPropertiesProperty metadataPropertiesProperty = MetadataPropertiesProperty.builder()
   * .commitId("commitId")
   * .generatedBy("generatedBy")
   * .projectId("projectId")
   * .repository("repository")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-metadataproperties.html)
   */
  public interface MetadataPropertiesProperty {
    /**
     * The commit ID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-metadataproperties.html#cfn-sagemaker-modelpackage-metadataproperties-commitid)
     */
    public fun commitId(): String? = unwrap(this).getCommitId()

    /**
     * The entity this entity was generated by.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-metadataproperties.html#cfn-sagemaker-modelpackage-metadataproperties-generatedby)
     */
    public fun generatedBy(): String? = unwrap(this).getGeneratedBy()

    /**
     * The project ID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-metadataproperties.html#cfn-sagemaker-modelpackage-metadataproperties-projectid)
     */
    public fun projectId(): String? = unwrap(this).getProjectId()

    /**
     * The repository.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-metadataproperties.html#cfn-sagemaker-modelpackage-metadataproperties-repository)
     */
    public fun repository(): String? = unwrap(this).getRepository()

    /**
     * A builder for [MetadataPropertiesProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param commitId The commit ID.
       */
      public fun commitId(commitId: String)

      /**
       * @param generatedBy The entity this entity was generated by.
       */
      public fun generatedBy(generatedBy: String)

      /**
       * @param projectId The project ID.
       */
      public fun projectId(projectId: String)

      /**
       * @param repository The repository.
       */
      public fun repository(repository: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.MetadataPropertiesProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.MetadataPropertiesProperty.builder()

      /**
       * @param commitId The commit ID.
       */
      override fun commitId(commitId: String) {
        cdkBuilder.commitId(commitId)
      }

      /**
       * @param generatedBy The entity this entity was generated by.
       */
      override fun generatedBy(generatedBy: String) {
        cdkBuilder.generatedBy(generatedBy)
      }

      /**
       * @param projectId The project ID.
       */
      override fun projectId(projectId: String) {
        cdkBuilder.projectId(projectId)
      }

      /**
       * @param repository The repository.
       */
      override fun repository(repository: String) {
        cdkBuilder.repository(repository)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.MetadataPropertiesProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelPackage.MetadataPropertiesProperty,
    ) : CdkObject(cdkObject),
        MetadataPropertiesProperty {
      /**
       * The commit ID.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-metadataproperties.html#cfn-sagemaker-modelpackage-metadataproperties-commitid)
       */
      override fun commitId(): String? = unwrap(this).getCommitId()

      /**
       * The entity this entity was generated by.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-metadataproperties.html#cfn-sagemaker-modelpackage-metadataproperties-generatedby)
       */
      override fun generatedBy(): String? = unwrap(this).getGeneratedBy()

      /**
       * The project ID.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-metadataproperties.html#cfn-sagemaker-modelpackage-metadataproperties-projectid)
       */
      override fun projectId(): String? = unwrap(this).getProjectId()

      /**
       * The repository.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-metadataproperties.html#cfn-sagemaker-modelpackage-metadataproperties-repository)
       */
      override fun repository(): String? = unwrap(this).getRepository()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): MetadataPropertiesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelPackage.MetadataPropertiesProperty):
          MetadataPropertiesProperty = CdkObjectWrappers.wrap(cdkObject) as?
          MetadataPropertiesProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: MetadataPropertiesProperty):
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.MetadataPropertiesProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.MetadataPropertiesProperty
    }
  }

  /**
   * Details about the metrics source.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sagemaker.*;
   * MetricsSourceProperty metricsSourceProperty = MetricsSourceProperty.builder()
   * .contentType("contentType")
   * .s3Uri("s3Uri")
   * // the properties below are optional
   * .contentDigest("contentDigest")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-metricssource.html)
   */
  public interface MetricsSourceProperty {
    /**
     * The hash key used for the metrics source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-metricssource.html#cfn-sagemaker-modelpackage-metricssource-contentdigest)
     */
    public fun contentDigest(): String? = unwrap(this).getContentDigest()

    /**
     * The metric source content type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-metricssource.html#cfn-sagemaker-modelpackage-metricssource-contenttype)
     */
    public fun contentType(): String

    /**
     * The S3 URI for the metrics source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-metricssource.html#cfn-sagemaker-modelpackage-metricssource-s3uri)
     */
    public fun s3Uri(): String

    /**
     * A builder for [MetricsSourceProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param contentDigest The hash key used for the metrics source.
       */
      public fun contentDigest(contentDigest: String)

      /**
       * @param contentType The metric source content type. 
       */
      public fun contentType(contentType: String)

      /**
       * @param s3Uri The S3 URI for the metrics source. 
       */
      public fun s3Uri(s3Uri: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.MetricsSourceProperty.Builder =
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.MetricsSourceProperty.builder()

      /**
       * @param contentDigest The hash key used for the metrics source.
       */
      override fun contentDigest(contentDigest: String) {
        cdkBuilder.contentDigest(contentDigest)
      }

      /**
       * @param contentType The metric source content type. 
       */
      override fun contentType(contentType: String) {
        cdkBuilder.contentType(contentType)
      }

      /**
       * @param s3Uri The S3 URI for the metrics source. 
       */
      override fun s3Uri(s3Uri: String) {
        cdkBuilder.s3Uri(s3Uri)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.MetricsSourceProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelPackage.MetricsSourceProperty,
    ) : CdkObject(cdkObject),
        MetricsSourceProperty {
      /**
       * The hash key used for the metrics source.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-metricssource.html#cfn-sagemaker-modelpackage-metricssource-contentdigest)
       */
      override fun contentDigest(): String? = unwrap(this).getContentDigest()

      /**
       * The metric source content type.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-metricssource.html#cfn-sagemaker-modelpackage-metricssource-contenttype)
       */
      override fun contentType(): String = unwrap(this).getContentType()

      /**
       * The S3 URI for the metrics source.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-metricssource.html#cfn-sagemaker-modelpackage-metricssource-s3uri)
       */
      override fun s3Uri(): String = unwrap(this).getS3Uri()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): MetricsSourceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelPackage.MetricsSourceProperty):
          MetricsSourceProperty = CdkObjectWrappers.wrap(cdkObject) as? MetricsSourceProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: MetricsSourceProperty):
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.MetricsSourceProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.MetricsSourceProperty
    }
  }

  /**
   * The access configuration file to control access to the ML model.
   *
   * You can explicitly accept the model end-user license agreement (EULA) within the
   * `ModelAccessConfig` .
   *
   * * If you are a Jumpstart user, see the [End-user license
   * agreements](https://docs.aws.amazon.com/sagemaker/latest/dg/jumpstart-foundation-models-choose.html#jumpstart-foundation-models-choose-eula)
   * section for more details on accepting the EULA.
   * * If you are an AutoML user, see the *Optional Parameters* section of *Create an AutoML job to
   * fine-tune text generation models using the API* for details on [How to set the EULA acceptance
   * when fine-tuning a model using the AutoML
   * API](https://docs.aws.amazon.com/sagemaker/latest/dg/autopilot-create-experiment-finetune-llms.html#autopilot-llms-finetuning-api-optional-params)
   * .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sagemaker.*;
   * ModelAccessConfigProperty modelAccessConfigProperty = ModelAccessConfigProperty.builder()
   * .acceptEula(false)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-modelaccessconfig.html)
   */
  public interface ModelAccessConfigProperty {
    /**
     * Specifies agreement to the model end-user license agreement (EULA).
     *
     * The `AcceptEula` value must be explicitly defined as `True` in order to accept the EULA that
     * this model requires. You are responsible for reviewing and complying with any applicable license
     * terms and making sure they are acceptable for your use case before downloading or using a model.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-modelaccessconfig.html#cfn-sagemaker-modelpackage-modelaccessconfig-accepteula)
     */
    public fun acceptEula(): Any

    /**
     * A builder for [ModelAccessConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param acceptEula Specifies agreement to the model end-user license agreement (EULA). 
       * The `AcceptEula` value must be explicitly defined as `True` in order to accept the EULA
       * that this model requires. You are responsible for reviewing and complying with any applicable
       * license terms and making sure they are acceptable for your use case before downloading or
       * using a model.
       */
      public fun acceptEula(acceptEula: Boolean)

      /**
       * @param acceptEula Specifies agreement to the model end-user license agreement (EULA). 
       * The `AcceptEula` value must be explicitly defined as `True` in order to accept the EULA
       * that this model requires. You are responsible for reviewing and complying with any applicable
       * license terms and making sure they are acceptable for your use case before downloading or
       * using a model.
       */
      public fun acceptEula(acceptEula: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.ModelAccessConfigProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.ModelAccessConfigProperty.builder()

      /**
       * @param acceptEula Specifies agreement to the model end-user license agreement (EULA). 
       * The `AcceptEula` value must be explicitly defined as `True` in order to accept the EULA
       * that this model requires. You are responsible for reviewing and complying with any applicable
       * license terms and making sure they are acceptable for your use case before downloading or
       * using a model.
       */
      override fun acceptEula(acceptEula: Boolean) {
        cdkBuilder.acceptEula(acceptEula)
      }

      /**
       * @param acceptEula Specifies agreement to the model end-user license agreement (EULA). 
       * The `AcceptEula` value must be explicitly defined as `True` in order to accept the EULA
       * that this model requires. You are responsible for reviewing and complying with any applicable
       * license terms and making sure they are acceptable for your use case before downloading or
       * using a model.
       */
      override fun acceptEula(acceptEula: IResolvable) {
        cdkBuilder.acceptEula(acceptEula.let(IResolvable.Companion::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.ModelAccessConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelPackage.ModelAccessConfigProperty,
    ) : CdkObject(cdkObject),
        ModelAccessConfigProperty {
      /**
       * Specifies agreement to the model end-user license agreement (EULA).
       *
       * The `AcceptEula` value must be explicitly defined as `True` in order to accept the EULA
       * that this model requires. You are responsible for reviewing and complying with any applicable
       * license terms and making sure they are acceptable for your use case before downloading or
       * using a model.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-modelaccessconfig.html#cfn-sagemaker-modelpackage-modelaccessconfig-accepteula)
       */
      override fun acceptEula(): Any = unwrap(this).getAcceptEula()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ModelAccessConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelPackage.ModelAccessConfigProperty):
          ModelAccessConfigProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ModelAccessConfigProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ModelAccessConfigProperty):
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.ModelAccessConfigProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.ModelAccessConfigProperty
    }
  }

  /**
   * An Amazon SageMaker Model Card.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sagemaker.*;
   * ModelCardProperty modelCardProperty = ModelCardProperty.builder()
   * .modelCardContent("modelCardContent")
   * .modelCardStatus("modelCardStatus")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-modelcard.html)
   */
  public interface ModelCardProperty {
    /**
     * The content of the model card.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-modelcard.html#cfn-sagemaker-modelpackage-modelcard-modelcardcontent)
     */
    public fun modelCardContent(): String

    /**
     * The approval status of the model card within your organization.
     *
     * Different organizations might have different criteria for model card review and approval.
     *
     * * `Draft` : The model card is a work in progress.
     * * `PendingReview` : The model card is pending review.
     * * `Approved` : The model card is approved.
     * * `Archived` : The model card is archived. No more updates should be made to the model card,
     * but it can still be exported.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-modelcard.html#cfn-sagemaker-modelpackage-modelcard-modelcardstatus)
     */
    public fun modelCardStatus(): String

    /**
     * A builder for [ModelCardProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param modelCardContent The content of the model card. 
       */
      public fun modelCardContent(modelCardContent: String)

      /**
       * @param modelCardStatus The approval status of the model card within your organization. 
       * Different organizations might have different criteria for model card review and approval.
       *
       * * `Draft` : The model card is a work in progress.
       * * `PendingReview` : The model card is pending review.
       * * `Approved` : The model card is approved.
       * * `Archived` : The model card is archived. No more updates should be made to the model
       * card, but it can still be exported.
       */
      public fun modelCardStatus(modelCardStatus: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.ModelCardProperty.Builder =
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.ModelCardProperty.builder()

      /**
       * @param modelCardContent The content of the model card. 
       */
      override fun modelCardContent(modelCardContent: String) {
        cdkBuilder.modelCardContent(modelCardContent)
      }

      /**
       * @param modelCardStatus The approval status of the model card within your organization. 
       * Different organizations might have different criteria for model card review and approval.
       *
       * * `Draft` : The model card is a work in progress.
       * * `PendingReview` : The model card is pending review.
       * * `Approved` : The model card is approved.
       * * `Archived` : The model card is archived. No more updates should be made to the model
       * card, but it can still be exported.
       */
      override fun modelCardStatus(modelCardStatus: String) {
        cdkBuilder.modelCardStatus(modelCardStatus)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.ModelCardProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelPackage.ModelCardProperty,
    ) : CdkObject(cdkObject),
        ModelCardProperty {
      /**
       * The content of the model card.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-modelcard.html#cfn-sagemaker-modelpackage-modelcard-modelcardcontent)
       */
      override fun modelCardContent(): String = unwrap(this).getModelCardContent()

      /**
       * The approval status of the model card within your organization.
       *
       * Different organizations might have different criteria for model card review and approval.
       *
       * * `Draft` : The model card is a work in progress.
       * * `PendingReview` : The model card is pending review.
       * * `Approved` : The model card is approved.
       * * `Archived` : The model card is archived. No more updates should be made to the model
       * card, but it can still be exported.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-modelcard.html#cfn-sagemaker-modelpackage-modelcard-modelcardstatus)
       */
      override fun modelCardStatus(): String = unwrap(this).getModelCardStatus()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ModelCardProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelPackage.ModelCardProperty):
          ModelCardProperty = CdkObjectWrappers.wrap(cdkObject) as? ModelCardProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: ModelCardProperty):
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.ModelCardProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.ModelCardProperty
    }
  }

  /**
   * Data quality constraints and statistics for a model.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sagemaker.*;
   * ModelDataQualityProperty modelDataQualityProperty = ModelDataQualityProperty.builder()
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-modeldataquality.html)
   */
  public interface ModelDataQualityProperty {
    /**
     * Data quality constraints for a model.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-modeldataquality.html#cfn-sagemaker-modelpackage-modeldataquality-constraints)
     */
    public fun constraints(): Any? = unwrap(this).getConstraints()

    /**
     * Data quality statistics for a model.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-modeldataquality.html#cfn-sagemaker-modelpackage-modeldataquality-statistics)
     */
    public fun statistics(): Any? = unwrap(this).getStatistics()

    /**
     * A builder for [ModelDataQualityProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param constraints Data quality constraints for a model.
       */
      public fun constraints(constraints: IResolvable)

      /**
       * @param constraints Data quality constraints for a model.
       */
      public fun constraints(constraints: MetricsSourceProperty)

      /**
       * @param constraints Data quality constraints for a model.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("17651debc01e0f4a93ea58087411e4cd218de64194b35b4c14b6973111e8813b")
      public fun constraints(constraints: MetricsSourceProperty.Builder.() -> Unit)

      /**
       * @param statistics Data quality statistics for a model.
       */
      public fun statistics(statistics: IResolvable)

      /**
       * @param statistics Data quality statistics for a model.
       */
      public fun statistics(statistics: MetricsSourceProperty)

      /**
       * @param statistics Data quality statistics for a model.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("eb2c82a1598873be70e3fa2ac906e01ecdbec14bf4b295e56ef6136ee268662f")
      public fun statistics(statistics: MetricsSourceProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.ModelDataQualityProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.ModelDataQualityProperty.builder()

      /**
       * @param constraints Data quality constraints for a model.
       */
      override fun constraints(constraints: IResolvable) {
        cdkBuilder.constraints(constraints.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param constraints Data quality constraints for a model.
       */
      override fun constraints(constraints: MetricsSourceProperty) {
        cdkBuilder.constraints(constraints.let(MetricsSourceProperty.Companion::unwrap))
      }

      /**
       * @param constraints Data quality constraints for a model.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("17651debc01e0f4a93ea58087411e4cd218de64194b35b4c14b6973111e8813b")
      override fun constraints(constraints: MetricsSourceProperty.Builder.() -> Unit): Unit =
          constraints(MetricsSourceProperty(constraints))

      /**
       * @param statistics Data quality statistics for a model.
       */
      override fun statistics(statistics: IResolvable) {
        cdkBuilder.statistics(statistics.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param statistics Data quality statistics for a model.
       */
      override fun statistics(statistics: MetricsSourceProperty) {
        cdkBuilder.statistics(statistics.let(MetricsSourceProperty.Companion::unwrap))
      }

      /**
       * @param statistics Data quality statistics for a model.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("eb2c82a1598873be70e3fa2ac906e01ecdbec14bf4b295e56ef6136ee268662f")
      override fun statistics(statistics: MetricsSourceProperty.Builder.() -> Unit): Unit =
          statistics(MetricsSourceProperty(statistics))

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.ModelDataQualityProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelPackage.ModelDataQualityProperty,
    ) : CdkObject(cdkObject),
        ModelDataQualityProperty {
      /**
       * Data quality constraints for a model.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-modeldataquality.html#cfn-sagemaker-modelpackage-modeldataquality-constraints)
       */
      override fun constraints(): Any? = unwrap(this).getConstraints()

      /**
       * Data quality statistics for a model.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-modeldataquality.html#cfn-sagemaker-modelpackage-modeldataquality-statistics)
       */
      override fun statistics(): Any? = unwrap(this).getStatistics()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ModelDataQualityProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelPackage.ModelDataQualityProperty):
          ModelDataQualityProperty = CdkObjectWrappers.wrap(cdkObject) as? ModelDataQualityProperty
          ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ModelDataQualityProperty):
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.ModelDataQualityProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.ModelDataQualityProperty
    }
  }

  /**
   * Specifies the location of ML model data to deploy.
   *
   * If specified, you must specify one and only one of the available data sources.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sagemaker.*;
   * ModelDataSourceProperty modelDataSourceProperty = ModelDataSourceProperty.builder()
   * .s3DataSource(S3ModelDataSourceProperty.builder()
   * .compressionType("compressionType")
   * .s3DataType("s3DataType")
   * .s3Uri("s3Uri")
   * // the properties below are optional
   * .modelAccessConfig(ModelAccessConfigProperty.builder()
   * .acceptEula(false)
   * .build())
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-modeldatasource.html)
   */
  public interface ModelDataSourceProperty {
    /**
     * Specifies the S3 location of ML model data to deploy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-modeldatasource.html#cfn-sagemaker-modelpackage-modeldatasource-s3datasource)
     */
    public fun s3DataSource(): Any? = unwrap(this).getS3DataSource()

    /**
     * A builder for [ModelDataSourceProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param s3DataSource Specifies the S3 location of ML model data to deploy.
       */
      public fun s3DataSource(s3DataSource: IResolvable)

      /**
       * @param s3DataSource Specifies the S3 location of ML model data to deploy.
       */
      public fun s3DataSource(s3DataSource: S3ModelDataSourceProperty)

      /**
       * @param s3DataSource Specifies the S3 location of ML model data to deploy.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e9a8bac1439e821c678c0a604f794c23f9d40b11f6c059b6d8dbc6a176fa8f6d")
      public fun s3DataSource(s3DataSource: S3ModelDataSourceProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.ModelDataSourceProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.ModelDataSourceProperty.builder()

      /**
       * @param s3DataSource Specifies the S3 location of ML model data to deploy.
       */
      override fun s3DataSource(s3DataSource: IResolvable) {
        cdkBuilder.s3DataSource(s3DataSource.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param s3DataSource Specifies the S3 location of ML model data to deploy.
       */
      override fun s3DataSource(s3DataSource: S3ModelDataSourceProperty) {
        cdkBuilder.s3DataSource(s3DataSource.let(S3ModelDataSourceProperty.Companion::unwrap))
      }

      /**
       * @param s3DataSource Specifies the S3 location of ML model data to deploy.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e9a8bac1439e821c678c0a604f794c23f9d40b11f6c059b6d8dbc6a176fa8f6d")
      override fun s3DataSource(s3DataSource: S3ModelDataSourceProperty.Builder.() -> Unit): Unit =
          s3DataSource(S3ModelDataSourceProperty(s3DataSource))

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.ModelDataSourceProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelPackage.ModelDataSourceProperty,
    ) : CdkObject(cdkObject),
        ModelDataSourceProperty {
      /**
       * Specifies the S3 location of ML model data to deploy.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-modeldatasource.html#cfn-sagemaker-modelpackage-modeldatasource-s3datasource)
       */
      override fun s3DataSource(): Any? = unwrap(this).getS3DataSource()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ModelDataSourceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelPackage.ModelDataSourceProperty):
          ModelDataSourceProperty = CdkObjectWrappers.wrap(cdkObject) as? ModelDataSourceProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: ModelDataSourceProperty):
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.ModelDataSourceProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.ModelDataSourceProperty
    }
  }

  /**
   * Input object for the model.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sagemaker.*;
   * ModelInputProperty modelInputProperty = ModelInputProperty.builder()
   * .dataInputConfig("dataInputConfig")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-modelinput.html)
   */
  public interface ModelInputProperty {
    /**
     * The input configuration object for the model.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-modelinput.html#cfn-sagemaker-modelpackage-modelinput-datainputconfig)
     */
    public fun dataInputConfig(): String

    /**
     * A builder for [ModelInputProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param dataInputConfig The input configuration object for the model. 
       */
      public fun dataInputConfig(dataInputConfig: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.ModelInputProperty.Builder =
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.ModelInputProperty.builder()

      /**
       * @param dataInputConfig The input configuration object for the model. 
       */
      override fun dataInputConfig(dataInputConfig: String) {
        cdkBuilder.dataInputConfig(dataInputConfig)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.ModelInputProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelPackage.ModelInputProperty,
    ) : CdkObject(cdkObject),
        ModelInputProperty {
      /**
       * The input configuration object for the model.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-modelinput.html#cfn-sagemaker-modelpackage-modelinput-datainputconfig)
       */
      override fun dataInputConfig(): String = unwrap(this).getDataInputConfig()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ModelInputProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelPackage.ModelInputProperty):
          ModelInputProperty = CdkObjectWrappers.wrap(cdkObject) as? ModelInputProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: ModelInputProperty):
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.ModelInputProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.ModelInputProperty
    }
  }

  /**
   * Contains metrics captured from a model.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sagemaker.*;
   * ModelMetricsProperty modelMetricsProperty = ModelMetricsProperty.builder()
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-modelmetrics.html)
   */
  public interface ModelMetricsProperty {
    /**
     * Metrics that measure bias in a model.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-modelmetrics.html#cfn-sagemaker-modelpackage-modelmetrics-bias)
     */
    public fun bias(): Any? = unwrap(this).getBias()

    /**
     * Metrics that help explain a model.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-modelmetrics.html#cfn-sagemaker-modelpackage-modelmetrics-explainability)
     */
    public fun explainability(): Any? = unwrap(this).getExplainability()

    /**
     * Metrics that measure the quality of the input data for a model.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-modelmetrics.html#cfn-sagemaker-modelpackage-modelmetrics-modeldataquality)
     */
    public fun modelDataQuality(): Any? = unwrap(this).getModelDataQuality()

    /**
     * Metrics that measure the quality of a model.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-modelmetrics.html#cfn-sagemaker-modelpackage-modelmetrics-modelquality)
     */
    public fun modelQuality(): Any? = unwrap(this).getModelQuality()

    /**
     * A builder for [ModelMetricsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param bias Metrics that measure bias in a model.
       */
      public fun bias(bias: IResolvable)

      /**
       * @param bias Metrics that measure bias in a model.
       */
      public fun bias(bias: BiasProperty)

      /**
       * @param bias Metrics that measure bias in a model.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8be727ee25583c3ec6c29082be1cc7efe7e399e251b55833351731e30898d433")
      public fun bias(bias: BiasProperty.Builder.() -> Unit)

      /**
       * @param explainability Metrics that help explain a model.
       */
      public fun explainability(explainability: IResolvable)

      /**
       * @param explainability Metrics that help explain a model.
       */
      public fun explainability(explainability: ExplainabilityProperty)

      /**
       * @param explainability Metrics that help explain a model.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("757bf78a4853ff1eeaa98fd44d4a3e2086fc93915276e3c2a24c189519a37535")
      public fun explainability(explainability: ExplainabilityProperty.Builder.() -> Unit)

      /**
       * @param modelDataQuality Metrics that measure the quality of the input data for a model.
       */
      public fun modelDataQuality(modelDataQuality: IResolvable)

      /**
       * @param modelDataQuality Metrics that measure the quality of the input data for a model.
       */
      public fun modelDataQuality(modelDataQuality: ModelDataQualityProperty)

      /**
       * @param modelDataQuality Metrics that measure the quality of the input data for a model.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b81ba8038bb18b1965a4318a2c20631d369068a2c2895334d9620ed104af4d54")
      public fun modelDataQuality(modelDataQuality: ModelDataQualityProperty.Builder.() -> Unit)

      /**
       * @param modelQuality Metrics that measure the quality of a model.
       */
      public fun modelQuality(modelQuality: IResolvable)

      /**
       * @param modelQuality Metrics that measure the quality of a model.
       */
      public fun modelQuality(modelQuality: ModelQualityProperty)

      /**
       * @param modelQuality Metrics that measure the quality of a model.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("eaf636a529385f397ecc8e6d59ffda0a3cd8c70617aea70d09e99a3092d3202f")
      public fun modelQuality(modelQuality: ModelQualityProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.ModelMetricsProperty.Builder =
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.ModelMetricsProperty.builder()

      /**
       * @param bias Metrics that measure bias in a model.
       */
      override fun bias(bias: IResolvable) {
        cdkBuilder.bias(bias.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param bias Metrics that measure bias in a model.
       */
      override fun bias(bias: BiasProperty) {
        cdkBuilder.bias(bias.let(BiasProperty.Companion::unwrap))
      }

      /**
       * @param bias Metrics that measure bias in a model.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8be727ee25583c3ec6c29082be1cc7efe7e399e251b55833351731e30898d433")
      override fun bias(bias: BiasProperty.Builder.() -> Unit): Unit = bias(BiasProperty(bias))

      /**
       * @param explainability Metrics that help explain a model.
       */
      override fun explainability(explainability: IResolvable) {
        cdkBuilder.explainability(explainability.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param explainability Metrics that help explain a model.
       */
      override fun explainability(explainability: ExplainabilityProperty) {
        cdkBuilder.explainability(explainability.let(ExplainabilityProperty.Companion::unwrap))
      }

      /**
       * @param explainability Metrics that help explain a model.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("757bf78a4853ff1eeaa98fd44d4a3e2086fc93915276e3c2a24c189519a37535")
      override fun explainability(explainability: ExplainabilityProperty.Builder.() -> Unit): Unit =
          explainability(ExplainabilityProperty(explainability))

      /**
       * @param modelDataQuality Metrics that measure the quality of the input data for a model.
       */
      override fun modelDataQuality(modelDataQuality: IResolvable) {
        cdkBuilder.modelDataQuality(modelDataQuality.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param modelDataQuality Metrics that measure the quality of the input data for a model.
       */
      override fun modelDataQuality(modelDataQuality: ModelDataQualityProperty) {
        cdkBuilder.modelDataQuality(modelDataQuality.let(ModelDataQualityProperty.Companion::unwrap))
      }

      /**
       * @param modelDataQuality Metrics that measure the quality of the input data for a model.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b81ba8038bb18b1965a4318a2c20631d369068a2c2895334d9620ed104af4d54")
      override fun modelDataQuality(modelDataQuality: ModelDataQualityProperty.Builder.() -> Unit):
          Unit = modelDataQuality(ModelDataQualityProperty(modelDataQuality))

      /**
       * @param modelQuality Metrics that measure the quality of a model.
       */
      override fun modelQuality(modelQuality: IResolvable) {
        cdkBuilder.modelQuality(modelQuality.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param modelQuality Metrics that measure the quality of a model.
       */
      override fun modelQuality(modelQuality: ModelQualityProperty) {
        cdkBuilder.modelQuality(modelQuality.let(ModelQualityProperty.Companion::unwrap))
      }

      /**
       * @param modelQuality Metrics that measure the quality of a model.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("eaf636a529385f397ecc8e6d59ffda0a3cd8c70617aea70d09e99a3092d3202f")
      override fun modelQuality(modelQuality: ModelQualityProperty.Builder.() -> Unit): Unit =
          modelQuality(ModelQualityProperty(modelQuality))

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.ModelMetricsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelPackage.ModelMetricsProperty,
    ) : CdkObject(cdkObject),
        ModelMetricsProperty {
      /**
       * Metrics that measure bias in a model.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-modelmetrics.html#cfn-sagemaker-modelpackage-modelmetrics-bias)
       */
      override fun bias(): Any? = unwrap(this).getBias()

      /**
       * Metrics that help explain a model.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-modelmetrics.html#cfn-sagemaker-modelpackage-modelmetrics-explainability)
       */
      override fun explainability(): Any? = unwrap(this).getExplainability()

      /**
       * Metrics that measure the quality of the input data for a model.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-modelmetrics.html#cfn-sagemaker-modelpackage-modelmetrics-modeldataquality)
       */
      override fun modelDataQuality(): Any? = unwrap(this).getModelDataQuality()

      /**
       * Metrics that measure the quality of a model.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-modelmetrics.html#cfn-sagemaker-modelpackage-modelmetrics-modelquality)
       */
      override fun modelQuality(): Any? = unwrap(this).getModelQuality()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ModelMetricsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelPackage.ModelMetricsProperty):
          ModelMetricsProperty = CdkObjectWrappers.wrap(cdkObject) as? ModelMetricsProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: ModelMetricsProperty):
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.ModelMetricsProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.ModelMetricsProperty
    }
  }

  /**
   * Describes the Docker container for the model package.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sagemaker.*;
   * Object modelInput;
   * ModelPackageContainerDefinitionProperty modelPackageContainerDefinitionProperty =
   * ModelPackageContainerDefinitionProperty.builder()
   * .image("image")
   * // the properties below are optional
   * .containerHostname("containerHostname")
   * .environment(Map.of(
   * "environmentKey", "environment"))
   * .framework("framework")
   * .frameworkVersion("frameworkVersion")
   * .imageDigest("imageDigest")
   * .modelDataSource(ModelDataSourceProperty.builder()
   * .s3DataSource(S3ModelDataSourceProperty.builder()
   * .compressionType("compressionType")
   * .s3DataType("s3DataType")
   * .s3Uri("s3Uri")
   * // the properties below are optional
   * .modelAccessConfig(ModelAccessConfigProperty.builder()
   * .acceptEula(false)
   * .build())
   * .build())
   * .build())
   * .modelDataUrl("modelDataUrl")
   * .modelInput(modelInput)
   * .nearestModelName("nearestModelName")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-modelpackagecontainerdefinition.html)
   */
  public interface ModelPackageContainerDefinitionProperty {
    /**
     * The DNS host name for the Docker container.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-modelpackagecontainerdefinition.html#cfn-sagemaker-modelpackage-modelpackagecontainerdefinition-containerhostname)
     */
    public fun containerHostname(): String? = unwrap(this).getContainerHostname()

    /**
     * The environment variables to set in the Docker container.
     *
     * Each key and value in the `Environment` string to string map can have length of up to 1024.
     * We support up to 16 entries in the map.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-modelpackagecontainerdefinition.html#cfn-sagemaker-modelpackage-modelpackagecontainerdefinition-environment)
     */
    public fun environment(): Any? = unwrap(this).getEnvironment()

    /**
     * The machine learning framework of the model package container image.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-modelpackagecontainerdefinition.html#cfn-sagemaker-modelpackage-modelpackagecontainerdefinition-framework)
     */
    public fun framework(): String? = unwrap(this).getFramework()

    /**
     * The framework version of the Model Package Container Image.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-modelpackagecontainerdefinition.html#cfn-sagemaker-modelpackage-modelpackagecontainerdefinition-frameworkversion)
     */
    public fun frameworkVersion(): String? = unwrap(this).getFrameworkVersion()

    /**
     * The Amazon EC2 Container Registry (Amazon ECR) path where inference code is stored.
     *
     * If you are using your own custom algorithm instead of an algorithm provided by SageMaker, the
     * inference code must meet SageMaker requirements. SageMaker supports both
     * `registry/repository[:tag]` and `registry/repository[&#64;digest]` image path formats. For more
     * information, see [Using Your Own Algorithms with Amazon
     * SageMaker](https://docs.aws.amazon.com/sagemaker/latest/dg/your-algorithms.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-modelpackagecontainerdefinition.html#cfn-sagemaker-modelpackage-modelpackagecontainerdefinition-image)
     */
    public fun image(): String

    /**
     * An MD5 hash of the training algorithm that identifies the Docker image used for training.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-modelpackagecontainerdefinition.html#cfn-sagemaker-modelpackage-modelpackagecontainerdefinition-imagedigest)
     */
    public fun imageDigest(): String? = unwrap(this).getImageDigest()

    /**
     * Specifies the location of ML model data to deploy during endpoint creation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-modelpackagecontainerdefinition.html#cfn-sagemaker-modelpackage-modelpackagecontainerdefinition-modeldatasource)
     */
    public fun modelDataSource(): Any? = unwrap(this).getModelDataSource()

    /**
     * The Amazon S3 path where the model artifacts, which result from model training, are stored.
     *
     * This path must point to a single `gzip` compressed tar archive ( `.tar.gz` suffix).
     *
     *
     * The model artifacts must be in an S3 bucket that is in the same region as the model package.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-modelpackagecontainerdefinition.html#cfn-sagemaker-modelpackage-modelpackagecontainerdefinition-modeldataurl)
     */
    public fun modelDataUrl(): String? = unwrap(this).getModelDataUrl()

    /**
     * A structure with Model Input details.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-modelpackagecontainerdefinition.html#cfn-sagemaker-modelpackage-modelpackagecontainerdefinition-modelinput)
     */
    public fun modelInput(): Any? = unwrap(this).getModelInput()

    /**
     * The name of a pre-trained machine learning benchmarked by Amazon SageMaker Inference
     * Recommender model that matches your model.
     *
     * You can find a list of benchmarked models by calling `ListModelMetadata` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-modelpackagecontainerdefinition.html#cfn-sagemaker-modelpackage-modelpackagecontainerdefinition-nearestmodelname)
     */
    public fun nearestModelName(): String? = unwrap(this).getNearestModelName()

    /**
     * A builder for [ModelPackageContainerDefinitionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param containerHostname The DNS host name for the Docker container.
       */
      public fun containerHostname(containerHostname: String)

      /**
       * @param environment The environment variables to set in the Docker container.
       * Each key and value in the `Environment` string to string map can have length of up to 1024.
       * We support up to 16 entries in the map.
       */
      public fun environment(environment: IResolvable)

      /**
       * @param environment The environment variables to set in the Docker container.
       * Each key and value in the `Environment` string to string map can have length of up to 1024.
       * We support up to 16 entries in the map.
       */
      public fun environment(environment: Map<String, String>)

      /**
       * @param framework The machine learning framework of the model package container image.
       */
      public fun framework(framework: String)

      /**
       * @param frameworkVersion The framework version of the Model Package Container Image.
       */
      public fun frameworkVersion(frameworkVersion: String)

      /**
       * @param image The Amazon EC2 Container Registry (Amazon ECR) path where inference code is
       * stored. 
       * If you are using your own custom algorithm instead of an algorithm provided by SageMaker,
       * the inference code must meet SageMaker requirements. SageMaker supports both
       * `registry/repository[:tag]` and `registry/repository[&#64;digest]` image path formats. For
       * more information, see [Using Your Own Algorithms with Amazon
       * SageMaker](https://docs.aws.amazon.com/sagemaker/latest/dg/your-algorithms.html) .
       */
      public fun image(image: String)

      /**
       * @param imageDigest An MD5 hash of the training algorithm that identifies the Docker image
       * used for training.
       */
      public fun imageDigest(imageDigest: String)

      /**
       * @param modelDataSource Specifies the location of ML model data to deploy during endpoint
       * creation.
       */
      public fun modelDataSource(modelDataSource: IResolvable)

      /**
       * @param modelDataSource Specifies the location of ML model data to deploy during endpoint
       * creation.
       */
      public fun modelDataSource(modelDataSource: ModelDataSourceProperty)

      /**
       * @param modelDataSource Specifies the location of ML model data to deploy during endpoint
       * creation.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e954eb586b720211c99d4d6bbf40cbb758870e5ad831005ef5022ff7253faa92")
      public fun modelDataSource(modelDataSource: ModelDataSourceProperty.Builder.() -> Unit)

      /**
       * @param modelDataUrl The Amazon S3 path where the model artifacts, which result from model
       * training, are stored.
       * This path must point to a single `gzip` compressed tar archive ( `.tar.gz` suffix).
       *
       *
       * The model artifacts must be in an S3 bucket that is in the same region as the model
       * package.
       */
      public fun modelDataUrl(modelDataUrl: String)

      /**
       * @param modelInput A structure with Model Input details.
       */
      public fun modelInput(modelInput: Any)

      /**
       * @param nearestModelName The name of a pre-trained machine learning benchmarked by Amazon
       * SageMaker Inference Recommender model that matches your model.
       * You can find a list of benchmarked models by calling `ListModelMetadata` .
       */
      public fun nearestModelName(nearestModelName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.ModelPackageContainerDefinitionProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.ModelPackageContainerDefinitionProperty.builder()

      /**
       * @param containerHostname The DNS host name for the Docker container.
       */
      override fun containerHostname(containerHostname: String) {
        cdkBuilder.containerHostname(containerHostname)
      }

      /**
       * @param environment The environment variables to set in the Docker container.
       * Each key and value in the `Environment` string to string map can have length of up to 1024.
       * We support up to 16 entries in the map.
       */
      override fun environment(environment: IResolvable) {
        cdkBuilder.environment(environment.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param environment The environment variables to set in the Docker container.
       * Each key and value in the `Environment` string to string map can have length of up to 1024.
       * We support up to 16 entries in the map.
       */
      override fun environment(environment: Map<String, String>) {
        cdkBuilder.environment(environment)
      }

      /**
       * @param framework The machine learning framework of the model package container image.
       */
      override fun framework(framework: String) {
        cdkBuilder.framework(framework)
      }

      /**
       * @param frameworkVersion The framework version of the Model Package Container Image.
       */
      override fun frameworkVersion(frameworkVersion: String) {
        cdkBuilder.frameworkVersion(frameworkVersion)
      }

      /**
       * @param image The Amazon EC2 Container Registry (Amazon ECR) path where inference code is
       * stored. 
       * If you are using your own custom algorithm instead of an algorithm provided by SageMaker,
       * the inference code must meet SageMaker requirements. SageMaker supports both
       * `registry/repository[:tag]` and `registry/repository[&#64;digest]` image path formats. For
       * more information, see [Using Your Own Algorithms with Amazon
       * SageMaker](https://docs.aws.amazon.com/sagemaker/latest/dg/your-algorithms.html) .
       */
      override fun image(image: String) {
        cdkBuilder.image(image)
      }

      /**
       * @param imageDigest An MD5 hash of the training algorithm that identifies the Docker image
       * used for training.
       */
      override fun imageDigest(imageDigest: String) {
        cdkBuilder.imageDigest(imageDigest)
      }

      /**
       * @param modelDataSource Specifies the location of ML model data to deploy during endpoint
       * creation.
       */
      override fun modelDataSource(modelDataSource: IResolvable) {
        cdkBuilder.modelDataSource(modelDataSource.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param modelDataSource Specifies the location of ML model data to deploy during endpoint
       * creation.
       */
      override fun modelDataSource(modelDataSource: ModelDataSourceProperty) {
        cdkBuilder.modelDataSource(modelDataSource.let(ModelDataSourceProperty.Companion::unwrap))
      }

      /**
       * @param modelDataSource Specifies the location of ML model data to deploy during endpoint
       * creation.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e954eb586b720211c99d4d6bbf40cbb758870e5ad831005ef5022ff7253faa92")
      override fun modelDataSource(modelDataSource: ModelDataSourceProperty.Builder.() -> Unit):
          Unit = modelDataSource(ModelDataSourceProperty(modelDataSource))

      /**
       * @param modelDataUrl The Amazon S3 path where the model artifacts, which result from model
       * training, are stored.
       * This path must point to a single `gzip` compressed tar archive ( `.tar.gz` suffix).
       *
       *
       * The model artifacts must be in an S3 bucket that is in the same region as the model
       * package.
       */
      override fun modelDataUrl(modelDataUrl: String) {
        cdkBuilder.modelDataUrl(modelDataUrl)
      }

      /**
       * @param modelInput A structure with Model Input details.
       */
      override fun modelInput(modelInput: Any) {
        cdkBuilder.modelInput(modelInput)
      }

      /**
       * @param nearestModelName The name of a pre-trained machine learning benchmarked by Amazon
       * SageMaker Inference Recommender model that matches your model.
       * You can find a list of benchmarked models by calling `ListModelMetadata` .
       */
      override fun nearestModelName(nearestModelName: String) {
        cdkBuilder.nearestModelName(nearestModelName)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.ModelPackageContainerDefinitionProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelPackage.ModelPackageContainerDefinitionProperty,
    ) : CdkObject(cdkObject),
        ModelPackageContainerDefinitionProperty {
      /**
       * The DNS host name for the Docker container.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-modelpackagecontainerdefinition.html#cfn-sagemaker-modelpackage-modelpackagecontainerdefinition-containerhostname)
       */
      override fun containerHostname(): String? = unwrap(this).getContainerHostname()

      /**
       * The environment variables to set in the Docker container.
       *
       * Each key and value in the `Environment` string to string map can have length of up to 1024.
       * We support up to 16 entries in the map.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-modelpackagecontainerdefinition.html#cfn-sagemaker-modelpackage-modelpackagecontainerdefinition-environment)
       */
      override fun environment(): Any? = unwrap(this).getEnvironment()

      /**
       * The machine learning framework of the model package container image.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-modelpackagecontainerdefinition.html#cfn-sagemaker-modelpackage-modelpackagecontainerdefinition-framework)
       */
      override fun framework(): String? = unwrap(this).getFramework()

      /**
       * The framework version of the Model Package Container Image.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-modelpackagecontainerdefinition.html#cfn-sagemaker-modelpackage-modelpackagecontainerdefinition-frameworkversion)
       */
      override fun frameworkVersion(): String? = unwrap(this).getFrameworkVersion()

      /**
       * The Amazon EC2 Container Registry (Amazon ECR) path where inference code is stored.
       *
       * If you are using your own custom algorithm instead of an algorithm provided by SageMaker,
       * the inference code must meet SageMaker requirements. SageMaker supports both
       * `registry/repository[:tag]` and `registry/repository[&#64;digest]` image path formats. For
       * more information, see [Using Your Own Algorithms with Amazon
       * SageMaker](https://docs.aws.amazon.com/sagemaker/latest/dg/your-algorithms.html) .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-modelpackagecontainerdefinition.html#cfn-sagemaker-modelpackage-modelpackagecontainerdefinition-image)
       */
      override fun image(): String = unwrap(this).getImage()

      /**
       * An MD5 hash of the training algorithm that identifies the Docker image used for training.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-modelpackagecontainerdefinition.html#cfn-sagemaker-modelpackage-modelpackagecontainerdefinition-imagedigest)
       */
      override fun imageDigest(): String? = unwrap(this).getImageDigest()

      /**
       * Specifies the location of ML model data to deploy during endpoint creation.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-modelpackagecontainerdefinition.html#cfn-sagemaker-modelpackage-modelpackagecontainerdefinition-modeldatasource)
       */
      override fun modelDataSource(): Any? = unwrap(this).getModelDataSource()

      /**
       * The Amazon S3 path where the model artifacts, which result from model training, are stored.
       *
       * This path must point to a single `gzip` compressed tar archive ( `.tar.gz` suffix).
       *
       *
       * The model artifacts must be in an S3 bucket that is in the same region as the model
       * package.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-modelpackagecontainerdefinition.html#cfn-sagemaker-modelpackage-modelpackagecontainerdefinition-modeldataurl)
       */
      override fun modelDataUrl(): String? = unwrap(this).getModelDataUrl()

      /**
       * A structure with Model Input details.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-modelpackagecontainerdefinition.html#cfn-sagemaker-modelpackage-modelpackagecontainerdefinition-modelinput)
       */
      override fun modelInput(): Any? = unwrap(this).getModelInput()

      /**
       * The name of a pre-trained machine learning benchmarked by Amazon SageMaker Inference
       * Recommender model that matches your model.
       *
       * You can find a list of benchmarked models by calling `ListModelMetadata` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-modelpackagecontainerdefinition.html#cfn-sagemaker-modelpackage-modelpackagecontainerdefinition-nearestmodelname)
       */
      override fun nearestModelName(): String? = unwrap(this).getNearestModelName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          ModelPackageContainerDefinitionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelPackage.ModelPackageContainerDefinitionProperty):
          ModelPackageContainerDefinitionProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ModelPackageContainerDefinitionProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ModelPackageContainerDefinitionProperty):
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.ModelPackageContainerDefinitionProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.ModelPackageContainerDefinitionProperty
    }
  }

  /**
   * Specifies the validation and image scan statuses of the model package.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sagemaker.*;
   * ModelPackageStatusDetailsProperty modelPackageStatusDetailsProperty =
   * ModelPackageStatusDetailsProperty.builder()
   * .validationStatuses(List.of(ModelPackageStatusItemProperty.builder()
   * .name("name")
   * .status("status")
   * // the properties below are optional
   * .failureReason("failureReason")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-modelpackagestatusdetails.html)
   */
  public interface ModelPackageStatusDetailsProperty {
    /**
     * The validation status of the model package.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-modelpackagestatusdetails.html#cfn-sagemaker-modelpackage-modelpackagestatusdetails-validationstatuses)
     */
    public fun validationStatuses(): Any? = unwrap(this).getValidationStatuses()

    /**
     * A builder for [ModelPackageStatusDetailsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param validationStatuses The validation status of the model package.
       */
      public fun validationStatuses(validationStatuses: IResolvable)

      /**
       * @param validationStatuses The validation status of the model package.
       */
      public fun validationStatuses(validationStatuses: List<Any>)

      /**
       * @param validationStatuses The validation status of the model package.
       */
      public fun validationStatuses(vararg validationStatuses: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.ModelPackageStatusDetailsProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.ModelPackageStatusDetailsProperty.builder()

      /**
       * @param validationStatuses The validation status of the model package.
       */
      override fun validationStatuses(validationStatuses: IResolvable) {
        cdkBuilder.validationStatuses(validationStatuses.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param validationStatuses The validation status of the model package.
       */
      override fun validationStatuses(validationStatuses: List<Any>) {
        cdkBuilder.validationStatuses(validationStatuses.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param validationStatuses The validation status of the model package.
       */
      override fun validationStatuses(vararg validationStatuses: Any): Unit =
          validationStatuses(validationStatuses.toList())

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.ModelPackageStatusDetailsProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelPackage.ModelPackageStatusDetailsProperty,
    ) : CdkObject(cdkObject),
        ModelPackageStatusDetailsProperty {
      /**
       * The validation status of the model package.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-modelpackagestatusdetails.html#cfn-sagemaker-modelpackage-modelpackagestatusdetails-validationstatuses)
       */
      override fun validationStatuses(): Any? = unwrap(this).getValidationStatuses()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          ModelPackageStatusDetailsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelPackage.ModelPackageStatusDetailsProperty):
          ModelPackageStatusDetailsProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ModelPackageStatusDetailsProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ModelPackageStatusDetailsProperty):
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.ModelPackageStatusDetailsProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.ModelPackageStatusDetailsProperty
    }
  }

  /**
   * Represents the overall status of a model package.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sagemaker.*;
   * ModelPackageStatusItemProperty modelPackageStatusItemProperty =
   * ModelPackageStatusItemProperty.builder()
   * .name("name")
   * .status("status")
   * // the properties below are optional
   * .failureReason("failureReason")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-modelpackagestatusitem.html)
   */
  public interface ModelPackageStatusItemProperty {
    /**
     * if the overall status is `Failed` , the reason for the failure.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-modelpackagestatusitem.html#cfn-sagemaker-modelpackage-modelpackagestatusitem-failurereason)
     */
    public fun failureReason(): String? = unwrap(this).getFailureReason()

    /**
     * The name of the model package for which the overall status is being reported.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-modelpackagestatusitem.html#cfn-sagemaker-modelpackage-modelpackagestatusitem-name)
     */
    public fun name(): String

    /**
     * The current status.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-modelpackagestatusitem.html#cfn-sagemaker-modelpackage-modelpackagestatusitem-status)
     */
    public fun status(): String

    /**
     * A builder for [ModelPackageStatusItemProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param failureReason if the overall status is `Failed` , the reason for the failure.
       */
      public fun failureReason(failureReason: String)

      /**
       * @param name The name of the model package for which the overall status is being reported. 
       */
      public fun name(name: String)

      /**
       * @param status The current status. 
       */
      public fun status(status: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.ModelPackageStatusItemProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.ModelPackageStatusItemProperty.builder()

      /**
       * @param failureReason if the overall status is `Failed` , the reason for the failure.
       */
      override fun failureReason(failureReason: String) {
        cdkBuilder.failureReason(failureReason)
      }

      /**
       * @param name The name of the model package for which the overall status is being reported. 
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      /**
       * @param status The current status. 
       */
      override fun status(status: String) {
        cdkBuilder.status(status)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.ModelPackageStatusItemProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelPackage.ModelPackageStatusItemProperty,
    ) : CdkObject(cdkObject),
        ModelPackageStatusItemProperty {
      /**
       * if the overall status is `Failed` , the reason for the failure.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-modelpackagestatusitem.html#cfn-sagemaker-modelpackage-modelpackagestatusitem-failurereason)
       */
      override fun failureReason(): String? = unwrap(this).getFailureReason()

      /**
       * The name of the model package for which the overall status is being reported.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-modelpackagestatusitem.html#cfn-sagemaker-modelpackage-modelpackagestatusitem-name)
       */
      override fun name(): String = unwrap(this).getName()

      /**
       * The current status.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-modelpackagestatusitem.html#cfn-sagemaker-modelpackage-modelpackagestatusitem-status)
       */
      override fun status(): String = unwrap(this).getStatus()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ModelPackageStatusItemProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelPackage.ModelPackageStatusItemProperty):
          ModelPackageStatusItemProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ModelPackageStatusItemProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ModelPackageStatusItemProperty):
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.ModelPackageStatusItemProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.ModelPackageStatusItemProperty
    }
  }

  /**
   * Model quality statistics and constraints.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sagemaker.*;
   * ModelQualityProperty modelQualityProperty = ModelQualityProperty.builder()
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-modelquality.html)
   */
  public interface ModelQualityProperty {
    /**
     * Model quality constraints.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-modelquality.html#cfn-sagemaker-modelpackage-modelquality-constraints)
     */
    public fun constraints(): Any? = unwrap(this).getConstraints()

    /**
     * Model quality statistics.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-modelquality.html#cfn-sagemaker-modelpackage-modelquality-statistics)
     */
    public fun statistics(): Any? = unwrap(this).getStatistics()

    /**
     * A builder for [ModelQualityProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param constraints Model quality constraints.
       */
      public fun constraints(constraints: IResolvable)

      /**
       * @param constraints Model quality constraints.
       */
      public fun constraints(constraints: MetricsSourceProperty)

      /**
       * @param constraints Model quality constraints.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8d421f451d6edcc7575ec206c2f7fc907831a315f1b8d72e3d9c37ba1d230d65")
      public fun constraints(constraints: MetricsSourceProperty.Builder.() -> Unit)

      /**
       * @param statistics Model quality statistics.
       */
      public fun statistics(statistics: IResolvable)

      /**
       * @param statistics Model quality statistics.
       */
      public fun statistics(statistics: MetricsSourceProperty)

      /**
       * @param statistics Model quality statistics.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5732927e06a4e0ac97206ee7529026a9521b8e43367915c6c12ca58e531614ed")
      public fun statistics(statistics: MetricsSourceProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.ModelQualityProperty.Builder =
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.ModelQualityProperty.builder()

      /**
       * @param constraints Model quality constraints.
       */
      override fun constraints(constraints: IResolvable) {
        cdkBuilder.constraints(constraints.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param constraints Model quality constraints.
       */
      override fun constraints(constraints: MetricsSourceProperty) {
        cdkBuilder.constraints(constraints.let(MetricsSourceProperty.Companion::unwrap))
      }

      /**
       * @param constraints Model quality constraints.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8d421f451d6edcc7575ec206c2f7fc907831a315f1b8d72e3d9c37ba1d230d65")
      override fun constraints(constraints: MetricsSourceProperty.Builder.() -> Unit): Unit =
          constraints(MetricsSourceProperty(constraints))

      /**
       * @param statistics Model quality statistics.
       */
      override fun statistics(statistics: IResolvable) {
        cdkBuilder.statistics(statistics.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param statistics Model quality statistics.
       */
      override fun statistics(statistics: MetricsSourceProperty) {
        cdkBuilder.statistics(statistics.let(MetricsSourceProperty.Companion::unwrap))
      }

      /**
       * @param statistics Model quality statistics.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5732927e06a4e0ac97206ee7529026a9521b8e43367915c6c12ca58e531614ed")
      override fun statistics(statistics: MetricsSourceProperty.Builder.() -> Unit): Unit =
          statistics(MetricsSourceProperty(statistics))

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.ModelQualityProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelPackage.ModelQualityProperty,
    ) : CdkObject(cdkObject),
        ModelQualityProperty {
      /**
       * Model quality constraints.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-modelquality.html#cfn-sagemaker-modelpackage-modelquality-constraints)
       */
      override fun constraints(): Any? = unwrap(this).getConstraints()

      /**
       * Model quality statistics.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-modelquality.html#cfn-sagemaker-modelpackage-modelquality-statistics)
       */
      override fun statistics(): Any? = unwrap(this).getStatistics()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ModelQualityProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelPackage.ModelQualityProperty):
          ModelQualityProperty = CdkObjectWrappers.wrap(cdkObject) as? ModelQualityProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: ModelQualityProperty):
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.ModelQualityProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.ModelQualityProperty
    }
  }

  /**
   * Describes the S3 data source.
   *
   * Your input bucket must be in the same AWS region as your training job.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sagemaker.*;
   * S3DataSourceProperty s3DataSourceProperty = S3DataSourceProperty.builder()
   * .s3DataType("s3DataType")
   * .s3Uri("s3Uri")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-s3datasource.html)
   */
  public interface S3DataSourceProperty {
    /**
     * If you choose `S3Prefix` , `S3Uri` identifies a key name prefix.
     *
     * SageMaker uses all objects that match the specified key name prefix for model training.
     *
     * If you choose `ManifestFile` , `S3Uri` identifies an object that is a manifest file
     * containing a list of object keys that you want SageMaker to use for model training.
     *
     * If you choose `AugmentedManifestFile` , S3Uri identifies an object that is an augmented
     * manifest file in JSON lines format. This file contains the data you want to use for model
     * training. `AugmentedManifestFile` can only be used if the Channel's input mode is `Pipe` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-s3datasource.html#cfn-sagemaker-modelpackage-s3datasource-s3datatype)
     */
    public fun s3DataType(): String

    /**
     * Depending on the value specified for the `S3DataType` , identifies either a key name prefix
     * or a manifest.
     *
     * For example:
     *
     * * A key name prefix might look like this: `s3://bucketname/exampleprefix/`
     * * A manifest might look like this: `s3://bucketname/example.manifest`
     *
     * A manifest is an S3 object which is a JSON file consisting of an array of elements. The first
     * element is a prefix which is followed by one or more suffixes. SageMaker appends the suffix
     * elements to the prefix to get a full set of `S3Uri` . Note that the prefix must be a valid
     * non-empty `S3Uri` that precludes users from specifying a manifest whose individual `S3Uri` is
     * sourced from different S3 buckets.
     *
     * The following code example shows a valid manifest format:
     *
     * `[ {"prefix": "s3://customer_bucket/some/prefix/"},`
     *
     * `"relative/path/to/custdata-1",`
     *
     * `"relative/path/custdata-2",`
     *
     * `...`
     *
     * `"relative/path/custdata-N"`
     *
     * `]`
     *
     * This JSON is equivalent to the following `S3Uri` list:
     *
     * `s3://customer_bucket/some/prefix/relative/path/to/custdata-1`
     *
     * `s3://customer_bucket/some/prefix/relative/path/custdata-2`
     *
     * `...`
     *
     * `s3://customer_bucket/some/prefix/relative/path/custdata-N`
     *
     * The complete set of `S3Uri` in this manifest is the input data for the channel for this data
     * source. The object that each `S3Uri` points to must be readable by the IAM role that SageMaker
     * uses to perform tasks on your behalf.
     *
     * Your input bucket must be located in same AWS region as your training job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-s3datasource.html#cfn-sagemaker-modelpackage-s3datasource-s3uri)
     */
    public fun s3Uri(): String

    /**
     * A builder for [S3DataSourceProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param s3DataType If you choose `S3Prefix` , `S3Uri` identifies a key name prefix. 
       * SageMaker uses all objects that match the specified key name prefix for model training.
       *
       * If you choose `ManifestFile` , `S3Uri` identifies an object that is a manifest file
       * containing a list of object keys that you want SageMaker to use for model training.
       *
       * If you choose `AugmentedManifestFile` , S3Uri identifies an object that is an augmented
       * manifest file in JSON lines format. This file contains the data you want to use for model
       * training. `AugmentedManifestFile` can only be used if the Channel's input mode is `Pipe` .
       */
      public fun s3DataType(s3DataType: String)

      /**
       * @param s3Uri Depending on the value specified for the `S3DataType` , identifies either a
       * key name prefix or a manifest. 
       * For example:
       *
       * * A key name prefix might look like this: `s3://bucketname/exampleprefix/`
       * * A manifest might look like this: `s3://bucketname/example.manifest`
       *
       * A manifest is an S3 object which is a JSON file consisting of an array of elements. The
       * first element is a prefix which is followed by one or more suffixes. SageMaker appends the
       * suffix elements to the prefix to get a full set of `S3Uri` . Note that the prefix must be a
       * valid non-empty `S3Uri` that precludes users from specifying a manifest whose individual
       * `S3Uri` is sourced from different S3 buckets.
       *
       * The following code example shows a valid manifest format:
       *
       * `[ {"prefix": "s3://customer_bucket/some/prefix/"},`
       *
       * `"relative/path/to/custdata-1",`
       *
       * `"relative/path/custdata-2",`
       *
       * `...`
       *
       * `"relative/path/custdata-N"`
       *
       * `]`
       *
       * This JSON is equivalent to the following `S3Uri` list:
       *
       * `s3://customer_bucket/some/prefix/relative/path/to/custdata-1`
       *
       * `s3://customer_bucket/some/prefix/relative/path/custdata-2`
       *
       * `...`
       *
       * `s3://customer_bucket/some/prefix/relative/path/custdata-N`
       *
       * The complete set of `S3Uri` in this manifest is the input data for the channel for this
       * data source. The object that each `S3Uri` points to must be readable by the IAM role that
       * SageMaker uses to perform tasks on your behalf.
       *
       * Your input bucket must be located in same AWS region as your training job.
       */
      public fun s3Uri(s3Uri: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.S3DataSourceProperty.Builder =
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.S3DataSourceProperty.builder()

      /**
       * @param s3DataType If you choose `S3Prefix` , `S3Uri` identifies a key name prefix. 
       * SageMaker uses all objects that match the specified key name prefix for model training.
       *
       * If you choose `ManifestFile` , `S3Uri` identifies an object that is a manifest file
       * containing a list of object keys that you want SageMaker to use for model training.
       *
       * If you choose `AugmentedManifestFile` , S3Uri identifies an object that is an augmented
       * manifest file in JSON lines format. This file contains the data you want to use for model
       * training. `AugmentedManifestFile` can only be used if the Channel's input mode is `Pipe` .
       */
      override fun s3DataType(s3DataType: String) {
        cdkBuilder.s3DataType(s3DataType)
      }

      /**
       * @param s3Uri Depending on the value specified for the `S3DataType` , identifies either a
       * key name prefix or a manifest. 
       * For example:
       *
       * * A key name prefix might look like this: `s3://bucketname/exampleprefix/`
       * * A manifest might look like this: `s3://bucketname/example.manifest`
       *
       * A manifest is an S3 object which is a JSON file consisting of an array of elements. The
       * first element is a prefix which is followed by one or more suffixes. SageMaker appends the
       * suffix elements to the prefix to get a full set of `S3Uri` . Note that the prefix must be a
       * valid non-empty `S3Uri` that precludes users from specifying a manifest whose individual
       * `S3Uri` is sourced from different S3 buckets.
       *
       * The following code example shows a valid manifest format:
       *
       * `[ {"prefix": "s3://customer_bucket/some/prefix/"},`
       *
       * `"relative/path/to/custdata-1",`
       *
       * `"relative/path/custdata-2",`
       *
       * `...`
       *
       * `"relative/path/custdata-N"`
       *
       * `]`
       *
       * This JSON is equivalent to the following `S3Uri` list:
       *
       * `s3://customer_bucket/some/prefix/relative/path/to/custdata-1`
       *
       * `s3://customer_bucket/some/prefix/relative/path/custdata-2`
       *
       * `...`
       *
       * `s3://customer_bucket/some/prefix/relative/path/custdata-N`
       *
       * The complete set of `S3Uri` in this manifest is the input data for the channel for this
       * data source. The object that each `S3Uri` points to must be readable by the IAM role that
       * SageMaker uses to perform tasks on your behalf.
       *
       * Your input bucket must be located in same AWS region as your training job.
       */
      override fun s3Uri(s3Uri: String) {
        cdkBuilder.s3Uri(s3Uri)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.S3DataSourceProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelPackage.S3DataSourceProperty,
    ) : CdkObject(cdkObject),
        S3DataSourceProperty {
      /**
       * If you choose `S3Prefix` , `S3Uri` identifies a key name prefix.
       *
       * SageMaker uses all objects that match the specified key name prefix for model training.
       *
       * If you choose `ManifestFile` , `S3Uri` identifies an object that is a manifest file
       * containing a list of object keys that you want SageMaker to use for model training.
       *
       * If you choose `AugmentedManifestFile` , S3Uri identifies an object that is an augmented
       * manifest file in JSON lines format. This file contains the data you want to use for model
       * training. `AugmentedManifestFile` can only be used if the Channel's input mode is `Pipe` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-s3datasource.html#cfn-sagemaker-modelpackage-s3datasource-s3datatype)
       */
      override fun s3DataType(): String = unwrap(this).getS3DataType()

      /**
       * Depending on the value specified for the `S3DataType` , identifies either a key name prefix
       * or a manifest.
       *
       * For example:
       *
       * * A key name prefix might look like this: `s3://bucketname/exampleprefix/`
       * * A manifest might look like this: `s3://bucketname/example.manifest`
       *
       * A manifest is an S3 object which is a JSON file consisting of an array of elements. The
       * first element is a prefix which is followed by one or more suffixes. SageMaker appends the
       * suffix elements to the prefix to get a full set of `S3Uri` . Note that the prefix must be a
       * valid non-empty `S3Uri` that precludes users from specifying a manifest whose individual
       * `S3Uri` is sourced from different S3 buckets.
       *
       * The following code example shows a valid manifest format:
       *
       * `[ {"prefix": "s3://customer_bucket/some/prefix/"},`
       *
       * `"relative/path/to/custdata-1",`
       *
       * `"relative/path/custdata-2",`
       *
       * `...`
       *
       * `"relative/path/custdata-N"`
       *
       * `]`
       *
       * This JSON is equivalent to the following `S3Uri` list:
       *
       * `s3://customer_bucket/some/prefix/relative/path/to/custdata-1`
       *
       * `s3://customer_bucket/some/prefix/relative/path/custdata-2`
       *
       * `...`
       *
       * `s3://customer_bucket/some/prefix/relative/path/custdata-N`
       *
       * The complete set of `S3Uri` in this manifest is the input data for the channel for this
       * data source. The object that each `S3Uri` points to must be readable by the IAM role that
       * SageMaker uses to perform tasks on your behalf.
       *
       * Your input bucket must be located in same AWS region as your training job.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-s3datasource.html#cfn-sagemaker-modelpackage-s3datasource-s3uri)
       */
      override fun s3Uri(): String = unwrap(this).getS3Uri()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): S3DataSourceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelPackage.S3DataSourceProperty):
          S3DataSourceProperty = CdkObjectWrappers.wrap(cdkObject) as? S3DataSourceProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: S3DataSourceProperty):
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.S3DataSourceProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.S3DataSourceProperty
    }
  }

  /**
   * Specifies the S3 location of ML model data to deploy.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sagemaker.*;
   * S3ModelDataSourceProperty s3ModelDataSourceProperty = S3ModelDataSourceProperty.builder()
   * .compressionType("compressionType")
   * .s3DataType("s3DataType")
   * .s3Uri("s3Uri")
   * // the properties below are optional
   * .modelAccessConfig(ModelAccessConfigProperty.builder()
   * .acceptEula(false)
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-s3modeldatasource.html)
   */
  public interface S3ModelDataSourceProperty {
    /**
     * Specifies how the ML model data is prepared.
     *
     * If you choose `Gzip` and choose `S3Object` as the value of `S3DataType` , `S3Uri` identifies
     * an object that is a gzip-compressed TAR archive. SageMaker will attempt to decompress and untar
     * the object during model deployment.
     *
     * If you choose `None` and chooose `S3Object` as the value of `S3DataType` , `S3Uri` identifies
     * an object that represents an uncompressed ML model to deploy.
     *
     * If you choose None and choose `S3Prefix` as the value of `S3DataType` , `S3Uri` identifies a
     * key name prefix, under which all objects represents the uncompressed ML model to deploy.
     *
     * If you choose None, then SageMaker will follow rules below when creating model data files
     * under /opt/ml/model directory for use by your inference code:
     *
     * * If you choose `S3Object` as the value of `S3DataType` , then SageMaker will split the key
     * of the S3 object referenced by `S3Uri` by slash (/), and use the last part as the filename of
     * the file holding the content of the S3 object.
     * * If you choose `S3Prefix` as the value of `S3DataType` , then for each S3 object under the
     * key name pefix referenced by `S3Uri` , SageMaker will trim its key by the prefix, and use the
     * remainder as the path (relative to `/opt/ml/model` ) of the file holding the content of the S3
     * object. SageMaker will split the remainder by slash (/), using intermediate parts as directory
     * names and the last part as filename of the file holding the content of the S3 object.
     * * Do not use any of the following as file names or directory names:
     * * An empty or blank string
     * * A string which contains null bytes
     * * A string longer than 255 bytes
     * * A single dot ( `.` )
     * * A double dot ( `..` )
     * * Ambiguous file names will result in model deployment failure. For example, if your
     * uncompressed ML model consists of two S3 objects `s3://mybucket/model/weights` and
     * `s3://mybucket/model/weights/part1` and you specify `s3://mybucket/model/` as the value of
     * `S3Uri` and `S3Prefix` as the value of `S3DataType` , then it will result in name clash between
     * `/opt/ml/model/weights` (a regular file) and `/opt/ml/model/weights/` (a directory).
     * * Do not organize the model artifacts in [S3 console using
     * folders](https://docs.aws.amazon.com//AmazonS3/latest/userguide/using-folders.html) . When you
     * create a folder in S3 console, S3 creates a 0-byte object with a key set to the folder name you
     * provide. They key of the 0-byte object ends with a slash (/) which violates SageMaker
     * restrictions on model artifact file names, leading to model deployment failure.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-s3modeldatasource.html#cfn-sagemaker-modelpackage-s3modeldatasource-compressiontype)
     */
    public fun compressionType(): String

    /**
     * Specifies the access configuration file for the ML model.
     *
     * You can explicitly accept the model end-user license agreement (EULA) within the
     * `ModelAccessConfig` . You are responsible for reviewing and complying with any applicable
     * license terms and making sure they are acceptable for your use case before downloading or using
     * a model.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-s3modeldatasource.html#cfn-sagemaker-modelpackage-s3modeldatasource-modelaccessconfig)
     */
    public fun modelAccessConfig(): Any? = unwrap(this).getModelAccessConfig()

    /**
     * Specifies the type of ML model data to deploy.
     *
     * If you choose `S3Prefix` , `S3Uri` identifies a key name prefix. SageMaker uses all objects
     * that match the specified key name prefix as part of the ML model data to deploy. A valid key
     * name prefix identified by `S3Uri` always ends with a forward slash (/).
     *
     * If you choose `S3Object` , `S3Uri` identifies an object that is the ML model data to deploy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-s3modeldatasource.html#cfn-sagemaker-modelpackage-s3modeldatasource-s3datatype)
     */
    public fun s3DataType(): String

    /**
     * Specifies the S3 path of ML model data to deploy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-s3modeldatasource.html#cfn-sagemaker-modelpackage-s3modeldatasource-s3uri)
     */
    public fun s3Uri(): String

    /**
     * A builder for [S3ModelDataSourceProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param compressionType Specifies how the ML model data is prepared. 
       * If you choose `Gzip` and choose `S3Object` as the value of `S3DataType` , `S3Uri`
       * identifies an object that is a gzip-compressed TAR archive. SageMaker will attempt to
       * decompress and untar the object during model deployment.
       *
       * If you choose `None` and chooose `S3Object` as the value of `S3DataType` , `S3Uri`
       * identifies an object that represents an uncompressed ML model to deploy.
       *
       * If you choose None and choose `S3Prefix` as the value of `S3DataType` , `S3Uri` identifies
       * a key name prefix, under which all objects represents the uncompressed ML model to deploy.
       *
       * If you choose None, then SageMaker will follow rules below when creating model data files
       * under /opt/ml/model directory for use by your inference code:
       *
       * * If you choose `S3Object` as the value of `S3DataType` , then SageMaker will split the key
       * of the S3 object referenced by `S3Uri` by slash (/), and use the last part as the filename of
       * the file holding the content of the S3 object.
       * * If you choose `S3Prefix` as the value of `S3DataType` , then for each S3 object under the
       * key name pefix referenced by `S3Uri` , SageMaker will trim its key by the prefix, and use the
       * remainder as the path (relative to `/opt/ml/model` ) of the file holding the content of the S3
       * object. SageMaker will split the remainder by slash (/), using intermediate parts as directory
       * names and the last part as filename of the file holding the content of the S3 object.
       * * Do not use any of the following as file names or directory names:
       * * An empty or blank string
       * * A string which contains null bytes
       * * A string longer than 255 bytes
       * * A single dot ( `.` )
       * * A double dot ( `..` )
       * * Ambiguous file names will result in model deployment failure. For example, if your
       * uncompressed ML model consists of two S3 objects `s3://mybucket/model/weights` and
       * `s3://mybucket/model/weights/part1` and you specify `s3://mybucket/model/` as the value of
       * `S3Uri` and `S3Prefix` as the value of `S3DataType` , then it will result in name clash
       * between `/opt/ml/model/weights` (a regular file) and `/opt/ml/model/weights/` (a directory).
       * * Do not organize the model artifacts in [S3 console using
       * folders](https://docs.aws.amazon.com//AmazonS3/latest/userguide/using-folders.html) . When you
       * create a folder in S3 console, S3 creates a 0-byte object with a key set to the folder name
       * you provide. They key of the 0-byte object ends with a slash (/) which violates SageMaker
       * restrictions on model artifact file names, leading to model deployment failure.
       */
      public fun compressionType(compressionType: String)

      /**
       * @param modelAccessConfig Specifies the access configuration file for the ML model.
       * You can explicitly accept the model end-user license agreement (EULA) within the
       * `ModelAccessConfig` . You are responsible for reviewing and complying with any applicable
       * license terms and making sure they are acceptable for your use case before downloading or
       * using a model.
       */
      public fun modelAccessConfig(modelAccessConfig: IResolvable)

      /**
       * @param modelAccessConfig Specifies the access configuration file for the ML model.
       * You can explicitly accept the model end-user license agreement (EULA) within the
       * `ModelAccessConfig` . You are responsible for reviewing and complying with any applicable
       * license terms and making sure they are acceptable for your use case before downloading or
       * using a model.
       */
      public fun modelAccessConfig(modelAccessConfig: ModelAccessConfigProperty)

      /**
       * @param modelAccessConfig Specifies the access configuration file for the ML model.
       * You can explicitly accept the model end-user license agreement (EULA) within the
       * `ModelAccessConfig` . You are responsible for reviewing and complying with any applicable
       * license terms and making sure they are acceptable for your use case before downloading or
       * using a model.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6b57f4091800f0752e3941c39e92685e2a442c78707881a7a5233e5005142e8d")
      public fun modelAccessConfig(modelAccessConfig: ModelAccessConfigProperty.Builder.() -> Unit)

      /**
       * @param s3DataType Specifies the type of ML model data to deploy. 
       * If you choose `S3Prefix` , `S3Uri` identifies a key name prefix. SageMaker uses all objects
       * that match the specified key name prefix as part of the ML model data to deploy. A valid key
       * name prefix identified by `S3Uri` always ends with a forward slash (/).
       *
       * If you choose `S3Object` , `S3Uri` identifies an object that is the ML model data to
       * deploy.
       */
      public fun s3DataType(s3DataType: String)

      /**
       * @param s3Uri Specifies the S3 path of ML model data to deploy. 
       */
      public fun s3Uri(s3Uri: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.S3ModelDataSourceProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.S3ModelDataSourceProperty.builder()

      /**
       * @param compressionType Specifies how the ML model data is prepared. 
       * If you choose `Gzip` and choose `S3Object` as the value of `S3DataType` , `S3Uri`
       * identifies an object that is a gzip-compressed TAR archive. SageMaker will attempt to
       * decompress and untar the object during model deployment.
       *
       * If you choose `None` and chooose `S3Object` as the value of `S3DataType` , `S3Uri`
       * identifies an object that represents an uncompressed ML model to deploy.
       *
       * If you choose None and choose `S3Prefix` as the value of `S3DataType` , `S3Uri` identifies
       * a key name prefix, under which all objects represents the uncompressed ML model to deploy.
       *
       * If you choose None, then SageMaker will follow rules below when creating model data files
       * under /opt/ml/model directory for use by your inference code:
       *
       * * If you choose `S3Object` as the value of `S3DataType` , then SageMaker will split the key
       * of the S3 object referenced by `S3Uri` by slash (/), and use the last part as the filename of
       * the file holding the content of the S3 object.
       * * If you choose `S3Prefix` as the value of `S3DataType` , then for each S3 object under the
       * key name pefix referenced by `S3Uri` , SageMaker will trim its key by the prefix, and use the
       * remainder as the path (relative to `/opt/ml/model` ) of the file holding the content of the S3
       * object. SageMaker will split the remainder by slash (/), using intermediate parts as directory
       * names and the last part as filename of the file holding the content of the S3 object.
       * * Do not use any of the following as file names or directory names:
       * * An empty or blank string
       * * A string which contains null bytes
       * * A string longer than 255 bytes
       * * A single dot ( `.` )
       * * A double dot ( `..` )
       * * Ambiguous file names will result in model deployment failure. For example, if your
       * uncompressed ML model consists of two S3 objects `s3://mybucket/model/weights` and
       * `s3://mybucket/model/weights/part1` and you specify `s3://mybucket/model/` as the value of
       * `S3Uri` and `S3Prefix` as the value of `S3DataType` , then it will result in name clash
       * between `/opt/ml/model/weights` (a regular file) and `/opt/ml/model/weights/` (a directory).
       * * Do not organize the model artifacts in [S3 console using
       * folders](https://docs.aws.amazon.com//AmazonS3/latest/userguide/using-folders.html) . When you
       * create a folder in S3 console, S3 creates a 0-byte object with a key set to the folder name
       * you provide. They key of the 0-byte object ends with a slash (/) which violates SageMaker
       * restrictions on model artifact file names, leading to model deployment failure.
       */
      override fun compressionType(compressionType: String) {
        cdkBuilder.compressionType(compressionType)
      }

      /**
       * @param modelAccessConfig Specifies the access configuration file for the ML model.
       * You can explicitly accept the model end-user license agreement (EULA) within the
       * `ModelAccessConfig` . You are responsible for reviewing and complying with any applicable
       * license terms and making sure they are acceptable for your use case before downloading or
       * using a model.
       */
      override fun modelAccessConfig(modelAccessConfig: IResolvable) {
        cdkBuilder.modelAccessConfig(modelAccessConfig.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param modelAccessConfig Specifies the access configuration file for the ML model.
       * You can explicitly accept the model end-user license agreement (EULA) within the
       * `ModelAccessConfig` . You are responsible for reviewing and complying with any applicable
       * license terms and making sure they are acceptable for your use case before downloading or
       * using a model.
       */
      override fun modelAccessConfig(modelAccessConfig: ModelAccessConfigProperty) {
        cdkBuilder.modelAccessConfig(modelAccessConfig.let(ModelAccessConfigProperty.Companion::unwrap))
      }

      /**
       * @param modelAccessConfig Specifies the access configuration file for the ML model.
       * You can explicitly accept the model end-user license agreement (EULA) within the
       * `ModelAccessConfig` . You are responsible for reviewing and complying with any applicable
       * license terms and making sure they are acceptable for your use case before downloading or
       * using a model.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6b57f4091800f0752e3941c39e92685e2a442c78707881a7a5233e5005142e8d")
      override
          fun modelAccessConfig(modelAccessConfig: ModelAccessConfigProperty.Builder.() -> Unit):
          Unit = modelAccessConfig(ModelAccessConfigProperty(modelAccessConfig))

      /**
       * @param s3DataType Specifies the type of ML model data to deploy. 
       * If you choose `S3Prefix` , `S3Uri` identifies a key name prefix. SageMaker uses all objects
       * that match the specified key name prefix as part of the ML model data to deploy. A valid key
       * name prefix identified by `S3Uri` always ends with a forward slash (/).
       *
       * If you choose `S3Object` , `S3Uri` identifies an object that is the ML model data to
       * deploy.
       */
      override fun s3DataType(s3DataType: String) {
        cdkBuilder.s3DataType(s3DataType)
      }

      /**
       * @param s3Uri Specifies the S3 path of ML model data to deploy. 
       */
      override fun s3Uri(s3Uri: String) {
        cdkBuilder.s3Uri(s3Uri)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.S3ModelDataSourceProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelPackage.S3ModelDataSourceProperty,
    ) : CdkObject(cdkObject),
        S3ModelDataSourceProperty {
      /**
       * Specifies how the ML model data is prepared.
       *
       * If you choose `Gzip` and choose `S3Object` as the value of `S3DataType` , `S3Uri`
       * identifies an object that is a gzip-compressed TAR archive. SageMaker will attempt to
       * decompress and untar the object during model deployment.
       *
       * If you choose `None` and chooose `S3Object` as the value of `S3DataType` , `S3Uri`
       * identifies an object that represents an uncompressed ML model to deploy.
       *
       * If you choose None and choose `S3Prefix` as the value of `S3DataType` , `S3Uri` identifies
       * a key name prefix, under which all objects represents the uncompressed ML model to deploy.
       *
       * If you choose None, then SageMaker will follow rules below when creating model data files
       * under /opt/ml/model directory for use by your inference code:
       *
       * * If you choose `S3Object` as the value of `S3DataType` , then SageMaker will split the key
       * of the S3 object referenced by `S3Uri` by slash (/), and use the last part as the filename of
       * the file holding the content of the S3 object.
       * * If you choose `S3Prefix` as the value of `S3DataType` , then for each S3 object under the
       * key name pefix referenced by `S3Uri` , SageMaker will trim its key by the prefix, and use the
       * remainder as the path (relative to `/opt/ml/model` ) of the file holding the content of the S3
       * object. SageMaker will split the remainder by slash (/), using intermediate parts as directory
       * names and the last part as filename of the file holding the content of the S3 object.
       * * Do not use any of the following as file names or directory names:
       * * An empty or blank string
       * * A string which contains null bytes
       * * A string longer than 255 bytes
       * * A single dot ( `.` )
       * * A double dot ( `..` )
       * * Ambiguous file names will result in model deployment failure. For example, if your
       * uncompressed ML model consists of two S3 objects `s3://mybucket/model/weights` and
       * `s3://mybucket/model/weights/part1` and you specify `s3://mybucket/model/` as the value of
       * `S3Uri` and `S3Prefix` as the value of `S3DataType` , then it will result in name clash
       * between `/opt/ml/model/weights` (a regular file) and `/opt/ml/model/weights/` (a directory).
       * * Do not organize the model artifacts in [S3 console using
       * folders](https://docs.aws.amazon.com//AmazonS3/latest/userguide/using-folders.html) . When you
       * create a folder in S3 console, S3 creates a 0-byte object with a key set to the folder name
       * you provide. They key of the 0-byte object ends with a slash (/) which violates SageMaker
       * restrictions on model artifact file names, leading to model deployment failure.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-s3modeldatasource.html#cfn-sagemaker-modelpackage-s3modeldatasource-compressiontype)
       */
      override fun compressionType(): String = unwrap(this).getCompressionType()

      /**
       * Specifies the access configuration file for the ML model.
       *
       * You can explicitly accept the model end-user license agreement (EULA) within the
       * `ModelAccessConfig` . You are responsible for reviewing and complying with any applicable
       * license terms and making sure they are acceptable for your use case before downloading or
       * using a model.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-s3modeldatasource.html#cfn-sagemaker-modelpackage-s3modeldatasource-modelaccessconfig)
       */
      override fun modelAccessConfig(): Any? = unwrap(this).getModelAccessConfig()

      /**
       * Specifies the type of ML model data to deploy.
       *
       * If you choose `S3Prefix` , `S3Uri` identifies a key name prefix. SageMaker uses all objects
       * that match the specified key name prefix as part of the ML model data to deploy. A valid key
       * name prefix identified by `S3Uri` always ends with a forward slash (/).
       *
       * If you choose `S3Object` , `S3Uri` identifies an object that is the ML model data to
       * deploy.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-s3modeldatasource.html#cfn-sagemaker-modelpackage-s3modeldatasource-s3datatype)
       */
      override fun s3DataType(): String = unwrap(this).getS3DataType()

      /**
       * Specifies the S3 path of ML model data to deploy.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-s3modeldatasource.html#cfn-sagemaker-modelpackage-s3modeldatasource-s3uri)
       */
      override fun s3Uri(): String = unwrap(this).getS3Uri()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): S3ModelDataSourceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelPackage.S3ModelDataSourceProperty):
          S3ModelDataSourceProperty = CdkObjectWrappers.wrap(cdkObject) as?
          S3ModelDataSourceProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: S3ModelDataSourceProperty):
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.S3ModelDataSourceProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.S3ModelDataSourceProperty
    }
  }

  /**
   * An optional AWS Key Management Service key to encrypt, decrypt, and re-encrypt model package
   * information for regulated workloads with highly sensitive data.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sagemaker.*;
   * SecurityConfigProperty securityConfigProperty = SecurityConfigProperty.builder()
   * .kmsKeyId("kmsKeyId")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-securityconfig.html)
   */
  public interface SecurityConfigProperty {
    /**
     * The AWS KMS Key ID (KMSKeyId) used for encryption of model package information.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-securityconfig.html#cfn-sagemaker-modelpackage-securityconfig-kmskeyid)
     */
    public fun kmsKeyId(): String

    /**
     * A builder for [SecurityConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param kmsKeyId The AWS KMS Key ID (KMSKeyId) used for encryption of model package
       * information. 
       */
      public fun kmsKeyId(kmsKeyId: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.SecurityConfigProperty.Builder =
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.SecurityConfigProperty.builder()

      /**
       * @param kmsKeyId The AWS KMS Key ID (KMSKeyId) used for encryption of model package
       * information. 
       */
      override fun kmsKeyId(kmsKeyId: String) {
        cdkBuilder.kmsKeyId(kmsKeyId)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.SecurityConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelPackage.SecurityConfigProperty,
    ) : CdkObject(cdkObject),
        SecurityConfigProperty {
      /**
       * The AWS KMS Key ID (KMSKeyId) used for encryption of model package information.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-securityconfig.html#cfn-sagemaker-modelpackage-securityconfig-kmskeyid)
       */
      override fun kmsKeyId(): String = unwrap(this).getKmsKeyId()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SecurityConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelPackage.SecurityConfigProperty):
          SecurityConfigProperty = CdkObjectWrappers.wrap(cdkObject) as? SecurityConfigProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: SecurityConfigProperty):
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.SecurityConfigProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.SecurityConfigProperty
    }
  }

  /**
   * Specifies an algorithm that was used to create the model package.
   *
   * The algorithm must be either an algorithm resource in your SageMaker account or an algorithm in
   * AWS Marketplace that you are subscribed to.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sagemaker.*;
   * SourceAlgorithmProperty sourceAlgorithmProperty = SourceAlgorithmProperty.builder()
   * .algorithmName("algorithmName")
   * // the properties below are optional
   * .modelDataUrl("modelDataUrl")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-sourcealgorithm.html)
   */
  public interface SourceAlgorithmProperty {
    /**
     * The name of an algorithm that was used to create the model package.
     *
     * The algorithm must be either an algorithm resource in your SageMaker account or an algorithm
     * in AWS Marketplace that you are subscribed to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-sourcealgorithm.html#cfn-sagemaker-modelpackage-sourcealgorithm-algorithmname)
     */
    public fun algorithmName(): String

    /**
     * The Amazon S3 path where the model artifacts, which result from model training, are stored.
     *
     * This path must point to a single `gzip` compressed tar archive ( `.tar.gz` suffix).
     *
     *
     * The model artifacts must be in an S3 bucket that is in the same AWS region as the algorithm.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-sourcealgorithm.html#cfn-sagemaker-modelpackage-sourcealgorithm-modeldataurl)
     */
    public fun modelDataUrl(): String? = unwrap(this).getModelDataUrl()

    /**
     * A builder for [SourceAlgorithmProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param algorithmName The name of an algorithm that was used to create the model package. 
       * The algorithm must be either an algorithm resource in your SageMaker account or an
       * algorithm in AWS Marketplace that you are subscribed to.
       */
      public fun algorithmName(algorithmName: String)

      /**
       * @param modelDataUrl The Amazon S3 path where the model artifacts, which result from model
       * training, are stored.
       * This path must point to a single `gzip` compressed tar archive ( `.tar.gz` suffix).
       *
       *
       * The model artifacts must be in an S3 bucket that is in the same AWS region as the
       * algorithm.
       */
      public fun modelDataUrl(modelDataUrl: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.SourceAlgorithmProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.SourceAlgorithmProperty.builder()

      /**
       * @param algorithmName The name of an algorithm that was used to create the model package. 
       * The algorithm must be either an algorithm resource in your SageMaker account or an
       * algorithm in AWS Marketplace that you are subscribed to.
       */
      override fun algorithmName(algorithmName: String) {
        cdkBuilder.algorithmName(algorithmName)
      }

      /**
       * @param modelDataUrl The Amazon S3 path where the model artifacts, which result from model
       * training, are stored.
       * This path must point to a single `gzip` compressed tar archive ( `.tar.gz` suffix).
       *
       *
       * The model artifacts must be in an S3 bucket that is in the same AWS region as the
       * algorithm.
       */
      override fun modelDataUrl(modelDataUrl: String) {
        cdkBuilder.modelDataUrl(modelDataUrl)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.SourceAlgorithmProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelPackage.SourceAlgorithmProperty,
    ) : CdkObject(cdkObject),
        SourceAlgorithmProperty {
      /**
       * The name of an algorithm that was used to create the model package.
       *
       * The algorithm must be either an algorithm resource in your SageMaker account or an
       * algorithm in AWS Marketplace that you are subscribed to.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-sourcealgorithm.html#cfn-sagemaker-modelpackage-sourcealgorithm-algorithmname)
       */
      override fun algorithmName(): String = unwrap(this).getAlgorithmName()

      /**
       * The Amazon S3 path where the model artifacts, which result from model training, are stored.
       *
       * This path must point to a single `gzip` compressed tar archive ( `.tar.gz` suffix).
       *
       *
       * The model artifacts must be in an S3 bucket that is in the same AWS region as the
       * algorithm.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-sourcealgorithm.html#cfn-sagemaker-modelpackage-sourcealgorithm-modeldataurl)
       */
      override fun modelDataUrl(): String? = unwrap(this).getModelDataUrl()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SourceAlgorithmProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelPackage.SourceAlgorithmProperty):
          SourceAlgorithmProperty = CdkObjectWrappers.wrap(cdkObject) as? SourceAlgorithmProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: SourceAlgorithmProperty):
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.SourceAlgorithmProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.SourceAlgorithmProperty
    }
  }

  /**
   * A list of algorithms that were used to create a model package.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sagemaker.*;
   * SourceAlgorithmSpecificationProperty sourceAlgorithmSpecificationProperty =
   * SourceAlgorithmSpecificationProperty.builder()
   * .sourceAlgorithms(List.of(SourceAlgorithmProperty.builder()
   * .algorithmName("algorithmName")
   * // the properties below are optional
   * .modelDataUrl("modelDataUrl")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-sourcealgorithmspecification.html)
   */
  public interface SourceAlgorithmSpecificationProperty {
    /**
     * A list of the algorithms that were used to create a model package.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-sourcealgorithmspecification.html#cfn-sagemaker-modelpackage-sourcealgorithmspecification-sourcealgorithms)
     */
    public fun sourceAlgorithms(): Any

    /**
     * A builder for [SourceAlgorithmSpecificationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param sourceAlgorithms A list of the algorithms that were used to create a model package. 
       */
      public fun sourceAlgorithms(sourceAlgorithms: IResolvable)

      /**
       * @param sourceAlgorithms A list of the algorithms that were used to create a model package. 
       */
      public fun sourceAlgorithms(sourceAlgorithms: List<Any>)

      /**
       * @param sourceAlgorithms A list of the algorithms that were used to create a model package. 
       */
      public fun sourceAlgorithms(vararg sourceAlgorithms: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.SourceAlgorithmSpecificationProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.SourceAlgorithmSpecificationProperty.builder()

      /**
       * @param sourceAlgorithms A list of the algorithms that were used to create a model package. 
       */
      override fun sourceAlgorithms(sourceAlgorithms: IResolvable) {
        cdkBuilder.sourceAlgorithms(sourceAlgorithms.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param sourceAlgorithms A list of the algorithms that were used to create a model package. 
       */
      override fun sourceAlgorithms(sourceAlgorithms: List<Any>) {
        cdkBuilder.sourceAlgorithms(sourceAlgorithms.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param sourceAlgorithms A list of the algorithms that were used to create a model package. 
       */
      override fun sourceAlgorithms(vararg sourceAlgorithms: Any): Unit =
          sourceAlgorithms(sourceAlgorithms.toList())

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.SourceAlgorithmSpecificationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelPackage.SourceAlgorithmSpecificationProperty,
    ) : CdkObject(cdkObject),
        SourceAlgorithmSpecificationProperty {
      /**
       * A list of the algorithms that were used to create a model package.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-sourcealgorithmspecification.html#cfn-sagemaker-modelpackage-sourcealgorithmspecification-sourcealgorithms)
       */
      override fun sourceAlgorithms(): Any = unwrap(this).getSourceAlgorithms()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          SourceAlgorithmSpecificationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelPackage.SourceAlgorithmSpecificationProperty):
          SourceAlgorithmSpecificationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          SourceAlgorithmSpecificationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: SourceAlgorithmSpecificationProperty):
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.SourceAlgorithmSpecificationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.SourceAlgorithmSpecificationProperty
    }
  }

  /**
   * Describes the input source of a transform job and the way the transform job consumes it.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sagemaker.*;
   * TransformInputProperty transformInputProperty = TransformInputProperty.builder()
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-transforminput.html)
   */
  public interface TransformInputProperty {
    /**
     * If your transform data is compressed, specify the compression type.
     *
     * Amazon SageMaker automatically decompresses the data for the transform job accordingly. The
     * default value is `None` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-transforminput.html#cfn-sagemaker-modelpackage-transforminput-compressiontype)
     */
    public fun compressionType(): String? = unwrap(this).getCompressionType()

    /**
     * The multipurpose internet mail extension (MIME) type of the data.
     *
     * Amazon SageMaker uses the MIME type with each http call to transfer data to the transform
     * job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-transforminput.html#cfn-sagemaker-modelpackage-transforminput-contenttype)
     */
    public fun contentType(): String? = unwrap(this).getContentType()

    /**
     * Describes the location of the channel data, which is, the S3 location of the input data that
     * the model can consume.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-transforminput.html#cfn-sagemaker-modelpackage-transforminput-datasource)
     */
    public fun dataSource(): Any

    /**
     * The method to use to split the transform job's data files into smaller batches.
     *
     * Splitting is necessary when the total size of each object is too large to fit in a single
     * request. You can also use data splitting to improve performance by processing multiple
     * concurrent mini-batches. The default value for `SplitType` is `None` , which indicates that
     * input data files are not split, and request payloads contain the entire contents of an input
     * object. Set the value of this parameter to `Line` to split records on a newline character
     * boundary. `SplitType` also supports a number of record-oriented binary data formats. Currently,
     * the supported record formats are:
     *
     * * RecordIO
     * * TFRecord
     *
     * When splitting is enabled, the size of a mini-batch depends on the values of the
     * `BatchStrategy` and `MaxPayloadInMB` parameters. When the value of `BatchStrategy` is
     * `MultiRecord` , Amazon SageMaker sends the maximum number of records in each request, up to the
     * `MaxPayloadInMB` limit. If the value of `BatchStrategy` is `SingleRecord` , Amazon SageMaker
     * sends individual records in each request.
     *
     *
     * Some data formats represent a record as a binary payload wrapped with extra padding bytes.
     * When splitting is applied to a binary data format, padding is removed if the value of
     * `BatchStrategy` is set to `SingleRecord` . Padding is not removed if the value of
     * `BatchStrategy` is set to `MultiRecord` .
     *
     * For more information about `RecordIO` , see [Create a Dataset Using
     * RecordIO](https://docs.aws.amazon.com/https://mxnet.apache.org/api/faq/recordio) in the MXNet
     * documentation. For more information about `TFRecord` , see [Consuming TFRecord
     * data](https://docs.aws.amazon.com/https://www.tensorflow.org/guide/data#consuming_tfrecord_data)
     * in the TensorFlow documentation.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-transforminput.html#cfn-sagemaker-modelpackage-transforminput-splittype)
     */
    public fun splitType(): String? = unwrap(this).getSplitType()

    /**
     * A builder for [TransformInputProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param compressionType If your transform data is compressed, specify the compression type.
       * Amazon SageMaker automatically decompresses the data for the transform job accordingly. The
       * default value is `None` .
       */
      public fun compressionType(compressionType: String)

      /**
       * @param contentType The multipurpose internet mail extension (MIME) type of the data.
       * Amazon SageMaker uses the MIME type with each http call to transfer data to the transform
       * job.
       */
      public fun contentType(contentType: String)

      /**
       * @param dataSource Describes the location of the channel data, which is, the S3 location of
       * the input data that the model can consume. 
       */
      public fun dataSource(dataSource: IResolvable)

      /**
       * @param dataSource Describes the location of the channel data, which is, the S3 location of
       * the input data that the model can consume. 
       */
      public fun dataSource(dataSource: DataSourceProperty)

      /**
       * @param dataSource Describes the location of the channel data, which is, the S3 location of
       * the input data that the model can consume. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ae1d3df29f8c64689e55692a2aa40f1471ea240b66d77fdce112ec946154959e")
      public fun dataSource(dataSource: DataSourceProperty.Builder.() -> Unit)

      /**
       * @param splitType The method to use to split the transform job's data files into smaller
       * batches.
       * Splitting is necessary when the total size of each object is too large to fit in a single
       * request. You can also use data splitting to improve performance by processing multiple
       * concurrent mini-batches. The default value for `SplitType` is `None` , which indicates that
       * input data files are not split, and request payloads contain the entire contents of an input
       * object. Set the value of this parameter to `Line` to split records on a newline character
       * boundary. `SplitType` also supports a number of record-oriented binary data formats.
       * Currently, the supported record formats are:
       *
       * * RecordIO
       * * TFRecord
       *
       * When splitting is enabled, the size of a mini-batch depends on the values of the
       * `BatchStrategy` and `MaxPayloadInMB` parameters. When the value of `BatchStrategy` is
       * `MultiRecord` , Amazon SageMaker sends the maximum number of records in each request, up to
       * the `MaxPayloadInMB` limit. If the value of `BatchStrategy` is `SingleRecord` , Amazon
       * SageMaker sends individual records in each request.
       *
       *
       * Some data formats represent a record as a binary payload wrapped with extra padding bytes.
       * When splitting is applied to a binary data format, padding is removed if the value of
       * `BatchStrategy` is set to `SingleRecord` . Padding is not removed if the value of
       * `BatchStrategy` is set to `MultiRecord` .
       *
       * For more information about `RecordIO` , see [Create a Dataset Using
       * RecordIO](https://docs.aws.amazon.com/https://mxnet.apache.org/api/faq/recordio) in the MXNet
       * documentation. For more information about `TFRecord` , see [Consuming TFRecord
       * data](https://docs.aws.amazon.com/https://www.tensorflow.org/guide/data#consuming_tfrecord_data)
       * in the TensorFlow documentation.
       */
      public fun splitType(splitType: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.TransformInputProperty.Builder =
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.TransformInputProperty.builder()

      /**
       * @param compressionType If your transform data is compressed, specify the compression type.
       * Amazon SageMaker automatically decompresses the data for the transform job accordingly. The
       * default value is `None` .
       */
      override fun compressionType(compressionType: String) {
        cdkBuilder.compressionType(compressionType)
      }

      /**
       * @param contentType The multipurpose internet mail extension (MIME) type of the data.
       * Amazon SageMaker uses the MIME type with each http call to transfer data to the transform
       * job.
       */
      override fun contentType(contentType: String) {
        cdkBuilder.contentType(contentType)
      }

      /**
       * @param dataSource Describes the location of the channel data, which is, the S3 location of
       * the input data that the model can consume. 
       */
      override fun dataSource(dataSource: IResolvable) {
        cdkBuilder.dataSource(dataSource.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param dataSource Describes the location of the channel data, which is, the S3 location of
       * the input data that the model can consume. 
       */
      override fun dataSource(dataSource: DataSourceProperty) {
        cdkBuilder.dataSource(dataSource.let(DataSourceProperty.Companion::unwrap))
      }

      /**
       * @param dataSource Describes the location of the channel data, which is, the S3 location of
       * the input data that the model can consume. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ae1d3df29f8c64689e55692a2aa40f1471ea240b66d77fdce112ec946154959e")
      override fun dataSource(dataSource: DataSourceProperty.Builder.() -> Unit): Unit =
          dataSource(DataSourceProperty(dataSource))

      /**
       * @param splitType The method to use to split the transform job's data files into smaller
       * batches.
       * Splitting is necessary when the total size of each object is too large to fit in a single
       * request. You can also use data splitting to improve performance by processing multiple
       * concurrent mini-batches. The default value for `SplitType` is `None` , which indicates that
       * input data files are not split, and request payloads contain the entire contents of an input
       * object. Set the value of this parameter to `Line` to split records on a newline character
       * boundary. `SplitType` also supports a number of record-oriented binary data formats.
       * Currently, the supported record formats are:
       *
       * * RecordIO
       * * TFRecord
       *
       * When splitting is enabled, the size of a mini-batch depends on the values of the
       * `BatchStrategy` and `MaxPayloadInMB` parameters. When the value of `BatchStrategy` is
       * `MultiRecord` , Amazon SageMaker sends the maximum number of records in each request, up to
       * the `MaxPayloadInMB` limit. If the value of `BatchStrategy` is `SingleRecord` , Amazon
       * SageMaker sends individual records in each request.
       *
       *
       * Some data formats represent a record as a binary payload wrapped with extra padding bytes.
       * When splitting is applied to a binary data format, padding is removed if the value of
       * `BatchStrategy` is set to `SingleRecord` . Padding is not removed if the value of
       * `BatchStrategy` is set to `MultiRecord` .
       *
       * For more information about `RecordIO` , see [Create a Dataset Using
       * RecordIO](https://docs.aws.amazon.com/https://mxnet.apache.org/api/faq/recordio) in the MXNet
       * documentation. For more information about `TFRecord` , see [Consuming TFRecord
       * data](https://docs.aws.amazon.com/https://www.tensorflow.org/guide/data#consuming_tfrecord_data)
       * in the TensorFlow documentation.
       */
      override fun splitType(splitType: String) {
        cdkBuilder.splitType(splitType)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.TransformInputProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelPackage.TransformInputProperty,
    ) : CdkObject(cdkObject),
        TransformInputProperty {
      /**
       * If your transform data is compressed, specify the compression type.
       *
       * Amazon SageMaker automatically decompresses the data for the transform job accordingly. The
       * default value is `None` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-transforminput.html#cfn-sagemaker-modelpackage-transforminput-compressiontype)
       */
      override fun compressionType(): String? = unwrap(this).getCompressionType()

      /**
       * The multipurpose internet mail extension (MIME) type of the data.
       *
       * Amazon SageMaker uses the MIME type with each http call to transfer data to the transform
       * job.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-transforminput.html#cfn-sagemaker-modelpackage-transforminput-contenttype)
       */
      override fun contentType(): String? = unwrap(this).getContentType()

      /**
       * Describes the location of the channel data, which is, the S3 location of the input data
       * that the model can consume.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-transforminput.html#cfn-sagemaker-modelpackage-transforminput-datasource)
       */
      override fun dataSource(): Any = unwrap(this).getDataSource()

      /**
       * The method to use to split the transform job's data files into smaller batches.
       *
       * Splitting is necessary when the total size of each object is too large to fit in a single
       * request. You can also use data splitting to improve performance by processing multiple
       * concurrent mini-batches. The default value for `SplitType` is `None` , which indicates that
       * input data files are not split, and request payloads contain the entire contents of an input
       * object. Set the value of this parameter to `Line` to split records on a newline character
       * boundary. `SplitType` also supports a number of record-oriented binary data formats.
       * Currently, the supported record formats are:
       *
       * * RecordIO
       * * TFRecord
       *
       * When splitting is enabled, the size of a mini-batch depends on the values of the
       * `BatchStrategy` and `MaxPayloadInMB` parameters. When the value of `BatchStrategy` is
       * `MultiRecord` , Amazon SageMaker sends the maximum number of records in each request, up to
       * the `MaxPayloadInMB` limit. If the value of `BatchStrategy` is `SingleRecord` , Amazon
       * SageMaker sends individual records in each request.
       *
       *
       * Some data formats represent a record as a binary payload wrapped with extra padding bytes.
       * When splitting is applied to a binary data format, padding is removed if the value of
       * `BatchStrategy` is set to `SingleRecord` . Padding is not removed if the value of
       * `BatchStrategy` is set to `MultiRecord` .
       *
       * For more information about `RecordIO` , see [Create a Dataset Using
       * RecordIO](https://docs.aws.amazon.com/https://mxnet.apache.org/api/faq/recordio) in the MXNet
       * documentation. For more information about `TFRecord` , see [Consuming TFRecord
       * data](https://docs.aws.amazon.com/https://www.tensorflow.org/guide/data#consuming_tfrecord_data)
       * in the TensorFlow documentation.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-transforminput.html#cfn-sagemaker-modelpackage-transforminput-splittype)
       */
      override fun splitType(): String? = unwrap(this).getSplitType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): TransformInputProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelPackage.TransformInputProperty):
          TransformInputProperty = CdkObjectWrappers.wrap(cdkObject) as? TransformInputProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: TransformInputProperty):
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.TransformInputProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.TransformInputProperty
    }
  }

  /**
   * Defines the input needed to run a transform job using the inference specification specified in
   * the algorithm.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sagemaker.*;
   * TransformJobDefinitionProperty transformJobDefinitionProperty =
   * TransformJobDefinitionProperty.builder()
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-transformjobdefinition.html)
   */
  public interface TransformJobDefinitionProperty {
    /**
     * A string that determines the number of records included in a single mini-batch.
     *
     * `SingleRecord` means only one record is used per mini-batch. `MultiRecord` means a mini-batch
     * is set to contain as many records that can fit within the `MaxPayloadInMB` limit.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-transformjobdefinition.html#cfn-sagemaker-modelpackage-transformjobdefinition-batchstrategy)
     */
    public fun batchStrategy(): String? = unwrap(this).getBatchStrategy()

    /**
     * The environment variables to set in the Docker container.
     *
     * We support up to 16 key and values entries in the map.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-transformjobdefinition.html#cfn-sagemaker-modelpackage-transformjobdefinition-environment)
     */
    public fun environment(): Any? = unwrap(this).getEnvironment()

    /**
     * The maximum number of parallel requests that can be sent to each instance in a transform job.
     *
     * The default value is 1.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-transformjobdefinition.html#cfn-sagemaker-modelpackage-transformjobdefinition-maxconcurrenttransforms)
     */
    public fun maxConcurrentTransforms(): Number? = unwrap(this).getMaxConcurrentTransforms()

    /**
     * The maximum payload size allowed, in MB.
     *
     * A payload is the data portion of a record (without metadata).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-transformjobdefinition.html#cfn-sagemaker-modelpackage-transformjobdefinition-maxpayloadinmb)
     */
    public fun maxPayloadInMb(): Number? = unwrap(this).getMaxPayloadInMb()

    /**
     * A description of the input source and the way the transform job consumes it.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-transformjobdefinition.html#cfn-sagemaker-modelpackage-transformjobdefinition-transforminput)
     */
    public fun transformInput(): Any

    /**
     * Identifies the Amazon S3 location where you want Amazon SageMaker to save the results from
     * the transform job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-transformjobdefinition.html#cfn-sagemaker-modelpackage-transformjobdefinition-transformoutput)
     */
    public fun transformOutput(): Any

    /**
     * Identifies the ML compute instances for the transform job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-transformjobdefinition.html#cfn-sagemaker-modelpackage-transformjobdefinition-transformresources)
     */
    public fun transformResources(): Any

    /**
     * A builder for [TransformJobDefinitionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param batchStrategy A string that determines the number of records included in a single
       * mini-batch.
       * `SingleRecord` means only one record is used per mini-batch. `MultiRecord` means a
       * mini-batch is set to contain as many records that can fit within the `MaxPayloadInMB` limit.
       */
      public fun batchStrategy(batchStrategy: String)

      /**
       * @param environment The environment variables to set in the Docker container.
       * We support up to 16 key and values entries in the map.
       */
      public fun environment(environment: IResolvable)

      /**
       * @param environment The environment variables to set in the Docker container.
       * We support up to 16 key and values entries in the map.
       */
      public fun environment(environment: Map<String, String>)

      /**
       * @param maxConcurrentTransforms The maximum number of parallel requests that can be sent to
       * each instance in a transform job.
       * The default value is 1.
       */
      public fun maxConcurrentTransforms(maxConcurrentTransforms: Number)

      /**
       * @param maxPayloadInMb The maximum payload size allowed, in MB.
       * A payload is the data portion of a record (without metadata).
       */
      public fun maxPayloadInMb(maxPayloadInMb: Number)

      /**
       * @param transformInput A description of the input source and the way the transform job
       * consumes it. 
       */
      public fun transformInput(transformInput: IResolvable)

      /**
       * @param transformInput A description of the input source and the way the transform job
       * consumes it. 
       */
      public fun transformInput(transformInput: TransformInputProperty)

      /**
       * @param transformInput A description of the input source and the way the transform job
       * consumes it. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("20571916d44bec5aa2706c1c71bae57ba5ed064c50b6d72e189ff26ba6afb55f")
      public fun transformInput(transformInput: TransformInputProperty.Builder.() -> Unit)

      /**
       * @param transformOutput Identifies the Amazon S3 location where you want Amazon SageMaker to
       * save the results from the transform job. 
       */
      public fun transformOutput(transformOutput: IResolvable)

      /**
       * @param transformOutput Identifies the Amazon S3 location where you want Amazon SageMaker to
       * save the results from the transform job. 
       */
      public fun transformOutput(transformOutput: TransformOutputProperty)

      /**
       * @param transformOutput Identifies the Amazon S3 location where you want Amazon SageMaker to
       * save the results from the transform job. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1c83a6d8001850c633dde75c66011537a09e384942155594f95a2fe33bda5265")
      public fun transformOutput(transformOutput: TransformOutputProperty.Builder.() -> Unit)

      /**
       * @param transformResources Identifies the ML compute instances for the transform job. 
       */
      public fun transformResources(transformResources: IResolvable)

      /**
       * @param transformResources Identifies the ML compute instances for the transform job. 
       */
      public fun transformResources(transformResources: TransformResourcesProperty)

      /**
       * @param transformResources Identifies the ML compute instances for the transform job. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d3b313075a4a02a44f820c052872d95513973bd42395efb835d4dcf14876eb07")
      public
          fun transformResources(transformResources: TransformResourcesProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.TransformJobDefinitionProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.TransformJobDefinitionProperty.builder()

      /**
       * @param batchStrategy A string that determines the number of records included in a single
       * mini-batch.
       * `SingleRecord` means only one record is used per mini-batch. `MultiRecord` means a
       * mini-batch is set to contain as many records that can fit within the `MaxPayloadInMB` limit.
       */
      override fun batchStrategy(batchStrategy: String) {
        cdkBuilder.batchStrategy(batchStrategy)
      }

      /**
       * @param environment The environment variables to set in the Docker container.
       * We support up to 16 key and values entries in the map.
       */
      override fun environment(environment: IResolvable) {
        cdkBuilder.environment(environment.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param environment The environment variables to set in the Docker container.
       * We support up to 16 key and values entries in the map.
       */
      override fun environment(environment: Map<String, String>) {
        cdkBuilder.environment(environment)
      }

      /**
       * @param maxConcurrentTransforms The maximum number of parallel requests that can be sent to
       * each instance in a transform job.
       * The default value is 1.
       */
      override fun maxConcurrentTransforms(maxConcurrentTransforms: Number) {
        cdkBuilder.maxConcurrentTransforms(maxConcurrentTransforms)
      }

      /**
       * @param maxPayloadInMb The maximum payload size allowed, in MB.
       * A payload is the data portion of a record (without metadata).
       */
      override fun maxPayloadInMb(maxPayloadInMb: Number) {
        cdkBuilder.maxPayloadInMb(maxPayloadInMb)
      }

      /**
       * @param transformInput A description of the input source and the way the transform job
       * consumes it. 
       */
      override fun transformInput(transformInput: IResolvable) {
        cdkBuilder.transformInput(transformInput.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param transformInput A description of the input source and the way the transform job
       * consumes it. 
       */
      override fun transformInput(transformInput: TransformInputProperty) {
        cdkBuilder.transformInput(transformInput.let(TransformInputProperty.Companion::unwrap))
      }

      /**
       * @param transformInput A description of the input source and the way the transform job
       * consumes it. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("20571916d44bec5aa2706c1c71bae57ba5ed064c50b6d72e189ff26ba6afb55f")
      override fun transformInput(transformInput: TransformInputProperty.Builder.() -> Unit): Unit =
          transformInput(TransformInputProperty(transformInput))

      /**
       * @param transformOutput Identifies the Amazon S3 location where you want Amazon SageMaker to
       * save the results from the transform job. 
       */
      override fun transformOutput(transformOutput: IResolvable) {
        cdkBuilder.transformOutput(transformOutput.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param transformOutput Identifies the Amazon S3 location where you want Amazon SageMaker to
       * save the results from the transform job. 
       */
      override fun transformOutput(transformOutput: TransformOutputProperty) {
        cdkBuilder.transformOutput(transformOutput.let(TransformOutputProperty.Companion::unwrap))
      }

      /**
       * @param transformOutput Identifies the Amazon S3 location where you want Amazon SageMaker to
       * save the results from the transform job. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1c83a6d8001850c633dde75c66011537a09e384942155594f95a2fe33bda5265")
      override fun transformOutput(transformOutput: TransformOutputProperty.Builder.() -> Unit):
          Unit = transformOutput(TransformOutputProperty(transformOutput))

      /**
       * @param transformResources Identifies the ML compute instances for the transform job. 
       */
      override fun transformResources(transformResources: IResolvable) {
        cdkBuilder.transformResources(transformResources.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param transformResources Identifies the ML compute instances for the transform job. 
       */
      override fun transformResources(transformResources: TransformResourcesProperty) {
        cdkBuilder.transformResources(transformResources.let(TransformResourcesProperty.Companion::unwrap))
      }

      /**
       * @param transformResources Identifies the ML compute instances for the transform job. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d3b313075a4a02a44f820c052872d95513973bd42395efb835d4dcf14876eb07")
      override
          fun transformResources(transformResources: TransformResourcesProperty.Builder.() -> Unit):
          Unit = transformResources(TransformResourcesProperty(transformResources))

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.TransformJobDefinitionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelPackage.TransformJobDefinitionProperty,
    ) : CdkObject(cdkObject),
        TransformJobDefinitionProperty {
      /**
       * A string that determines the number of records included in a single mini-batch.
       *
       * `SingleRecord` means only one record is used per mini-batch. `MultiRecord` means a
       * mini-batch is set to contain as many records that can fit within the `MaxPayloadInMB` limit.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-transformjobdefinition.html#cfn-sagemaker-modelpackage-transformjobdefinition-batchstrategy)
       */
      override fun batchStrategy(): String? = unwrap(this).getBatchStrategy()

      /**
       * The environment variables to set in the Docker container.
       *
       * We support up to 16 key and values entries in the map.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-transformjobdefinition.html#cfn-sagemaker-modelpackage-transformjobdefinition-environment)
       */
      override fun environment(): Any? = unwrap(this).getEnvironment()

      /**
       * The maximum number of parallel requests that can be sent to each instance in a transform
       * job.
       *
       * The default value is 1.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-transformjobdefinition.html#cfn-sagemaker-modelpackage-transformjobdefinition-maxconcurrenttransforms)
       */
      override fun maxConcurrentTransforms(): Number? = unwrap(this).getMaxConcurrentTransforms()

      /**
       * The maximum payload size allowed, in MB.
       *
       * A payload is the data portion of a record (without metadata).
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-transformjobdefinition.html#cfn-sagemaker-modelpackage-transformjobdefinition-maxpayloadinmb)
       */
      override fun maxPayloadInMb(): Number? = unwrap(this).getMaxPayloadInMb()

      /**
       * A description of the input source and the way the transform job consumes it.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-transformjobdefinition.html#cfn-sagemaker-modelpackage-transformjobdefinition-transforminput)
       */
      override fun transformInput(): Any = unwrap(this).getTransformInput()

      /**
       * Identifies the Amazon S3 location where you want Amazon SageMaker to save the results from
       * the transform job.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-transformjobdefinition.html#cfn-sagemaker-modelpackage-transformjobdefinition-transformoutput)
       */
      override fun transformOutput(): Any = unwrap(this).getTransformOutput()

      /**
       * Identifies the ML compute instances for the transform job.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-transformjobdefinition.html#cfn-sagemaker-modelpackage-transformjobdefinition-transformresources)
       */
      override fun transformResources(): Any = unwrap(this).getTransformResources()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): TransformJobDefinitionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelPackage.TransformJobDefinitionProperty):
          TransformJobDefinitionProperty = CdkObjectWrappers.wrap(cdkObject) as?
          TransformJobDefinitionProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: TransformJobDefinitionProperty):
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.TransformJobDefinitionProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.TransformJobDefinitionProperty
    }
  }

  /**
   * Describes the results of a transform job.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sagemaker.*;
   * TransformOutputProperty transformOutputProperty = TransformOutputProperty.builder()
   * .s3OutputPath("s3OutputPath")
   * // the properties below are optional
   * .accept("accept")
   * .assembleWith("assembleWith")
   * .kmsKeyId("kmsKeyId")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-transformoutput.html)
   */
  public interface TransformOutputProperty {
    /**
     * The MIME type used to specify the output data.
     *
     * Amazon SageMaker uses the MIME type with each http call to transfer data from the transform
     * job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-transformoutput.html#cfn-sagemaker-modelpackage-transformoutput-accept)
     */
    public fun accept(): String? = unwrap(this).getAccept()

    /**
     * Defines how to assemble the results of the transform job as a single S3 object.
     *
     * Choose a format that is most convenient to you. To concatenate the results in binary format,
     * specify `None` . To add a newline character at the end of every transformed record, specify
     * `Line` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-transformoutput.html#cfn-sagemaker-modelpackage-transformoutput-assemblewith)
     */
    public fun assembleWith(): String? = unwrap(this).getAssembleWith()

    /**
     * The AWS Key Management Service ( AWS KMS) key that Amazon SageMaker uses to encrypt the model
     * artifacts at rest using Amazon S3 server-side encryption.
     *
     * The `KmsKeyId` can be any of the following formats:
     *
     * * Key ID: `1234abcd-12ab-34cd-56ef-1234567890ab`
     * * Key ARN: `arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab`
     * * Alias name: `alias/ExampleAlias`
     * * Alias name ARN: `arn:aws:kms:us-west-2:111122223333:alias/ExampleAlias`
     *
     * If you don't provide a KMS key ID, Amazon SageMaker uses the default KMS key for Amazon S3
     * for your role's account. For more information, see [KMS-Managed Encryption
     * Keys](https://docs.aws.amazon.com/AmazonS3/latest/dev/UsingKMSEncryption.html) in the *Amazon
     * Simple Storage Service Developer Guide.*
     *
     * The KMS key policy must grant permission to the IAM role that you specify in your
     * [CreateModel](https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_CreateModel.html)
     * request. For more information, see [Using Key Policies in AWS
     * KMS](https://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html) in the *AWS Key
     * Management Service Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-transformoutput.html#cfn-sagemaker-modelpackage-transformoutput-kmskeyid)
     */
    public fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

    /**
     * The Amazon S3 path where you want Amazon SageMaker to store the results of the transform job.
     *
     * For example, `s3://bucket-name/key-name-prefix` .
     *
     * For every S3 object used as input for the transform job, batch transform stores the
     * transformed data with an . `out` suffix in a corresponding subfolder in the location in the
     * output prefix. For example, for the input data stored at
     * `s3://bucket-name/input-name-prefix/dataset01/data.csv` , batch transform stores the transformed
     * data at `s3://bucket-name/output-name-prefix/input-name-prefix/data.csv.out` . Batch transform
     * doesn't upload partially processed objects. For an input S3 object that contains multiple
     * records, it creates an . `out` file only if the transform job succeeds on the entire file. When
     * the input contains multiple S3 objects, the batch transform job processes the listed S3 objects
     * and uploads only the output for successfully processed objects. If any object fails in the
     * transform job batch transform marks the job as failed to prompt investigation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-transformoutput.html#cfn-sagemaker-modelpackage-transformoutput-s3outputpath)
     */
    public fun s3OutputPath(): String

    /**
     * A builder for [TransformOutputProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param accept The MIME type used to specify the output data.
       * Amazon SageMaker uses the MIME type with each http call to transfer data from the transform
       * job.
       */
      public fun accept(accept: String)

      /**
       * @param assembleWith Defines how to assemble the results of the transform job as a single S3
       * object.
       * Choose a format that is most convenient to you. To concatenate the results in binary
       * format, specify `None` . To add a newline character at the end of every transformed record,
       * specify `Line` .
       */
      public fun assembleWith(assembleWith: String)

      /**
       * @param kmsKeyId The AWS Key Management Service ( AWS KMS) key that Amazon SageMaker uses to
       * encrypt the model artifacts at rest using Amazon S3 server-side encryption.
       * The `KmsKeyId` can be any of the following formats:
       *
       * * Key ID: `1234abcd-12ab-34cd-56ef-1234567890ab`
       * * Key ARN: `arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab`
       * * Alias name: `alias/ExampleAlias`
       * * Alias name ARN: `arn:aws:kms:us-west-2:111122223333:alias/ExampleAlias`
       *
       * If you don't provide a KMS key ID, Amazon SageMaker uses the default KMS key for Amazon S3
       * for your role's account. For more information, see [KMS-Managed Encryption
       * Keys](https://docs.aws.amazon.com/AmazonS3/latest/dev/UsingKMSEncryption.html) in the *Amazon
       * Simple Storage Service Developer Guide.*
       *
       * The KMS key policy must grant permission to the IAM role that you specify in your
       * [CreateModel](https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_CreateModel.html)
       * request. For more information, see [Using Key Policies in AWS
       * KMS](https://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html) in the *AWS Key
       * Management Service Developer Guide* .
       */
      public fun kmsKeyId(kmsKeyId: String)

      /**
       * @param s3OutputPath The Amazon S3 path where you want Amazon SageMaker to store the results
       * of the transform job. 
       * For example, `s3://bucket-name/key-name-prefix` .
       *
       * For every S3 object used as input for the transform job, batch transform stores the
       * transformed data with an . `out` suffix in a corresponding subfolder in the location in the
       * output prefix. For example, for the input data stored at
       * `s3://bucket-name/input-name-prefix/dataset01/data.csv` , batch transform stores the
       * transformed data at `s3://bucket-name/output-name-prefix/input-name-prefix/data.csv.out` .
       * Batch transform doesn't upload partially processed objects. For an input S3 object that
       * contains multiple records, it creates an . `out` file only if the transform job succeeds on
       * the entire file. When the input contains multiple S3 objects, the batch transform job
       * processes the listed S3 objects and uploads only the output for successfully processed
       * objects. If any object fails in the transform job batch transform marks the job as failed to
       * prompt investigation.
       */
      public fun s3OutputPath(s3OutputPath: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.TransformOutputProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.TransformOutputProperty.builder()

      /**
       * @param accept The MIME type used to specify the output data.
       * Amazon SageMaker uses the MIME type with each http call to transfer data from the transform
       * job.
       */
      override fun accept(accept: String) {
        cdkBuilder.accept(accept)
      }

      /**
       * @param assembleWith Defines how to assemble the results of the transform job as a single S3
       * object.
       * Choose a format that is most convenient to you. To concatenate the results in binary
       * format, specify `None` . To add a newline character at the end of every transformed record,
       * specify `Line` .
       */
      override fun assembleWith(assembleWith: String) {
        cdkBuilder.assembleWith(assembleWith)
      }

      /**
       * @param kmsKeyId The AWS Key Management Service ( AWS KMS) key that Amazon SageMaker uses to
       * encrypt the model artifacts at rest using Amazon S3 server-side encryption.
       * The `KmsKeyId` can be any of the following formats:
       *
       * * Key ID: `1234abcd-12ab-34cd-56ef-1234567890ab`
       * * Key ARN: `arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab`
       * * Alias name: `alias/ExampleAlias`
       * * Alias name ARN: `arn:aws:kms:us-west-2:111122223333:alias/ExampleAlias`
       *
       * If you don't provide a KMS key ID, Amazon SageMaker uses the default KMS key for Amazon S3
       * for your role's account. For more information, see [KMS-Managed Encryption
       * Keys](https://docs.aws.amazon.com/AmazonS3/latest/dev/UsingKMSEncryption.html) in the *Amazon
       * Simple Storage Service Developer Guide.*
       *
       * The KMS key policy must grant permission to the IAM role that you specify in your
       * [CreateModel](https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_CreateModel.html)
       * request. For more information, see [Using Key Policies in AWS
       * KMS](https://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html) in the *AWS Key
       * Management Service Developer Guide* .
       */
      override fun kmsKeyId(kmsKeyId: String) {
        cdkBuilder.kmsKeyId(kmsKeyId)
      }

      /**
       * @param s3OutputPath The Amazon S3 path where you want Amazon SageMaker to store the results
       * of the transform job. 
       * For example, `s3://bucket-name/key-name-prefix` .
       *
       * For every S3 object used as input for the transform job, batch transform stores the
       * transformed data with an . `out` suffix in a corresponding subfolder in the location in the
       * output prefix. For example, for the input data stored at
       * `s3://bucket-name/input-name-prefix/dataset01/data.csv` , batch transform stores the
       * transformed data at `s3://bucket-name/output-name-prefix/input-name-prefix/data.csv.out` .
       * Batch transform doesn't upload partially processed objects. For an input S3 object that
       * contains multiple records, it creates an . `out` file only if the transform job succeeds on
       * the entire file. When the input contains multiple S3 objects, the batch transform job
       * processes the listed S3 objects and uploads only the output for successfully processed
       * objects. If any object fails in the transform job batch transform marks the job as failed to
       * prompt investigation.
       */
      override fun s3OutputPath(s3OutputPath: String) {
        cdkBuilder.s3OutputPath(s3OutputPath)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.TransformOutputProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelPackage.TransformOutputProperty,
    ) : CdkObject(cdkObject),
        TransformOutputProperty {
      /**
       * The MIME type used to specify the output data.
       *
       * Amazon SageMaker uses the MIME type with each http call to transfer data from the transform
       * job.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-transformoutput.html#cfn-sagemaker-modelpackage-transformoutput-accept)
       */
      override fun accept(): String? = unwrap(this).getAccept()

      /**
       * Defines how to assemble the results of the transform job as a single S3 object.
       *
       * Choose a format that is most convenient to you. To concatenate the results in binary
       * format, specify `None` . To add a newline character at the end of every transformed record,
       * specify `Line` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-transformoutput.html#cfn-sagemaker-modelpackage-transformoutput-assemblewith)
       */
      override fun assembleWith(): String? = unwrap(this).getAssembleWith()

      /**
       * The AWS Key Management Service ( AWS KMS) key that Amazon SageMaker uses to encrypt the
       * model artifacts at rest using Amazon S3 server-side encryption.
       *
       * The `KmsKeyId` can be any of the following formats:
       *
       * * Key ID: `1234abcd-12ab-34cd-56ef-1234567890ab`
       * * Key ARN: `arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab`
       * * Alias name: `alias/ExampleAlias`
       * * Alias name ARN: `arn:aws:kms:us-west-2:111122223333:alias/ExampleAlias`
       *
       * If you don't provide a KMS key ID, Amazon SageMaker uses the default KMS key for Amazon S3
       * for your role's account. For more information, see [KMS-Managed Encryption
       * Keys](https://docs.aws.amazon.com/AmazonS3/latest/dev/UsingKMSEncryption.html) in the *Amazon
       * Simple Storage Service Developer Guide.*
       *
       * The KMS key policy must grant permission to the IAM role that you specify in your
       * [CreateModel](https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_CreateModel.html)
       * request. For more information, see [Using Key Policies in AWS
       * KMS](https://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html) in the *AWS Key
       * Management Service Developer Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-transformoutput.html#cfn-sagemaker-modelpackage-transformoutput-kmskeyid)
       */
      override fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

      /**
       * The Amazon S3 path where you want Amazon SageMaker to store the results of the transform
       * job.
       *
       * For example, `s3://bucket-name/key-name-prefix` .
       *
       * For every S3 object used as input for the transform job, batch transform stores the
       * transformed data with an . `out` suffix in a corresponding subfolder in the location in the
       * output prefix. For example, for the input data stored at
       * `s3://bucket-name/input-name-prefix/dataset01/data.csv` , batch transform stores the
       * transformed data at `s3://bucket-name/output-name-prefix/input-name-prefix/data.csv.out` .
       * Batch transform doesn't upload partially processed objects. For an input S3 object that
       * contains multiple records, it creates an . `out` file only if the transform job succeeds on
       * the entire file. When the input contains multiple S3 objects, the batch transform job
       * processes the listed S3 objects and uploads only the output for successfully processed
       * objects. If any object fails in the transform job batch transform marks the job as failed to
       * prompt investigation.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-transformoutput.html#cfn-sagemaker-modelpackage-transformoutput-s3outputpath)
       */
      override fun s3OutputPath(): String = unwrap(this).getS3OutputPath()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): TransformOutputProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelPackage.TransformOutputProperty):
          TransformOutputProperty = CdkObjectWrappers.wrap(cdkObject) as? TransformOutputProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: TransformOutputProperty):
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.TransformOutputProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.TransformOutputProperty
    }
  }

  /**
   * Describes the resources, including ML instance types and ML instance count, to use for
   * transform job.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sagemaker.*;
   * TransformResourcesProperty transformResourcesProperty = TransformResourcesProperty.builder()
   * .instanceCount(123)
   * .instanceType("instanceType")
   * // the properties below are optional
   * .volumeKmsKeyId("volumeKmsKeyId")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-transformresources.html)
   */
  public interface TransformResourcesProperty {
    /**
     * The number of ML compute instances to use in the transform job.
     *
     * The default value is `1` , and the maximum is `100` . For distributed transform jobs, specify
     * a value greater than `1` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-transformresources.html#cfn-sagemaker-modelpackage-transformresources-instancecount)
     */
    public fun instanceCount(): Number

    /**
     * The ML compute instance type for the transform job.
     *
     * If you are using built-in algorithms to transform moderately sized datasets, we recommend
     * using ml.m4.xlarge or `ml.m5.large` instance types.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-transformresources.html#cfn-sagemaker-modelpackage-transformresources-instancetype)
     */
    public fun instanceType(): String

    /**
     * The AWS Key Management Service ( AWS KMS) key that Amazon SageMaker uses to encrypt model
     * data on the storage volume attached to the ML compute instance(s) that run the batch transform
     * job.
     *
     *
     * Certain Nitro-based instances include local storage, dependent on the instance type. Local
     * storage volumes are encrypted using a hardware module on the instance. You can't request a
     * `VolumeKmsKeyId` when using an instance type with local storage.
     *
     * For a list of instance types that support local instance storage, see [Instance Store
     * Volumes](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/InstanceStorage.html#instance-store-volumes)
     * .
     *
     * For more information about local instance storage encryption, see [SSD Instance Store
     * Volumes](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ssd-instance-store.html) .
     *
     *
     * The `VolumeKmsKeyId` can be any of the following formats:
     *
     * * Key ID: `1234abcd-12ab-34cd-56ef-1234567890ab`
     * * Key ARN: `arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab`
     * * Alias name: `alias/ExampleAlias`
     * * Alias name ARN: `arn:aws:kms:us-west-2:111122223333:alias/ExampleAlias`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-transformresources.html#cfn-sagemaker-modelpackage-transformresources-volumekmskeyid)
     */
    public fun volumeKmsKeyId(): String? = unwrap(this).getVolumeKmsKeyId()

    /**
     * A builder for [TransformResourcesProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param instanceCount The number of ML compute instances to use in the transform job. 
       * The default value is `1` , and the maximum is `100` . For distributed transform jobs,
       * specify a value greater than `1` .
       */
      public fun instanceCount(instanceCount: Number)

      /**
       * @param instanceType The ML compute instance type for the transform job. 
       * If you are using built-in algorithms to transform moderately sized datasets, we recommend
       * using ml.m4.xlarge or `ml.m5.large` instance types.
       */
      public fun instanceType(instanceType: String)

      /**
       * @param volumeKmsKeyId The AWS Key Management Service ( AWS KMS) key that Amazon SageMaker
       * uses to encrypt model data on the storage volume attached to the ML compute instance(s) that
       * run the batch transform job.
       *
       * Certain Nitro-based instances include local storage, dependent on the instance type. Local
       * storage volumes are encrypted using a hardware module on the instance. You can't request a
       * `VolumeKmsKeyId` when using an instance type with local storage.
       *
       * For a list of instance types that support local instance storage, see [Instance Store
       * Volumes](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/InstanceStorage.html#instance-store-volumes)
       * .
       *
       * For more information about local instance storage encryption, see [SSD Instance Store
       * Volumes](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ssd-instance-store.html) .
       *
       *
       * The `VolumeKmsKeyId` can be any of the following formats:
       *
       * * Key ID: `1234abcd-12ab-34cd-56ef-1234567890ab`
       * * Key ARN: `arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab`
       * * Alias name: `alias/ExampleAlias`
       * * Alias name ARN: `arn:aws:kms:us-west-2:111122223333:alias/ExampleAlias`
       */
      public fun volumeKmsKeyId(volumeKmsKeyId: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.TransformResourcesProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.TransformResourcesProperty.builder()

      /**
       * @param instanceCount The number of ML compute instances to use in the transform job. 
       * The default value is `1` , and the maximum is `100` . For distributed transform jobs,
       * specify a value greater than `1` .
       */
      override fun instanceCount(instanceCount: Number) {
        cdkBuilder.instanceCount(instanceCount)
      }

      /**
       * @param instanceType The ML compute instance type for the transform job. 
       * If you are using built-in algorithms to transform moderately sized datasets, we recommend
       * using ml.m4.xlarge or `ml.m5.large` instance types.
       */
      override fun instanceType(instanceType: String) {
        cdkBuilder.instanceType(instanceType)
      }

      /**
       * @param volumeKmsKeyId The AWS Key Management Service ( AWS KMS) key that Amazon SageMaker
       * uses to encrypt model data on the storage volume attached to the ML compute instance(s) that
       * run the batch transform job.
       *
       * Certain Nitro-based instances include local storage, dependent on the instance type. Local
       * storage volumes are encrypted using a hardware module on the instance. You can't request a
       * `VolumeKmsKeyId` when using an instance type with local storage.
       *
       * For a list of instance types that support local instance storage, see [Instance Store
       * Volumes](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/InstanceStorage.html#instance-store-volumes)
       * .
       *
       * For more information about local instance storage encryption, see [SSD Instance Store
       * Volumes](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ssd-instance-store.html) .
       *
       *
       * The `VolumeKmsKeyId` can be any of the following formats:
       *
       * * Key ID: `1234abcd-12ab-34cd-56ef-1234567890ab`
       * * Key ARN: `arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab`
       * * Alias name: `alias/ExampleAlias`
       * * Alias name ARN: `arn:aws:kms:us-west-2:111122223333:alias/ExampleAlias`
       */
      override fun volumeKmsKeyId(volumeKmsKeyId: String) {
        cdkBuilder.volumeKmsKeyId(volumeKmsKeyId)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.TransformResourcesProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelPackage.TransformResourcesProperty,
    ) : CdkObject(cdkObject),
        TransformResourcesProperty {
      /**
       * The number of ML compute instances to use in the transform job.
       *
       * The default value is `1` , and the maximum is `100` . For distributed transform jobs,
       * specify a value greater than `1` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-transformresources.html#cfn-sagemaker-modelpackage-transformresources-instancecount)
       */
      override fun instanceCount(): Number = unwrap(this).getInstanceCount()

      /**
       * The ML compute instance type for the transform job.
       *
       * If you are using built-in algorithms to transform moderately sized datasets, we recommend
       * using ml.m4.xlarge or `ml.m5.large` instance types.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-transformresources.html#cfn-sagemaker-modelpackage-transformresources-instancetype)
       */
      override fun instanceType(): String = unwrap(this).getInstanceType()

      /**
       * The AWS Key Management Service ( AWS KMS) key that Amazon SageMaker uses to encrypt model
       * data on the storage volume attached to the ML compute instance(s) that run the batch transform
       * job.
       *
       *
       * Certain Nitro-based instances include local storage, dependent on the instance type. Local
       * storage volumes are encrypted using a hardware module on the instance. You can't request a
       * `VolumeKmsKeyId` when using an instance type with local storage.
       *
       * For a list of instance types that support local instance storage, see [Instance Store
       * Volumes](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/InstanceStorage.html#instance-store-volumes)
       * .
       *
       * For more information about local instance storage encryption, see [SSD Instance Store
       * Volumes](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ssd-instance-store.html) .
       *
       *
       * The `VolumeKmsKeyId` can be any of the following formats:
       *
       * * Key ID: `1234abcd-12ab-34cd-56ef-1234567890ab`
       * * Key ARN: `arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab`
       * * Alias name: `alias/ExampleAlias`
       * * Alias name ARN: `arn:aws:kms:us-west-2:111122223333:alias/ExampleAlias`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-transformresources.html#cfn-sagemaker-modelpackage-transformresources-volumekmskeyid)
       */
      override fun volumeKmsKeyId(): String? = unwrap(this).getVolumeKmsKeyId()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): TransformResourcesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelPackage.TransformResourcesProperty):
          TransformResourcesProperty = CdkObjectWrappers.wrap(cdkObject) as?
          TransformResourcesProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: TransformResourcesProperty):
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.TransformResourcesProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.TransformResourcesProperty
    }
  }

  /**
   * Contains data, such as the inputs and targeted instance types that are used in the process of
   * validating the model package.
   *
   * The data provided in the validation profile is made available to your buyers on AWS
   * Marketplace.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sagemaker.*;
   * ValidationProfileProperty validationProfileProperty = ValidationProfileProperty.builder()
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-validationprofile.html)
   */
  public interface ValidationProfileProperty {
    /**
     * The name of the profile for the model package.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-validationprofile.html#cfn-sagemaker-modelpackage-validationprofile-profilename)
     */
    public fun profileName(): String

    /**
     * The `TransformJobDefinition` object that describes the transform job used for the validation
     * of the model package.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-validationprofile.html#cfn-sagemaker-modelpackage-validationprofile-transformjobdefinition)
     */
    public fun transformJobDefinition(): Any

    /**
     * A builder for [ValidationProfileProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param profileName The name of the profile for the model package. 
       */
      public fun profileName(profileName: String)

      /**
       * @param transformJobDefinition The `TransformJobDefinition` object that describes the
       * transform job used for the validation of the model package. 
       */
      public fun transformJobDefinition(transformJobDefinition: IResolvable)

      /**
       * @param transformJobDefinition The `TransformJobDefinition` object that describes the
       * transform job used for the validation of the model package. 
       */
      public fun transformJobDefinition(transformJobDefinition: TransformJobDefinitionProperty)

      /**
       * @param transformJobDefinition The `TransformJobDefinition` object that describes the
       * transform job used for the validation of the model package. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a474cb846bb6f45fabf0cac8c72139c0a32686c9dbdc9792327efb3e0ffd582a")
      public
          fun transformJobDefinition(transformJobDefinition: TransformJobDefinitionProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.ValidationProfileProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.ValidationProfileProperty.builder()

      /**
       * @param profileName The name of the profile for the model package. 
       */
      override fun profileName(profileName: String) {
        cdkBuilder.profileName(profileName)
      }

      /**
       * @param transformJobDefinition The `TransformJobDefinition` object that describes the
       * transform job used for the validation of the model package. 
       */
      override fun transformJobDefinition(transformJobDefinition: IResolvable) {
        cdkBuilder.transformJobDefinition(transformJobDefinition.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param transformJobDefinition The `TransformJobDefinition` object that describes the
       * transform job used for the validation of the model package. 
       */
      override fun transformJobDefinition(transformJobDefinition: TransformJobDefinitionProperty) {
        cdkBuilder.transformJobDefinition(transformJobDefinition.let(TransformJobDefinitionProperty.Companion::unwrap))
      }

      /**
       * @param transformJobDefinition The `TransformJobDefinition` object that describes the
       * transform job used for the validation of the model package. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a474cb846bb6f45fabf0cac8c72139c0a32686c9dbdc9792327efb3e0ffd582a")
      override
          fun transformJobDefinition(transformJobDefinition: TransformJobDefinitionProperty.Builder.() -> Unit):
          Unit = transformJobDefinition(TransformJobDefinitionProperty(transformJobDefinition))

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.ValidationProfileProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelPackage.ValidationProfileProperty,
    ) : CdkObject(cdkObject),
        ValidationProfileProperty {
      /**
       * The name of the profile for the model package.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-validationprofile.html#cfn-sagemaker-modelpackage-validationprofile-profilename)
       */
      override fun profileName(): String = unwrap(this).getProfileName()

      /**
       * The `TransformJobDefinition` object that describes the transform job used for the
       * validation of the model package.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-validationprofile.html#cfn-sagemaker-modelpackage-validationprofile-transformjobdefinition)
       */
      override fun transformJobDefinition(): Any = unwrap(this).getTransformJobDefinition()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ValidationProfileProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelPackage.ValidationProfileProperty):
          ValidationProfileProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ValidationProfileProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ValidationProfileProperty):
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.ValidationProfileProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.ValidationProfileProperty
    }
  }

  /**
   * Specifies batch transform jobs that SageMaker runs to validate your model package.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sagemaker.*;
   * ValidationSpecificationProperty validationSpecificationProperty =
   * ValidationSpecificationProperty.builder()
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-validationspecification.html)
   */
  public interface ValidationSpecificationProperty {
    /**
     * An array of `ModelPackageValidationProfile` objects, each of which specifies a batch
     * transform job that SageMaker runs to validate your model package.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-validationspecification.html#cfn-sagemaker-modelpackage-validationspecification-validationprofiles)
     */
    public fun validationProfiles(): Any

    /**
     * The IAM roles to be used for the validation of the model package.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-validationspecification.html#cfn-sagemaker-modelpackage-validationspecification-validationrole)
     */
    public fun validationRole(): String

    /**
     * A builder for [ValidationSpecificationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param validationProfiles An array of `ModelPackageValidationProfile` objects, each of
       * which specifies a batch transform job that SageMaker runs to validate your model package. 
       */
      public fun validationProfiles(validationProfiles: IResolvable)

      /**
       * @param validationProfiles An array of `ModelPackageValidationProfile` objects, each of
       * which specifies a batch transform job that SageMaker runs to validate your model package. 
       */
      public fun validationProfiles(validationProfiles: List<Any>)

      /**
       * @param validationProfiles An array of `ModelPackageValidationProfile` objects, each of
       * which specifies a batch transform job that SageMaker runs to validate your model package. 
       */
      public fun validationProfiles(vararg validationProfiles: Any)

      /**
       * @param validationRole The IAM roles to be used for the validation of the model package. 
       */
      public fun validationRole(validationRole: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.ValidationSpecificationProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.ValidationSpecificationProperty.builder()

      /**
       * @param validationProfiles An array of `ModelPackageValidationProfile` objects, each of
       * which specifies a batch transform job that SageMaker runs to validate your model package. 
       */
      override fun validationProfiles(validationProfiles: IResolvable) {
        cdkBuilder.validationProfiles(validationProfiles.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param validationProfiles An array of `ModelPackageValidationProfile` objects, each of
       * which specifies a batch transform job that SageMaker runs to validate your model package. 
       */
      override fun validationProfiles(validationProfiles: List<Any>) {
        cdkBuilder.validationProfiles(validationProfiles.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param validationProfiles An array of `ModelPackageValidationProfile` objects, each of
       * which specifies a batch transform job that SageMaker runs to validate your model package. 
       */
      override fun validationProfiles(vararg validationProfiles: Any): Unit =
          validationProfiles(validationProfiles.toList())

      /**
       * @param validationRole The IAM roles to be used for the validation of the model package. 
       */
      override fun validationRole(validationRole: String) {
        cdkBuilder.validationRole(validationRole)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.ValidationSpecificationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelPackage.ValidationSpecificationProperty,
    ) : CdkObject(cdkObject),
        ValidationSpecificationProperty {
      /**
       * An array of `ModelPackageValidationProfile` objects, each of which specifies a batch
       * transform job that SageMaker runs to validate your model package.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-validationspecification.html#cfn-sagemaker-modelpackage-validationspecification-validationprofiles)
       */
      override fun validationProfiles(): Any = unwrap(this).getValidationProfiles()

      /**
       * The IAM roles to be used for the validation of the model package.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-validationspecification.html#cfn-sagemaker-modelpackage-validationspecification-validationrole)
       */
      override fun validationRole(): String = unwrap(this).getValidationRole()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ValidationSpecificationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelPackage.ValidationSpecificationProperty):
          ValidationSpecificationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ValidationSpecificationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ValidationSpecificationProperty):
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.ValidationSpecificationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.ValidationSpecificationProperty
    }
  }
}
