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
import kotlin.String

@CdkDslMarker
public class CfnDistributionOriginGroupPropertyDsl {
    private val cdkBuilder: CfnDistribution.OriginGroupProperty.Builder =
        CfnDistribution.OriginGroupProperty.builder()

    public fun failoverCriteria(failoverCriteria: IResolvable) {
        cdkBuilder.failoverCriteria(failoverCriteria)
    }

    public fun failoverCriteria(failoverCriteria: CfnDistribution.OriginGroupFailoverCriteriaProperty) {
        cdkBuilder.failoverCriteria(failoverCriteria)
    }

    public fun id(id: String) {
        cdkBuilder.id(id)
    }

    public fun members(members: IResolvable) {
        cdkBuilder.members(members)
    }

    public fun members(members: CfnDistribution.OriginGroupMembersProperty) {
        cdkBuilder.members(members)
    }

    public fun build(): CfnDistribution.OriginGroupProperty = cdkBuilder.build()
}
