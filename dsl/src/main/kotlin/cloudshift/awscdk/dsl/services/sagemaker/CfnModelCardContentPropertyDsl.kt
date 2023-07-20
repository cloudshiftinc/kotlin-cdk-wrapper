@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sagemaker.CfnModelCard
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnModelCardContentPropertyDsl {
    private val cdkBuilder: CfnModelCard.ContentProperty.Builder =
        CfnModelCard.ContentProperty.builder()

    private val _evaluationDetails: MutableList<Any> = mutableListOf()

    public fun additionalInformation(additionalInformation: IResolvable) {
        cdkBuilder.additionalInformation(additionalInformation)
    }

    public fun additionalInformation(additionalInformation: CfnModelCard.AdditionalInformationProperty) {
        cdkBuilder.additionalInformation(additionalInformation)
    }

    public fun businessDetails(businessDetails: IResolvable) {
        cdkBuilder.businessDetails(businessDetails)
    }

    public fun businessDetails(businessDetails: CfnModelCard.BusinessDetailsProperty) {
        cdkBuilder.businessDetails(businessDetails)
    }

    public fun evaluationDetails(vararg evaluationDetails: Any) {
        _evaluationDetails.addAll(listOf(*evaluationDetails))
    }

    public fun evaluationDetails(evaluationDetails: Collection<Any>) {
        _evaluationDetails.addAll(evaluationDetails)
    }

    public fun evaluationDetails(evaluationDetails: IResolvable) {
        cdkBuilder.evaluationDetails(evaluationDetails)
    }

    public fun intendedUses(intendedUses: IResolvable) {
        cdkBuilder.intendedUses(intendedUses)
    }

    public fun intendedUses(intendedUses: CfnModelCard.IntendedUsesProperty) {
        cdkBuilder.intendedUses(intendedUses)
    }

    public fun modelOverview(modelOverview: IResolvable) {
        cdkBuilder.modelOverview(modelOverview)
    }

    public fun modelOverview(modelOverview: CfnModelCard.ModelOverviewProperty) {
        cdkBuilder.modelOverview(modelOverview)
    }

    public fun modelPackageDetails(modelPackageDetails: IResolvable) {
        cdkBuilder.modelPackageDetails(modelPackageDetails)
    }

    public fun modelPackageDetails(modelPackageDetails: CfnModelCard.ModelPackageDetailsProperty) {
        cdkBuilder.modelPackageDetails(modelPackageDetails)
    }

    public fun trainingDetails(trainingDetails: IResolvable) {
        cdkBuilder.trainingDetails(trainingDetails)
    }

    public fun trainingDetails(trainingDetails: CfnModelCard.TrainingDetailsProperty) {
        cdkBuilder.trainingDetails(trainingDetails)
    }

    public fun build(): CfnModelCard.ContentProperty {
        if (_evaluationDetails.isNotEmpty()) cdkBuilder.evaluationDetails(_evaluationDetails)
        return cdkBuilder.build()
    }
}
