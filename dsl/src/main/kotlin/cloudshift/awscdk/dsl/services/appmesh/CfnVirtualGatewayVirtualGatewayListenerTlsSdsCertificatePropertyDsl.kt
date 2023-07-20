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
public class CfnVirtualGatewayVirtualGatewayListenerTlsSdsCertificatePropertyDsl {
    private val cdkBuilder: CfnVirtualGateway.VirtualGatewayListenerTlsSdsCertificateProperty.Builder =
        CfnVirtualGateway.VirtualGatewayListenerTlsSdsCertificateProperty.builder()

    public fun secretName(secretName: String) {
        cdkBuilder.secretName(secretName)
    }

    public fun build(): CfnVirtualGateway.VirtualGatewayListenerTlsSdsCertificateProperty =
        cdkBuilder.build()
}
