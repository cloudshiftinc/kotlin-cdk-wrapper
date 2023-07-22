@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.medialive

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.medialive.CfnChannel

@CdkDslMarker
public class CfnChannelFrameCaptureCdnSettingsPropertyDsl {
  private val cdkBuilder: CfnChannel.FrameCaptureCdnSettingsProperty.Builder =
      CfnChannel.FrameCaptureCdnSettingsProperty.builder()

  /**
   * @param frameCaptureS3Settings Sets up Amazon S3 as the destination for this Frame Capture
   * output.
   */
  public fun frameCaptureS3Settings(frameCaptureS3Settings: IResolvable) {
    cdkBuilder.frameCaptureS3Settings(frameCaptureS3Settings)
  }

  /**
   * @param frameCaptureS3Settings Sets up Amazon S3 as the destination for this Frame Capture
   * output.
   */
  public
      fun frameCaptureS3Settings(frameCaptureS3Settings: CfnChannel.FrameCaptureS3SettingsProperty) {
    cdkBuilder.frameCaptureS3Settings(frameCaptureS3Settings)
  }

  public fun build(): CfnChannel.FrameCaptureCdnSettingsProperty = cdkBuilder.build()
}
