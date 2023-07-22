@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.medialive

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.medialive.CfnChannel

@CdkDslMarker
public class CfnChannelEac3SettingsPropertyDsl {
  private val cdkBuilder: CfnChannel.Eac3SettingsProperty.Builder =
      CfnChannel.Eac3SettingsProperty.builder()

  /**
   * @param attenuationControl When set to attenuate3Db, applies a 3 dB attenuation to the surround
   * channels.
   * Used only for the 3/2 coding mode.
   */
  public fun attenuationControl(attenuationControl: String) {
    cdkBuilder.attenuationControl(attenuationControl)
  }

  /**
   * @param bitrate The average bitrate in bits/second.
   * Valid bitrates depend on the coding mode.
   */
  public fun bitrate(bitrate: Number) {
    cdkBuilder.bitrate(bitrate)
  }

  /**
   * @param bitstreamMode Specifies the bitstream mode (bsmod) for the emitted E-AC-3 stream.
   * For more information, see ATSC A/52-2012 (Annex E).
   */
  public fun bitstreamMode(bitstreamMode: String) {
    cdkBuilder.bitstreamMode(bitstreamMode)
  }

  /**
   * @param codingMode The Dolby Digital Plus coding mode.
   * This mode determines the number of channels.
   */
  public fun codingMode(codingMode: String) {
    cdkBuilder.codingMode(codingMode)
  }

  /**
   * @param dcFilter When set to enabled, activates a DC highpass filter for all input channels.
   */
  public fun dcFilter(dcFilter: String) {
    cdkBuilder.dcFilter(dcFilter)
  }

  /**
   * @param dialnorm Sets the dialnorm for the output.
   * If blank and the input audio is Dolby Digital Plus, dialnorm will be passed through.
   */
  public fun dialnorm(dialnorm: Number) {
    cdkBuilder.dialnorm(dialnorm)
  }

  /**
   * @param drcLine Sets the Dolby dynamic range compression profile.
   */
  public fun drcLine(drcLine: String) {
    cdkBuilder.drcLine(drcLine)
  }

  /**
   * @param drcRf Sets the profile for heavy Dolby dynamic range compression, ensuring that the
   * instantaneous signal peaks do not exceed specified levels.
   */
  public fun drcRf(drcRf: String) {
    cdkBuilder.drcRf(drcRf)
  }

  /**
   * @param lfeControl When encoding 3/2 audio, setting to lfe enables the LFE channel.
   */
  public fun lfeControl(lfeControl: String) {
    cdkBuilder.lfeControl(lfeControl)
  }

  /**
   * @param lfeFilter When set to enabled, applies a 120Hz lowpass filter to the LFE channel prior
   * to encoding.
   * Valid only with a codingMode32 coding mode.
   */
  public fun lfeFilter(lfeFilter: String) {
    cdkBuilder.lfeFilter(lfeFilter)
  }

  /**
   * @param loRoCenterMixLevel The Left only/Right only center mix level.
   * Used only for the 3/2 coding mode.
   */
  public fun loRoCenterMixLevel(loRoCenterMixLevel: Number) {
    cdkBuilder.loRoCenterMixLevel(loRoCenterMixLevel)
  }

  /**
   * @param loRoSurroundMixLevel The Left only/Right only surround mix level.
   * Used only for a 3/2 coding mode.
   */
  public fun loRoSurroundMixLevel(loRoSurroundMixLevel: Number) {
    cdkBuilder.loRoSurroundMixLevel(loRoSurroundMixLevel)
  }

  /**
   * @param ltRtCenterMixLevel The Left total/Right total center mix level.
   * Used only for a 3/2 coding mode.
   */
  public fun ltRtCenterMixLevel(ltRtCenterMixLevel: Number) {
    cdkBuilder.ltRtCenterMixLevel(ltRtCenterMixLevel)
  }

  /**
   * @param ltRtSurroundMixLevel The Left total/Right total surround mix level.
   * Used only for the 3/2 coding mode.
   */
  public fun ltRtSurroundMixLevel(ltRtSurroundMixLevel: Number) {
    cdkBuilder.ltRtSurroundMixLevel(ltRtSurroundMixLevel)
  }

  /**
   * @param metadataControl When set to followInput, encoder metadata is sourced from the DD, DD+,
   * or DolbyE decoder that supplies this audio data.
   * If the audio is not supplied from one of these streams, then the static metadata settings are
   * used.
   */
  public fun metadataControl(metadataControl: String) {
    cdkBuilder.metadataControl(metadataControl)
  }

  /**
   * @param passthroughControl When set to whenPossible, input DD+ audio will be passed through if
   * it is present on the input.
   * This detection is dynamic over the life of the transcode. Inputs that alternate between DD+ and
   * non-DD+ content will have a consistent DD+ output as the system alternates between passthrough and
   * encoding.
   */
  public fun passthroughControl(passthroughControl: String) {
    cdkBuilder.passthroughControl(passthroughControl)
  }

  /**
   * @param phaseControl When set to shift90Degrees, applies a 90-degree phase shift to the surround
   * channels.
   * Used only for a 3/2 coding mode.
   */
  public fun phaseControl(phaseControl: String) {
    cdkBuilder.phaseControl(phaseControl)
  }

  /**
   * @param stereoDownmix A stereo downmix preference.
   * Used only for the 3/2 coding mode.
   */
  public fun stereoDownmix(stereoDownmix: String) {
    cdkBuilder.stereoDownmix(stereoDownmix)
  }

  /**
   * @param surroundExMode When encoding 3/2 audio, sets whether an extra center back surround
   * channel is matrix encoded into the left and right surround channels.
   */
  public fun surroundExMode(surroundExMode: String) {
    cdkBuilder.surroundExMode(surroundExMode)
  }

  /**
   * @param surroundMode When encoding 2/0 audio, sets whether Dolby Surround is matrix-encoded into
   * the two channels.
   */
  public fun surroundMode(surroundMode: String) {
    cdkBuilder.surroundMode(surroundMode)
  }

  public fun build(): CfnChannel.Eac3SettingsProperty = cdkBuilder.build()
}
