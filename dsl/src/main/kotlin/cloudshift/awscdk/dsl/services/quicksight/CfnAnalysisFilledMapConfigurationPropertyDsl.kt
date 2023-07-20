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
public class CfnAnalysisFilledMapConfigurationPropertyDsl {
    private val cdkBuilder: CfnAnalysis.FilledMapConfigurationProperty.Builder =
        CfnAnalysis.FilledMapConfigurationProperty.builder()

    public fun fieldWells(fieldWells: IResolvable) {
        cdkBuilder.fieldWells(fieldWells)
    }

    public fun fieldWells(fieldWells: CfnAnalysis.FilledMapFieldWellsProperty) {
        cdkBuilder.fieldWells(fieldWells)
    }

    public fun legend(legend: IResolvable) {
        cdkBuilder.legend(legend)
    }

    public fun legend(legend: CfnAnalysis.LegendOptionsProperty) {
        cdkBuilder.legend(legend)
    }

    public fun mapStyleOptions(mapStyleOptions: IResolvable) {
        cdkBuilder.mapStyleOptions(mapStyleOptions)
    }

    public fun mapStyleOptions(mapStyleOptions: CfnAnalysis.GeospatialMapStyleOptionsProperty) {
        cdkBuilder.mapStyleOptions(mapStyleOptions)
    }

    public fun sortConfiguration(sortConfiguration: IResolvable) {
        cdkBuilder.sortConfiguration(sortConfiguration)
    }

    public fun sortConfiguration(sortConfiguration: CfnAnalysis.FilledMapSortConfigurationProperty) {
        cdkBuilder.sortConfiguration(sortConfiguration)
    }

    public fun tooltip(tooltip: IResolvable) {
        cdkBuilder.tooltip(tooltip)
    }

    public fun tooltip(tooltip: CfnAnalysis.TooltipOptionsProperty) {
        cdkBuilder.tooltip(tooltip)
    }

    public fun windowOptions(windowOptions: IResolvable) {
        cdkBuilder.windowOptions(windowOptions)
    }

    public fun windowOptions(windowOptions: CfnAnalysis.GeospatialWindowOptionsProperty) {
        cdkBuilder.windowOptions(windowOptions)
    }

    public fun build(): CfnAnalysis.FilledMapConfigurationProperty = cdkBuilder.build()
}
