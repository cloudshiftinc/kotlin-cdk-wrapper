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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.billingconductor.CfnCustomLineItem
import kotlin.String

@CdkDslMarker
public class CfnCustomLineItemCustomLineItemChargeDetailsPropertyDsl {
    private val cdkBuilder: CfnCustomLineItem.CustomLineItemChargeDetailsProperty.Builder =
        CfnCustomLineItem.CustomLineItemChargeDetailsProperty.builder()

    public fun flat(flat: IResolvable) {
        cdkBuilder.flat(flat)
    }

    public fun flat(flat: CfnCustomLineItem.CustomLineItemFlatChargeDetailsProperty) {
        cdkBuilder.flat(flat)
    }

    public fun percentage(percentage: IResolvable) {
        cdkBuilder.percentage(percentage)
    }

    public fun percentage(percentage: CfnCustomLineItem.CustomLineItemPercentageChargeDetailsProperty) {
        cdkBuilder.percentage(percentage)
    }

    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    public fun build(): CfnCustomLineItem.CustomLineItemChargeDetailsProperty = cdkBuilder.build()
}
