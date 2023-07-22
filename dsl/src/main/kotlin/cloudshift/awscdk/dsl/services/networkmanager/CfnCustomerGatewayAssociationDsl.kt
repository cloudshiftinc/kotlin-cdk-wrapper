@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.networkmanager

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.networkmanager.CfnCustomerGatewayAssociation
import software.constructs.Construct

@CdkDslMarker
public class CfnCustomerGatewayAssociationDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnCustomerGatewayAssociation.Builder =
      CfnCustomerGatewayAssociation.Builder.create(scope, id)

  /**
   * The Amazon Resource Name (ARN) of the customer gateway.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-customergatewayassociation.html#cfn-networkmanager-customergatewayassociation-customergatewayarn)
   * @param customerGatewayArn The Amazon Resource Name (ARN) of the customer gateway. 
   */
  public fun customerGatewayArn(customerGatewayArn: String) {
    cdkBuilder.customerGatewayArn(customerGatewayArn)
  }

  /**
   * The ID of the device.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-customergatewayassociation.html#cfn-networkmanager-customergatewayassociation-deviceid)
   * @param deviceId The ID of the device. 
   */
  public fun deviceId(deviceId: String) {
    cdkBuilder.deviceId(deviceId)
  }

  /**
   * The ID of the global network.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-customergatewayassociation.html#cfn-networkmanager-customergatewayassociation-globalnetworkid)
   * @param globalNetworkId The ID of the global network. 
   */
  public fun globalNetworkId(globalNetworkId: String) {
    cdkBuilder.globalNetworkId(globalNetworkId)
  }

  /**
   * The ID of the link.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-customergatewayassociation.html#cfn-networkmanager-customergatewayassociation-linkid)
   * @param linkId The ID of the link. 
   */
  public fun linkId(linkId: String) {
    cdkBuilder.linkId(linkId)
  }

  public fun build(): CfnCustomerGatewayAssociation = cdkBuilder.build()
}
