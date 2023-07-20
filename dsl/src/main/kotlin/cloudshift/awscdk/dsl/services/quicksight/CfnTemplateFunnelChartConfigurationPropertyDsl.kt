@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplateFunnelChartConfigurationPropertyDsl {
  private val cdkBuilder: CfnTemplate.FunnelChartConfigurationProperty.Builder =
      CfnTemplate.FunnelChartConfigurationProperty.builder()

  public fun categoryLabelOptions(categoryLabelOptions: IResolvable) {
    cdkBuilder.categoryLabelOptions(categoryLabelOptions)
  }

  public fun categoryLabelOptions(categoryLabelOptions: CfnTemplate.ChartAxisLabelOptionsProperty) {
    cdkBuilder.categoryLabelOptions(categoryLabelOptions)
  }

  public fun dataLabelOptions(dataLabelOptions: IResolvable) {
    cdkBuilder.dataLabelOptions(dataLabelOptions)
  }

  public fun dataLabelOptions(dataLabelOptions: CfnTemplate.FunnelChartDataLabelOptionsProperty) {
    cdkBuilder.dataLabelOptions(dataLabelOptions)
  }

  public fun fieldWells(fieldWells: IResolvable) {
    cdkBuilder.fieldWells(fieldWells)
  }

  public fun fieldWells(fieldWells: CfnTemplate.FunnelChartFieldWellsProperty) {
    cdkBuilder.fieldWells(fieldWells)
  }

  public fun sortConfiguration(sortConfiguration: IResolvable) {
    cdkBuilder.sortConfiguration(sortConfiguration)
  }

  public
      fun sortConfiguration(sortConfiguration: CfnTemplate.FunnelChartSortConfigurationProperty) {
    cdkBuilder.sortConfiguration(sortConfiguration)
  }

  public fun tooltip(tooltip: IResolvable) {
    cdkBuilder.tooltip(tooltip)
  }

  public fun tooltip(tooltip: CfnTemplate.TooltipOptionsProperty) {
    cdkBuilder.tooltip(tooltip)
  }

  public fun valueLabelOptions(valueLabelOptions: IResolvable) {
    cdkBuilder.valueLabelOptions(valueLabelOptions)
  }

  public fun valueLabelOptions(valueLabelOptions: CfnTemplate.ChartAxisLabelOptionsProperty) {
    cdkBuilder.valueLabelOptions(valueLabelOptions)
  }

  public fun visualPalette(visualPalette: IResolvable) {
    cdkBuilder.visualPalette(visualPalette)
  }

  public fun visualPalette(visualPalette: CfnTemplate.VisualPaletteProperty) {
    cdkBuilder.visualPalette(visualPalette)
  }

  public fun build(): CfnTemplate.FunnelChartConfigurationProperty = cdkBuilder.build()
}
