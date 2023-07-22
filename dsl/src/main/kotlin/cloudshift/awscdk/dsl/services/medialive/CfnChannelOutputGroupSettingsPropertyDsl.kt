@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.medialive

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.medialive.CfnChannel

@CdkDslMarker
public class CfnChannelOutputGroupSettingsPropertyDsl {
  private val cdkBuilder: CfnChannel.OutputGroupSettingsProperty.Builder =
      CfnChannel.OutputGroupSettingsProperty.builder()

  /**
   * @param archiveGroupSettings The configuration of an archive output group.
   * The parent of this entity is OutputGroupSettings.
   */
  public fun archiveGroupSettings(archiveGroupSettings: IResolvable) {
    cdkBuilder.archiveGroupSettings(archiveGroupSettings)
  }

  /**
   * @param archiveGroupSettings The configuration of an archive output group.
   * The parent of this entity is OutputGroupSettings.
   */
  public fun archiveGroupSettings(archiveGroupSettings: CfnChannel.ArchiveGroupSettingsProperty) {
    cdkBuilder.archiveGroupSettings(archiveGroupSettings)
  }

  /**
   * @param frameCaptureGroupSettings The configuration of a frame capture output group.
   */
  public fun frameCaptureGroupSettings(frameCaptureGroupSettings: IResolvable) {
    cdkBuilder.frameCaptureGroupSettings(frameCaptureGroupSettings)
  }

  /**
   * @param frameCaptureGroupSettings The configuration of a frame capture output group.
   */
  public
      fun frameCaptureGroupSettings(frameCaptureGroupSettings: CfnChannel.FrameCaptureGroupSettingsProperty) {
    cdkBuilder.frameCaptureGroupSettings(frameCaptureGroupSettings)
  }

  /**
   * @param hlsGroupSettings The configuration of an HLS output group.
   */
  public fun hlsGroupSettings(hlsGroupSettings: IResolvable) {
    cdkBuilder.hlsGroupSettings(hlsGroupSettings)
  }

  /**
   * @param hlsGroupSettings The configuration of an HLS output group.
   */
  public fun hlsGroupSettings(hlsGroupSettings: CfnChannel.HlsGroupSettingsProperty) {
    cdkBuilder.hlsGroupSettings(hlsGroupSettings)
  }

  /**
   * @param mediaPackageGroupSettings The configuration of a MediaPackage output group.
   */
  public fun mediaPackageGroupSettings(mediaPackageGroupSettings: IResolvable) {
    cdkBuilder.mediaPackageGroupSettings(mediaPackageGroupSettings)
  }

  /**
   * @param mediaPackageGroupSettings The configuration of a MediaPackage output group.
   */
  public
      fun mediaPackageGroupSettings(mediaPackageGroupSettings: CfnChannel.MediaPackageGroupSettingsProperty) {
    cdkBuilder.mediaPackageGroupSettings(mediaPackageGroupSettings)
  }

  /**
   * @param msSmoothGroupSettings The configuration of a Microsoft Smooth output group.
   */
  public fun msSmoothGroupSettings(msSmoothGroupSettings: IResolvable) {
    cdkBuilder.msSmoothGroupSettings(msSmoothGroupSettings)
  }

  /**
   * @param msSmoothGroupSettings The configuration of a Microsoft Smooth output group.
   */
  public
      fun msSmoothGroupSettings(msSmoothGroupSettings: CfnChannel.MsSmoothGroupSettingsProperty) {
    cdkBuilder.msSmoothGroupSettings(msSmoothGroupSettings)
  }

  /**
   * @param multiplexGroupSettings The settings for a Multiplex output group.
   */
  public fun multiplexGroupSettings(multiplexGroupSettings: IResolvable) {
    cdkBuilder.multiplexGroupSettings(multiplexGroupSettings)
  }

  /**
   * @param multiplexGroupSettings The settings for a Multiplex output group.
   */
  public
      fun multiplexGroupSettings(multiplexGroupSettings: CfnChannel.MultiplexGroupSettingsProperty) {
    cdkBuilder.multiplexGroupSettings(multiplexGroupSettings)
  }

  /**
   * @param rtmpGroupSettings The configuration of an RTMP output group.
   */
  public fun rtmpGroupSettings(rtmpGroupSettings: IResolvable) {
    cdkBuilder.rtmpGroupSettings(rtmpGroupSettings)
  }

  /**
   * @param rtmpGroupSettings The configuration of an RTMP output group.
   */
  public fun rtmpGroupSettings(rtmpGroupSettings: CfnChannel.RtmpGroupSettingsProperty) {
    cdkBuilder.rtmpGroupSettings(rtmpGroupSettings)
  }

  /**
   * @param udpGroupSettings The configuration of a UDP output group.
   */
  public fun udpGroupSettings(udpGroupSettings: IResolvable) {
    cdkBuilder.udpGroupSettings(udpGroupSettings)
  }

  /**
   * @param udpGroupSettings The configuration of a UDP output group.
   */
  public fun udpGroupSettings(udpGroupSettings: CfnChannel.UdpGroupSettingsProperty) {
    cdkBuilder.udpGroupSettings(udpGroupSettings)
  }

  public fun build(): CfnChannel.OutputGroupSettingsProperty = cdkBuilder.build()
}
