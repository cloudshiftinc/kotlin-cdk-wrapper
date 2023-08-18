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
import software.amazon.awscdk.services.appmesh.CfnVirtualGateway

/**
 * An object that represents a virtual gateway's listener's Transport Layer Security (TLS) Secret
 * Discovery Service validation context trust.
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
 * VirtualGatewayTlsValidationContextSdsTrustProperty
 * virtualGatewayTlsValidationContextSdsTrustProperty =
 * VirtualGatewayTlsValidationContextSdsTrustProperty.builder()
 * .secretName("secretName")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualgateway-virtualgatewaytlsvalidationcontextsdstrust.html)
 */
@CdkDslMarker
public class CfnVirtualGatewayVirtualGatewayTlsValidationContextSdsTrustPropertyDsl {
    private val cdkBuilder:
        CfnVirtualGateway.VirtualGatewayTlsValidationContextSdsTrustProperty.Builder =
        CfnVirtualGateway.VirtualGatewayTlsValidationContextSdsTrustProperty.builder()

    /**
     * @param secretName A reference to an object that represents the name of the secret for a
     *   virtual gateway's Transport Layer Security (TLS) Secret Discovery Service validation
     *   context trust.
     */
    public fun secretName(secretName: String) {
        cdkBuilder.secretName(secretName)
    }

    public fun build(): CfnVirtualGateway.VirtualGatewayTlsValidationContextSdsTrustProperty =
        cdkBuilder.build()
}
