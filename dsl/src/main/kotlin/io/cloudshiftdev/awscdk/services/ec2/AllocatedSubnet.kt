package io.cloudshiftdev.awscdk.services.ec2

import kotlin.String
import kotlin.Unit

public interface AllocatedSubnet {
  public fun cidr(): String

  public fun ipv6Cidr(): String? = unwrap(this).getIpv6Cidr()

  public interface Builder {
    public fun cidr(cidr: String)

    public fun ipv6Cidr(ipv6Cidr: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.AllocatedSubnet.Builder =
        software.amazon.awscdk.services.ec2.AllocatedSubnet.builder()

    override fun cidr(cidr: String) {
      cdkBuilder.cidr(cidr)
    }

    override fun ipv6Cidr(ipv6Cidr: String) {
      cdkBuilder.ipv6Cidr(ipv6Cidr)
    }

    public fun build(): software.amazon.awscdk.services.ec2.AllocatedSubnet = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.ec2.AllocatedSubnet,
  ) : AllocatedSubnet {
    override fun cidr(): String = unwrap(this).getCidr()

    override fun ipv6Cidr(): String? = unwrap(this).getIpv6Cidr()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): AllocatedSubnet {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.AllocatedSubnet):
        AllocatedSubnet = Wrapper(cdkObject)

    internal fun unwrap(wrapped: AllocatedSubnet):
        software.amazon.awscdk.services.ec2.AllocatedSubnet = (wrapped as Wrapper).cdkObject
  }
}
