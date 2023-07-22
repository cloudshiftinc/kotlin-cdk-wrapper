@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.autoscaling

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup

@CdkDslMarker
public class CfnAutoScalingGroupNetworkBandwidthGbpsRequestPropertyDsl {
  private val cdkBuilder: CfnAutoScalingGroup.NetworkBandwidthGbpsRequestProperty.Builder =
      CfnAutoScalingGroup.NetworkBandwidthGbpsRequestProperty.builder()

  /**
   * @param max The maximum amount of network bandwidth, in gigabits per second (Gbps).
   */
  public fun max(max: Number) {
    cdkBuilder.max(max)
  }

  /**
   * @param min The minimum amount of network bandwidth, in gigabits per second (Gbps).
   */
  public fun min(min: Number) {
    cdkBuilder.min(min)
  }

  public fun build(): CfnAutoScalingGroup.NetworkBandwidthGbpsRequestProperty = cdkBuilder.build()
}
