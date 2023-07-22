@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardComboChartConfigurationPropertyDsl {
  private val cdkBuilder: CfnDashboard.ComboChartConfigurationProperty.Builder =
      CfnDashboard.ComboChartConfigurationProperty.builder()

  private val _referenceLines: MutableList<Any> = mutableListOf()

  /**
   * @param barDataLabels The options that determine if visual data labels are displayed.
   * The data label options for a bar in a combo chart.
   */
  public fun barDataLabels(barDataLabels: IResolvable) {
    cdkBuilder.barDataLabels(barDataLabels)
  }

  /**
   * @param barDataLabels The options that determine if visual data labels are displayed.
   * The data label options for a bar in a combo chart.
   */
  public fun barDataLabels(barDataLabels: CfnDashboard.DataLabelOptionsProperty) {
    cdkBuilder.barDataLabels(barDataLabels)
  }

  /**
   * @param barsArrangement Determines the bar arrangement in a combo chart. The following are valid
   * values in this structure:.
   * * `CLUSTERED` : For clustered bar combo charts.
   * * `STACKED` : For stacked bar combo charts.
   * * `STACKED_PERCENT` : Do not use. If you use this value, the operation returns a validation
   * error.
   */
  public fun barsArrangement(barsArrangement: String) {
    cdkBuilder.barsArrangement(barsArrangement)
  }

  /**
   * @param categoryAxis The category axis of a combo chart.
   */
  public fun categoryAxis(categoryAxis: IResolvable) {
    cdkBuilder.categoryAxis(categoryAxis)
  }

  /**
   * @param categoryAxis The category axis of a combo chart.
   */
  public fun categoryAxis(categoryAxis: CfnDashboard.AxisDisplayOptionsProperty) {
    cdkBuilder.categoryAxis(categoryAxis)
  }

  /**
   * @param categoryLabelOptions The label options (label text, label visibility, and sort icon
   * visibility) of a combo chart category (group/color) field well.
   */
  public fun categoryLabelOptions(categoryLabelOptions: IResolvable) {
    cdkBuilder.categoryLabelOptions(categoryLabelOptions)
  }

  /**
   * @param categoryLabelOptions The label options (label text, label visibility, and sort icon
   * visibility) of a combo chart category (group/color) field well.
   */
  public
      fun categoryLabelOptions(categoryLabelOptions: CfnDashboard.ChartAxisLabelOptionsProperty) {
    cdkBuilder.categoryLabelOptions(categoryLabelOptions)
  }

  /**
   * @param colorLabelOptions The label options (label text, label visibility, and sort icon
   * visibility) of a combo chart's color field well.
   */
  public fun colorLabelOptions(colorLabelOptions: IResolvable) {
    cdkBuilder.colorLabelOptions(colorLabelOptions)
  }

  /**
   * @param colorLabelOptions The label options (label text, label visibility, and sort icon
   * visibility) of a combo chart's color field well.
   */
  public fun colorLabelOptions(colorLabelOptions: CfnDashboard.ChartAxisLabelOptionsProperty) {
    cdkBuilder.colorLabelOptions(colorLabelOptions)
  }

  /**
   * @param fieldWells The field wells of the visual.
   */
  public fun fieldWells(fieldWells: IResolvable) {
    cdkBuilder.fieldWells(fieldWells)
  }

  /**
   * @param fieldWells The field wells of the visual.
   */
  public fun fieldWells(fieldWells: CfnDashboard.ComboChartFieldWellsProperty) {
    cdkBuilder.fieldWells(fieldWells)
  }

  /**
   * @param legend The legend display setup of the visual.
   */
  public fun legend(legend: IResolvable) {
    cdkBuilder.legend(legend)
  }

  /**
   * @param legend The legend display setup of the visual.
   */
  public fun legend(legend: CfnDashboard.LegendOptionsProperty) {
    cdkBuilder.legend(legend)
  }

  /**
   * @param lineDataLabels The options that determine if visual data labels are displayed.
   * The data label options for a line in a combo chart.
   */
  public fun lineDataLabels(lineDataLabels: IResolvable) {
    cdkBuilder.lineDataLabels(lineDataLabels)
  }

  /**
   * @param lineDataLabels The options that determine if visual data labels are displayed.
   * The data label options for a line in a combo chart.
   */
  public fun lineDataLabels(lineDataLabels: CfnDashboard.DataLabelOptionsProperty) {
    cdkBuilder.lineDataLabels(lineDataLabels)
  }

  /**
   * @param primaryYAxisDisplayOptions The label display options (grid line, range, scale, and axis
   * step) of a combo chart's primary y-axis (bar) field well.
   */
  public fun primaryYAxisDisplayOptions(primaryYAxisDisplayOptions: IResolvable) {
    cdkBuilder.primaryYAxisDisplayOptions(primaryYAxisDisplayOptions)
  }

  /**
   * @param primaryYAxisDisplayOptions The label display options (grid line, range, scale, and axis
   * step) of a combo chart's primary y-axis (bar) field well.
   */
  public
      fun primaryYAxisDisplayOptions(primaryYAxisDisplayOptions: CfnDashboard.AxisDisplayOptionsProperty) {
    cdkBuilder.primaryYAxisDisplayOptions(primaryYAxisDisplayOptions)
  }

  /**
   * @param primaryYAxisLabelOptions The label options (label text, label visibility, and sort icon
   * visibility) of a combo chart's primary y-axis (bar) field well.
   */
  public fun primaryYAxisLabelOptions(primaryYAxisLabelOptions: IResolvable) {
    cdkBuilder.primaryYAxisLabelOptions(primaryYAxisLabelOptions)
  }

  /**
   * @param primaryYAxisLabelOptions The label options (label text, label visibility, and sort icon
   * visibility) of a combo chart's primary y-axis (bar) field well.
   */
  public
      fun primaryYAxisLabelOptions(primaryYAxisLabelOptions: CfnDashboard.ChartAxisLabelOptionsProperty) {
    cdkBuilder.primaryYAxisLabelOptions(primaryYAxisLabelOptions)
  }

  /**
   * @param referenceLines The reference line setup of the visual.
   */
  public fun referenceLines(vararg referenceLines: Any) {
    _referenceLines.addAll(listOf(*referenceLines))
  }

  /**
   * @param referenceLines The reference line setup of the visual.
   */
  public fun referenceLines(referenceLines: Collection<Any>) {
    _referenceLines.addAll(referenceLines)
  }

  /**
   * @param referenceLines The reference line setup of the visual.
   */
  public fun referenceLines(referenceLines: IResolvable) {
    cdkBuilder.referenceLines(referenceLines)
  }

  /**
   * @param secondaryYAxisDisplayOptions The label display options (grid line, range, scale, axis
   * step) of a combo chart's secondary y-axis (line) field well.
   */
  public fun secondaryYAxisDisplayOptions(secondaryYAxisDisplayOptions: IResolvable) {
    cdkBuilder.secondaryYAxisDisplayOptions(secondaryYAxisDisplayOptions)
  }

  /**
   * @param secondaryYAxisDisplayOptions The label display options (grid line, range, scale, axis
   * step) of a combo chart's secondary y-axis (line) field well.
   */
  public
      fun secondaryYAxisDisplayOptions(secondaryYAxisDisplayOptions: CfnDashboard.AxisDisplayOptionsProperty) {
    cdkBuilder.secondaryYAxisDisplayOptions(secondaryYAxisDisplayOptions)
  }

  /**
   * @param secondaryYAxisLabelOptions The label options (label text, label visibility, and sort
   * icon visibility) of a combo chart's secondary y-axis(line) field well.
   */
  public fun secondaryYAxisLabelOptions(secondaryYAxisLabelOptions: IResolvable) {
    cdkBuilder.secondaryYAxisLabelOptions(secondaryYAxisLabelOptions)
  }

  /**
   * @param secondaryYAxisLabelOptions The label options (label text, label visibility, and sort
   * icon visibility) of a combo chart's secondary y-axis(line) field well.
   */
  public
      fun secondaryYAxisLabelOptions(secondaryYAxisLabelOptions: CfnDashboard.ChartAxisLabelOptionsProperty) {
    cdkBuilder.secondaryYAxisLabelOptions(secondaryYAxisLabelOptions)
  }

  /**
   * @param sortConfiguration The sort configuration of a `ComboChartVisual` .
   */
  public fun sortConfiguration(sortConfiguration: IResolvable) {
    cdkBuilder.sortConfiguration(sortConfiguration)
  }

  /**
   * @param sortConfiguration The sort configuration of a `ComboChartVisual` .
   */
  public
      fun sortConfiguration(sortConfiguration: CfnDashboard.ComboChartSortConfigurationProperty) {
    cdkBuilder.sortConfiguration(sortConfiguration)
  }

  /**
   * @param tooltip The legend display setup of the visual.
   */
  public fun tooltip(tooltip: IResolvable) {
    cdkBuilder.tooltip(tooltip)
  }

  /**
   * @param tooltip The legend display setup of the visual.
   */
  public fun tooltip(tooltip: CfnDashboard.TooltipOptionsProperty) {
    cdkBuilder.tooltip(tooltip)
  }

  /**
   * @param visualPalette The palette (chart color) display setup of the visual.
   */
  public fun visualPalette(visualPalette: IResolvable) {
    cdkBuilder.visualPalette(visualPalette)
  }

  /**
   * @param visualPalette The palette (chart color) display setup of the visual.
   */
  public fun visualPalette(visualPalette: CfnDashboard.VisualPaletteProperty) {
    cdkBuilder.visualPalette(visualPalette)
  }

  public fun build(): CfnDashboard.ComboChartConfigurationProperty {
    if(_referenceLines.isNotEmpty()) cdkBuilder.referenceLines(_referenceLines)
    return cdkBuilder.build()
  }
}
