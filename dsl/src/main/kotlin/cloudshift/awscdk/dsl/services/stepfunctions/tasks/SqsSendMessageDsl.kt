@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.stepfunctions.tasks

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import cloudshift.awscdk.dsl.services.stepfunctions.CredentialsDsl
import kotlin.Any
import kotlin.Deprecated
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.sqs.IQueue
import software.amazon.awscdk.services.stepfunctions.Credentials
import software.amazon.awscdk.services.stepfunctions.IntegrationPattern
import software.amazon.awscdk.services.stepfunctions.TaskInput
import software.amazon.awscdk.services.stepfunctions.Timeout
import software.amazon.awscdk.services.stepfunctions.tasks.SqsSendMessage
import software.constructs.Construct

/**
 * A StepFunctions Task to send messages to SQS queue.
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
@CdkDslMarker
public class SqsSendMessageDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: SqsSendMessage.Builder = SqsSendMessage.Builder.create(scope, id)

  /**
   * An optional description for this state.
   *
   * Default: - No comment
   *
   * @param comment An optional description for this state. 
   */
  public fun comment(comment: String) {
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
   * @param credentials Credentials for an IAM Role that the State Machine assumes for executing the
   * task. 
   */
  public fun credentials(credentials: CredentialsDsl.() -> Unit = {}) {
    val builder = CredentialsDsl()
    builder.apply(credentials)
    cdkBuilder.credentials(builder.build())
  }

  /**
   * Credentials for an IAM Role that the State Machine assumes for executing the task.
   *
   * This enables cross-account resource invocations.
   *
   * Default: - None (Task is executed using the State Machine's execution role)
   *
   * [Documentation](https://docs.aws.amazon.com/step-functions/latest/dg/concepts-access-cross-acct-resources.html)
   * @param credentials Credentials for an IAM Role that the State Machine assumes for executing the
   * task. 
   */
  public fun credentials(credentials: Credentials) {
    cdkBuilder.credentials(credentials)
  }

  /**
   * The length of time, for which to delay a message.
   *
   * Messages that you send to the queue remain invisible to consumers for the duration
   * of the delay period. The maximum allowed delay is 15 minutes.
   *
   * Default: - delay set on the queue. If a delay is not set on the queue,
   * messages are sent immediately (0 seconds).
   *
   * @param delay The length of time, for which to delay a message. 
   */
  public fun delay(delay: Duration) {
    cdkBuilder.delay(delay)
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
  public fun heartbeat(heartbeat: Duration) {
    cdkBuilder.heartbeat(heartbeat)
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
  public fun heartbeatTimeout(heartbeatTimeout: Timeout) {
    cdkBuilder.heartbeatTimeout(heartbeatTimeout)
  }

  /**
   * JSONPath expression to select part of the state to be the input to this state.
   *
   * May also be the special value JsonPath.DISCARD, which will cause the effective
   * input to be the empty object {}.
   *
   * Default: - The entire task input (JSON path '$')
   *
   * @param inputPath JSONPath expression to select part of the state to be the input to this state.
   * 
   */
  public fun inputPath(inputPath: String) {
    cdkBuilder.inputPath(inputPath)
  }

  /**
   * AWS Step Functions integrates with services directly in the Amazon States Language.
   *
   * You can control these AWS services using service integration patterns
   *
   * Default: - `IntegrationPattern.REQUEST_RESPONSE` for most tasks.
   * `IntegrationPattern.RUN_JOB` for the following exceptions:
   * `BatchSubmitJob`, `EmrAddStep`, `EmrCreateCluster`, `EmrTerminationCluster`, and
   * `EmrContainersStartJobRun`.
   *
   * [Documentation](https://docs.aws.amazon.com/step-functions/latest/dg/connect-to-resource.html#connect-wait-token)
   * @param integrationPattern AWS Step Functions integrates with services directly in the Amazon
   * States Language. 
   */
  public fun integrationPattern(integrationPattern: IntegrationPattern) {
    cdkBuilder.integrationPattern(integrationPattern)
  }

  /**
   * The text message to send to the queue.
   *
   * @param messageBody The text message to send to the queue. 
   */
  public fun messageBody(messageBody: TaskInput) {
    cdkBuilder.messageBody(messageBody)
  }

  /**
   * The token used for deduplication of sent messages.
   *
   * Any messages sent with the same deduplication ID are accepted successfully,
   * but aren't delivered during the 5-minute deduplication interval.
   *
   * Default: - None
   *
   * @param messageDeduplicationId The token used for deduplication of sent messages. 
   */
  public fun messageDeduplicationId(messageDeduplicationId: String) {
    cdkBuilder.messageDeduplicationId(messageDeduplicationId)
  }

  /**
   * The tag that specifies that a message belongs to a specific message group.
   *
   * Messages that belong to the same message group are processed in a FIFO manner.
   * Messages in different message groups might be processed out of order.
   *
   * Default: - None
   *
   * @param messageGroupId The tag that specifies that a message belongs to a specific message
   * group. 
   */
  public fun messageGroupId(messageGroupId: String) {
    cdkBuilder.messageGroupId(messageGroupId)
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
   * @param outputPath JSONPath expression to select select a portion of the state output to pass to
   * the next state. 
   */
  public fun outputPath(outputPath: String) {
    cdkBuilder.outputPath(outputPath)
  }

  /**
   * The SQS queue that messages will be sent to.
   *
   * @param queue The SQS queue that messages will be sent to. 
   */
  public fun queue(queue: IQueue) {
    cdkBuilder.queue(queue)
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
  public fun resultPath(resultPath: String) {
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
  public fun resultSelector(resultSelector: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(resultSelector)
    cdkBuilder.resultSelector(builder.map)
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
  public fun resultSelector(resultSelector: Map<String, Any>) {
    cdkBuilder.resultSelector(resultSelector)
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
  public fun taskTimeout(taskTimeout: Timeout) {
    cdkBuilder.taskTimeout(taskTimeout)
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
  public fun timeout(timeout: Duration) {
    cdkBuilder.timeout(timeout)
  }

  public fun build(): SqsSendMessage = cdkBuilder.build()
}
