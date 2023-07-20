@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.msk

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.msk.CfnCluster

@CdkDslMarker
public class CfnClusterLoggingInfoPropertyDsl {
  private val cdkBuilder: CfnCluster.LoggingInfoProperty.Builder =
      CfnCluster.LoggingInfoProperty.builder()

  public fun brokerLogs(brokerLogs: IResolvable) {
    cdkBuilder.brokerLogs(brokerLogs)
  }

  public fun brokerLogs(brokerLogs: CfnCluster.BrokerLogsProperty) {
    cdkBuilder.brokerLogs(brokerLogs)
  }

  public fun build(): CfnCluster.LoggingInfoProperty = cdkBuilder.build()
}
