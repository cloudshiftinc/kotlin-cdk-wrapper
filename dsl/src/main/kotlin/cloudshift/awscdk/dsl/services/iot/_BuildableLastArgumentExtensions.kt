@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iot

import kotlin.Unit
import software.amazon.awscdk.services.iot.CfnAccountAuditConfiguration
import software.amazon.awscdk.services.iot.CfnBillingGroup
import software.amazon.awscdk.services.iot.CfnCACertificate
import software.amazon.awscdk.services.iot.CfnDomainConfiguration
import software.amazon.awscdk.services.iot.CfnFleetMetric
import software.amazon.awscdk.services.iot.CfnJobTemplate
import software.amazon.awscdk.services.iot.CfnMitigationAction
import software.amazon.awscdk.services.iot.CfnProvisioningTemplate
import software.amazon.awscdk.services.iot.CfnThing
import software.amazon.awscdk.services.iot.CfnThingGroup
import software.amazon.awscdk.services.iot.CfnThingType
import software.amazon.awscdk.services.iot.CfnTopicRule
import software.amazon.awscdk.services.iot.CfnTopicRuleDestination

/**
 * Allows you to create the criteria to retry a job.
 */
public inline
    fun CfnJobTemplate.setJobExecutionsRetryConfig(block: CfnJobTemplateJobExecutionsRetryConfigPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnJobTemplateJobExecutionsRetryConfigPropertyDsl()
  builder.apply(block)
  return setJobExecutionsRetryConfig(builder.build())
}

/**
 * The rule payload.
 */
public inline
    fun CfnTopicRule.setTopicRulePayload(block: CfnTopicRuleTopicRulePayloadPropertyDsl.() -> Unit =
    {}) {
  val builder = CfnTopicRuleTopicRulePayloadPropertyDsl()
  builder.apply(block)
  return setTopicRulePayload(builder.build())
}

/**
 * Information about the registration configuration.
 */
public inline
    fun CfnCACertificate.setRegistrationConfig(block: CfnCACertificateRegistrationConfigPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnCACertificateRegistrationConfigPropertyDsl()
  builder.apply(block)
  return setRegistrationConfig(builder.build())
}

/**
 * The properties of the billing group.
 */
public inline
    fun CfnBillingGroup.setBillingGroupProperties(block: CfnBillingGroupBillingGroupPropertiesPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnBillingGroupBillingGroupPropertiesPropertyDsl()
  builder.apply(block)
  return setBillingGroupProperties(builder.build())
}

/**
 * Specifies which audit checks are enabled and disabled for this account.
 */
public inline
    fun CfnAccountAuditConfiguration.setAuditCheckConfigurations(block: CfnAccountAuditConfigurationAuditCheckConfigurationsPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnAccountAuditConfigurationAuditCheckConfigurationsPropertyDsl()
  builder.apply(block)
  return setAuditCheckConfigurations(builder.build())
}

/**
 * Information about the targets to which audit notifications are sent.
 */
public inline
    fun CfnAccountAuditConfiguration.setAuditNotificationTargetConfigurations(block: CfnAccountAuditConfigurationAuditNotificationTargetConfigurationsPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnAccountAuditConfigurationAuditNotificationTargetConfigurationsPropertyDsl()
  builder.apply(block)
  return setAuditNotificationTargetConfigurations(builder.build())
}

/**
 * An object that specifies the authorization service for a domain.
 */
public inline
    fun CfnDomainConfiguration.setAuthorizerConfig(block: CfnDomainConfigurationAuthorizerConfigPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnDomainConfigurationAuthorizerConfigPropertyDsl()
  builder.apply(block)
  return setAuthorizerConfig(builder.build())
}

/**
 * An object that specifies the TLS configuration for a domain.
 */
public inline
    fun CfnDomainConfiguration.setTlsConfig(block: CfnDomainConfigurationTlsConfigPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnDomainConfigurationTlsConfigPropertyDsl()
  builder.apply(block)
  return setTlsConfig(builder.build())
}

/**
 * The thing type properties for the thing type to create.
 */
public inline
    fun CfnThingType.setThingTypeProperties(block: CfnThingTypeThingTypePropertiesPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnThingTypeThingTypePropertiesPropertyDsl()
  builder.apply(block)
  return setThingTypeProperties(builder.build())
}

/**
 * Properties of the HTTP URL.
 */
public inline
    fun CfnTopicRuleDestination.setHttpUrlProperties(block: CfnTopicRuleDestinationHttpUrlDestinationSummaryPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnTopicRuleDestinationHttpUrlDestinationSummaryPropertyDsl()
  builder.apply(block)
  return setHttpUrlProperties(builder.build())
}

/**
 * Properties of the virtual private cloud (VPC) connection.
 */
public inline
    fun CfnTopicRuleDestination.setVpcProperties(block: CfnTopicRuleDestinationVpcDestinationPropertiesPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnTopicRuleDestinationVpcDestinationPropertiesPropertyDsl()
  builder.apply(block)
  return setVpcProperties(builder.build())
}

/**
 * A string that contains up to three key value pairs.
 */
public inline fun CfnThing.setAttributePayload(block: CfnThingAttributePayloadPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnThingAttributePayloadPropertyDsl()
  builder.apply(block)
  return setAttributePayload(builder.build())
}

/**
 * The type of the aggregation query.
 */
public inline
    fun CfnFleetMetric.setAggregationType(block: CfnFleetMetricAggregationTypePropertyDsl.() -> Unit
    = {}) {
  val builder = CfnFleetMetricAggregationTypePropertyDsl()
  builder.apply(block)
  return setAggregationType(builder.build())
}

/**
 * The set of parameters for this mitigation action.
 */
public inline
    fun CfnMitigationAction.setActionParams(block: CfnMitigationActionActionParamsPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnMitigationActionActionParamsPropertyDsl()
  builder.apply(block)
  return setActionParams(builder.build())
}

/**
 * Creates a pre-provisioning hook template.
 */
public inline
    fun CfnProvisioningTemplate.setPreProvisioningHook(block: CfnProvisioningTemplateProvisioningHookPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnProvisioningTemplateProvisioningHookPropertyDsl()
  builder.apply(block)
  return setPreProvisioningHook(builder.build())
}

/**
 * Thing group properties.
 */
public inline
    fun CfnThingGroup.setThingGroupProperties(block: CfnThingGroupThingGroupPropertiesPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnThingGroupThingGroupPropertiesPropertyDsl()
  builder.apply(block)
  return setThingGroupProperties(builder.build())
}
