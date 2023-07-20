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
import software.amazon.awscdk.services.cloudfront.CfnDistribution
import kotlin.String

@CdkDslMarker
public class CfnDistributionOriginGroupMemberPropertyDsl {
    private val cdkBuilder: CfnDistribution.OriginGroupMemberProperty.Builder =
        CfnDistribution.OriginGroupMemberProperty.builder()

    public fun originId(originId: String) {
        cdkBuilder.originId(originId)
    }

    public fun build(): CfnDistribution.OriginGroupMemberProperty = cdkBuilder.build()
}
