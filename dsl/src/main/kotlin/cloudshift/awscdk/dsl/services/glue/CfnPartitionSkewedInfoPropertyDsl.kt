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

package cloudshift.awscdk.dsl.services.glue

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import software.amazon.awscdk.services.glue.CfnPartition
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnPartitionSkewedInfoPropertyDsl {
    private val cdkBuilder: CfnPartition.SkewedInfoProperty.Builder =
        CfnPartition.SkewedInfoProperty.builder()

    private val _skewedColumnNames: MutableList<String> = mutableListOf()

    private val _skewedColumnValues: MutableList<String> = mutableListOf()

    public fun skewedColumnNames(vararg skewedColumnNames: String) {
        _skewedColumnNames.addAll(listOf(*skewedColumnNames))
    }

    public fun skewedColumnNames(skewedColumnNames: Collection<String>) {
        _skewedColumnNames.addAll(skewedColumnNames)
    }

    public fun skewedColumnValueLocationMaps(block: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(block)
        cdkBuilder.skewedColumnValueLocationMaps(builder.map)
    }

    public fun skewedColumnValueLocationMaps(skewedColumnValueLocationMaps: Any) {
        cdkBuilder.skewedColumnValueLocationMaps(skewedColumnValueLocationMaps)
    }

    public fun skewedColumnValues(vararg skewedColumnValues: String) {
        _skewedColumnValues.addAll(listOf(*skewedColumnValues))
    }

    public fun skewedColumnValues(skewedColumnValues: Collection<String>) {
        _skewedColumnValues.addAll(skewedColumnValues)
    }

    public fun build(): CfnPartition.SkewedInfoProperty {
        if (_skewedColumnNames.isNotEmpty()) cdkBuilder.skewedColumnNames(_skewedColumnNames)
        if (_skewedColumnValues.isNotEmpty()) cdkBuilder.skewedColumnValues(_skewedColumnValues)
        return cdkBuilder.build()
    }
}
