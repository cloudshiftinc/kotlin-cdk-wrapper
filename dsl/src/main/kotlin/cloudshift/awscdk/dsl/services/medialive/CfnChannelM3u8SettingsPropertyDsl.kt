@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.medialive

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.medialive.CfnChannel

@CdkDslMarker
public class CfnChannelM3u8SettingsPropertyDsl {
  private val cdkBuilder: CfnChannel.M3u8SettingsProperty.Builder =
      CfnChannel.M3u8SettingsProperty.builder()

  public fun audioFramesPerPes(audioFramesPerPes: Number) {
    cdkBuilder.audioFramesPerPes(audioFramesPerPes)
  }

  public fun audioPids(audioPids: String) {
    cdkBuilder.audioPids(audioPids)
  }

  public fun ecmPid(ecmPid: String) {
    cdkBuilder.ecmPid(ecmPid)
  }

  public fun nielsenId3Behavior(nielsenId3Behavior: String) {
    cdkBuilder.nielsenId3Behavior(nielsenId3Behavior)
  }

  public fun patInterval(patInterval: Number) {
    cdkBuilder.patInterval(patInterval)
  }

  public fun pcrControl(pcrControl: String) {
    cdkBuilder.pcrControl(pcrControl)
  }

  public fun pcrPeriod(pcrPeriod: Number) {
    cdkBuilder.pcrPeriod(pcrPeriod)
  }

  public fun pcrPid(pcrPid: String) {
    cdkBuilder.pcrPid(pcrPid)
  }

  public fun pmtInterval(pmtInterval: Number) {
    cdkBuilder.pmtInterval(pmtInterval)
  }

  public fun pmtPid(pmtPid: String) {
    cdkBuilder.pmtPid(pmtPid)
  }

  public fun programNum(programNum: Number) {
    cdkBuilder.programNum(programNum)
  }

  public fun scte35Behavior(scte35Behavior: String) {
    cdkBuilder.scte35Behavior(scte35Behavior)
  }

  public fun scte35Pid(scte35Pid: String) {
    cdkBuilder.scte35Pid(scte35Pid)
  }

  public fun timedMetadataBehavior(timedMetadataBehavior: String) {
    cdkBuilder.timedMetadataBehavior(timedMetadataBehavior)
  }

  public fun timedMetadataPid(timedMetadataPid: String) {
    cdkBuilder.timedMetadataPid(timedMetadataPid)
  }

  public fun transportStreamId(transportStreamId: Number) {
    cdkBuilder.transportStreamId(transportStreamId)
  }

  public fun videoPid(videoPid: String) {
    cdkBuilder.videoPid(videoPid)
  }

  public fun build(): CfnChannel.M3u8SettingsProperty = cdkBuilder.build()
}
