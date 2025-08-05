@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.scheduler

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.kms.IKey
import java.time.Instant
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

/**
 * Construction properties for `Schedule`.
 *
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.services.kinesisfirehose.*;
 * IDeliveryStream deliveryStream;
 * Map&lt;String, String&gt; payload = Map.of(
 * "Data", "record");
 * Schedule.Builder.create(this, "Schedule")
 * .schedule(ScheduleExpression.rate(Duration.minutes(60)))
 * .target(FirehosePutRecord.Builder.create(deliveryStream)
 * .input(ScheduleTargetInput.fromObject(payload))
 * .build())
 * .build();
 * ```
 */
public interface ScheduleProps {
  /**
   * The description you specify for the schedule.
   *
   * Default: - no value
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * Indicates whether the schedule is enabled.
   *
   * Default: true
   */
  public fun enabled(): Boolean? = unwrap(this).getEnabled()

  /**
   * The date, in UTC, before which the schedule can invoke its target.
   *
   * EventBridge Scheduler ignores end for one-time schedules.
   *
   * Default: - no value
   */
  public fun end(): Instant? = unwrap(this).getEnd()

  /**
   * The customer managed KMS key that EventBridge Scheduler will use to encrypt and decrypt your
   * data.
   *
   * Default: - All events in Scheduler are encrypted with a key that AWS owns and manages.
   */
  public fun key(): IKey? = unwrap(this).getKey()?.let(IKey::wrap)

  /**
   * The expression that defines when the schedule runs.
   *
   * Can be either a `at`, `rate`
   * or `cron` expression.
   */
  public fun schedule(): ScheduleExpression

  /**
   * The schedule's group.
   *
   * Default: - By default a schedule will be associated with the `default` group.
   */
  public fun scheduleGroup(): IScheduleGroup? =
      unwrap(this).getScheduleGroup()?.let(IScheduleGroup::wrap)

  /**
   * The name of the schedule.
   *
   * Up to 64 letters (uppercase and lowercase), numbers, hyphens, underscores and dots are allowed.
   *
   * Default: - A unique name will be generated
   */
  public fun scheduleName(): String? = unwrap(this).getScheduleName()

  /**
   * The date, in UTC, after which the schedule can begin invoking its target.
   *
   * EventBridge Scheduler ignores start for one-time schedules.
   *
   * Default: - no value
   */
  public fun start(): Instant? = unwrap(this).getStart()

  /**
   * The schedule's target details.
   */
  public fun target(): IScheduleTarget

  /**
   * A time window during which EventBridge Scheduler invokes the schedule.
   *
   * Default: TimeWindow.off()
   *
   * [Documentation](https://docs.aws.amazon.com/scheduler/latest/UserGuide/managing-schedule-flexible-time-windows.html)
   */
  public fun timeWindow(): TimeWindow? = unwrap(this).getTimeWindow()?.let(TimeWindow::wrap)

  /**
   * A builder for [ScheduleProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param description The description you specify for the schedule.
     */
    public fun description(description: String)

    /**
     * @param enabled Indicates whether the schedule is enabled.
     */
    public fun enabled(enabled: Boolean)

    /**
     * @param end The date, in UTC, before which the schedule can invoke its target.
     * EventBridge Scheduler ignores end for one-time schedules.
     */
    public fun end(end: Instant)

    /**
     * @param key The customer managed KMS key that EventBridge Scheduler will use to encrypt and
     * decrypt your data.
     */
    public fun key(key: IKey)

    /**
     * @param schedule The expression that defines when the schedule runs. 
     * Can be either a `at`, `rate`
     * or `cron` expression.
     */
    public fun schedule(schedule: ScheduleExpression)

    /**
     * @param scheduleGroup The schedule's group.
     */
    public fun scheduleGroup(scheduleGroup: IScheduleGroup)

    /**
     * @param scheduleName The name of the schedule.
     * Up to 64 letters (uppercase and lowercase), numbers, hyphens, underscores and dots are
     * allowed.
     */
    public fun scheduleName(scheduleName: String)

    /**
     * @param start The date, in UTC, after which the schedule can begin invoking its target.
     * EventBridge Scheduler ignores start for one-time schedules.
     */
    public fun start(start: Instant)

    /**
     * @param target The schedule's target details. 
     */
    public fun target(target: IScheduleTarget)

    /**
     * @param timeWindow A time window during which EventBridge Scheduler invokes the schedule.
     */
    public fun timeWindow(timeWindow: TimeWindow)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.scheduler.ScheduleProps.Builder =
        software.amazon.awscdk.services.scheduler.ScheduleProps.builder()

    /**
     * @param description The description you specify for the schedule.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param enabled Indicates whether the schedule is enabled.
     */
    override fun enabled(enabled: Boolean) {
      cdkBuilder.enabled(enabled)
    }

    /**
     * @param end The date, in UTC, before which the schedule can invoke its target.
     * EventBridge Scheduler ignores end for one-time schedules.
     */
    override fun end(end: Instant) {
      cdkBuilder.end(end)
    }

    /**
     * @param key The customer managed KMS key that EventBridge Scheduler will use to encrypt and
     * decrypt your data.
     */
    override fun key(key: IKey) {
      cdkBuilder.key(key.let(IKey.Companion::unwrap))
    }

    /**
     * @param schedule The expression that defines when the schedule runs. 
     * Can be either a `at`, `rate`
     * or `cron` expression.
     */
    override fun schedule(schedule: ScheduleExpression) {
      cdkBuilder.schedule(schedule.let(ScheduleExpression.Companion::unwrap))
    }

    /**
     * @param scheduleGroup The schedule's group.
     */
    override fun scheduleGroup(scheduleGroup: IScheduleGroup) {
      cdkBuilder.scheduleGroup(scheduleGroup.let(IScheduleGroup.Companion::unwrap))
    }

    /**
     * @param scheduleName The name of the schedule.
     * Up to 64 letters (uppercase and lowercase), numbers, hyphens, underscores and dots are
     * allowed.
     */
    override fun scheduleName(scheduleName: String) {
      cdkBuilder.scheduleName(scheduleName)
    }

    /**
     * @param start The date, in UTC, after which the schedule can begin invoking its target.
     * EventBridge Scheduler ignores start for one-time schedules.
     */
    override fun start(start: Instant) {
      cdkBuilder.start(start)
    }

    /**
     * @param target The schedule's target details. 
     */
    override fun target(target: IScheduleTarget) {
      cdkBuilder.target(target.let(IScheduleTarget.Companion::unwrap))
    }

    /**
     * @param timeWindow A time window during which EventBridge Scheduler invokes the schedule.
     */
    override fun timeWindow(timeWindow: TimeWindow) {
      cdkBuilder.timeWindow(timeWindow.let(TimeWindow.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.scheduler.ScheduleProps = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.scheduler.ScheduleProps,
  ) : CdkObject(cdkObject),
      ScheduleProps {
    /**
     * The description you specify for the schedule.
     *
     * Default: - no value
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * Indicates whether the schedule is enabled.
     *
     * Default: true
     */
    override fun enabled(): Boolean? = unwrap(this).getEnabled()

    /**
     * The date, in UTC, before which the schedule can invoke its target.
     *
     * EventBridge Scheduler ignores end for one-time schedules.
     *
     * Default: - no value
     */
    override fun end(): Instant? = unwrap(this).getEnd()

    /**
     * The customer managed KMS key that EventBridge Scheduler will use to encrypt and decrypt your
     * data.
     *
     * Default: - All events in Scheduler are encrypted with a key that AWS owns and manages.
     */
    override fun key(): IKey? = unwrap(this).getKey()?.let(IKey::wrap)

    /**
     * The expression that defines when the schedule runs.
     *
     * Can be either a `at`, `rate`
     * or `cron` expression.
     */
    override fun schedule(): ScheduleExpression =
        unwrap(this).getSchedule().let(ScheduleExpression::wrap)

    /**
     * The schedule's group.
     *
     * Default: - By default a schedule will be associated with the `default` group.
     */
    override fun scheduleGroup(): IScheduleGroup? =
        unwrap(this).getScheduleGroup()?.let(IScheduleGroup::wrap)

    /**
     * The name of the schedule.
     *
     * Up to 64 letters (uppercase and lowercase), numbers, hyphens, underscores and dots are
     * allowed.
     *
     * Default: - A unique name will be generated
     */
    override fun scheduleName(): String? = unwrap(this).getScheduleName()

    /**
     * The date, in UTC, after which the schedule can begin invoking its target.
     *
     * EventBridge Scheduler ignores start for one-time schedules.
     *
     * Default: - no value
     */
    override fun start(): Instant? = unwrap(this).getStart()

    /**
     * The schedule's target details.
     */
    override fun target(): IScheduleTarget = unwrap(this).getTarget().let(IScheduleTarget::wrap)

    /**
     * A time window during which EventBridge Scheduler invokes the schedule.
     *
     * Default: TimeWindow.off()
     *
     * [Documentation](https://docs.aws.amazon.com/scheduler/latest/UserGuide/managing-schedule-flexible-time-windows.html)
     */
    override fun timeWindow(): TimeWindow? = unwrap(this).getTimeWindow()?.let(TimeWindow::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ScheduleProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.scheduler.ScheduleProps):
        ScheduleProps = CdkObjectWrappers.wrap(cdkObject) as? ScheduleProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: ScheduleProps):
        software.amazon.awscdk.services.scheduler.ScheduleProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.scheduler.ScheduleProps
  }
}
