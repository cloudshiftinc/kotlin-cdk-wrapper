package io.cloudshiftdev.awscdk.services.stepfunctions.tasks

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.stepfunctions.Credentials
import io.cloudshiftdev.awscdk.services.stepfunctions.IntegrationPattern
import io.cloudshiftdev.awscdk.services.stepfunctions.TaskInput
import io.cloudshiftdev.awscdk.services.stepfunctions.TaskStateBase
import io.cloudshiftdev.awscdk.services.stepfunctions.Timeout
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import kotlin.Any
import kotlin.Deprecated
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName
import software.constructs.Construct as SoftwareConstructsConstruct

public open class BatchSubmitJob
internal constructor(
    private val cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.BatchSubmitJob,
) : TaskStateBase(cdkObject) {
    /**
     * A fluent builder for [io.cloudshiftdev.awscdk.services.stepfunctions.tasks.BatchSubmitJob].
     */
    @CdkDslMarker
    public interface Builder {
        /**
         * The array size can be between 2 and 10,000.
         *
         * If you specify array properties for a job, it becomes an array job. For more information,
         * see Array Jobs in the AWS Batch User Guide.
         *
         * Default: - No array size
         *
         * @param arraySize The array size can be between 2 and 10,000.
         */
        public fun arraySize(arraySize: Number)

        /**
         * The number of times to move a job to the RUNNABLE status.
         *
         * You may specify between 1 and 10 attempts. If the value of attempts is greater than one,
         * the job is retried on failure the same number of attempts as the value.
         *
         * Default: 1
         *
         * @param attempts The number of times to move a job to the RUNNABLE status.
         */
        public fun attempts(attempts: Number)

        /**
         * An optional description for this state.
         *
         * Default: - No comment
         *
         * @param comment An optional description for this state.
         */
        public fun comment(comment: String)

        /**
         * A list of container overrides in JSON format that specify the name of a container in the
         * specified job definition and the overrides it should receive.
         *
         * Default: - No container overrides
         *
         * [Documentation](https://docs.aws.amazon.com/batch/latest/APIReference/API_SubmitJob.html#Batch-SubmitJob-request-containerOverrides)
         *
         * @param containerOverrides A list of container overrides in JSON format that specify the
         *   name of a container in the specified job definition and the overrides it should
         *   receive.
         */
        public fun containerOverrides(containerOverrides: BatchContainerOverrides)

        /**
         * A list of container overrides in JSON format that specify the name of a container in the
         * specified job definition and the overrides it should receive.
         *
         * Default: - No container overrides
         *
         * [Documentation](https://docs.aws.amazon.com/batch/latest/APIReference/API_SubmitJob.html#Batch-SubmitJob-request-containerOverrides)
         *
         * @param containerOverrides A list of container overrides in JSON format that specify the
         *   name of a container in the specified job definition and the overrides it should
         *   receive.
         */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("4142fe7dbfe5d527b3aec64eb7d84fa5e491d633c66db9920410796569222b08")
        public fun containerOverrides(
            containerOverrides: BatchContainerOverrides.Builder.() -> Unit
        )

        /**
         * Credentials for an IAM Role that the State Machine assumes for executing the task.
         *
         * This enables cross-account resource invocations.
         *
         * Default: - None (Task is executed using the State Machine's execution role)
         *
         * [Documentation](https://docs.aws.amazon.com/step-functions/latest/dg/concepts-access-cross-acct-resources.html)
         *
         * @param credentials Credentials for an IAM Role that the State Machine assumes for
         *   executing the task.
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
         *
         * @param credentials Credentials for an IAM Role that the State Machine assumes for
         *   executing the task.
         */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("a196e00fc0f536f730d2f9615c57b501ba9e0ffd237790f513e9cfd9d2c6aa08")
        public fun credentials(credentials: Credentials.Builder.() -> Unit)

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
        public fun dependsOn(dependsOn: List<BatchJobDependency>)

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
        public fun dependsOn(vararg dependsOn: BatchJobDependency)

        /**
         * (deprecated) Timeout for the heartbeat.
         *
         * Default: - None
         *
         * @param heartbeat Timeout for the heartbeat.
         * @deprecated use `heartbeatTimeout`
         */
        @Deprecated(message = "deprecated in CDK") public fun heartbeat(heartbeat: Duration)

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
         * May also be the special value JsonPath.DISCARD, which will cause the effective input to
         * be the empty object {}.
         *
         * Default: - The entire task input (JSON path '$')
         *
         * @param inputPath JSONPath expression to select part of the state to be the input to this
         *   state.
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
         * `IntegrationPattern.RUN_JOB` for the following exceptions: `BatchSubmitJob`,
         * `EmrAddStep`, `EmrCreateCluster`, `EmrTerminationCluster`, and
         * `EmrContainersStartJobRun`.
         *
         * [Documentation](https://docs.aws.amazon.com/step-functions/latest/dg/connect-supported-services.html)
         *
         * @param integrationPattern AWS Step Functions integrates with services directly in the
         *   Amazon States Language.
         */
        public fun integrationPattern(integrationPattern: IntegrationPattern)

        /**
         * The arn of the job definition used by this job.
         *
         * @param jobDefinitionArn The arn of the job definition used by this job.
         */
        public fun jobDefinitionArn(jobDefinitionArn: String)

        /**
         * The name of the job.
         *
         * The first character must be alphanumeric, and up to 128 letters (uppercase and
         * lowercase), numbers, hyphens, and underscores are allowed.
         *
         * @param jobName The name of the job.
         */
        public fun jobName(jobName: String)

        /**
         * The arn of the job queue into which the job is submitted.
         *
         * @param jobQueueArn The arn of the job queue into which the job is submitted.
         */
        public fun jobQueueArn(jobQueueArn: String)

        /**
         * JSONPath expression to select select a portion of the state output to pass to the next
         * state.
         *
         * May also be the special value JsonPath.DISCARD, which will cause the effective output to
         * be the empty object {}.
         *
         * Default: - The entire JSON node determined by the state input, the task result, and
         * resultPath is passed to the next state (JSON path '$')
         *
         * @param outputPath JSONPath expression to select select a portion of the state output to
         *   pass to the next state.
         */
        public fun outputPath(outputPath: String)

        /**
         * The payload to be passed as parameters to the batch job.
         *
         * Default: - No parameters are passed
         *
         * @param payload The payload to be passed as parameters to the batch job.
         */
        public fun payload(payload: TaskInput)

        /**
         * JSONPath expression to indicate where to inject the state's output.
         *
         * May also be the special value JsonPath.DISCARD, which will cause the state's input to
         * become its output.
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
         * You can use ResultSelector to create a payload with values that are static or selected
         * from the state's raw result.
         *
         * Default: - None
         *
         * [Documentation](https://docs.aws.amazon.com/step-functions/latest/dg/input-output-inputpath-params.html#input-output-resultselector)
         *
         * @param resultSelector The JSON that will replace the state's raw result and become the
         *   effective result before ResultPath is applied.
         */
        public fun resultSelector(resultSelector: Map<String, Any>)

        /**
         * Optional name for this state.
         *
         * Default: - The construct ID will be used as state name
         *
         * @param stateName Optional name for this state.
         */
        public fun stateName(stateName: String)

        /**
         * The tags applied to the job request.
         *
         * Default: {} - no tags
         *
         * @param tags The tags applied to the job request.
         */
        public fun tags(tags: Map<String, String>)

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
         * @param timeout Timeout for the task.
         * @deprecated use `taskTimeout`
         */
        @Deprecated(message = "deprecated in CDK") public fun timeout(timeout: Duration)
    }

    private class BuilderImpl(
        scope: SoftwareConstructsConstruct,
        id: String,
    ) : Builder {
        private val cdkBuilder:
            software.amazon.awscdk.services.stepfunctions.tasks.BatchSubmitJob.Builder =
            software.amazon.awscdk.services.stepfunctions.tasks.BatchSubmitJob.Builder.create(
                scope,
                id
            )

        /**
         * The array size can be between 2 and 10,000.
         *
         * If you specify array properties for a job, it becomes an array job. For more information,
         * see Array Jobs in the AWS Batch User Guide.
         *
         * Default: - No array size
         *
         * @param arraySize The array size can be between 2 and 10,000.
         */
        override fun arraySize(arraySize: Number) {
            cdkBuilder.arraySize(arraySize)
        }

        /**
         * The number of times to move a job to the RUNNABLE status.
         *
         * You may specify between 1 and 10 attempts. If the value of attempts is greater than one,
         * the job is retried on failure the same number of attempts as the value.
         *
         * Default: 1
         *
         * @param attempts The number of times to move a job to the RUNNABLE status.
         */
        override fun attempts(attempts: Number) {
            cdkBuilder.attempts(attempts)
        }

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
         * A list of container overrides in JSON format that specify the name of a container in the
         * specified job definition and the overrides it should receive.
         *
         * Default: - No container overrides
         *
         * [Documentation](https://docs.aws.amazon.com/batch/latest/APIReference/API_SubmitJob.html#Batch-SubmitJob-request-containerOverrides)
         *
         * @param containerOverrides A list of container overrides in JSON format that specify the
         *   name of a container in the specified job definition and the overrides it should
         *   receive.
         */
        override fun containerOverrides(containerOverrides: BatchContainerOverrides) {
            cdkBuilder.containerOverrides(containerOverrides.let(BatchContainerOverrides::unwrap))
        }

        /**
         * A list of container overrides in JSON format that specify the name of a container in the
         * specified job definition and the overrides it should receive.
         *
         * Default: - No container overrides
         *
         * [Documentation](https://docs.aws.amazon.com/batch/latest/APIReference/API_SubmitJob.html#Batch-SubmitJob-request-containerOverrides)
         *
         * @param containerOverrides A list of container overrides in JSON format that specify the
         *   name of a container in the specified job definition and the overrides it should
         *   receive.
         */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("4142fe7dbfe5d527b3aec64eb7d84fa5e491d633c66db9920410796569222b08")
        override fun containerOverrides(
            containerOverrides: BatchContainerOverrides.Builder.() -> Unit
        ): Unit = containerOverrides(BatchContainerOverrides(containerOverrides))

        /**
         * Credentials for an IAM Role that the State Machine assumes for executing the task.
         *
         * This enables cross-account resource invocations.
         *
         * Default: - None (Task is executed using the State Machine's execution role)
         *
         * [Documentation](https://docs.aws.amazon.com/step-functions/latest/dg/concepts-access-cross-acct-resources.html)
         *
         * @param credentials Credentials for an IAM Role that the State Machine assumes for
         *   executing the task.
         */
        override fun credentials(credentials: Credentials) {
            cdkBuilder.credentials(credentials.let(Credentials::unwrap))
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
         * @param credentials Credentials for an IAM Role that the State Machine assumes for
         *   executing the task.
         */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("a196e00fc0f536f730d2f9615c57b501ba9e0ffd237790f513e9cfd9d2c6aa08")
        override fun credentials(credentials: Credentials.Builder.() -> Unit): Unit =
            credentials(Credentials(credentials))

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
        override fun dependsOn(dependsOn: List<BatchJobDependency>) {
            cdkBuilder.dependsOn(dependsOn.map(BatchJobDependency::unwrap))
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
        override fun dependsOn(vararg dependsOn: BatchJobDependency): Unit =
            dependsOn(dependsOn.toList())

        /**
         * (deprecated) Timeout for the heartbeat.
         *
         * Default: - None
         *
         * @param heartbeat Timeout for the heartbeat.
         * @deprecated use `heartbeatTimeout`
         */
        @Deprecated(message = "deprecated in CDK")
        override fun heartbeat(heartbeat: Duration) {
            cdkBuilder.heartbeat(heartbeat.let(Duration::unwrap))
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
            cdkBuilder.heartbeatTimeout(heartbeatTimeout.let(Timeout::unwrap))
        }

        /**
         * JSONPath expression to select part of the state to be the input to this state.
         *
         * May also be the special value JsonPath.DISCARD, which will cause the effective input to
         * be the empty object {}.
         *
         * Default: - The entire task input (JSON path '$')
         *
         * @param inputPath JSONPath expression to select part of the state to be the input to this
         *   state.
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
         * `IntegrationPattern.RUN_JOB` for the following exceptions: `BatchSubmitJob`,
         * `EmrAddStep`, `EmrCreateCluster`, `EmrTerminationCluster`, and
         * `EmrContainersStartJobRun`.
         *
         * [Documentation](https://docs.aws.amazon.com/step-functions/latest/dg/connect-supported-services.html)
         *
         * @param integrationPattern AWS Step Functions integrates with services directly in the
         *   Amazon States Language.
         */
        override fun integrationPattern(integrationPattern: IntegrationPattern) {
            cdkBuilder.integrationPattern(integrationPattern.let(IntegrationPattern::unwrap))
        }

        /**
         * The arn of the job definition used by this job.
         *
         * @param jobDefinitionArn The arn of the job definition used by this job.
         */
        override fun jobDefinitionArn(jobDefinitionArn: String) {
            cdkBuilder.jobDefinitionArn(jobDefinitionArn)
        }

        /**
         * The name of the job.
         *
         * The first character must be alphanumeric, and up to 128 letters (uppercase and
         * lowercase), numbers, hyphens, and underscores are allowed.
         *
         * @param jobName The name of the job.
         */
        override fun jobName(jobName: String) {
            cdkBuilder.jobName(jobName)
        }

        /**
         * The arn of the job queue into which the job is submitted.
         *
         * @param jobQueueArn The arn of the job queue into which the job is submitted.
         */
        override fun jobQueueArn(jobQueueArn: String) {
            cdkBuilder.jobQueueArn(jobQueueArn)
        }

        /**
         * JSONPath expression to select select a portion of the state output to pass to the next
         * state.
         *
         * May also be the special value JsonPath.DISCARD, which will cause the effective output to
         * be the empty object {}.
         *
         * Default: - The entire JSON node determined by the state input, the task result, and
         * resultPath is passed to the next state (JSON path '$')
         *
         * @param outputPath JSONPath expression to select select a portion of the state output to
         *   pass to the next state.
         */
        override fun outputPath(outputPath: String) {
            cdkBuilder.outputPath(outputPath)
        }

        /**
         * The payload to be passed as parameters to the batch job.
         *
         * Default: - No parameters are passed
         *
         * @param payload The payload to be passed as parameters to the batch job.
         */
        override fun payload(payload: TaskInput) {
            cdkBuilder.payload(payload.let(TaskInput::unwrap))
        }

        /**
         * JSONPath expression to indicate where to inject the state's output.
         *
         * May also be the special value JsonPath.DISCARD, which will cause the state's input to
         * become its output.
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
         * You can use ResultSelector to create a payload with values that are static or selected
         * from the state's raw result.
         *
         * Default: - None
         *
         * [Documentation](https://docs.aws.amazon.com/step-functions/latest/dg/input-output-inputpath-params.html#input-output-resultselector)
         *
         * @param resultSelector The JSON that will replace the state's raw result and become the
         *   effective result before ResultPath is applied.
         */
        override fun resultSelector(resultSelector: Map<String, Any>) {
            cdkBuilder.resultSelector(resultSelector)
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
         * The tags applied to the job request.
         *
         * Default: {} - no tags
         *
         * @param tags The tags applied to the job request.
         */
        override fun tags(tags: Map<String, String>) {
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
        override fun taskTimeout(taskTimeout: Timeout) {
            cdkBuilder.taskTimeout(taskTimeout.let(Timeout::unwrap))
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
        override fun timeout(timeout: Duration) {
            cdkBuilder.timeout(timeout.let(Duration::unwrap))
        }

        public fun build(): software.amazon.awscdk.services.stepfunctions.tasks.BatchSubmitJob =
            cdkBuilder.build()
    }

    public companion object {
        init {}

        public operator fun invoke(
            scope: CloudshiftdevConstructsConstruct,
            id: String,
            block: Builder.() -> Unit = {},
        ): BatchSubmitJob {
            val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
            return BatchSubmitJob(builderImpl.apply(block).build())
        }

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.BatchSubmitJob
        ): BatchSubmitJob = BatchSubmitJob(cdkObject)

        internal fun unwrap(
            wrapped: BatchSubmitJob
        ): software.amazon.awscdk.services.stepfunctions.tasks.BatchSubmitJob = wrapped.cdkObject
    }
}
