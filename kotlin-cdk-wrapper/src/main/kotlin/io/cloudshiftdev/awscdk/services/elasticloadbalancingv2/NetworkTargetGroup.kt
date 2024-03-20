@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.elasticloadbalancingv2

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.cloudwatch.Metric
import io.cloudshiftdev.awscdk.services.cloudwatch.MetricOptions
import io.cloudshiftdev.awscdk.services.ec2.IVpc
import kotlin.Boolean
import kotlin.Deprecated
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Define a Network Target Group.
 *
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.services.elasticloadbalancing.*;
 * import io.cloudshiftdev.awscdk.services.elasticloadbalancingv2.*;
 * LoadBalancer clb;
 * ApplicationLoadBalancer alb;
 * NetworkLoadBalancer nlb;
 * ApplicationListener albListener = alb.addListener("ALBListener",
 * BaseApplicationListenerProps.builder().port(80).build());
 * ApplicationTargetGroup albTargetGroup = albListener.addTargets("ALBFleet",
 * AddApplicationTargetsProps.builder().port(80).build());
 * NetworkListener nlbListener = nlb.addListener("NLBListener",
 * BaseNetworkListenerProps.builder().port(80).build());
 * NetworkTargetGroup nlbTargetGroup = nlbListener.addTargets("NLBFleet",
 * AddNetworkTargetsProps.builder().port(80).build());
 * ServerDeploymentGroup deploymentGroup = ServerDeploymentGroup.Builder.create(this,
 * "DeploymentGroup")
 * .loadBalancers(List.of(LoadBalancer.classic(clb), LoadBalancer.application(albTargetGroup),
 * LoadBalancer.network(nlbTargetGroup)))
 * .build();
 * ```
 */
public open class NetworkTargetGroup internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.elasticloadbalancingv2.NetworkTargetGroup,
) : TargetGroupBase(cdkObject), INetworkTargetGroup {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: NetworkTargetGroupProps,
  ) :
      this(software.amazon.awscdk.services.elasticloadbalancingv2.NetworkTargetGroup(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(NetworkTargetGroupProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: NetworkTargetGroupProps.Builder.() -> Unit,
  ) : this(scope, id, NetworkTargetGroupProps(props)
  )

  /**
   * Add a load balancing target to this target group.
   *
   * @param targets 
   */
  public override fun addTarget(vararg targets: INetworkLoadBalancerTarget) {
    unwrap(this).addTarget(*targets.map(INetworkLoadBalancerTarget::unwrap).toTypedArray())
  }

  /**
   * Full name of first load balancer.
   */
  public override fun firstLoadBalancerFullName(): String =
      unwrap(this).getFirstLoadBalancerFullName()

  /**
   * (deprecated) The number of targets that are considered healthy.
   *
   * Default: Average over 5 minutes
   *
   * @deprecated Use `NetworkTargetGroup.metrics.healthyHostCount` instead
   * @param props
   */
  @Deprecated(message = "deprecated in CDK")
  public open fun metricHealthyHostCount(): Metric =
      unwrap(this).metricHealthyHostCount().let(Metric::wrap)

  /**
   * (deprecated) The number of targets that are considered healthy.
   *
   * Default: Average over 5 minutes
   *
   * @deprecated Use `NetworkTargetGroup.metrics.healthyHostCount` instead
   * @param props
   */
  @Deprecated(message = "deprecated in CDK")
  public open fun metricHealthyHostCount(props: MetricOptions): Metric =
      unwrap(this).metricHealthyHostCount(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  /**
   * (deprecated) The number of targets that are considered healthy.
   *
   * Default: Average over 5 minutes
   *
   * @deprecated Use `NetworkTargetGroup.metrics.healthyHostCount` instead
   * @param props
   */
  @Deprecated(message = "deprecated in CDK")
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("cd2021699bf4459818ab9875d89c7bd44524bb3ba873974adc6684a32214f8fc")
  public open fun metricHealthyHostCount(props: MetricOptions.Builder.() -> Unit): Metric =
      metricHealthyHostCount(MetricOptions(props))

  /**
   * (deprecated) The number of targets that are considered unhealthy.
   *
   * Default: Average over 5 minutes
   *
   * @deprecated Use `NetworkTargetGroup.metrics.healthyHostCount` instead
   * @param props
   */
  @Deprecated(message = "deprecated in CDK")
  public open fun metricUnHealthyHostCount(): Metric =
      unwrap(this).metricUnHealthyHostCount().let(Metric::wrap)

  /**
   * (deprecated) The number of targets that are considered unhealthy.
   *
   * Default: Average over 5 minutes
   *
   * @deprecated Use `NetworkTargetGroup.metrics.healthyHostCount` instead
   * @param props
   */
  @Deprecated(message = "deprecated in CDK")
  public open fun metricUnHealthyHostCount(props: MetricOptions): Metric =
      unwrap(this).metricUnHealthyHostCount(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  /**
   * (deprecated) The number of targets that are considered unhealthy.
   *
   * Default: Average over 5 minutes
   *
   * @deprecated Use `NetworkTargetGroup.metrics.healthyHostCount` instead
   * @param props
   */
  @Deprecated(message = "deprecated in CDK")
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("037d6ab549bb296c17832dd568d7edc5f354592355d1c8246d6c0ed0062c2232")
  public open fun metricUnHealthyHostCount(props: MetricOptions.Builder.() -> Unit): Metric =
      metricUnHealthyHostCount(MetricOptions(props))

  /**
   * All metrics available for this target group.
   */
  public override fun metrics(): INetworkTargetGroupMetrics =
      unwrap(this).getMetrics().let(INetworkTargetGroupMetrics::wrap)

  /**
   * Register a listener that is load balancing to this target group.
   *
   * Don't call this directly. It will be called by listeners.
   *
   * @param listener 
   */
  public override fun registerListener(listener: INetworkListener) {
    unwrap(this).registerListener(listener.let(INetworkListener::unwrap))
  }

  /**
   * A fluent builder for
   * [io.cloudshiftdev.awscdk.services.elasticloadbalancingv2.NetworkTargetGroup].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Indicates whether the load balancer terminates connections at the end of the deregistration
     * timeout.
     *
     * Default: false
     *
     * @param connectionTermination Indicates whether the load balancer terminates connections at
     * the end of the deregistration timeout. 
     */
    public fun connectionTermination(connectionTermination: Boolean)

    /**
     * The amount of time for Elastic Load Balancing to wait before deregistering a target.
     *
     * The range is 0-3600 seconds.
     *
     * Default: 300
     *
     * @param deregistrationDelay The amount of time for Elastic Load Balancing to wait before
     * deregistering a target. 
     */
    public fun deregistrationDelay(deregistrationDelay: Duration)

    /**
     * Health check configuration.
     *
     * Default: - The default value for each property in this configuration varies depending on the
     * target.
     *
     * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#aws-resource-elasticloadbalancingv2-targetgroup-properties)
     * @param healthCheck Health check configuration. 
     */
    public fun healthCheck(healthCheck: HealthCheck)

    /**
     * Health check configuration.
     *
     * Default: - The default value for each property in this configuration varies depending on the
     * target.
     *
     * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#aws-resource-elasticloadbalancingv2-targetgroup-properties)
     * @param healthCheck Health check configuration. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9c7ee6a16ec18311c4c64074c4eac245e90c71b6535cdddc06564288488e16b5")
    public fun healthCheck(healthCheck: HealthCheck.Builder.() -> Unit)

    /**
     * The port on which the target receives traffic.
     *
     * @param port The port on which the target receives traffic. 
     */
    public fun port(port: Number)

    /**
     * Indicates whether client IP preservation is enabled.
     *
     * Default: false if the target group type is IP address and the
     * target group protocol is TCP or TLS. Otherwise, true.
     *
     * @param preserveClientIp Indicates whether client IP preservation is enabled. 
     */
    public fun preserveClientIp(preserveClientIp: Boolean)

    /**
     * Protocol for target group, expects TCP, TLS, UDP, or TCP_UDP.
     *
     * Default: - TCP
     *
     * @param protocol Protocol for target group, expects TCP, TLS, UDP, or TCP_UDP. 
     */
    public fun protocol(protocol: Protocol)

    /**
     * Indicates whether Proxy Protocol version 2 is enabled.
     *
     * Default: false
     *
     * @param proxyProtocolV2 Indicates whether Proxy Protocol version 2 is enabled. 
     */
    public fun proxyProtocolV2(proxyProtocolV2: Boolean)

    /**
     * The name of the target group.
     *
     * This name must be unique per region per account, can have a maximum of
     * 32 characters, must contain only alphanumeric characters or hyphens, and
     * must not begin or end with a hyphen.
     *
     * Default: - Automatically generated.
     *
     * @param targetGroupName The name of the target group. 
     */
    public fun targetGroupName(targetGroupName: String)

    /**
     * The type of targets registered to this TargetGroup, either IP or Instance.
     *
     * All targets registered into the group must be of this type. If you
     * register targets to the TargetGroup in the CDK app, the TargetType is
     * determined automatically.
     *
     * Default: - Determined automatically.
     *
     * @param targetType The type of targets registered to this TargetGroup, either IP or Instance. 
     */
    public fun targetType(targetType: TargetType)

    /**
     * The targets to add to this target group.
     *
     * Can be `Instance`, `IPAddress`, or any self-registering load balancing
     * target. If you use either `Instance` or `IPAddress` as targets, all
     * target must be of the same type.
     *
     * Default: - No targets.
     *
     * @param targets The targets to add to this target group. 
     */
    public fun targets(targets: List<INetworkLoadBalancerTarget>)

    /**
     * The targets to add to this target group.
     *
     * Can be `Instance`, `IPAddress`, or any self-registering load balancing
     * target. If you use either `Instance` or `IPAddress` as targets, all
     * target must be of the same type.
     *
     * Default: - No targets.
     *
     * @param targets The targets to add to this target group. 
     */
    public fun targets(vararg targets: INetworkLoadBalancerTarget)

    /**
     * The virtual private cloud (VPC).
     *
     * only if `TargetType` is `Ip` or `InstanceId`
     *
     * Default: - undefined
     *
     * @param vpc The virtual private cloud (VPC). 
     */
    public fun vpc(vpc: IVpc)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.elasticloadbalancingv2.NetworkTargetGroup.Builder =
        software.amazon.awscdk.services.elasticloadbalancingv2.NetworkTargetGroup.Builder.create(scope,
        id)

    /**
     * Indicates whether the load balancer terminates connections at the end of the deregistration
     * timeout.
     *
     * Default: false
     *
     * @param connectionTermination Indicates whether the load balancer terminates connections at
     * the end of the deregistration timeout. 
     */
    override fun connectionTermination(connectionTermination: Boolean) {
      cdkBuilder.connectionTermination(connectionTermination)
    }

    /**
     * The amount of time for Elastic Load Balancing to wait before deregistering a target.
     *
     * The range is 0-3600 seconds.
     *
     * Default: 300
     *
     * @param deregistrationDelay The amount of time for Elastic Load Balancing to wait before
     * deregistering a target. 
     */
    override fun deregistrationDelay(deregistrationDelay: Duration) {
      cdkBuilder.deregistrationDelay(deregistrationDelay.let(Duration::unwrap))
    }

    /**
     * Health check configuration.
     *
     * Default: - The default value for each property in this configuration varies depending on the
     * target.
     *
     * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#aws-resource-elasticloadbalancingv2-targetgroup-properties)
     * @param healthCheck Health check configuration. 
     */
    override fun healthCheck(healthCheck: HealthCheck) {
      cdkBuilder.healthCheck(healthCheck.let(HealthCheck::unwrap))
    }

    /**
     * Health check configuration.
     *
     * Default: - The default value for each property in this configuration varies depending on the
     * target.
     *
     * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#aws-resource-elasticloadbalancingv2-targetgroup-properties)
     * @param healthCheck Health check configuration. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9c7ee6a16ec18311c4c64074c4eac245e90c71b6535cdddc06564288488e16b5")
    override fun healthCheck(healthCheck: HealthCheck.Builder.() -> Unit): Unit =
        healthCheck(HealthCheck(healthCheck))

    /**
     * The port on which the target receives traffic.
     *
     * @param port The port on which the target receives traffic. 
     */
    override fun port(port: Number) {
      cdkBuilder.port(port)
    }

    /**
     * Indicates whether client IP preservation is enabled.
     *
     * Default: false if the target group type is IP address and the
     * target group protocol is TCP or TLS. Otherwise, true.
     *
     * @param preserveClientIp Indicates whether client IP preservation is enabled. 
     */
    override fun preserveClientIp(preserveClientIp: Boolean) {
      cdkBuilder.preserveClientIp(preserveClientIp)
    }

    /**
     * Protocol for target group, expects TCP, TLS, UDP, or TCP_UDP.
     *
     * Default: - TCP
     *
     * @param protocol Protocol for target group, expects TCP, TLS, UDP, or TCP_UDP. 
     */
    override fun protocol(protocol: Protocol) {
      cdkBuilder.protocol(protocol.let(Protocol::unwrap))
    }

    /**
     * Indicates whether Proxy Protocol version 2 is enabled.
     *
     * Default: false
     *
     * @param proxyProtocolV2 Indicates whether Proxy Protocol version 2 is enabled. 
     */
    override fun proxyProtocolV2(proxyProtocolV2: Boolean) {
      cdkBuilder.proxyProtocolV2(proxyProtocolV2)
    }

    /**
     * The name of the target group.
     *
     * This name must be unique per region per account, can have a maximum of
     * 32 characters, must contain only alphanumeric characters or hyphens, and
     * must not begin or end with a hyphen.
     *
     * Default: - Automatically generated.
     *
     * @param targetGroupName The name of the target group. 
     */
    override fun targetGroupName(targetGroupName: String) {
      cdkBuilder.targetGroupName(targetGroupName)
    }

    /**
     * The type of targets registered to this TargetGroup, either IP or Instance.
     *
     * All targets registered into the group must be of this type. If you
     * register targets to the TargetGroup in the CDK app, the TargetType is
     * determined automatically.
     *
     * Default: - Determined automatically.
     *
     * @param targetType The type of targets registered to this TargetGroup, either IP or Instance. 
     */
    override fun targetType(targetType: TargetType) {
      cdkBuilder.targetType(targetType.let(TargetType::unwrap))
    }

    /**
     * The targets to add to this target group.
     *
     * Can be `Instance`, `IPAddress`, or any self-registering load balancing
     * target. If you use either `Instance` or `IPAddress` as targets, all
     * target must be of the same type.
     *
     * Default: - No targets.
     *
     * @param targets The targets to add to this target group. 
     */
    override fun targets(targets: List<INetworkLoadBalancerTarget>) {
      cdkBuilder.targets(targets.map(INetworkLoadBalancerTarget::unwrap))
    }

    /**
     * The targets to add to this target group.
     *
     * Can be `Instance`, `IPAddress`, or any self-registering load balancing
     * target. If you use either `Instance` or `IPAddress` as targets, all
     * target must be of the same type.
     *
     * Default: - No targets.
     *
     * @param targets The targets to add to this target group. 
     */
    override fun targets(vararg targets: INetworkLoadBalancerTarget): Unit =
        targets(targets.toList())

    /**
     * The virtual private cloud (VPC).
     *
     * only if `TargetType` is `Ip` or `InstanceId`
     *
     * Default: - undefined
     *
     * @param vpc The virtual private cloud (VPC). 
     */
    override fun vpc(vpc: IVpc) {
      cdkBuilder.vpc(vpc.let(IVpc::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.elasticloadbalancingv2.NetworkTargetGroup =
        cdkBuilder.build()
  }

  public companion object {
    public fun fromTargetGroupAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: TargetGroupAttributes,
    ): INetworkTargetGroup =
        software.amazon.awscdk.services.elasticloadbalancingv2.NetworkTargetGroup.fromTargetGroupAttributes(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, attrs.let(TargetGroupAttributes::unwrap)).let(INetworkTargetGroup::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9e8569f93dff0c1e3a15c44bddcebbe3a3c3a3ab105f2a53138bf6a5aedbeaca")
    public fun fromTargetGroupAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: TargetGroupAttributes.Builder.() -> Unit,
    ): INetworkTargetGroup = fromTargetGroupAttributes(scope, id, TargetGroupAttributes(attrs))

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): NetworkTargetGroup {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return NetworkTargetGroup(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.NetworkTargetGroup):
        NetworkTargetGroup = NetworkTargetGroup(cdkObject)

    internal fun unwrap(wrapped: NetworkTargetGroup):
        software.amazon.awscdk.services.elasticloadbalancingv2.NetworkTargetGroup =
        wrapped.cdkObject
  }
}
