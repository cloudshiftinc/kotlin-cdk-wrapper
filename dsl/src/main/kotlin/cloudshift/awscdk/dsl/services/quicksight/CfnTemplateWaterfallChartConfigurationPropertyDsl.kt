@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplateWaterfallChartConfigurationPropertyDsl {
  private val cdkBuilder: CfnTemplate.WaterfallChartConfigurationProperty.Builder =
      CfnTemplate.WaterfallChartConfigurationProperty.builder()

  /**
   * @param categoryAxisDisplayOptions The options that determine the presentation of the category
   * axis.
   */
  public fun categoryAxisDisplayOptions(categoryAxisDisplayOptions: IResolvable) {
    cdkBuilder.categoryAxisDisplayOptions(categoryAxisDisplayOptions)
  }

  /**
   * @param categoryAxisDisplayOptions The options that determine the presentation of the category
   * axis.
   */
  public
      fun categoryAxisDisplayOptions(categoryAxisDisplayOptions: CfnTemplate.AxisDisplayOptionsProperty) {
    cdkBuilder.categoryAxisDisplayOptions(categoryAxisDisplayOptions)
  }

  /**
   * @param categoryAxisLabelOptions The options that determine the presentation of the category
   * axis label.
   */
  public fun categoryAxisLabelOptions(categoryAxisLabelOptions: IResolvable) {
    cdkBuilder.categoryAxisLabelOptions(categoryAxisLabelOptions)
  }

  /**
   * @param categoryAxisLabelOptions The options that determine the presentation of the category
   * axis label.
   */
  public
      fun categoryAxisLabelOptions(categoryAxisLabelOptions: CfnTemplate.ChartAxisLabelOptionsProperty) {
    cdkBuilder.categoryAxisLabelOptions(categoryAxisLabelOptions)
  }

  /**
   * @param dataLabels The data label configuration of a waterfall visual.
   */
  public fun dataLabels(dataLabels: IResolvable) {
    cdkBuilder.dataLabels(dataLabels)
  }

  /**
   * @param dataLabels The data label configuration of a waterfall visual.
   */
  public fun dataLabels(dataLabels: CfnTemplate.DataLabelOptionsProperty) {
    cdkBuilder.dataLabels(dataLabels)
  }

  /**
   * @param fieldWells The field well configuration of a waterfall visual.
   */
  public fun fieldWells(fieldWells: IResolvable) {
    cdkBuilder.fieldWells(fieldWells)
  }

  /**
   * @param fieldWells The field well configuration of a waterfall visual.
   */
  public fun fieldWells(fieldWells: CfnTemplate.WaterfallChartFieldWellsProperty) {
    cdkBuilder.fieldWells(fieldWells)
  }

  /**
   * @param legend The legend configuration of a waterfall visual.
   */
  public fun legend(legend: IResolvable) {
    cdkBuilder.legend(legend)
  }

  /**
   * @param legend The legend configuration of a waterfall visual.
   */
  public fun legend(legend: CfnTemplate.LegendOptionsProperty) {
    cdkBuilder.legend(legend)
  }

  /**
   * @param primaryYAxisDisplayOptions The options that determine the presentation of the y-axis.
   */
  public fun primaryYAxisDisplayOptions(primaryYAxisDisplayOptions: IResolvable) {
    cdkBuilder.primaryYAxisDisplayOptions(primaryYAxisDisplayOptions)
  }

  /**
   * @param primaryYAxisDisplayOptions The options that determine the presentation of the y-axis.
   */
  public
      fun primaryYAxisDisplayOptions(primaryYAxisDisplayOptions: CfnTemplate.AxisDisplayOptionsProperty) {
    cdkBuilder.primaryYAxisDisplayOptions(primaryYAxisDisplayOptions)
  }

  /**
   * @param primaryYAxisLabelOptions The options that determine the presentation of the y-axis
   * label.
   */
  public fun primaryYAxisLabelOptions(primaryYAxisLabelOptions: IResolvable) {
    cdkBuilder.primaryYAxisLabelOptions(primaryYAxisLabelOptions)
  }

  /**
   * @param primaryYAxisLabelOptions The options that determine the presentation of the y-axis
   * label.
   */
  public
      fun primaryYAxisLabelOptions(primaryYAxisLabelOptions: CfnTemplate.ChartAxisLabelOptionsProperty) {
    cdkBuilder.primaryYAxisLabelOptions(primaryYAxisLabelOptions)
  }

  /**
   * @param sortConfiguration The sort configuration of a waterfall visual.
   */
  public fun sortConfiguration(sortConfiguration: IResolvable) {
    cdkBuilder.sortConfiguration(sortConfiguration)
  }

  /**
   * @param sortConfiguration The sort configuration of a waterfall visual.
   */
  public
      fun sortConfiguration(sortConfiguration: CfnTemplate.WaterfallChartSortConfigurationProperty) {
    cdkBuilder.sortConfiguration(sortConfiguration)
  }

  /**
   * @param visualPalette The visual palette configuration of a waterfall visual.
   */
  public fun visualPalette(visualPalette: IResolvable) {
    cdkBuilder.visualPalette(visualPalette)
  }

  /**
   * @param visualPalette The visual palette configuration of a waterfall visual.
   */
  public fun visualPalette(visualPalette: CfnTemplate.VisualPaletteProperty) {
    cdkBuilder.visualPalette(visualPalette)
  }

  /**
   * @param waterfallChartOptions The options that determine the presentation of a waterfall visual.
   */
  public fun waterfallChartOptions(waterfallChartOptions: IResolvable) {
    cdkBuilder.waterfallChartOptions(waterfallChartOptions)
  }

  /**
   * @param waterfallChartOptions The options that determine the presentation of a waterfall visual.
   */
  public
      fun waterfallChartOptions(waterfallChartOptions: CfnTemplate.WaterfallChartOptionsProperty) {
    cdkBuilder.waterfallChartOptions(waterfallChartOptions)
  }

  public fun build(): CfnTemplate.WaterfallChartConfigurationProperty = cdkBuilder.build()
}
