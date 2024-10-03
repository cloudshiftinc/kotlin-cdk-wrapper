@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.applicationautoscaling

import io.cloudshiftdev.awscdk.TimeZone
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import java.time.Instant
import kotlin.Number
import kotlin.Unit

/**
 * A scheduled scaling action.
 *
 * Example:
 *
 * ```
 * Cluster cluster;
 * ApplicationLoadBalancedFargateService loadBalancedFargateService =
 * ApplicationLoadBalancedFargateService.Builder.create(this, "Service")
 * .cluster(cluster)
 * .memoryLimitMiB(1024)
 * .desiredCount(1)
 * .cpu(512)
 * .taskImageOptions(ApplicationLoadBalancedTaskImageOptions.builder()
 * .image(ContainerImage.fromRegistry("amazon/amazon-ecs-sample"))
 * .build())
 * .build();
 * ScalableTaskCount scalableTarget =
 * loadBalancedFargateService.service.autoScaleTaskCount(EnableScalingProps.builder()
 * .minCapacity(5)
 * .maxCapacity(20)
 * .build());
 * scalableTarget.scaleOnSchedule("DaytimeScaleDown", ScalingSchedule.builder()
 * .schedule(Schedule.cron(CronOptions.builder().hour("8").minute("0").build()))
 * .minCapacity(1)
 * .build());
 * scalableTarget.scaleOnSchedule("EveningRushScaleUp", ScalingSchedule.builder()
 * .schedule(Schedule.cron(CronOptions.builder().hour("20").minute("0").build()))
 * .minCapacity(10)
 * .build());
 * ```
 */
public interface ScalingSchedule {
  /**
   * When this scheduled action expires.
   *
   * Default: The rule never expires.
   */
  public fun endTime(): Instant? = unwrap(this).getEndTime()

  /**
   * The new maximum capacity.
   *
   * During the scheduled time, the current capacity is above the maximum
   * capacity, Application Auto Scaling scales in to the maximum capacity.
   *
   * At least one of maxCapacity and minCapacity must be supplied.
   *
   * Default: No new maximum capacity
   */
  public fun maxCapacity(): Number? = unwrap(this).getMaxCapacity()

  /**
   * The new minimum capacity.
   *
   * During the scheduled time, if the current capacity is below the minimum
   * capacity, Application Auto Scaling scales out to the minimum capacity.
   *
   * At least one of maxCapacity and minCapacity must be supplied.
   *
   * Default: No new minimum capacity
   */
  public fun minCapacity(): Number? = unwrap(this).getMinCapacity()

  /**
   * When to perform this action.
   */
  public fun schedule(): Schedule

  /**
   * When this scheduled action becomes active.
   *
   * Default: The rule is activate immediately
   */
  public fun startTime(): Instant? = unwrap(this).getStartTime()

  /**
   * The time zone used when referring to the date and time of a scheduled action, when the
   * scheduled action uses an at or cron expression.
   *
   * Default: - UTC
   */
  public fun timeZone(): TimeZone? = unwrap(this).getTimeZone()?.let(TimeZone::wrap)

  /**
   * A builder for [ScalingSchedule]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param endTime When this scheduled action expires.
     */
    public fun endTime(endTime: Instant)

    /**
     * @param maxCapacity The new maximum capacity.
     * During the scheduled time, the current capacity is above the maximum
     * capacity, Application Auto Scaling scales in to the maximum capacity.
     *
     * At least one of maxCapacity and minCapacity must be supplied.
     */
    public fun maxCapacity(maxCapacity: Number)

    /**
     * @param minCapacity The new minimum capacity.
     * During the scheduled time, if the current capacity is below the minimum
     * capacity, Application Auto Scaling scales out to the minimum capacity.
     *
     * At least one of maxCapacity and minCapacity must be supplied.
     */
    public fun minCapacity(minCapacity: Number)

    /**
     * @param schedule When to perform this action. 
     */
    public fun schedule(schedule: Schedule)

    /**
     * @param startTime When this scheduled action becomes active.
     */
    public fun startTime(startTime: Instant)

    /**
     * @param timeZone The time zone used when referring to the date and time of a scheduled action,
     * when the scheduled action uses an at or cron expression.
     */
    public fun timeZone(timeZone: TimeZone)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.applicationautoscaling.ScalingSchedule.Builder =
        software.amazon.awscdk.services.applicationautoscaling.ScalingSchedule.builder()

    /**
     * @param endTime When this scheduled action expires.
     */
    override fun endTime(endTime: Instant) {
      cdkBuilder.endTime(endTime)
    }

    /**
     * @param maxCapacity The new maximum capacity.
     * During the scheduled time, the current capacity is above the maximum
     * capacity, Application Auto Scaling scales in to the maximum capacity.
     *
     * At least one of maxCapacity and minCapacity must be supplied.
     */
    override fun maxCapacity(maxCapacity: Number) {
      cdkBuilder.maxCapacity(maxCapacity)
    }

    /**
     * @param minCapacity The new minimum capacity.
     * During the scheduled time, if the current capacity is below the minimum
     * capacity, Application Auto Scaling scales out to the minimum capacity.
     *
     * At least one of maxCapacity and minCapacity must be supplied.
     */
    override fun minCapacity(minCapacity: Number) {
      cdkBuilder.minCapacity(minCapacity)
    }

    /**
     * @param schedule When to perform this action. 
     */
    override fun schedule(schedule: Schedule) {
      cdkBuilder.schedule(schedule.let(Schedule.Companion::unwrap))
    }

    /**
     * @param startTime When this scheduled action becomes active.
     */
    override fun startTime(startTime: Instant) {
      cdkBuilder.startTime(startTime)
    }

    /**
     * @param timeZone The time zone used when referring to the date and time of a scheduled action,
     * when the scheduled action uses an at or cron expression.
     */
    override fun timeZone(timeZone: TimeZone) {
      cdkBuilder.timeZone(timeZone.let(TimeZone.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.applicationautoscaling.ScalingSchedule =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.applicationautoscaling.ScalingSchedule,
  ) : CdkObject(cdkObject),
      ScalingSchedule {
    /**
     * When this scheduled action expires.
     *
     * Default: The rule never expires.
     */
    override fun endTime(): Instant? = unwrap(this).getEndTime()

    /**
     * The new maximum capacity.
     *
     * During the scheduled time, the current capacity is above the maximum
     * capacity, Application Auto Scaling scales in to the maximum capacity.
     *
     * At least one of maxCapacity and minCapacity must be supplied.
     *
     * Default: No new maximum capacity
     */
    override fun maxCapacity(): Number? = unwrap(this).getMaxCapacity()

    /**
     * The new minimum capacity.
     *
     * During the scheduled time, if the current capacity is below the minimum
     * capacity, Application Auto Scaling scales out to the minimum capacity.
     *
     * At least one of maxCapacity and minCapacity must be supplied.
     *
     * Default: No new minimum capacity
     */
    override fun minCapacity(): Number? = unwrap(this).getMinCapacity()

    /**
     * When to perform this action.
     */
    override fun schedule(): Schedule = unwrap(this).getSchedule().let(Schedule::wrap)

    /**
     * When this scheduled action becomes active.
     *
     * Default: The rule is activate immediately
     */
    override fun startTime(): Instant? = unwrap(this).getStartTime()

    /**
     * The time zone used when referring to the date and time of a scheduled action, when the
     * scheduled action uses an at or cron expression.
     *
     * Default: - UTC
     */
    override fun timeZone(): TimeZone? = unwrap(this).getTimeZone()?.let(TimeZone::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ScalingSchedule {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.applicationautoscaling.ScalingSchedule):
        ScalingSchedule = CdkObjectWrappers.wrap(cdkObject) as? ScalingSchedule ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: ScalingSchedule):
        software.amazon.awscdk.services.applicationautoscaling.ScalingSchedule = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.applicationautoscaling.ScalingSchedule
  }
}
