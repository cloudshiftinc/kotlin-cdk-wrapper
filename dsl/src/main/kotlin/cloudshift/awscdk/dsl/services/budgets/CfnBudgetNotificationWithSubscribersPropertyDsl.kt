@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.budgets

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.budgets.CfnBudget
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnBudgetNotificationWithSubscribersPropertyDsl {
    private val cdkBuilder: CfnBudget.NotificationWithSubscribersProperty.Builder =
        CfnBudget.NotificationWithSubscribersProperty.builder()

    private val _subscribers: MutableList<Any> = mutableListOf()

    public fun notification(notification: IResolvable) {
        cdkBuilder.notification(notification)
    }

    public fun notification(notification: CfnBudget.NotificationProperty) {
        cdkBuilder.notification(notification)
    }

    public fun subscribers(vararg subscribers: Any) {
        _subscribers.addAll(listOf(*subscribers))
    }

    public fun subscribers(subscribers: Collection<Any>) {
        _subscribers.addAll(subscribers)
    }

    public fun subscribers(subscribers: IResolvable) {
        cdkBuilder.subscribers(subscribers)
    }

    public fun build(): CfnBudget.NotificationWithSubscribersProperty {
        if (_subscribers.isNotEmpty()) cdkBuilder.subscribers(_subscribers)
        return cdkBuilder.build()
    }
}
