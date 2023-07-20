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

package cloudshift.awscdk.dsl.services.s3outposts

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.s3outposts.CfnBucket
import kotlin.String

@CdkDslMarker
public class CfnBucketFilterTagPropertyDsl {
    private val cdkBuilder: CfnBucket.FilterTagProperty.Builder =
        CfnBucket.FilterTagProperty.builder()

    public fun key(key: String) {
        cdkBuilder.key(key)
    }

    public fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
    }

    public fun build(): CfnBucket.FilterTagProperty = cdkBuilder.build()
}
