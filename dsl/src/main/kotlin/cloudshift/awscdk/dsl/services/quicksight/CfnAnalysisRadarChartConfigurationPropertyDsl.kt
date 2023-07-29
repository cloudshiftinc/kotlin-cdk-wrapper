@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnAnalysis

/**
 * The configuration of a `RadarChartVisual` .
 *
 * Example:
 * ```
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-analysis-radarchartconfiguration.html)
 */
@CdkDslMarker
public class CfnAnalysisRadarChartConfigurationPropertyDsl {
    private val cdkBuilder: CfnAnalysis.RadarChartConfigurationProperty.Builder =
        CfnAnalysis.RadarChartConfigurationProperty.builder()

    /**
     * @param alternateBandColorsVisibility Determines the visibility of the colors of alternatign
     *   bands in a radar chart.
     */
    public fun alternateBandColorsVisibility(alternateBandColorsVisibility: String) {
        cdkBuilder.alternateBandColorsVisibility(alternateBandColorsVisibility)
    }

    /**
     * @param alternateBandEvenColor The color of the even-numbered alternate bands of a radar
     *   chart.
     */
    public fun alternateBandEvenColor(alternateBandEvenColor: String) {
        cdkBuilder.alternateBandEvenColor(alternateBandEvenColor)
    }

    /**
     * @param alternateBandOddColor The color of the odd-numbered alternate bands of a radar chart.
     */
    public fun alternateBandOddColor(alternateBandOddColor: String) {
        cdkBuilder.alternateBandOddColor(alternateBandOddColor)
    }

    /** @param axesRangeScale The axis behavior options of a radar chart. */
    public fun axesRangeScale(axesRangeScale: String) {
        cdkBuilder.axesRangeScale(axesRangeScale)
    }

    /** @param baseSeriesSettings The base sreies settings of a radar chart. */
    public fun baseSeriesSettings(baseSeriesSettings: IResolvable) {
        cdkBuilder.baseSeriesSettings(baseSeriesSettings)
    }

    /** @param baseSeriesSettings The base sreies settings of a radar chart. */
    public fun baseSeriesSettings(
        baseSeriesSettings: CfnAnalysis.RadarChartSeriesSettingsProperty
    ) {
        cdkBuilder.baseSeriesSettings(baseSeriesSettings)
    }

    /** @param categoryAxis The category axis of a radar chart. */
    public fun categoryAxis(categoryAxis: IResolvable) {
        cdkBuilder.categoryAxis(categoryAxis)
    }

    /** @param categoryAxis The category axis of a radar chart. */
    public fun categoryAxis(categoryAxis: CfnAnalysis.AxisDisplayOptionsProperty) {
        cdkBuilder.categoryAxis(categoryAxis)
    }

    /** @param categoryLabelOptions The category label options of a radar chart. */
    public fun categoryLabelOptions(categoryLabelOptions: IResolvable) {
        cdkBuilder.categoryLabelOptions(categoryLabelOptions)
    }

    /** @param categoryLabelOptions The category label options of a radar chart. */
    public fun categoryLabelOptions(
        categoryLabelOptions: CfnAnalysis.ChartAxisLabelOptionsProperty
    ) {
        cdkBuilder.categoryLabelOptions(categoryLabelOptions)
    }

    /** @param colorAxis The color axis of a radar chart. */
    public fun colorAxis(colorAxis: IResolvable) {
        cdkBuilder.colorAxis(colorAxis)
    }

    /** @param colorAxis The color axis of a radar chart. */
    public fun colorAxis(colorAxis: CfnAnalysis.AxisDisplayOptionsProperty) {
        cdkBuilder.colorAxis(colorAxis)
    }

    /** @param colorLabelOptions The color label options of a radar chart. */
    public fun colorLabelOptions(colorLabelOptions: IResolvable) {
        cdkBuilder.colorLabelOptions(colorLabelOptions)
    }

    /** @param colorLabelOptions The color label options of a radar chart. */
    public fun colorLabelOptions(colorLabelOptions: CfnAnalysis.ChartAxisLabelOptionsProperty) {
        cdkBuilder.colorLabelOptions(colorLabelOptions)
    }

    /** @param fieldWells The field well configuration of a `RadarChartVisual` . */
    public fun fieldWells(fieldWells: IResolvable) {
        cdkBuilder.fieldWells(fieldWells)
    }

    /** @param fieldWells The field well configuration of a `RadarChartVisual` . */
    public fun fieldWells(fieldWells: CfnAnalysis.RadarChartFieldWellsProperty) {
        cdkBuilder.fieldWells(fieldWells)
    }

    /** @param legend The legend display setup of the visual. */
    public fun legend(legend: IResolvable) {
        cdkBuilder.legend(legend)
    }

    /** @param legend The legend display setup of the visual. */
    public fun legend(legend: CfnAnalysis.LegendOptionsProperty) {
        cdkBuilder.legend(legend)
    }

    /** @param shape The shape of the radar chart. */
    public fun shape(shape: String) {
        cdkBuilder.shape(shape)
    }

    /** @param sortConfiguration The sort configuration of a `RadarChartVisual` . */
    public fun sortConfiguration(sortConfiguration: IResolvable) {
        cdkBuilder.sortConfiguration(sortConfiguration)
    }

    /** @param sortConfiguration The sort configuration of a `RadarChartVisual` . */
    public fun sortConfiguration(
        sortConfiguration: CfnAnalysis.RadarChartSortConfigurationProperty
    ) {
        cdkBuilder.sortConfiguration(sortConfiguration)
    }

    /** @param startAngle The start angle of a radar chart's axis. */
    public fun startAngle(startAngle: Number) {
        cdkBuilder.startAngle(startAngle)
    }

    /** @param visualPalette The palette (chart color) display setup of the visual. */
    public fun visualPalette(visualPalette: IResolvable) {
        cdkBuilder.visualPalette(visualPalette)
    }

    /** @param visualPalette The palette (chart color) display setup of the visual. */
    public fun visualPalette(visualPalette: CfnAnalysis.VisualPaletteProperty) {
        cdkBuilder.visualPalette(visualPalette)
    }

    public fun build(): CfnAnalysis.RadarChartConfigurationProperty = cdkBuilder.build()
}
