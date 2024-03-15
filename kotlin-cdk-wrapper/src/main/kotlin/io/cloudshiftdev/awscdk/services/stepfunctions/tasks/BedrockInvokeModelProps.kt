@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions.tasks

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.bedrock.IModel
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
 * Properties for invoking a Bedrock Model.
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
public interface BedrockInvokeModelProps : TaskStateBaseProps {
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
   * Default: Input data is retrieved from the location specified in the `input` field
   *
   * [Documentation](https://docs.aws.amazon.com/bedrock/latest/userguide/model-parameters.html)
   */
  public fun body(): TaskInput? = unwrap(this).getBody()?.let(TaskInput::wrap)

  /**
   * The MIME type of the input data in the request.
   *
   * Default: 'application/json'
   *
   * [Documentation](https://docs.aws.amazon.com/bedrock/latest/APIReference/API_runtime_InvokeModel.html)
   */
  public fun contentType(): String? = unwrap(this).getContentType()

  /**
   * The source location to retrieve the input data from.
   *
   * Default: Input data is retrieved from the `body` field
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
   * Default: The API response body is returned in the result.
   */
  public fun output(): BedrockInvokeModelOutputProps? =
      unwrap(this).getOutput()?.let(BedrockInvokeModelOutputProps::wrap)

  /**
   * A builder for [BedrockInvokeModelProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param accept The desired MIME type of the inference body in the response.
     */
    public fun accept(accept: String)

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
     * @param comment An optional description for this state.
     */
    public fun comment(comment: String)

    /**
     * @param contentType The MIME type of the input data in the request.
     */
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
    @JvmName("325a554503021599a7241386fb143c9e545442362ed53bcd75e5b5cce3585a73")
    public fun credentials(credentials: Credentials.Builder.() -> Unit)

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
    @JvmName("ebf5e3d848d362be87d17220070b5aebc32936fe5210754ba33f32d23924644e")
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
    @JvmName("aa0163256f1a2ad7fb781397069d5b6bd7802a0e0d6ef80a4955da44911cfa5b")
    public fun output(output: BedrockInvokeModelOutputProps.Builder.() -> Unit)

    /**
     * @param outputPath JSONPath expression to select select a portion of the state output to pass
     * to the next state.
     * May also be the special value JsonPath.DISCARD, which will cause the effective
     * output to be the empty object {}.
     */
    public fun outputPath(outputPath: String)

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
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.stepfunctions.tasks.BedrockInvokeModelProps.Builder =
        software.amazon.awscdk.services.stepfunctions.tasks.BedrockInvokeModelProps.builder()

    /**
     * @param accept The desired MIME type of the inference body in the response.
     */
    override fun accept(accept: String) {
      cdkBuilder.accept(accept)
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
      cdkBuilder.body(body.let(TaskInput::unwrap))
    }

    /**
     * @param comment An optional description for this state.
     */
    override fun comment(comment: String) {
      cdkBuilder.comment(comment)
    }

    /**
     * @param contentType The MIME type of the input data in the request.
     */
    override fun contentType(contentType: String) {
      cdkBuilder.contentType(contentType)
    }

    /**
     * @param credentials Credentials for an IAM Role that the State Machine assumes for executing
     * the task.
     * This enables cross-account resource invocations.
     */
    override fun credentials(credentials: Credentials) {
      cdkBuilder.credentials(credentials.let(Credentials::unwrap))
    }

    /**
     * @param credentials Credentials for an IAM Role that the State Machine assumes for executing
     * the task.
     * This enables cross-account resource invocations.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("325a554503021599a7241386fb143c9e545442362ed53bcd75e5b5cce3585a73")
    override fun credentials(credentials: Credentials.Builder.() -> Unit): Unit =
        credentials(Credentials(credentials))

    /**
     * @param heartbeat Timeout for the heartbeat.
     * @deprecated use `heartbeatTimeout`
     */
    @Deprecated(message = "deprecated in CDK")
    override fun heartbeat(heartbeat: Duration) {
      cdkBuilder.heartbeat(heartbeat.let(Duration::unwrap))
    }

    /**
     * @param heartbeatTimeout Timeout for the heartbeat.
     * [disable-awslint:duration-prop-type] is needed because all props interface in
     * aws-stepfunctions-tasks extend this interface
     */
    override fun heartbeatTimeout(heartbeatTimeout: Timeout) {
      cdkBuilder.heartbeatTimeout(heartbeatTimeout.let(Timeout::unwrap))
    }

    /**
     * @param input The source location to retrieve the input data from.
     */
    override fun input(input: BedrockInvokeModelInputProps) {
      cdkBuilder.input(input.let(BedrockInvokeModelInputProps::unwrap))
    }

    /**
     * @param input The source location to retrieve the input data from.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ebf5e3d848d362be87d17220070b5aebc32936fe5210754ba33f32d23924644e")
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
      cdkBuilder.integrationPattern(integrationPattern.let(IntegrationPattern::unwrap))
    }

    /**
     * @param model The Bedrock model that the task will invoke. 
     */
    override fun model(model: IModel) {
      cdkBuilder.model(model.let(IModel::unwrap))
    }

    /**
     * @param output The destination location where the API response is written.
     * If you specify this field, the API response body is replaced with a reference to the
     * output location.
     */
    override fun output(output: BedrockInvokeModelOutputProps) {
      cdkBuilder.output(output.let(BedrockInvokeModelOutputProps::unwrap))
    }

    /**
     * @param output The destination location where the API response is written.
     * If you specify this field, the API response body is replaced with a reference to the
     * output location.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("aa0163256f1a2ad7fb781397069d5b6bd7802a0e0d6ef80a4955da44911cfa5b")
    override fun output(output: BedrockInvokeModelOutputProps.Builder.() -> Unit): Unit =
        output(BedrockInvokeModelOutputProps(output))

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
      cdkBuilder.resultSelector(resultSelector)
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
      cdkBuilder.taskTimeout(taskTimeout.let(Timeout::unwrap))
    }

    /**
     * @param timeout Timeout for the task.
     * @deprecated use `taskTimeout`
     */
    @Deprecated(message = "deprecated in CDK")
    override fun timeout(timeout: Duration) {
      cdkBuilder.timeout(timeout.let(Duration::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.stepfunctions.tasks.BedrockInvokeModelProps
        = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.stepfunctions.tasks.BedrockInvokeModelProps,
  ) : CdkObject(cdkObject), BedrockInvokeModelProps {
    /**
     * The desired MIME type of the inference body in the response.
     *
     * Default: 'application/json'
     *
     * [Documentation](https://docs.aws.amazon.com/bedrock/latest/APIReference/API_runtime_InvokeModel.html)
     */
    override fun accept(): String? = unwrap(this).getAccept()

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
     * Default: Input data is retrieved from the location specified in the `input` field
     *
     * [Documentation](https://docs.aws.amazon.com/bedrock/latest/userguide/model-parameters.html)
     */
    override fun body(): TaskInput? = unwrap(this).getBody()?.let(TaskInput::wrap)

    /**
     * An optional description for this state.
     *
     * Default: - No comment
     */
    override fun comment(): String? = unwrap(this).getComment()

    /**
     * The MIME type of the input data in the request.
     *
     * Default: 'application/json'
     *
     * [Documentation](https://docs.aws.amazon.com/bedrock/latest/APIReference/API_runtime_InvokeModel.html)
     */
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
     * Default: Input data is retrieved from the `body` field
     */
    override fun input(): BedrockInvokeModelInputProps? =
        unwrap(this).getInput()?.let(BedrockInvokeModelInputProps::wrap)

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
     * Default: The API response body is returned in the result.
     */
    override fun output(): BedrockInvokeModelOutputProps? =
        unwrap(this).getOutput()?.let(BedrockInvokeModelOutputProps::wrap)

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
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): BedrockInvokeModelProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.BedrockInvokeModelProps):
        BedrockInvokeModelProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: BedrockInvokeModelProps):
        software.amazon.awscdk.services.stepfunctions.tasks.BedrockInvokeModelProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.stepfunctions.tasks.BedrockInvokeModelProps
  }
}
