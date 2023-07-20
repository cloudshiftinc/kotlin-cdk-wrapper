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

package cloudshift.awscdk.dsl.services.groundstation

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.groundstation.CfnDataflowEndpointGroup
import kotlin.Number
import kotlin.String

@CdkDslMarker
public class CfnDataflowEndpointGroupSocketAddressPropertyDsl {
    private val cdkBuilder: CfnDataflowEndpointGroup.SocketAddressProperty.Builder =
        CfnDataflowEndpointGroup.SocketAddressProperty.builder()

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun port(port: Number) {
        cdkBuilder.port(port)
    }

    public fun build(): CfnDataflowEndpointGroup.SocketAddressProperty = cdkBuilder.build()
}
