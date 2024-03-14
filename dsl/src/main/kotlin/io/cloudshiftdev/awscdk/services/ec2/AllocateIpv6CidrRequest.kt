package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface AllocateIpv6CidrRequest {
    /** List of subnets allocated with IPv4 CIDRs. */
    public fun allocatedSubnets(): List<AllocatedSubnet>

    /** The IPv6 CIDRs to be allocated to the subnets. */
    public fun ipv6Cidrs(): List<String>

    /** A builder for [AllocateIpv6CidrRequest] */
    @CdkDslMarker
    public interface Builder {
        /** @param allocatedSubnets List of subnets allocated with IPv4 CIDRs. */
        public fun allocatedSubnets(allocatedSubnets: List<AllocatedSubnet>)

        /** @param allocatedSubnets List of subnets allocated with IPv4 CIDRs. */
        public fun allocatedSubnets(vararg allocatedSubnets: AllocatedSubnet)

        /** @param ipv6Cidrs The IPv6 CIDRs to be allocated to the subnets. */
        public fun ipv6Cidrs(ipv6Cidrs: List<String>)

        /** @param ipv6Cidrs The IPv6 CIDRs to be allocated to the subnets. */
        public fun ipv6Cidrs(vararg ipv6Cidrs: String)
    }

    private class BuilderImpl : Builder {
        private val cdkBuilder:
            software.amazon.awscdk.services.ec2.AllocateIpv6CidrRequest.Builder =
            software.amazon.awscdk.services.ec2.AllocateIpv6CidrRequest.builder()

        /** @param allocatedSubnets List of subnets allocated with IPv4 CIDRs. */
        override fun allocatedSubnets(allocatedSubnets: List<AllocatedSubnet>) {
            cdkBuilder.allocatedSubnets(allocatedSubnets.map(AllocatedSubnet::unwrap))
        }

        /** @param allocatedSubnets List of subnets allocated with IPv4 CIDRs. */
        override fun allocatedSubnets(vararg allocatedSubnets: AllocatedSubnet): Unit =
            allocatedSubnets(allocatedSubnets.toList())

        /** @param ipv6Cidrs The IPv6 CIDRs to be allocated to the subnets. */
        override fun ipv6Cidrs(ipv6Cidrs: List<String>) {
            cdkBuilder.ipv6Cidrs(ipv6Cidrs)
        }

        /** @param ipv6Cidrs The IPv6 CIDRs to be allocated to the subnets. */
        override fun ipv6Cidrs(vararg ipv6Cidrs: String): Unit = ipv6Cidrs(ipv6Cidrs.toList())

        public fun build(): software.amazon.awscdk.services.ec2.AllocateIpv6CidrRequest =
            cdkBuilder.build()
    }

    private class Wrapper
    internal constructor(
        internal val cdkObject: software.amazon.awscdk.services.ec2.AllocateIpv6CidrRequest,
    ) : AllocateIpv6CidrRequest {
        /** List of subnets allocated with IPv4 CIDRs. */
        override fun allocatedSubnets(): List<AllocatedSubnet> =
            unwrap(this).getAllocatedSubnets().map(AllocatedSubnet::wrap)

        /** The IPv6 CIDRs to be allocated to the subnets. */
        override fun ipv6Cidrs(): List<String> = unwrap(this).getIpv6Cidrs()
    }

    public companion object {
        init {}

        public operator fun invoke(block: Builder.() -> Unit = {}): AllocateIpv6CidrRequest {
            val builderImpl = BuilderImpl()
            return Wrapper(builderImpl.apply(block).build())
        }

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.ec2.AllocateIpv6CidrRequest
        ): AllocateIpv6CidrRequest = Wrapper(cdkObject)

        internal fun unwrap(
            wrapped: AllocateIpv6CidrRequest
        ): software.amazon.awscdk.services.ec2.AllocateIpv6CidrRequest =
            (wrapped as Wrapper).cdkObject
    }
}
