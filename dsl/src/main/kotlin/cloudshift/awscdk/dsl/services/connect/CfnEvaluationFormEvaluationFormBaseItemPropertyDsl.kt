@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.connect

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.connect.CfnEvaluationForm

@CdkDslMarker
public class CfnEvaluationFormEvaluationFormBaseItemPropertyDsl {
  private val cdkBuilder: CfnEvaluationForm.EvaluationFormBaseItemProperty.Builder =
      CfnEvaluationForm.EvaluationFormBaseItemProperty.builder()

  public fun section(section: IResolvable) {
    cdkBuilder.section(section)
  }

  public fun section(section: CfnEvaluationForm.EvaluationFormSectionProperty) {
    cdkBuilder.section(section)
  }

  public fun build(): CfnEvaluationForm.EvaluationFormBaseItemProperty = cdkBuilder.build()
}
