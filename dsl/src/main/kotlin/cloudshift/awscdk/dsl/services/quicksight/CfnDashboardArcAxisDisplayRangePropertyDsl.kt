@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardArcAxisDisplayRangePropertyDsl {
  private val cdkBuilder: CfnDashboard.ArcAxisDisplayRangeProperty.Builder =
      CfnDashboard.ArcAxisDisplayRangeProperty.builder()

  public fun max(max: Number) {
    cdkBuilder.max(max)
  }

  public fun min(min: Number) {
    cdkBuilder.min(min)
  }

  public fun build(): CfnDashboard.ArcAxisDisplayRangeProperty = cdkBuilder.build()
}
