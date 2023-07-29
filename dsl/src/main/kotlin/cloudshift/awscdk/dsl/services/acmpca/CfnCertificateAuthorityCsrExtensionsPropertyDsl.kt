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
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.acmpca.CfnCertificateAuthority

/**
 * Describes the certificate extensions to be added to the certificate signing request (CSR).
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.acmpca.*;
 * CsrExtensionsProperty csrExtensionsProperty = CsrExtensionsProperty.builder()
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
 * .subjectInformationAccess(List.of(AccessDescriptionProperty.builder()
 * .accessLocation(GeneralNameProperty.builder()
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
 * .build())
 * .accessMethod(AccessMethodProperty.builder()
 * .accessMethodType("accessMethodType")
 * .customObjectIdentifier("customObjectIdentifier")
 * .build())
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificateauthority-csrextensions.html)
 */
@CdkDslMarker
public class CfnCertificateAuthorityCsrExtensionsPropertyDsl {
    private val cdkBuilder: CfnCertificateAuthority.CsrExtensionsProperty.Builder =
        CfnCertificateAuthority.CsrExtensionsProperty.builder()

    private val _subjectInformationAccess: MutableList<Any> = mutableListOf()

    /**
     * @param keyUsage Indicates the purpose of the certificate and of the key contained in the
     *   certificate.
     */
    public fun keyUsage(keyUsage: IResolvable) {
        cdkBuilder.keyUsage(keyUsage)
    }

    /**
     * @param keyUsage Indicates the purpose of the certificate and of the key contained in the
     *   certificate.
     */
    public fun keyUsage(keyUsage: CfnCertificateAuthority.KeyUsageProperty) {
        cdkBuilder.keyUsage(keyUsage)
    }

    /**
     * @param subjectInformationAccess For CA certificates, provides a path to additional
     *   information pertaining to the CA, such as revocation and policy. For more information, see
     *   [Subject Information Access](https://docs.aws.amazon.com/https://datatracker.ietf.org/doc/html/rfc5280#section-4.2.2.2)
     *   in RFC 5280.
     */
    public fun subjectInformationAccess(vararg subjectInformationAccess: Any) {
        _subjectInformationAccess.addAll(listOf(*subjectInformationAccess))
    }

    /**
     * @param subjectInformationAccess For CA certificates, provides a path to additional
     *   information pertaining to the CA, such as revocation and policy. For more information, see
     *   [Subject Information Access](https://docs.aws.amazon.com/https://datatracker.ietf.org/doc/html/rfc5280#section-4.2.2.2)
     *   in RFC 5280.
     */
    public fun subjectInformationAccess(subjectInformationAccess: Collection<Any>) {
        _subjectInformationAccess.addAll(subjectInformationAccess)
    }

    /**
     * @param subjectInformationAccess For CA certificates, provides a path to additional
     *   information pertaining to the CA, such as revocation and policy. For more information, see
     *   [Subject Information Access](https://docs.aws.amazon.com/https://datatracker.ietf.org/doc/html/rfc5280#section-4.2.2.2)
     *   in RFC 5280.
     */
    public fun subjectInformationAccess(subjectInformationAccess: IResolvable) {
        cdkBuilder.subjectInformationAccess(subjectInformationAccess)
    }

    public fun build(): CfnCertificateAuthority.CsrExtensionsProperty {
        if (_subjectInformationAccess.isNotEmpty())
            cdkBuilder.subjectInformationAccess(_subjectInformationAccess)
        return cdkBuilder.build()
    }
}
