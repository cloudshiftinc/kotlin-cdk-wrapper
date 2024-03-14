package io.cloudshiftdev.awscdk.services.stepfunctions.tasks

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.iam.PolicyStatement
import io.cloudshiftdev.awscdk.services.stepfunctions.Credentials
import io.cloudshiftdev.awscdk.services.stepfunctions.IntegrationPattern
import io.cloudshiftdev.awscdk.services.stepfunctions.TaskStateBaseProps
import io.cloudshiftdev.awscdk.services.stepfunctions.Timeout
import kotlin.Any
import kotlin.Deprecated
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName

public interface CallAwsServiceProps : TaskStateBaseProps {
  /**
   * The API action to call.
   *
   * Use camelCase.
   */
  public fun action(): String

  /**
   * Additional IAM statements that will be added to the state machine role's policy.
   *
   * Use in the case where the call requires more than a single statement to
   * be executed, e.g. `rekognition:detectLabels` requires also S3 permissions
   * to read the object on which it must act.
   *
   * Default: - no additional statements are added
   */
  public fun additionalIamStatements(): List<PolicyStatement> =
      unwrap(this).getAdditionalIamStatements()?.map(PolicyStatement::wrap) ?: emptyList()

  /**
   * The action for the IAM statement that will be added to the state machine role's policy to allow
   * the state machine to make the API call.
   *
   * Use in the case where the IAM action name does not match with the
   * API service/action name, e.g. `s3:ListBuckets` requires `s3:ListAllMyBuckets`.
   *
   * Default: - service:action
   */
  public fun iamAction(): String? = unwrap(this).getIamAction()

  /**
   * The resources for the IAM statement that will be added to the state machine role's policy to
   * allow the state machine to make the API call.
   *
   * By default the action for this IAM statement will be `service:action`.
   */
  public fun iamResources(): List<String>

  /**
   * Parameters for the API action call.
   *
   * Use PascalCase for the parameter names.
   *
   * Default: - no parameters
   */
  public fun parameters(): Map<String, Any> = unwrap(this).getParameters() ?: emptyMap()

  /**
   * The AWS service to call.
   *
   * [Documentation](https://docs.aws.amazon.com/step-functions/latest/dg/supported-services-awssdk.html)
   */
  public fun service(): String

  /**
   * A builder for [CallAwsServiceProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param action The API action to call. 
     * Use camelCase.
     */
    public fun action(action: String)

    /**
     * @param additionalIamStatements Additional IAM statements that will be added to the state
     * machine role's policy.
     * Use in the case where the call requires more than a single statement to
     * be executed, e.g. `rekognition:detectLabels` requires also S3 permissions
     * to read the object on which it must act.
     */
    public fun additionalIamStatements(additionalIamStatements: List<PolicyStatement>)

    /**
     * @param additionalIamStatements Additional IAM statements that will be added to the state
     * machine role's policy.
     * Use in the case where the call requires more than a single statement to
     * be executed, e.g. `rekognition:detectLabels` requires also S3 permissions
     * to read the object on which it must act.
     */
    public fun additionalIamStatements(vararg additionalIamStatements: PolicyStatement)

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
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1a8cab08ca6383bd4076860c0b078cabccdb1bc2f5d5b933755b5a1f003f79ec")
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
     * @param iamAction The action for the IAM statement that will be added to the state machine
     * role's policy to allow the state machine to make the API call.
     * Use in the case where the IAM action name does not match with the
     * API service/action name, e.g. `s3:ListBuckets` requires `s3:ListAllMyBuckets`.
     */
    public fun iamAction(iamAction: String)

    /**
     * @param iamResources The resources for the IAM statement that will be added to the state
     * machine role's policy to allow the state machine to make the API call. 
     * By default the action for this IAM statement will be `service:action`.
     */
    public fun iamResources(iamResources: List<String>)

    /**
     * @param iamResources The resources for the IAM statement that will be added to the state
     * machine role's policy to allow the state machine to make the API call. 
     * By default the action for this IAM statement will be `service:action`.
     */
    public fun iamResources(vararg iamResources: String)

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
     * @param outputPath JSONPath expression to select select a portion of the state output to pass
     * to the next state.
     * May also be the special value JsonPath.DISCARD, which will cause the effective
     * output to be the empty object {}.
     */
    public fun outputPath(outputPath: String)

    /**
     * @param parameters Parameters for the API action call.
     * Use PascalCase for the parameter names.
     */
    public fun parameters(parameters: Map<String, Any>)

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
     * @param service The AWS service to call. 
     */
    public fun service(service: String)

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
        software.amazon.awscdk.services.stepfunctions.tasks.CallAwsServiceProps.Builder =
        software.amazon.awscdk.services.stepfunctions.tasks.CallAwsServiceProps.builder()

    /**
     * @param action The API action to call. 
     * Use camelCase.
     */
    override fun action(action: String) {
      cdkBuilder.action(action)
    }

    /**
     * @param additionalIamStatements Additional IAM statements that will be added to the state
     * machine role's policy.
     * Use in the case where the call requires more than a single statement to
     * be executed, e.g. `rekognition:detectLabels` requires also S3 permissions
     * to read the object on which it must act.
     */
    override fun additionalIamStatements(additionalIamStatements: List<PolicyStatement>) {
      cdkBuilder.additionalIamStatements(additionalIamStatements.map(PolicyStatement::unwrap))
    }

    /**
     * @param additionalIamStatements Additional IAM statements that will be added to the state
     * machine role's policy.
     * Use in the case where the call requires more than a single statement to
     * be executed, e.g. `rekognition:detectLabels` requires also S3 permissions
     * to read the object on which it must act.
     */
    override fun additionalIamStatements(vararg additionalIamStatements: PolicyStatement): Unit =
        additionalIamStatements(additionalIamStatements.toList())

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
      cdkBuilder.credentials(credentials.let(Credentials::unwrap))
    }

    /**
     * @param credentials Credentials for an IAM Role that the State Machine assumes for executing
     * the task.
     * This enables cross-account resource invocations.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1a8cab08ca6383bd4076860c0b078cabccdb1bc2f5d5b933755b5a1f003f79ec")
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
     * @param iamAction The action for the IAM statement that will be added to the state machine
     * role's policy to allow the state machine to make the API call.
     * Use in the case where the IAM action name does not match with the
     * API service/action name, e.g. `s3:ListBuckets` requires `s3:ListAllMyBuckets`.
     */
    override fun iamAction(iamAction: String) {
      cdkBuilder.iamAction(iamAction)
    }

    /**
     * @param iamResources The resources for the IAM statement that will be added to the state
     * machine role's policy to allow the state machine to make the API call. 
     * By default the action for this IAM statement will be `service:action`.
     */
    override fun iamResources(iamResources: List<String>) {
      cdkBuilder.iamResources(iamResources)
    }

    /**
     * @param iamResources The resources for the IAM statement that will be added to the state
     * machine role's policy to allow the state machine to make the API call. 
     * By default the action for this IAM statement will be `service:action`.
     */
    override fun iamResources(vararg iamResources: String): Unit =
        iamResources(iamResources.toList())

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
     * @param outputPath JSONPath expression to select select a portion of the state output to pass
     * to the next state.
     * May also be the special value JsonPath.DISCARD, which will cause the effective
     * output to be the empty object {}.
     */
    override fun outputPath(outputPath: String) {
      cdkBuilder.outputPath(outputPath)
    }

    /**
     * @param parameters Parameters for the API action call.
     * Use PascalCase for the parameter names.
     */
    override fun parameters(parameters: Map<String, Any>) {
      cdkBuilder.parameters(parameters)
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
     * @param service The AWS service to call. 
     */
    override fun service(service: String) {
      cdkBuilder.service(service)
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

    public fun build(): software.amazon.awscdk.services.stepfunctions.tasks.CallAwsServiceProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.CallAwsServiceProps,
  ) : CdkObject(cdkObject), CallAwsServiceProps {
    /**
     * The API action to call.
     *
     * Use camelCase.
     */
    override fun action(): String = unwrap(this).getAction()

    /**
     * Additional IAM statements that will be added to the state machine role's policy.
     *
     * Use in the case where the call requires more than a single statement to
     * be executed, e.g. `rekognition:detectLabels` requires also S3 permissions
     * to read the object on which it must act.
     *
     * Default: - no additional statements are added
     */
    override fun additionalIamStatements(): List<PolicyStatement> =
        unwrap(this).getAdditionalIamStatements()?.map(PolicyStatement::wrap) ?: emptyList()

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
     * The action for the IAM statement that will be added to the state machine role's policy to
     * allow the state machine to make the API call.
     *
     * Use in the case where the IAM action name does not match with the
     * API service/action name, e.g. `s3:ListBuckets` requires `s3:ListAllMyBuckets`.
     *
     * Default: - service:action
     */
    override fun iamAction(): String? = unwrap(this).getIamAction()

    /**
     * The resources for the IAM statement that will be added to the state machine role's policy to
     * allow the state machine to make the API call.
     *
     * By default the action for this IAM statement will be `service:action`.
     */
    override fun iamResources(): List<String> = unwrap(this).getIamResources()

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
     * Parameters for the API action call.
     *
     * Use PascalCase for the parameter names.
     *
     * Default: - no parameters
     */
    override fun parameters(): Map<String, Any> = unwrap(this).getParameters() ?: emptyMap()

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
     * The AWS service to call.
     *
     * [Documentation](https://docs.aws.amazon.com/step-functions/latest/dg/supported-services-awssdk.html)
     */
    override fun service(): String = unwrap(this).getService()

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
    public operator fun invoke(block: Builder.() -> Unit = {}): CallAwsServiceProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.CallAwsServiceProps):
        CallAwsServiceProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CallAwsServiceProps):
        software.amazon.awscdk.services.stepfunctions.tasks.CallAwsServiceProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.stepfunctions.tasks.CallAwsServiceProps
  }
}
