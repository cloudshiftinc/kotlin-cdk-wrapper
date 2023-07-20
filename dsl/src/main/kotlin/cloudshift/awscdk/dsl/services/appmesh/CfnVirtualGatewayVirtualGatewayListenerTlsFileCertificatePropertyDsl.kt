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
public class CfnVirtualGatewayVirtualGatewayListenerTlsFileCertificatePropertyDsl {
    private val cdkBuilder: CfnVirtualGateway.VirtualGatewayListenerTlsFileCertificateProperty.Builder =
        CfnVirtualGateway.VirtualGatewayListenerTlsFileCertificateProperty.builder()

    public fun certificateChain(certificateChain: String) {
        cdkBuilder.certificateChain(certificateChain)
    }

    public fun privateKey(privateKey: String) {
        cdkBuilder.privateKey(privateKey)
    }

    public fun build(): CfnVirtualGateway.VirtualGatewayListenerTlsFileCertificateProperty =
        cdkBuilder.build()
}
