@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.networkmanager

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.networkmanager.CfnCustomerGatewayAssociation
import software.constructs.Construct

/**
 * Specifies an association between a customer gateway, a device, and optionally, a link.
 *
 * If you specify a link, it must be associated with the specified device. The customer gateway must
 * be connected to a VPN attachment on a transit gateway that's registered in your global network.
 *
 * You cannot associate a customer gateway with more than one device and link.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.networkmanager.*;
 * CfnCustomerGatewayAssociation cfnCustomerGatewayAssociation =
 * CfnCustomerGatewayAssociation.Builder.create(this, "MyCfnCustomerGatewayAssociation")
 * .customerGatewayArn("customerGatewayArn")
 * .deviceId("deviceId")
 * .globalNetworkId("globalNetworkId")
 * // the properties below are optional
 * .linkId("linkId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-customergatewayassociation.html)
 */
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
