@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ec2.CfnClientVpnRoute
import software.constructs.Construct

@CdkDslMarker
public class CfnClientVpnRouteDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnClientVpnRoute.Builder = CfnClientVpnRoute.Builder.create(scope, id)

  public fun clientVpnEndpointId(clientVpnEndpointId: String) {
    cdkBuilder.clientVpnEndpointId(clientVpnEndpointId)
  }

  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  public fun destinationCidrBlock(destinationCidrBlock: String) {
    cdkBuilder.destinationCidrBlock(destinationCidrBlock)
  }

  public fun targetVpcSubnetId(targetVpcSubnetId: String) {
    cdkBuilder.targetVpcSubnetId(targetVpcSubnetId)
  }

  public fun build(): CfnClientVpnRoute = cdkBuilder.build()
}
