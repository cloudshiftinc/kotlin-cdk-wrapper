@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardGaugeChartConfigurationPropertyDsl {
  private val cdkBuilder: CfnDashboard.GaugeChartConfigurationProperty.Builder =
      CfnDashboard.GaugeChartConfigurationProperty.builder()

  /**
   * @param dataLabels The data label configuration of a `GaugeChartVisual` .
   */
  public fun dataLabels(dataLabels: IResolvable) {
    cdkBuilder.dataLabels(dataLabels)
  }

  /**
   * @param dataLabels The data label configuration of a `GaugeChartVisual` .
   */
  public fun dataLabels(dataLabels: CfnDashboard.DataLabelOptionsProperty) {
    cdkBuilder.dataLabels(dataLabels)
  }

  /**
   * @param fieldWells The field well configuration of a `GaugeChartVisual` .
   */
  public fun fieldWells(fieldWells: IResolvable) {
    cdkBuilder.fieldWells(fieldWells)
  }

  /**
   * @param fieldWells The field well configuration of a `GaugeChartVisual` .
   */
  public fun fieldWells(fieldWells: CfnDashboard.GaugeChartFieldWellsProperty) {
    cdkBuilder.fieldWells(fieldWells)
  }

  /**
   * @param gaugeChartOptions The options that determine the presentation of the `GaugeChartVisual`
   * .
   */
  public fun gaugeChartOptions(gaugeChartOptions: IResolvable) {
    cdkBuilder.gaugeChartOptions(gaugeChartOptions)
  }

  /**
   * @param gaugeChartOptions The options that determine the presentation of the `GaugeChartVisual`
   * .
   */
  public fun gaugeChartOptions(gaugeChartOptions: CfnDashboard.GaugeChartOptionsProperty) {
    cdkBuilder.gaugeChartOptions(gaugeChartOptions)
  }

  /**
   * @param tooltipOptions The tooltip configuration of a `GaugeChartVisual` .
   */
  public fun tooltipOptions(tooltipOptions: IResolvable) {
    cdkBuilder.tooltipOptions(tooltipOptions)
  }

  /**
   * @param tooltipOptions The tooltip configuration of a `GaugeChartVisual` .
   */
  public fun tooltipOptions(tooltipOptions: CfnDashboard.TooltipOptionsProperty) {
    cdkBuilder.tooltipOptions(tooltipOptions)
  }

  /**
   * @param visualPalette The visual palette configuration of a `GaugeChartVisual` .
   */
  public fun visualPalette(visualPalette: IResolvable) {
    cdkBuilder.visualPalette(visualPalette)
  }

  /**
   * @param visualPalette The visual palette configuration of a `GaugeChartVisual` .
   */
  public fun visualPalette(visualPalette: CfnDashboard.VisualPaletteProperty) {
    cdkBuilder.visualPalette(visualPalette)
  }

  public fun build(): CfnDashboard.GaugeChartConfigurationProperty = cdkBuilder.build()
}
