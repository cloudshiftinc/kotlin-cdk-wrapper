@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplatePieChartFieldWellsPropertyDsl {
  private val cdkBuilder: CfnTemplate.PieChartFieldWellsProperty.Builder =
      CfnTemplate.PieChartFieldWellsProperty.builder()

  public fun pieChartAggregatedFieldWells(pieChartAggregatedFieldWells: IResolvable) {
    cdkBuilder.pieChartAggregatedFieldWells(pieChartAggregatedFieldWells)
  }

  public
      fun pieChartAggregatedFieldWells(pieChartAggregatedFieldWells: CfnTemplate.PieChartAggregatedFieldWellsProperty) {
    cdkBuilder.pieChartAggregatedFieldWells(pieChartAggregatedFieldWells)
  }

  public fun build(): CfnTemplate.PieChartFieldWellsProperty = cdkBuilder.build()
}
