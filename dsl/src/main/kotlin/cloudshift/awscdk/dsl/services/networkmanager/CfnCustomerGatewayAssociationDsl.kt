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

  public fun customerGatewayArn(customerGatewayArn: String) {
    cdkBuilder.customerGatewayArn(customerGatewayArn)
  }

  public fun deviceId(deviceId: String) {
    cdkBuilder.deviceId(deviceId)
  }

  public fun globalNetworkId(globalNetworkId: String) {
    cdkBuilder.globalNetworkId(globalNetworkId)
  }

  public fun linkId(linkId: String) {
    cdkBuilder.linkId(linkId)
  }

  public fun build(): CfnCustomerGatewayAssociation = cdkBuilder.build()
}
