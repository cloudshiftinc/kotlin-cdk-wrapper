@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ec2.CfnTransitGatewayRouteTablePropagation
import software.constructs.Construct

/**
 * Enables the specified attachment to propagate routes to the specified propagation route table.
 *
 * For more information about enabling transit gateway route propagation, see
 * [EnableTransitGatewayRouteTablePropagation](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_EnableTransitGatewayRouteTablePropagation.html)
 * in the *Amazon EC2 API Reference* .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * CfnTransitGatewayRouteTablePropagation cfnTransitGatewayRouteTablePropagation =
 * CfnTransitGatewayRouteTablePropagation.Builder.create(this,
 * "MyCfnTransitGatewayRouteTablePropagation")
 * .transitGatewayAttachmentId("transitGatewayAttachmentId")
 * .transitGatewayRouteTableId("transitGatewayRouteTableId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewayroutetablepropagation.html)
 */
@CdkDslMarker
public class CfnTransitGatewayRouteTablePropagationDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnTransitGatewayRouteTablePropagation.Builder =
      CfnTransitGatewayRouteTablePropagation.Builder.create(scope, id)

  /**
   * The ID of the attachment.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewayroutetablepropagation.html#cfn-ec2-transitgatewayroutetablepropagation-transitgatewayattachmentid)
   * @param transitGatewayAttachmentId The ID of the attachment. 
   */
  public fun transitGatewayAttachmentId(transitGatewayAttachmentId: String) {
    cdkBuilder.transitGatewayAttachmentId(transitGatewayAttachmentId)
  }

  /**
   * The ID of the propagation route table.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewayroutetablepropagation.html#cfn-ec2-transitgatewayroutetablepropagation-transitgatewayroutetableid)
   * @param transitGatewayRouteTableId The ID of the propagation route table. 
   */
  public fun transitGatewayRouteTableId(transitGatewayRouteTableId: String) {
    cdkBuilder.transitGatewayRouteTableId(transitGatewayRouteTableId)
  }

  public fun build(): CfnTransitGatewayRouteTablePropagation = cdkBuilder.build()
}
