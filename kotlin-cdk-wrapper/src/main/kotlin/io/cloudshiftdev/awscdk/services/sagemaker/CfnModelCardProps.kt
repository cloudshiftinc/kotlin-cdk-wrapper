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
 * Properties for defining a `CfnModelCard`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.sagemaker.*;
 * Object value;
 * CfnModelCardProps cfnModelCardProps = CfnModelCardProps.builder()
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
public interface CfnModelCardProps {
  /**
   * The content of the model card.
   *
   * Content uses the [model card JSON
   * schema](https://docs.aws.amazon.com/sagemaker/latest/dg/model-cards.html#model-cards-json-schema)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelcard.html#cfn-sagemaker-modelcard-content)
   */
  public fun content(): Any

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
   */
  public fun createdBy(): Any? = unwrap(this).getCreatedBy()

  /**
   * Information about the user who created or modified an experiment, trial, trial component,
   * lineage group, project, or model card.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelcard.html#cfn-sagemaker-modelcard-lastmodifiedby)
   */
  public fun lastModifiedBy(): Any? = unwrap(this).getLastModifiedBy()

  /**
   * The unique name of the model card.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelcard.html#cfn-sagemaker-modelcard-modelcardname)
   */
  public fun modelCardName(): String

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
   */
  public fun modelCardStatus(): String

  /**
   * The security configuration used to protect model card data.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelcard.html#cfn-sagemaker-modelcard-securityconfig)
   */
  public fun securityConfig(): Any? = unwrap(this).getSecurityConfig()

  /**
   * Key-value pairs used to manage metadata for the model card.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelcard.html#cfn-sagemaker-modelcard-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnModelCardProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param content The content of the model card. 
     * Content uses the [model card JSON
     * schema](https://docs.aws.amazon.com/sagemaker/latest/dg/model-cards.html#model-cards-json-schema)
     * .
     */
    public fun content(content: IResolvable)

    /**
     * @param content The content of the model card. 
     * Content uses the [model card JSON
     * schema](https://docs.aws.amazon.com/sagemaker/latest/dg/model-cards.html#model-cards-json-schema)
     * .
     */
    public fun content(content: CfnModelCard.ContentProperty)

    /**
     * @param content The content of the model card. 
     * Content uses the [model card JSON
     * schema](https://docs.aws.amazon.com/sagemaker/latest/dg/model-cards.html#model-cards-json-schema)
     * .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6b787bed0a518b924e77e6194ca0d59dea0a2c58ddf6c8d3a40bfffb128cc05a")
    public fun content(content: CfnModelCard.ContentProperty.Builder.() -> Unit)

    /**
     * @param createdBy Information about the user who created or modified one or more of the
     * following:.
     * * Experiment
     * * Trial
     * * Trial component
     * * Lineage group
     * * Project
     * * Model Card
     */
    public fun createdBy(createdBy: IResolvable)

    /**
     * @param createdBy Information about the user who created or modified one or more of the
     * following:.
     * * Experiment
     * * Trial
     * * Trial component
     * * Lineage group
     * * Project
     * * Model Card
     */
    public fun createdBy(createdBy: CfnModelCard.UserContextProperty)

    /**
     * @param createdBy Information about the user who created or modified one or more of the
     * following:.
     * * Experiment
     * * Trial
     * * Trial component
     * * Lineage group
     * * Project
     * * Model Card
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("491fd0e42429692b9fb81d3e6a5be0858e9a8b73a17e1d43f98ed8152799ffb4")
    public fun createdBy(createdBy: CfnModelCard.UserContextProperty.Builder.() -> Unit)

    /**
     * @param lastModifiedBy Information about the user who created or modified an experiment,
     * trial, trial component, lineage group, project, or model card.
     */
    public fun lastModifiedBy(lastModifiedBy: IResolvable)

    /**
     * @param lastModifiedBy Information about the user who created or modified an experiment,
     * trial, trial component, lineage group, project, or model card.
     */
    public fun lastModifiedBy(lastModifiedBy: CfnModelCard.UserContextProperty)

    /**
     * @param lastModifiedBy Information about the user who created or modified an experiment,
     * trial, trial component, lineage group, project, or model card.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9a5445b0fc2a1eeea9c1bc547d41ab5386b90909513ee8c0dda09a4038e31c6f")
    public fun lastModifiedBy(lastModifiedBy: CfnModelCard.UserContextProperty.Builder.() -> Unit)

    /**
     * @param modelCardName The unique name of the model card. 
     */
    public fun modelCardName(modelCardName: String)

    /**
     * @param modelCardStatus The approval status of the model card within your organization. 
     * Different organizations might have different criteria for model card review and approval.
     *
     * * `Draft` : The model card is a work in progress.
     * * `PendingReview` : The model card is pending review.
     * * `Approved` : The model card is approved.
     * * `Archived` : The model card is archived. No more updates should be made to the model card,
     * but it can still be exported.
     */
    public fun modelCardStatus(modelCardStatus: String)

    /**
     * @param securityConfig The security configuration used to protect model card data.
     */
    public fun securityConfig(securityConfig: IResolvable)

    /**
     * @param securityConfig The security configuration used to protect model card data.
     */
    public fun securityConfig(securityConfig: CfnModelCard.SecurityConfigProperty)

    /**
     * @param securityConfig The security configuration used to protect model card data.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d25b7f117423e73978e08063e13b913edc95ac36f66dc3701da2bd1c4aca4de6")
    public
        fun securityConfig(securityConfig: CfnModelCard.SecurityConfigProperty.Builder.() -> Unit)

    /**
     * @param tags Key-value pairs used to manage metadata for the model card.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags Key-value pairs used to manage metadata for the model card.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.sagemaker.CfnModelCardProps.Builder =
        software.amazon.awscdk.services.sagemaker.CfnModelCardProps.builder()

    /**
     * @param content The content of the model card. 
     * Content uses the [model card JSON
     * schema](https://docs.aws.amazon.com/sagemaker/latest/dg/model-cards.html#model-cards-json-schema)
     * .
     */
    override fun content(content: IResolvable) {
      cdkBuilder.content(content.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param content The content of the model card. 
     * Content uses the [model card JSON
     * schema](https://docs.aws.amazon.com/sagemaker/latest/dg/model-cards.html#model-cards-json-schema)
     * .
     */
    override fun content(content: CfnModelCard.ContentProperty) {
      cdkBuilder.content(content.let(CfnModelCard.ContentProperty.Companion::unwrap))
    }

    /**
     * @param content The content of the model card. 
     * Content uses the [model card JSON
     * schema](https://docs.aws.amazon.com/sagemaker/latest/dg/model-cards.html#model-cards-json-schema)
     * .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6b787bed0a518b924e77e6194ca0d59dea0a2c58ddf6c8d3a40bfffb128cc05a")
    override fun content(content: CfnModelCard.ContentProperty.Builder.() -> Unit): Unit =
        content(CfnModelCard.ContentProperty(content))

    /**
     * @param createdBy Information about the user who created or modified one or more of the
     * following:.
     * * Experiment
     * * Trial
     * * Trial component
     * * Lineage group
     * * Project
     * * Model Card
     */
    override fun createdBy(createdBy: IResolvable) {
      cdkBuilder.createdBy(createdBy.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param createdBy Information about the user who created or modified one or more of the
     * following:.
     * * Experiment
     * * Trial
     * * Trial component
     * * Lineage group
     * * Project
     * * Model Card
     */
    override fun createdBy(createdBy: CfnModelCard.UserContextProperty) {
      cdkBuilder.createdBy(createdBy.let(CfnModelCard.UserContextProperty.Companion::unwrap))
    }

    /**
     * @param createdBy Information about the user who created or modified one or more of the
     * following:.
     * * Experiment
     * * Trial
     * * Trial component
     * * Lineage group
     * * Project
     * * Model Card
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("491fd0e42429692b9fb81d3e6a5be0858e9a8b73a17e1d43f98ed8152799ffb4")
    override fun createdBy(createdBy: CfnModelCard.UserContextProperty.Builder.() -> Unit): Unit =
        createdBy(CfnModelCard.UserContextProperty(createdBy))

    /**
     * @param lastModifiedBy Information about the user who created or modified an experiment,
     * trial, trial component, lineage group, project, or model card.
     */
    override fun lastModifiedBy(lastModifiedBy: IResolvable) {
      cdkBuilder.lastModifiedBy(lastModifiedBy.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param lastModifiedBy Information about the user who created or modified an experiment,
     * trial, trial component, lineage group, project, or model card.
     */
    override fun lastModifiedBy(lastModifiedBy: CfnModelCard.UserContextProperty) {
      cdkBuilder.lastModifiedBy(lastModifiedBy.let(CfnModelCard.UserContextProperty.Companion::unwrap))
    }

    /**
     * @param lastModifiedBy Information about the user who created or modified an experiment,
     * trial, trial component, lineage group, project, or model card.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9a5445b0fc2a1eeea9c1bc547d41ab5386b90909513ee8c0dda09a4038e31c6f")
    override
        fun lastModifiedBy(lastModifiedBy: CfnModelCard.UserContextProperty.Builder.() -> Unit):
        Unit = lastModifiedBy(CfnModelCard.UserContextProperty(lastModifiedBy))

    /**
     * @param modelCardName The unique name of the model card. 
     */
    override fun modelCardName(modelCardName: String) {
      cdkBuilder.modelCardName(modelCardName)
    }

    /**
     * @param modelCardStatus The approval status of the model card within your organization. 
     * Different organizations might have different criteria for model card review and approval.
     *
     * * `Draft` : The model card is a work in progress.
     * * `PendingReview` : The model card is pending review.
     * * `Approved` : The model card is approved.
     * * `Archived` : The model card is archived. No more updates should be made to the model card,
     * but it can still be exported.
     */
    override fun modelCardStatus(modelCardStatus: String) {
      cdkBuilder.modelCardStatus(modelCardStatus)
    }

    /**
     * @param securityConfig The security configuration used to protect model card data.
     */
    override fun securityConfig(securityConfig: IResolvable) {
      cdkBuilder.securityConfig(securityConfig.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param securityConfig The security configuration used to protect model card data.
     */
    override fun securityConfig(securityConfig: CfnModelCard.SecurityConfigProperty) {
      cdkBuilder.securityConfig(securityConfig.let(CfnModelCard.SecurityConfigProperty.Companion::unwrap))
    }

    /**
     * @param securityConfig The security configuration used to protect model card data.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d25b7f117423e73978e08063e13b913edc95ac36f66dc3701da2bd1c4aca4de6")
    override
        fun securityConfig(securityConfig: CfnModelCard.SecurityConfigProperty.Builder.() -> Unit):
        Unit = securityConfig(CfnModelCard.SecurityConfigProperty(securityConfig))

    /**
     * @param tags Key-value pairs used to manage metadata for the model card.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags Key-value pairs used to manage metadata for the model card.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.sagemaker.CfnModelCardProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelCardProps,
  ) : CdkObject(cdkObject),
      CfnModelCardProps {
    /**
     * The content of the model card.
     *
     * Content uses the [model card JSON
     * schema](https://docs.aws.amazon.com/sagemaker/latest/dg/model-cards.html#model-cards-json-schema)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelcard.html#cfn-sagemaker-modelcard-content)
     */
    override fun content(): Any = unwrap(this).getContent()

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
     */
    override fun createdBy(): Any? = unwrap(this).getCreatedBy()

    /**
     * Information about the user who created or modified an experiment, trial, trial component,
     * lineage group, project, or model card.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelcard.html#cfn-sagemaker-modelcard-lastmodifiedby)
     */
    override fun lastModifiedBy(): Any? = unwrap(this).getLastModifiedBy()

    /**
     * The unique name of the model card.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelcard.html#cfn-sagemaker-modelcard-modelcardname)
     */
    override fun modelCardName(): String = unwrap(this).getModelCardName()

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
     */
    override fun modelCardStatus(): String = unwrap(this).getModelCardStatus()

    /**
     * The security configuration used to protect model card data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelcard.html#cfn-sagemaker-modelcard-securityconfig)
     */
    override fun securityConfig(): Any? = unwrap(this).getSecurityConfig()

    /**
     * Key-value pairs used to manage metadata for the model card.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelcard.html#cfn-sagemaker-modelcard-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnModelCardProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelCardProps):
        CfnModelCardProps = CdkObjectWrappers.wrap(cdkObject) as? CfnModelCardProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnModelCardProps):
        software.amazon.awscdk.services.sagemaker.CfnModelCardProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.sagemaker.CfnModelCardProps
  }
}
