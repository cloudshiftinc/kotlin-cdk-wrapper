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
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.appmesh.CfnVirtualNode

/**
 * An object that represents a Transport Layer Security (TLS) validation context trust for an AWS
 * Certificate Manager certificate.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appmesh.*;
 * TlsValidationContextAcmTrustProperty tlsValidationContextAcmTrustProperty =
 * TlsValidationContextAcmTrustProperty.builder()
 * .certificateAuthorityArns(List.of("certificateAuthorityArns"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-tlsvalidationcontextacmtrust.html)
 */
@CdkDslMarker
public class CfnVirtualNodeTlsValidationContextAcmTrustPropertyDsl {
    private val cdkBuilder: CfnVirtualNode.TlsValidationContextAcmTrustProperty.Builder =
        CfnVirtualNode.TlsValidationContextAcmTrustProperty.builder()

    private val _certificateAuthorityArns: MutableList<String> = mutableListOf()

    /** @param certificateAuthorityArns One or more ACM Amazon Resource Name (ARN)s. */
    public fun certificateAuthorityArns(vararg certificateAuthorityArns: String) {
        _certificateAuthorityArns.addAll(listOf(*certificateAuthorityArns))
    }

    /** @param certificateAuthorityArns One or more ACM Amazon Resource Name (ARN)s. */
    public fun certificateAuthorityArns(certificateAuthorityArns: Collection<String>) {
        _certificateAuthorityArns.addAll(certificateAuthorityArns)
    }

    public fun build(): CfnVirtualNode.TlsValidationContextAcmTrustProperty {
        if (_certificateAuthorityArns.isNotEmpty())
            cdkBuilder.certificateAuthorityArns(_certificateAuthorityArns)
        return cdkBuilder.build()
    }
}
