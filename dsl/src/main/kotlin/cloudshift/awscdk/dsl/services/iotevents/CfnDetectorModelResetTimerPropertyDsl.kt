@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iotevents

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.iotevents.CfnDetectorModel

/**
 * Information required to reset the timer.
 *
 * The timer is reset to the previously evaluated result of the duration. The duration expression
 * isn't reevaluated when you reset the timer.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iotevents.*;
 * ResetTimerProperty resetTimerProperty = ResetTimerProperty.builder()
 * .timerName("timerName")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-resettimer.html)
 */
@CdkDslMarker
public class CfnDetectorModelResetTimerPropertyDsl {
  private val cdkBuilder: CfnDetectorModel.ResetTimerProperty.Builder =
      CfnDetectorModel.ResetTimerProperty.builder()

  /**
   * @param timerName The name of the timer to reset. 
   */
  public fun timerName(timerName: String) {
    cdkBuilder.timerName(timerName)
  }

  public fun build(): CfnDetectorModel.ResetTimerProperty = cdkBuilder.build()
}
