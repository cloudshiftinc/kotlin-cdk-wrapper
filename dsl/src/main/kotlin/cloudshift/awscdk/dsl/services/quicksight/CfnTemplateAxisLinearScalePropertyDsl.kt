@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplateAxisLinearScalePropertyDsl {
  private val cdkBuilder: CfnTemplate.AxisLinearScaleProperty.Builder =
      CfnTemplate.AxisLinearScaleProperty.builder()

  public fun stepCount(stepCount: Number) {
    cdkBuilder.stepCount(stepCount)
  }

  public fun stepSize(stepSize: Number) {
    cdkBuilder.stepSize(stepSize)
  }

  public fun build(): CfnTemplate.AxisLinearScaleProperty = cdkBuilder.build()
}
