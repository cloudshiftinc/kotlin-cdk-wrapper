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
public class CfnGlobalTableTimeToLiveSpecificationPropertyDsl {
    private val cdkBuilder: CfnGlobalTable.TimeToLiveSpecificationProperty.Builder =
        CfnGlobalTable.TimeToLiveSpecificationProperty.builder()

    public fun attributeName(attributeName: String) {
        cdkBuilder.attributeName(attributeName)
    }

    public fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
    }

    public fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled)
    }

    public fun build(): CfnGlobalTable.TimeToLiveSpecificationProperty = cdkBuilder.build()
}
