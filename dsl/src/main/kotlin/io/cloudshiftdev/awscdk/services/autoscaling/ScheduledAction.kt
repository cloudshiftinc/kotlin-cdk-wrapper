package io.cloudshiftdev.awscdk.services.autoscaling

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import java.time.Instant
import kotlin.Number
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class ScheduledAction internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.autoscaling.ScheduledAction,
) : Resource(cdkObject) {
  /**
   * The name of the scheduled action.
   */
  public open fun scheduledActionName(): String = unwrap(this).getScheduledActionName()

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.autoscaling.ScheduledAction].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The AutoScalingGroup to apply the scheduled actions to.
     *
     * @param autoScalingGroup The AutoScalingGroup to apply the scheduled actions to. 
     */
    public fun autoScalingGroup(autoScalingGroup: IAutoScalingGroup)

    /**
     * The new desired capacity.
     *
     * At the scheduled time, set the desired capacity to the given capacity.
     *
     * At least one of maxCapacity, minCapacity, or desiredCapacity must be supplied.
     *
     * Default: - No new desired capacity.
     *
     * @param desiredCapacity The new desired capacity. 
     */
    public fun desiredCapacity(desiredCapacity: Number)

    /**
     * When this scheduled action expires.
     *
     * Default: - The rule never expires.
     *
     * @param endTime When this scheduled action expires. 
     */
    public fun endTime(endTime: Instant)

    /**
     * The new maximum capacity.
     *
     * At the scheduled time, set the maximum capacity to the given capacity.
     *
     * At least one of maxCapacity, minCapacity, or desiredCapacity must be supplied.
     *
     * Default: - No new maximum capacity.
     *
     * @param maxCapacity The new maximum capacity. 
     */
    public fun maxCapacity(maxCapacity: Number)

    /**
     * The new minimum capacity.
     *
     * At the scheduled time, set the minimum capacity to the given capacity.
     *
     * At least one of maxCapacity, minCapacity, or desiredCapacity must be supplied.
     *
     * Default: - No new minimum capacity.
     *
     * @param minCapacity The new minimum capacity. 
     */
    public fun minCapacity(minCapacity: Number)

    /**
     * When to perform this action.
     *
     * Supports cron expressions.
     *
     * For more information about cron expressions, see https://en.wikipedia.org/wiki/Cron.
     *
     * @param schedule When to perform this action. 
     */
    public fun schedule(schedule: Schedule)

    /**
     * When this scheduled action becomes active.
     *
     * Default: - The rule is activate immediately.
     *
     * @param startTime When this scheduled action becomes active. 
     */
    public fun startTime(startTime: Instant)

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
     *
     * @param timeZone Specifies the time zone for a cron expression. 
     */
    public fun timeZone(timeZone: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.autoscaling.ScheduledAction.Builder =
        software.amazon.awscdk.services.autoscaling.ScheduledAction.Builder.create(scope, id)

    /**
     * The AutoScalingGroup to apply the scheduled actions to.
     *
     * @param autoScalingGroup The AutoScalingGroup to apply the scheduled actions to. 
     */
    override fun autoScalingGroup(autoScalingGroup: IAutoScalingGroup) {
      cdkBuilder.autoScalingGroup(autoScalingGroup.let(IAutoScalingGroup::unwrap))
    }

    /**
     * The new desired capacity.
     *
     * At the scheduled time, set the desired capacity to the given capacity.
     *
     * At least one of maxCapacity, minCapacity, or desiredCapacity must be supplied.
     *
     * Default: - No new desired capacity.
     *
     * @param desiredCapacity The new desired capacity. 
     */
    override fun desiredCapacity(desiredCapacity: Number) {
      cdkBuilder.desiredCapacity(desiredCapacity)
    }

    /**
     * When this scheduled action expires.
     *
     * Default: - The rule never expires.
     *
     * @param endTime When this scheduled action expires. 
     */
    override fun endTime(endTime: Instant) {
      cdkBuilder.endTime(endTime)
    }

    /**
     * The new maximum capacity.
     *
     * At the scheduled time, set the maximum capacity to the given capacity.
     *
     * At least one of maxCapacity, minCapacity, or desiredCapacity must be supplied.
     *
     * Default: - No new maximum capacity.
     *
     * @param maxCapacity The new maximum capacity. 
     */
    override fun maxCapacity(maxCapacity: Number) {
      cdkBuilder.maxCapacity(maxCapacity)
    }

    /**
     * The new minimum capacity.
     *
     * At the scheduled time, set the minimum capacity to the given capacity.
     *
     * At least one of maxCapacity, minCapacity, or desiredCapacity must be supplied.
     *
     * Default: - No new minimum capacity.
     *
     * @param minCapacity The new minimum capacity. 
     */
    override fun minCapacity(minCapacity: Number) {
      cdkBuilder.minCapacity(minCapacity)
    }

    /**
     * When to perform this action.
     *
     * Supports cron expressions.
     *
     * For more information about cron expressions, see https://en.wikipedia.org/wiki/Cron.
     *
     * @param schedule When to perform this action. 
     */
    override fun schedule(schedule: Schedule) {
      cdkBuilder.schedule(schedule.let(Schedule::unwrap))
    }

    /**
     * When this scheduled action becomes active.
     *
     * Default: - The rule is activate immediately.
     *
     * @param startTime When this scheduled action becomes active. 
     */
    override fun startTime(startTime: Instant) {
      cdkBuilder.startTime(startTime)
    }

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
     *
     * @param timeZone Specifies the time zone for a cron expression. 
     */
    override fun timeZone(timeZone: String) {
      cdkBuilder.timeZone(timeZone)
    }

    public fun build(): software.amazon.awscdk.services.autoscaling.ScheduledAction =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): ScheduledAction {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return ScheduledAction(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.autoscaling.ScheduledAction):
        ScheduledAction = ScheduledAction(cdkObject)

    internal fun unwrap(wrapped: ScheduledAction):
        software.amazon.awscdk.services.autoscaling.ScheduledAction = wrapped.cdkObject
  }
}
