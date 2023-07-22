@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iotevents

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.iotevents.CfnDetectorModel

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
