@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.quicksight

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

/**
 * The configuration of a `GeospatialMapVisual` .
 *
 * Example:
 * ```
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dashboard-geospatialmapconfiguration.html)
 */
@CdkDslMarker
public class CfnDashboardGeospatialMapConfigurationPropertyDsl {
    private val cdkBuilder: CfnDashboard.GeospatialMapConfigurationProperty.Builder =
        CfnDashboard.GeospatialMapConfigurationProperty.builder()

    /** @param fieldWells The field wells of the visual. */
    public fun fieldWells(fieldWells: IResolvable) {
        cdkBuilder.fieldWells(fieldWells)
    }

    /** @param fieldWells The field wells of the visual. */
    public fun fieldWells(fieldWells: CfnDashboard.GeospatialMapFieldWellsProperty) {
        cdkBuilder.fieldWells(fieldWells)
    }

    /** @param legend The legend display setup of the visual. */
    public fun legend(legend: IResolvable) {
        cdkBuilder.legend(legend)
    }

    /** @param legend The legend display setup of the visual. */
    public fun legend(legend: CfnDashboard.LegendOptionsProperty) {
        cdkBuilder.legend(legend)
    }

    /** @param mapStyleOptions The map style options of the geospatial map. */
    public fun mapStyleOptions(mapStyleOptions: IResolvable) {
        cdkBuilder.mapStyleOptions(mapStyleOptions)
    }

    /** @param mapStyleOptions The map style options of the geospatial map. */
    public fun mapStyleOptions(mapStyleOptions: CfnDashboard.GeospatialMapStyleOptionsProperty) {
        cdkBuilder.mapStyleOptions(mapStyleOptions)
    }

    /** @param pointStyleOptions The point style options of the geospatial map. */
    public fun pointStyleOptions(pointStyleOptions: IResolvable) {
        cdkBuilder.pointStyleOptions(pointStyleOptions)
    }

    /** @param pointStyleOptions The point style options of the geospatial map. */
    public fun pointStyleOptions(
        pointStyleOptions: CfnDashboard.GeospatialPointStyleOptionsProperty
    ) {
        cdkBuilder.pointStyleOptions(pointStyleOptions)
    }

    /** @param tooltip The tooltip display setup of the visual. */
    public fun tooltip(tooltip: IResolvable) {
        cdkBuilder.tooltip(tooltip)
    }

    /** @param tooltip The tooltip display setup of the visual. */
    public fun tooltip(tooltip: CfnDashboard.TooltipOptionsProperty) {
        cdkBuilder.tooltip(tooltip)
    }

    /** @param visualPalette the value to be set. */
    public fun visualPalette(visualPalette: IResolvable) {
        cdkBuilder.visualPalette(visualPalette)
    }

    /** @param visualPalette the value to be set. */
    public fun visualPalette(visualPalette: CfnDashboard.VisualPaletteProperty) {
        cdkBuilder.visualPalette(visualPalette)
    }

    /** @param windowOptions The window options of the geospatial map. */
    public fun windowOptions(windowOptions: IResolvable) {
        cdkBuilder.windowOptions(windowOptions)
    }

    /** @param windowOptions The window options of the geospatial map. */
    public fun windowOptions(windowOptions: CfnDashboard.GeospatialWindowOptionsProperty) {
        cdkBuilder.windowOptions(windowOptions)
    }

    public fun build(): CfnDashboard.GeospatialMapConfigurationProperty = cdkBuilder.build()
}
