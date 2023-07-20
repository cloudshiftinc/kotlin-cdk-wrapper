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

@CdkDslMarker
public class CfnDashboardWaterfallChartConfigurationPropertyDsl {
    private val cdkBuilder: CfnDashboard.WaterfallChartConfigurationProperty.Builder =
        CfnDashboard.WaterfallChartConfigurationProperty.builder()

    public fun categoryAxisDisplayOptions(categoryAxisDisplayOptions: IResolvable) {
        cdkBuilder.categoryAxisDisplayOptions(categoryAxisDisplayOptions)
    }

    public fun categoryAxisDisplayOptions(categoryAxisDisplayOptions: CfnDashboard.AxisDisplayOptionsProperty) {
        cdkBuilder.categoryAxisDisplayOptions(categoryAxisDisplayOptions)
    }

    public fun categoryAxisLabelOptions(categoryAxisLabelOptions: IResolvable) {
        cdkBuilder.categoryAxisLabelOptions(categoryAxisLabelOptions)
    }

    public fun categoryAxisLabelOptions(categoryAxisLabelOptions: CfnDashboard.ChartAxisLabelOptionsProperty) {
        cdkBuilder.categoryAxisLabelOptions(categoryAxisLabelOptions)
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

    public fun fieldWells(fieldWells: CfnDashboard.WaterfallChartFieldWellsProperty) {
        cdkBuilder.fieldWells(fieldWells)
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

    public fun primaryYAxisDisplayOptions(primaryYAxisDisplayOptions: CfnDashboard.AxisDisplayOptionsProperty) {
        cdkBuilder.primaryYAxisDisplayOptions(primaryYAxisDisplayOptions)
    }

    public fun primaryYAxisLabelOptions(primaryYAxisLabelOptions: IResolvable) {
        cdkBuilder.primaryYAxisLabelOptions(primaryYAxisLabelOptions)
    }

    public fun primaryYAxisLabelOptions(primaryYAxisLabelOptions: CfnDashboard.ChartAxisLabelOptionsProperty) {
        cdkBuilder.primaryYAxisLabelOptions(primaryYAxisLabelOptions)
    }

    public fun sortConfiguration(sortConfiguration: IResolvable) {
        cdkBuilder.sortConfiguration(sortConfiguration)
    }

    public fun sortConfiguration(sortConfiguration: CfnDashboard.WaterfallChartSortConfigurationProperty) {
        cdkBuilder.sortConfiguration(sortConfiguration)
    }

    public fun visualPalette(visualPalette: IResolvable) {
        cdkBuilder.visualPalette(visualPalette)
    }

    public fun visualPalette(visualPalette: CfnDashboard.VisualPaletteProperty) {
        cdkBuilder.visualPalette(visualPalette)
    }

    public fun waterfallChartOptions(waterfallChartOptions: IResolvable) {
        cdkBuilder.waterfallChartOptions(waterfallChartOptions)
    }

    public fun waterfallChartOptions(waterfallChartOptions: CfnDashboard.WaterfallChartOptionsProperty) {
        cdkBuilder.waterfallChartOptions(waterfallChartOptions)
    }

    public fun build(): CfnDashboard.WaterfallChartConfigurationProperty = cdkBuilder.build()
}
