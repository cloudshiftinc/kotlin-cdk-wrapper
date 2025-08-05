@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions.tasks

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.bedrock.IModel
import io.cloudshiftdev.awscdk.services.stepfunctions.Credentials
import io.cloudshiftdev.awscdk.services.stepfunctions.IntegrationPattern
import io.cloudshiftdev.awscdk.services.stepfunctions.QueryLanguage
import io.cloudshiftdev.awscdk.services.stepfunctions.TaskInput
import io.cloudshiftdev.awscdk.services.stepfunctions.TaskStateBase
import io.cloudshiftdev.awscdk.services.stepfunctions.Timeout
import kotlin.Any
import kotlin.Boolean
import kotlin.Deprecated
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * A Step Functions Task to invoke a model in Bedrock.
 *
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.services.bedrock.*;
 * FoundationModel model = FoundationModel.fromFoundationModelId(this, "Model",
 * FoundationModelIdentifier.AMAZON_TITAN_TEXT_G1_EXPRESS_V1);
 * BedrockInvokeModel task = BedrockInvokeModel.Builder.create(this, "Prompt Model")
 * .model(model)
 * .body(TaskInput.fromObject(Map.of(
 * "inputText", "Generate a list of five first names.",
 * "textGenerationConfig", Map.of(
 * "maxTokenCount", 100,
 * "temperature", 1))))
 * .resultSelector(Map.of(
 * "names", JsonPath.stringAt("$.Body.results[0].outputText")))
 * .build();
 * ```
 */
public open class BedrockInvokeModel(
  cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.BedrockInvokeModel,
) : TaskStateBase(cdkObject) {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: BedrockInvokeModelProps,
  ) :
      this(software.amazon.awscdk.services.stepfunctions.tasks.BedrockInvokeModel(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(BedrockInvokeModelProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: BedrockInvokeModelProps.Builder.() -> Unit,
  ) : this(scope, id, BedrockInvokeModelProps(props)
  )

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.stepfunctions.tasks.BedrockInvokeModel].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The desired MIME type of the inference body in the response.
     *
     * Default: 'application/json'
     *
     * [Documentation](https://docs.aws.amazon.com/bedrock/latest/APIReference/API_runtime_InvokeModel.html)
     * @param accept The desired MIME type of the inference body in the response. 
     */
    public fun accept(accept: String)

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
     * The input data for the Bedrock model invocation.
     *
     * The inference parameters contained in the body depend on the Bedrock model being used.
     *
     * The body must be in the format specified in the `contentType` field.
     * For example, if the content type is `application/json`, the body must be
     * JSON formatted.
     *
     * The body must be up to 256 KB in size. For input data that exceeds 256 KB,
     * use `input` instead to retrieve the input data from S3.
     *
     * You must specify either the `body` or the `input` field, but not both.
     *
     * Default: - Input data is retrieved from the location specified in the `input` field
     *
     * [Documentation](https://docs.aws.amazon.com/bedrock/latest/userguide/model-parameters.html)
     * @param body The input data for the Bedrock model invocation. 
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
     * (deprecated) The MIME type of the input data in the request.
     *
     * Default: 'application/json'
     *
     * [Documentation](https://docs.aws.amazon.com/bedrock/latest/APIReference/API_runtime_InvokeModel.html)
     * @deprecated This property does not require configuration because the only acceptable value is
     * 'application/json'.
     * @param contentType The MIME type of the input data in the request. 
     */
    @Deprecated(message = "deprecated in CDK")
    public fun contentType(contentType: String)

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
    @JvmName("9836b1e352f5e6c2dbfc3ccc5026429a9c84a71307d8aad3dd518bd7d4b995ed")
    public fun credentials(credentials: Credentials.Builder.() -> Unit)

    /**
     * The guardrail is applied to the invocation.
     *
     * Default: - No guardrail is applied to the invocation.
     *
     * @param guardrail The guardrail is applied to the invocation. 
     */
    public fun guardrail(guardrail: Guardrail)

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
     * The source location to retrieve the input data from.
     *
     * Default: - Input data is retrieved from the `body` field
     *
     * @param input The source location to retrieve the input data from. 
     */
    public fun input(input: BedrockInvokeModelInputProps)

    /**
     * The source location to retrieve the input data from.
     *
     * Default: - Input data is retrieved from the `body` field
     *
     * @param input The source location to retrieve the input data from. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ce31c844fd3047c8f83fe543db576d9f3095ccd4ea32abd1c1b5da8acefe766c")
    public fun input(input: BedrockInvokeModelInputProps.Builder.() -> Unit)

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
     * The Bedrock model that the task will invoke.
     *
     * [Documentation](https://docs.aws.amazon.com/bedrock/latest/userguide/api-methods-run.html)
     * @param model The Bedrock model that the task will invoke. 
     */
    public fun model(model: IModel)

    /**
     * The destination location where the API response is written.
     *
     * If you specify this field, the API response body is replaced with a reference to the
     * output location.
     *
     * Default: - The API response body is returned in the result.
     *
     * @param output The destination location where the API response is written. 
     */
    public fun output(output: BedrockInvokeModelOutputProps)

    /**
     * The destination location where the API response is written.
     *
     * If you specify this field, the API response body is replaced with a reference to the
     * output location.
     *
     * Default: - The API response body is returned in the result.
     *
     * @param output The destination location where the API response is written. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("525aad5912f1220f33479d8032b7121e37c39ec7d412489a5d8232b231648a85")
    public fun output(output: BedrockInvokeModelOutputProps.Builder.() -> Unit)

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
     * Specifies whether to enable or disable the Bedrock trace.
     *
     * Default: - Trace is not enabled for the invocation.
     *
     * @param traceEnabled Specifies whether to enable or disable the Bedrock trace. 
     */
    public fun traceEnabled(traceEnabled: Boolean)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.stepfunctions.tasks.BedrockInvokeModel.Builder =
        software.amazon.awscdk.services.stepfunctions.tasks.BedrockInvokeModel.Builder.create(scope,
        id)

    /**
     * The desired MIME type of the inference body in the response.
     *
     * Default: 'application/json'
     *
     * [Documentation](https://docs.aws.amazon.com/bedrock/latest/APIReference/API_runtime_InvokeModel.html)
     * @param accept The desired MIME type of the inference body in the response. 
     */
    override fun accept(accept: String) {
      cdkBuilder.accept(accept)
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
     * The input data for the Bedrock model invocation.
     *
     * The inference parameters contained in the body depend on the Bedrock model being used.
     *
     * The body must be in the format specified in the `contentType` field.
     * For example, if the content type is `application/json`, the body must be
     * JSON formatted.
     *
     * The body must be up to 256 KB in size. For input data that exceeds 256 KB,
     * use `input` instead to retrieve the input data from S3.
     *
     * You must specify either the `body` or the `input` field, but not both.
     *
     * Default: - Input data is retrieved from the location specified in the `input` field
     *
     * [Documentation](https://docs.aws.amazon.com/bedrock/latest/userguide/model-parameters.html)
     * @param body The input data for the Bedrock model invocation. 
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
     * (deprecated) The MIME type of the input data in the request.
     *
     * Default: 'application/json'
     *
     * [Documentation](https://docs.aws.amazon.com/bedrock/latest/APIReference/API_runtime_InvokeModel.html)
     * @deprecated This property does not require configuration because the only acceptable value is
     * 'application/json'.
     * @param contentType The MIME type of the input data in the request. 
     */
    @Deprecated(message = "deprecated in CDK")
    override fun contentType(contentType: String) {
      cdkBuilder.contentType(contentType)
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
    @JvmName("9836b1e352f5e6c2dbfc3ccc5026429a9c84a71307d8aad3dd518bd7d4b995ed")
    override fun credentials(credentials: Credentials.Builder.() -> Unit): Unit =
        credentials(Credentials(credentials))

    /**
     * The guardrail is applied to the invocation.
     *
     * Default: - No guardrail is applied to the invocation.
     *
     * @param guardrail The guardrail is applied to the invocation. 
     */
    override fun guardrail(guardrail: Guardrail) {
      cdkBuilder.guardrail(guardrail.let(Guardrail.Companion::unwrap))
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
     * The source location to retrieve the input data from.
     *
     * Default: - Input data is retrieved from the `body` field
     *
     * @param input The source location to retrieve the input data from. 
     */
    override fun input(input: BedrockInvokeModelInputProps) {
      cdkBuilder.input(input.let(BedrockInvokeModelInputProps.Companion::unwrap))
    }

    /**
     * The source location to retrieve the input data from.
     *
     * Default: - Input data is retrieved from the `body` field
     *
     * @param input The source location to retrieve the input data from. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ce31c844fd3047c8f83fe543db576d9f3095ccd4ea32abd1c1b5da8acefe766c")
    override fun input(input: BedrockInvokeModelInputProps.Builder.() -> Unit): Unit =
        input(BedrockInvokeModelInputProps(input))

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
     * The Bedrock model that the task will invoke.
     *
     * [Documentation](https://docs.aws.amazon.com/bedrock/latest/userguide/api-methods-run.html)
     * @param model The Bedrock model that the task will invoke. 
     */
    override fun model(model: IModel) {
      cdkBuilder.model(model.let(IModel.Companion::unwrap))
    }

    /**
     * The destination location where the API response is written.
     *
     * If you specify this field, the API response body is replaced with a reference to the
     * output location.
     *
     * Default: - The API response body is returned in the result.
     *
     * @param output The destination location where the API response is written. 
     */
    override fun output(output: BedrockInvokeModelOutputProps) {
      cdkBuilder.output(output.let(BedrockInvokeModelOutputProps.Companion::unwrap))
    }

    /**
     * The destination location where the API response is written.
     *
     * If you specify this field, the API response body is replaced with a reference to the
     * output location.
     *
     * Default: - The API response body is returned in the result.
     *
     * @param output The destination location where the API response is written. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("525aad5912f1220f33479d8032b7121e37c39ec7d412489a5d8232b231648a85")
    override fun output(output: BedrockInvokeModelOutputProps.Builder.() -> Unit): Unit =
        output(BedrockInvokeModelOutputProps(output))

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
     * Specifies whether to enable or disable the Bedrock trace.
     *
     * Default: - Trace is not enabled for the invocation.
     *
     * @param traceEnabled Specifies whether to enable or disable the Bedrock trace. 
     */
    override fun traceEnabled(traceEnabled: Boolean) {
      cdkBuilder.traceEnabled(traceEnabled)
    }

    public fun build(): software.amazon.awscdk.services.stepfunctions.tasks.BedrockInvokeModel =
        cdkBuilder.build()
  }

  public companion object {
    public fun jsonPath(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      props: BedrockInvokeModelJsonPathProps,
    ): BedrockInvokeModel =
        software.amazon.awscdk.services.stepfunctions.tasks.BedrockInvokeModel.jsonPath(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
        id,
        props.let(BedrockInvokeModelJsonPathProps.Companion::unwrap)).let(BedrockInvokeModel::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("24d13c95bc088bb3d56bb86170e397898949a752574a1afe6ba1c733627b424c")
    public fun jsonPath(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      props: BedrockInvokeModelJsonPathProps.Builder.() -> Unit,
    ): BedrockInvokeModel = jsonPath(scope, id, BedrockInvokeModelJsonPathProps(props))

    public fun jsonata(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      props: BedrockInvokeModelJsonataProps,
    ): BedrockInvokeModel =
        software.amazon.awscdk.services.stepfunctions.tasks.BedrockInvokeModel.jsonata(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
        id,
        props.let(BedrockInvokeModelJsonataProps.Companion::unwrap)).let(BedrockInvokeModel::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b6a91596c131b8c99b48bb082836e8e169ac6a3cd205c7f88113b79565aedfdf")
    public fun jsonata(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      props: BedrockInvokeModelJsonataProps.Builder.() -> Unit,
    ): BedrockInvokeModel = jsonata(scope, id, BedrockInvokeModelJsonataProps(props))

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): BedrockInvokeModel {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return BedrockInvokeModel(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.BedrockInvokeModel):
        BedrockInvokeModel = BedrockInvokeModel(cdkObject)

    internal fun unwrap(wrapped: BedrockInvokeModel):
        software.amazon.awscdk.services.stepfunctions.tasks.BedrockInvokeModel = wrapped.cdkObject
        as software.amazon.awscdk.services.stepfunctions.tasks.BedrockInvokeModel
  }
}
