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
import software.amazon.awscdk.services.cloudfront.CfnStreamingDistribution
import kotlin.String

@CdkDslMarker
public class CfnStreamingDistributionS3OriginPropertyDsl {
    private val cdkBuilder: CfnStreamingDistribution.S3OriginProperty.Builder =
        CfnStreamingDistribution.S3OriginProperty.builder()

    public fun domainName(domainName: String) {
        cdkBuilder.domainName(domainName)
    }

    public fun originAccessIdentity(originAccessIdentity: String) {
        cdkBuilder.originAccessIdentity(originAccessIdentity)
    }

    public fun build(): CfnStreamingDistribution.S3OriginProperty = cdkBuilder.build()
}
