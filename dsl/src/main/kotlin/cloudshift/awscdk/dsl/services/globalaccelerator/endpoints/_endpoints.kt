@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.globalaccelerator.endpoints

import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnEIP
import software.amazon.awscdk.services.ec2.IInstance
import software.amazon.awscdk.services.elasticloadbalancingv2.IApplicationLoadBalancer
import software.amazon.awscdk.services.elasticloadbalancingv2.INetworkLoadBalancer
import software.amazon.awscdk.services.globalaccelerator.endpoints.ApplicationLoadBalancerEndpoint
import software.amazon.awscdk.services.globalaccelerator.endpoints.ApplicationLoadBalancerEndpointOptions
import software.amazon.awscdk.services.globalaccelerator.endpoints.CfnEipEndpoint
import software.amazon.awscdk.services.globalaccelerator.endpoints.CfnEipEndpointProps
import software.amazon.awscdk.services.globalaccelerator.endpoints.InstanceEndpoint
import software.amazon.awscdk.services.globalaccelerator.endpoints.InstanceEndpointProps
import software.amazon.awscdk.services.globalaccelerator.endpoints.NetworkLoadBalancerEndpoint
import software.amazon.awscdk.services.globalaccelerator.endpoints.NetworkLoadBalancerEndpointProps

public object endpoints {
  public inline fun applicationLoadBalancerEndpoint(loadBalancer: IApplicationLoadBalancer,
      block: ApplicationLoadBalancerEndpointDsl.() -> Unit = {}): ApplicationLoadBalancerEndpoint {
    val builder = ApplicationLoadBalancerEndpointDsl(loadBalancer)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun applicationLoadBalancerEndpointOptions(block: ApplicationLoadBalancerEndpointOptionsDsl.() -> Unit
      = {}): ApplicationLoadBalancerEndpointOptions {
    val builder = ApplicationLoadBalancerEndpointOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnEipEndpoint(eip: CfnEIP, block: CfnEipEndpointDsl.() -> Unit = {}):
      CfnEipEndpoint {
    val builder = CfnEipEndpointDsl(eip)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnEipEndpointProps(block: CfnEipEndpointPropsDsl.() -> Unit = {}):
      CfnEipEndpointProps {
    val builder = CfnEipEndpointPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun instanceEndpoint(instance: IInstance, block: InstanceEndpointDsl.() -> Unit =
      {}): InstanceEndpoint {
    val builder = InstanceEndpointDsl(instance)
    builder.apply(block)
    return builder.build()
  }

  public inline fun instanceEndpointProps(block: InstanceEndpointPropsDsl.() -> Unit = {}):
      InstanceEndpointProps {
    val builder = InstanceEndpointPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun networkLoadBalancerEndpoint(loadBalancer: INetworkLoadBalancer,
      block: NetworkLoadBalancerEndpointDsl.() -> Unit = {}): NetworkLoadBalancerEndpoint {
    val builder = NetworkLoadBalancerEndpointDsl(loadBalancer)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun networkLoadBalancerEndpointProps(block: NetworkLoadBalancerEndpointPropsDsl.() -> Unit =
      {}): NetworkLoadBalancerEndpointProps {
    val builder = NetworkLoadBalancerEndpointPropsDsl()
    builder.apply(block)
    return builder.build()
  }
}
