@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate

/**
 * The configuration of a `BarChartVisual` .
 *
 * Example:
 *
 * ```
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-template-barchartconfiguration.html)
 */
@CdkDslMarker
public class CfnTemplateBarChartConfigurationPropertyDsl {
  private val cdkBuilder: CfnTemplate.BarChartConfigurationProperty.Builder =
      CfnTemplate.BarChartConfigurationProperty.builder()

  private val _contributionAnalysisDefaults: MutableList<Any> = mutableListOf()

  private val _referenceLines: MutableList<Any> = mutableListOf()

  /**
   * @param barsArrangement Determines the arrangement of the bars.
   * The orientation and arrangement of bars determine the type of bar that is used in the visual.
   */
  public fun barsArrangement(barsArrangement: String) {
    cdkBuilder.barsArrangement(barsArrangement)
  }

  /**
   * @param categoryAxis The label display options (grid line, range, scale, axis step) for bar
   * chart category.
   */
  public fun categoryAxis(categoryAxis: IResolvable) {
    cdkBuilder.categoryAxis(categoryAxis)
  }

  /**
   * @param categoryAxis The label display options (grid line, range, scale, axis step) for bar
   * chart category.
   */
  public fun categoryAxis(categoryAxis: CfnTemplate.AxisDisplayOptionsProperty) {
    cdkBuilder.categoryAxis(categoryAxis)
  }

  /**
   * @param categoryLabelOptions The label options (label text, label visibility and sort icon
   * visibility) for a bar chart.
   */
  public fun categoryLabelOptions(categoryLabelOptions: IResolvable) {
    cdkBuilder.categoryLabelOptions(categoryLabelOptions)
  }

  /**
   * @param categoryLabelOptions The label options (label text, label visibility and sort icon
   * visibility) for a bar chart.
   */
  public fun categoryLabelOptions(categoryLabelOptions: CfnTemplate.ChartAxisLabelOptionsProperty) {
    cdkBuilder.categoryLabelOptions(categoryLabelOptions)
  }

  /**
   * @param colorLabelOptions The label options (label text, label visibility and sort icon
   * visibility) for a color that is used in a bar chart.
   */
  public fun colorLabelOptions(colorLabelOptions: IResolvable) {
    cdkBuilder.colorLabelOptions(colorLabelOptions)
  }

  /**
   * @param colorLabelOptions The label options (label text, label visibility and sort icon
   * visibility) for a color that is used in a bar chart.
   */
  public fun colorLabelOptions(colorLabelOptions: CfnTemplate.ChartAxisLabelOptionsProperty) {
    cdkBuilder.colorLabelOptions(colorLabelOptions)
  }

  /**
   * @param contributionAnalysisDefaults The contribution analysis (anomaly configuration) setup of
   * the visual.
   */
  public fun contributionAnalysisDefaults(vararg contributionAnalysisDefaults: Any) {
    _contributionAnalysisDefaults.addAll(listOf(*contributionAnalysisDefaults))
  }

  /**
   * @param contributionAnalysisDefaults The contribution analysis (anomaly configuration) setup of
   * the visual.
   */
  public fun contributionAnalysisDefaults(contributionAnalysisDefaults: Collection<Any>) {
    _contributionAnalysisDefaults.addAll(contributionAnalysisDefaults)
  }

  /**
   * @param contributionAnalysisDefaults The contribution analysis (anomaly configuration) setup of
   * the visual.
   */
  public fun contributionAnalysisDefaults(contributionAnalysisDefaults: IResolvable) {
    cdkBuilder.contributionAnalysisDefaults(contributionAnalysisDefaults)
  }

  /**
   * @param dataLabels The options that determine if visual data labels are displayed.
   */
  public fun dataLabels(dataLabels: IResolvable) {
    cdkBuilder.dataLabels(dataLabels)
  }

  /**
   * @param dataLabels The options that determine if visual data labels are displayed.
   */
  public fun dataLabels(dataLabels: CfnTemplate.DataLabelOptionsProperty) {
    cdkBuilder.dataLabels(dataLabels)
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
  public fun fieldWells(fieldWells: CfnTemplate.BarChartFieldWellsProperty) {
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
  public fun legend(legend: CfnTemplate.LegendOptionsProperty) {
    cdkBuilder.legend(legend)
  }

  /**
   * @param orientation The orientation of the bars in a bar chart visual. There are two valid
   * values in this structure:.
   * * `HORIZONTAL` : Used for charts that have horizontal bars. Visuals that use this value are
   * horizontal bar charts, horizontal stacked bar charts, and horizontal stacked 100% bar charts.
   * * `VERTICAL` : Used for charts that have vertical bars. Visuals that use this value are
   * vertical bar charts, vertical stacked bar charts, and vertical stacked 100% bar charts.
   */
  public fun orientation(orientation: String) {
    cdkBuilder.orientation(orientation)
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
   * @param smallMultiplesOptions The small multiples setup for the visual.
   */
  public fun smallMultiplesOptions(smallMultiplesOptions: IResolvable) {
    cdkBuilder.smallMultiplesOptions(smallMultiplesOptions)
  }

  /**
   * @param smallMultiplesOptions The small multiples setup for the visual.
   */
  public
      fun smallMultiplesOptions(smallMultiplesOptions: CfnTemplate.SmallMultiplesOptionsProperty) {
    cdkBuilder.smallMultiplesOptions(smallMultiplesOptions)
  }

  /**
   * @param sortConfiguration The sort configuration of a `BarChartVisual` .
   */
  public fun sortConfiguration(sortConfiguration: IResolvable) {
    cdkBuilder.sortConfiguration(sortConfiguration)
  }

  /**
   * @param sortConfiguration The sort configuration of a `BarChartVisual` .
   */
  public fun sortConfiguration(sortConfiguration: CfnTemplate.BarChartSortConfigurationProperty) {
    cdkBuilder.sortConfiguration(sortConfiguration)
  }

  /**
   * @param tooltip The tooltip display setup of the visual.
   */
  public fun tooltip(tooltip: IResolvable) {
    cdkBuilder.tooltip(tooltip)
  }

  /**
   * @param tooltip The tooltip display setup of the visual.
   */
  public fun tooltip(tooltip: CfnTemplate.TooltipOptionsProperty) {
    cdkBuilder.tooltip(tooltip)
  }

  /**
   * @param valueAxis The label display options (grid line, range, scale, axis step) for a bar chart
   * value.
   */
  public fun valueAxis(valueAxis: IResolvable) {
    cdkBuilder.valueAxis(valueAxis)
  }

  /**
   * @param valueAxis The label display options (grid line, range, scale, axis step) for a bar chart
   * value.
   */
  public fun valueAxis(valueAxis: CfnTemplate.AxisDisplayOptionsProperty) {
    cdkBuilder.valueAxis(valueAxis)
  }

  /**
   * @param valueLabelOptions The label options (label text, label visibility and sort icon
   * visibility) for a bar chart value.
   */
  public fun valueLabelOptions(valueLabelOptions: IResolvable) {
    cdkBuilder.valueLabelOptions(valueLabelOptions)
  }

  /**
   * @param valueLabelOptions The label options (label text, label visibility and sort icon
   * visibility) for a bar chart value.
   */
  public fun valueLabelOptions(valueLabelOptions: CfnTemplate.ChartAxisLabelOptionsProperty) {
    cdkBuilder.valueLabelOptions(valueLabelOptions)
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
  public fun visualPalette(visualPalette: CfnTemplate.VisualPaletteProperty) {
    cdkBuilder.visualPalette(visualPalette)
  }

  public fun build(): CfnTemplate.BarChartConfigurationProperty {
    if(_contributionAnalysisDefaults.isNotEmpty())
        cdkBuilder.contributionAnalysisDefaults(_contributionAnalysisDefaults)
    if(_referenceLines.isNotEmpty()) cdkBuilder.referenceLines(_referenceLines)
    return cdkBuilder.build()
  }
}
