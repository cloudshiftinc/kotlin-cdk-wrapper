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

package cloudshift.awscdk.dsl.services.pipes

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.pipes.CfnPipe
import software.amazon.awscdk.services.pipes.CfnPipeProps
import software.constructs.Construct

public object pipes {
    /**
     * Create a pipe.
     *
     * Amazon EventBridge Pipes connect event sources to targets and reduces the need for
     * specialized knowledge and integration code.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.pipes.*;
     * CfnPipe cfnPipe = CfnPipe.Builder.create(this, "MyCfnPipe")
     * .roleArn("roleArn")
     * .source("source")
     * .target("target")
     * // the properties below are optional
     * .description("description")
     * .desiredState("desiredState")
     * .enrichment("enrichment")
     * .enrichmentParameters(PipeEnrichmentParametersProperty.builder()
     * .httpParameters(PipeEnrichmentHttpParametersProperty.builder()
     * .headerParameters(Map.of(
     * "headerParametersKey", "headerParameters"))
     * .pathParameterValues(List.of("pathParameterValues"))
     * .queryStringParameters(Map.of(
     * "queryStringParametersKey", "queryStringParameters"))
     * .build())
     * .inputTemplate("inputTemplate")
     * .build())
     * .name("name")
     * .sourceParameters(PipeSourceParametersProperty.builder()
     * .activeMqBrokerParameters(PipeSourceActiveMQBrokerParametersProperty.builder()
     * .credentials(MQBrokerAccessCredentialsProperty.builder()
     * .basicAuth("basicAuth")
     * .build())
     * .queueName("queueName")
     * // the properties below are optional
     * .batchSize(123)
     * .maximumBatchingWindowInSeconds(123)
     * .build())
     * .dynamoDbStreamParameters(PipeSourceDynamoDBStreamParametersProperty.builder()
     * .startingPosition("startingPosition")
     * // the properties below are optional
     * .batchSize(123)
     * .deadLetterConfig(DeadLetterConfigProperty.builder()
     * .arn("arn")
     * .build())
     * .maximumBatchingWindowInSeconds(123)
     * .maximumRecordAgeInSeconds(123)
     * .maximumRetryAttempts(123)
     * .onPartialBatchItemFailure("onPartialBatchItemFailure")
     * .parallelizationFactor(123)
     * .build())
     * .filterCriteria(FilterCriteriaProperty.builder()
     * .filters(List.of(FilterProperty.builder()
     * .pattern("pattern")
     * .build()))
     * .build())
     * .kinesisStreamParameters(PipeSourceKinesisStreamParametersProperty.builder()
     * .startingPosition("startingPosition")
     * // the properties below are optional
     * .batchSize(123)
     * .deadLetterConfig(DeadLetterConfigProperty.builder()
     * .arn("arn")
     * .build())
     * .maximumBatchingWindowInSeconds(123)
     * .maximumRecordAgeInSeconds(123)
     * .maximumRetryAttempts(123)
     * .onPartialBatchItemFailure("onPartialBatchItemFailure")
     * .parallelizationFactor(123)
     * .startingPositionTimestamp("startingPositionTimestamp")
     * .build())
     * .managedStreamingKafkaParameters(PipeSourceManagedStreamingKafkaParametersProperty.builder()
     * .topicName("topicName")
     * // the properties below are optional
     * .batchSize(123)
     * .consumerGroupId("consumerGroupId")
     * .credentials(MSKAccessCredentialsProperty.builder()
     * .clientCertificateTlsAuth("clientCertificateTlsAuth")
     * .saslScram512Auth("saslScram512Auth")
     * .build())
     * .maximumBatchingWindowInSeconds(123)
     * .startingPosition("startingPosition")
     * .build())
     * .rabbitMqBrokerParameters(PipeSourceRabbitMQBrokerParametersProperty.builder()
     * .credentials(MQBrokerAccessCredentialsProperty.builder()
     * .basicAuth("basicAuth")
     * .build())
     * .queueName("queueName")
     * // the properties below are optional
     * .batchSize(123)
     * .maximumBatchingWindowInSeconds(123)
     * .virtualHost("virtualHost")
     * .build())
     * .selfManagedKafkaParameters(PipeSourceSelfManagedKafkaParametersProperty.builder()
     * .topicName("topicName")
     * // the properties below are optional
     * .additionalBootstrapServers(List.of("additionalBootstrapServers"))
     * .batchSize(123)
     * .consumerGroupId("consumerGroupId")
     * .credentials(SelfManagedKafkaAccessConfigurationCredentialsProperty.builder()
     * .basicAuth("basicAuth")
     * .clientCertificateTlsAuth("clientCertificateTlsAuth")
     * .saslScram256Auth("saslScram256Auth")
     * .saslScram512Auth("saslScram512Auth")
     * .build())
     * .maximumBatchingWindowInSeconds(123)
     * .serverRootCaCertificate("serverRootCaCertificate")
     * .startingPosition("startingPosition")
     * .vpc(SelfManagedKafkaAccessConfigurationVpcProperty.builder()
     * .securityGroup(List.of("securityGroup"))
     * .subnets(List.of("subnets"))
     * .build())
     * .build())
     * .sqsQueueParameters(PipeSourceSqsQueueParametersProperty.builder()
     * .batchSize(123)
     * .maximumBatchingWindowInSeconds(123)
     * .build())
     * .build())
     * .tags(Map.of(
     * "tagsKey", "tags"))
     * .targetParameters(PipeTargetParametersProperty.builder()
     * .batchJobParameters(PipeTargetBatchJobParametersProperty.builder()
     * .jobDefinition("jobDefinition")
     * .jobName("jobName")
     * // the properties below are optional
     * .arrayProperties(BatchArrayPropertiesProperty.builder()
     * .size(123)
     * .build())
     * .containerOverrides(BatchContainerOverridesProperty.builder()
     * .command(List.of("command"))
     * .environment(List.of(BatchEnvironmentVariableProperty.builder()
     * .name("name")
     * .value("value")
     * .build()))
     * .instanceType("instanceType")
     * .resourceRequirements(List.of(BatchResourceRequirementProperty.builder()
     * .type("type")
     * .value("value")
     * .build()))
     * .build())
     * .dependsOn(List.of(BatchJobDependencyProperty.builder()
     * .jobId("jobId")
     * .type("type")
     * .build()))
     * .parameters(Map.of(
     * "parametersKey", "parameters"))
     * .retryStrategy(BatchRetryStrategyProperty.builder()
     * .attempts(123)
     * .build())
     * .build())
     * .cloudWatchLogsParameters(PipeTargetCloudWatchLogsParametersProperty.builder()
     * .logStreamName("logStreamName")
     * .timestamp("timestamp")
     * .build())
     * .ecsTaskParameters(PipeTargetEcsTaskParametersProperty.builder()
     * .taskDefinitionArn("taskDefinitionArn")
     * // the properties below are optional
     * .capacityProviderStrategy(List.of(CapacityProviderStrategyItemProperty.builder()
     * .capacityProvider("capacityProvider")
     * // the properties below are optional
     * .base(123)
     * .weight(123)
     * .build()))
     * .enableEcsManagedTags(false)
     * .enableExecuteCommand(false)
     * .group("group")
     * .launchType("launchType")
     * .networkConfiguration(NetworkConfigurationProperty.builder()
     * .awsvpcConfiguration(AwsVpcConfigurationProperty.builder()
     * .subnets(List.of("subnets"))
     * // the properties below are optional
     * .assignPublicIp("assignPublicIp")
     * .securityGroups(List.of("securityGroups"))
     * .build())
     * .build())
     * .overrides(EcsTaskOverrideProperty.builder()
     * .containerOverrides(List.of(EcsContainerOverrideProperty.builder()
     * .command(List.of("command"))
     * .cpu(123)
     * .environment(List.of(EcsEnvironmentVariableProperty.builder()
     * .name("name")
     * .value("value")
     * .build()))
     * .environmentFiles(List.of(EcsEnvironmentFileProperty.builder()
     * .type("type")
     * .value("value")
     * .build()))
     * .memory(123)
     * .memoryReservation(123)
     * .name("name")
     * .resourceRequirements(List.of(EcsResourceRequirementProperty.builder()
     * .type("type")
     * .value("value")
     * .build()))
     * .build()))
     * .cpu("cpu")
     * .ephemeralStorage(EcsEphemeralStorageProperty.builder()
     * .sizeInGiB(123)
     * .build())
     * .executionRoleArn("executionRoleArn")
     * .inferenceAcceleratorOverrides(List.of(EcsInferenceAcceleratorOverrideProperty.builder()
     * .deviceName("deviceName")
     * .deviceType("deviceType")
     * .build()))
     * .memory("memory")
     * .taskRoleArn("taskRoleArn")
     * .build())
     * .placementConstraints(List.of(PlacementConstraintProperty.builder()
     * .expression("expression")
     * .type("type")
     * .build()))
     * .placementStrategy(List.of(PlacementStrategyProperty.builder()
     * .field("field")
     * .type("type")
     * .build()))
     * .platformVersion("platformVersion")
     * .propagateTags("propagateTags")
     * .referenceId("referenceId")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .taskCount(123)
     * .build())
     * .eventBridgeEventBusParameters(PipeTargetEventBridgeEventBusParametersProperty.builder()
     * .detailType("detailType")
     * .endpointId("endpointId")
     * .resources(List.of("resources"))
     * .source("source")
     * .time("time")
     * .build())
     * .httpParameters(PipeTargetHttpParametersProperty.builder()
     * .headerParameters(Map.of(
     * "headerParametersKey", "headerParameters"))
     * .pathParameterValues(List.of("pathParameterValues"))
     * .queryStringParameters(Map.of(
     * "queryStringParametersKey", "queryStringParameters"))
     * .build())
     * .inputTemplate("inputTemplate")
     * .kinesisStreamParameters(PipeTargetKinesisStreamParametersProperty.builder()
     * .partitionKey("partitionKey")
     * .build())
     * .lambdaFunctionParameters(PipeTargetLambdaFunctionParametersProperty.builder()
     * .invocationType("invocationType")
     * .build())
     * .redshiftDataParameters(PipeTargetRedshiftDataParametersProperty.builder()
     * .database("database")
     * .sqls(List.of("sqls"))
     * // the properties below are optional
     * .dbUser("dbUser")
     * .secretManagerArn("secretManagerArn")
     * .statementName("statementName")
     * .withEvent(false)
     * .build())
     * .sageMakerPipelineParameters(PipeTargetSageMakerPipelineParametersProperty.builder()
     * .pipelineParameterList(List.of(SageMakerPipelineParameterProperty.builder()
     * .name("name")
     * .value("value")
     * .build()))
     * .build())
     * .sqsQueueParameters(PipeTargetSqsQueueParametersProperty.builder()
     * .messageDeduplicationId("messageDeduplicationId")
     * .messageGroupId("messageGroupId")
     * .build())
     * .stepFunctionStateMachineParameters(PipeTargetStateMachineParametersProperty.builder()
     * .invocationType("invocationType")
     * .build())
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pipes-pipe.html)
     */
    public inline fun cfnPipe(
        scope: Construct,
        id: String,
        block: CfnPipeDsl.() -> Unit = {},
    ): CfnPipe {
        val builder = CfnPipeDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * This structure specifies the VPC subnets and security groups for the task, and whether a
     * public IP address is to be used.
     *
     * This structure is relevant only for ECS tasks that use the `awsvpc` network mode.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.pipes.*;
     * AwsVpcConfigurationProperty awsVpcConfigurationProperty = AwsVpcConfigurationProperty.builder()
     * .subnets(List.of("subnets"))
     * // the properties below are optional
     * .assignPublicIp("assignPublicIp")
     * .securityGroups(List.of("securityGroups"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-awsvpcconfiguration.html)
     */
    public inline fun cfnPipeAwsVpcConfigurationProperty(
        block: CfnPipeAwsVpcConfigurationPropertyDsl.() -> Unit = {}
    ): CfnPipe.AwsVpcConfigurationProperty {
        val builder = CfnPipeAwsVpcConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The array properties for the submitted job, such as the size of the array.
     *
     * The array size can be between 2 and 10,000. If you specify array properties for a job, it
     * becomes an array job. This parameter is used only if the target is an AWS Batch job.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.pipes.*;
     * BatchArrayPropertiesProperty batchArrayPropertiesProperty =
     * BatchArrayPropertiesProperty.builder()
     * .size(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-batcharrayproperties.html)
     */
    public inline fun cfnPipeBatchArrayPropertiesProperty(
        block: CfnPipeBatchArrayPropertiesPropertyDsl.() -> Unit = {}
    ): CfnPipe.BatchArrayPropertiesProperty {
        val builder = CfnPipeBatchArrayPropertiesPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The overrides that are sent to a container.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.pipes.*;
     * BatchContainerOverridesProperty batchContainerOverridesProperty =
     * BatchContainerOverridesProperty.builder()
     * .command(List.of("command"))
     * .environment(List.of(BatchEnvironmentVariableProperty.builder()
     * .name("name")
     * .value("value")
     * .build()))
     * .instanceType("instanceType")
     * .resourceRequirements(List.of(BatchResourceRequirementProperty.builder()
     * .type("type")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-batchcontaineroverrides.html)
     */
    public inline fun cfnPipeBatchContainerOverridesProperty(
        block: CfnPipeBatchContainerOverridesPropertyDsl.() -> Unit = {}
    ): CfnPipe.BatchContainerOverridesProperty {
        val builder = CfnPipeBatchContainerOverridesPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The environment variables to send to the container.
     *
     * You can add new environment variables, which are added to the container at launch, or you can
     * override the existing environment variables from the Docker image or the task definition.
     *
     * Environment variables cannot start with " `AWS Batch` ". This naming convention is reserved
     * for variables that AWS Batch sets.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.pipes.*;
     * BatchEnvironmentVariableProperty batchEnvironmentVariableProperty =
     * BatchEnvironmentVariableProperty.builder()
     * .name("name")
     * .value("value")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-batchenvironmentvariable.html)
     */
    public inline fun cfnPipeBatchEnvironmentVariableProperty(
        block: CfnPipeBatchEnvironmentVariablePropertyDsl.() -> Unit = {}
    ): CfnPipe.BatchEnvironmentVariableProperty {
        val builder = CfnPipeBatchEnvironmentVariablePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * An object that represents an AWS Batch job dependency.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.pipes.*;
     * BatchJobDependencyProperty batchJobDependencyProperty = BatchJobDependencyProperty.builder()
     * .jobId("jobId")
     * .type("type")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-batchjobdependency.html)
     */
    public inline fun cfnPipeBatchJobDependencyProperty(
        block: CfnPipeBatchJobDependencyPropertyDsl.() -> Unit = {}
    ): CfnPipe.BatchJobDependencyProperty {
        val builder = CfnPipeBatchJobDependencyPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The type and amount of a resource to assign to a container.
     *
     * The supported resources include `GPU` , `MEMORY` , and `VCPU` .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.pipes.*;
     * BatchResourceRequirementProperty batchResourceRequirementProperty =
     * BatchResourceRequirementProperty.builder()
     * .type("type")
     * .value("value")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-batchresourcerequirement.html)
     */
    public inline fun cfnPipeBatchResourceRequirementProperty(
        block: CfnPipeBatchResourceRequirementPropertyDsl.() -> Unit = {}
    ): CfnPipe.BatchResourceRequirementProperty {
        val builder = CfnPipeBatchResourceRequirementPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The retry strategy that's associated with a job.
     *
     * For more information, see
     * [Automated job retries](https://docs.aws.amazon.com/batch/latest/userguide/job_retries.html)
     * in the *AWS Batch User Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.pipes.*;
     * BatchRetryStrategyProperty batchRetryStrategyProperty = BatchRetryStrategyProperty.builder()
     * .attempts(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-batchretrystrategy.html)
     */
    public inline fun cfnPipeBatchRetryStrategyProperty(
        block: CfnPipeBatchRetryStrategyPropertyDsl.() -> Unit = {}
    ): CfnPipe.BatchRetryStrategyProperty {
        val builder = CfnPipeBatchRetryStrategyPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The details of a capacity provider strategy.
     *
     * To learn more, see
     * [CapacityProviderStrategyItem](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_CapacityProviderStrategyItem.html)
     * in the Amazon ECS API Reference.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.pipes.*;
     * CapacityProviderStrategyItemProperty capacityProviderStrategyItemProperty =
     * CapacityProviderStrategyItemProperty.builder()
     * .capacityProvider("capacityProvider")
     * // the properties below are optional
     * .base(123)
     * .weight(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-capacityproviderstrategyitem.html)
     */
    public inline fun cfnPipeCapacityProviderStrategyItemProperty(
        block: CfnPipeCapacityProviderStrategyItemPropertyDsl.() -> Unit = {}
    ): CfnPipe.CapacityProviderStrategyItemProperty {
        val builder = CfnPipeCapacityProviderStrategyItemPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A `DeadLetterConfig` object that contains information about a dead-letter queue
     * configuration.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.pipes.*;
     * DeadLetterConfigProperty deadLetterConfigProperty = DeadLetterConfigProperty.builder()
     * .arn("arn")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-deadletterconfig.html)
     */
    public inline fun cfnPipeDeadLetterConfigProperty(
        block: CfnPipeDeadLetterConfigPropertyDsl.() -> Unit = {}
    ): CfnPipe.DeadLetterConfigProperty {
        val builder = CfnPipeDeadLetterConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The overrides that are sent to a container.
     *
     * An empty container override can be passed in. An example of an empty container override is
     * `{"containerOverrides": [ ] }` . If a non-empty container override is specified, the `name`
     * parameter must be included.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.pipes.*;
     * EcsContainerOverrideProperty ecsContainerOverrideProperty =
     * EcsContainerOverrideProperty.builder()
     * .command(List.of("command"))
     * .cpu(123)
     * .environment(List.of(EcsEnvironmentVariableProperty.builder()
     * .name("name")
     * .value("value")
     * .build()))
     * .environmentFiles(List.of(EcsEnvironmentFileProperty.builder()
     * .type("type")
     * .value("value")
     * .build()))
     * .memory(123)
     * .memoryReservation(123)
     * .name("name")
     * .resourceRequirements(List.of(EcsResourceRequirementProperty.builder()
     * .type("type")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-ecscontaineroverride.html)
     */
    public inline fun cfnPipeEcsContainerOverrideProperty(
        block: CfnPipeEcsContainerOverridePropertyDsl.() -> Unit = {}
    ): CfnPipe.EcsContainerOverrideProperty {
        val builder = CfnPipeEcsContainerOverridePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A list of files containing the environment variables to pass to a container.
     *
     * You can specify up to ten environment files. The file must have a `.env` file extension. Each
     * line in an environment file should contain an environment variable in `VARIABLE=VALUE`
     * format. Lines beginning with `#` are treated as comments and are ignored. For more
     * information about the environment variable file syntax, see
     * [Declare default environment variables in file](https://docs.aws.amazon.com/https://docs.docker.com/compose/env-file/)
     * .
     *
     * If there are environment variables specified using the `environment` parameter in a container
     * definition, they take precedence over the variables contained within an environment file. If
     * multiple environment files are specified that contain the same variable, they're processed
     * from the top down. We recommend that you use unique variable names. For more information, see
     * [Specifying environment variables](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/taskdef-envfiles.html)
     * in the *Amazon Elastic Container Service Developer Guide* .
     *
     * This parameter is only supported for tasks hosted on Fargate using the following platform
     * versions:
     * * Linux platform version `1.4.0` or later.
     * * Windows platform version `1.0.0` or later.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.pipes.*;
     * EcsEnvironmentFileProperty ecsEnvironmentFileProperty = EcsEnvironmentFileProperty.builder()
     * .type("type")
     * .value("value")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-ecsenvironmentfile.html)
     */
    public inline fun cfnPipeEcsEnvironmentFileProperty(
        block: CfnPipeEcsEnvironmentFilePropertyDsl.() -> Unit = {}
    ): CfnPipe.EcsEnvironmentFileProperty {
        val builder = CfnPipeEcsEnvironmentFilePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The environment variables to send to the container.
     *
     * You can add new environment variables, which are added to the container at launch, or you can
     * override the existing environment variables from the Docker image or the task definition. You
     * must also specify a container name.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.pipes.*;
     * EcsEnvironmentVariableProperty ecsEnvironmentVariableProperty =
     * EcsEnvironmentVariableProperty.builder()
     * .name("name")
     * .value("value")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-ecsenvironmentvariable.html)
     */
    public inline fun cfnPipeEcsEnvironmentVariableProperty(
        block: CfnPipeEcsEnvironmentVariablePropertyDsl.() -> Unit = {}
    ): CfnPipe.EcsEnvironmentVariableProperty {
        val builder = CfnPipeEcsEnvironmentVariablePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The amount of ephemeral storage to allocate for the task.
     *
     * This parameter is used to expand the total amount of ephemeral storage available, beyond the
     * default amount, for tasks hosted on Fargate . For more information, see
     * [Fargate task storage](https://docs.aws.amazon.com/AmazonECS/latest/userguide/using_data_volumes.html)
     * in the *Amazon ECS User Guide for Fargate* .
     *
     * This parameter is only supported for tasks hosted on Fargate using Linux platform version
     * `1.4.0` or later. This parameter is not supported for Windows containers on Fargate .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.pipes.*;
     * EcsEphemeralStorageProperty ecsEphemeralStorageProperty = EcsEphemeralStorageProperty.builder()
     * .sizeInGiB(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-ecsephemeralstorage.html)
     */
    public inline fun cfnPipeEcsEphemeralStorageProperty(
        block: CfnPipeEcsEphemeralStoragePropertyDsl.() -> Unit = {}
    ): CfnPipe.EcsEphemeralStorageProperty {
        val builder = CfnPipeEcsEphemeralStoragePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Details on an Elastic Inference accelerator task override.
     *
     * This parameter is used to override the Elastic Inference accelerator specified in the task
     * definition. For more information, see
     * [Working with Amazon Elastic Inference on Amazon ECS](https://docs.aws.amazon.com/AmazonECS/latest/userguide/ecs-inference.html)
     * in the *Amazon Elastic Container Service Developer Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.pipes.*;
     * EcsInferenceAcceleratorOverrideProperty ecsInferenceAcceleratorOverrideProperty =
     * EcsInferenceAcceleratorOverrideProperty.builder()
     * .deviceName("deviceName")
     * .deviceType("deviceType")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-ecsinferenceacceleratoroverride.html)
     */
    public inline fun cfnPipeEcsInferenceAcceleratorOverrideProperty(
        block: CfnPipeEcsInferenceAcceleratorOverridePropertyDsl.() -> Unit = {}
    ): CfnPipe.EcsInferenceAcceleratorOverrideProperty {
        val builder = CfnPipeEcsInferenceAcceleratorOverridePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The type and amount of a resource to assign to a container.
     *
     * The supported resource types are GPUs and Elastic Inference accelerators. For more
     * information, see
     * [Working with GPUs on Amazon ECS](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-gpu.html)
     * or
     * [Working with Amazon Elastic Inference on Amazon ECS](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-inference.html)
     * in the *Amazon Elastic Container Service Developer Guide*
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.pipes.*;
     * EcsResourceRequirementProperty ecsResourceRequirementProperty =
     * EcsResourceRequirementProperty.builder()
     * .type("type")
     * .value("value")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-ecsresourcerequirement.html)
     */
    public inline fun cfnPipeEcsResourceRequirementProperty(
        block: CfnPipeEcsResourceRequirementPropertyDsl.() -> Unit = {}
    ): CfnPipe.EcsResourceRequirementProperty {
        val builder = CfnPipeEcsResourceRequirementPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The overrides that are associated with a task.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.pipes.*;
     * EcsTaskOverrideProperty ecsTaskOverrideProperty = EcsTaskOverrideProperty.builder()
     * .containerOverrides(List.of(EcsContainerOverrideProperty.builder()
     * .command(List.of("command"))
     * .cpu(123)
     * .environment(List.of(EcsEnvironmentVariableProperty.builder()
     * .name("name")
     * .value("value")
     * .build()))
     * .environmentFiles(List.of(EcsEnvironmentFileProperty.builder()
     * .type("type")
     * .value("value")
     * .build()))
     * .memory(123)
     * .memoryReservation(123)
     * .name("name")
     * .resourceRequirements(List.of(EcsResourceRequirementProperty.builder()
     * .type("type")
     * .value("value")
     * .build()))
     * .build()))
     * .cpu("cpu")
     * .ephemeralStorage(EcsEphemeralStorageProperty.builder()
     * .sizeInGiB(123)
     * .build())
     * .executionRoleArn("executionRoleArn")
     * .inferenceAcceleratorOverrides(List.of(EcsInferenceAcceleratorOverrideProperty.builder()
     * .deviceName("deviceName")
     * .deviceType("deviceType")
     * .build()))
     * .memory("memory")
     * .taskRoleArn("taskRoleArn")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-ecstaskoverride.html)
     */
    public inline fun cfnPipeEcsTaskOverrideProperty(
        block: CfnPipeEcsTaskOverridePropertyDsl.() -> Unit = {}
    ): CfnPipe.EcsTaskOverrideProperty {
        val builder = CfnPipeEcsTaskOverridePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The collection of event patterns used to filter events.
     *
     * To remove a filter, specify a `FilterCriteria` object with an empty array of `Filter`
     * objects.
     *
     * For more information, see
     * [Events and Event Patterns](https://docs.aws.amazon.com/eventbridge/latest/userguide/eventbridge-and-event-patterns.html)
     * in the *Amazon EventBridge User Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.pipes.*;
     * FilterCriteriaProperty filterCriteriaProperty = FilterCriteriaProperty.builder()
     * .filters(List.of(FilterProperty.builder()
     * .pattern("pattern")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-filtercriteria.html)
     */
    public inline fun cfnPipeFilterCriteriaProperty(
        block: CfnPipeFilterCriteriaPropertyDsl.() -> Unit = {}
    ): CfnPipe.FilterCriteriaProperty {
        val builder = CfnPipeFilterCriteriaPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Filter events using an event pattern.
     *
     * For more information, see
     * [Events and Event Patterns](https://docs.aws.amazon.com/eventbridge/latest/userguide/eventbridge-and-event-patterns.html)
     * in the *Amazon EventBridge User Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.pipes.*;
     * FilterProperty filterProperty = FilterProperty.builder()
     * .pattern("pattern")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-filter.html)
     */
    public inline fun cfnPipeFilterProperty(
        block: CfnPipeFilterPropertyDsl.() -> Unit = {}
    ): CfnPipe.FilterProperty {
        val builder = CfnPipeFilterPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The AWS Secrets Manager secret that stores your broker credentials.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.pipes.*;
     * MQBrokerAccessCredentialsProperty mQBrokerAccessCredentialsProperty =
     * MQBrokerAccessCredentialsProperty.builder()
     * .basicAuth("basicAuth")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-mqbrokeraccesscredentials.html)
     */
    public inline fun cfnPipeMQBrokerAccessCredentialsProperty(
        block: CfnPipeMQBrokerAccessCredentialsPropertyDsl.() -> Unit = {}
    ): CfnPipe.MQBrokerAccessCredentialsProperty {
        val builder = CfnPipeMQBrokerAccessCredentialsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The AWS Secrets Manager secret that stores your stream credentials.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.pipes.*;
     * MSKAccessCredentialsProperty mSKAccessCredentialsProperty =
     * MSKAccessCredentialsProperty.builder()
     * .clientCertificateTlsAuth("clientCertificateTlsAuth")
     * .saslScram512Auth("saslScram512Auth")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-mskaccesscredentials.html)
     */
    public inline fun cfnPipeMSKAccessCredentialsProperty(
        block: CfnPipeMSKAccessCredentialsPropertyDsl.() -> Unit = {}
    ): CfnPipe.MSKAccessCredentialsProperty {
        val builder = CfnPipeMSKAccessCredentialsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * This structure specifies the network configuration for an Amazon ECS task.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.pipes.*;
     * NetworkConfigurationProperty networkConfigurationProperty =
     * NetworkConfigurationProperty.builder()
     * .awsvpcConfiguration(AwsVpcConfigurationProperty.builder()
     * .subnets(List.of("subnets"))
     * // the properties below are optional
     * .assignPublicIp("assignPublicIp")
     * .securityGroups(List.of("securityGroups"))
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-networkconfiguration.html)
     */
    public inline fun cfnPipeNetworkConfigurationProperty(
        block: CfnPipeNetworkConfigurationPropertyDsl.() -> Unit = {}
    ): CfnPipe.NetworkConfigurationProperty {
        val builder = CfnPipeNetworkConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * These are custom parameter to be used when the target is an API Gateway REST APIs or
     * EventBridge ApiDestinations.
     *
     * In the latter case, these are merged with any InvocationParameters specified on the
     * Connection, with any values from the Connection taking precedence.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.pipes.*;
     * PipeEnrichmentHttpParametersProperty pipeEnrichmentHttpParametersProperty =
     * PipeEnrichmentHttpParametersProperty.builder()
     * .headerParameters(Map.of(
     * "headerParametersKey", "headerParameters"))
     * .pathParameterValues(List.of("pathParameterValues"))
     * .queryStringParameters(Map.of(
     * "queryStringParametersKey", "queryStringParameters"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipeenrichmenthttpparameters.html)
     */
    public inline fun cfnPipePipeEnrichmentHttpParametersProperty(
        block: CfnPipePipeEnrichmentHttpParametersPropertyDsl.() -> Unit = {}
    ): CfnPipe.PipeEnrichmentHttpParametersProperty {
        val builder = CfnPipePipeEnrichmentHttpParametersPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The parameters required to set up enrichment on your pipe.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.pipes.*;
     * PipeEnrichmentParametersProperty pipeEnrichmentParametersProperty =
     * PipeEnrichmentParametersProperty.builder()
     * .httpParameters(PipeEnrichmentHttpParametersProperty.builder()
     * .headerParameters(Map.of(
     * "headerParametersKey", "headerParameters"))
     * .pathParameterValues(List.of("pathParameterValues"))
     * .queryStringParameters(Map.of(
     * "queryStringParametersKey", "queryStringParameters"))
     * .build())
     * .inputTemplate("inputTemplate")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipeenrichmentparameters.html)
     */
    public inline fun cfnPipePipeEnrichmentParametersProperty(
        block: CfnPipePipeEnrichmentParametersPropertyDsl.() -> Unit = {}
    ): CfnPipe.PipeEnrichmentParametersProperty {
        val builder = CfnPipePipeEnrichmentParametersPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The parameters for using an Active MQ broker as a source.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.pipes.*;
     * PipeSourceActiveMQBrokerParametersProperty pipeSourceActiveMQBrokerParametersProperty =
     * PipeSourceActiveMQBrokerParametersProperty.builder()
     * .credentials(MQBrokerAccessCredentialsProperty.builder()
     * .basicAuth("basicAuth")
     * .build())
     * .queueName("queueName")
     * // the properties below are optional
     * .batchSize(123)
     * .maximumBatchingWindowInSeconds(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipesourceactivemqbrokerparameters.html)
     */
    public inline fun cfnPipePipeSourceActiveMQBrokerParametersProperty(
        block: CfnPipePipeSourceActiveMQBrokerParametersPropertyDsl.() -> Unit = {}
    ): CfnPipe.PipeSourceActiveMQBrokerParametersProperty {
        val builder = CfnPipePipeSourceActiveMQBrokerParametersPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The parameters for using a DynamoDB stream as a source.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.pipes.*;
     * PipeSourceDynamoDBStreamParametersProperty pipeSourceDynamoDBStreamParametersProperty =
     * PipeSourceDynamoDBStreamParametersProperty.builder()
     * .startingPosition("startingPosition")
     * // the properties below are optional
     * .batchSize(123)
     * .deadLetterConfig(DeadLetterConfigProperty.builder()
     * .arn("arn")
     * .build())
     * .maximumBatchingWindowInSeconds(123)
     * .maximumRecordAgeInSeconds(123)
     * .maximumRetryAttempts(123)
     * .onPartialBatchItemFailure("onPartialBatchItemFailure")
     * .parallelizationFactor(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipesourcedynamodbstreamparameters.html)
     */
    public inline fun cfnPipePipeSourceDynamoDBStreamParametersProperty(
        block: CfnPipePipeSourceDynamoDBStreamParametersPropertyDsl.() -> Unit = {}
    ): CfnPipe.PipeSourceDynamoDBStreamParametersProperty {
        val builder = CfnPipePipeSourceDynamoDBStreamParametersPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The parameters for using a Kinesis stream as a source.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.pipes.*;
     * PipeSourceKinesisStreamParametersProperty pipeSourceKinesisStreamParametersProperty =
     * PipeSourceKinesisStreamParametersProperty.builder()
     * .startingPosition("startingPosition")
     * // the properties below are optional
     * .batchSize(123)
     * .deadLetterConfig(DeadLetterConfigProperty.builder()
     * .arn("arn")
     * .build())
     * .maximumBatchingWindowInSeconds(123)
     * .maximumRecordAgeInSeconds(123)
     * .maximumRetryAttempts(123)
     * .onPartialBatchItemFailure("onPartialBatchItemFailure")
     * .parallelizationFactor(123)
     * .startingPositionTimestamp("startingPositionTimestamp")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipesourcekinesisstreamparameters.html)
     */
    public inline fun cfnPipePipeSourceKinesisStreamParametersProperty(
        block: CfnPipePipeSourceKinesisStreamParametersPropertyDsl.() -> Unit = {}
    ): CfnPipe.PipeSourceKinesisStreamParametersProperty {
        val builder = CfnPipePipeSourceKinesisStreamParametersPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The parameters for using an MSK stream as a source.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.pipes.*;
     * PipeSourceManagedStreamingKafkaParametersProperty
     * pipeSourceManagedStreamingKafkaParametersProperty =
     * PipeSourceManagedStreamingKafkaParametersProperty.builder()
     * .topicName("topicName")
     * // the properties below are optional
     * .batchSize(123)
     * .consumerGroupId("consumerGroupId")
     * .credentials(MSKAccessCredentialsProperty.builder()
     * .clientCertificateTlsAuth("clientCertificateTlsAuth")
     * .saslScram512Auth("saslScram512Auth")
     * .build())
     * .maximumBatchingWindowInSeconds(123)
     * .startingPosition("startingPosition")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipesourcemanagedstreamingkafkaparameters.html)
     */
    public inline fun cfnPipePipeSourceManagedStreamingKafkaParametersProperty(
        block: CfnPipePipeSourceManagedStreamingKafkaParametersPropertyDsl.() -> Unit = {}
    ): CfnPipe.PipeSourceManagedStreamingKafkaParametersProperty {
        val builder = CfnPipePipeSourceManagedStreamingKafkaParametersPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The parameters required to set up a source for your pipe.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.pipes.*;
     * PipeSourceParametersProperty pipeSourceParametersProperty =
     * PipeSourceParametersProperty.builder()
     * .activeMqBrokerParameters(PipeSourceActiveMQBrokerParametersProperty.builder()
     * .credentials(MQBrokerAccessCredentialsProperty.builder()
     * .basicAuth("basicAuth")
     * .build())
     * .queueName("queueName")
     * // the properties below are optional
     * .batchSize(123)
     * .maximumBatchingWindowInSeconds(123)
     * .build())
     * .dynamoDbStreamParameters(PipeSourceDynamoDBStreamParametersProperty.builder()
     * .startingPosition("startingPosition")
     * // the properties below are optional
     * .batchSize(123)
     * .deadLetterConfig(DeadLetterConfigProperty.builder()
     * .arn("arn")
     * .build())
     * .maximumBatchingWindowInSeconds(123)
     * .maximumRecordAgeInSeconds(123)
     * .maximumRetryAttempts(123)
     * .onPartialBatchItemFailure("onPartialBatchItemFailure")
     * .parallelizationFactor(123)
     * .build())
     * .filterCriteria(FilterCriteriaProperty.builder()
     * .filters(List.of(FilterProperty.builder()
     * .pattern("pattern")
     * .build()))
     * .build())
     * .kinesisStreamParameters(PipeSourceKinesisStreamParametersProperty.builder()
     * .startingPosition("startingPosition")
     * // the properties below are optional
     * .batchSize(123)
     * .deadLetterConfig(DeadLetterConfigProperty.builder()
     * .arn("arn")
     * .build())
     * .maximumBatchingWindowInSeconds(123)
     * .maximumRecordAgeInSeconds(123)
     * .maximumRetryAttempts(123)
     * .onPartialBatchItemFailure("onPartialBatchItemFailure")
     * .parallelizationFactor(123)
     * .startingPositionTimestamp("startingPositionTimestamp")
     * .build())
     * .managedStreamingKafkaParameters(PipeSourceManagedStreamingKafkaParametersProperty.builder()
     * .topicName("topicName")
     * // the properties below are optional
     * .batchSize(123)
     * .consumerGroupId("consumerGroupId")
     * .credentials(MSKAccessCredentialsProperty.builder()
     * .clientCertificateTlsAuth("clientCertificateTlsAuth")
     * .saslScram512Auth("saslScram512Auth")
     * .build())
     * .maximumBatchingWindowInSeconds(123)
     * .startingPosition("startingPosition")
     * .build())
     * .rabbitMqBrokerParameters(PipeSourceRabbitMQBrokerParametersProperty.builder()
     * .credentials(MQBrokerAccessCredentialsProperty.builder()
     * .basicAuth("basicAuth")
     * .build())
     * .queueName("queueName")
     * // the properties below are optional
     * .batchSize(123)
     * .maximumBatchingWindowInSeconds(123)
     * .virtualHost("virtualHost")
     * .build())
     * .selfManagedKafkaParameters(PipeSourceSelfManagedKafkaParametersProperty.builder()
     * .topicName("topicName")
     * // the properties below are optional
     * .additionalBootstrapServers(List.of("additionalBootstrapServers"))
     * .batchSize(123)
     * .consumerGroupId("consumerGroupId")
     * .credentials(SelfManagedKafkaAccessConfigurationCredentialsProperty.builder()
     * .basicAuth("basicAuth")
     * .clientCertificateTlsAuth("clientCertificateTlsAuth")
     * .saslScram256Auth("saslScram256Auth")
     * .saslScram512Auth("saslScram512Auth")
     * .build())
     * .maximumBatchingWindowInSeconds(123)
     * .serverRootCaCertificate("serverRootCaCertificate")
     * .startingPosition("startingPosition")
     * .vpc(SelfManagedKafkaAccessConfigurationVpcProperty.builder()
     * .securityGroup(List.of("securityGroup"))
     * .subnets(List.of("subnets"))
     * .build())
     * .build())
     * .sqsQueueParameters(PipeSourceSqsQueueParametersProperty.builder()
     * .batchSize(123)
     * .maximumBatchingWindowInSeconds(123)
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipesourceparameters.html)
     */
    public inline fun cfnPipePipeSourceParametersProperty(
        block: CfnPipePipeSourceParametersPropertyDsl.() -> Unit = {}
    ): CfnPipe.PipeSourceParametersProperty {
        val builder = CfnPipePipeSourceParametersPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The parameters for using a Rabbit MQ broker as a source.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.pipes.*;
     * PipeSourceRabbitMQBrokerParametersProperty pipeSourceRabbitMQBrokerParametersProperty =
     * PipeSourceRabbitMQBrokerParametersProperty.builder()
     * .credentials(MQBrokerAccessCredentialsProperty.builder()
     * .basicAuth("basicAuth")
     * .build())
     * .queueName("queueName")
     * // the properties below are optional
     * .batchSize(123)
     * .maximumBatchingWindowInSeconds(123)
     * .virtualHost("virtualHost")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipesourcerabbitmqbrokerparameters.html)
     */
    public inline fun cfnPipePipeSourceRabbitMQBrokerParametersProperty(
        block: CfnPipePipeSourceRabbitMQBrokerParametersPropertyDsl.() -> Unit = {}
    ): CfnPipe.PipeSourceRabbitMQBrokerParametersProperty {
        val builder = CfnPipePipeSourceRabbitMQBrokerParametersPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The parameters for using a self-managed Apache Kafka stream as a source.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.pipes.*;
     * PipeSourceSelfManagedKafkaParametersProperty pipeSourceSelfManagedKafkaParametersProperty =
     * PipeSourceSelfManagedKafkaParametersProperty.builder()
     * .topicName("topicName")
     * // the properties below are optional
     * .additionalBootstrapServers(List.of("additionalBootstrapServers"))
     * .batchSize(123)
     * .consumerGroupId("consumerGroupId")
     * .credentials(SelfManagedKafkaAccessConfigurationCredentialsProperty.builder()
     * .basicAuth("basicAuth")
     * .clientCertificateTlsAuth("clientCertificateTlsAuth")
     * .saslScram256Auth("saslScram256Auth")
     * .saslScram512Auth("saslScram512Auth")
     * .build())
     * .maximumBatchingWindowInSeconds(123)
     * .serverRootCaCertificate("serverRootCaCertificate")
     * .startingPosition("startingPosition")
     * .vpc(SelfManagedKafkaAccessConfigurationVpcProperty.builder()
     * .securityGroup(List.of("securityGroup"))
     * .subnets(List.of("subnets"))
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipesourceselfmanagedkafkaparameters.html)
     */
    public inline fun cfnPipePipeSourceSelfManagedKafkaParametersProperty(
        block: CfnPipePipeSourceSelfManagedKafkaParametersPropertyDsl.() -> Unit = {}
    ): CfnPipe.PipeSourceSelfManagedKafkaParametersProperty {
        val builder = CfnPipePipeSourceSelfManagedKafkaParametersPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The parameters for using a Amazon SQS stream as a source.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.pipes.*;
     * PipeSourceSqsQueueParametersProperty pipeSourceSqsQueueParametersProperty =
     * PipeSourceSqsQueueParametersProperty.builder()
     * .batchSize(123)
     * .maximumBatchingWindowInSeconds(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipesourcesqsqueueparameters.html)
     */
    public inline fun cfnPipePipeSourceSqsQueueParametersProperty(
        block: CfnPipePipeSourceSqsQueueParametersPropertyDsl.() -> Unit = {}
    ): CfnPipe.PipeSourceSqsQueueParametersProperty {
        val builder = CfnPipePipeSourceSqsQueueParametersPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The parameters for using an AWS Batch job as a target.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.pipes.*;
     * PipeTargetBatchJobParametersProperty pipeTargetBatchJobParametersProperty =
     * PipeTargetBatchJobParametersProperty.builder()
     * .jobDefinition("jobDefinition")
     * .jobName("jobName")
     * // the properties below are optional
     * .arrayProperties(BatchArrayPropertiesProperty.builder()
     * .size(123)
     * .build())
     * .containerOverrides(BatchContainerOverridesProperty.builder()
     * .command(List.of("command"))
     * .environment(List.of(BatchEnvironmentVariableProperty.builder()
     * .name("name")
     * .value("value")
     * .build()))
     * .instanceType("instanceType")
     * .resourceRequirements(List.of(BatchResourceRequirementProperty.builder()
     * .type("type")
     * .value("value")
     * .build()))
     * .build())
     * .dependsOn(List.of(BatchJobDependencyProperty.builder()
     * .jobId("jobId")
     * .type("type")
     * .build()))
     * .parameters(Map.of(
     * "parametersKey", "parameters"))
     * .retryStrategy(BatchRetryStrategyProperty.builder()
     * .attempts(123)
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipetargetbatchjobparameters.html)
     */
    public inline fun cfnPipePipeTargetBatchJobParametersProperty(
        block: CfnPipePipeTargetBatchJobParametersPropertyDsl.() -> Unit = {}
    ): CfnPipe.PipeTargetBatchJobParametersProperty {
        val builder = CfnPipePipeTargetBatchJobParametersPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The parameters for using an CloudWatch Logs log stream as a target.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.pipes.*;
     * PipeTargetCloudWatchLogsParametersProperty pipeTargetCloudWatchLogsParametersProperty =
     * PipeTargetCloudWatchLogsParametersProperty.builder()
     * .logStreamName("logStreamName")
     * .timestamp("timestamp")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipetargetcloudwatchlogsparameters.html)
     */
    public inline fun cfnPipePipeTargetCloudWatchLogsParametersProperty(
        block: CfnPipePipeTargetCloudWatchLogsParametersPropertyDsl.() -> Unit = {}
    ): CfnPipe.PipeTargetCloudWatchLogsParametersProperty {
        val builder = CfnPipePipeTargetCloudWatchLogsParametersPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The parameters for using an Amazon ECS task as a target.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.pipes.*;
     * PipeTargetEcsTaskParametersProperty pipeTargetEcsTaskParametersProperty =
     * PipeTargetEcsTaskParametersProperty.builder()
     * .taskDefinitionArn("taskDefinitionArn")
     * // the properties below are optional
     * .capacityProviderStrategy(List.of(CapacityProviderStrategyItemProperty.builder()
     * .capacityProvider("capacityProvider")
     * // the properties below are optional
     * .base(123)
     * .weight(123)
     * .build()))
     * .enableEcsManagedTags(false)
     * .enableExecuteCommand(false)
     * .group("group")
     * .launchType("launchType")
     * .networkConfiguration(NetworkConfigurationProperty.builder()
     * .awsvpcConfiguration(AwsVpcConfigurationProperty.builder()
     * .subnets(List.of("subnets"))
     * // the properties below are optional
     * .assignPublicIp("assignPublicIp")
     * .securityGroups(List.of("securityGroups"))
     * .build())
     * .build())
     * .overrides(EcsTaskOverrideProperty.builder()
     * .containerOverrides(List.of(EcsContainerOverrideProperty.builder()
     * .command(List.of("command"))
     * .cpu(123)
     * .environment(List.of(EcsEnvironmentVariableProperty.builder()
     * .name("name")
     * .value("value")
     * .build()))
     * .environmentFiles(List.of(EcsEnvironmentFileProperty.builder()
     * .type("type")
     * .value("value")
     * .build()))
     * .memory(123)
     * .memoryReservation(123)
     * .name("name")
     * .resourceRequirements(List.of(EcsResourceRequirementProperty.builder()
     * .type("type")
     * .value("value")
     * .build()))
     * .build()))
     * .cpu("cpu")
     * .ephemeralStorage(EcsEphemeralStorageProperty.builder()
     * .sizeInGiB(123)
     * .build())
     * .executionRoleArn("executionRoleArn")
     * .inferenceAcceleratorOverrides(List.of(EcsInferenceAcceleratorOverrideProperty.builder()
     * .deviceName("deviceName")
     * .deviceType("deviceType")
     * .build()))
     * .memory("memory")
     * .taskRoleArn("taskRoleArn")
     * .build())
     * .placementConstraints(List.of(PlacementConstraintProperty.builder()
     * .expression("expression")
     * .type("type")
     * .build()))
     * .placementStrategy(List.of(PlacementStrategyProperty.builder()
     * .field("field")
     * .type("type")
     * .build()))
     * .platformVersion("platformVersion")
     * .propagateTags("propagateTags")
     * .referenceId("referenceId")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .taskCount(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipetargetecstaskparameters.html)
     */
    public inline fun cfnPipePipeTargetEcsTaskParametersProperty(
        block: CfnPipePipeTargetEcsTaskParametersPropertyDsl.() -> Unit = {}
    ): CfnPipe.PipeTargetEcsTaskParametersProperty {
        val builder = CfnPipePipeTargetEcsTaskParametersPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The parameters for using an EventBridge event bus as a target.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.pipes.*;
     * PipeTargetEventBridgeEventBusParametersProperty pipeTargetEventBridgeEventBusParametersProperty
     * = PipeTargetEventBridgeEventBusParametersProperty.builder()
     * .detailType("detailType")
     * .endpointId("endpointId")
     * .resources(List.of("resources"))
     * .source("source")
     * .time("time")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipetargeteventbridgeeventbusparameters.html)
     */
    public inline fun cfnPipePipeTargetEventBridgeEventBusParametersProperty(
        block: CfnPipePipeTargetEventBridgeEventBusParametersPropertyDsl.() -> Unit = {}
    ): CfnPipe.PipeTargetEventBridgeEventBusParametersProperty {
        val builder = CfnPipePipeTargetEventBridgeEventBusParametersPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * These are custom parameter to be used when the target is an API Gateway REST APIs or
     * EventBridge ApiDestinations.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.pipes.*;
     * PipeTargetHttpParametersProperty pipeTargetHttpParametersProperty =
     * PipeTargetHttpParametersProperty.builder()
     * .headerParameters(Map.of(
     * "headerParametersKey", "headerParameters"))
     * .pathParameterValues(List.of("pathParameterValues"))
     * .queryStringParameters(Map.of(
     * "queryStringParametersKey", "queryStringParameters"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipetargethttpparameters.html)
     */
    public inline fun cfnPipePipeTargetHttpParametersProperty(
        block: CfnPipePipeTargetHttpParametersPropertyDsl.() -> Unit = {}
    ): CfnPipe.PipeTargetHttpParametersProperty {
        val builder = CfnPipePipeTargetHttpParametersPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The parameters for using a Kinesis stream as a target.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.pipes.*;
     * PipeTargetKinesisStreamParametersProperty pipeTargetKinesisStreamParametersProperty =
     * PipeTargetKinesisStreamParametersProperty.builder()
     * .partitionKey("partitionKey")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipetargetkinesisstreamparameters.html)
     */
    public inline fun cfnPipePipeTargetKinesisStreamParametersProperty(
        block: CfnPipePipeTargetKinesisStreamParametersPropertyDsl.() -> Unit = {}
    ): CfnPipe.PipeTargetKinesisStreamParametersProperty {
        val builder = CfnPipePipeTargetKinesisStreamParametersPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The parameters for using a Lambda function as a target.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.pipes.*;
     * PipeTargetLambdaFunctionParametersProperty pipeTargetLambdaFunctionParametersProperty =
     * PipeTargetLambdaFunctionParametersProperty.builder()
     * .invocationType("invocationType")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipetargetlambdafunctionparameters.html)
     */
    public inline fun cfnPipePipeTargetLambdaFunctionParametersProperty(
        block: CfnPipePipeTargetLambdaFunctionParametersPropertyDsl.() -> Unit = {}
    ): CfnPipe.PipeTargetLambdaFunctionParametersProperty {
        val builder = CfnPipePipeTargetLambdaFunctionParametersPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The parameters required to set up a target for your pipe.
     *
     * For more information about pipe target parameters, including how to use dynamic path
     * parameters, see
     * [Target parameters](https://docs.aws.amazon.com/eventbridge/latest/userguide/eb-pipes-event-target.html)
     * in the *Amazon EventBridge User Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.pipes.*;
     * PipeTargetParametersProperty pipeTargetParametersProperty =
     * PipeTargetParametersProperty.builder()
     * .batchJobParameters(PipeTargetBatchJobParametersProperty.builder()
     * .jobDefinition("jobDefinition")
     * .jobName("jobName")
     * // the properties below are optional
     * .arrayProperties(BatchArrayPropertiesProperty.builder()
     * .size(123)
     * .build())
     * .containerOverrides(BatchContainerOverridesProperty.builder()
     * .command(List.of("command"))
     * .environment(List.of(BatchEnvironmentVariableProperty.builder()
     * .name("name")
     * .value("value")
     * .build()))
     * .instanceType("instanceType")
     * .resourceRequirements(List.of(BatchResourceRequirementProperty.builder()
     * .type("type")
     * .value("value")
     * .build()))
     * .build())
     * .dependsOn(List.of(BatchJobDependencyProperty.builder()
     * .jobId("jobId")
     * .type("type")
     * .build()))
     * .parameters(Map.of(
     * "parametersKey", "parameters"))
     * .retryStrategy(BatchRetryStrategyProperty.builder()
     * .attempts(123)
     * .build())
     * .build())
     * .cloudWatchLogsParameters(PipeTargetCloudWatchLogsParametersProperty.builder()
     * .logStreamName("logStreamName")
     * .timestamp("timestamp")
     * .build())
     * .ecsTaskParameters(PipeTargetEcsTaskParametersProperty.builder()
     * .taskDefinitionArn("taskDefinitionArn")
     * // the properties below are optional
     * .capacityProviderStrategy(List.of(CapacityProviderStrategyItemProperty.builder()
     * .capacityProvider("capacityProvider")
     * // the properties below are optional
     * .base(123)
     * .weight(123)
     * .build()))
     * .enableEcsManagedTags(false)
     * .enableExecuteCommand(false)
     * .group("group")
     * .launchType("launchType")
     * .networkConfiguration(NetworkConfigurationProperty.builder()
     * .awsvpcConfiguration(AwsVpcConfigurationProperty.builder()
     * .subnets(List.of("subnets"))
     * // the properties below are optional
     * .assignPublicIp("assignPublicIp")
     * .securityGroups(List.of("securityGroups"))
     * .build())
     * .build())
     * .overrides(EcsTaskOverrideProperty.builder()
     * .containerOverrides(List.of(EcsContainerOverrideProperty.builder()
     * .command(List.of("command"))
     * .cpu(123)
     * .environment(List.of(EcsEnvironmentVariableProperty.builder()
     * .name("name")
     * .value("value")
     * .build()))
     * .environmentFiles(List.of(EcsEnvironmentFileProperty.builder()
     * .type("type")
     * .value("value")
     * .build()))
     * .memory(123)
     * .memoryReservation(123)
     * .name("name")
     * .resourceRequirements(List.of(EcsResourceRequirementProperty.builder()
     * .type("type")
     * .value("value")
     * .build()))
     * .build()))
     * .cpu("cpu")
     * .ephemeralStorage(EcsEphemeralStorageProperty.builder()
     * .sizeInGiB(123)
     * .build())
     * .executionRoleArn("executionRoleArn")
     * .inferenceAcceleratorOverrides(List.of(EcsInferenceAcceleratorOverrideProperty.builder()
     * .deviceName("deviceName")
     * .deviceType("deviceType")
     * .build()))
     * .memory("memory")
     * .taskRoleArn("taskRoleArn")
     * .build())
     * .placementConstraints(List.of(PlacementConstraintProperty.builder()
     * .expression("expression")
     * .type("type")
     * .build()))
     * .placementStrategy(List.of(PlacementStrategyProperty.builder()
     * .field("field")
     * .type("type")
     * .build()))
     * .platformVersion("platformVersion")
     * .propagateTags("propagateTags")
     * .referenceId("referenceId")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .taskCount(123)
     * .build())
     * .eventBridgeEventBusParameters(PipeTargetEventBridgeEventBusParametersProperty.builder()
     * .detailType("detailType")
     * .endpointId("endpointId")
     * .resources(List.of("resources"))
     * .source("source")
     * .time("time")
     * .build())
     * .httpParameters(PipeTargetHttpParametersProperty.builder()
     * .headerParameters(Map.of(
     * "headerParametersKey", "headerParameters"))
     * .pathParameterValues(List.of("pathParameterValues"))
     * .queryStringParameters(Map.of(
     * "queryStringParametersKey", "queryStringParameters"))
     * .build())
     * .inputTemplate("inputTemplate")
     * .kinesisStreamParameters(PipeTargetKinesisStreamParametersProperty.builder()
     * .partitionKey("partitionKey")
     * .build())
     * .lambdaFunctionParameters(PipeTargetLambdaFunctionParametersProperty.builder()
     * .invocationType("invocationType")
     * .build())
     * .redshiftDataParameters(PipeTargetRedshiftDataParametersProperty.builder()
     * .database("database")
     * .sqls(List.of("sqls"))
     * // the properties below are optional
     * .dbUser("dbUser")
     * .secretManagerArn("secretManagerArn")
     * .statementName("statementName")
     * .withEvent(false)
     * .build())
     * .sageMakerPipelineParameters(PipeTargetSageMakerPipelineParametersProperty.builder()
     * .pipelineParameterList(List.of(SageMakerPipelineParameterProperty.builder()
     * .name("name")
     * .value("value")
     * .build()))
     * .build())
     * .sqsQueueParameters(PipeTargetSqsQueueParametersProperty.builder()
     * .messageDeduplicationId("messageDeduplicationId")
     * .messageGroupId("messageGroupId")
     * .build())
     * .stepFunctionStateMachineParameters(PipeTargetStateMachineParametersProperty.builder()
     * .invocationType("invocationType")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipetargetparameters.html)
     */
    public inline fun cfnPipePipeTargetParametersProperty(
        block: CfnPipePipeTargetParametersPropertyDsl.() -> Unit = {}
    ): CfnPipe.PipeTargetParametersProperty {
        val builder = CfnPipePipeTargetParametersPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * These are custom parameters to be used when the target is a Amazon Redshift cluster to invoke
     * the Amazon Redshift Data API BatchExecuteStatement.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.pipes.*;
     * PipeTargetRedshiftDataParametersProperty pipeTargetRedshiftDataParametersProperty =
     * PipeTargetRedshiftDataParametersProperty.builder()
     * .database("database")
     * .sqls(List.of("sqls"))
     * // the properties below are optional
     * .dbUser("dbUser")
     * .secretManagerArn("secretManagerArn")
     * .statementName("statementName")
     * .withEvent(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipetargetredshiftdataparameters.html)
     */
    public inline fun cfnPipePipeTargetRedshiftDataParametersProperty(
        block: CfnPipePipeTargetRedshiftDataParametersPropertyDsl.() -> Unit = {}
    ): CfnPipe.PipeTargetRedshiftDataParametersProperty {
        val builder = CfnPipePipeTargetRedshiftDataParametersPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The parameters for using a SageMaker pipeline as a target.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.pipes.*;
     * PipeTargetSageMakerPipelineParametersProperty pipeTargetSageMakerPipelineParametersProperty =
     * PipeTargetSageMakerPipelineParametersProperty.builder()
     * .pipelineParameterList(List.of(SageMakerPipelineParameterProperty.builder()
     * .name("name")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipetargetsagemakerpipelineparameters.html)
     */
    public inline fun cfnPipePipeTargetSageMakerPipelineParametersProperty(
        block: CfnPipePipeTargetSageMakerPipelineParametersPropertyDsl.() -> Unit = {}
    ): CfnPipe.PipeTargetSageMakerPipelineParametersProperty {
        val builder = CfnPipePipeTargetSageMakerPipelineParametersPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The parameters for using a Amazon SQS stream as a target.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.pipes.*;
     * PipeTargetSqsQueueParametersProperty pipeTargetSqsQueueParametersProperty =
     * PipeTargetSqsQueueParametersProperty.builder()
     * .messageDeduplicationId("messageDeduplicationId")
     * .messageGroupId("messageGroupId")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipetargetsqsqueueparameters.html)
     */
    public inline fun cfnPipePipeTargetSqsQueueParametersProperty(
        block: CfnPipePipeTargetSqsQueueParametersPropertyDsl.() -> Unit = {}
    ): CfnPipe.PipeTargetSqsQueueParametersProperty {
        val builder = CfnPipePipeTargetSqsQueueParametersPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The parameters for using a Step Functions state machine as a target.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.pipes.*;
     * PipeTargetStateMachineParametersProperty pipeTargetStateMachineParametersProperty =
     * PipeTargetStateMachineParametersProperty.builder()
     * .invocationType("invocationType")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipetargetstatemachineparameters.html)
     */
    public inline fun cfnPipePipeTargetStateMachineParametersProperty(
        block: CfnPipePipeTargetStateMachineParametersPropertyDsl.() -> Unit = {}
    ): CfnPipe.PipeTargetStateMachineParametersProperty {
        val builder = CfnPipePipeTargetStateMachineParametersPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * An object representing a constraint on task placement.
     *
     * To learn more, see
     * [Task Placement Constraints](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-placement-constraints.html)
     * in the Amazon Elastic Container Service Developer Guide.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.pipes.*;
     * PlacementConstraintProperty placementConstraintProperty = PlacementConstraintProperty.builder()
     * .expression("expression")
     * .type("type")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-placementconstraint.html)
     */
    public inline fun cfnPipePlacementConstraintProperty(
        block: CfnPipePlacementConstraintPropertyDsl.() -> Unit = {}
    ): CfnPipe.PlacementConstraintProperty {
        val builder = CfnPipePlacementConstraintPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The task placement strategy for a task or service.
     *
     * To learn more, see
     * [Task Placement Strategies](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-placement-strategies.html)
     * in the Amazon Elastic Container Service Service Developer Guide.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.pipes.*;
     * PlacementStrategyProperty placementStrategyProperty = PlacementStrategyProperty.builder()
     * .field("field")
     * .type("type")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-placementstrategy.html)
     */
    public inline fun cfnPipePlacementStrategyProperty(
        block: CfnPipePlacementStrategyPropertyDsl.() -> Unit = {}
    ): CfnPipe.PlacementStrategyProperty {
        val builder = CfnPipePlacementStrategyPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnPipe`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.pipes.*;
     * CfnPipeProps cfnPipeProps = CfnPipeProps.builder()
     * .roleArn("roleArn")
     * .source("source")
     * .target("target")
     * // the properties below are optional
     * .description("description")
     * .desiredState("desiredState")
     * .enrichment("enrichment")
     * .enrichmentParameters(PipeEnrichmentParametersProperty.builder()
     * .httpParameters(PipeEnrichmentHttpParametersProperty.builder()
     * .headerParameters(Map.of(
     * "headerParametersKey", "headerParameters"))
     * .pathParameterValues(List.of("pathParameterValues"))
     * .queryStringParameters(Map.of(
     * "queryStringParametersKey", "queryStringParameters"))
     * .build())
     * .inputTemplate("inputTemplate")
     * .build())
     * .name("name")
     * .sourceParameters(PipeSourceParametersProperty.builder()
     * .activeMqBrokerParameters(PipeSourceActiveMQBrokerParametersProperty.builder()
     * .credentials(MQBrokerAccessCredentialsProperty.builder()
     * .basicAuth("basicAuth")
     * .build())
     * .queueName("queueName")
     * // the properties below are optional
     * .batchSize(123)
     * .maximumBatchingWindowInSeconds(123)
     * .build())
     * .dynamoDbStreamParameters(PipeSourceDynamoDBStreamParametersProperty.builder()
     * .startingPosition("startingPosition")
     * // the properties below are optional
     * .batchSize(123)
     * .deadLetterConfig(DeadLetterConfigProperty.builder()
     * .arn("arn")
     * .build())
     * .maximumBatchingWindowInSeconds(123)
     * .maximumRecordAgeInSeconds(123)
     * .maximumRetryAttempts(123)
     * .onPartialBatchItemFailure("onPartialBatchItemFailure")
     * .parallelizationFactor(123)
     * .build())
     * .filterCriteria(FilterCriteriaProperty.builder()
     * .filters(List.of(FilterProperty.builder()
     * .pattern("pattern")
     * .build()))
     * .build())
     * .kinesisStreamParameters(PipeSourceKinesisStreamParametersProperty.builder()
     * .startingPosition("startingPosition")
     * // the properties below are optional
     * .batchSize(123)
     * .deadLetterConfig(DeadLetterConfigProperty.builder()
     * .arn("arn")
     * .build())
     * .maximumBatchingWindowInSeconds(123)
     * .maximumRecordAgeInSeconds(123)
     * .maximumRetryAttempts(123)
     * .onPartialBatchItemFailure("onPartialBatchItemFailure")
     * .parallelizationFactor(123)
     * .startingPositionTimestamp("startingPositionTimestamp")
     * .build())
     * .managedStreamingKafkaParameters(PipeSourceManagedStreamingKafkaParametersProperty.builder()
     * .topicName("topicName")
     * // the properties below are optional
     * .batchSize(123)
     * .consumerGroupId("consumerGroupId")
     * .credentials(MSKAccessCredentialsProperty.builder()
     * .clientCertificateTlsAuth("clientCertificateTlsAuth")
     * .saslScram512Auth("saslScram512Auth")
     * .build())
     * .maximumBatchingWindowInSeconds(123)
     * .startingPosition("startingPosition")
     * .build())
     * .rabbitMqBrokerParameters(PipeSourceRabbitMQBrokerParametersProperty.builder()
     * .credentials(MQBrokerAccessCredentialsProperty.builder()
     * .basicAuth("basicAuth")
     * .build())
     * .queueName("queueName")
     * // the properties below are optional
     * .batchSize(123)
     * .maximumBatchingWindowInSeconds(123)
     * .virtualHost("virtualHost")
     * .build())
     * .selfManagedKafkaParameters(PipeSourceSelfManagedKafkaParametersProperty.builder()
     * .topicName("topicName")
     * // the properties below are optional
     * .additionalBootstrapServers(List.of("additionalBootstrapServers"))
     * .batchSize(123)
     * .consumerGroupId("consumerGroupId")
     * .credentials(SelfManagedKafkaAccessConfigurationCredentialsProperty.builder()
     * .basicAuth("basicAuth")
     * .clientCertificateTlsAuth("clientCertificateTlsAuth")
     * .saslScram256Auth("saslScram256Auth")
     * .saslScram512Auth("saslScram512Auth")
     * .build())
     * .maximumBatchingWindowInSeconds(123)
     * .serverRootCaCertificate("serverRootCaCertificate")
     * .startingPosition("startingPosition")
     * .vpc(SelfManagedKafkaAccessConfigurationVpcProperty.builder()
     * .securityGroup(List.of("securityGroup"))
     * .subnets(List.of("subnets"))
     * .build())
     * .build())
     * .sqsQueueParameters(PipeSourceSqsQueueParametersProperty.builder()
     * .batchSize(123)
     * .maximumBatchingWindowInSeconds(123)
     * .build())
     * .build())
     * .tags(Map.of(
     * "tagsKey", "tags"))
     * .targetParameters(PipeTargetParametersProperty.builder()
     * .batchJobParameters(PipeTargetBatchJobParametersProperty.builder()
     * .jobDefinition("jobDefinition")
     * .jobName("jobName")
     * // the properties below are optional
     * .arrayProperties(BatchArrayPropertiesProperty.builder()
     * .size(123)
     * .build())
     * .containerOverrides(BatchContainerOverridesProperty.builder()
     * .command(List.of("command"))
     * .environment(List.of(BatchEnvironmentVariableProperty.builder()
     * .name("name")
     * .value("value")
     * .build()))
     * .instanceType("instanceType")
     * .resourceRequirements(List.of(BatchResourceRequirementProperty.builder()
     * .type("type")
     * .value("value")
     * .build()))
     * .build())
     * .dependsOn(List.of(BatchJobDependencyProperty.builder()
     * .jobId("jobId")
     * .type("type")
     * .build()))
     * .parameters(Map.of(
     * "parametersKey", "parameters"))
     * .retryStrategy(BatchRetryStrategyProperty.builder()
     * .attempts(123)
     * .build())
     * .build())
     * .cloudWatchLogsParameters(PipeTargetCloudWatchLogsParametersProperty.builder()
     * .logStreamName("logStreamName")
     * .timestamp("timestamp")
     * .build())
     * .ecsTaskParameters(PipeTargetEcsTaskParametersProperty.builder()
     * .taskDefinitionArn("taskDefinitionArn")
     * // the properties below are optional
     * .capacityProviderStrategy(List.of(CapacityProviderStrategyItemProperty.builder()
     * .capacityProvider("capacityProvider")
     * // the properties below are optional
     * .base(123)
     * .weight(123)
     * .build()))
     * .enableEcsManagedTags(false)
     * .enableExecuteCommand(false)
     * .group("group")
     * .launchType("launchType")
     * .networkConfiguration(NetworkConfigurationProperty.builder()
     * .awsvpcConfiguration(AwsVpcConfigurationProperty.builder()
     * .subnets(List.of("subnets"))
     * // the properties below are optional
     * .assignPublicIp("assignPublicIp")
     * .securityGroups(List.of("securityGroups"))
     * .build())
     * .build())
     * .overrides(EcsTaskOverrideProperty.builder()
     * .containerOverrides(List.of(EcsContainerOverrideProperty.builder()
     * .command(List.of("command"))
     * .cpu(123)
     * .environment(List.of(EcsEnvironmentVariableProperty.builder()
     * .name("name")
     * .value("value")
     * .build()))
     * .environmentFiles(List.of(EcsEnvironmentFileProperty.builder()
     * .type("type")
     * .value("value")
     * .build()))
     * .memory(123)
     * .memoryReservation(123)
     * .name("name")
     * .resourceRequirements(List.of(EcsResourceRequirementProperty.builder()
     * .type("type")
     * .value("value")
     * .build()))
     * .build()))
     * .cpu("cpu")
     * .ephemeralStorage(EcsEphemeralStorageProperty.builder()
     * .sizeInGiB(123)
     * .build())
     * .executionRoleArn("executionRoleArn")
     * .inferenceAcceleratorOverrides(List.of(EcsInferenceAcceleratorOverrideProperty.builder()
     * .deviceName("deviceName")
     * .deviceType("deviceType")
     * .build()))
     * .memory("memory")
     * .taskRoleArn("taskRoleArn")
     * .build())
     * .placementConstraints(List.of(PlacementConstraintProperty.builder()
     * .expression("expression")
     * .type("type")
     * .build()))
     * .placementStrategy(List.of(PlacementStrategyProperty.builder()
     * .field("field")
     * .type("type")
     * .build()))
     * .platformVersion("platformVersion")
     * .propagateTags("propagateTags")
     * .referenceId("referenceId")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .taskCount(123)
     * .build())
     * .eventBridgeEventBusParameters(PipeTargetEventBridgeEventBusParametersProperty.builder()
     * .detailType("detailType")
     * .endpointId("endpointId")
     * .resources(List.of("resources"))
     * .source("source")
     * .time("time")
     * .build())
     * .httpParameters(PipeTargetHttpParametersProperty.builder()
     * .headerParameters(Map.of(
     * "headerParametersKey", "headerParameters"))
     * .pathParameterValues(List.of("pathParameterValues"))
     * .queryStringParameters(Map.of(
     * "queryStringParametersKey", "queryStringParameters"))
     * .build())
     * .inputTemplate("inputTemplate")
     * .kinesisStreamParameters(PipeTargetKinesisStreamParametersProperty.builder()
     * .partitionKey("partitionKey")
     * .build())
     * .lambdaFunctionParameters(PipeTargetLambdaFunctionParametersProperty.builder()
     * .invocationType("invocationType")
     * .build())
     * .redshiftDataParameters(PipeTargetRedshiftDataParametersProperty.builder()
     * .database("database")
     * .sqls(List.of("sqls"))
     * // the properties below are optional
     * .dbUser("dbUser")
     * .secretManagerArn("secretManagerArn")
     * .statementName("statementName")
     * .withEvent(false)
     * .build())
     * .sageMakerPipelineParameters(PipeTargetSageMakerPipelineParametersProperty.builder()
     * .pipelineParameterList(List.of(SageMakerPipelineParameterProperty.builder()
     * .name("name")
     * .value("value")
     * .build()))
     * .build())
     * .sqsQueueParameters(PipeTargetSqsQueueParametersProperty.builder()
     * .messageDeduplicationId("messageDeduplicationId")
     * .messageGroupId("messageGroupId")
     * .build())
     * .stepFunctionStateMachineParameters(PipeTargetStateMachineParametersProperty.builder()
     * .invocationType("invocationType")
     * .build())
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pipes-pipe.html)
     */
    public inline fun cfnPipeProps(block: CfnPipePropsDsl.() -> Unit = {}): CfnPipeProps {
        val builder = CfnPipePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Name/Value pair of a parameter to start execution of a SageMaker Model Building Pipeline.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.pipes.*;
     * SageMakerPipelineParameterProperty sageMakerPipelineParameterProperty =
     * SageMakerPipelineParameterProperty.builder()
     * .name("name")
     * .value("value")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-sagemakerpipelineparameter.html)
     */
    public inline fun cfnPipeSageMakerPipelineParameterProperty(
        block: CfnPipeSageMakerPipelineParameterPropertyDsl.() -> Unit = {}
    ): CfnPipe.SageMakerPipelineParameterProperty {
        val builder = CfnPipeSageMakerPipelineParameterPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The AWS Secrets Manager secret that stores your stream credentials.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.pipes.*;
     * SelfManagedKafkaAccessConfigurationCredentialsProperty
     * selfManagedKafkaAccessConfigurationCredentialsProperty =
     * SelfManagedKafkaAccessConfigurationCredentialsProperty.builder()
     * .basicAuth("basicAuth")
     * .clientCertificateTlsAuth("clientCertificateTlsAuth")
     * .saslScram256Auth("saslScram256Auth")
     * .saslScram512Auth("saslScram512Auth")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-selfmanagedkafkaaccessconfigurationcredentials.html)
     */
    public inline fun cfnPipeSelfManagedKafkaAccessConfigurationCredentialsProperty(
        block: CfnPipeSelfManagedKafkaAccessConfigurationCredentialsPropertyDsl.() -> Unit = {}
    ): CfnPipe.SelfManagedKafkaAccessConfigurationCredentialsProperty {
        val builder = CfnPipeSelfManagedKafkaAccessConfigurationCredentialsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * This structure specifies the VPC subnets and security groups for the stream, and whether a
     * public IP address is to be used.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.pipes.*;
     * SelfManagedKafkaAccessConfigurationVpcProperty selfManagedKafkaAccessConfigurationVpcProperty =
     * SelfManagedKafkaAccessConfigurationVpcProperty.builder()
     * .securityGroup(List.of("securityGroup"))
     * .subnets(List.of("subnets"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-selfmanagedkafkaaccessconfigurationvpc.html)
     */
    public inline fun cfnPipeSelfManagedKafkaAccessConfigurationVpcProperty(
        block: CfnPipeSelfManagedKafkaAccessConfigurationVpcPropertyDsl.() -> Unit = {}
    ): CfnPipe.SelfManagedKafkaAccessConfigurationVpcProperty {
        val builder = CfnPipeSelfManagedKafkaAccessConfigurationVpcPropertyDsl()
        builder.apply(block)
        return builder.build()
    }
}
