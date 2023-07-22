@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.medialive

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.medialive.CfnChannel

@CdkDslMarker
public class CfnChannelVideoCodecSettingsPropertyDsl {
  private val cdkBuilder: CfnChannel.VideoCodecSettingsProperty.Builder =
      CfnChannel.VideoCodecSettingsProperty.builder()

  /**
   * @param frameCaptureSettings The settings for the video codec in a frame capture output.
   */
  public fun frameCaptureSettings(frameCaptureSettings: IResolvable) {
    cdkBuilder.frameCaptureSettings(frameCaptureSettings)
  }

  /**
   * @param frameCaptureSettings The settings for the video codec in a frame capture output.
   */
  public fun frameCaptureSettings(frameCaptureSettings: CfnChannel.FrameCaptureSettingsProperty) {
    cdkBuilder.frameCaptureSettings(frameCaptureSettings)
  }

  /**
   * @param h264Settings The settings for the H.264 codec in the output.
   */
  public fun h264Settings(h264Settings: IResolvable) {
    cdkBuilder.h264Settings(h264Settings)
  }

  /**
   * @param h264Settings The settings for the H.264 codec in the output.
   */
  public fun h264Settings(h264Settings: CfnChannel.H264SettingsProperty) {
    cdkBuilder.h264Settings(h264Settings)
  }

  /**
   * @param h265Settings Settings for video encoded with the H265 codec.
   */
  public fun h265Settings(h265Settings: IResolvable) {
    cdkBuilder.h265Settings(h265Settings)
  }

  /**
   * @param h265Settings Settings for video encoded with the H265 codec.
   */
  public fun h265Settings(h265Settings: CfnChannel.H265SettingsProperty) {
    cdkBuilder.h265Settings(h265Settings)
  }

  /**
   * @param mpeg2Settings Settings for video encoded with the MPEG-2 codec.
   */
  public fun mpeg2Settings(mpeg2Settings: IResolvable) {
    cdkBuilder.mpeg2Settings(mpeg2Settings)
  }

  /**
   * @param mpeg2Settings Settings for video encoded with the MPEG-2 codec.
   */
  public fun mpeg2Settings(mpeg2Settings: CfnChannel.Mpeg2SettingsProperty) {
    cdkBuilder.mpeg2Settings(mpeg2Settings)
  }

  public fun build(): CfnChannel.VideoCodecSettingsProperty = cdkBuilder.build()
}
