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
  /**
   * Use an API Destination rule target.
   *
   * Example:
   *
   * ```
   * Connection connection = Connection.Builder.create(this, "Connection")
   * .authorization(Authorization.apiKey("x-api-key", SecretValue.secretsManager("ApiSecretName")))
   * .description("Connection with API Key x-api-key")
   * .build();
   * ApiDestination destination = ApiDestination.Builder.create(this, "Destination")
   * .connection(connection)
   * .endpoint("https://example.com")
   * .description("Calling example.com with API key x-api-key")
   * .build();
   * Rule rule = Rule.Builder.create(this, "Rule")
   * .schedule(Schedule.rate(Duration.minutes(1)))
   * .targets(List.of(new ApiDestination(destination)))
   * .build();
   * ```
   */
  public inline fun apiDestination(apiDestination: IApiDestination,
      block: ApiDestinationDsl.() -> Unit = {}): ApiDestination {
    val builder = ApiDestinationDsl(apiDestination)
    builder.apply(block)
    return builder.build()
  }

  /**
   * Customize the EventBridge Api Destinations Target.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.*;
   * import software.amazon.awscdk.services.events.*;
   * import software.amazon.awscdk.services.events.targets.*;
   * import software.amazon.awscdk.services.iam.*;
   * import software.amazon.awscdk.services.sqs.*;
   * Queue queue;
   * Role role;
   * RuleTargetInput ruleTargetInput;
   * ApiDestinationProps apiDestinationProps = ApiDestinationProps.builder()
   * .deadLetterQueue(queue)
   * .event(ruleTargetInput)
   * .eventRole(role)
   * .headerParameters(Map.of(
   * "headerParametersKey", "headerParameters"))
   * .maxEventAge(Duration.minutes(30))
   * .pathParameterValues(List.of("pathParameterValues"))
   * .queryStringParameters(Map.of(
   * "queryStringParametersKey", "queryStringParameters"))
   * .retryAttempts(123)
   * .build();
   * ```
   */
  public inline fun apiDestinationProps(block: ApiDestinationPropsDsl.() -> Unit = {}):
      ApiDestinationProps {
    val builder = ApiDestinationPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Use an API Gateway REST APIs as a target for Amazon EventBridge rules.
   *
   * Example:
   *
   * ```
   * import software.amazon.awscdk.services.apigateway.*;
   * import software.amazon.awscdk.services.lambda.*;
   * Rule rule = Rule.Builder.create(this, "Rule")
   * .schedule(Schedule.rate(Duration.minutes(1)))
   * .build();
   * Function fn = Function.Builder.create(this, "MyFunc")
   * .handler("index.handler")
   * .runtime(Runtime.NODEJS_14_X)
   * .code(Code.fromInline("exports.handler = e =&gt; {}"))
   * .build();
   * LambdaRestApi restApi = LambdaRestApi.Builder.create(this, "MyRestAPI").handler(fn).build();
   * Queue dlq = new Queue(this, "DeadLetterQueue");
   * rule.addTarget(
   * ApiGateway.Builder.create(restApi)
   * .path("/ *&#47;test")
   * .method("GET")
   * .stage("prod")
   * .pathParameterValues(List.of("path-value"))
   * .headerParameters(Map.of(
   * "Header1", "header1"))
   * .queryStringParameters(Map.of(
   * "QueryParam1", "query-param-1"))
   * .deadLetterQueue(dlq)
   * .build());
   * ```
   */
  public inline fun apiGateway(restApi: RestApi, block: ApiGatewayDsl.() -> Unit = {}): ApiGateway {
    val builder = ApiGatewayDsl(restApi)
    builder.apply(block)
    return builder.build()
  }

  /**
   * Customize the API Gateway Event Target.
   *
   * Example:
   *
   * ```
   * import software.amazon.awscdk.services.apigateway.*;
   * import software.amazon.awscdk.services.lambda.*;
   * Rule rule = Rule.Builder.create(this, "Rule")
   * .schedule(Schedule.rate(Duration.minutes(1)))
   * .build();
   * Function fn = Function.Builder.create(this, "MyFunc")
   * .handler("index.handler")
   * .runtime(Runtime.NODEJS_14_X)
   * .code(Code.fromInline("exports.handler = e =&gt; {}"))
   * .build();
   * LambdaRestApi restApi = LambdaRestApi.Builder.create(this, "MyRestAPI").handler(fn).build();
   * Queue dlq = new Queue(this, "DeadLetterQueue");
   * rule.addTarget(
   * ApiGateway.Builder.create(restApi)
   * .path("/ *&#47;test")
   * .method("GET")
   * .stage("prod")
   * .pathParameterValues(List.of("path-value"))
   * .headerParameters(Map.of(
   * "Header1", "header1"))
   * .queryStringParameters(Map.of(
   * "QueryParam1", "query-param-1"))
   * .deadLetterQueue(dlq)
   * .build());
   * ```
   */
  public inline fun apiGatewayProps(block: ApiGatewayPropsDsl.() -> Unit = {}): ApiGatewayProps {
    val builder = ApiGatewayPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Use an AWS Lambda function that makes API calls as an event rule target.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.events.targets.*;
   * import software.amazon.awscdk.services.iam.*;
   * Object parameters;
   * PolicyStatement policyStatement;
   * AwsApi awsApi = AwsApi.Builder.create()
   * .action("action")
   * .service("service")
   * // the properties below are optional
   * .apiVersion("apiVersion")
   * .catchErrorPattern("catchErrorPattern")
   * .parameters(parameters)
   * .policyStatement(policyStatement)
   * .build();
   * ```
   */
  public inline fun awsApi(block: AwsApiDsl.() -> Unit = {}): AwsApi {
    val builder = AwsApiDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Rule target input for an AwsApi target.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.events.targets.*;
   * Object parameters;
   * AwsApiInput awsApiInput = AwsApiInput.builder()
   * .action("action")
   * .service("service")
   * // the properties below are optional
   * .apiVersion("apiVersion")
   * .catchErrorPattern("catchErrorPattern")
   * .parameters(parameters)
   * .build();
   * ```
   */
  public inline fun awsApiInput(block: AwsApiInputDsl.() -> Unit = {}): AwsApiInput {
    val builder = AwsApiInputDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Properties for an AwsApi target.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.events.targets.*;
   * import software.amazon.awscdk.services.iam.*;
   * Object parameters;
   * PolicyStatement policyStatement;
   * AwsApiProps awsApiProps = AwsApiProps.builder()
   * .action("action")
   * .service("service")
   * // the properties below are optional
   * .apiVersion("apiVersion")
   * .catchErrorPattern("catchErrorPattern")
   * .parameters(parameters)
   * .policyStatement(policyStatement)
   * .build();
   * ```
   */
  public inline fun awsApiProps(block: AwsApiPropsDsl.() -> Unit = {}): AwsApiProps {
    val builder = AwsApiPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Use an AWS Batch Job / Queue as an event rule target.
   *
   * Most likely the code will look something like this:
   * `new BatchJob(jobQueue.jobQueueArn, jobQueue, jobDefinition.jobDefinitionArn, jobDefinition)`
   *
   * In the future this API will be improved to be fully typed
   *
   * Example:
   *
   * ```
   * import software.amazon.awscdk.services.ec2.*;
   * import software.amazon.awscdk.services.ecs.*;
   * import software.amazon.awscdk.services.batch.alpha.*;
   * import software.amazon.awscdk.services.ecs.ContainerImage;
   * Vpc vpc;
   * FargateComputeEnvironment computeEnvironment = FargateComputeEnvironment.Builder.create(this,
   * "ComputeEnv")
   * .vpc(vpc)
   * .build();
   * JobQueue jobQueue = JobQueue.Builder.create(this, "JobQueue")
   * .priority(1)
   * .computeEnvironments(List.of(OrderedComputeEnvironment.builder()
   * .computeEnvironment(computeEnvironment)
   * .order(1)
   * .build()))
   * .build();
   * EcsJobDefinition jobDefinition = EcsJobDefinition.Builder.create(this, "MyJob")
   * .container(EcsEc2ContainerDefinition.Builder.create(this, "Container")
   * .image(ContainerImage.fromRegistry("test-repo"))
   * .memory(Size.mebibytes(2048))
   * .cpu(256)
   * .build())
   * .build();
   * Queue queue = new Queue(this, "Queue");
   * Rule rule = Rule.Builder.create(this, "Rule")
   * .schedule(Schedule.rate(Duration.hours(1)))
   * .build();
   * rule.addTarget(BatchJob.Builder.create(jobQueue.getJobQueueArn(), jobQueue,
   * jobDefinition.getJobDefinitionArn(), jobDefinition)
   * .deadLetterQueue(queue)
   * .event(RuleTargetInput.fromObject(Map.of("SomeParam", "SomeValue")))
   * .retryAttempts(2)
   * .maxEventAge(Duration.hours(2))
   * .build());
   * ```
   */
  public inline fun batchJob(
    jobQueueArn: String,
    jobQueueScope: IConstruct,
    jobDefinitionArn: String,
    jobDefinitionScope: IConstruct,
    block: BatchJobDsl.() -> Unit = {},
  ): BatchJob {
    val builder = BatchJobDsl(jobQueueArn, jobQueueScope, jobDefinitionArn, jobDefinitionScope)
    builder.apply(block)
    return builder.build()
  }

  /**
   * Customize the Batch Job Event Target.
   *
   * Example:
   *
   * ```
   * import software.amazon.awscdk.services.ec2.*;
   * import software.amazon.awscdk.services.ecs.*;
   * import software.amazon.awscdk.services.batch.alpha.*;
   * import software.amazon.awscdk.services.ecs.ContainerImage;
   * Vpc vpc;
   * FargateComputeEnvironment computeEnvironment = FargateComputeEnvironment.Builder.create(this,
   * "ComputeEnv")
   * .vpc(vpc)
   * .build();
   * JobQueue jobQueue = JobQueue.Builder.create(this, "JobQueue")
   * .priority(1)
   * .computeEnvironments(List.of(OrderedComputeEnvironment.builder()
   * .computeEnvironment(computeEnvironment)
   * .order(1)
   * .build()))
   * .build();
   * EcsJobDefinition jobDefinition = EcsJobDefinition.Builder.create(this, "MyJob")
   * .container(EcsEc2ContainerDefinition.Builder.create(this, "Container")
   * .image(ContainerImage.fromRegistry("test-repo"))
   * .memory(Size.mebibytes(2048))
   * .cpu(256)
   * .build())
   * .build();
   * Queue queue = new Queue(this, "Queue");
   * Rule rule = Rule.Builder.create(this, "Rule")
   * .schedule(Schedule.rate(Duration.hours(1)))
   * .build();
   * rule.addTarget(BatchJob.Builder.create(jobQueue.getJobQueueArn(), jobQueue,
   * jobDefinition.getJobDefinitionArn(), jobDefinition)
   * .deadLetterQueue(queue)
   * .event(RuleTargetInput.fromObject(Map.of("SomeParam", "SomeValue")))
   * .retryAttempts(2)
   * .maxEventAge(Duration.hours(2))
   * .build());
   * ```
   */
  public inline fun batchJobProps(block: BatchJobPropsDsl.() -> Unit = {}): BatchJobProps {
    val builder = BatchJobPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Use an AWS CloudWatch LogGroup as an event rule target.
   *
   * Example:
   *
   * ```
   * import software.amazon.awscdk.services.logs.*;
   * LogGroup logGroup;
   * Rule rule;
   * rule.addTarget(CloudWatchLogGroup.Builder.create(logGroup)
   * .logEvent(LogGroupTargetInput.fromObject(LogGroupTargetInputOptions.builder()
   * .message(JSON.stringify(Map.of(
   * "CustomField", "CustomValue")))
   * .build()))
   * .build());
   * ```
   */
  public inline fun cloudWatchLogGroup(logGroup: ILogGroup, block: CloudWatchLogGroupDsl.() -> Unit
      = {}): CloudWatchLogGroup {
    val builder = CloudWatchLogGroupDsl(logGroup)
    builder.apply(block)
    return builder.build()
  }

  /**
   * Start a CodeBuild build when an Amazon EventBridge rule is triggered.
   *
   * Example:
   *
   * ```
   * import software.amazon.awscdk.services.sns.*;
   * import software.amazon.awscdk.services.events.targets.*;
   * Repository repo;
   * PipelineProject project;
   * Topic myTopic;
   * // starts a CodeBuild project when a commit is pushed to the "main" branch of the repo
   * repo.onCommit("CommitToMain", OnCommitOptions.builder()
   * .target(new CodeBuildProject(project))
   * .branches(List.of("main"))
   * .build());
   * // publishes a message to an Amazon SNS topic when a comment is made on a pull request
   * Rule rule = repo.onCommentOnPullRequest("CommentOnPullRequest", OnEventOptions.builder()
   * .target(new SnsTopic(myTopic))
   * .build());
   * ```
   */
  public inline fun codeBuildProject(project: IProject, block: CodeBuildProjectDsl.() -> Unit = {}):
      CodeBuildProject {
    val builder = CodeBuildProjectDsl(project)
    builder.apply(block)
    return builder.build()
  }

  /**
   * Customize the CodeBuild Event Target.
   *
   * Example:
   *
   * ```
   * import software.amazon.awscdk.services.codebuild.*;
   * import software.amazon.awscdk.services.codecommit.*;
   * Repository repo = Repository.Builder.create(this, "MyRepo")
   * .repositoryName("aws-cdk-codebuild-events")
   * .build();
   * Project project = Project.Builder.create(this, "MyProject")
   * .source(Source.codeCommit(CodeCommitSourceProps.builder().repository(repo).build()))
   * .build();
   * Queue deadLetterQueue = new Queue(this, "DeadLetterQueue");
   * // trigger a build when a commit is pushed to the repo
   * Rule onCommitRule = repo.onCommit("OnCommit", OnCommitOptions.builder()
   * .target(CodeBuildProject.Builder.create(project)
   * .deadLetterQueue(deadLetterQueue)
   * .build())
   * .branches(List.of("master"))
   * .build());
   * ```
   */
  public inline fun codeBuildProjectProps(block: CodeBuildProjectPropsDsl.() -> Unit = {}):
      CodeBuildProjectProps {
    val builder = CodeBuildProjectPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Allows the pipeline to be used as an EventBridge rule target.
   *
   * Example:
   *
   * ```
   * // A pipeline being used as a target for a CloudWatch event rule.
   * import software.amazon.awscdk.services.events.targets.*;
   * import software.amazon.awscdk.services.events.*;
   * Pipeline pipeline;
   * // kick off the pipeline every day
   * Rule rule = Rule.Builder.create(this, "Daily")
   * .schedule(Schedule.rate(Duration.days(1)))
   * .build();
   * rule.addTarget(new CodePipeline(pipeline));
   * ```
   */
  public inline fun codePipeline(pipeline: IPipeline, block: CodePipelineDsl.() -> Unit = {}):
      CodePipeline {
    val builder = CodePipelineDsl(pipeline)
    builder.apply(block)
    return builder.build()
  }

  /**
   * Customization options when creating a `CodePipeline` event target.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.*;
   * import software.amazon.awscdk.services.events.targets.*;
   * import software.amazon.awscdk.services.iam.*;
   * import software.amazon.awscdk.services.sqs.*;
   * Queue queue;
   * Role role;
   * CodePipelineTargetOptions codePipelineTargetOptions = CodePipelineTargetOptions.builder()
   * .deadLetterQueue(queue)
   * .eventRole(role)
   * .maxEventAge(Duration.minutes(30))
   * .retryAttempts(123)
   * .build();
   * ```
   */
  public inline fun codePipelineTargetOptions(block: CodePipelineTargetOptionsDsl.() -> Unit = {}):
      CodePipelineTargetOptions {
    val builder = CodePipelineTargetOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.events.targets.*;
   * ContainerOverride containerOverride = ContainerOverride.builder()
   * .containerName("containerName")
   * // the properties below are optional
   * .command(List.of("command"))
   * .cpu(123)
   * .environment(List.of(TaskEnvironmentVariable.builder()
   * .name("name")
   * .value("value")
   * .build()))
   * .memoryLimit(123)
   * .memoryReservation(123)
   * .build();
   * ```
   */
  public inline fun containerOverride(block: ContainerOverrideDsl.() -> Unit = {}):
      ContainerOverride {
    val builder = ContainerOverrideDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Start a task on an ECS cluster.
   *
   * Example:
   *
   * ```
   * import software.amazon.awscdk.services.ecs.*;
   * ICluster cluster;
   * TaskDefinition taskDefinition;
   * Rule rule = Rule.Builder.create(this, "Rule")
   * .schedule(Schedule.rate(Duration.hours(1)))
   * .build();
   * rule.addTarget(EcsTask.Builder.create()
   * .cluster(cluster)
   * .taskDefinition(taskDefinition)
   * .taskCount(1)
   * .containerOverrides(List.of(ContainerOverride.builder()
   * .containerName("TheContainer")
   * .command(List.of("echo", EventField.fromPath("$.detail.event")))
   * .build()))
   * .enableExecuteCommand(true)
   * .build());
   * ```
   */
  public inline fun ecsTask(block: EcsTaskDsl.() -> Unit = {}): EcsTask {
    val builder = EcsTaskDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Properties to define an ECS Event Task.
   *
   * Example:
   *
   * ```
   * import software.amazon.awscdk.services.ecs.*;
   * ICluster cluster;
   * TaskDefinition taskDefinition;
   * Rule rule = Rule.Builder.create(this, "Rule")
   * .schedule(Schedule.rate(Duration.hours(1)))
   * .build();
   * rule.addTarget(EcsTask.Builder.create()
   * .cluster(cluster)
   * .taskDefinition(taskDefinition)
   * .taskCount(1)
   * .containerOverrides(List.of(ContainerOverride.builder()
   * .containerName("TheContainer")
   * .command(List.of("echo", EventField.fromPath("$.detail.event")))
   * .build()))
   * .enableExecuteCommand(true)
   * .build());
   * ```
   */
  public inline fun ecsTaskProps(block: EcsTaskPropsDsl.() -> Unit = {}): EcsTaskProps {
    val builder = EcsTaskPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Notify an existing Event Bus of an event.
   *
   * Example:
   *
   * ```
   * Rule rule = Rule.Builder.create(this, "Rule")
   * .schedule(Schedule.expression("rate(1 minute)"))
   * .build();
   * rule.addTarget(new EventBus(EventBus.fromEventBusArn(this, "External",
   * "arn:aws:events:eu-west-1:999999999999:event-bus/test-bus")));
   * ```
   */
  public inline fun eventBus(eventBus: IEventBus, block: EventBusDsl.() -> Unit = {}): EventBus {
    val builder = EventBusDsl(eventBus)
    builder.apply(block)
    return builder.build()
  }

  /**
   * Configuration properties of an Event Bus event.
   *
   * Cannot extend TargetBaseProps. Retry policy is not supported for Event bus targets.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.events.targets.*;
   * import software.amazon.awscdk.services.iam.*;
   * import software.amazon.awscdk.services.sqs.*;
   * Queue queue;
   * Role role;
   * EventBusProps eventBusProps = EventBusProps.builder()
   * .deadLetterQueue(queue)
   * .role(role)
   * .build();
   * ```
   */
  public inline fun eventBusProps(block: EventBusPropsDsl.() -> Unit = {}): EventBusProps {
    val builder = EventBusPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Customize the Firehose Stream Event Target.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.events.*;
   * import software.amazon.awscdk.services.events.targets.*;
   * import software.amazon.awscdk.services.kinesisfirehose.*;
   * CfnDeliveryStream cfnDeliveryStream;
   * RuleTargetInput ruleTargetInput;
   * KinesisFirehoseStream kinesisFirehoseStream =
   * KinesisFirehoseStream.Builder.create(cfnDeliveryStream)
   * .message(ruleTargetInput)
   * .build();
   * ```
   */
  public inline fun kinesisFirehoseStream(stream: CfnDeliveryStream,
      block: KinesisFirehoseStreamDsl.() -> Unit = {}): KinesisFirehoseStream {
    val builder = KinesisFirehoseStreamDsl(stream)
    builder.apply(block)
    return builder.build()
  }

  /**
   * Customize the Firehose Stream Event Target.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.events.*;
   * import software.amazon.awscdk.services.events.targets.*;
   * RuleTargetInput ruleTargetInput;
   * KinesisFirehoseStreamProps kinesisFirehoseStreamProps = KinesisFirehoseStreamProps.builder()
   * .message(ruleTargetInput)
   * .build();
   * ```
   */
  public inline fun kinesisFirehoseStreamProps(block: KinesisFirehoseStreamPropsDsl.() -> Unit =
      {}): KinesisFirehoseStreamProps {
    val builder = KinesisFirehoseStreamPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Use a Kinesis Stream as a target for AWS CloudWatch event rules.
   *
   * Example:
   *
   * ```
   * // put to a Kinesis stream every time code is committed
   * // to a CodeCommit repository
   * repository.onCommit("onCommit", OnCommitOptions.builder().target(new
   * KinesisStream(stream)).build());
   * ```
   */
  public inline fun kinesisStream(stream: IStream, block: KinesisStreamDsl.() -> Unit = {}):
      KinesisStream {
    val builder = KinesisStreamDsl(stream)
    builder.apply(block)
    return builder.build()
  }

  /**
   * Customize the Kinesis Stream Event Target.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.events.*;
   * import software.amazon.awscdk.services.events.targets.*;
   * RuleTargetInput ruleTargetInput;
   * KinesisStreamProps kinesisStreamProps = KinesisStreamProps.builder()
   * .message(ruleTargetInput)
   * .partitionKeyPath("partitionKeyPath")
   * .build();
   * ```
   */
  public inline fun kinesisStreamProps(block: KinesisStreamPropsDsl.() -> Unit = {}):
      KinesisStreamProps {
    val builder = KinesisStreamPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Use an AWS Lambda function as an event rule target.
   *
   * Example:
   *
   * ```
   * import software.amazon.awscdk.services.lambda.*;
   * Function fn = Function.Builder.create(this, "MyFunc")
   * .runtime(Runtime.NODEJS_14_X)
   * .handler("index.handler")
   * .code(Code.fromInline("exports.handler = handler.toString()"))
   * .build();
   * Rule rule = Rule.Builder.create(this, "rule")
   * .eventPattern(EventPattern.builder()
   * .source(List.of("aws.ec2"))
   * .build())
   * .build();
   * Queue queue = new Queue(this, "Queue");
   * rule.addTarget(LambdaFunction.Builder.create(fn)
   * .deadLetterQueue(queue) // Optional: add a dead letter queue
   * .maxEventAge(Duration.hours(2)) // Optional: set the maxEventAge retry policy
   * .retryAttempts(2)
   * .build());
   * ```
   */
  public inline fun lambdaFunction(handler: IFunction, block: LambdaFunctionDsl.() -> Unit = {}):
      LambdaFunction {
    val builder = LambdaFunctionDsl(handler)
    builder.apply(block)
    return builder.build()
  }

  /**
   * Customize the Lambda Event Target.
   *
   * Example:
   *
   * ```
   * import software.amazon.awscdk.services.lambda.*;
   * Function fn = Function.Builder.create(this, "MyFunc")
   * .runtime(Runtime.NODEJS_14_X)
   * .handler("index.handler")
   * .code(Code.fromInline("exports.handler = handler.toString()"))
   * .build();
   * Rule rule = Rule.Builder.create(this, "rule")
   * .eventPattern(EventPattern.builder()
   * .source(List.of("aws.ec2"))
   * .build())
   * .build();
   * Queue queue = new Queue(this, "Queue");
   * rule.addTarget(LambdaFunction.Builder.create(fn)
   * .deadLetterQueue(queue) // Optional: add a dead letter queue
   * .maxEventAge(Duration.hours(2)) // Optional: set the maxEventAge retry policy
   * .retryAttempts(2)
   * .build());
   * ```
   */
  public inline fun lambdaFunctionProps(block: LambdaFunctionPropsDsl.() -> Unit = {}):
      LambdaFunctionProps {
    val builder = LambdaFunctionPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Customize the CloudWatch LogGroup Event Target.
   *
   * Example:
   *
   * ```
   * import software.amazon.awscdk.services.logs.*;
   * LogGroup logGroup;
   * Rule rule;
   * rule.addTarget(CloudWatchLogGroup.Builder.create(logGroup)
   * .logEvent(LogGroupTargetInput.fromObject(LogGroupTargetInputOptions.builder()
   * .timestamp(EventField.fromPath("$.time"))
   * .message(EventField.fromPath("$.detail-type"))
   * .build()))
   * .build());
   * ```
   */
  public inline fun logGroupProps(block: LogGroupPropsDsl.() -> Unit = {}): LogGroupProps {
    val builder = LogGroupPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Options used when creating a target input template.
   *
   * Example:
   *
   * ```
   * import software.amazon.awscdk.services.logs.*;
   * LogGroup logGroup;
   * Rule rule;
   * rule.addTarget(CloudWatchLogGroup.Builder.create(logGroup)
   * .logEvent(LogGroupTargetInput.fromObject(LogGroupTargetInputOptions.builder()
   * .timestamp(EventField.fromPath("$.time"))
   * .message(EventField.fromPath("$.detail-type"))
   * .build()))
   * .build());
   * ```
   */
  public inline fun logGroupTargetInputOptions(block: LogGroupTargetInputOptionsDsl.() -> Unit =
      {}): LogGroupTargetInputOptions {
    val builder = LogGroupTargetInputOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Use a StepFunctions state machine as a target for Amazon EventBridge rules.
   *
   * Example:
   *
   * ```
   * import software.amazon.awscdk.services.iam.*;
   * import software.amazon.awscdk.services.stepfunctions.*;
   * Rule rule = Rule.Builder.create(this, "Rule")
   * .schedule(Schedule.rate(Duration.minutes(1)))
   * .build();
   * Queue dlq = new Queue(this, "DeadLetterQueue");
   * Role role = Role.Builder.create(this, "Role")
   * .assumedBy(new ServicePrincipal("events.amazonaws.com"))
   * .build();
   * StateMachine stateMachine = StateMachine.Builder.create(this, "SM")
   * .definition(Wait.Builder.create(this,
   * "Hello").time(WaitTime.duration(Duration.seconds(10))).build())
   * .build();
   * rule.addTarget(SfnStateMachine.Builder.create(stateMachine)
   * .input(RuleTargetInput.fromObject(Map.of("SomeParam", "SomeValue")))
   * .deadLetterQueue(dlq)
   * .role(role)
   * .build());
   * ```
   */
  public inline fun sfnStateMachine(machine: IStateMachine, block: SfnStateMachineDsl.() -> Unit =
      {}): SfnStateMachine {
    val builder = SfnStateMachineDsl(machine)
    builder.apply(block)
    return builder.build()
  }

  /**
   * Customize the Step Functions State Machine target.
   *
   * Example:
   *
   * ```
   * import software.amazon.awscdk.services.iam.*;
   * import software.amazon.awscdk.services.stepfunctions.*;
   * Rule rule = Rule.Builder.create(this, "Rule")
   * .schedule(Schedule.rate(Duration.minutes(1)))
   * .build();
   * Queue dlq = new Queue(this, "DeadLetterQueue");
   * Role role = Role.Builder.create(this, "Role")
   * .assumedBy(new ServicePrincipal("events.amazonaws.com"))
   * .build();
   * StateMachine stateMachine = StateMachine.Builder.create(this, "SM")
   * .definition(Wait.Builder.create(this,
   * "Hello").time(WaitTime.duration(Duration.seconds(10))).build())
   * .build();
   * rule.addTarget(SfnStateMachine.Builder.create(stateMachine)
   * .input(RuleTargetInput.fromObject(Map.of("SomeParam", "SomeValue")))
   * .deadLetterQueue(dlq)
   * .role(role)
   * .build());
   * ```
   */
  public inline fun sfnStateMachineProps(block: SfnStateMachinePropsDsl.() -> Unit = {}):
      SfnStateMachineProps {
    val builder = SfnStateMachinePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Use an SNS topic as a target for Amazon EventBridge rules.
   *
   * Example:
   *
   * ```
   * // publish to an SNS topic every time code is committed
   * // to a CodeCommit repository
   * repository.onCommit("onCommit", OnCommitOptions.builder().target(new SnsTopic(topic)).build());
   * ```
   */
  public inline fun snsTopic(topic: ITopic, block: SnsTopicDsl.() -> Unit = {}): SnsTopic {
    val builder = SnsTopicDsl(topic)
    builder.apply(block)
    return builder.build()
  }

  /**
   * Customize the SNS Topic Event Target.
   *
   * Example:
   *
   * ```
   * Rule onCommitRule;
   * Topic topic;
   * onCommitRule.addTarget(SnsTopic.Builder.create(topic)
   * .message(RuleTargetInput.fromText(String.format("A commit was pushed to the repository %s on
   * branch %s", ReferenceEvent.getRepositoryName(), ReferenceEvent.getReferenceName())))
   * .build());
   * ```
   */
  public inline fun snsTopicProps(block: SnsTopicPropsDsl.() -> Unit = {}): SnsTopicProps {
    val builder = SnsTopicPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Use an SQS Queue as a target for Amazon EventBridge rules.
   *
   * Example:
   *
   * ```
   * // publish to an SQS queue every time code is committed
   * // to a CodeCommit repository
   * repository.onCommit("onCommit", OnCommitOptions.builder().target(new SqsQueue(queue)).build());
   * ```
   */
  public inline fun sqsQueue(queue: IQueue, block: SqsQueueDsl.() -> Unit = {}): SqsQueue {
    val builder = SqsQueueDsl(queue)
    builder.apply(block)
    return builder.build()
  }

  /**
   * Customize the SQS Queue Event Target.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.*;
   * import software.amazon.awscdk.services.events.*;
   * import software.amazon.awscdk.services.events.targets.*;
   * import software.amazon.awscdk.services.sqs.*;
   * Queue queue;
   * RuleTargetInput ruleTargetInput;
   * SqsQueueProps sqsQueueProps = SqsQueueProps.builder()
   * .deadLetterQueue(queue)
   * .maxEventAge(Duration.minutes(30))
   * .message(ruleTargetInput)
   * .messageGroupId("messageGroupId")
   * .retryAttempts(123)
   * .build();
   * ```
   */
  public inline fun sqsQueueProps(block: SqsQueuePropsDsl.() -> Unit = {}): SqsQueueProps {
    val builder = SqsQueuePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Metadata that you apply to a resource to help categorize and organize the resource.
   *
   * Each tag consists of a key and an optional value, both of which you define.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.events.targets.*;
   * Tag tag = Tag.builder()
   * .key("key")
   * .value("value")
   * .build();
   * ```
   */
  public inline fun tag(block: TagDsl.() -> Unit = {}): Tag {
    val builder = TagDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * The generic properties for an RuleTarget.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.*;
   * import software.amazon.awscdk.services.events.targets.*;
   * import software.amazon.awscdk.services.sqs.*;
   * Queue queue;
   * TargetBaseProps targetBaseProps = TargetBaseProps.builder()
   * .deadLetterQueue(queue)
   * .maxEventAge(Duration.minutes(30))
   * .retryAttempts(123)
   * .build();
   * ```
   */
  public inline fun targetBaseProps(block: TargetBasePropsDsl.() -> Unit = {}): TargetBaseProps {
    val builder = TargetBasePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * An environment variable to be set in the container run as a task.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.events.targets.*;
   * TaskEnvironmentVariable taskEnvironmentVariable = TaskEnvironmentVariable.builder()
   * .name("name")
   * .value("value")
   * .build();
   * ```
   */
  public inline fun taskEnvironmentVariable(block: TaskEnvironmentVariableDsl.() -> Unit = {}):
      TaskEnvironmentVariable {
    val builder = TaskEnvironmentVariableDsl()
    builder.apply(block)
    return builder.build()
  }
}
