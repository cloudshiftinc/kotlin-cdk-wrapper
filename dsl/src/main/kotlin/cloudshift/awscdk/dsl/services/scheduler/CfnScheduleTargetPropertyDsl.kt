@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.scheduler

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.scheduler.CfnSchedule

@CdkDslMarker
public class CfnScheduleTargetPropertyDsl {
  private val cdkBuilder: CfnSchedule.TargetProperty.Builder = CfnSchedule.TargetProperty.builder()

  public fun arn(arn: String) {
    cdkBuilder.arn(arn)
  }

  public fun deadLetterConfig(deadLetterConfig: IResolvable) {
    cdkBuilder.deadLetterConfig(deadLetterConfig)
  }

  public fun deadLetterConfig(deadLetterConfig: CfnSchedule.DeadLetterConfigProperty) {
    cdkBuilder.deadLetterConfig(deadLetterConfig)
  }

  public fun ecsParameters(ecsParameters: IResolvable) {
    cdkBuilder.ecsParameters(ecsParameters)
  }

  public fun ecsParameters(ecsParameters: CfnSchedule.EcsParametersProperty) {
    cdkBuilder.ecsParameters(ecsParameters)
  }

  public fun eventBridgeParameters(eventBridgeParameters: IResolvable) {
    cdkBuilder.eventBridgeParameters(eventBridgeParameters)
  }

  public
      fun eventBridgeParameters(eventBridgeParameters: CfnSchedule.EventBridgeParametersProperty) {
    cdkBuilder.eventBridgeParameters(eventBridgeParameters)
  }

  public fun input(input: String) {
    cdkBuilder.input(input)
  }

  public fun kinesisParameters(kinesisParameters: IResolvable) {
    cdkBuilder.kinesisParameters(kinesisParameters)
  }

  public fun kinesisParameters(kinesisParameters: CfnSchedule.KinesisParametersProperty) {
    cdkBuilder.kinesisParameters(kinesisParameters)
  }

  public fun retryPolicy(retryPolicy: IResolvable) {
    cdkBuilder.retryPolicy(retryPolicy)
  }

  public fun retryPolicy(retryPolicy: CfnSchedule.RetryPolicyProperty) {
    cdkBuilder.retryPolicy(retryPolicy)
  }

  public fun roleArn(roleArn: String) {
    cdkBuilder.roleArn(roleArn)
  }

  public fun sageMakerPipelineParameters(sageMakerPipelineParameters: IResolvable) {
    cdkBuilder.sageMakerPipelineParameters(sageMakerPipelineParameters)
  }

  public
      fun sageMakerPipelineParameters(sageMakerPipelineParameters: CfnSchedule.SageMakerPipelineParametersProperty) {
    cdkBuilder.sageMakerPipelineParameters(sageMakerPipelineParameters)
  }

  public fun sqsParameters(sqsParameters: IResolvable) {
    cdkBuilder.sqsParameters(sqsParameters)
  }

  public fun sqsParameters(sqsParameters: CfnSchedule.SqsParametersProperty) {
    cdkBuilder.sqsParameters(sqsParameters)
  }

  public fun build(): CfnSchedule.TargetProperty = cdkBuilder.build()
}
