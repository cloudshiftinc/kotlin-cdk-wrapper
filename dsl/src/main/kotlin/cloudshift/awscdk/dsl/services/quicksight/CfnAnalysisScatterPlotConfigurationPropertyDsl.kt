@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnAnalysis

@CdkDslMarker
public class CfnAnalysisScatterPlotConfigurationPropertyDsl {
  private val cdkBuilder: CfnAnalysis.ScatterPlotConfigurationProperty.Builder =
      CfnAnalysis.ScatterPlotConfigurationProperty.builder()

  public fun dataLabels(dataLabels: IResolvable) {
    cdkBuilder.dataLabels(dataLabels)
  }

  public fun dataLabels(dataLabels: CfnAnalysis.DataLabelOptionsProperty) {
    cdkBuilder.dataLabels(dataLabels)
  }

  public fun fieldWells(fieldWells: IResolvable) {
    cdkBuilder.fieldWells(fieldWells)
  }

  public fun fieldWells(fieldWells: CfnAnalysis.ScatterPlotFieldWellsProperty) {
    cdkBuilder.fieldWells(fieldWells)
  }

  public fun legend(legend: IResolvable) {
    cdkBuilder.legend(legend)
  }

  public fun legend(legend: CfnAnalysis.LegendOptionsProperty) {
    cdkBuilder.legend(legend)
  }

  public fun tooltip(tooltip: IResolvable) {
    cdkBuilder.tooltip(tooltip)
  }

  public fun tooltip(tooltip: CfnAnalysis.TooltipOptionsProperty) {
    cdkBuilder.tooltip(tooltip)
  }

  public fun visualPalette(visualPalette: IResolvable) {
    cdkBuilder.visualPalette(visualPalette)
  }

  public fun visualPalette(visualPalette: CfnAnalysis.VisualPaletteProperty) {
    cdkBuilder.visualPalette(visualPalette)
  }

  public fun xAxisDisplayOptions(xAxisDisplayOptions: IResolvable) {
    cdkBuilder.xAxisDisplayOptions(xAxisDisplayOptions)
  }

  public fun xAxisDisplayOptions(xAxisDisplayOptions: CfnAnalysis.AxisDisplayOptionsProperty) {
    cdkBuilder.xAxisDisplayOptions(xAxisDisplayOptions)
  }

  public fun xAxisLabelOptions(xAxisLabelOptions: IResolvable) {
    cdkBuilder.xAxisLabelOptions(xAxisLabelOptions)
  }

  public fun xAxisLabelOptions(xAxisLabelOptions: CfnAnalysis.ChartAxisLabelOptionsProperty) {
    cdkBuilder.xAxisLabelOptions(xAxisLabelOptions)
  }

  public fun yAxisDisplayOptions(yAxisDisplayOptions: IResolvable) {
    cdkBuilder.yAxisDisplayOptions(yAxisDisplayOptions)
  }

  public fun yAxisDisplayOptions(yAxisDisplayOptions: CfnAnalysis.AxisDisplayOptionsProperty) {
    cdkBuilder.yAxisDisplayOptions(yAxisDisplayOptions)
  }

  public fun yAxisLabelOptions(yAxisLabelOptions: IResolvable) {
    cdkBuilder.yAxisLabelOptions(yAxisLabelOptions)
  }

  public fun yAxisLabelOptions(yAxisLabelOptions: CfnAnalysis.ChartAxisLabelOptionsProperty) {
    cdkBuilder.yAxisLabelOptions(yAxisLabelOptions)
  }

  public fun build(): CfnAnalysis.ScatterPlotConfigurationProperty = cdkBuilder.build()
}
