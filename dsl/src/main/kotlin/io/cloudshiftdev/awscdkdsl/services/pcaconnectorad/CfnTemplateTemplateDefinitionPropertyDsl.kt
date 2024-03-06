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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.pcaconnectorad.CfnTemplate

/**
 * Template configuration to define the information included in certificates.
 *
 * Define certificate validity and renewal periods, certificate request handling and enrollment
 * options, key usage extensions, application policies, and cryptography settings.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.pcaconnectorad.*;
 * TemplateDefinitionProperty templateDefinitionProperty = TemplateDefinitionProperty.builder()
 * .templateV2(TemplateV2Property.builder()
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
 * .enrollmentFlags(EnrollmentFlagsV2Property.builder()
 * .enableKeyReuseOnNtTokenKeysetStorageFull(false)
 * .includeSymmetricAlgorithms(false)
 * .noSecurityExtension(false)
 * .removeInvalidCertificateFromPersonalStore(false)
 * .userInteractionRequired(false)
 * .build())
 * .extensions(ExtensionsV2Property.builder()
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
 * .generalFlags(GeneralFlagsV2Property.builder()
 * .autoEnrollment(false)
 * .machineType(false)
 * .build())
 * .privateKeyAttributes(PrivateKeyAttributesV2Property.builder()
 * .keySpec("keySpec")
 * .minimalKeyLength(123)
 * // the properties below are optional
 * .cryptoProviders(List.of("cryptoProviders"))
 * .build())
 * .privateKeyFlags(PrivateKeyFlagsV2Property.builder()
 * .clientVersion("clientVersion")
 * // the properties below are optional
 * .exportableKey(false)
 * .strongKeyProtectionRequired(false)
 * .build())
 * .subjectNameFlags(SubjectNameFlagsV2Property.builder()
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
 * .build())
 * .templateV3(TemplateV3Property.builder()
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
 * .build())
 * .templateV4(TemplateV4Property.builder()
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
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-templatedefinition.html)
 */
@CdkDslMarker
public class CfnTemplateTemplateDefinitionPropertyDsl {
    private val cdkBuilder: CfnTemplate.TemplateDefinitionProperty.Builder =
        CfnTemplate.TemplateDefinitionProperty.builder()

    /**
     * @param templateV2 Template configuration to define the information included in certificates.
     *   Define certificate validity and renewal periods, certificate request handling and
     *   enrollment options, key usage extensions, application policies, and cryptography settings.
     */
    public fun templateV2(templateV2: IResolvable) {
        cdkBuilder.templateV2(templateV2)
    }

    /**
     * @param templateV2 Template configuration to define the information included in certificates.
     *   Define certificate validity and renewal periods, certificate request handling and
     *   enrollment options, key usage extensions, application policies, and cryptography settings.
     */
    public fun templateV2(templateV2: CfnTemplate.TemplateV2Property) {
        cdkBuilder.templateV2(templateV2)
    }

    /**
     * @param templateV3 Template configuration to define the information included in certificates.
     *   Define certificate validity and renewal periods, certificate request handling and
     *   enrollment options, key usage extensions, application policies, and cryptography settings.
     */
    public fun templateV3(templateV3: IResolvable) {
        cdkBuilder.templateV3(templateV3)
    }

    /**
     * @param templateV3 Template configuration to define the information included in certificates.
     *   Define certificate validity and renewal periods, certificate request handling and
     *   enrollment options, key usage extensions, application policies, and cryptography settings.
     */
    public fun templateV3(templateV3: CfnTemplate.TemplateV3Property) {
        cdkBuilder.templateV3(templateV3)
    }

    /**
     * @param templateV4 Template configuration to define the information included in certificates.
     *   Define certificate validity and renewal periods, certificate request handling and
     *   enrollment options, key usage extensions, application policies, and cryptography settings.
     */
    public fun templateV4(templateV4: IResolvable) {
        cdkBuilder.templateV4(templateV4)
    }

    /**
     * @param templateV4 Template configuration to define the information included in certificates.
     *   Define certificate validity and renewal periods, certificate request handling and
     *   enrollment options, key usage extensions, application policies, and cryptography settings.
     */
    public fun templateV4(templateV4: CfnTemplate.TemplateV4Property) {
        cdkBuilder.templateV4(templateV4)
    }

    public fun build(): CfnTemplate.TemplateDefinitionProperty = cdkBuilder.build()
}
