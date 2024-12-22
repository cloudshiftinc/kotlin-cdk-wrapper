@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions.tasks

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Number
import kotlin.Unit

/**
 * The information about the retry policy settings.
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
public interface RetryPolicy {
  /**
   * The maximum amount of time to continue to make retry attempts.
   */
  public fun maximumEventAge(): Duration

  /**
   * The maximum number of retry attempts to make before the request fails.
   */
  public fun maximumRetryAttempts(): Number

  /**
   * A builder for [RetryPolicy]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param maximumEventAge The maximum amount of time to continue to make retry attempts. 
     */
    public fun maximumEventAge(maximumEventAge: Duration)

    /**
     * @param maximumRetryAttempts The maximum number of retry attempts to make before the request
     * fails. 
     */
    public fun maximumRetryAttempts(maximumRetryAttempts: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.stepfunctions.tasks.RetryPolicy.Builder
        = software.amazon.awscdk.services.stepfunctions.tasks.RetryPolicy.builder()

    /**
     * @param maximumEventAge The maximum amount of time to continue to make retry attempts. 
     */
    override fun maximumEventAge(maximumEventAge: Duration) {
      cdkBuilder.maximumEventAge(maximumEventAge.let(Duration.Companion::unwrap))
    }

    /**
     * @param maximumRetryAttempts The maximum number of retry attempts to make before the request
     * fails. 
     */
    override fun maximumRetryAttempts(maximumRetryAttempts: Number) {
      cdkBuilder.maximumRetryAttempts(maximumRetryAttempts)
    }

    public fun build(): software.amazon.awscdk.services.stepfunctions.tasks.RetryPolicy =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.RetryPolicy,
  ) : CdkObject(cdkObject),
      RetryPolicy {
    /**
     * The maximum amount of time to continue to make retry attempts.
     */
    override fun maximumEventAge(): Duration = unwrap(this).getMaximumEventAge().let(Duration::wrap)

    /**
     * The maximum number of retry attempts to make before the request fails.
     */
    override fun maximumRetryAttempts(): Number = unwrap(this).getMaximumRetryAttempts()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): RetryPolicy {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.RetryPolicy):
        RetryPolicy = CdkObjectWrappers.wrap(cdkObject) as? RetryPolicy ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: RetryPolicy):
        software.amazon.awscdk.services.stepfunctions.tasks.RetryPolicy = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.stepfunctions.tasks.RetryPolicy
  }
}
