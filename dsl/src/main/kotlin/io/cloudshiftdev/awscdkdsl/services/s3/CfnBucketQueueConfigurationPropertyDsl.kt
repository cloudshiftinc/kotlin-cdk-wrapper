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

package io.cloudshiftdev.awscdkdsl.services.s3

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.s3.CfnBucket

/**
 * Specifies the configuration for publishing messages to an Amazon Simple Queue Service (Amazon
 * SQS) queue when Amazon S3 detects specified events.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.s3.*;
 * QueueConfigurationProperty queueConfigurationProperty = QueueConfigurationProperty.builder()
 * .event("event")
 * .queue("queue")
 * // the properties below are optional
 * .filter(NotificationFilterProperty.builder()
 * .s3Key(S3KeyFilterProperty.builder()
 * .rules(List.of(FilterRuleProperty.builder()
 * .name("name")
 * .value("value")
 * .build()))
 * .build())
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-queueconfiguration.html)
 */
@CdkDslMarker
public class CfnBucketQueueConfigurationPropertyDsl {
    private val cdkBuilder: CfnBucket.QueueConfigurationProperty.Builder =
        CfnBucket.QueueConfigurationProperty.builder()

    /**
     * @param event The Amazon S3 bucket event about which you want to publish messages to Amazon
     *   SQS.
     *
     * For more information, see
     * [Supported Event Types](https://docs.aws.amazon.com/AmazonS3/latest/dev/NotificationHowTo.html)
     * in the *Amazon S3 User Guide* .
     */
    public fun event(event: String) {
        cdkBuilder.event(event)
    }

    /**
     * @param filter The filtering rules that determine which objects trigger notifications. For
     *   example, you can create a filter so that Amazon S3 sends notifications only when image
     *   files with a `.jpg` extension are added to the bucket. For more information, see
     *   [Configuring event notifications using object key name filtering](https://docs.aws.amazon.com/AmazonS3/latest/user-guide/notification-how-to-filtering.html)
     *   in the *Amazon S3 User Guide* .
     */
    public fun filter(filter: IResolvable) {
        cdkBuilder.filter(filter)
    }

    /**
     * @param filter The filtering rules that determine which objects trigger notifications. For
     *   example, you can create a filter so that Amazon S3 sends notifications only when image
     *   files with a `.jpg` extension are added to the bucket. For more information, see
     *   [Configuring event notifications using object key name filtering](https://docs.aws.amazon.com/AmazonS3/latest/user-guide/notification-how-to-filtering.html)
     *   in the *Amazon S3 User Guide* .
     */
    public fun filter(filter: CfnBucket.NotificationFilterProperty) {
        cdkBuilder.filter(filter)
    }

    /**
     * @param queue The Amazon Resource Name (ARN) of the Amazon SQS queue to which Amazon S3
     *   publishes a message when it detects events of the specified type. FIFO queues are not
     *   allowed when enabling an SQS queue as the event notification destination.
     */
    public fun queue(queue: String) {
        cdkBuilder.queue(queue)
    }

    public fun build(): CfnBucket.QueueConfigurationProperty = cdkBuilder.build()
}
