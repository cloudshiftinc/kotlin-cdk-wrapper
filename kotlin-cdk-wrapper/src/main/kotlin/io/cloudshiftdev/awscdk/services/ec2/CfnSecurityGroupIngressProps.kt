@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Number
import kotlin.String
import kotlin.Unit

/**
 * Properties for defining a `CfnSecurityGroupIngress`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ec2.*;
 * CfnSecurityGroupIngressProps cfnSecurityGroupIngressProps =
 * CfnSecurityGroupIngressProps.builder()
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
public interface CfnSecurityGroupIngressProps {
  /**
   * The IPv4 address range, in CIDR format.
   *
   * You must specify exactly one of the following: `CidrIp` , `CidrIpv6` , `SourcePrefixListId` ,
   * or `SourceSecurityGroupId` .
   *
   * For examples of rules that you can add to security groups for specific access scenarios, see
   * [Security group rules for different use
   * cases](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/security-group-rules-reference.html) in
   * the *Amazon EC2 User Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-securitygroupingress.html#cfn-ec2-securitygroupingress-cidrip)
   */
  public fun cidrIp(): String? = unwrap(this).getCidrIp()

  /**
   * The IPv6 address range, in CIDR format.
   *
   * You must specify exactly one of the following: `CidrIp` , `CidrIpv6` , `SourcePrefixListId` ,
   * or `SourceSecurityGroupId` .
   *
   * For examples of rules that you can add to security groups for specific access scenarios, see
   * [Security group rules for different use
   * cases](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/security-group-rules-reference.html) in
   * the *Amazon EC2 User Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-securitygroupingress.html#cfn-ec2-securitygroupingress-cidripv6)
   */
  public fun cidrIpv6(): String? = unwrap(this).getCidrIpv6()

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
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The start of port range for the TCP and UDP protocols, or an ICMP/ICMPv6 type number.
   *
   * A value of `-1` indicates all ICMP/ICMPv6 types. If you specify all ICMP/ICMPv6 types, you must
   * specify all codes.
   *
   * Use this for ICMP and any protocol that uses ports.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-securitygroupingress.html#cfn-ec2-securitygroupingress-fromport)
   */
  public fun fromPort(): Number? = unwrap(this).getFromPort()

  /**
   * The ID of the security group.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-securitygroupingress.html#cfn-ec2-securitygroupingress-groupid)
   */
  public fun groupId(): String? = unwrap(this).getGroupId()

  /**
   * [Default VPC] The name of the security group.
   *
   * For security groups for a default VPC you can specify either the ID or the name of the security
   * group. For security groups for a nondefault VPC, you must specify the ID of the security group.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-securitygroupingress.html#cfn-ec2-securitygroupingress-groupname)
   */
  public fun groupName(): String? = unwrap(this).getGroupName()

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
   */
  public fun ipProtocol(): String

  /**
   * The ID of a prefix list.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-securitygroupingress.html#cfn-ec2-securitygroupingress-sourceprefixlistid)
   */
  public fun sourcePrefixListId(): String? = unwrap(this).getSourcePrefixListId()

  /**
   * The ID of the security group.
   *
   * You must specify either the security group ID or the security group name. For security groups
   * in a nondefault VPC, you must specify the security group ID.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-securitygroupingress.html#cfn-ec2-securitygroupingress-sourcesecuritygroupid)
   */
  public fun sourceSecurityGroupId(): String? = unwrap(this).getSourceSecurityGroupId()

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
   */
  public fun sourceSecurityGroupName(): String? = unwrap(this).getSourceSecurityGroupName()

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
   */
  public fun sourceSecurityGroupOwnerId(): String? = unwrap(this).getSourceSecurityGroupOwnerId()

  /**
   * The end of port range for the TCP and UDP protocols, or an ICMP/ICMPv6 code.
   *
   * A value of `-1` indicates all ICMP/ICMPv6 codes for the specified ICMP type. If you specify all
   * ICMP/ICMPv6 types, you must specify all codes.
   *
   * Use this for ICMP and any protocol that uses ports.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-securitygroupingress.html#cfn-ec2-securitygroupingress-toport)
   */
  public fun toPort(): Number? = unwrap(this).getToPort()

  /**
   * A builder for [CfnSecurityGroupIngressProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param cidrIp The IPv4 address range, in CIDR format.
     * You must specify exactly one of the following: `CidrIp` , `CidrIpv6` , `SourcePrefixListId` ,
     * or `SourceSecurityGroupId` .
     *
     * For examples of rules that you can add to security groups for specific access scenarios, see
     * [Security group rules for different use
     * cases](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/security-group-rules-reference.html)
     * in the *Amazon EC2 User Guide* .
     */
    public fun cidrIp(cidrIp: String)

    /**
     * @param cidrIpv6 The IPv6 address range, in CIDR format.
     * You must specify exactly one of the following: `CidrIp` , `CidrIpv6` , `SourcePrefixListId` ,
     * or `SourceSecurityGroupId` .
     *
     * For examples of rules that you can add to security groups for specific access scenarios, see
     * [Security group rules for different use
     * cases](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/security-group-rules-reference.html)
     * in the *Amazon EC2 User Guide* .
     */
    public fun cidrIpv6(cidrIpv6: String)

    /**
     * @param description Updates the description of an ingress (inbound) security group rule.
     * You can replace an existing description, or add a description to a rule that did not have one
     * previously.
     *
     * Constraints: Up to 255 characters in length. Allowed characters are a-z, A-Z, 0-9, spaces,
     * and ._-:/()#,&#64;[]+=;{}!$*
     */
    public fun description(description: String)

    /**
     * @param fromPort The start of port range for the TCP and UDP protocols, or an ICMP/ICMPv6 type
     * number.
     * A value of `-1` indicates all ICMP/ICMPv6 types. If you specify all ICMP/ICMPv6 types, you
     * must specify all codes.
     *
     * Use this for ICMP and any protocol that uses ports.
     */
    public fun fromPort(fromPort: Number)

    /**
     * @param groupId The ID of the security group.
     */
    public fun groupId(groupId: String)

    /**
     * @param groupName [Default VPC] The name of the security group.
     * For security groups for a default VPC you can specify either the ID or the name of the
     * security group. For security groups for a nondefault VPC, you must specify the ID of the
     * security group.
     */
    public fun groupName(groupName: String)

    /**
     * @param ipProtocol The IP protocol name ( `tcp` , `udp` , `icmp` , `icmpv6` ) or number (see
     * [Protocol
     * Numbers](https://docs.aws.amazon.com/http://www.iana.org/assignments/protocol-numbers/protocol-numbers.xhtml)
     * ). 
     * Use `-1` to specify all protocols. When authorizing security group rules, specifying `-1` or
     * a protocol number other than `tcp` , `udp` , `icmp` , or `icmpv6` allows traffic on all ports,
     * regardless of any port range you specify. For `tcp` , `udp` , and `icmp` , you must specify a
     * port range. For `icmpv6` , the port range is optional; if you omit the port range, traffic for
     * all types and codes is allowed.
     */
    public fun ipProtocol(ipProtocol: String)

    /**
     * @param sourcePrefixListId The ID of a prefix list.
     */
    public fun sourcePrefixListId(sourcePrefixListId: String)

    /**
     * @param sourceSecurityGroupId The ID of the security group.
     * You must specify either the security group ID or the security group name. For security groups
     * in a nondefault VPC, you must specify the security group ID.
     */
    public fun sourceSecurityGroupId(sourceSecurityGroupId: String)

    /**
     * @param sourceSecurityGroupName [Default VPC] The name of the source security group.
     * You must specify either the security group ID or the security group name. You can't specify
     * the group name in combination with an IP address range. Creates rules that grant full ICMP, UDP,
     * and TCP access.
     *
     * For security groups in a nondefault VPC, you must specify the group ID.
     */
    public fun sourceSecurityGroupName(sourceSecurityGroupName: String)

    /**
     * @param sourceSecurityGroupOwnerId [nondefault VPC] The AWS account ID for the source security
     * group, if the source security group is in a different account.
     * You can't specify this property with an IP address range. Creates rules that grant full ICMP,
     * UDP, and TCP access.
     *
     * If you specify `SourceSecurityGroupName` or `SourceSecurityGroupId` and that security group
     * is owned by a different account than the account creating the stack, you must specify
     * `SourceSecurityGroupOwnerId` ; otherwise, this property is optional.
     */
    public fun sourceSecurityGroupOwnerId(sourceSecurityGroupOwnerId: String)

    /**
     * @param toPort The end of port range for the TCP and UDP protocols, or an ICMP/ICMPv6 code.
     * A value of `-1` indicates all ICMP/ICMPv6 codes for the specified ICMP type. If you specify
     * all ICMP/ICMPv6 types, you must specify all codes.
     *
     * Use this for ICMP and any protocol that uses ports.
     */
    public fun toPort(toPort: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.CfnSecurityGroupIngressProps.Builder
        = software.amazon.awscdk.services.ec2.CfnSecurityGroupIngressProps.builder()

    /**
     * @param cidrIp The IPv4 address range, in CIDR format.
     * You must specify exactly one of the following: `CidrIp` , `CidrIpv6` , `SourcePrefixListId` ,
     * or `SourceSecurityGroupId` .
     *
     * For examples of rules that you can add to security groups for specific access scenarios, see
     * [Security group rules for different use
     * cases](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/security-group-rules-reference.html)
     * in the *Amazon EC2 User Guide* .
     */
    override fun cidrIp(cidrIp: String) {
      cdkBuilder.cidrIp(cidrIp)
    }

    /**
     * @param cidrIpv6 The IPv6 address range, in CIDR format.
     * You must specify exactly one of the following: `CidrIp` , `CidrIpv6` , `SourcePrefixListId` ,
     * or `SourceSecurityGroupId` .
     *
     * For examples of rules that you can add to security groups for specific access scenarios, see
     * [Security group rules for different use
     * cases](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/security-group-rules-reference.html)
     * in the *Amazon EC2 User Guide* .
     */
    override fun cidrIpv6(cidrIpv6: String) {
      cdkBuilder.cidrIpv6(cidrIpv6)
    }

    /**
     * @param description Updates the description of an ingress (inbound) security group rule.
     * You can replace an existing description, or add a description to a rule that did not have one
     * previously.
     *
     * Constraints: Up to 255 characters in length. Allowed characters are a-z, A-Z, 0-9, spaces,
     * and ._-:/()#,&#64;[]+=;{}!$*
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param fromPort The start of port range for the TCP and UDP protocols, or an ICMP/ICMPv6 type
     * number.
     * A value of `-1` indicates all ICMP/ICMPv6 types. If you specify all ICMP/ICMPv6 types, you
     * must specify all codes.
     *
     * Use this for ICMP and any protocol that uses ports.
     */
    override fun fromPort(fromPort: Number) {
      cdkBuilder.fromPort(fromPort)
    }

    /**
     * @param groupId The ID of the security group.
     */
    override fun groupId(groupId: String) {
      cdkBuilder.groupId(groupId)
    }

    /**
     * @param groupName [Default VPC] The name of the security group.
     * For security groups for a default VPC you can specify either the ID or the name of the
     * security group. For security groups for a nondefault VPC, you must specify the ID of the
     * security group.
     */
    override fun groupName(groupName: String) {
      cdkBuilder.groupName(groupName)
    }

    /**
     * @param ipProtocol The IP protocol name ( `tcp` , `udp` , `icmp` , `icmpv6` ) or number (see
     * [Protocol
     * Numbers](https://docs.aws.amazon.com/http://www.iana.org/assignments/protocol-numbers/protocol-numbers.xhtml)
     * ). 
     * Use `-1` to specify all protocols. When authorizing security group rules, specifying `-1` or
     * a protocol number other than `tcp` , `udp` , `icmp` , or `icmpv6` allows traffic on all ports,
     * regardless of any port range you specify. For `tcp` , `udp` , and `icmp` , you must specify a
     * port range. For `icmpv6` , the port range is optional; if you omit the port range, traffic for
     * all types and codes is allowed.
     */
    override fun ipProtocol(ipProtocol: String) {
      cdkBuilder.ipProtocol(ipProtocol)
    }

    /**
     * @param sourcePrefixListId The ID of a prefix list.
     */
    override fun sourcePrefixListId(sourcePrefixListId: String) {
      cdkBuilder.sourcePrefixListId(sourcePrefixListId)
    }

    /**
     * @param sourceSecurityGroupId The ID of the security group.
     * You must specify either the security group ID or the security group name. For security groups
     * in a nondefault VPC, you must specify the security group ID.
     */
    override fun sourceSecurityGroupId(sourceSecurityGroupId: String) {
      cdkBuilder.sourceSecurityGroupId(sourceSecurityGroupId)
    }

    /**
     * @param sourceSecurityGroupName [Default VPC] The name of the source security group.
     * You must specify either the security group ID or the security group name. You can't specify
     * the group name in combination with an IP address range. Creates rules that grant full ICMP, UDP,
     * and TCP access.
     *
     * For security groups in a nondefault VPC, you must specify the group ID.
     */
    override fun sourceSecurityGroupName(sourceSecurityGroupName: String) {
      cdkBuilder.sourceSecurityGroupName(sourceSecurityGroupName)
    }

    /**
     * @param sourceSecurityGroupOwnerId [nondefault VPC] The AWS account ID for the source security
     * group, if the source security group is in a different account.
     * You can't specify this property with an IP address range. Creates rules that grant full ICMP,
     * UDP, and TCP access.
     *
     * If you specify `SourceSecurityGroupName` or `SourceSecurityGroupId` and that security group
     * is owned by a different account than the account creating the stack, you must specify
     * `SourceSecurityGroupOwnerId` ; otherwise, this property is optional.
     */
    override fun sourceSecurityGroupOwnerId(sourceSecurityGroupOwnerId: String) {
      cdkBuilder.sourceSecurityGroupOwnerId(sourceSecurityGroupOwnerId)
    }

    /**
     * @param toPort The end of port range for the TCP and UDP protocols, or an ICMP/ICMPv6 code.
     * A value of `-1` indicates all ICMP/ICMPv6 codes for the specified ICMP type. If you specify
     * all ICMP/ICMPv6 types, you must specify all codes.
     *
     * Use this for ICMP and any protocol that uses ports.
     */
    override fun toPort(toPort: Number) {
      cdkBuilder.toPort(toPort)
    }

    public fun build(): software.amazon.awscdk.services.ec2.CfnSecurityGroupIngressProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.ec2.CfnSecurityGroupIngressProps,
  ) : CdkObject(cdkObject),
      CfnSecurityGroupIngressProps {
    /**
     * The IPv4 address range, in CIDR format.
     *
     * You must specify exactly one of the following: `CidrIp` , `CidrIpv6` , `SourcePrefixListId` ,
     * or `SourceSecurityGroupId` .
     *
     * For examples of rules that you can add to security groups for specific access scenarios, see
     * [Security group rules for different use
     * cases](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/security-group-rules-reference.html)
     * in the *Amazon EC2 User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-securitygroupingress.html#cfn-ec2-securitygroupingress-cidrip)
     */
    override fun cidrIp(): String? = unwrap(this).getCidrIp()

    /**
     * The IPv6 address range, in CIDR format.
     *
     * You must specify exactly one of the following: `CidrIp` , `CidrIpv6` , `SourcePrefixListId` ,
     * or `SourceSecurityGroupId` .
     *
     * For examples of rules that you can add to security groups for specific access scenarios, see
     * [Security group rules for different use
     * cases](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/security-group-rules-reference.html)
     * in the *Amazon EC2 User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-securitygroupingress.html#cfn-ec2-securitygroupingress-cidripv6)
     */
    override fun cidrIpv6(): String? = unwrap(this).getCidrIpv6()

    /**
     * Updates the description of an ingress (inbound) security group rule.
     *
     * You can replace an existing description, or add a description to a rule that did not have one
     * previously.
     *
     * Constraints: Up to 255 characters in length. Allowed characters are a-z, A-Z, 0-9, spaces,
     * and ._-:/()#,&#64;[]+=;{}!$*
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-securitygroupingress.html#cfn-ec2-securitygroupingress-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The start of port range for the TCP and UDP protocols, or an ICMP/ICMPv6 type number.
     *
     * A value of `-1` indicates all ICMP/ICMPv6 types. If you specify all ICMP/ICMPv6 types, you
     * must specify all codes.
     *
     * Use this for ICMP and any protocol that uses ports.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-securitygroupingress.html#cfn-ec2-securitygroupingress-fromport)
     */
    override fun fromPort(): Number? = unwrap(this).getFromPort()

    /**
     * The ID of the security group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-securitygroupingress.html#cfn-ec2-securitygroupingress-groupid)
     */
    override fun groupId(): String? = unwrap(this).getGroupId()

    /**
     * [Default VPC] The name of the security group.
     *
     * For security groups for a default VPC you can specify either the ID or the name of the
     * security group. For security groups for a nondefault VPC, you must specify the ID of the
     * security group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-securitygroupingress.html#cfn-ec2-securitygroupingress-groupname)
     */
    override fun groupName(): String? = unwrap(this).getGroupName()

    /**
     * The IP protocol name ( `tcp` , `udp` , `icmp` , `icmpv6` ) or number (see [Protocol
     * Numbers](https://docs.aws.amazon.com/http://www.iana.org/assignments/protocol-numbers/protocol-numbers.xhtml)
     * ).
     *
     * Use `-1` to specify all protocols. When authorizing security group rules, specifying `-1` or
     * a protocol number other than `tcp` , `udp` , `icmp` , or `icmpv6` allows traffic on all ports,
     * regardless of any port range you specify. For `tcp` , `udp` , and `icmp` , you must specify a
     * port range. For `icmpv6` , the port range is optional; if you omit the port range, traffic for
     * all types and codes is allowed.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-securitygroupingress.html#cfn-ec2-securitygroupingress-ipprotocol)
     */
    override fun ipProtocol(): String = unwrap(this).getIpProtocol()

    /**
     * The ID of a prefix list.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-securitygroupingress.html#cfn-ec2-securitygroupingress-sourceprefixlistid)
     */
    override fun sourcePrefixListId(): String? = unwrap(this).getSourcePrefixListId()

    /**
     * The ID of the security group.
     *
     * You must specify either the security group ID or the security group name. For security groups
     * in a nondefault VPC, you must specify the security group ID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-securitygroupingress.html#cfn-ec2-securitygroupingress-sourcesecuritygroupid)
     */
    override fun sourceSecurityGroupId(): String? = unwrap(this).getSourceSecurityGroupId()

    /**
     * [Default VPC] The name of the source security group.
     *
     * You must specify either the security group ID or the security group name. You can't specify
     * the group name in combination with an IP address range. Creates rules that grant full ICMP, UDP,
     * and TCP access.
     *
     * For security groups in a nondefault VPC, you must specify the group ID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-securitygroupingress.html#cfn-ec2-securitygroupingress-sourcesecuritygroupname)
     */
    override fun sourceSecurityGroupName(): String? = unwrap(this).getSourceSecurityGroupName()

    /**
     * [nondefault VPC] The AWS account ID for the source security group, if the source security
     * group is in a different account.
     *
     * You can't specify this property with an IP address range. Creates rules that grant full ICMP,
     * UDP, and TCP access.
     *
     * If you specify `SourceSecurityGroupName` or `SourceSecurityGroupId` and that security group
     * is owned by a different account than the account creating the stack, you must specify
     * `SourceSecurityGroupOwnerId` ; otherwise, this property is optional.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-securitygroupingress.html#cfn-ec2-securitygroupingress-sourcesecuritygroupownerid)
     */
    override fun sourceSecurityGroupOwnerId(): String? =
        unwrap(this).getSourceSecurityGroupOwnerId()

    /**
     * The end of port range for the TCP and UDP protocols, or an ICMP/ICMPv6 code.
     *
     * A value of `-1` indicates all ICMP/ICMPv6 codes for the specified ICMP type. If you specify
     * all ICMP/ICMPv6 types, you must specify all codes.
     *
     * Use this for ICMP and any protocol that uses ports.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-securitygroupingress.html#cfn-ec2-securitygroupingress-toport)
     */
    override fun toPort(): Number? = unwrap(this).getToPort()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnSecurityGroupIngressProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnSecurityGroupIngressProps):
        CfnSecurityGroupIngressProps = CdkObjectWrappers.wrap(cdkObject) as?
        CfnSecurityGroupIngressProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnSecurityGroupIngressProps):
        software.amazon.awscdk.services.ec2.CfnSecurityGroupIngressProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ec2.CfnSecurityGroupIngressProps
  }
}
