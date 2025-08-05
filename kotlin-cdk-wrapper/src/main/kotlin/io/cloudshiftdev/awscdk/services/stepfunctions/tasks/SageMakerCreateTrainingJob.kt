@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions.tasks

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.ec2.Connections
import io.cloudshiftdev.awscdk.services.ec2.IConnectable
import io.cloudshiftdev.awscdk.services.ec2.ISecurityGroup
import io.cloudshiftdev.awscdk.services.iam.IGrantable
import io.cloudshiftdev.awscdk.services.iam.IPrincipal
import io.cloudshiftdev.awscdk.services.iam.IRole
import io.cloudshiftdev.awscdk.services.stepfunctions.Credentials
import io.cloudshiftdev.awscdk.services.stepfunctions.IntegrationPattern
import io.cloudshiftdev.awscdk.services.stepfunctions.QueryLanguage
import io.cloudshiftdev.awscdk.services.stepfunctions.TaskStateBase
import io.cloudshiftdev.awscdk.services.stepfunctions.Timeout
import kotlin.Any
import kotlin.Boolean
import kotlin.Deprecated
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Class representing the SageMaker Create Training Job task.
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
 * .s3OutputLocation(S3Location.fromBucket(Bucket.fromBucketName(this, "Bucket",
 * "amzn-s3-demo-bucket"), "myoutputpath"))
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
public open class SageMakerCreateTrainingJob(
  cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.SageMakerCreateTrainingJob,
) : TaskStateBase(cdkObject),
    IGrantable,
    IConnectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: SageMakerCreateTrainingJobProps,
  ) :
      this(software.amazon.awscdk.services.stepfunctions.tasks.SageMakerCreateTrainingJob(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(SageMakerCreateTrainingJobProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: SageMakerCreateTrainingJobProps.Builder.() -> Unit,
  ) : this(scope, id, SageMakerCreateTrainingJobProps(props)
  )

  /**
   * Add the security group to all instances via the launch configuration security groups array.
   *
   * @param securityGroup : The security group to add. 
   */
  public open fun addSecurityGroup(securityGroup: ISecurityGroup) {
    unwrap(this).addSecurityGroup(securityGroup.let(ISecurityGroup.Companion::unwrap))
  }

  /**
   * Allows specify security group connections for instances of this fleet.
   */
  public override fun connections(): Connections =
      unwrap(this).getConnections().let(Connections::wrap)

  /**
   * The principal to grant permissions to.
   */
  public override fun grantPrincipal(): IPrincipal =
      unwrap(this).getGrantPrincipal().let(IPrincipal::wrap)

  /**
   * The execution role for the Sagemaker training job.
   *
   * Only available after task has been added to a state machine.
   */
  public open fun role(): IRole = unwrap(this).getRole().let(IRole::wrap)

  /**
   * A fluent builder for
   * [io.cloudshiftdev.awscdk.services.stepfunctions.tasks.SageMakerCreateTrainingJob].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Identifies the training algorithm to use.
     *
     * @param algorithmSpecification Identifies the training algorithm to use. 
     */
    public fun algorithmSpecification(algorithmSpecification: AlgorithmSpecification)

    /**
     * Identifies the training algorithm to use.
     *
     * @param algorithmSpecification Identifies the training algorithm to use. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("85e6251e82851749ffbb8345476f4721b28659397b56857d25217c9023ed399d")
    public
        fun algorithmSpecification(algorithmSpecification: AlgorithmSpecification.Builder.() -> Unit)

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
     * A comment describing this state.
     *
     * Default: No comment
     *
     * @param comment A comment describing this state. 
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
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("57a80a54a6aa13b345116065e55b816be8e93d9b56a8dbdba0d9da02f889cf4c")
    public fun credentials(credentials: Credentials.Builder.() -> Unit)

    /**
     * Isolates the training container.
     *
     * No inbound or outbound network calls can be made to or from the training container.
     *
     * Default: false
     *
     * @param enableNetworkIsolation Isolates the training container. 
     */
    public fun enableNetworkIsolation(enableNetworkIsolation: Boolean)

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
     * Algorithm-specific parameters that influence the quality of the model.
     *
     * Set hyperparameters before you start the learning process.
     * For a list of hyperparameters provided by Amazon SageMaker
     *
     * Default: - No hyperparameters
     *
     * [Documentation](https://docs.aws.amazon.com/sagemaker/latest/dg/algos.html)
     * @param hyperparameters Algorithm-specific parameters that influence the quality of the model.
     * 
     */
    public fun hyperparameters(hyperparameters: Map<String, Any>)

    /**
     * Describes the various datasets (e.g. train, validation, test) and the Amazon S3 location
     * where stored.
     *
     * Default: - No inputDataConfig
     *
     * @param inputDataConfig Describes the various datasets (e.g. train, validation, test) and the
     * Amazon S3 location where stored. 
     */
    public fun inputDataConfig(inputDataConfig: List<Channel>)

    /**
     * Describes the various datasets (e.g. train, validation, test) and the Amazon S3 location
     * where stored.
     *
     * Default: - No inputDataConfig
     *
     * @param inputDataConfig Describes the various datasets (e.g. train, validation, test) and the
     * Amazon S3 location where stored. 
     */
    public fun inputDataConfig(vararg inputDataConfig: Channel)

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
     * Identifies the Amazon S3 location where you want Amazon SageMaker to save the results of
     * model training.
     *
     * @param outputDataConfig Identifies the Amazon S3 location where you want Amazon SageMaker to
     * save the results of model training. 
     */
    public fun outputDataConfig(outputDataConfig: OutputDataConfig)

    /**
     * Identifies the Amazon S3 location where you want Amazon SageMaker to save the results of
     * model training.
     *
     * @param outputDataConfig Identifies the Amazon S3 location where you want Amazon SageMaker to
     * save the results of model training. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a76625af5b8863792b712fd8fd4cd0a98d17fffb031e83ee24c0ddc8f8a4d265")
    public fun outputDataConfig(outputDataConfig: OutputDataConfig.Builder.() -> Unit)

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
     * Specifies the resources, ML compute instances, and ML storage volumes to deploy for model
     * training.
     *
     * Default: - 1 instance of EC2 `M4.XLarge` with `10GB` volume
     *
     * @param resourceConfig Specifies the resources, ML compute instances, and ML storage volumes
     * to deploy for model training. 
     */
    public fun resourceConfig(resourceConfig: ResourceConfig)

    /**
     * Specifies the resources, ML compute instances, and ML storage volumes to deploy for model
     * training.
     *
     * Default: - 1 instance of EC2 `M4.XLarge` with `10GB` volume
     *
     * @param resourceConfig Specifies the resources, ML compute instances, and ML storage volumes
     * to deploy for model training. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ed81f6461e3639fa414b47bfe6ba51f523e2f2a8c294a32a70435e43ae4f8094")
    public fun resourceConfig(resourceConfig: ResourceConfig.Builder.() -> Unit)

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
     * Role for the Training Job.
     *
     * The role must be granted all necessary permissions for the SageMaker training job to
     * be able to operate.
     *
     * See
     * https://docs.aws.amazon.com/fr_fr/sagemaker/latest/dg/sagemaker-roles.html#sagemaker-roles-createtrainingjob-perms
     *
     * Default: - a role will be created.
     *
     * @param role Role for the Training Job. 
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
     * Sets a time limit for training.
     *
     * Default: - max runtime of 1 hour
     *
     * @param stoppingCondition Sets a time limit for training. 
     */
    public fun stoppingCondition(stoppingCondition: StoppingCondition)

    /**
     * Sets a time limit for training.
     *
     * Default: - max runtime of 1 hour
     *
     * @param stoppingCondition Sets a time limit for training. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ed05c1496d0f9c6d41b71d78070b05fc0dafae22a382a628e3bfb389053ea333")
    public fun stoppingCondition(stoppingCondition: StoppingCondition.Builder.() -> Unit)

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
     * Training Job Name.
     *
     * @param trainingJobName Training Job Name. 
     */
    public fun trainingJobName(trainingJobName: String)

    /**
     * Specifies the VPC that you want your training job to connect to.
     *
     * Default: - No VPC
     *
     * @param vpcConfig Specifies the VPC that you want your training job to connect to. 
     */
    public fun vpcConfig(vpcConfig: VpcConfig)

    /**
     * Specifies the VPC that you want your training job to connect to.
     *
     * Default: - No VPC
     *
     * @param vpcConfig Specifies the VPC that you want your training job to connect to. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f26418b73714fcc10e47b401365b2ecfc3c6a844dac0a52fe3e248eec3c5a157")
    public fun vpcConfig(vpcConfig: VpcConfig.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.stepfunctions.tasks.SageMakerCreateTrainingJob.Builder =
        software.amazon.awscdk.services.stepfunctions.tasks.SageMakerCreateTrainingJob.Builder.create(scope,
        id)

    /**
     * Identifies the training algorithm to use.
     *
     * @param algorithmSpecification Identifies the training algorithm to use. 
     */
    override fun algorithmSpecification(algorithmSpecification: AlgorithmSpecification) {
      cdkBuilder.algorithmSpecification(algorithmSpecification.let(AlgorithmSpecification.Companion::unwrap))
    }

    /**
     * Identifies the training algorithm to use.
     *
     * @param algorithmSpecification Identifies the training algorithm to use. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("85e6251e82851749ffbb8345476f4721b28659397b56857d25217c9023ed399d")
    override
        fun algorithmSpecification(algorithmSpecification: AlgorithmSpecification.Builder.() -> Unit):
        Unit = algorithmSpecification(AlgorithmSpecification(algorithmSpecification))

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
    @JvmName("57a80a54a6aa13b345116065e55b816be8e93d9b56a8dbdba0d9da02f889cf4c")
    override fun credentials(credentials: Credentials.Builder.() -> Unit): Unit =
        credentials(Credentials(credentials))

    /**
     * Isolates the training container.
     *
     * No inbound or outbound network calls can be made to or from the training container.
     *
     * Default: false
     *
     * @param enableNetworkIsolation Isolates the training container. 
     */
    override fun enableNetworkIsolation(enableNetworkIsolation: Boolean) {
      cdkBuilder.enableNetworkIsolation(enableNetworkIsolation)
    }

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
     * Algorithm-specific parameters that influence the quality of the model.
     *
     * Set hyperparameters before you start the learning process.
     * For a list of hyperparameters provided by Amazon SageMaker
     *
     * Default: - No hyperparameters
     *
     * [Documentation](https://docs.aws.amazon.com/sagemaker/latest/dg/algos.html)
     * @param hyperparameters Algorithm-specific parameters that influence the quality of the model.
     * 
     */
    override fun hyperparameters(hyperparameters: Map<String, Any>) {
      cdkBuilder.hyperparameters(hyperparameters.mapValues{CdkObjectWrappers.unwrap(it.value)})
    }

    /**
     * Describes the various datasets (e.g. train, validation, test) and the Amazon S3 location
     * where stored.
     *
     * Default: - No inputDataConfig
     *
     * @param inputDataConfig Describes the various datasets (e.g. train, validation, test) and the
     * Amazon S3 location where stored. 
     */
    override fun inputDataConfig(inputDataConfig: List<Channel>) {
      cdkBuilder.inputDataConfig(inputDataConfig.map(Channel.Companion::unwrap))
    }

    /**
     * Describes the various datasets (e.g. train, validation, test) and the Amazon S3 location
     * where stored.
     *
     * Default: - No inputDataConfig
     *
     * @param inputDataConfig Describes the various datasets (e.g. train, validation, test) and the
     * Amazon S3 location where stored. 
     */
    override fun inputDataConfig(vararg inputDataConfig: Channel): Unit =
        inputDataConfig(inputDataConfig.toList())

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
     * Identifies the Amazon S3 location where you want Amazon SageMaker to save the results of
     * model training.
     *
     * @param outputDataConfig Identifies the Amazon S3 location where you want Amazon SageMaker to
     * save the results of model training. 
     */
    override fun outputDataConfig(outputDataConfig: OutputDataConfig) {
      cdkBuilder.outputDataConfig(outputDataConfig.let(OutputDataConfig.Companion::unwrap))
    }

    /**
     * Identifies the Amazon S3 location where you want Amazon SageMaker to save the results of
     * model training.
     *
     * @param outputDataConfig Identifies the Amazon S3 location where you want Amazon SageMaker to
     * save the results of model training. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a76625af5b8863792b712fd8fd4cd0a98d17fffb031e83ee24c0ddc8f8a4d265")
    override fun outputDataConfig(outputDataConfig: OutputDataConfig.Builder.() -> Unit): Unit =
        outputDataConfig(OutputDataConfig(outputDataConfig))

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
     * Specifies the resources, ML compute instances, and ML storage volumes to deploy for model
     * training.
     *
     * Default: - 1 instance of EC2 `M4.XLarge` with `10GB` volume
     *
     * @param resourceConfig Specifies the resources, ML compute instances, and ML storage volumes
     * to deploy for model training. 
     */
    override fun resourceConfig(resourceConfig: ResourceConfig) {
      cdkBuilder.resourceConfig(resourceConfig.let(ResourceConfig.Companion::unwrap))
    }

    /**
     * Specifies the resources, ML compute instances, and ML storage volumes to deploy for model
     * training.
     *
     * Default: - 1 instance of EC2 `M4.XLarge` with `10GB` volume
     *
     * @param resourceConfig Specifies the resources, ML compute instances, and ML storage volumes
     * to deploy for model training. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ed81f6461e3639fa414b47bfe6ba51f523e2f2a8c294a32a70435e43ae4f8094")
    override fun resourceConfig(resourceConfig: ResourceConfig.Builder.() -> Unit): Unit =
        resourceConfig(ResourceConfig(resourceConfig))

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
     * Role for the Training Job.
     *
     * The role must be granted all necessary permissions for the SageMaker training job to
     * be able to operate.
     *
     * See
     * https://docs.aws.amazon.com/fr_fr/sagemaker/latest/dg/sagemaker-roles.html#sagemaker-roles-createtrainingjob-perms
     *
     * Default: - a role will be created.
     *
     * @param role Role for the Training Job. 
     */
    override fun role(role: IRole) {
      cdkBuilder.role(role.let(IRole.Companion::unwrap))
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
     * Sets a time limit for training.
     *
     * Default: - max runtime of 1 hour
     *
     * @param stoppingCondition Sets a time limit for training. 
     */
    override fun stoppingCondition(stoppingCondition: StoppingCondition) {
      cdkBuilder.stoppingCondition(stoppingCondition.let(StoppingCondition.Companion::unwrap))
    }

    /**
     * Sets a time limit for training.
     *
     * Default: - max runtime of 1 hour
     *
     * @param stoppingCondition Sets a time limit for training. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ed05c1496d0f9c6d41b71d78070b05fc0dafae22a382a628e3bfb389053ea333")
    override fun stoppingCondition(stoppingCondition: StoppingCondition.Builder.() -> Unit): Unit =
        stoppingCondition(StoppingCondition(stoppingCondition))

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

    /**
     * Training Job Name.
     *
     * @param trainingJobName Training Job Name. 
     */
    override fun trainingJobName(trainingJobName: String) {
      cdkBuilder.trainingJobName(trainingJobName)
    }

    /**
     * Specifies the VPC that you want your training job to connect to.
     *
     * Default: - No VPC
     *
     * @param vpcConfig Specifies the VPC that you want your training job to connect to. 
     */
    override fun vpcConfig(vpcConfig: VpcConfig) {
      cdkBuilder.vpcConfig(vpcConfig.let(VpcConfig.Companion::unwrap))
    }

    /**
     * Specifies the VPC that you want your training job to connect to.
     *
     * Default: - No VPC
     *
     * @param vpcConfig Specifies the VPC that you want your training job to connect to. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f26418b73714fcc10e47b401365b2ecfc3c6a844dac0a52fe3e248eec3c5a157")
    override fun vpcConfig(vpcConfig: VpcConfig.Builder.() -> Unit): Unit =
        vpcConfig(VpcConfig(vpcConfig))

    public fun build():
        software.amazon.awscdk.services.stepfunctions.tasks.SageMakerCreateTrainingJob =
        cdkBuilder.build()
  }

  public companion object {
    public val PROPERTY_INJECTION_ID: String =
        software.amazon.awscdk.services.stepfunctions.tasks.SageMakerCreateTrainingJob.PROPERTY_INJECTION_ID

    public fun jsonPath(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      props: SageMakerCreateTrainingJobJsonPathProps,
    ): SageMakerCreateTrainingJob =
        software.amazon.awscdk.services.stepfunctions.tasks.SageMakerCreateTrainingJob.jsonPath(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
        id,
        props.let(SageMakerCreateTrainingJobJsonPathProps.Companion::unwrap)).let(SageMakerCreateTrainingJob::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b01d572221a8e1b7320101464074b519aaff688c4448285794c69829a0c04975")
    public fun jsonPath(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      props: SageMakerCreateTrainingJobJsonPathProps.Builder.() -> Unit,
    ): SageMakerCreateTrainingJob = jsonPath(scope, id,
        SageMakerCreateTrainingJobJsonPathProps(props))

    public fun jsonata(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      props: SageMakerCreateTrainingJobJsonataProps,
    ): SageMakerCreateTrainingJob =
        software.amazon.awscdk.services.stepfunctions.tasks.SageMakerCreateTrainingJob.jsonata(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
        id,
        props.let(SageMakerCreateTrainingJobJsonataProps.Companion::unwrap)).let(SageMakerCreateTrainingJob::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b97632f12b425533bd3e739415fcab017c7c8d38704e43f2f614d21c2d510251")
    public fun jsonata(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      props: SageMakerCreateTrainingJobJsonataProps.Builder.() -> Unit,
    ): SageMakerCreateTrainingJob = jsonata(scope, id,
        SageMakerCreateTrainingJobJsonataProps(props))

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): SageMakerCreateTrainingJob {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return SageMakerCreateTrainingJob(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.SageMakerCreateTrainingJob):
        SageMakerCreateTrainingJob = SageMakerCreateTrainingJob(cdkObject)

    internal fun unwrap(wrapped: SageMakerCreateTrainingJob):
        software.amazon.awscdk.services.stepfunctions.tasks.SageMakerCreateTrainingJob =
        wrapped.cdkObject as
        software.amazon.awscdk.services.stepfunctions.tasks.SageMakerCreateTrainingJob
  }
}
