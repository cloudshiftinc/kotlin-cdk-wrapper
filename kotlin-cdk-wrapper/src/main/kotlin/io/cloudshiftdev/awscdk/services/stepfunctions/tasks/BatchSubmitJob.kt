@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions.tasks

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.stepfunctions.Credentials
import io.cloudshiftdev.awscdk.services.stepfunctions.IntegrationPattern
import io.cloudshiftdev.awscdk.services.stepfunctions.QueryLanguage
import io.cloudshiftdev.awscdk.services.stepfunctions.TaskInput
import io.cloudshiftdev.awscdk.services.stepfunctions.TaskStateBase
import io.cloudshiftdev.awscdk.services.stepfunctions.Timeout
import kotlin.Any
import kotlin.Deprecated
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Task to submits an AWS Batch job from a job definition.
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
 *
 * [Documentation](https://docs.aws.amazon.com/step-functions/latest/dg/connect-batch.html)
 */
public open class BatchSubmitJob(
  cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.BatchSubmitJob,
) : TaskStateBase(cdkObject) {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: BatchSubmitJobProps,
  ) :
      this(software.amazon.awscdk.services.stepfunctions.tasks.BatchSubmitJob(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(BatchSubmitJobProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: BatchSubmitJobProps.Builder.() -> Unit,
  ) : this(scope, id, BatchSubmitJobProps(props)
  )

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.stepfunctions.tasks.BatchSubmitJob].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The array size can be between 2 and 10,000.
     *
     * If you specify array properties for a job, it becomes an array job.
     * For more information, see Array Jobs in the AWS Batch User Guide.
     *
     * Default: - No array size
     *
     * @param arraySize The array size can be between 2 and 10,000. 
     */
    public fun arraySize(arraySize: Number)

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
     * The number of times to move a job to the RUNNABLE status.
     *
     * You may specify between 1 and 10 attempts.
     * If the value of attempts is greater than one,
     * the job is retried on failure the same number of attempts as the value.
     *
     * Default: 1
     *
     * @param attempts The number of times to move a job to the RUNNABLE status. 
     */
    public fun attempts(attempts: Number)

    /**
     * A comment describing this state.
     *
     * Default: No comment
     *
     * @param comment A comment describing this state. 
     */
    public fun comment(comment: String)

    /**
     * A list of container overrides in JSON format that specify the name of a container in the
     * specified job definition and the overrides it should receive.
     *
     * Default: - No container overrides
     *
     * [Documentation](https://docs.aws.amazon.com/batch/latest/APIReference/API_SubmitJob.html#Batch-SubmitJob-request-containerOverrides)
     * @param containerOverrides A list of container overrides in JSON format that specify the name
     * of a container in the specified job definition and the overrides it should receive. 
     */
    public fun containerOverrides(containerOverrides: BatchContainerOverrides)

    /**
     * A list of container overrides in JSON format that specify the name of a container in the
     * specified job definition and the overrides it should receive.
     *
     * Default: - No container overrides
     *
     * [Documentation](https://docs.aws.amazon.com/batch/latest/APIReference/API_SubmitJob.html#Batch-SubmitJob-request-containerOverrides)
     * @param containerOverrides A list of container overrides in JSON format that specify the name
     * of a container in the specified job definition and the overrides it should receive. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4142fe7dbfe5d527b3aec64eb7d84fa5e491d633c66db9920410796569222b08")
    public fun containerOverrides(containerOverrides: BatchContainerOverrides.Builder.() -> Unit)

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
     * @param dependsOn A list of dependencies for the job. 
     */
    public fun dependsOn(vararg dependsOn: BatchJobDependency)

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
     * The arn of the job definition used by this job.
     *
     * @param jobDefinitionArn The arn of the job definition used by this job. 
     */
    public fun jobDefinitionArn(jobDefinitionArn: String)

    /**
     * The name of the job.
     *
     * The first character must be alphanumeric, and up to 128 letters (uppercase and lowercase),
     * numbers, hyphens, and underscores are allowed.
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
     * The payload to be passed as parameters to the batch job.
     *
     * Default: - No parameters are passed
     *
     * @param payload The payload to be passed as parameters to the batch job. 
     */
    public fun payload(payload: TaskInput)

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
        software.amazon.awscdk.services.stepfunctions.tasks.BatchSubmitJob.Builder =
        software.amazon.awscdk.services.stepfunctions.tasks.BatchSubmitJob.Builder.create(scope, id)

    /**
     * The array size can be between 2 and 10,000.
     *
     * If you specify array properties for a job, it becomes an array job.
     * For more information, see Array Jobs in the AWS Batch User Guide.
     *
     * Default: - No array size
     *
     * @param arraySize The array size can be between 2 and 10,000. 
     */
    override fun arraySize(arraySize: Number) {
      cdkBuilder.arraySize(arraySize)
    }

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
     * The number of times to move a job to the RUNNABLE status.
     *
     * You may specify between 1 and 10 attempts.
     * If the value of attempts is greater than one,
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
     * A list of container overrides in JSON format that specify the name of a container in the
     * specified job definition and the overrides it should receive.
     *
     * Default: - No container overrides
     *
     * [Documentation](https://docs.aws.amazon.com/batch/latest/APIReference/API_SubmitJob.html#Batch-SubmitJob-request-containerOverrides)
     * @param containerOverrides A list of container overrides in JSON format that specify the name
     * of a container in the specified job definition and the overrides it should receive. 
     */
    override fun containerOverrides(containerOverrides: BatchContainerOverrides) {
      cdkBuilder.containerOverrides(containerOverrides.let(BatchContainerOverrides.Companion::unwrap))
    }

    /**
     * A list of container overrides in JSON format that specify the name of a container in the
     * specified job definition and the overrides it should receive.
     *
     * Default: - No container overrides
     *
     * [Documentation](https://docs.aws.amazon.com/batch/latest/APIReference/API_SubmitJob.html#Batch-SubmitJob-request-containerOverrides)
     * @param containerOverrides A list of container overrides in JSON format that specify the name
     * of a container in the specified job definition and the overrides it should receive. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4142fe7dbfe5d527b3aec64eb7d84fa5e491d633c66db9920410796569222b08")
    override fun containerOverrides(containerOverrides: BatchContainerOverrides.Builder.() -> Unit):
        Unit = containerOverrides(BatchContainerOverrides(containerOverrides))

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
     * @param dependsOn A list of dependencies for the job. 
     */
    override fun dependsOn(dependsOn: List<BatchJobDependency>) {
      cdkBuilder.dependsOn(dependsOn.map(BatchJobDependency.Companion::unwrap))
    }

    /**
     * A list of dependencies for the job.
     *
     * A job can depend upon a maximum of 20 jobs.
     *
     * Default: - No dependencies
     *
     * [Documentation](https://docs.aws.amazon.com/batch/latest/APIReference/API_SubmitJob.html#Batch-SubmitJob-request-dependsOn)
     * @param dependsOn A list of dependencies for the job. 
     */
    override fun dependsOn(vararg dependsOn: BatchJobDependency): Unit =
        dependsOn(dependsOn.toList())

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
     * The first character must be alphanumeric, and up to 128 letters (uppercase and lowercase),
     * numbers, hyphens, and underscores are allowed.
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
     * The payload to be passed as parameters to the batch job.
     *
     * Default: - No parameters are passed
     *
     * @param payload The payload to be passed as parameters to the batch job. 
     */
    override fun payload(payload: TaskInput) {
      cdkBuilder.payload(payload.let(TaskInput.Companion::unwrap))
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

    public fun build(): software.amazon.awscdk.services.stepfunctions.tasks.BatchSubmitJob =
        cdkBuilder.build()
  }

  public companion object {
    public fun jsonPath(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      props: BatchSubmitJobJsonPathProps,
    ): BatchSubmitJob =
        software.amazon.awscdk.services.stepfunctions.tasks.BatchSubmitJob.jsonPath(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
        id, props.let(BatchSubmitJobJsonPathProps.Companion::unwrap)).let(BatchSubmitJob::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("cbc2573725700f788ae8ed0b83b92abe36e5f0af4e8f1a5a3e784f8d3bea3c83")
    public fun jsonPath(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      props: BatchSubmitJobJsonPathProps.Builder.() -> Unit,
    ): BatchSubmitJob = jsonPath(scope, id, BatchSubmitJobJsonPathProps(props))

    public fun jsonata(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      props: BatchSubmitJobJsonataProps,
    ): BatchSubmitJob =
        software.amazon.awscdk.services.stepfunctions.tasks.BatchSubmitJob.jsonata(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
        id, props.let(BatchSubmitJobJsonataProps.Companion::unwrap)).let(BatchSubmitJob::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("014699b5d78be05a68e085ea5588abcbbb7de5c03b49626fdf513f292526636c")
    public fun jsonata(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      props: BatchSubmitJobJsonataProps.Builder.() -> Unit,
    ): BatchSubmitJob = jsonata(scope, id, BatchSubmitJobJsonataProps(props))

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): BatchSubmitJob {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return BatchSubmitJob(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.BatchSubmitJob):
        BatchSubmitJob = BatchSubmitJob(cdkObject)

    internal fun unwrap(wrapped: BatchSubmitJob):
        software.amazon.awscdk.services.stepfunctions.tasks.BatchSubmitJob = wrapped.cdkObject as
        software.amazon.awscdk.services.stepfunctions.tasks.BatchSubmitJob
  }
}
