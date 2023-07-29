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

package cloudshift.awscdk.dsl.services.ivschat

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ivschat.CfnLoggingConfiguration

/**
 * The DestinationConfiguration property type describes a location where chat logs will be stored.
 *
 * Each member represents the configuration of one log destination. For logging, you define only one
 * type of destination.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ivschat.*;
 * DestinationConfigurationProperty destinationConfigurationProperty =
 * DestinationConfigurationProperty.builder()
 * .cloudWatchLogs(CloudWatchLogsDestinationConfigurationProperty.builder()
 * .logGroupName("logGroupName")
 * .build())
 * .firehose(FirehoseDestinationConfigurationProperty.builder()
 * .deliveryStreamName("deliveryStreamName")
 * .build())
 * .s3(S3DestinationConfigurationProperty.builder()
 * .bucketName("bucketName")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ivschat-loggingconfiguration-destinationconfiguration.html)
 */
@CdkDslMarker
public class CfnLoggingConfigurationDestinationConfigurationPropertyDsl {
    private val cdkBuilder: CfnLoggingConfiguration.DestinationConfigurationProperty.Builder =
        CfnLoggingConfiguration.DestinationConfigurationProperty.builder()

    /**
     * @param cloudWatchLogs An Amazon CloudWatch Logs destination configuration where chat activity
     *   will be logged.
     */
    public fun cloudWatchLogs(cloudWatchLogs: IResolvable) {
        cdkBuilder.cloudWatchLogs(cloudWatchLogs)
    }

    /**
     * @param cloudWatchLogs An Amazon CloudWatch Logs destination configuration where chat activity
     *   will be logged.
     */
    public fun cloudWatchLogs(
        cloudWatchLogs: CfnLoggingConfiguration.CloudWatchLogsDestinationConfigurationProperty
    ) {
        cdkBuilder.cloudWatchLogs(cloudWatchLogs)
    }

    /**
     * @param firehose An Amazon Kinesis Data Firehose destination configuration where chat activity
     *   will be logged.
     */
    public fun firehose(firehose: IResolvable) {
        cdkBuilder.firehose(firehose)
    }

    /**
     * @param firehose An Amazon Kinesis Data Firehose destination configuration where chat activity
     *   will be logged.
     */
    public fun firehose(
        firehose: CfnLoggingConfiguration.FirehoseDestinationConfigurationProperty
    ) {
        cdkBuilder.firehose(firehose)
    }

    /** @param s3 An Amazon S3 destination configuration where chat activity will be logged. */
    public fun s3(s3: IResolvable) {
        cdkBuilder.s3(s3)
    }

    /** @param s3 An Amazon S3 destination configuration where chat activity will be logged. */
    public fun s3(s3: CfnLoggingConfiguration.S3DestinationConfigurationProperty) {
        cdkBuilder.s3(s3)
    }

    public fun build(): CfnLoggingConfiguration.DestinationConfigurationProperty =
        cdkBuilder.build()
}
