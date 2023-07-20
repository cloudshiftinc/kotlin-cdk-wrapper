@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.pipes

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.pipes.CfnPipe

@CdkDslMarker
public class CfnPipePipeTargetParametersPropertyDsl {
  private val cdkBuilder: CfnPipe.PipeTargetParametersProperty.Builder =
      CfnPipe.PipeTargetParametersProperty.builder()

  public fun batchJobParameters(batchJobParameters: IResolvable) {
    cdkBuilder.batchJobParameters(batchJobParameters)
  }

  public fun batchJobParameters(batchJobParameters: CfnPipe.PipeTargetBatchJobParametersProperty) {
    cdkBuilder.batchJobParameters(batchJobParameters)
  }

  public fun cloudWatchLogsParameters(cloudWatchLogsParameters: IResolvable) {
    cdkBuilder.cloudWatchLogsParameters(cloudWatchLogsParameters)
  }

  public
      fun cloudWatchLogsParameters(cloudWatchLogsParameters: CfnPipe.PipeTargetCloudWatchLogsParametersProperty) {
    cdkBuilder.cloudWatchLogsParameters(cloudWatchLogsParameters)
  }

  public fun ecsTaskParameters(ecsTaskParameters: IResolvable) {
    cdkBuilder.ecsTaskParameters(ecsTaskParameters)
  }

  public fun ecsTaskParameters(ecsTaskParameters: CfnPipe.PipeTargetEcsTaskParametersProperty) {
    cdkBuilder.ecsTaskParameters(ecsTaskParameters)
  }

  public fun eventBridgeEventBusParameters(eventBridgeEventBusParameters: IResolvable) {
    cdkBuilder.eventBridgeEventBusParameters(eventBridgeEventBusParameters)
  }

  public
      fun eventBridgeEventBusParameters(eventBridgeEventBusParameters: CfnPipe.PipeTargetEventBridgeEventBusParametersProperty) {
    cdkBuilder.eventBridgeEventBusParameters(eventBridgeEventBusParameters)
  }

  public fun httpParameters(httpParameters: IResolvable) {
    cdkBuilder.httpParameters(httpParameters)
  }

  public fun httpParameters(httpParameters: CfnPipe.PipeTargetHttpParametersProperty) {
    cdkBuilder.httpParameters(httpParameters)
  }

  public fun inputTemplate(inputTemplate: String) {
    cdkBuilder.inputTemplate(inputTemplate)
  }

  public fun kinesisStreamParameters(kinesisStreamParameters: IResolvable) {
    cdkBuilder.kinesisStreamParameters(kinesisStreamParameters)
  }

  public
      fun kinesisStreamParameters(kinesisStreamParameters: CfnPipe.PipeTargetKinesisStreamParametersProperty) {
    cdkBuilder.kinesisStreamParameters(kinesisStreamParameters)
  }

  public fun lambdaFunctionParameters(lambdaFunctionParameters: IResolvable) {
    cdkBuilder.lambdaFunctionParameters(lambdaFunctionParameters)
  }

  public
      fun lambdaFunctionParameters(lambdaFunctionParameters: CfnPipe.PipeTargetLambdaFunctionParametersProperty) {
    cdkBuilder.lambdaFunctionParameters(lambdaFunctionParameters)
  }

  public fun redshiftDataParameters(redshiftDataParameters: IResolvable) {
    cdkBuilder.redshiftDataParameters(redshiftDataParameters)
  }

  public
      fun redshiftDataParameters(redshiftDataParameters: CfnPipe.PipeTargetRedshiftDataParametersProperty) {
    cdkBuilder.redshiftDataParameters(redshiftDataParameters)
  }

  public fun sageMakerPipelineParameters(sageMakerPipelineParameters: IResolvable) {
    cdkBuilder.sageMakerPipelineParameters(sageMakerPipelineParameters)
  }

  public
      fun sageMakerPipelineParameters(sageMakerPipelineParameters: CfnPipe.PipeTargetSageMakerPipelineParametersProperty) {
    cdkBuilder.sageMakerPipelineParameters(sageMakerPipelineParameters)
  }

  public fun sqsQueueParameters(sqsQueueParameters: IResolvable) {
    cdkBuilder.sqsQueueParameters(sqsQueueParameters)
  }

  public fun sqsQueueParameters(sqsQueueParameters: CfnPipe.PipeTargetSqsQueueParametersProperty) {
    cdkBuilder.sqsQueueParameters(sqsQueueParameters)
  }

  public fun stepFunctionStateMachineParameters(stepFunctionStateMachineParameters: IResolvable) {
    cdkBuilder.stepFunctionStateMachineParameters(stepFunctionStateMachineParameters)
  }

  public
      fun stepFunctionStateMachineParameters(stepFunctionStateMachineParameters: CfnPipe.PipeTargetStateMachineParametersProperty) {
    cdkBuilder.stepFunctionStateMachineParameters(stepFunctionStateMachineParameters)
  }

  public fun build(): CfnPipe.PipeTargetParametersProperty = cdkBuilder.build()
}
