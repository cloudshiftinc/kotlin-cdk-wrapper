@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String

public interface IVpcEndpointServiceLoadBalancer {
  public fun loadBalancerArn(): String

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.IVpcEndpointServiceLoadBalancer,
  ) : CdkObject(cdkObject), IVpcEndpointServiceLoadBalancer {
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
