@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions.tasks

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.apigateway.IRestApi
import io.cloudshiftdev.awscdk.services.stepfunctions.Credentials
import io.cloudshiftdev.awscdk.services.stepfunctions.IntegrationPattern
import io.cloudshiftdev.awscdk.services.stepfunctions.QueryLanguage
import io.cloudshiftdev.awscdk.services.stepfunctions.TaskInput
import io.cloudshiftdev.awscdk.services.stepfunctions.TaskStateBase
import io.cloudshiftdev.awscdk.services.stepfunctions.Timeout
import kotlin.Any
import kotlin.Deprecated
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Call REST API endpoint as a Task.
 *
 * Be aware that the header values must be arrays. When passing the Task Token
 * in the headers field `WAIT_FOR_TASK_TOKEN` integration, use
 * `JsonPath.array()` to wrap the token in an array:
 *
 * ```
 * import io.cloudshiftdev.awscdk.services.apigateway.*;
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
 * import io.cloudshiftdev.awscdk.services.apigateway.*;
 * RestApi api;
 * CallApiGatewayRestApiEndpoint.jsonata(this, "Endpoint",
 * CallApiGatewayRestApiEndpointJsonataProps.builder()
 * .api(api)
 * .stageName("Stage")
 * .method(HttpMethod.PUT)
 * .integrationPattern(IntegrationPattern.WAIT_FOR_TASK_TOKEN)
 * .headers(TaskInput.fromObject(Map.of(
 * "TaskToken", "{% States.Array($states.context.taskToken) %}")))
 * .build());
 * ```
 *
 * [Documentation](https://docs.aws.amazon.com/step-functions/latest/dg/connect-api-gateway.html)
 */
public open class CallApiGatewayRestApiEndpoint(
  cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.CallApiGatewayRestApiEndpoint,
) : TaskStateBase(cdkObject) {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CallApiGatewayRestApiEndpointProps,
  ) :
      this(software.amazon.awscdk.services.stepfunctions.tasks.CallApiGatewayRestApiEndpoint(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CallApiGatewayRestApiEndpointProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CallApiGatewayRestApiEndpointProps.Builder.() -> Unit,
  ) : this(scope, id, CallApiGatewayRestApiEndpointProps(props)
  )

  /**
   * A fluent builder for
   * [io.cloudshiftdev.awscdk.services.stepfunctions.tasks.CallApiGatewayRestApiEndpoint].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * API to call.
     *
     * @param api API to call. 
     */
    public fun api(api: IRestApi)

    /**
     * Path parameters appended after API endpoint.
     *
     * Default: - No path
     *
     * @param apiPath Path parameters appended after API endpoint. 
     */
    public fun apiPath(apiPath: String)

    /**
     * Workflow variables to store in this step.
     *
     * Using workflow variables, you can store data in a step and retrieve that data in future
     * steps.
     *
     * Default: - Not assign variables
     *
     * [Documentation](https://docs.aws.amazon.com/step-functions/latest/dg/workflow-variables.html)
     * @param assign Workflow variables to store in this step. 
     */
    public fun assign(assign: Map<String, Any>)

    /**
     * Authentication methods.
     *
     * Default: AuthType.NO_AUTH
     *
     * @param authType Authentication methods. 
     */
    public fun authType(authType: AuthType)

    /**
     * A comment describing this state.
     *
     * Default: No comment
     *
     * @param comment A comment describing this state. 
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
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("48cbf238cfd7bc3d223792469204258054715bc24ce41957532990934c8393cd")
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
     * Default: $
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
     * JSONPath expression to select part of the state to be the output to this state.
     *
     * May also be the special value JsonPath.DISCARD, which will cause the effective
     * output to be the empty object {}.
     *
     * Default: $
     *
     * @param outputPath JSONPath expression to select part of the state to be the output to this
     * state. 
     */
    public fun outputPath(outputPath: String)

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
     * @param outputs Used to specify and transform output from the state. 
     */
    public fun outputs(outputs: Any)

    /**
     * The name of the query language used by the state.
     *
     * If the state does not contain a `queryLanguage` field,
     * then it will use the query language specified in the top-level `queryLanguage` field.
     *
     * Default: - JSONPath
     *
     * @param queryLanguage The name of the query language used by the state. 
     */
    public fun queryLanguage(queryLanguage: QueryLanguage)

    /**
     * Query strings attatched to end of request.
     *
     * Default: - No query parameters
     *
     * @param queryParameters Query strings attatched to end of request. 
     */
    public fun queryParameters(queryParameters: TaskInput)

    /**
     * Specify a custom Region where the API is deployed, e.g. 'us-east-1'.
     *
     * Default: - Uses the Region of the stack containing the `api`.
     *
     * @param region Specify a custom Region where the API is deployed, e.g. 'us-east-1'. 
     */
    public fun region(region: String)

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
     * Default: $
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
        software.amazon.awscdk.services.stepfunctions.tasks.CallApiGatewayRestApiEndpoint.Builder =
        software.amazon.awscdk.services.stepfunctions.tasks.CallApiGatewayRestApiEndpoint.Builder.create(scope,
        id)

    /**
     * API to call.
     *
     * @param api API to call. 
     */
    override fun api(api: IRestApi) {
      cdkBuilder.api(api.let(IRestApi.Companion::unwrap))
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
     * Workflow variables to store in this step.
     *
     * Using workflow variables, you can store data in a step and retrieve that data in future
     * steps.
     *
     * Default: - Not assign variables
     *
     * [Documentation](https://docs.aws.amazon.com/step-functions/latest/dg/workflow-variables.html)
     * @param assign Workflow variables to store in this step. 
     */
    override fun assign(assign: Map<String, Any>) {
      cdkBuilder.assign(assign.mapValues{CdkObjectWrappers.unwrap(it.value)})
    }

    /**
     * Authentication methods.
     *
     * Default: AuthType.NO_AUTH
     *
     * @param authType Authentication methods. 
     */
    override fun authType(authType: AuthType) {
      cdkBuilder.authType(authType.let(AuthType.Companion::unwrap))
    }

    /**
     * A comment describing this state.
     *
     * Default: No comment
     *
     * @param comment A comment describing this state. 
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
      cdkBuilder.credentials(credentials.let(Credentials.Companion::unwrap))
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
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("48cbf238cfd7bc3d223792469204258054715bc24ce41957532990934c8393cd")
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
      cdkBuilder.headers(headers.let(TaskInput.Companion::unwrap))
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
      cdkBuilder.heartbeat(heartbeat.let(Duration.Companion::unwrap))
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
      cdkBuilder.heartbeatTimeout(heartbeatTimeout.let(Timeout.Companion::unwrap))
    }

    /**
     * JSONPath expression to select part of the state to be the input to this state.
     *
     * May also be the special value JsonPath.DISCARD, which will cause the effective
     * input to be the empty object {}.
     *
     * Default: $
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
      cdkBuilder.integrationPattern(integrationPattern.let(IntegrationPattern.Companion::unwrap))
    }

    /**
     * Http method for the API.
     *
     * @param method Http method for the API. 
     */
    override fun method(method: HttpMethod) {
      cdkBuilder.method(method.let(HttpMethod.Companion::unwrap))
    }

    /**
     * JSONPath expression to select part of the state to be the output to this state.
     *
     * May also be the special value JsonPath.DISCARD, which will cause the effective
     * output to be the empty object {}.
     *
     * Default: $
     *
     * @param outputPath JSONPath expression to select part of the state to be the output to this
     * state. 
     */
    override fun outputPath(outputPath: String) {
      cdkBuilder.outputPath(outputPath)
    }

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
     * @param outputs Used to specify and transform output from the state. 
     */
    override fun outputs(outputs: Any) {
      cdkBuilder.outputs(outputs)
    }

    /**
     * The name of the query language used by the state.
     *
     * If the state does not contain a `queryLanguage` field,
     * then it will use the query language specified in the top-level `queryLanguage` field.
     *
     * Default: - JSONPath
     *
     * @param queryLanguage The name of the query language used by the state. 
     */
    override fun queryLanguage(queryLanguage: QueryLanguage) {
      cdkBuilder.queryLanguage(queryLanguage.let(QueryLanguage.Companion::unwrap))
    }

    /**
     * Query strings attatched to end of request.
     *
     * Default: - No query parameters
     *
     * @param queryParameters Query strings attatched to end of request. 
     */
    override fun queryParameters(queryParameters: TaskInput) {
      cdkBuilder.queryParameters(queryParameters.let(TaskInput.Companion::unwrap))
    }

    /**
     * Specify a custom Region where the API is deployed, e.g. 'us-east-1'.
     *
     * Default: - Uses the Region of the stack containing the `api`.
     *
     * @param region Specify a custom Region where the API is deployed, e.g. 'us-east-1'. 
     */
    override fun region(region: String) {
      cdkBuilder.region(region)
    }

    /**
     * HTTP Request body.
     *
     * Default: - No request body
     *
     * @param requestBody HTTP Request body. 
     */
    override fun requestBody(requestBody: TaskInput) {
      cdkBuilder.requestBody(requestBody.let(TaskInput.Companion::unwrap))
    }

    /**
     * JSONPath expression to indicate where to inject the state's output.
     *
     * May also be the special value JsonPath.DISCARD, which will cause the state's
     * input to become its output.
     *
     * Default: $
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
      cdkBuilder.resultSelector(resultSelector.mapValues{CdkObjectWrappers.unwrap(it.value)})
    }

    /**
     * Name of the stage where the API is deployed to in API Gateway.
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
      cdkBuilder.taskTimeout(taskTimeout.let(Timeout.Companion::unwrap))
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
      cdkBuilder.timeout(timeout.let(Duration.Companion::unwrap))
    }

    public fun build():
        software.amazon.awscdk.services.stepfunctions.tasks.CallApiGatewayRestApiEndpoint =
        cdkBuilder.build()
  }

  public companion object {
    public val PROPERTY_INJECTION_ID: String =
        software.amazon.awscdk.services.stepfunctions.tasks.CallApiGatewayRestApiEndpoint.PROPERTY_INJECTION_ID

    public fun jsonPath(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      props: CallApiGatewayRestApiEndpointJsonPathProps,
    ): CallApiGatewayRestApiEndpoint =
        software.amazon.awscdk.services.stepfunctions.tasks.CallApiGatewayRestApiEndpoint.jsonPath(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
        id,
        props.let(CallApiGatewayRestApiEndpointJsonPathProps.Companion::unwrap)).let(CallApiGatewayRestApiEndpoint::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a4017473eb0ef3c8b4e476e19ec5e0f062e7c49104a63bfa61b11b8d51c49e31")
    public fun jsonPath(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      props: CallApiGatewayRestApiEndpointJsonPathProps.Builder.() -> Unit,
    ): CallApiGatewayRestApiEndpoint = jsonPath(scope, id,
        CallApiGatewayRestApiEndpointJsonPathProps(props))

    public fun jsonata(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      props: CallApiGatewayRestApiEndpointJsonataProps,
    ): CallApiGatewayRestApiEndpoint =
        software.amazon.awscdk.services.stepfunctions.tasks.CallApiGatewayRestApiEndpoint.jsonata(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
        id,
        props.let(CallApiGatewayRestApiEndpointJsonataProps.Companion::unwrap)).let(CallApiGatewayRestApiEndpoint::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e52100f71953f0b073afe0fb7c93f520880220a103c976f8c17e6416afd9a90a")
    public fun jsonata(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      props: CallApiGatewayRestApiEndpointJsonataProps.Builder.() -> Unit,
    ): CallApiGatewayRestApiEndpoint = jsonata(scope, id,
        CallApiGatewayRestApiEndpointJsonataProps(props))

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CallApiGatewayRestApiEndpoint {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CallApiGatewayRestApiEndpoint(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.CallApiGatewayRestApiEndpoint):
        CallApiGatewayRestApiEndpoint = CallApiGatewayRestApiEndpoint(cdkObject)

    internal fun unwrap(wrapped: CallApiGatewayRestApiEndpoint):
        software.amazon.awscdk.services.stepfunctions.tasks.CallApiGatewayRestApiEndpoint =
        wrapped.cdkObject as
        software.amazon.awscdk.services.stepfunctions.tasks.CallApiGatewayRestApiEndpoint
  }
}
