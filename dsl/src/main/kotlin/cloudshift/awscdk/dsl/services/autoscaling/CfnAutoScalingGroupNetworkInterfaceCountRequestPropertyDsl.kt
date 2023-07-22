@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.autoscaling

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup

@CdkDslMarker
public class CfnAutoScalingGroupNetworkInterfaceCountRequestPropertyDsl {
  private val cdkBuilder: CfnAutoScalingGroup.NetworkInterfaceCountRequestProperty.Builder =
      CfnAutoScalingGroup.NetworkInterfaceCountRequestProperty.builder()

  /**
   * @param max The maximum number of network interfaces.
   */
  public fun max(max: Number) {
    cdkBuilder.max(max)
  }

  /**
   * @param min The minimum number of network interfaces.
   */
  public fun min(min: Number) {
    cdkBuilder.min(min)
  }

  public fun build(): CfnAutoScalingGroup.NetworkInterfaceCountRequestProperty = cdkBuilder.build()
}
