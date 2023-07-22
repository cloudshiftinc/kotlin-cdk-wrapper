@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.autoscaling

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup

@CdkDslMarker
public class CfnAutoScalingGroupVCpuCountRequestPropertyDsl {
  private val cdkBuilder: CfnAutoScalingGroup.VCpuCountRequestProperty.Builder =
      CfnAutoScalingGroup.VCpuCountRequestProperty.builder()

  /**
   * @param max The maximum number of vCPUs.
   */
  public fun max(max: Number) {
    cdkBuilder.max(max)
  }

  /**
   * @param min The minimum number of vCPUs.
   */
  public fun min(min: Number) {
    cdkBuilder.min(min)
  }

  public fun build(): CfnAutoScalingGroup.VCpuCountRequestProperty = cdkBuilder.build()
}
