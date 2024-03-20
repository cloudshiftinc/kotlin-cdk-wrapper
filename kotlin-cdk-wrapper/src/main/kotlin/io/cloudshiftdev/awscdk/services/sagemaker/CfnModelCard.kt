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
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Creates an Amazon SageMaker Model Card.
 *
 * For information about how to use model cards, see [Amazon SageMaker Model
 * Card](https://docs.aws.amazon.com/sagemaker/latest/dg/model-cards.html) .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.sagemaker.*;
 * Object value;
 * CfnModelCard cfnModelCard = CfnModelCard.Builder.create(this, "MyCfnModelCard")
 * .content(ContentProperty.builder()
 * .additionalInformation(AdditionalInformationProperty.builder()
 * .caveatsAndRecommendations("caveatsAndRecommendations")
 * .customDetails(Map.of(
 * "customDetailsKey", "customDetails"))
 * .ethicalConsiderations("ethicalConsiderations")
 * .build())
 * .businessDetails(BusinessDetailsProperty.builder()
 * .businessProblem("businessProblem")
 * .businessStakeholders("businessStakeholders")
 * .lineOfBusiness("lineOfBusiness")
 * .build())
 * .evaluationDetails(List.of(EvaluationDetailProperty.builder()
 * .name("name")
 * // the properties below are optional
 * .datasets(List.of("datasets"))
 * .evaluationJobArn("evaluationJobArn")
 * .evaluationObservation("evaluationObservation")
 * .metadata(Map.of(
 * "metadataKey", "metadata"))
 * .metricGroups(List.of(MetricGroupProperty.builder()
 * .metricData(List.of(MetricDataItemsProperty.builder()
 * .name("name")
 * .type("type")
 * .value(value)
 * // the properties below are optional
 * .notes("notes")
 * .xAxisName(List.of("xAxisName"))
 * .yAxisName(List.of("yAxisName"))
 * .build()))
 * .name("name")
 * .build()))
 * .build()))
 * .intendedUses(IntendedUsesProperty.builder()
 * .explanationsForRiskRating("explanationsForRiskRating")
 * .factorsAffectingModelEfficiency("factorsAffectingModelEfficiency")
 * .intendedUses("intendedUses")
 * .purposeOfModel("purposeOfModel")
 * .riskRating("riskRating")
 * .build())
 * .modelOverview(ModelOverviewProperty.builder()
 * .algorithmType("algorithmType")
 * .inferenceEnvironment(InferenceEnvironmentProperty.builder()
 * .containerImage(List.of("containerImage"))
 * .build())
 * .modelArtifact(List.of("modelArtifact"))
 * .modelCreator("modelCreator")
 * .modelDescription("modelDescription")
 * .modelId("modelId")
 * .modelName("modelName")
 * .modelOwner("modelOwner")
 * .modelVersion(123)
 * .problemType("problemType")
 * .build())
 * .modelPackageDetails(ModelPackageDetailsProperty.builder()
 * .approvalDescription("approvalDescription")
 * .createdBy(ModelPackageCreatorProperty.builder()
 * .userProfileName("userProfileName")
 * .build())
 * .domain("domain")
 * .inferenceSpecification(InferenceSpecificationProperty.builder()
 * .containers(List.of(ContainerProperty.builder()
 * .image("image")
 * // the properties below are optional
 * .modelDataUrl("modelDataUrl")
 * .nearestModelName("nearestModelName")
 * .build()))
 * .build())
 * .modelApprovalStatus("modelApprovalStatus")
 * .modelPackageArn("modelPackageArn")
 * .modelPackageDescription("modelPackageDescription")
 * .modelPackageGroupName("modelPackageGroupName")
 * .modelPackageName("modelPackageName")
 * .modelPackageStatus("modelPackageStatus")
 * .modelPackageVersion(123)
 * .sourceAlgorithms(List.of(SourceAlgorithmProperty.builder()
 * .algorithmName("algorithmName")
 * // the properties below are optional
 * .modelDataUrl("modelDataUrl")
 * .build()))
 * .task("task")
 * .build())
 * .trainingDetails(TrainingDetailsProperty.builder()
 * .objectiveFunction(ObjectiveFunctionProperty.builder()
 * .function(FunctionProperty.builder()
 * .condition("condition")
 * .facet("facet")
 * .function("function")
 * .build())
 * .notes("notes")
 * .build())
 * .trainingJobDetails(TrainingJobDetailsProperty.builder()
 * .hyperParameters(List.of(TrainingHyperParameterProperty.builder()
 * .name("name")
 * .value("value")
 * .build()))
 * .trainingArn("trainingArn")
 * .trainingDatasets(List.of("trainingDatasets"))
 * .trainingEnvironment(TrainingEnvironmentProperty.builder()
 * .containerImage(List.of("containerImage"))
 * .build())
 * .trainingMetrics(List.of(TrainingMetricProperty.builder()
 * .name("name")
 * .value(123)
 * // the properties below are optional
 * .notes("notes")
 * .build()))
 * .userProvidedHyperParameters(List.of(TrainingHyperParameterProperty.builder()
 * .name("name")
 * .value("value")
 * .build()))
 * .userProvidedTrainingMetrics(List.of(TrainingMetricProperty.builder()
 * .name("name")
 * .value(123)
 * // the properties below are optional
 * .notes("notes")
 * .build()))
 * .build())
 * .trainingObservations("trainingObservations")
 * .build())
 * .build())
 * .modelCardName("modelCardName")
 * .modelCardStatus("modelCardStatus")
 * // the properties below are optional
 * .createdBy(UserContextProperty.builder()
 * .domainId("domainId")
 * .userProfileArn("userProfileArn")
 * .userProfileName("userProfileName")
 * .build())
 * .lastModifiedBy(UserContextProperty.builder()
 * .domainId("domainId")
 * .userProfileArn("userProfileArn")
 * .userProfileName("userProfileName")
 * .build())
 * .securityConfig(SecurityConfigProperty.builder()
 * .kmsKeyId("kmsKeyId")
 * .build())
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelcard.html)
 */
public open class CfnModelCard internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelCard,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnModelCardProps,
  ) :
      this(software.amazon.awscdk.services.sagemaker.CfnModelCard(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CfnModelCardProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnModelCardProps.Builder.() -> Unit,
  ) : this(scope, id, CfnModelCardProps(props)
  )

  /**
   * The domain associated with the user.
   */
  public open fun attrCreatedByDomainId(): String = unwrap(this).getAttrCreatedByDomainId()

  /**
   * The Amazon Resource Name (ARN) of the user's profile.
   */
  public open fun attrCreatedByUserProfileArn(): String =
      unwrap(this).getAttrCreatedByUserProfileArn()

  /**
   * The name of the user's profile.
   */
  public open fun attrCreatedByUserProfileName(): String =
      unwrap(this).getAttrCreatedByUserProfileName()

  /**
   * The date and time the model card was created.
   */
  public open fun attrCreationTime(): String = unwrap(this).getAttrCreationTime()

  /**
   * The domain associated with the user.
   */
  public open fun attrLastModifiedByDomainId(): String =
      unwrap(this).getAttrLastModifiedByDomainId()

  /**
   * The Amazon Resource Name (ARN) of the user's profile.
   */
  public open fun attrLastModifiedByUserProfileArn(): String =
      unwrap(this).getAttrLastModifiedByUserProfileArn()

  /**
   * The name of the user's profile.
   */
  public open fun attrLastModifiedByUserProfileName(): String =
      unwrap(this).getAttrLastModifiedByUserProfileName()

  /**
   * The date and time the model card was last modified.
   */
  public open fun attrLastModifiedTime(): String = unwrap(this).getAttrLastModifiedTime()

  /**
   * The Amazon Resource Number (ARN) of the model card.
   *
   * For example, `arn:aws:sagemaker:us-west-2:012345678901:modelcard/examplemodelcard` .
   */
  public open fun attrModelCardArn(): String = unwrap(this).getAttrModelCardArn()

  /**
   * The processing status of model card deletion.
   *
   * The ModelCardProcessingStatus updates throughout the different deletion steps.
   */
  public open fun attrModelCardProcessingStatus(): String =
      unwrap(this).getAttrModelCardProcessingStatus()

  /**
   * A version of the model card.
   */
  public open fun attrModelCardVersion(): Number = unwrap(this).getAttrModelCardVersion()

  /**
   * The content of the model card.
   */
  public open fun content(): Any = unwrap(this).getContent()

  /**
   * The content of the model card.
   */
  public open fun content(`value`: IResolvable) {
    unwrap(this).setContent(`value`.let(IResolvable::unwrap))
  }

  /**
   * The content of the model card.
   */
  public open fun content(`value`: ContentProperty) {
    unwrap(this).setContent(`value`.let(ContentProperty::unwrap))
  }

  /**
   * The content of the model card.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("b7cfe80db0c7e7a04efe91161af81b85231ebf0bbfb3e6155cf2b2d2e008685e")
  public open fun content(`value`: ContentProperty.Builder.() -> Unit): Unit =
      content(ContentProperty(`value`))

  /**
   * Information about the user who created or modified one or more of the following:.
   */
  public open fun createdBy(): Any? = unwrap(this).getCreatedBy()

  /**
   * Information about the user who created or modified one or more of the following:.
   */
  public open fun createdBy(`value`: IResolvable) {
    unwrap(this).setCreatedBy(`value`.let(IResolvable::unwrap))
  }

  /**
   * Information about the user who created or modified one or more of the following:.
   */
  public open fun createdBy(`value`: UserContextProperty) {
    unwrap(this).setCreatedBy(`value`.let(UserContextProperty::unwrap))
  }

  /**
   * Information about the user who created or modified one or more of the following:.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("4c1aa41d66d613c16fec5b38a433337bf1cb248c012803dbebc20d7c427d81dc")
  public open fun createdBy(`value`: UserContextProperty.Builder.() -> Unit): Unit =
      createdBy(UserContextProperty(`value`))

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * Information about the user who created or modified an experiment, trial, trial component,
   * lineage group, project, or model card.
   */
  public open fun lastModifiedBy(): Any? = unwrap(this).getLastModifiedBy()

  /**
   * Information about the user who created or modified an experiment, trial, trial component,
   * lineage group, project, or model card.
   */
  public open fun lastModifiedBy(`value`: IResolvable) {
    unwrap(this).setLastModifiedBy(`value`.let(IResolvable::unwrap))
  }

  /**
   * Information about the user who created or modified an experiment, trial, trial component,
   * lineage group, project, or model card.
   */
  public open fun lastModifiedBy(`value`: UserContextProperty) {
    unwrap(this).setLastModifiedBy(`value`.let(UserContextProperty::unwrap))
  }

  /**
   * Information about the user who created or modified an experiment, trial, trial component,
   * lineage group, project, or model card.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("f6d0ffc1dfae359feb43bd4c2c2c42f74e20beb0769803fe68f5a40ffd55b1e6")
  public open fun lastModifiedBy(`value`: UserContextProperty.Builder.() -> Unit): Unit =
      lastModifiedBy(UserContextProperty(`value`))

  /**
   * The unique name of the model card.
   */
  public open fun modelCardName(): String = unwrap(this).getModelCardName()

  /**
   * The unique name of the model card.
   */
  public open fun modelCardName(`value`: String) {
    unwrap(this).setModelCardName(`value`)
  }

  /**
   * The approval status of the model card within your organization.
   */
  public open fun modelCardStatus(): String = unwrap(this).getModelCardStatus()

  /**
   * The approval status of the model card within your organization.
   */
  public open fun modelCardStatus(`value`: String) {
    unwrap(this).setModelCardStatus(`value`)
  }

  /**
   * The security configuration used to protect model card data.
   */
  public open fun securityConfig(): Any? = unwrap(this).getSecurityConfig()

  /**
   * The security configuration used to protect model card data.
   */
  public open fun securityConfig(`value`: IResolvable) {
    unwrap(this).setSecurityConfig(`value`.let(IResolvable::unwrap))
  }

  /**
   * The security configuration used to protect model card data.
   */
  public open fun securityConfig(`value`: SecurityConfigProperty) {
    unwrap(this).setSecurityConfig(`value`.let(SecurityConfigProperty::unwrap))
  }

  /**
   * The security configuration used to protect model card data.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("d29255f48c0c5fb005232e5da8985feb5de9ff1b655b0b84daa5d9204a969c8f")
  public open fun securityConfig(`value`: SecurityConfigProperty.Builder.() -> Unit): Unit =
      securityConfig(SecurityConfigProperty(`value`))

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * Key-value pairs used to manage metadata for the model card.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * Key-value pairs used to manage metadata for the model card.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * Key-value pairs used to manage metadata for the model card.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.sagemaker.CfnModelCard].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The content of the model card.
     *
     * Content uses the [model card JSON
     * schema](https://docs.aws.amazon.com/sagemaker/latest/dg/model-cards.html#model-cards-json-schema)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelcard.html#cfn-sagemaker-modelcard-content)
     * @param content The content of the model card. 
     */
    public fun content(content: IResolvable)

    /**
     * The content of the model card.
     *
     * Content uses the [model card JSON
     * schema](https://docs.aws.amazon.com/sagemaker/latest/dg/model-cards.html#model-cards-json-schema)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelcard.html#cfn-sagemaker-modelcard-content)
     * @param content The content of the model card. 
     */
    public fun content(content: ContentProperty)

    /**
     * The content of the model card.
     *
     * Content uses the [model card JSON
     * schema](https://docs.aws.amazon.com/sagemaker/latest/dg/model-cards.html#model-cards-json-schema)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelcard.html#cfn-sagemaker-modelcard-content)
     * @param content The content of the model card. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1f28d93af6185b70189cc5f6c1c1b17d4b562031e807aa8e9296643238552ac3")
    public fun content(content: ContentProperty.Builder.() -> Unit)

    /**
     * Information about the user who created or modified one or more of the following:.
     *
     * * Experiment
     * * Trial
     * * Trial component
     * * Lineage group
     * * Project
     * * Model Card
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelcard.html#cfn-sagemaker-modelcard-createdby)
     * @param createdBy Information about the user who created or modified one or more of the
     * following:. 
     */
    public fun createdBy(createdBy: IResolvable)

    /**
     * Information about the user who created or modified one or more of the following:.
     *
     * * Experiment
     * * Trial
     * * Trial component
     * * Lineage group
     * * Project
     * * Model Card
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelcard.html#cfn-sagemaker-modelcard-createdby)
     * @param createdBy Information about the user who created or modified one or more of the
     * following:. 
     */
    public fun createdBy(createdBy: UserContextProperty)

    /**
     * Information about the user who created or modified one or more of the following:.
     *
     * * Experiment
     * * Trial
     * * Trial component
     * * Lineage group
     * * Project
     * * Model Card
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelcard.html#cfn-sagemaker-modelcard-createdby)
     * @param createdBy Information about the user who created or modified one or more of the
     * following:. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("05f2ba948b7e805200d1f67f9086b3d86f4d21e361529b0483a2db9512d5a416")
    public fun createdBy(createdBy: UserContextProperty.Builder.() -> Unit)

    /**
     * Information about the user who created or modified an experiment, trial, trial component,
     * lineage group, project, or model card.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelcard.html#cfn-sagemaker-modelcard-lastmodifiedby)
     * @param lastModifiedBy Information about the user who created or modified an experiment,
     * trial, trial component, lineage group, project, or model card. 
     */
    public fun lastModifiedBy(lastModifiedBy: IResolvable)

    /**
     * Information about the user who created or modified an experiment, trial, trial component,
     * lineage group, project, or model card.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelcard.html#cfn-sagemaker-modelcard-lastmodifiedby)
     * @param lastModifiedBy Information about the user who created or modified an experiment,
     * trial, trial component, lineage group, project, or model card. 
     */
    public fun lastModifiedBy(lastModifiedBy: UserContextProperty)

    /**
     * Information about the user who created or modified an experiment, trial, trial component,
     * lineage group, project, or model card.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelcard.html#cfn-sagemaker-modelcard-lastmodifiedby)
     * @param lastModifiedBy Information about the user who created or modified an experiment,
     * trial, trial component, lineage group, project, or model card. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("18a415fc6cc2f2fda5a7793f0717507f1ae990f7d0fc3b6f3590382378821106")
    public fun lastModifiedBy(lastModifiedBy: UserContextProperty.Builder.() -> Unit)

    /**
     * The unique name of the model card.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelcard.html#cfn-sagemaker-modelcard-modelcardname)
     * @param modelCardName The unique name of the model card. 
     */
    public fun modelCardName(modelCardName: String)

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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelcard.html#cfn-sagemaker-modelcard-modelcardstatus)
     * @param modelCardStatus The approval status of the model card within your organization. 
     */
    public fun modelCardStatus(modelCardStatus: String)

    /**
     * The security configuration used to protect model card data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelcard.html#cfn-sagemaker-modelcard-securityconfig)
     * @param securityConfig The security configuration used to protect model card data. 
     */
    public fun securityConfig(securityConfig: IResolvable)

    /**
     * The security configuration used to protect model card data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelcard.html#cfn-sagemaker-modelcard-securityconfig)
     * @param securityConfig The security configuration used to protect model card data. 
     */
    public fun securityConfig(securityConfig: SecurityConfigProperty)

    /**
     * The security configuration used to protect model card data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelcard.html#cfn-sagemaker-modelcard-securityconfig)
     * @param securityConfig The security configuration used to protect model card data. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c274ebaa095a50a6c8fccf28d41c264635f6df0b7672cf1ef6dd218461c746d1")
    public fun securityConfig(securityConfig: SecurityConfigProperty.Builder.() -> Unit)

    /**
     * Key-value pairs used to manage metadata for the model card.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelcard.html#cfn-sagemaker-modelcard-tags)
     * @param tags Key-value pairs used to manage metadata for the model card. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * Key-value pairs used to manage metadata for the model card.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelcard.html#cfn-sagemaker-modelcard-tags)
     * @param tags Key-value pairs used to manage metadata for the model card. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.sagemaker.CfnModelCard.Builder =
        software.amazon.awscdk.services.sagemaker.CfnModelCard.Builder.create(scope, id)

    /**
     * The content of the model card.
     *
     * Content uses the [model card JSON
     * schema](https://docs.aws.amazon.com/sagemaker/latest/dg/model-cards.html#model-cards-json-schema)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelcard.html#cfn-sagemaker-modelcard-content)
     * @param content The content of the model card. 
     */
    override fun content(content: IResolvable) {
      cdkBuilder.content(content.let(IResolvable::unwrap))
    }

    /**
     * The content of the model card.
     *
     * Content uses the [model card JSON
     * schema](https://docs.aws.amazon.com/sagemaker/latest/dg/model-cards.html#model-cards-json-schema)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelcard.html#cfn-sagemaker-modelcard-content)
     * @param content The content of the model card. 
     */
    override fun content(content: ContentProperty) {
      cdkBuilder.content(content.let(ContentProperty::unwrap))
    }

    /**
     * The content of the model card.
     *
     * Content uses the [model card JSON
     * schema](https://docs.aws.amazon.com/sagemaker/latest/dg/model-cards.html#model-cards-json-schema)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelcard.html#cfn-sagemaker-modelcard-content)
     * @param content The content of the model card. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1f28d93af6185b70189cc5f6c1c1b17d4b562031e807aa8e9296643238552ac3")
    override fun content(content: ContentProperty.Builder.() -> Unit): Unit =
        content(ContentProperty(content))

    /**
     * Information about the user who created or modified one or more of the following:.
     *
     * * Experiment
     * * Trial
     * * Trial component
     * * Lineage group
     * * Project
     * * Model Card
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelcard.html#cfn-sagemaker-modelcard-createdby)
     * @param createdBy Information about the user who created or modified one or more of the
     * following:. 
     */
    override fun createdBy(createdBy: IResolvable) {
      cdkBuilder.createdBy(createdBy.let(IResolvable::unwrap))
    }

    /**
     * Information about the user who created or modified one or more of the following:.
     *
     * * Experiment
     * * Trial
     * * Trial component
     * * Lineage group
     * * Project
     * * Model Card
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelcard.html#cfn-sagemaker-modelcard-createdby)
     * @param createdBy Information about the user who created or modified one or more of the
     * following:. 
     */
    override fun createdBy(createdBy: UserContextProperty) {
      cdkBuilder.createdBy(createdBy.let(UserContextProperty::unwrap))
    }

    /**
     * Information about the user who created or modified one or more of the following:.
     *
     * * Experiment
     * * Trial
     * * Trial component
     * * Lineage group
     * * Project
     * * Model Card
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelcard.html#cfn-sagemaker-modelcard-createdby)
     * @param createdBy Information about the user who created or modified one or more of the
     * following:. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("05f2ba948b7e805200d1f67f9086b3d86f4d21e361529b0483a2db9512d5a416")
    override fun createdBy(createdBy: UserContextProperty.Builder.() -> Unit): Unit =
        createdBy(UserContextProperty(createdBy))

    /**
     * Information about the user who created or modified an experiment, trial, trial component,
     * lineage group, project, or model card.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelcard.html#cfn-sagemaker-modelcard-lastmodifiedby)
     * @param lastModifiedBy Information about the user who created or modified an experiment,
     * trial, trial component, lineage group, project, or model card. 
     */
    override fun lastModifiedBy(lastModifiedBy: IResolvable) {
      cdkBuilder.lastModifiedBy(lastModifiedBy.let(IResolvable::unwrap))
    }

    /**
     * Information about the user who created or modified an experiment, trial, trial component,
     * lineage group, project, or model card.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelcard.html#cfn-sagemaker-modelcard-lastmodifiedby)
     * @param lastModifiedBy Information about the user who created or modified an experiment,
     * trial, trial component, lineage group, project, or model card. 
     */
    override fun lastModifiedBy(lastModifiedBy: UserContextProperty) {
      cdkBuilder.lastModifiedBy(lastModifiedBy.let(UserContextProperty::unwrap))
    }

    /**
     * Information about the user who created or modified an experiment, trial, trial component,
     * lineage group, project, or model card.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelcard.html#cfn-sagemaker-modelcard-lastmodifiedby)
     * @param lastModifiedBy Information about the user who created or modified an experiment,
     * trial, trial component, lineage group, project, or model card. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("18a415fc6cc2f2fda5a7793f0717507f1ae990f7d0fc3b6f3590382378821106")
    override fun lastModifiedBy(lastModifiedBy: UserContextProperty.Builder.() -> Unit): Unit =
        lastModifiedBy(UserContextProperty(lastModifiedBy))

    /**
     * The unique name of the model card.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelcard.html#cfn-sagemaker-modelcard-modelcardname)
     * @param modelCardName The unique name of the model card. 
     */
    override fun modelCardName(modelCardName: String) {
      cdkBuilder.modelCardName(modelCardName)
    }

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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelcard.html#cfn-sagemaker-modelcard-modelcardstatus)
     * @param modelCardStatus The approval status of the model card within your organization. 
     */
    override fun modelCardStatus(modelCardStatus: String) {
      cdkBuilder.modelCardStatus(modelCardStatus)
    }

    /**
     * The security configuration used to protect model card data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelcard.html#cfn-sagemaker-modelcard-securityconfig)
     * @param securityConfig The security configuration used to protect model card data. 
     */
    override fun securityConfig(securityConfig: IResolvable) {
      cdkBuilder.securityConfig(securityConfig.let(IResolvable::unwrap))
    }

    /**
     * The security configuration used to protect model card data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelcard.html#cfn-sagemaker-modelcard-securityconfig)
     * @param securityConfig The security configuration used to protect model card data. 
     */
    override fun securityConfig(securityConfig: SecurityConfigProperty) {
      cdkBuilder.securityConfig(securityConfig.let(SecurityConfigProperty::unwrap))
    }

    /**
     * The security configuration used to protect model card data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelcard.html#cfn-sagemaker-modelcard-securityconfig)
     * @param securityConfig The security configuration used to protect model card data. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c274ebaa095a50a6c8fccf28d41c264635f6df0b7672cf1ef6dd218461c746d1")
    override fun securityConfig(securityConfig: SecurityConfigProperty.Builder.() -> Unit): Unit =
        securityConfig(SecurityConfigProperty(securityConfig))

    /**
     * Key-value pairs used to manage metadata for the model card.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelcard.html#cfn-sagemaker-modelcard-tags)
     * @param tags Key-value pairs used to manage metadata for the model card. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * Key-value pairs used to manage metadata for the model card.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelcard.html#cfn-sagemaker-modelcard-tags)
     * @param tags Key-value pairs used to manage metadata for the model card. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.sagemaker.CfnModelCard = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.sagemaker.CfnModelCard.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnModelCard {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnModelCard(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelCard):
        CfnModelCard = CfnModelCard(cdkObject)

    internal fun unwrap(wrapped: CfnModelCard):
        software.amazon.awscdk.services.sagemaker.CfnModelCard = wrapped.cdkObject
  }

  /**
   * A group of metric data that you use to initialize a metric group object.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sagemaker.*;
   * Object value;
   * MetricGroupProperty metricGroupProperty = MetricGroupProperty.builder()
   * .metricData(List.of(MetricDataItemsProperty.builder()
   * .name("name")
   * .type("type")
   * .value(value)
   * // the properties below are optional
   * .notes("notes")
   * .xAxisName(List.of("xAxisName"))
   * .yAxisName(List.of("yAxisName"))
   * .build()))
   * .name("name")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelcard-metricgroup.html)
   */
  public interface MetricGroupProperty {
    /**
     * A list of metric objects. The `MetricDataItems` list can have one of the following values:.
     *
     * * `bar_chart_metric`
     * * `matrix_metric`
     * * `simple_metric`
     * * `linear_graph_metric`
     *
     * For more information about the metric schema, see the definition section of the [model card
     * JSON
     * schema](https://docs.aws.amazon.com/sagemaker/latest/dg/model-cards.html#model-cards-json-schema)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelcard-metricgroup.html#cfn-sagemaker-modelcard-metricgroup-metricdata)
     */
    public fun metricData(): Any

    /**
     * The metric group name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelcard-metricgroup.html#cfn-sagemaker-modelcard-metricgroup-name)
     */
    public fun name(): String

    /**
     * A builder for [MetricGroupProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param metricData A list of metric objects. The `MetricDataItems` list can have one of the
       * following values:. 
       * * `bar_chart_metric`
       * * `matrix_metric`
       * * `simple_metric`
       * * `linear_graph_metric`
       *
       * For more information about the metric schema, see the definition section of the [model card
       * JSON
       * schema](https://docs.aws.amazon.com/sagemaker/latest/dg/model-cards.html#model-cards-json-schema)
       * .
       */
      public fun metricData(metricData: IResolvable)

      /**
       * @param metricData A list of metric objects. The `MetricDataItems` list can have one of the
       * following values:. 
       * * `bar_chart_metric`
       * * `matrix_metric`
       * * `simple_metric`
       * * `linear_graph_metric`
       *
       * For more information about the metric schema, see the definition section of the [model card
       * JSON
       * schema](https://docs.aws.amazon.com/sagemaker/latest/dg/model-cards.html#model-cards-json-schema)
       * .
       */
      public fun metricData(metricData: List<Any>)

      /**
       * @param metricData A list of metric objects. The `MetricDataItems` list can have one of the
       * following values:. 
       * * `bar_chart_metric`
       * * `matrix_metric`
       * * `simple_metric`
       * * `linear_graph_metric`
       *
       * For more information about the metric schema, see the definition section of the [model card
       * JSON
       * schema](https://docs.aws.amazon.com/sagemaker/latest/dg/model-cards.html#model-cards-json-schema)
       * .
       */
      public fun metricData(vararg metricData: Any)

      /**
       * @param name The metric group name. 
       */
      public fun name(name: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnModelCard.MetricGroupProperty.Builder =
          software.amazon.awscdk.services.sagemaker.CfnModelCard.MetricGroupProperty.builder()

      /**
       * @param metricData A list of metric objects. The `MetricDataItems` list can have one of the
       * following values:. 
       * * `bar_chart_metric`
       * * `matrix_metric`
       * * `simple_metric`
       * * `linear_graph_metric`
       *
       * For more information about the metric schema, see the definition section of the [model card
       * JSON
       * schema](https://docs.aws.amazon.com/sagemaker/latest/dg/model-cards.html#model-cards-json-schema)
       * .
       */
      override fun metricData(metricData: IResolvable) {
        cdkBuilder.metricData(metricData.let(IResolvable::unwrap))
      }

      /**
       * @param metricData A list of metric objects. The `MetricDataItems` list can have one of the
       * following values:. 
       * * `bar_chart_metric`
       * * `matrix_metric`
       * * `simple_metric`
       * * `linear_graph_metric`
       *
       * For more information about the metric schema, see the definition section of the [model card
       * JSON
       * schema](https://docs.aws.amazon.com/sagemaker/latest/dg/model-cards.html#model-cards-json-schema)
       * .
       */
      override fun metricData(metricData: List<Any>) {
        cdkBuilder.metricData(metricData)
      }

      /**
       * @param metricData A list of metric objects. The `MetricDataItems` list can have one of the
       * following values:. 
       * * `bar_chart_metric`
       * * `matrix_metric`
       * * `simple_metric`
       * * `linear_graph_metric`
       *
       * For more information about the metric schema, see the definition section of the [model card
       * JSON
       * schema](https://docs.aws.amazon.com/sagemaker/latest/dg/model-cards.html#model-cards-json-schema)
       * .
       */
      override fun metricData(vararg metricData: Any): Unit = metricData(metricData.toList())

      /**
       * @param name The metric group name. 
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public fun build(): software.amazon.awscdk.services.sagemaker.CfnModelCard.MetricGroupProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnModelCard.MetricGroupProperty,
    ) : CdkObject(cdkObject), MetricGroupProperty {
      /**
       * A list of metric objects. The `MetricDataItems` list can have one of the following values:.
       *
       * * `bar_chart_metric`
       * * `matrix_metric`
       * * `simple_metric`
       * * `linear_graph_metric`
       *
       * For more information about the metric schema, see the definition section of the [model card
       * JSON
       * schema](https://docs.aws.amazon.com/sagemaker/latest/dg/model-cards.html#model-cards-json-schema)
       * .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelcard-metricgroup.html#cfn-sagemaker-modelcard-metricgroup-metricdata)
       */
      override fun metricData(): Any = unwrap(this).getMetricData()

      /**
       * The metric group name.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelcard-metricgroup.html#cfn-sagemaker-modelcard-metricgroup-name)
       */
      override fun name(): String = unwrap(this).getName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): MetricGroupProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelCard.MetricGroupProperty):
          MetricGroupProperty = CdkObjectWrappers.wrap(cdkObject) as? MetricGroupProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: MetricGroupProperty):
          software.amazon.awscdk.services.sagemaker.CfnModelCard.MetricGroupProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnModelCard.MetricGroupProperty
    }
  }

  /**
   * A result from a SageMaker training job.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sagemaker.*;
   * TrainingMetricProperty trainingMetricProperty = TrainingMetricProperty.builder()
   * .name("name")
   * .value(123)
   * // the properties below are optional
   * .notes("notes")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelcard-trainingmetric.html)
   */
  public interface TrainingMetricProperty {
    /**
     * The name of the result from the SageMaker training job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelcard-trainingmetric.html#cfn-sagemaker-modelcard-trainingmetric-name)
     */
    public fun name(): String

    /**
     * Any additional notes describing the result of the training job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelcard-trainingmetric.html#cfn-sagemaker-modelcard-trainingmetric-notes)
     */
    public fun notes(): String? = unwrap(this).getNotes()

    /**
     * The value of a result from the SageMaker training job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelcard-trainingmetric.html#cfn-sagemaker-modelcard-trainingmetric-value)
     */
    public fun `value`(): Number

    /**
     * A builder for [TrainingMetricProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param name The name of the result from the SageMaker training job. 
       */
      public fun name(name: String)

      /**
       * @param notes Any additional notes describing the result of the training job.
       */
      public fun notes(notes: String)

      /**
       * @param value The value of a result from the SageMaker training job. 
       */
      public fun `value`(`value`: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnModelCard.TrainingMetricProperty.Builder =
          software.amazon.awscdk.services.sagemaker.CfnModelCard.TrainingMetricProperty.builder()

      /**
       * @param name The name of the result from the SageMaker training job. 
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      /**
       * @param notes Any additional notes describing the result of the training job.
       */
      override fun notes(notes: String) {
        cdkBuilder.notes(notes)
      }

      /**
       * @param value The value of a result from the SageMaker training job. 
       */
      override fun `value`(`value`: Number) {
        cdkBuilder.`value`(`value`)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnModelCard.TrainingMetricProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnModelCard.TrainingMetricProperty,
    ) : CdkObject(cdkObject), TrainingMetricProperty {
      /**
       * The name of the result from the SageMaker training job.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelcard-trainingmetric.html#cfn-sagemaker-modelcard-trainingmetric-name)
       */
      override fun name(): String = unwrap(this).getName()

      /**
       * Any additional notes describing the result of the training job.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelcard-trainingmetric.html#cfn-sagemaker-modelcard-trainingmetric-notes)
       */
      override fun notes(): String? = unwrap(this).getNotes()

      /**
       * The value of a result from the SageMaker training job.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelcard-trainingmetric.html#cfn-sagemaker-modelcard-trainingmetric-value)
       */
      override fun `value`(): Number = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): TrainingMetricProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelCard.TrainingMetricProperty):
          TrainingMetricProperty = CdkObjectWrappers.wrap(cdkObject) as? TrainingMetricProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: TrainingMetricProperty):
          software.amazon.awscdk.services.sagemaker.CfnModelCard.TrainingMetricProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnModelCard.TrainingMetricProperty
    }
  }

  /**
   * Metric data.
   *
   * The `type` determines the data types that you specify for `value` , `XAxisName` and `YAxisName`
   * . For information about specifying values for metrics, see [model card JSON
   * schema](https://docs.aws.amazon.com/sagemaker/latest/dg/model-cards.html#model-cards-json-schema)
   * .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sagemaker.*;
   * Object value;
   * MetricDataItemsProperty metricDataItemsProperty = MetricDataItemsProperty.builder()
   * .name("name")
   * .type("type")
   * .value(value)
   * // the properties below are optional
   * .notes("notes")
   * .xAxisName(List.of("xAxisName"))
   * .yAxisName(List.of("yAxisName"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelcard-metricdataitems.html)
   */
  public interface MetricDataItemsProperty {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelcard-metricdataitems.html#cfn-sagemaker-modelcard-metricdataitems-name)
     */
    public fun name(): String

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelcard-metricdataitems.html#cfn-sagemaker-modelcard-metricdataitems-notes)
     */
    public fun notes(): String? = unwrap(this).getNotes()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelcard-metricdataitems.html#cfn-sagemaker-modelcard-metricdataitems-type)
     */
    public fun type(): String

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelcard-metricdataitems.html#cfn-sagemaker-modelcard-metricdataitems-value)
     */
    public fun `value`(): Any

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelcard-metricdataitems.html#cfn-sagemaker-modelcard-metricdataitems-xaxisname)
     */
    public fun xAxisName(): List<String> = unwrap(this).getXAxisName() ?: emptyList()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelcard-metricdataitems.html#cfn-sagemaker-modelcard-metricdataitems-yaxisname)
     */
    public fun yAxisName(): List<String> = unwrap(this).getYAxisName() ?: emptyList()

    /**
     * A builder for [MetricDataItemsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param name the value to be set. 
       */
      public fun name(name: String)

      /**
       * @param notes the value to be set.
       */
      public fun notes(notes: String)

      /**
       * @param type the value to be set. 
       */
      public fun type(type: String)

      /**
       * @param value the value to be set. 
       */
      public fun `value`(`value`: Any)

      /**
       * @param xAxisName the value to be set.
       */
      public fun xAxisName(xAxisName: List<String>)

      /**
       * @param xAxisName the value to be set.
       */
      public fun xAxisName(vararg xAxisName: String)

      /**
       * @param yAxisName the value to be set.
       */
      public fun yAxisName(yAxisName: List<String>)

      /**
       * @param yAxisName the value to be set.
       */
      public fun yAxisName(vararg yAxisName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnModelCard.MetricDataItemsProperty.Builder =
          software.amazon.awscdk.services.sagemaker.CfnModelCard.MetricDataItemsProperty.builder()

      /**
       * @param name the value to be set. 
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      /**
       * @param notes the value to be set.
       */
      override fun notes(notes: String) {
        cdkBuilder.notes(notes)
      }

      /**
       * @param type the value to be set. 
       */
      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      /**
       * @param value the value to be set. 
       */
      override fun `value`(`value`: Any) {
        cdkBuilder.`value`(`value`)
      }

      /**
       * @param xAxisName the value to be set.
       */
      override fun xAxisName(xAxisName: List<String>) {
        cdkBuilder.xAxisName(xAxisName)
      }

      /**
       * @param xAxisName the value to be set.
       */
      override fun xAxisName(vararg xAxisName: String): Unit = xAxisName(xAxisName.toList())

      /**
       * @param yAxisName the value to be set.
       */
      override fun yAxisName(yAxisName: List<String>) {
        cdkBuilder.yAxisName(yAxisName)
      }

      /**
       * @param yAxisName the value to be set.
       */
      override fun yAxisName(vararg yAxisName: String): Unit = yAxisName(yAxisName.toList())

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnModelCard.MetricDataItemsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnModelCard.MetricDataItemsProperty,
    ) : CdkObject(cdkObject), MetricDataItemsProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelcard-metricdataitems.html#cfn-sagemaker-modelcard-metricdataitems-name)
       */
      override fun name(): String = unwrap(this).getName()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelcard-metricdataitems.html#cfn-sagemaker-modelcard-metricdataitems-notes)
       */
      override fun notes(): String? = unwrap(this).getNotes()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelcard-metricdataitems.html#cfn-sagemaker-modelcard-metricdataitems-type)
       */
      override fun type(): String = unwrap(this).getType()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelcard-metricdataitems.html#cfn-sagemaker-modelcard-metricdataitems-value)
       */
      override fun `value`(): Any = unwrap(this).getValue()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelcard-metricdataitems.html#cfn-sagemaker-modelcard-metricdataitems-xaxisname)
       */
      override fun xAxisName(): List<String> = unwrap(this).getXAxisName() ?: emptyList()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelcard-metricdataitems.html#cfn-sagemaker-modelcard-metricdataitems-yaxisname)
       */
      override fun yAxisName(): List<String> = unwrap(this).getYAxisName() ?: emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): MetricDataItemsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelCard.MetricDataItemsProperty):
          MetricDataItemsProperty = CdkObjectWrappers.wrap(cdkObject) as? MetricDataItemsProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: MetricDataItemsProperty):
          software.amazon.awscdk.services.sagemaker.CfnModelCard.MetricDataItemsProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnModelCard.MetricDataItemsProperty
    }
  }

  /**
   * The function that is optimized during model training.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sagemaker.*;
   * ObjectiveFunctionProperty objectiveFunctionProperty = ObjectiveFunctionProperty.builder()
   * .function(FunctionProperty.builder()
   * .condition("condition")
   * .facet("facet")
   * .function("function")
   * .build())
   * .notes("notes")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelcard-objectivefunction.html)
   */
  public interface ObjectiveFunctionProperty {
    /**
     * A function object that details optimization direction, metric, and additional descriptions.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelcard-objectivefunction.html#cfn-sagemaker-modelcard-objectivefunction-function)
     */
    public fun function(): Any? = unwrap(this).getFunction()

    /**
     * Notes about the object function, including other considerations for possible objective
     * functions.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelcard-objectivefunction.html#cfn-sagemaker-modelcard-objectivefunction-notes)
     */
    public fun notes(): String? = unwrap(this).getNotes()

    /**
     * A builder for [ObjectiveFunctionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param function A function object that details optimization direction, metric, and
       * additional descriptions.
       */
      public fun function(function: IResolvable)

      /**
       * @param function A function object that details optimization direction, metric, and
       * additional descriptions.
       */
      public fun function(function: FunctionProperty)

      /**
       * @param function A function object that details optimization direction, metric, and
       * additional descriptions.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5ce5a3ec45d5e266f660bce55fe5e43488c3862ffcdc53937a48a8a3e4e4e58d")
      public fun function(function: FunctionProperty.Builder.() -> Unit)

      /**
       * @param notes Notes about the object function, including other considerations for possible
       * objective functions.
       */
      public fun notes(notes: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnModelCard.ObjectiveFunctionProperty.Builder =
          software.amazon.awscdk.services.sagemaker.CfnModelCard.ObjectiveFunctionProperty.builder()

      /**
       * @param function A function object that details optimization direction, metric, and
       * additional descriptions.
       */
      override fun function(function: IResolvable) {
        cdkBuilder.function(function.let(IResolvable::unwrap))
      }

      /**
       * @param function A function object that details optimization direction, metric, and
       * additional descriptions.
       */
      override fun function(function: FunctionProperty) {
        cdkBuilder.function(function.let(FunctionProperty::unwrap))
      }

      /**
       * @param function A function object that details optimization direction, metric, and
       * additional descriptions.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5ce5a3ec45d5e266f660bce55fe5e43488c3862ffcdc53937a48a8a3e4e4e58d")
      override fun function(function: FunctionProperty.Builder.() -> Unit): Unit =
          function(FunctionProperty(function))

      /**
       * @param notes Notes about the object function, including other considerations for possible
       * objective functions.
       */
      override fun notes(notes: String) {
        cdkBuilder.notes(notes)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnModelCard.ObjectiveFunctionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnModelCard.ObjectiveFunctionProperty,
    ) : CdkObject(cdkObject), ObjectiveFunctionProperty {
      /**
       * A function object that details optimization direction, metric, and additional descriptions.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelcard-objectivefunction.html#cfn-sagemaker-modelcard-objectivefunction-function)
       */
      override fun function(): Any? = unwrap(this).getFunction()

      /**
       * Notes about the object function, including other considerations for possible objective
       * functions.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelcard-objectivefunction.html#cfn-sagemaker-modelcard-objectivefunction-notes)
       */
      override fun notes(): String? = unwrap(this).getNotes()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ObjectiveFunctionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelCard.ObjectiveFunctionProperty):
          ObjectiveFunctionProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ObjectiveFunctionProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ObjectiveFunctionProperty):
          software.amazon.awscdk.services.sagemaker.CfnModelCard.ObjectiveFunctionProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnModelCard.ObjectiveFunctionProperty
    }
  }

  /**
   * The evaluation details of the model.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sagemaker.*;
   * Object value;
   * EvaluationDetailProperty evaluationDetailProperty = EvaluationDetailProperty.builder()
   * .name("name")
   * // the properties below are optional
   * .datasets(List.of("datasets"))
   * .evaluationJobArn("evaluationJobArn")
   * .evaluationObservation("evaluationObservation")
   * .metadata(Map.of(
   * "metadataKey", "metadata"))
   * .metricGroups(List.of(MetricGroupProperty.builder()
   * .metricData(List.of(MetricDataItemsProperty.builder()
   * .name("name")
   * .type("type")
   * .value(value)
   * // the properties below are optional
   * .notes("notes")
   * .xAxisName(List.of("xAxisName"))
   * .yAxisName(List.of("yAxisName"))
   * .build()))
   * .name("name")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelcard-evaluationdetail.html)
   */
  public interface EvaluationDetailProperty {
    /**
     * The location of the datasets used to evaluate the model.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelcard-evaluationdetail.html#cfn-sagemaker-modelcard-evaluationdetail-datasets)
     */
    public fun datasets(): List<String> = unwrap(this).getDatasets() ?: emptyList()

    /**
     * The Amazon Resource Name (ARN) of the evaluation job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelcard-evaluationdetail.html#cfn-sagemaker-modelcard-evaluationdetail-evaluationjobarn)
     */
    public fun evaluationJobArn(): String? = unwrap(this).getEvaluationJobArn()

    /**
     * Any observations made during the model evaluation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelcard-evaluationdetail.html#cfn-sagemaker-modelcard-evaluationdetail-evaluationobservation)
     */
    public fun evaluationObservation(): String? = unwrap(this).getEvaluationObservation()

    /**
     * Additional attributes associated with the evaluation results.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelcard-evaluationdetail.html#cfn-sagemaker-modelcard-evaluationdetail-metadata)
     */
    public fun metadata(): Any? = unwrap(this).getMetadata()

    /**
     * An evaluation Metric Group object.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelcard-evaluationdetail.html#cfn-sagemaker-modelcard-evaluationdetail-metricgroups)
     */
    public fun metricGroups(): Any? = unwrap(this).getMetricGroups()

    /**
     * The evaluation job name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelcard-evaluationdetail.html#cfn-sagemaker-modelcard-evaluationdetail-name)
     */
    public fun name(): String

    /**
     * A builder for [EvaluationDetailProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param datasets The location of the datasets used to evaluate the model.
       */
      public fun datasets(datasets: List<String>)

      /**
       * @param datasets The location of the datasets used to evaluate the model.
       */
      public fun datasets(vararg datasets: String)

      /**
       * @param evaluationJobArn The Amazon Resource Name (ARN) of the evaluation job.
       */
      public fun evaluationJobArn(evaluationJobArn: String)

      /**
       * @param evaluationObservation Any observations made during the model evaluation.
       */
      public fun evaluationObservation(evaluationObservation: String)

      /**
       * @param metadata Additional attributes associated with the evaluation results.
       */
      public fun metadata(metadata: IResolvable)

      /**
       * @param metadata Additional attributes associated with the evaluation results.
       */
      public fun metadata(metadata: Map<String, String>)

      /**
       * @param metricGroups An evaluation Metric Group object.
       */
      public fun metricGroups(metricGroups: IResolvable)

      /**
       * @param metricGroups An evaluation Metric Group object.
       */
      public fun metricGroups(metricGroups: List<Any>)

      /**
       * @param metricGroups An evaluation Metric Group object.
       */
      public fun metricGroups(vararg metricGroups: Any)

      /**
       * @param name The evaluation job name. 
       */
      public fun name(name: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnModelCard.EvaluationDetailProperty.Builder =
          software.amazon.awscdk.services.sagemaker.CfnModelCard.EvaluationDetailProperty.builder()

      /**
       * @param datasets The location of the datasets used to evaluate the model.
       */
      override fun datasets(datasets: List<String>) {
        cdkBuilder.datasets(datasets)
      }

      /**
       * @param datasets The location of the datasets used to evaluate the model.
       */
      override fun datasets(vararg datasets: String): Unit = datasets(datasets.toList())

      /**
       * @param evaluationJobArn The Amazon Resource Name (ARN) of the evaluation job.
       */
      override fun evaluationJobArn(evaluationJobArn: String) {
        cdkBuilder.evaluationJobArn(evaluationJobArn)
      }

      /**
       * @param evaluationObservation Any observations made during the model evaluation.
       */
      override fun evaluationObservation(evaluationObservation: String) {
        cdkBuilder.evaluationObservation(evaluationObservation)
      }

      /**
       * @param metadata Additional attributes associated with the evaluation results.
       */
      override fun metadata(metadata: IResolvable) {
        cdkBuilder.metadata(metadata.let(IResolvable::unwrap))
      }

      /**
       * @param metadata Additional attributes associated with the evaluation results.
       */
      override fun metadata(metadata: Map<String, String>) {
        cdkBuilder.metadata(metadata)
      }

      /**
       * @param metricGroups An evaluation Metric Group object.
       */
      override fun metricGroups(metricGroups: IResolvable) {
        cdkBuilder.metricGroups(metricGroups.let(IResolvable::unwrap))
      }

      /**
       * @param metricGroups An evaluation Metric Group object.
       */
      override fun metricGroups(metricGroups: List<Any>) {
        cdkBuilder.metricGroups(metricGroups)
      }

      /**
       * @param metricGroups An evaluation Metric Group object.
       */
      override fun metricGroups(vararg metricGroups: Any): Unit =
          metricGroups(metricGroups.toList())

      /**
       * @param name The evaluation job name. 
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnModelCard.EvaluationDetailProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnModelCard.EvaluationDetailProperty,
    ) : CdkObject(cdkObject), EvaluationDetailProperty {
      /**
       * The location of the datasets used to evaluate the model.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelcard-evaluationdetail.html#cfn-sagemaker-modelcard-evaluationdetail-datasets)
       */
      override fun datasets(): List<String> = unwrap(this).getDatasets() ?: emptyList()

      /**
       * The Amazon Resource Name (ARN) of the evaluation job.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelcard-evaluationdetail.html#cfn-sagemaker-modelcard-evaluationdetail-evaluationjobarn)
       */
      override fun evaluationJobArn(): String? = unwrap(this).getEvaluationJobArn()

      /**
       * Any observations made during the model evaluation.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelcard-evaluationdetail.html#cfn-sagemaker-modelcard-evaluationdetail-evaluationobservation)
       */
      override fun evaluationObservation(): String? = unwrap(this).getEvaluationObservation()

      /**
       * Additional attributes associated with the evaluation results.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelcard-evaluationdetail.html#cfn-sagemaker-modelcard-evaluationdetail-metadata)
       */
      override fun metadata(): Any? = unwrap(this).getMetadata()

      /**
       * An evaluation Metric Group object.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelcard-evaluationdetail.html#cfn-sagemaker-modelcard-evaluationdetail-metricgroups)
       */
      override fun metricGroups(): Any? = unwrap(this).getMetricGroups()

      /**
       * The evaluation job name.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelcard-evaluationdetail.html#cfn-sagemaker-modelcard-evaluationdetail-name)
       */
      override fun name(): String = unwrap(this).getName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): EvaluationDetailProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelCard.EvaluationDetailProperty):
          EvaluationDetailProperty = CdkObjectWrappers.wrap(cdkObject) as? EvaluationDetailProperty
          ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: EvaluationDetailProperty):
          software.amazon.awscdk.services.sagemaker.CfnModelCard.EvaluationDetailProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnModelCard.EvaluationDetailProperty
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
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelcard-sourcealgorithm.html)
   */
  public interface SourceAlgorithmProperty {
    /**
     * The name of an algorithm that was used to create the model package.
     *
     * The algorithm must be either an algorithm resource in your SageMaker account or an algorithm
     * in AWS Marketplace that you are subscribed to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelcard-sourcealgorithm.html#cfn-sagemaker-modelcard-sourcealgorithm-algorithmname)
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelcard-sourcealgorithm.html#cfn-sagemaker-modelcard-sourcealgorithm-modeldataurl)
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
          software.amazon.awscdk.services.sagemaker.CfnModelCard.SourceAlgorithmProperty.Builder =
          software.amazon.awscdk.services.sagemaker.CfnModelCard.SourceAlgorithmProperty.builder()

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
          software.amazon.awscdk.services.sagemaker.CfnModelCard.SourceAlgorithmProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnModelCard.SourceAlgorithmProperty,
    ) : CdkObject(cdkObject), SourceAlgorithmProperty {
      /**
       * The name of an algorithm that was used to create the model package.
       *
       * The algorithm must be either an algorithm resource in your SageMaker account or an
       * algorithm in AWS Marketplace that you are subscribed to.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelcard-sourcealgorithm.html#cfn-sagemaker-modelcard-sourcealgorithm-algorithmname)
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
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelcard-sourcealgorithm.html#cfn-sagemaker-modelcard-sourcealgorithm-modeldataurl)
       */
      override fun modelDataUrl(): String? = unwrap(this).getModelDataUrl()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SourceAlgorithmProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelCard.SourceAlgorithmProperty):
          SourceAlgorithmProperty = CdkObjectWrappers.wrap(cdkObject) as? SourceAlgorithmProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: SourceAlgorithmProperty):
          software.amazon.awscdk.services.sagemaker.CfnModelCard.SourceAlgorithmProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnModelCard.SourceAlgorithmProperty
    }
  }

  /**
   * The overview of a training job.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sagemaker.*;
   * TrainingJobDetailsProperty trainingJobDetailsProperty = TrainingJobDetailsProperty.builder()
   * .hyperParameters(List.of(TrainingHyperParameterProperty.builder()
   * .name("name")
   * .value("value")
   * .build()))
   * .trainingArn("trainingArn")
   * .trainingDatasets(List.of("trainingDatasets"))
   * .trainingEnvironment(TrainingEnvironmentProperty.builder()
   * .containerImage(List.of("containerImage"))
   * .build())
   * .trainingMetrics(List.of(TrainingMetricProperty.builder()
   * .name("name")
   * .value(123)
   * // the properties below are optional
   * .notes("notes")
   * .build()))
   * .userProvidedHyperParameters(List.of(TrainingHyperParameterProperty.builder()
   * .name("name")
   * .value("value")
   * .build()))
   * .userProvidedTrainingMetrics(List.of(TrainingMetricProperty.builder()
   * .name("name")
   * .value(123)
   * // the properties below are optional
   * .notes("notes")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelcard-trainingjobdetails.html)
   */
  public interface TrainingJobDetailsProperty {
    /**
     * The hyper parameters used in the training job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelcard-trainingjobdetails.html#cfn-sagemaker-modelcard-trainingjobdetails-hyperparameters)
     */
    public fun hyperParameters(): Any? = unwrap(this).getHyperParameters()

    /**
     * The SageMaker training job Amazon Resource Name (ARN).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelcard-trainingjobdetails.html#cfn-sagemaker-modelcard-trainingjobdetails-trainingarn)
     */
    public fun trainingArn(): String? = unwrap(this).getTrainingArn()

    /**
     * The location of the datasets used to train the model.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelcard-trainingjobdetails.html#cfn-sagemaker-modelcard-trainingjobdetails-trainingdatasets)
     */
    public fun trainingDatasets(): List<String> = unwrap(this).getTrainingDatasets() ?: emptyList()

    /**
     * The SageMaker training job image URI.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelcard-trainingjobdetails.html#cfn-sagemaker-modelcard-trainingjobdetails-trainingenvironment)
     */
    public fun trainingEnvironment(): Any? = unwrap(this).getTrainingEnvironment()

    /**
     * The SageMaker training job results.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelcard-trainingjobdetails.html#cfn-sagemaker-modelcard-trainingjobdetails-trainingmetrics)
     */
    public fun trainingMetrics(): Any? = unwrap(this).getTrainingMetrics()

    /**
     * Additional hyper parameters that you've specified when training the model.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelcard-trainingjobdetails.html#cfn-sagemaker-modelcard-trainingjobdetails-userprovidedhyperparameters)
     */
    public fun userProvidedHyperParameters(): Any? = unwrap(this).getUserProvidedHyperParameters()

    /**
     * Custom training job results.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelcard-trainingjobdetails.html#cfn-sagemaker-modelcard-trainingjobdetails-userprovidedtrainingmetrics)
     */
    public fun userProvidedTrainingMetrics(): Any? = unwrap(this).getUserProvidedTrainingMetrics()

    /**
     * A builder for [TrainingJobDetailsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param hyperParameters The hyper parameters used in the training job.
       */
      public fun hyperParameters(hyperParameters: IResolvable)

      /**
       * @param hyperParameters The hyper parameters used in the training job.
       */
      public fun hyperParameters(hyperParameters: List<Any>)

      /**
       * @param hyperParameters The hyper parameters used in the training job.
       */
      public fun hyperParameters(vararg hyperParameters: Any)

      /**
       * @param trainingArn The SageMaker training job Amazon Resource Name (ARN).
       */
      public fun trainingArn(trainingArn: String)

      /**
       * @param trainingDatasets The location of the datasets used to train the model.
       */
      public fun trainingDatasets(trainingDatasets: List<String>)

      /**
       * @param trainingDatasets The location of the datasets used to train the model.
       */
      public fun trainingDatasets(vararg trainingDatasets: String)

      /**
       * @param trainingEnvironment The SageMaker training job image URI.
       */
      public fun trainingEnvironment(trainingEnvironment: IResolvable)

      /**
       * @param trainingEnvironment The SageMaker training job image URI.
       */
      public fun trainingEnvironment(trainingEnvironment: TrainingEnvironmentProperty)

      /**
       * @param trainingEnvironment The SageMaker training job image URI.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c17f90744d1767db88202028eb3e9048a087d33456aeee772f5cfbc1c25bc4eb")
      public
          fun trainingEnvironment(trainingEnvironment: TrainingEnvironmentProperty.Builder.() -> Unit)

      /**
       * @param trainingMetrics The SageMaker training job results.
       */
      public fun trainingMetrics(trainingMetrics: IResolvable)

      /**
       * @param trainingMetrics The SageMaker training job results.
       */
      public fun trainingMetrics(trainingMetrics: List<Any>)

      /**
       * @param trainingMetrics The SageMaker training job results.
       */
      public fun trainingMetrics(vararg trainingMetrics: Any)

      /**
       * @param userProvidedHyperParameters Additional hyper parameters that you've specified when
       * training the model.
       */
      public fun userProvidedHyperParameters(userProvidedHyperParameters: IResolvable)

      /**
       * @param userProvidedHyperParameters Additional hyper parameters that you've specified when
       * training the model.
       */
      public fun userProvidedHyperParameters(userProvidedHyperParameters: List<Any>)

      /**
       * @param userProvidedHyperParameters Additional hyper parameters that you've specified when
       * training the model.
       */
      public fun userProvidedHyperParameters(vararg userProvidedHyperParameters: Any)

      /**
       * @param userProvidedTrainingMetrics Custom training job results.
       */
      public fun userProvidedTrainingMetrics(userProvidedTrainingMetrics: IResolvable)

      /**
       * @param userProvidedTrainingMetrics Custom training job results.
       */
      public fun userProvidedTrainingMetrics(userProvidedTrainingMetrics: List<Any>)

      /**
       * @param userProvidedTrainingMetrics Custom training job results.
       */
      public fun userProvidedTrainingMetrics(vararg userProvidedTrainingMetrics: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnModelCard.TrainingJobDetailsProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnModelCard.TrainingJobDetailsProperty.builder()

      /**
       * @param hyperParameters The hyper parameters used in the training job.
       */
      override fun hyperParameters(hyperParameters: IResolvable) {
        cdkBuilder.hyperParameters(hyperParameters.let(IResolvable::unwrap))
      }

      /**
       * @param hyperParameters The hyper parameters used in the training job.
       */
      override fun hyperParameters(hyperParameters: List<Any>) {
        cdkBuilder.hyperParameters(hyperParameters)
      }

      /**
       * @param hyperParameters The hyper parameters used in the training job.
       */
      override fun hyperParameters(vararg hyperParameters: Any): Unit =
          hyperParameters(hyperParameters.toList())

      /**
       * @param trainingArn The SageMaker training job Amazon Resource Name (ARN).
       */
      override fun trainingArn(trainingArn: String) {
        cdkBuilder.trainingArn(trainingArn)
      }

      /**
       * @param trainingDatasets The location of the datasets used to train the model.
       */
      override fun trainingDatasets(trainingDatasets: List<String>) {
        cdkBuilder.trainingDatasets(trainingDatasets)
      }

      /**
       * @param trainingDatasets The location of the datasets used to train the model.
       */
      override fun trainingDatasets(vararg trainingDatasets: String): Unit =
          trainingDatasets(trainingDatasets.toList())

      /**
       * @param trainingEnvironment The SageMaker training job image URI.
       */
      override fun trainingEnvironment(trainingEnvironment: IResolvable) {
        cdkBuilder.trainingEnvironment(trainingEnvironment.let(IResolvable::unwrap))
      }

      /**
       * @param trainingEnvironment The SageMaker training job image URI.
       */
      override fun trainingEnvironment(trainingEnvironment: TrainingEnvironmentProperty) {
        cdkBuilder.trainingEnvironment(trainingEnvironment.let(TrainingEnvironmentProperty::unwrap))
      }

      /**
       * @param trainingEnvironment The SageMaker training job image URI.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c17f90744d1767db88202028eb3e9048a087d33456aeee772f5cfbc1c25bc4eb")
      override
          fun trainingEnvironment(trainingEnvironment: TrainingEnvironmentProperty.Builder.() -> Unit):
          Unit = trainingEnvironment(TrainingEnvironmentProperty(trainingEnvironment))

      /**
       * @param trainingMetrics The SageMaker training job results.
       */
      override fun trainingMetrics(trainingMetrics: IResolvable) {
        cdkBuilder.trainingMetrics(trainingMetrics.let(IResolvable::unwrap))
      }

      /**
       * @param trainingMetrics The SageMaker training job results.
       */
      override fun trainingMetrics(trainingMetrics: List<Any>) {
        cdkBuilder.trainingMetrics(trainingMetrics)
      }

      /**
       * @param trainingMetrics The SageMaker training job results.
       */
      override fun trainingMetrics(vararg trainingMetrics: Any): Unit =
          trainingMetrics(trainingMetrics.toList())

      /**
       * @param userProvidedHyperParameters Additional hyper parameters that you've specified when
       * training the model.
       */
      override fun userProvidedHyperParameters(userProvidedHyperParameters: IResolvable) {
        cdkBuilder.userProvidedHyperParameters(userProvidedHyperParameters.let(IResolvable::unwrap))
      }

      /**
       * @param userProvidedHyperParameters Additional hyper parameters that you've specified when
       * training the model.
       */
      override fun userProvidedHyperParameters(userProvidedHyperParameters: List<Any>) {
        cdkBuilder.userProvidedHyperParameters(userProvidedHyperParameters)
      }

      /**
       * @param userProvidedHyperParameters Additional hyper parameters that you've specified when
       * training the model.
       */
      override fun userProvidedHyperParameters(vararg userProvidedHyperParameters: Any): Unit =
          userProvidedHyperParameters(userProvidedHyperParameters.toList())

      /**
       * @param userProvidedTrainingMetrics Custom training job results.
       */
      override fun userProvidedTrainingMetrics(userProvidedTrainingMetrics: IResolvable) {
        cdkBuilder.userProvidedTrainingMetrics(userProvidedTrainingMetrics.let(IResolvable::unwrap))
      }

      /**
       * @param userProvidedTrainingMetrics Custom training job results.
       */
      override fun userProvidedTrainingMetrics(userProvidedTrainingMetrics: List<Any>) {
        cdkBuilder.userProvidedTrainingMetrics(userProvidedTrainingMetrics)
      }

      /**
       * @param userProvidedTrainingMetrics Custom training job results.
       */
      override fun userProvidedTrainingMetrics(vararg userProvidedTrainingMetrics: Any): Unit =
          userProvidedTrainingMetrics(userProvidedTrainingMetrics.toList())

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnModelCard.TrainingJobDetailsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnModelCard.TrainingJobDetailsProperty,
    ) : CdkObject(cdkObject), TrainingJobDetailsProperty {
      /**
       * The hyper parameters used in the training job.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelcard-trainingjobdetails.html#cfn-sagemaker-modelcard-trainingjobdetails-hyperparameters)
       */
      override fun hyperParameters(): Any? = unwrap(this).getHyperParameters()

      /**
       * The SageMaker training job Amazon Resource Name (ARN).
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelcard-trainingjobdetails.html#cfn-sagemaker-modelcard-trainingjobdetails-trainingarn)
       */
      override fun trainingArn(): String? = unwrap(this).getTrainingArn()

      /**
       * The location of the datasets used to train the model.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelcard-trainingjobdetails.html#cfn-sagemaker-modelcard-trainingjobdetails-trainingdatasets)
       */
      override fun trainingDatasets(): List<String> = unwrap(this).getTrainingDatasets() ?:
          emptyList()

      /**
       * The SageMaker training job image URI.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelcard-trainingjobdetails.html#cfn-sagemaker-modelcard-trainingjobdetails-trainingenvironment)
       */
      override fun trainingEnvironment(): Any? = unwrap(this).getTrainingEnvironment()

      /**
       * The SageMaker training job results.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelcard-trainingjobdetails.html#cfn-sagemaker-modelcard-trainingjobdetails-trainingmetrics)
       */
      override fun trainingMetrics(): Any? = unwrap(this).getTrainingMetrics()

      /**
       * Additional hyper parameters that you've specified when training the model.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelcard-trainingjobdetails.html#cfn-sagemaker-modelcard-trainingjobdetails-userprovidedhyperparameters)
       */
      override fun userProvidedHyperParameters(): Any? =
          unwrap(this).getUserProvidedHyperParameters()

      /**
       * Custom training job results.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelcard-trainingjobdetails.html#cfn-sagemaker-modelcard-trainingjobdetails-userprovidedtrainingmetrics)
       */
      override fun userProvidedTrainingMetrics(): Any? =
          unwrap(this).getUserProvidedTrainingMetrics()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): TrainingJobDetailsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelCard.TrainingJobDetailsProperty):
          TrainingJobDetailsProperty = CdkObjectWrappers.wrap(cdkObject) as?
          TrainingJobDetailsProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: TrainingJobDetailsProperty):
          software.amazon.awscdk.services.sagemaker.CfnModelCard.TrainingJobDetailsProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnModelCard.TrainingJobDetailsProperty
    }
  }

  /**
   * Information about how the model supports business goals.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sagemaker.*;
   * BusinessDetailsProperty businessDetailsProperty = BusinessDetailsProperty.builder()
   * .businessProblem("businessProblem")
   * .businessStakeholders("businessStakeholders")
   * .lineOfBusiness("lineOfBusiness")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelcard-businessdetails.html)
   */
  public interface BusinessDetailsProperty {
    /**
     * The specific business problem that the model is trying to solve.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelcard-businessdetails.html#cfn-sagemaker-modelcard-businessdetails-businessproblem)
     */
    public fun businessProblem(): String? = unwrap(this).getBusinessProblem()

    /**
     * The relevant stakeholders for the model.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelcard-businessdetails.html#cfn-sagemaker-modelcard-businessdetails-businessstakeholders)
     */
    public fun businessStakeholders(): String? = unwrap(this).getBusinessStakeholders()

    /**
     * The broader business need that the model is serving.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelcard-businessdetails.html#cfn-sagemaker-modelcard-businessdetails-lineofbusiness)
     */
    public fun lineOfBusiness(): String? = unwrap(this).getLineOfBusiness()

    /**
     * A builder for [BusinessDetailsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param businessProblem The specific business problem that the model is trying to solve.
       */
      public fun businessProblem(businessProblem: String)

      /**
       * @param businessStakeholders The relevant stakeholders for the model.
       */
      public fun businessStakeholders(businessStakeholders: String)

      /**
       * @param lineOfBusiness The broader business need that the model is serving.
       */
      public fun lineOfBusiness(lineOfBusiness: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnModelCard.BusinessDetailsProperty.Builder =
          software.amazon.awscdk.services.sagemaker.CfnModelCard.BusinessDetailsProperty.builder()

      /**
       * @param businessProblem The specific business problem that the model is trying to solve.
       */
      override fun businessProblem(businessProblem: String) {
        cdkBuilder.businessProblem(businessProblem)
      }

      /**
       * @param businessStakeholders The relevant stakeholders for the model.
       */
      override fun businessStakeholders(businessStakeholders: String) {
        cdkBuilder.businessStakeholders(businessStakeholders)
      }

      /**
       * @param lineOfBusiness The broader business need that the model is serving.
       */
      override fun lineOfBusiness(lineOfBusiness: String) {
        cdkBuilder.lineOfBusiness(lineOfBusiness)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnModelCard.BusinessDetailsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnModelCard.BusinessDetailsProperty,
    ) : CdkObject(cdkObject), BusinessDetailsProperty {
      /**
       * The specific business problem that the model is trying to solve.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelcard-businessdetails.html#cfn-sagemaker-modelcard-businessdetails-businessproblem)
       */
      override fun businessProblem(): String? = unwrap(this).getBusinessProblem()

      /**
       * The relevant stakeholders for the model.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelcard-businessdetails.html#cfn-sagemaker-modelcard-businessdetails-businessstakeholders)
       */
      override fun businessStakeholders(): String? = unwrap(this).getBusinessStakeholders()

      /**
       * The broader business need that the model is serving.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelcard-businessdetails.html#cfn-sagemaker-modelcard-businessdetails-lineofbusiness)
       */
      override fun lineOfBusiness(): String? = unwrap(this).getLineOfBusiness()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): BusinessDetailsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelCard.BusinessDetailsProperty):
          BusinessDetailsProperty = CdkObjectWrappers.wrap(cdkObject) as? BusinessDetailsProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: BusinessDetailsProperty):
          software.amazon.awscdk.services.sagemaker.CfnModelCard.BusinessDetailsProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnModelCard.BusinessDetailsProperty
    }
  }

  /**
   * The intended uses of a model.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sagemaker.*;
   * IntendedUsesProperty intendedUsesProperty = IntendedUsesProperty.builder()
   * .explanationsForRiskRating("explanationsForRiskRating")
   * .factorsAffectingModelEfficiency("factorsAffectingModelEfficiency")
   * .intendedUses("intendedUses")
   * .purposeOfModel("purposeOfModel")
   * .riskRating("riskRating")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelcard-intendeduses.html)
   */
  public interface IntendedUsesProperty {
    /**
     * An explanation of why your organization categorizes the model with its risk rating.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelcard-intendeduses.html#cfn-sagemaker-modelcard-intendeduses-explanationsforriskrating)
     */
    public fun explanationsForRiskRating(): String? = unwrap(this).getExplanationsForRiskRating()

    /**
     * Factors affecting model efficacy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelcard-intendeduses.html#cfn-sagemaker-modelcard-intendeduses-factorsaffectingmodelefficiency)
     */
    public fun factorsAffectingModelEfficiency(): String? =
        unwrap(this).getFactorsAffectingModelEfficiency()

    /**
     * The intended use cases for the model.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelcard-intendeduses.html#cfn-sagemaker-modelcard-intendeduses-intendeduses)
     */
    public fun intendedUses(): String? = unwrap(this).getIntendedUses()

    /**
     * The general purpose of the model.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelcard-intendeduses.html#cfn-sagemaker-modelcard-intendeduses-purposeofmodel)
     */
    public fun purposeOfModel(): String? = unwrap(this).getPurposeOfModel()

    /**
     * Your organization's risk rating. You can specify one the following values as the risk
     * rating:.
     *
     * * High
     * * Medium
     * * Low
     * * Unknown
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelcard-intendeduses.html#cfn-sagemaker-modelcard-intendeduses-riskrating)
     */
    public fun riskRating(): String? = unwrap(this).getRiskRating()

    /**
     * A builder for [IntendedUsesProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param explanationsForRiskRating An explanation of why your organization categorizes the
       * model with its risk rating.
       */
      public fun explanationsForRiskRating(explanationsForRiskRating: String)

      /**
       * @param factorsAffectingModelEfficiency Factors affecting model efficacy.
       */
      public fun factorsAffectingModelEfficiency(factorsAffectingModelEfficiency: String)

      /**
       * @param intendedUses The intended use cases for the model.
       */
      public fun intendedUses(intendedUses: String)

      /**
       * @param purposeOfModel The general purpose of the model.
       */
      public fun purposeOfModel(purposeOfModel: String)

      /**
       * @param riskRating Your organization's risk rating. You can specify one the following values
       * as the risk rating:.
       * * High
       * * Medium
       * * Low
       * * Unknown
       */
      public fun riskRating(riskRating: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnModelCard.IntendedUsesProperty.Builder =
          software.amazon.awscdk.services.sagemaker.CfnModelCard.IntendedUsesProperty.builder()

      /**
       * @param explanationsForRiskRating An explanation of why your organization categorizes the
       * model with its risk rating.
       */
      override fun explanationsForRiskRating(explanationsForRiskRating: String) {
        cdkBuilder.explanationsForRiskRating(explanationsForRiskRating)
      }

      /**
       * @param factorsAffectingModelEfficiency Factors affecting model efficacy.
       */
      override fun factorsAffectingModelEfficiency(factorsAffectingModelEfficiency: String) {
        cdkBuilder.factorsAffectingModelEfficiency(factorsAffectingModelEfficiency)
      }

      /**
       * @param intendedUses The intended use cases for the model.
       */
      override fun intendedUses(intendedUses: String) {
        cdkBuilder.intendedUses(intendedUses)
      }

      /**
       * @param purposeOfModel The general purpose of the model.
       */
      override fun purposeOfModel(purposeOfModel: String) {
        cdkBuilder.purposeOfModel(purposeOfModel)
      }

      /**
       * @param riskRating Your organization's risk rating. You can specify one the following values
       * as the risk rating:.
       * * High
       * * Medium
       * * Low
       * * Unknown
       */
      override fun riskRating(riskRating: String) {
        cdkBuilder.riskRating(riskRating)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnModelCard.IntendedUsesProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnModelCard.IntendedUsesProperty,
    ) : CdkObject(cdkObject), IntendedUsesProperty {
      /**
       * An explanation of why your organization categorizes the model with its risk rating.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelcard-intendeduses.html#cfn-sagemaker-modelcard-intendeduses-explanationsforriskrating)
       */
      override fun explanationsForRiskRating(): String? =
          unwrap(this).getExplanationsForRiskRating()

      /**
       * Factors affecting model efficacy.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelcard-intendeduses.html#cfn-sagemaker-modelcard-intendeduses-factorsaffectingmodelefficiency)
       */
      override fun factorsAffectingModelEfficiency(): String? =
          unwrap(this).getFactorsAffectingModelEfficiency()

      /**
       * The intended use cases for the model.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelcard-intendeduses.html#cfn-sagemaker-modelcard-intendeduses-intendeduses)
       */
      override fun intendedUses(): String? = unwrap(this).getIntendedUses()

      /**
       * The general purpose of the model.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelcard-intendeduses.html#cfn-sagemaker-modelcard-intendeduses-purposeofmodel)
       */
      override fun purposeOfModel(): String? = unwrap(this).getPurposeOfModel()

      /**
       * Your organization's risk rating. You can specify one the following values as the risk
       * rating:.
       *
       * * High
       * * Medium
       * * Low
       * * Unknown
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelcard-intendeduses.html#cfn-sagemaker-modelcard-intendeduses-riskrating)
       */
      override fun riskRating(): String? = unwrap(this).getRiskRating()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): IntendedUsesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelCard.IntendedUsesProperty):
          IntendedUsesProperty = CdkObjectWrappers.wrap(cdkObject) as? IntendedUsesProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: IntendedUsesProperty):
          software.amazon.awscdk.services.sagemaker.CfnModelCard.IntendedUsesProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnModelCard.IntendedUsesProperty
    }
  }

  /**
   * An overview about the model.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sagemaker.*;
   * ModelOverviewProperty modelOverviewProperty = ModelOverviewProperty.builder()
   * .algorithmType("algorithmType")
   * .inferenceEnvironment(InferenceEnvironmentProperty.builder()
   * .containerImage(List.of("containerImage"))
   * .build())
   * .modelArtifact(List.of("modelArtifact"))
   * .modelCreator("modelCreator")
   * .modelDescription("modelDescription")
   * .modelId("modelId")
   * .modelName("modelName")
   * .modelOwner("modelOwner")
   * .modelVersion(123)
   * .problemType("problemType")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelcard-modeloverview.html)
   */
  public interface ModelOverviewProperty {
    /**
     * The algorithm used to solve the problem.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelcard-modeloverview.html#cfn-sagemaker-modelcard-modeloverview-algorithmtype)
     */
    public fun algorithmType(): String? = unwrap(this).getAlgorithmType()

    /**
     * An overview about model inference.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelcard-modeloverview.html#cfn-sagemaker-modelcard-modeloverview-inferenceenvironment)
     */
    public fun inferenceEnvironment(): Any? = unwrap(this).getInferenceEnvironment()

    /**
     * The location of the model artifact.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelcard-modeloverview.html#cfn-sagemaker-modelcard-modeloverview-modelartifact)
     */
    public fun modelArtifact(): List<String> = unwrap(this).getModelArtifact() ?: emptyList()

    /**
     * The creator of the model.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelcard-modeloverview.html#cfn-sagemaker-modelcard-modeloverview-modelcreator)
     */
    public fun modelCreator(): String? = unwrap(this).getModelCreator()

    /**
     * A description of the model.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelcard-modeloverview.html#cfn-sagemaker-modelcard-modeloverview-modeldescription)
     */
    public fun modelDescription(): String? = unwrap(this).getModelDescription()

    /**
     * The SageMaker Model ARN or non- SageMaker Model ID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelcard-modeloverview.html#cfn-sagemaker-modelcard-modeloverview-modelid)
     */
    public fun modelId(): String? = unwrap(this).getModelId()

    /**
     * The name of the model.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelcard-modeloverview.html#cfn-sagemaker-modelcard-modeloverview-modelname)
     */
    public fun modelName(): String? = unwrap(this).getModelName()

    /**
     * The owner of the model.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelcard-modeloverview.html#cfn-sagemaker-modelcard-modeloverview-modelowner)
     */
    public fun modelOwner(): String? = unwrap(this).getModelOwner()

    /**
     * The version of the model.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelcard-modeloverview.html#cfn-sagemaker-modelcard-modeloverview-modelversion)
     */
    public fun modelVersion(): Number? = unwrap(this).getModelVersion()

    /**
     * The problem being solved with the model.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelcard-modeloverview.html#cfn-sagemaker-modelcard-modeloverview-problemtype)
     */
    public fun problemType(): String? = unwrap(this).getProblemType()

    /**
     * A builder for [ModelOverviewProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param algorithmType The algorithm used to solve the problem.
       */
      public fun algorithmType(algorithmType: String)

      /**
       * @param inferenceEnvironment An overview about model inference.
       */
      public fun inferenceEnvironment(inferenceEnvironment: IResolvable)

      /**
       * @param inferenceEnvironment An overview about model inference.
       */
      public fun inferenceEnvironment(inferenceEnvironment: InferenceEnvironmentProperty)

      /**
       * @param inferenceEnvironment An overview about model inference.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9290c85bedd92594ccae6eefb62c1947d8b82dac5a90a3cdc38b3dfed69cc11f")
      public
          fun inferenceEnvironment(inferenceEnvironment: InferenceEnvironmentProperty.Builder.() -> Unit)

      /**
       * @param modelArtifact The location of the model artifact.
       */
      public fun modelArtifact(modelArtifact: List<String>)

      /**
       * @param modelArtifact The location of the model artifact.
       */
      public fun modelArtifact(vararg modelArtifact: String)

      /**
       * @param modelCreator The creator of the model.
       */
      public fun modelCreator(modelCreator: String)

      /**
       * @param modelDescription A description of the model.
       */
      public fun modelDescription(modelDescription: String)

      /**
       * @param modelId The SageMaker Model ARN or non- SageMaker Model ID.
       */
      public fun modelId(modelId: String)

      /**
       * @param modelName The name of the model.
       */
      public fun modelName(modelName: String)

      /**
       * @param modelOwner The owner of the model.
       */
      public fun modelOwner(modelOwner: String)

      /**
       * @param modelVersion The version of the model.
       */
      public fun modelVersion(modelVersion: Number)

      /**
       * @param problemType The problem being solved with the model.
       */
      public fun problemType(problemType: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnModelCard.ModelOverviewProperty.Builder =
          software.amazon.awscdk.services.sagemaker.CfnModelCard.ModelOverviewProperty.builder()

      /**
       * @param algorithmType The algorithm used to solve the problem.
       */
      override fun algorithmType(algorithmType: String) {
        cdkBuilder.algorithmType(algorithmType)
      }

      /**
       * @param inferenceEnvironment An overview about model inference.
       */
      override fun inferenceEnvironment(inferenceEnvironment: IResolvable) {
        cdkBuilder.inferenceEnvironment(inferenceEnvironment.let(IResolvable::unwrap))
      }

      /**
       * @param inferenceEnvironment An overview about model inference.
       */
      override fun inferenceEnvironment(inferenceEnvironment: InferenceEnvironmentProperty) {
        cdkBuilder.inferenceEnvironment(inferenceEnvironment.let(InferenceEnvironmentProperty::unwrap))
      }

      /**
       * @param inferenceEnvironment An overview about model inference.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9290c85bedd92594ccae6eefb62c1947d8b82dac5a90a3cdc38b3dfed69cc11f")
      override
          fun inferenceEnvironment(inferenceEnvironment: InferenceEnvironmentProperty.Builder.() -> Unit):
          Unit = inferenceEnvironment(InferenceEnvironmentProperty(inferenceEnvironment))

      /**
       * @param modelArtifact The location of the model artifact.
       */
      override fun modelArtifact(modelArtifact: List<String>) {
        cdkBuilder.modelArtifact(modelArtifact)
      }

      /**
       * @param modelArtifact The location of the model artifact.
       */
      override fun modelArtifact(vararg modelArtifact: String): Unit =
          modelArtifact(modelArtifact.toList())

      /**
       * @param modelCreator The creator of the model.
       */
      override fun modelCreator(modelCreator: String) {
        cdkBuilder.modelCreator(modelCreator)
      }

      /**
       * @param modelDescription A description of the model.
       */
      override fun modelDescription(modelDescription: String) {
        cdkBuilder.modelDescription(modelDescription)
      }

      /**
       * @param modelId The SageMaker Model ARN or non- SageMaker Model ID.
       */
      override fun modelId(modelId: String) {
        cdkBuilder.modelId(modelId)
      }

      /**
       * @param modelName The name of the model.
       */
      override fun modelName(modelName: String) {
        cdkBuilder.modelName(modelName)
      }

      /**
       * @param modelOwner The owner of the model.
       */
      override fun modelOwner(modelOwner: String) {
        cdkBuilder.modelOwner(modelOwner)
      }

      /**
       * @param modelVersion The version of the model.
       */
      override fun modelVersion(modelVersion: Number) {
        cdkBuilder.modelVersion(modelVersion)
      }

      /**
       * @param problemType The problem being solved with the model.
       */
      override fun problemType(problemType: String) {
        cdkBuilder.problemType(problemType)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnModelCard.ModelOverviewProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnModelCard.ModelOverviewProperty,
    ) : CdkObject(cdkObject), ModelOverviewProperty {
      /**
       * The algorithm used to solve the problem.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelcard-modeloverview.html#cfn-sagemaker-modelcard-modeloverview-algorithmtype)
       */
      override fun algorithmType(): String? = unwrap(this).getAlgorithmType()

      /**
       * An overview about model inference.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelcard-modeloverview.html#cfn-sagemaker-modelcard-modeloverview-inferenceenvironment)
       */
      override fun inferenceEnvironment(): Any? = unwrap(this).getInferenceEnvironment()

      /**
       * The location of the model artifact.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelcard-modeloverview.html#cfn-sagemaker-modelcard-modeloverview-modelartifact)
       */
      override fun modelArtifact(): List<String> = unwrap(this).getModelArtifact() ?: emptyList()

      /**
       * The creator of the model.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelcard-modeloverview.html#cfn-sagemaker-modelcard-modeloverview-modelcreator)
       */
      override fun modelCreator(): String? = unwrap(this).getModelCreator()

      /**
       * A description of the model.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelcard-modeloverview.html#cfn-sagemaker-modelcard-modeloverview-modeldescription)
       */
      override fun modelDescription(): String? = unwrap(this).getModelDescription()

      /**
       * The SageMaker Model ARN or non- SageMaker Model ID.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelcard-modeloverview.html#cfn-sagemaker-modelcard-modeloverview-modelid)
       */
      override fun modelId(): String? = unwrap(this).getModelId()

      /**
       * The name of the model.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelcard-modeloverview.html#cfn-sagemaker-modelcard-modeloverview-modelname)
       */
      override fun modelName(): String? = unwrap(this).getModelName()

      /**
       * The owner of the model.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelcard-modeloverview.html#cfn-sagemaker-modelcard-modeloverview-modelowner)
       */
      override fun modelOwner(): String? = unwrap(this).getModelOwner()

      /**
       * The version of the model.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelcard-modeloverview.html#cfn-sagemaker-modelcard-modeloverview-modelversion)
       */
      override fun modelVersion(): Number? = unwrap(this).getModelVersion()

      /**
       * The problem being solved with the model.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelcard-modeloverview.html#cfn-sagemaker-modelcard-modeloverview-problemtype)
       */
      override fun problemType(): String? = unwrap(this).getProblemType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ModelOverviewProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelCard.ModelOverviewProperty):
          ModelOverviewProperty = CdkObjectWrappers.wrap(cdkObject) as? ModelOverviewProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: ModelOverviewProperty):
          software.amazon.awscdk.services.sagemaker.CfnModelCard.ModelOverviewProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnModelCard.ModelOverviewProperty
    }
  }

  /**
   * Metadata information related to model package version.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sagemaker.*;
   * ModelPackageDetailsProperty modelPackageDetailsProperty = ModelPackageDetailsProperty.builder()
   * .approvalDescription("approvalDescription")
   * .createdBy(ModelPackageCreatorProperty.builder()
   * .userProfileName("userProfileName")
   * .build())
   * .domain("domain")
   * .inferenceSpecification(InferenceSpecificationProperty.builder()
   * .containers(List.of(ContainerProperty.builder()
   * .image("image")
   * // the properties below are optional
   * .modelDataUrl("modelDataUrl")
   * .nearestModelName("nearestModelName")
   * .build()))
   * .build())
   * .modelApprovalStatus("modelApprovalStatus")
   * .modelPackageArn("modelPackageArn")
   * .modelPackageDescription("modelPackageDescription")
   * .modelPackageGroupName("modelPackageGroupName")
   * .modelPackageName("modelPackageName")
   * .modelPackageStatus("modelPackageStatus")
   * .modelPackageVersion(123)
   * .sourceAlgorithms(List.of(SourceAlgorithmProperty.builder()
   * .algorithmName("algorithmName")
   * // the properties below are optional
   * .modelDataUrl("modelDataUrl")
   * .build()))
   * .task("task")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelcard-modelpackagedetails.html)
   */
  public interface ModelPackageDetailsProperty {
    /**
     * A description provided for the model approval.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelcard-modelpackagedetails.html#cfn-sagemaker-modelcard-modelpackagedetails-approvaldescription)
     */
    public fun approvalDescription(): String? = unwrap(this).getApprovalDescription()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelcard-modelpackagedetails.html#cfn-sagemaker-modelcard-modelpackagedetails-createdby)
     */
    public fun createdBy(): Any? = unwrap(this).getCreatedBy()

    /**
     * The machine learning domain of the model package you specified.
     *
     * Common machine learning domains include computer vision and natural language processing.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelcard-modelpackagedetails.html#cfn-sagemaker-modelcard-modelpackagedetails-domain)
     */
    public fun domain(): String? = unwrap(this).getDomain()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelcard-modelpackagedetails.html#cfn-sagemaker-modelcard-modelpackagedetails-inferencespecification)
     */
    public fun inferenceSpecification(): Any? = unwrap(this).getInferenceSpecification()

    /**
     * Current approval status of model package.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelcard-modelpackagedetails.html#cfn-sagemaker-modelcard-modelpackagedetails-modelapprovalstatus)
     */
    public fun modelApprovalStatus(): String? = unwrap(this).getModelApprovalStatus()

    /**
     * The Amazon Resource Name (ARN) of the model package.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelcard-modelpackagedetails.html#cfn-sagemaker-modelcard-modelpackagedetails-modelpackagearn)
     */
    public fun modelPackageArn(): String? = unwrap(this).getModelPackageArn()

    /**
     * A brief summary of the model package.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelcard-modelpackagedetails.html#cfn-sagemaker-modelcard-modelpackagedetails-modelpackagedescription)
     */
    public fun modelPackageDescription(): String? = unwrap(this).getModelPackageDescription()

    /**
     * If the model is a versioned model, the name of the model group that the versioned model
     * belongs to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelcard-modelpackagedetails.html#cfn-sagemaker-modelcard-modelpackagedetails-modelpackagegroupname)
     */
    public fun modelPackageGroupName(): String? = unwrap(this).getModelPackageGroupName()

    /**
     * Name of the model package.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelcard-modelpackagedetails.html#cfn-sagemaker-modelcard-modelpackagedetails-modelpackagename)
     */
    public fun modelPackageName(): String? = unwrap(this).getModelPackageName()

    /**
     * Current status of model package.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelcard-modelpackagedetails.html#cfn-sagemaker-modelcard-modelpackagedetails-modelpackagestatus)
     */
    public fun modelPackageStatus(): String? = unwrap(this).getModelPackageStatus()

    /**
     * Version of the model package.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelcard-modelpackagedetails.html#cfn-sagemaker-modelcard-modelpackagedetails-modelpackageversion)
     */
    public fun modelPackageVersion(): Number? = unwrap(this).getModelPackageVersion()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelcard-modelpackagedetails.html#cfn-sagemaker-modelcard-modelpackagedetails-sourcealgorithms)
     */
    public fun sourceAlgorithms(): Any? = unwrap(this).getSourceAlgorithms()

    /**
     * The machine learning task you specified that your model package accomplishes.
     *
     * Common machine learning tasks include object detection and image classification.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelcard-modelpackagedetails.html#cfn-sagemaker-modelcard-modelpackagedetails-task)
     */
    public fun task(): String? = unwrap(this).getTask()

    /**
     * A builder for [ModelPackageDetailsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param approvalDescription A description provided for the model approval.
       */
      public fun approvalDescription(approvalDescription: String)

      /**
       * @param createdBy the value to be set.
       */
      public fun createdBy(createdBy: IResolvable)

      /**
       * @param createdBy the value to be set.
       */
      public fun createdBy(createdBy: ModelPackageCreatorProperty)

      /**
       * @param createdBy the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("688b0e1d14b76671de6e97c373d6efaa2154d0d50c2a297358cf11e88e777327")
      public fun createdBy(createdBy: ModelPackageCreatorProperty.Builder.() -> Unit)

      /**
       * @param domain The machine learning domain of the model package you specified.
       * Common machine learning domains include computer vision and natural language processing.
       */
      public fun domain(domain: String)

      /**
       * @param inferenceSpecification the value to be set.
       */
      public fun inferenceSpecification(inferenceSpecification: IResolvable)

      /**
       * @param inferenceSpecification the value to be set.
       */
      public fun inferenceSpecification(inferenceSpecification: InferenceSpecificationProperty)

      /**
       * @param inferenceSpecification the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("766b96c35e394b8b538b32f39f247897d38afb112919d78de6ce7eadc40c0884")
      public
          fun inferenceSpecification(inferenceSpecification: InferenceSpecificationProperty.Builder.() -> Unit)

      /**
       * @param modelApprovalStatus Current approval status of model package.
       */
      public fun modelApprovalStatus(modelApprovalStatus: String)

      /**
       * @param modelPackageArn The Amazon Resource Name (ARN) of the model package.
       */
      public fun modelPackageArn(modelPackageArn: String)

      /**
       * @param modelPackageDescription A brief summary of the model package.
       */
      public fun modelPackageDescription(modelPackageDescription: String)

      /**
       * @param modelPackageGroupName If the model is a versioned model, the name of the model group
       * that the versioned model belongs to.
       */
      public fun modelPackageGroupName(modelPackageGroupName: String)

      /**
       * @param modelPackageName Name of the model package.
       */
      public fun modelPackageName(modelPackageName: String)

      /**
       * @param modelPackageStatus Current status of model package.
       */
      public fun modelPackageStatus(modelPackageStatus: String)

      /**
       * @param modelPackageVersion Version of the model package.
       */
      public fun modelPackageVersion(modelPackageVersion: Number)

      /**
       * @param sourceAlgorithms the value to be set.
       */
      public fun sourceAlgorithms(sourceAlgorithms: IResolvable)

      /**
       * @param sourceAlgorithms the value to be set.
       */
      public fun sourceAlgorithms(sourceAlgorithms: List<Any>)

      /**
       * @param sourceAlgorithms the value to be set.
       */
      public fun sourceAlgorithms(vararg sourceAlgorithms: Any)

      /**
       * @param task The machine learning task you specified that your model package accomplishes.
       * Common machine learning tasks include object detection and image classification.
       */
      public fun task(task: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnModelCard.ModelPackageDetailsProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnModelCard.ModelPackageDetailsProperty.builder()

      /**
       * @param approvalDescription A description provided for the model approval.
       */
      override fun approvalDescription(approvalDescription: String) {
        cdkBuilder.approvalDescription(approvalDescription)
      }

      /**
       * @param createdBy the value to be set.
       */
      override fun createdBy(createdBy: IResolvable) {
        cdkBuilder.createdBy(createdBy.let(IResolvable::unwrap))
      }

      /**
       * @param createdBy the value to be set.
       */
      override fun createdBy(createdBy: ModelPackageCreatorProperty) {
        cdkBuilder.createdBy(createdBy.let(ModelPackageCreatorProperty::unwrap))
      }

      /**
       * @param createdBy the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("688b0e1d14b76671de6e97c373d6efaa2154d0d50c2a297358cf11e88e777327")
      override fun createdBy(createdBy: ModelPackageCreatorProperty.Builder.() -> Unit): Unit =
          createdBy(ModelPackageCreatorProperty(createdBy))

      /**
       * @param domain The machine learning domain of the model package you specified.
       * Common machine learning domains include computer vision and natural language processing.
       */
      override fun domain(domain: String) {
        cdkBuilder.domain(domain)
      }

      /**
       * @param inferenceSpecification the value to be set.
       */
      override fun inferenceSpecification(inferenceSpecification: IResolvable) {
        cdkBuilder.inferenceSpecification(inferenceSpecification.let(IResolvable::unwrap))
      }

      /**
       * @param inferenceSpecification the value to be set.
       */
      override fun inferenceSpecification(inferenceSpecification: InferenceSpecificationProperty) {
        cdkBuilder.inferenceSpecification(inferenceSpecification.let(InferenceSpecificationProperty::unwrap))
      }

      /**
       * @param inferenceSpecification the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("766b96c35e394b8b538b32f39f247897d38afb112919d78de6ce7eadc40c0884")
      override
          fun inferenceSpecification(inferenceSpecification: InferenceSpecificationProperty.Builder.() -> Unit):
          Unit = inferenceSpecification(InferenceSpecificationProperty(inferenceSpecification))

      /**
       * @param modelApprovalStatus Current approval status of model package.
       */
      override fun modelApprovalStatus(modelApprovalStatus: String) {
        cdkBuilder.modelApprovalStatus(modelApprovalStatus)
      }

      /**
       * @param modelPackageArn The Amazon Resource Name (ARN) of the model package.
       */
      override fun modelPackageArn(modelPackageArn: String) {
        cdkBuilder.modelPackageArn(modelPackageArn)
      }

      /**
       * @param modelPackageDescription A brief summary of the model package.
       */
      override fun modelPackageDescription(modelPackageDescription: String) {
        cdkBuilder.modelPackageDescription(modelPackageDescription)
      }

      /**
       * @param modelPackageGroupName If the model is a versioned model, the name of the model group
       * that the versioned model belongs to.
       */
      override fun modelPackageGroupName(modelPackageGroupName: String) {
        cdkBuilder.modelPackageGroupName(modelPackageGroupName)
      }

      /**
       * @param modelPackageName Name of the model package.
       */
      override fun modelPackageName(modelPackageName: String) {
        cdkBuilder.modelPackageName(modelPackageName)
      }

      /**
       * @param modelPackageStatus Current status of model package.
       */
      override fun modelPackageStatus(modelPackageStatus: String) {
        cdkBuilder.modelPackageStatus(modelPackageStatus)
      }

      /**
       * @param modelPackageVersion Version of the model package.
       */
      override fun modelPackageVersion(modelPackageVersion: Number) {
        cdkBuilder.modelPackageVersion(modelPackageVersion)
      }

      /**
       * @param sourceAlgorithms the value to be set.
       */
      override fun sourceAlgorithms(sourceAlgorithms: IResolvable) {
        cdkBuilder.sourceAlgorithms(sourceAlgorithms.let(IResolvable::unwrap))
      }

      /**
       * @param sourceAlgorithms the value to be set.
       */
      override fun sourceAlgorithms(sourceAlgorithms: List<Any>) {
        cdkBuilder.sourceAlgorithms(sourceAlgorithms)
      }

      /**
       * @param sourceAlgorithms the value to be set.
       */
      override fun sourceAlgorithms(vararg sourceAlgorithms: Any): Unit =
          sourceAlgorithms(sourceAlgorithms.toList())

      /**
       * @param task The machine learning task you specified that your model package accomplishes.
       * Common machine learning tasks include object detection and image classification.
       */
      override fun task(task: String) {
        cdkBuilder.task(task)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnModelCard.ModelPackageDetailsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnModelCard.ModelPackageDetailsProperty,
    ) : CdkObject(cdkObject), ModelPackageDetailsProperty {
      /**
       * A description provided for the model approval.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelcard-modelpackagedetails.html#cfn-sagemaker-modelcard-modelpackagedetails-approvaldescription)
       */
      override fun approvalDescription(): String? = unwrap(this).getApprovalDescription()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelcard-modelpackagedetails.html#cfn-sagemaker-modelcard-modelpackagedetails-createdby)
       */
      override fun createdBy(): Any? = unwrap(this).getCreatedBy()

      /**
       * The machine learning domain of the model package you specified.
       *
       * Common machine learning domains include computer vision and natural language processing.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelcard-modelpackagedetails.html#cfn-sagemaker-modelcard-modelpackagedetails-domain)
       */
      override fun domain(): String? = unwrap(this).getDomain()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelcard-modelpackagedetails.html#cfn-sagemaker-modelcard-modelpackagedetails-inferencespecification)
       */
      override fun inferenceSpecification(): Any? = unwrap(this).getInferenceSpecification()

      /**
       * Current approval status of model package.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelcard-modelpackagedetails.html#cfn-sagemaker-modelcard-modelpackagedetails-modelapprovalstatus)
       */
      override fun modelApprovalStatus(): String? = unwrap(this).getModelApprovalStatus()

      /**
       * The Amazon Resource Name (ARN) of the model package.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelcard-modelpackagedetails.html#cfn-sagemaker-modelcard-modelpackagedetails-modelpackagearn)
       */
      override fun modelPackageArn(): String? = unwrap(this).getModelPackageArn()

      /**
       * A brief summary of the model package.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelcard-modelpackagedetails.html#cfn-sagemaker-modelcard-modelpackagedetails-modelpackagedescription)
       */
      override fun modelPackageDescription(): String? = unwrap(this).getModelPackageDescription()

      /**
       * If the model is a versioned model, the name of the model group that the versioned model
       * belongs to.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelcard-modelpackagedetails.html#cfn-sagemaker-modelcard-modelpackagedetails-modelpackagegroupname)
       */
      override fun modelPackageGroupName(): String? = unwrap(this).getModelPackageGroupName()

      /**
       * Name of the model package.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelcard-modelpackagedetails.html#cfn-sagemaker-modelcard-modelpackagedetails-modelpackagename)
       */
      override fun modelPackageName(): String? = unwrap(this).getModelPackageName()

      /**
       * Current status of model package.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelcard-modelpackagedetails.html#cfn-sagemaker-modelcard-modelpackagedetails-modelpackagestatus)
       */
      override fun modelPackageStatus(): String? = unwrap(this).getModelPackageStatus()

      /**
       * Version of the model package.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelcard-modelpackagedetails.html#cfn-sagemaker-modelcard-modelpackagedetails-modelpackageversion)
       */
      override fun modelPackageVersion(): Number? = unwrap(this).getModelPackageVersion()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelcard-modelpackagedetails.html#cfn-sagemaker-modelcard-modelpackagedetails-sourcealgorithms)
       */
      override fun sourceAlgorithms(): Any? = unwrap(this).getSourceAlgorithms()

      /**
       * The machine learning task you specified that your model package accomplishes.
       *
       * Common machine learning tasks include object detection and image classification.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelcard-modelpackagedetails.html#cfn-sagemaker-modelcard-modelpackagedetails-task)
       */
      override fun task(): String? = unwrap(this).getTask()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ModelPackageDetailsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelCard.ModelPackageDetailsProperty):
          ModelPackageDetailsProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ModelPackageDetailsProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ModelPackageDetailsProperty):
          software.amazon.awscdk.services.sagemaker.CfnModelCard.ModelPackageDetailsProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnModelCard.ModelPackageDetailsProperty
    }
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sagemaker.*;
   * ContainerProperty containerProperty = ContainerProperty.builder()
   * .image("image")
   * // the properties below are optional
   * .modelDataUrl("modelDataUrl")
   * .nearestModelName("nearestModelName")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelcard-container.html)
   */
  public interface ContainerProperty {
    /**
     * Inference environment path.
     *
     * The Amazon EC2 Container Registry (Amazon ECR) path where inference code is stored.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelcard-container.html#cfn-sagemaker-modelcard-container-image)
     */
    public fun image(): String

    /**
     * The Amazon S3 path where the model artifacts, which result from model training, are stored.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelcard-container.html#cfn-sagemaker-modelcard-container-modeldataurl)
     */
    public fun modelDataUrl(): String? = unwrap(this).getModelDataUrl()

    /**
     * The name of a pre-trained machine learning benchmarked by Amazon SageMaker Inference
     * Recommender model that matches your model.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelcard-container.html#cfn-sagemaker-modelcard-container-nearestmodelname)
     */
    public fun nearestModelName(): String? = unwrap(this).getNearestModelName()

    /**
     * A builder for [ContainerProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param image Inference environment path. 
       * The Amazon EC2 Container Registry (Amazon ECR) path where inference code is stored.
       */
      public fun image(image: String)

      /**
       * @param modelDataUrl The Amazon S3 path where the model artifacts, which result from model
       * training, are stored.
       */
      public fun modelDataUrl(modelDataUrl: String)

      /**
       * @param nearestModelName The name of a pre-trained machine learning benchmarked by Amazon
       * SageMaker Inference Recommender model that matches your model.
       */
      public fun nearestModelName(nearestModelName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnModelCard.ContainerProperty.Builder =
          software.amazon.awscdk.services.sagemaker.CfnModelCard.ContainerProperty.builder()

      /**
       * @param image Inference environment path. 
       * The Amazon EC2 Container Registry (Amazon ECR) path where inference code is stored.
       */
      override fun image(image: String) {
        cdkBuilder.image(image)
      }

      /**
       * @param modelDataUrl The Amazon S3 path where the model artifacts, which result from model
       * training, are stored.
       */
      override fun modelDataUrl(modelDataUrl: String) {
        cdkBuilder.modelDataUrl(modelDataUrl)
      }

      /**
       * @param nearestModelName The name of a pre-trained machine learning benchmarked by Amazon
       * SageMaker Inference Recommender model that matches your model.
       */
      override fun nearestModelName(nearestModelName: String) {
        cdkBuilder.nearestModelName(nearestModelName)
      }

      public fun build(): software.amazon.awscdk.services.sagemaker.CfnModelCard.ContainerProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnModelCard.ContainerProperty,
    ) : CdkObject(cdkObject), ContainerProperty {
      /**
       * Inference environment path.
       *
       * The Amazon EC2 Container Registry (Amazon ECR) path where inference code is stored.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelcard-container.html#cfn-sagemaker-modelcard-container-image)
       */
      override fun image(): String = unwrap(this).getImage()

      /**
       * The Amazon S3 path where the model artifacts, which result from model training, are stored.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelcard-container.html#cfn-sagemaker-modelcard-container-modeldataurl)
       */
      override fun modelDataUrl(): String? = unwrap(this).getModelDataUrl()

      /**
       * The name of a pre-trained machine learning benchmarked by Amazon SageMaker Inference
       * Recommender model that matches your model.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelcard-container.html#cfn-sagemaker-modelcard-container-nearestmodelname)
       */
      override fun nearestModelName(): String? = unwrap(this).getNearestModelName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ContainerProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelCard.ContainerProperty):
          ContainerProperty = CdkObjectWrappers.wrap(cdkObject) as? ContainerProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: ContainerProperty):
          software.amazon.awscdk.services.sagemaker.CfnModelCard.ContainerProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnModelCard.ContainerProperty
    }
  }

  /**
   * The security configuration used to protect model card data.
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
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelcard-securityconfig.html)
   */
  public interface SecurityConfigProperty {
    /**
     * A AWS Key Management Service [key
     * ID](https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#key-id-key-id) used to
     * encrypt a model card.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelcard-securityconfig.html#cfn-sagemaker-modelcard-securityconfig-kmskeyid)
     */
    public fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

    /**
     * A builder for [SecurityConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param kmsKeyId A AWS Key Management Service [key
       * ID](https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#key-id-key-id) used to
       * encrypt a model card.
       */
      public fun kmsKeyId(kmsKeyId: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnModelCard.SecurityConfigProperty.Builder =
          software.amazon.awscdk.services.sagemaker.CfnModelCard.SecurityConfigProperty.builder()

      /**
       * @param kmsKeyId A AWS Key Management Service [key
       * ID](https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#key-id-key-id) used to
       * encrypt a model card.
       */
      override fun kmsKeyId(kmsKeyId: String) {
        cdkBuilder.kmsKeyId(kmsKeyId)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnModelCard.SecurityConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnModelCard.SecurityConfigProperty,
    ) : CdkObject(cdkObject), SecurityConfigProperty {
      /**
       * A AWS Key Management Service [key
       * ID](https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#key-id-key-id) used to
       * encrypt a model card.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelcard-securityconfig.html#cfn-sagemaker-modelcard-securityconfig-kmskeyid)
       */
      override fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SecurityConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelCard.SecurityConfigProperty):
          SecurityConfigProperty = CdkObjectWrappers.wrap(cdkObject) as? SecurityConfigProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: SecurityConfigProperty):
          software.amazon.awscdk.services.sagemaker.CfnModelCard.SecurityConfigProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnModelCard.SecurityConfigProperty
    }
  }

  /**
   * The training details of the model.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sagemaker.*;
   * TrainingDetailsProperty trainingDetailsProperty = TrainingDetailsProperty.builder()
   * .objectiveFunction(ObjectiveFunctionProperty.builder()
   * .function(FunctionProperty.builder()
   * .condition("condition")
   * .facet("facet")
   * .function("function")
   * .build())
   * .notes("notes")
   * .build())
   * .trainingJobDetails(TrainingJobDetailsProperty.builder()
   * .hyperParameters(List.of(TrainingHyperParameterProperty.builder()
   * .name("name")
   * .value("value")
   * .build()))
   * .trainingArn("trainingArn")
   * .trainingDatasets(List.of("trainingDatasets"))
   * .trainingEnvironment(TrainingEnvironmentProperty.builder()
   * .containerImage(List.of("containerImage"))
   * .build())
   * .trainingMetrics(List.of(TrainingMetricProperty.builder()
   * .name("name")
   * .value(123)
   * // the properties below are optional
   * .notes("notes")
   * .build()))
   * .userProvidedHyperParameters(List.of(TrainingHyperParameterProperty.builder()
   * .name("name")
   * .value("value")
   * .build()))
   * .userProvidedTrainingMetrics(List.of(TrainingMetricProperty.builder()
   * .name("name")
   * .value(123)
   * // the properties below are optional
   * .notes("notes")
   * .build()))
   * .build())
   * .trainingObservations("trainingObservations")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelcard-trainingdetails.html)
   */
  public interface TrainingDetailsProperty {
    /**
     * The function that is optimized during model training.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelcard-trainingdetails.html#cfn-sagemaker-modelcard-trainingdetails-objectivefunction)
     */
    public fun objectiveFunction(): Any? = unwrap(this).getObjectiveFunction()

    /**
     * Details about any associated training jobs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelcard-trainingdetails.html#cfn-sagemaker-modelcard-trainingdetails-trainingjobdetails)
     */
    public fun trainingJobDetails(): Any? = unwrap(this).getTrainingJobDetails()

    /**
     * Any observations about training.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelcard-trainingdetails.html#cfn-sagemaker-modelcard-trainingdetails-trainingobservations)
     */
    public fun trainingObservations(): String? = unwrap(this).getTrainingObservations()

    /**
     * A builder for [TrainingDetailsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param objectiveFunction The function that is optimized during model training.
       */
      public fun objectiveFunction(objectiveFunction: IResolvable)

      /**
       * @param objectiveFunction The function that is optimized during model training.
       */
      public fun objectiveFunction(objectiveFunction: ObjectiveFunctionProperty)

      /**
       * @param objectiveFunction The function that is optimized during model training.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7ff398faacbe686bdb9bd489624c89cf86836e4e43a6192af04c2d0ada43ccb0")
      public fun objectiveFunction(objectiveFunction: ObjectiveFunctionProperty.Builder.() -> Unit)

      /**
       * @param trainingJobDetails Details about any associated training jobs.
       */
      public fun trainingJobDetails(trainingJobDetails: IResolvable)

      /**
       * @param trainingJobDetails Details about any associated training jobs.
       */
      public fun trainingJobDetails(trainingJobDetails: TrainingJobDetailsProperty)

      /**
       * @param trainingJobDetails Details about any associated training jobs.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("397ff1447cdbecbc9a54d43caf6bc378d064127c311299383afd31d0212a5cbe")
      public
          fun trainingJobDetails(trainingJobDetails: TrainingJobDetailsProperty.Builder.() -> Unit)

      /**
       * @param trainingObservations Any observations about training.
       */
      public fun trainingObservations(trainingObservations: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnModelCard.TrainingDetailsProperty.Builder =
          software.amazon.awscdk.services.sagemaker.CfnModelCard.TrainingDetailsProperty.builder()

      /**
       * @param objectiveFunction The function that is optimized during model training.
       */
      override fun objectiveFunction(objectiveFunction: IResolvable) {
        cdkBuilder.objectiveFunction(objectiveFunction.let(IResolvable::unwrap))
      }

      /**
       * @param objectiveFunction The function that is optimized during model training.
       */
      override fun objectiveFunction(objectiveFunction: ObjectiveFunctionProperty) {
        cdkBuilder.objectiveFunction(objectiveFunction.let(ObjectiveFunctionProperty::unwrap))
      }

      /**
       * @param objectiveFunction The function that is optimized during model training.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7ff398faacbe686bdb9bd489624c89cf86836e4e43a6192af04c2d0ada43ccb0")
      override
          fun objectiveFunction(objectiveFunction: ObjectiveFunctionProperty.Builder.() -> Unit):
          Unit = objectiveFunction(ObjectiveFunctionProperty(objectiveFunction))

      /**
       * @param trainingJobDetails Details about any associated training jobs.
       */
      override fun trainingJobDetails(trainingJobDetails: IResolvable) {
        cdkBuilder.trainingJobDetails(trainingJobDetails.let(IResolvable::unwrap))
      }

      /**
       * @param trainingJobDetails Details about any associated training jobs.
       */
      override fun trainingJobDetails(trainingJobDetails: TrainingJobDetailsProperty) {
        cdkBuilder.trainingJobDetails(trainingJobDetails.let(TrainingJobDetailsProperty::unwrap))
      }

      /**
       * @param trainingJobDetails Details about any associated training jobs.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("397ff1447cdbecbc9a54d43caf6bc378d064127c311299383afd31d0212a5cbe")
      override
          fun trainingJobDetails(trainingJobDetails: TrainingJobDetailsProperty.Builder.() -> Unit):
          Unit = trainingJobDetails(TrainingJobDetailsProperty(trainingJobDetails))

      /**
       * @param trainingObservations Any observations about training.
       */
      override fun trainingObservations(trainingObservations: String) {
        cdkBuilder.trainingObservations(trainingObservations)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnModelCard.TrainingDetailsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnModelCard.TrainingDetailsProperty,
    ) : CdkObject(cdkObject), TrainingDetailsProperty {
      /**
       * The function that is optimized during model training.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelcard-trainingdetails.html#cfn-sagemaker-modelcard-trainingdetails-objectivefunction)
       */
      override fun objectiveFunction(): Any? = unwrap(this).getObjectiveFunction()

      /**
       * Details about any associated training jobs.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelcard-trainingdetails.html#cfn-sagemaker-modelcard-trainingdetails-trainingjobdetails)
       */
      override fun trainingJobDetails(): Any? = unwrap(this).getTrainingJobDetails()

      /**
       * Any observations about training.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelcard-trainingdetails.html#cfn-sagemaker-modelcard-trainingdetails-trainingobservations)
       */
      override fun trainingObservations(): String? = unwrap(this).getTrainingObservations()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): TrainingDetailsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelCard.TrainingDetailsProperty):
          TrainingDetailsProperty = CdkObjectWrappers.wrap(cdkObject) as? TrainingDetailsProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: TrainingDetailsProperty):
          software.amazon.awscdk.services.sagemaker.CfnModelCard.TrainingDetailsProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnModelCard.TrainingDetailsProperty
    }
  }

  /**
   * The content of the model card.
   *
   * It follows the [model card json
   * schema](https://docs.aws.amazon.com/sagemaker/latest/dg/model-cards.html#model-cards-json-schema)
   * .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sagemaker.*;
   * Object value;
   * ContentProperty contentProperty = ContentProperty.builder()
   * .additionalInformation(AdditionalInformationProperty.builder()
   * .caveatsAndRecommendations("caveatsAndRecommendations")
   * .customDetails(Map.of(
   * "customDetailsKey", "customDetails"))
   * .ethicalConsiderations("ethicalConsiderations")
   * .build())
   * .businessDetails(BusinessDetailsProperty.builder()
   * .businessProblem("businessProblem")
   * .businessStakeholders("businessStakeholders")
   * .lineOfBusiness("lineOfBusiness")
   * .build())
   * .evaluationDetails(List.of(EvaluationDetailProperty.builder()
   * .name("name")
   * // the properties below are optional
   * .datasets(List.of("datasets"))
   * .evaluationJobArn("evaluationJobArn")
   * .evaluationObservation("evaluationObservation")
   * .metadata(Map.of(
   * "metadataKey", "metadata"))
   * .metricGroups(List.of(MetricGroupProperty.builder()
   * .metricData(List.of(MetricDataItemsProperty.builder()
   * .name("name")
   * .type("type")
   * .value(value)
   * // the properties below are optional
   * .notes("notes")
   * .xAxisName(List.of("xAxisName"))
   * .yAxisName(List.of("yAxisName"))
   * .build()))
   * .name("name")
   * .build()))
   * .build()))
   * .intendedUses(IntendedUsesProperty.builder()
   * .explanationsForRiskRating("explanationsForRiskRating")
   * .factorsAffectingModelEfficiency("factorsAffectingModelEfficiency")
   * .intendedUses("intendedUses")
   * .purposeOfModel("purposeOfModel")
   * .riskRating("riskRating")
   * .build())
   * .modelOverview(ModelOverviewProperty.builder()
   * .algorithmType("algorithmType")
   * .inferenceEnvironment(InferenceEnvironmentProperty.builder()
   * .containerImage(List.of("containerImage"))
   * .build())
   * .modelArtifact(List.of("modelArtifact"))
   * .modelCreator("modelCreator")
   * .modelDescription("modelDescription")
   * .modelId("modelId")
   * .modelName("modelName")
   * .modelOwner("modelOwner")
   * .modelVersion(123)
   * .problemType("problemType")
   * .build())
   * .modelPackageDetails(ModelPackageDetailsProperty.builder()
   * .approvalDescription("approvalDescription")
   * .createdBy(ModelPackageCreatorProperty.builder()
   * .userProfileName("userProfileName")
   * .build())
   * .domain("domain")
   * .inferenceSpecification(InferenceSpecificationProperty.builder()
   * .containers(List.of(ContainerProperty.builder()
   * .image("image")
   * // the properties below are optional
   * .modelDataUrl("modelDataUrl")
   * .nearestModelName("nearestModelName")
   * .build()))
   * .build())
   * .modelApprovalStatus("modelApprovalStatus")
   * .modelPackageArn("modelPackageArn")
   * .modelPackageDescription("modelPackageDescription")
   * .modelPackageGroupName("modelPackageGroupName")
   * .modelPackageName("modelPackageName")
   * .modelPackageStatus("modelPackageStatus")
   * .modelPackageVersion(123)
   * .sourceAlgorithms(List.of(SourceAlgorithmProperty.builder()
   * .algorithmName("algorithmName")
   * // the properties below are optional
   * .modelDataUrl("modelDataUrl")
   * .build()))
   * .task("task")
   * .build())
   * .trainingDetails(TrainingDetailsProperty.builder()
   * .objectiveFunction(ObjectiveFunctionProperty.builder()
   * .function(FunctionProperty.builder()
   * .condition("condition")
   * .facet("facet")
   * .function("function")
   * .build())
   * .notes("notes")
   * .build())
   * .trainingJobDetails(TrainingJobDetailsProperty.builder()
   * .hyperParameters(List.of(TrainingHyperParameterProperty.builder()
   * .name("name")
   * .value("value")
   * .build()))
   * .trainingArn("trainingArn")
   * .trainingDatasets(List.of("trainingDatasets"))
   * .trainingEnvironment(TrainingEnvironmentProperty.builder()
   * .containerImage(List.of("containerImage"))
   * .build())
   * .trainingMetrics(List.of(TrainingMetricProperty.builder()
   * .name("name")
   * .value(123)
   * // the properties below are optional
   * .notes("notes")
   * .build()))
   * .userProvidedHyperParameters(List.of(TrainingHyperParameterProperty.builder()
   * .name("name")
   * .value("value")
   * .build()))
   * .userProvidedTrainingMetrics(List.of(TrainingMetricProperty.builder()
   * .name("name")
   * .value(123)
   * // the properties below are optional
   * .notes("notes")
   * .build()))
   * .build())
   * .trainingObservations("trainingObservations")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelcard-content.html)
   */
  public interface ContentProperty {
    /**
     * Additional information about the model.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelcard-content.html#cfn-sagemaker-modelcard-content-additionalinformation)
     */
    public fun additionalInformation(): Any? = unwrap(this).getAdditionalInformation()

    /**
     * Information about how the model supports business goals.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelcard-content.html#cfn-sagemaker-modelcard-content-businessdetails)
     */
    public fun businessDetails(): Any? = unwrap(this).getBusinessDetails()

    /**
     * An overview about the model's evaluation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelcard-content.html#cfn-sagemaker-modelcard-content-evaluationdetails)
     */
    public fun evaluationDetails(): Any? = unwrap(this).getEvaluationDetails()

    /**
     * The intended usage of the model.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelcard-content.html#cfn-sagemaker-modelcard-content-intendeduses)
     */
    public fun intendedUses(): Any? = unwrap(this).getIntendedUses()

    /**
     * An overview about the model.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelcard-content.html#cfn-sagemaker-modelcard-content-modeloverview)
     */
    public fun modelOverview(): Any? = unwrap(this).getModelOverview()

    /**
     * Metadata information related to model package version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelcard-content.html#cfn-sagemaker-modelcard-content-modelpackagedetails)
     */
    public fun modelPackageDetails(): Any? = unwrap(this).getModelPackageDetails()

    /**
     * An overview about model training.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelcard-content.html#cfn-sagemaker-modelcard-content-trainingdetails)
     */
    public fun trainingDetails(): Any? = unwrap(this).getTrainingDetails()

    /**
     * A builder for [ContentProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param additionalInformation Additional information about the model.
       */
      public fun additionalInformation(additionalInformation: IResolvable)

      /**
       * @param additionalInformation Additional information about the model.
       */
      public fun additionalInformation(additionalInformation: AdditionalInformationProperty)

      /**
       * @param additionalInformation Additional information about the model.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c9da26ad18c832edc81e508345e855b2a7047624f7601d753f67e31e4ed849a7")
      public
          fun additionalInformation(additionalInformation: AdditionalInformationProperty.Builder.() -> Unit)

      /**
       * @param businessDetails Information about how the model supports business goals.
       */
      public fun businessDetails(businessDetails: IResolvable)

      /**
       * @param businessDetails Information about how the model supports business goals.
       */
      public fun businessDetails(businessDetails: BusinessDetailsProperty)

      /**
       * @param businessDetails Information about how the model supports business goals.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e284e3086325df9a0df3e932dfeafb29ff224ba991c0ac097163551b91ed5e5e")
      public fun businessDetails(businessDetails: BusinessDetailsProperty.Builder.() -> Unit)

      /**
       * @param evaluationDetails An overview about the model's evaluation.
       */
      public fun evaluationDetails(evaluationDetails: IResolvable)

      /**
       * @param evaluationDetails An overview about the model's evaluation.
       */
      public fun evaluationDetails(evaluationDetails: List<Any>)

      /**
       * @param evaluationDetails An overview about the model's evaluation.
       */
      public fun evaluationDetails(vararg evaluationDetails: Any)

      /**
       * @param intendedUses The intended usage of the model.
       */
      public fun intendedUses(intendedUses: IResolvable)

      /**
       * @param intendedUses The intended usage of the model.
       */
      public fun intendedUses(intendedUses: IntendedUsesProperty)

      /**
       * @param intendedUses The intended usage of the model.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8bce6dff06486b481662c009fb93dcc10896aa53ef484ac6e06d2ad9b52cc3d5")
      public fun intendedUses(intendedUses: IntendedUsesProperty.Builder.() -> Unit)

      /**
       * @param modelOverview An overview about the model.
       */
      public fun modelOverview(modelOverview: IResolvable)

      /**
       * @param modelOverview An overview about the model.
       */
      public fun modelOverview(modelOverview: ModelOverviewProperty)

      /**
       * @param modelOverview An overview about the model.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5d19f8a1c503753eafc93cbcec0f43f2972812bb3ed1fbaa1bd5231d2bbe19dc")
      public fun modelOverview(modelOverview: ModelOverviewProperty.Builder.() -> Unit)

      /**
       * @param modelPackageDetails Metadata information related to model package version.
       */
      public fun modelPackageDetails(modelPackageDetails: IResolvable)

      /**
       * @param modelPackageDetails Metadata information related to model package version.
       */
      public fun modelPackageDetails(modelPackageDetails: ModelPackageDetailsProperty)

      /**
       * @param modelPackageDetails Metadata information related to model package version.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a62c3944517d40757e0fd6c7f75ee3f38b6d10d5796a19715d445827a229309d")
      public
          fun modelPackageDetails(modelPackageDetails: ModelPackageDetailsProperty.Builder.() -> Unit)

      /**
       * @param trainingDetails An overview about model training.
       */
      public fun trainingDetails(trainingDetails: IResolvable)

      /**
       * @param trainingDetails An overview about model training.
       */
      public fun trainingDetails(trainingDetails: TrainingDetailsProperty)

      /**
       * @param trainingDetails An overview about model training.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("43025e03b37eb5242f73face588aac78788711c6736b287967905c350e85877c")
      public fun trainingDetails(trainingDetails: TrainingDetailsProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnModelCard.ContentProperty.Builder =
          software.amazon.awscdk.services.sagemaker.CfnModelCard.ContentProperty.builder()

      /**
       * @param additionalInformation Additional information about the model.
       */
      override fun additionalInformation(additionalInformation: IResolvable) {
        cdkBuilder.additionalInformation(additionalInformation.let(IResolvable::unwrap))
      }

      /**
       * @param additionalInformation Additional information about the model.
       */
      override fun additionalInformation(additionalInformation: AdditionalInformationProperty) {
        cdkBuilder.additionalInformation(additionalInformation.let(AdditionalInformationProperty::unwrap))
      }

      /**
       * @param additionalInformation Additional information about the model.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c9da26ad18c832edc81e508345e855b2a7047624f7601d753f67e31e4ed849a7")
      override
          fun additionalInformation(additionalInformation: AdditionalInformationProperty.Builder.() -> Unit):
          Unit = additionalInformation(AdditionalInformationProperty(additionalInformation))

      /**
       * @param businessDetails Information about how the model supports business goals.
       */
      override fun businessDetails(businessDetails: IResolvable) {
        cdkBuilder.businessDetails(businessDetails.let(IResolvable::unwrap))
      }

      /**
       * @param businessDetails Information about how the model supports business goals.
       */
      override fun businessDetails(businessDetails: BusinessDetailsProperty) {
        cdkBuilder.businessDetails(businessDetails.let(BusinessDetailsProperty::unwrap))
      }

      /**
       * @param businessDetails Information about how the model supports business goals.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e284e3086325df9a0df3e932dfeafb29ff224ba991c0ac097163551b91ed5e5e")
      override fun businessDetails(businessDetails: BusinessDetailsProperty.Builder.() -> Unit):
          Unit = businessDetails(BusinessDetailsProperty(businessDetails))

      /**
       * @param evaluationDetails An overview about the model's evaluation.
       */
      override fun evaluationDetails(evaluationDetails: IResolvable) {
        cdkBuilder.evaluationDetails(evaluationDetails.let(IResolvable::unwrap))
      }

      /**
       * @param evaluationDetails An overview about the model's evaluation.
       */
      override fun evaluationDetails(evaluationDetails: List<Any>) {
        cdkBuilder.evaluationDetails(evaluationDetails)
      }

      /**
       * @param evaluationDetails An overview about the model's evaluation.
       */
      override fun evaluationDetails(vararg evaluationDetails: Any): Unit =
          evaluationDetails(evaluationDetails.toList())

      /**
       * @param intendedUses The intended usage of the model.
       */
      override fun intendedUses(intendedUses: IResolvable) {
        cdkBuilder.intendedUses(intendedUses.let(IResolvable::unwrap))
      }

      /**
       * @param intendedUses The intended usage of the model.
       */
      override fun intendedUses(intendedUses: IntendedUsesProperty) {
        cdkBuilder.intendedUses(intendedUses.let(IntendedUsesProperty::unwrap))
      }

      /**
       * @param intendedUses The intended usage of the model.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8bce6dff06486b481662c009fb93dcc10896aa53ef484ac6e06d2ad9b52cc3d5")
      override fun intendedUses(intendedUses: IntendedUsesProperty.Builder.() -> Unit): Unit =
          intendedUses(IntendedUsesProperty(intendedUses))

      /**
       * @param modelOverview An overview about the model.
       */
      override fun modelOverview(modelOverview: IResolvable) {
        cdkBuilder.modelOverview(modelOverview.let(IResolvable::unwrap))
      }

      /**
       * @param modelOverview An overview about the model.
       */
      override fun modelOverview(modelOverview: ModelOverviewProperty) {
        cdkBuilder.modelOverview(modelOverview.let(ModelOverviewProperty::unwrap))
      }

      /**
       * @param modelOverview An overview about the model.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5d19f8a1c503753eafc93cbcec0f43f2972812bb3ed1fbaa1bd5231d2bbe19dc")
      override fun modelOverview(modelOverview: ModelOverviewProperty.Builder.() -> Unit): Unit =
          modelOverview(ModelOverviewProperty(modelOverview))

      /**
       * @param modelPackageDetails Metadata information related to model package version.
       */
      override fun modelPackageDetails(modelPackageDetails: IResolvable) {
        cdkBuilder.modelPackageDetails(modelPackageDetails.let(IResolvable::unwrap))
      }

      /**
       * @param modelPackageDetails Metadata information related to model package version.
       */
      override fun modelPackageDetails(modelPackageDetails: ModelPackageDetailsProperty) {
        cdkBuilder.modelPackageDetails(modelPackageDetails.let(ModelPackageDetailsProperty::unwrap))
      }

      /**
       * @param modelPackageDetails Metadata information related to model package version.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a62c3944517d40757e0fd6c7f75ee3f38b6d10d5796a19715d445827a229309d")
      override
          fun modelPackageDetails(modelPackageDetails: ModelPackageDetailsProperty.Builder.() -> Unit):
          Unit = modelPackageDetails(ModelPackageDetailsProperty(modelPackageDetails))

      /**
       * @param trainingDetails An overview about model training.
       */
      override fun trainingDetails(trainingDetails: IResolvable) {
        cdkBuilder.trainingDetails(trainingDetails.let(IResolvable::unwrap))
      }

      /**
       * @param trainingDetails An overview about model training.
       */
      override fun trainingDetails(trainingDetails: TrainingDetailsProperty) {
        cdkBuilder.trainingDetails(trainingDetails.let(TrainingDetailsProperty::unwrap))
      }

      /**
       * @param trainingDetails An overview about model training.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("43025e03b37eb5242f73face588aac78788711c6736b287967905c350e85877c")
      override fun trainingDetails(trainingDetails: TrainingDetailsProperty.Builder.() -> Unit):
          Unit = trainingDetails(TrainingDetailsProperty(trainingDetails))

      public fun build(): software.amazon.awscdk.services.sagemaker.CfnModelCard.ContentProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnModelCard.ContentProperty,
    ) : CdkObject(cdkObject), ContentProperty {
      /**
       * Additional information about the model.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelcard-content.html#cfn-sagemaker-modelcard-content-additionalinformation)
       */
      override fun additionalInformation(): Any? = unwrap(this).getAdditionalInformation()

      /**
       * Information about how the model supports business goals.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelcard-content.html#cfn-sagemaker-modelcard-content-businessdetails)
       */
      override fun businessDetails(): Any? = unwrap(this).getBusinessDetails()

      /**
       * An overview about the model's evaluation.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelcard-content.html#cfn-sagemaker-modelcard-content-evaluationdetails)
       */
      override fun evaluationDetails(): Any? = unwrap(this).getEvaluationDetails()

      /**
       * The intended usage of the model.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelcard-content.html#cfn-sagemaker-modelcard-content-intendeduses)
       */
      override fun intendedUses(): Any? = unwrap(this).getIntendedUses()

      /**
       * An overview about the model.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelcard-content.html#cfn-sagemaker-modelcard-content-modeloverview)
       */
      override fun modelOverview(): Any? = unwrap(this).getModelOverview()

      /**
       * Metadata information related to model package version.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelcard-content.html#cfn-sagemaker-modelcard-content-modelpackagedetails)
       */
      override fun modelPackageDetails(): Any? = unwrap(this).getModelPackageDetails()

      /**
       * An overview about model training.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelcard-content.html#cfn-sagemaker-modelcard-content-trainingdetails)
       */
      override fun trainingDetails(): Any? = unwrap(this).getTrainingDetails()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ContentProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelCard.ContentProperty):
          ContentProperty = CdkObjectWrappers.wrap(cdkObject) as? ContentProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: ContentProperty):
          software.amazon.awscdk.services.sagemaker.CfnModelCard.ContentProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnModelCard.ContentProperty
    }
  }

  /**
   * Function details.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sagemaker.*;
   * FunctionProperty functionProperty = FunctionProperty.builder()
   * .condition("condition")
   * .facet("facet")
   * .function("function")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelcard-function.html)
   */
  public interface FunctionProperty {
    /**
     * An optional description of any conditions of your objective function metric.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelcard-function.html#cfn-sagemaker-modelcard-function-condition)
     */
    public fun condition(): String? = unwrap(this).getCondition()

    /**
     * The metric of the model's objective function.
     *
     * For example, *loss* or *rmse* . The following list shows examples of the values that you can
     * specify for the metric:
     *
     * * `ACCURACY`
     * * `AUC`
     * * `LOSS`
     * * `MAE`
     * * `RMSE`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelcard-function.html#cfn-sagemaker-modelcard-function-facet)
     */
    public fun facet(): String? = unwrap(this).getFacet()

    /**
     * The optimization direction of the model's objective function. You must specify one of the
     * following values:.
     *
     * * `Maximize`
     * * `Minimize`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelcard-function.html#cfn-sagemaker-modelcard-function-function)
     */
    public fun function(): String? = unwrap(this).getFunction()

    /**
     * A builder for [FunctionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param condition An optional description of any conditions of your objective function
       * metric.
       */
      public fun condition(condition: String)

      /**
       * @param facet The metric of the model's objective function.
       * For example, *loss* or *rmse* . The following list shows examples of the values that you
       * can specify for the metric:
       *
       * * `ACCURACY`
       * * `AUC`
       * * `LOSS`
       * * `MAE`
       * * `RMSE`
       */
      public fun facet(facet: String)

      /**
       * @param function The optimization direction of the model's objective function. You must
       * specify one of the following values:.
       * * `Maximize`
       * * `Minimize`
       */
      public fun function(function: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnModelCard.FunctionProperty.Builder =
          software.amazon.awscdk.services.sagemaker.CfnModelCard.FunctionProperty.builder()

      /**
       * @param condition An optional description of any conditions of your objective function
       * metric.
       */
      override fun condition(condition: String) {
        cdkBuilder.condition(condition)
      }

      /**
       * @param facet The metric of the model's objective function.
       * For example, *loss* or *rmse* . The following list shows examples of the values that you
       * can specify for the metric:
       *
       * * `ACCURACY`
       * * `AUC`
       * * `LOSS`
       * * `MAE`
       * * `RMSE`
       */
      override fun facet(facet: String) {
        cdkBuilder.facet(facet)
      }

      /**
       * @param function The optimization direction of the model's objective function. You must
       * specify one of the following values:.
       * * `Maximize`
       * * `Minimize`
       */
      override fun function(function: String) {
        cdkBuilder.function(function)
      }

      public fun build(): software.amazon.awscdk.services.sagemaker.CfnModelCard.FunctionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnModelCard.FunctionProperty,
    ) : CdkObject(cdkObject), FunctionProperty {
      /**
       * An optional description of any conditions of your objective function metric.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelcard-function.html#cfn-sagemaker-modelcard-function-condition)
       */
      override fun condition(): String? = unwrap(this).getCondition()

      /**
       * The metric of the model's objective function.
       *
       * For example, *loss* or *rmse* . The following list shows examples of the values that you
       * can specify for the metric:
       *
       * * `ACCURACY`
       * * `AUC`
       * * `LOSS`
       * * `MAE`
       * * `RMSE`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelcard-function.html#cfn-sagemaker-modelcard-function-facet)
       */
      override fun facet(): String? = unwrap(this).getFacet()

      /**
       * The optimization direction of the model's objective function. You must specify one of the
       * following values:.
       *
       * * `Maximize`
       * * `Minimize`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelcard-function.html#cfn-sagemaker-modelcard-function-function)
       */
      override fun function(): String? = unwrap(this).getFunction()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): FunctionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelCard.FunctionProperty):
          FunctionProperty = CdkObjectWrappers.wrap(cdkObject) as? FunctionProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: FunctionProperty):
          software.amazon.awscdk.services.sagemaker.CfnModelCard.FunctionProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnModelCard.FunctionProperty
    }
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sagemaker.*;
   * ModelPackageCreatorProperty modelPackageCreatorProperty = ModelPackageCreatorProperty.builder()
   * .userProfileName("userProfileName")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelcard-modelpackagecreator.html)
   */
  public interface ModelPackageCreatorProperty {
    /**
     * The name of the user's profile in Studio.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelcard-modelpackagecreator.html#cfn-sagemaker-modelcard-modelpackagecreator-userprofilename)
     */
    public fun userProfileName(): String? = unwrap(this).getUserProfileName()

    /**
     * A builder for [ModelPackageCreatorProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param userProfileName The name of the user's profile in Studio.
       */
      public fun userProfileName(userProfileName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnModelCard.ModelPackageCreatorProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnModelCard.ModelPackageCreatorProperty.builder()

      /**
       * @param userProfileName The name of the user's profile in Studio.
       */
      override fun userProfileName(userProfileName: String) {
        cdkBuilder.userProfileName(userProfileName)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnModelCard.ModelPackageCreatorProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnModelCard.ModelPackageCreatorProperty,
    ) : CdkObject(cdkObject), ModelPackageCreatorProperty {
      /**
       * The name of the user's profile in Studio.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelcard-modelpackagecreator.html#cfn-sagemaker-modelcard-modelpackagecreator-userprofilename)
       */
      override fun userProfileName(): String? = unwrap(this).getUserProfileName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ModelPackageCreatorProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelCard.ModelPackageCreatorProperty):
          ModelPackageCreatorProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ModelPackageCreatorProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ModelPackageCreatorProperty):
          software.amazon.awscdk.services.sagemaker.CfnModelCard.ModelPackageCreatorProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnModelCard.ModelPackageCreatorProperty
    }
  }

  /**
   * SageMaker training image.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sagemaker.*;
   * TrainingEnvironmentProperty trainingEnvironmentProperty = TrainingEnvironmentProperty.builder()
   * .containerImage(List.of("containerImage"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelcard-trainingenvironment.html)
   */
  public interface TrainingEnvironmentProperty {
    /**
     * SageMaker inference image URI.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelcard-trainingenvironment.html#cfn-sagemaker-modelcard-trainingenvironment-containerimage)
     */
    public fun containerImage(): List<String> = unwrap(this).getContainerImage() ?: emptyList()

    /**
     * A builder for [TrainingEnvironmentProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param containerImage SageMaker inference image URI.
       */
      public fun containerImage(containerImage: List<String>)

      /**
       * @param containerImage SageMaker inference image URI.
       */
      public fun containerImage(vararg containerImage: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnModelCard.TrainingEnvironmentProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnModelCard.TrainingEnvironmentProperty.builder()

      /**
       * @param containerImage SageMaker inference image URI.
       */
      override fun containerImage(containerImage: List<String>) {
        cdkBuilder.containerImage(containerImage)
      }

      /**
       * @param containerImage SageMaker inference image URI.
       */
      override fun containerImage(vararg containerImage: String): Unit =
          containerImage(containerImage.toList())

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnModelCard.TrainingEnvironmentProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnModelCard.TrainingEnvironmentProperty,
    ) : CdkObject(cdkObject), TrainingEnvironmentProperty {
      /**
       * SageMaker inference image URI.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelcard-trainingenvironment.html#cfn-sagemaker-modelcard-trainingenvironment-containerimage)
       */
      override fun containerImage(): List<String> = unwrap(this).getContainerImage() ?: emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): TrainingEnvironmentProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelCard.TrainingEnvironmentProperty):
          TrainingEnvironmentProperty = CdkObjectWrappers.wrap(cdkObject) as?
          TrainingEnvironmentProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: TrainingEnvironmentProperty):
          software.amazon.awscdk.services.sagemaker.CfnModelCard.TrainingEnvironmentProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnModelCard.TrainingEnvironmentProperty
    }
  }

  /**
   * Additional information about the model.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sagemaker.*;
   * AdditionalInformationProperty additionalInformationProperty =
   * AdditionalInformationProperty.builder()
   * .caveatsAndRecommendations("caveatsAndRecommendations")
   * .customDetails(Map.of(
   * "customDetailsKey", "customDetails"))
   * .ethicalConsiderations("ethicalConsiderations")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelcard-additionalinformation.html)
   */
  public interface AdditionalInformationProperty {
    /**
     * Caveats and recommendations for those who might use this model in their applications.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelcard-additionalinformation.html#cfn-sagemaker-modelcard-additionalinformation-caveatsandrecommendations)
     */
    public fun caveatsAndRecommendations(): String? = unwrap(this).getCaveatsAndRecommendations()

    /**
     * Any additional information to document about the model.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelcard-additionalinformation.html#cfn-sagemaker-modelcard-additionalinformation-customdetails)
     */
    public fun customDetails(): Any? = unwrap(this).getCustomDetails()

    /**
     * Any ethical considerations documented by the model card author.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelcard-additionalinformation.html#cfn-sagemaker-modelcard-additionalinformation-ethicalconsiderations)
     */
    public fun ethicalConsiderations(): String? = unwrap(this).getEthicalConsiderations()

    /**
     * A builder for [AdditionalInformationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param caveatsAndRecommendations Caveats and recommendations for those who might use this
       * model in their applications.
       */
      public fun caveatsAndRecommendations(caveatsAndRecommendations: String)

      /**
       * @param customDetails Any additional information to document about the model.
       */
      public fun customDetails(customDetails: IResolvable)

      /**
       * @param customDetails Any additional information to document about the model.
       */
      public fun customDetails(customDetails: Map<String, String>)

      /**
       * @param ethicalConsiderations Any ethical considerations documented by the model card
       * author.
       */
      public fun ethicalConsiderations(ethicalConsiderations: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnModelCard.AdditionalInformationProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnModelCard.AdditionalInformationProperty.builder()

      /**
       * @param caveatsAndRecommendations Caveats and recommendations for those who might use this
       * model in their applications.
       */
      override fun caveatsAndRecommendations(caveatsAndRecommendations: String) {
        cdkBuilder.caveatsAndRecommendations(caveatsAndRecommendations)
      }

      /**
       * @param customDetails Any additional information to document about the model.
       */
      override fun customDetails(customDetails: IResolvable) {
        cdkBuilder.customDetails(customDetails.let(IResolvable::unwrap))
      }

      /**
       * @param customDetails Any additional information to document about the model.
       */
      override fun customDetails(customDetails: Map<String, String>) {
        cdkBuilder.customDetails(customDetails)
      }

      /**
       * @param ethicalConsiderations Any ethical considerations documented by the model card
       * author.
       */
      override fun ethicalConsiderations(ethicalConsiderations: String) {
        cdkBuilder.ethicalConsiderations(ethicalConsiderations)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnModelCard.AdditionalInformationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnModelCard.AdditionalInformationProperty,
    ) : CdkObject(cdkObject), AdditionalInformationProperty {
      /**
       * Caveats and recommendations for those who might use this model in their applications.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelcard-additionalinformation.html#cfn-sagemaker-modelcard-additionalinformation-caveatsandrecommendations)
       */
      override fun caveatsAndRecommendations(): String? =
          unwrap(this).getCaveatsAndRecommendations()

      /**
       * Any additional information to document about the model.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelcard-additionalinformation.html#cfn-sagemaker-modelcard-additionalinformation-customdetails)
       */
      override fun customDetails(): Any? = unwrap(this).getCustomDetails()

      /**
       * Any ethical considerations documented by the model card author.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelcard-additionalinformation.html#cfn-sagemaker-modelcard-additionalinformation-ethicalconsiderations)
       */
      override fun ethicalConsiderations(): String? = unwrap(this).getEthicalConsiderations()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AdditionalInformationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelCard.AdditionalInformationProperty):
          AdditionalInformationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          AdditionalInformationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: AdditionalInformationProperty):
          software.amazon.awscdk.services.sagemaker.CfnModelCard.AdditionalInformationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnModelCard.AdditionalInformationProperty
    }
  }

  /**
   * Information about the user who created or modified an experiment, trial, trial component,
   * lineage group, project, or model card.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sagemaker.*;
   * UserContextProperty userContextProperty = UserContextProperty.builder()
   * .domainId("domainId")
   * .userProfileArn("userProfileArn")
   * .userProfileName("userProfileName")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelcard-usercontext.html)
   */
  public interface UserContextProperty {
    /**
     * The domain associated with the user.
     *
     * Default: - "UnsetValue"
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelcard-usercontext.html#cfn-sagemaker-modelcard-usercontext-domainid)
     */
    public fun domainId(): String? = unwrap(this).getDomainId()

    /**
     * The Amazon Resource Name (ARN) of the user's profile.
     *
     * Default: - "UnsetValue"
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelcard-usercontext.html#cfn-sagemaker-modelcard-usercontext-userprofilearn)
     */
    public fun userProfileArn(): String? = unwrap(this).getUserProfileArn()

    /**
     * The name of the user's profile.
     *
     * Default: - "UnsetValue"
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelcard-usercontext.html#cfn-sagemaker-modelcard-usercontext-userprofilename)
     */
    public fun userProfileName(): String? = unwrap(this).getUserProfileName()

    /**
     * A builder for [UserContextProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param domainId The domain associated with the user.
       */
      public fun domainId(domainId: String)

      /**
       * @param userProfileArn The Amazon Resource Name (ARN) of the user's profile.
       */
      public fun userProfileArn(userProfileArn: String)

      /**
       * @param userProfileName The name of the user's profile.
       */
      public fun userProfileName(userProfileName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnModelCard.UserContextProperty.Builder =
          software.amazon.awscdk.services.sagemaker.CfnModelCard.UserContextProperty.builder()

      /**
       * @param domainId The domain associated with the user.
       */
      override fun domainId(domainId: String) {
        cdkBuilder.domainId(domainId)
      }

      /**
       * @param userProfileArn The Amazon Resource Name (ARN) of the user's profile.
       */
      override fun userProfileArn(userProfileArn: String) {
        cdkBuilder.userProfileArn(userProfileArn)
      }

      /**
       * @param userProfileName The name of the user's profile.
       */
      override fun userProfileName(userProfileName: String) {
        cdkBuilder.userProfileName(userProfileName)
      }

      public fun build(): software.amazon.awscdk.services.sagemaker.CfnModelCard.UserContextProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnModelCard.UserContextProperty,
    ) : CdkObject(cdkObject), UserContextProperty {
      /**
       * The domain associated with the user.
       *
       * Default: - "UnsetValue"
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelcard-usercontext.html#cfn-sagemaker-modelcard-usercontext-domainid)
       */
      override fun domainId(): String? = unwrap(this).getDomainId()

      /**
       * The Amazon Resource Name (ARN) of the user's profile.
       *
       * Default: - "UnsetValue"
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelcard-usercontext.html#cfn-sagemaker-modelcard-usercontext-userprofilearn)
       */
      override fun userProfileArn(): String? = unwrap(this).getUserProfileArn()

      /**
       * The name of the user's profile.
       *
       * Default: - "UnsetValue"
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelcard-usercontext.html#cfn-sagemaker-modelcard-usercontext-userprofilename)
       */
      override fun userProfileName(): String? = unwrap(this).getUserProfileName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): UserContextProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelCard.UserContextProperty):
          UserContextProperty = CdkObjectWrappers.wrap(cdkObject) as? UserContextProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: UserContextProperty):
          software.amazon.awscdk.services.sagemaker.CfnModelCard.UserContextProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnModelCard.UserContextProperty
    }
  }

  /**
   * A hyper parameter that was configured in training the model.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sagemaker.*;
   * TrainingHyperParameterProperty trainingHyperParameterProperty =
   * TrainingHyperParameterProperty.builder()
   * .name("name")
   * .value("value")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelcard-traininghyperparameter.html)
   */
  public interface TrainingHyperParameterProperty {
    /**
     * The name of the hyper parameter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelcard-traininghyperparameter.html#cfn-sagemaker-modelcard-traininghyperparameter-name)
     */
    public fun name(): String

    /**
     * The value specified for the hyper parameter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelcard-traininghyperparameter.html#cfn-sagemaker-modelcard-traininghyperparameter-value)
     */
    public fun `value`(): String

    /**
     * A builder for [TrainingHyperParameterProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param name The name of the hyper parameter. 
       */
      public fun name(name: String)

      /**
       * @param value The value specified for the hyper parameter. 
       */
      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnModelCard.TrainingHyperParameterProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnModelCard.TrainingHyperParameterProperty.builder()

      /**
       * @param name The name of the hyper parameter. 
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      /**
       * @param value The value specified for the hyper parameter. 
       */
      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnModelCard.TrainingHyperParameterProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnModelCard.TrainingHyperParameterProperty,
    ) : CdkObject(cdkObject), TrainingHyperParameterProperty {
      /**
       * The name of the hyper parameter.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelcard-traininghyperparameter.html#cfn-sagemaker-modelcard-traininghyperparameter-name)
       */
      override fun name(): String = unwrap(this).getName()

      /**
       * The value specified for the hyper parameter.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelcard-traininghyperparameter.html#cfn-sagemaker-modelcard-traininghyperparameter-value)
       */
      override fun `value`(): String = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): TrainingHyperParameterProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelCard.TrainingHyperParameterProperty):
          TrainingHyperParameterProperty = CdkObjectWrappers.wrap(cdkObject) as?
          TrainingHyperParameterProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: TrainingHyperParameterProperty):
          software.amazon.awscdk.services.sagemaker.CfnModelCard.TrainingHyperParameterProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnModelCard.TrainingHyperParameterProperty
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
   * InferenceSpecificationProperty inferenceSpecificationProperty =
   * InferenceSpecificationProperty.builder()
   * .containers(List.of(ContainerProperty.builder()
   * .image("image")
   * // the properties below are optional
   * .modelDataUrl("modelDataUrl")
   * .nearestModelName("nearestModelName")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelcard-inferencespecification.html)
   */
  public interface InferenceSpecificationProperty {
    /**
     * The Amazon ECR registry path of the Docker image that contains the inference code.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelcard-inferencespecification.html#cfn-sagemaker-modelcard-inferencespecification-containers)
     */
    public fun containers(): Any

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
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnModelCard.InferenceSpecificationProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnModelCard.InferenceSpecificationProperty.builder()

      /**
       * @param containers The Amazon ECR registry path of the Docker image that contains the
       * inference code. 
       */
      override fun containers(containers: IResolvable) {
        cdkBuilder.containers(containers.let(IResolvable::unwrap))
      }

      /**
       * @param containers The Amazon ECR registry path of the Docker image that contains the
       * inference code. 
       */
      override fun containers(containers: List<Any>) {
        cdkBuilder.containers(containers)
      }

      /**
       * @param containers The Amazon ECR registry path of the Docker image that contains the
       * inference code. 
       */
      override fun containers(vararg containers: Any): Unit = containers(containers.toList())

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnModelCard.InferenceSpecificationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnModelCard.InferenceSpecificationProperty,
    ) : CdkObject(cdkObject), InferenceSpecificationProperty {
      /**
       * The Amazon ECR registry path of the Docker image that contains the inference code.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelcard-inferencespecification.html#cfn-sagemaker-modelcard-inferencespecification-containers)
       */
      override fun containers(): Any = unwrap(this).getContainers()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): InferenceSpecificationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelCard.InferenceSpecificationProperty):
          InferenceSpecificationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          InferenceSpecificationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: InferenceSpecificationProperty):
          software.amazon.awscdk.services.sagemaker.CfnModelCard.InferenceSpecificationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnModelCard.InferenceSpecificationProperty
    }
  }

  /**
   * An overview of a model's inference environment.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sagemaker.*;
   * InferenceEnvironmentProperty inferenceEnvironmentProperty =
   * InferenceEnvironmentProperty.builder()
   * .containerImage(List.of("containerImage"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelcard-inferenceenvironment.html)
   */
  public interface InferenceEnvironmentProperty {
    /**
     * The container used to run the inference environment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelcard-inferenceenvironment.html#cfn-sagemaker-modelcard-inferenceenvironment-containerimage)
     */
    public fun containerImage(): List<String> = unwrap(this).getContainerImage() ?: emptyList()

    /**
     * A builder for [InferenceEnvironmentProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param containerImage The container used to run the inference environment.
       */
      public fun containerImage(containerImage: List<String>)

      /**
       * @param containerImage The container used to run the inference environment.
       */
      public fun containerImage(vararg containerImage: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnModelCard.InferenceEnvironmentProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnModelCard.InferenceEnvironmentProperty.builder()

      /**
       * @param containerImage The container used to run the inference environment.
       */
      override fun containerImage(containerImage: List<String>) {
        cdkBuilder.containerImage(containerImage)
      }

      /**
       * @param containerImage The container used to run the inference environment.
       */
      override fun containerImage(vararg containerImage: String): Unit =
          containerImage(containerImage.toList())

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnModelCard.InferenceEnvironmentProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnModelCard.InferenceEnvironmentProperty,
    ) : CdkObject(cdkObject), InferenceEnvironmentProperty {
      /**
       * The container used to run the inference environment.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelcard-inferenceenvironment.html#cfn-sagemaker-modelcard-inferenceenvironment-containerimage)
       */
      override fun containerImage(): List<String> = unwrap(this).getContainerImage() ?: emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): InferenceEnvironmentProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelCard.InferenceEnvironmentProperty):
          InferenceEnvironmentProperty = CdkObjectWrappers.wrap(cdkObject) as?
          InferenceEnvironmentProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: InferenceEnvironmentProperty):
          software.amazon.awscdk.services.sagemaker.CfnModelCard.InferenceEnvironmentProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnModelCard.InferenceEnvironmentProperty
    }
  }
}
