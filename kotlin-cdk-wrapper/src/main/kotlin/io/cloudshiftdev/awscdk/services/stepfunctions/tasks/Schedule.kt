@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions.tasks

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkObject
import java.time.Instant
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Schedule for EventBridge Scheduler.
 *
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.services.scheduler.*;
 * import io.cloudshiftdev.awscdk.services.kms.*;
 * Key key;
 * CfnScheduleGroup scheduleGroup;
 * Queue targetQueue;
 * Queue deadLetterQueue;
 * Role schedulerRole = Role.Builder.create(this, "SchedulerRole")
 * .assumedBy(new ServicePrincipal("scheduler.amazonaws.com"))
 * .build();
 * // To send the message to the queue
 * // This policy changes depending on the type of target.
 * schedulerRole.addToPrincipalPolicy(PolicyStatement.Builder.create()
 * .actions(List.of("sqs:SendMessage"))
 * .resources(List.of(targetQueue.getQueueArn()))
 * .build());
 * EventBridgeSchedulerCreateScheduleTask createScheduleTask1 =
 * EventBridgeSchedulerCreateScheduleTask.Builder.create(this, "createSchedule")
 * .scheduleName("TestSchedule")
 * .actionAfterCompletion(ActionAfterCompletion.NONE)
 * .clientToken("testToken")
 * .description("TestDescription")
 * .startDate(new Date())
 * .endDate(new Date(new Date().getTime() + 1000 * 60 * 60))
 * .flexibleTimeWindow(Duration.minutes(5))
 * .groupName(scheduleGroup.getRef())
 * .kmsKey(key)
 * .schedule(Schedule.rate(Duration.minutes(5)))
 * .timezone("UTC")
 * .enabled(true)
 * .target(EventBridgeSchedulerTarget.Builder.create()
 * .arn(targetQueue.getQueueArn())
 * .role(schedulerRole)
 * .retryPolicy(RetryPolicy.builder()
 * .maximumRetryAttempts(2)
 * .maximumEventAge(Duration.minutes(5))
 * .build())
 * .deadLetterQueue(deadLetterQueue)
 * .build())
 * .build();
 * ```
 */
public open class Schedule(
  cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.Schedule,
) : CdkObject(cdkObject) {
  /**
   * The Schedule expression.
   */
  public open fun expressionString(): String = unwrap(this).getExpressionString()

  public companion object {
    public fun cron(options: CronOptions): Schedule =
        software.amazon.awscdk.services.stepfunctions.tasks.Schedule.cron(options.let(CronOptions.Companion::unwrap)).let(Schedule::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a0b122ebce8d45c3d031506e4d9b7f94caee785f7f9c833efaf7651f726a6119")
    public fun cron(options: CronOptions.Builder.() -> Unit): Schedule = cron(CronOptions(options))

    public fun oneTime(time: Instant): Schedule =
        software.amazon.awscdk.services.stepfunctions.tasks.Schedule.oneTime(time).let(Schedule::wrap)

    public fun rate(duration: Duration): Schedule =
        software.amazon.awscdk.services.stepfunctions.tasks.Schedule.rate(duration.let(Duration.Companion::unwrap)).let(Schedule::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.Schedule):
        Schedule = Schedule(cdkObject)

    internal fun unwrap(wrapped: Schedule):
        software.amazon.awscdk.services.stepfunctions.tasks.Schedule = wrapped.cdkObject as
        software.amazon.awscdk.services.stepfunctions.tasks.Schedule
  }
}
