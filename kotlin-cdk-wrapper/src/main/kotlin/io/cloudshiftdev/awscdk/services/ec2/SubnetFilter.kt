@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Number
import kotlin.String
import kotlin.collections.List

/**
 * Contains logic which chooses a set of subnets from a larger list, in conjunction with
 * SubnetSelection, to determine where to place AWS resources such as VPC endpoints, EC2 instances,
 * etc.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ec2.*;
 * SubnetFilter subnetFilter = SubnetFilter.availabilityZones(List.of("availabilityZones"));
 * ```
 */
public abstract class SubnetFilter internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.ec2.SubnetFilter,
) : CdkObject(cdkObject) {
  /**
   * Executes the subnet filtering logic, returning a filtered set of subnets.
   *
   * @param _subnets 
   */
  public open fun selectSubnets(subnets: List<ISubnet>): List<ISubnet> =
      unwrap(this).selectSubnets(subnets.map(ISubnet::unwrap)).map(ISubnet::wrap)

  /**
   * Executes the subnet filtering logic, returning a filtered set of subnets.
   *
   * @param _subnets 
   */
  public open fun selectSubnets(vararg subnets: ISubnet): List<ISubnet> =
      selectSubnets(subnets.toList())

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.SubnetFilter,
  ) : SubnetFilter(cdkObject)

  public companion object {
    public fun availabilityZones(availabilityZones: List<String>): SubnetFilter =
        software.amazon.awscdk.services.ec2.SubnetFilter.availabilityZones(availabilityZones).let(SubnetFilter::wrap)

    public fun availabilityZones(vararg availabilityZones: String): SubnetFilter =
        availabilityZones(availabilityZones.toList())

    public fun byCidrMask(mask: Number): SubnetFilter =
        software.amazon.awscdk.services.ec2.SubnetFilter.byCidrMask(mask).let(SubnetFilter::wrap)

    public fun byCidrRanges(cidrs: List<String>): SubnetFilter =
        software.amazon.awscdk.services.ec2.SubnetFilter.byCidrRanges(cidrs).let(SubnetFilter::wrap)

    public fun byCidrRanges(vararg cidrs: String): SubnetFilter = byCidrRanges(cidrs.toList())

    public fun byIds(subnetIds: List<String>): SubnetFilter =
        software.amazon.awscdk.services.ec2.SubnetFilter.byIds(subnetIds).let(SubnetFilter::wrap)

    public fun byIds(vararg subnetIds: String): SubnetFilter = byIds(subnetIds.toList())

    public fun containsIpAddresses(ipv4addrs: List<String>): SubnetFilter =
        software.amazon.awscdk.services.ec2.SubnetFilter.containsIpAddresses(ipv4addrs).let(SubnetFilter::wrap)

    public fun containsIpAddresses(vararg ipv4addrs: String): SubnetFilter =
        containsIpAddresses(ipv4addrs.toList())

    public fun onePerAz(): SubnetFilter =
        software.amazon.awscdk.services.ec2.SubnetFilter.onePerAz().let(SubnetFilter::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.SubnetFilter): SubnetFilter =
        CdkObjectWrappers.wrap(cdkObject) as? SubnetFilter ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: SubnetFilter): software.amazon.awscdk.services.ec2.SubnetFilter =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.ec2.SubnetFilter
  }
}
