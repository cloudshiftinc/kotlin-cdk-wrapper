@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

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
import software.amazon.awscdk.services.lambda.IFunction
import software.amazon.awscdk.services.stepfunctions.Credentials
import software.amazon.awscdk.services.stepfunctions.IntegrationPattern
import software.amazon.awscdk.services.stepfunctions.TaskInput
import software.amazon.awscdk.services.stepfunctions.Timeout
import software.amazon.awscdk.services.stepfunctions.tasks.LambdaInvocationType
import software.amazon.awscdk.services.stepfunctions.tasks.LambdaInvokeProps

@CdkDslMarker
public class LambdaInvokePropsDsl {
  private val cdkBuilder: LambdaInvokeProps.Builder = LambdaInvokeProps.builder()

  /**
   * @param clientContext Up to 3583 bytes of base64-encoded data about the invoking client to pass
   * to the function.
   */
  public fun clientContext(clientContext: String) {
    cdkBuilder.clientContext(clientContext)
  }

  /**
   * @param comment An optional description for this state.
   */
  public fun comment(comment: String) {
    cdkBuilder.comment(comment)
  }

  /**
   * @param credentials Credentials for an IAM Role that the State Machine assumes for executing the
   * task.
   * This enables cross-account resource invocations.
   */
  public fun credentials(credentials: CredentialsDsl.() -> Unit = {}) {
    val builder = CredentialsDsl()
    builder.apply(credentials)
    cdkBuilder.credentials(builder.build())
  }

  /**
   * @param credentials Credentials for an IAM Role that the State Machine assumes for executing the
   * task.
   * This enables cross-account resource invocations.
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
   * @param heartbeatTimeout Timeout for the heartbeat.
   * [disable-awslint:duration-prop-type] is needed because all props interface in
   * aws-stepfunctions-tasks extend this interface
   */
  public fun heartbeatTimeout(heartbeatTimeout: Timeout) {
    cdkBuilder.heartbeatTimeout(heartbeatTimeout)
  }

  /**
   * @param inputPath JSONPath expression to select part of the state to be the input to this state.
   * May also be the special value JsonPath.DISCARD, which will cause the effective
   * input to be the empty object {}.
   */
  public fun inputPath(inputPath: String) {
    cdkBuilder.inputPath(inputPath)
  }

  /**
   * @param integrationPattern AWS Step Functions integrates with services directly in the Amazon
   * States Language.
   * You can control these AWS services using service integration patterns
   */
  public fun integrationPattern(integrationPattern: IntegrationPattern) {
    cdkBuilder.integrationPattern(integrationPattern)
  }

  /**
   * @param invocationType Invocation type of the Lambda function.
   */
  public fun invocationType(invocationType: LambdaInvocationType) {
    cdkBuilder.invocationType(invocationType)
  }

  /**
   * @param lambdaFunction Lambda function to invoke. 
   */
  public fun lambdaFunction(lambdaFunction: IFunction) {
    cdkBuilder.lambdaFunction(lambdaFunction)
  }

  /**
   * @param outputPath JSONPath expression to select select a portion of the state output to pass to
   * the next state.
   * May also be the special value JsonPath.DISCARD, which will cause the effective
   * output to be the empty object {}.
   */
  public fun outputPath(outputPath: String) {
    cdkBuilder.outputPath(outputPath)
  }

  /**
   * @param payload The JSON that will be supplied as input to the Lambda function.
   */
  public fun payload(payload: TaskInput) {
    cdkBuilder.payload(payload)
  }

  /**
   * @param payloadResponseOnly Invoke the Lambda in a way that only returns the payload response
   * without additional metadata.
   * The `payloadResponseOnly` property cannot be used if `integrationPattern`, `invocationType`,
   * `clientContext`, or `qualifier` are specified.
   * It always uses the REQUEST_RESPONSE behavior.
   */
  public fun payloadResponseOnly(payloadResponseOnly: Boolean) {
    cdkBuilder.payloadResponseOnly(payloadResponseOnly)
  }

  /**
   * @param qualifier Version or alias to invoke a published version of the function.
   * You only need to supply this if you want the version of the Lambda Function to depend
   * on data in the state machine state. If not, you can pass the appropriate Alias or Version
   * object
   * directly as the `lambdaFunction` argument.
   * @deprecated pass a Version or Alias object as lambdaFunction instead
   */
  @Deprecated(message = "deprecated in CDK")
  public fun qualifier(qualifier: String) {
    cdkBuilder.qualifier(qualifier)
  }

  /**
   * @param resultPath JSONPath expression to indicate where to inject the state's output.
   * May also be the special value JsonPath.DISCARD, which will cause the state's
   * input to become its output.
   */
  public fun resultPath(resultPath: String) {
    cdkBuilder.resultPath(resultPath)
  }

  /**
   * @param resultSelector The JSON that will replace the state's raw result and become the
   * effective result before ResultPath is applied.
   * You can use ResultSelector to create a payload with values that are static
   * or selected from the state's raw result.
   */
  public fun resultSelector(resultSelector: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(resultSelector)
    cdkBuilder.resultSelector(builder.map)
  }

  /**
   * @param resultSelector The JSON that will replace the state's raw result and become the
   * effective result before ResultPath is applied.
   * You can use ResultSelector to create a payload with values that are static
   * or selected from the state's raw result.
   */
  public fun resultSelector(resultSelector: Map<String, Any>) {
    cdkBuilder.resultSelector(resultSelector)
  }

  /**
   * @param retryOnServiceExceptions Whether to retry on Lambda service exceptions.
   * This handles `Lambda.ServiceException`, `Lambda.AWSLambdaException` and
   * `Lambda.SdkClientException` with an interval of 2 seconds, a back-off rate
   * of 2 and 6 maximum attempts.
   */
  public fun retryOnServiceExceptions(retryOnServiceExceptions: Boolean) {
    cdkBuilder.retryOnServiceExceptions(retryOnServiceExceptions)
  }

  /**
   * @param taskTimeout Timeout for the task.
   * [disable-awslint:duration-prop-type] is needed because all props interface in
   * aws-stepfunctions-tasks extend this interface
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

  public fun build(): LambdaInvokeProps = cdkBuilder.build()
}
