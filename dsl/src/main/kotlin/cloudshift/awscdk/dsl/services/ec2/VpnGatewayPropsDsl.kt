@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.ec2.VpnGatewayProps

@CdkDslMarker
public class VpnGatewayPropsDsl {
  private val cdkBuilder: VpnGatewayProps.Builder = VpnGatewayProps.builder()

  /**
   * @param amazonSideAsn Explicitly specify an Asn or let aws pick an Asn for you.
   */
  public fun amazonSideAsn(amazonSideAsn: Number) {
    cdkBuilder.amazonSideAsn(amazonSideAsn)
  }

  /**
   * @param type Default type ipsec.1. 
   */
  public fun type(type: String) {
    cdkBuilder.type(type)
  }

  public fun build(): VpnGatewayProps = cdkBuilder.build()
}
