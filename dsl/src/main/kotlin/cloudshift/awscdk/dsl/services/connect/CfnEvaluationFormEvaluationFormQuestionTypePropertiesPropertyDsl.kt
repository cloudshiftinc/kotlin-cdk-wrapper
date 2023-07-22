@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.connect

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.connect.CfnEvaluationForm

/**
 * Information about properties for a question in an evaluation form.
 *
 * The question type properties must be either for a numeric question or a single select question.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.connect.*;
 * EvaluationFormQuestionTypePropertiesProperty evaluationFormQuestionTypePropertiesProperty =
 * EvaluationFormQuestionTypePropertiesProperty.builder()
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
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-evaluationform-evaluationformquestiontypeproperties.html)
 */
@CdkDslMarker
public class CfnEvaluationFormEvaluationFormQuestionTypePropertiesPropertyDsl {
  private val cdkBuilder: CfnEvaluationForm.EvaluationFormQuestionTypePropertiesProperty.Builder =
      CfnEvaluationForm.EvaluationFormQuestionTypePropertiesProperty.builder()

  /**
   * @param numeric The properties of the numeric question.
   */
  public fun numeric(numeric: IResolvable) {
    cdkBuilder.numeric(numeric)
  }

  /**
   * @param numeric The properties of the numeric question.
   */
  public fun numeric(numeric: CfnEvaluationForm.EvaluationFormNumericQuestionPropertiesProperty) {
    cdkBuilder.numeric(numeric)
  }

  /**
   * @param singleSelect The properties of the numeric question.
   */
  public fun singleSelect(singleSelect: IResolvable) {
    cdkBuilder.singleSelect(singleSelect)
  }

  /**
   * @param singleSelect The properties of the numeric question.
   */
  public
      fun singleSelect(singleSelect: CfnEvaluationForm.EvaluationFormSingleSelectQuestionPropertiesProperty) {
    cdkBuilder.singleSelect(singleSelect)
  }

  public fun build(): CfnEvaluationForm.EvaluationFormQuestionTypePropertiesProperty =
      cdkBuilder.build()
}
