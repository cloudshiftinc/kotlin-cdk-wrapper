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
public class CfnAnalysisFunnelChartConfigurationPropertyDsl {
    private val cdkBuilder: CfnAnalysis.FunnelChartConfigurationProperty.Builder =
        CfnAnalysis.FunnelChartConfigurationProperty.builder()

    public fun categoryLabelOptions(categoryLabelOptions: IResolvable) {
        cdkBuilder.categoryLabelOptions(categoryLabelOptions)
    }

    public fun categoryLabelOptions(categoryLabelOptions: CfnAnalysis.ChartAxisLabelOptionsProperty) {
        cdkBuilder.categoryLabelOptions(categoryLabelOptions)
    }

    public fun dataLabelOptions(dataLabelOptions: IResolvable) {
        cdkBuilder.dataLabelOptions(dataLabelOptions)
    }

    public fun dataLabelOptions(dataLabelOptions: CfnAnalysis.FunnelChartDataLabelOptionsProperty) {
        cdkBuilder.dataLabelOptions(dataLabelOptions)
    }

    public fun fieldWells(fieldWells: IResolvable) {
        cdkBuilder.fieldWells(fieldWells)
    }

    public fun fieldWells(fieldWells: CfnAnalysis.FunnelChartFieldWellsProperty) {
        cdkBuilder.fieldWells(fieldWells)
    }

    public fun sortConfiguration(sortConfiguration: IResolvable) {
        cdkBuilder.sortConfiguration(sortConfiguration)
    }

    public fun sortConfiguration(sortConfiguration: CfnAnalysis.FunnelChartSortConfigurationProperty) {
        cdkBuilder.sortConfiguration(sortConfiguration)
    }

    public fun tooltip(tooltip: IResolvable) {
        cdkBuilder.tooltip(tooltip)
    }

    public fun tooltip(tooltip: CfnAnalysis.TooltipOptionsProperty) {
        cdkBuilder.tooltip(tooltip)
    }

    public fun valueLabelOptions(valueLabelOptions: IResolvable) {
        cdkBuilder.valueLabelOptions(valueLabelOptions)
    }

    public fun valueLabelOptions(valueLabelOptions: CfnAnalysis.ChartAxisLabelOptionsProperty) {
        cdkBuilder.valueLabelOptions(valueLabelOptions)
    }

    public fun visualPalette(visualPalette: IResolvable) {
        cdkBuilder.visualPalette(visualPalette)
    }

    public fun visualPalette(visualPalette: CfnAnalysis.VisualPaletteProperty) {
        cdkBuilder.visualPalette(visualPalette)
    }

    public fun build(): CfnAnalysis.FunnelChartConfigurationProperty = cdkBuilder.build()
}
