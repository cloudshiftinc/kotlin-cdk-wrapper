@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.events.targets

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.apigateway.RestApi
import software.amazon.awscdk.services.codebuild.IProject
import software.amazon.awscdk.services.codepipeline.IPipeline
import software.amazon.awscdk.services.events.IApiDestination
import software.amazon.awscdk.services.events.IEventBus
import software.amazon.awscdk.services.events.targets.ApiDestination
import software.amazon.awscdk.services.events.targets.ApiDestinationProps
import software.amazon.awscdk.services.events.targets.ApiGateway
import software.amazon.awscdk.services.events.targets.ApiGatewayProps
import software.amazon.awscdk.services.events.targets.AwsApi
import software.amazon.awscdk.services.events.targets.AwsApiInput
import software.amazon.awscdk.services.events.targets.AwsApiProps
import software.amazon.awscdk.services.events.targets.BatchJob
import software.amazon.awscdk.services.events.targets.BatchJobProps
import software.amazon.awscdk.services.events.targets.CloudWatchLogGroup
import software.amazon.awscdk.services.events.targets.CodeBuildProject
import software.amazon.awscdk.services.events.targets.CodeBuildProjectProps
import software.amazon.awscdk.services.events.targets.CodePipeline
import software.amazon.awscdk.services.events.targets.CodePipelineTargetOptions
import software.amazon.awscdk.services.events.targets.ContainerOverride
import software.amazon.awscdk.services.events.targets.EcsTask
import software.amazon.awscdk.services.events.targets.EcsTaskProps
import software.amazon.awscdk.services.events.targets.EventBus
import software.amazon.awscdk.services.events.targets.EventBusProps
import software.amazon.awscdk.services.events.targets.KinesisFirehoseStream
import software.amazon.awscdk.services.events.targets.KinesisFirehoseStreamProps
import software.amazon.awscdk.services.events.targets.KinesisStream
import software.amazon.awscdk.services.events.targets.KinesisStreamProps
import software.amazon.awscdk.services.events.targets.LambdaFunction
import software.amazon.awscdk.services.events.targets.LambdaFunctionProps
import software.amazon.awscdk.services.events.targets.LogGroupProps
import software.amazon.awscdk.services.events.targets.LogGroupTargetInputOptions
import software.amazon.awscdk.services.events.targets.SfnStateMachine
import software.amazon.awscdk.services.events.targets.SfnStateMachineProps
import software.amazon.awscdk.services.events.targets.SnsTopic
import software.amazon.awscdk.services.events.targets.SnsTopicProps
import software.amazon.awscdk.services.events.targets.SqsQueue
import software.amazon.awscdk.services.events.targets.SqsQueueProps
import software.amazon.awscdk.services.events.targets.Tag
import software.amazon.awscdk.services.events.targets.TargetBaseProps
import software.amazon.awscdk.services.events.targets.TaskEnvironmentVariable
import software.amazon.awscdk.services.kinesis.IStream
import software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream
import software.amazon.awscdk.services.lambda.IFunction
import software.amazon.awscdk.services.logs.ILogGroup
import software.amazon.awscdk.services.sns.ITopic
import software.amazon.awscdk.services.sqs.IQueue
import software.amazon.awscdk.services.stepfunctions.IStateMachine
import software.constructs.IConstruct

public object targets {
  public inline fun apiDestination(arg0: IApiDestination, block: ApiDestinationDsl.() -> Unit = {}):
      ApiDestination {
    val builder = ApiDestinationDsl(arg0)
    builder.apply(block)
    return builder.build()
  }

  public inline fun apiDestinationProps(block: ApiDestinationPropsDsl.() -> Unit = {}):
      ApiDestinationProps {
    val builder = ApiDestinationPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun apiGateway(arg0: RestApi, block: ApiGatewayDsl.() -> Unit = {}): ApiGateway {
    val builder = ApiGatewayDsl(arg0)
    builder.apply(block)
    return builder.build()
  }

  public inline fun apiGatewayProps(block: ApiGatewayPropsDsl.() -> Unit = {}): ApiGatewayProps {
    val builder = ApiGatewayPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun awsApi(block: AwsApiDsl.() -> Unit = {}): AwsApi {
    val builder = AwsApiDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun awsApiInput(block: AwsApiInputDsl.() -> Unit = {}): AwsApiInput {
    val builder = AwsApiInputDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun awsApiProps(block: AwsApiPropsDsl.() -> Unit = {}): AwsApiProps {
    val builder = AwsApiPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun batchJob(
    arg0: String,
    arg1: IConstruct,
    arg2: String,
    arg3: IConstruct,
    block: BatchJobDsl.() -> Unit = {},
  ): BatchJob {
    val builder = BatchJobDsl(arg0, arg1, arg2, arg3)
    builder.apply(block)
    return builder.build()
  }

  public inline fun batchJobProps(block: BatchJobPropsDsl.() -> Unit = {}): BatchJobProps {
    val builder = BatchJobPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cloudWatchLogGroup(arg0: ILogGroup, block: CloudWatchLogGroupDsl.() -> Unit =
      {}): CloudWatchLogGroup {
    val builder = CloudWatchLogGroupDsl(arg0)
    builder.apply(block)
    return builder.build()
  }

  public inline fun codeBuildProject(arg0: IProject, block: CodeBuildProjectDsl.() -> Unit = {}):
      CodeBuildProject {
    val builder = CodeBuildProjectDsl(arg0)
    builder.apply(block)
    return builder.build()
  }

  public inline fun codeBuildProjectProps(block: CodeBuildProjectPropsDsl.() -> Unit = {}):
      CodeBuildProjectProps {
    val builder = CodeBuildProjectPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun codePipeline(arg0: IPipeline, block: CodePipelineDsl.() -> Unit = {}):
      CodePipeline {
    val builder = CodePipelineDsl(arg0)
    builder.apply(block)
    return builder.build()
  }

  public inline fun codePipelineTargetOptions(block: CodePipelineTargetOptionsDsl.() -> Unit = {}):
      CodePipelineTargetOptions {
    val builder = CodePipelineTargetOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun containerOverride(block: ContainerOverrideDsl.() -> Unit = {}):
      ContainerOverride {
    val builder = ContainerOverrideDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun ecsTask(block: EcsTaskDsl.() -> Unit = {}): EcsTask {
    val builder = EcsTaskDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun ecsTaskProps(block: EcsTaskPropsDsl.() -> Unit = {}): EcsTaskProps {
    val builder = EcsTaskPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun eventBus(arg0: IEventBus, block: EventBusDsl.() -> Unit = {}): EventBus {
    val builder = EventBusDsl(arg0)
    builder.apply(block)
    return builder.build()
  }

  public inline fun eventBusProps(block: EventBusPropsDsl.() -> Unit = {}): EventBusProps {
    val builder = EventBusPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun kinesisFirehoseStream(arg0: CfnDeliveryStream,
      block: KinesisFirehoseStreamDsl.() -> Unit = {}): KinesisFirehoseStream {
    val builder = KinesisFirehoseStreamDsl(arg0)
    builder.apply(block)
    return builder.build()
  }

  public inline fun kinesisFirehoseStreamProps(block: KinesisFirehoseStreamPropsDsl.() -> Unit =
      {}): KinesisFirehoseStreamProps {
    val builder = KinesisFirehoseStreamPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun kinesisStream(arg0: IStream, block: KinesisStreamDsl.() -> Unit = {}):
      KinesisStream {
    val builder = KinesisStreamDsl(arg0)
    builder.apply(block)
    return builder.build()
  }

  public inline fun kinesisStreamProps(block: KinesisStreamPropsDsl.() -> Unit = {}):
      KinesisStreamProps {
    val builder = KinesisStreamPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun lambdaFunction(arg0: IFunction, block: LambdaFunctionDsl.() -> Unit = {}):
      LambdaFunction {
    val builder = LambdaFunctionDsl(arg0)
    builder.apply(block)
    return builder.build()
  }

  public inline fun lambdaFunctionProps(block: LambdaFunctionPropsDsl.() -> Unit = {}):
      LambdaFunctionProps {
    val builder = LambdaFunctionPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun logGroupProps(block: LogGroupPropsDsl.() -> Unit = {}): LogGroupProps {
    val builder = LogGroupPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun logGroupTargetInputOptions(block: LogGroupTargetInputOptionsDsl.() -> Unit =
      {}): LogGroupTargetInputOptions {
    val builder = LogGroupTargetInputOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun sfnStateMachine(arg0: IStateMachine, block: SfnStateMachineDsl.() -> Unit = {}):
      SfnStateMachine {
    val builder = SfnStateMachineDsl(arg0)
    builder.apply(block)
    return builder.build()
  }

  public inline fun sfnStateMachineProps(block: SfnStateMachinePropsDsl.() -> Unit = {}):
      SfnStateMachineProps {
    val builder = SfnStateMachinePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun snsTopic(arg0: ITopic, block: SnsTopicDsl.() -> Unit = {}): SnsTopic {
    val builder = SnsTopicDsl(arg0)
    builder.apply(block)
    return builder.build()
  }

  public inline fun snsTopicProps(block: SnsTopicPropsDsl.() -> Unit = {}): SnsTopicProps {
    val builder = SnsTopicPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun sqsQueue(arg0: IQueue, block: SqsQueueDsl.() -> Unit = {}): SqsQueue {
    val builder = SqsQueueDsl(arg0)
    builder.apply(block)
    return builder.build()
  }

  public inline fun sqsQueueProps(block: SqsQueuePropsDsl.() -> Unit = {}): SqsQueueProps {
    val builder = SqsQueuePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun tag(block: TagDsl.() -> Unit = {}): Tag {
    val builder = TagDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun targetBaseProps(block: TargetBasePropsDsl.() -> Unit = {}): TargetBaseProps {
    val builder = TargetBasePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun taskEnvironmentVariable(block: TaskEnvironmentVariableDsl.() -> Unit = {}):
      TaskEnvironmentVariable {
    val builder = TaskEnvironmentVariableDsl()
    builder.apply(block)
    return builder.build()
  }
}
