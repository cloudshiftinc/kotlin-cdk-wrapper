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

package cloudshift.awscdk.dsl.services.cloudfront

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.cloudfront.CfnDistribution
import kotlin.Number
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnDistributionStatusCodesPropertyDsl {
    private val cdkBuilder: CfnDistribution.StatusCodesProperty.Builder =
        CfnDistribution.StatusCodesProperty.builder()

    private val _items: MutableList<Number> = mutableListOf()

    public fun items(vararg items: Number) {
        _items.addAll(listOf(*items))
    }

    public fun items(items: Collection<Number>) {
        _items.addAll(items)
    }

    public fun items(items: IResolvable) {
        cdkBuilder.items(items)
    }

    public fun quantity(quantity: Number) {
        cdkBuilder.quantity(quantity)
    }

    public fun build(): CfnDistribution.StatusCodesProperty {
        if (_items.isNotEmpty()) cdkBuilder.items(_items)
        return cdkBuilder.build()
    }
}
