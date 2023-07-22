@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ec2.CfnTransitGatewayMulticastDomainAssociationProps

@CdkDslMarker
public class CfnTransitGatewayMulticastDomainAssociationPropsDsl {
  private val cdkBuilder: CfnTransitGatewayMulticastDomainAssociationProps.Builder =
      CfnTransitGatewayMulticastDomainAssociationProps.builder()

  /**
   * @param subnetId The IDs of the subnets to associate with the transit gateway multicast domain. 
   */
  public fun subnetId(subnetId: String) {
    cdkBuilder.subnetId(subnetId)
  }

  /**
   * @param transitGatewayAttachmentId The ID of the transit gateway attachment. 
   */
  public fun transitGatewayAttachmentId(transitGatewayAttachmentId: String) {
    cdkBuilder.transitGatewayAttachmentId(transitGatewayAttachmentId)
  }

  /**
   * @param transitGatewayMulticastDomainId The ID of the transit gateway multicast domain. 
   */
  public fun transitGatewayMulticastDomainId(transitGatewayMulticastDomainId: String) {
    cdkBuilder.transitGatewayMulticastDomainId(transitGatewayMulticastDomainId)
  }

  public fun build(): CfnTransitGatewayMulticastDomainAssociationProps = cdkBuilder.build()
}
