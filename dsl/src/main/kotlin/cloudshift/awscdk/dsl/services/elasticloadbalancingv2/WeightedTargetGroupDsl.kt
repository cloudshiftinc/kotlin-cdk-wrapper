@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.elasticloadbalancingv2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.elasticloadbalancingv2.IApplicationTargetGroup
import software.amazon.awscdk.services.elasticloadbalancingv2.WeightedTargetGroup

/**
 * A Target Group and weight combination.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.elasticloadbalancingv2.*;
 * ApplicationTargetGroup applicationTargetGroup;
 * WeightedTargetGroup weightedTargetGroup = WeightedTargetGroup.builder()
 * .targetGroup(applicationTargetGroup)
 * // the properties below are optional
 * .weight(123)
 * .build();
 * ```
 */
@CdkDslMarker
public class WeightedTargetGroupDsl {
  private val cdkBuilder: WeightedTargetGroup.Builder = WeightedTargetGroup.builder()

  /**
   * @param targetGroup The target group. 
   */
  public fun targetGroup(targetGroup: IApplicationTargetGroup) {
    cdkBuilder.targetGroup(targetGroup)
  }

  /**
   * @param weight The target group's weight.
   * Range is [0..1000).
   */
  public fun weight(weight: Number) {
    cdkBuilder.weight(weight)
  }

  public fun build(): WeightedTargetGroup = cdkBuilder.build()
}
