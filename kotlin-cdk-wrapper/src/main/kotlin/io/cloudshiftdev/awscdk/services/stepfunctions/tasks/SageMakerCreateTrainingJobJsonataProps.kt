@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions.tasks

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.iam.IRole
import io.cloudshiftdev.awscdk.services.stepfunctions.Credentials
import io.cloudshiftdev.awscdk.services.stepfunctions.IntegrationPattern
import io.cloudshiftdev.awscdk.services.stepfunctions.QueryLanguage
import io.cloudshiftdev.awscdk.services.stepfunctions.TaskStateJsonataBaseProps
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
 * Properties for creating an Amazon SageMaker training job using JSONata.
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
 * DockerImage dockerImage;
 * Object hyperparameters;
 * InstanceType instanceType;
 * Key key;
 * Object outputs;
 * Role role;
 * S3Location s3Location;
 * Size size;
 * Subnet subnet;
 * SubnetFilter subnetFilter;
 * TaskRole taskRole;
 * Timeout timeout;
 * Vpc vpc;
 * SageMakerCreateTrainingJobJsonataProps sageMakerCreateTrainingJobJsonataProps =
 * SageMakerCreateTrainingJobJsonataProps.builder()
 * .algorithmSpecification(AlgorithmSpecification.builder()
 * .algorithmName("algorithmName")
 * .metricDefinitions(List.of(MetricDefinition.builder()
 * .name("name")
 * .regex("regex")
 * .build()))
 * .trainingImage(dockerImage)
 * .trainingInputMode(InputMode.PIPE)
 * .build())
 * .outputDataConfig(OutputDataConfig.builder()
 * .s3OutputLocation(s3Location)
 * // the properties below are optional
 * .encryptionKey(key)
 * .build())
 * .trainingJobName("trainingJobName")
 * // the properties below are optional
 * .assign(Map.of(
 * "assignKey", assign))
 * .comment("comment")
 * .credentials(Credentials.builder()
 * .role(taskRole)
 * .build())
 * .enableNetworkIsolation(false)
 * .environment(Map.of(
 * "environmentKey", "environment"))
 * .heartbeat(Duration.minutes(30))
 * .heartbeatTimeout(timeout)
 * .hyperparameters(Map.of(
 * "hyperparametersKey", hyperparameters))
 * .inputDataConfig(List.of(Channel.builder()
 * .channelName("channelName")
 * .dataSource(DataSource.builder()
 * .s3DataSource(S3DataSource.builder()
 * .s3Location(s3Location)
 * // the properties below are optional
 * .attributeNames(List.of("attributeNames"))
 * .s3DataDistributionType(S3DataDistributionType.FULLY_REPLICATED)
 * .s3DataType(S3DataType.MANIFEST_FILE)
 * .build())
 * .build())
 * // the properties below are optional
 * .compressionType(CompressionType.NONE)
 * .contentType("contentType")
 * .inputMode(InputMode.PIPE)
 * .recordWrapperType(RecordWrapperType.NONE)
 * .shuffleConfig(ShuffleConfig.builder()
 * .seed(123)
 * .build())
 * .build()))
 * .integrationPattern(IntegrationPattern.REQUEST_RESPONSE)
 * .outputs(outputs)
 * .queryLanguage(QueryLanguage.JSON_PATH)
 * .resourceConfig(ResourceConfig.builder()
 * .instanceCount(123)
 * .instanceType(instanceType)
 * .volumeSize(size)
 * // the properties below are optional
 * .volumeEncryptionKey(key)
 * .build())
 * .role(role)
 * .stateName("stateName")
 * .stoppingCondition(StoppingCondition.builder()
 * .maxRuntime(Duration.minutes(30))
 * .build())
 * .tags(Map.of(
 * "tagsKey", "tags"))
 * .taskTimeout(timeout)
 * .timeout(Duration.minutes(30))
 * .vpcConfig(VpcConfig.builder()
 * .vpc(vpc)
 * // the properties below are optional
 * .subnets(SubnetSelection.builder()
 * .availabilityZones(List.of("availabilityZones"))
 * .onePerAz(false)
 * .subnetFilters(List.of(subnetFilter))
 * .subnetGroupName("subnetGroupName")
 * .subnets(List.of(subnet))
 * .subnetType(SubnetType.PRIVATE_ISOLATED)
 * .build())
 * .build())
 * .build();
 * ```
 */
public interface SageMakerCreateTrainingJobJsonataProps : TaskStateJsonataBaseProps {
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
   *
   * Default: - No inputDataConfig
   */
  public fun inputDataConfig(): List<Channel> =
      unwrap(this).getInputDataConfig()?.map(Channel::wrap) ?: emptyList()

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
   * A builder for [SageMakerCreateTrainingJobJsonataProps]
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
    @JvmName("acb3fabfefb99f2d5a21849aaa6954b5c5768b8f248b0c9c4c20d08503a988c9")
    public
        fun algorithmSpecification(algorithmSpecification: AlgorithmSpecification.Builder.() -> Unit)

    /**
     * @param assign Workflow variables to store in this step.
     * Using workflow variables, you can store data in a step and retrieve that data in future
     * steps.
     */
    public fun assign(assign: Map<String, Any>)

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
    @JvmName("a91ee5c377d67030e9fe1d8c01001acef391e4a409dbaee59eff3c1a78d29e10")
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
    @JvmName("8029239e95cb3dd2959d976563e583f4e2d12d1dfbe43d94a205d0c8eded6a90")
    public fun outputDataConfig(outputDataConfig: OutputDataConfig.Builder.() -> Unit)

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
     * @param queryLanguage The name of the query language used by the state.
     * If the state does not contain a `queryLanguage` field,
     * then it will use the query language specified in the top-level `queryLanguage` field.
     */
    public fun queryLanguage(queryLanguage: QueryLanguage)

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
    @JvmName("756623ef66b9bac6e85be890b8198e0c0fcffd915c4ca9b09c0e480e1d6dfeba")
    public fun resourceConfig(resourceConfig: ResourceConfig.Builder.() -> Unit)

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
    @JvmName("3f383076caf0c7d416582e73fb03ccd4a24516c4195b108c236672c154f771c5")
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
    @JvmName("69c67779f08288465f649995659fe17268bb94a64207c41d6e303892b42eae56")
    public fun vpcConfig(vpcConfig: VpcConfig.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.stepfunctions.tasks.SageMakerCreateTrainingJobJsonataProps.Builder
        =
        software.amazon.awscdk.services.stepfunctions.tasks.SageMakerCreateTrainingJobJsonataProps.builder()

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
    @JvmName("acb3fabfefb99f2d5a21849aaa6954b5c5768b8f248b0c9c4c20d08503a988c9")
    override
        fun algorithmSpecification(algorithmSpecification: AlgorithmSpecification.Builder.() -> Unit):
        Unit = algorithmSpecification(AlgorithmSpecification(algorithmSpecification))

    /**
     * @param assign Workflow variables to store in this step.
     * Using workflow variables, you can store data in a step and retrieve that data in future
     * steps.
     */
    override fun assign(assign: Map<String, Any>) {
      cdkBuilder.assign(assign.mapValues{CdkObjectWrappers.unwrap(it.value)})
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
    @JvmName("a91ee5c377d67030e9fe1d8c01001acef391e4a409dbaee59eff3c1a78d29e10")
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
    @JvmName("8029239e95cb3dd2959d976563e583f4e2d12d1dfbe43d94a205d0c8eded6a90")
    override fun outputDataConfig(outputDataConfig: OutputDataConfig.Builder.() -> Unit): Unit =
        outputDataConfig(OutputDataConfig(outputDataConfig))

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
     * @param queryLanguage The name of the query language used by the state.
     * If the state does not contain a `queryLanguage` field,
     * then it will use the query language specified in the top-level `queryLanguage` field.
     */
    override fun queryLanguage(queryLanguage: QueryLanguage) {
      cdkBuilder.queryLanguage(queryLanguage.let(QueryLanguage.Companion::unwrap))
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
    @JvmName("756623ef66b9bac6e85be890b8198e0c0fcffd915c4ca9b09c0e480e1d6dfeba")
    override fun resourceConfig(resourceConfig: ResourceConfig.Builder.() -> Unit): Unit =
        resourceConfig(ResourceConfig(resourceConfig))

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
    @JvmName("3f383076caf0c7d416582e73fb03ccd4a24516c4195b108c236672c154f771c5")
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
    @JvmName("69c67779f08288465f649995659fe17268bb94a64207c41d6e303892b42eae56")
    override fun vpcConfig(vpcConfig: VpcConfig.Builder.() -> Unit): Unit =
        vpcConfig(VpcConfig(vpcConfig))

    public fun build():
        software.amazon.awscdk.services.stepfunctions.tasks.SageMakerCreateTrainingJobJsonataProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.SageMakerCreateTrainingJobJsonataProps,
  ) : CdkObject(cdkObject),
      SageMakerCreateTrainingJobJsonataProps {
    /**
     * Identifies the training algorithm to use.
     */
    override fun algorithmSpecification(): AlgorithmSpecification =
        unwrap(this).getAlgorithmSpecification().let(AlgorithmSpecification::wrap)

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
     *
     * Default: - No inputDataConfig
     */
    override fun inputDataConfig(): List<Channel> =
        unwrap(this).getInputDataConfig()?.map(Channel::wrap) ?: emptyList()

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
     * Specifies the resources, ML compute instances, and ML storage volumes to deploy for model
     * training.
     *
     * Default: - 1 instance of EC2 `M4.XLarge` with `10GB` volume
     */
    override fun resourceConfig(): ResourceConfig? =
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
    public operator fun invoke(block: Builder.() -> Unit = {}):
        SageMakerCreateTrainingJobJsonataProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.SageMakerCreateTrainingJobJsonataProps):
        SageMakerCreateTrainingJobJsonataProps = CdkObjectWrappers.wrap(cdkObject) as?
        SageMakerCreateTrainingJobJsonataProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: SageMakerCreateTrainingJobJsonataProps):
        software.amazon.awscdk.services.stepfunctions.tasks.SageMakerCreateTrainingJobJsonataProps =
        (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.stepfunctions.tasks.SageMakerCreateTrainingJobJsonataProps
  }
}
