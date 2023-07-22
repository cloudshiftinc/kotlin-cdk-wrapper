@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.elasticache

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.elasticache.CfnReplicationGroup

@CdkDslMarker
public class CfnReplicationGroupCloudWatchLogsDestinationDetailsPropertyDsl {
  private val cdkBuilder: CfnReplicationGroup.CloudWatchLogsDestinationDetailsProperty.Builder =
      CfnReplicationGroup.CloudWatchLogsDestinationDetailsProperty.builder()

  /**
   * @param logGroup The name of the CloudWatch Logs log group. 
   */
  public fun logGroup(logGroup: String) {
    cdkBuilder.logGroup(logGroup)
  }

  public fun build(): CfnReplicationGroup.CloudWatchLogsDestinationDetailsProperty =
      cdkBuilder.build()
}
