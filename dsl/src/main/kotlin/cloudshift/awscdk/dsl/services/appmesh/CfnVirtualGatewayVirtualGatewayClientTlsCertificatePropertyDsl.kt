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
public class CfnVirtualGatewayVirtualGatewayClientTlsCertificatePropertyDsl {
    private val cdkBuilder: CfnVirtualGateway.VirtualGatewayClientTlsCertificateProperty.Builder =
        CfnVirtualGateway.VirtualGatewayClientTlsCertificateProperty.builder()

    public fun `file`(`file`: IResolvable) {
        cdkBuilder.`file`(`file`)
    }

    public fun `file`(`file`: CfnVirtualGateway.VirtualGatewayListenerTlsFileCertificateProperty) {
        cdkBuilder.`file`(`file`)
    }

    public fun sds(sds: IResolvable) {
        cdkBuilder.sds(sds)
    }

    public fun sds(sds: CfnVirtualGateway.VirtualGatewayListenerTlsSdsCertificateProperty) {
        cdkBuilder.sds(sds)
    }

    public fun build(): CfnVirtualGateway.VirtualGatewayClientTlsCertificateProperty =
        cdkBuilder.build()
}
