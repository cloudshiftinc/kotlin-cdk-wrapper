@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.elasticloadbalancing

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancer
import software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancerProps
import software.amazon.awscdk.services.elasticloadbalancing.HealthCheck
import software.amazon.awscdk.services.elasticloadbalancing.LoadBalancer
import software.amazon.awscdk.services.elasticloadbalancing.LoadBalancerListener
import software.amazon.awscdk.services.elasticloadbalancing.LoadBalancerProps
import software.constructs.Construct

public object elasticloadbalancing {
  public inline fun cfnLoadBalancer(
    scope: Construct,
    id: String,
    block: CfnLoadBalancerDsl.() -> Unit = {},
  ): CfnLoadBalancer {
    val builder = CfnLoadBalancerDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnLoadBalancerAccessLoggingPolicyProperty(block: CfnLoadBalancerAccessLoggingPolicyPropertyDsl.() -> Unit
      = {}): CfnLoadBalancer.AccessLoggingPolicyProperty {
    val builder = CfnLoadBalancerAccessLoggingPolicyPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnLoadBalancerAppCookieStickinessPolicyProperty(block: CfnLoadBalancerAppCookieStickinessPolicyPropertyDsl.() -> Unit
      = {}): CfnLoadBalancer.AppCookieStickinessPolicyProperty {
    val builder = CfnLoadBalancerAppCookieStickinessPolicyPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnLoadBalancerConnectionDrainingPolicyProperty(block: CfnLoadBalancerConnectionDrainingPolicyPropertyDsl.() -> Unit
      = {}): CfnLoadBalancer.ConnectionDrainingPolicyProperty {
    val builder = CfnLoadBalancerConnectionDrainingPolicyPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnLoadBalancerConnectionSettingsProperty(block: CfnLoadBalancerConnectionSettingsPropertyDsl.() -> Unit
      = {}): CfnLoadBalancer.ConnectionSettingsProperty {
    val builder = CfnLoadBalancerConnectionSettingsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnLoadBalancerHealthCheckProperty(block: CfnLoadBalancerHealthCheckPropertyDsl.() -> Unit
      = {}): CfnLoadBalancer.HealthCheckProperty {
    val builder = CfnLoadBalancerHealthCheckPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnLoadBalancerLBCookieStickinessPolicyProperty(block: CfnLoadBalancerLBCookieStickinessPolicyPropertyDsl.() -> Unit
      = {}): CfnLoadBalancer.LBCookieStickinessPolicyProperty {
    val builder = CfnLoadBalancerLBCookieStickinessPolicyPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnLoadBalancerListenersProperty(block: CfnLoadBalancerListenersPropertyDsl.() -> Unit =
      {}): CfnLoadBalancer.ListenersProperty {
    val builder = CfnLoadBalancerListenersPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnLoadBalancerPoliciesProperty(block: CfnLoadBalancerPoliciesPropertyDsl.() -> Unit =
      {}): CfnLoadBalancer.PoliciesProperty {
    val builder = CfnLoadBalancerPoliciesPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnLoadBalancerProps(block: CfnLoadBalancerPropsDsl.() -> Unit = {}):
      CfnLoadBalancerProps {
    val builder = CfnLoadBalancerPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun healthCheck(block: HealthCheckDsl.() -> Unit = {}): HealthCheck {
    val builder = HealthCheckDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun loadBalancer(
    scope: Construct,
    id: String,
    block: LoadBalancerDsl.() -> Unit = {},
  ): LoadBalancer {
    val builder = LoadBalancerDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun loadBalancerListener(block: LoadBalancerListenerDsl.() -> Unit = {}):
      LoadBalancerListener {
    val builder = LoadBalancerListenerDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun loadBalancerProps(block: LoadBalancerPropsDsl.() -> Unit = {}):
      LoadBalancerProps {
    val builder = LoadBalancerPropsDsl()
    builder.apply(block)
    return builder.build()
  }
}
