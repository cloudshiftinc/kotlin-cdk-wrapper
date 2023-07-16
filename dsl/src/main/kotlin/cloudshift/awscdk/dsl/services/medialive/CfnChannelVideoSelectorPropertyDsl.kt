@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.medialive

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.medialive.CfnChannel

@CdkDslMarker
public class CfnChannelVideoSelectorPropertyDsl {
  private val cdkBuilder: CfnChannel.VideoSelectorProperty.Builder =
      CfnChannel.VideoSelectorProperty.builder()

  public fun colorSpace(colorSpace: String) {
    cdkBuilder.colorSpace(colorSpace)
  }

  public fun colorSpaceSettings(colorSpaceSettings: IResolvable) {
    cdkBuilder.colorSpaceSettings(colorSpaceSettings)
  }

  public
      fun colorSpaceSettings(colorSpaceSettings: CfnChannel.VideoSelectorColorSpaceSettingsProperty) {
    cdkBuilder.colorSpaceSettings(colorSpaceSettings)
  }

  public fun colorSpaceUsage(colorSpaceUsage: String) {
    cdkBuilder.colorSpaceUsage(colorSpaceUsage)
  }

  public fun selectorSettings(selectorSettings: IResolvable) {
    cdkBuilder.selectorSettings(selectorSettings)
  }

  public fun selectorSettings(selectorSettings: CfnChannel.VideoSelectorSettingsProperty) {
    cdkBuilder.selectorSettings(selectorSettings)
  }

  public fun build(): CfnChannel.VideoSelectorProperty = cdkBuilder.build()
}
