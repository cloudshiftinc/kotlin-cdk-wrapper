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

package cloudshift.awscdk.dsl.services.personalize

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.personalize.CfnSolution

/**
 * Provides the name and range of an integer-valued hyperparameter.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.personalize.*;
 * IntegerHyperParameterRangeProperty integerHyperParameterRangeProperty =
 * IntegerHyperParameterRangeProperty.builder()
 * .maxValue(123)
 * .minValue(123)
 * .name("name")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-personalize-solution-integerhyperparameterrange.html)
 */
@CdkDslMarker
public class CfnSolutionIntegerHyperParameterRangePropertyDsl {
    private val cdkBuilder: CfnSolution.IntegerHyperParameterRangeProperty.Builder =
        CfnSolution.IntegerHyperParameterRangeProperty.builder()

    /** @param maxValue The maximum allowable value for the hyperparameter. */
    public fun maxValue(maxValue: Number) {
        cdkBuilder.maxValue(maxValue)
    }

    /** @param minValue The minimum allowable value for the hyperparameter. */
    public fun minValue(minValue: Number) {
        cdkBuilder.minValue(minValue)
    }

    /** @param name The name of the hyperparameter. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun build(): CfnSolution.IntegerHyperParameterRangeProperty = cdkBuilder.build()
}
