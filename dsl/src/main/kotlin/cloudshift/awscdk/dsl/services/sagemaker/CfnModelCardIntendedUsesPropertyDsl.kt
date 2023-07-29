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
import kotlin.String
import software.amazon.awscdk.services.sagemaker.CfnModelCard

/**
 * The intended uses of a model.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sagemaker.*;
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
@CdkDslMarker
public class CfnModelCardIntendedUsesPropertyDsl {
    private val cdkBuilder: CfnModelCard.IntendedUsesProperty.Builder =
        CfnModelCard.IntendedUsesProperty.builder()

    /**
     * @param explanationsForRiskRating An explanation of why your organization categorizes the
     *   model with its risk rating.
     */
    public fun explanationsForRiskRating(explanationsForRiskRating: String) {
        cdkBuilder.explanationsForRiskRating(explanationsForRiskRating)
    }

    /** @param factorsAffectingModelEfficiency Factors affecting model efficacy. */
    public fun factorsAffectingModelEfficiency(factorsAffectingModelEfficiency: String) {
        cdkBuilder.factorsAffectingModelEfficiency(factorsAffectingModelEfficiency)
    }

    /** @param intendedUses The intended use cases for the model. */
    public fun intendedUses(intendedUses: String) {
        cdkBuilder.intendedUses(intendedUses)
    }

    /** @param purposeOfModel The general purpose of the model. */
    public fun purposeOfModel(purposeOfModel: String) {
        cdkBuilder.purposeOfModel(purposeOfModel)
    }

    /**
     * @param riskRating Your organization's risk rating. You can specify one the following values
     *   as the risk rating:.
     * * High
     * * Medium
     * * Low
     * * Unknown
     */
    public fun riskRating(riskRating: String) {
        cdkBuilder.riskRating(riskRating)
    }

    public fun build(): CfnModelCard.IntendedUsesProperty = cdkBuilder.build()
}
