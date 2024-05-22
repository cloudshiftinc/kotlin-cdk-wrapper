@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Unit
import kotlin.collections.List

/**
 * CIDR Allocated Subnets.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ec2.*;
 * SubnetIpamOptions subnetIpamOptions = SubnetIpamOptions.builder()
 * .allocatedSubnets(List.of(AllocatedSubnet.builder()
 * .cidr("cidr")
 * // the properties below are optional
 * .ipv6Cidr("ipv6Cidr")
 * .build()))
 * .build();
 * ```
 */
public interface SubnetIpamOptions {
  /**
   * CIDR Allocations for Subnets.
   */
  public fun allocatedSubnets(): List<AllocatedSubnet>

  /**
   * A builder for [SubnetIpamOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param allocatedSubnets CIDR Allocations for Subnets. 
     */
    public fun allocatedSubnets(allocatedSubnets: List<AllocatedSubnet>)

    /**
     * @param allocatedSubnets CIDR Allocations for Subnets. 
     */
    public fun allocatedSubnets(vararg allocatedSubnets: AllocatedSubnet)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.SubnetIpamOptions.Builder =
        software.amazon.awscdk.services.ec2.SubnetIpamOptions.builder()

    /**
     * @param allocatedSubnets CIDR Allocations for Subnets. 
     */
    override fun allocatedSubnets(allocatedSubnets: List<AllocatedSubnet>) {
      cdkBuilder.allocatedSubnets(allocatedSubnets.map(AllocatedSubnet.Companion::unwrap))
    }

    /**
     * @param allocatedSubnets CIDR Allocations for Subnets. 
     */
    override fun allocatedSubnets(vararg allocatedSubnets: AllocatedSubnet): Unit =
        allocatedSubnets(allocatedSubnets.toList())

    public fun build(): software.amazon.awscdk.services.ec2.SubnetIpamOptions = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.ec2.SubnetIpamOptions,
  ) : CdkObject(cdkObject), SubnetIpamOptions {
    /**
     * CIDR Allocations for Subnets.
     */
    override fun allocatedSubnets(): List<AllocatedSubnet> =
        unwrap(this).getAllocatedSubnets().map(AllocatedSubnet::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): SubnetIpamOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.SubnetIpamOptions):
        SubnetIpamOptions = CdkObjectWrappers.wrap(cdkObject) as? SubnetIpamOptions ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: SubnetIpamOptions):
        software.amazon.awscdk.services.ec2.SubnetIpamOptions = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.ec2.SubnetIpamOptions
  }
}
