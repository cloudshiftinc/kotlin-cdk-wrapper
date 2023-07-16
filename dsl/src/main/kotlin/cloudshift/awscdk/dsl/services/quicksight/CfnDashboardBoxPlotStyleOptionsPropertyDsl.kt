@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardBoxPlotStyleOptionsPropertyDsl {
  private val cdkBuilder: CfnDashboard.BoxPlotStyleOptionsProperty.Builder =
      CfnDashboard.BoxPlotStyleOptionsProperty.builder()

  public fun fillStyle(fillStyle: String) {
    cdkBuilder.fillStyle(fillStyle)
  }

  public fun build(): CfnDashboard.BoxPlotStyleOptionsProperty = cdkBuilder.build()
}
