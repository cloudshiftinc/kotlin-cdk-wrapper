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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appmesh.CfnVirtualGateway

@CdkDslMarker
public class CfnVirtualGatewayVirtualGatewayBackendDefaultsPropertyDsl {
    private val cdkBuilder: CfnVirtualGateway.VirtualGatewayBackendDefaultsProperty.Builder =
        CfnVirtualGateway.VirtualGatewayBackendDefaultsProperty.builder()

    public fun clientPolicy(clientPolicy: IResolvable) {
        cdkBuilder.clientPolicy(clientPolicy)
    }

    public fun clientPolicy(clientPolicy: CfnVirtualGateway.VirtualGatewayClientPolicyProperty) {
        cdkBuilder.clientPolicy(clientPolicy)
    }

    public fun build(): CfnVirtualGateway.VirtualGatewayBackendDefaultsProperty = cdkBuilder.build()
}
