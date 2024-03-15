@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.elasticloadbalancingv2

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for adding new network targets to a listener.
 *
 * Example:
 *
 * ```
 * Vpc vpc;
 * AutoScalingGroup asg;
 * ISecurityGroup sg1;
 * ISecurityGroup sg2;
 * // Create the load balancer in a VPC. 'internetFacing' is 'false'
 * // by default, which creates an internal load balancer.
 * NetworkLoadBalancer lb = NetworkLoadBalancer.Builder.create(this, "LB")
 * .vpc(vpc)
 * .internetFacing(true)
 * .securityGroups(List.of(sg1))
 * .build();
 * lb.addSecurityGroup(sg2);
 * // Add a listener on a particular port.
 * NetworkListener listener = lb.addListener("Listener", BaseNetworkListenerProps.builder()
 * .port(443)
 * .build());
 * // Add targets on a particular port.
 * listener.addTargets("AppFleet", AddNetworkTargetsProps.builder()
 * .port(443)
 * .targets(List.of(asg))
 * .build());
 * ```
 */
public interface AddNetworkTargetsProps {
  /**
   * The amount of time for Elastic Load Balancing to wait before deregistering a target.
   *
   * The range is 0-3600 seconds.
   *
   * Default: Duration.minutes(5)
   */
  public fun deregistrationDelay(): Duration? =
      unwrap(this).getDeregistrationDelay()?.let(Duration::wrap)

  /**
   * Health check configuration.
   *
   * Default: - The default value for each property in this configuration varies depending on the
   * target.
   *
   * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#aws-resource-elasticloadbalancingv2-targetgroup-properties)
   */
  public fun healthCheck(): HealthCheck? = unwrap(this).getHealthCheck()?.let(HealthCheck::wrap)

  /**
   * The port on which the listener listens for requests.
   *
   * Default: Determined from protocol if known
   */
  public fun port(): Number

  /**
   * Indicates whether client IP preservation is enabled.
   *
   * Default: false if the target group type is IP address and the
   * target group protocol is TCP or TLS. Otherwise, true.
   */
  public fun preserveClientIp(): Boolean? = unwrap(this).getPreserveClientIp()

  /**
   * Protocol for target group, expects TCP, TLS, UDP, or TCP_UDP.
   *
   * Default: - inherits the protocol of the listener
   */
  public fun protocol(): Protocol? = unwrap(this).getProtocol()?.let(Protocol::wrap)

  /**
   * Indicates whether Proxy Protocol version 2 is enabled.
   *
   * Default: false
   */
  public fun proxyProtocolV2(): Boolean? = unwrap(this).getProxyProtocolV2()

  /**
   * The name of the target group.
   *
   * This name must be unique per region per account, can have a maximum of
   * 32 characters, must contain only alphanumeric characters or hyphens, and
   * must not begin or end with a hyphen.
   *
   * Default: Automatically generated
   */
  public fun targetGroupName(): String? = unwrap(this).getTargetGroupName()

  /**
   * The targets to add to this target group.
   *
   * Can be `Instance`, `IPAddress`, or any self-registering load balancing
   * target. If you use either `Instance` or `IPAddress` as targets, all
   * target must be of the same type.
   */
  public fun targets(): List<INetworkLoadBalancerTarget> =
      unwrap(this).getTargets()?.map(INetworkLoadBalancerTarget::wrap) ?: emptyList()

  /**
   * A builder for [AddNetworkTargetsProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param deregistrationDelay The amount of time for Elastic Load Balancing to wait before
     * deregistering a target.
     * The range is 0-3600 seconds.
     */
    public fun deregistrationDelay(deregistrationDelay: Duration)

    /**
     * @param healthCheck Health check configuration.
     */
    public fun healthCheck(healthCheck: HealthCheck)

    /**
     * @param healthCheck Health check configuration.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("010fcd39b9643a438c847e391bcd3db988b02e2fbdbc00a9c959553c55f573d4")
    public fun healthCheck(healthCheck: HealthCheck.Builder.() -> Unit)

    /**
     * @param port The port on which the listener listens for requests. 
     */
    public fun port(port: Number)

    /**
     * @param preserveClientIp Indicates whether client IP preservation is enabled.
     */
    public fun preserveClientIp(preserveClientIp: Boolean)

    /**
     * @param protocol Protocol for target group, expects TCP, TLS, UDP, or TCP_UDP.
     */
    public fun protocol(protocol: Protocol)

    /**
     * @param proxyProtocolV2 Indicates whether Proxy Protocol version 2 is enabled.
     */
    public fun proxyProtocolV2(proxyProtocolV2: Boolean)

    /**
     * @param targetGroupName The name of the target group.
     * This name must be unique per region per account, can have a maximum of
     * 32 characters, must contain only alphanumeric characters or hyphens, and
     * must not begin or end with a hyphen.
     */
    public fun targetGroupName(targetGroupName: String)

    /**
     * @param targets The targets to add to this target group.
     * Can be `Instance`, `IPAddress`, or any self-registering load balancing
     * target. If you use either `Instance` or `IPAddress` as targets, all
     * target must be of the same type.
     */
    public fun targets(targets: List<INetworkLoadBalancerTarget>)

    /**
     * @param targets The targets to add to this target group.
     * Can be `Instance`, `IPAddress`, or any self-registering load balancing
     * target. If you use either `Instance` or `IPAddress` as targets, all
     * target must be of the same type.
     */
    public fun targets(vararg targets: INetworkLoadBalancerTarget)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.elasticloadbalancingv2.AddNetworkTargetsProps.Builder =
        software.amazon.awscdk.services.elasticloadbalancingv2.AddNetworkTargetsProps.builder()

    /**
     * @param deregistrationDelay The amount of time for Elastic Load Balancing to wait before
     * deregistering a target.
     * The range is 0-3600 seconds.
     */
    override fun deregistrationDelay(deregistrationDelay: Duration) {
      cdkBuilder.deregistrationDelay(deregistrationDelay.let(Duration::unwrap))
    }

    /**
     * @param healthCheck Health check configuration.
     */
    override fun healthCheck(healthCheck: HealthCheck) {
      cdkBuilder.healthCheck(healthCheck.let(HealthCheck::unwrap))
    }

    /**
     * @param healthCheck Health check configuration.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("010fcd39b9643a438c847e391bcd3db988b02e2fbdbc00a9c959553c55f573d4")
    override fun healthCheck(healthCheck: HealthCheck.Builder.() -> Unit): Unit =
        healthCheck(HealthCheck(healthCheck))

    /**
     * @param port The port on which the listener listens for requests. 
     */
    override fun port(port: Number) {
      cdkBuilder.port(port)
    }

    /**
     * @param preserveClientIp Indicates whether client IP preservation is enabled.
     */
    override fun preserveClientIp(preserveClientIp: Boolean) {
      cdkBuilder.preserveClientIp(preserveClientIp)
    }

    /**
     * @param protocol Protocol for target group, expects TCP, TLS, UDP, or TCP_UDP.
     */
    override fun protocol(protocol: Protocol) {
      cdkBuilder.protocol(protocol.let(Protocol::unwrap))
    }

    /**
     * @param proxyProtocolV2 Indicates whether Proxy Protocol version 2 is enabled.
     */
    override fun proxyProtocolV2(proxyProtocolV2: Boolean) {
      cdkBuilder.proxyProtocolV2(proxyProtocolV2)
    }

    /**
     * @param targetGroupName The name of the target group.
     * This name must be unique per region per account, can have a maximum of
     * 32 characters, must contain only alphanumeric characters or hyphens, and
     * must not begin or end with a hyphen.
     */
    override fun targetGroupName(targetGroupName: String) {
      cdkBuilder.targetGroupName(targetGroupName)
    }

    /**
     * @param targets The targets to add to this target group.
     * Can be `Instance`, `IPAddress`, or any self-registering load balancing
     * target. If you use either `Instance` or `IPAddress` as targets, all
     * target must be of the same type.
     */
    override fun targets(targets: List<INetworkLoadBalancerTarget>) {
      cdkBuilder.targets(targets.map(INetworkLoadBalancerTarget::unwrap))
    }

    /**
     * @param targets The targets to add to this target group.
     * Can be `Instance`, `IPAddress`, or any self-registering load balancing
     * target. If you use either `Instance` or `IPAddress` as targets, all
     * target must be of the same type.
     */
    override fun targets(vararg targets: INetworkLoadBalancerTarget): Unit =
        targets(targets.toList())

    public fun build():
        software.amazon.awscdk.services.elasticloadbalancingv2.AddNetworkTargetsProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.elasticloadbalancingv2.AddNetworkTargetsProps,
  ) : CdkObject(cdkObject), AddNetworkTargetsProps {
    /**
     * The amount of time for Elastic Load Balancing to wait before deregistering a target.
     *
     * The range is 0-3600 seconds.
     *
     * Default: Duration.minutes(5)
     */
    override fun deregistrationDelay(): Duration? =
        unwrap(this).getDeregistrationDelay()?.let(Duration::wrap)

    /**
     * Health check configuration.
     *
     * Default: - The default value for each property in this configuration varies depending on the
     * target.
     *
     * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#aws-resource-elasticloadbalancingv2-targetgroup-properties)
     */
    override fun healthCheck(): HealthCheck? = unwrap(this).getHealthCheck()?.let(HealthCheck::wrap)

    /**
     * The port on which the listener listens for requests.
     *
     * Default: Determined from protocol if known
     */
    override fun port(): Number = unwrap(this).getPort()

    /**
     * Indicates whether client IP preservation is enabled.
     *
     * Default: false if the target group type is IP address and the
     * target group protocol is TCP or TLS. Otherwise, true.
     */
    override fun preserveClientIp(): Boolean? = unwrap(this).getPreserveClientIp()

    /**
     * Protocol for target group, expects TCP, TLS, UDP, or TCP_UDP.
     *
     * Default: - inherits the protocol of the listener
     */
    override fun protocol(): Protocol? = unwrap(this).getProtocol()?.let(Protocol::wrap)

    /**
     * Indicates whether Proxy Protocol version 2 is enabled.
     *
     * Default: false
     */
    override fun proxyProtocolV2(): Boolean? = unwrap(this).getProxyProtocolV2()

    /**
     * The name of the target group.
     *
     * This name must be unique per region per account, can have a maximum of
     * 32 characters, must contain only alphanumeric characters or hyphens, and
     * must not begin or end with a hyphen.
     *
     * Default: Automatically generated
     */
    override fun targetGroupName(): String? = unwrap(this).getTargetGroupName()

    /**
     * The targets to add to this target group.
     *
     * Can be `Instance`, `IPAddress`, or any self-registering load balancing
     * target. If you use either `Instance` or `IPAddress` as targets, all
     * target must be of the same type.
     */
    override fun targets(): List<INetworkLoadBalancerTarget> =
        unwrap(this).getTargets()?.map(INetworkLoadBalancerTarget::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): AddNetworkTargetsProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.AddNetworkTargetsProps):
        AddNetworkTargetsProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: AddNetworkTargetsProps):
        software.amazon.awscdk.services.elasticloadbalancingv2.AddNetworkTargetsProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.elasticloadbalancingv2.AddNetworkTargetsProps
  }
}
