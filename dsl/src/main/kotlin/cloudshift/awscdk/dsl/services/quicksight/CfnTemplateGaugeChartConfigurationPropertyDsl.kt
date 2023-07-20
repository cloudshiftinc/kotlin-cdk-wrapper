@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplateGaugeChartConfigurationPropertyDsl {
  private val cdkBuilder: CfnTemplate.GaugeChartConfigurationProperty.Builder =
      CfnTemplate.GaugeChartConfigurationProperty.builder()

  public fun dataLabels(dataLabels: IResolvable) {
    cdkBuilder.dataLabels(dataLabels)
  }

  public fun dataLabels(dataLabels: CfnTemplate.DataLabelOptionsProperty) {
    cdkBuilder.dataLabels(dataLabels)
  }

  public fun fieldWells(fieldWells: IResolvable) {
    cdkBuilder.fieldWells(fieldWells)
  }

  public fun fieldWells(fieldWells: CfnTemplate.GaugeChartFieldWellsProperty) {
    cdkBuilder.fieldWells(fieldWells)
  }

  public fun gaugeChartOptions(gaugeChartOptions: IResolvable) {
    cdkBuilder.gaugeChartOptions(gaugeChartOptions)
  }

  public fun gaugeChartOptions(gaugeChartOptions: CfnTemplate.GaugeChartOptionsProperty) {
    cdkBuilder.gaugeChartOptions(gaugeChartOptions)
  }

  public fun tooltipOptions(tooltipOptions: IResolvable) {
    cdkBuilder.tooltipOptions(tooltipOptions)
  }

  public fun tooltipOptions(tooltipOptions: CfnTemplate.TooltipOptionsProperty) {
    cdkBuilder.tooltipOptions(tooltipOptions)
  }

  public fun visualPalette(visualPalette: IResolvable) {
    cdkBuilder.visualPalette(visualPalette)
  }

  public fun visualPalette(visualPalette: CfnTemplate.VisualPaletteProperty) {
    cdkBuilder.visualPalette(visualPalette)
  }

  public fun build(): CfnTemplate.GaugeChartConfigurationProperty = cdkBuilder.build()
}
