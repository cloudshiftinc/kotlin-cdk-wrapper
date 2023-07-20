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

package cloudshift.awscdk.dsl.services.lakeformation

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import software.amazon.awscdk.services.lakeformation.CfnDataCellsFilter
import kotlin.Any
import kotlin.String
import kotlin.Unit

@CdkDslMarker
public class CfnDataCellsFilterRowFilterPropertyDsl {
    private val cdkBuilder: CfnDataCellsFilter.RowFilterProperty.Builder =
        CfnDataCellsFilter.RowFilterProperty.builder()

    public fun allRowsWildcard(block: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(block)
        cdkBuilder.allRowsWildcard(builder.map)
    }

    public fun allRowsWildcard(allRowsWildcard: Any) {
        cdkBuilder.allRowsWildcard(allRowsWildcard)
    }

    public fun filterExpression(filterExpression: String) {
        cdkBuilder.filterExpression(filterExpression)
    }

    public fun build(): CfnDataCellsFilter.RowFilterProperty = cdkBuilder.build()
}
