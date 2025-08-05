@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions.tasks

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.sqs.IQueue
import io.cloudshiftdev.awscdk.services.stepfunctions.Credentials
import io.cloudshiftdev.awscdk.services.stepfunctions.IntegrationPattern
import io.cloudshiftdev.awscdk.services.stepfunctions.QueryLanguage
import io.cloudshiftdev.awscdk.services.stepfunctions.TaskInput
import io.cloudshiftdev.awscdk.services.stepfunctions.TaskStateJsonataBaseProps
import io.cloudshiftdev.awscdk.services.stepfunctions.Timeout
import kotlin.Any
import kotlin.Deprecated
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import kotlin.jvm.JvmName

/**
 * Properties for sending a message to an SQS queue using JSONata.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.*;
 * import io.cloudshiftdev.awscdk.services.sqs.*;
 * import io.cloudshiftdev.awscdk.services.stepfunctions.*;
 * import io.cloudshiftdev.awscdk.services.stepfunctions.tasks.*;
 * Object assign;
 * Object outputs;
 * Queue queue;
 * TaskInput taskInput;
 * TaskRole taskRole;
 * Timeout timeout;
 * SqsSendMessageJsonataProps sqsSendMessageJsonataProps = SqsSendMessageJsonataProps.builder()
 * .messageBody(taskInput)
 * .queue(queue)
 * // the properties below are optional
 * .assign(Map.of(
 * "assignKey", assign))
 * .comment("comment")
 * .credentials(Credentials.builder()
 * .role(taskRole)
 * .build())
 * .delay(Duration.minutes(30))
 * .heartbeat(Duration.minutes(30))
 * .heartbeatTimeout(timeout)
 * .integrationPattern(IntegrationPattern.REQUEST_RESPONSE)
 * .messageDeduplicationId("messageDeduplicationId")
 * .messageGroupId("messageGroupId")
 * .outputs(outputs)
 * .queryLanguage(QueryLanguage.JSON_PATH)
 * .stateName("stateName")
 * .taskTimeout(timeout)
 * .timeout(Duration.minutes(30))
 * .build();
 * ```
 */
public interface SqsSendMessageJsonataProps : TaskStateJsonataBaseProps {
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
   * A builder for [SqsSendMessageJsonataProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param assign Workflow variables to store in this step.
     * Using workflow variables, you can store data in a step and retrieve that data in future
     * steps.
     */
    public fun assign(assign: Map<String, Any>)

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
    @JvmName("cda5d407b5708f087cd3d203ea6c962067f4c23494d132f3fa736c94ad480005")
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
     * @param queue The SQS queue that messages will be sent to. 
     */
    public fun queue(queue: IQueue)

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
        software.amazon.awscdk.services.stepfunctions.tasks.SqsSendMessageJsonataProps.Builder =
        software.amazon.awscdk.services.stepfunctions.tasks.SqsSendMessageJsonataProps.builder()

    /**
     * @param assign Workflow variables to store in this step.
     * Using workflow variables, you can store data in a step and retrieve that data in future
     * steps.
     */
    override fun assign(assign: Map<String, Any>) {
      cdkBuilder.assign(assign.mapValues{CdkObjectWrappers.unwrap(it.value)})
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
    @JvmName("cda5d407b5708f087cd3d203ea6c962067f4c23494d132f3fa736c94ad480005")
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
     * @param queue The SQS queue that messages will be sent to. 
     */
    override fun queue(queue: IQueue) {
      cdkBuilder.queue(queue.let(IQueue.Companion::unwrap))
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

    public fun build():
        software.amazon.awscdk.services.stepfunctions.tasks.SqsSendMessageJsonataProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.SqsSendMessageJsonataProps,
  ) : CdkObject(cdkObject),
      SqsSendMessageJsonataProps {
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
     * The SQS queue that messages will be sent to.
     */
    override fun queue(): IQueue = unwrap(this).getQueue().let(IQueue::wrap)

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
    public operator fun invoke(block: Builder.() -> Unit = {}): SqsSendMessageJsonataProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.SqsSendMessageJsonataProps):
        SqsSendMessageJsonataProps = CdkObjectWrappers.wrap(cdkObject) as?
        SqsSendMessageJsonataProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: SqsSendMessageJsonataProps):
        software.amazon.awscdk.services.stepfunctions.tasks.SqsSendMessageJsonataProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.stepfunctions.tasks.SqsSendMessageJsonataProps
  }
}
