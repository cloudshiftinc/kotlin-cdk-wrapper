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
import software.amazon.awscdk.services.acmpca.CfnCertificate

/**
 * Contains X.509 extension information for a certificate.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.acmpca.*;
 * ExtensionsProperty extensionsProperty = ExtensionsProperty.builder()
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
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificate-extensions.html)
 */
@CdkDslMarker
public class CfnCertificateExtensionsPropertyDsl {
    private val cdkBuilder: CfnCertificate.ExtensionsProperty.Builder =
        CfnCertificate.ExtensionsProperty.builder()

    private val _certificatePolicies: MutableList<Any> = mutableListOf()

    private val _customExtensions: MutableList<Any> = mutableListOf()

    private val _extendedKeyUsage: MutableList<Any> = mutableListOf()

    private val _subjectAlternativeNames: MutableList<Any> = mutableListOf()

    /**
     * @param certificatePolicies Contains a sequence of one or more policy information terms, each
     *   of which consists of an object identifier (OID) and optional qualifiers. For more
     *   information, see NIST's definition of
     *   [Object Identifier (OID)](https://docs.aws.amazon.com/https://csrc.nist.gov/glossary/term/Object_Identifier)
     *   .
     *
     * In an end-entity certificate, these terms indicate the policy under which the certificate was
     * issued and the purposes for which it may be used. In a CA certificate, these terms limit the
     * set of policies for certification paths that include this certificate.
     */
    public fun certificatePolicies(vararg certificatePolicies: Any) {
        _certificatePolicies.addAll(listOf(*certificatePolicies))
    }

    /**
     * @param certificatePolicies Contains a sequence of one or more policy information terms, each
     *   of which consists of an object identifier (OID) and optional qualifiers. For more
     *   information, see NIST's definition of
     *   [Object Identifier (OID)](https://docs.aws.amazon.com/https://csrc.nist.gov/glossary/term/Object_Identifier)
     *   .
     *
     * In an end-entity certificate, these terms indicate the policy under which the certificate was
     * issued and the purposes for which it may be used. In a CA certificate, these terms limit the
     * set of policies for certification paths that include this certificate.
     */
    public fun certificatePolicies(certificatePolicies: Collection<Any>) {
        _certificatePolicies.addAll(certificatePolicies)
    }

    /**
     * @param certificatePolicies Contains a sequence of one or more policy information terms, each
     *   of which consists of an object identifier (OID) and optional qualifiers. For more
     *   information, see NIST's definition of
     *   [Object Identifier (OID)](https://docs.aws.amazon.com/https://csrc.nist.gov/glossary/term/Object_Identifier)
     *   .
     *
     * In an end-entity certificate, these terms indicate the policy under which the certificate was
     * issued and the purposes for which it may be used. In a CA certificate, these terms limit the
     * set of policies for certification paths that include this certificate.
     */
    public fun certificatePolicies(certificatePolicies: IResolvable) {
        cdkBuilder.certificatePolicies(certificatePolicies)
    }

    /**
     * @param customExtensions Contains a sequence of one or more X.509 extensions, each of which
     *   consists of an object identifier (OID), a base64-encoded value, and the critical flag. For
     *   more information, see the
     *   [Global OID reference database.](https://docs.aws.amazon.com/https://oidref.com/2.5.29).
     */
    public fun customExtensions(vararg customExtensions: Any) {
        _customExtensions.addAll(listOf(*customExtensions))
    }

    /**
     * @param customExtensions Contains a sequence of one or more X.509 extensions, each of which
     *   consists of an object identifier (OID), a base64-encoded value, and the critical flag. For
     *   more information, see the
     *   [Global OID reference database.](https://docs.aws.amazon.com/https://oidref.com/2.5.29).
     */
    public fun customExtensions(customExtensions: Collection<Any>) {
        _customExtensions.addAll(customExtensions)
    }

    /**
     * @param customExtensions Contains a sequence of one or more X.509 extensions, each of which
     *   consists of an object identifier (OID), a base64-encoded value, and the critical flag. For
     *   more information, see the
     *   [Global OID reference database.](https://docs.aws.amazon.com/https://oidref.com/2.5.29).
     */
    public fun customExtensions(customExtensions: IResolvable) {
        cdkBuilder.customExtensions(customExtensions)
    }

    /**
     * @param extendedKeyUsage Specifies additional purposes for which the certified public key may
     *   be used other than basic purposes indicated in the `KeyUsage` extension.
     */
    public fun extendedKeyUsage(vararg extendedKeyUsage: Any) {
        _extendedKeyUsage.addAll(listOf(*extendedKeyUsage))
    }

    /**
     * @param extendedKeyUsage Specifies additional purposes for which the certified public key may
     *   be used other than basic purposes indicated in the `KeyUsage` extension.
     */
    public fun extendedKeyUsage(extendedKeyUsage: Collection<Any>) {
        _extendedKeyUsage.addAll(extendedKeyUsage)
    }

    /**
     * @param extendedKeyUsage Specifies additional purposes for which the certified public key may
     *   be used other than basic purposes indicated in the `KeyUsage` extension.
     */
    public fun extendedKeyUsage(extendedKeyUsage: IResolvable) {
        cdkBuilder.extendedKeyUsage(extendedKeyUsage)
    }

    /**
     * @param keyUsage Defines one or more purposes for which the key contained in the certificate
     *   can be used. Default value for each option is false.
     */
    public fun keyUsage(keyUsage: IResolvable) {
        cdkBuilder.keyUsage(keyUsage)
    }

    /**
     * @param keyUsage Defines one or more purposes for which the key contained in the certificate
     *   can be used. Default value for each option is false.
     */
    public fun keyUsage(keyUsage: CfnCertificate.KeyUsageProperty) {
        cdkBuilder.keyUsage(keyUsage)
    }

    /**
     * @param subjectAlternativeNames The subject alternative name extension allows identities to be
     *   bound to the subject of the certificate. These identities may be included in addition to or
     *   in place of the identity in the subject field of the certificate.
     */
    public fun subjectAlternativeNames(vararg subjectAlternativeNames: Any) {
        _subjectAlternativeNames.addAll(listOf(*subjectAlternativeNames))
    }

    /**
     * @param subjectAlternativeNames The subject alternative name extension allows identities to be
     *   bound to the subject of the certificate. These identities may be included in addition to or
     *   in place of the identity in the subject field of the certificate.
     */
    public fun subjectAlternativeNames(subjectAlternativeNames: Collection<Any>) {
        _subjectAlternativeNames.addAll(subjectAlternativeNames)
    }

    /**
     * @param subjectAlternativeNames The subject alternative name extension allows identities to be
     *   bound to the subject of the certificate. These identities may be included in addition to or
     *   in place of the identity in the subject field of the certificate.
     */
    public fun subjectAlternativeNames(subjectAlternativeNames: IResolvable) {
        cdkBuilder.subjectAlternativeNames(subjectAlternativeNames)
    }

    public fun build(): CfnCertificate.ExtensionsProperty {
        if (_certificatePolicies.isNotEmpty()) cdkBuilder.certificatePolicies(_certificatePolicies)
        if (_customExtensions.isNotEmpty()) cdkBuilder.customExtensions(_customExtensions)
        if (_extendedKeyUsage.isNotEmpty()) cdkBuilder.extendedKeyUsage(_extendedKeyUsage)
        if (_subjectAlternativeNames.isNotEmpty())
            cdkBuilder.subjectAlternativeNames(_subjectAlternativeNames)
        return cdkBuilder.build()
    }
}
