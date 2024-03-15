@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.elasticloadbalancingv2

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit

public interface HealthCheck {
  public fun enabled(): Boolean? = unwrap(this).getEnabled()

  public fun healthyGrpcCodes(): String? = unwrap(this).getHealthyGrpcCodes()

  public fun healthyHttpCodes(): String? = unwrap(this).getHealthyHttpCodes()

  public fun healthyThresholdCount(): Number? = unwrap(this).getHealthyThresholdCount()

  public fun interval(): Duration? = unwrap(this).getInterval()?.let(Duration::wrap)

  public fun path(): String? = unwrap(this).getPath()

  public fun port(): String? = unwrap(this).getPort()

  public fun protocol(): Protocol? = unwrap(this).getProtocol()?.let(Protocol::wrap)

  public fun timeout(): Duration? = unwrap(this).getTimeout()?.let(Duration::wrap)

  public fun unhealthyThresholdCount(): Number? = unwrap(this).getUnhealthyThresholdCount()

  @CdkDslMarker
  public interface Builder {
    public fun enabled(enabled: Boolean)

    public fun healthyGrpcCodes(healthyGrpcCodes: String)

    public fun healthyHttpCodes(healthyHttpCodes: String)

    public fun healthyThresholdCount(healthyThresholdCount: Number)

    public fun interval(interval: Duration)

    public fun path(path: String)

    public fun port(port: String)

    public fun protocol(protocol: Protocol)

    public fun timeout(timeout: Duration)

    public fun unhealthyThresholdCount(unhealthyThresholdCount: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.elasticloadbalancingv2.HealthCheck.Builder =
        software.amazon.awscdk.services.elasticloadbalancingv2.HealthCheck.builder()

    override fun enabled(enabled: Boolean) {
      cdkBuilder.enabled(enabled)
    }

    override fun healthyGrpcCodes(healthyGrpcCodes: String) {
      cdkBuilder.healthyGrpcCodes(healthyGrpcCodes)
    }

    override fun healthyHttpCodes(healthyHttpCodes: String) {
      cdkBuilder.healthyHttpCodes(healthyHttpCodes)
    }

    override fun healthyThresholdCount(healthyThresholdCount: Number) {
      cdkBuilder.healthyThresholdCount(healthyThresholdCount)
    }

    override fun interval(interval: Duration) {
      cdkBuilder.interval(interval.let(Duration::unwrap))
    }

    override fun path(path: String) {
      cdkBuilder.path(path)
    }

    override fun port(port: String) {
      cdkBuilder.port(port)
    }

    override fun protocol(protocol: Protocol) {
      cdkBuilder.protocol(protocol.let(Protocol::unwrap))
    }

    override fun timeout(timeout: Duration) {
      cdkBuilder.timeout(timeout.let(Duration::unwrap))
    }

    override fun unhealthyThresholdCount(unhealthyThresholdCount: Number) {
      cdkBuilder.unhealthyThresholdCount(unhealthyThresholdCount)
    }

    public fun build(): software.amazon.awscdk.services.elasticloadbalancingv2.HealthCheck =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.HealthCheck,
  ) : CdkObject(cdkObject), HealthCheck {
    override fun enabled(): Boolean? = unwrap(this).getEnabled()

    override fun healthyGrpcCodes(): String? = unwrap(this).getHealthyGrpcCodes()

    override fun healthyHttpCodes(): String? = unwrap(this).getHealthyHttpCodes()

    override fun healthyThresholdCount(): Number? = unwrap(this).getHealthyThresholdCount()

    override fun interval(): Duration? = unwrap(this).getInterval()?.let(Duration::wrap)

    override fun path(): String? = unwrap(this).getPath()

    override fun port(): String? = unwrap(this).getPort()

    override fun protocol(): Protocol? = unwrap(this).getProtocol()?.let(Protocol::wrap)

    override fun timeout(): Duration? = unwrap(this).getTimeout()?.let(Duration::wrap)

    override fun unhealthyThresholdCount(): Number? = unwrap(this).getUnhealthyThresholdCount()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): HealthCheck {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.HealthCheck):
        HealthCheck = Wrapper(cdkObject)

    internal fun unwrap(wrapped: HealthCheck):
        software.amazon.awscdk.services.elasticloadbalancingv2.HealthCheck = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.elasticloadbalancingv2.HealthCheck
  }
}
