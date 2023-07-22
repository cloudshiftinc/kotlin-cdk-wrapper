@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardDonutCenterOptionsPropertyDsl {
  private val cdkBuilder: CfnDashboard.DonutCenterOptionsProperty.Builder =
      CfnDashboard.DonutCenterOptionsProperty.builder()

  /**
   * @param labelVisibility Determines the visibility of the label in a donut chart.
   * In the Amazon QuickSight console, this option is called `'Show total'` .
   */
  public fun labelVisibility(labelVisibility: String) {
    cdkBuilder.labelVisibility(labelVisibility)
  }

  public fun build(): CfnDashboard.DonutCenterOptionsProperty = cdkBuilder.build()
}
