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

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.billingconductor.CfnBillingGroup
import software.amazon.awscdk.services.billingconductor.CfnBillingGroupProps
import software.amazon.awscdk.services.billingconductor.CfnCustomLineItem
import software.amazon.awscdk.services.billingconductor.CfnCustomLineItemProps
import software.amazon.awscdk.services.billingconductor.CfnPricingPlan
import software.amazon.awscdk.services.billingconductor.CfnPricingPlanProps
import software.amazon.awscdk.services.billingconductor.CfnPricingRule
import software.amazon.awscdk.services.billingconductor.CfnPricingRuleProps
import software.constructs.Construct

public object billingconductor {
    /**
     * Creates a billing group that resembles a consolidated billing family that AWS charges, based
     * off of the predefined pricing plan computation.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.billingconductor.*;
     * CfnBillingGroup cfnBillingGroup = CfnBillingGroup.Builder.create(this, "MyCfnBillingGroup")
     * .accountGrouping(AccountGroupingProperty.builder()
     * .linkedAccountIds(List.of("linkedAccountIds"))
     * .build())
     * .computationPreference(ComputationPreferenceProperty.builder()
     * .pricingPlanArn("pricingPlanArn")
     * .build())
     * .name("name")
     * .primaryAccountId("primaryAccountId")
     * // the properties below are optional
     * .description("description")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-billingconductor-billinggroup.html)
     */
    public inline fun cfnBillingGroup(
        scope: Construct,
        id: String,
        block: CfnBillingGroupDsl.() -> Unit = {},
    ): CfnBillingGroup {
        val builder = CfnBillingGroupDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * The set of accounts that will be under the billing group.
     *
     * The set of accounts resemble the linked accounts in a consolidated family.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.billingconductor.*;
     * AccountGroupingProperty accountGroupingProperty = AccountGroupingProperty.builder()
     * .linkedAccountIds(List.of("linkedAccountIds"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-billingconductor-billinggroup-accountgrouping.html)
     */
    public inline fun cfnBillingGroupAccountGroupingProperty(
        block: CfnBillingGroupAccountGroupingPropertyDsl.() -> Unit = {}
    ): CfnBillingGroup.AccountGroupingProperty {
        val builder = CfnBillingGroupAccountGroupingPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The preferences and settings that will be used to compute the AWS charges for a billing
     * group.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.billingconductor.*;
     * ComputationPreferenceProperty computationPreferenceProperty =
     * ComputationPreferenceProperty.builder()
     * .pricingPlanArn("pricingPlanArn")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-billingconductor-billinggroup-computationpreference.html)
     */
    public inline fun cfnBillingGroupComputationPreferenceProperty(
        block: CfnBillingGroupComputationPreferencePropertyDsl.() -> Unit = {}
    ): CfnBillingGroup.ComputationPreferenceProperty {
        val builder = CfnBillingGroupComputationPreferencePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnBillingGroup`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.billingconductor.*;
     * CfnBillingGroupProps cfnBillingGroupProps = CfnBillingGroupProps.builder()
     * .accountGrouping(AccountGroupingProperty.builder()
     * .linkedAccountIds(List.of("linkedAccountIds"))
     * .build())
     * .computationPreference(ComputationPreferenceProperty.builder()
     * .pricingPlanArn("pricingPlanArn")
     * .build())
     * .name("name")
     * .primaryAccountId("primaryAccountId")
     * // the properties below are optional
     * .description("description")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-billingconductor-billinggroup.html)
     */
    public inline fun cfnBillingGroupProps(
        block: CfnBillingGroupPropsDsl.() -> Unit = {}
    ): CfnBillingGroupProps {
        val builder = CfnBillingGroupPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Creates a custom line item that can be used to create a one-time or recurring, fixed or
     * percentage-based charge that you can apply to a single billing group.
     *
     * You can apply custom line items to the current or previous billing period. You can create
     * either a fee or a discount custom line item.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.billingconductor.*;
     * CfnCustomLineItem cfnCustomLineItem = CfnCustomLineItem.Builder.create(this,
     * "MyCfnCustomLineItem")
     * .billingGroupArn("billingGroupArn")
     * .name("name")
     * // the properties below are optional
     * .billingPeriodRange(BillingPeriodRangeProperty.builder()
     * .exclusiveEndBillingPeriod("exclusiveEndBillingPeriod")
     * .inclusiveStartBillingPeriod("inclusiveStartBillingPeriod")
     * .build())
     * .customLineItemChargeDetails(CustomLineItemChargeDetailsProperty.builder()
     * .type("type")
     * // the properties below are optional
     * .flat(CustomLineItemFlatChargeDetailsProperty.builder()
     * .chargeValue(123)
     * .build())
     * .percentage(CustomLineItemPercentageChargeDetailsProperty.builder()
     * .percentageValue(123)
     * // the properties below are optional
     * .childAssociatedResources(List.of("childAssociatedResources"))
     * .build())
     * .build())
     * .description("description")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-billingconductor-customlineitem.html)
     */
    public inline fun cfnCustomLineItem(
        scope: Construct,
        id: String,
        block: CfnCustomLineItemDsl.() -> Unit = {},
    ): CfnCustomLineItem {
        val builder = CfnCustomLineItemDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * The billing period range in which the custom line item request will be applied.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.billingconductor.*;
     * BillingPeriodRangeProperty billingPeriodRangeProperty = BillingPeriodRangeProperty.builder()
     * .exclusiveEndBillingPeriod("exclusiveEndBillingPeriod")
     * .inclusiveStartBillingPeriod("inclusiveStartBillingPeriod")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-billingconductor-customlineitem-billingperiodrange.html)
     */
    public inline fun cfnCustomLineItemBillingPeriodRangeProperty(
        block: CfnCustomLineItemBillingPeriodRangePropertyDsl.() -> Unit = {}
    ): CfnCustomLineItem.BillingPeriodRangeProperty {
        val builder = CfnCustomLineItemBillingPeriodRangePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The charge details of a custom line item.
     *
     * It should contain only one of `Flat` or `Percentage` .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.billingconductor.*;
     * CustomLineItemChargeDetailsProperty customLineItemChargeDetailsProperty =
     * CustomLineItemChargeDetailsProperty.builder()
     * .type("type")
     * // the properties below are optional
     * .flat(CustomLineItemFlatChargeDetailsProperty.builder()
     * .chargeValue(123)
     * .build())
     * .percentage(CustomLineItemPercentageChargeDetailsProperty.builder()
     * .percentageValue(123)
     * // the properties below are optional
     * .childAssociatedResources(List.of("childAssociatedResources"))
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-billingconductor-customlineitem-customlineitemchargedetails.html)
     */
    public inline fun cfnCustomLineItemCustomLineItemChargeDetailsProperty(
        block: CfnCustomLineItemCustomLineItemChargeDetailsPropertyDsl.() -> Unit = {}
    ): CfnCustomLineItem.CustomLineItemChargeDetailsProperty {
        val builder = CfnCustomLineItemCustomLineItemChargeDetailsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The charge details of a custom line item.
     *
     * It should contain only one of `Flat` or `Percentage` .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.billingconductor.*;
     * CustomLineItemFlatChargeDetailsProperty customLineItemFlatChargeDetailsProperty =
     * CustomLineItemFlatChargeDetailsProperty.builder()
     * .chargeValue(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-billingconductor-customlineitem-customlineitemflatchargedetails.html)
     */
    public inline fun cfnCustomLineItemCustomLineItemFlatChargeDetailsProperty(
        block: CfnCustomLineItemCustomLineItemFlatChargeDetailsPropertyDsl.() -> Unit = {}
    ): CfnCustomLineItem.CustomLineItemFlatChargeDetailsProperty {
        val builder = CfnCustomLineItemCustomLineItemFlatChargeDetailsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A representation of the charge details associated with a percentage custom line item.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.billingconductor.*;
     * CustomLineItemPercentageChargeDetailsProperty customLineItemPercentageChargeDetailsProperty =
     * CustomLineItemPercentageChargeDetailsProperty.builder()
     * .percentageValue(123)
     * // the properties below are optional
     * .childAssociatedResources(List.of("childAssociatedResources"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-billingconductor-customlineitem-customlineitempercentagechargedetails.html)
     */
    public inline fun cfnCustomLineItemCustomLineItemPercentageChargeDetailsProperty(
        block: CfnCustomLineItemCustomLineItemPercentageChargeDetailsPropertyDsl.() -> Unit = {}
    ): CfnCustomLineItem.CustomLineItemPercentageChargeDetailsProperty {
        val builder = CfnCustomLineItemCustomLineItemPercentageChargeDetailsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnCustomLineItem`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.billingconductor.*;
     * CfnCustomLineItemProps cfnCustomLineItemProps = CfnCustomLineItemProps.builder()
     * .billingGroupArn("billingGroupArn")
     * .name("name")
     * // the properties below are optional
     * .billingPeriodRange(BillingPeriodRangeProperty.builder()
     * .exclusiveEndBillingPeriod("exclusiveEndBillingPeriod")
     * .inclusiveStartBillingPeriod("inclusiveStartBillingPeriod")
     * .build())
     * .customLineItemChargeDetails(CustomLineItemChargeDetailsProperty.builder()
     * .type("type")
     * // the properties below are optional
     * .flat(CustomLineItemFlatChargeDetailsProperty.builder()
     * .chargeValue(123)
     * .build())
     * .percentage(CustomLineItemPercentageChargeDetailsProperty.builder()
     * .percentageValue(123)
     * // the properties below are optional
     * .childAssociatedResources(List.of("childAssociatedResources"))
     * .build())
     * .build())
     * .description("description")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-billingconductor-customlineitem.html)
     */
    public inline fun cfnCustomLineItemProps(
        block: CfnCustomLineItemPropsDsl.() -> Unit = {}
    ): CfnCustomLineItemProps {
        val builder = CfnCustomLineItemPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Creates a pricing plan that is used for computing AWS charges for billing groups.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.billingconductor.*;
     * CfnPricingPlan cfnPricingPlan = CfnPricingPlan.Builder.create(this, "MyCfnPricingPlan")
     * .name("name")
     * // the properties below are optional
     * .description("description")
     * .pricingRuleArns(List.of("pricingRuleArns"))
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-billingconductor-pricingplan.html)
     */
    public inline fun cfnPricingPlan(
        scope: Construct,
        id: String,
        block: CfnPricingPlanDsl.() -> Unit = {},
    ): CfnPricingPlan {
        val builder = CfnPricingPlanDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnPricingPlan`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.billingconductor.*;
     * CfnPricingPlanProps cfnPricingPlanProps = CfnPricingPlanProps.builder()
     * .name("name")
     * // the properties below are optional
     * .description("description")
     * .pricingRuleArns(List.of("pricingRuleArns"))
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-billingconductor-pricingplan.html)
     */
    public inline fun cfnPricingPlanProps(
        block: CfnPricingPlanPropsDsl.() -> Unit = {}
    ): CfnPricingPlanProps {
        val builder = CfnPricingPlanPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Creates a pricing rule which can be associated with a pricing plan, or a set of pricing
     * plans.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.billingconductor.*;
     * CfnPricingRule cfnPricingRule = CfnPricingRule.Builder.create(this, "MyCfnPricingRule")
     * .name("name")
     * .scope("scope")
     * .type("type")
     * // the properties below are optional
     * .billingEntity("billingEntity")
     * .description("description")
     * .modifierPercentage(123)
     * .operation("operation")
     * .service("service")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .tiering(TieringProperty.builder()
     * .freeTier(FreeTierProperty.builder()
     * .activated(false)
     * .build())
     * .build())
     * .usageType("usageType")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-billingconductor-pricingrule.html)
     */
    public inline fun cfnPricingRule(
        scope: Construct,
        id: String,
        block: CfnPricingRuleDsl.() -> Unit = {},
    ): CfnPricingRule {
        val builder = CfnPricingRuleDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * The possible AWS Free Tier configurations.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.billingconductor.*;
     * FreeTierProperty freeTierProperty = FreeTierProperty.builder()
     * .activated(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-billingconductor-pricingrule-freetier.html)
     */
    public inline fun cfnPricingRuleFreeTierProperty(
        block: CfnPricingRuleFreeTierPropertyDsl.() -> Unit = {}
    ): CfnPricingRule.FreeTierProperty {
        val builder = CfnPricingRuleFreeTierPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnPricingRule`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.billingconductor.*;
     * CfnPricingRuleProps cfnPricingRuleProps = CfnPricingRuleProps.builder()
     * .name("name")
     * .scope("scope")
     * .type("type")
     * // the properties below are optional
     * .billingEntity("billingEntity")
     * .description("description")
     * .modifierPercentage(123)
     * .operation("operation")
     * .service("service")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .tiering(TieringProperty.builder()
     * .freeTier(FreeTierProperty.builder()
     * .activated(false)
     * .build())
     * .build())
     * .usageType("usageType")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-billingconductor-pricingrule.html)
     */
    public inline fun cfnPricingRuleProps(
        block: CfnPricingRulePropsDsl.() -> Unit = {}
    ): CfnPricingRuleProps {
        val builder = CfnPricingRulePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The set of tiering configurations for the pricing rule.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.billingconductor.*;
     * TieringProperty tieringProperty = TieringProperty.builder()
     * .freeTier(FreeTierProperty.builder()
     * .activated(false)
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-billingconductor-pricingrule-tiering.html)
     */
    public inline fun cfnPricingRuleTieringProperty(
        block: CfnPricingRuleTieringPropertyDsl.() -> Unit = {}
    ): CfnPricingRule.TieringProperty {
        val builder = CfnPricingRuleTieringPropertyDsl()
        builder.apply(block)
        return builder.build()
    }
}
