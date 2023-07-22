@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kafkaconnect

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kafkaconnect.CfnConnector

@CdkDslMarker
public class CfnConnectorWorkerLogDeliveryPropertyDsl {
  private val cdkBuilder: CfnConnector.WorkerLogDeliveryProperty.Builder =
      CfnConnector.WorkerLogDeliveryProperty.builder()

  /**
   * @param cloudWatchLogs Details about delivering logs to Amazon CloudWatch Logs.
   */
  public fun cloudWatchLogs(cloudWatchLogs: IResolvable) {
    cdkBuilder.cloudWatchLogs(cloudWatchLogs)
  }

  /**
   * @param cloudWatchLogs Details about delivering logs to Amazon CloudWatch Logs.
   */
  public fun cloudWatchLogs(cloudWatchLogs: CfnConnector.CloudWatchLogsLogDeliveryProperty) {
    cdkBuilder.cloudWatchLogs(cloudWatchLogs)
  }

  /**
   * @param firehose Details about delivering logs to Amazon Kinesis Data Firehose.
   */
  public fun firehose(firehose: IResolvable) {
    cdkBuilder.firehose(firehose)
  }

  /**
   * @param firehose Details about delivering logs to Amazon Kinesis Data Firehose.
   */
  public fun firehose(firehose: CfnConnector.FirehoseLogDeliveryProperty) {
    cdkBuilder.firehose(firehose)
  }

  /**
   * @param s3 Details about delivering logs to Amazon S3.
   */
  public fun s3(s3: IResolvable) {
    cdkBuilder.s3(s3)
  }

  /**
   * @param s3 Details about delivering logs to Amazon S3.
   */
  public fun s3(s3: CfnConnector.S3LogDeliveryProperty) {
    cdkBuilder.s3(s3)
  }

  public fun build(): CfnConnector.WorkerLogDeliveryProperty = cdkBuilder.build()
}
