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
import kotlin.String
import software.amazon.awscdk.services.personalize.CfnSolution

/**
 * The metric to optimize during hyperparameter optimization (HPO).
 *
 * Amazon Personalize doesn't support configuring the `hpoObjective` at this time.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.personalize.*;
 * HpoObjectiveProperty hpoObjectiveProperty = HpoObjectiveProperty.builder()
 * .metricName("metricName")
 * .metricRegex("metricRegex")
 * .type("type")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-personalize-solution-hpoobjective.html)
 */
@CdkDslMarker
public class CfnSolutionHpoObjectivePropertyDsl {
    private val cdkBuilder: CfnSolution.HpoObjectiveProperty.Builder =
        CfnSolution.HpoObjectiveProperty.builder()

    /** @param metricName The name of the metric. */
    public fun metricName(metricName: String) {
        cdkBuilder.metricName(metricName)
    }

    /** @param metricRegex A regular expression for finding the metric in the training job logs. */
    public fun metricRegex(metricRegex: String) {
        cdkBuilder.metricRegex(metricRegex)
    }

    /** @param type The type of the metric. Valid values are `Maximize` and `Minimize` . */
    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    public fun build(): CfnSolution.HpoObjectiveProperty = cdkBuilder.build()
}
