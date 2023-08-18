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
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.acmpca.CfnCertificate
import software.amazon.awscdk.services.acmpca.CfnCertificateProps

/**
 * Properties for defining a `CfnCertificate`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.acmpca.*;
 * CfnCertificateProps cfnCertificateProps = CfnCertificateProps.builder()
 * .certificateAuthorityArn("certificateAuthorityArn")
 * .certificateSigningRequest("certificateSigningRequest")
 * .signingAlgorithm("signingAlgorithm")
 * .validity(ValidityProperty.builder()
 * .type("type")
 * .value(123)
 * .build())
 * // the properties below are optional
 * .apiPassthrough(ApiPassthroughProperty.builder()
 * .extensions(ExtensionsProperty.builder()
 * .certificatePolicies(List.of(PolicyInformationProperty.builder()
 * .certPolicyId("certPolicyId")
 * // the properties below are optional
 * .policyQualifiers(List.of(PolicyQualifierInfoProperty.builder()
 * .policyQualifierId("policyQualifierId")
 * .qualifier(QualifierProperty.builder()
 * .cpsUri("cpsUri")
 * .build())
 * .build()))
 * .build()))
 * .customExtensions(List.of(CustomExtensionProperty.builder()
 * .objectIdentifier("objectIdentifier")
 * .value("value")
 * // the properties below are optional
 * .critical(false)
 * .build()))
 * .extendedKeyUsage(List.of(ExtendedKeyUsageProperty.builder()
 * .extendedKeyUsageObjectIdentifier("extendedKeyUsageObjectIdentifier")
 * .extendedKeyUsageType("extendedKeyUsageType")
 * .build()))
 * .keyUsage(KeyUsageProperty.builder()
 * .crlSign(false)
 * .dataEncipherment(false)
 * .decipherOnly(false)
 * .digitalSignature(false)
 * .encipherOnly(false)
 * .keyAgreement(false)
 * .keyCertSign(false)
 * .keyEncipherment(false)
 * .nonRepudiation(false)
 * .build())
 * .subjectAlternativeNames(List.of(GeneralNameProperty.builder()
 * .directoryName(SubjectProperty.builder()
 * .commonName("commonName")
 * .country("country")
 * .customAttributes(List.of(CustomAttributeProperty.builder()
 * .objectIdentifier("objectIdentifier")
 * .value("value")
 * .build()))
 * .distinguishedNameQualifier("distinguishedNameQualifier")
 * .generationQualifier("generationQualifier")
 * .givenName("givenName")
 * .initials("initials")
 * .locality("locality")
 * .organization("organization")
 * .organizationalUnit("organizationalUnit")
 * .pseudonym("pseudonym")
 * .serialNumber("serialNumber")
 * .state("state")
 * .surname("surname")
 * .title("title")
 * .build())
 * .dnsName("dnsName")
 * .ediPartyName(EdiPartyNameProperty.builder()
 * .nameAssigner("nameAssigner")
 * .partyName("partyName")
 * .build())
 * .ipAddress("ipAddress")
 * .otherName(OtherNameProperty.builder()
 * .typeId("typeId")
 * .value("value")
 * .build())
 * .registeredId("registeredId")
 * .rfc822Name("rfc822Name")
 * .uniformResourceIdentifier("uniformResourceIdentifier")
 * .build()))
 * .build())
 * .subject(SubjectProperty.builder()
 * .commonName("commonName")
 * .country("country")
 * .customAttributes(List.of(CustomAttributeProperty.builder()
 * .objectIdentifier("objectIdentifier")
 * .value("value")
 * .build()))
 * .distinguishedNameQualifier("distinguishedNameQualifier")
 * .generationQualifier("generationQualifier")
 * .givenName("givenName")
 * .initials("initials")
 * .locality("locality")
 * .organization("organization")
 * .organizationalUnit("organizationalUnit")
 * .pseudonym("pseudonym")
 * .serialNumber("serialNumber")
 * .state("state")
 * .surname("surname")
 * .title("title")
 * .build())
 * .build())
 * .templateArn("templateArn")
 * .validityNotBefore(ValidityProperty.builder()
 * .type("type")
 * .value(123)
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-acmpca-certificate.html)
 */
@CdkDslMarker
public class CfnCertificatePropsDsl {
    private val cdkBuilder: CfnCertificateProps.Builder = CfnCertificateProps.builder()

    /**
     * @param apiPassthrough Specifies X.509 certificate information to be included in the issued
     *   certificate. An `APIPassthrough` or `APICSRPassthrough` template variant must be selected,
     *   or else this parameter is ignored.
     */
    public fun apiPassthrough(apiPassthrough: IResolvable) {
        cdkBuilder.apiPassthrough(apiPassthrough)
    }

    /**
     * @param apiPassthrough Specifies X.509 certificate information to be included in the issued
     *   certificate. An `APIPassthrough` or `APICSRPassthrough` template variant must be selected,
     *   or else this parameter is ignored.
     */
    public fun apiPassthrough(apiPassthrough: CfnCertificate.ApiPassthroughProperty) {
        cdkBuilder.apiPassthrough(apiPassthrough)
    }

    /**
     * @param certificateAuthorityArn The Amazon Resource Name (ARN) for the private CA issues the
     *   certificate.
     */
    public fun certificateAuthorityArn(certificateAuthorityArn: String) {
        cdkBuilder.certificateAuthorityArn(certificateAuthorityArn)
    }

    /**
     * @param certificateSigningRequest The certificate signing request (CSR) for the certificate.
     */
    public fun certificateSigningRequest(certificateSigningRequest: String) {
        cdkBuilder.certificateSigningRequest(certificateSigningRequest)
    }

    /**
     * @param signingAlgorithm The name of the algorithm that will be used to sign the certificate
     *   to be issued. This parameter should not be confused with the `SigningAlgorithm` parameter
     *   used to sign a CSR in the `CreateCertificateAuthority` action.
     *
     * The specified signing algorithm family (RSA or ECDSA) must match the algorithm family of the
     * CA's secret key.
     */
    public fun signingAlgorithm(signingAlgorithm: String) {
        cdkBuilder.signingAlgorithm(signingAlgorithm)
    }

    /**
     * @param templateArn Specifies a custom configuration template to use when issuing a
     *   certificate. If this parameter is not provided, AWS Private CA defaults to the
     *   `EndEntityCertificate/V1` template. For more information about AWS Private CA templates,
     *   see
     *   [Using Templates](https://docs.aws.amazon.com/privateca/latest/userguide/UsingTemplates.html)
     *   .
     */
    public fun templateArn(templateArn: String) {
        cdkBuilder.templateArn(templateArn)
    }

    /** @param validity The period of time during which the certificate will be valid. */
    public fun validity(validity: IResolvable) {
        cdkBuilder.validity(validity)
    }

    /** @param validity The period of time during which the certificate will be valid. */
    public fun validity(validity: CfnCertificate.ValidityProperty) {
        cdkBuilder.validity(validity)
    }

    /**
     * @param validityNotBefore Information describing the start of the validity period of the
     *   certificate. This parameter sets the “Not Before" date for the certificate.
     *
     * By default, when issuing a certificate, AWS Private CA sets the "Not Before" date to the
     * issuance time minus 60 minutes. This compensates for clock inconsistencies across computer
     * systems. The `ValidityNotBefore` parameter can be used to customize the “Not Before” value.
     *
     * Unlike the `Validity` parameter, the `ValidityNotBefore` parameter is optional.
     *
     * The `ValidityNotBefore` value is expressed as an explicit date and time, using the `Validity`
     * type value `ABSOLUTE` .
     */
    public fun validityNotBefore(validityNotBefore: IResolvable) {
        cdkBuilder.validityNotBefore(validityNotBefore)
    }

    /**
     * @param validityNotBefore Information describing the start of the validity period of the
     *   certificate. This parameter sets the “Not Before" date for the certificate.
     *
     * By default, when issuing a certificate, AWS Private CA sets the "Not Before" date to the
     * issuance time minus 60 minutes. This compensates for clock inconsistencies across computer
     * systems. The `ValidityNotBefore` parameter can be used to customize the “Not Before” value.
     *
     * Unlike the `Validity` parameter, the `ValidityNotBefore` parameter is optional.
     *
     * The `ValidityNotBefore` value is expressed as an explicit date and time, using the `Validity`
     * type value `ABSOLUTE` .
     */
    public fun validityNotBefore(validityNotBefore: CfnCertificate.ValidityProperty) {
        cdkBuilder.validityNotBefore(validityNotBefore)
    }

    public fun build(): CfnCertificateProps = cdkBuilder.build()
}
