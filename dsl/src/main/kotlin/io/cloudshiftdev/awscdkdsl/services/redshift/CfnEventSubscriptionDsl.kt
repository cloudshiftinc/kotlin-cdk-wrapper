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

package io.cloudshiftdev.awscdkdsl.services.redshift

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.redshift.CfnEventSubscription
import software.constructs.Construct

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-eventsubscription.html.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.redshift.*;
 * CfnEventSubscription cfnEventSubscription = CfnEventSubscription.Builder.create(this,
 * "MyCfnEventSubscription")
 * .subscriptionName("subscriptionName")
 * // the properties below are optional
 * .enabled(false)
 * .eventCategories(List.of("eventCategories"))
 * .severity("severity")
 * .snsTopicArn("snsTopicArn")
 * .sourceIds(List.of("sourceIds"))
 * .sourceType("sourceType")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-eventsubscription.html)
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
     * A boolean value;
     *
     * set to `true` to activate the subscription, and set to `false` to create the subscription but
     * not activate it.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-eventsubscription.html#cfn-redshift-eventsubscription-enabled)
     *
     * @param enabled A boolean value;.
     */
    public fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
    }

    /**
     * A boolean value;
     *
     * set to `true` to activate the subscription, and set to `false` to create the subscription but
     * not activate it.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-eventsubscription.html#cfn-redshift-eventsubscription-enabled)
     *
     * @param enabled A boolean value;.
     */
    public fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled)
    }

    /**
     * Specifies the Amazon Redshift event categories to be published by the event notification
     * subscription.
     *
     * Values: configuration, management, monitoring, security, pending
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-eventsubscription.html#cfn-redshift-eventsubscription-eventcategories)
     *
     * @param eventCategories Specifies the Amazon Redshift event categories to be published by the
     *   event notification subscription.
     */
    public fun eventCategories(vararg eventCategories: String) {
        _eventCategories.addAll(listOf(*eventCategories))
    }

    /**
     * Specifies the Amazon Redshift event categories to be published by the event notification
     * subscription.
     *
     * Values: configuration, management, monitoring, security, pending
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-eventsubscription.html#cfn-redshift-eventsubscription-eventcategories)
     *
     * @param eventCategories Specifies the Amazon Redshift event categories to be published by the
     *   event notification subscription.
     */
    public fun eventCategories(eventCategories: Collection<String>) {
        _eventCategories.addAll(eventCategories)
    }

    /**
     * Specifies the Amazon Redshift event severity to be published by the event notification
     * subscription.
     *
     * Values: ERROR, INFO
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-eventsubscription.html#cfn-redshift-eventsubscription-severity)
     *
     * @param severity Specifies the Amazon Redshift event severity to be published by the event
     *   notification subscription.
     */
    public fun severity(severity: String) {
        cdkBuilder.severity(severity)
    }

    /**
     * The Amazon Resource Name (ARN) of the Amazon SNS topic used to transmit the event
     * notifications.
     *
     * The ARN is created by Amazon SNS when you create a topic and subscribe to it.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-eventsubscription.html#cfn-redshift-eventsubscription-snstopicarn)
     *
     * @param snsTopicArn The Amazon Resource Name (ARN) of the Amazon SNS topic used to transmit
     *   the event notifications.
     */
    public fun snsTopicArn(snsTopicArn: String) {
        cdkBuilder.snsTopicArn(snsTopicArn)
    }

    /**
     * A list of one or more identifiers of Amazon Redshift source objects.
     *
     * All of the objects must be of the same type as was specified in the source type parameter.
     * The event subscription will return only events generated by the specified objects. If not
     * specified, then events are returned for all objects within the source type specified.
     *
     * Example: my-cluster-1, my-cluster-2
     *
     * Example: my-snapshot-20131010
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-eventsubscription.html#cfn-redshift-eventsubscription-sourceids)
     *
     * @param sourceIds A list of one or more identifiers of Amazon Redshift source objects.
     */
    public fun sourceIds(vararg sourceIds: String) {
        _sourceIds.addAll(listOf(*sourceIds))
    }

    /**
     * A list of one or more identifiers of Amazon Redshift source objects.
     *
     * All of the objects must be of the same type as was specified in the source type parameter.
     * The event subscription will return only events generated by the specified objects. If not
     * specified, then events are returned for all objects within the source type specified.
     *
     * Example: my-cluster-1, my-cluster-2
     *
     * Example: my-snapshot-20131010
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-eventsubscription.html#cfn-redshift-eventsubscription-sourceids)
     *
     * @param sourceIds A list of one or more identifiers of Amazon Redshift source objects.
     */
    public fun sourceIds(sourceIds: Collection<String>) {
        _sourceIds.addAll(sourceIds)
    }

    /**
     * The type of source that will be generating the events.
     *
     * For example, if you want to be notified of events generated by a cluster, you would set this
     * parameter to cluster. If this value is not specified, events are returned for all Amazon
     * Redshift objects in your AWS account . You must specify a source type in order to specify
     * source IDs.
     *
     * Valid values: cluster, cluster-parameter-group, cluster-security-group, cluster-snapshot, and
     * scheduled-action.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-eventsubscription.html#cfn-redshift-eventsubscription-sourcetype)
     *
     * @param sourceType The type of source that will be generating the events.
     */
    public fun sourceType(sourceType: String) {
        cdkBuilder.sourceType(sourceType)
    }

    /**
     * The name of the event subscription to be created.
     *
     * Constraints:
     * * Cannot be null, empty, or blank.
     * * Must contain from 1 to 255 alphanumeric characters or hyphens.
     * * First character must be a letter.
     * * Cannot end with a hyphen or contain two consecutive hyphens.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-eventsubscription.html#cfn-redshift-eventsubscription-subscriptionname)
     *
     * @param subscriptionName The name of the event subscription to be created.
     */
    public fun subscriptionName(subscriptionName: String) {
        cdkBuilder.subscriptionName(subscriptionName)
    }

    /**
     * A list of tag instances.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-eventsubscription.html#cfn-redshift-eventsubscription-tags)
     *
     * @param tags A list of tag instances.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * A list of tag instances.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-eventsubscription.html#cfn-redshift-eventsubscription-tags)
     *
     * @param tags A list of tag instances.
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
