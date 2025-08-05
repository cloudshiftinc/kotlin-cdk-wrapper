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
import io.cloudshiftdev.awscdk.services.stepfunctions.TaskStateJsonataBaseProps
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
 * Object outputs;
 * TaskInput taskInput;
 * TaskRole taskRole;
 * Timeout timeout;
 * BedrockInvokeModelJsonataProps bedrockInvokeModelJsonataProps =
 * BedrockInvokeModelJsonataProps.builder()
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
 * .outputs(outputs)
 * .queryLanguage(QueryLanguage.JSON_PATH)
 * .stateName("stateName")
 * .taskTimeout(timeout)
 * .timeout(Duration.minutes(30))
 * .traceEnabled(false)
 * .build();
 * ```
 */
public interface BedrockInvokeModelJsonataProps : TaskStateJsonataBaseProps {
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
   * A builder for [BedrockInvokeModelJsonataProps]
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
    @JvmName("2d87962991ca7bef52825ffb41ccc773763fc44102594c9757c8c696677b34b1")
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
    @JvmName("81f622b0a69c7f7974e3b9af5a3e2366fc4971ca699b1823718099974fee0731")
    public fun input(input: BedrockInvokeModelInputProps.Builder.() -> Unit)

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
    @JvmName("866061c54cc0023ea544c6f32661f2dd6512fd1b5318061ff6df66f8f8874724")
    public fun output(output: BedrockInvokeModelOutputProps.Builder.() -> Unit)

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
        software.amazon.awscdk.services.stepfunctions.tasks.BedrockInvokeModelJsonataProps.Builder =
        software.amazon.awscdk.services.stepfunctions.tasks.BedrockInvokeModelJsonataProps.builder()

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
    @JvmName("2d87962991ca7bef52825ffb41ccc773763fc44102594c9757c8c696677b34b1")
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
    @JvmName("81f622b0a69c7f7974e3b9af5a3e2366fc4971ca699b1823718099974fee0731")
    override fun input(input: BedrockInvokeModelInputProps.Builder.() -> Unit): Unit =
        input(BedrockInvokeModelInputProps(input))

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
    @JvmName("866061c54cc0023ea544c6f32661f2dd6512fd1b5318061ff6df66f8f8874724")
    override fun output(output: BedrockInvokeModelOutputProps.Builder.() -> Unit): Unit =
        output(BedrockInvokeModelOutputProps(output))

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
        software.amazon.awscdk.services.stepfunctions.tasks.BedrockInvokeModelJsonataProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.BedrockInvokeModelJsonataProps,
  ) : CdkObject(cdkObject),
      BedrockInvokeModelJsonataProps {
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
    public operator fun invoke(block: Builder.() -> Unit = {}): BedrockInvokeModelJsonataProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.BedrockInvokeModelJsonataProps):
        BedrockInvokeModelJsonataProps = CdkObjectWrappers.wrap(cdkObject) as?
        BedrockInvokeModelJsonataProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: BedrockInvokeModelJsonataProps):
        software.amazon.awscdk.services.stepfunctions.tasks.BedrockInvokeModelJsonataProps =
        (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.stepfunctions.tasks.BedrockInvokeModelJsonataProps
  }
}
