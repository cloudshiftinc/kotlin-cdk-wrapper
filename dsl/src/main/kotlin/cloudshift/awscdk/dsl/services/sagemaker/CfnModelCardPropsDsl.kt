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

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sagemaker.CfnModelCard
import software.amazon.awscdk.services.sagemaker.CfnModelCardProps

/**
 * Properties for defining a `CfnModelCard`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sagemaker.*;
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
@CdkDslMarker
public class CfnModelCardPropsDsl {
    private val cdkBuilder: CfnModelCardProps.Builder = CfnModelCardProps.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * @param content The content of the model card. Content uses the
     *   [model card JSON schema](https://docs.aws.amazon.com/sagemaker/latest/dg/model-cards.html#model-cards-json-schema)
     *   .
     */
    public fun content(content: IResolvable) {
        cdkBuilder.content(content)
    }

    /**
     * @param content The content of the model card. Content uses the
     *   [model card JSON schema](https://docs.aws.amazon.com/sagemaker/latest/dg/model-cards.html#model-cards-json-schema)
     *   .
     */
    public fun content(content: CfnModelCard.ContentProperty) {
        cdkBuilder.content(content)
    }

    /**
     * @param createdBy Information about the user who created or modified one or more of the
     *   following:.
     * * Experiment
     * * Trial
     * * Trial component
     * * Lineage group
     * * Project
     * * Model Card
     */
    public fun createdBy(createdBy: IResolvable) {
        cdkBuilder.createdBy(createdBy)
    }

    /**
     * @param createdBy Information about the user who created or modified one or more of the
     *   following:.
     * * Experiment
     * * Trial
     * * Trial component
     * * Lineage group
     * * Project
     * * Model Card
     */
    public fun createdBy(createdBy: CfnModelCard.UserContextProperty) {
        cdkBuilder.createdBy(createdBy)
    }

    /**
     * @param lastModifiedBy Information about the user who created or modified an experiment,
     *   trial, trial component, lineage group, project, or model card.
     */
    public fun lastModifiedBy(lastModifiedBy: IResolvable) {
        cdkBuilder.lastModifiedBy(lastModifiedBy)
    }

    /**
     * @param lastModifiedBy Information about the user who created or modified an experiment,
     *   trial, trial component, lineage group, project, or model card.
     */
    public fun lastModifiedBy(lastModifiedBy: CfnModelCard.UserContextProperty) {
        cdkBuilder.lastModifiedBy(lastModifiedBy)
    }

    /** @param modelCardName The unique name of the model card. */
    public fun modelCardName(modelCardName: String) {
        cdkBuilder.modelCardName(modelCardName)
    }

    /**
     * @param modelCardStatus The approval status of the model card within your organization.
     *   Different organizations might have different criteria for model card review and approval.
     * * `Draft` : The model card is a work in progress.
     * * `PendingReview` : The model card is pending review.
     * * `Approved` : The model card is approved.
     * * `Archived` : The model card is archived. No more updates should be made to the model card,
     *   but it can still be exported.
     */
    public fun modelCardStatus(modelCardStatus: String) {
        cdkBuilder.modelCardStatus(modelCardStatus)
    }

    /** @param securityConfig The security configuration used to protect model card data. */
    public fun securityConfig(securityConfig: IResolvable) {
        cdkBuilder.securityConfig(securityConfig)
    }

    /** @param securityConfig The security configuration used to protect model card data. */
    public fun securityConfig(securityConfig: CfnModelCard.SecurityConfigProperty) {
        cdkBuilder.securityConfig(securityConfig)
    }

    /** @param tags Key-value pairs used to manage metadata for the model card. */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /** @param tags Key-value pairs used to manage metadata for the model card. */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnModelCardProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
