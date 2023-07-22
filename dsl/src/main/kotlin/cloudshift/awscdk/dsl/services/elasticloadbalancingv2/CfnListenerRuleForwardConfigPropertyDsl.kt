@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.elasticloadbalancingv2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule

@CdkDslMarker
public class CfnListenerRuleForwardConfigPropertyDsl {
  private val cdkBuilder: CfnListenerRule.ForwardConfigProperty.Builder =
      CfnListenerRule.ForwardConfigProperty.builder()

  private val _targetGroups: MutableList<Any> = mutableListOf()

  /**
   * @param targetGroupStickinessConfig Information about the target group stickiness for a rule.
   */
  public fun targetGroupStickinessConfig(targetGroupStickinessConfig: IResolvable) {
    cdkBuilder.targetGroupStickinessConfig(targetGroupStickinessConfig)
  }

  /**
   * @param targetGroupStickinessConfig Information about the target group stickiness for a rule.
   */
  public
      fun targetGroupStickinessConfig(targetGroupStickinessConfig: CfnListenerRule.TargetGroupStickinessConfigProperty) {
    cdkBuilder.targetGroupStickinessConfig(targetGroupStickinessConfig)
  }

  /**
   * @param targetGroups Information about how traffic will be distributed between multiple target
   * groups in a forward rule.
   */
  public fun targetGroups(vararg targetGroups: Any) {
    _targetGroups.addAll(listOf(*targetGroups))
  }

  /**
   * @param targetGroups Information about how traffic will be distributed between multiple target
   * groups in a forward rule.
   */
  public fun targetGroups(targetGroups: Collection<Any>) {
    _targetGroups.addAll(targetGroups)
  }

  /**
   * @param targetGroups Information about how traffic will be distributed between multiple target
   * groups in a forward rule.
   */
  public fun targetGroups(targetGroups: IResolvable) {
    cdkBuilder.targetGroups(targetGroups)
  }

  public fun build(): CfnListenerRule.ForwardConfigProperty {
    if(_targetGroups.isNotEmpty()) cdkBuilder.targetGroups(_targetGroups)
    return cdkBuilder.build()
  }
}
