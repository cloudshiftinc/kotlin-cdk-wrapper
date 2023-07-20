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

package cloudshift.awscdk.dsl.services.waf

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.waf.CfnWebACL
import kotlin.Number
import kotlin.String

@CdkDslMarker
public class CfnWebACLActivatedRulePropertyDsl {
    private val cdkBuilder: CfnWebACL.ActivatedRuleProperty.Builder =
        CfnWebACL.ActivatedRuleProperty.builder()

    public fun action(action: IResolvable) {
        cdkBuilder.action(action)
    }

    public fun action(action: CfnWebACL.WafActionProperty) {
        cdkBuilder.action(action)
    }

    public fun priority(priority: Number) {
        cdkBuilder.priority(priority)
    }

    public fun ruleId(ruleId: String) {
        cdkBuilder.ruleId(ruleId)
    }

    public fun build(): CfnWebACL.ActivatedRuleProperty = cdkBuilder.build()
}
