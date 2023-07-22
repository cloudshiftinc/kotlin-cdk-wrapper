@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardTrendArrowOptionsPropertyDsl {
  private val cdkBuilder: CfnDashboard.TrendArrowOptionsProperty.Builder =
      CfnDashboard.TrendArrowOptionsProperty.builder()

  /**
   * @param visibility The visibility of the trend arrows.
   */
  public fun visibility(visibility: String) {
    cdkBuilder.visibility(visibility)
  }

  public fun build(): CfnDashboard.TrendArrowOptionsProperty = cdkBuilder.build()
}
