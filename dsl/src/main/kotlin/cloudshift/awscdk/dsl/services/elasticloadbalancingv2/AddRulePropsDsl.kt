@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.elasticloadbalancingv2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.elasticloadbalancingv2.AddRuleProps
import software.amazon.awscdk.services.elasticloadbalancingv2.ListenerCondition

@CdkDslMarker
public class AddRulePropsDsl {
  private val cdkBuilder: AddRuleProps.Builder = AddRuleProps.builder()

  private val _conditions: MutableList<ListenerCondition> = mutableListOf()

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
   * @param priority Priority of this target group.
   * The rule with the lowest priority will be used for every request.
   * If priority is not given, these target groups will be added as
   * defaults, and must not have conditions.
   *
   * Priorities must be unique.
   */
  public fun priority(priority: Number) {
    cdkBuilder.priority(priority)
  }

  public fun build(): AddRuleProps {
    if(_conditions.isNotEmpty()) cdkBuilder.conditions(_conditions)
    return cdkBuilder.build()
  }
}
