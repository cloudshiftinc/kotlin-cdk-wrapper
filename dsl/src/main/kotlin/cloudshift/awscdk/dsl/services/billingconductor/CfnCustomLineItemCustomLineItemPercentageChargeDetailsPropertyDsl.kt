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

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.billingconductor.CfnCustomLineItem

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
@CdkDslMarker
public class CfnCustomLineItemCustomLineItemPercentageChargeDetailsPropertyDsl {
    private val cdkBuilder:
        CfnCustomLineItem.CustomLineItemPercentageChargeDetailsProperty.Builder =
        CfnCustomLineItem.CustomLineItemPercentageChargeDetailsProperty.builder()

    private val _childAssociatedResources: MutableList<String> = mutableListOf()

    /**
     * @param childAssociatedResources A list of resource ARNs to associate to the percentage custom
     *   line item.
     */
    public fun childAssociatedResources(vararg childAssociatedResources: String) {
        _childAssociatedResources.addAll(listOf(*childAssociatedResources))
    }

    /**
     * @param childAssociatedResources A list of resource ARNs to associate to the percentage custom
     *   line item.
     */
    public fun childAssociatedResources(childAssociatedResources: Collection<String>) {
        _childAssociatedResources.addAll(childAssociatedResources)
    }

    /**
     * @param percentageValue The custom line item's percentage value. This will be multiplied
     *   against the combined value of its associated resources to determine its charge value.
     */
    public fun percentageValue(percentageValue: Number) {
        cdkBuilder.percentageValue(percentageValue)
    }

    public fun build(): CfnCustomLineItem.CustomLineItemPercentageChargeDetailsProperty {
        if (_childAssociatedResources.isNotEmpty())
            cdkBuilder.childAssociatedResources(_childAssociatedResources)
        return cdkBuilder.build()
    }
}
