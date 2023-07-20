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
public class CfnTemplateGeospatialMapConfigurationPropertyDsl {
    private val cdkBuilder: CfnTemplate.GeospatialMapConfigurationProperty.Builder =
        CfnTemplate.GeospatialMapConfigurationProperty.builder()

    public fun fieldWells(fieldWells: IResolvable) {
        cdkBuilder.fieldWells(fieldWells)
    }

    public fun fieldWells(fieldWells: CfnTemplate.GeospatialMapFieldWellsProperty) {
        cdkBuilder.fieldWells(fieldWells)
    }

    public fun legend(legend: IResolvable) {
        cdkBuilder.legend(legend)
    }

    public fun legend(legend: CfnTemplate.LegendOptionsProperty) {
        cdkBuilder.legend(legend)
    }

    public fun mapStyleOptions(mapStyleOptions: IResolvable) {
        cdkBuilder.mapStyleOptions(mapStyleOptions)
    }

    public fun mapStyleOptions(mapStyleOptions: CfnTemplate.GeospatialMapStyleOptionsProperty) {
        cdkBuilder.mapStyleOptions(mapStyleOptions)
    }

    public fun pointStyleOptions(pointStyleOptions: IResolvable) {
        cdkBuilder.pointStyleOptions(pointStyleOptions)
    }

    public fun pointStyleOptions(pointStyleOptions: CfnTemplate.GeospatialPointStyleOptionsProperty) {
        cdkBuilder.pointStyleOptions(pointStyleOptions)
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

    public fun windowOptions(windowOptions: IResolvable) {
        cdkBuilder.windowOptions(windowOptions)
    }

    public fun windowOptions(windowOptions: CfnTemplate.GeospatialWindowOptionsProperty) {
        cdkBuilder.windowOptions(windowOptions)
    }

    public fun build(): CfnTemplate.GeospatialMapConfigurationProperty = cdkBuilder.build()
}
