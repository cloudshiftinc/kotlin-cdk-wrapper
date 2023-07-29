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
 * Items that are part of the evaluation form.
 *
 * The total number of sections and questions must not exceed 100 each. Questions must be contained
 * in a section.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.connect.*;
 * EvaluationFormItemProperty evaluationFormItemProperty_;
 * EvaluationFormItemProperty evaluationFormItemProperty = EvaluationFormItemProperty.builder()
 * .question(EvaluationFormQuestionProperty.builder()
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
 * .build())
 * .section(EvaluationFormSectionProperty.builder()
 * .refId("refId")
 * .title("title")
 * // the properties below are optional
 * .instructions("instructions")
 * .items(List.of(evaluationFormItemProperty_))
 * .weight(123)
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-evaluationform-evaluationformitem.html)
 */
@CdkDslMarker
public class CfnEvaluationFormEvaluationFormItemPropertyDsl {
    private val cdkBuilder: CfnEvaluationForm.EvaluationFormItemProperty.Builder =
        CfnEvaluationForm.EvaluationFormItemProperty.builder()

    /** @param question The information of the question. */
    public fun question(question: IResolvable) {
        cdkBuilder.question(question)
    }

    /** @param question The information of the question. */
    public fun question(question: CfnEvaluationForm.EvaluationFormQuestionProperty) {
        cdkBuilder.question(question)
    }

    /** @param section The information of the section. */
    public fun section(section: IResolvable) {
        cdkBuilder.section(section)
    }

    /** @param section The information of the section. */
    public fun section(section: CfnEvaluationForm.EvaluationFormSectionProperty) {
        cdkBuilder.section(section)
    }

    public fun build(): CfnEvaluationForm.EvaluationFormItemProperty = cdkBuilder.build()
}
