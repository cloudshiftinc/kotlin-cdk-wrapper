@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnAnalysis

@CdkDslMarker
public class CfnAnalysisWaterfallChartConfigurationPropertyDsl {
  private val cdkBuilder: CfnAnalysis.WaterfallChartConfigurationProperty.Builder =
      CfnAnalysis.WaterfallChartConfigurationProperty.builder()

  public fun categoryAxisDisplayOptions(categoryAxisDisplayOptions: IResolvable) {
    cdkBuilder.categoryAxisDisplayOptions(categoryAxisDisplayOptions)
  }

  public
      fun categoryAxisDisplayOptions(categoryAxisDisplayOptions: CfnAnalysis.AxisDisplayOptionsProperty) {
    cdkBuilder.categoryAxisDisplayOptions(categoryAxisDisplayOptions)
  }

  public fun categoryAxisLabelOptions(categoryAxisLabelOptions: IResolvable) {
    cdkBuilder.categoryAxisLabelOptions(categoryAxisLabelOptions)
  }

  public
      fun categoryAxisLabelOptions(categoryAxisLabelOptions: CfnAnalysis.ChartAxisLabelOptionsProperty) {
    cdkBuilder.categoryAxisLabelOptions(categoryAxisLabelOptions)
  }

  public fun dataLabels(dataLabels: IResolvable) {
    cdkBuilder.dataLabels(dataLabels)
  }

  public fun dataLabels(dataLabels: CfnAnalysis.DataLabelOptionsProperty) {
    cdkBuilder.dataLabels(dataLabels)
  }

  public fun fieldWells(fieldWells: IResolvable) {
    cdkBuilder.fieldWells(fieldWells)
  }

  public fun fieldWells(fieldWells: CfnAnalysis.WaterfallChartFieldWellsProperty) {
    cdkBuilder.fieldWells(fieldWells)
  }

  public fun legend(legend: IResolvable) {
    cdkBuilder.legend(legend)
  }

  public fun legend(legend: CfnAnalysis.LegendOptionsProperty) {
    cdkBuilder.legend(legend)
  }

  public fun primaryYAxisDisplayOptions(primaryYAxisDisplayOptions: IResolvable) {
    cdkBuilder.primaryYAxisDisplayOptions(primaryYAxisDisplayOptions)
  }

  public
      fun primaryYAxisDisplayOptions(primaryYAxisDisplayOptions: CfnAnalysis.AxisDisplayOptionsProperty) {
    cdkBuilder.primaryYAxisDisplayOptions(primaryYAxisDisplayOptions)
  }

  public fun primaryYAxisLabelOptions(primaryYAxisLabelOptions: IResolvable) {
    cdkBuilder.primaryYAxisLabelOptions(primaryYAxisLabelOptions)
  }

  public
      fun primaryYAxisLabelOptions(primaryYAxisLabelOptions: CfnAnalysis.ChartAxisLabelOptionsProperty) {
    cdkBuilder.primaryYAxisLabelOptions(primaryYAxisLabelOptions)
  }

  public fun sortConfiguration(sortConfiguration: IResolvable) {
    cdkBuilder.sortConfiguration(sortConfiguration)
  }

  public
      fun sortConfiguration(sortConfiguration: CfnAnalysis.WaterfallChartSortConfigurationProperty) {
    cdkBuilder.sortConfiguration(sortConfiguration)
  }

  public fun visualPalette(visualPalette: IResolvable) {
    cdkBuilder.visualPalette(visualPalette)
  }

  public fun visualPalette(visualPalette: CfnAnalysis.VisualPaletteProperty) {
    cdkBuilder.visualPalette(visualPalette)
  }

  public fun waterfallChartOptions(waterfallChartOptions: IResolvable) {
    cdkBuilder.waterfallChartOptions(waterfallChartOptions)
  }

  public
      fun waterfallChartOptions(waterfallChartOptions: CfnAnalysis.WaterfallChartOptionsProperty) {
    cdkBuilder.waterfallChartOptions(waterfallChartOptions)
  }

  public fun build(): CfnAnalysis.WaterfallChartConfigurationProperty = cdkBuilder.build()
}
