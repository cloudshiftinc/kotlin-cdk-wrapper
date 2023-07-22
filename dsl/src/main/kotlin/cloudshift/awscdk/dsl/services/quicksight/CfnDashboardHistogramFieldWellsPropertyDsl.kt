@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardHistogramFieldWellsPropertyDsl {
  private val cdkBuilder: CfnDashboard.HistogramFieldWellsProperty.Builder =
      CfnDashboard.HistogramFieldWellsProperty.builder()

  /**
   * @param histogramAggregatedFieldWells The field well configuration of a histogram.
   */
  public fun histogramAggregatedFieldWells(histogramAggregatedFieldWells: IResolvable) {
    cdkBuilder.histogramAggregatedFieldWells(histogramAggregatedFieldWells)
  }

  /**
   * @param histogramAggregatedFieldWells The field well configuration of a histogram.
   */
  public
      fun histogramAggregatedFieldWells(histogramAggregatedFieldWells: CfnDashboard.HistogramAggregatedFieldWellsProperty) {
    cdkBuilder.histogramAggregatedFieldWells(histogramAggregatedFieldWells)
  }

  public fun build(): CfnDashboard.HistogramFieldWellsProperty = cdkBuilder.build()
}
