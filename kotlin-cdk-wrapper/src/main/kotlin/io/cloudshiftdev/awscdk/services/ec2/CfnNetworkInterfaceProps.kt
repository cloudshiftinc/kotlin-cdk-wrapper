@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnNetworkInterfaceProps {
  public fun connectionTrackingSpecification(): Any? =
      unwrap(this).getConnectionTrackingSpecification()

  public fun description(): String? = unwrap(this).getDescription()

  public fun enablePrimaryIpv6(): Any? = unwrap(this).getEnablePrimaryIpv6()

  public fun groupSet(): List<String> = unwrap(this).getGroupSet() ?: emptyList()

  public fun interfaceType(): String? = unwrap(this).getInterfaceType()

  public fun ipv4PrefixCount(): Number? = unwrap(this).getIpv4PrefixCount()

  public fun ipv4Prefixes(): Any? = unwrap(this).getIpv4Prefixes()

  public fun ipv6AddressCount(): Number? = unwrap(this).getIpv6AddressCount()

  public fun ipv6Addresses(): Any? = unwrap(this).getIpv6Addresses()

  public fun ipv6PrefixCount(): Number? = unwrap(this).getIpv6PrefixCount()

  public fun ipv6Prefixes(): Any? = unwrap(this).getIpv6Prefixes()

  public fun privateIpAddress(): String? = unwrap(this).getPrivateIpAddress()

  public fun privateIpAddresses(): Any? = unwrap(this).getPrivateIpAddresses()

  public fun secondaryPrivateIpAddressCount(): Number? =
      unwrap(this).getSecondaryPrivateIpAddressCount()

  public fun sourceDestCheck(): Any? = unwrap(this).getSourceDestCheck()

  public fun subnetId(): String

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun connectionTrackingSpecification(connectionTrackingSpecification: IResolvable)

    public
        fun connectionTrackingSpecification(connectionTrackingSpecification: CfnNetworkInterface.ConnectionTrackingSpecificationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("36fb57d847e2dae6ead5d757d2550831ce75b17b67f42b715e6bf87eebe9f28c")
    public
        fun connectionTrackingSpecification(connectionTrackingSpecification: CfnNetworkInterface.ConnectionTrackingSpecificationProperty.Builder.() -> Unit)

    public fun description(description: String)

    public fun enablePrimaryIpv6(enablePrimaryIpv6: Boolean)

    public fun enablePrimaryIpv6(enablePrimaryIpv6: IResolvable)

    public fun groupSet(groupSet: List<String>)

    public fun groupSet(vararg groupSet: String)

    public fun interfaceType(interfaceType: String)

    public fun ipv4PrefixCount(ipv4PrefixCount: Number)

    public fun ipv4Prefixes(ipv4Prefixes: IResolvable)

    public fun ipv4Prefixes(ipv4Prefixes: List<Any>)

    public fun ipv4Prefixes(vararg ipv4Prefixes: Any)

    public fun ipv6AddressCount(ipv6AddressCount: Number)

    public fun ipv6Addresses(ipv6Addresses: IResolvable)

    public fun ipv6Addresses(ipv6Addresses: List<Any>)

    public fun ipv6Addresses(vararg ipv6Addresses: Any)

    public fun ipv6PrefixCount(ipv6PrefixCount: Number)

    public fun ipv6Prefixes(ipv6Prefixes: IResolvable)

    public fun ipv6Prefixes(ipv6Prefixes: List<Any>)

    public fun ipv6Prefixes(vararg ipv6Prefixes: Any)

    public fun privateIpAddress(privateIpAddress: String)

    public fun privateIpAddresses(privateIpAddresses: IResolvable)

    public fun privateIpAddresses(privateIpAddresses: List<Any>)

    public fun privateIpAddresses(vararg privateIpAddresses: Any)

    public fun secondaryPrivateIpAddressCount(secondaryPrivateIpAddressCount: Number)

    public fun sourceDestCheck(sourceDestCheck: Boolean)

    public fun sourceDestCheck(sourceDestCheck: IResolvable)

    public fun subnetId(subnetId: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.CfnNetworkInterfaceProps.Builder =
        software.amazon.awscdk.services.ec2.CfnNetworkInterfaceProps.builder()

    override fun connectionTrackingSpecification(connectionTrackingSpecification: IResolvable) {
      cdkBuilder.connectionTrackingSpecification(connectionTrackingSpecification.let(IResolvable::unwrap))
    }

    override
        fun connectionTrackingSpecification(connectionTrackingSpecification: CfnNetworkInterface.ConnectionTrackingSpecificationProperty) {
      cdkBuilder.connectionTrackingSpecification(connectionTrackingSpecification.let(CfnNetworkInterface.ConnectionTrackingSpecificationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("36fb57d847e2dae6ead5d757d2550831ce75b17b67f42b715e6bf87eebe9f28c")
    override
        fun connectionTrackingSpecification(connectionTrackingSpecification: CfnNetworkInterface.ConnectionTrackingSpecificationProperty.Builder.() -> Unit):
        Unit =
        connectionTrackingSpecification(CfnNetworkInterface.ConnectionTrackingSpecificationProperty(connectionTrackingSpecification))

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun enablePrimaryIpv6(enablePrimaryIpv6: Boolean) {
      cdkBuilder.enablePrimaryIpv6(enablePrimaryIpv6)
    }

    override fun enablePrimaryIpv6(enablePrimaryIpv6: IResolvable) {
      cdkBuilder.enablePrimaryIpv6(enablePrimaryIpv6.let(IResolvable::unwrap))
    }

    override fun groupSet(groupSet: List<String>) {
      cdkBuilder.groupSet(groupSet)
    }

    override fun groupSet(vararg groupSet: String): Unit = groupSet(groupSet.toList())

    override fun interfaceType(interfaceType: String) {
      cdkBuilder.interfaceType(interfaceType)
    }

    override fun ipv4PrefixCount(ipv4PrefixCount: Number) {
      cdkBuilder.ipv4PrefixCount(ipv4PrefixCount)
    }

    override fun ipv4Prefixes(ipv4Prefixes: IResolvable) {
      cdkBuilder.ipv4Prefixes(ipv4Prefixes.let(IResolvable::unwrap))
    }

    override fun ipv4Prefixes(ipv4Prefixes: List<Any>) {
      cdkBuilder.ipv4Prefixes(ipv4Prefixes)
    }

    override fun ipv4Prefixes(vararg ipv4Prefixes: Any): Unit = ipv4Prefixes(ipv4Prefixes.toList())

    override fun ipv6AddressCount(ipv6AddressCount: Number) {
      cdkBuilder.ipv6AddressCount(ipv6AddressCount)
    }

    override fun ipv6Addresses(ipv6Addresses: IResolvable) {
      cdkBuilder.ipv6Addresses(ipv6Addresses.let(IResolvable::unwrap))
    }

    override fun ipv6Addresses(ipv6Addresses: List<Any>) {
      cdkBuilder.ipv6Addresses(ipv6Addresses)
    }

    override fun ipv6Addresses(vararg ipv6Addresses: Any): Unit =
        ipv6Addresses(ipv6Addresses.toList())

    override fun ipv6PrefixCount(ipv6PrefixCount: Number) {
      cdkBuilder.ipv6PrefixCount(ipv6PrefixCount)
    }

    override fun ipv6Prefixes(ipv6Prefixes: IResolvable) {
      cdkBuilder.ipv6Prefixes(ipv6Prefixes.let(IResolvable::unwrap))
    }

    override fun ipv6Prefixes(ipv6Prefixes: List<Any>) {
      cdkBuilder.ipv6Prefixes(ipv6Prefixes)
    }

    override fun ipv6Prefixes(vararg ipv6Prefixes: Any): Unit = ipv6Prefixes(ipv6Prefixes.toList())

    override fun privateIpAddress(privateIpAddress: String) {
      cdkBuilder.privateIpAddress(privateIpAddress)
    }

    override fun privateIpAddresses(privateIpAddresses: IResolvable) {
      cdkBuilder.privateIpAddresses(privateIpAddresses.let(IResolvable::unwrap))
    }

    override fun privateIpAddresses(privateIpAddresses: List<Any>) {
      cdkBuilder.privateIpAddresses(privateIpAddresses)
    }

    override fun privateIpAddresses(vararg privateIpAddresses: Any): Unit =
        privateIpAddresses(privateIpAddresses.toList())

    override fun secondaryPrivateIpAddressCount(secondaryPrivateIpAddressCount: Number) {
      cdkBuilder.secondaryPrivateIpAddressCount(secondaryPrivateIpAddressCount)
    }

    override fun sourceDestCheck(sourceDestCheck: Boolean) {
      cdkBuilder.sourceDestCheck(sourceDestCheck)
    }

    override fun sourceDestCheck(sourceDestCheck: IResolvable) {
      cdkBuilder.sourceDestCheck(sourceDestCheck.let(IResolvable::unwrap))
    }

    override fun subnetId(subnetId: String) {
      cdkBuilder.subnetId(subnetId)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.ec2.CfnNetworkInterfaceProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.CfnNetworkInterfaceProps,
  ) : CdkObject(cdkObject), CfnNetworkInterfaceProps {
    override fun connectionTrackingSpecification(): Any? =
        unwrap(this).getConnectionTrackingSpecification()

    override fun description(): String? = unwrap(this).getDescription()

    override fun enablePrimaryIpv6(): Any? = unwrap(this).getEnablePrimaryIpv6()

    override fun groupSet(): List<String> = unwrap(this).getGroupSet() ?: emptyList()

    override fun interfaceType(): String? = unwrap(this).getInterfaceType()

    override fun ipv4PrefixCount(): Number? = unwrap(this).getIpv4PrefixCount()

    override fun ipv4Prefixes(): Any? = unwrap(this).getIpv4Prefixes()

    override fun ipv6AddressCount(): Number? = unwrap(this).getIpv6AddressCount()

    override fun ipv6Addresses(): Any? = unwrap(this).getIpv6Addresses()

    override fun ipv6PrefixCount(): Number? = unwrap(this).getIpv6PrefixCount()

    override fun ipv6Prefixes(): Any? = unwrap(this).getIpv6Prefixes()

    override fun privateIpAddress(): String? = unwrap(this).getPrivateIpAddress()

    override fun privateIpAddresses(): Any? = unwrap(this).getPrivateIpAddresses()

    override fun secondaryPrivateIpAddressCount(): Number? =
        unwrap(this).getSecondaryPrivateIpAddressCount()

    override fun sourceDestCheck(): Any? = unwrap(this).getSourceDestCheck()

    override fun subnetId(): String = unwrap(this).getSubnetId()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnNetworkInterfaceProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnNetworkInterfaceProps):
        CfnNetworkInterfaceProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnNetworkInterfaceProps):
        software.amazon.awscdk.services.ec2.CfnNetworkInterfaceProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ec2.CfnNetworkInterfaceProps
  }
}
