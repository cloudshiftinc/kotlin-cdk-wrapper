@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.wafv2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.wafv2.CfnWebACL

@CdkDslMarker
public class CfnWebACLManagedRuleGroupStatementPropertyDsl {
  private val cdkBuilder: CfnWebACL.ManagedRuleGroupStatementProperty.Builder =
      CfnWebACL.ManagedRuleGroupStatementProperty.builder()

  private val _excludedRules: MutableList<Any> = mutableListOf()

  private val _managedRuleGroupConfigs: MutableList<Any> = mutableListOf()

  private val _ruleActionOverrides: MutableList<Any> = mutableListOf()

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
   * @param managedRuleGroupConfigs Additional information that's used by a managed rule group. Many
   * managed rule groups don't require this.
   * Use the `AWSManagedRulesATPRuleSet` configuration object for the account takeover prevention
   * managed rule group, to provide information such as the sign-in page of your application and the
   * type of content to accept or reject from the client.
   *
   * Use the `AWSManagedRulesBotControlRuleSet` configuration object to configure the protection
   * level that you want the Bot Control rule group to use.
   */
  public fun managedRuleGroupConfigs(vararg managedRuleGroupConfigs: Any) {
    _managedRuleGroupConfigs.addAll(listOf(*managedRuleGroupConfigs))
  }

  /**
   * @param managedRuleGroupConfigs Additional information that's used by a managed rule group. Many
   * managed rule groups don't require this.
   * Use the `AWSManagedRulesATPRuleSet` configuration object for the account takeover prevention
   * managed rule group, to provide information such as the sign-in page of your application and the
   * type of content to accept or reject from the client.
   *
   * Use the `AWSManagedRulesBotControlRuleSet` configuration object to configure the protection
   * level that you want the Bot Control rule group to use.
   */
  public fun managedRuleGroupConfigs(managedRuleGroupConfigs: Collection<Any>) {
    _managedRuleGroupConfigs.addAll(managedRuleGroupConfigs)
  }

  /**
   * @param managedRuleGroupConfigs Additional information that's used by a managed rule group. Many
   * managed rule groups don't require this.
   * Use the `AWSManagedRulesATPRuleSet` configuration object for the account takeover prevention
   * managed rule group, to provide information such as the sign-in page of your application and the
   * type of content to accept or reject from the client.
   *
   * Use the `AWSManagedRulesBotControlRuleSet` configuration object to configure the protection
   * level that you want the Bot Control rule group to use.
   */
  public fun managedRuleGroupConfigs(managedRuleGroupConfigs: IResolvable) {
    cdkBuilder.managedRuleGroupConfigs(managedRuleGroupConfigs)
  }

  /**
   * @param name The name of the managed rule group. 
   * You use this, along with the vendor name, to identify the rule group.
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
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

  /**
   * @param scopeDownStatement An optional nested statement that narrows the scope of the web
   * requests that are evaluated by the managed rule group.
   * Requests are only evaluated by the rule group if they match the scope-down statement. You can
   * use any nestable `Statement` in the scope-down statement, and you can nest statements at any
   * level, the same as you can for a rule statement.
   */
  public fun scopeDownStatement(scopeDownStatement: IResolvable) {
    cdkBuilder.scopeDownStatement(scopeDownStatement)
  }

  /**
   * @param scopeDownStatement An optional nested statement that narrows the scope of the web
   * requests that are evaluated by the managed rule group.
   * Requests are only evaluated by the rule group if they match the scope-down statement. You can
   * use any nestable `Statement` in the scope-down statement, and you can nest statements at any
   * level, the same as you can for a rule statement.
   */
  public fun scopeDownStatement(scopeDownStatement: CfnWebACL.StatementProperty) {
    cdkBuilder.scopeDownStatement(scopeDownStatement)
  }

  /**
   * @param vendorName The name of the managed rule group vendor. 
   * You use this, along with the rule group name, to identify a rule group.
   */
  public fun vendorName(vendorName: String) {
    cdkBuilder.vendorName(vendorName)
  }

  /**
   * @param version The version of the managed rule group to use.
   * If you specify this, the version setting is fixed until you change it. If you don't specify
   * this, AWS WAF uses the vendor's default version, and then keeps the version at the vendor's
   * default when the vendor updates the managed rule group settings.
   */
  public fun version(version: String) {
    cdkBuilder.version(version)
  }

  public fun build(): CfnWebACL.ManagedRuleGroupStatementProperty {
    if(_excludedRules.isNotEmpty()) cdkBuilder.excludedRules(_excludedRules)
    if(_managedRuleGroupConfigs.isNotEmpty())
        cdkBuilder.managedRuleGroupConfigs(_managedRuleGroupConfigs)
    if(_ruleActionOverrides.isNotEmpty()) cdkBuilder.ruleActionOverrides(_ruleActionOverrides)
    return cdkBuilder.build()
  }
}
