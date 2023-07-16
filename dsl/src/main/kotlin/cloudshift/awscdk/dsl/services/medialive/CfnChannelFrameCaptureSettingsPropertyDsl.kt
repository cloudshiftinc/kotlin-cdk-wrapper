@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.medialive

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.medialive.CfnChannel

@CdkDslMarker
public class CfnChannelFrameCaptureSettingsPropertyDsl {
  private val cdkBuilder: CfnChannel.FrameCaptureSettingsProperty.Builder =
      CfnChannel.FrameCaptureSettingsProperty.builder()

  public fun captureInterval(captureInterval: Number) {
    cdkBuilder.captureInterval(captureInterval)
  }

  public fun captureIntervalUnits(captureIntervalUnits: String) {
    cdkBuilder.captureIntervalUnits(captureIntervalUnits)
  }

  public fun timecodeBurninSettings(timecodeBurninSettings: IResolvable) {
    cdkBuilder.timecodeBurninSettings(timecodeBurninSettings)
  }

  public
      fun timecodeBurninSettings(timecodeBurninSettings: CfnChannel.TimecodeBurninSettingsProperty) {
    cdkBuilder.timecodeBurninSettings(timecodeBurninSettings)
  }

  public fun build(): CfnChannel.FrameCaptureSettingsProperty = cdkBuilder.build()
}
