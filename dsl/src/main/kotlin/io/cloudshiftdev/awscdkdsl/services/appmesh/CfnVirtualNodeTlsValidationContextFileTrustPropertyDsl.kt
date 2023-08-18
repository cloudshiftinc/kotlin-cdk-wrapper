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

package io.cloudshiftdev.awscdkdsl.services.appmesh

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.appmesh.CfnVirtualNode

/**
 * An object that represents a Transport Layer Security (TLS) validation context trust for a local
 * file.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appmesh.*;
 * TlsValidationContextFileTrustProperty tlsValidationContextFileTrustProperty =
 * TlsValidationContextFileTrustProperty.builder()
 * .certificateChain("certificateChain")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-tlsvalidationcontextfiletrust.html)
 */
@CdkDslMarker
public class CfnVirtualNodeTlsValidationContextFileTrustPropertyDsl {
    private val cdkBuilder: CfnVirtualNode.TlsValidationContextFileTrustProperty.Builder =
        CfnVirtualNode.TlsValidationContextFileTrustProperty.builder()

    /**
     * @param certificateChain The certificate trust chain for a certificate stored on the file
     *   system of the virtual node that the proxy is running on.
     */
    public fun certificateChain(certificateChain: String) {
        cdkBuilder.certificateChain(certificateChain)
    }

    public fun build(): CfnVirtualNode.TlsValidationContextFileTrustProperty = cdkBuilder.build()
}
