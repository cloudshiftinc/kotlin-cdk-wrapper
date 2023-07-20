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

  public fun excludedRules(vararg excludedRules: Any) {
    _excludedRules.addAll(listOf(*excludedRules))
  }

  public fun excludedRules(excludedRules: Collection<Any>) {
    _excludedRules.addAll(excludedRules)
  }

  public fun excludedRules(excludedRules: IResolvable) {
    cdkBuilder.excludedRules(excludedRules)
  }

  public fun managedRuleGroupConfigs(vararg managedRuleGroupConfigs: Any) {
    _managedRuleGroupConfigs.addAll(listOf(*managedRuleGroupConfigs))
  }

  public fun managedRuleGroupConfigs(managedRuleGroupConfigs: Collection<Any>) {
    _managedRuleGroupConfigs.addAll(managedRuleGroupConfigs)
  }

  public fun managedRuleGroupConfigs(managedRuleGroupConfigs: IResolvable) {
    cdkBuilder.managedRuleGroupConfigs(managedRuleGroupConfigs)
  }

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun ruleActionOverrides(vararg ruleActionOverrides: Any) {
    _ruleActionOverrides.addAll(listOf(*ruleActionOverrides))
  }

  public fun ruleActionOverrides(ruleActionOverrides: Collection<Any>) {
    _ruleActionOverrides.addAll(ruleActionOverrides)
  }

  public fun ruleActionOverrides(ruleActionOverrides: IResolvable) {
    cdkBuilder.ruleActionOverrides(ruleActionOverrides)
  }

  public fun scopeDownStatement(scopeDownStatement: IResolvable) {
    cdkBuilder.scopeDownStatement(scopeDownStatement)
  }

  public fun scopeDownStatement(scopeDownStatement: CfnWebACL.StatementProperty) {
    cdkBuilder.scopeDownStatement(scopeDownStatement)
  }

  public fun vendorName(vendorName: String) {
    cdkBuilder.vendorName(vendorName)
  }

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
