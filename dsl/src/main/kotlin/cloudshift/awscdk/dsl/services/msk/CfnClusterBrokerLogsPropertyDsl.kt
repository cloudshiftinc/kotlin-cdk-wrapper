@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.msk

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.msk.CfnCluster

@CdkDslMarker
public class CfnClusterBrokerLogsPropertyDsl {
  private val cdkBuilder: CfnCluster.BrokerLogsProperty.Builder =
      CfnCluster.BrokerLogsProperty.builder()

  /**
   * @param cloudWatchLogs Details of the CloudWatch Logs destination for broker logs.
   */
  public fun cloudWatchLogs(cloudWatchLogs: IResolvable) {
    cdkBuilder.cloudWatchLogs(cloudWatchLogs)
  }

  /**
   * @param cloudWatchLogs Details of the CloudWatch Logs destination for broker logs.
   */
  public fun cloudWatchLogs(cloudWatchLogs: CfnCluster.CloudWatchLogsProperty) {
    cdkBuilder.cloudWatchLogs(cloudWatchLogs)
  }

  /**
   * @param firehose Details of the Kinesis Data Firehose delivery stream that is the destination
   * for broker logs.
   */
  public fun firehose(firehose: IResolvable) {
    cdkBuilder.firehose(firehose)
  }

  /**
   * @param firehose Details of the Kinesis Data Firehose delivery stream that is the destination
   * for broker logs.
   */
  public fun firehose(firehose: CfnCluster.FirehoseProperty) {
    cdkBuilder.firehose(firehose)
  }

  /**
   * @param s3 Details of the Amazon S3 destination for broker logs.
   */
  public fun s3(s3: IResolvable) {
    cdkBuilder.s3(s3)
  }

  /**
   * @param s3 Details of the Amazon S3 destination for broker logs.
   */
  public fun s3(s3: CfnCluster.S3Property) {
    cdkBuilder.s3(s3)
  }

  public fun build(): CfnCluster.BrokerLogsProperty = cdkBuilder.build()
}
