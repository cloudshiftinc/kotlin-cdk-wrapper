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
public class CfnDashboardFunnelChartConfigurationPropertyDsl {
    private val cdkBuilder: CfnDashboard.FunnelChartConfigurationProperty.Builder =
        CfnDashboard.FunnelChartConfigurationProperty.builder()

    public fun categoryLabelOptions(categoryLabelOptions: IResolvable) {
        cdkBuilder.categoryLabelOptions(categoryLabelOptions)
    }

    public fun categoryLabelOptions(categoryLabelOptions: CfnDashboard.ChartAxisLabelOptionsProperty) {
        cdkBuilder.categoryLabelOptions(categoryLabelOptions)
    }

    public fun dataLabelOptions(dataLabelOptions: IResolvable) {
        cdkBuilder.dataLabelOptions(dataLabelOptions)
    }

    public fun dataLabelOptions(dataLabelOptions: CfnDashboard.FunnelChartDataLabelOptionsProperty) {
        cdkBuilder.dataLabelOptions(dataLabelOptions)
    }

    public fun fieldWells(fieldWells: IResolvable) {
        cdkBuilder.fieldWells(fieldWells)
    }

    public fun fieldWells(fieldWells: CfnDashboard.FunnelChartFieldWellsProperty) {
        cdkBuilder.fieldWells(fieldWells)
    }

    public fun sortConfiguration(sortConfiguration: IResolvable) {
        cdkBuilder.sortConfiguration(sortConfiguration)
    }

    public fun sortConfiguration(sortConfiguration: CfnDashboard.FunnelChartSortConfigurationProperty) {
        cdkBuilder.sortConfiguration(sortConfiguration)
    }

    public fun tooltip(tooltip: IResolvable) {
        cdkBuilder.tooltip(tooltip)
    }

    public fun tooltip(tooltip: CfnDashboard.TooltipOptionsProperty) {
        cdkBuilder.tooltip(tooltip)
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

    public fun build(): CfnDashboard.FunnelChartConfigurationProperty = cdkBuilder.build()
}
