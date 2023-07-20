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

package cloudshift.awscdk.dsl.services.ses

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ses.CfnReceiptRule
import software.amazon.awscdk.services.ses.CfnReceiptRuleProps
import kotlin.String

@CdkDslMarker
public class CfnReceiptRulePropsDsl {
    private val cdkBuilder: CfnReceiptRuleProps.Builder = CfnReceiptRuleProps.builder()

    public fun after(after: String) {
        cdkBuilder.after(after)
    }

    public fun rule(rule: IResolvable) {
        cdkBuilder.rule(rule)
    }

    public fun rule(rule: CfnReceiptRule.RuleProperty) {
        cdkBuilder.rule(rule)
    }

    public fun ruleSetName(ruleSetName: String) {
        cdkBuilder.ruleSetName(ruleSetName)
    }

    public fun build(): CfnReceiptRuleProps = cdkBuilder.build()
}
