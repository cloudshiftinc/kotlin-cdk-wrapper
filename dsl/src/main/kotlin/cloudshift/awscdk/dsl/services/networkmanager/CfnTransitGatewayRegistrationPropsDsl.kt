@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.networkmanager

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.networkmanager.CfnTransitGatewayRegistrationProps

@CdkDslMarker
public class CfnTransitGatewayRegistrationPropsDsl {
  private val cdkBuilder: CfnTransitGatewayRegistrationProps.Builder =
      CfnTransitGatewayRegistrationProps.builder()

  /**
   * @param globalNetworkId The ID of the global network. 
   */
  public fun globalNetworkId(globalNetworkId: String) {
    cdkBuilder.globalNetworkId(globalNetworkId)
  }

  /**
   * @param transitGatewayArn The Amazon Resource Name (ARN) of the transit gateway. 
   */
  public fun transitGatewayArn(transitGatewayArn: String) {
    cdkBuilder.transitGatewayArn(transitGatewayArn)
  }

  public fun build(): CfnTransitGatewayRegistrationProps = cdkBuilder.build()
}
