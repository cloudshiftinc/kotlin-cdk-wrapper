@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.stepfunctions.tasks

import cloudshift.awscdk.dsl.services.cloudwatch.MetricOptionsDsl
import cloudshift.awscdk.dsl.services.stepfunctions.CatchPropsDsl
import cloudshift.awscdk.dsl.services.stepfunctions.RetryPropsDsl
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cloudwatch.Metric
import software.amazon.awscdk.services.stepfunctions.IChainable
import software.amazon.awscdk.services.stepfunctions.TaskStateBase
import software.amazon.awscdk.services.stepfunctions.tasks.AthenaGetQueryExecution
import software.amazon.awscdk.services.stepfunctions.tasks.AthenaGetQueryResults
import software.amazon.awscdk.services.stepfunctions.tasks.AthenaStartQueryExecution
import software.amazon.awscdk.services.stepfunctions.tasks.AthenaStopQueryExecution
import software.amazon.awscdk.services.stepfunctions.tasks.BatchSubmitJob
import software.amazon.awscdk.services.stepfunctions.tasks.CallApiGatewayHttpApiEndpoint
import software.amazon.awscdk.services.stepfunctions.tasks.CallApiGatewayRestApiEndpoint
import software.amazon.awscdk.services.stepfunctions.tasks.CallAwsService
import software.amazon.awscdk.services.stepfunctions.tasks.CodeBuildStartBuild
import software.amazon.awscdk.services.stepfunctions.tasks.DynamoDeleteItem
import software.amazon.awscdk.services.stepfunctions.tasks.DynamoGetItem
import software.amazon.awscdk.services.stepfunctions.tasks.DynamoPutItem
import software.amazon.awscdk.services.stepfunctions.tasks.DynamoUpdateItem
import software.amazon.awscdk.services.stepfunctions.tasks.EcsEc2LaunchTarget
import software.amazon.awscdk.services.stepfunctions.tasks.EcsFargateLaunchTarget
import software.amazon.awscdk.services.stepfunctions.tasks.EcsLaunchTargetConfig
import software.amazon.awscdk.services.stepfunctions.tasks.EcsRunTask
import software.amazon.awscdk.services.stepfunctions.tasks.EksCall
import software.amazon.awscdk.services.stepfunctions.tasks.EmrAddStep
import software.amazon.awscdk.services.stepfunctions.tasks.EmrCancelStep
import software.amazon.awscdk.services.stepfunctions.tasks.EmrContainersCreateVirtualCluster
import software.amazon.awscdk.services.stepfunctions.tasks.EmrContainersDeleteVirtualCluster
import software.amazon.awscdk.services.stepfunctions.tasks.EmrContainersStartJobRun
import software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster
import software.amazon.awscdk.services.stepfunctions.tasks.EmrModifyInstanceFleetByName
import software.amazon.awscdk.services.stepfunctions.tasks.EmrModifyInstanceGroupByName
import software.amazon.awscdk.services.stepfunctions.tasks.EmrSetClusterTerminationProtection
import software.amazon.awscdk.services.stepfunctions.tasks.EmrTerminateCluster
import software.amazon.awscdk.services.stepfunctions.tasks.EvaluateExpression
import software.amazon.awscdk.services.stepfunctions.tasks.EventBridgePutEvents
import software.amazon.awscdk.services.stepfunctions.tasks.GlueDataBrewStartJobRun
import software.amazon.awscdk.services.stepfunctions.tasks.GlueStartJobRun
import software.amazon.awscdk.services.stepfunctions.tasks.LambdaInvoke
import software.amazon.awscdk.services.stepfunctions.tasks.SageMakerCreateEndpoint
import software.amazon.awscdk.services.stepfunctions.tasks.SageMakerCreateEndpointConfig
import software.amazon.awscdk.services.stepfunctions.tasks.SageMakerCreateModel
import software.amazon.awscdk.services.stepfunctions.tasks.SageMakerCreateTrainingJob
import software.amazon.awscdk.services.stepfunctions.tasks.SageMakerCreateTransformJob
import software.amazon.awscdk.services.stepfunctions.tasks.SageMakerUpdateEndpoint
import software.amazon.awscdk.services.stepfunctions.tasks.SnsPublish
import software.amazon.awscdk.services.stepfunctions.tasks.SqsSendMessage
import software.amazon.awscdk.services.stepfunctions.tasks.StepFunctionsInvokeActivity
import software.amazon.awscdk.services.stepfunctions.tasks.StepFunctionsStartExecution

public inline fun AthenaGetQueryExecution.addCatch(arg0: IChainable, block: CatchPropsDsl.() -> Unit
    = {}): TaskStateBase {
  val builder = CatchPropsDsl()
  builder.apply(block)
  return addCatch(arg0,builder.build())
}

public inline fun AthenaGetQueryExecution.addRetry(block: RetryPropsDsl.() -> Unit = {}):
    TaskStateBase {
  val builder = RetryPropsDsl()
  builder.apply(block)
  return addRetry(builder.build())
}

public inline fun AthenaGetQueryExecution.metric(arg0: String, block: MetricOptionsDsl.() -> Unit =
    {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metric(arg0,builder.build())
}

public inline fun AthenaGetQueryExecution.metricFailed(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricFailed(builder.build())
}

public inline fun AthenaGetQueryExecution.metricHeartbeatTimedOut(block: MetricOptionsDsl.() -> Unit
    = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricHeartbeatTimedOut(builder.build())
}

public inline fun AthenaGetQueryExecution.metricRunTime(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricRunTime(builder.build())
}

public inline fun AthenaGetQueryExecution.metricScheduleTime(block: MetricOptionsDsl.() -> Unit =
    {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricScheduleTime(builder.build())
}

public inline fun AthenaGetQueryExecution.metricScheduled(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricScheduled(builder.build())
}

public inline fun AthenaGetQueryExecution.metricStarted(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricStarted(builder.build())
}

public inline fun AthenaGetQueryExecution.metricSucceeded(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricSucceeded(builder.build())
}

public inline fun AthenaGetQueryExecution.metricTime(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricTime(builder.build())
}

public inline fun AthenaGetQueryExecution.metricTimedOut(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricTimedOut(builder.build())
}

public inline fun AthenaGetQueryResults.addCatch(arg0: IChainable, block: CatchPropsDsl.() -> Unit =
    {}): TaskStateBase {
  val builder = CatchPropsDsl()
  builder.apply(block)
  return addCatch(arg0,builder.build())
}

public inline fun AthenaGetQueryResults.addRetry(block: RetryPropsDsl.() -> Unit = {}):
    TaskStateBase {
  val builder = RetryPropsDsl()
  builder.apply(block)
  return addRetry(builder.build())
}

public inline fun AthenaGetQueryResults.metric(arg0: String, block: MetricOptionsDsl.() -> Unit =
    {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metric(arg0,builder.build())
}

public inline fun AthenaGetQueryResults.metricFailed(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricFailed(builder.build())
}

public inline fun AthenaGetQueryResults.metricHeartbeatTimedOut(block: MetricOptionsDsl.() -> Unit =
    {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricHeartbeatTimedOut(builder.build())
}

public inline fun AthenaGetQueryResults.metricRunTime(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricRunTime(builder.build())
}

public inline fun AthenaGetQueryResults.metricScheduleTime(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricScheduleTime(builder.build())
}

public inline fun AthenaGetQueryResults.metricScheduled(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricScheduled(builder.build())
}

public inline fun AthenaGetQueryResults.metricStarted(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricStarted(builder.build())
}

public inline fun AthenaGetQueryResults.metricSucceeded(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricSucceeded(builder.build())
}

public inline fun AthenaGetQueryResults.metricTime(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricTime(builder.build())
}

public inline fun AthenaGetQueryResults.metricTimedOut(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricTimedOut(builder.build())
}

public inline fun AthenaStartQueryExecution.addCatch(arg0: IChainable,
    block: CatchPropsDsl.() -> Unit = {}): TaskStateBase {
  val builder = CatchPropsDsl()
  builder.apply(block)
  return addCatch(arg0,builder.build())
}

public inline fun AthenaStartQueryExecution.addRetry(block: RetryPropsDsl.() -> Unit = {}):
    TaskStateBase {
  val builder = RetryPropsDsl()
  builder.apply(block)
  return addRetry(builder.build())
}

public inline fun AthenaStartQueryExecution.metric(arg0: String, block: MetricOptionsDsl.() -> Unit
    = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metric(arg0,builder.build())
}

public inline fun AthenaStartQueryExecution.metricFailed(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricFailed(builder.build())
}

public inline
    fun AthenaStartQueryExecution.metricHeartbeatTimedOut(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricHeartbeatTimedOut(builder.build())
}

public inline fun AthenaStartQueryExecution.metricRunTime(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricRunTime(builder.build())
}

public inline fun AthenaStartQueryExecution.metricScheduleTime(block: MetricOptionsDsl.() -> Unit =
    {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricScheduleTime(builder.build())
}

public inline fun AthenaStartQueryExecution.metricScheduled(block: MetricOptionsDsl.() -> Unit =
    {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricScheduled(builder.build())
}

public inline fun AthenaStartQueryExecution.metricStarted(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricStarted(builder.build())
}

public inline fun AthenaStartQueryExecution.metricSucceeded(block: MetricOptionsDsl.() -> Unit =
    {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricSucceeded(builder.build())
}

public inline fun AthenaStartQueryExecution.metricTime(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricTime(builder.build())
}

public inline fun AthenaStartQueryExecution.metricTimedOut(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricTimedOut(builder.build())
}

public inline fun AthenaStopQueryExecution.addCatch(arg0: IChainable,
    block: CatchPropsDsl.() -> Unit = {}): TaskStateBase {
  val builder = CatchPropsDsl()
  builder.apply(block)
  return addCatch(arg0,builder.build())
}

public inline fun AthenaStopQueryExecution.addRetry(block: RetryPropsDsl.() -> Unit = {}):
    TaskStateBase {
  val builder = RetryPropsDsl()
  builder.apply(block)
  return addRetry(builder.build())
}

public inline fun AthenaStopQueryExecution.metric(arg0: String, block: MetricOptionsDsl.() -> Unit =
    {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metric(arg0,builder.build())
}

public inline fun AthenaStopQueryExecution.metricFailed(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricFailed(builder.build())
}

public inline
    fun AthenaStopQueryExecution.metricHeartbeatTimedOut(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricHeartbeatTimedOut(builder.build())
}

public inline fun AthenaStopQueryExecution.metricRunTime(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricRunTime(builder.build())
}

public inline fun AthenaStopQueryExecution.metricScheduleTime(block: MetricOptionsDsl.() -> Unit =
    {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricScheduleTime(builder.build())
}

public inline fun AthenaStopQueryExecution.metricScheduled(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricScheduled(builder.build())
}

public inline fun AthenaStopQueryExecution.metricStarted(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricStarted(builder.build())
}

public inline fun AthenaStopQueryExecution.metricSucceeded(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricSucceeded(builder.build())
}

public inline fun AthenaStopQueryExecution.metricTime(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricTime(builder.build())
}

public inline fun AthenaStopQueryExecution.metricTimedOut(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricTimedOut(builder.build())
}

public inline fun BatchSubmitJob.addCatch(arg0: IChainable, block: CatchPropsDsl.() -> Unit = {}):
    TaskStateBase {
  val builder = CatchPropsDsl()
  builder.apply(block)
  return addCatch(arg0,builder.build())
}

public inline fun BatchSubmitJob.addRetry(block: RetryPropsDsl.() -> Unit = {}): TaskStateBase {
  val builder = RetryPropsDsl()
  builder.apply(block)
  return addRetry(builder.build())
}

public inline fun BatchSubmitJob.metric(arg0: String, block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metric(arg0,builder.build())
}

public inline fun BatchSubmitJob.metricFailed(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricFailed(builder.build())
}

public inline fun BatchSubmitJob.metricHeartbeatTimedOut(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricHeartbeatTimedOut(builder.build())
}

public inline fun BatchSubmitJob.metricRunTime(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricRunTime(builder.build())
}

public inline fun BatchSubmitJob.metricScheduleTime(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricScheduleTime(builder.build())
}

public inline fun BatchSubmitJob.metricScheduled(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricScheduled(builder.build())
}

public inline fun BatchSubmitJob.metricStarted(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricStarted(builder.build())
}

public inline fun BatchSubmitJob.metricSucceeded(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricSucceeded(builder.build())
}

public inline fun BatchSubmitJob.metricTime(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricTime(builder.build())
}

public inline fun BatchSubmitJob.metricTimedOut(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricTimedOut(builder.build())
}

public inline fun CallApiGatewayHttpApiEndpoint.addCatch(arg0: IChainable,
    block: CatchPropsDsl.() -> Unit = {}): TaskStateBase {
  val builder = CatchPropsDsl()
  builder.apply(block)
  return addCatch(arg0,builder.build())
}

public inline fun CallApiGatewayHttpApiEndpoint.addRetry(block: RetryPropsDsl.() -> Unit = {}):
    TaskStateBase {
  val builder = RetryPropsDsl()
  builder.apply(block)
  return addRetry(builder.build())
}

public inline fun CallApiGatewayHttpApiEndpoint.metric(arg0: String,
    block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metric(arg0,builder.build())
}

public inline fun CallApiGatewayHttpApiEndpoint.metricFailed(block: MetricOptionsDsl.() -> Unit =
    {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricFailed(builder.build())
}

public inline
    fun CallApiGatewayHttpApiEndpoint.metricHeartbeatTimedOut(block: MetricOptionsDsl.() -> Unit =
    {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricHeartbeatTimedOut(builder.build())
}

public inline fun CallApiGatewayHttpApiEndpoint.metricRunTime(block: MetricOptionsDsl.() -> Unit =
    {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricRunTime(builder.build())
}

public inline
    fun CallApiGatewayHttpApiEndpoint.metricScheduleTime(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricScheduleTime(builder.build())
}

public inline fun CallApiGatewayHttpApiEndpoint.metricScheduled(block: MetricOptionsDsl.() -> Unit =
    {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricScheduled(builder.build())
}

public inline fun CallApiGatewayHttpApiEndpoint.metricStarted(block: MetricOptionsDsl.() -> Unit =
    {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricStarted(builder.build())
}

public inline fun CallApiGatewayHttpApiEndpoint.metricSucceeded(block: MetricOptionsDsl.() -> Unit =
    {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricSucceeded(builder.build())
}

public inline fun CallApiGatewayHttpApiEndpoint.metricTime(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricTime(builder.build())
}

public inline fun CallApiGatewayHttpApiEndpoint.metricTimedOut(block: MetricOptionsDsl.() -> Unit =
    {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricTimedOut(builder.build())
}

public inline fun CallApiGatewayRestApiEndpoint.addCatch(arg0: IChainable,
    block: CatchPropsDsl.() -> Unit = {}): TaskStateBase {
  val builder = CatchPropsDsl()
  builder.apply(block)
  return addCatch(arg0,builder.build())
}

public inline fun CallApiGatewayRestApiEndpoint.addRetry(block: RetryPropsDsl.() -> Unit = {}):
    TaskStateBase {
  val builder = RetryPropsDsl()
  builder.apply(block)
  return addRetry(builder.build())
}

public inline fun CallApiGatewayRestApiEndpoint.metric(arg0: String,
    block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metric(arg0,builder.build())
}

public inline fun CallApiGatewayRestApiEndpoint.metricFailed(block: MetricOptionsDsl.() -> Unit =
    {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricFailed(builder.build())
}

public inline
    fun CallApiGatewayRestApiEndpoint.metricHeartbeatTimedOut(block: MetricOptionsDsl.() -> Unit =
    {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricHeartbeatTimedOut(builder.build())
}

public inline fun CallApiGatewayRestApiEndpoint.metricRunTime(block: MetricOptionsDsl.() -> Unit =
    {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricRunTime(builder.build())
}

public inline
    fun CallApiGatewayRestApiEndpoint.metricScheduleTime(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricScheduleTime(builder.build())
}

public inline fun CallApiGatewayRestApiEndpoint.metricScheduled(block: MetricOptionsDsl.() -> Unit =
    {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricScheduled(builder.build())
}

public inline fun CallApiGatewayRestApiEndpoint.metricStarted(block: MetricOptionsDsl.() -> Unit =
    {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricStarted(builder.build())
}

public inline fun CallApiGatewayRestApiEndpoint.metricSucceeded(block: MetricOptionsDsl.() -> Unit =
    {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricSucceeded(builder.build())
}

public inline fun CallApiGatewayRestApiEndpoint.metricTime(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricTime(builder.build())
}

public inline fun CallApiGatewayRestApiEndpoint.metricTimedOut(block: MetricOptionsDsl.() -> Unit =
    {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricTimedOut(builder.build())
}

public inline fun CallAwsService.addCatch(arg0: IChainable, block: CatchPropsDsl.() -> Unit = {}):
    TaskStateBase {
  val builder = CatchPropsDsl()
  builder.apply(block)
  return addCatch(arg0,builder.build())
}

public inline fun CallAwsService.addRetry(block: RetryPropsDsl.() -> Unit = {}): TaskStateBase {
  val builder = RetryPropsDsl()
  builder.apply(block)
  return addRetry(builder.build())
}

public inline fun CallAwsService.metric(arg0: String, block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metric(arg0,builder.build())
}

public inline fun CallAwsService.metricFailed(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricFailed(builder.build())
}

public inline fun CallAwsService.metricHeartbeatTimedOut(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricHeartbeatTimedOut(builder.build())
}

public inline fun CallAwsService.metricRunTime(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricRunTime(builder.build())
}

public inline fun CallAwsService.metricScheduleTime(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricScheduleTime(builder.build())
}

public inline fun CallAwsService.metricScheduled(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricScheduled(builder.build())
}

public inline fun CallAwsService.metricStarted(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricStarted(builder.build())
}

public inline fun CallAwsService.metricSucceeded(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricSucceeded(builder.build())
}

public inline fun CallAwsService.metricTime(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricTime(builder.build())
}

public inline fun CallAwsService.metricTimedOut(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricTimedOut(builder.build())
}

public inline fun CodeBuildStartBuild.addCatch(arg0: IChainable, block: CatchPropsDsl.() -> Unit =
    {}): TaskStateBase {
  val builder = CatchPropsDsl()
  builder.apply(block)
  return addCatch(arg0,builder.build())
}

public inline fun CodeBuildStartBuild.addRetry(block: RetryPropsDsl.() -> Unit = {}):
    TaskStateBase {
  val builder = RetryPropsDsl()
  builder.apply(block)
  return addRetry(builder.build())
}

public inline fun CodeBuildStartBuild.metric(arg0: String, block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metric(arg0,builder.build())
}

public inline fun CodeBuildStartBuild.metricFailed(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricFailed(builder.build())
}

public inline fun CodeBuildStartBuild.metricHeartbeatTimedOut(block: MetricOptionsDsl.() -> Unit =
    {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricHeartbeatTimedOut(builder.build())
}

public inline fun CodeBuildStartBuild.metricRunTime(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricRunTime(builder.build())
}

public inline fun CodeBuildStartBuild.metricScheduleTime(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricScheduleTime(builder.build())
}

public inline fun CodeBuildStartBuild.metricScheduled(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricScheduled(builder.build())
}

public inline fun CodeBuildStartBuild.metricStarted(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricStarted(builder.build())
}

public inline fun CodeBuildStartBuild.metricSucceeded(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricSucceeded(builder.build())
}

public inline fun CodeBuildStartBuild.metricTime(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricTime(builder.build())
}

public inline fun CodeBuildStartBuild.metricTimedOut(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricTimedOut(builder.build())
}

public inline fun DynamoDeleteItem.addCatch(arg0: IChainable, block: CatchPropsDsl.() -> Unit = {}):
    TaskStateBase {
  val builder = CatchPropsDsl()
  builder.apply(block)
  return addCatch(arg0,builder.build())
}

public inline fun DynamoDeleteItem.addRetry(block: RetryPropsDsl.() -> Unit = {}): TaskStateBase {
  val builder = RetryPropsDsl()
  builder.apply(block)
  return addRetry(builder.build())
}

public inline fun DynamoDeleteItem.metric(arg0: String, block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metric(arg0,builder.build())
}

public inline fun DynamoDeleteItem.metricFailed(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricFailed(builder.build())
}

public inline fun DynamoDeleteItem.metricHeartbeatTimedOut(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricHeartbeatTimedOut(builder.build())
}

public inline fun DynamoDeleteItem.metricRunTime(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricRunTime(builder.build())
}

public inline fun DynamoDeleteItem.metricScheduleTime(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricScheduleTime(builder.build())
}

public inline fun DynamoDeleteItem.metricScheduled(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricScheduled(builder.build())
}

public inline fun DynamoDeleteItem.metricStarted(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricStarted(builder.build())
}

public inline fun DynamoDeleteItem.metricSucceeded(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricSucceeded(builder.build())
}

public inline fun DynamoDeleteItem.metricTime(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricTime(builder.build())
}

public inline fun DynamoDeleteItem.metricTimedOut(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricTimedOut(builder.build())
}

public inline fun DynamoGetItem.addCatch(arg0: IChainable, block: CatchPropsDsl.() -> Unit = {}):
    TaskStateBase {
  val builder = CatchPropsDsl()
  builder.apply(block)
  return addCatch(arg0,builder.build())
}

public inline fun DynamoGetItem.addRetry(block: RetryPropsDsl.() -> Unit = {}): TaskStateBase {
  val builder = RetryPropsDsl()
  builder.apply(block)
  return addRetry(builder.build())
}

public inline fun DynamoGetItem.metric(arg0: String, block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metric(arg0,builder.build())
}

public inline fun DynamoGetItem.metricFailed(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricFailed(builder.build())
}

public inline fun DynamoGetItem.metricHeartbeatTimedOut(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricHeartbeatTimedOut(builder.build())
}

public inline fun DynamoGetItem.metricRunTime(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricRunTime(builder.build())
}

public inline fun DynamoGetItem.metricScheduleTime(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricScheduleTime(builder.build())
}

public inline fun DynamoGetItem.metricScheduled(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricScheduled(builder.build())
}

public inline fun DynamoGetItem.metricStarted(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricStarted(builder.build())
}

public inline fun DynamoGetItem.metricSucceeded(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricSucceeded(builder.build())
}

public inline fun DynamoGetItem.metricTime(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricTime(builder.build())
}

public inline fun DynamoGetItem.metricTimedOut(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricTimedOut(builder.build())
}

public inline fun DynamoPutItem.addCatch(arg0: IChainable, block: CatchPropsDsl.() -> Unit = {}):
    TaskStateBase {
  val builder = CatchPropsDsl()
  builder.apply(block)
  return addCatch(arg0,builder.build())
}

public inline fun DynamoPutItem.addRetry(block: RetryPropsDsl.() -> Unit = {}): TaskStateBase {
  val builder = RetryPropsDsl()
  builder.apply(block)
  return addRetry(builder.build())
}

public inline fun DynamoPutItem.metric(arg0: String, block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metric(arg0,builder.build())
}

public inline fun DynamoPutItem.metricFailed(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricFailed(builder.build())
}

public inline fun DynamoPutItem.metricHeartbeatTimedOut(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricHeartbeatTimedOut(builder.build())
}

public inline fun DynamoPutItem.metricRunTime(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricRunTime(builder.build())
}

public inline fun DynamoPutItem.metricScheduleTime(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricScheduleTime(builder.build())
}

public inline fun DynamoPutItem.metricScheduled(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricScheduled(builder.build())
}

public inline fun DynamoPutItem.metricStarted(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricStarted(builder.build())
}

public inline fun DynamoPutItem.metricSucceeded(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricSucceeded(builder.build())
}

public inline fun DynamoPutItem.metricTime(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricTime(builder.build())
}

public inline fun DynamoPutItem.metricTimedOut(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricTimedOut(builder.build())
}

public inline fun DynamoUpdateItem.addCatch(arg0: IChainable, block: CatchPropsDsl.() -> Unit = {}):
    TaskStateBase {
  val builder = CatchPropsDsl()
  builder.apply(block)
  return addCatch(arg0,builder.build())
}

public inline fun DynamoUpdateItem.addRetry(block: RetryPropsDsl.() -> Unit = {}): TaskStateBase {
  val builder = RetryPropsDsl()
  builder.apply(block)
  return addRetry(builder.build())
}

public inline fun DynamoUpdateItem.metric(arg0: String, block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metric(arg0,builder.build())
}

public inline fun DynamoUpdateItem.metricFailed(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricFailed(builder.build())
}

public inline fun DynamoUpdateItem.metricHeartbeatTimedOut(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricHeartbeatTimedOut(builder.build())
}

public inline fun DynamoUpdateItem.metricRunTime(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricRunTime(builder.build())
}

public inline fun DynamoUpdateItem.metricScheduleTime(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricScheduleTime(builder.build())
}

public inline fun DynamoUpdateItem.metricScheduled(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricScheduled(builder.build())
}

public inline fun DynamoUpdateItem.metricStarted(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricStarted(builder.build())
}

public inline fun DynamoUpdateItem.metricSucceeded(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricSucceeded(builder.build())
}

public inline fun DynamoUpdateItem.metricTime(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricTime(builder.build())
}

public inline fun DynamoUpdateItem.metricTimedOut(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricTimedOut(builder.build())
}

public inline fun EcsEc2LaunchTarget.bind(arg0: EcsRunTask,
    block: LaunchTargetBindOptionsDsl.() -> Unit = {}): EcsLaunchTargetConfig {
  val builder = LaunchTargetBindOptionsDsl()
  builder.apply(block)
  return bind(arg0,builder.build())
}

public inline fun EcsFargateLaunchTarget.bind(arg0: EcsRunTask,
    block: LaunchTargetBindOptionsDsl.() -> Unit = {}): EcsLaunchTargetConfig {
  val builder = LaunchTargetBindOptionsDsl()
  builder.apply(block)
  return bind(arg0,builder.build())
}

public inline fun EcsRunTask.addCatch(arg0: IChainable, block: CatchPropsDsl.() -> Unit = {}):
    TaskStateBase {
  val builder = CatchPropsDsl()
  builder.apply(block)
  return addCatch(arg0,builder.build())
}

public inline fun EcsRunTask.addRetry(block: RetryPropsDsl.() -> Unit = {}): TaskStateBase {
  val builder = RetryPropsDsl()
  builder.apply(block)
  return addRetry(builder.build())
}

public inline fun EcsRunTask.metric(arg0: String, block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metric(arg0,builder.build())
}

public inline fun EcsRunTask.metricFailed(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricFailed(builder.build())
}

public inline fun EcsRunTask.metricHeartbeatTimedOut(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricHeartbeatTimedOut(builder.build())
}

public inline fun EcsRunTask.metricRunTime(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricRunTime(builder.build())
}

public inline fun EcsRunTask.metricScheduleTime(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricScheduleTime(builder.build())
}

public inline fun EcsRunTask.metricScheduled(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricScheduled(builder.build())
}

public inline fun EcsRunTask.metricStarted(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricStarted(builder.build())
}

public inline fun EcsRunTask.metricSucceeded(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricSucceeded(builder.build())
}

public inline fun EcsRunTask.metricTime(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricTime(builder.build())
}

public inline fun EcsRunTask.metricTimedOut(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricTimedOut(builder.build())
}

public inline fun EksCall.addCatch(arg0: IChainable, block: CatchPropsDsl.() -> Unit = {}):
    TaskStateBase {
  val builder = CatchPropsDsl()
  builder.apply(block)
  return addCatch(arg0,builder.build())
}

public inline fun EksCall.addRetry(block: RetryPropsDsl.() -> Unit = {}): TaskStateBase {
  val builder = RetryPropsDsl()
  builder.apply(block)
  return addRetry(builder.build())
}

public inline fun EksCall.metric(arg0: String, block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metric(arg0,builder.build())
}

public inline fun EksCall.metricFailed(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricFailed(builder.build())
}

public inline fun EksCall.metricHeartbeatTimedOut(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricHeartbeatTimedOut(builder.build())
}

public inline fun EksCall.metricRunTime(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricRunTime(builder.build())
}

public inline fun EksCall.metricScheduleTime(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricScheduleTime(builder.build())
}

public inline fun EksCall.metricScheduled(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricScheduled(builder.build())
}

public inline fun EksCall.metricStarted(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricStarted(builder.build())
}

public inline fun EksCall.metricSucceeded(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricSucceeded(builder.build())
}

public inline fun EksCall.metricTime(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricTime(builder.build())
}

public inline fun EksCall.metricTimedOut(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricTimedOut(builder.build())
}

public inline fun EmrAddStep.addCatch(arg0: IChainable, block: CatchPropsDsl.() -> Unit = {}):
    TaskStateBase {
  val builder = CatchPropsDsl()
  builder.apply(block)
  return addCatch(arg0,builder.build())
}

public inline fun EmrAddStep.addRetry(block: RetryPropsDsl.() -> Unit = {}): TaskStateBase {
  val builder = RetryPropsDsl()
  builder.apply(block)
  return addRetry(builder.build())
}

public inline fun EmrAddStep.metric(arg0: String, block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metric(arg0,builder.build())
}

public inline fun EmrAddStep.metricFailed(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricFailed(builder.build())
}

public inline fun EmrAddStep.metricHeartbeatTimedOut(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricHeartbeatTimedOut(builder.build())
}

public inline fun EmrAddStep.metricRunTime(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricRunTime(builder.build())
}

public inline fun EmrAddStep.metricScheduleTime(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricScheduleTime(builder.build())
}

public inline fun EmrAddStep.metricScheduled(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricScheduled(builder.build())
}

public inline fun EmrAddStep.metricStarted(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricStarted(builder.build())
}

public inline fun EmrAddStep.metricSucceeded(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricSucceeded(builder.build())
}

public inline fun EmrAddStep.metricTime(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricTime(builder.build())
}

public inline fun EmrAddStep.metricTimedOut(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricTimedOut(builder.build())
}

public inline fun EmrCancelStep.addCatch(arg0: IChainable, block: CatchPropsDsl.() -> Unit = {}):
    TaskStateBase {
  val builder = CatchPropsDsl()
  builder.apply(block)
  return addCatch(arg0,builder.build())
}

public inline fun EmrCancelStep.addRetry(block: RetryPropsDsl.() -> Unit = {}): TaskStateBase {
  val builder = RetryPropsDsl()
  builder.apply(block)
  return addRetry(builder.build())
}

public inline fun EmrCancelStep.metric(arg0: String, block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metric(arg0,builder.build())
}

public inline fun EmrCancelStep.metricFailed(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricFailed(builder.build())
}

public inline fun EmrCancelStep.metricHeartbeatTimedOut(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricHeartbeatTimedOut(builder.build())
}

public inline fun EmrCancelStep.metricRunTime(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricRunTime(builder.build())
}

public inline fun EmrCancelStep.metricScheduleTime(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricScheduleTime(builder.build())
}

public inline fun EmrCancelStep.metricScheduled(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricScheduled(builder.build())
}

public inline fun EmrCancelStep.metricStarted(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricStarted(builder.build())
}

public inline fun EmrCancelStep.metricSucceeded(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricSucceeded(builder.build())
}

public inline fun EmrCancelStep.metricTime(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricTime(builder.build())
}

public inline fun EmrCancelStep.metricTimedOut(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricTimedOut(builder.build())
}

public inline fun EmrContainersCreateVirtualCluster.addCatch(arg0: IChainable,
    block: CatchPropsDsl.() -> Unit = {}): TaskStateBase {
  val builder = CatchPropsDsl()
  builder.apply(block)
  return addCatch(arg0,builder.build())
}

public inline fun EmrContainersCreateVirtualCluster.addRetry(block: RetryPropsDsl.() -> Unit = {}):
    TaskStateBase {
  val builder = RetryPropsDsl()
  builder.apply(block)
  return addRetry(builder.build())
}

public inline fun EmrContainersCreateVirtualCluster.metric(arg0: String,
    block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metric(arg0,builder.build())
}

public inline fun EmrContainersCreateVirtualCluster.metricFailed(block: MetricOptionsDsl.() -> Unit
    = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricFailed(builder.build())
}

public inline
    fun EmrContainersCreateVirtualCluster.metricHeartbeatTimedOut(block: MetricOptionsDsl.() -> Unit
    = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricHeartbeatTimedOut(builder.build())
}

public inline fun EmrContainersCreateVirtualCluster.metricRunTime(block: MetricOptionsDsl.() -> Unit
    = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricRunTime(builder.build())
}

public inline
    fun EmrContainersCreateVirtualCluster.metricScheduleTime(block: MetricOptionsDsl.() -> Unit =
    {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricScheduleTime(builder.build())
}

public inline
    fun EmrContainersCreateVirtualCluster.metricScheduled(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricScheduled(builder.build())
}

public inline fun EmrContainersCreateVirtualCluster.metricStarted(block: MetricOptionsDsl.() -> Unit
    = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricStarted(builder.build())
}

public inline
    fun EmrContainersCreateVirtualCluster.metricSucceeded(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricSucceeded(builder.build())
}

public inline fun EmrContainersCreateVirtualCluster.metricTime(block: MetricOptionsDsl.() -> Unit =
    {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricTime(builder.build())
}

public inline
    fun EmrContainersCreateVirtualCluster.metricTimedOut(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricTimedOut(builder.build())
}

public inline fun EmrContainersDeleteVirtualCluster.addCatch(arg0: IChainable,
    block: CatchPropsDsl.() -> Unit = {}): TaskStateBase {
  val builder = CatchPropsDsl()
  builder.apply(block)
  return addCatch(arg0,builder.build())
}

public inline fun EmrContainersDeleteVirtualCluster.addRetry(block: RetryPropsDsl.() -> Unit = {}):
    TaskStateBase {
  val builder = RetryPropsDsl()
  builder.apply(block)
  return addRetry(builder.build())
}

public inline fun EmrContainersDeleteVirtualCluster.metric(arg0: String,
    block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metric(arg0,builder.build())
}

public inline fun EmrContainersDeleteVirtualCluster.metricFailed(block: MetricOptionsDsl.() -> Unit
    = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricFailed(builder.build())
}

public inline
    fun EmrContainersDeleteVirtualCluster.metricHeartbeatTimedOut(block: MetricOptionsDsl.() -> Unit
    = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricHeartbeatTimedOut(builder.build())
}

public inline fun EmrContainersDeleteVirtualCluster.metricRunTime(block: MetricOptionsDsl.() -> Unit
    = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricRunTime(builder.build())
}

public inline
    fun EmrContainersDeleteVirtualCluster.metricScheduleTime(block: MetricOptionsDsl.() -> Unit =
    {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricScheduleTime(builder.build())
}

public inline
    fun EmrContainersDeleteVirtualCluster.metricScheduled(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricScheduled(builder.build())
}

public inline fun EmrContainersDeleteVirtualCluster.metricStarted(block: MetricOptionsDsl.() -> Unit
    = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricStarted(builder.build())
}

public inline
    fun EmrContainersDeleteVirtualCluster.metricSucceeded(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricSucceeded(builder.build())
}

public inline fun EmrContainersDeleteVirtualCluster.metricTime(block: MetricOptionsDsl.() -> Unit =
    {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricTime(builder.build())
}

public inline
    fun EmrContainersDeleteVirtualCluster.metricTimedOut(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricTimedOut(builder.build())
}

public inline fun EmrContainersStartJobRun.addCatch(arg0: IChainable,
    block: CatchPropsDsl.() -> Unit = {}): TaskStateBase {
  val builder = CatchPropsDsl()
  builder.apply(block)
  return addCatch(arg0,builder.build())
}

public inline fun EmrContainersStartJobRun.addRetry(block: RetryPropsDsl.() -> Unit = {}):
    TaskStateBase {
  val builder = RetryPropsDsl()
  builder.apply(block)
  return addRetry(builder.build())
}

public inline fun EmrContainersStartJobRun.metric(arg0: String, block: MetricOptionsDsl.() -> Unit =
    {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metric(arg0,builder.build())
}

public inline fun EmrContainersStartJobRun.metricFailed(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricFailed(builder.build())
}

public inline
    fun EmrContainersStartJobRun.metricHeartbeatTimedOut(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricHeartbeatTimedOut(builder.build())
}

public inline fun EmrContainersStartJobRun.metricRunTime(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricRunTime(builder.build())
}

public inline fun EmrContainersStartJobRun.metricScheduleTime(block: MetricOptionsDsl.() -> Unit =
    {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricScheduleTime(builder.build())
}

public inline fun EmrContainersStartJobRun.metricScheduled(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricScheduled(builder.build())
}

public inline fun EmrContainersStartJobRun.metricStarted(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricStarted(builder.build())
}

public inline fun EmrContainersStartJobRun.metricSucceeded(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricSucceeded(builder.build())
}

public inline fun EmrContainersStartJobRun.metricTime(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricTime(builder.build())
}

public inline fun EmrContainersStartJobRun.metricTimedOut(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricTimedOut(builder.build())
}

public inline fun EmrCreateCluster.addCatch(arg0: IChainable, block: CatchPropsDsl.() -> Unit = {}):
    TaskStateBase {
  val builder = CatchPropsDsl()
  builder.apply(block)
  return addCatch(arg0,builder.build())
}

public inline fun EmrCreateCluster.addRetry(block: RetryPropsDsl.() -> Unit = {}): TaskStateBase {
  val builder = RetryPropsDsl()
  builder.apply(block)
  return addRetry(builder.build())
}

public inline fun EmrCreateCluster.metric(arg0: String, block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metric(arg0,builder.build())
}

public inline fun EmrCreateCluster.metricFailed(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricFailed(builder.build())
}

public inline fun EmrCreateCluster.metricHeartbeatTimedOut(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricHeartbeatTimedOut(builder.build())
}

public inline fun EmrCreateCluster.metricRunTime(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricRunTime(builder.build())
}

public inline fun EmrCreateCluster.metricScheduleTime(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricScheduleTime(builder.build())
}

public inline fun EmrCreateCluster.metricScheduled(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricScheduled(builder.build())
}

public inline fun EmrCreateCluster.metricStarted(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricStarted(builder.build())
}

public inline fun EmrCreateCluster.metricSucceeded(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricSucceeded(builder.build())
}

public inline fun EmrCreateCluster.metricTime(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricTime(builder.build())
}

public inline fun EmrCreateCluster.metricTimedOut(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricTimedOut(builder.build())
}

public inline fun EmrModifyInstanceFleetByName.addCatch(arg0: IChainable,
    block: CatchPropsDsl.() -> Unit = {}): TaskStateBase {
  val builder = CatchPropsDsl()
  builder.apply(block)
  return addCatch(arg0,builder.build())
}

public inline fun EmrModifyInstanceFleetByName.addRetry(block: RetryPropsDsl.() -> Unit = {}):
    TaskStateBase {
  val builder = RetryPropsDsl()
  builder.apply(block)
  return addRetry(builder.build())
}

public inline fun EmrModifyInstanceFleetByName.metric(arg0: String,
    block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metric(arg0,builder.build())
}

public inline fun EmrModifyInstanceFleetByName.metricFailed(block: MetricOptionsDsl.() -> Unit =
    {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricFailed(builder.build())
}

public inline
    fun EmrModifyInstanceFleetByName.metricHeartbeatTimedOut(block: MetricOptionsDsl.() -> Unit =
    {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricHeartbeatTimedOut(builder.build())
}

public inline fun EmrModifyInstanceFleetByName.metricRunTime(block: MetricOptionsDsl.() -> Unit =
    {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricRunTime(builder.build())
}

public inline fun EmrModifyInstanceFleetByName.metricScheduleTime(block: MetricOptionsDsl.() -> Unit
    = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricScheduleTime(builder.build())
}

public inline fun EmrModifyInstanceFleetByName.metricScheduled(block: MetricOptionsDsl.() -> Unit =
    {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricScheduled(builder.build())
}

public inline fun EmrModifyInstanceFleetByName.metricStarted(block: MetricOptionsDsl.() -> Unit =
    {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricStarted(builder.build())
}

public inline fun EmrModifyInstanceFleetByName.metricSucceeded(block: MetricOptionsDsl.() -> Unit =
    {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricSucceeded(builder.build())
}

public inline fun EmrModifyInstanceFleetByName.metricTime(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricTime(builder.build())
}

public inline fun EmrModifyInstanceFleetByName.metricTimedOut(block: MetricOptionsDsl.() -> Unit =
    {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricTimedOut(builder.build())
}

public inline fun EmrModifyInstanceGroupByName.addCatch(arg0: IChainable,
    block: CatchPropsDsl.() -> Unit = {}): TaskStateBase {
  val builder = CatchPropsDsl()
  builder.apply(block)
  return addCatch(arg0,builder.build())
}

public inline fun EmrModifyInstanceGroupByName.addRetry(block: RetryPropsDsl.() -> Unit = {}):
    TaskStateBase {
  val builder = RetryPropsDsl()
  builder.apply(block)
  return addRetry(builder.build())
}

public inline fun EmrModifyInstanceGroupByName.metric(arg0: String,
    block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metric(arg0,builder.build())
}

public inline fun EmrModifyInstanceGroupByName.metricFailed(block: MetricOptionsDsl.() -> Unit =
    {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricFailed(builder.build())
}

public inline
    fun EmrModifyInstanceGroupByName.metricHeartbeatTimedOut(block: MetricOptionsDsl.() -> Unit =
    {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricHeartbeatTimedOut(builder.build())
}

public inline fun EmrModifyInstanceGroupByName.metricRunTime(block: MetricOptionsDsl.() -> Unit =
    {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricRunTime(builder.build())
}

public inline fun EmrModifyInstanceGroupByName.metricScheduleTime(block: MetricOptionsDsl.() -> Unit
    = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricScheduleTime(builder.build())
}

public inline fun EmrModifyInstanceGroupByName.metricScheduled(block: MetricOptionsDsl.() -> Unit =
    {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricScheduled(builder.build())
}

public inline fun EmrModifyInstanceGroupByName.metricStarted(block: MetricOptionsDsl.() -> Unit =
    {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricStarted(builder.build())
}

public inline fun EmrModifyInstanceGroupByName.metricSucceeded(block: MetricOptionsDsl.() -> Unit =
    {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricSucceeded(builder.build())
}

public inline fun EmrModifyInstanceGroupByName.metricTime(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricTime(builder.build())
}

public inline fun EmrModifyInstanceGroupByName.metricTimedOut(block: MetricOptionsDsl.() -> Unit =
    {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricTimedOut(builder.build())
}

public inline fun EmrSetClusterTerminationProtection.addCatch(arg0: IChainable,
    block: CatchPropsDsl.() -> Unit = {}): TaskStateBase {
  val builder = CatchPropsDsl()
  builder.apply(block)
  return addCatch(arg0,builder.build())
}

public inline fun EmrSetClusterTerminationProtection.addRetry(block: RetryPropsDsl.() -> Unit = {}):
    TaskStateBase {
  val builder = RetryPropsDsl()
  builder.apply(block)
  return addRetry(builder.build())
}

public inline fun EmrSetClusterTerminationProtection.metric(arg0: String,
    block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metric(arg0,builder.build())
}

public inline fun EmrSetClusterTerminationProtection.metricFailed(block: MetricOptionsDsl.() -> Unit
    = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricFailed(builder.build())
}

public inline
    fun EmrSetClusterTerminationProtection.metricHeartbeatTimedOut(block: MetricOptionsDsl.() -> Unit
    = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricHeartbeatTimedOut(builder.build())
}

public inline
    fun EmrSetClusterTerminationProtection.metricRunTime(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricRunTime(builder.build())
}

public inline
    fun EmrSetClusterTerminationProtection.metricScheduleTime(block: MetricOptionsDsl.() -> Unit =
    {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricScheduleTime(builder.build())
}

public inline
    fun EmrSetClusterTerminationProtection.metricScheduled(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricScheduled(builder.build())
}

public inline
    fun EmrSetClusterTerminationProtection.metricStarted(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricStarted(builder.build())
}

public inline
    fun EmrSetClusterTerminationProtection.metricSucceeded(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricSucceeded(builder.build())
}

public inline fun EmrSetClusterTerminationProtection.metricTime(block: MetricOptionsDsl.() -> Unit =
    {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricTime(builder.build())
}

public inline
    fun EmrSetClusterTerminationProtection.metricTimedOut(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricTimedOut(builder.build())
}

public inline fun EmrTerminateCluster.addCatch(arg0: IChainable, block: CatchPropsDsl.() -> Unit =
    {}): TaskStateBase {
  val builder = CatchPropsDsl()
  builder.apply(block)
  return addCatch(arg0,builder.build())
}

public inline fun EmrTerminateCluster.addRetry(block: RetryPropsDsl.() -> Unit = {}):
    TaskStateBase {
  val builder = RetryPropsDsl()
  builder.apply(block)
  return addRetry(builder.build())
}

public inline fun EmrTerminateCluster.metric(arg0: String, block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metric(arg0,builder.build())
}

public inline fun EmrTerminateCluster.metricFailed(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricFailed(builder.build())
}

public inline fun EmrTerminateCluster.metricHeartbeatTimedOut(block: MetricOptionsDsl.() -> Unit =
    {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricHeartbeatTimedOut(builder.build())
}

public inline fun EmrTerminateCluster.metricRunTime(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricRunTime(builder.build())
}

public inline fun EmrTerminateCluster.metricScheduleTime(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricScheduleTime(builder.build())
}

public inline fun EmrTerminateCluster.metricScheduled(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricScheduled(builder.build())
}

public inline fun EmrTerminateCluster.metricStarted(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricStarted(builder.build())
}

public inline fun EmrTerminateCluster.metricSucceeded(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricSucceeded(builder.build())
}

public inline fun EmrTerminateCluster.metricTime(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricTime(builder.build())
}

public inline fun EmrTerminateCluster.metricTimedOut(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricTimedOut(builder.build())
}

public inline fun EvaluateExpression.addCatch(arg0: IChainable, block: CatchPropsDsl.() -> Unit =
    {}): TaskStateBase {
  val builder = CatchPropsDsl()
  builder.apply(block)
  return addCatch(arg0,builder.build())
}

public inline fun EvaluateExpression.addRetry(block: RetryPropsDsl.() -> Unit = {}): TaskStateBase {
  val builder = RetryPropsDsl()
  builder.apply(block)
  return addRetry(builder.build())
}

public inline fun EvaluateExpression.metric(arg0: String, block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metric(arg0,builder.build())
}

public inline fun EvaluateExpression.metricFailed(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricFailed(builder.build())
}

public inline fun EvaluateExpression.metricHeartbeatTimedOut(block: MetricOptionsDsl.() -> Unit =
    {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricHeartbeatTimedOut(builder.build())
}

public inline fun EvaluateExpression.metricRunTime(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricRunTime(builder.build())
}

public inline fun EvaluateExpression.metricScheduleTime(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricScheduleTime(builder.build())
}

public inline fun EvaluateExpression.metricScheduled(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricScheduled(builder.build())
}

public inline fun EvaluateExpression.metricStarted(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricStarted(builder.build())
}

public inline fun EvaluateExpression.metricSucceeded(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricSucceeded(builder.build())
}

public inline fun EvaluateExpression.metricTime(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricTime(builder.build())
}

public inline fun EvaluateExpression.metricTimedOut(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricTimedOut(builder.build())
}

public inline fun EventBridgePutEvents.addCatch(arg0: IChainable, block: CatchPropsDsl.() -> Unit =
    {}): TaskStateBase {
  val builder = CatchPropsDsl()
  builder.apply(block)
  return addCatch(arg0,builder.build())
}

public inline fun EventBridgePutEvents.addRetry(block: RetryPropsDsl.() -> Unit = {}):
    TaskStateBase {
  val builder = RetryPropsDsl()
  builder.apply(block)
  return addRetry(builder.build())
}

public inline fun EventBridgePutEvents.metric(arg0: String, block: MetricOptionsDsl.() -> Unit =
    {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metric(arg0,builder.build())
}

public inline fun EventBridgePutEvents.metricFailed(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricFailed(builder.build())
}

public inline fun EventBridgePutEvents.metricHeartbeatTimedOut(block: MetricOptionsDsl.() -> Unit =
    {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricHeartbeatTimedOut(builder.build())
}

public inline fun EventBridgePutEvents.metricRunTime(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricRunTime(builder.build())
}

public inline fun EventBridgePutEvents.metricScheduleTime(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricScheduleTime(builder.build())
}

public inline fun EventBridgePutEvents.metricScheduled(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricScheduled(builder.build())
}

public inline fun EventBridgePutEvents.metricStarted(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricStarted(builder.build())
}

public inline fun EventBridgePutEvents.metricSucceeded(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricSucceeded(builder.build())
}

public inline fun EventBridgePutEvents.metricTime(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricTime(builder.build())
}

public inline fun EventBridgePutEvents.metricTimedOut(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricTimedOut(builder.build())
}

public inline fun GlueDataBrewStartJobRun.addCatch(arg0: IChainable, block: CatchPropsDsl.() -> Unit
    = {}): TaskStateBase {
  val builder = CatchPropsDsl()
  builder.apply(block)
  return addCatch(arg0,builder.build())
}

public inline fun GlueDataBrewStartJobRun.addRetry(block: RetryPropsDsl.() -> Unit = {}):
    TaskStateBase {
  val builder = RetryPropsDsl()
  builder.apply(block)
  return addRetry(builder.build())
}

public inline fun GlueDataBrewStartJobRun.metric(arg0: String, block: MetricOptionsDsl.() -> Unit =
    {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metric(arg0,builder.build())
}

public inline fun GlueDataBrewStartJobRun.metricFailed(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricFailed(builder.build())
}

public inline fun GlueDataBrewStartJobRun.metricHeartbeatTimedOut(block: MetricOptionsDsl.() -> Unit
    = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricHeartbeatTimedOut(builder.build())
}

public inline fun GlueDataBrewStartJobRun.metricRunTime(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricRunTime(builder.build())
}

public inline fun GlueDataBrewStartJobRun.metricScheduleTime(block: MetricOptionsDsl.() -> Unit =
    {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricScheduleTime(builder.build())
}

public inline fun GlueDataBrewStartJobRun.metricScheduled(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricScheduled(builder.build())
}

public inline fun GlueDataBrewStartJobRun.metricStarted(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricStarted(builder.build())
}

public inline fun GlueDataBrewStartJobRun.metricSucceeded(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricSucceeded(builder.build())
}

public inline fun GlueDataBrewStartJobRun.metricTime(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricTime(builder.build())
}

public inline fun GlueDataBrewStartJobRun.metricTimedOut(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricTimedOut(builder.build())
}

public inline fun GlueStartJobRun.addCatch(arg0: IChainable, block: CatchPropsDsl.() -> Unit = {}):
    TaskStateBase {
  val builder = CatchPropsDsl()
  builder.apply(block)
  return addCatch(arg0,builder.build())
}

public inline fun GlueStartJobRun.addRetry(block: RetryPropsDsl.() -> Unit = {}): TaskStateBase {
  val builder = RetryPropsDsl()
  builder.apply(block)
  return addRetry(builder.build())
}

public inline fun GlueStartJobRun.metric(arg0: String, block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metric(arg0,builder.build())
}

public inline fun GlueStartJobRun.metricFailed(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricFailed(builder.build())
}

public inline fun GlueStartJobRun.metricHeartbeatTimedOut(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricHeartbeatTimedOut(builder.build())
}

public inline fun GlueStartJobRun.metricRunTime(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricRunTime(builder.build())
}

public inline fun GlueStartJobRun.metricScheduleTime(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricScheduleTime(builder.build())
}

public inline fun GlueStartJobRun.metricScheduled(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricScheduled(builder.build())
}

public inline fun GlueStartJobRun.metricStarted(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricStarted(builder.build())
}

public inline fun GlueStartJobRun.metricSucceeded(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricSucceeded(builder.build())
}

public inline fun GlueStartJobRun.metricTime(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricTime(builder.build())
}

public inline fun GlueStartJobRun.metricTimedOut(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricTimedOut(builder.build())
}

public inline fun LambdaInvoke.addCatch(arg0: IChainable, block: CatchPropsDsl.() -> Unit = {}):
    TaskStateBase {
  val builder = CatchPropsDsl()
  builder.apply(block)
  return addCatch(arg0,builder.build())
}

public inline fun LambdaInvoke.addRetry(block: RetryPropsDsl.() -> Unit = {}): TaskStateBase {
  val builder = RetryPropsDsl()
  builder.apply(block)
  return addRetry(builder.build())
}

public inline fun LambdaInvoke.metric(arg0: String, block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metric(arg0,builder.build())
}

public inline fun LambdaInvoke.metricFailed(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricFailed(builder.build())
}

public inline fun LambdaInvoke.metricHeartbeatTimedOut(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricHeartbeatTimedOut(builder.build())
}

public inline fun LambdaInvoke.metricRunTime(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricRunTime(builder.build())
}

public inline fun LambdaInvoke.metricScheduleTime(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricScheduleTime(builder.build())
}

public inline fun LambdaInvoke.metricScheduled(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricScheduled(builder.build())
}

public inline fun LambdaInvoke.metricStarted(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricStarted(builder.build())
}

public inline fun LambdaInvoke.metricSucceeded(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricSucceeded(builder.build())
}

public inline fun LambdaInvoke.metricTime(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricTime(builder.build())
}

public inline fun LambdaInvoke.metricTimedOut(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricTimedOut(builder.build())
}

public inline fun SageMakerCreateEndpoint.addCatch(arg0: IChainable, block: CatchPropsDsl.() -> Unit
    = {}): TaskStateBase {
  val builder = CatchPropsDsl()
  builder.apply(block)
  return addCatch(arg0,builder.build())
}

public inline fun SageMakerCreateEndpoint.addRetry(block: RetryPropsDsl.() -> Unit = {}):
    TaskStateBase {
  val builder = RetryPropsDsl()
  builder.apply(block)
  return addRetry(builder.build())
}

public inline fun SageMakerCreateEndpoint.metric(arg0: String, block: MetricOptionsDsl.() -> Unit =
    {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metric(arg0,builder.build())
}

public inline fun SageMakerCreateEndpoint.metricFailed(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricFailed(builder.build())
}

public inline fun SageMakerCreateEndpoint.metricHeartbeatTimedOut(block: MetricOptionsDsl.() -> Unit
    = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricHeartbeatTimedOut(builder.build())
}

public inline fun SageMakerCreateEndpoint.metricRunTime(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricRunTime(builder.build())
}

public inline fun SageMakerCreateEndpoint.metricScheduleTime(block: MetricOptionsDsl.() -> Unit =
    {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricScheduleTime(builder.build())
}

public inline fun SageMakerCreateEndpoint.metricScheduled(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricScheduled(builder.build())
}

public inline fun SageMakerCreateEndpoint.metricStarted(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricStarted(builder.build())
}

public inline fun SageMakerCreateEndpoint.metricSucceeded(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricSucceeded(builder.build())
}

public inline fun SageMakerCreateEndpoint.metricTime(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricTime(builder.build())
}

public inline fun SageMakerCreateEndpoint.metricTimedOut(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricTimedOut(builder.build())
}

public inline fun SageMakerCreateEndpointConfig.addCatch(arg0: IChainable,
    block: CatchPropsDsl.() -> Unit = {}): TaskStateBase {
  val builder = CatchPropsDsl()
  builder.apply(block)
  return addCatch(arg0,builder.build())
}

public inline fun SageMakerCreateEndpointConfig.addRetry(block: RetryPropsDsl.() -> Unit = {}):
    TaskStateBase {
  val builder = RetryPropsDsl()
  builder.apply(block)
  return addRetry(builder.build())
}

public inline fun SageMakerCreateEndpointConfig.metric(arg0: String,
    block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metric(arg0,builder.build())
}

public inline fun SageMakerCreateEndpointConfig.metricFailed(block: MetricOptionsDsl.() -> Unit =
    {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricFailed(builder.build())
}

public inline
    fun SageMakerCreateEndpointConfig.metricHeartbeatTimedOut(block: MetricOptionsDsl.() -> Unit =
    {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricHeartbeatTimedOut(builder.build())
}

public inline fun SageMakerCreateEndpointConfig.metricRunTime(block: MetricOptionsDsl.() -> Unit =
    {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricRunTime(builder.build())
}

public inline
    fun SageMakerCreateEndpointConfig.metricScheduleTime(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricScheduleTime(builder.build())
}

public inline fun SageMakerCreateEndpointConfig.metricScheduled(block: MetricOptionsDsl.() -> Unit =
    {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricScheduled(builder.build())
}

public inline fun SageMakerCreateEndpointConfig.metricStarted(block: MetricOptionsDsl.() -> Unit =
    {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricStarted(builder.build())
}

public inline fun SageMakerCreateEndpointConfig.metricSucceeded(block: MetricOptionsDsl.() -> Unit =
    {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricSucceeded(builder.build())
}

public inline fun SageMakerCreateEndpointConfig.metricTime(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricTime(builder.build())
}

public inline fun SageMakerCreateEndpointConfig.metricTimedOut(block: MetricOptionsDsl.() -> Unit =
    {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricTimedOut(builder.build())
}

public inline fun SageMakerCreateModel.addCatch(arg0: IChainable, block: CatchPropsDsl.() -> Unit =
    {}): TaskStateBase {
  val builder = CatchPropsDsl()
  builder.apply(block)
  return addCatch(arg0,builder.build())
}

public inline fun SageMakerCreateModel.addRetry(block: RetryPropsDsl.() -> Unit = {}):
    TaskStateBase {
  val builder = RetryPropsDsl()
  builder.apply(block)
  return addRetry(builder.build())
}

public inline fun SageMakerCreateModel.metric(arg0: String, block: MetricOptionsDsl.() -> Unit =
    {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metric(arg0,builder.build())
}

public inline fun SageMakerCreateModel.metricFailed(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricFailed(builder.build())
}

public inline fun SageMakerCreateModel.metricHeartbeatTimedOut(block: MetricOptionsDsl.() -> Unit =
    {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricHeartbeatTimedOut(builder.build())
}

public inline fun SageMakerCreateModel.metricRunTime(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricRunTime(builder.build())
}

public inline fun SageMakerCreateModel.metricScheduleTime(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricScheduleTime(builder.build())
}

public inline fun SageMakerCreateModel.metricScheduled(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricScheduled(builder.build())
}

public inline fun SageMakerCreateModel.metricStarted(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricStarted(builder.build())
}

public inline fun SageMakerCreateModel.metricSucceeded(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricSucceeded(builder.build())
}

public inline fun SageMakerCreateModel.metricTime(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricTime(builder.build())
}

public inline fun SageMakerCreateModel.metricTimedOut(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricTimedOut(builder.build())
}

public inline fun SageMakerCreateTrainingJob.addCatch(arg0: IChainable,
    block: CatchPropsDsl.() -> Unit = {}): TaskStateBase {
  val builder = CatchPropsDsl()
  builder.apply(block)
  return addCatch(arg0,builder.build())
}

public inline fun SageMakerCreateTrainingJob.addRetry(block: RetryPropsDsl.() -> Unit = {}):
    TaskStateBase {
  val builder = RetryPropsDsl()
  builder.apply(block)
  return addRetry(builder.build())
}

public inline fun SageMakerCreateTrainingJob.metric(arg0: String, block: MetricOptionsDsl.() -> Unit
    = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metric(arg0,builder.build())
}

public inline fun SageMakerCreateTrainingJob.metricFailed(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricFailed(builder.build())
}

public inline
    fun SageMakerCreateTrainingJob.metricHeartbeatTimedOut(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricHeartbeatTimedOut(builder.build())
}

public inline fun SageMakerCreateTrainingJob.metricRunTime(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricRunTime(builder.build())
}

public inline fun SageMakerCreateTrainingJob.metricScheduleTime(block: MetricOptionsDsl.() -> Unit =
    {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricScheduleTime(builder.build())
}

public inline fun SageMakerCreateTrainingJob.metricScheduled(block: MetricOptionsDsl.() -> Unit =
    {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricScheduled(builder.build())
}

public inline fun SageMakerCreateTrainingJob.metricStarted(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricStarted(builder.build())
}

public inline fun SageMakerCreateTrainingJob.metricSucceeded(block: MetricOptionsDsl.() -> Unit =
    {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricSucceeded(builder.build())
}

public inline fun SageMakerCreateTrainingJob.metricTime(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricTime(builder.build())
}

public inline fun SageMakerCreateTrainingJob.metricTimedOut(block: MetricOptionsDsl.() -> Unit =
    {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricTimedOut(builder.build())
}

public inline fun SageMakerCreateTransformJob.addCatch(arg0: IChainable,
    block: CatchPropsDsl.() -> Unit = {}): TaskStateBase {
  val builder = CatchPropsDsl()
  builder.apply(block)
  return addCatch(arg0,builder.build())
}

public inline fun SageMakerCreateTransformJob.addRetry(block: RetryPropsDsl.() -> Unit = {}):
    TaskStateBase {
  val builder = RetryPropsDsl()
  builder.apply(block)
  return addRetry(builder.build())
}

public inline fun SageMakerCreateTransformJob.metric(arg0: String,
    block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metric(arg0,builder.build())
}

public inline fun SageMakerCreateTransformJob.metricFailed(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricFailed(builder.build())
}

public inline
    fun SageMakerCreateTransformJob.metricHeartbeatTimedOut(block: MetricOptionsDsl.() -> Unit =
    {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricHeartbeatTimedOut(builder.build())
}

public inline fun SageMakerCreateTransformJob.metricRunTime(block: MetricOptionsDsl.() -> Unit =
    {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricRunTime(builder.build())
}

public inline fun SageMakerCreateTransformJob.metricScheduleTime(block: MetricOptionsDsl.() -> Unit
    = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricScheduleTime(builder.build())
}

public inline fun SageMakerCreateTransformJob.metricScheduled(block: MetricOptionsDsl.() -> Unit =
    {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricScheduled(builder.build())
}

public inline fun SageMakerCreateTransformJob.metricStarted(block: MetricOptionsDsl.() -> Unit =
    {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricStarted(builder.build())
}

public inline fun SageMakerCreateTransformJob.metricSucceeded(block: MetricOptionsDsl.() -> Unit =
    {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricSucceeded(builder.build())
}

public inline fun SageMakerCreateTransformJob.metricTime(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricTime(builder.build())
}

public inline fun SageMakerCreateTransformJob.metricTimedOut(block: MetricOptionsDsl.() -> Unit =
    {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricTimedOut(builder.build())
}

public inline fun SageMakerUpdateEndpoint.addCatch(arg0: IChainable, block: CatchPropsDsl.() -> Unit
    = {}): TaskStateBase {
  val builder = CatchPropsDsl()
  builder.apply(block)
  return addCatch(arg0,builder.build())
}

public inline fun SageMakerUpdateEndpoint.addRetry(block: RetryPropsDsl.() -> Unit = {}):
    TaskStateBase {
  val builder = RetryPropsDsl()
  builder.apply(block)
  return addRetry(builder.build())
}

public inline fun SageMakerUpdateEndpoint.metric(arg0: String, block: MetricOptionsDsl.() -> Unit =
    {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metric(arg0,builder.build())
}

public inline fun SageMakerUpdateEndpoint.metricFailed(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricFailed(builder.build())
}

public inline fun SageMakerUpdateEndpoint.metricHeartbeatTimedOut(block: MetricOptionsDsl.() -> Unit
    = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricHeartbeatTimedOut(builder.build())
}

public inline fun SageMakerUpdateEndpoint.metricRunTime(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricRunTime(builder.build())
}

public inline fun SageMakerUpdateEndpoint.metricScheduleTime(block: MetricOptionsDsl.() -> Unit =
    {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricScheduleTime(builder.build())
}

public inline fun SageMakerUpdateEndpoint.metricScheduled(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricScheduled(builder.build())
}

public inline fun SageMakerUpdateEndpoint.metricStarted(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricStarted(builder.build())
}

public inline fun SageMakerUpdateEndpoint.metricSucceeded(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricSucceeded(builder.build())
}

public inline fun SageMakerUpdateEndpoint.metricTime(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricTime(builder.build())
}

public inline fun SageMakerUpdateEndpoint.metricTimedOut(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricTimedOut(builder.build())
}

public inline fun SnsPublish.addCatch(arg0: IChainable, block: CatchPropsDsl.() -> Unit = {}):
    TaskStateBase {
  val builder = CatchPropsDsl()
  builder.apply(block)
  return addCatch(arg0,builder.build())
}

public inline fun SnsPublish.addRetry(block: RetryPropsDsl.() -> Unit = {}): TaskStateBase {
  val builder = RetryPropsDsl()
  builder.apply(block)
  return addRetry(builder.build())
}

public inline fun SnsPublish.metric(arg0: String, block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metric(arg0,builder.build())
}

public inline fun SnsPublish.metricFailed(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricFailed(builder.build())
}

public inline fun SnsPublish.metricHeartbeatTimedOut(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricHeartbeatTimedOut(builder.build())
}

public inline fun SnsPublish.metricRunTime(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricRunTime(builder.build())
}

public inline fun SnsPublish.metricScheduleTime(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricScheduleTime(builder.build())
}

public inline fun SnsPublish.metricScheduled(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricScheduled(builder.build())
}

public inline fun SnsPublish.metricStarted(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricStarted(builder.build())
}

public inline fun SnsPublish.metricSucceeded(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricSucceeded(builder.build())
}

public inline fun SnsPublish.metricTime(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricTime(builder.build())
}

public inline fun SnsPublish.metricTimedOut(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricTimedOut(builder.build())
}

public inline fun SqsSendMessage.addCatch(arg0: IChainable, block: CatchPropsDsl.() -> Unit = {}):
    TaskStateBase {
  val builder = CatchPropsDsl()
  builder.apply(block)
  return addCatch(arg0,builder.build())
}

public inline fun SqsSendMessage.addRetry(block: RetryPropsDsl.() -> Unit = {}): TaskStateBase {
  val builder = RetryPropsDsl()
  builder.apply(block)
  return addRetry(builder.build())
}

public inline fun SqsSendMessage.metric(arg0: String, block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metric(arg0,builder.build())
}

public inline fun SqsSendMessage.metricFailed(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricFailed(builder.build())
}

public inline fun SqsSendMessage.metricHeartbeatTimedOut(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricHeartbeatTimedOut(builder.build())
}

public inline fun SqsSendMessage.metricRunTime(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricRunTime(builder.build())
}

public inline fun SqsSendMessage.metricScheduleTime(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricScheduleTime(builder.build())
}

public inline fun SqsSendMessage.metricScheduled(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricScheduled(builder.build())
}

public inline fun SqsSendMessage.metricStarted(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricStarted(builder.build())
}

public inline fun SqsSendMessage.metricSucceeded(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricSucceeded(builder.build())
}

public inline fun SqsSendMessage.metricTime(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricTime(builder.build())
}

public inline fun SqsSendMessage.metricTimedOut(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricTimedOut(builder.build())
}

public inline fun StepFunctionsInvokeActivity.addCatch(arg0: IChainable,
    block: CatchPropsDsl.() -> Unit = {}): TaskStateBase {
  val builder = CatchPropsDsl()
  builder.apply(block)
  return addCatch(arg0,builder.build())
}

public inline fun StepFunctionsInvokeActivity.addRetry(block: RetryPropsDsl.() -> Unit = {}):
    TaskStateBase {
  val builder = RetryPropsDsl()
  builder.apply(block)
  return addRetry(builder.build())
}

public inline fun StepFunctionsInvokeActivity.metric(arg0: String,
    block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metric(arg0,builder.build())
}

public inline fun StepFunctionsInvokeActivity.metricFailed(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricFailed(builder.build())
}

public inline
    fun StepFunctionsInvokeActivity.metricHeartbeatTimedOut(block: MetricOptionsDsl.() -> Unit =
    {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricHeartbeatTimedOut(builder.build())
}

public inline fun StepFunctionsInvokeActivity.metricRunTime(block: MetricOptionsDsl.() -> Unit =
    {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricRunTime(builder.build())
}

public inline fun StepFunctionsInvokeActivity.metricScheduleTime(block: MetricOptionsDsl.() -> Unit
    = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricScheduleTime(builder.build())
}

public inline fun StepFunctionsInvokeActivity.metricScheduled(block: MetricOptionsDsl.() -> Unit =
    {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricScheduled(builder.build())
}

public inline fun StepFunctionsInvokeActivity.metricStarted(block: MetricOptionsDsl.() -> Unit =
    {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricStarted(builder.build())
}

public inline fun StepFunctionsInvokeActivity.metricSucceeded(block: MetricOptionsDsl.() -> Unit =
    {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricSucceeded(builder.build())
}

public inline fun StepFunctionsInvokeActivity.metricTime(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricTime(builder.build())
}

public inline fun StepFunctionsInvokeActivity.metricTimedOut(block: MetricOptionsDsl.() -> Unit =
    {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricTimedOut(builder.build())
}

public inline fun StepFunctionsStartExecution.addCatch(arg0: IChainable,
    block: CatchPropsDsl.() -> Unit = {}): TaskStateBase {
  val builder = CatchPropsDsl()
  builder.apply(block)
  return addCatch(arg0,builder.build())
}

public inline fun StepFunctionsStartExecution.addRetry(block: RetryPropsDsl.() -> Unit = {}):
    TaskStateBase {
  val builder = RetryPropsDsl()
  builder.apply(block)
  return addRetry(builder.build())
}

public inline fun StepFunctionsStartExecution.metric(arg0: String,
    block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metric(arg0,builder.build())
}

public inline fun StepFunctionsStartExecution.metricFailed(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricFailed(builder.build())
}

public inline
    fun StepFunctionsStartExecution.metricHeartbeatTimedOut(block: MetricOptionsDsl.() -> Unit =
    {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricHeartbeatTimedOut(builder.build())
}

public inline fun StepFunctionsStartExecution.metricRunTime(block: MetricOptionsDsl.() -> Unit =
    {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricRunTime(builder.build())
}

public inline fun StepFunctionsStartExecution.metricScheduleTime(block: MetricOptionsDsl.() -> Unit
    = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricScheduleTime(builder.build())
}

public inline fun StepFunctionsStartExecution.metricScheduled(block: MetricOptionsDsl.() -> Unit =
    {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricScheduled(builder.build())
}

public inline fun StepFunctionsStartExecution.metricStarted(block: MetricOptionsDsl.() -> Unit =
    {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricStarted(builder.build())
}

public inline fun StepFunctionsStartExecution.metricSucceeded(block: MetricOptionsDsl.() -> Unit =
    {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricSucceeded(builder.build())
}

public inline fun StepFunctionsStartExecution.metricTime(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricTime(builder.build())
}

public inline fun StepFunctionsStartExecution.metricTimedOut(block: MetricOptionsDsl.() -> Unit =
    {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricTimedOut(builder.build())
}
