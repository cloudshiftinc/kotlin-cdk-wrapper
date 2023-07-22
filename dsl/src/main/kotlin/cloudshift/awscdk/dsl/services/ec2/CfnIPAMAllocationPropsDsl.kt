@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.ec2.CfnIPAMAllocationProps

@CdkDslMarker
public class CfnIPAMAllocationPropsDsl {
  private val cdkBuilder: CfnIPAMAllocationProps.Builder = CfnIPAMAllocationProps.builder()

  /**
   * @param cidr The CIDR you would like to allocate from the IPAM pool. Note the following:.
   * * If there is no DefaultNetmaskLength allocation rule set on the pool, you must specify either
   * the NetmaskLength or the CIDR.
   * * If the DefaultNetmaskLength allocation rule is set on the pool, you can specify either the
   * NetmaskLength or the CIDR and the DefaultNetmaskLength allocation rule will be ignored.
   *
   * Possible values: Any available IPv4 or IPv6 CIDR.
   */
  public fun cidr(cidr: String) {
    cdkBuilder.cidr(cidr)
  }

  /**
   * @param description A description for the allocation.
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * @param ipamPoolId The ID of the IPAM pool from which you would like to allocate a CIDR. 
   */
  public fun ipamPoolId(ipamPoolId: String) {
    cdkBuilder.ipamPoolId(ipamPoolId)
  }

  /**
   * @param netmaskLength The netmask length of the CIDR you would like to allocate from the IPAM
   * pool. Note the following:.
   * * If there is no DefaultNetmaskLength allocation rule set on the pool, you must specify either
   * the NetmaskLength or the CIDR.
   * * If the DefaultNetmaskLength allocation rule is set on the pool, you can specify either the
   * NetmaskLength or the CIDR and the DefaultNetmaskLength allocation rule will be ignored.
   *
   * Possible netmask lengths for IPv4 addresses are 0 - 32. Possible netmask lengths for IPv6
   * addresses are 0 - 128.
   */
  public fun netmaskLength(netmaskLength: Number) {
    cdkBuilder.netmaskLength(netmaskLength)
  }

  public fun build(): CfnIPAMAllocationProps = cdkBuilder.build()
}
