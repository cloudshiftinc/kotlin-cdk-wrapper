package io.cloudshiftdev.awscdk.services.ec2

import kotlin.String

public interface IVpcEndpointServiceLoadBalancer {
    /** The ARN of the load balancer that hosts the VPC Endpoint Service. */
    public fun loadBalancerArn(): String

    private class Wrapper
    internal constructor(
        internal val cdkObject: software.amazon.awscdk.services.ec2.IVpcEndpointServiceLoadBalancer,
    ) : IVpcEndpointServiceLoadBalancer {
        /** The ARN of the load balancer that hosts the VPC Endpoint Service. */
        override fun loadBalancerArn(): String = unwrap(this).getLoadBalancerArn()
    }

    public companion object {
        init {}

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.ec2.IVpcEndpointServiceLoadBalancer
        ): IVpcEndpointServiceLoadBalancer = Wrapper(cdkObject)

        internal fun unwrap(
            wrapped: IVpcEndpointServiceLoadBalancer
        ): software.amazon.awscdk.services.ec2.IVpcEndpointServiceLoadBalancer =
            (wrapped as Wrapper).cdkObject
    }
}
