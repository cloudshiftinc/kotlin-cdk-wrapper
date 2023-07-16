@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplateScatterPlotConfigurationPropertyDsl {
  private val cdkBuilder: CfnTemplate.ScatterPlotConfigurationProperty.Builder =
      CfnTemplate.ScatterPlotConfigurationProperty.builder()

  public fun dataLabels(dataLabels: IResolvable) {
    cdkBuilder.dataLabels(dataLabels)
  }

  public fun dataLabels(dataLabels: CfnTemplate.DataLabelOptionsProperty) {
    cdkBuilder.dataLabels(dataLabels)
  }

  public fun fieldWells(fieldWells: IResolvable) {
    cdkBuilder.fieldWells(fieldWells)
  }

  public fun fieldWells(fieldWells: CfnTemplate.ScatterPlotFieldWellsProperty) {
    cdkBuilder.fieldWells(fieldWells)
  }

  public fun legend(legend: IResolvable) {
    cdkBuilder.legend(legend)
  }

  public fun legend(legend: CfnTemplate.LegendOptionsProperty) {
    cdkBuilder.legend(legend)
  }

  public fun tooltip(tooltip: IResolvable) {
    cdkBuilder.tooltip(tooltip)
  }

  public fun tooltip(tooltip: CfnTemplate.TooltipOptionsProperty) {
    cdkBuilder.tooltip(tooltip)
  }

  public fun visualPalette(visualPalette: IResolvable) {
    cdkBuilder.visualPalette(visualPalette)
  }

  public fun visualPalette(visualPalette: CfnTemplate.VisualPaletteProperty) {
    cdkBuilder.visualPalette(visualPalette)
  }

  public fun xAxisDisplayOptions(xAxisDisplayOptions: IResolvable) {
    cdkBuilder.xAxisDisplayOptions(xAxisDisplayOptions)
  }

  public fun xAxisDisplayOptions(xAxisDisplayOptions: CfnTemplate.AxisDisplayOptionsProperty) {
    cdkBuilder.xAxisDisplayOptions(xAxisDisplayOptions)
  }

  public fun xAxisLabelOptions(xAxisLabelOptions: IResolvable) {
    cdkBuilder.xAxisLabelOptions(xAxisLabelOptions)
  }

  public fun xAxisLabelOptions(xAxisLabelOptions: CfnTemplate.ChartAxisLabelOptionsProperty) {
    cdkBuilder.xAxisLabelOptions(xAxisLabelOptions)
  }

  public fun yAxisDisplayOptions(yAxisDisplayOptions: IResolvable) {
    cdkBuilder.yAxisDisplayOptions(yAxisDisplayOptions)
  }

  public fun yAxisDisplayOptions(yAxisDisplayOptions: CfnTemplate.AxisDisplayOptionsProperty) {
    cdkBuilder.yAxisDisplayOptions(yAxisDisplayOptions)
  }

  public fun yAxisLabelOptions(yAxisLabelOptions: IResolvable) {
    cdkBuilder.yAxisLabelOptions(yAxisLabelOptions)
  }

  public fun yAxisLabelOptions(yAxisLabelOptions: CfnTemplate.ChartAxisLabelOptionsProperty) {
    cdkBuilder.yAxisLabelOptions(yAxisLabelOptions)
  }

  public fun build(): CfnTemplate.ScatterPlotConfigurationProperty = cdkBuilder.build()
}
