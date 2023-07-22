@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.autoscaling

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup

@CdkDslMarker
public class CfnAutoScalingGroupAcceleratorCountRequestPropertyDsl {
  private val cdkBuilder: CfnAutoScalingGroup.AcceleratorCountRequestProperty.Builder =
      CfnAutoScalingGroup.AcceleratorCountRequestProperty.builder()

  /**
   * @param max The maximum value.
   */
  public fun max(max: Number) {
    cdkBuilder.max(max)
  }

  /**
   * @param min The minimum value.
   */
  public fun min(min: Number) {
    cdkBuilder.min(min)
  }

  public fun build(): CfnAutoScalingGroup.AcceleratorCountRequestProperty = cdkBuilder.build()
}
