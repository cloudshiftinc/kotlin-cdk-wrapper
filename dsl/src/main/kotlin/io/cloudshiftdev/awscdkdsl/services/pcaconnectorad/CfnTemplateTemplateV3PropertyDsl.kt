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
 * v3 template schema that uses Key Storage Providers.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.pcaconnectorad.*;
 * TemplateV3Property templateV3Property = TemplateV3Property.builder()
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
 * .enrollmentFlags(EnrollmentFlagsV3Property.builder()
 * .enableKeyReuseOnNtTokenKeysetStorageFull(false)
 * .includeSymmetricAlgorithms(false)
 * .noSecurityExtension(false)
 * .removeInvalidCertificateFromPersonalStore(false)
 * .userInteractionRequired(false)
 * .build())
 * .extensions(ExtensionsV3Property.builder()
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
 * .generalFlags(GeneralFlagsV3Property.builder()
 * .autoEnrollment(false)
 * .machineType(false)
 * .build())
 * .hashAlgorithm("hashAlgorithm")
 * .privateKeyAttributes(PrivateKeyAttributesV3Property.builder()
 * .algorithm("algorithm")
 * .keySpec("keySpec")
 * .keyUsageProperty(KeyUsagePropertyProperty.builder()
 * .propertyFlags(KeyUsagePropertyFlagsProperty.builder()
 * .decrypt(false)
 * .keyAgreement(false)
 * .sign(false)
 * .build())
 * .propertyType("propertyType")
 * .build())
 * .minimalKeyLength(123)
 * // the properties below are optional
 * .cryptoProviders(List.of("cryptoProviders"))
 * .build())
 * .privateKeyFlags(PrivateKeyFlagsV3Property.builder()
 * .clientVersion("clientVersion")
 * // the properties below are optional
 * .exportableKey(false)
 * .requireAlternateSignatureAlgorithm(false)
 * .strongKeyProtectionRequired(false)
 * .build())
 * .subjectNameFlags(SubjectNameFlagsV3Property.builder()
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
 * .supersededTemplates(List.of("supersededTemplates"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-templatev3.html)
 */
@CdkDslMarker
public class CfnTemplateTemplateV3PropertyDsl {
    private val cdkBuilder: CfnTemplate.TemplateV3Property.Builder =
        CfnTemplate.TemplateV3Property.builder()

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
     *   such as using the existing private key and deleting expired or revoked certificates.
     */
    public fun enrollmentFlags(enrollmentFlags: IResolvable) {
        cdkBuilder.enrollmentFlags(enrollmentFlags)
    }

    /**
     * @param enrollmentFlags Enrollment flags describe the enrollment settings for certificates
     *   such as using the existing private key and deleting expired or revoked certificates.
     */
    public fun enrollmentFlags(enrollmentFlags: CfnTemplate.EnrollmentFlagsV3Property) {
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
    public fun extensions(extensions: CfnTemplate.ExtensionsV3Property) {
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
    public fun generalFlags(generalFlags: CfnTemplate.GeneralFlagsV3Property) {
        cdkBuilder.generalFlags(generalFlags)
    }

    /** @param hashAlgorithm Specifies the hash algorithm used to hash the private key. */
    public fun hashAlgorithm(hashAlgorithm: String) {
        cdkBuilder.hashAlgorithm(hashAlgorithm)
    }

    /**
     * @param privateKeyAttributes Private key attributes allow you to specify the algorithm,
     *   minimal key length, key spec, key usage, and cryptographic providers for the private key of
     *   a certificate for v3 templates. V3 templates allow you to use Key Storage Providers.
     */
    public fun privateKeyAttributes(privateKeyAttributes: IResolvable) {
        cdkBuilder.privateKeyAttributes(privateKeyAttributes)
    }

    /**
     * @param privateKeyAttributes Private key attributes allow you to specify the algorithm,
     *   minimal key length, key spec, key usage, and cryptographic providers for the private key of
     *   a certificate for v3 templates. V3 templates allow you to use Key Storage Providers.
     */
    public fun privateKeyAttributes(
        privateKeyAttributes: CfnTemplate.PrivateKeyAttributesV3Property
    ) {
        cdkBuilder.privateKeyAttributes(privateKeyAttributes)
    }

    /**
     * @param privateKeyFlags Private key flags for v3 templates specify the client compatibility,
     *   if the private key can be exported, if user input is required when using a private key, and
     *   if an alternate signature algorithm should be used.
     */
    public fun privateKeyFlags(privateKeyFlags: IResolvable) {
        cdkBuilder.privateKeyFlags(privateKeyFlags)
    }

    /**
     * @param privateKeyFlags Private key flags for v3 templates specify the client compatibility,
     *   if the private key can be exported, if user input is required when using a private key, and
     *   if an alternate signature algorithm should be used.
     */
    public fun privateKeyFlags(privateKeyFlags: CfnTemplate.PrivateKeyFlagsV3Property) {
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
    public fun subjectNameFlags(subjectNameFlags: CfnTemplate.SubjectNameFlagsV3Property) {
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

    public fun build(): CfnTemplate.TemplateV3Property {
        if (_supersededTemplates.isNotEmpty()) cdkBuilder.supersededTemplates(_supersededTemplates)
        return cdkBuilder.build()
    }
}
