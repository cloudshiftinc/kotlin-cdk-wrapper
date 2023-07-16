@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.wafv2

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.wafv2.CfnIPSet
import software.amazon.awscdk.services.wafv2.CfnIPSetProps
import software.amazon.awscdk.services.wafv2.CfnLoggingConfiguration
import software.amazon.awscdk.services.wafv2.CfnLoggingConfigurationProps
import software.amazon.awscdk.services.wafv2.CfnRegexPatternSet
import software.amazon.awscdk.services.wafv2.CfnRegexPatternSetProps
import software.amazon.awscdk.services.wafv2.CfnRuleGroup
import software.amazon.awscdk.services.wafv2.CfnRuleGroupProps
import software.amazon.awscdk.services.wafv2.CfnWebACL
import software.amazon.awscdk.services.wafv2.CfnWebACLAssociation
import software.amazon.awscdk.services.wafv2.CfnWebACLAssociationProps
import software.amazon.awscdk.services.wafv2.CfnWebACLProps
import software.constructs.Construct

public object wafv2 {
  public inline fun cfnIPSet(
    scope: Construct,
    id: String,
    block: CfnIPSetDsl.() -> Unit = {},
  ): CfnIPSet {
    val builder = CfnIPSetDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnIPSetProps(block: CfnIPSetPropsDsl.() -> Unit = {}): CfnIPSetProps {
    val builder = CfnIPSetPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnLoggingConfiguration(
    scope: Construct,
    id: String,
    block: CfnLoggingConfigurationDsl.() -> Unit = {},
  ): CfnLoggingConfiguration {
    val builder = CfnLoggingConfigurationDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnLoggingConfigurationActionConditionProperty(block: CfnLoggingConfigurationActionConditionPropertyDsl.() -> Unit
      = {}): CfnLoggingConfiguration.ActionConditionProperty {
    val builder = CfnLoggingConfigurationActionConditionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnLoggingConfigurationConditionProperty(block: CfnLoggingConfigurationConditionPropertyDsl.() -> Unit
      = {}): CfnLoggingConfiguration.ConditionProperty {
    val builder = CfnLoggingConfigurationConditionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnLoggingConfigurationFieldToMatchProperty(block: CfnLoggingConfigurationFieldToMatchPropertyDsl.() -> Unit
      = {}): CfnLoggingConfiguration.FieldToMatchProperty {
    val builder = CfnLoggingConfigurationFieldToMatchPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnLoggingConfigurationFilterProperty(block: CfnLoggingConfigurationFilterPropertyDsl.() -> Unit
      = {}): CfnLoggingConfiguration.FilterProperty {
    val builder = CfnLoggingConfigurationFilterPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnLoggingConfigurationJsonBodyProperty(block: CfnLoggingConfigurationJsonBodyPropertyDsl.() -> Unit
      = {}): CfnLoggingConfiguration.JsonBodyProperty {
    val builder = CfnLoggingConfigurationJsonBodyPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnLoggingConfigurationLabelNameConditionProperty(block: CfnLoggingConfigurationLabelNameConditionPropertyDsl.() -> Unit
      = {}): CfnLoggingConfiguration.LabelNameConditionProperty {
    val builder = CfnLoggingConfigurationLabelNameConditionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnLoggingConfigurationLoggingFilterProperty(block: CfnLoggingConfigurationLoggingFilterPropertyDsl.() -> Unit
      = {}): CfnLoggingConfiguration.LoggingFilterProperty {
    val builder = CfnLoggingConfigurationLoggingFilterPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnLoggingConfigurationMatchPatternProperty(block: CfnLoggingConfigurationMatchPatternPropertyDsl.() -> Unit
      = {}): CfnLoggingConfiguration.MatchPatternProperty {
    val builder = CfnLoggingConfigurationMatchPatternPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnLoggingConfigurationProps(block: CfnLoggingConfigurationPropsDsl.() -> Unit =
      {}): CfnLoggingConfigurationProps {
    val builder = CfnLoggingConfigurationPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnLoggingConfigurationSingleHeaderProperty(block: CfnLoggingConfigurationSingleHeaderPropertyDsl.() -> Unit
      = {}): CfnLoggingConfiguration.SingleHeaderProperty {
    val builder = CfnLoggingConfigurationSingleHeaderPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnRegexPatternSet(
    scope: Construct,
    id: String,
    block: CfnRegexPatternSetDsl.() -> Unit = {},
  ): CfnRegexPatternSet {
    val builder = CfnRegexPatternSetDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnRegexPatternSetProps(block: CfnRegexPatternSetPropsDsl.() -> Unit = {}):
      CfnRegexPatternSetProps {
    val builder = CfnRegexPatternSetPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnRuleGroup(
    scope: Construct,
    id: String,
    block: CfnRuleGroupDsl.() -> Unit = {},
  ): CfnRuleGroup {
    val builder = CfnRuleGroupDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnRuleGroupAllowProperty(block: CfnRuleGroupAllowPropertyDsl.() -> Unit = {}):
      CfnRuleGroup.AllowProperty {
    val builder = CfnRuleGroupAllowPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnRuleGroupAndStatementProperty(block: CfnRuleGroupAndStatementPropertyDsl.() -> Unit =
      {}): CfnRuleGroup.AndStatementProperty {
    val builder = CfnRuleGroupAndStatementPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnRuleGroupBlockProperty(block: CfnRuleGroupBlockPropertyDsl.() -> Unit = {}):
      CfnRuleGroup.BlockProperty {
    val builder = CfnRuleGroupBlockPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnRuleGroupBodyProperty(block: CfnRuleGroupBodyPropertyDsl.() -> Unit = {}):
      CfnRuleGroup.BodyProperty {
    val builder = CfnRuleGroupBodyPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnRuleGroupByteMatchStatementProperty(block: CfnRuleGroupByteMatchStatementPropertyDsl.() -> Unit
      = {}): CfnRuleGroup.ByteMatchStatementProperty {
    val builder = CfnRuleGroupByteMatchStatementPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnRuleGroupCaptchaConfigProperty(block: CfnRuleGroupCaptchaConfigPropertyDsl.() -> Unit =
      {}): CfnRuleGroup.CaptchaConfigProperty {
    val builder = CfnRuleGroupCaptchaConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnRuleGroupCaptchaProperty(block: CfnRuleGroupCaptchaPropertyDsl.() -> Unit =
      {}): CfnRuleGroup.CaptchaProperty {
    val builder = CfnRuleGroupCaptchaPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnRuleGroupChallengeConfigProperty(block: CfnRuleGroupChallengeConfigPropertyDsl.() -> Unit
      = {}): CfnRuleGroup.ChallengeConfigProperty {
    val builder = CfnRuleGroupChallengeConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnRuleGroupChallengeProperty(block: CfnRuleGroupChallengePropertyDsl.() -> Unit
      = {}): CfnRuleGroup.ChallengeProperty {
    val builder = CfnRuleGroupChallengePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnRuleGroupCookieMatchPatternProperty(block: CfnRuleGroupCookieMatchPatternPropertyDsl.() -> Unit
      = {}): CfnRuleGroup.CookieMatchPatternProperty {
    val builder = CfnRuleGroupCookieMatchPatternPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnRuleGroupCookiesProperty(block: CfnRuleGroupCookiesPropertyDsl.() -> Unit =
      {}): CfnRuleGroup.CookiesProperty {
    val builder = CfnRuleGroupCookiesPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnRuleGroupCountProperty(block: CfnRuleGroupCountPropertyDsl.() -> Unit = {}):
      CfnRuleGroup.CountProperty {
    val builder = CfnRuleGroupCountPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnRuleGroupCustomHTTPHeaderProperty(block: CfnRuleGroupCustomHTTPHeaderPropertyDsl.() -> Unit
      = {}): CfnRuleGroup.CustomHTTPHeaderProperty {
    val builder = CfnRuleGroupCustomHTTPHeaderPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnRuleGroupCustomRequestHandlingProperty(block: CfnRuleGroupCustomRequestHandlingPropertyDsl.() -> Unit
      = {}): CfnRuleGroup.CustomRequestHandlingProperty {
    val builder = CfnRuleGroupCustomRequestHandlingPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnRuleGroupCustomResponseBodyProperty(block: CfnRuleGroupCustomResponseBodyPropertyDsl.() -> Unit
      = {}): CfnRuleGroup.CustomResponseBodyProperty {
    val builder = CfnRuleGroupCustomResponseBodyPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnRuleGroupCustomResponseProperty(block: CfnRuleGroupCustomResponsePropertyDsl.() -> Unit
      = {}): CfnRuleGroup.CustomResponseProperty {
    val builder = CfnRuleGroupCustomResponsePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnRuleGroupFieldToMatchProperty(block: CfnRuleGroupFieldToMatchPropertyDsl.() -> Unit =
      {}): CfnRuleGroup.FieldToMatchProperty {
    val builder = CfnRuleGroupFieldToMatchPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnRuleGroupForwardedIPConfigurationProperty(block: CfnRuleGroupForwardedIPConfigurationPropertyDsl.() -> Unit
      = {}): CfnRuleGroup.ForwardedIPConfigurationProperty {
    val builder = CfnRuleGroupForwardedIPConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnRuleGroupGeoMatchStatementProperty(block: CfnRuleGroupGeoMatchStatementPropertyDsl.() -> Unit
      = {}): CfnRuleGroup.GeoMatchStatementProperty {
    val builder = CfnRuleGroupGeoMatchStatementPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnRuleGroupHeaderMatchPatternProperty(block: CfnRuleGroupHeaderMatchPatternPropertyDsl.() -> Unit
      = {}): CfnRuleGroup.HeaderMatchPatternProperty {
    val builder = CfnRuleGroupHeaderMatchPatternPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnRuleGroupHeadersProperty(block: CfnRuleGroupHeadersPropertyDsl.() -> Unit =
      {}): CfnRuleGroup.HeadersProperty {
    val builder = CfnRuleGroupHeadersPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnRuleGroupIPSetForwardedIPConfigurationProperty(block: CfnRuleGroupIPSetForwardedIPConfigurationPropertyDsl.() -> Unit
      = {}): CfnRuleGroup.IPSetForwardedIPConfigurationProperty {
    val builder = CfnRuleGroupIPSetForwardedIPConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnRuleGroupIPSetReferenceStatementProperty(block: CfnRuleGroupIPSetReferenceStatementPropertyDsl.() -> Unit
      = {}): CfnRuleGroup.IPSetReferenceStatementProperty {
    val builder = CfnRuleGroupIPSetReferenceStatementPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnRuleGroupImmunityTimePropertyProperty(block: CfnRuleGroupImmunityTimePropertyPropertyDsl.() -> Unit
      = {}): CfnRuleGroup.ImmunityTimePropertyProperty {
    val builder = CfnRuleGroupImmunityTimePropertyPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnRuleGroupJsonBodyProperty(block: CfnRuleGroupJsonBodyPropertyDsl.() -> Unit =
      {}): CfnRuleGroup.JsonBodyProperty {
    val builder = CfnRuleGroupJsonBodyPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnRuleGroupJsonMatchPatternProperty(block: CfnRuleGroupJsonMatchPatternPropertyDsl.() -> Unit
      = {}): CfnRuleGroup.JsonMatchPatternProperty {
    val builder = CfnRuleGroupJsonMatchPatternPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnRuleGroupLabelMatchStatementProperty(block: CfnRuleGroupLabelMatchStatementPropertyDsl.() -> Unit
      = {}): CfnRuleGroup.LabelMatchStatementProperty {
    val builder = CfnRuleGroupLabelMatchStatementPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnRuleGroupLabelProperty(block: CfnRuleGroupLabelPropertyDsl.() -> Unit = {}):
      CfnRuleGroup.LabelProperty {
    val builder = CfnRuleGroupLabelPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnRuleGroupLabelSummaryProperty(block: CfnRuleGroupLabelSummaryPropertyDsl.() -> Unit =
      {}): CfnRuleGroup.LabelSummaryProperty {
    val builder = CfnRuleGroupLabelSummaryPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnRuleGroupNotStatementProperty(block: CfnRuleGroupNotStatementPropertyDsl.() -> Unit =
      {}): CfnRuleGroup.NotStatementProperty {
    val builder = CfnRuleGroupNotStatementPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnRuleGroupOrStatementProperty(block: CfnRuleGroupOrStatementPropertyDsl.() -> Unit =
      {}): CfnRuleGroup.OrStatementProperty {
    val builder = CfnRuleGroupOrStatementPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnRuleGroupProps(block: CfnRuleGroupPropsDsl.() -> Unit = {}):
      CfnRuleGroupProps {
    val builder = CfnRuleGroupPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnRuleGroupRateBasedStatementProperty(block: CfnRuleGroupRateBasedStatementPropertyDsl.() -> Unit
      = {}): CfnRuleGroup.RateBasedStatementProperty {
    val builder = CfnRuleGroupRateBasedStatementPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnRuleGroupRegexMatchStatementProperty(block: CfnRuleGroupRegexMatchStatementPropertyDsl.() -> Unit
      = {}): CfnRuleGroup.RegexMatchStatementProperty {
    val builder = CfnRuleGroupRegexMatchStatementPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnRuleGroupRegexPatternSetReferenceStatementProperty(block: CfnRuleGroupRegexPatternSetReferenceStatementPropertyDsl.() -> Unit
      = {}): CfnRuleGroup.RegexPatternSetReferenceStatementProperty {
    val builder = CfnRuleGroupRegexPatternSetReferenceStatementPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnRuleGroupRuleActionProperty(block: CfnRuleGroupRuleActionPropertyDsl.() -> Unit = {}):
      CfnRuleGroup.RuleActionProperty {
    val builder = CfnRuleGroupRuleActionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnRuleGroupRuleProperty(block: CfnRuleGroupRulePropertyDsl.() -> Unit = {}):
      CfnRuleGroup.RuleProperty {
    val builder = CfnRuleGroupRulePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnRuleGroupSingleHeaderProperty(block: CfnRuleGroupSingleHeaderPropertyDsl.() -> Unit =
      {}): CfnRuleGroup.SingleHeaderProperty {
    val builder = CfnRuleGroupSingleHeaderPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnRuleGroupSingleQueryArgumentProperty(block: CfnRuleGroupSingleQueryArgumentPropertyDsl.() -> Unit
      = {}): CfnRuleGroup.SingleQueryArgumentProperty {
    val builder = CfnRuleGroupSingleQueryArgumentPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnRuleGroupSizeConstraintStatementProperty(block: CfnRuleGroupSizeConstraintStatementPropertyDsl.() -> Unit
      = {}): CfnRuleGroup.SizeConstraintStatementProperty {
    val builder = CfnRuleGroupSizeConstraintStatementPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnRuleGroupSqliMatchStatementProperty(block: CfnRuleGroupSqliMatchStatementPropertyDsl.() -> Unit
      = {}): CfnRuleGroup.SqliMatchStatementProperty {
    val builder = CfnRuleGroupSqliMatchStatementPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnRuleGroupStatementProperty(block: CfnRuleGroupStatementPropertyDsl.() -> Unit
      = {}): CfnRuleGroup.StatementProperty {
    val builder = CfnRuleGroupStatementPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnRuleGroupTextTransformationProperty(block: CfnRuleGroupTextTransformationPropertyDsl.() -> Unit
      = {}): CfnRuleGroup.TextTransformationProperty {
    val builder = CfnRuleGroupTextTransformationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnRuleGroupVisibilityConfigProperty(block: CfnRuleGroupVisibilityConfigPropertyDsl.() -> Unit
      = {}): CfnRuleGroup.VisibilityConfigProperty {
    val builder = CfnRuleGroupVisibilityConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnRuleGroupXssMatchStatementProperty(block: CfnRuleGroupXssMatchStatementPropertyDsl.() -> Unit
      = {}): CfnRuleGroup.XssMatchStatementProperty {
    val builder = CfnRuleGroupXssMatchStatementPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnWebACL(
    scope: Construct,
    id: String,
    block: CfnWebACLDsl.() -> Unit = {},
  ): CfnWebACL {
    val builder = CfnWebACLDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnWebACLAWSManagedRulesATPRuleSetProperty(block: CfnWebACLAWSManagedRulesATPRuleSetPropertyDsl.() -> Unit
      = {}): CfnWebACL.AWSManagedRulesATPRuleSetProperty {
    val builder = CfnWebACLAWSManagedRulesATPRuleSetPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnWebACLAWSManagedRulesBotControlRuleSetProperty(block: CfnWebACLAWSManagedRulesBotControlRuleSetPropertyDsl.() -> Unit
      = {}): CfnWebACL.AWSManagedRulesBotControlRuleSetProperty {
    val builder = CfnWebACLAWSManagedRulesBotControlRuleSetPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnWebACLAllowActionProperty(block: CfnWebACLAllowActionPropertyDsl.() -> Unit =
      {}): CfnWebACL.AllowActionProperty {
    val builder = CfnWebACLAllowActionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnWebACLAndStatementProperty(block: CfnWebACLAndStatementPropertyDsl.() -> Unit
      = {}): CfnWebACL.AndStatementProperty {
    val builder = CfnWebACLAndStatementPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnWebACLAssociation(
    scope: Construct,
    id: String,
    block: CfnWebACLAssociationDsl.() -> Unit = {},
  ): CfnWebACLAssociation {
    val builder = CfnWebACLAssociationDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnWebACLAssociationConfigProperty(block: CfnWebACLAssociationConfigPropertyDsl.() -> Unit
      = {}): CfnWebACL.AssociationConfigProperty {
    val builder = CfnWebACLAssociationConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnWebACLAssociationProps(block: CfnWebACLAssociationPropsDsl.() -> Unit = {}):
      CfnWebACLAssociationProps {
    val builder = CfnWebACLAssociationPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnWebACLBlockActionProperty(block: CfnWebACLBlockActionPropertyDsl.() -> Unit =
      {}): CfnWebACL.BlockActionProperty {
    val builder = CfnWebACLBlockActionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnWebACLBodyProperty(block: CfnWebACLBodyPropertyDsl.() -> Unit = {}):
      CfnWebACL.BodyProperty {
    val builder = CfnWebACLBodyPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnWebACLByteMatchStatementProperty(block: CfnWebACLByteMatchStatementPropertyDsl.() -> Unit
      = {}): CfnWebACL.ByteMatchStatementProperty {
    val builder = CfnWebACLByteMatchStatementPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnWebACLCaptchaActionProperty(block: CfnWebACLCaptchaActionPropertyDsl.() -> Unit = {}):
      CfnWebACL.CaptchaActionProperty {
    val builder = CfnWebACLCaptchaActionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnWebACLCaptchaConfigProperty(block: CfnWebACLCaptchaConfigPropertyDsl.() -> Unit = {}):
      CfnWebACL.CaptchaConfigProperty {
    val builder = CfnWebACLCaptchaConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnWebACLChallengeActionProperty(block: CfnWebACLChallengeActionPropertyDsl.() -> Unit =
      {}): CfnWebACL.ChallengeActionProperty {
    val builder = CfnWebACLChallengeActionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnWebACLChallengeConfigProperty(block: CfnWebACLChallengeConfigPropertyDsl.() -> Unit =
      {}): CfnWebACL.ChallengeConfigProperty {
    val builder = CfnWebACLChallengeConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnWebACLCookieMatchPatternProperty(block: CfnWebACLCookieMatchPatternPropertyDsl.() -> Unit
      = {}): CfnWebACL.CookieMatchPatternProperty {
    val builder = CfnWebACLCookieMatchPatternPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnWebACLCookiesProperty(block: CfnWebACLCookiesPropertyDsl.() -> Unit = {}):
      CfnWebACL.CookiesProperty {
    val builder = CfnWebACLCookiesPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnWebACLCountActionProperty(block: CfnWebACLCountActionPropertyDsl.() -> Unit =
      {}): CfnWebACL.CountActionProperty {
    val builder = CfnWebACLCountActionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnWebACLCustomHTTPHeaderProperty(block: CfnWebACLCustomHTTPHeaderPropertyDsl.() -> Unit =
      {}): CfnWebACL.CustomHTTPHeaderProperty {
    val builder = CfnWebACLCustomHTTPHeaderPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnWebACLCustomRequestHandlingProperty(block: CfnWebACLCustomRequestHandlingPropertyDsl.() -> Unit
      = {}): CfnWebACL.CustomRequestHandlingProperty {
    val builder = CfnWebACLCustomRequestHandlingPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnWebACLCustomResponseBodyProperty(block: CfnWebACLCustomResponseBodyPropertyDsl.() -> Unit
      = {}): CfnWebACL.CustomResponseBodyProperty {
    val builder = CfnWebACLCustomResponseBodyPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnWebACLCustomResponseProperty(block: CfnWebACLCustomResponsePropertyDsl.() -> Unit =
      {}): CfnWebACL.CustomResponseProperty {
    val builder = CfnWebACLCustomResponsePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnWebACLDefaultActionProperty(block: CfnWebACLDefaultActionPropertyDsl.() -> Unit = {}):
      CfnWebACL.DefaultActionProperty {
    val builder = CfnWebACLDefaultActionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnWebACLExcludedRuleProperty(block: CfnWebACLExcludedRulePropertyDsl.() -> Unit
      = {}): CfnWebACL.ExcludedRuleProperty {
    val builder = CfnWebACLExcludedRulePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnWebACLFieldIdentifierProperty(block: CfnWebACLFieldIdentifierPropertyDsl.() -> Unit =
      {}): CfnWebACL.FieldIdentifierProperty {
    val builder = CfnWebACLFieldIdentifierPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnWebACLFieldToMatchProperty(block: CfnWebACLFieldToMatchPropertyDsl.() -> Unit
      = {}): CfnWebACL.FieldToMatchProperty {
    val builder = CfnWebACLFieldToMatchPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnWebACLForwardedIPConfigurationProperty(block: CfnWebACLForwardedIPConfigurationPropertyDsl.() -> Unit
      = {}): CfnWebACL.ForwardedIPConfigurationProperty {
    val builder = CfnWebACLForwardedIPConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnWebACLGeoMatchStatementProperty(block: CfnWebACLGeoMatchStatementPropertyDsl.() -> Unit
      = {}): CfnWebACL.GeoMatchStatementProperty {
    val builder = CfnWebACLGeoMatchStatementPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnWebACLHeaderMatchPatternProperty(block: CfnWebACLHeaderMatchPatternPropertyDsl.() -> Unit
      = {}): CfnWebACL.HeaderMatchPatternProperty {
    val builder = CfnWebACLHeaderMatchPatternPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnWebACLHeadersProperty(block: CfnWebACLHeadersPropertyDsl.() -> Unit = {}):
      CfnWebACL.HeadersProperty {
    val builder = CfnWebACLHeadersPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnWebACLIPSetForwardedIPConfigurationProperty(block: CfnWebACLIPSetForwardedIPConfigurationPropertyDsl.() -> Unit
      = {}): CfnWebACL.IPSetForwardedIPConfigurationProperty {
    val builder = CfnWebACLIPSetForwardedIPConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnWebACLIPSetReferenceStatementProperty(block: CfnWebACLIPSetReferenceStatementPropertyDsl.() -> Unit
      = {}): CfnWebACL.IPSetReferenceStatementProperty {
    val builder = CfnWebACLIPSetReferenceStatementPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnWebACLImmunityTimePropertyProperty(block: CfnWebACLImmunityTimePropertyPropertyDsl.() -> Unit
      = {}): CfnWebACL.ImmunityTimePropertyProperty {
    val builder = CfnWebACLImmunityTimePropertyPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnWebACLJsonBodyProperty(block: CfnWebACLJsonBodyPropertyDsl.() -> Unit = {}):
      CfnWebACL.JsonBodyProperty {
    val builder = CfnWebACLJsonBodyPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnWebACLJsonMatchPatternProperty(block: CfnWebACLJsonMatchPatternPropertyDsl.() -> Unit =
      {}): CfnWebACL.JsonMatchPatternProperty {
    val builder = CfnWebACLJsonMatchPatternPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnWebACLLabelMatchStatementProperty(block: CfnWebACLLabelMatchStatementPropertyDsl.() -> Unit
      = {}): CfnWebACL.LabelMatchStatementProperty {
    val builder = CfnWebACLLabelMatchStatementPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnWebACLLabelProperty(block: CfnWebACLLabelPropertyDsl.() -> Unit = {}):
      CfnWebACL.LabelProperty {
    val builder = CfnWebACLLabelPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnWebACLManagedRuleGroupConfigProperty(block: CfnWebACLManagedRuleGroupConfigPropertyDsl.() -> Unit
      = {}): CfnWebACL.ManagedRuleGroupConfigProperty {
    val builder = CfnWebACLManagedRuleGroupConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnWebACLManagedRuleGroupStatementProperty(block: CfnWebACLManagedRuleGroupStatementPropertyDsl.() -> Unit
      = {}): CfnWebACL.ManagedRuleGroupStatementProperty {
    val builder = CfnWebACLManagedRuleGroupStatementPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnWebACLNotStatementProperty(block: CfnWebACLNotStatementPropertyDsl.() -> Unit
      = {}): CfnWebACL.NotStatementProperty {
    val builder = CfnWebACLNotStatementPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnWebACLOrStatementProperty(block: CfnWebACLOrStatementPropertyDsl.() -> Unit =
      {}): CfnWebACL.OrStatementProperty {
    val builder = CfnWebACLOrStatementPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnWebACLOverrideActionProperty(block: CfnWebACLOverrideActionPropertyDsl.() -> Unit =
      {}): CfnWebACL.OverrideActionProperty {
    val builder = CfnWebACLOverrideActionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnWebACLProps(block: CfnWebACLPropsDsl.() -> Unit = {}): CfnWebACLProps {
    val builder = CfnWebACLPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnWebACLRateBasedStatementProperty(block: CfnWebACLRateBasedStatementPropertyDsl.() -> Unit
      = {}): CfnWebACL.RateBasedStatementProperty {
    val builder = CfnWebACLRateBasedStatementPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnWebACLRegexMatchStatementProperty(block: CfnWebACLRegexMatchStatementPropertyDsl.() -> Unit
      = {}): CfnWebACL.RegexMatchStatementProperty {
    val builder = CfnWebACLRegexMatchStatementPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnWebACLRegexPatternSetReferenceStatementProperty(block: CfnWebACLRegexPatternSetReferenceStatementPropertyDsl.() -> Unit
      = {}): CfnWebACL.RegexPatternSetReferenceStatementProperty {
    val builder = CfnWebACLRegexPatternSetReferenceStatementPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnWebACLRequestBodyAssociatedResourceTypeConfigProperty(block: CfnWebACLRequestBodyAssociatedResourceTypeConfigPropertyDsl.() -> Unit
      = {}): CfnWebACL.RequestBodyAssociatedResourceTypeConfigProperty {
    val builder = CfnWebACLRequestBodyAssociatedResourceTypeConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnWebACLRequestInspectionProperty(block: CfnWebACLRequestInspectionPropertyDsl.() -> Unit
      = {}): CfnWebACL.RequestInspectionProperty {
    val builder = CfnWebACLRequestInspectionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnWebACLResponseInspectionBodyContainsProperty(block: CfnWebACLResponseInspectionBodyContainsPropertyDsl.() -> Unit
      = {}): CfnWebACL.ResponseInspectionBodyContainsProperty {
    val builder = CfnWebACLResponseInspectionBodyContainsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnWebACLResponseInspectionHeaderProperty(block: CfnWebACLResponseInspectionHeaderPropertyDsl.() -> Unit
      = {}): CfnWebACL.ResponseInspectionHeaderProperty {
    val builder = CfnWebACLResponseInspectionHeaderPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnWebACLResponseInspectionJsonProperty(block: CfnWebACLResponseInspectionJsonPropertyDsl.() -> Unit
      = {}): CfnWebACL.ResponseInspectionJsonProperty {
    val builder = CfnWebACLResponseInspectionJsonPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnWebACLResponseInspectionProperty(block: CfnWebACLResponseInspectionPropertyDsl.() -> Unit
      = {}): CfnWebACL.ResponseInspectionProperty {
    val builder = CfnWebACLResponseInspectionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnWebACLResponseInspectionStatusCodeProperty(block: CfnWebACLResponseInspectionStatusCodePropertyDsl.() -> Unit
      = {}): CfnWebACL.ResponseInspectionStatusCodeProperty {
    val builder = CfnWebACLResponseInspectionStatusCodePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnWebACLRuleActionOverrideProperty(block: CfnWebACLRuleActionOverridePropertyDsl.() -> Unit
      = {}): CfnWebACL.RuleActionOverrideProperty {
    val builder = CfnWebACLRuleActionOverridePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnWebACLRuleActionProperty(block: CfnWebACLRuleActionPropertyDsl.() -> Unit =
      {}): CfnWebACL.RuleActionProperty {
    val builder = CfnWebACLRuleActionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnWebACLRuleGroupReferenceStatementProperty(block: CfnWebACLRuleGroupReferenceStatementPropertyDsl.() -> Unit
      = {}): CfnWebACL.RuleGroupReferenceStatementProperty {
    val builder = CfnWebACLRuleGroupReferenceStatementPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnWebACLRuleProperty(block: CfnWebACLRulePropertyDsl.() -> Unit = {}):
      CfnWebACL.RuleProperty {
    val builder = CfnWebACLRulePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnWebACLSingleHeaderProperty(block: CfnWebACLSingleHeaderPropertyDsl.() -> Unit
      = {}): CfnWebACL.SingleHeaderProperty {
    val builder = CfnWebACLSingleHeaderPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnWebACLSingleQueryArgumentProperty(block: CfnWebACLSingleQueryArgumentPropertyDsl.() -> Unit
      = {}): CfnWebACL.SingleQueryArgumentProperty {
    val builder = CfnWebACLSingleQueryArgumentPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnWebACLSizeConstraintStatementProperty(block: CfnWebACLSizeConstraintStatementPropertyDsl.() -> Unit
      = {}): CfnWebACL.SizeConstraintStatementProperty {
    val builder = CfnWebACLSizeConstraintStatementPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnWebACLSqliMatchStatementProperty(block: CfnWebACLSqliMatchStatementPropertyDsl.() -> Unit
      = {}): CfnWebACL.SqliMatchStatementProperty {
    val builder = CfnWebACLSqliMatchStatementPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnWebACLStatementProperty(block: CfnWebACLStatementPropertyDsl.() -> Unit =
      {}): CfnWebACL.StatementProperty {
    val builder = CfnWebACLStatementPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnWebACLTextTransformationProperty(block: CfnWebACLTextTransformationPropertyDsl.() -> Unit
      = {}): CfnWebACL.TextTransformationProperty {
    val builder = CfnWebACLTextTransformationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnWebACLVisibilityConfigProperty(block: CfnWebACLVisibilityConfigPropertyDsl.() -> Unit =
      {}): CfnWebACL.VisibilityConfigProperty {
    val builder = CfnWebACLVisibilityConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnWebACLXssMatchStatementProperty(block: CfnWebACLXssMatchStatementPropertyDsl.() -> Unit
      = {}): CfnWebACL.XssMatchStatementProperty {
    val builder = CfnWebACLXssMatchStatementPropertyDsl()
    builder.apply(block)
    return builder.build()
  }
}
