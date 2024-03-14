package io.cloudshiftdev.awscdk.services.ec2

import kotlin.Unit
import kotlin.collections.List

public interface SubnetIpamOptions {
  public fun allocatedSubnets(): List<AllocatedSubnet>

  public interface Builder {
    public fun allocatedSubnets(allocatedSubnets: List<AllocatedSubnet>) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.SubnetIpamOptions.Builder =
        software.amazon.awscdk.services.ec2.SubnetIpamOptions.builder()

    public override fun allocatedSubnets(allocatedSubnets: List<AllocatedSubnet>) {
      cdkBuilder.allocatedSubnets(allocatedSubnets.map(AllocatedSubnet::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ec2.SubnetIpamOptions = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.ec2.SubnetIpamOptions,
  ) : SubnetIpamOptions {
    public override fun allocatedSubnets(): List<AllocatedSubnet> =
        unwrap(this).getAllocatedSubnets().map(AllocatedSubnet::wrap)
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): SubnetIpamOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.SubnetIpamOptions):
        SubnetIpamOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: SubnetIpamOptions):
        software.amazon.awscdk.services.ec2.SubnetIpamOptions = (wrapped as Wrapper).cdkObject
  }
}
