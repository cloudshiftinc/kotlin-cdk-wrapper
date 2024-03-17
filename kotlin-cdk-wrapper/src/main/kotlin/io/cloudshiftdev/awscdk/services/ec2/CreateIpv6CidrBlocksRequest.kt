@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Number
import kotlin.String
import kotlin.Unit

/**
 * Request for IPv6 CIDR block to be split up.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ec2.*;
 * CreateIpv6CidrBlocksRequest createIpv6CidrBlocksRequest = CreateIpv6CidrBlocksRequest.builder()
 * .ipv6SelectedCidr("ipv6SelectedCidr")
 * .subnetCount(123)
 * // the properties below are optional
 * .sizeMask("sizeMask")
 * .build();
 * ```
 */
public interface CreateIpv6CidrBlocksRequest {
  /**
   * The IPv6 CIDR block string representation.
   */
  public fun ipv6SelectedCidr(): String

  /**
   * Size of the covered bits in the CIDR.
   *
   * Default: - 128 - 64 = /64 CIDR.
   */
  public fun sizeMask(): String? = unwrap(this).getSizeMask()

  /**
   * The number of subnets to assign CIDRs to.
   */
  public fun subnetCount(): Number

  /**
   * A builder for [CreateIpv6CidrBlocksRequest]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param ipv6SelectedCidr The IPv6 CIDR block string representation. 
     */
    public fun ipv6SelectedCidr(ipv6SelectedCidr: String)

    /**
     * @param sizeMask Size of the covered bits in the CIDR.
     */
    public fun sizeMask(sizeMask: String)

    /**
     * @param subnetCount The number of subnets to assign CIDRs to. 
     */
    public fun subnetCount(subnetCount: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.CreateIpv6CidrBlocksRequest.Builder
        = software.amazon.awscdk.services.ec2.CreateIpv6CidrBlocksRequest.builder()

    /**
     * @param ipv6SelectedCidr The IPv6 CIDR block string representation. 
     */
    override fun ipv6SelectedCidr(ipv6SelectedCidr: String) {
      cdkBuilder.ipv6SelectedCidr(ipv6SelectedCidr)
    }

    /**
     * @param sizeMask Size of the covered bits in the CIDR.
     */
    override fun sizeMask(sizeMask: String) {
      cdkBuilder.sizeMask(sizeMask)
    }

    /**
     * @param subnetCount The number of subnets to assign CIDRs to. 
     */
    override fun subnetCount(subnetCount: Number) {
      cdkBuilder.subnetCount(subnetCount)
    }

    public fun build(): software.amazon.awscdk.services.ec2.CreateIpv6CidrBlocksRequest =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.CreateIpv6CidrBlocksRequest,
  ) : CdkObject(cdkObject), CreateIpv6CidrBlocksRequest {
    /**
     * The IPv6 CIDR block string representation.
     */
    override fun ipv6SelectedCidr(): String = unwrap(this).getIpv6SelectedCidr()

    /**
     * Size of the covered bits in the CIDR.
     *
     * Default: - 128 - 64 = /64 CIDR.
     */
    override fun sizeMask(): String? = unwrap(this).getSizeMask()

    /**
     * The number of subnets to assign CIDRs to.
     */
    override fun subnetCount(): Number = unwrap(this).getSubnetCount()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CreateIpv6CidrBlocksRequest {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CreateIpv6CidrBlocksRequest):
        CreateIpv6CidrBlocksRequest = CdkObjectWrappers.wrap(cdkObject) as?
        CreateIpv6CidrBlocksRequest ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CreateIpv6CidrBlocksRequest):
        software.amazon.awscdk.services.ec2.CreateIpv6CidrBlocksRequest = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ec2.CreateIpv6CidrBlocksRequest
  }
}
