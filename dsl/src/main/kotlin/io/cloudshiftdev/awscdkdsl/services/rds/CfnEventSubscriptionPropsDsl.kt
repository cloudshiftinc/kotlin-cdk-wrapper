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

package io.cloudshiftdev.awscdkdsl.services.rds

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.rds.CfnEventSubscriptionProps

/**
 * Properties for defining a `CfnEventSubscription`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.rds.*;
 * CfnEventSubscriptionProps cfnEventSubscriptionProps = CfnEventSubscriptionProps.builder()
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
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-eventsubscription.html)
 */
@CdkDslMarker
public class CfnEventSubscriptionPropsDsl {
    private val cdkBuilder: CfnEventSubscriptionProps.Builder = CfnEventSubscriptionProps.builder()

    private val _eventCategories: MutableList<String> = mutableListOf()

    private val _sourceIds: MutableList<String> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * @param enabled Specifies whether to activate the subscription. If the event notification
     *   subscription isn't activated, the subscription is created but not active.
     */
    public fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
    }

    /**
     * @param enabled Specifies whether to activate the subscription. If the event notification
     *   subscription isn't activated, the subscription is created but not active.
     */
    public fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled)
    }

    /**
     * @param eventCategories A list of event categories for a particular source type ( `SourceType`
     *   ) that you want to subscribe to. You can see a list of the categories for a given source
     *   type in the "Amazon RDS event categories and event messages" section of the
     *   [*Amazon RDS User Guide*](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Events.Messages.html)
     *   or the
     *   [*Amazon Aurora User Guide*](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_Events.Messages.html)
     *   . You can also see this list by using the `DescribeEventCategories` operation.
     */
    public fun eventCategories(vararg eventCategories: String) {
        _eventCategories.addAll(listOf(*eventCategories))
    }

    /**
     * @param eventCategories A list of event categories for a particular source type ( `SourceType`
     *   ) that you want to subscribe to. You can see a list of the categories for a given source
     *   type in the "Amazon RDS event categories and event messages" section of the
     *   [*Amazon RDS User Guide*](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Events.Messages.html)
     *   or the
     *   [*Amazon Aurora User Guide*](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_Events.Messages.html)
     *   . You can also see this list by using the `DescribeEventCategories` operation.
     */
    public fun eventCategories(eventCategories: Collection<String>) {
        _eventCategories.addAll(eventCategories)
    }

    /**
     * @param snsTopicArn The Amazon Resource Name (ARN) of the SNS topic created for event
     *   notification. SNS automatically creates the ARN when you create a topic and subscribe to
     *   it.
     *
     * RDS doesn't support FIFO (first in, first out) topics. For more information, see
     * [Message ordering and deduplication (FIFO topics)](https://docs.aws.amazon.com/sns/latest/dg/sns-fifo-topics.html)
     * in the *Amazon Simple Notification Service Developer Guide* .
     */
    public fun snsTopicArn(snsTopicArn: String) {
        cdkBuilder.snsTopicArn(snsTopicArn)
    }

    /**
     * @param sourceIds The list of identifiers of the event sources for which events are returned.
     *   If not specified, then all sources are included in the response. An identifier must begin
     *   with a letter and must contain only ASCII letters, digits, and hyphens. It can't end with a
     *   hyphen or contain two consecutive hyphens.
     *
     * Constraints:
     * * If a `SourceIds` value is supplied, `SourceType` must also be provided.
     * * If the source type is a DB instance, a `DBInstanceIdentifier` value must be supplied.
     * * If the source type is a DB cluster, a `DBClusterIdentifier` value must be supplied.
     * * If the source type is a DB parameter group, a `DBParameterGroupName` value must be
     *   supplied.
     * * If the source type is a DB security group, a `DBSecurityGroupName` value must be supplied.
     * * If the source type is a DB snapshot, a `DBSnapshotIdentifier` value must be supplied.
     * * If the source type is a DB cluster snapshot, a `DBClusterSnapshotIdentifier` value must be
     *   supplied.
     */
    public fun sourceIds(vararg sourceIds: String) {
        _sourceIds.addAll(listOf(*sourceIds))
    }

    /**
     * @param sourceIds The list of identifiers of the event sources for which events are returned.
     *   If not specified, then all sources are included in the response. An identifier must begin
     *   with a letter and must contain only ASCII letters, digits, and hyphens. It can't end with a
     *   hyphen or contain two consecutive hyphens.
     *
     * Constraints:
     * * If a `SourceIds` value is supplied, `SourceType` must also be provided.
     * * If the source type is a DB instance, a `DBInstanceIdentifier` value must be supplied.
     * * If the source type is a DB cluster, a `DBClusterIdentifier` value must be supplied.
     * * If the source type is a DB parameter group, a `DBParameterGroupName` value must be
     *   supplied.
     * * If the source type is a DB security group, a `DBSecurityGroupName` value must be supplied.
     * * If the source type is a DB snapshot, a `DBSnapshotIdentifier` value must be supplied.
     * * If the source type is a DB cluster snapshot, a `DBClusterSnapshotIdentifier` value must be
     *   supplied.
     */
    public fun sourceIds(sourceIds: Collection<String>) {
        _sourceIds.addAll(sourceIds)
    }

    /**
     * @param sourceType The type of source that is generating the events. For example, if you want
     *   to be notified of events generated by a DB instance, set this parameter to `db-instance` .
     *   If this value isn't specified, all events are returned.
     *
     * Valid values: `db-instance` | `db-cluster` | `db-parameter-group` | `db-security-group` |
     * `db-snapshot` | `db-cluster-snapshot`
     */
    public fun sourceType(sourceType: String) {
        cdkBuilder.sourceType(sourceType)
    }

    /**
     * @param subscriptionName The name of the subscription. Constraints: The name must be less than
     *   255 characters.
     */
    public fun subscriptionName(subscriptionName: String) {
        cdkBuilder.subscriptionName(subscriptionName)
    }

    /** @param tags An optional array of key-value pairs to apply to this subscription. */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /** @param tags An optional array of key-value pairs to apply to this subscription. */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnEventSubscriptionProps {
        if (_eventCategories.isNotEmpty()) cdkBuilder.eventCategories(_eventCategories)
        if (_sourceIds.isNotEmpty()) cdkBuilder.sourceIds(_sourceIds)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
