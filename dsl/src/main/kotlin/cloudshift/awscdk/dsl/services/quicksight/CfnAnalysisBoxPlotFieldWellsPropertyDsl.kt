@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnAnalysis

@CdkDslMarker
public class CfnAnalysisBoxPlotFieldWellsPropertyDsl {
  private val cdkBuilder: CfnAnalysis.BoxPlotFieldWellsProperty.Builder =
      CfnAnalysis.BoxPlotFieldWellsProperty.builder()

  public fun boxPlotAggregatedFieldWells(boxPlotAggregatedFieldWells: IResolvable) {
    cdkBuilder.boxPlotAggregatedFieldWells(boxPlotAggregatedFieldWells)
  }

  public
      fun boxPlotAggregatedFieldWells(boxPlotAggregatedFieldWells: CfnAnalysis.BoxPlotAggregatedFieldWellsProperty) {
    cdkBuilder.boxPlotAggregatedFieldWells(boxPlotAggregatedFieldWells)
  }

  public fun build(): CfnAnalysis.BoxPlotFieldWellsProperty = cdkBuilder.build()
}
