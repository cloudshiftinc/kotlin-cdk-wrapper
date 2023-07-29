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
 * An object that represents a Transport Layer Security (TLS) validation context trust for a local
 * file.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appmesh.*;
 * VirtualGatewayTlsValidationContextFileTrustProperty
 * virtualGatewayTlsValidationContextFileTrustProperty =
 * VirtualGatewayTlsValidationContextFileTrustProperty.builder()
 * .certificateChain("certificateChain")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualgateway-virtualgatewaytlsvalidationcontextfiletrust.html)
 */
@CdkDslMarker
public class CfnVirtualGatewayVirtualGatewayTlsValidationContextFileTrustPropertyDsl {
    private val cdkBuilder:
        CfnVirtualGateway.VirtualGatewayTlsValidationContextFileTrustProperty.Builder =
        CfnVirtualGateway.VirtualGatewayTlsValidationContextFileTrustProperty.builder()

    /**
     * @param certificateChain The certificate trust chain for a certificate stored on the file
     *   system of the virtual node that the proxy is running on.
     */
    public fun certificateChain(certificateChain: String) {
        cdkBuilder.certificateChain(certificateChain)
    }

    public fun build(): CfnVirtualGateway.VirtualGatewayTlsValidationContextFileTrustProperty =
        cdkBuilder.build()
}
