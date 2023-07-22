@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.networkmanager

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.networkmanager.CfnTransitGatewayRegistration
import software.constructs.Construct

@CdkDslMarker
public class CfnTransitGatewayRegistrationDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnTransitGatewayRegistration.Builder =
      CfnTransitGatewayRegistration.Builder.create(scope, id)

  /**
   * The ID of the global network.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-transitgatewayregistration.html#cfn-networkmanager-transitgatewayregistration-globalnetworkid)
   * @param globalNetworkId The ID of the global network. 
   */
  public fun globalNetworkId(globalNetworkId: String) {
    cdkBuilder.globalNetworkId(globalNetworkId)
  }

  /**
   * The Amazon Resource Name (ARN) of the transit gateway.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-transitgatewayregistration.html#cfn-networkmanager-transitgatewayregistration-transitgatewayarn)
   * @param transitGatewayArn The Amazon Resource Name (ARN) of the transit gateway. 
   */
  public fun transitGatewayArn(transitGatewayArn: String) {
    cdkBuilder.transitGatewayArn(transitGatewayArn)
  }

  public fun build(): CfnTransitGatewayRegistration = cdkBuilder.build()
}
