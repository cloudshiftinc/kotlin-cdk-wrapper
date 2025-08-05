@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.scheduler

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String

/**
 * The text or well-formed JSON input passed to the target of the schedule.
 *
 * Tokens and ContextAttribute may be used in the input.
 *
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.services.sns.*;
 * Topic topic = new Topic(this, "Topic");
 * Map&lt;String, String&gt; payload = Map.of(
 * "message", "Hello scheduler!");
 * SnsPublish target = SnsPublish.Builder.create(topic)
 * .input(ScheduleTargetInput.fromObject(payload))
 * .build();
 * Schedule.Builder.create(this, "Schedule")
 * .schedule(ScheduleExpression.rate(Duration.hours(1)))
 * .target(target)
 * .build();
 * ```
 */
public abstract class ScheduleTargetInput(
  cdkObject: software.amazon.awscdk.services.scheduler.ScheduleTargetInput,
) : CdkObject(cdkObject) {
  /**
   * Return the input properties for this input object.
   *
   * @param schedule 
   */
  public open fun bind(schedule: ISchedule): String =
      unwrap(this).bind(schedule.let(ISchedule.Companion::unwrap))

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.scheduler.ScheduleTargetInput,
  ) : ScheduleTargetInput(cdkObject)

  public companion object {
    public fun fromObject(obj: Any): ScheduleTargetInput =
        software.amazon.awscdk.services.scheduler.ScheduleTargetInput.fromObject(obj).let(ScheduleTargetInput::wrap)

    public fun fromText(text: String): ScheduleTargetInput =
        software.amazon.awscdk.services.scheduler.ScheduleTargetInput.fromText(text).let(ScheduleTargetInput::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.scheduler.ScheduleTargetInput):
        ScheduleTargetInput = CdkObjectWrappers.wrap(cdkObject) as? ScheduleTargetInput ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: ScheduleTargetInput):
        software.amazon.awscdk.services.scheduler.ScheduleTargetInput = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.scheduler.ScheduleTargetInput
  }
}
