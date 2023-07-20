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

package cloudshift.awscdk.dsl.services.waf.regional

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.waf.regional.CfnWebACL
import kotlin.Number
import kotlin.String

@CdkDslMarker
public class CfnWebACLRulePropertyDsl {
    private val cdkBuilder: CfnWebACL.RuleProperty.Builder = CfnWebACL.RuleProperty.builder()

    public fun action(action: IResolvable) {
        cdkBuilder.action(action)
    }

    public fun action(action: CfnWebACL.ActionProperty) {
        cdkBuilder.action(action)
    }

    public fun priority(priority: Number) {
        cdkBuilder.priority(priority)
    }

    public fun ruleId(ruleId: String) {
        cdkBuilder.ruleId(ruleId)
    }

    public fun build(): CfnWebACL.RuleProperty = cdkBuilder.build()
}
