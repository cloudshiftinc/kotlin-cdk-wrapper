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
import kotlin.Boolean
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.s3.CfnStorageLens

/**
 * This resource enables the Amazon CloudWatch publishing option for Amazon S3 Storage Lens metrics.
 *
 * For more information, see
 * [Monitor S3 Storage Lens metrics in CloudWatch](https://docs.aws.amazon.com/AmazonS3/latest/userguide/storage_lens_view_metrics_cloudwatch.html)
 * in the *Amazon S3 User Guide* .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.s3.*;
 * CloudWatchMetricsProperty cloudWatchMetricsProperty = CloudWatchMetricsProperty.builder()
 * .isEnabled(false)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-storagelens-cloudwatchmetrics.html)
 */
@CdkDslMarker
public class CfnStorageLensCloudWatchMetricsPropertyDsl {
    private val cdkBuilder: CfnStorageLens.CloudWatchMetricsProperty.Builder =
        CfnStorageLens.CloudWatchMetricsProperty.builder()

    /**
     * @param isEnabled This property identifies whether the CloudWatch publishing option for S3
     *   Storage Lens is enabled.
     */
    public fun isEnabled(isEnabled: Boolean) {
        cdkBuilder.isEnabled(isEnabled)
    }

    /**
     * @param isEnabled This property identifies whether the CloudWatch publishing option for S3
     *   Storage Lens is enabled.
     */
    public fun isEnabled(isEnabled: IResolvable) {
        cdkBuilder.isEnabled(isEnabled)
    }

    public fun build(): CfnStorageLens.CloudWatchMetricsProperty = cdkBuilder.build()
}
