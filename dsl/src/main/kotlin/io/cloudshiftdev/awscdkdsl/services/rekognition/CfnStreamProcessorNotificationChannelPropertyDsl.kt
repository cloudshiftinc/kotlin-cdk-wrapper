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

package io.cloudshiftdev.awscdkdsl.services.rekognition

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.rekognition.CfnStreamProcessor

/**
 * The Amazon Simple Notification Service topic to which Amazon Rekognition publishes the object
 * detection results and completion status of a video analysis operation.
 *
 * Amazon Rekognition publishes a notification the first time an object of interest or a person is
 * detected in the video stream. Amazon Rekognition also publishes an an end-of-session notification
 * with a summary when the stream processing session is complete. For more information, see
 * [StreamProcessorNotificationChannel](https://docs.aws.amazon.com/rekognition/latest/APIReference/API_StreamProcessorNotificationChannel)
 * .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.rekognition.*;
 * NotificationChannelProperty notificationChannelProperty = NotificationChannelProperty.builder()
 * .arn("arn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rekognition-streamprocessor-notificationchannel.html)
 */
@CdkDslMarker
public class CfnStreamProcessorNotificationChannelPropertyDsl {
    private val cdkBuilder: CfnStreamProcessor.NotificationChannelProperty.Builder =
        CfnStreamProcessor.NotificationChannelProperty.builder()

    /** @param arn The ARN of the SNS topic that receives notifications. */
    public fun arn(arn: String) {
        cdkBuilder.arn(arn)
    }

    public fun build(): CfnStreamProcessor.NotificationChannelProperty = cdkBuilder.build()
}
