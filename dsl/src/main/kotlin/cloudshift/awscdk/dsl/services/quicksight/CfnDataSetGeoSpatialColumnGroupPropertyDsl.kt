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
import software.amazon.awscdk.services.quicksight.CfnDataSet
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnDataSetGeoSpatialColumnGroupPropertyDsl {
    private val cdkBuilder: CfnDataSet.GeoSpatialColumnGroupProperty.Builder =
        CfnDataSet.GeoSpatialColumnGroupProperty.builder()

    private val _columns: MutableList<String> = mutableListOf()

    public fun columns(vararg columns: String) {
        _columns.addAll(listOf(*columns))
    }

    public fun columns(columns: Collection<String>) {
        _columns.addAll(columns)
    }

    public fun countryCode(countryCode: String) {
        cdkBuilder.countryCode(countryCode)
    }

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun build(): CfnDataSet.GeoSpatialColumnGroupProperty {
        if (_columns.isNotEmpty()) cdkBuilder.columns(_columns)
        return cdkBuilder.build()
    }
}
