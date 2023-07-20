@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.connect

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.connect.CfnEvaluationForm

@CdkDslMarker
public class CfnEvaluationFormNumericQuestionPropertyValueAutomationPropertyDsl {
  private val cdkBuilder: CfnEvaluationForm.NumericQuestionPropertyValueAutomationProperty.Builder =
      CfnEvaluationForm.NumericQuestionPropertyValueAutomationProperty.builder()

  public fun label(label: String) {
    cdkBuilder.label(label)
  }

  public fun build(): CfnEvaluationForm.NumericQuestionPropertyValueAutomationProperty =
      cdkBuilder.build()
}
