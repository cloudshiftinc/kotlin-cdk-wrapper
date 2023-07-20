@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnAnalysis
import kotlin.Number
import kotlin.String

@CdkDslMarker
public class CfnAnalysisRadarChartConfigurationPropertyDsl {
    private val cdkBuilder: CfnAnalysis.RadarChartConfigurationProperty.Builder =
        CfnAnalysis.RadarChartConfigurationProperty.builder()

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

    public fun baseSeriesSettings(baseSeriesSettings: CfnAnalysis.RadarChartSeriesSettingsProperty) {
        cdkBuilder.baseSeriesSettings(baseSeriesSettings)
    }

    public fun categoryAxis(categoryAxis: IResolvable) {
        cdkBuilder.categoryAxis(categoryAxis)
    }

    public fun categoryAxis(categoryAxis: CfnAnalysis.AxisDisplayOptionsProperty) {
        cdkBuilder.categoryAxis(categoryAxis)
    }

    public fun categoryLabelOptions(categoryLabelOptions: IResolvable) {
        cdkBuilder.categoryLabelOptions(categoryLabelOptions)
    }

    public fun categoryLabelOptions(categoryLabelOptions: CfnAnalysis.ChartAxisLabelOptionsProperty) {
        cdkBuilder.categoryLabelOptions(categoryLabelOptions)
    }

    public fun colorAxis(colorAxis: IResolvable) {
        cdkBuilder.colorAxis(colorAxis)
    }

    public fun colorAxis(colorAxis: CfnAnalysis.AxisDisplayOptionsProperty) {
        cdkBuilder.colorAxis(colorAxis)
    }

    public fun colorLabelOptions(colorLabelOptions: IResolvable) {
        cdkBuilder.colorLabelOptions(colorLabelOptions)
    }

    public fun colorLabelOptions(colorLabelOptions: CfnAnalysis.ChartAxisLabelOptionsProperty) {
        cdkBuilder.colorLabelOptions(colorLabelOptions)
    }

    public fun fieldWells(fieldWells: IResolvable) {
        cdkBuilder.fieldWells(fieldWells)
    }

    public fun fieldWells(fieldWells: CfnAnalysis.RadarChartFieldWellsProperty) {
        cdkBuilder.fieldWells(fieldWells)
    }

    public fun legend(legend: IResolvable) {
        cdkBuilder.legend(legend)
    }

    public fun legend(legend: CfnAnalysis.LegendOptionsProperty) {
        cdkBuilder.legend(legend)
    }

    public fun shape(shape: String) {
        cdkBuilder.shape(shape)
    }

    public fun sortConfiguration(sortConfiguration: IResolvable) {
        cdkBuilder.sortConfiguration(sortConfiguration)
    }

    public fun sortConfiguration(sortConfiguration: CfnAnalysis.RadarChartSortConfigurationProperty) {
        cdkBuilder.sortConfiguration(sortConfiguration)
    }

    public fun startAngle(startAngle: Number) {
        cdkBuilder.startAngle(startAngle)
    }

    public fun visualPalette(visualPalette: IResolvable) {
        cdkBuilder.visualPalette(visualPalette)
    }

    public fun visualPalette(visualPalette: CfnAnalysis.VisualPaletteProperty) {
        cdkBuilder.visualPalette(visualPalette)
    }

    public fun build(): CfnAnalysis.RadarChartConfigurationProperty = cdkBuilder.build()
}
