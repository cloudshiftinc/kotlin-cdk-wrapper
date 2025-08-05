@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.scheduler

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.TimeZone
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import java.time.Instant
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * ScheduleExpression for EventBridge Schedule.
 *
 * You can choose from three schedule types when configuring your schedule: rate-based, cron-based,
 * and one-time schedules.
 * Both rate-based and cron-based schedules are recurring schedules.
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
 *
 * [Documentation](https://docs.aws.amazon.com/scheduler/latest/UserGuide/schedule-types.html)
 */
public abstract class ScheduleExpression(
  cdkObject: software.amazon.awscdk.services.scheduler.ScheduleExpression,
) : CdkObject(cdkObject) {
  /**
   * Retrieve the expression for this schedule.
   */
  public open fun expressionString(): String = unwrap(this).getExpressionString()

  /**
   * Retrieve the expression for this schedule.
   */
  public open fun timeZone(): TimeZone? = unwrap(this).getTimeZone()?.let(TimeZone::wrap)

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.scheduler.ScheduleExpression,
  ) : ScheduleExpression(cdkObject)

  public companion object {
    public fun at(date: Instant): ScheduleExpression =
        software.amazon.awscdk.services.scheduler.ScheduleExpression.at(date).let(ScheduleExpression::wrap)

    public fun at(date: Instant, timeZone: TimeZone): ScheduleExpression =
        software.amazon.awscdk.services.scheduler.ScheduleExpression.at(date,
        timeZone.let(TimeZone.Companion::unwrap)).let(ScheduleExpression::wrap)

    public fun cron(options: CronOptionsWithTimezone): ScheduleExpression =
        software.amazon.awscdk.services.scheduler.ScheduleExpression.cron(options.let(CronOptionsWithTimezone.Companion::unwrap)).let(ScheduleExpression::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("edb6cf144b799e4dbac90319f09a881f6e5620415c3b598a5aa5c03787678c74")
    public fun cron(options: CronOptionsWithTimezone.Builder.() -> Unit): ScheduleExpression =
        cron(CronOptionsWithTimezone(options))

    public fun expression(expression: String): ScheduleExpression =
        software.amazon.awscdk.services.scheduler.ScheduleExpression.expression(expression).let(ScheduleExpression::wrap)

    public fun expression(expression: String, timeZone: TimeZone): ScheduleExpression =
        software.amazon.awscdk.services.scheduler.ScheduleExpression.expression(expression,
        timeZone.let(TimeZone.Companion::unwrap)).let(ScheduleExpression::wrap)

    public fun rate(duration: Duration): ScheduleExpression =
        software.amazon.awscdk.services.scheduler.ScheduleExpression.rate(duration.let(Duration.Companion::unwrap)).let(ScheduleExpression::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.scheduler.ScheduleExpression):
        ScheduleExpression = CdkObjectWrappers.wrap(cdkObject) as? ScheduleExpression ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: ScheduleExpression):
        software.amazon.awscdk.services.scheduler.ScheduleExpression = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.scheduler.ScheduleExpression
  }
}
