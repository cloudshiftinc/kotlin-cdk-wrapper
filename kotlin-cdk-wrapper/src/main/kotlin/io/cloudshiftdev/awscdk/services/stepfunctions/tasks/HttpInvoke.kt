@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions.tasks

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.events.IConnection
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
 * A Step Functions Task to call a public third-party API.
 *
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.services.events.*;
 * Connection connection;
 * HttpInvoke getIssue = HttpInvoke.jsonata(this, "Get Issue", HttpInvokeJsonataProps.builder()
 * .connection(connection)
 * .apiRoot("{% 'https://' &amp; $states.input.hostname %}")
 * .apiEndpoint(TaskInput.fromText("{% 'issues/' &amp; $states.input.issue.id %}"))
 * .method(TaskInput.fromText("GET"))
 * // Parse the API call result to object and set to the variables
 * .assign(Map.of(
 * "hostname", "{% $states.input.hostname %}",
 * "issue", "{% $parse($states.result.ResponseBody) %}"))
 * .build());
 * HttpInvoke updateLabels = HttpInvoke.jsonata(this, "Update Issue Labels",
 * HttpInvokeJsonataProps.builder()
 * .connection(connection)
 * .apiRoot("{% 'https://' &amp; $states.input.hostname %}")
 * .apiEndpoint(TaskInput.fromText("{% 'issues/' &amp; $states.input.issue.id &amp; 'labels' %}"))
 * .method(TaskInput.fromText("POST"))
 * .body(TaskInput.fromObject(Map.of(
 * "labels", "{% [$type, $component] %}")))
 * .build());
 * Pass notMatchTitleTemplate = Pass.jsonata(this, "Not Match Title Template");
 * Chain definition = getIssue.next(Choice.jsonata(this, "Match Title
 * Template?").when(Condition.jsonata("{% $contains($issue.title, /(feat)|(fix)|(chore)(w*):.*&#47;)
 * %}"), updateLabels, ChoiceTransitionOptions.builder()
 * .assign(Map.of(
 * "type", "{% $match($states.input.title, /(w*)((.*))/).groups[0] %}",
 * "component", "{% $match($states.input.title, /(w*)((.*))/).groups[1] %}"))
 * .build()).otherwise(notMatchTitleTemplate));
 * StateMachine.Builder.create(this, "StateMachine")
 * .definitionBody(DefinitionBody.fromChainable(definition))
 * .timeout(Duration.minutes(5))
 * .comment("automate issue labeling state machine")
 * .build();
 * ```
 */
public open class HttpInvoke(
  cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.HttpInvoke,
) : TaskStateBase(cdkObject) {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: HttpInvokeProps,
  ) :
      this(software.amazon.awscdk.services.stepfunctions.tasks.HttpInvoke(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(HttpInvokeProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: HttpInvokeProps.Builder.() -> Unit,
  ) : this(scope, id, HttpInvokeProps(props)
  )

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.stepfunctions.tasks.HttpInvoke].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The API endpoint to call, relative to `apiRoot`.
     *
     * Example:
     *
     * ```
     * TaskInput.fromText("path/to/resource");
     * ```
     *
     * @param apiEndpoint The API endpoint to call, relative to `apiRoot`. 
     */
    public fun apiEndpoint(apiEndpoint: TaskInput)

    /**
     * Permissions are granted to call all resources under this path.
     *
     * Example:
     *
     * ```
     * "https://api.example.com";
     * ```
     *
     * @param apiRoot Permissions are granted to call all resources under this path. 
     */
    public fun apiRoot(apiRoot: String)

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
     * The body to send to the HTTP endpoint.
     *
     * Default: - No body is sent with the request.
     *
     * @param body The body to send to the HTTP endpoint. 
     */
    public fun body(body: TaskInput)

    /**
     * A comment describing this state.
     *
     * Default: No comment
     *
     * @param comment A comment describing this state. 
     */
    public fun comment(comment: String)

    /**
     * The EventBridge Connection to use for authentication.
     *
     * @param connection The EventBridge Connection to use for authentication. 
     */
    public fun connection(connection: IConnection)

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
    @JvmName("026c507701985e20f07f673492fafde850e5948449058027e816daa413f3343a")
    public fun credentials(credentials: Credentials.Builder.() -> Unit)

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
     *
     * @param headers The headers to send to the HTTP endpoint. 
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
     * The HTTP method to use.
     *
     * Example:
     *
     * ```
     * TaskInput.fromText("GET");
     * ```
     *
     * @param method The HTTP method to use. 
     */
    public fun method(method: TaskInput)

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
     * The query string parameters to send to the HTTP endpoint.
     *
     * Default: - No query string parameters are sent in the request.
     *
     * @param queryStringParameters The query string parameters to send to the HTTP endpoint. 
     */
    public fun queryStringParameters(queryStringParameters: TaskInput)

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
     *
     * @param urlEncodingFormat Determines whether to apply URL encoding to the request body, and
     * which array encoding format to use. 
     */
    public fun urlEncodingFormat(urlEncodingFormat: URLEncodingFormat)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.stepfunctions.tasks.HttpInvoke.Builder =
        software.amazon.awscdk.services.stepfunctions.tasks.HttpInvoke.Builder.create(scope, id)

    /**
     * The API endpoint to call, relative to `apiRoot`.
     *
     * Example:
     *
     * ```
     * TaskInput.fromText("path/to/resource");
     * ```
     *
     * @param apiEndpoint The API endpoint to call, relative to `apiRoot`. 
     */
    override fun apiEndpoint(apiEndpoint: TaskInput) {
      cdkBuilder.apiEndpoint(apiEndpoint.let(TaskInput.Companion::unwrap))
    }

    /**
     * Permissions are granted to call all resources under this path.
     *
     * Example:
     *
     * ```
     * "https://api.example.com";
     * ```
     *
     * @param apiRoot Permissions are granted to call all resources under this path. 
     */
    override fun apiRoot(apiRoot: String) {
      cdkBuilder.apiRoot(apiRoot)
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
     * The body to send to the HTTP endpoint.
     *
     * Default: - No body is sent with the request.
     *
     * @param body The body to send to the HTTP endpoint. 
     */
    override fun body(body: TaskInput) {
      cdkBuilder.body(body.let(TaskInput.Companion::unwrap))
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
     * The EventBridge Connection to use for authentication.
     *
     * @param connection The EventBridge Connection to use for authentication. 
     */
    override fun connection(connection: IConnection) {
      cdkBuilder.connection(connection.let(IConnection.Companion::unwrap))
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
    @JvmName("026c507701985e20f07f673492fafde850e5948449058027e816daa413f3343a")
    override fun credentials(credentials: Credentials.Builder.() -> Unit): Unit =
        credentials(Credentials(credentials))

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
     *
     * @param headers The headers to send to the HTTP endpoint. 
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
     * The HTTP method to use.
     *
     * Example:
     *
     * ```
     * TaskInput.fromText("GET");
     * ```
     *
     * @param method The HTTP method to use. 
     */
    override fun method(method: TaskInput) {
      cdkBuilder.method(method.let(TaskInput.Companion::unwrap))
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
     * The query string parameters to send to the HTTP endpoint.
     *
     * Default: - No query string parameters are sent in the request.
     *
     * @param queryStringParameters The query string parameters to send to the HTTP endpoint. 
     */
    override fun queryStringParameters(queryStringParameters: TaskInput) {
      cdkBuilder.queryStringParameters(queryStringParameters.let(TaskInput.Companion::unwrap))
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
     *
     * @param urlEncodingFormat Determines whether to apply URL encoding to the request body, and
     * which array encoding format to use. 
     */
    override fun urlEncodingFormat(urlEncodingFormat: URLEncodingFormat) {
      cdkBuilder.urlEncodingFormat(urlEncodingFormat.let(URLEncodingFormat.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.stepfunctions.tasks.HttpInvoke =
        cdkBuilder.build()
  }

  public companion object {
    public fun jsonPath(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      props: HttpInvokeJsonPathProps,
    ): HttpInvoke =
        software.amazon.awscdk.services.stepfunctions.tasks.HttpInvoke.jsonPath(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
        id, props.let(HttpInvokeJsonPathProps.Companion::unwrap)).let(HttpInvoke::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f43133b8f2fb75e1ee9380b06ad90a5932d8934b8287e86c7d464e8a442d3fb2")
    public fun jsonPath(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      props: HttpInvokeJsonPathProps.Builder.() -> Unit,
    ): HttpInvoke = jsonPath(scope, id, HttpInvokeJsonPathProps(props))

    public fun jsonata(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      props: HttpInvokeJsonataProps,
    ): HttpInvoke =
        software.amazon.awscdk.services.stepfunctions.tasks.HttpInvoke.jsonata(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
        id, props.let(HttpInvokeJsonataProps.Companion::unwrap)).let(HttpInvoke::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b51957a2b9146561ebfd34f500ac1951a235712a9200e1977e00546a083f0d50")
    public fun jsonata(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      props: HttpInvokeJsonataProps.Builder.() -> Unit,
    ): HttpInvoke = jsonata(scope, id, HttpInvokeJsonataProps(props))

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): HttpInvoke {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return HttpInvoke(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.HttpInvoke):
        HttpInvoke = HttpInvoke(cdkObject)

    internal fun unwrap(wrapped: HttpInvoke):
        software.amazon.awscdk.services.stepfunctions.tasks.HttpInvoke = wrapped.cdkObject as
        software.amazon.awscdk.services.stepfunctions.tasks.HttpInvoke
  }
}
