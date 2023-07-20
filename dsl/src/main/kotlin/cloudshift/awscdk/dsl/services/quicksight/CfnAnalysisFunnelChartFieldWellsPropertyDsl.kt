@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnAnalysis

@CdkDslMarker
public class CfnAnalysisFunnelChartFieldWellsPropertyDsl {
  private val cdkBuilder: CfnAnalysis.FunnelChartFieldWellsProperty.Builder =
      CfnAnalysis.FunnelChartFieldWellsProperty.builder()

  public fun funnelChartAggregatedFieldWells(funnelChartAggregatedFieldWells: IResolvable) {
    cdkBuilder.funnelChartAggregatedFieldWells(funnelChartAggregatedFieldWells)
  }

  public
      fun funnelChartAggregatedFieldWells(funnelChartAggregatedFieldWells: CfnAnalysis.FunnelChartAggregatedFieldWellsProperty) {
    cdkBuilder.funnelChartAggregatedFieldWells(funnelChartAggregatedFieldWells)
  }

  public fun build(): CfnAnalysis.FunnelChartFieldWellsProperty = cdkBuilder.build()
}
