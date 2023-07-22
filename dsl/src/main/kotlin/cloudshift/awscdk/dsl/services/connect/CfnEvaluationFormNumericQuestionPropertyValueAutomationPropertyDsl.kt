@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.connect

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.connect.CfnEvaluationForm

@CdkDslMarker
public class CfnEvaluationFormNumericQuestionPropertyValueAutomationPropertyDsl {
  private val cdkBuilder: CfnEvaluationForm.NumericQuestionPropertyValueAutomationProperty.Builder =
      CfnEvaluationForm.NumericQuestionPropertyValueAutomationProperty.builder()

  /**
   * @param label The property label of the automation. 
   * *Allowed values* : `OVERALL_CUSTOMER_SENTIMENT_SCORE` , `OVERALL_AGENT_SENTIMENT_SCORE` |
   * `NON_TALK_TIME` | `NON_TALK_TIME_PERCENTAGE` | `NUMBER_OF_INTERRUPTIONS` | `CONTACT_DURATION` |
   * `AGENT_INTERACTION_DURATION` | `CUSTOMER_HOLD_TIME`
   */
  public fun label(label: String) {
    cdkBuilder.label(label)
  }

  public fun build(): CfnEvaluationForm.NumericQuestionPropertyValueAutomationProperty =
      cdkBuilder.build()
}
