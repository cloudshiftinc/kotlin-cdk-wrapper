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
public class CfnVirtualGatewayVirtualGatewayTlsValidationContextFileTrustPropertyDsl {
    private val cdkBuilder:
        CfnVirtualGateway.VirtualGatewayTlsValidationContextFileTrustProperty.Builder =
        CfnVirtualGateway.VirtualGatewayTlsValidationContextFileTrustProperty.builder()

    public fun certificateChain(certificateChain: String) {
        cdkBuilder.certificateChain(certificateChain)
    }

    public fun build(): CfnVirtualGateway.VirtualGatewayTlsValidationContextFileTrustProperty =
        cdkBuilder.build()
}
