@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.connect

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.connect.CfnRule

/**
 * A list of actions to be run when the rule is triggered.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.connect.*;
 * Object assignContactCategoryActions;
 * ActionsProperty actionsProperty = ActionsProperty.builder()
 * .assignContactCategoryActions(List.of(assignContactCategoryActions))
 * .eventBridgeActions(List.of(EventBridgeActionProperty.builder()
 * .name("name")
 * .build()))
 * .sendNotificationActions(List.of(SendNotificationActionProperty.builder()
 * .content("content")
 * .contentType("contentType")
 * .deliveryMethod("deliveryMethod")
 * .recipient(NotificationRecipientTypeProperty.builder()
 * .userArns(List.of("userArns"))
 * .userTags(Map.of(
 * "userTagsKey", "userTags"))
 * .build())
 * // the properties below are optional
 * .subject("subject")
 * .build()))
 * .taskActions(List.of(TaskActionProperty.builder()
 * .contactFlowArn("contactFlowArn")
 * .name("name")
 * // the properties below are optional
 * .description("description")
 * .references(Map.of(
 * "referencesKey", ReferenceProperty.builder()
 * .type("type")
 * .value("value")
 * .build()))
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-rule-actions.html)
 */
@CdkDslMarker
public class CfnRuleActionsPropertyDsl {
    private val cdkBuilder: CfnRule.ActionsProperty.Builder = CfnRule.ActionsProperty.builder()

    private val _assignContactCategoryActions: MutableList<Any> = mutableListOf()

    private val _eventBridgeActions: MutableList<Any> = mutableListOf()

    private val _sendNotificationActions: MutableList<Any> = mutableListOf()

    private val _taskActions: MutableList<Any> = mutableListOf()

    /**
     * @param assignContactCategoryActions Information about the contact category action. The syntax
     *   can be empty, for example, `{}` .
     */
    public fun assignContactCategoryActions(vararg assignContactCategoryActions: Any) {
        _assignContactCategoryActions.addAll(listOf(*assignContactCategoryActions))
    }

    /**
     * @param assignContactCategoryActions Information about the contact category action. The syntax
     *   can be empty, for example, `{}` .
     */
    public fun assignContactCategoryActions(assignContactCategoryActions: Collection<Any>) {
        _assignContactCategoryActions.addAll(assignContactCategoryActions)
    }

    /**
     * @param assignContactCategoryActions Information about the contact category action. The syntax
     *   can be empty, for example, `{}` .
     */
    public fun assignContactCategoryActions(assignContactCategoryActions: IResolvable) {
        cdkBuilder.assignContactCategoryActions(assignContactCategoryActions)
    }

    /** @param eventBridgeActions Information about the EventBridge action. */
    public fun eventBridgeActions(vararg eventBridgeActions: Any) {
        _eventBridgeActions.addAll(listOf(*eventBridgeActions))
    }

    /** @param eventBridgeActions Information about the EventBridge action. */
    public fun eventBridgeActions(eventBridgeActions: Collection<Any>) {
        _eventBridgeActions.addAll(eventBridgeActions)
    }

    /** @param eventBridgeActions Information about the EventBridge action. */
    public fun eventBridgeActions(eventBridgeActions: IResolvable) {
        cdkBuilder.eventBridgeActions(eventBridgeActions)
    }

    /** @param sendNotificationActions Information about the send notification action. */
    public fun sendNotificationActions(vararg sendNotificationActions: Any) {
        _sendNotificationActions.addAll(listOf(*sendNotificationActions))
    }

    /** @param sendNotificationActions Information about the send notification action. */
    public fun sendNotificationActions(sendNotificationActions: Collection<Any>) {
        _sendNotificationActions.addAll(sendNotificationActions)
    }

    /** @param sendNotificationActions Information about the send notification action. */
    public fun sendNotificationActions(sendNotificationActions: IResolvable) {
        cdkBuilder.sendNotificationActions(sendNotificationActions)
    }

    /**
     * @param taskActions Information about the task action. This field is required if
     *   `TriggerEventSource` is one of the following values: `OnZendeskTicketCreate` |
     *   `OnZendeskTicketStatusUpdate` | `OnSalesforceCaseCreate`
     */
    public fun taskActions(vararg taskActions: Any) {
        _taskActions.addAll(listOf(*taskActions))
    }

    /**
     * @param taskActions Information about the task action. This field is required if
     *   `TriggerEventSource` is one of the following values: `OnZendeskTicketCreate` |
     *   `OnZendeskTicketStatusUpdate` | `OnSalesforceCaseCreate`
     */
    public fun taskActions(taskActions: Collection<Any>) {
        _taskActions.addAll(taskActions)
    }

    /**
     * @param taskActions Information about the task action. This field is required if
     *   `TriggerEventSource` is one of the following values: `OnZendeskTicketCreate` |
     *   `OnZendeskTicketStatusUpdate` | `OnSalesforceCaseCreate`
     */
    public fun taskActions(taskActions: IResolvable) {
        cdkBuilder.taskActions(taskActions)
    }

    public fun build(): CfnRule.ActionsProperty {
        if (_assignContactCategoryActions.isNotEmpty())
            cdkBuilder.assignContactCategoryActions(_assignContactCategoryActions)
        if (_eventBridgeActions.isNotEmpty()) cdkBuilder.eventBridgeActions(_eventBridgeActions)
        if (_sendNotificationActions.isNotEmpty())
            cdkBuilder.sendNotificationActions(_sendNotificationActions)
        if (_taskActions.isNotEmpty()) cdkBuilder.taskActions(_taskActions)
        return cdkBuilder.build()
    }
}
