@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardComboChartFieldWellsPropertyDsl {
  private val cdkBuilder: CfnDashboard.ComboChartFieldWellsProperty.Builder =
      CfnDashboard.ComboChartFieldWellsProperty.builder()

  public fun comboChartAggregatedFieldWells(comboChartAggregatedFieldWells: IResolvable) {
    cdkBuilder.comboChartAggregatedFieldWells(comboChartAggregatedFieldWells)
  }

  public
      fun comboChartAggregatedFieldWells(comboChartAggregatedFieldWells: CfnDashboard.ComboChartAggregatedFieldWellsProperty) {
    cdkBuilder.comboChartAggregatedFieldWells(comboChartAggregatedFieldWells)
  }

  public fun build(): CfnDashboard.ComboChartFieldWellsProperty = cdkBuilder.build()
}
