@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lambda

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map

/**
 * Properties for declaring a new event source mapping.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.*;
 * import io.cloudshiftdev.awscdk.services.lambda.*;
 * IEventSourceDlq eventSourceDlq;
 * Object filters;
 * Function function_;
 * SourceAccessConfigurationType sourceAccessConfigurationType;
 * EventSourceMappingProps eventSourceMappingProps = EventSourceMappingProps.builder()
 * .target(function_)
 * // the properties below are optional
 * .batchSize(123)
 * .bisectBatchOnError(false)
 * .enabled(false)
 * .eventSourceArn("eventSourceArn")
 * .filters(List.of(Map.of(
 * "filtersKey", filters)))
 * .kafkaBootstrapServers(List.of("kafkaBootstrapServers"))
 * .kafkaConsumerGroupId("kafkaConsumerGroupId")
 * .kafkaTopic("kafkaTopic")
 * .maxBatchingWindow(Duration.minutes(30))
 * .maxConcurrency(123)
 * .maxRecordAge(Duration.minutes(30))
 * .onFailure(eventSourceDlq)
 * .parallelizationFactor(123)
 * .reportBatchItemFailures(false)
 * .retryAttempts(123)
 * .sourceAccessConfigurations(List.of(SourceAccessConfiguration.builder()
 * .type(sourceAccessConfigurationType)
 * .uri("uri")
 * .build()))
 * .startingPosition(StartingPosition.TRIM_HORIZON)
 * .startingPositionTimestamp(123)
 * .supportS3OnFailureDestination(false)
 * .tumblingWindow(Duration.minutes(30))
 * .build();
 * ```
 */
public interface EventSourceMappingProps : EventSourceMappingOptions {
  /**
   * The target AWS Lambda function.
   */
  public fun target(): IFunction

  /**
   * A builder for [EventSourceMappingProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param batchSize The largest number of records that AWS Lambda will retrieve from your event
     * source at the time of invoking your function.
     * Your function receives an
     * event with all the retrieved records.
     *
     * Valid Range: Minimum value of 1. Maximum value of 10000.
     */
    public fun batchSize(batchSize: Number)

    /**
     * @param bisectBatchOnError If the function returns an error, split the batch in two and retry.
     */
    public fun bisectBatchOnError(bisectBatchOnError: Boolean)

    /**
     * @param enabled Set to false to disable the event source upon creation.
     */
    public fun enabled(enabled: Boolean)

    /**
     * @param eventSourceArn The Amazon Resource Name (ARN) of the event source.
     * Any record added to
     * this stream can invoke the Lambda function.
     */
    public fun eventSourceArn(eventSourceArn: String)

    /**
     * @param filters Add filter criteria to Event Source.
     */
    public fun filters(filters: List<Map<String, Any>>)

    /**
     * @param filters Add filter criteria to Event Source.
     */
    public fun filters(vararg filters: Map<String, Any>)

    /**
     * @param kafkaBootstrapServers A list of host and port pairs that are the addresses of the
     * Kafka brokers in a self managed "bootstrap" Kafka cluster that a Kafka client connects to
     * initially to bootstrap itself.
     * They are in the format `abc.example.com:9096`.
     */
    public fun kafkaBootstrapServers(kafkaBootstrapServers: List<String>)

    /**
     * @param kafkaBootstrapServers A list of host and port pairs that are the addresses of the
     * Kafka brokers in a self managed "bootstrap" Kafka cluster that a Kafka client connects to
     * initially to bootstrap itself.
     * They are in the format `abc.example.com:9096`.
     */
    public fun kafkaBootstrapServers(vararg kafkaBootstrapServers: String)

    /**
     * @param kafkaConsumerGroupId The identifier for the Kafka consumer group to join.
     * The consumer group ID must be unique among all your Kafka event sources. After creating a
     * Kafka event source mapping with the consumer group ID specified, you cannot update this value.
     * The value must have a lenght between 1 and 200 and full the pattern '[a-zA-Z0-9-/
     * *:_+=.&#64;-]*'. For more information, see [Customizable consumer group
     * ID](https://docs.aws.amazon.com/lambda/latest/dg/with-msk.html#services-msk-consumer-group-id).
     */
    public fun kafkaConsumerGroupId(kafkaConsumerGroupId: String)

    /**
     * @param kafkaTopic The name of the Kafka topic.
     */
    public fun kafkaTopic(kafkaTopic: String)

    /**
     * @param maxBatchingWindow The maximum amount of time to gather records before invoking the
     * function.
     * Maximum of Duration.minutes(5)
     */
    public fun maxBatchingWindow(maxBatchingWindow: Duration)

    /**
     * @param maxConcurrency The maximum concurrency setting limits the number of concurrent
     * instances of the function that an Amazon SQS event source can invoke.
     */
    public fun maxConcurrency(maxConcurrency: Number)

    /**
     * @param maxRecordAge The maximum age of a record that Lambda sends to a function for
     * processing.
     * Valid Range:
     *
     * * Minimum value of 60 seconds
     * * Maximum value of 7 days
     */
    public fun maxRecordAge(maxRecordAge: Duration)

    /**
     * @param onFailure An Amazon SQS queue or Amazon SNS topic destination for discarded records.
     */
    public fun onFailure(onFailure: IEventSourceDlq)

    /**
     * @param parallelizationFactor The number of batches to process from each shard concurrently.
     * Valid Range:
     *
     * * Minimum value of 1
     * * Maximum value of 10
     */
    public fun parallelizationFactor(parallelizationFactor: Number)

    /**
     * @param reportBatchItemFailures Allow functions to return partially successful responses for a
     * batch of records.
     */
    public fun reportBatchItemFailures(reportBatchItemFailures: Boolean)

    /**
     * @param retryAttempts The maximum number of times to retry when the function returns an error.
     * Set to `undefined` if you want lambda to keep retrying infinitely or until
     * the record expires.
     *
     * Valid Range:
     *
     * * Minimum value of 0
     * * Maximum value of 10000
     */
    public fun retryAttempts(retryAttempts: Number)

    /**
     * @param sourceAccessConfigurations Specific settings like the authentication protocol or the
     * VPC components to secure access to your event source.
     */
    public
        fun sourceAccessConfigurations(sourceAccessConfigurations: List<SourceAccessConfiguration>)

    /**
     * @param sourceAccessConfigurations Specific settings like the authentication protocol or the
     * VPC components to secure access to your event source.
     */
    public fun sourceAccessConfigurations(vararg
        sourceAccessConfigurations: SourceAccessConfiguration)

    /**
     * @param startingPosition The position in the DynamoDB, Kinesis or MSK stream where AWS Lambda
     * should start reading.
     */
    public fun startingPosition(startingPosition: StartingPosition)

    /**
     * @param startingPositionTimestamp The time from which to start reading, in Unix time seconds.
     */
    public fun startingPositionTimestamp(startingPositionTimestamp: Number)

    /**
     * @param supportS3OnFailureDestination Check if support S3 onfailure destination(ODF).
     * Currently only MSK and self managed kafka event support S3 ODF
     */
    public fun supportS3OnFailureDestination(supportS3OnFailureDestination: Boolean)

    /**
     * @param target The target AWS Lambda function. 
     */
    public fun target(target: IFunction)

    /**
     * @param tumblingWindow The size of the tumbling windows to group records sent to DynamoDB or
     * Kinesis.
     */
    public fun tumblingWindow(tumblingWindow: Duration)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.lambda.EventSourceMappingProps.Builder =
        software.amazon.awscdk.services.lambda.EventSourceMappingProps.builder()

    /**
     * @param batchSize The largest number of records that AWS Lambda will retrieve from your event
     * source at the time of invoking your function.
     * Your function receives an
     * event with all the retrieved records.
     *
     * Valid Range: Minimum value of 1. Maximum value of 10000.
     */
    override fun batchSize(batchSize: Number) {
      cdkBuilder.batchSize(batchSize)
    }

    /**
     * @param bisectBatchOnError If the function returns an error, split the batch in two and retry.
     */
    override fun bisectBatchOnError(bisectBatchOnError: Boolean) {
      cdkBuilder.bisectBatchOnError(bisectBatchOnError)
    }

    /**
     * @param enabled Set to false to disable the event source upon creation.
     */
    override fun enabled(enabled: Boolean) {
      cdkBuilder.enabled(enabled)
    }

    /**
     * @param eventSourceArn The Amazon Resource Name (ARN) of the event source.
     * Any record added to
     * this stream can invoke the Lambda function.
     */
    override fun eventSourceArn(eventSourceArn: String) {
      cdkBuilder.eventSourceArn(eventSourceArn)
    }

    /**
     * @param filters Add filter criteria to Event Source.
     */
    override fun filters(filters: List<Map<String, Any>>) {
      cdkBuilder.filters(filters)
    }

    /**
     * @param filters Add filter criteria to Event Source.
     */
    override fun filters(vararg filters: Map<String, Any>): Unit = filters(filters.toList())

    /**
     * @param kafkaBootstrapServers A list of host and port pairs that are the addresses of the
     * Kafka brokers in a self managed "bootstrap" Kafka cluster that a Kafka client connects to
     * initially to bootstrap itself.
     * They are in the format `abc.example.com:9096`.
     */
    override fun kafkaBootstrapServers(kafkaBootstrapServers: List<String>) {
      cdkBuilder.kafkaBootstrapServers(kafkaBootstrapServers)
    }

    /**
     * @param kafkaBootstrapServers A list of host and port pairs that are the addresses of the
     * Kafka brokers in a self managed "bootstrap" Kafka cluster that a Kafka client connects to
     * initially to bootstrap itself.
     * They are in the format `abc.example.com:9096`.
     */
    override fun kafkaBootstrapServers(vararg kafkaBootstrapServers: String): Unit =
        kafkaBootstrapServers(kafkaBootstrapServers.toList())

    /**
     * @param kafkaConsumerGroupId The identifier for the Kafka consumer group to join.
     * The consumer group ID must be unique among all your Kafka event sources. After creating a
     * Kafka event source mapping with the consumer group ID specified, you cannot update this value.
     * The value must have a lenght between 1 and 200 and full the pattern '[a-zA-Z0-9-/
     * *:_+=.&#64;-]*'. For more information, see [Customizable consumer group
     * ID](https://docs.aws.amazon.com/lambda/latest/dg/with-msk.html#services-msk-consumer-group-id).
     */
    override fun kafkaConsumerGroupId(kafkaConsumerGroupId: String) {
      cdkBuilder.kafkaConsumerGroupId(kafkaConsumerGroupId)
    }

    /**
     * @param kafkaTopic The name of the Kafka topic.
     */
    override fun kafkaTopic(kafkaTopic: String) {
      cdkBuilder.kafkaTopic(kafkaTopic)
    }

    /**
     * @param maxBatchingWindow The maximum amount of time to gather records before invoking the
     * function.
     * Maximum of Duration.minutes(5)
     */
    override fun maxBatchingWindow(maxBatchingWindow: Duration) {
      cdkBuilder.maxBatchingWindow(maxBatchingWindow.let(Duration::unwrap))
    }

    /**
     * @param maxConcurrency The maximum concurrency setting limits the number of concurrent
     * instances of the function that an Amazon SQS event source can invoke.
     */
    override fun maxConcurrency(maxConcurrency: Number) {
      cdkBuilder.maxConcurrency(maxConcurrency)
    }

    /**
     * @param maxRecordAge The maximum age of a record that Lambda sends to a function for
     * processing.
     * Valid Range:
     *
     * * Minimum value of 60 seconds
     * * Maximum value of 7 days
     */
    override fun maxRecordAge(maxRecordAge: Duration) {
      cdkBuilder.maxRecordAge(maxRecordAge.let(Duration::unwrap))
    }

    /**
     * @param onFailure An Amazon SQS queue or Amazon SNS topic destination for discarded records.
     */
    override fun onFailure(onFailure: IEventSourceDlq) {
      cdkBuilder.onFailure(onFailure.let(IEventSourceDlq::unwrap))
    }

    /**
     * @param parallelizationFactor The number of batches to process from each shard concurrently.
     * Valid Range:
     *
     * * Minimum value of 1
     * * Maximum value of 10
     */
    override fun parallelizationFactor(parallelizationFactor: Number) {
      cdkBuilder.parallelizationFactor(parallelizationFactor)
    }

    /**
     * @param reportBatchItemFailures Allow functions to return partially successful responses for a
     * batch of records.
     */
    override fun reportBatchItemFailures(reportBatchItemFailures: Boolean) {
      cdkBuilder.reportBatchItemFailures(reportBatchItemFailures)
    }

    /**
     * @param retryAttempts The maximum number of times to retry when the function returns an error.
     * Set to `undefined` if you want lambda to keep retrying infinitely or until
     * the record expires.
     *
     * Valid Range:
     *
     * * Minimum value of 0
     * * Maximum value of 10000
     */
    override fun retryAttempts(retryAttempts: Number) {
      cdkBuilder.retryAttempts(retryAttempts)
    }

    /**
     * @param sourceAccessConfigurations Specific settings like the authentication protocol or the
     * VPC components to secure access to your event source.
     */
    override
        fun sourceAccessConfigurations(sourceAccessConfigurations: List<SourceAccessConfiguration>) {
      cdkBuilder.sourceAccessConfigurations(sourceAccessConfigurations.map(SourceAccessConfiguration::unwrap))
    }

    /**
     * @param sourceAccessConfigurations Specific settings like the authentication protocol or the
     * VPC components to secure access to your event source.
     */
    override fun sourceAccessConfigurations(vararg
        sourceAccessConfigurations: SourceAccessConfiguration): Unit =
        sourceAccessConfigurations(sourceAccessConfigurations.toList())

    /**
     * @param startingPosition The position in the DynamoDB, Kinesis or MSK stream where AWS Lambda
     * should start reading.
     */
    override fun startingPosition(startingPosition: StartingPosition) {
      cdkBuilder.startingPosition(startingPosition.let(StartingPosition::unwrap))
    }

    /**
     * @param startingPositionTimestamp The time from which to start reading, in Unix time seconds.
     */
    override fun startingPositionTimestamp(startingPositionTimestamp: Number) {
      cdkBuilder.startingPositionTimestamp(startingPositionTimestamp)
    }

    /**
     * @param supportS3OnFailureDestination Check if support S3 onfailure destination(ODF).
     * Currently only MSK and self managed kafka event support S3 ODF
     */
    override fun supportS3OnFailureDestination(supportS3OnFailureDestination: Boolean) {
      cdkBuilder.supportS3OnFailureDestination(supportS3OnFailureDestination)
    }

    /**
     * @param target The target AWS Lambda function. 
     */
    override fun target(target: IFunction) {
      cdkBuilder.target(target.let(IFunction::unwrap))
    }

    /**
     * @param tumblingWindow The size of the tumbling windows to group records sent to DynamoDB or
     * Kinesis.
     */
    override fun tumblingWindow(tumblingWindow: Duration) {
      cdkBuilder.tumblingWindow(tumblingWindow.let(Duration::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.lambda.EventSourceMappingProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.lambda.EventSourceMappingProps,
  ) : CdkObject(cdkObject), EventSourceMappingProps {
    /**
     * The largest number of records that AWS Lambda will retrieve from your event source at the
     * time of invoking your function.
     *
     * Your function receives an
     * event with all the retrieved records.
     *
     * Valid Range: Minimum value of 1. Maximum value of 10000.
     *
     * Default: - Amazon Kinesis, Amazon DynamoDB, and Amazon MSK is 100 records.
     * The default for Amazon SQS is 10 messages. For standard SQS queues, the maximum is 10,000.
     * For FIFO SQS queues, the maximum is 10.
     */
    override fun batchSize(): Number? = unwrap(this).getBatchSize()

    /**
     * If the function returns an error, split the batch in two and retry.
     *
     * Default: false
     */
    override fun bisectBatchOnError(): Boolean? = unwrap(this).getBisectBatchOnError()

    /**
     * Set to false to disable the event source upon creation.
     *
     * Default: true
     */
    override fun enabled(): Boolean? = unwrap(this).getEnabled()

    /**
     * The Amazon Resource Name (ARN) of the event source.
     *
     * Any record added to
     * this stream can invoke the Lambda function.
     *
     * Default: - not set if using a self managed Kafka cluster, throws an error otherwise
     */
    override fun eventSourceArn(): String? = unwrap(this).getEventSourceArn()

    /**
     * Add filter criteria to Event Source.
     *
     * Default: - none
     *
     * [Documentation](https://docs.aws.amazon.com/lambda/latest/dg/invocation-eventfiltering.html)
     */
    override fun filters(): List<Map<String, Any>> = unwrap(this).getFilters() ?: emptyList()

    /**
     * A list of host and port pairs that are the addresses of the Kafka brokers in a self managed
     * "bootstrap" Kafka cluster that a Kafka client connects to initially to bootstrap itself.
     *
     * They are in the format `abc.example.com:9096`.
     *
     * Default: - none
     */
    override fun kafkaBootstrapServers(): List<String> = unwrap(this).getKafkaBootstrapServers() ?:
        emptyList()

    /**
     * The identifier for the Kafka consumer group to join.
     *
     * The consumer group ID must be unique among all your Kafka event sources. After creating a
     * Kafka event source mapping with the consumer group ID specified, you cannot update this value.
     * The value must have a lenght between 1 and 200 and full the pattern '[a-zA-Z0-9-/
     * *:_+=.&#64;-]*'. For more information, see [Customizable consumer group
     * ID](https://docs.aws.amazon.com/lambda/latest/dg/with-msk.html#services-msk-consumer-group-id).
     *
     * Default: - none
     *
     * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-eventsourcemapping-selfmanagedkafkaeventsourceconfig.html)
     */
    override fun kafkaConsumerGroupId(): String? = unwrap(this).getKafkaConsumerGroupId()

    /**
     * The name of the Kafka topic.
     *
     * Default: - no topic
     */
    override fun kafkaTopic(): String? = unwrap(this).getKafkaTopic()

    /**
     * The maximum amount of time to gather records before invoking the function.
     *
     * Maximum of Duration.minutes(5)
     *
     * Default: Duration.seconds(0)
     */
    override fun maxBatchingWindow(): Duration? =
        unwrap(this).getMaxBatchingWindow()?.let(Duration::wrap)

    /**
     * The maximum concurrency setting limits the number of concurrent instances of the function
     * that an Amazon SQS event source can invoke.
     *
     * Default: - No specific limit.
     *
     * @see <a
     * href="https://docs.aws.amazon.com/lambda/latest/dg/with-sqs.html#events-sqs-max-concurrency
     * Valid Range: Minimum value of 2. Maximum value of
     * 1000.">https://docs.aws.amazon.com/lambda/latest/dg/with-sqs.html#events-sqs-max-concurrency
     * Valid Range: Minimum value of 2. Maximum value of 1000.</a>
     */
    override fun maxConcurrency(): Number? = unwrap(this).getMaxConcurrency()

    /**
     * The maximum age of a record that Lambda sends to a function for processing.
     *
     * Valid Range:
     *
     * * Minimum value of 60 seconds
     * * Maximum value of 7 days
     *
     * Default: - infinite or until the record expires.
     */
    override fun maxRecordAge(): Duration? = unwrap(this).getMaxRecordAge()?.let(Duration::wrap)

    /**
     * An Amazon SQS queue or Amazon SNS topic destination for discarded records.
     *
     * Default: discarded records are ignored
     */
    override fun onFailure(): IEventSourceDlq? =
        unwrap(this).getOnFailure()?.let(IEventSourceDlq::wrap)

    /**
     * The number of batches to process from each shard concurrently.
     *
     * Valid Range:
     *
     * * Minimum value of 1
     * * Maximum value of 10
     *
     * Default: 1
     */
    override fun parallelizationFactor(): Number? = unwrap(this).getParallelizationFactor()

    /**
     * Allow functions to return partially successful responses for a batch of records.
     *
     * Default: false
     *
     * [Documentation](https://docs.aws.amazon.com/lambda/latest/dg/with-ddb.html#services-ddb-batchfailurereporting)
     */
    override fun reportBatchItemFailures(): Boolean? = unwrap(this).getReportBatchItemFailures()

    /**
     * The maximum number of times to retry when the function returns an error.
     *
     * Set to `undefined` if you want lambda to keep retrying infinitely or until
     * the record expires.
     *
     * Valid Range:
     *
     * * Minimum value of 0
     * * Maximum value of 10000
     *
     * Default: - infinite or until the record expires.
     */
    override fun retryAttempts(): Number? = unwrap(this).getRetryAttempts()

    /**
     * Specific settings like the authentication protocol or the VPC components to secure access to
     * your event source.
     *
     * Default: - none
     *
     * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-eventsourcemapping-sourceaccessconfiguration.html)
     */
    override fun sourceAccessConfigurations(): List<SourceAccessConfiguration> =
        unwrap(this).getSourceAccessConfigurations()?.map(SourceAccessConfiguration::wrap) ?:
        emptyList()

    /**
     * The position in the DynamoDB, Kinesis or MSK stream where AWS Lambda should start reading.
     *
     * Default: - no starting position
     *
     * [Documentation](https://docs.aws.amazon.com/kinesis/latest/APIReference/API_GetShardIterator.html#Kinesis-GetShardIterator-request-ShardIteratorType)
     */
    override fun startingPosition(): StartingPosition? =
        unwrap(this).getStartingPosition()?.let(StartingPosition::wrap)

    /**
     * The time from which to start reading, in Unix time seconds.
     *
     * Default: - no timestamp
     */
    override fun startingPositionTimestamp(): Number? = unwrap(this).getStartingPositionTimestamp()

    /**
     * Check if support S3 onfailure destination(ODF).
     *
     * Currently only MSK and self managed kafka event support S3 ODF
     *
     * Default: false
     */
    override fun supportS3OnFailureDestination(): Boolean? =
        unwrap(this).getSupportS3OnFailureDestination()

    /**
     * The target AWS Lambda function.
     */
    override fun target(): IFunction = unwrap(this).getTarget().let(IFunction::wrap)

    /**
     * The size of the tumbling windows to group records sent to DynamoDB or Kinesis.
     *
     * Default: - None
     *
     * @see <a href="https://docs.aws.amazon.com/lambda/latest/dg/with-ddb.html#services-ddb-windows
     * Valid Range: 0 - 15
     * minutes">https://docs.aws.amazon.com/lambda/latest/dg/with-ddb.html#services-ddb-windows
     * Valid Range: 0 - 15 minutes</a>
     */
    override fun tumblingWindow(): Duration? = unwrap(this).getTumblingWindow()?.let(Duration::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): EventSourceMappingProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.lambda.EventSourceMappingProps):
        EventSourceMappingProps = CdkObjectWrappers.wrap(cdkObject) as? EventSourceMappingProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: EventSourceMappingProps):
        software.amazon.awscdk.services.lambda.EventSourceMappingProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.lambda.EventSourceMappingProps
  }
}
