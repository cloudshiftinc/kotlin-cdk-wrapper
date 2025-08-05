@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.scheduler

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String

/**
 * A time window during which EventBridge Scheduler invokes the schedule.
 *
 * Example:
 *
 * ```
 * LambdaInvoke target;
 * Schedule schedule = Schedule.Builder.create(this, "Schedule")
 * .schedule(ScheduleExpression.rate(Duration.hours(12)))
 * .target(target)
 * .timeWindow(TimeWindow.flexible(Duration.hours(10)))
 * .build();
 * ```
 */
public open class TimeWindow(
  cdkObject: software.amazon.awscdk.services.scheduler.TimeWindow,
) : CdkObject(cdkObject) {
  /**
   * The maximum time window during which the schedule can be invoked.
   *
   * Must be between 1 to 1440 minutes.
   *
   * Default: - no value
   */
  public open fun maxWindow(): Duration? = unwrap(this).getMaxWindow()?.let(Duration::wrap)

  /**
   * Determines whether the schedule is invoked within a flexible time window.
   */
  public open fun mode(): String = unwrap(this).getMode()

  public companion object {
    public fun flexible(maxWindow: Duration): TimeWindow =
        software.amazon.awscdk.services.scheduler.TimeWindow.flexible(maxWindow.let(Duration.Companion::unwrap)).let(TimeWindow::wrap)

    public fun off(): TimeWindow =
        software.amazon.awscdk.services.scheduler.TimeWindow.off().let(TimeWindow::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.scheduler.TimeWindow): TimeWindow =
        TimeWindow(cdkObject)

    internal fun unwrap(wrapped: TimeWindow): software.amazon.awscdk.services.scheduler.TimeWindow =
        wrapped.cdkObject as software.amazon.awscdk.services.scheduler.TimeWindow
  }
}
