@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions.tasks

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.iam.PolicyStatement
import io.cloudshiftdev.awscdk.services.stepfunctions.Credentials
import io.cloudshiftdev.awscdk.services.stepfunctions.IntegrationPattern
import io.cloudshiftdev.awscdk.services.stepfunctions.TaskStateBase
import io.cloudshiftdev.awscdk.services.stepfunctions.Timeout
import kotlin.Any
import kotlin.Boolean
import kotlin.Deprecated
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * A Step Functions task to call an AWS service API across regions.
 *
 * This task creates a Lambda function to call cross-region AWS API and invokes it.
 *
 * Example:
 *
 * ```
 * Bucket myBucket;
 * CallAwsServiceCrossRegion getObject = CallAwsServiceCrossRegion.Builder.create(this, "GetObject")
 * .region("ap-northeast-1")
 * .service("s3")
 * .action("getObject")
 * .parameters(Map.of(
 * "Bucket", myBucket.getBucketName(),
 * "Key", JsonPath.stringAt("$.key")))
 * .iamResources(List.of(myBucket.arnForObjects("*")))
 * .build();
 * ```
 */
public open class CallAwsServiceCrossRegion(
  cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.CallAwsServiceCrossRegion,
) : TaskStateBase(cdkObject) {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CallAwsServiceCrossRegionProps,
  ) :
      this(software.amazon.awscdk.services.stepfunctions.tasks.CallAwsServiceCrossRegion(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CallAwsServiceCrossRegionProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CallAwsServiceCrossRegionProps.Builder.() -> Unit,
  ) : this(scope, id, CallAwsServiceCrossRegionProps(props)
  )

  /**
   * A fluent builder for
   * [io.cloudshiftdev.awscdk.services.stepfunctions.tasks.CallAwsServiceCrossRegion].
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
     * An optional description for this state.
     *
     * Default: - No comment
     *
     * @param comment An optional description for this state. 
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
    @JvmName("81d03969bd2d756e74a400925760165fdf6fbb56c1788dd79a131a6064f83d9d")
    public fun credentials(credentials: Credentials.Builder.() -> Unit)

    /**
     * The AWS API endpoint.
     *
     * Default: Do not override API endpoint.
     *
     * @param endpoint The AWS API endpoint. 
     */
    public fun endpoint(endpoint: String)

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
     * The action for the IAM statement that will be added to the Lambda function role's policy to
     * allow the state machine to make the API call.
     *
     * By default the action for this IAM statement will be `service:action`.
     *
     * Use in the case where the IAM action name does not match with the
     * API service/action name, e.g. `s3:ListBuckets` requires `s3:ListAllMyBuckets`.
     *
     * Default: - service:action
     *
     * @param iamAction The action for the IAM statement that will be added to the Lambda function
     * role's policy to allow the state machine to make the API call. 
     */
    public fun iamAction(iamAction: String)

    /**
     * The resources for the IAM statement that will be added to the Lambda function role's policy
     * to allow the state machine to make the API call.
     *
     * @param iamResources The resources for the IAM statement that will be added to the Lambda
     * function role's policy to allow the state machine to make the API call. 
     */
    public fun iamResources(iamResources: List<String>)

    /**
     * The resources for the IAM statement that will be added to the Lambda function role's policy
     * to allow the state machine to make the API call.
     *
     * @param iamResources The resources for the IAM statement that will be added to the Lambda
     * function role's policy to allow the state machine to make the API call. 
     */
    public fun iamResources(vararg iamResources: String)

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
     * Parameters for the API action call in AWS SDK for JavaScript v3 format.
     *
     * Default: - no parameters
     *
     * @param parameters Parameters for the API action call in AWS SDK for JavaScript v3 format. 
     */
    public fun parameters(parameters: Map<String, Any>)

    /**
     * The AWS region to call this AWS API for.
     *
     * Example:
     *
     * ```
     * "us-east-1";
     * ```
     *
     * @param region The AWS region to call this AWS API for. 
     */
    public fun region(region: String)

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
     * Whether to retry on the backend Lambda service exceptions.
     *
     * This handles `Lambda.ServiceException`, `Lambda.AWSLambdaException`,
     * `Lambda.SdkClientException`, and `Lambda.ClientExecutionTimeoutException`
     * with an interval of 2 seconds, a back-off rate
     * of 2 and 6 maximum attempts.
     *
     * Default: true
     *
     * [Documentation](https://docs.aws.amazon.com/step-functions/latest/dg/bp-lambda-serviceexception.html)
     * @param retryOnServiceExceptions Whether to retry on the backend Lambda service exceptions. 
     */
    public fun retryOnServiceExceptions(retryOnServiceExceptions: Boolean)

    /**
     * The AWS service to call in AWS SDK for JavaScript v3 format.
     *
     * Example:
     *
     * ```
     * "s3";
     * ```
     *
     * [Documentation](https://docs.aws.amazon.com/AWSJavaScriptSDK/v3/latest/)
     * @param service The AWS service to call in AWS SDK for JavaScript v3 format. 
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
        software.amazon.awscdk.services.stepfunctions.tasks.CallAwsServiceCrossRegion.Builder =
        software.amazon.awscdk.services.stepfunctions.tasks.CallAwsServiceCrossRegion.Builder.create(scope,
        id)

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
    @JvmName("81d03969bd2d756e74a400925760165fdf6fbb56c1788dd79a131a6064f83d9d")
    override fun credentials(credentials: Credentials.Builder.() -> Unit): Unit =
        credentials(Credentials(credentials))

    /**
     * The AWS API endpoint.
     *
     * Default: Do not override API endpoint.
     *
     * @param endpoint The AWS API endpoint. 
     */
    override fun endpoint(endpoint: String) {
      cdkBuilder.endpoint(endpoint)
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
     * The action for the IAM statement that will be added to the Lambda function role's policy to
     * allow the state machine to make the API call.
     *
     * By default the action for this IAM statement will be `service:action`.
     *
     * Use in the case where the IAM action name does not match with the
     * API service/action name, e.g. `s3:ListBuckets` requires `s3:ListAllMyBuckets`.
     *
     * Default: - service:action
     *
     * @param iamAction The action for the IAM statement that will be added to the Lambda function
     * role's policy to allow the state machine to make the API call. 
     */
    override fun iamAction(iamAction: String) {
      cdkBuilder.iamAction(iamAction)
    }

    /**
     * The resources for the IAM statement that will be added to the Lambda function role's policy
     * to allow the state machine to make the API call.
     *
     * @param iamResources The resources for the IAM statement that will be added to the Lambda
     * function role's policy to allow the state machine to make the API call. 
     */
    override fun iamResources(iamResources: List<String>) {
      cdkBuilder.iamResources(iamResources)
    }

    /**
     * The resources for the IAM statement that will be added to the Lambda function role's policy
     * to allow the state machine to make the API call.
     *
     * @param iamResources The resources for the IAM statement that will be added to the Lambda
     * function role's policy to allow the state machine to make the API call. 
     */
    override fun iamResources(vararg iamResources: String): Unit =
        iamResources(iamResources.toList())

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
      cdkBuilder.integrationPattern(integrationPattern.let(IntegrationPattern.Companion::unwrap))
    }

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
     * Parameters for the API action call in AWS SDK for JavaScript v3 format.
     *
     * Default: - no parameters
     *
     * @param parameters Parameters for the API action call in AWS SDK for JavaScript v3 format. 
     */
    override fun parameters(parameters: Map<String, Any>) {
      cdkBuilder.parameters(parameters.mapValues{CdkObjectWrappers.unwrap(it.value)})
    }

    /**
     * The AWS region to call this AWS API for.
     *
     * Example:
     *
     * ```
     * "us-east-1";
     * ```
     *
     * @param region The AWS region to call this AWS API for. 
     */
    override fun region(region: String) {
      cdkBuilder.region(region)
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
      cdkBuilder.resultSelector(resultSelector.mapValues{CdkObjectWrappers.unwrap(it.value)})
    }

    /**
     * Whether to retry on the backend Lambda service exceptions.
     *
     * This handles `Lambda.ServiceException`, `Lambda.AWSLambdaException`,
     * `Lambda.SdkClientException`, and `Lambda.ClientExecutionTimeoutException`
     * with an interval of 2 seconds, a back-off rate
     * of 2 and 6 maximum attempts.
     *
     * Default: true
     *
     * [Documentation](https://docs.aws.amazon.com/step-functions/latest/dg/bp-lambda-serviceexception.html)
     * @param retryOnServiceExceptions Whether to retry on the backend Lambda service exceptions. 
     */
    override fun retryOnServiceExceptions(retryOnServiceExceptions: Boolean) {
      cdkBuilder.retryOnServiceExceptions(retryOnServiceExceptions)
    }

    /**
     * The AWS service to call in AWS SDK for JavaScript v3 format.
     *
     * Example:
     *
     * ```
     * "s3";
     * ```
     *
     * [Documentation](https://docs.aws.amazon.com/AWSJavaScriptSDK/v3/latest/)
     * @param service The AWS service to call in AWS SDK for JavaScript v3 format. 
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

    public fun build():
        software.amazon.awscdk.services.stepfunctions.tasks.CallAwsServiceCrossRegion =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CallAwsServiceCrossRegion {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CallAwsServiceCrossRegion(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.CallAwsServiceCrossRegion):
        CallAwsServiceCrossRegion = CallAwsServiceCrossRegion(cdkObject)

    internal fun unwrap(wrapped: CallAwsServiceCrossRegion):
        software.amazon.awscdk.services.stepfunctions.tasks.CallAwsServiceCrossRegion =
        wrapped.cdkObject as
        software.amazon.awscdk.services.stepfunctions.tasks.CallAwsServiceCrossRegion
  }
}
