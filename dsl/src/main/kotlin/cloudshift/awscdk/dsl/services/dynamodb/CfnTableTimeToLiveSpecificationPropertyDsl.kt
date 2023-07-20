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
import software.amazon.awscdk.services.dynamodb.CfnTable
import kotlin.Boolean
import kotlin.String

@CdkDslMarker
public class CfnTableTimeToLiveSpecificationPropertyDsl {
    private val cdkBuilder: CfnTable.TimeToLiveSpecificationProperty.Builder =
        CfnTable.TimeToLiveSpecificationProperty.builder()

    public fun attributeName(attributeName: String) {
        cdkBuilder.attributeName(attributeName)
    }

    public fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
    }

    public fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled)
    }

    public fun build(): CfnTable.TimeToLiveSpecificationProperty = cdkBuilder.build()
}
