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

package io.cloudshiftdev.awscdkdsl.services.pcaconnectorad

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.pcaconnectorad.CfnTemplate

/**
 * v4 template schema that can use either Legacy Cryptographic Providers or Key Storage Providers.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.pcaconnectorad.*;
 * TemplateV4Property templateV4Property = TemplateV4Property.builder()
 * .certificateValidity(CertificateValidityProperty.builder()
 * .renewalPeriod(ValidityPeriodProperty.builder()
 * .period(123)
 * .periodType("periodType")
 * .build())
 * .validityPeriod(ValidityPeriodProperty.builder()
 * .period(123)
 * .periodType("periodType")
 * .build())
 * .build())
 * .enrollmentFlags(EnrollmentFlagsV4Property.builder()
 * .enableKeyReuseOnNtTokenKeysetStorageFull(false)
 * .includeSymmetricAlgorithms(false)
 * .noSecurityExtension(false)
 * .removeInvalidCertificateFromPersonalStore(false)
 * .userInteractionRequired(false)
 * .build())
 * .extensions(ExtensionsV4Property.builder()
 * .keyUsage(KeyUsageProperty.builder()
 * .usageFlags(KeyUsageFlagsProperty.builder()
 * .dataEncipherment(false)
 * .digitalSignature(false)
 * .keyAgreement(false)
 * .keyEncipherment(false)
 * .nonRepudiation(false)
 * .build())
 * // the properties below are optional
 * .critical(false)
 * .build())
 * // the properties below are optional
 * .applicationPolicies(ApplicationPoliciesProperty.builder()
 * .policies(List.of(ApplicationPolicyProperty.builder()
 * .policyObjectIdentifier("policyObjectIdentifier")
 * .policyType("policyType")
 * .build()))
 * // the properties below are optional
 * .critical(false)
 * .build())
 * .build())
 * .generalFlags(GeneralFlagsV4Property.builder()
 * .autoEnrollment(false)
 * .machineType(false)
 * .build())
 * .privateKeyAttributes(PrivateKeyAttributesV4Property.builder()
 * .keySpec("keySpec")
 * .minimalKeyLength(123)
 * // the properties below are optional
 * .algorithm("algorithm")
 * .cryptoProviders(List.of("cryptoProviders"))
 * .keyUsageProperty(KeyUsagePropertyProperty.builder()
 * .propertyFlags(KeyUsagePropertyFlagsProperty.builder()
 * .decrypt(false)
 * .keyAgreement(false)
 * .sign(false)
 * .build())
 * .propertyType("propertyType")
 * .build())
 * .build())
 * .privateKeyFlags(PrivateKeyFlagsV4Property.builder()
 * .clientVersion("clientVersion")
 * // the properties below are optional
 * .exportableKey(false)
 * .requireAlternateSignatureAlgorithm(false)
 * .requireSameKeyRenewal(false)
 * .strongKeyProtectionRequired(false)
 * .useLegacyProvider(false)
 * .build())
 * .subjectNameFlags(SubjectNameFlagsV4Property.builder()
 * .requireCommonName(false)
 * .requireDirectoryPath(false)
 * .requireDnsAsCn(false)
 * .requireEmail(false)
 * .sanRequireDirectoryGuid(false)
 * .sanRequireDns(false)
 * .sanRequireDomainDns(false)
 * .sanRequireEmail(false)
 * .sanRequireSpn(false)
 * .sanRequireUpn(false)
 * .build())
 * // the properties below are optional
 * .hashAlgorithm("hashAlgorithm")
 * .supersededTemplates(List.of("supersededTemplates"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-templatev4.html)
 */
@CdkDslMarker
public class CfnTemplateTemplateV4PropertyDsl {
    private val cdkBuilder: CfnTemplate.TemplateV4Property.Builder =
        CfnTemplate.TemplateV4Property.builder()

    private val _supersededTemplates: MutableList<String> = mutableListOf()

    /**
     * @param certificateValidity Certificate validity describes the validity and renewal periods of
     *   a certificate.
     */
    public fun certificateValidity(certificateValidity: IResolvable) {
        cdkBuilder.certificateValidity(certificateValidity)
    }

    /**
     * @param certificateValidity Certificate validity describes the validity and renewal periods of
     *   a certificate.
     */
    public fun certificateValidity(certificateValidity: CfnTemplate.CertificateValidityProperty) {
        cdkBuilder.certificateValidity(certificateValidity)
    }

    /**
     * @param enrollmentFlags Enrollment flags describe the enrollment settings for certificates
     *   using the existing private key and deleting expired or revoked certificates.
     */
    public fun enrollmentFlags(enrollmentFlags: IResolvable) {
        cdkBuilder.enrollmentFlags(enrollmentFlags)
    }

    /**
     * @param enrollmentFlags Enrollment flags describe the enrollment settings for certificates
     *   using the existing private key and deleting expired or revoked certificates.
     */
    public fun enrollmentFlags(enrollmentFlags: CfnTemplate.EnrollmentFlagsV4Property) {
        cdkBuilder.enrollmentFlags(enrollmentFlags)
    }

    /**
     * @param extensions Extensions describe the key usage extensions and application policies for a
     *   template.
     */
    public fun extensions(extensions: IResolvable) {
        cdkBuilder.extensions(extensions)
    }

    /**
     * @param extensions Extensions describe the key usage extensions and application policies for a
     *   template.
     */
    public fun extensions(extensions: CfnTemplate.ExtensionsV4Property) {
        cdkBuilder.extensions(extensions)
    }

    /**
     * @param generalFlags General flags describe whether the template is used for computers or
     *   users and if the template can be used with autoenrollment.
     */
    public fun generalFlags(generalFlags: IResolvable) {
        cdkBuilder.generalFlags(generalFlags)
    }

    /**
     * @param generalFlags General flags describe whether the template is used for computers or
     *   users and if the template can be used with autoenrollment.
     */
    public fun generalFlags(generalFlags: CfnTemplate.GeneralFlagsV4Property) {
        cdkBuilder.generalFlags(generalFlags)
    }

    /**
     * @param hashAlgorithm Specifies the hash algorithm used to hash the private key. Hash
     *   algorithm can only be specified when using Key Storage Providers.
     */
    public fun hashAlgorithm(hashAlgorithm: String) {
        cdkBuilder.hashAlgorithm(hashAlgorithm)
    }

    /**
     * @param privateKeyAttributes Private key attributes allow you to specify the minimal key
     *   length, key spec, key usage, and cryptographic providers for the private key of a
     *   certificate for v4 templates. V4 templates allow you to use either Key Storage Providers or
     *   Legacy Cryptographic Service Providers. You specify the cryptography provider category in
     *   private key flags.
     */
    public fun privateKeyAttributes(privateKeyAttributes: IResolvable) {
        cdkBuilder.privateKeyAttributes(privateKeyAttributes)
    }

    /**
     * @param privateKeyAttributes Private key attributes allow you to specify the minimal key
     *   length, key spec, key usage, and cryptographic providers for the private key of a
     *   certificate for v4 templates. V4 templates allow you to use either Key Storage Providers or
     *   Legacy Cryptographic Service Providers. You specify the cryptography provider category in
     *   private key flags.
     */
    public fun privateKeyAttributes(
        privateKeyAttributes: CfnTemplate.PrivateKeyAttributesV4Property
    ) {
        cdkBuilder.privateKeyAttributes(privateKeyAttributes)
    }

    /**
     * @param privateKeyFlags Private key flags for v4 templates specify the client compatibility,
     *   if the private key can be exported, if user input is required when using a private key, if
     *   an alternate signature algorithm should be used, and if certificates are renewed using the
     *   same private key.
     */
    public fun privateKeyFlags(privateKeyFlags: IResolvable) {
        cdkBuilder.privateKeyFlags(privateKeyFlags)
    }

    /**
     * @param privateKeyFlags Private key flags for v4 templates specify the client compatibility,
     *   if the private key can be exported, if user input is required when using a private key, if
     *   an alternate signature algorithm should be used, and if certificates are renewed using the
     *   same private key.
     */
    public fun privateKeyFlags(privateKeyFlags: CfnTemplate.PrivateKeyFlagsV4Property) {
        cdkBuilder.privateKeyFlags(privateKeyFlags)
    }

    /**
     * @param subjectNameFlags Subject name flags describe the subject name and subject alternate
     *   name that is included in a certificate.
     */
    public fun subjectNameFlags(subjectNameFlags: IResolvable) {
        cdkBuilder.subjectNameFlags(subjectNameFlags)
    }

    /**
     * @param subjectNameFlags Subject name flags describe the subject name and subject alternate
     *   name that is included in a certificate.
     */
    public fun subjectNameFlags(subjectNameFlags: CfnTemplate.SubjectNameFlagsV4Property) {
        cdkBuilder.subjectNameFlags(subjectNameFlags)
    }

    /**
     * @param supersededTemplates List of templates in Active Directory that are superseded by this
     *   template.
     */
    public fun supersededTemplates(vararg supersededTemplates: String) {
        _supersededTemplates.addAll(listOf(*supersededTemplates))
    }

    /**
     * @param supersededTemplates List of templates in Active Directory that are superseded by this
     *   template.
     */
    public fun supersededTemplates(supersededTemplates: Collection<String>) {
        _supersededTemplates.addAll(supersededTemplates)
    }

    public fun build(): CfnTemplate.TemplateV4Property {
        if (_supersededTemplates.isNotEmpty()) cdkBuilder.supersededTemplates(_supersededTemplates)
        return cdkBuilder.build()
    }
}
