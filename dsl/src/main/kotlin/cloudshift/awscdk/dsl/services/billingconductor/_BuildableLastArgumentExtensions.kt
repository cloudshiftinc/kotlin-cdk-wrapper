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

package cloudshift.awscdk.dsl.services.billingconductor

import software.amazon.awscdk.services.billingconductor.CfnBillingGroup
import software.amazon.awscdk.services.billingconductor.CfnCustomLineItem
import software.amazon.awscdk.services.billingconductor.CfnPricingRule
import kotlin.Unit

public inline fun CfnBillingGroup.setAccountGrouping(
    block: CfnBillingGroupAccountGroupingPropertyDsl.() -> Unit =
        {},
) {
    val builder = CfnBillingGroupAccountGroupingPropertyDsl()
    builder.apply(block)
    return setAccountGrouping(builder.build())
}

public inline fun CfnBillingGroup.setComputationPreference(
    block: CfnBillingGroupComputationPreferencePropertyDsl.() -> Unit =
        {},
) {
    val builder = CfnBillingGroupComputationPreferencePropertyDsl()
    builder.apply(block)
    return setComputationPreference(builder.build())
}

public inline fun CfnPricingRule.setTiering(
    block: CfnPricingRuleTieringPropertyDsl.() -> Unit =
        {},
) {
    val builder = CfnPricingRuleTieringPropertyDsl()
    builder.apply(block)
    return setTiering(builder.build())
}

public inline fun CfnCustomLineItem.setBillingPeriodRange(
    block: CfnCustomLineItemBillingPeriodRangePropertyDsl.() -> Unit =
        {},
) {
    val builder = CfnCustomLineItemBillingPeriodRangePropertyDsl()
    builder.apply(block)
    return setBillingPeriodRange(builder.build())
}

public inline fun CfnCustomLineItem.setCustomLineItemChargeDetails(
    block: CfnCustomLineItemCustomLineItemChargeDetailsPropertyDsl.() -> Unit =
        {},
) {
    val builder = CfnCustomLineItemCustomLineItemChargeDetailsPropertyDsl()
    builder.apply(block)
    return setCustomLineItemChargeDetails(builder.build())
}
