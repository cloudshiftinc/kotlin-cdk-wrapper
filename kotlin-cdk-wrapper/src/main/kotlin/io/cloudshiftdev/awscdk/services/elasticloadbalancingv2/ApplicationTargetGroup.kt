@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.elasticloadbalancingv2

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.cloudwatch.Metric
import io.cloudshiftdev.awscdk.services.cloudwatch.MetricOptions
import io.cloudshiftdev.awscdk.services.ec2.IConnectable
import io.cloudshiftdev.awscdk.services.ec2.IVpc
import io.cloudshiftdev.awscdk.services.ec2.Port
import io.cloudshiftdev.constructs.IConstruct
import kotlin.Deprecated
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class ApplicationTargetGroup internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationTargetGroup,
) : TargetGroupBase(cdkObject), IApplicationTargetGroup {
  public override fun addTarget(targets: IApplicationLoadBalancerTarget) {
    unwrap(this).addTarget(targets.let(IApplicationLoadBalancerTarget::unwrap))
  }

  public open fun enableCookieStickiness(duration: Duration) {
    unwrap(this).enableCookieStickiness(duration.let(Duration::unwrap))
  }

  public open fun enableCookieStickiness(duration: Duration, cookieName: String) {
    unwrap(this).enableCookieStickiness(duration.let(Duration::unwrap), cookieName)
  }

  public override fun firstLoadBalancerFullName(): String =
      unwrap(this).getFirstLoadBalancerFullName()

  public open fun metric(metricName: String): Metric =
      unwrap(this).metric(metricName).let(Metric::wrap)

  public open fun metric(metricName: String, props: MetricOptions): Metric =
      unwrap(this).metric(metricName, props.let(MetricOptions::unwrap)).let(Metric::wrap)

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("629ccc2b9ed0d0686ac72be3c432836a76a92f56ab45dae83dc2e318f17ba80c")
  public open fun metric(metricName: String, props: MetricOptions.Builder.() -> Unit): Metric =
      metric(metricName, MetricOptions(props))

  @Deprecated(message = "deprecated in CDK")
  public open fun metricHealthyHostCount(): Metric =
      unwrap(this).metricHealthyHostCount().let(Metric::wrap)

  @Deprecated(message = "deprecated in CDK")
  public open fun metricHealthyHostCount(props: MetricOptions): Metric =
      unwrap(this).metricHealthyHostCount(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  @Deprecated(message = "deprecated in CDK")
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("cd2021699bf4459818ab9875d89c7bd44524bb3ba873974adc6684a32214f8fc")
  public open fun metricHealthyHostCount(props: MetricOptions.Builder.() -> Unit): Metric =
      metricHealthyHostCount(MetricOptions(props))

  @Deprecated(message = "deprecated in CDK")
  public open fun metricHttpCodeTarget(code: HttpCodeTarget): Metric =
      unwrap(this).metricHttpCodeTarget(code.let(HttpCodeTarget::unwrap)).let(Metric::wrap)

  @Deprecated(message = "deprecated in CDK")
  public open fun metricHttpCodeTarget(code: HttpCodeTarget, props: MetricOptions): Metric =
      unwrap(this).metricHttpCodeTarget(code.let(HttpCodeTarget::unwrap),
      props.let(MetricOptions::unwrap)).let(Metric::wrap)

  @Deprecated(message = "deprecated in CDK")
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("121a82afa7f74fa036d0dc74440ef0d024223acab827324eda17b612a9012454")
  public open fun metricHttpCodeTarget(code: HttpCodeTarget,
      props: MetricOptions.Builder.() -> Unit): Metric = metricHttpCodeTarget(code,
      MetricOptions(props))

  @Deprecated(message = "deprecated in CDK")
  public open fun metricIpv6RequestCount(): Metric =
      unwrap(this).metricIpv6RequestCount().let(Metric::wrap)

  @Deprecated(message = "deprecated in CDK")
  public open fun metricIpv6RequestCount(props: MetricOptions): Metric =
      unwrap(this).metricIpv6RequestCount(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  @Deprecated(message = "deprecated in CDK")
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("7cb2b61a2d0456f8f0f6806cc31cbb006c4e1f7f92ce14af7aae5ed4fcb572d1")
  public open fun metricIpv6RequestCount(props: MetricOptions.Builder.() -> Unit): Metric =
      metricIpv6RequestCount(MetricOptions(props))

  @Deprecated(message = "deprecated in CDK")
  public open fun metricRequestCount(): Metric = unwrap(this).metricRequestCount().let(Metric::wrap)

  @Deprecated(message = "deprecated in CDK")
  public open fun metricRequestCount(props: MetricOptions): Metric =
      unwrap(this).metricRequestCount(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  @Deprecated(message = "deprecated in CDK")
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("a6855b6eecd989b6fd05d9eadf7997928023d1bd51a53703a9bb975518c563c2")
  public open fun metricRequestCount(props: MetricOptions.Builder.() -> Unit): Metric =
      metricRequestCount(MetricOptions(props))

  @Deprecated(message = "deprecated in CDK")
  public open fun metricRequestCountPerTarget(): Metric =
      unwrap(this).metricRequestCountPerTarget().let(Metric::wrap)

  @Deprecated(message = "deprecated in CDK")
  public open fun metricRequestCountPerTarget(props: MetricOptions): Metric =
      unwrap(this).metricRequestCountPerTarget(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  @Deprecated(message = "deprecated in CDK")
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("1b50a7e3927206110e8b90bca18758b60d0a5d5e1e95ae3049a3e72c47b21bbd")
  public open fun metricRequestCountPerTarget(props: MetricOptions.Builder.() -> Unit): Metric =
      metricRequestCountPerTarget(MetricOptions(props))

  @Deprecated(message = "deprecated in CDK")
  public open fun metricTargetConnectionErrorCount(): Metric =
      unwrap(this).metricTargetConnectionErrorCount().let(Metric::wrap)

  @Deprecated(message = "deprecated in CDK")
  public open fun metricTargetConnectionErrorCount(props: MetricOptions): Metric =
      unwrap(this).metricTargetConnectionErrorCount(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  @Deprecated(message = "deprecated in CDK")
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("89056777171dd65db09c827c4c0fa488d94a8c0bc618f5b80e0b582e570684fe")
  public open fun metricTargetConnectionErrorCount(props: MetricOptions.Builder.() -> Unit): Metric
      = metricTargetConnectionErrorCount(MetricOptions(props))

  @Deprecated(message = "deprecated in CDK")
  public open fun metricTargetResponseTime(): Metric =
      unwrap(this).metricTargetResponseTime().let(Metric::wrap)

  @Deprecated(message = "deprecated in CDK")
  public open fun metricTargetResponseTime(props: MetricOptions): Metric =
      unwrap(this).metricTargetResponseTime(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  @Deprecated(message = "deprecated in CDK")
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("47cb9abec01142cff45f0038aa6de07ef9926f5c2b9b0dfe8af82ee727462c44")
  public open fun metricTargetResponseTime(props: MetricOptions.Builder.() -> Unit): Metric =
      metricTargetResponseTime(MetricOptions(props))

  @Deprecated(message = "deprecated in CDK")
  public open fun metricTargetTlsNegotiationErrorCount(): Metric =
      unwrap(this).metricTargetTLSNegotiationErrorCount().let(Metric::wrap)

  @Deprecated(message = "deprecated in CDK")
  public open fun metricTargetTlsNegotiationErrorCount(props: MetricOptions): Metric =
      unwrap(this).metricTargetTLSNegotiationErrorCount(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  @Deprecated(message = "deprecated in CDK")
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("6fb589e77244f79e7b207d6efccaa92a565bce39740975d0c083f19f8a1853d0")
  public open fun metricTargetTlsNegotiationErrorCount(props: MetricOptions.Builder.() -> Unit):
      Metric = metricTargetTlsNegotiationErrorCount(MetricOptions(props))

  @Deprecated(message = "deprecated in CDK")
  public open fun metricUnhealthyHostCount(): Metric =
      unwrap(this).metricUnhealthyHostCount().let(Metric::wrap)

  @Deprecated(message = "deprecated in CDK")
  public open fun metricUnhealthyHostCount(props: MetricOptions): Metric =
      unwrap(this).metricUnhealthyHostCount(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  @Deprecated(message = "deprecated in CDK")
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("96e990ece6c5feaea1a29d4e3b77684015532abf9ccd8b065bf1ae1b263f90b9")
  public open fun metricUnhealthyHostCount(props: MetricOptions.Builder.() -> Unit): Metric =
      metricUnhealthyHostCount(MetricOptions(props))

  public override fun metrics(): IApplicationTargetGroupMetrics =
      unwrap(this).getMetrics().let(IApplicationTargetGroupMetrics::wrap)

  public override fun registerConnectable(connectable: IConnectable) {
    unwrap(this).registerConnectable(connectable.let(IConnectable::unwrap))
  }

  public override fun registerConnectable(connectable: IConnectable, portRange: Port) {
    unwrap(this).registerConnectable(connectable.let(IConnectable::unwrap),
        portRange.let(Port::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("bcc196a279cd8df29b10150b2d6fcd0fb653d88666d4c7b6871b5f67e18a087a")
  public override fun registerConnectable(connectable: IConnectable,
      portRange: Port.Builder.() -> Unit): Unit = registerConnectable(connectable, Port(portRange))

  public override fun registerListener(listener: IApplicationListener) {
    unwrap(this).registerListener(listener.let(IApplicationListener::unwrap))
  }

  public override fun registerListener(listener: IApplicationListener,
      associatingConstruct: IConstruct) {
    unwrap(this).registerListener(listener.let(IApplicationListener::unwrap),
        associatingConstruct.let(IConstruct::unwrap))
  }

  @CdkDslMarker
  public interface Builder {
    public fun deregistrationDelay(deregistrationDelay: Duration)

    public fun healthCheck(healthCheck: HealthCheck)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("05551a8897b13ef92696e78fac308b2def5ca4407866770b3893b34a21ead542")
    public fun healthCheck(healthCheck: HealthCheck.Builder.() -> Unit)

    public
        fun loadBalancingAlgorithmType(loadBalancingAlgorithmType: TargetGroupLoadBalancingAlgorithmType)

    public fun port(port: Number)

    public fun protocol(protocol: ApplicationProtocol)

    public fun protocolVersion(protocolVersion: ApplicationProtocolVersion)

    public fun slowStart(slowStart: Duration)

    public fun stickinessCookieDuration(stickinessCookieDuration: Duration)

    public fun stickinessCookieName(stickinessCookieName: String)

    public fun targetGroupName(targetGroupName: String)

    public fun targetType(targetType: TargetType)

    public fun targets(targets: List<IApplicationLoadBalancerTarget>)

    public fun targets(vararg targets: IApplicationLoadBalancerTarget)

    public fun vpc(vpc: IVpc)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationTargetGroup.Builder =
        software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationTargetGroup.Builder.create(scope,
        id)

    override fun deregistrationDelay(deregistrationDelay: Duration) {
      cdkBuilder.deregistrationDelay(deregistrationDelay.let(Duration::unwrap))
    }

    override fun healthCheck(healthCheck: HealthCheck) {
      cdkBuilder.healthCheck(healthCheck.let(HealthCheck::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("05551a8897b13ef92696e78fac308b2def5ca4407866770b3893b34a21ead542")
    override fun healthCheck(healthCheck: HealthCheck.Builder.() -> Unit): Unit =
        healthCheck(HealthCheck(healthCheck))

    override
        fun loadBalancingAlgorithmType(loadBalancingAlgorithmType: TargetGroupLoadBalancingAlgorithmType) {
      cdkBuilder.loadBalancingAlgorithmType(loadBalancingAlgorithmType.let(TargetGroupLoadBalancingAlgorithmType::unwrap))
    }

    override fun port(port: Number) {
      cdkBuilder.port(port)
    }

    override fun protocol(protocol: ApplicationProtocol) {
      cdkBuilder.protocol(protocol.let(ApplicationProtocol::unwrap))
    }

    override fun protocolVersion(protocolVersion: ApplicationProtocolVersion) {
      cdkBuilder.protocolVersion(protocolVersion.let(ApplicationProtocolVersion::unwrap))
    }

    override fun slowStart(slowStart: Duration) {
      cdkBuilder.slowStart(slowStart.let(Duration::unwrap))
    }

    override fun stickinessCookieDuration(stickinessCookieDuration: Duration) {
      cdkBuilder.stickinessCookieDuration(stickinessCookieDuration.let(Duration::unwrap))
    }

    override fun stickinessCookieName(stickinessCookieName: String) {
      cdkBuilder.stickinessCookieName(stickinessCookieName)
    }

    override fun targetGroupName(targetGroupName: String) {
      cdkBuilder.targetGroupName(targetGroupName)
    }

    override fun targetType(targetType: TargetType) {
      cdkBuilder.targetType(targetType.let(TargetType::unwrap))
    }

    override fun targets(targets: List<IApplicationLoadBalancerTarget>) {
      cdkBuilder.targets(targets.map(IApplicationLoadBalancerTarget::unwrap))
    }

    override fun targets(vararg targets: IApplicationLoadBalancerTarget): Unit =
        targets(targets.toList())

    override fun vpc(vpc: IVpc) {
      cdkBuilder.vpc(vpc.let(IVpc::unwrap))
    }

    public fun build():
        software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationTargetGroup =
        cdkBuilder.build()
  }

  public companion object {
    public fun fromTargetGroupAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: TargetGroupAttributes,
    ): IApplicationTargetGroup =
        software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationTargetGroup.fromTargetGroupAttributes(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, attrs.let(TargetGroupAttributes::unwrap)).let(IApplicationTargetGroup::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("22a0352b4305020b57f07768a4d7557c8f9f1dddb85c7eaaa8816f33b3ff9c2d")
    public fun fromTargetGroupAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: TargetGroupAttributes.Builder.() -> Unit,
    ): IApplicationTargetGroup = fromTargetGroupAttributes(scope, id, TargetGroupAttributes(attrs))

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): ApplicationTargetGroup {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return ApplicationTargetGroup(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationTargetGroup):
        ApplicationTargetGroup = ApplicationTargetGroup(cdkObject)

    internal fun unwrap(wrapped: ApplicationTargetGroup):
        software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationTargetGroup =
        wrapped.cdkObject
  }
}
