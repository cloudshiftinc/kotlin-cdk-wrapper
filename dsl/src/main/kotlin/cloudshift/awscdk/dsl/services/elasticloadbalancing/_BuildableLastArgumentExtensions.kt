@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.elasticloadbalancing

import kotlin.Unit
import software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancer
import software.amazon.awscdk.services.elasticloadbalancing.ListenerPort
import software.amazon.awscdk.services.elasticloadbalancing.LoadBalancer

/**
 * Information about where and how access logs are stored for the load balancer.
 */
public inline
    fun CfnLoadBalancer.setAccessLoggingPolicy(block: CfnLoadBalancerAccessLoggingPolicyPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnLoadBalancerAccessLoggingPolicyPropertyDsl()
  builder.apply(block)
  return setAccessLoggingPolicy(builder.build())
}

/**
 * If enabled, the load balancer allows existing requests to complete before the load balancer
 * shifts traffic away from a deregistered or unhealthy instance.
 */
public inline
    fun CfnLoadBalancer.setConnectionDrainingPolicy(block: CfnLoadBalancerConnectionDrainingPolicyPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnLoadBalancerConnectionDrainingPolicyPropertyDsl()
  builder.apply(block)
  return setConnectionDrainingPolicy(builder.build())
}

/**
 * If enabled, the load balancer allows the connections to remain idle (no data is sent over the
 * connection) for the specified duration.
 */
public inline
    fun CfnLoadBalancer.setConnectionSettings(block: CfnLoadBalancerConnectionSettingsPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnLoadBalancerConnectionSettingsPropertyDsl()
  builder.apply(block)
  return setConnectionSettings(builder.build())
}

/**
 * The health check settings to use when evaluating the health of your EC2 instances.
 */
public inline
    fun CfnLoadBalancer.setHealthCheck(block: CfnLoadBalancerHealthCheckPropertyDsl.() -> Unit =
    {}) {
  val builder = CfnLoadBalancerHealthCheckPropertyDsl()
  builder.apply(block)
  return setHealthCheck(builder.build())
}

/**
 * Add a backend to the load balancer.
 *
 * @return A ListenerPort object that controls connections to the listener port
 * @param listener 
 */
public inline fun LoadBalancer.addListener(block: LoadBalancerListenerDsl.() -> Unit = {}):
    ListenerPort {
  val builder = LoadBalancerListenerDsl()
  builder.apply(block)
  return addListener(builder.build())
}
