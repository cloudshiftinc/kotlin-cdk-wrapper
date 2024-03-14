package io.cloudshiftdev.awscdk.services.elasticloadbalancingv2

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.services.cloudwatch.Metric
import io.cloudshiftdev.awscdk.services.cloudwatch.MetricOptions
import io.cloudshiftdev.awscdk.services.ec2.IVpc
import kotlin.Boolean
import kotlin.Deprecated
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class NetworkTargetGroup internal constructor(
  private val cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.NetworkTargetGroup,
) : TargetGroupBase(cdkObject), INetworkTargetGroup {
  public override fun addTarget(targets: INetworkLoadBalancerTarget) {
    unwrap(this).addTarget(targets.let(INetworkLoadBalancerTarget::unwrap))
  }

  public override fun firstLoadBalancerFullName(): String =
      unwrap(this).getFirstLoadBalancerFullName()

  @Deprecated(message = "deprecated in CDK")
  public open fun metricHealthyHostCount(): Metric =
      unwrap(this).metricHealthyHostCount().let(Metric::wrap)

  @Deprecated(message = "deprecated in CDK")
  public open fun metricHealthyHostCount(props: MetricOptions): Metric =
      unwrap(this).metricHealthyHostCount(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  @Deprecated(message = "deprecated in CDK")
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("cd2021699bf4459818ab9875d89c7bd44524bb3ba873974adc6684a32214f8fc")
  public open fun metricHealthyHostCount(props: MetricOptions.Builder.() -> Unit): Metric =
      metricHealthyHostCount(MetricOptions(props))

  @Deprecated(message = "deprecated in CDK")
  public open fun metricUnHealthyHostCount(): Metric =
      unwrap(this).metricUnHealthyHostCount().let(Metric::wrap)

  @Deprecated(message = "deprecated in CDK")
  public open fun metricUnHealthyHostCount(props: MetricOptions): Metric =
      unwrap(this).metricUnHealthyHostCount(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  @Deprecated(message = "deprecated in CDK")
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("037d6ab549bb296c17832dd568d7edc5f354592355d1c8246d6c0ed0062c2232")
  public open fun metricUnHealthyHostCount(props: MetricOptions.Builder.() -> Unit): Metric =
      metricUnHealthyHostCount(MetricOptions(props))

  public override fun metrics(): INetworkTargetGroupMetrics =
      unwrap(this).getMetrics().let(INetworkTargetGroupMetrics::wrap)

  public override fun registerListener(listener: INetworkListener) {
    unwrap(this).registerListener(listener.let(INetworkListener::unwrap))
  }

  public interface Builder {
    public fun connectionTermination(connectionTermination: Boolean)

    public fun deregistrationDelay(deregistrationDelay: Duration)

    public fun healthCheck(healthCheck: HealthCheck)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9c7ee6a16ec18311c4c64074c4eac245e90c71b6535cdddc06564288488e16b5")
    public fun healthCheck(healthCheck: HealthCheck.Builder.() -> Unit)

    public fun port(port: Number)

    public fun preserveClientIp(preserveClientIp: Boolean)

    public fun protocol(protocol: Protocol)

    public fun proxyProtocolV2(proxyProtocolV2: Boolean)

    public fun targetGroupName(targetGroupName: String)

    public fun targetType(targetType: TargetType)

    public fun targets(targets: List<INetworkLoadBalancerTarget>)

    public fun targets(vararg targets: INetworkLoadBalancerTarget)

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

    override fun connectionTermination(connectionTermination: Boolean) {
      cdkBuilder.connectionTermination(connectionTermination)
    }

    override fun deregistrationDelay(deregistrationDelay: Duration) {
      cdkBuilder.deregistrationDelay(deregistrationDelay.let(Duration::unwrap))
    }

    override fun healthCheck(healthCheck: HealthCheck) {
      cdkBuilder.healthCheck(healthCheck.let(HealthCheck::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9c7ee6a16ec18311c4c64074c4eac245e90c71b6535cdddc06564288488e16b5")
    override fun healthCheck(healthCheck: HealthCheck.Builder.() -> Unit): Unit =
        healthCheck(HealthCheck(healthCheck))

    override fun port(port: Number) {
      cdkBuilder.port(port)
    }

    override fun preserveClientIp(preserveClientIp: Boolean) {
      cdkBuilder.preserveClientIp(preserveClientIp)
    }

    override fun protocol(protocol: Protocol) {
      cdkBuilder.protocol(protocol.let(Protocol::unwrap))
    }

    override fun proxyProtocolV2(proxyProtocolV2: Boolean) {
      cdkBuilder.proxyProtocolV2(proxyProtocolV2)
    }

    override fun targetGroupName(targetGroupName: String) {
      cdkBuilder.targetGroupName(targetGroupName)
    }

    override fun targetType(targetType: TargetType) {
      cdkBuilder.targetType(targetType.let(TargetType::unwrap))
    }

    override fun targets(targets: List<INetworkLoadBalancerTarget>) {
      cdkBuilder.targets(targets.map(INetworkLoadBalancerTarget::unwrap))
    }

    override fun targets(vararg targets: INetworkLoadBalancerTarget): Unit =
        targets(targets.toList())

    override fun vpc(vpc: IVpc) {
      cdkBuilder.vpc(vpc.let(IVpc::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.elasticloadbalancingv2.NetworkTargetGroup =
        cdkBuilder.build()
  }

  public companion object {
    public open fun fromTargetGroupAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: TargetGroupAttributes,
    ): INetworkTargetGroup =
        software.amazon.awscdk.services.elasticloadbalancingv2.NetworkTargetGroup.fromTargetGroupAttributes(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, attrs.let(TargetGroupAttributes::unwrap)).let(INetworkTargetGroup::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9e8569f93dff0c1e3a15c44bddcebbe3a3c3a3ab105f2a53138bf6a5aedbeaca")
    public open fun fromTargetGroupAttributes(
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
