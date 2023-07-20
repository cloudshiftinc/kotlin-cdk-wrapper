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

package cloudshift.awscdk.dsl.services.connect

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.connect.CfnRule
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnRuleActionsPropertyDsl {
    private val cdkBuilder: CfnRule.ActionsProperty.Builder = CfnRule.ActionsProperty.builder()

    private val _assignContactCategoryActions: MutableList<Any> = mutableListOf()

    private val _eventBridgeActions: MutableList<Any> = mutableListOf()

    private val _sendNotificationActions: MutableList<Any> = mutableListOf()

    private val _taskActions: MutableList<Any> = mutableListOf()

    public fun assignContactCategoryActions(vararg assignContactCategoryActions: Any) {
        _assignContactCategoryActions.addAll(listOf(*assignContactCategoryActions))
    }

    public fun assignContactCategoryActions(assignContactCategoryActions: Collection<Any>) {
        _assignContactCategoryActions.addAll(assignContactCategoryActions)
    }

    public fun assignContactCategoryActions(assignContactCategoryActions: IResolvable) {
        cdkBuilder.assignContactCategoryActions(assignContactCategoryActions)
    }

    public fun eventBridgeActions(vararg eventBridgeActions: Any) {
        _eventBridgeActions.addAll(listOf(*eventBridgeActions))
    }

    public fun eventBridgeActions(eventBridgeActions: Collection<Any>) {
        _eventBridgeActions.addAll(eventBridgeActions)
    }

    public fun eventBridgeActions(eventBridgeActions: IResolvable) {
        cdkBuilder.eventBridgeActions(eventBridgeActions)
    }

    public fun sendNotificationActions(vararg sendNotificationActions: Any) {
        _sendNotificationActions.addAll(listOf(*sendNotificationActions))
    }

    public fun sendNotificationActions(sendNotificationActions: Collection<Any>) {
        _sendNotificationActions.addAll(sendNotificationActions)
    }

    public fun sendNotificationActions(sendNotificationActions: IResolvable) {
        cdkBuilder.sendNotificationActions(sendNotificationActions)
    }

    public fun taskActions(vararg taskActions: Any) {
        _taskActions.addAll(listOf(*taskActions))
    }

    public fun taskActions(taskActions: Collection<Any>) {
        _taskActions.addAll(taskActions)
    }

    public fun taskActions(taskActions: IResolvable) {
        cdkBuilder.taskActions(taskActions)
    }

    public fun build(): CfnRule.ActionsProperty {
        if (_assignContactCategoryActions.isNotEmpty()) {
            cdkBuilder.assignContactCategoryActions(_assignContactCategoryActions)
        }
        if (_eventBridgeActions.isNotEmpty()) cdkBuilder.eventBridgeActions(_eventBridgeActions)
        if (_sendNotificationActions.isNotEmpty()) {
            cdkBuilder.sendNotificationActions(_sendNotificationActions)
        }
        if (_taskActions.isNotEmpty()) cdkBuilder.taskActions(_taskActions)
        return cdkBuilder.build()
    }
}
