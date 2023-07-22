@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardScatterPlotFieldWellsPropertyDsl {
  private val cdkBuilder: CfnDashboard.ScatterPlotFieldWellsProperty.Builder =
      CfnDashboard.ScatterPlotFieldWellsProperty.builder()

  /**
   * @param scatterPlotCategoricallyAggregatedFieldWells The aggregated field wells of a scatter
   * plot.
   * The x and y-axes of scatter plots with aggregated field wells are aggregated by category,
   * label, or both.
   */
  public
      fun scatterPlotCategoricallyAggregatedFieldWells(scatterPlotCategoricallyAggregatedFieldWells: IResolvable) {
    cdkBuilder.scatterPlotCategoricallyAggregatedFieldWells(scatterPlotCategoricallyAggregatedFieldWells)
  }

  /**
   * @param scatterPlotCategoricallyAggregatedFieldWells The aggregated field wells of a scatter
   * plot.
   * The x and y-axes of scatter plots with aggregated field wells are aggregated by category,
   * label, or both.
   */
  public
      fun scatterPlotCategoricallyAggregatedFieldWells(scatterPlotCategoricallyAggregatedFieldWells: CfnDashboard.ScatterPlotCategoricallyAggregatedFieldWellsProperty) {
    cdkBuilder.scatterPlotCategoricallyAggregatedFieldWells(scatterPlotCategoricallyAggregatedFieldWells)
  }

  /**
   * @param scatterPlotUnaggregatedFieldWells The unaggregated field wells of a scatter plot.
   * The x and y-axes of these scatter plots are unaggregated.
   */
  public fun scatterPlotUnaggregatedFieldWells(scatterPlotUnaggregatedFieldWells: IResolvable) {
    cdkBuilder.scatterPlotUnaggregatedFieldWells(scatterPlotUnaggregatedFieldWells)
  }

  /**
   * @param scatterPlotUnaggregatedFieldWells The unaggregated field wells of a scatter plot.
   * The x and y-axes of these scatter plots are unaggregated.
   */
  public
      fun scatterPlotUnaggregatedFieldWells(scatterPlotUnaggregatedFieldWells: CfnDashboard.ScatterPlotUnaggregatedFieldWellsProperty) {
    cdkBuilder.scatterPlotUnaggregatedFieldWells(scatterPlotUnaggregatedFieldWells)
  }

  public fun build(): CfnDashboard.ScatterPlotFieldWellsProperty = cdkBuilder.build()
}
