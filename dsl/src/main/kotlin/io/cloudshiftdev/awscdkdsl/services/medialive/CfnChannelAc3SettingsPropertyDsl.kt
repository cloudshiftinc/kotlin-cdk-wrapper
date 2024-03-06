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
 * The settings for an AC3 audio encode in the output.
 *
 * The parent of this entity is AudioCodecSettings.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.medialive.*;
 * Ac3SettingsProperty ac3SettingsProperty = Ac3SettingsProperty.builder()
 * .attenuationControl("attenuationControl")
 * .bitrate(123)
 * .bitstreamMode("bitstreamMode")
 * .codingMode("codingMode")
 * .dialnorm(123)
 * .drcProfile("drcProfile")
 * .lfeFilter("lfeFilter")
 * .metadataControl("metadataControl")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-ac3settings.html)
 */
@CdkDslMarker
public class CfnChannelAc3SettingsPropertyDsl {
    private val cdkBuilder: CfnChannel.Ac3SettingsProperty.Builder =
        CfnChannel.Ac3SettingsProperty.builder()

    /** @param attenuationControl the value to be set. */
    public fun attenuationControl(attenuationControl: String) {
        cdkBuilder.attenuationControl(attenuationControl)
    }

    /**
     * @param bitrate The average bitrate in bits/second. Valid bitrates depend on the coding mode.
     */
    public fun bitrate(bitrate: Number) {
        cdkBuilder.bitrate(bitrate)
    }

    /**
     * @param bitstreamMode Specifies the bitstream mode (bsmod) for the emitted AC-3 stream. For
     *   more information about these values, see ATSC A/52-2012.
     */
    public fun bitstreamMode(bitstreamMode: String) {
        cdkBuilder.bitstreamMode(bitstreamMode)
    }

    /** @param codingMode The Dolby Digital coding mode. This determines the number of channels. */
    public fun codingMode(codingMode: String) {
        cdkBuilder.codingMode(codingMode)
    }

    /**
     * @param dialnorm Sets the dialnorm for the output. If excluded and the input audio is Dolby
     *   Digital, dialnorm is passed through.
     */
    public fun dialnorm(dialnorm: Number) {
        cdkBuilder.dialnorm(dialnorm)
    }

    /**
     * @param drcProfile If set to filmStandard, adds dynamic range compression signaling to the
     *   output bitstream as defined in the Dolby Digital specification.
     */
    public fun drcProfile(drcProfile: String) {
        cdkBuilder.drcProfile(drcProfile)
    }

    /**
     * @param lfeFilter When set to enabled, applies a 120Hz lowpass filter to the LFE channel prior
     *   to encoding. This is valid only in codingMode32Lfe mode.
     */
    public fun lfeFilter(lfeFilter: String) {
        cdkBuilder.lfeFilter(lfeFilter)
    }

    /**
     * @param metadataControl When set to followInput, encoder metadata is sourced from the DD, DD+,
     *   or DolbyE decoder that supplies this audio data. If the audio is supplied from one of these
     *   streams, the static metadata settings are used.
     */
    public fun metadataControl(metadataControl: String) {
        cdkBuilder.metadataControl(metadataControl)
    }

    public fun build(): CfnChannel.Ac3SettingsProperty = cdkBuilder.build()
}
