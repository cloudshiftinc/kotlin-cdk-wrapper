@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.elasticloadbalancingv2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule

@CdkDslMarker
public class CfnListenerRuleTargetGroupTuplePropertyDsl {
  private val cdkBuilder: CfnListenerRule.TargetGroupTupleProperty.Builder =
      CfnListenerRule.TargetGroupTupleProperty.builder()

  /**
   * @param targetGroupArn The Amazon Resource Name (ARN) of the target group.
   */
  public fun targetGroupArn(targetGroupArn: String) {
    cdkBuilder.targetGroupArn(targetGroupArn)
  }

  /**
   * @param weight The weight.
   * The range is 0 to 999.
   */
  public fun weight(weight: Number) {
    cdkBuilder.weight(weight)
  }

  public fun build(): CfnListenerRule.TargetGroupTupleProperty = cdkBuilder.build()
}
