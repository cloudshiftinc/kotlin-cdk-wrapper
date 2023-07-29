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

package cloudshift.awscdk.dsl.services.acmpca

import kotlin.Unit
import software.amazon.awscdk.services.acmpca.CfnCertificate
import software.amazon.awscdk.services.acmpca.CfnCertificateAuthority

/** The period of time during which the certificate will be valid. */
public inline fun CfnCertificate.setValidity(
    block: CfnCertificateValidityPropertyDsl.() -> Unit = {}
) {
    val builder = CfnCertificateValidityPropertyDsl()
    builder.apply(block)
    return setValidity(builder.build())
}

/**
 * Specifies X.509 certificate information to be included in the issued certificate. An
 * `APIPassthrough` or `APICSRPassthrough` template variant must be selected, or else this parameter
 * is ignored.
 */
public inline fun CfnCertificate.setApiPassthrough(
    block: CfnCertificateApiPassthroughPropertyDsl.() -> Unit = {}
) {
    val builder = CfnCertificateApiPassthroughPropertyDsl()
    builder.apply(block)
    return setApiPassthrough(builder.build())
}

/** Information describing the start of the validity period of the certificate. */
public inline fun CfnCertificate.setValidityNotBefore(
    block: CfnCertificateValidityPropertyDsl.() -> Unit = {}
) {
    val builder = CfnCertificateValidityPropertyDsl()
    builder.apply(block)
    return setValidityNotBefore(builder.build())
}

/** Structure that contains X.500 distinguished name information for your private CA. */
public inline fun CfnCertificateAuthority.setSubject(
    block: CfnCertificateAuthoritySubjectPropertyDsl.() -> Unit = {}
) {
    val builder = CfnCertificateAuthoritySubjectPropertyDsl()
    builder.apply(block)
    return setSubject(builder.build())
}

/**
 * Specifies information to be added to the extension section of the certificate signing request
 * (CSR).
 */
public inline fun CfnCertificateAuthority.setCsrExtensions(
    block: CfnCertificateAuthorityCsrExtensionsPropertyDsl.() -> Unit = {}
) {
    val builder = CfnCertificateAuthorityCsrExtensionsPropertyDsl()
    builder.apply(block)
    return setCsrExtensions(builder.build())
}

/**
 * Certificate revocation information used by the
 * [CreateCertificateAuthority](https://docs.aws.amazon.com/privateca/latest/APIReference/API_CreateCertificateAuthority.html)
 * and
 * [UpdateCertificateAuthority](https://docs.aws.amazon.com/privateca/latest/APIReference/API_UpdateCertificateAuthority.html)
 * actions. Your private certificate authority (CA) can configure Online Certificate Status Protocol
 * (OCSP) support and/or maintain a certificate revocation list (CRL). OCSP returns validation
 * information about certificates as requested by clients, and a CRL contains an updated list of
 * certificates revoked by your CA. For more information, see
 * [RevokeCertificate](https://docs.aws.amazon.com/privateca/latest/APIReference/API_RevokeCertificate.html)
 * in the *AWS Private CA API Reference* and
 * [Setting up a certificate revocation method](https://docs.aws.amazon.com/privateca/latest/userguide/revocation-setup.html)
 * in the *AWS Private CA User Guide* .
 */
public inline fun CfnCertificateAuthority.setRevocationConfiguration(
    block: CfnCertificateAuthorityRevocationConfigurationPropertyDsl.() -> Unit = {}
) {
    val builder = CfnCertificateAuthorityRevocationConfigurationPropertyDsl()
    builder.apply(block)
    return setRevocationConfiguration(builder.build())
}
