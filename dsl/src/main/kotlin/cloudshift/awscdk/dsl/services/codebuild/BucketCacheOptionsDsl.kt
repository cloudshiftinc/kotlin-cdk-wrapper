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

package cloudshift.awscdk.dsl.services.codebuild

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.codebuild.BucketCacheOptions

/**
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.codebuild.*;
 * BucketCacheOptions bucketCacheOptions = BucketCacheOptions.builder()
 * .prefix("prefix")
 * .build();
 * ```
 */
@CdkDslMarker
public class BucketCacheOptionsDsl {
    private val cdkBuilder: BucketCacheOptions.Builder = BucketCacheOptions.builder()

    /** @param prefix The prefix to use to store the cache in the bucket. */
    public fun prefix(prefix: String) {
        cdkBuilder.prefix(prefix)
    }

    public fun build(): BucketCacheOptions = cdkBuilder.build()
}
