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

package cloudshift.awscdk.dsl.services.dynamodb

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.dynamodb.CfnTable

/**
 * The S3 bucket that is being imported from.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.dynamodb.*;
 * S3BucketSourceProperty s3BucketSourceProperty = S3BucketSourceProperty.builder()
 * .s3Bucket("s3Bucket")
 * // the properties below are optional
 * .s3BucketOwner("s3BucketOwner")
 * .s3KeyPrefix("s3KeyPrefix")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-table-s3bucketsource.html)
 */
@CdkDslMarker
public class CfnTableS3BucketSourcePropertyDsl {
    private val cdkBuilder: CfnTable.S3BucketSourceProperty.Builder =
        CfnTable.S3BucketSourceProperty.builder()

    /** @param s3Bucket The S3 bucket that is being imported from. */
    public fun s3Bucket(s3Bucket: String) {
        cdkBuilder.s3Bucket(s3Bucket)
    }

    /**
     * @param s3BucketOwner The account number of the S3 bucket that is being imported from. If the
     *   bucket is owned by the requester this is optional.
     */
    public fun s3BucketOwner(s3BucketOwner: String) {
        cdkBuilder.s3BucketOwner(s3BucketOwner)
    }

    /** @param s3KeyPrefix The key prefix shared by all S3 Objects that are being imported. */
    public fun s3KeyPrefix(s3KeyPrefix: String) {
        cdkBuilder.s3KeyPrefix(s3KeyPrefix)
    }

    public fun build(): CfnTable.S3BucketSourceProperty = cdkBuilder.build()
}
