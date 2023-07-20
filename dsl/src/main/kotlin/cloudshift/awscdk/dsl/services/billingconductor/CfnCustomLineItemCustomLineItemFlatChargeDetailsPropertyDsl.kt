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

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.billingconductor.CfnCustomLineItem
import kotlin.Number

@CdkDslMarker
public class CfnCustomLineItemCustomLineItemFlatChargeDetailsPropertyDsl {
    private val cdkBuilder: CfnCustomLineItem.CustomLineItemFlatChargeDetailsProperty.Builder =
        CfnCustomLineItem.CustomLineItemFlatChargeDetailsProperty.builder()

    public fun chargeValue(chargeValue: Number) {
        cdkBuilder.chargeValue(chargeValue)
    }

    public fun build(): CfnCustomLineItem.CustomLineItemFlatChargeDetailsProperty = cdkBuilder.build()
}
