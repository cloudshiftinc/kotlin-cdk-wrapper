@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Request for subnets CIDR to be allocated for a Vpc.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ec2.*;
 * AllocateCidrRequest allocateCidrRequest = AllocateCidrRequest.builder()
 * .requestedSubnets(List.of(RequestedSubnet.builder()
 * .availabilityZone("availabilityZone")
 * .configuration(SubnetConfiguration.builder()
 * .name("name")
 * .subnetType(SubnetType.PRIVATE_ISOLATED)
 * // the properties below are optional
 * .cidrMask(123)
 * .ipv6AssignAddressOnCreation(false)
 * .mapPublicIpOnLaunch(false)
 * .reserved(false)
 * .build())
 * .subnetConstructId("subnetConstructId")
 * .build()))
 * .vpcCidr("vpcCidr")
 * .build();
 * ```
 */
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

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.AllocateCidrRequest,
  ) : CdkObject(cdkObject), AllocateCidrRequest {
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
    public operator fun invoke(block: Builder.() -> Unit = {}): AllocateCidrRequest {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.AllocateCidrRequest):
        AllocateCidrRequest = CdkObjectWrappers.wrap(cdkObject) as AllocateCidrRequest

    internal fun unwrap(wrapped: AllocateCidrRequest):
        software.amazon.awscdk.services.ec2.AllocateCidrRequest = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.ec2.AllocateCidrRequest
  }
}
