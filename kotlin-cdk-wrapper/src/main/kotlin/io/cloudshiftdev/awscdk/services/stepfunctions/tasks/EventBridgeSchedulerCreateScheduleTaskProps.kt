@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions.tasks

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.kms.IKey
import io.cloudshiftdev.awscdk.services.stepfunctions.Credentials
import io.cloudshiftdev.awscdk.services.stepfunctions.IntegrationPattern
import io.cloudshiftdev.awscdk.services.stepfunctions.QueryLanguage
import io.cloudshiftdev.awscdk.services.stepfunctions.TaskStateBaseProps
import io.cloudshiftdev.awscdk.services.stepfunctions.Timeout
import java.time.Instant
import kotlin.Any
import kotlin.Boolean
import kotlin.Deprecated
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import kotlin.jvm.JvmName

/**
 * Properties for creating an AWS EventBridge Scheduler schedule.
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
public interface EventBridgeSchedulerCreateScheduleTaskProps : TaskStateBaseProps {
  /**
   * Specifies the action that EventBridge Scheduler applies to the schedule after the schedule
   * completes invoking the target.
   *
   * Default: ActionAfterCompletion.NONE
   */
  public fun actionAfterCompletion(): ActionAfterCompletion? =
      unwrap(this).getActionAfterCompletion()?.let(ActionAfterCompletion::wrap)

  /**
   * Unique, case-sensitive identifier to ensure the idempotency of the request.
   *
   * Default: - Automatically generated
   */
  public fun clientToken(): String? = unwrap(this).getClientToken()

  /**
   * The description for the schedule.
   *
   * Default: - No description
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * Specifies whether the schedule is enabled or disabled.
   *
   * Default: true
   */
  public fun enabled(): Boolean? = unwrap(this).getEnabled()

  /**
   * The date, in UTC, before which the schedule can invoke its target.
   *
   * Depending on the schedule's recurrence expression, invocations might stop on, or before, the
   * EndDate you specify.
   * EventBridge Scheduler ignores EndDate for one-time schedules.
   *
   * Default: - No end date
   */
  public fun endDate(): Instant? = unwrap(this).getEndDate()

  /**
   * The maximum time window during which a schedule can be invoked.
   *
   * Minimum value is 1 minute.
   * Maximum value is 1440 minutes (1 day).
   *
   * Default: - Flexible time window is not enabled.
   */
  public fun flexibleTimeWindow(): Duration? =
      unwrap(this).getFlexibleTimeWindow()?.let(Duration::wrap)

  /**
   * The name of the schedule group to associate with this schedule.
   *
   * Default: - The default schedule group is used.
   */
  public fun groupName(): String? = unwrap(this).getGroupName()

  /**
   * The customer managed KMS key that EventBridge Scheduler will use to encrypt and decrypt
   * payload.
   *
   * Default: - Use automatically generated KMS key
   *
   * [Documentation](https://docs.aws.amazon.com/scheduler/latest/UserGuide/encryption-rest.html)
   */
  public fun kmsKey(): IKey? = unwrap(this).getKmsKey()?.let(IKey::wrap)

  /**
   * The schedule that defines when the schedule will trigger.
   *
   * [Documentation](https://docs.aws.amazon.com/scheduler/latest/UserGuide/schedule-types.html)
   */
  public fun schedule(): Schedule

  /**
   * Schedule name.
   */
  public fun scheduleName(): String

  /**
   * The date, in UTC, after which the schedule can begin invoking its target.
   *
   * Depending on the schedule's recurrence expression, invocations might occur on, or after, the
   * StartDate you specify.
   * EventBridge Scheduler ignores StartDate for one-time schedules.
   *
   * Default: - No start date
   */
  public fun startDate(): Instant? = unwrap(this).getStartDate()

  /**
   * The schedule's target.
   */
  public fun target(): EventBridgeSchedulerTarget

  /**
   * The timezone in which the scheduling expression is evaluated.
   *
   * Default: - UTC
   */
  public fun timezone(): String? = unwrap(this).getTimezone()

  /**
   * A builder for [EventBridgeSchedulerCreateScheduleTaskProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param actionAfterCompletion Specifies the action that EventBridge Scheduler applies to the
     * schedule after the schedule completes invoking the target.
     */
    public fun actionAfterCompletion(actionAfterCompletion: ActionAfterCompletion)

    /**
     * @param assign Workflow variables to store in this step.
     * Using workflow variables, you can store data in a step and retrieve that data in future
     * steps.
     */
    public fun assign(assign: Map<String, Any>)

    /**
     * @param clientToken Unique, case-sensitive identifier to ensure the idempotency of the
     * request.
     */
    public fun clientToken(clientToken: String)

    /**
     * @param comment A comment describing this state.
     */
    public fun comment(comment: String)

    /**
     * @param credentials Credentials for an IAM Role that the State Machine assumes for executing
     * the task.
     * This enables cross-account resource invocations.
     */
    public fun credentials(credentials: Credentials)

    /**
     * @param credentials Credentials for an IAM Role that the State Machine assumes for executing
     * the task.
     * This enables cross-account resource invocations.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b3c6fd40aad954b08dfa4da6341ddab8e3bdce4440f51655b56a0eae44cfe686")
    public fun credentials(credentials: Credentials.Builder.() -> Unit)

    /**
     * @param description The description for the schedule.
     */
    public fun description(description: String)

    /**
     * @param enabled Specifies whether the schedule is enabled or disabled.
     */
    public fun enabled(enabled: Boolean)

    /**
     * @param endDate The date, in UTC, before which the schedule can invoke its target.
     * Depending on the schedule's recurrence expression, invocations might stop on, or before, the
     * EndDate you specify.
     * EventBridge Scheduler ignores EndDate for one-time schedules.
     */
    public fun endDate(endDate: Instant)

    /**
     * @param flexibleTimeWindow The maximum time window during which a schedule can be invoked.
     * Minimum value is 1 minute.
     * Maximum value is 1440 minutes (1 day).
     */
    public fun flexibleTimeWindow(flexibleTimeWindow: Duration)

    /**
     * @param groupName The name of the schedule group to associate with this schedule.
     */
    public fun groupName(groupName: String)

    /**
     * @param heartbeat Timeout for the heartbeat.
     * @deprecated use `heartbeatTimeout`
     */
    @Deprecated(message = "deprecated in CDK")
    public fun heartbeat(heartbeat: Duration)

    /**
     * @param heartbeatTimeout Timeout for the heartbeat.
     * [disable-awslint:duration-prop-type] is needed because all props interface in
     * aws-stepfunctions-tasks extend this interface
     */
    public fun heartbeatTimeout(heartbeatTimeout: Timeout)

    /**
     * @param inputPath JSONPath expression to select part of the state to be the input to this
     * state.
     * May also be the special value JsonPath.DISCARD, which will cause the effective
     * input to be the empty object {}.
     */
    public fun inputPath(inputPath: String)

    /**
     * @param integrationPattern AWS Step Functions integrates with services directly in the Amazon
     * States Language.
     * You can control these AWS services using service integration patterns.
     *
     * Depending on the AWS Service, the Service Integration Pattern availability will vary.
     */
    public fun integrationPattern(integrationPattern: IntegrationPattern)

    /**
     * @param kmsKey The customer managed KMS key that EventBridge Scheduler will use to encrypt and
     * decrypt payload.
     */
    public fun kmsKey(kmsKey: IKey)

    /**
     * @param outputPath JSONPath expression to select part of the state to be the output to this
     * state.
     * May also be the special value JsonPath.DISCARD, which will cause the effective
     * output to be the empty object {}.
     */
    public fun outputPath(outputPath: String)

    /**
     * @param outputs Used to specify and transform output from the state.
     * When specified, the value overrides the state output default.
     * The output field accepts any JSON value (object, array, string, number, boolean, null).
     * Any string value, including those inside objects or arrays,
     * will be evaluated as JSONata if surrounded by {% %} characters.
     * Output also accepts a JSONata expression directly.
     */
    public fun outputs(outputs: Any)

    /**
     * @param queryLanguage The name of the query language used by the state.
     * If the state does not contain a `queryLanguage` field,
     * then it will use the query language specified in the top-level `queryLanguage` field.
     */
    public fun queryLanguage(queryLanguage: QueryLanguage)

    /**
     * @param resultPath JSONPath expression to indicate where to inject the state's output.
     * May also be the special value JsonPath.DISCARD, which will cause the state's
     * input to become its output.
     */
    public fun resultPath(resultPath: String)

    /**
     * @param resultSelector The JSON that will replace the state's raw result and become the
     * effective result before ResultPath is applied.
     * You can use ResultSelector to create a payload with values that are static
     * or selected from the state's raw result.
     */
    public fun resultSelector(resultSelector: Map<String, Any>)

    /**
     * @param schedule The schedule that defines when the schedule will trigger. 
     */
    public fun schedule(schedule: Schedule)

    /**
     * @param scheduleName Schedule name. 
     */
    public fun scheduleName(scheduleName: String)

    /**
     * @param startDate The date, in UTC, after which the schedule can begin invoking its target.
     * Depending on the schedule's recurrence expression, invocations might occur on, or after, the
     * StartDate you specify.
     * EventBridge Scheduler ignores StartDate for one-time schedules.
     */
    public fun startDate(startDate: Instant)

    /**
     * @param stateName Optional name for this state.
     */
    public fun stateName(stateName: String)

    /**
     * @param target The schedule's target. 
     */
    public fun target(target: EventBridgeSchedulerTarget)

    /**
     * @param target The schedule's target. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("81a6e1a23da9255be410003c41e9b6ead7de77bd795ba5195f8b99d36021548a")
    public fun target(target: EventBridgeSchedulerTarget.Builder.() -> Unit)

    /**
     * @param taskTimeout Timeout for the task.
     * [disable-awslint:duration-prop-type] is needed because all props interface in
     * aws-stepfunctions-tasks extend this interface
     */
    public fun taskTimeout(taskTimeout: Timeout)

    /**
     * @param timeout Timeout for the task.
     * @deprecated use `taskTimeout`
     */
    @Deprecated(message = "deprecated in CDK")
    public fun timeout(timeout: Duration)

    /**
     * @param timezone The timezone in which the scheduling expression is evaluated.
     */
    public fun timezone(timezone: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.stepfunctions.tasks.EventBridgeSchedulerCreateScheduleTaskProps.Builder
        =
        software.amazon.awscdk.services.stepfunctions.tasks.EventBridgeSchedulerCreateScheduleTaskProps.builder()

    /**
     * @param actionAfterCompletion Specifies the action that EventBridge Scheduler applies to the
     * schedule after the schedule completes invoking the target.
     */
    override fun actionAfterCompletion(actionAfterCompletion: ActionAfterCompletion) {
      cdkBuilder.actionAfterCompletion(actionAfterCompletion.let(ActionAfterCompletion.Companion::unwrap))
    }

    /**
     * @param assign Workflow variables to store in this step.
     * Using workflow variables, you can store data in a step and retrieve that data in future
     * steps.
     */
    override fun assign(assign: Map<String, Any>) {
      cdkBuilder.assign(assign.mapValues{CdkObjectWrappers.unwrap(it.value)})
    }

    /**
     * @param clientToken Unique, case-sensitive identifier to ensure the idempotency of the
     * request.
     */
    override fun clientToken(clientToken: String) {
      cdkBuilder.clientToken(clientToken)
    }

    /**
     * @param comment A comment describing this state.
     */
    override fun comment(comment: String) {
      cdkBuilder.comment(comment)
    }

    /**
     * @param credentials Credentials for an IAM Role that the State Machine assumes for executing
     * the task.
     * This enables cross-account resource invocations.
     */
    override fun credentials(credentials: Credentials) {
      cdkBuilder.credentials(credentials.let(Credentials.Companion::unwrap))
    }

    /**
     * @param credentials Credentials for an IAM Role that the State Machine assumes for executing
     * the task.
     * This enables cross-account resource invocations.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b3c6fd40aad954b08dfa4da6341ddab8e3bdce4440f51655b56a0eae44cfe686")
    override fun credentials(credentials: Credentials.Builder.() -> Unit): Unit =
        credentials(Credentials(credentials))

    /**
     * @param description The description for the schedule.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param enabled Specifies whether the schedule is enabled or disabled.
     */
    override fun enabled(enabled: Boolean) {
      cdkBuilder.enabled(enabled)
    }

    /**
     * @param endDate The date, in UTC, before which the schedule can invoke its target.
     * Depending on the schedule's recurrence expression, invocations might stop on, or before, the
     * EndDate you specify.
     * EventBridge Scheduler ignores EndDate for one-time schedules.
     */
    override fun endDate(endDate: Instant) {
      cdkBuilder.endDate(endDate)
    }

    /**
     * @param flexibleTimeWindow The maximum time window during which a schedule can be invoked.
     * Minimum value is 1 minute.
     * Maximum value is 1440 minutes (1 day).
     */
    override fun flexibleTimeWindow(flexibleTimeWindow: Duration) {
      cdkBuilder.flexibleTimeWindow(flexibleTimeWindow.let(Duration.Companion::unwrap))
    }

    /**
     * @param groupName The name of the schedule group to associate with this schedule.
     */
    override fun groupName(groupName: String) {
      cdkBuilder.groupName(groupName)
    }

    /**
     * @param heartbeat Timeout for the heartbeat.
     * @deprecated use `heartbeatTimeout`
     */
    @Deprecated(message = "deprecated in CDK")
    override fun heartbeat(heartbeat: Duration) {
      cdkBuilder.heartbeat(heartbeat.let(Duration.Companion::unwrap))
    }

    /**
     * @param heartbeatTimeout Timeout for the heartbeat.
     * [disable-awslint:duration-prop-type] is needed because all props interface in
     * aws-stepfunctions-tasks extend this interface
     */
    override fun heartbeatTimeout(heartbeatTimeout: Timeout) {
      cdkBuilder.heartbeatTimeout(heartbeatTimeout.let(Timeout.Companion::unwrap))
    }

    /**
     * @param inputPath JSONPath expression to select part of the state to be the input to this
     * state.
     * May also be the special value JsonPath.DISCARD, which will cause the effective
     * input to be the empty object {}.
     */
    override fun inputPath(inputPath: String) {
      cdkBuilder.inputPath(inputPath)
    }

    /**
     * @param integrationPattern AWS Step Functions integrates with services directly in the Amazon
     * States Language.
     * You can control these AWS services using service integration patterns.
     *
     * Depending on the AWS Service, the Service Integration Pattern availability will vary.
     */
    override fun integrationPattern(integrationPattern: IntegrationPattern) {
      cdkBuilder.integrationPattern(integrationPattern.let(IntegrationPattern.Companion::unwrap))
    }

    /**
     * @param kmsKey The customer managed KMS key that EventBridge Scheduler will use to encrypt and
     * decrypt payload.
     */
    override fun kmsKey(kmsKey: IKey) {
      cdkBuilder.kmsKey(kmsKey.let(IKey.Companion::unwrap))
    }

    /**
     * @param outputPath JSONPath expression to select part of the state to be the output to this
     * state.
     * May also be the special value JsonPath.DISCARD, which will cause the effective
     * output to be the empty object {}.
     */
    override fun outputPath(outputPath: String) {
      cdkBuilder.outputPath(outputPath)
    }

    /**
     * @param outputs Used to specify and transform output from the state.
     * When specified, the value overrides the state output default.
     * The output field accepts any JSON value (object, array, string, number, boolean, null).
     * Any string value, including those inside objects or arrays,
     * will be evaluated as JSONata if surrounded by {% %} characters.
     * Output also accepts a JSONata expression directly.
     */
    override fun outputs(outputs: Any) {
      cdkBuilder.outputs(outputs)
    }

    /**
     * @param queryLanguage The name of the query language used by the state.
     * If the state does not contain a `queryLanguage` field,
     * then it will use the query language specified in the top-level `queryLanguage` field.
     */
    override fun queryLanguage(queryLanguage: QueryLanguage) {
      cdkBuilder.queryLanguage(queryLanguage.let(QueryLanguage.Companion::unwrap))
    }

    /**
     * @param resultPath JSONPath expression to indicate where to inject the state's output.
     * May also be the special value JsonPath.DISCARD, which will cause the state's
     * input to become its output.
     */
    override fun resultPath(resultPath: String) {
      cdkBuilder.resultPath(resultPath)
    }

    /**
     * @param resultSelector The JSON that will replace the state's raw result and become the
     * effective result before ResultPath is applied.
     * You can use ResultSelector to create a payload with values that are static
     * or selected from the state's raw result.
     */
    override fun resultSelector(resultSelector: Map<String, Any>) {
      cdkBuilder.resultSelector(resultSelector.mapValues{CdkObjectWrappers.unwrap(it.value)})
    }

    /**
     * @param schedule The schedule that defines when the schedule will trigger. 
     */
    override fun schedule(schedule: Schedule) {
      cdkBuilder.schedule(schedule.let(Schedule.Companion::unwrap))
    }

    /**
     * @param scheduleName Schedule name. 
     */
    override fun scheduleName(scheduleName: String) {
      cdkBuilder.scheduleName(scheduleName)
    }

    /**
     * @param startDate The date, in UTC, after which the schedule can begin invoking its target.
     * Depending on the schedule's recurrence expression, invocations might occur on, or after, the
     * StartDate you specify.
     * EventBridge Scheduler ignores StartDate for one-time schedules.
     */
    override fun startDate(startDate: Instant) {
      cdkBuilder.startDate(startDate)
    }

    /**
     * @param stateName Optional name for this state.
     */
    override fun stateName(stateName: String) {
      cdkBuilder.stateName(stateName)
    }

    /**
     * @param target The schedule's target. 
     */
    override fun target(target: EventBridgeSchedulerTarget) {
      cdkBuilder.target(target.let(EventBridgeSchedulerTarget.Companion::unwrap))
    }

    /**
     * @param target The schedule's target. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("81a6e1a23da9255be410003c41e9b6ead7de77bd795ba5195f8b99d36021548a")
    override fun target(target: EventBridgeSchedulerTarget.Builder.() -> Unit): Unit =
        target(EventBridgeSchedulerTarget(target))

    /**
     * @param taskTimeout Timeout for the task.
     * [disable-awslint:duration-prop-type] is needed because all props interface in
     * aws-stepfunctions-tasks extend this interface
     */
    override fun taskTimeout(taskTimeout: Timeout) {
      cdkBuilder.taskTimeout(taskTimeout.let(Timeout.Companion::unwrap))
    }

    /**
     * @param timeout Timeout for the task.
     * @deprecated use `taskTimeout`
     */
    @Deprecated(message = "deprecated in CDK")
    override fun timeout(timeout: Duration) {
      cdkBuilder.timeout(timeout.let(Duration.Companion::unwrap))
    }

    /**
     * @param timezone The timezone in which the scheduling expression is evaluated.
     */
    override fun timezone(timezone: String) {
      cdkBuilder.timezone(timezone)
    }

    public fun build():
        software.amazon.awscdk.services.stepfunctions.tasks.EventBridgeSchedulerCreateScheduleTaskProps
        = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.EventBridgeSchedulerCreateScheduleTaskProps,
  ) : CdkObject(cdkObject),
      EventBridgeSchedulerCreateScheduleTaskProps {
    /**
     * Specifies the action that EventBridge Scheduler applies to the schedule after the schedule
     * completes invoking the target.
     *
     * Default: ActionAfterCompletion.NONE
     */
    override fun actionAfterCompletion(): ActionAfterCompletion? =
        unwrap(this).getActionAfterCompletion()?.let(ActionAfterCompletion::wrap)

    /**
     * Workflow variables to store in this step.
     *
     * Using workflow variables, you can store data in a step and retrieve that data in future
     * steps.
     *
     * Default: - Not assign variables
     *
     * [Documentation](https://docs.aws.amazon.com/step-functions/latest/dg/workflow-variables.html)
     */
    override fun assign(): Map<String, Any> = unwrap(this).getAssign() ?: emptyMap()

    /**
     * Unique, case-sensitive identifier to ensure the idempotency of the request.
     *
     * Default: - Automatically generated
     */
    override fun clientToken(): String? = unwrap(this).getClientToken()

    /**
     * A comment describing this state.
     *
     * Default: No comment
     */
    override fun comment(): String? = unwrap(this).getComment()

    /**
     * Credentials for an IAM Role that the State Machine assumes for executing the task.
     *
     * This enables cross-account resource invocations.
     *
     * Default: - None (Task is executed using the State Machine's execution role)
     *
     * [Documentation](https://docs.aws.amazon.com/step-functions/latest/dg/concepts-access-cross-acct-resources.html)
     */
    override fun credentials(): Credentials? = unwrap(this).getCredentials()?.let(Credentials::wrap)

    /**
     * The description for the schedule.
     *
     * Default: - No description
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * Specifies whether the schedule is enabled or disabled.
     *
     * Default: true
     */
    override fun enabled(): Boolean? = unwrap(this).getEnabled()

    /**
     * The date, in UTC, before which the schedule can invoke its target.
     *
     * Depending on the schedule's recurrence expression, invocations might stop on, or before, the
     * EndDate you specify.
     * EventBridge Scheduler ignores EndDate for one-time schedules.
     *
     * Default: - No end date
     */
    override fun endDate(): Instant? = unwrap(this).getEndDate()

    /**
     * The maximum time window during which a schedule can be invoked.
     *
     * Minimum value is 1 minute.
     * Maximum value is 1440 minutes (1 day).
     *
     * Default: - Flexible time window is not enabled.
     */
    override fun flexibleTimeWindow(): Duration? =
        unwrap(this).getFlexibleTimeWindow()?.let(Duration::wrap)

    /**
     * The name of the schedule group to associate with this schedule.
     *
     * Default: - The default schedule group is used.
     */
    override fun groupName(): String? = unwrap(this).getGroupName()

    /**
     * (deprecated) Timeout for the heartbeat.
     *
     * Default: - None
     *
     * @deprecated use `heartbeatTimeout`
     */
    @Deprecated(message = "deprecated in CDK")
    override fun heartbeat(): Duration? = unwrap(this).getHeartbeat()?.let(Duration::wrap)

    /**
     * Timeout for the heartbeat.
     *
     * [disable-awslint:duration-prop-type] is needed because all props interface in
     * aws-stepfunctions-tasks extend this interface
     *
     * Default: - None
     */
    override fun heartbeatTimeout(): Timeout? =
        unwrap(this).getHeartbeatTimeout()?.let(Timeout::wrap)

    /**
     * JSONPath expression to select part of the state to be the input to this state.
     *
     * May also be the special value JsonPath.DISCARD, which will cause the effective
     * input to be the empty object {}.
     *
     * Default: $
     */
    override fun inputPath(): String? = unwrap(this).getInputPath()

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
     */
    override fun integrationPattern(): IntegrationPattern? =
        unwrap(this).getIntegrationPattern()?.let(IntegrationPattern::wrap)

    /**
     * The customer managed KMS key that EventBridge Scheduler will use to encrypt and decrypt
     * payload.
     *
     * Default: - Use automatically generated KMS key
     *
     * [Documentation](https://docs.aws.amazon.com/scheduler/latest/UserGuide/encryption-rest.html)
     */
    override fun kmsKey(): IKey? = unwrap(this).getKmsKey()?.let(IKey::wrap)

    /**
     * JSONPath expression to select part of the state to be the output to this state.
     *
     * May also be the special value JsonPath.DISCARD, which will cause the effective
     * output to be the empty object {}.
     *
     * Default: $
     */
    override fun outputPath(): String? = unwrap(this).getOutputPath()

    /**
     * Used to specify and transform output from the state.
     *
     * When specified, the value overrides the state output default.
     * The output field accepts any JSON value (object, array, string, number, boolean, null).
     * Any string value, including those inside objects or arrays,
     * will be evaluated as JSONata if surrounded by {% %} characters.
     * Output also accepts a JSONata expression directly.
     *
     * Default: - $states.result or $states.errorOutput
     *
     * [Documentation](https://docs.aws.amazon.com/step-functions/latest/dg/concepts-input-output-filtering.html)
     */
    override fun outputs(): Any? = unwrap(this).getOutputs()

    /**
     * The name of the query language used by the state.
     *
     * If the state does not contain a `queryLanguage` field,
     * then it will use the query language specified in the top-level `queryLanguage` field.
     *
     * Default: - JSONPath
     */
    override fun queryLanguage(): QueryLanguage? =
        unwrap(this).getQueryLanguage()?.let(QueryLanguage::wrap)

    /**
     * JSONPath expression to indicate where to inject the state's output.
     *
     * May also be the special value JsonPath.DISCARD, which will cause the state's
     * input to become its output.
     *
     * Default: $
     */
    override fun resultPath(): String? = unwrap(this).getResultPath()

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
     */
    override fun resultSelector(): Map<String, Any> = unwrap(this).getResultSelector() ?: emptyMap()

    /**
     * The schedule that defines when the schedule will trigger.
     *
     * [Documentation](https://docs.aws.amazon.com/scheduler/latest/UserGuide/schedule-types.html)
     */
    override fun schedule(): Schedule = unwrap(this).getSchedule().let(Schedule::wrap)

    /**
     * Schedule name.
     */
    override fun scheduleName(): String = unwrap(this).getScheduleName()

    /**
     * The date, in UTC, after which the schedule can begin invoking its target.
     *
     * Depending on the schedule's recurrence expression, invocations might occur on, or after, the
     * StartDate you specify.
     * EventBridge Scheduler ignores StartDate for one-time schedules.
     *
     * Default: - No start date
     */
    override fun startDate(): Instant? = unwrap(this).getStartDate()

    /**
     * Optional name for this state.
     *
     * Default: - The construct ID will be used as state name
     */
    override fun stateName(): String? = unwrap(this).getStateName()

    /**
     * The schedule's target.
     */
    override fun target(): EventBridgeSchedulerTarget =
        unwrap(this).getTarget().let(EventBridgeSchedulerTarget::wrap)

    /**
     * Timeout for the task.
     *
     * [disable-awslint:duration-prop-type] is needed because all props interface in
     * aws-stepfunctions-tasks extend this interface
     *
     * Default: - None
     */
    override fun taskTimeout(): Timeout? = unwrap(this).getTaskTimeout()?.let(Timeout::wrap)

    /**
     * (deprecated) Timeout for the task.
     *
     * Default: - None
     *
     * @deprecated use `taskTimeout`
     */
    @Deprecated(message = "deprecated in CDK")
    override fun timeout(): Duration? = unwrap(this).getTimeout()?.let(Duration::wrap)

    /**
     * The timezone in which the scheduling expression is evaluated.
     *
     * Default: - UTC
     */
    override fun timezone(): String? = unwrap(this).getTimezone()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}):
        EventBridgeSchedulerCreateScheduleTaskProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.EventBridgeSchedulerCreateScheduleTaskProps):
        EventBridgeSchedulerCreateScheduleTaskProps = CdkObjectWrappers.wrap(cdkObject) as?
        EventBridgeSchedulerCreateScheduleTaskProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: EventBridgeSchedulerCreateScheduleTaskProps):
        software.amazon.awscdk.services.stepfunctions.tasks.EventBridgeSchedulerCreateScheduleTaskProps
        = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.stepfunctions.tasks.EventBridgeSchedulerCreateScheduleTaskProps
  }
}
