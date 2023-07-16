@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iotevents

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.iotevents.CfnDetectorModel

@CdkDslMarker
public class CfnDetectorModelResetTimerPropertyDsl {
  private val cdkBuilder: CfnDetectorModel.ResetTimerProperty.Builder =
      CfnDetectorModel.ResetTimerProperty.builder()

  public fun timerName(timerName: String) {
    cdkBuilder.timerName(timerName)
  }

  public fun build(): CfnDetectorModel.ResetTimerProperty = cdkBuilder.build()
}
