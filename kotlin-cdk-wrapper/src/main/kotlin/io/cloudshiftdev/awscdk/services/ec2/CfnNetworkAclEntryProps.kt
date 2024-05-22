@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnNetworkAclEntry`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ec2.*;
 * CfnNetworkAclEntryProps cfnNetworkAclEntryProps = CfnNetworkAclEntryProps.builder()
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
public interface CfnNetworkAclEntryProps {
  /**
   * The IPv4 CIDR range to allow or deny, in CIDR notation (for example, 172.16.0.0/24). You must
   * specify an IPv4 CIDR block or an IPv6 CIDR block.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkaclentry.html#cfn-ec2-networkaclentry-cidrblock)
   */
  public fun cidrBlock(): String? = unwrap(this).getCidrBlock()

  /**
   * Whether this rule applies to egress traffic from the subnet ( `true` ) or ingress traffic to
   * the subnet ( `false` ).
   *
   * By default, AWS CloudFormation specifies `false` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkaclentry.html#cfn-ec2-networkaclentry-egress)
   */
  public fun egress(): Any? = unwrap(this).getEgress()

  /**
   * The Internet Control Message Protocol (ICMP) code and type.
   *
   * Required if specifying 1 (ICMP) for the protocol parameter.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkaclentry.html#cfn-ec2-networkaclentry-icmp)
   */
  public fun icmp(): Any? = unwrap(this).getIcmp()

  /**
   * The IPv6 network range to allow or deny, in CIDR notation.
   *
   * You must specify an IPv4 CIDR block or an IPv6 CIDR block.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkaclentry.html#cfn-ec2-networkaclentry-ipv6cidrblock)
   */
  public fun ipv6CidrBlock(): String? = unwrap(this).getIpv6CidrBlock()

  /**
   * The ID of the ACL for the entry.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkaclentry.html#cfn-ec2-networkaclentry-networkaclid)
   */
  public fun networkAclId(): String

  /**
   * The range of port numbers for the UDP/TCP protocol.
   *
   * Required if specifying 6 (TCP) or 17 (UDP) for the protocol parameter.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkaclentry.html#cfn-ec2-networkaclentry-portrange)
   */
  public fun portRange(): Any? = unwrap(this).getPortRange()

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
   */
  public fun protocol(): Number

  /**
   * Whether to allow or deny traffic that matches the rule;
   *
   * valid values are "allow" or "deny".
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkaclentry.html#cfn-ec2-networkaclentry-ruleaction)
   */
  public fun ruleAction(): String

  /**
   * Rule number to assign to the entry, such as 100.
   *
   * ACL entries are processed in ascending order by rule number. Entries can't use the same rule
   * number unless one is an egress rule and the other is an ingress rule.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkaclentry.html#cfn-ec2-networkaclentry-rulenumber)
   */
  public fun ruleNumber(): Number

  /**
   * A builder for [CfnNetworkAclEntryProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param cidrBlock The IPv4 CIDR range to allow or deny, in CIDR notation (for example,
     * 172.16.0.0/24). You must specify an IPv4 CIDR block or an IPv6 CIDR block.
     */
    public fun cidrBlock(cidrBlock: String)

    /**
     * @param egress Whether this rule applies to egress traffic from the subnet ( `true` ) or
     * ingress traffic to the subnet ( `false` ).
     * By default, AWS CloudFormation specifies `false` .
     */
    public fun egress(egress: Boolean)

    /**
     * @param egress Whether this rule applies to egress traffic from the subnet ( `true` ) or
     * ingress traffic to the subnet ( `false` ).
     * By default, AWS CloudFormation specifies `false` .
     */
    public fun egress(egress: IResolvable)

    /**
     * @param icmp The Internet Control Message Protocol (ICMP) code and type.
     * Required if specifying 1 (ICMP) for the protocol parameter.
     */
    public fun icmp(icmp: IResolvable)

    /**
     * @param icmp The Internet Control Message Protocol (ICMP) code and type.
     * Required if specifying 1 (ICMP) for the protocol parameter.
     */
    public fun icmp(icmp: CfnNetworkAclEntry.IcmpProperty)

    /**
     * @param icmp The Internet Control Message Protocol (ICMP) code and type.
     * Required if specifying 1 (ICMP) for the protocol parameter.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f90422b14ad24221132d703be1901a1671707386fcfea3845041937a6a0c4660")
    public fun icmp(icmp: CfnNetworkAclEntry.IcmpProperty.Builder.() -> Unit)

    /**
     * @param ipv6CidrBlock The IPv6 network range to allow or deny, in CIDR notation.
     * You must specify an IPv4 CIDR block or an IPv6 CIDR block.
     */
    public fun ipv6CidrBlock(ipv6CidrBlock: String)

    /**
     * @param networkAclId The ID of the ACL for the entry. 
     */
    public fun networkAclId(networkAclId: String)

    /**
     * @param portRange The range of port numbers for the UDP/TCP protocol.
     * Required if specifying 6 (TCP) or 17 (UDP) for the protocol parameter.
     */
    public fun portRange(portRange: IResolvable)

    /**
     * @param portRange The range of port numbers for the UDP/TCP protocol.
     * Required if specifying 6 (TCP) or 17 (UDP) for the protocol parameter.
     */
    public fun portRange(portRange: CfnNetworkAclEntry.PortRangeProperty)

    /**
     * @param portRange The range of port numbers for the UDP/TCP protocol.
     * Required if specifying 6 (TCP) or 17 (UDP) for the protocol parameter.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("cb446cbf9ab3c7b1a41a2b6885bfa5c0cf8fe38f135bc8011312e4e2ce2fec2e")
    public fun portRange(portRange: CfnNetworkAclEntry.PortRangeProperty.Builder.() -> Unit)

    /**
     * @param protocol The IP protocol that the rule applies to. 
     * You must specify -1 or a protocol number. You can specify -1 for all protocols.
     *
     *
     * If you specify -1, all ports are opened and the `PortRange` property is ignored.
     */
    public fun protocol(protocol: Number)

    /**
     * @param ruleAction Whether to allow or deny traffic that matches the rule;. 
     * valid values are "allow" or "deny".
     */
    public fun ruleAction(ruleAction: String)

    /**
     * @param ruleNumber Rule number to assign to the entry, such as 100. 
     * ACL entries are processed in ascending order by rule number. Entries can't use the same rule
     * number unless one is an egress rule and the other is an ingress rule.
     */
    public fun ruleNumber(ruleNumber: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.CfnNetworkAclEntryProps.Builder =
        software.amazon.awscdk.services.ec2.CfnNetworkAclEntryProps.builder()

    /**
     * @param cidrBlock The IPv4 CIDR range to allow or deny, in CIDR notation (for example,
     * 172.16.0.0/24). You must specify an IPv4 CIDR block or an IPv6 CIDR block.
     */
    override fun cidrBlock(cidrBlock: String) {
      cdkBuilder.cidrBlock(cidrBlock)
    }

    /**
     * @param egress Whether this rule applies to egress traffic from the subnet ( `true` ) or
     * ingress traffic to the subnet ( `false` ).
     * By default, AWS CloudFormation specifies `false` .
     */
    override fun egress(egress: Boolean) {
      cdkBuilder.egress(egress)
    }

    /**
     * @param egress Whether this rule applies to egress traffic from the subnet ( `true` ) or
     * ingress traffic to the subnet ( `false` ).
     * By default, AWS CloudFormation specifies `false` .
     */
    override fun egress(egress: IResolvable) {
      cdkBuilder.egress(egress.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param icmp The Internet Control Message Protocol (ICMP) code and type.
     * Required if specifying 1 (ICMP) for the protocol parameter.
     */
    override fun icmp(icmp: IResolvable) {
      cdkBuilder.icmp(icmp.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param icmp The Internet Control Message Protocol (ICMP) code and type.
     * Required if specifying 1 (ICMP) for the protocol parameter.
     */
    override fun icmp(icmp: CfnNetworkAclEntry.IcmpProperty) {
      cdkBuilder.icmp(icmp.let(CfnNetworkAclEntry.IcmpProperty.Companion::unwrap))
    }

    /**
     * @param icmp The Internet Control Message Protocol (ICMP) code and type.
     * Required if specifying 1 (ICMP) for the protocol parameter.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f90422b14ad24221132d703be1901a1671707386fcfea3845041937a6a0c4660")
    override fun icmp(icmp: CfnNetworkAclEntry.IcmpProperty.Builder.() -> Unit): Unit =
        icmp(CfnNetworkAclEntry.IcmpProperty(icmp))

    /**
     * @param ipv6CidrBlock The IPv6 network range to allow or deny, in CIDR notation.
     * You must specify an IPv4 CIDR block or an IPv6 CIDR block.
     */
    override fun ipv6CidrBlock(ipv6CidrBlock: String) {
      cdkBuilder.ipv6CidrBlock(ipv6CidrBlock)
    }

    /**
     * @param networkAclId The ID of the ACL for the entry. 
     */
    override fun networkAclId(networkAclId: String) {
      cdkBuilder.networkAclId(networkAclId)
    }

    /**
     * @param portRange The range of port numbers for the UDP/TCP protocol.
     * Required if specifying 6 (TCP) or 17 (UDP) for the protocol parameter.
     */
    override fun portRange(portRange: IResolvable) {
      cdkBuilder.portRange(portRange.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param portRange The range of port numbers for the UDP/TCP protocol.
     * Required if specifying 6 (TCP) or 17 (UDP) for the protocol parameter.
     */
    override fun portRange(portRange: CfnNetworkAclEntry.PortRangeProperty) {
      cdkBuilder.portRange(portRange.let(CfnNetworkAclEntry.PortRangeProperty.Companion::unwrap))
    }

    /**
     * @param portRange The range of port numbers for the UDP/TCP protocol.
     * Required if specifying 6 (TCP) or 17 (UDP) for the protocol parameter.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("cb446cbf9ab3c7b1a41a2b6885bfa5c0cf8fe38f135bc8011312e4e2ce2fec2e")
    override fun portRange(portRange: CfnNetworkAclEntry.PortRangeProperty.Builder.() -> Unit): Unit
        = portRange(CfnNetworkAclEntry.PortRangeProperty(portRange))

    /**
     * @param protocol The IP protocol that the rule applies to. 
     * You must specify -1 or a protocol number. You can specify -1 for all protocols.
     *
     *
     * If you specify -1, all ports are opened and the `PortRange` property is ignored.
     */
    override fun protocol(protocol: Number) {
      cdkBuilder.protocol(protocol)
    }

    /**
     * @param ruleAction Whether to allow or deny traffic that matches the rule;. 
     * valid values are "allow" or "deny".
     */
    override fun ruleAction(ruleAction: String) {
      cdkBuilder.ruleAction(ruleAction)
    }

    /**
     * @param ruleNumber Rule number to assign to the entry, such as 100. 
     * ACL entries are processed in ascending order by rule number. Entries can't use the same rule
     * number unless one is an egress rule and the other is an ingress rule.
     */
    override fun ruleNumber(ruleNumber: Number) {
      cdkBuilder.ruleNumber(ruleNumber)
    }

    public fun build(): software.amazon.awscdk.services.ec2.CfnNetworkAclEntryProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.ec2.CfnNetworkAclEntryProps,
  ) : CdkObject(cdkObject), CfnNetworkAclEntryProps {
    /**
     * The IPv4 CIDR range to allow or deny, in CIDR notation (for example, 172.16.0.0/24). You must
     * specify an IPv4 CIDR block or an IPv6 CIDR block.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkaclentry.html#cfn-ec2-networkaclentry-cidrblock)
     */
    override fun cidrBlock(): String? = unwrap(this).getCidrBlock()

    /**
     * Whether this rule applies to egress traffic from the subnet ( `true` ) or ingress traffic to
     * the subnet ( `false` ).
     *
     * By default, AWS CloudFormation specifies `false` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkaclentry.html#cfn-ec2-networkaclentry-egress)
     */
    override fun egress(): Any? = unwrap(this).getEgress()

    /**
     * The Internet Control Message Protocol (ICMP) code and type.
     *
     * Required if specifying 1 (ICMP) for the protocol parameter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkaclentry.html#cfn-ec2-networkaclentry-icmp)
     */
    override fun icmp(): Any? = unwrap(this).getIcmp()

    /**
     * The IPv6 network range to allow or deny, in CIDR notation.
     *
     * You must specify an IPv4 CIDR block or an IPv6 CIDR block.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkaclentry.html#cfn-ec2-networkaclentry-ipv6cidrblock)
     */
    override fun ipv6CidrBlock(): String? = unwrap(this).getIpv6CidrBlock()

    /**
     * The ID of the ACL for the entry.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkaclentry.html#cfn-ec2-networkaclentry-networkaclid)
     */
    override fun networkAclId(): String = unwrap(this).getNetworkAclId()

    /**
     * The range of port numbers for the UDP/TCP protocol.
     *
     * Required if specifying 6 (TCP) or 17 (UDP) for the protocol parameter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkaclentry.html#cfn-ec2-networkaclentry-portrange)
     */
    override fun portRange(): Any? = unwrap(this).getPortRange()

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
     */
    override fun protocol(): Number = unwrap(this).getProtocol()

    /**
     * Whether to allow or deny traffic that matches the rule;
     *
     * valid values are "allow" or "deny".
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkaclentry.html#cfn-ec2-networkaclentry-ruleaction)
     */
    override fun ruleAction(): String = unwrap(this).getRuleAction()

    /**
     * Rule number to assign to the entry, such as 100.
     *
     * ACL entries are processed in ascending order by rule number. Entries can't use the same rule
     * number unless one is an egress rule and the other is an ingress rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkaclentry.html#cfn-ec2-networkaclentry-rulenumber)
     */
    override fun ruleNumber(): Number = unwrap(this).getRuleNumber()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnNetworkAclEntryProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnNetworkAclEntryProps):
        CfnNetworkAclEntryProps = CdkObjectWrappers.wrap(cdkObject) as? CfnNetworkAclEntryProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnNetworkAclEntryProps):
        software.amazon.awscdk.services.ec2.CfnNetworkAclEntryProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ec2.CfnNetworkAclEntryProps
  }
}
