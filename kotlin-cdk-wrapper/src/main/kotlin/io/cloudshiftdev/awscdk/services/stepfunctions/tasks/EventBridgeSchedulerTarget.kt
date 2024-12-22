@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions.tasks

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.iam.IRole
import io.cloudshiftdev.awscdk.services.sqs.IQueue
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * The target that EventBridge Scheduler will invoke.
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
public open class EventBridgeSchedulerTarget(
  cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.EventBridgeSchedulerTarget,
) : CdkObject(cdkObject) {
  public constructor(props: EventBridgeSchedulerTargetProps) :
      this(software.amazon.awscdk.services.stepfunctions.tasks.EventBridgeSchedulerTarget(props.let(EventBridgeSchedulerTargetProps.Companion::unwrap))
  )

  public constructor(props: EventBridgeSchedulerTargetProps.Builder.() -> Unit) :
      this(EventBridgeSchedulerTargetProps(props)
  )

  /**
   * The Amazon Resource Name (ARN) of the target.
   */
  public open fun arn(): String = unwrap(this).getArn()

  /**
   * The Amazon Resource Name (ARN) of the target.
   */
  public open fun arn(`value`: String) {
    unwrap(this).setArn(`value`)
  }

  /**
   * Dead letter queue for failed events.
   */
  public open fun deadLetterQueue(): IQueue? = unwrap(this).getDeadLetterQueue()?.let(IQueue::wrap)

  /**
   * Dead letter queue for failed events.
   */
  public open fun deadLetterQueue(`value`: IQueue) {
    unwrap(this).setDeadLetterQueue(`value`.let(IQueue.Companion::unwrap))
  }

  /**
   * The input to the target.
   */
  public open fun input(): String? = unwrap(this).getInput()

  /**
   * The input to the target.
   */
  public open fun input(`value`: String) {
    unwrap(this).setInput(`value`)
  }

  /**
   * return the target object for the EventBridge Scheduler.
   */
  public open fun renderTargetObject(): Any = unwrap(this).renderTargetObject()

  /**
   * The retry policy settings.
   */
  public open fun retryPolicy(): RetryPolicy? =
      unwrap(this).getRetryPolicy()?.let(RetryPolicy::wrap)

  /**
   * The retry policy settings.
   */
  public open fun retryPolicy(`value`: RetryPolicy) {
    unwrap(this).setRetryPolicy(`value`.let(RetryPolicy.Companion::unwrap))
  }

  /**
   * The retry policy settings.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("d0c8b87ee65e231c60d4c590b137cc792a61dea1be9afe006d6dcec183854e89")
  public open fun retryPolicy(`value`: RetryPolicy.Builder.() -> Unit): Unit =
      retryPolicy(RetryPolicy(`value`))

  /**
   * The IAM role that EventBridge Scheduler will use for this target when the schedule is invoked.
   */
  public open fun role(): IRole = unwrap(this).getRole().let(IRole::wrap)

  /**
   * The IAM role that EventBridge Scheduler will use for this target when the schedule is invoked.
   */
  public open fun role(`value`: IRole) {
    unwrap(this).setRole(`value`.let(IRole.Companion::unwrap))
  }

  /**
   * A fluent builder for
   * [io.cloudshiftdev.awscdk.services.stepfunctions.tasks.EventBridgeSchedulerTarget].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The Amazon Resource Name (ARN) of the target.
     *
     * [Documentation](https://docs.aws.amazon.com/scheduler/latest/UserGuide/managing-targets.html)
     * @param arn The Amazon Resource Name (ARN) of the target. 
     */
    public fun arn(arn: String)

    /**
     * Dead letter queue for failed events.
     *
     * Default: - No dead letter queue
     *
     * @param deadLetterQueue Dead letter queue for failed events. 
     */
    public fun deadLetterQueue(deadLetterQueue: IQueue)

    /**
     * The input to the target.
     *
     * Default: - EventBridge Scheduler delivers a default notification to the target
     *
     * @param input The input to the target. 
     */
    public fun input(input: String)

    /**
     * The retry policy settings.
     *
     * Default: - Do not retry
     *
     * @param retryPolicy The retry policy settings. 
     */
    public fun retryPolicy(retryPolicy: RetryPolicy)

    /**
     * The retry policy settings.
     *
     * Default: - Do not retry
     *
     * @param retryPolicy The retry policy settings. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d92422edcc7422a29a41551eb5b7a0317a5e6bc50141cb5261d2705f1a0baf37")
    public fun retryPolicy(retryPolicy: RetryPolicy.Builder.() -> Unit)

    /**
     * The IAM role that EventBridge Scheduler will use for this target when the schedule is
     * invoked.
     *
     * @param role The IAM role that EventBridge Scheduler will use for this target when the
     * schedule is invoked. 
     */
    public fun role(role: IRole)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.stepfunctions.tasks.EventBridgeSchedulerTarget.Builder =
        software.amazon.awscdk.services.stepfunctions.tasks.EventBridgeSchedulerTarget.Builder.create()

    /**
     * The Amazon Resource Name (ARN) of the target.
     *
     * [Documentation](https://docs.aws.amazon.com/scheduler/latest/UserGuide/managing-targets.html)
     * @param arn The Amazon Resource Name (ARN) of the target. 
     */
    override fun arn(arn: String) {
      cdkBuilder.arn(arn)
    }

    /**
     * Dead letter queue for failed events.
     *
     * Default: - No dead letter queue
     *
     * @param deadLetterQueue Dead letter queue for failed events. 
     */
    override fun deadLetterQueue(deadLetterQueue: IQueue) {
      cdkBuilder.deadLetterQueue(deadLetterQueue.let(IQueue.Companion::unwrap))
    }

    /**
     * The input to the target.
     *
     * Default: - EventBridge Scheduler delivers a default notification to the target
     *
     * @param input The input to the target. 
     */
    override fun input(input: String) {
      cdkBuilder.input(input)
    }

    /**
     * The retry policy settings.
     *
     * Default: - Do not retry
     *
     * @param retryPolicy The retry policy settings. 
     */
    override fun retryPolicy(retryPolicy: RetryPolicy) {
      cdkBuilder.retryPolicy(retryPolicy.let(RetryPolicy.Companion::unwrap))
    }

    /**
     * The retry policy settings.
     *
     * Default: - Do not retry
     *
     * @param retryPolicy The retry policy settings. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d92422edcc7422a29a41551eb5b7a0317a5e6bc50141cb5261d2705f1a0baf37")
    override fun retryPolicy(retryPolicy: RetryPolicy.Builder.() -> Unit): Unit =
        retryPolicy(RetryPolicy(retryPolicy))

    /**
     * The IAM role that EventBridge Scheduler will use for this target when the schedule is
     * invoked.
     *
     * @param role The IAM role that EventBridge Scheduler will use for this target when the
     * schedule is invoked. 
     */
    override fun role(role: IRole) {
      cdkBuilder.role(role.let(IRole.Companion::unwrap))
    }

    public fun build():
        software.amazon.awscdk.services.stepfunctions.tasks.EventBridgeSchedulerTarget =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): EventBridgeSchedulerTarget {
      val builderImpl = BuilderImpl()
      return EventBridgeSchedulerTarget(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.EventBridgeSchedulerTarget):
        EventBridgeSchedulerTarget = EventBridgeSchedulerTarget(cdkObject)

    internal fun unwrap(wrapped: EventBridgeSchedulerTarget):
        software.amazon.awscdk.services.stepfunctions.tasks.EventBridgeSchedulerTarget =
        wrapped.cdkObject as
        software.amazon.awscdk.services.stepfunctions.tasks.EventBridgeSchedulerTarget
  }
}
