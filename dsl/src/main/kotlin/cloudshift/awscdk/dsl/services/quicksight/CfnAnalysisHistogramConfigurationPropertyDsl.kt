@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnAnalysis

@CdkDslMarker
public class CfnAnalysisHistogramConfigurationPropertyDsl {
  private val cdkBuilder: CfnAnalysis.HistogramConfigurationProperty.Builder =
      CfnAnalysis.HistogramConfigurationProperty.builder()

  /**
   * @param binOptions The options that determine the presentation of histogram bins.
   */
  public fun binOptions(binOptions: IResolvable) {
    cdkBuilder.binOptions(binOptions)
  }

  /**
   * @param binOptions The options that determine the presentation of histogram bins.
   */
  public fun binOptions(binOptions: CfnAnalysis.HistogramBinOptionsProperty) {
    cdkBuilder.binOptions(binOptions)
  }

  /**
   * @param dataLabels The data label configuration of a histogram.
   */
  public fun dataLabels(dataLabels: IResolvable) {
    cdkBuilder.dataLabels(dataLabels)
  }

  /**
   * @param dataLabels The data label configuration of a histogram.
   */
  public fun dataLabels(dataLabels: CfnAnalysis.DataLabelOptionsProperty) {
    cdkBuilder.dataLabels(dataLabels)
  }

  /**
   * @param fieldWells The field well configuration of a histogram.
   */
  public fun fieldWells(fieldWells: IResolvable) {
    cdkBuilder.fieldWells(fieldWells)
  }

  /**
   * @param fieldWells The field well configuration of a histogram.
   */
  public fun fieldWells(fieldWells: CfnAnalysis.HistogramFieldWellsProperty) {
    cdkBuilder.fieldWells(fieldWells)
  }

  /**
   * @param tooltip The tooltip configuration of a histogram.
   */
  public fun tooltip(tooltip: IResolvable) {
    cdkBuilder.tooltip(tooltip)
  }

  /**
   * @param tooltip The tooltip configuration of a histogram.
   */
  public fun tooltip(tooltip: CfnAnalysis.TooltipOptionsProperty) {
    cdkBuilder.tooltip(tooltip)
  }

  /**
   * @param visualPalette The visual palette configuration of a histogram.
   */
  public fun visualPalette(visualPalette: IResolvable) {
    cdkBuilder.visualPalette(visualPalette)
  }

  /**
   * @param visualPalette The visual palette configuration of a histogram.
   */
  public fun visualPalette(visualPalette: CfnAnalysis.VisualPaletteProperty) {
    cdkBuilder.visualPalette(visualPalette)
  }

  /**
   * @param xAxisDisplayOptions The options that determine the presentation of the x-axis.
   */
  public fun xAxisDisplayOptions(xAxisDisplayOptions: IResolvable) {
    cdkBuilder.xAxisDisplayOptions(xAxisDisplayOptions)
  }

  /**
   * @param xAxisDisplayOptions The options that determine the presentation of the x-axis.
   */
  public fun xAxisDisplayOptions(xAxisDisplayOptions: CfnAnalysis.AxisDisplayOptionsProperty) {
    cdkBuilder.xAxisDisplayOptions(xAxisDisplayOptions)
  }

  /**
   * @param xAxisLabelOptions The options that determine the presentation of the x-axis label.
   */
  public fun xAxisLabelOptions(xAxisLabelOptions: IResolvable) {
    cdkBuilder.xAxisLabelOptions(xAxisLabelOptions)
  }

  /**
   * @param xAxisLabelOptions The options that determine the presentation of the x-axis label.
   */
  public fun xAxisLabelOptions(xAxisLabelOptions: CfnAnalysis.ChartAxisLabelOptionsProperty) {
    cdkBuilder.xAxisLabelOptions(xAxisLabelOptions)
  }

  /**
   * @param yAxisDisplayOptions The options that determine the presentation of the y-axis.
   */
  public fun yAxisDisplayOptions(yAxisDisplayOptions: IResolvable) {
    cdkBuilder.yAxisDisplayOptions(yAxisDisplayOptions)
  }

  /**
   * @param yAxisDisplayOptions The options that determine the presentation of the y-axis.
   */
  public fun yAxisDisplayOptions(yAxisDisplayOptions: CfnAnalysis.AxisDisplayOptionsProperty) {
    cdkBuilder.yAxisDisplayOptions(yAxisDisplayOptions)
  }

  public fun build(): CfnAnalysis.HistogramConfigurationProperty = cdkBuilder.build()
}
