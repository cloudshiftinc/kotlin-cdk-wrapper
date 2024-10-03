@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions.tasks

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.events.IConnection
import io.cloudshiftdev.awscdk.services.stepfunctions.Credentials
import io.cloudshiftdev.awscdk.services.stepfunctions.IntegrationPattern
import io.cloudshiftdev.awscdk.services.stepfunctions.TaskInput
import io.cloudshiftdev.awscdk.services.stepfunctions.TaskStateBaseProps
import io.cloudshiftdev.awscdk.services.stepfunctions.Timeout
import kotlin.Any
import kotlin.Deprecated
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import kotlin.jvm.JvmName

/**
 * Properties for calling an external HTTP endpoint with HttpInvoke.
 *
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.services.events.*;
 * Connection connection = Connection.Builder.create(this, "Connection")
 * .authorization(Authorization.basic("username", SecretValue.unsafePlainText("password")))
 * .build();
 * HttpInvoke.Builder.create(this, "Invoke HTTP API")
 * .apiRoot("https://api.example.com")
 * .apiEndpoint(TaskInput.fromText("path/to/resource"))
 * .body(TaskInput.fromObject(Map.of("foo", "bar")))
 * .connection(connection)
 * .headers(TaskInput.fromObject(Map.of("Content-Type", "application/json")))
 * .method(TaskInput.fromText("POST"))
 * .queryStringParameters(TaskInput.fromObject(Map.of("id", "123")))
 * .urlEncodingFormat(URLEncodingFormat.BRACKETS)
 * .build();
 * ```
 */
public interface HttpInvokeProps : TaskStateBaseProps {
  /**
   * The API endpoint to call, relative to `apiRoot`.
   *
   * Example:
   *
   * ```
   * TaskInput.fromText("path/to/resource");
   * ```
   */
  public fun apiEndpoint(): TaskInput

  /**
   * Permissions are granted to call all resources under this path.
   *
   * Example:
   *
   * ```
   * "https://api.example.com";
   * ```
   */
  public fun apiRoot(): String

  /**
   * The body to send to the HTTP endpoint.
   *
   * Default: - No body is sent with the request.
   */
  public fun body(): TaskInput? = unwrap(this).getBody()?.let(TaskInput::wrap)

  /**
   * The EventBridge Connection to use for authentication.
   */
  public fun connection(): IConnection

  /**
   * The headers to send to the HTTP endpoint.
   *
   * Default: - No additional headers are added to the request.
   *
   * Example:
   *
   * ```
   * TaskInput.fromObject(Map.of("Content-Type", "application/json"));
   * ```
   */
  public fun headers(): TaskInput? = unwrap(this).getHeaders()?.let(TaskInput::wrap)

  /**
   * The HTTP method to use.
   *
   * Example:
   *
   * ```
   * TaskInput.fromText("GET");
   * ```
   */
  public fun method(): TaskInput

  /**
   * The query string parameters to send to the HTTP endpoint.
   *
   * Default: - No query string parameters are sent in the request.
   */
  public fun queryStringParameters(): TaskInput? =
      unwrap(this).getQueryStringParameters()?.let(TaskInput::wrap)

  /**
   * Determines whether to apply URL encoding to the request body, and which array encoding format
   * to use.
   *
   * `URLEncodingFormat.NONE` passes the JSON-serialized `RequestBody` field as the HTTP request
   * body.
   * Otherwise, the HTTP request body is the URL-encoded form data of the `RequestBody` field using
   * the
   * specified array encoding format, and the `Content-Type` header is set to
   * `application/x-www-form-urlencoded`.
   *
   * Default: - URLEncodingFormat.NONE
   */
  public fun urlEncodingFormat(): URLEncodingFormat? =
      unwrap(this).getUrlEncodingFormat()?.let(URLEncodingFormat::wrap)

  /**
   * A builder for [HttpInvokeProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param apiEndpoint The API endpoint to call, relative to `apiRoot`. 
     */
    public fun apiEndpoint(apiEndpoint: TaskInput)

    /**
     * @param apiRoot Permissions are granted to call all resources under this path. 
     */
    public fun apiRoot(apiRoot: String)

    /**
     * @param body The body to send to the HTTP endpoint.
     */
    public fun body(body: TaskInput)

    /**
     * @param comment An optional description for this state.
     */
    public fun comment(comment: String)

    /**
     * @param connection The EventBridge Connection to use for authentication. 
     */
    public fun connection(connection: IConnection)

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
    @JvmName("d65697e107bf3053506f39639a850d83c410356c26db3577cc5a2781530944ea")
    public fun credentials(credentials: Credentials.Builder.() -> Unit)

    /**
     * @param headers The headers to send to the HTTP endpoint.
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
     * @param method The HTTP method to use. 
     */
    public fun method(method: TaskInput)

    /**
     * @param outputPath JSONPath expression to select select a portion of the state output to pass
     * to the next state.
     * May also be the special value JsonPath.DISCARD, which will cause the effective
     * output to be the empty object {}.
     */
    public fun outputPath(outputPath: String)

    /**
     * @param queryStringParameters The query string parameters to send to the HTTP endpoint.
     */
    public fun queryStringParameters(queryStringParameters: TaskInput)

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
     * @param urlEncodingFormat Determines whether to apply URL encoding to the request body, and
     * which array encoding format to use.
     * `URLEncodingFormat.NONE` passes the JSON-serialized `RequestBody` field as the HTTP request
     * body.
     * Otherwise, the HTTP request body is the URL-encoded form data of the `RequestBody` field
     * using the
     * specified array encoding format, and the `Content-Type` header is set to
     * `application/x-www-form-urlencoded`.
     */
    public fun urlEncodingFormat(urlEncodingFormat: URLEncodingFormat)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.stepfunctions.tasks.HttpInvokeProps.Builder =
        software.amazon.awscdk.services.stepfunctions.tasks.HttpInvokeProps.builder()

    /**
     * @param apiEndpoint The API endpoint to call, relative to `apiRoot`. 
     */
    override fun apiEndpoint(apiEndpoint: TaskInput) {
      cdkBuilder.apiEndpoint(apiEndpoint.let(TaskInput.Companion::unwrap))
    }

    /**
     * @param apiRoot Permissions are granted to call all resources under this path. 
     */
    override fun apiRoot(apiRoot: String) {
      cdkBuilder.apiRoot(apiRoot)
    }

    /**
     * @param body The body to send to the HTTP endpoint.
     */
    override fun body(body: TaskInput) {
      cdkBuilder.body(body.let(TaskInput.Companion::unwrap))
    }

    /**
     * @param comment An optional description for this state.
     */
    override fun comment(comment: String) {
      cdkBuilder.comment(comment)
    }

    /**
     * @param connection The EventBridge Connection to use for authentication. 
     */
    override fun connection(connection: IConnection) {
      cdkBuilder.connection(connection.let(IConnection.Companion::unwrap))
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
    @JvmName("d65697e107bf3053506f39639a850d83c410356c26db3577cc5a2781530944ea")
    override fun credentials(credentials: Credentials.Builder.() -> Unit): Unit =
        credentials(Credentials(credentials))

    /**
     * @param headers The headers to send to the HTTP endpoint.
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
      cdkBuilder.integrationPattern(integrationPattern.let(IntegrationPattern.Companion::unwrap))
    }

    /**
     * @param method The HTTP method to use. 
     */
    override fun method(method: TaskInput) {
      cdkBuilder.method(method.let(TaskInput.Companion::unwrap))
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
     * @param queryStringParameters The query string parameters to send to the HTTP endpoint.
     */
    override fun queryStringParameters(queryStringParameters: TaskInput) {
      cdkBuilder.queryStringParameters(queryStringParameters.let(TaskInput.Companion::unwrap))
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

    /**
     * @param urlEncodingFormat Determines whether to apply URL encoding to the request body, and
     * which array encoding format to use.
     * `URLEncodingFormat.NONE` passes the JSON-serialized `RequestBody` field as the HTTP request
     * body.
     * Otherwise, the HTTP request body is the URL-encoded form data of the `RequestBody` field
     * using the
     * specified array encoding format, and the `Content-Type` header is set to
     * `application/x-www-form-urlencoded`.
     */
    override fun urlEncodingFormat(urlEncodingFormat: URLEncodingFormat) {
      cdkBuilder.urlEncodingFormat(urlEncodingFormat.let(URLEncodingFormat.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.stepfunctions.tasks.HttpInvokeProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.HttpInvokeProps,
  ) : CdkObject(cdkObject),
      HttpInvokeProps {
    /**
     * The API endpoint to call, relative to `apiRoot`.
     *
     * Example:
     *
     * ```
     * TaskInput.fromText("path/to/resource");
     * ```
     */
    override fun apiEndpoint(): TaskInput = unwrap(this).getApiEndpoint().let(TaskInput::wrap)

    /**
     * Permissions are granted to call all resources under this path.
     *
     * Example:
     *
     * ```
     * "https://api.example.com";
     * ```
     */
    override fun apiRoot(): String = unwrap(this).getApiRoot()

    /**
     * The body to send to the HTTP endpoint.
     *
     * Default: - No body is sent with the request.
     */
    override fun body(): TaskInput? = unwrap(this).getBody()?.let(TaskInput::wrap)

    /**
     * An optional description for this state.
     *
     * Default: - No comment
     */
    override fun comment(): String? = unwrap(this).getComment()

    /**
     * The EventBridge Connection to use for authentication.
     */
    override fun connection(): IConnection = unwrap(this).getConnection().let(IConnection::wrap)

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
     * The headers to send to the HTTP endpoint.
     *
     * Default: - No additional headers are added to the request.
     *
     * Example:
     *
     * ```
     * TaskInput.fromObject(Map.of("Content-Type", "application/json"));
     * ```
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
     * The HTTP method to use.
     *
     * Example:
     *
     * ```
     * TaskInput.fromText("GET");
     * ```
     */
    override fun method(): TaskInput = unwrap(this).getMethod().let(TaskInput::wrap)

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
     * The query string parameters to send to the HTTP endpoint.
     *
     * Default: - No query string parameters are sent in the request.
     */
    override fun queryStringParameters(): TaskInput? =
        unwrap(this).getQueryStringParameters()?.let(TaskInput::wrap)

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
     * Determines whether to apply URL encoding to the request body, and which array encoding format
     * to use.
     *
     * `URLEncodingFormat.NONE` passes the JSON-serialized `RequestBody` field as the HTTP request
     * body.
     * Otherwise, the HTTP request body is the URL-encoded form data of the `RequestBody` field
     * using the
     * specified array encoding format, and the `Content-Type` header is set to
     * `application/x-www-form-urlencoded`.
     *
     * Default: - URLEncodingFormat.NONE
     */
    override fun urlEncodingFormat(): URLEncodingFormat? =
        unwrap(this).getUrlEncodingFormat()?.let(URLEncodingFormat::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): HttpInvokeProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.HttpInvokeProps):
        HttpInvokeProps = CdkObjectWrappers.wrap(cdkObject) as? HttpInvokeProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: HttpInvokeProps):
        software.amazon.awscdk.services.stepfunctions.tasks.HttpInvokeProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.stepfunctions.tasks.HttpInvokeProps
  }
}
