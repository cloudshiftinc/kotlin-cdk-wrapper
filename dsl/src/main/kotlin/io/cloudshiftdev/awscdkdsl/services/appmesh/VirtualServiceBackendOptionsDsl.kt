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
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.TlsClientPolicy
import software.amazon.awscdk.services.appmesh.VirtualServiceBackendOptions

/**
 * Represents the properties needed to define a Virtual Service backend.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appmesh.*;
 * MutualTlsCertificate mutualTlsCertificate;
 * SubjectAlternativeNames subjectAlternativeNames;
 * TlsValidationTrust tlsValidationTrust;
 * VirtualServiceBackendOptions virtualServiceBackendOptions =
 * VirtualServiceBackendOptions.builder()
 * .tlsClientPolicy(TlsClientPolicy.builder()
 * .validation(TlsValidation.builder()
 * .trust(tlsValidationTrust)
 * // the properties below are optional
 * .subjectAlternativeNames(subjectAlternativeNames)
 * .build())
 * // the properties below are optional
 * .enforce(false)
 * .mutualTlsCertificate(mutualTlsCertificate)
 * .ports(List.of(123))
 * .build())
 * .build();
 * ```
 */
@CdkDslMarker
public class VirtualServiceBackendOptionsDsl {
    private val cdkBuilder: VirtualServiceBackendOptions.Builder =
        VirtualServiceBackendOptions.builder()

    /** @param tlsClientPolicy TLS properties for Client policy for the backend. */
    public fun tlsClientPolicy(tlsClientPolicy: TlsClientPolicyDsl.() -> Unit = {}) {
        val builder = TlsClientPolicyDsl()
        builder.apply(tlsClientPolicy)
        cdkBuilder.tlsClientPolicy(builder.build())
    }

    /** @param tlsClientPolicy TLS properties for Client policy for the backend. */
    public fun tlsClientPolicy(tlsClientPolicy: TlsClientPolicy) {
        cdkBuilder.tlsClientPolicy(tlsClientPolicy)
    }

    public fun build(): VirtualServiceBackendOptions = cdkBuilder.build()
}
