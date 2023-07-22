@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ec2.CfnIPAMPool

/**
 * The CIDR provisioned to the IPAM pool.
 *
 * A CIDR is a representation of an IP address and its associated network mask (or netmask) and
 * refers to a range of IP addresses. An IPv4 CIDR example is `10.24.34.0/23` . An IPv6 CIDR example is
 * `2001:DB8::/32` .
 *
 *
 * This resource type does not allow you to provision a CIDR using the netmask length. To provision
 * a CIDR using netmask length, use
 * [AWS::EC2::IPAMPoolCidr](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipampoolcidr.html)
 * .
 *
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * ProvisionedCidrProperty provisionedCidrProperty = ProvisionedCidrProperty.builder()
 * .cidr("cidr")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ipampool-provisionedcidr.html)
 */
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
