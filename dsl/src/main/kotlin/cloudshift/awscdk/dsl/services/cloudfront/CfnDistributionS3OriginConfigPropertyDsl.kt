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
public class CfnDistributionS3OriginConfigPropertyDsl {
    private val cdkBuilder: CfnDistribution.S3OriginConfigProperty.Builder =
        CfnDistribution.S3OriginConfigProperty.builder()

    public fun originAccessIdentity(originAccessIdentity: String) {
        cdkBuilder.originAccessIdentity(originAccessIdentity)
    }

    public fun build(): CfnDistribution.S3OriginConfigProperty = cdkBuilder.build()
}
