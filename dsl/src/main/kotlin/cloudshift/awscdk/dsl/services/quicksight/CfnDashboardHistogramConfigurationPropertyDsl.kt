@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardHistogramConfigurationPropertyDsl {
  private val cdkBuilder: CfnDashboard.HistogramConfigurationProperty.Builder =
      CfnDashboard.HistogramConfigurationProperty.builder()

  public fun binOptions(binOptions: IResolvable) {
    cdkBuilder.binOptions(binOptions)
  }

  public fun binOptions(binOptions: CfnDashboard.HistogramBinOptionsProperty) {
    cdkBuilder.binOptions(binOptions)
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

  public fun fieldWells(fieldWells: CfnDashboard.HistogramFieldWellsProperty) {
    cdkBuilder.fieldWells(fieldWells)
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

  public fun build(): CfnDashboard.HistogramConfigurationProperty = cdkBuilder.build()
}
