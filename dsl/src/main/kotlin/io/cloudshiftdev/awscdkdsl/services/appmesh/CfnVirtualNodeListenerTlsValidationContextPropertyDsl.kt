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
 * An object that represents a listener's Transport Layer Security (TLS) validation context.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appmesh.*;
 * ListenerTlsValidationContextProperty listenerTlsValidationContextProperty =
 * ListenerTlsValidationContextProperty.builder()
 * .trust(ListenerTlsValidationContextTrustProperty.builder()
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
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-listenertlsvalidationcontext.html)
 */
@CdkDslMarker
public class CfnVirtualNodeListenerTlsValidationContextPropertyDsl {
    private val cdkBuilder: CfnVirtualNode.ListenerTlsValidationContextProperty.Builder =
        CfnVirtualNode.ListenerTlsValidationContextProperty.builder()

    /**
     * @param subjectAlternativeNames A reference to an object that represents the SANs for a
     *   listener's Transport Layer Security (TLS) validation context.
     */
    public fun subjectAlternativeNames(subjectAlternativeNames: IResolvable) {
        cdkBuilder.subjectAlternativeNames(subjectAlternativeNames)
    }

    /**
     * @param subjectAlternativeNames A reference to an object that represents the SANs for a
     *   listener's Transport Layer Security (TLS) validation context.
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
    public fun trust(trust: CfnVirtualNode.ListenerTlsValidationContextTrustProperty) {
        cdkBuilder.trust(trust)
    }

    public fun build(): CfnVirtualNode.ListenerTlsValidationContextProperty = cdkBuilder.build()
}
