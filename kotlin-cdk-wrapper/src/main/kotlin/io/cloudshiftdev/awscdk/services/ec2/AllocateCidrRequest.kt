@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface AllocateCidrRequest {
  public fun requestedSubnets(): List<RequestedSubnet>

  public fun vpcCidr(): String

  @CdkDslMarker
  public interface Builder {
    public fun requestedSubnets(requestedSubnets: List<RequestedSubnet>)

    public fun requestedSubnets(vararg requestedSubnets: RequestedSubnet)

    public fun vpcCidr(vpcCidr: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.AllocateCidrRequest.Builder =
        software.amazon.awscdk.services.ec2.AllocateCidrRequest.builder()

    override fun requestedSubnets(requestedSubnets: List<RequestedSubnet>) {
      cdkBuilder.requestedSubnets(requestedSubnets.map(RequestedSubnet::unwrap))
    }

    override fun requestedSubnets(vararg requestedSubnets: RequestedSubnet): Unit =
        requestedSubnets(requestedSubnets.toList())

    override fun vpcCidr(vpcCidr: String) {
      cdkBuilder.vpcCidr(vpcCidr)
    }

    public fun build(): software.amazon.awscdk.services.ec2.AllocateCidrRequest = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.AllocateCidrRequest,
  ) : CdkObject(cdkObject), AllocateCidrRequest {
    override fun requestedSubnets(): List<RequestedSubnet> =
        unwrap(this).getRequestedSubnets().map(RequestedSubnet::wrap)

    override fun vpcCidr(): String = unwrap(this).getVpcCidr()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): AllocateCidrRequest {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.AllocateCidrRequest):
        AllocateCidrRequest = Wrapper(cdkObject)

    internal fun unwrap(wrapped: AllocateCidrRequest):
        software.amazon.awscdk.services.ec2.AllocateCidrRequest = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.ec2.AllocateCidrRequest
  }
}
