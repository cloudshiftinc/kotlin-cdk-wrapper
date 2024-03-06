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

package io.cloudshiftdev.awscdkdsl.services.datasync

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.datasync.CfnTask

/**
 * Specifies the Amazon S3 bucket where DataSync uploads your
 * [task report](https://docs.aws.amazon.com/datasync/latest/userguide/task-reports.html) .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.datasync.*;
 * S3Property s3Property = S3Property.builder()
 * .bucketAccessRoleArn("bucketAccessRoleArn")
 * .s3BucketArn("s3BucketArn")
 * .subdirectory("subdirectory")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datasync-task-s3.html)
 */
@CdkDslMarker
public class CfnTaskS3PropertyDsl {
    private val cdkBuilder: CfnTask.S3Property.Builder = CfnTask.S3Property.builder()

    /**
     * @param bucketAccessRoleArn Specifies the Amazon Resource Name (ARN) of the IAM policy that
     *   allows DataSync to upload a task report to your S3 bucket. For more information, see
     *   [Allowing DataSync to upload a task report to an Amazon S3 bucket](https://docs.aws.amazon.com/datasync/latest/userguide/creating-task-reports.html)
     *   .
     */
    public fun bucketAccessRoleArn(bucketAccessRoleArn: String) {
        cdkBuilder.bucketAccessRoleArn(bucketAccessRoleArn)
    }

    /** @param s3BucketArn Specifies the ARN of the S3 bucket where DataSync uploads your report. */
    public fun s3BucketArn(s3BucketArn: String) {
        cdkBuilder.s3BucketArn(s3BucketArn)
    }

    /** @param subdirectory Specifies a bucket prefix for your report. */
    public fun subdirectory(subdirectory: String) {
        cdkBuilder.subdirectory(subdirectory)
    }

    public fun build(): CfnTask.S3Property = cdkBuilder.build()
}
