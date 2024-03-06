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

package io.cloudshiftdev.awscdkdsl.services.medialive

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.medialive.CfnMultiplex

/**
 * Contains configuration for a Multiplex event.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.medialive.*;
 * MultiplexSettingsProperty multiplexSettingsProperty = MultiplexSettingsProperty.builder()
 * .transportStreamBitrate(123)
 * .transportStreamId(123)
 * // the properties below are optional
 * .maximumVideoBufferDelayMilliseconds(123)
 * .transportStreamReservedBitrate(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-multiplex-multiplexsettings.html)
 */
@CdkDslMarker
public class CfnMultiplexMultiplexSettingsPropertyDsl {
    private val cdkBuilder: CfnMultiplex.MultiplexSettingsProperty.Builder =
        CfnMultiplex.MultiplexSettingsProperty.builder()

    /** @param maximumVideoBufferDelayMilliseconds Maximum video buffer delay in milliseconds. */
    public fun maximumVideoBufferDelayMilliseconds(maximumVideoBufferDelayMilliseconds: Number) {
        cdkBuilder.maximumVideoBufferDelayMilliseconds(maximumVideoBufferDelayMilliseconds)
    }

    /** @param transportStreamBitrate Transport stream bit rate. */
    public fun transportStreamBitrate(transportStreamBitrate: Number) {
        cdkBuilder.transportStreamBitrate(transportStreamBitrate)
    }

    /** @param transportStreamId Transport stream ID. */
    public fun transportStreamId(transportStreamId: Number) {
        cdkBuilder.transportStreamId(transportStreamId)
    }

    /** @param transportStreamReservedBitrate Transport stream reserved bit rate. */
    public fun transportStreamReservedBitrate(transportStreamReservedBitrate: Number) {
        cdkBuilder.transportStreamReservedBitrate(transportStreamReservedBitrate)
    }

    public fun build(): CfnMultiplex.MultiplexSettingsProperty = cdkBuilder.build()
}
