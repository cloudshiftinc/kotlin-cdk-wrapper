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
 * Configures the transfer acceleration state for an Amazon S3 bucket.
 *
 * For more information, see
 * [Amazon S3 Transfer Acceleration](https://docs.aws.amazon.com/AmazonS3/latest/dev/transfer-acceleration.html)
 * in the *Amazon S3 User Guide* .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.s3.*;
 * AccelerateConfigurationProperty accelerateConfigurationProperty =
 * AccelerateConfigurationProperty.builder()
 * .accelerationStatus("accelerationStatus")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-accelerateconfiguration.html)
 */
@CdkDslMarker
public class CfnBucketAccelerateConfigurationPropertyDsl {
    private val cdkBuilder: CfnBucket.AccelerateConfigurationProperty.Builder =
        CfnBucket.AccelerateConfigurationProperty.builder()

    /** @param accelerationStatus Specifies the transfer acceleration status of the bucket. */
    public fun accelerationStatus(accelerationStatus: String) {
        cdkBuilder.accelerationStatus(accelerationStatus)
    }

    public fun build(): CfnBucket.AccelerateConfigurationProperty = cdkBuilder.build()
}
