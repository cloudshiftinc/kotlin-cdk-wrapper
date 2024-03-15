@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.cxapi

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

/**
 * A subnet representation that the VPC provider uses.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.cxapi.*;
 * VpcSubnet vpcSubnet = VpcSubnet.builder()
 * .availabilityZone("availabilityZone")
 * .routeTableId("routeTableId")
 * .subnetId("subnetId")
 * // the properties below are optional
 * .cidr("cidr")
 * .build();
 * ```
 */
public interface VpcSubnet {
  /**
   * The code of the availability zone this subnet is in (for example, 'us-west-2a').
   */
  public fun availabilityZone(): String

  /**
   * CIDR range of the subnet.
   *
   * Default: - CIDR information not available
   */
  public fun cidr(): String? = unwrap(this).getCidr()

  /**
   * The identifier of the route table for this subnet.
   */
  public fun routeTableId(): String

  /**
   * The identifier of the subnet.
   */
  public fun subnetId(): String

  /**
   * A builder for [VpcSubnet]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param availabilityZone The code of the availability zone this subnet is in (for example,
     * 'us-west-2a'). 
     */
    public fun availabilityZone(availabilityZone: String)

    /**
     * @param cidr CIDR range of the subnet.
     */
    public fun cidr(cidr: String)

    /**
     * @param routeTableId The identifier of the route table for this subnet. 
     */
    public fun routeTableId(routeTableId: String)

    /**
     * @param subnetId The identifier of the subnet. 
     */
    public fun subnetId(subnetId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.cxapi.VpcSubnet.Builder =
        software.amazon.awscdk.cxapi.VpcSubnet.builder()

    /**
     * @param availabilityZone The code of the availability zone this subnet is in (for example,
     * 'us-west-2a'). 
     */
    override fun availabilityZone(availabilityZone: String) {
      cdkBuilder.availabilityZone(availabilityZone)
    }

    /**
     * @param cidr CIDR range of the subnet.
     */
    override fun cidr(cidr: String) {
      cdkBuilder.cidr(cidr)
    }

    /**
     * @param routeTableId The identifier of the route table for this subnet. 
     */
    override fun routeTableId(routeTableId: String) {
      cdkBuilder.routeTableId(routeTableId)
    }

    /**
     * @param subnetId The identifier of the subnet. 
     */
    override fun subnetId(subnetId: String) {
      cdkBuilder.subnetId(subnetId)
    }

    public fun build(): software.amazon.awscdk.cxapi.VpcSubnet = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.cxapi.VpcSubnet,
  ) : CdkObject(cdkObject), VpcSubnet {
    /**
     * The code of the availability zone this subnet is in (for example, 'us-west-2a').
     */
    override fun availabilityZone(): String = unwrap(this).getAvailabilityZone()

    /**
     * CIDR range of the subnet.
     *
     * Default: - CIDR information not available
     */
    override fun cidr(): String? = unwrap(this).getCidr()

    /**
     * The identifier of the route table for this subnet.
     */
    override fun routeTableId(): String = unwrap(this).getRouteTableId()

    /**
     * The identifier of the subnet.
     */
    override fun subnetId(): String = unwrap(this).getSubnetId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): VpcSubnet {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.cxapi.VpcSubnet): VpcSubnet =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: VpcSubnet): software.amazon.awscdk.cxapi.VpcSubnet = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.cxapi.VpcSubnet
  }
}
