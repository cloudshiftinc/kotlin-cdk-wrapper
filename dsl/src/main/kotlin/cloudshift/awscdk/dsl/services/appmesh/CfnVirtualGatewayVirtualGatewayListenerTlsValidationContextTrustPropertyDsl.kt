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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appmesh.CfnVirtualGateway

/**
 * An object that represents a virtual gateway's listener's Transport Layer Security (TLS)
 * validation context trust.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appmesh.*;
 * VirtualGatewayListenerTlsValidationContextTrustProperty
 * virtualGatewayListenerTlsValidationContextTrustProperty =
 * VirtualGatewayListenerTlsValidationContextTrustProperty.builder()
 * .file(VirtualGatewayTlsValidationContextFileTrustProperty.builder()
 * .certificateChain("certificateChain")
 * .build())
 * .sds(VirtualGatewayTlsValidationContextSdsTrustProperty.builder()
 * .secretName("secretName")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualgateway-virtualgatewaylistenertlsvalidationcontexttrust.html)
 */
@CdkDslMarker
public class CfnVirtualGatewayVirtualGatewayListenerTlsValidationContextTrustPropertyDsl {
    private val cdkBuilder:
        CfnVirtualGateway.VirtualGatewayListenerTlsValidationContextTrustProperty.Builder =
        CfnVirtualGateway.VirtualGatewayListenerTlsValidationContextTrustProperty.builder()

    /**
     * @param file An object that represents a Transport Layer Security (TLS) validation context
     *   trust for a local file.
     */
    public fun `file`(`file`: IResolvable) {
        cdkBuilder.`file`(`file`)
    }

    /**
     * @param file An object that represents a Transport Layer Security (TLS) validation context
     *   trust for a local file.
     */
    public fun `file`(
        `file`: CfnVirtualGateway.VirtualGatewayTlsValidationContextFileTrustProperty
    ) {
        cdkBuilder.`file`(`file`)
    }

    /**
     * @param sds A reference to an object that represents a virtual gateway's listener's Transport
     *   Layer Security (TLS) Secret Discovery Service validation context trust.
     */
    public fun sds(sds: IResolvable) {
        cdkBuilder.sds(sds)
    }

    /**
     * @param sds A reference to an object that represents a virtual gateway's listener's Transport
     *   Layer Security (TLS) Secret Discovery Service validation context trust.
     */
    public fun sds(sds: CfnVirtualGateway.VirtualGatewayTlsValidationContextSdsTrustProperty) {
        cdkBuilder.sds(sds)
    }

    public fun build(): CfnVirtualGateway.VirtualGatewayListenerTlsValidationContextTrustProperty =
        cdkBuilder.build()
}
