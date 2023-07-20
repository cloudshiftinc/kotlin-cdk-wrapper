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
import software.amazon.awscdk.services.quicksight.CfnDataSet

@CdkDslMarker
public class CfnDataSetColumnGroupPropertyDsl {
    private val cdkBuilder: CfnDataSet.ColumnGroupProperty.Builder =
        CfnDataSet.ColumnGroupProperty.builder()

    public fun geoSpatialColumnGroup(geoSpatialColumnGroup: IResolvable) {
        cdkBuilder.geoSpatialColumnGroup(geoSpatialColumnGroup)
    }

    public fun geoSpatialColumnGroup(geoSpatialColumnGroup: CfnDataSet.GeoSpatialColumnGroupProperty) {
        cdkBuilder.geoSpatialColumnGroup(geoSpatialColumnGroup)
    }

    public fun build(): CfnDataSet.ColumnGroupProperty = cdkBuilder.build()
}
