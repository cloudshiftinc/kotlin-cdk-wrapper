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
public class CfnAnalysisHeatMapConfigurationPropertyDsl {
    private val cdkBuilder: CfnAnalysis.HeatMapConfigurationProperty.Builder =
        CfnAnalysis.HeatMapConfigurationProperty.builder()

    public fun colorScale(colorScale: IResolvable) {
        cdkBuilder.colorScale(colorScale)
    }

    public fun colorScale(colorScale: CfnAnalysis.ColorScaleProperty) {
        cdkBuilder.colorScale(colorScale)
    }

    public fun columnLabelOptions(columnLabelOptions: IResolvable) {
        cdkBuilder.columnLabelOptions(columnLabelOptions)
    }

    public fun columnLabelOptions(columnLabelOptions: CfnAnalysis.ChartAxisLabelOptionsProperty) {
        cdkBuilder.columnLabelOptions(columnLabelOptions)
    }

    public fun dataLabels(dataLabels: IResolvable) {
        cdkBuilder.dataLabels(dataLabels)
    }

    public fun dataLabels(dataLabels: CfnAnalysis.DataLabelOptionsProperty) {
        cdkBuilder.dataLabels(dataLabels)
    }

    public fun fieldWells(fieldWells: IResolvable) {
        cdkBuilder.fieldWells(fieldWells)
    }

    public fun fieldWells(fieldWells: CfnAnalysis.HeatMapFieldWellsProperty) {
        cdkBuilder.fieldWells(fieldWells)
    }

    public fun legend(legend: IResolvable) {
        cdkBuilder.legend(legend)
    }

    public fun legend(legend: CfnAnalysis.LegendOptionsProperty) {
        cdkBuilder.legend(legend)
    }

    public fun rowLabelOptions(rowLabelOptions: IResolvable) {
        cdkBuilder.rowLabelOptions(rowLabelOptions)
    }

    public fun rowLabelOptions(rowLabelOptions: CfnAnalysis.ChartAxisLabelOptionsProperty) {
        cdkBuilder.rowLabelOptions(rowLabelOptions)
    }

    public fun sortConfiguration(sortConfiguration: IResolvable) {
        cdkBuilder.sortConfiguration(sortConfiguration)
    }

    public fun sortConfiguration(sortConfiguration: CfnAnalysis.HeatMapSortConfigurationProperty) {
        cdkBuilder.sortConfiguration(sortConfiguration)
    }

    public fun tooltip(tooltip: IResolvable) {
        cdkBuilder.tooltip(tooltip)
    }

    public fun tooltip(tooltip: CfnAnalysis.TooltipOptionsProperty) {
        cdkBuilder.tooltip(tooltip)
    }

    public fun build(): CfnAnalysis.HeatMapConfigurationProperty = cdkBuilder.build()
}
