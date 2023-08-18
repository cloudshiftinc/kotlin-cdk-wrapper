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

package io.cloudshiftdev.awscdkdsl.services.connect

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.connect.CfnEvaluationForm

/**
 * The automation options of the single select question.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.connect.*;
 * EvaluationFormSingleSelectQuestionAutomationOptionProperty
 * evaluationFormSingleSelectQuestionAutomationOptionProperty =
 * EvaluationFormSingleSelectQuestionAutomationOptionProperty.builder()
 * .ruleCategory(SingleSelectQuestionRuleCategoryAutomationProperty.builder()
 * .category("category")
 * .condition("condition")
 * .optionRefId("optionRefId")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-evaluationform-evaluationformsingleselectquestionautomationoption.html)
 */
@CdkDslMarker
public class CfnEvaluationFormEvaluationFormSingleSelectQuestionAutomationOptionPropertyDsl {
    private val cdkBuilder:
        CfnEvaluationForm.EvaluationFormSingleSelectQuestionAutomationOptionProperty.Builder =
        CfnEvaluationForm.EvaluationFormSingleSelectQuestionAutomationOptionProperty.builder()

    /**
     * @param ruleCategory The automation option based on a rule category for the single select
     *   question.
     */
    public fun ruleCategory(ruleCategory: IResolvable) {
        cdkBuilder.ruleCategory(ruleCategory)
    }

    /**
     * @param ruleCategory The automation option based on a rule category for the single select
     *   question.
     */
    public fun ruleCategory(
        ruleCategory: CfnEvaluationForm.SingleSelectQuestionRuleCategoryAutomationProperty
    ) {
        cdkBuilder.ruleCategory(ruleCategory)
    }

    public fun build():
        CfnEvaluationForm.EvaluationFormSingleSelectQuestionAutomationOptionProperty =
        cdkBuilder.build()
}
