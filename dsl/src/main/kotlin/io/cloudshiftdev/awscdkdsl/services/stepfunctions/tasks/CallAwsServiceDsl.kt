@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.stepfunctions.tasks

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import io.cloudshiftdev.awscdkdsl.common.MapBuilder
import io.cloudshiftdev.awscdkdsl.services.iam.PolicyStatementDsl
import io.cloudshiftdev.awscdkdsl.services.stepfunctions.CredentialsDsl
import kotlin.Any
import kotlin.Deprecated
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.iam.PolicyStatement
import software.amazon.awscdk.services.stepfunctions.Credentials
import software.amazon.awscdk.services.stepfunctions.IntegrationPattern
import software.amazon.awscdk.services.stepfunctions.Timeout
import software.amazon.awscdk.services.stepfunctions.tasks.CallAwsService
import software.constructs.Construct

/**
 * A StepFunctions task to call an AWS service API.
 *
 * Example:
 * ```
 * CallAwsService detectLabels = CallAwsService.Builder.create(this, "DetectLabels")
 * .service("rekognition")
 * .action("detectLabels")
 * .iamResources(List.of("*"))
 * .additionalIamStatements(List.of(
 * PolicyStatement.Builder.create()
 * .actions(List.of("s3:getObject"))
 * .resources(List.of("arn:aws:s3:::my-bucket/ *"))
 * .build()))
 * .build();
 * ```
 */
@CdkDslMarker
public class CallAwsServiceDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CallAwsService.Builder = CallAwsService.Builder.create(scope, id)

    private val _additionalIamStatements: MutableList<PolicyStatement> = mutableListOf()

    private val _iamResources: MutableList<String> = mutableListOf()

    /**
     * The API action to call.
     *
     * Use camelCase.
     *
     * @param action The API action to call.
     */
    public fun action(action: String) {
        cdkBuilder.action(action)
    }

    /**
     * Additional IAM statements that will be added to the state machine role's policy.
     *
     * Use in the case where the call requires more than a single statement to be executed, e.g.
     * `rekognition:detectLabels` requires also S3 permissions to read the object on which it must
     * act.
     *
     * Default: - no additional statements are added
     *
     * @param additionalIamStatements Additional IAM statements that will be added to the state
     *   machine role's policy.
     */
    public fun additionalIamStatements(additionalIamStatements: PolicyStatementDsl.() -> Unit) {
        _additionalIamStatements.add(PolicyStatementDsl().apply(additionalIamStatements).build())
    }

    /**
     * Additional IAM statements that will be added to the state machine role's policy.
     *
     * Use in the case where the call requires more than a single statement to be executed, e.g.
     * `rekognition:detectLabels` requires also S3 permissions to read the object on which it must
     * act.
     *
     * Default: - no additional statements are added
     *
     * @param additionalIamStatements Additional IAM statements that will be added to the state
     *   machine role's policy.
     */
    public fun additionalIamStatements(additionalIamStatements: Collection<PolicyStatement>) {
        _additionalIamStatements.addAll(additionalIamStatements)
    }

    /**
     * An optional description for this state.
     *
     * Default: - No comment
     *
     * @param comment An optional description for this state.
     */
    public fun comment(comment: String) {
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
     *
     * @param credentials Credentials for an IAM Role that the State Machine assumes for executing
     *   the task.
     */
    public fun credentials(credentials: CredentialsDsl.() -> Unit = {}) {
        val builder = CredentialsDsl()
        builder.apply(credentials)
        cdkBuilder.credentials(builder.build())
    }

    /**
     * Credentials for an IAM Role that the State Machine assumes for executing the task.
     *
     * This enables cross-account resource invocations.
     *
     * Default: - None (Task is executed using the State Machine's execution role)
     *
     * [Documentation](https://docs.aws.amazon.com/step-functions/latest/dg/concepts-access-cross-acct-resources.html)
     *
     * @param credentials Credentials for an IAM Role that the State Machine assumes for executing
     *   the task.
     */
    public fun credentials(credentials: Credentials) {
        cdkBuilder.credentials(credentials)
    }

    /**
     * (deprecated) Timeout for the heartbeat.
     *
     * Default: - None
     *
     * @param heartbeat Timeout for the heartbeat.
     * @deprecated use `heartbeatTimeout`
     */
    @Deprecated(message = "deprecated in CDK")
    public fun heartbeat(heartbeat: Duration) {
        cdkBuilder.heartbeat(heartbeat)
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
    public fun heartbeatTimeout(heartbeatTimeout: Timeout) {
        cdkBuilder.heartbeatTimeout(heartbeatTimeout)
    }

    /**
     * The action for the IAM statement that will be added to the state machine role's policy to
     * allow the state machine to make the API call.
     *
     * Use in the case where the IAM action name does not match with the API service/action name,
     * e.g. `s3:ListBuckets` requires `s3:ListAllMyBuckets`.
     *
     * Default: - service:action
     *
     * @param iamAction The action for the IAM statement that will be added to the state machine
     *   role's policy to allow the state machine to make the API call.
     */
    public fun iamAction(iamAction: String) {
        cdkBuilder.iamAction(iamAction)
    }

    /**
     * The resources for the IAM statement that will be added to the state machine role's policy to
     * allow the state machine to make the API call.
     *
     * By default the action for this IAM statement will be `service:action`.
     *
     * @param iamResources The resources for the IAM statement that will be added to the state
     *   machine role's policy to allow the state machine to make the API call.
     */
    public fun iamResources(vararg iamResources: String) {
        _iamResources.addAll(listOf(*iamResources))
    }

    /**
     * The resources for the IAM statement that will be added to the state machine role's policy to
     * allow the state machine to make the API call.
     *
     * By default the action for this IAM statement will be `service:action`.
     *
     * @param iamResources The resources for the IAM statement that will be added to the state
     *   machine role's policy to allow the state machine to make the API call.
     */
    public fun iamResources(iamResources: Collection<String>) {
        _iamResources.addAll(iamResources)
    }

    /**
     * JSONPath expression to select part of the state to be the input to this state.
     *
     * May also be the special value JsonPath.DISCARD, which will cause the effective input to be
     * the empty object {}.
     *
     * Default: - The entire task input (JSON path '$')
     *
     * @param inputPath JSONPath expression to select part of the state to be the input to this
     *   state.
     */
    public fun inputPath(inputPath: String) {
        cdkBuilder.inputPath(inputPath)
    }

    /**
     * AWS Step Functions integrates with services directly in the Amazon States Language.
     *
     * You can control these AWS services using service integration patterns
     *
     * Default: - `IntegrationPattern.REQUEST_RESPONSE` for most tasks. `IntegrationPattern.RUN_JOB`
     * for the following exceptions: `BatchSubmitJob`, `EmrAddStep`, `EmrCreateCluster`,
     * `EmrTerminationCluster`, and `EmrContainersStartJobRun`.
     *
     * [Documentation](https://docs.aws.amazon.com/step-functions/latest/dg/connect-to-resource.html#connect-wait-token)
     *
     * @param integrationPattern AWS Step Functions integrates with services directly in the Amazon
     *   States Language.
     */
    public fun integrationPattern(integrationPattern: IntegrationPattern) {
        cdkBuilder.integrationPattern(integrationPattern)
    }

    /**
     * JSONPath expression to select select a portion of the state output to pass to the next state.
     *
     * May also be the special value JsonPath.DISCARD, which will cause the effective output to be
     * the empty object {}.
     *
     * Default: - The entire JSON node determined by the state input, the task result, and
     * resultPath is passed to the next state (JSON path '$')
     *
     * @param outputPath JSONPath expression to select select a portion of the state output to pass
     *   to the next state.
     */
    public fun outputPath(outputPath: String) {
        cdkBuilder.outputPath(outputPath)
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
    public fun parameters(parameters: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(parameters)
        cdkBuilder.parameters(builder.map)
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
    public fun parameters(parameters: Map<String, Any>) {
        cdkBuilder.parameters(parameters)
    }

    /**
     * JSONPath expression to indicate where to inject the state's output.
     *
     * May also be the special value JsonPath.DISCARD, which will cause the state's input to become
     * its output.
     *
     * Default: - Replaces the entire input with the result (JSON path '$')
     *
     * @param resultPath JSONPath expression to indicate where to inject the state's output.
     */
    public fun resultPath(resultPath: String) {
        cdkBuilder.resultPath(resultPath)
    }

    /**
     * The JSON that will replace the state's raw result and become the effective result before
     * ResultPath is applied.
     *
     * You can use ResultSelector to create a payload with values that are static or selected from
     * the state's raw result.
     *
     * Default: - None
     *
     * [Documentation](https://docs.aws.amazon.com/step-functions/latest/dg/input-output-inputpath-params.html#input-output-resultselector)
     *
     * @param resultSelector The JSON that will replace the state's raw result and become the
     *   effective result before ResultPath is applied.
     */
    public fun resultSelector(resultSelector: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(resultSelector)
        cdkBuilder.resultSelector(builder.map)
    }

    /**
     * The JSON that will replace the state's raw result and become the effective result before
     * ResultPath is applied.
     *
     * You can use ResultSelector to create a payload with values that are static or selected from
     * the state's raw result.
     *
     * Default: - None
     *
     * [Documentation](https://docs.aws.amazon.com/step-functions/latest/dg/input-output-inputpath-params.html#input-output-resultselector)
     *
     * @param resultSelector The JSON that will replace the state's raw result and become the
     *   effective result before ResultPath is applied.
     */
    public fun resultSelector(resultSelector: Map<String, Any>) {
        cdkBuilder.resultSelector(resultSelector)
    }

    /**
     * The AWS service to call.
     *
     * [Documentation](https://docs.aws.amazon.com/step-functions/latest/dg/supported-services-awssdk.html)
     *
     * @param service The AWS service to call.
     */
    public fun service(service: String) {
        cdkBuilder.service(service)
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
    public fun taskTimeout(taskTimeout: Timeout) {
        cdkBuilder.taskTimeout(taskTimeout)
    }

    /**
     * (deprecated) Timeout for the task.
     *
     * Default: - None
     *
     * @param timeout Timeout for the task.
     * @deprecated use `taskTimeout`
     */
    @Deprecated(message = "deprecated in CDK")
    public fun timeout(timeout: Duration) {
        cdkBuilder.timeout(timeout)
    }

    public fun build(): CallAwsService {
        if (_additionalIamStatements.isNotEmpty())
            cdkBuilder.additionalIamStatements(_additionalIamStatements)
        if (_iamResources.isNotEmpty()) cdkBuilder.iamResources(_iamResources)
        return cdkBuilder.build()
    }
}
