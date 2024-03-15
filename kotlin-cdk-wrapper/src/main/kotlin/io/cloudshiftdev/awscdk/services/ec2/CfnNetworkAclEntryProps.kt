@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

public interface CfnNetworkAclEntryProps {
  public fun cidrBlock(): String? = unwrap(this).getCidrBlock()

  public fun egress(): Any? = unwrap(this).getEgress()

  public fun icmp(): Any? = unwrap(this).getIcmp()

  public fun ipv6CidrBlock(): String? = unwrap(this).getIpv6CidrBlock()

  public fun networkAclId(): String

  public fun portRange(): Any? = unwrap(this).getPortRange()

  public fun protocol(): Number

  public fun ruleAction(): String

  public fun ruleNumber(): Number

  @CdkDslMarker
  public interface Builder {
    public fun cidrBlock(cidrBlock: String)

    public fun egress(egress: Boolean)

    public fun egress(egress: IResolvable)

    public fun icmp(icmp: IResolvable)

    public fun icmp(icmp: CfnNetworkAclEntry.IcmpProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f90422b14ad24221132d703be1901a1671707386fcfea3845041937a6a0c4660")
    public fun icmp(icmp: CfnNetworkAclEntry.IcmpProperty.Builder.() -> Unit)

    public fun ipv6CidrBlock(ipv6CidrBlock: String)

    public fun networkAclId(networkAclId: String)

    public fun portRange(portRange: IResolvable)

    public fun portRange(portRange: CfnNetworkAclEntry.PortRangeProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("cb446cbf9ab3c7b1a41a2b6885bfa5c0cf8fe38f135bc8011312e4e2ce2fec2e")
    public fun portRange(portRange: CfnNetworkAclEntry.PortRangeProperty.Builder.() -> Unit)

    public fun protocol(protocol: Number)

    public fun ruleAction(ruleAction: String)

    public fun ruleNumber(ruleNumber: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.CfnNetworkAclEntryProps.Builder =
        software.amazon.awscdk.services.ec2.CfnNetworkAclEntryProps.builder()

    override fun cidrBlock(cidrBlock: String) {
      cdkBuilder.cidrBlock(cidrBlock)
    }

    override fun egress(egress: Boolean) {
      cdkBuilder.egress(egress)
    }

    override fun egress(egress: IResolvable) {
      cdkBuilder.egress(egress.let(IResolvable::unwrap))
    }

    override fun icmp(icmp: IResolvable) {
      cdkBuilder.icmp(icmp.let(IResolvable::unwrap))
    }

    override fun icmp(icmp: CfnNetworkAclEntry.IcmpProperty) {
      cdkBuilder.icmp(icmp.let(CfnNetworkAclEntry.IcmpProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f90422b14ad24221132d703be1901a1671707386fcfea3845041937a6a0c4660")
    override fun icmp(icmp: CfnNetworkAclEntry.IcmpProperty.Builder.() -> Unit): Unit =
        icmp(CfnNetworkAclEntry.IcmpProperty(icmp))

    override fun ipv6CidrBlock(ipv6CidrBlock: String) {
      cdkBuilder.ipv6CidrBlock(ipv6CidrBlock)
    }

    override fun networkAclId(networkAclId: String) {
      cdkBuilder.networkAclId(networkAclId)
    }

    override fun portRange(portRange: IResolvable) {
      cdkBuilder.portRange(portRange.let(IResolvable::unwrap))
    }

    override fun portRange(portRange: CfnNetworkAclEntry.PortRangeProperty) {
      cdkBuilder.portRange(portRange.let(CfnNetworkAclEntry.PortRangeProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("cb446cbf9ab3c7b1a41a2b6885bfa5c0cf8fe38f135bc8011312e4e2ce2fec2e")
    override fun portRange(portRange: CfnNetworkAclEntry.PortRangeProperty.Builder.() -> Unit): Unit
        = portRange(CfnNetworkAclEntry.PortRangeProperty(portRange))

    override fun protocol(protocol: Number) {
      cdkBuilder.protocol(protocol)
    }

    override fun ruleAction(ruleAction: String) {
      cdkBuilder.ruleAction(ruleAction)
    }

    override fun ruleNumber(ruleNumber: Number) {
      cdkBuilder.ruleNumber(ruleNumber)
    }

    public fun build(): software.amazon.awscdk.services.ec2.CfnNetworkAclEntryProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.CfnNetworkAclEntryProps,
  ) : CdkObject(cdkObject), CfnNetworkAclEntryProps {
    override fun cidrBlock(): String? = unwrap(this).getCidrBlock()

    override fun egress(): Any? = unwrap(this).getEgress()

    override fun icmp(): Any? = unwrap(this).getIcmp()

    override fun ipv6CidrBlock(): String? = unwrap(this).getIpv6CidrBlock()

    override fun networkAclId(): String = unwrap(this).getNetworkAclId()

    override fun portRange(): Any? = unwrap(this).getPortRange()

    override fun protocol(): Number = unwrap(this).getProtocol()

    override fun ruleAction(): String = unwrap(this).getRuleAction()

    override fun ruleNumber(): Number = unwrap(this).getRuleNumber()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnNetworkAclEntryProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnNetworkAclEntryProps):
        CfnNetworkAclEntryProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnNetworkAclEntryProps):
        software.amazon.awscdk.services.ec2.CfnNetworkAclEntryProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ec2.CfnNetworkAclEntryProps
  }
}
