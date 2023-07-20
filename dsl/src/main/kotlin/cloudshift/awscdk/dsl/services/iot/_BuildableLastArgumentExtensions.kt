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

public inline
    fun CfnJobTemplate.setJobExecutionsRetryConfig(block: CfnJobTemplateJobExecutionsRetryConfigPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnJobTemplateJobExecutionsRetryConfigPropertyDsl()
  builder.apply(block)
  return setJobExecutionsRetryConfig(builder.build())
}

public inline
    fun CfnTopicRule.setTopicRulePayload(block: CfnTopicRuleTopicRulePayloadPropertyDsl.() -> Unit =
    {}) {
  val builder = CfnTopicRuleTopicRulePayloadPropertyDsl()
  builder.apply(block)
  return setTopicRulePayload(builder.build())
}

public inline
    fun CfnCACertificate.setRegistrationConfig(block: CfnCACertificateRegistrationConfigPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnCACertificateRegistrationConfigPropertyDsl()
  builder.apply(block)
  return setRegistrationConfig(builder.build())
}

public inline
    fun CfnBillingGroup.setBillingGroupProperties(block: CfnBillingGroupBillingGroupPropertiesPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnBillingGroupBillingGroupPropertiesPropertyDsl()
  builder.apply(block)
  return setBillingGroupProperties(builder.build())
}

public inline
    fun CfnAccountAuditConfiguration.setAuditCheckConfigurations(block: CfnAccountAuditConfigurationAuditCheckConfigurationsPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnAccountAuditConfigurationAuditCheckConfigurationsPropertyDsl()
  builder.apply(block)
  return setAuditCheckConfigurations(builder.build())
}

public inline
    fun CfnAccountAuditConfiguration.setAuditNotificationTargetConfigurations(block: CfnAccountAuditConfigurationAuditNotificationTargetConfigurationsPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnAccountAuditConfigurationAuditNotificationTargetConfigurationsPropertyDsl()
  builder.apply(block)
  return setAuditNotificationTargetConfigurations(builder.build())
}

public inline
    fun CfnDomainConfiguration.setAuthorizerConfig(block: CfnDomainConfigurationAuthorizerConfigPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnDomainConfigurationAuthorizerConfigPropertyDsl()
  builder.apply(block)
  return setAuthorizerConfig(builder.build())
}

public inline
    fun CfnDomainConfiguration.setTlsConfig(block: CfnDomainConfigurationTlsConfigPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnDomainConfigurationTlsConfigPropertyDsl()
  builder.apply(block)
  return setTlsConfig(builder.build())
}

public inline
    fun CfnThingType.setThingTypeProperties(block: CfnThingTypeThingTypePropertiesPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnThingTypeThingTypePropertiesPropertyDsl()
  builder.apply(block)
  return setThingTypeProperties(builder.build())
}

public inline
    fun CfnTopicRuleDestination.setHttpUrlProperties(block: CfnTopicRuleDestinationHttpUrlDestinationSummaryPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnTopicRuleDestinationHttpUrlDestinationSummaryPropertyDsl()
  builder.apply(block)
  return setHttpUrlProperties(builder.build())
}

public inline
    fun CfnTopicRuleDestination.setVpcProperties(block: CfnTopicRuleDestinationVpcDestinationPropertiesPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnTopicRuleDestinationVpcDestinationPropertiesPropertyDsl()
  builder.apply(block)
  return setVpcProperties(builder.build())
}

public inline fun CfnThing.setAttributePayload(block: CfnThingAttributePayloadPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnThingAttributePayloadPropertyDsl()
  builder.apply(block)
  return setAttributePayload(builder.build())
}

public inline
    fun CfnFleetMetric.setAggregationType(block: CfnFleetMetricAggregationTypePropertyDsl.() -> Unit
    = {}) {
  val builder = CfnFleetMetricAggregationTypePropertyDsl()
  builder.apply(block)
  return setAggregationType(builder.build())
}

public inline
    fun CfnMitigationAction.setActionParams(block: CfnMitigationActionActionParamsPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnMitigationActionActionParamsPropertyDsl()
  builder.apply(block)
  return setActionParams(builder.build())
}

public inline
    fun CfnProvisioningTemplate.setPreProvisioningHook(block: CfnProvisioningTemplateProvisioningHookPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnProvisioningTemplateProvisioningHookPropertyDsl()
  builder.apply(block)
  return setPreProvisioningHook(builder.build())
}

public inline
    fun CfnThingGroup.setThingGroupProperties(block: CfnThingGroupThingGroupPropertiesPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnThingGroupThingGroupPropertiesPropertyDsl()
  builder.apply(block)
  return setThingGroupProperties(builder.build())
}
