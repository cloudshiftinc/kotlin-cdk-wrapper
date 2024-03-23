@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.autoscaling

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import java.time.Instant
import kotlin.Number
import kotlin.String
import kotlin.Unit

/**
 * Properties for a scheduled scaling action.
 *
 * Example:
 *
 * ```
 * AutoScalingGroup autoScalingGroup;
 * autoScalingGroup.scaleOnSchedule("PrescaleInTheMorning", BasicScheduledActionProps.builder()
 * .schedule(Schedule.cron(CronOptions.builder().hour("8").minute("0").build()))
 * .minCapacity(20)
 * .build());
 * autoScalingGroup.scaleOnSchedule("AllowDownscalingAtNight", BasicScheduledActionProps.builder()
 * .schedule(Schedule.cron(CronOptions.builder().hour("20").minute("0").build()))
 * .minCapacity(1)
 * .build());
 * ```
 */
public interface BasicScheduledActionProps {
  /**
   * The new desired capacity.
   *
   * At the scheduled time, set the desired capacity to the given capacity.
   *
   * At least one of maxCapacity, minCapacity, or desiredCapacity must be supplied.
   *
   * Default: - No new desired capacity.
   */
  public fun desiredCapacity(): Number? = unwrap(this).getDesiredCapacity()

  /**
   * When this scheduled action expires.
   *
   * Default: - The rule never expires.
   */
  public fun endTime(): Instant? = unwrap(this).getEndTime()

  /**
   * The new maximum capacity.
   *
   * At the scheduled time, set the maximum capacity to the given capacity.
   *
   * At least one of maxCapacity, minCapacity, or desiredCapacity must be supplied.
   *
   * Default: - No new maximum capacity.
   */
  public fun maxCapacity(): Number? = unwrap(this).getMaxCapacity()

  /**
   * The new minimum capacity.
   *
   * At the scheduled time, set the minimum capacity to the given capacity.
   *
   * At least one of maxCapacity, minCapacity, or desiredCapacity must be supplied.
   *
   * Default: - No new minimum capacity.
   */
  public fun minCapacity(): Number? = unwrap(this).getMinCapacity()

  /**
   * When to perform this action.
   *
   * Supports cron expressions.
   *
   * For more information about cron expressions, see https://en.wikipedia.org/wiki/Cron.
   */
  public fun schedule(): Schedule

  /**
   * When this scheduled action becomes active.
   *
   * Default: - The rule is activate immediately.
   */
  public fun startTime(): Instant? = unwrap(this).getStartTime()

  /**
   * Specifies the time zone for a cron expression.
   *
   * If a time zone is not provided, UTC is used by default.
   *
   * Valid values are the canonical names of the IANA time zones, derived from the IANA Time Zone
   * Database (such as Etc/GMT+9 or Pacific/Tahiti).
   *
   * For more information, see https://en.wikipedia.org/wiki/List_of_tz_database_time_zones.
   *
   * Default: - UTC
   */
  public fun timeZone(): String? = unwrap(this).getTimeZone()

  /**
   * A builder for [BasicScheduledActionProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param desiredCapacity The new desired capacity.
     * At the scheduled time, set the desired capacity to the given capacity.
     *
     * At least one of maxCapacity, minCapacity, or desiredCapacity must be supplied.
     */
    public fun desiredCapacity(desiredCapacity: Number)

    /**
     * @param endTime When this scheduled action expires.
     */
    public fun endTime(endTime: Instant)

    /**
     * @param maxCapacity The new maximum capacity.
     * At the scheduled time, set the maximum capacity to the given capacity.
     *
     * At least one of maxCapacity, minCapacity, or desiredCapacity must be supplied.
     */
    public fun maxCapacity(maxCapacity: Number)

    /**
     * @param minCapacity The new minimum capacity.
     * At the scheduled time, set the minimum capacity to the given capacity.
     *
     * At least one of maxCapacity, minCapacity, or desiredCapacity must be supplied.
     */
    public fun minCapacity(minCapacity: Number)

    /**
     * @param schedule When to perform this action. 
     * Supports cron expressions.
     *
     * For more information about cron expressions, see https://en.wikipedia.org/wiki/Cron.
     */
    public fun schedule(schedule: Schedule)

    /**
     * @param startTime When this scheduled action becomes active.
     */
    public fun startTime(startTime: Instant)

    /**
     * @param timeZone Specifies the time zone for a cron expression.
     * If a time zone is not provided, UTC is used by default.
     *
     * Valid values are the canonical names of the IANA time zones, derived from the IANA Time Zone
     * Database (such as Etc/GMT+9 or Pacific/Tahiti).
     *
     * For more information, see https://en.wikipedia.org/wiki/List_of_tz_database_time_zones.
     */
    public fun timeZone(timeZone: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.autoscaling.BasicScheduledActionProps.Builder =
        software.amazon.awscdk.services.autoscaling.BasicScheduledActionProps.builder()

    /**
     * @param desiredCapacity The new desired capacity.
     * At the scheduled time, set the desired capacity to the given capacity.
     *
     * At least one of maxCapacity, minCapacity, or desiredCapacity must be supplied.
     */
    override fun desiredCapacity(desiredCapacity: Number) {
      cdkBuilder.desiredCapacity(desiredCapacity)
    }

    /**
     * @param endTime When this scheduled action expires.
     */
    override fun endTime(endTime: Instant) {
      cdkBuilder.endTime(endTime)
    }

    /**
     * @param maxCapacity The new maximum capacity.
     * At the scheduled time, set the maximum capacity to the given capacity.
     *
     * At least one of maxCapacity, minCapacity, or desiredCapacity must be supplied.
     */
    override fun maxCapacity(maxCapacity: Number) {
      cdkBuilder.maxCapacity(maxCapacity)
    }

    /**
     * @param minCapacity The new minimum capacity.
     * At the scheduled time, set the minimum capacity to the given capacity.
     *
     * At least one of maxCapacity, minCapacity, or desiredCapacity must be supplied.
     */
    override fun minCapacity(minCapacity: Number) {
      cdkBuilder.minCapacity(minCapacity)
    }

    /**
     * @param schedule When to perform this action. 
     * Supports cron expressions.
     *
     * For more information about cron expressions, see https://en.wikipedia.org/wiki/Cron.
     */
    override fun schedule(schedule: Schedule) {
      cdkBuilder.schedule(schedule.let(Schedule::unwrap))
    }

    /**
     * @param startTime When this scheduled action becomes active.
     */
    override fun startTime(startTime: Instant) {
      cdkBuilder.startTime(startTime)
    }

    /**
     * @param timeZone Specifies the time zone for a cron expression.
     * If a time zone is not provided, UTC is used by default.
     *
     * Valid values are the canonical names of the IANA time zones, derived from the IANA Time Zone
     * Database (such as Etc/GMT+9 or Pacific/Tahiti).
     *
     * For more information, see https://en.wikipedia.org/wiki/List_of_tz_database_time_zones.
     */
    override fun timeZone(timeZone: String) {
      cdkBuilder.timeZone(timeZone)
    }

    public fun build(): software.amazon.awscdk.services.autoscaling.BasicScheduledActionProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.autoscaling.BasicScheduledActionProps,
  ) : CdkObject(cdkObject), BasicScheduledActionProps {
    /**
     * The new desired capacity.
     *
     * At the scheduled time, set the desired capacity to the given capacity.
     *
     * At least one of maxCapacity, minCapacity, or desiredCapacity must be supplied.
     *
     * Default: - No new desired capacity.
     */
    override fun desiredCapacity(): Number? = unwrap(this).getDesiredCapacity()

    /**
     * When this scheduled action expires.
     *
     * Default: - The rule never expires.
     */
    override fun endTime(): Instant? = unwrap(this).getEndTime()

    /**
     * The new maximum capacity.
     *
     * At the scheduled time, set the maximum capacity to the given capacity.
     *
     * At least one of maxCapacity, minCapacity, or desiredCapacity must be supplied.
     *
     * Default: - No new maximum capacity.
     */
    override fun maxCapacity(): Number? = unwrap(this).getMaxCapacity()

    /**
     * The new minimum capacity.
     *
     * At the scheduled time, set the minimum capacity to the given capacity.
     *
     * At least one of maxCapacity, minCapacity, or desiredCapacity must be supplied.
     *
     * Default: - No new minimum capacity.
     */
    override fun minCapacity(): Number? = unwrap(this).getMinCapacity()

    /**
     * When to perform this action.
     *
     * Supports cron expressions.
     *
     * For more information about cron expressions, see https://en.wikipedia.org/wiki/Cron.
     */
    override fun schedule(): Schedule = unwrap(this).getSchedule().let(Schedule::wrap)

    /**
     * When this scheduled action becomes active.
     *
     * Default: - The rule is activate immediately.
     */
    override fun startTime(): Instant? = unwrap(this).getStartTime()

    /**
     * Specifies the time zone for a cron expression.
     *
     * If a time zone is not provided, UTC is used by default.
     *
     * Valid values are the canonical names of the IANA time zones, derived from the IANA Time Zone
     * Database (such as Etc/GMT+9 or Pacific/Tahiti).
     *
     * For more information, see https://en.wikipedia.org/wiki/List_of_tz_database_time_zones.
     *
     * Default: - UTC
     */
    override fun timeZone(): String? = unwrap(this).getTimeZone()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): BasicScheduledActionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.autoscaling.BasicScheduledActionProps):
        BasicScheduledActionProps = CdkObjectWrappers.wrap(cdkObject) as? BasicScheduledActionProps
        ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: BasicScheduledActionProps):
        software.amazon.awscdk.services.autoscaling.BasicScheduledActionProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.autoscaling.BasicScheduledActionProps
  }
}
