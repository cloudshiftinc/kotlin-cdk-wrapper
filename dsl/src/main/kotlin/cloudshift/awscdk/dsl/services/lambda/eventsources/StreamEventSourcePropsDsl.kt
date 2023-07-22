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
import software.amazon.awscdk.services.lambda.IEventSourceDlq
import software.amazon.awscdk.services.lambda.StartingPosition
import software.amazon.awscdk.services.lambda.eventsources.StreamEventSourceProps

/**
 * The set of properties for streaming event sources shared by Dynamo and Kinesis.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.*;
 * import software.amazon.awscdk.services.lambda.*;
 * import software.amazon.awscdk.services.lambda.eventsources.*;
 * IEventSourceDlq eventSourceDlq;
 * Object filters;
 * StreamEventSourceProps streamEventSourceProps = StreamEventSourceProps.builder()
 * .startingPosition(StartingPosition.TRIM_HORIZON)
 * // the properties below are optional
 * .batchSize(123)
 * .bisectBatchOnError(false)
 * .enabled(false)
 * .filters(List.of(Map.of(
 * "filtersKey", filters)))
 * .maxBatchingWindow(Duration.minutes(30))
 * .maxRecordAge(Duration.minutes(30))
 * .onFailure(eventSourceDlq)
 * .parallelizationFactor(123)
 * .reportBatchItemFailures(false)
 * .retryAttempts(123)
 * .tumblingWindow(Duration.minutes(30))
 * .build();
 * ```
 */
@CdkDslMarker
public class StreamEventSourcePropsDsl {
  private val cdkBuilder: StreamEventSourceProps.Builder = StreamEventSourceProps.builder()

  private val _filters: MutableList<Map<String, Any>> = mutableListOf()

  /**
   * @param batchSize The largest number of records that AWS Lambda will retrieve from your event
   * source at the time of invoking your function.
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
   * @param enabled If the stream event source mapping should be enabled.
   */
  public fun enabled(enabled: Boolean) {
    cdkBuilder.enabled(enabled)
  }

  /**
   * @param filters Add filter criteria option.
   */
  public fun filters(vararg filters: Map<String, Any>) {
    _filters.addAll(listOf(*filters))
  }

  /**
   * @param filters Add filter criteria option.
   */
  public fun filters(filters: Collection<Map<String, Any>>) {
    _filters.addAll(filters)
  }

  /**
   * @param maxBatchingWindow The maximum amount of time to gather records before invoking the
   * function.
   * Maximum of Duration.minutes(5).
   */
  public fun maxBatchingWindow(maxBatchingWindow: Duration) {
    cdkBuilder.maxBatchingWindow(maxBatchingWindow)
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
   * @param retryAttempts Maximum number of retry attempts Valid Range: * Minimum value of 0 *
   * Maximum value of 10000.
   */
  public fun retryAttempts(retryAttempts: Number) {
    cdkBuilder.retryAttempts(retryAttempts)
  }

  /**
   * @param startingPosition Where to begin consuming the stream. 
   */
  public fun startingPosition(startingPosition: StartingPosition) {
    cdkBuilder.startingPosition(startingPosition)
  }

  /**
   * @param tumblingWindow The size of the tumbling windows to group records sent to DynamoDB or
   * Kinesis Valid Range: 0 - 15 minutes.
   */
  public fun tumblingWindow(tumblingWindow: Duration) {
    cdkBuilder.tumblingWindow(tumblingWindow)
  }

  public fun build(): StreamEventSourceProps {
    if(_filters.isNotEmpty()) cdkBuilder.filters(_filters)
    return cdkBuilder.build()
  }
}
