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

package cloudshift.awscdk.dsl.services.iot

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.iot.CfnAccountAuditConfiguration
import software.amazon.awscdk.services.iot.CfnAccountAuditConfigurationProps
import software.amazon.awscdk.services.iot.CfnAuthorizer
import software.amazon.awscdk.services.iot.CfnAuthorizerProps
import software.amazon.awscdk.services.iot.CfnBillingGroup
import software.amazon.awscdk.services.iot.CfnBillingGroupProps
import software.amazon.awscdk.services.iot.CfnCACertificate
import software.amazon.awscdk.services.iot.CfnCACertificateProps
import software.amazon.awscdk.services.iot.CfnCertificate
import software.amazon.awscdk.services.iot.CfnCertificateProps
import software.amazon.awscdk.services.iot.CfnCustomMetric
import software.amazon.awscdk.services.iot.CfnCustomMetricProps
import software.amazon.awscdk.services.iot.CfnDimension
import software.amazon.awscdk.services.iot.CfnDimensionProps
import software.amazon.awscdk.services.iot.CfnDomainConfiguration
import software.amazon.awscdk.services.iot.CfnDomainConfigurationProps
import software.amazon.awscdk.services.iot.CfnFleetMetric
import software.amazon.awscdk.services.iot.CfnFleetMetricProps
import software.amazon.awscdk.services.iot.CfnJobTemplate
import software.amazon.awscdk.services.iot.CfnJobTemplateProps
import software.amazon.awscdk.services.iot.CfnLogging
import software.amazon.awscdk.services.iot.CfnLoggingProps
import software.amazon.awscdk.services.iot.CfnMitigationAction
import software.amazon.awscdk.services.iot.CfnMitigationActionProps
import software.amazon.awscdk.services.iot.CfnPolicy
import software.amazon.awscdk.services.iot.CfnPolicyPrincipalAttachment
import software.amazon.awscdk.services.iot.CfnPolicyPrincipalAttachmentProps
import software.amazon.awscdk.services.iot.CfnPolicyProps
import software.amazon.awscdk.services.iot.CfnProvisioningTemplate
import software.amazon.awscdk.services.iot.CfnProvisioningTemplateProps
import software.amazon.awscdk.services.iot.CfnResourceSpecificLogging
import software.amazon.awscdk.services.iot.CfnResourceSpecificLoggingProps
import software.amazon.awscdk.services.iot.CfnRoleAlias
import software.amazon.awscdk.services.iot.CfnRoleAliasProps
import software.amazon.awscdk.services.iot.CfnScheduledAudit
import software.amazon.awscdk.services.iot.CfnScheduledAuditProps
import software.amazon.awscdk.services.iot.CfnSecurityProfile
import software.amazon.awscdk.services.iot.CfnSecurityProfileProps
import software.amazon.awscdk.services.iot.CfnThing
import software.amazon.awscdk.services.iot.CfnThingGroup
import software.amazon.awscdk.services.iot.CfnThingGroupProps
import software.amazon.awscdk.services.iot.CfnThingPrincipalAttachment
import software.amazon.awscdk.services.iot.CfnThingPrincipalAttachmentProps
import software.amazon.awscdk.services.iot.CfnThingProps
import software.amazon.awscdk.services.iot.CfnThingType
import software.amazon.awscdk.services.iot.CfnThingTypeProps
import software.amazon.awscdk.services.iot.CfnTopicRule
import software.amazon.awscdk.services.iot.CfnTopicRuleDestination
import software.amazon.awscdk.services.iot.CfnTopicRuleDestinationProps
import software.amazon.awscdk.services.iot.CfnTopicRuleProps
import software.constructs.Construct

public object iot {
    /**
     * Use the `AWS::IoT::AccountAuditConfiguration` resource to configure or reconfigure the Device
     * Defender audit settings for your account.
     *
     * Settings include how audit notifications are sent and which audit checks are enabled or
     * disabled. For API reference, see
     * [UpdateAccountAuditConfiguration](https://docs.aws.amazon.com/iot/latest/apireference/API_UpdateAccountAuditConfiguration.html)
     * and for detailed information on all available audit checks, see
     * [Audit checks](https://docs.aws.amazon.com/iot/latest/developerguide/device-defender-audit-checks.html)
     * .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iot.*;
     * CfnAccountAuditConfiguration cfnAccountAuditConfiguration =
     * CfnAccountAuditConfiguration.Builder.create(this, "MyCfnAccountAuditConfiguration")
     * .accountId("accountId")
     * .auditCheckConfigurations(AuditCheckConfigurationsProperty.builder()
     * .authenticatedCognitoRoleOverlyPermissiveCheck(AuditCheckConfigurationProperty.builder()
     * .enabled(false)
     * .build())
     * .caCertificateExpiringCheck(AuditCheckConfigurationProperty.builder()
     * .enabled(false)
     * .build())
     * .caCertificateKeyQualityCheck(AuditCheckConfigurationProperty.builder()
     * .enabled(false)
     * .build())
     * .conflictingClientIdsCheck(AuditCheckConfigurationProperty.builder()
     * .enabled(false)
     * .build())
     * .deviceCertificateExpiringCheck(AuditCheckConfigurationProperty.builder()
     * .enabled(false)
     * .build())
     * .deviceCertificateKeyQualityCheck(AuditCheckConfigurationProperty.builder()
     * .enabled(false)
     * .build())
     * .deviceCertificateSharedCheck(AuditCheckConfigurationProperty.builder()
     * .enabled(false)
     * .build())
     * .intermediateCaRevokedForActiveDeviceCertificatesCheck(AuditCheckConfigurationProperty.builder()
     * .enabled(false)
     * .build())
     * .iotPolicyOverlyPermissiveCheck(AuditCheckConfigurationProperty.builder()
     * .enabled(false)
     * .build())
     * .ioTPolicyPotentialMisConfigurationCheck(AuditCheckConfigurationProperty.builder()
     * .enabled(false)
     * .build())
     * .iotRoleAliasAllowsAccessToUnusedServicesCheck(AuditCheckConfigurationProperty.builder()
     * .enabled(false)
     * .build())
     * .iotRoleAliasOverlyPermissiveCheck(AuditCheckConfigurationProperty.builder()
     * .enabled(false)
     * .build())
     * .loggingDisabledCheck(AuditCheckConfigurationProperty.builder()
     * .enabled(false)
     * .build())
     * .revokedCaCertificateStillActiveCheck(AuditCheckConfigurationProperty.builder()
     * .enabled(false)
     * .build())
     * .revokedDeviceCertificateStillActiveCheck(AuditCheckConfigurationProperty.builder()
     * .enabled(false)
     * .build())
     * .unauthenticatedCognitoRoleOverlyPermissiveCheck(AuditCheckConfigurationProperty.builder()
     * .enabled(false)
     * .build())
     * .build())
     * .roleArn("roleArn")
     * // the properties below are optional
     * .auditNotificationTargetConfigurations(AuditNotificationTargetConfigurationsProperty.builder()
     * .sns(AuditNotificationTargetProperty.builder()
     * .enabled(false)
     * .roleArn("roleArn")
     * .targetArn("targetArn")
     * .build())
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-accountauditconfiguration.html)
     */
    public inline fun cfnAccountAuditConfiguration(
        scope: Construct,
        id: String,
        block: CfnAccountAuditConfigurationDsl.() -> Unit = {},
    ): CfnAccountAuditConfiguration {
        val builder = CfnAccountAuditConfigurationDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Which audit checks are enabled and disabled for this account.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iot.*;
     * AuditCheckConfigurationProperty auditCheckConfigurationProperty =
     * AuditCheckConfigurationProperty.builder()
     * .enabled(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-accountauditconfiguration-auditcheckconfiguration.html)
     */
    public inline fun cfnAccountAuditConfigurationAuditCheckConfigurationProperty(
        block: CfnAccountAuditConfigurationAuditCheckConfigurationPropertyDsl.() -> Unit = {}
    ): CfnAccountAuditConfiguration.AuditCheckConfigurationProperty {
        val builder = CfnAccountAuditConfigurationAuditCheckConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The types of audit checks that can be performed.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iot.*;
     * AuditCheckConfigurationsProperty auditCheckConfigurationsProperty =
     * AuditCheckConfigurationsProperty.builder()
     * .authenticatedCognitoRoleOverlyPermissiveCheck(AuditCheckConfigurationProperty.builder()
     * .enabled(false)
     * .build())
     * .caCertificateExpiringCheck(AuditCheckConfigurationProperty.builder()
     * .enabled(false)
     * .build())
     * .caCertificateKeyQualityCheck(AuditCheckConfigurationProperty.builder()
     * .enabled(false)
     * .build())
     * .conflictingClientIdsCheck(AuditCheckConfigurationProperty.builder()
     * .enabled(false)
     * .build())
     * .deviceCertificateExpiringCheck(AuditCheckConfigurationProperty.builder()
     * .enabled(false)
     * .build())
     * .deviceCertificateKeyQualityCheck(AuditCheckConfigurationProperty.builder()
     * .enabled(false)
     * .build())
     * .deviceCertificateSharedCheck(AuditCheckConfigurationProperty.builder()
     * .enabled(false)
     * .build())
     * .intermediateCaRevokedForActiveDeviceCertificatesCheck(AuditCheckConfigurationProperty.builder()
     * .enabled(false)
     * .build())
     * .iotPolicyOverlyPermissiveCheck(AuditCheckConfigurationProperty.builder()
     * .enabled(false)
     * .build())
     * .ioTPolicyPotentialMisConfigurationCheck(AuditCheckConfigurationProperty.builder()
     * .enabled(false)
     * .build())
     * .iotRoleAliasAllowsAccessToUnusedServicesCheck(AuditCheckConfigurationProperty.builder()
     * .enabled(false)
     * .build())
     * .iotRoleAliasOverlyPermissiveCheck(AuditCheckConfigurationProperty.builder()
     * .enabled(false)
     * .build())
     * .loggingDisabledCheck(AuditCheckConfigurationProperty.builder()
     * .enabled(false)
     * .build())
     * .revokedCaCertificateStillActiveCheck(AuditCheckConfigurationProperty.builder()
     * .enabled(false)
     * .build())
     * .revokedDeviceCertificateStillActiveCheck(AuditCheckConfigurationProperty.builder()
     * .enabled(false)
     * .build())
     * .unauthenticatedCognitoRoleOverlyPermissiveCheck(AuditCheckConfigurationProperty.builder()
     * .enabled(false)
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-accountauditconfiguration-auditcheckconfigurations.html)
     */
    public inline fun cfnAccountAuditConfigurationAuditCheckConfigurationsProperty(
        block: CfnAccountAuditConfigurationAuditCheckConfigurationsPropertyDsl.() -> Unit = {}
    ): CfnAccountAuditConfiguration.AuditCheckConfigurationsProperty {
        val builder = CfnAccountAuditConfigurationAuditCheckConfigurationsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The configuration of the audit notification target.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iot.*;
     * AuditNotificationTargetConfigurationsProperty auditNotificationTargetConfigurationsProperty =
     * AuditNotificationTargetConfigurationsProperty.builder()
     * .sns(AuditNotificationTargetProperty.builder()
     * .enabled(false)
     * .roleArn("roleArn")
     * .targetArn("targetArn")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-accountauditconfiguration-auditnotificationtargetconfigurations.html)
     */
    public inline fun cfnAccountAuditConfigurationAuditNotificationTargetConfigurationsProperty(
        block:
            CfnAccountAuditConfigurationAuditNotificationTargetConfigurationsPropertyDsl.(
            ) -> Unit =
            {}
    ): CfnAccountAuditConfiguration.AuditNotificationTargetConfigurationsProperty {
        val builder = CfnAccountAuditConfigurationAuditNotificationTargetConfigurationsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Information about the targets to which audit notifications are sent.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iot.*;
     * AuditNotificationTargetProperty auditNotificationTargetProperty =
     * AuditNotificationTargetProperty.builder()
     * .enabled(false)
     * .roleArn("roleArn")
     * .targetArn("targetArn")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-accountauditconfiguration-auditnotificationtarget.html)
     */
    public inline fun cfnAccountAuditConfigurationAuditNotificationTargetProperty(
        block: CfnAccountAuditConfigurationAuditNotificationTargetPropertyDsl.() -> Unit = {}
    ): CfnAccountAuditConfiguration.AuditNotificationTargetProperty {
        val builder = CfnAccountAuditConfigurationAuditNotificationTargetPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnAccountAuditConfiguration`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iot.*;
     * CfnAccountAuditConfigurationProps cfnAccountAuditConfigurationProps =
     * CfnAccountAuditConfigurationProps.builder()
     * .accountId("accountId")
     * .auditCheckConfigurations(AuditCheckConfigurationsProperty.builder()
     * .authenticatedCognitoRoleOverlyPermissiveCheck(AuditCheckConfigurationProperty.builder()
     * .enabled(false)
     * .build())
     * .caCertificateExpiringCheck(AuditCheckConfigurationProperty.builder()
     * .enabled(false)
     * .build())
     * .caCertificateKeyQualityCheck(AuditCheckConfigurationProperty.builder()
     * .enabled(false)
     * .build())
     * .conflictingClientIdsCheck(AuditCheckConfigurationProperty.builder()
     * .enabled(false)
     * .build())
     * .deviceCertificateExpiringCheck(AuditCheckConfigurationProperty.builder()
     * .enabled(false)
     * .build())
     * .deviceCertificateKeyQualityCheck(AuditCheckConfigurationProperty.builder()
     * .enabled(false)
     * .build())
     * .deviceCertificateSharedCheck(AuditCheckConfigurationProperty.builder()
     * .enabled(false)
     * .build())
     * .intermediateCaRevokedForActiveDeviceCertificatesCheck(AuditCheckConfigurationProperty.builder()
     * .enabled(false)
     * .build())
     * .iotPolicyOverlyPermissiveCheck(AuditCheckConfigurationProperty.builder()
     * .enabled(false)
     * .build())
     * .ioTPolicyPotentialMisConfigurationCheck(AuditCheckConfigurationProperty.builder()
     * .enabled(false)
     * .build())
     * .iotRoleAliasAllowsAccessToUnusedServicesCheck(AuditCheckConfigurationProperty.builder()
     * .enabled(false)
     * .build())
     * .iotRoleAliasOverlyPermissiveCheck(AuditCheckConfigurationProperty.builder()
     * .enabled(false)
     * .build())
     * .loggingDisabledCheck(AuditCheckConfigurationProperty.builder()
     * .enabled(false)
     * .build())
     * .revokedCaCertificateStillActiveCheck(AuditCheckConfigurationProperty.builder()
     * .enabled(false)
     * .build())
     * .revokedDeviceCertificateStillActiveCheck(AuditCheckConfigurationProperty.builder()
     * .enabled(false)
     * .build())
     * .unauthenticatedCognitoRoleOverlyPermissiveCheck(AuditCheckConfigurationProperty.builder()
     * .enabled(false)
     * .build())
     * .build())
     * .roleArn("roleArn")
     * // the properties below are optional
     * .auditNotificationTargetConfigurations(AuditNotificationTargetConfigurationsProperty.builder()
     * .sns(AuditNotificationTargetProperty.builder()
     * .enabled(false)
     * .roleArn("roleArn")
     * .targetArn("targetArn")
     * .build())
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-accountauditconfiguration.html)
     */
    public inline fun cfnAccountAuditConfigurationProps(
        block: CfnAccountAuditConfigurationPropsDsl.() -> Unit = {}
    ): CfnAccountAuditConfigurationProps {
        val builder = CfnAccountAuditConfigurationPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies an authorizer.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iot.*;
     * CfnAuthorizer cfnAuthorizer = CfnAuthorizer.Builder.create(this, "MyCfnAuthorizer")
     * .authorizerFunctionArn("authorizerFunctionArn")
     * // the properties below are optional
     * .authorizerName("authorizerName")
     * .enableCachingForHttp(false)
     * .signingDisabled(false)
     * .status("status")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .tokenKeyName("tokenKeyName")
     * .tokenSigningPublicKeys(Map.of(
     * "tokenSigningPublicKeysKey", "tokenSigningPublicKeys"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-authorizer.html)
     */
    public inline fun cfnAuthorizer(
        scope: Construct,
        id: String,
        block: CfnAuthorizerDsl.() -> Unit = {},
    ): CfnAuthorizer {
        val builder = CfnAuthorizerDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnAuthorizer`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iot.*;
     * CfnAuthorizerProps cfnAuthorizerProps = CfnAuthorizerProps.builder()
     * .authorizerFunctionArn("authorizerFunctionArn")
     * // the properties below are optional
     * .authorizerName("authorizerName")
     * .enableCachingForHttp(false)
     * .signingDisabled(false)
     * .status("status")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .tokenKeyName("tokenKeyName")
     * .tokenSigningPublicKeys(Map.of(
     * "tokenSigningPublicKeysKey", "tokenSigningPublicKeys"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-authorizer.html)
     */
    public inline fun cfnAuthorizerProps(
        block: CfnAuthorizerPropsDsl.() -> Unit = {}
    ): CfnAuthorizerProps {
        val builder = CfnAuthorizerPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Creates a new billing group.
     *
     * Requires permission to access the
     * [CreateBillingGroup](https://docs.aws.amazon.com//service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions)
     * action.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iot.*;
     * CfnBillingGroup cfnBillingGroup = CfnBillingGroup.Builder.create(this, "MyCfnBillingGroup")
     * .billingGroupName("billingGroupName")
     * .billingGroupProperties(BillingGroupPropertiesProperty.builder()
     * .billingGroupDescription("billingGroupDescription")
     * .build())
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-billinggroup.html)
     */
    public inline fun cfnBillingGroup(
        scope: Construct,
        id: String,
        block: CfnBillingGroupDsl.() -> Unit = {},
    ): CfnBillingGroup {
        val builder = CfnBillingGroupDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * The properties of a billing group.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iot.*;
     * BillingGroupPropertiesProperty billingGroupPropertiesProperty =
     * BillingGroupPropertiesProperty.builder()
     * .billingGroupDescription("billingGroupDescription")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-billinggroup-billinggroupproperties.html)
     */
    public inline fun cfnBillingGroupBillingGroupPropertiesProperty(
        block: CfnBillingGroupBillingGroupPropertiesPropertyDsl.() -> Unit = {}
    ): CfnBillingGroup.BillingGroupPropertiesProperty {
        val builder = CfnBillingGroupBillingGroupPropertiesPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnBillingGroup`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iot.*;
     * CfnBillingGroupProps cfnBillingGroupProps = CfnBillingGroupProps.builder()
     * .billingGroupName("billingGroupName")
     * .billingGroupProperties(BillingGroupPropertiesProperty.builder()
     * .billingGroupDescription("billingGroupDescription")
     * .build())
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-billinggroup.html)
     */
    public inline fun cfnBillingGroupProps(
        block: CfnBillingGroupPropsDsl.() -> Unit = {}
    ): CfnBillingGroupProps {
        val builder = CfnBillingGroupPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies a CA certificate.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iot.*;
     * CfnCACertificate cfnCACertificate = CfnCACertificate.Builder.create(this, "MyCfnCACertificate")
     * .caCertificatePem("caCertificatePem")
     * .status("status")
     * // the properties below are optional
     * .autoRegistrationStatus("autoRegistrationStatus")
     * .certificateMode("certificateMode")
     * .registrationConfig(RegistrationConfigProperty.builder()
     * .roleArn("roleArn")
     * .templateBody("templateBody")
     * .templateName("templateName")
     * .build())
     * .removeAutoRegistration(false)
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .verificationCertificatePem("verificationCertificatePem")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-cacertificate.html)
     */
    public inline fun cfnCACertificate(
        scope: Construct,
        id: String,
        block: CfnCACertificateDsl.() -> Unit = {},
    ): CfnCACertificate {
        val builder = CfnCACertificateDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnCACertificate`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iot.*;
     * CfnCACertificateProps cfnCACertificateProps = CfnCACertificateProps.builder()
     * .caCertificatePem("caCertificatePem")
     * .status("status")
     * // the properties below are optional
     * .autoRegistrationStatus("autoRegistrationStatus")
     * .certificateMode("certificateMode")
     * .registrationConfig(RegistrationConfigProperty.builder()
     * .roleArn("roleArn")
     * .templateBody("templateBody")
     * .templateName("templateName")
     * .build())
     * .removeAutoRegistration(false)
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .verificationCertificatePem("verificationCertificatePem")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-cacertificate.html)
     */
    public inline fun cfnCACertificateProps(
        block: CfnCACertificatePropsDsl.() -> Unit = {}
    ): CfnCACertificateProps {
        val builder = CfnCACertificatePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The registration configuration.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iot.*;
     * RegistrationConfigProperty registrationConfigProperty = RegistrationConfigProperty.builder()
     * .roleArn("roleArn")
     * .templateBody("templateBody")
     * .templateName("templateName")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-cacertificate-registrationconfig.html)
     */
    public inline fun cfnCACertificateRegistrationConfigProperty(
        block: CfnCACertificateRegistrationConfigPropertyDsl.() -> Unit = {}
    ): CfnCACertificate.RegistrationConfigProperty {
        val builder = CfnCACertificateRegistrationConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Use the `AWS::IoT::Certificate` resource to declare an AWS IoT X.509 certificate. For
     * information about working with X.509 certificates, see
     * [X.509 Client Certificates](https://docs.aws.amazon.com/iot/latest/developerguide/x509-client-certs.html)
     * in the *AWS IoT Developer Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iot.*;
     * CfnCertificate cfnCertificate = CfnCertificate.Builder.create(this, "MyCfnCertificate")
     * .status("status")
     * // the properties below are optional
     * .caCertificatePem("caCertificatePem")
     * .certificateMode("certificateMode")
     * .certificatePem("certificatePem")
     * .certificateSigningRequest("certificateSigningRequest")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-certificate.html)
     */
    public inline fun cfnCertificate(
        scope: Construct,
        id: String,
        block: CfnCertificateDsl.() -> Unit = {},
    ): CfnCertificate {
        val builder = CfnCertificateDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnCertificate`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iot.*;
     * CfnCertificateProps cfnCertificateProps = CfnCertificateProps.builder()
     * .status("status")
     * // the properties below are optional
     * .caCertificatePem("caCertificatePem")
     * .certificateMode("certificateMode")
     * .certificatePem("certificatePem")
     * .certificateSigningRequest("certificateSigningRequest")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-certificate.html)
     */
    public inline fun cfnCertificateProps(
        block: CfnCertificatePropsDsl.() -> Unit = {}
    ): CfnCertificateProps {
        val builder = CfnCertificatePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Use the `AWS::IoT::CustomMetric` resource to define a custom metric published by your devices
     * to Device Defender.
     *
     * For API reference, see
     * [CreateCustomMetric](https://docs.aws.amazon.com/iot/latest/apireference/API_CreateCustomMetric.html)
     * and for general information, see
     * [Custom metrics](https://docs.aws.amazon.com/iot/latest/developerguide/dd-detect-custom-metrics.html)
     * .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iot.*;
     * CfnCustomMetric cfnCustomMetric = CfnCustomMetric.Builder.create(this, "MyCfnCustomMetric")
     * .metricType("metricType")
     * // the properties below are optional
     * .displayName("displayName")
     * .metricName("metricName")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-custommetric.html)
     */
    public inline fun cfnCustomMetric(
        scope: Construct,
        id: String,
        block: CfnCustomMetricDsl.() -> Unit = {},
    ): CfnCustomMetric {
        val builder = CfnCustomMetricDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnCustomMetric`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iot.*;
     * CfnCustomMetricProps cfnCustomMetricProps = CfnCustomMetricProps.builder()
     * .metricType("metricType")
     * // the properties below are optional
     * .displayName("displayName")
     * .metricName("metricName")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-custommetric.html)
     */
    public inline fun cfnCustomMetricProps(
        block: CfnCustomMetricPropsDsl.() -> Unit = {}
    ): CfnCustomMetricProps {
        val builder = CfnCustomMetricPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Use the `AWS::IoT::Dimension` to limit the scope of a metric used in a security profile for
     * AWS IoT Device Defender .
     *
     * For example, using a `TOPIC_FILTER` dimension, you can narrow down the scope of the metric to
     * only MQTT topics where the name matches the pattern specified in the dimension. For API
     * reference, see
     * [CreateDimension](https://docs.aws.amazon.com/iot/latest/apireference/API_CreateDimension.html)
     * and for general information, see
     * [Scoping metrics in security profiles using dimensions](https://docs.aws.amazon.com/iot/latest/developerguide/scoping-security-behavior.html)
     * .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iot.*;
     * CfnDimension cfnDimension = CfnDimension.Builder.create(this, "MyCfnDimension")
     * .stringValues(List.of("stringValues"))
     * .type("type")
     * // the properties below are optional
     * .name("name")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-dimension.html)
     */
    public inline fun cfnDimension(
        scope: Construct,
        id: String,
        block: CfnDimensionDsl.() -> Unit = {},
    ): CfnDimension {
        val builder = CfnDimensionDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnDimension`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iot.*;
     * CfnDimensionProps cfnDimensionProps = CfnDimensionProps.builder()
     * .stringValues(List.of("stringValues"))
     * .type("type")
     * // the properties below are optional
     * .name("name")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-dimension.html)
     */
    public inline fun cfnDimensionProps(
        block: CfnDimensionPropsDsl.() -> Unit = {}
    ): CfnDimensionProps {
        val builder = CfnDimensionPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies a domain configuration.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iot.*;
     * CfnDomainConfiguration cfnDomainConfiguration = CfnDomainConfiguration.Builder.create(this,
     * "MyCfnDomainConfiguration")
     * .authorizerConfig(AuthorizerConfigProperty.builder()
     * .allowAuthorizerOverride(false)
     * .defaultAuthorizerName("defaultAuthorizerName")
     * .build())
     * .domainConfigurationName("domainConfigurationName")
     * .domainConfigurationStatus("domainConfigurationStatus")
     * .domainName("domainName")
     * .serverCertificateArns(List.of("serverCertificateArns"))
     * .serviceType("serviceType")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .tlsConfig(TlsConfigProperty.builder()
     * .securityPolicy("securityPolicy")
     * .build())
     * .validationCertificateArn("validationCertificateArn")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-domainconfiguration.html)
     */
    public inline fun cfnDomainConfiguration(
        scope: Construct,
        id: String,
        block: CfnDomainConfigurationDsl.() -> Unit = {},
    ): CfnDomainConfiguration {
        val builder = CfnDomainConfigurationDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * An object that specifies the authorization service for a domain.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iot.*;
     * AuthorizerConfigProperty authorizerConfigProperty = AuthorizerConfigProperty.builder()
     * .allowAuthorizerOverride(false)
     * .defaultAuthorizerName("defaultAuthorizerName")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-domainconfiguration-authorizerconfig.html)
     */
    public inline fun cfnDomainConfigurationAuthorizerConfigProperty(
        block: CfnDomainConfigurationAuthorizerConfigPropertyDsl.() -> Unit = {}
    ): CfnDomainConfiguration.AuthorizerConfigProperty {
        val builder = CfnDomainConfigurationAuthorizerConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnDomainConfiguration`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iot.*;
     * CfnDomainConfigurationProps cfnDomainConfigurationProps = CfnDomainConfigurationProps.builder()
     * .authorizerConfig(AuthorizerConfigProperty.builder()
     * .allowAuthorizerOverride(false)
     * .defaultAuthorizerName("defaultAuthorizerName")
     * .build())
     * .domainConfigurationName("domainConfigurationName")
     * .domainConfigurationStatus("domainConfigurationStatus")
     * .domainName("domainName")
     * .serverCertificateArns(List.of("serverCertificateArns"))
     * .serviceType("serviceType")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .tlsConfig(TlsConfigProperty.builder()
     * .securityPolicy("securityPolicy")
     * .build())
     * .validationCertificateArn("validationCertificateArn")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-domainconfiguration.html)
     */
    public inline fun cfnDomainConfigurationProps(
        block: CfnDomainConfigurationPropsDsl.() -> Unit = {}
    ): CfnDomainConfigurationProps {
        val builder = CfnDomainConfigurationPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * An object that contains information about a server certificate.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iot.*;
     * ServerCertificateSummaryProperty serverCertificateSummaryProperty =
     * ServerCertificateSummaryProperty.builder()
     * .serverCertificateArn("serverCertificateArn")
     * .serverCertificateStatus("serverCertificateStatus")
     * .serverCertificateStatusDetail("serverCertificateStatusDetail")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-domainconfiguration-servercertificatesummary.html)
     */
    public inline fun cfnDomainConfigurationServerCertificateSummaryProperty(
        block: CfnDomainConfigurationServerCertificateSummaryPropertyDsl.() -> Unit = {}
    ): CfnDomainConfiguration.ServerCertificateSummaryProperty {
        val builder = CfnDomainConfigurationServerCertificateSummaryPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * An object that specifies the TLS configuration for a domain.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iot.*;
     * TlsConfigProperty tlsConfigProperty = TlsConfigProperty.builder()
     * .securityPolicy("securityPolicy")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-domainconfiguration-tlsconfig.html)
     */
    public inline fun cfnDomainConfigurationTlsConfigProperty(
        block: CfnDomainConfigurationTlsConfigPropertyDsl.() -> Unit = {}
    ): CfnDomainConfiguration.TlsConfigProperty {
        val builder = CfnDomainConfigurationTlsConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Use the `AWS::IoT::FleetMetric` resource to declare a fleet metric.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iot.*;
     * CfnFleetMetric cfnFleetMetric = CfnFleetMetric.Builder.create(this, "MyCfnFleetMetric")
     * .metricName("metricName")
     * // the properties below are optional
     * .aggregationField("aggregationField")
     * .aggregationType(AggregationTypeProperty.builder()
     * .name("name")
     * .values(List.of("values"))
     * .build())
     * .description("description")
     * .indexName("indexName")
     * .period(123)
     * .queryString("queryString")
     * .queryVersion("queryVersion")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .unit("unit")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-fleetmetric.html)
     */
    public inline fun cfnFleetMetric(
        scope: Construct,
        id: String,
        block: CfnFleetMetricDsl.() -> Unit = {},
    ): CfnFleetMetric {
        val builder = CfnFleetMetricDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * The type of aggregation queries.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iot.*;
     * AggregationTypeProperty aggregationTypeProperty = AggregationTypeProperty.builder()
     * .name("name")
     * .values(List.of("values"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-fleetmetric-aggregationtype.html)
     */
    public inline fun cfnFleetMetricAggregationTypeProperty(
        block: CfnFleetMetricAggregationTypePropertyDsl.() -> Unit = {}
    ): CfnFleetMetric.AggregationTypeProperty {
        val builder = CfnFleetMetricAggregationTypePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnFleetMetric`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iot.*;
     * CfnFleetMetricProps cfnFleetMetricProps = CfnFleetMetricProps.builder()
     * .metricName("metricName")
     * // the properties below are optional
     * .aggregationField("aggregationField")
     * .aggregationType(AggregationTypeProperty.builder()
     * .name("name")
     * .values(List.of("values"))
     * .build())
     * .description("description")
     * .indexName("indexName")
     * .period(123)
     * .queryString("queryString")
     * .queryVersion("queryVersion")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .unit("unit")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-fleetmetric.html)
     */
    public inline fun cfnFleetMetricProps(
        block: CfnFleetMetricPropsDsl.() -> Unit = {}
    ): CfnFleetMetricProps {
        val builder = CfnFleetMetricPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Represents a job template.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iot.*;
     * Object abortConfig;
     * Object jobExecutionsRolloutConfig;
     * Object presignedUrlConfig;
     * Object timeoutConfig;
     * CfnJobTemplate cfnJobTemplate = CfnJobTemplate.Builder.create(this, "MyCfnJobTemplate")
     * .description("description")
     * .jobTemplateId("jobTemplateId")
     * // the properties below are optional
     * .abortConfig(abortConfig)
     * .document("document")
     * .documentSource("documentSource")
     * .jobArn("jobArn")
     * .jobExecutionsRetryConfig(JobExecutionsRetryConfigProperty.builder()
     * .retryCriteriaList(List.of(RetryCriteriaProperty.builder()
     * .failureType("failureType")
     * .numberOfRetries(123)
     * .build()))
     * .build())
     * .jobExecutionsRolloutConfig(jobExecutionsRolloutConfig)
     * .maintenanceWindows(List.of(MaintenanceWindowProperty.builder()
     * .durationInMinutes(123)
     * .startTime("startTime")
     * .build()))
     * .presignedUrlConfig(presignedUrlConfig)
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .timeoutConfig(timeoutConfig)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-jobtemplate.html)
     */
    public inline fun cfnJobTemplate(
        scope: Construct,
        id: String,
        block: CfnJobTemplateDsl.() -> Unit = {},
    ): CfnJobTemplate {
        val builder = CfnJobTemplateDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * The criteria that determine when and how a job abort takes place.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iot.*;
     * AbortConfigProperty abortConfigProperty = AbortConfigProperty.builder()
     * .criteriaList(List.of(AbortCriteriaProperty.builder()
     * .action("action")
     * .failureType("failureType")
     * .minNumberOfExecutedThings(123)
     * .thresholdPercentage(123)
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-jobtemplate-abortconfig.html)
     */
    public inline fun cfnJobTemplateAbortConfigProperty(
        block: CfnJobTemplateAbortConfigPropertyDsl.() -> Unit = {}
    ): CfnJobTemplate.AbortConfigProperty {
        val builder = CfnJobTemplateAbortConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The criteria that determine when and how a job abort takes place.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iot.*;
     * AbortCriteriaProperty abortCriteriaProperty = AbortCriteriaProperty.builder()
     * .action("action")
     * .failureType("failureType")
     * .minNumberOfExecutedThings(123)
     * .thresholdPercentage(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-jobtemplate-abortcriteria.html)
     */
    public inline fun cfnJobTemplateAbortCriteriaProperty(
        block: CfnJobTemplateAbortCriteriaPropertyDsl.() -> Unit = {}
    ): CfnJobTemplate.AbortCriteriaProperty {
        val builder = CfnJobTemplateAbortCriteriaPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Allows you to create an exponential rate of rollout for a job.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iot.*;
     * ExponentialRolloutRateProperty exponentialRolloutRateProperty =
     * ExponentialRolloutRateProperty.builder()
     * .baseRatePerMinute(123)
     * .incrementFactor(123)
     * .rateIncreaseCriteria(RateIncreaseCriteriaProperty.builder()
     * .numberOfNotifiedThings(123)
     * .numberOfSucceededThings(123)
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-jobtemplate-exponentialrolloutrate.html)
     */
    public inline fun cfnJobTemplateExponentialRolloutRateProperty(
        block: CfnJobTemplateExponentialRolloutRatePropertyDsl.() -> Unit = {}
    ): CfnJobTemplate.ExponentialRolloutRateProperty {
        val builder = CfnJobTemplateExponentialRolloutRatePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The configuration that determines how many retries are allowed for each failure type for a
     * job.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iot.*;
     * JobExecutionsRetryConfigProperty jobExecutionsRetryConfigProperty =
     * JobExecutionsRetryConfigProperty.builder()
     * .retryCriteriaList(List.of(RetryCriteriaProperty.builder()
     * .failureType("failureType")
     * .numberOfRetries(123)
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-jobtemplate-jobexecutionsretryconfig.html)
     */
    public inline fun cfnJobTemplateJobExecutionsRetryConfigProperty(
        block: CfnJobTemplateJobExecutionsRetryConfigPropertyDsl.() -> Unit = {}
    ): CfnJobTemplate.JobExecutionsRetryConfigProperty {
        val builder = CfnJobTemplateJobExecutionsRetryConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Allows you to create a staged rollout of a job.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iot.*;
     * JobExecutionsRolloutConfigProperty jobExecutionsRolloutConfigProperty =
     * JobExecutionsRolloutConfigProperty.builder()
     * .exponentialRolloutRate(ExponentialRolloutRateProperty.builder()
     * .baseRatePerMinute(123)
     * .incrementFactor(123)
     * .rateIncreaseCriteria(RateIncreaseCriteriaProperty.builder()
     * .numberOfNotifiedThings(123)
     * .numberOfSucceededThings(123)
     * .build())
     * .build())
     * .maximumPerMinute(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-jobtemplate-jobexecutionsrolloutconfig.html)
     */
    public inline fun cfnJobTemplateJobExecutionsRolloutConfigProperty(
        block: CfnJobTemplateJobExecutionsRolloutConfigPropertyDsl.() -> Unit = {}
    ): CfnJobTemplate.JobExecutionsRolloutConfigProperty {
        val builder = CfnJobTemplateJobExecutionsRolloutConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * An optional configuration within the `SchedulingConfig` to setup a recurring maintenance
     * window with a predetermined start time and duration for the rollout of a job document to all
     * devices in a target group for a job.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iot.*;
     * MaintenanceWindowProperty maintenanceWindowProperty = MaintenanceWindowProperty.builder()
     * .durationInMinutes(123)
     * .startTime("startTime")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-jobtemplate-maintenancewindow.html)
     */
    public inline fun cfnJobTemplateMaintenanceWindowProperty(
        block: CfnJobTemplateMaintenanceWindowPropertyDsl.() -> Unit = {}
    ): CfnJobTemplate.MaintenanceWindowProperty {
        val builder = CfnJobTemplateMaintenanceWindowPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Configuration for pre-signed S3 URLs.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iot.*;
     * PresignedUrlConfigProperty presignedUrlConfigProperty = PresignedUrlConfigProperty.builder()
     * .roleArn("roleArn")
     * // the properties below are optional
     * .expiresInSec(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-jobtemplate-presignedurlconfig.html)
     */
    public inline fun cfnJobTemplatePresignedUrlConfigProperty(
        block: CfnJobTemplatePresignedUrlConfigPropertyDsl.() -> Unit = {}
    ): CfnJobTemplate.PresignedUrlConfigProperty {
        val builder = CfnJobTemplatePresignedUrlConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnJobTemplate`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iot.*;
     * Object abortConfig;
     * Object jobExecutionsRolloutConfig;
     * Object presignedUrlConfig;
     * Object timeoutConfig;
     * CfnJobTemplateProps cfnJobTemplateProps = CfnJobTemplateProps.builder()
     * .description("description")
     * .jobTemplateId("jobTemplateId")
     * // the properties below are optional
     * .abortConfig(abortConfig)
     * .document("document")
     * .documentSource("documentSource")
     * .jobArn("jobArn")
     * .jobExecutionsRetryConfig(JobExecutionsRetryConfigProperty.builder()
     * .retryCriteriaList(List.of(RetryCriteriaProperty.builder()
     * .failureType("failureType")
     * .numberOfRetries(123)
     * .build()))
     * .build())
     * .jobExecutionsRolloutConfig(jobExecutionsRolloutConfig)
     * .maintenanceWindows(List.of(MaintenanceWindowProperty.builder()
     * .durationInMinutes(123)
     * .startTime("startTime")
     * .build()))
     * .presignedUrlConfig(presignedUrlConfig)
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .timeoutConfig(timeoutConfig)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-jobtemplate.html)
     */
    public inline fun cfnJobTemplateProps(
        block: CfnJobTemplatePropsDsl.() -> Unit = {}
    ): CfnJobTemplateProps {
        val builder = CfnJobTemplatePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Allows you to define a criteria to initiate the increase in rate of rollout for a job.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iot.*;
     * RateIncreaseCriteriaProperty rateIncreaseCriteriaProperty =
     * RateIncreaseCriteriaProperty.builder()
     * .numberOfNotifiedThings(123)
     * .numberOfSucceededThings(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-jobtemplate-rateincreasecriteria.html)
     */
    public inline fun cfnJobTemplateRateIncreaseCriteriaProperty(
        block: CfnJobTemplateRateIncreaseCriteriaPropertyDsl.() -> Unit = {}
    ): CfnJobTemplate.RateIncreaseCriteriaProperty {
        val builder = CfnJobTemplateRateIncreaseCriteriaPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The criteria that determines how many retries are allowed for each failure type for a job.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iot.*;
     * RetryCriteriaProperty retryCriteriaProperty = RetryCriteriaProperty.builder()
     * .failureType("failureType")
     * .numberOfRetries(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-jobtemplate-retrycriteria.html)
     */
    public inline fun cfnJobTemplateRetryCriteriaProperty(
        block: CfnJobTemplateRetryCriteriaPropertyDsl.() -> Unit = {}
    ): CfnJobTemplate.RetryCriteriaProperty {
        val builder = CfnJobTemplateRetryCriteriaPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies the amount of time each device has to finish its execution of the job.
     *
     * A timer is started when the job execution status is set to `IN_PROGRESS` . If the job
     * execution status is not set to another terminal state before the timer expires, it will be
     * automatically set to `TIMED_OUT` .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iot.*;
     * TimeoutConfigProperty timeoutConfigProperty = TimeoutConfigProperty.builder()
     * .inProgressTimeoutInMinutes(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-jobtemplate-timeoutconfig.html)
     */
    public inline fun cfnJobTemplateTimeoutConfigProperty(
        block: CfnJobTemplateTimeoutConfigPropertyDsl.() -> Unit = {}
    ): CfnJobTemplate.TimeoutConfigProperty {
        val builder = CfnJobTemplateTimeoutConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Configure logging.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iot.*;
     * CfnLogging cfnLogging = CfnLogging.Builder.create(this, "MyCfnLogging")
     * .accountId("accountId")
     * .defaultLogLevel("defaultLogLevel")
     * .roleArn("roleArn")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-logging.html)
     */
    public inline fun cfnLogging(
        scope: Construct,
        id: String,
        block: CfnLoggingDsl.() -> Unit = {},
    ): CfnLogging {
        val builder = CfnLoggingDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnLogging`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iot.*;
     * CfnLoggingProps cfnLoggingProps = CfnLoggingProps.builder()
     * .accountId("accountId")
     * .defaultLogLevel("defaultLogLevel")
     * .roleArn("roleArn")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-logging.html)
     */
    public inline fun cfnLoggingProps(block: CfnLoggingPropsDsl.() -> Unit = {}): CfnLoggingProps {
        val builder = CfnLoggingPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Defines an action that can be applied to audit findings by using
     * StartAuditMitigationActionsTask.
     *
     * For API reference, see
     * [CreateMitigationAction](https://docs.aws.amazon.com/iot/latest/apireference/API_CreateMitigationAction.html)
     * and for general information, see
     * [Mitigation actions](https://docs.aws.amazon.com/iot/latest/developerguide/dd-mitigation-actions.html)
     * .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iot.*;
     * CfnMitigationAction cfnMitigationAction = CfnMitigationAction.Builder.create(this,
     * "MyCfnMitigationAction")
     * .actionParams(ActionParamsProperty.builder()
     * .addThingsToThingGroupParams(AddThingsToThingGroupParamsProperty.builder()
     * .thingGroupNames(List.of("thingGroupNames"))
     * // the properties below are optional
     * .overrideDynamicGroups(false)
     * .build())
     * .enableIoTLoggingParams(EnableIoTLoggingParamsProperty.builder()
     * .logLevel("logLevel")
     * .roleArnForLogging("roleArnForLogging")
     * .build())
     * .publishFindingToSnsParams(PublishFindingToSnsParamsProperty.builder()
     * .topicArn("topicArn")
     * .build())
     * .replaceDefaultPolicyVersionParams(ReplaceDefaultPolicyVersionParamsProperty.builder()
     * .templateName("templateName")
     * .build())
     * .updateCaCertificateParams(UpdateCACertificateParamsProperty.builder()
     * .action("action")
     * .build())
     * .updateDeviceCertificateParams(UpdateDeviceCertificateParamsProperty.builder()
     * .action("action")
     * .build())
     * .build())
     * .roleArn("roleArn")
     * // the properties below are optional
     * .actionName("actionName")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-mitigationaction.html)
     */
    public inline fun cfnMitigationAction(
        scope: Construct,
        id: String,
        block: CfnMitigationActionDsl.() -> Unit = {},
    ): CfnMitigationAction {
        val builder = CfnMitigationActionDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Defines the type of action and the parameters for that action.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iot.*;
     * ActionParamsProperty actionParamsProperty = ActionParamsProperty.builder()
     * .addThingsToThingGroupParams(AddThingsToThingGroupParamsProperty.builder()
     * .thingGroupNames(List.of("thingGroupNames"))
     * // the properties below are optional
     * .overrideDynamicGroups(false)
     * .build())
     * .enableIoTLoggingParams(EnableIoTLoggingParamsProperty.builder()
     * .logLevel("logLevel")
     * .roleArnForLogging("roleArnForLogging")
     * .build())
     * .publishFindingToSnsParams(PublishFindingToSnsParamsProperty.builder()
     * .topicArn("topicArn")
     * .build())
     * .replaceDefaultPolicyVersionParams(ReplaceDefaultPolicyVersionParamsProperty.builder()
     * .templateName("templateName")
     * .build())
     * .updateCaCertificateParams(UpdateCACertificateParamsProperty.builder()
     * .action("action")
     * .build())
     * .updateDeviceCertificateParams(UpdateDeviceCertificateParamsProperty.builder()
     * .action("action")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-mitigationaction-actionparams.html)
     */
    public inline fun cfnMitigationActionActionParamsProperty(
        block: CfnMitigationActionActionParamsPropertyDsl.() -> Unit = {}
    ): CfnMitigationAction.ActionParamsProperty {
        val builder = CfnMitigationActionActionParamsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Parameters used when defining a mitigation action that move a set of things to a thing group.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iot.*;
     * AddThingsToThingGroupParamsProperty addThingsToThingGroupParamsProperty =
     * AddThingsToThingGroupParamsProperty.builder()
     * .thingGroupNames(List.of("thingGroupNames"))
     * // the properties below are optional
     * .overrideDynamicGroups(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-mitigationaction-addthingstothinggroupparams.html)
     */
    public inline fun cfnMitigationActionAddThingsToThingGroupParamsProperty(
        block: CfnMitigationActionAddThingsToThingGroupParamsPropertyDsl.() -> Unit = {}
    ): CfnMitigationAction.AddThingsToThingGroupParamsProperty {
        val builder = CfnMitigationActionAddThingsToThingGroupParamsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Parameters used when defining a mitigation action that enable AWS IoT Core logging.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iot.*;
     * EnableIoTLoggingParamsProperty enableIoTLoggingParamsProperty =
     * EnableIoTLoggingParamsProperty.builder()
     * .logLevel("logLevel")
     * .roleArnForLogging("roleArnForLogging")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-mitigationaction-enableiotloggingparams.html)
     */
    public inline fun cfnMitigationActionEnableIoTLoggingParamsProperty(
        block: CfnMitigationActionEnableIoTLoggingParamsPropertyDsl.() -> Unit = {}
    ): CfnMitigationAction.EnableIoTLoggingParamsProperty {
        val builder = CfnMitigationActionEnableIoTLoggingParamsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnMitigationAction`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iot.*;
     * CfnMitigationActionProps cfnMitigationActionProps = CfnMitigationActionProps.builder()
     * .actionParams(ActionParamsProperty.builder()
     * .addThingsToThingGroupParams(AddThingsToThingGroupParamsProperty.builder()
     * .thingGroupNames(List.of("thingGroupNames"))
     * // the properties below are optional
     * .overrideDynamicGroups(false)
     * .build())
     * .enableIoTLoggingParams(EnableIoTLoggingParamsProperty.builder()
     * .logLevel("logLevel")
     * .roleArnForLogging("roleArnForLogging")
     * .build())
     * .publishFindingToSnsParams(PublishFindingToSnsParamsProperty.builder()
     * .topicArn("topicArn")
     * .build())
     * .replaceDefaultPolicyVersionParams(ReplaceDefaultPolicyVersionParamsProperty.builder()
     * .templateName("templateName")
     * .build())
     * .updateCaCertificateParams(UpdateCACertificateParamsProperty.builder()
     * .action("action")
     * .build())
     * .updateDeviceCertificateParams(UpdateDeviceCertificateParamsProperty.builder()
     * .action("action")
     * .build())
     * .build())
     * .roleArn("roleArn")
     * // the properties below are optional
     * .actionName("actionName")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-mitigationaction.html)
     */
    public inline fun cfnMitigationActionProps(
        block: CfnMitigationActionPropsDsl.() -> Unit = {}
    ): CfnMitigationActionProps {
        val builder = CfnMitigationActionPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Parameters to define a mitigation action that publishes findings to Amazon SNS.
     *
     * You can implement your own custom actions in response to the Amazon SNS messages.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iot.*;
     * PublishFindingToSnsParamsProperty publishFindingToSnsParamsProperty =
     * PublishFindingToSnsParamsProperty.builder()
     * .topicArn("topicArn")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-mitigationaction-publishfindingtosnsparams.html)
     */
    public inline fun cfnMitigationActionPublishFindingToSnsParamsProperty(
        block: CfnMitigationActionPublishFindingToSnsParamsPropertyDsl.() -> Unit = {}
    ): CfnMitigationAction.PublishFindingToSnsParamsProperty {
        val builder = CfnMitigationActionPublishFindingToSnsParamsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Parameters to define a mitigation action that adds a blank policy to restrict permissions.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iot.*;
     * ReplaceDefaultPolicyVersionParamsProperty replaceDefaultPolicyVersionParamsProperty =
     * ReplaceDefaultPolicyVersionParamsProperty.builder()
     * .templateName("templateName")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-mitigationaction-replacedefaultpolicyversionparams.html)
     */
    public inline fun cfnMitigationActionReplaceDefaultPolicyVersionParamsProperty(
        block: CfnMitigationActionReplaceDefaultPolicyVersionParamsPropertyDsl.() -> Unit = {}
    ): CfnMitigationAction.ReplaceDefaultPolicyVersionParamsProperty {
        val builder = CfnMitigationActionReplaceDefaultPolicyVersionParamsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Parameters to define a mitigation action that changes the state of the CA certificate to
     * inactive.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iot.*;
     * UpdateCACertificateParamsProperty updateCACertificateParamsProperty =
     * UpdateCACertificateParamsProperty.builder()
     * .action("action")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-mitigationaction-updatecacertificateparams.html)
     */
    public inline fun cfnMitigationActionUpdateCACertificateParamsProperty(
        block: CfnMitigationActionUpdateCACertificateParamsPropertyDsl.() -> Unit = {}
    ): CfnMitigationAction.UpdateCACertificateParamsProperty {
        val builder = CfnMitigationActionUpdateCACertificateParamsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Parameters to define a mitigation action that changes the state of the device certificate to
     * inactive.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iot.*;
     * UpdateDeviceCertificateParamsProperty updateDeviceCertificateParamsProperty =
     * UpdateDeviceCertificateParamsProperty.builder()
     * .action("action")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-mitigationaction-updatedevicecertificateparams.html)
     */
    public inline fun cfnMitigationActionUpdateDeviceCertificateParamsProperty(
        block: CfnMitigationActionUpdateDeviceCertificateParamsPropertyDsl.() -> Unit = {}
    ): CfnMitigationAction.UpdateDeviceCertificateParamsProperty {
        val builder = CfnMitigationActionUpdateDeviceCertificateParamsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Use the `AWS::IoT::Policy` resource to declare an AWS IoT policy.
     *
     * For more information about working with AWS IoT policies, see
     * [Authorization](https://docs.aws.amazon.com/iot/latest/developerguide/authorization.html) in
     * the *AWS IoT Developer Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iot.*;
     * Object policyDocument;
     * CfnPolicy cfnPolicy = CfnPolicy.Builder.create(this, "MyCfnPolicy")
     * .policyDocument(policyDocument)
     * // the properties below are optional
     * .policyName("policyName")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-policy.html)
     */
    public inline fun cfnPolicy(
        scope: Construct,
        id: String,
        block: CfnPolicyDsl.() -> Unit = {},
    ): CfnPolicy {
        val builder = CfnPolicyDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Use the `AWS::IoT::PolicyPrincipalAttachment` resource to attach an AWS IoT policy to a
     * principal (an X.509 certificate or other credential).
     *
     * For information about working with AWS IoT policies and principals, see
     * [Authorization](https://docs.aws.amazon.com/iot/latest/developerguide/authorization.html) in
     * the *AWS IoT Developer Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iot.*;
     * CfnPolicyPrincipalAttachment cfnPolicyPrincipalAttachment =
     * CfnPolicyPrincipalAttachment.Builder.create(this, "MyCfnPolicyPrincipalAttachment")
     * .policyName("policyName")
     * .principal("principal")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-policyprincipalattachment.html)
     */
    public inline fun cfnPolicyPrincipalAttachment(
        scope: Construct,
        id: String,
        block: CfnPolicyPrincipalAttachmentDsl.() -> Unit = {},
    ): CfnPolicyPrincipalAttachment {
        val builder = CfnPolicyPrincipalAttachmentDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnPolicyPrincipalAttachment`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iot.*;
     * CfnPolicyPrincipalAttachmentProps cfnPolicyPrincipalAttachmentProps =
     * CfnPolicyPrincipalAttachmentProps.builder()
     * .policyName("policyName")
     * .principal("principal")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-policyprincipalattachment.html)
     */
    public inline fun cfnPolicyPrincipalAttachmentProps(
        block: CfnPolicyPrincipalAttachmentPropsDsl.() -> Unit = {}
    ): CfnPolicyPrincipalAttachmentProps {
        val builder = CfnPolicyPrincipalAttachmentPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnPolicy`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iot.*;
     * Object policyDocument;
     * CfnPolicyProps cfnPolicyProps = CfnPolicyProps.builder()
     * .policyDocument(policyDocument)
     * // the properties below are optional
     * .policyName("policyName")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-policy.html)
     */
    public inline fun cfnPolicyProps(block: CfnPolicyPropsDsl.() -> Unit = {}): CfnPolicyProps {
        val builder = CfnPolicyPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Creates a fleet provisioning template.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iot.*;
     * CfnProvisioningTemplate cfnProvisioningTemplate = CfnProvisioningTemplate.Builder.create(this,
     * "MyCfnProvisioningTemplate")
     * .provisioningRoleArn("provisioningRoleArn")
     * .templateBody("templateBody")
     * // the properties below are optional
     * .description("description")
     * .enabled(false)
     * .preProvisioningHook(ProvisioningHookProperty.builder()
     * .payloadVersion("payloadVersion")
     * .targetArn("targetArn")
     * .build())
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .templateName("templateName")
     * .templateType("templateType")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-provisioningtemplate.html)
     */
    public inline fun cfnProvisioningTemplate(
        scope: Construct,
        id: String,
        block: CfnProvisioningTemplateDsl.() -> Unit = {},
    ): CfnProvisioningTemplate {
        val builder = CfnProvisioningTemplateDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnProvisioningTemplate`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iot.*;
     * CfnProvisioningTemplateProps cfnProvisioningTemplateProps =
     * CfnProvisioningTemplateProps.builder()
     * .provisioningRoleArn("provisioningRoleArn")
     * .templateBody("templateBody")
     * // the properties below are optional
     * .description("description")
     * .enabled(false)
     * .preProvisioningHook(ProvisioningHookProperty.builder()
     * .payloadVersion("payloadVersion")
     * .targetArn("targetArn")
     * .build())
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .templateName("templateName")
     * .templateType("templateType")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-provisioningtemplate.html)
     */
    public inline fun cfnProvisioningTemplateProps(
        block: CfnProvisioningTemplatePropsDsl.() -> Unit = {}
    ): CfnProvisioningTemplateProps {
        val builder = CfnProvisioningTemplatePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Structure that contains payloadVersion and targetArn.
     *
     * Provisioning hooks can be used when fleet provisioning to validate device parameters before
     * allowing the device to be provisioned.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iot.*;
     * ProvisioningHookProperty provisioningHookProperty = ProvisioningHookProperty.builder()
     * .payloadVersion("payloadVersion")
     * .targetArn("targetArn")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-provisioningtemplate-provisioninghook.html)
     */
    public inline fun cfnProvisioningTemplateProvisioningHookProperty(
        block: CfnProvisioningTemplateProvisioningHookPropertyDsl.() -> Unit = {}
    ): CfnProvisioningTemplate.ProvisioningHookProperty {
        val builder = CfnProvisioningTemplateProvisioningHookPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Configure resource-specific logging.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iot.*;
     * CfnResourceSpecificLogging cfnResourceSpecificLogging =
     * CfnResourceSpecificLogging.Builder.create(this, "MyCfnResourceSpecificLogging")
     * .logLevel("logLevel")
     * .targetName("targetName")
     * .targetType("targetType")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-resourcespecificlogging.html)
     */
    public inline fun cfnResourceSpecificLogging(
        scope: Construct,
        id: String,
        block: CfnResourceSpecificLoggingDsl.() -> Unit = {},
    ): CfnResourceSpecificLogging {
        val builder = CfnResourceSpecificLoggingDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnResourceSpecificLogging`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iot.*;
     * CfnResourceSpecificLoggingProps cfnResourceSpecificLoggingProps =
     * CfnResourceSpecificLoggingProps.builder()
     * .logLevel("logLevel")
     * .targetName("targetName")
     * .targetType("targetType")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-resourcespecificlogging.html)
     */
    public inline fun cfnResourceSpecificLoggingProps(
        block: CfnResourceSpecificLoggingPropsDsl.() -> Unit = {}
    ): CfnResourceSpecificLoggingProps {
        val builder = CfnResourceSpecificLoggingPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies a role alias.
     *
     * Requires permission to access the
     * [CreateRoleAlias](https://docs.aws.amazon.com//service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions)
     * action.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iot.*;
     * CfnRoleAlias cfnRoleAlias = CfnRoleAlias.Builder.create(this, "MyCfnRoleAlias")
     * .roleArn("roleArn")
     * // the properties below are optional
     * .credentialDurationSeconds(123)
     * .roleAlias("roleAlias")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-rolealias.html)
     */
    public inline fun cfnRoleAlias(
        scope: Construct,
        id: String,
        block: CfnRoleAliasDsl.() -> Unit = {},
    ): CfnRoleAlias {
        val builder = CfnRoleAliasDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnRoleAlias`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iot.*;
     * CfnRoleAliasProps cfnRoleAliasProps = CfnRoleAliasProps.builder()
     * .roleArn("roleArn")
     * // the properties below are optional
     * .credentialDurationSeconds(123)
     * .roleAlias("roleAlias")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-rolealias.html)
     */
    public inline fun cfnRoleAliasProps(
        block: CfnRoleAliasPropsDsl.() -> Unit = {}
    ): CfnRoleAliasProps {
        val builder = CfnRoleAliasPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Use the `AWS::IoT::ScheduledAudit` resource to create a scheduled audit that is run at a
     * specified time interval.
     *
     * For API reference, see
     * [CreateScheduleAudit](https://docs.aws.amazon.com/iot/latest/apireference/API_CreateScheduledAudit.html)
     * and for general information, see
     * [Audit](https://docs.aws.amazon.com/iot/latest/developerguide/device-defender-audit.html) .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iot.*;
     * CfnScheduledAudit cfnScheduledAudit = CfnScheduledAudit.Builder.create(this,
     * "MyCfnScheduledAudit")
     * .frequency("frequency")
     * .targetCheckNames(List.of("targetCheckNames"))
     * // the properties below are optional
     * .dayOfMonth("dayOfMonth")
     * .dayOfWeek("dayOfWeek")
     * .scheduledAuditName("scheduledAuditName")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-scheduledaudit.html)
     */
    public inline fun cfnScheduledAudit(
        scope: Construct,
        id: String,
        block: CfnScheduledAuditDsl.() -> Unit = {},
    ): CfnScheduledAudit {
        val builder = CfnScheduledAuditDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnScheduledAudit`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iot.*;
     * CfnScheduledAuditProps cfnScheduledAuditProps = CfnScheduledAuditProps.builder()
     * .frequency("frequency")
     * .targetCheckNames(List.of("targetCheckNames"))
     * // the properties below are optional
     * .dayOfMonth("dayOfMonth")
     * .dayOfWeek("dayOfWeek")
     * .scheduledAuditName("scheduledAuditName")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-scheduledaudit.html)
     */
    public inline fun cfnScheduledAuditProps(
        block: CfnScheduledAuditPropsDsl.() -> Unit = {}
    ): CfnScheduledAuditProps {
        val builder = CfnScheduledAuditPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Use the `AWS::IoT::SecurityProfile` resource to create a Device Defender security profile.
     *
     * For API reference, see
     * [CreateSecurityProfile](https://docs.aws.amazon.com/iot/latest/apireference/API_CreateSecurityProfile.html)
     * and for general information, see
     * [Detect](https://docs.aws.amazon.com/iot/latest/developerguide/device-defender-detect.html) .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iot.*;
     * CfnSecurityProfile cfnSecurityProfile = CfnSecurityProfile.Builder.create(this,
     * "MyCfnSecurityProfile")
     * .additionalMetricsToRetainV2(List.of(MetricToRetainProperty.builder()
     * .metric("metric")
     * // the properties below are optional
     * .metricDimension(MetricDimensionProperty.builder()
     * .dimensionName("dimensionName")
     * // the properties below are optional
     * .operator("operator")
     * .build())
     * .build()))
     * .alertTargets(Map.of(
     * "alertTargetsKey", AlertTargetProperty.builder()
     * .alertTargetArn("alertTargetArn")
     * .roleArn("roleArn")
     * .build()))
     * .behaviors(List.of(BehaviorProperty.builder()
     * .name("name")
     * // the properties below are optional
     * .criteria(BehaviorCriteriaProperty.builder()
     * .comparisonOperator("comparisonOperator")
     * .consecutiveDatapointsToAlarm(123)
     * .consecutiveDatapointsToClear(123)
     * .durationSeconds(123)
     * .mlDetectionConfig(MachineLearningDetectionConfigProperty.builder()
     * .confidenceLevel("confidenceLevel")
     * .build())
     * .statisticalThreshold(StatisticalThresholdProperty.builder()
     * .statistic("statistic")
     * .build())
     * .value(MetricValueProperty.builder()
     * .cidrs(List.of("cidrs"))
     * .count("count")
     * .number(123)
     * .numbers(List.of(123))
     * .ports(List.of(123))
     * .strings(List.of("strings"))
     * .build())
     * .build())
     * .metric("metric")
     * .metricDimension(MetricDimensionProperty.builder()
     * .dimensionName("dimensionName")
     * // the properties below are optional
     * .operator("operator")
     * .build())
     * .suppressAlerts(false)
     * .build()))
     * .securityProfileDescription("securityProfileDescription")
     * .securityProfileName("securityProfileName")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .targetArns(List.of("targetArns"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-securityprofile.html)
     */
    public inline fun cfnSecurityProfile(
        scope: Construct,
        id: String,
        block: CfnSecurityProfileDsl.() -> Unit = {},
    ): CfnSecurityProfile {
        val builder = CfnSecurityProfileDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * A structure containing the alert target ARN and the role ARN.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iot.*;
     * AlertTargetProperty alertTargetProperty = AlertTargetProperty.builder()
     * .alertTargetArn("alertTargetArn")
     * .roleArn("roleArn")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-securityprofile-alerttarget.html)
     */
    public inline fun cfnSecurityProfileAlertTargetProperty(
        block: CfnSecurityProfileAlertTargetPropertyDsl.() -> Unit = {}
    ): CfnSecurityProfile.AlertTargetProperty {
        val builder = CfnSecurityProfileAlertTargetPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The criteria by which the behavior is determined to be normal.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iot.*;
     * BehaviorCriteriaProperty behaviorCriteriaProperty = BehaviorCriteriaProperty.builder()
     * .comparisonOperator("comparisonOperator")
     * .consecutiveDatapointsToAlarm(123)
     * .consecutiveDatapointsToClear(123)
     * .durationSeconds(123)
     * .mlDetectionConfig(MachineLearningDetectionConfigProperty.builder()
     * .confidenceLevel("confidenceLevel")
     * .build())
     * .statisticalThreshold(StatisticalThresholdProperty.builder()
     * .statistic("statistic")
     * .build())
     * .value(MetricValueProperty.builder()
     * .cidrs(List.of("cidrs"))
     * .count("count")
     * .number(123)
     * .numbers(List.of(123))
     * .ports(List.of(123))
     * .strings(List.of("strings"))
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-securityprofile-behaviorcriteria.html)
     */
    public inline fun cfnSecurityProfileBehaviorCriteriaProperty(
        block: CfnSecurityProfileBehaviorCriteriaPropertyDsl.() -> Unit = {}
    ): CfnSecurityProfile.BehaviorCriteriaProperty {
        val builder = CfnSecurityProfileBehaviorCriteriaPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A Device Defender security profile behavior.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iot.*;
     * BehaviorProperty behaviorProperty = BehaviorProperty.builder()
     * .name("name")
     * // the properties below are optional
     * .criteria(BehaviorCriteriaProperty.builder()
     * .comparisonOperator("comparisonOperator")
     * .consecutiveDatapointsToAlarm(123)
     * .consecutiveDatapointsToClear(123)
     * .durationSeconds(123)
     * .mlDetectionConfig(MachineLearningDetectionConfigProperty.builder()
     * .confidenceLevel("confidenceLevel")
     * .build())
     * .statisticalThreshold(StatisticalThresholdProperty.builder()
     * .statistic("statistic")
     * .build())
     * .value(MetricValueProperty.builder()
     * .cidrs(List.of("cidrs"))
     * .count("count")
     * .number(123)
     * .numbers(List.of(123))
     * .ports(List.of(123))
     * .strings(List.of("strings"))
     * .build())
     * .build())
     * .metric("metric")
     * .metricDimension(MetricDimensionProperty.builder()
     * .dimensionName("dimensionName")
     * // the properties below are optional
     * .operator("operator")
     * .build())
     * .suppressAlerts(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-securityprofile-behavior.html)
     */
    public inline fun cfnSecurityProfileBehaviorProperty(
        block: CfnSecurityProfileBehaviorPropertyDsl.() -> Unit = {}
    ): CfnSecurityProfile.BehaviorProperty {
        val builder = CfnSecurityProfileBehaviorPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `MachineLearningDetectionConfig` property type controls confidence of the machine
     * learning model.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iot.*;
     * MachineLearningDetectionConfigProperty machineLearningDetectionConfigProperty =
     * MachineLearningDetectionConfigProperty.builder()
     * .confidenceLevel("confidenceLevel")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-securityprofile-machinelearningdetectionconfig.html)
     */
    public inline fun cfnSecurityProfileMachineLearningDetectionConfigProperty(
        block: CfnSecurityProfileMachineLearningDetectionConfigPropertyDsl.() -> Unit = {}
    ): CfnSecurityProfile.MachineLearningDetectionConfigProperty {
        val builder = CfnSecurityProfileMachineLearningDetectionConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The dimension of the metric.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iot.*;
     * MetricDimensionProperty metricDimensionProperty = MetricDimensionProperty.builder()
     * .dimensionName("dimensionName")
     * // the properties below are optional
     * .operator("operator")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-securityprofile-metricdimension.html)
     */
    public inline fun cfnSecurityProfileMetricDimensionProperty(
        block: CfnSecurityProfileMetricDimensionPropertyDsl.() -> Unit = {}
    ): CfnSecurityProfile.MetricDimensionProperty {
        val builder = CfnSecurityProfileMetricDimensionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The metric you want to retain.
     *
     * Dimensions are optional.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iot.*;
     * MetricToRetainProperty metricToRetainProperty = MetricToRetainProperty.builder()
     * .metric("metric")
     * // the properties below are optional
     * .metricDimension(MetricDimensionProperty.builder()
     * .dimensionName("dimensionName")
     * // the properties below are optional
     * .operator("operator")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-securityprofile-metrictoretain.html)
     */
    public inline fun cfnSecurityProfileMetricToRetainProperty(
        block: CfnSecurityProfileMetricToRetainPropertyDsl.() -> Unit = {}
    ): CfnSecurityProfile.MetricToRetainProperty {
        val builder = CfnSecurityProfileMetricToRetainPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The value to be compared with the `metric` .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iot.*;
     * MetricValueProperty metricValueProperty = MetricValueProperty.builder()
     * .cidrs(List.of("cidrs"))
     * .count("count")
     * .number(123)
     * .numbers(List.of(123))
     * .ports(List.of(123))
     * .strings(List.of("strings"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-securityprofile-metricvalue.html)
     */
    public inline fun cfnSecurityProfileMetricValueProperty(
        block: CfnSecurityProfileMetricValuePropertyDsl.() -> Unit = {}
    ): CfnSecurityProfile.MetricValueProperty {
        val builder = CfnSecurityProfileMetricValuePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnSecurityProfile`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iot.*;
     * CfnSecurityProfileProps cfnSecurityProfileProps = CfnSecurityProfileProps.builder()
     * .additionalMetricsToRetainV2(List.of(MetricToRetainProperty.builder()
     * .metric("metric")
     * // the properties below are optional
     * .metricDimension(MetricDimensionProperty.builder()
     * .dimensionName("dimensionName")
     * // the properties below are optional
     * .operator("operator")
     * .build())
     * .build()))
     * .alertTargets(Map.of(
     * "alertTargetsKey", AlertTargetProperty.builder()
     * .alertTargetArn("alertTargetArn")
     * .roleArn("roleArn")
     * .build()))
     * .behaviors(List.of(BehaviorProperty.builder()
     * .name("name")
     * // the properties below are optional
     * .criteria(BehaviorCriteriaProperty.builder()
     * .comparisonOperator("comparisonOperator")
     * .consecutiveDatapointsToAlarm(123)
     * .consecutiveDatapointsToClear(123)
     * .durationSeconds(123)
     * .mlDetectionConfig(MachineLearningDetectionConfigProperty.builder()
     * .confidenceLevel("confidenceLevel")
     * .build())
     * .statisticalThreshold(StatisticalThresholdProperty.builder()
     * .statistic("statistic")
     * .build())
     * .value(MetricValueProperty.builder()
     * .cidrs(List.of("cidrs"))
     * .count("count")
     * .number(123)
     * .numbers(List.of(123))
     * .ports(List.of(123))
     * .strings(List.of("strings"))
     * .build())
     * .build())
     * .metric("metric")
     * .metricDimension(MetricDimensionProperty.builder()
     * .dimensionName("dimensionName")
     * // the properties below are optional
     * .operator("operator")
     * .build())
     * .suppressAlerts(false)
     * .build()))
     * .securityProfileDescription("securityProfileDescription")
     * .securityProfileName("securityProfileName")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .targetArns(List.of("targetArns"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-securityprofile.html)
     */
    public inline fun cfnSecurityProfileProps(
        block: CfnSecurityProfilePropsDsl.() -> Unit = {}
    ): CfnSecurityProfileProps {
        val builder = CfnSecurityProfilePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A statistical ranking (percentile) that indicates a threshold value by which a behavior is
     * determined to be in compliance or in violation of the behavior.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iot.*;
     * StatisticalThresholdProperty statisticalThresholdProperty =
     * StatisticalThresholdProperty.builder()
     * .statistic("statistic")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-securityprofile-statisticalthreshold.html)
     */
    public inline fun cfnSecurityProfileStatisticalThresholdProperty(
        block: CfnSecurityProfileStatisticalThresholdPropertyDsl.() -> Unit = {}
    ): CfnSecurityProfile.StatisticalThresholdProperty {
        val builder = CfnSecurityProfileStatisticalThresholdPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Use the `AWS::IoT::Thing` resource to declare an AWS IoT thing.
     *
     * For information about working with things, see
     * [How AWS IoT Works](https://docs.aws.amazon.com/iot/latest/developerguide/aws-iot-how-it-works.html)
     * and
     * [Device Registry for AWS IoT](https://docs.aws.amazon.com/iot/latest/developerguide/thing-registry.html)
     * in the *AWS IoT Developer Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iot.*;
     * CfnThing cfnThing = CfnThing.Builder.create(this, "MyCfnThing")
     * .attributePayload(AttributePayloadProperty.builder()
     * .attributes(Map.of(
     * "attributesKey", "attributes"))
     * .build())
     * .thingName("thingName")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-thing.html)
     */
    public inline fun cfnThing(
        scope: Construct,
        id: String,
        block: CfnThingDsl.() -> Unit = {},
    ): CfnThing {
        val builder = CfnThingDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * The AttributePayload property specifies up to three attributes for an AWS IoT as key-value
     * pairs.
     *
     * AttributePayload is a property of the
     * [AWS::IoT::Thing](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-thing.html)
     * resource.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iot.*;
     * AttributePayloadProperty attributePayloadProperty = AttributePayloadProperty.builder()
     * .attributes(Map.of(
     * "attributesKey", "attributes"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-thing-attributepayload.html)
     */
    public inline fun cfnThingAttributePayloadProperty(
        block: CfnThingAttributePayloadPropertyDsl.() -> Unit = {}
    ): CfnThing.AttributePayloadProperty {
        val builder = CfnThingAttributePayloadPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Creates a new thing group.
     *
     * A dynamic thing group is created if the resource template contains the `QueryString`
     * attribute. A dynamic thing group will not contain the `ParentGroupName` attribute. A static
     * thing group and dynamic thing group can't be converted to each other via the addition or
     * removal of the `QueryString` attribute.
     *
     * This is a control plane operation. See
     * [Authorization](https://docs.aws.amazon.com/iot/latest/developerguide/iot-authorization.html)
     * for information about authorizing control plane actions.
     *
     * Requires permission to access the
     * [CreateThingGroup](https://docs.aws.amazon.com//service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions)
     * action.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iot.*;
     * CfnThingGroup cfnThingGroup = CfnThingGroup.Builder.create(this, "MyCfnThingGroup")
     * .parentGroupName("parentGroupName")
     * .queryString("queryString")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .thingGroupName("thingGroupName")
     * .thingGroupProperties(ThingGroupPropertiesProperty.builder()
     * .attributePayload(AttributePayloadProperty.builder()
     * .attributes(Map.of(
     * "attributesKey", "attributes"))
     * .build())
     * .thingGroupDescription("thingGroupDescription")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-thinggroup.html)
     */
    public inline fun cfnThingGroup(
        scope: Construct,
        id: String,
        block: CfnThingGroupDsl.() -> Unit = {},
    ): CfnThingGroup {
        val builder = CfnThingGroupDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * The attribute payload.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iot.*;
     * AttributePayloadProperty attributePayloadProperty = AttributePayloadProperty.builder()
     * .attributes(Map.of(
     * "attributesKey", "attributes"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-thinggroup-attributepayload.html)
     */
    public inline fun cfnThingGroupAttributePayloadProperty(
        block: CfnThingGroupAttributePayloadPropertyDsl.() -> Unit = {}
    ): CfnThingGroup.AttributePayloadProperty {
        val builder = CfnThingGroupAttributePayloadPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnThingGroup`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iot.*;
     * CfnThingGroupProps cfnThingGroupProps = CfnThingGroupProps.builder()
     * .parentGroupName("parentGroupName")
     * .queryString("queryString")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .thingGroupName("thingGroupName")
     * .thingGroupProperties(ThingGroupPropertiesProperty.builder()
     * .attributePayload(AttributePayloadProperty.builder()
     * .attributes(Map.of(
     * "attributesKey", "attributes"))
     * .build())
     * .thingGroupDescription("thingGroupDescription")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-thinggroup.html)
     */
    public inline fun cfnThingGroupProps(
        block: CfnThingGroupPropsDsl.() -> Unit = {}
    ): CfnThingGroupProps {
        val builder = CfnThingGroupPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Thing group properties.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iot.*;
     * ThingGroupPropertiesProperty thingGroupPropertiesProperty =
     * ThingGroupPropertiesProperty.builder()
     * .attributePayload(AttributePayloadProperty.builder()
     * .attributes(Map.of(
     * "attributesKey", "attributes"))
     * .build())
     * .thingGroupDescription("thingGroupDescription")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-thinggroup-thinggroupproperties.html)
     */
    public inline fun cfnThingGroupThingGroupPropertiesProperty(
        block: CfnThingGroupThingGroupPropertiesPropertyDsl.() -> Unit = {}
    ): CfnThingGroup.ThingGroupPropertiesProperty {
        val builder = CfnThingGroupThingGroupPropertiesPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Use the `AWS::IoT::ThingPrincipalAttachment` resource to attach a principal (an X.509
     * certificate or another credential) to a thing.
     *
     * For more information about working with AWS IoT things and principals, see
     * [Authorization](https://docs.aws.amazon.com/iot/latest/developerguide/authorization.html) in
     * the *AWS IoT Developer Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iot.*;
     * CfnThingPrincipalAttachment cfnThingPrincipalAttachment =
     * CfnThingPrincipalAttachment.Builder.create(this, "MyCfnThingPrincipalAttachment")
     * .principal("principal")
     * .thingName("thingName")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-thingprincipalattachment.html)
     */
    public inline fun cfnThingPrincipalAttachment(
        scope: Construct,
        id: String,
        block: CfnThingPrincipalAttachmentDsl.() -> Unit = {},
    ): CfnThingPrincipalAttachment {
        val builder = CfnThingPrincipalAttachmentDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnThingPrincipalAttachment`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iot.*;
     * CfnThingPrincipalAttachmentProps cfnThingPrincipalAttachmentProps =
     * CfnThingPrincipalAttachmentProps.builder()
     * .principal("principal")
     * .thingName("thingName")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-thingprincipalattachment.html)
     */
    public inline fun cfnThingPrincipalAttachmentProps(
        block: CfnThingPrincipalAttachmentPropsDsl.() -> Unit = {}
    ): CfnThingPrincipalAttachmentProps {
        val builder = CfnThingPrincipalAttachmentPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnThing`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iot.*;
     * CfnThingProps cfnThingProps = CfnThingProps.builder()
     * .attributePayload(AttributePayloadProperty.builder()
     * .attributes(Map.of(
     * "attributesKey", "attributes"))
     * .build())
     * .thingName("thingName")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-thing.html)
     */
    public inline fun cfnThingProps(block: CfnThingPropsDsl.() -> Unit = {}): CfnThingProps {
        val builder = CfnThingPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Creates a new thing type.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iot.*;
     * CfnThingType cfnThingType = CfnThingType.Builder.create(this, "MyCfnThingType")
     * .deprecateThingType(false)
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .thingTypeName("thingTypeName")
     * .thingTypeProperties(ThingTypePropertiesProperty.builder()
     * .searchableAttributes(List.of("searchableAttributes"))
     * .thingTypeDescription("thingTypeDescription")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-thingtype.html)
     */
    public inline fun cfnThingType(
        scope: Construct,
        id: String,
        block: CfnThingTypeDsl.() -> Unit = {},
    ): CfnThingType {
        val builder = CfnThingTypeDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnThingType`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iot.*;
     * CfnThingTypeProps cfnThingTypeProps = CfnThingTypeProps.builder()
     * .deprecateThingType(false)
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .thingTypeName("thingTypeName")
     * .thingTypeProperties(ThingTypePropertiesProperty.builder()
     * .searchableAttributes(List.of("searchableAttributes"))
     * .thingTypeDescription("thingTypeDescription")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-thingtype.html)
     */
    public inline fun cfnThingTypeProps(
        block: CfnThingTypePropsDsl.() -> Unit = {}
    ): CfnThingTypeProps {
        val builder = CfnThingTypePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The ThingTypeProperties contains information about the thing type including: a thing type
     * description, and a list of searchable thing attribute names.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iot.*;
     * ThingTypePropertiesProperty thingTypePropertiesProperty = ThingTypePropertiesProperty.builder()
     * .searchableAttributes(List.of("searchableAttributes"))
     * .thingTypeDescription("thingTypeDescription")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-thingtype-thingtypeproperties.html)
     */
    public inline fun cfnThingTypeThingTypePropertiesProperty(
        block: CfnThingTypeThingTypePropertiesPropertyDsl.() -> Unit = {}
    ): CfnThingType.ThingTypePropertiesProperty {
        val builder = CfnThingTypeThingTypePropertiesPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Use the `AWS::IoT::TopicRule` resource to declare an AWS IoT rule.
     *
     * For information about working with AWS IoT rules, see
     * [Rules for AWS IoT](https://docs.aws.amazon.com/iot/latest/developerguide/iot-rules.html) in
     * the *AWS IoT Developer Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iot.*;
     * CfnTopicRule cfnTopicRule = CfnTopicRule.Builder.create(this, "MyCfnTopicRule")
     * .topicRulePayload(TopicRulePayloadProperty.builder()
     * .actions(List.of(ActionProperty.builder()
     * .cloudwatchAlarm(CloudwatchAlarmActionProperty.builder()
     * .alarmName("alarmName")
     * .roleArn("roleArn")
     * .stateReason("stateReason")
     * .stateValue("stateValue")
     * .build())
     * .cloudwatchLogs(CloudwatchLogsActionProperty.builder()
     * .logGroupName("logGroupName")
     * .roleArn("roleArn")
     * // the properties below are optional
     * .batchMode(false)
     * .build())
     * .cloudwatchMetric(CloudwatchMetricActionProperty.builder()
     * .metricName("metricName")
     * .metricNamespace("metricNamespace")
     * .metricUnit("metricUnit")
     * .metricValue("metricValue")
     * .roleArn("roleArn")
     * // the properties below are optional
     * .metricTimestamp("metricTimestamp")
     * .build())
     * .dynamoDb(DynamoDBActionProperty.builder()
     * .hashKeyField("hashKeyField")
     * .hashKeyValue("hashKeyValue")
     * .roleArn("roleArn")
     * .tableName("tableName")
     * // the properties below are optional
     * .hashKeyType("hashKeyType")
     * .payloadField("payloadField")
     * .rangeKeyField("rangeKeyField")
     * .rangeKeyType("rangeKeyType")
     * .rangeKeyValue("rangeKeyValue")
     * .build())
     * .dynamoDBv2(DynamoDBv2ActionProperty.builder()
     * .putItem(PutItemInputProperty.builder()
     * .tableName("tableName")
     * .build())
     * .roleArn("roleArn")
     * .build())
     * .elasticsearch(ElasticsearchActionProperty.builder()
     * .endpoint("endpoint")
     * .id("id")
     * .index("index")
     * .roleArn("roleArn")
     * .type("type")
     * .build())
     * .firehose(FirehoseActionProperty.builder()
     * .deliveryStreamName("deliveryStreamName")
     * .roleArn("roleArn")
     * // the properties below are optional
     * .batchMode(false)
     * .separator("separator")
     * .build())
     * .http(HttpActionProperty.builder()
     * .url("url")
     * // the properties below are optional
     * .auth(HttpAuthorizationProperty.builder()
     * .sigv4(SigV4AuthorizationProperty.builder()
     * .roleArn("roleArn")
     * .serviceName("serviceName")
     * .signingRegion("signingRegion")
     * .build())
     * .build())
     * .confirmationUrl("confirmationUrl")
     * .headers(List.of(HttpActionHeaderProperty.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build())
     * .iotAnalytics(IotAnalyticsActionProperty.builder()
     * .channelName("channelName")
     * .roleArn("roleArn")
     * // the properties below are optional
     * .batchMode(false)
     * .build())
     * .iotEvents(IotEventsActionProperty.builder()
     * .inputName("inputName")
     * .roleArn("roleArn")
     * // the properties below are optional
     * .batchMode(false)
     * .messageId("messageId")
     * .build())
     * .iotSiteWise(IotSiteWiseActionProperty.builder()
     * .putAssetPropertyValueEntries(List.of(PutAssetPropertyValueEntryProperty.builder()
     * .propertyValues(List.of(AssetPropertyValueProperty.builder()
     * .timestamp(AssetPropertyTimestampProperty.builder()
     * .timeInSeconds("timeInSeconds")
     * // the properties below are optional
     * .offsetInNanos("offsetInNanos")
     * .build())
     * .value(AssetPropertyVariantProperty.builder()
     * .booleanValue("booleanValue")
     * .doubleValue("doubleValue")
     * .integerValue("integerValue")
     * .stringValue("stringValue")
     * .build())
     * // the properties below are optional
     * .quality("quality")
     * .build()))
     * // the properties below are optional
     * .assetId("assetId")
     * .entryId("entryId")
     * .propertyAlias("propertyAlias")
     * .propertyId("propertyId")
     * .build()))
     * .roleArn("roleArn")
     * .build())
     * .kafka(KafkaActionProperty.builder()
     * .clientProperties(Map.of(
     * "clientPropertiesKey", "clientProperties"))
     * .destinationArn("destinationArn")
     * .topic("topic")
     * // the properties below are optional
     * .key("key")
     * .partition("partition")
     * .build())
     * .kinesis(KinesisActionProperty.builder()
     * .roleArn("roleArn")
     * .streamName("streamName")
     * // the properties below are optional
     * .partitionKey("partitionKey")
     * .build())
     * .lambda(LambdaActionProperty.builder()
     * .functionArn("functionArn")
     * .build())
     * .location(LocationActionProperty.builder()
     * .deviceId("deviceId")
     * .latitude("latitude")
     * .longitude("longitude")
     * .roleArn("roleArn")
     * .trackerName("trackerName")
     * // the properties below are optional
     * .timestamp(TimestampProperty.builder()
     * .value("value")
     * // the properties below are optional
     * .unit("unit")
     * .build())
     * .build())
     * .openSearch(OpenSearchActionProperty.builder()
     * .endpoint("endpoint")
     * .id("id")
     * .index("index")
     * .roleArn("roleArn")
     * .type("type")
     * .build())
     * .republish(RepublishActionProperty.builder()
     * .roleArn("roleArn")
     * .topic("topic")
     * // the properties below are optional
     * .headers(RepublishActionHeadersProperty.builder()
     * .contentType("contentType")
     * .correlationData("correlationData")
     * .messageExpiry("messageExpiry")
     * .payloadFormatIndicator("payloadFormatIndicator")
     * .responseTopic("responseTopic")
     * .userProperties(List.of(UserPropertyProperty.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build())
     * .qos(123)
     * .build())
     * .s3(S3ActionProperty.builder()
     * .bucketName("bucketName")
     * .key("key")
     * .roleArn("roleArn")
     * // the properties below are optional
     * .cannedAcl("cannedAcl")
     * .build())
     * .sns(SnsActionProperty.builder()
     * .roleArn("roleArn")
     * .targetArn("targetArn")
     * // the properties below are optional
     * .messageFormat("messageFormat")
     * .build())
     * .sqs(SqsActionProperty.builder()
     * .queueUrl("queueUrl")
     * .roleArn("roleArn")
     * // the properties below are optional
     * .useBase64(false)
     * .build())
     * .stepFunctions(StepFunctionsActionProperty.builder()
     * .roleArn("roleArn")
     * .stateMachineName("stateMachineName")
     * // the properties below are optional
     * .executionNamePrefix("executionNamePrefix")
     * .build())
     * .timestream(TimestreamActionProperty.builder()
     * .databaseName("databaseName")
     * .dimensions(List.of(TimestreamDimensionProperty.builder()
     * .name("name")
     * .value("value")
     * .build()))
     * .roleArn("roleArn")
     * .tableName("tableName")
     * // the properties below are optional
     * .timestamp(TimestreamTimestampProperty.builder()
     * .unit("unit")
     * .value("value")
     * .build())
     * .build())
     * .build()))
     * .sql("sql")
     * // the properties below are optional
     * .awsIotSqlVersion("awsIotSqlVersion")
     * .description("description")
     * .errorAction(ActionProperty.builder()
     * .cloudwatchAlarm(CloudwatchAlarmActionProperty.builder()
     * .alarmName("alarmName")
     * .roleArn("roleArn")
     * .stateReason("stateReason")
     * .stateValue("stateValue")
     * .build())
     * .cloudwatchLogs(CloudwatchLogsActionProperty.builder()
     * .logGroupName("logGroupName")
     * .roleArn("roleArn")
     * // the properties below are optional
     * .batchMode(false)
     * .build())
     * .cloudwatchMetric(CloudwatchMetricActionProperty.builder()
     * .metricName("metricName")
     * .metricNamespace("metricNamespace")
     * .metricUnit("metricUnit")
     * .metricValue("metricValue")
     * .roleArn("roleArn")
     * // the properties below are optional
     * .metricTimestamp("metricTimestamp")
     * .build())
     * .dynamoDb(DynamoDBActionProperty.builder()
     * .hashKeyField("hashKeyField")
     * .hashKeyValue("hashKeyValue")
     * .roleArn("roleArn")
     * .tableName("tableName")
     * // the properties below are optional
     * .hashKeyType("hashKeyType")
     * .payloadField("payloadField")
     * .rangeKeyField("rangeKeyField")
     * .rangeKeyType("rangeKeyType")
     * .rangeKeyValue("rangeKeyValue")
     * .build())
     * .dynamoDBv2(DynamoDBv2ActionProperty.builder()
     * .putItem(PutItemInputProperty.builder()
     * .tableName("tableName")
     * .build())
     * .roleArn("roleArn")
     * .build())
     * .elasticsearch(ElasticsearchActionProperty.builder()
     * .endpoint("endpoint")
     * .id("id")
     * .index("index")
     * .roleArn("roleArn")
     * .type("type")
     * .build())
     * .firehose(FirehoseActionProperty.builder()
     * .deliveryStreamName("deliveryStreamName")
     * .roleArn("roleArn")
     * // the properties below are optional
     * .batchMode(false)
     * .separator("separator")
     * .build())
     * .http(HttpActionProperty.builder()
     * .url("url")
     * // the properties below are optional
     * .auth(HttpAuthorizationProperty.builder()
     * .sigv4(SigV4AuthorizationProperty.builder()
     * .roleArn("roleArn")
     * .serviceName("serviceName")
     * .signingRegion("signingRegion")
     * .build())
     * .build())
     * .confirmationUrl("confirmationUrl")
     * .headers(List.of(HttpActionHeaderProperty.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build())
     * .iotAnalytics(IotAnalyticsActionProperty.builder()
     * .channelName("channelName")
     * .roleArn("roleArn")
     * // the properties below are optional
     * .batchMode(false)
     * .build())
     * .iotEvents(IotEventsActionProperty.builder()
     * .inputName("inputName")
     * .roleArn("roleArn")
     * // the properties below are optional
     * .batchMode(false)
     * .messageId("messageId")
     * .build())
     * .iotSiteWise(IotSiteWiseActionProperty.builder()
     * .putAssetPropertyValueEntries(List.of(PutAssetPropertyValueEntryProperty.builder()
     * .propertyValues(List.of(AssetPropertyValueProperty.builder()
     * .timestamp(AssetPropertyTimestampProperty.builder()
     * .timeInSeconds("timeInSeconds")
     * // the properties below are optional
     * .offsetInNanos("offsetInNanos")
     * .build())
     * .value(AssetPropertyVariantProperty.builder()
     * .booleanValue("booleanValue")
     * .doubleValue("doubleValue")
     * .integerValue("integerValue")
     * .stringValue("stringValue")
     * .build())
     * // the properties below are optional
     * .quality("quality")
     * .build()))
     * // the properties below are optional
     * .assetId("assetId")
     * .entryId("entryId")
     * .propertyAlias("propertyAlias")
     * .propertyId("propertyId")
     * .build()))
     * .roleArn("roleArn")
     * .build())
     * .kafka(KafkaActionProperty.builder()
     * .clientProperties(Map.of(
     * "clientPropertiesKey", "clientProperties"))
     * .destinationArn("destinationArn")
     * .topic("topic")
     * // the properties below are optional
     * .key("key")
     * .partition("partition")
     * .build())
     * .kinesis(KinesisActionProperty.builder()
     * .roleArn("roleArn")
     * .streamName("streamName")
     * // the properties below are optional
     * .partitionKey("partitionKey")
     * .build())
     * .lambda(LambdaActionProperty.builder()
     * .functionArn("functionArn")
     * .build())
     * .location(LocationActionProperty.builder()
     * .deviceId("deviceId")
     * .latitude("latitude")
     * .longitude("longitude")
     * .roleArn("roleArn")
     * .trackerName("trackerName")
     * // the properties below are optional
     * .timestamp(TimestampProperty.builder()
     * .value("value")
     * // the properties below are optional
     * .unit("unit")
     * .build())
     * .build())
     * .openSearch(OpenSearchActionProperty.builder()
     * .endpoint("endpoint")
     * .id("id")
     * .index("index")
     * .roleArn("roleArn")
     * .type("type")
     * .build())
     * .republish(RepublishActionProperty.builder()
     * .roleArn("roleArn")
     * .topic("topic")
     * // the properties below are optional
     * .headers(RepublishActionHeadersProperty.builder()
     * .contentType("contentType")
     * .correlationData("correlationData")
     * .messageExpiry("messageExpiry")
     * .payloadFormatIndicator("payloadFormatIndicator")
     * .responseTopic("responseTopic")
     * .userProperties(List.of(UserPropertyProperty.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build())
     * .qos(123)
     * .build())
     * .s3(S3ActionProperty.builder()
     * .bucketName("bucketName")
     * .key("key")
     * .roleArn("roleArn")
     * // the properties below are optional
     * .cannedAcl("cannedAcl")
     * .build())
     * .sns(SnsActionProperty.builder()
     * .roleArn("roleArn")
     * .targetArn("targetArn")
     * // the properties below are optional
     * .messageFormat("messageFormat")
     * .build())
     * .sqs(SqsActionProperty.builder()
     * .queueUrl("queueUrl")
     * .roleArn("roleArn")
     * // the properties below are optional
     * .useBase64(false)
     * .build())
     * .stepFunctions(StepFunctionsActionProperty.builder()
     * .roleArn("roleArn")
     * .stateMachineName("stateMachineName")
     * // the properties below are optional
     * .executionNamePrefix("executionNamePrefix")
     * .build())
     * .timestream(TimestreamActionProperty.builder()
     * .databaseName("databaseName")
     * .dimensions(List.of(TimestreamDimensionProperty.builder()
     * .name("name")
     * .value("value")
     * .build()))
     * .roleArn("roleArn")
     * .tableName("tableName")
     * // the properties below are optional
     * .timestamp(TimestreamTimestampProperty.builder()
     * .unit("unit")
     * .value("value")
     * .build())
     * .build())
     * .build())
     * .ruleDisabled(false)
     * .build())
     * // the properties below are optional
     * .ruleName("ruleName")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-topicrule.html)
     */
    public inline fun cfnTopicRule(
        scope: Construct,
        id: String,
        block: CfnTopicRuleDsl.() -> Unit = {},
    ): CfnTopicRule {
        val builder = CfnTopicRuleDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Describes the actions associated with a rule.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iot.*;
     * ActionProperty actionProperty = ActionProperty.builder()
     * .cloudwatchAlarm(CloudwatchAlarmActionProperty.builder()
     * .alarmName("alarmName")
     * .roleArn("roleArn")
     * .stateReason("stateReason")
     * .stateValue("stateValue")
     * .build())
     * .cloudwatchLogs(CloudwatchLogsActionProperty.builder()
     * .logGroupName("logGroupName")
     * .roleArn("roleArn")
     * // the properties below are optional
     * .batchMode(false)
     * .build())
     * .cloudwatchMetric(CloudwatchMetricActionProperty.builder()
     * .metricName("metricName")
     * .metricNamespace("metricNamespace")
     * .metricUnit("metricUnit")
     * .metricValue("metricValue")
     * .roleArn("roleArn")
     * // the properties below are optional
     * .metricTimestamp("metricTimestamp")
     * .build())
     * .dynamoDb(DynamoDBActionProperty.builder()
     * .hashKeyField("hashKeyField")
     * .hashKeyValue("hashKeyValue")
     * .roleArn("roleArn")
     * .tableName("tableName")
     * // the properties below are optional
     * .hashKeyType("hashKeyType")
     * .payloadField("payloadField")
     * .rangeKeyField("rangeKeyField")
     * .rangeKeyType("rangeKeyType")
     * .rangeKeyValue("rangeKeyValue")
     * .build())
     * .dynamoDBv2(DynamoDBv2ActionProperty.builder()
     * .putItem(PutItemInputProperty.builder()
     * .tableName("tableName")
     * .build())
     * .roleArn("roleArn")
     * .build())
     * .elasticsearch(ElasticsearchActionProperty.builder()
     * .endpoint("endpoint")
     * .id("id")
     * .index("index")
     * .roleArn("roleArn")
     * .type("type")
     * .build())
     * .firehose(FirehoseActionProperty.builder()
     * .deliveryStreamName("deliveryStreamName")
     * .roleArn("roleArn")
     * // the properties below are optional
     * .batchMode(false)
     * .separator("separator")
     * .build())
     * .http(HttpActionProperty.builder()
     * .url("url")
     * // the properties below are optional
     * .auth(HttpAuthorizationProperty.builder()
     * .sigv4(SigV4AuthorizationProperty.builder()
     * .roleArn("roleArn")
     * .serviceName("serviceName")
     * .signingRegion("signingRegion")
     * .build())
     * .build())
     * .confirmationUrl("confirmationUrl")
     * .headers(List.of(HttpActionHeaderProperty.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build())
     * .iotAnalytics(IotAnalyticsActionProperty.builder()
     * .channelName("channelName")
     * .roleArn("roleArn")
     * // the properties below are optional
     * .batchMode(false)
     * .build())
     * .iotEvents(IotEventsActionProperty.builder()
     * .inputName("inputName")
     * .roleArn("roleArn")
     * // the properties below are optional
     * .batchMode(false)
     * .messageId("messageId")
     * .build())
     * .iotSiteWise(IotSiteWiseActionProperty.builder()
     * .putAssetPropertyValueEntries(List.of(PutAssetPropertyValueEntryProperty.builder()
     * .propertyValues(List.of(AssetPropertyValueProperty.builder()
     * .timestamp(AssetPropertyTimestampProperty.builder()
     * .timeInSeconds("timeInSeconds")
     * // the properties below are optional
     * .offsetInNanos("offsetInNanos")
     * .build())
     * .value(AssetPropertyVariantProperty.builder()
     * .booleanValue("booleanValue")
     * .doubleValue("doubleValue")
     * .integerValue("integerValue")
     * .stringValue("stringValue")
     * .build())
     * // the properties below are optional
     * .quality("quality")
     * .build()))
     * // the properties below are optional
     * .assetId("assetId")
     * .entryId("entryId")
     * .propertyAlias("propertyAlias")
     * .propertyId("propertyId")
     * .build()))
     * .roleArn("roleArn")
     * .build())
     * .kafka(KafkaActionProperty.builder()
     * .clientProperties(Map.of(
     * "clientPropertiesKey", "clientProperties"))
     * .destinationArn("destinationArn")
     * .topic("topic")
     * // the properties below are optional
     * .key("key")
     * .partition("partition")
     * .build())
     * .kinesis(KinesisActionProperty.builder()
     * .roleArn("roleArn")
     * .streamName("streamName")
     * // the properties below are optional
     * .partitionKey("partitionKey")
     * .build())
     * .lambda(LambdaActionProperty.builder()
     * .functionArn("functionArn")
     * .build())
     * .location(LocationActionProperty.builder()
     * .deviceId("deviceId")
     * .latitude("latitude")
     * .longitude("longitude")
     * .roleArn("roleArn")
     * .trackerName("trackerName")
     * // the properties below are optional
     * .timestamp(TimestampProperty.builder()
     * .value("value")
     * // the properties below are optional
     * .unit("unit")
     * .build())
     * .build())
     * .openSearch(OpenSearchActionProperty.builder()
     * .endpoint("endpoint")
     * .id("id")
     * .index("index")
     * .roleArn("roleArn")
     * .type("type")
     * .build())
     * .republish(RepublishActionProperty.builder()
     * .roleArn("roleArn")
     * .topic("topic")
     * // the properties below are optional
     * .headers(RepublishActionHeadersProperty.builder()
     * .contentType("contentType")
     * .correlationData("correlationData")
     * .messageExpiry("messageExpiry")
     * .payloadFormatIndicator("payloadFormatIndicator")
     * .responseTopic("responseTopic")
     * .userProperties(List.of(UserPropertyProperty.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build())
     * .qos(123)
     * .build())
     * .s3(S3ActionProperty.builder()
     * .bucketName("bucketName")
     * .key("key")
     * .roleArn("roleArn")
     * // the properties below are optional
     * .cannedAcl("cannedAcl")
     * .build())
     * .sns(SnsActionProperty.builder()
     * .roleArn("roleArn")
     * .targetArn("targetArn")
     * // the properties below are optional
     * .messageFormat("messageFormat")
     * .build())
     * .sqs(SqsActionProperty.builder()
     * .queueUrl("queueUrl")
     * .roleArn("roleArn")
     * // the properties below are optional
     * .useBase64(false)
     * .build())
     * .stepFunctions(StepFunctionsActionProperty.builder()
     * .roleArn("roleArn")
     * .stateMachineName("stateMachineName")
     * // the properties below are optional
     * .executionNamePrefix("executionNamePrefix")
     * .build())
     * .timestream(TimestreamActionProperty.builder()
     * .databaseName("databaseName")
     * .dimensions(List.of(TimestreamDimensionProperty.builder()
     * .name("name")
     * .value("value")
     * .build()))
     * .roleArn("roleArn")
     * .tableName("tableName")
     * // the properties below are optional
     * .timestamp(TimestreamTimestampProperty.builder()
     * .unit("unit")
     * .value("value")
     * .build())
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-action.html)
     */
    public inline fun cfnTopicRuleActionProperty(
        block: CfnTopicRuleActionPropertyDsl.() -> Unit = {}
    ): CfnTopicRule.ActionProperty {
        val builder = CfnTopicRuleActionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * An asset property timestamp entry containing the following information.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iot.*;
     * AssetPropertyTimestampProperty assetPropertyTimestampProperty =
     * AssetPropertyTimestampProperty.builder()
     * .timeInSeconds("timeInSeconds")
     * // the properties below are optional
     * .offsetInNanos("offsetInNanos")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-assetpropertytimestamp.html)
     */
    public inline fun cfnTopicRuleAssetPropertyTimestampProperty(
        block: CfnTopicRuleAssetPropertyTimestampPropertyDsl.() -> Unit = {}
    ): CfnTopicRule.AssetPropertyTimestampProperty {
        val builder = CfnTopicRuleAssetPropertyTimestampPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * An asset property value entry containing the following information.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iot.*;
     * AssetPropertyValueProperty assetPropertyValueProperty = AssetPropertyValueProperty.builder()
     * .timestamp(AssetPropertyTimestampProperty.builder()
     * .timeInSeconds("timeInSeconds")
     * // the properties below are optional
     * .offsetInNanos("offsetInNanos")
     * .build())
     * .value(AssetPropertyVariantProperty.builder()
     * .booleanValue("booleanValue")
     * .doubleValue("doubleValue")
     * .integerValue("integerValue")
     * .stringValue("stringValue")
     * .build())
     * // the properties below are optional
     * .quality("quality")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-assetpropertyvalue.html)
     */
    public inline fun cfnTopicRuleAssetPropertyValueProperty(
        block: CfnTopicRuleAssetPropertyValuePropertyDsl.() -> Unit = {}
    ): CfnTopicRule.AssetPropertyValueProperty {
        val builder = CfnTopicRuleAssetPropertyValuePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Contains an asset property value (of a single type).
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iot.*;
     * AssetPropertyVariantProperty assetPropertyVariantProperty =
     * AssetPropertyVariantProperty.builder()
     * .booleanValue("booleanValue")
     * .doubleValue("doubleValue")
     * .integerValue("integerValue")
     * .stringValue("stringValue")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-assetpropertyvariant.html)
     */
    public inline fun cfnTopicRuleAssetPropertyVariantProperty(
        block: CfnTopicRuleAssetPropertyVariantPropertyDsl.() -> Unit = {}
    ): CfnTopicRule.AssetPropertyVariantProperty {
        val builder = CfnTopicRuleAssetPropertyVariantPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Describes an action that updates a CloudWatch alarm.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iot.*;
     * CloudwatchAlarmActionProperty cloudwatchAlarmActionProperty =
     * CloudwatchAlarmActionProperty.builder()
     * .alarmName("alarmName")
     * .roleArn("roleArn")
     * .stateReason("stateReason")
     * .stateValue("stateValue")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-cloudwatchalarmaction.html)
     */
    public inline fun cfnTopicRuleCloudwatchAlarmActionProperty(
        block: CfnTopicRuleCloudwatchAlarmActionPropertyDsl.() -> Unit = {}
    ): CfnTopicRule.CloudwatchAlarmActionProperty {
        val builder = CfnTopicRuleCloudwatchAlarmActionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Describes an action that updates a CloudWatch log.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iot.*;
     * CloudwatchLogsActionProperty cloudwatchLogsActionProperty =
     * CloudwatchLogsActionProperty.builder()
     * .logGroupName("logGroupName")
     * .roleArn("roleArn")
     * // the properties below are optional
     * .batchMode(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-cloudwatchlogsaction.html)
     */
    public inline fun cfnTopicRuleCloudwatchLogsActionProperty(
        block: CfnTopicRuleCloudwatchLogsActionPropertyDsl.() -> Unit = {}
    ): CfnTopicRule.CloudwatchLogsActionProperty {
        val builder = CfnTopicRuleCloudwatchLogsActionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Describes an action that captures a CloudWatch metric.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iot.*;
     * CloudwatchMetricActionProperty cloudwatchMetricActionProperty =
     * CloudwatchMetricActionProperty.builder()
     * .metricName("metricName")
     * .metricNamespace("metricNamespace")
     * .metricUnit("metricUnit")
     * .metricValue("metricValue")
     * .roleArn("roleArn")
     * // the properties below are optional
     * .metricTimestamp("metricTimestamp")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-cloudwatchmetricaction.html)
     */
    public inline fun cfnTopicRuleCloudwatchMetricActionProperty(
        block: CfnTopicRuleCloudwatchMetricActionPropertyDsl.() -> Unit = {}
    ): CfnTopicRule.CloudwatchMetricActionProperty {
        val builder = CfnTopicRuleCloudwatchMetricActionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A topic rule destination.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iot.*;
     * CfnTopicRuleDestination cfnTopicRuleDestination = CfnTopicRuleDestination.Builder.create(this,
     * "MyCfnTopicRuleDestination")
     * .httpUrlProperties(HttpUrlDestinationSummaryProperty.builder()
     * .confirmationUrl("confirmationUrl")
     * .build())
     * .status("status")
     * .vpcProperties(VpcDestinationPropertiesProperty.builder()
     * .roleArn("roleArn")
     * .securityGroups(List.of("securityGroups"))
     * .subnetIds(List.of("subnetIds"))
     * .vpcId("vpcId")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-topicruledestination.html)
     */
    public inline fun cfnTopicRuleDestination(
        scope: Construct,
        id: String,
        block: CfnTopicRuleDestinationDsl.() -> Unit = {},
    ): CfnTopicRuleDestination {
        val builder = CfnTopicRuleDestinationDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * HTTP URL destination properties.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iot.*;
     * HttpUrlDestinationSummaryProperty httpUrlDestinationSummaryProperty =
     * HttpUrlDestinationSummaryProperty.builder()
     * .confirmationUrl("confirmationUrl")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicruledestination-httpurldestinationsummary.html)
     */
    public inline fun cfnTopicRuleDestinationHttpUrlDestinationSummaryProperty(
        block: CfnTopicRuleDestinationHttpUrlDestinationSummaryPropertyDsl.() -> Unit = {}
    ): CfnTopicRuleDestination.HttpUrlDestinationSummaryProperty {
        val builder = CfnTopicRuleDestinationHttpUrlDestinationSummaryPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnTopicRuleDestination`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iot.*;
     * CfnTopicRuleDestinationProps cfnTopicRuleDestinationProps =
     * CfnTopicRuleDestinationProps.builder()
     * .httpUrlProperties(HttpUrlDestinationSummaryProperty.builder()
     * .confirmationUrl("confirmationUrl")
     * .build())
     * .status("status")
     * .vpcProperties(VpcDestinationPropertiesProperty.builder()
     * .roleArn("roleArn")
     * .securityGroups(List.of("securityGroups"))
     * .subnetIds(List.of("subnetIds"))
     * .vpcId("vpcId")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-topicruledestination.html)
     */
    public inline fun cfnTopicRuleDestinationProps(
        block: CfnTopicRuleDestinationPropsDsl.() -> Unit = {}
    ): CfnTopicRuleDestinationProps {
        val builder = CfnTopicRuleDestinationPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The properties of a virtual private cloud (VPC) destination.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iot.*;
     * VpcDestinationPropertiesProperty vpcDestinationPropertiesProperty =
     * VpcDestinationPropertiesProperty.builder()
     * .roleArn("roleArn")
     * .securityGroups(List.of("securityGroups"))
     * .subnetIds(List.of("subnetIds"))
     * .vpcId("vpcId")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicruledestination-vpcdestinationproperties.html)
     */
    public inline fun cfnTopicRuleDestinationVpcDestinationPropertiesProperty(
        block: CfnTopicRuleDestinationVpcDestinationPropertiesPropertyDsl.() -> Unit = {}
    ): CfnTopicRuleDestination.VpcDestinationPropertiesProperty {
        val builder = CfnTopicRuleDestinationVpcDestinationPropertiesPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Describes an action to write to a DynamoDB table.
     *
     * The `tableName` , `hashKeyField` , and `rangeKeyField` values must match the values used when
     * you created the table.
     *
     * The `hashKeyValue` and `rangeKeyvalue` fields use a substitution template syntax. These
     * templates provide data at runtime. The syntax is as follows: ${ *sql-expression* }.
     *
     * You can specify any valid expression in a WHERE or SELECT clause, including JSON properties,
     * comparisons, calculations, and functions. For example, the following field uses the third
     * level of the topic:
     *
     * `"hashKeyValue": "${topic(3)}"`
     *
     * The following field uses the timestamp:
     *
     * `"rangeKeyValue": "${timestamp()}"`
     *
     * For more information, see
     * [DynamoDBv2 Action](https://docs.aws.amazon.com/iot/latest/developerguide/iot-rule-actions.html)
     * in the *AWS IoT Developer Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iot.*;
     * DynamoDBActionProperty dynamoDBActionProperty = DynamoDBActionProperty.builder()
     * .hashKeyField("hashKeyField")
     * .hashKeyValue("hashKeyValue")
     * .roleArn("roleArn")
     * .tableName("tableName")
     * // the properties below are optional
     * .hashKeyType("hashKeyType")
     * .payloadField("payloadField")
     * .rangeKeyField("rangeKeyField")
     * .rangeKeyType("rangeKeyType")
     * .rangeKeyValue("rangeKeyValue")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-dynamodbaction.html)
     */
    public inline fun cfnTopicRuleDynamoDBActionProperty(
        block: CfnTopicRuleDynamoDBActionPropertyDsl.() -> Unit = {}
    ): CfnTopicRule.DynamoDBActionProperty {
        val builder = CfnTopicRuleDynamoDBActionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Describes an action to write to a DynamoDB table.
     *
     * This DynamoDB action writes each attribute in the message payload into it's own column in the
     * DynamoDB table.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iot.*;
     * DynamoDBv2ActionProperty dynamoDBv2ActionProperty = DynamoDBv2ActionProperty.builder()
     * .putItem(PutItemInputProperty.builder()
     * .tableName("tableName")
     * .build())
     * .roleArn("roleArn")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-dynamodbv2action.html)
     */
    public inline fun cfnTopicRuleDynamoDBv2ActionProperty(
        block: CfnTopicRuleDynamoDBv2ActionPropertyDsl.() -> Unit = {}
    ): CfnTopicRule.DynamoDBv2ActionProperty {
        val builder = CfnTopicRuleDynamoDBv2ActionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Describes an action that writes data to an Amazon OpenSearch Service domain.
     *
     * The `Elasticsearch` action can only be used by existing rule actions. To create a new rule
     * action or to update an existing rule action, use the `OpenSearch` rule action instead. For
     * more information, see
     * [OpenSearchAction](https://docs.aws.amazon.com//iot/latest/apireference/API_OpenSearchAction.html)
     * .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iot.*;
     * ElasticsearchActionProperty elasticsearchActionProperty = ElasticsearchActionProperty.builder()
     * .endpoint("endpoint")
     * .id("id")
     * .index("index")
     * .roleArn("roleArn")
     * .type("type")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-elasticsearchaction.html)
     */
    public inline fun cfnTopicRuleElasticsearchActionProperty(
        block: CfnTopicRuleElasticsearchActionPropertyDsl.() -> Unit = {}
    ): CfnTopicRule.ElasticsearchActionProperty {
        val builder = CfnTopicRuleElasticsearchActionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Describes an action that writes data to an Amazon Kinesis Firehose stream.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iot.*;
     * FirehoseActionProperty firehoseActionProperty = FirehoseActionProperty.builder()
     * .deliveryStreamName("deliveryStreamName")
     * .roleArn("roleArn")
     * // the properties below are optional
     * .batchMode(false)
     * .separator("separator")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-firehoseaction.html)
     */
    public inline fun cfnTopicRuleFirehoseActionProperty(
        block: CfnTopicRuleFirehoseActionPropertyDsl.() -> Unit = {}
    ): CfnTopicRule.FirehoseActionProperty {
        val builder = CfnTopicRuleFirehoseActionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The HTTP action header.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iot.*;
     * HttpActionHeaderProperty httpActionHeaderProperty = HttpActionHeaderProperty.builder()
     * .key("key")
     * .value("value")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-httpactionheader.html)
     */
    public inline fun cfnTopicRuleHttpActionHeaderProperty(
        block: CfnTopicRuleHttpActionHeaderPropertyDsl.() -> Unit = {}
    ): CfnTopicRule.HttpActionHeaderProperty {
        val builder = CfnTopicRuleHttpActionHeaderPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Send data to an HTTPS endpoint.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iot.*;
     * HttpActionProperty httpActionProperty = HttpActionProperty.builder()
     * .url("url")
     * // the properties below are optional
     * .auth(HttpAuthorizationProperty.builder()
     * .sigv4(SigV4AuthorizationProperty.builder()
     * .roleArn("roleArn")
     * .serviceName("serviceName")
     * .signingRegion("signingRegion")
     * .build())
     * .build())
     * .confirmationUrl("confirmationUrl")
     * .headers(List.of(HttpActionHeaderProperty.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-httpaction.html)
     */
    public inline fun cfnTopicRuleHttpActionProperty(
        block: CfnTopicRuleHttpActionPropertyDsl.() -> Unit = {}
    ): CfnTopicRule.HttpActionProperty {
        val builder = CfnTopicRuleHttpActionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The authorization method used to send messages.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iot.*;
     * HttpAuthorizationProperty httpAuthorizationProperty = HttpAuthorizationProperty.builder()
     * .sigv4(SigV4AuthorizationProperty.builder()
     * .roleArn("roleArn")
     * .serviceName("serviceName")
     * .signingRegion("signingRegion")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-httpauthorization.html)
     */
    public inline fun cfnTopicRuleHttpAuthorizationProperty(
        block: CfnTopicRuleHttpAuthorizationPropertyDsl.() -> Unit = {}
    ): CfnTopicRule.HttpAuthorizationProperty {
        val builder = CfnTopicRuleHttpAuthorizationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Sends message data to an AWS IoT Analytics channel.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iot.*;
     * IotAnalyticsActionProperty iotAnalyticsActionProperty = IotAnalyticsActionProperty.builder()
     * .channelName("channelName")
     * .roleArn("roleArn")
     * // the properties below are optional
     * .batchMode(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-iotanalyticsaction.html)
     */
    public inline fun cfnTopicRuleIotAnalyticsActionProperty(
        block: CfnTopicRuleIotAnalyticsActionPropertyDsl.() -> Unit = {}
    ): CfnTopicRule.IotAnalyticsActionProperty {
        val builder = CfnTopicRuleIotAnalyticsActionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Sends an input to an AWS IoT Events detector.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iot.*;
     * IotEventsActionProperty iotEventsActionProperty = IotEventsActionProperty.builder()
     * .inputName("inputName")
     * .roleArn("roleArn")
     * // the properties below are optional
     * .batchMode(false)
     * .messageId("messageId")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-ioteventsaction.html)
     */
    public inline fun cfnTopicRuleIotEventsActionProperty(
        block: CfnTopicRuleIotEventsActionPropertyDsl.() -> Unit = {}
    ): CfnTopicRule.IotEventsActionProperty {
        val builder = CfnTopicRuleIotEventsActionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Describes an action to send data from an MQTT message that triggered the rule to AWS IoT
     * SiteWise asset properties.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iot.*;
     * IotSiteWiseActionProperty iotSiteWiseActionProperty = IotSiteWiseActionProperty.builder()
     * .putAssetPropertyValueEntries(List.of(PutAssetPropertyValueEntryProperty.builder()
     * .propertyValues(List.of(AssetPropertyValueProperty.builder()
     * .timestamp(AssetPropertyTimestampProperty.builder()
     * .timeInSeconds("timeInSeconds")
     * // the properties below are optional
     * .offsetInNanos("offsetInNanos")
     * .build())
     * .value(AssetPropertyVariantProperty.builder()
     * .booleanValue("booleanValue")
     * .doubleValue("doubleValue")
     * .integerValue("integerValue")
     * .stringValue("stringValue")
     * .build())
     * // the properties below are optional
     * .quality("quality")
     * .build()))
     * // the properties below are optional
     * .assetId("assetId")
     * .entryId("entryId")
     * .propertyAlias("propertyAlias")
     * .propertyId("propertyId")
     * .build()))
     * .roleArn("roleArn")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-iotsitewiseaction.html)
     */
    public inline fun cfnTopicRuleIotSiteWiseActionProperty(
        block: CfnTopicRuleIotSiteWiseActionPropertyDsl.() -> Unit = {}
    ): CfnTopicRule.IotSiteWiseActionProperty {
        val builder = CfnTopicRuleIotSiteWiseActionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Send messages to an Amazon Managed Streaming for Apache Kafka (Amazon MSK) or self-managed
     * Apache Kafka cluster.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iot.*;
     * KafkaActionProperty kafkaActionProperty = KafkaActionProperty.builder()
     * .clientProperties(Map.of(
     * "clientPropertiesKey", "clientProperties"))
     * .destinationArn("destinationArn")
     * .topic("topic")
     * // the properties below are optional
     * .key("key")
     * .partition("partition")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-kafkaaction.html)
     */
    public inline fun cfnTopicRuleKafkaActionProperty(
        block: CfnTopicRuleKafkaActionPropertyDsl.() -> Unit = {}
    ): CfnTopicRule.KafkaActionProperty {
        val builder = CfnTopicRuleKafkaActionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Describes an action to write data to an Amazon Kinesis stream.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iot.*;
     * KinesisActionProperty kinesisActionProperty = KinesisActionProperty.builder()
     * .roleArn("roleArn")
     * .streamName("streamName")
     * // the properties below are optional
     * .partitionKey("partitionKey")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-kinesisaction.html)
     */
    public inline fun cfnTopicRuleKinesisActionProperty(
        block: CfnTopicRuleKinesisActionPropertyDsl.() -> Unit = {}
    ): CfnTopicRule.KinesisActionProperty {
        val builder = CfnTopicRuleKinesisActionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Describes an action to invoke a Lambda function.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iot.*;
     * LambdaActionProperty lambdaActionProperty = LambdaActionProperty.builder()
     * .functionArn("functionArn")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-lambdaaction.html)
     */
    public inline fun cfnTopicRuleLambdaActionProperty(
        block: CfnTopicRuleLambdaActionPropertyDsl.() -> Unit = {}
    ): CfnTopicRule.LambdaActionProperty {
        val builder = CfnTopicRuleLambdaActionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Describes an action to send device location updates from an MQTT message to an Amazon
     * Location tracker resource.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iot.*;
     * LocationActionProperty locationActionProperty = LocationActionProperty.builder()
     * .deviceId("deviceId")
     * .latitude("latitude")
     * .longitude("longitude")
     * .roleArn("roleArn")
     * .trackerName("trackerName")
     * // the properties below are optional
     * .timestamp(TimestampProperty.builder()
     * .value("value")
     * // the properties below are optional
     * .unit("unit")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-locationaction.html)
     */
    public inline fun cfnTopicRuleLocationActionProperty(
        block: CfnTopicRuleLocationActionPropertyDsl.() -> Unit = {}
    ): CfnTopicRule.LocationActionProperty {
        val builder = CfnTopicRuleLocationActionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Describes an action that writes data to an Amazon OpenSearch Service domain.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iot.*;
     * OpenSearchActionProperty openSearchActionProperty = OpenSearchActionProperty.builder()
     * .endpoint("endpoint")
     * .id("id")
     * .index("index")
     * .roleArn("roleArn")
     * .type("type")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-opensearchaction.html)
     */
    public inline fun cfnTopicRuleOpenSearchActionProperty(
        block: CfnTopicRuleOpenSearchActionPropertyDsl.() -> Unit = {}
    ): CfnTopicRule.OpenSearchActionProperty {
        val builder = CfnTopicRuleOpenSearchActionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnTopicRule`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iot.*;
     * CfnTopicRuleProps cfnTopicRuleProps = CfnTopicRuleProps.builder()
     * .topicRulePayload(TopicRulePayloadProperty.builder()
     * .actions(List.of(ActionProperty.builder()
     * .cloudwatchAlarm(CloudwatchAlarmActionProperty.builder()
     * .alarmName("alarmName")
     * .roleArn("roleArn")
     * .stateReason("stateReason")
     * .stateValue("stateValue")
     * .build())
     * .cloudwatchLogs(CloudwatchLogsActionProperty.builder()
     * .logGroupName("logGroupName")
     * .roleArn("roleArn")
     * // the properties below are optional
     * .batchMode(false)
     * .build())
     * .cloudwatchMetric(CloudwatchMetricActionProperty.builder()
     * .metricName("metricName")
     * .metricNamespace("metricNamespace")
     * .metricUnit("metricUnit")
     * .metricValue("metricValue")
     * .roleArn("roleArn")
     * // the properties below are optional
     * .metricTimestamp("metricTimestamp")
     * .build())
     * .dynamoDb(DynamoDBActionProperty.builder()
     * .hashKeyField("hashKeyField")
     * .hashKeyValue("hashKeyValue")
     * .roleArn("roleArn")
     * .tableName("tableName")
     * // the properties below are optional
     * .hashKeyType("hashKeyType")
     * .payloadField("payloadField")
     * .rangeKeyField("rangeKeyField")
     * .rangeKeyType("rangeKeyType")
     * .rangeKeyValue("rangeKeyValue")
     * .build())
     * .dynamoDBv2(DynamoDBv2ActionProperty.builder()
     * .putItem(PutItemInputProperty.builder()
     * .tableName("tableName")
     * .build())
     * .roleArn("roleArn")
     * .build())
     * .elasticsearch(ElasticsearchActionProperty.builder()
     * .endpoint("endpoint")
     * .id("id")
     * .index("index")
     * .roleArn("roleArn")
     * .type("type")
     * .build())
     * .firehose(FirehoseActionProperty.builder()
     * .deliveryStreamName("deliveryStreamName")
     * .roleArn("roleArn")
     * // the properties below are optional
     * .batchMode(false)
     * .separator("separator")
     * .build())
     * .http(HttpActionProperty.builder()
     * .url("url")
     * // the properties below are optional
     * .auth(HttpAuthorizationProperty.builder()
     * .sigv4(SigV4AuthorizationProperty.builder()
     * .roleArn("roleArn")
     * .serviceName("serviceName")
     * .signingRegion("signingRegion")
     * .build())
     * .build())
     * .confirmationUrl("confirmationUrl")
     * .headers(List.of(HttpActionHeaderProperty.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build())
     * .iotAnalytics(IotAnalyticsActionProperty.builder()
     * .channelName("channelName")
     * .roleArn("roleArn")
     * // the properties below are optional
     * .batchMode(false)
     * .build())
     * .iotEvents(IotEventsActionProperty.builder()
     * .inputName("inputName")
     * .roleArn("roleArn")
     * // the properties below are optional
     * .batchMode(false)
     * .messageId("messageId")
     * .build())
     * .iotSiteWise(IotSiteWiseActionProperty.builder()
     * .putAssetPropertyValueEntries(List.of(PutAssetPropertyValueEntryProperty.builder()
     * .propertyValues(List.of(AssetPropertyValueProperty.builder()
     * .timestamp(AssetPropertyTimestampProperty.builder()
     * .timeInSeconds("timeInSeconds")
     * // the properties below are optional
     * .offsetInNanos("offsetInNanos")
     * .build())
     * .value(AssetPropertyVariantProperty.builder()
     * .booleanValue("booleanValue")
     * .doubleValue("doubleValue")
     * .integerValue("integerValue")
     * .stringValue("stringValue")
     * .build())
     * // the properties below are optional
     * .quality("quality")
     * .build()))
     * // the properties below are optional
     * .assetId("assetId")
     * .entryId("entryId")
     * .propertyAlias("propertyAlias")
     * .propertyId("propertyId")
     * .build()))
     * .roleArn("roleArn")
     * .build())
     * .kafka(KafkaActionProperty.builder()
     * .clientProperties(Map.of(
     * "clientPropertiesKey", "clientProperties"))
     * .destinationArn("destinationArn")
     * .topic("topic")
     * // the properties below are optional
     * .key("key")
     * .partition("partition")
     * .build())
     * .kinesis(KinesisActionProperty.builder()
     * .roleArn("roleArn")
     * .streamName("streamName")
     * // the properties below are optional
     * .partitionKey("partitionKey")
     * .build())
     * .lambda(LambdaActionProperty.builder()
     * .functionArn("functionArn")
     * .build())
     * .location(LocationActionProperty.builder()
     * .deviceId("deviceId")
     * .latitude("latitude")
     * .longitude("longitude")
     * .roleArn("roleArn")
     * .trackerName("trackerName")
     * // the properties below are optional
     * .timestamp(TimestampProperty.builder()
     * .value("value")
     * // the properties below are optional
     * .unit("unit")
     * .build())
     * .build())
     * .openSearch(OpenSearchActionProperty.builder()
     * .endpoint("endpoint")
     * .id("id")
     * .index("index")
     * .roleArn("roleArn")
     * .type("type")
     * .build())
     * .republish(RepublishActionProperty.builder()
     * .roleArn("roleArn")
     * .topic("topic")
     * // the properties below are optional
     * .headers(RepublishActionHeadersProperty.builder()
     * .contentType("contentType")
     * .correlationData("correlationData")
     * .messageExpiry("messageExpiry")
     * .payloadFormatIndicator("payloadFormatIndicator")
     * .responseTopic("responseTopic")
     * .userProperties(List.of(UserPropertyProperty.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build())
     * .qos(123)
     * .build())
     * .s3(S3ActionProperty.builder()
     * .bucketName("bucketName")
     * .key("key")
     * .roleArn("roleArn")
     * // the properties below are optional
     * .cannedAcl("cannedAcl")
     * .build())
     * .sns(SnsActionProperty.builder()
     * .roleArn("roleArn")
     * .targetArn("targetArn")
     * // the properties below are optional
     * .messageFormat("messageFormat")
     * .build())
     * .sqs(SqsActionProperty.builder()
     * .queueUrl("queueUrl")
     * .roleArn("roleArn")
     * // the properties below are optional
     * .useBase64(false)
     * .build())
     * .stepFunctions(StepFunctionsActionProperty.builder()
     * .roleArn("roleArn")
     * .stateMachineName("stateMachineName")
     * // the properties below are optional
     * .executionNamePrefix("executionNamePrefix")
     * .build())
     * .timestream(TimestreamActionProperty.builder()
     * .databaseName("databaseName")
     * .dimensions(List.of(TimestreamDimensionProperty.builder()
     * .name("name")
     * .value("value")
     * .build()))
     * .roleArn("roleArn")
     * .tableName("tableName")
     * // the properties below are optional
     * .timestamp(TimestreamTimestampProperty.builder()
     * .unit("unit")
     * .value("value")
     * .build())
     * .build())
     * .build()))
     * .sql("sql")
     * // the properties below are optional
     * .awsIotSqlVersion("awsIotSqlVersion")
     * .description("description")
     * .errorAction(ActionProperty.builder()
     * .cloudwatchAlarm(CloudwatchAlarmActionProperty.builder()
     * .alarmName("alarmName")
     * .roleArn("roleArn")
     * .stateReason("stateReason")
     * .stateValue("stateValue")
     * .build())
     * .cloudwatchLogs(CloudwatchLogsActionProperty.builder()
     * .logGroupName("logGroupName")
     * .roleArn("roleArn")
     * // the properties below are optional
     * .batchMode(false)
     * .build())
     * .cloudwatchMetric(CloudwatchMetricActionProperty.builder()
     * .metricName("metricName")
     * .metricNamespace("metricNamespace")
     * .metricUnit("metricUnit")
     * .metricValue("metricValue")
     * .roleArn("roleArn")
     * // the properties below are optional
     * .metricTimestamp("metricTimestamp")
     * .build())
     * .dynamoDb(DynamoDBActionProperty.builder()
     * .hashKeyField("hashKeyField")
     * .hashKeyValue("hashKeyValue")
     * .roleArn("roleArn")
     * .tableName("tableName")
     * // the properties below are optional
     * .hashKeyType("hashKeyType")
     * .payloadField("payloadField")
     * .rangeKeyField("rangeKeyField")
     * .rangeKeyType("rangeKeyType")
     * .rangeKeyValue("rangeKeyValue")
     * .build())
     * .dynamoDBv2(DynamoDBv2ActionProperty.builder()
     * .putItem(PutItemInputProperty.builder()
     * .tableName("tableName")
     * .build())
     * .roleArn("roleArn")
     * .build())
     * .elasticsearch(ElasticsearchActionProperty.builder()
     * .endpoint("endpoint")
     * .id("id")
     * .index("index")
     * .roleArn("roleArn")
     * .type("type")
     * .build())
     * .firehose(FirehoseActionProperty.builder()
     * .deliveryStreamName("deliveryStreamName")
     * .roleArn("roleArn")
     * // the properties below are optional
     * .batchMode(false)
     * .separator("separator")
     * .build())
     * .http(HttpActionProperty.builder()
     * .url("url")
     * // the properties below are optional
     * .auth(HttpAuthorizationProperty.builder()
     * .sigv4(SigV4AuthorizationProperty.builder()
     * .roleArn("roleArn")
     * .serviceName("serviceName")
     * .signingRegion("signingRegion")
     * .build())
     * .build())
     * .confirmationUrl("confirmationUrl")
     * .headers(List.of(HttpActionHeaderProperty.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build())
     * .iotAnalytics(IotAnalyticsActionProperty.builder()
     * .channelName("channelName")
     * .roleArn("roleArn")
     * // the properties below are optional
     * .batchMode(false)
     * .build())
     * .iotEvents(IotEventsActionProperty.builder()
     * .inputName("inputName")
     * .roleArn("roleArn")
     * // the properties below are optional
     * .batchMode(false)
     * .messageId("messageId")
     * .build())
     * .iotSiteWise(IotSiteWiseActionProperty.builder()
     * .putAssetPropertyValueEntries(List.of(PutAssetPropertyValueEntryProperty.builder()
     * .propertyValues(List.of(AssetPropertyValueProperty.builder()
     * .timestamp(AssetPropertyTimestampProperty.builder()
     * .timeInSeconds("timeInSeconds")
     * // the properties below are optional
     * .offsetInNanos("offsetInNanos")
     * .build())
     * .value(AssetPropertyVariantProperty.builder()
     * .booleanValue("booleanValue")
     * .doubleValue("doubleValue")
     * .integerValue("integerValue")
     * .stringValue("stringValue")
     * .build())
     * // the properties below are optional
     * .quality("quality")
     * .build()))
     * // the properties below are optional
     * .assetId("assetId")
     * .entryId("entryId")
     * .propertyAlias("propertyAlias")
     * .propertyId("propertyId")
     * .build()))
     * .roleArn("roleArn")
     * .build())
     * .kafka(KafkaActionProperty.builder()
     * .clientProperties(Map.of(
     * "clientPropertiesKey", "clientProperties"))
     * .destinationArn("destinationArn")
     * .topic("topic")
     * // the properties below are optional
     * .key("key")
     * .partition("partition")
     * .build())
     * .kinesis(KinesisActionProperty.builder()
     * .roleArn("roleArn")
     * .streamName("streamName")
     * // the properties below are optional
     * .partitionKey("partitionKey")
     * .build())
     * .lambda(LambdaActionProperty.builder()
     * .functionArn("functionArn")
     * .build())
     * .location(LocationActionProperty.builder()
     * .deviceId("deviceId")
     * .latitude("latitude")
     * .longitude("longitude")
     * .roleArn("roleArn")
     * .trackerName("trackerName")
     * // the properties below are optional
     * .timestamp(TimestampProperty.builder()
     * .value("value")
     * // the properties below are optional
     * .unit("unit")
     * .build())
     * .build())
     * .openSearch(OpenSearchActionProperty.builder()
     * .endpoint("endpoint")
     * .id("id")
     * .index("index")
     * .roleArn("roleArn")
     * .type("type")
     * .build())
     * .republish(RepublishActionProperty.builder()
     * .roleArn("roleArn")
     * .topic("topic")
     * // the properties below are optional
     * .headers(RepublishActionHeadersProperty.builder()
     * .contentType("contentType")
     * .correlationData("correlationData")
     * .messageExpiry("messageExpiry")
     * .payloadFormatIndicator("payloadFormatIndicator")
     * .responseTopic("responseTopic")
     * .userProperties(List.of(UserPropertyProperty.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build())
     * .qos(123)
     * .build())
     * .s3(S3ActionProperty.builder()
     * .bucketName("bucketName")
     * .key("key")
     * .roleArn("roleArn")
     * // the properties below are optional
     * .cannedAcl("cannedAcl")
     * .build())
     * .sns(SnsActionProperty.builder()
     * .roleArn("roleArn")
     * .targetArn("targetArn")
     * // the properties below are optional
     * .messageFormat("messageFormat")
     * .build())
     * .sqs(SqsActionProperty.builder()
     * .queueUrl("queueUrl")
     * .roleArn("roleArn")
     * // the properties below are optional
     * .useBase64(false)
     * .build())
     * .stepFunctions(StepFunctionsActionProperty.builder()
     * .roleArn("roleArn")
     * .stateMachineName("stateMachineName")
     * // the properties below are optional
     * .executionNamePrefix("executionNamePrefix")
     * .build())
     * .timestream(TimestreamActionProperty.builder()
     * .databaseName("databaseName")
     * .dimensions(List.of(TimestreamDimensionProperty.builder()
     * .name("name")
     * .value("value")
     * .build()))
     * .roleArn("roleArn")
     * .tableName("tableName")
     * // the properties below are optional
     * .timestamp(TimestreamTimestampProperty.builder()
     * .unit("unit")
     * .value("value")
     * .build())
     * .build())
     * .build())
     * .ruleDisabled(false)
     * .build())
     * // the properties below are optional
     * .ruleName("ruleName")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-topicrule.html)
     */
    public inline fun cfnTopicRuleProps(
        block: CfnTopicRulePropsDsl.() -> Unit = {}
    ): CfnTopicRuleProps {
        val builder = CfnTopicRulePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * An asset property value entry containing the following information.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iot.*;
     * PutAssetPropertyValueEntryProperty putAssetPropertyValueEntryProperty =
     * PutAssetPropertyValueEntryProperty.builder()
     * .propertyValues(List.of(AssetPropertyValueProperty.builder()
     * .timestamp(AssetPropertyTimestampProperty.builder()
     * .timeInSeconds("timeInSeconds")
     * // the properties below are optional
     * .offsetInNanos("offsetInNanos")
     * .build())
     * .value(AssetPropertyVariantProperty.builder()
     * .booleanValue("booleanValue")
     * .doubleValue("doubleValue")
     * .integerValue("integerValue")
     * .stringValue("stringValue")
     * .build())
     * // the properties below are optional
     * .quality("quality")
     * .build()))
     * // the properties below are optional
     * .assetId("assetId")
     * .entryId("entryId")
     * .propertyAlias("propertyAlias")
     * .propertyId("propertyId")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-putassetpropertyvalueentry.html)
     */
    public inline fun cfnTopicRulePutAssetPropertyValueEntryProperty(
        block: CfnTopicRulePutAssetPropertyValueEntryPropertyDsl.() -> Unit = {}
    ): CfnTopicRule.PutAssetPropertyValueEntryProperty {
        val builder = CfnTopicRulePutAssetPropertyValueEntryPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The input for the DynamoActionVS action that specifies the DynamoDB table to which the
     * message data will be written.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iot.*;
     * PutItemInputProperty putItemInputProperty = PutItemInputProperty.builder()
     * .tableName("tableName")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-putiteminput.html)
     */
    public inline fun cfnTopicRulePutItemInputProperty(
        block: CfnTopicRulePutItemInputPropertyDsl.() -> Unit = {}
    ): CfnTopicRule.PutItemInputProperty {
        val builder = CfnTopicRulePutItemInputPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies MQTT Version 5.0 headers information. For more information, see
     * [MQTT](https://docs.aws.amazon.com//iot/latest/developerguide/mqtt.html) in the IoT Core
     * Developer Guide.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iot.*;
     * RepublishActionHeadersProperty republishActionHeadersProperty =
     * RepublishActionHeadersProperty.builder()
     * .contentType("contentType")
     * .correlationData("correlationData")
     * .messageExpiry("messageExpiry")
     * .payloadFormatIndicator("payloadFormatIndicator")
     * .responseTopic("responseTopic")
     * .userProperties(List.of(UserPropertyProperty.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-republishactionheaders.html)
     */
    public inline fun cfnTopicRuleRepublishActionHeadersProperty(
        block: CfnTopicRuleRepublishActionHeadersPropertyDsl.() -> Unit = {}
    ): CfnTopicRule.RepublishActionHeadersProperty {
        val builder = CfnTopicRuleRepublishActionHeadersPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Describes an action to republish to another topic.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iot.*;
     * RepublishActionProperty republishActionProperty = RepublishActionProperty.builder()
     * .roleArn("roleArn")
     * .topic("topic")
     * // the properties below are optional
     * .headers(RepublishActionHeadersProperty.builder()
     * .contentType("contentType")
     * .correlationData("correlationData")
     * .messageExpiry("messageExpiry")
     * .payloadFormatIndicator("payloadFormatIndicator")
     * .responseTopic("responseTopic")
     * .userProperties(List.of(UserPropertyProperty.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build())
     * .qos(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-republishaction.html)
     */
    public inline fun cfnTopicRuleRepublishActionProperty(
        block: CfnTopicRuleRepublishActionPropertyDsl.() -> Unit = {}
    ): CfnTopicRule.RepublishActionProperty {
        val builder = CfnTopicRuleRepublishActionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Describes an action to write data to an Amazon S3 bucket.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iot.*;
     * S3ActionProperty s3ActionProperty = S3ActionProperty.builder()
     * .bucketName("bucketName")
     * .key("key")
     * .roleArn("roleArn")
     * // the properties below are optional
     * .cannedAcl("cannedAcl")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-s3action.html)
     */
    public inline fun cfnTopicRuleS3ActionProperty(
        block: CfnTopicRuleS3ActionPropertyDsl.() -> Unit = {}
    ): CfnTopicRule.S3ActionProperty {
        val builder = CfnTopicRuleS3ActionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * For more information, see
     * [Signature Version 4 signing process](https://docs.aws.amazon.com/general/latest/gr/signature-version-4.html)
     * .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iot.*;
     * SigV4AuthorizationProperty sigV4AuthorizationProperty = SigV4AuthorizationProperty.builder()
     * .roleArn("roleArn")
     * .serviceName("serviceName")
     * .signingRegion("signingRegion")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-sigv4authorization.html)
     */
    public inline fun cfnTopicRuleSigV4AuthorizationProperty(
        block: CfnTopicRuleSigV4AuthorizationPropertyDsl.() -> Unit = {}
    ): CfnTopicRule.SigV4AuthorizationProperty {
        val builder = CfnTopicRuleSigV4AuthorizationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Describes an action to publish to an Amazon SNS topic.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iot.*;
     * SnsActionProperty snsActionProperty = SnsActionProperty.builder()
     * .roleArn("roleArn")
     * .targetArn("targetArn")
     * // the properties below are optional
     * .messageFormat("messageFormat")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-snsaction.html)
     */
    public inline fun cfnTopicRuleSnsActionProperty(
        block: CfnTopicRuleSnsActionPropertyDsl.() -> Unit = {}
    ): CfnTopicRule.SnsActionProperty {
        val builder = CfnTopicRuleSnsActionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Describes an action to publish data to an Amazon SQS queue.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iot.*;
     * SqsActionProperty sqsActionProperty = SqsActionProperty.builder()
     * .queueUrl("queueUrl")
     * .roleArn("roleArn")
     * // the properties below are optional
     * .useBase64(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-sqsaction.html)
     */
    public inline fun cfnTopicRuleSqsActionProperty(
        block: CfnTopicRuleSqsActionPropertyDsl.() -> Unit = {}
    ): CfnTopicRule.SqsActionProperty {
        val builder = CfnTopicRuleSqsActionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Starts execution of a Step Functions state machine.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iot.*;
     * StepFunctionsActionProperty stepFunctionsActionProperty = StepFunctionsActionProperty.builder()
     * .roleArn("roleArn")
     * .stateMachineName("stateMachineName")
     * // the properties below are optional
     * .executionNamePrefix("executionNamePrefix")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-stepfunctionsaction.html)
     */
    public inline fun cfnTopicRuleStepFunctionsActionProperty(
        block: CfnTopicRuleStepFunctionsActionPropertyDsl.() -> Unit = {}
    ): CfnTopicRule.StepFunctionsActionProperty {
        val builder = CfnTopicRuleStepFunctionsActionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Describes how to interpret an application-defined timestamp value from an MQTT message
     * payload and the precision of that value.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iot.*;
     * TimestampProperty timestampProperty = TimestampProperty.builder()
     * .value("value")
     * // the properties below are optional
     * .unit("unit")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-timestamp.html)
     */
    public inline fun cfnTopicRuleTimestampProperty(
        block: CfnTopicRuleTimestampPropertyDsl.() -> Unit = {}
    ): CfnTopicRule.TimestampProperty {
        val builder = CfnTopicRuleTimestampPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Describes an action that writes records into an Amazon Timestream table.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iot.*;
     * TimestreamActionProperty timestreamActionProperty = TimestreamActionProperty.builder()
     * .databaseName("databaseName")
     * .dimensions(List.of(TimestreamDimensionProperty.builder()
     * .name("name")
     * .value("value")
     * .build()))
     * .roleArn("roleArn")
     * .tableName("tableName")
     * // the properties below are optional
     * .timestamp(TimestreamTimestampProperty.builder()
     * .unit("unit")
     * .value("value")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-timestreamaction.html)
     */
    public inline fun cfnTopicRuleTimestreamActionProperty(
        block: CfnTopicRuleTimestreamActionPropertyDsl.() -> Unit = {}
    ): CfnTopicRule.TimestreamActionProperty {
        val builder = CfnTopicRuleTimestreamActionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Metadata attributes of the time series that are written in each measure record.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iot.*;
     * TimestreamDimensionProperty timestreamDimensionProperty = TimestreamDimensionProperty.builder()
     * .name("name")
     * .value("value")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-timestreamdimension.html)
     */
    public inline fun cfnTopicRuleTimestreamDimensionProperty(
        block: CfnTopicRuleTimestreamDimensionPropertyDsl.() -> Unit = {}
    ): CfnTopicRule.TimestreamDimensionProperty {
        val builder = CfnTopicRuleTimestreamDimensionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The value to use for the entry's timestamp.
     *
     * If blank, the time that the entry was processed is used.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iot.*;
     * TimestreamTimestampProperty timestreamTimestampProperty = TimestreamTimestampProperty.builder()
     * .unit("unit")
     * .value("value")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-timestreamtimestamp.html)
     */
    public inline fun cfnTopicRuleTimestreamTimestampProperty(
        block: CfnTopicRuleTimestreamTimestampPropertyDsl.() -> Unit = {}
    ): CfnTopicRule.TimestreamTimestampProperty {
        val builder = CfnTopicRuleTimestreamTimestampPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Describes a rule.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iot.*;
     * TopicRulePayloadProperty topicRulePayloadProperty = TopicRulePayloadProperty.builder()
     * .actions(List.of(ActionProperty.builder()
     * .cloudwatchAlarm(CloudwatchAlarmActionProperty.builder()
     * .alarmName("alarmName")
     * .roleArn("roleArn")
     * .stateReason("stateReason")
     * .stateValue("stateValue")
     * .build())
     * .cloudwatchLogs(CloudwatchLogsActionProperty.builder()
     * .logGroupName("logGroupName")
     * .roleArn("roleArn")
     * // the properties below are optional
     * .batchMode(false)
     * .build())
     * .cloudwatchMetric(CloudwatchMetricActionProperty.builder()
     * .metricName("metricName")
     * .metricNamespace("metricNamespace")
     * .metricUnit("metricUnit")
     * .metricValue("metricValue")
     * .roleArn("roleArn")
     * // the properties below are optional
     * .metricTimestamp("metricTimestamp")
     * .build())
     * .dynamoDb(DynamoDBActionProperty.builder()
     * .hashKeyField("hashKeyField")
     * .hashKeyValue("hashKeyValue")
     * .roleArn("roleArn")
     * .tableName("tableName")
     * // the properties below are optional
     * .hashKeyType("hashKeyType")
     * .payloadField("payloadField")
     * .rangeKeyField("rangeKeyField")
     * .rangeKeyType("rangeKeyType")
     * .rangeKeyValue("rangeKeyValue")
     * .build())
     * .dynamoDBv2(DynamoDBv2ActionProperty.builder()
     * .putItem(PutItemInputProperty.builder()
     * .tableName("tableName")
     * .build())
     * .roleArn("roleArn")
     * .build())
     * .elasticsearch(ElasticsearchActionProperty.builder()
     * .endpoint("endpoint")
     * .id("id")
     * .index("index")
     * .roleArn("roleArn")
     * .type("type")
     * .build())
     * .firehose(FirehoseActionProperty.builder()
     * .deliveryStreamName("deliveryStreamName")
     * .roleArn("roleArn")
     * // the properties below are optional
     * .batchMode(false)
     * .separator("separator")
     * .build())
     * .http(HttpActionProperty.builder()
     * .url("url")
     * // the properties below are optional
     * .auth(HttpAuthorizationProperty.builder()
     * .sigv4(SigV4AuthorizationProperty.builder()
     * .roleArn("roleArn")
     * .serviceName("serviceName")
     * .signingRegion("signingRegion")
     * .build())
     * .build())
     * .confirmationUrl("confirmationUrl")
     * .headers(List.of(HttpActionHeaderProperty.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build())
     * .iotAnalytics(IotAnalyticsActionProperty.builder()
     * .channelName("channelName")
     * .roleArn("roleArn")
     * // the properties below are optional
     * .batchMode(false)
     * .build())
     * .iotEvents(IotEventsActionProperty.builder()
     * .inputName("inputName")
     * .roleArn("roleArn")
     * // the properties below are optional
     * .batchMode(false)
     * .messageId("messageId")
     * .build())
     * .iotSiteWise(IotSiteWiseActionProperty.builder()
     * .putAssetPropertyValueEntries(List.of(PutAssetPropertyValueEntryProperty.builder()
     * .propertyValues(List.of(AssetPropertyValueProperty.builder()
     * .timestamp(AssetPropertyTimestampProperty.builder()
     * .timeInSeconds("timeInSeconds")
     * // the properties below are optional
     * .offsetInNanos("offsetInNanos")
     * .build())
     * .value(AssetPropertyVariantProperty.builder()
     * .booleanValue("booleanValue")
     * .doubleValue("doubleValue")
     * .integerValue("integerValue")
     * .stringValue("stringValue")
     * .build())
     * // the properties below are optional
     * .quality("quality")
     * .build()))
     * // the properties below are optional
     * .assetId("assetId")
     * .entryId("entryId")
     * .propertyAlias("propertyAlias")
     * .propertyId("propertyId")
     * .build()))
     * .roleArn("roleArn")
     * .build())
     * .kafka(KafkaActionProperty.builder()
     * .clientProperties(Map.of(
     * "clientPropertiesKey", "clientProperties"))
     * .destinationArn("destinationArn")
     * .topic("topic")
     * // the properties below are optional
     * .key("key")
     * .partition("partition")
     * .build())
     * .kinesis(KinesisActionProperty.builder()
     * .roleArn("roleArn")
     * .streamName("streamName")
     * // the properties below are optional
     * .partitionKey("partitionKey")
     * .build())
     * .lambda(LambdaActionProperty.builder()
     * .functionArn("functionArn")
     * .build())
     * .location(LocationActionProperty.builder()
     * .deviceId("deviceId")
     * .latitude("latitude")
     * .longitude("longitude")
     * .roleArn("roleArn")
     * .trackerName("trackerName")
     * // the properties below are optional
     * .timestamp(TimestampProperty.builder()
     * .value("value")
     * // the properties below are optional
     * .unit("unit")
     * .build())
     * .build())
     * .openSearch(OpenSearchActionProperty.builder()
     * .endpoint("endpoint")
     * .id("id")
     * .index("index")
     * .roleArn("roleArn")
     * .type("type")
     * .build())
     * .republish(RepublishActionProperty.builder()
     * .roleArn("roleArn")
     * .topic("topic")
     * // the properties below are optional
     * .headers(RepublishActionHeadersProperty.builder()
     * .contentType("contentType")
     * .correlationData("correlationData")
     * .messageExpiry("messageExpiry")
     * .payloadFormatIndicator("payloadFormatIndicator")
     * .responseTopic("responseTopic")
     * .userProperties(List.of(UserPropertyProperty.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build())
     * .qos(123)
     * .build())
     * .s3(S3ActionProperty.builder()
     * .bucketName("bucketName")
     * .key("key")
     * .roleArn("roleArn")
     * // the properties below are optional
     * .cannedAcl("cannedAcl")
     * .build())
     * .sns(SnsActionProperty.builder()
     * .roleArn("roleArn")
     * .targetArn("targetArn")
     * // the properties below are optional
     * .messageFormat("messageFormat")
     * .build())
     * .sqs(SqsActionProperty.builder()
     * .queueUrl("queueUrl")
     * .roleArn("roleArn")
     * // the properties below are optional
     * .useBase64(false)
     * .build())
     * .stepFunctions(StepFunctionsActionProperty.builder()
     * .roleArn("roleArn")
     * .stateMachineName("stateMachineName")
     * // the properties below are optional
     * .executionNamePrefix("executionNamePrefix")
     * .build())
     * .timestream(TimestreamActionProperty.builder()
     * .databaseName("databaseName")
     * .dimensions(List.of(TimestreamDimensionProperty.builder()
     * .name("name")
     * .value("value")
     * .build()))
     * .roleArn("roleArn")
     * .tableName("tableName")
     * // the properties below are optional
     * .timestamp(TimestreamTimestampProperty.builder()
     * .unit("unit")
     * .value("value")
     * .build())
     * .build())
     * .build()))
     * .sql("sql")
     * // the properties below are optional
     * .awsIotSqlVersion("awsIotSqlVersion")
     * .description("description")
     * .errorAction(ActionProperty.builder()
     * .cloudwatchAlarm(CloudwatchAlarmActionProperty.builder()
     * .alarmName("alarmName")
     * .roleArn("roleArn")
     * .stateReason("stateReason")
     * .stateValue("stateValue")
     * .build())
     * .cloudwatchLogs(CloudwatchLogsActionProperty.builder()
     * .logGroupName("logGroupName")
     * .roleArn("roleArn")
     * // the properties below are optional
     * .batchMode(false)
     * .build())
     * .cloudwatchMetric(CloudwatchMetricActionProperty.builder()
     * .metricName("metricName")
     * .metricNamespace("metricNamespace")
     * .metricUnit("metricUnit")
     * .metricValue("metricValue")
     * .roleArn("roleArn")
     * // the properties below are optional
     * .metricTimestamp("metricTimestamp")
     * .build())
     * .dynamoDb(DynamoDBActionProperty.builder()
     * .hashKeyField("hashKeyField")
     * .hashKeyValue("hashKeyValue")
     * .roleArn("roleArn")
     * .tableName("tableName")
     * // the properties below are optional
     * .hashKeyType("hashKeyType")
     * .payloadField("payloadField")
     * .rangeKeyField("rangeKeyField")
     * .rangeKeyType("rangeKeyType")
     * .rangeKeyValue("rangeKeyValue")
     * .build())
     * .dynamoDBv2(DynamoDBv2ActionProperty.builder()
     * .putItem(PutItemInputProperty.builder()
     * .tableName("tableName")
     * .build())
     * .roleArn("roleArn")
     * .build())
     * .elasticsearch(ElasticsearchActionProperty.builder()
     * .endpoint("endpoint")
     * .id("id")
     * .index("index")
     * .roleArn("roleArn")
     * .type("type")
     * .build())
     * .firehose(FirehoseActionProperty.builder()
     * .deliveryStreamName("deliveryStreamName")
     * .roleArn("roleArn")
     * // the properties below are optional
     * .batchMode(false)
     * .separator("separator")
     * .build())
     * .http(HttpActionProperty.builder()
     * .url("url")
     * // the properties below are optional
     * .auth(HttpAuthorizationProperty.builder()
     * .sigv4(SigV4AuthorizationProperty.builder()
     * .roleArn("roleArn")
     * .serviceName("serviceName")
     * .signingRegion("signingRegion")
     * .build())
     * .build())
     * .confirmationUrl("confirmationUrl")
     * .headers(List.of(HttpActionHeaderProperty.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build())
     * .iotAnalytics(IotAnalyticsActionProperty.builder()
     * .channelName("channelName")
     * .roleArn("roleArn")
     * // the properties below are optional
     * .batchMode(false)
     * .build())
     * .iotEvents(IotEventsActionProperty.builder()
     * .inputName("inputName")
     * .roleArn("roleArn")
     * // the properties below are optional
     * .batchMode(false)
     * .messageId("messageId")
     * .build())
     * .iotSiteWise(IotSiteWiseActionProperty.builder()
     * .putAssetPropertyValueEntries(List.of(PutAssetPropertyValueEntryProperty.builder()
     * .propertyValues(List.of(AssetPropertyValueProperty.builder()
     * .timestamp(AssetPropertyTimestampProperty.builder()
     * .timeInSeconds("timeInSeconds")
     * // the properties below are optional
     * .offsetInNanos("offsetInNanos")
     * .build())
     * .value(AssetPropertyVariantProperty.builder()
     * .booleanValue("booleanValue")
     * .doubleValue("doubleValue")
     * .integerValue("integerValue")
     * .stringValue("stringValue")
     * .build())
     * // the properties below are optional
     * .quality("quality")
     * .build()))
     * // the properties below are optional
     * .assetId("assetId")
     * .entryId("entryId")
     * .propertyAlias("propertyAlias")
     * .propertyId("propertyId")
     * .build()))
     * .roleArn("roleArn")
     * .build())
     * .kafka(KafkaActionProperty.builder()
     * .clientProperties(Map.of(
     * "clientPropertiesKey", "clientProperties"))
     * .destinationArn("destinationArn")
     * .topic("topic")
     * // the properties below are optional
     * .key("key")
     * .partition("partition")
     * .build())
     * .kinesis(KinesisActionProperty.builder()
     * .roleArn("roleArn")
     * .streamName("streamName")
     * // the properties below are optional
     * .partitionKey("partitionKey")
     * .build())
     * .lambda(LambdaActionProperty.builder()
     * .functionArn("functionArn")
     * .build())
     * .location(LocationActionProperty.builder()
     * .deviceId("deviceId")
     * .latitude("latitude")
     * .longitude("longitude")
     * .roleArn("roleArn")
     * .trackerName("trackerName")
     * // the properties below are optional
     * .timestamp(TimestampProperty.builder()
     * .value("value")
     * // the properties below are optional
     * .unit("unit")
     * .build())
     * .build())
     * .openSearch(OpenSearchActionProperty.builder()
     * .endpoint("endpoint")
     * .id("id")
     * .index("index")
     * .roleArn("roleArn")
     * .type("type")
     * .build())
     * .republish(RepublishActionProperty.builder()
     * .roleArn("roleArn")
     * .topic("topic")
     * // the properties below are optional
     * .headers(RepublishActionHeadersProperty.builder()
     * .contentType("contentType")
     * .correlationData("correlationData")
     * .messageExpiry("messageExpiry")
     * .payloadFormatIndicator("payloadFormatIndicator")
     * .responseTopic("responseTopic")
     * .userProperties(List.of(UserPropertyProperty.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build())
     * .qos(123)
     * .build())
     * .s3(S3ActionProperty.builder()
     * .bucketName("bucketName")
     * .key("key")
     * .roleArn("roleArn")
     * // the properties below are optional
     * .cannedAcl("cannedAcl")
     * .build())
     * .sns(SnsActionProperty.builder()
     * .roleArn("roleArn")
     * .targetArn("targetArn")
     * // the properties below are optional
     * .messageFormat("messageFormat")
     * .build())
     * .sqs(SqsActionProperty.builder()
     * .queueUrl("queueUrl")
     * .roleArn("roleArn")
     * // the properties below are optional
     * .useBase64(false)
     * .build())
     * .stepFunctions(StepFunctionsActionProperty.builder()
     * .roleArn("roleArn")
     * .stateMachineName("stateMachineName")
     * // the properties below are optional
     * .executionNamePrefix("executionNamePrefix")
     * .build())
     * .timestream(TimestreamActionProperty.builder()
     * .databaseName("databaseName")
     * .dimensions(List.of(TimestreamDimensionProperty.builder()
     * .name("name")
     * .value("value")
     * .build()))
     * .roleArn("roleArn")
     * .tableName("tableName")
     * // the properties below are optional
     * .timestamp(TimestreamTimestampProperty.builder()
     * .unit("unit")
     * .value("value")
     * .build())
     * .build())
     * .build())
     * .ruleDisabled(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-topicrulepayload.html)
     */
    public inline fun cfnTopicRuleTopicRulePayloadProperty(
        block: CfnTopicRuleTopicRulePayloadPropertyDsl.() -> Unit = {}
    ): CfnTopicRule.TopicRulePayloadProperty {
        val builder = CfnTopicRuleTopicRulePayloadPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A key-value pair that you define in the header.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iot.*;
     * UserPropertyProperty userPropertyProperty = UserPropertyProperty.builder()
     * .key("key")
     * .value("value")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-userproperty.html)
     */
    public inline fun cfnTopicRuleUserPropertyProperty(
        block: CfnTopicRuleUserPropertyPropertyDsl.() -> Unit = {}
    ): CfnTopicRule.UserPropertyProperty {
        val builder = CfnTopicRuleUserPropertyPropertyDsl()
        builder.apply(block)
        return builder.build()
    }
}
