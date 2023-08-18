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

package io.cloudshiftdev.awscdkdsl.services.msk

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.msk.CfnCluster

/**
 * The broker logs configuration for this MSK cluster.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.msk.*;
 * BrokerLogsProperty brokerLogsProperty = BrokerLogsProperty.builder()
 * .cloudWatchLogs(CloudWatchLogsProperty.builder()
 * .enabled(false)
 * // the properties below are optional
 * .logGroup("logGroup")
 * .build())
 * .firehose(FirehoseProperty.builder()
 * .enabled(false)
 * // the properties below are optional
 * .deliveryStream("deliveryStream")
 * .build())
 * .s3(S3Property.builder()
 * .enabled(false)
 * // the properties below are optional
 * .bucket("bucket")
 * .prefix("prefix")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-brokerlogs.html)
 */
@CdkDslMarker
public class CfnClusterBrokerLogsPropertyDsl {
    private val cdkBuilder: CfnCluster.BrokerLogsProperty.Builder =
        CfnCluster.BrokerLogsProperty.builder()

    /** @param cloudWatchLogs Details of the CloudWatch Logs destination for broker logs. */
    public fun cloudWatchLogs(cloudWatchLogs: IResolvable) {
        cdkBuilder.cloudWatchLogs(cloudWatchLogs)
    }

    /** @param cloudWatchLogs Details of the CloudWatch Logs destination for broker logs. */
    public fun cloudWatchLogs(cloudWatchLogs: CfnCluster.CloudWatchLogsProperty) {
        cdkBuilder.cloudWatchLogs(cloudWatchLogs)
    }

    /**
     * @param firehose Details of the Kinesis Data Firehose delivery stream that is the destination
     *   for broker logs.
     */
    public fun firehose(firehose: IResolvable) {
        cdkBuilder.firehose(firehose)
    }

    /**
     * @param firehose Details of the Kinesis Data Firehose delivery stream that is the destination
     *   for broker logs.
     */
    public fun firehose(firehose: CfnCluster.FirehoseProperty) {
        cdkBuilder.firehose(firehose)
    }

    /** @param s3 Details of the Amazon S3 destination for broker logs. */
    public fun s3(s3: IResolvable) {
        cdkBuilder.s3(s3)
    }

    /** @param s3 Details of the Amazon S3 destination for broker logs. */
    public fun s3(s3: CfnCluster.S3Property) {
        cdkBuilder.s3(s3)
    }

    public fun build(): CfnCluster.BrokerLogsProperty = cdkBuilder.build()
}
