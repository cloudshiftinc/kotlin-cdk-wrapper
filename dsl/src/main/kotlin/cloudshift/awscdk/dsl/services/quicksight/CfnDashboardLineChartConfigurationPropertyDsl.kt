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
import software.amazon.awscdk.services.quicksight.CfnDashboard
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnDashboardLineChartConfigurationPropertyDsl {
    private val cdkBuilder: CfnDashboard.LineChartConfigurationProperty.Builder =
        CfnDashboard.LineChartConfigurationProperty.builder()

    private val _contributionAnalysisDefaults: MutableList<Any> = mutableListOf()

    private val _forecastConfigurations: MutableList<Any> = mutableListOf()

    private val _referenceLines: MutableList<Any> = mutableListOf()

    private val _series: MutableList<Any> = mutableListOf()

    public fun contributionAnalysisDefaults(vararg contributionAnalysisDefaults: Any) {
        _contributionAnalysisDefaults.addAll(listOf(*contributionAnalysisDefaults))
    }

    public fun contributionAnalysisDefaults(contributionAnalysisDefaults: Collection<Any>) {
        _contributionAnalysisDefaults.addAll(contributionAnalysisDefaults)
    }

    public fun contributionAnalysisDefaults(contributionAnalysisDefaults: IResolvable) {
        cdkBuilder.contributionAnalysisDefaults(contributionAnalysisDefaults)
    }

    public fun dataLabels(dataLabels: IResolvable) {
        cdkBuilder.dataLabels(dataLabels)
    }

    public fun dataLabels(dataLabels: CfnDashboard.DataLabelOptionsProperty) {
        cdkBuilder.dataLabels(dataLabels)
    }

    public fun defaultSeriesSettings(defaultSeriesSettings: IResolvable) {
        cdkBuilder.defaultSeriesSettings(defaultSeriesSettings)
    }

    public fun defaultSeriesSettings(defaultSeriesSettings: CfnDashboard.LineChartDefaultSeriesSettingsProperty) {
        cdkBuilder.defaultSeriesSettings(defaultSeriesSettings)
    }

    public fun fieldWells(fieldWells: IResolvable) {
        cdkBuilder.fieldWells(fieldWells)
    }

    public fun fieldWells(fieldWells: CfnDashboard.LineChartFieldWellsProperty) {
        cdkBuilder.fieldWells(fieldWells)
    }

    public fun forecastConfigurations(vararg forecastConfigurations: Any) {
        _forecastConfigurations.addAll(listOf(*forecastConfigurations))
    }

    public fun forecastConfigurations(forecastConfigurations: Collection<Any>) {
        _forecastConfigurations.addAll(forecastConfigurations)
    }

    public fun forecastConfigurations(forecastConfigurations: IResolvable) {
        cdkBuilder.forecastConfigurations(forecastConfigurations)
    }

    public fun legend(legend: IResolvable) {
        cdkBuilder.legend(legend)
    }

    public fun legend(legend: CfnDashboard.LegendOptionsProperty) {
        cdkBuilder.legend(legend)
    }

    public fun primaryYAxisDisplayOptions(primaryYAxisDisplayOptions: IResolvable) {
        cdkBuilder.primaryYAxisDisplayOptions(primaryYAxisDisplayOptions)
    }

    public fun primaryYAxisDisplayOptions(primaryYAxisDisplayOptions: CfnDashboard.LineSeriesAxisDisplayOptionsProperty) {
        cdkBuilder.primaryYAxisDisplayOptions(primaryYAxisDisplayOptions)
    }

    public fun primaryYAxisLabelOptions(primaryYAxisLabelOptions: IResolvable) {
        cdkBuilder.primaryYAxisLabelOptions(primaryYAxisLabelOptions)
    }

    public fun primaryYAxisLabelOptions(primaryYAxisLabelOptions: CfnDashboard.ChartAxisLabelOptionsProperty) {
        cdkBuilder.primaryYAxisLabelOptions(primaryYAxisLabelOptions)
    }

    public fun referenceLines(vararg referenceLines: Any) {
        _referenceLines.addAll(listOf(*referenceLines))
    }

    public fun referenceLines(referenceLines: Collection<Any>) {
        _referenceLines.addAll(referenceLines)
    }

    public fun referenceLines(referenceLines: IResolvable) {
        cdkBuilder.referenceLines(referenceLines)
    }

    public fun secondaryYAxisDisplayOptions(secondaryYAxisDisplayOptions: IResolvable) {
        cdkBuilder.secondaryYAxisDisplayOptions(secondaryYAxisDisplayOptions)
    }

    public fun secondaryYAxisDisplayOptions(secondaryYAxisDisplayOptions: CfnDashboard.LineSeriesAxisDisplayOptionsProperty) {
        cdkBuilder.secondaryYAxisDisplayOptions(secondaryYAxisDisplayOptions)
    }

    public fun secondaryYAxisLabelOptions(secondaryYAxisLabelOptions: IResolvable) {
        cdkBuilder.secondaryYAxisLabelOptions(secondaryYAxisLabelOptions)
    }

    public fun secondaryYAxisLabelOptions(secondaryYAxisLabelOptions: CfnDashboard.ChartAxisLabelOptionsProperty) {
        cdkBuilder.secondaryYAxisLabelOptions(secondaryYAxisLabelOptions)
    }

    public fun series(vararg series: Any) {
        _series.addAll(listOf(*series))
    }

    public fun series(series: Collection<Any>) {
        _series.addAll(series)
    }

    public fun series(series: IResolvable) {
        cdkBuilder.series(series)
    }

    public fun smallMultiplesOptions(smallMultiplesOptions: IResolvable) {
        cdkBuilder.smallMultiplesOptions(smallMultiplesOptions)
    }

    public fun smallMultiplesOptions(smallMultiplesOptions: CfnDashboard.SmallMultiplesOptionsProperty) {
        cdkBuilder.smallMultiplesOptions(smallMultiplesOptions)
    }

    public fun sortConfiguration(sortConfiguration: IResolvable) {
        cdkBuilder.sortConfiguration(sortConfiguration)
    }

    public fun sortConfiguration(sortConfiguration: CfnDashboard.LineChartSortConfigurationProperty) {
        cdkBuilder.sortConfiguration(sortConfiguration)
    }

    public fun tooltip(tooltip: IResolvable) {
        cdkBuilder.tooltip(tooltip)
    }

    public fun tooltip(tooltip: CfnDashboard.TooltipOptionsProperty) {
        cdkBuilder.tooltip(tooltip)
    }

    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    public fun visualPalette(visualPalette: IResolvable) {
        cdkBuilder.visualPalette(visualPalette)
    }

    public fun visualPalette(visualPalette: CfnDashboard.VisualPaletteProperty) {
        cdkBuilder.visualPalette(visualPalette)
    }

    public fun xAxisDisplayOptions(xAxisDisplayOptions: IResolvable) {
        cdkBuilder.xAxisDisplayOptions(xAxisDisplayOptions)
    }

    public fun xAxisDisplayOptions(xAxisDisplayOptions: CfnDashboard.AxisDisplayOptionsProperty) {
        cdkBuilder.xAxisDisplayOptions(xAxisDisplayOptions)
    }

    public fun xAxisLabelOptions(xAxisLabelOptions: IResolvable) {
        cdkBuilder.xAxisLabelOptions(xAxisLabelOptions)
    }

    public fun xAxisLabelOptions(xAxisLabelOptions: CfnDashboard.ChartAxisLabelOptionsProperty) {
        cdkBuilder.xAxisLabelOptions(xAxisLabelOptions)
    }

    public fun build(): CfnDashboard.LineChartConfigurationProperty {
        if (_contributionAnalysisDefaults.isNotEmpty()) {
            cdkBuilder.contributionAnalysisDefaults(_contributionAnalysisDefaults)
        }
        if (_forecastConfigurations.isNotEmpty()) {
            cdkBuilder.forecastConfigurations(_forecastConfigurations)
        }
        if (_referenceLines.isNotEmpty()) cdkBuilder.referenceLines(_referenceLines)
        if (_series.isNotEmpty()) cdkBuilder.series(_series)
        return cdkBuilder.build()
    }
}
