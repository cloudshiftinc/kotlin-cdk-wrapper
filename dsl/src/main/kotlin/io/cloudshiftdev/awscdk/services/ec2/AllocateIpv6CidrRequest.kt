package io.cloudshiftdev.awscdk.services.ec2

import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface AllocateIpv6CidrRequest {
  public fun allocatedSubnets(): List<AllocatedSubnet>

  public fun ipv6Cidrs(): List<String>

  public interface Builder {
    public fun allocatedSubnets(allocatedSubnets: List<AllocatedSubnet>)

    public fun ipv6Cidrs(ipv6Cidrs: List<String>)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.AllocateIpv6CidrRequest.Builder =
        software.amazon.awscdk.services.ec2.AllocateIpv6CidrRequest.builder()

    override fun allocatedSubnets(allocatedSubnets: List<AllocatedSubnet>) {
      cdkBuilder.allocatedSubnets(allocatedSubnets.map(AllocatedSubnet::unwrap))
    }

    override fun ipv6Cidrs(ipv6Cidrs: List<String>) {
      cdkBuilder.ipv6Cidrs(ipv6Cidrs)
    }

    public fun build(): software.amazon.awscdk.services.ec2.AllocateIpv6CidrRequest =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.ec2.AllocateIpv6CidrRequest,
  ) : AllocateIpv6CidrRequest {
    override fun allocatedSubnets(): List<AllocatedSubnet> =
        unwrap(this).getAllocatedSubnets().map(AllocatedSubnet::wrap)

    override fun ipv6Cidrs(): List<String> = unwrap(this).getIpv6Cidrs() ?: emptyList()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): AllocateIpv6CidrRequest {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.AllocateIpv6CidrRequest):
        AllocateIpv6CidrRequest = Wrapper(cdkObject)

    internal fun unwrap(wrapped: AllocateIpv6CidrRequest):
        software.amazon.awscdk.services.ec2.AllocateIpv6CidrRequest = (wrapped as Wrapper).cdkObject
  }
}
