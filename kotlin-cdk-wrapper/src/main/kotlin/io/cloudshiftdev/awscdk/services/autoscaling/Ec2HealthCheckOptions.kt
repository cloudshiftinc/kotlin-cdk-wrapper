@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.autoscaling

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Unit

/**
 * EC2 Heath check options.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.*;
 * import io.cloudshiftdev.awscdk.services.autoscaling.*;
 * Ec2HealthCheckOptions ec2HealthCheckOptions = Ec2HealthCheckOptions.builder()
 * .grace(Duration.minutes(30))
 * .build();
 * ```
 */
public interface Ec2HealthCheckOptions {
  /**
   * Specified the time Auto Scaling waits before checking the health status of an EC2 instance that
   * has come into service.
   *
   * Default: Duration.seconds(0)
   */
  public fun grace(): Duration? = unwrap(this).getGrace()?.let(Duration::wrap)

  /**
   * A builder for [Ec2HealthCheckOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param grace Specified the time Auto Scaling waits before checking the health status of an
     * EC2 instance that has come into service.
     */
    public fun grace(grace: Duration)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.autoscaling.Ec2HealthCheckOptions.Builder =
        software.amazon.awscdk.services.autoscaling.Ec2HealthCheckOptions.builder()

    /**
     * @param grace Specified the time Auto Scaling waits before checking the health status of an
     * EC2 instance that has come into service.
     */
    override fun grace(grace: Duration) {
      cdkBuilder.grace(grace.let(Duration.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.autoscaling.Ec2HealthCheckOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.autoscaling.Ec2HealthCheckOptions,
  ) : CdkObject(cdkObject), Ec2HealthCheckOptions {
    /**
     * Specified the time Auto Scaling waits before checking the health status of an EC2 instance
     * that has come into service.
     *
     * Default: Duration.seconds(0)
     */
    override fun grace(): Duration? = unwrap(this).getGrace()?.let(Duration::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): Ec2HealthCheckOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.autoscaling.Ec2HealthCheckOptions):
        Ec2HealthCheckOptions = CdkObjectWrappers.wrap(cdkObject) as? Ec2HealthCheckOptions ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: Ec2HealthCheckOptions):
        software.amazon.awscdk.services.autoscaling.Ec2HealthCheckOptions = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.autoscaling.Ec2HealthCheckOptions
  }
}
