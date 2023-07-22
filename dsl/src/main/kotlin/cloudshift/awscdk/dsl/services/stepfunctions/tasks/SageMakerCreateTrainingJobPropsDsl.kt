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
import software.amazon.awscdk.services.stepfunctions.tasks.SageMakerCreateTrainingJobProps
import software.amazon.awscdk.services.stepfunctions.tasks.StoppingCondition
import software.amazon.awscdk.services.stepfunctions.tasks.VpcConfig

@CdkDslMarker
public class SageMakerCreateTrainingJobPropsDsl {
  private val cdkBuilder: SageMakerCreateTrainingJobProps.Builder =
      SageMakerCreateTrainingJobProps.builder()

  private val _inputDataConfig: MutableList<Channel> = mutableListOf()

  /**
   * @param algorithmSpecification Identifies the training algorithm to use. 
   */
  public fun algorithmSpecification(algorithmSpecification: AlgorithmSpecificationDsl.() -> Unit =
      {}) {
    val builder = AlgorithmSpecificationDsl()
    builder.apply(algorithmSpecification)
    cdkBuilder.algorithmSpecification(builder.build())
  }

  /**
   * @param algorithmSpecification Identifies the training algorithm to use. 
   */
  public fun algorithmSpecification(algorithmSpecification: AlgorithmSpecification) {
    cdkBuilder.algorithmSpecification(algorithmSpecification)
  }

  /**
   * @param comment An optional description for this state.
   */
  public fun comment(comment: String) {
    cdkBuilder.comment(comment)
  }

  /**
   * @param credentials Credentials for an IAM Role that the State Machine assumes for executing the
   * task.
   * This enables cross-account resource invocations.
   */
  public fun credentials(credentials: CredentialsDsl.() -> Unit = {}) {
    val builder = CredentialsDsl()
    builder.apply(credentials)
    cdkBuilder.credentials(builder.build())
  }

  /**
   * @param credentials Credentials for an IAM Role that the State Machine assumes for executing the
   * task.
   * This enables cross-account resource invocations.
   */
  public fun credentials(credentials: Credentials) {
    cdkBuilder.credentials(credentials)
  }

  /**
   * @param enableNetworkIsolation Isolates the training container.
   * No inbound or outbound network calls can be made to or from the training container.
   */
  public fun enableNetworkIsolation(enableNetworkIsolation: Boolean) {
    cdkBuilder.enableNetworkIsolation(enableNetworkIsolation)
  }

  /**
   * @param environment Environment variables to set in the Docker container.
   */
  public fun environment(environment: Map<String, String>) {
    cdkBuilder.environment(environment)
  }

  /**
   * @param heartbeat Timeout for the heartbeat.
   * @deprecated use `heartbeatTimeout`
   */
  @Deprecated(message = "deprecated in CDK")
  public fun heartbeat(heartbeat: Duration) {
    cdkBuilder.heartbeat(heartbeat)
  }

  /**
   * @param heartbeatTimeout Timeout for the heartbeat.
   * [disable-awslint:duration-prop-type] is needed because all props interface in
   * aws-stepfunctions-tasks extend this interface
   */
  public fun heartbeatTimeout(heartbeatTimeout: Timeout) {
    cdkBuilder.heartbeatTimeout(heartbeatTimeout)
  }

  /**
   * @param hyperparameters Algorithm-specific parameters that influence the quality of the model.
   * Set hyperparameters before you start the learning process.
   * For a list of hyperparameters provided by Amazon SageMaker
   */
  public fun hyperparameters(hyperparameters: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(hyperparameters)
    cdkBuilder.hyperparameters(builder.map)
  }

  /**
   * @param hyperparameters Algorithm-specific parameters that influence the quality of the model.
   * Set hyperparameters before you start the learning process.
   * For a list of hyperparameters provided by Amazon SageMaker
   */
  public fun hyperparameters(hyperparameters: Map<String, Any>) {
    cdkBuilder.hyperparameters(hyperparameters)
  }

  /**
   * @param inputDataConfig Describes the various datasets (e.g. train, validation, test) and the
   * Amazon S3 location where stored. 
   */
  public fun inputDataConfig(inputDataConfig: ChannelDsl.() -> Unit) {
    _inputDataConfig.add(ChannelDsl().apply(inputDataConfig).build())
  }

  /**
   * @param inputDataConfig Describes the various datasets (e.g. train, validation, test) and the
   * Amazon S3 location where stored. 
   */
  public fun inputDataConfig(inputDataConfig: Collection<Channel>) {
    _inputDataConfig.addAll(inputDataConfig)
  }

  /**
   * @param inputPath JSONPath expression to select part of the state to be the input to this state.
   * May also be the special value JsonPath.DISCARD, which will cause the effective
   * input to be the empty object {}.
   */
  public fun inputPath(inputPath: String) {
    cdkBuilder.inputPath(inputPath)
  }

  /**
   * @param integrationPattern AWS Step Functions integrates with services directly in the Amazon
   * States Language.
   * You can control these AWS services using service integration patterns
   */
  public fun integrationPattern(integrationPattern: IntegrationPattern) {
    cdkBuilder.integrationPattern(integrationPattern)
  }

  /**
   * @param outputDataConfig Identifies the Amazon S3 location where you want Amazon SageMaker to
   * save the results of model training. 
   */
  public fun outputDataConfig(outputDataConfig: OutputDataConfigDsl.() -> Unit = {}) {
    val builder = OutputDataConfigDsl()
    builder.apply(outputDataConfig)
    cdkBuilder.outputDataConfig(builder.build())
  }

  /**
   * @param outputDataConfig Identifies the Amazon S3 location where you want Amazon SageMaker to
   * save the results of model training. 
   */
  public fun outputDataConfig(outputDataConfig: OutputDataConfig) {
    cdkBuilder.outputDataConfig(outputDataConfig)
  }

  /**
   * @param outputPath JSONPath expression to select select a portion of the state output to pass to
   * the next state.
   * May also be the special value JsonPath.DISCARD, which will cause the effective
   * output to be the empty object {}.
   */
  public fun outputPath(outputPath: String) {
    cdkBuilder.outputPath(outputPath)
  }

  /**
   * @param resourceConfig Specifies the resources, ML compute instances, and ML storage volumes to
   * deploy for model training.
   */
  public fun resourceConfig(resourceConfig: ResourceConfigDsl.() -> Unit = {}) {
    val builder = ResourceConfigDsl()
    builder.apply(resourceConfig)
    cdkBuilder.resourceConfig(builder.build())
  }

  /**
   * @param resourceConfig Specifies the resources, ML compute instances, and ML storage volumes to
   * deploy for model training.
   */
  public fun resourceConfig(resourceConfig: ResourceConfig) {
    cdkBuilder.resourceConfig(resourceConfig)
  }

  /**
   * @param resultPath JSONPath expression to indicate where to inject the state's output.
   * May also be the special value JsonPath.DISCARD, which will cause the state's
   * input to become its output.
   */
  public fun resultPath(resultPath: String) {
    cdkBuilder.resultPath(resultPath)
  }

  /**
   * @param resultSelector The JSON that will replace the state's raw result and become the
   * effective result before ResultPath is applied.
   * You can use ResultSelector to create a payload with values that are static
   * or selected from the state's raw result.
   */
  public fun resultSelector(resultSelector: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(resultSelector)
    cdkBuilder.resultSelector(builder.map)
  }

  /**
   * @param resultSelector The JSON that will replace the state's raw result and become the
   * effective result before ResultPath is applied.
   * You can use ResultSelector to create a payload with values that are static
   * or selected from the state's raw result.
   */
  public fun resultSelector(resultSelector: Map<String, Any>) {
    cdkBuilder.resultSelector(resultSelector)
  }

  /**
   * @param role Role for the Training Job.
   * The role must be granted all necessary permissions for the SageMaker training job to
   * be able to operate.
   *
   * See
   * https://docs.aws.amazon.com/fr_fr/sagemaker/latest/dg/sagemaker-roles.html#sagemaker-roles-createtrainingjob-perms
   */
  public fun role(role: IRole) {
    cdkBuilder.role(role)
  }

  /**
   * @param stoppingCondition Sets a time limit for training.
   */
  public fun stoppingCondition(stoppingCondition: StoppingConditionDsl.() -> Unit = {}) {
    val builder = StoppingConditionDsl()
    builder.apply(stoppingCondition)
    cdkBuilder.stoppingCondition(builder.build())
  }

  /**
   * @param stoppingCondition Sets a time limit for training.
   */
  public fun stoppingCondition(stoppingCondition: StoppingCondition) {
    cdkBuilder.stoppingCondition(stoppingCondition)
  }

  /**
   * @param tags Tags to be applied to the train job.
   */
  public fun tags(tags: Map<String, String>) {
    cdkBuilder.tags(tags)
  }

  /**
   * @param taskTimeout Timeout for the task.
   * [disable-awslint:duration-prop-type] is needed because all props interface in
   * aws-stepfunctions-tasks extend this interface
   */
  public fun taskTimeout(taskTimeout: Timeout) {
    cdkBuilder.taskTimeout(taskTimeout)
  }

  /**
   * @param timeout Timeout for the task.
   * @deprecated use `taskTimeout`
   */
  @Deprecated(message = "deprecated in CDK")
  public fun timeout(timeout: Duration) {
    cdkBuilder.timeout(timeout)
  }

  /**
   * @param trainingJobName Training Job Name. 
   */
  public fun trainingJobName(trainingJobName: String) {
    cdkBuilder.trainingJobName(trainingJobName)
  }

  /**
   * @param vpcConfig Specifies the VPC that you want your training job to connect to.
   */
  public fun vpcConfig(vpcConfig: VpcConfigDsl.() -> Unit = {}) {
    val builder = VpcConfigDsl()
    builder.apply(vpcConfig)
    cdkBuilder.vpcConfig(builder.build())
  }

  /**
   * @param vpcConfig Specifies the VPC that you want your training job to connect to.
   */
  public fun vpcConfig(vpcConfig: VpcConfig) {
    cdkBuilder.vpcConfig(vpcConfig)
  }

  public fun build(): SageMakerCreateTrainingJobProps {
    if(_inputDataConfig.isNotEmpty()) cdkBuilder.inputDataConfig(_inputDataConfig)
    return cdkBuilder.build()
  }
}
