@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.wafv2

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.wafv2.CfnWebACL
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnWebACLRulePropertyDsl {
    private val cdkBuilder: CfnWebACL.RuleProperty.Builder = CfnWebACL.RuleProperty.builder()

    private val _ruleLabels: MutableList<Any> = mutableListOf()

    public fun action(action: IResolvable) {
        cdkBuilder.action(action)
    }

    public fun action(action: CfnWebACL.RuleActionProperty) {
        cdkBuilder.action(action)
    }

    public fun captchaConfig(captchaConfig: IResolvable) {
        cdkBuilder.captchaConfig(captchaConfig)
    }

    public fun captchaConfig(captchaConfig: CfnWebACL.CaptchaConfigProperty) {
        cdkBuilder.captchaConfig(captchaConfig)
    }

    public fun challengeConfig(challengeConfig: IResolvable) {
        cdkBuilder.challengeConfig(challengeConfig)
    }

    public fun challengeConfig(challengeConfig: CfnWebACL.ChallengeConfigProperty) {
        cdkBuilder.challengeConfig(challengeConfig)
    }

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun overrideAction(overrideAction: IResolvable) {
        cdkBuilder.overrideAction(overrideAction)
    }

    public fun overrideAction(overrideAction: CfnWebACL.OverrideActionProperty) {
        cdkBuilder.overrideAction(overrideAction)
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

    public fun statement(statement: CfnWebACL.StatementProperty) {
        cdkBuilder.statement(statement)
    }

    public fun visibilityConfig(visibilityConfig: IResolvable) {
        cdkBuilder.visibilityConfig(visibilityConfig)
    }

    public fun visibilityConfig(visibilityConfig: CfnWebACL.VisibilityConfigProperty) {
        cdkBuilder.visibilityConfig(visibilityConfig)
    }

    public fun build(): CfnWebACL.RuleProperty {
        if (_ruleLabels.isNotEmpty()) cdkBuilder.ruleLabels(_ruleLabels)
        return cdkBuilder.build()
    }
}
