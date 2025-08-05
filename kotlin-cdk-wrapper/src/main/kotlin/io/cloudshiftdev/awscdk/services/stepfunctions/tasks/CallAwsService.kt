@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions.tasks

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.iam.PolicyStatement
import io.cloudshiftdev.awscdk.services.stepfunctions.Credentials
import io.cloudshiftdev.awscdk.services.stepfunctions.IntegrationPattern
import io.cloudshiftdev.awscdk.services.stepfunctions.QueryLanguage
import io.cloudshiftdev.awscdk.services.stepfunctions.TaskStateBase
import io.cloudshiftdev.awscdk.services.stepfunctions.Timeout
import kotlin.Any
import kotlin.Deprecated
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * A StepFunctions task to call an AWS service API.
 *
 * Example:
 *
 * ```
 * Bucket myBucket;
 * CallAwsService getObject = CallAwsService.Builder.create(this, "GetObject")
 * .service("s3")
 * .action("getObject")
 * .parameters(Map.of(
 * "Bucket", myBucket.getBucketName(),
 * "Key", JsonPath.stringAt("$.key")))
 * .iamResources(List.of(myBucket.arnForObjects("*")))
 * .build();
 * ```
 */
public open class CallAwsService(
  cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.CallAwsService,
) : TaskStateBase(cdkObject) {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CallAwsServiceProps,
  ) :
      this(software.amazon.awscdk.services.stepfunctions.tasks.CallAwsService(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CallAwsServiceProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CallAwsServiceProps.Builder.() -> Unit,
  ) : this(scope, id, CallAwsServiceProps(props)
  )

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.stepfunctions.tasks.CallAwsService].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The API action to call.
     *
     * Use camelCase.
     *
     * @param action The API action to call. 
     */
    public fun action(action: String)

    /**
     * Additional IAM statements that will be added to the state machine role's policy.
     *
     * Use in the case where the call requires more than a single statement to
     * be executed, e.g. `rekognition:detectLabels` requires also S3 permissions
     * to read the object on which it must act.
     *
     * Default: - no additional statements are added
     *
     * @param additionalIamStatements Additional IAM statements that will be added to the state
     * machine role's policy. 
     */
    public fun additionalIamStatements(additionalIamStatements: List<PolicyStatement>)

    /**
     * Additional IAM statements that will be added to the state machine role's policy.
     *
     * Use in the case where the call requires more than a single statement to
     * be executed, e.g. `rekognition:detectLabels` requires also S3 permissions
     * to read the object on which it must act.
     *
     * Default: - no additional statements are added
     *
     * @param additionalIamStatements Additional IAM statements that will be added to the state
     * machine role's policy. 
     */
    public fun additionalIamStatements(vararg additionalIamStatements: PolicyStatement)

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
    @JvmName("5470082634d6ab2abec7eb9e80e3bebb25a3aa21505af84affa1f442a8f0faea")
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
     * The action for the IAM statement that will be added to the state machine role's policy to
     * allow the state machine to make the API call.
     *
     * Use in the case where the IAM action name does not match with the
     * API service/action name, e.g. `s3:ListBuckets` requires `s3:ListAllMyBuckets`.
     *
     * Default: - service:action
     *
     * @param iamAction The action for the IAM statement that will be added to the state machine
     * role's policy to allow the state machine to make the API call. 
     */
    public fun iamAction(iamAction: String)

    /**
     * The resources for the IAM statement that will be added to the state machine role's policy to
     * allow the state machine to make the API call.
     *
     * By default the action for this IAM statement will be `service:action`.
     *
     * @param iamResources The resources for the IAM statement that will be added to the state
     * machine role's policy to allow the state machine to make the API call. 
     */
    public fun iamResources(iamResources: List<String>)

    /**
     * The resources for the IAM statement that will be added to the state machine role's policy to
     * allow the state machine to make the API call.
     *
     * By default the action for this IAM statement will be `service:action`.
     *
     * @param iamResources The resources for the IAM statement that will be added to the state
     * machine role's policy to allow the state machine to make the API call. 
     */
    public fun iamResources(vararg iamResources: String)

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
     * Parameters for the API action call.
     *
     * Use PascalCase for the parameter names.
     *
     * Default: - no parameters
     *
     * @param parameters Parameters for the API action call. 
     */
    public fun parameters(parameters: Map<String, Any>)

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
     * The AWS service to call.
     *
     * [Documentation](https://docs.aws.amazon.com/step-functions/latest/dg/supported-services-awssdk.html)
     * @param service The AWS service to call. 
     */
    public fun service(service: String)

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
        software.amazon.awscdk.services.stepfunctions.tasks.CallAwsService.Builder =
        software.amazon.awscdk.services.stepfunctions.tasks.CallAwsService.Builder.create(scope, id)

    /**
     * The API action to call.
     *
     * Use camelCase.
     *
     * @param action The API action to call. 
     */
    override fun action(action: String) {
      cdkBuilder.action(action)
    }

    /**
     * Additional IAM statements that will be added to the state machine role's policy.
     *
     * Use in the case where the call requires more than a single statement to
     * be executed, e.g. `rekognition:detectLabels` requires also S3 permissions
     * to read the object on which it must act.
     *
     * Default: - no additional statements are added
     *
     * @param additionalIamStatements Additional IAM statements that will be added to the state
     * machine role's policy. 
     */
    override fun additionalIamStatements(additionalIamStatements: List<PolicyStatement>) {
      cdkBuilder.additionalIamStatements(additionalIamStatements.map(PolicyStatement.Companion::unwrap))
    }

    /**
     * Additional IAM statements that will be added to the state machine role's policy.
     *
     * Use in the case where the call requires more than a single statement to
     * be executed, e.g. `rekognition:detectLabels` requires also S3 permissions
     * to read the object on which it must act.
     *
     * Default: - no additional statements are added
     *
     * @param additionalIamStatements Additional IAM statements that will be added to the state
     * machine role's policy. 
     */
    override fun additionalIamStatements(vararg additionalIamStatements: PolicyStatement): Unit =
        additionalIamStatements(additionalIamStatements.toList())

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
    @JvmName("5470082634d6ab2abec7eb9e80e3bebb25a3aa21505af84affa1f442a8f0faea")
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
     * The action for the IAM statement that will be added to the state machine role's policy to
     * allow the state machine to make the API call.
     *
     * Use in the case where the IAM action name does not match with the
     * API service/action name, e.g. `s3:ListBuckets` requires `s3:ListAllMyBuckets`.
     *
     * Default: - service:action
     *
     * @param iamAction The action for the IAM statement that will be added to the state machine
     * role's policy to allow the state machine to make the API call. 
     */
    override fun iamAction(iamAction: String) {
      cdkBuilder.iamAction(iamAction)
    }

    /**
     * The resources for the IAM statement that will be added to the state machine role's policy to
     * allow the state machine to make the API call.
     *
     * By default the action for this IAM statement will be `service:action`.
     *
     * @param iamResources The resources for the IAM statement that will be added to the state
     * machine role's policy to allow the state machine to make the API call. 
     */
    override fun iamResources(iamResources: List<String>) {
      cdkBuilder.iamResources(iamResources)
    }

    /**
     * The resources for the IAM statement that will be added to the state machine role's policy to
     * allow the state machine to make the API call.
     *
     * By default the action for this IAM statement will be `service:action`.
     *
     * @param iamResources The resources for the IAM statement that will be added to the state
     * machine role's policy to allow the state machine to make the API call. 
     */
    override fun iamResources(vararg iamResources: String): Unit =
        iamResources(iamResources.toList())

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
     * Parameters for the API action call.
     *
     * Use PascalCase for the parameter names.
     *
     * Default: - no parameters
     *
     * @param parameters Parameters for the API action call. 
     */
    override fun parameters(parameters: Map<String, Any>) {
      cdkBuilder.parameters(parameters.mapValues{CdkObjectWrappers.unwrap(it.value)})
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
     * The AWS service to call.
     *
     * [Documentation](https://docs.aws.amazon.com/step-functions/latest/dg/supported-services-awssdk.html)
     * @param service The AWS service to call. 
     */
    override fun service(service: String) {
      cdkBuilder.service(service)
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

    public fun build(): software.amazon.awscdk.services.stepfunctions.tasks.CallAwsService =
        cdkBuilder.build()
  }

  public companion object {
    public fun jsonPath(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      props: CallAwsServiceJsonPathProps,
    ): CallAwsService =
        software.amazon.awscdk.services.stepfunctions.tasks.CallAwsService.jsonPath(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
        id, props.let(CallAwsServiceJsonPathProps.Companion::unwrap)).let(CallAwsService::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fa6fbed273a04bd53adc08f97144627f80f2570a14a44edfd5810988a7bb83be")
    public fun jsonPath(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      props: CallAwsServiceJsonPathProps.Builder.() -> Unit,
    ): CallAwsService = jsonPath(scope, id, CallAwsServiceJsonPathProps(props))

    public fun jsonata(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      props: CallAwsServiceJsonataProps,
    ): CallAwsService =
        software.amazon.awscdk.services.stepfunctions.tasks.CallAwsService.jsonata(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
        id, props.let(CallAwsServiceJsonataProps.Companion::unwrap)).let(CallAwsService::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7655a3a708c917c2c75e3a3a8370276daf07cff4b700a79c036427a385cd3bc1")
    public fun jsonata(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      props: CallAwsServiceJsonataProps.Builder.() -> Unit,
    ): CallAwsService = jsonata(scope, id, CallAwsServiceJsonataProps(props))

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CallAwsService {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CallAwsService(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.CallAwsService):
        CallAwsService = CallAwsService(cdkObject)

    internal fun unwrap(wrapped: CallAwsService):
        software.amazon.awscdk.services.stepfunctions.tasks.CallAwsService = wrapped.cdkObject as
        software.amazon.awscdk.services.stepfunctions.tasks.CallAwsService
  }
}
