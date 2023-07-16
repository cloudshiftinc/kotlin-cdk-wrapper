@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kafkaconnect

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kafkaconnect.CfnConnector

@CdkDslMarker
public class CfnConnectorWorkerLogDeliveryPropertyDsl {
  private val cdkBuilder: CfnConnector.WorkerLogDeliveryProperty.Builder =
      CfnConnector.WorkerLogDeliveryProperty.builder()

  public fun cloudWatchLogs(cloudWatchLogs: IResolvable) {
    cdkBuilder.cloudWatchLogs(cloudWatchLogs)
  }

  public fun cloudWatchLogs(cloudWatchLogs: CfnConnector.CloudWatchLogsLogDeliveryProperty) {
    cdkBuilder.cloudWatchLogs(cloudWatchLogs)
  }

  public fun firehose(firehose: IResolvable) {
    cdkBuilder.firehose(firehose)
  }

  public fun firehose(firehose: CfnConnector.FirehoseLogDeliveryProperty) {
    cdkBuilder.firehose(firehose)
  }

  public fun s3(s3: IResolvable) {
    cdkBuilder.s3(s3)
  }

  public fun s3(s3: CfnConnector.S3LogDeliveryProperty) {
    cdkBuilder.s3(s3)
  }

  public fun build(): CfnConnector.WorkerLogDeliveryProperty = cdkBuilder.build()
}
