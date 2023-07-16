@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.connect

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.connect.CfnEvaluationForm

@CdkDslMarker
public class CfnEvaluationFormScoringStrategyPropertyDsl {
  private val cdkBuilder: CfnEvaluationForm.ScoringStrategyProperty.Builder =
      CfnEvaluationForm.ScoringStrategyProperty.builder()

  public fun mode(mode: String) {
    cdkBuilder.mode(mode)
  }

  public fun status(status: String) {
    cdkBuilder.status(status)
  }

  public fun build(): CfnEvaluationForm.ScoringStrategyProperty = cdkBuilder.build()
}
