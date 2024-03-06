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
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Map
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.pcaconnectorad.CfnTemplate
import software.constructs.Construct

/**
 * Creates an Active Directory compatible certificate template.
 *
 * The connectors issues certificates using these templates based on the requester’s Active
 * Directory group membership.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.pcaconnectorad.*;
 * CfnTemplate cfnTemplate = CfnTemplate.Builder.create(this, "MyCfnTemplate")
 * .connectorArn("connectorArn")
 * .definition(TemplateDefinitionProperty.builder()
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
 * .build())
 * .name("name")
 * // the properties below are optional
 * .reenrollAllCertificateHolders(false)
 * .tags(Map.of(
 * "tagsKey", "tags"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcaconnectorad-template.html)
 */
@CdkDslMarker
public class CfnTemplateDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnTemplate.Builder = CfnTemplate.Builder.create(scope, id)

    /**
     * The Amazon Resource Name (ARN) that was returned when you called
     * [CreateConnector](https://docs.aws.amazon.com/pca-connector-ad/latest/APIReference/API_CreateConnector.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcaconnectorad-template.html#cfn-pcaconnectorad-template-connectorarn)
     *
     * @param connectorArn The Amazon Resource Name (ARN) that was returned when you called
     *   [CreateConnector](https://docs.aws.amazon.com/pca-connector-ad/latest/APIReference/API_CreateConnector.html)
     *   .
     */
    public fun connectorArn(connectorArn: String) {
        cdkBuilder.connectorArn(connectorArn)
    }

    /**
     * Template configuration to define the information included in certificates.
     *
     * Define certificate validity and renewal periods, certificate request handling and enrollment
     * options, key usage extensions, application policies, and cryptography settings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcaconnectorad-template.html#cfn-pcaconnectorad-template-definition)
     *
     * @param definition Template configuration to define the information included in certificates.
     */
    public fun definition(definition: IResolvable) {
        cdkBuilder.definition(definition)
    }

    /**
     * Template configuration to define the information included in certificates.
     *
     * Define certificate validity and renewal periods, certificate request handling and enrollment
     * options, key usage extensions, application policies, and cryptography settings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcaconnectorad-template.html#cfn-pcaconnectorad-template-definition)
     *
     * @param definition Template configuration to define the information included in certificates.
     */
    public fun definition(definition: CfnTemplate.TemplateDefinitionProperty) {
        cdkBuilder.definition(definition)
    }

    /**
     * Name of the templates.
     *
     * Template names must be unique.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcaconnectorad-template.html#cfn-pcaconnectorad-template-name)
     *
     * @param name Name of the templates.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * This setting allows the major version of a template to be increased automatically.
     *
     * All members of Active Directory groups that are allowed to enroll with a template will
     * receive a new certificate issued using that template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcaconnectorad-template.html#cfn-pcaconnectorad-template-reenrollallcertificateholders)
     *
     * @param reenrollAllCertificateHolders This setting allows the major version of a template to
     *   be increased automatically.
     */
    public fun reenrollAllCertificateHolders(reenrollAllCertificateHolders: Boolean) {
        cdkBuilder.reenrollAllCertificateHolders(reenrollAllCertificateHolders)
    }

    /**
     * This setting allows the major version of a template to be increased automatically.
     *
     * All members of Active Directory groups that are allowed to enroll with a template will
     * receive a new certificate issued using that template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcaconnectorad-template.html#cfn-pcaconnectorad-template-reenrollallcertificateholders)
     *
     * @param reenrollAllCertificateHolders This setting allows the major version of a template to
     *   be increased automatically.
     */
    public fun reenrollAllCertificateHolders(reenrollAllCertificateHolders: IResolvable) {
        cdkBuilder.reenrollAllCertificateHolders(reenrollAllCertificateHolders)
    }

    /**
     * Metadata assigned to a template consisting of a key-value pair.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcaconnectorad-template.html#cfn-pcaconnectorad-template-tags)
     *
     * @param tags Metadata assigned to a template consisting of a key-value pair.
     */
    public fun tags(tags: Map<String, String>) {
        cdkBuilder.tags(tags)
    }

    public fun build(): CfnTemplate = cdkBuilder.build()
}
