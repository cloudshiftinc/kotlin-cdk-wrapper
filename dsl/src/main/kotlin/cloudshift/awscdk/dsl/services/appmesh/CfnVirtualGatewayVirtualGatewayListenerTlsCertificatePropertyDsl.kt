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
public class CfnVirtualGatewayVirtualGatewayListenerTlsCertificatePropertyDsl {
    private val cdkBuilder: CfnVirtualGateway.VirtualGatewayListenerTlsCertificateProperty.Builder =
        CfnVirtualGateway.VirtualGatewayListenerTlsCertificateProperty.builder()

    public fun acm(acm: IResolvable) {
        cdkBuilder.acm(acm)
    }

    public fun acm(acm: CfnVirtualGateway.VirtualGatewayListenerTlsAcmCertificateProperty) {
        cdkBuilder.acm(acm)
    }

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

    public fun build(): CfnVirtualGateway.VirtualGatewayListenerTlsCertificateProperty =
        cdkBuilder.build()
}
