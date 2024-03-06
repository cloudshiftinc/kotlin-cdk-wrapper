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
import software.amazon.awscdk.services.stepfunctions.S3ObjectsItemReader

/**
 * Item Reader configuration for iterating over objects in an S3 bucket.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.s3.*;
 * import software.amazon.awscdk.services.stepfunctions.*;
 * Bucket bucket;
 * S3ObjectsItemReader s3ObjectsItemReader = S3ObjectsItemReader.Builder.create()
 * .bucket(bucket)
 * // the properties below are optional
 * .maxItems(123)
 * .prefix("prefix")
 * .build();
 * ```
 */
@CdkDslMarker
public class S3ObjectsItemReaderDsl {
    private val cdkBuilder: S3ObjectsItemReader.Builder = S3ObjectsItemReader.Builder.create()

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
     * Limits the number of items passed to the Distributed Map state.
     *
     * Default: - Distributed Map state will iterate over all items provided by the ItemReader
     *
     * @param maxItems Limits the number of items passed to the Distributed Map state.
     */
    public fun maxItems(maxItems: Number) {
        cdkBuilder.maxItems(maxItems)
    }

    /**
     * S3 prefix used to limit objects to iterate over.
     *
     * Default: - No prefix
     *
     * @param prefix S3 prefix used to limit objects to iterate over.
     */
    public fun prefix(prefix: String) {
        cdkBuilder.prefix(prefix)
    }

    public fun build(): S3ObjectsItemReader = cdkBuilder.build()
}
