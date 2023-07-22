@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.budgets

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.budgets.CfnBudget

@CdkDslMarker
public class CfnBudgetNotificationWithSubscribersPropertyDsl {
  private val cdkBuilder: CfnBudget.NotificationWithSubscribersProperty.Builder =
      CfnBudget.NotificationWithSubscribersProperty.builder()

  private val _subscribers: MutableList<Any> = mutableListOf()

  /**
   * @param notification The notification that's associated with a budget. 
   */
  public fun notification(notification: IResolvable) {
    cdkBuilder.notification(notification)
  }

  /**
   * @param notification The notification that's associated with a budget. 
   */
  public fun notification(notification: CfnBudget.NotificationProperty) {
    cdkBuilder.notification(notification)
  }

  /**
   * @param subscribers A list of subscribers who are subscribed to this notification. 
   */
  public fun subscribers(vararg subscribers: Any) {
    _subscribers.addAll(listOf(*subscribers))
  }

  /**
   * @param subscribers A list of subscribers who are subscribed to this notification. 
   */
  public fun subscribers(subscribers: Collection<Any>) {
    _subscribers.addAll(subscribers)
  }

  /**
   * @param subscribers A list of subscribers who are subscribed to this notification. 
   */
  public fun subscribers(subscribers: IResolvable) {
    cdkBuilder.subscribers(subscribers)
  }

  public fun build(): CfnBudget.NotificationWithSubscribersProperty {
    if(_subscribers.isNotEmpty()) cdkBuilder.subscribers(_subscribers)
    return cdkBuilder.build()
  }
}
