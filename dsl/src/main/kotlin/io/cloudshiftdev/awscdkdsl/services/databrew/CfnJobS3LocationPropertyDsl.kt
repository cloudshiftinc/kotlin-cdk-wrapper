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

package io.cloudshiftdev.awscdkdsl.services.databrew

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.databrew.CfnJob

/**
 * Represents an Amazon S3 location (bucket name, bucket owner, and object key) where DataBrew can
 * read input data, or write output from a job.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.databrew.*;
 * S3LocationProperty s3LocationProperty = S3LocationProperty.builder()
 * .bucket("bucket")
 * // the properties below are optional
 * .bucketOwner("bucketOwner")
 * .key("key")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-job-s3location.html)
 */
@CdkDslMarker
public class CfnJobS3LocationPropertyDsl {
    private val cdkBuilder: CfnJob.S3LocationProperty.Builder = CfnJob.S3LocationProperty.builder()

    /** @param bucket The Amazon S3 bucket name. */
    public fun bucket(bucket: String) {
        cdkBuilder.bucket(bucket)
    }

    /** @param bucketOwner The AWS account ID of the bucket owner. */
    public fun bucketOwner(bucketOwner: String) {
        cdkBuilder.bucketOwner(bucketOwner)
    }

    /** @param key The unique name of the object in the bucket. */
    public fun key(key: String) {
        cdkBuilder.key(key)
    }

    public fun build(): CfnJob.S3LocationProperty = cdkBuilder.build()
}
