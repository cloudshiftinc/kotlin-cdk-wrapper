@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.elasticloadbalancingv2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.elasticloadbalancingv2.AddApplicationActionProps
import software.amazon.awscdk.services.elasticloadbalancingv2.ListenerAction
import software.amazon.awscdk.services.elasticloadbalancingv2.ListenerCondition

@CdkDslMarker
public class AddApplicationActionPropsDsl {
  private val cdkBuilder: AddApplicationActionProps.Builder = AddApplicationActionProps.builder()

  private val _conditions: MutableList<ListenerCondition> = mutableListOf()

  public fun action(action: ListenerAction) {
    cdkBuilder.action(action)
  }

  public fun conditions(vararg conditions: ListenerCondition) {
    _conditions.addAll(listOf(*conditions))
  }

  public fun conditions(conditions: Collection<ListenerCondition>) {
    _conditions.addAll(conditions)
  }

  public fun priority(priority: Number) {
    cdkBuilder.priority(priority)
  }

  public fun build(): AddApplicationActionProps {
    if(_conditions.isNotEmpty()) cdkBuilder.conditions(_conditions)
    return cdkBuilder.build()
  }
}
