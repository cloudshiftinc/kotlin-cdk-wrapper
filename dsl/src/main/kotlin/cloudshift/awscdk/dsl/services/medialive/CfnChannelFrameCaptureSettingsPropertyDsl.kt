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

  /**
   * @param captureInterval The frequency, in seconds, for capturing frames for inclusion in the
   * output.
   * For example, "10" means capture a frame every 10 seconds.
   */
  public fun captureInterval(captureInterval: Number) {
    cdkBuilder.captureInterval(captureInterval)
  }

  /**
   * @param captureIntervalUnits Unit for the frame capture interval.
   */
  public fun captureIntervalUnits(captureIntervalUnits: String) {
    cdkBuilder.captureIntervalUnits(captureIntervalUnits)
  }

  /**
   * @param timecodeBurninSettings the value to be set.
   */
  public fun timecodeBurninSettings(timecodeBurninSettings: IResolvable) {
    cdkBuilder.timecodeBurninSettings(timecodeBurninSettings)
  }

  /**
   * @param timecodeBurninSettings the value to be set.
   */
  public
      fun timecodeBurninSettings(timecodeBurninSettings: CfnChannel.TimecodeBurninSettingsProperty) {
    cdkBuilder.timecodeBurninSettings(timecodeBurninSettings)
  }

  public fun build(): CfnChannel.FrameCaptureSettingsProperty = cdkBuilder.build()
}
