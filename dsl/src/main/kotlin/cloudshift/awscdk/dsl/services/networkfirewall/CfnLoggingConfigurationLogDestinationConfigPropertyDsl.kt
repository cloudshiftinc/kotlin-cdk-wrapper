@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.networkfirewall

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Map
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.networkfirewall.CfnLoggingConfiguration

@CdkDslMarker
public class CfnLoggingConfigurationLogDestinationConfigPropertyDsl {
  private val cdkBuilder: CfnLoggingConfiguration.LogDestinationConfigProperty.Builder =
      CfnLoggingConfiguration.LogDestinationConfigProperty.builder()

  /**
   * @param logDestination The named location for the logs, provided in a key:value mapping that is
   * specific to the chosen destination type. 
   * * For an Amazon S3 bucket, provide the name of the bucket, with key `bucketName` , and
   * optionally provide a prefix, with key `prefix` . The following example specifies an Amazon S3
   * bucket named `DOC-EXAMPLE-BUCKET` and the prefix `alerts` :
   *
   * `"LogDestination": { "bucketName": "DOC-EXAMPLE-BUCKET", "prefix": "alerts" }`
   *
   * * For a CloudWatch log group, provide the name of the CloudWatch log group, with key `logGroup`
   * . The following example specifies a log group named `alert-log-group` :
   *
   * `"LogDestination": { "logGroup": "alert-log-group" }`
   *
   * * For a Kinesis Data Firehose delivery stream, provide the name of the delivery stream, with
   * key `deliveryStream` . The following example specifies a delivery stream named
   * `alert-delivery-stream` :
   *
   * `"LogDestination": { "deliveryStream": "alert-delivery-stream" }`
   */
  public fun logDestination(logDestination: Map<String, String>) {
    cdkBuilder.logDestination(logDestination)
  }

  /**
   * @param logDestination The named location for the logs, provided in a key:value mapping that is
   * specific to the chosen destination type. 
   * * For an Amazon S3 bucket, provide the name of the bucket, with key `bucketName` , and
   * optionally provide a prefix, with key `prefix` . The following example specifies an Amazon S3
   * bucket named `DOC-EXAMPLE-BUCKET` and the prefix `alerts` :
   *
   * `"LogDestination": { "bucketName": "DOC-EXAMPLE-BUCKET", "prefix": "alerts" }`
   *
   * * For a CloudWatch log group, provide the name of the CloudWatch log group, with key `logGroup`
   * . The following example specifies a log group named `alert-log-group` :
   *
   * `"LogDestination": { "logGroup": "alert-log-group" }`
   *
   * * For a Kinesis Data Firehose delivery stream, provide the name of the delivery stream, with
   * key `deliveryStream` . The following example specifies a delivery stream named
   * `alert-delivery-stream` :
   *
   * `"LogDestination": { "deliveryStream": "alert-delivery-stream" }`
   */
  public fun logDestination(logDestination: IResolvable) {
    cdkBuilder.logDestination(logDestination)
  }

  /**
   * @param logDestinationType The type of storage destination to send these logs to. 
   * You can send logs to an Amazon S3 bucket, a CloudWatch log group, or a Kinesis Data Firehose
   * delivery stream.
   */
  public fun logDestinationType(logDestinationType: String) {
    cdkBuilder.logDestinationType(logDestinationType)
  }

  /**
   * @param logType The type of log to send. 
   * Alert logs report traffic that matches a stateful rule with an action setting that sends an
   * alert log message. Flow logs are standard network traffic flow logs.
   */
  public fun logType(logType: String) {
    cdkBuilder.logType(logType)
  }

  public fun build(): CfnLoggingConfiguration.LogDestinationConfigProperty = cdkBuilder.build()
}
