@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ec2.CfnClientVpnTargetNetworkAssociation
import software.constructs.Construct

@CdkDslMarker
public class CfnClientVpnTargetNetworkAssociationDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnClientVpnTargetNetworkAssociation.Builder =
      CfnClientVpnTargetNetworkAssociation.Builder.create(scope, id)

  public fun clientVpnEndpointId(clientVpnEndpointId: String) {
    cdkBuilder.clientVpnEndpointId(clientVpnEndpointId)
  }

  public fun subnetId(subnetId: String) {
    cdkBuilder.subnetId(subnetId)
  }

  public fun build(): CfnClientVpnTargetNetworkAssociation = cdkBuilder.build()
}
