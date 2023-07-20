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
import software.amazon.awscdk.services.glue.CfnPartition
import kotlin.Number
import kotlin.String

@CdkDslMarker
public class CfnPartitionOrderPropertyDsl {
    private val cdkBuilder: CfnPartition.OrderProperty.Builder = CfnPartition.OrderProperty.builder()

    public fun column(column: String) {
        cdkBuilder.column(column)
    }

    public fun sortOrder(sortOrder: Number) {
        cdkBuilder.sortOrder(sortOrder)
    }

    public fun build(): CfnPartition.OrderProperty = cdkBuilder.build()
}
