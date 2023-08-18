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

package io.cloudshiftdev.awscdkdsl.services.kafkaconnect

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kafkaconnect.CfnConnector

/**
 * Workers can send worker logs to different destination types.
 *
 * This configuration specifies the details of these destinations.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.kafkaconnect.*;
 * WorkerLogDeliveryProperty workerLogDeliveryProperty = WorkerLogDeliveryProperty.builder()
 * .cloudWatchLogs(CloudWatchLogsLogDeliveryProperty.builder()
 * .enabled(false)
 * // the properties below are optional
 * .logGroup("logGroup")
 * .build())
 * .firehose(FirehoseLogDeliveryProperty.builder()
 * .enabled(false)
 * // the properties below are optional
 * .deliveryStream("deliveryStream")
 * .build())
 * .s3(S3LogDeliveryProperty.builder()
 * .enabled(false)
 * // the properties below are optional
 * .bucket("bucket")
 * .prefix("prefix")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kafkaconnect-connector-workerlogdelivery.html)
 */
@CdkDslMarker
public class CfnConnectorWorkerLogDeliveryPropertyDsl {
    private val cdkBuilder: CfnConnector.WorkerLogDeliveryProperty.Builder =
        CfnConnector.WorkerLogDeliveryProperty.builder()

    /** @param cloudWatchLogs Details about delivering logs to Amazon CloudWatch Logs. */
    public fun cloudWatchLogs(cloudWatchLogs: IResolvable) {
        cdkBuilder.cloudWatchLogs(cloudWatchLogs)
    }

    /** @param cloudWatchLogs Details about delivering logs to Amazon CloudWatch Logs. */
    public fun cloudWatchLogs(cloudWatchLogs: CfnConnector.CloudWatchLogsLogDeliveryProperty) {
        cdkBuilder.cloudWatchLogs(cloudWatchLogs)
    }

    /** @param firehose Details about delivering logs to Amazon Kinesis Data Firehose. */
    public fun firehose(firehose: IResolvable) {
        cdkBuilder.firehose(firehose)
    }

    /** @param firehose Details about delivering logs to Amazon Kinesis Data Firehose. */
    public fun firehose(firehose: CfnConnector.FirehoseLogDeliveryProperty) {
        cdkBuilder.firehose(firehose)
    }

    /** @param s3 Details about delivering logs to Amazon S3. */
    public fun s3(s3: IResolvable) {
        cdkBuilder.s3(s3)
    }

    /** @param s3 Details about delivering logs to Amazon S3. */
    public fun s3(s3: CfnConnector.S3LogDeliveryProperty) {
        cdkBuilder.s3(s3)
    }

    public fun build(): CfnConnector.WorkerLogDeliveryProperty = cdkBuilder.build()
}
