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

package cloudshift.awscdk.dsl.services.internetmonitor

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.internetmonitor.CfnMonitor

/**
 * Configuration information for other locations that you choose to publish Amazon CloudWatch
 * Internet Monitor internet measurements to, such as Amazon S3.
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

    /** @param bucketName The Amazon S3 bucket name. */
    public fun bucketName(bucketName: String) {
        cdkBuilder.bucketName(bucketName)
    }

    /** @param bucketPrefix The Amazon S3 bucket prefix. */
    public fun bucketPrefix(bucketPrefix: String) {
        cdkBuilder.bucketPrefix(bucketPrefix)
    }

    /**
     * @param logDeliveryStatus The status of publishing Internet Monitor internet measurements to
     *   an Amazon S3 bucket.
     */
    public fun logDeliveryStatus(logDeliveryStatus: String) {
        cdkBuilder.logDeliveryStatus(logDeliveryStatus)
    }

    public fun build(): CfnMonitor.S3ConfigProperty = cdkBuilder.build()
}
