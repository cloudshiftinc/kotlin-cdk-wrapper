@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.vpclattice

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.vpclattice.CfnRule

@CdkDslMarker
public class CfnRuleWeightedTargetGroupPropertyDsl {
  private val cdkBuilder: CfnRule.WeightedTargetGroupProperty.Builder =
      CfnRule.WeightedTargetGroupProperty.builder()

  /**
   * @param targetGroupIdentifier The ID of the target group. 
   */
  public fun targetGroupIdentifier(targetGroupIdentifier: String) {
    cdkBuilder.targetGroupIdentifier(targetGroupIdentifier)
  }

  /**
   * @param weight Only required if you specify multiple target groups for a forward action.
   * The "weight" determines how requests are distributed to the target group. For example, if you
   * specify two target groups, each with a weight of 10, each target group receives half the requests.
   * If you specify two target groups, one with a weight of 10 and the other with a weight of 20, the
   * target group with a weight of 20 receives twice as many requests as the other target group. If
   * there's only one target group specified, then the default value is 100.
   */
  public fun weight(weight: Number) {
    cdkBuilder.weight(weight)
  }

  public fun build(): CfnRule.WeightedTargetGroupProperty = cdkBuilder.build()
}
