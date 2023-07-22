@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.wafv2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.wafv2.CfnRuleGroup

@CdkDslMarker
public class CfnRuleGroupRulePropertyDsl {
  private val cdkBuilder: CfnRuleGroup.RuleProperty.Builder = CfnRuleGroup.RuleProperty.builder()

  private val _ruleLabels: MutableList<Any> = mutableListOf()

  /**
   * @param action The action that AWS WAF should take on a web request when it matches the rule
   * statement.
   * Settings at the web ACL level can override the rule action setting.
   */
  public fun action(action: IResolvable) {
    cdkBuilder.action(action)
  }

  /**
   * @param action The action that AWS WAF should take on a web request when it matches the rule
   * statement.
   * Settings at the web ACL level can override the rule action setting.
   */
  public fun action(action: CfnRuleGroup.RuleActionProperty) {
    cdkBuilder.action(action)
  }

  /**
   * @param captchaConfig Specifies how AWS WAF should handle `CAPTCHA` evaluations.
   * If you don't specify this, AWS WAF uses the `CAPTCHA` configuration that's defined for the web
   * ACL.
   */
  public fun captchaConfig(captchaConfig: IResolvable) {
    cdkBuilder.captchaConfig(captchaConfig)
  }

  /**
   * @param captchaConfig Specifies how AWS WAF should handle `CAPTCHA` evaluations.
   * If you don't specify this, AWS WAF uses the `CAPTCHA` configuration that's defined for the web
   * ACL.
   */
  public fun captchaConfig(captchaConfig: CfnRuleGroup.CaptchaConfigProperty) {
    cdkBuilder.captchaConfig(captchaConfig)
  }

  /**
   * @param challengeConfig Specifies how AWS WAF should handle `Challenge` evaluations.
   * If you don't specify this, AWS WAF uses the challenge configuration that's defined for the web
   * ACL.
   */
  public fun challengeConfig(challengeConfig: IResolvable) {
    cdkBuilder.challengeConfig(challengeConfig)
  }

  /**
   * @param challengeConfig Specifies how AWS WAF should handle `Challenge` evaluations.
   * If you don't specify this, AWS WAF uses the challenge configuration that's defined for the web
   * ACL.
   */
  public fun challengeConfig(challengeConfig: CfnRuleGroup.ChallengeConfigProperty) {
    cdkBuilder.challengeConfig(challengeConfig)
  }

  /**
   * @param name The name of the rule. 
   * You can't change the name of a `Rule` after you create it.
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param priority If you define more than one `Rule` in a `WebACL` , AWS WAF evaluates each
   * request against the `Rules` in order based on the value of `Priority` . 
   * AWS WAF processes rules with lower priority first. The priorities don't need to be consecutive,
   * but they must all be different.
   */
  public fun priority(priority: Number) {
    cdkBuilder.priority(priority)
  }

  /**
   * @param ruleLabels Labels to apply to web requests that match the rule match statement.
   * AWS WAF applies fully qualified labels to matching web requests. A fully qualified label is the
   * concatenation of a label namespace and a rule label. The rule's rule group or web ACL defines the
   * label namespace.
   *
   * Rules that run after this rule in the web ACL can match against these labels using a
   * `LabelMatchStatement` .
   *
   * For each label, provide a case-sensitive string containing optional namespaces and a label
   * name, according to the following guidelines:
   *
   * * Separate each component of the label with a colon.
   * * Each namespace or name can have up to 128 characters.
   * * You can specify up to 5 namespaces in a label.
   * * Don't use the following reserved words in your label specification: `aws` , `waf` , `managed`
   * , `rulegroup` , `webacl` , `regexpatternset` , or `ipset` .
   *
   * For example, `myLabelName` or `nameSpace1:nameSpace2:myLabelName` .
   */
  public fun ruleLabels(vararg ruleLabels: Any) {
    _ruleLabels.addAll(listOf(*ruleLabels))
  }

  /**
   * @param ruleLabels Labels to apply to web requests that match the rule match statement.
   * AWS WAF applies fully qualified labels to matching web requests. A fully qualified label is the
   * concatenation of a label namespace and a rule label. The rule's rule group or web ACL defines the
   * label namespace.
   *
   * Rules that run after this rule in the web ACL can match against these labels using a
   * `LabelMatchStatement` .
   *
   * For each label, provide a case-sensitive string containing optional namespaces and a label
   * name, according to the following guidelines:
   *
   * * Separate each component of the label with a colon.
   * * Each namespace or name can have up to 128 characters.
   * * You can specify up to 5 namespaces in a label.
   * * Don't use the following reserved words in your label specification: `aws` , `waf` , `managed`
   * , `rulegroup` , `webacl` , `regexpatternset` , or `ipset` .
   *
   * For example, `myLabelName` or `nameSpace1:nameSpace2:myLabelName` .
   */
  public fun ruleLabels(ruleLabels: Collection<Any>) {
    _ruleLabels.addAll(ruleLabels)
  }

  /**
   * @param ruleLabels Labels to apply to web requests that match the rule match statement.
   * AWS WAF applies fully qualified labels to matching web requests. A fully qualified label is the
   * concatenation of a label namespace and a rule label. The rule's rule group or web ACL defines the
   * label namespace.
   *
   * Rules that run after this rule in the web ACL can match against these labels using a
   * `LabelMatchStatement` .
   *
   * For each label, provide a case-sensitive string containing optional namespaces and a label
   * name, according to the following guidelines:
   *
   * * Separate each component of the label with a colon.
   * * Each namespace or name can have up to 128 characters.
   * * You can specify up to 5 namespaces in a label.
   * * Don't use the following reserved words in your label specification: `aws` , `waf` , `managed`
   * , `rulegroup` , `webacl` , `regexpatternset` , or `ipset` .
   *
   * For example, `myLabelName` or `nameSpace1:nameSpace2:myLabelName` .
   */
  public fun ruleLabels(ruleLabels: IResolvable) {
    cdkBuilder.ruleLabels(ruleLabels)
  }

  /**
   * @param statement The AWS WAF processing statement for the rule, for example
   * `ByteMatchStatement` or `SizeConstraintStatement` . 
   */
  public fun statement(statement: IResolvable) {
    cdkBuilder.statement(statement)
  }

  /**
   * @param statement The AWS WAF processing statement for the rule, for example
   * `ByteMatchStatement` or `SizeConstraintStatement` . 
   */
  public fun statement(statement: CfnRuleGroup.StatementProperty) {
    cdkBuilder.statement(statement)
  }

  /**
   * @param visibilityConfig Defines and enables Amazon CloudWatch metrics and web request sample
   * collection. 
   */
  public fun visibilityConfig(visibilityConfig: IResolvable) {
    cdkBuilder.visibilityConfig(visibilityConfig)
  }

  /**
   * @param visibilityConfig Defines and enables Amazon CloudWatch metrics and web request sample
   * collection. 
   */
  public fun visibilityConfig(visibilityConfig: CfnRuleGroup.VisibilityConfigProperty) {
    cdkBuilder.visibilityConfig(visibilityConfig)
  }

  public fun build(): CfnRuleGroup.RuleProperty {
    if(_ruleLabels.isNotEmpty()) cdkBuilder.ruleLabels(_ruleLabels)
    return cdkBuilder.build()
  }
}
