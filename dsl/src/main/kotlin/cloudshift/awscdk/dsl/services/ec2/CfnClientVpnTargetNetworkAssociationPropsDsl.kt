@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ec2.CfnClientVpnTargetNetworkAssociationProps

/**
 * Properties for defining a `CfnClientVpnTargetNetworkAssociation`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * CfnClientVpnTargetNetworkAssociationProps cfnClientVpnTargetNetworkAssociationProps =
 * CfnClientVpnTargetNetworkAssociationProps.builder()
 * .clientVpnEndpointId("clientVpnEndpointId")
 * .subnetId("subnetId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-clientvpntargetnetworkassociation.html)
 */
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
