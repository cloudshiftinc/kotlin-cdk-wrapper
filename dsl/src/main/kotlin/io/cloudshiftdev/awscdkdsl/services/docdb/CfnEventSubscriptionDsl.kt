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

package io.cloudshiftdev.awscdkdsl.services.docdb

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.docdb.CfnEventSubscription
import software.constructs.Construct

/**
 * Creates an Amazon DocumentDB event notification subscription.
 *
 * This action requires a topic Amazon Resource Name (ARN) created by using the Amazon DocumentDB
 * console, the Amazon SNS console, or the Amazon SNS API. To obtain an ARN with Amazon SNS, you
 * must create a topic in Amazon SNS and subscribe to the topic. The ARN is displayed in the Amazon
 * SNS console.
 *
 * You can specify the type of source ( `SourceType` ) that you want to be notified of. You can also
 * provide a list of Amazon DocumentDB sources ( `SourceIds` ) that trigger the events, and you can
 * provide a list of event categories ( `EventCategories` ) for events that you want to be notified
 * of. For example, you can specify `SourceType = db-instance` , `SourceIds = mydbinstance1,
 * mydbinstance2` and `EventCategories = Availability, Backup` .
 *
 * If you specify both the `SourceType` and `SourceIds` (such as `SourceType = db-instance` and
 * `SourceIdentifier = myDBInstance1` ), you are notified of all the `db-instance` events for the
 * specified source. If you specify a `SourceType` but do not specify a `SourceIdentifier` , you
 * receive notice of the events for that source type for all your Amazon DocumentDB sources. If you
 * do not specify either the `SourceType` or the `SourceIdentifier` , you are notified of events
 * generated from all Amazon DocumentDB sources belonging to your customer account.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.docdb.*;
 * CfnEventSubscription cfnEventSubscription = CfnEventSubscription.Builder.create(this,
 * "MyCfnEventSubscription")
 * .snsTopicArn("snsTopicArn")
 * // the properties below are optional
 * .enabled(false)
 * .eventCategories(List.of("eventCategories"))
 * .sourceIds(List.of("sourceIds"))
 * .sourceType("sourceType")
 * .subscriptionName("subscriptionName")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdb-eventsubscription.html)
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

    /**
     * A Boolean value;
     *
     * set to `true` to activate the subscription, set to `false` to create the subscription but not
     * active it.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdb-eventsubscription.html#cfn-docdb-eventsubscription-enabled)
     *
     * @param enabled A Boolean value;.
     */
    public fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
    }

    /**
     * A Boolean value;
     *
     * set to `true` to activate the subscription, set to `false` to create the subscription but not
     * active it.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdb-eventsubscription.html#cfn-docdb-eventsubscription-enabled)
     *
     * @param enabled A Boolean value;.
     */
    public fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled)
    }

    /**
     * A list of event categories for a `SourceType` that you want to subscribe to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdb-eventsubscription.html#cfn-docdb-eventsubscription-eventcategories)
     *
     * @param eventCategories A list of event categories for a `SourceType` that you want to
     *   subscribe to.
     */
    public fun eventCategories(vararg eventCategories: String) {
        _eventCategories.addAll(listOf(*eventCategories))
    }

    /**
     * A list of event categories for a `SourceType` that you want to subscribe to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdb-eventsubscription.html#cfn-docdb-eventsubscription-eventcategories)
     *
     * @param eventCategories A list of event categories for a `SourceType` that you want to
     *   subscribe to.
     */
    public fun eventCategories(eventCategories: Collection<String>) {
        _eventCategories.addAll(eventCategories)
    }

    /**
     * The Amazon Resource Name (ARN) of the SNS topic created for event notification.
     *
     * Amazon SNS creates the ARN when you create a topic and subscribe to it.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdb-eventsubscription.html#cfn-docdb-eventsubscription-snstopicarn)
     *
     * @param snsTopicArn The Amazon Resource Name (ARN) of the SNS topic created for event
     *   notification.
     */
    public fun snsTopicArn(snsTopicArn: String) {
        cdkBuilder.snsTopicArn(snsTopicArn)
    }

    /**
     * The list of identifiers of the event sources for which events are returned.
     *
     * If not specified, then all sources are included in the response. An identifier must begin
     * with a letter and must contain only ASCII letters, digits, and hyphens; it can't end with a
     * hyphen or contain two consecutive hyphens.
     *
     * Constraints:
     * * If `SourceIds` are provided, `SourceType` must also be provided.
     * * If the source type is an instance, a `DBInstanceIdentifier` must be provided.
     * * If the source type is a security group, a `DBSecurityGroupName` must be provided.
     * * If the source type is a parameter group, a `DBParameterGroupName` must be provided.
     * * If the source type is a snapshot, a `DBSnapshotIdentifier` must be provided.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdb-eventsubscription.html#cfn-docdb-eventsubscription-sourceids)
     *
     * @param sourceIds The list of identifiers of the event sources for which events are returned.
     */
    public fun sourceIds(vararg sourceIds: String) {
        _sourceIds.addAll(listOf(*sourceIds))
    }

    /**
     * The list of identifiers of the event sources for which events are returned.
     *
     * If not specified, then all sources are included in the response. An identifier must begin
     * with a letter and must contain only ASCII letters, digits, and hyphens; it can't end with a
     * hyphen or contain two consecutive hyphens.
     *
     * Constraints:
     * * If `SourceIds` are provided, `SourceType` must also be provided.
     * * If the source type is an instance, a `DBInstanceIdentifier` must be provided.
     * * If the source type is a security group, a `DBSecurityGroupName` must be provided.
     * * If the source type is a parameter group, a `DBParameterGroupName` must be provided.
     * * If the source type is a snapshot, a `DBSnapshotIdentifier` must be provided.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdb-eventsubscription.html#cfn-docdb-eventsubscription-sourceids)
     *
     * @param sourceIds The list of identifiers of the event sources for which events are returned.
     */
    public fun sourceIds(sourceIds: Collection<String>) {
        _sourceIds.addAll(sourceIds)
    }

    /**
     * The type of source that is generating the events.
     *
     * For example, if you want to be notified of events generated by an instance, you would set
     * this parameter to `db-instance` . If this value is not specified, all events are returned.
     *
     * Valid values: `db-instance` , `db-cluster` , `db-parameter-group` , `db-security-group` ,
     * `db-cluster-snapshot`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdb-eventsubscription.html#cfn-docdb-eventsubscription-sourcetype)
     *
     * @param sourceType The type of source that is generating the events.
     */
    public fun sourceType(sourceType: String) {
        cdkBuilder.sourceType(sourceType)
    }

    /**
     * The name of the subscription.
     *
     * Constraints: The name must be fewer than 255 characters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdb-eventsubscription.html#cfn-docdb-eventsubscription-subscriptionname)
     *
     * @param subscriptionName The name of the subscription.
     */
    public fun subscriptionName(subscriptionName: String) {
        cdkBuilder.subscriptionName(subscriptionName)
    }

    public fun build(): CfnEventSubscription {
        if (_eventCategories.isNotEmpty()) cdkBuilder.eventCategories(_eventCategories)
        if (_sourceIds.isNotEmpty()) cdkBuilder.sourceIds(_sourceIds)
        return cdkBuilder.build()
    }
}
