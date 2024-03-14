package io.cloudshiftdev.awscdk.services.globalaccelerator

import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface AcceleratorAttributes {
  public fun acceleratorArn(): String

  public fun dnsName(): String

  public fun dualStackDnsName(): String? = unwrap(this).getDualStackDnsName()

  public fun ipv4Addresses(): List<String> = unwrap(this).getIpv4Addresses() ?: emptyList()

  public fun ipv6Addresses(): List<String> = unwrap(this).getIpv6Addresses() ?: emptyList()

  public interface Builder {
    public fun acceleratorArn(acceleratorArn: String)

    public fun dnsName(dnsName: String)

    public fun dualStackDnsName(dualStackDnsName: String)

    public fun ipv4Addresses(ipv4Addresses: List<String>)

    public fun ipv4Addresses(vararg ipv4Addresses: String)

    public fun ipv6Addresses(ipv6Addresses: List<String>)

    public fun ipv6Addresses(vararg ipv6Addresses: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.globalaccelerator.AcceleratorAttributes.Builder =
        software.amazon.awscdk.services.globalaccelerator.AcceleratorAttributes.builder()

    override fun acceleratorArn(acceleratorArn: String) {
      cdkBuilder.acceleratorArn(acceleratorArn)
    }

    override fun dnsName(dnsName: String) {
      cdkBuilder.dnsName(dnsName)
    }

    override fun dualStackDnsName(dualStackDnsName: String) {
      cdkBuilder.dualStackDnsName(dualStackDnsName)
    }

    override fun ipv4Addresses(ipv4Addresses: List<String>) {
      cdkBuilder.ipv4Addresses(ipv4Addresses)
    }

    override fun ipv4Addresses(vararg ipv4Addresses: String): Unit =
        ipv4Addresses(ipv4Addresses.toList())

    override fun ipv6Addresses(ipv6Addresses: List<String>) {
      cdkBuilder.ipv6Addresses(ipv6Addresses)
    }

    override fun ipv6Addresses(vararg ipv6Addresses: String): Unit =
        ipv6Addresses(ipv6Addresses.toList())

    public fun build(): software.amazon.awscdk.services.globalaccelerator.AcceleratorAttributes =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.globalaccelerator.AcceleratorAttributes,
  ) : AcceleratorAttributes {
    override fun acceleratorArn(): String = unwrap(this).getAcceleratorArn()

    override fun dnsName(): String = unwrap(this).getDnsName()

    override fun dualStackDnsName(): String? = unwrap(this).getDualStackDnsName()

    override fun ipv4Addresses(): List<String> = unwrap(this).getIpv4Addresses() ?: emptyList()

    override fun ipv6Addresses(): List<String> = unwrap(this).getIpv6Addresses() ?: emptyList()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): AcceleratorAttributes {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.globalaccelerator.AcceleratorAttributes):
        AcceleratorAttributes = Wrapper(cdkObject)

    internal fun unwrap(wrapped: AcceleratorAttributes):
        software.amazon.awscdk.services.globalaccelerator.AcceleratorAttributes = (wrapped as
        Wrapper).cdkObject
  }
}
