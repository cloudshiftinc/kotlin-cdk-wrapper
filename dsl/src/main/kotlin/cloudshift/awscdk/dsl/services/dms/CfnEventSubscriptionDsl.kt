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

package cloudshift.awscdk.dsl.services.dms

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.dms.CfnEventSubscription
import software.constructs.Construct

/**
 * Use the `AWS::DMS::EventSubscription` resource to get notifications for AWS Database Migration
 * Service events through the Amazon Simple Notification Service .
 *
 * For more information, see
 * [Working with events and notifications in AWS Database Migration Service](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Events.html)
 * in the *AWS Database Migration Service User Guide* .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.dms.*;
 * CfnEventSubscription cfnEventSubscription = CfnEventSubscription.Builder.create(this,
 * "MyCfnEventSubscription")
 * .snsTopicArn("snsTopicArn")
 * // the properties below are optional
 * .enabled(false)
 * .eventCategories(List.of("eventCategories"))
 * .sourceIds(List.of("sourceIds"))
 * .sourceType("sourceType")
 * .subscriptionName("subscriptionName")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-eventsubscription.html)
 */
@CdkDslMarker
public class CfnEventSubscriptionDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnEventSubscription.Builder =
        CfnEventSubscription.Builder.create(scope, id)

    private val _eventCategories: MutableList<String> = mutableListOf()

    private val _sourceIds: MutableList<String> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * Indicates whether to activate the subscription.
     *
     * If you don't specify this property, AWS CloudFormation activates the subscription.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-eventsubscription.html#cfn-dms-eventsubscription-enabled)
     *
     * @param enabled Indicates whether to activate the subscription.
     */
    public fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
    }

    /**
     * Indicates whether to activate the subscription.
     *
     * If you don't specify this property, AWS CloudFormation activates the subscription.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-eventsubscription.html#cfn-dms-eventsubscription-enabled)
     *
     * @param enabled Indicates whether to activate the subscription.
     */
    public fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled)
    }

    /**
     * A list of event categories for a source type that you want to subscribe to.
     *
     * If you don't specify this property, you are notified about all event categories. For more
     * information, see
     * [Working with Events and Notifications](https://docs.aws.amazon.com//dms/latest/userguide/CHAP_Events.html)
     * in the *AWS DMS User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-eventsubscription.html#cfn-dms-eventsubscription-eventcategories)
     *
     * @param eventCategories A list of event categories for a source type that you want to
     *   subscribe to.
     */
    public fun eventCategories(vararg eventCategories: String) {
        _eventCategories.addAll(listOf(*eventCategories))
    }

    /**
     * A list of event categories for a source type that you want to subscribe to.
     *
     * If you don't specify this property, you are notified about all event categories. For more
     * information, see
     * [Working with Events and Notifications](https://docs.aws.amazon.com//dms/latest/userguide/CHAP_Events.html)
     * in the *AWS DMS User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-eventsubscription.html#cfn-dms-eventsubscription-eventcategories)
     *
     * @param eventCategories A list of event categories for a source type that you want to
     *   subscribe to.
     */
    public fun eventCategories(eventCategories: Collection<String>) {
        _eventCategories.addAll(eventCategories)
    }

    /**
     * The Amazon Resource Name (ARN) of the Amazon SNS topic created for event notification.
     *
     * The ARN is created by Amazon SNS when you create a topic and subscribe to it.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-eventsubscription.html#cfn-dms-eventsubscription-snstopicarn)
     *
     * @param snsTopicArn The Amazon Resource Name (ARN) of the Amazon SNS topic created for event
     *   notification.
     */
    public fun snsTopicArn(snsTopicArn: String) {
        cdkBuilder.snsTopicArn(snsTopicArn)
    }

    /**
     * A list of identifiers for which AWS DMS provides notification events.
     *
     * If you don't specify a value, notifications are provided for all sources.
     *
     * If you specify multiple values, they must be of the same type. For example, if you specify a
     * database instance ID, then all of the other values must be database instance IDs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-eventsubscription.html#cfn-dms-eventsubscription-sourceids)
     *
     * @param sourceIds A list of identifiers for which AWS DMS provides notification events.
     */
    public fun sourceIds(vararg sourceIds: String) {
        _sourceIds.addAll(listOf(*sourceIds))
    }

    /**
     * A list of identifiers for which AWS DMS provides notification events.
     *
     * If you don't specify a value, notifications are provided for all sources.
     *
     * If you specify multiple values, they must be of the same type. For example, if you specify a
     * database instance ID, then all of the other values must be database instance IDs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-eventsubscription.html#cfn-dms-eventsubscription-sourceids)
     *
     * @param sourceIds A list of identifiers for which AWS DMS provides notification events.
     */
    public fun sourceIds(sourceIds: Collection<String>) {
        _sourceIds.addAll(sourceIds)
    }

    /**
     * The type of AWS DMS resource that generates the events.
     *
     * For example, if you want to be notified of events generated by a replication instance, you
     * set this parameter to `replication-instance` . If this value isn't specified, all events are
     * returned.
     *
     * *Valid values* : `replication-instance` | `replication-task`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-eventsubscription.html#cfn-dms-eventsubscription-sourcetype)
     *
     * @param sourceType The type of AWS DMS resource that generates the events.
     */
    public fun sourceType(sourceType: String) {
        cdkBuilder.sourceType(sourceType)
    }

    /**
     * The name of the AWS DMS event notification subscription.
     *
     * This name must be less than 255 characters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-eventsubscription.html#cfn-dms-eventsubscription-subscriptionname)
     *
     * @param subscriptionName The name of the AWS DMS event notification subscription.
     */
    public fun subscriptionName(subscriptionName: String) {
        cdkBuilder.subscriptionName(subscriptionName)
    }

    /**
     * One or more tags to be assigned to the event subscription.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-eventsubscription.html#cfn-dms-eventsubscription-tags)
     *
     * @param tags One or more tags to be assigned to the event subscription.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * One or more tags to be assigned to the event subscription.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-eventsubscription.html#cfn-dms-eventsubscription-tags)
     *
     * @param tags One or more tags to be assigned to the event subscription.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnEventSubscription {
        if (_eventCategories.isNotEmpty()) cdkBuilder.eventCategories(_eventCategories)
        if (_sourceIds.isNotEmpty()) cdkBuilder.sourceIds(_sourceIds)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
