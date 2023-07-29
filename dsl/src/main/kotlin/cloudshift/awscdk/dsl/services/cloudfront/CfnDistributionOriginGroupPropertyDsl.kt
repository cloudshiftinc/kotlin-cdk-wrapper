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

package cloudshift.awscdk.dsl.services.cloudfront

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.cloudfront.CfnDistribution

/**
 * An origin group includes two origins (a primary origin and a second origin to failover to) and a
 * failover criteria that you specify.
 *
 * You create an origin group to support origin failover in CloudFront. When you create or update a
 * distribution, you can specifiy the origin group instead of a single origin, and CloudFront will
 * failover from the primary origin to the second origin under the failover conditions that you've
 * chosen.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.cloudfront.*;
 * OriginGroupProperty originGroupProperty = OriginGroupProperty.builder()
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
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-origingroup.html)
 */
@CdkDslMarker
public class CfnDistributionOriginGroupPropertyDsl {
    private val cdkBuilder: CfnDistribution.OriginGroupProperty.Builder =
        CfnDistribution.OriginGroupProperty.builder()

    /**
     * @param failoverCriteria A complex type that contains information about the failover criteria
     *   for an origin group.
     */
    public fun failoverCriteria(failoverCriteria: IResolvable) {
        cdkBuilder.failoverCriteria(failoverCriteria)
    }

    /**
     * @param failoverCriteria A complex type that contains information about the failover criteria
     *   for an origin group.
     */
    public fun failoverCriteria(
        failoverCriteria: CfnDistribution.OriginGroupFailoverCriteriaProperty
    ) {
        cdkBuilder.failoverCriteria(failoverCriteria)
    }

    /** @param id The origin group's ID. */
    public fun id(id: String) {
        cdkBuilder.id(id)
    }

    /**
     * @param members A complex type that contains information about the origins in an origin group.
     */
    public fun members(members: IResolvable) {
        cdkBuilder.members(members)
    }

    /**
     * @param members A complex type that contains information about the origins in an origin group.
     */
    public fun members(members: CfnDistribution.OriginGroupMembersProperty) {
        cdkBuilder.members(members)
    }

    public fun build(): CfnDistribution.OriginGroupProperty = cdkBuilder.build()
}
