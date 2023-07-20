@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardHeatMapConfigurationPropertyDsl {
  private val cdkBuilder: CfnDashboard.HeatMapConfigurationProperty.Builder =
      CfnDashboard.HeatMapConfigurationProperty.builder()

  public fun colorScale(colorScale: IResolvable) {
    cdkBuilder.colorScale(colorScale)
  }

  public fun colorScale(colorScale: CfnDashboard.ColorScaleProperty) {
    cdkBuilder.colorScale(colorScale)
  }

  public fun columnLabelOptions(columnLabelOptions: IResolvable) {
    cdkBuilder.columnLabelOptions(columnLabelOptions)
  }

  public fun columnLabelOptions(columnLabelOptions: CfnDashboard.ChartAxisLabelOptionsProperty) {
    cdkBuilder.columnLabelOptions(columnLabelOptions)
  }

  public fun dataLabels(dataLabels: IResolvable) {
    cdkBuilder.dataLabels(dataLabels)
  }

  public fun dataLabels(dataLabels: CfnDashboard.DataLabelOptionsProperty) {
    cdkBuilder.dataLabels(dataLabels)
  }

  public fun fieldWells(fieldWells: IResolvable) {
    cdkBuilder.fieldWells(fieldWells)
  }

  public fun fieldWells(fieldWells: CfnDashboard.HeatMapFieldWellsProperty) {
    cdkBuilder.fieldWells(fieldWells)
  }

  public fun legend(legend: IResolvable) {
    cdkBuilder.legend(legend)
  }

  public fun legend(legend: CfnDashboard.LegendOptionsProperty) {
    cdkBuilder.legend(legend)
  }

  public fun rowLabelOptions(rowLabelOptions: IResolvable) {
    cdkBuilder.rowLabelOptions(rowLabelOptions)
  }

  public fun rowLabelOptions(rowLabelOptions: CfnDashboard.ChartAxisLabelOptionsProperty) {
    cdkBuilder.rowLabelOptions(rowLabelOptions)
  }

  public fun sortConfiguration(sortConfiguration: IResolvable) {
    cdkBuilder.sortConfiguration(sortConfiguration)
  }

  public fun sortConfiguration(sortConfiguration: CfnDashboard.HeatMapSortConfigurationProperty) {
    cdkBuilder.sortConfiguration(sortConfiguration)
  }

  public fun tooltip(tooltip: IResolvable) {
    cdkBuilder.tooltip(tooltip)
  }

  public fun tooltip(tooltip: CfnDashboard.TooltipOptionsProperty) {
    cdkBuilder.tooltip(tooltip)
  }

  public fun build(): CfnDashboard.HeatMapConfigurationProperty = cdkBuilder.build()
}
