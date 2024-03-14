package io.cloudshiftdev.awscdk.services.autoscaling

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Unit

public interface ElbHealthCheckOptions {
  /**
   * Specified the time Auto Scaling waits before checking the health status of an EC2 instance that
   * has come into service.
   *
   * This option is required for ELB health checks.
   */
  public fun grace(): Duration

  /**
   * A builder for [ElbHealthCheckOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param grace Specified the time Auto Scaling waits before checking the health status of an
     * EC2 instance that has come into service. 
     * This option is required for ELB health checks.
     */
    public fun grace(grace: Duration)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.autoscaling.ElbHealthCheckOptions.Builder =
        software.amazon.awscdk.services.autoscaling.ElbHealthCheckOptions.builder()

    /**
     * @param grace Specified the time Auto Scaling waits before checking the health status of an
     * EC2 instance that has come into service. 
     * This option is required for ELB health checks.
     */
    override fun grace(grace: Duration) {
      cdkBuilder.grace(grace.let(Duration::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.autoscaling.ElbHealthCheckOptions =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.autoscaling.ElbHealthCheckOptions,
  ) : ElbHealthCheckOptions {
    /**
     * Specified the time Auto Scaling waits before checking the health status of an EC2 instance
     * that has come into service.
     *
     * This option is required for ELB health checks.
     */
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
