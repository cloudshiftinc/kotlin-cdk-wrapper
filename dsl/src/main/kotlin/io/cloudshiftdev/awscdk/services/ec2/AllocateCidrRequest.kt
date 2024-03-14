package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface AllocateCidrRequest {
  /**
   * The Subnets to be allocated.
   */
  public fun requestedSubnets(): List<RequestedSubnet>

  /**
   * The IPv4 CIDR block for this Vpc.
   */
  public fun vpcCidr(): String

  /**
   * A builder for [AllocateCidrRequest]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param requestedSubnets The Subnets to be allocated. 
     */
    public fun requestedSubnets(requestedSubnets: List<RequestedSubnet>)

    /**
     * @param requestedSubnets The Subnets to be allocated. 
     */
    public fun requestedSubnets(vararg requestedSubnets: RequestedSubnet)

    /**
     * @param vpcCidr The IPv4 CIDR block for this Vpc. 
     */
    public fun vpcCidr(vpcCidr: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.AllocateCidrRequest.Builder =
        software.amazon.awscdk.services.ec2.AllocateCidrRequest.builder()

    /**
     * @param requestedSubnets The Subnets to be allocated. 
     */
    override fun requestedSubnets(requestedSubnets: List<RequestedSubnet>) {
      cdkBuilder.requestedSubnets(requestedSubnets.map(RequestedSubnet::unwrap))
    }

    /**
     * @param requestedSubnets The Subnets to be allocated. 
     */
    override fun requestedSubnets(vararg requestedSubnets: RequestedSubnet): Unit =
        requestedSubnets(requestedSubnets.toList())

    /**
     * @param vpcCidr The IPv4 CIDR block for this Vpc. 
     */
    override fun vpcCidr(vpcCidr: String) {
      cdkBuilder.vpcCidr(vpcCidr)
    }

    public fun build(): software.amazon.awscdk.services.ec2.AllocateCidrRequest = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.ec2.AllocateCidrRequest,
  ) : AllocateCidrRequest {
    /**
     * The Subnets to be allocated.
     */
    override fun requestedSubnets(): List<RequestedSubnet> =
        unwrap(this).getRequestedSubnets().map(RequestedSubnet::wrap)

    /**
     * The IPv4 CIDR block for this Vpc.
     */
    override fun vpcCidr(): String = unwrap(this).getVpcCidr()
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
