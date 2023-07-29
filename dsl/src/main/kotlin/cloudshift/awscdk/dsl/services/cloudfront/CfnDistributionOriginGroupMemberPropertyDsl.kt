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
import software.amazon.awscdk.services.cloudfront.CfnDistribution

/**
 * An origin in an origin group.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.cloudfront.*;
 * OriginGroupMemberProperty originGroupMemberProperty = OriginGroupMemberProperty.builder()
 * .originId("originId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-origingroupmember.html)
 */
@CdkDslMarker
public class CfnDistributionOriginGroupMemberPropertyDsl {
    private val cdkBuilder: CfnDistribution.OriginGroupMemberProperty.Builder =
        CfnDistribution.OriginGroupMemberProperty.builder()

    /** @param originId The ID for an origin in an origin group. */
    public fun originId(originId: String) {
        cdkBuilder.originId(originId)
    }

    public fun build(): CfnDistribution.OriginGroupMemberProperty = cdkBuilder.build()
}
