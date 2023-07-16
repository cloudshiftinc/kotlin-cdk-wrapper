@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ses

import cloudshift.awscdk.dsl.RemovalPolicyOptionsDsl
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.RemovalPolicy
import software.amazon.awscdk.services.ses.CfnConfigurationSet
import software.amazon.awscdk.services.ses.CfnConfigurationSetEventDestination
import software.amazon.awscdk.services.ses.CfnContactList
import software.amazon.awscdk.services.ses.CfnDedicatedIpPool
import software.amazon.awscdk.services.ses.CfnEmailIdentity
import software.amazon.awscdk.services.ses.CfnReceiptFilter
import software.amazon.awscdk.services.ses.CfnReceiptRule
import software.amazon.awscdk.services.ses.CfnReceiptRuleSet
import software.amazon.awscdk.services.ses.CfnTemplate
import software.amazon.awscdk.services.ses.CfnVdmAttributes
import software.amazon.awscdk.services.ses.ConfigurationSet
import software.amazon.awscdk.services.ses.ConfigurationSetEventDestination
import software.amazon.awscdk.services.ses.ReceiptRule
import software.amazon.awscdk.services.ses.ReceiptRuleSet

public inline fun CfnConfigurationSet.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline
    fun CfnConfigurationSet.setDeliveryOptions(block: CfnConfigurationSetDeliveryOptionsPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnConfigurationSetDeliveryOptionsPropertyDsl()
  builder.apply(block)
  return setDeliveryOptions(builder.build())
}

public inline
    fun CfnConfigurationSet.setReputationOptions(block: CfnConfigurationSetReputationOptionsPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnConfigurationSetReputationOptionsPropertyDsl()
  builder.apply(block)
  return setReputationOptions(builder.build())
}

public inline
    fun CfnConfigurationSet.setSendingOptions(block: CfnConfigurationSetSendingOptionsPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnConfigurationSetSendingOptionsPropertyDsl()
  builder.apply(block)
  return setSendingOptions(builder.build())
}

public inline
    fun CfnConfigurationSet.setSuppressionOptions(block: CfnConfigurationSetSuppressionOptionsPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnConfigurationSetSuppressionOptionsPropertyDsl()
  builder.apply(block)
  return setSuppressionOptions(builder.build())
}

public inline
    fun CfnConfigurationSet.setTrackingOptions(block: CfnConfigurationSetTrackingOptionsPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnConfigurationSetTrackingOptionsPropertyDsl()
  builder.apply(block)
  return setTrackingOptions(builder.build())
}

public inline
    fun CfnConfigurationSet.setVdmOptions(block: CfnConfigurationSetVdmOptionsPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnConfigurationSetVdmOptionsPropertyDsl()
  builder.apply(block)
  return setVdmOptions(builder.build())
}

public inline fun CfnConfigurationSetEventDestination.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline
    fun CfnConfigurationSetEventDestination.setEventDestination(block: CfnConfigurationSetEventDestinationEventDestinationPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnConfigurationSetEventDestinationEventDestinationPropertyDsl()
  builder.apply(block)
  return setEventDestination(builder.build())
}

public inline fun CfnContactList.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnDedicatedIpPool.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnEmailIdentity.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline
    fun CfnEmailIdentity.setConfigurationSetAttributes(block: CfnEmailIdentityConfigurationSetAttributesPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnEmailIdentityConfigurationSetAttributesPropertyDsl()
  builder.apply(block)
  return setConfigurationSetAttributes(builder.build())
}

public inline
    fun CfnEmailIdentity.setDkimAttributes(block: CfnEmailIdentityDkimAttributesPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnEmailIdentityDkimAttributesPropertyDsl()
  builder.apply(block)
  return setDkimAttributes(builder.build())
}

public inline
    fun CfnEmailIdentity.setDkimSigningAttributes(block: CfnEmailIdentityDkimSigningAttributesPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnEmailIdentityDkimSigningAttributesPropertyDsl()
  builder.apply(block)
  return setDkimSigningAttributes(builder.build())
}

public inline
    fun CfnEmailIdentity.setFeedbackAttributes(block: CfnEmailIdentityFeedbackAttributesPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnEmailIdentityFeedbackAttributesPropertyDsl()
  builder.apply(block)
  return setFeedbackAttributes(builder.build())
}

public inline
    fun CfnEmailIdentity.setMailFromAttributes(block: CfnEmailIdentityMailFromAttributesPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnEmailIdentityMailFromAttributesPropertyDsl()
  builder.apply(block)
  return setMailFromAttributes(builder.build())
}

public inline fun CfnReceiptFilter.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnReceiptFilter.setFilter(block: CfnReceiptFilterFilterPropertyDsl.() -> Unit =
    {}) {
  val builder = CfnReceiptFilterFilterPropertyDsl()
  builder.apply(block)
  return setFilter(builder.build())
}

public inline fun CfnReceiptRule.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnReceiptRule.setRule(block: CfnReceiptRuleRulePropertyDsl.() -> Unit = {}) {
  val builder = CfnReceiptRuleRulePropertyDsl()
  builder.apply(block)
  return setRule(builder.build())
}

public inline fun CfnReceiptRuleSet.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnTemplate.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnTemplate.setTemplate(block: CfnTemplateTemplatePropertyDsl.() -> Unit = {}) {
  val builder = CfnTemplateTemplatePropertyDsl()
  builder.apply(block)
  return setTemplate(builder.build())
}

public inline fun CfnVdmAttributes.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline
    fun CfnVdmAttributes.setDashboardAttributes(block: CfnVdmAttributesDashboardAttributesPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnVdmAttributesDashboardAttributesPropertyDsl()
  builder.apply(block)
  return setDashboardAttributes(builder.build())
}

public inline
    fun CfnVdmAttributes.setGuardianAttributes(block: CfnVdmAttributesGuardianAttributesPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnVdmAttributesGuardianAttributesPropertyDsl()
  builder.apply(block)
  return setGuardianAttributes(builder.build())
}

public inline fun ConfigurationSet.addEventDestination(arg0: String,
    block: ConfigurationSetEventDestinationOptionsDsl.() -> Unit = {}):
    ConfigurationSetEventDestination {
  val builder = ConfigurationSetEventDestinationOptionsDsl()
  builder.apply(block)
  return addEventDestination(arg0,builder.build())
}

public inline fun ReceiptRuleSet.addRule(arg0: String, block: ReceiptRuleOptionsDsl.() -> Unit =
    {}): ReceiptRule {
  val builder = ReceiptRuleOptionsDsl()
  builder.apply(block)
  return addRule(arg0,builder.build())
}
