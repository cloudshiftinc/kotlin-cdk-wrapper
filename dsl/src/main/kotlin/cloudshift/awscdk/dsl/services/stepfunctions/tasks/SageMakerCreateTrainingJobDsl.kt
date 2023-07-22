@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.stepfunctions.tasks

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import cloudshift.awscdk.dsl.services.stepfunctions.CredentialsDsl
import kotlin.Any
import kotlin.Boolean
import kotlin.Deprecated
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.iam.IRole
import software.amazon.awscdk.services.stepfunctions.Credentials
import software.amazon.awscdk.services.stepfunctions.IntegrationPattern
import software.amazon.awscdk.services.stepfunctions.Timeout
import software.amazon.awscdk.services.stepfunctions.tasks.AlgorithmSpecification
import software.amazon.awscdk.services.stepfunctions.tasks.Channel
import software.amazon.awscdk.services.stepfunctions.tasks.OutputDataConfig
import software.amazon.awscdk.services.stepfunctions.tasks.ResourceConfig
import software.amazon.awscdk.services.stepfunctions.tasks.SageMakerCreateTrainingJob
import software.amazon.awscdk.services.stepfunctions.tasks.StoppingCondition
import software.amazon.awscdk.services.stepfunctions.tasks.VpcConfig
import software.constructs.Construct

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
@CdkDslMarker
public class SageMakerCreateTrainingJobDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: SageMakerCreateTrainingJob.Builder =
      SageMakerCreateTrainingJob.Builder.create(scope, id)

  private val _inputDataConfig: MutableList<Channel> = mutableListOf()

  /**
   * Identifies the training algorithm to use.
   *
   * @param algorithmSpecification Identifies the training algorithm to use. 
   */
  public fun algorithmSpecification(algorithmSpecification: AlgorithmSpecificationDsl.() -> Unit =
      {}) {
    val builder = AlgorithmSpecificationDsl()
    builder.apply(algorithmSpecification)
    cdkBuilder.algorithmSpecification(builder.build())
  }

  /**
   * Identifies the training algorithm to use.
   *
   * @param algorithmSpecification Identifies the training algorithm to use. 
   */
  public fun algorithmSpecification(algorithmSpecification: AlgorithmSpecification) {
    cdkBuilder.algorithmSpecification(algorithmSpecification)
  }

  /**
   * An optional description for this state.
   *
   * Default: - No comment
   *
   * @param comment An optional description for this state. 
   */
  public fun comment(comment: String) {
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
   * @param credentials Credentials for an IAM Role that the State Machine assumes for executing the
   * task. 
   */
  public fun credentials(credentials: CredentialsDsl.() -> Unit = {}) {
    val builder = CredentialsDsl()
    builder.apply(credentials)
    cdkBuilder.credentials(builder.build())
  }

  /**
   * Credentials for an IAM Role that the State Machine assumes for executing the task.
   *
   * This enables cross-account resource invocations.
   *
   * Default: - None (Task is executed using the State Machine's execution role)
   *
   * [Documentation](https://docs.aws.amazon.com/step-functions/latest/dg/concepts-access-cross-acct-resources.html)
   * @param credentials Credentials for an IAM Role that the State Machine assumes for executing the
   * task. 
   */
  public fun credentials(credentials: Credentials) {
    cdkBuilder.credentials(credentials)
  }

  /**
   * Isolates the training container.
   *
   * No inbound or outbound network calls can be made to or from the training container.
   *
   * Default: false
   *
   * @param enableNetworkIsolation Isolates the training container. 
   */
  public fun enableNetworkIsolation(enableNetworkIsolation: Boolean) {
    cdkBuilder.enableNetworkIsolation(enableNetworkIsolation)
  }

  /**
   * Environment variables to set in the Docker container.
   *
   * Default: - No environment variables
   *
   * @param environment Environment variables to set in the Docker container. 
   */
  public fun environment(environment: Map<String, String>) {
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
  public fun heartbeat(heartbeat: Duration) {
    cdkBuilder.heartbeat(heartbeat)
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
  public fun heartbeatTimeout(heartbeatTimeout: Timeout) {
    cdkBuilder.heartbeatTimeout(heartbeatTimeout)
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
   */
  public fun hyperparameters(hyperparameters: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(hyperparameters)
    cdkBuilder.hyperparameters(builder.map)
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
   */
  public fun hyperparameters(hyperparameters: Map<String, Any>) {
    cdkBuilder.hyperparameters(hyperparameters)
  }

  /**
   * Describes the various datasets (e.g. train, validation, test) and the Amazon S3 location where
   * stored.
   *
   * @param inputDataConfig Describes the various datasets (e.g. train, validation, test) and the
   * Amazon S3 location where stored. 
   */
  public fun inputDataConfig(inputDataConfig: ChannelDsl.() -> Unit) {
    _inputDataConfig.add(ChannelDsl().apply(inputDataConfig).build())
  }

  /**
   * Describes the various datasets (e.g. train, validation, test) and the Amazon S3 location where
   * stored.
   *
   * @param inputDataConfig Describes the various datasets (e.g. train, validation, test) and the
   * Amazon S3 location where stored. 
   */
  public fun inputDataConfig(inputDataConfig: Collection<Channel>) {
    _inputDataConfig.addAll(inputDataConfig)
  }

  /**
   * JSONPath expression to select part of the state to be the input to this state.
   *
   * May also be the special value JsonPath.DISCARD, which will cause the effective
   * input to be the empty object {}.
   *
   * Default: - The entire task input (JSON path '$')
   *
   * @param inputPath JSONPath expression to select part of the state to be the input to this state.
   * 
   */
  public fun inputPath(inputPath: String) {
    cdkBuilder.inputPath(inputPath)
  }

  /**
   * AWS Step Functions integrates with services directly in the Amazon States Language.
   *
   * You can control these AWS services using service integration patterns
   *
   * Default: - `IntegrationPattern.REQUEST_RESPONSE` for most tasks.
   * `IntegrationPattern.RUN_JOB` for the following exceptions:
   * `BatchSubmitJob`, `EmrAddStep`, `EmrCreateCluster`, `EmrTerminationCluster`, and
   * `EmrContainersStartJobRun`.
   *
   * [Documentation](https://docs.aws.amazon.com/step-functions/latest/dg/connect-to-resource.html#connect-wait-token)
   * @param integrationPattern AWS Step Functions integrates with services directly in the Amazon
   * States Language. 
   */
  public fun integrationPattern(integrationPattern: IntegrationPattern) {
    cdkBuilder.integrationPattern(integrationPattern)
  }

  /**
   * Identifies the Amazon S3 location where you want Amazon SageMaker to save the results of model
   * training.
   *
   * @param outputDataConfig Identifies the Amazon S3 location where you want Amazon SageMaker to
   * save the results of model training. 
   */
  public fun outputDataConfig(outputDataConfig: OutputDataConfigDsl.() -> Unit = {}) {
    val builder = OutputDataConfigDsl()
    builder.apply(outputDataConfig)
    cdkBuilder.outputDataConfig(builder.build())
  }

  /**
   * Identifies the Amazon S3 location where you want Amazon SageMaker to save the results of model
   * training.
   *
   * @param outputDataConfig Identifies the Amazon S3 location where you want Amazon SageMaker to
   * save the results of model training. 
   */
  public fun outputDataConfig(outputDataConfig: OutputDataConfig) {
    cdkBuilder.outputDataConfig(outputDataConfig)
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
   * @param outputPath JSONPath expression to select select a portion of the state output to pass to
   * the next state. 
   */
  public fun outputPath(outputPath: String) {
    cdkBuilder.outputPath(outputPath)
  }

  /**
   * Specifies the resources, ML compute instances, and ML storage volumes to deploy for model
   * training.
   *
   * Default: - 1 instance of EC2 `M4.XLarge` with `10GB` volume
   *
   * @param resourceConfig Specifies the resources, ML compute instances, and ML storage volumes to
   * deploy for model training. 
   */
  public fun resourceConfig(resourceConfig: ResourceConfigDsl.() -> Unit = {}) {
    val builder = ResourceConfigDsl()
    builder.apply(resourceConfig)
    cdkBuilder.resourceConfig(builder.build())
  }

  /**
   * Specifies the resources, ML compute instances, and ML storage volumes to deploy for model
   * training.
   *
   * Default: - 1 instance of EC2 `M4.XLarge` with `10GB` volume
   *
   * @param resourceConfig Specifies the resources, ML compute instances, and ML storage volumes to
   * deploy for model training. 
   */
  public fun resourceConfig(resourceConfig: ResourceConfig) {
    cdkBuilder.resourceConfig(resourceConfig)
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
  public fun resultPath(resultPath: String) {
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
  public fun resultSelector(resultSelector: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(resultSelector)
    cdkBuilder.resultSelector(builder.map)
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
  public fun resultSelector(resultSelector: Map<String, Any>) {
    cdkBuilder.resultSelector(resultSelector)
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
  public fun role(role: IRole) {
    cdkBuilder.role(role)
  }

  /**
   * Sets a time limit for training.
   *
   * Default: - max runtime of 1 hour
   *
   * @param stoppingCondition Sets a time limit for training. 
   */
  public fun stoppingCondition(stoppingCondition: StoppingConditionDsl.() -> Unit = {}) {
    val builder = StoppingConditionDsl()
    builder.apply(stoppingCondition)
    cdkBuilder.stoppingCondition(builder.build())
  }

  /**
   * Sets a time limit for training.
   *
   * Default: - max runtime of 1 hour
   *
   * @param stoppingCondition Sets a time limit for training. 
   */
  public fun stoppingCondition(stoppingCondition: StoppingCondition) {
    cdkBuilder.stoppingCondition(stoppingCondition)
  }

  /**
   * Tags to be applied to the train job.
   *
   * Default: - No tags
   *
   * @param tags Tags to be applied to the train job. 
   */
  public fun tags(tags: Map<String, String>) {
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
  public fun taskTimeout(taskTimeout: Timeout) {
    cdkBuilder.taskTimeout(taskTimeout)
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
  public fun timeout(timeout: Duration) {
    cdkBuilder.timeout(timeout)
  }

  /**
   * Training Job Name.
   *
   * @param trainingJobName Training Job Name. 
   */
  public fun trainingJobName(trainingJobName: String) {
    cdkBuilder.trainingJobName(trainingJobName)
  }

  /**
   * Specifies the VPC that you want your training job to connect to.
   *
   * Default: - No VPC
   *
   * @param vpcConfig Specifies the VPC that you want your training job to connect to. 
   */
  public fun vpcConfig(vpcConfig: VpcConfigDsl.() -> Unit = {}) {
    val builder = VpcConfigDsl()
    builder.apply(vpcConfig)
    cdkBuilder.vpcConfig(builder.build())
  }

  /**
   * Specifies the VPC that you want your training job to connect to.
   *
   * Default: - No VPC
   *
   * @param vpcConfig Specifies the VPC that you want your training job to connect to. 
   */
  public fun vpcConfig(vpcConfig: VpcConfig) {
    cdkBuilder.vpcConfig(vpcConfig)
  }

  public fun build(): SageMakerCreateTrainingJob {
    if(_inputDataConfig.isNotEmpty()) cdkBuilder.inputDataConfig(_inputDataConfig)
    return cdkBuilder.build()
  }
}
