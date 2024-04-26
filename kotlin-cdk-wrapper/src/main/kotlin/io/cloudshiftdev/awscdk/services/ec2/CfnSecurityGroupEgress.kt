@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Adds the specified outbound (egress) rule to a security group.
 *
 * An outbound rule permits instances to send traffic to the specified IPv4 or IPv6 address range,
 * the IP addresses that are specified by a prefix list, or the instances that are associated with a
 * destination security group. For more information, see [Security group
 * rules](https://docs.aws.amazon.com/vpc/latest/userguide/security-group-rules.html) .
 *
 * You must specify exactly one of the following destinations: an IPv4 address range, an IPv6
 * address range, a prefix list, or a security group.
 *
 * You must specify a protocol for each rule (for example, TCP). If the protocol is TCP or UDP, you
 * must also specify a port or port range. If the protocol is ICMP or ICMPv6, you must also specify the
 * ICMP/ICMPv6 type and code. To specify all types or all codes, use -1.
 *
 * Rule changes are propagated to instances associated with the security group as quickly as
 * possible. However, a small delay might occur.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ec2.*;
 * CfnSecurityGroupEgress cfnSecurityGroupEgress = CfnSecurityGroupEgress.Builder.create(this,
 * "MyCfnSecurityGroupEgress")
 * .groupId("groupId")
 * .ipProtocol("ipProtocol")
 * // the properties below are optional
 * .cidrIp("cidrIp")
 * .cidrIpv6("cidrIpv6")
 * .description("description")
 * .destinationPrefixListId("destinationPrefixListId")
 * .destinationSecurityGroupId("destinationSecurityGroupId")
 * .fromPort(123)
 * .toPort(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-securitygroupegress.html)
 */
public open class CfnSecurityGroupEgress(
  cdkObject: software.amazon.awscdk.services.ec2.CfnSecurityGroupEgress,
) : CfnResource(cdkObject), IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnSecurityGroupEgressProps,
  ) :
      this(software.amazon.awscdk.services.ec2.CfnSecurityGroupEgress(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CfnSecurityGroupEgressProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnSecurityGroupEgressProps.Builder.() -> Unit,
  ) : this(scope, id, CfnSecurityGroupEgressProps(props)
  )

  /**
   *
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * The IPv4 address range, in CIDR format.
   */
  public open fun cidrIp(): String? = unwrap(this).getCidrIp()

  /**
   * The IPv4 address range, in CIDR format.
   */
  public open fun cidrIp(`value`: String) {
    unwrap(this).setCidrIp(`value`)
  }

  /**
   * The IPv6 address range, in CIDR format.
   */
  public open fun cidrIpv6(): String? = unwrap(this).getCidrIpv6()

  /**
   * The IPv6 address range, in CIDR format.
   */
  public open fun cidrIpv6(`value`: String) {
    unwrap(this).setCidrIpv6(`value`)
  }

  /**
   * The description of an egress (outbound) security group rule.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * The description of an egress (outbound) security group rule.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * The prefix list IDs for an AWS service.
   */
  public open fun destinationPrefixListId(): String? = unwrap(this).getDestinationPrefixListId()

  /**
   * The prefix list IDs for an AWS service.
   */
  public open fun destinationPrefixListId(`value`: String) {
    unwrap(this).setDestinationPrefixListId(`value`)
  }

  /**
   * The ID of the security group.
   */
  public open fun destinationSecurityGroupId(): String? =
      unwrap(this).getDestinationSecurityGroupId()

  /**
   * The ID of the security group.
   */
  public open fun destinationSecurityGroupId(`value`: String) {
    unwrap(this).setDestinationSecurityGroupId(`value`)
  }

  /**
   * If the protocol is TCP or UDP, this is the start of the port range.
   */
  public open fun fromPort(): Number? = unwrap(this).getFromPort()

  /**
   * If the protocol is TCP or UDP, this is the start of the port range.
   */
  public open fun fromPort(`value`: Number) {
    unwrap(this).setFromPort(`value`)
  }

  /**
   * The ID of the security group.
   */
  public open fun groupId(): String = unwrap(this).getGroupId()

  /**
   * The ID of the security group.
   */
  public open fun groupId(`value`: String) {
    unwrap(this).setGroupId(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The IP protocol name ( `tcp` , `udp` , `icmp` , `icmpv6` ) or number (see [Protocol
   * Numbers](https://docs.aws.amazon.com/http://www.iana.org/assignments/protocol-numbers/protocol-numbers.xhtml)
   * ).
   */
  public open fun ipProtocol(): String = unwrap(this).getIpProtocol()

  /**
   * The IP protocol name ( `tcp` , `udp` , `icmp` , `icmpv6` ) or number (see [Protocol
   * Numbers](https://docs.aws.amazon.com/http://www.iana.org/assignments/protocol-numbers/protocol-numbers.xhtml)
   * ).
   */
  public open fun ipProtocol(`value`: String) {
    unwrap(this).setIpProtocol(`value`)
  }

  /**
   * If the protocol is TCP or UDP, this is the end of the port range.
   */
  public open fun toPort(): Number? = unwrap(this).getToPort()

  /**
   * If the protocol is TCP or UDP, this is the end of the port range.
   */
  public open fun toPort(`value`: Number) {
    unwrap(this).setToPort(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.ec2.CfnSecurityGroupEgress].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The IPv4 address range, in CIDR format.
     *
     * You must specify exactly one of the following: `CidrIp` , `CidrIpv6` ,
     * `DestinationPrefixListId` , or `DestinationSecurityGroupId` .
     *
     * For examples of rules that you can add to security groups for specific access scenarios, see
     * [Security group rules for different use
     * cases](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/security-group-rules-reference.html)
     * in the *Amazon EC2 User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-securitygroupegress.html#cfn-ec2-securitygroupegress-cidrip)
     * @param cidrIp The IPv4 address range, in CIDR format. 
     */
    public fun cidrIp(cidrIp: String)

    /**
     * The IPv6 address range, in CIDR format.
     *
     * You must specify exactly one of the following: `CidrIp` , `CidrIpv6` ,
     * `DestinationPrefixListId` , or `DestinationSecurityGroupId` .
     *
     * For examples of rules that you can add to security groups for specific access scenarios, see
     * [Security group rules for different use
     * cases](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/security-group-rules-reference.html)
     * in the *Amazon EC2 User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-securitygroupegress.html#cfn-ec2-securitygroupegress-cidripv6)
     * @param cidrIpv6 The IPv6 address range, in CIDR format. 
     */
    public fun cidrIpv6(cidrIpv6: String)

    /**
     * The description of an egress (outbound) security group rule.
     *
     * Constraints: Up to 255 characters in length. Allowed characters are a-z, A-Z, 0-9, spaces,
     * and ._-:/()#,&#64;[]+=;{}!$*
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-securitygroupegress.html#cfn-ec2-securitygroupegress-description)
     * @param description The description of an egress (outbound) security group rule. 
     */
    public fun description(description: String)

    /**
     * The prefix list IDs for an AWS service.
     *
     * This is the AWS service to access through a VPC endpoint from instances associated with the
     * security group.
     *
     * You must specify exactly one of the following: `CidrIp` , `CidrIpv6` ,
     * `DestinationPrefixListId` , or `DestinationSecurityGroupId` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-securitygroupegress.html#cfn-ec2-securitygroupegress-destinationprefixlistid)
     * @param destinationPrefixListId The prefix list IDs for an AWS service. 
     */
    public fun destinationPrefixListId(destinationPrefixListId: String)

    /**
     * The ID of the security group.
     *
     * You must specify exactly one of the following: `CidrIp` , `CidrIpv6` ,
     * `DestinationPrefixListId` , or `DestinationSecurityGroupId` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-securitygroupegress.html#cfn-ec2-securitygroupegress-destinationsecuritygroupid)
     * @param destinationSecurityGroupId The ID of the security group. 
     */
    public fun destinationSecurityGroupId(destinationSecurityGroupId: String)

    /**
     * If the protocol is TCP or UDP, this is the start of the port range.
     *
     * If the protocol is ICMP or ICMPv6, this is the ICMP type or -1 (all ICMP types).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-securitygroupegress.html#cfn-ec2-securitygroupegress-fromport)
     * @param fromPort If the protocol is TCP or UDP, this is the start of the port range. 
     */
    public fun fromPort(fromPort: Number)

    /**
     * The ID of the security group.
     *
     * You must specify either the security group ID or the security group name in the request. For
     * security groups in a nondefault VPC, you must specify the security group ID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-securitygroupegress.html#cfn-ec2-securitygroupegress-groupid)
     * @param groupId The ID of the security group. 
     */
    public fun groupId(groupId: String)

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
     * @param ipProtocol The IP protocol name ( `tcp` , `udp` , `icmp` , `icmpv6` ) or number (see
     * [Protocol
     * Numbers](https://docs.aws.amazon.com/http://www.iana.org/assignments/protocol-numbers/protocol-numbers.xhtml)
     * ). 
     */
    public fun ipProtocol(ipProtocol: String)

    /**
     * If the protocol is TCP or UDP, this is the end of the port range.
     *
     * If the protocol is ICMP or ICMPv6, this is the ICMP code or -1 (all ICMP codes). If the start
     * port is -1 (all ICMP types), then the end port must be -1 (all ICMP codes).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-securitygroupegress.html#cfn-ec2-securitygroupegress-toport)
     * @param toPort If the protocol is TCP or UDP, this is the end of the port range. 
     */
    public fun toPort(toPort: Number)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.CfnSecurityGroupEgress.Builder =
        software.amazon.awscdk.services.ec2.CfnSecurityGroupEgress.Builder.create(scope, id)

    /**
     * The IPv4 address range, in CIDR format.
     *
     * You must specify exactly one of the following: `CidrIp` , `CidrIpv6` ,
     * `DestinationPrefixListId` , or `DestinationSecurityGroupId` .
     *
     * For examples of rules that you can add to security groups for specific access scenarios, see
     * [Security group rules for different use
     * cases](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/security-group-rules-reference.html)
     * in the *Amazon EC2 User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-securitygroupegress.html#cfn-ec2-securitygroupegress-cidrip)
     * @param cidrIp The IPv4 address range, in CIDR format. 
     */
    override fun cidrIp(cidrIp: String) {
      cdkBuilder.cidrIp(cidrIp)
    }

    /**
     * The IPv6 address range, in CIDR format.
     *
     * You must specify exactly one of the following: `CidrIp` , `CidrIpv6` ,
     * `DestinationPrefixListId` , or `DestinationSecurityGroupId` .
     *
     * For examples of rules that you can add to security groups for specific access scenarios, see
     * [Security group rules for different use
     * cases](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/security-group-rules-reference.html)
     * in the *Amazon EC2 User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-securitygroupegress.html#cfn-ec2-securitygroupegress-cidripv6)
     * @param cidrIpv6 The IPv6 address range, in CIDR format. 
     */
    override fun cidrIpv6(cidrIpv6: String) {
      cdkBuilder.cidrIpv6(cidrIpv6)
    }

    /**
     * The description of an egress (outbound) security group rule.
     *
     * Constraints: Up to 255 characters in length. Allowed characters are a-z, A-Z, 0-9, spaces,
     * and ._-:/()#,&#64;[]+=;{}!$*
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-securitygroupegress.html#cfn-ec2-securitygroupegress-description)
     * @param description The description of an egress (outbound) security group rule. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The prefix list IDs for an AWS service.
     *
     * This is the AWS service to access through a VPC endpoint from instances associated with the
     * security group.
     *
     * You must specify exactly one of the following: `CidrIp` , `CidrIpv6` ,
     * `DestinationPrefixListId` , or `DestinationSecurityGroupId` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-securitygroupegress.html#cfn-ec2-securitygroupegress-destinationprefixlistid)
     * @param destinationPrefixListId The prefix list IDs for an AWS service. 
     */
    override fun destinationPrefixListId(destinationPrefixListId: String) {
      cdkBuilder.destinationPrefixListId(destinationPrefixListId)
    }

    /**
     * The ID of the security group.
     *
     * You must specify exactly one of the following: `CidrIp` , `CidrIpv6` ,
     * `DestinationPrefixListId` , or `DestinationSecurityGroupId` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-securitygroupegress.html#cfn-ec2-securitygroupegress-destinationsecuritygroupid)
     * @param destinationSecurityGroupId The ID of the security group. 
     */
    override fun destinationSecurityGroupId(destinationSecurityGroupId: String) {
      cdkBuilder.destinationSecurityGroupId(destinationSecurityGroupId)
    }

    /**
     * If the protocol is TCP or UDP, this is the start of the port range.
     *
     * If the protocol is ICMP or ICMPv6, this is the ICMP type or -1 (all ICMP types).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-securitygroupegress.html#cfn-ec2-securitygroupegress-fromport)
     * @param fromPort If the protocol is TCP or UDP, this is the start of the port range. 
     */
    override fun fromPort(fromPort: Number) {
      cdkBuilder.fromPort(fromPort)
    }

    /**
     * The ID of the security group.
     *
     * You must specify either the security group ID or the security group name in the request. For
     * security groups in a nondefault VPC, you must specify the security group ID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-securitygroupegress.html#cfn-ec2-securitygroupegress-groupid)
     * @param groupId The ID of the security group. 
     */
    override fun groupId(groupId: String) {
      cdkBuilder.groupId(groupId)
    }

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
     * @param ipProtocol The IP protocol name ( `tcp` , `udp` , `icmp` , `icmpv6` ) or number (see
     * [Protocol
     * Numbers](https://docs.aws.amazon.com/http://www.iana.org/assignments/protocol-numbers/protocol-numbers.xhtml)
     * ). 
     */
    override fun ipProtocol(ipProtocol: String) {
      cdkBuilder.ipProtocol(ipProtocol)
    }

    /**
     * If the protocol is TCP or UDP, this is the end of the port range.
     *
     * If the protocol is ICMP or ICMPv6, this is the ICMP code or -1 (all ICMP codes). If the start
     * port is -1 (all ICMP types), then the end port must be -1 (all ICMP codes).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-securitygroupegress.html#cfn-ec2-securitygroupegress-toport)
     * @param toPort If the protocol is TCP or UDP, this is the end of the port range. 
     */
    override fun toPort(toPort: Number) {
      cdkBuilder.toPort(toPort)
    }

    public fun build(): software.amazon.awscdk.services.ec2.CfnSecurityGroupEgress =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.ec2.CfnSecurityGroupEgress.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnSecurityGroupEgress {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnSecurityGroupEgress(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnSecurityGroupEgress):
        CfnSecurityGroupEgress = CfnSecurityGroupEgress(cdkObject)

    internal fun unwrap(wrapped: CfnSecurityGroupEgress):
        software.amazon.awscdk.services.ec2.CfnSecurityGroupEgress = wrapped.cdkObject as
        software.amazon.awscdk.services.ec2.CfnSecurityGroupEgress
  }
}
