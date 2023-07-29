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
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

/**
 * The configuration of a line chart.
 *
 * Example:
 * ```
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dashboard-linechartconfiguration.html)
 */
@CdkDslMarker
public class CfnDashboardLineChartConfigurationPropertyDsl {
    private val cdkBuilder: CfnDashboard.LineChartConfigurationProperty.Builder =
        CfnDashboard.LineChartConfigurationProperty.builder()

    private val _contributionAnalysisDefaults: MutableList<Any> = mutableListOf()

    private val _forecastConfigurations: MutableList<Any> = mutableListOf()

    private val _referenceLines: MutableList<Any> = mutableListOf()

    private val _series: MutableList<Any> = mutableListOf()

    /**
     * @param contributionAnalysisDefaults The default configuration of a line chart's contribution
     *   analysis.
     */
    public fun contributionAnalysisDefaults(vararg contributionAnalysisDefaults: Any) {
        _contributionAnalysisDefaults.addAll(listOf(*contributionAnalysisDefaults))
    }

    /**
     * @param contributionAnalysisDefaults The default configuration of a line chart's contribution
     *   analysis.
     */
    public fun contributionAnalysisDefaults(contributionAnalysisDefaults: Collection<Any>) {
        _contributionAnalysisDefaults.addAll(contributionAnalysisDefaults)
    }

    /**
     * @param contributionAnalysisDefaults The default configuration of a line chart's contribution
     *   analysis.
     */
    public fun contributionAnalysisDefaults(contributionAnalysisDefaults: IResolvable) {
        cdkBuilder.contributionAnalysisDefaults(contributionAnalysisDefaults)
    }

    /** @param dataLabels The data label configuration of a line chart. */
    public fun dataLabels(dataLabels: IResolvable) {
        cdkBuilder.dataLabels(dataLabels)
    }

    /** @param dataLabels The data label configuration of a line chart. */
    public fun dataLabels(dataLabels: CfnDashboard.DataLabelOptionsProperty) {
        cdkBuilder.dataLabels(dataLabels)
    }

    /**
     * @param defaultSeriesSettings The options that determine the default presentation of all line
     *   series in `LineChartVisual` .
     */
    public fun defaultSeriesSettings(defaultSeriesSettings: IResolvable) {
        cdkBuilder.defaultSeriesSettings(defaultSeriesSettings)
    }

    /**
     * @param defaultSeriesSettings The options that determine the default presentation of all line
     *   series in `LineChartVisual` .
     */
    public fun defaultSeriesSettings(
        defaultSeriesSettings: CfnDashboard.LineChartDefaultSeriesSettingsProperty
    ) {
        cdkBuilder.defaultSeriesSettings(defaultSeriesSettings)
    }

    /** @param fieldWells The field well configuration of a line chart. */
    public fun fieldWells(fieldWells: IResolvable) {
        cdkBuilder.fieldWells(fieldWells)
    }

    /** @param fieldWells The field well configuration of a line chart. */
    public fun fieldWells(fieldWells: CfnDashboard.LineChartFieldWellsProperty) {
        cdkBuilder.fieldWells(fieldWells)
    }

    /** @param forecastConfigurations The forecast configuration of a line chart. */
    public fun forecastConfigurations(vararg forecastConfigurations: Any) {
        _forecastConfigurations.addAll(listOf(*forecastConfigurations))
    }

    /** @param forecastConfigurations The forecast configuration of a line chart. */
    public fun forecastConfigurations(forecastConfigurations: Collection<Any>) {
        _forecastConfigurations.addAll(forecastConfigurations)
    }

    /** @param forecastConfigurations The forecast configuration of a line chart. */
    public fun forecastConfigurations(forecastConfigurations: IResolvable) {
        cdkBuilder.forecastConfigurations(forecastConfigurations)
    }

    /** @param legend The legend configuration of a line chart. */
    public fun legend(legend: IResolvable) {
        cdkBuilder.legend(legend)
    }

    /** @param legend The legend configuration of a line chart. */
    public fun legend(legend: CfnDashboard.LegendOptionsProperty) {
        cdkBuilder.legend(legend)
    }

    /** @param primaryYAxisDisplayOptions The series axis configuration of a line chart. */
    public fun primaryYAxisDisplayOptions(primaryYAxisDisplayOptions: IResolvable) {
        cdkBuilder.primaryYAxisDisplayOptions(primaryYAxisDisplayOptions)
    }

    /** @param primaryYAxisDisplayOptions The series axis configuration of a line chart. */
    public fun primaryYAxisDisplayOptions(
        primaryYAxisDisplayOptions: CfnDashboard.LineSeriesAxisDisplayOptionsProperty
    ) {
        cdkBuilder.primaryYAxisDisplayOptions(primaryYAxisDisplayOptions)
    }

    /**
     * @param primaryYAxisLabelOptions The options that determine the presentation of the y-axis
     *   label.
     */
    public fun primaryYAxisLabelOptions(primaryYAxisLabelOptions: IResolvable) {
        cdkBuilder.primaryYAxisLabelOptions(primaryYAxisLabelOptions)
    }

    /**
     * @param primaryYAxisLabelOptions The options that determine the presentation of the y-axis
     *   label.
     */
    public fun primaryYAxisLabelOptions(
        primaryYAxisLabelOptions: CfnDashboard.ChartAxisLabelOptionsProperty
    ) {
        cdkBuilder.primaryYAxisLabelOptions(primaryYAxisLabelOptions)
    }

    /** @param referenceLines The reference lines configuration of a line chart. */
    public fun referenceLines(vararg referenceLines: Any) {
        _referenceLines.addAll(listOf(*referenceLines))
    }

    /** @param referenceLines The reference lines configuration of a line chart. */
    public fun referenceLines(referenceLines: Collection<Any>) {
        _referenceLines.addAll(referenceLines)
    }

    /** @param referenceLines The reference lines configuration of a line chart. */
    public fun referenceLines(referenceLines: IResolvable) {
        cdkBuilder.referenceLines(referenceLines)
    }

    /** @param secondaryYAxisDisplayOptions The series axis configuration of a line chart. */
    public fun secondaryYAxisDisplayOptions(secondaryYAxisDisplayOptions: IResolvable) {
        cdkBuilder.secondaryYAxisDisplayOptions(secondaryYAxisDisplayOptions)
    }

    /** @param secondaryYAxisDisplayOptions The series axis configuration of a line chart. */
    public fun secondaryYAxisDisplayOptions(
        secondaryYAxisDisplayOptions: CfnDashboard.LineSeriesAxisDisplayOptionsProperty
    ) {
        cdkBuilder.secondaryYAxisDisplayOptions(secondaryYAxisDisplayOptions)
    }

    /**
     * @param secondaryYAxisLabelOptions The options that determine the presentation of the
     *   secondary y-axis label.
     */
    public fun secondaryYAxisLabelOptions(secondaryYAxisLabelOptions: IResolvable) {
        cdkBuilder.secondaryYAxisLabelOptions(secondaryYAxisLabelOptions)
    }

    /**
     * @param secondaryYAxisLabelOptions The options that determine the presentation of the
     *   secondary y-axis label.
     */
    public fun secondaryYAxisLabelOptions(
        secondaryYAxisLabelOptions: CfnDashboard.ChartAxisLabelOptionsProperty
    ) {
        cdkBuilder.secondaryYAxisLabelOptions(secondaryYAxisLabelOptions)
    }

    /** @param series The series item configuration of a line chart. */
    public fun series(vararg series: Any) {
        _series.addAll(listOf(*series))
    }

    /** @param series The series item configuration of a line chart. */
    public fun series(series: Collection<Any>) {
        _series.addAll(series)
    }

    /** @param series The series item configuration of a line chart. */
    public fun series(series: IResolvable) {
        cdkBuilder.series(series)
    }

    /** @param smallMultiplesOptions The small multiples setup for the visual. */
    public fun smallMultiplesOptions(smallMultiplesOptions: IResolvable) {
        cdkBuilder.smallMultiplesOptions(smallMultiplesOptions)
    }

    /** @param smallMultiplesOptions The small multiples setup for the visual. */
    public fun smallMultiplesOptions(
        smallMultiplesOptions: CfnDashboard.SmallMultiplesOptionsProperty
    ) {
        cdkBuilder.smallMultiplesOptions(smallMultiplesOptions)
    }

    /** @param sortConfiguration The sort configuration of a line chart. */
    public fun sortConfiguration(sortConfiguration: IResolvable) {
        cdkBuilder.sortConfiguration(sortConfiguration)
    }

    /** @param sortConfiguration The sort configuration of a line chart. */
    public fun sortConfiguration(
        sortConfiguration: CfnDashboard.LineChartSortConfigurationProperty
    ) {
        cdkBuilder.sortConfiguration(sortConfiguration)
    }

    /** @param tooltip The tooltip configuration of a line chart. */
    public fun tooltip(tooltip: IResolvable) {
        cdkBuilder.tooltip(tooltip)
    }

    /** @param tooltip The tooltip configuration of a line chart. */
    public fun tooltip(tooltip: CfnDashboard.TooltipOptionsProperty) {
        cdkBuilder.tooltip(tooltip)
    }

    /** @param type Determines the type of the line chart. */
    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    /** @param visualPalette The visual palette configuration of a line chart. */
    public fun visualPalette(visualPalette: IResolvable) {
        cdkBuilder.visualPalette(visualPalette)
    }

    /** @param visualPalette The visual palette configuration of a line chart. */
    public fun visualPalette(visualPalette: CfnDashboard.VisualPaletteProperty) {
        cdkBuilder.visualPalette(visualPalette)
    }

    /** @param xAxisDisplayOptions The options that determine the presentation of the x-axis. */
    public fun xAxisDisplayOptions(xAxisDisplayOptions: IResolvable) {
        cdkBuilder.xAxisDisplayOptions(xAxisDisplayOptions)
    }

    /** @param xAxisDisplayOptions The options that determine the presentation of the x-axis. */
    public fun xAxisDisplayOptions(xAxisDisplayOptions: CfnDashboard.AxisDisplayOptionsProperty) {
        cdkBuilder.xAxisDisplayOptions(xAxisDisplayOptions)
    }

    /** @param xAxisLabelOptions The options that determine the presentation of the x-axis label. */
    public fun xAxisLabelOptions(xAxisLabelOptions: IResolvable) {
        cdkBuilder.xAxisLabelOptions(xAxisLabelOptions)
    }

    /** @param xAxisLabelOptions The options that determine the presentation of the x-axis label. */
    public fun xAxisLabelOptions(xAxisLabelOptions: CfnDashboard.ChartAxisLabelOptionsProperty) {
        cdkBuilder.xAxisLabelOptions(xAxisLabelOptions)
    }

    public fun build(): CfnDashboard.LineChartConfigurationProperty {
        if (_contributionAnalysisDefaults.isNotEmpty())
            cdkBuilder.contributionAnalysisDefaults(_contributionAnalysisDefaults)
        if (_forecastConfigurations.isNotEmpty())
            cdkBuilder.forecastConfigurations(_forecastConfigurations)
        if (_referenceLines.isNotEmpty()) cdkBuilder.referenceLines(_referenceLines)
        if (_series.isNotEmpty()) cdkBuilder.series(_series)
        return cdkBuilder.build()
    }
}
