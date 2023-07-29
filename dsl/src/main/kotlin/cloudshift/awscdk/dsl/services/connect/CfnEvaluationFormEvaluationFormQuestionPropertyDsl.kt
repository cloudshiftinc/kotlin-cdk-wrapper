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
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.connect.CfnEvaluationForm

/**
 * Information about a question from an evaluation form.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.connect.*;
 * EvaluationFormQuestionProperty evaluationFormQuestionProperty =
 * EvaluationFormQuestionProperty.builder()
 * .questionType("questionType")
 * .refId("refId")
 * .title("title")
 * // the properties below are optional
 * .instructions("instructions")
 * .notApplicableEnabled(false)
 * .questionTypeProperties(EvaluationFormQuestionTypePropertiesProperty.builder()
 * .numeric(EvaluationFormNumericQuestionPropertiesProperty.builder()
 * .maxValue(123)
 * .minValue(123)
 * // the properties below are optional
 * .automation(EvaluationFormNumericQuestionAutomationProperty.builder()
 * .propertyValue(NumericQuestionPropertyValueAutomationProperty.builder()
 * .label("label")
 * .build())
 * .build())
 * .options(List.of(EvaluationFormNumericQuestionOptionProperty.builder()
 * .maxValue(123)
 * .minValue(123)
 * // the properties below are optional
 * .automaticFail(false)
 * .score(123)
 * .build()))
 * .build())
 * .singleSelect(EvaluationFormSingleSelectQuestionPropertiesProperty.builder()
 * .options(List.of(EvaluationFormSingleSelectQuestionOptionProperty.builder()
 * .refId("refId")
 * .text("text")
 * // the properties below are optional
 * .automaticFail(false)
 * .score(123)
 * .build()))
 * // the properties below are optional
 * .automation(EvaluationFormSingleSelectQuestionAutomationProperty.builder()
 * .options(List.of(EvaluationFormSingleSelectQuestionAutomationOptionProperty.builder()
 * .ruleCategory(SingleSelectQuestionRuleCategoryAutomationProperty.builder()
 * .category("category")
 * .condition("condition")
 * .optionRefId("optionRefId")
 * .build())
 * .build()))
 * // the properties below are optional
 * .defaultOptionRefId("defaultOptionRefId")
 * .build())
 * .displayAs("displayAs")
 * .build())
 * .build())
 * .weight(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-evaluationform-evaluationformquestion.html)
 */
@CdkDslMarker
public class CfnEvaluationFormEvaluationFormQuestionPropertyDsl {
    private val cdkBuilder: CfnEvaluationForm.EvaluationFormQuestionProperty.Builder =
        CfnEvaluationForm.EvaluationFormQuestionProperty.builder()

    /**
     * @param instructions The instructions of the section. *Length Constraints* : Minimum length
     *   of 0. Maximum length of 1024.
     */
    public fun instructions(instructions: String) {
        cdkBuilder.instructions(instructions)
    }

    /** @param notApplicableEnabled The flag to enable not applicable answers to the question. */
    public fun notApplicableEnabled(notApplicableEnabled: Boolean) {
        cdkBuilder.notApplicableEnabled(notApplicableEnabled)
    }

    /** @param notApplicableEnabled The flag to enable not applicable answers to the question. */
    public fun notApplicableEnabled(notApplicableEnabled: IResolvable) {
        cdkBuilder.notApplicableEnabled(notApplicableEnabled)
    }

    /**
     * @param questionType The type of the question. *Allowed values* : `NUMERIC` | `SINGLESELECT` |
     *   `TEXT`
     */
    public fun questionType(questionType: String) {
        cdkBuilder.questionType(questionType)
    }

    /**
     * @param questionTypeProperties The properties of the type of question. Text questions do not
     *   have to define question type properties.
     */
    public fun questionTypeProperties(questionTypeProperties: IResolvable) {
        cdkBuilder.questionTypeProperties(questionTypeProperties)
    }

    /**
     * @param questionTypeProperties The properties of the type of question. Text questions do not
     *   have to define question type properties.
     */
    public fun questionTypeProperties(
        questionTypeProperties: CfnEvaluationForm.EvaluationFormQuestionTypePropertiesProperty
    ) {
        cdkBuilder.questionTypeProperties(questionTypeProperties)
    }

    /**
     * @param refId The identifier of the question. An identifier must be unique within the
     *   evaluation form. *Length Constraints* : Minimum length of 1. Maximum length of 40.
     */
    public fun refId(refId: String) {
        cdkBuilder.refId(refId)
    }

    /**
     * @param title The title of the question. *Length Constraints* : Minimum length of 1. Maximum
     *   length of 350.
     */
    public fun title(title: String) {
        cdkBuilder.title(title)
    }

    /**
     * @param weight The scoring weight of the section. *Minimum* : 0
     *
     * *Maximum* : 100
     */
    public fun weight(weight: Number) {
        cdkBuilder.weight(weight)
    }

    public fun build(): CfnEvaluationForm.EvaluationFormQuestionProperty = cdkBuilder.build()
}
