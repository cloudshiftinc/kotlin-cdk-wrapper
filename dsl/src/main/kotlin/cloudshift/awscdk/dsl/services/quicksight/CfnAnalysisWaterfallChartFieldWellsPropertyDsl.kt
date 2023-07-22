@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnAnalysis

@CdkDslMarker
public class CfnAnalysisWaterfallChartFieldWellsPropertyDsl {
  private val cdkBuilder: CfnAnalysis.WaterfallChartFieldWellsProperty.Builder =
      CfnAnalysis.WaterfallChartFieldWellsProperty.builder()

  /**
   * @param waterfallChartAggregatedFieldWells The field well configuration of a waterfall visual.
   */
  public fun waterfallChartAggregatedFieldWells(waterfallChartAggregatedFieldWells: IResolvable) {
    cdkBuilder.waterfallChartAggregatedFieldWells(waterfallChartAggregatedFieldWells)
  }

  /**
   * @param waterfallChartAggregatedFieldWells The field well configuration of a waterfall visual.
   */
  public
      fun waterfallChartAggregatedFieldWells(waterfallChartAggregatedFieldWells: CfnAnalysis.WaterfallChartAggregatedFieldWellsProperty) {
    cdkBuilder.waterfallChartAggregatedFieldWells(waterfallChartAggregatedFieldWells)
  }

  public fun build(): CfnAnalysis.WaterfallChartFieldWellsProperty = cdkBuilder.build()
}
