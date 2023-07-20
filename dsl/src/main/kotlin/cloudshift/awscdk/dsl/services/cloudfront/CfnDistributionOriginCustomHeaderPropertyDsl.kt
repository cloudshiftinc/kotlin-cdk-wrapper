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
public class CfnDistributionOriginCustomHeaderPropertyDsl {
    private val cdkBuilder: CfnDistribution.OriginCustomHeaderProperty.Builder =
        CfnDistribution.OriginCustomHeaderProperty.builder()

    public fun headerName(headerName: String) {
        cdkBuilder.headerName(headerName)
    }

    public fun headerValue(headerValue: String) {
        cdkBuilder.headerValue(headerValue)
    }

    public fun build(): CfnDistribution.OriginCustomHeaderProperty = cdkBuilder.build()
}
