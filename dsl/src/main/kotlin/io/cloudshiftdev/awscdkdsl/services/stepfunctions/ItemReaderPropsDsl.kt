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
import software.amazon.awscdk.services.s3.IBucket
import software.amazon.awscdk.services.stepfunctions.ItemReaderProps

/**
 * Base interface for Item Reader configuration properties.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.s3.*;
 * import software.amazon.awscdk.services.stepfunctions.*;
 * Bucket bucket;
 * ItemReaderProps itemReaderProps = ItemReaderProps.builder()
 * .bucket(bucket)
 * // the properties below are optional
 * .maxItems(123)
 * .build();
 * ```
 */
@CdkDslMarker
public class ItemReaderPropsDsl {
    private val cdkBuilder: ItemReaderProps.Builder = ItemReaderProps.builder()

    /**
     * @param bucket S3 Bucket containing objects to iterate over or a file with a list to iterate
     *   over.
     */
    public fun bucket(bucket: IBucket) {
        cdkBuilder.bucket(bucket)
    }

    /** @param maxItems Limits the number of items passed to the Distributed Map state. */
    public fun maxItems(maxItems: Number) {
        cdkBuilder.maxItems(maxItems)
    }

    public fun build(): ItemReaderProps = cdkBuilder.build()
}
