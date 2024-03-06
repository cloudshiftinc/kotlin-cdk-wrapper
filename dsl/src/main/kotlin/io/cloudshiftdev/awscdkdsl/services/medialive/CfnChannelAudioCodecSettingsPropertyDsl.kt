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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.medialive.CfnChannel

/**
 * The configuration of the audio codec in the audio output.
 *
 * The parent of this entity is AudioDescription.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.medialive.*;
 * AudioCodecSettingsProperty audioCodecSettingsProperty = AudioCodecSettingsProperty.builder()
 * .aacSettings(AacSettingsProperty.builder()
 * .bitrate(123)
 * .codingMode("codingMode")
 * .inputType("inputType")
 * .profile("profile")
 * .rateControlMode("rateControlMode")
 * .rawFormat("rawFormat")
 * .sampleRate(123)
 * .spec("spec")
 * .vbrQuality("vbrQuality")
 * .build())
 * .ac3Settings(Ac3SettingsProperty.builder()
 * .attenuationControl("attenuationControl")
 * .bitrate(123)
 * .bitstreamMode("bitstreamMode")
 * .codingMode("codingMode")
 * .dialnorm(123)
 * .drcProfile("drcProfile")
 * .lfeFilter("lfeFilter")
 * .metadataControl("metadataControl")
 * .build())
 * .eac3AtmosSettings(Eac3AtmosSettingsProperty.builder()
 * .bitrate(123)
 * .codingMode("codingMode")
 * .dialnorm(123)
 * .drcLine("drcLine")
 * .drcRf("drcRf")
 * .heightTrim(123)
 * .surroundTrim(123)
 * .build())
 * .eac3Settings(Eac3SettingsProperty.builder()
 * .attenuationControl("attenuationControl")
 * .bitrate(123)
 * .bitstreamMode("bitstreamMode")
 * .codingMode("codingMode")
 * .dcFilter("dcFilter")
 * .dialnorm(123)
 * .drcLine("drcLine")
 * .drcRf("drcRf")
 * .lfeControl("lfeControl")
 * .lfeFilter("lfeFilter")
 * .loRoCenterMixLevel(123)
 * .loRoSurroundMixLevel(123)
 * .ltRtCenterMixLevel(123)
 * .ltRtSurroundMixLevel(123)
 * .metadataControl("metadataControl")
 * .passthroughControl("passthroughControl")
 * .phaseControl("phaseControl")
 * .stereoDownmix("stereoDownmix")
 * .surroundExMode("surroundExMode")
 * .surroundMode("surroundMode")
 * .build())
 * .mp2Settings(Mp2SettingsProperty.builder()
 * .bitrate(123)
 * .codingMode("codingMode")
 * .sampleRate(123)
 * .build())
 * .passThroughSettings(PassThroughSettingsProperty.builder().build())
 * .wavSettings(WavSettingsProperty.builder()
 * .bitDepth(123)
 * .codingMode("codingMode")
 * .sampleRate(123)
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-audiocodecsettings.html)
 */
@CdkDslMarker
public class CfnChannelAudioCodecSettingsPropertyDsl {
    private val cdkBuilder: CfnChannel.AudioCodecSettingsProperty.Builder =
        CfnChannel.AudioCodecSettingsProperty.builder()

    /** @param aacSettings The setup of the AAC audio codec in the output. */
    public fun aacSettings(aacSettings: IResolvable) {
        cdkBuilder.aacSettings(aacSettings)
    }

    /** @param aacSettings The setup of the AAC audio codec in the output. */
    public fun aacSettings(aacSettings: CfnChannel.AacSettingsProperty) {
        cdkBuilder.aacSettings(aacSettings)
    }

    /** @param ac3Settings The setup of an AC3 audio codec in the output. */
    public fun ac3Settings(ac3Settings: IResolvable) {
        cdkBuilder.ac3Settings(ac3Settings)
    }

    /** @param ac3Settings The setup of an AC3 audio codec in the output. */
    public fun ac3Settings(ac3Settings: CfnChannel.Ac3SettingsProperty) {
        cdkBuilder.ac3Settings(ac3Settings)
    }

    /** @param eac3AtmosSettings the value to be set. */
    public fun eac3AtmosSettings(eac3AtmosSettings: IResolvable) {
        cdkBuilder.eac3AtmosSettings(eac3AtmosSettings)
    }

    /** @param eac3AtmosSettings the value to be set. */
    public fun eac3AtmosSettings(eac3AtmosSettings: CfnChannel.Eac3AtmosSettingsProperty) {
        cdkBuilder.eac3AtmosSettings(eac3AtmosSettings)
    }

    /** @param eac3Settings The setup of an EAC3 audio codec in the output. */
    public fun eac3Settings(eac3Settings: IResolvable) {
        cdkBuilder.eac3Settings(eac3Settings)
    }

    /** @param eac3Settings The setup of an EAC3 audio codec in the output. */
    public fun eac3Settings(eac3Settings: CfnChannel.Eac3SettingsProperty) {
        cdkBuilder.eac3Settings(eac3Settings)
    }

    /** @param mp2Settings The setup of an MP2 audio codec in the output. */
    public fun mp2Settings(mp2Settings: IResolvable) {
        cdkBuilder.mp2Settings(mp2Settings)
    }

    /** @param mp2Settings The setup of an MP2 audio codec in the output. */
    public fun mp2Settings(mp2Settings: CfnChannel.Mp2SettingsProperty) {
        cdkBuilder.mp2Settings(mp2Settings)
    }

    /** @param passThroughSettings The setup to pass through the Dolby audio codec to the output. */
    public fun passThroughSettings(passThroughSettings: IResolvable) {
        cdkBuilder.passThroughSettings(passThroughSettings)
    }

    /** @param passThroughSettings The setup to pass through the Dolby audio codec to the output. */
    public fun passThroughSettings(passThroughSettings: CfnChannel.PassThroughSettingsProperty) {
        cdkBuilder.passThroughSettings(passThroughSettings)
    }

    /** @param wavSettings Settings for audio encoded with the WAV codec. */
    public fun wavSettings(wavSettings: IResolvable) {
        cdkBuilder.wavSettings(wavSettings)
    }

    /** @param wavSettings Settings for audio encoded with the WAV codec. */
    public fun wavSettings(wavSettings: CfnChannel.WavSettingsProperty) {
        cdkBuilder.wavSettings(wavSettings)
    }

    public fun build(): CfnChannel.AudioCodecSettingsProperty = cdkBuilder.build()
}
