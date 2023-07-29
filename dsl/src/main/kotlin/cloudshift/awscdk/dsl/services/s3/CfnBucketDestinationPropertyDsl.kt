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
import kotlin.String
import software.amazon.awscdk.services.s3.CfnBucket

/**
 * Specifies information about where to publish analysis or configuration results for an Amazon S3
 * bucket.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.s3.*;
 * DestinationProperty destinationProperty = DestinationProperty.builder()
 * .bucketArn("bucketArn")
 * .format("format")
 * // the properties below are optional
 * .bucketAccountId("bucketAccountId")
 * .prefix("prefix")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-destination.html)
 */
@CdkDslMarker
public class CfnBucketDestinationPropertyDsl {
    private val cdkBuilder: CfnBucket.DestinationProperty.Builder =
        CfnBucket.DestinationProperty.builder()

    /**
     * @param bucketAccountId The account ID that owns the destination S3 bucket. If no account ID
     *   is provided, the owner is not validated before exporting data.
     *
     * Although this value is optional, we strongly recommend that you set it to help prevent
     * problems if the destination bucket ownership changes.
     */
    public fun bucketAccountId(bucketAccountId: String) {
        cdkBuilder.bucketAccountId(bucketAccountId)
    }

    /** @param bucketArn The Amazon Resource Name (ARN) of the bucket to which data is exported. */
    public fun bucketArn(bucketArn: String) {
        cdkBuilder.bucketArn(bucketArn)
    }

    /** @param format Specifies the file format used when exporting data to Amazon S3. */
    public fun format(format: String) {
        cdkBuilder.format(format)
    }

    /**
     * @param prefix The prefix to use when exporting data. The prefix is prepended to all results.
     */
    public fun prefix(prefix: String) {
        cdkBuilder.prefix(prefix)
    }

    public fun build(): CfnBucket.DestinationProperty = cdkBuilder.build()
}
