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
public class CfnEvaluationFormEvaluationFormQuestionPropertyDsl {
    private val cdkBuilder: CfnEvaluationForm.EvaluationFormQuestionProperty.Builder =
        CfnEvaluationForm.EvaluationFormQuestionProperty.builder()

    public fun instructions(instructions: String) {
        cdkBuilder.instructions(instructions)
    }

    public fun notApplicableEnabled(notApplicableEnabled: Boolean) {
        cdkBuilder.notApplicableEnabled(notApplicableEnabled)
    }

    public fun notApplicableEnabled(notApplicableEnabled: IResolvable) {
        cdkBuilder.notApplicableEnabled(notApplicableEnabled)
    }

    public fun questionType(questionType: String) {
        cdkBuilder.questionType(questionType)
    }

    public fun questionTypeProperties(questionTypeProperties: IResolvable) {
        cdkBuilder.questionTypeProperties(questionTypeProperties)
    }

    public fun questionTypeProperties(questionTypeProperties: CfnEvaluationForm.EvaluationFormQuestionTypePropertiesProperty) {
        cdkBuilder.questionTypeProperties(questionTypeProperties)
    }

    public fun refId(refId: String) {
        cdkBuilder.refId(refId)
    }

    public fun title(title: String) {
        cdkBuilder.title(title)
    }

    public fun weight(weight: Number) {
        cdkBuilder.weight(weight)
    }

    public fun build(): CfnEvaluationForm.EvaluationFormQuestionProperty = cdkBuilder.build()
}
