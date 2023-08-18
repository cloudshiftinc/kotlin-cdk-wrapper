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

package io.cloudshiftdev.awscdkdsl.services.route53recoverycontrol

import kotlin.Unit
import software.amazon.awscdk.services.route53recoverycontrol.CfnSafetyRule

/**
 * An assertion rule enforces that, when you change a routing control state, that the criteria that
 * you set in the rule configuration is met.
 */
public inline fun CfnSafetyRule.setAssertionRule(
    block: CfnSafetyRuleAssertionRulePropertyDsl.() -> Unit = {}
) {
    val builder = CfnSafetyRuleAssertionRulePropertyDsl()
    builder.apply(block)
    return setAssertionRule(builder.build())
}

/**
 * A gating rule verifies that a gating routing control or set of gating routing controls, evaluates
 * as true, based on a rule configuration that you specify, which allows a set of routing control
 * state changes to complete.
 */
public inline fun CfnSafetyRule.setGatingRule(
    block: CfnSafetyRuleGatingRulePropertyDsl.() -> Unit = {}
) {
    val builder = CfnSafetyRuleGatingRulePropertyDsl()
    builder.apply(block)
    return setGatingRule(builder.build())
}

/**
 * The criteria that you set for specific assertion controls (routing controls) that designate how
 * many control states must be `ON` as the result of a transaction.
 */
public inline fun CfnSafetyRule.setRuleConfig(
    block: CfnSafetyRuleRuleConfigPropertyDsl.() -> Unit = {}
) {
    val builder = CfnSafetyRuleRuleConfigPropertyDsl()
    builder.apply(block)
    return setRuleConfig(builder.build())
}
