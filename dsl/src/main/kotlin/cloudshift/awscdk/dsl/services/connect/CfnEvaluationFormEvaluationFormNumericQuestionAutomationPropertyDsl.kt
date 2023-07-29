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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.connect.CfnEvaluationForm

/**
 * Information about the automation configuration in numeric questions.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.connect.*;
 * EvaluationFormNumericQuestionAutomationProperty evaluationFormNumericQuestionAutomationProperty =
 * EvaluationFormNumericQuestionAutomationProperty.builder()
 * .propertyValue(NumericQuestionPropertyValueAutomationProperty.builder()
 * .label("label")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-evaluationform-evaluationformnumericquestionautomation.html)
 */
@CdkDslMarker
public class CfnEvaluationFormEvaluationFormNumericQuestionAutomationPropertyDsl {
    private val cdkBuilder:
        CfnEvaluationForm.EvaluationFormNumericQuestionAutomationProperty.Builder =
        CfnEvaluationForm.EvaluationFormNumericQuestionAutomationProperty.builder()

    /** @param propertyValue The property value of the automation. */
    public fun propertyValue(propertyValue: IResolvable) {
        cdkBuilder.propertyValue(propertyValue)
    }

    /** @param propertyValue The property value of the automation. */
    public fun propertyValue(
        propertyValue: CfnEvaluationForm.NumericQuestionPropertyValueAutomationProperty
    ) {
        cdkBuilder.propertyValue(propertyValue)
    }

    public fun build(): CfnEvaluationForm.EvaluationFormNumericQuestionAutomationProperty =
        cdkBuilder.build()
}
