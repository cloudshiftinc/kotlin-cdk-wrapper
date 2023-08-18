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

package io.cloudshiftdev.awscdkdsl.services.acmpca

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.acmpca.CfnCertificateAuthority
import software.constructs.Construct

/**
 * Use the `AWS::ACMPCA::CertificateAuthority` resource to create a private CA.
 *
 * Once the CA exists, you can use the `AWS::ACMPCA::Certificate` resource to issue a new CA
 * certificate. Alternatively, you can issue a CA certificate using an on-premises CA, and then use
 * the `AWS::ACMPCA::CertificateAuthorityActivation` resource to import the new CA certificate and
 * activate the CA.
 *
 * Before removing a `AWS::ACMPCA::CertificateAuthority` resource from the CloudFormation stack,
 * disable the affected CA. Otherwise, the action will fail. You can disable the CA by removing its
 * associated `AWS::ACMPCA::CertificateAuthorityActivation` resource from CloudFormation.
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
public class CfnCertificateAuthorityDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnCertificateAuthority.Builder =
        CfnCertificateAuthority.Builder.create(scope, id)

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * Specifies information to be added to the extension section of the certificate signing request
     * (CSR).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-acmpca-certificateauthority.html#cfn-acmpca-certificateauthority-csrextensions)
     *
     * @param csrExtensions Specifies information to be added to the extension section of the
     *   certificate signing request (CSR).
     */
    public fun csrExtensions(csrExtensions: IResolvable) {
        cdkBuilder.csrExtensions(csrExtensions)
    }

    /**
     * Specifies information to be added to the extension section of the certificate signing request
     * (CSR).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-acmpca-certificateauthority.html#cfn-acmpca-certificateauthority-csrextensions)
     *
     * @param csrExtensions Specifies information to be added to the extension section of the
     *   certificate signing request (CSR).
     */
    public fun csrExtensions(csrExtensions: CfnCertificateAuthority.CsrExtensionsProperty) {
        cdkBuilder.csrExtensions(csrExtensions)
    }

    /**
     * Type of the public key algorithm and size, in bits, of the key pair that your CA creates when
     * it issues a certificate.
     *
     * When you create a subordinate CA, you must use a key algorithm supported by the parent CA.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-acmpca-certificateauthority.html#cfn-acmpca-certificateauthority-keyalgorithm)
     *
     * @param keyAlgorithm Type of the public key algorithm and size, in bits, of the key pair that
     *   your CA creates when it issues a certificate.
     */
    public fun keyAlgorithm(keyAlgorithm: String) {
        cdkBuilder.keyAlgorithm(keyAlgorithm)
    }

    /**
     * Specifies a cryptographic key management compliance standard used for handling CA keys.
     *
     * Default: FIPS_140_2_LEVEL_3_OR_HIGHER
     *
     * Some AWS Regions do not support the default. When creating a CA in these Regions, you must
     * provide `FIPS_140_2_LEVEL_2_OR_HIGHER` as the argument for `KeyStorageSecurityStandard` .
     * Failure to do this results in an `InvalidArgsException` with the message, "A certificate
     * authority cannot be created in this region with the specified security standard."
     *
     * For information about security standard support in various Regions, see
     * [Storage and security compliance of AWS Private CA private keys](https://docs.aws.amazon.com/privateca/latest/userguide/data-protection.html#private-keys)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-acmpca-certificateauthority.html#cfn-acmpca-certificateauthority-keystoragesecuritystandard)
     *
     * @param keyStorageSecurityStandard Specifies a cryptographic key management compliance
     *   standard used for handling CA keys.
     */
    public fun keyStorageSecurityStandard(keyStorageSecurityStandard: String) {
        cdkBuilder.keyStorageSecurityStandard(keyStorageSecurityStandard)
    }

    /**
     * Certificate revocation information used by the
     * [CreateCertificateAuthority](https://docs.aws.amazon.com/privateca/latest/APIReference/API_CreateCertificateAuthority.html)
     * and
     * [UpdateCertificateAuthority](https://docs.aws.amazon.com/privateca/latest/APIReference/API_UpdateCertificateAuthority.html)
     * actions. Your private certificate authority (CA) can configure Online Certificate Status
     * Protocol (OCSP) support and/or maintain a certificate revocation list (CRL). OCSP returns
     * validation information about certificates as requested by clients, and a CRL contains an
     * updated list of certificates revoked by your CA. For more information, see
     * [RevokeCertificate](https://docs.aws.amazon.com/privateca/latest/APIReference/API_RevokeCertificate.html)
     * in the *AWS Private CA API Reference* and
     * [Setting up a certificate revocation method](https://docs.aws.amazon.com/privateca/latest/userguide/revocation-setup.html)
     * in the *AWS Private CA User Guide* .
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
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-acmpca-certificateauthority.html#cfn-acmpca-certificateauthority-revocationconfiguration)
     *
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
     */
    public fun revocationConfiguration(revocationConfiguration: IResolvable) {
        cdkBuilder.revocationConfiguration(revocationConfiguration)
    }

    /**
     * Certificate revocation information used by the
     * [CreateCertificateAuthority](https://docs.aws.amazon.com/privateca/latest/APIReference/API_CreateCertificateAuthority.html)
     * and
     * [UpdateCertificateAuthority](https://docs.aws.amazon.com/privateca/latest/APIReference/API_UpdateCertificateAuthority.html)
     * actions. Your private certificate authority (CA) can configure Online Certificate Status
     * Protocol (OCSP) support and/or maintain a certificate revocation list (CRL). OCSP returns
     * validation information about certificates as requested by clients, and a CRL contains an
     * updated list of certificates revoked by your CA. For more information, see
     * [RevokeCertificate](https://docs.aws.amazon.com/privateca/latest/APIReference/API_RevokeCertificate.html)
     * in the *AWS Private CA API Reference* and
     * [Setting up a certificate revocation method](https://docs.aws.amazon.com/privateca/latest/userguide/revocation-setup.html)
     * in the *AWS Private CA User Guide* .
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
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-acmpca-certificateauthority.html#cfn-acmpca-certificateauthority-revocationconfiguration)
     *
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
     */
    public fun revocationConfiguration(
        revocationConfiguration: CfnCertificateAuthority.RevocationConfigurationProperty
    ) {
        cdkBuilder.revocationConfiguration(revocationConfiguration)
    }

    /**
     * Name of the algorithm your private CA uses to sign certificate requests.
     *
     * This parameter should not be confused with the `SigningAlgorithm` parameter used to sign
     * certificates when they are issued.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-acmpca-certificateauthority.html#cfn-acmpca-certificateauthority-signingalgorithm)
     *
     * @param signingAlgorithm Name of the algorithm your private CA uses to sign certificate
     *   requests.
     */
    public fun signingAlgorithm(signingAlgorithm: String) {
        cdkBuilder.signingAlgorithm(signingAlgorithm)
    }

    /**
     * Structure that contains X.500 distinguished name information for your private CA.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-acmpca-certificateauthority.html#cfn-acmpca-certificateauthority-subject)
     *
     * @param subject Structure that contains X.500 distinguished name information for your private
     *   CA.
     */
    public fun subject(subject: IResolvable) {
        cdkBuilder.subject(subject)
    }

    /**
     * Structure that contains X.500 distinguished name information for your private CA.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-acmpca-certificateauthority.html#cfn-acmpca-certificateauthority-subject)
     *
     * @param subject Structure that contains X.500 distinguished name information for your private
     *   CA.
     */
    public fun subject(subject: CfnCertificateAuthority.SubjectProperty) {
        cdkBuilder.subject(subject)
    }

    /**
     * Key-value pairs that will be attached to the new private CA.
     *
     * You can associate up to 50 tags with a private CA. For information using tags with IAM to
     * manage permissions, see
     * [Controlling Access Using IAM Tags](https://docs.aws.amazon.com/IAM/latest/UserGuide/access_iam-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-acmpca-certificateauthority.html#cfn-acmpca-certificateauthority-tags)
     *
     * @param tags Key-value pairs that will be attached to the new private CA.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * Key-value pairs that will be attached to the new private CA.
     *
     * You can associate up to 50 tags with a private CA. For information using tags with IAM to
     * manage permissions, see
     * [Controlling Access Using IAM Tags](https://docs.aws.amazon.com/IAM/latest/UserGuide/access_iam-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-acmpca-certificateauthority.html#cfn-acmpca-certificateauthority-tags)
     *
     * @param tags Key-value pairs that will be attached to the new private CA.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    /**
     * Type of your private CA.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-acmpca-certificateauthority.html#cfn-acmpca-certificateauthority-type)
     *
     * @param type Type of your private CA.
     */
    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    /**
     * Specifies whether the CA issues general-purpose certificates that typically require a
     * revocation mechanism, or short-lived certificates that may optionally omit revocation because
     * they expire quickly.
     *
     * Short-lived certificate validity is limited to seven days.
     *
     * The default value is GENERAL_PURPOSE.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-acmpca-certificateauthority.html#cfn-acmpca-certificateauthority-usagemode)
     *
     * @param usageMode Specifies whether the CA issues general-purpose certificates that typically
     *   require a revocation mechanism, or short-lived certificates that may optionally omit
     *   revocation because they expire quickly.
     */
    public fun usageMode(usageMode: String) {
        cdkBuilder.usageMode(usageMode)
    }

    public fun build(): CfnCertificateAuthority {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
