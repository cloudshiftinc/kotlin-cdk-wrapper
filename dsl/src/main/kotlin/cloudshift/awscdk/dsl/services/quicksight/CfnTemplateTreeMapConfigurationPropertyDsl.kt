@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplateTreeMapConfigurationPropertyDsl {
  private val cdkBuilder: CfnTemplate.TreeMapConfigurationProperty.Builder =
      CfnTemplate.TreeMapConfigurationProperty.builder()

  public fun colorLabelOptions(colorLabelOptions: IResolvable) {
    cdkBuilder.colorLabelOptions(colorLabelOptions)
  }

  public fun colorLabelOptions(colorLabelOptions: CfnTemplate.ChartAxisLabelOptionsProperty) {
    cdkBuilder.colorLabelOptions(colorLabelOptions)
  }

  public fun colorScale(colorScale: IResolvable) {
    cdkBuilder.colorScale(colorScale)
  }

  public fun colorScale(colorScale: CfnTemplate.ColorScaleProperty) {
    cdkBuilder.colorScale(colorScale)
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

  public fun fieldWells(fieldWells: CfnTemplate.TreeMapFieldWellsProperty) {
    cdkBuilder.fieldWells(fieldWells)
  }

  public fun groupLabelOptions(groupLabelOptions: IResolvable) {
    cdkBuilder.groupLabelOptions(groupLabelOptions)
  }

  public fun groupLabelOptions(groupLabelOptions: CfnTemplate.ChartAxisLabelOptionsProperty) {
    cdkBuilder.groupLabelOptions(groupLabelOptions)
  }

  public fun legend(legend: IResolvable) {
    cdkBuilder.legend(legend)
  }

  public fun legend(legend: CfnTemplate.LegendOptionsProperty) {
    cdkBuilder.legend(legend)
  }

  public fun sizeLabelOptions(sizeLabelOptions: IResolvable) {
    cdkBuilder.sizeLabelOptions(sizeLabelOptions)
  }

  public fun sizeLabelOptions(sizeLabelOptions: CfnTemplate.ChartAxisLabelOptionsProperty) {
    cdkBuilder.sizeLabelOptions(sizeLabelOptions)
  }

  public fun sortConfiguration(sortConfiguration: IResolvable) {
    cdkBuilder.sortConfiguration(sortConfiguration)
  }

  public fun sortConfiguration(sortConfiguration: CfnTemplate.TreeMapSortConfigurationProperty) {
    cdkBuilder.sortConfiguration(sortConfiguration)
  }

  public fun tooltip(tooltip: IResolvable) {
    cdkBuilder.tooltip(tooltip)
  }

  public fun tooltip(tooltip: CfnTemplate.TooltipOptionsProperty) {
    cdkBuilder.tooltip(tooltip)
  }

  public fun build(): CfnTemplate.TreeMapConfigurationProperty = cdkBuilder.build()
}
