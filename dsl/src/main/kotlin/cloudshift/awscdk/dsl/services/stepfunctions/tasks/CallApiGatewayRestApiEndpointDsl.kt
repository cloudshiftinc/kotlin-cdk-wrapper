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
import software.amazon.awscdk.services.apigateway.IRestApi
import software.amazon.awscdk.services.stepfunctions.Credentials
import software.amazon.awscdk.services.stepfunctions.IntegrationPattern
import software.amazon.awscdk.services.stepfunctions.TaskInput
import software.amazon.awscdk.services.stepfunctions.Timeout
import software.amazon.awscdk.services.stepfunctions.tasks.AuthType
import software.amazon.awscdk.services.stepfunctions.tasks.CallApiGatewayRestApiEndpoint
import software.amazon.awscdk.services.stepfunctions.tasks.HttpMethod
import software.constructs.Construct

/**
 * Call REST API endpoint as a Task.
 *
 * Be aware that the header values must be arrays. When passing the Task Token
 * in the headers field `WAIT_FOR_TASK_TOKEN` integration, use
 * `JsonPath.array()` to wrap the token in an array:
 *
 * ```
 * import software.amazon.awscdk.services.apigateway.*;
 * RestApi api;
 * CallApiGatewayRestApiEndpoint.Builder.create(this, "Endpoint")
 * .api(api)
 * .stageName("Stage")
 * .method(HttpMethod.PUT)
 * .integrationPattern(IntegrationPattern.WAIT_FOR_TASK_TOKEN)
 * .headers(TaskInput.fromObject(Map.of(
 * "TaskToken", JsonPath.array(JsonPath.getTaskToken()))))
 * .build();
 * ```
 *
 * Example:
 *
 * ```
 * import software.amazon.awscdk.services.apigateway.*;
 * RestApi api;
 * CallApiGatewayRestApiEndpoint.Builder.create(this, "Endpoint")
 * .api(api)
 * .stageName("Stage")
 * .method(HttpMethod.PUT)
 * .integrationPattern(IntegrationPattern.WAIT_FOR_TASK_TOKEN)
 * .headers(TaskInput.fromObject(Map.of(
 * "TaskToken", JsonPath.array(JsonPath.getTaskToken()))))
 * .build();
 * ```
 *
 * [Documentation](https://docs.aws.amazon.com/step-functions/latest/dg/connect-api-gateway.html)
 */
@CdkDslMarker
public class CallApiGatewayRestApiEndpointDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CallApiGatewayRestApiEndpoint.Builder =
      CallApiGatewayRestApiEndpoint.Builder.create(scope, id)

  /**
   * API to call.
   *
   * @param api API to call. 
   */
  public fun api(api: IRestApi) {
    cdkBuilder.api(api)
  }

  /**
   * Path parameters appended after API endpoint.
   *
   * Default: - No path
   *
   * @param apiPath Path parameters appended after API endpoint. 
   */
  public fun apiPath(apiPath: String) {
    cdkBuilder.apiPath(apiPath)
  }

  /**
   * Authentication methods.
   *
   * Default: AuthType.NO_AUTH
   *
   * @param authType Authentication methods. 
   */
  public fun authType(authType: AuthType) {
    cdkBuilder.authType(authType)
  }

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
   * HTTP request information that does not relate to contents of the request.
   *
   * Default: - No headers
   *
   * @param headers HTTP request information that does not relate to contents of the request. 
   */
  public fun headers(headers: TaskInput) {
    cdkBuilder.headers(headers)
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
   * Http method for the API.
   *
   * @param method Http method for the API. 
   */
  public fun method(method: HttpMethod) {
    cdkBuilder.method(method)
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
   * Query strings attatched to end of request.
   *
   * Default: - No query parameters
   *
   * @param queryParameters Query strings attatched to end of request. 
   */
  public fun queryParameters(queryParameters: TaskInput) {
    cdkBuilder.queryParameters(queryParameters)
  }

  /**
   * HTTP Request body.
   *
   * Default: - No request body
   *
   * @param requestBody HTTP Request body. 
   */
  public fun requestBody(requestBody: TaskInput) {
    cdkBuilder.requestBody(requestBody)
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
   * Name of the stage where the API is deployed to in API Gateway.
   *
   * @param stageName Name of the stage where the API is deployed to in API Gateway. 
   */
  public fun stageName(stageName: String) {
    cdkBuilder.stageName(stageName)
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

  public fun build(): CallApiGatewayRestApiEndpoint = cdkBuilder.build()
}
