@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions.tasks

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.sns.ITopic
import io.cloudshiftdev.awscdk.services.stepfunctions.Credentials
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
 * Properties for publishing a message to an SNS topic.
 *
 * Example:
 *
 * ```
 * EvaluateExpression convertToSeconds = EvaluateExpression.Builder.create(this, "Convert to
 * seconds")
 * .expression("$.waitMilliseconds / 1000")
 * .resultPath("$.waitSeconds")
 * .build();
 * EvaluateExpression createMessage = EvaluateExpression.Builder.create(this, "Create message")
 * // Note: this is a string inside a string.
 * .expression("`Now waiting ${$.waitSeconds} seconds...`")
 * .runtime(Runtime.NODEJS_LATEST)
 * .resultPath("$.message")
 * .build();
 * SnsPublish publishMessage = SnsPublish.Builder.create(this, "Publish message")
 * .topic(new Topic(this, "cool-topic"))
 * .message(TaskInput.fromJsonPathAt("$.message"))
 * .resultPath("$.sns")
 * .build();
 * Wait wait = Wait.Builder.create(this, "Wait")
 * .time(WaitTime.secondsPath("$.waitSeconds"))
 * .build();
 * StateMachine.Builder.create(this, "StateMachine")
 * .definition(convertToSeconds.next(createMessage).next(publishMessage).next(wait))
 * .build();
 * ```
 */
public interface SnsPublishProps : TaskStateBaseProps {
  /**
   * The message you want to send.
   *
   * With the exception of SMS, messages must be UTF-8 encoded strings and
   * at most 256 KB in size.
   * For SMS, each message can contain up to 140 characters.
   */
  public fun message(): TaskInput

  /**
   * Add message attributes when publishing.
   *
   * These attributes carry additional metadata about the message and may be used
   * for subscription filters.
   *
   * Default: {}
   *
   * [Documentation](https://docs.aws.amazon.com/sns/latest/dg/sns-message-attributes.html)
   */
  public fun messageAttributes(): Map<String, MessageAttribute> =
      unwrap(this).getMessageAttributes()?.mapValues{MessageAttribute.wrap(it.value)} ?: emptyMap()

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
   * based on the contents of the message. Your MessageDeduplicationId overrides the generated one.
   *
   * Default: - Not used for standard topics, required for FIFO topics with
   * ContentBasedDeduplication disabled.
   */
  public fun messageDeduplicationId(): String? = unwrap(this).getMessageDeduplicationId()

  /**
   * This parameter applies only to FIFO topics.
   *
   * The MessageGroupId is a tag that specifies that a message belongs to a specific message group.
   * Messages that belong to the same message group are processed in a FIFO manner
   * (however, messages in different message groups might be processed out of order).
   * Every message must include a MessageGroupId.
   *
   * Default: - Not used for standard topics, required for FIFO topics.
   */
  public fun messageGroupId(): String? = unwrap(this).getMessageGroupId()

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
   */
  public fun messagePerSubscriptionType(): Boolean? = unwrap(this).getMessagePerSubscriptionType()

  /**
   * Used as the "Subject" line when the message is delivered to email endpoints.
   *
   * This field will also be included, if present, in the standard JSON messages
   * delivered to other endpoints.
   *
   * Default: - No subject
   */
  public fun subject(): String? = unwrap(this).getSubject()

  /**
   * The SNS topic that the task will publish to.
   */
  public fun topic(): ITopic

  /**
   * A builder for [SnsPublishProps]
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
    @JvmName("9c11b051f4ddaaaef3c98ff720b11e6db2f54c4d304281af8ef4be2c8ef72bb8")
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
     * @param message The message you want to send. 
     * With the exception of SMS, messages must be UTF-8 encoded strings and
     * at most 256 KB in size.
     * For SMS, each message can contain up to 140 characters.
     */
    public fun message(message: TaskInput)

    /**
     * @param messageAttributes Add message attributes when publishing.
     * These attributes carry additional metadata about the message and may be used
     * for subscription filters.
     */
    public fun messageAttributes(messageAttributes: Map<String, MessageAttribute>)

    /**
     * @param messageDeduplicationId This parameter applies only to FIFO topics.
     * Every message must have a unique MessageDeduplicationId, which is a token used for
     * deduplication of sent messages.
     * If a message with a particular MessageDeduplicationId is sent successfully, any message sent
     * with the same MessageDeduplicationId
     * during the 5-minute deduplication interval is treated as a duplicate.
     *
     * If the topic has ContentBasedDeduplication set, the system generates a MessageDeduplicationId
     * based on the contents of the message. Your MessageDeduplicationId overrides the generated
     * one.
     */
    public fun messageDeduplicationId(messageDeduplicationId: String)

    /**
     * @param messageGroupId This parameter applies only to FIFO topics.
     * The MessageGroupId is a tag that specifies that a message belongs to a specific message
     * group.
     * Messages that belong to the same message group are processed in a FIFO manner
     * (however, messages in different message groups might be processed out of order).
     * Every message must include a MessageGroupId.
     */
    public fun messageGroupId(messageGroupId: String)

    /**
     * @param messagePerSubscriptionType Send different messages for each transport protocol.
     * For example, you might want to send a shorter message to SMS subscribers
     * and a more verbose message to email and SQS subscribers.
     *
     * Your message must be a JSON object with a top-level JSON key of
     * "default" with a value that is a string
     * You can define other top-level keys that define the message you want to
     * send to a specific transport protocol (i.e. "sqs", "email", "http", etc)
     */
    public fun messagePerSubscriptionType(messagePerSubscriptionType: Boolean)

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
     * @param stateName Optional name for this state.
     */
    public fun stateName(stateName: String)

    /**
     * @param subject Used as the "Subject" line when the message is delivered to email endpoints.
     * This field will also be included, if present, in the standard JSON messages
     * delivered to other endpoints.
     */
    public fun subject(subject: String)

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
     * @param topic The SNS topic that the task will publish to. 
     */
    public fun topic(topic: ITopic)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.stepfunctions.tasks.SnsPublishProps.Builder =
        software.amazon.awscdk.services.stepfunctions.tasks.SnsPublishProps.builder()

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
    @JvmName("9c11b051f4ddaaaef3c98ff720b11e6db2f54c4d304281af8ef4be2c8ef72bb8")
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
     * @param message The message you want to send. 
     * With the exception of SMS, messages must be UTF-8 encoded strings and
     * at most 256 KB in size.
     * For SMS, each message can contain up to 140 characters.
     */
    override fun message(message: TaskInput) {
      cdkBuilder.message(message.let(TaskInput::unwrap))
    }

    /**
     * @param messageAttributes Add message attributes when publishing.
     * These attributes carry additional metadata about the message and may be used
     * for subscription filters.
     */
    override fun messageAttributes(messageAttributes: Map<String, MessageAttribute>) {
      cdkBuilder.messageAttributes(messageAttributes.mapValues{MessageAttribute.unwrap(it.value)})
    }

    /**
     * @param messageDeduplicationId This parameter applies only to FIFO topics.
     * Every message must have a unique MessageDeduplicationId, which is a token used for
     * deduplication of sent messages.
     * If a message with a particular MessageDeduplicationId is sent successfully, any message sent
     * with the same MessageDeduplicationId
     * during the 5-minute deduplication interval is treated as a duplicate.
     *
     * If the topic has ContentBasedDeduplication set, the system generates a MessageDeduplicationId
     * based on the contents of the message. Your MessageDeduplicationId overrides the generated
     * one.
     */
    override fun messageDeduplicationId(messageDeduplicationId: String) {
      cdkBuilder.messageDeduplicationId(messageDeduplicationId)
    }

    /**
     * @param messageGroupId This parameter applies only to FIFO topics.
     * The MessageGroupId is a tag that specifies that a message belongs to a specific message
     * group.
     * Messages that belong to the same message group are processed in a FIFO manner
     * (however, messages in different message groups might be processed out of order).
     * Every message must include a MessageGroupId.
     */
    override fun messageGroupId(messageGroupId: String) {
      cdkBuilder.messageGroupId(messageGroupId)
    }

    /**
     * @param messagePerSubscriptionType Send different messages for each transport protocol.
     * For example, you might want to send a shorter message to SMS subscribers
     * and a more verbose message to email and SQS subscribers.
     *
     * Your message must be a JSON object with a top-level JSON key of
     * "default" with a value that is a string
     * You can define other top-level keys that define the message you want to
     * send to a specific transport protocol (i.e. "sqs", "email", "http", etc)
     */
    override fun messagePerSubscriptionType(messagePerSubscriptionType: Boolean) {
      cdkBuilder.messagePerSubscriptionType(messagePerSubscriptionType)
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
      cdkBuilder.resultSelector(resultSelector.mapValues{CdkObjectWrappers.unwrap(it.value)})
    }

    /**
     * @param stateName Optional name for this state.
     */
    override fun stateName(stateName: String) {
      cdkBuilder.stateName(stateName)
    }

    /**
     * @param subject Used as the "Subject" line when the message is delivered to email endpoints.
     * This field will also be included, if present, in the standard JSON messages
     * delivered to other endpoints.
     */
    override fun subject(subject: String) {
      cdkBuilder.subject(subject)
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

    /**
     * @param topic The SNS topic that the task will publish to. 
     */
    override fun topic(topic: ITopic) {
      cdkBuilder.topic(topic.let(ITopic::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.stepfunctions.tasks.SnsPublishProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.SnsPublishProps,
  ) : CdkObject(cdkObject), SnsPublishProps {
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
     * The message you want to send.
     *
     * With the exception of SMS, messages must be UTF-8 encoded strings and
     * at most 256 KB in size.
     * For SMS, each message can contain up to 140 characters.
     */
    override fun message(): TaskInput = unwrap(this).getMessage().let(TaskInput::wrap)

    /**
     * Add message attributes when publishing.
     *
     * These attributes carry additional metadata about the message and may be used
     * for subscription filters.
     *
     * Default: {}
     *
     * [Documentation](https://docs.aws.amazon.com/sns/latest/dg/sns-message-attributes.html)
     */
    override fun messageAttributes(): Map<String, MessageAttribute> =
        unwrap(this).getMessageAttributes()?.mapValues{MessageAttribute.wrap(it.value)} ?:
        emptyMap()

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
     */
    override fun messageDeduplicationId(): String? = unwrap(this).getMessageDeduplicationId()

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
     */
    override fun messageGroupId(): String? = unwrap(this).getMessageGroupId()

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
     */
    override fun messagePerSubscriptionType(): Boolean? =
        unwrap(this).getMessagePerSubscriptionType()

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
     * Optional name for this state.
     *
     * Default: - The construct ID will be used as state name
     */
    override fun stateName(): String? = unwrap(this).getStateName()

    /**
     * Used as the "Subject" line when the message is delivered to email endpoints.
     *
     * This field will also be included, if present, in the standard JSON messages
     * delivered to other endpoints.
     *
     * Default: - No subject
     */
    override fun subject(): String? = unwrap(this).getSubject()

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
     * The SNS topic that the task will publish to.
     */
    override fun topic(): ITopic = unwrap(this).getTopic().let(ITopic::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): SnsPublishProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.SnsPublishProps):
        SnsPublishProps = CdkObjectWrappers.wrap(cdkObject) as? SnsPublishProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: SnsPublishProps):
        software.amazon.awscdk.services.stepfunctions.tasks.SnsPublishProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.stepfunctions.tasks.SnsPublishProps
  }
}
