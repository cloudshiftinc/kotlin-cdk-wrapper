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
 * The Kinesis video stream that provides the source of the streaming video for an Amazon
 * Rekognition Video stream processor.
 *
 * For more information, see
 * [KinesisVideoStream](https://docs.aws.amazon.com/rekognition/latest/APIReference/API_KinesisVideoStream)
 * .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.rekognition.*;
 * KinesisVideoStreamProperty kinesisVideoStreamProperty = KinesisVideoStreamProperty.builder()
 * .arn("arn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rekognition-streamprocessor-kinesisvideostream.html)
 */
@CdkDslMarker
public class CfnStreamProcessorKinesisVideoStreamPropertyDsl {
    private val cdkBuilder: CfnStreamProcessor.KinesisVideoStreamProperty.Builder =
        CfnStreamProcessor.KinesisVideoStreamProperty.builder()

    /** @param arn ARN of the Kinesis video stream stream that streams the source video. */
    public fun arn(arn: String) {
        cdkBuilder.arn(arn)
    }

    public fun build(): CfnStreamProcessor.KinesisVideoStreamProperty = cdkBuilder.build()
}
