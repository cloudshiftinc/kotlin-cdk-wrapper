@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplateBarChartFieldWellsPropertyDsl {
  private val cdkBuilder: CfnTemplate.BarChartFieldWellsProperty.Builder =
      CfnTemplate.BarChartFieldWellsProperty.builder()

  /**
   * @param barChartAggregatedFieldWells The aggregated field wells of a bar chart.
   */
  public fun barChartAggregatedFieldWells(barChartAggregatedFieldWells: IResolvable) {
    cdkBuilder.barChartAggregatedFieldWells(barChartAggregatedFieldWells)
  }

  /**
   * @param barChartAggregatedFieldWells The aggregated field wells of a bar chart.
   */
  public
      fun barChartAggregatedFieldWells(barChartAggregatedFieldWells: CfnTemplate.BarChartAggregatedFieldWellsProperty) {
    cdkBuilder.barChartAggregatedFieldWells(barChartAggregatedFieldWells)
  }

  public fun build(): CfnTemplate.BarChartFieldWellsProperty = cdkBuilder.build()
}
