@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplateLineChartFieldWellsPropertyDsl {
  private val cdkBuilder: CfnTemplate.LineChartFieldWellsProperty.Builder =
      CfnTemplate.LineChartFieldWellsProperty.builder()

  public fun lineChartAggregatedFieldWells(lineChartAggregatedFieldWells: IResolvable) {
    cdkBuilder.lineChartAggregatedFieldWells(lineChartAggregatedFieldWells)
  }

  public
      fun lineChartAggregatedFieldWells(lineChartAggregatedFieldWells: CfnTemplate.LineChartAggregatedFieldWellsProperty) {
    cdkBuilder.lineChartAggregatedFieldWells(lineChartAggregatedFieldWells)
  }

  public fun build(): CfnTemplate.LineChartFieldWellsProperty = cdkBuilder.build()
}
