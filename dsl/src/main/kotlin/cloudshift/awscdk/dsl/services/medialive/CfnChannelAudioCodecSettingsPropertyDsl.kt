@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.medialive

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.medialive.CfnChannel

@CdkDslMarker
public class CfnChannelAudioCodecSettingsPropertyDsl {
  private val cdkBuilder: CfnChannel.AudioCodecSettingsProperty.Builder =
      CfnChannel.AudioCodecSettingsProperty.builder()

  public fun aacSettings(aacSettings: IResolvable) {
    cdkBuilder.aacSettings(aacSettings)
  }

  public fun aacSettings(aacSettings: CfnChannel.AacSettingsProperty) {
    cdkBuilder.aacSettings(aacSettings)
  }

  public fun ac3Settings(ac3Settings: IResolvable) {
    cdkBuilder.ac3Settings(ac3Settings)
  }

  public fun ac3Settings(ac3Settings: CfnChannel.Ac3SettingsProperty) {
    cdkBuilder.ac3Settings(ac3Settings)
  }

  public fun eac3AtmosSettings(eac3AtmosSettings: IResolvable) {
    cdkBuilder.eac3AtmosSettings(eac3AtmosSettings)
  }

  public fun eac3AtmosSettings(eac3AtmosSettings: CfnChannel.Eac3AtmosSettingsProperty) {
    cdkBuilder.eac3AtmosSettings(eac3AtmosSettings)
  }

  public fun eac3Settings(eac3Settings: IResolvable) {
    cdkBuilder.eac3Settings(eac3Settings)
  }

  public fun eac3Settings(eac3Settings: CfnChannel.Eac3SettingsProperty) {
    cdkBuilder.eac3Settings(eac3Settings)
  }

  public fun mp2Settings(mp2Settings: IResolvable) {
    cdkBuilder.mp2Settings(mp2Settings)
  }

  public fun mp2Settings(mp2Settings: CfnChannel.Mp2SettingsProperty) {
    cdkBuilder.mp2Settings(mp2Settings)
  }

  public fun passThroughSettings(passThroughSettings: IResolvable) {
    cdkBuilder.passThroughSettings(passThroughSettings)
  }

  public fun passThroughSettings(passThroughSettings: CfnChannel.PassThroughSettingsProperty) {
    cdkBuilder.passThroughSettings(passThroughSettings)
  }

  public fun wavSettings(wavSettings: IResolvable) {
    cdkBuilder.wavSettings(wavSettings)
  }

  public fun wavSettings(wavSettings: CfnChannel.WavSettingsProperty) {
    cdkBuilder.wavSettings(wavSettings)
  }

  public fun build(): CfnChannel.AudioCodecSettingsProperty = cdkBuilder.build()
}
