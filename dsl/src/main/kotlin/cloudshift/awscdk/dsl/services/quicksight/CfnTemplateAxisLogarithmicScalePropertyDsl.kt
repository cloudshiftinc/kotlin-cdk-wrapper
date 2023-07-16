@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplateAxisLogarithmicScalePropertyDsl {
  private val cdkBuilder: CfnTemplate.AxisLogarithmicScaleProperty.Builder =
      CfnTemplate.AxisLogarithmicScaleProperty.builder()

  public fun base(base: Number) {
    cdkBuilder.base(base)
  }

  public fun build(): CfnTemplate.AxisLogarithmicScaleProperty = cdkBuilder.build()
}
