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

package io.cloudshiftdev.awscdkdsl.services.stepfunctions

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.s3.IBucket
import software.amazon.awscdk.services.stepfunctions.S3ManifestItemReader

/**
 * Item Reader configuration for iterating over items in a S3 inventory manifest file stored in S3.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.s3.*;
 * import software.amazon.awscdk.services.stepfunctions.*;
 * Bucket bucket;
 * S3ManifestItemReader s3ManifestItemReader = S3ManifestItemReader.Builder.create()
 * .bucket(bucket)
 * .key("key")
 * // the properties below are optional
 * .maxItems(123)
 * .build();
 * ```
 */
@CdkDslMarker
public class S3ManifestItemReaderDsl {
    private val cdkBuilder: S3ManifestItemReader.Builder = S3ManifestItemReader.Builder.create()

    /**
     * S3 Bucket containing objects to iterate over or a file with a list to iterate over.
     *
     * @param bucket S3 Bucket containing objects to iterate over or a file with a list to iterate
     *   over.
     */
    public fun bucket(bucket: IBucket) {
        cdkBuilder.bucket(bucket)
    }

    /**
     * Key of file stored in S3 bucket containing an array to iterate over.
     *
     * @param key Key of file stored in S3 bucket containing an array to iterate over.
     */
    public fun key(key: String) {
        cdkBuilder.key(key)
    }

    /**
     * Limits the number of items passed to the Distributed Map state.
     *
     * Default: - Distributed Map state will iterate over all items provided by the ItemReader
     *
     * @param maxItems Limits the number of items passed to the Distributed Map state.
     */
    public fun maxItems(maxItems: Number) {
        cdkBuilder.maxItems(maxItems)
    }

    public fun build(): S3ManifestItemReader = cdkBuilder.build()
}
