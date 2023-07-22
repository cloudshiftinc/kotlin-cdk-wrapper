@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.networkmanager

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.networkmanager.CfnCustomerGatewayAssociationProps

@CdkDslMarker
public class CfnCustomerGatewayAssociationPropsDsl {
  private val cdkBuilder: CfnCustomerGatewayAssociationProps.Builder =
      CfnCustomerGatewayAssociationProps.builder()

  /**
   * @param customerGatewayArn The Amazon Resource Name (ARN) of the customer gateway. 
   */
  public fun customerGatewayArn(customerGatewayArn: String) {
    cdkBuilder.customerGatewayArn(customerGatewayArn)
  }

  /**
   * @param deviceId The ID of the device. 
   */
  public fun deviceId(deviceId: String) {
    cdkBuilder.deviceId(deviceId)
  }

  /**
   * @param globalNetworkId The ID of the global network. 
   */
  public fun globalNetworkId(globalNetworkId: String) {
    cdkBuilder.globalNetworkId(globalNetworkId)
  }

  /**
   * @param linkId The ID of the link.
   */
  public fun linkId(linkId: String) {
    cdkBuilder.linkId(linkId)
  }

  public fun build(): CfnCustomerGatewayAssociationProps = cdkBuilder.build()
}
