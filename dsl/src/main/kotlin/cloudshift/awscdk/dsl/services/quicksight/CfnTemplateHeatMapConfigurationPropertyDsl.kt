@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplateHeatMapConfigurationPropertyDsl {
  private val cdkBuilder: CfnTemplate.HeatMapConfigurationProperty.Builder =
      CfnTemplate.HeatMapConfigurationProperty.builder()

  public fun colorScale(colorScale: IResolvable) {
    cdkBuilder.colorScale(colorScale)
  }

  public fun colorScale(colorScale: CfnTemplate.ColorScaleProperty) {
    cdkBuilder.colorScale(colorScale)
  }

  public fun columnLabelOptions(columnLabelOptions: IResolvable) {
    cdkBuilder.columnLabelOptions(columnLabelOptions)
  }

  public fun columnLabelOptions(columnLabelOptions: CfnTemplate.ChartAxisLabelOptionsProperty) {
    cdkBuilder.columnLabelOptions(columnLabelOptions)
  }

  public fun dataLabels(dataLabels: IResolvable) {
    cdkBuilder.dataLabels(dataLabels)
  }

  public fun dataLabels(dataLabels: CfnTemplate.DataLabelOptionsProperty) {
    cdkBuilder.dataLabels(dataLabels)
  }

  public fun fieldWells(fieldWells: IResolvable) {
    cdkBuilder.fieldWells(fieldWells)
  }

  public fun fieldWells(fieldWells: CfnTemplate.HeatMapFieldWellsProperty) {
    cdkBuilder.fieldWells(fieldWells)
  }

  public fun legend(legend: IResolvable) {
    cdkBuilder.legend(legend)
  }

  public fun legend(legend: CfnTemplate.LegendOptionsProperty) {
    cdkBuilder.legend(legend)
  }

  public fun rowLabelOptions(rowLabelOptions: IResolvable) {
    cdkBuilder.rowLabelOptions(rowLabelOptions)
  }

  public fun rowLabelOptions(rowLabelOptions: CfnTemplate.ChartAxisLabelOptionsProperty) {
    cdkBuilder.rowLabelOptions(rowLabelOptions)
  }

  public fun sortConfiguration(sortConfiguration: IResolvable) {
    cdkBuilder.sortConfiguration(sortConfiguration)
  }

  public fun sortConfiguration(sortConfiguration: CfnTemplate.HeatMapSortConfigurationProperty) {
    cdkBuilder.sortConfiguration(sortConfiguration)
  }

  public fun tooltip(tooltip: IResolvable) {
    cdkBuilder.tooltip(tooltip)
  }

  public fun tooltip(tooltip: CfnTemplate.TooltipOptionsProperty) {
    cdkBuilder.tooltip(tooltip)
  }

  public fun build(): CfnTemplate.HeatMapConfigurationProperty = cdkBuilder.build()
}
