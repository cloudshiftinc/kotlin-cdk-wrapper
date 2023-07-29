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

package cloudshift.awscdk.dsl.services.elasticache

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.elasticache.CfnCacheCluster

/**
 * Configuration details of either a CloudWatch Logs destination or Kinesis Data Firehose
 * destination.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.elasticache.*;
 * DestinationDetailsProperty destinationDetailsProperty = DestinationDetailsProperty.builder()
 * .cloudWatchLogsDetails(CloudWatchLogsDestinationDetailsProperty.builder()
 * .logGroup("logGroup")
 * .build())
 * .kinesisFirehoseDetails(KinesisFirehoseDestinationDetailsProperty.builder()
 * .deliveryStream("deliveryStream")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-cachecluster-destinationdetails.html)
 */
@CdkDslMarker
public class CfnCacheClusterDestinationDetailsPropertyDsl {
    private val cdkBuilder: CfnCacheCluster.DestinationDetailsProperty.Builder =
        CfnCacheCluster.DestinationDetailsProperty.builder()

    /**
     * @param cloudWatchLogsDetails The configuration details of the CloudWatch Logs destination.
     *   Note that this field is marked as required but only if CloudWatch Logs was chosen as the
     *   destination.
     */
    public fun cloudWatchLogsDetails(cloudWatchLogsDetails: IResolvable) {
        cdkBuilder.cloudWatchLogsDetails(cloudWatchLogsDetails)
    }

    /**
     * @param cloudWatchLogsDetails The configuration details of the CloudWatch Logs destination.
     *   Note that this field is marked as required but only if CloudWatch Logs was chosen as the
     *   destination.
     */
    public fun cloudWatchLogsDetails(
        cloudWatchLogsDetails: CfnCacheCluster.CloudWatchLogsDestinationDetailsProperty
    ) {
        cdkBuilder.cloudWatchLogsDetails(cloudWatchLogsDetails)
    }

    /**
     * @param kinesisFirehoseDetails The configuration details of the Kinesis Data Firehose
     *   destination. Note that this field is marked as required but only if Kinesis Data Firehose
     *   was chosen as the destination.
     */
    public fun kinesisFirehoseDetails(kinesisFirehoseDetails: IResolvable) {
        cdkBuilder.kinesisFirehoseDetails(kinesisFirehoseDetails)
    }

    /**
     * @param kinesisFirehoseDetails The configuration details of the Kinesis Data Firehose
     *   destination. Note that this field is marked as required but only if Kinesis Data Firehose
     *   was chosen as the destination.
     */
    public fun kinesisFirehoseDetails(
        kinesisFirehoseDetails: CfnCacheCluster.KinesisFirehoseDestinationDetailsProperty
    ) {
        cdkBuilder.kinesisFirehoseDetails(kinesisFirehoseDetails)
    }

    public fun build(): CfnCacheCluster.DestinationDetailsProperty = cdkBuilder.build()
}
