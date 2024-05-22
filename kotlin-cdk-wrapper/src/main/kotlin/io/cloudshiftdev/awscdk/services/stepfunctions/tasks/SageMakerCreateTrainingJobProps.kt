@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions.tasks

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.iam.IRole
import io.cloudshiftdev.awscdk.services.stepfunctions.Credentials
import io.cloudshiftdev.awscdk.services.stepfunctions.IntegrationPattern
import io.cloudshiftdev.awscdk.services.stepfunctions.TaskStateBaseProps
import io.cloudshiftdev.awscdk.services.stepfunctions.Timeout
import kotlin.Any
import kotlin.Boolean
import kotlin.Deprecated
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName

/**
 * Properties for creating an Amazon SageMaker training job.
 *
 * Example:
 *
 * ```
 * SageMakerCreateTrainingJob.Builder.create(this, "TrainSagemaker")
 * .trainingJobName(JsonPath.stringAt("$.JobName"))
 * .algorithmSpecification(AlgorithmSpecification.builder()
 * .algorithmName("BlazingText")
 * .trainingInputMode(InputMode.FILE)
 * .build())
 * .inputDataConfig(List.of(Channel.builder()
 * .channelName("train")
 * .dataSource(DataSource.builder()
 * .s3DataSource(S3DataSource.builder()
 * .s3DataType(S3DataType.S3_PREFIX)
 * .s3Location(S3Location.fromJsonExpression("$.S3Bucket"))
 * .build())
 * .build())
 * .build()))
 * .outputDataConfig(OutputDataConfig.builder()
 * .s3OutputLocation(S3Location.fromBucket(Bucket.fromBucketName(this, "Bucket", "mybucket"),
 * "myoutputpath"))
 * .build())
 * .resourceConfig(ResourceConfig.builder()
 * .instanceCount(1)
 * .instanceType(new InstanceType(JsonPath.stringAt("$.InstanceType")))
 * .volumeSize(Size.gibibytes(50))
 * .build()) // optional: default is 1 instance of EC2 `M4.XLarge` with `10GB` volume
 * .stoppingCondition(StoppingCondition.builder()
 * .maxRuntime(Duration.hours(2))
 * .build())
 * .build();
 * ```
 */
public interface SageMakerCreateTrainingJobProps : TaskStateBaseProps {
  /**
   * Identifies the training algorithm to use.
   */
  public fun algorithmSpecification(): AlgorithmSpecification

  /**
   * Isolates the training container.
   *
   * No inbound or outbound network calls can be made to or from the training container.
   *
   * Default: false
   */
  public fun enableNetworkIsolation(): Boolean? = unwrap(this).getEnableNetworkIsolation()

  /**
   * Environment variables to set in the Docker container.
   *
   * Default: - No environment variables
   */
  public fun environment(): Map<String, String> = unwrap(this).getEnvironment() ?: emptyMap()

  /**
   * Algorithm-specific parameters that influence the quality of the model.
   *
   * Set hyperparameters before you start the learning process.
   * For a list of hyperparameters provided by Amazon SageMaker
   *
   * Default: - No hyperparameters
   *
   * [Documentation](https://docs.aws.amazon.com/sagemaker/latest/dg/algos.html)
   */
  public fun hyperparameters(): Map<String, Any> = unwrap(this).getHyperparameters() ?: emptyMap()

  /**
   * Describes the various datasets (e.g. train, validation, test) and the Amazon S3 location where
   * stored.
   */
  public fun inputDataConfig(): List<Channel>

  /**
   * Identifies the Amazon S3 location where you want Amazon SageMaker to save the results of model
   * training.
   */
  public fun outputDataConfig(): OutputDataConfig

  /**
   * Specifies the resources, ML compute instances, and ML storage volumes to deploy for model
   * training.
   *
   * Default: - 1 instance of EC2 `M4.XLarge` with `10GB` volume
   */
  public fun resourceConfig(): ResourceConfig? =
      unwrap(this).getResourceConfig()?.let(ResourceConfig::wrap)

  /**
   * Role for the Training Job.
   *
   * The role must be granted all necessary permissions for the SageMaker training job to
   * be able to operate.
   *
   * See
   * https://docs.aws.amazon.com/fr_fr/sagemaker/latest/dg/sagemaker-roles.html#sagemaker-roles-createtrainingjob-perms
   *
   * Default: - a role will be created.
   */
  public fun role(): IRole? = unwrap(this).getRole()?.let(IRole::wrap)

  /**
   * Sets a time limit for training.
   *
   * Default: - max runtime of 1 hour
   */
  public fun stoppingCondition(): StoppingCondition? =
      unwrap(this).getStoppingCondition()?.let(StoppingCondition::wrap)

  /**
   * Tags to be applied to the train job.
   *
   * Default: - No tags
   */
  public fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

  /**
   * Training Job Name.
   */
  public fun trainingJobName(): String

  /**
   * Specifies the VPC that you want your training job to connect to.
   *
   * Default: - No VPC
   */
  public fun vpcConfig(): VpcConfig? = unwrap(this).getVpcConfig()?.let(VpcConfig::wrap)

  /**
   * A builder for [SageMakerCreateTrainingJobProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param algorithmSpecification Identifies the training algorithm to use. 
     */
    public fun algorithmSpecification(algorithmSpecification: AlgorithmSpecification)

    /**
     * @param algorithmSpecification Identifies the training algorithm to use. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a62dd329b20c5fbc313a557f900ab6b5335cdee6740df83f0817f71cacd3949f")
    public
        fun algorithmSpecification(algorithmSpecification: AlgorithmSpecification.Builder.() -> Unit)

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
    @JvmName("a73eb1e212d218edba51fd72ee2f10c8a7e6b9872a42855d7d8336a02cc0c000")
    public fun credentials(credentials: Credentials.Builder.() -> Unit)

    /**
     * @param enableNetworkIsolation Isolates the training container.
     * No inbound or outbound network calls can be made to or from the training container.
     */
    public fun enableNetworkIsolation(enableNetworkIsolation: Boolean)

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
     * @param hyperparameters Algorithm-specific parameters that influence the quality of the model.
     * Set hyperparameters before you start the learning process.
     * For a list of hyperparameters provided by Amazon SageMaker
     */
    public fun hyperparameters(hyperparameters: Map<String, Any>)

    /**
     * @param inputDataConfig Describes the various datasets (e.g. train, validation, test) and the
     * Amazon S3 location where stored. 
     */
    public fun inputDataConfig(inputDataConfig: List<Channel>)

    /**
     * @param inputDataConfig Describes the various datasets (e.g. train, validation, test) and the
     * Amazon S3 location where stored. 
     */
    public fun inputDataConfig(vararg inputDataConfig: Channel)

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
     * @param outputDataConfig Identifies the Amazon S3 location where you want Amazon SageMaker to
     * save the results of model training. 
     */
    public fun outputDataConfig(outputDataConfig: OutputDataConfig)

    /**
     * @param outputDataConfig Identifies the Amazon S3 location where you want Amazon SageMaker to
     * save the results of model training. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("148eca6aaa48208c1417261edb06299348c8c6d0d05efce1c2a3f52e43b6701f")
    public fun outputDataConfig(outputDataConfig: OutputDataConfig.Builder.() -> Unit)

    /**
     * @param outputPath JSONPath expression to select select a portion of the state output to pass
     * to the next state.
     * May also be the special value JsonPath.DISCARD, which will cause the effective
     * output to be the empty object {}.
     */
    public fun outputPath(outputPath: String)

    /**
     * @param resourceConfig Specifies the resources, ML compute instances, and ML storage volumes
     * to deploy for model training.
     */
    public fun resourceConfig(resourceConfig: ResourceConfig)

    /**
     * @param resourceConfig Specifies the resources, ML compute instances, and ML storage volumes
     * to deploy for model training.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8e10711462a1cb6a118e39cc90fdfc47378f3c83c3d0c8dc7f016aaed0842f9a")
    public fun resourceConfig(resourceConfig: ResourceConfig.Builder.() -> Unit)

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
     * @param role Role for the Training Job.
     * The role must be granted all necessary permissions for the SageMaker training job to
     * be able to operate.
     *
     * See
     * https://docs.aws.amazon.com/fr_fr/sagemaker/latest/dg/sagemaker-roles.html#sagemaker-roles-createtrainingjob-perms
     */
    public fun role(role: IRole)

    /**
     * @param stateName Optional name for this state.
     */
    public fun stateName(stateName: String)

    /**
     * @param stoppingCondition Sets a time limit for training.
     */
    public fun stoppingCondition(stoppingCondition: StoppingCondition)

    /**
     * @param stoppingCondition Sets a time limit for training.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("700b01f8c12666b4d5f4b3148047df4df0b6c4b7988d060e067ac919d8fab24f")
    public fun stoppingCondition(stoppingCondition: StoppingCondition.Builder.() -> Unit)

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
     * @param trainingJobName Training Job Name. 
     */
    public fun trainingJobName(trainingJobName: String)

    /**
     * @param vpcConfig Specifies the VPC that you want your training job to connect to.
     */
    public fun vpcConfig(vpcConfig: VpcConfig)

    /**
     * @param vpcConfig Specifies the VPC that you want your training job to connect to.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("446ace8c72d501f0e2e095a3266ee045c8ff9481fb95a964796d40a9583dfc38")
    public fun vpcConfig(vpcConfig: VpcConfig.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.stepfunctions.tasks.SageMakerCreateTrainingJobProps.Builder
        =
        software.amazon.awscdk.services.stepfunctions.tasks.SageMakerCreateTrainingJobProps.builder()

    /**
     * @param algorithmSpecification Identifies the training algorithm to use. 
     */
    override fun algorithmSpecification(algorithmSpecification: AlgorithmSpecification) {
      cdkBuilder.algorithmSpecification(algorithmSpecification.let(AlgorithmSpecification.Companion::unwrap))
    }

    /**
     * @param algorithmSpecification Identifies the training algorithm to use. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a62dd329b20c5fbc313a557f900ab6b5335cdee6740df83f0817f71cacd3949f")
    override
        fun algorithmSpecification(algorithmSpecification: AlgorithmSpecification.Builder.() -> Unit):
        Unit = algorithmSpecification(AlgorithmSpecification(algorithmSpecification))

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
      cdkBuilder.credentials(credentials.let(Credentials.Companion::unwrap))
    }

    /**
     * @param credentials Credentials for an IAM Role that the State Machine assumes for executing
     * the task.
     * This enables cross-account resource invocations.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a73eb1e212d218edba51fd72ee2f10c8a7e6b9872a42855d7d8336a02cc0c000")
    override fun credentials(credentials: Credentials.Builder.() -> Unit): Unit =
        credentials(Credentials(credentials))

    /**
     * @param enableNetworkIsolation Isolates the training container.
     * No inbound or outbound network calls can be made to or from the training container.
     */
    override fun enableNetworkIsolation(enableNetworkIsolation: Boolean) {
      cdkBuilder.enableNetworkIsolation(enableNetworkIsolation)
    }

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
     * @param hyperparameters Algorithm-specific parameters that influence the quality of the model.
     * Set hyperparameters before you start the learning process.
     * For a list of hyperparameters provided by Amazon SageMaker
     */
    override fun hyperparameters(hyperparameters: Map<String, Any>) {
      cdkBuilder.hyperparameters(hyperparameters.mapValues{CdkObjectWrappers.unwrap(it.value)})
    }

    /**
     * @param inputDataConfig Describes the various datasets (e.g. train, validation, test) and the
     * Amazon S3 location where stored. 
     */
    override fun inputDataConfig(inputDataConfig: List<Channel>) {
      cdkBuilder.inputDataConfig(inputDataConfig.map(Channel.Companion::unwrap))
    }

    /**
     * @param inputDataConfig Describes the various datasets (e.g. train, validation, test) and the
     * Amazon S3 location where stored. 
     */
    override fun inputDataConfig(vararg inputDataConfig: Channel): Unit =
        inputDataConfig(inputDataConfig.toList())

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
     * @param outputDataConfig Identifies the Amazon S3 location where you want Amazon SageMaker to
     * save the results of model training. 
     */
    override fun outputDataConfig(outputDataConfig: OutputDataConfig) {
      cdkBuilder.outputDataConfig(outputDataConfig.let(OutputDataConfig.Companion::unwrap))
    }

    /**
     * @param outputDataConfig Identifies the Amazon S3 location where you want Amazon SageMaker to
     * save the results of model training. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("148eca6aaa48208c1417261edb06299348c8c6d0d05efce1c2a3f52e43b6701f")
    override fun outputDataConfig(outputDataConfig: OutputDataConfig.Builder.() -> Unit): Unit =
        outputDataConfig(OutputDataConfig(outputDataConfig))

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
     * @param resourceConfig Specifies the resources, ML compute instances, and ML storage volumes
     * to deploy for model training.
     */
    override fun resourceConfig(resourceConfig: ResourceConfig) {
      cdkBuilder.resourceConfig(resourceConfig.let(ResourceConfig.Companion::unwrap))
    }

    /**
     * @param resourceConfig Specifies the resources, ML compute instances, and ML storage volumes
     * to deploy for model training.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8e10711462a1cb6a118e39cc90fdfc47378f3c83c3d0c8dc7f016aaed0842f9a")
    override fun resourceConfig(resourceConfig: ResourceConfig.Builder.() -> Unit): Unit =
        resourceConfig(ResourceConfig(resourceConfig))

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
     * @param role Role for the Training Job.
     * The role must be granted all necessary permissions for the SageMaker training job to
     * be able to operate.
     *
     * See
     * https://docs.aws.amazon.com/fr_fr/sagemaker/latest/dg/sagemaker-roles.html#sagemaker-roles-createtrainingjob-perms
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
     * @param stoppingCondition Sets a time limit for training.
     */
    override fun stoppingCondition(stoppingCondition: StoppingCondition) {
      cdkBuilder.stoppingCondition(stoppingCondition.let(StoppingCondition.Companion::unwrap))
    }

    /**
     * @param stoppingCondition Sets a time limit for training.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("700b01f8c12666b4d5f4b3148047df4df0b6c4b7988d060e067ac919d8fab24f")
    override fun stoppingCondition(stoppingCondition: StoppingCondition.Builder.() -> Unit): Unit =
        stoppingCondition(StoppingCondition(stoppingCondition))

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
     * @param trainingJobName Training Job Name. 
     */
    override fun trainingJobName(trainingJobName: String) {
      cdkBuilder.trainingJobName(trainingJobName)
    }

    /**
     * @param vpcConfig Specifies the VPC that you want your training job to connect to.
     */
    override fun vpcConfig(vpcConfig: VpcConfig) {
      cdkBuilder.vpcConfig(vpcConfig.let(VpcConfig.Companion::unwrap))
    }

    /**
     * @param vpcConfig Specifies the VPC that you want your training job to connect to.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("446ace8c72d501f0e2e095a3266ee045c8ff9481fb95a964796d40a9583dfc38")
    override fun vpcConfig(vpcConfig: VpcConfig.Builder.() -> Unit): Unit =
        vpcConfig(VpcConfig(vpcConfig))

    public fun build():
        software.amazon.awscdk.services.stepfunctions.tasks.SageMakerCreateTrainingJobProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.SageMakerCreateTrainingJobProps,
  ) : CdkObject(cdkObject), SageMakerCreateTrainingJobProps {
    /**
     * Identifies the training algorithm to use.
     */
    override fun algorithmSpecification(): AlgorithmSpecification =
        unwrap(this).getAlgorithmSpecification().let(AlgorithmSpecification::wrap)

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
     * Isolates the training container.
     *
     * No inbound or outbound network calls can be made to or from the training container.
     *
     * Default: false
     */
    override fun enableNetworkIsolation(): Boolean? = unwrap(this).getEnableNetworkIsolation()

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
     * Algorithm-specific parameters that influence the quality of the model.
     *
     * Set hyperparameters before you start the learning process.
     * For a list of hyperparameters provided by Amazon SageMaker
     *
     * Default: - No hyperparameters
     *
     * [Documentation](https://docs.aws.amazon.com/sagemaker/latest/dg/algos.html)
     */
    override fun hyperparameters(): Map<String, Any> = unwrap(this).getHyperparameters() ?:
        emptyMap()

    /**
     * Describes the various datasets (e.g. train, validation, test) and the Amazon S3 location
     * where stored.
     */
    override fun inputDataConfig(): List<Channel> =
        unwrap(this).getInputDataConfig().map(Channel::wrap)

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
     * Identifies the Amazon S3 location where you want Amazon SageMaker to save the results of
     * model training.
     */
    override fun outputDataConfig(): OutputDataConfig =
        unwrap(this).getOutputDataConfig().let(OutputDataConfig::wrap)

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
     * Specifies the resources, ML compute instances, and ML storage volumes to deploy for model
     * training.
     *
     * Default: - 1 instance of EC2 `M4.XLarge` with `10GB` volume
     */
    override fun resourceConfig(): ResourceConfig? =
        unwrap(this).getResourceConfig()?.let(ResourceConfig::wrap)

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
     * Role for the Training Job.
     *
     * The role must be granted all necessary permissions for the SageMaker training job to
     * be able to operate.
     *
     * See
     * https://docs.aws.amazon.com/fr_fr/sagemaker/latest/dg/sagemaker-roles.html#sagemaker-roles-createtrainingjob-perms
     *
     * Default: - a role will be created.
     */
    override fun role(): IRole? = unwrap(this).getRole()?.let(IRole::wrap)

    /**
     * Optional name for this state.
     *
     * Default: - The construct ID will be used as state name
     */
    override fun stateName(): String? = unwrap(this).getStateName()

    /**
     * Sets a time limit for training.
     *
     * Default: - max runtime of 1 hour
     */
    override fun stoppingCondition(): StoppingCondition? =
        unwrap(this).getStoppingCondition()?.let(StoppingCondition::wrap)

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
     * Training Job Name.
     */
    override fun trainingJobName(): String = unwrap(this).getTrainingJobName()

    /**
     * Specifies the VPC that you want your training job to connect to.
     *
     * Default: - No VPC
     */
    override fun vpcConfig(): VpcConfig? = unwrap(this).getVpcConfig()?.let(VpcConfig::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): SageMakerCreateTrainingJobProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.SageMakerCreateTrainingJobProps):
        SageMakerCreateTrainingJobProps = CdkObjectWrappers.wrap(cdkObject) as?
        SageMakerCreateTrainingJobProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: SageMakerCreateTrainingJobProps):
        software.amazon.awscdk.services.stepfunctions.tasks.SageMakerCreateTrainingJobProps =
        (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.stepfunctions.tasks.SageMakerCreateTrainingJobProps
  }
}
