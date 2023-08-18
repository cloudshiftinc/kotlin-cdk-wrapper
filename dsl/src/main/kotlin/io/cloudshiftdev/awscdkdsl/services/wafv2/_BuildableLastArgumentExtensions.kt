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

package io.cloudshiftdev.awscdkdsl.services.wafv2

import kotlin.Unit
import software.amazon.awscdk.services.wafv2.CfnRuleGroup
import software.amazon.awscdk.services.wafv2.CfnWebACL

/** Defines and enables Amazon CloudWatch metrics and web request sample collection. */
public inline fun CfnRuleGroup.setVisibilityConfig(
    block: CfnRuleGroupVisibilityConfigPropertyDsl.() -> Unit = {}
) {
    val builder = CfnRuleGroupVisibilityConfigPropertyDsl()
    builder.apply(block)
    return setVisibilityConfig(builder.build())
}

/**
 * Specifies custom configurations for the associations between the web ACL and protected resources.
 */
public inline fun CfnWebACL.setAssociationConfig(
    block: CfnWebACLAssociationConfigPropertyDsl.() -> Unit = {}
) {
    val builder = CfnWebACLAssociationConfigPropertyDsl()
    builder.apply(block)
    return setAssociationConfig(builder.build())
}

/**
 * Specifies how AWS WAF should handle `CAPTCHA` evaluations for rules that don't have their own
 * `CaptchaConfig` settings.
 */
public inline fun CfnWebACL.setCaptchaConfig(
    block: CfnWebACLCaptchaConfigPropertyDsl.() -> Unit = {}
) {
    val builder = CfnWebACLCaptchaConfigPropertyDsl()
    builder.apply(block)
    return setCaptchaConfig(builder.build())
}

/**
 * Specifies how AWS WAF should handle challenge evaluations for rules that don't have their own
 * `ChallengeConfig` settings.
 */
public inline fun CfnWebACL.setChallengeConfig(
    block: CfnWebACLChallengeConfigPropertyDsl.() -> Unit = {}
) {
    val builder = CfnWebACLChallengeConfigPropertyDsl()
    builder.apply(block)
    return setChallengeConfig(builder.build())
}

/** The action to perform if none of the `Rules` contained in the `WebACL` match. */
public inline fun CfnWebACL.setDefaultAction(
    block: CfnWebACLDefaultActionPropertyDsl.() -> Unit = {}
) {
    val builder = CfnWebACLDefaultActionPropertyDsl()
    builder.apply(block)
    return setDefaultAction(builder.build())
}

/** Defines and enables Amazon CloudWatch metrics and web request sample collection. */
public inline fun CfnWebACL.setVisibilityConfig(
    block: CfnWebACLVisibilityConfigPropertyDsl.() -> Unit = {}
) {
    val builder = CfnWebACLVisibilityConfigPropertyDsl()
    builder.apply(block)
    return setVisibilityConfig(builder.build())
}
