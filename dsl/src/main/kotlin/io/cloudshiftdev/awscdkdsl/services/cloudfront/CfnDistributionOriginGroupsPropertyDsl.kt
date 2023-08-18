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

package io.cloudshiftdev.awscdkdsl.services.cloudfront

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Any
import kotlin.Number
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.cloudfront.CfnDistribution

/**
 * A complex data type for the origin groups specified for a distribution.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.cloudfront.*;
 * OriginGroupsProperty originGroupsProperty = OriginGroupsProperty.builder()
 * .quantity(123)
 * // the properties below are optional
 * .items(List.of(OriginGroupProperty.builder()
 * .failoverCriteria(OriginGroupFailoverCriteriaProperty.builder()
 * .statusCodes(StatusCodesProperty.builder()
 * .items(List.of(123))
 * .quantity(123)
 * .build())
 * .build())
 * .id("id")
 * .members(OriginGroupMembersProperty.builder()
 * .items(List.of(OriginGroupMemberProperty.builder()
 * .originId("originId")
 * .build()))
 * .quantity(123)
 * .build())
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-origingroups.html)
 */
@CdkDslMarker
public class CfnDistributionOriginGroupsPropertyDsl {
    private val cdkBuilder: CfnDistribution.OriginGroupsProperty.Builder =
        CfnDistribution.OriginGroupsProperty.builder()

    private val _items: MutableList<Any> = mutableListOf()

    /** @param items The items (origin groups) in a distribution. */
    public fun items(vararg items: Any) {
        _items.addAll(listOf(*items))
    }

    /** @param items The items (origin groups) in a distribution. */
    public fun items(items: Collection<Any>) {
        _items.addAll(items)
    }

    /** @param items The items (origin groups) in a distribution. */
    public fun items(items: IResolvable) {
        cdkBuilder.items(items)
    }

    /** @param quantity The number of origin groups. */
    public fun quantity(quantity: Number) {
        cdkBuilder.quantity(quantity)
    }

    public fun build(): CfnDistribution.OriginGroupsProperty {
        if (_items.isNotEmpty()) cdkBuilder.items(_items)
        return cdkBuilder.build()
    }
}
