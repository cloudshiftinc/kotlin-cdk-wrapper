@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.autoscaling

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Unit
import kotlin.collections.List

/**
 * Additional Heath checks options.
 *
 * Example:
 *
 * ```
 * Vpc vpc;
 * AutoScalingGroup.Builder.create(this, "ASG")
 * .vpc(vpc)
 * .instanceType(InstanceType.of(InstanceClass.BURSTABLE2, InstanceSize.MICRO))
 * .machineImage(MachineImage.latestAmazonLinux2())
 * .healthChecks(HealthChecks.withAdditionalChecks(AdditionalHealthChecksOptions.builder()
 * .gracePeriod(Duration.seconds(100))
 * .additionalTypes(List.of(AdditionalHealthCheckType.EBS, AdditionalHealthCheckType.ELB,
 * AdditionalHealthCheckType.VPC_LATTICE))
 * .build()))
 * .build();
 * ```
 */
public interface AdditionalHealthChecksOptions {
  /**
   * One or more health check types other than EC2.
   */
  public fun additionalTypes(): List<AdditionalHealthCheckType>

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
   * A builder for [AdditionalHealthChecksOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param additionalTypes One or more health check types other than EC2. 
     */
    public fun additionalTypes(additionalTypes: List<AdditionalHealthCheckType>)

    /**
     * @param additionalTypes One or more health check types other than EC2. 
     */
    public fun additionalTypes(vararg additionalTypes: AdditionalHealthCheckType)

    /**
     * @param gracePeriod Specified the time Auto Scaling waits before checking the health status of
     * an EC2 instance that has come into service and marking it unhealthy due to a failed health
     * check.
     */
    public fun gracePeriod(gracePeriod: Duration)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.autoscaling.AdditionalHealthChecksOptions.Builder =
        software.amazon.awscdk.services.autoscaling.AdditionalHealthChecksOptions.builder()

    /**
     * @param additionalTypes One or more health check types other than EC2. 
     */
    override fun additionalTypes(additionalTypes: List<AdditionalHealthCheckType>) {
      cdkBuilder.additionalTypes(additionalTypes.map(AdditionalHealthCheckType.Companion::unwrap))
    }

    /**
     * @param additionalTypes One or more health check types other than EC2. 
     */
    override fun additionalTypes(vararg additionalTypes: AdditionalHealthCheckType): Unit =
        additionalTypes(additionalTypes.toList())

    /**
     * @param gracePeriod Specified the time Auto Scaling waits before checking the health status of
     * an EC2 instance that has come into service and marking it unhealthy due to a failed health
     * check.
     */
    override fun gracePeriod(gracePeriod: Duration) {
      cdkBuilder.gracePeriod(gracePeriod.let(Duration.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.autoscaling.AdditionalHealthChecksOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.autoscaling.AdditionalHealthChecksOptions,
  ) : CdkObject(cdkObject),
      AdditionalHealthChecksOptions {
    /**
     * One or more health check types other than EC2.
     */
    override fun additionalTypes(): List<AdditionalHealthCheckType> =
        unwrap(this).getAdditionalTypes().map(AdditionalHealthCheckType::wrap)

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
    public operator fun invoke(block: Builder.() -> Unit = {}): AdditionalHealthChecksOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.autoscaling.AdditionalHealthChecksOptions):
        AdditionalHealthChecksOptions = CdkObjectWrappers.wrap(cdkObject) as?
        AdditionalHealthChecksOptions ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: AdditionalHealthChecksOptions):
        software.amazon.awscdk.services.autoscaling.AdditionalHealthChecksOptions = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.autoscaling.AdditionalHealthChecksOptions
  }
}
