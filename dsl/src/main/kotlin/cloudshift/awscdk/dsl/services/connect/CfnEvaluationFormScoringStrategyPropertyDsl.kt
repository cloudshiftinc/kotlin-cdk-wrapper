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

package cloudshift.awscdk.dsl.services.connect

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.connect.CfnEvaluationForm

/**
 * A scoring strategy of the evaluation form.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.connect.*;
 * ScoringStrategyProperty scoringStrategyProperty = ScoringStrategyProperty.builder()
 * .mode("mode")
 * .status("status")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-evaluationform-scoringstrategy.html)
 */
@CdkDslMarker
public class CfnEvaluationFormScoringStrategyPropertyDsl {
    private val cdkBuilder: CfnEvaluationForm.ScoringStrategyProperty.Builder =
        CfnEvaluationForm.ScoringStrategyProperty.builder()

    /**
     * @param mode The scoring mode of the evaluation form. *Allowed values* : `QUESTION_ONLY` |
     *   `SECTION_ONLY`
     */
    public fun mode(mode: String) {
        cdkBuilder.mode(mode)
    }

    /**
     * @param status The scoring status of the evaluation form. *Allowed values* : `ENABLED` |
     *   `DISABLED`
     */
    public fun status(status: String) {
        cdkBuilder.status(status)
    }

    public fun build(): CfnEvaluationForm.ScoringStrategyProperty = cdkBuilder.build()
}
