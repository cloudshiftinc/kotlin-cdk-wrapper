@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iotevents

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.iotevents.CfnDetectorModel

/**
 * Information needed to clear the timer.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iotevents.*;
 * ClearTimerProperty clearTimerProperty = ClearTimerProperty.builder()
 * .timerName("timerName")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-cleartimer.html)
 */
@CdkDslMarker
public class CfnDetectorModelClearTimerPropertyDsl {
  private val cdkBuilder: CfnDetectorModel.ClearTimerProperty.Builder =
      CfnDetectorModel.ClearTimerProperty.builder()

  /**
   * @param timerName The name of the timer to clear. 
   */
  public fun timerName(timerName: String) {
    cdkBuilder.timerName(timerName)
  }

  public fun build(): CfnDetectorModel.ClearTimerProperty = cdkBuilder.build()
}
