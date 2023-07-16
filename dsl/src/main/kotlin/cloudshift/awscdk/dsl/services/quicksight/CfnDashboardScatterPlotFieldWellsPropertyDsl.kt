@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardScatterPlotFieldWellsPropertyDsl {
  private val cdkBuilder: CfnDashboard.ScatterPlotFieldWellsProperty.Builder =
      CfnDashboard.ScatterPlotFieldWellsProperty.builder()

  public
      fun scatterPlotCategoricallyAggregatedFieldWells(scatterPlotCategoricallyAggregatedFieldWells: IResolvable) {
    cdkBuilder.scatterPlotCategoricallyAggregatedFieldWells(scatterPlotCategoricallyAggregatedFieldWells)
  }

  public
      fun scatterPlotCategoricallyAggregatedFieldWells(scatterPlotCategoricallyAggregatedFieldWells: CfnDashboard.ScatterPlotCategoricallyAggregatedFieldWellsProperty) {
    cdkBuilder.scatterPlotCategoricallyAggregatedFieldWells(scatterPlotCategoricallyAggregatedFieldWells)
  }

  public fun scatterPlotUnaggregatedFieldWells(scatterPlotUnaggregatedFieldWells: IResolvable) {
    cdkBuilder.scatterPlotUnaggregatedFieldWells(scatterPlotUnaggregatedFieldWells)
  }

  public
      fun scatterPlotUnaggregatedFieldWells(scatterPlotUnaggregatedFieldWells: CfnDashboard.ScatterPlotUnaggregatedFieldWellsProperty) {
    cdkBuilder.scatterPlotUnaggregatedFieldWells(scatterPlotUnaggregatedFieldWells)
  }

  public fun build(): CfnDashboard.ScatterPlotFieldWellsProperty = cdkBuilder.build()
}
