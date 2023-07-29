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

package cloudshift.awscdk.dsl.services.s3

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.s3.CfnBucket

/**
 * A container for specifying the configuration for publication of messages to an Amazon Simple
 * Notification Service (Amazon SNS) topic when Amazon S3 detects specified events.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.s3.*;
 * TopicConfigurationProperty topicConfigurationProperty = TopicConfigurationProperty.builder()
 * .event("event")
 * .topic("topic")
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
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-topicconfiguration.html)
 */
@CdkDslMarker
public class CfnBucketTopicConfigurationPropertyDsl {
    private val cdkBuilder: CfnBucket.TopicConfigurationProperty.Builder =
        CfnBucket.TopicConfigurationProperty.builder()

    /**
     * @param event The Amazon S3 bucket event about which to send notifications. For more
     *   information, see
     *   [Supported Event Types](https://docs.aws.amazon.com/AmazonS3/latest/dev/NotificationHowTo.html)
     *   in the *Amazon S3 User Guide* .
     */
    public fun event(event: String) {
        cdkBuilder.event(event)
    }

    /**
     * @param filter The filtering rules that determine for which objects to send notifications. For
     *   example, you can create a filter so that Amazon S3 sends notifications only when image
     *   files with a `.jpg` extension are added to the bucket.
     */
    public fun filter(filter: IResolvable) {
        cdkBuilder.filter(filter)
    }

    /**
     * @param filter The filtering rules that determine for which objects to send notifications. For
     *   example, you can create a filter so that Amazon S3 sends notifications only when image
     *   files with a `.jpg` extension are added to the bucket.
     */
    public fun filter(filter: CfnBucket.NotificationFilterProperty) {
        cdkBuilder.filter(filter)
    }

    /**
     * @param topic The Amazon Resource Name (ARN) of the Amazon SNS topic to which Amazon S3
     *   publishes a message when it detects events of the specified type.
     */
    public fun topic(topic: String) {
        cdkBuilder.topic(topic)
    }

    public fun build(): CfnBucket.TopicConfigurationProperty = cdkBuilder.build()
}
