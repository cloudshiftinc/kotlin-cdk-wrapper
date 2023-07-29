@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package cloudshift.awscdk.dsl.services.appmesh

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.appmesh.CfnVirtualGateway

/**
 * An object that represents a local file certificate.
 *
 * The certificate must meet specific requirements and you must have proxy authorization enabled.
 * For more information, see
 * [Transport Layer Security (TLS)](https://docs.aws.amazon.com/app-mesh/latest/userguide/tls.html#virtual-node-tls-prerequisites)
 * .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appmesh.*;
 * VirtualGatewayListenerTlsFileCertificateProperty virtualGatewayListenerTlsFileCertificateProperty
 * = VirtualGatewayListenerTlsFileCertificateProperty.builder()
 * .certificateChain("certificateChain")
 * .privateKey("privateKey")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualgateway-virtualgatewaylistenertlsfilecertificate.html)
 */
@CdkDslMarker
public class CfnVirtualGatewayVirtualGatewayListenerTlsFileCertificatePropertyDsl {
    private val cdkBuilder:
        CfnVirtualGateway.VirtualGatewayListenerTlsFileCertificateProperty.Builder =
        CfnVirtualGateway.VirtualGatewayListenerTlsFileCertificateProperty.builder()

    /** @param certificateChain The certificate chain for the certificate. */
    public fun certificateChain(certificateChain: String) {
        cdkBuilder.certificateChain(certificateChain)
    }

    /**
     * @param privateKey The private key for a certificate stored on the file system of the mesh
     *   endpoint that the proxy is running on.
     */
    public fun privateKey(privateKey: String) {
        cdkBuilder.privateKey(privateKey)
    }

    public fun build(): CfnVirtualGateway.VirtualGatewayListenerTlsFileCertificateProperty =
        cdkBuilder.build()
}
