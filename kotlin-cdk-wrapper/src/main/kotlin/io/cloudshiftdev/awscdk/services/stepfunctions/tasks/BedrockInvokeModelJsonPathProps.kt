@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions.tasks

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.bedrock.IModel
import io.cloudshiftdev.awscdk.services.stepfunctions.Credentials
import io.cloudshiftdev.awscdk.services.stepfunctions.IntegrationPattern
import io.cloudshiftdev.awscdk.services.stepfunctions.QueryLanguage
import io.cloudshiftdev.awscdk.services.stepfunctions.TaskInput
import io.cloudshiftdev.awscdk.services.stepfunctions.TaskStateJsonPathBaseProps
import io.cloudshiftdev.awscdk.services.stepfunctions.Timeout
import kotlin.Any
import kotlin.Boolean
import kotlin.Deprecated
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import kotlin.jvm.JvmName

/**
 * Properties for invoking a Bedrock Model.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.*;
 * import io.cloudshiftdev.awscdk.services.bedrock.*;
 * import io.cloudshiftdev.awscdk.services.stepfunctions.*;
 * import io.cloudshiftdev.awscdk.services.stepfunctions.tasks.*;
 * Object assign;
 * Guardrail guardrail;
 * IModel model;
 * Object resultSelector;
 * TaskInput taskInput;
 * TaskRole taskRole;
 * Timeout timeout;
 * BedrockInvokeModelJsonPathProps bedrockInvokeModelJsonPathProps =
 * BedrockInvokeModelJsonPathProps.builder()
 * .model(model)
 * // the properties below are optional
 * .accept("accept")
 * .assign(Map.of(
 * "assignKey", assign))
 * .body(taskInput)
 * .comment("comment")
 * .contentType("contentType")
 * .credentials(Credentials.builder()
 * .role(taskRole)
 * .build())
 * .guardrail(guardrail)
 * .heartbeat(Duration.minutes(30))
 * .heartbeatTimeout(timeout)
 * .input(BedrockInvokeModelInputProps.builder()
 * .s3InputUri("s3InputUri")
 * .s3Location(Location.builder()
 * .bucketName("bucketName")
 * .objectKey("objectKey")
 * // the properties below are optional
 * .objectVersion("objectVersion")
 * .build())
 * .build())
 * .inputPath("inputPath")
 * .integrationPattern(IntegrationPattern.REQUEST_RESPONSE)
 * .output(BedrockInvokeModelOutputProps.builder()
 * .s3Location(Location.builder()
 * .bucketName("bucketName")
 * .objectKey("objectKey")
 * // the properties below are optional
 * .objectVersion("objectVersion")
 * .build())
 * .s3OutputUri("s3OutputUri")
 * .build())
 * .outputPath("outputPath")
 * .queryLanguage(QueryLanguage.JSON_PATH)
 * .resultPath("resultPath")
 * .resultSelector(Map.of(
 * "resultSelectorKey", resultSelector))
 * .stateName("stateName")
 * .taskTimeout(timeout)
 * .timeout(Duration.minutes(30))
 * .traceEnabled(false)
 * .build();
 * ```
 */
public interface BedrockInvokeModelJsonPathProps : TaskStateJsonPathBaseProps {
  /**
   * The desired MIME type of the inference body in the response.
   *
   * Default: 'application/json'
   *
   * [Documentation](https://docs.aws.amazon.com/bedrock/latest/APIReference/API_runtime_InvokeModel.html)
   */
  public fun accept(): String? = unwrap(this).getAccept()

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
   */
  public fun body(): TaskInput? = unwrap(this).getBody()?.let(TaskInput::wrap)

  /**
   * (deprecated) The MIME type of the input data in the request.
   *
   * Default: 'application/json'
   *
   * [Documentation](https://docs.aws.amazon.com/bedrock/latest/APIReference/API_runtime_InvokeModel.html)
   * @deprecated This property does not require configuration because the only acceptable value is
   * 'application/json'.
   */
  @Deprecated(message = "deprecated in CDK")
  public fun contentType(): String? = unwrap(this).getContentType()

  /**
   * The guardrail is applied to the invocation.
   *
   * Default: - No guardrail is applied to the invocation.
   */
  public fun guardrail(): Guardrail? = unwrap(this).getGuardrail()?.let(Guardrail::wrap)

  /**
   * The source location to retrieve the input data from.
   *
   * Default: - Input data is retrieved from the `body` field
   */
  public fun input(): BedrockInvokeModelInputProps? =
      unwrap(this).getInput()?.let(BedrockInvokeModelInputProps::wrap)

  /**
   * The Bedrock model that the task will invoke.
   *
   * [Documentation](https://docs.aws.amazon.com/bedrock/latest/userguide/api-methods-run.html)
   */
  public fun model(): IModel

  /**
   * The destination location where the API response is written.
   *
   * If you specify this field, the API response body is replaced with a reference to the
   * output location.
   *
   * Default: - The API response body is returned in the result.
   */
  public fun output(): BedrockInvokeModelOutputProps? =
      unwrap(this).getOutput()?.let(BedrockInvokeModelOutputProps::wrap)

  /**
   * Specifies whether to enable or disable the Bedrock trace.
   *
   * Default: - Trace is not enabled for the invocation.
   */
  public fun traceEnabled(): Boolean? = unwrap(this).getTraceEnabled()

  /**
   * A builder for [BedrockInvokeModelJsonPathProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param accept The desired MIME type of the inference body in the response.
     */
    public fun accept(accept: String)

    /**
     * @param assign Workflow variables to store in this step.
     * Using workflow variables, you can store data in a step and retrieve that data in future
     * steps.
     */
    public fun assign(assign: Map<String, Any>)

    /**
     * @param body The input data for the Bedrock model invocation.
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
     */
    public fun body(body: TaskInput)

    /**
     * @param comment A comment describing this state.
     */
    public fun comment(comment: String)

    /**
     * @param contentType The MIME type of the input data in the request.
     * @deprecated This property does not require configuration because the only acceptable value is
     * 'application/json'.
     */
    @Deprecated(message = "deprecated in CDK")
    public fun contentType(contentType: String)

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
    @JvmName("adc081adb1ae7123bc5da8c29711e56fde6159d2a3a6319570502db47a59391d")
    public fun credentials(credentials: Credentials.Builder.() -> Unit)

    /**
     * @param guardrail The guardrail is applied to the invocation.
     */
    public fun guardrail(guardrail: Guardrail)

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
     * @param input The source location to retrieve the input data from.
     */
    public fun input(input: BedrockInvokeModelInputProps)

    /**
     * @param input The source location to retrieve the input data from.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c61eea20beefc1106be368e0b34b8fb726975b3c9af21141c2fd55d7afd3baad")
    public fun input(input: BedrockInvokeModelInputProps.Builder.() -> Unit)

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
     * @param model The Bedrock model that the task will invoke. 
     */
    public fun model(model: IModel)

    /**
     * @param output The destination location where the API response is written.
     * If you specify this field, the API response body is replaced with a reference to the
     * output location.
     */
    public fun output(output: BedrockInvokeModelOutputProps)

    /**
     * @param output The destination location where the API response is written.
     * If you specify this field, the API response body is replaced with a reference to the
     * output location.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8c6b7e84eada8f8a83d7844e99ec23d10afaf914f7d5302aa15d68ea80f04faf")
    public fun output(output: BedrockInvokeModelOutputProps.Builder.() -> Unit)

    /**
     * @param outputPath JSONPath expression to select part of the state to be the output to this
     * state.
     * May also be the special value JsonPath.DISCARD, which will cause the effective
     * output to be the empty object {}.
     */
    public fun outputPath(outputPath: String)

    /**
     * @param queryLanguage The name of the query language used by the state.
     * If the state does not contain a `queryLanguage` field,
     * then it will use the query language specified in the top-level `queryLanguage` field.
     */
    public fun queryLanguage(queryLanguage: QueryLanguage)

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
     * @param traceEnabled Specifies whether to enable or disable the Bedrock trace.
     */
    public fun traceEnabled(traceEnabled: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.stepfunctions.tasks.BedrockInvokeModelJsonPathProps.Builder
        =
        software.amazon.awscdk.services.stepfunctions.tasks.BedrockInvokeModelJsonPathProps.builder()

    /**
     * @param accept The desired MIME type of the inference body in the response.
     */
    override fun accept(accept: String) {
      cdkBuilder.accept(accept)
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
     * @param body The input data for the Bedrock model invocation.
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
     */
    override fun body(body: TaskInput) {
      cdkBuilder.body(body.let(TaskInput.Companion::unwrap))
    }

    /**
     * @param comment A comment describing this state.
     */
    override fun comment(comment: String) {
      cdkBuilder.comment(comment)
    }

    /**
     * @param contentType The MIME type of the input data in the request.
     * @deprecated This property does not require configuration because the only acceptable value is
     * 'application/json'.
     */
    @Deprecated(message = "deprecated in CDK")
    override fun contentType(contentType: String) {
      cdkBuilder.contentType(contentType)
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
    @JvmName("adc081adb1ae7123bc5da8c29711e56fde6159d2a3a6319570502db47a59391d")
    override fun credentials(credentials: Credentials.Builder.() -> Unit): Unit =
        credentials(Credentials(credentials))

    /**
     * @param guardrail The guardrail is applied to the invocation.
     */
    override fun guardrail(guardrail: Guardrail) {
      cdkBuilder.guardrail(guardrail.let(Guardrail.Companion::unwrap))
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
     * @param input The source location to retrieve the input data from.
     */
    override fun input(input: BedrockInvokeModelInputProps) {
      cdkBuilder.input(input.let(BedrockInvokeModelInputProps.Companion::unwrap))
    }

    /**
     * @param input The source location to retrieve the input data from.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c61eea20beefc1106be368e0b34b8fb726975b3c9af21141c2fd55d7afd3baad")
    override fun input(input: BedrockInvokeModelInputProps.Builder.() -> Unit): Unit =
        input(BedrockInvokeModelInputProps(input))

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
     * @param model The Bedrock model that the task will invoke. 
     */
    override fun model(model: IModel) {
      cdkBuilder.model(model.let(IModel.Companion::unwrap))
    }

    /**
     * @param output The destination location where the API response is written.
     * If you specify this field, the API response body is replaced with a reference to the
     * output location.
     */
    override fun output(output: BedrockInvokeModelOutputProps) {
      cdkBuilder.output(output.let(BedrockInvokeModelOutputProps.Companion::unwrap))
    }

    /**
     * @param output The destination location where the API response is written.
     * If you specify this field, the API response body is replaced with a reference to the
     * output location.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8c6b7e84eada8f8a83d7844e99ec23d10afaf914f7d5302aa15d68ea80f04faf")
    override fun output(output: BedrockInvokeModelOutputProps.Builder.() -> Unit): Unit =
        output(BedrockInvokeModelOutputProps(output))

    /**
     * @param outputPath JSONPath expression to select part of the state to be the output to this
     * state.
     * May also be the special value JsonPath.DISCARD, which will cause the effective
     * output to be the empty object {}.
     */
    override fun outputPath(outputPath: String) {
      cdkBuilder.outputPath(outputPath)
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
     * @param traceEnabled Specifies whether to enable or disable the Bedrock trace.
     */
    override fun traceEnabled(traceEnabled: Boolean) {
      cdkBuilder.traceEnabled(traceEnabled)
    }

    public fun build():
        software.amazon.awscdk.services.stepfunctions.tasks.BedrockInvokeModelJsonPathProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.BedrockInvokeModelJsonPathProps,
  ) : CdkObject(cdkObject),
      BedrockInvokeModelJsonPathProps {
    /**
     * The desired MIME type of the inference body in the response.
     *
     * Default: 'application/json'
     *
     * [Documentation](https://docs.aws.amazon.com/bedrock/latest/APIReference/API_runtime_InvokeModel.html)
     */
    override fun accept(): String? = unwrap(this).getAccept()

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
     */
    override fun body(): TaskInput? = unwrap(this).getBody()?.let(TaskInput::wrap)

    /**
     * A comment describing this state.
     *
     * Default: No comment
     */
    override fun comment(): String? = unwrap(this).getComment()

    /**
     * (deprecated) The MIME type of the input data in the request.
     *
     * Default: 'application/json'
     *
     * [Documentation](https://docs.aws.amazon.com/bedrock/latest/APIReference/API_runtime_InvokeModel.html)
     * @deprecated This property does not require configuration because the only acceptable value is
     * 'application/json'.
     */
    @Deprecated(message = "deprecated in CDK")
    override fun contentType(): String? = unwrap(this).getContentType()

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
     * The guardrail is applied to the invocation.
     *
     * Default: - No guardrail is applied to the invocation.
     */
    override fun guardrail(): Guardrail? = unwrap(this).getGuardrail()?.let(Guardrail::wrap)

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
     * The source location to retrieve the input data from.
     *
     * Default: - Input data is retrieved from the `body` field
     */
    override fun input(): BedrockInvokeModelInputProps? =
        unwrap(this).getInput()?.let(BedrockInvokeModelInputProps::wrap)

    /**
     * JSONPath expression to select part of the state to be the input to this state.
     *
     * May also be the special value JsonPath.DISCARD, which will cause the effective
     * input to be the empty object {}.
     *
     * Default: $
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
     * The Bedrock model that the task will invoke.
     *
     * [Documentation](https://docs.aws.amazon.com/bedrock/latest/userguide/api-methods-run.html)
     */
    override fun model(): IModel = unwrap(this).getModel().let(IModel::wrap)

    /**
     * The destination location where the API response is written.
     *
     * If you specify this field, the API response body is replaced with a reference to the
     * output location.
     *
     * Default: - The API response body is returned in the result.
     */
    override fun output(): BedrockInvokeModelOutputProps? =
        unwrap(this).getOutput()?.let(BedrockInvokeModelOutputProps::wrap)

    /**
     * JSONPath expression to select part of the state to be the output to this state.
     *
     * May also be the special value JsonPath.DISCARD, which will cause the effective
     * output to be the empty object {}.
     *
     * Default: $
     */
    override fun outputPath(): String? = unwrap(this).getOutputPath()

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
     * JSONPath expression to indicate where to inject the state's output.
     *
     * May also be the special value JsonPath.DISCARD, which will cause the state's
     * input to become its output.
     *
     * Default: $
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
     * Specifies whether to enable or disable the Bedrock trace.
     *
     * Default: - Trace is not enabled for the invocation.
     */
    override fun traceEnabled(): Boolean? = unwrap(this).getTraceEnabled()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): BedrockInvokeModelJsonPathProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.BedrockInvokeModelJsonPathProps):
        BedrockInvokeModelJsonPathProps = CdkObjectWrappers.wrap(cdkObject) as?
        BedrockInvokeModelJsonPathProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: BedrockInvokeModelJsonPathProps):
        software.amazon.awscdk.services.stepfunctions.tasks.BedrockInvokeModelJsonPathProps =
        (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.stepfunctions.tasks.BedrockInvokeModelJsonPathProps
  }
}
