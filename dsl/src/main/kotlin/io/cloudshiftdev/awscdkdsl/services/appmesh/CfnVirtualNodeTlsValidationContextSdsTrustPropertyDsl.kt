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
 * An object that represents a Transport Layer Security (TLS) Secret Discovery Service validation
 * context trust.
 *
 * The proxy must be configured with a local SDS provider via a Unix Domain Socket. See App Mesh
 * [TLS documentation](https://docs.aws.amazon.com/app-mesh/latest/userguide/tls.html) for more
 * info.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appmesh.*;
 * TlsValidationContextSdsTrustProperty tlsValidationContextSdsTrustProperty =
 * TlsValidationContextSdsTrustProperty.builder()
 * .secretName("secretName")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-tlsvalidationcontextsdstrust.html)
 */
@CdkDslMarker
public class CfnVirtualNodeTlsValidationContextSdsTrustPropertyDsl {
    private val cdkBuilder: CfnVirtualNode.TlsValidationContextSdsTrustProperty.Builder =
        CfnVirtualNode.TlsValidationContextSdsTrustProperty.builder()

    /**
     * @param secretName A reference to an object that represents the name of the secret for a
     *   Transport Layer Security (TLS) Secret Discovery Service validation context trust.
     */
    public fun secretName(secretName: String) {
        cdkBuilder.secretName(secretName)
    }

    public fun build(): CfnVirtualNode.TlsValidationContextSdsTrustProperty = cdkBuilder.build()
}
