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

package io.cloudshiftdev.awscdkdsl.services.s3

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.s3.CfnBucket

/**
 * Describes the versioning state of an Amazon S3 bucket.
 *
 * For more information, see
 * [PUT Bucket versioning](https://docs.aws.amazon.com/AmazonS3/latest/API/RESTBucketPUTVersioningStatus.html)
 * in the *Amazon S3 API Reference* .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.s3.*;
 * VersioningConfigurationProperty versioningConfigurationProperty =
 * VersioningConfigurationProperty.builder()
 * .status("status")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-versioningconfiguration.html)
 */
@CdkDslMarker
public class CfnBucketVersioningConfigurationPropertyDsl {
    private val cdkBuilder: CfnBucket.VersioningConfigurationProperty.Builder =
        CfnBucket.VersioningConfigurationProperty.builder()

    /** @param status The versioning state of the bucket. */
    public fun status(status: String) {
        cdkBuilder.status(status)
    }

    public fun build(): CfnBucket.VersioningConfigurationProperty = cdkBuilder.build()
}
