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
import kotlin.String
import software.amazon.awscdk.services.ses.CfnConfigurationSetEventDestination

/**
 * Contains the topic ARN associated with an Amazon Simple Notification Service (Amazon SNS) event
 * destination.
 *
 * Event destinations, such as Amazon SNS, are associated with configuration sets, which enable you
 * to publish email sending events. For information about using configuration sets, see the
 * [Amazon SES Developer Guide](https://docs.aws.amazon.com/ses/latest/dg/monitor-sending-activity.html)
 * .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ses.*;
 * SnsDestinationProperty snsDestinationProperty = SnsDestinationProperty.builder()
 * .topicArn("topicArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-configurationseteventdestination-snsdestination.html)
 */
@CdkDslMarker
public class CfnConfigurationSetEventDestinationSnsDestinationPropertyDsl {
    private val cdkBuilder: CfnConfigurationSetEventDestination.SnsDestinationProperty.Builder =
        CfnConfigurationSetEventDestination.SnsDestinationProperty.builder()

    /**
     * @param topicArn The ARN of the Amazon SNS topic for email sending events. You can find the
     *   ARN of a topic by using the
     *   [ListTopics](https://docs.aws.amazon.com/sns/latest/api/API_ListTopics.html) Amazon SNS
     *   operation.
     *
     * For more information about Amazon SNS topics, see the
     * [Amazon SNS Developer Guide](https://docs.aws.amazon.com/sns/latest/dg/CreateTopic.html) .
     */
    public fun topicArn(topicArn: String) {
        cdkBuilder.topicArn(topicArn)
    }

    public fun build(): CfnConfigurationSetEventDestination.SnsDestinationProperty =
        cdkBuilder.build()
}
