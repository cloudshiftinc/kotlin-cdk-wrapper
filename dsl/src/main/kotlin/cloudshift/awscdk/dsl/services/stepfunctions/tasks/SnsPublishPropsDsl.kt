@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package cloudshift.awscdk.dsl.services.stepfunctions.tasks

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import cloudshift.awscdk.dsl.services.stepfunctions.CredentialsDsl
import kotlin.Any
import kotlin.Boolean
import kotlin.Deprecated
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.sns.ITopic
import software.amazon.awscdk.services.stepfunctions.Credentials
import software.amazon.awscdk.services.stepfunctions.IntegrationPattern
import software.amazon.awscdk.services.stepfunctions.TaskInput
import software.amazon.awscdk.services.stepfunctions.Timeout
import software.amazon.awscdk.services.stepfunctions.tasks.MessageAttribute
import software.amazon.awscdk.services.stepfunctions.tasks.SnsPublishProps

/**
 * Properties for publishing a message to an SNS topic.
 *
 * Example:
 * ```
 * EvaluateExpression convertToSeconds = EvaluateExpression.Builder.create(this, "Convert to
 * seconds")
 * .expression("$.waitMilliseconds / 1000")
 * .resultPath("$.waitSeconds")
 * .build();
 * EvaluateExpression createMessage = EvaluateExpression.Builder.create(this, "Create message")
 * // Note: this is a string inside a string.
 * .expression("`Now waiting ${$.waitSeconds} seconds...`")
 * .runtime(Runtime.NODEJS_16_X)
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
@CdkDslMarker
public class SnsPublishPropsDsl {
    private val cdkBuilder: SnsPublishProps.Builder = SnsPublishProps.builder()

    /** @param comment An optional description for this state. */
    public fun comment(comment: String) {
        cdkBuilder.comment(comment)
    }

    /**
     * @param credentials Credentials for an IAM Role that the State Machine assumes for executing
     *   the task. This enables cross-account resource invocations.
     */
    public fun credentials(credentials: CredentialsDsl.() -> Unit = {}) {
        val builder = CredentialsDsl()
        builder.apply(credentials)
        cdkBuilder.credentials(builder.build())
    }

    /**
     * @param credentials Credentials for an IAM Role that the State Machine assumes for executing
     *   the task. This enables cross-account resource invocations.
     */
    public fun credentials(credentials: Credentials) {
        cdkBuilder.credentials(credentials)
    }

    /**
     * @param heartbeat Timeout for the heartbeat.
     * @deprecated use `heartbeatTimeout`
     */
    @Deprecated(message = "deprecated in CDK")
    public fun heartbeat(heartbeat: Duration) {
        cdkBuilder.heartbeat(heartbeat)
    }

    /**
     * @param heartbeatTimeout Timeout for the heartbeat. [disable-awslint:duration-prop-type] is
     *   needed because all props interface in aws-stepfunctions-tasks extend this interface
     */
    public fun heartbeatTimeout(heartbeatTimeout: Timeout) {
        cdkBuilder.heartbeatTimeout(heartbeatTimeout)
    }

    /**
     * @param inputPath JSONPath expression to select part of the state to be the input to this
     *   state. May also be the special value JsonPath.DISCARD, which will cause the effective input
     *   to be the empty object {}.
     */
    public fun inputPath(inputPath: String) {
        cdkBuilder.inputPath(inputPath)
    }

    /**
     * @param integrationPattern AWS Step Functions integrates with services directly in the Amazon
     *   States Language. You can control these AWS services using service integration patterns
     */
    public fun integrationPattern(integrationPattern: IntegrationPattern) {
        cdkBuilder.integrationPattern(integrationPattern)
    }

    /**
     * @param message The message you want to send. With the exception of SMS, messages must be
     *   UTF-8 encoded strings and at most 256 KB in size. For SMS, each message can contain up to
     *   140 characters.
     */
    public fun message(message: TaskInput) {
        cdkBuilder.message(message)
    }

    /**
     * @param messageAttributes Add message attributes when publishing. These attributes carry
     *   additional metadata about the message and may be used for subscription filters.
     */
    public fun messageAttributes(messageAttributes: Map<String, MessageAttribute>) {
        cdkBuilder.messageAttributes(messageAttributes)
    }

    /**
     * @param messagePerSubscriptionType Send different messages for each transport protocol. For
     *   example, you might want to send a shorter message to SMS subscribers and a more verbose
     *   message to email and SQS subscribers.
     *
     * Your message must be a JSON object with a top-level JSON key of "default" with a value that
     * is a string You can define other top-level keys that define the message you want to send to a
     * specific transport protocol (i.e. "sqs", "email", "http", etc)
     */
    public fun messagePerSubscriptionType(messagePerSubscriptionType: Boolean) {
        cdkBuilder.messagePerSubscriptionType(messagePerSubscriptionType)
    }

    /**
     * @param outputPath JSONPath expression to select select a portion of the state output to pass
     *   to the next state. May also be the special value JsonPath.DISCARD, which will cause the
     *   effective output to be the empty object {}.
     */
    public fun outputPath(outputPath: String) {
        cdkBuilder.outputPath(outputPath)
    }

    /**
     * @param resultPath JSONPath expression to indicate where to inject the state's output. May
     *   also be the special value JsonPath.DISCARD, which will cause the state's input to become
     *   its output.
     */
    public fun resultPath(resultPath: String) {
        cdkBuilder.resultPath(resultPath)
    }

    /**
     * @param resultSelector The JSON that will replace the state's raw result and become the
     *   effective result before ResultPath is applied. You can use ResultSelector to create a
     *   payload with values that are static or selected from the state's raw result.
     */
    public fun resultSelector(resultSelector: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(resultSelector)
        cdkBuilder.resultSelector(builder.map)
    }

    /**
     * @param resultSelector The JSON that will replace the state's raw result and become the
     *   effective result before ResultPath is applied. You can use ResultSelector to create a
     *   payload with values that are static or selected from the state's raw result.
     */
    public fun resultSelector(resultSelector: Map<String, Any>) {
        cdkBuilder.resultSelector(resultSelector)
    }

    /**
     * @param subject Used as the "Subject" line when the message is delivered to email endpoints.
     *   This field will also be included, if present, in the standard JSON messages delivered to
     *   other endpoints.
     */
    public fun subject(subject: String) {
        cdkBuilder.subject(subject)
    }

    /**
     * @param taskTimeout Timeout for the task. [disable-awslint:duration-prop-type] is needed
     *   because all props interface in aws-stepfunctions-tasks extend this interface
     */
    public fun taskTimeout(taskTimeout: Timeout) {
        cdkBuilder.taskTimeout(taskTimeout)
    }

    /**
     * @param timeout Timeout for the task.
     * @deprecated use `taskTimeout`
     */
    @Deprecated(message = "deprecated in CDK")
    public fun timeout(timeout: Duration) {
        cdkBuilder.timeout(timeout)
    }

    /** @param topic The SNS topic that the task will publish to. */
    public fun topic(topic: ITopic) {
        cdkBuilder.topic(topic)
    }

    public fun build(): SnsPublishProps = cdkBuilder.build()
}
