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

  public fun action(action: IResolvable) {
    cdkBuilder.action(action)
  }

  public fun action(action: CfnRuleGroup.RuleActionProperty) {
    cdkBuilder.action(action)
  }

  public fun captchaConfig(captchaConfig: IResolvable) {
    cdkBuilder.captchaConfig(captchaConfig)
  }

  public fun captchaConfig(captchaConfig: CfnRuleGroup.CaptchaConfigProperty) {
    cdkBuilder.captchaConfig(captchaConfig)
  }

  public fun challengeConfig(challengeConfig: IResolvable) {
    cdkBuilder.challengeConfig(challengeConfig)
  }

  public fun challengeConfig(challengeConfig: CfnRuleGroup.ChallengeConfigProperty) {
    cdkBuilder.challengeConfig(challengeConfig)
  }

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun priority(priority: Number) {
    cdkBuilder.priority(priority)
  }

  public fun ruleLabels(vararg ruleLabels: Any) {
    _ruleLabels.addAll(listOf(*ruleLabels))
  }

  public fun ruleLabels(ruleLabels: Collection<Any>) {
    _ruleLabels.addAll(ruleLabels)
  }

  public fun ruleLabels(ruleLabels: IResolvable) {
    cdkBuilder.ruleLabels(ruleLabels)
  }

  public fun statement(statement: IResolvable) {
    cdkBuilder.statement(statement)
  }

  public fun statement(statement: CfnRuleGroup.StatementProperty) {
    cdkBuilder.statement(statement)
  }

  public fun visibilityConfig(visibilityConfig: IResolvable) {
    cdkBuilder.visibilityConfig(visibilityConfig)
  }

  public fun visibilityConfig(visibilityConfig: CfnRuleGroup.VisibilityConfigProperty) {
    cdkBuilder.visibilityConfig(visibilityConfig)
  }

  public fun build(): CfnRuleGroup.RuleProperty {
    if(_ruleLabels.isNotEmpty()) cdkBuilder.ruleLabels(_ruleLabels)
    return cdkBuilder.build()
  }
}
