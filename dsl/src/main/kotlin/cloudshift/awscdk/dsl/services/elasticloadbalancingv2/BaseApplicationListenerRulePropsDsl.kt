@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.elasticloadbalancingv2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.elasticloadbalancingv2.BaseApplicationListenerRuleProps
import software.amazon.awscdk.services.elasticloadbalancingv2.IApplicationTargetGroup
import software.amazon.awscdk.services.elasticloadbalancingv2.ListenerAction
import software.amazon.awscdk.services.elasticloadbalancingv2.ListenerCondition

@CdkDslMarker
public class BaseApplicationListenerRulePropsDsl {
  private val cdkBuilder: BaseApplicationListenerRuleProps.Builder =
      BaseApplicationListenerRuleProps.builder()

  private val _conditions: MutableList<ListenerCondition> = mutableListOf()

  private val _targetGroups: MutableList<IApplicationTargetGroup> = mutableListOf()

  /**
   * @param action Action to perform when requests are received.
   * Only one of `action`, `fixedResponse`, `redirectResponse` or `targetGroups` can be specified.
   */
  public fun action(action: ListenerAction) {
    cdkBuilder.action(action)
  }

  /**
   * @param conditions Rule applies if matches the conditions.
   */
  public fun conditions(vararg conditions: ListenerCondition) {
    _conditions.addAll(listOf(*conditions))
  }

  /**
   * @param conditions Rule applies if matches the conditions.
   */
  public fun conditions(conditions: Collection<ListenerCondition>) {
    _conditions.addAll(conditions)
  }

  /**
   * @param priority Priority of the rule. 
   * The rule with the lowest priority will be used for every request.
   *
   * Priorities must be unique.
   */
  public fun priority(priority: Number) {
    cdkBuilder.priority(priority)
  }

  /**
   * @param targetGroups Target groups to forward requests to.
   * Only one of `action`, `fixedResponse`, `redirectResponse` or `targetGroups` can be specified.
   *
   * Implies a `forward` action.
   */
  public fun targetGroups(vararg targetGroups: IApplicationTargetGroup) {
    _targetGroups.addAll(listOf(*targetGroups))
  }

  /**
   * @param targetGroups Target groups to forward requests to.
   * Only one of `action`, `fixedResponse`, `redirectResponse` or `targetGroups` can be specified.
   *
   * Implies a `forward` action.
   */
  public fun targetGroups(targetGroups: Collection<IApplicationTargetGroup>) {
    _targetGroups.addAll(targetGroups)
  }

  public fun build(): BaseApplicationListenerRuleProps {
    if(_conditions.isNotEmpty()) cdkBuilder.conditions(_conditions)
    if(_targetGroups.isNotEmpty()) cdkBuilder.targetGroups(_targetGroups)
    return cdkBuilder.build()
  }
}
