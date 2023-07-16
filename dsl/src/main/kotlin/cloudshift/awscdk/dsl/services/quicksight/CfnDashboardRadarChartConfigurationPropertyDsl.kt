@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardRadarChartConfigurationPropertyDsl {
  private val cdkBuilder: CfnDashboard.RadarChartConfigurationProperty.Builder =
      CfnDashboard.RadarChartConfigurationProperty.builder()

  public fun alternateBandColorsVisibility(alternateBandColorsVisibility: String) {
    cdkBuilder.alternateBandColorsVisibility(alternateBandColorsVisibility)
  }

  public fun alternateBandEvenColor(alternateBandEvenColor: String) {
    cdkBuilder.alternateBandEvenColor(alternateBandEvenColor)
  }

  public fun alternateBandOddColor(alternateBandOddColor: String) {
    cdkBuilder.alternateBandOddColor(alternateBandOddColor)
  }

  public fun axesRangeScale(axesRangeScale: String) {
    cdkBuilder.axesRangeScale(axesRangeScale)
  }

  public fun baseSeriesSettings(baseSeriesSettings: IResolvable) {
    cdkBuilder.baseSeriesSettings(baseSeriesSettings)
  }

  public fun baseSeriesSettings(baseSeriesSettings: CfnDashboard.RadarChartSeriesSettingsProperty) {
    cdkBuilder.baseSeriesSettings(baseSeriesSettings)
  }

  public fun categoryAxis(categoryAxis: IResolvable) {
    cdkBuilder.categoryAxis(categoryAxis)
  }

  public fun categoryAxis(categoryAxis: CfnDashboard.AxisDisplayOptionsProperty) {
    cdkBuilder.categoryAxis(categoryAxis)
  }

  public fun categoryLabelOptions(categoryLabelOptions: IResolvable) {
    cdkBuilder.categoryLabelOptions(categoryLabelOptions)
  }

  public
      fun categoryLabelOptions(categoryLabelOptions: CfnDashboard.ChartAxisLabelOptionsProperty) {
    cdkBuilder.categoryLabelOptions(categoryLabelOptions)
  }

  public fun colorAxis(colorAxis: IResolvable) {
    cdkBuilder.colorAxis(colorAxis)
  }

  public fun colorAxis(colorAxis: CfnDashboard.AxisDisplayOptionsProperty) {
    cdkBuilder.colorAxis(colorAxis)
  }

  public fun colorLabelOptions(colorLabelOptions: IResolvable) {
    cdkBuilder.colorLabelOptions(colorLabelOptions)
  }

  public fun colorLabelOptions(colorLabelOptions: CfnDashboard.ChartAxisLabelOptionsProperty) {
    cdkBuilder.colorLabelOptions(colorLabelOptions)
  }

  public fun fieldWells(fieldWells: IResolvable) {
    cdkBuilder.fieldWells(fieldWells)
  }

  public fun fieldWells(fieldWells: CfnDashboard.RadarChartFieldWellsProperty) {
    cdkBuilder.fieldWells(fieldWells)
  }

  public fun legend(legend: IResolvable) {
    cdkBuilder.legend(legend)
  }

  public fun legend(legend: CfnDashboard.LegendOptionsProperty) {
    cdkBuilder.legend(legend)
  }

  public fun shape(shape: String) {
    cdkBuilder.shape(shape)
  }

  public fun sortConfiguration(sortConfiguration: IResolvable) {
    cdkBuilder.sortConfiguration(sortConfiguration)
  }

  public
      fun sortConfiguration(sortConfiguration: CfnDashboard.RadarChartSortConfigurationProperty) {
    cdkBuilder.sortConfiguration(sortConfiguration)
  }

  public fun startAngle(startAngle: Number) {
    cdkBuilder.startAngle(startAngle)
  }

  public fun visualPalette(visualPalette: IResolvable) {
    cdkBuilder.visualPalette(visualPalette)
  }

  public fun visualPalette(visualPalette: CfnDashboard.VisualPaletteProperty) {
    cdkBuilder.visualPalette(visualPalette)
  }

  public fun build(): CfnDashboard.RadarChartConfigurationProperty = cdkBuilder.build()
}
