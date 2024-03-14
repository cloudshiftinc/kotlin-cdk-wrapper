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
    public fun acceleratorArn(acceleratorArn: String) {
    }

    public fun dnsName(dnsName: String) {
    }

    public fun dualStackDnsName(dualStackDnsName: String) {
    }

    public fun ipv4Addresses(ipv4Addresses: List<String>) {
    }

    public fun ipv6Addresses(ipv6Addresses: List<String>) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.globalaccelerator.AcceleratorAttributes.Builder =
        software.amazon.awscdk.services.globalaccelerator.AcceleratorAttributes.builder()

    public override fun acceleratorArn(acceleratorArn: String) {
      cdkBuilder.acceleratorArn(acceleratorArn)
    }

    public override fun dnsName(dnsName: String) {
      cdkBuilder.dnsName(dnsName)
    }

    public override fun dualStackDnsName(dualStackDnsName: String) {
      cdkBuilder.dualStackDnsName(dualStackDnsName)
    }

    public override fun ipv4Addresses(ipv4Addresses: List<String>) {
      cdkBuilder.ipv4Addresses(ipv4Addresses)
    }

    public override fun ipv6Addresses(ipv6Addresses: List<String>) {
      cdkBuilder.ipv6Addresses(ipv6Addresses)
    }

    public fun build(): software.amazon.awscdk.services.globalaccelerator.AcceleratorAttributes =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.globalaccelerator.AcceleratorAttributes,
  ) : AcceleratorAttributes {
    public override fun acceleratorArn(): String = unwrap(this).getAcceleratorArn()

    public override fun dnsName(): String = unwrap(this).getDnsName()

    public override fun dualStackDnsName(): String? = unwrap(this).getDualStackDnsName()

    public override fun ipv4Addresses(): List<String> = unwrap(this).getIpv4Addresses() ?:
        emptyList()

    public override fun ipv6Addresses(): List<String> = unwrap(this).getIpv6Addresses() ?:
        emptyList()
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
