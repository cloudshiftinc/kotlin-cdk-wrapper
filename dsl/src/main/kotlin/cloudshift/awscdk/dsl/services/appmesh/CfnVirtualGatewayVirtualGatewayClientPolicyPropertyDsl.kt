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
 * An object that represents a client policy.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appmesh.*;
 * VirtualGatewayClientPolicyProperty virtualGatewayClientPolicyProperty =
 * VirtualGatewayClientPolicyProperty.builder()
 * .tls(VirtualGatewayClientPolicyTlsProperty.builder()
 * .validation(VirtualGatewayTlsValidationContextProperty.builder()
 * .trust(VirtualGatewayTlsValidationContextTrustProperty.builder()
 * .acm(VirtualGatewayTlsValidationContextAcmTrustProperty.builder()
 * .certificateAuthorityArns(List.of("certificateAuthorityArns"))
 * .build())
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
 * .build())
 * // the properties below are optional
 * .certificate(VirtualGatewayClientTlsCertificateProperty.builder()
 * .file(VirtualGatewayListenerTlsFileCertificateProperty.builder()
 * .certificateChain("certificateChain")
 * .privateKey("privateKey")
 * .build())
 * .sds(VirtualGatewayListenerTlsSdsCertificateProperty.builder()
 * .secretName("secretName")
 * .build())
 * .build())
 * .enforce(false)
 * .ports(List.of(123))
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualgateway-virtualgatewayclientpolicy.html)
 */
@CdkDslMarker
public class CfnVirtualGatewayVirtualGatewayClientPolicyPropertyDsl {
    private val cdkBuilder: CfnVirtualGateway.VirtualGatewayClientPolicyProperty.Builder =
        CfnVirtualGateway.VirtualGatewayClientPolicyProperty.builder()

    /**
     * @param tls A reference to an object that represents a Transport Layer Security (TLS) client
     *   policy.
     */
    public fun tls(tls: IResolvable) {
        cdkBuilder.tls(tls)
    }

    /**
     * @param tls A reference to an object that represents a Transport Layer Security (TLS) client
     *   policy.
     */
    public fun tls(tls: CfnVirtualGateway.VirtualGatewayClientPolicyTlsProperty) {
        cdkBuilder.tls(tls)
    }

    public fun build(): CfnVirtualGateway.VirtualGatewayClientPolicyProperty = cdkBuilder.build()
}
