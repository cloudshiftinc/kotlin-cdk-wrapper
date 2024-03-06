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
import software.amazon.awscdk.services.stepfunctions.CsvHeaders
import software.amazon.awscdk.services.stepfunctions.S3CsvItemReaderProps

/**
 * Properties for configuring an Item Reader that iterates over items in a CSV file in S3.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.s3.*;
 * import software.amazon.awscdk.services.stepfunctions.*;
 * Bucket bucket;
 * CsvHeaders csvHeaders;
 * S3CsvItemReaderProps s3CsvItemReaderProps = S3CsvItemReaderProps.builder()
 * .bucket(bucket)
 * .key("key")
 * // the properties below are optional
 * .csvHeaders(csvHeaders)
 * .maxItems(123)
 * .build();
 * ```
 */
@CdkDslMarker
public class S3CsvItemReaderPropsDsl {
    private val cdkBuilder: S3CsvItemReaderProps.Builder = S3CsvItemReaderProps.builder()

    /**
     * @param bucket S3 Bucket containing objects to iterate over or a file with a list to iterate
     *   over.
     */
    public fun bucket(bucket: IBucket) {
        cdkBuilder.bucket(bucket)
    }

    /** @param csvHeaders CSV file header configuration. */
    public fun csvHeaders(csvHeaders: CsvHeaders) {
        cdkBuilder.csvHeaders(csvHeaders)
    }

    /** @param key Key of file stored in S3 bucket containing an array to iterate over. */
    public fun key(key: String) {
        cdkBuilder.key(key)
    }

    /** @param maxItems Limits the number of items passed to the Distributed Map state. */
    public fun maxItems(maxItems: Number) {
        cdkBuilder.maxItems(maxItems)
    }

    public fun build(): S3CsvItemReaderProps = cdkBuilder.build()
}
