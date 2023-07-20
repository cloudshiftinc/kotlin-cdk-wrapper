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
import software.amazon.awscdk.services.s3.CfnBucket
import kotlin.Number

@CdkDslMarker
public class CfnBucketNoncurrentVersionExpirationPropertyDsl {
    private val cdkBuilder: CfnBucket.NoncurrentVersionExpirationProperty.Builder =
        CfnBucket.NoncurrentVersionExpirationProperty.builder()

    public fun newerNoncurrentVersions(newerNoncurrentVersions: Number) {
        cdkBuilder.newerNoncurrentVersions(newerNoncurrentVersions)
    }

    public fun noncurrentDays(noncurrentDays: Number) {
        cdkBuilder.noncurrentDays(noncurrentDays)
    }

    public fun build(): CfnBucket.NoncurrentVersionExpirationProperty = cdkBuilder.build()
}
