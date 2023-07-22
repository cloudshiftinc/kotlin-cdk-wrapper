@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lambda.eventsources

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.kinesis.IStream
import software.amazon.awscdk.services.lambda.IEventSourceDlq
import software.amazon.awscdk.services.lambda.StartingPosition
import software.amazon.awscdk.services.lambda.eventsources.KinesisEventSource

@CdkDslMarker
public class KinesisEventSourceDsl(
  stream: IStream,
) {
  private val cdkBuilder: KinesisEventSource.Builder = KinesisEventSource.Builder.create(stream)

  private val _filters: MutableList<Map<String, Any>> = mutableListOf()

  /**
   * The largest number of records that AWS Lambda will retrieve from your event source at the time
   * of invoking your function.
   *
   * Your function receives an
   * event with all the retrieved records.
   *
   * Valid Range:
   *
   * * Minimum value of 1
   * * Maximum value of:
   *
   * * 1000 for `DynamoEventSource`
   * * 10000 for `KinesisEventSource`, `ManagedKafkaEventSource` and `SelfManagedKafkaEventSource`
   *
   *
   * Default: 100
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
   * If the stream event source mapping should be enabled.
   *
   * Default: true
   *
   * @param enabled If the stream event source mapping should be enabled. 
   */
  public fun enabled(enabled: Boolean) {
    cdkBuilder.enabled(enabled)
  }

  /**
   * Add filter criteria option.
   *
   * Default: - None
   *
   * @param filters Add filter criteria option. 
   */
  public fun filters(vararg filters: Map<String, Any>) {
    _filters.addAll(listOf(*filters))
  }

  /**
   * Add filter criteria option.
   *
   * Default: - None
   *
   * @param filters Add filter criteria option. 
   */
  public fun filters(filters: Collection<Map<String, Any>>) {
    _filters.addAll(filters)
  }

  /**
   * The maximum amount of time to gather records before invoking the function.
   *
   * Maximum of Duration.minutes(5).
   *
   * Default: - Duration.seconds(0) for Kinesis, DynamoDB, and SQS event sources,
   * Duration.millis(500) for MSK, self-managed Kafka, and Amazon MQ.
   *
   * [Documentation](https://docs.aws.amazon.com/lambda/latest/dg/invocation-eventsourcemapping.html#invocation-eventsourcemapping-batching)
   * @param maxBatchingWindow The maximum amount of time to gather records before invoking the
   * function. 
   */
  public fun maxBatchingWindow(maxBatchingWindow: Duration) {
    cdkBuilder.maxBatchingWindow(maxBatchingWindow)
  }

  /**
   * The maximum age of a record that Lambda sends to a function for processing.
   *
   * Valid Range:
   *
   * * Minimum value of 60 seconds
   * * Maximum value of 7 days
   *
   * Default: - the retention period configured on the stream
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
   * Default: - discarded records are ignored
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
   * Maximum number of retry attempts Valid Range: * Minimum value of 0 * Maximum value of 10000.
   *
   * Default: - retry until the record expires
   *
   * @param retryAttempts Maximum number of retry attempts Valid Range: * Minimum value of 0 *
   * Maximum value of 10000. 
   */
  public fun retryAttempts(retryAttempts: Number) {
    cdkBuilder.retryAttempts(retryAttempts)
  }

  /**
   * Where to begin consuming the stream.
   *
   * @param startingPosition Where to begin consuming the stream. 
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
   * The size of the tumbling windows to group records sent to DynamoDB or Kinesis Valid Range: 0 -
   * 15 minutes.
   *
   * Default: - None
   *
   * @param tumblingWindow The size of the tumbling windows to group records sent to DynamoDB or
   * Kinesis Valid Range: 0 - 15 minutes. 
   */
  public fun tumblingWindow(tumblingWindow: Duration) {
    cdkBuilder.tumblingWindow(tumblingWindow)
  }

  public fun build(): KinesisEventSource {
    if(_filters.isNotEmpty()) cdkBuilder.filters(_filters)
    return cdkBuilder.build()
  }
}
