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
import software.amazon.awscdk.services.billingconductor.CfnCustomLineItem

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
@CdkDslMarker
public class CfnCustomLineItemCustomLineItemFlatChargeDetailsPropertyDsl {
    private val cdkBuilder: CfnCustomLineItem.CustomLineItemFlatChargeDetailsProperty.Builder =
        CfnCustomLineItem.CustomLineItemFlatChargeDetailsProperty.builder()

    /** @param chargeValue The custom line item's fixed charge value in USD. */
    public fun chargeValue(chargeValue: Number) {
        cdkBuilder.chargeValue(chargeValue)
    }

    public fun build(): CfnCustomLineItem.CustomLineItemFlatChargeDetailsProperty =
        cdkBuilder.build()
}
