@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.ec2.VpnGateway
import software.constructs.Construct

@CdkDslMarker
public class VpnGatewayDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: VpnGateway.Builder = VpnGateway.Builder.create(scope, id)

  /**
   * Explicitly specify an Asn or let aws pick an Asn for you.
   *
   * Default: 65000
   *
   * @param amazonSideAsn Explicitly specify an Asn or let aws pick an Asn for you. 
   */
  public fun amazonSideAsn(amazonSideAsn: Number) {
    cdkBuilder.amazonSideAsn(amazonSideAsn)
  }

  /**
   * Default type ipsec.1.
   *
   * @param type Default type ipsec.1. 
   */
  public fun type(type: String) {
    cdkBuilder.type(type)
  }

  public fun build(): VpnGateway = cdkBuilder.build()
}
