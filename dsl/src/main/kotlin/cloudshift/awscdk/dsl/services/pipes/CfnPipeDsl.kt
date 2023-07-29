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

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Map
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.pipes.CfnPipe
import software.constructs.Construct

/**
 * Create a pipe.
 *
 * Amazon EventBridge Pipes connect event sources to targets and reduces the need for specialized
 * knowledge and integration code.
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
@CdkDslMarker
public class CfnPipeDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnPipe.Builder = CfnPipe.Builder.create(scope, id)

    /**
     * A description of the pipe.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pipes-pipe.html#cfn-pipes-pipe-description)
     *
     * @param description A description of the pipe.
     */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * The state the pipe should be in.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pipes-pipe.html#cfn-pipes-pipe-desiredstate)
     *
     * @param desiredState The state the pipe should be in.
     */
    public fun desiredState(desiredState: String) {
        cdkBuilder.desiredState(desiredState)
    }

    /**
     * The ARN of the enrichment resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pipes-pipe.html#cfn-pipes-pipe-enrichment)
     *
     * @param enrichment The ARN of the enrichment resource.
     */
    public fun enrichment(enrichment: String) {
        cdkBuilder.enrichment(enrichment)
    }

    /**
     * The parameters required to set up enrichment on your pipe.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pipes-pipe.html#cfn-pipes-pipe-enrichmentparameters)
     *
     * @param enrichmentParameters The parameters required to set up enrichment on your pipe.
     */
    public fun enrichmentParameters(enrichmentParameters: IResolvable) {
        cdkBuilder.enrichmentParameters(enrichmentParameters)
    }

    /**
     * The parameters required to set up enrichment on your pipe.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pipes-pipe.html#cfn-pipes-pipe-enrichmentparameters)
     *
     * @param enrichmentParameters The parameters required to set up enrichment on your pipe.
     */
    public fun enrichmentParameters(
        enrichmentParameters: CfnPipe.PipeEnrichmentParametersProperty
    ) {
        cdkBuilder.enrichmentParameters(enrichmentParameters)
    }

    /**
     * The name of the pipe.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pipes-pipe.html#cfn-pipes-pipe-name)
     *
     * @param name The name of the pipe.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * The ARN of the role that allows the pipe to send data to the target.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pipes-pipe.html#cfn-pipes-pipe-rolearn)
     *
     * @param roleArn The ARN of the role that allows the pipe to send data to the target.
     */
    public fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
    }

    /**
     * The ARN of the source resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pipes-pipe.html#cfn-pipes-pipe-source)
     *
     * @param source The ARN of the source resource.
     */
    public fun source(source: String) {
        cdkBuilder.source(source)
    }

    /**
     * The parameters required to set up a source for your pipe.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pipes-pipe.html#cfn-pipes-pipe-sourceparameters)
     *
     * @param sourceParameters The parameters required to set up a source for your pipe.
     */
    public fun sourceParameters(sourceParameters: IResolvable) {
        cdkBuilder.sourceParameters(sourceParameters)
    }

    /**
     * The parameters required to set up a source for your pipe.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pipes-pipe.html#cfn-pipes-pipe-sourceparameters)
     *
     * @param sourceParameters The parameters required to set up a source for your pipe.
     */
    public fun sourceParameters(sourceParameters: CfnPipe.PipeSourceParametersProperty) {
        cdkBuilder.sourceParameters(sourceParameters)
    }

    /**
     * The list of key-value pairs to associate with the pipe.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pipes-pipe.html#cfn-pipes-pipe-tags)
     *
     * @param tags The list of key-value pairs to associate with the pipe.
     */
    public fun tags(tags: Map<String, String>) {
        cdkBuilder.tags(tags)
    }

    /**
     * The ARN of the target resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pipes-pipe.html#cfn-pipes-pipe-target)
     *
     * @param target The ARN of the target resource.
     */
    public fun target(target: String) {
        cdkBuilder.target(target)
    }

    /**
     * The parameters required to set up a target for your pipe.
     *
     * For more information about pipe target parameters, including how to use dynamic path
     * parameters, see
     * [Target parameters](https://docs.aws.amazon.com/eventbridge/latest/userguide/eb-pipes-event-target.html)
     * in the *Amazon EventBridge User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pipes-pipe.html#cfn-pipes-pipe-targetparameters)
     *
     * @param targetParameters The parameters required to set up a target for your pipe.
     */
    public fun targetParameters(targetParameters: IResolvable) {
        cdkBuilder.targetParameters(targetParameters)
    }

    /**
     * The parameters required to set up a target for your pipe.
     *
     * For more information about pipe target parameters, including how to use dynamic path
     * parameters, see
     * [Target parameters](https://docs.aws.amazon.com/eventbridge/latest/userguide/eb-pipes-event-target.html)
     * in the *Amazon EventBridge User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pipes-pipe.html#cfn-pipes-pipe-targetparameters)
     *
     * @param targetParameters The parameters required to set up a target for your pipe.
     */
    public fun targetParameters(targetParameters: CfnPipe.PipeTargetParametersProperty) {
        cdkBuilder.targetParameters(targetParameters)
    }

    public fun build(): CfnPipe = cdkBuilder.build()
}
