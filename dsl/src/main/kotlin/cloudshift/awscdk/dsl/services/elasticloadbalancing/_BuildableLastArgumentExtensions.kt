@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.elasticloadbalancing

import kotlin.Unit
import software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancer
import software.amazon.awscdk.services.elasticloadbalancing.ListenerPort
import software.amazon.awscdk.services.elasticloadbalancing.LoadBalancer

public inline
    fun CfnLoadBalancer.setAccessLoggingPolicy(block: CfnLoadBalancerAccessLoggingPolicyPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnLoadBalancerAccessLoggingPolicyPropertyDsl()
  builder.apply(block)
  return setAccessLoggingPolicy(builder.build())
}

public inline
    fun CfnLoadBalancer.setConnectionDrainingPolicy(block: CfnLoadBalancerConnectionDrainingPolicyPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnLoadBalancerConnectionDrainingPolicyPropertyDsl()
  builder.apply(block)
  return setConnectionDrainingPolicy(builder.build())
}

public inline
    fun CfnLoadBalancer.setConnectionSettings(block: CfnLoadBalancerConnectionSettingsPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnLoadBalancerConnectionSettingsPropertyDsl()
  builder.apply(block)
  return setConnectionSettings(builder.build())
}

public inline
    fun CfnLoadBalancer.setHealthCheck(block: CfnLoadBalancerHealthCheckPropertyDsl.() -> Unit =
    {}) {
  val builder = CfnLoadBalancerHealthCheckPropertyDsl()
  builder.apply(block)
  return setHealthCheck(builder.build())
}

public inline fun LoadBalancer.addListener(block: LoadBalancerListenerDsl.() -> Unit = {}):
    ListenerPort {
  val builder = LoadBalancerListenerDsl()
  builder.apply(block)
  return addListener(builder.build())
}
