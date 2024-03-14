package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnNetworkInterface internal constructor(
  private val cdkObject: software.amazon.awscdk.services.ec2.CfnNetworkInterface,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun attrPrimaryIpv6Address(): String = unwrap(this).getAttrPrimaryIpv6Address()

  public open fun attrPrimaryPrivateIpAddress(): String =
      unwrap(this).getAttrPrimaryPrivateIpAddress()

  public open fun attrSecondaryPrivateIpAddresses(): List<String> =
      unwrap(this).getAttrSecondaryPrivateIpAddresses()

  public open fun connectionTrackingSpecification(): Any? =
      unwrap(this).getConnectionTrackingSpecification()

  public open fun connectionTrackingSpecification(`value`: IResolvable) {
    unwrap(this).setConnectionTrackingSpecification(`value`.let(IResolvable::unwrap))
  }

  public open
      fun connectionTrackingSpecification(`value`: ConnectionTrackingSpecificationProperty) {
    unwrap(this).setConnectionTrackingSpecification(`value`.let(ConnectionTrackingSpecificationProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("05408793f28e84f297503da20187c34ab73c3020eaffc70d7f77bb6335a5861f")
  public open
      fun connectionTrackingSpecification(`value`: ConnectionTrackingSpecificationProperty.Builder.() -> Unit):
      Unit = connectionTrackingSpecification(ConnectionTrackingSpecificationProperty(`value`))

  public open fun description(): String? = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public open fun enablePrimaryIpv6(): Any? = unwrap(this).getEnablePrimaryIpv6()

  public open fun enablePrimaryIpv6(`value`: Boolean) {
    unwrap(this).setEnablePrimaryIpv6(`value`)
  }

  public open fun enablePrimaryIpv6(`value`: IResolvable) {
    unwrap(this).setEnablePrimaryIpv6(`value`.let(IResolvable::unwrap))
  }

  public open fun groupSet(): List<String> = unwrap(this).getGroupSet() ?: emptyList()

  public open fun groupSet(`value`: List<String>) {
    unwrap(this).setGroupSet(`value`)
  }

  public open fun groupSet(vararg `value`: String): Unit = groupSet(`value`.toList())

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun interfaceType(): String? = unwrap(this).getInterfaceType()

  public open fun interfaceType(`value`: String) {
    unwrap(this).setInterfaceType(`value`)
  }

  public open fun ipv4PrefixCount(): Number? = unwrap(this).getIpv4PrefixCount()

  public open fun ipv4PrefixCount(`value`: Number) {
    unwrap(this).setIpv4PrefixCount(`value`)
  }

  public open fun ipv4Prefixes(): Any? = unwrap(this).getIpv4Prefixes()

  public open fun ipv4Prefixes(`value`: IResolvable) {
    unwrap(this).setIpv4Prefixes(`value`.let(IResolvable::unwrap))
  }

  public open fun ipv4Prefixes(__idx_ac66f0: List<Any>) {
    unwrap(this).setIpv4Prefixes(__idx_ac66f0)
  }

  public open fun ipv4Prefixes(vararg __idx_ac66f0: Any): Unit = ipv4Prefixes(__idx_ac66f0.toList())

  public open fun ipv6AddressCount(): Number? = unwrap(this).getIpv6AddressCount()

  public open fun ipv6AddressCount(`value`: Number) {
    unwrap(this).setIpv6AddressCount(`value`)
  }

  public open fun ipv6Addresses(): Any? = unwrap(this).getIpv6Addresses()

  public open fun ipv6Addresses(`value`: IResolvable) {
    unwrap(this).setIpv6Addresses(`value`.let(IResolvable::unwrap))
  }

  public open fun ipv6Addresses(__idx_ac66f0: List<Any>) {
    unwrap(this).setIpv6Addresses(__idx_ac66f0)
  }

  public open fun ipv6Addresses(vararg __idx_ac66f0: Any): Unit =
      ipv6Addresses(__idx_ac66f0.toList())

  public open fun ipv6PrefixCount(): Number? = unwrap(this).getIpv6PrefixCount()

  public open fun ipv6PrefixCount(`value`: Number) {
    unwrap(this).setIpv6PrefixCount(`value`)
  }

  public open fun ipv6Prefixes(): Any? = unwrap(this).getIpv6Prefixes()

  public open fun ipv6Prefixes(`value`: IResolvable) {
    unwrap(this).setIpv6Prefixes(`value`.let(IResolvable::unwrap))
  }

  public open fun ipv6Prefixes(__idx_ac66f0: List<Any>) {
    unwrap(this).setIpv6Prefixes(__idx_ac66f0)
  }

  public open fun ipv6Prefixes(vararg __idx_ac66f0: Any): Unit = ipv6Prefixes(__idx_ac66f0.toList())

  public open fun privateIpAddress(): String? = unwrap(this).getPrivateIpAddress()

  public open fun privateIpAddress(`value`: String) {
    unwrap(this).setPrivateIpAddress(`value`)
  }

  public open fun privateIpAddresses(): Any? = unwrap(this).getPrivateIpAddresses()

  public open fun privateIpAddresses(`value`: IResolvable) {
    unwrap(this).setPrivateIpAddresses(`value`.let(IResolvable::unwrap))
  }

  public open fun privateIpAddresses(__idx_ac66f0: List<Any>) {
    unwrap(this).setPrivateIpAddresses(__idx_ac66f0)
  }

  public open fun privateIpAddresses(vararg __idx_ac66f0: Any): Unit =
      privateIpAddresses(__idx_ac66f0.toList())

  public open fun secondaryPrivateIpAddressCount(): Number? =
      unwrap(this).getSecondaryPrivateIpAddressCount()

  public open fun secondaryPrivateIpAddressCount(`value`: Number) {
    unwrap(this).setSecondaryPrivateIpAddressCount(`value`)
  }

  public open fun sourceDestCheck(): Any? = unwrap(this).getSourceDestCheck()

  public open fun sourceDestCheck(`value`: Boolean) {
    unwrap(this).setSourceDestCheck(`value`)
  }

  public open fun sourceDestCheck(`value`: IResolvable) {
    unwrap(this).setSourceDestCheck(`value`.let(IResolvable::unwrap))
  }

  public open fun subnetId(): String = unwrap(this).getSubnetId()

  public open fun subnetId(`value`: String) {
    unwrap(this).setSubnetId(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  public interface Builder {
    public fun connectionTrackingSpecification(connectionTrackingSpecification: IResolvable)

    public
        fun connectionTrackingSpecification(connectionTrackingSpecification: ConnectionTrackingSpecificationProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("05fe79de5ad612a2c211835d2841f358c21d750bc4f66d3040711844d1fd1e55")
    public
        fun connectionTrackingSpecification(connectionTrackingSpecification: ConnectionTrackingSpecificationProperty.Builder.() -> Unit)

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

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.CfnNetworkInterface.Builder =
        software.amazon.awscdk.services.ec2.CfnNetworkInterface.Builder.create(scope, id)

    override fun connectionTrackingSpecification(connectionTrackingSpecification: IResolvable) {
      cdkBuilder.connectionTrackingSpecification(connectionTrackingSpecification.let(IResolvable::unwrap))
    }

    override
        fun connectionTrackingSpecification(connectionTrackingSpecification: ConnectionTrackingSpecificationProperty) {
      cdkBuilder.connectionTrackingSpecification(connectionTrackingSpecification.let(ConnectionTrackingSpecificationProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("05fe79de5ad612a2c211835d2841f358c21d750bc4f66d3040711844d1fd1e55")
    override
        fun connectionTrackingSpecification(connectionTrackingSpecification: ConnectionTrackingSpecificationProperty.Builder.() -> Unit):
        Unit =
        connectionTrackingSpecification(ConnectionTrackingSpecificationProperty(connectionTrackingSpecification))

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

    public fun build(): software.amazon.awscdk.services.ec2.CfnNetworkInterface = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnNetworkInterface {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnNetworkInterface(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnNetworkInterface):
        CfnNetworkInterface = CfnNetworkInterface(cdkObject)

    internal fun unwrap(wrapped: CfnNetworkInterface):
        software.amazon.awscdk.services.ec2.CfnNetworkInterface = wrapped.cdkObject
  }

  public interface PrivateIpAddressSpecificationProperty {
    public fun primary(): Any

    public fun privateIpAddress(): String

    public interface Builder {
      public fun primary(primary: Boolean)

      public fun primary(primary: IResolvable)

      public fun privateIpAddress(privateIpAddress: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnNetworkInterface.PrivateIpAddressSpecificationProperty.Builder
          =
          software.amazon.awscdk.services.ec2.CfnNetworkInterface.PrivateIpAddressSpecificationProperty.builder()

      override fun primary(primary: Boolean) {
        cdkBuilder.primary(primary)
      }

      override fun primary(primary: IResolvable) {
        cdkBuilder.primary(primary.let(IResolvable::unwrap))
      }

      override fun privateIpAddress(privateIpAddress: String) {
        cdkBuilder.privateIpAddress(privateIpAddress)
      }

      public fun build():
          software.amazon.awscdk.services.ec2.CfnNetworkInterface.PrivateIpAddressSpecificationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ec2.CfnNetworkInterface.PrivateIpAddressSpecificationProperty,
    ) : PrivateIpAddressSpecificationProperty {
      override fun primary(): Any = unwrap(this).getPrimary()

      override fun privateIpAddress(): String = unwrap(this).getPrivateIpAddress()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          PrivateIpAddressSpecificationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnNetworkInterface.PrivateIpAddressSpecificationProperty):
          PrivateIpAddressSpecificationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PrivateIpAddressSpecificationProperty):
          software.amazon.awscdk.services.ec2.CfnNetworkInterface.PrivateIpAddressSpecificationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface Ipv6PrefixSpecificationProperty {
    public fun ipv6Prefix(): String

    public interface Builder {
      public fun ipv6Prefix(ipv6Prefix: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnNetworkInterface.Ipv6PrefixSpecificationProperty.Builder
          =
          software.amazon.awscdk.services.ec2.CfnNetworkInterface.Ipv6PrefixSpecificationProperty.builder()

      override fun ipv6Prefix(ipv6Prefix: String) {
        cdkBuilder.ipv6Prefix(ipv6Prefix)
      }

      public fun build():
          software.amazon.awscdk.services.ec2.CfnNetworkInterface.Ipv6PrefixSpecificationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ec2.CfnNetworkInterface.Ipv6PrefixSpecificationProperty,
    ) : Ipv6PrefixSpecificationProperty {
      override fun ipv6Prefix(): String = unwrap(this).getIpv6Prefix()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): Ipv6PrefixSpecificationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnNetworkInterface.Ipv6PrefixSpecificationProperty):
          Ipv6PrefixSpecificationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: Ipv6PrefixSpecificationProperty):
          software.amazon.awscdk.services.ec2.CfnNetworkInterface.Ipv6PrefixSpecificationProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface ConnectionTrackingSpecificationProperty {
    public fun tcpEstablishedTimeout(): Number? = unwrap(this).getTcpEstablishedTimeout()

    public fun udpStreamTimeout(): Number? = unwrap(this).getUdpStreamTimeout()

    public fun udpTimeout(): Number? = unwrap(this).getUdpTimeout()

    public interface Builder {
      public fun tcpEstablishedTimeout(tcpEstablishedTimeout: Number)

      public fun udpStreamTimeout(udpStreamTimeout: Number)

      public fun udpTimeout(udpTimeout: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnNetworkInterface.ConnectionTrackingSpecificationProperty.Builder
          =
          software.amazon.awscdk.services.ec2.CfnNetworkInterface.ConnectionTrackingSpecificationProperty.builder()

      override fun tcpEstablishedTimeout(tcpEstablishedTimeout: Number) {
        cdkBuilder.tcpEstablishedTimeout(tcpEstablishedTimeout)
      }

      override fun udpStreamTimeout(udpStreamTimeout: Number) {
        cdkBuilder.udpStreamTimeout(udpStreamTimeout)
      }

      override fun udpTimeout(udpTimeout: Number) {
        cdkBuilder.udpTimeout(udpTimeout)
      }

      public fun build():
          software.amazon.awscdk.services.ec2.CfnNetworkInterface.ConnectionTrackingSpecificationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ec2.CfnNetworkInterface.ConnectionTrackingSpecificationProperty,
    ) : ConnectionTrackingSpecificationProperty {
      override fun tcpEstablishedTimeout(): Number? = unwrap(this).getTcpEstablishedTimeout()

      override fun udpStreamTimeout(): Number? = unwrap(this).getUdpStreamTimeout()

      override fun udpTimeout(): Number? = unwrap(this).getUdpTimeout()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          ConnectionTrackingSpecificationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnNetworkInterface.ConnectionTrackingSpecificationProperty):
          ConnectionTrackingSpecificationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ConnectionTrackingSpecificationProperty):
          software.amazon.awscdk.services.ec2.CfnNetworkInterface.ConnectionTrackingSpecificationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface InstanceIpv6AddressProperty {
    public fun ipv6Address(): String

    public interface Builder {
      public fun ipv6Address(ipv6Address: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnNetworkInterface.InstanceIpv6AddressProperty.Builder
          =
          software.amazon.awscdk.services.ec2.CfnNetworkInterface.InstanceIpv6AddressProperty.builder()

      override fun ipv6Address(ipv6Address: String) {
        cdkBuilder.ipv6Address(ipv6Address)
      }

      public fun build():
          software.amazon.awscdk.services.ec2.CfnNetworkInterface.InstanceIpv6AddressProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ec2.CfnNetworkInterface.InstanceIpv6AddressProperty,
    ) : InstanceIpv6AddressProperty {
      override fun ipv6Address(): String = unwrap(this).getIpv6Address()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): InstanceIpv6AddressProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnNetworkInterface.InstanceIpv6AddressProperty):
          InstanceIpv6AddressProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: InstanceIpv6AddressProperty):
          software.amazon.awscdk.services.ec2.CfnNetworkInterface.InstanceIpv6AddressProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface Ipv4PrefixSpecificationProperty {
    public fun ipv4Prefix(): String

    public interface Builder {
      public fun ipv4Prefix(ipv4Prefix: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnNetworkInterface.Ipv4PrefixSpecificationProperty.Builder
          =
          software.amazon.awscdk.services.ec2.CfnNetworkInterface.Ipv4PrefixSpecificationProperty.builder()

      override fun ipv4Prefix(ipv4Prefix: String) {
        cdkBuilder.ipv4Prefix(ipv4Prefix)
      }

      public fun build():
          software.amazon.awscdk.services.ec2.CfnNetworkInterface.Ipv4PrefixSpecificationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ec2.CfnNetworkInterface.Ipv4PrefixSpecificationProperty,
    ) : Ipv4PrefixSpecificationProperty {
      override fun ipv4Prefix(): String = unwrap(this).getIpv4Prefix()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): Ipv4PrefixSpecificationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnNetworkInterface.Ipv4PrefixSpecificationProperty):
          Ipv4PrefixSpecificationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: Ipv4PrefixSpecificationProperty):
          software.amazon.awscdk.services.ec2.CfnNetworkInterface.Ipv4PrefixSpecificationProperty =
          (wrapped as Wrapper).cdkObject
    }
  }
}
