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

package cloudshift.awscdk.dsl.services.stepfunctions.tasks

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import cloudshift.awscdk.dsl.services.stepfunctions.CredentialsDsl
import kotlin.Any
import kotlin.Deprecated
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.stepfunctions.Credentials
import software.amazon.awscdk.services.stepfunctions.IntegrationPattern
import software.amazon.awscdk.services.stepfunctions.TaskInput
import software.amazon.awscdk.services.stepfunctions.Timeout
import software.amazon.awscdk.services.stepfunctions.tasks.BatchContainerOverrides
import software.amazon.awscdk.services.stepfunctions.tasks.BatchJobDependency
import software.amazon.awscdk.services.stepfunctions.tasks.BatchSubmitJob
import software.constructs.Construct

/**
 * Task to submits an AWS Batch job from a job definition.
 *
 * Example:
 * ```
 * import software.amazon.awscdk.services.batch.alpha.*;
 * EcsJobDefinition batchJobDefinition;
 * JobQueue batchQueue;
 * BatchSubmitJob task = BatchSubmitJob.Builder.create(this, "Submit Job")
 * .jobDefinitionArn(batchJobDefinition.getJobDefinitionArn())
 * .jobName("MyJob")
 * .jobQueueArn(batchQueue.getJobQueueArn())
 * .build();
 * ```
 *
 * [Documentation](https://docs.aws.amazon.com/step-functions/latest/dg/connect-batch.html)
 */
@CdkDslMarker
public class BatchSubmitJobDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: BatchSubmitJob.Builder = BatchSubmitJob.Builder.create(scope, id)

    private val _dependsOn: MutableList<BatchJobDependency> = mutableListOf()

    /**
     * The array size can be between 2 and 10,000.
     *
     * If you specify array properties for a job, it becomes an array job. For more information, see
     * Array Jobs in the AWS Batch User Guide.
     *
     * Default: - No array size
     *
     * @param arraySize The array size can be between 2 and 10,000.
     */
    public fun arraySize(arraySize: Number) {
        cdkBuilder.arraySize(arraySize)
    }

    /**
     * The number of times to move a job to the RUNNABLE status.
     *
     * You may specify between 1 and 10 attempts. If the value of attempts is greater than one, the
     * job is retried on failure the same number of attempts as the value.
     *
     * Default: 1
     *
     * @param attempts The number of times to move a job to the RUNNABLE status.
     */
    public fun attempts(attempts: Number) {
        cdkBuilder.attempts(attempts)
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
     * A list of container overrides in JSON format that specify the name of a container in the
     * specified job definition and the overrides it should receive.
     *
     * Default: - No container overrides
     *
     * [Documentation](https://docs.aws.amazon.com/batch/latest/APIReference/API_SubmitJob.html#Batch-SubmitJob-request-containerOverrides)
     *
     * @param containerOverrides A list of container overrides in JSON format that specify the name
     *   of a container in the specified job definition and the overrides it should receive.
     */
    public fun containerOverrides(containerOverrides: BatchContainerOverridesDsl.() -> Unit = {}) {
        val builder = BatchContainerOverridesDsl()
        builder.apply(containerOverrides)
        cdkBuilder.containerOverrides(builder.build())
    }

    /**
     * A list of container overrides in JSON format that specify the name of a container in the
     * specified job definition and the overrides it should receive.
     *
     * Default: - No container overrides
     *
     * [Documentation](https://docs.aws.amazon.com/batch/latest/APIReference/API_SubmitJob.html#Batch-SubmitJob-request-containerOverrides)
     *
     * @param containerOverrides A list of container overrides in JSON format that specify the name
     *   of a container in the specified job definition and the overrides it should receive.
     */
    public fun containerOverrides(containerOverrides: BatchContainerOverrides) {
        cdkBuilder.containerOverrides(containerOverrides)
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
     * A list of dependencies for the job.
     *
     * A job can depend upon a maximum of 20 jobs.
     *
     * Default: - No dependencies
     *
     * [Documentation](https://docs.aws.amazon.com/batch/latest/APIReference/API_SubmitJob.html#Batch-SubmitJob-request-dependsOn)
     *
     * @param dependsOn A list of dependencies for the job.
     */
    public fun dependsOn(dependsOn: BatchJobDependencyDsl.() -> Unit) {
        _dependsOn.add(BatchJobDependencyDsl().apply(dependsOn).build())
    }

    /**
     * A list of dependencies for the job.
     *
     * A job can depend upon a maximum of 20 jobs.
     *
     * Default: - No dependencies
     *
     * [Documentation](https://docs.aws.amazon.com/batch/latest/APIReference/API_SubmitJob.html#Batch-SubmitJob-request-dependsOn)
     *
     * @param dependsOn A list of dependencies for the job.
     */
    public fun dependsOn(dependsOn: Collection<BatchJobDependency>) {
        _dependsOn.addAll(dependsOn)
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
     * The arn of the job definition used by this job.
     *
     * @param jobDefinitionArn The arn of the job definition used by this job.
     */
    public fun jobDefinitionArn(jobDefinitionArn: String) {
        cdkBuilder.jobDefinitionArn(jobDefinitionArn)
    }

    /**
     * The name of the job.
     *
     * The first character must be alphanumeric, and up to 128 letters (uppercase and lowercase),
     * numbers, hyphens, and underscores are allowed.
     *
     * @param jobName The name of the job.
     */
    public fun jobName(jobName: String) {
        cdkBuilder.jobName(jobName)
    }

    /**
     * The arn of the job queue into which the job is submitted.
     *
     * @param jobQueueArn The arn of the job queue into which the job is submitted.
     */
    public fun jobQueueArn(jobQueueArn: String) {
        cdkBuilder.jobQueueArn(jobQueueArn)
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
     * The payload to be passed as parameters to the batch job.
     *
     * Default: - No parameters are passed
     *
     * @param payload The payload to be passed as parameters to the batch job.
     */
    public fun payload(payload: TaskInput) {
        cdkBuilder.payload(payload)
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
     * The tags applied to the job request.
     *
     * Default: {} - no tags
     *
     * @param tags The tags applied to the job request.
     */
    public fun tags(tags: Map<String, String>) {
        cdkBuilder.tags(tags)
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

    public fun build(): BatchSubmitJob {
        if (_dependsOn.isNotEmpty()) cdkBuilder.dependsOn(_dependsOn)
        return cdkBuilder.build()
    }
}
