@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ec2.CfnTransitGatewayMulticastGroupMember
import software.constructs.Construct

@CdkDslMarker
public class CfnTransitGatewayMulticastGroupMemberDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnTransitGatewayMulticastGroupMember.Builder =
      CfnTransitGatewayMulticastGroupMember.Builder.create(scope, id)

  public fun groupIpAddress(groupIpAddress: String) {
    cdkBuilder.groupIpAddress(groupIpAddress)
  }

  public fun networkInterfaceId(networkInterfaceId: String) {
    cdkBuilder.networkInterfaceId(networkInterfaceId)
  }

  public fun transitGatewayMulticastDomainId(transitGatewayMulticastDomainId: String) {
    cdkBuilder.transitGatewayMulticastDomainId(transitGatewayMulticastDomainId)
  }

  public fun build(): CfnTransitGatewayMulticastGroupMember = cdkBuilder.build()
}
