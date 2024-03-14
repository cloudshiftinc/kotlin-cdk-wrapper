package io.cloudshiftdev.awscdk.services.applicationautoscaling

import io.cloudshiftdev.awscdk.Duration
import java.time.Instant
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public abstract class Schedule internal constructor(
  private val cdkObject: software.amazon.awscdk.services.applicationautoscaling.Schedule,
) {
  /**
   * Retrieve the expression for this schedule.
   */
  public open fun expressionString(): String = unwrap(this).getExpressionString()

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.applicationautoscaling.Schedule,
  ) : Schedule(cdkObject)

  public companion object {
    public fun at(moment: Instant): Schedule =
        software.amazon.awscdk.services.applicationautoscaling.Schedule.at(moment).let(Schedule::wrap)

    public fun cron(options: CronOptions): Schedule =
        software.amazon.awscdk.services.applicationautoscaling.Schedule.cron(options.let(CronOptions::unwrap)).let(Schedule::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("cc37d243eb40a26b390350f82df5c8784ed9081b5ef885cdfd0f5184b3fc1407")
    public fun cron(options: CronOptions.Builder.() -> Unit): Schedule = cron(CronOptions(options))

    public fun expression(expression: String): Schedule =
        software.amazon.awscdk.services.applicationautoscaling.Schedule.expression(expression).let(Schedule::wrap)

    public fun rate(duration: Duration): Schedule =
        software.amazon.awscdk.services.applicationautoscaling.Schedule.rate(duration.let(Duration::unwrap)).let(Schedule::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.applicationautoscaling.Schedule):
        Schedule = Wrapper(cdkObject)

    internal fun unwrap(wrapped: Schedule):
        software.amazon.awscdk.services.applicationautoscaling.Schedule = (wrapped as
        Wrapper).cdkObject
  }
}
