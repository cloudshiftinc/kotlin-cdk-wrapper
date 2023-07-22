@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardLineChartFieldWellsPropertyDsl {
  private val cdkBuilder: CfnDashboard.LineChartFieldWellsProperty.Builder =
      CfnDashboard.LineChartFieldWellsProperty.builder()

  /**
   * @param lineChartAggregatedFieldWells The field well configuration of a line chart.
   */
  public fun lineChartAggregatedFieldWells(lineChartAggregatedFieldWells: IResolvable) {
    cdkBuilder.lineChartAggregatedFieldWells(lineChartAggregatedFieldWells)
  }

  /**
   * @param lineChartAggregatedFieldWells The field well configuration of a line chart.
   */
  public
      fun lineChartAggregatedFieldWells(lineChartAggregatedFieldWells: CfnDashboard.LineChartAggregatedFieldWellsProperty) {
    cdkBuilder.lineChartAggregatedFieldWells(lineChartAggregatedFieldWells)
  }

  public fun build(): CfnDashboard.LineChartFieldWellsProperty = cdkBuilder.build()
}
