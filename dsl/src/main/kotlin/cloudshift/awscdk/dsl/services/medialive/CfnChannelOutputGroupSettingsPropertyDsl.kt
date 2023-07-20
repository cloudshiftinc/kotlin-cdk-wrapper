@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.medialive

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.medialive.CfnChannel

@CdkDslMarker
public class CfnChannelOutputGroupSettingsPropertyDsl {
  private val cdkBuilder: CfnChannel.OutputGroupSettingsProperty.Builder =
      CfnChannel.OutputGroupSettingsProperty.builder()

  public fun archiveGroupSettings(archiveGroupSettings: IResolvable) {
    cdkBuilder.archiveGroupSettings(archiveGroupSettings)
  }

  public fun archiveGroupSettings(archiveGroupSettings: CfnChannel.ArchiveGroupSettingsProperty) {
    cdkBuilder.archiveGroupSettings(archiveGroupSettings)
  }

  public fun frameCaptureGroupSettings(frameCaptureGroupSettings: IResolvable) {
    cdkBuilder.frameCaptureGroupSettings(frameCaptureGroupSettings)
  }

  public
      fun frameCaptureGroupSettings(frameCaptureGroupSettings: CfnChannel.FrameCaptureGroupSettingsProperty) {
    cdkBuilder.frameCaptureGroupSettings(frameCaptureGroupSettings)
  }

  public fun hlsGroupSettings(hlsGroupSettings: IResolvable) {
    cdkBuilder.hlsGroupSettings(hlsGroupSettings)
  }

  public fun hlsGroupSettings(hlsGroupSettings: CfnChannel.HlsGroupSettingsProperty) {
    cdkBuilder.hlsGroupSettings(hlsGroupSettings)
  }

  public fun mediaPackageGroupSettings(mediaPackageGroupSettings: IResolvable) {
    cdkBuilder.mediaPackageGroupSettings(mediaPackageGroupSettings)
  }

  public
      fun mediaPackageGroupSettings(mediaPackageGroupSettings: CfnChannel.MediaPackageGroupSettingsProperty) {
    cdkBuilder.mediaPackageGroupSettings(mediaPackageGroupSettings)
  }

  public fun msSmoothGroupSettings(msSmoothGroupSettings: IResolvable) {
    cdkBuilder.msSmoothGroupSettings(msSmoothGroupSettings)
  }

  public
      fun msSmoothGroupSettings(msSmoothGroupSettings: CfnChannel.MsSmoothGroupSettingsProperty) {
    cdkBuilder.msSmoothGroupSettings(msSmoothGroupSettings)
  }

  public fun multiplexGroupSettings(multiplexGroupSettings: IResolvable) {
    cdkBuilder.multiplexGroupSettings(multiplexGroupSettings)
  }

  public
      fun multiplexGroupSettings(multiplexGroupSettings: CfnChannel.MultiplexGroupSettingsProperty) {
    cdkBuilder.multiplexGroupSettings(multiplexGroupSettings)
  }

  public fun rtmpGroupSettings(rtmpGroupSettings: IResolvable) {
    cdkBuilder.rtmpGroupSettings(rtmpGroupSettings)
  }

  public fun rtmpGroupSettings(rtmpGroupSettings: CfnChannel.RtmpGroupSettingsProperty) {
    cdkBuilder.rtmpGroupSettings(rtmpGroupSettings)
  }

  public fun udpGroupSettings(udpGroupSettings: IResolvable) {
    cdkBuilder.udpGroupSettings(udpGroupSettings)
  }

  public fun udpGroupSettings(udpGroupSettings: CfnChannel.UdpGroupSettingsProperty) {
    cdkBuilder.udpGroupSettings(udpGroupSettings)
  }

  public fun build(): CfnChannel.OutputGroupSettingsProperty = cdkBuilder.build()
}
