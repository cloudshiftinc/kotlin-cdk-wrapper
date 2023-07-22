@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.medialive

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.medialive.CfnChannel

@CdkDslMarker
public class CfnChannelAudioCodecSettingsPropertyDsl {
  private val cdkBuilder: CfnChannel.AudioCodecSettingsProperty.Builder =
      CfnChannel.AudioCodecSettingsProperty.builder()

  /**
   * @param aacSettings The setup of the AAC audio codec in the output.
   */
  public fun aacSettings(aacSettings: IResolvable) {
    cdkBuilder.aacSettings(aacSettings)
  }

  /**
   * @param aacSettings The setup of the AAC audio codec in the output.
   */
  public fun aacSettings(aacSettings: CfnChannel.AacSettingsProperty) {
    cdkBuilder.aacSettings(aacSettings)
  }

  /**
   * @param ac3Settings The setup of an AC3 audio codec in the output.
   */
  public fun ac3Settings(ac3Settings: IResolvable) {
    cdkBuilder.ac3Settings(ac3Settings)
  }

  /**
   * @param ac3Settings The setup of an AC3 audio codec in the output.
   */
  public fun ac3Settings(ac3Settings: CfnChannel.Ac3SettingsProperty) {
    cdkBuilder.ac3Settings(ac3Settings)
  }

  /**
   * @param eac3AtmosSettings the value to be set.
   */
  public fun eac3AtmosSettings(eac3AtmosSettings: IResolvable) {
    cdkBuilder.eac3AtmosSettings(eac3AtmosSettings)
  }

  /**
   * @param eac3AtmosSettings the value to be set.
   */
  public fun eac3AtmosSettings(eac3AtmosSettings: CfnChannel.Eac3AtmosSettingsProperty) {
    cdkBuilder.eac3AtmosSettings(eac3AtmosSettings)
  }

  /**
   * @param eac3Settings The setup of an EAC3 audio codec in the output.
   */
  public fun eac3Settings(eac3Settings: IResolvable) {
    cdkBuilder.eac3Settings(eac3Settings)
  }

  /**
   * @param eac3Settings The setup of an EAC3 audio codec in the output.
   */
  public fun eac3Settings(eac3Settings: CfnChannel.Eac3SettingsProperty) {
    cdkBuilder.eac3Settings(eac3Settings)
  }

  /**
   * @param mp2Settings The setup of an MP2 audio codec in the output.
   */
  public fun mp2Settings(mp2Settings: IResolvable) {
    cdkBuilder.mp2Settings(mp2Settings)
  }

  /**
   * @param mp2Settings The setup of an MP2 audio codec in the output.
   */
  public fun mp2Settings(mp2Settings: CfnChannel.Mp2SettingsProperty) {
    cdkBuilder.mp2Settings(mp2Settings)
  }

  /**
   * @param passThroughSettings The setup to pass through the Dolby audio codec to the output.
   */
  public fun passThroughSettings(passThroughSettings: IResolvable) {
    cdkBuilder.passThroughSettings(passThroughSettings)
  }

  /**
   * @param passThroughSettings The setup to pass through the Dolby audio codec to the output.
   */
  public fun passThroughSettings(passThroughSettings: CfnChannel.PassThroughSettingsProperty) {
    cdkBuilder.passThroughSettings(passThroughSettings)
  }

  /**
   * @param wavSettings Settings for audio encoded with the WAV codec.
   */
  public fun wavSettings(wavSettings: IResolvable) {
    cdkBuilder.wavSettings(wavSettings)
  }

  /**
   * @param wavSettings Settings for audio encoded with the WAV codec.
   */
  public fun wavSettings(wavSettings: CfnChannel.WavSettingsProperty) {
    cdkBuilder.wavSettings(wavSettings)
  }

  public fun build(): CfnChannel.AudioCodecSettingsProperty = cdkBuilder.build()
}
