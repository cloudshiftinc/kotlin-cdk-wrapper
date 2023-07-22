@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.mediaconnect

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.mediaconnect.CfnGateway

@CdkDslMarker
public class CfnGatewayGatewayNetworkPropertyDsl {
  private val cdkBuilder: CfnGateway.GatewayNetworkProperty.Builder =
      CfnGateway.GatewayNetworkProperty.builder()

  /**
   * @param cidrBlock A unique IP address range to use for this network. 
   * These IP addresses should be in the form of a Classless Inter-Domain Routing (CIDR) block; for
   * example, 10.0.0.0/16.
   */
  public fun cidrBlock(cidrBlock: String) {
    cdkBuilder.cidrBlock(cidrBlock)
  }

  /**
   * @param name The name of the network. 
   * This name is used to reference the network and must be unique among networks in this gateway.
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun build(): CfnGateway.GatewayNetworkProperty = cdkBuilder.build()
}
