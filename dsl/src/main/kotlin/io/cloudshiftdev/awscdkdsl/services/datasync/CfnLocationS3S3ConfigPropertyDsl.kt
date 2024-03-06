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
import software.amazon.awscdk.services.datasync.CfnLocationS3

/**
 * Specifies the Amazon Resource Name (ARN) of the AWS Identity and Access Management (IAM) role
 * that DataSync uses to access your S3 bucket.
 *
 * For more information, see
 * [Accessing S3 buckets](https://docs.aws.amazon.com/datasync/latest/userguide/create-s3-location.html#create-s3-location-access)
 * .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.datasync.*;
 * S3ConfigProperty s3ConfigProperty = S3ConfigProperty.builder()
 * .bucketAccessRoleArn("bucketAccessRoleArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datasync-locations3-s3config.html)
 */
@CdkDslMarker
public class CfnLocationS3S3ConfigPropertyDsl {
    private val cdkBuilder: CfnLocationS3.S3ConfigProperty.Builder =
        CfnLocationS3.S3ConfigProperty.builder()

    /**
     * @param bucketAccessRoleArn Specifies the ARN of the IAM role that DataSync uses to access
     *   your S3 bucket.
     */
    public fun bucketAccessRoleArn(bucketAccessRoleArn: String) {
        cdkBuilder.bucketAccessRoleArn(bucketAccessRoleArn)
    }

    public fun build(): CfnLocationS3.S3ConfigProperty = cdkBuilder.build()
}
