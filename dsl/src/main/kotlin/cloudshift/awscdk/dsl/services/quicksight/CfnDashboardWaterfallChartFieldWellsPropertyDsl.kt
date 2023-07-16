@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardWaterfallChartFieldWellsPropertyDsl {
  private val cdkBuilder: CfnDashboard.WaterfallChartFieldWellsProperty.Builder =
      CfnDashboard.WaterfallChartFieldWellsProperty.builder()

  public fun waterfallChartAggregatedFieldWells(waterfallChartAggregatedFieldWells: IResolvable) {
    cdkBuilder.waterfallChartAggregatedFieldWells(waterfallChartAggregatedFieldWells)
  }

  public
      fun waterfallChartAggregatedFieldWells(waterfallChartAggregatedFieldWells: CfnDashboard.WaterfallChartAggregatedFieldWellsProperty) {
    cdkBuilder.waterfallChartAggregatedFieldWells(waterfallChartAggregatedFieldWells)
  }

  public fun build(): CfnDashboard.WaterfallChartFieldWellsProperty = cdkBuilder.build()
}
