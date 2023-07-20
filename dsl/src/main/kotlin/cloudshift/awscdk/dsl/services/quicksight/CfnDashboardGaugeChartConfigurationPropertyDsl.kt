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
public class CfnDashboardGaugeChartConfigurationPropertyDsl {
    private val cdkBuilder: CfnDashboard.GaugeChartConfigurationProperty.Builder =
        CfnDashboard.GaugeChartConfigurationProperty.builder()

    public fun dataLabels(dataLabels: IResolvable) {
        cdkBuilder.dataLabels(dataLabels)
    }

    public fun dataLabels(dataLabels: CfnDashboard.DataLabelOptionsProperty) {
        cdkBuilder.dataLabels(dataLabels)
    }

    public fun fieldWells(fieldWells: IResolvable) {
        cdkBuilder.fieldWells(fieldWells)
    }

    public fun fieldWells(fieldWells: CfnDashboard.GaugeChartFieldWellsProperty) {
        cdkBuilder.fieldWells(fieldWells)
    }

    public fun gaugeChartOptions(gaugeChartOptions: IResolvable) {
        cdkBuilder.gaugeChartOptions(gaugeChartOptions)
    }

    public fun gaugeChartOptions(gaugeChartOptions: CfnDashboard.GaugeChartOptionsProperty) {
        cdkBuilder.gaugeChartOptions(gaugeChartOptions)
    }

    public fun tooltipOptions(tooltipOptions: IResolvable) {
        cdkBuilder.tooltipOptions(tooltipOptions)
    }

    public fun tooltipOptions(tooltipOptions: CfnDashboard.TooltipOptionsProperty) {
        cdkBuilder.tooltipOptions(tooltipOptions)
    }

    public fun visualPalette(visualPalette: IResolvable) {
        cdkBuilder.visualPalette(visualPalette)
    }

    public fun visualPalette(visualPalette: CfnDashboard.VisualPaletteProperty) {
        cdkBuilder.visualPalette(visualPalette)
    }

    public fun build(): CfnDashboard.GaugeChartConfigurationProperty = cdkBuilder.build()
}
