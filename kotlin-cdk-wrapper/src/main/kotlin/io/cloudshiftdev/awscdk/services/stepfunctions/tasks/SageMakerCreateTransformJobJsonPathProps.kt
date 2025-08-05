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
import io.cloudshiftdev.awscdk.services.stepfunctions.QueryLanguage
import io.cloudshiftdev.awscdk.services.stepfunctions.TaskStateJsonPathBaseProps
import io.cloudshiftdev.awscdk.services.stepfunctions.Timeout
import kotlin.Any
import kotlin.Deprecated
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import kotlin.jvm.JvmName

/**
 * Properties for creating an Amazon SageMaker transform job task using JSONPath.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.*;
 * import io.cloudshiftdev.awscdk.services.ec2.*;
 * import io.cloudshiftdev.awscdk.services.iam.*;
 * import io.cloudshiftdev.awscdk.services.kms.*;
 * import io.cloudshiftdev.awscdk.services.stepfunctions.*;
 * import io.cloudshiftdev.awscdk.services.stepfunctions.tasks.*;
 * Object assign;
 * InstanceType instanceType;
 * Key key;
 * Object resultSelector;
 * Role role;
 * Size size;
 * TaskRole taskRole;
 * Timeout timeout;
 * SageMakerCreateTransformJobJsonPathProps sageMakerCreateTransformJobJsonPathProps =
 * SageMakerCreateTransformJobJsonPathProps.builder()
 * .modelName("modelName")
 * .transformInput(TransformInput.builder()
 * .transformDataSource(TransformDataSource.builder()
 * .s3DataSource(TransformS3DataSource.builder()
 * .s3Uri("s3Uri")
 * // the properties below are optional
 * .s3DataType(S3DataType.MANIFEST_FILE)
 * .build())
 * .build())
 * // the properties below are optional
 * .compressionType(CompressionType.NONE)
 * .contentType("contentType")
 * .splitType(SplitType.NONE)
 * .build())
 * .transformJobName("transformJobName")
 * .transformOutput(TransformOutput.builder()
 * .s3OutputPath("s3OutputPath")
 * // the properties below are optional
 * .accept("accept")
 * .assembleWith(AssembleWith.NONE)
 * .encryptionKey(key)
 * .build())
 * // the properties below are optional
 * .assign(Map.of(
 * "assignKey", assign))
 * .batchStrategy(BatchStrategy.MULTI_RECORD)
 * .comment("comment")
 * .credentials(Credentials.builder()
 * .role(taskRole)
 * .build())
 * .environment(Map.of(
 * "environmentKey", "environment"))
 * .heartbeat(Duration.minutes(30))
 * .heartbeatTimeout(timeout)
 * .inputPath("inputPath")
 * .integrationPattern(IntegrationPattern.REQUEST_RESPONSE)
 * .maxConcurrentTransforms(123)
 * .maxPayload(size)
 * .modelClientOptions(ModelClientOptions.builder()
 * .invocationsMaxRetries(123)
 * .invocationsTimeout(Duration.minutes(30))
 * .build())
 * .outputPath("outputPath")
 * .queryLanguage(QueryLanguage.JSON_PATH)
 * .resultPath("resultPath")
 * .resultSelector(Map.of(
 * "resultSelectorKey", resultSelector))
 * .role(role)
 * .stateName("stateName")
 * .tags(Map.of(
 * "tagsKey", "tags"))
 * .taskTimeout(timeout)
 * .timeout(Duration.minutes(30))
 * .transformResources(TransformResources.builder()
 * .instanceCount(123)
 * .instanceType(instanceType)
 * // the properties below are optional
 * .volumeEncryptionKey(key)
 * .build())
 * .build();
 * ```
 */
public interface SageMakerCreateTransformJobJsonPathProps : TaskStateJsonPathBaseProps {
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
   * A builder for [SageMakerCreateTransformJobJsonPathProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param assign Workflow variables to store in this step.
     * Using workflow variables, you can store data in a step and retrieve that data in future
     * steps.
     */
    public fun assign(assign: Map<String, Any>)

    /**
     * @param batchStrategy Number of records to include in a mini-batch for an HTTP inference
     * request.
     */
    public fun batchStrategy(batchStrategy: BatchStrategy)

    /**
     * @param comment A comment describing this state.
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
    @JvmName("9b2b3376981f460ece1b710e6757eff802c5b341935c50f8bc260ec2a1a5ece2")
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
    @JvmName("e724644caa03cf7554fe2d6097c7918516887170eac369cff7130048c1324143")
    public fun modelClientOptions(modelClientOptions: ModelClientOptions.Builder.() -> Unit)

    /**
     * @param modelName Name of the model that you want to use for the transform job. 
     */
    public fun modelName(modelName: String)

    /**
     * @param outputPath JSONPath expression to select part of the state to be the output to this
     * state.
     * May also be the special value JsonPath.DISCARD, which will cause the effective
     * output to be the empty object {}.
     */
    public fun outputPath(outputPath: String)

    /**
     * @param queryLanguage The name of the query language used by the state.
     * If the state does not contain a `queryLanguage` field,
     * then it will use the query language specified in the top-level `queryLanguage` field.
     */
    public fun queryLanguage(queryLanguage: QueryLanguage)

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
    @JvmName("3ff0e6813391ee8240a6eefd0cda9e730054626975ceb652d7954daded53f713")
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
    @JvmName("1261993e2d4b2c09bf97f5914c0a98b0f191f9e2b942d8305af8f6a58b6dea6c")
    public fun transformOutput(transformOutput: TransformOutput.Builder.() -> Unit)

    /**
     * @param transformResources ML compute instances for the transform job.
     */
    public fun transformResources(transformResources: TransformResources)

    /**
     * @param transformResources ML compute instances for the transform job.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("890186ba605bb6461c3439bbaf22abbb7ded4e9efd63998c3cd6ae57aa2216c0")
    public fun transformResources(transformResources: TransformResources.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.stepfunctions.tasks.SageMakerCreateTransformJobJsonPathProps.Builder
        =
        software.amazon.awscdk.services.stepfunctions.tasks.SageMakerCreateTransformJobJsonPathProps.builder()

    /**
     * @param assign Workflow variables to store in this step.
     * Using workflow variables, you can store data in a step and retrieve that data in future
     * steps.
     */
    override fun assign(assign: Map<String, Any>) {
      cdkBuilder.assign(assign.mapValues{CdkObjectWrappers.unwrap(it.value)})
    }

    /**
     * @param batchStrategy Number of records to include in a mini-batch for an HTTP inference
     * request.
     */
    override fun batchStrategy(batchStrategy: BatchStrategy) {
      cdkBuilder.batchStrategy(batchStrategy.let(BatchStrategy.Companion::unwrap))
    }

    /**
     * @param comment A comment describing this state.
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
      cdkBuilder.credentials(credentials.let(Credentials.Companion::unwrap))
    }

    /**
     * @param credentials Credentials for an IAM Role that the State Machine assumes for executing
     * the task.
     * This enables cross-account resource invocations.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9b2b3376981f460ece1b710e6757eff802c5b341935c50f8bc260ec2a1a5ece2")
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
      cdkBuilder.integrationPattern(integrationPattern.let(IntegrationPattern.Companion::unwrap))
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
      cdkBuilder.maxPayload(maxPayload.let(Size.Companion::unwrap))
    }

    /**
     * @param modelClientOptions Configures the timeout and maximum number of retries for processing
     * a transform job invocation.
     */
    override fun modelClientOptions(modelClientOptions: ModelClientOptions) {
      cdkBuilder.modelClientOptions(modelClientOptions.let(ModelClientOptions.Companion::unwrap))
    }

    /**
     * @param modelClientOptions Configures the timeout and maximum number of retries for processing
     * a transform job invocation.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e724644caa03cf7554fe2d6097c7918516887170eac369cff7130048c1324143")
    override fun modelClientOptions(modelClientOptions: ModelClientOptions.Builder.() -> Unit): Unit
        = modelClientOptions(ModelClientOptions(modelClientOptions))

    /**
     * @param modelName Name of the model that you want to use for the transform job. 
     */
    override fun modelName(modelName: String) {
      cdkBuilder.modelName(modelName)
    }

    /**
     * @param outputPath JSONPath expression to select part of the state to be the output to this
     * state.
     * May also be the special value JsonPath.DISCARD, which will cause the effective
     * output to be the empty object {}.
     */
    override fun outputPath(outputPath: String) {
      cdkBuilder.outputPath(outputPath)
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
     * @param role Role for the Transform Job.
     */
    override fun role(role: IRole) {
      cdkBuilder.role(role.let(IRole.Companion::unwrap))
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

    /**
     * @param transformInput Dataset to be transformed and the Amazon S3 location where it is
     * stored. 
     */
    override fun transformInput(transformInput: TransformInput) {
      cdkBuilder.transformInput(transformInput.let(TransformInput.Companion::unwrap))
    }

    /**
     * @param transformInput Dataset to be transformed and the Amazon S3 location where it is
     * stored. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3ff0e6813391ee8240a6eefd0cda9e730054626975ceb652d7954daded53f713")
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
      cdkBuilder.transformOutput(transformOutput.let(TransformOutput.Companion::unwrap))
    }

    /**
     * @param transformOutput S3 location where you want Amazon SageMaker to save the results from
     * the transform job. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1261993e2d4b2c09bf97f5914c0a98b0f191f9e2b942d8305af8f6a58b6dea6c")
    override fun transformOutput(transformOutput: TransformOutput.Builder.() -> Unit): Unit =
        transformOutput(TransformOutput(transformOutput))

    /**
     * @param transformResources ML compute instances for the transform job.
     */
    override fun transformResources(transformResources: TransformResources) {
      cdkBuilder.transformResources(transformResources.let(TransformResources.Companion::unwrap))
    }

    /**
     * @param transformResources ML compute instances for the transform job.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("890186ba605bb6461c3439bbaf22abbb7ded4e9efd63998c3cd6ae57aa2216c0")
    override fun transformResources(transformResources: TransformResources.Builder.() -> Unit): Unit
        = transformResources(TransformResources(transformResources))

    public fun build():
        software.amazon.awscdk.services.stepfunctions.tasks.SageMakerCreateTransformJobJsonPathProps
        = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.SageMakerCreateTransformJobJsonPathProps,
  ) : CdkObject(cdkObject),
      SageMakerCreateTransformJobJsonPathProps {
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
     * Number of records to include in a mini-batch for an HTTP inference request.
     *
     * Default: - No batch strategy
     */
    override fun batchStrategy(): BatchStrategy? =
        unwrap(this).getBatchStrategy()?.let(BatchStrategy::wrap)

    /**
     * A comment describing this state.
     *
     * Default: No comment
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
     * Default: $
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
     * JSONPath expression to select part of the state to be the output to this state.
     *
     * May also be the special value JsonPath.DISCARD, which will cause the effective
     * output to be the empty object {}.
     *
     * Default: $
     */
    override fun outputPath(): String? = unwrap(this).getOutputPath()

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
     * JSONPath expression to indicate where to inject the state's output.
     *
     * May also be the special value JsonPath.DISCARD, which will cause the state's
     * input to become its output.
     *
     * Default: $
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
    public operator fun invoke(block: Builder.() -> Unit = {}):
        SageMakerCreateTransformJobJsonPathProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.SageMakerCreateTransformJobJsonPathProps):
        SageMakerCreateTransformJobJsonPathProps = CdkObjectWrappers.wrap(cdkObject) as?
        SageMakerCreateTransformJobJsonPathProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: SageMakerCreateTransformJobJsonPathProps):
        software.amazon.awscdk.services.stepfunctions.tasks.SageMakerCreateTransformJobJsonPathProps
        = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.stepfunctions.tasks.SageMakerCreateTransformJobJsonPathProps
  }
}
