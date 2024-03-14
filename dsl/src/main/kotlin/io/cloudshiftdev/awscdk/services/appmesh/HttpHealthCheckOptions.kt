package io.cloudshiftdev.awscdk.services.appmesh

import io.cloudshiftdev.awscdk.Duration
import kotlin.Number
import kotlin.String
import kotlin.Unit

public interface HttpHealthCheckOptions {
  public fun healthyThreshold(): Number? = unwrap(this).getHealthyThreshold()

  public fun interval(): Duration? = unwrap(this).getInterval()?.let(Duration::wrap)

  public fun path(): String? = unwrap(this).getPath()

  public fun timeout(): Duration? = unwrap(this).getTimeout()?.let(Duration::wrap)

  public fun unhealthyThreshold(): Number? = unwrap(this).getUnhealthyThreshold()

  public interface Builder {
    public fun healthyThreshold(healthyThreshold: Number) {
    }

    public fun interval(interval: Duration) {
    }

    public fun path(path: String) {
    }

    public fun timeout(timeout: Duration) {
    }

    public fun unhealthyThreshold(unhealthyThreshold: Number) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appmesh.HttpHealthCheckOptions.Builder =
        software.amazon.awscdk.services.appmesh.HttpHealthCheckOptions.builder()

    public override fun healthyThreshold(healthyThreshold: Number) {
      cdkBuilder.healthyThreshold(healthyThreshold)
    }

    public override fun interval(interval: Duration) {
      cdkBuilder.interval(interval.let(Duration::unwrap))
    }

    public override fun path(path: String) {
      cdkBuilder.path(path)
    }

    public override fun timeout(timeout: Duration) {
      cdkBuilder.timeout(timeout.let(Duration::unwrap))
    }

    public override fun unhealthyThreshold(unhealthyThreshold: Number) {
      cdkBuilder.unhealthyThreshold(unhealthyThreshold)
    }

    public fun build(): software.amazon.awscdk.services.appmesh.HttpHealthCheckOptions =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.appmesh.HttpHealthCheckOptions,
  ) : HttpHealthCheckOptions {
    public override fun healthyThreshold(): Number? = unwrap(this).getHealthyThreshold()

    public override fun interval(): Duration? = unwrap(this).getInterval()?.let(Duration::wrap)

    public override fun path(): String? = unwrap(this).getPath()

    public override fun timeout(): Duration? = unwrap(this).getTimeout()?.let(Duration::wrap)

    public override fun unhealthyThreshold(): Number? = unwrap(this).getUnhealthyThreshold()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): HttpHealthCheckOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.HttpHealthCheckOptions):
        HttpHealthCheckOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: HttpHealthCheckOptions):
        software.amazon.awscdk.services.appmesh.HttpHealthCheckOptions = (wrapped as
        Wrapper).cdkObject
  }
}
