@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.autoscaling

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Unit

/**
 * ELB Heath check options.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.*;
 * import io.cloudshiftdev.awscdk.services.autoscaling.*;
 * ElbHealthCheckOptions elbHealthCheckOptions = ElbHealthCheckOptions.builder()
 * .grace(Duration.minutes(30))
 * .build();
 * ```
 */
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

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.autoscaling.ElbHealthCheckOptions,
  ) : CdkObject(cdkObject), ElbHealthCheckOptions {
    /**
     * Specified the time Auto Scaling waits before checking the health status of an EC2 instance
     * that has come into service.
     *
     * This option is required for ELB health checks.
     */
    override fun grace(): Duration = unwrap(this).getGrace().let(Duration::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ElbHealthCheckOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.autoscaling.ElbHealthCheckOptions):
        ElbHealthCheckOptions = CdkObjectWrappers.wrap(cdkObject) as? ElbHealthCheckOptions ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: ElbHealthCheckOptions):
        software.amazon.awscdk.services.autoscaling.ElbHealthCheckOptions = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.autoscaling.ElbHealthCheckOptions
  }
}
