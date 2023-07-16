@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.budgets

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.budgets.CfnBudget
import software.amazon.awscdk.services.budgets.CfnBudgetProps

@CdkDslMarker
public class CfnBudgetPropsDsl {
  private val cdkBuilder: CfnBudgetProps.Builder = CfnBudgetProps.builder()

  private val _notificationsWithSubscribers: MutableList<Any> = mutableListOf()

  public fun budget(budget: IResolvable) {
    cdkBuilder.budget(budget)
  }

  public fun budget(budget: CfnBudget.BudgetDataProperty) {
    cdkBuilder.budget(budget)
  }

  public fun notificationsWithSubscribers(vararg notificationsWithSubscribers: Any) {
    _notificationsWithSubscribers.addAll(listOf(*notificationsWithSubscribers))
  }

  public fun notificationsWithSubscribers(notificationsWithSubscribers: Collection<Any>) {
    _notificationsWithSubscribers.addAll(notificationsWithSubscribers)
  }

  public fun notificationsWithSubscribers(notificationsWithSubscribers: IResolvable) {
    cdkBuilder.notificationsWithSubscribers(notificationsWithSubscribers)
  }

  public fun build(): CfnBudgetProps {
    if(_notificationsWithSubscribers.isNotEmpty())
        cdkBuilder.notificationsWithSubscribers(_notificationsWithSubscribers)
    return cdkBuilder.build()
  }
}
