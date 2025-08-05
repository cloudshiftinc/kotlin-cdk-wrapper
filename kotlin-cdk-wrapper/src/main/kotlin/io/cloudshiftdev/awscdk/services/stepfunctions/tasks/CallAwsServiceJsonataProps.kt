@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions.tasks

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.iam.PolicyStatement
import io.cloudshiftdev.awscdk.services.stepfunctions.Credentials
import io.cloudshiftdev.awscdk.services.stepfunctions.IntegrationPattern
import io.cloudshiftdev.awscdk.services.stepfunctions.QueryLanguage
import io.cloudshiftdev.awscdk.services.stepfunctions.TaskStateJsonataBaseProps
import io.cloudshiftdev.awscdk.services.stepfunctions.Timeout
import kotlin.Any
import kotlin.Deprecated
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName

/**
 * Properties for calling an AWS service's API action using JSONata from your state machine.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.*;
 * import io.cloudshiftdev.awscdk.services.iam.*;
 * import io.cloudshiftdev.awscdk.services.stepfunctions.*;
 * import io.cloudshiftdev.awscdk.services.stepfunctions.tasks.*;
 * Object assign;
 * Object outputs;
 * Object parameters;
 * PolicyStatement policyStatement;
 * TaskRole taskRole;
 * Timeout timeout;
 * CallAwsServiceJsonataProps callAwsServiceJsonataProps = CallAwsServiceJsonataProps.builder()
 * .action("action")
 * .iamResources(List.of("iamResources"))
 * .service("service")
 * // the properties below are optional
 * .additionalIamStatements(List.of(policyStatement))
 * .assign(Map.of(
 * "assignKey", assign))
 * .comment("comment")
 * .credentials(Credentials.builder()
 * .role(taskRole)
 * .build())
 * .heartbeat(Duration.minutes(30))
 * .heartbeatTimeout(timeout)
 * .iamAction("iamAction")
 * .integrationPattern(IntegrationPattern.REQUEST_RESPONSE)
 * .outputs(outputs)
 * .parameters(Map.of(
 * "parametersKey", parameters))
 * .queryLanguage(QueryLanguage.JSON_PATH)
 * .stateName("stateName")
 * .taskTimeout(timeout)
 * .timeout(Duration.minutes(30))
 * .build();
 * ```
 *
 * [Documentation](https://docs.aws.amazon.com/step-functions/latest/dg/supported-services-awssdk.html)
 */
public interface CallAwsServiceJsonataProps : TaskStateJsonataBaseProps {
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
   * A builder for [CallAwsServiceJsonataProps]
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
     * @param assign Workflow variables to store in this step.
     * Using workflow variables, you can store data in a step and retrieve that data in future
     * steps.
     */
    public fun assign(assign: Map<String, Any>)

    /**
     * @param comment A comment describing this state.
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
    @JvmName("c69a87c170dea510dba1e91a105caa2679063b54d2b0030f0f14076c4898bcd8")
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
     * @param integrationPattern AWS Step Functions integrates with services directly in the Amazon
     * States Language.
     * You can control these AWS services using service integration patterns.
     *
     * Depending on the AWS Service, the Service Integration Pattern availability will vary.
     */
    public fun integrationPattern(integrationPattern: IntegrationPattern)

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
     * @param parameters Parameters for the API action call.
     * Use PascalCase for the parameter names.
     */
    public fun parameters(parameters: Map<String, Any>)

    /**
     * @param queryLanguage The name of the query language used by the state.
     * If the state does not contain a `queryLanguage` field,
     * then it will use the query language specified in the top-level `queryLanguage` field.
     */
    public fun queryLanguage(queryLanguage: QueryLanguage)

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
        software.amazon.awscdk.services.stepfunctions.tasks.CallAwsServiceJsonataProps.Builder =
        software.amazon.awscdk.services.stepfunctions.tasks.CallAwsServiceJsonataProps.builder()

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
      cdkBuilder.additionalIamStatements(additionalIamStatements.map(PolicyStatement.Companion::unwrap))
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
     * @param assign Workflow variables to store in this step.
     * Using workflow variables, you can store data in a step and retrieve that data in future
     * steps.
     */
    override fun assign(assign: Map<String, Any>) {
      cdkBuilder.assign(assign.mapValues{CdkObjectWrappers.unwrap(it.value)})
    }

    /**
     * @param comment A comment describing this state.
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
    @JvmName("c69a87c170dea510dba1e91a105caa2679063b54d2b0030f0f14076c4898bcd8")
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
     * @param parameters Parameters for the API action call.
     * Use PascalCase for the parameter names.
     */
    override fun parameters(parameters: Map<String, Any>) {
      cdkBuilder.parameters(parameters.mapValues{CdkObjectWrappers.unwrap(it.value)})
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

    public fun build():
        software.amazon.awscdk.services.stepfunctions.tasks.CallAwsServiceJsonataProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.CallAwsServiceJsonataProps,
  ) : CdkObject(cdkObject),
      CallAwsServiceJsonataProps {
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
     * A comment describing this state.
     *
     * Default: No comment
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
     * Parameters for the API action call.
     *
     * Use PascalCase for the parameter names.
     *
     * Default: - no parameters
     */
    override fun parameters(): Map<String, Any> = unwrap(this).getParameters() ?: emptyMap()

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
    public operator fun invoke(block: Builder.() -> Unit = {}): CallAwsServiceJsonataProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.CallAwsServiceJsonataProps):
        CallAwsServiceJsonataProps = CdkObjectWrappers.wrap(cdkObject) as?
        CallAwsServiceJsonataProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CallAwsServiceJsonataProps):
        software.amazon.awscdk.services.stepfunctions.tasks.CallAwsServiceJsonataProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.stepfunctions.tasks.CallAwsServiceJsonataProps
  }
}
