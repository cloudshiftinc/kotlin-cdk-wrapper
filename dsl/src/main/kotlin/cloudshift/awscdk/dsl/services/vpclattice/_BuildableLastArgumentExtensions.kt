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

package cloudshift.awscdk.dsl.services.vpclattice

import kotlin.Unit
import software.amazon.awscdk.services.vpclattice.CfnListener
import software.amazon.awscdk.services.vpclattice.CfnRule
import software.amazon.awscdk.services.vpclattice.CfnService
import software.amazon.awscdk.services.vpclattice.CfnServiceNetworkServiceAssociation
import software.amazon.awscdk.services.vpclattice.CfnTargetGroup

/** The action for the default rule. */
public inline fun CfnListener.setDefaultAction(
    block: CfnListenerDefaultActionPropertyDsl.() -> Unit = {}
) {
    val builder = CfnListenerDefaultActionPropertyDsl()
    builder.apply(block)
    return setDefaultAction(builder.build())
}

/** Describes the action for a rule. */
public inline fun CfnRule.setAction(block: CfnRuleActionPropertyDsl.() -> Unit = {}) {
    val builder = CfnRuleActionPropertyDsl()
    builder.apply(block)
    return setAction(builder.build())
}

/** The rule match. */
public inline fun CfnRule.setMatch(block: CfnRuleMatchPropertyDsl.() -> Unit = {}) {
    val builder = CfnRuleMatchPropertyDsl()
    builder.apply(block)
    return setMatch(builder.build())
}

/**  */
public inline fun CfnService.setDnsEntry(block: CfnServiceDnsEntryPropertyDsl.() -> Unit = {}) {
    val builder = CfnServiceDnsEntryPropertyDsl()
    builder.apply(block)
    return setDnsEntry(builder.build())
}

/**  */
public inline fun CfnServiceNetworkServiceAssociation.setDnsEntry(
    block: CfnServiceNetworkServiceAssociationDnsEntryPropertyDsl.() -> Unit = {}
) {
    val builder = CfnServiceNetworkServiceAssociationDnsEntryPropertyDsl()
    builder.apply(block)
    return setDnsEntry(builder.build())
}

/** The target group configuration. */
public inline fun CfnTargetGroup.setConfig(
    block: CfnTargetGroupTargetGroupConfigPropertyDsl.() -> Unit = {}
) {
    val builder = CfnTargetGroupTargetGroupConfigPropertyDsl()
    builder.apply(block)
    return setConfig(builder.build())
}
