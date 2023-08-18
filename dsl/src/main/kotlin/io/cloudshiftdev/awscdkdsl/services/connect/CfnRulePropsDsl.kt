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

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.connect.CfnRule
import software.amazon.awscdk.services.connect.CfnRuleProps

/**
 * Properties for defining a `CfnRule`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.connect.*;
 * Object assignContactCategoryActions;
 * CfnRuleProps cfnRuleProps = CfnRuleProps.builder()
 * .actions(ActionsProperty.builder()
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
 * .build())
 * .function("function")
 * .instanceArn("instanceArn")
 * .name("name")
 * .publishStatus("publishStatus")
 * .triggerEventSource(RuleTriggerEventSourceProperty.builder()
 * .eventSourceName("eventSourceName")
 * // the properties below are optional
 * .integrationAssociationArn("integrationAssociationArn")
 * .build())
 * // the properties below are optional
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-rule.html)
 */
@CdkDslMarker
public class CfnRulePropsDsl {
    private val cdkBuilder: CfnRuleProps.Builder = CfnRuleProps.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /** @param actions A list of actions to be run when the rule is triggered. */
    public fun actions(actions: IResolvable) {
        cdkBuilder.actions(actions)
    }

    /** @param actions A list of actions to be run when the rule is triggered. */
    public fun actions(actions: CfnRule.ActionsProperty) {
        cdkBuilder.actions(actions)
    }

    /** @param function The conditions of the rule. */
    public fun function(function: String) {
        cdkBuilder.function(function)
    }

    /** @param instanceArn The Amazon Resource Name (ARN) of the instance. */
    public fun instanceArn(instanceArn: String) {
        cdkBuilder.instanceArn(instanceArn)
    }

    /** @param name The name of the rule. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * @param publishStatus The publish status of the rule. *Allowed values* : `DRAFT` | `PUBLISHED`
     */
    public fun publishStatus(publishStatus: String) {
        cdkBuilder.publishStatus(publishStatus)
    }

    /**
     * @param tags The tags used to organize, track, or control access for this resource. For
     *   example, { "tags": {"key1":"value1", "key2":"value2"} }.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * @param tags The tags used to organize, track, or control access for this resource. For
     *   example, { "tags": {"key1":"value1", "key2":"value2"} }.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    /** @param triggerEventSource The event source to trigger the rule. */
    public fun triggerEventSource(triggerEventSource: IResolvable) {
        cdkBuilder.triggerEventSource(triggerEventSource)
    }

    /** @param triggerEventSource The event source to trigger the rule. */
    public fun triggerEventSource(triggerEventSource: CfnRule.RuleTriggerEventSourceProperty) {
        cdkBuilder.triggerEventSource(triggerEventSource)
    }

    public fun build(): CfnRuleProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
