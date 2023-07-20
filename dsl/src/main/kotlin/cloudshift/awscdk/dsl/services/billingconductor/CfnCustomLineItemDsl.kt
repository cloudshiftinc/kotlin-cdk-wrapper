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
import cloudshift.awscdk.dsl.CfnTagDsl
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.billingconductor.CfnCustomLineItem
import software.constructs.Construct
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnCustomLineItemDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnCustomLineItem.Builder = CfnCustomLineItem.Builder.create(scope, id)

    private val _tags: MutableList<CfnTag> = mutableListOf()

    public fun billingGroupArn(billingGroupArn: String) {
        cdkBuilder.billingGroupArn(billingGroupArn)
    }

    public fun billingPeriodRange(billingPeriodRange: IResolvable) {
        cdkBuilder.billingPeriodRange(billingPeriodRange)
    }

    public fun billingPeriodRange(billingPeriodRange: CfnCustomLineItem.BillingPeriodRangeProperty) {
        cdkBuilder.billingPeriodRange(billingPeriodRange)
    }

    public fun customLineItemChargeDetails(customLineItemChargeDetails: IResolvable) {
        cdkBuilder.customLineItemChargeDetails(customLineItemChargeDetails)
    }

    public fun customLineItemChargeDetails(customLineItemChargeDetails: CfnCustomLineItem.CustomLineItemChargeDetailsProperty) {
        cdkBuilder.customLineItemChargeDetails(customLineItemChargeDetails)
    }

    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnCustomLineItem {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
