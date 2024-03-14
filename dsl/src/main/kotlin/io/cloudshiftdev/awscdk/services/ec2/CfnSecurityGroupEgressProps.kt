package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.Unit

public interface CfnSecurityGroupEgressProps {
  /**
   * The IPv4 address range, in CIDR format.
   *
   * You must specify a destination security group ( `DestinationPrefixListId` or
   * `DestinationSecurityGroupId` ) or a CIDR range ( `CidrIp` or `CidrIpv6` ).
   *
   * For examples of rules that you can add to security groups for specific access scenarios, see
   * [Security group rules for different use
   * cases](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/security-group-rules-reference.html) in
   * the *Amazon EC2 User Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-securitygroupegress.html#cfn-ec2-securitygroupegress-cidrip)
   */
  public fun cidrIp(): String? = unwrap(this).getCidrIp()

  /**
   * The IPv6 address range, in CIDR format.
   *
   * You must specify a destination security group ( `DestinationPrefixListId` or
   * `DestinationSecurityGroupId` ) or a CIDR range ( `CidrIp` or `CidrIpv6` ).
   *
   * For examples of rules that you can add to security groups for specific access scenarios, see
   * [Security group rules for different use
   * cases](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/security-group-rules-reference.html) in
   * the *Amazon EC2 User Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-securitygroupegress.html#cfn-ec2-securitygroupegress-cidripv6)
   */
  public fun cidrIpv6(): String? = unwrap(this).getCidrIpv6()

  /**
   * The description of an egress (outbound) security group rule.
   *
   * Constraints: Up to 255 characters in length. Allowed characters are a-z, A-Z, 0-9, spaces, and
   * ._-:/()#,&#64;[]+=;{}!$*
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-securitygroupegress.html#cfn-ec2-securitygroupegress-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The prefix list IDs for an AWS service.
   *
   * This is the AWS service that you want to access through a VPC endpoint from instances
   * associated with the security group.
   *
   * You must specify a destination security group ( `DestinationPrefixListId` or
   * `DestinationSecurityGroupId` ) or a CIDR range ( `CidrIp` or `CidrIpv6` ).
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-securitygroupegress.html#cfn-ec2-securitygroupegress-destinationprefixlistid)
   */
  public fun destinationPrefixListId(): String? = unwrap(this).getDestinationPrefixListId()

  /**
   * The ID of the security group.
   *
   * You must specify a destination security group ( `DestinationPrefixListId` or
   * `DestinationSecurityGroupId` ) or a CIDR range ( `CidrIp` or `CidrIpv6` ).
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-securitygroupegress.html#cfn-ec2-securitygroupegress-destinationsecuritygroupid)
   */
  public fun destinationSecurityGroupId(): String? = unwrap(this).getDestinationSecurityGroupId()

  /**
   * If the protocol is TCP or UDP, this is the start of the port range.
   *
   * If the protocol is ICMP or ICMPv6, this is the ICMP type or -1 (all ICMP types).
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-securitygroupegress.html#cfn-ec2-securitygroupegress-fromport)
   */
  public fun fromPort(): Number? = unwrap(this).getFromPort()

  /**
   * The ID of the security group.
   *
   * You must specify either the security group ID or the security group name in the request. For
   * security groups in a nondefault VPC, you must specify the security group ID.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-securitygroupegress.html#cfn-ec2-securitygroupegress-groupid)
   */
  public fun groupId(): String

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
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-securitygroupegress.html#cfn-ec2-securitygroupegress-ipprotocol)
   */
  public fun ipProtocol(): String

  /**
   * If the protocol is TCP or UDP, this is the end of the port range.
   *
   * If the protocol is ICMP or ICMPv6, this is the ICMP code or -1 (all ICMP codes). If the start
   * port is -1 (all ICMP types), then the end port must be -1 (all ICMP codes).
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-securitygroupegress.html#cfn-ec2-securitygroupegress-toport)
   */
  public fun toPort(): Number? = unwrap(this).getToPort()

  /**
   * A builder for [CfnSecurityGroupEgressProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param cidrIp The IPv4 address range, in CIDR format.
     * You must specify a destination security group ( `DestinationPrefixListId` or
     * `DestinationSecurityGroupId` ) or a CIDR range ( `CidrIp` or `CidrIpv6` ).
     *
     * For examples of rules that you can add to security groups for specific access scenarios, see
     * [Security group rules for different use
     * cases](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/security-group-rules-reference.html)
     * in the *Amazon EC2 User Guide* .
     */
    public fun cidrIp(cidrIp: String)

    /**
     * @param cidrIpv6 The IPv6 address range, in CIDR format.
     * You must specify a destination security group ( `DestinationPrefixListId` or
     * `DestinationSecurityGroupId` ) or a CIDR range ( `CidrIp` or `CidrIpv6` ).
     *
     * For examples of rules that you can add to security groups for specific access scenarios, see
     * [Security group rules for different use
     * cases](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/security-group-rules-reference.html)
     * in the *Amazon EC2 User Guide* .
     */
    public fun cidrIpv6(cidrIpv6: String)

    /**
     * @param description The description of an egress (outbound) security group rule.
     * Constraints: Up to 255 characters in length. Allowed characters are a-z, A-Z, 0-9, spaces,
     * and ._-:/()#,&#64;[]+=;{}!$*
     */
    public fun description(description: String)

    /**
     * @param destinationPrefixListId The prefix list IDs for an AWS service.
     * This is the AWS service that you want to access through a VPC endpoint from instances
     * associated with the security group.
     *
     * You must specify a destination security group ( `DestinationPrefixListId` or
     * `DestinationSecurityGroupId` ) or a CIDR range ( `CidrIp` or `CidrIpv6` ).
     */
    public fun destinationPrefixListId(destinationPrefixListId: String)

    /**
     * @param destinationSecurityGroupId The ID of the security group.
     * You must specify a destination security group ( `DestinationPrefixListId` or
     * `DestinationSecurityGroupId` ) or a CIDR range ( `CidrIp` or `CidrIpv6` ).
     */
    public fun destinationSecurityGroupId(destinationSecurityGroupId: String)

    /**
     * @param fromPort If the protocol is TCP or UDP, this is the start of the port range.
     * If the protocol is ICMP or ICMPv6, this is the ICMP type or -1 (all ICMP types).
     */
    public fun fromPort(fromPort: Number)

    /**
     * @param groupId The ID of the security group. 
     * You must specify either the security group ID or the security group name in the request. For
     * security groups in a nondefault VPC, you must specify the security group ID.
     */
    public fun groupId(groupId: String)

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
     * @param toPort If the protocol is TCP or UDP, this is the end of the port range.
     * If the protocol is ICMP or ICMPv6, this is the ICMP code or -1 (all ICMP codes). If the start
     * port is -1 (all ICMP types), then the end port must be -1 (all ICMP codes).
     */
    public fun toPort(toPort: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.CfnSecurityGroupEgressProps.Builder
        = software.amazon.awscdk.services.ec2.CfnSecurityGroupEgressProps.builder()

    /**
     * @param cidrIp The IPv4 address range, in CIDR format.
     * You must specify a destination security group ( `DestinationPrefixListId` or
     * `DestinationSecurityGroupId` ) or a CIDR range ( `CidrIp` or `CidrIpv6` ).
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
     * You must specify a destination security group ( `DestinationPrefixListId` or
     * `DestinationSecurityGroupId` ) or a CIDR range ( `CidrIp` or `CidrIpv6` ).
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
     * @param description The description of an egress (outbound) security group rule.
     * Constraints: Up to 255 characters in length. Allowed characters are a-z, A-Z, 0-9, spaces,
     * and ._-:/()#,&#64;[]+=;{}!$*
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param destinationPrefixListId The prefix list IDs for an AWS service.
     * This is the AWS service that you want to access through a VPC endpoint from instances
     * associated with the security group.
     *
     * You must specify a destination security group ( `DestinationPrefixListId` or
     * `DestinationSecurityGroupId` ) or a CIDR range ( `CidrIp` or `CidrIpv6` ).
     */
    override fun destinationPrefixListId(destinationPrefixListId: String) {
      cdkBuilder.destinationPrefixListId(destinationPrefixListId)
    }

    /**
     * @param destinationSecurityGroupId The ID of the security group.
     * You must specify a destination security group ( `DestinationPrefixListId` or
     * `DestinationSecurityGroupId` ) or a CIDR range ( `CidrIp` or `CidrIpv6` ).
     */
    override fun destinationSecurityGroupId(destinationSecurityGroupId: String) {
      cdkBuilder.destinationSecurityGroupId(destinationSecurityGroupId)
    }

    /**
     * @param fromPort If the protocol is TCP or UDP, this is the start of the port range.
     * If the protocol is ICMP or ICMPv6, this is the ICMP type or -1 (all ICMP types).
     */
    override fun fromPort(fromPort: Number) {
      cdkBuilder.fromPort(fromPort)
    }

    /**
     * @param groupId The ID of the security group. 
     * You must specify either the security group ID or the security group name in the request. For
     * security groups in a nondefault VPC, you must specify the security group ID.
     */
    override fun groupId(groupId: String) {
      cdkBuilder.groupId(groupId)
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
     * @param toPort If the protocol is TCP or UDP, this is the end of the port range.
     * If the protocol is ICMP or ICMPv6, this is the ICMP code or -1 (all ICMP codes). If the start
     * port is -1 (all ICMP types), then the end port must be -1 (all ICMP codes).
     */
    override fun toPort(toPort: Number) {
      cdkBuilder.toPort(toPort)
    }

    public fun build(): software.amazon.awscdk.services.ec2.CfnSecurityGroupEgressProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.CfnSecurityGroupEgressProps,
  ) : CdkObject(cdkObject), CfnSecurityGroupEgressProps {
    /**
     * The IPv4 address range, in CIDR format.
     *
     * You must specify a destination security group ( `DestinationPrefixListId` or
     * `DestinationSecurityGroupId` ) or a CIDR range ( `CidrIp` or `CidrIpv6` ).
     *
     * For examples of rules that you can add to security groups for specific access scenarios, see
     * [Security group rules for different use
     * cases](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/security-group-rules-reference.html)
     * in the *Amazon EC2 User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-securitygroupegress.html#cfn-ec2-securitygroupegress-cidrip)
     */
    override fun cidrIp(): String? = unwrap(this).getCidrIp()

    /**
     * The IPv6 address range, in CIDR format.
     *
     * You must specify a destination security group ( `DestinationPrefixListId` or
     * `DestinationSecurityGroupId` ) or a CIDR range ( `CidrIp` or `CidrIpv6` ).
     *
     * For examples of rules that you can add to security groups for specific access scenarios, see
     * [Security group rules for different use
     * cases](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/security-group-rules-reference.html)
     * in the *Amazon EC2 User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-securitygroupegress.html#cfn-ec2-securitygroupegress-cidripv6)
     */
    override fun cidrIpv6(): String? = unwrap(this).getCidrIpv6()

    /**
     * The description of an egress (outbound) security group rule.
     *
     * Constraints: Up to 255 characters in length. Allowed characters are a-z, A-Z, 0-9, spaces,
     * and ._-:/()#,&#64;[]+=;{}!$*
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-securitygroupegress.html#cfn-ec2-securitygroupegress-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The prefix list IDs for an AWS service.
     *
     * This is the AWS service that you want to access through a VPC endpoint from instances
     * associated with the security group.
     *
     * You must specify a destination security group ( `DestinationPrefixListId` or
     * `DestinationSecurityGroupId` ) or a CIDR range ( `CidrIp` or `CidrIpv6` ).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-securitygroupegress.html#cfn-ec2-securitygroupegress-destinationprefixlistid)
     */
    override fun destinationPrefixListId(): String? = unwrap(this).getDestinationPrefixListId()

    /**
     * The ID of the security group.
     *
     * You must specify a destination security group ( `DestinationPrefixListId` or
     * `DestinationSecurityGroupId` ) or a CIDR range ( `CidrIp` or `CidrIpv6` ).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-securitygroupegress.html#cfn-ec2-securitygroupegress-destinationsecuritygroupid)
     */
    override fun destinationSecurityGroupId(): String? =
        unwrap(this).getDestinationSecurityGroupId()

    /**
     * If the protocol is TCP or UDP, this is the start of the port range.
     *
     * If the protocol is ICMP or ICMPv6, this is the ICMP type or -1 (all ICMP types).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-securitygroupegress.html#cfn-ec2-securitygroupegress-fromport)
     */
    override fun fromPort(): Number? = unwrap(this).getFromPort()

    /**
     * The ID of the security group.
     *
     * You must specify either the security group ID or the security group name in the request. For
     * security groups in a nondefault VPC, you must specify the security group ID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-securitygroupegress.html#cfn-ec2-securitygroupegress-groupid)
     */
    override fun groupId(): String = unwrap(this).getGroupId()

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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-securitygroupegress.html#cfn-ec2-securitygroupegress-ipprotocol)
     */
    override fun ipProtocol(): String = unwrap(this).getIpProtocol()

    /**
     * If the protocol is TCP or UDP, this is the end of the port range.
     *
     * If the protocol is ICMP or ICMPv6, this is the ICMP code or -1 (all ICMP codes). If the start
     * port is -1 (all ICMP types), then the end port must be -1 (all ICMP codes).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-securitygroupegress.html#cfn-ec2-securitygroupegress-toport)
     */
    override fun toPort(): Number? = unwrap(this).getToPort()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnSecurityGroupEgressProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnSecurityGroupEgressProps):
        CfnSecurityGroupEgressProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnSecurityGroupEgressProps):
        software.amazon.awscdk.services.ec2.CfnSecurityGroupEgressProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ec2.CfnSecurityGroupEgressProps
  }
}
