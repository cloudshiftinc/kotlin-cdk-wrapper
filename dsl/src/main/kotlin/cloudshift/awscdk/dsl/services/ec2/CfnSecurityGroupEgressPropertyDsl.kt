@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.ec2.CfnSecurityGroup

@CdkDslMarker
public class CfnSecurityGroupEgressPropertyDsl {
  private val cdkBuilder: CfnSecurityGroup.EgressProperty.Builder =
      CfnSecurityGroup.EgressProperty.builder()

  /**
   * @param cidrIp The IPv4 address range, in CIDR format.
   * You must specify a destination security group ( `DestinationPrefixListId` or
   * `DestinationSecurityGroupId` ) or a CIDR range ( `CidrIp` or `CidrIpv6` ).
   *
   * For examples of rules that you can add to security groups for specific access scenarios, see
   * [Security group rules for different use
   * cases](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/security-group-rules-reference.html) in
   * the *Amazon EC2 User Guide* .
   */
  public fun cidrIp(cidrIp: String) {
    cdkBuilder.cidrIp(cidrIp)
  }

  /**
   * @param cidrIpv6 The IPv6 address range, in CIDR format.
   * You must specify a destination security group ( `DestinationPrefixListId` or
   * `DestinationSecurityGroupId` ) or a CIDR range ( `CidrIp` or `CidrIpv6` ).
   *
   * For examples of rules that you can add to security groups for specific access scenarios, see
   * [Security group rules for different use
   * cases](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/security-group-rules-reference.html) in
   * the *Amazon EC2 User Guide* .
   */
  public fun cidrIpv6(cidrIpv6: String) {
    cdkBuilder.cidrIpv6(cidrIpv6)
  }

  /**
   * @param description A description for the security group rule.
   * Constraints: Up to 255 characters in length. Allowed characters are a-z, A-Z, 0-9, spaces, and
   * ._-:/()#,&#64;[]+=;{}!$*
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * @param destinationPrefixListId The prefix list IDs for the destination AWS service.
   * This is the AWS service that you want to access through a VPC endpoint from instances
   * associated with the security group.
   *
   * You must specify a destination security group ( `DestinationPrefixListId` or
   * `DestinationSecurityGroupId` ) or a CIDR range ( `CidrIp` or `CidrIpv6` ).
   */
  public fun destinationPrefixListId(destinationPrefixListId: String) {
    cdkBuilder.destinationPrefixListId(destinationPrefixListId)
  }

  /**
   * @param destinationSecurityGroupId The ID of the destination VPC security group.
   * You must specify a destination security group ( `DestinationPrefixListId` or
   * `DestinationSecurityGroupId` ) or a CIDR range ( `CidrIp` or `CidrIpv6` ).
   */
  public fun destinationSecurityGroupId(destinationSecurityGroupId: String) {
    cdkBuilder.destinationSecurityGroupId(destinationSecurityGroupId)
  }

  /**
   * @param fromPort If the protocol is TCP or UDP, this is the start of the port range.
   * If the protocol is ICMP or ICMPv6, this is the type number. A value of -1 indicates all
   * ICMP/ICMPv6 types. If you specify all ICMP/ICMPv6 types, you must specify all ICMP/ICMPv6 codes.
   */
  public fun fromPort(fromPort: Number) {
    cdkBuilder.fromPort(fromPort)
  }

  /**
   * @param ipProtocol The IP protocol name ( `tcp` , `udp` , `icmp` , `icmpv6` ) or number (see
   * [Protocol
   * Numbers](https://docs.aws.amazon.com/http://www.iana.org/assignments/protocol-numbers/protocol-numbers.xhtml)
   * ). 
   * Use `-1` to specify all protocols. When authorizing security group rules, specifying `-1` or a
   * protocol number other than `tcp` , `udp` , `icmp` , or `icmpv6` allows traffic on all ports,
   * regardless of any port range you specify. For `tcp` , `udp` , and `icmp` , you must specify a port
   * range. For `icmpv6` , the port range is optional; if you omit the port range, traffic for all
   * types and codes is allowed.
   */
  public fun ipProtocol(ipProtocol: String) {
    cdkBuilder.ipProtocol(ipProtocol)
  }

  /**
   * @param toPort If the protocol is TCP or UDP, this is the end of the port range.
   * If the protocol is ICMP or ICMPv6, this is the code. A value of -1 indicates all ICMP/ICMPv6
   * codes. If you specify all ICMP/ICMPv6 types, you must specify all ICMP/ICMPv6 codes.
   */
  public fun toPort(toPort: Number) {
    cdkBuilder.toPort(toPort)
  }

  public fun build(): CfnSecurityGroup.EgressProperty = cdkBuilder.build()
}
