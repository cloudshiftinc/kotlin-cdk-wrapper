@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ses

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ses.AddHeaderActionConfig
import software.amazon.awscdk.services.ses.AllowListReceiptFilter
import software.amazon.awscdk.services.ses.AllowListReceiptFilterProps
import software.amazon.awscdk.services.ses.BounceActionConfig
import software.amazon.awscdk.services.ses.ByoDkimOptions
import software.amazon.awscdk.services.ses.CfnConfigurationSet
import software.amazon.awscdk.services.ses.CfnConfigurationSetEventDestination
import software.amazon.awscdk.services.ses.CfnConfigurationSetEventDestinationProps
import software.amazon.awscdk.services.ses.CfnConfigurationSetProps
import software.amazon.awscdk.services.ses.CfnContactList
import software.amazon.awscdk.services.ses.CfnContactListProps
import software.amazon.awscdk.services.ses.CfnDedicatedIpPool
import software.amazon.awscdk.services.ses.CfnDedicatedIpPoolProps
import software.amazon.awscdk.services.ses.CfnEmailIdentity
import software.amazon.awscdk.services.ses.CfnEmailIdentityProps
import software.amazon.awscdk.services.ses.CfnReceiptFilter
import software.amazon.awscdk.services.ses.CfnReceiptFilterProps
import software.amazon.awscdk.services.ses.CfnReceiptRule
import software.amazon.awscdk.services.ses.CfnReceiptRuleProps
import software.amazon.awscdk.services.ses.CfnReceiptRuleSet
import software.amazon.awscdk.services.ses.CfnReceiptRuleSetProps
import software.amazon.awscdk.services.ses.CfnTemplate
import software.amazon.awscdk.services.ses.CfnTemplateProps
import software.amazon.awscdk.services.ses.CfnVdmAttributes
import software.amazon.awscdk.services.ses.CfnVdmAttributesProps
import software.amazon.awscdk.services.ses.CloudWatchDimension
import software.amazon.awscdk.services.ses.ConfigurationSet
import software.amazon.awscdk.services.ses.ConfigurationSetEventDestination
import software.amazon.awscdk.services.ses.ConfigurationSetEventDestinationOptions
import software.amazon.awscdk.services.ses.ConfigurationSetEventDestinationProps
import software.amazon.awscdk.services.ses.ConfigurationSetProps
import software.amazon.awscdk.services.ses.DedicatedIpPool
import software.amazon.awscdk.services.ses.DedicatedIpPoolProps
import software.amazon.awscdk.services.ses.DkimIdentityConfig
import software.amazon.awscdk.services.ses.DkimRecord
import software.amazon.awscdk.services.ses.DropSpamReceiptRule
import software.amazon.awscdk.services.ses.DropSpamReceiptRuleProps
import software.amazon.awscdk.services.ses.EmailIdentity
import software.amazon.awscdk.services.ses.EmailIdentityProps
import software.amazon.awscdk.services.ses.LambdaActionConfig
import software.amazon.awscdk.services.ses.ReceiptFilter
import software.amazon.awscdk.services.ses.ReceiptFilterProps
import software.amazon.awscdk.services.ses.ReceiptRule
import software.amazon.awscdk.services.ses.ReceiptRuleActionConfig
import software.amazon.awscdk.services.ses.ReceiptRuleOptions
import software.amazon.awscdk.services.ses.ReceiptRuleProps
import software.amazon.awscdk.services.ses.ReceiptRuleSet
import software.amazon.awscdk.services.ses.ReceiptRuleSetProps
import software.amazon.awscdk.services.ses.S3ActionConfig
import software.amazon.awscdk.services.ses.SNSActionConfig
import software.amazon.awscdk.services.ses.StopActionConfig
import software.amazon.awscdk.services.ses.VdmAttributes
import software.amazon.awscdk.services.ses.VdmAttributesProps
import software.amazon.awscdk.services.ses.WorkmailActionConfig
import software.constructs.Construct

public object ses {
  public inline fun addHeaderActionConfig(block: AddHeaderActionConfigDsl.() -> Unit = {}):
      AddHeaderActionConfig {
    val builder = AddHeaderActionConfigDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun allowListReceiptFilter(
    scope: Construct,
    id: String,
    block: AllowListReceiptFilterDsl.() -> Unit = {},
  ): AllowListReceiptFilter {
    val builder = AllowListReceiptFilterDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun allowListReceiptFilterProps(block: AllowListReceiptFilterPropsDsl.() -> Unit =
      {}): AllowListReceiptFilterProps {
    val builder = AllowListReceiptFilterPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun bounceActionConfig(block: BounceActionConfigDsl.() -> Unit = {}):
      BounceActionConfig {
    val builder = BounceActionConfigDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun byoDkimOptions(block: ByoDkimOptionsDsl.() -> Unit = {}): ByoDkimOptions {
    val builder = ByoDkimOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnConfigurationSet(
    scope: Construct,
    id: String,
    block: CfnConfigurationSetDsl.() -> Unit = {},
  ): CfnConfigurationSet {
    val builder = CfnConfigurationSetDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnConfigurationSetDashboardOptionsProperty(block: CfnConfigurationSetDashboardOptionsPropertyDsl.() -> Unit
      = {}): CfnConfigurationSet.DashboardOptionsProperty {
    val builder = CfnConfigurationSetDashboardOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnConfigurationSetDeliveryOptionsProperty(block: CfnConfigurationSetDeliveryOptionsPropertyDsl.() -> Unit
      = {}): CfnConfigurationSet.DeliveryOptionsProperty {
    val builder = CfnConfigurationSetDeliveryOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnConfigurationSetEventDestination(
    scope: Construct,
    id: String,
    block: CfnConfigurationSetEventDestinationDsl.() -> Unit = {},
  ): CfnConfigurationSetEventDestination {
    val builder = CfnConfigurationSetEventDestinationDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnConfigurationSetEventDestinationCloudWatchDestinationProperty(block: CfnConfigurationSetEventDestinationCloudWatchDestinationPropertyDsl.() -> Unit
      = {}): CfnConfigurationSetEventDestination.CloudWatchDestinationProperty {
    val builder = CfnConfigurationSetEventDestinationCloudWatchDestinationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnConfigurationSetEventDestinationDimensionConfigurationProperty(block: CfnConfigurationSetEventDestinationDimensionConfigurationPropertyDsl.() -> Unit
      = {}): CfnConfigurationSetEventDestination.DimensionConfigurationProperty {
    val builder = CfnConfigurationSetEventDestinationDimensionConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnConfigurationSetEventDestinationEventDestinationProperty(block: CfnConfigurationSetEventDestinationEventDestinationPropertyDsl.() -> Unit
      = {}): CfnConfigurationSetEventDestination.EventDestinationProperty {
    val builder = CfnConfigurationSetEventDestinationEventDestinationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnConfigurationSetEventDestinationKinesisFirehoseDestinationProperty(block: CfnConfigurationSetEventDestinationKinesisFirehoseDestinationPropertyDsl.() -> Unit
      = {}): CfnConfigurationSetEventDestination.KinesisFirehoseDestinationProperty {
    val builder = CfnConfigurationSetEventDestinationKinesisFirehoseDestinationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnConfigurationSetEventDestinationProps(block: CfnConfigurationSetEventDestinationPropsDsl.() -> Unit
      = {}): CfnConfigurationSetEventDestinationProps {
    val builder = CfnConfigurationSetEventDestinationPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnConfigurationSetEventDestinationSnsDestinationProperty(block: CfnConfigurationSetEventDestinationSnsDestinationPropertyDsl.() -> Unit
      = {}): CfnConfigurationSetEventDestination.SnsDestinationProperty {
    val builder = CfnConfigurationSetEventDestinationSnsDestinationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnConfigurationSetGuardianOptionsProperty(block: CfnConfigurationSetGuardianOptionsPropertyDsl.() -> Unit
      = {}): CfnConfigurationSet.GuardianOptionsProperty {
    val builder = CfnConfigurationSetGuardianOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnConfigurationSetProps(block: CfnConfigurationSetPropsDsl.() -> Unit = {}):
      CfnConfigurationSetProps {
    val builder = CfnConfigurationSetPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnConfigurationSetReputationOptionsProperty(block: CfnConfigurationSetReputationOptionsPropertyDsl.() -> Unit
      = {}): CfnConfigurationSet.ReputationOptionsProperty {
    val builder = CfnConfigurationSetReputationOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnConfigurationSetSendingOptionsProperty(block: CfnConfigurationSetSendingOptionsPropertyDsl.() -> Unit
      = {}): CfnConfigurationSet.SendingOptionsProperty {
    val builder = CfnConfigurationSetSendingOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnConfigurationSetSuppressionOptionsProperty(block: CfnConfigurationSetSuppressionOptionsPropertyDsl.() -> Unit
      = {}): CfnConfigurationSet.SuppressionOptionsProperty {
    val builder = CfnConfigurationSetSuppressionOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnConfigurationSetTrackingOptionsProperty(block: CfnConfigurationSetTrackingOptionsPropertyDsl.() -> Unit
      = {}): CfnConfigurationSet.TrackingOptionsProperty {
    val builder = CfnConfigurationSetTrackingOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnConfigurationSetVdmOptionsProperty(block: CfnConfigurationSetVdmOptionsPropertyDsl.() -> Unit
      = {}): CfnConfigurationSet.VdmOptionsProperty {
    val builder = CfnConfigurationSetVdmOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnContactList(
    scope: Construct,
    id: String,
    block: CfnContactListDsl.() -> Unit = {},
  ): CfnContactList {
    val builder = CfnContactListDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnContactListProps(block: CfnContactListPropsDsl.() -> Unit = {}):
      CfnContactListProps {
    val builder = CfnContactListPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnContactListTopicProperty(block: CfnContactListTopicPropertyDsl.() -> Unit =
      {}): CfnContactList.TopicProperty {
    val builder = CfnContactListTopicPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnDedicatedIpPool(
    scope: Construct,
    id: String,
    block: CfnDedicatedIpPoolDsl.() -> Unit = {},
  ): CfnDedicatedIpPool {
    val builder = CfnDedicatedIpPoolDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnDedicatedIpPoolProps(block: CfnDedicatedIpPoolPropsDsl.() -> Unit = {}):
      CfnDedicatedIpPoolProps {
    val builder = CfnDedicatedIpPoolPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnEmailIdentity(
    scope: Construct,
    id: String,
    block: CfnEmailIdentityDsl.() -> Unit = {},
  ): CfnEmailIdentity {
    val builder = CfnEmailIdentityDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnEmailIdentityConfigurationSetAttributesProperty(block: CfnEmailIdentityConfigurationSetAttributesPropertyDsl.() -> Unit
      = {}): CfnEmailIdentity.ConfigurationSetAttributesProperty {
    val builder = CfnEmailIdentityConfigurationSetAttributesPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnEmailIdentityDkimAttributesProperty(block: CfnEmailIdentityDkimAttributesPropertyDsl.() -> Unit
      = {}): CfnEmailIdentity.DkimAttributesProperty {
    val builder = CfnEmailIdentityDkimAttributesPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnEmailIdentityDkimSigningAttributesProperty(block: CfnEmailIdentityDkimSigningAttributesPropertyDsl.() -> Unit
      = {}): CfnEmailIdentity.DkimSigningAttributesProperty {
    val builder = CfnEmailIdentityDkimSigningAttributesPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnEmailIdentityFeedbackAttributesProperty(block: CfnEmailIdentityFeedbackAttributesPropertyDsl.() -> Unit
      = {}): CfnEmailIdentity.FeedbackAttributesProperty {
    val builder = CfnEmailIdentityFeedbackAttributesPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnEmailIdentityMailFromAttributesProperty(block: CfnEmailIdentityMailFromAttributesPropertyDsl.() -> Unit
      = {}): CfnEmailIdentity.MailFromAttributesProperty {
    val builder = CfnEmailIdentityMailFromAttributesPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnEmailIdentityProps(block: CfnEmailIdentityPropsDsl.() -> Unit = {}):
      CfnEmailIdentityProps {
    val builder = CfnEmailIdentityPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnReceiptFilter(
    scope: Construct,
    id: String,
    block: CfnReceiptFilterDsl.() -> Unit = {},
  ): CfnReceiptFilter {
    val builder = CfnReceiptFilterDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnReceiptFilterFilterProperty(block: CfnReceiptFilterFilterPropertyDsl.() -> Unit = {}):
      CfnReceiptFilter.FilterProperty {
    val builder = CfnReceiptFilterFilterPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnReceiptFilterIpFilterProperty(block: CfnReceiptFilterIpFilterPropertyDsl.() -> Unit =
      {}): CfnReceiptFilter.IpFilterProperty {
    val builder = CfnReceiptFilterIpFilterPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnReceiptFilterProps(block: CfnReceiptFilterPropsDsl.() -> Unit = {}):
      CfnReceiptFilterProps {
    val builder = CfnReceiptFilterPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnReceiptRule(
    scope: Construct,
    id: String,
    block: CfnReceiptRuleDsl.() -> Unit = {},
  ): CfnReceiptRule {
    val builder = CfnReceiptRuleDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnReceiptRuleActionProperty(block: CfnReceiptRuleActionPropertyDsl.() -> Unit =
      {}): CfnReceiptRule.ActionProperty {
    val builder = CfnReceiptRuleActionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnReceiptRuleAddHeaderActionProperty(block: CfnReceiptRuleAddHeaderActionPropertyDsl.() -> Unit
      = {}): CfnReceiptRule.AddHeaderActionProperty {
    val builder = CfnReceiptRuleAddHeaderActionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnReceiptRuleBounceActionProperty(block: CfnReceiptRuleBounceActionPropertyDsl.() -> Unit
      = {}): CfnReceiptRule.BounceActionProperty {
    val builder = CfnReceiptRuleBounceActionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnReceiptRuleLambdaActionProperty(block: CfnReceiptRuleLambdaActionPropertyDsl.() -> Unit
      = {}): CfnReceiptRule.LambdaActionProperty {
    val builder = CfnReceiptRuleLambdaActionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnReceiptRuleProps(block: CfnReceiptRulePropsDsl.() -> Unit = {}):
      CfnReceiptRuleProps {
    val builder = CfnReceiptRulePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnReceiptRuleRuleProperty(block: CfnReceiptRuleRulePropertyDsl.() -> Unit =
      {}): CfnReceiptRule.RuleProperty {
    val builder = CfnReceiptRuleRulePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnReceiptRuleS3ActionProperty(block: CfnReceiptRuleS3ActionPropertyDsl.() -> Unit = {}):
      CfnReceiptRule.S3ActionProperty {
    val builder = CfnReceiptRuleS3ActionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnReceiptRuleSNSActionProperty(block: CfnReceiptRuleSNSActionPropertyDsl.() -> Unit =
      {}): CfnReceiptRule.SNSActionProperty {
    val builder = CfnReceiptRuleSNSActionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnReceiptRuleSet(
    scope: Construct,
    id: String,
    block: CfnReceiptRuleSetDsl.() -> Unit = {},
  ): CfnReceiptRuleSet {
    val builder = CfnReceiptRuleSetDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnReceiptRuleSetProps(block: CfnReceiptRuleSetPropsDsl.() -> Unit = {}):
      CfnReceiptRuleSetProps {
    val builder = CfnReceiptRuleSetPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnReceiptRuleStopActionProperty(block: CfnReceiptRuleStopActionPropertyDsl.() -> Unit =
      {}): CfnReceiptRule.StopActionProperty {
    val builder = CfnReceiptRuleStopActionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnReceiptRuleWorkmailActionProperty(block: CfnReceiptRuleWorkmailActionPropertyDsl.() -> Unit
      = {}): CfnReceiptRule.WorkmailActionProperty {
    val builder = CfnReceiptRuleWorkmailActionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnTemplate(
    scope: Construct,
    id: String,
    block: CfnTemplateDsl.() -> Unit = {},
  ): CfnTemplate {
    val builder = CfnTemplateDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnTemplateProps(block: CfnTemplatePropsDsl.() -> Unit = {}): CfnTemplateProps {
    val builder = CfnTemplatePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnTemplateTemplateProperty(block: CfnTemplateTemplatePropertyDsl.() -> Unit =
      {}): CfnTemplate.TemplateProperty {
    val builder = CfnTemplateTemplatePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnVdmAttributes(
    scope: Construct,
    id: String,
    block: CfnVdmAttributesDsl.() -> Unit = {},
  ): CfnVdmAttributes {
    val builder = CfnVdmAttributesDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnVdmAttributesDashboardAttributesProperty(block: CfnVdmAttributesDashboardAttributesPropertyDsl.() -> Unit
      = {}): CfnVdmAttributes.DashboardAttributesProperty {
    val builder = CfnVdmAttributesDashboardAttributesPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnVdmAttributesGuardianAttributesProperty(block: CfnVdmAttributesGuardianAttributesPropertyDsl.() -> Unit
      = {}): CfnVdmAttributes.GuardianAttributesProperty {
    val builder = CfnVdmAttributesGuardianAttributesPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnVdmAttributesProps(block: CfnVdmAttributesPropsDsl.() -> Unit = {}):
      CfnVdmAttributesProps {
    val builder = CfnVdmAttributesPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cloudWatchDimension(block: CloudWatchDimensionDsl.() -> Unit = {}):
      CloudWatchDimension {
    val builder = CloudWatchDimensionDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun configurationSet(
    scope: Construct,
    id: String,
    block: ConfigurationSetDsl.() -> Unit = {},
  ): ConfigurationSet {
    val builder = ConfigurationSetDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun configurationSetEventDestination(
    scope: Construct,
    id: String,
    block: ConfigurationSetEventDestinationDsl.() -> Unit = {},
  ): ConfigurationSetEventDestination {
    val builder = ConfigurationSetEventDestinationDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun configurationSetEventDestinationOptions(block: ConfigurationSetEventDestinationOptionsDsl.() -> Unit
      = {}): ConfigurationSetEventDestinationOptions {
    val builder = ConfigurationSetEventDestinationOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun configurationSetEventDestinationProps(block: ConfigurationSetEventDestinationPropsDsl.() -> Unit
      = {}): ConfigurationSetEventDestinationProps {
    val builder = ConfigurationSetEventDestinationPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun configurationSetProps(block: ConfigurationSetPropsDsl.() -> Unit = {}):
      ConfigurationSetProps {
    val builder = ConfigurationSetPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun dedicatedIpPool(
    scope: Construct,
    id: String,
    block: DedicatedIpPoolDsl.() -> Unit = {},
  ): DedicatedIpPool {
    val builder = DedicatedIpPoolDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun dedicatedIpPoolProps(block: DedicatedIpPoolPropsDsl.() -> Unit = {}):
      DedicatedIpPoolProps {
    val builder = DedicatedIpPoolPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun dkimIdentityConfig(block: DkimIdentityConfigDsl.() -> Unit = {}):
      DkimIdentityConfig {
    val builder = DkimIdentityConfigDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun dkimRecord(block: DkimRecordDsl.() -> Unit = {}): DkimRecord {
    val builder = DkimRecordDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun dropSpamReceiptRule(
    scope: Construct,
    id: String,
    block: DropSpamReceiptRuleDsl.() -> Unit = {},
  ): DropSpamReceiptRule {
    val builder = DropSpamReceiptRuleDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun dropSpamReceiptRuleProps(block: DropSpamReceiptRulePropsDsl.() -> Unit = {}):
      DropSpamReceiptRuleProps {
    val builder = DropSpamReceiptRulePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun emailIdentity(
    scope: Construct,
    id: String,
    block: EmailIdentityDsl.() -> Unit = {},
  ): EmailIdentity {
    val builder = EmailIdentityDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun emailIdentityProps(block: EmailIdentityPropsDsl.() -> Unit = {}):
      EmailIdentityProps {
    val builder = EmailIdentityPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun lambdaActionConfig(block: LambdaActionConfigDsl.() -> Unit = {}):
      LambdaActionConfig {
    val builder = LambdaActionConfigDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun receiptFilter(
    scope: Construct,
    id: String,
    block: ReceiptFilterDsl.() -> Unit = {},
  ): ReceiptFilter {
    val builder = ReceiptFilterDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun receiptFilterProps(block: ReceiptFilterPropsDsl.() -> Unit = {}):
      ReceiptFilterProps {
    val builder = ReceiptFilterPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun receiptRule(
    scope: Construct,
    id: String,
    block: ReceiptRuleDsl.() -> Unit = {},
  ): ReceiptRule {
    val builder = ReceiptRuleDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun receiptRuleActionConfig(block: ReceiptRuleActionConfigDsl.() -> Unit = {}):
      ReceiptRuleActionConfig {
    val builder = ReceiptRuleActionConfigDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun receiptRuleOptions(block: ReceiptRuleOptionsDsl.() -> Unit = {}):
      ReceiptRuleOptions {
    val builder = ReceiptRuleOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun receiptRuleProps(block: ReceiptRulePropsDsl.() -> Unit = {}): ReceiptRuleProps {
    val builder = ReceiptRulePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun receiptRuleSet(
    scope: Construct,
    id: String,
    block: ReceiptRuleSetDsl.() -> Unit = {},
  ): ReceiptRuleSet {
    val builder = ReceiptRuleSetDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun receiptRuleSetProps(block: ReceiptRuleSetPropsDsl.() -> Unit = {}):
      ReceiptRuleSetProps {
    val builder = ReceiptRuleSetPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun s3ActionConfig(block: S3ActionConfigDsl.() -> Unit = {}): S3ActionConfig {
    val builder = S3ActionConfigDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun sNSActionConfig(block: SNSActionConfigDsl.() -> Unit = {}): SNSActionConfig {
    val builder = SNSActionConfigDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun stopActionConfig(block: StopActionConfigDsl.() -> Unit = {}): StopActionConfig {
    val builder = StopActionConfigDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun vdmAttributes(
    scope: Construct,
    id: String,
    block: VdmAttributesDsl.() -> Unit = {},
  ): VdmAttributes {
    val builder = VdmAttributesDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun vdmAttributesProps(block: VdmAttributesPropsDsl.() -> Unit = {}):
      VdmAttributesProps {
    val builder = VdmAttributesPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun workmailActionConfig(block: WorkmailActionConfigDsl.() -> Unit = {}):
      WorkmailActionConfig {
    val builder = WorkmailActionConfigDsl()
    builder.apply(block)
    return builder.build()
  }
}
