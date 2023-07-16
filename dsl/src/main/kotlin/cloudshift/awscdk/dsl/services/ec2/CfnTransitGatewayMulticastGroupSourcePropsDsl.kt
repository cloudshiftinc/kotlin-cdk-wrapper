@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ec2.CfnTransitGatewayMulticastGroupSourceProps

@CdkDslMarker
public class CfnTransitGatewayMulticastGroupSourcePropsDsl {
  private val cdkBuilder: CfnTransitGatewayMulticastGroupSourceProps.Builder =
      CfnTransitGatewayMulticastGroupSourceProps.builder()

  public fun groupIpAddress(groupIpAddress: String) {
    cdkBuilder.groupIpAddress(groupIpAddress)
  }

  public fun networkInterfaceId(networkInterfaceId: String) {
    cdkBuilder.networkInterfaceId(networkInterfaceId)
  }

  public fun transitGatewayMulticastDomainId(transitGatewayMulticastDomainId: String) {
    cdkBuilder.transitGatewayMulticastDomainId(transitGatewayMulticastDomainId)
  }

  public fun build(): CfnTransitGatewayMulticastGroupSourceProps = cdkBuilder.build()
}
