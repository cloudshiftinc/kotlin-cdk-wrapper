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
 * Adds an inbound (ingress) rule to a security group.
 *
 * An inbound rule permits instances to receive traffic from the specified IPv4 or IPv6 address
 * range, the IP addresses that are specified by a prefix list, or the instances that are associated
 * with a source security group. For more information, see [Security group
 * rules](https://docs.aws.amazon.com/vpc/latest/userguide/security-group-rules.html) .
 *
 * You must specify only one of the following sources: an IPv4 or IPv6 address range, a prefix list,
 * or a security group. Otherwise, the stack launches successfully, but the rule is not added to the
 * security group.
 *
 * You must specify a protocol for each rule (for example, TCP). If the protocol is TCP or UDP, you
 * must also specify a port or port range. If the protocol is ICMP or ICMPv6, you must also specify the
 * ICMP/ICMPv6 type and code.
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
public open class CfnSecurityGroupIngress(
  cdkObject: software.amazon.awscdk.services.ec2.CfnSecurityGroupIngress,
) : CfnResource(cdkObject), IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnSecurityGroupIngressProps,
  ) :
      this(software.amazon.awscdk.services.ec2.CfnSecurityGroupIngress(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CfnSecurityGroupIngressProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnSecurityGroupIngressProps.Builder.() -> Unit,
  ) : this(scope, id, CfnSecurityGroupIngressProps(props)
  )

  /**
   * The Security Group Rule Id.
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
   * Updates the description of an ingress (inbound) security group rule.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * Updates the description of an ingress (inbound) security group rule.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * The start of port range for the TCP and UDP protocols, or an ICMP/ICMPv6 type number.
   */
  public open fun fromPort(): Number? = unwrap(this).getFromPort()

  /**
   * The start of port range for the TCP and UDP protocols, or an ICMP/ICMPv6 type number.
   */
  public open fun fromPort(`value`: Number) {
    unwrap(this).setFromPort(`value`)
  }

  /**
   * The ID of the security group.
   */
  public open fun groupId(): String? = unwrap(this).getGroupId()

  /**
   * The ID of the security group.
   */
  public open fun groupId(`value`: String) {
    unwrap(this).setGroupId(`value`)
  }

  /**
   * The name of the security group.
   */
  public open fun groupName(): String? = unwrap(this).getGroupName()

  /**
   * The name of the security group.
   */
  public open fun groupName(`value`: String) {
    unwrap(this).setGroupName(`value`)
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
   * The ID of a prefix list.
   */
  public open fun sourcePrefixListId(): String? = unwrap(this).getSourcePrefixListId()

  /**
   * The ID of a prefix list.
   */
  public open fun sourcePrefixListId(`value`: String) {
    unwrap(this).setSourcePrefixListId(`value`)
  }

  /**
   * The ID of the security group.
   */
  public open fun sourceSecurityGroupId(): String? = unwrap(this).getSourceSecurityGroupId()

  /**
   * The ID of the security group.
   */
  public open fun sourceSecurityGroupId(`value`: String) {
    unwrap(this).setSourceSecurityGroupId(`value`)
  }

  /**
   * [Default VPC] The name of the source security group.
   */
  public open fun sourceSecurityGroupName(): String? = unwrap(this).getSourceSecurityGroupName()

  /**
   * [Default VPC] The name of the source security group.
   */
  public open fun sourceSecurityGroupName(`value`: String) {
    unwrap(this).setSourceSecurityGroupName(`value`)
  }

  /**
   * [nondefault VPC] The AWS account ID for the source security group, if the source security group
   * is in a different account.
   */
  public open fun sourceSecurityGroupOwnerId(): String? =
      unwrap(this).getSourceSecurityGroupOwnerId()

  /**
   * [nondefault VPC] The AWS account ID for the source security group, if the source security group
   * is in a different account.
   */
  public open fun sourceSecurityGroupOwnerId(`value`: String) {
    unwrap(this).setSourceSecurityGroupOwnerId(`value`)
  }

  /**
   * The end of port range for the TCP and UDP protocols, or an ICMP/ICMPv6 code.
   */
  public open fun toPort(): Number? = unwrap(this).getToPort()

  /**
   * The end of port range for the TCP and UDP protocols, or an ICMP/ICMPv6 code.
   */
  public open fun toPort(`value`: Number) {
    unwrap(this).setToPort(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.ec2.CfnSecurityGroupIngress].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The IPv4 address range, in CIDR format.
     *
     * You must specify a source security group ( `SourcePrefixListId` or `SourceSecurityGroupId` )
     * or a CIDR range ( `CidrIp` or `CidrIpv6` ).
     *
     * For examples of rules that you can add to security groups for specific access scenarios, see
     * [Security group rules for different use
     * cases](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/security-group-rules-reference.html)
     * in the *Amazon EC2 User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-securitygroupingress.html#cfn-ec2-securitygroupingress-cidrip)
     * @param cidrIp The IPv4 address range, in CIDR format. 
     */
    public fun cidrIp(cidrIp: String)

    /**
     * The IPv6 address range, in CIDR format.
     *
     * You must specify a source security group ( `SourcePrefixListId` or `SourceSecurityGroupId` )
     * or a CIDR range ( `CidrIp` or `CidrIpv6` ).
     *
     * For examples of rules that you can add to security groups for specific access scenarios, see
     * [Security group rules for different use
     * cases](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/security-group-rules-reference.html)
     * in the *Amazon EC2 User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-securitygroupingress.html#cfn-ec2-securitygroupingress-cidripv6)
     * @param cidrIpv6 The IPv6 address range, in CIDR format. 
     */
    public fun cidrIpv6(cidrIpv6: String)

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
     * @param description Updates the description of an ingress (inbound) security group rule. 
     */
    public fun description(description: String)

    /**
     * The start of port range for the TCP and UDP protocols, or an ICMP/ICMPv6 type number.
     *
     * A value of `-1` indicates all ICMP/ICMPv6 types. If you specify all ICMP/ICMPv6 types, you
     * must specify all codes.
     *
     * Use this for ICMP and any protocol that uses ports.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-securitygroupingress.html#cfn-ec2-securitygroupingress-fromport)
     * @param fromPort The start of port range for the TCP and UDP protocols, or an ICMP/ICMPv6 type
     * number. 
     */
    public fun fromPort(fromPort: Number)

    /**
     * The ID of the security group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-securitygroupingress.html#cfn-ec2-securitygroupingress-groupid)
     * @param groupId The ID of the security group. 
     */
    public fun groupId(groupId: String)

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
    public fun groupName(groupName: String)

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
     * @param ipProtocol The IP protocol name ( `tcp` , `udp` , `icmp` , `icmpv6` ) or number (see
     * [Protocol
     * Numbers](https://docs.aws.amazon.com/http://www.iana.org/assignments/protocol-numbers/protocol-numbers.xhtml)
     * ). 
     */
    public fun ipProtocol(ipProtocol: String)

    /**
     * The ID of a prefix list.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-securitygroupingress.html#cfn-ec2-securitygroupingress-sourceprefixlistid)
     * @param sourcePrefixListId The ID of a prefix list. 
     */
    public fun sourcePrefixListId(sourcePrefixListId: String)

    /**
     * The ID of the security group.
     *
     * You must specify either the security group ID or the security group name. For security groups
     * in a nondefault VPC, you must specify the security group ID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-securitygroupingress.html#cfn-ec2-securitygroupingress-sourcesecuritygroupid)
     * @param sourceSecurityGroupId The ID of the security group. 
     */
    public fun sourceSecurityGroupId(sourceSecurityGroupId: String)

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
     * @param sourceSecurityGroupName [Default VPC] The name of the source security group. 
     */
    public fun sourceSecurityGroupName(sourceSecurityGroupName: String)

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
     * @param sourceSecurityGroupOwnerId [nondefault VPC] The AWS account ID for the source security
     * group, if the source security group is in a different account. 
     */
    public fun sourceSecurityGroupOwnerId(sourceSecurityGroupOwnerId: String)

    /**
     * The end of port range for the TCP and UDP protocols, or an ICMP/ICMPv6 code.
     *
     * A value of `-1` indicates all ICMP/ICMPv6 codes for the specified ICMP type. If you specify
     * all ICMP/ICMPv6 types, you must specify all codes.
     *
     * Use this for ICMP and any protocol that uses ports.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-securitygroupingress.html#cfn-ec2-securitygroupingress-toport)
     * @param toPort The end of port range for the TCP and UDP protocols, or an ICMP/ICMPv6 code. 
     */
    public fun toPort(toPort: Number)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.CfnSecurityGroupIngress.Builder =
        software.amazon.awscdk.services.ec2.CfnSecurityGroupIngress.Builder.create(scope, id)

    /**
     * The IPv4 address range, in CIDR format.
     *
     * You must specify a source security group ( `SourcePrefixListId` or `SourceSecurityGroupId` )
     * or a CIDR range ( `CidrIp` or `CidrIpv6` ).
     *
     * For examples of rules that you can add to security groups for specific access scenarios, see
     * [Security group rules for different use
     * cases](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/security-group-rules-reference.html)
     * in the *Amazon EC2 User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-securitygroupingress.html#cfn-ec2-securitygroupingress-cidrip)
     * @param cidrIp The IPv4 address range, in CIDR format. 
     */
    override fun cidrIp(cidrIp: String) {
      cdkBuilder.cidrIp(cidrIp)
    }

    /**
     * The IPv6 address range, in CIDR format.
     *
     * You must specify a source security group ( `SourcePrefixListId` or `SourceSecurityGroupId` )
     * or a CIDR range ( `CidrIp` or `CidrIpv6` ).
     *
     * For examples of rules that you can add to security groups for specific access scenarios, see
     * [Security group rules for different use
     * cases](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/security-group-rules-reference.html)
     * in the *Amazon EC2 User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-securitygroupingress.html#cfn-ec2-securitygroupingress-cidripv6)
     * @param cidrIpv6 The IPv6 address range, in CIDR format. 
     */
    override fun cidrIpv6(cidrIpv6: String) {
      cdkBuilder.cidrIpv6(cidrIpv6)
    }

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
     * @param description Updates the description of an ingress (inbound) security group rule. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The start of port range for the TCP and UDP protocols, or an ICMP/ICMPv6 type number.
     *
     * A value of `-1` indicates all ICMP/ICMPv6 types. If you specify all ICMP/ICMPv6 types, you
     * must specify all codes.
     *
     * Use this for ICMP and any protocol that uses ports.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-securitygroupingress.html#cfn-ec2-securitygroupingress-fromport)
     * @param fromPort The start of port range for the TCP and UDP protocols, or an ICMP/ICMPv6 type
     * number. 
     */
    override fun fromPort(fromPort: Number) {
      cdkBuilder.fromPort(fromPort)
    }

    /**
     * The ID of the security group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-securitygroupingress.html#cfn-ec2-securitygroupingress-groupid)
     * @param groupId The ID of the security group. 
     */
    override fun groupId(groupId: String) {
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
    override fun groupName(groupName: String) {
      cdkBuilder.groupName(groupName)
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-securitygroupingress.html#cfn-ec2-securitygroupingress-ipprotocol)
     * @param ipProtocol The IP protocol name ( `tcp` , `udp` , `icmp` , `icmpv6` ) or number (see
     * [Protocol
     * Numbers](https://docs.aws.amazon.com/http://www.iana.org/assignments/protocol-numbers/protocol-numbers.xhtml)
     * ). 
     */
    override fun ipProtocol(ipProtocol: String) {
      cdkBuilder.ipProtocol(ipProtocol)
    }

    /**
     * The ID of a prefix list.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-securitygroupingress.html#cfn-ec2-securitygroupingress-sourceprefixlistid)
     * @param sourcePrefixListId The ID of a prefix list. 
     */
    override fun sourcePrefixListId(sourcePrefixListId: String) {
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
    override fun sourceSecurityGroupId(sourceSecurityGroupId: String) {
      cdkBuilder.sourceSecurityGroupId(sourceSecurityGroupId)
    }

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
     * @param sourceSecurityGroupName [Default VPC] The name of the source security group. 
     */
    override fun sourceSecurityGroupName(sourceSecurityGroupName: String) {
      cdkBuilder.sourceSecurityGroupName(sourceSecurityGroupName)
    }

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
     * @param sourceSecurityGroupOwnerId [nondefault VPC] The AWS account ID for the source security
     * group, if the source security group is in a different account. 
     */
    override fun sourceSecurityGroupOwnerId(sourceSecurityGroupOwnerId: String) {
      cdkBuilder.sourceSecurityGroupOwnerId(sourceSecurityGroupOwnerId)
    }

    /**
     * The end of port range for the TCP and UDP protocols, or an ICMP/ICMPv6 code.
     *
     * A value of `-1` indicates all ICMP/ICMPv6 codes for the specified ICMP type. If you specify
     * all ICMP/ICMPv6 types, you must specify all codes.
     *
     * Use this for ICMP and any protocol that uses ports.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-securitygroupingress.html#cfn-ec2-securitygroupingress-toport)
     * @param toPort The end of port range for the TCP and UDP protocols, or an ICMP/ICMPv6 code. 
     */
    override fun toPort(toPort: Number) {
      cdkBuilder.toPort(toPort)
    }

    public fun build(): software.amazon.awscdk.services.ec2.CfnSecurityGroupIngress =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.ec2.CfnSecurityGroupIngress.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnSecurityGroupIngress {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnSecurityGroupIngress(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnSecurityGroupIngress):
        CfnSecurityGroupIngress = CfnSecurityGroupIngress(cdkObject)

    internal fun unwrap(wrapped: CfnSecurityGroupIngress):
        software.amazon.awscdk.services.ec2.CfnSecurityGroupIngress = wrapped.cdkObject as
        software.amazon.awscdk.services.ec2.CfnSecurityGroupIngress
  }
}
