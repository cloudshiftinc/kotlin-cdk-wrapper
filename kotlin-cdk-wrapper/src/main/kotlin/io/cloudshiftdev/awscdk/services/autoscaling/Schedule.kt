@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.autoscaling

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Schedule for scheduled scaling actions.
 *
 * Example:
 *
 * ```
 * AutoScalingGroup autoScalingGroup;
 * autoScalingGroup.scaleOnSchedule("PrescaleInTheMorning", BasicScheduledActionProps.builder()
 * .schedule(Schedule.cron(CronOptions.builder().hour("8").minute("0").build()))
 * .minCapacity(20)
 * .build());
 * autoScalingGroup.scaleOnSchedule("AllowDownscalingAtNight", BasicScheduledActionProps.builder()
 * .schedule(Schedule.cron(CronOptions.builder().hour("20").minute("0").build()))
 * .minCapacity(1)
 * .build());
 * ```
 */
public abstract class Schedule internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.autoscaling.Schedule,
) : CdkObject(cdkObject) {
  /**
   * Retrieve the expression for this schedule.
   */
  public open fun expressionString(): String = unwrap(this).getExpressionString()

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.autoscaling.Schedule,
  ) : Schedule(cdkObject)

  public companion object {
    public fun cron(options: CronOptions): Schedule =
        software.amazon.awscdk.services.autoscaling.Schedule.cron(options.let(CronOptions::unwrap)).let(Schedule::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("af064fd9e0fad094eabe25ea55682bfc02ac054c7d070975a439b1b83317aeba")
    public fun cron(options: CronOptions.Builder.() -> Unit): Schedule = cron(CronOptions(options))

    public fun expression(expression: String): Schedule =
        software.amazon.awscdk.services.autoscaling.Schedule.expression(expression).let(Schedule::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.autoscaling.Schedule): Schedule =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: Schedule): software.amazon.awscdk.services.autoscaling.Schedule =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.autoscaling.Schedule
  }
}
