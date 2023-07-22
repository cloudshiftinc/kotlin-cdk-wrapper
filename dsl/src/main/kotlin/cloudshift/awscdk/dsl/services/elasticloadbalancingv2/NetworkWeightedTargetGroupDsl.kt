@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.elasticloadbalancingv2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.elasticloadbalancingv2.INetworkTargetGroup
import software.amazon.awscdk.services.elasticloadbalancingv2.NetworkWeightedTargetGroup

@CdkDslMarker
public class NetworkWeightedTargetGroupDsl {
  private val cdkBuilder: NetworkWeightedTargetGroup.Builder = NetworkWeightedTargetGroup.builder()

  /**
   * @param targetGroup The target group. 
   */
  public fun targetGroup(targetGroup: INetworkTargetGroup) {
    cdkBuilder.targetGroup(targetGroup)
  }

  /**
   * @param weight The target group's weight.
   * Range is [0..1000).
   */
  public fun weight(weight: Number) {
    cdkBuilder.weight(weight)
  }

  public fun build(): NetworkWeightedTargetGroup = cdkBuilder.build()
}
