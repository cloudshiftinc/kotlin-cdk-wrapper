package io.cloudshiftdev.awscdk.services.ec2

import kotlin.Number
import kotlin.String
import kotlin.collections.List

public abstract class SubnetFilter internal constructor(
  private val cdkObject: software.amazon.awscdk.services.ec2.SubnetFilter,
) {
  public open fun selectSubnets(_subnets: List<ISubnet>): List<ISubnet> =
      unwrap(this).selectSubnets(_subnets.map(ISubnet::unwrap)).map(ISubnet::wrap)

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.ec2.SubnetFilter,
  ) : SubnetFilter(cdkObject)

  public companion object {
    public open fun availabilityZones(availabilityZones: List<String>): SubnetFilter =
        software.amazon.awscdk.services.ec2.SubnetFilter.availabilityZones(availabilityZones).let(SubnetFilter::wrap)

    public open fun byCidrMask(mask: Number): SubnetFilter =
        software.amazon.awscdk.services.ec2.SubnetFilter.byCidrMask(mask).let(SubnetFilter::wrap)

    public open fun byCidrRanges(cidrs: List<String>): SubnetFilter =
        software.amazon.awscdk.services.ec2.SubnetFilter.byCidrRanges(cidrs).let(SubnetFilter::wrap)

    public open fun byIds(subnetIds: List<String>): SubnetFilter =
        software.amazon.awscdk.services.ec2.SubnetFilter.byIds(subnetIds).let(SubnetFilter::wrap)

    public open fun containsIpAddresses(ipv4addrs: List<String>): SubnetFilter =
        software.amazon.awscdk.services.ec2.SubnetFilter.containsIpAddresses(ipv4addrs).let(SubnetFilter::wrap)

    public open fun onePerAz(): SubnetFilter =
        software.amazon.awscdk.services.ec2.SubnetFilter.onePerAz().let(SubnetFilter::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.SubnetFilter): SubnetFilter =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: SubnetFilter): software.amazon.awscdk.services.ec2.SubnetFilter =
        (wrapped as Wrapper).cdkObject
  }
}
