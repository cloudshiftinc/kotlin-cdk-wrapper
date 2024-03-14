package io.cloudshiftdev.awscdk.services.autoscaling

import io.cloudshiftdev.awscdk.Duration
import kotlin.Unit

public interface Ec2HealthCheckOptions {
  public fun grace(): Duration? = unwrap(this).getGrace()?.let(Duration::wrap)

  public interface Builder {
    public fun grace(grace: Duration) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.autoscaling.Ec2HealthCheckOptions.Builder =
        software.amazon.awscdk.services.autoscaling.Ec2HealthCheckOptions.builder()

    public override fun grace(grace: Duration) {
      cdkBuilder.grace(grace.let(Duration::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.autoscaling.Ec2HealthCheckOptions =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.autoscaling.Ec2HealthCheckOptions,
  ) : Ec2HealthCheckOptions {
    public override fun grace(): Duration? = unwrap(this).getGrace()?.let(Duration::wrap)
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): Ec2HealthCheckOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.autoscaling.Ec2HealthCheckOptions):
        Ec2HealthCheckOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: Ec2HealthCheckOptions):
        software.amazon.awscdk.services.autoscaling.Ec2HealthCheckOptions = (wrapped as
        Wrapper).cdkObject
  }
}
