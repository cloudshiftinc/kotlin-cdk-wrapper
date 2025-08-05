@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions.tasks

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.apigateway.IRestApi
import io.cloudshiftdev.awscdk.services.stepfunctions.Credentials
import io.cloudshiftdev.awscdk.services.stepfunctions.IntegrationPattern
import io.cloudshiftdev.awscdk.services.stepfunctions.QueryLanguage
import io.cloudshiftdev.awscdk.services.stepfunctions.TaskInput
import io.cloudshiftdev.awscdk.services.stepfunctions.Timeout
import kotlin.Any
import kotlin.Deprecated
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import kotlin.jvm.JvmName

/**
 * Properties for calling an REST API Endpoint using JSONata.
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
 */
public interface CallApiGatewayRestApiEndpointJsonataProps : CallApiGatewayEndpointJsonataBaseProps,
    CallApiGatewayRestApiEndpointOptions {
  /**
   * A builder for [CallApiGatewayRestApiEndpointJsonataProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param api API to call. 
     */
    public fun api(api: IRestApi)

    /**
     * @param apiPath Path parameters appended after API endpoint.
     */
    public fun apiPath(apiPath: String)

    /**
     * @param assign Workflow variables to store in this step.
     * Using workflow variables, you can store data in a step and retrieve that data in future
     * steps.
     */
    public fun assign(assign: Map<String, Any>)

    /**
     * @param authType Authentication methods.
     */
    public fun authType(authType: AuthType)

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
    @JvmName("2c00e5fa2d5c055becca8b6b5376fa6d9ae303dfe1b7f87c443c300a4303e58c")
    public fun credentials(credentials: Credentials.Builder.() -> Unit)

    /**
     * @param headers HTTP request information that does not relate to contents of the request.
     */
    public fun headers(headers: TaskInput)

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
     * @param method Http method for the API. 
     */
    public fun method(method: HttpMethod)

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
     * @param queryParameters Query strings attatched to end of request.
     */
    public fun queryParameters(queryParameters: TaskInput)

    /**
     * @param region Specify a custom Region where the API is deployed, e.g. 'us-east-1'.
     */
    public fun region(region: String)

    /**
     * @param requestBody HTTP Request body.
     */
    public fun requestBody(requestBody: TaskInput)

    /**
     * @param stageName Name of the stage where the API is deployed to in API Gateway. 
     */
    public fun stageName(stageName: String)

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
        software.amazon.awscdk.services.stepfunctions.tasks.CallApiGatewayRestApiEndpointJsonataProps.Builder
        =
        software.amazon.awscdk.services.stepfunctions.tasks.CallApiGatewayRestApiEndpointJsonataProps.builder()

    /**
     * @param api API to call. 
     */
    override fun api(api: IRestApi) {
      cdkBuilder.api(api.let(IRestApi.Companion::unwrap))
    }

    /**
     * @param apiPath Path parameters appended after API endpoint.
     */
    override fun apiPath(apiPath: String) {
      cdkBuilder.apiPath(apiPath)
    }

    /**
     * @param assign Workflow variables to store in this step.
     * Using workflow variables, you can store data in a step and retrieve that data in future
     * steps.
     */
    override fun assign(assign: Map<String, Any>) {
      cdkBuilder.assign(assign.mapValues{CdkObjectWrappers.unwrap(it.value)})
    }

    /**
     * @param authType Authentication methods.
     */
    override fun authType(authType: AuthType) {
      cdkBuilder.authType(authType.let(AuthType.Companion::unwrap))
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
    @JvmName("2c00e5fa2d5c055becca8b6b5376fa6d9ae303dfe1b7f87c443c300a4303e58c")
    override fun credentials(credentials: Credentials.Builder.() -> Unit): Unit =
        credentials(Credentials(credentials))

    /**
     * @param headers HTTP request information that does not relate to contents of the request.
     */
    override fun headers(headers: TaskInput) {
      cdkBuilder.headers(headers.let(TaskInput.Companion::unwrap))
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
     * @param method Http method for the API. 
     */
    override fun method(method: HttpMethod) {
      cdkBuilder.method(method.let(HttpMethod.Companion::unwrap))
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
     * @param queryParameters Query strings attatched to end of request.
     */
    override fun queryParameters(queryParameters: TaskInput) {
      cdkBuilder.queryParameters(queryParameters.let(TaskInput.Companion::unwrap))
    }

    /**
     * @param region Specify a custom Region where the API is deployed, e.g. 'us-east-1'.
     */
    override fun region(region: String) {
      cdkBuilder.region(region)
    }

    /**
     * @param requestBody HTTP Request body.
     */
    override fun requestBody(requestBody: TaskInput) {
      cdkBuilder.requestBody(requestBody.let(TaskInput.Companion::unwrap))
    }

    /**
     * @param stageName Name of the stage where the API is deployed to in API Gateway. 
     */
    override fun stageName(stageName: String) {
      cdkBuilder.stageName(stageName)
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
        software.amazon.awscdk.services.stepfunctions.tasks.CallApiGatewayRestApiEndpointJsonataProps
        = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.CallApiGatewayRestApiEndpointJsonataProps,
  ) : CdkObject(cdkObject),
      CallApiGatewayRestApiEndpointJsonataProps {
    /**
     * API to call.
     */
    override fun api(): IRestApi = unwrap(this).getApi().let(IRestApi::wrap)

    /**
     * Path parameters appended after API endpoint.
     *
     * Default: - No path
     */
    override fun apiPath(): String? = unwrap(this).getApiPath()

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
     * Authentication methods.
     *
     * Default: AuthType.NO_AUTH
     */
    override fun authType(): AuthType? = unwrap(this).getAuthType()?.let(AuthType::wrap)

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
     * HTTP request information that does not relate to contents of the request.
     *
     * Default: - No headers
     */
    override fun headers(): TaskInput? = unwrap(this).getHeaders()?.let(TaskInput::wrap)

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
     * Http method for the API.
     */
    override fun method(): HttpMethod = unwrap(this).getMethod().let(HttpMethod::wrap)

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
     * Query strings attatched to end of request.
     *
     * Default: - No query parameters
     */
    override fun queryParameters(): TaskInput? =
        unwrap(this).getQueryParameters()?.let(TaskInput::wrap)

    /**
     * Specify a custom Region where the API is deployed, e.g. 'us-east-1'.
     *
     * Default: - Uses the Region of the stack containing the `api`.
     */
    override fun region(): String? = unwrap(this).getRegion()

    /**
     * HTTP Request body.
     *
     * Default: - No request body
     */
    override fun requestBody(): TaskInput? = unwrap(this).getRequestBody()?.let(TaskInput::wrap)

    /**
     * Name of the stage where the API is deployed to in API Gateway.
     */
    override fun stageName(): String = unwrap(this).getStageName()

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
    public operator fun invoke(block: Builder.() -> Unit = {}):
        CallApiGatewayRestApiEndpointJsonataProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.CallApiGatewayRestApiEndpointJsonataProps):
        CallApiGatewayRestApiEndpointJsonataProps = CdkObjectWrappers.wrap(cdkObject) as?
        CallApiGatewayRestApiEndpointJsonataProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CallApiGatewayRestApiEndpointJsonataProps):
        software.amazon.awscdk.services.stepfunctions.tasks.CallApiGatewayRestApiEndpointJsonataProps
        = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.stepfunctions.tasks.CallApiGatewayRestApiEndpointJsonataProps
  }
}
