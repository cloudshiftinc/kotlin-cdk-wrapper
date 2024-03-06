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
 * The buffering options.
 *
 * If no value is specified, the default values for Splunk are used.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.kinesisfirehose.*;
 * SplunkBufferingHintsProperty splunkBufferingHintsProperty =
 * SplunkBufferingHintsProperty.builder()
 * .intervalInSeconds(123)
 * .sizeInMBs(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-splunkbufferinghints.html)
 */
@CdkDslMarker
public class CfnDeliveryStreamSplunkBufferingHintsPropertyDsl {
    private val cdkBuilder: CfnDeliveryStream.SplunkBufferingHintsProperty.Builder =
        CfnDeliveryStream.SplunkBufferingHintsProperty.builder()

    /**
     * @param intervalInSeconds Buffer incoming data for the specified period of time, in seconds,
     *   before delivering it to the destination. The default value is 60 (1 minute).
     */
    public fun intervalInSeconds(intervalInSeconds: Number) {
        cdkBuilder.intervalInSeconds(intervalInSeconds)
    }

    /**
     * @param sizeInMBs Buffer incoming data to the specified size, in MBs, before delivering it to
     *   the destination. The default value is 5.
     */
    public fun sizeInMBs(sizeInMBs: Number) {
        cdkBuilder.sizeInMBs(sizeInMBs)
    }

    public fun build(): CfnDeliveryStream.SplunkBufferingHintsProperty = cdkBuilder.build()
}
