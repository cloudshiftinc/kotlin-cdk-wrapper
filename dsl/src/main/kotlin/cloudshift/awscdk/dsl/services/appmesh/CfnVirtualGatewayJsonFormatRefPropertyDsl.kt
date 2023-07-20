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

package cloudshift.awscdk.dsl.services.appmesh

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.appmesh.CfnVirtualGateway
import kotlin.String

@CdkDslMarker
public class CfnVirtualGatewayJsonFormatRefPropertyDsl {
    private val cdkBuilder: CfnVirtualGateway.JsonFormatRefProperty.Builder =
        CfnVirtualGateway.JsonFormatRefProperty.builder()

    public fun key(key: String) {
        cdkBuilder.key(key)
    }

    public fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
    }

    public fun build(): CfnVirtualGateway.JsonFormatRefProperty = cdkBuilder.build()
}
