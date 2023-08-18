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

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.acmpca.CfnCertificateAuthority

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
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.acmpca.*;
 * RevocationConfigurationProperty revocationConfigurationProperty =
 * RevocationConfigurationProperty.builder()
 * .crlConfiguration(CrlConfigurationProperty.builder()
 * .customCname("customCname")
 * .enabled(false)
 * .expirationInDays(123)
 * .s3BucketName("s3BucketName")
 * .s3ObjectAcl("s3ObjectAcl")
 * .build())
 * .ocspConfiguration(OcspConfigurationProperty.builder()
 * .enabled(false)
 * .ocspCustomCname("ocspCustomCname")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificateauthority-revocationconfiguration.html)
 */
@CdkDslMarker
public class CfnCertificateAuthorityRevocationConfigurationPropertyDsl {
    private val cdkBuilder: CfnCertificateAuthority.RevocationConfigurationProperty.Builder =
        CfnCertificateAuthority.RevocationConfigurationProperty.builder()

    /**
     * @param crlConfiguration Configuration of the certificate revocation list (CRL), if any,
     *   maintained by your private CA.
     */
    public fun crlConfiguration(crlConfiguration: IResolvable) {
        cdkBuilder.crlConfiguration(crlConfiguration)
    }

    /**
     * @param crlConfiguration Configuration of the certificate revocation list (CRL), if any,
     *   maintained by your private CA.
     */
    public fun crlConfiguration(
        crlConfiguration: CfnCertificateAuthority.CrlConfigurationProperty
    ) {
        cdkBuilder.crlConfiguration(crlConfiguration)
    }

    /**
     * @param ocspConfiguration Configuration of Online Certificate Status Protocol (OCSP) support,
     *   if any, maintained by your private CA.
     */
    public fun ocspConfiguration(ocspConfiguration: IResolvable) {
        cdkBuilder.ocspConfiguration(ocspConfiguration)
    }

    /**
     * @param ocspConfiguration Configuration of Online Certificate Status Protocol (OCSP) support,
     *   if any, maintained by your private CA.
     */
    public fun ocspConfiguration(
        ocspConfiguration: CfnCertificateAuthority.OcspConfigurationProperty
    ) {
        cdkBuilder.ocspConfiguration(ocspConfiguration)
    }

    public fun build(): CfnCertificateAuthority.RevocationConfigurationProperty = cdkBuilder.build()
}
