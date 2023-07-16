@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnAnalysis

@CdkDslMarker
public class CfnAnalysisTreeMapConfigurationPropertyDsl {
  private val cdkBuilder: CfnAnalysis.TreeMapConfigurationProperty.Builder =
      CfnAnalysis.TreeMapConfigurationProperty.builder()

  public fun colorLabelOptions(colorLabelOptions: IResolvable) {
    cdkBuilder.colorLabelOptions(colorLabelOptions)
  }

  public fun colorLabelOptions(colorLabelOptions: CfnAnalysis.ChartAxisLabelOptionsProperty) {
    cdkBuilder.colorLabelOptions(colorLabelOptions)
  }

  public fun colorScale(colorScale: IResolvable) {
    cdkBuilder.colorScale(colorScale)
  }

  public fun colorScale(colorScale: CfnAnalysis.ColorScaleProperty) {
    cdkBuilder.colorScale(colorScale)
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

  public fun fieldWells(fieldWells: CfnAnalysis.TreeMapFieldWellsProperty) {
    cdkBuilder.fieldWells(fieldWells)
  }

  public fun groupLabelOptions(groupLabelOptions: IResolvable) {
    cdkBuilder.groupLabelOptions(groupLabelOptions)
  }

  public fun groupLabelOptions(groupLabelOptions: CfnAnalysis.ChartAxisLabelOptionsProperty) {
    cdkBuilder.groupLabelOptions(groupLabelOptions)
  }

  public fun legend(legend: IResolvable) {
    cdkBuilder.legend(legend)
  }

  public fun legend(legend: CfnAnalysis.LegendOptionsProperty) {
    cdkBuilder.legend(legend)
  }

  public fun sizeLabelOptions(sizeLabelOptions: IResolvable) {
    cdkBuilder.sizeLabelOptions(sizeLabelOptions)
  }

  public fun sizeLabelOptions(sizeLabelOptions: CfnAnalysis.ChartAxisLabelOptionsProperty) {
    cdkBuilder.sizeLabelOptions(sizeLabelOptions)
  }

  public fun sortConfiguration(sortConfiguration: IResolvable) {
    cdkBuilder.sortConfiguration(sortConfiguration)
  }

  public fun sortConfiguration(sortConfiguration: CfnAnalysis.TreeMapSortConfigurationProperty) {
    cdkBuilder.sortConfiguration(sortConfiguration)
  }

  public fun tooltip(tooltip: IResolvable) {
    cdkBuilder.tooltip(tooltip)
  }

  public fun tooltip(tooltip: CfnAnalysis.TooltipOptionsProperty) {
    cdkBuilder.tooltip(tooltip)
  }

  public fun build(): CfnAnalysis.TreeMapConfigurationProperty = cdkBuilder.build()
}
