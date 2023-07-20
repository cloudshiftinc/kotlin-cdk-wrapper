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

  public fun globalNetworkId(globalNetworkId: String) {
    cdkBuilder.globalNetworkId(globalNetworkId)
  }

  public fun transitGatewayArn(transitGatewayArn: String) {
    cdkBuilder.transitGatewayArn(transitGatewayArn)
  }

  public fun build(): CfnTransitGatewayRegistration = cdkBuilder.build()
}
