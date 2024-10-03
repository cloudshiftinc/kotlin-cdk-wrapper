@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.synthetics

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Schedule for canary runs.
 *
 * Example:
 *
 * ```
 * Canary canary = Canary.Builder.create(this, "MyCanary")
 * .schedule(Schedule.rate(Duration.minutes(5)))
 * .test(Test.custom(CustomTestOptions.builder()
 * .code(Code.fromAsset(join(__dirname, "canary")))
 * .handler("index.handler")
 * .build()))
 * .runtime(Runtime.SYNTHETICS_NODEJS_PUPPETEER_6_2)
 * .activeTracing(true)
 * .build();
 * ```
 */
public open class Schedule(
  cdkObject: software.amazon.awscdk.services.synthetics.Schedule,
) : CdkObject(cdkObject) {
  /**
   * The Schedule expression.
   */
  public open fun expressionString(): String = unwrap(this).getExpressionString()

  public companion object {
    public fun cron(options: CronOptions): Schedule =
        software.amazon.awscdk.services.synthetics.Schedule.cron(options.let(CronOptions.Companion::unwrap)).let(Schedule::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f4520a734c5b3c9911b297d38c8083ddf780e92b19da5f22829eaf1210a2e86c")
    public fun cron(options: CronOptions.Builder.() -> Unit): Schedule = cron(CronOptions(options))

    public fun expression(expression: String): Schedule =
        software.amazon.awscdk.services.synthetics.Schedule.expression(expression).let(Schedule::wrap)

    public fun once(): Schedule =
        software.amazon.awscdk.services.synthetics.Schedule.once().let(Schedule::wrap)

    public fun rate(interval: Duration): Schedule =
        software.amazon.awscdk.services.synthetics.Schedule.rate(interval.let(Duration.Companion::unwrap)).let(Schedule::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.synthetics.Schedule): Schedule =
        Schedule(cdkObject)

    internal fun unwrap(wrapped: Schedule): software.amazon.awscdk.services.synthetics.Schedule =
        wrapped.cdkObject as software.amazon.awscdk.services.synthetics.Schedule
  }
}
