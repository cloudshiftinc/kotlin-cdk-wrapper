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

package io.cloudshiftdev.awscdkdsl.services.internetmonitor

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.internetmonitor.CfnMonitor

/**
 * The configuration for publishing Amazon CloudWatch Internet Monitor internet measurements to
 * Amazon S3.
 *
 * The configuration includes the bucket name and (optionally) bucket prefix for the S3 bucket to
 * store the measurements, and the delivery status. The delivery status is `ENABLED` if you choose
 * to deliver internet measurements to S3 logs, and `DISABLED` otherwise.
 *
 * The measurements are also published to Amazon CloudWatch Logs.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.internetmonitor.*;
 * S3ConfigProperty s3ConfigProperty = S3ConfigProperty.builder()
 * .bucketName("bucketName")
 * .bucketPrefix("bucketPrefix")
 * .logDeliveryStatus("logDeliveryStatus")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-internetmonitor-monitor-s3config.html)
 */
@CdkDslMarker
public class CfnMonitorS3ConfigPropertyDsl {
    private val cdkBuilder: CfnMonitor.S3ConfigProperty.Builder =
        CfnMonitor.S3ConfigProperty.builder()

    /** @param bucketName The Amazon S3 bucket name for internet measurements publishing. */
    public fun bucketName(bucketName: String) {
        cdkBuilder.bucketName(bucketName)
    }

    /**
     * @param bucketPrefix An optional Amazon S3 bucket prefix for internet measurements publishing.
     */
    public fun bucketPrefix(bucketPrefix: String) {
        cdkBuilder.bucketPrefix(bucketPrefix)
    }

    /**
     * @param logDeliveryStatus The status of publishing Internet Monitor internet measurements to
     *   an Amazon S3 bucket. The delivery status is `ENABLED` if you choose to deliver internet
     *   measurements to an S3 bucket, and `DISABLED` otherwise.
     */
    public fun logDeliveryStatus(logDeliveryStatus: String) {
        cdkBuilder.logDeliveryStatus(logDeliveryStatus)
    }

    public fun build(): CfnMonitor.S3ConfigProperty = cdkBuilder.build()
}
