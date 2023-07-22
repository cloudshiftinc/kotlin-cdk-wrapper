@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.medialive

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.medialive.CfnChannel

@CdkDslMarker
public class CfnChannelOutputSettingsPropertyDsl {
  private val cdkBuilder: CfnChannel.OutputSettingsProperty.Builder =
      CfnChannel.OutputSettingsProperty.builder()

  /**
   * @param archiveOutputSettings The settings for an archive output.
   */
  public fun archiveOutputSettings(archiveOutputSettings: IResolvable) {
    cdkBuilder.archiveOutputSettings(archiveOutputSettings)
  }

  /**
   * @param archiveOutputSettings The settings for an archive output.
   */
  public
      fun archiveOutputSettings(archiveOutputSettings: CfnChannel.ArchiveOutputSettingsProperty) {
    cdkBuilder.archiveOutputSettings(archiveOutputSettings)
  }

  /**
   * @param frameCaptureOutputSettings The settings for a frame capture output.
   * The parent of this entity is OutputGroupSettings.
   */
  public fun frameCaptureOutputSettings(frameCaptureOutputSettings: IResolvable) {
    cdkBuilder.frameCaptureOutputSettings(frameCaptureOutputSettings)
  }

  /**
   * @param frameCaptureOutputSettings The settings for a frame capture output.
   * The parent of this entity is OutputGroupSettings.
   */
  public
      fun frameCaptureOutputSettings(frameCaptureOutputSettings: CfnChannel.FrameCaptureOutputSettingsProperty) {
    cdkBuilder.frameCaptureOutputSettings(frameCaptureOutputSettings)
  }

  /**
   * @param hlsOutputSettings The settings for an HLS output.
   * The parent of this entity is OutputGroupSettings.
   */
  public fun hlsOutputSettings(hlsOutputSettings: IResolvable) {
    cdkBuilder.hlsOutputSettings(hlsOutputSettings)
  }

  /**
   * @param hlsOutputSettings The settings for an HLS output.
   * The parent of this entity is OutputGroupSettings.
   */
  public fun hlsOutputSettings(hlsOutputSettings: CfnChannel.HlsOutputSettingsProperty) {
    cdkBuilder.hlsOutputSettings(hlsOutputSettings)
  }

  /**
   * @param mediaPackageOutputSettings The settings for a MediaPackage output.
   * The parent of this entity is OutputGroupSettings.
   */
  public fun mediaPackageOutputSettings(mediaPackageOutputSettings: IResolvable) {
    cdkBuilder.mediaPackageOutputSettings(mediaPackageOutputSettings)
  }

  /**
   * @param mediaPackageOutputSettings The settings for a MediaPackage output.
   * The parent of this entity is OutputGroupSettings.
   */
  public
      fun mediaPackageOutputSettings(mediaPackageOutputSettings: CfnChannel.MediaPackageOutputSettingsProperty) {
    cdkBuilder.mediaPackageOutputSettings(mediaPackageOutputSettings)
  }

  /**
   * @param msSmoothOutputSettings The settings for a Microsoft Smooth output.
   */
  public fun msSmoothOutputSettings(msSmoothOutputSettings: IResolvable) {
    cdkBuilder.msSmoothOutputSettings(msSmoothOutputSettings)
  }

  /**
   * @param msSmoothOutputSettings The settings for a Microsoft Smooth output.
   */
  public
      fun msSmoothOutputSettings(msSmoothOutputSettings: CfnChannel.MsSmoothOutputSettingsProperty) {
    cdkBuilder.msSmoothOutputSettings(msSmoothOutputSettings)
  }

  /**
   * @param multiplexOutputSettings Configuration of a Multiplex output.
   */
  public fun multiplexOutputSettings(multiplexOutputSettings: IResolvable) {
    cdkBuilder.multiplexOutputSettings(multiplexOutputSettings)
  }

  /**
   * @param multiplexOutputSettings Configuration of a Multiplex output.
   */
  public
      fun multiplexOutputSettings(multiplexOutputSettings: CfnChannel.MultiplexOutputSettingsProperty) {
    cdkBuilder.multiplexOutputSettings(multiplexOutputSettings)
  }

  /**
   * @param rtmpOutputSettings The settings for an RTMP output.
   * The parent of this entity is OutputGroupSettings.
   */
  public fun rtmpOutputSettings(rtmpOutputSettings: IResolvable) {
    cdkBuilder.rtmpOutputSettings(rtmpOutputSettings)
  }

  /**
   * @param rtmpOutputSettings The settings for an RTMP output.
   * The parent of this entity is OutputGroupSettings.
   */
  public fun rtmpOutputSettings(rtmpOutputSettings: CfnChannel.RtmpOutputSettingsProperty) {
    cdkBuilder.rtmpOutputSettings(rtmpOutputSettings)
  }

  /**
   * @param udpOutputSettings The settings for a UDP output.
   * The parent of this entity is OutputGroupSettings.
   */
  public fun udpOutputSettings(udpOutputSettings: IResolvable) {
    cdkBuilder.udpOutputSettings(udpOutputSettings)
  }

  /**
   * @param udpOutputSettings The settings for a UDP output.
   * The parent of this entity is OutputGroupSettings.
   */
  public fun udpOutputSettings(udpOutputSettings: CfnChannel.UdpOutputSettingsProperty) {
    cdkBuilder.udpOutputSettings(udpOutputSettings)
  }

  public fun build(): CfnChannel.OutputSettingsProperty = cdkBuilder.build()
}
