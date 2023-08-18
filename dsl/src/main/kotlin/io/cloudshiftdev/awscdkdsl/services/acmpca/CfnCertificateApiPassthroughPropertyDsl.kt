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
import software.amazon.awscdk.services.acmpca.CfnCertificate

/**
 * Contains X.509 certificate information to be placed in an issued certificate. An `APIPassthrough`
 * or `APICSRPassthrough` template variant must be selected, or else this parameter is ignored.
 *
 * If conflicting or duplicate certificate information is supplied from other sources, AWS Private
 * CA applies
 * [order of operation rules](https://docs.aws.amazon.com/privateca/latest/userguide/UsingTemplates.html#template-order-of-operations)
 * to determine what information is used.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.acmpca.*;
 * ApiPassthroughProperty apiPassthroughProperty = ApiPassthroughProperty.builder()
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
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificate-apipassthrough.html)
 */
@CdkDslMarker
public class CfnCertificateApiPassthroughPropertyDsl {
    private val cdkBuilder: CfnCertificate.ApiPassthroughProperty.Builder =
        CfnCertificate.ApiPassthroughProperty.builder()

    /** @param extensions Specifies X.509 extension information for a certificate. */
    public fun extensions(extensions: IResolvable) {
        cdkBuilder.extensions(extensions)
    }

    /** @param extensions Specifies X.509 extension information for a certificate. */
    public fun extensions(extensions: CfnCertificate.ExtensionsProperty) {
        cdkBuilder.extensions(extensions)
    }

    /**
     * @param subject Contains information about the certificate subject. The Subject field in the
     *   certificate identifies the entity that owns or controls the public key in the certificate.
     *   The entity can be a user, computer, device, or service. The Subject must contain an X.500
     *   distinguished name (DN). A DN is a sequence of relative distinguished names (RDNs). The
     *   RDNs are separated by commas in the certificate.
     */
    public fun subject(subject: IResolvable) {
        cdkBuilder.subject(subject)
    }

    /**
     * @param subject Contains information about the certificate subject. The Subject field in the
     *   certificate identifies the entity that owns or controls the public key in the certificate.
     *   The entity can be a user, computer, device, or service. The Subject must contain an X.500
     *   distinguished name (DN). A DN is a sequence of relative distinguished names (RDNs). The
     *   RDNs are separated by commas in the certificate.
     */
    public fun subject(subject: CfnCertificate.SubjectProperty) {
        cdkBuilder.subject(subject)
    }

    public fun build(): CfnCertificate.ApiPassthroughProperty = cdkBuilder.build()
}
