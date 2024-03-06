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
import software.amazon.awscdk.services.certificatemanager.PrivateCertificate
import software.constructs.Construct

/**
 * A private certificate managed by AWS Certificate Manager.
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
public class PrivateCertificateDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: PrivateCertificate.Builder =
        PrivateCertificate.Builder.create(scope, id)

    private val _subjectAlternativeNames: MutableList<String> = mutableListOf()

    /**
     * Private certificate authority (CA) that will be used to issue the certificate.
     *
     * @param certificateAuthority Private certificate authority (CA) that will be used to issue the
     *   certificate.
     */
    public fun certificateAuthority(certificateAuthority: ICertificateAuthority) {
        cdkBuilder.certificateAuthority(certificateAuthority)
    }

    /**
     * Fully-qualified domain name to request a private certificate for.
     *
     * May contain wildcards, such as `*.domain.com`.
     *
     * @param domainName Fully-qualified domain name to request a private certificate for.
     */
    public fun domainName(domainName: String) {
        cdkBuilder.domainName(domainName)
    }

    /**
     * Specifies the algorithm of the public and private key pair that your certificate uses to
     * encrypt data.
     *
     * When you request a private PKI certificate signed by a CA from AWS Private CA, the specified
     * signing algorithm family (RSA or ECDSA) must match the algorithm family of the CA's secret
     * key.
     *
     * Default: KeyAlgorithm.RSA_2048
     *
     * [Documentation](https://docs.aws.amazon.com/acm/latest/userguide/acm-certificate.html#algorithms.title)
     *
     * @param keyAlgorithm Specifies the algorithm of the public and private key pair that your
     *   certificate uses to encrypt data.
     */
    public fun keyAlgorithm(keyAlgorithm: KeyAlgorithm) {
        cdkBuilder.keyAlgorithm(keyAlgorithm)
    }

    /**
     * Alternative domain names on your private certificate.
     *
     * Use this to register alternative domain names that represent the same site.
     *
     * Default: - No additional FQDNs will be included as alternative domain names.
     *
     * @param subjectAlternativeNames Alternative domain names on your private certificate.
     */
    public fun subjectAlternativeNames(vararg subjectAlternativeNames: String) {
        _subjectAlternativeNames.addAll(listOf(*subjectAlternativeNames))
    }

    /**
     * Alternative domain names on your private certificate.
     *
     * Use this to register alternative domain names that represent the same site.
     *
     * Default: - No additional FQDNs will be included as alternative domain names.
     *
     * @param subjectAlternativeNames Alternative domain names on your private certificate.
     */
    public fun subjectAlternativeNames(subjectAlternativeNames: Collection<String>) {
        _subjectAlternativeNames.addAll(subjectAlternativeNames)
    }

    public fun build(): PrivateCertificate {
        if (_subjectAlternativeNames.isNotEmpty())
            cdkBuilder.subjectAlternativeNames(_subjectAlternativeNames)
        return cdkBuilder.build()
    }
}
