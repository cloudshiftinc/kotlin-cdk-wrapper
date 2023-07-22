@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.ec2.CfnEIPProps

/**
 * Properties for defining a `CfnEIP`.
 *
 * Example:
 *
 * ```
 * Instance instance;
 * HostedZone myZone;
 * CfnEIP elasticIp = CfnEIP.Builder.create(this, "EIP")
 * .domain("vpc")
 * .instanceId(instance.getInstanceId())
 * .build();
 * ARecord.Builder.create(this, "ARecord")
 * .zone(myZone)
 * .target(RecordTarget.fromIpAddresses(elasticIp.getRef()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-eip.html)
 */
@CdkDslMarker
public class CfnEIPPropsDsl {
  private val cdkBuilder: CfnEIPProps.Builder = CfnEIPProps.builder()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * @param domain The network ( `vpc` ).
   * If you define an Elastic IP address and associate it with a VPC that is defined in the same
   * template, you must declare a dependency on the VPC-gateway attachment by using the [DependsOn
   * Attribute](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-dependson.html)
   * on this resource.
   */
  public fun domain(domain: String) {
    cdkBuilder.domain(domain)
  }

  /**
   * @param instanceId The ID of the instance.
   *
   * Updates to the `InstanceId` property may require *some interruptions* . Updates on an EIP
   * reassociates the address on its associated resource.
   */
  public fun instanceId(instanceId: String) {
    cdkBuilder.instanceId(instanceId)
  }

  /**
   * @param networkBorderGroup A unique set of Availability Zones, Local Zones, or Wavelength Zones
   * from which AWS advertises IP addresses.
   * Use this parameter to limit the IP address to this location. IP addresses cannot move between
   * network border groups.
   *
   * Use
   * [DescribeAvailabilityZones](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeAvailabilityZones.html)
   * to view the network border groups.
   *
   * You cannot use a network border group with EC2 Classic. If you attempt this operation on EC2
   * Classic, you receive an `InvalidParameterCombination` error.
   */
  public fun networkBorderGroup(networkBorderGroup: String) {
    cdkBuilder.networkBorderGroup(networkBorderGroup)
  }

  /**
   * @param publicIpv4Pool The ID of an address pool that you own.
   * Use this parameter to let Amazon EC2 select an address from the address pool.
   *
   *
   * Updates to the `PublicIpv4Pool` property may require *some interruptions* . Updates on an EIP
   * reassociates the address on its associated resource.
   */
  public fun publicIpv4Pool(publicIpv4Pool: String) {
    cdkBuilder.publicIpv4Pool(publicIpv4Pool)
  }

  /**
   * @param tags Any tags assigned to the Elastic IP address.
   *
   * Updates to the `Tags` property may require *some interruptions* . Updates on an EIP
   * reassociates the address on its associated resource.
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * @param tags Any tags assigned to the Elastic IP address.
   *
   * Updates to the `Tags` property may require *some interruptions* . Updates on an EIP
   * reassociates the address on its associated resource.
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  /**
   * @param transferAddress The Elastic IP address you are accepting for transfer.
   * You can only accept one transferred address. For more information on Elastic IP address
   * transfers, see [Transfer Elastic IP
   * addresses](https://docs.aws.amazon.com/vpc/latest/userguide/vpc-eips.html#transfer-EIPs-intro) in
   * the *Amazon Virtual Private Cloud User Guide* .
   */
  public fun transferAddress(transferAddress: String) {
    cdkBuilder.transferAddress(transferAddress)
  }

  public fun build(): CfnEIPProps {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
