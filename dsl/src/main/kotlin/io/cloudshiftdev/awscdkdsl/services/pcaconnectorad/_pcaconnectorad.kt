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

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.pcaconnectorad.CfnConnector
import software.amazon.awscdk.services.pcaconnectorad.CfnConnectorProps
import software.amazon.awscdk.services.pcaconnectorad.CfnDirectoryRegistration
import software.amazon.awscdk.services.pcaconnectorad.CfnDirectoryRegistrationProps
import software.amazon.awscdk.services.pcaconnectorad.CfnServicePrincipalName
import software.amazon.awscdk.services.pcaconnectorad.CfnServicePrincipalNameProps
import software.amazon.awscdk.services.pcaconnectorad.CfnTemplate
import software.amazon.awscdk.services.pcaconnectorad.CfnTemplateGroupAccessControlEntry
import software.amazon.awscdk.services.pcaconnectorad.CfnTemplateGroupAccessControlEntryProps
import software.amazon.awscdk.services.pcaconnectorad.CfnTemplateProps
import software.constructs.Construct

public object pcaconnectorad {
    /**
     * Creates a connector between AWS Private CA and an Active Directory.
     *
     * You must specify the private CA, directory ID, and security groups.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.pcaconnectorad.*;
     * CfnConnector cfnConnector = CfnConnector.Builder.create(this, "MyCfnConnector")
     * .certificateAuthorityArn("certificateAuthorityArn")
     * .directoryId("directoryId")
     * .vpcInformation(VpcInformationProperty.builder()
     * .securityGroupIds(List.of("securityGroupIds"))
     * .build())
     * // the properties below are optional
     * .tags(Map.of(
     * "tagsKey", "tags"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcaconnectorad-connector.html)
     */
    public inline fun cfnConnector(
        scope: Construct,
        id: String,
        block: CfnConnectorDsl.() -> Unit = {},
    ): CfnConnector {
        val builder = CfnConnectorDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnConnector`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.pcaconnectorad.*;
     * CfnConnectorProps cfnConnectorProps = CfnConnectorProps.builder()
     * .certificateAuthorityArn("certificateAuthorityArn")
     * .directoryId("directoryId")
     * .vpcInformation(VpcInformationProperty.builder()
     * .securityGroupIds(List.of("securityGroupIds"))
     * .build())
     * // the properties below are optional
     * .tags(Map.of(
     * "tagsKey", "tags"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcaconnectorad-connector.html)
     */
    public inline fun cfnConnectorProps(
        block: CfnConnectorPropsDsl.() -> Unit = {}
    ): CfnConnectorProps {
        val builder = CfnConnectorPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Information about your VPC and security groups used with the connector.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.pcaconnectorad.*;
     * VpcInformationProperty vpcInformationProperty = VpcInformationProperty.builder()
     * .securityGroupIds(List.of("securityGroupIds"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-connector-vpcinformation.html)
     */
    public inline fun cfnConnectorVpcInformationProperty(
        block: CfnConnectorVpcInformationPropertyDsl.() -> Unit = {}
    ): CfnConnector.VpcInformationProperty {
        val builder = CfnConnectorVpcInformationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Creates a directory registration that authorizes communication between AWS Private CA and an
     * Active Directory.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.pcaconnectorad.*;
     * CfnDirectoryRegistration cfnDirectoryRegistration =
     * CfnDirectoryRegistration.Builder.create(this, "MyCfnDirectoryRegistration")
     * .directoryId("directoryId")
     * // the properties below are optional
     * .tags(Map.of(
     * "tagsKey", "tags"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcaconnectorad-directoryregistration.html)
     */
    public inline fun cfnDirectoryRegistration(
        scope: Construct,
        id: String,
        block: CfnDirectoryRegistrationDsl.() -> Unit = {},
    ): CfnDirectoryRegistration {
        val builder = CfnDirectoryRegistrationDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnDirectoryRegistration`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.pcaconnectorad.*;
     * CfnDirectoryRegistrationProps cfnDirectoryRegistrationProps =
     * CfnDirectoryRegistrationProps.builder()
     * .directoryId("directoryId")
     * // the properties below are optional
     * .tags(Map.of(
     * "tagsKey", "tags"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcaconnectorad-directoryregistration.html)
     */
    public inline fun cfnDirectoryRegistrationProps(
        block: CfnDirectoryRegistrationPropsDsl.() -> Unit = {}
    ): CfnDirectoryRegistrationProps {
        val builder = CfnDirectoryRegistrationPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Creates a service principal name (SPN) for the service account in Active Directory.
     *
     * Kerberos authentication uses SPNs to associate a service instance with a service sign-in
     * account.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.pcaconnectorad.*;
     * CfnServicePrincipalName cfnServicePrincipalName = CfnServicePrincipalName.Builder.create(this,
     * "MyCfnServicePrincipalName")
     * .connectorArn("connectorArn")
     * .directoryRegistrationArn("directoryRegistrationArn")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcaconnectorad-serviceprincipalname.html)
     */
    public inline fun cfnServicePrincipalName(
        scope: Construct,
        id: String,
        block: CfnServicePrincipalNameDsl.() -> Unit = {},
    ): CfnServicePrincipalName {
        val builder = CfnServicePrincipalNameDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnServicePrincipalName`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.pcaconnectorad.*;
     * CfnServicePrincipalNameProps cfnServicePrincipalNameProps =
     * CfnServicePrincipalNameProps.builder()
     * .connectorArn("connectorArn")
     * .directoryRegistrationArn("directoryRegistrationArn")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcaconnectorad-serviceprincipalname.html)
     */
    public inline fun cfnServicePrincipalNameProps(
        block: CfnServicePrincipalNamePropsDsl.() -> Unit = {}
    ): CfnServicePrincipalNameProps {
        val builder = CfnServicePrincipalNamePropsDsl()
        builder.apply(block)
        return builder.build()
    }

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
    public inline fun cfnTemplate(
        scope: Construct,
        id: String,
        block: CfnTemplateDsl.() -> Unit = {},
    ): CfnTemplate {
        val builder = CfnTemplateDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Application policies describe what the certificate can be used for.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.pcaconnectorad.*;
     * ApplicationPoliciesProperty applicationPoliciesProperty = ApplicationPoliciesProperty.builder()
     * .policies(List.of(ApplicationPolicyProperty.builder()
     * .policyObjectIdentifier("policyObjectIdentifier")
     * .policyType("policyType")
     * .build()))
     * // the properties below are optional
     * .critical(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-applicationpolicies.html)
     */
    public inline fun cfnTemplateApplicationPoliciesProperty(
        block: CfnTemplateApplicationPoliciesPropertyDsl.() -> Unit = {}
    ): CfnTemplate.ApplicationPoliciesProperty {
        val builder = CfnTemplateApplicationPoliciesPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Application policies describe what the certificate can be used for.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.pcaconnectorad.*;
     * ApplicationPolicyProperty applicationPolicyProperty = ApplicationPolicyProperty.builder()
     * .policyObjectIdentifier("policyObjectIdentifier")
     * .policyType("policyType")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-applicationpolicy.html)
     */
    public inline fun cfnTemplateApplicationPolicyProperty(
        block: CfnTemplateApplicationPolicyPropertyDsl.() -> Unit = {}
    ): CfnTemplate.ApplicationPolicyProperty {
        val builder = CfnTemplateApplicationPolicyPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Information describing the end of the validity period of the certificate.
     *
     * This parameter sets the “Not After” date for the certificate. Certificate validity is the
     * period of time during which a certificate is valid. Validity can be expressed as an explicit
     * date and time when the certificate expires, or as a span of time after issuance, stated in
     * days, months, or years. For more information, see Validity in RFC 5280. This value is
     * unaffected when ValidityNotBefore is also specified. For example, if Validity is set to 20
     * days in the future, the certificate will expire 20 days from issuance time regardless of the
     * ValidityNotBefore value.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.pcaconnectorad.*;
     * CertificateValidityProperty certificateValidityProperty = CertificateValidityProperty.builder()
     * .renewalPeriod(ValidityPeriodProperty.builder()
     * .period(123)
     * .periodType("periodType")
     * .build())
     * .validityPeriod(ValidityPeriodProperty.builder()
     * .period(123)
     * .periodType("periodType")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-certificatevalidity.html)
     */
    public inline fun cfnTemplateCertificateValidityProperty(
        block: CfnTemplateCertificateValidityPropertyDsl.() -> Unit = {}
    ): CfnTemplate.CertificateValidityProperty {
        val builder = CfnTemplateCertificateValidityPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Template configurations for v2 template schema.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.pcaconnectorad.*;
     * EnrollmentFlagsV2Property enrollmentFlagsV2Property = EnrollmentFlagsV2Property.builder()
     * .enableKeyReuseOnNtTokenKeysetStorageFull(false)
     * .includeSymmetricAlgorithms(false)
     * .noSecurityExtension(false)
     * .removeInvalidCertificateFromPersonalStore(false)
     * .userInteractionRequired(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-enrollmentflagsv2.html)
     */
    public inline fun cfnTemplateEnrollmentFlagsV2Property(
        block: CfnTemplateEnrollmentFlagsV2PropertyDsl.() -> Unit = {}
    ): CfnTemplate.EnrollmentFlagsV2Property {
        val builder = CfnTemplateEnrollmentFlagsV2PropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Template configurations for v3 template schema.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.pcaconnectorad.*;
     * EnrollmentFlagsV3Property enrollmentFlagsV3Property = EnrollmentFlagsV3Property.builder()
     * .enableKeyReuseOnNtTokenKeysetStorageFull(false)
     * .includeSymmetricAlgorithms(false)
     * .noSecurityExtension(false)
     * .removeInvalidCertificateFromPersonalStore(false)
     * .userInteractionRequired(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-enrollmentflagsv3.html)
     */
    public inline fun cfnTemplateEnrollmentFlagsV3Property(
        block: CfnTemplateEnrollmentFlagsV3PropertyDsl.() -> Unit = {}
    ): CfnTemplate.EnrollmentFlagsV3Property {
        val builder = CfnTemplateEnrollmentFlagsV3PropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Template configurations for v4 template schema.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.pcaconnectorad.*;
     * EnrollmentFlagsV4Property enrollmentFlagsV4Property = EnrollmentFlagsV4Property.builder()
     * .enableKeyReuseOnNtTokenKeysetStorageFull(false)
     * .includeSymmetricAlgorithms(false)
     * .noSecurityExtension(false)
     * .removeInvalidCertificateFromPersonalStore(false)
     * .userInteractionRequired(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-enrollmentflagsv4.html)
     */
    public inline fun cfnTemplateEnrollmentFlagsV4Property(
        block: CfnTemplateEnrollmentFlagsV4PropertyDsl.() -> Unit = {}
    ): CfnTemplate.EnrollmentFlagsV4Property {
        val builder = CfnTemplateEnrollmentFlagsV4PropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Certificate extensions for v2 template schema.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.pcaconnectorad.*;
     * ExtensionsV2Property extensionsV2Property = ExtensionsV2Property.builder()
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
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-extensionsv2.html)
     */
    public inline fun cfnTemplateExtensionsV2Property(
        block: CfnTemplateExtensionsV2PropertyDsl.() -> Unit = {}
    ): CfnTemplate.ExtensionsV2Property {
        val builder = CfnTemplateExtensionsV2PropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Certificate extensions for v3 template schema.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.pcaconnectorad.*;
     * ExtensionsV3Property extensionsV3Property = ExtensionsV3Property.builder()
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
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-extensionsv3.html)
     */
    public inline fun cfnTemplateExtensionsV3Property(
        block: CfnTemplateExtensionsV3PropertyDsl.() -> Unit = {}
    ): CfnTemplate.ExtensionsV3Property {
        val builder = CfnTemplateExtensionsV3PropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Certificate extensions for v4 template schema.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.pcaconnectorad.*;
     * ExtensionsV4Property extensionsV4Property = ExtensionsV4Property.builder()
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
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-extensionsv4.html)
     */
    public inline fun cfnTemplateExtensionsV4Property(
        block: CfnTemplateExtensionsV4PropertyDsl.() -> Unit = {}
    ): CfnTemplate.ExtensionsV4Property {
        val builder = CfnTemplateExtensionsV4PropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * General flags for v2 template schema that defines if the template is for a machine or a user
     * and if the template can be issued using autoenrollment.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.pcaconnectorad.*;
     * GeneralFlagsV2Property generalFlagsV2Property = GeneralFlagsV2Property.builder()
     * .autoEnrollment(false)
     * .machineType(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-generalflagsv2.html)
     */
    public inline fun cfnTemplateGeneralFlagsV2Property(
        block: CfnTemplateGeneralFlagsV2PropertyDsl.() -> Unit = {}
    ): CfnTemplate.GeneralFlagsV2Property {
        val builder = CfnTemplateGeneralFlagsV2PropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * General flags for v3 template schema that defines if the template is for a machine or a user
     * and if the template can be issued using autoenrollment.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.pcaconnectorad.*;
     * GeneralFlagsV3Property generalFlagsV3Property = GeneralFlagsV3Property.builder()
     * .autoEnrollment(false)
     * .machineType(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-generalflagsv3.html)
     */
    public inline fun cfnTemplateGeneralFlagsV3Property(
        block: CfnTemplateGeneralFlagsV3PropertyDsl.() -> Unit = {}
    ): CfnTemplate.GeneralFlagsV3Property {
        val builder = CfnTemplateGeneralFlagsV3PropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * General flags for v4 template schema that defines if the template is for a machine or a user
     * and if the template can be issued using autoenrollment.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.pcaconnectorad.*;
     * GeneralFlagsV4Property generalFlagsV4Property = GeneralFlagsV4Property.builder()
     * .autoEnrollment(false)
     * .machineType(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-generalflagsv4.html)
     */
    public inline fun cfnTemplateGeneralFlagsV4Property(
        block: CfnTemplateGeneralFlagsV4PropertyDsl.() -> Unit = {}
    ): CfnTemplate.GeneralFlagsV4Property {
        val builder = CfnTemplateGeneralFlagsV4PropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Create a group access control entry.
     *
     * Allow or deny Active Directory groups from enrolling and/or autoenrolling with the template
     * based on the group security identifiers (SIDs).
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.pcaconnectorad.*;
     * CfnTemplateGroupAccessControlEntry cfnTemplateGroupAccessControlEntry =
     * CfnTemplateGroupAccessControlEntry.Builder.create(this, "MyCfnTemplateGroupAccessControlEntry")
     * .accessRights(AccessRightsProperty.builder()
     * .autoEnroll("autoEnroll")
     * .enroll("enroll")
     * .build())
     * .groupDisplayName("groupDisplayName")
     * // the properties below are optional
     * .groupSecurityIdentifier("groupSecurityIdentifier")
     * .templateArn("templateArn")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcaconnectorad-templategroupaccesscontrolentry.html)
     */
    public inline fun cfnTemplateGroupAccessControlEntry(
        scope: Construct,
        id: String,
        block: CfnTemplateGroupAccessControlEntryDsl.() -> Unit = {},
    ): CfnTemplateGroupAccessControlEntry {
        val builder = CfnTemplateGroupAccessControlEntryDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Allow or deny permissions for an Active Directory group to enroll or autoenroll certificates
     * for a template.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.pcaconnectorad.*;
     * AccessRightsProperty accessRightsProperty = AccessRightsProperty.builder()
     * .autoEnroll("autoEnroll")
     * .enroll("enroll")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-templategroupaccesscontrolentry-accessrights.html)
     */
    public inline fun cfnTemplateGroupAccessControlEntryAccessRightsProperty(
        block: CfnTemplateGroupAccessControlEntryAccessRightsPropertyDsl.() -> Unit = {}
    ): CfnTemplateGroupAccessControlEntry.AccessRightsProperty {
        val builder = CfnTemplateGroupAccessControlEntryAccessRightsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnTemplateGroupAccessControlEntry`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.pcaconnectorad.*;
     * CfnTemplateGroupAccessControlEntryProps cfnTemplateGroupAccessControlEntryProps =
     * CfnTemplateGroupAccessControlEntryProps.builder()
     * .accessRights(AccessRightsProperty.builder()
     * .autoEnroll("autoEnroll")
     * .enroll("enroll")
     * .build())
     * .groupDisplayName("groupDisplayName")
     * // the properties below are optional
     * .groupSecurityIdentifier("groupSecurityIdentifier")
     * .templateArn("templateArn")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcaconnectorad-templategroupaccesscontrolentry.html)
     */
    public inline fun cfnTemplateGroupAccessControlEntryProps(
        block: CfnTemplateGroupAccessControlEntryPropsDsl.() -> Unit = {}
    ): CfnTemplateGroupAccessControlEntryProps {
        val builder = CfnTemplateGroupAccessControlEntryPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The key usage flags represent the purpose (e.g., encipherment, signature) of the key
     * contained in the certificate.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.pcaconnectorad.*;
     * KeyUsageFlagsProperty keyUsageFlagsProperty = KeyUsageFlagsProperty.builder()
     * .dataEncipherment(false)
     * .digitalSignature(false)
     * .keyAgreement(false)
     * .keyEncipherment(false)
     * .nonRepudiation(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-keyusageflags.html)
     */
    public inline fun cfnTemplateKeyUsageFlagsProperty(
        block: CfnTemplateKeyUsageFlagsPropertyDsl.() -> Unit = {}
    ): CfnTemplate.KeyUsageFlagsProperty {
        val builder = CfnTemplateKeyUsageFlagsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The key usage extension defines the purpose (e.g., encipherment, signature) of the key
     * contained in the certificate.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.pcaconnectorad.*;
     * KeyUsageProperty keyUsageProperty = KeyUsageProperty.builder()
     * .usageFlags(KeyUsageFlagsProperty.builder()
     * .dataEncipherment(false)
     * .digitalSignature(false)
     * .keyAgreement(false)
     * .keyEncipherment(false)
     * .nonRepudiation(false)
     * .build())
     * // the properties below are optional
     * .critical(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-keyusage.html)
     */
    public inline fun cfnTemplateKeyUsageProperty(
        block: CfnTemplateKeyUsagePropertyDsl.() -> Unit = {}
    ): CfnTemplate.KeyUsageProperty {
        val builder = CfnTemplateKeyUsagePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies key usage.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.pcaconnectorad.*;
     * KeyUsagePropertyFlagsProperty keyUsagePropertyFlagsProperty =
     * KeyUsagePropertyFlagsProperty.builder()
     * .decrypt(false)
     * .keyAgreement(false)
     * .sign(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-keyusagepropertyflags.html)
     */
    public inline fun cfnTemplateKeyUsagePropertyFlagsProperty(
        block: CfnTemplateKeyUsagePropertyFlagsPropertyDsl.() -> Unit = {}
    ): CfnTemplate.KeyUsagePropertyFlagsProperty {
        val builder = CfnTemplateKeyUsagePropertyFlagsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The key usage property defines the purpose of the private key contained in the certificate.
     *
     * You can specify specific purposes using property flags or all by using property type ALL.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.pcaconnectorad.*;
     * KeyUsagePropertyProperty keyUsagePropertyProperty = KeyUsagePropertyProperty.builder()
     * .propertyFlags(KeyUsagePropertyFlagsProperty.builder()
     * .decrypt(false)
     * .keyAgreement(false)
     * .sign(false)
     * .build())
     * .propertyType("propertyType")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-keyusageproperty.html)
     */
    public inline fun cfnTemplateKeyUsagePropertyProperty(
        block: CfnTemplateKeyUsagePropertyPropertyDsl.() -> Unit = {}
    ): CfnTemplate.KeyUsagePropertyProperty {
        val builder = CfnTemplateKeyUsagePropertyPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Defines the attributes of the private key.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.pcaconnectorad.*;
     * PrivateKeyAttributesV2Property privateKeyAttributesV2Property =
     * PrivateKeyAttributesV2Property.builder()
     * .keySpec("keySpec")
     * .minimalKeyLength(123)
     * // the properties below are optional
     * .cryptoProviders(List.of("cryptoProviders"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-privatekeyattributesv2.html)
     */
    public inline fun cfnTemplatePrivateKeyAttributesV2Property(
        block: CfnTemplatePrivateKeyAttributesV2PropertyDsl.() -> Unit = {}
    ): CfnTemplate.PrivateKeyAttributesV2Property {
        val builder = CfnTemplatePrivateKeyAttributesV2PropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Defines the attributes of the private key.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.pcaconnectorad.*;
     * PrivateKeyAttributesV3Property privateKeyAttributesV3Property =
     * PrivateKeyAttributesV3Property.builder()
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
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-privatekeyattributesv3.html)
     */
    public inline fun cfnTemplatePrivateKeyAttributesV3Property(
        block: CfnTemplatePrivateKeyAttributesV3PropertyDsl.() -> Unit = {}
    ): CfnTemplate.PrivateKeyAttributesV3Property {
        val builder = CfnTemplatePrivateKeyAttributesV3PropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Defines the attributes of the private key.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.pcaconnectorad.*;
     * PrivateKeyAttributesV4Property privateKeyAttributesV4Property =
     * PrivateKeyAttributesV4Property.builder()
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
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-privatekeyattributesv4.html)
     */
    public inline fun cfnTemplatePrivateKeyAttributesV4Property(
        block: CfnTemplatePrivateKeyAttributesV4PropertyDsl.() -> Unit = {}
    ): CfnTemplate.PrivateKeyAttributesV4Property {
        val builder = CfnTemplatePrivateKeyAttributesV4PropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Private key flags for v2 templates specify the client compatibility, if the private key can
     * be exported, and if user input is required when using a private key.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.pcaconnectorad.*;
     * PrivateKeyFlagsV2Property privateKeyFlagsV2Property = PrivateKeyFlagsV2Property.builder()
     * .clientVersion("clientVersion")
     * // the properties below are optional
     * .exportableKey(false)
     * .strongKeyProtectionRequired(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-privatekeyflagsv2.html)
     */
    public inline fun cfnTemplatePrivateKeyFlagsV2Property(
        block: CfnTemplatePrivateKeyFlagsV2PropertyDsl.() -> Unit = {}
    ): CfnTemplate.PrivateKeyFlagsV2Property {
        val builder = CfnTemplatePrivateKeyFlagsV2PropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Private key flags for v3 templates specify the client compatibility, if the private key can
     * be exported, if user input is required when using a private key, and if an alternate
     * signature algorithm should be used.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.pcaconnectorad.*;
     * PrivateKeyFlagsV3Property privateKeyFlagsV3Property = PrivateKeyFlagsV3Property.builder()
     * .clientVersion("clientVersion")
     * // the properties below are optional
     * .exportableKey(false)
     * .requireAlternateSignatureAlgorithm(false)
     * .strongKeyProtectionRequired(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-privatekeyflagsv3.html)
     */
    public inline fun cfnTemplatePrivateKeyFlagsV3Property(
        block: CfnTemplatePrivateKeyFlagsV3PropertyDsl.() -> Unit = {}
    ): CfnTemplate.PrivateKeyFlagsV3Property {
        val builder = CfnTemplatePrivateKeyFlagsV3PropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Private key flags for v4 templates specify the client compatibility, if the private key can
     * be exported, if user input is required when using a private key, if an alternate signature
     * algorithm should be used, and if certificates are renewed using the same private key.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.pcaconnectorad.*;
     * PrivateKeyFlagsV4Property privateKeyFlagsV4Property = PrivateKeyFlagsV4Property.builder()
     * .clientVersion("clientVersion")
     * // the properties below are optional
     * .exportableKey(false)
     * .requireAlternateSignatureAlgorithm(false)
     * .requireSameKeyRenewal(false)
     * .strongKeyProtectionRequired(false)
     * .useLegacyProvider(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-privatekeyflagsv4.html)
     */
    public inline fun cfnTemplatePrivateKeyFlagsV4Property(
        block: CfnTemplatePrivateKeyFlagsV4PropertyDsl.() -> Unit = {}
    ): CfnTemplate.PrivateKeyFlagsV4Property {
        val builder = CfnTemplatePrivateKeyFlagsV4PropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnTemplate`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.pcaconnectorad.*;
     * CfnTemplateProps cfnTemplateProps = CfnTemplateProps.builder()
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
    public inline fun cfnTemplateProps(
        block: CfnTemplatePropsDsl.() -> Unit = {}
    ): CfnTemplateProps {
        val builder = CfnTemplatePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Information to include in the subject name and alternate subject name of the certificate.
     *
     * The subject name can be common name, directory path, DNS as common name, or left blank. You
     * can optionally include email to the subject name for user templates. If you leave the subject
     * name blank then you must set a subject alternate name. The subject alternate name (SAN) can
     * include globally unique identifier (GUID), DNS, domain DNS, email, service principal name
     * (SPN), and user principal name (UPN). You can leave the SAN blank. If you leave the SAN
     * blank, then you must set a subject name.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.pcaconnectorad.*;
     * SubjectNameFlagsV2Property subjectNameFlagsV2Property = SubjectNameFlagsV2Property.builder()
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
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-subjectnameflagsv2.html)
     */
    public inline fun cfnTemplateSubjectNameFlagsV2Property(
        block: CfnTemplateSubjectNameFlagsV2PropertyDsl.() -> Unit = {}
    ): CfnTemplate.SubjectNameFlagsV2Property {
        val builder = CfnTemplateSubjectNameFlagsV2PropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Information to include in the subject name and alternate subject name of the certificate.
     *
     * The subject name can be common name, directory path, DNS as common name, or left blank. You
     * can optionally include email to the subject name for user templates. If you leave the subject
     * name blank then you must set a subject alternate name. The subject alternate name (SAN) can
     * include globally unique identifier (GUID), DNS, domain DNS, email, service principal name
     * (SPN), and user principal name (UPN). You can leave the SAN blank. If you leave the SAN
     * blank, then you must set a subject name.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.pcaconnectorad.*;
     * SubjectNameFlagsV3Property subjectNameFlagsV3Property = SubjectNameFlagsV3Property.builder()
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
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-subjectnameflagsv3.html)
     */
    public inline fun cfnTemplateSubjectNameFlagsV3Property(
        block: CfnTemplateSubjectNameFlagsV3PropertyDsl.() -> Unit = {}
    ): CfnTemplate.SubjectNameFlagsV3Property {
        val builder = CfnTemplateSubjectNameFlagsV3PropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Information to include in the subject name and alternate subject name of the certificate.
     *
     * The subject name can be common name, directory path, DNS as common name, or left blank. You
     * can optionally include email to the subject name for user templates. If you leave the subject
     * name blank then you must set a subject alternate name. The subject alternate name (SAN) can
     * include globally unique identifier (GUID), DNS, domain DNS, email, service principal name
     * (SPN), and user principal name (UPN). You can leave the SAN blank. If you leave the SAN
     * blank, then you must set a subject name.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.pcaconnectorad.*;
     * SubjectNameFlagsV4Property subjectNameFlagsV4Property = SubjectNameFlagsV4Property.builder()
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
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-subjectnameflagsv4.html)
     */
    public inline fun cfnTemplateSubjectNameFlagsV4Property(
        block: CfnTemplateSubjectNameFlagsV4PropertyDsl.() -> Unit = {}
    ): CfnTemplate.SubjectNameFlagsV4Property {
        val builder = CfnTemplateSubjectNameFlagsV4PropertyDsl()
        builder.apply(block)
        return builder.build()
    }

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
    public inline fun cfnTemplateTemplateDefinitionProperty(
        block: CfnTemplateTemplateDefinitionPropertyDsl.() -> Unit = {}
    ): CfnTemplate.TemplateDefinitionProperty {
        val builder = CfnTemplateTemplateDefinitionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * v2 template schema that uses Legacy Cryptographic Providers.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.pcaconnectorad.*;
     * TemplateV2Property templateV2Property = TemplateV2Property.builder()
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
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-templatev2.html)
     */
    public inline fun cfnTemplateTemplateV2Property(
        block: CfnTemplateTemplateV2PropertyDsl.() -> Unit = {}
    ): CfnTemplate.TemplateV2Property {
        val builder = CfnTemplateTemplateV2PropertyDsl()
        builder.apply(block)
        return builder.build()
    }

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
    public inline fun cfnTemplateTemplateV3Property(
        block: CfnTemplateTemplateV3PropertyDsl.() -> Unit = {}
    ): CfnTemplate.TemplateV3Property {
        val builder = CfnTemplateTemplateV3PropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * v4 template schema that can use either Legacy Cryptographic Providers or Key Storage
     * Providers.
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
    public inline fun cfnTemplateTemplateV4Property(
        block: CfnTemplateTemplateV4PropertyDsl.() -> Unit = {}
    ): CfnTemplate.TemplateV4Property {
        val builder = CfnTemplateTemplateV4PropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Information describing the end of the validity period of the certificate.
     *
     * This parameter sets the “Not After” date for the certificate. Certificate validity is the
     * period of time during which a certificate is valid. Validity can be expressed as an explicit
     * date and time when the certificate expires, or as a span of time after issuance, stated in
     * hours, days, months, or years. For more information, see Validity in RFC 5280. This value is
     * unaffected when ValidityNotBefore is also specified. For example, if Validity is set to 20
     * days in the future, the certificate will expire 20 days from issuance time regardless of the
     * ValidityNotBefore value.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.pcaconnectorad.*;
     * ValidityPeriodProperty validityPeriodProperty = ValidityPeriodProperty.builder()
     * .period(123)
     * .periodType("periodType")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-validityperiod.html)
     */
    public inline fun cfnTemplateValidityPeriodProperty(
        block: CfnTemplateValidityPeriodPropertyDsl.() -> Unit = {}
    ): CfnTemplate.ValidityPeriodProperty {
        val builder = CfnTemplateValidityPeriodPropertyDsl()
        builder.apply(block)
        return builder.build()
    }
}
