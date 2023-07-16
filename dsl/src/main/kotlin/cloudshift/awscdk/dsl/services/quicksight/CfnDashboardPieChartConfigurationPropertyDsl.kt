@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardPieChartConfigurationPropertyDsl {
  private val cdkBuilder: CfnDashboard.PieChartConfigurationProperty.Builder =
      CfnDashboard.PieChartConfigurationProperty.builder()

  private val _contributionAnalysisDefaults: MutableList<Any> = mutableListOf()

  public fun categoryLabelOptions(categoryLabelOptions: IResolvable) {
    cdkBuilder.categoryLabelOptions(categoryLabelOptions)
  }

  public
      fun categoryLabelOptions(categoryLabelOptions: CfnDashboard.ChartAxisLabelOptionsProperty) {
    cdkBuilder.categoryLabelOptions(categoryLabelOptions)
  }

  public fun contributionAnalysisDefaults(vararg contributionAnalysisDefaults: Any) {
    _contributionAnalysisDefaults.addAll(listOf(*contributionAnalysisDefaults))
  }

  public fun contributionAnalysisDefaults(contributionAnalysisDefaults: Collection<Any>) {
    _contributionAnalysisDefaults.addAll(contributionAnalysisDefaults)
  }

  public fun contributionAnalysisDefaults(contributionAnalysisDefaults: IResolvable) {
    cdkBuilder.contributionAnalysisDefaults(contributionAnalysisDefaults)
  }

  public fun dataLabels(dataLabels: IResolvable) {
    cdkBuilder.dataLabels(dataLabels)
  }

  public fun dataLabels(dataLabels: CfnDashboard.DataLabelOptionsProperty) {
    cdkBuilder.dataLabels(dataLabels)
  }

  public fun donutOptions(donutOptions: IResolvable) {
    cdkBuilder.donutOptions(donutOptions)
  }

  public fun donutOptions(donutOptions: CfnDashboard.DonutOptionsProperty) {
    cdkBuilder.donutOptions(donutOptions)
  }

  public fun fieldWells(fieldWells: IResolvable) {
    cdkBuilder.fieldWells(fieldWells)
  }

  public fun fieldWells(fieldWells: CfnDashboard.PieChartFieldWellsProperty) {
    cdkBuilder.fieldWells(fieldWells)
  }

  public fun legend(legend: IResolvable) {
    cdkBuilder.legend(legend)
  }

  public fun legend(legend: CfnDashboard.LegendOptionsProperty) {
    cdkBuilder.legend(legend)
  }

  public fun smallMultiplesOptions(smallMultiplesOptions: IResolvable) {
    cdkBuilder.smallMultiplesOptions(smallMultiplesOptions)
  }

  public
      fun smallMultiplesOptions(smallMultiplesOptions: CfnDashboard.SmallMultiplesOptionsProperty) {
    cdkBuilder.smallMultiplesOptions(smallMultiplesOptions)
  }

  public fun sortConfiguration(sortConfiguration: IResolvable) {
    cdkBuilder.sortConfiguration(sortConfiguration)
  }

  public fun sortConfiguration(sortConfiguration: CfnDashboard.PieChartSortConfigurationProperty) {
    cdkBuilder.sortConfiguration(sortConfiguration)
  }

  public fun tooltip(tooltip: IResolvable) {
    cdkBuilder.tooltip(tooltip)
  }

  public fun tooltip(tooltip: CfnDashboard.TooltipOptionsProperty) {
    cdkBuilder.tooltip(tooltip)
  }

  public fun valueLabelOptions(valueLabelOptions: IResolvable) {
    cdkBuilder.valueLabelOptions(valueLabelOptions)
  }

  public fun valueLabelOptions(valueLabelOptions: CfnDashboard.ChartAxisLabelOptionsProperty) {
    cdkBuilder.valueLabelOptions(valueLabelOptions)
  }

  public fun visualPalette(visualPalette: IResolvable) {
    cdkBuilder.visualPalette(visualPalette)
  }

  public fun visualPalette(visualPalette: CfnDashboard.VisualPaletteProperty) {
    cdkBuilder.visualPalette(visualPalette)
  }

  public fun build(): CfnDashboard.PieChartConfigurationProperty {
    if(_contributionAnalysisDefaults.isNotEmpty())
        cdkBuilder.contributionAnalysisDefaults(_contributionAnalysisDefaults)
    return cdkBuilder.build()
  }
}
