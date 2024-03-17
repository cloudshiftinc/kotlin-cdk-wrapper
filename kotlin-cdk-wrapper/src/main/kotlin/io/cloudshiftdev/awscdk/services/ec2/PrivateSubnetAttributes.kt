@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ec2.*;
 * PrivateSubnetAttributes privateSubnetAttributes = PrivateSubnetAttributes.builder()
 * .subnetId("subnetId")
 * // the properties below are optional
 * .availabilityZone("availabilityZone")
 * .ipv4CidrBlock("ipv4CidrBlock")
 * .routeTableId("routeTableId")
 * .build();
 * ```
 */
public interface PrivateSubnetAttributes : SubnetAttributes {
  /**
   * A builder for [PrivateSubnetAttributes]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param availabilityZone The Availability Zone the subnet is located in.
     */
    public fun availabilityZone(availabilityZone: String)

    /**
     * @param ipv4CidrBlock The IPv4 CIDR block associated with the subnet.
     */
    public fun ipv4CidrBlock(ipv4CidrBlock: String)

    /**
     * @param routeTableId The ID of the route table for this particular subnet.
     */
    public fun routeTableId(routeTableId: String)

    /**
     * @param subnetId The subnetId for this particular subnet. 
     */
    public fun subnetId(subnetId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.PrivateSubnetAttributes.Builder =
        software.amazon.awscdk.services.ec2.PrivateSubnetAttributes.builder()

    /**
     * @param availabilityZone The Availability Zone the subnet is located in.
     */
    override fun availabilityZone(availabilityZone: String) {
      cdkBuilder.availabilityZone(availabilityZone)
    }

    /**
     * @param ipv4CidrBlock The IPv4 CIDR block associated with the subnet.
     */
    override fun ipv4CidrBlock(ipv4CidrBlock: String) {
      cdkBuilder.ipv4CidrBlock(ipv4CidrBlock)
    }

    /**
     * @param routeTableId The ID of the route table for this particular subnet.
     */
    override fun routeTableId(routeTableId: String) {
      cdkBuilder.routeTableId(routeTableId)
    }

    /**
     * @param subnetId The subnetId for this particular subnet. 
     */
    override fun subnetId(subnetId: String) {
      cdkBuilder.subnetId(subnetId)
    }

    public fun build(): software.amazon.awscdk.services.ec2.PrivateSubnetAttributes =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.PrivateSubnetAttributes,
  ) : CdkObject(cdkObject), PrivateSubnetAttributes {
    /**
     * The Availability Zone the subnet is located in.
     *
     * Default: - No AZ information, cannot use AZ selection features
     */
    override fun availabilityZone(): String? = unwrap(this).getAvailabilityZone()

    /**
     * The IPv4 CIDR block associated with the subnet.
     *
     * Default: - No CIDR information, cannot use CIDR filter features
     */
    override fun ipv4CidrBlock(): String? = unwrap(this).getIpv4CidrBlock()

    /**
     * The ID of the route table for this particular subnet.
     *
     * Default: - No route table information, cannot create VPC endpoints
     */
    override fun routeTableId(): String? = unwrap(this).getRouteTableId()

    /**
     * The subnetId for this particular subnet.
     */
    override fun subnetId(): String = unwrap(this).getSubnetId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): PrivateSubnetAttributes {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.PrivateSubnetAttributes):
        PrivateSubnetAttributes = CdkObjectWrappers.wrap(cdkObject) as? PrivateSubnetAttributes ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: PrivateSubnetAttributes):
        software.amazon.awscdk.services.ec2.PrivateSubnetAttributes = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ec2.PrivateSubnetAttributes
  }
}
