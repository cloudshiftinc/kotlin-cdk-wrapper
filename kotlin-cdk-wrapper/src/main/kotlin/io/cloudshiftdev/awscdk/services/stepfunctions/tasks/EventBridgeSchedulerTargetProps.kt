@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions.tasks

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.iam.IRole
import io.cloudshiftdev.awscdk.services.sqs.IQueue
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Properties for `EventBridgeSchedulerTarget`.
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
 *
 * [Documentation](https://docs.aws.amazon.com/scheduler/latest/APIReference/API_Target.html#API_Target_Contents)
 */
public interface EventBridgeSchedulerTargetProps {
  /**
   * The Amazon Resource Name (ARN) of the target.
   *
   * [Documentation](https://docs.aws.amazon.com/scheduler/latest/UserGuide/managing-targets.html)
   */
  public fun arn(): String

  /**
   * Dead letter queue for failed events.
   *
   * Default: - No dead letter queue
   */
  public fun deadLetterQueue(): IQueue? = unwrap(this).getDeadLetterQueue()?.let(IQueue::wrap)

  /**
   * The input to the target.
   *
   * Default: - EventBridge Scheduler delivers a default notification to the target
   */
  public fun input(): String? = unwrap(this).getInput()

  /**
   * The retry policy settings.
   *
   * Default: - Do not retry
   */
  public fun retryPolicy(): RetryPolicy? = unwrap(this).getRetryPolicy()?.let(RetryPolicy::wrap)

  /**
   * The IAM role that EventBridge Scheduler will use for this target when the schedule is invoked.
   */
  public fun role(): IRole

  /**
   * A builder for [EventBridgeSchedulerTargetProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param arn The Amazon Resource Name (ARN) of the target. 
     */
    public fun arn(arn: String)

    /**
     * @param deadLetterQueue Dead letter queue for failed events.
     */
    public fun deadLetterQueue(deadLetterQueue: IQueue)

    /**
     * @param input The input to the target.
     */
    public fun input(input: String)

    /**
     * @param retryPolicy The retry policy settings.
     */
    public fun retryPolicy(retryPolicy: RetryPolicy)

    /**
     * @param retryPolicy The retry policy settings.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5542acab5db7593179d98ab60773c9593fef4b73753a7c9dcaf531cad1b59209")
    public fun retryPolicy(retryPolicy: RetryPolicy.Builder.() -> Unit)

    /**
     * @param role The IAM role that EventBridge Scheduler will use for this target when the
     * schedule is invoked. 
     */
    public fun role(role: IRole)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.stepfunctions.tasks.EventBridgeSchedulerTargetProps.Builder
        =
        software.amazon.awscdk.services.stepfunctions.tasks.EventBridgeSchedulerTargetProps.builder()

    /**
     * @param arn The Amazon Resource Name (ARN) of the target. 
     */
    override fun arn(arn: String) {
      cdkBuilder.arn(arn)
    }

    /**
     * @param deadLetterQueue Dead letter queue for failed events.
     */
    override fun deadLetterQueue(deadLetterQueue: IQueue) {
      cdkBuilder.deadLetterQueue(deadLetterQueue.let(IQueue.Companion::unwrap))
    }

    /**
     * @param input The input to the target.
     */
    override fun input(input: String) {
      cdkBuilder.input(input)
    }

    /**
     * @param retryPolicy The retry policy settings.
     */
    override fun retryPolicy(retryPolicy: RetryPolicy) {
      cdkBuilder.retryPolicy(retryPolicy.let(RetryPolicy.Companion::unwrap))
    }

    /**
     * @param retryPolicy The retry policy settings.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5542acab5db7593179d98ab60773c9593fef4b73753a7c9dcaf531cad1b59209")
    override fun retryPolicy(retryPolicy: RetryPolicy.Builder.() -> Unit): Unit =
        retryPolicy(RetryPolicy(retryPolicy))

    /**
     * @param role The IAM role that EventBridge Scheduler will use for this target when the
     * schedule is invoked. 
     */
    override fun role(role: IRole) {
      cdkBuilder.role(role.let(IRole.Companion::unwrap))
    }

    public fun build():
        software.amazon.awscdk.services.stepfunctions.tasks.EventBridgeSchedulerTargetProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.EventBridgeSchedulerTargetProps,
  ) : CdkObject(cdkObject),
      EventBridgeSchedulerTargetProps {
    /**
     * The Amazon Resource Name (ARN) of the target.
     *
     * [Documentation](https://docs.aws.amazon.com/scheduler/latest/UserGuide/managing-targets.html)
     */
    override fun arn(): String = unwrap(this).getArn()

    /**
     * Dead letter queue for failed events.
     *
     * Default: - No dead letter queue
     */
    override fun deadLetterQueue(): IQueue? = unwrap(this).getDeadLetterQueue()?.let(IQueue::wrap)

    /**
     * The input to the target.
     *
     * Default: - EventBridge Scheduler delivers a default notification to the target
     */
    override fun input(): String? = unwrap(this).getInput()

    /**
     * The retry policy settings.
     *
     * Default: - Do not retry
     */
    override fun retryPolicy(): RetryPolicy? = unwrap(this).getRetryPolicy()?.let(RetryPolicy::wrap)

    /**
     * The IAM role that EventBridge Scheduler will use for this target when the schedule is
     * invoked.
     */
    override fun role(): IRole = unwrap(this).getRole().let(IRole::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): EventBridgeSchedulerTargetProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.EventBridgeSchedulerTargetProps):
        EventBridgeSchedulerTargetProps = CdkObjectWrappers.wrap(cdkObject) as?
        EventBridgeSchedulerTargetProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: EventBridgeSchedulerTargetProps):
        software.amazon.awscdk.services.stepfunctions.tasks.EventBridgeSchedulerTargetProps =
        (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.stepfunctions.tasks.EventBridgeSchedulerTargetProps
  }
}
