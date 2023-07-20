@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnAnalysis

@CdkDslMarker
public class CfnAnalysisPieChartFieldWellsPropertyDsl {
  private val cdkBuilder: CfnAnalysis.PieChartFieldWellsProperty.Builder =
      CfnAnalysis.PieChartFieldWellsProperty.builder()

  public fun pieChartAggregatedFieldWells(pieChartAggregatedFieldWells: IResolvable) {
    cdkBuilder.pieChartAggregatedFieldWells(pieChartAggregatedFieldWells)
  }

  public
      fun pieChartAggregatedFieldWells(pieChartAggregatedFieldWells: CfnAnalysis.PieChartAggregatedFieldWellsProperty) {
    cdkBuilder.pieChartAggregatedFieldWells(pieChartAggregatedFieldWells)
  }

  public fun build(): CfnAnalysis.PieChartFieldWellsProperty = cdkBuilder.build()
}
