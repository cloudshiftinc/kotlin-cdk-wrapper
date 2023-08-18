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

package io.cloudshiftdev.awscdkdsl.services.ses

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ses.CfnConfigurationSetEventDestination

/**
 * Contains the delivery stream ARN and the IAM role ARN associated with an Amazon Kinesis Firehose
 * event destination.
 *
 * Event destinations, such as Amazon Kinesis Firehose, are associated with configuration sets,
 * which enable you to publish email sending events. For information about using configuration sets,
 * see the
 * [Amazon SES Developer Guide](https://docs.aws.amazon.com/ses/latest/dg/monitor-sending-activity.html)
 * .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ses.*;
 * KinesisFirehoseDestinationProperty kinesisFirehoseDestinationProperty =
 * KinesisFirehoseDestinationProperty.builder()
 * .deliveryStreamArn("deliveryStreamArn")
 * .iamRoleArn("iamRoleArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-configurationseteventdestination-kinesisfirehosedestination.html)
 */
@CdkDslMarker
public class CfnConfigurationSetEventDestinationKinesisFirehoseDestinationPropertyDsl {
    private val cdkBuilder:
        CfnConfigurationSetEventDestination.KinesisFirehoseDestinationProperty.Builder =
        CfnConfigurationSetEventDestination.KinesisFirehoseDestinationProperty.builder()

    /**
     * @param deliveryStreamArn The ARN of the Amazon Kinesis Firehose stream that email sending
     *   events should be published to.
     */
    public fun deliveryStreamArn(deliveryStreamArn: String) {
        cdkBuilder.deliveryStreamArn(deliveryStreamArn)
    }

    /**
     * @param iamRoleArn The ARN of the IAM role under which Amazon SES publishes email sending
     *   events to the Amazon Kinesis Firehose stream.
     */
    public fun iamRoleArn(iamRoleArn: String) {
        cdkBuilder.iamRoleArn(iamRoleArn)
    }

    public fun build(): CfnConfigurationSetEventDestination.KinesisFirehoseDestinationProperty =
        cdkBuilder.build()
}
