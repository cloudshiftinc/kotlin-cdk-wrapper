@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ec2.CfnNetworkAclEntry
import software.constructs.Construct

@CdkDslMarker
public class CfnNetworkAclEntryDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnNetworkAclEntry.Builder = CfnNetworkAclEntry.Builder.create(scope, id)

  /**
   * The IPv4 CIDR range to allow or deny, in CIDR notation (for example, 172.16.0.0/24).
   * Requirement is conditional: You must specify the `CidrBlock` or `Ipv6CidrBlock` property.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkaclentry.html#cfn-ec2-networkaclentry-cidrblock)
   * @param cidrBlock The IPv4 CIDR range to allow or deny, in CIDR notation (for example,
   * 172.16.0.0/24). Requirement is conditional: You must specify the `CidrBlock` or `Ipv6CidrBlock`
   * property. 
   */
  public fun cidrBlock(cidrBlock: String) {
    cdkBuilder.cidrBlock(cidrBlock)
  }

  /**
   * Whether this rule applies to egress traffic from the subnet ( `true` ) or ingress traffic to
   * the subnet ( `false` ).
   *
   * By default, AWS CloudFormation specifies `false` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkaclentry.html#cfn-ec2-networkaclentry-egress)
   * @param egress Whether this rule applies to egress traffic from the subnet ( `true` ) or ingress
   * traffic to the subnet ( `false` ). 
   */
  public fun egress(egress: Boolean) {
    cdkBuilder.egress(egress)
  }

  /**
   * Whether this rule applies to egress traffic from the subnet ( `true` ) or ingress traffic to
   * the subnet ( `false` ).
   *
   * By default, AWS CloudFormation specifies `false` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkaclentry.html#cfn-ec2-networkaclentry-egress)
   * @param egress Whether this rule applies to egress traffic from the subnet ( `true` ) or ingress
   * traffic to the subnet ( `false` ). 
   */
  public fun egress(egress: IResolvable) {
    cdkBuilder.egress(egress)
  }

  /**
   * The Internet Control Message Protocol (ICMP) code and type.
   *
   * Requirement is conditional: Required if specifying 1 (ICMP) for the protocol parameter.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkaclentry.html#cfn-ec2-networkaclentry-icmp)
   * @param icmp The Internet Control Message Protocol (ICMP) code and type. 
   */
  public fun icmp(icmp: IResolvable) {
    cdkBuilder.icmp(icmp)
  }

  /**
   * The Internet Control Message Protocol (ICMP) code and type.
   *
   * Requirement is conditional: Required if specifying 1 (ICMP) for the protocol parameter.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkaclentry.html#cfn-ec2-networkaclentry-icmp)
   * @param icmp The Internet Control Message Protocol (ICMP) code and type. 
   */
  public fun icmp(icmp: CfnNetworkAclEntry.IcmpProperty) {
    cdkBuilder.icmp(icmp)
  }

  /**
   * The IPv6 network range to allow or deny, in CIDR notation.
   *
   * Requirement is conditional: You must specify the `CidrBlock` or `Ipv6CidrBlock` property.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkaclentry.html#cfn-ec2-networkaclentry-ipv6cidrblock)
   * @param ipv6CidrBlock The IPv6 network range to allow or deny, in CIDR notation. 
   */
  public fun ipv6CidrBlock(ipv6CidrBlock: String) {
    cdkBuilder.ipv6CidrBlock(ipv6CidrBlock)
  }

  /**
   * The ID of the ACL for the entry.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkaclentry.html#cfn-ec2-networkaclentry-networkaclid)
   * @param networkAclId The ID of the ACL for the entry. 
   */
  public fun networkAclId(networkAclId: String) {
    cdkBuilder.networkAclId(networkAclId)
  }

  /**
   * The range of port numbers for the UDP/TCP protocol.
   *
   * Conditional required if specifying 6 (TCP) or 17 (UDP) for the protocol parameter.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkaclentry.html#cfn-ec2-networkaclentry-portrange)
   * @param portRange The range of port numbers for the UDP/TCP protocol. 
   */
  public fun portRange(portRange: IResolvable) {
    cdkBuilder.portRange(portRange)
  }

  /**
   * The range of port numbers for the UDP/TCP protocol.
   *
   * Conditional required if specifying 6 (TCP) or 17 (UDP) for the protocol parameter.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkaclentry.html#cfn-ec2-networkaclentry-portrange)
   * @param portRange The range of port numbers for the UDP/TCP protocol. 
   */
  public fun portRange(portRange: CfnNetworkAclEntry.PortRangeProperty) {
    cdkBuilder.portRange(portRange)
  }

  /**
   * The IP protocol that the rule applies to.
   *
   * You must specify -1 or a protocol number. You can specify -1 for all protocols.
   *
   *
   * If you specify -1, all ports are opened and the `PortRange` property is ignored.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkaclentry.html#cfn-ec2-networkaclentry-protocol)
   * @param protocol The IP protocol that the rule applies to. 
   */
  public fun protocol(protocol: Number) {
    cdkBuilder.protocol(protocol)
  }

  /**
   * Whether to allow or deny traffic that matches the rule;
   *
   * valid values are "allow" or "deny".
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkaclentry.html#cfn-ec2-networkaclentry-ruleaction)
   * @param ruleAction Whether to allow or deny traffic that matches the rule;. 
   */
  public fun ruleAction(ruleAction: String) {
    cdkBuilder.ruleAction(ruleAction)
  }

  /**
   * Rule number to assign to the entry, such as 100.
   *
   * ACL entries are processed in ascending order by rule number. Entries can't use the same rule
   * number unless one is an egress rule and the other is an ingress rule.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkaclentry.html#cfn-ec2-networkaclentry-rulenumber)
   * @param ruleNumber Rule number to assign to the entry, such as 100. 
   */
  public fun ruleNumber(ruleNumber: Number) {
    cdkBuilder.ruleNumber(ruleNumber)
  }

  public fun build(): CfnNetworkAclEntry = cdkBuilder.build()
}
