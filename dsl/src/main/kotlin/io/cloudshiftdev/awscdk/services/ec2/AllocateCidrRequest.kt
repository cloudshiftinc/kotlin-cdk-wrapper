package io.cloudshiftdev.awscdk.services.ec2

import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface AllocateCidrRequest {
  public fun requestedSubnets(): List<RequestedSubnet>

  public fun vpcCidr(): String

  public interface Builder {
    public fun requestedSubnets(requestedSubnets: List<RequestedSubnet>) {
    }

    public fun vpcCidr(vpcCidr: String) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.AllocateCidrRequest.Builder =
        software.amazon.awscdk.services.ec2.AllocateCidrRequest.builder()

    public override fun requestedSubnets(requestedSubnets: List<RequestedSubnet>) {
      cdkBuilder.requestedSubnets(requestedSubnets.map(RequestedSubnet::unwrap))
    }

    public override fun vpcCidr(vpcCidr: String) {
      cdkBuilder.vpcCidr(vpcCidr)
    }

    public fun build(): software.amazon.awscdk.services.ec2.AllocateCidrRequest = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.ec2.AllocateCidrRequest,
  ) : AllocateCidrRequest {
    public override fun requestedSubnets(): List<RequestedSubnet> =
        unwrap(this).getRequestedSubnets().map(RequestedSubnet::wrap)

    public override fun vpcCidr(): String = unwrap(this).getVpcCidr()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): AllocateCidrRequest {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.AllocateCidrRequest):
        AllocateCidrRequest = Wrapper(cdkObject)

    internal fun unwrap(wrapped: AllocateCidrRequest):
        software.amazon.awscdk.services.ec2.AllocateCidrRequest = (wrapped as Wrapper).cdkObject
  }
}
