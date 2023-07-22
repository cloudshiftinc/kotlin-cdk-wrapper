@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.stepfunctions.tasks

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import cloudshift.awscdk.dsl.services.stepfunctions.CredentialsDsl
import kotlin.Any
import kotlin.Deprecated
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
@CdkDslMarker
public class SageMakerCreateTransformJobPropsDsl {
  private val cdkBuilder: SageMakerCreateTransformJobProps.Builder =
      SageMakerCreateTransformJobProps.builder()

  /**
   * @param batchStrategy Number of records to include in a mini-batch for an HTTP inference
   * request.
   */
  public fun batchStrategy(batchStrategy: BatchStrategy) {
    cdkBuilder.batchStrategy(batchStrategy)
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
   * @param maxConcurrentTransforms Maximum number of parallel requests that can be sent to each
   * instance in a transform job.
   */
  public fun maxConcurrentTransforms(maxConcurrentTransforms: Number) {
    cdkBuilder.maxConcurrentTransforms(maxConcurrentTransforms)
  }

  /**
   * @param maxPayload Maximum allowed size of the payload, in MB.
   */
  public fun maxPayload(maxPayload: Size) {
    cdkBuilder.maxPayload(maxPayload)
  }

  /**
   * @param modelClientOptions Configures the timeout and maximum number of retries for processing a
   * transform job invocation.
   */
  public fun modelClientOptions(modelClientOptions: ModelClientOptionsDsl.() -> Unit = {}) {
    val builder = ModelClientOptionsDsl()
    builder.apply(modelClientOptions)
    cdkBuilder.modelClientOptions(builder.build())
  }

  /**
   * @param modelClientOptions Configures the timeout and maximum number of retries for processing a
   * transform job invocation.
   */
  public fun modelClientOptions(modelClientOptions: ModelClientOptions) {
    cdkBuilder.modelClientOptions(modelClientOptions)
  }

  /**
   * @param modelName Name of the model that you want to use for the transform job. 
   */
  public fun modelName(modelName: String) {
    cdkBuilder.modelName(modelName)
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
   * @param role Role for the Transform Job.
   */
  public fun role(role: IRole) {
    cdkBuilder.role(role)
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
   * @param transformInput Dataset to be transformed and the Amazon S3 location where it is stored. 
   */
  public fun transformInput(transformInput: TransformInputDsl.() -> Unit = {}) {
    val builder = TransformInputDsl()
    builder.apply(transformInput)
    cdkBuilder.transformInput(builder.build())
  }

  /**
   * @param transformInput Dataset to be transformed and the Amazon S3 location where it is stored. 
   */
  public fun transformInput(transformInput: TransformInput) {
    cdkBuilder.transformInput(transformInput)
  }

  /**
   * @param transformJobName Transform Job Name. 
   */
  public fun transformJobName(transformJobName: String) {
    cdkBuilder.transformJobName(transformJobName)
  }

  /**
   * @param transformOutput S3 location where you want Amazon SageMaker to save the results from the
   * transform job. 
   */
  public fun transformOutput(transformOutput: TransformOutputDsl.() -> Unit = {}) {
    val builder = TransformOutputDsl()
    builder.apply(transformOutput)
    cdkBuilder.transformOutput(builder.build())
  }

  /**
   * @param transformOutput S3 location where you want Amazon SageMaker to save the results from the
   * transform job. 
   */
  public fun transformOutput(transformOutput: TransformOutput) {
    cdkBuilder.transformOutput(transformOutput)
  }

  /**
   * @param transformResources ML compute instances for the transform job.
   */
  public fun transformResources(transformResources: TransformResourcesDsl.() -> Unit = {}) {
    val builder = TransformResourcesDsl()
    builder.apply(transformResources)
    cdkBuilder.transformResources(builder.build())
  }

  /**
   * @param transformResources ML compute instances for the transform job.
   */
  public fun transformResources(transformResources: TransformResources) {
    cdkBuilder.transformResources(transformResources)
  }

  public fun build(): SageMakerCreateTransformJobProps = cdkBuilder.build()
}
