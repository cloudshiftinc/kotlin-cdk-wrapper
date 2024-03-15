@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions.tasks

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.stepfunctions.Credentials
import io.cloudshiftdev.awscdk.services.stepfunctions.IStateMachine
import io.cloudshiftdev.awscdk.services.stepfunctions.IntegrationPattern
import io.cloudshiftdev.awscdk.services.stepfunctions.TaskInput
import io.cloudshiftdev.awscdk.services.stepfunctions.TaskStateBaseProps
import io.cloudshiftdev.awscdk.services.stepfunctions.Timeout
import kotlin.Any
import kotlin.Boolean
import kotlin.Deprecated
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import kotlin.jvm.JvmName

/**
 * Properties for StartExecution.
 *
 * Example:
 *
 * ```
 * // Define a state machine with one Pass state
 * StateMachine child = StateMachine.Builder.create(this, "ChildStateMachine")
 * .definition(Chain.start(new Pass(this, "PassState")))
 * .build();
 * // Include the state machine in a Task state with callback pattern
 * StepFunctionsStartExecution task = StepFunctionsStartExecution.Builder.create(this, "ChildTask")
 * .stateMachine(child)
 * .integrationPattern(IntegrationPattern.WAIT_FOR_TASK_TOKEN)
 * .input(TaskInput.fromObject(Map.of(
 * "token", JsonPath.getTaskToken(),
 * "foo", "bar")))
 * .name("MyExecutionName")
 * .build();
 * // Define a second state machine with the Task state above
 * // Define a second state machine with the Task state above
 * StateMachine.Builder.create(this, "ParentStateMachine")
 * .definition(task)
 * .build();
 * ```
 */
public interface StepFunctionsStartExecutionProps : TaskStateBaseProps {
  /**
   * Pass the execution ID from the context object to the execution input.
   *
   * This allows the Step Functions UI to link child executions from parent executions, making it
   * easier to trace execution flow across state machines.
   *
   * If you set this property to `true`, the `input` property must be an object (provided by
   * `sfn.TaskInput.fromObject`) or omitted entirely.
   *
   * Default: - false
   *
   * [Documentation](https://docs.aws.amazon.com/step-functions/latest/dg/concepts-nested-workflows.html#nested-execution-startid)
   */
  public fun associateWithParent(): Boolean? = unwrap(this).getAssociateWithParent()

  /**
   * The JSON input for the execution, same as that of StartExecution.
   *
   * Default: - The state input (JSON path '$')
   *
   * [Documentation](https://docs.aws.amazon.com/step-functions/latest/apireference/API_StartExecution.html)
   */
  public fun input(): TaskInput? = unwrap(this).getInput()?.let(TaskInput::wrap)

  /**
   * The name of the execution, same as that of StartExecution.
   *
   * Default: - None
   *
   * [Documentation](https://docs.aws.amazon.com/step-functions/latest/apireference/API_StartExecution.html)
   */
  public fun name(): String? = unwrap(this).getName()

  /**
   * The Step Functions state machine to start the execution on.
   */
  public fun stateMachine(): IStateMachine

  /**
   * A builder for [StepFunctionsStartExecutionProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param associateWithParent Pass the execution ID from the context object to the execution
     * input.
     * This allows the Step Functions UI to link child executions from parent executions, making it
     * easier to trace execution flow across state machines.
     *
     * If you set this property to `true`, the `input` property must be an object (provided by
     * `sfn.TaskInput.fromObject`) or omitted entirely.
     */
    public fun associateWithParent(associateWithParent: Boolean)

    /**
     * @param comment An optional description for this state.
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
    @JvmName("a3b4c921942743db5399185460d6c0ffb839084be2dec8498ef9d30428d19f91")
    public fun credentials(credentials: Credentials.Builder.() -> Unit)

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
     * @param input The JSON input for the execution, same as that of StartExecution.
     */
    public fun input(input: TaskInput)

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
     * @param name The name of the execution, same as that of StartExecution.
     */
    public fun name(name: String)

    /**
     * @param outputPath JSONPath expression to select select a portion of the state output to pass
     * to the next state.
     * May also be the special value JsonPath.DISCARD, which will cause the effective
     * output to be the empty object {}.
     */
    public fun outputPath(outputPath: String)

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
     * @param stateMachine The Step Functions state machine to start the execution on. 
     */
    public fun stateMachine(stateMachine: IStateMachine)

    /**
     * @param stateName Optional name for this state.
     */
    public fun stateName(stateName: String)

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
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.stepfunctions.tasks.StepFunctionsStartExecutionProps.Builder
        =
        software.amazon.awscdk.services.stepfunctions.tasks.StepFunctionsStartExecutionProps.builder()

    /**
     * @param associateWithParent Pass the execution ID from the context object to the execution
     * input.
     * This allows the Step Functions UI to link child executions from parent executions, making it
     * easier to trace execution flow across state machines.
     *
     * If you set this property to `true`, the `input` property must be an object (provided by
     * `sfn.TaskInput.fromObject`) or omitted entirely.
     */
    override fun associateWithParent(associateWithParent: Boolean) {
      cdkBuilder.associateWithParent(associateWithParent)
    }

    /**
     * @param comment An optional description for this state.
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
      cdkBuilder.credentials(credentials.let(Credentials::unwrap))
    }

    /**
     * @param credentials Credentials for an IAM Role that the State Machine assumes for executing
     * the task.
     * This enables cross-account resource invocations.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a3b4c921942743db5399185460d6c0ffb839084be2dec8498ef9d30428d19f91")
    override fun credentials(credentials: Credentials.Builder.() -> Unit): Unit =
        credentials(Credentials(credentials))

    /**
     * @param heartbeat Timeout for the heartbeat.
     * @deprecated use `heartbeatTimeout`
     */
    @Deprecated(message = "deprecated in CDK")
    override fun heartbeat(heartbeat: Duration) {
      cdkBuilder.heartbeat(heartbeat.let(Duration::unwrap))
    }

    /**
     * @param heartbeatTimeout Timeout for the heartbeat.
     * [disable-awslint:duration-prop-type] is needed because all props interface in
     * aws-stepfunctions-tasks extend this interface
     */
    override fun heartbeatTimeout(heartbeatTimeout: Timeout) {
      cdkBuilder.heartbeatTimeout(heartbeatTimeout.let(Timeout::unwrap))
    }

    /**
     * @param input The JSON input for the execution, same as that of StartExecution.
     */
    override fun input(input: TaskInput) {
      cdkBuilder.input(input.let(TaskInput::unwrap))
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
      cdkBuilder.integrationPattern(integrationPattern.let(IntegrationPattern::unwrap))
    }

    /**
     * @param name The name of the execution, same as that of StartExecution.
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param outputPath JSONPath expression to select select a portion of the state output to pass
     * to the next state.
     * May also be the special value JsonPath.DISCARD, which will cause the effective
     * output to be the empty object {}.
     */
    override fun outputPath(outputPath: String) {
      cdkBuilder.outputPath(outputPath)
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
      cdkBuilder.resultSelector(resultSelector)
    }

    /**
     * @param stateMachine The Step Functions state machine to start the execution on. 
     */
    override fun stateMachine(stateMachine: IStateMachine) {
      cdkBuilder.stateMachine(stateMachine.let(IStateMachine::unwrap))
    }

    /**
     * @param stateName Optional name for this state.
     */
    override fun stateName(stateName: String) {
      cdkBuilder.stateName(stateName)
    }

    /**
     * @param taskTimeout Timeout for the task.
     * [disable-awslint:duration-prop-type] is needed because all props interface in
     * aws-stepfunctions-tasks extend this interface
     */
    override fun taskTimeout(taskTimeout: Timeout) {
      cdkBuilder.taskTimeout(taskTimeout.let(Timeout::unwrap))
    }

    /**
     * @param timeout Timeout for the task.
     * @deprecated use `taskTimeout`
     */
    @Deprecated(message = "deprecated in CDK")
    override fun timeout(timeout: Duration) {
      cdkBuilder.timeout(timeout.let(Duration::unwrap))
    }

    public fun build():
        software.amazon.awscdk.services.stepfunctions.tasks.StepFunctionsStartExecutionProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.stepfunctions.tasks.StepFunctionsStartExecutionProps,
  ) : CdkObject(cdkObject), StepFunctionsStartExecutionProps {
    /**
     * Pass the execution ID from the context object to the execution input.
     *
     * This allows the Step Functions UI to link child executions from parent executions, making it
     * easier to trace execution flow across state machines.
     *
     * If you set this property to `true`, the `input` property must be an object (provided by
     * `sfn.TaskInput.fromObject`) or omitted entirely.
     *
     * Default: - false
     *
     * [Documentation](https://docs.aws.amazon.com/step-functions/latest/dg/concepts-nested-workflows.html#nested-execution-startid)
     */
    override fun associateWithParent(): Boolean? = unwrap(this).getAssociateWithParent()

    /**
     * An optional description for this state.
     *
     * Default: - No comment
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
     * The JSON input for the execution, same as that of StartExecution.
     *
     * Default: - The state input (JSON path '$')
     *
     * [Documentation](https://docs.aws.amazon.com/step-functions/latest/apireference/API_StartExecution.html)
     */
    override fun input(): TaskInput? = unwrap(this).getInput()?.let(TaskInput::wrap)

    /**
     * JSONPath expression to select part of the state to be the input to this state.
     *
     * May also be the special value JsonPath.DISCARD, which will cause the effective
     * input to be the empty object {}.
     *
     * Default: - The entire task input (JSON path '$')
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
     * The name of the execution, same as that of StartExecution.
     *
     * Default: - None
     *
     * [Documentation](https://docs.aws.amazon.com/step-functions/latest/apireference/API_StartExecution.html)
     */
    override fun name(): String? = unwrap(this).getName()

    /**
     * JSONPath expression to select select a portion of the state output to pass to the next state.
     *
     * May also be the special value JsonPath.DISCARD, which will cause the effective
     * output to be the empty object {}.
     *
     * Default: - The entire JSON node determined by the state input, the task result,
     * and resultPath is passed to the next state (JSON path '$')
     */
    override fun outputPath(): String? = unwrap(this).getOutputPath()

    /**
     * JSONPath expression to indicate where to inject the state's output.
     *
     * May also be the special value JsonPath.DISCARD, which will cause the state's
     * input to become its output.
     *
     * Default: - Replaces the entire input with the result (JSON path '$')
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
     * The Step Functions state machine to start the execution on.
     */
    override fun stateMachine(): IStateMachine =
        unwrap(this).getStateMachine().let(IStateMachine::wrap)

    /**
     * Optional name for this state.
     *
     * Default: - The construct ID will be used as state name
     */
    override fun stateName(): String? = unwrap(this).getStateName()

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
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): StepFunctionsStartExecutionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.StepFunctionsStartExecutionProps):
        StepFunctionsStartExecutionProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: StepFunctionsStartExecutionProps):
        software.amazon.awscdk.services.stepfunctions.tasks.StepFunctionsStartExecutionProps =
        (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.stepfunctions.tasks.StepFunctionsStartExecutionProps
  }
}
