@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.autoscaling

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup

@CdkDslMarker
public class CfnAutoScalingGroupMemoryGiBPerVCpuRequestPropertyDsl {
  private val cdkBuilder: CfnAutoScalingGroup.MemoryGiBPerVCpuRequestProperty.Builder =
      CfnAutoScalingGroup.MemoryGiBPerVCpuRequestProperty.builder()

  /**
   * @param max The memory maximum in GiB.
   */
  public fun max(max: Number) {
    cdkBuilder.max(max)
  }

  /**
   * @param min The memory minimum in GiB.
   */
  public fun min(min: Number) {
    cdkBuilder.min(min)
  }

  public fun build(): CfnAutoScalingGroup.MemoryGiBPerVCpuRequestProperty = cdkBuilder.build()
}
