package io.cloudshiftdev.awscdk.services.elasticloadbalancingv2

import io.cloudshiftdev.awscdk.Duration
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface AddApplicationTargetsProps : AddRuleProps {
  public fun deregistrationDelay(): Duration? =
      unwrap(this).getDeregistrationDelay()?.let(Duration::wrap)

  public fun healthCheck(): HealthCheck? = unwrap(this).getHealthCheck()?.let(HealthCheck::wrap)

  public fun loadBalancingAlgorithmType(): TargetGroupLoadBalancingAlgorithmType? =
      unwrap(this).getLoadBalancingAlgorithmType()?.let(TargetGroupLoadBalancingAlgorithmType::wrap)

  public fun port(): Number? = unwrap(this).getPort()

  public fun protocol(): ApplicationProtocol? =
      unwrap(this).getProtocol()?.let(ApplicationProtocol::wrap)

  public fun protocolVersion(): ApplicationProtocolVersion? =
      unwrap(this).getProtocolVersion()?.let(ApplicationProtocolVersion::wrap)

  public fun slowStart(): Duration? = unwrap(this).getSlowStart()?.let(Duration::wrap)

  public fun stickinessCookieDuration(): Duration? =
      unwrap(this).getStickinessCookieDuration()?.let(Duration::wrap)

  public fun stickinessCookieName(): String? = unwrap(this).getStickinessCookieName()

  public fun targetGroupName(): String? = unwrap(this).getTargetGroupName()

  public fun targets(): List<IApplicationLoadBalancerTarget> =
      unwrap(this).getTargets()?.map(IApplicationLoadBalancerTarget::wrap) ?: emptyList()

  public interface Builder {
    public fun conditions(conditions: List<ListenerCondition>) {
    }

    public fun deregistrationDelay(deregistrationDelay: Duration) {
    }

    public fun healthCheck(healthCheck: HealthCheck) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("dc6f55b95bf0e01bd41dfdb5a4b30c87f807a05fadebff1e920ae80f78ded647")
    public fun healthCheck(healthCheck: HealthCheck.Builder.() -> Unit) {
    }

    public
        fun loadBalancingAlgorithmType(loadBalancingAlgorithmType: TargetGroupLoadBalancingAlgorithmType) {
    }

    public fun port(port: Number) {
    }

    public fun priority(priority: Number) {
    }

    public fun protocol(protocol: ApplicationProtocol) {
    }

    public fun protocolVersion(protocolVersion: ApplicationProtocolVersion) {
    }

    public fun slowStart(slowStart: Duration) {
    }

    public fun stickinessCookieDuration(stickinessCookieDuration: Duration) {
    }

    public fun stickinessCookieName(stickinessCookieName: String) {
    }

    public fun targetGroupName(targetGroupName: String) {
    }

    public fun targets(targets: List<IApplicationLoadBalancerTarget>) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.elasticloadbalancingv2.AddApplicationTargetsProps.Builder =
        software.amazon.awscdk.services.elasticloadbalancingv2.AddApplicationTargetsProps.builder()

    public override fun conditions(conditions: List<ListenerCondition>) {
      cdkBuilder.conditions(conditions.map(ListenerCondition::unwrap))
    }

    public override fun deregistrationDelay(deregistrationDelay: Duration) {
      cdkBuilder.deregistrationDelay(deregistrationDelay.let(Duration::unwrap))
    }

    public override fun healthCheck(healthCheck: HealthCheck) {
      cdkBuilder.healthCheck(healthCheck.let(HealthCheck::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("dc6f55b95bf0e01bd41dfdb5a4b30c87f807a05fadebff1e920ae80f78ded647")
    public override fun healthCheck(healthCheck: HealthCheck.Builder.() -> Unit): Unit =
        healthCheck(HealthCheck(healthCheck))

    public override
        fun loadBalancingAlgorithmType(loadBalancingAlgorithmType: TargetGroupLoadBalancingAlgorithmType) {
      cdkBuilder.loadBalancingAlgorithmType(loadBalancingAlgorithmType.let(TargetGroupLoadBalancingAlgorithmType::unwrap))
    }

    public override fun port(port: Number) {
      cdkBuilder.port(port)
    }

    public override fun priority(priority: Number) {
      cdkBuilder.priority(priority)
    }

    public override fun protocol(protocol: ApplicationProtocol) {
      cdkBuilder.protocol(protocol.let(ApplicationProtocol::unwrap))
    }

    public override fun protocolVersion(protocolVersion: ApplicationProtocolVersion) {
      cdkBuilder.protocolVersion(protocolVersion.let(ApplicationProtocolVersion::unwrap))
    }

    public override fun slowStart(slowStart: Duration) {
      cdkBuilder.slowStart(slowStart.let(Duration::unwrap))
    }

    public override fun stickinessCookieDuration(stickinessCookieDuration: Duration) {
      cdkBuilder.stickinessCookieDuration(stickinessCookieDuration.let(Duration::unwrap))
    }

    public override fun stickinessCookieName(stickinessCookieName: String) {
      cdkBuilder.stickinessCookieName(stickinessCookieName)
    }

    public override fun targetGroupName(targetGroupName: String) {
      cdkBuilder.targetGroupName(targetGroupName)
    }

    public override fun targets(targets: List<IApplicationLoadBalancerTarget>) {
      cdkBuilder.targets(targets.map(IApplicationLoadBalancerTarget::unwrap))
    }

    public fun build():
        software.amazon.awscdk.services.elasticloadbalancingv2.AddApplicationTargetsProps =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject:
        software.amazon.awscdk.services.elasticloadbalancingv2.AddApplicationTargetsProps,
  ) : AddApplicationTargetsProps {
    public override fun conditions(): List<ListenerCondition> =
        unwrap(this).getConditions()?.map(ListenerCondition::wrap) ?: emptyList()

    public override fun deregistrationDelay(): Duration? =
        unwrap(this).getDeregistrationDelay()?.let(Duration::wrap)

    public override fun healthCheck(): HealthCheck? =
        unwrap(this).getHealthCheck()?.let(HealthCheck::wrap)

    public override fun loadBalancingAlgorithmType(): TargetGroupLoadBalancingAlgorithmType? =
        unwrap(this).getLoadBalancingAlgorithmType()?.let(TargetGroupLoadBalancingAlgorithmType::wrap)

    public override fun port(): Number? = unwrap(this).getPort()

    public override fun priority(): Number? = unwrap(this).getPriority()

    public override fun protocol(): ApplicationProtocol? =
        unwrap(this).getProtocol()?.let(ApplicationProtocol::wrap)

    public override fun protocolVersion(): ApplicationProtocolVersion? =
        unwrap(this).getProtocolVersion()?.let(ApplicationProtocolVersion::wrap)

    public override fun slowStart(): Duration? = unwrap(this).getSlowStart()?.let(Duration::wrap)

    public override fun stickinessCookieDuration(): Duration? =
        unwrap(this).getStickinessCookieDuration()?.let(Duration::wrap)

    public override fun stickinessCookieName(): String? = unwrap(this).getStickinessCookieName()

    public override fun targetGroupName(): String? = unwrap(this).getTargetGroupName()

    public override fun targets(): List<IApplicationLoadBalancerTarget> =
        unwrap(this).getTargets()?.map(IApplicationLoadBalancerTarget::wrap) ?: emptyList()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): AddApplicationTargetsProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.AddApplicationTargetsProps):
        AddApplicationTargetsProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: AddApplicationTargetsProps):
        software.amazon.awscdk.services.elasticloadbalancingv2.AddApplicationTargetsProps = (wrapped
        as Wrapper).cdkObject
  }
}
