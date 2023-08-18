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
 * The Amazon S3 bucket location to which Amazon Rekognition publishes the detailed inference
 * results of a video analysis operation.
 *
 * These results include the name of the stream processor resource, the session ID of the stream
 * processing session, and labeled timestamps and bounding boxes for detected labels. For more
 * information, see
 * [S3Destination](https://docs.aws.amazon.com/rekognition/latest/APIReference/API_S3Destination) .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.rekognition.*;
 * S3DestinationProperty s3DestinationProperty = S3DestinationProperty.builder()
 * .bucketName("bucketName")
 * // the properties below are optional
 * .objectKeyPrefix("objectKeyPrefix")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rekognition-streamprocessor-s3destination.html)
 */
@CdkDslMarker
public class CfnStreamProcessorS3DestinationPropertyDsl {
    private val cdkBuilder: CfnStreamProcessor.S3DestinationProperty.Builder =
        CfnStreamProcessor.S3DestinationProperty.builder()

    /**
     * @param bucketName Describes the destination Amazon Simple Storage Service (Amazon S3) bucket
     *   name of a stream processor's exports.
     */
    public fun bucketName(bucketName: String) {
        cdkBuilder.bucketName(bucketName)
    }

    /**
     * @param objectKeyPrefix Describes the destination Amazon Simple Storage Service (Amazon S3)
     *   object keys of a stream processor's exports.
     */
    public fun objectKeyPrefix(objectKeyPrefix: String) {
        cdkBuilder.objectKeyPrefix(objectKeyPrefix)
    }

    public fun build(): CfnStreamProcessor.S3DestinationProperty = cdkBuilder.build()
}
