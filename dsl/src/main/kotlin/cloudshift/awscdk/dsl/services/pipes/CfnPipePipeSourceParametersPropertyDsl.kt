@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.pipes

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.pipes.CfnPipe

@CdkDslMarker
public class CfnPipePipeSourceParametersPropertyDsl {
    private val cdkBuilder: CfnPipe.PipeSourceParametersProperty.Builder =
        CfnPipe.PipeSourceParametersProperty.builder()

    public fun activeMqBrokerParameters(activeMqBrokerParameters: IResolvable) {
        cdkBuilder.activeMqBrokerParameters(activeMqBrokerParameters)
    }

    public fun activeMqBrokerParameters(activeMqBrokerParameters: CfnPipe.PipeSourceActiveMQBrokerParametersProperty) {
        cdkBuilder.activeMqBrokerParameters(activeMqBrokerParameters)
    }

    public fun dynamoDbStreamParameters(dynamoDbStreamParameters: IResolvable) {
        cdkBuilder.dynamoDbStreamParameters(dynamoDbStreamParameters)
    }

    public fun dynamoDbStreamParameters(dynamoDbStreamParameters: CfnPipe.PipeSourceDynamoDBStreamParametersProperty) {
        cdkBuilder.dynamoDbStreamParameters(dynamoDbStreamParameters)
    }

    public fun filterCriteria(filterCriteria: IResolvable) {
        cdkBuilder.filterCriteria(filterCriteria)
    }

    public fun filterCriteria(filterCriteria: CfnPipe.FilterCriteriaProperty) {
        cdkBuilder.filterCriteria(filterCriteria)
    }

    public fun kinesisStreamParameters(kinesisStreamParameters: IResolvable) {
        cdkBuilder.kinesisStreamParameters(kinesisStreamParameters)
    }

    public fun kinesisStreamParameters(kinesisStreamParameters: CfnPipe.PipeSourceKinesisStreamParametersProperty) {
        cdkBuilder.kinesisStreamParameters(kinesisStreamParameters)
    }

    public fun managedStreamingKafkaParameters(managedStreamingKafkaParameters: IResolvable) {
        cdkBuilder.managedStreamingKafkaParameters(managedStreamingKafkaParameters)
    }

    public fun managedStreamingKafkaParameters(managedStreamingKafkaParameters: CfnPipe.PipeSourceManagedStreamingKafkaParametersProperty) {
        cdkBuilder.managedStreamingKafkaParameters(managedStreamingKafkaParameters)
    }

    public fun rabbitMqBrokerParameters(rabbitMqBrokerParameters: IResolvable) {
        cdkBuilder.rabbitMqBrokerParameters(rabbitMqBrokerParameters)
    }

    public fun rabbitMqBrokerParameters(rabbitMqBrokerParameters: CfnPipe.PipeSourceRabbitMQBrokerParametersProperty) {
        cdkBuilder.rabbitMqBrokerParameters(rabbitMqBrokerParameters)
    }

    public fun selfManagedKafkaParameters(selfManagedKafkaParameters: IResolvable) {
        cdkBuilder.selfManagedKafkaParameters(selfManagedKafkaParameters)
    }

    public fun selfManagedKafkaParameters(selfManagedKafkaParameters: CfnPipe.PipeSourceSelfManagedKafkaParametersProperty) {
        cdkBuilder.selfManagedKafkaParameters(selfManagedKafkaParameters)
    }

    public fun sqsQueueParameters(sqsQueueParameters: IResolvable) {
        cdkBuilder.sqsQueueParameters(sqsQueueParameters)
    }

    public fun sqsQueueParameters(sqsQueueParameters: CfnPipe.PipeSourceSqsQueueParametersProperty) {
        cdkBuilder.sqsQueueParameters(sqsQueueParameters)
    }

    public fun build(): CfnPipe.PipeSourceParametersProperty = cdkBuilder.build()
}
