@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.route53resolver

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.route53resolver.CfnResolverEndpoint

@CdkDslMarker
public class CfnResolverEndpointIpAddressRequestPropertyDsl {
  private val cdkBuilder: CfnResolverEndpoint.IpAddressRequestProperty.Builder =
      CfnResolverEndpoint.IpAddressRequestProperty.builder()

  /**
   * @param ip The IPv4 address that you want to use for DNS queries.
   */
  public fun ip(ip: String) {
    cdkBuilder.ip(ip)
  }

  /**
   * @param ipv6 The IPv6 address that you want to use for DNS queries.
   */
  public fun ipv6(ipv6: String) {
    cdkBuilder.ipv6(ipv6)
  }

  /**
   * @param subnetId The ID of the subnet that contains the IP address. 
   */
  public fun subnetId(subnetId: String) {
    cdkBuilder.subnetId(subnetId)
  }

  public fun build(): CfnResolverEndpoint.IpAddressRequestProperty = cdkBuilder.build()
}
