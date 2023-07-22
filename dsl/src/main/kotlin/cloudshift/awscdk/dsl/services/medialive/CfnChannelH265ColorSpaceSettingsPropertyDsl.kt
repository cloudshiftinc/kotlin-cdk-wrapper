@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.medialive

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.medialive.CfnChannel

@CdkDslMarker
public class CfnChannelH265ColorSpaceSettingsPropertyDsl {
  private val cdkBuilder: CfnChannel.H265ColorSpaceSettingsProperty.Builder =
      CfnChannel.H265ColorSpaceSettingsProperty.builder()

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
   * @param dolbyVision81Settings the value to be set.
   */
  public fun dolbyVision81Settings(dolbyVision81Settings: IResolvable) {
    cdkBuilder.dolbyVision81Settings(dolbyVision81Settings)
  }

  /**
   * @param dolbyVision81Settings the value to be set.
   */
  public
      fun dolbyVision81Settings(dolbyVision81Settings: CfnChannel.DolbyVision81SettingsProperty) {
    cdkBuilder.dolbyVision81Settings(dolbyVision81Settings)
  }

  /**
   * @param hdr10Settings Settings to configure the handling of HDR10 color space.
   */
  public fun hdr10Settings(hdr10Settings: IResolvable) {
    cdkBuilder.hdr10Settings(hdr10Settings)
  }

  /**
   * @param hdr10Settings Settings to configure the handling of HDR10 color space.
   */
  public fun hdr10Settings(hdr10Settings: CfnChannel.Hdr10SettingsProperty) {
    cdkBuilder.hdr10Settings(hdr10Settings)
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

  public fun build(): CfnChannel.H265ColorSpaceSettingsProperty = cdkBuilder.build()
}
