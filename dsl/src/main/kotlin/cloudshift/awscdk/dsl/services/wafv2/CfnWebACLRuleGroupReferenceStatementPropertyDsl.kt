@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.wafv2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.wafv2.CfnWebACL

/**
 * A rule statement used to run the rules that are defined in a `RuleGroup` .
 *
 * To use this, create a rule group with your rules, then provide the ARN of the rule group in this
 * statement.
 *
 * You cannot nest a `RuleGroupReferenceStatement` , for example for use inside a `NotStatement` or
 * `OrStatement` . You can only use a rule group reference statement at the top level inside a web ACL.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.wafv2.*;
 * RuleGroupReferenceStatementProperty ruleGroupReferenceStatementProperty =
 * RuleGroupReferenceStatementProperty.builder()
 * .arn("arn")
 * // the properties below are optional
 * .excludedRules(List.of(ExcludedRuleProperty.builder()
 * .name("name")
 * .build()))
 * .ruleActionOverrides(List.of(RuleActionOverrideProperty.builder()
 * .actionToUse(RuleActionProperty.builder()
 * .allow(AllowActionProperty.builder()
 * .customRequestHandling(CustomRequestHandlingProperty.builder()
 * .insertHeaders(List.of(CustomHTTPHeaderProperty.builder()
 * .name("name")
 * .value("value")
 * .build()))
 * .build())
 * .build())
 * .block(BlockActionProperty.builder()
 * .customResponse(CustomResponseProperty.builder()
 * .responseCode(123)
 * // the properties below are optional
 * .customResponseBodyKey("customResponseBodyKey")
 * .responseHeaders(List.of(CustomHTTPHeaderProperty.builder()
 * .name("name")
 * .value("value")
 * .build()))
 * .build())
 * .build())
 * .captcha(CaptchaActionProperty.builder()
 * .customRequestHandling(CustomRequestHandlingProperty.builder()
 * .insertHeaders(List.of(CustomHTTPHeaderProperty.builder()
 * .name("name")
 * .value("value")
 * .build()))
 * .build())
 * .build())
 * .challenge(ChallengeActionProperty.builder()
 * .customRequestHandling(CustomRequestHandlingProperty.builder()
 * .insertHeaders(List.of(CustomHTTPHeaderProperty.builder()
 * .name("name")
 * .value("value")
 * .build()))
 * .build())
 * .build())
 * .count(CountActionProperty.builder()
 * .customRequestHandling(CustomRequestHandlingProperty.builder()
 * .insertHeaders(List.of(CustomHTTPHeaderProperty.builder()
 * .name("name")
 * .value("value")
 * .build()))
 * .build())
 * .build())
 * .build())
 * .name("name")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-rulegroupreferencestatement.html)
 */
@CdkDslMarker
public class CfnWebACLRuleGroupReferenceStatementPropertyDsl {
  private val cdkBuilder: CfnWebACL.RuleGroupReferenceStatementProperty.Builder =
      CfnWebACL.RuleGroupReferenceStatementProperty.builder()

  private val _excludedRules: MutableList<Any> = mutableListOf()

  private val _ruleActionOverrides: MutableList<Any> = mutableListOf()

  /**
   * @param arn The Amazon Resource Name (ARN) of the entity. 
   */
  public fun arn(arn: String) {
    cdkBuilder.arn(arn)
  }

  /**
   * @param excludedRules Rules in the referenced rule group whose actions are set to `Count` .
   *
   * Instead of this option, use `RuleActionOverrides` . It accepts any valid action setting,
   * including `Count` .
   */
  public fun excludedRules(vararg excludedRules: Any) {
    _excludedRules.addAll(listOf(*excludedRules))
  }

  /**
   * @param excludedRules Rules in the referenced rule group whose actions are set to `Count` .
   *
   * Instead of this option, use `RuleActionOverrides` . It accepts any valid action setting,
   * including `Count` .
   */
  public fun excludedRules(excludedRules: Collection<Any>) {
    _excludedRules.addAll(excludedRules)
  }

  /**
   * @param excludedRules Rules in the referenced rule group whose actions are set to `Count` .
   *
   * Instead of this option, use `RuleActionOverrides` . It accepts any valid action setting,
   * including `Count` .
   */
  public fun excludedRules(excludedRules: IResolvable) {
    cdkBuilder.excludedRules(excludedRules)
  }

  /**
   * @param ruleActionOverrides Action settings to use in the place of the rule actions that are
   * configured inside the rule group.
   * You specify one override for each rule whose action you want to change.
   *
   * You can use overrides for testing, for example you can override all of rule actions to `Count`
   * and then monitor the resulting count metrics to understand how the rule group would handle your
   * web traffic. You can also permanently override some or all actions, to modify how the rule group
   * manages your web traffic.
   */
  public fun ruleActionOverrides(vararg ruleActionOverrides: Any) {
    _ruleActionOverrides.addAll(listOf(*ruleActionOverrides))
  }

  /**
   * @param ruleActionOverrides Action settings to use in the place of the rule actions that are
   * configured inside the rule group.
   * You specify one override for each rule whose action you want to change.
   *
   * You can use overrides for testing, for example you can override all of rule actions to `Count`
   * and then monitor the resulting count metrics to understand how the rule group would handle your
   * web traffic. You can also permanently override some or all actions, to modify how the rule group
   * manages your web traffic.
   */
  public fun ruleActionOverrides(ruleActionOverrides: Collection<Any>) {
    _ruleActionOverrides.addAll(ruleActionOverrides)
  }

  /**
   * @param ruleActionOverrides Action settings to use in the place of the rule actions that are
   * configured inside the rule group.
   * You specify one override for each rule whose action you want to change.
   *
   * You can use overrides for testing, for example you can override all of rule actions to `Count`
   * and then monitor the resulting count metrics to understand how the rule group would handle your
   * web traffic. You can also permanently override some or all actions, to modify how the rule group
   * manages your web traffic.
   */
  public fun ruleActionOverrides(ruleActionOverrides: IResolvable) {
    cdkBuilder.ruleActionOverrides(ruleActionOverrides)
  }

  public fun build(): CfnWebACL.RuleGroupReferenceStatementProperty {
    if(_excludedRules.isNotEmpty()) cdkBuilder.excludedRules(_excludedRules)
    if(_ruleActionOverrides.isNotEmpty()) cdkBuilder.ruleActionOverrides(_ruleActionOverrides)
    return cdkBuilder.build()
  }
}
