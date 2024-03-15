@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.constructs.Construct
import kotlin.String
import kotlin.Unit

public interface AllocateVpcIpv6CidrRequest {
  public fun scope(): Construct

  public fun vpcId(): String

  @CdkDslMarker
  public interface Builder {
    public fun scope(scope: Construct)

    public fun vpcId(vpcId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.AllocateVpcIpv6CidrRequest.Builder =
        software.amazon.awscdk.services.ec2.AllocateVpcIpv6CidrRequest.builder()

    override fun scope(scope: Construct) {
      cdkBuilder.scope(scope.let(Construct::unwrap))
    }

    override fun vpcId(vpcId: String) {
      cdkBuilder.vpcId(vpcId)
    }

    public fun build(): software.amazon.awscdk.services.ec2.AllocateVpcIpv6CidrRequest =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.AllocateVpcIpv6CidrRequest,
  ) : CdkObject(cdkObject), AllocateVpcIpv6CidrRequest {
    override fun scope(): Construct = unwrap(this).getScope().let(Construct::wrap)

    override fun vpcId(): String = unwrap(this).getVpcId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): AllocateVpcIpv6CidrRequest {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.AllocateVpcIpv6CidrRequest):
        AllocateVpcIpv6CidrRequest = Wrapper(cdkObject)

    internal fun unwrap(wrapped: AllocateVpcIpv6CidrRequest):
        software.amazon.awscdk.services.ec2.AllocateVpcIpv6CidrRequest = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ec2.AllocateVpcIpv6CidrRequest
  }
}
