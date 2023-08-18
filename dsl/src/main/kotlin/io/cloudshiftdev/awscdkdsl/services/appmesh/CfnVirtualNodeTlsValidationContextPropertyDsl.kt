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
import software.amazon.awscdk.services.appmesh.CfnVirtualNode

/**
 * An object that represents how the proxy will validate its peer during Transport Layer Security
 * (TLS) negotiation.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appmesh.*;
 * TlsValidationContextProperty tlsValidationContextProperty =
 * TlsValidationContextProperty.builder()
 * .trust(TlsValidationContextTrustProperty.builder()
 * .acm(TlsValidationContextAcmTrustProperty.builder()
 * .certificateAuthorityArns(List.of("certificateAuthorityArns"))
 * .build())
 * .file(TlsValidationContextFileTrustProperty.builder()
 * .certificateChain("certificateChain")
 * .build())
 * .sds(TlsValidationContextSdsTrustProperty.builder()
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
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-tlsvalidationcontext.html)
 */
@CdkDslMarker
public class CfnVirtualNodeTlsValidationContextPropertyDsl {
    private val cdkBuilder: CfnVirtualNode.TlsValidationContextProperty.Builder =
        CfnVirtualNode.TlsValidationContextProperty.builder()

    /**
     * @param subjectAlternativeNames A reference to an object that represents the SANs for a
     *   Transport Layer Security (TLS) validation context. If you don't specify SANs on the
     *   *terminating* mesh endpoint, the Envoy proxy for that node doesn't verify the SAN on a peer
     *   client certificate. If you don't specify SANs on the *originating* mesh endpoint, the SAN
     *   on the certificate provided by the terminating endpoint must match the mesh endpoint
     *   service discovery configuration. Since SPIRE vended certificates have a SPIFFE ID as a
     *   name, you must set the SAN since the name doesn't match the service discovery name.
     */
    public fun subjectAlternativeNames(subjectAlternativeNames: IResolvable) {
        cdkBuilder.subjectAlternativeNames(subjectAlternativeNames)
    }

    /**
     * @param subjectAlternativeNames A reference to an object that represents the SANs for a
     *   Transport Layer Security (TLS) validation context. If you don't specify SANs on the
     *   *terminating* mesh endpoint, the Envoy proxy for that node doesn't verify the SAN on a peer
     *   client certificate. If you don't specify SANs on the *originating* mesh endpoint, the SAN
     *   on the certificate provided by the terminating endpoint must match the mesh endpoint
     *   service discovery configuration. Since SPIRE vended certificates have a SPIFFE ID as a
     *   name, you must set the SAN since the name doesn't match the service discovery name.
     */
    public fun subjectAlternativeNames(
        subjectAlternativeNames: CfnVirtualNode.SubjectAlternativeNamesProperty
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
    public fun trust(trust: CfnVirtualNode.TlsValidationContextTrustProperty) {
        cdkBuilder.trust(trust)
    }

    public fun build(): CfnVirtualNode.TlsValidationContextProperty = cdkBuilder.build()
}
