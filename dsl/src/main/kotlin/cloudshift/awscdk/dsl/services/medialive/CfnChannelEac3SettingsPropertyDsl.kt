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

  public fun attenuationControl(attenuationControl: String) {
    cdkBuilder.attenuationControl(attenuationControl)
  }

  public fun bitrate(bitrate: Number) {
    cdkBuilder.bitrate(bitrate)
  }

  public fun bitstreamMode(bitstreamMode: String) {
    cdkBuilder.bitstreamMode(bitstreamMode)
  }

  public fun codingMode(codingMode: String) {
    cdkBuilder.codingMode(codingMode)
  }

  public fun dcFilter(dcFilter: String) {
    cdkBuilder.dcFilter(dcFilter)
  }

  public fun dialnorm(dialnorm: Number) {
    cdkBuilder.dialnorm(dialnorm)
  }

  public fun drcLine(drcLine: String) {
    cdkBuilder.drcLine(drcLine)
  }

  public fun drcRf(drcRf: String) {
    cdkBuilder.drcRf(drcRf)
  }

  public fun lfeControl(lfeControl: String) {
    cdkBuilder.lfeControl(lfeControl)
  }

  public fun lfeFilter(lfeFilter: String) {
    cdkBuilder.lfeFilter(lfeFilter)
  }

  public fun loRoCenterMixLevel(loRoCenterMixLevel: Number) {
    cdkBuilder.loRoCenterMixLevel(loRoCenterMixLevel)
  }

  public fun loRoSurroundMixLevel(loRoSurroundMixLevel: Number) {
    cdkBuilder.loRoSurroundMixLevel(loRoSurroundMixLevel)
  }

  public fun ltRtCenterMixLevel(ltRtCenterMixLevel: Number) {
    cdkBuilder.ltRtCenterMixLevel(ltRtCenterMixLevel)
  }

  public fun ltRtSurroundMixLevel(ltRtSurroundMixLevel: Number) {
    cdkBuilder.ltRtSurroundMixLevel(ltRtSurroundMixLevel)
  }

  public fun metadataControl(metadataControl: String) {
    cdkBuilder.metadataControl(metadataControl)
  }

  public fun passthroughControl(passthroughControl: String) {
    cdkBuilder.passthroughControl(passthroughControl)
  }

  public fun phaseControl(phaseControl: String) {
    cdkBuilder.phaseControl(phaseControl)
  }

  public fun stereoDownmix(stereoDownmix: String) {
    cdkBuilder.stereoDownmix(stereoDownmix)
  }

  public fun surroundExMode(surroundExMode: String) {
    cdkBuilder.surroundExMode(surroundExMode)
  }

  public fun surroundMode(surroundMode: String) {
    cdkBuilder.surroundMode(surroundMode)
  }

  public fun build(): CfnChannel.Eac3SettingsProperty = cdkBuilder.build()
}
