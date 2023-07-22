@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ec2.CfnVPCGatewayAttachment
import software.constructs.Construct

@CdkDslMarker
public class CfnVPCGatewayAttachmentDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnVPCGatewayAttachment.Builder =
      CfnVPCGatewayAttachment.Builder.create(scope, id)

  /**
   * The ID of the internet gateway.
   *
   * You must specify either `InternetGatewayId` or `VpnGatewayId` , but not both.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcgatewayattachment.html#cfn-ec2-vpcgatewayattachment-internetgatewayid)
   * @param internetGatewayId The ID of the internet gateway. 
   */
  public fun internetGatewayId(internetGatewayId: String) {
    cdkBuilder.internetGatewayId(internetGatewayId)
  }

  /**
   * The ID of the VPC.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcgatewayattachment.html#cfn-ec2-vpcgatewayattachment-vpcid)
   * @param vpcId The ID of the VPC. 
   */
  public fun vpcId(vpcId: String) {
    cdkBuilder.vpcId(vpcId)
  }

  /**
   * The ID of the virtual private gateway.
   *
   * You must specify either `InternetGatewayId` or `VpnGatewayId` , but not both.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcgatewayattachment.html#cfn-ec2-vpcgatewayattachment-vpngatewayid)
   * @param vpnGatewayId The ID of the virtual private gateway. 
   */
  public fun vpnGatewayId(vpnGatewayId: String) {
    cdkBuilder.vpnGatewayId(vpnGatewayId)
  }

  public fun build(): CfnVPCGatewayAttachment = cdkBuilder.build()
}
