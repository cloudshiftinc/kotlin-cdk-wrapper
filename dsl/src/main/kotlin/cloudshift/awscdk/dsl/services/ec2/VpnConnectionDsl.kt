@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.ec2.IVpc
import software.amazon.awscdk.services.ec2.VpnConnection
import software.amazon.awscdk.services.ec2.VpnTunnelOption
import software.constructs.Construct

@CdkDslMarker
public class VpnConnectionDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: VpnConnection.Builder = VpnConnection.Builder.create(scope, id)

  private val _staticRoutes: MutableList<String> = mutableListOf()

  private val _tunnelOptions: MutableList<VpnTunnelOption> = mutableListOf()

  /**
   * The ASN of the customer gateway.
   *
   * Default: 65000
   *
   * @param asn The ASN of the customer gateway. 
   */
  public fun asn(asn: Number) {
    cdkBuilder.asn(asn)
  }

  /**
   * The ip address of the customer gateway.
   *
   * @param ip The ip address of the customer gateway. 
   */
  public fun ip(ip: String) {
    cdkBuilder.ip(ip)
  }

  /**
   * The static routes to be routed from the VPN gateway to the customer gateway.
   *
   * Default: Dynamic routing (BGP)
   *
   * @param staticRoutes The static routes to be routed from the VPN gateway to the customer
   * gateway. 
   */
  public fun staticRoutes(vararg staticRoutes: String) {
    _staticRoutes.addAll(listOf(*staticRoutes))
  }

  /**
   * The static routes to be routed from the VPN gateway to the customer gateway.
   *
   * Default: Dynamic routing (BGP)
   *
   * @param staticRoutes The static routes to be routed from the VPN gateway to the customer
   * gateway. 
   */
  public fun staticRoutes(staticRoutes: Collection<String>) {
    _staticRoutes.addAll(staticRoutes)
  }

  /**
   * The tunnel options for the VPN connection.
   *
   * At most two elements (one per tunnel).
   * Duplicates not allowed.
   *
   * Default: Amazon generated tunnel options
   *
   * @param tunnelOptions The tunnel options for the VPN connection. 
   */
  public fun tunnelOptions(tunnelOptions: VpnTunnelOptionDsl.() -> Unit) {
    _tunnelOptions.add(VpnTunnelOptionDsl().apply(tunnelOptions).build())
  }

  /**
   * The tunnel options for the VPN connection.
   *
   * At most two elements (one per tunnel).
   * Duplicates not allowed.
   *
   * Default: Amazon generated tunnel options
   *
   * @param tunnelOptions The tunnel options for the VPN connection. 
   */
  public fun tunnelOptions(tunnelOptions: Collection<VpnTunnelOption>) {
    _tunnelOptions.addAll(tunnelOptions)
  }

  /**
   * The VPC to connect to.
   *
   * @param vpc The VPC to connect to. 
   */
  public fun vpc(vpc: IVpc) {
    cdkBuilder.vpc(vpc)
  }

  public fun build(): VpnConnection {
    if(_staticRoutes.isNotEmpty()) cdkBuilder.staticRoutes(_staticRoutes)
    if(_tunnelOptions.isNotEmpty()) cdkBuilder.tunnelOptions(_tunnelOptions)
    return cdkBuilder.build()
  }
}
