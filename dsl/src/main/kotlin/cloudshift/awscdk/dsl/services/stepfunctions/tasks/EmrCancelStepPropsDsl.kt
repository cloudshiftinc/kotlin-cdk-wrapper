@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.stepfunctions.tasks

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import cloudshift.awscdk.dsl.services.stepfunctions.CredentialsDsl
import kotlin.Any
import kotlin.Deprecated
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.stepfunctions.Credentials
import software.amazon.awscdk.services.stepfunctions.IntegrationPattern
import software.amazon.awscdk.services.stepfunctions.Timeout
import software.amazon.awscdk.services.stepfunctions.tasks.EmrCancelStepProps

@CdkDslMarker
public class EmrCancelStepPropsDsl {
  private val cdkBuilder: EmrCancelStepProps.Builder = EmrCancelStepProps.builder()

  /**
   * @param clusterId The ClusterId to update. 
   */
  public fun clusterId(clusterId: String) {
    cdkBuilder.clusterId(clusterId)
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
   * @param stepId The StepId to cancel. 
   */
  public fun stepId(stepId: String) {
    cdkBuilder.stepId(stepId)
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

  public fun build(): EmrCancelStepProps = cdkBuilder.build()
}
