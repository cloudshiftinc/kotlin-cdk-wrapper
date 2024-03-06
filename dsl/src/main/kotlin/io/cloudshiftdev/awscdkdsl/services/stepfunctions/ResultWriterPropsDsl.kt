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
import kotlin.String
import software.amazon.awscdk.services.s3.IBucket
import software.amazon.awscdk.services.stepfunctions.ResultWriterProps

/**
 * Interface for Result Writer configuration properties.
 *
 * Example:
 * ```
 * import software.amazon.awscdk.services.s3.*;
 * // create a bucket
 * Bucket bucket = new Bucket(this, "Bucket");
 * DistributedMap distributedMap = DistributedMap.Builder.create(this, "Distributed Map State")
 * .itemReader(S3JsonItemReader.Builder.create()
 * .bucket(bucket)
 * .key("my-key.json")
 * .build())
 * .resultWriter(ResultWriter.Builder.create()
 * .bucket(bucket)
 * .prefix("my-prefix")
 * .build())
 * .build();
 * distributedMap.itemProcessor(new Pass(this, "Pass State"));
 * ```
 */
@CdkDslMarker
public class ResultWriterPropsDsl {
    private val cdkBuilder: ResultWriterProps.Builder = ResultWriterProps.builder()

    /** @param bucket S3 Bucket in which to save Map Run results. */
    public fun bucket(bucket: IBucket) {
        cdkBuilder.bucket(bucket)
    }

    /** @param prefix S3 prefix in which to save Map Run results. */
    public fun prefix(prefix: String) {
        cdkBuilder.prefix(prefix)
    }

    public fun build(): ResultWriterProps = cdkBuilder.build()
}
