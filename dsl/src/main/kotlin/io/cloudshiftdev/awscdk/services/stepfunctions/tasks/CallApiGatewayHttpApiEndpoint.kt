package io.cloudshiftdev.awscdk.services.stepfunctions.tasks

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.stepfunctions.Credentials
import io.cloudshiftdev.awscdk.services.stepfunctions.IntegrationPattern
import io.cloudshiftdev.awscdk.services.stepfunctions.TaskInput
import io.cloudshiftdev.awscdk.services.stepfunctions.TaskStateBase
import io.cloudshiftdev.awscdk.services.stepfunctions.Timeout
import kotlin.Any
import kotlin.Deprecated
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CallApiGatewayHttpApiEndpoint internal constructor(
  private val cdkObject:
      software.amazon.awscdk.services.stepfunctions.tasks.CallApiGatewayHttpApiEndpoint,
) : TaskStateBase(cdkObject) {
  /**
   * A fluent builder for
   * [io.cloudshiftdev.awscdk.services.stepfunctions.tasks.CallApiGatewayHttpApiEndpoint].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The Id of the API to call.
     *
     * @param apiId The Id of the API to call. 
     */
    public fun apiId(apiId: String)

    /**
     * Path parameters appended after API endpoint.
     *
     * Default: - No path
     *
     * @param apiPath Path parameters appended after API endpoint. 
     */
    public fun apiPath(apiPath: String)

    /**
     * The Stack in which the API is defined.
     *
     * @param apiStack The Stack in which the API is defined. 
     */
    public fun apiStack(apiStack: Stack)

    /**
     * Authentication methods.
     *
     * Default: AuthType.NO_AUTH
     *
     * @param authType Authentication methods. 
     */
    public fun authType(authType: AuthType)

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
    @JvmName("19622ff46455df35bf42a23f0d828c2b86348f619fe439936cb4e08e3eea4844")
    public fun credentials(credentials: Credentials.Builder.() -> Unit)

    /**
     * HTTP request information that does not relate to contents of the request.
     *
     * Default: - No headers
     *
     * @param headers HTTP request information that does not relate to contents of the request. 
     */
    public fun headers(headers: TaskInput)

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
     * Http method for the API.
     *
     * @param method Http method for the API. 
     */
    public fun method(method: HttpMethod)

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
     * Query strings attatched to end of request.
     *
     * Default: - No query parameters
     *
     * @param queryParameters Query strings attatched to end of request. 
     */
    public fun queryParameters(queryParameters: TaskInput)

    /**
     * HTTP Request body.
     *
     * Default: - No request body
     *
     * @param requestBody HTTP Request body. 
     */
    public fun requestBody(requestBody: TaskInput)

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
     * Name of the stage where the API is deployed to in API Gateway.
     *
     * Default: '$default'
     *
     * @param stageName Name of the stage where the API is deployed to in API Gateway. 
     */
    public fun stageName(stageName: String)

    /**
     * Optional name for this state.
     *
     * Default: - The construct ID will be used as state name
     *
     * @param stateName Optional name for this state. 
     */
    public fun stateName(stateName: String)

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
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.stepfunctions.tasks.CallApiGatewayHttpApiEndpoint.Builder =
        software.amazon.awscdk.services.stepfunctions.tasks.CallApiGatewayHttpApiEndpoint.Builder.create(scope,
        id)

    /**
     * The Id of the API to call.
     *
     * @param apiId The Id of the API to call. 
     */
    override fun apiId(apiId: String) {
      cdkBuilder.apiId(apiId)
    }

    /**
     * Path parameters appended after API endpoint.
     *
     * Default: - No path
     *
     * @param apiPath Path parameters appended after API endpoint. 
     */
    override fun apiPath(apiPath: String) {
      cdkBuilder.apiPath(apiPath)
    }

    /**
     * The Stack in which the API is defined.
     *
     * @param apiStack The Stack in which the API is defined. 
     */
    override fun apiStack(apiStack: Stack) {
      cdkBuilder.apiStack(apiStack.let(Stack::unwrap))
    }

    /**
     * Authentication methods.
     *
     * Default: AuthType.NO_AUTH
     *
     * @param authType Authentication methods. 
     */
    override fun authType(authType: AuthType) {
      cdkBuilder.authType(authType.let(AuthType::unwrap))
    }

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
    @JvmName("19622ff46455df35bf42a23f0d828c2b86348f619fe439936cb4e08e3eea4844")
    override fun credentials(credentials: Credentials.Builder.() -> Unit): Unit =
        credentials(Credentials(credentials))

    /**
     * HTTP request information that does not relate to contents of the request.
     *
     * Default: - No headers
     *
     * @param headers HTTP request information that does not relate to contents of the request. 
     */
    override fun headers(headers: TaskInput) {
      cdkBuilder.headers(headers.let(TaskInput::unwrap))
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
     * Http method for the API.
     *
     * @param method Http method for the API. 
     */
    override fun method(method: HttpMethod) {
      cdkBuilder.method(method.let(HttpMethod::unwrap))
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
     * Query strings attatched to end of request.
     *
     * Default: - No query parameters
     *
     * @param queryParameters Query strings attatched to end of request. 
     */
    override fun queryParameters(queryParameters: TaskInput) {
      cdkBuilder.queryParameters(queryParameters.let(TaskInput::unwrap))
    }

    /**
     * HTTP Request body.
     *
     * Default: - No request body
     *
     * @param requestBody HTTP Request body. 
     */
    override fun requestBody(requestBody: TaskInput) {
      cdkBuilder.requestBody(requestBody.let(TaskInput::unwrap))
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
     * Name of the stage where the API is deployed to in API Gateway.
     *
     * Default: '$default'
     *
     * @param stageName Name of the stage where the API is deployed to in API Gateway. 
     */
    override fun stageName(stageName: String) {
      cdkBuilder.stageName(stageName)
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

    public fun build():
        software.amazon.awscdk.services.stepfunctions.tasks.CallApiGatewayHttpApiEndpoint =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CallApiGatewayHttpApiEndpoint {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CallApiGatewayHttpApiEndpoint(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.CallApiGatewayHttpApiEndpoint):
        CallApiGatewayHttpApiEndpoint = CallApiGatewayHttpApiEndpoint(cdkObject)

    internal fun unwrap(wrapped: CallApiGatewayHttpApiEndpoint):
        software.amazon.awscdk.services.stepfunctions.tasks.CallApiGatewayHttpApiEndpoint =
        wrapped.cdkObject
  }
}
