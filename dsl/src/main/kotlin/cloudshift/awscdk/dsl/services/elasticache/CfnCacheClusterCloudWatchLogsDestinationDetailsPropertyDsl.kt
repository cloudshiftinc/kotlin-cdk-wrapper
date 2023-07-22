@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.elasticache

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.elasticache.CfnCacheCluster

@CdkDslMarker
public class CfnCacheClusterCloudWatchLogsDestinationDetailsPropertyDsl {
  private val cdkBuilder: CfnCacheCluster.CloudWatchLogsDestinationDetailsProperty.Builder =
      CfnCacheCluster.CloudWatchLogsDestinationDetailsProperty.builder()

  /**
   * @param logGroup The name of the CloudWatch Logs log group. 
   */
  public fun logGroup(logGroup: String) {
    cdkBuilder.logGroup(logGroup)
  }

  public fun build(): CfnCacheCluster.CloudWatchLogsDestinationDetailsProperty = cdkBuilder.build()
}
