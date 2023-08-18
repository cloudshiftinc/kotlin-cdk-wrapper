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
import software.amazon.awscdk.services.quicksight.CfnTemplate

/**
 * The field wells of a `GeospatialMapVisual` .
 *
 * This is a union type structure. For this structure to be valid, only one of the attributes can be
 * defined.
 *
 * Example:
 * ```
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-template-geospatialmapfieldwells.html)
 */
@CdkDslMarker
public class CfnTemplateGeospatialMapFieldWellsPropertyDsl {
    private val cdkBuilder: CfnTemplate.GeospatialMapFieldWellsProperty.Builder =
        CfnTemplate.GeospatialMapFieldWellsProperty.builder()

    /** @param geospatialMapAggregatedFieldWells The aggregated field well for a geospatial map. */
    public fun geospatialMapAggregatedFieldWells(geospatialMapAggregatedFieldWells: IResolvable) {
        cdkBuilder.geospatialMapAggregatedFieldWells(geospatialMapAggregatedFieldWells)
    }

    /** @param geospatialMapAggregatedFieldWells The aggregated field well for a geospatial map. */
    public fun geospatialMapAggregatedFieldWells(
        geospatialMapAggregatedFieldWells: CfnTemplate.GeospatialMapAggregatedFieldWellsProperty
    ) {
        cdkBuilder.geospatialMapAggregatedFieldWells(geospatialMapAggregatedFieldWells)
    }

    public fun build(): CfnTemplate.GeospatialMapFieldWellsProperty = cdkBuilder.build()
}
