@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions.tasks

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.bedrock.IModel
import io.cloudshiftdev.awscdk.services.stepfunctions.Credentials
import io.cloudshiftdev.awscdk.services.stepfunctions.IntegrationPattern
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
      this(software.amazon.awscdk.services.stepfunctions.tasks.BedrockInvokeModel(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(BedrockInvokeModelProps::unwrap))
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
     * @param body The input data for the Bedrock model invocation. 
     */
    public fun body(body: TaskInput)

    /**
     * An optional description for this state.
     *
     * Default: - No comment
     *
     * @param comment An optional description for this state. 
     */
    public fun comment(comment: String)

    /**
     * The MIME type of the input data in the request.
     *
     * Default: 'application/json'
     *
     * [Documentation](https://docs.aws.amazon.com/bedrock/latest/APIReference/API_runtime_InvokeModel.html)
     * @param contentType The MIME type of the input data in the request. 
     */
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
     * Default: Input data is retrieved from the `body` field
     *
     * @param input The source location to retrieve the input data from. 
     */
    public fun input(input: BedrockInvokeModelInputProps)

    /**
     * The source location to retrieve the input data from.
     *
     * Default: Input data is retrieved from the `body` field
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
     * Default: The API response body is returned in the result.
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
     * Default: The API response body is returned in the result.
     *
     * @param output The destination location where the API response is written. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("525aad5912f1220f33479d8032b7121e37c39ec7d412489a5d8232b231648a85")
    public fun output(output: BedrockInvokeModelOutputProps.Builder.() -> Unit)

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
     * @param body The input data for the Bedrock model invocation. 
     */
    override fun body(body: TaskInput) {
      cdkBuilder.body(body.let(TaskInput::unwrap))
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
     * The MIME type of the input data in the request.
     *
     * Default: 'application/json'
     *
     * [Documentation](https://docs.aws.amazon.com/bedrock/latest/APIReference/API_runtime_InvokeModel.html)
     * @param contentType The MIME type of the input data in the request. 
     */
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
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9836b1e352f5e6c2dbfc3ccc5026429a9c84a71307d8aad3dd518bd7d4b995ed")
    override fun credentials(credentials: Credentials.Builder.() -> Unit): Unit =
        credentials(Credentials(credentials))

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
     * The source location to retrieve the input data from.
     *
     * Default: Input data is retrieved from the `body` field
     *
     * @param input The source location to retrieve the input data from. 
     */
    override fun input(input: BedrockInvokeModelInputProps) {
      cdkBuilder.input(input.let(BedrockInvokeModelInputProps::unwrap))
    }

    /**
     * The source location to retrieve the input data from.
     *
     * Default: Input data is retrieved from the `body` field
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
     * The Bedrock model that the task will invoke.
     *
     * [Documentation](https://docs.aws.amazon.com/bedrock/latest/userguide/api-methods-run.html)
     * @param model The Bedrock model that the task will invoke. 
     */
    override fun model(model: IModel) {
      cdkBuilder.model(model.let(IModel::unwrap))
    }

    /**
     * The destination location where the API response is written.
     *
     * If you specify this field, the API response body is replaced with a reference to the
     * output location.
     *
     * Default: The API response body is returned in the result.
     *
     * @param output The destination location where the API response is written. 
     */
    override fun output(output: BedrockInvokeModelOutputProps) {
      cdkBuilder.output(output.let(BedrockInvokeModelOutputProps::unwrap))
    }

    /**
     * The destination location where the API response is written.
     *
     * If you specify this field, the API response body is replaced with a reference to the
     * output location.
     *
     * Default: The API response body is returned in the result.
     *
     * @param output The destination location where the API response is written. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("525aad5912f1220f33479d8032b7121e37c39ec7d412489a5d8232b231648a85")
    override fun output(output: BedrockInvokeModelOutputProps.Builder.() -> Unit): Unit =
        output(BedrockInvokeModelOutputProps(output))

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

    public fun build(): software.amazon.awscdk.services.stepfunctions.tasks.BedrockInvokeModel =
        cdkBuilder.build()
  }

  public companion object {
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
