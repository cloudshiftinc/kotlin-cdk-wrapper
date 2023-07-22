@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.ec2.CfnSecurityGroupIngress
import software.constructs.Construct

/**
 * Adds an inbound rule to a security group.
 *
 * An inbound rule permits instances to receive traffic from the specified IPv4 or IPv6 CIDR address
 * range, or from the instances associated with the specified security group.
 *
 * You must specify only one of the following properties: `CidrIp` , `CidrIpv6` ,
 * `SourcePrefixListId` , `SourceSecurityGroupId` , or `SourceSecurityGroupName` .
 *
 * You specify a protocol for each rule (for example, TCP). For TCP and UDP, you must also specify a
 * port or port range. For ICMP/ICMPv6, you must also specify the ICMP/ICMPv6 type and code. You can
 * use -1 to mean all types or all codes.
 *
 * You must specify a source security group ( `SourcePrefixListId` , `SourceSecurityGroupId` , or
 * `SourceSecurityGroupName` ) or a CIDR range ( `CidrIp` or `CidrIpv6` ). If you do not specify one of
 * these parameters, the stack will launch successfully but the rule will not be added to the security
 * group.
 *
 * Rule changes are propagated to instances within the security group as quickly as possible.
 * However, a small delay might occur.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * CfnSecurityGroupIngress cfnSecurityGroupIngress = CfnSecurityGroupIngress.Builder.create(this,
 * "MyCfnSecurityGroupIngress")
 * .ipProtocol("ipProtocol")
 * // the properties below are optional
 * .cidrIp("cidrIp")
 * .cidrIpv6("cidrIpv6")
 * .description("description")
 * .fromPort(123)
 * .groupId("groupId")
 * .groupName("groupName")
 * .sourcePrefixListId("sourcePrefixListId")
 * .sourceSecurityGroupId("sourceSecurityGroupId")
 * .sourceSecurityGroupName("sourceSecurityGroupName")
 * .sourceSecurityGroupOwnerId("sourceSecurityGroupOwnerId")
 * .toPort(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-securitygroupingress.html)
 */
@CdkDslMarker
public class CfnSecurityGroupIngressDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnSecurityGroupIngress.Builder =
      CfnSecurityGroupIngress.Builder.create(scope, id)

  /**
   * The IPv4 address range, in CIDR format.
   *
   * You must specify a source security group ( `SourcePrefixListId` or `SourceSecurityGroupId` ) or
   * a CIDR range ( `CidrIp` or `CidrIpv6` ).
   *
   * For examples of rules that you can add to security groups for specific access scenarios, see
   * [Security group rules for different use
   * cases](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/security-group-rules-reference.html) in
   * the *Amazon EC2 User Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-securitygroupingress.html#cfn-ec2-securitygroupingress-cidrip)
   * @param cidrIp The IPv4 address range, in CIDR format. 
   */
  public fun cidrIp(cidrIp: String) {
    cdkBuilder.cidrIp(cidrIp)
  }

  /**
   * The IPv6 address range, in CIDR format.
   *
   * You must specify a source security group ( `SourcePrefixListId` or `SourceSecurityGroupId` ) or
   * a CIDR range ( `CidrIp` or `CidrIpv6` ).
   *
   * For examples of rules that you can add to security groups for specific access scenarios, see
   * [Security group rules for different use
   * cases](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/security-group-rules-reference.html) in
   * the *Amazon EC2 User Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-securitygroupingress.html#cfn-ec2-securitygroupingress-cidripv6)
   * @param cidrIpv6 The IPv6 address range, in CIDR format. 
   */
  public fun cidrIpv6(cidrIpv6: String) {
    cdkBuilder.cidrIpv6(cidrIpv6)
  }

  /**
   * Updates the description of an ingress (inbound) security group rule.
   *
   * You can replace an existing description, or add a description to a rule that did not have one
   * previously.
   *
   * Constraints: Up to 255 characters in length. Allowed characters are a-z, A-Z, 0-9, spaces, and
   * ._-:/()#,&#64;[]+=;{}!$*
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-securitygroupingress.html#cfn-ec2-securitygroupingress-description)
   * @param description Updates the description of an ingress (inbound) security group rule. 
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * The start of port range for the TCP and UDP protocols, or an ICMP/ICMPv6 type number.
   *
   * A value of `-1` indicates all ICMP/ICMPv6 types. If you specify all ICMP/ICMPv6 types, you must
   * specify all codes.
   *
   * Use this for ICMP and any protocol that uses ports.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-securitygroupingress.html#cfn-ec2-securitygroupingress-fromport)
   * @param fromPort The start of port range for the TCP and UDP protocols, or an ICMP/ICMPv6 type
   * number. 
   */
  public fun fromPort(fromPort: Number) {
    cdkBuilder.fromPort(fromPort)
  }

  /**
   * The ID of the security group.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-securitygroupingress.html#cfn-ec2-securitygroupingress-groupid)
   * @param groupId The ID of the security group. 
   */
  public fun groupId(groupId: String) {
    cdkBuilder.groupId(groupId)
  }

  /**
   * The name of the security group.
   *
   * Constraints: Up to 255 characters in length. Cannot start with `sg-` .
   *
   * Valid characters: a-z, A-Z, 0-9, spaces, and ._-:/()#,&#64;[]+=&amp;;{}!$*
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-securitygroupingress.html#cfn-ec2-securitygroupingress-groupname)
   * @param groupName The name of the security group. 
   */
  public fun groupName(groupName: String) {
    cdkBuilder.groupName(groupName)
  }

  /**
   * The IP protocol name ( `tcp` , `udp` , `icmp` , `icmpv6` ) or number (see [Protocol
   * Numbers](https://docs.aws.amazon.com/http://www.iana.org/assignments/protocol-numbers/protocol-numbers.xhtml)
   * ).
   *
   * Use `-1` to specify all protocols. When authorizing security group rules, specifying `-1` or a
   * protocol number other than `tcp` , `udp` , `icmp` , or `icmpv6` allows traffic on all ports,
   * regardless of any port range you specify. For `tcp` , `udp` , and `icmp` , you must specify a port
   * range. For `icmpv6` , the port range is optional; if you omit the port range, traffic for all
   * types and codes is allowed.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-securitygroupingress.html#cfn-ec2-securitygroupingress-ipprotocol)
   * @param ipProtocol The IP protocol name ( `tcp` , `udp` , `icmp` , `icmpv6` ) or number (see
   * [Protocol
   * Numbers](https://docs.aws.amazon.com/http://www.iana.org/assignments/protocol-numbers/protocol-numbers.xhtml)
   * ). 
   */
  public fun ipProtocol(ipProtocol: String) {
    cdkBuilder.ipProtocol(ipProtocol)
  }

  /**
   * The ID of a prefix list.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-securitygroupingress.html#cfn-ec2-securitygroupingress-sourceprefixlistid)
   * @param sourcePrefixListId The ID of a prefix list. 
   */
  public fun sourcePrefixListId(sourcePrefixListId: String) {
    cdkBuilder.sourcePrefixListId(sourcePrefixListId)
  }

  /**
   * The ID of the security group.
   *
   * You must specify either the security group ID or the security group name. For security groups
   * in a nondefault VPC, you must specify the security group ID.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-securitygroupingress.html#cfn-ec2-securitygroupingress-sourcesecuritygroupid)
   * @param sourceSecurityGroupId The ID of the security group. 
   */
  public fun sourceSecurityGroupId(sourceSecurityGroupId: String) {
    cdkBuilder.sourceSecurityGroupId(sourceSecurityGroupId)
  }

  /**
   * [Default VPC] The name of the source security group.
   *
   * You must specify either the security group ID or the security group name. You can't specify the
   * group name in combination with an IP address range. Creates rules that grant full ICMP, UDP, and
   * TCP access.
   *
   * For security groups in a nondefault VPC, you must specify the group ID.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-securitygroupingress.html#cfn-ec2-securitygroupingress-sourcesecuritygroupname)
   * @param sourceSecurityGroupName [Default VPC] The name of the source security group. 
   */
  public fun sourceSecurityGroupName(sourceSecurityGroupName: String) {
    cdkBuilder.sourceSecurityGroupName(sourceSecurityGroupName)
  }

  /**
   * [nondefault VPC] The AWS account ID for the source security group, if the source security group
   * is in a different account.
   *
   * You can't specify this property with an IP address range. Creates rules that grant full ICMP,
   * UDP, and TCP access.
   *
   * If you specify `SourceSecurityGroupName` or `SourceSecurityGroupId` and that security group is
   * owned by a different account than the account creating the stack, you must specify
   * `SourceSecurityGroupOwnerId` ; otherwise, this property is optional.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-securitygroupingress.html#cfn-ec2-securitygroupingress-sourcesecuritygroupownerid)
   * @param sourceSecurityGroupOwnerId [nondefault VPC] The AWS account ID for the source security
   * group, if the source security group is in a different account. 
   */
  public fun sourceSecurityGroupOwnerId(sourceSecurityGroupOwnerId: String) {
    cdkBuilder.sourceSecurityGroupOwnerId(sourceSecurityGroupOwnerId)
  }

  /**
   * The end of port range for the TCP and UDP protocols, or an ICMP/ICMPv6 code.
   *
   * A value of `-1` indicates all ICMP/ICMPv6 codes for the specified ICMP type. If you specify all
   * ICMP/ICMPv6 types, you must specify all codes.
   *
   * Use this for ICMP and any protocol that uses ports.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-securitygroupingress.html#cfn-ec2-securitygroupingress-toport)
   * @param toPort The end of port range for the TCP and UDP protocols, or an ICMP/ICMPv6 code. 
   */
  public fun toPort(toPort: Number) {
    cdkBuilder.toPort(toPort)
  }

  public fun build(): CfnSecurityGroupIngress = cdkBuilder.build()
}
