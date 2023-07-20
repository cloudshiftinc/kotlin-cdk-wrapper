@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.msk

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.msk.CfnCluster

@CdkDslMarker
public class CfnClusterBrokerLogsPropertyDsl {
  private val cdkBuilder: CfnCluster.BrokerLogsProperty.Builder =
      CfnCluster.BrokerLogsProperty.builder()

  public fun cloudWatchLogs(cloudWatchLogs: IResolvable) {
    cdkBuilder.cloudWatchLogs(cloudWatchLogs)
  }

  public fun cloudWatchLogs(cloudWatchLogs: CfnCluster.CloudWatchLogsProperty) {
    cdkBuilder.cloudWatchLogs(cloudWatchLogs)
  }

  public fun firehose(firehose: IResolvable) {
    cdkBuilder.firehose(firehose)
  }

  public fun firehose(firehose: CfnCluster.FirehoseProperty) {
    cdkBuilder.firehose(firehose)
  }

  public fun s3(s3: IResolvable) {
    cdkBuilder.s3(s3)
  }

  public fun s3(s3: CfnCluster.S3Property) {
    cdkBuilder.s3(s3)
  }

  public fun build(): CfnCluster.BrokerLogsProperty = cdkBuilder.build()
}
