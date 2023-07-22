@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardPieChartFieldWellsPropertyDsl {
  private val cdkBuilder: CfnDashboard.PieChartFieldWellsProperty.Builder =
      CfnDashboard.PieChartFieldWellsProperty.builder()

  /**
   * @param pieChartAggregatedFieldWells The field well configuration of a pie chart.
   */
  public fun pieChartAggregatedFieldWells(pieChartAggregatedFieldWells: IResolvable) {
    cdkBuilder.pieChartAggregatedFieldWells(pieChartAggregatedFieldWells)
  }

  /**
   * @param pieChartAggregatedFieldWells The field well configuration of a pie chart.
   */
  public
      fun pieChartAggregatedFieldWells(pieChartAggregatedFieldWells: CfnDashboard.PieChartAggregatedFieldWellsProperty) {
    cdkBuilder.pieChartAggregatedFieldWells(pieChartAggregatedFieldWells)
  }

  public fun build(): CfnDashboard.PieChartFieldWellsProperty = cdkBuilder.build()
}
