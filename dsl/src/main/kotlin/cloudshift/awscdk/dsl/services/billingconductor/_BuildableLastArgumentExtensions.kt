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

package cloudshift.awscdk.dsl.services.billingconductor

import kotlin.Unit
import software.amazon.awscdk.services.billingconductor.CfnBillingGroup
import software.amazon.awscdk.services.billingconductor.CfnCustomLineItem
import software.amazon.awscdk.services.billingconductor.CfnPricingRule

/** The set of accounts that will be under the billing group. */
public inline fun CfnBillingGroup.setAccountGrouping(
    block: CfnBillingGroupAccountGroupingPropertyDsl.() -> Unit = {}
) {
    val builder = CfnBillingGroupAccountGroupingPropertyDsl()
    builder.apply(block)
    return setAccountGrouping(builder.build())
}

/**
 * The preferences and settings that will be used to compute the AWS charges for a billing group.
 */
public inline fun CfnBillingGroup.setComputationPreference(
    block: CfnBillingGroupComputationPreferencePropertyDsl.() -> Unit = {}
) {
    val builder = CfnBillingGroupComputationPreferencePropertyDsl()
    builder.apply(block)
    return setComputationPreference(builder.build())
}

/** A time range for which the custom line item is effective. */
public inline fun CfnCustomLineItem.setBillingPeriodRange(
    block: CfnCustomLineItemBillingPeriodRangePropertyDsl.() -> Unit = {}
) {
    val builder = CfnCustomLineItemBillingPeriodRangePropertyDsl()
    builder.apply(block)
    return setBillingPeriodRange(builder.build())
}

/** The charge details of a custom line item. */
public inline fun CfnCustomLineItem.setCustomLineItemChargeDetails(
    block: CfnCustomLineItemCustomLineItemChargeDetailsPropertyDsl.() -> Unit = {}
) {
    val builder = CfnCustomLineItemCustomLineItemChargeDetailsPropertyDsl()
    builder.apply(block)
    return setCustomLineItemChargeDetails(builder.build())
}

/** The set of tiering configurations for the pricing rule. */
public inline fun CfnPricingRule.setTiering(
    block: CfnPricingRuleTieringPropertyDsl.() -> Unit = {}
) {
    val builder = CfnPricingRuleTieringPropertyDsl()
    builder.apply(block)
    return setTiering(builder.build())
}
