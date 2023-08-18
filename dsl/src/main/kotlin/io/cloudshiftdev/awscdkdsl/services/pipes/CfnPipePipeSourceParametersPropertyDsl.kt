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

package io.cloudshiftdev.awscdkdsl.services.pipes

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.pipes.CfnPipe

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
@CdkDslMarker
public class CfnPipePipeSourceParametersPropertyDsl {
    private val cdkBuilder: CfnPipe.PipeSourceParametersProperty.Builder =
        CfnPipe.PipeSourceParametersProperty.builder()

    /** @param activeMqBrokerParameters The parameters for using an Active MQ broker as a source. */
    public fun activeMqBrokerParameters(activeMqBrokerParameters: IResolvable) {
        cdkBuilder.activeMqBrokerParameters(activeMqBrokerParameters)
    }

    /** @param activeMqBrokerParameters The parameters for using an Active MQ broker as a source. */
    public fun activeMqBrokerParameters(
        activeMqBrokerParameters: CfnPipe.PipeSourceActiveMQBrokerParametersProperty
    ) {
        cdkBuilder.activeMqBrokerParameters(activeMqBrokerParameters)
    }

    /** @param dynamoDbStreamParameters The parameters for using a DynamoDB stream as a source. */
    public fun dynamoDbStreamParameters(dynamoDbStreamParameters: IResolvable) {
        cdkBuilder.dynamoDbStreamParameters(dynamoDbStreamParameters)
    }

    /** @param dynamoDbStreamParameters The parameters for using a DynamoDB stream as a source. */
    public fun dynamoDbStreamParameters(
        dynamoDbStreamParameters: CfnPipe.PipeSourceDynamoDBStreamParametersProperty
    ) {
        cdkBuilder.dynamoDbStreamParameters(dynamoDbStreamParameters)
    }

    /**
     * @param filterCriteria The collection of event patterns used to filter events. To remove a
     *   filter, specify a `FilterCriteria` object with an empty array of `Filter` objects.
     *
     * For more information, see
     * [Events and Event Patterns](https://docs.aws.amazon.com/eventbridge/latest/userguide/eventbridge-and-event-patterns.html)
     * in the *Amazon EventBridge User Guide* .
     */
    public fun filterCriteria(filterCriteria: IResolvable) {
        cdkBuilder.filterCriteria(filterCriteria)
    }

    /**
     * @param filterCriteria The collection of event patterns used to filter events. To remove a
     *   filter, specify a `FilterCriteria` object with an empty array of `Filter` objects.
     *
     * For more information, see
     * [Events and Event Patterns](https://docs.aws.amazon.com/eventbridge/latest/userguide/eventbridge-and-event-patterns.html)
     * in the *Amazon EventBridge User Guide* .
     */
    public fun filterCriteria(filterCriteria: CfnPipe.FilterCriteriaProperty) {
        cdkBuilder.filterCriteria(filterCriteria)
    }

    /** @param kinesisStreamParameters The parameters for using a Kinesis stream as a source. */
    public fun kinesisStreamParameters(kinesisStreamParameters: IResolvable) {
        cdkBuilder.kinesisStreamParameters(kinesisStreamParameters)
    }

    /** @param kinesisStreamParameters The parameters for using a Kinesis stream as a source. */
    public fun kinesisStreamParameters(
        kinesisStreamParameters: CfnPipe.PipeSourceKinesisStreamParametersProperty
    ) {
        cdkBuilder.kinesisStreamParameters(kinesisStreamParameters)
    }

    /**
     * @param managedStreamingKafkaParameters The parameters for using an MSK stream as a source.
     */
    public fun managedStreamingKafkaParameters(managedStreamingKafkaParameters: IResolvable) {
        cdkBuilder.managedStreamingKafkaParameters(managedStreamingKafkaParameters)
    }

    /**
     * @param managedStreamingKafkaParameters The parameters for using an MSK stream as a source.
     */
    public fun managedStreamingKafkaParameters(
        managedStreamingKafkaParameters: CfnPipe.PipeSourceManagedStreamingKafkaParametersProperty
    ) {
        cdkBuilder.managedStreamingKafkaParameters(managedStreamingKafkaParameters)
    }

    /** @param rabbitMqBrokerParameters The parameters for using a Rabbit MQ broker as a source. */
    public fun rabbitMqBrokerParameters(rabbitMqBrokerParameters: IResolvable) {
        cdkBuilder.rabbitMqBrokerParameters(rabbitMqBrokerParameters)
    }

    /** @param rabbitMqBrokerParameters The parameters for using a Rabbit MQ broker as a source. */
    public fun rabbitMqBrokerParameters(
        rabbitMqBrokerParameters: CfnPipe.PipeSourceRabbitMQBrokerParametersProperty
    ) {
        cdkBuilder.rabbitMqBrokerParameters(rabbitMqBrokerParameters)
    }

    /**
     * @param selfManagedKafkaParameters The parameters for using a self-managed Apache Kafka stream
     *   as a source.
     */
    public fun selfManagedKafkaParameters(selfManagedKafkaParameters: IResolvable) {
        cdkBuilder.selfManagedKafkaParameters(selfManagedKafkaParameters)
    }

    /**
     * @param selfManagedKafkaParameters The parameters for using a self-managed Apache Kafka stream
     *   as a source.
     */
    public fun selfManagedKafkaParameters(
        selfManagedKafkaParameters: CfnPipe.PipeSourceSelfManagedKafkaParametersProperty
    ) {
        cdkBuilder.selfManagedKafkaParameters(selfManagedKafkaParameters)
    }

    /** @param sqsQueueParameters The parameters for using a Amazon SQS stream as a source. */
    public fun sqsQueueParameters(sqsQueueParameters: IResolvable) {
        cdkBuilder.sqsQueueParameters(sqsQueueParameters)
    }

    /** @param sqsQueueParameters The parameters for using a Amazon SQS stream as a source. */
    public fun sqsQueueParameters(
        sqsQueueParameters: CfnPipe.PipeSourceSqsQueueParametersProperty
    ) {
        cdkBuilder.sqsQueueParameters(sqsQueueParameters)
    }

    public fun build(): CfnPipe.PipeSourceParametersProperty = cdkBuilder.build()
}
