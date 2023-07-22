@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.elasticloadbalancingv2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.elasticloadbalancingv2.AddNetworkTargetsProps
import software.amazon.awscdk.services.elasticloadbalancingv2.HealthCheck
import software.amazon.awscdk.services.elasticloadbalancingv2.INetworkLoadBalancerTarget
import software.amazon.awscdk.services.elasticloadbalancingv2.Protocol

/**
 * Properties for adding new network targets to a listener.
 *
 * Example:
 *
 * ```
 * import software.amazon.awscdk.services.apigatewayv2.integrations.alpha.HttpNlbIntegration;
 * Vpc vpc = new Vpc(this, "VPC");
 * NetworkLoadBalancer lb = NetworkLoadBalancer.Builder.create(this, "lb").vpc(vpc).build();
 * NetworkListener listener = lb.addListener("listener",
 * BaseNetworkListenerProps.builder().port(80).build());
 * listener.addTargets("target", AddNetworkTargetsProps.builder()
 * .port(80)
 * .build());
 * HttpApi httpEndpoint = HttpApi.Builder.create(this, "HttpProxyPrivateApi")
 * .defaultIntegration(new HttpNlbIntegration("DefaultIntegration", listener))
 * .build();
 * ```
 */
@CdkDslMarker
public class AddNetworkTargetsPropsDsl {
  private val cdkBuilder: AddNetworkTargetsProps.Builder = AddNetworkTargetsProps.builder()

  private val _targets: MutableList<INetworkLoadBalancerTarget> = mutableListOf()

  /**
   * @param deregistrationDelay The amount of time for Elastic Load Balancing to wait before
   * deregistering a target.
   * The range is 0-3600 seconds.
   */
  public fun deregistrationDelay(deregistrationDelay: Duration) {
    cdkBuilder.deregistrationDelay(deregistrationDelay)
  }

  /**
   * @param healthCheck Health check configuration.
   */
  public fun healthCheck(healthCheck: HealthCheckDsl.() -> Unit = {}) {
    val builder = HealthCheckDsl()
    builder.apply(healthCheck)
    cdkBuilder.healthCheck(builder.build())
  }

  /**
   * @param healthCheck Health check configuration.
   */
  public fun healthCheck(healthCheck: HealthCheck) {
    cdkBuilder.healthCheck(healthCheck)
  }

  /**
   * @param port The port on which the listener listens for requests. 
   */
  public fun port(port: Number) {
    cdkBuilder.port(port)
  }

  /**
   * @param preserveClientIp Indicates whether client IP preservation is enabled.
   */
  public fun preserveClientIp(preserveClientIp: Boolean) {
    cdkBuilder.preserveClientIp(preserveClientIp)
  }

  /**
   * @param protocol Protocol for target group, expects TCP, TLS, UDP, or TCP_UDP.
   */
  public fun protocol(protocol: Protocol) {
    cdkBuilder.protocol(protocol)
  }

  /**
   * @param proxyProtocolV2 Indicates whether Proxy Protocol version 2 is enabled.
   */
  public fun proxyProtocolV2(proxyProtocolV2: Boolean) {
    cdkBuilder.proxyProtocolV2(proxyProtocolV2)
  }

  /**
   * @param targetGroupName The name of the target group.
   * This name must be unique per region per account, can have a maximum of
   * 32 characters, must contain only alphanumeric characters or hyphens, and
   * must not begin or end with a hyphen.
   */
  public fun targetGroupName(targetGroupName: String) {
    cdkBuilder.targetGroupName(targetGroupName)
  }

  /**
   * @param targets The targets to add to this target group.
   * Can be `Instance`, `IPAddress`, or any self-registering load balancing
   * target. If you use either `Instance` or `IPAddress` as targets, all
   * target must be of the same type.
   */
  public fun targets(vararg targets: INetworkLoadBalancerTarget) {
    _targets.addAll(listOf(*targets))
  }

  /**
   * @param targets The targets to add to this target group.
   * Can be `Instance`, `IPAddress`, or any self-registering load balancing
   * target. If you use either `Instance` or `IPAddress` as targets, all
   * target must be of the same type.
   */
  public fun targets(targets: Collection<INetworkLoadBalancerTarget>) {
    _targets.addAll(targets)
  }

  public fun build(): AddNetworkTargetsProps {
    if(_targets.isNotEmpty()) cdkBuilder.targets(_targets)
    return cdkBuilder.build()
  }
}
