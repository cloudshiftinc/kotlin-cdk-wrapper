@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.elasticloadbalancingv2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule

/**
 * Information about how traffic will be distributed between multiple target groups in a forward
 * rule.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.elasticloadbalancingv2.*;
 * TargetGroupTupleProperty targetGroupTupleProperty = TargetGroupTupleProperty.builder()
 * .targetGroupArn("targetGroupArn")
 * .weight(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenerrule-targetgrouptuple.html)
 */
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
