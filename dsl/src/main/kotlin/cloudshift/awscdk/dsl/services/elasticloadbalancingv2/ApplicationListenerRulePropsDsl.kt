@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.elasticloadbalancingv2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationListenerRuleProps
import software.amazon.awscdk.services.elasticloadbalancingv2.IApplicationListener
import software.amazon.awscdk.services.elasticloadbalancingv2.IApplicationTargetGroup
import software.amazon.awscdk.services.elasticloadbalancingv2.ListenerAction
import software.amazon.awscdk.services.elasticloadbalancingv2.ListenerCondition

@CdkDslMarker
public class ApplicationListenerRulePropsDsl {
  private val cdkBuilder: ApplicationListenerRuleProps.Builder =
      ApplicationListenerRuleProps.builder()

  private val _conditions: MutableList<ListenerCondition> = mutableListOf()

  private val _targetGroups: MutableList<IApplicationTargetGroup> = mutableListOf()

  public fun action(action: ListenerAction) {
    cdkBuilder.action(action)
  }

  public fun conditions(vararg conditions: ListenerCondition) {
    _conditions.addAll(listOf(*conditions))
  }

  public fun conditions(conditions: Collection<ListenerCondition>) {
    _conditions.addAll(conditions)
  }

  public fun listener(listener: IApplicationListener) {
    cdkBuilder.listener(listener)
  }

  public fun priority(priority: Number) {
    cdkBuilder.priority(priority)
  }

  public fun targetGroups(vararg targetGroups: IApplicationTargetGroup) {
    _targetGroups.addAll(listOf(*targetGroups))
  }

  public fun targetGroups(targetGroups: Collection<IApplicationTargetGroup>) {
    _targetGroups.addAll(targetGroups)
  }

  public fun build(): ApplicationListenerRuleProps {
    if(_conditions.isNotEmpty()) cdkBuilder.conditions(_conditions)
    if(_targetGroups.isNotEmpty()) cdkBuilder.targetGroups(_targetGroups)
    return cdkBuilder.build()
  }
}
