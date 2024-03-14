package io.cloudshiftdev.awscdk.services.stepfunctions.tasks

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.Size
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.iam.IRole
import io.cloudshiftdev.awscdk.services.stepfunctions.Credentials
import io.cloudshiftdev.awscdk.services.stepfunctions.IntegrationPattern
import io.cloudshiftdev.awscdk.services.stepfunctions.TaskStateBase
import io.cloudshiftdev.awscdk.services.stepfunctions.Timeout
import kotlin.Any
import kotlin.Deprecated
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class SageMakerCreateTransformJob internal constructor(
  private val cdkObject:
      software.amazon.awscdk.services.stepfunctions.tasks.SageMakerCreateTransformJob,
) : TaskStateBase(cdkObject) {
  /**
   * The execution role for the Sagemaker transform job.
   *
   * Only available after task has been added to a state machine.
   */
  public open fun role(): IRole = unwrap(this).getRole().let(IRole::wrap)

  /**
   * A fluent builder for
   * [io.cloudshiftdev.awscdk.services.stepfunctions.tasks.SageMakerCreateTransformJob].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Number of records to include in a mini-batch for an HTTP inference request.
     *
     * Default: - No batch strategy
     *
     * @param batchStrategy Number of records to include in a mini-batch for an HTTP inference
     * request. 
     */
    public fun batchStrategy(batchStrategy: BatchStrategy)

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
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("439d8ddac8c9473287992dd7eb125d9170503f09906e8ee8651ff59387bd62f6")
    public fun credentials(credentials: Credentials.Builder.() -> Unit)

    /**
     * Environment variables to set in the Docker container.
     *
     * Default: - No environment variables
     *
     * @param environment Environment variables to set in the Docker container. 
     */
    public fun environment(environment: Map<String, String>)

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
     * Maximum number of parallel requests that can be sent to each instance in a transform job.
     *
     * Default: - Amazon SageMaker checks the optional execution-parameters to determine the
     * settings for your chosen algorithm.
     * If the execution-parameters endpoint is not enabled, the default value is 1.
     *
     * @param maxConcurrentTransforms Maximum number of parallel requests that can be sent to each
     * instance in a transform job. 
     */
    public fun maxConcurrentTransforms(maxConcurrentTransforms: Number)

    /**
     * Maximum allowed size of the payload, in MB.
     *
     * Default: 6
     *
     * @param maxPayload Maximum allowed size of the payload, in MB. 
     */
    public fun maxPayload(maxPayload: Size)

    /**
     * Configures the timeout and maximum number of retries for processing a transform job
     * invocation.
     *
     * Default: - 0 retries and 60 seconds of timeout
     *
     * @param modelClientOptions Configures the timeout and maximum number of retries for processing
     * a transform job invocation. 
     */
    public fun modelClientOptions(modelClientOptions: ModelClientOptions)

    /**
     * Configures the timeout and maximum number of retries for processing a transform job
     * invocation.
     *
     * Default: - 0 retries and 60 seconds of timeout
     *
     * @param modelClientOptions Configures the timeout and maximum number of retries for processing
     * a transform job invocation. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a18eba4f02fb1f502cbb95a2024973a630445f1f3d3f54a9f402773f7afcd47a")
    public fun modelClientOptions(modelClientOptions: ModelClientOptions.Builder.() -> Unit)

    /**
     * Name of the model that you want to use for the transform job.
     *
     * @param modelName Name of the model that you want to use for the transform job. 
     */
    public fun modelName(modelName: String)

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
     * Role for the Transform Job.
     *
     * Default: - A role is created with `AmazonSageMakerFullAccess` managed policy
     *
     * @param role Role for the Transform Job. 
     */
    public fun role(role: IRole)

    /**
     * Optional name for this state.
     *
     * Default: - The construct ID will be used as state name
     *
     * @param stateName Optional name for this state. 
     */
    public fun stateName(stateName: String)

    /**
     * Tags to be applied to the train job.
     *
     * Default: - No tags
     *
     * @param tags Tags to be applied to the train job. 
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

    /**
     * Dataset to be transformed and the Amazon S3 location where it is stored.
     *
     * @param transformInput Dataset to be transformed and the Amazon S3 location where it is
     * stored. 
     */
    public fun transformInput(transformInput: TransformInput)

    /**
     * Dataset to be transformed and the Amazon S3 location where it is stored.
     *
     * @param transformInput Dataset to be transformed and the Amazon S3 location where it is
     * stored. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("82dc1bf573e4c4374710f3488ec7e5eb7d43aeff9469aacf70ba2debe16c69d9")
    public fun transformInput(transformInput: TransformInput.Builder.() -> Unit)

    /**
     * Transform Job Name.
     *
     * @param transformJobName Transform Job Name. 
     */
    public fun transformJobName(transformJobName: String)

    /**
     * S3 location where you want Amazon SageMaker to save the results from the transform job.
     *
     * @param transformOutput S3 location where you want Amazon SageMaker to save the results from
     * the transform job. 
     */
    public fun transformOutput(transformOutput: TransformOutput)

    /**
     * S3 location where you want Amazon SageMaker to save the results from the transform job.
     *
     * @param transformOutput S3 location where you want Amazon SageMaker to save the results from
     * the transform job. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7ab81e075c43ff68c02bde2c94a7b730b7c7b5644a2a704dc5d0abc1d32f952e")
    public fun transformOutput(transformOutput: TransformOutput.Builder.() -> Unit)

    /**
     * ML compute instances for the transform job.
     *
     * Default: - 1 instance of type M4.XLarge
     *
     * @param transformResources ML compute instances for the transform job. 
     */
    public fun transformResources(transformResources: TransformResources)

    /**
     * ML compute instances for the transform job.
     *
     * Default: - 1 instance of type M4.XLarge
     *
     * @param transformResources ML compute instances for the transform job. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e33440e01307a8a13de1a422d68feeae02998fe1926849452a322e71e8500a41")
    public fun transformResources(transformResources: TransformResources.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.stepfunctions.tasks.SageMakerCreateTransformJob.Builder =
        software.amazon.awscdk.services.stepfunctions.tasks.SageMakerCreateTransformJob.Builder.create(scope,
        id)

    /**
     * Number of records to include in a mini-batch for an HTTP inference request.
     *
     * Default: - No batch strategy
     *
     * @param batchStrategy Number of records to include in a mini-batch for an HTTP inference
     * request. 
     */
    override fun batchStrategy(batchStrategy: BatchStrategy) {
      cdkBuilder.batchStrategy(batchStrategy.let(BatchStrategy::unwrap))
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
     * @param credentials Credentials for an IAM Role that the State Machine assumes for executing
     * the task. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("439d8ddac8c9473287992dd7eb125d9170503f09906e8ee8651ff59387bd62f6")
    override fun credentials(credentials: Credentials.Builder.() -> Unit): Unit =
        credentials(Credentials(credentials))

    /**
     * Environment variables to set in the Docker container.
     *
     * Default: - No environment variables
     *
     * @param environment Environment variables to set in the Docker container. 
     */
    override fun environment(environment: Map<String, String>) {
      cdkBuilder.environment(environment)
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
      cdkBuilder.integrationPattern(integrationPattern.let(IntegrationPattern::unwrap))
    }

    /**
     * Maximum number of parallel requests that can be sent to each instance in a transform job.
     *
     * Default: - Amazon SageMaker checks the optional execution-parameters to determine the
     * settings for your chosen algorithm.
     * If the execution-parameters endpoint is not enabled, the default value is 1.
     *
     * @param maxConcurrentTransforms Maximum number of parallel requests that can be sent to each
     * instance in a transform job. 
     */
    override fun maxConcurrentTransforms(maxConcurrentTransforms: Number) {
      cdkBuilder.maxConcurrentTransforms(maxConcurrentTransforms)
    }

    /**
     * Maximum allowed size of the payload, in MB.
     *
     * Default: 6
     *
     * @param maxPayload Maximum allowed size of the payload, in MB. 
     */
    override fun maxPayload(maxPayload: Size) {
      cdkBuilder.maxPayload(maxPayload.let(Size::unwrap))
    }

    /**
     * Configures the timeout and maximum number of retries for processing a transform job
     * invocation.
     *
     * Default: - 0 retries and 60 seconds of timeout
     *
     * @param modelClientOptions Configures the timeout and maximum number of retries for processing
     * a transform job invocation. 
     */
    override fun modelClientOptions(modelClientOptions: ModelClientOptions) {
      cdkBuilder.modelClientOptions(modelClientOptions.let(ModelClientOptions::unwrap))
    }

    /**
     * Configures the timeout and maximum number of retries for processing a transform job
     * invocation.
     *
     * Default: - 0 retries and 60 seconds of timeout
     *
     * @param modelClientOptions Configures the timeout and maximum number of retries for processing
     * a transform job invocation. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a18eba4f02fb1f502cbb95a2024973a630445f1f3d3f54a9f402773f7afcd47a")
    override fun modelClientOptions(modelClientOptions: ModelClientOptions.Builder.() -> Unit): Unit
        = modelClientOptions(ModelClientOptions(modelClientOptions))

    /**
     * Name of the model that you want to use for the transform job.
     *
     * @param modelName Name of the model that you want to use for the transform job. 
     */
    override fun modelName(modelName: String) {
      cdkBuilder.modelName(modelName)
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
      cdkBuilder.resultSelector(resultSelector)
    }

    /**
     * Role for the Transform Job.
     *
     * Default: - A role is created with `AmazonSageMakerFullAccess` managed policy
     *
     * @param role Role for the Transform Job. 
     */
    override fun role(role: IRole) {
      cdkBuilder.role(role.let(IRole::unwrap))
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
     * Tags to be applied to the train job.
     *
     * Default: - No tags
     *
     * @param tags Tags to be applied to the train job. 
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
     * @deprecated use `taskTimeout`
     * @param timeout Timeout for the task. 
     */
    @Deprecated(message = "deprecated in CDK")
    override fun timeout(timeout: Duration) {
      cdkBuilder.timeout(timeout.let(Duration::unwrap))
    }

    /**
     * Dataset to be transformed and the Amazon S3 location where it is stored.
     *
     * @param transformInput Dataset to be transformed and the Amazon S3 location where it is
     * stored. 
     */
    override fun transformInput(transformInput: TransformInput) {
      cdkBuilder.transformInput(transformInput.let(TransformInput::unwrap))
    }

    /**
     * Dataset to be transformed and the Amazon S3 location where it is stored.
     *
     * @param transformInput Dataset to be transformed and the Amazon S3 location where it is
     * stored. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("82dc1bf573e4c4374710f3488ec7e5eb7d43aeff9469aacf70ba2debe16c69d9")
    override fun transformInput(transformInput: TransformInput.Builder.() -> Unit): Unit =
        transformInput(TransformInput(transformInput))

    /**
     * Transform Job Name.
     *
     * @param transformJobName Transform Job Name. 
     */
    override fun transformJobName(transformJobName: String) {
      cdkBuilder.transformJobName(transformJobName)
    }

    /**
     * S3 location where you want Amazon SageMaker to save the results from the transform job.
     *
     * @param transformOutput S3 location where you want Amazon SageMaker to save the results from
     * the transform job. 
     */
    override fun transformOutput(transformOutput: TransformOutput) {
      cdkBuilder.transformOutput(transformOutput.let(TransformOutput::unwrap))
    }

    /**
     * S3 location where you want Amazon SageMaker to save the results from the transform job.
     *
     * @param transformOutput S3 location where you want Amazon SageMaker to save the results from
     * the transform job. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7ab81e075c43ff68c02bde2c94a7b730b7c7b5644a2a704dc5d0abc1d32f952e")
    override fun transformOutput(transformOutput: TransformOutput.Builder.() -> Unit): Unit =
        transformOutput(TransformOutput(transformOutput))

    /**
     * ML compute instances for the transform job.
     *
     * Default: - 1 instance of type M4.XLarge
     *
     * @param transformResources ML compute instances for the transform job. 
     */
    override fun transformResources(transformResources: TransformResources) {
      cdkBuilder.transformResources(transformResources.let(TransformResources::unwrap))
    }

    /**
     * ML compute instances for the transform job.
     *
     * Default: - 1 instance of type M4.XLarge
     *
     * @param transformResources ML compute instances for the transform job. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e33440e01307a8a13de1a422d68feeae02998fe1926849452a322e71e8500a41")
    override fun transformResources(transformResources: TransformResources.Builder.() -> Unit): Unit
        = transformResources(TransformResources(transformResources))

    public fun build():
        software.amazon.awscdk.services.stepfunctions.tasks.SageMakerCreateTransformJob =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): SageMakerCreateTransformJob {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return SageMakerCreateTransformJob(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.SageMakerCreateTransformJob):
        SageMakerCreateTransformJob = SageMakerCreateTransformJob(cdkObject)

    internal fun unwrap(wrapped: SageMakerCreateTransformJob):
        software.amazon.awscdk.services.stepfunctions.tasks.SageMakerCreateTransformJob =
        wrapped.cdkObject
  }
}
