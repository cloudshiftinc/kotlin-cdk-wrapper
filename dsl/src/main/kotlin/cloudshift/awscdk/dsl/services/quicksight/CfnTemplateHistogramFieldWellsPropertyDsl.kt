@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplateHistogramFieldWellsPropertyDsl {
  private val cdkBuilder: CfnTemplate.HistogramFieldWellsProperty.Builder =
      CfnTemplate.HistogramFieldWellsProperty.builder()

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
      fun histogramAggregatedFieldWells(histogramAggregatedFieldWells: CfnTemplate.HistogramAggregatedFieldWellsProperty) {
    cdkBuilder.histogramAggregatedFieldWells(histogramAggregatedFieldWells)
  }

  public fun build(): CfnTemplate.HistogramFieldWellsProperty = cdkBuilder.build()
}
