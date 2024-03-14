package io.cloudshiftdev.awscdk.services.stepfunctions.tasks

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.sns.ITopic
import io.cloudshiftdev.awscdk.services.stepfunctions.Credentials
import io.cloudshiftdev.awscdk.services.stepfunctions.IntegrationPattern
import io.cloudshiftdev.awscdk.services.stepfunctions.TaskInput
import io.cloudshiftdev.awscdk.services.stepfunctions.TaskStateBase
import io.cloudshiftdev.awscdk.services.stepfunctions.Timeout
import kotlin.Any
import kotlin.Boolean
import kotlin.Deprecated
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class SnsPublish internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.SnsPublish,
) : TaskStateBase(cdkObject) {
  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.stepfunctions.tasks.SnsPublish].
   */
  @CdkDslMarker
  public interface Builder {
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
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("36e034ee794e6b2c498dc33e1c928b5563716757a21da4d2465113b631c6f36b")
    public fun credentials(credentials: Credentials.Builder.() -> Unit)

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
     * The message you want to send.
     *
     * With the exception of SMS, messages must be UTF-8 encoded strings and
     * at most 256 KB in size.
     * For SMS, each message can contain up to 140 characters.
     *
     * @param message The message you want to send. 
     */
    public fun message(message: TaskInput)

    /**
     * Add message attributes when publishing.
     *
     * These attributes carry additional metadata about the message and may be used
     * for subscription filters.
     *
     * Default: {}
     *
     * [Documentation](https://docs.aws.amazon.com/sns/latest/dg/sns-message-attributes.html)
     * @param messageAttributes Add message attributes when publishing. 
     */
    public fun messageAttributes(messageAttributes: Map<String, MessageAttribute>)

    /**
     * This parameter applies only to FIFO topics.
     *
     * Every message must have a unique MessageDeduplicationId, which is a token used for
     * deduplication of sent messages.
     * If a message with a particular MessageDeduplicationId is sent successfully, any message sent
     * with the same MessageDeduplicationId
     * during the 5-minute deduplication interval is treated as a duplicate.
     *
     * If the topic has ContentBasedDeduplication set, the system generates a MessageDeduplicationId
     * based on the contents of the message. Your MessageDeduplicationId overrides the generated
     * one.
     *
     * Default: - Not used for standard topics, required for FIFO topics with
     * ContentBasedDeduplication disabled.
     *
     * @param messageDeduplicationId This parameter applies only to FIFO topics. 
     */
    public fun messageDeduplicationId(messageDeduplicationId: String)

    /**
     * This parameter applies only to FIFO topics.
     *
     * The MessageGroupId is a tag that specifies that a message belongs to a specific message
     * group.
     * Messages that belong to the same message group are processed in a FIFO manner
     * (however, messages in different message groups might be processed out of order).
     * Every message must include a MessageGroupId.
     *
     * Default: - Not used for standard topics, required for FIFO topics.
     *
     * @param messageGroupId This parameter applies only to FIFO topics. 
     */
    public fun messageGroupId(messageGroupId: String)

    /**
     * Send different messages for each transport protocol.
     *
     * For example, you might want to send a shorter message to SMS subscribers
     * and a more verbose message to email and SQS subscribers.
     *
     * Your message must be a JSON object with a top-level JSON key of
     * "default" with a value that is a string
     * You can define other top-level keys that define the message you want to
     * send to a specific transport protocol (i.e. "sqs", "email", "http", etc)
     *
     * Default: false
     *
     * [Documentation](https://docs.aws.amazon.com/sns/latest/api/API_Publish.html#API_Publish_RequestParameters)
     * @param messagePerSubscriptionType Send different messages for each transport protocol. 
     */
    public fun messagePerSubscriptionType(messagePerSubscriptionType: Boolean)

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
     * Optional name for this state.
     *
     * Default: - The construct ID will be used as state name
     *
     * @param stateName Optional name for this state. 
     */
    public fun stateName(stateName: String)

    /**
     * Used as the "Subject" line when the message is delivered to email endpoints.
     *
     * This field will also be included, if present, in the standard JSON messages
     * delivered to other endpoints.
     *
     * Default: - No subject
     *
     * @param subject Used as the "Subject" line when the message is delivered to email endpoints. 
     */
    public fun subject(subject: String)

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
     * The SNS topic that the task will publish to.
     *
     * @param topic The SNS topic that the task will publish to. 
     */
    public fun topic(topic: ITopic)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.stepfunctions.tasks.SnsPublish.Builder =
        software.amazon.awscdk.services.stepfunctions.tasks.SnsPublish.Builder.create(scope, id)

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
      cdkBuilder.credentials(credentials.let(Credentials::unwrap))
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
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("36e034ee794e6b2c498dc33e1c928b5563716757a21da4d2465113b631c6f36b")
    override fun credentials(credentials: Credentials.Builder.() -> Unit): Unit =
        credentials(Credentials(credentials))

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
      cdkBuilder.heartbeat(heartbeat.let(Duration::unwrap))
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
      cdkBuilder.heartbeatTimeout(heartbeatTimeout.let(Timeout::unwrap))
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
      cdkBuilder.integrationPattern(integrationPattern.let(IntegrationPattern::unwrap))
    }

    /**
     * The message you want to send.
     *
     * With the exception of SMS, messages must be UTF-8 encoded strings and
     * at most 256 KB in size.
     * For SMS, each message can contain up to 140 characters.
     *
     * @param message The message you want to send. 
     */
    override fun message(message: TaskInput) {
      cdkBuilder.message(message.let(TaskInput::unwrap))
    }

    /**
     * Add message attributes when publishing.
     *
     * These attributes carry additional metadata about the message and may be used
     * for subscription filters.
     *
     * Default: {}
     *
     * [Documentation](https://docs.aws.amazon.com/sns/latest/dg/sns-message-attributes.html)
     * @param messageAttributes Add message attributes when publishing. 
     */
    override fun messageAttributes(messageAttributes: Map<String, MessageAttribute>) {
      cdkBuilder.messageAttributes(messageAttributes.mapValues{MessageAttribute.unwrap(it.value)})
    }

    /**
     * This parameter applies only to FIFO topics.
     *
     * Every message must have a unique MessageDeduplicationId, which is a token used for
     * deduplication of sent messages.
     * If a message with a particular MessageDeduplicationId is sent successfully, any message sent
     * with the same MessageDeduplicationId
     * during the 5-minute deduplication interval is treated as a duplicate.
     *
     * If the topic has ContentBasedDeduplication set, the system generates a MessageDeduplicationId
     * based on the contents of the message. Your MessageDeduplicationId overrides the generated
     * one.
     *
     * Default: - Not used for standard topics, required for FIFO topics with
     * ContentBasedDeduplication disabled.
     *
     * @param messageDeduplicationId This parameter applies only to FIFO topics. 
     */
    override fun messageDeduplicationId(messageDeduplicationId: String) {
      cdkBuilder.messageDeduplicationId(messageDeduplicationId)
    }

    /**
     * This parameter applies only to FIFO topics.
     *
     * The MessageGroupId is a tag that specifies that a message belongs to a specific message
     * group.
     * Messages that belong to the same message group are processed in a FIFO manner
     * (however, messages in different message groups might be processed out of order).
     * Every message must include a MessageGroupId.
     *
     * Default: - Not used for standard topics, required for FIFO topics.
     *
     * @param messageGroupId This parameter applies only to FIFO topics. 
     */
    override fun messageGroupId(messageGroupId: String) {
      cdkBuilder.messageGroupId(messageGroupId)
    }

    /**
     * Send different messages for each transport protocol.
     *
     * For example, you might want to send a shorter message to SMS subscribers
     * and a more verbose message to email and SQS subscribers.
     *
     * Your message must be a JSON object with a top-level JSON key of
     * "default" with a value that is a string
     * You can define other top-level keys that define the message you want to
     * send to a specific transport protocol (i.e. "sqs", "email", "http", etc)
     *
     * Default: false
     *
     * [Documentation](https://docs.aws.amazon.com/sns/latest/api/API_Publish.html#API_Publish_RequestParameters)
     * @param messagePerSubscriptionType Send different messages for each transport protocol. 
     */
    override fun messagePerSubscriptionType(messagePerSubscriptionType: Boolean) {
      cdkBuilder.messagePerSubscriptionType(messagePerSubscriptionType)
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
      cdkBuilder.resultSelector(resultSelector)
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
     * Used as the "Subject" line when the message is delivered to email endpoints.
     *
     * This field will also be included, if present, in the standard JSON messages
     * delivered to other endpoints.
     *
     * Default: - No subject
     *
     * @param subject Used as the "Subject" line when the message is delivered to email endpoints. 
     */
    override fun subject(subject: String) {
      cdkBuilder.subject(subject)
    }

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
      cdkBuilder.taskTimeout(taskTimeout.let(Timeout::unwrap))
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
      cdkBuilder.timeout(timeout.let(Duration::unwrap))
    }

    /**
     * The SNS topic that the task will publish to.
     *
     * @param topic The SNS topic that the task will publish to. 
     */
    override fun topic(topic: ITopic) {
      cdkBuilder.topic(topic.let(ITopic::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.stepfunctions.tasks.SnsPublish =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): SnsPublish {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return SnsPublish(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.SnsPublish):
        SnsPublish = SnsPublish(cdkObject)

    internal fun unwrap(wrapped: SnsPublish):
        software.amazon.awscdk.services.stepfunctions.tasks.SnsPublish = wrapped.cdkObject
  }
}
