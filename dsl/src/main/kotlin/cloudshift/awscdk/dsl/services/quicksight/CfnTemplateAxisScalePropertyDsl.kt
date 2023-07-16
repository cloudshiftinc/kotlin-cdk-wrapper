@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplateAxisScalePropertyDsl {
  private val cdkBuilder: CfnTemplate.AxisScaleProperty.Builder =
      CfnTemplate.AxisScaleProperty.builder()

  public fun linear(linear: IResolvable) {
    cdkBuilder.linear(linear)
  }

  public fun linear(linear: CfnTemplate.AxisLinearScaleProperty) {
    cdkBuilder.linear(linear)
  }

  public fun logarithmic(logarithmic: IResolvable) {
    cdkBuilder.logarithmic(logarithmic)
  }

  public fun logarithmic(logarithmic: CfnTemplate.AxisLogarithmicScaleProperty) {
    cdkBuilder.logarithmic(logarithmic)
  }

  public fun build(): CfnTemplate.AxisScaleProperty = cdkBuilder.build()
}
