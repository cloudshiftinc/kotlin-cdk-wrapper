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
public class CfnAnalysisGeospatialMapConfigurationPropertyDsl {
    private val cdkBuilder: CfnAnalysis.GeospatialMapConfigurationProperty.Builder =
        CfnAnalysis.GeospatialMapConfigurationProperty.builder()

    public fun fieldWells(fieldWells: IResolvable) {
        cdkBuilder.fieldWells(fieldWells)
    }

    public fun fieldWells(fieldWells: CfnAnalysis.GeospatialMapFieldWellsProperty) {
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

    public fun pointStyleOptions(pointStyleOptions: IResolvable) {
        cdkBuilder.pointStyleOptions(pointStyleOptions)
    }

    public fun pointStyleOptions(pointStyleOptions: CfnAnalysis.GeospatialPointStyleOptionsProperty) {
        cdkBuilder.pointStyleOptions(pointStyleOptions)
    }

    public fun tooltip(tooltip: IResolvable) {
        cdkBuilder.tooltip(tooltip)
    }

    public fun tooltip(tooltip: CfnAnalysis.TooltipOptionsProperty) {
        cdkBuilder.tooltip(tooltip)
    }

    public fun visualPalette(visualPalette: IResolvable) {
        cdkBuilder.visualPalette(visualPalette)
    }

    public fun visualPalette(visualPalette: CfnAnalysis.VisualPaletteProperty) {
        cdkBuilder.visualPalette(visualPalette)
    }

    public fun windowOptions(windowOptions: IResolvable) {
        cdkBuilder.windowOptions(windowOptions)
    }

    public fun windowOptions(windowOptions: CfnAnalysis.GeospatialWindowOptionsProperty) {
        cdkBuilder.windowOptions(windowOptions)
    }

    public fun build(): CfnAnalysis.GeospatialMapConfigurationProperty = cdkBuilder.build()
}
