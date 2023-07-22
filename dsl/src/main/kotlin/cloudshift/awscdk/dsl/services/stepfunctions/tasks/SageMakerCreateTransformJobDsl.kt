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
import software.amazon.awscdk.services.stepfunctions.tasks.SageMakerCreateTransformJob
import software.amazon.awscdk.services.stepfunctions.tasks.TransformInput
import software.amazon.awscdk.services.stepfunctions.tasks.TransformOutput
import software.amazon.awscdk.services.stepfunctions.tasks.TransformResources
import software.constructs.Construct

@CdkDslMarker
public class SageMakerCreateTransformJobDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: SageMakerCreateTransformJob.Builder =
      SageMakerCreateTransformJob.Builder.create(scope, id)

  /**
   * Number of records to include in a mini-batch for an HTTP inference request.
   *
   * Default: - No batch strategy
   *
   * @param batchStrategy Number of records to include in a mini-batch for an HTTP inference
   * request. 
   */
  public fun batchStrategy(batchStrategy: BatchStrategy) {
    cdkBuilder.batchStrategy(batchStrategy)
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
   * Maximum number of parallel requests that can be sent to each instance in a transform job.
   *
   * Default: - Amazon SageMaker checks the optional execution-parameters to determine the settings
   * for your chosen algorithm.
   * If the execution-parameters endpoint is not enabled, the default value is 1.
   *
   * @param maxConcurrentTransforms Maximum number of parallel requests that can be sent to each
   * instance in a transform job. 
   */
  public fun maxConcurrentTransforms(maxConcurrentTransforms: Number) {
    cdkBuilder.maxConcurrentTransforms(maxConcurrentTransforms)
  }

  /**
   * Maximum allowed size of the payload, in MB.
   *
   * Default: 6
   *
   * @param maxPayload Maximum allowed size of the payload, in MB. 
   */
  public fun maxPayload(maxPayload: Size) {
    cdkBuilder.maxPayload(maxPayload)
  }

  /**
   * Configures the timeout and maximum number of retries for processing a transform job invocation.
   *
   * Default: - 0 retries and 60 seconds of timeout
   *
   * @param modelClientOptions Configures the timeout and maximum number of retries for processing a
   * transform job invocation. 
   */
  public fun modelClientOptions(modelClientOptions: ModelClientOptionsDsl.() -> Unit = {}) {
    val builder = ModelClientOptionsDsl()
    builder.apply(modelClientOptions)
    cdkBuilder.modelClientOptions(builder.build())
  }

  /**
   * Configures the timeout and maximum number of retries for processing a transform job invocation.
   *
   * Default: - 0 retries and 60 seconds of timeout
   *
   * @param modelClientOptions Configures the timeout and maximum number of retries for processing a
   * transform job invocation. 
   */
  public fun modelClientOptions(modelClientOptions: ModelClientOptions) {
    cdkBuilder.modelClientOptions(modelClientOptions)
  }

  /**
   * Name of the model that you want to use for the transform job.
   *
   * @param modelName Name of the model that you want to use for the transform job. 
   */
  public fun modelName(modelName: String) {
    cdkBuilder.modelName(modelName)
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
   * Role for the Transform Job.
   *
   * Default: - A role is created with `AmazonSageMakerFullAccess` managed policy
   *
   * @param role Role for the Transform Job. 
   */
  public fun role(role: IRole) {
    cdkBuilder.role(role)
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
   * Dataset to be transformed and the Amazon S3 location where it is stored.
   *
   * @param transformInput Dataset to be transformed and the Amazon S3 location where it is stored. 
   */
  public fun transformInput(transformInput: TransformInputDsl.() -> Unit = {}) {
    val builder = TransformInputDsl()
    builder.apply(transformInput)
    cdkBuilder.transformInput(builder.build())
  }

  /**
   * Dataset to be transformed and the Amazon S3 location where it is stored.
   *
   * @param transformInput Dataset to be transformed and the Amazon S3 location where it is stored. 
   */
  public fun transformInput(transformInput: TransformInput) {
    cdkBuilder.transformInput(transformInput)
  }

  /**
   * Transform Job Name.
   *
   * @param transformJobName Transform Job Name. 
   */
  public fun transformJobName(transformJobName: String) {
    cdkBuilder.transformJobName(transformJobName)
  }

  /**
   * S3 location where you want Amazon SageMaker to save the results from the transform job.
   *
   * @param transformOutput S3 location where you want Amazon SageMaker to save the results from the
   * transform job. 
   */
  public fun transformOutput(transformOutput: TransformOutputDsl.() -> Unit = {}) {
    val builder = TransformOutputDsl()
    builder.apply(transformOutput)
    cdkBuilder.transformOutput(builder.build())
  }

  /**
   * S3 location where you want Amazon SageMaker to save the results from the transform job.
   *
   * @param transformOutput S3 location where you want Amazon SageMaker to save the results from the
   * transform job. 
   */
  public fun transformOutput(transformOutput: TransformOutput) {
    cdkBuilder.transformOutput(transformOutput)
  }

  /**
   * ML compute instances for the transform job.
   *
   * Default: - 1 instance of type M4.XLarge
   *
   * @param transformResources ML compute instances for the transform job. 
   */
  public fun transformResources(transformResources: TransformResourcesDsl.() -> Unit = {}) {
    val builder = TransformResourcesDsl()
    builder.apply(transformResources)
    cdkBuilder.transformResources(builder.build())
  }

  /**
   * ML compute instances for the transform job.
   *
   * Default: - 1 instance of type M4.XLarge
   *
   * @param transformResources ML compute instances for the transform job. 
   */
  public fun transformResources(transformResources: TransformResources) {
    cdkBuilder.transformResources(transformResources)
  }

  public fun build(): SageMakerCreateTransformJob = cdkBuilder.build()
}
