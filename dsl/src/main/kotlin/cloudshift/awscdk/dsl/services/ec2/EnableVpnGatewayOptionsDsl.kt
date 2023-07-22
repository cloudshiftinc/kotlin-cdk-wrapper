@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.ec2.EnableVpnGatewayOptions
import software.amazon.awscdk.services.ec2.SubnetSelection

@CdkDslMarker
public class EnableVpnGatewayOptionsDsl {
  private val cdkBuilder: EnableVpnGatewayOptions.Builder = EnableVpnGatewayOptions.builder()

  private val _vpnRoutePropagation: MutableList<SubnetSelection> = mutableListOf()

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

  /**
   * @param vpnRoutePropagation Provide an array of subnets where the route propagation should be
   * added.
   */
  public fun vpnRoutePropagation(vpnRoutePropagation: SubnetSelectionDsl.() -> Unit) {
    _vpnRoutePropagation.add(SubnetSelectionDsl().apply(vpnRoutePropagation).build())
  }

  /**
   * @param vpnRoutePropagation Provide an array of subnets where the route propagation should be
   * added.
   */
  public fun vpnRoutePropagation(vpnRoutePropagation: Collection<SubnetSelection>) {
    _vpnRoutePropagation.addAll(vpnRoutePropagation)
  }

  public fun build(): EnableVpnGatewayOptions {
    if(_vpnRoutePropagation.isNotEmpty()) cdkBuilder.vpnRoutePropagation(_vpnRoutePropagation)
    return cdkBuilder.build()
  }
}
