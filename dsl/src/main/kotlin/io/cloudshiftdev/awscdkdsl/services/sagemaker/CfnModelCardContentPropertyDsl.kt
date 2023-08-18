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

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sagemaker.CfnModelCard

/**
 * The content of the model card.
 *
 * It follows the
 * [model card json schema](https://docs.aws.amazon.com/sagemaker/latest/dg/model-cards.html#model-cards-json-schema)
 * .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sagemaker.*;
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
@CdkDslMarker
public class CfnModelCardContentPropertyDsl {
    private val cdkBuilder: CfnModelCard.ContentProperty.Builder =
        CfnModelCard.ContentProperty.builder()

    private val _evaluationDetails: MutableList<Any> = mutableListOf()

    /** @param additionalInformation Additional information about the model. */
    public fun additionalInformation(additionalInformation: IResolvable) {
        cdkBuilder.additionalInformation(additionalInformation)
    }

    /** @param additionalInformation Additional information about the model. */
    public fun additionalInformation(
        additionalInformation: CfnModelCard.AdditionalInformationProperty
    ) {
        cdkBuilder.additionalInformation(additionalInformation)
    }

    /** @param businessDetails Information about how the model supports business goals. */
    public fun businessDetails(businessDetails: IResolvable) {
        cdkBuilder.businessDetails(businessDetails)
    }

    /** @param businessDetails Information about how the model supports business goals. */
    public fun businessDetails(businessDetails: CfnModelCard.BusinessDetailsProperty) {
        cdkBuilder.businessDetails(businessDetails)
    }

    /** @param evaluationDetails An overview about the model's evaluation. */
    public fun evaluationDetails(vararg evaluationDetails: Any) {
        _evaluationDetails.addAll(listOf(*evaluationDetails))
    }

    /** @param evaluationDetails An overview about the model's evaluation. */
    public fun evaluationDetails(evaluationDetails: Collection<Any>) {
        _evaluationDetails.addAll(evaluationDetails)
    }

    /** @param evaluationDetails An overview about the model's evaluation. */
    public fun evaluationDetails(evaluationDetails: IResolvable) {
        cdkBuilder.evaluationDetails(evaluationDetails)
    }

    /** @param intendedUses The intended usage of the model. */
    public fun intendedUses(intendedUses: IResolvable) {
        cdkBuilder.intendedUses(intendedUses)
    }

    /** @param intendedUses The intended usage of the model. */
    public fun intendedUses(intendedUses: CfnModelCard.IntendedUsesProperty) {
        cdkBuilder.intendedUses(intendedUses)
    }

    /** @param modelOverview An overview about the model. */
    public fun modelOverview(modelOverview: IResolvable) {
        cdkBuilder.modelOverview(modelOverview)
    }

    /** @param modelOverview An overview about the model. */
    public fun modelOverview(modelOverview: CfnModelCard.ModelOverviewProperty) {
        cdkBuilder.modelOverview(modelOverview)
    }

    /** @param modelPackageDetails Metadata information related to model package version. */
    public fun modelPackageDetails(modelPackageDetails: IResolvable) {
        cdkBuilder.modelPackageDetails(modelPackageDetails)
    }

    /** @param modelPackageDetails Metadata information related to model package version. */
    public fun modelPackageDetails(modelPackageDetails: CfnModelCard.ModelPackageDetailsProperty) {
        cdkBuilder.modelPackageDetails(modelPackageDetails)
    }

    /** @param trainingDetails An overview about model training. */
    public fun trainingDetails(trainingDetails: IResolvable) {
        cdkBuilder.trainingDetails(trainingDetails)
    }

    /** @param trainingDetails An overview about model training. */
    public fun trainingDetails(trainingDetails: CfnModelCard.TrainingDetailsProperty) {
        cdkBuilder.trainingDetails(trainingDetails)
    }

    public fun build(): CfnModelCard.ContentProperty {
        if (_evaluationDetails.isNotEmpty()) cdkBuilder.evaluationDetails(_evaluationDetails)
        return cdkBuilder.build()
    }
}
