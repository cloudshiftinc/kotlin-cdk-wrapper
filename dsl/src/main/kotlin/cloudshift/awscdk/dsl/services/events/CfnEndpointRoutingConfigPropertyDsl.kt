@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.events

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.events.CfnEndpoint

@CdkDslMarker
public class CfnEndpointRoutingConfigPropertyDsl {
  private val cdkBuilder: CfnEndpoint.RoutingConfigProperty.Builder =
      CfnEndpoint.RoutingConfigProperty.builder()

  /**
   * @param failoverConfig The failover configuration for an endpoint. 
   * This includes what triggers failover and what happens when it's triggered.
   */
  public fun failoverConfig(failoverConfig: IResolvable) {
    cdkBuilder.failoverConfig(failoverConfig)
  }

  /**
   * @param failoverConfig The failover configuration for an endpoint. 
   * This includes what triggers failover and what happens when it's triggered.
   */
  public fun failoverConfig(failoverConfig: CfnEndpoint.FailoverConfigProperty) {
    cdkBuilder.failoverConfig(failoverConfig)
  }

  public fun build(): CfnEndpoint.RoutingConfigProperty = cdkBuilder.build()
}
