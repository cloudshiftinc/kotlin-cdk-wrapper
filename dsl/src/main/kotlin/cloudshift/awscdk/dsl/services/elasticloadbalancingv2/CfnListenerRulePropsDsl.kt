@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.elasticloadbalancingv2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRuleProps

@CdkDslMarker
public class CfnListenerRulePropsDsl {
  private val cdkBuilder: CfnListenerRuleProps.Builder = CfnListenerRuleProps.builder()

  private val _actions: MutableList<Any> = mutableListOf()

  private val _conditions: MutableList<Any> = mutableListOf()

  public fun actions(vararg actions: Any) {
    _actions.addAll(listOf(*actions))
  }

  public fun actions(actions: Collection<Any>) {
    _actions.addAll(actions)
  }

  public fun actions(actions: IResolvable) {
    cdkBuilder.actions(actions)
  }

  public fun conditions(vararg conditions: Any) {
    _conditions.addAll(listOf(*conditions))
  }

  public fun conditions(conditions: Collection<Any>) {
    _conditions.addAll(conditions)
  }

  public fun conditions(conditions: IResolvable) {
    cdkBuilder.conditions(conditions)
  }

  public fun listenerArn(listenerArn: String) {
    cdkBuilder.listenerArn(listenerArn)
  }

  public fun priority(priority: Number) {
    cdkBuilder.priority(priority)
  }

  public fun build(): CfnListenerRuleProps {
    if(_actions.isNotEmpty()) cdkBuilder.actions(_actions)
    if(_conditions.isNotEmpty()) cdkBuilder.conditions(_conditions)
    return cdkBuilder.build()
  }
}
