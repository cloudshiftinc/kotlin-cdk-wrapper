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

package cloudshift.awscdk.dsl.services.ses

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ses.CfnConfigurationSetEventDestination

/**
 * Contains information about an event destination.
 *
 * When you create or update an event destination, you must provide one, and only one, destination.
 * The destination can be Amazon CloudWatch, Amazon Kinesis Firehose or Amazon Simple Notification
 * Service (Amazon SNS).
 *
 * Event destinations are associated with configuration sets, which enable you to publish email
 * sending events to Amazon CloudWatch, Amazon Kinesis Firehose, or Amazon Simple Notification
 * Service (Amazon SNS). For information about using configuration sets, see the
 * [Amazon SES Developer Guide](https://docs.aws.amazon.com/ses/latest/dg/monitor-sending-activity.html)
 * .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ses.*;
 * EventDestinationProperty eventDestinationProperty = EventDestinationProperty.builder()
 * .matchingEventTypes(List.of("matchingEventTypes"))
 * // the properties below are optional
 * .cloudWatchDestination(CloudWatchDestinationProperty.builder()
 * .dimensionConfigurations(List.of(DimensionConfigurationProperty.builder()
 * .defaultDimensionValue("defaultDimensionValue")
 * .dimensionName("dimensionName")
 * .dimensionValueSource("dimensionValueSource")
 * .build()))
 * .build())
 * .enabled(false)
 * .kinesisFirehoseDestination(KinesisFirehoseDestinationProperty.builder()
 * .deliveryStreamArn("deliveryStreamArn")
 * .iamRoleArn("iamRoleArn")
 * .build())
 * .name("name")
 * .snsDestination(SnsDestinationProperty.builder()
 * .topicArn("topicArn")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-configurationseteventdestination-eventdestination.html)
 */
@CdkDslMarker
public class CfnConfigurationSetEventDestinationEventDestinationPropertyDsl {
    private val cdkBuilder: CfnConfigurationSetEventDestination.EventDestinationProperty.Builder =
        CfnConfigurationSetEventDestination.EventDestinationProperty.builder()

    private val _matchingEventTypes: MutableList<String> = mutableListOf()

    /**
     * @param cloudWatchDestination An object that contains the names, default values, and sources
     *   of the dimensions associated with an Amazon CloudWatch event destination.
     */
    public fun cloudWatchDestination(cloudWatchDestination: IResolvable) {
        cdkBuilder.cloudWatchDestination(cloudWatchDestination)
    }

    /**
     * @param cloudWatchDestination An object that contains the names, default values, and sources
     *   of the dimensions associated with an Amazon CloudWatch event destination.
     */
    public fun cloudWatchDestination(
        cloudWatchDestination: CfnConfigurationSetEventDestination.CloudWatchDestinationProperty
    ) {
        cdkBuilder.cloudWatchDestination(cloudWatchDestination)
    }

    /**
     * @param enabled Sets whether Amazon SES publishes events to this destination when you send an
     *   email with the associated configuration set. Set to `true` to enable publishing to this
     *   destination; set to `false` to prevent publishing to this destination. The default value is
     *   `false` .
     */
    public fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
    }

    /**
     * @param enabled Sets whether Amazon SES publishes events to this destination when you send an
     *   email with the associated configuration set. Set to `true` to enable publishing to this
     *   destination; set to `false` to prevent publishing to this destination. The default value is
     *   `false` .
     */
    public fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled)
    }

    /**
     * @param kinesisFirehoseDestination An object that contains the delivery stream ARN and the IAM
     *   role ARN associated with an Amazon Kinesis Firehose event destination.
     */
    public fun kinesisFirehoseDestination(kinesisFirehoseDestination: IResolvable) {
        cdkBuilder.kinesisFirehoseDestination(kinesisFirehoseDestination)
    }

    /**
     * @param kinesisFirehoseDestination An object that contains the delivery stream ARN and the IAM
     *   role ARN associated with an Amazon Kinesis Firehose event destination.
     */
    public fun kinesisFirehoseDestination(
        kinesisFirehoseDestination:
            CfnConfigurationSetEventDestination.KinesisFirehoseDestinationProperty
    ) {
        cdkBuilder.kinesisFirehoseDestination(kinesisFirehoseDestination)
    }

    /**
     * @param matchingEventTypes The type of email sending events to publish to the event
     *   destination.
     * * `send` - The send request was successful and SES will attempt to deliver the message to the
     *   recipient’s mail server. (If account-level or global suppression is being used, SES will
     *   still count it as a send, but delivery is suppressed.)
     * * `reject` - SES accepted the email, but determined that it contained a virus and didn’t
     *   attempt to deliver it to the recipient’s mail server.
     * * `bounce` - ( *Hard bounce* ) The recipient's mail server permanently rejected the email. (
     *   *Soft bounces* are only included when SES fails to deliver the email after retrying for a
     *   period of time.)
     * * `complaint` - The email was successfully delivered to the recipient’s mail server, but the
     *   recipient marked it as spam.
     * * `delivery` - SES successfully delivered the email to the recipient's mail server.
     * * `open` - The recipient received the message and opened it in their email client.
     * * `click` - The recipient clicked one or more links in the email.
     * * `renderingFailure` - The email wasn't sent because of a template rendering issue. This
     *   event type can occur when template data is missing, or when there is a mismatch between
     *   template parameters and data. (This event type only occurs when you send email using the
     *   [`SendTemplatedEmail`](https://docs.aws.amazon.com/ses/latest/APIReference/API_SendTemplatedEmail.html)
     *   or
     *   [`SendBulkTemplatedEmail`](https://docs.aws.amazon.com/ses/latest/APIReference/API_SendBulkTemplatedEmail.html)
     *   API operations.)
     * * `deliveryDelay` - The email couldn't be delivered to the recipient’s mail server because a
     *   temporary issue occurred. Delivery delays can occur, for example, when the recipient's
     *   inbox is full, or when the receiving email server experiences a transient issue.
     * * `subscription` - The email was successfully delivered, but the recipient updated their
     *   subscription preferences by clicking on an *unsubscribe* link as part of your
     *   [subscription management](https://docs.aws.amazon.com/ses/latest/dg/sending-email-subscription-management.html)
     *   .
     */
    public fun matchingEventTypes(vararg matchingEventTypes: String) {
        _matchingEventTypes.addAll(listOf(*matchingEventTypes))
    }

    /**
     * @param matchingEventTypes The type of email sending events to publish to the event
     *   destination.
     * * `send` - The send request was successful and SES will attempt to deliver the message to the
     *   recipient’s mail server. (If account-level or global suppression is being used, SES will
     *   still count it as a send, but delivery is suppressed.)
     * * `reject` - SES accepted the email, but determined that it contained a virus and didn’t
     *   attempt to deliver it to the recipient’s mail server.
     * * `bounce` - ( *Hard bounce* ) The recipient's mail server permanently rejected the email. (
     *   *Soft bounces* are only included when SES fails to deliver the email after retrying for a
     *   period of time.)
     * * `complaint` - The email was successfully delivered to the recipient’s mail server, but the
     *   recipient marked it as spam.
     * * `delivery` - SES successfully delivered the email to the recipient's mail server.
     * * `open` - The recipient received the message and opened it in their email client.
     * * `click` - The recipient clicked one or more links in the email.
     * * `renderingFailure` - The email wasn't sent because of a template rendering issue. This
     *   event type can occur when template data is missing, or when there is a mismatch between
     *   template parameters and data. (This event type only occurs when you send email using the
     *   [`SendTemplatedEmail`](https://docs.aws.amazon.com/ses/latest/APIReference/API_SendTemplatedEmail.html)
     *   or
     *   [`SendBulkTemplatedEmail`](https://docs.aws.amazon.com/ses/latest/APIReference/API_SendBulkTemplatedEmail.html)
     *   API operations.)
     * * `deliveryDelay` - The email couldn't be delivered to the recipient’s mail server because a
     *   temporary issue occurred. Delivery delays can occur, for example, when the recipient's
     *   inbox is full, or when the receiving email server experiences a transient issue.
     * * `subscription` - The email was successfully delivered, but the recipient updated their
     *   subscription preferences by clicking on an *unsubscribe* link as part of your
     *   [subscription management](https://docs.aws.amazon.com/ses/latest/dg/sending-email-subscription-management.html)
     *   .
     */
    public fun matchingEventTypes(matchingEventTypes: Collection<String>) {
        _matchingEventTypes.addAll(matchingEventTypes)
    }

    /**
     * @param name The name of the event destination. The name must meet the following
     *   requirements:.
     * * Contain only ASCII letters (a-z, A-Z), numbers (0-9), underscores (_), or dashes (-).
     * * Contain 64 characters or fewer.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * @param snsDestination An object that contains the topic ARN associated with an Amazon Simple
     *   Notification Service (Amazon SNS) event destination.
     */
    public fun snsDestination(snsDestination: IResolvable) {
        cdkBuilder.snsDestination(snsDestination)
    }

    /**
     * @param snsDestination An object that contains the topic ARN associated with an Amazon Simple
     *   Notification Service (Amazon SNS) event destination.
     */
    public fun snsDestination(
        snsDestination: CfnConfigurationSetEventDestination.SnsDestinationProperty
    ) {
        cdkBuilder.snsDestination(snsDestination)
    }

    public fun build(): CfnConfigurationSetEventDestination.EventDestinationProperty {
        if (_matchingEventTypes.isNotEmpty()) cdkBuilder.matchingEventTypes(_matchingEventTypes)
        return cdkBuilder.build()
    }
}
