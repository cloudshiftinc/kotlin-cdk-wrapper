@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.medialive

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.medialive.CfnChannel

@CdkDslMarker
public class CfnChannelHlsSettingsPropertyDsl {
  private val cdkBuilder: CfnChannel.HlsSettingsProperty.Builder =
      CfnChannel.HlsSettingsProperty.builder()

  /**
   * @param audioOnlyHlsSettings The settings for an audio-only output.
   */
  public fun audioOnlyHlsSettings(audioOnlyHlsSettings: IResolvable) {
    cdkBuilder.audioOnlyHlsSettings(audioOnlyHlsSettings)
  }

  /**
   * @param audioOnlyHlsSettings The settings for an audio-only output.
   */
  public fun audioOnlyHlsSettings(audioOnlyHlsSettings: CfnChannel.AudioOnlyHlsSettingsProperty) {
    cdkBuilder.audioOnlyHlsSettings(audioOnlyHlsSettings)
  }

  /**
   * @param fmp4HlsSettings The settings for an fMP4 container.
   */
  public fun fmp4HlsSettings(fmp4HlsSettings: IResolvable) {
    cdkBuilder.fmp4HlsSettings(fmp4HlsSettings)
  }

  /**
   * @param fmp4HlsSettings The settings for an fMP4 container.
   */
  public fun fmp4HlsSettings(fmp4HlsSettings: CfnChannel.Fmp4HlsSettingsProperty) {
    cdkBuilder.fmp4HlsSettings(fmp4HlsSettings)
  }

  /**
   * @param frameCaptureHlsSettings Settings for a frame capture output in an HLS output group.
   */
  public fun frameCaptureHlsSettings(frameCaptureHlsSettings: IResolvable) {
    cdkBuilder.frameCaptureHlsSettings(frameCaptureHlsSettings)
  }

  /**
   * @param frameCaptureHlsSettings Settings for a frame capture output in an HLS output group.
   */
  public
      fun frameCaptureHlsSettings(frameCaptureHlsSettings: CfnChannel.FrameCaptureHlsSettingsProperty) {
    cdkBuilder.frameCaptureHlsSettings(frameCaptureHlsSettings)
  }

  /**
   * @param standardHlsSettings The settings for a standard output (an output that is not
   * audio-only).
   */
  public fun standardHlsSettings(standardHlsSettings: IResolvable) {
    cdkBuilder.standardHlsSettings(standardHlsSettings)
  }

  /**
   * @param standardHlsSettings The settings for a standard output (an output that is not
   * audio-only).
   */
  public fun standardHlsSettings(standardHlsSettings: CfnChannel.StandardHlsSettingsProperty) {
    cdkBuilder.standardHlsSettings(standardHlsSettings)
  }

  public fun build(): CfnChannel.HlsSettingsProperty = cdkBuilder.build()
}
