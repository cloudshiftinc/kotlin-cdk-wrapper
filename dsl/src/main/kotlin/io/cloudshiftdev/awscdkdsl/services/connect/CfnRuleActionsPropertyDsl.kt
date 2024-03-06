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
 * Object emptyValue;
 * Object endAssociatedTasksActions;
 * ActionsProperty actionsProperty = ActionsProperty.builder()
 * .assignContactCategoryActions(List.of(assignContactCategoryActions))
 * .createCaseActions(List.of(CreateCaseActionProperty.builder()
 * .fields(List.of(FieldProperty.builder()
 * .id("id")
 * .value(FieldValueProperty.builder()
 * .booleanValue(false)
 * .doubleValue(123)
 * .emptyValue(emptyValue)
 * .stringValue("stringValue")
 * .build())
 * .build()))
 * .templateId("templateId")
 * .build()))
 * .endAssociatedTasksActions(List.of(endAssociatedTasksActions))
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
 * .updateCaseActions(List.of(UpdateCaseActionProperty.builder()
 * .fields(List.of(FieldProperty.builder()
 * .id("id")
 * .value(FieldValueProperty.builder()
 * .booleanValue(false)
 * .doubleValue(123)
 * .emptyValue(emptyValue)
 * .stringValue("stringValue")
 * .build())
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

    private val _createCaseActions: MutableList<Any> = mutableListOf()

    private val _endAssociatedTasksActions: MutableList<Any> = mutableListOf()

    private val _eventBridgeActions: MutableList<Any> = mutableListOf()

    private val _sendNotificationActions: MutableList<Any> = mutableListOf()

    private val _taskActions: MutableList<Any> = mutableListOf()

    private val _updateCaseActions: MutableList<Any> = mutableListOf()

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

    /** @param createCaseActions This action will create a case when a rule is triggered. */
    public fun createCaseActions(vararg createCaseActions: Any) {
        _createCaseActions.addAll(listOf(*createCaseActions))
    }

    /** @param createCaseActions This action will create a case when a rule is triggered. */
    public fun createCaseActions(createCaseActions: Collection<Any>) {
        _createCaseActions.addAll(createCaseActions)
    }

    /** @param createCaseActions This action will create a case when a rule is triggered. */
    public fun createCaseActions(createCaseActions: IResolvable) {
        cdkBuilder.createCaseActions(createCaseActions)
    }

    /**
     * @param endAssociatedTasksActions This action will end associated tasks when a rule is
     *   triggered.
     */
    public fun endAssociatedTasksActions(vararg endAssociatedTasksActions: Any) {
        _endAssociatedTasksActions.addAll(listOf(*endAssociatedTasksActions))
    }

    /**
     * @param endAssociatedTasksActions This action will end associated tasks when a rule is
     *   triggered.
     */
    public fun endAssociatedTasksActions(endAssociatedTasksActions: Collection<Any>) {
        _endAssociatedTasksActions.addAll(endAssociatedTasksActions)
    }

    /**
     * @param endAssociatedTasksActions This action will end associated tasks when a rule is
     *   triggered.
     */
    public fun endAssociatedTasksActions(endAssociatedTasksActions: IResolvable) {
        cdkBuilder.endAssociatedTasksActions(endAssociatedTasksActions)
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

    /** @param updateCaseActions This action will update a case when a rule is triggered. */
    public fun updateCaseActions(vararg updateCaseActions: Any) {
        _updateCaseActions.addAll(listOf(*updateCaseActions))
    }

    /** @param updateCaseActions This action will update a case when a rule is triggered. */
    public fun updateCaseActions(updateCaseActions: Collection<Any>) {
        _updateCaseActions.addAll(updateCaseActions)
    }

    /** @param updateCaseActions This action will update a case when a rule is triggered. */
    public fun updateCaseActions(updateCaseActions: IResolvable) {
        cdkBuilder.updateCaseActions(updateCaseActions)
    }

    public fun build(): CfnRule.ActionsProperty {
        if (_assignContactCategoryActions.isNotEmpty())
            cdkBuilder.assignContactCategoryActions(_assignContactCategoryActions)
        if (_createCaseActions.isNotEmpty()) cdkBuilder.createCaseActions(_createCaseActions)
        if (_endAssociatedTasksActions.isNotEmpty())
            cdkBuilder.endAssociatedTasksActions(_endAssociatedTasksActions)
        if (_eventBridgeActions.isNotEmpty()) cdkBuilder.eventBridgeActions(_eventBridgeActions)
        if (_sendNotificationActions.isNotEmpty())
            cdkBuilder.sendNotificationActions(_sendNotificationActions)
        if (_taskActions.isNotEmpty()) cdkBuilder.taskActions(_taskActions)
        if (_updateCaseActions.isNotEmpty()) cdkBuilder.updateCaseActions(_updateCaseActions)
        return cdkBuilder.build()
    }
}
