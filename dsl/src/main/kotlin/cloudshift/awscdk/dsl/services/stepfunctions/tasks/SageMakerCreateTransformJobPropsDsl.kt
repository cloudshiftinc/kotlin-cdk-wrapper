@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.stepfunctions.tasks

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import cloudshift.awscdk.dsl.services.stepfunctions.CredentialsDsl
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import software.amazon.awscdk.Duration
import software.amazon.awscdk.Size
import software.amazon.awscdk.services.iam.IRole
import software.amazon.awscdk.services.stepfunctions.Credentials
import software.amazon.awscdk.services.stepfunctions.IntegrationPattern
import software.amazon.awscdk.services.stepfunctions.Timeout
import software.amazon.awscdk.services.stepfunctions.tasks.BatchStrategy
import software.amazon.awscdk.services.stepfunctions.tasks.ModelClientOptions
import software.amazon.awscdk.services.stepfunctions.tasks.SageMakerCreateTransformJobProps
import software.amazon.awscdk.services.stepfunctions.tasks.TransformInput
import software.amazon.awscdk.services.stepfunctions.tasks.TransformOutput
import software.amazon.awscdk.services.stepfunctions.tasks.TransformResources

@CdkDslMarker
public class SageMakerCreateTransformJobPropsDsl {
  private val cdkBuilder: SageMakerCreateTransformJobProps.Builder =
      SageMakerCreateTransformJobProps.builder()

  public fun batchStrategy(batchStrategy: BatchStrategy) {
    cdkBuilder.batchStrategy(batchStrategy)
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

  public fun environment(environment: Map<String, String>) {
    cdkBuilder.environment(environment)
  }

  public fun heartbeat(heartbeat: Duration) {
    cdkBuilder.heartbeat(heartbeat)
  }

  public fun heartbeatTimeout(heartbeatTimeout: Timeout) {
    cdkBuilder.heartbeatTimeout(heartbeatTimeout)
  }

  public fun inputPath(inputPath: String) {
    cdkBuilder.inputPath(inputPath)
  }

  public fun integrationPattern(integrationPattern: IntegrationPattern) {
    cdkBuilder.integrationPattern(integrationPattern)
  }

  public fun maxConcurrentTransforms(maxConcurrentTransforms: Number) {
    cdkBuilder.maxConcurrentTransforms(maxConcurrentTransforms)
  }

  public fun maxPayload(maxPayload: Size) {
    cdkBuilder.maxPayload(maxPayload)
  }

  public fun modelClientOptions(block: ModelClientOptionsDsl.() -> Unit = {}) {
    val builder = ModelClientOptionsDsl()
    builder.apply(block)
    cdkBuilder.modelClientOptions(builder.build())
  }

  public fun modelClientOptions(modelClientOptions: ModelClientOptions) {
    cdkBuilder.modelClientOptions(modelClientOptions)
  }

  public fun modelName(modelName: String) {
    cdkBuilder.modelName(modelName)
  }

  public fun outputPath(outputPath: String) {
    cdkBuilder.outputPath(outputPath)
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

  public fun tags(tags: Map<String, String>) {
    cdkBuilder.tags(tags)
  }

  public fun taskTimeout(taskTimeout: Timeout) {
    cdkBuilder.taskTimeout(taskTimeout)
  }

  public fun timeout(timeout: Duration) {
    cdkBuilder.timeout(timeout)
  }

  public fun transformInput(block: TransformInputDsl.() -> Unit = {}) {
    val builder = TransformInputDsl()
    builder.apply(block)
    cdkBuilder.transformInput(builder.build())
  }

  public fun transformInput(transformInput: TransformInput) {
    cdkBuilder.transformInput(transformInput)
  }

  public fun transformJobName(transformJobName: String) {
    cdkBuilder.transformJobName(transformJobName)
  }

  public fun transformOutput(block: TransformOutputDsl.() -> Unit = {}) {
    val builder = TransformOutputDsl()
    builder.apply(block)
    cdkBuilder.transformOutput(builder.build())
  }

  public fun transformOutput(transformOutput: TransformOutput) {
    cdkBuilder.transformOutput(transformOutput)
  }

  public fun transformResources(block: TransformResourcesDsl.() -> Unit = {}) {
    val builder = TransformResourcesDsl()
    builder.apply(block)
    cdkBuilder.transformResources(builder.build())
  }

  public fun transformResources(transformResources: TransformResources) {
    cdkBuilder.transformResources(transformResources)
  }

  public fun build(): SageMakerCreateTransformJobProps = cdkBuilder.build()
}
