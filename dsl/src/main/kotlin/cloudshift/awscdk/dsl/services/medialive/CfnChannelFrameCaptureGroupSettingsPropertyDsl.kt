@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.medialive

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.medialive.CfnChannel

@CdkDslMarker
public class CfnChannelFrameCaptureGroupSettingsPropertyDsl {
  private val cdkBuilder: CfnChannel.FrameCaptureGroupSettingsProperty.Builder =
      CfnChannel.FrameCaptureGroupSettingsProperty.builder()

  public fun destination(destination: IResolvable) {
    cdkBuilder.destination(destination)
  }

  public fun destination(destination: CfnChannel.OutputLocationRefProperty) {
    cdkBuilder.destination(destination)
  }

  public fun frameCaptureCdnSettings(frameCaptureCdnSettings: IResolvable) {
    cdkBuilder.frameCaptureCdnSettings(frameCaptureCdnSettings)
  }

  public
      fun frameCaptureCdnSettings(frameCaptureCdnSettings: CfnChannel.FrameCaptureCdnSettingsProperty) {
    cdkBuilder.frameCaptureCdnSettings(frameCaptureCdnSettings)
  }

  public fun build(): CfnChannel.FrameCaptureGroupSettingsProperty = cdkBuilder.build()
}
