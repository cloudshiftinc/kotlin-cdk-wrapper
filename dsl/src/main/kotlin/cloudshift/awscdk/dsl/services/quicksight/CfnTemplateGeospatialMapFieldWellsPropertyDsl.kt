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
public class CfnTemplateGeospatialMapFieldWellsPropertyDsl {
    private val cdkBuilder: CfnTemplate.GeospatialMapFieldWellsProperty.Builder =
        CfnTemplate.GeospatialMapFieldWellsProperty.builder()

    public fun geospatialMapAggregatedFieldWells(geospatialMapAggregatedFieldWells: IResolvable) {
        cdkBuilder.geospatialMapAggregatedFieldWells(geospatialMapAggregatedFieldWells)
    }

    public fun geospatialMapAggregatedFieldWells(geospatialMapAggregatedFieldWells: CfnTemplate.GeospatialMapAggregatedFieldWellsProperty) {
        cdkBuilder.geospatialMapAggregatedFieldWells(geospatialMapAggregatedFieldWells)
    }

    public fun build(): CfnTemplate.GeospatialMapFieldWellsProperty = cdkBuilder.build()
}
