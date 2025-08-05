@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.scheduler

import io.cloudshiftdev.awscdk.TimeZone
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.events.CronOptions
import kotlin.String
import kotlin.Unit

/**
 * Options to configure a cron expression.
 *
 * All fields are strings so you can use complex expressions. Absence of
 * a field implies '*' or '?', whichever one is appropriate.
 *
 * Example:
 *
 * ```
 * LambdaInvoke target;
 * Schedule rateBasedSchedule = Schedule.Builder.create(this, "Schedule")
 * .schedule(ScheduleExpression.rate(Duration.minutes(10)))
 * .target(target)
 * .description("This is a test rate-based schedule")
 * .build();
 * Schedule cronBasedSchedule = Schedule.Builder.create(this, "Schedule")
 * .schedule(ScheduleExpression.cron(CronOptionsWithTimezone.builder()
 * .minute("0")
 * .hour("23")
 * .day("20")
 * .month("11")
 * .timeZone(TimeZone.AMERICA_NEW_YORK)
 * .build()))
 * .target(target)
 * .description("This is a test cron-based schedule that will run at 11:00 PM, on day 20 of the
 * month, only in November in New York timezone")
 * .build();
 * ```
 *
 * [Documentation](https://docs.aws.amazon.com/eventbridge/latest/userguide/scheduled-events.html#cron-expressions)
 */
public interface CronOptionsWithTimezone : CronOptions {
  /**
   * The timezone to run the schedule in.
   *
   * Default: - TimeZone.ETC_UTC
   */
  public fun timeZone(): TimeZone? = unwrap(this).getTimeZone()?.let(TimeZone::wrap)

  /**
   * A builder for [CronOptionsWithTimezone]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param day The day of the month to run this rule at.
     */
    public fun day(day: String)

    /**
     * @param hour The hour to run this rule at.
     */
    public fun hour(hour: String)

    /**
     * @param minute The minute to run this rule at.
     */
    public fun minute(minute: String)

    /**
     * @param month The month to run this rule at.
     */
    public fun month(month: String)

    /**
     * @param timeZone The timezone to run the schedule in.
     */
    public fun timeZone(timeZone: TimeZone)

    /**
     * @param weekDay The day of the week to run this rule at.
     */
    public fun weekDay(weekDay: String)

    /**
     * @param year The year to run this rule at.
     */
    public fun year(year: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.scheduler.CronOptionsWithTimezone.Builder =
        software.amazon.awscdk.services.scheduler.CronOptionsWithTimezone.builder()

    /**
     * @param day The day of the month to run this rule at.
     */
    override fun day(day: String) {
      cdkBuilder.day(day)
    }

    /**
     * @param hour The hour to run this rule at.
     */
    override fun hour(hour: String) {
      cdkBuilder.hour(hour)
    }

    /**
     * @param minute The minute to run this rule at.
     */
    override fun minute(minute: String) {
      cdkBuilder.minute(minute)
    }

    /**
     * @param month The month to run this rule at.
     */
    override fun month(month: String) {
      cdkBuilder.month(month)
    }

    /**
     * @param timeZone The timezone to run the schedule in.
     */
    override fun timeZone(timeZone: TimeZone) {
      cdkBuilder.timeZone(timeZone.let(TimeZone.Companion::unwrap))
    }

    /**
     * @param weekDay The day of the week to run this rule at.
     */
    override fun weekDay(weekDay: String) {
      cdkBuilder.weekDay(weekDay)
    }

    /**
     * @param year The year to run this rule at.
     */
    override fun year(year: String) {
      cdkBuilder.year(year)
    }

    public fun build(): software.amazon.awscdk.services.scheduler.CronOptionsWithTimezone =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.scheduler.CronOptionsWithTimezone,
  ) : CdkObject(cdkObject),
      CronOptionsWithTimezone {
    /**
     * The day of the month to run this rule at.
     *
     * Default: - Every day of the month
     */
    override fun day(): String? = unwrap(this).getDay()

    /**
     * The hour to run this rule at.
     *
     * Default: - Every hour
     */
    override fun hour(): String? = unwrap(this).getHour()

    /**
     * The minute to run this rule at.
     *
     * Default: - Every minute
     */
    override fun minute(): String? = unwrap(this).getMinute()

    /**
     * The month to run this rule at.
     *
     * Default: - Every month
     */
    override fun month(): String? = unwrap(this).getMonth()

    /**
     * The timezone to run the schedule in.
     *
     * Default: - TimeZone.ETC_UTC
     */
    override fun timeZone(): TimeZone? = unwrap(this).getTimeZone()?.let(TimeZone::wrap)

    /**
     * The day of the week to run this rule at.
     *
     * Default: - Any day of the week
     */
    override fun weekDay(): String? = unwrap(this).getWeekDay()

    /**
     * The year to run this rule at.
     *
     * Default: - Every year
     */
    override fun year(): String? = unwrap(this).getYear()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CronOptionsWithTimezone {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.scheduler.CronOptionsWithTimezone):
        CronOptionsWithTimezone = CdkObjectWrappers.wrap(cdkObject) as? CronOptionsWithTimezone ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CronOptionsWithTimezone):
        software.amazon.awscdk.services.scheduler.CronOptionsWithTimezone = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.scheduler.CronOptionsWithTimezone
  }
}
