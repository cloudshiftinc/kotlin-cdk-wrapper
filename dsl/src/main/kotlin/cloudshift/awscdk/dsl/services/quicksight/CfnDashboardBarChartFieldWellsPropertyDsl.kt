@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardBarChartFieldWellsPropertyDsl {
  private val cdkBuilder: CfnDashboard.BarChartFieldWellsProperty.Builder =
      CfnDashboard.BarChartFieldWellsProperty.builder()

  public fun barChartAggregatedFieldWells(barChartAggregatedFieldWells: IResolvable) {
    cdkBuilder.barChartAggregatedFieldWells(barChartAggregatedFieldWells)
  }

  public
      fun barChartAggregatedFieldWells(barChartAggregatedFieldWells: CfnDashboard.BarChartAggregatedFieldWellsProperty) {
    cdkBuilder.barChartAggregatedFieldWells(barChartAggregatedFieldWells)
  }

  public fun build(): CfnDashboard.BarChartFieldWellsProperty = cdkBuilder.build()
}
