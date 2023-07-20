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

package cloudshift.awscdk.dsl.services.route53recoverycontrol

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.route53recoverycontrol.CfnSafetyRule
import kotlin.Boolean
import kotlin.Number
import kotlin.String

@CdkDslMarker
public class CfnSafetyRuleRuleConfigPropertyDsl {
    private val cdkBuilder: CfnSafetyRule.RuleConfigProperty.Builder =
        CfnSafetyRule.RuleConfigProperty.builder()

    public fun inverted(inverted: Boolean) {
        cdkBuilder.inverted(inverted)
    }

    public fun inverted(inverted: IResolvable) {
        cdkBuilder.inverted(inverted)
    }

    public fun threshold(threshold: Number) {
        cdkBuilder.threshold(threshold)
    }

    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    public fun build(): CfnSafetyRule.RuleConfigProperty = cdkBuilder.build()
}
