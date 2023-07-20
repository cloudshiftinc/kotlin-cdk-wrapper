@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.connect

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.connect.CfnEvaluationForm

@CdkDslMarker
public class CfnEvaluationFormEvaluationFormNumericQuestionOptionPropertyDsl {
  private val cdkBuilder: CfnEvaluationForm.EvaluationFormNumericQuestionOptionProperty.Builder =
      CfnEvaluationForm.EvaluationFormNumericQuestionOptionProperty.builder()

  public fun automaticFail(automaticFail: Boolean) {
    cdkBuilder.automaticFail(automaticFail)
  }

  public fun automaticFail(automaticFail: IResolvable) {
    cdkBuilder.automaticFail(automaticFail)
  }

  public fun maxValue(maxValue: Number) {
    cdkBuilder.maxValue(maxValue)
  }

  public fun minValue(minValue: Number) {
    cdkBuilder.minValue(minValue)
  }

  public fun score(score: Number) {
    cdkBuilder.score(score)
  }

  public fun build(): CfnEvaluationForm.EvaluationFormNumericQuestionOptionProperty =
      cdkBuilder.build()
}
