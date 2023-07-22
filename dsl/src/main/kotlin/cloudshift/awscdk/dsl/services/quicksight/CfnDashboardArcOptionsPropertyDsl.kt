@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardArcOptionsPropertyDsl {
  private val cdkBuilder: CfnDashboard.ArcOptionsProperty.Builder =
      CfnDashboard.ArcOptionsProperty.builder()

  /**
   * @param arcThickness The arc thickness of a `GaugeChartVisual` .
   */
  public fun arcThickness(arcThickness: String) {
    cdkBuilder.arcThickness(arcThickness)
  }

  public fun build(): CfnDashboard.ArcOptionsProperty = cdkBuilder.build()
}
