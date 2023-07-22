@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

/**
 * The configuration of a pie chart.
 *
 * Example:
 *
 * ```
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dashboard-piechartconfiguration.html)
 */
@CdkDslMarker
public class CfnDashboardPieChartConfigurationPropertyDsl {
  private val cdkBuilder: CfnDashboard.PieChartConfigurationProperty.Builder =
      CfnDashboard.PieChartConfigurationProperty.builder()

  private val _contributionAnalysisDefaults: MutableList<Any> = mutableListOf()

  /**
   * @param categoryLabelOptions The label options of the group/color that is displayed in a pie
   * chart.
   */
  public fun categoryLabelOptions(categoryLabelOptions: IResolvable) {
    cdkBuilder.categoryLabelOptions(categoryLabelOptions)
  }

  /**
   * @param categoryLabelOptions The label options of the group/color that is displayed in a pie
   * chart.
   */
  public
      fun categoryLabelOptions(categoryLabelOptions: CfnDashboard.ChartAxisLabelOptionsProperty) {
    cdkBuilder.categoryLabelOptions(categoryLabelOptions)
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
  public fun dataLabels(dataLabels: CfnDashboard.DataLabelOptionsProperty) {
    cdkBuilder.dataLabels(dataLabels)
  }

  /**
   * @param donutOptions The options that determine the shape of the chart.
   * This option determines whether the chart is a pie chart or a donut chart.
   */
  public fun donutOptions(donutOptions: IResolvable) {
    cdkBuilder.donutOptions(donutOptions)
  }

  /**
   * @param donutOptions The options that determine the shape of the chart.
   * This option determines whether the chart is a pie chart or a donut chart.
   */
  public fun donutOptions(donutOptions: CfnDashboard.DonutOptionsProperty) {
    cdkBuilder.donutOptions(donutOptions)
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
  public fun fieldWells(fieldWells: CfnDashboard.PieChartFieldWellsProperty) {
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
   * @param smallMultiplesOptions The small multiples setup for the visual.
   */
  public fun smallMultiplesOptions(smallMultiplesOptions: IResolvable) {
    cdkBuilder.smallMultiplesOptions(smallMultiplesOptions)
  }

  /**
   * @param smallMultiplesOptions The small multiples setup for the visual.
   */
  public
      fun smallMultiplesOptions(smallMultiplesOptions: CfnDashboard.SmallMultiplesOptionsProperty) {
    cdkBuilder.smallMultiplesOptions(smallMultiplesOptions)
  }

  /**
   * @param sortConfiguration The sort configuration of a pie chart.
   */
  public fun sortConfiguration(sortConfiguration: IResolvable) {
    cdkBuilder.sortConfiguration(sortConfiguration)
  }

  /**
   * @param sortConfiguration The sort configuration of a pie chart.
   */
  public fun sortConfiguration(sortConfiguration: CfnDashboard.PieChartSortConfigurationProperty) {
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
  public fun tooltip(tooltip: CfnDashboard.TooltipOptionsProperty) {
    cdkBuilder.tooltip(tooltip)
  }

  /**
   * @param valueLabelOptions The label options for the value that is displayed in a pie chart.
   */
  public fun valueLabelOptions(valueLabelOptions: IResolvable) {
    cdkBuilder.valueLabelOptions(valueLabelOptions)
  }

  /**
   * @param valueLabelOptions The label options for the value that is displayed in a pie chart.
   */
  public fun valueLabelOptions(valueLabelOptions: CfnDashboard.ChartAxisLabelOptionsProperty) {
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
  public fun visualPalette(visualPalette: CfnDashboard.VisualPaletteProperty) {
    cdkBuilder.visualPalette(visualPalette)
  }

  public fun build(): CfnDashboard.PieChartConfigurationProperty {
    if(_contributionAnalysisDefaults.isNotEmpty())
        cdkBuilder.contributionAnalysisDefaults(_contributionAnalysisDefaults)
    return cdkBuilder.build()
  }
}
