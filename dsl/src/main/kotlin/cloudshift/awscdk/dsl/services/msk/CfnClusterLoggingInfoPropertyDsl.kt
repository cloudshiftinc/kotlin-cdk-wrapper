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

package cloudshift.awscdk.dsl.services.msk

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.msk.CfnCluster

/**
 * You can configure your MSK cluster to send broker logs to different destination types.
 *
 * This is a container for the configuration details related to broker logs.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.msk.*;
 * LoggingInfoProperty loggingInfoProperty = LoggingInfoProperty.builder()
 * .brokerLogs(BrokerLogsProperty.builder()
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
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-logginginfo.html)
 */
@CdkDslMarker
public class CfnClusterLoggingInfoPropertyDsl {
    private val cdkBuilder: CfnCluster.LoggingInfoProperty.Builder =
        CfnCluster.LoggingInfoProperty.builder()

    /**
     * @param brokerLogs You can configure your MSK cluster to send broker logs to different
     *   destination types. This configuration specifies the details of these destinations.
     */
    public fun brokerLogs(brokerLogs: IResolvable) {
        cdkBuilder.brokerLogs(brokerLogs)
    }

    /**
     * @param brokerLogs You can configure your MSK cluster to send broker logs to different
     *   destination types. This configuration specifies the details of these destinations.
     */
    public fun brokerLogs(brokerLogs: CfnCluster.BrokerLogsProperty) {
        cdkBuilder.brokerLogs(brokerLogs)
    }

    public fun build(): CfnCluster.LoggingInfoProperty = cdkBuilder.build()
}
