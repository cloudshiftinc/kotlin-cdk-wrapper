@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.msk

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.msk.CfnCluster

@CdkDslMarker
public class CfnClusterLoggingInfoPropertyDsl {
  private val cdkBuilder: CfnCluster.LoggingInfoProperty.Builder =
      CfnCluster.LoggingInfoProperty.builder()

  /**
   * @param brokerLogs You can configure your MSK cluster to send broker logs to different
   * destination types. 
   * This configuration specifies the details of these destinations.
   */
  public fun brokerLogs(brokerLogs: IResolvable) {
    cdkBuilder.brokerLogs(brokerLogs)
  }

  /**
   * @param brokerLogs You can configure your MSK cluster to send broker logs to different
   * destination types. 
   * This configuration specifies the details of these destinations.
   */
  public fun brokerLogs(brokerLogs: CfnCluster.BrokerLogsProperty) {
    cdkBuilder.brokerLogs(brokerLogs)
  }

  public fun build(): CfnCluster.LoggingInfoProperty = cdkBuilder.build()
}
