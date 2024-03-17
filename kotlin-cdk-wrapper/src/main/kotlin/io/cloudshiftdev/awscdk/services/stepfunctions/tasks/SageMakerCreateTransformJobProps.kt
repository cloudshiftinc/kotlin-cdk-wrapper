@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions.tasks

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.Size
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.iam.IRole
import io.cloudshiftdev.awscdk.services.stepfunctions.Credentials
import io.cloudshiftdev.awscdk.services.stepfunctions.IntegrationPattern
import io.cloudshiftdev.awscdk.services.stepfunctions.TaskStateBaseProps
import io.cloudshiftdev.awscdk.services.stepfunctions.Timeout
import kotlin.Any
import kotlin.Deprecated
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import kotlin.jvm.JvmName

/**
 * Properties for creating an Amazon SageMaker transform job task.
 *
 * Example:
 *
 * ```
 * SageMakerCreateTransformJob.Builder.create(this, "Batch Inference")
 * .transformJobName("MyTransformJob")
 * .modelName("MyModelName")
 * .modelClientOptions(ModelClientOptions.builder()
 * .invocationsMaxRetries(3) // default is 0
 * .invocationsTimeout(Duration.minutes(5))
 * .build())
 * .transformInput(TransformInput.builder()
 * .transformDataSource(TransformDataSource.builder()
 * .s3DataSource(TransformS3DataSource.builder()
 * .s3Uri("s3://inputbucket/train")
 * .s3DataType(S3DataType.S3_PREFIX)
 * .build())
 * .build())
 * .build())
 * .transformOutput(TransformOutput.builder()
 * .s3OutputPath("s3://outputbucket/TransformJobOutputPath")
 * .build())
 * .transformResources(TransformResources.builder()
 * .instanceCount(1)
 * .instanceType(InstanceType.of(InstanceClass.M4, InstanceSize.XLARGE))
 * .build())
 * .build();
 * ```
 */
public interface SageMakerCreateTransformJobProps : TaskStateBaseProps {
  /**
   * Number of records to include in a mini-batch for an HTTP inference request.
   *
   * Default: - No batch strategy
   */
  public fun batchStrategy(): BatchStrategy? =
      unwrap(this).getBatchStrategy()?.let(BatchStrategy::wrap)

  /**
   * Environment variables to set in the Docker container.
   *
   * Default: - No environment variables
   */
  public fun environment(): Map<String, String> = unwrap(this).getEnvironment() ?: emptyMap()

  /**
   * Maximum number of parallel requests that can be sent to each instance in a transform job.
   *
   * Default: - Amazon SageMaker checks the optional execution-parameters to determine the settings
   * for your chosen algorithm.
   * If the execution-parameters endpoint is not enabled, the default value is 1.
   */
  public fun maxConcurrentTransforms(): Number? = unwrap(this).getMaxConcurrentTransforms()

  /**
   * Maximum allowed size of the payload, in MB.
   *
   * Default: 6
   */
  public fun maxPayload(): Size? = unwrap(this).getMaxPayload()?.let(Size::wrap)

  /**
   * Configures the timeout and maximum number of retries for processing a transform job invocation.
   *
   * Default: - 0 retries and 60 seconds of timeout
   */
  public fun modelClientOptions(): ModelClientOptions? =
      unwrap(this).getModelClientOptions()?.let(ModelClientOptions::wrap)

  /**
   * Name of the model that you want to use for the transform job.
   */
  public fun modelName(): String

  /**
   * Role for the Transform Job.
   *
   * Default: - A role is created with `AmazonSageMakerFullAccess` managed policy
   */
  public fun role(): IRole? = unwrap(this).getRole()?.let(IRole::wrap)

  /**
   * Tags to be applied to the train job.
   *
   * Default: - No tags
   */
  public fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

  /**
   * Dataset to be transformed and the Amazon S3 location where it is stored.
   */
  public fun transformInput(): TransformInput

  /**
   * Transform Job Name.
   */
  public fun transformJobName(): String

  /**
   * S3 location where you want Amazon SageMaker to save the results from the transform job.
   */
  public fun transformOutput(): TransformOutput

  /**
   * ML compute instances for the transform job.
   *
   * Default: - 1 instance of type M4.XLarge
   */
  public fun transformResources(): TransformResources? =
      unwrap(this).getTransformResources()?.let(TransformResources::wrap)

  /**
   * A builder for [SageMakerCreateTransformJobProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param batchStrategy Number of records to include in a mini-batch for an HTTP inference
     * request.
     */
    public fun batchStrategy(batchStrategy: BatchStrategy)

    /**
     * @param comment An optional description for this state.
     */
    public fun comment(comment: String)

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
    @JvmName("159aa3d67e0a952715613c7397b798fdc008ef748072832a87ee1baed95921c1")
    public fun credentials(credentials: Credentials.Builder.() -> Unit)

    /**
     * @param environment Environment variables to set in the Docker container.
     */
    public fun environment(environment: Map<String, String>)

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
     * @param maxConcurrentTransforms Maximum number of parallel requests that can be sent to each
     * instance in a transform job.
     */
    public fun maxConcurrentTransforms(maxConcurrentTransforms: Number)

    /**
     * @param maxPayload Maximum allowed size of the payload, in MB.
     */
    public fun maxPayload(maxPayload: Size)

    /**
     * @param modelClientOptions Configures the timeout and maximum number of retries for processing
     * a transform job invocation.
     */
    public fun modelClientOptions(modelClientOptions: ModelClientOptions)

    /**
     * @param modelClientOptions Configures the timeout and maximum number of retries for processing
     * a transform job invocation.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6b17015454edaf23e76bbaa259fdecc39ac3446e23062301ec17ecb95f925743")
    public fun modelClientOptions(modelClientOptions: ModelClientOptions.Builder.() -> Unit)

    /**
     * @param modelName Name of the model that you want to use for the transform job. 
     */
    public fun modelName(modelName: String)

    /**
     * @param outputPath JSONPath expression to select select a portion of the state output to pass
     * to the next state.
     * May also be the special value JsonPath.DISCARD, which will cause the effective
     * output to be the empty object {}.
     */
    public fun outputPath(outputPath: String)

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
     * @param role Role for the Transform Job.
     */
    public fun role(role: IRole)

    /**
     * @param stateName Optional name for this state.
     */
    public fun stateName(stateName: String)

    /**
     * @param tags Tags to be applied to the train job.
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

    /**
     * @param transformInput Dataset to be transformed and the Amazon S3 location where it is
     * stored. 
     */
    public fun transformInput(transformInput: TransformInput)

    /**
     * @param transformInput Dataset to be transformed and the Amazon S3 location where it is
     * stored. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7ac7cfcdf3f84e36627ba72aed2c353dae7611dc8b334ded0776319549feabab")
    public fun transformInput(transformInput: TransformInput.Builder.() -> Unit)

    /**
     * @param transformJobName Transform Job Name. 
     */
    public fun transformJobName(transformJobName: String)

    /**
     * @param transformOutput S3 location where you want Amazon SageMaker to save the results from
     * the transform job. 
     */
    public fun transformOutput(transformOutput: TransformOutput)

    /**
     * @param transformOutput S3 location where you want Amazon SageMaker to save the results from
     * the transform job. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7fabf72084c0711d1a38e257479295ef6e8b5e490446d7f5bac142ee4db43a75")
    public fun transformOutput(transformOutput: TransformOutput.Builder.() -> Unit)

    /**
     * @param transformResources ML compute instances for the transform job.
     */
    public fun transformResources(transformResources: TransformResources)

    /**
     * @param transformResources ML compute instances for the transform job.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8925d9f8bc5d75e4ecfe2e9f49b2fa219e6c1b34cbdba98d78923ab2b143ba78")
    public fun transformResources(transformResources: TransformResources.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.stepfunctions.tasks.SageMakerCreateTransformJobProps.Builder
        =
        software.amazon.awscdk.services.stepfunctions.tasks.SageMakerCreateTransformJobProps.builder()

    /**
     * @param batchStrategy Number of records to include in a mini-batch for an HTTP inference
     * request.
     */
    override fun batchStrategy(batchStrategy: BatchStrategy) {
      cdkBuilder.batchStrategy(batchStrategy.let(BatchStrategy::unwrap))
    }

    /**
     * @param comment An optional description for this state.
     */
    override fun comment(comment: String) {
      cdkBuilder.comment(comment)
    }

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
    @JvmName("159aa3d67e0a952715613c7397b798fdc008ef748072832a87ee1baed95921c1")
    override fun credentials(credentials: Credentials.Builder.() -> Unit): Unit =
        credentials(Credentials(credentials))

    /**
     * @param environment Environment variables to set in the Docker container.
     */
    override fun environment(environment: Map<String, String>) {
      cdkBuilder.environment(environment)
    }

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
     * @param maxConcurrentTransforms Maximum number of parallel requests that can be sent to each
     * instance in a transform job.
     */
    override fun maxConcurrentTransforms(maxConcurrentTransforms: Number) {
      cdkBuilder.maxConcurrentTransforms(maxConcurrentTransforms)
    }

    /**
     * @param maxPayload Maximum allowed size of the payload, in MB.
     */
    override fun maxPayload(maxPayload: Size) {
      cdkBuilder.maxPayload(maxPayload.let(Size::unwrap))
    }

    /**
     * @param modelClientOptions Configures the timeout and maximum number of retries for processing
     * a transform job invocation.
     */
    override fun modelClientOptions(modelClientOptions: ModelClientOptions) {
      cdkBuilder.modelClientOptions(modelClientOptions.let(ModelClientOptions::unwrap))
    }

    /**
     * @param modelClientOptions Configures the timeout and maximum number of retries for processing
     * a transform job invocation.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6b17015454edaf23e76bbaa259fdecc39ac3446e23062301ec17ecb95f925743")
    override fun modelClientOptions(modelClientOptions: ModelClientOptions.Builder.() -> Unit): Unit
        = modelClientOptions(ModelClientOptions(modelClientOptions))

    /**
     * @param modelName Name of the model that you want to use for the transform job. 
     */
    override fun modelName(modelName: String) {
      cdkBuilder.modelName(modelName)
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
      cdkBuilder.resultSelector(resultSelector)
    }

    /**
     * @param role Role for the Transform Job.
     */
    override fun role(role: IRole) {
      cdkBuilder.role(role.let(IRole::unwrap))
    }

    /**
     * @param stateName Optional name for this state.
     */
    override fun stateName(stateName: String) {
      cdkBuilder.stateName(stateName)
    }

    /**
     * @param tags Tags to be applied to the train job.
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

    /**
     * @param transformInput Dataset to be transformed and the Amazon S3 location where it is
     * stored. 
     */
    override fun transformInput(transformInput: TransformInput) {
      cdkBuilder.transformInput(transformInput.let(TransformInput::unwrap))
    }

    /**
     * @param transformInput Dataset to be transformed and the Amazon S3 location where it is
     * stored. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7ac7cfcdf3f84e36627ba72aed2c353dae7611dc8b334ded0776319549feabab")
    override fun transformInput(transformInput: TransformInput.Builder.() -> Unit): Unit =
        transformInput(TransformInput(transformInput))

    /**
     * @param transformJobName Transform Job Name. 
     */
    override fun transformJobName(transformJobName: String) {
      cdkBuilder.transformJobName(transformJobName)
    }

    /**
     * @param transformOutput S3 location where you want Amazon SageMaker to save the results from
     * the transform job. 
     */
    override fun transformOutput(transformOutput: TransformOutput) {
      cdkBuilder.transformOutput(transformOutput.let(TransformOutput::unwrap))
    }

    /**
     * @param transformOutput S3 location where you want Amazon SageMaker to save the results from
     * the transform job. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7fabf72084c0711d1a38e257479295ef6e8b5e490446d7f5bac142ee4db43a75")
    override fun transformOutput(transformOutput: TransformOutput.Builder.() -> Unit): Unit =
        transformOutput(TransformOutput(transformOutput))

    /**
     * @param transformResources ML compute instances for the transform job.
     */
    override fun transformResources(transformResources: TransformResources) {
      cdkBuilder.transformResources(transformResources.let(TransformResources::unwrap))
    }

    /**
     * @param transformResources ML compute instances for the transform job.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8925d9f8bc5d75e4ecfe2e9f49b2fa219e6c1b34cbdba98d78923ab2b143ba78")
    override fun transformResources(transformResources: TransformResources.Builder.() -> Unit): Unit
        = transformResources(TransformResources(transformResources))

    public fun build():
        software.amazon.awscdk.services.stepfunctions.tasks.SageMakerCreateTransformJobProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.stepfunctions.tasks.SageMakerCreateTransformJobProps,
  ) : CdkObject(cdkObject), SageMakerCreateTransformJobProps {
    /**
     * Number of records to include in a mini-batch for an HTTP inference request.
     *
     * Default: - No batch strategy
     */
    override fun batchStrategy(): BatchStrategy? =
        unwrap(this).getBatchStrategy()?.let(BatchStrategy::wrap)

    /**
     * An optional description for this state.
     *
     * Default: - No comment
     */
    override fun comment(): String? = unwrap(this).getComment()

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
     * Environment variables to set in the Docker container.
     *
     * Default: - No environment variables
     */
    override fun environment(): Map<String, String> = unwrap(this).getEnvironment() ?: emptyMap()

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
     * Maximum number of parallel requests that can be sent to each instance in a transform job.
     *
     * Default: - Amazon SageMaker checks the optional execution-parameters to determine the
     * settings for your chosen algorithm.
     * If the execution-parameters endpoint is not enabled, the default value is 1.
     */
    override fun maxConcurrentTransforms(): Number? = unwrap(this).getMaxConcurrentTransforms()

    /**
     * Maximum allowed size of the payload, in MB.
     *
     * Default: 6
     */
    override fun maxPayload(): Size? = unwrap(this).getMaxPayload()?.let(Size::wrap)

    /**
     * Configures the timeout and maximum number of retries for processing a transform job
     * invocation.
     *
     * Default: - 0 retries and 60 seconds of timeout
     */
    override fun modelClientOptions(): ModelClientOptions? =
        unwrap(this).getModelClientOptions()?.let(ModelClientOptions::wrap)

    /**
     * Name of the model that you want to use for the transform job.
     */
    override fun modelName(): String = unwrap(this).getModelName()

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
     * Role for the Transform Job.
     *
     * Default: - A role is created with `AmazonSageMakerFullAccess` managed policy
     */
    override fun role(): IRole? = unwrap(this).getRole()?.let(IRole::wrap)

    /**
     * Optional name for this state.
     *
     * Default: - The construct ID will be used as state name
     */
    override fun stateName(): String? = unwrap(this).getStateName()

    /**
     * Tags to be applied to the train job.
     *
     * Default: - No tags
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

    /**
     * Dataset to be transformed and the Amazon S3 location where it is stored.
     */
    override fun transformInput(): TransformInput =
        unwrap(this).getTransformInput().let(TransformInput::wrap)

    /**
     * Transform Job Name.
     */
    override fun transformJobName(): String = unwrap(this).getTransformJobName()

    /**
     * S3 location where you want Amazon SageMaker to save the results from the transform job.
     */
    override fun transformOutput(): TransformOutput =
        unwrap(this).getTransformOutput().let(TransformOutput::wrap)

    /**
     * ML compute instances for the transform job.
     *
     * Default: - 1 instance of type M4.XLarge
     */
    override fun transformResources(): TransformResources? =
        unwrap(this).getTransformResources()?.let(TransformResources::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): SageMakerCreateTransformJobProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.SageMakerCreateTransformJobProps):
        SageMakerCreateTransformJobProps = CdkObjectWrappers.wrap(cdkObject) as?
        SageMakerCreateTransformJobProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: SageMakerCreateTransformJobProps):
        software.amazon.awscdk.services.stepfunctions.tasks.SageMakerCreateTransformJobProps =
        (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.stepfunctions.tasks.SageMakerCreateTransformJobProps
  }
}
