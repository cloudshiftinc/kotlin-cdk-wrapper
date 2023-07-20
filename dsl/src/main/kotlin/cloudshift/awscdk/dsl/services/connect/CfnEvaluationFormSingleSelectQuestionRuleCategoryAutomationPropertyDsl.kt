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

package cloudshift.awscdk.dsl.services.connect

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.connect.CfnEvaluationForm
import kotlin.String

@CdkDslMarker
public class CfnEvaluationFormSingleSelectQuestionRuleCategoryAutomationPropertyDsl {
    private val cdkBuilder:
        CfnEvaluationForm.SingleSelectQuestionRuleCategoryAutomationProperty.Builder =
        CfnEvaluationForm.SingleSelectQuestionRuleCategoryAutomationProperty.builder()

    public fun category(category: String) {
        cdkBuilder.category(category)
    }

    public fun condition(condition: String) {
        cdkBuilder.condition(condition)
    }

    public fun optionRefId(optionRefId: String) {
        cdkBuilder.optionRefId(optionRefId)
    }

    public fun build(): CfnEvaluationForm.SingleSelectQuestionRuleCategoryAutomationProperty =
        cdkBuilder.build()
}
