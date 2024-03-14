package io.cloudshiftdev.awscdk.services.appmesh

import io.cloudshiftdev.awscdk.Duration
import kotlin.Number
import kotlin.Unit

public interface GrpcHealthCheckOptions {
  public fun healthyThreshold(): Number? = unwrap(this).getHealthyThreshold()

  public fun interval(): Duration? = unwrap(this).getInterval()?.let(Duration::wrap)

  public fun timeout(): Duration? = unwrap(this).getTimeout()?.let(Duration::wrap)

  public fun unhealthyThreshold(): Number? = unwrap(this).getUnhealthyThreshold()

  public interface Builder {
    public fun healthyThreshold(healthyThreshold: Number)

    public fun interval(interval: Duration)

    public fun timeout(timeout: Duration)

    public fun unhealthyThreshold(unhealthyThreshold: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appmesh.GrpcHealthCheckOptions.Builder =
        software.amazon.awscdk.services.appmesh.GrpcHealthCheckOptions.builder()

    override fun healthyThreshold(healthyThreshold: Number) {
      cdkBuilder.healthyThreshold(healthyThreshold)
    }

    override fun interval(interval: Duration) {
      cdkBuilder.interval(interval.let(Duration::unwrap))
    }

    override fun timeout(timeout: Duration) {
      cdkBuilder.timeout(timeout.let(Duration::unwrap))
    }

    override fun unhealthyThreshold(unhealthyThreshold: Number) {
      cdkBuilder.unhealthyThreshold(unhealthyThreshold)
    }

    public fun build(): software.amazon.awscdk.services.appmesh.GrpcHealthCheckOptions =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.appmesh.GrpcHealthCheckOptions,
  ) : GrpcHealthCheckOptions {
    override fun healthyThreshold(): Number? = unwrap(this).getHealthyThreshold()

    override fun interval(): Duration? = unwrap(this).getInterval()?.let(Duration::wrap)

    override fun timeout(): Duration? = unwrap(this).getTimeout()?.let(Duration::wrap)

    override fun unhealthyThreshold(): Number? = unwrap(this).getUnhealthyThreshold()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): GrpcHealthCheckOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.GrpcHealthCheckOptions):
        GrpcHealthCheckOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: GrpcHealthCheckOptions):
        software.amazon.awscdk.services.appmesh.GrpcHealthCheckOptions = (wrapped as
        Wrapper).cdkObject
  }
}
