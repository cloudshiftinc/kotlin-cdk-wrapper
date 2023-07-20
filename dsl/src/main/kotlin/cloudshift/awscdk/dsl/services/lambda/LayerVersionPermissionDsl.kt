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

package cloudshift.awscdk.dsl.services.lambda

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.lambda.LayerVersionPermission
import kotlin.String

@CdkDslMarker
public class LayerVersionPermissionDsl {
    private val cdkBuilder: LayerVersionPermission.Builder = LayerVersionPermission.builder()

    public fun accountId(accountId: String) {
        cdkBuilder.accountId(accountId)
    }

    public fun organizationId(organizationId: String) {
        cdkBuilder.organizationId(organizationId)
    }

    public fun build(): LayerVersionPermission = cdkBuilder.build()
}
