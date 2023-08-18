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
import kotlin.String
import software.amazon.awscdk.services.medialive.CfnChannel

/**
 * The setup of WAV audio in the output.
 *
 * The parent of this entity is AudioCodecSettings.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.medialive.*;
 * WavSettingsProperty wavSettingsProperty = WavSettingsProperty.builder()
 * .bitDepth(123)
 * .codingMode("codingMode")
 * .sampleRate(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-wavsettings.html)
 */
@CdkDslMarker
public class CfnChannelWavSettingsPropertyDsl {
    private val cdkBuilder: CfnChannel.WavSettingsProperty.Builder =
        CfnChannel.WavSettingsProperty.builder()

    /** @param bitDepth Bits per sample. */
    public fun bitDepth(bitDepth: Number) {
        cdkBuilder.bitDepth(bitDepth)
    }

    /**
     * @param codingMode The audio coding mode for the WAV audio. The mode determines the number of
     *   channels in the audio.
     */
    public fun codingMode(codingMode: String) {
        cdkBuilder.codingMode(codingMode)
    }

    /** @param sampleRate Sample rate in Hz. */
    public fun sampleRate(sampleRate: Number) {
        cdkBuilder.sampleRate(sampleRate)
    }

    public fun build(): CfnChannel.WavSettingsProperty = cdkBuilder.build()
}
