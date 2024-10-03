@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.pipes

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnPipe`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.pipes.*;
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
 * .kmsKeyIdentifier("kmsKeyIdentifier")
 * .logConfiguration(PipeLogConfigurationProperty.builder()
 * .cloudwatchLogsLogDestination(CloudwatchLogsLogDestinationProperty.builder()
 * .logGroupArn("logGroupArn")
 * .build())
 * .firehoseLogDestination(FirehoseLogDestinationProperty.builder()
 * .deliveryStreamArn("deliveryStreamArn")
 * .build())
 * .includeExecutionData(List.of("includeExecutionData"))
 * .level("level")
 * .s3LogDestination(S3LogDestinationProperty.builder()
 * .bucketName("bucketName")
 * .bucketOwner("bucketOwner")
 * .outputFormat("outputFormat")
 * .prefix("prefix")
 * .build())
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
 * .timestreamParameters(PipeTargetTimestreamParametersProperty.builder()
 * .dimensionMappings(List.of(DimensionMappingProperty.builder()
 * .dimensionName("dimensionName")
 * .dimensionValue("dimensionValue")
 * .dimensionValueType("dimensionValueType")
 * .build()))
 * .timeValue("timeValue")
 * .versionValue("versionValue")
 * // the properties below are optional
 * .epochTimeUnit("epochTimeUnit")
 * .multiMeasureMappings(List.of(MultiMeasureMappingProperty.builder()
 * .multiMeasureAttributeMappings(List.of(MultiMeasureAttributeMappingProperty.builder()
 * .measureValue("measureValue")
 * .measureValueType("measureValueType")
 * .multiMeasureAttributeName("multiMeasureAttributeName")
 * .build()))
 * .multiMeasureName("multiMeasureName")
 * .build()))
 * .singleMeasureMappings(List.of(SingleMeasureMappingProperty.builder()
 * .measureName("measureName")
 * .measureValue("measureValue")
 * .measureValueType("measureValueType")
 * .build()))
 * .timeFieldType("timeFieldType")
 * .timestampFormat("timestampFormat")
 * .build())
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pipes-pipe.html)
 */
public interface CfnPipeProps {
  /**
   * A description of the pipe.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pipes-pipe.html#cfn-pipes-pipe-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The state the pipe should be in.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pipes-pipe.html#cfn-pipes-pipe-desiredstate)
   */
  public fun desiredState(): String? = unwrap(this).getDesiredState()

  /**
   * The ARN of the enrichment resource.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pipes-pipe.html#cfn-pipes-pipe-enrichment)
   */
  public fun enrichment(): String? = unwrap(this).getEnrichment()

  /**
   * The parameters required to set up enrichment on your pipe.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pipes-pipe.html#cfn-pipes-pipe-enrichmentparameters)
   */
  public fun enrichmentParameters(): Any? = unwrap(this).getEnrichmentParameters()

  /**
   * The identifier of the AWS KMS customer managed key for EventBridge to use, if you choose to use
   * a customer managed key to encrypt pipe data.
   *
   * The identifier can be the key Amazon Resource Name (ARN), KeyId, key alias, or key alias ARN.
   *
   * To update a pipe that is using the default AWS owned key to use a customer managed key instead,
   * or update a pipe that is using a customer managed key to use a different customer managed key,
   * specify a customer managed key identifier.
   *
   * To update a pipe that is using a customer managed key to use the default AWS owned key ,
   * specify an empty string.
   *
   * For more information, see [Managing
   * keys](https://docs.aws.amazon.com/kms/latest/developerguide/getting-started.html) in the *AWS Key
   * Management Service Developer Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pipes-pipe.html#cfn-pipes-pipe-kmskeyidentifier)
   */
  public fun kmsKeyIdentifier(): String? = unwrap(this).getKmsKeyIdentifier()

  /**
   * The logging configuration settings for the pipe.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pipes-pipe.html#cfn-pipes-pipe-logconfiguration)
   */
  public fun logConfiguration(): Any? = unwrap(this).getLogConfiguration()

  /**
   * The name of the pipe.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pipes-pipe.html#cfn-pipes-pipe-name)
   */
  public fun name(): String? = unwrap(this).getName()

  /**
   * The ARN of the role that allows the pipe to send data to the target.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pipes-pipe.html#cfn-pipes-pipe-rolearn)
   */
  public fun roleArn(): String

  /**
   * The ARN of the source resource.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pipes-pipe.html#cfn-pipes-pipe-source)
   */
  public fun source(): String

  /**
   * The parameters required to set up a source for your pipe.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pipes-pipe.html#cfn-pipes-pipe-sourceparameters)
   */
  public fun sourceParameters(): Any? = unwrap(this).getSourceParameters()

  /**
   * The list of key-value pairs to associate with the pipe.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pipes-pipe.html#cfn-pipes-pipe-tags)
   */
  public fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

  /**
   * The ARN of the target resource.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pipes-pipe.html#cfn-pipes-pipe-target)
   */
  public fun target(): String

  /**
   * The parameters required to set up a target for your pipe.
   *
   * For more information about pipe target parameters, including how to use dynamic path
   * parameters, see [Target
   * parameters](https://docs.aws.amazon.com/eventbridge/latest/userguide/eb-pipes-event-target.html)
   * in the *Amazon EventBridge User Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pipes-pipe.html#cfn-pipes-pipe-targetparameters)
   */
  public fun targetParameters(): Any? = unwrap(this).getTargetParameters()

  /**
   * A builder for [CfnPipeProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param description A description of the pipe.
     */
    public fun description(description: String)

    /**
     * @param desiredState The state the pipe should be in.
     */
    public fun desiredState(desiredState: String)

    /**
     * @param enrichment The ARN of the enrichment resource.
     */
    public fun enrichment(enrichment: String)

    /**
     * @param enrichmentParameters The parameters required to set up enrichment on your pipe.
     */
    public fun enrichmentParameters(enrichmentParameters: IResolvable)

    /**
     * @param enrichmentParameters The parameters required to set up enrichment on your pipe.
     */
    public fun enrichmentParameters(enrichmentParameters: CfnPipe.PipeEnrichmentParametersProperty)

    /**
     * @param enrichmentParameters The parameters required to set up enrichment on your pipe.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0297dbc28c3ba5edc57c9c34d955342e189ad447fcd53049c41e0c325b322e2c")
    public
        fun enrichmentParameters(enrichmentParameters: CfnPipe.PipeEnrichmentParametersProperty.Builder.() -> Unit)

    /**
     * @param kmsKeyIdentifier The identifier of the AWS KMS customer managed key for EventBridge to
     * use, if you choose to use a customer managed key to encrypt pipe data.
     * The identifier can be the key Amazon Resource Name (ARN), KeyId, key alias, or key alias ARN.
     *
     * To update a pipe that is using the default AWS owned key to use a customer managed key
     * instead, or update a pipe that is using a customer managed key to use a different customer
     * managed key, specify a customer managed key identifier.
     *
     * To update a pipe that is using a customer managed key to use the default AWS owned key ,
     * specify an empty string.
     *
     * For more information, see [Managing
     * keys](https://docs.aws.amazon.com/kms/latest/developerguide/getting-started.html) in the *AWS
     * Key Management Service Developer Guide* .
     */
    public fun kmsKeyIdentifier(kmsKeyIdentifier: String)

    /**
     * @param logConfiguration The logging configuration settings for the pipe.
     */
    public fun logConfiguration(logConfiguration: IResolvable)

    /**
     * @param logConfiguration The logging configuration settings for the pipe.
     */
    public fun logConfiguration(logConfiguration: CfnPipe.PipeLogConfigurationProperty)

    /**
     * @param logConfiguration The logging configuration settings for the pipe.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("47e39c8c42f658449b16a7a691395f7df0fed95faac8c4dc2f73b036ab28a331")
    public
        fun logConfiguration(logConfiguration: CfnPipe.PipeLogConfigurationProperty.Builder.() -> Unit)

    /**
     * @param name The name of the pipe.
     */
    public fun name(name: String)

    /**
     * @param roleArn The ARN of the role that allows the pipe to send data to the target. 
     */
    public fun roleArn(roleArn: String)

    /**
     * @param source The ARN of the source resource. 
     */
    public fun source(source: String)

    /**
     * @param sourceParameters The parameters required to set up a source for your pipe.
     */
    public fun sourceParameters(sourceParameters: IResolvable)

    /**
     * @param sourceParameters The parameters required to set up a source for your pipe.
     */
    public fun sourceParameters(sourceParameters: CfnPipe.PipeSourceParametersProperty)

    /**
     * @param sourceParameters The parameters required to set up a source for your pipe.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("127357ee001057628f36fb31fb5274eca0eb5973a09b313a9e78465424f0cd8f")
    public
        fun sourceParameters(sourceParameters: CfnPipe.PipeSourceParametersProperty.Builder.() -> Unit)

    /**
     * @param tags The list of key-value pairs to associate with the pipe.
     */
    public fun tags(tags: Map<String, String>)

    /**
     * @param target The ARN of the target resource. 
     */
    public fun target(target: String)

    /**
     * @param targetParameters The parameters required to set up a target for your pipe.
     * For more information about pipe target parameters, including how to use dynamic path
     * parameters, see [Target
     * parameters](https://docs.aws.amazon.com/eventbridge/latest/userguide/eb-pipes-event-target.html)
     * in the *Amazon EventBridge User Guide* .
     */
    public fun targetParameters(targetParameters: IResolvable)

    /**
     * @param targetParameters The parameters required to set up a target for your pipe.
     * For more information about pipe target parameters, including how to use dynamic path
     * parameters, see [Target
     * parameters](https://docs.aws.amazon.com/eventbridge/latest/userguide/eb-pipes-event-target.html)
     * in the *Amazon EventBridge User Guide* .
     */
    public fun targetParameters(targetParameters: CfnPipe.PipeTargetParametersProperty)

    /**
     * @param targetParameters The parameters required to set up a target for your pipe.
     * For more information about pipe target parameters, including how to use dynamic path
     * parameters, see [Target
     * parameters](https://docs.aws.amazon.com/eventbridge/latest/userguide/eb-pipes-event-target.html)
     * in the *Amazon EventBridge User Guide* .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("dd711d2029ca2597d1b0f36aacc2891fbc90cd2160955befffd2af1c3c93316f")
    public
        fun targetParameters(targetParameters: CfnPipe.PipeTargetParametersProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.pipes.CfnPipeProps.Builder =
        software.amazon.awscdk.services.pipes.CfnPipeProps.builder()

    /**
     * @param description A description of the pipe.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param desiredState The state the pipe should be in.
     */
    override fun desiredState(desiredState: String) {
      cdkBuilder.desiredState(desiredState)
    }

    /**
     * @param enrichment The ARN of the enrichment resource.
     */
    override fun enrichment(enrichment: String) {
      cdkBuilder.enrichment(enrichment)
    }

    /**
     * @param enrichmentParameters The parameters required to set up enrichment on your pipe.
     */
    override fun enrichmentParameters(enrichmentParameters: IResolvable) {
      cdkBuilder.enrichmentParameters(enrichmentParameters.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param enrichmentParameters The parameters required to set up enrichment on your pipe.
     */
    override
        fun enrichmentParameters(enrichmentParameters: CfnPipe.PipeEnrichmentParametersProperty) {
      cdkBuilder.enrichmentParameters(enrichmentParameters.let(CfnPipe.PipeEnrichmentParametersProperty.Companion::unwrap))
    }

    /**
     * @param enrichmentParameters The parameters required to set up enrichment on your pipe.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0297dbc28c3ba5edc57c9c34d955342e189ad447fcd53049c41e0c325b322e2c")
    override
        fun enrichmentParameters(enrichmentParameters: CfnPipe.PipeEnrichmentParametersProperty.Builder.() -> Unit):
        Unit = enrichmentParameters(CfnPipe.PipeEnrichmentParametersProperty(enrichmentParameters))

    /**
     * @param kmsKeyIdentifier The identifier of the AWS KMS customer managed key for EventBridge to
     * use, if you choose to use a customer managed key to encrypt pipe data.
     * The identifier can be the key Amazon Resource Name (ARN), KeyId, key alias, or key alias ARN.
     *
     * To update a pipe that is using the default AWS owned key to use a customer managed key
     * instead, or update a pipe that is using a customer managed key to use a different customer
     * managed key, specify a customer managed key identifier.
     *
     * To update a pipe that is using a customer managed key to use the default AWS owned key ,
     * specify an empty string.
     *
     * For more information, see [Managing
     * keys](https://docs.aws.amazon.com/kms/latest/developerguide/getting-started.html) in the *AWS
     * Key Management Service Developer Guide* .
     */
    override fun kmsKeyIdentifier(kmsKeyIdentifier: String) {
      cdkBuilder.kmsKeyIdentifier(kmsKeyIdentifier)
    }

    /**
     * @param logConfiguration The logging configuration settings for the pipe.
     */
    override fun logConfiguration(logConfiguration: IResolvable) {
      cdkBuilder.logConfiguration(logConfiguration.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param logConfiguration The logging configuration settings for the pipe.
     */
    override fun logConfiguration(logConfiguration: CfnPipe.PipeLogConfigurationProperty) {
      cdkBuilder.logConfiguration(logConfiguration.let(CfnPipe.PipeLogConfigurationProperty.Companion::unwrap))
    }

    /**
     * @param logConfiguration The logging configuration settings for the pipe.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("47e39c8c42f658449b16a7a691395f7df0fed95faac8c4dc2f73b036ab28a331")
    override
        fun logConfiguration(logConfiguration: CfnPipe.PipeLogConfigurationProperty.Builder.() -> Unit):
        Unit = logConfiguration(CfnPipe.PipeLogConfigurationProperty(logConfiguration))

    /**
     * @param name The name of the pipe.
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param roleArn The ARN of the role that allows the pipe to send data to the target. 
     */
    override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    /**
     * @param source The ARN of the source resource. 
     */
    override fun source(source: String) {
      cdkBuilder.source(source)
    }

    /**
     * @param sourceParameters The parameters required to set up a source for your pipe.
     */
    override fun sourceParameters(sourceParameters: IResolvable) {
      cdkBuilder.sourceParameters(sourceParameters.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param sourceParameters The parameters required to set up a source for your pipe.
     */
    override fun sourceParameters(sourceParameters: CfnPipe.PipeSourceParametersProperty) {
      cdkBuilder.sourceParameters(sourceParameters.let(CfnPipe.PipeSourceParametersProperty.Companion::unwrap))
    }

    /**
     * @param sourceParameters The parameters required to set up a source for your pipe.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("127357ee001057628f36fb31fb5274eca0eb5973a09b313a9e78465424f0cd8f")
    override
        fun sourceParameters(sourceParameters: CfnPipe.PipeSourceParametersProperty.Builder.() -> Unit):
        Unit = sourceParameters(CfnPipe.PipeSourceParametersProperty(sourceParameters))

    /**
     * @param tags The list of key-value pairs to associate with the pipe.
     */
    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    /**
     * @param target The ARN of the target resource. 
     */
    override fun target(target: String) {
      cdkBuilder.target(target)
    }

    /**
     * @param targetParameters The parameters required to set up a target for your pipe.
     * For more information about pipe target parameters, including how to use dynamic path
     * parameters, see [Target
     * parameters](https://docs.aws.amazon.com/eventbridge/latest/userguide/eb-pipes-event-target.html)
     * in the *Amazon EventBridge User Guide* .
     */
    override fun targetParameters(targetParameters: IResolvable) {
      cdkBuilder.targetParameters(targetParameters.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param targetParameters The parameters required to set up a target for your pipe.
     * For more information about pipe target parameters, including how to use dynamic path
     * parameters, see [Target
     * parameters](https://docs.aws.amazon.com/eventbridge/latest/userguide/eb-pipes-event-target.html)
     * in the *Amazon EventBridge User Guide* .
     */
    override fun targetParameters(targetParameters: CfnPipe.PipeTargetParametersProperty) {
      cdkBuilder.targetParameters(targetParameters.let(CfnPipe.PipeTargetParametersProperty.Companion::unwrap))
    }

    /**
     * @param targetParameters The parameters required to set up a target for your pipe.
     * For more information about pipe target parameters, including how to use dynamic path
     * parameters, see [Target
     * parameters](https://docs.aws.amazon.com/eventbridge/latest/userguide/eb-pipes-event-target.html)
     * in the *Amazon EventBridge User Guide* .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("dd711d2029ca2597d1b0f36aacc2891fbc90cd2160955befffd2af1c3c93316f")
    override
        fun targetParameters(targetParameters: CfnPipe.PipeTargetParametersProperty.Builder.() -> Unit):
        Unit = targetParameters(CfnPipe.PipeTargetParametersProperty(targetParameters))

    public fun build(): software.amazon.awscdk.services.pipes.CfnPipeProps = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.pipes.CfnPipeProps,
  ) : CdkObject(cdkObject),
      CfnPipeProps {
    /**
     * A description of the pipe.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pipes-pipe.html#cfn-pipes-pipe-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The state the pipe should be in.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pipes-pipe.html#cfn-pipes-pipe-desiredstate)
     */
    override fun desiredState(): String? = unwrap(this).getDesiredState()

    /**
     * The ARN of the enrichment resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pipes-pipe.html#cfn-pipes-pipe-enrichment)
     */
    override fun enrichment(): String? = unwrap(this).getEnrichment()

    /**
     * The parameters required to set up enrichment on your pipe.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pipes-pipe.html#cfn-pipes-pipe-enrichmentparameters)
     */
    override fun enrichmentParameters(): Any? = unwrap(this).getEnrichmentParameters()

    /**
     * The identifier of the AWS KMS customer managed key for EventBridge to use, if you choose to
     * use a customer managed key to encrypt pipe data.
     *
     * The identifier can be the key Amazon Resource Name (ARN), KeyId, key alias, or key alias ARN.
     *
     * To update a pipe that is using the default AWS owned key to use a customer managed key
     * instead, or update a pipe that is using a customer managed key to use a different customer
     * managed key, specify a customer managed key identifier.
     *
     * To update a pipe that is using a customer managed key to use the default AWS owned key ,
     * specify an empty string.
     *
     * For more information, see [Managing
     * keys](https://docs.aws.amazon.com/kms/latest/developerguide/getting-started.html) in the *AWS
     * Key Management Service Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pipes-pipe.html#cfn-pipes-pipe-kmskeyidentifier)
     */
    override fun kmsKeyIdentifier(): String? = unwrap(this).getKmsKeyIdentifier()

    /**
     * The logging configuration settings for the pipe.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pipes-pipe.html#cfn-pipes-pipe-logconfiguration)
     */
    override fun logConfiguration(): Any? = unwrap(this).getLogConfiguration()

    /**
     * The name of the pipe.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pipes-pipe.html#cfn-pipes-pipe-name)
     */
    override fun name(): String? = unwrap(this).getName()

    /**
     * The ARN of the role that allows the pipe to send data to the target.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pipes-pipe.html#cfn-pipes-pipe-rolearn)
     */
    override fun roleArn(): String = unwrap(this).getRoleArn()

    /**
     * The ARN of the source resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pipes-pipe.html#cfn-pipes-pipe-source)
     */
    override fun source(): String = unwrap(this).getSource()

    /**
     * The parameters required to set up a source for your pipe.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pipes-pipe.html#cfn-pipes-pipe-sourceparameters)
     */
    override fun sourceParameters(): Any? = unwrap(this).getSourceParameters()

    /**
     * The list of key-value pairs to associate with the pipe.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pipes-pipe.html#cfn-pipes-pipe-tags)
     */
    override fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

    /**
     * The ARN of the target resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pipes-pipe.html#cfn-pipes-pipe-target)
     */
    override fun target(): String = unwrap(this).getTarget()

    /**
     * The parameters required to set up a target for your pipe.
     *
     * For more information about pipe target parameters, including how to use dynamic path
     * parameters, see [Target
     * parameters](https://docs.aws.amazon.com/eventbridge/latest/userguide/eb-pipes-event-target.html)
     * in the *Amazon EventBridge User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pipes-pipe.html#cfn-pipes-pipe-targetparameters)
     */
    override fun targetParameters(): Any? = unwrap(this).getTargetParameters()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnPipeProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.pipes.CfnPipeProps): CfnPipeProps =
        CdkObjectWrappers.wrap(cdkObject) as? CfnPipeProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnPipeProps): software.amazon.awscdk.services.pipes.CfnPipeProps =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.pipes.CfnPipeProps
  }
}
