@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.connect

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.connect.CfnEvaluationForm

@CdkDslMarker
public class CfnEvaluationFormEvaluationFormQuestionTypePropertiesPropertyDsl {
  private val cdkBuilder: CfnEvaluationForm.EvaluationFormQuestionTypePropertiesProperty.Builder =
      CfnEvaluationForm.EvaluationFormQuestionTypePropertiesProperty.builder()

  public fun numeric(numeric: IResolvable) {
    cdkBuilder.numeric(numeric)
  }

  public fun numeric(numeric: CfnEvaluationForm.EvaluationFormNumericQuestionPropertiesProperty) {
    cdkBuilder.numeric(numeric)
  }

  public fun singleSelect(singleSelect: IResolvable) {
    cdkBuilder.singleSelect(singleSelect)
  }

  public
      fun singleSelect(singleSelect: CfnEvaluationForm.EvaluationFormSingleSelectQuestionPropertiesProperty) {
    cdkBuilder.singleSelect(singleSelect)
  }

  public fun build(): CfnEvaluationForm.EvaluationFormQuestionTypePropertiesProperty =
      cdkBuilder.build()
}
