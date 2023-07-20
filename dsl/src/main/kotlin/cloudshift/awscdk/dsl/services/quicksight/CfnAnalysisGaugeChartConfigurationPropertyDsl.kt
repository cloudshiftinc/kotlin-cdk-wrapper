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

@CdkDslMarker
public class CfnAnalysisGaugeChartConfigurationPropertyDsl {
    private val cdkBuilder: CfnAnalysis.GaugeChartConfigurationProperty.Builder =
        CfnAnalysis.GaugeChartConfigurationProperty.builder()

    public fun dataLabels(dataLabels: IResolvable) {
        cdkBuilder.dataLabels(dataLabels)
    }

    public fun dataLabels(dataLabels: CfnAnalysis.DataLabelOptionsProperty) {
        cdkBuilder.dataLabels(dataLabels)
    }

    public fun fieldWells(fieldWells: IResolvable) {
        cdkBuilder.fieldWells(fieldWells)
    }

    public fun fieldWells(fieldWells: CfnAnalysis.GaugeChartFieldWellsProperty) {
        cdkBuilder.fieldWells(fieldWells)
    }

    public fun gaugeChartOptions(gaugeChartOptions: IResolvable) {
        cdkBuilder.gaugeChartOptions(gaugeChartOptions)
    }

    public fun gaugeChartOptions(gaugeChartOptions: CfnAnalysis.GaugeChartOptionsProperty) {
        cdkBuilder.gaugeChartOptions(gaugeChartOptions)
    }

    public fun tooltipOptions(tooltipOptions: IResolvable) {
        cdkBuilder.tooltipOptions(tooltipOptions)
    }

    public fun tooltipOptions(tooltipOptions: CfnAnalysis.TooltipOptionsProperty) {
        cdkBuilder.tooltipOptions(tooltipOptions)
    }

    public fun visualPalette(visualPalette: IResolvable) {
        cdkBuilder.visualPalette(visualPalette)
    }

    public fun visualPalette(visualPalette: CfnAnalysis.VisualPaletteProperty) {
        cdkBuilder.visualPalette(visualPalette)
    }

    public fun build(): CfnAnalysis.GaugeChartConfigurationProperty = cdkBuilder.build()
}
