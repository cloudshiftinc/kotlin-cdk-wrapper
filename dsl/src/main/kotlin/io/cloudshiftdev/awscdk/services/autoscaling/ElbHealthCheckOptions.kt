package io.cloudshiftdev.awscdk.services.autoscaling

import io.cloudshiftdev.awscdk.Duration
import kotlin.Unit

public interface ElbHealthCheckOptions {
  public fun grace(): Duration

  public interface Builder {
    public fun grace(grace: Duration)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.autoscaling.ElbHealthCheckOptions.Builder =
        software.amazon.awscdk.services.autoscaling.ElbHealthCheckOptions.builder()

    override fun grace(grace: Duration) {
      cdkBuilder.grace(grace.let(Duration::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.autoscaling.ElbHealthCheckOptions =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.autoscaling.ElbHealthCheckOptions,
  ) : ElbHealthCheckOptions {
    override fun grace(): Duration = unwrap(this).getGrace().let(Duration::wrap)
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): ElbHealthCheckOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.autoscaling.ElbHealthCheckOptions):
        ElbHealthCheckOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ElbHealthCheckOptions):
        software.amazon.awscdk.services.autoscaling.ElbHealthCheckOptions = (wrapped as
        Wrapper).cdkObject
  }
}
