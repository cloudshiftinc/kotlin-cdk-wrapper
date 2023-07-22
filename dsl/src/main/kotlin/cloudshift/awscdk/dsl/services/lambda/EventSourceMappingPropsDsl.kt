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
import software.amazon.awscdk.services.lambda.EventSourceMappingProps
import software.amazon.awscdk.services.lambda.IEventSourceDlq
import software.amazon.awscdk.services.lambda.IFunction
import software.amazon.awscdk.services.lambda.SourceAccessConfiguration
import software.amazon.awscdk.services.lambda.StartingPosition

/**
 * Properties for declaring a new event source mapping.
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
 * .tumblingWindow(Duration.minutes(30))
 * .build();
 * ```
 */
@CdkDslMarker
public class EventSourceMappingPropsDsl {
  private val cdkBuilder: EventSourceMappingProps.Builder = EventSourceMappingProps.builder()

  private val _filters: MutableList<Map<String, Any>> = mutableListOf()

  private val _kafkaBootstrapServers: MutableList<String> = mutableListOf()

  private val _sourceAccessConfigurations: MutableList<SourceAccessConfiguration> = mutableListOf()

  /**
   * @param batchSize The largest number of records that AWS Lambda will retrieve from your event
   * source at the time of invoking your function.
   * Your function receives an
   * event with all the retrieved records.
   *
   * Valid Range: Minimum value of 1. Maximum value of 10000.
   */
  public fun batchSize(batchSize: Number) {
    cdkBuilder.batchSize(batchSize)
  }

  /**
   * @param bisectBatchOnError If the function returns an error, split the batch in two and retry.
   */
  public fun bisectBatchOnError(bisectBatchOnError: Boolean) {
    cdkBuilder.bisectBatchOnError(bisectBatchOnError)
  }

  /**
   * @param enabled Set to false to disable the event source upon creation.
   */
  public fun enabled(enabled: Boolean) {
    cdkBuilder.enabled(enabled)
  }

  /**
   * @param eventSourceArn The Amazon Resource Name (ARN) of the event source.
   * Any record added to
   * this stream can invoke the Lambda function.
   */
  public fun eventSourceArn(eventSourceArn: String) {
    cdkBuilder.eventSourceArn(eventSourceArn)
  }

  /**
   * @param filters Add filter criteria to Event Source.
   */
  public fun filters(vararg filters: Map<String, Any>) {
    _filters.addAll(listOf(*filters))
  }

  /**
   * @param filters Add filter criteria to Event Source.
   */
  public fun filters(filters: Collection<Map<String, Any>>) {
    _filters.addAll(filters)
  }

  /**
   * @param kafkaBootstrapServers A list of host and port pairs that are the addresses of the Kafka
   * brokers in a self managed "bootstrap" Kafka cluster that a Kafka client connects to initially to
   * bootstrap itself.
   * They are in the format `abc.example.com:9096`.
   */
  public fun kafkaBootstrapServers(vararg kafkaBootstrapServers: String) {
    _kafkaBootstrapServers.addAll(listOf(*kafkaBootstrapServers))
  }

  /**
   * @param kafkaBootstrapServers A list of host and port pairs that are the addresses of the Kafka
   * brokers in a self managed "bootstrap" Kafka cluster that a Kafka client connects to initially to
   * bootstrap itself.
   * They are in the format `abc.example.com:9096`.
   */
  public fun kafkaBootstrapServers(kafkaBootstrapServers: Collection<String>) {
    _kafkaBootstrapServers.addAll(kafkaBootstrapServers)
  }

  /**
   * @param kafkaConsumerGroupId The identifier for the Kafka consumer group to join.
   * The consumer group ID must be unique among all your Kafka event sources. After creating a Kafka
   * event source mapping with the consumer group ID specified, you cannot update this value. The value
   * must have a lenght between 1 and 200 and full the pattern '[a-zA-Z0-9-/ *:_+=.&#64;-]*'. For more
   * information, see [Customizable consumer group
   * ID](https://docs.aws.amazon.com/lambda/latest/dg/with-msk.html#services-msk-consumer-group-id).
   */
  public fun kafkaConsumerGroupId(kafkaConsumerGroupId: String) {
    cdkBuilder.kafkaConsumerGroupId(kafkaConsumerGroupId)
  }

  /**
   * @param kafkaTopic The name of the Kafka topic.
   */
  public fun kafkaTopic(kafkaTopic: String) {
    cdkBuilder.kafkaTopic(kafkaTopic)
  }

  /**
   * @param maxBatchingWindow The maximum amount of time to gather records before invoking the
   * function.
   * Maximum of Duration.minutes(5)
   */
  public fun maxBatchingWindow(maxBatchingWindow: Duration) {
    cdkBuilder.maxBatchingWindow(maxBatchingWindow)
  }

  /**
   * @param maxConcurrency The maximum concurrency setting limits the number of concurrent instances
   * of the function that an Amazon SQS event source can invoke.
   */
  public fun maxConcurrency(maxConcurrency: Number) {
    cdkBuilder.maxConcurrency(maxConcurrency)
  }

  /**
   * @param maxRecordAge The maximum age of a record that Lambda sends to a function for processing.
   * Valid Range:
   *
   * * Minimum value of 60 seconds
   * * Maximum value of 7 days
   */
  public fun maxRecordAge(maxRecordAge: Duration) {
    cdkBuilder.maxRecordAge(maxRecordAge)
  }

  /**
   * @param onFailure An Amazon SQS queue or Amazon SNS topic destination for discarded records.
   */
  public fun onFailure(onFailure: IEventSourceDlq) {
    cdkBuilder.onFailure(onFailure)
  }

  /**
   * @param parallelizationFactor The number of batches to process from each shard concurrently.
   * Valid Range:
   *
   * * Minimum value of 1
   * * Maximum value of 10
   */
  public fun parallelizationFactor(parallelizationFactor: Number) {
    cdkBuilder.parallelizationFactor(parallelizationFactor)
  }

  /**
   * @param reportBatchItemFailures Allow functions to return partially successful responses for a
   * batch of records.
   */
  public fun reportBatchItemFailures(reportBatchItemFailures: Boolean) {
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
  public fun retryAttempts(retryAttempts: Number) {
    cdkBuilder.retryAttempts(retryAttempts)
  }

  /**
   * @param sourceAccessConfigurations Specific settings like the authentication protocol or the VPC
   * components to secure access to your event source.
   */
  public
      fun sourceAccessConfigurations(sourceAccessConfigurations: SourceAccessConfigurationDsl.() -> Unit) {
    _sourceAccessConfigurations.add(SourceAccessConfigurationDsl().apply(sourceAccessConfigurations).build())
  }

  /**
   * @param sourceAccessConfigurations Specific settings like the authentication protocol or the VPC
   * components to secure access to your event source.
   */
  public
      fun sourceAccessConfigurations(sourceAccessConfigurations: Collection<SourceAccessConfiguration>) {
    _sourceAccessConfigurations.addAll(sourceAccessConfigurations)
  }

  /**
   * @param startingPosition The position in the DynamoDB, Kinesis or MSK stream where AWS Lambda
   * should start reading.
   */
  public fun startingPosition(startingPosition: StartingPosition) {
    cdkBuilder.startingPosition(startingPosition)
  }

  /**
   * @param startingPositionTimestamp The time from which to start reading, in Unix time seconds.
   */
  public fun startingPositionTimestamp(startingPositionTimestamp: Number) {
    cdkBuilder.startingPositionTimestamp(startingPositionTimestamp)
  }

  /**
   * @param target The target AWS Lambda function. 
   */
  public fun target(target: IFunction) {
    cdkBuilder.target(target)
  }

  /**
   * @param tumblingWindow The size of the tumbling windows to group records sent to DynamoDB or
   * Kinesis.
   */
  public fun tumblingWindow(tumblingWindow: Duration) {
    cdkBuilder.tumblingWindow(tumblingWindow)
  }

  public fun build(): EventSourceMappingProps {
    if(_filters.isNotEmpty()) cdkBuilder.filters(_filters)
    if(_kafkaBootstrapServers.isNotEmpty()) cdkBuilder.kafkaBootstrapServers(_kafkaBootstrapServers)
    if(_sourceAccessConfigurations.isNotEmpty())
        cdkBuilder.sourceAccessConfigurations(_sourceAccessConfigurations)
    return cdkBuilder.build()
  }
}
