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
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnAnalysisLineChartConfigurationPropertyDsl {
    private val cdkBuilder: CfnAnalysis.LineChartConfigurationProperty.Builder =
        CfnAnalysis.LineChartConfigurationProperty.builder()

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

    public fun dataLabels(dataLabels: CfnAnalysis.DataLabelOptionsProperty) {
        cdkBuilder.dataLabels(dataLabels)
    }

    public fun defaultSeriesSettings(defaultSeriesSettings: IResolvable) {
        cdkBuilder.defaultSeriesSettings(defaultSeriesSettings)
    }

    public fun defaultSeriesSettings(defaultSeriesSettings: CfnAnalysis.LineChartDefaultSeriesSettingsProperty) {
        cdkBuilder.defaultSeriesSettings(defaultSeriesSettings)
    }

    public fun fieldWells(fieldWells: IResolvable) {
        cdkBuilder.fieldWells(fieldWells)
    }

    public fun fieldWells(fieldWells: CfnAnalysis.LineChartFieldWellsProperty) {
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

    public fun legend(legend: CfnAnalysis.LegendOptionsProperty) {
        cdkBuilder.legend(legend)
    }

    public fun primaryYAxisDisplayOptions(primaryYAxisDisplayOptions: IResolvable) {
        cdkBuilder.primaryYAxisDisplayOptions(primaryYAxisDisplayOptions)
    }

    public fun primaryYAxisDisplayOptions(primaryYAxisDisplayOptions: CfnAnalysis.LineSeriesAxisDisplayOptionsProperty) {
        cdkBuilder.primaryYAxisDisplayOptions(primaryYAxisDisplayOptions)
    }

    public fun primaryYAxisLabelOptions(primaryYAxisLabelOptions: IResolvable) {
        cdkBuilder.primaryYAxisLabelOptions(primaryYAxisLabelOptions)
    }

    public fun primaryYAxisLabelOptions(primaryYAxisLabelOptions: CfnAnalysis.ChartAxisLabelOptionsProperty) {
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

    public fun secondaryYAxisDisplayOptions(secondaryYAxisDisplayOptions: CfnAnalysis.LineSeriesAxisDisplayOptionsProperty) {
        cdkBuilder.secondaryYAxisDisplayOptions(secondaryYAxisDisplayOptions)
    }

    public fun secondaryYAxisLabelOptions(secondaryYAxisLabelOptions: IResolvable) {
        cdkBuilder.secondaryYAxisLabelOptions(secondaryYAxisLabelOptions)
    }

    public fun secondaryYAxisLabelOptions(secondaryYAxisLabelOptions: CfnAnalysis.ChartAxisLabelOptionsProperty) {
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

    public fun smallMultiplesOptions(smallMultiplesOptions: CfnAnalysis.SmallMultiplesOptionsProperty) {
        cdkBuilder.smallMultiplesOptions(smallMultiplesOptions)
    }

    public fun sortConfiguration(sortConfiguration: IResolvable) {
        cdkBuilder.sortConfiguration(sortConfiguration)
    }

    public fun sortConfiguration(sortConfiguration: CfnAnalysis.LineChartSortConfigurationProperty) {
        cdkBuilder.sortConfiguration(sortConfiguration)
    }

    public fun tooltip(tooltip: IResolvable) {
        cdkBuilder.tooltip(tooltip)
    }

    public fun tooltip(tooltip: CfnAnalysis.TooltipOptionsProperty) {
        cdkBuilder.tooltip(tooltip)
    }

    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    public fun visualPalette(visualPalette: IResolvable) {
        cdkBuilder.visualPalette(visualPalette)
    }

    public fun visualPalette(visualPalette: CfnAnalysis.VisualPaletteProperty) {
        cdkBuilder.visualPalette(visualPalette)
    }

    public fun xAxisDisplayOptions(xAxisDisplayOptions: IResolvable) {
        cdkBuilder.xAxisDisplayOptions(xAxisDisplayOptions)
    }

    public fun xAxisDisplayOptions(xAxisDisplayOptions: CfnAnalysis.AxisDisplayOptionsProperty) {
        cdkBuilder.xAxisDisplayOptions(xAxisDisplayOptions)
    }

    public fun xAxisLabelOptions(xAxisLabelOptions: IResolvable) {
        cdkBuilder.xAxisLabelOptions(xAxisLabelOptions)
    }

    public fun xAxisLabelOptions(xAxisLabelOptions: CfnAnalysis.ChartAxisLabelOptionsProperty) {
        cdkBuilder.xAxisLabelOptions(xAxisLabelOptions)
    }

    public fun build(): CfnAnalysis.LineChartConfigurationProperty {
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
