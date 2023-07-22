@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ec2.CfnClientVpnTargetNetworkAssociationProps

@CdkDslMarker
public class CfnClientVpnTargetNetworkAssociationPropsDsl {
  private val cdkBuilder: CfnClientVpnTargetNetworkAssociationProps.Builder =
      CfnClientVpnTargetNetworkAssociationProps.builder()

  /**
   * @param clientVpnEndpointId The ID of the Client VPN endpoint. 
   */
  public fun clientVpnEndpointId(clientVpnEndpointId: String) {
    cdkBuilder.clientVpnEndpointId(clientVpnEndpointId)
  }

  /**
   * @param subnetId The ID of the subnet to associate with the Client VPN endpoint. 
   */
  public fun subnetId(subnetId: String) {
    cdkBuilder.subnetId(subnetId)
  }

  public fun build(): CfnClientVpnTargetNetworkAssociationProps = cdkBuilder.build()
}
