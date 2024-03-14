package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CdkObject
import kotlin.String

public interface IVpcEndpointServiceLoadBalancer {
  /**
   * The ARN of the load balancer that hosts the VPC Endpoint Service.
   */
  public fun loadBalancerArn(): String

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.IVpcEndpointServiceLoadBalancer,
  ) : CdkObject(cdkObject), IVpcEndpointServiceLoadBalancer {
    /**
     * The ARN of the load balancer that hosts the VPC Endpoint Service.
     */
    override fun loadBalancerArn(): String = unwrap(this).getLoadBalancerArn()
  }

  public companion object {
    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.ec2.IVpcEndpointServiceLoadBalancer):
        IVpcEndpointServiceLoadBalancer = Wrapper(cdkObject)

    internal fun unwrap(wrapped: IVpcEndpointServiceLoadBalancer):
        software.amazon.awscdk.services.ec2.IVpcEndpointServiceLoadBalancer = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ec2.IVpcEndpointServiceLoadBalancer
  }
}