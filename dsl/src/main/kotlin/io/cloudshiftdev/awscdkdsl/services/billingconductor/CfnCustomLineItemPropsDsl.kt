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

package io.cloudshiftdev.awscdkdsl.services.billingconductor

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.billingconductor.CfnCustomLineItem
import software.amazon.awscdk.services.billingconductor.CfnCustomLineItemProps

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
 * .accountId("accountId")
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
 * .lineItemFilters(List.of(LineItemFilterProperty.builder()
 * .attribute("attribute")
 * .matchOption("matchOption")
 * .values(List.of("values"))
 * .build()))
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
@CdkDslMarker
public class CfnCustomLineItemPropsDsl {
    private val cdkBuilder: CfnCustomLineItemProps.Builder = CfnCustomLineItemProps.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /** @param accountId The AWS account in which this custom line item will be applied to. */
    public fun accountId(accountId: String) {
        cdkBuilder.accountId(accountId)
    }

    /**
     * @param billingGroupArn The Amazon Resource Name (ARN) that references the billing group where
     *   the custom line item applies to.
     */
    public fun billingGroupArn(billingGroupArn: String) {
        cdkBuilder.billingGroupArn(billingGroupArn)
    }

    /** @param billingPeriodRange A time range for which the custom line item is effective. */
    public fun billingPeriodRange(billingPeriodRange: IResolvable) {
        cdkBuilder.billingPeriodRange(billingPeriodRange)
    }

    /** @param billingPeriodRange A time range for which the custom line item is effective. */
    public fun billingPeriodRange(
        billingPeriodRange: CfnCustomLineItem.BillingPeriodRangeProperty
    ) {
        cdkBuilder.billingPeriodRange(billingPeriodRange)
    }

    /**
     * @param customLineItemChargeDetails The charge details of a custom line item. It should
     *   contain only one of `Flat` or `Percentage` .
     */
    public fun customLineItemChargeDetails(customLineItemChargeDetails: IResolvable) {
        cdkBuilder.customLineItemChargeDetails(customLineItemChargeDetails)
    }

    /**
     * @param customLineItemChargeDetails The charge details of a custom line item. It should
     *   contain only one of `Flat` or `Percentage` .
     */
    public fun customLineItemChargeDetails(
        customLineItemChargeDetails: CfnCustomLineItem.CustomLineItemChargeDetailsProperty
    ) {
        cdkBuilder.customLineItemChargeDetails(customLineItemChargeDetails)
    }

    /**
     * @param description The custom line item's description. This is shown on the Bills page in
     *   association with the charge value.
     */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /** @param name The custom line item's name. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * @param tags A map that contains tag keys and tag values that are attached to a custom line
     *   item.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * @param tags A map that contains tag keys and tag values that are attached to a custom line
     *   item.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnCustomLineItemProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
