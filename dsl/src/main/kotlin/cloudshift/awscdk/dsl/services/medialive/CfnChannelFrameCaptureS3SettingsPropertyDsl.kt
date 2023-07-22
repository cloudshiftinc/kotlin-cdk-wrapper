@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.medialive

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.medialive.CfnChannel

/**
 * Sets up Amazon S3 as the destination for this Frame Capture output.
 *
 * The parent of this entity is FrameCaptureCdnSettings.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.medialive.*;
 * FrameCaptureS3SettingsProperty frameCaptureS3SettingsProperty =
 * FrameCaptureS3SettingsProperty.builder()
 * .cannedAcl("cannedAcl")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-framecaptures3settings.html)
 */
@CdkDslMarker
public class CfnChannelFrameCaptureS3SettingsPropertyDsl {
  private val cdkBuilder: CfnChannel.FrameCaptureS3SettingsProperty.Builder =
      CfnChannel.FrameCaptureS3SettingsProperty.builder()

  /**
   * @param cannedAcl Specify the canned ACL to apply to each S3 request.
   * Defaults to none.
   */
  public fun cannedAcl(cannedAcl: String) {
    cdkBuilder.cannedAcl(cannedAcl)
  }

  public fun build(): CfnChannel.FrameCaptureS3SettingsProperty = cdkBuilder.build()
}
