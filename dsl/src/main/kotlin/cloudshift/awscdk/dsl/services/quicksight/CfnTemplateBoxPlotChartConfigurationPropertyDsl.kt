@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplateBoxPlotChartConfigurationPropertyDsl {
  private val cdkBuilder: CfnTemplate.BoxPlotChartConfigurationProperty.Builder =
      CfnTemplate.BoxPlotChartConfigurationProperty.builder()

  private val _referenceLines: MutableList<Any> = mutableListOf()

  public fun boxPlotOptions(boxPlotOptions: IResolvable) {
    cdkBuilder.boxPlotOptions(boxPlotOptions)
  }

  public fun boxPlotOptions(boxPlotOptions: CfnTemplate.BoxPlotOptionsProperty) {
    cdkBuilder.boxPlotOptions(boxPlotOptions)
  }

  public fun categoryAxis(categoryAxis: IResolvable) {
    cdkBuilder.categoryAxis(categoryAxis)
  }

  public fun categoryAxis(categoryAxis: CfnTemplate.AxisDisplayOptionsProperty) {
    cdkBuilder.categoryAxis(categoryAxis)
  }

  public fun categoryLabelOptions(categoryLabelOptions: IResolvable) {
    cdkBuilder.categoryLabelOptions(categoryLabelOptions)
  }

  public fun categoryLabelOptions(categoryLabelOptions: CfnTemplate.ChartAxisLabelOptionsProperty) {
    cdkBuilder.categoryLabelOptions(categoryLabelOptions)
  }

  public fun fieldWells(fieldWells: IResolvable) {
    cdkBuilder.fieldWells(fieldWells)
  }

  public fun fieldWells(fieldWells: CfnTemplate.BoxPlotFieldWellsProperty) {
    cdkBuilder.fieldWells(fieldWells)
  }

  public fun legend(legend: IResolvable) {
    cdkBuilder.legend(legend)
  }

  public fun legend(legend: CfnTemplate.LegendOptionsProperty) {
    cdkBuilder.legend(legend)
  }

  public fun primaryYAxisDisplayOptions(primaryYAxisDisplayOptions: IResolvable) {
    cdkBuilder.primaryYAxisDisplayOptions(primaryYAxisDisplayOptions)
  }

  public
      fun primaryYAxisDisplayOptions(primaryYAxisDisplayOptions: CfnTemplate.AxisDisplayOptionsProperty) {
    cdkBuilder.primaryYAxisDisplayOptions(primaryYAxisDisplayOptions)
  }

  public fun primaryYAxisLabelOptions(primaryYAxisLabelOptions: IResolvable) {
    cdkBuilder.primaryYAxisLabelOptions(primaryYAxisLabelOptions)
  }

  public
      fun primaryYAxisLabelOptions(primaryYAxisLabelOptions: CfnTemplate.ChartAxisLabelOptionsProperty) {
    cdkBuilder.primaryYAxisLabelOptions(primaryYAxisLabelOptions)
  }

  public fun referenceLines(vararg referenceLines: Any) {
    _referenceLines.addAll(listOf(*referenceLines))
  }

  public fun referenceLines(referenceLines: Collection<Any>) {
    _referenceLines.addAll(referenceLines)
  }

  public fun referenceLines(referenceLines: IResolvable) {
    cdkBuilder.referenceLines(referenceLines)
  }

  public fun sortConfiguration(sortConfiguration: IResolvable) {
    cdkBuilder.sortConfiguration(sortConfiguration)
  }

  public fun sortConfiguration(sortConfiguration: CfnTemplate.BoxPlotSortConfigurationProperty) {
    cdkBuilder.sortConfiguration(sortConfiguration)
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

  public fun build(): CfnTemplate.BoxPlotChartConfigurationProperty {
    if(_referenceLines.isNotEmpty()) cdkBuilder.referenceLines(_referenceLines)
    return cdkBuilder.build()
  }
}
