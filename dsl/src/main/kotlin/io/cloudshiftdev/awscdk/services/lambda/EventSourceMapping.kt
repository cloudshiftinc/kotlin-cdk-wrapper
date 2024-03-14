package io.cloudshiftdev.awscdk.services.lambda

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import software.constructs.Construct as SoftwareConstructsConstruct

public open class EventSourceMapping
internal constructor(
    private val cdkObject: software.amazon.awscdk.services.lambda.EventSourceMapping,
) : Resource(cdkObject), IEventSourceMapping {
    /**
     * The ARN of the event source mapping (i.e.
     * arn:aws:lambda:region:account-id:event-source-mapping/event-source-mapping-id).
     */
    public override fun eventSourceMappingArn(): String = unwrap(this).getEventSourceMappingArn()

    /** The identifier for this EventSourceMapping. */
    public override fun eventSourceMappingId(): String = unwrap(this).getEventSourceMappingId()

    /** A fluent builder for [io.cloudshiftdev.awscdk.services.lambda.EventSourceMapping]. */
    @CdkDslMarker
    public interface Builder {
        /**
         * The largest number of records that AWS Lambda will retrieve from your event source at the
         * time of invoking your function.
         *
         * Your function receives an event with all the retrieved records.
         *
         * Valid Range: Minimum value of 1. Maximum value of 10000.
         *
         * Default: - Amazon Kinesis, Amazon DynamoDB, and Amazon MSK is 100 records. The default
         * for Amazon SQS is 10 messages. For standard SQS queues, the maximum is 10,000. For FIFO
         * SQS queues, the maximum is 10.
         *
         * @param batchSize The largest number of records that AWS Lambda will retrieve from your
         *   event source at the time of invoking your function.
         */
        public fun batchSize(batchSize: Number)

        /**
         * If the function returns an error, split the batch in two and retry.
         *
         * Default: false
         *
         * @param bisectBatchOnError If the function returns an error, split the batch in two and
         *   retry.
         */
        public fun bisectBatchOnError(bisectBatchOnError: Boolean)

        /**
         * Set to false to disable the event source upon creation.
         *
         * Default: true
         *
         * @param enabled Set to false to disable the event source upon creation.
         */
        public fun enabled(enabled: Boolean)

        /**
         * The Amazon Resource Name (ARN) of the event source.
         *
         * Any record added to this stream can invoke the Lambda function.
         *
         * Default: - not set if using a self managed Kafka cluster, throws an error otherwise
         *
         * @param eventSourceArn The Amazon Resource Name (ARN) of the event source.
         */
        public fun eventSourceArn(eventSourceArn: String)

        /**
         * Add filter criteria to Event Source.
         *
         * Default: - none
         *
         * [Documentation](https://docs.aws.amazon.com/lambda/latest/dg/invocation-eventfiltering.html)
         *
         * @param filters Add filter criteria to Event Source.
         */
        public fun filters(filters: List<Map<String, Any>>)

        /**
         * Add filter criteria to Event Source.
         *
         * Default: - none
         *
         * [Documentation](https://docs.aws.amazon.com/lambda/latest/dg/invocation-eventfiltering.html)
         *
         * @param filters Add filter criteria to Event Source.
         */
        public fun filters(vararg filters: Map<String, Any>)

        /**
         * A list of host and port pairs that are the addresses of the Kafka brokers in a self
         * managed "bootstrap" Kafka cluster that a Kafka client connects to initially to bootstrap
         * itself.
         *
         * They are in the format `abc.example.com:9096`.
         *
         * Default: - none
         *
         * @param kafkaBootstrapServers A list of host and port pairs that are the addresses of the
         *   Kafka brokers in a self managed "bootstrap" Kafka cluster that a Kafka client connects
         *   to initially to bootstrap itself.
         */
        public fun kafkaBootstrapServers(kafkaBootstrapServers: List<String>)

        /**
         * A list of host and port pairs that are the addresses of the Kafka brokers in a self
         * managed "bootstrap" Kafka cluster that a Kafka client connects to initially to bootstrap
         * itself.
         *
         * They are in the format `abc.example.com:9096`.
         *
         * Default: - none
         *
         * @param kafkaBootstrapServers A list of host and port pairs that are the addresses of the
         *   Kafka brokers in a self managed "bootstrap" Kafka cluster that a Kafka client connects
         *   to initially to bootstrap itself.
         */
        public fun kafkaBootstrapServers(vararg kafkaBootstrapServers: String)

        /**
         * The identifier for the Kafka consumer group to join.
         *
         * The consumer group ID must be unique among all your Kafka event sources. After creating a
         * Kafka event source mapping with the consumer group ID specified, you cannot update this
         * value. The value must have a lenght between 1 and 200 and full the pattern '[a-zA-Z0-9-/
         * *:_+=.&#64;-]*'. For more information, see
         * [Customizable consumer group ID](https://docs.aws.amazon.com/lambda/latest/dg/with-msk.html#services-msk-consumer-group-id).
         *
         * Default: - none
         *
         * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-eventsourcemapping-selfmanagedkafkaeventsourceconfig.html)
         *
         * @param kafkaConsumerGroupId The identifier for the Kafka consumer group to join.
         */
        public fun kafkaConsumerGroupId(kafkaConsumerGroupId: String)

        /**
         * The name of the Kafka topic.
         *
         * Default: - no topic
         *
         * @param kafkaTopic The name of the Kafka topic.
         */
        public fun kafkaTopic(kafkaTopic: String)

        /**
         * The maximum amount of time to gather records before invoking the function.
         *
         * Maximum of Duration.minutes(5)
         *
         * Default: Duration.seconds(0)
         *
         * @param maxBatchingWindow The maximum amount of time to gather records before invoking the
         *   function.
         */
        public fun maxBatchingWindow(maxBatchingWindow: Duration)

        /**
         * The maximum concurrency setting limits the number of concurrent instances of the function
         * that an Amazon SQS event source can invoke.
         *
         * Default: - No specific limit.
         *
         * @param maxConcurrency The maximum concurrency setting limits the number of concurrent
         *   instances of the function that an Amazon SQS event source can invoke.
         * @see <a
         *   href="https://docs.aws.amazon.com/lambda/latest/dg/with-sqs.html#events-sqs-max-concurrency
         *   Valid Range: Minimum value of 2. Maximum value of
         *   1000.">https://docs.aws.amazon.com/lambda/latest/dg/with-sqs.html#events-sqs-max-concurrency
         *   Valid Range: Minimum value of 2. Maximum value of 1000.</a>
         */
        public fun maxConcurrency(maxConcurrency: Number)

        /**
         * The maximum age of a record that Lambda sends to a function for processing.
         *
         * Valid Range:
         * * Minimum value of 60 seconds
         * * Maximum value of 7 days
         *
         * Default: - infinite or until the record expires.
         *
         * @param maxRecordAge The maximum age of a record that Lambda sends to a function for
         *   processing.
         */
        public fun maxRecordAge(maxRecordAge: Duration)

        /**
         * An Amazon SQS queue or Amazon SNS topic destination for discarded records.
         *
         * Default: discarded records are ignored
         *
         * @param onFailure An Amazon SQS queue or Amazon SNS topic destination for discarded
         *   records.
         */
        public fun onFailure(onFailure: IEventSourceDlq)

        /**
         * The number of batches to process from each shard concurrently.
         *
         * Valid Range:
         * * Minimum value of 1
         * * Maximum value of 10
         *
         * Default: 1
         *
         * @param parallelizationFactor The number of batches to process from each shard
         *   concurrently.
         */
        public fun parallelizationFactor(parallelizationFactor: Number)

        /**
         * Allow functions to return partially successful responses for a batch of records.
         *
         * Default: false
         *
         * [Documentation](https://docs.aws.amazon.com/lambda/latest/dg/with-ddb.html#services-ddb-batchfailurereporting)
         *
         * @param reportBatchItemFailures Allow functions to return partially successful responses
         *   for a batch of records.
         */
        public fun reportBatchItemFailures(reportBatchItemFailures: Boolean)

        /**
         * The maximum number of times to retry when the function returns an error.
         *
         * Set to `undefined` if you want lambda to keep retrying infinitely or until the record
         * expires.
         *
         * Valid Range:
         * * Minimum value of 0
         * * Maximum value of 10000
         *
         * Default: - infinite or until the record expires.
         *
         * @param retryAttempts The maximum number of times to retry when the function returns an
         *   error.
         */
        public fun retryAttempts(retryAttempts: Number)

        /**
         * Specific settings like the authentication protocol or the VPC components to secure access
         * to your event source.
         *
         * Default: - none
         *
         * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-eventsourcemapping-sourceaccessconfiguration.html)
         *
         * @param sourceAccessConfigurations Specific settings like the authentication protocol or
         *   the VPC components to secure access to your event source.
         */
        public fun sourceAccessConfigurations(
            sourceAccessConfigurations: List<SourceAccessConfiguration>
        )

        /**
         * Specific settings like the authentication protocol or the VPC components to secure access
         * to your event source.
         *
         * Default: - none
         *
         * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-eventsourcemapping-sourceaccessconfiguration.html)
         *
         * @param sourceAccessConfigurations Specific settings like the authentication protocol or
         *   the VPC components to secure access to your event source.
         */
        public fun sourceAccessConfigurations(
            vararg sourceAccessConfigurations: SourceAccessConfiguration
        )

        /**
         * The position in the DynamoDB, Kinesis or MSK stream where AWS Lambda should start
         * reading.
         *
         * Default: - no starting position
         *
         * [Documentation](https://docs.aws.amazon.com/kinesis/latest/APIReference/API_GetShardIterator.html#Kinesis-GetShardIterator-request-ShardIteratorType)
         *
         * @param startingPosition The position in the DynamoDB, Kinesis or MSK stream where AWS
         *   Lambda should start reading.
         */
        public fun startingPosition(startingPosition: StartingPosition)

        /**
         * The time from which to start reading, in Unix time seconds.
         *
         * Default: - no timestamp
         *
         * @param startingPositionTimestamp The time from which to start reading, in Unix time
         *   seconds.
         */
        public fun startingPositionTimestamp(startingPositionTimestamp: Number)

        /**
         * Check if support S3 onfailure destination(ODF).
         *
         * Currently only MSK and self managed kafka event support S3 ODF
         *
         * Default: false
         *
         * @param supportS3OnFailureDestination Check if support S3 onfailure destination(ODF).
         */
        public fun supportS3OnFailureDestination(supportS3OnFailureDestination: Boolean)

        /**
         * The target AWS Lambda function.
         *
         * @param target The target AWS Lambda function.
         */
        public fun target(target: IFunction)

        /**
         * The size of the tumbling windows to group records sent to DynamoDB or Kinesis.
         *
         * Default: - None
         *
         * @param tumblingWindow The size of the tumbling windows to group records sent to DynamoDB
         *   or Kinesis.
         * @see <a
         *   href="https://docs.aws.amazon.com/lambda/latest/dg/with-ddb.html#services-ddb-windows
         *   Valid Range: 0 - 15
         *   minutes">https://docs.aws.amazon.com/lambda/latest/dg/with-ddb.html#services-ddb-windows
         *   Valid Range: 0 - 15 minutes</a>
         */
        public fun tumblingWindow(tumblingWindow: Duration)
    }

    private class BuilderImpl(
        scope: SoftwareConstructsConstruct,
        id: String,
    ) : Builder {
        private val cdkBuilder: software.amazon.awscdk.services.lambda.EventSourceMapping.Builder =
            software.amazon.awscdk.services.lambda.EventSourceMapping.Builder.create(scope, id)

        /**
         * The largest number of records that AWS Lambda will retrieve from your event source at the
         * time of invoking your function.
         *
         * Your function receives an event with all the retrieved records.
         *
         * Valid Range: Minimum value of 1. Maximum value of 10000.
         *
         * Default: - Amazon Kinesis, Amazon DynamoDB, and Amazon MSK is 100 records. The default
         * for Amazon SQS is 10 messages. For standard SQS queues, the maximum is 10,000. For FIFO
         * SQS queues, the maximum is 10.
         *
         * @param batchSize The largest number of records that AWS Lambda will retrieve from your
         *   event source at the time of invoking your function.
         */
        override fun batchSize(batchSize: Number) {
            cdkBuilder.batchSize(batchSize)
        }

        /**
         * If the function returns an error, split the batch in two and retry.
         *
         * Default: false
         *
         * @param bisectBatchOnError If the function returns an error, split the batch in two and
         *   retry.
         */
        override fun bisectBatchOnError(bisectBatchOnError: Boolean) {
            cdkBuilder.bisectBatchOnError(bisectBatchOnError)
        }

        /**
         * Set to false to disable the event source upon creation.
         *
         * Default: true
         *
         * @param enabled Set to false to disable the event source upon creation.
         */
        override fun enabled(enabled: Boolean) {
            cdkBuilder.enabled(enabled)
        }

        /**
         * The Amazon Resource Name (ARN) of the event source.
         *
         * Any record added to this stream can invoke the Lambda function.
         *
         * Default: - not set if using a self managed Kafka cluster, throws an error otherwise
         *
         * @param eventSourceArn The Amazon Resource Name (ARN) of the event source.
         */
        override fun eventSourceArn(eventSourceArn: String) {
            cdkBuilder.eventSourceArn(eventSourceArn)
        }

        /**
         * Add filter criteria to Event Source.
         *
         * Default: - none
         *
         * [Documentation](https://docs.aws.amazon.com/lambda/latest/dg/invocation-eventfiltering.html)
         *
         * @param filters Add filter criteria to Event Source.
         */
        override fun filters(filters: List<Map<String, Any>>) {
            cdkBuilder.filters(filters)
        }

        /**
         * Add filter criteria to Event Source.
         *
         * Default: - none
         *
         * [Documentation](https://docs.aws.amazon.com/lambda/latest/dg/invocation-eventfiltering.html)
         *
         * @param filters Add filter criteria to Event Source.
         */
        override fun filters(vararg filters: Map<String, Any>): Unit = filters(filters.toList())

        /**
         * A list of host and port pairs that are the addresses of the Kafka brokers in a self
         * managed "bootstrap" Kafka cluster that a Kafka client connects to initially to bootstrap
         * itself.
         *
         * They are in the format `abc.example.com:9096`.
         *
         * Default: - none
         *
         * @param kafkaBootstrapServers A list of host and port pairs that are the addresses of the
         *   Kafka brokers in a self managed "bootstrap" Kafka cluster that a Kafka client connects
         *   to initially to bootstrap itself.
         */
        override fun kafkaBootstrapServers(kafkaBootstrapServers: List<String>) {
            cdkBuilder.kafkaBootstrapServers(kafkaBootstrapServers)
        }

        /**
         * A list of host and port pairs that are the addresses of the Kafka brokers in a self
         * managed "bootstrap" Kafka cluster that a Kafka client connects to initially to bootstrap
         * itself.
         *
         * They are in the format `abc.example.com:9096`.
         *
         * Default: - none
         *
         * @param kafkaBootstrapServers A list of host and port pairs that are the addresses of the
         *   Kafka brokers in a self managed "bootstrap" Kafka cluster that a Kafka client connects
         *   to initially to bootstrap itself.
         */
        override fun kafkaBootstrapServers(vararg kafkaBootstrapServers: String): Unit =
            kafkaBootstrapServers(kafkaBootstrapServers.toList())

        /**
         * The identifier for the Kafka consumer group to join.
         *
         * The consumer group ID must be unique among all your Kafka event sources. After creating a
         * Kafka event source mapping with the consumer group ID specified, you cannot update this
         * value. The value must have a lenght between 1 and 200 and full the pattern '[a-zA-Z0-9-/
         * *:_+=.&#64;-]*'. For more information, see
         * [Customizable consumer group ID](https://docs.aws.amazon.com/lambda/latest/dg/with-msk.html#services-msk-consumer-group-id).
         *
         * Default: - none
         *
         * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-eventsourcemapping-selfmanagedkafkaeventsourceconfig.html)
         *
         * @param kafkaConsumerGroupId The identifier for the Kafka consumer group to join.
         */
        override fun kafkaConsumerGroupId(kafkaConsumerGroupId: String) {
            cdkBuilder.kafkaConsumerGroupId(kafkaConsumerGroupId)
        }

        /**
         * The name of the Kafka topic.
         *
         * Default: - no topic
         *
         * @param kafkaTopic The name of the Kafka topic.
         */
        override fun kafkaTopic(kafkaTopic: String) {
            cdkBuilder.kafkaTopic(kafkaTopic)
        }

        /**
         * The maximum amount of time to gather records before invoking the function.
         *
         * Maximum of Duration.minutes(5)
         *
         * Default: Duration.seconds(0)
         *
         * @param maxBatchingWindow The maximum amount of time to gather records before invoking the
         *   function.
         */
        override fun maxBatchingWindow(maxBatchingWindow: Duration) {
            cdkBuilder.maxBatchingWindow(maxBatchingWindow.let(Duration::unwrap))
        }

        /**
         * The maximum concurrency setting limits the number of concurrent instances of the function
         * that an Amazon SQS event source can invoke.
         *
         * Default: - No specific limit.
         *
         * @param maxConcurrency The maximum concurrency setting limits the number of concurrent
         *   instances of the function that an Amazon SQS event source can invoke.
         * @see <a
         *   href="https://docs.aws.amazon.com/lambda/latest/dg/with-sqs.html#events-sqs-max-concurrency
         *   Valid Range: Minimum value of 2. Maximum value of
         *   1000.">https://docs.aws.amazon.com/lambda/latest/dg/with-sqs.html#events-sqs-max-concurrency
         *   Valid Range: Minimum value of 2. Maximum value of 1000.</a>
         */
        override fun maxConcurrency(maxConcurrency: Number) {
            cdkBuilder.maxConcurrency(maxConcurrency)
        }

        /**
         * The maximum age of a record that Lambda sends to a function for processing.
         *
         * Valid Range:
         * * Minimum value of 60 seconds
         * * Maximum value of 7 days
         *
         * Default: - infinite or until the record expires.
         *
         * @param maxRecordAge The maximum age of a record that Lambda sends to a function for
         *   processing.
         */
        override fun maxRecordAge(maxRecordAge: Duration) {
            cdkBuilder.maxRecordAge(maxRecordAge.let(Duration::unwrap))
        }

        /**
         * An Amazon SQS queue or Amazon SNS topic destination for discarded records.
         *
         * Default: discarded records are ignored
         *
         * @param onFailure An Amazon SQS queue or Amazon SNS topic destination for discarded
         *   records.
         */
        override fun onFailure(onFailure: IEventSourceDlq) {
            cdkBuilder.onFailure(onFailure.let(IEventSourceDlq::unwrap))
        }

        /**
         * The number of batches to process from each shard concurrently.
         *
         * Valid Range:
         * * Minimum value of 1
         * * Maximum value of 10
         *
         * Default: 1
         *
         * @param parallelizationFactor The number of batches to process from each shard
         *   concurrently.
         */
        override fun parallelizationFactor(parallelizationFactor: Number) {
            cdkBuilder.parallelizationFactor(parallelizationFactor)
        }

        /**
         * Allow functions to return partially successful responses for a batch of records.
         *
         * Default: false
         *
         * [Documentation](https://docs.aws.amazon.com/lambda/latest/dg/with-ddb.html#services-ddb-batchfailurereporting)
         *
         * @param reportBatchItemFailures Allow functions to return partially successful responses
         *   for a batch of records.
         */
        override fun reportBatchItemFailures(reportBatchItemFailures: Boolean) {
            cdkBuilder.reportBatchItemFailures(reportBatchItemFailures)
        }

        /**
         * The maximum number of times to retry when the function returns an error.
         *
         * Set to `undefined` if you want lambda to keep retrying infinitely or until the record
         * expires.
         *
         * Valid Range:
         * * Minimum value of 0
         * * Maximum value of 10000
         *
         * Default: - infinite or until the record expires.
         *
         * @param retryAttempts The maximum number of times to retry when the function returns an
         *   error.
         */
        override fun retryAttempts(retryAttempts: Number) {
            cdkBuilder.retryAttempts(retryAttempts)
        }

        /**
         * Specific settings like the authentication protocol or the VPC components to secure access
         * to your event source.
         *
         * Default: - none
         *
         * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-eventsourcemapping-sourceaccessconfiguration.html)
         *
         * @param sourceAccessConfigurations Specific settings like the authentication protocol or
         *   the VPC components to secure access to your event source.
         */
        override fun sourceAccessConfigurations(
            sourceAccessConfigurations: List<SourceAccessConfiguration>
        ) {
            cdkBuilder.sourceAccessConfigurations(
                sourceAccessConfigurations.map(SourceAccessConfiguration::unwrap)
            )
        }

        /**
         * Specific settings like the authentication protocol or the VPC components to secure access
         * to your event source.
         *
         * Default: - none
         *
         * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-eventsourcemapping-sourceaccessconfiguration.html)
         *
         * @param sourceAccessConfigurations Specific settings like the authentication protocol or
         *   the VPC components to secure access to your event source.
         */
        override fun sourceAccessConfigurations(
            vararg sourceAccessConfigurations: SourceAccessConfiguration
        ): Unit = sourceAccessConfigurations(sourceAccessConfigurations.toList())

        /**
         * The position in the DynamoDB, Kinesis or MSK stream where AWS Lambda should start
         * reading.
         *
         * Default: - no starting position
         *
         * [Documentation](https://docs.aws.amazon.com/kinesis/latest/APIReference/API_GetShardIterator.html#Kinesis-GetShardIterator-request-ShardIteratorType)
         *
         * @param startingPosition The position in the DynamoDB, Kinesis or MSK stream where AWS
         *   Lambda should start reading.
         */
        override fun startingPosition(startingPosition: StartingPosition) {
            cdkBuilder.startingPosition(startingPosition.let(StartingPosition::unwrap))
        }

        /**
         * The time from which to start reading, in Unix time seconds.
         *
         * Default: - no timestamp
         *
         * @param startingPositionTimestamp The time from which to start reading, in Unix time
         *   seconds.
         */
        override fun startingPositionTimestamp(startingPositionTimestamp: Number) {
            cdkBuilder.startingPositionTimestamp(startingPositionTimestamp)
        }

        /**
         * Check if support S3 onfailure destination(ODF).
         *
         * Currently only MSK and self managed kafka event support S3 ODF
         *
         * Default: false
         *
         * @param supportS3OnFailureDestination Check if support S3 onfailure destination(ODF).
         */
        override fun supportS3OnFailureDestination(supportS3OnFailureDestination: Boolean) {
            cdkBuilder.supportS3OnFailureDestination(supportS3OnFailureDestination)
        }

        /**
         * The target AWS Lambda function.
         *
         * @param target The target AWS Lambda function.
         */
        override fun target(target: IFunction) {
            cdkBuilder.target(target.let(IFunction::unwrap))
        }

        /**
         * The size of the tumbling windows to group records sent to DynamoDB or Kinesis.
         *
         * Default: - None
         *
         * @param tumblingWindow The size of the tumbling windows to group records sent to DynamoDB
         *   or Kinesis.
         * @see <a
         *   href="https://docs.aws.amazon.com/lambda/latest/dg/with-ddb.html#services-ddb-windows
         *   Valid Range: 0 - 15
         *   minutes">https://docs.aws.amazon.com/lambda/latest/dg/with-ddb.html#services-ddb-windows
         *   Valid Range: 0 - 15 minutes</a>
         */
        override fun tumblingWindow(tumblingWindow: Duration) {
            cdkBuilder.tumblingWindow(tumblingWindow.let(Duration::unwrap))
        }

        public fun build(): software.amazon.awscdk.services.lambda.EventSourceMapping =
            cdkBuilder.build()
    }

    public companion object {
        public fun fromEventSourceMappingId(
            scope: CloudshiftdevConstructsConstruct,
            id: String,
            eventSourceMappingId: String,
        ): IEventSourceMapping =
            software.amazon.awscdk.services.lambda.EventSourceMapping.fromEventSourceMappingId(
                    scope.let(CloudshiftdevConstructsConstruct::unwrap),
                    id,
                    eventSourceMappingId
                )
                .let(IEventSourceMapping::wrap)

        public operator fun invoke(
            scope: CloudshiftdevConstructsConstruct,
            id: String,
            block: Builder.() -> Unit = {},
        ): EventSourceMapping {
            val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
            return EventSourceMapping(builderImpl.apply(block).build())
        }

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.lambda.EventSourceMapping
        ): EventSourceMapping = EventSourceMapping(cdkObject)

        internal fun unwrap(
            wrapped: EventSourceMapping
        ): software.amazon.awscdk.services.lambda.EventSourceMapping = wrapped.cdkObject
    }
}
