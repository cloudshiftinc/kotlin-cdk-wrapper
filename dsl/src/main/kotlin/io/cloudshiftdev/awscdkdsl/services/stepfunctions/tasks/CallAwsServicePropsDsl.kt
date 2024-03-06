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
import software.amazon.awscdk.services.stepfunctions.tasks.CallAwsServiceProps

/**
 * Properties for calling an AWS service's API action from your state machine.
 *
 * Example:
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
 *
 * [Documentation](https://docs.aws.amazon.com/step-functions/latest/dg/supported-services-awssdk.html)
 */
@CdkDslMarker
public class CallAwsServicePropsDsl {
    private val cdkBuilder: CallAwsServiceProps.Builder = CallAwsServiceProps.builder()

    private val _additionalIamStatements: MutableList<PolicyStatement> = mutableListOf()

    private val _iamResources: MutableList<String> = mutableListOf()

    /** @param action The API action to call. Use camelCase. */
    public fun action(action: String) {
        cdkBuilder.action(action)
    }

    /**
     * @param additionalIamStatements Additional IAM statements that will be added to the state
     *   machine role's policy. Use in the case where the call requires more than a single statement
     *   to be executed, e.g. `rekognition:detectLabels` requires also S3 permissions to read the
     *   object on which it must act.
     */
    public fun additionalIamStatements(additionalIamStatements: PolicyStatementDsl.() -> Unit) {
        _additionalIamStatements.add(PolicyStatementDsl().apply(additionalIamStatements).build())
    }

    /**
     * @param additionalIamStatements Additional IAM statements that will be added to the state
     *   machine role's policy. Use in the case where the call requires more than a single statement
     *   to be executed, e.g. `rekognition:detectLabels` requires also S3 permissions to read the
     *   object on which it must act.
     */
    public fun additionalIamStatements(additionalIamStatements: Collection<PolicyStatement>) {
        _additionalIamStatements.addAll(additionalIamStatements)
    }

    /** @param comment An optional description for this state. */
    public fun comment(comment: String) {
        cdkBuilder.comment(comment)
    }

    /**
     * @param credentials Credentials for an IAM Role that the State Machine assumes for executing
     *   the task. This enables cross-account resource invocations.
     */
    public fun credentials(credentials: CredentialsDsl.() -> Unit = {}) {
        val builder = CredentialsDsl()
        builder.apply(credentials)
        cdkBuilder.credentials(builder.build())
    }

    /**
     * @param credentials Credentials for an IAM Role that the State Machine assumes for executing
     *   the task. This enables cross-account resource invocations.
     */
    public fun credentials(credentials: Credentials) {
        cdkBuilder.credentials(credentials)
    }

    /**
     * @param heartbeat Timeout for the heartbeat.
     * @deprecated use `heartbeatTimeout`
     */
    @Deprecated(message = "deprecated in CDK")
    public fun heartbeat(heartbeat: Duration) {
        cdkBuilder.heartbeat(heartbeat)
    }

    /**
     * @param heartbeatTimeout Timeout for the heartbeat. [disable-awslint:duration-prop-type] is
     *   needed because all props interface in aws-stepfunctions-tasks extend this interface
     */
    public fun heartbeatTimeout(heartbeatTimeout: Timeout) {
        cdkBuilder.heartbeatTimeout(heartbeatTimeout)
    }

    /**
     * @param iamAction The action for the IAM statement that will be added to the state machine
     *   role's policy to allow the state machine to make the API call. Use in the case where the
     *   IAM action name does not match with the API service/action name, e.g. `s3:ListBuckets`
     *   requires `s3:ListAllMyBuckets`.
     */
    public fun iamAction(iamAction: String) {
        cdkBuilder.iamAction(iamAction)
    }

    /**
     * @param iamResources The resources for the IAM statement that will be added to the state
     *   machine role's policy to allow the state machine to make the API call. By default the
     *   action for this IAM statement will be `service:action`.
     */
    public fun iamResources(vararg iamResources: String) {
        _iamResources.addAll(listOf(*iamResources))
    }

    /**
     * @param iamResources The resources for the IAM statement that will be added to the state
     *   machine role's policy to allow the state machine to make the API call. By default the
     *   action for this IAM statement will be `service:action`.
     */
    public fun iamResources(iamResources: Collection<String>) {
        _iamResources.addAll(iamResources)
    }

    /**
     * @param inputPath JSONPath expression to select part of the state to be the input to this
     *   state. May also be the special value JsonPath.DISCARD, which will cause the effective input
     *   to be the empty object {}.
     */
    public fun inputPath(inputPath: String) {
        cdkBuilder.inputPath(inputPath)
    }

    /**
     * @param integrationPattern AWS Step Functions integrates with services directly in the Amazon
     *   States Language. You can control these AWS services using service integration patterns.
     *
     * Depending on the AWS Service, the Service Integration Pattern availability will vary.
     */
    public fun integrationPattern(integrationPattern: IntegrationPattern) {
        cdkBuilder.integrationPattern(integrationPattern)
    }

    /**
     * @param outputPath JSONPath expression to select select a portion of the state output to pass
     *   to the next state. May also be the special value JsonPath.DISCARD, which will cause the
     *   effective output to be the empty object {}.
     */
    public fun outputPath(outputPath: String) {
        cdkBuilder.outputPath(outputPath)
    }

    /**
     * @param parameters Parameters for the API action call. Use PascalCase for the parameter names.
     */
    public fun parameters(parameters: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(parameters)
        cdkBuilder.parameters(builder.map)
    }

    /**
     * @param parameters Parameters for the API action call. Use PascalCase for the parameter names.
     */
    public fun parameters(parameters: Map<String, Any>) {
        cdkBuilder.parameters(parameters)
    }

    /**
     * @param resultPath JSONPath expression to indicate where to inject the state's output. May
     *   also be the special value JsonPath.DISCARD, which will cause the state's input to become
     *   its output.
     */
    public fun resultPath(resultPath: String) {
        cdkBuilder.resultPath(resultPath)
    }

    /**
     * @param resultSelector The JSON that will replace the state's raw result and become the
     *   effective result before ResultPath is applied. You can use ResultSelector to create a
     *   payload with values that are static or selected from the state's raw result.
     */
    public fun resultSelector(resultSelector: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(resultSelector)
        cdkBuilder.resultSelector(builder.map)
    }

    /**
     * @param resultSelector The JSON that will replace the state's raw result and become the
     *   effective result before ResultPath is applied. You can use ResultSelector to create a
     *   payload with values that are static or selected from the state's raw result.
     */
    public fun resultSelector(resultSelector: Map<String, Any>) {
        cdkBuilder.resultSelector(resultSelector)
    }

    /** @param service The AWS service to call. */
    public fun service(service: String) {
        cdkBuilder.service(service)
    }

    /** @param stateName Optional name for this state. */
    public fun stateName(stateName: String) {
        cdkBuilder.stateName(stateName)
    }

    /**
     * @param taskTimeout Timeout for the task. [disable-awslint:duration-prop-type] is needed
     *   because all props interface in aws-stepfunctions-tasks extend this interface
     */
    public fun taskTimeout(taskTimeout: Timeout) {
        cdkBuilder.taskTimeout(taskTimeout)
    }

    /**
     * @param timeout Timeout for the task.
     * @deprecated use `taskTimeout`
     */
    @Deprecated(message = "deprecated in CDK")
    public fun timeout(timeout: Duration) {
        cdkBuilder.timeout(timeout)
    }

    public fun build(): CallAwsServiceProps {
        if (_additionalIamStatements.isNotEmpty())
            cdkBuilder.additionalIamStatements(_additionalIamStatements)
        if (_iamResources.isNotEmpty()) cdkBuilder.iamResources(_iamResources)
        return cdkBuilder.build()
    }
}
