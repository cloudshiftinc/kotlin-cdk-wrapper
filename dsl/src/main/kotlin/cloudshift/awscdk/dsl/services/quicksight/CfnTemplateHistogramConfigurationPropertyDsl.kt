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
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplateHistogramConfigurationPropertyDsl {
    private val cdkBuilder: CfnTemplate.HistogramConfigurationProperty.Builder =
        CfnTemplate.HistogramConfigurationProperty.builder()

    public fun binOptions(binOptions: IResolvable) {
        cdkBuilder.binOptions(binOptions)
    }

    public fun binOptions(binOptions: CfnTemplate.HistogramBinOptionsProperty) {
        cdkBuilder.binOptions(binOptions)
    }

    public fun dataLabels(dataLabels: IResolvable) {
        cdkBuilder.dataLabels(dataLabels)
    }

    public fun dataLabels(dataLabels: CfnTemplate.DataLabelOptionsProperty) {
        cdkBuilder.dataLabels(dataLabels)
    }

    public fun fieldWells(fieldWells: IResolvable) {
        cdkBuilder.fieldWells(fieldWells)
    }

    public fun fieldWells(fieldWells: CfnTemplate.HistogramFieldWellsProperty) {
        cdkBuilder.fieldWells(fieldWells)
    }

    public fun tooltip(tooltip: IResolvable) {
        cdkBuilder.tooltip(tooltip)
    }

    public fun tooltip(tooltip: CfnTemplate.TooltipOptionsProperty) {
        cdkBuilder.tooltip(tooltip)
    }

    public fun visualPalette(visualPalette: IResolvable) {
        cdkBuilder.visualPalette(visualPalette)
    }

    public fun visualPalette(visualPalette: CfnTemplate.VisualPaletteProperty) {
        cdkBuilder.visualPalette(visualPalette)
    }

    public fun xAxisDisplayOptions(xAxisDisplayOptions: IResolvable) {
        cdkBuilder.xAxisDisplayOptions(xAxisDisplayOptions)
    }

    public fun xAxisDisplayOptions(xAxisDisplayOptions: CfnTemplate.AxisDisplayOptionsProperty) {
        cdkBuilder.xAxisDisplayOptions(xAxisDisplayOptions)
    }

    public fun xAxisLabelOptions(xAxisLabelOptions: IResolvable) {
        cdkBuilder.xAxisLabelOptions(xAxisLabelOptions)
    }

    public fun xAxisLabelOptions(xAxisLabelOptions: CfnTemplate.ChartAxisLabelOptionsProperty) {
        cdkBuilder.xAxisLabelOptions(xAxisLabelOptions)
    }

    public fun yAxisDisplayOptions(yAxisDisplayOptions: IResolvable) {
        cdkBuilder.yAxisDisplayOptions(yAxisDisplayOptions)
    }

    public fun yAxisDisplayOptions(yAxisDisplayOptions: CfnTemplate.AxisDisplayOptionsProperty) {
        cdkBuilder.yAxisDisplayOptions(yAxisDisplayOptions)
    }

    public fun build(): CfnTemplate.HistogramConfigurationProperty = cdkBuilder.build()
}
