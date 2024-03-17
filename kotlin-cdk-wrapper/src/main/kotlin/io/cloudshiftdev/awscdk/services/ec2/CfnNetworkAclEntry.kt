@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Specifies an entry, known as a rule, in a network ACL with a rule number you specify.
 *
 * Each network ACL has a set of numbered ingress rules and a separate set of numbered egress rules.
 *
 * For information about the protocol value, see [Protocol
 * Numbers](https://docs.aws.amazon.com/https://www.iana.org/assignments/protocol-numbers/protocol-numbers.xhtml)
 * on the Internet Assigned Numbers Authority (IANA) website.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ec2.*;
 * CfnNetworkAclEntry cfnNetworkAclEntry = CfnNetworkAclEntry.Builder.create(this,
 * "MyCfnNetworkAclEntry")
 * .networkAclId("networkAclId")
 * .protocol(123)
 * .ruleAction("ruleAction")
 * .ruleNumber(123)
 * // the properties below are optional
 * .cidrBlock("cidrBlock")
 * .egress(false)
 * .icmp(IcmpProperty.builder()
 * .code(123)
 * .type(123)
 * .build())
 * .ipv6CidrBlock("ipv6CidrBlock")
 * .portRange(PortRangeProperty.builder()
 * .from(123)
 * .to(123)
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkaclentry.html)
 */
public open class CfnNetworkAclEntry internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.ec2.CfnNetworkAclEntry,
) : CfnResource(cdkObject), IInspectable {
  /**
   * The ID of the network ACL entry.
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * The IPv4 CIDR range to allow or deny, in CIDR notation (for example, 172.16.0.0/24). You must
   * specify an IPv4 CIDR block or an IPv6 CIDR block.
   */
  public open fun cidrBlock(): String? = unwrap(this).getCidrBlock()

  /**
   * The IPv4 CIDR range to allow or deny, in CIDR notation (for example, 172.16.0.0/24). You must
   * specify an IPv4 CIDR block or an IPv6 CIDR block.
   */
  public open fun cidrBlock(`value`: String) {
    unwrap(this).setCidrBlock(`value`)
  }

  /**
   * Whether this rule applies to egress traffic from the subnet ( `true` ) or ingress traffic to
   * the subnet ( `false` ).
   */
  public open fun egress(): Any? = unwrap(this).getEgress()

  /**
   * Whether this rule applies to egress traffic from the subnet ( `true` ) or ingress traffic to
   * the subnet ( `false` ).
   */
  public open fun egress(`value`: Boolean) {
    unwrap(this).setEgress(`value`)
  }

  /**
   * Whether this rule applies to egress traffic from the subnet ( `true` ) or ingress traffic to
   * the subnet ( `false` ).
   */
  public open fun egress(`value`: IResolvable) {
    unwrap(this).setEgress(`value`.let(IResolvable::unwrap))
  }

  /**
   * The Internet Control Message Protocol (ICMP) code and type.
   */
  public open fun icmp(): Any? = unwrap(this).getIcmp()

  /**
   * The Internet Control Message Protocol (ICMP) code and type.
   */
  public open fun icmp(`value`: IResolvable) {
    unwrap(this).setIcmp(`value`.let(IResolvable::unwrap))
  }

  /**
   * The Internet Control Message Protocol (ICMP) code and type.
   */
  public open fun icmp(`value`: IcmpProperty) {
    unwrap(this).setIcmp(`value`.let(IcmpProperty::unwrap))
  }

  /**
   * The Internet Control Message Protocol (ICMP) code and type.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("55184738d20eb1378fc1b704f394062a5328b85fd14814a2826cc6c4e3e003e8")
  public open fun icmp(`value`: IcmpProperty.Builder.() -> Unit): Unit = icmp(IcmpProperty(`value`))

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The IPv6 network range to allow or deny, in CIDR notation.
   */
  public open fun ipv6CidrBlock(): String? = unwrap(this).getIpv6CidrBlock()

  /**
   * The IPv6 network range to allow or deny, in CIDR notation.
   */
  public open fun ipv6CidrBlock(`value`: String) {
    unwrap(this).setIpv6CidrBlock(`value`)
  }

  /**
   * The ID of the ACL for the entry.
   */
  public open fun networkAclId(): String = unwrap(this).getNetworkAclId()

  /**
   * The ID of the ACL for the entry.
   */
  public open fun networkAclId(`value`: String) {
    unwrap(this).setNetworkAclId(`value`)
  }

  /**
   * The range of port numbers for the UDP/TCP protocol.
   */
  public open fun portRange(): Any? = unwrap(this).getPortRange()

  /**
   * The range of port numbers for the UDP/TCP protocol.
   */
  public open fun portRange(`value`: IResolvable) {
    unwrap(this).setPortRange(`value`.let(IResolvable::unwrap))
  }

  /**
   * The range of port numbers for the UDP/TCP protocol.
   */
  public open fun portRange(`value`: PortRangeProperty) {
    unwrap(this).setPortRange(`value`.let(PortRangeProperty::unwrap))
  }

  /**
   * The range of port numbers for the UDP/TCP protocol.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("08a0e0211939b35b9751acdc74a1bf4db211ee13cd36af718057333d995fb25a")
  public open fun portRange(`value`: PortRangeProperty.Builder.() -> Unit): Unit =
      portRange(PortRangeProperty(`value`))

  /**
   * The IP protocol that the rule applies to.
   */
  public open fun protocol(): Number = unwrap(this).getProtocol()

  /**
   * The IP protocol that the rule applies to.
   */
  public open fun protocol(`value`: Number) {
    unwrap(this).setProtocol(`value`)
  }

  /**
   * Whether to allow or deny traffic that matches the rule;
   */
  public open fun ruleAction(): String = unwrap(this).getRuleAction()

  /**
   * Whether to allow or deny traffic that matches the rule;
   */
  public open fun ruleAction(`value`: String) {
    unwrap(this).setRuleAction(`value`)
  }

  /**
   * Rule number to assign to the entry, such as 100.
   */
  public open fun ruleNumber(): Number = unwrap(this).getRuleNumber()

  /**
   * Rule number to assign to the entry, such as 100.
   */
  public open fun ruleNumber(`value`: Number) {
    unwrap(this).setRuleNumber(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.ec2.CfnNetworkAclEntry].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The IPv4 CIDR range to allow or deny, in CIDR notation (for example, 172.16.0.0/24). You must
     * specify an IPv4 CIDR block or an IPv6 CIDR block.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkaclentry.html#cfn-ec2-networkaclentry-cidrblock)
     * @param cidrBlock The IPv4 CIDR range to allow or deny, in CIDR notation (for example,
     * 172.16.0.0/24). You must specify an IPv4 CIDR block or an IPv6 CIDR block. 
     */
    public fun cidrBlock(cidrBlock: String)

    /**
     * Whether this rule applies to egress traffic from the subnet ( `true` ) or ingress traffic to
     * the subnet ( `false` ).
     *
     * By default, AWS CloudFormation specifies `false` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkaclentry.html#cfn-ec2-networkaclentry-egress)
     * @param egress Whether this rule applies to egress traffic from the subnet ( `true` ) or
     * ingress traffic to the subnet ( `false` ). 
     */
    public fun egress(egress: Boolean)

    /**
     * Whether this rule applies to egress traffic from the subnet ( `true` ) or ingress traffic to
     * the subnet ( `false` ).
     *
     * By default, AWS CloudFormation specifies `false` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkaclentry.html#cfn-ec2-networkaclentry-egress)
     * @param egress Whether this rule applies to egress traffic from the subnet ( `true` ) or
     * ingress traffic to the subnet ( `false` ). 
     */
    public fun egress(egress: IResolvable)

    /**
     * The Internet Control Message Protocol (ICMP) code and type.
     *
     * Required if specifying 1 (ICMP) for the protocol parameter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkaclentry.html#cfn-ec2-networkaclentry-icmp)
     * @param icmp The Internet Control Message Protocol (ICMP) code and type. 
     */
    public fun icmp(icmp: IResolvable)

    /**
     * The Internet Control Message Protocol (ICMP) code and type.
     *
     * Required if specifying 1 (ICMP) for the protocol parameter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkaclentry.html#cfn-ec2-networkaclentry-icmp)
     * @param icmp The Internet Control Message Protocol (ICMP) code and type. 
     */
    public fun icmp(icmp: IcmpProperty)

    /**
     * The Internet Control Message Protocol (ICMP) code and type.
     *
     * Required if specifying 1 (ICMP) for the protocol parameter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkaclentry.html#cfn-ec2-networkaclentry-icmp)
     * @param icmp The Internet Control Message Protocol (ICMP) code and type. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8a613d51f545c688842567246531da6476a28bfac69f661517869cfd459e1f00")
    public fun icmp(icmp: IcmpProperty.Builder.() -> Unit)

    /**
     * The IPv6 network range to allow or deny, in CIDR notation.
     *
     * You must specify an IPv4 CIDR block or an IPv6 CIDR block.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkaclentry.html#cfn-ec2-networkaclentry-ipv6cidrblock)
     * @param ipv6CidrBlock The IPv6 network range to allow or deny, in CIDR notation. 
     */
    public fun ipv6CidrBlock(ipv6CidrBlock: String)

    /**
     * The ID of the ACL for the entry.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkaclentry.html#cfn-ec2-networkaclentry-networkaclid)
     * @param networkAclId The ID of the ACL for the entry. 
     */
    public fun networkAclId(networkAclId: String)

    /**
     * The range of port numbers for the UDP/TCP protocol.
     *
     * Required if specifying 6 (TCP) or 17 (UDP) for the protocol parameter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkaclentry.html#cfn-ec2-networkaclentry-portrange)
     * @param portRange The range of port numbers for the UDP/TCP protocol. 
     */
    public fun portRange(portRange: IResolvable)

    /**
     * The range of port numbers for the UDP/TCP protocol.
     *
     * Required if specifying 6 (TCP) or 17 (UDP) for the protocol parameter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkaclentry.html#cfn-ec2-networkaclentry-portrange)
     * @param portRange The range of port numbers for the UDP/TCP protocol. 
     */
    public fun portRange(portRange: PortRangeProperty)

    /**
     * The range of port numbers for the UDP/TCP protocol.
     *
     * Required if specifying 6 (TCP) or 17 (UDP) for the protocol parameter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkaclentry.html#cfn-ec2-networkaclentry-portrange)
     * @param portRange The range of port numbers for the UDP/TCP protocol. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ac611dc7fb1882857f12b7c643de7e7def24e62823ba7c3d4f0dad0d02b4fd8c")
    public fun portRange(portRange: PortRangeProperty.Builder.() -> Unit)

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
    public fun protocol(protocol: Number)

    /**
     * Whether to allow or deny traffic that matches the rule;
     *
     * valid values are "allow" or "deny".
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkaclentry.html#cfn-ec2-networkaclentry-ruleaction)
     * @param ruleAction Whether to allow or deny traffic that matches the rule;. 
     */
    public fun ruleAction(ruleAction: String)

    /**
     * Rule number to assign to the entry, such as 100.
     *
     * ACL entries are processed in ascending order by rule number. Entries can't use the same rule
     * number unless one is an egress rule and the other is an ingress rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkaclentry.html#cfn-ec2-networkaclentry-rulenumber)
     * @param ruleNumber Rule number to assign to the entry, such as 100. 
     */
    public fun ruleNumber(ruleNumber: Number)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.CfnNetworkAclEntry.Builder =
        software.amazon.awscdk.services.ec2.CfnNetworkAclEntry.Builder.create(scope, id)

    /**
     * The IPv4 CIDR range to allow or deny, in CIDR notation (for example, 172.16.0.0/24). You must
     * specify an IPv4 CIDR block or an IPv6 CIDR block.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkaclentry.html#cfn-ec2-networkaclentry-cidrblock)
     * @param cidrBlock The IPv4 CIDR range to allow or deny, in CIDR notation (for example,
     * 172.16.0.0/24). You must specify an IPv4 CIDR block or an IPv6 CIDR block. 
     */
    override fun cidrBlock(cidrBlock: String) {
      cdkBuilder.cidrBlock(cidrBlock)
    }

    /**
     * Whether this rule applies to egress traffic from the subnet ( `true` ) or ingress traffic to
     * the subnet ( `false` ).
     *
     * By default, AWS CloudFormation specifies `false` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkaclentry.html#cfn-ec2-networkaclentry-egress)
     * @param egress Whether this rule applies to egress traffic from the subnet ( `true` ) or
     * ingress traffic to the subnet ( `false` ). 
     */
    override fun egress(egress: Boolean) {
      cdkBuilder.egress(egress)
    }

    /**
     * Whether this rule applies to egress traffic from the subnet ( `true` ) or ingress traffic to
     * the subnet ( `false` ).
     *
     * By default, AWS CloudFormation specifies `false` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkaclentry.html#cfn-ec2-networkaclentry-egress)
     * @param egress Whether this rule applies to egress traffic from the subnet ( `true` ) or
     * ingress traffic to the subnet ( `false` ). 
     */
    override fun egress(egress: IResolvable) {
      cdkBuilder.egress(egress.let(IResolvable::unwrap))
    }

    /**
     * The Internet Control Message Protocol (ICMP) code and type.
     *
     * Required if specifying 1 (ICMP) for the protocol parameter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkaclentry.html#cfn-ec2-networkaclentry-icmp)
     * @param icmp The Internet Control Message Protocol (ICMP) code and type. 
     */
    override fun icmp(icmp: IResolvable) {
      cdkBuilder.icmp(icmp.let(IResolvable::unwrap))
    }

    /**
     * The Internet Control Message Protocol (ICMP) code and type.
     *
     * Required if specifying 1 (ICMP) for the protocol parameter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkaclentry.html#cfn-ec2-networkaclentry-icmp)
     * @param icmp The Internet Control Message Protocol (ICMP) code and type. 
     */
    override fun icmp(icmp: IcmpProperty) {
      cdkBuilder.icmp(icmp.let(IcmpProperty::unwrap))
    }

    /**
     * The Internet Control Message Protocol (ICMP) code and type.
     *
     * Required if specifying 1 (ICMP) for the protocol parameter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkaclentry.html#cfn-ec2-networkaclentry-icmp)
     * @param icmp The Internet Control Message Protocol (ICMP) code and type. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8a613d51f545c688842567246531da6476a28bfac69f661517869cfd459e1f00")
    override fun icmp(icmp: IcmpProperty.Builder.() -> Unit): Unit = icmp(IcmpProperty(icmp))

    /**
     * The IPv6 network range to allow or deny, in CIDR notation.
     *
     * You must specify an IPv4 CIDR block or an IPv6 CIDR block.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkaclentry.html#cfn-ec2-networkaclentry-ipv6cidrblock)
     * @param ipv6CidrBlock The IPv6 network range to allow or deny, in CIDR notation. 
     */
    override fun ipv6CidrBlock(ipv6CidrBlock: String) {
      cdkBuilder.ipv6CidrBlock(ipv6CidrBlock)
    }

    /**
     * The ID of the ACL for the entry.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkaclentry.html#cfn-ec2-networkaclentry-networkaclid)
     * @param networkAclId The ID of the ACL for the entry. 
     */
    override fun networkAclId(networkAclId: String) {
      cdkBuilder.networkAclId(networkAclId)
    }

    /**
     * The range of port numbers for the UDP/TCP protocol.
     *
     * Required if specifying 6 (TCP) or 17 (UDP) for the protocol parameter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkaclentry.html#cfn-ec2-networkaclentry-portrange)
     * @param portRange The range of port numbers for the UDP/TCP protocol. 
     */
    override fun portRange(portRange: IResolvable) {
      cdkBuilder.portRange(portRange.let(IResolvable::unwrap))
    }

    /**
     * The range of port numbers for the UDP/TCP protocol.
     *
     * Required if specifying 6 (TCP) or 17 (UDP) for the protocol parameter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkaclentry.html#cfn-ec2-networkaclentry-portrange)
     * @param portRange The range of port numbers for the UDP/TCP protocol. 
     */
    override fun portRange(portRange: PortRangeProperty) {
      cdkBuilder.portRange(portRange.let(PortRangeProperty::unwrap))
    }

    /**
     * The range of port numbers for the UDP/TCP protocol.
     *
     * Required if specifying 6 (TCP) or 17 (UDP) for the protocol parameter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkaclentry.html#cfn-ec2-networkaclentry-portrange)
     * @param portRange The range of port numbers for the UDP/TCP protocol. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ac611dc7fb1882857f12b7c643de7e7def24e62823ba7c3d4f0dad0d02b4fd8c")
    override fun portRange(portRange: PortRangeProperty.Builder.() -> Unit): Unit =
        portRange(PortRangeProperty(portRange))

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
    override fun protocol(protocol: Number) {
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
    override fun ruleAction(ruleAction: String) {
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
    override fun ruleNumber(ruleNumber: Number) {
      cdkBuilder.ruleNumber(ruleNumber)
    }

    public fun build(): software.amazon.awscdk.services.ec2.CfnNetworkAclEntry = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.ec2.CfnNetworkAclEntry.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnNetworkAclEntry {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnNetworkAclEntry(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnNetworkAclEntry):
        CfnNetworkAclEntry = CfnNetworkAclEntry(cdkObject)

    internal fun unwrap(wrapped: CfnNetworkAclEntry):
        software.amazon.awscdk.services.ec2.CfnNetworkAclEntry = wrapped.cdkObject
  }

  /**
   * Describes the ICMP type and code.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ec2.*;
   * IcmpProperty icmpProperty = IcmpProperty.builder()
   * .code(123)
   * .type(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkaclentry-icmp.html)
   */
  public interface IcmpProperty {
    /**
     * The Internet Control Message Protocol (ICMP) code.
     *
     * You can use -1 to specify all ICMP codes for the given ICMP type. Required if you specify 1
     * (ICMP) for the protocol parameter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkaclentry-icmp.html#cfn-ec2-networkaclentry-icmp-code)
     */
    public fun code(): Number? = unwrap(this).getCode()

    /**
     * The Internet Control Message Protocol (ICMP) type.
     *
     * You can use -1 to specify all ICMP types. Conditional requirement: Required if you specify 1
     * (ICMP) for the `CreateNetworkAclEntry` protocol parameter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkaclentry-icmp.html#cfn-ec2-networkaclentry-icmp-type)
     */
    public fun type(): Number? = unwrap(this).getType()

    /**
     * A builder for [IcmpProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param code The Internet Control Message Protocol (ICMP) code.
       * You can use -1 to specify all ICMP codes for the given ICMP type. Required if you specify 1
       * (ICMP) for the protocol parameter.
       */
      public fun code(code: Number)

      /**
       * @param type The Internet Control Message Protocol (ICMP) type.
       * You can use -1 to specify all ICMP types. Conditional requirement: Required if you specify
       * 1 (ICMP) for the `CreateNetworkAclEntry` protocol parameter.
       */
      public fun type(type: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnNetworkAclEntry.IcmpProperty.Builder =
          software.amazon.awscdk.services.ec2.CfnNetworkAclEntry.IcmpProperty.builder()

      /**
       * @param code The Internet Control Message Protocol (ICMP) code.
       * You can use -1 to specify all ICMP codes for the given ICMP type. Required if you specify 1
       * (ICMP) for the protocol parameter.
       */
      override fun code(code: Number) {
        cdkBuilder.code(code)
      }

      /**
       * @param type The Internet Control Message Protocol (ICMP) type.
       * You can use -1 to specify all ICMP types. Conditional requirement: Required if you specify
       * 1 (ICMP) for the `CreateNetworkAclEntry` protocol parameter.
       */
      override fun type(type: Number) {
        cdkBuilder.type(type)
      }

      public fun build(): software.amazon.awscdk.services.ec2.CfnNetworkAclEntry.IcmpProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.ec2.CfnNetworkAclEntry.IcmpProperty,
    ) : CdkObject(cdkObject), IcmpProperty {
      /**
       * The Internet Control Message Protocol (ICMP) code.
       *
       * You can use -1 to specify all ICMP codes for the given ICMP type. Required if you specify 1
       * (ICMP) for the protocol parameter.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkaclentry-icmp.html#cfn-ec2-networkaclentry-icmp-code)
       */
      override fun code(): Number? = unwrap(this).getCode()

      /**
       * The Internet Control Message Protocol (ICMP) type.
       *
       * You can use -1 to specify all ICMP types. Conditional requirement: Required if you specify
       * 1 (ICMP) for the `CreateNetworkAclEntry` protocol parameter.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkaclentry-icmp.html#cfn-ec2-networkaclentry-icmp-type)
       */
      override fun type(): Number? = unwrap(this).getType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): IcmpProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnNetworkAclEntry.IcmpProperty):
          IcmpProperty = CdkObjectWrappers.wrap(cdkObject) as? IcmpProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: IcmpProperty):
          software.amazon.awscdk.services.ec2.CfnNetworkAclEntry.IcmpProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.ec2.CfnNetworkAclEntry.IcmpProperty
    }
  }

  /**
   * Describes a range of ports.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ec2.*;
   * PortRangeProperty portRangeProperty = PortRangeProperty.builder()
   * .from(123)
   * .to(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkaclentry-portrange.html)
   */
  public interface PortRangeProperty {
    /**
     * The first port in the range.
     *
     * Required if you specify 6 (TCP) or 17 (UDP) for the protocol parameter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkaclentry-portrange.html#cfn-ec2-networkaclentry-portrange-from)
     */
    public fun from(): Number? = unwrap(this).getFrom()

    /**
     * The last port in the range.
     *
     * Required if you specify 6 (TCP) or 17 (UDP) for the protocol parameter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkaclentry-portrange.html#cfn-ec2-networkaclentry-portrange-to)
     */
    public fun to(): Number? = unwrap(this).getTo()

    /**
     * A builder for [PortRangeProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param from The first port in the range.
       * Required if you specify 6 (TCP) or 17 (UDP) for the protocol parameter.
       */
      public fun from(from: Number)

      /**
       * @param to The last port in the range.
       * Required if you specify 6 (TCP) or 17 (UDP) for the protocol parameter.
       */
      public fun to(to: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnNetworkAclEntry.PortRangeProperty.Builder =
          software.amazon.awscdk.services.ec2.CfnNetworkAclEntry.PortRangeProperty.builder()

      /**
       * @param from The first port in the range.
       * Required if you specify 6 (TCP) or 17 (UDP) for the protocol parameter.
       */
      override fun from(from: Number) {
        cdkBuilder.from(from)
      }

      /**
       * @param to The last port in the range.
       * Required if you specify 6 (TCP) or 17 (UDP) for the protocol parameter.
       */
      override fun to(to: Number) {
        cdkBuilder.to(to)
      }

      public fun build(): software.amazon.awscdk.services.ec2.CfnNetworkAclEntry.PortRangeProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ec2.CfnNetworkAclEntry.PortRangeProperty,
    ) : CdkObject(cdkObject), PortRangeProperty {
      /**
       * The first port in the range.
       *
       * Required if you specify 6 (TCP) or 17 (UDP) for the protocol parameter.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkaclentry-portrange.html#cfn-ec2-networkaclentry-portrange-from)
       */
      override fun from(): Number? = unwrap(this).getFrom()

      /**
       * The last port in the range.
       *
       * Required if you specify 6 (TCP) or 17 (UDP) for the protocol parameter.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkaclentry-portrange.html#cfn-ec2-networkaclentry-portrange-to)
       */
      override fun to(): Number? = unwrap(this).getTo()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): PortRangeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnNetworkAclEntry.PortRangeProperty):
          PortRangeProperty = CdkObjectWrappers.wrap(cdkObject) as? PortRangeProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: PortRangeProperty):
          software.amazon.awscdk.services.ec2.CfnNetworkAclEntry.PortRangeProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.ec2.CfnNetworkAclEntry.PortRangeProperty
    }
  }
}
