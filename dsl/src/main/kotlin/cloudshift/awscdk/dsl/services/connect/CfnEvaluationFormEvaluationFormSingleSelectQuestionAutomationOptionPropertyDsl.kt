@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.connect

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.connect.CfnEvaluationForm

@CdkDslMarker
public class CfnEvaluationFormEvaluationFormSingleSelectQuestionAutomationOptionPropertyDsl {
  private val cdkBuilder:
      CfnEvaluationForm.EvaluationFormSingleSelectQuestionAutomationOptionProperty.Builder =
      CfnEvaluationForm.EvaluationFormSingleSelectQuestionAutomationOptionProperty.builder()

  /**
   * @param ruleCategory The automation option based on a rule category for the single select
   * question. 
   */
  public fun ruleCategory(ruleCategory: IResolvable) {
    cdkBuilder.ruleCategory(ruleCategory)
  }

  /**
   * @param ruleCategory The automation option based on a rule category for the single select
   * question. 
   */
  public
      fun ruleCategory(ruleCategory: CfnEvaluationForm.SingleSelectQuestionRuleCategoryAutomationProperty) {
    cdkBuilder.ruleCategory(ruleCategory)
  }

  public fun build(): CfnEvaluationForm.EvaluationFormSingleSelectQuestionAutomationOptionProperty =
      cdkBuilder.build()
}
