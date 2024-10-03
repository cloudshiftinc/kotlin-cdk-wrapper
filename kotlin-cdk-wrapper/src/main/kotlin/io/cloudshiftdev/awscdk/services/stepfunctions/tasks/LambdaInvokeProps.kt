@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions.tasks

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.lambda.IFunction
import io.cloudshiftdev.awscdk.services.stepfunctions.Credentials
import io.cloudshiftdev.awscdk.services.stepfunctions.IntegrationPattern
import io.cloudshiftdev.awscdk.services.stepfunctions.TaskInput
import io.cloudshiftdev.awscdk.services.stepfunctions.TaskStateBaseProps
import io.cloudshiftdev.awscdk.services.stepfunctions.Timeout
import kotlin.Any
import kotlin.Boolean
import kotlin.Deprecated
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import kotlin.jvm.JvmName

/**
 * Properties for invoking a Lambda function with LambdaInvoke.
 *
 * Example:
 *
 * ```
 * Function fn;
 * LambdaInvoke.Builder.create(this, "Invoke with empty object as payload")
 * .lambdaFunction(fn)
 * .payload(TaskInput.fromObject(Map.of()))
 * .build();
 * // use the output of fn as input
 * // use the output of fn as input
 * LambdaInvoke.Builder.create(this, "Invoke with payload field in the state input")
 * .lambdaFunction(fn)
 * .payload(TaskInput.fromJsonPathAt("$.Payload"))
 * .build();
 * ```
 */
public interface LambdaInvokeProps : TaskStateBaseProps {
  /**
   * Up to 3583 bytes of base64-encoded data about the invoking client to pass to the function.
   *
   * Default: - No context
   */
  public fun clientContext(): String? = unwrap(this).getClientContext()

  /**
   * Invocation type of the Lambda function.
   *
   * Default: InvocationType.REQUEST_RESPONSE
   */
  public fun invocationType(): LambdaInvocationType? =
      unwrap(this).getInvocationType()?.let(LambdaInvocationType::wrap)

  /**
   * Lambda function to invoke.
   */
  public fun lambdaFunction(): IFunction

  /**
   * The JSON that will be supplied as input to the Lambda function.
   *
   * Default: - The state input (JSON path '$')
   */
  public fun payload(): TaskInput? = unwrap(this).getPayload()?.let(TaskInput::wrap)

  /**
   * Invoke the Lambda in a way that only returns the payload response without additional metadata.
   *
   * The `payloadResponseOnly` property cannot be used if `integrationPattern`, `invocationType`,
   * `clientContext`, or `qualifier` are specified.
   * It always uses the REQUEST_RESPONSE behavior.
   *
   * Default: false
   */
  public fun payloadResponseOnly(): Boolean? = unwrap(this).getPayloadResponseOnly()

  /**
   * (deprecated) Version or alias to invoke a published version of the function.
   *
   * You only need to supply this if you want the version of the Lambda Function to depend
   * on data in the state machine state. If not, you can pass the appropriate Alias or Version
   * object
   * directly as the `lambdaFunction` argument.
   *
   * Default: - Version or alias inherent to the `lambdaFunction` object.
   *
   * @deprecated pass a Version or Alias object as lambdaFunction instead
   */
  @Deprecated(message = "deprecated in CDK")
  public fun qualifier(): String? = unwrap(this).getQualifier()

  /**
   * Whether to retry on Lambda service exceptions.
   *
   * This handles `Lambda.ServiceException`, `Lambda.AWSLambdaException`,
   * `Lambda.SdkClientException`, and `Lambda.ClientExecutionTimeoutException`
   * with an interval of 2 seconds, a back-off rate
   * of 2 and 6 maximum attempts.
   *
   * Default: true
   *
   * [Documentation](https://docs.aws.amazon.com/step-functions/latest/dg/bp-lambda-serviceexception.html)
   */
  public fun retryOnServiceExceptions(): Boolean? = unwrap(this).getRetryOnServiceExceptions()

  /**
   * A builder for [LambdaInvokeProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param clientContext Up to 3583 bytes of base64-encoded data about the invoking client to
     * pass to the function.
     */
    public fun clientContext(clientContext: String)

    /**
     * @param comment An optional description for this state.
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
    @JvmName("7aa1d4ad9bdbfcadb89199cbba1b7327107da4da7b8b845d782dfc7f98eb1886")
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
     * @param invocationType Invocation type of the Lambda function.
     */
    public fun invocationType(invocationType: LambdaInvocationType)

    /**
     * @param lambdaFunction Lambda function to invoke. 
     */
    public fun lambdaFunction(lambdaFunction: IFunction)

    /**
     * @param outputPath JSONPath expression to select select a portion of the state output to pass
     * to the next state.
     * May also be the special value JsonPath.DISCARD, which will cause the effective
     * output to be the empty object {}.
     */
    public fun outputPath(outputPath: String)

    /**
     * @param payload The JSON that will be supplied as input to the Lambda function.
     */
    public fun payload(payload: TaskInput)

    /**
     * @param payloadResponseOnly Invoke the Lambda in a way that only returns the payload response
     * without additional metadata.
     * The `payloadResponseOnly` property cannot be used if `integrationPattern`, `invocationType`,
     * `clientContext`, or `qualifier` are specified.
     * It always uses the REQUEST_RESPONSE behavior.
     */
    public fun payloadResponseOnly(payloadResponseOnly: Boolean)

    /**
     * @param qualifier Version or alias to invoke a published version of the function.
     * You only need to supply this if you want the version of the Lambda Function to depend
     * on data in the state machine state. If not, you can pass the appropriate Alias or Version
     * object
     * directly as the `lambdaFunction` argument.
     * @deprecated pass a Version or Alias object as lambdaFunction instead
     */
    @Deprecated(message = "deprecated in CDK")
    public fun qualifier(qualifier: String)

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
     * @param retryOnServiceExceptions Whether to retry on Lambda service exceptions.
     * This handles `Lambda.ServiceException`, `Lambda.AWSLambdaException`,
     * `Lambda.SdkClientException`, and `Lambda.ClientExecutionTimeoutException`
     * with an interval of 2 seconds, a back-off rate
     * of 2 and 6 maximum attempts.
     */
    public fun retryOnServiceExceptions(retryOnServiceExceptions: Boolean)

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
        software.amazon.awscdk.services.stepfunctions.tasks.LambdaInvokeProps.Builder =
        software.amazon.awscdk.services.stepfunctions.tasks.LambdaInvokeProps.builder()

    /**
     * @param clientContext Up to 3583 bytes of base64-encoded data about the invoking client to
     * pass to the function.
     */
    override fun clientContext(clientContext: String) {
      cdkBuilder.clientContext(clientContext)
    }

    /**
     * @param comment An optional description for this state.
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
    @JvmName("7aa1d4ad9bdbfcadb89199cbba1b7327107da4da7b8b845d782dfc7f98eb1886")
    override fun credentials(credentials: Credentials.Builder.() -> Unit): Unit =
        credentials(Credentials(credentials))

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
     * @param invocationType Invocation type of the Lambda function.
     */
    override fun invocationType(invocationType: LambdaInvocationType) {
      cdkBuilder.invocationType(invocationType.let(LambdaInvocationType.Companion::unwrap))
    }

    /**
     * @param lambdaFunction Lambda function to invoke. 
     */
    override fun lambdaFunction(lambdaFunction: IFunction) {
      cdkBuilder.lambdaFunction(lambdaFunction.let(IFunction.Companion::unwrap))
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
     * @param payload The JSON that will be supplied as input to the Lambda function.
     */
    override fun payload(payload: TaskInput) {
      cdkBuilder.payload(payload.let(TaskInput.Companion::unwrap))
    }

    /**
     * @param payloadResponseOnly Invoke the Lambda in a way that only returns the payload response
     * without additional metadata.
     * The `payloadResponseOnly` property cannot be used if `integrationPattern`, `invocationType`,
     * `clientContext`, or `qualifier` are specified.
     * It always uses the REQUEST_RESPONSE behavior.
     */
    override fun payloadResponseOnly(payloadResponseOnly: Boolean) {
      cdkBuilder.payloadResponseOnly(payloadResponseOnly)
    }

    /**
     * @param qualifier Version or alias to invoke a published version of the function.
     * You only need to supply this if you want the version of the Lambda Function to depend
     * on data in the state machine state. If not, you can pass the appropriate Alias or Version
     * object
     * directly as the `lambdaFunction` argument.
     * @deprecated pass a Version or Alias object as lambdaFunction instead
     */
    @Deprecated(message = "deprecated in CDK")
    override fun qualifier(qualifier: String) {
      cdkBuilder.qualifier(qualifier)
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
     * @param retryOnServiceExceptions Whether to retry on Lambda service exceptions.
     * This handles `Lambda.ServiceException`, `Lambda.AWSLambdaException`,
     * `Lambda.SdkClientException`, and `Lambda.ClientExecutionTimeoutException`
     * with an interval of 2 seconds, a back-off rate
     * of 2 and 6 maximum attempts.
     */
    override fun retryOnServiceExceptions(retryOnServiceExceptions: Boolean) {
      cdkBuilder.retryOnServiceExceptions(retryOnServiceExceptions)
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

    public fun build(): software.amazon.awscdk.services.stepfunctions.tasks.LambdaInvokeProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.LambdaInvokeProps,
  ) : CdkObject(cdkObject),
      LambdaInvokeProps {
    /**
     * Up to 3583 bytes of base64-encoded data about the invoking client to pass to the function.
     *
     * Default: - No context
     */
    override fun clientContext(): String? = unwrap(this).getClientContext()

    /**
     * An optional description for this state.
     *
     * Default: - No comment
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
     * Invocation type of the Lambda function.
     *
     * Default: InvocationType.REQUEST_RESPONSE
     */
    override fun invocationType(): LambdaInvocationType? =
        unwrap(this).getInvocationType()?.let(LambdaInvocationType::wrap)

    /**
     * Lambda function to invoke.
     */
    override fun lambdaFunction(): IFunction = unwrap(this).getLambdaFunction().let(IFunction::wrap)

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
     * The JSON that will be supplied as input to the Lambda function.
     *
     * Default: - The state input (JSON path '$')
     */
    override fun payload(): TaskInput? = unwrap(this).getPayload()?.let(TaskInput::wrap)

    /**
     * Invoke the Lambda in a way that only returns the payload response without additional
     * metadata.
     *
     * The `payloadResponseOnly` property cannot be used if `integrationPattern`, `invocationType`,
     * `clientContext`, or `qualifier` are specified.
     * It always uses the REQUEST_RESPONSE behavior.
     *
     * Default: false
     */
    override fun payloadResponseOnly(): Boolean? = unwrap(this).getPayloadResponseOnly()

    /**
     * (deprecated) Version or alias to invoke a published version of the function.
     *
     * You only need to supply this if you want the version of the Lambda Function to depend
     * on data in the state machine state. If not, you can pass the appropriate Alias or Version
     * object
     * directly as the `lambdaFunction` argument.
     *
     * Default: - Version or alias inherent to the `lambdaFunction` object.
     *
     * @deprecated pass a Version or Alias object as lambdaFunction instead
     */
    @Deprecated(message = "deprecated in CDK")
    override fun qualifier(): String? = unwrap(this).getQualifier()

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
     * Whether to retry on Lambda service exceptions.
     *
     * This handles `Lambda.ServiceException`, `Lambda.AWSLambdaException`,
     * `Lambda.SdkClientException`, and `Lambda.ClientExecutionTimeoutException`
     * with an interval of 2 seconds, a back-off rate
     * of 2 and 6 maximum attempts.
     *
     * Default: true
     *
     * [Documentation](https://docs.aws.amazon.com/step-functions/latest/dg/bp-lambda-serviceexception.html)
     */
    override fun retryOnServiceExceptions(): Boolean? = unwrap(this).getRetryOnServiceExceptions()

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
    public operator fun invoke(block: Builder.() -> Unit = {}): LambdaInvokeProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.LambdaInvokeProps):
        LambdaInvokeProps = CdkObjectWrappers.wrap(cdkObject) as? LambdaInvokeProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: LambdaInvokeProps):
        software.amazon.awscdk.services.stepfunctions.tasks.LambdaInvokeProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.stepfunctions.tasks.LambdaInvokeProps
  }
}
