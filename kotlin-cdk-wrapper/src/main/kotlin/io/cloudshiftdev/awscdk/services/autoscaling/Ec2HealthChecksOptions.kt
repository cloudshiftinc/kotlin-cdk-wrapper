@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.autoscaling

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Unit

/**
 * EC2 Heath checks options.
 *
 * Example:
 *
 * ```
 * Vpc vpc;
 * AutoScalingGroup.Builder.create(this, "ASG")
 * .vpc(vpc)
 * .instanceType(InstanceType.of(InstanceClass.BURSTABLE2, InstanceSize.MICRO))
 * .machineImage(MachineImage.latestAmazonLinux2())
 * .healthChecks(HealthChecks.ec2(Ec2HealthChecksOptions.builder()
 * .gracePeriod(Duration.seconds(100))
 * .build()))
 * .build();
 * ```
 */
public interface Ec2HealthChecksOptions {
  /**
   * Specified the time Auto Scaling waits before checking the health status of an EC2 instance that
   * has come into service and marking it unhealthy due to a failed health check.
   *
   * Default: Duration.seconds(0)
   *
   * [Documentation](https://docs.aws.amazon.com/autoscaling/ec2/userguide/health-check-grace-period.html)
   */
  public fun gracePeriod(): Duration? = unwrap(this).getGracePeriod()?.let(Duration::wrap)

  /**
   * A builder for [Ec2HealthChecksOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param gracePeriod Specified the time Auto Scaling waits before checking the health status of
     * an EC2 instance that has come into service and marking it unhealthy due to a failed health
     * check.
     */
    public fun gracePeriod(gracePeriod: Duration)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.autoscaling.Ec2HealthChecksOptions.Builder =
        software.amazon.awscdk.services.autoscaling.Ec2HealthChecksOptions.builder()

    /**
     * @param gracePeriod Specified the time Auto Scaling waits before checking the health status of
     * an EC2 instance that has come into service and marking it unhealthy due to a failed health
     * check.
     */
    override fun gracePeriod(gracePeriod: Duration) {
      cdkBuilder.gracePeriod(gracePeriod.let(Duration.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.autoscaling.Ec2HealthChecksOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.autoscaling.Ec2HealthChecksOptions,
  ) : CdkObject(cdkObject),
      Ec2HealthChecksOptions {
    /**
     * Specified the time Auto Scaling waits before checking the health status of an EC2 instance
     * that has come into service and marking it unhealthy due to a failed health check.
     *
     * Default: Duration.seconds(0)
     *
     * [Documentation](https://docs.aws.amazon.com/autoscaling/ec2/userguide/health-check-grace-period.html)
     */
    override fun gracePeriod(): Duration? = unwrap(this).getGracePeriod()?.let(Duration::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): Ec2HealthChecksOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.autoscaling.Ec2HealthChecksOptions):
        Ec2HealthChecksOptions = CdkObjectWrappers.wrap(cdkObject) as? Ec2HealthChecksOptions ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: Ec2HealthChecksOptions):
        software.amazon.awscdk.services.autoscaling.Ec2HealthChecksOptions = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.autoscaling.Ec2HealthChecksOptions
  }
}
