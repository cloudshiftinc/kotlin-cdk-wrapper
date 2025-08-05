@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions.tasks

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.stepfunctions.Credentials
import io.cloudshiftdev.awscdk.services.stepfunctions.IntegrationPattern
import io.cloudshiftdev.awscdk.services.stepfunctions.QueryLanguage
import io.cloudshiftdev.awscdk.services.stepfunctions.TaskInput
import io.cloudshiftdev.awscdk.services.stepfunctions.TaskStateJsonataBaseProps
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
 * Properties for BatchSubmitJob using JSONata.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.*;
 * import io.cloudshiftdev.awscdk.services.ec2.*;
 * import io.cloudshiftdev.awscdk.services.stepfunctions.*;
 * import io.cloudshiftdev.awscdk.services.stepfunctions.tasks.*;
 * Object assign;
 * InstanceType instanceType;
 * Object outputs;
 * Size size;
 * TaskInput taskInput;
 * TaskRole taskRole;
 * Timeout timeout;
 * BatchSubmitJobJsonataProps batchSubmitJobJsonataProps = BatchSubmitJobJsonataProps.builder()
 * .jobDefinitionArn("jobDefinitionArn")
 * .jobName("jobName")
 * .jobQueueArn("jobQueueArn")
 * // the properties below are optional
 * .arraySize(123)
 * .assign(Map.of(
 * "assignKey", assign))
 * .attempts(123)
 * .comment("comment")
 * .containerOverrides(BatchContainerOverrides.builder()
 * .command(List.of("command"))
 * .environment(Map.of(
 * "environmentKey", "environment"))
 * .gpuCount(123)
 * .instanceType(instanceType)
 * .memory(size)
 * .vcpus(123)
 * .build())
 * .credentials(Credentials.builder()
 * .role(taskRole)
 * .build())
 * .dependsOn(List.of(BatchJobDependency.builder()
 * .jobId("jobId")
 * .type("type")
 * .build()))
 * .heartbeat(Duration.minutes(30))
 * .heartbeatTimeout(timeout)
 * .integrationPattern(IntegrationPattern.REQUEST_RESPONSE)
 * .outputs(outputs)
 * .payload(taskInput)
 * .queryLanguage(QueryLanguage.JSON_PATH)
 * .stateName("stateName")
 * .tags(Map.of(
 * "tagsKey", "tags"))
 * .taskTimeout(timeout)
 * .timeout(Duration.minutes(30))
 * .build();
 * ```
 */
public interface BatchSubmitJobJsonataProps : TaskStateJsonataBaseProps {
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
   * A builder for [BatchSubmitJobJsonataProps]
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
     * @param assign Workflow variables to store in this step.
     * Using workflow variables, you can store data in a step and retrieve that data in future
     * steps.
     */
    public fun assign(assign: Map<String, Any>)

    /**
     * @param attempts The number of times to move a job to the RUNNABLE status.
     * You may specify between 1 and 10 attempts.
     * If the value of attempts is greater than one,
     * the job is retried on failure the same number of attempts as the value.
     */
    public fun attempts(attempts: Number)

    /**
     * @param comment A comment describing this state.
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
    @JvmName("042f4e67e95f3c9ea702159f7ec0fe12917efbfab47806bb126ff6b74dfbdd7f")
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
    @JvmName("2599f560883025264e8d700d1c60104f2b3f35729ef1883a421e0d2f48240f1a")
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
     * @param outputs Used to specify and transform output from the state.
     * When specified, the value overrides the state output default.
     * The output field accepts any JSON value (object, array, string, number, boolean, null).
     * Any string value, including those inside objects or arrays,
     * will be evaluated as JSONata if surrounded by {% %} characters.
     * Output also accepts a JSONata expression directly.
     */
    public fun outputs(outputs: Any)

    /**
     * @param payload The payload to be passed as parameters to the batch job.
     */
    public fun payload(payload: TaskInput)

    /**
     * @param queryLanguage The name of the query language used by the state.
     * If the state does not contain a `queryLanguage` field,
     * then it will use the query language specified in the top-level `queryLanguage` field.
     */
    public fun queryLanguage(queryLanguage: QueryLanguage)

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
        software.amazon.awscdk.services.stepfunctions.tasks.BatchSubmitJobJsonataProps.Builder =
        software.amazon.awscdk.services.stepfunctions.tasks.BatchSubmitJobJsonataProps.builder()

    /**
     * @param arraySize The array size can be between 2 and 10,000.
     * If you specify array properties for a job, it becomes an array job.
     * For more information, see Array Jobs in the AWS Batch User Guide.
     */
    override fun arraySize(arraySize: Number) {
      cdkBuilder.arraySize(arraySize)
    }

    /**
     * @param assign Workflow variables to store in this step.
     * Using workflow variables, you can store data in a step and retrieve that data in future
     * steps.
     */
    override fun assign(assign: Map<String, Any>) {
      cdkBuilder.assign(assign.mapValues{CdkObjectWrappers.unwrap(it.value)})
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
     * @param comment A comment describing this state.
     */
    override fun comment(comment: String) {
      cdkBuilder.comment(comment)
    }

    /**
     * @param containerOverrides A list of container overrides in JSON format that specify the name
     * of a container in the specified job definition and the overrides it should receive.
     */
    override fun containerOverrides(containerOverrides: BatchContainerOverrides) {
      cdkBuilder.containerOverrides(containerOverrides.let(BatchContainerOverrides.Companion::unwrap))
    }

    /**
     * @param containerOverrides A list of container overrides in JSON format that specify the name
     * of a container in the specified job definition and the overrides it should receive.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("042f4e67e95f3c9ea702159f7ec0fe12917efbfab47806bb126ff6b74dfbdd7f")
    override fun containerOverrides(containerOverrides: BatchContainerOverrides.Builder.() -> Unit):
        Unit = containerOverrides(BatchContainerOverrides(containerOverrides))

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
    @JvmName("2599f560883025264e8d700d1c60104f2b3f35729ef1883a421e0d2f48240f1a")
    override fun credentials(credentials: Credentials.Builder.() -> Unit): Unit =
        credentials(Credentials(credentials))

    /**
     * @param dependsOn A list of dependencies for the job.
     * A job can depend upon a maximum of 20 jobs.
     */
    override fun dependsOn(dependsOn: List<BatchJobDependency>) {
      cdkBuilder.dependsOn(dependsOn.map(BatchJobDependency.Companion::unwrap))
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
     * @param payload The payload to be passed as parameters to the batch job.
     */
    override fun payload(payload: TaskInput) {
      cdkBuilder.payload(payload.let(TaskInput.Companion::unwrap))
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
        software.amazon.awscdk.services.stepfunctions.tasks.BatchSubmitJobJsonataProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.BatchSubmitJobJsonataProps,
  ) : CdkObject(cdkObject),
      BatchSubmitJobJsonataProps {
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
     * A comment describing this state.
     *
     * Default: No comment
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
     * The payload to be passed as parameters to the batch job.
     *
     * Default: - No parameters are passed
     */
    override fun payload(): TaskInput? = unwrap(this).getPayload()?.let(TaskInput::wrap)

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
    public operator fun invoke(block: Builder.() -> Unit = {}): BatchSubmitJobJsonataProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.BatchSubmitJobJsonataProps):
        BatchSubmitJobJsonataProps = CdkObjectWrappers.wrap(cdkObject) as?
        BatchSubmitJobJsonataProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: BatchSubmitJobJsonataProps):
        software.amazon.awscdk.services.stepfunctions.tasks.BatchSubmitJobJsonataProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.stepfunctions.tasks.BatchSubmitJobJsonataProps
  }
}
