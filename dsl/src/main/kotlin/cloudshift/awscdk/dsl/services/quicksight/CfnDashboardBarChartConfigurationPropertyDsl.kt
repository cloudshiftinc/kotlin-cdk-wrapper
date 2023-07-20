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
public class CfnDashboardBarChartConfigurationPropertyDsl {
    private val cdkBuilder: CfnDashboard.BarChartConfigurationProperty.Builder =
        CfnDashboard.BarChartConfigurationProperty.builder()

    private val _contributionAnalysisDefaults: MutableList<Any> = mutableListOf()

    private val _referenceLines: MutableList<Any> = mutableListOf()

    public fun barsArrangement(barsArrangement: String) {
        cdkBuilder.barsArrangement(barsArrangement)
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

    public fun categoryLabelOptions(categoryLabelOptions: CfnDashboard.ChartAxisLabelOptionsProperty) {
        cdkBuilder.categoryLabelOptions(categoryLabelOptions)
    }

    public fun colorLabelOptions(colorLabelOptions: IResolvable) {
        cdkBuilder.colorLabelOptions(colorLabelOptions)
    }

    public fun colorLabelOptions(colorLabelOptions: CfnDashboard.ChartAxisLabelOptionsProperty) {
        cdkBuilder.colorLabelOptions(colorLabelOptions)
    }

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

    public fun fieldWells(fieldWells: IResolvable) {
        cdkBuilder.fieldWells(fieldWells)
    }

    public fun fieldWells(fieldWells: CfnDashboard.BarChartFieldWellsProperty) {
        cdkBuilder.fieldWells(fieldWells)
    }

    public fun legend(legend: IResolvable) {
        cdkBuilder.legend(legend)
    }

    public fun legend(legend: CfnDashboard.LegendOptionsProperty) {
        cdkBuilder.legend(legend)
    }

    public fun orientation(orientation: String) {
        cdkBuilder.orientation(orientation)
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

    public fun smallMultiplesOptions(smallMultiplesOptions: IResolvable) {
        cdkBuilder.smallMultiplesOptions(smallMultiplesOptions)
    }

    public fun smallMultiplesOptions(smallMultiplesOptions: CfnDashboard.SmallMultiplesOptionsProperty) {
        cdkBuilder.smallMultiplesOptions(smallMultiplesOptions)
    }

    public fun sortConfiguration(sortConfiguration: IResolvable) {
        cdkBuilder.sortConfiguration(sortConfiguration)
    }

    public fun sortConfiguration(sortConfiguration: CfnDashboard.BarChartSortConfigurationProperty) {
        cdkBuilder.sortConfiguration(sortConfiguration)
    }

    public fun tooltip(tooltip: IResolvable) {
        cdkBuilder.tooltip(tooltip)
    }

    public fun tooltip(tooltip: CfnDashboard.TooltipOptionsProperty) {
        cdkBuilder.tooltip(tooltip)
    }

    public fun valueAxis(valueAxis: IResolvable) {
        cdkBuilder.valueAxis(valueAxis)
    }

    public fun valueAxis(valueAxis: CfnDashboard.AxisDisplayOptionsProperty) {
        cdkBuilder.valueAxis(valueAxis)
    }

    public fun valueLabelOptions(valueLabelOptions: IResolvable) {
        cdkBuilder.valueLabelOptions(valueLabelOptions)
    }

    public fun valueLabelOptions(valueLabelOptions: CfnDashboard.ChartAxisLabelOptionsProperty) {
        cdkBuilder.valueLabelOptions(valueLabelOptions)
    }

    public fun visualPalette(visualPalette: IResolvable) {
        cdkBuilder.visualPalette(visualPalette)
    }

    public fun visualPalette(visualPalette: CfnDashboard.VisualPaletteProperty) {
        cdkBuilder.visualPalette(visualPalette)
    }

    public fun build(): CfnDashboard.BarChartConfigurationProperty {
        if (_contributionAnalysisDefaults.isNotEmpty()) {
            cdkBuilder.contributionAnalysisDefaults(_contributionAnalysisDefaults)
        }
        if (_referenceLines.isNotEmpty()) cdkBuilder.referenceLines(_referenceLines)
        return cdkBuilder.build()
    }
}
