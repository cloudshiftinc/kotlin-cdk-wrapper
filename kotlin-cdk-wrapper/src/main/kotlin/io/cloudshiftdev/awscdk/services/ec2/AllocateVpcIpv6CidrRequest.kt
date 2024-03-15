@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.constructs.Construct
import kotlin.String
import kotlin.Unit

/**
 * Request for allocation of the VPC IPv6 CIDR.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ec2.*;
 * import software.constructs.*;
 * Construct construct;
 * AllocateVpcIpv6CidrRequest allocateVpcIpv6CidrRequest = AllocateVpcIpv6CidrRequest.builder()
 * .scope(construct)
 * .vpcId("vpcId")
 * .build();
 * ```
 */
public interface AllocateVpcIpv6CidrRequest {
  /**
   * The VPC construct to attach to.
   */
  public fun scope(): Construct

  /**
   * The id of the VPC.
   */
  public fun vpcId(): String

  /**
   * A builder for [AllocateVpcIpv6CidrRequest]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param scope The VPC construct to attach to. 
     */
    public fun scope(scope: Construct)

    /**
     * @param vpcId The id of the VPC. 
     */
    public fun vpcId(vpcId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.AllocateVpcIpv6CidrRequest.Builder =
        software.amazon.awscdk.services.ec2.AllocateVpcIpv6CidrRequest.builder()

    /**
     * @param scope The VPC construct to attach to. 
     */
    override fun scope(scope: Construct) {
      cdkBuilder.scope(scope.let(Construct::unwrap))
    }

    /**
     * @param vpcId The id of the VPC. 
     */
    override fun vpcId(vpcId: String) {
      cdkBuilder.vpcId(vpcId)
    }

    public fun build(): software.amazon.awscdk.services.ec2.AllocateVpcIpv6CidrRequest =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.AllocateVpcIpv6CidrRequest,
  ) : CdkObject(cdkObject), AllocateVpcIpv6CidrRequest {
    /**
     * The VPC construct to attach to.
     */
    override fun scope(): Construct = unwrap(this).getScope().let(Construct::wrap)

    /**
     * The id of the VPC.
     */
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
