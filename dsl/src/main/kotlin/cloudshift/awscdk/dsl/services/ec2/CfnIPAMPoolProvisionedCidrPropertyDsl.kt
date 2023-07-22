@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ec2.CfnIPAMPool

@CdkDslMarker
public class CfnIPAMPoolProvisionedCidrPropertyDsl {
  private val cdkBuilder: CfnIPAMPool.ProvisionedCidrProperty.Builder =
      CfnIPAMPool.ProvisionedCidrProperty.builder()

  /**
   * @param cidr The CIDR provisioned to the IPAM pool. 
   * A CIDR is a representation of an IP address and its associated network mask (or netmask) and
   * refers to a range of IP addresses. An IPv4 CIDR example is `10.24.34.0/23` . An IPv6 CIDR example
   * is `2001:DB8::/32` .
   */
  public fun cidr(cidr: String) {
    cdkBuilder.cidr(cidr)
  }

  public fun build(): CfnIPAMPool.ProvisionedCidrProperty = cdkBuilder.build()
}
