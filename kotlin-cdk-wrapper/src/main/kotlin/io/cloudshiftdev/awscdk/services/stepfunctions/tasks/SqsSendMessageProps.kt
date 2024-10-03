@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions.tasks

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.sqs.IQueue
import io.cloudshiftdev.awscdk.services.stepfunctions.Credentials
import io.cloudshiftdev.awscdk.services.stepfunctions.IntegrationPattern
import io.cloudshiftdev.awscdk.services.stepfunctions.TaskInput
import io.cloudshiftdev.awscdk.services.stepfunctions.TaskStateBaseProps
import io.cloudshiftdev.awscdk.services.stepfunctions.Timeout
import kotlin.Any
import kotlin.Deprecated
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import kotlin.jvm.JvmName

/**
 * Properties for sending a message to an SQS queue.
 *
 * Example:
 *
 * ```
 * Queue queue = new Queue(this, "Queue");
 * // Use a field from the execution data as message.
 * SqsSendMessage task1 = SqsSendMessage.Builder.create(this, "Send1")
 * .queue(queue)
 * .messageBody(TaskInput.fromJsonPathAt("$.message"))
 * .build();
 * // Combine a field from the execution data with
 * // a literal object.
 * SqsSendMessage task2 = SqsSendMessage.Builder.create(this, "Send2")
 * .queue(queue)
 * .messageBody(TaskInput.fromObject(Map.of(
 * "field1", "somedata",
 * "field2", JsonPath.stringAt("$.field2"))))
 * .build();
 * ```
 */
public interface SqsSendMessageProps : TaskStateBaseProps {
  /**
   * The length of time, for which to delay a message.
   *
   * Messages that you send to the queue remain invisible to consumers for the duration
   * of the delay period. The maximum allowed delay is 15 minutes.
   *
   * Default: - delay set on the queue. If a delay is not set on the queue,
   * messages are sent immediately (0 seconds).
   */
  public fun delay(): Duration? = unwrap(this).getDelay()?.let(Duration::wrap)

  /**
   * The text message to send to the queue.
   */
  public fun messageBody(): TaskInput

  /**
   * The token used for deduplication of sent messages.
   *
   * Any messages sent with the same deduplication ID are accepted successfully,
   * but aren't delivered during the 5-minute deduplication interval.
   *
   * Default: - None
   */
  public fun messageDeduplicationId(): String? = unwrap(this).getMessageDeduplicationId()

  /**
   * The tag that specifies that a message belongs to a specific message group.
   *
   * Messages that belong to the same message group are processed in a FIFO manner.
   * Messages in different message groups might be processed out of order.
   *
   * Default: - None
   */
  public fun messageGroupId(): String? = unwrap(this).getMessageGroupId()

  /**
   * The SQS queue that messages will be sent to.
   */
  public fun queue(): IQueue

  /**
   * A builder for [SqsSendMessageProps]
   */
  @CdkDslMarker
  public interface Builder {
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
    @JvmName("a642bd4c02e36598e4b85287298c68d48c26c2c086018a8bcf874cf4b14a714c")
    public fun credentials(credentials: Credentials.Builder.() -> Unit)

    /**
     * @param delay The length of time, for which to delay a message.
     * Messages that you send to the queue remain invisible to consumers for the duration
     * of the delay period. The maximum allowed delay is 15 minutes.
     */
    public fun delay(delay: Duration)

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
     * @param messageBody The text message to send to the queue. 
     */
    public fun messageBody(messageBody: TaskInput)

    /**
     * @param messageDeduplicationId The token used for deduplication of sent messages.
     * Any messages sent with the same deduplication ID are accepted successfully,
     * but aren't delivered during the 5-minute deduplication interval.
     */
    public fun messageDeduplicationId(messageDeduplicationId: String)

    /**
     * @param messageGroupId The tag that specifies that a message belongs to a specific message
     * group.
     * Messages that belong to the same message group are processed in a FIFO manner.
     * Messages in different message groups might be processed out of order.
     */
    public fun messageGroupId(messageGroupId: String)

    /**
     * @param outputPath JSONPath expression to select select a portion of the state output to pass
     * to the next state.
     * May also be the special value JsonPath.DISCARD, which will cause the effective
     * output to be the empty object {}.
     */
    public fun outputPath(outputPath: String)

    /**
     * @param queue The SQS queue that messages will be sent to. 
     */
    public fun queue(queue: IQueue)

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
        software.amazon.awscdk.services.stepfunctions.tasks.SqsSendMessageProps.Builder =
        software.amazon.awscdk.services.stepfunctions.tasks.SqsSendMessageProps.builder()

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
      cdkBuilder.credentials(credentials.let(Credentials.Companion::unwrap))
    }

    /**
     * @param credentials Credentials for an IAM Role that the State Machine assumes for executing
     * the task.
     * This enables cross-account resource invocations.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a642bd4c02e36598e4b85287298c68d48c26c2c086018a8bcf874cf4b14a714c")
    override fun credentials(credentials: Credentials.Builder.() -> Unit): Unit =
        credentials(Credentials(credentials))

    /**
     * @param delay The length of time, for which to delay a message.
     * Messages that you send to the queue remain invisible to consumers for the duration
     * of the delay period. The maximum allowed delay is 15 minutes.
     */
    override fun delay(delay: Duration) {
      cdkBuilder.delay(delay.let(Duration.Companion::unwrap))
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
     * @param messageBody The text message to send to the queue. 
     */
    override fun messageBody(messageBody: TaskInput) {
      cdkBuilder.messageBody(messageBody.let(TaskInput.Companion::unwrap))
    }

    /**
     * @param messageDeduplicationId The token used for deduplication of sent messages.
     * Any messages sent with the same deduplication ID are accepted successfully,
     * but aren't delivered during the 5-minute deduplication interval.
     */
    override fun messageDeduplicationId(messageDeduplicationId: String) {
      cdkBuilder.messageDeduplicationId(messageDeduplicationId)
    }

    /**
     * @param messageGroupId The tag that specifies that a message belongs to a specific message
     * group.
     * Messages that belong to the same message group are processed in a FIFO manner.
     * Messages in different message groups might be processed out of order.
     */
    override fun messageGroupId(messageGroupId: String) {
      cdkBuilder.messageGroupId(messageGroupId)
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
     * @param queue The SQS queue that messages will be sent to. 
     */
    override fun queue(queue: IQueue) {
      cdkBuilder.queue(queue.let(IQueue.Companion::unwrap))
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

    public fun build(): software.amazon.awscdk.services.stepfunctions.tasks.SqsSendMessageProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.SqsSendMessageProps,
  ) : CdkObject(cdkObject),
      SqsSendMessageProps {
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
     * The length of time, for which to delay a message.
     *
     * Messages that you send to the queue remain invisible to consumers for the duration
     * of the delay period. The maximum allowed delay is 15 minutes.
     *
     * Default: - delay set on the queue. If a delay is not set on the queue,
     * messages are sent immediately (0 seconds).
     */
    override fun delay(): Duration? = unwrap(this).getDelay()?.let(Duration::wrap)

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
     * The text message to send to the queue.
     */
    override fun messageBody(): TaskInput = unwrap(this).getMessageBody().let(TaskInput::wrap)

    /**
     * The token used for deduplication of sent messages.
     *
     * Any messages sent with the same deduplication ID are accepted successfully,
     * but aren't delivered during the 5-minute deduplication interval.
     *
     * Default: - None
     */
    override fun messageDeduplicationId(): String? = unwrap(this).getMessageDeduplicationId()

    /**
     * The tag that specifies that a message belongs to a specific message group.
     *
     * Messages that belong to the same message group are processed in a FIFO manner.
     * Messages in different message groups might be processed out of order.
     *
     * Default: - None
     */
    override fun messageGroupId(): String? = unwrap(this).getMessageGroupId()

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
     * The SQS queue that messages will be sent to.
     */
    override fun queue(): IQueue = unwrap(this).getQueue().let(IQueue::wrap)

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
    public operator fun invoke(block: Builder.() -> Unit = {}): SqsSendMessageProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.SqsSendMessageProps):
        SqsSendMessageProps = CdkObjectWrappers.wrap(cdkObject) as? SqsSendMessageProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: SqsSendMessageProps):
        software.amazon.awscdk.services.stepfunctions.tasks.SqsSendMessageProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.stepfunctions.tasks.SqsSendMessageProps
  }
}
