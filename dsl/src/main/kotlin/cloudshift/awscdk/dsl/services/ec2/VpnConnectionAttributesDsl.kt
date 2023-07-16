@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.ec2.VpnConnectionAttributes

@CdkDslMarker
public class VpnConnectionAttributesDsl {
  private val cdkBuilder: VpnConnectionAttributes.Builder = VpnConnectionAttributes.builder()

  public fun customerGatewayAsn(customerGatewayAsn: Number) {
    cdkBuilder.customerGatewayAsn(customerGatewayAsn)
  }

  public fun customerGatewayId(customerGatewayId: String) {
    cdkBuilder.customerGatewayId(customerGatewayId)
  }

  public fun customerGatewayIp(customerGatewayIp: String) {
    cdkBuilder.customerGatewayIp(customerGatewayIp)
  }

  public fun vpnId(vpnId: String) {
    cdkBuilder.vpnId(vpnId)
  }

  public fun build(): VpnConnectionAttributes = cdkBuilder.build()
}
