package io.cloudshiftdev.awscdk.services.elasticloadbalancingv2

import kotlin.Boolean
import kotlin.Number
import kotlin.Unit

public interface ApplicationLoadBalancerRedirectConfig {
  public fun `open`(): Boolean? = unwrap(this).getOpen()

  public fun sourcePort(): Number? = unwrap(this).getSourcePort()

  public fun sourceProtocol(): ApplicationProtocol? =
      unwrap(this).getSourceProtocol()?.let(ApplicationProtocol::wrap)

  public fun targetPort(): Number? = unwrap(this).getTargetPort()

  public fun targetProtocol(): ApplicationProtocol? =
      unwrap(this).getTargetProtocol()?.let(ApplicationProtocol::wrap)

  public interface Builder {
    public fun `open`(`open`: Boolean) {
    }

    public fun sourcePort(sourcePort: Number) {
    }

    public fun sourceProtocol(sourceProtocol: ApplicationProtocol) {
    }

    public fun targetPort(targetPort: Number) {
    }

    public fun targetProtocol(targetProtocol: ApplicationProtocol) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationLoadBalancerRedirectConfig.Builder
        =
        software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationLoadBalancerRedirectConfig.builder()

    public override fun `open`(`open`: Boolean) {
      cdkBuilder.`open`(`open`)
    }

    public override fun sourcePort(sourcePort: Number) {
      cdkBuilder.sourcePort(sourcePort)
    }

    public override fun sourceProtocol(sourceProtocol: ApplicationProtocol) {
      cdkBuilder.sourceProtocol(sourceProtocol.let(ApplicationProtocol::unwrap))
    }

    public override fun targetPort(targetPort: Number) {
      cdkBuilder.targetPort(targetPort)
    }

    public override fun targetProtocol(targetProtocol: ApplicationProtocol) {
      cdkBuilder.targetProtocol(targetProtocol.let(ApplicationProtocol::unwrap))
    }

    public fun build():
        software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationLoadBalancerRedirectConfig
        = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject:
        software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationLoadBalancerRedirectConfig,
  ) : ApplicationLoadBalancerRedirectConfig {
    public override fun `open`(): Boolean? = unwrap(this).getOpen()

    public override fun sourcePort(): Number? = unwrap(this).getSourcePort()

    public override fun sourceProtocol(): ApplicationProtocol? =
        unwrap(this).getSourceProtocol()?.let(ApplicationProtocol::wrap)

    public override fun targetPort(): Number? = unwrap(this).getTargetPort()

    public override fun targetProtocol(): ApplicationProtocol? =
        unwrap(this).getTargetProtocol()?.let(ApplicationProtocol::wrap)
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}):
        ApplicationLoadBalancerRedirectConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationLoadBalancerRedirectConfig):
        ApplicationLoadBalancerRedirectConfig = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ApplicationLoadBalancerRedirectConfig):
        software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationLoadBalancerRedirectConfig
        = (wrapped as Wrapper).cdkObject
  }
}
