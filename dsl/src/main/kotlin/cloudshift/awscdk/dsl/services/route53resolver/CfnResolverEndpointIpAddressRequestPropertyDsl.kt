@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.route53resolver

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.route53resolver.CfnResolverEndpoint

/**
 * In a
 * [CreateResolverEndpoint](https://docs.aws.amazon.com/Route53/latest/APIReference/API_route53resolver_CreateResolverEndpoint.html)
 * request, the IP address that DNS queries originate from (for outbound endpoints) or that you forward
 * DNS queries to (for inbound endpoints). `IpAddressRequest` also includes the ID of the subnet that
 * contains the IP address.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.route53resolver.*;
 * IpAddressRequestProperty ipAddressRequestProperty = IpAddressRequestProperty.builder()
 * .subnetId("subnetId")
 * // the properties below are optional
 * .ip("ip")
 * .ipv6("ipv6")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53resolver-resolverendpoint-ipaddressrequest.html)
 */
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
