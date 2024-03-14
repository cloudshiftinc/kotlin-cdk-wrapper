package io.cloudshiftdev.awscdk.services.events

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.Duration
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public abstract class Schedule internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.events.Schedule,
) : CdkObject(cdkObject) {
  /**
   * Retrieve the expression for this schedule.
   */
  public open fun expressionString(): String = unwrap(this).getExpressionString()

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.events.Schedule,
  ) : Schedule(cdkObject)

  public companion object {
    public fun cron(options: CronOptions): Schedule =
        software.amazon.awscdk.services.events.Schedule.cron(options.let(CronOptions::unwrap)).let(Schedule::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0c121adce7fd50c39a14d31e74ad5f9f0fca810eb9b218b8452715471f9ee1b8")
    public fun cron(options: CronOptions.Builder.() -> Unit): Schedule = cron(CronOptions(options))

    public fun expression(expression: String): Schedule =
        software.amazon.awscdk.services.events.Schedule.expression(expression).let(Schedule::wrap)

    public fun rate(duration: Duration): Schedule =
        software.amazon.awscdk.services.events.Schedule.rate(duration.let(Duration::unwrap)).let(Schedule::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.events.Schedule): Schedule =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: Schedule): software.amazon.awscdk.services.events.Schedule =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.events.Schedule
  }
}
