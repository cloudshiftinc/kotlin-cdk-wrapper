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
public class CfnDashboardTreeMapConfigurationPropertyDsl {
    private val cdkBuilder: CfnDashboard.TreeMapConfigurationProperty.Builder =
        CfnDashboard.TreeMapConfigurationProperty.builder()

    public fun colorLabelOptions(colorLabelOptions: IResolvable) {
        cdkBuilder.colorLabelOptions(colorLabelOptions)
    }

    public fun colorLabelOptions(colorLabelOptions: CfnDashboard.ChartAxisLabelOptionsProperty) {
        cdkBuilder.colorLabelOptions(colorLabelOptions)
    }

    public fun colorScale(colorScale: IResolvable) {
        cdkBuilder.colorScale(colorScale)
    }

    public fun colorScale(colorScale: CfnDashboard.ColorScaleProperty) {
        cdkBuilder.colorScale(colorScale)
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

    public fun fieldWells(fieldWells: CfnDashboard.TreeMapFieldWellsProperty) {
        cdkBuilder.fieldWells(fieldWells)
    }

    public fun groupLabelOptions(groupLabelOptions: IResolvable) {
        cdkBuilder.groupLabelOptions(groupLabelOptions)
    }

    public fun groupLabelOptions(groupLabelOptions: CfnDashboard.ChartAxisLabelOptionsProperty) {
        cdkBuilder.groupLabelOptions(groupLabelOptions)
    }

    public fun legend(legend: IResolvable) {
        cdkBuilder.legend(legend)
    }

    public fun legend(legend: CfnDashboard.LegendOptionsProperty) {
        cdkBuilder.legend(legend)
    }

    public fun sizeLabelOptions(sizeLabelOptions: IResolvable) {
        cdkBuilder.sizeLabelOptions(sizeLabelOptions)
    }

    public fun sizeLabelOptions(sizeLabelOptions: CfnDashboard.ChartAxisLabelOptionsProperty) {
        cdkBuilder.sizeLabelOptions(sizeLabelOptions)
    }

    public fun sortConfiguration(sortConfiguration: IResolvable) {
        cdkBuilder.sortConfiguration(sortConfiguration)
    }

    public fun sortConfiguration(sortConfiguration: CfnDashboard.TreeMapSortConfigurationProperty) {
        cdkBuilder.sortConfiguration(sortConfiguration)
    }

    public fun tooltip(tooltip: IResolvable) {
        cdkBuilder.tooltip(tooltip)
    }

    public fun tooltip(tooltip: CfnDashboard.TooltipOptionsProperty) {
        cdkBuilder.tooltip(tooltip)
    }

    public fun build(): CfnDashboard.TreeMapConfigurationProperty = cdkBuilder.build()
}
