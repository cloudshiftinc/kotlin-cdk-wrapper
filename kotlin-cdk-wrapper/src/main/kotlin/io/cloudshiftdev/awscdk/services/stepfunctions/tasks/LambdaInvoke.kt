@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions.tasks

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.lambda.IFunction
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
 * Invoke a Lambda function as a Task.
 *
 * Example:
 *
 * ```
 * Function fn;
 * LambdaInvoke.Builder.create(this, "Invoke with callback")
 * .lambdaFunction(fn)
 * .integrationPattern(IntegrationPattern.WAIT_FOR_TASK_TOKEN)
 * .payload(TaskInput.fromObject(Map.of(
 * "token", JsonPath.getTaskToken(),
 * "input", JsonPath.stringAt("$.someField"))))
 * .build();
 * ```
 *
 * [Documentation](https://docs.aws.amazon.com/step-functions/latest/dg/connect-lambda.html)
 */
public open class LambdaInvoke(
  cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.LambdaInvoke,
) : TaskStateBase(cdkObject) {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: LambdaInvokeProps,
  ) :
      this(software.amazon.awscdk.services.stepfunctions.tasks.LambdaInvoke(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(LambdaInvokeProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: LambdaInvokeProps.Builder.() -> Unit,
  ) : this(scope, id, LambdaInvokeProps(props)
  )

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.stepfunctions.tasks.LambdaInvoke].
   */
  @CdkDslMarker
  public interface Builder {
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
     * Up to 3583 bytes of base64-encoded data about the invoking client to pass to the function.
     *
     * Default: - No context
     *
     * @param clientContext Up to 3583 bytes of base64-encoded data about the invoking client to
     * pass to the function. 
     */
    public fun clientContext(clientContext: String)

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
    @JvmName("7c3f8577729b26bd57d5849d617d74f5dbdf86aae2ea7563644895440ab7d606")
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
     * Invocation type of the Lambda function.
     *
     * Default: InvocationType.REQUEST_RESPONSE
     *
     * @param invocationType Invocation type of the Lambda function. 
     */
    public fun invocationType(invocationType: LambdaInvocationType)

    /**
     * Lambda function to invoke.
     *
     * @param lambdaFunction Lambda function to invoke. 
     */
    public fun lambdaFunction(lambdaFunction: IFunction)

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
     * The JSON that will be supplied as input to the Lambda function.
     *
     * Default: - The state input (JSONata: '{% $states.input %}', JSONPath: '$')
     *
     * @param payload The JSON that will be supplied as input to the Lambda function. 
     */
    public fun payload(payload: TaskInput)

    /**
     * Invoke the Lambda in a way that only returns the payload response without additional
     * metadata.
     *
     * The `payloadResponseOnly` property cannot be used if `integrationPattern`, `invocationType`,
     * `clientContext`, or `qualifier` are specified.
     * It always uses the REQUEST_RESPONSE behavior.
     *
     * Default: false
     *
     * @param payloadResponseOnly Invoke the Lambda in a way that only returns the payload response
     * without additional metadata. 
     */
    public fun payloadResponseOnly(payloadResponseOnly: Boolean)

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
     * @param qualifier Version or alias to invoke a published version of the function. 
     */
    @Deprecated(message = "deprecated in CDK")
    public fun qualifier(qualifier: String)

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
     * @param retryOnServiceExceptions Whether to retry on Lambda service exceptions. 
     */
    public fun retryOnServiceExceptions(retryOnServiceExceptions: Boolean)

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
    private val cdkBuilder: software.amazon.awscdk.services.stepfunctions.tasks.LambdaInvoke.Builder
        = software.amazon.awscdk.services.stepfunctions.tasks.LambdaInvoke.Builder.create(scope, id)

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
     * Up to 3583 bytes of base64-encoded data about the invoking client to pass to the function.
     *
     * Default: - No context
     *
     * @param clientContext Up to 3583 bytes of base64-encoded data about the invoking client to
     * pass to the function. 
     */
    override fun clientContext(clientContext: String) {
      cdkBuilder.clientContext(clientContext)
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
    @JvmName("7c3f8577729b26bd57d5849d617d74f5dbdf86aae2ea7563644895440ab7d606")
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
     * Invocation type of the Lambda function.
     *
     * Default: InvocationType.REQUEST_RESPONSE
     *
     * @param invocationType Invocation type of the Lambda function. 
     */
    override fun invocationType(invocationType: LambdaInvocationType) {
      cdkBuilder.invocationType(invocationType.let(LambdaInvocationType.Companion::unwrap))
    }

    /**
     * Lambda function to invoke.
     *
     * @param lambdaFunction Lambda function to invoke. 
     */
    override fun lambdaFunction(lambdaFunction: IFunction) {
      cdkBuilder.lambdaFunction(lambdaFunction.let(IFunction.Companion::unwrap))
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
     * The JSON that will be supplied as input to the Lambda function.
     *
     * Default: - The state input (JSONata: '{% $states.input %}', JSONPath: '$')
     *
     * @param payload The JSON that will be supplied as input to the Lambda function. 
     */
    override fun payload(payload: TaskInput) {
      cdkBuilder.payload(payload.let(TaskInput.Companion::unwrap))
    }

    /**
     * Invoke the Lambda in a way that only returns the payload response without additional
     * metadata.
     *
     * The `payloadResponseOnly` property cannot be used if `integrationPattern`, `invocationType`,
     * `clientContext`, or `qualifier` are specified.
     * It always uses the REQUEST_RESPONSE behavior.
     *
     * Default: false
     *
     * @param payloadResponseOnly Invoke the Lambda in a way that only returns the payload response
     * without additional metadata. 
     */
    override fun payloadResponseOnly(payloadResponseOnly: Boolean) {
      cdkBuilder.payloadResponseOnly(payloadResponseOnly)
    }

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
     * @param qualifier Version or alias to invoke a published version of the function. 
     */
    @Deprecated(message = "deprecated in CDK")
    override fun qualifier(qualifier: String) {
      cdkBuilder.qualifier(qualifier)
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
     * @param retryOnServiceExceptions Whether to retry on Lambda service exceptions. 
     */
    override fun retryOnServiceExceptions(retryOnServiceExceptions: Boolean) {
      cdkBuilder.retryOnServiceExceptions(retryOnServiceExceptions)
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

    public fun build(): software.amazon.awscdk.services.stepfunctions.tasks.LambdaInvoke =
        cdkBuilder.build()
  }

  public companion object {
    public fun jsonPath(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      props: LambdaInvokeJsonPathProps,
    ): LambdaInvoke =
        software.amazon.awscdk.services.stepfunctions.tasks.LambdaInvoke.jsonPath(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
        id, props.let(LambdaInvokeJsonPathProps.Companion::unwrap)).let(LambdaInvoke::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a109822f38e38c640ecdb630370ac2e4a96d44d44792e13bde4f00af7bb9fca4")
    public fun jsonPath(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      props: LambdaInvokeJsonPathProps.Builder.() -> Unit,
    ): LambdaInvoke = jsonPath(scope, id, LambdaInvokeJsonPathProps(props))

    public fun jsonata(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      props: LambdaInvokeJsonataProps,
    ): LambdaInvoke =
        software.amazon.awscdk.services.stepfunctions.tasks.LambdaInvoke.jsonata(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
        id, props.let(LambdaInvokeJsonataProps.Companion::unwrap)).let(LambdaInvoke::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("36634aa2cc31280a37e3ae5afe9b5a42ca3124d0596be5df3aed38e99a3d734c")
    public fun jsonata(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      props: LambdaInvokeJsonataProps.Builder.() -> Unit,
    ): LambdaInvoke = jsonata(scope, id, LambdaInvokeJsonataProps(props))

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): LambdaInvoke {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return LambdaInvoke(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.LambdaInvoke):
        LambdaInvoke = LambdaInvoke(cdkObject)

    internal fun unwrap(wrapped: LambdaInvoke):
        software.amazon.awscdk.services.stepfunctions.tasks.LambdaInvoke = wrapped.cdkObject as
        software.amazon.awscdk.services.stepfunctions.tasks.LambdaInvoke
  }
}
