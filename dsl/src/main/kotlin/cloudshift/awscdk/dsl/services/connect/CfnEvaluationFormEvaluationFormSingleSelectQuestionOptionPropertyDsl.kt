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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.connect.CfnEvaluationForm
import kotlin.Boolean
import kotlin.Number
import kotlin.String

@CdkDslMarker
public class CfnEvaluationFormEvaluationFormSingleSelectQuestionOptionPropertyDsl {
    private val cdkBuilder: CfnEvaluationForm.EvaluationFormSingleSelectQuestionOptionProperty.Builder =
        CfnEvaluationForm.EvaluationFormSingleSelectQuestionOptionProperty.builder()

    public fun automaticFail(automaticFail: Boolean) {
        cdkBuilder.automaticFail(automaticFail)
    }

    public fun automaticFail(automaticFail: IResolvable) {
        cdkBuilder.automaticFail(automaticFail)
    }

    public fun refId(refId: String) {
        cdkBuilder.refId(refId)
    }

    public fun score(score: Number) {
        cdkBuilder.score(score)
    }

    public fun text(text: String) {
        cdkBuilder.text(text)
    }

    public fun build(): CfnEvaluationForm.EvaluationFormSingleSelectQuestionOptionProperty =
        cdkBuilder.build()
}
