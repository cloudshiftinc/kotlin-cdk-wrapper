@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.connect

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.connect.CfnEvaluationForm

/**
 * Information about the automation option based on a rule category for a single select question.
 *
 * *Length Constraints* : Minimum length of 1. Maximum length of 50.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.connect.*;
 * SingleSelectQuestionRuleCategoryAutomationProperty
 * singleSelectQuestionRuleCategoryAutomationProperty =
 * SingleSelectQuestionRuleCategoryAutomationProperty.builder()
 * .category("category")
 * .condition("condition")
 * .optionRefId("optionRefId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-evaluationform-singleselectquestionrulecategoryautomation.html)
 */
@CdkDslMarker
public class CfnEvaluationFormSingleSelectQuestionRuleCategoryAutomationPropertyDsl {
  private val cdkBuilder:
      CfnEvaluationForm.SingleSelectQuestionRuleCategoryAutomationProperty.Builder =
      CfnEvaluationForm.SingleSelectQuestionRuleCategoryAutomationProperty.builder()

  /**
   * @param category The category name, as defined in Rules. 
   * *Minimum* : 1
   *
   * *Maximum* : 50
   */
  public fun category(category: String) {
    cdkBuilder.category(category)
  }

  /**
   * @param condition The condition to apply for the automation option. 
   * If the condition is PRESENT, then the option is applied when the contact data includes the
   * category. Similarly, if the condition is NOT_PRESENT, then the option is applied when the contact
   * data does not include the category.
   *
   * *Allowed values* : `PRESENT` | `NOT_PRESENT`
   *
   * *Maximum* : 50
   */
  public fun condition(condition: String) {
    cdkBuilder.condition(condition)
  }

  /**
   * @param optionRefId The identifier of the answer option. An identifier must be unique within the
   * question. 
   * *Length Constraints* : Minimum length of 1. Maximum length of 40.
   */
  public fun optionRefId(optionRefId: String) {
    cdkBuilder.optionRefId(optionRefId)
  }

  public fun build(): CfnEvaluationForm.SingleSelectQuestionRuleCategoryAutomationProperty =
      cdkBuilder.build()
}
