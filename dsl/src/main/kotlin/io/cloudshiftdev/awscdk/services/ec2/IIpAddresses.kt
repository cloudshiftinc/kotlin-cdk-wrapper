package io.cloudshiftdev.awscdk.services.ec2

import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public interface IIpAddresses {
    /**
     * Called by the VPC to retrieve Subnet options from the Ipam.
     *
     * Don't call this directly, the VPC will call it automatically.
     *
     * @param input
     */
    public fun allocateSubnetsCidr(input: AllocateCidrRequest): SubnetIpamOptions

    /**
     * Called by the VPC to retrieve Subnet options from the Ipam.
     *
     * Don't call this directly, the VPC will call it automatically.
     *
     * @param input
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2b0342e5517b6eaf50616712b0cc3dedcaaf80337137500e7b6c321aed0efab8")
    public fun allocateSubnetsCidr(input: AllocateCidrRequest.Builder.() -> Unit): SubnetIpamOptions

    /**
     * Called by the VPC to retrieve VPC options from the Ipam.
     *
     * Don't call this directly, the VPC will call it automatically.
     */
    public fun allocateVpcCidr(): VpcIpamOptions

    private class Wrapper
    internal constructor(
        internal val cdkObject: software.amazon.awscdk.services.ec2.IIpAddresses,
    ) : IIpAddresses {
        /**
         * Called by the VPC to retrieve Subnet options from the Ipam.
         *
         * Don't call this directly, the VPC will call it automatically.
         *
         * @param input
         */
        override fun allocateSubnetsCidr(input: AllocateCidrRequest): SubnetIpamOptions =
            unwrap(this)
                .allocateSubnetsCidr(input.let(AllocateCidrRequest::unwrap))
                .let(SubnetIpamOptions::wrap)

        /**
         * Called by the VPC to retrieve Subnet options from the Ipam.
         *
         * Don't call this directly, the VPC will call it automatically.
         *
         * @param input
         */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("2b0342e5517b6eaf50616712b0cc3dedcaaf80337137500e7b6c321aed0efab8")
        override fun allocateSubnetsCidr(
            input: AllocateCidrRequest.Builder.() -> Unit
        ): SubnetIpamOptions = allocateSubnetsCidr(AllocateCidrRequest(input))

        /**
         * Called by the VPC to retrieve VPC options from the Ipam.
         *
         * Don't call this directly, the VPC will call it automatically.
         */
        override fun allocateVpcCidr(): VpcIpamOptions =
            unwrap(this).allocateVpcCidr().let(VpcIpamOptions::wrap)
    }

    public companion object {
        init {}

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.ec2.IIpAddresses
        ): IIpAddresses = Wrapper(cdkObject)

        internal fun unwrap(
            wrapped: IIpAddresses
        ): software.amazon.awscdk.services.ec2.IIpAddresses = (wrapped as Wrapper).cdkObject
    }
}
