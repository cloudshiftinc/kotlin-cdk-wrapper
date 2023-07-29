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
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.connect.CfnEvaluationForm

/**
 * Information about a section from an evaluation form.
 *
 * A section can contain sections and/or questions. Evaluation forms can only contain sections and
 * subsections (two level nesting).
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.connect.*;
 * EvaluationFormSectionProperty evaluationFormSectionProperty_;
 * EvaluationFormSectionProperty evaluationFormSectionProperty =
 * EvaluationFormSectionProperty.builder()
 * .refId("refId")
 * .title("title")
 * // the properties below are optional
 * .instructions("instructions")
 * .items(List.of(EvaluationFormItemProperty.builder()
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
 * .section(evaluationFormSectionProperty_)
 * .build()))
 * .weight(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-evaluationform-evaluationformsection.html)
 */
@CdkDslMarker
public class CfnEvaluationFormEvaluationFormSectionPropertyDsl {
    private val cdkBuilder: CfnEvaluationForm.EvaluationFormSectionProperty.Builder =
        CfnEvaluationForm.EvaluationFormSectionProperty.builder()

    private val _items: MutableList<Any> = mutableListOf()

    /** @param instructions The instructions of the section. */
    public fun instructions(instructions: String) {
        cdkBuilder.instructions(instructions)
    }

    /** @param items The items of the section. *Minimum* : 1 */
    public fun items(vararg items: Any) {
        _items.addAll(listOf(*items))
    }

    /** @param items The items of the section. *Minimum* : 1 */
    public fun items(items: Collection<Any>) {
        _items.addAll(items)
    }

    /** @param items The items of the section. *Minimum* : 1 */
    public fun items(items: IResolvable) {
        cdkBuilder.items(items)
    }

    /**
     * @param refId The identifier of the section. An identifier must be unique within the
     *   evaluation form. *Length Constraints* : Minimum length of 1. Maximum length of 40.
     */
    public fun refId(refId: String) {
        cdkBuilder.refId(refId)
    }

    /**
     * @param title The title of the section. *Length Constraints* : Minimum length of 1. Maximum
     *   length of 128.
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

    public fun build(): CfnEvaluationForm.EvaluationFormSectionProperty {
        if (_items.isNotEmpty()) cdkBuilder.items(_items)
        return cdkBuilder.build()
    }
}
