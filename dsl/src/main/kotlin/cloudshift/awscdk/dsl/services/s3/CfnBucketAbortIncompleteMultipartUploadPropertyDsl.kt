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

package cloudshift.awscdk.dsl.services.s3

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.s3.CfnBucket

/**
 * Specifies the days since the initiation of an incomplete multipart upload that Amazon S3 will
 * wait before permanently removing all parts of the upload.
 *
 * For more information, see
 * [Stopping Incomplete Multipart Uploads Using a Bucket Lifecycle Policy](https://docs.aws.amazon.com/AmazonS3/latest/dev/mpuoverview.html#mpu-abort-incomplete-mpu-lifecycle-config)
 * in the *Amazon S3 User Guide* .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.s3.*;
 * AbortIncompleteMultipartUploadProperty abortIncompleteMultipartUploadProperty =
 * AbortIncompleteMultipartUploadProperty.builder()
 * .daysAfterInitiation(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-abortincompletemultipartupload.html)
 */
@CdkDslMarker
public class CfnBucketAbortIncompleteMultipartUploadPropertyDsl {
    private val cdkBuilder: CfnBucket.AbortIncompleteMultipartUploadProperty.Builder =
        CfnBucket.AbortIncompleteMultipartUploadProperty.builder()

    /**
     * @param daysAfterInitiation Specifies the number of days after which Amazon S3 stops an
     *   incomplete multipart upload.
     */
    public fun daysAfterInitiation(daysAfterInitiation: Number) {
        cdkBuilder.daysAfterInitiation(daysAfterInitiation)
    }

    public fun build(): CfnBucket.AbortIncompleteMultipartUploadProperty = cdkBuilder.build()
}
