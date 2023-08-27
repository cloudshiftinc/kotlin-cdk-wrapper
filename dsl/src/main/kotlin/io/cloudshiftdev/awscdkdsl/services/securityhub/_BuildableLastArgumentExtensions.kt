@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.securityhub

import kotlin.Unit
import software.amazon.awscdk.services.securityhub.CfnAutomationRule

/**
 * A set of
 * [AWS Security Finding Format (ASFF)](https://docs.aws.amazon.com/securityhub/latest/userguide/securityhub-findings-format.html)
 * finding field attributes and corresponding expected values that Security Hub uses to filter
 * findings. If a rule is enabled and a finding matches the criteria specified in this parameter,
 * Security Hub applies the rule action to the finding.
 */
public inline fun CfnAutomationRule.setCriteria(
    block: CfnAutomationRuleAutomationRulesFindingFiltersPropertyDsl.() -> Unit = {}
) {
    val builder = CfnAutomationRuleAutomationRulesFindingFiltersPropertyDsl()
    builder.apply(block)
    return setCriteria(builder.build())
}
