@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.autoscaling

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup

@CdkDslMarker
public class CfnAutoScalingGroupAcceleratorTotalMemoryMiBRequestPropertyDsl {
  private val cdkBuilder: CfnAutoScalingGroup.AcceleratorTotalMemoryMiBRequestProperty.Builder =
      CfnAutoScalingGroup.AcceleratorTotalMemoryMiBRequestProperty.builder()

  public fun max(max: Number) {
    cdkBuilder.max(max)
  }

  public fun min(min: Number) {
    cdkBuilder.min(min)
  }

  public fun build(): CfnAutoScalingGroup.AcceleratorTotalMemoryMiBRequestProperty =
      cdkBuilder.build()
}
