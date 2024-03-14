package io.cloudshiftdev.awscdk.services.autoscaling

import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public abstract class Schedule internal constructor(
  private val cdkObject: software.amazon.awscdk.services.autoscaling.Schedule,
) {
  public open fun expressionString(): String = unwrap(this).getExpressionString()

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.autoscaling.Schedule,
  ) : Schedule(cdkObject)

  public companion object {
    public open fun cron(options: CronOptions): Schedule =
        software.amazon.awscdk.services.autoscaling.Schedule.cron(options.let(CronOptions::unwrap)).let(Schedule::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("af064fd9e0fad094eabe25ea55682bfc02ac054c7d070975a439b1b83317aeba")
    public open fun cron(options: CronOptions.Builder.() -> Unit): Schedule =
        cron(CronOptions(options))

    public open fun expression(expression: String): Schedule =
        software.amazon.awscdk.services.autoscaling.Schedule.expression(expression).let(Schedule::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.autoscaling.Schedule): Schedule =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: Schedule): software.amazon.awscdk.services.autoscaling.Schedule =
        (wrapped as Wrapper).cdkObject
  }
}
