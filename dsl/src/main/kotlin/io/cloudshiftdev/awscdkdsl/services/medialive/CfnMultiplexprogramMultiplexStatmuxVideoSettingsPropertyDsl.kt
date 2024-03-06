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
import software.amazon.awscdk.services.medialive.CfnMultiplexprogram

/**
 * Statmux rate control settings.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.medialive.*;
 * MultiplexStatmuxVideoSettingsProperty multiplexStatmuxVideoSettingsProperty =
 * MultiplexStatmuxVideoSettingsProperty.builder()
 * .maximumBitrate(123)
 * .minimumBitrate(123)
 * .priority(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-multiplexprogram-multiplexstatmuxvideosettings.html)
 */
@CdkDslMarker
public class CfnMultiplexprogramMultiplexStatmuxVideoSettingsPropertyDsl {
    private val cdkBuilder: CfnMultiplexprogram.MultiplexStatmuxVideoSettingsProperty.Builder =
        CfnMultiplexprogram.MultiplexStatmuxVideoSettingsProperty.builder()

    /** @param maximumBitrate Maximum statmux bitrate. */
    public fun maximumBitrate(maximumBitrate: Number) {
        cdkBuilder.maximumBitrate(maximumBitrate)
    }

    /** @param minimumBitrate Minimum statmux bitrate. */
    public fun minimumBitrate(minimumBitrate: Number) {
        cdkBuilder.minimumBitrate(minimumBitrate)
    }

    /**
     * @param priority The purpose of the priority is to use a combination of the\nmultiplex rate
     *   control algorithm and the QVBR capability of the\nencoder to prioritize the video quality
     *   of some channels in a\nmultiplex over others. Channels that have a higher priority
     *   will\nget higher video quality at the expense of the video quality of\nother channels in
     *   the multiplex with lower priority.
     */
    public fun priority(priority: Number) {
        cdkBuilder.priority(priority)
    }

    public fun build(): CfnMultiplexprogram.MultiplexStatmuxVideoSettingsProperty =
        cdkBuilder.build()
}
