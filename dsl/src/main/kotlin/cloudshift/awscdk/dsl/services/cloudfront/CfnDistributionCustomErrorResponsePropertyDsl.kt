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
import kotlin.Number
import kotlin.String

@CdkDslMarker
public class CfnDistributionCustomErrorResponsePropertyDsl {
    private val cdkBuilder: CfnDistribution.CustomErrorResponseProperty.Builder =
        CfnDistribution.CustomErrorResponseProperty.builder()

    public fun errorCachingMinTtl(errorCachingMinTtl: Number) {
        cdkBuilder.errorCachingMinTtl(errorCachingMinTtl)
    }

    public fun errorCode(errorCode: Number) {
        cdkBuilder.errorCode(errorCode)
    }

    public fun responseCode(responseCode: Number) {
        cdkBuilder.responseCode(responseCode)
    }

    public fun responsePagePath(responsePagePath: String) {
        cdkBuilder.responsePagePath(responsePagePath)
    }

    public fun build(): CfnDistribution.CustomErrorResponseProperty = cdkBuilder.build()
}
