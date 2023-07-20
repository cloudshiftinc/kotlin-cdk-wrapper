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

@CdkDslMarker
public class CfnDistributionRestrictionsPropertyDsl {
    private val cdkBuilder: CfnDistribution.RestrictionsProperty.Builder =
        CfnDistribution.RestrictionsProperty.builder()

    public fun geoRestriction(geoRestriction: IResolvable) {
        cdkBuilder.geoRestriction(geoRestriction)
    }

    public fun geoRestriction(geoRestriction: CfnDistribution.GeoRestrictionProperty) {
        cdkBuilder.geoRestriction(geoRestriction)
    }

    public fun build(): CfnDistribution.RestrictionsProperty = cdkBuilder.build()
}
