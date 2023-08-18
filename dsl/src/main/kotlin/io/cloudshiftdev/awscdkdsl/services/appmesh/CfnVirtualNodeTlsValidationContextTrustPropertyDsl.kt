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
 * An object that represents a Transport Layer Security (TLS) validation context trust.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appmesh.*;
 * TlsValidationContextTrustProperty tlsValidationContextTrustProperty =
 * TlsValidationContextTrustProperty.builder()
 * .acm(TlsValidationContextAcmTrustProperty.builder()
 * .certificateAuthorityArns(List.of("certificateAuthorityArns"))
 * .build())
 * .file(TlsValidationContextFileTrustProperty.builder()
 * .certificateChain("certificateChain")
 * .build())
 * .sds(TlsValidationContextSdsTrustProperty.builder()
 * .secretName("secretName")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-tlsvalidationcontexttrust.html)
 */
@CdkDslMarker
public class CfnVirtualNodeTlsValidationContextTrustPropertyDsl {
    private val cdkBuilder: CfnVirtualNode.TlsValidationContextTrustProperty.Builder =
        CfnVirtualNode.TlsValidationContextTrustProperty.builder()

    /**
     * @param acm A reference to an object that represents a Transport Layer Security (TLS)
     *   validation context trust for an AWS Certificate Manager certificate.
     */
    public fun acm(acm: IResolvable) {
        cdkBuilder.acm(acm)
    }

    /**
     * @param acm A reference to an object that represents a Transport Layer Security (TLS)
     *   validation context trust for an AWS Certificate Manager certificate.
     */
    public fun acm(acm: CfnVirtualNode.TlsValidationContextAcmTrustProperty) {
        cdkBuilder.acm(acm)
    }

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
    public fun `file`(`file`: CfnVirtualNode.TlsValidationContextFileTrustProperty) {
        cdkBuilder.`file`(`file`)
    }

    /**
     * @param sds A reference to an object that represents a Transport Layer Security (TLS) Secret
     *   Discovery Service validation context trust.
     */
    public fun sds(sds: IResolvable) {
        cdkBuilder.sds(sds)
    }

    /**
     * @param sds A reference to an object that represents a Transport Layer Security (TLS) Secret
     *   Discovery Service validation context trust.
     */
    public fun sds(sds: CfnVirtualNode.TlsValidationContextSdsTrustProperty) {
        cdkBuilder.sds(sds)
    }

    public fun build(): CfnVirtualNode.TlsValidationContextTrustProperty = cdkBuilder.build()
}
