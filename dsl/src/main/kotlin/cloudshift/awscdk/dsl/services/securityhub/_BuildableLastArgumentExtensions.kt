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

package cloudshift.awscdk.dsl.services.securityhub

import software.amazon.awscdk.services.securityhub.CfnAutomationRule
import kotlin.Unit

public inline fun CfnAutomationRule.setCriteria(
    block: CfnAutomationRuleAutomationRulesFindingFiltersPropertyDsl.() -> Unit =
        {},
) {
    val builder = CfnAutomationRuleAutomationRulesFindingFiltersPropertyDsl()
    builder.apply(block)
    return setCriteria(builder.build())
}
