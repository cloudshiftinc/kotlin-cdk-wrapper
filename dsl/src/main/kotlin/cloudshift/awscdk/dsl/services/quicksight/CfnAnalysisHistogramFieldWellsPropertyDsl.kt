@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnAnalysis

@CdkDslMarker
public class CfnAnalysisHistogramFieldWellsPropertyDsl {
  private val cdkBuilder: CfnAnalysis.HistogramFieldWellsProperty.Builder =
      CfnAnalysis.HistogramFieldWellsProperty.builder()

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
      fun histogramAggregatedFieldWells(histogramAggregatedFieldWells: CfnAnalysis.HistogramAggregatedFieldWellsProperty) {
    cdkBuilder.histogramAggregatedFieldWells(histogramAggregatedFieldWells)
  }

  public fun build(): CfnAnalysis.HistogramFieldWellsProperty = cdkBuilder.build()
}
