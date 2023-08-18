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

package io.cloudshiftdev.awscdkdsl.services.kinesisfirehose

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream

/**
 * The `BufferingHints` property type specifies how Amazon Kinesis Data Firehose (Kinesis Data
 * Firehose) buffers incoming data before delivering it to the destination.
 *
 * The first buffer condition that is satisfied triggers Kinesis Data Firehose to deliver the data.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.kinesisfirehose.*;
 * BufferingHintsProperty bufferingHintsProperty = BufferingHintsProperty.builder()
 * .intervalInSeconds(123)
 * .sizeInMBs(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-bufferinghints.html)
 */
@CdkDslMarker
public class CfnDeliveryStreamBufferingHintsPropertyDsl {
    private val cdkBuilder: CfnDeliveryStream.BufferingHintsProperty.Builder =
        CfnDeliveryStream.BufferingHintsProperty.builder()

    /**
     * @param intervalInSeconds The length of time, in seconds, that Kinesis Data Firehose buffers
     *   incoming data before delivering it to the destination. For valid values, see the
     *   `IntervalInSeconds` content for the
     *   [BufferingHints](https://docs.aws.amazon.com/firehose/latest/APIReference/API_BufferingHints.html)
     *   data type in the *Amazon Kinesis Data Firehose API Reference* .
     */
    public fun intervalInSeconds(intervalInSeconds: Number) {
        cdkBuilder.intervalInSeconds(intervalInSeconds)
    }

    /**
     * @param sizeInMBs The size of the buffer, in MBs, that Kinesis Data Firehose uses for incoming
     *   data before delivering it to the destination. For valid values, see the `SizeInMBs` content
     *   for the
     *   [BufferingHints](https://docs.aws.amazon.com/firehose/latest/APIReference/API_BufferingHints.html)
     *   data type in the *Amazon Kinesis Data Firehose API Reference* .
     */
    public fun sizeInMBs(sizeInMBs: Number) {
        cdkBuilder.sizeInMBs(sizeInMBs)
    }

    public fun build(): CfnDeliveryStream.BufferingHintsProperty = cdkBuilder.build()
}
