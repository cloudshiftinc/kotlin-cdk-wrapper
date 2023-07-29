@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package cloudshift.awscdk.dsl.services.stepfunctions.tasks

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.tasks.AlgorithmSpecification
import software.amazon.awscdk.services.stepfunctions.tasks.ApplicationConfiguration
import software.amazon.awscdk.services.stepfunctions.tasks.AthenaGetQueryExecution
import software.amazon.awscdk.services.stepfunctions.tasks.AthenaGetQueryExecutionProps
import software.amazon.awscdk.services.stepfunctions.tasks.AthenaGetQueryResults
import software.amazon.awscdk.services.stepfunctions.tasks.AthenaGetQueryResultsProps
import software.amazon.awscdk.services.stepfunctions.tasks.AthenaStartQueryExecution
import software.amazon.awscdk.services.stepfunctions.tasks.AthenaStartQueryExecutionProps
import software.amazon.awscdk.services.stepfunctions.tasks.AthenaStopQueryExecution
import software.amazon.awscdk.services.stepfunctions.tasks.AthenaStopQueryExecutionProps
import software.amazon.awscdk.services.stepfunctions.tasks.BatchContainerOverrides
import software.amazon.awscdk.services.stepfunctions.tasks.BatchJobDependency
import software.amazon.awscdk.services.stepfunctions.tasks.BatchSubmitJob
import software.amazon.awscdk.services.stepfunctions.tasks.BatchSubmitJobProps
import software.amazon.awscdk.services.stepfunctions.tasks.CallApiGatewayEndpointBaseProps
import software.amazon.awscdk.services.stepfunctions.tasks.CallApiGatewayHttpApiEndpoint
import software.amazon.awscdk.services.stepfunctions.tasks.CallApiGatewayHttpApiEndpointProps
import software.amazon.awscdk.services.stepfunctions.tasks.CallApiGatewayRestApiEndpoint
import software.amazon.awscdk.services.stepfunctions.tasks.CallApiGatewayRestApiEndpointProps
import software.amazon.awscdk.services.stepfunctions.tasks.CallAwsService
import software.amazon.awscdk.services.stepfunctions.tasks.CallAwsServiceProps
import software.amazon.awscdk.services.stepfunctions.tasks.Channel
import software.amazon.awscdk.services.stepfunctions.tasks.CodeBuildStartBuild
import software.amazon.awscdk.services.stepfunctions.tasks.CodeBuildStartBuildProps
import software.amazon.awscdk.services.stepfunctions.tasks.CommonEcsRunTaskProps
import software.amazon.awscdk.services.stepfunctions.tasks.ContainerDefinition
import software.amazon.awscdk.services.stepfunctions.tasks.ContainerDefinitionConfig
import software.amazon.awscdk.services.stepfunctions.tasks.ContainerDefinitionOptions
import software.amazon.awscdk.services.stepfunctions.tasks.ContainerOverride
import software.amazon.awscdk.services.stepfunctions.tasks.ContainerOverrides
import software.amazon.awscdk.services.stepfunctions.tasks.DataSource
import software.amazon.awscdk.services.stepfunctions.tasks.DockerImageConfig
import software.amazon.awscdk.services.stepfunctions.tasks.DynamoDeleteItem
import software.amazon.awscdk.services.stepfunctions.tasks.DynamoDeleteItemProps
import software.amazon.awscdk.services.stepfunctions.tasks.DynamoGetItem
import software.amazon.awscdk.services.stepfunctions.tasks.DynamoGetItemProps
import software.amazon.awscdk.services.stepfunctions.tasks.DynamoPutItem
import software.amazon.awscdk.services.stepfunctions.tasks.DynamoPutItemProps
import software.amazon.awscdk.services.stepfunctions.tasks.DynamoUpdateItem
import software.amazon.awscdk.services.stepfunctions.tasks.DynamoUpdateItemProps
import software.amazon.awscdk.services.stepfunctions.tasks.EcsEc2LaunchTarget
import software.amazon.awscdk.services.stepfunctions.tasks.EcsEc2LaunchTargetOptions
import software.amazon.awscdk.services.stepfunctions.tasks.EcsFargateLaunchTarget
import software.amazon.awscdk.services.stepfunctions.tasks.EcsFargateLaunchTargetOptions
import software.amazon.awscdk.services.stepfunctions.tasks.EcsLaunchTargetConfig
import software.amazon.awscdk.services.stepfunctions.tasks.EcsRunTask
import software.amazon.awscdk.services.stepfunctions.tasks.EcsRunTaskProps
import software.amazon.awscdk.services.stepfunctions.tasks.EksCall
import software.amazon.awscdk.services.stepfunctions.tasks.EksCallProps
import software.amazon.awscdk.services.stepfunctions.tasks.EmrAddStep
import software.amazon.awscdk.services.stepfunctions.tasks.EmrAddStepProps
import software.amazon.awscdk.services.stepfunctions.tasks.EmrCancelStep
import software.amazon.awscdk.services.stepfunctions.tasks.EmrCancelStepProps
import software.amazon.awscdk.services.stepfunctions.tasks.EmrContainersCreateVirtualCluster
import software.amazon.awscdk.services.stepfunctions.tasks.EmrContainersCreateVirtualClusterProps
import software.amazon.awscdk.services.stepfunctions.tasks.EmrContainersDeleteVirtualCluster
import software.amazon.awscdk.services.stepfunctions.tasks.EmrContainersDeleteVirtualClusterProps
import software.amazon.awscdk.services.stepfunctions.tasks.EmrContainersStartJobRun
import software.amazon.awscdk.services.stepfunctions.tasks.EmrContainersStartJobRunProps
import software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster
import software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateClusterProps
import software.amazon.awscdk.services.stepfunctions.tasks.EmrModifyInstanceFleetByName
import software.amazon.awscdk.services.stepfunctions.tasks.EmrModifyInstanceFleetByNameProps
import software.amazon.awscdk.services.stepfunctions.tasks.EmrModifyInstanceGroupByName
import software.amazon.awscdk.services.stepfunctions.tasks.EmrModifyInstanceGroupByNameProps
import software.amazon.awscdk.services.stepfunctions.tasks.EmrSetClusterTerminationProtection
import software.amazon.awscdk.services.stepfunctions.tasks.EmrSetClusterTerminationProtectionProps
import software.amazon.awscdk.services.stepfunctions.tasks.EmrTerminateCluster
import software.amazon.awscdk.services.stepfunctions.tasks.EmrTerminateClusterProps
import software.amazon.awscdk.services.stepfunctions.tasks.EncryptionConfiguration
import software.amazon.awscdk.services.stepfunctions.tasks.EvaluateExpression
import software.amazon.awscdk.services.stepfunctions.tasks.EvaluateExpressionProps
import software.amazon.awscdk.services.stepfunctions.tasks.EventBridgePutEvents
import software.amazon.awscdk.services.stepfunctions.tasks.EventBridgePutEventsEntry
import software.amazon.awscdk.services.stepfunctions.tasks.EventBridgePutEventsProps
import software.amazon.awscdk.services.stepfunctions.tasks.GlueDataBrewStartJobRun
import software.amazon.awscdk.services.stepfunctions.tasks.GlueDataBrewStartJobRunProps
import software.amazon.awscdk.services.stepfunctions.tasks.GlueStartJobRun
import software.amazon.awscdk.services.stepfunctions.tasks.GlueStartJobRunProps
import software.amazon.awscdk.services.stepfunctions.tasks.JobDependency
import software.amazon.awscdk.services.stepfunctions.tasks.JobDriver
import software.amazon.awscdk.services.stepfunctions.tasks.LambdaInvoke
import software.amazon.awscdk.services.stepfunctions.tasks.LambdaInvokeProps
import software.amazon.awscdk.services.stepfunctions.tasks.LaunchTargetBindOptions
import software.amazon.awscdk.services.stepfunctions.tasks.MessageAttribute
import software.amazon.awscdk.services.stepfunctions.tasks.MetricDefinition
import software.amazon.awscdk.services.stepfunctions.tasks.ModelClientOptions
import software.amazon.awscdk.services.stepfunctions.tasks.Monitoring
import software.amazon.awscdk.services.stepfunctions.tasks.OutputDataConfig
import software.amazon.awscdk.services.stepfunctions.tasks.ProductionVariant
import software.amazon.awscdk.services.stepfunctions.tasks.QueryExecutionContext
import software.amazon.awscdk.services.stepfunctions.tasks.ResourceConfig
import software.amazon.awscdk.services.stepfunctions.tasks.ResultConfiguration
import software.amazon.awscdk.services.stepfunctions.tasks.S3DataSource
import software.amazon.awscdk.services.stepfunctions.tasks.S3LocationBindOptions
import software.amazon.awscdk.services.stepfunctions.tasks.S3LocationConfig
import software.amazon.awscdk.services.stepfunctions.tasks.SageMakerCreateEndpoint
import software.amazon.awscdk.services.stepfunctions.tasks.SageMakerCreateEndpointConfig
import software.amazon.awscdk.services.stepfunctions.tasks.SageMakerCreateEndpointConfigProps
import software.amazon.awscdk.services.stepfunctions.tasks.SageMakerCreateEndpointProps
import software.amazon.awscdk.services.stepfunctions.tasks.SageMakerCreateModel
import software.amazon.awscdk.services.stepfunctions.tasks.SageMakerCreateModelProps
import software.amazon.awscdk.services.stepfunctions.tasks.SageMakerCreateTrainingJob
import software.amazon.awscdk.services.stepfunctions.tasks.SageMakerCreateTrainingJobProps
import software.amazon.awscdk.services.stepfunctions.tasks.SageMakerCreateTransformJob
import software.amazon.awscdk.services.stepfunctions.tasks.SageMakerCreateTransformJobProps
import software.amazon.awscdk.services.stepfunctions.tasks.SageMakerUpdateEndpoint
import software.amazon.awscdk.services.stepfunctions.tasks.SageMakerUpdateEndpointProps
import software.amazon.awscdk.services.stepfunctions.tasks.ShuffleConfig
import software.amazon.awscdk.services.stepfunctions.tasks.SnsPublish
import software.amazon.awscdk.services.stepfunctions.tasks.SnsPublishProps
import software.amazon.awscdk.services.stepfunctions.tasks.SparkSubmitJobDriver
import software.amazon.awscdk.services.stepfunctions.tasks.SqsSendMessage
import software.amazon.awscdk.services.stepfunctions.tasks.SqsSendMessageProps
import software.amazon.awscdk.services.stepfunctions.tasks.StepFunctionsInvokeActivity
import software.amazon.awscdk.services.stepfunctions.tasks.StepFunctionsInvokeActivityProps
import software.amazon.awscdk.services.stepfunctions.tasks.StepFunctionsStartExecution
import software.amazon.awscdk.services.stepfunctions.tasks.StepFunctionsStartExecutionProps
import software.amazon.awscdk.services.stepfunctions.tasks.StoppingCondition
import software.amazon.awscdk.services.stepfunctions.tasks.TaskEnvironmentVariable
import software.amazon.awscdk.services.stepfunctions.tasks.TransformDataSource
import software.amazon.awscdk.services.stepfunctions.tasks.TransformInput
import software.amazon.awscdk.services.stepfunctions.tasks.TransformOutput
import software.amazon.awscdk.services.stepfunctions.tasks.TransformResources
import software.amazon.awscdk.services.stepfunctions.tasks.TransformS3DataSource
import software.amazon.awscdk.services.stepfunctions.tasks.VpcConfig
import software.constructs.Construct

public object tasks {
    /**
     * Specify the training algorithm and algorithm-specific metadata.
     *
     * Example:
     * ```
     * SageMakerCreateTrainingJob.Builder.create(this, "TrainSagemaker")
     * .trainingJobName(JsonPath.stringAt("$.JobName"))
     * .algorithmSpecification(AlgorithmSpecification.builder()
     * .algorithmName("BlazingText")
     * .trainingInputMode(InputMode.FILE)
     * .build())
     * .inputDataConfig(List.of(Channel.builder()
     * .channelName("train")
     * .dataSource(DataSource.builder()
     * .s3DataSource(S3DataSource.builder()
     * .s3DataType(S3DataType.S3_PREFIX)
     * .s3Location(S3Location.fromJsonExpression("$.S3Bucket"))
     * .build())
     * .build())
     * .build()))
     * .outputDataConfig(OutputDataConfig.builder()
     * .s3OutputLocation(S3Location.fromBucket(Bucket.fromBucketName(this, "Bucket", "mybucket"),
     * "myoutputpath"))
     * .build())
     * .resourceConfig(ResourceConfig.builder()
     * .instanceCount(1)
     * .instanceType(new InstanceType(JsonPath.stringAt("$.InstanceType")))
     * .volumeSize(Size.gibibytes(50))
     * .build()) // optional: default is 1 instance of EC2 `M4.XLarge` with `10GB` volume
     * .stoppingCondition(StoppingCondition.builder()
     * .maxRuntime(Duration.hours(2))
     * .build())
     * .build();
     * ```
     */
    public inline fun algorithmSpecification(
        block: AlgorithmSpecificationDsl.() -> Unit = {}
    ): AlgorithmSpecification {
        val builder = AlgorithmSpecificationDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A configuration specification to be used when provisioning virtual clusters, which can
     * include configurations for applications and software bundled with Amazon EMR on EKS.
     *
     * A configuration consists of a classification, properties, and optional nested configurations.
     * A classification refers to an application-specific configuration file. Properties are the
     * settings you want to change in that file.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.stepfunctions.tasks.*;
     * ApplicationConfiguration applicationConfiguration_;
     * Classification classification;
     * ApplicationConfiguration applicationConfiguration = ApplicationConfiguration.builder()
     * .classification(classification)
     * // the properties below are optional
     * .nestedConfig(List.of(applicationConfiguration_))
     * .properties(Map.of(
     * "propertiesKey", "properties"))
     * .build();
     * ```
     *
     * [Documentation](https://docs.aws.amazon.com/emr/latest/ReleaseGuide/emr-configure-apps.html)
     */
    public inline fun applicationConfiguration(
        block: ApplicationConfigurationDsl.() -> Unit = {}
    ): ApplicationConfiguration {
        val builder = ApplicationConfigurationDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Get an Athena Query Execution as a Task.
     *
     * Example:
     * ```
     * AthenaGetQueryExecution getQueryExecutionJob = AthenaGetQueryExecution.Builder.create(this,
     * "Get Query Execution")
     * .queryExecutionId(JsonPath.stringAt("$.QueryExecutionId"))
     * .build();
     * ```
     *
     * [Documentation](https://docs.aws.amazon.com/step-functions/latest/dg/connect-athena.html)
     */
    public inline fun athenaGetQueryExecution(
        scope: Construct,
        id: String,
        block: AthenaGetQueryExecutionDsl.() -> Unit = {},
    ): AthenaGetQueryExecution {
        val builder = AthenaGetQueryExecutionDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for getting a Query Execution.
     *
     * Example:
     * ```
     * AthenaGetQueryExecution getQueryExecutionJob = AthenaGetQueryExecution.Builder.create(this,
     * "Get Query Execution")
     * .queryExecutionId(JsonPath.stringAt("$.QueryExecutionId"))
     * .build();
     * ```
     */
    public inline fun athenaGetQueryExecutionProps(
        block: AthenaGetQueryExecutionPropsDsl.() -> Unit = {}
    ): AthenaGetQueryExecutionProps {
        val builder = AthenaGetQueryExecutionPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Get an Athena Query Results as a Task.
     *
     * Example:
     * ```
     * AthenaGetQueryResults getQueryResultsJob = AthenaGetQueryResults.Builder.create(this, "Get
     * Query Results")
     * .queryExecutionId(JsonPath.stringAt("$.QueryExecutionId"))
     * .build();
     * ```
     *
     * [Documentation](https://docs.aws.amazon.com/step-functions/latest/dg/connect-athena.html)
     */
    public inline fun athenaGetQueryResults(
        scope: Construct,
        id: String,
        block: AthenaGetQueryResultsDsl.() -> Unit = {},
    ): AthenaGetQueryResults {
        val builder = AthenaGetQueryResultsDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for getting a Query Results.
     *
     * Example:
     * ```
     * AthenaGetQueryResults getQueryResultsJob = AthenaGetQueryResults.Builder.create(this, "Get
     * Query Results")
     * .queryExecutionId(JsonPath.stringAt("$.QueryExecutionId"))
     * .build();
     * ```
     */
    public inline fun athenaGetQueryResultsProps(
        block: AthenaGetQueryResultsPropsDsl.() -> Unit = {}
    ): AthenaGetQueryResultsProps {
        val builder = AthenaGetQueryResultsPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Start an Athena Query as a Task.
     *
     * Example:
     * ```
     * AthenaStartQueryExecution startQueryExecutionJob =
     * AthenaStartQueryExecution.Builder.create(this, "Start Athena Query")
     * .queryString(JsonPath.stringAt("$.queryString"))
     * .queryExecutionContext(QueryExecutionContext.builder()
     * .databaseName("mydatabase")
     * .build())
     * .resultConfiguration(ResultConfiguration.builder()
     * .encryptionConfiguration(EncryptionConfiguration.builder()
     * .encryptionOption(EncryptionOption.S3_MANAGED)
     * .build())
     * .outputLocation(Location.builder()
     * .bucketName("query-results-bucket")
     * .objectKey("folder")
     * .build())
     * .build())
     * .build();
     * ```
     *
     * [Documentation](https://docs.aws.amazon.com/step-functions/latest/dg/connect-athena.html)
     */
    public inline fun athenaStartQueryExecution(
        scope: Construct,
        id: String,
        block: AthenaStartQueryExecutionDsl.() -> Unit = {},
    ): AthenaStartQueryExecution {
        val builder = AthenaStartQueryExecutionDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for starting a Query Execution.
     *
     * Example:
     * ```
     * AthenaStartQueryExecution startQueryExecutionJob =
     * AthenaStartQueryExecution.Builder.create(this, "Start Athena Query")
     * .queryString(JsonPath.stringAt("$.queryString"))
     * .queryExecutionContext(QueryExecutionContext.builder()
     * .databaseName("mydatabase")
     * .build())
     * .resultConfiguration(ResultConfiguration.builder()
     * .encryptionConfiguration(EncryptionConfiguration.builder()
     * .encryptionOption(EncryptionOption.S3_MANAGED)
     * .build())
     * .outputLocation(Location.builder()
     * .bucketName("query-results-bucket")
     * .objectKey("folder")
     * .build())
     * .build())
     * .build();
     * ```
     */
    public inline fun athenaStartQueryExecutionProps(
        block: AthenaStartQueryExecutionPropsDsl.() -> Unit = {}
    ): AthenaStartQueryExecutionProps {
        val builder = AthenaStartQueryExecutionPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Stop an Athena Query Execution as a Task.
     *
     * Example:
     * ```
     * AthenaStopQueryExecution stopQueryExecutionJob = AthenaStopQueryExecution.Builder.create(this,
     * "Stop Query Execution")
     * .queryExecutionId(JsonPath.stringAt("$.QueryExecutionId"))
     * .build();
     * ```
     *
     * [Documentation](https://docs.aws.amazon.com/step-functions/latest/dg/connect-athena.html)
     */
    public inline fun athenaStopQueryExecution(
        scope: Construct,
        id: String,
        block: AthenaStopQueryExecutionDsl.() -> Unit = {},
    ): AthenaStopQueryExecution {
        val builder = AthenaStopQueryExecutionDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for stoping a Query Execution.
     *
     * Example:
     * ```
     * AthenaStopQueryExecution stopQueryExecutionJob = AthenaStopQueryExecution.Builder.create(this,
     * "Stop Query Execution")
     * .queryExecutionId(JsonPath.stringAt("$.QueryExecutionId"))
     * .build();
     * ```
     */
    public inline fun athenaStopQueryExecutionProps(
        block: AthenaStopQueryExecutionPropsDsl.() -> Unit = {}
    ): AthenaStopQueryExecutionProps {
        val builder = AthenaStopQueryExecutionPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The overrides that should be sent to a container.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.*;
     * import software.amazon.awscdk.services.ec2.*;
     * import software.amazon.awscdk.services.stepfunctions.tasks.*;
     * InstanceType instanceType;
     * Size size;
     * BatchContainerOverrides batchContainerOverrides = BatchContainerOverrides.builder()
     * .command(List.of("command"))
     * .environment(Map.of(
     * "environmentKey", "environment"))
     * .gpuCount(123)
     * .instanceType(instanceType)
     * .memory(size)
     * .vcpus(123)
     * .build();
     * ```
     */
    public inline fun batchContainerOverrides(
        block: BatchContainerOverridesDsl.() -> Unit = {}
    ): BatchContainerOverrides {
        val builder = BatchContainerOverridesDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * An object representing an AWS Batch job dependency.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.stepfunctions.tasks.*;
     * BatchJobDependency batchJobDependency = BatchJobDependency.builder()
     * .jobId("jobId")
     * .type("type")
     * .build();
     * ```
     */
    public inline fun batchJobDependency(
        block: BatchJobDependencyDsl.() -> Unit = {}
    ): BatchJobDependency {
        val builder = BatchJobDependencyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Task to submits an AWS Batch job from a job definition.
     *
     * Example:
     * ```
     * import software.amazon.awscdk.services.batch.alpha.*;
     * EcsJobDefinition batchJobDefinition;
     * JobQueue batchQueue;
     * BatchSubmitJob task = BatchSubmitJob.Builder.create(this, "Submit Job")
     * .jobDefinitionArn(batchJobDefinition.getJobDefinitionArn())
     * .jobName("MyJob")
     * .jobQueueArn(batchQueue.getJobQueueArn())
     * .build();
     * ```
     *
     * [Documentation](https://docs.aws.amazon.com/step-functions/latest/dg/connect-batch.html)
     */
    public inline fun batchSubmitJob(
        scope: Construct,
        id: String,
        block: BatchSubmitJobDsl.() -> Unit = {},
    ): BatchSubmitJob {
        val builder = BatchSubmitJobDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for RunBatchJob.
     *
     * Example:
     * ```
     * import software.amazon.awscdk.services.batch.alpha.*;
     * EcsJobDefinition batchJobDefinition;
     * JobQueue batchQueue;
     * BatchSubmitJob task = BatchSubmitJob.Builder.create(this, "Submit Job")
     * .jobDefinitionArn(batchJobDefinition.getJobDefinitionArn())
     * .jobName("MyJob")
     * .jobQueueArn(batchQueue.getJobQueueArn())
     * .build();
     * ```
     */
    public inline fun batchSubmitJobProps(
        block: BatchSubmitJobPropsDsl.() -> Unit = {}
    ): BatchSubmitJobProps {
        val builder = BatchSubmitJobPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Base CallApiGatewayEdnpoint Task Props.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.*;
     * import software.amazon.awscdk.services.stepfunctions.*;
     * import software.amazon.awscdk.services.stepfunctions.tasks.*;
     * Object resultSelector;
     * TaskInput taskInput;
     * TaskRole taskRole;
     * Timeout timeout;
     * CallApiGatewayEndpointBaseProps callApiGatewayEndpointBaseProps =
     * CallApiGatewayEndpointBaseProps.builder()
     * .method(HttpMethod.GET)
     * // the properties below are optional
     * .apiPath("apiPath")
     * .authType(AuthType.NO_AUTH)
     * .comment("comment")
     * .credentials(Credentials.builder()
     * .role(taskRole)
     * .build())
     * .headers(taskInput)
     * .heartbeat(Duration.minutes(30))
     * .heartbeatTimeout(timeout)
     * .inputPath("inputPath")
     * .integrationPattern(IntegrationPattern.REQUEST_RESPONSE)
     * .outputPath("outputPath")
     * .queryParameters(taskInput)
     * .requestBody(taskInput)
     * .resultPath("resultPath")
     * .resultSelector(Map.of(
     * "resultSelectorKey", resultSelector))
     * .taskTimeout(timeout)
     * .timeout(Duration.minutes(30))
     * .build();
     * ```
     */
    public inline fun callApiGatewayEndpointBaseProps(
        block: CallApiGatewayEndpointBasePropsDsl.() -> Unit = {}
    ): CallApiGatewayEndpointBaseProps {
        val builder = CallApiGatewayEndpointBasePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Call HTTP API endpoint as a Task.
     *
     * Example:
     * ```
     * import software.amazon.awscdk.services.apigatewayv2.alpha.*;
     * HttpApi httpApi = new HttpApi(this, "MyHttpApi");
     * CallApiGatewayHttpApiEndpoint invokeTask = CallApiGatewayHttpApiEndpoint.Builder.create(this,
     * "Call HTTP API")
     * .apiId(httpApi.getApiId())
     * .apiStack(Stack.of(httpApi))
     * .method(HttpMethod.GET)
     * .build();
     * ```
     *
     * [Documentation](https://docs.aws.amazon.com/step-functions/latest/dg/connect-api-gateway.html)
     */
    public inline fun callApiGatewayHttpApiEndpoint(
        scope: Construct,
        id: String,
        block: CallApiGatewayHttpApiEndpointDsl.() -> Unit = {},
    ): CallApiGatewayHttpApiEndpoint {
        val builder = CallApiGatewayHttpApiEndpointDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for calling an HTTP API Endpoint.
     *
     * Example:
     * ```
     * import software.amazon.awscdk.services.apigatewayv2.alpha.*;
     * HttpApi httpApi = new HttpApi(this, "MyHttpApi");
     * CallApiGatewayHttpApiEndpoint invokeTask = CallApiGatewayHttpApiEndpoint.Builder.create(this,
     * "Call HTTP API")
     * .apiId(httpApi.getApiId())
     * .apiStack(Stack.of(httpApi))
     * .method(HttpMethod.GET)
     * .build();
     * ```
     */
    public inline fun callApiGatewayHttpApiEndpointProps(
        block: CallApiGatewayHttpApiEndpointPropsDsl.() -> Unit = {}
    ): CallApiGatewayHttpApiEndpointProps {
        val builder = CallApiGatewayHttpApiEndpointPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Call REST API endpoint as a Task.
     *
     * Be aware that the header values must be arrays. When passing the Task Token in the headers
     * field `WAIT_FOR_TASK_TOKEN` integration, use `JsonPath.array()` to wrap the token in an
     * array:
     * ```
     * import software.amazon.awscdk.services.apigateway.*;
     * RestApi api;
     * CallApiGatewayRestApiEndpoint.Builder.create(this, "Endpoint")
     * .api(api)
     * .stageName("Stage")
     * .method(HttpMethod.PUT)
     * .integrationPattern(IntegrationPattern.WAIT_FOR_TASK_TOKEN)
     * .headers(TaskInput.fromObject(Map.of(
     * "TaskToken", JsonPath.array(JsonPath.getTaskToken()))))
     * .build();
     * ```
     *
     * Example:
     * ```
     * import software.amazon.awscdk.services.apigateway.*;
     * RestApi api;
     * CallApiGatewayRestApiEndpoint.Builder.create(this, "Endpoint")
     * .api(api)
     * .stageName("Stage")
     * .method(HttpMethod.PUT)
     * .integrationPattern(IntegrationPattern.WAIT_FOR_TASK_TOKEN)
     * .headers(TaskInput.fromObject(Map.of(
     * "TaskToken", JsonPath.array(JsonPath.getTaskToken()))))
     * .build();
     * ```
     *
     * [Documentation](https://docs.aws.amazon.com/step-functions/latest/dg/connect-api-gateway.html)
     */
    public inline fun callApiGatewayRestApiEndpoint(
        scope: Construct,
        id: String,
        block: CallApiGatewayRestApiEndpointDsl.() -> Unit = {},
    ): CallApiGatewayRestApiEndpoint {
        val builder = CallApiGatewayRestApiEndpointDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for calling an REST API Endpoint.
     *
     * Example:
     * ```
     * import software.amazon.awscdk.services.apigateway.*;
     * RestApi api;
     * CallApiGatewayRestApiEndpoint.Builder.create(this, "Endpoint")
     * .api(api)
     * .stageName("Stage")
     * .method(HttpMethod.PUT)
     * .integrationPattern(IntegrationPattern.WAIT_FOR_TASK_TOKEN)
     * .headers(TaskInput.fromObject(Map.of(
     * "TaskToken", JsonPath.array(JsonPath.getTaskToken()))))
     * .build();
     * ```
     */
    public inline fun callApiGatewayRestApiEndpointProps(
        block: CallApiGatewayRestApiEndpointPropsDsl.() -> Unit = {}
    ): CallApiGatewayRestApiEndpointProps {
        val builder = CallApiGatewayRestApiEndpointPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A StepFunctions task to call an AWS service API.
     *
     * Example:
     * ```
     * CallAwsService detectLabels = CallAwsService.Builder.create(this, "DetectLabels")
     * .service("rekognition")
     * .action("detectLabels")
     * .iamResources(List.of("*"))
     * .additionalIamStatements(List.of(
     * PolicyStatement.Builder.create()
     * .actions(List.of("s3:getObject"))
     * .resources(List.of("arn:aws:s3:::my-bucket/ *"))
     * .build()))
     * .build();
     * ```
     */
    public inline fun callAwsService(
        scope: Construct,
        id: String,
        block: CallAwsServiceDsl.() -> Unit = {},
    ): CallAwsService {
        val builder = CallAwsServiceDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for calling an AWS service's API action from your state machine.
     *
     * Example:
     * ```
     * CallAwsService detectLabels = CallAwsService.Builder.create(this, "DetectLabels")
     * .service("rekognition")
     * .action("detectLabels")
     * .iamResources(List.of("*"))
     * .additionalIamStatements(List.of(
     * PolicyStatement.Builder.create()
     * .actions(List.of("s3:getObject"))
     * .resources(List.of("arn:aws:s3:::my-bucket/ *"))
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](https://docs.aws.amazon.com/step-functions/latest/dg/supported-services-awssdk.html)
     */
    public inline fun callAwsServiceProps(
        block: CallAwsServicePropsDsl.() -> Unit = {}
    ): CallAwsServiceProps {
        val builder = CallAwsServicePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Describes the training, validation or test dataset and the Amazon S3 location where it is
     * stored.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.stepfunctions.tasks.*;
     * S3Location s3Location;
     * Channel channel = Channel.builder()
     * .channelName("channelName")
     * .dataSource(DataSource.builder()
     * .s3DataSource(S3DataSource.builder()
     * .s3Location(s3Location)
     * // the properties below are optional
     * .attributeNames(List.of("attributeNames"))
     * .s3DataDistributionType(S3DataDistributionType.FULLY_REPLICATED)
     * .s3DataType(S3DataType.MANIFEST_FILE)
     * .build())
     * .build())
     * // the properties below are optional
     * .compressionType(CompressionType.NONE)
     * .contentType("contentType")
     * .inputMode(InputMode.PIPE)
     * .recordWrapperType(RecordWrapperType.NONE)
     * .shuffleConfig(ShuffleConfig.builder()
     * .seed(123)
     * .build())
     * .build();
     * ```
     */
    public inline fun channel(block: ChannelDsl.() -> Unit = {}): Channel {
        val builder = ChannelDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Start a CodeBuild Build as a task.
     *
     * Example:
     * ```
     * import software.amazon.awscdk.services.codebuild.*;
     * Project codebuildProject = Project.Builder.create(this, "Project")
     * .projectName("MyTestProject")
     * .buildSpec(BuildSpec.fromObject(Map.of(
     * "version", "0.2",
     * "phases", Map.of(
     * "build", Map.of(
     * "commands", List.of("echo \"Hello, CodeBuild!\""))))))
     * .build();
     * CodeBuildStartBuild task = CodeBuildStartBuild.Builder.create(this, "Task")
     * .project(codebuildProject)
     * .integrationPattern(IntegrationPattern.RUN_JOB)
     * .environmentVariablesOverride(Map.of(
     * "ZONE", BuildEnvironmentVariable.builder()
     * .type(BuildEnvironmentVariableType.PLAINTEXT)
     * .value(JsonPath.stringAt("$.envVariables.zone"))
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](https://docs.aws.amazon.com/step-functions/latest/dg/connect-codebuild.html)
     */
    public inline fun codeBuildStartBuild(
        scope: Construct,
        id: String,
        block: CodeBuildStartBuildDsl.() -> Unit = {},
    ): CodeBuildStartBuild {
        val builder = CodeBuildStartBuildDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for CodeBuildStartBuild.
     *
     * Example:
     * ```
     * import software.amazon.awscdk.services.codebuild.*;
     * Project codebuildProject = Project.Builder.create(this, "Project")
     * .projectName("MyTestProject")
     * .buildSpec(BuildSpec.fromObject(Map.of(
     * "version", "0.2",
     * "phases", Map.of(
     * "build", Map.of(
     * "commands", List.of("echo \"Hello, CodeBuild!\""))))))
     * .build();
     * CodeBuildStartBuild task = CodeBuildStartBuild.Builder.create(this, "Task")
     * .project(codebuildProject)
     * .integrationPattern(IntegrationPattern.RUN_JOB)
     * .environmentVariablesOverride(Map.of(
     * "ZONE", BuildEnvironmentVariable.builder()
     * .type(BuildEnvironmentVariableType.PLAINTEXT)
     * .value(JsonPath.stringAt("$.envVariables.zone"))
     * .build()))
     * .build();
     * ```
     */
    public inline fun codeBuildStartBuildProps(
        block: CodeBuildStartBuildPropsDsl.() -> Unit = {}
    ): CodeBuildStartBuildProps {
        val builder = CodeBuildStartBuildPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Basic properties for ECS Tasks.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ecs.*;
     * import software.amazon.awscdk.services.stepfunctions.*;
     * import software.amazon.awscdk.services.stepfunctions.tasks.*;
     * Cluster cluster;
     * ContainerDefinition containerDefinition;
     * TaskDefinition taskDefinition;
     * CommonEcsRunTaskProps commonEcsRunTaskProps = CommonEcsRunTaskProps.builder()
     * .cluster(cluster)
     * .taskDefinition(taskDefinition)
     * // the properties below are optional
     * .containerOverrides(List.of(ContainerOverride.builder()
     * .containerDefinition(containerDefinition)
     * // the properties below are optional
     * .command(List.of("command"))
     * .cpu(123)
     * .environment(List.of(TaskEnvironmentVariable.builder()
     * .name("name")
     * .value("value")
     * .build()))
     * .memoryLimit(123)
     * .memoryReservation(123)
     * .build()))
     * .integrationPattern(ServiceIntegrationPattern.FIRE_AND_FORGET)
     * .build();
     * ```
     */
    public inline fun commonEcsRunTaskProps(
        block: CommonEcsRunTaskPropsDsl.() -> Unit = {}
    ): CommonEcsRunTaskProps {
        val builder = CommonEcsRunTaskPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Describes the container, as part of model definition.
     *
     * Example:
     * ```
     * SageMakerCreateModel.Builder.create(this, "Sagemaker")
     * .modelName("MyModel")
     * .primaryContainer(ContainerDefinition.Builder.create()
     * .image(DockerImage.fromJsonExpression(JsonPath.stringAt("$.Model.imageName")))
     * .mode(Mode.SINGLE_MODEL)
     * .modelS3Location(S3Location.fromJsonExpression("$.TrainingJob.ModelArtifacts.S3ModelArtifacts"))
     * .build())
     * .build();
     * ```
     *
     * [Documentation](https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_ContainerDefinition.html)
     */
    public inline fun containerDefinition(
        block: ContainerDefinitionDsl.() -> Unit = {}
    ): ContainerDefinition {
        val builder = ContainerDefinitionDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Configuration options for the ContainerDefinition.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.stepfunctions.tasks.*;
     * Object parameters;
     * ContainerDefinitionConfig containerDefinitionConfig = ContainerDefinitionConfig.builder()
     * .parameters(Map.of(
     * "parametersKey", parameters))
     * .build();
     * ```
     */
    public inline fun containerDefinitionConfig(
        block: ContainerDefinitionConfigDsl.() -> Unit = {}
    ): ContainerDefinitionConfig {
        val builder = ContainerDefinitionConfigDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties to define a ContainerDefinition.
     *
     * Example:
     * ```
     * SageMakerCreateModel.Builder.create(this, "Sagemaker")
     * .modelName("MyModel")
     * .primaryContainer(ContainerDefinition.Builder.create()
     * .image(DockerImage.fromJsonExpression(JsonPath.stringAt("$.Model.imageName")))
     * .mode(Mode.SINGLE_MODEL)
     * .modelS3Location(S3Location.fromJsonExpression("$.TrainingJob.ModelArtifacts.S3ModelArtifacts"))
     * .build())
     * .build();
     * ```
     *
     * [Documentation](https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_ContainerDefinition.html)
     */
    public inline fun containerDefinitionOptions(
        block: ContainerDefinitionOptionsDsl.() -> Unit = {}
    ): ContainerDefinitionOptions {
        val builder = ContainerDefinitionOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A list of container overrides that specify the name of a container and the overrides it
     * should receive.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ecs.*;
     * import software.amazon.awscdk.services.stepfunctions.tasks.*;
     * ContainerDefinition containerDefinition;
     * ContainerOverride containerOverride = ContainerOverride.builder()
     * .containerDefinition(containerDefinition)
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
    public inline fun containerOverride(
        block: ContainerOverrideDsl.() -> Unit = {}
    ): ContainerOverride {
        val builder = ContainerOverrideDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The overrides that should be sent to a container.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * import software.amazon.awscdk.services.stepfunctions.tasks.*;
     * InstanceType instanceType;
     * ContainerOverrides containerOverrides = ContainerOverrides.builder()
     * .command(List.of("command"))
     * .environment(Map.of(
     * "environmentKey", "environment"))
     * .gpuCount(123)
     * .instanceType(instanceType)
     * .memory(123)
     * .vcpus(123)
     * .build();
     * ```
     */
    public inline fun containerOverrides(
        block: ContainerOverridesDsl.() -> Unit = {}
    ): ContainerOverrides {
        val builder = ContainerOverridesDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Location of the channel data.
     *
     * Example:
     * ```
     * SageMakerCreateTrainingJob.Builder.create(this, "TrainSagemaker")
     * .trainingJobName(JsonPath.stringAt("$.JobName"))
     * .algorithmSpecification(AlgorithmSpecification.builder()
     * .algorithmName("BlazingText")
     * .trainingInputMode(InputMode.FILE)
     * .build())
     * .inputDataConfig(List.of(Channel.builder()
     * .channelName("train")
     * .dataSource(DataSource.builder()
     * .s3DataSource(S3DataSource.builder()
     * .s3DataType(S3DataType.S3_PREFIX)
     * .s3Location(S3Location.fromJsonExpression("$.S3Bucket"))
     * .build())
     * .build())
     * .build()))
     * .outputDataConfig(OutputDataConfig.builder()
     * .s3OutputLocation(S3Location.fromBucket(Bucket.fromBucketName(this, "Bucket", "mybucket"),
     * "myoutputpath"))
     * .build())
     * .resourceConfig(ResourceConfig.builder()
     * .instanceCount(1)
     * .instanceType(new InstanceType(JsonPath.stringAt("$.InstanceType")))
     * .volumeSize(Size.gibibytes(50))
     * .build()) // optional: default is 1 instance of EC2 `M4.XLarge` with `10GB` volume
     * .stoppingCondition(StoppingCondition.builder()
     * .maxRuntime(Duration.hours(2))
     * .build())
     * .build();
     * ```
     */
    public inline fun dataSource(block: DataSourceDsl.() -> Unit = {}): DataSource {
        val builder = DataSourceDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Configuration for a using Docker image.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.stepfunctions.tasks.*;
     * DockerImageConfig dockerImageConfig = DockerImageConfig.builder()
     * .imageUri("imageUri")
     * .build();
     * ```
     */
    public inline fun dockerImageConfig(
        block: DockerImageConfigDsl.() -> Unit = {}
    ): DockerImageConfig {
        val builder = DockerImageConfigDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A StepFunctions task to call DynamoDeleteItem.
     *
     * Example:
     * ```
     * Table myTable;
     * DynamoDeleteItem.Builder.create(this, "DeleteItem")
     * .key(Map.of("MessageId", DynamoAttributeValue.fromString("message-007")))
     * .table(myTable)
     * .resultPath(JsonPath.DISCARD)
     * .build();
     * ```
     */
    public inline fun dynamoDeleteItem(
        scope: Construct,
        id: String,
        block: DynamoDeleteItemDsl.() -> Unit = {},
    ): DynamoDeleteItem {
        val builder = DynamoDeleteItemDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for DynamoDeleteItem Task.
     *
     * Example:
     * ```
     * Table myTable;
     * DynamoDeleteItem.Builder.create(this, "DeleteItem")
     * .key(Map.of("MessageId", DynamoAttributeValue.fromString("message-007")))
     * .table(myTable)
     * .resultPath(JsonPath.DISCARD)
     * .build();
     * ```
     */
    public inline fun dynamoDeleteItemProps(
        block: DynamoDeleteItemPropsDsl.() -> Unit = {}
    ): DynamoDeleteItemProps {
        val builder = DynamoDeleteItemPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A StepFunctions task to call DynamoGetItem.
     *
     * Example:
     * ```
     * Table myTable;
     * DynamoGetItem.Builder.create(this, "Get Item")
     * .key(Map.of("messageId", DynamoAttributeValue.fromString("message-007")))
     * .table(myTable)
     * .build();
     * ```
     */
    public inline fun dynamoGetItem(
        scope: Construct,
        id: String,
        block: DynamoGetItemDsl.() -> Unit = {},
    ): DynamoGetItem {
        val builder = DynamoGetItemDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for DynamoGetItem Task.
     *
     * Example:
     * ```
     * Table myTable;
     * DynamoGetItem.Builder.create(this, "Get Item")
     * .key(Map.of("messageId", DynamoAttributeValue.fromString("message-007")))
     * .table(myTable)
     * .build();
     * ```
     */
    public inline fun dynamoGetItemProps(
        block: DynamoGetItemPropsDsl.() -> Unit = {}
    ): DynamoGetItemProps {
        val builder = DynamoGetItemPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A StepFunctions task to call DynamoPutItem.
     *
     * Example:
     * ```
     * Table myTable;
     * DynamoPutItem.Builder.create(this, "PutItem")
     * .item(Map.of(
     * "MessageId", DynamoAttributeValue.fromString("message-007"),
     * "Text", DynamoAttributeValue.fromString(JsonPath.stringAt("$.bar")),
     * "TotalCount", DynamoAttributeValue.fromNumber(10)))
     * .table(myTable)
     * .build();
     * ```
     */
    public inline fun dynamoPutItem(
        scope: Construct,
        id: String,
        block: DynamoPutItemDsl.() -> Unit = {},
    ): DynamoPutItem {
        val builder = DynamoPutItemDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for DynamoPutItem Task.
     *
     * Example:
     * ```
     * Table myTable;
     * DynamoPutItem.Builder.create(this, "PutItem")
     * .item(Map.of(
     * "MessageId", DynamoAttributeValue.fromString("message-007"),
     * "Text", DynamoAttributeValue.fromString(JsonPath.stringAt("$.bar")),
     * "TotalCount", DynamoAttributeValue.fromNumber(10)))
     * .table(myTable)
     * .build();
     * ```
     */
    public inline fun dynamoPutItemProps(
        block: DynamoPutItemPropsDsl.() -> Unit = {}
    ): DynamoPutItemProps {
        val builder = DynamoPutItemPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A StepFunctions task to call DynamoUpdateItem.
     *
     * Example:
     * ```
     * Table myTable;
     * DynamoUpdateItem.Builder.create(this, "UpdateItem")
     * .key(Map.of(
     * "MessageId", DynamoAttributeValue.fromString("message-007")))
     * .table(myTable)
     * .expressionAttributeValues(Map.of(
     * ":val", DynamoAttributeValue.numberFromString(JsonPath.stringAt("$.Item.TotalCount.N")),
     * ":rand", DynamoAttributeValue.fromNumber(20)))
     * .updateExpression("SET TotalCount = :val + :rand")
     * .build();
     * ```
     */
    public inline fun dynamoUpdateItem(
        scope: Construct,
        id: String,
        block: DynamoUpdateItemDsl.() -> Unit = {},
    ): DynamoUpdateItem {
        val builder = DynamoUpdateItemDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for DynamoUpdateItem Task.
     *
     * Example:
     * ```
     * Table myTable;
     * DynamoUpdateItem.Builder.create(this, "UpdateItem")
     * .key(Map.of(
     * "MessageId", DynamoAttributeValue.fromString("message-007")))
     * .table(myTable)
     * .expressionAttributeValues(Map.of(
     * ":val", DynamoAttributeValue.numberFromString(JsonPath.stringAt("$.Item.TotalCount.N")),
     * ":rand", DynamoAttributeValue.fromNumber(20)))
     * .updateExpression("SET TotalCount = :val + :rand")
     * .build();
     * ```
     */
    public inline fun dynamoUpdateItemProps(
        block: DynamoUpdateItemPropsDsl.() -> Unit = {}
    ): DynamoUpdateItemProps {
        val builder = DynamoUpdateItemPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Configuration for running an ECS task on EC2.
     *
     * Example:
     * ```
     * IVpc vpc = Vpc.fromLookup(this, "Vpc", VpcLookupOptions.builder()
     * .isDefault(true)
     * .build());
     * Cluster cluster = Cluster.Builder.create(this, "Ec2Cluster").vpc(vpc).build();
     * cluster.addCapacity("DefaultAutoScalingGroup", AddCapacityOptions.builder()
     * .instanceType(new InstanceType("t2.micro"))
     * .vpcSubnets(SubnetSelection.builder().subnetType(SubnetType.PUBLIC).build())
     * .build());
     * TaskDefinition taskDefinition = TaskDefinition.Builder.create(this, "TD")
     * .compatibility(Compatibility.EC2)
     * .build();
     * taskDefinition.addContainer("TheContainer", ContainerDefinitionOptions.builder()
     * .image(ContainerImage.fromRegistry("foo/bar"))
     * .memoryLimitMiB(256)
     * .build());
     * EcsRunTask runTask = EcsRunTask.Builder.create(this, "Run")
     * .integrationPattern(IntegrationPattern.RUN_JOB)
     * .cluster(cluster)
     * .taskDefinition(taskDefinition)
     * .launchTarget(EcsEc2LaunchTarget.Builder.create()
     * .placementStrategies(List.of(PlacementStrategy.spreadAcrossInstances(),
     * PlacementStrategy.packedByCpu(), PlacementStrategy.randomly()))
     * .placementConstraints(List.of(PlacementConstraint.memberOf("blieptuut")))
     * .build())
     * .propagatedTagSource(PropagatedTagSource.TASK_DEFINITION)
     * .build();
     * ```
     *
     * [Documentation](https://docs.aws.amazon.com/AmazonECS/latest/userguide/launch_types.html#launch-type-ec2)
     */
    public inline fun ecsEc2LaunchTarget(
        block: EcsEc2LaunchTargetDsl.() -> Unit = {}
    ): EcsEc2LaunchTarget {
        val builder = EcsEc2LaunchTargetDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Options to run an ECS task on EC2 in StepFunctions and ECS.
     *
     * Example:
     * ```
     * IVpc vpc = Vpc.fromLookup(this, "Vpc", VpcLookupOptions.builder()
     * .isDefault(true)
     * .build());
     * Cluster cluster = Cluster.Builder.create(this, "Ec2Cluster").vpc(vpc).build();
     * cluster.addCapacity("DefaultAutoScalingGroup", AddCapacityOptions.builder()
     * .instanceType(new InstanceType("t2.micro"))
     * .vpcSubnets(SubnetSelection.builder().subnetType(SubnetType.PUBLIC).build())
     * .build());
     * TaskDefinition taskDefinition = TaskDefinition.Builder.create(this, "TD")
     * .compatibility(Compatibility.EC2)
     * .build();
     * taskDefinition.addContainer("TheContainer", ContainerDefinitionOptions.builder()
     * .image(ContainerImage.fromRegistry("foo/bar"))
     * .memoryLimitMiB(256)
     * .build());
     * EcsRunTask runTask = EcsRunTask.Builder.create(this, "Run")
     * .integrationPattern(IntegrationPattern.RUN_JOB)
     * .cluster(cluster)
     * .taskDefinition(taskDefinition)
     * .launchTarget(EcsEc2LaunchTarget.Builder.create()
     * .placementStrategies(List.of(PlacementStrategy.spreadAcrossInstances(),
     * PlacementStrategy.packedByCpu(), PlacementStrategy.randomly()))
     * .placementConstraints(List.of(PlacementConstraint.memberOf("blieptuut")))
     * .build())
     * .propagatedTagSource(PropagatedTagSource.TASK_DEFINITION)
     * .build();
     * ```
     */
    public inline fun ecsEc2LaunchTargetOptions(
        block: EcsEc2LaunchTargetOptionsDsl.() -> Unit = {}
    ): EcsEc2LaunchTargetOptions {
        val builder = EcsEc2LaunchTargetOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Configuration for running an ECS task on Fargate.
     *
     * Example:
     * ```
     * IVpc vpc = Vpc.fromLookup(this, "Vpc", VpcLookupOptions.builder()
     * .isDefault(true)
     * .build());
     * Cluster cluster = Cluster.Builder.create(this, "FargateCluster").vpc(vpc).build();
     * TaskDefinition taskDefinition = TaskDefinition.Builder.create(this, "TD")
     * .memoryMiB("512")
     * .cpu("256")
     * .compatibility(Compatibility.FARGATE)
     * .build();
     * ContainerDefinition containerDefinition = taskDefinition.addContainer("TheContainer",
     * ContainerDefinitionOptions.builder()
     * .image(ContainerImage.fromRegistry("foo/bar"))
     * .memoryLimitMiB(256)
     * .build());
     * EcsRunTask runTask = EcsRunTask.Builder.create(this, "RunFargate")
     * .integrationPattern(IntegrationPattern.RUN_JOB)
     * .cluster(cluster)
     * .taskDefinition(taskDefinition)
     * .assignPublicIp(true)
     * .containerOverrides(List.of(ContainerOverride.builder()
     * .containerDefinition(containerDefinition)
     * .environment(List.of(TaskEnvironmentVariable.builder().name("SOME_KEY").value(JsonPath.stringAt("$.SomeKey")).build()))
     * .build()))
     * .launchTarget(new EcsFargateLaunchTarget())
     * .propagatedTagSource(PropagatedTagSource.TASK_DEFINITION)
     * .build();
     * ```
     *
     * [Documentation](https://docs.aws.amazon.com/AmazonECS/latest/userguide/launch_types.html#launch-type-fargate)
     */
    public inline fun ecsFargateLaunchTarget(
        block: EcsFargateLaunchTargetDsl.() -> Unit = {}
    ): EcsFargateLaunchTarget {
        val builder = EcsFargateLaunchTargetDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties to define an ECS service.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ecs.*;
     * import software.amazon.awscdk.services.stepfunctions.tasks.*;
     * EcsFargateLaunchTargetOptions ecsFargateLaunchTargetOptions =
     * EcsFargateLaunchTargetOptions.builder()
     * .platformVersion(FargatePlatformVersion.LATEST)
     * .build();
     * ```
     */
    public inline fun ecsFargateLaunchTargetOptions(
        block: EcsFargateLaunchTargetOptionsDsl.() -> Unit = {}
    ): EcsFargateLaunchTargetOptions {
        val builder = EcsFargateLaunchTargetOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Configuration options for the ECS launch type.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.stepfunctions.tasks.*;
     * Object parameters;
     * EcsLaunchTargetConfig ecsLaunchTargetConfig = EcsLaunchTargetConfig.builder()
     * .parameters(Map.of(
     * "parametersKey", parameters))
     * .build();
     * ```
     */
    public inline fun ecsLaunchTargetConfig(
        block: EcsLaunchTargetConfigDsl.() -> Unit = {}
    ): EcsLaunchTargetConfig {
        val builder = EcsLaunchTargetConfigDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Run a Task on ECS or Fargate.
     *
     * Example:
     * ```
     * IVpc vpc = Vpc.fromLookup(this, "Vpc", VpcLookupOptions.builder()
     * .isDefault(true)
     * .build());
     * Cluster cluster = Cluster.Builder.create(this, "Ec2Cluster").vpc(vpc).build();
     * cluster.addCapacity("DefaultAutoScalingGroup", AddCapacityOptions.builder()
     * .instanceType(new InstanceType("t2.micro"))
     * .vpcSubnets(SubnetSelection.builder().subnetType(SubnetType.PUBLIC).build())
     * .build());
     * TaskDefinition taskDefinition = TaskDefinition.Builder.create(this, "TD")
     * .compatibility(Compatibility.EC2)
     * .build();
     * taskDefinition.addContainer("TheContainer", ContainerDefinitionOptions.builder()
     * .image(ContainerImage.fromRegistry("foo/bar"))
     * .memoryLimitMiB(256)
     * .build());
     * EcsRunTask runTask = EcsRunTask.Builder.create(this, "Run")
     * .integrationPattern(IntegrationPattern.RUN_JOB)
     * .cluster(cluster)
     * .taskDefinition(taskDefinition)
     * .launchTarget(EcsEc2LaunchTarget.Builder.create()
     * .placementStrategies(List.of(PlacementStrategy.spreadAcrossInstances(),
     * PlacementStrategy.packedByCpu(), PlacementStrategy.randomly()))
     * .placementConstraints(List.of(PlacementConstraint.memberOf("blieptuut")))
     * .build())
     * .propagatedTagSource(PropagatedTagSource.TASK_DEFINITION)
     * .build();
     * ```
     */
    public inline fun ecsRunTask(
        scope: Construct,
        id: String,
        block: EcsRunTaskDsl.() -> Unit = {},
    ): EcsRunTask {
        val builder = EcsRunTaskDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for ECS Tasks.
     *
     * Example:
     * ```
     * IVpc vpc = Vpc.fromLookup(this, "Vpc", VpcLookupOptions.builder()
     * .isDefault(true)
     * .build());
     * Cluster cluster = Cluster.Builder.create(this, "Ec2Cluster").vpc(vpc).build();
     * cluster.addCapacity("DefaultAutoScalingGroup", AddCapacityOptions.builder()
     * .instanceType(new InstanceType("t2.micro"))
     * .vpcSubnets(SubnetSelection.builder().subnetType(SubnetType.PUBLIC).build())
     * .build());
     * TaskDefinition taskDefinition = TaskDefinition.Builder.create(this, "TD")
     * .compatibility(Compatibility.EC2)
     * .build();
     * taskDefinition.addContainer("TheContainer", ContainerDefinitionOptions.builder()
     * .image(ContainerImage.fromRegistry("foo/bar"))
     * .memoryLimitMiB(256)
     * .build());
     * EcsRunTask runTask = EcsRunTask.Builder.create(this, "Run")
     * .integrationPattern(IntegrationPattern.RUN_JOB)
     * .cluster(cluster)
     * .taskDefinition(taskDefinition)
     * .launchTarget(EcsEc2LaunchTarget.Builder.create()
     * .placementStrategies(List.of(PlacementStrategy.spreadAcrossInstances(),
     * PlacementStrategy.packedByCpu(), PlacementStrategy.randomly()))
     * .placementConstraints(List.of(PlacementConstraint.memberOf("blieptuut")))
     * .build())
     * .propagatedTagSource(PropagatedTagSource.TASK_DEFINITION)
     * .build();
     * ```
     */
    public inline fun ecsRunTaskProps(block: EcsRunTaskPropsDsl.() -> Unit = {}): EcsRunTaskProps {
        val builder = EcsRunTaskPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Call a EKS endpoint as a Task.
     *
     * Example:
     * ```
     * import software.amazon.awscdk.services.eks.*;
     * Cluster myEksCluster = Cluster.Builder.create(this, "my sample cluster")
     * .version(KubernetesVersion.V1_18)
     * .clusterName("myEksCluster")
     * .build();
     * EksCall.Builder.create(this, "Call a EKS Endpoint")
     * .cluster(myEksCluster)
     * .httpMethod(HttpMethods.GET)
     * .httpPath("/api/v1/namespaces/default/pods")
     * .build();
     * ```
     *
     * [Documentation](https://docs.aws.amazon.com/step-functions/latest/dg/connect-eks.html)
     */
    public inline fun eksCall(
        scope: Construct,
        id: String,
        block: EksCallDsl.() -> Unit = {},
    ): EksCall {
        val builder = EksCallDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for calling a EKS endpoint with EksCall.
     *
     * Example:
     * ```
     * import software.amazon.awscdk.services.eks.*;
     * Cluster myEksCluster = Cluster.Builder.create(this, "my sample cluster")
     * .version(KubernetesVersion.V1_18)
     * .clusterName("myEksCluster")
     * .build();
     * EksCall.Builder.create(this, "Call a EKS Endpoint")
     * .cluster(myEksCluster)
     * .httpMethod(HttpMethods.GET)
     * .httpPath("/api/v1/namespaces/default/pods")
     * .build();
     * ```
     */
    public inline fun eksCallProps(block: EksCallPropsDsl.() -> Unit = {}): EksCallProps {
        val builder = EksCallPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A Step Functions Task to add a Step to an EMR Cluster.
     *
     * The StepConfiguration is defined as Parameters in the state machine definition.
     *
     * OUTPUT: the StepId
     *
     * Example:
     * ```
     * EmrAddStep.Builder.create(this, "Task")
     * .clusterId("ClusterId")
     * .name("StepName")
     * .jar("Jar")
     * .actionOnFailure(ActionOnFailure.CONTINUE)
     * .build();
     * ```
     */
    public inline fun emrAddStep(
        scope: Construct,
        id: String,
        block: EmrAddStepDsl.() -> Unit = {},
    ): EmrAddStep {
        val builder = EmrAddStepDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for EmrAddStep.
     *
     * Example:
     * ```
     * EmrAddStep.Builder.create(this, "Task")
     * .clusterId("ClusterId")
     * .name("StepName")
     * .jar("Jar")
     * .actionOnFailure(ActionOnFailure.CONTINUE)
     * .build();
     * ```
     */
    public inline fun emrAddStepProps(block: EmrAddStepPropsDsl.() -> Unit = {}): EmrAddStepProps {
        val builder = EmrAddStepPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A Step Functions Task to to cancel a Step on an EMR Cluster.
     *
     * Example:
     * ```
     * EmrCancelStep.Builder.create(this, "Task")
     * .clusterId("ClusterId")
     * .stepId("StepId")
     * .build();
     * ```
     */
    public inline fun emrCancelStep(
        scope: Construct,
        id: String,
        block: EmrCancelStepDsl.() -> Unit = {},
    ): EmrCancelStep {
        val builder = EmrCancelStepDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for EmrCancelStep.
     *
     * Example:
     * ```
     * EmrCancelStep.Builder.create(this, "Task")
     * .clusterId("ClusterId")
     * .stepId("StepId")
     * .build();
     * ```
     */
    public inline fun emrCancelStepProps(
        block: EmrCancelStepPropsDsl.() -> Unit = {}
    ): EmrCancelStepProps {
        val builder = EmrCancelStepPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Task that creates an EMR Containers virtual cluster from an EKS cluster.
     *
     * Example:
     * ```
     * EmrContainersCreateVirtualCluster.Builder.create(this, "Create a Virtual Cluster")
     * .eksCluster(EksClusterInput.fromTaskInput(TaskInput.fromText("clusterId")))
     * .eksNamespace("specified-namespace")
     * .build();
     * ```
     *
     * [Documentation](https://docs.aws.amazon.com/step-functions/latest/dg/connect-emr-eks.html)
     */
    public inline fun emrContainersCreateVirtualCluster(
        scope: Construct,
        id: String,
        block: EmrContainersCreateVirtualClusterDsl.() -> Unit = {},
    ): EmrContainersCreateVirtualCluster {
        val builder = EmrContainersCreateVirtualClusterDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties to define a EMR Containers CreateVirtualCluster Task on an EKS cluster.
     *
     * Example:
     * ```
     * EmrContainersCreateVirtualCluster.Builder.create(this, "Create a Virtual Cluster")
     * .eksCluster(EksClusterInput.fromTaskInput(TaskInput.fromText("clusterId")))
     * .eksNamespace("specified-namespace")
     * .build();
     * ```
     */
    public inline fun emrContainersCreateVirtualClusterProps(
        block: EmrContainersCreateVirtualClusterPropsDsl.() -> Unit = {}
    ): EmrContainersCreateVirtualClusterProps {
        val builder = EmrContainersCreateVirtualClusterPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Deletes an EMR Containers virtual cluster as a Task.
     *
     * Example:
     * ```
     * EmrContainersDeleteVirtualCluster.Builder.create(this, "Delete a Virtual Cluster")
     * .virtualClusterId(TaskInput.fromJsonPathAt("$.virtualCluster"))
     * .build();
     * ```
     *
     * [Documentation](https://docs.amazonaws.cn/en_us/step-functions/latest/dg/connect-emr-eks.html)
     */
    public inline fun emrContainersDeleteVirtualCluster(
        scope: Construct,
        id: String,
        block: EmrContainersDeleteVirtualClusterDsl.() -> Unit = {},
    ): EmrContainersDeleteVirtualCluster {
        val builder = EmrContainersDeleteVirtualClusterDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties to define a EMR Containers DeleteVirtualCluster Task.
     *
     * Example:
     * ```
     * EmrContainersDeleteVirtualCluster.Builder.create(this, "Delete a Virtual Cluster")
     * .virtualClusterId(TaskInput.fromJsonPathAt("$.virtualCluster"))
     * .build();
     * ```
     */
    public inline fun emrContainersDeleteVirtualClusterProps(
        block: EmrContainersDeleteVirtualClusterPropsDsl.() -> Unit = {}
    ): EmrContainersDeleteVirtualClusterProps {
        val builder = EmrContainersDeleteVirtualClusterPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Starts a job run.
     *
     * A job is a unit of work that you submit to Amazon EMR on EKS for execution. The work
     * performed by the job can be defined by a Spark jar, PySpark script, or SparkSQL query. A job
     * run is an execution of the job on the virtual cluster.
     *
     * Example:
     * ```
     * EmrContainersStartJobRun.Builder.create(this, "EMR Containers Start Job Run")
     * .virtualCluster(VirtualClusterInput.fromVirtualClusterId("de92jdei2910fwedz"))
     * .releaseLabel(ReleaseLabel.EMR_6_2_0)
     * .jobName("EMR-Containers-Job")
     * .jobDriver(JobDriver.builder()
     * .sparkSubmitJobDriver(SparkSubmitJobDriver.builder()
     * .entryPoint(TaskInput.fromText("local:///usr/lib/spark/examples/src/main/python/pi.py"))
     * .build())
     * .build())
     * .applicationConfig(List.of(ApplicationConfiguration.builder()
     * .classification(Classification.SPARK_DEFAULTS)
     * .properties(Map.of(
     * "spark.executor.instances", "1",
     * "spark.executor.memory", "512M"))
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](https://docs.aws.amazon.com/step-functions/latest/dg/connect-emr-eks.html)
     */
    public inline fun emrContainersStartJobRun(
        scope: Construct,
        id: String,
        block: EmrContainersStartJobRunDsl.() -> Unit = {},
    ): EmrContainersStartJobRun {
        val builder = EmrContainersStartJobRunDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * The props for a EMR Containers StartJobRun Task.
     *
     * Example:
     * ```
     * EmrContainersStartJobRun.Builder.create(this, "EMR Containers Start Job Run")
     * .virtualCluster(VirtualClusterInput.fromVirtualClusterId("de92jdei2910fwedz"))
     * .releaseLabel(ReleaseLabel.EMR_6_2_0)
     * .jobName("EMR-Containers-Job")
     * .jobDriver(JobDriver.builder()
     * .sparkSubmitJobDriver(SparkSubmitJobDriver.builder()
     * .entryPoint(TaskInput.fromText("local:///usr/lib/spark/examples/src/main/python/pi.py"))
     * .build())
     * .build())
     * .applicationConfig(List.of(ApplicationConfiguration.builder()
     * .classification(Classification.SPARK_DEFAULTS)
     * .properties(Map.of(
     * "spark.executor.instances", "1",
     * "spark.executor.memory", "512M"))
     * .build()))
     * .build();
     * ```
     */
    public inline fun emrContainersStartJobRunProps(
        block: EmrContainersStartJobRunPropsDsl.() -> Unit = {}
    ): EmrContainersStartJobRunProps {
        val builder = EmrContainersStartJobRunPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A Step Functions Task to create an EMR Cluster.
     *
     * The ClusterConfiguration is defined as Parameters in the state machine definition.
     *
     * OUTPUT: the ClusterId.
     *
     * Example:
     * ```
     * Role clusterRole = Role.Builder.create(this, "ClusterRole")
     * .assumedBy(new ServicePrincipal("ec2.amazonaws.com"))
     * .build();
     * Role serviceRole = Role.Builder.create(this, "ServiceRole")
     * .assumedBy(new ServicePrincipal("elasticmapreduce.amazonaws.com"))
     * .build();
     * Role autoScalingRole = Role.Builder.create(this, "AutoScalingRole")
     * .assumedBy(new ServicePrincipal("elasticmapreduce.amazonaws.com"))
     * .build();
     * autoScalingRole.assumeRolePolicy.addStatements(
     * PolicyStatement.Builder.create()
     * .effect(Effect.ALLOW)
     * .principals(List.of(
     * new ServicePrincipal("application-autoscaling.amazonaws.com")))
     * .actions(List.of("sts:AssumeRole"))
     * .build());
     * EmrCreateCluster.Builder.create(this, "Create Cluster")
     * .instances(InstancesConfigProperty.builder().build())
     * .clusterRole(clusterRole)
     * .name(TaskInput.fromJsonPathAt("$.ClusterName").getValue())
     * .serviceRole(serviceRole)
     * .autoScalingRole(autoScalingRole)
     * .build();
     * ```
     */
    public inline fun emrCreateCluster(
        scope: Construct,
        id: String,
        block: EmrCreateClusterDsl.() -> Unit = {},
    ): EmrCreateCluster {
        val builder = EmrCreateClusterDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for the EMR Cluster Applications.
     *
     * Applies to Amazon EMR releases 4.0 and later. A case-insensitive list of applications for
     * Amazon EMR to install and configure when launching the cluster.
     *
     * See the RunJobFlow API for complete documentation on input parameters
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.stepfunctions.tasks.*;
     * ApplicationConfigProperty applicationConfigProperty = ApplicationConfigProperty.builder()
     * .name("name")
     * // the properties below are optional
     * .additionalInfo(Map.of(
     * "additionalInfoKey", "additionalInfo"))
     * .args(List.of("args"))
     * .version("version")
     * .build();
     * ```
     *
     * [Documentation](https://docs.aws.amazon.com/emr/latest/APIReference/API_Application.html)
     */
    public inline fun emrCreateClusterApplicationConfigProperty(
        block: EmrCreateClusterApplicationConfigPropertyDsl.() -> Unit = {}
    ): EmrCreateCluster.ApplicationConfigProperty {
        val builder = EmrCreateClusterApplicationConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * An automatic scaling policy for a core instance group or task instance group in an Amazon EMR
     * cluster.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.*;
     * import software.amazon.awscdk.services.stepfunctions.tasks.*;
     * AutoScalingPolicyProperty autoScalingPolicyProperty = AutoScalingPolicyProperty.builder()
     * .constraints(ScalingConstraintsProperty.builder()
     * .maxCapacity(123)
     * .minCapacity(123)
     * .build())
     * .rules(List.of(ScalingRuleProperty.builder()
     * .action(ScalingActionProperty.builder()
     * .simpleScalingPolicyConfiguration(SimpleScalingPolicyConfigurationProperty.builder()
     * .scalingAdjustment(123)
     * // the properties below are optional
     * .adjustmentType(EmrCreateCluster.getScalingAdjustmentType().CHANGE_IN_CAPACITY)
     * .coolDown(123)
     * .build())
     * // the properties below are optional
     * .market(EmrCreateCluster.getInstanceMarket().ON_DEMAND)
     * .build())
     * .name("name")
     * .trigger(ScalingTriggerProperty.builder()
     * .cloudWatchAlarmDefinition(CloudWatchAlarmDefinitionProperty.builder()
     * .comparisonOperator(EmrCreateCluster.getCloudWatchAlarmComparisonOperator().GREATER_THAN_OR_EQUAL)
     * .metricName("metricName")
     * .period(Duration.minutes(30))
     * // the properties below are optional
     * .dimensions(List.of(MetricDimensionProperty.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .evaluationPeriods(123)
     * .namespace("namespace")
     * .statistic(EmrCreateCluster.getCloudWatchAlarmStatistic().SAMPLE_COUNT)
     * .threshold(123)
     * .unit(EmrCreateCluster.getCloudWatchAlarmUnit().NONE)
     * .build())
     * .build())
     * // the properties below are optional
     * .description("description")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](https://docs.aws.amazon.com/emr/latest/APIReference/API_AutoScalingPolicy.html)
     */
    public inline fun emrCreateClusterAutoScalingPolicyProperty(
        block: EmrCreateClusterAutoScalingPolicyPropertyDsl.() -> Unit = {}
    ): EmrCreateCluster.AutoScalingPolicyProperty {
        val builder = EmrCreateClusterAutoScalingPolicyPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Configuration of a bootstrap action.
     *
     * See the RunJobFlow API for complete documentation on input parameters
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.stepfunctions.tasks.*;
     * BootstrapActionConfigProperty bootstrapActionConfigProperty =
     * BootstrapActionConfigProperty.builder()
     * .name("name")
     * .scriptBootstrapAction(ScriptBootstrapActionConfigProperty.builder()
     * .path("path")
     * // the properties below are optional
     * .args(List.of("args"))
     * .build())
     * .build();
     * ```
     *
     * [Documentation](https://docs.aws.amazon.com/emr/latest/APIReference/API_BootstrapActionConfig.html)
     */
    public inline fun emrCreateClusterBootstrapActionConfigProperty(
        block: EmrCreateClusterBootstrapActionConfigPropertyDsl.() -> Unit = {}
    ): EmrCreateCluster.BootstrapActionConfigProperty {
        val builder = EmrCreateClusterBootstrapActionConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The definition of a CloudWatch metric alarm, which determines when an automatic scaling
     * activity is triggered.
     *
     * When the defined alarm conditions are satisfied, scaling activity begins.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.*;
     * import software.amazon.awscdk.services.stepfunctions.tasks.*;
     * CloudWatchAlarmDefinitionProperty cloudWatchAlarmDefinitionProperty =
     * CloudWatchAlarmDefinitionProperty.builder()
     * .comparisonOperator(EmrCreateCluster.getCloudWatchAlarmComparisonOperator().GREATER_THAN_OR_EQUAL)
     * .metricName("metricName")
     * .period(Duration.minutes(30))
     * // the properties below are optional
     * .dimensions(List.of(MetricDimensionProperty.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .evaluationPeriods(123)
     * .namespace("namespace")
     * .statistic(EmrCreateCluster.getCloudWatchAlarmStatistic().SAMPLE_COUNT)
     * .threshold(123)
     * .unit(EmrCreateCluster.getCloudWatchAlarmUnit().NONE)
     * .build();
     * ```
     *
     * [Documentation](https://docs.aws.amazon.com/emr/latest/APIReference/API_CloudWatchAlarmDefinition.html)
     */
    public inline fun emrCreateClusterCloudWatchAlarmDefinitionProperty(
        block: EmrCreateClusterCloudWatchAlarmDefinitionPropertyDsl.() -> Unit = {}
    ): EmrCreateCluster.CloudWatchAlarmDefinitionProperty {
        val builder = EmrCreateClusterCloudWatchAlarmDefinitionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * An optional configuration specification to be used when provisioning cluster instances, which
     * can include configurations for applications and software bundled with Amazon EMR.
     *
     * See the RunJobFlow API for complete documentation on input parameters
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.stepfunctions.tasks.*;
     * ConfigurationProperty configurationProperty_;
     * ConfigurationProperty configurationProperty = ConfigurationProperty.builder()
     * .classification("classification")
     * .configurations(List.of(configurationProperty_))
     * .properties(Map.of(
     * "propertiesKey", "properties"))
     * .build();
     * ```
     *
     * [Documentation](https://docs.aws.amazon.com/emr/latest/APIReference/API_Configuration.html)
     */
    public inline fun emrCreateClusterConfigurationProperty(
        block: EmrCreateClusterConfigurationPropertyDsl.() -> Unit = {}
    ): EmrCreateCluster.ConfigurationProperty {
        val builder = EmrCreateClusterConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Configuration of requested EBS block device associated with the instance group with count of
     * volumes that will be associated to every instance.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.*;
     * import software.amazon.awscdk.services.stepfunctions.tasks.*;
     * Size size;
     * EbsBlockDeviceConfigProperty ebsBlockDeviceConfigProperty =
     * EbsBlockDeviceConfigProperty.builder()
     * .volumeSpecification(VolumeSpecificationProperty.builder()
     * .volumeSize(size)
     * .volumeType(EmrCreateCluster.getEbsBlockDeviceVolumeType().GP2)
     * // the properties below are optional
     * .iops(123)
     * .build())
     * // the properties below are optional
     * .volumesPerInstance(123)
     * .build();
     * ```
     *
     * [Documentation](https://docs.aws.amazon.com/emr/latest/APIReference/API_EbsBlockDeviceConfig.html)
     */
    public inline fun emrCreateClusterEbsBlockDeviceConfigProperty(
        block: EmrCreateClusterEbsBlockDeviceConfigPropertyDsl.() -> Unit = {}
    ): EmrCreateCluster.EbsBlockDeviceConfigProperty {
        val builder = EmrCreateClusterEbsBlockDeviceConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The Amazon EBS configuration of a cluster instance.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.*;
     * import software.amazon.awscdk.services.stepfunctions.tasks.*;
     * Size size;
     * EbsConfigurationProperty ebsConfigurationProperty = EbsConfigurationProperty.builder()
     * .ebsBlockDeviceConfigs(List.of(EbsBlockDeviceConfigProperty.builder()
     * .volumeSpecification(VolumeSpecificationProperty.builder()
     * .volumeSize(size)
     * .volumeType(EmrCreateCluster.getEbsBlockDeviceVolumeType().GP2)
     * // the properties below are optional
     * .iops(123)
     * .build())
     * // the properties below are optional
     * .volumesPerInstance(123)
     * .build()))
     * .ebsOptimized(false)
     * .build();
     * ```
     *
     * [Documentation](https://docs.aws.amazon.com/emr/latest/APIReference/API_EbsConfiguration.html)
     */
    public inline fun emrCreateClusterEbsConfigurationProperty(
        block: EmrCreateClusterEbsConfigurationPropertyDsl.() -> Unit = {}
    ): EmrCreateCluster.EbsConfigurationProperty {
        val builder = EmrCreateClusterEbsConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The configuration that defines an instance fleet.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.*;
     * import software.amazon.awscdk.services.stepfunctions.tasks.*;
     * ConfigurationProperty configurationProperty_;
     * Size size;
     * InstanceFleetConfigProperty instanceFleetConfigProperty = InstanceFleetConfigProperty.builder()
     * .instanceFleetType(EmrCreateCluster.getInstanceRoleType().MASTER)
     * // the properties below are optional
     * .instanceTypeConfigs(List.of(InstanceTypeConfigProperty.builder()
     * .instanceType("instanceType")
     * // the properties below are optional
     * .bidPrice("bidPrice")
     * .bidPriceAsPercentageOfOnDemandPrice(123)
     * .configurations(List.of(ConfigurationProperty.builder()
     * .classification("classification")
     * .configurations(List.of(configurationProperty_))
     * .properties(Map.of(
     * "propertiesKey", "properties"))
     * .build()))
     * .ebsConfiguration(EbsConfigurationProperty.builder()
     * .ebsBlockDeviceConfigs(List.of(EbsBlockDeviceConfigProperty.builder()
     * .volumeSpecification(VolumeSpecificationProperty.builder()
     * .volumeSize(size)
     * .volumeType(EmrCreateCluster.getEbsBlockDeviceVolumeType().GP2)
     * // the properties below are optional
     * .iops(123)
     * .build())
     * // the properties below are optional
     * .volumesPerInstance(123)
     * .build()))
     * .ebsOptimized(false)
     * .build())
     * .weightedCapacity(123)
     * .build()))
     * .launchSpecifications(InstanceFleetProvisioningSpecificationsProperty.builder()
     * .spotSpecification(SpotProvisioningSpecificationProperty.builder()
     * .timeoutAction(EmrCreateCluster.getSpotTimeoutAction().SWITCH_TO_ON_DEMAND)
     * .timeoutDurationMinutes(123)
     * // the properties below are optional
     * .allocationStrategy(EmrCreateCluster.getSpotAllocationStrategy().CAPACITY_OPTIMIZED)
     * .blockDurationMinutes(123)
     * .build())
     * .build())
     * .name("name")
     * .targetOnDemandCapacity(123)
     * .targetSpotCapacity(123)
     * .build();
     * ```
     *
     * [Documentation](https://docs.aws.amazon.com/emr/latest/APIReference/API_InstanceFleetConfig.html)
     */
    public inline fun emrCreateClusterInstanceFleetConfigProperty(
        block: EmrCreateClusterInstanceFleetConfigPropertyDsl.() -> Unit = {}
    ): EmrCreateCluster.InstanceFleetConfigProperty {
        val builder = EmrCreateClusterInstanceFleetConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The launch specification for Spot instances in the fleet, which determines the defined
     * duration and provisioning timeout behavior.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.stepfunctions.tasks.*;
     * InstanceFleetProvisioningSpecificationsProperty instanceFleetProvisioningSpecificationsProperty
     * = InstanceFleetProvisioningSpecificationsProperty.builder()
     * .spotSpecification(SpotProvisioningSpecificationProperty.builder()
     * .timeoutAction(EmrCreateCluster.getSpotTimeoutAction().SWITCH_TO_ON_DEMAND)
     * .timeoutDurationMinutes(123)
     * // the properties below are optional
     * .allocationStrategy(EmrCreateCluster.getSpotAllocationStrategy().CAPACITY_OPTIMIZED)
     * .blockDurationMinutes(123)
     * .build())
     * .build();
     * ```
     *
     * [Documentation](https://docs.aws.amazon.com/emr/latest/APIReference/API_InstanceFleetProvisioningSpecifications.html)
     */
    public inline fun emrCreateClusterInstanceFleetProvisioningSpecificationsProperty(
        block: EmrCreateClusterInstanceFleetProvisioningSpecificationsPropertyDsl.() -> Unit = {}
    ): EmrCreateCluster.InstanceFleetProvisioningSpecificationsProperty {
        val builder = EmrCreateClusterInstanceFleetProvisioningSpecificationsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Configuration defining a new instance group.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.*;
     * import software.amazon.awscdk.services.stepfunctions.tasks.*;
     * ConfigurationProperty configurationProperty_;
     * Size size;
     * InstanceGroupConfigProperty instanceGroupConfigProperty = InstanceGroupConfigProperty.builder()
     * .instanceCount(123)
     * .instanceRole(EmrCreateCluster.getInstanceRoleType().MASTER)
     * .instanceType("instanceType")
     * // the properties below are optional
     * .autoScalingPolicy(AutoScalingPolicyProperty.builder()
     * .constraints(ScalingConstraintsProperty.builder()
     * .maxCapacity(123)
     * .minCapacity(123)
     * .build())
     * .rules(List.of(ScalingRuleProperty.builder()
     * .action(ScalingActionProperty.builder()
     * .simpleScalingPolicyConfiguration(SimpleScalingPolicyConfigurationProperty.builder()
     * .scalingAdjustment(123)
     * // the properties below are optional
     * .adjustmentType(EmrCreateCluster.getScalingAdjustmentType().CHANGE_IN_CAPACITY)
     * .coolDown(123)
     * .build())
     * // the properties below are optional
     * .market(EmrCreateCluster.getInstanceMarket().ON_DEMAND)
     * .build())
     * .name("name")
     * .trigger(ScalingTriggerProperty.builder()
     * .cloudWatchAlarmDefinition(CloudWatchAlarmDefinitionProperty.builder()
     * .comparisonOperator(EmrCreateCluster.getCloudWatchAlarmComparisonOperator().GREATER_THAN_OR_EQUAL)
     * .metricName("metricName")
     * .period(Duration.minutes(30))
     * // the properties below are optional
     * .dimensions(List.of(MetricDimensionProperty.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .evaluationPeriods(123)
     * .namespace("namespace")
     * .statistic(EmrCreateCluster.getCloudWatchAlarmStatistic().SAMPLE_COUNT)
     * .threshold(123)
     * .unit(EmrCreateCluster.getCloudWatchAlarmUnit().NONE)
     * .build())
     * .build())
     * // the properties below are optional
     * .description("description")
     * .build()))
     * .build())
     * .bidPrice("bidPrice")
     * .configurations(List.of(ConfigurationProperty.builder()
     * .classification("classification")
     * .configurations(List.of(configurationProperty_))
     * .properties(Map.of(
     * "propertiesKey", "properties"))
     * .build()))
     * .ebsConfiguration(EbsConfigurationProperty.builder()
     * .ebsBlockDeviceConfigs(List.of(EbsBlockDeviceConfigProperty.builder()
     * .volumeSpecification(VolumeSpecificationProperty.builder()
     * .volumeSize(size)
     * .volumeType(EmrCreateCluster.getEbsBlockDeviceVolumeType().GP2)
     * // the properties below are optional
     * .iops(123)
     * .build())
     * // the properties below are optional
     * .volumesPerInstance(123)
     * .build()))
     * .ebsOptimized(false)
     * .build())
     * .market(EmrCreateCluster.getInstanceMarket().ON_DEMAND)
     * .name("name")
     * .build();
     * ```
     *
     * [Documentation](https://docs.aws.amazon.com/emr/latest/APIReference/API_InstanceGroupConfig.html)
     */
    public inline fun emrCreateClusterInstanceGroupConfigProperty(
        block: EmrCreateClusterInstanceGroupConfigPropertyDsl.() -> Unit = {}
    ): EmrCreateCluster.InstanceGroupConfigProperty {
        val builder = EmrCreateClusterInstanceGroupConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * An instance type configuration for each instance type in an instance fleet, which determines
     * the EC2 instances Amazon EMR attempts to provision to fulfill On-Demand and Spot target
     * capacities.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.*;
     * import software.amazon.awscdk.services.stepfunctions.tasks.*;
     * ConfigurationProperty configurationProperty_;
     * Size size;
     * InstanceTypeConfigProperty instanceTypeConfigProperty = InstanceTypeConfigProperty.builder()
     * .instanceType("instanceType")
     * // the properties below are optional
     * .bidPrice("bidPrice")
     * .bidPriceAsPercentageOfOnDemandPrice(123)
     * .configurations(List.of(ConfigurationProperty.builder()
     * .classification("classification")
     * .configurations(List.of(configurationProperty_))
     * .properties(Map.of(
     * "propertiesKey", "properties"))
     * .build()))
     * .ebsConfiguration(EbsConfigurationProperty.builder()
     * .ebsBlockDeviceConfigs(List.of(EbsBlockDeviceConfigProperty.builder()
     * .volumeSpecification(VolumeSpecificationProperty.builder()
     * .volumeSize(size)
     * .volumeType(EmrCreateCluster.getEbsBlockDeviceVolumeType().GP2)
     * // the properties below are optional
     * .iops(123)
     * .build())
     * // the properties below are optional
     * .volumesPerInstance(123)
     * .build()))
     * .ebsOptimized(false)
     * .build())
     * .weightedCapacity(123)
     * .build();
     * ```
     *
     * [Documentation](https://docs.aws.amazon.com/emr/latest/APIReference/API_InstanceTypeConfig.html)
     */
    public inline fun emrCreateClusterInstanceTypeConfigProperty(
        block: EmrCreateClusterInstanceTypeConfigPropertyDsl.() -> Unit = {}
    ): EmrCreateCluster.InstanceTypeConfigProperty {
        val builder = EmrCreateClusterInstanceTypeConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A specification of the number and type of Amazon EC2 instances.
     *
     * See the RunJobFlow API for complete documentation on input parameters
     *
     * Example:
     * ```
     * Role clusterRole = Role.Builder.create(this, "ClusterRole")
     * .assumedBy(new ServicePrincipal("ec2.amazonaws.com"))
     * .build();
     * Role serviceRole = Role.Builder.create(this, "ServiceRole")
     * .assumedBy(new ServicePrincipal("elasticmapreduce.amazonaws.com"))
     * .build();
     * Role autoScalingRole = Role.Builder.create(this, "AutoScalingRole")
     * .assumedBy(new ServicePrincipal("elasticmapreduce.amazonaws.com"))
     * .build();
     * autoScalingRole.assumeRolePolicy.addStatements(
     * PolicyStatement.Builder.create()
     * .effect(Effect.ALLOW)
     * .principals(List.of(
     * new ServicePrincipal("application-autoscaling.amazonaws.com")))
     * .actions(List.of("sts:AssumeRole"))
     * .build());
     * EmrCreateCluster.Builder.create(this, "Create Cluster")
     * .instances(InstancesConfigProperty.builder().build())
     * .clusterRole(clusterRole)
     * .name(TaskInput.fromJsonPathAt("$.ClusterName").getValue())
     * .serviceRole(serviceRole)
     * .autoScalingRole(autoScalingRole)
     * .build();
     * ```
     *
     * [Documentation](https://docs.aws.amazon.com/emr/latest/APIReference/API_JobFlowInstancesConfig.html)
     */
    public inline fun emrCreateClusterInstancesConfigProperty(
        block: EmrCreateClusterInstancesConfigPropertyDsl.() -> Unit = {}
    ): EmrCreateCluster.InstancesConfigProperty {
        val builder = EmrCreateClusterInstancesConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Attributes for Kerberos configuration when Kerberos authentication is enabled using a
     * security configuration.
     *
     * See the RunJobFlow API for complete documentation on input parameters
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.stepfunctions.tasks.*;
     * KerberosAttributesProperty kerberosAttributesProperty = KerberosAttributesProperty.builder()
     * .realm("realm")
     * // the properties below are optional
     * .adDomainJoinPassword("adDomainJoinPassword")
     * .adDomainJoinUser("adDomainJoinUser")
     * .crossRealmTrustPrincipalPassword("crossRealmTrustPrincipalPassword")
     * .kdcAdminPassword("kdcAdminPassword")
     * .build();
     * ```
     *
     * [Documentation](https://docs.aws.amazon.com/emr/latest/APIReference/API_KerberosAttributes.html)
     */
    public inline fun emrCreateClusterKerberosAttributesProperty(
        block: EmrCreateClusterKerberosAttributesPropertyDsl.() -> Unit = {}
    ): EmrCreateCluster.KerberosAttributesProperty {
        val builder = EmrCreateClusterKerberosAttributesPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A CloudWatch dimension, which is specified using a Key (known as a Name in CloudWatch), Value
     * pair.
     *
     * By default, Amazon EMR uses one dimension whose Key is JobFlowID and Value is a variable
     * representing the cluster ID, which is ${emr.clusterId}. This enables the rule to bootstrap
     * when the cluster ID becomes available
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.stepfunctions.tasks.*;
     * MetricDimensionProperty metricDimensionProperty = MetricDimensionProperty.builder()
     * .key("key")
     * .value("value")
     * .build();
     * ```
     *
     * [Documentation](https://docs.aws.amazon.com/emr/latest/APIReference/API_MetricDimension.html)
     */
    public inline fun emrCreateClusterMetricDimensionProperty(
        block: EmrCreateClusterMetricDimensionPropertyDsl.() -> Unit = {}
    ): EmrCreateCluster.MetricDimensionProperty {
        val builder = EmrCreateClusterMetricDimensionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The Amazon EC2 Availability Zone configuration of the cluster (job flow).
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.stepfunctions.tasks.*;
     * PlacementTypeProperty placementTypeProperty = PlacementTypeProperty.builder()
     * .availabilityZone("availabilityZone")
     * .availabilityZones(List.of("availabilityZones"))
     * .build();
     * ```
     *
     * [Documentation](https://docs.aws.amazon.com/emr/latest/APIReference/API_PlacementType.html)
     */
    public inline fun emrCreateClusterPlacementTypeProperty(
        block: EmrCreateClusterPlacementTypePropertyDsl.() -> Unit = {}
    ): EmrCreateCluster.PlacementTypeProperty {
        val builder = EmrCreateClusterPlacementTypePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for EmrCreateCluster.
     *
     * See the RunJobFlow API for complete documentation on input parameters
     *
     * Example:
     * ```
     * Role clusterRole = Role.Builder.create(this, "ClusterRole")
     * .assumedBy(new ServicePrincipal("ec2.amazonaws.com"))
     * .build();
     * Role serviceRole = Role.Builder.create(this, "ServiceRole")
     * .assumedBy(new ServicePrincipal("elasticmapreduce.amazonaws.com"))
     * .build();
     * Role autoScalingRole = Role.Builder.create(this, "AutoScalingRole")
     * .assumedBy(new ServicePrincipal("elasticmapreduce.amazonaws.com"))
     * .build();
     * autoScalingRole.assumeRolePolicy.addStatements(
     * PolicyStatement.Builder.create()
     * .effect(Effect.ALLOW)
     * .principals(List.of(
     * new ServicePrincipal("application-autoscaling.amazonaws.com")))
     * .actions(List.of("sts:AssumeRole"))
     * .build());
     * EmrCreateCluster.Builder.create(this, "Create Cluster")
     * .instances(InstancesConfigProperty.builder().build())
     * .clusterRole(clusterRole)
     * .name(TaskInput.fromJsonPathAt("$.ClusterName").getValue())
     * .serviceRole(serviceRole)
     * .autoScalingRole(autoScalingRole)
     * .build();
     * ```
     *
     * [Documentation](https://docs.aws.amazon.com/emr/latest/APIReference/API_RunJobFlow.html)
     */
    public inline fun emrCreateClusterProps(
        block: EmrCreateClusterPropsDsl.() -> Unit = {}
    ): EmrCreateClusterProps {
        val builder = EmrCreateClusterPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The type of adjustment the automatic scaling activity makes when triggered, and the
     * periodicity of the adjustment.
     *
     * And an automatic scaling configuration, which describes how the policy adds or removes
     * instances, the cooldown period, and the number of EC2 instances that will be added each time
     * the CloudWatch metric alarm condition is satisfied.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.stepfunctions.tasks.*;
     * ScalingActionProperty scalingActionProperty = ScalingActionProperty.builder()
     * .simpleScalingPolicyConfiguration(SimpleScalingPolicyConfigurationProperty.builder()
     * .scalingAdjustment(123)
     * // the properties below are optional
     * .adjustmentType(EmrCreateCluster.getScalingAdjustmentType().CHANGE_IN_CAPACITY)
     * .coolDown(123)
     * .build())
     * // the properties below are optional
     * .market(EmrCreateCluster.getInstanceMarket().ON_DEMAND)
     * .build();
     * ```
     *
     * [Documentation](https://docs.aws.amazon.com/emr/latest/APIReference/API_ScalingAction.html)
     */
    public inline fun emrCreateClusterScalingActionProperty(
        block: EmrCreateClusterScalingActionPropertyDsl.() -> Unit = {}
    ): EmrCreateCluster.ScalingActionProperty {
        val builder = EmrCreateClusterScalingActionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The upper and lower EC2 instance limits for an automatic scaling policy.
     *
     * Automatic scaling activities triggered by automatic scaling rules will not cause an instance
     * group to grow above or below these limits.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.stepfunctions.tasks.*;
     * ScalingConstraintsProperty scalingConstraintsProperty = ScalingConstraintsProperty.builder()
     * .maxCapacity(123)
     * .minCapacity(123)
     * .build();
     * ```
     *
     * [Documentation](https://docs.aws.amazon.com/emr/latest/APIReference/API_ScalingConstraints.html)
     */
    public inline fun emrCreateClusterScalingConstraintsProperty(
        block: EmrCreateClusterScalingConstraintsPropertyDsl.() -> Unit = {}
    ): EmrCreateCluster.ScalingConstraintsProperty {
        val builder = EmrCreateClusterScalingConstraintsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A scale-in or scale-out rule that defines scaling activity, including the CloudWatch metric
     * alarm that triggers activity, how EC2 instances are added or removed, and the periodicity of
     * adjustments.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.*;
     * import software.amazon.awscdk.services.stepfunctions.tasks.*;
     * ScalingRuleProperty scalingRuleProperty = ScalingRuleProperty.builder()
     * .action(ScalingActionProperty.builder()
     * .simpleScalingPolicyConfiguration(SimpleScalingPolicyConfigurationProperty.builder()
     * .scalingAdjustment(123)
     * // the properties below are optional
     * .adjustmentType(EmrCreateCluster.getScalingAdjustmentType().CHANGE_IN_CAPACITY)
     * .coolDown(123)
     * .build())
     * // the properties below are optional
     * .market(EmrCreateCluster.getInstanceMarket().ON_DEMAND)
     * .build())
     * .name("name")
     * .trigger(ScalingTriggerProperty.builder()
     * .cloudWatchAlarmDefinition(CloudWatchAlarmDefinitionProperty.builder()
     * .comparisonOperator(EmrCreateCluster.getCloudWatchAlarmComparisonOperator().GREATER_THAN_OR_EQUAL)
     * .metricName("metricName")
     * .period(Duration.minutes(30))
     * // the properties below are optional
     * .dimensions(List.of(MetricDimensionProperty.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .evaluationPeriods(123)
     * .namespace("namespace")
     * .statistic(EmrCreateCluster.getCloudWatchAlarmStatistic().SAMPLE_COUNT)
     * .threshold(123)
     * .unit(EmrCreateCluster.getCloudWatchAlarmUnit().NONE)
     * .build())
     * .build())
     * // the properties below are optional
     * .description("description")
     * .build();
     * ```
     *
     * [Documentation](https://docs.aws.amazon.com/emr/latest/APIReference/API_ScalingRule.html)
     */
    public inline fun emrCreateClusterScalingRuleProperty(
        block: EmrCreateClusterScalingRulePropertyDsl.() -> Unit = {}
    ): EmrCreateCluster.ScalingRuleProperty {
        val builder = EmrCreateClusterScalingRulePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The conditions that trigger an automatic scaling activity and the definition of a CloudWatch
     * metric alarm.
     *
     * When the defined alarm conditions are met along with other trigger parameters, scaling
     * activity begins.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.*;
     * import software.amazon.awscdk.services.stepfunctions.tasks.*;
     * ScalingTriggerProperty scalingTriggerProperty = ScalingTriggerProperty.builder()
     * .cloudWatchAlarmDefinition(CloudWatchAlarmDefinitionProperty.builder()
     * .comparisonOperator(EmrCreateCluster.getCloudWatchAlarmComparisonOperator().GREATER_THAN_OR_EQUAL)
     * .metricName("metricName")
     * .period(Duration.minutes(30))
     * // the properties below are optional
     * .dimensions(List.of(MetricDimensionProperty.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .evaluationPeriods(123)
     * .namespace("namespace")
     * .statistic(EmrCreateCluster.getCloudWatchAlarmStatistic().SAMPLE_COUNT)
     * .threshold(123)
     * .unit(EmrCreateCluster.getCloudWatchAlarmUnit().NONE)
     * .build())
     * .build();
     * ```
     *
     * [Documentation](https://docs.aws.amazon.com/emr/latest/APIReference/API_ScalingTrigger.html)
     */
    public inline fun emrCreateClusterScalingTriggerProperty(
        block: EmrCreateClusterScalingTriggerPropertyDsl.() -> Unit = {}
    ): EmrCreateCluster.ScalingTriggerProperty {
        val builder = EmrCreateClusterScalingTriggerPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Configuration of the script to run during a bootstrap action.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.stepfunctions.tasks.*;
     * ScriptBootstrapActionConfigProperty scriptBootstrapActionConfigProperty =
     * ScriptBootstrapActionConfigProperty.builder()
     * .path("path")
     * // the properties below are optional
     * .args(List.of("args"))
     * .build();
     * ```
     *
     * [Documentation](https://docs.aws.amazon.com/emr/latest/APIReference/API_ScriptBootstrapActionConfig.html)
     */
    public inline fun emrCreateClusterScriptBootstrapActionConfigProperty(
        block: EmrCreateClusterScriptBootstrapActionConfigPropertyDsl.() -> Unit = {}
    ): EmrCreateCluster.ScriptBootstrapActionConfigProperty {
        val builder = EmrCreateClusterScriptBootstrapActionConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * An automatic scaling configuration, which describes how the policy adds or removes instances,
     * the cooldown period, and the number of EC2 instances that will be added each time the
     * CloudWatch metric alarm condition is satisfied.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.stepfunctions.tasks.*;
     * SimpleScalingPolicyConfigurationProperty simpleScalingPolicyConfigurationProperty =
     * SimpleScalingPolicyConfigurationProperty.builder()
     * .scalingAdjustment(123)
     * // the properties below are optional
     * .adjustmentType(EmrCreateCluster.getScalingAdjustmentType().CHANGE_IN_CAPACITY)
     * .coolDown(123)
     * .build();
     * ```
     *
     * [Documentation](https://docs.aws.amazon.com/emr/latest/APIReference/API_SimpleScalingPolicyConfiguration.html)
     */
    public inline fun emrCreateClusterSimpleScalingPolicyConfigurationProperty(
        block: EmrCreateClusterSimpleScalingPolicyConfigurationPropertyDsl.() -> Unit = {}
    ): EmrCreateCluster.SimpleScalingPolicyConfigurationProperty {
        val builder = EmrCreateClusterSimpleScalingPolicyConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The launch specification for Spot instances in the instance fleet, which determines the
     * defined duration and provisioning timeout behavior.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.stepfunctions.tasks.*;
     * SpotProvisioningSpecificationProperty spotProvisioningSpecificationProperty =
     * SpotProvisioningSpecificationProperty.builder()
     * .timeoutAction(EmrCreateCluster.getSpotTimeoutAction().SWITCH_TO_ON_DEMAND)
     * .timeoutDurationMinutes(123)
     * // the properties below are optional
     * .allocationStrategy(EmrCreateCluster.getSpotAllocationStrategy().CAPACITY_OPTIMIZED)
     * .blockDurationMinutes(123)
     * .build();
     * ```
     *
     * [Documentation](https://docs.aws.amazon.com/emr/latest/APIReference/API_SpotProvisioningSpecification.html)
     */
    public inline fun emrCreateClusterSpotProvisioningSpecificationProperty(
        block: EmrCreateClusterSpotProvisioningSpecificationPropertyDsl.() -> Unit = {}
    ): EmrCreateCluster.SpotProvisioningSpecificationProperty {
        val builder = EmrCreateClusterSpotProvisioningSpecificationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * EBS volume specifications such as volume type, IOPS, and size (GiB) that will be requested
     * for the EBS volume attached to an EC2 instance in the cluster.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.*;
     * import software.amazon.awscdk.services.stepfunctions.tasks.*;
     * Size size;
     * VolumeSpecificationProperty volumeSpecificationProperty = VolumeSpecificationProperty.builder()
     * .volumeSize(size)
     * .volumeType(EmrCreateCluster.getEbsBlockDeviceVolumeType().GP2)
     * // the properties below are optional
     * .iops(123)
     * .build();
     * ```
     *
     * [Documentation](https://docs.aws.amazon.com/emr/latest/APIReference/API_VolumeSpecification.html)
     */
    public inline fun emrCreateClusterVolumeSpecificationProperty(
        block: EmrCreateClusterVolumeSpecificationPropertyDsl.() -> Unit = {}
    ): EmrCreateCluster.VolumeSpecificationProperty {
        val builder = EmrCreateClusterVolumeSpecificationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A Step Functions Task to to modify an InstanceFleet on an EMR Cluster.
     *
     * Example:
     * ```
     * EmrModifyInstanceFleetByName.Builder.create(this, "Task")
     * .clusterId("ClusterId")
     * .instanceFleetName("InstanceFleetName")
     * .targetOnDemandCapacity(2)
     * .targetSpotCapacity(0)
     * .build();
     * ```
     */
    public inline fun emrModifyInstanceFleetByName(
        scope: Construct,
        id: String,
        block: EmrModifyInstanceFleetByNameDsl.() -> Unit = {},
    ): EmrModifyInstanceFleetByName {
        val builder = EmrModifyInstanceFleetByNameDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for EmrModifyInstanceFleetByName.
     *
     * Example:
     * ```
     * EmrModifyInstanceFleetByName.Builder.create(this, "Task")
     * .clusterId("ClusterId")
     * .instanceFleetName("InstanceFleetName")
     * .targetOnDemandCapacity(2)
     * .targetSpotCapacity(0)
     * .build();
     * ```
     */
    public inline fun emrModifyInstanceFleetByNameProps(
        block: EmrModifyInstanceFleetByNamePropsDsl.() -> Unit = {}
    ): EmrModifyInstanceFleetByNameProps {
        val builder = EmrModifyInstanceFleetByNamePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A Step Functions Task to to modify an InstanceGroup on an EMR Cluster.
     *
     * Example:
     * ```
     * EmrModifyInstanceGroupByName.Builder.create(this, "Task")
     * .clusterId("ClusterId")
     * .instanceGroupName(JsonPath.stringAt("$.InstanceGroupName"))
     * .instanceGroup(InstanceGroupModifyConfigProperty.builder()
     * .instanceCount(1)
     * .build())
     * .build();
     * ```
     */
    public inline fun emrModifyInstanceGroupByName(
        scope: Construct,
        id: String,
        block: EmrModifyInstanceGroupByNameDsl.() -> Unit = {},
    ): EmrModifyInstanceGroupByName {
        val builder = EmrModifyInstanceGroupByNameDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Modify the size or configurations of an instance group.
     *
     * Example:
     * ```
     * EmrModifyInstanceGroupByName.Builder.create(this, "Task")
     * .clusterId("ClusterId")
     * .instanceGroupName(JsonPath.stringAt("$.InstanceGroupName"))
     * .instanceGroup(InstanceGroupModifyConfigProperty.builder()
     * .instanceCount(1)
     * .build())
     * .build();
     * ```
     *
     * [Documentation](https://docs.aws.amazon.com/emr/latest/APIReference/API_InstanceGroupModifyConfig.html)
     */
    public inline fun emrModifyInstanceGroupByNameInstanceGroupModifyConfigProperty(
        block: EmrModifyInstanceGroupByNameInstanceGroupModifyConfigPropertyDsl.() -> Unit = {}
    ): EmrModifyInstanceGroupByName.InstanceGroupModifyConfigProperty {
        val builder = EmrModifyInstanceGroupByNameInstanceGroupModifyConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Custom policy for requesting termination protection or termination of specific instances when
     * shrinking an instance group.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.*;
     * import software.amazon.awscdk.services.stepfunctions.tasks.*;
     * InstanceResizePolicyProperty instanceResizePolicyProperty =
     * InstanceResizePolicyProperty.builder()
     * .instancesToProtect(List.of("instancesToProtect"))
     * .instancesToTerminate(List.of("instancesToTerminate"))
     * .instanceTerminationTimeout(Duration.minutes(30))
     * .build();
     * ```
     *
     * [Documentation](https://docs.aws.amazon.com/emr/latest/APIReference/API_InstanceResizePolicy.html)
     */
    public inline fun emrModifyInstanceGroupByNameInstanceResizePolicyProperty(
        block: EmrModifyInstanceGroupByNameInstanceResizePolicyPropertyDsl.() -> Unit = {}
    ): EmrModifyInstanceGroupByName.InstanceResizePolicyProperty {
        val builder = EmrModifyInstanceGroupByNameInstanceResizePolicyPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for EmrModifyInstanceGroupByName.
     *
     * Example:
     * ```
     * EmrModifyInstanceGroupByName.Builder.create(this, "Task")
     * .clusterId("ClusterId")
     * .instanceGroupName(JsonPath.stringAt("$.InstanceGroupName"))
     * .instanceGroup(InstanceGroupModifyConfigProperty.builder()
     * .instanceCount(1)
     * .build())
     * .build();
     * ```
     */
    public inline fun emrModifyInstanceGroupByNameProps(
        block: EmrModifyInstanceGroupByNamePropsDsl.() -> Unit = {}
    ): EmrModifyInstanceGroupByNameProps {
        val builder = EmrModifyInstanceGroupByNamePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Policy for customizing shrink operations.
     *
     * Allows configuration of decommissioning timeout and targeted instance shrinking.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.*;
     * import software.amazon.awscdk.services.stepfunctions.tasks.*;
     * ShrinkPolicyProperty shrinkPolicyProperty = ShrinkPolicyProperty.builder()
     * .decommissionTimeout(Duration.minutes(30))
     * .instanceResizePolicy(InstanceResizePolicyProperty.builder()
     * .instancesToProtect(List.of("instancesToProtect"))
     * .instancesToTerminate(List.of("instancesToTerminate"))
     * .instanceTerminationTimeout(Duration.minutes(30))
     * .build())
     * .build();
     * ```
     *
     * [Documentation](https://docs.aws.amazon.com/emr/latest/APIReference/API_ShrinkPolicy.html)
     */
    public inline fun emrModifyInstanceGroupByNameShrinkPolicyProperty(
        block: EmrModifyInstanceGroupByNameShrinkPolicyPropertyDsl.() -> Unit = {}
    ): EmrModifyInstanceGroupByName.ShrinkPolicyProperty {
        val builder = EmrModifyInstanceGroupByNameShrinkPolicyPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A Step Functions Task to to set Termination Protection on an EMR Cluster.
     *
     * Example:
     * ```
     * EmrSetClusterTerminationProtection.Builder.create(this, "Task")
     * .clusterId("ClusterId")
     * .terminationProtected(false)
     * .build();
     * ```
     */
    public inline fun emrSetClusterTerminationProtection(
        scope: Construct,
        id: String,
        block: EmrSetClusterTerminationProtectionDsl.() -> Unit = {},
    ): EmrSetClusterTerminationProtection {
        val builder = EmrSetClusterTerminationProtectionDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for EmrSetClusterTerminationProtection.
     *
     * Example:
     * ```
     * EmrSetClusterTerminationProtection.Builder.create(this, "Task")
     * .clusterId("ClusterId")
     * .terminationProtected(false)
     * .build();
     * ```
     */
    public inline fun emrSetClusterTerminationProtectionProps(
        block: EmrSetClusterTerminationProtectionPropsDsl.() -> Unit = {}
    ): EmrSetClusterTerminationProtectionProps {
        val builder = EmrSetClusterTerminationProtectionPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A Step Functions Task to terminate an EMR Cluster.
     *
     * Example:
     * ```
     * EmrTerminateCluster.Builder.create(this, "Task")
     * .clusterId("ClusterId")
     * .build();
     * ```
     */
    public inline fun emrTerminateCluster(
        scope: Construct,
        id: String,
        block: EmrTerminateClusterDsl.() -> Unit = {},
    ): EmrTerminateCluster {
        val builder = EmrTerminateClusterDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for EmrTerminateCluster.
     *
     * Example:
     * ```
     * EmrTerminateCluster.Builder.create(this, "Task")
     * .clusterId("ClusterId")
     * .build();
     * ```
     */
    public inline fun emrTerminateClusterProps(
        block: EmrTerminateClusterPropsDsl.() -> Unit = {}
    ): EmrTerminateClusterProps {
        val builder = EmrTerminateClusterPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Encryption Configuration of the S3 bucket.
     *
     * Example:
     * ```
     * AthenaStartQueryExecution startQueryExecutionJob =
     * AthenaStartQueryExecution.Builder.create(this, "Start Athena Query")
     * .queryString(JsonPath.stringAt("$.queryString"))
     * .queryExecutionContext(QueryExecutionContext.builder()
     * .databaseName("mydatabase")
     * .build())
     * .resultConfiguration(ResultConfiguration.builder()
     * .encryptionConfiguration(EncryptionConfiguration.builder()
     * .encryptionOption(EncryptionOption.S3_MANAGED)
     * .build())
     * .outputLocation(Location.builder()
     * .bucketName("query-results-bucket")
     * .objectKey("folder")
     * .build())
     * .build())
     * .build();
     * ```
     *
     * [Documentation](https://docs.aws.amazon.com/athena/latest/APIReference/API_EncryptionConfiguration.html)
     */
    public inline fun encryptionConfiguration(
        block: EncryptionConfigurationDsl.() -> Unit = {}
    ): EncryptionConfiguration {
        val builder = EncryptionConfigurationDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A Step Functions Task to evaluate an expression.
     *
     * OUTPUT: the output of this task is the evaluated expression.
     *
     * Example:
     * ```
     * EvaluateExpression convertToSeconds = EvaluateExpression.Builder.create(this, "Convert to
     * seconds")
     * .expression("$.waitMilliseconds / 1000")
     * .resultPath("$.waitSeconds")
     * .build();
     * EvaluateExpression createMessage = EvaluateExpression.Builder.create(this, "Create message")
     * // Note: this is a string inside a string.
     * .expression("`Now waiting ${$.waitSeconds} seconds...`")
     * .runtime(Runtime.NODEJS_16_X)
     * .resultPath("$.message")
     * .build();
     * SnsPublish publishMessage = SnsPublish.Builder.create(this, "Publish message")
     * .topic(new Topic(this, "cool-topic"))
     * .message(TaskInput.fromJsonPathAt("$.message"))
     * .resultPath("$.sns")
     * .build();
     * Wait wait = Wait.Builder.create(this, "Wait")
     * .time(WaitTime.secondsPath("$.waitSeconds"))
     * .build();
     * StateMachine.Builder.create(this, "StateMachine")
     * .definition(convertToSeconds.next(createMessage).next(publishMessage).next(wait))
     * .build();
     * ```
     */
    public inline fun evaluateExpression(
        scope: Construct,
        id: String,
        block: EvaluateExpressionDsl.() -> Unit = {},
    ): EvaluateExpression {
        val builder = EvaluateExpressionDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for EvaluateExpression.
     *
     * Example:
     * ```
     * EvaluateExpression convertToSeconds = EvaluateExpression.Builder.create(this, "Convert to
     * seconds")
     * .expression("$.waitMilliseconds / 1000")
     * .resultPath("$.waitSeconds")
     * .build();
     * EvaluateExpression createMessage = EvaluateExpression.Builder.create(this, "Create message")
     * // Note: this is a string inside a string.
     * .expression("`Now waiting ${$.waitSeconds} seconds...`")
     * .runtime(Runtime.NODEJS_16_X)
     * .resultPath("$.message")
     * .build();
     * SnsPublish publishMessage = SnsPublish.Builder.create(this, "Publish message")
     * .topic(new Topic(this, "cool-topic"))
     * .message(TaskInput.fromJsonPathAt("$.message"))
     * .resultPath("$.sns")
     * .build();
     * Wait wait = Wait.Builder.create(this, "Wait")
     * .time(WaitTime.secondsPath("$.waitSeconds"))
     * .build();
     * StateMachine.Builder.create(this, "StateMachine")
     * .definition(convertToSeconds.next(createMessage).next(publishMessage).next(wait))
     * .build();
     * ```
     */
    public inline fun evaluateExpressionProps(
        block: EvaluateExpressionPropsDsl.() -> Unit = {}
    ): EvaluateExpressionProps {
        val builder = EvaluateExpressionPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A StepFunctions Task to send events to an EventBridge event bus.
     *
     * Example:
     * ```
     * import software.amazon.awscdk.services.events.*;
     * EventBus myEventBus = EventBus.Builder.create(this, "EventBus")
     * .eventBusName("MyEventBus1")
     * .build();
     * EventBridgePutEvents.Builder.create(this, "Send an event to EventBridge")
     * .entries(List.of(EventBridgePutEventsEntry.builder()
     * .detail(TaskInput.fromObject(Map.of(
     * "Message", "Hello from Step Functions!")))
     * .eventBus(myEventBus)
     * .detailType("MessageFromStepFunctions")
     * .source("step.functions")
     * .build()))
     * .build();
     * ```
     */
    public inline fun eventBridgePutEvents(
        scope: Construct,
        id: String,
        block: EventBridgePutEventsDsl.() -> Unit = {},
    ): EventBridgePutEvents {
        val builder = EventBridgePutEventsDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * An entry to be sent to EventBridge.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.events.*;
     * import software.amazon.awscdk.services.stepfunctions.*;
     * import software.amazon.awscdk.services.stepfunctions.tasks.*;
     * EventBus eventBus;
     * TaskInput taskInput;
     * EventBridgePutEventsEntry eventBridgePutEventsEntry = EventBridgePutEventsEntry.builder()
     * .detail(taskInput)
     * .detailType("detailType")
     * .source("source")
     * // the properties below are optional
     * .eventBus(eventBus)
     * .build();
     * ```
     *
     * [Documentation](https://docs.aws.amazon.com/eventbridge/latest/APIReference/API_PutEventsRequestEntry.html)
     */
    public inline fun eventBridgePutEventsEntry(
        block: EventBridgePutEventsEntryDsl.() -> Unit = {}
    ): EventBridgePutEventsEntry {
        val builder = EventBridgePutEventsEntryDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for sending events with PutEvents.
     *
     * Example:
     * ```
     * import software.amazon.awscdk.services.events.*;
     * EventBus myEventBus = EventBus.Builder.create(this, "EventBus")
     * .eventBusName("MyEventBus1")
     * .build();
     * EventBridgePutEvents.Builder.create(this, "Send an event to EventBridge")
     * .entries(List.of(EventBridgePutEventsEntry.builder()
     * .detail(TaskInput.fromObject(Map.of(
     * "Message", "Hello from Step Functions!")))
     * .eventBus(myEventBus)
     * .detailType("MessageFromStepFunctions")
     * .source("step.functions")
     * .build()))
     * .build();
     * ```
     */
    public inline fun eventBridgePutEventsProps(
        block: EventBridgePutEventsPropsDsl.() -> Unit = {}
    ): EventBridgePutEventsProps {
        val builder = EventBridgePutEventsPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Start a Job run as a Task.
     *
     * Example:
     * ```
     * GlueDataBrewStartJobRun.Builder.create(this, "Task")
     * .name("databrew-job")
     * .build();
     * ```
     *
     * [Documentation](https://docs.aws.amazon.com/step-functions/latest/dg/connect-databrew.html)
     */
    public inline fun glueDataBrewStartJobRun(
        scope: Construct,
        id: String,
        block: GlueDataBrewStartJobRunDsl.() -> Unit = {},
    ): GlueDataBrewStartJobRun {
        val builder = GlueDataBrewStartJobRunDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for starting a job run with StartJobRun.
     *
     * Example:
     * ```
     * GlueDataBrewStartJobRun.Builder.create(this, "Task")
     * .name("databrew-job")
     * .build();
     * ```
     */
    public inline fun glueDataBrewStartJobRunProps(
        block: GlueDataBrewStartJobRunPropsDsl.() -> Unit = {}
    ): GlueDataBrewStartJobRunProps {
        val builder = GlueDataBrewStartJobRunPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Starts an AWS Glue job in a Task state.
     *
     * OUTPUT: the output of this task is a JobRun structure, for details consult
     * https://docs.aws.amazon.com/glue/latest/dg/aws-glue-api-jobs-runs.html#aws-glue-api-jobs-runs-JobRun
     *
     * Example:
     * ```
     * GlueStartJobRun.Builder.create(this, "Task")
     * .glueJobName("my-glue-job")
     * .arguments(TaskInput.fromObject(Map.of(
     * "key", "value")))
     * .taskTimeout(Timeout.duration(Duration.minutes(30)))
     * .notifyDelayAfter(Duration.minutes(5))
     * .build();
     * ```
     *
     * [Documentation](https://docs.aws.amazon.com/step-functions/latest/dg/connect-glue.html)
     */
    public inline fun glueStartJobRun(
        scope: Construct,
        id: String,
        block: GlueStartJobRunDsl.() -> Unit = {},
    ): GlueStartJobRun {
        val builder = GlueStartJobRunDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for starting an AWS Glue job as a task.
     *
     * Example:
     * ```
     * GlueStartJobRun.Builder.create(this, "Task")
     * .glueJobName("my-glue-job")
     * .arguments(TaskInput.fromObject(Map.of(
     * "key", "value")))
     * .taskTimeout(Timeout.duration(Duration.minutes(30)))
     * .notifyDelayAfter(Duration.minutes(5))
     * .build();
     * ```
     */
    public inline fun glueStartJobRunProps(
        block: GlueStartJobRunPropsDsl.() -> Unit = {}
    ): GlueStartJobRunProps {
        val builder = GlueStartJobRunPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * An object representing an AWS Batch job dependency.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.stepfunctions.tasks.*;
     * JobDependency jobDependency = JobDependency.builder()
     * .jobId("jobId")
     * .type("type")
     * .build();
     * ```
     */
    public inline fun jobDependency(block: JobDependencyDsl.() -> Unit = {}): JobDependency {
        val builder = JobDependencyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specify the driver that the EMR Containers job runs on.
     *
     * The job driver is used to provide an input for the job that will be run.
     *
     * Example:
     * ```
     * EmrContainersStartJobRun.Builder.create(this, "EMR Containers Start Job Run")
     * .virtualCluster(VirtualClusterInput.fromVirtualClusterId("de92jdei2910fwedz"))
     * .releaseLabel(ReleaseLabel.EMR_6_2_0)
     * .jobName("EMR-Containers-Job")
     * .jobDriver(JobDriver.builder()
     * .sparkSubmitJobDriver(SparkSubmitJobDriver.builder()
     * .entryPoint(TaskInput.fromText("local:///usr/lib/spark/examples/src/main/python/pi.py"))
     * .build())
     * .build())
     * .applicationConfig(List.of(ApplicationConfiguration.builder()
     * .classification(Classification.SPARK_DEFAULTS)
     * .properties(Map.of(
     * "spark.executor.instances", "1",
     * "spark.executor.memory", "512M"))
     * .build()))
     * .build();
     * ```
     */
    public inline fun jobDriver(block: JobDriverDsl.() -> Unit = {}): JobDriver {
        val builder = JobDriverDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Invoke a Lambda function as a Task.
     *
     * Example:
     * ```
     * Function fn;
     * LambdaInvoke.Builder.create(this, "Invoke with empty object as payload")
     * .lambdaFunction(fn)
     * .payload(TaskInput.fromObject(Map.of()))
     * .build();
     * // use the output of fn as input
     * // use the output of fn as input
     * LambdaInvoke.Builder.create(this, "Invoke with payload field in the state input")
     * .lambdaFunction(fn)
     * .payload(TaskInput.fromJsonPathAt("$.Payload"))
     * .build();
     * ```
     *
     * [Documentation](https://docs.aws.amazon.com/step-functions/latest/dg/connect-lambda.html)
     */
    public inline fun lambdaInvoke(
        scope: Construct,
        id: String,
        block: LambdaInvokeDsl.() -> Unit = {},
    ): LambdaInvoke {
        val builder = LambdaInvokeDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for invoking a Lambda function with LambdaInvoke.
     *
     * Example:
     * ```
     * Function fn;
     * LambdaInvoke.Builder.create(this, "Invoke with empty object as payload")
     * .lambdaFunction(fn)
     * .payload(TaskInput.fromObject(Map.of()))
     * .build();
     * // use the output of fn as input
     * // use the output of fn as input
     * LambdaInvoke.Builder.create(this, "Invoke with payload field in the state input")
     * .lambdaFunction(fn)
     * .payload(TaskInput.fromJsonPathAt("$.Payload"))
     * .build();
     * ```
     */
    public inline fun lambdaInvokeProps(
        block: LambdaInvokePropsDsl.() -> Unit = {}
    ): LambdaInvokeProps {
        val builder = LambdaInvokePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Options for binding a launch target to an ECS run job task.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ecs.*;
     * import software.amazon.awscdk.services.stepfunctions.tasks.*;
     * Cluster cluster;
     * TaskDefinition taskDefinition;
     * LaunchTargetBindOptions launchTargetBindOptions = LaunchTargetBindOptions.builder()
     * .taskDefinition(taskDefinition)
     * // the properties below are optional
     * .cluster(cluster)
     * .build();
     * ```
     */
    public inline fun launchTargetBindOptions(
        block: LaunchTargetBindOptionsDsl.() -> Unit = {}
    ): LaunchTargetBindOptions {
        val builder = LaunchTargetBindOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A message attribute to add to the SNS message.
     *
     * Example:
     * ```
     * Topic topic = new Topic(this, "Topic");
     * // Use a field from the execution data as message.
     * SnsPublish task1 = SnsPublish.Builder.create(this, "Publish1")
     * .topic(topic)
     * .integrationPattern(IntegrationPattern.REQUEST_RESPONSE)
     * .message(TaskInput.fromDataAt("$.state.message"))
     * .messageAttributes(Map.of(
     * "place", MessageAttribute.builder()
     * .value(JsonPath.stringAt("$.place"))
     * .build(),
     * "pic", MessageAttribute.builder()
     * // BINARY must be explicitly set
     * .dataType(MessageAttributeDataType.BINARY)
     * .value(JsonPath.stringAt("$.pic"))
     * .build(),
     * "people", MessageAttribute.builder()
     * .value(4)
     * .build(),
     * "handles", MessageAttribute.builder()
     * .value(List.of("&#64;kslater", "&#64;jjf", null, "&#64;mfanning"))
     * .build()))
     * .build();
     * // Combine a field from the execution data with
     * // a literal object.
     * SnsPublish task2 = SnsPublish.Builder.create(this, "Publish2")
     * .topic(topic)
     * .message(TaskInput.fromObject(Map.of(
     * "field1", "somedata",
     * "field2", JsonPath.stringAt("$.field2"))))
     * .build();
     * ```
     *
     * [Documentation](https://docs.aws.amazon.com/sns/latest/dg/sns-message-attributes.html)
     */
    public inline fun messageAttribute(
        block: MessageAttributeDsl.() -> Unit = {}
    ): MessageAttribute {
        val builder = MessageAttributeDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies the metric name and regular expressions used to parse algorithm logs.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.stepfunctions.tasks.*;
     * MetricDefinition metricDefinition = MetricDefinition.builder()
     * .name("name")
     * .regex("regex")
     * .build();
     * ```
     */
    public inline fun metricDefinition(
        block: MetricDefinitionDsl.() -> Unit = {}
    ): MetricDefinition {
        val builder = MetricDefinitionDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Configures the timeout and maximum number of retries for processing a transform job
     * invocation.
     *
     * Example:
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
    public inline fun modelClientOptions(
        block: ModelClientOptionsDsl.() -> Unit = {}
    ): ModelClientOptions {
        val builder = ModelClientOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Configuration setting for monitoring.
     *
     * Example:
     * ```
     * EmrContainersStartJobRun.Builder.create(this, "EMR Containers Start Job Run")
     * .virtualCluster(VirtualClusterInput.fromVirtualClusterId("de92jdei2910fwedz"))
     * .releaseLabel(ReleaseLabel.EMR_6_2_0)
     * .jobDriver(JobDriver.builder()
     * .sparkSubmitJobDriver(SparkSubmitJobDriver.builder()
     * .entryPoint(TaskInput.fromText("local:///usr/lib/spark/examples/src/main/python/pi.py"))
     * .sparkSubmitParameters("--conf spark.executor.instances=2 --conf
     * spark.executor.memory=2G --conf spark.executor.cores=2 --conf spark.driver.cores=1")
     * .build())
     * .build())
     * .monitoring(Monitoring.builder()
     * .logging(true)
     * .build())
     * .build();
     * ```
     */
    public inline fun monitoring(block: MonitoringDsl.() -> Unit = {}): Monitoring {
        val builder = MonitoringDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Configures the S3 bucket where SageMaker will save the result of model training.
     *
     * Example:
     * ```
     * SageMakerCreateTrainingJob.Builder.create(this, "TrainSagemaker")
     * .trainingJobName(JsonPath.stringAt("$.JobName"))
     * .algorithmSpecification(AlgorithmSpecification.builder()
     * .algorithmName("BlazingText")
     * .trainingInputMode(InputMode.FILE)
     * .build())
     * .inputDataConfig(List.of(Channel.builder()
     * .channelName("train")
     * .dataSource(DataSource.builder()
     * .s3DataSource(S3DataSource.builder()
     * .s3DataType(S3DataType.S3_PREFIX)
     * .s3Location(S3Location.fromJsonExpression("$.S3Bucket"))
     * .build())
     * .build())
     * .build()))
     * .outputDataConfig(OutputDataConfig.builder()
     * .s3OutputLocation(S3Location.fromBucket(Bucket.fromBucketName(this, "Bucket", "mybucket"),
     * "myoutputpath"))
     * .build())
     * .resourceConfig(ResourceConfig.builder()
     * .instanceCount(1)
     * .instanceType(new InstanceType(JsonPath.stringAt("$.InstanceType")))
     * .volumeSize(Size.gibibytes(50))
     * .build()) // optional: default is 1 instance of EC2 `M4.XLarge` with `10GB` volume
     * .stoppingCondition(StoppingCondition.builder()
     * .maxRuntime(Duration.hours(2))
     * .build())
     * .build();
     * ```
     */
    public inline fun outputDataConfig(
        block: OutputDataConfigDsl.() -> Unit = {}
    ): OutputDataConfig {
        val builder = OutputDataConfigDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Identifies a model that you want to host and the resources to deploy for hosting it.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * import software.amazon.awscdk.services.stepfunctions.tasks.*;
     * AcceleratorType acceleratorType;
     * InstanceType instanceType;
     * ProductionVariant productionVariant = ProductionVariant.builder()
     * .instanceType(instanceType)
     * .modelName("modelName")
     * .variantName("variantName")
     * // the properties below are optional
     * .acceleratorType(acceleratorType)
     * .initialInstanceCount(123)
     * .initialVariantWeight(123)
     * .build();
     * ```
     *
     * [Documentation](https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_ProductionVariant.html)
     */
    public inline fun productionVariant(
        block: ProductionVariantDsl.() -> Unit = {}
    ): ProductionVariant {
        val builder = ProductionVariantDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Database and data catalog context in which the query execution occurs.
     *
     * Example:
     * ```
     * AthenaStartQueryExecution startQueryExecutionJob =
     * AthenaStartQueryExecution.Builder.create(this, "Start Athena Query")
     * .queryString(JsonPath.stringAt("$.queryString"))
     * .queryExecutionContext(QueryExecutionContext.builder()
     * .databaseName("mydatabase")
     * .build())
     * .resultConfiguration(ResultConfiguration.builder()
     * .encryptionConfiguration(EncryptionConfiguration.builder()
     * .encryptionOption(EncryptionOption.S3_MANAGED)
     * .build())
     * .outputLocation(Location.builder()
     * .bucketName("query-results-bucket")
     * .objectKey("folder")
     * .build())
     * .build())
     * .build();
     * ```
     *
     * [Documentation](https://docs.aws.amazon.com/athena/latest/APIReference/API_QueryExecutionContext.html)
     */
    public inline fun queryExecutionContext(
        block: QueryExecutionContextDsl.() -> Unit = {}
    ): QueryExecutionContext {
        val builder = QueryExecutionContextDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies the resources, ML compute instances, and ML storage volumes to deploy for model
     * training.
     *
     * Example:
     * ```
     * SageMakerCreateTrainingJob.Builder.create(this, "TrainSagemaker")
     * .trainingJobName(JsonPath.stringAt("$.JobName"))
     * .algorithmSpecification(AlgorithmSpecification.builder()
     * .algorithmName("BlazingText")
     * .trainingInputMode(InputMode.FILE)
     * .build())
     * .inputDataConfig(List.of(Channel.builder()
     * .channelName("train")
     * .dataSource(DataSource.builder()
     * .s3DataSource(S3DataSource.builder()
     * .s3DataType(S3DataType.S3_PREFIX)
     * .s3Location(S3Location.fromJsonExpression("$.S3Bucket"))
     * .build())
     * .build())
     * .build()))
     * .outputDataConfig(OutputDataConfig.builder()
     * .s3OutputLocation(S3Location.fromBucket(Bucket.fromBucketName(this, "Bucket", "mybucket"),
     * "myoutputpath"))
     * .build())
     * .resourceConfig(ResourceConfig.builder()
     * .instanceCount(1)
     * .instanceType(new InstanceType(JsonPath.stringAt("$.InstanceType")))
     * .volumeSize(Size.gibibytes(50))
     * .build()) // optional: default is 1 instance of EC2 `M4.XLarge` with `10GB` volume
     * .stoppingCondition(StoppingCondition.builder()
     * .maxRuntime(Duration.hours(2))
     * .build())
     * .build();
     * ```
     */
    public inline fun resourceConfig(block: ResourceConfigDsl.() -> Unit = {}): ResourceConfig {
        val builder = ResourceConfigDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Location of query result along with S3 bucket configuration.
     *
     * Example:
     * ```
     * AthenaStartQueryExecution startQueryExecutionJob =
     * AthenaStartQueryExecution.Builder.create(this, "Start Athena Query")
     * .queryString(JsonPath.stringAt("$.queryString"))
     * .queryExecutionContext(QueryExecutionContext.builder()
     * .databaseName("mydatabase")
     * .build())
     * .resultConfiguration(ResultConfiguration.builder()
     * .encryptionConfiguration(EncryptionConfiguration.builder()
     * .encryptionOption(EncryptionOption.S3_MANAGED)
     * .build())
     * .outputLocation(Location.builder()
     * .bucketName("query-results-bucket")
     * .objectKey("folder")
     * .build())
     * .build())
     * .build();
     * ```
     *
     * [Documentation](https://docs.aws.amazon.com/athena/latest/APIReference/API_ResultConfiguration.html)
     */
    public inline fun resultConfiguration(
        block: ResultConfigurationDsl.() -> Unit = {}
    ): ResultConfiguration {
        val builder = ResultConfigurationDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * S3 location of the channel data.
     *
     * Example:
     * ```
     * SageMakerCreateTrainingJob.Builder.create(this, "TrainSagemaker")
     * .trainingJobName(JsonPath.stringAt("$.JobName"))
     * .algorithmSpecification(AlgorithmSpecification.builder()
     * .algorithmName("BlazingText")
     * .trainingInputMode(InputMode.FILE)
     * .build())
     * .inputDataConfig(List.of(Channel.builder()
     * .channelName("train")
     * .dataSource(DataSource.builder()
     * .s3DataSource(S3DataSource.builder()
     * .s3DataType(S3DataType.S3_PREFIX)
     * .s3Location(S3Location.fromJsonExpression("$.S3Bucket"))
     * .build())
     * .build())
     * .build()))
     * .outputDataConfig(OutputDataConfig.builder()
     * .s3OutputLocation(S3Location.fromBucket(Bucket.fromBucketName(this, "Bucket", "mybucket"),
     * "myoutputpath"))
     * .build())
     * .resourceConfig(ResourceConfig.builder()
     * .instanceCount(1)
     * .instanceType(new InstanceType(JsonPath.stringAt("$.InstanceType")))
     * .volumeSize(Size.gibibytes(50))
     * .build()) // optional: default is 1 instance of EC2 `M4.XLarge` with `10GB` volume
     * .stoppingCondition(StoppingCondition.builder()
     * .maxRuntime(Duration.hours(2))
     * .build())
     * .build();
     * ```
     *
     * [Documentation](https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_S3DataSource.html)
     */
    public inline fun s3DataSource(block: S3DataSourceDsl.() -> Unit = {}): S3DataSource {
        val builder = S3DataSourceDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Options for binding an S3 Location.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.stepfunctions.tasks.*;
     * S3LocationBindOptions s3LocationBindOptions = S3LocationBindOptions.builder()
     * .forReading(false)
     * .forWriting(false)
     * .build();
     * ```
     */
    public inline fun s3LocationBindOptions(
        block: S3LocationBindOptionsDsl.() -> Unit = {}
    ): S3LocationBindOptions {
        val builder = S3LocationBindOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Stores information about the location of an object in Amazon S3.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.stepfunctions.tasks.*;
     * S3LocationConfig s3LocationConfig = S3LocationConfig.builder()
     * .uri("uri")
     * .build();
     * ```
     */
    public inline fun s3LocationConfig(
        block: S3LocationConfigDsl.() -> Unit = {}
    ): S3LocationConfig {
        val builder = S3LocationConfigDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A Step Functions Task to create a SageMaker endpoint.
     *
     * Example:
     * ```
     * SageMakerCreateEndpoint.Builder.create(this, "SagemakerEndpoint")
     * .endpointName(JsonPath.stringAt("$.EndpointName"))
     * .endpointConfigName(JsonPath.stringAt("$.EndpointConfigName"))
     * .build();
     * ```
     *
     * [Documentation](https://docs.aws.amazon.com/step-functions/latest/dg/connect-sagemaker.html)
     */
    public inline fun sageMakerCreateEndpoint(
        scope: Construct,
        id: String,
        block: SageMakerCreateEndpointDsl.() -> Unit = {},
    ): SageMakerCreateEndpoint {
        val builder = SageMakerCreateEndpointDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * A Step Functions Task to create a SageMaker endpoint configuration.
     *
     * Example:
     * ```
     * SageMakerCreateEndpointConfig.Builder.create(this, "SagemakerEndpointConfig")
     * .endpointConfigName("MyEndpointConfig")
     * .productionVariants(List.of(ProductionVariant.builder()
     * .initialInstanceCount(2)
     * .instanceType(InstanceType.of(InstanceClass.M5, InstanceSize.XLARGE))
     * .modelName("MyModel")
     * .variantName("awesome-variant")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](https://docs.aws.amazon.com/step-functions/latest/dg/connect-sagemaker.html)
     */
    public inline fun sageMakerCreateEndpointConfig(
        scope: Construct,
        id: String,
        block: SageMakerCreateEndpointConfigDsl.() -> Unit = {},
    ): SageMakerCreateEndpointConfig {
        val builder = SageMakerCreateEndpointConfigDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for creating an Amazon SageMaker endpoint configuration.
     *
     * Example:
     * ```
     * SageMakerCreateEndpointConfig.Builder.create(this, "SagemakerEndpointConfig")
     * .endpointConfigName("MyEndpointConfig")
     * .productionVariants(List.of(ProductionVariant.builder()
     * .initialInstanceCount(2)
     * .instanceType(InstanceType.of(InstanceClass.M5, InstanceSize.XLARGE))
     * .modelName("MyModel")
     * .variantName("awesome-variant")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](https://docs.aws.amazon.com/step-functions/latest/dg/connect-sagemaker.html)
     */
    public inline fun sageMakerCreateEndpointConfigProps(
        block: SageMakerCreateEndpointConfigPropsDsl.() -> Unit = {}
    ): SageMakerCreateEndpointConfigProps {
        val builder = SageMakerCreateEndpointConfigPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for creating an Amazon SageMaker endpoint.
     *
     * Example:
     * ```
     * SageMakerCreateEndpoint.Builder.create(this, "SagemakerEndpoint")
     * .endpointName(JsonPath.stringAt("$.EndpointName"))
     * .endpointConfigName(JsonPath.stringAt("$.EndpointConfigName"))
     * .build();
     * ```
     *
     * [Documentation](https://docs.aws.amazon.com/step-functions/latest/dg/connect-sagemaker.html)
     */
    public inline fun sageMakerCreateEndpointProps(
        block: SageMakerCreateEndpointPropsDsl.() -> Unit = {}
    ): SageMakerCreateEndpointProps {
        val builder = SageMakerCreateEndpointPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A Step Functions Task to create a SageMaker model.
     *
     * Example:
     * ```
     * SageMakerCreateModel.Builder.create(this, "Sagemaker")
     * .modelName("MyModel")
     * .primaryContainer(ContainerDefinition.Builder.create()
     * .image(DockerImage.fromJsonExpression(JsonPath.stringAt("$.Model.imageName")))
     * .mode(Mode.SINGLE_MODEL)
     * .modelS3Location(S3Location.fromJsonExpression("$.TrainingJob.ModelArtifacts.S3ModelArtifacts"))
     * .build())
     * .build();
     * ```
     *
     * [Documentation](https://docs.aws.amazon.com/step-functions/latest/dg/connect-sagemaker.html)
     */
    public inline fun sageMakerCreateModel(
        scope: Construct,
        id: String,
        block: SageMakerCreateModelDsl.() -> Unit = {},
    ): SageMakerCreateModel {
        val builder = SageMakerCreateModelDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for creating an Amazon SageMaker model.
     *
     * Example:
     * ```
     * SageMakerCreateModel.Builder.create(this, "Sagemaker")
     * .modelName("MyModel")
     * .primaryContainer(ContainerDefinition.Builder.create()
     * .image(DockerImage.fromJsonExpression(JsonPath.stringAt("$.Model.imageName")))
     * .mode(Mode.SINGLE_MODEL)
     * .modelS3Location(S3Location.fromJsonExpression("$.TrainingJob.ModelArtifacts.S3ModelArtifacts"))
     * .build())
     * .build();
     * ```
     *
     * [Documentation](https://docs.aws.amazon.com/step-functions/latest/dg/connect-sagemaker.html)
     */
    public inline fun sageMakerCreateModelProps(
        block: SageMakerCreateModelPropsDsl.() -> Unit = {}
    ): SageMakerCreateModelProps {
        val builder = SageMakerCreateModelPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Class representing the SageMaker Create Training Job task.
     *
     * Example:
     * ```
     * SageMakerCreateTrainingJob.Builder.create(this, "TrainSagemaker")
     * .trainingJobName(JsonPath.stringAt("$.JobName"))
     * .algorithmSpecification(AlgorithmSpecification.builder()
     * .algorithmName("BlazingText")
     * .trainingInputMode(InputMode.FILE)
     * .build())
     * .inputDataConfig(List.of(Channel.builder()
     * .channelName("train")
     * .dataSource(DataSource.builder()
     * .s3DataSource(S3DataSource.builder()
     * .s3DataType(S3DataType.S3_PREFIX)
     * .s3Location(S3Location.fromJsonExpression("$.S3Bucket"))
     * .build())
     * .build())
     * .build()))
     * .outputDataConfig(OutputDataConfig.builder()
     * .s3OutputLocation(S3Location.fromBucket(Bucket.fromBucketName(this, "Bucket", "mybucket"),
     * "myoutputpath"))
     * .build())
     * .resourceConfig(ResourceConfig.builder()
     * .instanceCount(1)
     * .instanceType(new InstanceType(JsonPath.stringAt("$.InstanceType")))
     * .volumeSize(Size.gibibytes(50))
     * .build()) // optional: default is 1 instance of EC2 `M4.XLarge` with `10GB` volume
     * .stoppingCondition(StoppingCondition.builder()
     * .maxRuntime(Duration.hours(2))
     * .build())
     * .build();
     * ```
     */
    public inline fun sageMakerCreateTrainingJob(
        scope: Construct,
        id: String,
        block: SageMakerCreateTrainingJobDsl.() -> Unit = {},
    ): SageMakerCreateTrainingJob {
        val builder = SageMakerCreateTrainingJobDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for creating an Amazon SageMaker training job.
     *
     * Example:
     * ```
     * SageMakerCreateTrainingJob.Builder.create(this, "TrainSagemaker")
     * .trainingJobName(JsonPath.stringAt("$.JobName"))
     * .algorithmSpecification(AlgorithmSpecification.builder()
     * .algorithmName("BlazingText")
     * .trainingInputMode(InputMode.FILE)
     * .build())
     * .inputDataConfig(List.of(Channel.builder()
     * .channelName("train")
     * .dataSource(DataSource.builder()
     * .s3DataSource(S3DataSource.builder()
     * .s3DataType(S3DataType.S3_PREFIX)
     * .s3Location(S3Location.fromJsonExpression("$.S3Bucket"))
     * .build())
     * .build())
     * .build()))
     * .outputDataConfig(OutputDataConfig.builder()
     * .s3OutputLocation(S3Location.fromBucket(Bucket.fromBucketName(this, "Bucket", "mybucket"),
     * "myoutputpath"))
     * .build())
     * .resourceConfig(ResourceConfig.builder()
     * .instanceCount(1)
     * .instanceType(new InstanceType(JsonPath.stringAt("$.InstanceType")))
     * .volumeSize(Size.gibibytes(50))
     * .build()) // optional: default is 1 instance of EC2 `M4.XLarge` with `10GB` volume
     * .stoppingCondition(StoppingCondition.builder()
     * .maxRuntime(Duration.hours(2))
     * .build())
     * .build();
     * ```
     */
    public inline fun sageMakerCreateTrainingJobProps(
        block: SageMakerCreateTrainingJobPropsDsl.() -> Unit = {}
    ): SageMakerCreateTrainingJobProps {
        val builder = SageMakerCreateTrainingJobPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Class representing the SageMaker Create Transform Job task.
     *
     * Example:
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
    public inline fun sageMakerCreateTransformJob(
        scope: Construct,
        id: String,
        block: SageMakerCreateTransformJobDsl.() -> Unit = {},
    ): SageMakerCreateTransformJob {
        val builder = SageMakerCreateTransformJobDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for creating an Amazon SageMaker transform job task.
     *
     * Example:
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
    public inline fun sageMakerCreateTransformJobProps(
        block: SageMakerCreateTransformJobPropsDsl.() -> Unit = {}
    ): SageMakerCreateTransformJobProps {
        val builder = SageMakerCreateTransformJobPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A Step Functions Task to update a SageMaker endpoint.
     *
     * Example:
     * ```
     * SageMakerUpdateEndpoint.Builder.create(this, "SagemakerEndpoint")
     * .endpointName(JsonPath.stringAt("$.Endpoint.Name"))
     * .endpointConfigName(JsonPath.stringAt("$.Endpoint.EndpointConfig"))
     * .build();
     * ```
     *
     * [Documentation](https://docs.aws.amazon.com/step-functions/latest/dg/connect-sagemaker.html)
     */
    public inline fun sageMakerUpdateEndpoint(
        scope: Construct,
        id: String,
        block: SageMakerUpdateEndpointDsl.() -> Unit = {},
    ): SageMakerUpdateEndpoint {
        val builder = SageMakerUpdateEndpointDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for updating Amazon SageMaker endpoint.
     *
     * Example:
     * ```
     * SageMakerUpdateEndpoint.Builder.create(this, "SagemakerEndpoint")
     * .endpointName(JsonPath.stringAt("$.Endpoint.Name"))
     * .endpointConfigName(JsonPath.stringAt("$.Endpoint.EndpointConfig"))
     * .build();
     * ```
     *
     * [Documentation](https://docs.aws.amazon.com/step-functions/latest/dg/connect-sagemaker.html)
     */
    public inline fun sageMakerUpdateEndpointProps(
        block: SageMakerUpdateEndpointPropsDsl.() -> Unit = {}
    ): SageMakerUpdateEndpointProps {
        val builder = SageMakerUpdateEndpointPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Configuration for a shuffle option for input data in a channel.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.stepfunctions.tasks.*;
     * ShuffleConfig shuffleConfig = ShuffleConfig.builder()
     * .seed(123)
     * .build();
     * ```
     */
    public inline fun shuffleConfig(block: ShuffleConfigDsl.() -> Unit = {}): ShuffleConfig {
        val builder = ShuffleConfigDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A Step Functions Task to publish messages to SNS topic.
     *
     * Example:
     * ```
     * EvaluateExpression convertToSeconds = EvaluateExpression.Builder.create(this, "Convert to
     * seconds")
     * .expression("$.waitMilliseconds / 1000")
     * .resultPath("$.waitSeconds")
     * .build();
     * EvaluateExpression createMessage = EvaluateExpression.Builder.create(this, "Create message")
     * // Note: this is a string inside a string.
     * .expression("`Now waiting ${$.waitSeconds} seconds...`")
     * .runtime(Runtime.NODEJS_16_X)
     * .resultPath("$.message")
     * .build();
     * SnsPublish publishMessage = SnsPublish.Builder.create(this, "Publish message")
     * .topic(new Topic(this, "cool-topic"))
     * .message(TaskInput.fromJsonPathAt("$.message"))
     * .resultPath("$.sns")
     * .build();
     * Wait wait = Wait.Builder.create(this, "Wait")
     * .time(WaitTime.secondsPath("$.waitSeconds"))
     * .build();
     * StateMachine.Builder.create(this, "StateMachine")
     * .definition(convertToSeconds.next(createMessage).next(publishMessage).next(wait))
     * .build();
     * ```
     */
    public inline fun snsPublish(
        scope: Construct,
        id: String,
        block: SnsPublishDsl.() -> Unit = {},
    ): SnsPublish {
        val builder = SnsPublishDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for publishing a message to an SNS topic.
     *
     * Example:
     * ```
     * EvaluateExpression convertToSeconds = EvaluateExpression.Builder.create(this, "Convert to
     * seconds")
     * .expression("$.waitMilliseconds / 1000")
     * .resultPath("$.waitSeconds")
     * .build();
     * EvaluateExpression createMessage = EvaluateExpression.Builder.create(this, "Create message")
     * // Note: this is a string inside a string.
     * .expression("`Now waiting ${$.waitSeconds} seconds...`")
     * .runtime(Runtime.NODEJS_16_X)
     * .resultPath("$.message")
     * .build();
     * SnsPublish publishMessage = SnsPublish.Builder.create(this, "Publish message")
     * .topic(new Topic(this, "cool-topic"))
     * .message(TaskInput.fromJsonPathAt("$.message"))
     * .resultPath("$.sns")
     * .build();
     * Wait wait = Wait.Builder.create(this, "Wait")
     * .time(WaitTime.secondsPath("$.waitSeconds"))
     * .build();
     * StateMachine.Builder.create(this, "StateMachine")
     * .definition(convertToSeconds.next(createMessage).next(publishMessage).next(wait))
     * .build();
     * ```
     */
    public inline fun snsPublishProps(block: SnsPublishPropsDsl.() -> Unit = {}): SnsPublishProps {
        val builder = SnsPublishPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The information about job driver for Spark submit.
     *
     * Example:
     * ```
     * EmrContainersStartJobRun.Builder.create(this, "EMR Containers Start Job Run")
     * .virtualCluster(VirtualClusterInput.fromVirtualClusterId("de92jdei2910fwedz"))
     * .releaseLabel(ReleaseLabel.EMR_6_2_0)
     * .jobName("EMR-Containers-Job")
     * .jobDriver(JobDriver.builder()
     * .sparkSubmitJobDriver(SparkSubmitJobDriver.builder()
     * .entryPoint(TaskInput.fromText("local:///usr/lib/spark/examples/src/main/python/pi.py"))
     * .build())
     * .build())
     * .applicationConfig(List.of(ApplicationConfiguration.builder()
     * .classification(Classification.SPARK_DEFAULTS)
     * .properties(Map.of(
     * "spark.executor.instances", "1",
     * "spark.executor.memory", "512M"))
     * .build()))
     * .build();
     * ```
     */
    public inline fun sparkSubmitJobDriver(
        block: SparkSubmitJobDriverDsl.() -> Unit = {}
    ): SparkSubmitJobDriver {
        val builder = SparkSubmitJobDriverDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A StepFunctions Task to send messages to SQS queue.
     *
     * Example:
     * ```
     * Queue queue = new Queue(this, "Queue");
     * // Use a field from the execution data as message.
     * SqsSendMessage task1 = SqsSendMessage.Builder.create(this, "Send1")
     * .queue(queue)
     * .messageBody(TaskInput.fromJsonPathAt("$.message"))
     * .build();
     * // Combine a field from the execution data with
     * // a literal object.
     * SqsSendMessage task2 = SqsSendMessage.Builder.create(this, "Send2")
     * .queue(queue)
     * .messageBody(TaskInput.fromObject(Map.of(
     * "field1", "somedata",
     * "field2", JsonPath.stringAt("$.field2"))))
     * .build();
     * ```
     */
    public inline fun sqsSendMessage(
        scope: Construct,
        id: String,
        block: SqsSendMessageDsl.() -> Unit = {},
    ): SqsSendMessage {
        val builder = SqsSendMessageDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for sending a message to an SQS queue.
     *
     * Example:
     * ```
     * Queue queue = new Queue(this, "Queue");
     * // Use a field from the execution data as message.
     * SqsSendMessage task1 = SqsSendMessage.Builder.create(this, "Send1")
     * .queue(queue)
     * .messageBody(TaskInput.fromJsonPathAt("$.message"))
     * .build();
     * // Combine a field from the execution data with
     * // a literal object.
     * SqsSendMessage task2 = SqsSendMessage.Builder.create(this, "Send2")
     * .queue(queue)
     * .messageBody(TaskInput.fromObject(Map.of(
     * "field1", "somedata",
     * "field2", JsonPath.stringAt("$.field2"))))
     * .build();
     * ```
     */
    public inline fun sqsSendMessageProps(
        block: SqsSendMessagePropsDsl.() -> Unit = {}
    ): SqsSendMessageProps {
        val builder = SqsSendMessagePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A Step Functions Task to invoke an Activity worker.
     *
     * An Activity can be used directly as a Resource.
     *
     * Example:
     * ```
     * Activity submitJobActivity = new Activity(this, "SubmitJob");
     * StepFunctionsInvokeActivity.Builder.create(this, "Submit Job")
     * .activity(submitJobActivity)
     * .build();
     * ```
     */
    public inline fun stepFunctionsInvokeActivity(
        scope: Construct,
        id: String,
        block: StepFunctionsInvokeActivityDsl.() -> Unit = {},
    ): StepFunctionsInvokeActivity {
        val builder = StepFunctionsInvokeActivityDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for invoking an Activity worker.
     *
     * Example:
     * ```
     * Activity submitJobActivity = new Activity(this, "SubmitJob");
     * StepFunctionsInvokeActivity.Builder.create(this, "Submit Job")
     * .activity(submitJobActivity)
     * .build();
     * ```
     */
    public inline fun stepFunctionsInvokeActivityProps(
        block: StepFunctionsInvokeActivityPropsDsl.() -> Unit = {}
    ): StepFunctionsInvokeActivityProps {
        val builder = StepFunctionsInvokeActivityPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A Step Functions Task to call StartExecution on another state machine.
     *
     * It supports three service integration patterns: REQUEST_RESPONSE, RUN_JOB, and
     * WAIT_FOR_TASK_TOKEN.
     *
     * Example:
     * ```
     * // Define a state machine with one Pass state
     * StateMachine child = StateMachine.Builder.create(this, "ChildStateMachine")
     * .definition(Chain.start(new Pass(this, "PassState")))
     * .build();
     * // Include the state machine in a Task state with callback pattern
     * StepFunctionsStartExecution task = StepFunctionsStartExecution.Builder.create(this,
     * "ChildTask")
     * .stateMachine(child)
     * .integrationPattern(IntegrationPattern.WAIT_FOR_TASK_TOKEN)
     * .input(TaskInput.fromObject(Map.of(
     * "token", JsonPath.getTaskToken(),
     * "foo", "bar")))
     * .name("MyExecutionName")
     * .build();
     * // Define a second state machine with the Task state above
     * // Define a second state machine with the Task state above
     * StateMachine.Builder.create(this, "ParentStateMachine")
     * .definition(task)
     * .build();
     * ```
     */
    public inline fun stepFunctionsStartExecution(
        scope: Construct,
        id: String,
        block: StepFunctionsStartExecutionDsl.() -> Unit = {},
    ): StepFunctionsStartExecution {
        val builder = StepFunctionsStartExecutionDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for StartExecution.
     *
     * Example:
     * ```
     * // Define a state machine with one Pass state
     * StateMachine child = StateMachine.Builder.create(this, "ChildStateMachine")
     * .definition(Chain.start(new Pass(this, "PassState")))
     * .build();
     * // Include the state machine in a Task state with callback pattern
     * StepFunctionsStartExecution task = StepFunctionsStartExecution.Builder.create(this,
     * "ChildTask")
     * .stateMachine(child)
     * .integrationPattern(IntegrationPattern.WAIT_FOR_TASK_TOKEN)
     * .input(TaskInput.fromObject(Map.of(
     * "token", JsonPath.getTaskToken(),
     * "foo", "bar")))
     * .name("MyExecutionName")
     * .build();
     * // Define a second state machine with the Task state above
     * // Define a second state machine with the Task state above
     * StateMachine.Builder.create(this, "ParentStateMachine")
     * .definition(task)
     * .build();
     * ```
     */
    public inline fun stepFunctionsStartExecutionProps(
        block: StepFunctionsStartExecutionPropsDsl.() -> Unit = {}
    ): StepFunctionsStartExecutionProps {
        val builder = StepFunctionsStartExecutionPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies a limit to how long a model training job can run.
     *
     * When the job reaches the time limit, Amazon SageMaker ends the training job.
     *
     * Example:
     * ```
     * SageMakerCreateTrainingJob.Builder.create(this, "TrainSagemaker")
     * .trainingJobName(JsonPath.stringAt("$.JobName"))
     * .algorithmSpecification(AlgorithmSpecification.builder()
     * .algorithmName("BlazingText")
     * .trainingInputMode(InputMode.FILE)
     * .build())
     * .inputDataConfig(List.of(Channel.builder()
     * .channelName("train")
     * .dataSource(DataSource.builder()
     * .s3DataSource(S3DataSource.builder()
     * .s3DataType(S3DataType.S3_PREFIX)
     * .s3Location(S3Location.fromJsonExpression("$.S3Bucket"))
     * .build())
     * .build())
     * .build()))
     * .outputDataConfig(OutputDataConfig.builder()
     * .s3OutputLocation(S3Location.fromBucket(Bucket.fromBucketName(this, "Bucket", "mybucket"),
     * "myoutputpath"))
     * .build())
     * .resourceConfig(ResourceConfig.builder()
     * .instanceCount(1)
     * .instanceType(new InstanceType(JsonPath.stringAt("$.InstanceType")))
     * .volumeSize(Size.gibibytes(50))
     * .build()) // optional: default is 1 instance of EC2 `M4.XLarge` with `10GB` volume
     * .stoppingCondition(StoppingCondition.builder()
     * .maxRuntime(Duration.hours(2))
     * .build())
     * .build();
     * ```
     */
    public inline fun stoppingCondition(
        block: StoppingConditionDsl.() -> Unit = {}
    ): StoppingCondition {
        val builder = StoppingConditionDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * An environment variable to be set in the container run as a task.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.stepfunctions.tasks.*;
     * TaskEnvironmentVariable taskEnvironmentVariable = TaskEnvironmentVariable.builder()
     * .name("name")
     * .value("value")
     * .build();
     * ```
     */
    public inline fun taskEnvironmentVariable(
        block: TaskEnvironmentVariableDsl.() -> Unit = {}
    ): TaskEnvironmentVariable {
        val builder = TaskEnvironmentVariableDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * S3 location of the input data that the model can consume.
     *
     * Example:
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
    public inline fun transformDataSource(
        block: TransformDataSourceDsl.() -> Unit = {}
    ): TransformDataSource {
        val builder = TransformDataSourceDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Dataset to be transformed and the Amazon S3 location where it is stored.
     *
     * Example:
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
    public inline fun transformInput(block: TransformInputDsl.() -> Unit = {}): TransformInput {
        val builder = TransformInputDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * S3 location where you want Amazon SageMaker to save the results from the transform job.
     *
     * Example:
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
    public inline fun transformOutput(block: TransformOutputDsl.() -> Unit = {}): TransformOutput {
        val builder = TransformOutputDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * ML compute instances for the transform job.
     *
     * Example:
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
    public inline fun transformResources(
        block: TransformResourcesDsl.() -> Unit = {}
    ): TransformResources {
        val builder = TransformResourcesDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Location of the channel data.
     *
     * Example:
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
    public inline fun transformS3DataSource(
        block: TransformS3DataSourceDsl.() -> Unit = {}
    ): TransformS3DataSource {
        val builder = TransformS3DataSourceDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies the VPC that you want your Amazon SageMaker training job to connect to.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * import software.amazon.awscdk.services.stepfunctions.tasks.*;
     * Subnet subnet;
     * SubnetFilter subnetFilter;
     * Vpc vpc;
     * VpcConfig vpcConfig = VpcConfig.builder()
     * .vpc(vpc)
     * // the properties below are optional
     * .subnets(SubnetSelection.builder()
     * .availabilityZones(List.of("availabilityZones"))
     * .onePerAz(false)
     * .subnetFilters(List.of(subnetFilter))
     * .subnetGroupName("subnetGroupName")
     * .subnets(List.of(subnet))
     * .subnetType(SubnetType.PRIVATE_ISOLATED)
     * .build())
     * .build();
     * ```
     */
    public inline fun vpcConfig(block: VpcConfigDsl.() -> Unit = {}): VpcConfig {
        val builder = VpcConfigDsl()
        builder.apply(block)
        return builder.build()
    }
}
