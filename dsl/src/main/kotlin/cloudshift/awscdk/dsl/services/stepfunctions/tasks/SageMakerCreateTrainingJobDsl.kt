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

@CdkDslMarker
public class SageMakerCreateTrainingJobDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: SageMakerCreateTrainingJob.Builder =
      SageMakerCreateTrainingJob.Builder.create(scope, id)

  private val _inputDataConfig: MutableList<Channel> = mutableListOf()

  public fun algorithmSpecification(block: AlgorithmSpecificationDsl.() -> Unit = {}) {
    val builder = AlgorithmSpecificationDsl()
    builder.apply(block)
    cdkBuilder.algorithmSpecification(builder.build())
  }

  public fun algorithmSpecification(algorithmSpecification: AlgorithmSpecification) {
    cdkBuilder.algorithmSpecification(algorithmSpecification)
  }

  public fun comment(comment: String) {
    cdkBuilder.comment(comment)
  }

  public fun credentials(block: CredentialsDsl.() -> Unit = {}) {
    val builder = CredentialsDsl()
    builder.apply(block)
    cdkBuilder.credentials(builder.build())
  }

  public fun credentials(credentials: Credentials) {
    cdkBuilder.credentials(credentials)
  }

  public fun enableNetworkIsolation(enableNetworkIsolation: Boolean) {
    cdkBuilder.enableNetworkIsolation(enableNetworkIsolation)
  }

  public fun environment(environment: Map<String, String>) {
    cdkBuilder.environment(environment)
  }

  @Deprecated(message = "deprecated in CDK")
  public fun heartbeat(heartbeat: Duration) {
    cdkBuilder.heartbeat(heartbeat)
  }

  public fun heartbeatTimeout(heartbeatTimeout: Timeout) {
    cdkBuilder.heartbeatTimeout(heartbeatTimeout)
  }

  public fun hyperparameters(block: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(block)
    cdkBuilder.hyperparameters(builder.map)
  }

  public fun hyperparameters(hyperparameters: Map<String, Any>) {
    cdkBuilder.hyperparameters(hyperparameters)
  }

  public fun inputDataConfig(inputDataConfig: ChannelDsl.() -> Unit) {
    _inputDataConfig.add(ChannelDsl().apply(inputDataConfig).build())
  }

  public fun inputDataConfig(inputDataConfig: Collection<Channel>) {
    _inputDataConfig.addAll(inputDataConfig)
  }

  public fun inputPath(inputPath: String) {
    cdkBuilder.inputPath(inputPath)
  }

  public fun integrationPattern(integrationPattern: IntegrationPattern) {
    cdkBuilder.integrationPattern(integrationPattern)
  }

  public fun outputDataConfig(block: OutputDataConfigDsl.() -> Unit = {}) {
    val builder = OutputDataConfigDsl()
    builder.apply(block)
    cdkBuilder.outputDataConfig(builder.build())
  }

  public fun outputDataConfig(outputDataConfig: OutputDataConfig) {
    cdkBuilder.outputDataConfig(outputDataConfig)
  }

  public fun outputPath(outputPath: String) {
    cdkBuilder.outputPath(outputPath)
  }

  public fun resourceConfig(block: ResourceConfigDsl.() -> Unit = {}) {
    val builder = ResourceConfigDsl()
    builder.apply(block)
    cdkBuilder.resourceConfig(builder.build())
  }

  public fun resourceConfig(resourceConfig: ResourceConfig) {
    cdkBuilder.resourceConfig(resourceConfig)
  }

  public fun resultPath(resultPath: String) {
    cdkBuilder.resultPath(resultPath)
  }

  public fun resultSelector(block: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(block)
    cdkBuilder.resultSelector(builder.map)
  }

  public fun resultSelector(resultSelector: Map<String, Any>) {
    cdkBuilder.resultSelector(resultSelector)
  }

  public fun role(role: IRole) {
    cdkBuilder.role(role)
  }

  public fun stoppingCondition(block: StoppingConditionDsl.() -> Unit = {}) {
    val builder = StoppingConditionDsl()
    builder.apply(block)
    cdkBuilder.stoppingCondition(builder.build())
  }

  public fun stoppingCondition(stoppingCondition: StoppingCondition) {
    cdkBuilder.stoppingCondition(stoppingCondition)
  }

  public fun tags(tags: Map<String, String>) {
    cdkBuilder.tags(tags)
  }

  public fun taskTimeout(taskTimeout: Timeout) {
    cdkBuilder.taskTimeout(taskTimeout)
  }

  @Deprecated(message = "deprecated in CDK")
  public fun timeout(timeout: Duration) {
    cdkBuilder.timeout(timeout)
  }

  public fun trainingJobName(trainingJobName: String) {
    cdkBuilder.trainingJobName(trainingJobName)
  }

  public fun vpcConfig(block: VpcConfigDsl.() -> Unit = {}) {
    val builder = VpcConfigDsl()
    builder.apply(block)
    cdkBuilder.vpcConfig(builder.build())
  }

  public fun vpcConfig(vpcConfig: VpcConfig) {
    cdkBuilder.vpcConfig(vpcConfig)
  }

  public fun build(): SageMakerCreateTrainingJob {
    if(_inputDataConfig.isNotEmpty()) cdkBuilder.inputDataConfig(_inputDataConfig)
    return cdkBuilder.build()
  }
}
