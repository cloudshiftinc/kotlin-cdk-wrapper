@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lambda

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.lambda.EventSourceMapping
import software.amazon.awscdk.services.lambda.IEventSourceDlq
import software.amazon.awscdk.services.lambda.IFunction
import software.amazon.awscdk.services.lambda.SourceAccessConfiguration
import software.amazon.awscdk.services.lambda.StartingPosition
import software.constructs.Construct

/**
 * Defines a Lambda EventSourceMapping resource.
 *
 * Usually, you won't need to define the mapping yourself. This will usually be done by
 * event sources. For example, to add an SQS event source to a function:
 *
 * import { SqsEventSource } from '&#64;aws-cdk/aws-lambda-event-sources';
 * lambda.addEventSource(new SqsEventSource(sqs));
 *
 * The `SqsEventSource` class will automatically create the mapping, and will also
 * modify the Lambda's execution role so it can consume messages from the queue.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.*;
 * import software.amazon.awscdk.services.lambda.*;
 * IEventSourceDlq eventSourceDlq;
 * Object filters;
 * Function function_;
 * SourceAccessConfigurationType sourceAccessConfigurationType;
 * EventSourceMapping eventSourceMapping = EventSourceMapping.Builder.create(this,
 * "MyEventSourceMapping")
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
 * .tumblingWindow(Duration.minutes(30))
 * .build();
 * ```
 */
@CdkDslMarker
public class EventSourceMappingDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: EventSourceMapping.Builder = EventSourceMapping.Builder.create(scope, id)

  private val _filters: MutableList<Map<String, Any>> = mutableListOf()

  private val _kafkaBootstrapServers: MutableList<String> = mutableListOf()

  private val _sourceAccessConfigurations: MutableList<SourceAccessConfiguration> = mutableListOf()

  /**
   * The largest number of records that AWS Lambda will retrieve from your event source at the time
   * of invoking your function.
   *
   * Your function receives an
   * event with all the retrieved records.
   *
   * Valid Range: Minimum value of 1. Maximum value of 10000.
   *
   * Default: - Amazon Kinesis, Amazon DynamoDB, and Amazon MSK is 100 records.
   * The default for Amazon SQS is 10 messages. For standard SQS queues, the maximum is 10,000. For
   * FIFO SQS queues, the maximum is 10.
   *
   * @param batchSize The largest number of records that AWS Lambda will retrieve from your event
   * source at the time of invoking your function. 
   */
  public fun batchSize(batchSize: Number) {
    cdkBuilder.batchSize(batchSize)
  }

  /**
   * If the function returns an error, split the batch in two and retry.
   *
   * Default: false
   *
   * @param bisectBatchOnError If the function returns an error, split the batch in two and retry. 
   */
  public fun bisectBatchOnError(bisectBatchOnError: Boolean) {
    cdkBuilder.bisectBatchOnError(bisectBatchOnError)
  }

  /**
   * Set to false to disable the event source upon creation.
   *
   * Default: true
   *
   * @param enabled Set to false to disable the event source upon creation. 
   */
  public fun enabled(enabled: Boolean) {
    cdkBuilder.enabled(enabled)
  }

  /**
   * The Amazon Resource Name (ARN) of the event source.
   *
   * Any record added to
   * this stream can invoke the Lambda function.
   *
   * Default: - not set if using a self managed Kafka cluster, throws an error otherwise
   *
   * @param eventSourceArn The Amazon Resource Name (ARN) of the event source. 
   */
  public fun eventSourceArn(eventSourceArn: String) {
    cdkBuilder.eventSourceArn(eventSourceArn)
  }

  /**
   * Add filter criteria to Event Source.
   *
   * Default: - none
   *
   * [Documentation](https://docs.aws.amazon.com/lambda/latest/dg/invocation-eventfiltering.html)
   * @param filters Add filter criteria to Event Source. 
   */
  public fun filters(vararg filters: Map<String, Any>) {
    _filters.addAll(listOf(*filters))
  }

  /**
   * Add filter criteria to Event Source.
   *
   * Default: - none
   *
   * [Documentation](https://docs.aws.amazon.com/lambda/latest/dg/invocation-eventfiltering.html)
   * @param filters Add filter criteria to Event Source. 
   */
  public fun filters(filters: Collection<Map<String, Any>>) {
    _filters.addAll(filters)
  }

  /**
   * A list of host and port pairs that are the addresses of the Kafka brokers in a self managed
   * "bootstrap" Kafka cluster that a Kafka client connects to initially to bootstrap itself.
   *
   * They are in the format `abc.example.com:9096`.
   *
   * Default: - none
   *
   * @param kafkaBootstrapServers A list of host and port pairs that are the addresses of the Kafka
   * brokers in a self managed "bootstrap" Kafka cluster that a Kafka client connects to initially to
   * bootstrap itself. 
   */
  public fun kafkaBootstrapServers(vararg kafkaBootstrapServers: String) {
    _kafkaBootstrapServers.addAll(listOf(*kafkaBootstrapServers))
  }

  /**
   * A list of host and port pairs that are the addresses of the Kafka brokers in a self managed
   * "bootstrap" Kafka cluster that a Kafka client connects to initially to bootstrap itself.
   *
   * They are in the format `abc.example.com:9096`.
   *
   * Default: - none
   *
   * @param kafkaBootstrapServers A list of host and port pairs that are the addresses of the Kafka
   * brokers in a self managed "bootstrap" Kafka cluster that a Kafka client connects to initially to
   * bootstrap itself. 
   */
  public fun kafkaBootstrapServers(kafkaBootstrapServers: Collection<String>) {
    _kafkaBootstrapServers.addAll(kafkaBootstrapServers)
  }

  /**
   * The identifier for the Kafka consumer group to join.
   *
   * The consumer group ID must be unique among all your Kafka event sources. After creating a Kafka
   * event source mapping with the consumer group ID specified, you cannot update this value. The value
   * must have a lenght between 1 and 200 and full the pattern '[a-zA-Z0-9-/ *:_+=.&#64;-]*'. For more
   * information, see [Customizable consumer group
   * ID](https://docs.aws.amazon.com/lambda/latest/dg/with-msk.html#services-msk-consumer-group-id).
   *
   * Default: - none
   *
   * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-eventsourcemapping-selfmanagedkafkaeventsourceconfig.html)
   * @param kafkaConsumerGroupId The identifier for the Kafka consumer group to join. 
   */
  public fun kafkaConsumerGroupId(kafkaConsumerGroupId: String) {
    cdkBuilder.kafkaConsumerGroupId(kafkaConsumerGroupId)
  }

  /**
   * The name of the Kafka topic.
   *
   * Default: - no topic
   *
   * @param kafkaTopic The name of the Kafka topic. 
   */
  public fun kafkaTopic(kafkaTopic: String) {
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
   * function. 
   */
  public fun maxBatchingWindow(maxBatchingWindow: Duration) {
    cdkBuilder.maxBatchingWindow(maxBatchingWindow)
  }

  /**
   * The maximum concurrency setting limits the number of concurrent instances of the function that
   * an Amazon SQS event source can invoke.
   *
   * Default: - No specific limit.
   *
   * @see <a
   * href="https://docs.aws.amazon.com/lambda/latest/dg/with-sqs.html#events-sqs-max-concurrency
   * Valid Range: Minimum value of 2. Maximum value of
   * 1000.">https://docs.aws.amazon.com/lambda/latest/dg/with-sqs.html#events-sqs-max-concurrency
   * Valid Range: Minimum value of 2. Maximum value of 1000.</a>
   * @param maxConcurrency The maximum concurrency setting limits the number of concurrent instances
   * of the function that an Amazon SQS event source can invoke. 
   */
  public fun maxConcurrency(maxConcurrency: Number) {
    cdkBuilder.maxConcurrency(maxConcurrency)
  }

  /**
   * The maximum age of a record that Lambda sends to a function for processing.
   *
   * Valid Range:
   *
   * * Minimum value of 60 seconds
   * * Maximum value of 7 days
   *
   * Default: - infinite or until the record expires.
   *
   * @param maxRecordAge The maximum age of a record that Lambda sends to a function for processing.
   * 
   */
  public fun maxRecordAge(maxRecordAge: Duration) {
    cdkBuilder.maxRecordAge(maxRecordAge)
  }

  /**
   * An Amazon SQS queue or Amazon SNS topic destination for discarded records.
   *
   * Default: discarded records are ignored
   *
   * @param onFailure An Amazon SQS queue or Amazon SNS topic destination for discarded records. 
   */
  public fun onFailure(onFailure: IEventSourceDlq) {
    cdkBuilder.onFailure(onFailure)
  }

  /**
   * The number of batches to process from each shard concurrently.
   *
   * Valid Range:
   *
   * * Minimum value of 1
   * * Maximum value of 10
   *
   * Default: 1
   *
   * @param parallelizationFactor The number of batches to process from each shard concurrently. 
   */
  public fun parallelizationFactor(parallelizationFactor: Number) {
    cdkBuilder.parallelizationFactor(parallelizationFactor)
  }

  /**
   * Allow functions to return partially successful responses for a batch of records.
   *
   * Default: false
   *
   * [Documentation](https://docs.aws.amazon.com/lambda/latest/dg/with-ddb.html#services-ddb-batchfailurereporting)
   * @param reportBatchItemFailures Allow functions to return partially successful responses for a
   * batch of records. 
   */
  public fun reportBatchItemFailures(reportBatchItemFailures: Boolean) {
    cdkBuilder.reportBatchItemFailures(reportBatchItemFailures)
  }

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
   *
   * @param retryAttempts The maximum number of times to retry when the function returns an error. 
   */
  public fun retryAttempts(retryAttempts: Number) {
    cdkBuilder.retryAttempts(retryAttempts)
  }

  /**
   * Specific settings like the authentication protocol or the VPC components to secure access to
   * your event source.
   *
   * Default: - none
   *
   * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-eventsourcemapping-sourceaccessconfiguration.html)
   * @param sourceAccessConfigurations Specific settings like the authentication protocol or the VPC
   * components to secure access to your event source. 
   */
  public
      fun sourceAccessConfigurations(sourceAccessConfigurations: SourceAccessConfigurationDsl.() -> Unit) {
    _sourceAccessConfigurations.add(SourceAccessConfigurationDsl().apply(sourceAccessConfigurations).build())
  }

  /**
   * Specific settings like the authentication protocol or the VPC components to secure access to
   * your event source.
   *
   * Default: - none
   *
   * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-eventsourcemapping-sourceaccessconfiguration.html)
   * @param sourceAccessConfigurations Specific settings like the authentication protocol or the VPC
   * components to secure access to your event source. 
   */
  public
      fun sourceAccessConfigurations(sourceAccessConfigurations: Collection<SourceAccessConfiguration>) {
    _sourceAccessConfigurations.addAll(sourceAccessConfigurations)
  }

  /**
   * The position in the DynamoDB, Kinesis or MSK stream where AWS Lambda should start reading.
   *
   * Default: - no starting position
   *
   * [Documentation](https://docs.aws.amazon.com/kinesis/latest/APIReference/API_GetShardIterator.html#Kinesis-GetShardIterator-request-ShardIteratorType)
   * @param startingPosition The position in the DynamoDB, Kinesis or MSK stream where AWS Lambda
   * should start reading. 
   */
  public fun startingPosition(startingPosition: StartingPosition) {
    cdkBuilder.startingPosition(startingPosition)
  }

  /**
   * The time from which to start reading, in Unix time seconds.
   *
   * Default: - no timestamp
   *
   * @param startingPositionTimestamp The time from which to start reading, in Unix time seconds. 
   */
  public fun startingPositionTimestamp(startingPositionTimestamp: Number) {
    cdkBuilder.startingPositionTimestamp(startingPositionTimestamp)
  }

  /**
   * The target AWS Lambda function.
   *
   * @param target The target AWS Lambda function. 
   */
  public fun target(target: IFunction) {
    cdkBuilder.target(target)
  }

  /**
   * The size of the tumbling windows to group records sent to DynamoDB or Kinesis.
   *
   * Default: - None
   *
   * @see <a href="https://docs.aws.amazon.com/lambda/latest/dg/with-ddb.html#services-ddb-windows
   * Valid Range: 0 - 15
   * minutes">https://docs.aws.amazon.com/lambda/latest/dg/with-ddb.html#services-ddb-windows
   * Valid Range: 0 - 15 minutes</a>
   * @param tumblingWindow The size of the tumbling windows to group records sent to DynamoDB or
   * Kinesis. 
   */
  public fun tumblingWindow(tumblingWindow: Duration) {
    cdkBuilder.tumblingWindow(tumblingWindow)
  }

  public fun build(): EventSourceMapping {
    if(_filters.isNotEmpty()) cdkBuilder.filters(_filters)
    if(_kafkaBootstrapServers.isNotEmpty()) cdkBuilder.kafkaBootstrapServers(_kafkaBootstrapServers)
    if(_sourceAccessConfigurations.isNotEmpty())
        cdkBuilder.sourceAccessConfigurations(_sourceAccessConfigurations)
    return cdkBuilder.build()
  }
}
