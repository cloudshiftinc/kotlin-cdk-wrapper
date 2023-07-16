@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.msk

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.msk.CfnCluster

@CdkDslMarker
public class CfnClusterCloudWatchLogsPropertyDsl {
  private val cdkBuilder: CfnCluster.CloudWatchLogsProperty.Builder =
      CfnCluster.CloudWatchLogsProperty.builder()

  public fun enabled(enabled: Boolean) {
    cdkBuilder.enabled(enabled)
  }

  public fun enabled(enabled: IResolvable) {
    cdkBuilder.enabled(enabled)
  }

  public fun logGroup(logGroup: String) {
    cdkBuilder.logGroup(logGroup)
  }

  public fun build(): CfnCluster.CloudWatchLogsProperty = cdkBuilder.build()
}
