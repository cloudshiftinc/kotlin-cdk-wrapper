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

package io.cloudshiftdev.awscdkdsl.services.certificatemanager

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.acmpca.ICertificateAuthority
import software.amazon.awscdk.services.certificatemanager.KeyAlgorithm
import software.amazon.awscdk.services.certificatemanager.PrivateCertificateProps

/**
 * Properties for your private certificate.
 *
 * Example:
 * ```
 * import software.amazon.awscdk.services.acmpca.*;
 * PrivateCertificate.Builder.create(this, "PrivateCertificate")
 * .domainName("test.example.com")
 * .subjectAlternativeNames(List.of("cool.example.com", "test.example.net")) // optional
 * .certificateAuthority(CertificateAuthority.fromCertificateAuthorityArn(this, "CA",
 * "arn:aws:acm-pca:us-east-1:123456789012:certificate-authority/023077d8-2bfa-4eb0-8f22-05c96deade77"))
 * .keyAlgorithm(KeyAlgorithm.RSA_2048)
 * .build();
 * ```
 */
@CdkDslMarker
public class PrivateCertificatePropsDsl {
    private val cdkBuilder: PrivateCertificateProps.Builder = PrivateCertificateProps.builder()

    private val _subjectAlternativeNames: MutableList<String> = mutableListOf()

    /**
     * @param certificateAuthority Private certificate authority (CA) that will be used to issue the
     *   certificate.
     */
    public fun certificateAuthority(certificateAuthority: ICertificateAuthority) {
        cdkBuilder.certificateAuthority(certificateAuthority)
    }

    /**
     * @param domainName Fully-qualified domain name to request a private certificate for. May
     *   contain wildcards, such as `*.domain.com`.
     */
    public fun domainName(domainName: String) {
        cdkBuilder.domainName(domainName)
    }

    /**
     * @param keyAlgorithm Specifies the algorithm of the public and private key pair that your
     *   certificate uses to encrypt data. When you request a private PKI certificate signed by a CA
     *   from AWS Private CA, the specified signing algorithm family (RSA or ECDSA) must match the
     *   algorithm family of the CA's secret key.
     */
    public fun keyAlgorithm(keyAlgorithm: KeyAlgorithm) {
        cdkBuilder.keyAlgorithm(keyAlgorithm)
    }

    /**
     * @param subjectAlternativeNames Alternative domain names on your private certificate. Use this
     *   to register alternative domain names that represent the same site.
     */
    public fun subjectAlternativeNames(vararg subjectAlternativeNames: String) {
        _subjectAlternativeNames.addAll(listOf(*subjectAlternativeNames))
    }

    /**
     * @param subjectAlternativeNames Alternative domain names on your private certificate. Use this
     *   to register alternative domain names that represent the same site.
     */
    public fun subjectAlternativeNames(subjectAlternativeNames: Collection<String>) {
        _subjectAlternativeNames.addAll(subjectAlternativeNames)
    }

    public fun build(): PrivateCertificateProps {
        if (_subjectAlternativeNames.isNotEmpty())
            cdkBuilder.subjectAlternativeNames(_subjectAlternativeNames)
        return cdkBuilder.build()
    }
}
