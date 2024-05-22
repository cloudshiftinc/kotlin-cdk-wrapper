@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.events

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Schedule for scheduled event rules.
 *
 * Note that rates cannot be defined in fractions of minutes.
 *
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.services.ecs.*;
 * ICluster cluster;
 * TaskDefinition taskDefinition;
 * Rule rule = Rule.Builder.create(this, "Rule")
 * .schedule(Schedule.rate(Duration.hours(1)))
 * .build();
 * rule.addTarget(
 * EcsTask.Builder.create()
 * .cluster(cluster)
 * .taskDefinition(taskDefinition)
 * .propagateTags(PropagatedTagSource.TASK_DEFINITION)
 * .tags(List.of(Tag.builder()
 * .key("my-tag")
 * .value("my-tag-value")
 * .build()))
 * .build());
 * ```
 *
 * [Documentation](https://docs.aws.amazon.com/eventbridge/latest/userguide/scheduled-events.html)
 */
public abstract class Schedule(
  cdkObject: software.amazon.awscdk.services.events.Schedule,
) : CdkObject(cdkObject) {
  /**
   * Retrieve the expression for this schedule.
   */
  public open fun expressionString(): String = unwrap(this).getExpressionString()

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.events.Schedule,
  ) : Schedule(cdkObject)

  public companion object {
    public fun cron(options: CronOptions): Schedule =
        software.amazon.awscdk.services.events.Schedule.cron(options.let(CronOptions.Companion::unwrap)).let(Schedule::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0c121adce7fd50c39a14d31e74ad5f9f0fca810eb9b218b8452715471f9ee1b8")
    public fun cron(options: CronOptions.Builder.() -> Unit): Schedule = cron(CronOptions(options))

    public fun expression(expression: String): Schedule =
        software.amazon.awscdk.services.events.Schedule.expression(expression).let(Schedule::wrap)

    public fun rate(duration: Duration): Schedule =
        software.amazon.awscdk.services.events.Schedule.rate(duration.let(Duration.Companion::unwrap)).let(Schedule::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.events.Schedule): Schedule =
        CdkObjectWrappers.wrap(cdkObject) as? Schedule ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: Schedule): software.amazon.awscdk.services.events.Schedule =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.events.Schedule
  }
}
