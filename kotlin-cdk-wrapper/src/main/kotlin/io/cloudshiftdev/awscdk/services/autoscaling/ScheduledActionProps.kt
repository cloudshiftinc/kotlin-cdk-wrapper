@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.autoscaling

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import java.time.Instant
import kotlin.Number
import kotlin.String
import kotlin.Unit

/**
 * Properties for a scheduled action on an AutoScalingGroup.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.autoscaling.*;
 * AutoScalingGroup autoScalingGroup;
 * Schedule schedule;
 * ScheduledActionProps scheduledActionProps = ScheduledActionProps.builder()
 * .autoScalingGroup(autoScalingGroup)
 * .schedule(schedule)
 * // the properties below are optional
 * .desiredCapacity(123)
 * .endTime(new Date())
 * .maxCapacity(123)
 * .minCapacity(123)
 * .startTime(new Date())
 * .timeZone("timeZone")
 * .build();
 * ```
 */
public interface ScheduledActionProps : BasicScheduledActionProps {
  /**
   * The AutoScalingGroup to apply the scheduled actions to.
   */
  public fun autoScalingGroup(): IAutoScalingGroup

  /**
   * A builder for [ScheduledActionProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param autoScalingGroup The AutoScalingGroup to apply the scheduled actions to. 
     */
    public fun autoScalingGroup(autoScalingGroup: IAutoScalingGroup)

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
    private val cdkBuilder: software.amazon.awscdk.services.autoscaling.ScheduledActionProps.Builder
        = software.amazon.awscdk.services.autoscaling.ScheduledActionProps.builder()

    /**
     * @param autoScalingGroup The AutoScalingGroup to apply the scheduled actions to. 
     */
    override fun autoScalingGroup(autoScalingGroup: IAutoScalingGroup) {
      cdkBuilder.autoScalingGroup(autoScalingGroup.let(IAutoScalingGroup::unwrap))
    }

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

    public fun build(): software.amazon.awscdk.services.autoscaling.ScheduledActionProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.autoscaling.ScheduledActionProps,
  ) : CdkObject(cdkObject), ScheduledActionProps {
    /**
     * The AutoScalingGroup to apply the scheduled actions to.
     */
    override fun autoScalingGroup(): IAutoScalingGroup =
        unwrap(this).getAutoScalingGroup().let(IAutoScalingGroup::wrap)

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
    public operator fun invoke(block: Builder.() -> Unit = {}): ScheduledActionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.autoscaling.ScheduledActionProps):
        ScheduledActionProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ScheduledActionProps):
        software.amazon.awscdk.services.autoscaling.ScheduledActionProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.autoscaling.ScheduledActionProps
  }
}
