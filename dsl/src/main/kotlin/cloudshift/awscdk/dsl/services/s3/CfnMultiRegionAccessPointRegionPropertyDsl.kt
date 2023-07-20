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

package cloudshift.awscdk.dsl.services.s3

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.s3.CfnMultiRegionAccessPoint
import kotlin.String

@CdkDslMarker
public class CfnMultiRegionAccessPointRegionPropertyDsl {
    private val cdkBuilder: CfnMultiRegionAccessPoint.RegionProperty.Builder =
        CfnMultiRegionAccessPoint.RegionProperty.builder()

    public fun bucket(bucket: String) {
        cdkBuilder.bucket(bucket)
    }

    public fun bucketAccountId(bucketAccountId: String) {
        cdkBuilder.bucketAccountId(bucketAccountId)
    }

    public fun build(): CfnMultiRegionAccessPoint.RegionProperty = cdkBuilder.build()
}
