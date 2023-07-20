@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.connect

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.connect.CfnEvaluationForm

@CdkDslMarker
public class CfnEvaluationFormEvaluationFormNumericQuestionAutomationPropertyDsl {
  private val cdkBuilder: CfnEvaluationForm.EvaluationFormNumericQuestionAutomationProperty.Builder
      = CfnEvaluationForm.EvaluationFormNumericQuestionAutomationProperty.builder()

  public fun propertyValue(propertyValue: IResolvable) {
    cdkBuilder.propertyValue(propertyValue)
  }

  public
      fun propertyValue(propertyValue: CfnEvaluationForm.NumericQuestionPropertyValueAutomationProperty) {
    cdkBuilder.propertyValue(propertyValue)
  }

  public fun build(): CfnEvaluationForm.EvaluationFormNumericQuestionAutomationProperty =
      cdkBuilder.build()
}
