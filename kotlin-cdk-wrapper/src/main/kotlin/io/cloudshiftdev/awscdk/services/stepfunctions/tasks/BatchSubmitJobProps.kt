@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions.tasks

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.stepfunctions.Credentials
import io.cloudshiftdev.awscdk.services.stepfunctions.IntegrationPattern
import io.cloudshiftdev.awscdk.services.stepfunctions.TaskInput
import io.cloudshiftdev.awscdk.services.stepfunctions.TaskStateBaseProps
import io.cloudshiftdev.awscdk.services.stepfunctions.Timeout
import kotlin.Any
import kotlin.Deprecated
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName

/**
 * Properties for RunBatchJob.
 *
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.services.batch.*;
 * EcsJobDefinition batchJobDefinition;
 * JobQueue batchQueue;
 * BatchSubmitJob task = BatchSubmitJob.Builder.create(this, "Submit Job")
 * .jobDefinitionArn(batchJobDefinition.getJobDefinitionArn())
 * .jobName("MyJob")
 * .jobQueueArn(batchQueue.getJobQueueArn())
 * .build();
 * ```
 */
public interface BatchSubmitJobProps : TaskStateBaseProps {
  /**
   * The array size can be between 2 and 10,000.
   *
   * If you specify array properties for a job, it becomes an array job.
   * For more information, see Array Jobs in the AWS Batch User Guide.
   *
   * Default: - No array size
   */
  public fun arraySize(): Number? = unwrap(this).getArraySize()

  /**
   * The number of times to move a job to the RUNNABLE status.
   *
   * You may specify between 1 and 10 attempts.
   * If the value of attempts is greater than one,
   * the job is retried on failure the same number of attempts as the value.
   *
   * Default: 1
   */
  public fun attempts(): Number? = unwrap(this).getAttempts()

  /**
   * A list of container overrides in JSON format that specify the name of a container in the
   * specified job definition and the overrides it should receive.
   *
   * Default: - No container overrides
   *
   * [Documentation](https://docs.aws.amazon.com/batch/latest/APIReference/API_SubmitJob.html#Batch-SubmitJob-request-containerOverrides)
   */
  public fun containerOverrides(): BatchContainerOverrides? =
      unwrap(this).getContainerOverrides()?.let(BatchContainerOverrides::wrap)

  /**
   * A list of dependencies for the job.
   *
   * A job can depend upon a maximum of 20 jobs.
   *
   * Default: - No dependencies
   *
   * [Documentation](https://docs.aws.amazon.com/batch/latest/APIReference/API_SubmitJob.html#Batch-SubmitJob-request-dependsOn)
   */
  public fun dependsOn(): List<BatchJobDependency> =
      unwrap(this).getDependsOn()?.map(BatchJobDependency::wrap) ?: emptyList()

  /**
   * The arn of the job definition used by this job.
   */
  public fun jobDefinitionArn(): String

  /**
   * The name of the job.
   *
   * The first character must be alphanumeric, and up to 128 letters (uppercase and lowercase),
   * numbers, hyphens, and underscores are allowed.
   */
  public fun jobName(): String

  /**
   * The arn of the job queue into which the job is submitted.
   */
  public fun jobQueueArn(): String

  /**
   * The payload to be passed as parameters to the batch job.
   *
   * Default: - No parameters are passed
   */
  public fun payload(): TaskInput? = unwrap(this).getPayload()?.let(TaskInput::wrap)

  /**
   * The tags applied to the job request.
   *
   * Default: {} - no tags
   */
  public fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

  /**
   * A builder for [BatchSubmitJobProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param arraySize The array size can be between 2 and 10,000.
     * If you specify array properties for a job, it becomes an array job.
     * For more information, see Array Jobs in the AWS Batch User Guide.
     */
    public fun arraySize(arraySize: Number)

    /**
     * @param attempts The number of times to move a job to the RUNNABLE status.
     * You may specify between 1 and 10 attempts.
     * If the value of attempts is greater than one,
     * the job is retried on failure the same number of attempts as the value.
     */
    public fun attempts(attempts: Number)

    /**
     * @param comment An optional description for this state.
     */
    public fun comment(comment: String)

    /**
     * @param containerOverrides A list of container overrides in JSON format that specify the name
     * of a container in the specified job definition and the overrides it should receive.
     */
    public fun containerOverrides(containerOverrides: BatchContainerOverrides)

    /**
     * @param containerOverrides A list of container overrides in JSON format that specify the name
     * of a container in the specified job definition and the overrides it should receive.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b208579aa64fb4a25b0d9e6b262496648f73df005eaf87d1fa7d8f86d5509feb")
    public fun containerOverrides(containerOverrides: BatchContainerOverrides.Builder.() -> Unit)

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
    @JvmName("a257df9e0422a51709b192e1f3a7116d7871b77893a9dd0cc7b95e35bad12c74")
    public fun credentials(credentials: Credentials.Builder.() -> Unit)

    /**
     * @param dependsOn A list of dependencies for the job.
     * A job can depend upon a maximum of 20 jobs.
     */
    public fun dependsOn(dependsOn: List<BatchJobDependency>)

    /**
     * @param dependsOn A list of dependencies for the job.
     * A job can depend upon a maximum of 20 jobs.
     */
    public fun dependsOn(vararg dependsOn: BatchJobDependency)

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
     * @param jobDefinitionArn The arn of the job definition used by this job. 
     */
    public fun jobDefinitionArn(jobDefinitionArn: String)

    /**
     * @param jobName The name of the job. 
     * The first character must be alphanumeric, and up to 128 letters (uppercase and lowercase),
     * numbers, hyphens, and underscores are allowed.
     */
    public fun jobName(jobName: String)

    /**
     * @param jobQueueArn The arn of the job queue into which the job is submitted. 
     */
    public fun jobQueueArn(jobQueueArn: String)

    /**
     * @param outputPath JSONPath expression to select select a portion of the state output to pass
     * to the next state.
     * May also be the special value JsonPath.DISCARD, which will cause the effective
     * output to be the empty object {}.
     */
    public fun outputPath(outputPath: String)

    /**
     * @param payload The payload to be passed as parameters to the batch job.
     */
    public fun payload(payload: TaskInput)

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
     * @param stateName Optional name for this state.
     */
    public fun stateName(stateName: String)

    /**
     * @param tags The tags applied to the job request.
     */
    public fun tags(tags: Map<String, String>)

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
        software.amazon.awscdk.services.stepfunctions.tasks.BatchSubmitJobProps.Builder =
        software.amazon.awscdk.services.stepfunctions.tasks.BatchSubmitJobProps.builder()

    /**
     * @param arraySize The array size can be between 2 and 10,000.
     * If you specify array properties for a job, it becomes an array job.
     * For more information, see Array Jobs in the AWS Batch User Guide.
     */
    override fun arraySize(arraySize: Number) {
      cdkBuilder.arraySize(arraySize)
    }

    /**
     * @param attempts The number of times to move a job to the RUNNABLE status.
     * You may specify between 1 and 10 attempts.
     * If the value of attempts is greater than one,
     * the job is retried on failure the same number of attempts as the value.
     */
    override fun attempts(attempts: Number) {
      cdkBuilder.attempts(attempts)
    }

    /**
     * @param comment An optional description for this state.
     */
    override fun comment(comment: String) {
      cdkBuilder.comment(comment)
    }

    /**
     * @param containerOverrides A list of container overrides in JSON format that specify the name
     * of a container in the specified job definition and the overrides it should receive.
     */
    override fun containerOverrides(containerOverrides: BatchContainerOverrides) {
      cdkBuilder.containerOverrides(containerOverrides.let(BatchContainerOverrides::unwrap))
    }

    /**
     * @param containerOverrides A list of container overrides in JSON format that specify the name
     * of a container in the specified job definition and the overrides it should receive.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b208579aa64fb4a25b0d9e6b262496648f73df005eaf87d1fa7d8f86d5509feb")
    override fun containerOverrides(containerOverrides: BatchContainerOverrides.Builder.() -> Unit):
        Unit = containerOverrides(BatchContainerOverrides(containerOverrides))

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
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a257df9e0422a51709b192e1f3a7116d7871b77893a9dd0cc7b95e35bad12c74")
    override fun credentials(credentials: Credentials.Builder.() -> Unit): Unit =
        credentials(Credentials(credentials))

    /**
     * @param dependsOn A list of dependencies for the job.
     * A job can depend upon a maximum of 20 jobs.
     */
    override fun dependsOn(dependsOn: List<BatchJobDependency>) {
      cdkBuilder.dependsOn(dependsOn.map(BatchJobDependency::unwrap))
    }

    /**
     * @param dependsOn A list of dependencies for the job.
     * A job can depend upon a maximum of 20 jobs.
     */
    override fun dependsOn(vararg dependsOn: BatchJobDependency): Unit =
        dependsOn(dependsOn.toList())

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
     * @param jobDefinitionArn The arn of the job definition used by this job. 
     */
    override fun jobDefinitionArn(jobDefinitionArn: String) {
      cdkBuilder.jobDefinitionArn(jobDefinitionArn)
    }

    /**
     * @param jobName The name of the job. 
     * The first character must be alphanumeric, and up to 128 letters (uppercase and lowercase),
     * numbers, hyphens, and underscores are allowed.
     */
    override fun jobName(jobName: String) {
      cdkBuilder.jobName(jobName)
    }

    /**
     * @param jobQueueArn The arn of the job queue into which the job is submitted. 
     */
    override fun jobQueueArn(jobQueueArn: String) {
      cdkBuilder.jobQueueArn(jobQueueArn)
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
     * @param payload The payload to be passed as parameters to the batch job.
     */
    override fun payload(payload: TaskInput) {
      cdkBuilder.payload(payload.let(TaskInput::unwrap))
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
      cdkBuilder.resultSelector(resultSelector.mapValues{CdkObjectWrappers.unwrap(it.value)})
    }

    /**
     * @param stateName Optional name for this state.
     */
    override fun stateName(stateName: String) {
      cdkBuilder.stateName(stateName)
    }

    /**
     * @param tags The tags applied to the job request.
     */
    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
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

    public fun build(): software.amazon.awscdk.services.stepfunctions.tasks.BatchSubmitJobProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.BatchSubmitJobProps,
  ) : CdkObject(cdkObject), BatchSubmitJobProps {
    /**
     * The array size can be between 2 and 10,000.
     *
     * If you specify array properties for a job, it becomes an array job.
     * For more information, see Array Jobs in the AWS Batch User Guide.
     *
     * Default: - No array size
     */
    override fun arraySize(): Number? = unwrap(this).getArraySize()

    /**
     * The number of times to move a job to the RUNNABLE status.
     *
     * You may specify between 1 and 10 attempts.
     * If the value of attempts is greater than one,
     * the job is retried on failure the same number of attempts as the value.
     *
     * Default: 1
     */
    override fun attempts(): Number? = unwrap(this).getAttempts()

    /**
     * An optional description for this state.
     *
     * Default: - No comment
     */
    override fun comment(): String? = unwrap(this).getComment()

    /**
     * A list of container overrides in JSON format that specify the name of a container in the
     * specified job definition and the overrides it should receive.
     *
     * Default: - No container overrides
     *
     * [Documentation](https://docs.aws.amazon.com/batch/latest/APIReference/API_SubmitJob.html#Batch-SubmitJob-request-containerOverrides)
     */
    override fun containerOverrides(): BatchContainerOverrides? =
        unwrap(this).getContainerOverrides()?.let(BatchContainerOverrides::wrap)

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
     * A list of dependencies for the job.
     *
     * A job can depend upon a maximum of 20 jobs.
     *
     * Default: - No dependencies
     *
     * [Documentation](https://docs.aws.amazon.com/batch/latest/APIReference/API_SubmitJob.html#Batch-SubmitJob-request-dependsOn)
     */
    override fun dependsOn(): List<BatchJobDependency> =
        unwrap(this).getDependsOn()?.map(BatchJobDependency::wrap) ?: emptyList()

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
     * The arn of the job definition used by this job.
     */
    override fun jobDefinitionArn(): String = unwrap(this).getJobDefinitionArn()

    /**
     * The name of the job.
     *
     * The first character must be alphanumeric, and up to 128 letters (uppercase and lowercase),
     * numbers, hyphens, and underscores are allowed.
     */
    override fun jobName(): String = unwrap(this).getJobName()

    /**
     * The arn of the job queue into which the job is submitted.
     */
    override fun jobQueueArn(): String = unwrap(this).getJobQueueArn()

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
     * The payload to be passed as parameters to the batch job.
     *
     * Default: - No parameters are passed
     */
    override fun payload(): TaskInput? = unwrap(this).getPayload()?.let(TaskInput::wrap)

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
     * Optional name for this state.
     *
     * Default: - The construct ID will be used as state name
     */
    override fun stateName(): String? = unwrap(this).getStateName()

    /**
     * The tags applied to the job request.
     *
     * Default: {} - no tags
     */
    override fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

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
    public operator fun invoke(block: Builder.() -> Unit = {}): BatchSubmitJobProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.BatchSubmitJobProps):
        BatchSubmitJobProps = CdkObjectWrappers.wrap(cdkObject) as? BatchSubmitJobProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: BatchSubmitJobProps):
        software.amazon.awscdk.services.stepfunctions.tasks.BatchSubmitJobProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.stepfunctions.tasks.BatchSubmitJobProps
  }
}
