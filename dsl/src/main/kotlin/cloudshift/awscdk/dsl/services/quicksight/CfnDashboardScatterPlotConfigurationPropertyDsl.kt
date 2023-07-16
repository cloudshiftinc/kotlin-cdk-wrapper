@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardScatterPlotConfigurationPropertyDsl {
  private val cdkBuilder: CfnDashboard.ScatterPlotConfigurationProperty.Builder =
      CfnDashboard.ScatterPlotConfigurationProperty.builder()

  public fun dataLabels(dataLabels: IResolvable) {
    cdkBuilder.dataLabels(dataLabels)
  }

  public fun dataLabels(dataLabels: CfnDashboard.DataLabelOptionsProperty) {
    cdkBuilder.dataLabels(dataLabels)
  }

  public fun fieldWells(fieldWells: IResolvable) {
    cdkBuilder.fieldWells(fieldWells)
  }

  public fun fieldWells(fieldWells: CfnDashboard.ScatterPlotFieldWellsProperty) {
    cdkBuilder.fieldWells(fieldWells)
  }

  public fun legend(legend: IResolvable) {
    cdkBuilder.legend(legend)
  }

  public fun legend(legend: CfnDashboard.LegendOptionsProperty) {
    cdkBuilder.legend(legend)
  }

  public fun tooltip(tooltip: IResolvable) {
    cdkBuilder.tooltip(tooltip)
  }

  public fun tooltip(tooltip: CfnDashboard.TooltipOptionsProperty) {
    cdkBuilder.tooltip(tooltip)
  }

  public fun visualPalette(visualPalette: IResolvable) {
    cdkBuilder.visualPalette(visualPalette)
  }

  public fun visualPalette(visualPalette: CfnDashboard.VisualPaletteProperty) {
    cdkBuilder.visualPalette(visualPalette)
  }

  public fun xAxisDisplayOptions(xAxisDisplayOptions: IResolvable) {
    cdkBuilder.xAxisDisplayOptions(xAxisDisplayOptions)
  }

  public fun xAxisDisplayOptions(xAxisDisplayOptions: CfnDashboard.AxisDisplayOptionsProperty) {
    cdkBuilder.xAxisDisplayOptions(xAxisDisplayOptions)
  }

  public fun xAxisLabelOptions(xAxisLabelOptions: IResolvable) {
    cdkBuilder.xAxisLabelOptions(xAxisLabelOptions)
  }

  public fun xAxisLabelOptions(xAxisLabelOptions: CfnDashboard.ChartAxisLabelOptionsProperty) {
    cdkBuilder.xAxisLabelOptions(xAxisLabelOptions)
  }

  public fun yAxisDisplayOptions(yAxisDisplayOptions: IResolvable) {
    cdkBuilder.yAxisDisplayOptions(yAxisDisplayOptions)
  }

  public fun yAxisDisplayOptions(yAxisDisplayOptions: CfnDashboard.AxisDisplayOptionsProperty) {
    cdkBuilder.yAxisDisplayOptions(yAxisDisplayOptions)
  }

  public fun yAxisLabelOptions(yAxisLabelOptions: IResolvable) {
    cdkBuilder.yAxisLabelOptions(yAxisLabelOptions)
  }

  public fun yAxisLabelOptions(yAxisLabelOptions: CfnDashboard.ChartAxisLabelOptionsProperty) {
    cdkBuilder.yAxisLabelOptions(yAxisLabelOptions)
  }

  public fun build(): CfnDashboard.ScatterPlotConfigurationProperty = cdkBuilder.build()
}
