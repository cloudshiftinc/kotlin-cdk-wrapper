@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.medialive

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.medialive.CfnChannel

@CdkDslMarker
public class CfnChannelM2tsSettingsPropertyDsl {
  private val cdkBuilder: CfnChannel.M2tsSettingsProperty.Builder =
      CfnChannel.M2tsSettingsProperty.builder()

  public fun absentInputAudioBehavior(absentInputAudioBehavior: String) {
    cdkBuilder.absentInputAudioBehavior(absentInputAudioBehavior)
  }

  public fun arib(arib: String) {
    cdkBuilder.arib(arib)
  }

  public fun aribCaptionsPid(aribCaptionsPid: String) {
    cdkBuilder.aribCaptionsPid(aribCaptionsPid)
  }

  public fun aribCaptionsPidControl(aribCaptionsPidControl: String) {
    cdkBuilder.aribCaptionsPidControl(aribCaptionsPidControl)
  }

  public fun audioBufferModel(audioBufferModel: String) {
    cdkBuilder.audioBufferModel(audioBufferModel)
  }

  public fun audioFramesPerPes(audioFramesPerPes: Number) {
    cdkBuilder.audioFramesPerPes(audioFramesPerPes)
  }

  public fun audioPids(audioPids: String) {
    cdkBuilder.audioPids(audioPids)
  }

  public fun audioStreamType(audioStreamType: String) {
    cdkBuilder.audioStreamType(audioStreamType)
  }

  public fun bitrate(bitrate: Number) {
    cdkBuilder.bitrate(bitrate)
  }

  public fun bufferModel(bufferModel: String) {
    cdkBuilder.bufferModel(bufferModel)
  }

  public fun ccDescriptor(ccDescriptor: String) {
    cdkBuilder.ccDescriptor(ccDescriptor)
  }

  public fun dvbNitSettings(dvbNitSettings: IResolvable) {
    cdkBuilder.dvbNitSettings(dvbNitSettings)
  }

  public fun dvbNitSettings(dvbNitSettings: CfnChannel.DvbNitSettingsProperty) {
    cdkBuilder.dvbNitSettings(dvbNitSettings)
  }

  public fun dvbSdtSettings(dvbSdtSettings: IResolvable) {
    cdkBuilder.dvbSdtSettings(dvbSdtSettings)
  }

  public fun dvbSdtSettings(dvbSdtSettings: CfnChannel.DvbSdtSettingsProperty) {
    cdkBuilder.dvbSdtSettings(dvbSdtSettings)
  }

  public fun dvbSubPids(dvbSubPids: String) {
    cdkBuilder.dvbSubPids(dvbSubPids)
  }

  public fun dvbTdtSettings(dvbTdtSettings: IResolvable) {
    cdkBuilder.dvbTdtSettings(dvbTdtSettings)
  }

  public fun dvbTdtSettings(dvbTdtSettings: CfnChannel.DvbTdtSettingsProperty) {
    cdkBuilder.dvbTdtSettings(dvbTdtSettings)
  }

  public fun dvbTeletextPid(dvbTeletextPid: String) {
    cdkBuilder.dvbTeletextPid(dvbTeletextPid)
  }

  public fun ebif(ebif: String) {
    cdkBuilder.ebif(ebif)
  }

  public fun ebpAudioInterval(ebpAudioInterval: String) {
    cdkBuilder.ebpAudioInterval(ebpAudioInterval)
  }

  public fun ebpLookaheadMs(ebpLookaheadMs: Number) {
    cdkBuilder.ebpLookaheadMs(ebpLookaheadMs)
  }

  public fun ebpPlacement(ebpPlacement: String) {
    cdkBuilder.ebpPlacement(ebpPlacement)
  }

  public fun ecmPid(ecmPid: String) {
    cdkBuilder.ecmPid(ecmPid)
  }

  public fun esRateInPes(esRateInPes: String) {
    cdkBuilder.esRateInPes(esRateInPes)
  }

  public fun etvPlatformPid(etvPlatformPid: String) {
    cdkBuilder.etvPlatformPid(etvPlatformPid)
  }

  public fun etvSignalPid(etvSignalPid: String) {
    cdkBuilder.etvSignalPid(etvSignalPid)
  }

  public fun fragmentTime(fragmentTime: Number) {
    cdkBuilder.fragmentTime(fragmentTime)
  }

  public fun klv(klv: String) {
    cdkBuilder.klv(klv)
  }

  public fun klvDataPids(klvDataPids: String) {
    cdkBuilder.klvDataPids(klvDataPids)
  }

  public fun nielsenId3Behavior(nielsenId3Behavior: String) {
    cdkBuilder.nielsenId3Behavior(nielsenId3Behavior)
  }

  public fun nullPacketBitrate(nullPacketBitrate: Number) {
    cdkBuilder.nullPacketBitrate(nullPacketBitrate)
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

  public fun rateMode(rateMode: String) {
    cdkBuilder.rateMode(rateMode)
  }

  public fun scte27Pids(scte27Pids: String) {
    cdkBuilder.scte27Pids(scte27Pids)
  }

  public fun scte35Control(scte35Control: String) {
    cdkBuilder.scte35Control(scte35Control)
  }

  public fun scte35Pid(scte35Pid: String) {
    cdkBuilder.scte35Pid(scte35Pid)
  }

  public fun scte35PrerollPullupMilliseconds(scte35PrerollPullupMilliseconds: Number) {
    cdkBuilder.scte35PrerollPullupMilliseconds(scte35PrerollPullupMilliseconds)
  }

  public fun segmentationMarkers(segmentationMarkers: String) {
    cdkBuilder.segmentationMarkers(segmentationMarkers)
  }

  public fun segmentationStyle(segmentationStyle: String) {
    cdkBuilder.segmentationStyle(segmentationStyle)
  }

  public fun segmentationTime(segmentationTime: Number) {
    cdkBuilder.segmentationTime(segmentationTime)
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

  public fun build(): CfnChannel.M2tsSettingsProperty = cdkBuilder.build()
}
