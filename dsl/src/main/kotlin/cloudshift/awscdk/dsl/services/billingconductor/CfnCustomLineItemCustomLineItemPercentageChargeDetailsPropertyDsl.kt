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
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnCustomLineItemCustomLineItemPercentageChargeDetailsPropertyDsl {
    private val cdkBuilder: CfnCustomLineItem.CustomLineItemPercentageChargeDetailsProperty.Builder =
        CfnCustomLineItem.CustomLineItemPercentageChargeDetailsProperty.builder()

    private val _childAssociatedResources: MutableList<String> = mutableListOf()

    public fun childAssociatedResources(vararg childAssociatedResources: String) {
        _childAssociatedResources.addAll(listOf(*childAssociatedResources))
    }

    public fun childAssociatedResources(childAssociatedResources: Collection<String>) {
        _childAssociatedResources.addAll(childAssociatedResources)
    }

    public fun percentageValue(percentageValue: Number) {
        cdkBuilder.percentageValue(percentageValue)
    }

    public fun build(): CfnCustomLineItem.CustomLineItemPercentageChargeDetailsProperty {
        if (_childAssociatedResources.isNotEmpty()) {
            cdkBuilder.childAssociatedResources(_childAssociatedResources)
        }
        return cdkBuilder.build()
    }
}
