@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions.tasks

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.kms.IKey
import io.cloudshiftdev.awscdk.services.stepfunctions.Credentials
import io.cloudshiftdev.awscdk.services.stepfunctions.IntegrationPattern
import io.cloudshiftdev.awscdk.services.stepfunctions.TaskStateBase
import io.cloudshiftdev.awscdk.services.stepfunctions.Timeout
import java.time.Instant
import kotlin.Any
import kotlin.Boolean
import kotlin.Deprecated
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Create a new AWS EventBridge Scheduler schedule.
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
 * [Documentation](https://docs.aws.amazon.com/scheduler/latest/APIReference/API_CreateSchedule.html)
 */
public open class EventBridgeSchedulerCreateScheduleTask(
  cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.EventBridgeSchedulerCreateScheduleTask,
) : TaskStateBase(cdkObject) {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: EventBridgeSchedulerCreateScheduleTaskProps,
  ) :
      this(software.amazon.awscdk.services.stepfunctions.tasks.EventBridgeSchedulerCreateScheduleTask(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(EventBridgeSchedulerCreateScheduleTaskProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: EventBridgeSchedulerCreateScheduleTaskProps.Builder.() -> Unit,
  ) : this(scope, id, EventBridgeSchedulerCreateScheduleTaskProps(props)
  )

  /**
   * A fluent builder for
   * [io.cloudshiftdev.awscdk.services.stepfunctions.tasks.EventBridgeSchedulerCreateScheduleTask].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Specifies the action that EventBridge Scheduler applies to the schedule after the schedule
     * completes invoking the target.
     *
     * Default: ActionAfterCompletion.NONE
     *
     * @param actionAfterCompletion Specifies the action that EventBridge Scheduler applies to the
     * schedule after the schedule completes invoking the target. 
     */
    public fun actionAfterCompletion(actionAfterCompletion: ActionAfterCompletion)

    /**
     * Unique, case-sensitive identifier to ensure the idempotency of the request.
     *
     * Default: - Automatically generated
     *
     * @param clientToken Unique, case-sensitive identifier to ensure the idempotency of the
     * request. 
     */
    public fun clientToken(clientToken: String)

    /**
     * An optional description for this state.
     *
     * Default: - No comment
     *
     * @param comment An optional description for this state. 
     */
    public fun comment(comment: String)

    /**
     * Credentials for an IAM Role that the State Machine assumes for executing the task.
     *
     * This enables cross-account resource invocations.
     *
     * Default: - None (Task is executed using the State Machine's execution role)
     *
     * [Documentation](https://docs.aws.amazon.com/step-functions/latest/dg/concepts-access-cross-acct-resources.html)
     * @param credentials Credentials for an IAM Role that the State Machine assumes for executing
     * the task. 
     */
    public fun credentials(credentials: Credentials)

    /**
     * Credentials for an IAM Role that the State Machine assumes for executing the task.
     *
     * This enables cross-account resource invocations.
     *
     * Default: - None (Task is executed using the State Machine's execution role)
     *
     * [Documentation](https://docs.aws.amazon.com/step-functions/latest/dg/concepts-access-cross-acct-resources.html)
     * @param credentials Credentials for an IAM Role that the State Machine assumes for executing
     * the task. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9c68795545a55283f2a5aebc103e84808e58c78f6903bec786e9d362a7bb685c")
    public fun credentials(credentials: Credentials.Builder.() -> Unit)

    /**
     * The description for the schedule.
     *
     * Default: - No description
     *
     * @param description The description for the schedule. 
     */
    public fun description(description: String)

    /**
     * Specifies whether the schedule is enabled or disabled.
     *
     * Default: true
     *
     * @param enabled Specifies whether the schedule is enabled or disabled. 
     */
    public fun enabled(enabled: Boolean)

    /**
     * The date, in UTC, before which the schedule can invoke its target.
     *
     * Depending on the schedule's recurrence expression, invocations might stop on, or before, the
     * EndDate you specify.
     * EventBridge Scheduler ignores EndDate for one-time schedules.
     *
     * Default: - No end date
     *
     * @param endDate The date, in UTC, before which the schedule can invoke its target. 
     */
    public fun endDate(endDate: Instant)

    /**
     * The maximum time window during which a schedule can be invoked.
     *
     * Minimum value is 1 minute.
     * Maximum value is 1440 minutes (1 day).
     *
     * Default: - Flexible time window is not enabled.
     *
     * @param flexibleTimeWindow The maximum time window during which a schedule can be invoked. 
     */
    public fun flexibleTimeWindow(flexibleTimeWindow: Duration)

    /**
     * The name of the schedule group to associate with this schedule.
     *
     * Default: - The default schedule group is used.
     *
     * @param groupName The name of the schedule group to associate with this schedule. 
     */
    public fun groupName(groupName: String)

    /**
     * (deprecated) Timeout for the heartbeat.
     *
     * Default: - None
     *
     * @deprecated use `heartbeatTimeout`
     * @param heartbeat Timeout for the heartbeat. 
     */
    @Deprecated(message = "deprecated in CDK")
    public fun heartbeat(heartbeat: Duration)

    /**
     * Timeout for the heartbeat.
     *
     * [disable-awslint:duration-prop-type] is needed because all props interface in
     * aws-stepfunctions-tasks extend this interface
     *
     * Default: - None
     *
     * @param heartbeatTimeout Timeout for the heartbeat. 
     */
    public fun heartbeatTimeout(heartbeatTimeout: Timeout)

    /**
     * JSONPath expression to select part of the state to be the input to this state.
     *
     * May also be the special value JsonPath.DISCARD, which will cause the effective
     * input to be the empty object {}.
     *
     * Default: - The entire task input (JSON path '$')
     *
     * @param inputPath JSONPath expression to select part of the state to be the input to this
     * state. 
     */
    public fun inputPath(inputPath: String)

    /**
     * AWS Step Functions integrates with services directly in the Amazon States Language.
     *
     * You can control these AWS services using service integration patterns.
     *
     * Depending on the AWS Service, the Service Integration Pattern availability will vary.
     *
     * Default: - `IntegrationPattern.REQUEST_RESPONSE` for most tasks.
     * `IntegrationPattern.RUN_JOB` for the following exceptions:
     * `BatchSubmitJob`, `EmrAddStep`, `EmrCreateCluster`, `EmrTerminationCluster`, and
     * `EmrContainersStartJobRun`.
     *
     * [Documentation](https://docs.aws.amazon.com/step-functions/latest/dg/connect-supported-services.html)
     * @param integrationPattern AWS Step Functions integrates with services directly in the Amazon
     * States Language. 
     */
    public fun integrationPattern(integrationPattern: IntegrationPattern)

    /**
     * The customer managed KMS key that EventBridge Scheduler will use to encrypt and decrypt
     * payload.
     *
     * Default: - Use automatically generated KMS key
     *
     * [Documentation](https://docs.aws.amazon.com/scheduler/latest/UserGuide/encryption-rest.html)
     * @param kmsKey The customer managed KMS key that EventBridge Scheduler will use to encrypt and
     * decrypt payload. 
     */
    public fun kmsKey(kmsKey: IKey)

    /**
     * JSONPath expression to select select a portion of the state output to pass to the next state.
     *
     * May also be the special value JsonPath.DISCARD, which will cause the effective
     * output to be the empty object {}.
     *
     * Default: - The entire JSON node determined by the state input, the task result,
     * and resultPath is passed to the next state (JSON path '$')
     *
     * @param outputPath JSONPath expression to select select a portion of the state output to pass
     * to the next state. 
     */
    public fun outputPath(outputPath: String)

    /**
     * JSONPath expression to indicate where to inject the state's output.
     *
     * May also be the special value JsonPath.DISCARD, which will cause the state's
     * input to become its output.
     *
     * Default: - Replaces the entire input with the result (JSON path '$')
     *
     * @param resultPath JSONPath expression to indicate where to inject the state's output. 
     */
    public fun resultPath(resultPath: String)

    /**
     * The JSON that will replace the state's raw result and become the effective result before
     * ResultPath is applied.
     *
     * You can use ResultSelector to create a payload with values that are static
     * or selected from the state's raw result.
     *
     * Default: - None
     *
     * [Documentation](https://docs.aws.amazon.com/step-functions/latest/dg/input-output-inputpath-params.html#input-output-resultselector)
     * @param resultSelector The JSON that will replace the state's raw result and become the
     * effective result before ResultPath is applied. 
     */
    public fun resultSelector(resultSelector: Map<String, Any>)

    /**
     * The schedule that defines when the schedule will trigger.
     *
     * [Documentation](https://docs.aws.amazon.com/scheduler/latest/UserGuide/schedule-types.html)
     * @param schedule The schedule that defines when the schedule will trigger. 
     */
    public fun schedule(schedule: Schedule)

    /**
     * Schedule name.
     *
     * @param scheduleName Schedule name. 
     */
    public fun scheduleName(scheduleName: String)

    /**
     * The date, in UTC, after which the schedule can begin invoking its target.
     *
     * Depending on the schedule's recurrence expression, invocations might occur on, or after, the
     * StartDate you specify.
     * EventBridge Scheduler ignores StartDate for one-time schedules.
     *
     * Default: - No start date
     *
     * @param startDate The date, in UTC, after which the schedule can begin invoking its target. 
     */
    public fun startDate(startDate: Instant)

    /**
     * Optional name for this state.
     *
     * Default: - The construct ID will be used as state name
     *
     * @param stateName Optional name for this state. 
     */
    public fun stateName(stateName: String)

    /**
     * The schedule's target.
     *
     * @param target The schedule's target. 
     */
    public fun target(target: EventBridgeSchedulerTarget)

    /**
     * The schedule's target.
     *
     * @param target The schedule's target. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("69406f779e5d86e95d6ff85817ab576317696d9e3fffcfbe9c3a58974b8095c9")
    public fun target(target: EventBridgeSchedulerTarget.Builder.() -> Unit)

    /**
     * Timeout for the task.
     *
     * [disable-awslint:duration-prop-type] is needed because all props interface in
     * aws-stepfunctions-tasks extend this interface
     *
     * Default: - None
     *
     * @param taskTimeout Timeout for the task. 
     */
    public fun taskTimeout(taskTimeout: Timeout)

    /**
     * (deprecated) Timeout for the task.
     *
     * Default: - None
     *
     * @deprecated use `taskTimeout`
     * @param timeout Timeout for the task. 
     */
    @Deprecated(message = "deprecated in CDK")
    public fun timeout(timeout: Duration)

    /**
     * The timezone in which the scheduling expression is evaluated.
     *
     * Default: - UTC
     *
     * @param timezone The timezone in which the scheduling expression is evaluated. 
     */
    public fun timezone(timezone: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.stepfunctions.tasks.EventBridgeSchedulerCreateScheduleTask.Builder
        =
        software.amazon.awscdk.services.stepfunctions.tasks.EventBridgeSchedulerCreateScheduleTask.Builder.create(scope,
        id)

    /**
     * Specifies the action that EventBridge Scheduler applies to the schedule after the schedule
     * completes invoking the target.
     *
     * Default: ActionAfterCompletion.NONE
     *
     * @param actionAfterCompletion Specifies the action that EventBridge Scheduler applies to the
     * schedule after the schedule completes invoking the target. 
     */
    override fun actionAfterCompletion(actionAfterCompletion: ActionAfterCompletion) {
      cdkBuilder.actionAfterCompletion(actionAfterCompletion.let(ActionAfterCompletion.Companion::unwrap))
    }

    /**
     * Unique, case-sensitive identifier to ensure the idempotency of the request.
     *
     * Default: - Automatically generated
     *
     * @param clientToken Unique, case-sensitive identifier to ensure the idempotency of the
     * request. 
     */
    override fun clientToken(clientToken: String) {
      cdkBuilder.clientToken(clientToken)
    }

    /**
     * An optional description for this state.
     *
     * Default: - No comment
     *
     * @param comment An optional description for this state. 
     */
    override fun comment(comment: String) {
      cdkBuilder.comment(comment)
    }

    /**
     * Credentials for an IAM Role that the State Machine assumes for executing the task.
     *
     * This enables cross-account resource invocations.
     *
     * Default: - None (Task is executed using the State Machine's execution role)
     *
     * [Documentation](https://docs.aws.amazon.com/step-functions/latest/dg/concepts-access-cross-acct-resources.html)
     * @param credentials Credentials for an IAM Role that the State Machine assumes for executing
     * the task. 
     */
    override fun credentials(credentials: Credentials) {
      cdkBuilder.credentials(credentials.let(Credentials.Companion::unwrap))
    }

    /**
     * Credentials for an IAM Role that the State Machine assumes for executing the task.
     *
     * This enables cross-account resource invocations.
     *
     * Default: - None (Task is executed using the State Machine's execution role)
     *
     * [Documentation](https://docs.aws.amazon.com/step-functions/latest/dg/concepts-access-cross-acct-resources.html)
     * @param credentials Credentials for an IAM Role that the State Machine assumes for executing
     * the task. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9c68795545a55283f2a5aebc103e84808e58c78f6903bec786e9d362a7bb685c")
    override fun credentials(credentials: Credentials.Builder.() -> Unit): Unit =
        credentials(Credentials(credentials))

    /**
     * The description for the schedule.
     *
     * Default: - No description
     *
     * @param description The description for the schedule. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * Specifies whether the schedule is enabled or disabled.
     *
     * Default: true
     *
     * @param enabled Specifies whether the schedule is enabled or disabled. 
     */
    override fun enabled(enabled: Boolean) {
      cdkBuilder.enabled(enabled)
    }

    /**
     * The date, in UTC, before which the schedule can invoke its target.
     *
     * Depending on the schedule's recurrence expression, invocations might stop on, or before, the
     * EndDate you specify.
     * EventBridge Scheduler ignores EndDate for one-time schedules.
     *
     * Default: - No end date
     *
     * @param endDate The date, in UTC, before which the schedule can invoke its target. 
     */
    override fun endDate(endDate: Instant) {
      cdkBuilder.endDate(endDate)
    }

    /**
     * The maximum time window during which a schedule can be invoked.
     *
     * Minimum value is 1 minute.
     * Maximum value is 1440 minutes (1 day).
     *
     * Default: - Flexible time window is not enabled.
     *
     * @param flexibleTimeWindow The maximum time window during which a schedule can be invoked. 
     */
    override fun flexibleTimeWindow(flexibleTimeWindow: Duration) {
      cdkBuilder.flexibleTimeWindow(flexibleTimeWindow.let(Duration.Companion::unwrap))
    }

    /**
     * The name of the schedule group to associate with this schedule.
     *
     * Default: - The default schedule group is used.
     *
     * @param groupName The name of the schedule group to associate with this schedule. 
     */
    override fun groupName(groupName: String) {
      cdkBuilder.groupName(groupName)
    }

    /**
     * (deprecated) Timeout for the heartbeat.
     *
     * Default: - None
     *
     * @deprecated use `heartbeatTimeout`
     * @param heartbeat Timeout for the heartbeat. 
     */
    @Deprecated(message = "deprecated in CDK")
    override fun heartbeat(heartbeat: Duration) {
      cdkBuilder.heartbeat(heartbeat.let(Duration.Companion::unwrap))
    }

    /**
     * Timeout for the heartbeat.
     *
     * [disable-awslint:duration-prop-type] is needed because all props interface in
     * aws-stepfunctions-tasks extend this interface
     *
     * Default: - None
     *
     * @param heartbeatTimeout Timeout for the heartbeat. 
     */
    override fun heartbeatTimeout(heartbeatTimeout: Timeout) {
      cdkBuilder.heartbeatTimeout(heartbeatTimeout.let(Timeout.Companion::unwrap))
    }

    /**
     * JSONPath expression to select part of the state to be the input to this state.
     *
     * May also be the special value JsonPath.DISCARD, which will cause the effective
     * input to be the empty object {}.
     *
     * Default: - The entire task input (JSON path '$')
     *
     * @param inputPath JSONPath expression to select part of the state to be the input to this
     * state. 
     */
    override fun inputPath(inputPath: String) {
      cdkBuilder.inputPath(inputPath)
    }

    /**
     * AWS Step Functions integrates with services directly in the Amazon States Language.
     *
     * You can control these AWS services using service integration patterns.
     *
     * Depending on the AWS Service, the Service Integration Pattern availability will vary.
     *
     * Default: - `IntegrationPattern.REQUEST_RESPONSE` for most tasks.
     * `IntegrationPattern.RUN_JOB` for the following exceptions:
     * `BatchSubmitJob`, `EmrAddStep`, `EmrCreateCluster`, `EmrTerminationCluster`, and
     * `EmrContainersStartJobRun`.
     *
     * [Documentation](https://docs.aws.amazon.com/step-functions/latest/dg/connect-supported-services.html)
     * @param integrationPattern AWS Step Functions integrates with services directly in the Amazon
     * States Language. 
     */
    override fun integrationPattern(integrationPattern: IntegrationPattern) {
      cdkBuilder.integrationPattern(integrationPattern.let(IntegrationPattern.Companion::unwrap))
    }

    /**
     * The customer managed KMS key that EventBridge Scheduler will use to encrypt and decrypt
     * payload.
     *
     * Default: - Use automatically generated KMS key
     *
     * [Documentation](https://docs.aws.amazon.com/scheduler/latest/UserGuide/encryption-rest.html)
     * @param kmsKey The customer managed KMS key that EventBridge Scheduler will use to encrypt and
     * decrypt payload. 
     */
    override fun kmsKey(kmsKey: IKey) {
      cdkBuilder.kmsKey(kmsKey.let(IKey.Companion::unwrap))
    }

    /**
     * JSONPath expression to select select a portion of the state output to pass to the next state.
     *
     * May also be the special value JsonPath.DISCARD, which will cause the effective
     * output to be the empty object {}.
     *
     * Default: - The entire JSON node determined by the state input, the task result,
     * and resultPath is passed to the next state (JSON path '$')
     *
     * @param outputPath JSONPath expression to select select a portion of the state output to pass
     * to the next state. 
     */
    override fun outputPath(outputPath: String) {
      cdkBuilder.outputPath(outputPath)
    }

    /**
     * JSONPath expression to indicate where to inject the state's output.
     *
     * May also be the special value JsonPath.DISCARD, which will cause the state's
     * input to become its output.
     *
     * Default: - Replaces the entire input with the result (JSON path '$')
     *
     * @param resultPath JSONPath expression to indicate where to inject the state's output. 
     */
    override fun resultPath(resultPath: String) {
      cdkBuilder.resultPath(resultPath)
    }

    /**
     * The JSON that will replace the state's raw result and become the effective result before
     * ResultPath is applied.
     *
     * You can use ResultSelector to create a payload with values that are static
     * or selected from the state's raw result.
     *
     * Default: - None
     *
     * [Documentation](https://docs.aws.amazon.com/step-functions/latest/dg/input-output-inputpath-params.html#input-output-resultselector)
     * @param resultSelector The JSON that will replace the state's raw result and become the
     * effective result before ResultPath is applied. 
     */
    override fun resultSelector(resultSelector: Map<String, Any>) {
      cdkBuilder.resultSelector(resultSelector.mapValues{CdkObjectWrappers.unwrap(it.value)})
    }

    /**
     * The schedule that defines when the schedule will trigger.
     *
     * [Documentation](https://docs.aws.amazon.com/scheduler/latest/UserGuide/schedule-types.html)
     * @param schedule The schedule that defines when the schedule will trigger. 
     */
    override fun schedule(schedule: Schedule) {
      cdkBuilder.schedule(schedule.let(Schedule.Companion::unwrap))
    }

    /**
     * Schedule name.
     *
     * @param scheduleName Schedule name. 
     */
    override fun scheduleName(scheduleName: String) {
      cdkBuilder.scheduleName(scheduleName)
    }

    /**
     * The date, in UTC, after which the schedule can begin invoking its target.
     *
     * Depending on the schedule's recurrence expression, invocations might occur on, or after, the
     * StartDate you specify.
     * EventBridge Scheduler ignores StartDate for one-time schedules.
     *
     * Default: - No start date
     *
     * @param startDate The date, in UTC, after which the schedule can begin invoking its target. 
     */
    override fun startDate(startDate: Instant) {
      cdkBuilder.startDate(startDate)
    }

    /**
     * Optional name for this state.
     *
     * Default: - The construct ID will be used as state name
     *
     * @param stateName Optional name for this state. 
     */
    override fun stateName(stateName: String) {
      cdkBuilder.stateName(stateName)
    }

    /**
     * The schedule's target.
     *
     * @param target The schedule's target. 
     */
    override fun target(target: EventBridgeSchedulerTarget) {
      cdkBuilder.target(target.let(EventBridgeSchedulerTarget.Companion::unwrap))
    }

    /**
     * The schedule's target.
     *
     * @param target The schedule's target. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("69406f779e5d86e95d6ff85817ab576317696d9e3fffcfbe9c3a58974b8095c9")
    override fun target(target: EventBridgeSchedulerTarget.Builder.() -> Unit): Unit =
        target(EventBridgeSchedulerTarget(target))

    /**
     * Timeout for the task.
     *
     * [disable-awslint:duration-prop-type] is needed because all props interface in
     * aws-stepfunctions-tasks extend this interface
     *
     * Default: - None
     *
     * @param taskTimeout Timeout for the task. 
     */
    override fun taskTimeout(taskTimeout: Timeout) {
      cdkBuilder.taskTimeout(taskTimeout.let(Timeout.Companion::unwrap))
    }

    /**
     * (deprecated) Timeout for the task.
     *
     * Default: - None
     *
     * @deprecated use `taskTimeout`
     * @param timeout Timeout for the task. 
     */
    @Deprecated(message = "deprecated in CDK")
    override fun timeout(timeout: Duration) {
      cdkBuilder.timeout(timeout.let(Duration.Companion::unwrap))
    }

    /**
     * The timezone in which the scheduling expression is evaluated.
     *
     * Default: - UTC
     *
     * @param timezone The timezone in which the scheduling expression is evaluated. 
     */
    override fun timezone(timezone: String) {
      cdkBuilder.timezone(timezone)
    }

    public fun build():
        software.amazon.awscdk.services.stepfunctions.tasks.EventBridgeSchedulerCreateScheduleTask =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): EventBridgeSchedulerCreateScheduleTask {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return EventBridgeSchedulerCreateScheduleTask(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.EventBridgeSchedulerCreateScheduleTask):
        EventBridgeSchedulerCreateScheduleTask = EventBridgeSchedulerCreateScheduleTask(cdkObject)

    internal fun unwrap(wrapped: EventBridgeSchedulerCreateScheduleTask):
        software.amazon.awscdk.services.stepfunctions.tasks.EventBridgeSchedulerCreateScheduleTask =
        wrapped.cdkObject as
        software.amazon.awscdk.services.stepfunctions.tasks.EventBridgeSchedulerCreateScheduleTask
  }
}
