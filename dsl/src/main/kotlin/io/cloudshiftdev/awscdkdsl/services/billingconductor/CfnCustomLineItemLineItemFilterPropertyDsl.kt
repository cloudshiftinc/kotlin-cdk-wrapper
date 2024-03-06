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

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.billingconductor.CfnCustomLineItem

/**
 * A representation of the line item filter for your custom line item.
 *
 * You can use line item filters to include or exclude specific resource values from the billing
 * group's total cost. For example, if you create a custom line item and you want to filter out a
 * value, such as Savings Plan discounts, you can update `LineItemFilter` to exclude it.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.billingconductor.*;
 * LineItemFilterProperty lineItemFilterProperty = LineItemFilterProperty.builder()
 * .attribute("attribute")
 * .matchOption("matchOption")
 * .values(List.of("values"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-billingconductor-customlineitem-lineitemfilter.html)
 */
@CdkDslMarker
public class CfnCustomLineItemLineItemFilterPropertyDsl {
    private val cdkBuilder: CfnCustomLineItem.LineItemFilterProperty.Builder =
        CfnCustomLineItem.LineItemFilterProperty.builder()

    private val _values: MutableList<String> = mutableListOf()

    /**
     * @param attribute The attribute of the line item filter. This specifies what attribute that
     *   you can filter on.
     */
    public fun attribute(attribute: String) {
        cdkBuilder.attribute(attribute)
    }

    /**
     * @param matchOption The match criteria of the line item filter. This parameter specifies
     *   whether not to include the resource value from the billing group total cost.
     */
    public fun matchOption(matchOption: String) {
        cdkBuilder.matchOption(matchOption)
    }

    /**
     * @param values The values of the line item filter. This specifies the values to filter on.
     *   Currently, you can only exclude Savings Plan discounts.
     */
    public fun values(vararg values: String) {
        _values.addAll(listOf(*values))
    }

    /**
     * @param values The values of the line item filter. This specifies the values to filter on.
     *   Currently, you can only exclude Savings Plan discounts.
     */
    public fun values(values: Collection<String>) {
        _values.addAll(values)
    }

    public fun build(): CfnCustomLineItem.LineItemFilterProperty {
        if (_values.isNotEmpty()) cdkBuilder.values(_values)
        return cdkBuilder.build()
    }
}
