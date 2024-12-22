@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.elasticloadbalancingv2

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.ec2.IVpc
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for a new Network Target Group.
 *
 * Example:
 *
 * ```
 * Vpc vpc;
 * ApplicationTargetGroup ipv4ApplicationTargetGroup = ApplicationTargetGroup.Builder.create(this,
 * "IPv4ApplicationTargetGroup")
 * .vpc(vpc)
 * .port(80)
 * .targetType(TargetType.INSTANCE)
 * .ipAddressType(TargetGroupIpAddressType.IPV4)
 * .build();
 * ApplicationTargetGroup ipv6ApplicationTargetGroup = ApplicationTargetGroup.Builder.create(this,
 * "Ipv6ApplicationTargetGroup")
 * .vpc(vpc)
 * .port(80)
 * .targetType(TargetType.INSTANCE)
 * .ipAddressType(TargetGroupIpAddressType.IPV6)
 * .build();
 * NetworkTargetGroup ipv4NetworkTargetGroup = NetworkTargetGroup.Builder.create(this,
 * "IPv4NetworkTargetGroup")
 * .vpc(vpc)
 * .port(80)
 * .targetType(TargetType.INSTANCE)
 * .ipAddressType(TargetGroupIpAddressType.IPV4)
 * .build();
 * NetworkTargetGroup ipv6NetworkTargetGroup = NetworkTargetGroup.Builder.create(this,
 * "Ipv6NetworkTargetGroup")
 * .vpc(vpc)
 * .port(80)
 * .targetType(TargetType.INSTANCE)
 * .ipAddressType(TargetGroupIpAddressType.IPV6)
 * .build();
 * ```
 */
public interface NetworkTargetGroupProps : BaseTargetGroupProps {
  /**
   * Indicates whether the load balancer terminates connections at the end of the deregistration
   * timeout.
   *
   * Default: false
   */
  public fun connectionTermination(): Boolean? = unwrap(this).getConnectionTermination()

  /**
   * The port on which the target receives traffic.
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
   * Default: - TCP
   */
  public fun protocol(): Protocol? = unwrap(this).getProtocol()?.let(Protocol::wrap)

  /**
   * Indicates whether Proxy Protocol version 2 is enabled.
   *
   * Default: false
   */
  public fun proxyProtocolV2(): Boolean? = unwrap(this).getProxyProtocolV2()

  /**
   * The targets to add to this target group.
   *
   * Can be `Instance`, `IPAddress`, or any self-registering load balancing
   * target. If you use either `Instance` or `IPAddress` as targets, all
   * target must be of the same type.
   *
   * Default: - No targets.
   */
  public fun targets(): List<INetworkLoadBalancerTarget> =
      unwrap(this).getTargets()?.map(INetworkLoadBalancerTarget::wrap) ?: emptyList()

  /**
   * A builder for [NetworkTargetGroupProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param connectionTermination Indicates whether the load balancer terminates connections at
     * the end of the deregistration timeout.
     */
    public fun connectionTermination(connectionTermination: Boolean)

    /**
     * @param crossZoneEnabled Indicates whether cross zone load balancing is enabled.
     */
    public fun crossZoneEnabled(crossZoneEnabled: Boolean)

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
    @JvmName("bb26c693e7afc0f4749d01b16763279b266d8c27ef88a19c2ee9bcf100330327")
    public fun healthCheck(healthCheck: HealthCheck.Builder.() -> Unit)

    /**
     * @param ipAddressType The type of IP addresses of the targets registered with the target
     * group.
     */
    public fun ipAddressType(ipAddressType: TargetGroupIpAddressType)

    /**
     * @param port The port on which the target receives traffic. 
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
     * @param targetType The type of targets registered to this TargetGroup, either IP or Instance.
     * All targets registered into the group must be of this type. If you
     * register targets to the TargetGroup in the CDK app, the TargetType is
     * determined automatically.
     */
    public fun targetType(targetType: TargetType)

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

    /**
     * @param vpc The virtual private cloud (VPC).
     * only if `TargetType` is `Ip` or `InstanceId`
     */
    public fun vpc(vpc: IVpc)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.elasticloadbalancingv2.NetworkTargetGroupProps.Builder =
        software.amazon.awscdk.services.elasticloadbalancingv2.NetworkTargetGroupProps.builder()

    /**
     * @param connectionTermination Indicates whether the load balancer terminates connections at
     * the end of the deregistration timeout.
     */
    override fun connectionTermination(connectionTermination: Boolean) {
      cdkBuilder.connectionTermination(connectionTermination)
    }

    /**
     * @param crossZoneEnabled Indicates whether cross zone load balancing is enabled.
     */
    override fun crossZoneEnabled(crossZoneEnabled: Boolean) {
      cdkBuilder.crossZoneEnabled(crossZoneEnabled)
    }

    /**
     * @param deregistrationDelay The amount of time for Elastic Load Balancing to wait before
     * deregistering a target.
     * The range is 0-3600 seconds.
     */
    override fun deregistrationDelay(deregistrationDelay: Duration) {
      cdkBuilder.deregistrationDelay(deregistrationDelay.let(Duration.Companion::unwrap))
    }

    /**
     * @param healthCheck Health check configuration.
     */
    override fun healthCheck(healthCheck: HealthCheck) {
      cdkBuilder.healthCheck(healthCheck.let(HealthCheck.Companion::unwrap))
    }

    /**
     * @param healthCheck Health check configuration.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("bb26c693e7afc0f4749d01b16763279b266d8c27ef88a19c2ee9bcf100330327")
    override fun healthCheck(healthCheck: HealthCheck.Builder.() -> Unit): Unit =
        healthCheck(HealthCheck(healthCheck))

    /**
     * @param ipAddressType The type of IP addresses of the targets registered with the target
     * group.
     */
    override fun ipAddressType(ipAddressType: TargetGroupIpAddressType) {
      cdkBuilder.ipAddressType(ipAddressType.let(TargetGroupIpAddressType.Companion::unwrap))
    }

    /**
     * @param port The port on which the target receives traffic. 
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
      cdkBuilder.protocol(protocol.let(Protocol.Companion::unwrap))
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
     * @param targetType The type of targets registered to this TargetGroup, either IP or Instance.
     * All targets registered into the group must be of this type. If you
     * register targets to the TargetGroup in the CDK app, the TargetType is
     * determined automatically.
     */
    override fun targetType(targetType: TargetType) {
      cdkBuilder.targetType(targetType.let(TargetType.Companion::unwrap))
    }

    /**
     * @param targets The targets to add to this target group.
     * Can be `Instance`, `IPAddress`, or any self-registering load balancing
     * target. If you use either `Instance` or `IPAddress` as targets, all
     * target must be of the same type.
     */
    override fun targets(targets: List<INetworkLoadBalancerTarget>) {
      cdkBuilder.targets(targets.map(INetworkLoadBalancerTarget.Companion::unwrap))
    }

    /**
     * @param targets The targets to add to this target group.
     * Can be `Instance`, `IPAddress`, or any self-registering load balancing
     * target. If you use either `Instance` or `IPAddress` as targets, all
     * target must be of the same type.
     */
    override fun targets(vararg targets: INetworkLoadBalancerTarget): Unit =
        targets(targets.toList())

    /**
     * @param vpc The virtual private cloud (VPC).
     * only if `TargetType` is `Ip` or `InstanceId`
     */
    override fun vpc(vpc: IVpc) {
      cdkBuilder.vpc(vpc.let(IVpc.Companion::unwrap))
    }

    public fun build():
        software.amazon.awscdk.services.elasticloadbalancingv2.NetworkTargetGroupProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.NetworkTargetGroupProps,
  ) : CdkObject(cdkObject),
      NetworkTargetGroupProps {
    /**
     * Indicates whether the load balancer terminates connections at the end of the deregistration
     * timeout.
     *
     * Default: false
     */
    override fun connectionTermination(): Boolean? = unwrap(this).getConnectionTermination()

    /**
     * Indicates whether cross zone load balancing is enabled.
     *
     * Default: - use load balancer configuration
     *
     * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-targetgroup-targetgroupattribute.html)
     */
    override fun crossZoneEnabled(): Boolean? = unwrap(this).getCrossZoneEnabled()

    /**
     * The amount of time for Elastic Load Balancing to wait before deregistering a target.
     *
     * The range is 0-3600 seconds.
     *
     * Default: 300
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
     * The type of IP addresses of the targets registered with the target group.
     *
     * Default: undefined - ELB defaults to IPv4
     */
    override fun ipAddressType(): TargetGroupIpAddressType? =
        unwrap(this).getIpAddressType()?.let(TargetGroupIpAddressType::wrap)

    /**
     * The port on which the target receives traffic.
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
     * Default: - TCP
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
     * Default: - Automatically generated.
     */
    override fun targetGroupName(): String? = unwrap(this).getTargetGroupName()

    /**
     * The type of targets registered to this TargetGroup, either IP or Instance.
     *
     * All targets registered into the group must be of this type. If you
     * register targets to the TargetGroup in the CDK app, the TargetType is
     * determined automatically.
     *
     * Default: - Determined automatically.
     */
    override fun targetType(): TargetType? = unwrap(this).getTargetType()?.let(TargetType::wrap)

    /**
     * The targets to add to this target group.
     *
     * Can be `Instance`, `IPAddress`, or any self-registering load balancing
     * target. If you use either `Instance` or `IPAddress` as targets, all
     * target must be of the same type.
     *
     * Default: - No targets.
     */
    override fun targets(): List<INetworkLoadBalancerTarget> =
        unwrap(this).getTargets()?.map(INetworkLoadBalancerTarget::wrap) ?: emptyList()

    /**
     * The virtual private cloud (VPC).
     *
     * only if `TargetType` is `Ip` or `InstanceId`
     *
     * Default: - undefined
     */
    override fun vpc(): IVpc? = unwrap(this).getVpc()?.let(IVpc::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): NetworkTargetGroupProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.NetworkTargetGroupProps):
        NetworkTargetGroupProps = CdkObjectWrappers.wrap(cdkObject) as? NetworkTargetGroupProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: NetworkTargetGroupProps):
        software.amazon.awscdk.services.elasticloadbalancingv2.NetworkTargetGroupProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.elasticloadbalancingv2.NetworkTargetGroupProps
  }
}
