@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.medialive

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.medialive.CfnChannel

/**
 * Settings for configuring color space in an H264 video encode.
 *
 * The parent of this entity is H264Settings.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.medialive.*;
 * H264ColorSpaceSettingsProperty h264ColorSpaceSettingsProperty =
 * H264ColorSpaceSettingsProperty.builder()
 * .colorSpacePassthroughSettings(ColorSpacePassthroughSettingsProperty.builder().build())
 * .rec601Settings(Rec601SettingsProperty.builder().build())
 * .rec709Settings(Rec709SettingsProperty.builder().build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-h264colorspacesettings.html)
 */
@CdkDslMarker
public class CfnChannelH264ColorSpaceSettingsPropertyDsl {
  private val cdkBuilder: CfnChannel.H264ColorSpaceSettingsProperty.Builder =
      CfnChannel.H264ColorSpaceSettingsProperty.builder()

  /**
   * @param colorSpacePassthroughSettings Passthrough applies no color space conversion to the
   * output.
   */
  public fun colorSpacePassthroughSettings(colorSpacePassthroughSettings: IResolvable) {
    cdkBuilder.colorSpacePassthroughSettings(colorSpacePassthroughSettings)
  }

  /**
   * @param colorSpacePassthroughSettings Passthrough applies no color space conversion to the
   * output.
   */
  public
      fun colorSpacePassthroughSettings(colorSpacePassthroughSettings: CfnChannel.ColorSpacePassthroughSettingsProperty) {
    cdkBuilder.colorSpacePassthroughSettings(colorSpacePassthroughSettings)
  }

  /**
   * @param rec601Settings Settings to configure the handling of Rec601 color space.
   */
  public fun rec601Settings(rec601Settings: IResolvable) {
    cdkBuilder.rec601Settings(rec601Settings)
  }

  /**
   * @param rec601Settings Settings to configure the handling of Rec601 color space.
   */
  public fun rec601Settings(rec601Settings: CfnChannel.Rec601SettingsProperty) {
    cdkBuilder.rec601Settings(rec601Settings)
  }

  /**
   * @param rec709Settings Settings to configure the handling of Rec709 color space.
   */
  public fun rec709Settings(rec709Settings: IResolvable) {
    cdkBuilder.rec709Settings(rec709Settings)
  }

  /**
   * @param rec709Settings Settings to configure the handling of Rec709 color space.
   */
  public fun rec709Settings(rec709Settings: CfnChannel.Rec709SettingsProperty) {
    cdkBuilder.rec709Settings(rec709Settings)
  }

  public fun build(): CfnChannel.H264ColorSpaceSettingsProperty = cdkBuilder.build()
}
