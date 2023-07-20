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
import software.amazon.awscdk.services.billingconductor.CfnBillingGroupProps
import software.amazon.awscdk.services.billingconductor.CfnCustomLineItem
import software.amazon.awscdk.services.billingconductor.CfnCustomLineItemProps
import software.amazon.awscdk.services.billingconductor.CfnPricingPlan
import software.amazon.awscdk.services.billingconductor.CfnPricingPlanProps
import software.amazon.awscdk.services.billingconductor.CfnPricingRule
import software.amazon.awscdk.services.billingconductor.CfnPricingRuleProps
import software.constructs.Construct
import kotlin.String
import kotlin.Unit

public object billingconductor {
    public inline fun cfnBillingGroup(
        scope: Construct,
        id: String,
        block: CfnBillingGroupDsl.() -> Unit = {},
    ): CfnBillingGroup {
        val builder = CfnBillingGroupDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnBillingGroupAccountGroupingProperty(
        block: CfnBillingGroupAccountGroupingPropertyDsl.() -> Unit =
            {},
    ): CfnBillingGroup.AccountGroupingProperty {
        val builder = CfnBillingGroupAccountGroupingPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnBillingGroupComputationPreferenceProperty(
        block: CfnBillingGroupComputationPreferencePropertyDsl.() -> Unit =
            {},
    ): CfnBillingGroup.ComputationPreferenceProperty {
        val builder = CfnBillingGroupComputationPreferencePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnBillingGroupProps(block: CfnBillingGroupPropsDsl.() -> Unit = {}): CfnBillingGroupProps {
        val builder = CfnBillingGroupPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnCustomLineItem(
        scope: Construct,
        id: String,
        block: CfnCustomLineItemDsl.() -> Unit = {},
    ): CfnCustomLineItem {
        val builder = CfnCustomLineItemDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnCustomLineItemBillingPeriodRangeProperty(
        block: CfnCustomLineItemBillingPeriodRangePropertyDsl.() -> Unit =
            {},
    ): CfnCustomLineItem.BillingPeriodRangeProperty {
        val builder = CfnCustomLineItemBillingPeriodRangePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnCustomLineItemCustomLineItemChargeDetailsProperty(
        block: CfnCustomLineItemCustomLineItemChargeDetailsPropertyDsl.() -> Unit =
            {},
    ): CfnCustomLineItem.CustomLineItemChargeDetailsProperty {
        val builder = CfnCustomLineItemCustomLineItemChargeDetailsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnCustomLineItemCustomLineItemFlatChargeDetailsProperty(
        block: CfnCustomLineItemCustomLineItemFlatChargeDetailsPropertyDsl.() -> Unit =
            {},
    ): CfnCustomLineItem.CustomLineItemFlatChargeDetailsProperty {
        val builder = CfnCustomLineItemCustomLineItemFlatChargeDetailsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnCustomLineItemCustomLineItemPercentageChargeDetailsProperty(
        block: CfnCustomLineItemCustomLineItemPercentageChargeDetailsPropertyDsl.() -> Unit =
            {},
    ): CfnCustomLineItem.CustomLineItemPercentageChargeDetailsProperty {
        val builder = CfnCustomLineItemCustomLineItemPercentageChargeDetailsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnCustomLineItemProps(block: CfnCustomLineItemPropsDsl.() -> Unit = {}): CfnCustomLineItemProps {
        val builder = CfnCustomLineItemPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnPricingPlan(
        scope: Construct,
        id: String,
        block: CfnPricingPlanDsl.() -> Unit = {},
    ): CfnPricingPlan {
        val builder = CfnPricingPlanDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnPricingPlanProps(block: CfnPricingPlanPropsDsl.() -> Unit = {}): CfnPricingPlanProps {
        val builder = CfnPricingPlanPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnPricingRule(
        scope: Construct,
        id: String,
        block: CfnPricingRuleDsl.() -> Unit = {},
    ): CfnPricingRule {
        val builder = CfnPricingRuleDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnPricingRuleFreeTierProperty(
        block: CfnPricingRuleFreeTierPropertyDsl.() -> Unit = {
        },
    ): CfnPricingRule.FreeTierProperty {
        val builder = CfnPricingRuleFreeTierPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnPricingRuleProps(block: CfnPricingRulePropsDsl.() -> Unit = {}): CfnPricingRuleProps {
        val builder = CfnPricingRulePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnPricingRuleTieringProperty(
        block: CfnPricingRuleTieringPropertyDsl.() -> Unit =
            {},
    ): CfnPricingRule.TieringProperty {
        val builder = CfnPricingRuleTieringPropertyDsl()
        builder.apply(block)
        return builder.build()
    }
}
