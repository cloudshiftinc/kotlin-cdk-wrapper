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
import software.amazon.awscdk.services.glue.CfnTable
import kotlin.Number
import kotlin.String

@CdkDslMarker
public class CfnTableOrderPropertyDsl {
    private val cdkBuilder: CfnTable.OrderProperty.Builder = CfnTable.OrderProperty.builder()

    public fun column(column: String) {
        cdkBuilder.column(column)
    }

    public fun sortOrder(sortOrder: Number) {
        cdkBuilder.sortOrder(sortOrder)
    }

    public fun build(): CfnTable.OrderProperty = cdkBuilder.build()
}
