@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iotevents

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.iotevents.CfnDetectorModel

@CdkDslMarker
public class CfnDetectorModelSetTimerPropertyDsl {
  private val cdkBuilder: CfnDetectorModel.SetTimerProperty.Builder =
      CfnDetectorModel.SetTimerProperty.builder()

  /**
   * @param durationExpression The duration of the timer, in seconds.
   * You can use a string expression that includes numbers, variables (
   * `$variable.&lt;variable-name&gt;` ), and input values (
   * `$input.&lt;input-name&gt;.&lt;path-to-datum&gt;` ) as the duration. The range of the duration is
   * 1-31622400 seconds. To ensure accuracy, the minimum duration is 60 seconds. The evaluated result
   * of the duration is rounded down to the nearest whole number.
   */
  public fun durationExpression(durationExpression: String) {
    cdkBuilder.durationExpression(durationExpression)
  }

  /**
   * @param seconds The number of seconds until the timer expires.
   * The minimum value is 60 seconds to ensure accuracy. The maximum value is 31622400 seconds.
   */
  public fun seconds(seconds: Number) {
    cdkBuilder.seconds(seconds)
  }

  /**
   * @param timerName The name of the timer. 
   */
  public fun timerName(timerName: String) {
    cdkBuilder.timerName(timerName)
  }

  public fun build(): CfnDetectorModel.SetTimerProperty = cdkBuilder.build()
}
