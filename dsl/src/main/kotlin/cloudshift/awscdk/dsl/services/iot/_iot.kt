@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.iot

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
import kotlin.String
import kotlin.Unit

public object iot {
    public inline fun cfnAccountAuditConfiguration(
        scope: Construct,
        id: String,
        block: CfnAccountAuditConfigurationDsl.() -> Unit = {},
    ): CfnAccountAuditConfiguration {
        val builder = CfnAccountAuditConfigurationDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnAccountAuditConfigurationAuditCheckConfigurationProperty(
        block: CfnAccountAuditConfigurationAuditCheckConfigurationPropertyDsl.() -> Unit =
            {},
    ): CfnAccountAuditConfiguration.AuditCheckConfigurationProperty {
        val builder = CfnAccountAuditConfigurationAuditCheckConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnAccountAuditConfigurationAuditCheckConfigurationsProperty(
        block: CfnAccountAuditConfigurationAuditCheckConfigurationsPropertyDsl.() -> Unit =
            {},
    ): CfnAccountAuditConfiguration.AuditCheckConfigurationsProperty {
        val builder = CfnAccountAuditConfigurationAuditCheckConfigurationsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnAccountAuditConfigurationAuditNotificationTargetConfigurationsProperty(
        block: CfnAccountAuditConfigurationAuditNotificationTargetConfigurationsPropertyDsl.() -> Unit =
            {},
    ): CfnAccountAuditConfiguration.AuditNotificationTargetConfigurationsProperty {
        val builder = CfnAccountAuditConfigurationAuditNotificationTargetConfigurationsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnAccountAuditConfigurationAuditNotificationTargetProperty(
        block: CfnAccountAuditConfigurationAuditNotificationTargetPropertyDsl.() -> Unit =
            {},
    ): CfnAccountAuditConfiguration.AuditNotificationTargetProperty {
        val builder = CfnAccountAuditConfigurationAuditNotificationTargetPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnAccountAuditConfigurationProps(
        block: CfnAccountAuditConfigurationPropsDsl.() -> Unit =
            {},
    ): CfnAccountAuditConfigurationProps {
        val builder = CfnAccountAuditConfigurationPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnAuthorizer(
        scope: Construct,
        id: String,
        block: CfnAuthorizerDsl.() -> Unit = {},
    ): CfnAuthorizer {
        val builder = CfnAuthorizerDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnAuthorizerProps(block: CfnAuthorizerPropsDsl.() -> Unit = {}): CfnAuthorizerProps {
        val builder = CfnAuthorizerPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnBillingGroup(
        scope: Construct,
        id: String,
        block: CfnBillingGroupDsl.() -> Unit = {},
    ): CfnBillingGroup {
        val builder = CfnBillingGroupDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnBillingGroupBillingGroupPropertiesProperty(
        block: CfnBillingGroupBillingGroupPropertiesPropertyDsl.() -> Unit =
            {},
    ): CfnBillingGroup.BillingGroupPropertiesProperty {
        val builder = CfnBillingGroupBillingGroupPropertiesPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnBillingGroupProps(block: CfnBillingGroupPropsDsl.() -> Unit = {}): CfnBillingGroupProps {
        val builder = CfnBillingGroupPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnCACertificate(
        scope: Construct,
        id: String,
        block: CfnCACertificateDsl.() -> Unit = {},
    ): CfnCACertificate {
        val builder = CfnCACertificateDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnCACertificateProps(block: CfnCACertificatePropsDsl.() -> Unit = {}): CfnCACertificateProps {
        val builder = CfnCACertificatePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnCACertificateRegistrationConfigProperty(
        block: CfnCACertificateRegistrationConfigPropertyDsl.() -> Unit =
            {},
    ): CfnCACertificate.RegistrationConfigProperty {
        val builder = CfnCACertificateRegistrationConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnCertificate(
        scope: Construct,
        id: String,
        block: CfnCertificateDsl.() -> Unit = {},
    ): CfnCertificate {
        val builder = CfnCertificateDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnCertificateProps(block: CfnCertificatePropsDsl.() -> Unit = {}): CfnCertificateProps {
        val builder = CfnCertificatePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnCustomMetric(
        scope: Construct,
        id: String,
        block: CfnCustomMetricDsl.() -> Unit = {},
    ): CfnCustomMetric {
        val builder = CfnCustomMetricDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnCustomMetricProps(block: CfnCustomMetricPropsDsl.() -> Unit = {}): CfnCustomMetricProps {
        val builder = CfnCustomMetricPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDimension(
        scope: Construct,
        id: String,
        block: CfnDimensionDsl.() -> Unit = {},
    ): CfnDimension {
        val builder = CfnDimensionDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDimensionProps(block: CfnDimensionPropsDsl.() -> Unit = {}): CfnDimensionProps {
        val builder = CfnDimensionPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDomainConfiguration(
        scope: Construct,
        id: String,
        block: CfnDomainConfigurationDsl.() -> Unit = {},
    ): CfnDomainConfiguration {
        val builder = CfnDomainConfigurationDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDomainConfigurationAuthorizerConfigProperty(
        block: CfnDomainConfigurationAuthorizerConfigPropertyDsl.() -> Unit =
            {},
    ): CfnDomainConfiguration.AuthorizerConfigProperty {
        val builder = CfnDomainConfigurationAuthorizerConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDomainConfigurationProps(
        block: CfnDomainConfigurationPropsDsl.() -> Unit =
            {},
    ): CfnDomainConfigurationProps {
        val builder = CfnDomainConfigurationPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDomainConfigurationServerCertificateSummaryProperty(
        block: CfnDomainConfigurationServerCertificateSummaryPropertyDsl.() -> Unit =
            {},
    ): CfnDomainConfiguration.ServerCertificateSummaryProperty {
        val builder = CfnDomainConfigurationServerCertificateSummaryPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDomainConfigurationTlsConfigProperty(
        block: CfnDomainConfigurationTlsConfigPropertyDsl.() -> Unit =
            {},
    ): CfnDomainConfiguration.TlsConfigProperty {
        val builder = CfnDomainConfigurationTlsConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnFleetMetric(
        scope: Construct,
        id: String,
        block: CfnFleetMetricDsl.() -> Unit = {},
    ): CfnFleetMetric {
        val builder = CfnFleetMetricDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnFleetMetricAggregationTypeProperty(
        block: CfnFleetMetricAggregationTypePropertyDsl.() -> Unit =
            {},
    ): CfnFleetMetric.AggregationTypeProperty {
        val builder = CfnFleetMetricAggregationTypePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnFleetMetricProps(block: CfnFleetMetricPropsDsl.() -> Unit = {}): CfnFleetMetricProps {
        val builder = CfnFleetMetricPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnJobTemplate(
        scope: Construct,
        id: String,
        block: CfnJobTemplateDsl.() -> Unit = {},
    ): CfnJobTemplate {
        val builder = CfnJobTemplateDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnJobTemplateAbortConfigProperty(
        block: CfnJobTemplateAbortConfigPropertyDsl.() -> Unit =
            {},
    ): CfnJobTemplate.AbortConfigProperty {
        val builder = CfnJobTemplateAbortConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnJobTemplateAbortCriteriaProperty(
        block: CfnJobTemplateAbortCriteriaPropertyDsl.() -> Unit =
            {},
    ): CfnJobTemplate.AbortCriteriaProperty {
        val builder = CfnJobTemplateAbortCriteriaPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnJobTemplateExponentialRolloutRateProperty(
        block: CfnJobTemplateExponentialRolloutRatePropertyDsl.() -> Unit =
            {},
    ): CfnJobTemplate.ExponentialRolloutRateProperty {
        val builder = CfnJobTemplateExponentialRolloutRatePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnJobTemplateJobExecutionsRetryConfigProperty(
        block: CfnJobTemplateJobExecutionsRetryConfigPropertyDsl.() -> Unit =
            {},
    ): CfnJobTemplate.JobExecutionsRetryConfigProperty {
        val builder = CfnJobTemplateJobExecutionsRetryConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnJobTemplateJobExecutionsRolloutConfigProperty(
        block: CfnJobTemplateJobExecutionsRolloutConfigPropertyDsl.() -> Unit =
            {},
    ): CfnJobTemplate.JobExecutionsRolloutConfigProperty {
        val builder = CfnJobTemplateJobExecutionsRolloutConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnJobTemplateMaintenanceWindowProperty(
        block: CfnJobTemplateMaintenanceWindowPropertyDsl.() -> Unit =
            {},
    ): CfnJobTemplate.MaintenanceWindowProperty {
        val builder = CfnJobTemplateMaintenanceWindowPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnJobTemplatePresignedUrlConfigProperty(
        block: CfnJobTemplatePresignedUrlConfigPropertyDsl.() -> Unit =
            {},
    ): CfnJobTemplate.PresignedUrlConfigProperty {
        val builder = CfnJobTemplatePresignedUrlConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnJobTemplateProps(block: CfnJobTemplatePropsDsl.() -> Unit = {}): CfnJobTemplateProps {
        val builder = CfnJobTemplatePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnJobTemplateRateIncreaseCriteriaProperty(
        block: CfnJobTemplateRateIncreaseCriteriaPropertyDsl.() -> Unit =
            {},
    ): CfnJobTemplate.RateIncreaseCriteriaProperty {
        val builder = CfnJobTemplateRateIncreaseCriteriaPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnJobTemplateRetryCriteriaProperty(
        block: CfnJobTemplateRetryCriteriaPropertyDsl.() -> Unit =
            {},
    ): CfnJobTemplate.RetryCriteriaProperty {
        val builder = CfnJobTemplateRetryCriteriaPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnJobTemplateTimeoutConfigProperty(
        block: CfnJobTemplateTimeoutConfigPropertyDsl.() -> Unit =
            {},
    ): CfnJobTemplate.TimeoutConfigProperty {
        val builder = CfnJobTemplateTimeoutConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnLogging(
        scope: Construct,
        id: String,
        block: CfnLoggingDsl.() -> Unit = {},
    ): CfnLogging {
        val builder = CfnLoggingDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnLoggingProps(block: CfnLoggingPropsDsl.() -> Unit = {}): CfnLoggingProps {
        val builder = CfnLoggingPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnMitigationAction(
        scope: Construct,
        id: String,
        block: CfnMitigationActionDsl.() -> Unit = {},
    ): CfnMitigationAction {
        val builder = CfnMitigationActionDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnMitigationActionActionParamsProperty(
        block: CfnMitigationActionActionParamsPropertyDsl.() -> Unit =
            {},
    ): CfnMitigationAction.ActionParamsProperty {
        val builder = CfnMitigationActionActionParamsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnMitigationActionAddThingsToThingGroupParamsProperty(
        block: CfnMitigationActionAddThingsToThingGroupParamsPropertyDsl.() -> Unit =
            {},
    ): CfnMitigationAction.AddThingsToThingGroupParamsProperty {
        val builder = CfnMitigationActionAddThingsToThingGroupParamsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnMitigationActionEnableIoTLoggingParamsProperty(
        block: CfnMitigationActionEnableIoTLoggingParamsPropertyDsl.() -> Unit =
            {},
    ): CfnMitigationAction.EnableIoTLoggingParamsProperty {
        val builder = CfnMitigationActionEnableIoTLoggingParamsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnMitigationActionProps(block: CfnMitigationActionPropsDsl.() -> Unit = {}): CfnMitigationActionProps {
        val builder = CfnMitigationActionPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnMitigationActionPublishFindingToSnsParamsProperty(
        block: CfnMitigationActionPublishFindingToSnsParamsPropertyDsl.() -> Unit =
            {},
    ): CfnMitigationAction.PublishFindingToSnsParamsProperty {
        val builder = CfnMitigationActionPublishFindingToSnsParamsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnMitigationActionReplaceDefaultPolicyVersionParamsProperty(
        block: CfnMitigationActionReplaceDefaultPolicyVersionParamsPropertyDsl.() -> Unit =
            {},
    ): CfnMitigationAction.ReplaceDefaultPolicyVersionParamsProperty {
        val builder = CfnMitigationActionReplaceDefaultPolicyVersionParamsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnMitigationActionUpdateCACertificateParamsProperty(
        block: CfnMitigationActionUpdateCACertificateParamsPropertyDsl.() -> Unit =
            {},
    ): CfnMitigationAction.UpdateCACertificateParamsProperty {
        val builder = CfnMitigationActionUpdateCACertificateParamsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnMitigationActionUpdateDeviceCertificateParamsProperty(
        block: CfnMitigationActionUpdateDeviceCertificateParamsPropertyDsl.() -> Unit =
            {},
    ): CfnMitigationAction.UpdateDeviceCertificateParamsProperty {
        val builder = CfnMitigationActionUpdateDeviceCertificateParamsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnPolicy(
        scope: Construct,
        id: String,
        block: CfnPolicyDsl.() -> Unit = {},
    ): CfnPolicy {
        val builder = CfnPolicyDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnPolicyPrincipalAttachment(
        scope: Construct,
        id: String,
        block: CfnPolicyPrincipalAttachmentDsl.() -> Unit = {},
    ): CfnPolicyPrincipalAttachment {
        val builder = CfnPolicyPrincipalAttachmentDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnPolicyPrincipalAttachmentProps(
        block: CfnPolicyPrincipalAttachmentPropsDsl.() -> Unit =
            {},
    ): CfnPolicyPrincipalAttachmentProps {
        val builder = CfnPolicyPrincipalAttachmentPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnPolicyProps(block: CfnPolicyPropsDsl.() -> Unit = {}): CfnPolicyProps {
        val builder = CfnPolicyPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnProvisioningTemplate(
        scope: Construct,
        id: String,
        block: CfnProvisioningTemplateDsl.() -> Unit = {},
    ): CfnProvisioningTemplate {
        val builder = CfnProvisioningTemplateDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnProvisioningTemplateProps(
        block: CfnProvisioningTemplatePropsDsl.() -> Unit =
            {},
    ): CfnProvisioningTemplateProps {
        val builder = CfnProvisioningTemplatePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnProvisioningTemplateProvisioningHookProperty(
        block: CfnProvisioningTemplateProvisioningHookPropertyDsl.() -> Unit =
            {},
    ): CfnProvisioningTemplate.ProvisioningHookProperty {
        val builder = CfnProvisioningTemplateProvisioningHookPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnResourceSpecificLogging(
        scope: Construct,
        id: String,
        block: CfnResourceSpecificLoggingDsl.() -> Unit = {},
    ): CfnResourceSpecificLogging {
        val builder = CfnResourceSpecificLoggingDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnResourceSpecificLoggingProps(
        block: CfnResourceSpecificLoggingPropsDsl.() -> Unit =
            {},
    ): CfnResourceSpecificLoggingProps {
        val builder = CfnResourceSpecificLoggingPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnRoleAlias(
        scope: Construct,
        id: String,
        block: CfnRoleAliasDsl.() -> Unit = {},
    ): CfnRoleAlias {
        val builder = CfnRoleAliasDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnRoleAliasProps(block: CfnRoleAliasPropsDsl.() -> Unit = {}): CfnRoleAliasProps {
        val builder = CfnRoleAliasPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnScheduledAudit(
        scope: Construct,
        id: String,
        block: CfnScheduledAuditDsl.() -> Unit = {},
    ): CfnScheduledAudit {
        val builder = CfnScheduledAuditDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnScheduledAuditProps(block: CfnScheduledAuditPropsDsl.() -> Unit = {}): CfnScheduledAuditProps {
        val builder = CfnScheduledAuditPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnSecurityProfile(
        scope: Construct,
        id: String,
        block: CfnSecurityProfileDsl.() -> Unit = {},
    ): CfnSecurityProfile {
        val builder = CfnSecurityProfileDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnSecurityProfileAlertTargetProperty(
        block: CfnSecurityProfileAlertTargetPropertyDsl.() -> Unit =
            {},
    ): CfnSecurityProfile.AlertTargetProperty {
        val builder = CfnSecurityProfileAlertTargetPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnSecurityProfileBehaviorCriteriaProperty(
        block: CfnSecurityProfileBehaviorCriteriaPropertyDsl.() -> Unit =
            {},
    ): CfnSecurityProfile.BehaviorCriteriaProperty {
        val builder = CfnSecurityProfileBehaviorCriteriaPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnSecurityProfileBehaviorProperty(
        block: CfnSecurityProfileBehaviorPropertyDsl.() -> Unit =
            {},
    ): CfnSecurityProfile.BehaviorProperty {
        val builder = CfnSecurityProfileBehaviorPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnSecurityProfileMachineLearningDetectionConfigProperty(
        block: CfnSecurityProfileMachineLearningDetectionConfigPropertyDsl.() -> Unit =
            {},
    ): CfnSecurityProfile.MachineLearningDetectionConfigProperty {
        val builder = CfnSecurityProfileMachineLearningDetectionConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnSecurityProfileMetricDimensionProperty(
        block: CfnSecurityProfileMetricDimensionPropertyDsl.() -> Unit =
            {},
    ): CfnSecurityProfile.MetricDimensionProperty {
        val builder = CfnSecurityProfileMetricDimensionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnSecurityProfileMetricToRetainProperty(
        block: CfnSecurityProfileMetricToRetainPropertyDsl.() -> Unit =
            {},
    ): CfnSecurityProfile.MetricToRetainProperty {
        val builder = CfnSecurityProfileMetricToRetainPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnSecurityProfileMetricValueProperty(
        block: CfnSecurityProfileMetricValuePropertyDsl.() -> Unit =
            {},
    ): CfnSecurityProfile.MetricValueProperty {
        val builder = CfnSecurityProfileMetricValuePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnSecurityProfileProps(block: CfnSecurityProfilePropsDsl.() -> Unit = {}): CfnSecurityProfileProps {
        val builder = CfnSecurityProfilePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnSecurityProfileStatisticalThresholdProperty(
        block: CfnSecurityProfileStatisticalThresholdPropertyDsl.() -> Unit =
            {},
    ): CfnSecurityProfile.StatisticalThresholdProperty {
        val builder = CfnSecurityProfileStatisticalThresholdPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnThing(
        scope: Construct,
        id: String,
        block: CfnThingDsl.() -> Unit = {},
    ): CfnThing {
        val builder = CfnThingDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnThingAttributePayloadProperty(
        block: CfnThingAttributePayloadPropertyDsl.() -> Unit =
            {},
    ): CfnThing.AttributePayloadProperty {
        val builder = CfnThingAttributePayloadPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnThingGroup(
        scope: Construct,
        id: String,
        block: CfnThingGroupDsl.() -> Unit = {},
    ): CfnThingGroup {
        val builder = CfnThingGroupDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnThingGroupAttributePayloadProperty(
        block: CfnThingGroupAttributePayloadPropertyDsl.() -> Unit =
            {},
    ): CfnThingGroup.AttributePayloadProperty {
        val builder = CfnThingGroupAttributePayloadPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnThingGroupProps(block: CfnThingGroupPropsDsl.() -> Unit = {}): CfnThingGroupProps {
        val builder = CfnThingGroupPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnThingGroupThingGroupPropertiesProperty(
        block: CfnThingGroupThingGroupPropertiesPropertyDsl.() -> Unit =
            {},
    ): CfnThingGroup.ThingGroupPropertiesProperty {
        val builder = CfnThingGroupThingGroupPropertiesPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnThingPrincipalAttachment(
        scope: Construct,
        id: String,
        block: CfnThingPrincipalAttachmentDsl.() -> Unit = {},
    ): CfnThingPrincipalAttachment {
        val builder = CfnThingPrincipalAttachmentDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnThingPrincipalAttachmentProps(
        block: CfnThingPrincipalAttachmentPropsDsl.() -> Unit =
            {},
    ): CfnThingPrincipalAttachmentProps {
        val builder = CfnThingPrincipalAttachmentPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnThingProps(block: CfnThingPropsDsl.() -> Unit = {}): CfnThingProps {
        val builder = CfnThingPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnThingType(
        scope: Construct,
        id: String,
        block: CfnThingTypeDsl.() -> Unit = {},
    ): CfnThingType {
        val builder = CfnThingTypeDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnThingTypeProps(block: CfnThingTypePropsDsl.() -> Unit = {}): CfnThingTypeProps {
        val builder = CfnThingTypePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnThingTypeThingTypePropertiesProperty(
        block: CfnThingTypeThingTypePropertiesPropertyDsl.() -> Unit =
            {},
    ): CfnThingType.ThingTypePropertiesProperty {
        val builder = CfnThingTypeThingTypePropertiesPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnTopicRule(
        scope: Construct,
        id: String,
        block: CfnTopicRuleDsl.() -> Unit = {},
    ): CfnTopicRule {
        val builder = CfnTopicRuleDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnTopicRuleActionProperty(
        block: CfnTopicRuleActionPropertyDsl.() -> Unit =
            {},
    ): CfnTopicRule.ActionProperty {
        val builder = CfnTopicRuleActionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnTopicRuleAssetPropertyTimestampProperty(
        block: CfnTopicRuleAssetPropertyTimestampPropertyDsl.() -> Unit =
            {},
    ): CfnTopicRule.AssetPropertyTimestampProperty {
        val builder = CfnTopicRuleAssetPropertyTimestampPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnTopicRuleAssetPropertyValueProperty(
        block: CfnTopicRuleAssetPropertyValuePropertyDsl.() -> Unit =
            {},
    ): CfnTopicRule.AssetPropertyValueProperty {
        val builder = CfnTopicRuleAssetPropertyValuePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnTopicRuleAssetPropertyVariantProperty(
        block: CfnTopicRuleAssetPropertyVariantPropertyDsl.() -> Unit =
            {},
    ): CfnTopicRule.AssetPropertyVariantProperty {
        val builder = CfnTopicRuleAssetPropertyVariantPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnTopicRuleCloudwatchAlarmActionProperty(
        block: CfnTopicRuleCloudwatchAlarmActionPropertyDsl.() -> Unit =
            {},
    ): CfnTopicRule.CloudwatchAlarmActionProperty {
        val builder = CfnTopicRuleCloudwatchAlarmActionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnTopicRuleCloudwatchLogsActionProperty(
        block: CfnTopicRuleCloudwatchLogsActionPropertyDsl.() -> Unit =
            {},
    ): CfnTopicRule.CloudwatchLogsActionProperty {
        val builder = CfnTopicRuleCloudwatchLogsActionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnTopicRuleCloudwatchMetricActionProperty(
        block: CfnTopicRuleCloudwatchMetricActionPropertyDsl.() -> Unit =
            {},
    ): CfnTopicRule.CloudwatchMetricActionProperty {
        val builder = CfnTopicRuleCloudwatchMetricActionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnTopicRuleDestination(
        scope: Construct,
        id: String,
        block: CfnTopicRuleDestinationDsl.() -> Unit = {},
    ): CfnTopicRuleDestination {
        val builder = CfnTopicRuleDestinationDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnTopicRuleDestinationHttpUrlDestinationSummaryProperty(
        block: CfnTopicRuleDestinationHttpUrlDestinationSummaryPropertyDsl.() -> Unit =
            {},
    ): CfnTopicRuleDestination.HttpUrlDestinationSummaryProperty {
        val builder = CfnTopicRuleDestinationHttpUrlDestinationSummaryPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnTopicRuleDestinationProps(
        block: CfnTopicRuleDestinationPropsDsl.() -> Unit =
            {},
    ): CfnTopicRuleDestinationProps {
        val builder = CfnTopicRuleDestinationPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnTopicRuleDestinationVpcDestinationPropertiesProperty(
        block: CfnTopicRuleDestinationVpcDestinationPropertiesPropertyDsl.() -> Unit =
            {},
    ): CfnTopicRuleDestination.VpcDestinationPropertiesProperty {
        val builder = CfnTopicRuleDestinationVpcDestinationPropertiesPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnTopicRuleDynamoDBActionProperty(
        block: CfnTopicRuleDynamoDBActionPropertyDsl.() -> Unit =
            {},
    ): CfnTopicRule.DynamoDBActionProperty {
        val builder = CfnTopicRuleDynamoDBActionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnTopicRuleDynamoDBv2ActionProperty(
        block: CfnTopicRuleDynamoDBv2ActionPropertyDsl.() -> Unit =
            {},
    ): CfnTopicRule.DynamoDBv2ActionProperty {
        val builder = CfnTopicRuleDynamoDBv2ActionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnTopicRuleElasticsearchActionProperty(
        block: CfnTopicRuleElasticsearchActionPropertyDsl.() -> Unit =
            {},
    ): CfnTopicRule.ElasticsearchActionProperty {
        val builder = CfnTopicRuleElasticsearchActionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnTopicRuleFirehoseActionProperty(
        block: CfnTopicRuleFirehoseActionPropertyDsl.() -> Unit =
            {},
    ): CfnTopicRule.FirehoseActionProperty {
        val builder = CfnTopicRuleFirehoseActionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnTopicRuleHttpActionHeaderProperty(
        block: CfnTopicRuleHttpActionHeaderPropertyDsl.() -> Unit =
            {},
    ): CfnTopicRule.HttpActionHeaderProperty {
        val builder = CfnTopicRuleHttpActionHeaderPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnTopicRuleHttpActionProperty(
        block: CfnTopicRuleHttpActionPropertyDsl.() -> Unit = {
        },
    ): CfnTopicRule.HttpActionProperty {
        val builder = CfnTopicRuleHttpActionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnTopicRuleHttpAuthorizationProperty(
        block: CfnTopicRuleHttpAuthorizationPropertyDsl.() -> Unit =
            {},
    ): CfnTopicRule.HttpAuthorizationProperty {
        val builder = CfnTopicRuleHttpAuthorizationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnTopicRuleIotAnalyticsActionProperty(
        block: CfnTopicRuleIotAnalyticsActionPropertyDsl.() -> Unit =
            {},
    ): CfnTopicRule.IotAnalyticsActionProperty {
        val builder = CfnTopicRuleIotAnalyticsActionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnTopicRuleIotEventsActionProperty(
        block: CfnTopicRuleIotEventsActionPropertyDsl.() -> Unit =
            {},
    ): CfnTopicRule.IotEventsActionProperty {
        val builder = CfnTopicRuleIotEventsActionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnTopicRuleIotSiteWiseActionProperty(
        block: CfnTopicRuleIotSiteWiseActionPropertyDsl.() -> Unit =
            {},
    ): CfnTopicRule.IotSiteWiseActionProperty {
        val builder = CfnTopicRuleIotSiteWiseActionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnTopicRuleKafkaActionProperty(
        block: CfnTopicRuleKafkaActionPropertyDsl.() -> Unit =
            {},
    ): CfnTopicRule.KafkaActionProperty {
        val builder = CfnTopicRuleKafkaActionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnTopicRuleKinesisActionProperty(
        block: CfnTopicRuleKinesisActionPropertyDsl.() -> Unit =
            {},
    ): CfnTopicRule.KinesisActionProperty {
        val builder = CfnTopicRuleKinesisActionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnTopicRuleLambdaActionProperty(
        block: CfnTopicRuleLambdaActionPropertyDsl.() -> Unit =
            {},
    ): CfnTopicRule.LambdaActionProperty {
        val builder = CfnTopicRuleLambdaActionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnTopicRuleLocationActionProperty(
        block: CfnTopicRuleLocationActionPropertyDsl.() -> Unit =
            {},
    ): CfnTopicRule.LocationActionProperty {
        val builder = CfnTopicRuleLocationActionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnTopicRuleOpenSearchActionProperty(
        block: CfnTopicRuleOpenSearchActionPropertyDsl.() -> Unit =
            {},
    ): CfnTopicRule.OpenSearchActionProperty {
        val builder = CfnTopicRuleOpenSearchActionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnTopicRuleProps(block: CfnTopicRulePropsDsl.() -> Unit = {}): CfnTopicRuleProps {
        val builder = CfnTopicRulePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnTopicRulePutAssetPropertyValueEntryProperty(
        block: CfnTopicRulePutAssetPropertyValueEntryPropertyDsl.() -> Unit =
            {},
    ): CfnTopicRule.PutAssetPropertyValueEntryProperty {
        val builder = CfnTopicRulePutAssetPropertyValueEntryPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnTopicRulePutItemInputProperty(
        block: CfnTopicRulePutItemInputPropertyDsl.() -> Unit =
            {},
    ): CfnTopicRule.PutItemInputProperty {
        val builder = CfnTopicRulePutItemInputPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnTopicRuleRepublishActionHeadersProperty(
        block: CfnTopicRuleRepublishActionHeadersPropertyDsl.() -> Unit =
            {},
    ): CfnTopicRule.RepublishActionHeadersProperty {
        val builder = CfnTopicRuleRepublishActionHeadersPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnTopicRuleRepublishActionProperty(
        block: CfnTopicRuleRepublishActionPropertyDsl.() -> Unit =
            {},
    ): CfnTopicRule.RepublishActionProperty {
        val builder = CfnTopicRuleRepublishActionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnTopicRuleS3ActionProperty(
        block: CfnTopicRuleS3ActionPropertyDsl.() -> Unit =
            {},
    ): CfnTopicRule.S3ActionProperty {
        val builder = CfnTopicRuleS3ActionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnTopicRuleSigV4AuthorizationProperty(
        block: CfnTopicRuleSigV4AuthorizationPropertyDsl.() -> Unit =
            {},
    ): CfnTopicRule.SigV4AuthorizationProperty {
        val builder = CfnTopicRuleSigV4AuthorizationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnTopicRuleSnsActionProperty(
        block: CfnTopicRuleSnsActionPropertyDsl.() -> Unit =
            {},
    ): CfnTopicRule.SnsActionProperty {
        val builder = CfnTopicRuleSnsActionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnTopicRuleSqsActionProperty(
        block: CfnTopicRuleSqsActionPropertyDsl.() -> Unit =
            {},
    ): CfnTopicRule.SqsActionProperty {
        val builder = CfnTopicRuleSqsActionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnTopicRuleStepFunctionsActionProperty(
        block: CfnTopicRuleStepFunctionsActionPropertyDsl.() -> Unit =
            {},
    ): CfnTopicRule.StepFunctionsActionProperty {
        val builder = CfnTopicRuleStepFunctionsActionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnTopicRuleTimestampProperty(
        block: CfnTopicRuleTimestampPropertyDsl.() -> Unit =
            {},
    ): CfnTopicRule.TimestampProperty {
        val builder = CfnTopicRuleTimestampPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnTopicRuleTimestreamActionProperty(
        block: CfnTopicRuleTimestreamActionPropertyDsl.() -> Unit =
            {},
    ): CfnTopicRule.TimestreamActionProperty {
        val builder = CfnTopicRuleTimestreamActionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnTopicRuleTimestreamDimensionProperty(
        block: CfnTopicRuleTimestreamDimensionPropertyDsl.() -> Unit =
            {},
    ): CfnTopicRule.TimestreamDimensionProperty {
        val builder = CfnTopicRuleTimestreamDimensionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnTopicRuleTimestreamTimestampProperty(
        block: CfnTopicRuleTimestreamTimestampPropertyDsl.() -> Unit =
            {},
    ): CfnTopicRule.TimestreamTimestampProperty {
        val builder = CfnTopicRuleTimestreamTimestampPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnTopicRuleTopicRulePayloadProperty(
        block: CfnTopicRuleTopicRulePayloadPropertyDsl.() -> Unit =
            {},
    ): CfnTopicRule.TopicRulePayloadProperty {
        val builder = CfnTopicRuleTopicRulePayloadPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnTopicRuleUserPropertyProperty(
        block: CfnTopicRuleUserPropertyPropertyDsl.() -> Unit =
            {},
    ): CfnTopicRule.UserPropertyProperty {
        val builder = CfnTopicRuleUserPropertyPropertyDsl()
        builder.apply(block)
        return builder.build()
    }
}
