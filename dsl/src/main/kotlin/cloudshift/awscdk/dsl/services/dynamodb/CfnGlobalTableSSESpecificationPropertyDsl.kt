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

package cloudshift.awscdk.dsl.services.dynamodb

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.dynamodb.CfnGlobalTable
import kotlin.Boolean
import kotlin.String

@CdkDslMarker
public class CfnGlobalTableSSESpecificationPropertyDsl {
    private val cdkBuilder: CfnGlobalTable.SSESpecificationProperty.Builder =
        CfnGlobalTable.SSESpecificationProperty.builder()

    public fun sseEnabled(sseEnabled: Boolean) {
        cdkBuilder.sseEnabled(sseEnabled)
    }

    public fun sseEnabled(sseEnabled: IResolvable) {
        cdkBuilder.sseEnabled(sseEnabled)
    }

    public fun sseType(sseType: String) {
        cdkBuilder.sseType(sseType)
    }

    public fun build(): CfnGlobalTable.SSESpecificationProperty = cdkBuilder.build()
}
