@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.connect

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.connect.CfnEvaluationForm

@CdkDslMarker
public class CfnEvaluationFormScoringStrategyPropertyDsl {
  private val cdkBuilder: CfnEvaluationForm.ScoringStrategyProperty.Builder =
      CfnEvaluationForm.ScoringStrategyProperty.builder()

  /**
   * @param mode The scoring mode of the evaluation form. 
   * *Allowed values* : `QUESTION_ONLY` | `SECTION_ONLY`
   */
  public fun mode(mode: String) {
    cdkBuilder.mode(mode)
  }

  /**
   * @param status The scoring status of the evaluation form. 
   * *Allowed values* : `ENABLED` | `DISABLED`
   */
  public fun status(status: String) {
    cdkBuilder.status(status)
  }

  public fun build(): CfnEvaluationForm.ScoringStrategyProperty = cdkBuilder.build()
}
