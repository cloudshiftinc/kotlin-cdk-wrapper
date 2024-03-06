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

package io.cloudshiftdev.awscdkdsl.services.networkfirewall

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Map
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.networkfirewall.CfnLoggingConfiguration

/**
 * Defines where AWS Network Firewall sends logs for the firewall for one log type.
 *
 * This is used in `LoggingConfiguration` . You can send each type of log to an Amazon S3 bucket, a
 * CloudWatch log group, or a Kinesis Data Firehose delivery stream.
 *
 * Network Firewall generates logs for stateful rule groups. You can save alert and flow log types.
 * The stateful rules engine records flow logs for all network traffic that it receives. It records
 * alert logs for traffic that matches stateful rules that have the rule action set to `DROP` or
 * `ALERT` .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.networkfirewall.*;
 * LogDestinationConfigProperty logDestinationConfigProperty =
 * LogDestinationConfigProperty.builder()
 * .logDestination(Map.of(
 * "logDestinationKey", "logDestination"))
 * .logDestinationType("logDestinationType")
 * .logType("logType")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-loggingconfiguration-logdestinationconfig.html)
 */
@CdkDslMarker
public class CfnLoggingConfigurationLogDestinationConfigPropertyDsl {
    private val cdkBuilder: CfnLoggingConfiguration.LogDestinationConfigProperty.Builder =
        CfnLoggingConfiguration.LogDestinationConfigProperty.builder()

    /**
     * @param logDestination The named location for the logs, provided in a key:value mapping that
     *   is specific to the chosen destination type.
     * * For an Amazon S3 bucket, provide the name of the bucket, with key `bucketName` , and
     *   optionally provide a prefix, with key `prefix` . The following example specifies an Amazon
     *   S3 bucket named `DOC-EXAMPLE-BUCKET` and the prefix `alerts` :
     *
     * `"LogDestination": { "bucketName": "DOC-EXAMPLE-BUCKET", "prefix": "alerts" }`
     * * For a CloudWatch log group, provide the name of the CloudWatch log group, with key
     *   `logGroup` . The following example specifies a log group named `alert-log-group` :
     *
     * `"LogDestination": { "logGroup": "alert-log-group" }`
     * * For a Firehose delivery stream, provide the name of the delivery stream, with key
     *   `deliveryStream` . The following example specifies a delivery stream named
     *   `alert-delivery-stream` :
     *
     * `"LogDestination": { "deliveryStream": "alert-delivery-stream" }`
     */
    public fun logDestination(logDestination: Map<String, String>) {
        cdkBuilder.logDestination(logDestination)
    }

    /**
     * @param logDestination The named location for the logs, provided in a key:value mapping that
     *   is specific to the chosen destination type.
     * * For an Amazon S3 bucket, provide the name of the bucket, with key `bucketName` , and
     *   optionally provide a prefix, with key `prefix` . The following example specifies an Amazon
     *   S3 bucket named `DOC-EXAMPLE-BUCKET` and the prefix `alerts` :
     *
     * `"LogDestination": { "bucketName": "DOC-EXAMPLE-BUCKET", "prefix": "alerts" }`
     * * For a CloudWatch log group, provide the name of the CloudWatch log group, with key
     *   `logGroup` . The following example specifies a log group named `alert-log-group` :
     *
     * `"LogDestination": { "logGroup": "alert-log-group" }`
     * * For a Firehose delivery stream, provide the name of the delivery stream, with key
     *   `deliveryStream` . The following example specifies a delivery stream named
     *   `alert-delivery-stream` :
     *
     * `"LogDestination": { "deliveryStream": "alert-delivery-stream" }`
     */
    public fun logDestination(logDestination: IResolvable) {
        cdkBuilder.logDestination(logDestination)
    }

    /**
     * @param logDestinationType The type of storage destination to send these logs to. You can send
     *   logs to an Amazon S3 bucket, a CloudWatch log group, or a Firehose delivery stream.
     */
    public fun logDestinationType(logDestinationType: String) {
        cdkBuilder.logDestinationType(logDestinationType)
    }

    /**
     * @param logType The type of log to send. Alert logs report traffic that matches a stateful
     *   rule with an action setting that sends an alert log message. Flow logs are standard network
     *   traffic flow logs.
     */
    public fun logType(logType: String) {
        cdkBuilder.logType(logType)
    }

    public fun build(): CfnLoggingConfiguration.LogDestinationConfigProperty = cdkBuilder.build()
}
