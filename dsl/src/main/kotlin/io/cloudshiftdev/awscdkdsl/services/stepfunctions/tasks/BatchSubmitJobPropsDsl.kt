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
import io.cloudshiftdev.awscdkdsl.services.stepfunctions.CredentialsDsl
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
import software.amazon.awscdk.services.stepfunctions.tasks.BatchSubmitJobProps

/**
 * Properties for RunBatchJob.
 *
 * Example:
 * ```
 * import software.amazon.awscdk.services.batch.*;
 * EcsJobDefinition batchJobDefinition;
 * JobQueue batchQueue;
 * BatchSubmitJob task = BatchSubmitJob.Builder.create(this, "Submit Job")
 * .jobDefinitionArn(batchJobDefinition.getJobDefinitionArn())
 * .jobName("MyJob")
 * .jobQueueArn(batchQueue.getJobQueueArn())
 * .build();
 * ```
 */
@CdkDslMarker
public class BatchSubmitJobPropsDsl {
    private val cdkBuilder: BatchSubmitJobProps.Builder = BatchSubmitJobProps.builder()

    private val _dependsOn: MutableList<BatchJobDependency> = mutableListOf()

    /**
     * @param arraySize The array size can be between 2 and 10,000. If you specify array properties
     *   for a job, it becomes an array job. For more information, see Array Jobs in the AWS Batch
     *   User Guide.
     */
    public fun arraySize(arraySize: Number) {
        cdkBuilder.arraySize(arraySize)
    }

    /**
     * @param attempts The number of times to move a job to the RUNNABLE status. You may specify
     *   between 1 and 10 attempts. If the value of attempts is greater than one, the job is retried
     *   on failure the same number of attempts as the value.
     */
    public fun attempts(attempts: Number) {
        cdkBuilder.attempts(attempts)
    }

    /** @param comment An optional description for this state. */
    public fun comment(comment: String) {
        cdkBuilder.comment(comment)
    }

    /**
     * @param containerOverrides A list of container overrides in JSON format that specify the name
     *   of a container in the specified job definition and the overrides it should receive.
     */
    public fun containerOverrides(containerOverrides: BatchContainerOverridesDsl.() -> Unit = {}) {
        val builder = BatchContainerOverridesDsl()
        builder.apply(containerOverrides)
        cdkBuilder.containerOverrides(builder.build())
    }

    /**
     * @param containerOverrides A list of container overrides in JSON format that specify the name
     *   of a container in the specified job definition and the overrides it should receive.
     */
    public fun containerOverrides(containerOverrides: BatchContainerOverrides) {
        cdkBuilder.containerOverrides(containerOverrides)
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
     * @param dependsOn A list of dependencies for the job. A job can depend upon a maximum of 20
     *   jobs.
     */
    public fun dependsOn(dependsOn: BatchJobDependencyDsl.() -> Unit) {
        _dependsOn.add(BatchJobDependencyDsl().apply(dependsOn).build())
    }

    /**
     * @param dependsOn A list of dependencies for the job. A job can depend upon a maximum of 20
     *   jobs.
     */
    public fun dependsOn(dependsOn: Collection<BatchJobDependency>) {
        _dependsOn.addAll(dependsOn)
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

    /** @param jobDefinitionArn The arn of the job definition used by this job. */
    public fun jobDefinitionArn(jobDefinitionArn: String) {
        cdkBuilder.jobDefinitionArn(jobDefinitionArn)
    }

    /**
     * @param jobName The name of the job. The first character must be alphanumeric, and up to 128
     *   letters (uppercase and lowercase), numbers, hyphens, and underscores are allowed.
     */
    public fun jobName(jobName: String) {
        cdkBuilder.jobName(jobName)
    }

    /** @param jobQueueArn The arn of the job queue into which the job is submitted. */
    public fun jobQueueArn(jobQueueArn: String) {
        cdkBuilder.jobQueueArn(jobQueueArn)
    }

    /**
     * @param outputPath JSONPath expression to select select a portion of the state output to pass
     *   to the next state. May also be the special value JsonPath.DISCARD, which will cause the
     *   effective output to be the empty object {}.
     */
    public fun outputPath(outputPath: String) {
        cdkBuilder.outputPath(outputPath)
    }

    /** @param payload The payload to be passed as parameters to the batch job. */
    public fun payload(payload: TaskInput) {
        cdkBuilder.payload(payload)
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

    /** @param stateName Optional name for this state. */
    public fun stateName(stateName: String) {
        cdkBuilder.stateName(stateName)
    }

    /** @param tags The tags applied to the job request. */
    public fun tags(tags: Map<String, String>) {
        cdkBuilder.tags(tags)
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

    public fun build(): BatchSubmitJobProps {
        if (_dependsOn.isNotEmpty()) cdkBuilder.dependsOn(_dependsOn)
        return cdkBuilder.build()
    }
}
