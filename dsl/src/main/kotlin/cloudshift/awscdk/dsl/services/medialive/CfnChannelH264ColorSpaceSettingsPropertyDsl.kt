@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.medialive

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.medialive.CfnChannel

@CdkDslMarker
public class CfnChannelH264ColorSpaceSettingsPropertyDsl {
  private val cdkBuilder: CfnChannel.H264ColorSpaceSettingsProperty.Builder =
      CfnChannel.H264ColorSpaceSettingsProperty.builder()

  public fun colorSpacePassthroughSettings(colorSpacePassthroughSettings: IResolvable) {
    cdkBuilder.colorSpacePassthroughSettings(colorSpacePassthroughSettings)
  }

  public
      fun colorSpacePassthroughSettings(colorSpacePassthroughSettings: CfnChannel.ColorSpacePassthroughSettingsProperty) {
    cdkBuilder.colorSpacePassthroughSettings(colorSpacePassthroughSettings)
  }

  public fun rec601Settings(rec601Settings: IResolvable) {
    cdkBuilder.rec601Settings(rec601Settings)
  }

  public fun rec601Settings(rec601Settings: CfnChannel.Rec601SettingsProperty) {
    cdkBuilder.rec601Settings(rec601Settings)
  }

  public fun rec709Settings(rec709Settings: IResolvable) {
    cdkBuilder.rec709Settings(rec709Settings)
  }

  public fun rec709Settings(rec709Settings: CfnChannel.Rec709SettingsProperty) {
    cdkBuilder.rec709Settings(rec709Settings)
  }

  public fun build(): CfnChannel.H264ColorSpaceSettingsProperty = cdkBuilder.build()
}
