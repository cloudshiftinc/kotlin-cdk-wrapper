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
public class CfnVirtualGatewayVirtualGatewayListenerPropertyDsl {
    private val cdkBuilder: CfnVirtualGateway.VirtualGatewayListenerProperty.Builder =
        CfnVirtualGateway.VirtualGatewayListenerProperty.builder()

    public fun connectionPool(connectionPool: IResolvable) {
        cdkBuilder.connectionPool(connectionPool)
    }

    public fun connectionPool(connectionPool: CfnVirtualGateway.VirtualGatewayConnectionPoolProperty) {
        cdkBuilder.connectionPool(connectionPool)
    }

    public fun healthCheck(healthCheck: IResolvable) {
        cdkBuilder.healthCheck(healthCheck)
    }

    public fun healthCheck(healthCheck: CfnVirtualGateway.VirtualGatewayHealthCheckPolicyProperty) {
        cdkBuilder.healthCheck(healthCheck)
    }

    public fun portMapping(portMapping: IResolvable) {
        cdkBuilder.portMapping(portMapping)
    }

    public fun portMapping(portMapping: CfnVirtualGateway.VirtualGatewayPortMappingProperty) {
        cdkBuilder.portMapping(portMapping)
    }

    public fun tls(tls: IResolvable) {
        cdkBuilder.tls(tls)
    }

    public fun tls(tls: CfnVirtualGateway.VirtualGatewayListenerTlsProperty) {
        cdkBuilder.tls(tls)
    }

    public fun build(): CfnVirtualGateway.VirtualGatewayListenerProperty = cdkBuilder.build()
}
