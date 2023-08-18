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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appmesh.CfnVirtualGateway

/**
 * An object that represents a virtual gateway's listener's Transport Layer Security (TLS)
 * validation context.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appmesh.*;
 * VirtualGatewayListenerTlsValidationContextProperty
 * virtualGatewayListenerTlsValidationContextProperty =
 * VirtualGatewayListenerTlsValidationContextProperty.builder()
 * .trust(VirtualGatewayListenerTlsValidationContextTrustProperty.builder()
 * .file(VirtualGatewayTlsValidationContextFileTrustProperty.builder()
 * .certificateChain("certificateChain")
 * .build())
 * .sds(VirtualGatewayTlsValidationContextSdsTrustProperty.builder()
 * .secretName("secretName")
 * .build())
 * .build())
 * // the properties below are optional
 * .subjectAlternativeNames(SubjectAlternativeNamesProperty.builder()
 * .match(SubjectAlternativeNameMatchersProperty.builder()
 * .exact(List.of("exact"))
 * .build())
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualgateway-virtualgatewaylistenertlsvalidationcontext.html)
 */
@CdkDslMarker
public class CfnVirtualGatewayVirtualGatewayListenerTlsValidationContextPropertyDsl {
    private val cdkBuilder:
        CfnVirtualGateway.VirtualGatewayListenerTlsValidationContextProperty.Builder =
        CfnVirtualGateway.VirtualGatewayListenerTlsValidationContextProperty.builder()

    /**
     * @param subjectAlternativeNames A reference to an object that represents the SANs for a
     *   virtual gateway listener's Transport Layer Security (TLS) validation context.
     */
    public fun subjectAlternativeNames(subjectAlternativeNames: IResolvable) {
        cdkBuilder.subjectAlternativeNames(subjectAlternativeNames)
    }

    /**
     * @param subjectAlternativeNames A reference to an object that represents the SANs for a
     *   virtual gateway listener's Transport Layer Security (TLS) validation context.
     */
    public fun subjectAlternativeNames(
        subjectAlternativeNames: CfnVirtualGateway.SubjectAlternativeNamesProperty
    ) {
        cdkBuilder.subjectAlternativeNames(subjectAlternativeNames)
    }

    /**
     * @param trust A reference to where to retrieve the trust chain when validating a peer’s
     *   Transport Layer Security (TLS) certificate.
     */
    public fun trust(trust: IResolvable) {
        cdkBuilder.trust(trust)
    }

    /**
     * @param trust A reference to where to retrieve the trust chain when validating a peer’s
     *   Transport Layer Security (TLS) certificate.
     */
    public fun trust(
        trust: CfnVirtualGateway.VirtualGatewayListenerTlsValidationContextTrustProperty
    ) {
        cdkBuilder.trust(trust)
    }

    public fun build(): CfnVirtualGateway.VirtualGatewayListenerTlsValidationContextProperty =
        cdkBuilder.build()
}
