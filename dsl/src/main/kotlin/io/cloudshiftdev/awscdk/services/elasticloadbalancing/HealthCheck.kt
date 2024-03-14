package io.cloudshiftdev.awscdk.services.elasticloadbalancing

import io.cloudshiftdev.awscdk.Duration
import kotlin.Number
import kotlin.String
import kotlin.Unit

public interface HealthCheck {
  public fun healthyThreshold(): Number? = unwrap(this).getHealthyThreshold()

  public fun interval(): Duration? = unwrap(this).getInterval()?.let(Duration::wrap)

  public fun path(): String? = unwrap(this).getPath()

  public fun port(): Number

  public fun protocol(): LoadBalancingProtocol? =
      unwrap(this).getProtocol()?.let(LoadBalancingProtocol::wrap)

  public fun timeout(): Duration? = unwrap(this).getTimeout()?.let(Duration::wrap)

  public fun unhealthyThreshold(): Number? = unwrap(this).getUnhealthyThreshold()

  public interface Builder {
    public fun healthyThreshold(healthyThreshold: Number) {
    }

    public fun interval(interval: Duration) {
    }

    public fun path(path: String) {
    }

    public fun port(port: Number) {
    }

    public fun protocol(protocol: LoadBalancingProtocol) {
    }

    public fun timeout(timeout: Duration) {
    }

    public fun unhealthyThreshold(unhealthyThreshold: Number) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.elasticloadbalancing.HealthCheck.Builder
        = software.amazon.awscdk.services.elasticloadbalancing.HealthCheck.builder()

    public override fun healthyThreshold(healthyThreshold: Number) {
      cdkBuilder.healthyThreshold(healthyThreshold)
    }

    public override fun interval(interval: Duration) {
      cdkBuilder.interval(interval.let(Duration::unwrap))
    }

    public override fun path(path: String) {
      cdkBuilder.path(path)
    }

    public override fun port(port: Number) {
      cdkBuilder.port(port)
    }

    public override fun protocol(protocol: LoadBalancingProtocol) {
      cdkBuilder.protocol(protocol.let(LoadBalancingProtocol::unwrap))
    }

    public override fun timeout(timeout: Duration) {
      cdkBuilder.timeout(timeout.let(Duration::unwrap))
    }

    public override fun unhealthyThreshold(unhealthyThreshold: Number) {
      cdkBuilder.unhealthyThreshold(unhealthyThreshold)
    }

    public fun build(): software.amazon.awscdk.services.elasticloadbalancing.HealthCheck =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.elasticloadbalancing.HealthCheck,
  ) : HealthCheck {
    public override fun healthyThreshold(): Number? = unwrap(this).getHealthyThreshold()

    public override fun interval(): Duration? = unwrap(this).getInterval()?.let(Duration::wrap)

    public override fun path(): String? = unwrap(this).getPath()

    public override fun port(): Number = unwrap(this).getPort()

    public override fun protocol(): LoadBalancingProtocol? =
        unwrap(this).getProtocol()?.let(LoadBalancingProtocol::wrap)

    public override fun timeout(): Duration? = unwrap(this).getTimeout()?.let(Duration::wrap)

    public override fun unhealthyThreshold(): Number? = unwrap(this).getUnhealthyThreshold()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): HealthCheck {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancing.HealthCheck):
        HealthCheck = Wrapper(cdkObject)

    internal fun unwrap(wrapped: HealthCheck):
        software.amazon.awscdk.services.elasticloadbalancing.HealthCheck = (wrapped as
        Wrapper).cdkObject
  }
}
