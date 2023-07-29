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

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.acmpca.CfnCertificateAuthority
import software.amazon.awscdk.services.acmpca.CfnCertificateAuthorityProps

/**
 * Properties for defining a `CfnCertificateAuthority`.
 *
 * Example:
 * ```
 * CfnCertificateAuthority cfnCertificateAuthority = CfnCertificateAuthority.Builder.create(this,
 * "CA")
 * .type("ROOT")
 * .keyAlgorithm("RSA_2048")
 * .signingAlgorithm("SHA256WITHRSA")
 * .subject(SubjectProperty.builder()
 * .country("US")
 * .organization("string")
 * .organizationalUnit("string")
 * .distinguishedNameQualifier("string")
 * .state("string")
 * .commonName("123")
 * .serialNumber("string")
 * .locality("string")
 * .title("string")
 * .surname("string")
 * .givenName("string")
 * .initials("DG")
 * .pseudonym("string")
 * .generationQualifier("DBG")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-acmpca-certificateauthority.html)
 */
@CdkDslMarker
public class CfnCertificateAuthorityPropsDsl {
    private val cdkBuilder: CfnCertificateAuthorityProps.Builder =
        CfnCertificateAuthorityProps.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * @param csrExtensions Specifies information to be added to the extension section of the
     *   certificate signing request (CSR).
     */
    public fun csrExtensions(csrExtensions: IResolvable) {
        cdkBuilder.csrExtensions(csrExtensions)
    }

    /**
     * @param csrExtensions Specifies information to be added to the extension section of the
     *   certificate signing request (CSR).
     */
    public fun csrExtensions(csrExtensions: CfnCertificateAuthority.CsrExtensionsProperty) {
        cdkBuilder.csrExtensions(csrExtensions)
    }

    /**
     * @param keyAlgorithm Type of the public key algorithm and size, in bits, of the key pair that
     *   your CA creates when it issues a certificate. When you create a subordinate CA, you must
     *   use a key algorithm supported by the parent CA.
     */
    public fun keyAlgorithm(keyAlgorithm: String) {
        cdkBuilder.keyAlgorithm(keyAlgorithm)
    }

    /**
     * @param keyStorageSecurityStandard Specifies a cryptographic key management compliance
     *   standard used for handling CA keys. Default: FIPS_140_2_LEVEL_3_OR_HIGHER
     *
     * Some AWS Regions do not support the default. When creating a CA in these Regions, you must
     * provide `FIPS_140_2_LEVEL_2_OR_HIGHER` as the argument for `KeyStorageSecurityStandard` .
     * Failure to do this results in an `InvalidArgsException` with the message, "A certificate
     * authority cannot be created in this region with the specified security standard."
     *
     * For information about security standard support in various Regions, see
     * [Storage and security compliance of AWS Private CA private keys](https://docs.aws.amazon.com/privateca/latest/userguide/data-protection.html#private-keys)
     * .
     */
    public fun keyStorageSecurityStandard(keyStorageSecurityStandard: String) {
        cdkBuilder.keyStorageSecurityStandard(keyStorageSecurityStandard)
    }

    /**
     * @param revocationConfiguration Certificate revocation information used by the
     *   [CreateCertificateAuthority](https://docs.aws.amazon.com/privateca/latest/APIReference/API_CreateCertificateAuthority.html)
     *   and
     *   [UpdateCertificateAuthority](https://docs.aws.amazon.com/privateca/latest/APIReference/API_UpdateCertificateAuthority.html)
     *   actions. Your private certificate authority (CA) can configure Online Certificate Status
     *   Protocol (OCSP) support and/or maintain a certificate revocation list (CRL). OCSP returns
     *   validation information about certificates as requested by clients, and a CRL contains an
     *   updated list of certificates revoked by your CA. For more information, see
     *   [RevokeCertificate](https://docs.aws.amazon.com/privateca/latest/APIReference/API_RevokeCertificate.html)
     *   in the *AWS Private CA API Reference* and
     *   [Setting up a certificate revocation method](https://docs.aws.amazon.com/privateca/latest/userguide/revocation-setup.html)
     *   in the *AWS Private CA User Guide* .
     *
     * The following requirements apply to revocation configurations.
     * * A configuration disabling CRLs or OCSP must contain only the `Enabled=False` parameter, and
     *   will fail if other parameters such as `CustomCname` or `ExpirationInDays` are included.
     * * In a CRL configuration, the `S3BucketName` parameter must conform to the
     *   [Amazon S3 bucket naming rules](https://docs.aws.amazon.com/AmazonS3/latest/userguide/bucketnamingrules.html)
     *   .
     * * A configuration containing a custom Canonical Name (CNAME) parameter for CRLs or OCSP must
     *   conform to [RFC2396](https://docs.aws.amazon.com/https://www.ietf.org/rfc/rfc2396.txt)
     *   restrictions on the use of special characters in a CNAME.
     * * In a CRL or OCSP configuration, the value of a CNAME parameter must not include a protocol
     *   prefix such as "http://" or "https://".
     */
    public fun revocationConfiguration(revocationConfiguration: IResolvable) {
        cdkBuilder.revocationConfiguration(revocationConfiguration)
    }

    /**
     * @param revocationConfiguration Certificate revocation information used by the
     *   [CreateCertificateAuthority](https://docs.aws.amazon.com/privateca/latest/APIReference/API_CreateCertificateAuthority.html)
     *   and
     *   [UpdateCertificateAuthority](https://docs.aws.amazon.com/privateca/latest/APIReference/API_UpdateCertificateAuthority.html)
     *   actions. Your private certificate authority (CA) can configure Online Certificate Status
     *   Protocol (OCSP) support and/or maintain a certificate revocation list (CRL). OCSP returns
     *   validation information about certificates as requested by clients, and a CRL contains an
     *   updated list of certificates revoked by your CA. For more information, see
     *   [RevokeCertificate](https://docs.aws.amazon.com/privateca/latest/APIReference/API_RevokeCertificate.html)
     *   in the *AWS Private CA API Reference* and
     *   [Setting up a certificate revocation method](https://docs.aws.amazon.com/privateca/latest/userguide/revocation-setup.html)
     *   in the *AWS Private CA User Guide* .
     *
     * The following requirements apply to revocation configurations.
     * * A configuration disabling CRLs or OCSP must contain only the `Enabled=False` parameter, and
     *   will fail if other parameters such as `CustomCname` or `ExpirationInDays` are included.
     * * In a CRL configuration, the `S3BucketName` parameter must conform to the
     *   [Amazon S3 bucket naming rules](https://docs.aws.amazon.com/AmazonS3/latest/userguide/bucketnamingrules.html)
     *   .
     * * A configuration containing a custom Canonical Name (CNAME) parameter for CRLs or OCSP must
     *   conform to [RFC2396](https://docs.aws.amazon.com/https://www.ietf.org/rfc/rfc2396.txt)
     *   restrictions on the use of special characters in a CNAME.
     * * In a CRL or OCSP configuration, the value of a CNAME parameter must not include a protocol
     *   prefix such as "http://" or "https://".
     */
    public fun revocationConfiguration(
        revocationConfiguration: CfnCertificateAuthority.RevocationConfigurationProperty
    ) {
        cdkBuilder.revocationConfiguration(revocationConfiguration)
    }

    /**
     * @param signingAlgorithm Name of the algorithm your private CA uses to sign certificate
     *   requests. This parameter should not be confused with the `SigningAlgorithm` parameter used
     *   to sign certificates when they are issued.
     */
    public fun signingAlgorithm(signingAlgorithm: String) {
        cdkBuilder.signingAlgorithm(signingAlgorithm)
    }

    /**
     * @param subject Structure that contains X.500 distinguished name information for your private
     *   CA.
     */
    public fun subject(subject: IResolvable) {
        cdkBuilder.subject(subject)
    }

    /**
     * @param subject Structure that contains X.500 distinguished name information for your private
     *   CA.
     */
    public fun subject(subject: CfnCertificateAuthority.SubjectProperty) {
        cdkBuilder.subject(subject)
    }

    /**
     * @param tags Key-value pairs that will be attached to the new private CA. You can associate up
     *   to 50 tags with a private CA. For information using tags with IAM to manage permissions,
     *   see
     *   [Controlling Access Using IAM Tags](https://docs.aws.amazon.com/IAM/latest/UserGuide/access_iam-tags.html)
     *   .
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * @param tags Key-value pairs that will be attached to the new private CA. You can associate up
     *   to 50 tags with a private CA. For information using tags with IAM to manage permissions,
     *   see
     *   [Controlling Access Using IAM Tags](https://docs.aws.amazon.com/IAM/latest/UserGuide/access_iam-tags.html)
     *   .
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    /** @param type Type of your private CA. */
    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    /**
     * @param usageMode Specifies whether the CA issues general-purpose certificates that typically
     *   require a revocation mechanism, or short-lived certificates that may optionally omit
     *   revocation because they expire quickly. Short-lived certificate validity is limited to
     *   seven days.
     *
     * The default value is GENERAL_PURPOSE.
     */
    public fun usageMode(usageMode: String) {
        cdkBuilder.usageMode(usageMode)
    }

    public fun build(): CfnCertificateAuthorityProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
